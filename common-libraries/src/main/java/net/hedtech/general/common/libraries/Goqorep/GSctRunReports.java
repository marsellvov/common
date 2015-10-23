package net.hedtech.general.common.libraries.Goqorep;

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


public class GSctRunReports extends AbstractSupportCodeObject {
	

	public GSctRunReports(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public GoqorepServices getContainer() {
		return (GoqorepServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) G$_SCT_RUN_REPORTS
	/*
	PACKAGE G$_SCT_RUN_REPORTS IS
  PROCEDURE G$_SCT_RUN_REPORT(p_report_id           REPORT_OBJECT,
                            p_report_filename       VARCHAR2,
                            p_report_server         VARCHAR2,
                            p_report_service        VARCHAR2,
                            p_report_desformat      VARCHAR2,
                            p_report_destype        VARCHAR2,
                            p_report_desname        VARCHAR2,
                            p_report_execution_mode VARCHAR2,
                            p_report_comm_mode      VARCHAR2,
                            p_paramlist             PARAMLIST,
                            p_param_names_list      VARCHAR2,
                            p_report_success    OUT BOOLEAN);                          
END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) G$_SCT_RUN_REPORTS
		/*
		PACKAGE BODY G$_SCT_RUN_REPORTS IS 

  <multilinecomment>*
  ||Forward declaration
  ||PRIVATE procedure 
  *</multilinecomment>
  PROCEDURE G$_SCT_RUN_REPORT_SERVER(p_report_id             REPORT_OBJECT,
                                     p_report_filename       VARCHAR2,
                                     p_report_server         VARCHAR2,
                                     p_report_service        VARCHAR2,
                                     p_report_desformat      VARCHAR2,
                                     p_report_destype        VARCHAR2,
                                     p_report_desname        VARCHAR2,
                                     p_report_execution_mode VARCHAR2,
                                     p_report_comm_mode      VARCHAR2,
                                     p_paramlist             PARAMLIST,
                                     p_report_success    OUT BOOLEAN) IS
-- 
-- TGKinderman 06/23/2004
-- Core contents of this trigger pulled from OracleTechnologyNetwork (OTN) site as
-- per a trouble shooting example to aid with migration to OracleDS10g*Reports
-- OTN Doc ID = Note:139546.1
--
  lv_report_message          VARCHAR2(100);
  lv_rep_status              VARCHAR2(100);
  lv_user_name               VARCHAR2(100);
  lv_user_password           VARCHAR2(100);
  lv_user_connect            VARCHAR2(100);
  lv_connect                 VARCHAR2(100);
  lv_local                   VARCHAR2(30);
  lv_object                  VARCHAR2(30);
  lv_rep_name                VARCHAR2(200);
  lv_alert_return_stub       NUMBER;
  lv_rep_extension   VARCHAR2(04) := '.rep';
-- -- --  lv_rep_extension           VARCHAR2(04) := '.rdf';
  lv_paramlist               PARAMLIST;
  rep_base_name              VARCHAR2(30);
  obj_role                   VARCHAR2(30);
  role_passwd                VARCHAR2(30);
  ret_code                   NUMBER;
  err_text                   VARCHAR2(255);
-- --
  lv_work_report_desname     VARCHAR2(500) := '';
  lv_uprf_orep_root_dir      VARCHAR2(500);
  lv_uprf_orep_user_dir      VARCHAR2(500);
  lv_orep_user               VARCHAR2(30);
  lv_orep_file_portion       VARCHAR2(100);
  lv_orep_timestamp          VARCHAR2(14);
  lv_orep_file_ext_portion   VARCHAR2(100);
-- --
-- -- p_report_server is coming in through a guruprf value.  This value ends with a ? character.
-- -- This ? character is expected on this variable and is expected for certain syntax.
-- -- The following local variable is used to strip off the ? character when not needed for cetain syntax
  lv_report_server_shortname VARCHAR2(300) := substr(p_report_server,1,length(p_report_server) - 1);
-- --
-- --
BEGIN
-- get user connect string
--
  lv_user_name    := GET_APPLICATION_PROPERTY(username);
  lv_user_password:= GET_APPLICATION_PROPERTY(password);
  lv_user_connect := GET_APPLICATION_PROPERTY(connect_string);
  lv_connect      := lv_user_name||'/'||lv_user_password;
--
  IF lv_user_connect IS NOT NULL THEN
     lv_connect := lv_connect||'@'||lv_user_connect;
  ELSE
     TOOL_ENV.GETVAR('LOCAL',lv_local);
     IF lv_local IS NOT NULL THEN
       lv_connect := lv_connect||'@'||lv_local;
     END IF;
  END IF;
-- --
-- -- append extension to report_filename and check authorization
  IF INSTR(p_report_filename,'.') = 0 THEN
     lv_rep_name := p_report_filename||lv_rep_extension;
  ELSE
     lv_rep_name := p_report_filename;
  END IF;
--
  lv_object := UPPER(SUBSTR(lv_rep_name,1,INSTR(lv_rep_name,'.') -1));   
  IF NOT(G$_CHK_AUTH.G$_CHECK_AUTHORIZATION_FNC(lv_object,USER) = 'YES') THEN
    MESSAGE( G$_NLS.Get('GOQOREP-0031','LIB','*ERROR* User is not authorized to access %01%.',lv_object));
    p_report_success := FALSE;
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
-- -- --
-- -- --
-- -- --
  lv_work_report_desname := p_report_desname;
  IF p_report_destype = 'FILE' THEN
    G$_OREP_GET_PARMS_FOR_FILE(lv_user_name,
                               p_report_desname,
                               lv_uprf_orep_root_dir,
                               lv_orep_user,
                               lv_orep_file_portion,
                               lv_orep_timestamp,
                               lv_orep_file_ext_portion);
    IF UPPER(lv_uprf_orep_root_dir) <> 'DEFAULT_BEHAVIOR' THEN
    	lv_uprf_orep_user_dir := G$_OREP_GET_UPRF_ROOT_FILE(lv_user_name);
    	IF lv_uprf_orep_user_dir = 'DEFAULT_BEHAVIOR' THEN
    	  lv_uprf_orep_user_dir := '';
    	END IF;
      lv_work_report_desname := lv_uprf_orep_root_dir||lv_orep_user||lv_uprf_orep_user_dir||
                                lv_orep_file_portion||lv_orep_timestamp||lv_orep_file_ext_portion;
    END IF;
  END IF;
-- -- --
-- -- -- 
--
-- -- set Reports properties for run_report_object
-- -- set Reports properties string values
  SET_REPORT_OBJECT_PROPERTY(p_report_id,REPORT_FILENAME,lv_rep_name);
  SET_REPORT_OBJECT_PROPERTY(p_report_id,REPORT_DESFORMAT,p_report_desformat);
-- -- -- --  SET_REPORT_OBJECT_PROPERTY(p_report_id,REPORT_DESNAME,p_report_desname);
  SET_REPORT_OBJECT_PROPERTY(p_report_id,REPORT_DESNAME,lv_work_report_desname);
-- -- -- --
  SET_REPORT_OBJECT_PROPERTY(p_report_id,REPORT_SERVER,p_report_service);
-- -- set Reports properties constants
-- destype
  CASE p_report_destype
    WHEN 'CACHE' THEN SET_REPORT_OBJECT_PROPERTY(p_report_id,REPORT_DESTYPE,CACHE);
    WHEN 'FILE' THEN SET_REPORT_OBJECT_PROPERTY(p_report_id,REPORT_DESTYPE,FILE);
    WHEN 'MAIL' THEN SET_REPORT_OBJECT_PROPERTY(p_report_id,REPORT_DESTYPE,MAIL);
    WHEN 'PRINTER' THEN SET_REPORT_OBJECT_PROPERTY(p_report_id,REPORT_DESTYPE,PRINTER);
    ELSE SET_REPORT_OBJECT_PROPERTY(p_report_id,REPORT_DESTYPE,SCREEN);    
  END CASE;
-- execution mode
  IF p_report_execution_mode = 'BATCH' THEN
    SET_REPORT_OBJECT_PROPERTY(p_report_id,REPORT_EXECUTION_MODE,BATCH);
  ELSE
    SET_REPORT_OBJECT_PROPERTY(p_report_id,REPORT_EXECUTION_MODE,RUNTIME);
  END IF;	
-- communication mode
  IF p_report_comm_mode = 'SYNC' THEN
    SET_REPORT_OBJECT_PROPERTY(p_report_id,REPORT_COMM_MODE,SYNCHRONOUS);
  ELSE
    SET_REPORT_OBJECT_PROPERTY(p_report_id,REPORT_COMM_MODE,ASYNCHRONOUS);
  END IF;
-- -- -- --

  -- Add VPDI Parameters
  --
     IF G$_REPORT_VPDI.IS_MIF_ENABLED THEN
     	  ADD_PARAMETER( p_paramlist, 'P_VPDI_HOME_CODE', TEXT_PARAMETER, G$_REPORT_VPDI.GET_VPDI_HOME_CODE() );
     	  ADD_PARAMETER( p_paramlist, 'P_VPDI_PROCESS_CODE', TEXT_PARAMETER, G$_REPORT_VPDI.GET_VPDI_PROCESS_CODE() );
     END IF;
  -- End VPDI Parameters
--
  lv_paramlist := p_paramlist;
-- -- -- --
-- -- -- --   
-- -- P_USER_CONNECT and P_SERVERNAME are custom parameters in the Reports module.
-- -- P_ACTION is also a user defined variable in Reports and takes the web access
-- -- path to the Report (does not need to be hard coded as in this sample).
-- --
-- -- parameterform=yes or parameterform=no is being valued and passed into this routine in the p_paramlist
  SET_REPORT_OBJECT_PROPERTY(p_report_id,REPORT_OTHER,'P_USER_CONNECT='
      ||lv_connect||' P_SERVERNAME='||p_report_service ||' P_ACTION='||p_report_server);
  lv_report_message:=run_report_object(p_report_id,lv_paramlist);
--
  IF p_report_comm_mode = 'SYNC' THEN
    lv_rep_status := report_object_status(lv_report_message);
-- --
-- --
-- --Wait for Report to be finished (asynchonous processing possible using timers)
    WHILE lv_rep_status in ('RUNNING','OPENING_REPORT','ENQUEUED') LOOP
      lv_rep_status := report_object_status(lv_report_message);
    END LOOP;
-- -- Wait for Report to be finished -- --
-- --
-- --
    IF lv_rep_status='FINISHED' THEN
      p_report_success := TRUE;
      web.show_document(lv_report_server_shortname||'/getjobid'||
      substr(lv_report_message,instr(lv_report_message,'_',-1)+1)||'?server='||p_report_service,'_blank');
    ELSE
      p_report_success := FALSE;
      message (lv_rep_status||G$_NLS.Get('GOQOREP-0032','LIB','  Report output aborted'));         
    END IF;
  ELSE
-- -- Job has been submitted to run Asynch. Display the Job ID, Service, Sever and then get out
-- --
    p_report_success := TRUE;
    SET_ALERT_PROPERTY('G$_INFO_ALERT',ALERT_MESSAGE_TEXT,
          G$_NLS.Get('GOQOREP-0033','LIB','Report submitted Async with: Job ID=%01% Service=%02% Server=%03%',substr(lv_report_message,instr(lv_report_message,'_',-1)+1),p_report_service,lv_report_server_shortname));
    lv_alert_return_stub := SHOW_ALERT('G$_INFO_ALERT');
  END IF;  	
END;

  <multilinecomment>*
  ||Forward declaration
  ||PRIVATE procedure 
  *</multilinecomment>
PROCEDURE G$_SCT_RUN_REPORT_ONLINE(p_report_id             REPORT_OBJECT,
                                   p_report_filename       VARCHAR2,
                                   p_report_server         VARCHAR2,
                                   p_report_service        VARCHAR2,
                                   p_report_desformat      VARCHAR2,
                                   p_report_destype        VARCHAR2,
                                   p_report_desname        VARCHAR2,
                                   p_report_execution_mode VARCHAR2,
                                   p_report_comm_mode      VARCHAR2,
                                   p_paramlist             PARAMLIST,
                                   p_param_names_list      VARCHAR2,
                                   p_report_success    OUT BOOLEAN) IS
                                     
  v_loc												PLS_INTEGER;
  v_startloc									PLS_INTEGER := 1;
  delim												VARCHAR2(2) := '::';
  v_item     									VARCHAR2(100);
  
  lv_report_server_shortname 	VARCHAR2(300) := substr(p_report_server,1,length(p_report_server) - 1);
  
  rep_url 										VARCHAR2(2000);

  b														NUMBER;
  a														VARCHAR2(100);
  x 													VARCHAR2(2000); 
  param_form_ind 							VARCHAR2(10);
  
  lv_user_connect             VARCHAR2(100);
  lv_connect                  VARCHAR2(100);
  lv_local                    VARCHAR2(30);
BEGIN  	
	-- check security
	  IF NOT(G$_CHK_AUTH.G$_CHECK_AUTHORIZATION_FNC( UPPER( p_report_filename ),USER) = 'YES' ) THEN
           MESSAGE( G$_NLS.Get('GOQOREP-0034','LIB','*ERROR* User is not authorized to access %01%.', UPPER( p_report_filename ) ) );
           --
           p_report_success := FALSE;
           --
           RAISE FORM_TRIGGER_FAILURE;
	  END IF; 
-- --
	  lv_user_connect := GET_APPLICATION_PROPERTY(connect_string);
    IF lv_user_connect IS NOT NULL THEN
       lv_connect := lv_user_connect;
    ELSE
      TOOL_ENV.GETVAR('LOCAL',lv_local);
      IF lv_local IS NOT NULL THEN
        lv_connect := lv_local;
      END IF;
    END IF;    
-- --
             IF p_param_names_list IS NOT NULL 
             THEN 
                LOOP
                   
                   v_loc := INSTR (p_param_names_list, delim, v_startloc);
                   IF v_loc = v_startloc
                   THEN
                      v_item := NULL;
                   ELSIF v_loc = 0
                   THEN
                      v_item := SUBSTR (p_param_names_list, v_startloc);
                   ELSE
                      v_item := SUBSTR (p_param_names_list, v_startloc, v_loc - v_startloc);
                   END IF;                                      
                      GET_PARAMETER_ATTR( p_paramlist, v_item, b, a  ); 
                      x := x || '&' || v_item || '=' || a;
                   IF v_loc = 0
                   THEN
                      EXIT;
                   ELSE 
                      v_startloc := v_loc + 2;
                   END IF;
                END LOOP;
             END IF;
             
             GET_PARAMETER_ATTR( p_paramlist,'PARAMFORM', b, param_form_ind );
             
             x := GOKDBMS.URL_ESCAPE( x );
             
             rep_url := lv_report_server_shortname || '?server='||p_report_service || '&report='||p_report_filename ||
             '&destype='||p_report_destype || '&desformat=' || p_report_desformat ||
             '&paramform='||param_form_ind || '&userid=' || x ;
             
               -- Add VPDI Parameters
--
             IF G$_REPORT_VPDI.IS_MIF_ENABLED THEN
             	
             	rep_url := rep_url || '&p_vpdi_home_code='|| G$_REPORT_VPDI.GET_VPDI_HOME_CODE() ||
             	                      '&p_vpdi_process_code='|| G$_REPORT_VPDI.GET_VPDI_PROCESS_CODE();
             END IF;
             
             -- End VPDI Parameters
             
             -- Set userid connect string
             --set_custom_property('G$_BANNER_REPORT_HEADER.REPORT_BEAN',1,'WRITE_LOGOUTPUT','true');
	           set_custom_property('G$_BANNER_REPORT_HEADER.REPORT_BEAN',1,'ADD_USERID',
                                                          get_application_property(username)||'/'||
                                                          get_application_property(password)||'@'||
-- -- -- -- --                                                 get_application_property(connect_string));
                                                          lv_connect);
                                                          
           set_custom_property('G$_BANNER_REPORT_HEADER.REPORT_BEAN',1,'WRITE_USERID_COOKIE','10g');
   --
   
           SYNCHRONIZE;
   --          
           p_report_success := TRUE;
             
           -- -- append mimetype for rtf (Word) or delimited/delimiteddata (Excel)
           -- -- such that filetype is assigned and application can be opened  
           IF p_report_desformat = 'RTF' THEN
             web.show_document( rep_url||'&mimetype=application/msword','_blank');
           ELSIF p_report_desformat IN ('DELIMITED','DELIMITEDDATA') THEN 
             web.show_document( rep_url||'&mimetype=application/vnd.ms-excel','_blank');
           ELSE 
             web.show_document( rep_url,'_blank');
           END IF;

  EXCEPTION
        WHEN OTHERS THEN
           p_report_success := FALSE;
 END G$_SCT_RUN_REPORT_ONLINE;


  <multilinecomment>*
  ||PUBLIC procedure 
  *</multilinecomment>
  PROCEDURE G$_SCT_RUN_REPORT(p_report_id             REPORT_OBJECT,
                              p_report_filename       VARCHAR2,
                              p_report_server         VARCHAR2,
                              p_report_service        VARCHAR2,
                              p_report_desformat      VARCHAR2,
                              p_report_destype        VARCHAR2,
                              p_report_desname        VARCHAR2,
                              p_report_execution_mode VARCHAR2,
                              p_report_comm_mode      VARCHAR2,
                              p_paramlist             PARAMLIST,
                              p_param_names_list      VARCHAR2,
                              p_report_success    OUT BOOLEAN
                              ) IS
   BEGIN  	
   	IF UPPER(p_report_destype) = 'CACHE' THEN  		
   		   		    		G$_SCT_RUN_REPORT_ONLINE(p_report_id,
                                             p_report_filename,
                                             p_report_server,
                                             p_report_service,
                                             p_report_desformat,
                                             p_report_destype,
                                             p_report_desname,
                                             p_report_execution_mode,
                                             p_report_comm_mode,
                                             p_paramlist,
                                             p_param_names_list,
                                             p_report_success);

   	ELSE
    	            	G$_SCT_RUN_REPORT_SERVER(p_report_id,
                                             p_report_filename,
                                             p_report_server,
                                             p_report_service,
                                             p_report_desformat,
                                             p_report_destype,
                                             p_report_desname,
                                             p_report_execution_mode,
                                             p_report_comm_mode,
                                             p_paramlist,
                                             p_report_success);
   	END IF;
  END G$_SCT_RUN_REPORT;

END G$_SCT_RUN_REPORTS;
		*/
		/* <p>
		* *
		* ||Forward declaration
		* ||PRIVATE procedure
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pReportId
		* @param pReportFilename
		* @param pReportServer
		* @param pReportService
		* @param pReportDesformat
		* @param pReportDestype
		* @param pReportDesname
		* @param pReportExecutionMode
		* @param pReportCommMode
		* @param pParamlist
		* @param pReportSuccess
		*/
		public void gSctRunReportServer(UnknownTypes.ReportObject pReportId, NString pReportFilename, NString pReportServer, NString pReportService, NString pReportDesformat, NString pReportDestype, NString pReportDesname, NString pReportExecutionMode, NString pReportCommMode, Hashtable pParamlist, Ref<NBool> pReportSuccess)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  
//			//  TGKinderman 06/23/2004
//			//  Core contents of this trigger pulled from OracleTechnologyNetwork (OTN) site as
//			//  per a trouble shooting example to aid with migration to OracleDS10g*Reports
//			//  OTN Doc ID = Note:139546.1
//			// 
//			NString lvReportMessage= NString.getNull();
//			NString lvRepStatus= NString.getNull();
//			NString lvUserName= NString.getNull();
//			NString lvUserPassword= NString.getNull();
//			NString lvUserConnect= NString.getNull();
//			NString lvConnect= NString.getNull();
//			NString lvLocal= NString.getNull();
//			NString lvObject= NString.getNull();
//			NString lvRepName= NString.getNull();
//			NNumber lvAlertReturnStub= NNumber.getNull();
//			NString lvRepExtension = toStr(".rep");
//			//  -- --  lv_rep_extension           VARCHAR2(04) := '.rdf';
//			Hashtable lvParamlist= null;
//			NString repBaseName= NString.getNull();
//			NString objRole= NString.getNull();
//			NString rolePasswd= NString.getNull();
//			NNumber retCode= NNumber.getNull();
//			NString errText= NString.getNull();
//			//  --
//			NString lvWorkReportDesname = toStr("");
//			NString lvUprfOrepRootDir= NString.getNull();
//			NString lvUprfOrepUserDir= NString.getNull();
//			NString lvOrepUser= NString.getNull();
//			NString lvOrepFilePortion= NString.getNull();
//			NString lvOrepTimestamp= NString.getNull();
//			NString lvOrepFileExtPortion= NString.getNull();
//			//  --
//			//  -- p_report_server is coming in through a guruprf value.  This value ends with a ? character.
//			//  -- This ? character is expected on this variable and is expected for certain syntax.
//			//  -- The following local variable is used to strip off the ? character when not needed for cetain syntax
//			NString lvReportServerShortname = substring(pReportServer, toInt(1), length(pReportServer).subtract(1));
//			//  get user connect string
//			// 
//			lvUserName = toStr(getUser());
//			lvUserPassword = toStr(getPassword());
//			lvUserConnect = toStr(getConnectionString());
//			lvConnect = lvUserName.append("/").append(lvUserPassword);
//			// 
//			if ( !lvUserConnect.isNull() )
//			{
//				lvConnect = lvConnect.append("@").append(lvUserConnect);
//			}
//			else {
//				getEnvVar("LOCAL", lvLocal);
//				if ( !lvLocal.isNull() )
//				{
//					lvConnect = lvConnect.append("@").append(lvLocal);
//				}
//			}
//			//  --
//			//  -- append extension to report_filename and check authorization
//			if ( inStr(pReportFilename, toStr(".")).equals(0) )
//			{
//				lvRepName = pReportFilename.append(lvRepExtension);
//			}
//			else {
//				lvRepName = pReportFilename;
//			}
//			// 
//			lvObject = upper(substring(lvRepName, toInt(1), inStr(lvRepName, toStr(".")).subtract(1)));
//			if ( !(GChkAuth.gCheckAuthorizationFnc(lvObject, getUser()).equals("YES")) )
//			{
//				message(GNls.Fget(toStr("GOQOREP-0031"), toStr("LIB"), toStr("*ERROR* User is not authorized to access %01%."), lvObject));
//				pReportSuccess.val = toBool(NBool.False);
//				throw new ApplicationException();
//			}
//			//  -- --
//			//  -- --
//			//  -- --
//			lvWorkReportDesname = pReportDesname;
//			if ( pReportDestype.equals("FILE") )
//			{
//				Ref<NString> pUprfOrepRootDir_ref = new Ref<NString>(lvUprfOrepRootDir);
//				Ref<NString> pOrepUser_ref = new Ref<NString>(lvOrepUser);
//				Ref<NString> pOrepFilePortion_ref = new Ref<NString>(lvOrepFilePortion);
//				Ref<NString> pOrepTimestamp_ref = new Ref<NString>(lvOrepTimestamp);
//				Ref<NString> pOrepFileExtPortion_ref = new Ref<NString>(lvOrepFileExtPortion);
//				getContainer().gOrepGetParmsForFile(lvUserName, pReportDesname, pUprfOrepRootDir_ref, pOrepUser_ref, pOrepFilePortion_ref, pOrepTimestamp_ref, pOrepFileExtPortion_ref);
//				lvUprfOrepRootDir = pUprfOrepRootDir_ref.val;
//				lvOrepUser = pOrepUser_ref.val;
//				lvOrepFilePortion = pOrepFilePortion_ref.val;
//				lvOrepTimestamp = pOrepTimestamp_ref.val;
//				lvOrepFileExtPortion = pOrepFileExtPortion_ref.val;
//				if ( upper(lvUprfOrepRootDir).notEquals("DEFAULT_BEHAVIOR") )
//				{
//					lvUprfOrepUserDir = getContainer().gOrepGetUprfRootFile(lvUserName);
//					if ( lvUprfOrepUserDir.equals("DEFAULT_BEHAVIOR") )
//					{
//						lvUprfOrepUserDir = toStr("");
//					}
//					lvWorkReportDesname = lvUprfOrepRootDir.append(lvOrepUser).append(lvUprfOrepUserDir).append(lvOrepFilePortion).append(lvOrepTimestamp).append(lvOrepFileExtPortion);
//				}
//			}
//			//  -- --
//			//  -- -- 
//			// 
//			//  -- set Reports properties for run_report_object
//			//  -- set Reports properties string values
//			// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_FILENAME" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//			//			SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_FILENAME, lvRepName);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_FILENAME' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//			
//			// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_DESFORMAT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//			//			SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_DESFORMAT, pReportDesformat);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_DESFORMAT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//			
//			//  -- -- --  SET_REPORT_OBJECT_PROPERTY(p_report_id,REPORT_DESNAME,p_report_desname);
//			// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_DESNAME" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//			//			SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_DESNAME, lvWorkReportDesname);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_DESNAME' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//			
//			//  -- -- --
//			// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_SERVER" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//			//			SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_SERVER, pReportService);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_SERVER' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//			
//			//  -- set Reports properties constants
//			//  destype
//			if (pReportDestype == "CACHE")
//			{
//				// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_DESTYPE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//				//				SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_DESTYPE, SupportClasses.Constants.CACHE);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_DESTYPE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//				
//			}
//			else if (pReportDestype == "FILE")
//			{
//				// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_DESTYPE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//				//				SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_DESTYPE, SupportClasses.Constants.FILE);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_DESTYPE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//				
//			}
//			else if (pReportDestype == "MAIL")
//			{
//				// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_DESTYPE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//				//				SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_DESTYPE, SupportClasses.Constants.MAIL);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_DESTYPE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//				
//			}
//			else if (pReportDestype == "PRINTER")
//			{
//				// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_DESTYPE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//				//				SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_DESTYPE, SupportClasses.Constants.PRINTER);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_DESTYPE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//				
//			}
//			else {
//				// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_DESTYPE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//				//				SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_DESTYPE, SupportClasses.Constants.SCREEN);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_DESTYPE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//				
//			}
//			//  execution mode
//			if ( pReportExecutionMode.equals("BATCH") )
//			{
//				// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_EXECUTION_MODE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//				//				SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_EXECUTION_MODE, SupportClasses.Constants.BATCH);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_EXECUTION_MODE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//				
//			}
//			else {
//				// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_EXECUTION_MODE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//				//				SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_EXECUTION_MODE, SupportClasses.Constants.RUNTIME);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_EXECUTION_MODE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//				
//			}
//			//  communication mode
//			if ( pReportCommMode.equals("SYNC") )
//			{
//				// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_COMM_MODE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//				//				SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_COMM_MODE, SupportClasses.Constants.SYNCHRONOUS);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_COMM_MODE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//				
//			}
//			else {
//				// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_COMM_MODE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//				//				SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_COMM_MODE, SupportClasses.Constants.ASYNCHRONOUS);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_COMM_MODE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//				
//			}
//			//  -- -- --
//			//  Add VPDI Parameters
//			// 
//			if ( getContainer().getGReportVpdi().isMifEnabled().getValue() )
//			{
//				addParameter(pParamlist, "P_VPDI_HOME_CODE", getContainer().getGReportVpdi().getVpdiHomeCode());
//				addParameter(pParamlist, "P_VPDI_PROCESS_CODE", getContainer().getGReportVpdi().getVpdiProcessCode());
//			}
//			//  End VPDI Parameters
//			// 
//			lvParamlist = pParamlist;
//			//  -- -- --
//			//  -- -- --   
//			//  -- P_USER_CONNECT and P_SERVERNAME are custom parameters in the Reports module.
//			//  -- P_ACTION is also a user defined variable in Reports and takes the web access
//			//  -- path to the Report (does not need to be hard coded as in this sample).
//			//  --
//			//  -- parameterform=yes or parameterform=no is being valued and passed into this routine in the p_paramlist
//			// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_OTHER" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//			//			SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_OTHER, toStr("P_USER_CONNECT=").append(lvConnect).append(" P_SERVERNAME=").append(pReportService).append(" P_ACTION=").append(pReportServer));
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_OTHER' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//			
//			// F2J_NOT_SUPPORTED : Call to built-in "RUN_REPORT_OBJECT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
//			//			lvReportMessage = SupportClasses.FORMS40.RunReportObject(pReportId, lvParamlist);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'RUN_REPORT_OBJECT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
//			
//			// 
//			if ( pReportCommMode.equals("SYNC") )
//			{
//				// F2J_NOT_SUPPORTED : Call to built-in "REPORT_OBJECT_STATUS" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
//				//				lvRepStatus = SupportClasses.FORMS40.ReportObjectStatus(lvReportMessage);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REPORT_OBJECT_STATUS' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
//				
//				//  --
//				//  --
//				//  --Wait for Report to be finished (asynchonous processing possible using timers)
//				while ( in(lvRepStatus, "RUNNING", "OPENING_REPORT", "ENQUEUED").getValue() ) {
//					// F2J_NOT_SUPPORTED : Call to built-in "REPORT_OBJECT_STATUS" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
//					//					lvRepStatus = SupportClasses.FORMS40.ReportObjectStatus(lvReportMessage);
//					////
//					System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'REPORT_OBJECT_STATUS' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
//					
//				}
//				//  -- Wait for Report to be finished -- --
//				//  --
//				//  --
//				if ( lvRepStatus.equals("FINISHED") )
//				{
//					pReportSuccess.val = toBool(NBool.True);
//					showDocument(lvReportServerShortname.append("/getjobid").append(substring(lvReportMessage, inStr(lvReportMessage, toStr("_"), - (1)).add(1))).append("?server=").append(pReportService), "_blank");
//				}
//				else {
//					pReportSuccess.val = toBool(NBool.False);
//					message(lvRepStatus.append(GNls.Fget(toStr("GOQOREP-0032"), toStr("LIB"), toStr("  Report output aborted"))));
//				}
//			}
//			else {
//				//  -- Job has been submitted to run Asynch. Display the Job ID, Service, Sever and then get out
//				//  --
//				pReportSuccess.val = toBool(NBool.True);
//				setAlertMessageText("G$_INFO_ALERT", GNls.Fget(toStr("GOQOREP-0033"), toStr("LIB"), toStr("Report submitted Async with: Job ID=%01% Service=%02% Server=%03%"), substring(lvReportMessage, inStr(lvReportMessage, toStr("_"), - (1)).add(1)), pReportService, lvReportServerShortname));
//				lvAlertReturnStub = toNumber(showAlert("G$_INFO_ALERT"));
//			}
//
			this.getLogger().trace(this, "F2J : gSctRunReportServer procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* *
		* ||Forward declaration
		* ||PRIVATE procedure
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pReportId
		* @param pReportFilename
		* @param pReportServer
		* @param pReportService
		* @param pReportDesformat
		* @param pReportDestype
		* @param pReportDesname
		* @param pReportExecutionMode
		* @param pReportCommMode
		* @param pParamlist
		* @param pParamNamesList
		* @param pReportSuccess
		*/
		public void gSctRunReportOnline(UnknownTypes.ReportObject pReportId, NString pReportFilename, NString pReportServer, NString pReportService, NString pReportDesformat, NString pReportDestype, NString pReportDesname, NString pReportExecutionMode, NString pReportCommMode, Hashtable pParamlist, NString pParamNamesList, Ref<NBool> pReportSuccess)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
			NInteger vLoc= NInteger.getNull();
			NInteger vStartloc = toInt(1);
			NString delim = toStr("::");
			NString vItem= NString.getNull();
			NString lvReportServerShortname = substring(pReportServer, toInt(1), length(pReportServer).subtract(1));
			NString repUrl= NString.getNull();
			NNumber b= NNumber.getNull();
			NString a= NString.getNull();
			NString x= NString.getNull();
			NString paramFormInd= NString.getNull();
			NString lvUserConnect= NString.getNull();
			NString lvConnect= NString.getNull();
			NString lvLocal= NString.getNull();
			try
			{
//				//  check security
				if ( !(GChkAuth.gCheckAuthorizationFnc(upper(pReportFilename), getUser()).equals("YES")) )
				{
					errorMessage(GNls.Fget(toStr("GOQOREP-0034"), toStr("LIB"), toStr("*ERROR* User is not authorized to access %01%."), upper(pReportFilename)));
					// 
					pReportSuccess.val = toBool(NBool.False);
					// 
					throw new ApplicationException();
				}
				//  --
				lvUserConnect = toStr(getConnectionString());
				if ( !lvUserConnect.isNull() )
				{
					lvConnect = lvUserConnect;
				}
				else {
					// MORPHIS TODO GEN
					lvLocal=toStr("LOCAL");
//					getEnvVar("LOCAL", lvLocal);
					
					getEnvVar(lvLocal);
					if ( !lvLocal.isNull() )
					{
						lvConnect = lvLocal;
					}
				}
				//  --
				if ( !pParamNamesList.isNull() )
				{
					while (true) {
						vLoc = inStr(pParamNamesList, delim, vStartloc);
						if ( vLoc.equals(vStartloc) )
						{
							vItem = toStr(null);
						}
						else if ( vLoc.equals(0) ) {
							vItem = substring(pParamNamesList, vStartloc);
						}
						else {
							vItem = substring(pParamNamesList, vStartloc, vLoc.subtract(vStartloc));
						}
						a = toStr(pParamlist.get(vItem.getValue()));// getParameter(toStr(pParamlist).getValue(), vItem.getValue());
						x = x.append("&").append(vItem).append("=").append(a);
						if ( vLoc.equals(0) )
						{
								break;
						}
						else {
							vStartloc = vLoc.add(2);
						}
					}
				}
				paramFormInd = toStr(pParamlist.get("PARAMFORM"));//getParameter(toStr(pParamlist).getValue(), "PARAMFORM");
				x = Gokdbms.FurlEscape(x);
				repUrl = lvReportServerShortname.append("?server=").append(pReportService).append("&report=").append(pReportFilename).append("&destype=").append(pReportDestype).append("&desformat=").append(pReportDesformat).append("&paramform=").append(paramFormInd).append("&userid=").append(x);
				//  Add VPDI Parameters
				// 
				if ( getContainer().getGReportVpdi().isMifEnabled().getValue() )
				{
					repUrl = repUrl.append("&p_vpdi_home_code=").append(getContainer().getGReportVpdi().getVpdiHomeCode()).append("&p_vpdi_process_code=").append(getContainer().getGReportVpdi().getVpdiProcessCode());
				}
				//  End VPDI Parameters
				//  Set userid connect string
				// set_custom_property('G$_BANNER_REPORT_HEADER.REPORT_BEAN',1,'WRITE_LOGOUTPUT','true');
				// F2J_NOT_SUPPORTED : The property "CUSTOM's 1" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin16".
				//				SupportClasses.FORMS40.SetCustomProperty("G$_BANNER_REPORT_HEADER.REPORT_BEAN", 1, "ADD_USERID", getUser().append("/").append(getPassword()).append("@").append(lvConnect));
				////
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'CUSTOM's 1' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin16'.");
				
				
				// F2J_NOT_SUPPORTED : The property "CUSTOM's 1" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin16".
				//				SupportClasses.FORMS40.SetCustomProperty("G$_BANNER_REPORT_HEADER.REPORT_BEAN", 1, "WRITE_USERID_COOKIE", "10g");
				////
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'CUSTOM's 1' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin16'.");
				
				
				// 
				// F2J_TO_REMOVE : Call to built-in "SYNCHRONIZE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#ExcludeSynchronize".
				//				SupportClasses.SQLFORMS.Synchronize();
				////
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'SYNCHRONIZE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#ExcludeSynchronize'.");
				
				
				//           
				pReportSuccess.val = toBool(NBool.True);
				//  -- append mimetype for rtf (Word) or delimited/delimiteddata (Excel)
				//  -- such that filetype is assigned and application can be opened  
				if ( pReportDesformat.equals("RTF") )
				{
					showDocument(repUrl.append("&mimetype=application/msword"), "_blank");
				}
				else if ( in(pReportDesformat, "DELIMITED", "DELIMITEDDATA").getValue() ) {
					showDocument(repUrl.append("&mimetype=application/vnd.ms-excel"), "_blank");
				}
				else {
					showDocument(repUrl, "_blank");
				}
			}
			catch(Exception  e)
			{
				pReportSuccess.val = toBool(NBool.False);
			}

//			System.err.println("F2J : gSctRunReportOnline procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}
/* <p>
		* *
		* ||PUBLIC procedure
		* *
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pReportId
		* @param pReportFilename
		* @param pReportServer
		* @param pReportService
		* @param pReportDesformat
		* @param pReportDestype
		* @param pReportDesname
		* @param pReportExecutionMode
		* @param pReportCommMode
		* @param pParamlist
		* @param pParamNamesList
		* @param pReportSuccess
		*/
		public void gSctRunReport(UnknownTypes.ReportObject pReportId, NString pReportFilename, NString pReportServer, NString pReportService, NString pReportDesformat, NString pReportDestype, NString pReportDesname, NString pReportExecutionMode, NString pReportCommMode, Hashtable pParamlist, NString pParamNamesList, Ref<NBool> pReportSuccess)
		{

			if ( upper(pReportDestype).equals("CACHE") )
			{
				gSctRunReportOnline(pReportId, pReportFilename, pReportServer, pReportService, pReportDesformat, pReportDestype, pReportDesname, pReportExecutionMode, pReportCommMode, pParamlist, pParamNamesList, pReportSuccess);
			}
			else {
				gSctRunReportServer(pReportId, pReportFilename, pReportServer, pReportService, pReportDesformat, pReportDestype, pReportDesname, pReportExecutionMode, pReportCommMode, pParamlist, pReportSuccess);
			}

			
		}
		
	
	
}
