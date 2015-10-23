package net.hedtech.general.common.libraries.Goqwflw;

import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.Exceptions.Vpdicodenotmatch;

public class GWfBa extends AbstractSupportCodeObject {
	

	public GWfBa(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqwflwServices getContainer() {
		return (GoqwflwServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_WF_BA
	/*
	PACKAGE G$_WF_BA IS
<multilinecomment>--------------------------------------------------------------*\
  The package G$_WF_BA provides a PL/SQL interface to communicate
  with the Banner Adapter to Workflow.
\*--------------------------------------------------------------</multilinecomment>

--*
--* Declare public subprogram specifications
--*

<multilinecomment>--------------------------------------------------------------*\ 
  The procedure DECLARE_WORK_COMPLETE notifies Workflow
  that the user has completed the work item associated with a
  given workflow activity ID.
\*--------------------------------------------------------------</multilinecomment>

   PROCEDURE declare_work_complete(work_id IN VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\ 
  The function GET_ACTIVITY_NAME returns the name of the
  activity associated with a work item given its associated
  task ID.
\*--------------------------------------------------------------</multilinecomment>

   FUNCTION get_activity_name(work_id IN VARCHAR2) RETURN VARCHAR2;


<multilinecomment>--------------------------------------------------------------*\ 
  The function GET_WORK_PARAMETERS returns the names and values of
  all input action parameters that have a value for a work item
  given a workflow activity ID.  The names and values are
  returned as a delimited string of the following format:
  <name_1>="<value_1>",<name_2>="<value_2>",...<name_n>="<value_n>"

  For example: KEY_BLOCK.PIDM="12345",KEY_BLOCK.CRS="English Lit"
\*--------------------------------------------------------------</multilinecomment>

	PROCEDURE get_work_parameters(work_id          IN VARCHAR2,
	                              parameterNames  OUT VARCHAR2,
	                              parameterValues OUT VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\ 
  The function IS_WORKFLOW_TASK returns a non-zero value if the
  task specified by a given task ID is part of a workflow (i.e.,
  the task is in fact a workflow activity).
\*--------------------------------------------------------------</multilinecomment>

   FUNCTION  is_workflow_task(work_id	VARCHAR2) RETURN PLS_INTEGER;

<multilinecomment>--------------------------------------------------------------*\ 
  The procedure SET_WORK_PARAMETERS updates the action parameter
  values for a work item in Workflow given the work item's
  associated workflow activity ID and a delimited string of
  action parameter names and values in the format:
  <name_1>="<value_1>",<name_2>="<value_2>",...<name_n>="<value_n>"
\*--------------------------------------------------------------</multilinecomment>

   PROCEDURE set_work_parameters(work_id IN VARCHAR2,
                               	 name_value_string IN VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\ 
  The function GET_WORK_ID returns the workflow activity ID for
  a workflow task given its task ID.
\*--------------------------------------------------------------</multilinecomment>

   FUNCTION  get_work_id RETURN VARCHAR2;

<multilinecomment>--------------------------------------------------------------*\ 
  The procedure RELEASE_TASK notifies Workflow that the
  Banner application is finished with a given workflow task ID.

  If the given workflow task ID is -1, the procedure additionally
  notifies Workflow that the Banner session with which
  it was communicating is no longer available.
\*--------------------------------------------------------------</multilinecomment>

   PROCEDURE release_task(work_id IN VARCHAR2);

<multilinecomment>--------------------------------------------------------------*\ 
  The function get_work returns the work id and the task name
     as OUT parameters for the procedure.
     
     It assumes that on the pipe is a work id and task name in the 
     format <task id> <task name>  Ex '123 SPAPERS'.
     
     work_id will be one of the following:     
     a)  NULL if no workflow task or activity is available to perform,
     b)  a positive integer that represents the current workflow
         task ID if a workflow task or activity is available, or
     c)  'wf_logged_of' if the Workflow application has been exited or
         logged off. (NOT IMPLEMENTED)
\*--------------------------------------------------------------</multilinecomment>
   PROCEDURE get_work(work_id OUT VARCHAR2, task_name OUT VARCHAR2, activity_name OUT VARCHAR2);
   
<multilinecomment>--------------------------------------------------------------*\ 
  The procedure GET_USER_INFO returns:
  
  a) A user name and password retrieved through the SSO Pipe.
  b) Empty strings for either user or password if not found.
    
  The Workflow password should be identical to the Banner
  password and thus should enable automatic logon to a Banner
  session.
\*--------------------------------------------------------------</multilinecomment>
   PROCEDURE get_user_info (USERNAME OUT VARCHAR2, PWD OUT VARCHAR2);
  
END G$_WF_BA;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_WF_BA
		/*
		PACKAGE BODY G$_WF_BA IS
--
-- Declare private variables
--
   vcCurrProgUnit             CONSTANT  VARCHAR2(30)           := 'G$_WF_BA';
   
--
-- Declare private sub routines
--
	FUNCTION GET_CLIENT_ID RETURN VARCHAR2;
	
	FUNCTION GET_WORKFLOW_URL RETURN VARCHAR2;
   
	FUNCTION GET_PROXY_URL RETURN VARCHAR2;

--
-- Define public subprogram bodies
--
	PROCEDURE declare_work_complete( work_id IN VARCHAR2 ) IS
		vcCurrSubprog  CONSTANT		VARCHAR2(30)	:= 'DECLARE_WORK_COMPLETE';
	  sqlStatement              VARCHAR2(255);		

	BEGIN
		G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

		--Clear the Activity name so it doesn't show up on this form after completion
    COPY('' , 'GLOBAL.WF_WORK_ACTIVITY_NAME');
		
    <multilinecomment> Create SQL statement and parse </multilinecomment>
    
    sqlStatement := 'BEGIN WFIKWIBC.declare_work_complete(' || '''' || GET_WORKFLOW_URL()
                    || '''' || ', ' || '''' || GET_PROXY_URL() || '''' || ', ' 
                    || '''' || work_id || '''' || '); END;';

    <multilinecomment> execute sql statement </multilinecomment>
    GOKDBMS.DYNAMIC_SQL(sqlStatement);
    
	EXCEPTION
    WHEN OTHERS THEN
       G$_WF_ERROR.SHOW_EXCEPTION(G$_NLS.Get('GOQWFLW-0000','LIB','Could not Communicate with Workflow through HTTP during DECLARE_WORK_COMPLETE request.'),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

	END declare_work_complete;
--
--
  FUNCTION get_activity_name( work_id IN VARCHAR2 ) RETURN VARCHAR2 IS
		vcCurrSubprog  CONSTANT		VARCHAR2(30)	:= 'GET_ACTIVITY_NAME';

	BEGIN
		G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
   
    RETURN  NAME_IN('GLOBAL.WF_WORK_ACTIVITY_NAME'); 
   
    EXCEPTION
      WHEN OTHERS THEN
        G$_WF_ERROR.SHOW_EXCEPTION(G$_NLS.Get('GOQWFLW-0001','LIB','Could not Communicate with Workflow through HTTP during GET_ACTIVITY_NAME request.'),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

    RETURN NULL;
  END get_activity_name;
--
--
	PROCEDURE get_work_parameters(work_id IN VARCHAR2, parameterNames OUT VARCHAR2, parameterValues OUT VARCHAR2 ) IS
		vcCurrSubprog  CONSTANT		VARCHAR2(30)	:= 'GET_WORK_PARAMETERS';
	  sqlStatement              VARCHAR2(2000);	
	  		
	BEGIN
		G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
		
    <multilinecomment> Create SQL statement and parse </multilinecomment>
    sqlStatement := 'BEGIN WFIKWIBC.get_work_parameters(' || '''' || GET_WORKFLOW_URL()
                    || '''' || ', ' || '''' || GET_PROXY_URL() || '''' || ', ' || '''' 
                    || GET_CLIENT_ID() || '''' || ', ' || '''' || work_id || '''' 
                    || ', :parameterNames, :parameterValues' || '); END;';

    <multilinecomment> execute sql statement </multilinecomment>
    GOKDBMS.DYNAMIC_SQL_BIND(sqlStatement, parameterNames, parameterValues);
    
   EXCEPTION
     WHEN OTHERS THEN
       G$_WF_ERROR.SHOW_EXCEPTION(G$_NLS.Get('GOQWFLW-0002','LIB','Could not Communicate with Workflow through HTTP during GET_WORK_PARAMETERS request.'),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

  END get_work_parameters;
--
--
  FUNCTION  is_workflow_task(work_id	VARCHAR2) RETURN PLS_INTEGER IS
  BEGIN
  	RETURN 0;
  END;
--
--
	PROCEDURE get_work(work_id OUT VARCHAR2, task_name OUT VARCHAR2, activity_name OUT VARCHAR2) IS
    vcCurrSubprog  CONSTANT		VARCHAR2(30)	:= 'get_work';
    sqlStatement              VARCHAR2(255);	
    vpdi_code                 VARCHAR2(6);
    vpdiCodeNotMatch          EXCEPTION;
	  
	BEGIN
		G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
		
		IF NAME_IN( 'GLOBAL.WF_VPDI_HOME_CODE' ) IS NOT NULL THEN
			
		  <multilinecomment> Create SQL statement and parse </multilinecomment>
      sqlStatement := 'BEGIN WFIKWIBC.get_workitem_queue( ' || '''' || GET_CLIENT_ID() 
                    || '''' || ', :vpdi_code, :work_id, :task_name, :activity_name ); END;';

      <multilinecomment> execute sql statement </multilinecomment>
      GOKDBMS.DYNAMIC_SQL_BIND(sqlStatement, vpdi_code, work_id, task_name, activity_name);
      
      IF vpdi_code != NAME_IN( 'GLOBAL.WF_VPDI_HOME_CODE' ) THEN
      	 RAISE vpdiCodeNotMatch;
      END IF;
      
    ELSE

       <multilinecomment> Create SQL statement and parse </multilinecomment>
       sqlStatement := 'BEGIN WFIKWIBC.get_workitem_queue( ' || '''' || GET_CLIENT_ID() 
                    || '''' || ', :work_id, :task_name, :activity_name ); END;';

       <multilinecomment> execute sql statement </multilinecomment>
       GOKDBMS.DYNAMIC_SQL_BIND(sqlStatement, work_id, task_name, activity_name);
       
    END IF;
    
	EXCEPTION
		 WHEN vpdiCodeNotMatch THEN
		   G$_WF_ERROR.SHOW_EXCEPTION(G$_NLS.Get('GOQWFLW-0003','LIB','VPDI code does match the initial value in GET_WORK request. ') ,vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);
     WHEN OTHERS THEN
       G$_WF_ERROR.SHOW_EXCEPTION(G$_NLS.Get('GOQWFLW-0004','LIB','Could not GET_WORK request. %01%', NVL(ERROR_TEXT,SQLERRM)) ,vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);
		    
	END get_work;
--
--
	PROCEDURE set_work_parameters(work_id IN VARCHAR2, name_value_string IN VARCHAR2) IS
		vcCurrSubprog  CONSTANT		VARCHAR2(30)	 := 'SET_WORK_PARAMETERS';
	  sqlStatement              VARCHAR2(2000);	
	  
	BEGIN
		G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);
		
    <multilinecomment> Create SQL statement and parse </multilinecomment>
    sqlStatement := 'BEGIN WFIKWIBC.set_work_parameters ( ' || '''' || GET_WORKFLOW_URL() 
                    || '''' || ', ' || '''' || GET_PROXY_URL() || '''' ||  ', ' || '''' 
                    || GET_CLIENT_ID() || '''' || ', ' || '''' || work_id
                    || '''' || ', ' || '''' || name_value_string || '''' || '); END;';

    <multilinecomment> execute sql statement </multilinecomment>
    GOKDBMS.DYNAMIC_SQL(sqlStatement);
    
	EXCEPTION
  	WHEN OTHERS THEN
       G$_WF_ERROR.SHOW_EXCEPTION(G$_NLS.Get('GOQWFLW-0005','LIB','Could not Communicate with Workflow through HTTP during SET_WORK_PARAMETERS request.'),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

	END set_work_parameters;
--
--
	FUNCTION  get_work_id RETURN VARCHAR2 IS
		vcCurrSubprog  CONSTANT		VARCHAR2(30)	:= 'GET_WORK_ID';

	BEGIN
		G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

	  RETURN NAME_IN('GLOBAL.WF_WORK_ID');

  EXCEPTION
     WHEN OTHERS THEN
       G$_WF_ERROR.SHOW_EXCEPTION(NVL(ERROR_TEXT,SQLERRM),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);
       RETURN NULL; 
  END get_work_id;
--
--
	PROCEDURE release_task(work_id IN VARCHAR2) IS
    vcCurrSubprog CONSTANT VARCHAR2(30)	:= 'RELEASE_TASK';
    sqlStatement           VARCHAR2(255);	
	  		
  BEGIN
		G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);

		--Clear the Activity name so it doesn't show up on this form after release
    COPY('' , 'GLOBAL.WF_WORK_ACTIVITY_NAME');

    <multilinecomment> Create SQL statement and parse </multilinecomment>
    sqlStatement := 'BEGIN WFIKWIBC.release_work( ' || '''' || GET_WORKFLOW_URL() || ''''
                    || ', ' || '''' || GET_PROXY_URL() || '''' || ', ' 
                    || '''' || work_id || '''' || ' ); END;';

    <multilinecomment> execute sql statement </multilinecomment>
    GOKDBMS.DYNAMIC_SQL(sqlStatement);
    
  EXCEPTION
     WHEN OTHERS THEN
       G$_WF_ERROR.SHOW_EXCEPTION(G$_NLS.Get('GOQWFLW-0006','LIB','Could not Communicate with Workflow through HTTP during RELEASE_TASK request.'),vcCurrProgUnit,vcCurrSubprog,FALSE,FALSE);

  END release_task;
--
--
	PROCEDURE GET_USER_INFO( USERNAME OUT VARCHAR2, PWD OUT VARCHAR2 ) IS
	 vcCurrSubprog  CONSTANT		VARCHAR2(30)	  := 'GET_USER_INFO';	
	 vcUserAndPwd               VARCHAR2(255);
	 ENCRYPTION_KEY             VARCHAR2(255);
	 EXPIRATION                 NUMBER(38,0);
	 sqlStatement               VARCHAR2(255);
	 
	BEGIN
		G$_WF_LOGGING.DEBUG_MSG(vcCurrProgUnit || '.' || vcCurrSubprog);					

    ENCRYPTION_KEY := to_char(GOKDBMS.RANDOM_NUMBER);

    <multilinecomment> Create SQL statement and parse </multilinecomment>
    sqlStatement := 'BEGIN WFCKGSSO.GET_SSO( ' || '''' || GET_CLIENT_ID() || ''''
                    || ', ' || '''' || ENCRYPTION_KEY || ''''
                    || ', ' || ':USERNAME, :PWD, :EXPIRATION' || '); END;';

    <multilinecomment> execute sql statement </multilinecomment>
    GOKDBMS.DYNAMIC_SQL_BIND(sqlStatement, USERNAME, PWD, EXPIRATION);

	END GET_USER_INFO;	
--
-- Define private subprogram bodies
--
  FUNCTION GET_CLIENT_ID RETURN VARCHAR2 IS 
  BEGIN
	  RETURN NAME_IN('GLOBAL.WF_CLIENT_ID');	
  END GET_CLIENT_ID;
--
--
  FUNCTION GET_WORKFLOW_URL RETURN VARCHAR2 IS 
  BEGIN
	  RETURN NAME_IN('GLOBAL.WF_WORKFLOW_URL');	
  END GET_WORKFLOW_URL;
--
--
  FUNCTION GET_PROXY_URL RETURN VARCHAR2 IS
  BEGIN
    RETURN NAME_IN('GLOBAL.WF_PROXY_URL');	
  END GET_PROXY_URL;
--
END G$_WF_BA;
		*/
				// 
		//  Declare private variables
		// 
		public final NString VCCURRPROGUNIT = toStr("G$_WF_BA");
/* <p>
		* 
		*  Define public subprogram bodies
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param workId
		*/
		public void declareWorkComplete(NString workId)
		{

			final NString VCCURRSUBPROG = toStr("DECLARE_WORK_COMPLETE");
			NString sqlstatement= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
				// Clear the Activity name so it doesn't show up on this form after completion
				copy("","GLOBAL.WF_WORK_ACTIVITY_NAME");
				//  Create SQL statement and parse 
				sqlstatement = toStr("BEGIN WFIKWIBC.declare_work_complete(")
						.append("'").append(getWorkflowUrl()).append("'").append(", ")
						.append("'").append(getProxyUrl()).append("'").append(", ")
						.append("'").append(workId).append("'")
						.append("); END;");
				//  execute sql statement 
				Gokdbms.dynamicSql(sqlstatement);
			}
			catch(Exception  e)
			{
				this.getLogger().trace(this, "DEBUG >>" + e.getMessage());
				
				getContainer().getGWfError().showException(GNls.Fget(toStr("GOQWFLW-0000"), toStr("LIB"), toStr("Could not Communicate with Workflow through HTTP during DECLARE_WORK_COMPLETE request.")), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
			}
			
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param workId
		*/
		public NString getActivityName(NString workId)
		{
		
			final NString VCCURRSUBPROG = toStr("GET_ACTIVITY_NAME");
			try
			{
				getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
				return getNameIn("GLOBAL.WF_WORK_ACTIVITY_NAME");
			}
			catch(Exception  e)
			{
				getContainer().getGWfError().showException(GNls.Fget(toStr("GOQWFLW-0001"), toStr("LIB"), toStr("Could not Communicate with Workflow through HTTP during GET_ACTIVITY_NAME request.")), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
			return NString.getNull();
		}

		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param workId
		* @param parameternames
		* @param parametervalues
		*/
		public void getWorkParameters(NString workId, Ref<NString> parameternames, Ref<NString> parametervalues)
		{

			final NString VCCURRSUBPROG = toStr("GET_WORK_PARAMETERS");
			NString sqlstatement= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
				//  Create SQL statement and parse 
				sqlstatement = toStr("BEGIN WFIKWIBC.get_work_parameters(").append("'").append(getWorkflowUrl()).append("'").append(", ").append("'").append(getProxyUrl()).append("'").append(", ").append("'").append(getClientId()).append("'").append(", ").append("'").append(workId).append("'").append(", :parameterNames, :parameterValues").append("); END;");
				//  execute sql statement 
				Gokdbms.dynamicSqlBind(sqlstatement, parameternames, parametervalues);
			}
			catch(Exception  e)
			{
				getContainer().getGWfError().showException(GNls.Fget(toStr("GOQWFLW-0002"), toStr("LIB"), toStr("Could not Communicate with Workflow through HTTP during GET_WORK_PARAMETERS request.")), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
			}	

			
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param workId
		*/
		public NInteger isWorkflowTask(NString workId)
		{
			return  toInt(0);
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param workId
		* @param taskName
		* @param activityName
		*/
		public void getWork(Ref<NString> workId, Ref<NString> taskName, Ref<NString> activityName)
		{

			final NString VCCURRSUBPROG = toStr("get_work");
			NString sqlstatement= NString.getNull();
			NString vpdiCode= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
				if ( !getNameIn("GLOBAL.WF_VPDI_HOME_CODE").isNull() )
				{
					//  Create SQL statement and parse 
					sqlstatement = toStr("BEGIN WFIKWIBC.get_workitem_queue( ").append("'").append(getClientId()).append("'").append(", :vpdi_code, :work_id, :task_name, :activity_name ); END;");
					//  execute sql statement 
					Ref<NString> p_return_value1_ref = new Ref<NString>(vpdiCode);
					Gokdbms.dynamicSqlBind(sqlstatement, p_return_value1_ref, workId, taskName, activityName);
					vpdiCode = p_return_value1_ref.val;
					if ( vpdiCode.notEquals(getNameIn("GLOBAL.WF_VPDI_HOME_CODE")) )
					{
						throw new Vpdicodenotmatch();
					}
				}
				else {
					//  Create SQL statement and parse 
					sqlstatement = toStr("BEGIN WFIKWIBC.get_workitem_queue( ").append("'").append(getClientId()).append("'").append(", :work_id, :task_name, :activity_name ); END;");
					//  execute sql statement 
					Gokdbms.dynamicSqlBind(sqlstatement, workId, taskName, activityName);
				}
			}
			catch(Vpdicodenotmatch e)
			{
				getContainer().getGWfError().showException(GNls.Fget(toStr("GOQWFLW-0003"), toStr("LIB"), toStr("VPDI code does match the initial value in GET_WORK request. ")), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
			}
			catch(Exception  e)
			{
				getContainer().getGWfError().showException(GNls.Fget(toStr("GOQWFLW-0004"), toStr("LIB"), toStr("Could not GET_WORK request. %01%"), errorMessage()), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));				
			}
			
		}
		
		public boolean checkWork(Ref<NString> taskName)
		{
			NString sqlstatement= NString.getNull();
			
			Ref<NString> workId = new Ref<NString>(NString.getNull());
			Ref<NString> activityName = new Ref<NString>();

			//  Create SQL statement and parse 
			sqlstatement = toStr("BEGIN WFIKWIBC.check_workitem_queue( ").append("'").append(getClientId()).append("'").append(", :work_id, :task_name ); END;");
			//  execute sql statement 
			Gokdbms.dynamicSqlBind(sqlstatement, workId, taskName);
				
			//Check is true if the is a valid workID
			return workId.getValue().isNotNull();			
		}
		
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param workId
		* @param nameValueString
		*/
		public void setWorkParameters(NString workId, NString nameValueString)
		{

			final NString VCCURRSUBPROG = toStr("SET_WORK_PARAMETERS");
			NString sqlstatement= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
				//  Create SQL statement and parse 
				sqlstatement = toStr("BEGIN WFIKWIBC.set_work_parameters ( ").append("'").append(getWorkflowUrl()).append("'").append(", ").append("'").append(getProxyUrl()).append("'").append(", ").append("'").append(getClientId()).append("'").append(", ").append("'").append(workId).append("'").append(", ").append("'").append(nameValueString).append("'").append("); END;");
				//  execute sql statement 
				Gokdbms.dynamicSql(sqlstatement);
			}
			catch(Exception  e)
			{
				getContainer().getGWfError().showException(GNls.Fget(toStr("GOQWFLW-0005"), toStr("LIB"), toStr("Could not Communicate with Workflow through HTTP during SET_WORK_PARAMETERS request.")), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
			}
			
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getWorkId()
		{
			final NString VCCURRSUBPROG = toStr("GET_WORK_ID");
			try
			{
				getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
				return getNameIn("GLOBAL.WF_WORK_ID");
			}
			catch(Exception  e)
			{
				getContainer().getGWfError().showException(errorMessage(), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
				
				return NString.getNull();
			}
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param workId
		*/
		public void releaseTask(NString workId)
		{
			final NString VCCURRSUBPROG = toStr("RELEASE_TASK");
			NString sqlstatement= NString.getNull();
			try
			{
				getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
				// Clear the Activity name so it doesn't show up on this form after release
				copy("","GLOBAL.WF_WORK_ACTIVITY_NAME");
				//  Create SQL statement and parse 
				sqlstatement = toStr("BEGIN WFIKWIBC.release_work( ").append("'").append(getWorkflowUrl()).append("'").append(", ").append("'").append(getProxyUrl()).append("'").append(", ").append("'").append(workId).append("'").append(" ); END;");
				//  execute sql statement 
				Gokdbms.dynamicSql(sqlstatement);
			}
			catch(Exception  e)
			{
				getContainer().getGWfError().showException(GNls.Fget(toStr("GOQWFLW-0006"), toStr("LIB"), toStr("Could not Communicate with Workflow through HTTP during RELEASE_TASK request.")), VCCURRPROGUNIT, VCCURRSUBPROG, toBool(NBool.False), toBool(NBool.False));
			}

			
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param username
		* @param pwd
		*/
		public void getUserInfo(Ref<NString> username, Ref<NString> pwd)
		{

			final NString VCCURRSUBPROG = toStr("GET_USER_INFO");
			NString vcuserandpwd= NString.getNull();
			NString encryptionKey= NString.getNull();
			NNumber expiration= NNumber.getNull();
			NString sqlstatement= NString.getNull();
			getContainer().getGWfLogging().debugMsg(VCCURRPROGUNIT.append(".").append(VCCURRSUBPROG));
			encryptionKey = toChar(Gokdbms.FrandomNumber());
			//  Create SQL statement and parse 
			sqlstatement = toStr("BEGIN WFCKGSSO.GET_SSO( ").append("'").append(getClientId()).append("'").append(", ").append("'").append(encryptionKey).append("'").append(", ").append(":USERNAME, :PWD, :EXPIRATION").append("); END;");
			//  execute sql statement 
			Ref<NString> p_return_value3_ref = new Ref<NString>();
			Gokdbms.dynamicSqlBind(sqlstatement, username, pwd, p_return_value3_ref);
			expiration = toNumber(p_return_value3_ref.val);

			
		}
		
		//MORPHIS
		public void updateClientId()
		{
			
			NString sqlstatement= NString.getNull();
			//  Create SQL statement and parse 
			sqlstatement = toStr("BEGIN WFIKWIBC.UPDATE_CLIENT_ID( " + "'" + getClientId() + "'" + "); END;");
			//  execute sql statement 
			Gokdbms.dynamicSql(sqlstatement);
		}
		
		//MORPHIS
		public void clearClientId()
		{
			
			NString sqlstatement= NString.getNull();
			//  Create SQL statement and parse 
			sqlstatement = toStr("BEGIN WFIKWIBC.CLEAR_CLIENT_ID( " + "'" + getClientId() + "'" + "); END;");
			//  execute sql statement 
			Gokdbms.dynamicSql(sqlstatement);
		}
/* <p>
		* 
		*  Define private subprogram bodies
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getClientId()
		{
			return getNameIn("GLOBAL.WF_CLIENT_ID");
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getWorkflowUrl()
		{
			return getNameIn("GLOBAL.WF_WORKFLOW_URL");
		}
/* <p>
		* 
		* 
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getProxyUrl()
		{
			return getNameIn("GLOBAL.WF_PROXY_URL");
		}
		
	
	
}
