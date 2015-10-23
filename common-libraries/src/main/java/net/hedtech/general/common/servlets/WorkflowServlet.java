package net.hedtech.general.common.servlets;

import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ibm.icu.text.SimpleDateFormat;

import net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices;
import morphis.core.utils.string.StringUtils;
import morphis.foundations.core.appsupportlib.Globals;
import morphis.foundations.core.appsupportlib.runtime.ILibrary;
import morphis.foundations.core.appsupportlib.runtime.ITask;
import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.TaskServices;
import morphis.foundations.core.appsupportlib.runtime.TaskState;
import morphis.foundations.core.appsupportlib.runtime.web.message.InteractionManager;
import morphis.foundations.core.types.NDate;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.types.formatting.Formatting;
import morphis.foundations.core.util.IAction;
import morphis.foundations.core.util.Ref;
import morphis.foundations.extensions.assync.IAsyncJobContainer;
import morphis.foundations.extensions.assync.JobOptions;
import morphis.foundations.extensions.session.SessionActivityMonitor;

@SuppressWarnings("serial")
public class WorkflowServlet extends HttpServlet {

	static final String WF_CHECK_JOB_ID = "WORKFLOW_CHECK";
	static final String WF_STOP_CHECK_FLAG = "WORKFLOW_STOP_CHECK";
	static final int INTERVAL = 4000;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String action = req.getPathInfo();
		if ( action.startsWith("/"))
			action = action.substring(1);
		
		String requestTaskId = req.getParameter("taskId");
		if ( StringUtils.isNullOrEmpty(requestTaskId) ) {
			sendStopResponse(resp, "Missing taskId");
			return;			
		}
		
		HttpSession session = req.getSession(false);
		
