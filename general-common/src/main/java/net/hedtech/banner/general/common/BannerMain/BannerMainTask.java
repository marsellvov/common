package net.hedtech.banner.general.common.BannerMain;


import java.util.Hashtable;

import morphis.foundations.core.appsupportlib.runtime.Task;
import morphis.foundations.core.appsupportlib.runtime.web.message.IInteractionState;
import morphis.foundations.core.appsupportlib.runtime.web.message.InteractionManager;
import morphis.foundations.core.appsupportlib.runtime.web.message.OnInteractionStateInvalidationListener;
import morphis.foundations.core.appsupportlib.runtime.web.message.SessionInteractionState;
import morphis.foundations.core.util.IAction;
import morphis.foundations.extensions.assync.AsyncTaskManager;
import morphis.foundations.extensions.assync.IAsyncJobContainer;
import morphis.foundations.extensions.assync.JobOptions;
import morphis.workspace.forms.main.MainTask;

	
/// <summary>
/// Banner Global Initialization
/// </summary>
public class BannerMainTask extends MainTask implements IAsyncJobContainer
{
	AsyncTaskManager assyncManager;

	public BannerMainTask (String taskName) {
		super(taskName);
	}
	
	@Override
	public String getName() {
		return "GUAINIT";
	}

	public BannerMainTask (String taskName, Hashtable sharedLibraries, Hashtable parameters) {
		super(taskName, sharedLibraries, parameters);
	}

	@Override
	public net.hedtech.banner.general.common.BannerMain.model.BannerMainModel getModel() {
		return (net.hedtech.banner.general.common.BannerMain.model.BannerMainModel)super.getModel();
	}

	public net.hedtech.banner.general.common.BannerMain.services.BannerMainServices getServices() {
		return (net.hedtech.banner.general.common.BannerMain.services.BannerMainServices)getSupportCodeManager().getServices();
	}
	
	
	// Package Acessors
		

	public net.hedtech.banner.general.common.BannerMain.services.BanPreferences getBanPreferences() 
	{
		return (net.hedtech.banner.general.common.BannerMain.services.BanPreferences)getSupportCodeManager().getPackage("BAN_PREFERENCES");
	}

	public net.hedtech.banner.general.common.BannerMain.services.CaptureTimings getCaptureTimings() 
	{
		return (net.hedtech.banner.general.common.BannerMain.services.CaptureTimings)getSupportCodeManager().getPackage("CAPTURE_TIMINGS");
	}

	public net.hedtech.banner.general.common.BannerMain.services.PkgTimestampFormat getPkgTimestampFormat() 
	{
		return (net.hedtech.banner.general.common.BannerMain.services.PkgTimestampFormat)getSupportCodeManager().getPackage("PKG_TIMESTAMP_FORMAT");
	}
	
		// Attached Libraries
    public net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices getGoqrpls()
    {
		return (net.hedtech.general.common.libraries.Goqrpls.GoqrplsServices)getSupportCodeManager().getLibrary("GOQRPLS");
    }
    public net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices getEoqrpls()
    {
		return (net.hedtech.general.common.libraries.Eoqrpls.EoqrplsServices)getSupportCodeManager().getLibrary("EOQRPLS");
    }
    public net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices getGoqwflw()
    {
		return (net.hedtech.general.common.libraries.Goqwflw.GoqwflwServices)getSupportCodeManager().getLibrary("GOQWFLW");
    }

    
	@Override
	public void scheduleAsyncJob(final String id, IAction action, JobOptions options) {
		if ( assyncManager == null )
			assyncManager = new AsyncTaskManager(this);
		

		if ( !assyncManager.existsJob(id) ) {
			assyncManager.addJob(id, action, options, false);
		}
		
		SessionInteractionState state = (SessionInteractionState)InteractionManager.getInteractionState();
		state.getOnInteractionStateInvalidation().add( new OnInteractionStateInvalidationListener() {
			
			@Override
			public void onInteractionStateInvalidation(IInteractionState interactionState) {
				unscheduleAsyncJob(id);
				if ( assyncManager != null )
					assyncManager.clearJobs();
			}
		});
	}
	
	@Override
	public void unscheduleAsyncJob(String id) {
		if ( assyncManager != null )
			assyncManager.removeJob(id);		
	}
	
	@Override
	public boolean existsJob(String id) {
		if ( assyncManager != null )
			return assyncManager.existsJob(id);
		return false;
	}

}
