package net.hedtech.general.common.libraries.Goqorep;



import morphis.foundations.core.appsupportlib.runtime.AbstractLibrary;
import morphis.foundations.core.appsupportlib.runtime.ISupportCodeContainer;
import morphis.foundations.core.appsupportlib.runtime.configuration.LibraryConfiguration;
 
import java.util.*;
import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
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




public class GoqorepServices extends AbstractLibrary{
		
	public GoqorepServices (LibraryConfiguration configuration,
			ISupportCodeContainer container, Hashtable sharedLibraries) {
		super(configuration, container, sharedLibraries);
	}
			
		
	// Attached Libraries
	/* package accessor */
	public Oraclereportsconfigexception getOraclereportsconfigexception() 
	{
		return (Oraclereportsconfigexception)getSupportCodeManager().getPackage("ORACLEREPORTSCONFIGEXCEPTION");
	}
	/* package accessor */
	public GSctRunReports getGSctRunReports() 
	{
		return (GSctRunReports)getSupportCodeManager().getPackage("G$_SCT_RUN_REPORTS");
	}
	/* package accessor */
	public GReportVpdi getGReportVpdi() 
	{
		return (GReportVpdi)getSupportCodeManager().getPackage("G$_REPORT_VPDI");
	}
	/* package accessor */
	public GReportSecurity getGReportSecurity() 
	{
		return (GReportSecurity)getSupportCodeManager().getPackage("G$_REPORT_SECURITY");
	}
	/* package accessor */
	public GPathfinder getGPathfinder() 
	{
		return (GPathfinder)getSupportCodeManager().getPackage("G$_PATHFINDER");
	}
	/* package accessor */
	public GLocateFile getGLocateFile() 
	{
		return (GLocateFile)getSupportCodeManager().getPackage("G$_LOCATE_FILE");
	}
	/* package accessor */
	public GGetchksum getGGetchksum() 
	{
		return (GGetchksum)getSupportCodeManager().getPackage("G$_GETCHKSUM");
	}
	/* package accessor */
	public GDllHandle getGDllHandle() 
	{
		return (GDllHandle)getSupportCodeManager().getPackage("G$_DLL_HANDLE");
	}
	/* package accessor */
	public GBannerReportProcessing getGBannerReportProcessing() 
	{
		return (GBannerReportProcessing)getSupportCodeManager().getPackage("G$_BANNER_REPORT_PROCESSING");
	}
	/* package accessor */
	public GBannerReportEditing getGBannerReportEditing() 
	{
		return (GBannerReportEditing)getSupportCodeManager().getPackage("G$_BANNER_REPORT_EDITING");
	}
	/* package accessor */
	public Exception_ getException_() 
	{
		return (Exception_)getSupportCodeManager().getPackage("EXCEPTION_");
	}
	/* package accessor */
	public Bannerid getBannerid() 
	{
		return (Bannerid)getSupportCodeManager().getPackage("BANNERID");
	}
	