		if ( session != null ) {
			InteractionManager.initRequestState(session, req);
			
			final Task task = connectToTask(requestTaskId);
			if ( task == null )
				sendStopResponse(resp, "Task not found");
			
			if ( StringUtils.isNullOrEmpty(action) || action.equals("check") ) {
				processWorkflowCheck(req, resp, requestTaskId);
			}
			
			if ( action.equals("stop") )
				processWorkflowStop(req, resp, requestTaskId);
		}

	}
	
	private Task connectToTask(String requestTaskId) {
		UUID uuid = UUID.fromString(requestTaskId);
		
		final Task currentTask = (Task)TaskState.getStateContainer().findTask(uuid);
		if ( currentTask == null ) {
			return null;
		}
		final Task task = (Task)currentTask.getWorkspace(); //(Task)TaskServices.getWorkspaceTask();
		Task.setCurrent(task);		

		return task;
	}
	
	private void processWorkflowCheck(HttpServletRequest req, HttpServletResponse resp, String requestTaskId) {					
		runWfCheck(req, resp, requestTaskId);
	}
	
	private void processWorkflowStop(HttpServletRequest req, HttpServletResponse resp, String requestTaskId) {
		stop(req, requestTaskId);
	}
	
	private void runWfCheck(HttpServletRequest req, final HttpServletResponse resp, String requestTaskId) {
		
		final Task task = connectToTask(requestTaskId);
		if ( task == null )
			sendStopResponse(resp, "Task not found");

		String taskId = task.getUuid().toString();
		
		SessionActivityMonitor monitor = checkSessionMonitor(task, req);
		long timeleft = monitor != null ? monitor.getTimeLeft() : 0;
			
		clearStop(req);
		
		System.out.println(String.format("[%s]WORKFLOW(%s): Start polling... (%s)", getTime(), taskId, timeleft));
		
		int count = 0;
		while(true) {
			count++;
			
			//Check if session is still valid
			if ( !isSessionValid(req) ) {
				sendStopResponse(resp);
				System.out.println(String.format("[%s]WORKFLOW(%s): Session timeout.", getTime(), taskId));
				break;
			}
			
			//check for stop
			if ( checkStop(req) ) {
				System.out.println(String.format("[%s]WORKFLOW(%s): Stopping polling.", getTime(), taskId) );
				sendStopResponse(resp);
				stopActivity(monitor);
				break;
			}
				
			//check for activity
			try {
					WorkItem wi = checkWfData(task);
					boolean done = wi != null;
					
					if ( done || count > 5 ) {
						sendResponse(resp, done);
						if ( done )
							stopActivity(monitor);
						break;
					}
				} 
				catch (IllegalArgumentException e1) {
					sendStopResponse(resp);
					stopActivity(monitor);
					break;
				}
			
			//Pause the response
			try {
				Thread.sleep(INTERVAL);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(String.format("[%s]WORKFLOW(%s): End polling.", getTime(), taskId) );
	}

	
	private void stop(HttpServletRequest req, String requestTaskId) {
		HttpSession s = req.getSession(false);
		if (s == null)
			return;
		
		//requires a Task to be current
		Globals.setGlobal(WF_STOP_CHECK_FLAG, "TRUE");
	}
	
	private boolean checkStop(HttpServletRequest req) {
		HttpSession s = req.getSession(false);
		if (s == null)
			return true;
					
		Object val = Globals.getObject(WF_STOP_CHECK_FLAG);
		clearStop(req);
		return val != null;
	}
	
	private void clearStop(HttpServletRequest req) {
		HttpSession s = req.getSession(false);
		if (s == null)
			return;
		
		//requires a Task to be current
		Globals.removeGlobal(WF_STOP_CHECK_FLAG);
	}
	
	
	private void stopActivity(SessionActivityMonitor monitor) {
		if ( monitor != null )
			monitor.remove();
	}
	
	private SessionActivityMonitor checkSessionMonitor(Task task, HttpServletRequest req) {
		HttpSession s = req.getSession(false);
		if ( s != null ) {
			SessionActivityMonitor monitor = SessionActivityMonitor.get(s);
			if ( monitor == null ) {
				int toSeconds = s.getMaxInactiveInterval();
				//default when session never expires (eg development settings) 
				if ( toSeconds < 0 )
					toSeconds = 10 * 60;
					
				long maxInactivityPeriod = toSeconds * 1000;
				monitor = SessionActivityMonitor.create(s, maxInactivityPeriod);
			}
			
			if ( monitor != null )
				monitor.checkValid();
			return monitor;
		}
		return null;
	}

	private void sendResponse(HttpServletResponse resp, boolean found) {
		String responseText = String.format("{ \"response\": %s, \"stop\":false }", String.valueOf(found).toLowerCase());	
		sendJsonResponse(resp, responseText);
	}
	
	private void sendStopResponse(HttpServletResponse resp) {
		String responseText = String.format("{ \"response\": false, \"stop\":true }");	
		sendJsonResponse(resp, responseText);
	}
	
	private void sendStopResponse(HttpServletResponse resp, String message) {
		String responseText = String.format("{ \"response\": false, \"stop\":true, \"message\":\"%s\" }", message);	
		sendJsonResponse(resp, responseText);
	}
	
	private void sendJsonResponse(HttpServletResponse resp, String text) {
		try {
			resp.getWriter().write(text);
			resp.setContentType("application/json");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	private void runWfCheckJob(final HttpServletResponse resp) {
		final ITask task = TaskServices.getWorkspaceTask();
		
		String jobId = WF_CHECK_JOB_ID;
		
		if ( task instanceof IAsyncJobContainer ) {
			IAsyncJobContainer jobLauncher = (IAsyncJobContainer)task;
			
			if ( !jobLauncher.existsJob(jobId) ) {
				
				IAction action = new IAction() {					
					@Override
					public void execute() {
						if ( createWfCheckResponse(task, resp) )
							deleteWfCheckJob(task);						
					}
				};
				
				JobOptions options = new JobOptions();
				options.endTask = false;
				options.interval = 3;
				options.startNow = true;
				options.duration = 30;
				options.removeOnSessionExpire = true;

				jobLauncher.scheduleAsyncJob(jobId, action, options);
			}
		}
	}

	private void deleteWfCheckJob(ITask task) {
		IAsyncJobContainer jobLauncher = (IAsyncJobContainer)task;
		jobLauncher.unscheduleAsyncJob(WF_CHECK_JOB_ID);
	}
	
	protected boolean createWfCheckResponse(ITask task, HttpServletResponse resp) {

		WorkItem wi = checkWfData(task);
		boolean hasWork = wi != null;
			
		try {
			String responseText = null;

			if ( hasWork ) {
				responseText = "{ response: true }";	
				resp.getWriter().write(responseText);
				resp.setContentType("application/json");
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return hasWork;


	}
	
	private WorkItem checkWfData(ITask task) throws IllegalArgumentException {
		ILibrary wfLib = task.getSupportCodeManager().getLibrary("GOQWFLW");
		if ( wfLib != null && wfLib instanceof GoqwflwServices ) {
			
			String taskId = task.getUuid().toString();
			
			GoqwflwServices goqwflw = (GoqwflwServices)wfLib;
			
			NString clientId = goqwflw.getGWfBa().getClientId();
			System.out.println(String.format("[%s]WORKFLOW(%s): Checking work for %s", getTime(), taskId, clientId.getValue()));

			if ( clientId.isNull() || clientId.equals("undefined") )
				throw new IllegalArgumentException("Invalid session clientId");
			
			Ref<NString> taskName = new Ref<NString>(NString.EmptyString);
			boolean hasWork = goqwflw.getGWfBa().checkWork(taskName);
			if ( hasWork ) {
				String newTask = taskName.val.getValue();
				WorkItem wi = new WorkItem(newTask);
				System.out.println(String.format("[%s]WORKFLOW(%s): Work to process for %s = %s", getTime(), taskId, clientId.getValue(), newTask) );
				return wi;
			}
		}
		return null;
	}

	private boolean isSessionValid(HttpServletRequest req) {
		
		try {
			HttpSession session = req.getSession(false);
			if ( session == null )
				return false;
		} 
		catch (Exception e) {
			return false;
		}
		return true;
	}
	
	private String getTime() {
		Date d = new Date();
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(d);
	}
	
	static class WorkItem {
		public String taskName;
		
		public WorkItem(String taskName) {
			this.taskName = taskName;
		}
	}
	
}
