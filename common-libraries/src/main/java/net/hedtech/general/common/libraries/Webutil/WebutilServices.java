package net.hedtech.general.common.libraries.Webutil;



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




public class WebutilServices extends AbstractLibrary{
		
	public WebutilServices (LibraryConfiguration configuration,
			ISupportCodeContainer container, Hashtable sharedLibraries) {
		super(configuration, container, sharedLibraries);
	}
			
		
	// Attached Libraries
	/* package accessor */
	public WebutilUtil getWebutilUtil() 
	{
		return (WebutilUtil)getSupportCodeManager().getPackage("WEBUTIL_UTIL");
	}
	/* package accessor */
	public WebutilSession getWebutilSession() 
	{
		return (WebutilSession)getSupportCodeManager().getPackage("WEBUTIL_SESSION");
	}
	/* package accessor */
	public WebutilSeparateframe getWebutilSeparateframe() 
	{
		return (WebutilSeparateframe)getSupportCodeManager().getPackage("WEBUTIL_SEPARATEFRAME");
	}
	/* package accessor */
	public WebutilHost getWebutilHost() 
	{
		return (WebutilHost)getSupportCodeManager().getPackage("WEBUTIL_HOST");
	}
	/* package accessor */
	public WebutilFileTransfer getWebutilFileTransfer() 
	{
		return (WebutilFileTransfer)getSupportCodeManager().getPackage("WEBUTIL_FILE_TRANSFER");
	}
	/* package accessor */
	public WebutilFile getWebutilFile() 
	{
		return (WebutilFile)getSupportCodeManager().getPackage("WEBUTIL_FILE");
	}
	/* package accessor */
	public WebutilDbLocal getWebutilDbLocal() 
	{
		return (WebutilDbLocal)getSupportCodeManager().getPackage("WEBUTIL_DB_LOCAL");
	}
	/* package accessor */
	public WebutilCApi getWebutilCApi() 
	{
		return (WebutilCApi)getSupportCodeManager().getPackage("WEBUTIL_C_API");
	}
	/* package accessor */
	public WebutilCore getWebutilCore() 
	{
		return (WebutilCore)getSupportCodeManager().getPackage("WEBUTIL_CORE");
	}
	/* package accessor */
	public WebutilClientinfo getWebutilClientinfo() 
	{
		return (WebutilClientinfo)getSupportCodeManager().getPackage("WEBUTIL_CLIENTINFO");
	}
	/* package accessor */
	public WebutilBrowser getWebutilBrowser() 
	{
		return (WebutilBrowser)getSupportCodeManager().getPackage("WEBUTIL_BROWSER");
	}
	/* package accessor */
	public JavaSystem getJavaSystem() 
	{
		return (JavaSystem)getSupportCodeManager().getPackage("JAVA_SYSTEM");
	}
	/* package accessor */
	public JavaFile getJavaFile() 
	{
		return (JavaFile)getSupportCodeManager().getPackage("JAVA_FILE");
	}
	/* package accessor */
	public JavaException getJavaException() 
	{
		return (JavaException)getSupportCodeManager().getPackage("JAVA_EXCEPTION");
	}
	/* package accessor */
	public JavaAppservWriter getJavaAppservWriter() 
	{
		return (JavaAppservWriter)getSupportCodeManager().getPackage("JAVA_APPSERV_WRITER");
	}
	/* package accessor */
	public JavaAppservReader getJavaAppservReader() 
	{
		return (JavaAppservReader)getSupportCodeManager().getPackage("JAVA_APPSERV_READER");
	}
	/* package accessor */
	public Delimstr getDelimstr() 
	{
		return (Delimstr)getSupportCodeManager().getPackage("DELIMSTR");
	}
	/* package accessor */
	public ClientWinApiPreload getClientWinApiPreload() 
	{
		return (ClientWinApiPreload)getSupportCodeManager().getPackage("CLIENT_WIN_API_PRELOAD");
	}
	/* package accessor */
	public ClientWinApiEnvironment getClientWinApiEnvironment() 
	{
		return (ClientWinApiEnvironment)getSupportCodeManager().getPackage("CLIENT_WIN_API_ENVIRONMENT");
	}
	/* package accessor */
	public ClientWinApiDebug getClientWinApiDebug() 
	{
		return (ClientWinApiDebug)getSupportCodeManager().getPackage("CLIENT_WIN_API_DEBUG");
	}
	/* package accessor */
	public ClientWinApi getClientWinApi() 
	{
		return (ClientWinApi)getSupportCodeManager().getPackage("CLIENT_WIN_API");
	}
	/* package accessor */
	public ClientToolEnv getClientToolEnv() 
	{
		return (ClientToolEnv)getSupportCodeManager().getPackage("CLIENT_TOOL_ENV");
	}
	/* package accessor */
	public ClientTextIo getClientTextIo() 
	{
		return (ClientTextIo)getSupportCodeManager().getPackage("CLIENT_TEXT_IO");
	}
	/* package accessor */
	public ClientOle2 getClientOle2() 
	{
		return (ClientOle2)getSupportCodeManager().getPackage("CLIENT_OLE2");
	}
	/* package accessor */
	public ClientImage getClientImage() 
	{
		return (ClientImage)getSupportCodeManager().getPackage("CLIENT_IMAGE");
	}
	