	//Original PL/SQL code for Prog Unit GOQOREP.G$_SCT_RUN_REPORT
	/*
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
  lv_connect                 VARCHAR2(300);
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
-- -- p_report_server is coming in through a guruprf value.  This value ends with a ? character.
-- -- This ? character is expected on this variable and is expected for certain syntax.
-- -- The following local variable is used to strip off the ? character when not needed for cetain syntax
  lv_report_server_shortname VARCHAR2(300) := substr(p_report_server,1,length(p_report_server) - 1);
-- --
-- --
BEGIN
-- -- get user connect string
-- -- -- --  lv_user_name:=get_application_property(username);
-- -- -- --  lv_user_password:=get_application_property(password);
-- -- -- --  lv_user_connect:=get_application_property(connect_string);
-- -- -- --  lv_connect:=lv_user_name||'/'||lv_user_password||'@'||lv_user_connect;  
--
-- get user connect string
--
  lv_user_name    := GET_APPLICATION_PROPERTY(username);
  lv_user_password:= GET_APPLICATION_PROPERTY(password);
  lv_user_connect := GET_APPLICATION_PROPERTY(connect_string);
  lv_connect      := lv_user_name||'/'||lv_user_password;
--
  IF lv_user_connect IS NOT NULL THEN
     lv_connect := lv_connect||'@'||lv_user_connect;
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
    MESSAGE( G$_NLS.Get('GOQOREP-0028','LIB','*ERROR* User is not authorized to access %01%.',lv_object));
    p_report_success := FALSE;
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
-- -- set Reports properties for run_report_object
-- -- set Reports properties string values
  SET_REPORT_OBJECT_PROPERTY(p_report_id,REPORT_FILENAME,lv_rep_name);
  SET_REPORT_OBJECT_PROPERTY(p_report_id,REPORT_DESFORMAT,p_report_desformat);
  SET_REPORT_OBJECT_PROPERTY(p_report_id,REPORT_DESNAME,p_report_desname);
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
--  
--  Get the role and role password for the report
--
-- -- --  rep_base_name := UPPER(SUBSTR(lv_rep_name,1,INSTR(lv_rep_name,'.') -1));
-- -- --  g$_orep_secr.g$_orepsecr(rep_base_name,'SKIP',obj_role,role_passwd,ret_code,err_text);
-- -- --  IF ret_code <> 0 THEN
-- -- --     MESSAGE(err_text);
-- -- --     RAISE FORM_TRIGGER_FAILURE;
-- -- --  END IF;
-- -- -- --
-- -- -- --
  lv_paramlist := p_paramlist;
-- -- -- --
-- Finally, add the role and role password to the parameters passed to the .rep.
--
  ADD_PARAMETER(lv_paramlist,'P_ROLE',TEXT_PARAMETER,obj_role);
  ADD_PARAMETER(lv_paramlist,'P_PASS',TEXT_PARAMETER,role_passwd);
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
      message (lv_rep_status||G$_NLS.Get('GOQOREP-0029','LIB','  Report output aborted'));         
    END IF;
  ELSE
-- -- Job has been submitted to run Asynch. Display the Job ID, Service, Sever and then get out
-- --
    p_report_success := TRUE;
    SET_ALERT_PROPERTY('G$_INFO_ALERT',ALERT_MESSAGE_TEXT,
          G$_NLS.Get('GOQOREP-0030','LIB','Report submitted Batch/Async with: Job ID=%01% Service=%02% Server=%03%',substr(lv_report_message,instr(lv_report_message,'_',-1)+1),p_report_service,lv_report_server_shortname));
    lv_alert_return_stub := SHOW_ALERT('G$_INFO_ALERT');
  END IF;  	
-- Last but not least, delete the parameters we added so the invoking
-- routine can't see them.
-- 
  DELETE_PARAMETER(lv_paramlist,'P_ROLE');
  DELETE_PARAMETER(lv_paramlist,'P_PASS');
END;
	*/
	/* <p>
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
		public void gSctRunReport(UnknownTypes.ReportObject pReportId, NString pReportFilename, NString pReportServer, NString pReportService, NString pReportDesformat, NString pReportDestype, NString pReportDesname, NString pReportExecutionMode, NString pReportCommMode, Hashtable pParamlist, Ref<NBool> pReportSuccess)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  
//			//  TGKinderman 06/23/2004
//			//  Core contents of this trigger pulled from OracleTechnologyNetwork (OTN) site as
//			//  per a trouble shooting example to aid with migration to OracleDS10g*Reports
//			//  OTN Doc ID = Note:139546.1
//			// 
			NString lvReportMessage= NString.getNull();
			NString lvRepStatus= NString.getNull();
			NString lvUserName= NString.getNull();
			NString lvUserPassword= NString.getNull();
			NString lvUserConnect= NString.getNull();
			NString lvConnect= NString.getNull();
			NString lvObject= NString.getNull();
			NString lvRepName= NString.getNull();
			NNumber lvAlertReturnStub= NNumber.getNull();
			NString lvRepExtension = toStr(".rep");
			//  -- --  lv_rep_extension           VARCHAR2(04) := '.rdf';
			Hashtable lvParamlist= null;
			NString repBaseName= NString.getNull();
			NString objRole= NString.getNull();
			NString rolePasswd= NString.getNull();
			NNumber retCode= NNumber.getNull();
			NString errText= NString.getNull();
			//  --
			//  -- p_report_server is coming in through a guruprf value.  This value ends with a ? character.
			//  -- This ? character is expected on this variable and is expected for certain syntax.
			//  -- The following local variable is used to strip off the ? character when not needed for cetain syntax
			NString lvReportServerShortname = substring(pReportServer, toInt(1), length(pReportServer).subtract(1));
			//  -- get user connect string
			//  -- -- --  lv_user_name:=get_application_property(username);
			//  -- -- --  lv_user_password:=get_application_property(password);
			//  -- -- --  lv_user_connect:=get_application_property(connect_string);
			//  -- -- --  lv_connect:=lv_user_name||'/'||lv_user_password||'@'||lv_user_connect;  
			// 
			//  get user connect string
			// 
			lvUserName = toStr(getUser());
			lvUserPassword = toStr(getPassword());
			lvUserConnect = toStr(getConnectionString());
			lvConnect = lvUserName.append("/").append(lvUserPassword);
			// 
			if ( !lvUserConnect.isNull() )
			{
				lvConnect = lvConnect.append("@").append(lvUserConnect);
			}
			//  --
			//  -- append extension to report_filename and check authorization
			if ( inStr(pReportFilename, toStr(".")).equals(0) )
			{
				lvRepName = pReportFilename.append(lvRepExtension);
			}
			else {
				lvRepName = pReportFilename;
			}
			// 
			lvObject = upper(substring(lvRepName, toInt(1), inStr(lvRepName, toStr(".")).subtract(1)));
			if ( !(GChkAuth.gCheckAuthorizationFnc(lvObject, getUser()).equals("YES")) )
			{
				errorMessage(GNls.Fget(toStr("GOQOREP-0028"), toStr("LIB"), toStr("*ERROR* User is not authorized to access %01%."), lvObject));
				pReportSuccess.val = toBool(NBool.False);
				throw new ApplicationException();
			}
			// 
			//  -- set Reports properties for run_report_object
			//  -- set Reports properties string values
			// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_FILENAME" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
			//			SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_FILENAME, lvRepName);
			////
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_FILENAME' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
			
			
			// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_DESFORMAT" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
			//			SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_DESFORMAT, pReportDesformat);
			////
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_DESFORMAT' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
			
			
			// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_DESNAME" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
			//			SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_DESNAME, pReportDesname);
			////
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_DESNAME' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
			
			
			// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_SERVER" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
			//			SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_SERVER, pReportService);
			////
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_SERVER' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
			
			
			//  -- set Reports properties constants
			//  destype
			if (pReportDestype.getValue() == "CACHE")
			{
				// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_DESTYPE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_DESTYPE, SupportClasses.Constants.CACHE);
				////
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_DESTYPE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				
			}
			else if (pReportDestype.getValue() == "FILE")
			{
				// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_DESTYPE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_DESTYPE, SupportClasses.Constants.FILE);
				////
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_DESTYPE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				
			}
			else if (pReportDestype.getValue() == "MAIL")
			{
				// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_DESTYPE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_DESTYPE, SupportClasses.Constants.MAIL);
				////
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_DESTYPE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				
			}
			else if (pReportDestype.getValue() == "PRINTER")
			{
				// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_DESTYPE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_DESTYPE, SupportClasses.Constants.PRINTER);
				////
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_DESTYPE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				
			}
			else {
				// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_DESTYPE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_DESTYPE, SupportClasses.Constants.SCREEN);
				////
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_DESTYPE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				
			}
			//  execution mode
			if ( pReportExecutionMode.equals("BATCH") )
			{
				// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_EXECUTION_MODE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_EXECUTION_MODE, SupportClasses.Constants.BATCH);
				////
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_EXECUTION_MODE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				
			}
			else {
				// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_EXECUTION_MODE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_EXECUTION_MODE, SupportClasses.Constants.RUNTIME);
				////
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_EXECUTION_MODE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				
			}
			//  communication mode
			if ( pReportCommMode.equals("SYNC") )
			{
				// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_COMM_MODE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_COMM_MODE, SupportClasses.Constants.SYNCHRONOUS);
				////
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_COMM_MODE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				
			}
			else {
				// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_COMM_MODE" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_COMM_MODE, SupportClasses.Constants.ASYNCHRONOUS);
				////
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_COMM_MODE' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				
			}
			//  -- -- --
			//   
			//   Get the role and role password for the report
			// 
			//  -- --  rep_base_name := UPPER(SUBSTR(lv_rep_name,1,INSTR(lv_rep_name,'.') -1));
			//  -- --  g$_orep_secr.g$_orepsecr(rep_base_name,'SKIP',obj_role,role_passwd,ret_code,err_text);
			//  -- --  IF ret_code <> 0 THEN
			//  -- --     MESSAGE(err_text);
			//  -- --     RAISE FORM_TRIGGER_FAILURE;
			//  -- --  END IF;
			//  -- -- --
			//  -- -- --
			lvParamlist = pParamlist;
			//  -- -- --
			//  Finally, add the role and role password to the parameters passed to the .rep.
			// 
			addParameter(lvParamlist, "P_ROLE", objRole);
			addParameter(lvParamlist, "P_PASS", rolePasswd);
			//  -- -- --   
			//  -- P_USER_CONNECT and P_SERVERNAME are custom parameters in the Reports module.
			//  -- P_ACTION is also a user defined variable in Reports and takes the web access
			//  -- path to the Report (does not need to be hard coded as in this sample).
			//  --
			//  -- parameterform=yes or parameterform=no is being valued and passed into this routine in the p_paramlist
			// F2J_NOT_SUPPORTED : The property "REPORT_OBJECT's REPORT_OTHER" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
			//			SupportClasses.FORMS40.SetReportObjectProperty(pReportId, SupportClasses.Constants.REPORT_OTHER, toStr("P_USER_CONNECT=").append(lvConnect).append(" P_SERVERNAME=").append(pReportService).append(" P_ACTION=").append(pReportServer));
			////
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'REPORT_OBJECT's REPORT_OTHER' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
			
			
			// F2J_NOT_SUPPORTED : Call to built-in "RUN_REPORT_OBJECT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
			//			lvReportMessage = SupportClasses.FORMS40.RunReportObject(pReportId, lvParamlist);
			////
			this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'RUN_REPORT_OBJECT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
			
			
			// 
			if ( pReportCommMode.equals("SYNC") )
			{
				// F2J_NOT_SUPPORTED : Call to built-in "REPORT_OBJECT_STATUS" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				lvRepStatus = SupportClasses.FORMS40.ReportObjectStatus(lvReportMessage);
				////
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'REPORT_OBJECT_STATUS' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				
				//  --
				//  --
				//  --Wait for Report to be finished (asynchonous processing possible using timers)
				while ( in(lvRepStatus, "RUNNING", "OPENING_REPORT", "ENQUEUED").getValue() ) {
					// F2J_NOT_SUPPORTED : Call to built-in "REPORT_OBJECT_STATUS" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
					//					lvRepStatus = SupportClasses.FORMS40.ReportObjectStatus(lvReportMessage);
					////
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'REPORT_OBJECT_STATUS' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
					
					
				}
				//  -- Wait for Report to be finished -- --
				//  --
				//  --
				if ( lvRepStatus.equals("FINISHED") )
				{
					pReportSuccess.val = toBool(NBool.True);
					showDocument(lvReportServerShortname.append("/getjobid").append(substring(lvReportMessage, inStr(lvReportMessage, toStr("_"), - (1)).add(1))).append("?server=").append(pReportService), "_blank");
				}
				else {
					pReportSuccess.val = toBool(NBool.False);
					warningMessage(lvRepStatus.append(GNls.Fget(toStr("GOQOREP-0029"), toStr("LIB"), toStr("  Report output aborted"))));
				}
			}
			else {
				//  -- Job has been submitted to run Asynch. Display the Job ID, Service, Sever and then get out
				//  --
				pReportSuccess.val = toBool(NBool.True);
				setAlertMessageText("G$_INFO_ALERT", GNls.Fget(toStr("GOQOREP-0030"), toStr("LIB"), toStr("Report submitted Batch/Async with: Job ID=%01% Service=%02% Server=%03%"), substring(lvReportMessage, inStr(lvReportMessage, toStr("_"), - (1)).add(1)), pReportService, lvReportServerShortname));
				lvAlertReturnStub = toNumber(showAlert("G$_INFO_ALERT"));
			}
			//  Last but not least, delete the parameters we added so the invoking
			//  routine can't see them.
			//  
			deleteParameter(lvParamlist.toString(), "P_ROLE");
			deleteParameter(lvParamlist.toString(), "P_PASS");

//			System.err.println("F2J : gSctRunReport procedure is not completely migrated yet. Please read the Migration Guide.");
			
		}

	//Original PL/SQL code for Prog Unit GOQOREP.G$_OREP_NLS_SESSION_PARM
	/*
	PROCEDURE G$_OREP_NLS_SESSION_PARM IS
l_nls_date_format varchar2(30);
--
BEGIN
  tool_env.getvar('NLS_DATE_FORMAT', l_nls_date_format);
  if l_nls_date_format is not null then
    G$_DATE.SET_NLS_DATE_FORMAT(l_nls_date_format);
  else
    select VALUE into l_nls_date_format
    from NLS_SESSION_PARAMETERS where PARAMETER='NLS_DATE_FORMAT';
    if INSTR(l_nls_date_format,'YYYY')>0 or INSTR(l_nls_date_format,'RRRR')>0 then
      G$_DATE.SET_NLS_DATE_FORMAT(l_nls_date_format);
    else
      if INSTR(l_nls_date_format,'YY')>0 then
        l_nls_date_format:=REPLACE(l_nls_date_format,'YY','RRRR');
      elsif INSTR(l_nls_date_format,'RR')>0 then
        l_nls_date_format:=REPLACE(l_nls_date_format,'RR','RRRR');
      end if;
      G$_DATE.SET_NLS_DATE_FORMAT(l_nls_date_format);
    end if;
  end if;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gOrepNlsSessionParm()
		{
			int rowCount = 0;
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString lNlsDateFormat= NString.getNull();
//			getEnvVar("NLS_DATE_FORMAT", lNlsDateFormat);
//			if ( !lNlsDateFormat.isNull() )
//			{
//				GDate.setNlsDateFormat(lNlsDateFormat);
//			}
//			else {
//				String sql1 = "SELECT VALUE " +
//	" FROM NLS_SESSION_PARAMETERS " +
//	" WHERE PARAMETER = 'NLS_DATE_FORMAT' ";
//				DataCommand command1 = new DataCommand(sql1);
//				ResultSet results1 = command1.executeQuery();
//				rowCount = command1.getRowCount();
//				if ( results1.hasData() ) {
//					lNlsDateFormat = results1.getStr(0);
//				}
//				results1.close();
//				if ( inStr(lNlsDateFormat, toStr("YYYY")).greater(0) || inStr(lNlsDateFormat, toStr("RRRR")).greater(0) )
//				{
//					GDate.setNlsDateFormat(lNlsDateFormat);
//				}
//				else {
//					if ( inStr(lNlsDateFormat, toStr("YY")).greater(0) )
//					{
//						lNlsDateFormat = replace(lNlsDateFormat, "YY", "RRRR");
//					}
//					else if ( inStr(lNlsDateFormat, toStr("RR")).greater(0) ) {
//						lNlsDateFormat = replace(lNlsDateFormat, "RR", "RRRR");
//					}
//					GDate.setNlsDateFormat(lNlsDateFormat);
//				}
//			}
//
			this.getLogger().trace(this, "F2J : gOrepNlsSessionParm procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQOREP.G$_OREP_IS_ROOT_DIR_VALID
	/*
	FUNCTION G$_OREP_IS_ROOT_DIR_VALID (P_DESNAME_IN IN VARCHAR2) RETURN VARCHAR2 IS
-- Function will compare the entire desname to what the user is configured for.
-- (2 Alphanumeric digits returned, so as to leave room should error checking be expanded)
-- If the starting portion of the desname is valid '00' is returned by the function.
-- If a : is found in desname beyond the length of what the user is configured for, a '02' is returned
--      This is specific to Windows OS and the user trying to specify a drive (c: or z:) in the desname
--      instead of letting the System specify the output dir.  User should just enter the filename (and extension)
-- If the starting potion of the desname is not valid (not equal to what the user is configured for), a '01' is returned
  lv_hold_user     VARCHAR2(30)  := USER;
  lv_hold_root_dir VARCHAR2(500) := G$_OREP_GET_UPRF_ROOT_FILE('BASELINE');
  lv_work_root_dir VARCHAR2(500);
  lv_slash         VARCHAR2(1);
  lv_hold_full     VARCHAR2(500);
  lv_hold_substr_p_desname VARCHAR2(500);
BEGIN
-- -- Determine lv_work_root_dir.  Need to see if USER or USER,DATE are trailing characers and remove them
  IF INSTR(lv_hold_root_dir, '\') > 0 THEN
		lv_slash := '\';
	ELSE
		lv_slash := '/';
	END IF;
	IF SUBSTR(lv_hold_root_dir, LENGTH(lv_hold_root_dir),1) = lv_slash THEN
    lv_work_root_dir := lv_hold_root_dir;
    lv_hold_user     := '';
	ELSIF INSTR(lv_hold_root_dir,',') > 0 THEN
    lv_work_root_dir := SUBSTR(lv_hold_root_dir,1,INSTR(lv_hold_root_dir,',') - 5);
	ELSIF UPPER(SUBSTR(lv_hold_root_dir, LENGTH(lv_hold_root_dir) - 3, 4)) = 'USER' THEN
		lv_work_root_dir := SUBSTR(lv_hold_root_dir,1,INSTR(lv_hold_root_dir,'user') - 1);
	ELSE
		lv_work_root_dir := SUBSTR(lv_hold_root_dir,1,INSTR(lv_hold_root_dir,'date') - 1);
    lv_hold_user     := '';
  END IF;
  lv_hold_full := UPPER(lv_work_root_dir||lv_hold_user);
  lv_hold_substr_p_desname := UPPER(substr(p_desname_in,1,length(lv_hold_full)));
  IF lv_hold_full <> lv_hold_substr_p_desname THEN
-- -- Invalid.  Trying to override a file or folder that is not what the System is expecting for the user
    RETURN('01');
  ELSIF (instr(p_desname_in,':',length(lv_hold_full)) > 0) THEN
-- -- Invalid.  Althougha Windows specific check, user is trying to specify a drive letter as part of the desname.
-- -- This is not necessary.  System will build the drive/folder for output under this non DEFAULT_BEHAVIOR configuration.
    RETURN('02');
  END IF;
-- --
-- -- Valid
  RETURN('00');
-- --
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pDesnameIn
		*/
		public NString gOrepIsRootDirValid(NString pDesnameIn)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  Function will compare the entire desname to what the user is configured for.
//			//  (2 Alphanumeric digits returned, so as to leave room should error checking be expanded)
//			//  If the starting portion of the desname is valid '00' is returned by the function.
//			//  If a : is found in desname beyond the length of what the user is configured for, a '02' is returned
//			//       This is specific to Windows OS and the user trying to specify a drive (c: or z:) in the desname
//			//       instead of letting the System specify the output dir.  User should just enter the filename (and extension)
//			//  If the starting potion of the desname is not valid (not equal to what the user is configured for), a '01' is returned
//			NString lvHoldUser = getUser();
//			NString lvHoldRootDir = gOrepGetUprfRootFile(toStr("BASELINE"));
//			NString lvWorkRootDir= NString.getNull();
//			NString lvSlash= NString.getNull();
//			NString lvHoldFull= NString.getNull();
//			NString lvHoldSubstrPDesname= NString.getNull();
//			//  -- Determine lv_work_root_dir.  Need to see if USER or USER,DATE are trailing characers and remove them
//			if ( inStr(lvHoldRootDir, toStr("\\")).greater(0) )
//			{
//				lvSlash = toStr("\\");
//			}
//			else {
//				lvSlash = toStr("/");
//			}
//			if ( substring(lvHoldRootDir, length(lvHoldRootDir), toInt(1)).equals(lvSlash) )
//			{
//				lvWorkRootDir = lvHoldRootDir;
//				lvHoldUser = toStr("");
//			}
//			else if ( inStr(lvHoldRootDir, toStr(",")).greater(0) ) {
//				lvWorkRootDir = substring(lvHoldRootDir, toInt(1), inStr(lvHoldRootDir, toStr(",")).subtract(5));
//			}
//			else if ( upper(substring(lvHoldRootDir, length(lvHoldRootDir).subtract(3), toInt(4))).equals("USER") ) {
//				lvWorkRootDir = substring(lvHoldRootDir, toInt(1), inStr(lvHoldRootDir, toStr("user")).subtract(1));
//			}
//			else {
//				lvWorkRootDir = substring(lvHoldRootDir, toInt(1), inStr(lvHoldRootDir, toStr("date")).subtract(1));
//				lvHoldUser = toStr("");
//			}
//			lvHoldFull = upper(lvWorkRootDir.append(lvHoldUser));
//			lvHoldSubstrPDesname = upper(substring(pDesnameIn, toInt(1), length(lvHoldFull)));
//			if ( lvHoldFull.notEquals(lvHoldSubstrPDesname) )
//			{
//				//  -- Invalid.  Trying to override a file or folder that is not what the System is expecting for the user
//				return  toStr((("01")));
//			}
//			else if ((inStr(pDesnameIn, toStr(":"), length(lvHoldFull)).greater(0))) {
//				//  -- Invalid.  Althougha Windows specific check, user is trying to specify a drive letter as part of the desname.
//				//  -- This is not necessary.  System will build the drive/folder for output under this non DEFAULT_BEHAVIOR configuration.
//				return  toStr((("02")));
//			}
//			//  --
//			//  -- Valid
//			return  toStr((("00")));
//
			this.getLogger().trace(this, "F2J : gOrepIsRootDirValid function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}

	//Original PL/SQL code for Prog Unit GOQOREP.G$_OREP_INITIALIZE
	/*
	PROCEDURE G$_OREP_INITIALIZE IS
BEGIN
  G$_OREP_NLS_SESSION_PARM;  
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void gOrepInitialize()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			gOrepNlsSessionParm();
//
			this.getLogger().trace(this, "F2J : gOrepInitialize procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQOREP.G$_OREP_GET_UPRF_ROOT_FILE
	/*
	FUNCTION G$_OREP_GET_UPRF_ROOT_FILE (p_user_IN IN VARCHAR2) RETURN VARCHAR2 IS
--
  VALUE_OUT      VARCHAR2(200) := '';
--
  CURSOR GURUPRF_C (p_user VARCHAR2) IS
    SELECT GURUPRF_VALUE 
      FROM GURUPRF
     WHERE GURUPRF_USER_ID  = p_user
       AND GURUPRF_GROUP    = 'REPORT'
       AND GURUPRF_KEY      = 'WEB'
       AND GURUPRF_STRING   = 'SERVROOTFILE';
--
BEGIN
  OPEN GURUPRF_C(p_user_IN);
  FETCH GURUPRF_C INTO VALUE_OUT;
  CLOSE GURUPRF_C;
--
  IF p_user_IN = 'BASELINE' THEN
    IF VALUE_OUT IS NOT NULL THEN
      RETURN(VALUE_OUT);
    ELSE
  	  RETURN('DEFAULT_BEHAVIOR');
    END IF;
  ELSE
    IF VALUE_OUT IS NOT NULL THEN
    	IF VALUE_OUT = 'DEFAULT_BEHAVIOR' THEN
    		RETURN('');
    	ELSE
        RETURN(VALUE_OUT);
      END IF;
    ELSE
  	  RETURN('');
    END IF;      	
  END IF;  	
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pUserIn
		*/
		public NString gOrepGetUprfRootFile(NString pUserIn)
		{
			int rowCount = 0;
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			// 
//			NString valueOut = toStr("");
//			String sqlguruprfC = "SELECT GURUPRF_VALUE " +
//	" FROM GURUPRF " +
//	" WHERE GURUPRF_USER_ID = :P_P_USER AND GURUPRF_GROUP = 'REPORT' AND GURUPRF_KEY = 'WEB' AND GURUPRF_STRING = 'SERVROOTFILE' ";
//			DataCursor guruprfC = new DataCursor(sqlguruprfC);
//			NString pUser = NString.getNull();
//			try {
//				pUser=pUserIn;
//				//Setting query parameters
//				guruprfC.addParameter("P_P_USER", pUser);
//				//F2J_WARNING : Make sure that the method "Close" is being called over the variable guruprfC.
//				guruprfC.open();
//				ResultSet guruprfCResults = guruprfC.fetchInto();
//				if ( guruprfCResults != null ) {
//					valueOut = guruprfCResults.getStr(0);
//				}
//				guruprfC.close();
//				// 
//				if ( pUserIn.equals("BASELINE") )
//				{
//					if ( !valueOut.isNull() )
//					{
//						return ((valueOut));
//					}
//					else {
//						return  toStr((("DEFAULT_BEHAVIOR")));
//					}
//				}
//				else {
//					if ( !valueOut.isNull() )
//					{
//						if ( valueOut.equals("DEFAULT_BEHAVIOR") )
//						{
//							return  toStr((("")));
//						}
//						else {
//							return ((valueOut));
//						}
//					}
//					else {
//						return  toStr((("")));
//					}
//				}
//				}finally{
//					guruprfC.close();
//				}
//
			this.getLogger().trace(this, "F2J : gOrepGetUprfRootFile function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}

	//Original PL/SQL code for Prog Unit GOQOREP.G$_OREP_GET_PARMS_FOR_FILE
	/*
	PROCEDURE G$_OREP_GET_PARMS_FOR_FILE(p_user_name             IN  VARCHAR2,
                                     p_report_desname        IN  VARCHAR2,
                                     p_uprf_orep_root_dir    OUT VARCHAR2,
                                     p_orep_user             OUT VARCHAR2,
                                     p_orep_file_portion     OUT VARCHAR2,
                                     p_orep_timestamp        OUT VARCHAR2,
                                     p_orep_file_ext_portion OUT VARCHAR2) IS
-- --
-- -- Values for lv_orep_root_dir are either DEFAULT_BEHVIOR or it will hold a valid
-- -- root_level folder name (Windows or Unix/Linix nomenclature) with ending slash.
-- -- addons can be     date   user or    user,date       date,user would not be valid
-- --
-- -- Examples:
-- --       DEFAULT_BEHAVIOR
-- --       f:\orep_root\
-- --       f:\orep_root\\user
-- --       f:\orep_root\date
-- --       f:\orep_root\\user,date
-- --  
-- --
lv_orep_root_dir VARCHAR2(500);
lv_slash         VARCHAR2(1);
-- --
BEGIN
  lv_orep_root_dir := G$_OREP_GET_UPRF_ROOT_FILE('BASELINE');
	IF UPPER(lv_orep_root_dir) = 'DEFAULT_VALUE' THEN
		p_uprf_orep_root_dir := UPPER(lv_orep_root_dir);
		RETURN;
	END IF;
  IF INSTR(lv_orep_root_dir, '\') > 0 THEN
		lv_slash := '\';
	ELSE
		lv_slash := '/';
	END IF;
-- --
  IF INSTR(p_report_desname,'.') > 0 THEN
  	p_orep_file_portion := SUBSTR(p_report_desname,1,INSTR(p_report_desname,'.') - 1);
  	p_orep_file_ext_portion := SUBSTR(p_report_desname,INSTR(p_report_desname,'.'),LENGTH(p_report_desname));
  ELSE
    p_orep_file_portion     := p_report_desname;	
    p_orep_file_ext_portion := '';
  END IF;
-- --
	IF SUBSTR(lv_orep_root_dir, LENGTH(lv_orep_root_dir),1) = lv_slash THEN
    p_uprf_orep_root_dir := lv_orep_root_dir;
    p_orep_user := '';
    p_orep_timestamp := '';
	ELSIF INSTR(lv_orep_root_dir,',') > 0 THEN
    p_uprf_orep_root_dir := SUBSTR(lv_orep_root_dir,1,INSTR(lv_orep_root_dir,',') - 5);
    p_orep_user := LOWER(p_user_name)||lv_slash;
		p_orep_timestamp := TO_CHAR(sysdate,'YYYYMMDDHH24MISS');
	ELSIF UPPER(SUBSTR(lv_orep_root_dir, LENGTH(lv_orep_root_dir) - 3, 4)) = 'USER' THEN
		p_uprf_orep_root_dir := SUBSTR(lv_orep_root_dir,1,INSTR(lv_orep_root_dir,'user') - 1);
		p_orep_user := LOWER(p_user_name)||lv_slash;
		p_orep_timestamp := '';
	ELSE
		p_uprf_orep_root_dir := SUBSTR(lv_orep_root_dir,1,INSTR(lv_orep_root_dir,'date') - 1);
		p_orep_user := '';
		p_orep_timestamp := TO_CHAR(sysdate,'YYYYMMDDHH24MISS');		
  END IF;
END;
	*/
	/* <p>
/* </p>
		* @param pUserName
		* @param pReportDesname
		* @param pUprfOrepRootDir
		* @param pOrepUser
		* @param pOrepFilePortion
		* @param pOrepTimestamp
		* @param pOrepFileExtPortion
		*/
		public void gOrepGetParmsForFile(NString pUserName, NString pReportDesname, Ref<NString> pUprfOrepRootDir, Ref<NString> pOrepUser, Ref<NString> pOrepFilePortion, Ref<NString> pOrepTimestamp, Ref<NString> pOrepFileExtPortion)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  --
//			//  -- Values for lv_orep_root_dir are either DEFAULT_BEHVIOR or it will hold a valid
//			//  -- root_level folder name (Windows or Unix/Linix nomenclature) with ending slash.
//			//  -- addons can be     date   user or    user,date       date,user would not be valid
//			//  --
//			//  -- Examples:
//			//  --       DEFAULT_BEHAVIOR
//			//  --       f:\orep_root\
//			//  --       f:\orep_root\\user
//			//  --       f:\orep_root\date
//			//  --       f:\orep_root\\user,date
//			//  --  
//			//  --
//			NString lvOrepRootDir= NString.getNull();
//			NString lvSlash= NString.getNull();
//			lvOrepRootDir = gOrepGetUprfRootFile(toStr("BASELINE"));
//			if ( upper(lvOrepRootDir).equals("DEFAULT_VALUE") )
//			{
//				pUprfOrepRootDir.val = upper(lvOrepRootDir);
//				return ;
//			}
//			if ( inStr(lvOrepRootDir, toStr("\\")).greater(0) )
//			{
//				lvSlash = toStr("\\");
//			}
//			else {
//				lvSlash = toStr("/");
//			}
//			//  --
//			if ( inStr(pReportDesname, toStr(".")).greater(0) )
//			{
//				pOrepFilePortion.val = substring(pReportDesname, toInt(1), inStr(pReportDesname, toStr(".")).subtract(1));
//				pOrepFileExtPortion.val = substring(pReportDesname, inStr(pReportDesname, toStr(".")), length(pReportDesname));
//			}
//			else {
//				pOrepFilePortion.val = pReportDesname;
//				pOrepFileExtPortion.val = toStr("");
//			}
//			//  --
//			if ( substring(lvOrepRootDir, length(lvOrepRootDir), toInt(1)).equals(lvSlash) )
//			{
//				pUprfOrepRootDir.val = lvOrepRootDir;
//				pOrepUser.val = toStr("");
//				pOrepTimestamp.val = toStr("");
//			}
//			else if ( inStr(lvOrepRootDir, toStr(",")).greater(0) ) {
//				pUprfOrepRootDir.val = substring(lvOrepRootDir, toInt(1), inStr(lvOrepRootDir, toStr(",")).subtract(5));
//				pOrepUser.val = lower(pUserName).append(lvSlash);
//				pOrepTimestamp.val = toChar(NDate.getNow(), "YYYYMMDDHH24MISS");
//			}
//			else if ( upper(substring(lvOrepRootDir, length(lvOrepRootDir).subtract(3), toInt(4))).equals("USER") ) {
//				pUprfOrepRootDir.val = substring(lvOrepRootDir, toInt(1), inStr(lvOrepRootDir, toStr("user")).subtract(1));
//				pOrepUser.val = lower(pUserName).append(lvSlash);
//				pOrepTimestamp.val = toStr("");
//			}
//			else {
//				pUprfOrepRootDir.val = substring(lvOrepRootDir, toInt(1), inStr(lvOrepRootDir, toStr("date")).subtract(1));
//				pOrepUser.val = toStr("");
//				pOrepTimestamp.val = toChar(NDate.getNow(), "YYYYMMDDHH24MISS");
//			}
//
			this.getLogger().trace(this, "F2J : gOrepGetParmsForFile procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQOREP.DO_EXEC_SQL
	/*
	PROCEDURE DO_EXEC_SQL (sql_string IN VARCHAR2) IS
    connection_id EXEC_SQL.CONNTYPE;
    cursor_number EXEC_SQL.CURSTYPE;
    ret_code      PLS_INTEGER;
--
  BEGIN
--
    connection_id := EXEC_SQL.DEFAULT_CONNECTION;
    cursor_number :=  EXEC_SQL.OPEN_CURSOR(connection_id);
--
    EXEC_SQL.PARSE(connection_id, cursor_number, sql_string);
    ret_code := EXEC_SQL.EXECUTE(connection_id, cursor_number);
    EXEC_SQL.CLOSE_CURSOR(connection_id, cursor_number);
    EXEC_SQL.CLOSE_CONNECTION(connection_id);
--
  END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sqlString
		*/
		public void doExecSql(NString sqlString)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			UnknownTypes.ExecSqlConntype connectionId= null;
//			UnknownTypes.ExecSqlCurstype cursorNumber= null;
//			NInteger retCode= NInteger.getNull();
//			// 
//			// F2J_NOT_SUPPORTED : Call to built-in "DEFAULT_CONNECTION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
//			//			connectionId = SupportClasses.EXEC_SQL.DefaultConnection();
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'DEFAULT_CONNECTION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
//			
//			// F2J_NOT_SUPPORTED : Call to built-in "OPEN_CURSOR" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
//			//			cursorNumber = SupportClasses.EXEC_SQL.OpenCursor(connectionId);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'OPEN_CURSOR' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
//			
//			// 
//			// F2J_NOT_SUPPORTED : Call to built-in "PARSE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin6".
//			//			SupportClasses.EXEC_SQL.Parse(connectionId, cursorNumber, sqlString);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'PARSE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin6'.");
//			
//			// F2J_NOT_SUPPORTED : Call to built-in "EXECUTE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin7".
//			//			retCode = SupportClasses.EXEC_SQL.Execute(connectionId, cursorNumber);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'EXECUTE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin7'.");
//			
//			// F2J_NOT_SUPPORTED : Call to built-in "CLOSE_CURSOR" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin8".
//			//			SupportClasses.EXEC_SQL.CloseCursor(connectionId, cursorNumber);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CLOSE_CURSOR' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin8'.");
//			
//			// F2J_NOT_SUPPORTED : Call to built-in "CLOSE_CONNECTION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin9".
//			//			SupportClasses.EXEC_SQL.CloseConnection(connectionId);
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CLOSE_CONNECTION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQOREPF2NMigrationGuide.xml#DefaultExcludeBuiltin9'.");
//			
//
			this.getLogger().trace(this, "F2J : doExecSql procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQOREP.AUDIT_TRAIL_NLS_DATE_SUPPORT
	/*
	PROCEDURE AUDIT_TRAIL_NLS_DATE_SUPPORT IS
-- AUDIT TRAIL: NLS_DATE_SUPPORT 
-- 1. TGKinderman   11/11/2005
--    This object was passed through a conversion process relative to preparing
--    the object to support internationalization needs.  Basically, hard coded
--    date format masks of DD-MON-YYYY are converted to a G$_DATE function that
--    returns nls_date_format.  The release number of this object was NOT
--    modified as part of this effort.  This object may or may not have had 
--    conversion process code modifications.  However, this audit trail entry
--    does indicate that the object has been passed through the conversion.
-- AUDIT TRAIL END
-- 
BEGIN
  NULL;
END AUDIT_TRAIL_NLS_DATE_SUPPORT;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailNlsDateSupport()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrailNlsDateSupport procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQOREP.AUDIT_TRAIL_MSGKEY_UPDATE
	/*
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GOQOREP
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Tue Jul 29 12:13:43 2008
-- MSGSIGN : #c643420b728be4b9
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrailMsgkeyUpdate procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQOREP.AUDIT_TRAIL_8_1_GOQOREP
	/*
	PROCEDURE AUDIT_TRAIL_8_1_GOQOREP IS
<multilinecomment>
AUDIT TRAIL: 8.1
1. LVH 07/29/2008
   Defect 1-3MLX1W
   Fixed several G$_NLS.GET statements to conform to ISC standards.  

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail81Goqorep()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail81Goqorep procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQOREP.AUDIT_TRAIL_8_0_GOQOREP
	/*
	PROCEDURE AUDIT_TRAIL_8_0_GOQOREP IS
<multilinecomment>
AUDIT TRAIL: 8.0
1. TGKinderman 04/27/2007
   Added G$_OREP_NLS_SESSION_PARM and G$_G$_OREP_INITIALIZE in support of flex dates.  This will support the
   BASELINE Oracle*Reports to run with different NLS_DATE_FORMAT values.  For example, formats such as: RRRR-MM-DD,
   MM-DD-RRRR in addition to familiar date format of DD-MON-RRRR.  

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail80Goqorep()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail80Goqorep procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQOREP.AUDIT_TRAIL_7_3_GOQOREP
	/*
	PROCEDURE AUDIT_TRAIL_7_3_GOQOREP IS
<multilinecomment>
AUDIT TRAIL: 7.3
1. Michael Hitrik 01/16/2006
   1.1 Created new Package G$_REPORT_VPDI to support MIF
   1.2 Modified G$_SCR_RUN_REPORTS Package.  Added new parameters p_vpdi_home_code and p_vpdi_process_code to
       G$_SCT_RUN_REPORT_SERVER and G$_SCT_RUN_REPORT_ONLINE procedures
2. TGKinderman 03/08/2006
   2.1 Added edit to G$_BANNER_REPORT_EDITING.EDIT_OREP_ROW to check for DESNAME must be null if destype is CACHE.
   2.2 Added G$_OREP_GET_PARMS_FOR_FILE, G$_OREP_GET_UPRF_ROOT_FILE and G$_OREP_IS_ROOT_DIR_VALID in support of
       defect correction CMS-DFCT105960.  These pl/sql units called when launching the report form pl/sql unit
       (destype=FILE) GOQOREP.G$_SCT_RUN_REPORTS.G$_SCT_RUN_REPORT_SERVER in addition to each RDF in the
       AFTERPFORM trigger.
   2.3 Modify GOQOREP.G$_SCT_RUN_REPORTS.G$_SCT_RUN_REPORT_SERVER to cunstruct the filename if destype=FILE and
       the BASELINE uprf row is not DEFAULT_BEHAVIOR
   2.4 Modify G$_BANNER_REPORT_EDITING.EDIT_OREP_ROW, if G$_OREP_GET_UPRF_ROOT_FILE is not DEFAULT_BEHAVIOR then
       perform some subtle edits to aid end user to basically enter just the filename (and dot extension, if desired)
       
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail73Goqorep()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail73Goqorep procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQOREP.AUDIT_TRAIL_7_2_GOQOREP
	/*
	PROCEDURE AUDIT_TRAIL_7_2_GOQOREP IS
<multilinecomment>
AUDIT TRAIL: 7.2
1. Michael Hitrik 07/07/2005
   1.1 Modified G$_REPORT_SECURITY to remove DBMS_SESSION call - replaced with G$_TRACE_PKG.DO_EXEC_SQL.
       Attached GOQRPLS library. 
   1.2 Modified G$_SCT_RUN_REPORTS to remove UTL_HTTP call - replaced with GOKDBMS.
   1.3 Added new DO_EXEC_SQL Procedure
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail72Goqorep()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail72Goqorep procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQOREP.AUDIT_TRAIL_7_1_GOQOREP
	/*
	PROCEDURE AUDIT_TRAIL_7_1_GOQOREP IS
<multilinecomment>
AUDIT TRAIL: 7.1
1. Michael Hitrik 11/19/2003
   Oracle Reports Security Modifications:
   1.1 Modified G$_BANNER_REPORT_PROCESSING package to include a p_report_param_name_list parameter to
       Function PROCESS_REPORT, modified START_REPORT_WINDOW procedure to reference G$_BANNER_REPORT_HEADER.LIST_PARAM_NAMES
   1.2 Created BANNERID Java Imported Package
   1.3 Created EXCEPTION_ Java Imported Package
   1.4 Created G$_REPORT_SECURITY Package
   1.5 Created G$_SCT_RUN_REPORTS Package
   1.6 Modified G$_BANNER_REPORT_PROCESSING.START_REPORT_WINDOW Procedure to include new edits
   1.7 Modified G$_BANNER_REPORT_EDITING.EDIT_OREP_ROW Procedure to include new edits
2. TGKinderman    04/05/2005
   2.1 Added code to G$_SCT_RUN_REPORTS.G$_SCT_RUN_REPORT_ONLINE and G$_SCT_RUN_REPORTS.G$_SCT_RUN_REPORT_SERVER to check
       local variable for database connect value, if the connect_string was not provided at login.
   2.2 Added mimetype for Word (RTF) and Excel (DELIMITED/DELIMITEDDATA) to web.show_document in routine
       G$_SCT_RUN_REPORTS.G$_SCT_RUN_REPORT_ONLINE
3. TGKinderman    04/13/2005
   Removed reference to g$_orep_secr.  Package being dropped with General7.1 release.
4. TGKinderman    04/18/2005
   4.1 Added UPPER to return value within G$_BANNER_REPORT_PROCESSING.GET_GJBPDFT_REPORT_VALUE.
   4.2 Added logic within G$_BANNER_REPORT_PROCESSING.GET_GJBPDFT_REPORT_VALUE such that if gjbpdft value, for a specific
   user, is being passed as null this value will be ignored.  The value where user is null will then be passed back.

AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail71Goqorep()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail71Goqorep procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQOREP.AUDIT_TRAIL_7_0_GOQOREP
	/*
	PROCEDURE AUDIT_TRAIL_7_0_GOQOREP IS
<multilinecomment>
AUDIT TRAIL: 7.0
1. TGKinderman 11/19/2003
   Converted to Forms9i
2. TGKinderman 08/10/2004
   Modidications per run_report_object initial implementation.
   Modifications to the G$_SCT_RUN_REPORT routine.
3. TGKinderman 10/05/2004
   Additional modifications in support of having BASELINE Reports receive data input through PARM01, PARM02,
   PARMnn, etc where the nn is equivalent to the job submission parameter sequence number.  Parameters 71 through
   77 are initially reserved with this modification to push to report Destination Format(71),Destination Type(72),
   Destination Name(73),Execution Mode(74),Communication Mode(75),Parameter Form Designation(76) and Show Report
   Value Window(77).  Parameter 77 does not apply to the Job Submission form.  This parameter only applies within
   other forms that call Reports (i.e. TTVDCAT).  Parameters 78 through 98 are available if expansion is targetted.
   Created spec and body for G$_BANNER_REPORT_EDITING and G$_BANNER_REPORT_PROCESSING (in association with mods
   to G$_SCT_RUN_REPORT); to be used for handing the processing of the special report value window.  This is found 
   in forms that pull in Object Group G$_BANNER_REPORT to call Reports.   
4. TGKinderman 10/07/2004
   Added role/pass logic into parm LIST inside G$_SCT_RUN_REPORT routine.
5. TGKinderman 10/27/2004
   Added to stub edits for Destination Format (G$_BANNER_REPORT_EDITING.EDIT_DESFORMAT and EDIT_OREP_ROW) to not
   allow POSTSCRIPT nor PRINTER DEFINITION at this time.
6. TGKinderman 11/17/2005
   Modified to set flag p_report_success to TRUE when inside else (for running ASYNC) of the G$_SCT_RUN_REPORT.
   This flag needs to be seen by the GJAPCTL form inorder to delete the gjbprun rows for given one_up_no.
  
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail70Goqorep()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail70Goqorep procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQOREP.AUDIT_TRAIL_5_0_GOQOREP
	/*
	PROCEDURE AUDIT_TRAIL_5_0_GOQOREP IS
<multilinecomment>
AUDIT TRAIL: 5.0
1. TGKinderman 06/13/2000
   Dev6.0 Upgrade.
2. BGourlie    07/18/2000
   Updated G$_PATHFINDER to search FORMS60_PATH and REPORTS60_PATH.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail50Goqorep()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail50Goqorep procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQOREP.AUDIT_TRAIL_4_0
	/*
	PROCEDURE AUDIT_TRAIL_4_0 IS
<multilinecomment>
AUDIT TRAIL: 4.0
1.  TAM 02/03/1999
    Genesis. This library perform the functions necessary to run an Oracle Report
    object through a Banner2000 form. It will load the banfw32.dll which performs
    the basic checksum operation on the .rep file the user wishes to run.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail40()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail40 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

}
