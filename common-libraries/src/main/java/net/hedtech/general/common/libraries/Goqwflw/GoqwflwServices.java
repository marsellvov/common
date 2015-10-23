package net.hedtech.general.common.libraries.Goqwflw;



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
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;


public class GoqwflwServices extends AbstractLibrary{
		
	public GoqwflwServices (LibraryConfiguration configuration,
			ISupportCodeContainer container, Hashtable sharedLibraries) {
		super(configuration, container, sharedLibraries);
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
	/* package accessor */
	public GWfWaitForWork getGWfWaitForWork() 
	{
		return (GWfWaitForWork)getSupportCodeManager().getPackage("G$_WF_WAIT_FOR_WORK");
	}
	/* package accessor */
	public GWfSetFocus getGWfSetFocus() 
	{
		return (GWfSetFocus)getSupportCodeManager().getPackage("G$_WF_SET_FOCUS");
	}
	/* package accessor */
	public GWfRecgrp getGWfRecgrp() 
	{
		return (GWfRecgrp)getSupportCodeManager().getPackage("G$_WF_RECGRP");
	}
	/* package accessor */
	public GWfLogging getGWfLogging() 
	{
		return (GWfLogging)getSupportCodeManager().getPackage("G$_WF_LOGGING");
	}
	/* package accessor */
	public GWfIcons getGWfIcons() 
	{
		return (GWfIcons)getSupportCodeManager().getPackage("G$_WF_ICONS");
	}
	/* package accessor */
	public GWfHeader getGWfHeader() 
	{
		return (GWfHeader)getSupportCodeManager().getPackage("G$_WF_HEADER");
	}
	/* package accessor */
	public GWfError getGWfError() 
	{
		return (GWfError)getSupportCodeManager().getPackage("G$_WF_ERROR");
	}
	/* package accessor */
	public GWfDriver getGWfDriver() 
	{
		return (GWfDriver)getSupportCodeManager().getPackage("G$_WF_DRIVER");
	}
	/* package accessor */
	public GWfDelimitedString getGWfDelimitedString() 
	{
		return (GWfDelimitedString)getSupportCodeManager().getPackage("G$_WF_DELIMITED_STRING");
	}
	/* package accessor */
	public GWfControlKeyItms getGWfControlKeyItms() 
	{
		return (GWfControlKeyItms)getSupportCodeManager().getPackage("G$_WF_CONTROL_KEY_ITMS");
	}
	/* package accessor */
	public GWfControlForm getGWfControlForm() 
	{
		return (GWfControlForm)getSupportCodeManager().getPackage("G$_WF_CONTROL_FORM");
	}
	/* package accessor */
	public GWfContextValidate getGWfContextValidate() 
	{
		return (GWfContextValidate)getSupportCodeManager().getPackage("G$_WF_CONTEXT_VALIDATE");
	}
	/* package accessor */
	public GWfContextProcessOut getGWfContextProcessOut() 
	{
		return (GWfContextProcessOut)getSupportCodeManager().getPackage("G$_WF_CONTEXT_PROCESS_OUT");
	}
	/* package accessor */
	public GWfContextProcessIn getGWfContextProcessIn() 
	{
		return (GWfContextProcessIn)getSupportCodeManager().getPackage("G$_WF_CONTEXT_PROCESS_IN");
	}
	/* package accessor */
	public GWfConditions getGWfConditions() 
	{
		return (GWfConditions)getSupportCodeManager().getPackage("G$_WF_CONDITIONS");
	}
	/* package accessor */
	public GWfBa getGWfBa() 
	{
		return (GWfBa)getSupportCodeManager().getPackage("G$_WF_BA");
	}
	/* package accessor */
	public Exception_ getException_() 
	{
		return (Exception_)getSupportCodeManager().getPackage("EXCEPTION_");
	}
	/* package accessor */
	public Credentialclient getCredentialclient() 
	{
		return (Credentialclient)getSupportCodeManager().getPackage("CREDENTIALCLIENT");
	}
	/* package accessor */
	public Credential getCredential() 
	{
		return (Credential)getSupportCodeManager().getPackage("CREDENTIAL");
	}
	
	//Original PL/SQL code for Prog Unit GOQWFLW.G$_IAM_GET_CREDENTIALS
	/*
	PROCEDURE G$_IAM_GET_CREDENTIALS(p_ticket   IN  VARCHAR2,
                                 p_app_name OUT VARCHAR2,
                                 p_user     OUT VARCHAR2,
                                 p_pswd     OUT VARCHAR2,
                                 p_app_conn OUT VARCHAR2) IS
  -- Java objects reference for:
  --     CredentialClient
  --     Credential
  --     java.lang.Exception
  lv_cred_client      ora_java.jobject;
  lv_cred             ora_java.jobject;
  ex                  ora_java.jobject;
  
BEGIN
  -- Create a reference to the CredentialClient class
  lv_cred_client := CredentialClient.new;

  -- Call the CredentialClient.getCredential method passing
  -- the ticket string parameter and returning the Credential object.
  lv_cred := CredentialClient.getCredential( lv_cred_client, p_ticket);

  -- retrieve the application_name, user_id, password
  -- and app_connection_string from the credential
  p_app_name := Credential.getApplicationName(lv_cred);
  p_user     := Credential.getUserId(lv_cred);
  p_pswd     := Credential.getPassword(lv_cred);
  p_app_conn := Credential.getApplicationConnection(lv_cred);
EXCEPTION
  WHEN ORA_JAVA.JAVA_ERROR THEN
    MESSAGE('*ERROR* Unable to call out to Java, ' ||ORA_JAVA.LAST_ERROR);
    ORA_JAVA.CLEAR_ERROR;
  WHEN ORA_JAVA.EXCEPTION_THROWN THEN
    ex := ORA_JAVA.LAST_EXCEPTION;
    MESSAGE(Exception_.toString(ex));
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pTicket
		* @param pAppName
		* @param pUser
		* @param pPswd
		* @param pAppConn
		*/
		public void gIamGetCredentials(NString pTicket, Ref<NString> pAppName, Ref<NString> pUser, Ref<NString> pPswd, Ref<NString> pAppConn)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  Java objects reference for:
//			//      CredentialClient
//			//      Credential
//			//      java.lang.Exception
//			UnknownTypes.OraJavaJobject lvCredClient= null;
//			UnknownTypes.OraJavaJobject lvCred= null;
//			UnknownTypes.OraJavaJobject ex= null;
//			try
//			{
//				//  Create a reference to the CredentialClient class
//				lvCredClient = Credentialclient._new;
//				//  Call the CredentialClient.getCredential method passing
//				//  the ticket string parameter and returning the Credential object.
//				lvCred = getCredentialclient().getcredential(lvCredClient, pTicket);
//				//  retrieve the application_name, user_id, password
//				//  and app_connection_string from the credential
//				pAppName.val = getCredential().getapplicationname(lvCred);
//				pUser.val = getCredential().getuserid(lvCred);
//				pPswd.val = getCredential().getpassword(lvCred);
//				pAppConn.val = getCredential().getapplicationconnection(lvCred);
//			}
//			catch(Exception e)
//			{
//				// F2J_NOT_SUPPORTED : Call to built-in "LAST_ERROR" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
//				//				message(toStr("*ERROR* Unable to call out to Java, ").append(SupportClasses.ORA_JAVA.LastError()));
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'LAST_ERROR' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
//				
//				// F2J_NOT_SUPPORTED : Call to built-in "CLEAR_ERROR" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
//				//				SupportClasses.ORA_JAVA.ClearError();
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'CLEAR_ERROR' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
//				
//			}
//			catch(Exception e)
//			{
//				// F2J_NOT_SUPPORTED : Call to built-in "LAST_EXCEPTION" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
//				//				ex = SupportClasses.ORA_JAVA.LastException();
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'LAST_EXCEPTION' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\GOQWFLWF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
//				
//				message(getException_().tostring(ex));
//			}
//
			this.getLogger().trace(this, "F2J : gIamGetCredentials procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQWFLW.COPYRIGHT_GOQWFLW
	/*
	PROCEDURE COPYRIGHT_GOQWFLW IS
<multilinecomment>
  Copyright 1999-2012 Ellucian.
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void copyrightGoqwflw()
		{
			this.getLogger().trace(this, "F2J : copyrightGoqwflw procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQWFLW.AUDIT_TRAIL_NLS_DATE_SUPPORT
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
		}

	//Original PL/SQL code for Prog Unit GOQWFLW.AUDIT_TRAIL_MSGKEY_UPDATE
	/*
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : GOQWFLW
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Mon Aug 13 14:56:43 2012
-- MSGSIGN : #f42037c05af51d3f
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

	//Original PL/SQL code for Prog Unit GOQWFLW.AUDIT_TRAIL_8_5_2
	/*
	PROCEDURE AUDIT_TRAIL_8_5_2 IS
<multilinecomment>
AUDIT TRAIL: 8.5.2
1. Defect 1-15GS97Z 
   LVH 08/08/2012
   Modfied PERFORM_DEFAULT_LOGON to ensure that no invalid characters were used in a new password forced by an expired
   password change during login. If the account has expired, they will be presented the same Oracle pop-up asking them to 
   enter a new password. After they do that, it will verify that the new password passes the Banner password validation tests, 
   and if not then it will re-expire the account, and force them to login in again using the password that they just changed 
   it to and then change it to a valid password. They will see: '*ERROR* Unsupported character detected in the new password. 
   Please re-login using your new password but changing it to a valid one.'

   Since Oracle is forcing the change we cannot intercept it before Oracle does.
   
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
		public void auditTrail852()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail852 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQWFLW.AUDIT_TRAIL_8_4_1
	/*
	PROCEDURE AUDIT_TRAIL_8_4_1 IS
<multilinecomment>
AUDIT TRAIL: 8.4.1
1. RPE 1-HNVO97 
   TGKinderman 02/08/2011
   Modify the SET_MENU_ITEM_PROPERTY statement in procedure G$_WF_CONTROL_FORM.WF_CONTROL_ENTRY that sets the label on ICONS.VPDI_EXISTS
   from "Multi-Insitution not enabled" to "Multi-Entity Processing not enabled" such that tooltip reflects these values.  Terminology has
   changed from Multi-Institution to Mulit-Entity.
     
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
		public void auditTrail841()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail841 procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit GOQWFLW.AUDIT_TRAIL_8_3_0_2
	/*
	PROCEDURE AUDIT_TRAIL_8_3_0_2 IS
<multilinecomment>

AUDIT TRAIL: 8.3.0.2
1. Defect 1-AX7CH7
   LVH 02/18/2010
   Internationalized error messages
 
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
		public void auditTrail8302()
		{
		}

	//Original PL/SQL code for Prog Unit GOQWFLW.AUDIT_TRAIL_8_0
	/*
	PROCEDURE AUDIT_TRAIL_8_0 IS
<multilinecomment>

AUDIT TRAIL: 8.0
1. TGKinderman     10/17/2007
   Set :GLOBAL.WF_SUBMIT_EXIT_IND in GOQWFLW.G$_WF_CONTROL_FORM.WF_SUBMIT in support of presenting a
   Warning Alert when exiting a form and you are in a form that is part of a Workflow activity.  Valuing the global
   in this routine will suppress the Warning Alert when exiting the form as part of performing a Workflow submit.
2. TGKinderman     10/26/2007
   Modify WF_WAIT_FOR_WORK.WF_INIT_GLOBALS and WF_PERFORM_AUTO_LOGON.  Establish GLOBAL.IAMTICKET to accept from
   GUAINIT parameter.IAMTICKET if being passed an IAMTicket for SSO credentials.  If valued will be used for
   connecting to the Banner
3. TGKinderman     11/07/2007
   Additional modifications for IAM.  Based upon the baniam.jar file (developed and delivered with the 8.0 release),
   import com.sungardhe.forms.ssoclient.Credential, com.sungardhe.forms.ssoclient.CredentialClient and
   java.lang.Exception.  Modify WF_PERFORM_AUTO_LOGON to call G$_IAM_GET_CREDENTIALS.  IAMTICKET is input. app, user
   pswd and appConnectstring are output.
4. George Shalovka  09 November 2007
   As part of de-supporting Electronic Documents module, removed references to
   GOQWFED. This included commenting out code in Program Units 
   G$_WF_HEADER (Package Spec), G$_WF_DRIVER (Package Body) and G$_WF_CONTROL_FORM (Package Body).
 
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
		public void auditTrail80()
		{
		}

	//Original PL/SQL code for Prog Unit GOQWFLW.AUDIT_TRAIL_7_0
	/*
	PROCEDURE AUDIT_TRAIL_7_0 IS
<multilinecomment>
AUDIT TRAIL: 7.0
1. RDR 06/18/2004
   Updated for Banner 7.0
2. RGM 08/18/2004
   Added Dynamic calls to Workflow specific packages to allow libary to be
   compile in environments that have not been integrated.
3. RGM 08/19/2004
   Removed calls to enable to WF Electronic document in the Workflow tools
   menu, since this is not functionality of our product.  Steve Quigley will
   make changes to remove the menu item.
4. RDR 10/14/2004
   Updated file to address changes in GOAMTCH.

AUDIT TRAIL: 7.2
1.  SJQ 06/14/2005
    Replace all local calls to any DBMS_* packages with calls to the GOKDBMS package.  This is to
    remove all direct calls to these packages as this is a recommendation from Oracle and causes 
    problems in some environments.
2.  SJQ 08/01/2005
    Update the PUTDATE, PUT, GETDATE, LOCATE, G$_WF_HEADER, and WRITE_DATA logic to implement the 
    I18N standards.
3.  SJQ 08/24/2005
    Update the syntax for the gokdbms changes.  The building of the strings was not including 
    the needed quotes around the returned values from local functions.  Enlarged some of the
    local variables used to store the dynamic sql strings.
    
AUDIT TRAIL: 7.3
    Michael Hitrik 01/24/2006
    VPDI Support
    
1.  Modified G$_WF_WAIT_FOR_WORK.WF_INIT_GLOBALS Procedure
    Added a new Global GLOBAL.WF_VPDI_HOME_CODE
2.  Modified WF_PERFORM_AUTO_LOGON Procedure to include the logic to handle MIF Parameters
3.  Modified G$_WF_BA.GET_WORK Procedure
    Added new call to WFIKWIBC.get_workitem_queue with VPDI Parameter
    Added new vpdiCodeNotMatch Exception
4.  SJQ 03/16/2006
    Rewrite the G$_WF_DRIVER package body to replace the large IF..ELSIF.. logic with a CASE 
    statement for performance improvements.  Modify the G$_WF_LOGGING to use a local variable
    for the value obtained from the GLOBAL.OS_IND instead of having to repeatedly execute a NAME_IN
    command of the global.
5.  SJQ 03/20/2006
    Modify the G$_WF_LOGGING.WRITE_DATA routine to add an exception handler to catch references to
    the SYSDATE function.  If a log file name is set, the logging logic, is executed by several
    routines prior to the user ever getting connected to the database.  The references to the 
    SYSDATE function thus is invalid and generates errors and prevents the actualy logging of those 
    routines.  Updated the G$_WF_LOGGING package to make the logic a little smarter about when to
    log and when not to.

AUDIT TRAIL: 7.4
    Michael Hitrik 09/06/2006
    VPDI Support
    
1.  Michael Hitrik 09/06/2006
    Modified G$_WF_WAIT_FOR_WORK.WF_INIT_GLOBALS Procedure
    Added a new Global GLOBAL.WF_VPDI_ON to support the check of the missing value for
    VPD parameter passed from Wokflow into GUAINIT form during the start-up.
2.  TGKinderman    10/09/2006
    Modify G$_WF_CONTROL_FORM.WF_CONTROL_ENTRY towards the end of this routine to set the ICONS.VPDI_EXISTS
    iconic button disbaled and label to "Mulit-institution not enabled" if the form being displayed has been
    through a Banner session launched from Workflow.
3.  TGKinderman    10/11/2006
    Branding modifications on messages in G$_WF_WAIT_FOR_WORK

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
		public void auditTrail70()
		{
		}

	//Original PL/SQL code for Prog Unit GOQWFLW.AUDIT_TRAIL_5_0_GOQWFLW
	/*
	PROCEDURE AUDIT_TRAIL_5_0_GOQWFLW IS
<multilinecomment>
AUDIT TRAIL: 5.0
1. TGKinderman 06/13/2000
   Dev6.0 Upgrade.
2. RGMoyer 06/11/2003
   Modified COPY_INPUT_VALS_INTO_KEY_ITMS to log an error instead of create an
   exception when a parameter value was written to a field that does not accept
   input.
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
		public void auditTrail50Goqwflw()
		{
		}

	//Original PL/SQL code for Prog Unit GOQWFLW.AUDIT_TRAIL_5_0
	/*
	PROCEDURE AUDIT_TRAIL_5_0 IS
<multilinecomment>
AUDIT TRAIL: 5.0
1. MVS 07/31/2000
   (a) Added the functions GET_USERID and GET_PASSWORD to the G$_WF_BA package to
       enable the retrieval of a user's userid and password with which to logon
       to Banner2000 from Workflow.
   (b) Added the function ENV_SUPPORTS_WINDOW_CONTROL to the G$_WF_CONDITIONS package
       to enable the Web to be treated as a Workflow-supported environment that
       nevertheless does not support control of window properties.
   (c) Added the function IS_ACTIONQUEUE_IOR_SET to the G$_WF_CONDITIONS package to
       enable the determination of whether communication between Workflow and
       Banner2000 has been established.
   (d) Added the procedure WF_SET_ACTIONQUEUE_IOR and DECLARE_ACTIONQUEUE_IOR_AS_SET
       to the G$_WF_WAIT_FOR_WORK package to consolidate all of the logic that
       establishes communication with Workflow under the proper conditions
       into one public and one private subprogram that can be executed before
       logon to Banner2000 even takes place.
   (e) Added the procedure WF_PERFORM_AUTO_LOGON and PERFORM_DEFAULT_LOGON to
       the G$_WF_WAIT_FOR_WORK package to enable automatic logon into a Banner2000
       session by retrieving a user's userid and password from Workflow if no
       userid is specified.  If a userid is specified, the default logon processing
       will take place.
   (f) Applied changes to the following subprograms, as documented within each,
       to support the updates described in parts (a) through (e) above:
       
       G$_WF_CONDITIONS.IS_MENU_FORM
       G$_WF_CONDITIONS.IS_WF_SUPPORTED_ENV
       
       G$_WF_DRIVER.WF_EXECUTE
       G$_WF_DRIVER package initialization section
       
       G$_WF_ERROR.WF_CAPTURE_CURRENT_STATE
       
       G$_WF_HEADER package specification
       
       G$_WF_SET_FOCUS public subprogram bodies
                       and package initialization section
       
       G$_WF_WAIT_FOR_WORK.WF_INIT_GLOBALS
       G$_WF_WAIT_FOR_WORK.WF_MAKE_TIMER
2. MVS 08/30/2000
   (a) Modified the procedure G$_WF_WAIT_FOR_WORK.WF_PERFORM_AUTO_LOGON 
       to only attempt to retrieve a user's userid and password from Workflow
       if the current environment is a Web environment.
   (b) Modified the package initialization section of G$_WF_BA to only
       register the functions GET_USERID and GET_PASSWORD if the current
       environment is a Web environment, as that is the only environment
       in which they will be invoked. 
3.  SJQ 10/16/2000
    Changed the value of TIME_INTERVAL in WF_HEADER from 1000 to 3000.  This is
    the amount of time that the work flow timer waits before expiring.  This is
    being done to try and address some strange behavior within forms.  Also, change
    all Banner2000 references to Banner.
4. JGA 03/28/2002
   (a) Modified most of the G$_WF_BA package to use a stored procedure WFIKWIBC.
   (b) Changes enabling the comunication to Workflow 3.0 through a stored procedure
   		 using UTL_HTTP and also retrieving items from a database.
   (c) Changed the use of the argument WF_ACTIONQUE_IOR to be WF_ARGS, an argument containing
       a '|' delimited string of all arguments the workflow may need. Though WF_ACTIONQUE_IOR
       has been deprecated, this pll file will attempt to use that argument when WF_ARGS is not available,
       i. e.  When older versions of Banner and the GUAINIT file are used that do not have the WF_ARGS Parameter.
   (d) Added new single sign on from Banner using WFCKGSSO package.  Procedure get_SSO is called from a user owning the package
   		 that has access to GUAINIT.  This user is temporarily logged in to call get_SSO which returns the real username/password
   		 that we then log in with.
   (e) Added abillity for Workflow to send Banner the Database TNS_NAME that we want to login to. In the past Workflow
   		 relied on the LOCAL environment variable to be set.  Now, if the WF_BANNER_CONNECTION arg is part of the WF_ARGS parameter
   		 Banner will login to that DB.  Otherwise it will use the LOCAL VARIABLE.
   (f) Changed any use of VC++ DLL file.  All is done through WFIKWIBC and though a queue table the package uses, WFITWIQU.	 
4. JGA 04/11/2002
   (a) Modified G$_BA.release_task and G$_BA.declare_work_complete to also clear GLOBAL.ACTIVITY_NAME so it will not show up on form after Workflow released or completed.
   (b) On G$_WAIT_FOR_WORK.WF_DISCONNECT_B2K call a WFIKWIBC cleanup routine.

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
		public void auditTrail50()
		{
		}

	//Original PL/SQL code for Prog Unit GOQWFLW.AUDIT_TRAIL_4_0
	/*
	PROCEDURE AUDIT_TRAIL_4_0 IS
<multilinecomment>
AUDIT TRAIL: 4.0
1. MVS 05/20/1999
   The GOQWFLW library has been created to serve as a single repository
   for all baseline, cross-product Workflow functionality that will
   be available to Banner2000 clients when they install the Workflow
   product.

   This library has been attached to every form that can be called
   at runtime in Banner2000 so that the required Workflow functionality
   can be accessed within each form.   

   The version of the GOQWFLW library that has been delivered with the
   4.0 release does not contain any Workflow functions with the exception
   of a single G$_WF_DRIVER package that performs no action.  When the
   Workflow product is made available, this library will be replaced
   with the "live" library that contains all of the requisite functions
   for Workflow.
AUDIT TRAIL: 4.1
1. MVS 01/04/2000
   Modify the G$_WF_DRIVER package and add new packages to provide
   the cross-product functionality required by forms which are launched
   from Workflow as a workflow task or activity.
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
}
}