	//Original PL/SQL code for Prog Unit WEBUTIL.SHOW_WEBUTIL_INFORMATION
	/*
	PROCEDURE SHOW_WEBUTIL_INFORMATION(display in BOOLEAN default TRUE) IS
<multilinecomment>********************************************************************************\
 * SHOW_WEBUTIL_INFORMATION
 *   Causes the WebUtil Hidden Window to display and gives access to the version 
 *   numbers of each of the components
 *   Setting the display argument to false hides the window again
 *********************************************************************************
 * Version 1.0.0
 *********************************************************************************
 * Change History
 *   DRMILLS 26/FEB/2003 - Creation
 *
\********************************************************************************</multilinecomment> 
BEGIN
  WebUtil_Core.ShowBeans(display);
END;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void showWebutilInformation() {
			showWebutilInformation(toBool(NBool.True));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param display
		*/
		public void showWebutilInformation(NBool display)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			getWebutilcore().showbeans(display);
//
			this.getLogger().trace(this, "F2J : showWebutilInformation procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit WEBUTIL.CLIENT_HOST
	/*
	PROCEDURE CLIENT_HOST(syscmd Varchar2, kwd Number default NULL) IS
<multilinecomment>********************************************************************************\
 * CLIENT_HOST
 *   This procedure duplicates the action of the HOST Built-in, except that it 
 *   operates on the client (browser) tier rather than the Applcation server tier.  
 *   Existing HOST code  can be re-directed to run on the client simply by 
 *   prefixing all the calls with "CLIENT_" 
 *   The oracle.forms.webutil.host.HostFunctions bean is needed in your 
 *   Form to use these functions
 *   Note 1) This version (like client server) is Blocking and will prevent
 *   re-draw of the Forms Screen whilst the Host command is active 
 *   Note 2) The kwd argument (e.g. NO_SCREEN etc) is ignored 
 *
 *   For more flexible "Host" commands see the WEBUTIL_HOST package
 *   That has facilities for Asynchronous callbacks and return codes
 *********************************************************************************
 * Version 1.0.0
 *********************************************************************************
 * Change History
 *   1.0.0 DRMILLS 03/JAN/2003 - Creation 
 *
\********************************************************************************</multilinecomment>
BEGIN
  -- simply call through the to WEBUTIL_HOST.HOST() Function
  if WEBUTIL_HOST.HOST(syscmd) <> 0 then 
    raise form_trigger_failure;
  end if;
END CLIENT_HOST;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param syscmd
		*/
		public void clientHost(NString syscmd) {
			clientHost(syscmd, NNumber.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param syscmd
		* @param kwd
		*/
		public void clientHost(NString syscmd, NNumber kwd)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  simply call through the to WEBUTIL_HOST.HOST() Function
//			if ( getWebutilhost().host(syscmd).notEquals(0) )
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : clientHost procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

	//Original PL/SQL code for Prog Unit WEBUTIL.CLIENT_GET_FILE_NAME
	/*
	FUNCTION CLIENT_GET_FILE_NAME (directory_name Varchar2 := NULL,
                               file_name      Varchar2 := NULL,
                               file_filter    Varchar2 := NULL,
                               message        Varchar2 := NULL,
                               dialog_type    Number   := OPEN_FILE,
                               select_file    Boolean  := TRUE) return Varchar2 is                              
<multilinecomment>********************************************************************************\
 * CLIENT_GET_FILE_NAME
 *   Client (Browser) side implementation of the standard GET_FILE_NAME Built-in
 *   Used to display File Open, Save  and directory listing dialogs
 *   Implemented using calls to WEBUTIL_FILE
 *********************************************************************************
 * Version 1.0.0
 *********************************************************************************
 * Change History
 *   1.0.0 DRMILLS 23/DEC/2002 - Creation
 *
\********************************************************************************</multilinecomment> 

BEGIN
  RETURN WEBUTIL_FILE.FILE_SELECTION_DIALOG( directory_name,
                                             file_name,
                                             file_filter,
                                             message,
                                             dialog_type,
                                             select_file);
END CLIENT_GET_FILE_NAME;
	*/
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString clientGetFileName() {
			return clientGetFileName(NString.getNull(), NString.getNull(), NString.getNull(), NString.getNull(), SupportClasses.Constants.OPEN_FILE, toBool(NBool.True));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		*/
		public NString clientGetFileName(NString directoryName) {
			return clientGetFileName(directoryName, NString.getNull(), NString.getNull(), NString.getNull(), SupportClasses.Constants.OPEN_FILE, toBool(NBool.True));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		*/
		public NString clientGetFileName(NString directoryName, NString fileName) {
			return clientGetFileName(directoryName, fileName, NString.getNull(), NString.getNull(), SupportClasses.Constants.OPEN_FILE, toBool(NBool.True));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		* @param fileFilter
		*/
		public NString clientGetFileName(NString directoryName, NString fileName, NString fileFilter) {
			return clientGetFileName(directoryName, fileName, fileFilter, NString.getNull(), SupportClasses.Constants.OPEN_FILE, toBool(NBool.True));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		* @param fileFilter
		* @param message
		*/
		public NString clientGetFileName(NString directoryName, NString fileName, NString fileFilter, NString message) {
			return clientGetFileName(directoryName, fileName, fileFilter, message, SupportClasses.Constants.OPEN_FILE, toBool(NBool.True));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		* @param fileFilter
		* @param message
		* @param dialogType
		*/
		public NString clientGetFileName(NString directoryName, NString fileName, NString fileFilter, NString message, NNumber dialogType) {
			return clientGetFileName(directoryName, fileName, fileFilter, message, dialogType, toBool(NBool.True));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param directoryName
		* @param fileName
		* @param fileFilter
		* @param message
		* @param dialogType
		* @param selectFile
		*/
		public NString clientGetFileName(NString directoryName, NString fileName, NString fileFilter, NString message, NNumber dialogType, NBool selectFile)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return getWebutilfile().fileSelectionDialog(directoryName, fileName, fileFilter, message, dialogType, selectFile);
//
			this.getLogger().trace(this, "F2J : clientGetFileName function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}

	//Original PL/SQL code for Prog Unit WEBUTIL.AUDIT_TRAIL_8_5_1_4_GOQRPLS
	/*
	PROCEDURE AUDIT_TRAIL_8_5_1_4_GOQRPLS IS
<multilinecomment>
AUDIT TRAIL: 8.5.1.4
1. TGKinderman 08/22/2012
   NOT TO BE DELIVERED.
   
   This audit trail entry needed in order to get MKS to accept this object into our MKS files system.
     
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
		public void auditTrail8514Goqrpls()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//
			this.getLogger().trace(this, "F2J : auditTrail8514Goqrpls procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}

}
