package net.hedtech.general.common.libraries.Webutil;

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


public class WebutilCore extends AbstractSupportCodeObject {
	

	public WebutilCore(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) WEBUTIL_CORE
	/*
	PACKAGE WEBUTIL_CORE IS
<multilinecomment>********************************************************************************\
 * WEBUTIL_CORE
 *   This Package contains core WebUtil Routines.
 *   In general you should not call methods in this package directly unless
 *   you are actually extending the WebUtil utility as a whole
 *   Do not make changes in the package unless you are adding 
 *   You own functions - in which case make sure you read about how to 
 *   extend WebUtil in the doc.
 *********************************************************************************
 * Version 1.0.9
 *********************************************************************************
 * Change History
 * 1.0.0  DRMILLS 01/NOV/2002 - Creation & Registering of Core, File and ClientInfo
 * 1.0.1  DRMILLS 24/JAN/2003 - Made Alert handling more robust and added self 
 *                              initialisation in the form of InitWebUtil proc.
 *                              Added WUL contants and packages for ORA_FFI interface.
 * 1.0.2  DRMILLS 28/JAN/2003 - Added the Callback trigger list functionality for 
 *                              WEBUTIL_HOST
 *                              Added the new calls Get/SetClientSetting() to 
 *                              persist information on the client machine in 
 *                              webutil.properties
 *                              Added downloadFromURL() to push things like 
 *                              DLLs onto the client machine
 * 1.0.3  DRMILLS 31/JAN/2003 - Added routines PersistReference() and 
 *                              FreeReference() to handle cross-Form/Session 
 *                              object persistance
 * 1.0.4  DRMILLS 10/FEB/2003 - Added error() to allow non-client side
 *                              routines to set the error info and pop up an
 *                              alert all in one function
 * 1.0.5  DRMILLS 21/FEB/2003 - Added support for auto download of user libraries 
 * 1.0.6  DRMILLS 12/MAR/2003 - Fixed 2839033 now only handle WebUtil events
 *                              Fixed the timing issue in 2836929
 *                              Moved CheckJava into this package from file 
 *                              transfer and made it more comprehensive
 *                              so that it actually checks that the frmwebutil.jar
 *                              is were the classpath says it is.  This will help 
 *                              to detect typos in the classpath
 * 1.0.7  DRMILLS 13/MAY/2003 - Fixed 2955789 navigation to instanciate the 
 *                              webutil block was causing a problem in 
 *                              Enter-Query mode 
 *                              Added the Flag FLAG_EXPICIT_INSTANCIATE to 
 *                              allow explicit instanciation if it's really 
 *                              needed.
 *                              Added the INIT procedure for the other WebUtil 
 *                              Programs to explicitly invoke Core to instanciate 
 *                              rather than just relying on ad-hoc references 
 *                              to do the calls.
 * 1.0.8 DRMILLS 25/MAY/2003  - Added the Browser functions WUB implementation class
 *                              package 6
 * 1.0.9 DRMILLS 03/JUN/2003  - Fixed a problem with Host callbacks not being
 *                              processed due to typo on the event handler
\********************************************************************************</multilinecomment>
  <multilinecomment>*
   * The PLL Version as a whole
   </multilinecomment>
   WEBUTIL_VERSION VARCHAR2(30);

  <multilinecomment>*
   * Constants used throughout webutil
   </multilinecomment>
   WUC_PACKAGE CONSTANT PLS_INTEGER := 0;
   WUT_PACKAGE CONSTANT PLS_INTEGER := 1;
   WUF_PACKAGE CONSTANT PLS_INTEGER := 2;
   WUI_PACKAGE CONSTANT PLS_INTEGER := 3;
   WUH_PACKAGE CONSTANT PLS_INTEGER := 4;
   WUS_PACKAGE CONSTANT PLS_INTEGER := 5;   
   WUB_PACKAGE CONSTANT PLS_INTEGER := 6;
   WUO_PACKAGE CONSTANT PLS_INTEGER := 7;
   WUU_PACKAGE CONSTANT PLS_INTEGER := 8;
   WUL_PACKAGE CONSTANT PLS_INTEGER := 9;   
   
  <multilinecomment>*
   * Hold a list of constants for the O/S family
   </multilinecomment>
  CLIENT_PLATFORM_WIN32   CONSTANT PLS_INTEGER := 0;
  CLIENT_PLATFORM_LINUX   CONSTANT PLS_INTEGER := 1;
  CLIENT_PLATFORM_SOLARIS CONSTANT PLS_INTEGER := 2;
  CLIENT_PLATFORM_HP      CONSTANT PLS_INTEGER := 3;  
  CLIENT_PLATFORM_AIX     CONSTANT PLS_INTEGER := 4;  
  CLIENT_PLATFORM_MAC     CONSTANT PLS_INTEGER := 5;
  CLIENT_PLATFORM_UNKNOWN CONSTANT PLS_INTEGER := 9;   
  
  <multilinecomment>* 
   * Important Objects 
   </multilinecomment>
  WEBUTIL_CONFIG_PARAM    CONSTANT VARCHAR2(23) := 'PARAMETER.WEBUTILCONFIG';
  WEBUTIL_CONFIG_GLOBAL   CONSTANT VARCHAR2(20) := 'GLOBAL.WEBUTILCONFIG';      
  WEBUTIL_CONFIG_ENV      CONSTANT VARCHAR2(20) := 'WEBUTIL_CONFIG';       
  
   
  <multilinecomment>*
   * Exceptions
   </multilinecomment>
  BEAN_NOT_REGISTERED EXCEPTION;
  PROPERTY_ERROR      EXCEPTION;
  UNEXPECTED_ERROR    EXCEPTION;    
  
  <multilinecomment>*
   * Special Flags - the following switches change the behaviour of the utility in 
   * Some way - you may be asked by support to set these.
   * If these are defined as CONSTANT they will need to be set here in the code rather than from 
   * some calling procedure 
   </multilinecomment>
  -- If this flag is set, the first call to WebUtil will navigate to the 
  -- WebUtil block to ensure that the PJCs on the client have all been created.
  -- Normally Forms will handle this without the navigation being required.
  -- Setting this flag will have side effects see Bug 2955789 
  FLAG_EXPICIT_INSTANCIATE CONSTANT BOOLEAN := FALSE;

  -- Error code from last setProperty or getProperty with bypassErrorCheck := false
  m_lastError     PLS_INTEGER := 0;

  <multilinecomment>*
   * Core procedures
   </multilinecomment> 
   
  <multilinecomment>*
   * CustomEventHandler - used from the When-Custom-Item-Event trigger 
   * of all the webutil beans
   * Handles all of the messages that those beans can raise
   </multilinecomment> 
  PROCEDURE CustomEventHandler(EventName in VARCHAR2, EventParameters in VARCHAR2);  

  <multilinecomment>*
   * SetProperty - Wrapper for SET_CUSTOM_PROPERTY - has the 
   * advantage that you don't have to worry about which item 
   * to set the property on as the registration process will 
   * implicitly know which item to use 
   * If the SetProperty fails then PROPERTY_ERROR will 
   * be raised
   </multilinecomment> 
  PROCEDURE SetProperty(packageID        in PLS_INTEGER, 
                        propertyName     in VARCHAR2, 
                        propertyValue    in VARCHAR2,
                        bypassErrorCheck in BOOLEAN DEFAULT true);

  PROCEDURE SetProperty(packageID        in PLS_INTEGER, 
                        propertyName     in VARCHAR2, 
                        propertyValue    in BOOLEAN,
                        bypassErrorCheck in BOOLEAN DEFAULT true);                                                

  <multilinecomment>*
   * GetProperty - Wrapper for GET_CUSTOM_PROPERTY - has the 
   * advantage that you don't have to worry about which item 
   * to set the property on as the registration process will 
   * implicitly know which item to use 
   * Returns the value of the requested property or null
   </multilinecomment> 
  FUNCTION GetProperty(packageID in PLS_INTEGER, 
                       propertyName in VARCHAR2,
                       bypassErrorCheck in BOOLEAN DEFAULT true) return VARCHAR2;
                       
                       
  <multilinecomment>*
   * GetClientSetting - queries the value in the webutil.properties
   * file on the client used for system settings such as DLL versions
   * but also available for personalisation
   </multilinecomment>                       
  FUNCTION GetClientSetting(propertyName in VARCHAR2) return VARCHAR2;

  <multilinecomment>*
   * SetClientSetting - sets a value in the webutil.properties
   * file on the client used for system settings such as DLL versions
   * but also available for personalisation
   </multilinecomment>                       
  PROCEDURE SetClientSetting(propertyName  in VARCHAR2,
                             propertyValue in VARCHAR2);   
                       
  <multilinecomment>*
   * Log - Writes a message to the Webutil server side log file
   * This is mainly used by the Core Log and Error functions 
   * used by the WebUtil Beans, but is available here to 
   * allow Other Webutil packages to write further messages
   * if required.
   * The name and location of the log file is defined in the
   * webutil config file.
   </multilinecomment> 
  PROCEDURE Log(msg in VARCHAR2, isError BOOLEAN);
  
  <multilinecomment>*
   * ReadFromPropertyBundle - Reads the value of a name=value
   * pair from the config file used by the utility
   </multilinecomment> 
  FUNCTION ReadFromPropertyBundle(propertyKey in VARCHAR2) return VARCHAR2;

  <multilinecomment>*
   * ReadTranslatableFromMsgBundle - Reads the translated message string
   * from the java list resource MsgBundle using the propertyKey. args
   * is the format arguments, if any, delimited by '|'
   * This function is no longer used for getting error messages. It is
   * still there mainly for getting the title of self-install URL-downloads
   * progress dialog.
   </multilinecomment> 
  FUNCTION ReadTransFromMsgBundle(propertyKey in VARCHAR2, args in VARCHAR2 := null) return VARCHAR2;

  <multilinecomment>*
   * ErrorAlert - pops up an alert with the specified raw error message.
   * There is no translation done for this. This is used mainly for throwing
   * errors when beans are not initialised. Without beans, we cannot get
   * translated message from java list resource bundle.
   </multilinecomment> 
  PROCEDURE ErrorAlert(errText in VARCHAR2);

  -- Functions to access the last Error raised.
  -- It must be called to check the last setProperty call with bypassErrorCheck = false
  FUNCTION isError   return BOOLEAN;
  
  -- Function to do all the error stuff for non client side functions
  PROCEDURE Error(packageID in PLS_INTEGER, code in PLS_INTEGER, pu_name in VARCHAR2,
                  arg1 in VARCHAR2 := null, arg2 in VARCHAR2 := null, arg3 in VARCHAR2 := null);

  <multilinecomment>*
   * getImplClass - returns the implementation class for this package 
   </multilinecomment> 
  FUNCTION getImplClass(packageID PLS_INTEGER) return VARCHAR2;

  -- Various informational functions returning info about the client ---------------

  <multilinecomment>*
   * GetClientUsername - returns the name of the O/S user of the Browser client
   </multilinecomment> 
  FUNCTION GetClientUsername return VARCHAR2;

  <multilinecomment>*
   * GetClientIPAddress - returns the IP Address of the Browser client
   </multilinecomment> 
  FUNCTION GetClientIPAddress return VARCHAR2;

  <multilinecomment>*
   * GetClientOS - returns the Operating system of the Browser client
   </multilinecomment> 
  FUNCTION GetClientOS return VARCHAR2;

  <multilinecomment>*
   * GetClientOSFamily - returns a constant representing the Client OS
   * All windows platforms come out as CLIENT_PLATFORM_WIN32,
   * both MAC and MAC OS X come out as CLIENT_PLATFORM_MAC
   * For the exact OS use GetClientOS
   </multilinecomment> 
  FUNCTION GetClientOSFamily return PLS_INTEGER;

  <multilinecomment>*
   * GetClientPathSep - returns the path separator used by the client OS
   </multilinecomment> 
  FUNCTION GetClientPathSep return VARCHAR2;
  
  <multilinecomment>*
   * GetClientFileSep - returns the file separator used by the client OS
   </multilinecomment> 
  FUNCTION GetClientFileSep return VARCHAR2;
  
  <multilinecomment>*
   * GetServerFileSep - returns the file separator used by the Application
   * Server O/S 
   </multilinecomment> 
  FUNCTION GetServerFileSep return VARCHAR2;  
  
  <multilinecomment>*
   * GetClientLocale - returns the country code of the client locale
   </multilinecomment> 
  FUNCTION GetClientLocale return VARCHAR2;  
 
  <multilinecomment>*
   * ShowBeans - displays or hides the window that actually holds the 
   * WebUtil Bean areas - use to debug the bean versions being used
   </multilinecomment>
  PROCEDURE ShowBeans(show BOOLEAN);
  
  <multilinecomment>*
   * SetCallbackTrigger - Stores the name of a trigger to execute 
   * when a particular callback is made
   </multilinecomment>
  PROCEDURE SetCallbackTrigger(callbackKey in PLS_INTEGER, triggerName in VARCHAR2);
  
  <multilinecomment>*
   * GetCallbackTrigger - gets the name of a trigger to execute 
   * when a particular callback is made
   </multilinecomment>
  FUNCTION GetCallbackTrigger(callbackKey in PLS_INTEGER) return VARCHAR2;  
  
  <multilinecomment>*
   * ClearCallbackTrigger - Cleans this entry from the callback cache
   </multilinecomment>
  PROCEDURE ClearCallbackTrigger(callbackKey in PLS_INTEGER);
  
  <multilinecomment>*
   * GetLastCallbackId - returns the ID of the object passed with the callback
   </multilinecomment>
  FUNCTION GetLastCallbackId return  PLS_INTEGER;
  
  <multilinecomment>*
   * DownLoadFromURL - pulls a file from the specified URL on the server and 
   * sends it via http to the specified destination on the client
   * If you specify file size we can so a comparison after download to ensure 
   * that the sizes match
   * Additionally of you specify withProgress and size you will get a progress
   * bar
   * Note that the Title, subtitle and message strings cannot contain the '|'
   * character
   </multilinecomment>
  FUNCTION DownLoadFromURL(sourceURL         in VARCHAR2, 
                           clientDestination in VARCHAR2, 
                           fileSize          in PLS_INTEGER default 0) return BOOLEAN;
                           
  FUNCTION DownLoadFromURLWithProgress(sourceURL         in VARCHAR2, 
                           clientDestination in VARCHAR2, 
                           fileSize          in PLS_INTEGER,
                           progressTitle     in VARCHAR2,
                           progressSubTitle  in VARCHAR2,
                           progressMessage   in VARCHAR2) return BOOLEAN;                           
                           
  <multilinecomment>*
   * PersistReference - Prevents a Java Object Refrence from being automatically 
   * removed when the Bean Area is destroyed
   * - This is for the use of other WebUtil packages and generally should not be used
   *   directly
   </multilinecomment>          
  PROCEDURE PersistReference(packageID in PLS_INTEGER, objectHandle in PLS_INTEGER);
  
  <multilinecomment>*
   * FreeReference - Explicitly removes an object from the client side cache.
   * Use this to clean up Persisted references
   * - This is for the use of other WebUtil packages and generally should not be used
   *   directly
   </multilinecomment>          
  PROCEDURE FreeReference(packageID in PLS_INTEGER, objectHandle in PLS_INTEGER);
  
  <multilinecomment>*
   * CheckJava - Function to check that server side java is configured to run OK and 
   * That the frmwebutil.jar is where it is supposed to be 
   * - This is for the use of other WebUtil packages and generally should not be used
   *   directly
   </multilinecomment>          
  FUNCTION checkJava return BOOLEAN;     
  
  <multilinecomment>*
   * Init - procedure used internally to ensure that the various WebUtil calls all 
   * instanciate this package 
   </multilinecomment>          
  PROCEDURE Init;  
   
END WEBUTIL_CORE;
	*/
	
			// ********************************************************************************\
		// * WEBUTIL_CORE
		// *   This Package contains core WebUtil Routines.
		// *   In general you should not call methods in this package directly unless
		// *   you are actually extending the WebUtil utility as a whole
		// *   Do not make changes in the package unless you are adding
		// *   You own functions - in which case make sure you read about how to
		// *   extend WebUtil in the doc.
		// *********************************************************************************
		// * Version 1.0.9
		// *********************************************************************************
		// * Change History
		// * 1.0.0  DRMILLS 01/NOV/2002 - Creation & Registering of Core, File and ClientInfo
		// * 1.0.1  DRMILLS 24/JAN/2003 - Made Alert handling more robust and added self
		// *                              initialisation in the form of InitWebUtil proc.
		// *                              Added WUL contants and packages for ORA_FFI interface.
		// * 1.0.2  DRMILLS 28/JAN/2003 - Added the Callback trigger list functionality for
		// *                              WEBUTIL_HOST
		// *                              Added the new calls Get/SetClientSetting() to
		// *                              persist information on the client machine in
		// *                              webutil.properties
		// *                              Added downloadFromURL() to push things like
		// *                              DLLs onto the client machine
		// * 1.0.3  DRMILLS 31/JAN/2003 - Added routines PersistReference() and
		// *                              FreeReference() to handle cross-Form/Session
		// *                              object persistance
		// * 1.0.4  DRMILLS 10/FEB/2003 - Added error() to allow non-client side
		// *                              routines to set the error info and pop up an
		// *                              alert all in one function
		// * 1.0.5  DRMILLS 21/FEB/2003 - Added support for auto download of user libraries
		// * 1.0.6  DRMILLS 12/MAR/2003 - Fixed 2839033 now only handle WebUtil events
		// *                              Fixed the timing issue in 2836929
		// *                              Moved CheckJava into this package from file
		// *                              transfer and made it more comprehensive
		// *                              so that it actually checks that the frmwebutil.jar
		// *                              is were the classpath says it is.  This will help
		// *                              to detect typos in the classpath
		// * 1.0.7  DRMILLS 13/MAY/2003 - Fixed 2955789 navigation to instanciate the
		// *                              webutil block was causing a problem in
		// *                              Enter-Query mode
		// *                              Added the Flag FLAG_EXPICIT_INSTANCIATE to
		// *                              allow explicit instanciation if it's really
		// *                              needed.
		// *                              Added the INIT procedure for the other WebUtil
		// *                              Programs to explicitly invoke Core to instanciate
		// *                              rather than just relying on ad-hoc references
		// *                              to do the calls.
		// * 1.0.8 DRMILLS 25/MAY/2003  - Added the Browser functions WUB implementation class
		// *                              package 6
		// * 1.0.9 DRMILLS 03/JUN/2003  - Fixed a problem with Host callbacks not being
		// *                              processed due to typo on the event handler
		// \********************************************************************************
		// *
		// * The PLL Version as a whole
		public NString webutilVersion= NString.getNull();
		// *
		// * Constants used throughout webutil
		public final NInteger WUC_PACKAGE = toInt(0);
		public final NInteger WUT_PACKAGE = toInt(1);
		public final NInteger WUF_PACKAGE = toInt(2);
		public final NInteger WUI_PACKAGE = toInt(3);
		public final NInteger WUH_PACKAGE = toInt(4);
		public final NInteger WUS_PACKAGE = toInt(5);
		public final NInteger WUB_PACKAGE = toInt(6);
		public final NInteger WUO_PACKAGE = toInt(7);
		public final NInteger WUU_PACKAGE = toInt(8);
		public final NInteger WUL_PACKAGE = toInt(9);
		// *
		// * Hold a list of constants for the O/S family
		public final NInteger CLIENT_PLATFORM_WIN32 = toInt(0);
		public final NInteger CLIENT_PLATFORM_LINUX = toInt(1);
		public final NInteger CLIENT_PLATFORM_SOLARIS = toInt(2);
		public final NInteger CLIENT_PLATFORM_HP = toInt(3);
		public final NInteger CLIENT_PLATFORM_AIX = toInt(4);
		public final NInteger CLIENT_PLATFORM_MAC = toInt(5);
		public final NInteger CLIENT_PLATFORM_UNKNOWN = toInt(9);
		// *
		// * Important Objects
		public final NString WEBUTIL_CONFIG_PARAM = toStr("PARAMETER.WEBUTILCONFIG");
		public final NString WEBUTIL_CONFIG_GLOBAL = toStr("GLOBAL.WEBUTILCONFIG");
		public final NString WEBUTIL_CONFIG_ENV = toStr("WEBUTIL_CONFIG");
		// *
		// * Exceptions
		 public class BeanNotRegistered extends Exception{}
		 public class PropertyError extends Exception{}
		 public class UnexpectedError extends Exception{}
		// *
		// * Special Flags - the following switches change the behaviour of the utility in
		// * Some way - you may be asked by support to set these.
		// * If these are defined as CONSTANT they will need to be set here in the code rather than from
		// * some calling procedure
		//  If this flag is set, the first call to WebUtil will navigate to the 
		//  WebUtil block to ensure that the PJCs on the client have all been created.
		//  Normally Forms will handle this without the navigation being required.
		//  Setting this flag will have side effects see Bug 2955789 
		public final NBool FLAG_EXPICIT_INSTANCIATE = toBool(NBool.False);
		//  Error code from last setProperty or getProperty with bypassErrorCheck := false
		public NInteger mLasterror = toInt(0);

			
		//Original PL/SQL code for Package Prog Unit (BODY) WEBUTIL_CORE
		/*
		PACKAGE BODY WEBUTIL_CORE IS
  -- internal exceptions
  CLIENT_FILE_NULL   EXCEPTION;
  URL_NULL           EXCEPTION;

  -- Types
  TYPE arrRegistered     is table of VARCHAR2(61 char) index by BINARY_INTEGER;
  TYPE recPropertyBundle is record (propertyKey VARCHAR2(120 char), propertyValue VARCHAR2(1000));
  TYPE arrPropertyBundle is table of recPropertyBundle index by BINARY_INTEGER;  
  TYPE arrImplClass      is table of VARCHAR2(60 char) index by BINARY_INTEGER;
  TYPE arrCallbacks      is table of VARCHAR2(30 char) index by BINARY_INTEGER;  
  
  -- Private package variables -------------------------------------
  <multilinecomment>*
   * Hold the list of all the beans that have made themselves known 
   * to the form
   </multilinecomment>
  m_registeredPackages arrRegistered;

  <multilinecomment>*
   * Hold the list of callbacks 
   * and the ID of the last callback
   </multilinecomment>
  m_callbacks arrCallbacks;   
  m_lastCallback PLS_INTEGER;
  
  
  <multilinecomment>*
   * Hold the names of the pre-packaged webutil objects 
   * The Alert is the most important and must be avaiable
   * See InitWebUtil for this and other setup.
   </multilinecomment>     
  WEBUTIL_HIDDEN_WINDOW   CONSTANT VARCHAR2(21) := 'WEBUTIL_HIDDEN_WINDOW';
  WEBUTIL_DUMMY_ITEM      CONSTANT VARCHAR2(13) := 'WEBUTIL.DUMMY';  
  WEBUTIL_ERROR_ALERT     CONSTANT VARCHAR2(13) := 'WEBUTIL_ERROR';
  WEBUTIL_JAVA_ROOT       CONSTANT VARCHAR2(21) := 'oracle.forms.webutil.'; 
  
  <multilinecomment>*
   * Hold a list of the implementation class for each bean
   </multilinecomment>
  m_implClasses arrImplClass; 
  
  <multilinecomment>*
   * hold all the properties from the config file
   </multilinecomment>
  m_propertyBundle arrPropertyBundle;
  m_config_error BOOLEAN := false;
  
  <multilinecomment>*
   * logging Information cached here
   </multilinecomment>
  m_loggingAllowed    BOOLEAN := null;
  m_loggingErrorsOnly BOOLEAN := null;
  m_loggingFile       VARCHAR2(1024 char);
  
  <multilinecomment>*
   * Information about the client
   </multilinecomment>
  m_clientIP          VARCHAR2(15 char);
  m_clientOS          VARCHAR2(40 char);
  m_clientOSFamily    PLS_INTEGER;  
  m_clientUserName    VARCHAR2(80 char);
  m_clientPathSep     VARCHAR2(1 char);
  m_clientFileSep     VARCHAR2(1 char);
  m_serverFileSep     VARCHAR2(1 char);  
  m_clientLangCode    VARCHAR2(2 char);
  
  
  <multilinecomment>*
   * If there is a mid tier error we'll need to 
   * display it in this alert.
   </multilinecomment>
  m_errorAlert ALERT := FIND_ALERT(WEBUTIL_ERROR_ALERT);
  
  <multilinecomment>*
   * If the Info Window is shown cache the field
   * we came from
   </multilinecomment>
  m_infoFrom ITEM;
  
  
  <multilinecomment>*
   * Can we call mid-teir java?
   </multilinecomment>
  m_javaOK          BOOLEAN := null;  
       
    
  -- Private Program units -----------------------------------------
  <multilinecomment>*
   * Register a new bean in the list of registered beans
   </multilinecomment>
  PROCEDURE registerBean(clientInfo in VARCHAR2);

  <multilinecomment>*
   * Populate up the property bundle that defines the properties 
   * for this bean
   * As a shortcut we can check for the key that was being looked for 
   * in the call that populated the bundle in the first place
   </multilinecomment>
  FUNCTION PopulatePropertyBundle(propertyKey in VARCHAR2) return VARCHAR2;
  
  <multilinecomment>*
   * Check the client side error condition and set the relevant variables
   * for in the package
   </multilinecomment>
  PROCEDURE CheckLastError(bean ITEM); 
  
  <multilinecomment>*
   * Instanciate the Beans used by WebUtil by navigating to the block
   * The block is on it's own window so can be hidden from the rest of 
   * the app once it's instanciated
   </multilinecomment>
  PROCEDURE InitWebUtil;  
  
  <multilinecomment>*
   * Get the registered handler bean for this particular package
   * The only twist here is that any bean can handle WUC (common) 
   * requests so just find the first one
   </multilinecomment>
  FUNCTION getHandlerBean(packageID in PLS_INTEGER) return VARCHAR2;  
  
  <multilinecomment>*
   * Carry out general and specialised downloads
   </multilinecomment>  
  FUNCTION DownLoadFromURLInt(sourceURL          in VARCHAR2, 
                              clientDestination  in VARCHAR2,
                              specialDestination in PLS_INTEGER default 0,
                              fileSize           in PLS_INTEGER default 0, 
                              withProgress       in BOOLEAN default false,
                              progressTitle      in VARCHAR2 default null,
                              progressSubTitle   in VARCHAR2 default null,
                              progressMessage    in VARCHAR2 default null) return BOOLEAN;
                             
  <multilinecomment>*
   * Check that any required libraries are available
   </multilinecomment>  
  PROCEDURE CheckLibs(packageID in VARCHAR2);                             
    
  <multilinecomment>*
   * Function to work out what OS family we are dealing
   * with.
   * Translates the value returned by 
   * System.getProperty("os.name");
   * into a constant value
   </multilinecomment>  
  FUNCTION getOSFamily(osName in VARCHAR2) return PLS_INTEGER;
  
  
  -- Public Program Unit Implementations ----------------------------
  PROCEDURE CustomEventHandler(EventName       in VARCHAR2, 
                               EventParameters in VARCHAR2) is
    dataPayload   VARCHAR2(32000 char);   
    dataMultiPart VARCHAR2(61 char); <multilinecomment> should be enough! </multilinecomment> 
    chunkNumber   PLS_INTEGER;
    PayloadChunks PLS_INTEGER;
    dataType      PLS_INTEGER;
    unhandled     EXCEPTION;
  begin
    --Bug 2839033 - check for valid events only      
    if EventName not in ('WUC_LOG_EVENT',
                         'WUC_ERROR_EVENT', 
                         'WUC_REGISTER',
                         'WUH_CALLBACK_EVENT', 
                         'WUT_TRANSFER_EVENT') then  
      raise unhandled;
    end if;                        

    -- We're pretty much always going to need the data payload and 
    -- number of parts that make up that payload so get it now..
    get_parameter_attr(EventParameters,'WUC_DATA',dataType, dataPayload);
    get_parameter_attr(EventParameters,'WUC_DATA_MULTIPART',dataType, dataMultiPart);      
    -- split the MULTIPART info to work out how many messages from the 
    -- client are required to create the completed payload
    chunkNumber   := DelimStr.getNumber(dataMultiPart,1,true,'/');
    PayloadChunks := DelimStr.getNumber(dataMultiPart,2,true,'/');

    -- Now deal with the specific events that the client may dispatch
    -- This section will have to be extended for each new event that we 
    -- Add in order to hook the handler code for that message to the data 
    -- that is being sent - shame we can't subclass in PL/SQL :-)      
    if EventName = 'WUC_LOG_EVENT' then
        WebUtil_Core.log(dataPayload,false);
    elsif EventName = 'WUC_ERROR_EVENT' then
        WebUtil_Core.log(dataPayload,true);
    elsif EventName = 'WUC_REGISTER' then 
        registerBean(dataPayload);
    elsif EventName = 'WUH_CALLBACK_EVENT' then 
      begin 
        m_lastCallback := to_number(dataPayload);
      exception
          when INVALID_NUMBER then 
            error(WebUtil_Core.WUC_PACKAGE,408,'WEBUTIL_CORE.CustomEventHandler');
      end;
      if m_lastCallback is not null then 
          EXECUTE_TRIGGER(m_callbacks(m_lastCallback));
      else
            log('Callback trigger for host command not specified',true);
      end if;
    elsif EventName = 'WUT_TRANSFER_EVENT' then 
      WebUtil_File_Transfer.setData(dataPayload);
      WebUtil_Core.setProperty(WebUtil_Core.WUT_PACKAGE, 'WUT_TRANSFER_EVENT','RECEIVED');
    end if;
  exception
    when unhandled then
      null;
    when OTHERS then
      raise;
  end CustomEventHandler;
  
  
  PROCEDURE SetProperty(packageID       in PLS_INTEGER, 
                        propertyName     in VARCHAR2, 
                        propertyValue    in VARCHAR2,
                        bypassErrorCheck in BOOLEAN DEFAULT true) is
    bean ITEM;                       
  begin
    -- note that a call to the common package can be handled by
    -- any bean
    bean := find_item(getHandlerBean(packageID));
    if id_null(bean) then 
      raise WEBUTIL_CORE.BEAN_NOT_REGISTERED;
    end if;
    SET_CUSTOM_PROPERTY(bean,1,propertyName,propertyValue);
    if not FORM_SUCCESS then 
      raise WEBUTIL_CORE.PROPERTY_ERROR;
    end if;
    if not bypassErrorCheck then 
      CheckLastError(bean);
    end if;
  exception
    when NO_DATA_FOUND then 
      RAISE WEBUTIL_CORE.BEAN_NOT_REGISTERED;
    when OTHERS then 
      RAISE;
  end SetProperty;       

  PROCEDURE SetProperty(packageID     in PLS_INTEGER, 
                        propertyName  in VARCHAR2, 
                        propertyValue in BOOLEAN,
                        bypassErrorCheck in BOOLEAN DEFAULT true) is
  begin
    SetProperty(packageID, propertyName, WebUtil_Util.BoolToStr(propertyValue,'TRUE','FALSE'), bypassErrorCheck);
  end SetProperty;
                                   
  FUNCTION GetProperty(packageID in PLS_INTEGER, 
                       propertyName in VARCHAR2,
                       bypassErrorCheck in BOOLEAN DEFAULT true) return VARCHAR2 is
    bean ITEM;                       
    result VARCHAR2(32000);
  begin
    bean := find_item(getHandlerBean(packageID));
    if id_null(bean) then 
      raise WEBUTIL_CORE.BEAN_NOT_REGISTERED;
    end if;
    result := GET_CUSTOM_PROPERTY(bean,1,propertyName);
    if not FORM_SUCCESS then 
      raise WEBUTIL_CORE.PROPERTY_ERROR;
    end if;
    if not bypassErrorCheck then 
      CheckLastError(bean);
    end if;
    return result;
  exception
  when NO_DATA_FOUND then 
    RAISE WEBUTIL_CORE.BEAN_NOT_REGISTERED;
  when OTHERS then 
    RAISE;      
  end GetProperty;   
  
  FUNCTION GetClientSetting(propertyName in VARCHAR2) return VARCHAR2 is 
    result VARCHAR2(255 char);
  BEGIN
    if propertyName is not null then 
    WebUtil_Core.setProperty(WebUtil_Core.WUC_PACKAGE,'WUC_GET_LOCAL_PROPERTY', propertyName);
       result := WebUtil_Core.getProperty(WebUtil_Core.WUC_PACKAGE,'WUC_GET_LOCAL_PROPERTY');
    end if;
    return result;
  EXCEPTION  
  when WebUtil_Core.BEAN_NOT_REGISTERED then 
    WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUC_PACKAGE)
                            ||' bean not found. WEBUTIL_CORE.GetClientSetting will not work');
    RAISE FORM_TRIGGER_FAILURE;  
  when WebUtil_Core.PROPERTY_ERROR then 
    RAISE FORM_TRIGGER_FAILURE;       
  END GetClientSetting;

  PROCEDURE SetClientSetting(propertyName  in VARCHAR2,
                             propertyValue in VARCHAR2) is
  BEGIN
    if propertyName is not null then 
    WebUtil_Core.setProperty(WebUtil_Core.WUC_PACKAGE,'WUC_SET_LOCAL_PROPERTY', propertyName||'='||propertyValue);
    end if;
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUC_PACKAGE)
                              ||' bean not found. WEBUTIL_CORE.SetClientSetting will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;       
  END SetClientSetting;                              
  

  PROCEDURE Log(msg in VARCHAR2, isError BOOLEAN) is
    logFile       TEXT_IO.FILE_TYPE;
    logFileName   VARCHAR2(1024 char);
    errorOnlyMode BOOLEAN;
  begin
    -- check to see if we should do anything
    if m_loggingAllowed is null then 
      -- set up the logging info Cache
      m_loggingAllowed    := (lower(ReadFromPropertyBundle('logging.enabled')) = 'true');
      m_loggingErrorsOnly := (lower(ReadFromPropertyBundle('logging.errorsonly')) = 'true');
      m_loggingFile       := ReadFromPropertyBundle('logging.file');
      if m_loggingAllowed then 
        if m_loggingFile is null then 
          -- no file == no logging
          m_loggingAllowed := false;
          if m_registeredPackages.FIRST is null then
            -- There is no bean registered yet. Throw error in English using alert
            ErrorAlert('WUC-008: Server side logging was requested but no log file was specified'
                       ||' - logging is disabled');
          else
            WebUtil_Core.setProperty(WUC_PACKAGE,'WUC_SRV_LOGGING','0',true);
            WebUtil_Core.error(WUC_PACKAGE,8,'WebUtil_Core.Log');
          end if;
        end if;
      end if;
      if m_registeredPackages.FIRST is not null then
        -- At least one bean is registered. Can call setProperty(WUC_PACKAGE)
        if m_loggingAllowed and m_loggingErrorsOnly then
          WebUtil_Core.setProperty(WUC_PACKAGE,'WUC_SRV_LOGGING','1',true);
        elsif  m_loggingAllowed then
          WebUtil_Core.setProperty(WUC_PACKAGE,'WUC_SRV_LOGGING','2',true);
        else
          WebUtil_Core.setProperty(WUC_PACKAGE,'WUC_SRV_LOGGING','0',true);
        end if;
      end if;
    end if;
        
    -- now log if allowed to do so
    if m_loggingAllowed and m_clientIP is not null then
      if ((not m_loggingErrorsOnly) or (m_loggingErrorsOnly and isError)) then
        logFile := TEXT_IO.FOPEN(m_loggingFile,'A');
        if not TEXT_IO.IS_OPEN(logFile) then 
          raise NO_DATA_FOUND;
        end if;
        TEXT_IO.PUT_LINE(logFile,m_clientIP||':'||m_clientUserName||': '||msg);
        TEXT_IO.FCLOSE(logFile);
      end if;    
    end if;
  EXCEPTION
    when others then 
      if SQLCODE = '-302000' then
        if m_registeredPackages.FIRST is null then
          -- There is no bean registered yet. Throw error in English using alert
          ErrorAlert('WUC-007: Unable to write to WebUtil Logging File '|| m_loggingFile);
        else

          WebUtil_Core.setProperty(WebUtil_Core.WUC_PACKAGE,'WUC_SRV_LOGGING','0',true);
          WebUtil_Core.error(WebUtil_Core.WUC_PACKAGE,7,'WebUtil_Core.Log',m_loggingFile);
        end if;
        m_loggingAllowed := false;
      else
        RAISE;
      end if;      
  end Log; 
  
  FUNCTION ReadFromPropertyBundle(propertyKey in VARCHAR2) return VARCHAR2 is   
    result       VARCHAR2(1000 char);
    propCount    PLS_INTEGER := m_propertyBundle.COUNT;
  begin
    if m_config_error then
      -- already encountered problem reading the config file.
      return null;
    elsif (propCount = 0) then
      result := populatePropertyBundle(propertyKey);
    else
      for i in 1..propCount LOOP
        if m_propertyBundle(i).propertyKey = lower(propertyKey) then 
          result := m_propertyBundle(i).propertyValue;
          EXIT;
        end if;
      end LOOP;
    end if;
    return result;
  end ReadFromPropertyBundle;  
  
  FUNCTION ReadTransFromMsgBundle(propertyKey in VARCHAR2, args in VARCHAR2 := null) return VARCHAR2 is
    -- currently called from checkLibs only for getting progress bar title.
  begin 
    Webutil_Core.setProperty(WebUtil_Core.WUC_PACKAGE,'WUC_TRANS_MSG', propertyKey||'|'||args);
    return Webutil_Core.getProperty(WebUtil_Core.WUC_PACKAGE,'WUC_TRANS_MSG');
  end ReadTransFromMsgBundle;
  
  PROCEDURE ErrorAlert(errText in VARCHAR2) is
    -- currently used for throwing a BEAN_NOT_REGISTERED or bean not found error.
    ignore integer;
  begin
    if not ID_NULL(m_errorAlert) then 
      --SET_ALERT_PROPERTY(m_errorAlert,TITLE,'WebUtil Error'); -- title already set in alert property
      SET_ALERT_PROPERTY(m_errorAlert,ALERT_MESSAGE_TEXT,errText);
      ignore := SHOW_ALERT(m_errorAlert);
    else
      message('WebUtil Error'||': '||errText);
    end if;
  end ErrorAlert;         

  FUNCTION getImplClass(packageID PLS_INTEGER) return VARCHAR2 is
  BEGIN 
    return WEBUTIL_JAVA_ROOT||m_implClasses(packageID);    
  END;
  
  -- Accessors for Error condition
  FUNCTION isError   return BOOLEAN is
  begin 
    return m_lastError <> 0;
  end;
  
  PROCEDURE Error(packageID in PLS_INTEGER,
                  code      in PLS_INTEGER,
                  pu_name   in VARCHAR2,
                  arg1      in VARCHAR2 :=null,
                  arg2      in VARCHAR2 := null,
                  arg3      in VARCHAR2 := null
                 ) is
    errText varchar2(1024);
  begin 
    errText := 'ERROR'||lpad(to_char(code),3,'0') || '|' || pu_name;
    if arg1 is not null then
      errText := errText || '|' || arg1;
    end if;
    if arg2 is not null then
      errText := errText || '|' || arg2;
    end if;
    if arg3 is not null then
      errText := errText || '|' || arg3;
    end if;
    Webutil_Core.setProperty(packageID, 'WUC_ERROR_MSG', errText);
  end Error;  
  
  -- Accessors for Client Information
  FUNCTION GetClientUsername return VARCHAR2 is
  begin 
    return m_clientUserName;
  end GetClientUsername; 

  FUNCTION GetClientIPAddress return VARCHAR2 is
  begin 
    return m_clientIP;
  end GetClientIPAddress; 

  FUNCTION GetClientOS return VARCHAR2 is
  begin 
    return m_clientOS;
  end GetClientOS; 

  FUNCTION GetClientOSFamily return PLS_INTEGER is 
  begin 
    return m_clientOSFamily;
  end GetClientOSFamily; 
  

  FUNCTION GetClientPathSep return VARCHAR2 is
  begin 
    return m_clientPathSep;
  end GetClientPathSep; 
  
  FUNCTION GetClientFileSep return VARCHAR2 is
  begin 
    return m_clientFileSep;
  end GetClientFileSep; 
  
  FUNCTION GetServerFileSep return VARCHAR2 is    
  begin 
    return m_serverFileSep;
  end GetServerFileSep; 
  
  FUNCTION GetClientLocale return VARCHAR2 is
  begin 
    return m_clientLangCode;
  end GetClientLocale;   
  
  PROCEDURE ShowBeans(show BOOLEAN) is
    hWin WINDOW := FIND_WINDOW(WEBUTIL_HIDDEN_WINDOW);
  begin
    -- Bug 2955789 - don't attempt to do this when in Enter Query Mode
    if name_in('SYSTEM.MODE') = 'NORMAL' then 
      if not ID_NULL(hWin) then 
        if show then 
          m_infoFrom := FIND_ITEM(name_in('SYSTEM.CURSOR_ITEM'));
          SET_WINDOW_PROPERTY(hWin,TITLE,'WebUtil '||WEBUTIL_VERSION);
          SHOW_WINDOW(hWin);
          go_item(WEBUTIL_DUMMY_ITEM);
        else
          if not id_null(m_infoFrom) then 
              go_item(m_infoFrom);
          end if;
          HIDE_WINDOW(hWin);
        end if;
      end if;
    end if;
  end ShowBeans;
  
  PROCEDURE SetCallbackTrigger(callbackKey in PLS_INTEGER, triggerName in VARCHAR2) is
  begin 
    m_callbacks(callbackKey) := triggerName;
  end SetCallbackTrigger;
  
  FUNCTION GetCallbackTrigger(callbackKey in PLS_INTEGER) return VARCHAR2 is 
  begin 
    return m_callbacks(callbackKey);
  end GetCallbackTrigger; 
  
  PROCEDURE ClearCallbackTrigger(callbackKey in PLS_INTEGER) is
  begin
    if m_callbacks.exists(callbackKey) then 
      m_callbacks.delete(callbackKey);  
    end if;
  end ClearCallbackTrigger;
  
  FUNCTION GetLastCallbackId return  PLS_INTEGER is
  begin
    return m_lastCallback;
  end GetLastCallbackId;  
  
  FUNCTION DownLoadFromURL(sourceURL         in VARCHAR2, 
                           clientDestination in VARCHAR2, 
                           fileSize          in PLS_INTEGER default 0) return BOOLEAN is
  BEGIN
    return DownLoadFromURLInt(sourceURL,
                              ClientDestination,
                              0,
                              fileSize,
                              false,
                              null,
                              null,
                              null);
  END DownLoadFromURL;    
  
  FUNCTION DownLoadFromURLWithProgress(
                           sourceURL         in VARCHAR2, 
                           clientDestination in VARCHAR2, 
                           fileSize          in PLS_INTEGER,
                           progressTitle     in VARCHAR2,
                           progressSubTitle  in VARCHAR2,
                           progressMessage   in VARCHAR2) return BOOLEAN is
  BEGIN
    return DownLoadFromURLInt(sourceURL,
                              ClientDestination,
                              0,
                              fileSize,
                              true,
                              progressTitle,
                              progressSubTitle,
                              progressMessage);
  END DownLoadFromURLWithProgress;   
  
  PROCEDURE PersistReference(packageID in PLS_INTEGER, objectHandle in PLS_INTEGER) is
  BEGIN
    if (objectHandle > 0 and objectHandle is not null) then 
    WebUtil_Core.setProperty(packageID,'WUC_GLOBAL_REFERENCE',to_char(objectHandle)||'|Y');              
    end if;
  END PersistReference; 
  
  PROCEDURE FreeReference(packageID in PLS_INTEGER, objectHandle in PLS_INTEGER) is  
  BEGIN
    if (objectHandle > 0 and objectHandle is not null) then 
    WebUtil_Core.setProperty(packageID,'WUC_GLOBAL_REFERENCE',to_char(objectHandle)||'|N');                        
    end if;      
  END FreeReference; 
  
  -- Private Program Unit Implementations ---------------------------

  <multilinecomment>* 
   * registerBean is called when a WUC_REGISTER message is received 
   * from the client.  It maintains a list of the registered beans
   * (and hence the packages that can be used - WUI, WUF etc.
   *  Because it records the item that is hosting the bean, this 
   *  allows other Packages within the library to get an set 
   *  properties on that bean without having to know which item 
   *  it actually is - removing any name dependencies
   </multilinecomment>
  PROCEDURE registerBean(clientInfo in VARCHAR2) is  
    packageID  PLS_INTEGER;
    beanShortName VARCHAR2(3 char);
    newPackage     BOOLEAN := false;
    checkUserLibs BOOLEAN := false;
  begin
    beanShortName := DelimStr.getString(clientInfo,1,true,'|');

    -- To speed access up we crossmatch the Bean Name string
    -- with a constant - this constant is used to access the 
    -- registered package array efficently
    -- need to update this IF statement as we add new packages
    if beanShortName = 'WUC' then
       packageID := WEBUTIL_CORE.WUC_PACKAGE; 
    elsif beanShortName = 'WUT' then     
       packageID := WEBUTIL_CORE.WUT_PACKAGE; 
    elsif beanShortName = 'WUF' then 
       packageID := WEBUTIL_CORE.WUF_PACKAGE; 
    elsif beanShortName = 'WUI' then
        packageID := WEBUTIL_CORE.WUI_PACKAGE; 
    elsif beanShortName = 'WUH' then            
       packageID := WEBUTIL_CORE.WUH_PACKAGE;
    elsif beanShortName = 'WUS' then     
       packageID := WEBUTIL_CORE.WUS_PACKAGE;
    elsif beanShortName = 'WUB' then 
       packageID := WEBUTIL_CORE.WUB_PACKAGE;
    elsif beanShortName = 'WUO' then     
       packageID := WEBUTIL_CORE.WUO_PACKAGE;
    elsif beanShortName = 'WUU' then     
       packageID := WEBUTIL_CORE.WUU_PACKAGE;
    elsif beanShortName = 'WUL' then     
       packageID := WEBUTIL_CORE.WUL_PACKAGE;           
    end if;
    -- For the very first bean we can get a bit of useful information
    -- Only do this once
    if m_clientIP is null then 
      checkUserLibs := true;
      -- Format of the clientinfo packet is
      -- BeanName|IP|OSName|UserName|pathSep|filesep
      m_clientIP       := DelimStr.getString(clientInfo,2,true,'|');
      m_clientOS       := DelimStr.getString(clientInfo,3,true,'|');
      m_clientOSFamily := getOSFamily(m_clientOS);
      m_clientUserName := DelimStr.getString(clientInfo,4,true,'|');      
      m_clientPathSep  := DelimStr.getString(clientInfo,5,true,'|');
      m_clientFileSep  := DelimStr.getString(clientInfo,6,true,'|');
      m_clientLangCode := DelimStr.getString(clientInfo,7,true,'|'); 
    end if;
      
    -- I'd only expect one instance of each bean per form
    -- but just in case we only register the first 
    -- so if multiple copies are used - e.g. it's 
    -- placed in a multi-row block we just use the 
    -- first instance.
    if not m_registeredPackages.EXISTS(packageID) then 
      m_registeredPackages(packageID) := name_in('SYSTEM.TRIGGER_ITEM');
      -- make sure all the required libraries are available
      -- on the client
      newPackage := true;
    end if;
      
    if checkUserLibs then
      -- checkUserLibs would be true if clientIP was null.
      Webutil_Core.WEBUTIL_VERSION := getProperty(WUC_PACKAGE,'WUC_BEAN_VERSION');
      -- We want to write the connection record if it's required.
      -- Any call to ReadFromPropertyBundle or log should be preferably made after
      -- registering at least one bean. That is the reason why the following log
      -- comes after m_registeredPackages(packageID) := name_in('SYSTEM.TRIGGER_ITEM'); above
      if lower(ReadFromPropertyBundle('logging.connections')) = 'true' then 
        log('Connection from Form='||GET_APPLICATION_PROPERTY(CURRENT_FORM)||' Client O/S='||m_clientOS||' locale='||m_clientLangCode,false);
      end if;
    end if;
    if newPackage then  
            checkLibs(to_char(packageID));
    end if;
      
    if checkUserLibs then
      -- Call a dummy log to initialize m_loggingAllowed and m_loggingErrorsOnly
      log(null,false);
    end if;
      
    -- Send server logging options to client bean so that the bean does not have
    -- to send message to server unnecessarily.
    if m_loggingAllowed and m_loggingErrorsOnly then
      WebUtil_Core.setProperty(packageID,'WUC_SRV_LOGGING','1',true);
    elsif m_loggingAllowed then
      WebUtil_Core.setProperty(packageID,'WUC_SRV_LOGGING','2',true);
    else
      WebUtil_Core.setProperty(packageID,'WUC_SRV_LOGGING','0',true);
    end if;
      
    -- 2836929 - move the user library check after the first package is registered 
    -- so that a handler bean exists to do the download.     
    if checkUserLibs then 
      --Check for and download any user libs
      checkLibs('user');  
    end if;     
  end registerBean;  
      
  FUNCTION PopulatePropertyBundle(propertyKey in VARCHAR2) return VARCHAR2 is
    configFile   VARCHAR2(512 char);
    buffer       VARCHAR2(1000 char);
    result       VARCHAR2(1000 char);          
    propertyFile TEXT_IO.FILE_TYPE;
    pos          PLS_INTEGER;
    propIndex    PLS_INTEGER := 0;
  begin
    -- First of get the name of the cfg file 
    -- This could come in a global  or from the Environment
    default_value('[NOTSET]',WEBUTIL_CONFIG_GLOBAL);
    configFile := name_in(WEBUTIL_CONFIG_GLOBAL);
    if configFile = '[NOTSET]' then
      configFile := null; 
      -- Try the environment
      TOOL_ENV.GETVAR(WEBUTIL_CONFIG_ENV, configFile); 
      if configFile is null then 
        -- Finally try the Forms parameters
        configFile := name_in(WEBUTIL_CONFIG_PARAM);
        -- if that fails then we have to raise an error
        if configFile is null then 
          raise NO_DATA_FOUND;
        end if;    
      end if;
    end if;
    
    copy(configFile, WEBUTIL_CONFIG_GLOBAL);
      
    propertyFile := Text_IO.FOpen(configFile,'R');
    LOOP
      begin
        Text_IO.Get_Line(propertyFile,buffer);
      exception
        when NO_DATA_FOUND then EXIT;
      end;
        
      -- ignore lines which start with '#'
      if substr(buffer,1,1) <> '#' then 
        pos := instr(buffer,'=');
        -- only process lines with a name value pair
        if pos > 0 then 
          propIndex := propIndex + 1;
          m_propertyBundle(propIndex).propertyKey   := lower(ltrim(rtrim(substr(buffer,1,pos-1))));    
          m_propertyBundle(propIndex).propertyValue := ltrim(rtrim(replace(substr(buffer,pos+1),chr(13),'')));
          -- Check to see if this is the key we are looking for
          if  m_propertyBundle(propIndex).propertyKey = lower(propertyKey) then
            result := m_propertyBundle(propIndex).propertyValue;
          end if;
        end if;
      end if;
    end LOOP;
    Text_IO.FClose(propertyFile);
    return result;
  EXCEPTION
    when NO_DATA_FOUND then 
      if m_registeredPackages.FIRST is null then
        -- There is no bean registered yet. Throw error in English using alert
        ErrorAlert('WUC-005: No WebUtil Configuration File specified');
      else
        Webutil_Core.Error(Webutil_Core.WUC_PACKAGE,5,'WebUtil_Core.PopulatePropertyBundle');
      end if;
      m_config_error := true;
      return null;
    when others then 
      if SQLCODE = '-302000' then
        if m_registeredPackages.FIRST is null then
          -- There is no bean registered yet. Throw error in English using alert
          ErrorAlert('WUC-006: Unable to read WebUtil Configuration File');
        else
          Webutil_Core.Error(Webutil_Core.WUC_PACKAGE,6,'WebUtil_Core.PopulatePropertyBundle', configFile);
        end if;
        m_config_error := true;
        return null;
      else
        RAISE;
      end if;      

  end PopulatePropertyBundle;    
  
  PROCEDURE CheckLastError(bean ITEM) is
    errorStr VARCHAR2(200 char);
  begin
    errorStr := GET_CUSTOM_PROPERTY(bean,1,'WUC_CHECK_ERROR');
    m_lastError := DelimStr.getNumber(errorStr,1,true);
    -- do not rause WebUtil_Core.PROPERTY_ERROR so that user can call
    -- isError to check if there was any error in setProperty or getProperty
  end;
  
  PROCEDURE InitWebUtil is
    startPoint VARCHAR2(61 char) := NAME_IN('SYSTEM.CURSOR_FIELD');
    hDummy     ITEM              := FIND_ITEM(WEBUTIL_DUMMY_ITEM);
  BEGIN
    -- Set up the various package we know about.
    m_implClasses(WUC_PACKAGE) := 'common.VBeanCommon'; 
    m_implClasses(WUT_PACKAGE) := 'fileTransfer.FileTransfer'; 
    m_implClasses(WUF_PACKAGE) := 'file.FileFunctions'; 
    m_implClasses(WUI_PACKAGE) := 'clientInfo.GetClientInfo'; 
    m_implClasses(WUH_PACKAGE) := 'host.Host'; 
    m_implClasses(WUS_PACKAGE) := 'session.SessionFunctions'; 
    m_implClasses(WUB_PACKAGE) := 'browser.BrowserFunctions'; 
    m_implClasses(WUO_PACKAGE) := 'ole.OleFunctions'; 
    m_implClasses(WUU_PACKAGE) := '';      
    m_implClasses(WUL_PACKAGE) := 'cApi.CApiFunctions';                     
    
    -- Now check for the Webutil Object group which 
    -- contains the Beans etc.
          
    if id_null(m_errorAlert) then 
      -- The Webutil error alert is not around
      -- so the Code cannot operate 
      message('The WEBUTIL object group is not available in this Form.  WebUtil cannot work');
      pause;
    else
      -- Bug 2955789 - this navigation causes problems if they are in Enter-Query mode 
      -- Plus it's not really needed, except as a belt and braces kind of setup.
      -- So put a check to prevent this in E-Q mode and set a top level flag to bypass it 
      -- it all together which we can switch on or off if required as a furture W/A    
      if FLAG_EXPICIT_INSTANCIATE and name_in('SYSTEM.MODE') = 'NORMAL' then 
        if not ID_NULL(hDummy) then 
          -- they are using the standard Object Group
          GO_ITEM(hDummy);
          if GET_ITEM_PROPERTY(startPoint,BLOCK_NAME) = GET_ITEM_PROPERTY(hDummy,BLOCK_NAME) then 
            NEXT_BLOCK;
          else
            GO_ITEM(startPoint);
          end if;
          ShowBeans(false);        
        else
          -- do nothing assume that the programmer is doing their own thing.
          -- with regards to setting up the bean areas and making sure they are drawn
           null;      
        end if;
      end if;
    end if;
        
    -- Work out the server o/s informtion that we need
    if instr(upper(GET_APPLICATION_PROPERTY(OPERATING_SYSTEM)),'WIN') > 0 then 
      m_serverFileSep := '\';
    else
      m_serverFileSep := '/';
    end if;
  END InitWebUtil;  
  
  FUNCTION getHandlerBean(packageID in PLS_INTEGER) return VARCHAR2 is
    handler PLS_INTEGER;
  BEGIN
    if packageID = WUC_PACKAGE then 
      handler := m_registeredPackages.FIRST;
    else
      handler := packageID;
    end if;
    return m_registeredPackages(handler);
  END getHandlerBean;  
  
  FUNCTION DownLoadFromURLInt(sourceURL          in VARCHAR2, 
                              clientDestination  in VARCHAR2, 
                              specialDestination in PLS_INTEGER default 0,                             
                              fileSize           in PLS_INTEGER default 0, 
                              withProgress       in BOOLEAN default false,
                              progressTitle      in VARCHAR2 default null,
                              progressSubTitle   in VARCHAR2 default null,
                              progressMessage    in VARCHAR2 default null) return BOOLEAN is
    result       VARCHAR2(6) := 'FALSE';
    submitString VARCHAR2(4000 char);
    sep          VARCHAR2(1) := '|';
  BEGIN
    if sourceURL is null then
      raise URL_NULL;
    end if;
    if clientDestination is null then
      raise CLIENT_FILE_NULL;
    end if;

    if specialDestination is null or specialDestination < 0 or specialDestination > 2 then 
      submitString := '0'||sep;
    else
      submitString := to_char(specialDestination)||sep;
    end if;
    if fileSize is null then 
      submitString := submitString||'0'||sep;
    else
      submitString := submitString||to_char(fileSize)||sep;
    end if;
    if withProgress is null or not withProgress then 
      submitString := submitString||'N'||sep;
    else
      submitString := submitString||'Y'||sep;
    end if;    

    submitString := submitString||sourceURL
                    ||sep||clientDestination
                    ||sep||nvl(progressTitle,' ')
                    ||sep||nvl(progressSubTitle,' ')
                    ||sep||nvl(progressMessage,' ');                         
  WebUtil_Core.setProperty(WebUtil_Core.WUC_PACKAGE,'WUC_URL_DOWNLOAD',submitString,true);
  result := WebUtil_Core.getProperty(WebUtil_Core.WUC_PACKAGE,'WUC_URL_DOWNLOAD');
  return (result='TRUE');
  EXCEPTION  
    when CLIENT_FILE_NULL then
      WebUtil_Core.Error(Webutil_Core.WUC_PACKAGE, 130, 'WEBUTIL_CORE.DownloadFromURLInt');
      return false;
    when URL_NULL then
      WebUtil_Core.Error(Webutil_Core.WUC_PACKAGE,25, 'WEBUTIL_CORE.DownloadFromURLInt');
      return false;

    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUC_PACKAGE)
                              ||' bean not found. WEBUTIL_CORE.DownloadFromURLInt will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;
  END DownLoadFromURLInt;   
  
  PROCEDURE CheckLibs(packageID in VARCHAR2 ) is
    lib          PLS_INTEGER := 1;
    libSpec      VARCHAR2(200 char);
    libName      VARCHAR2(100 char);
    libSize      PLS_INTEGER;
    libVer       VARCHAR2(20 char);
    installedVer VARCHAR2(20 char);
    libProg      BOOLEAN := false;
  BEGIN
    -- Read through the property bundle for 
    -- any libraries for this package
    LOOP
      libSpec := readFromPropertyBundle('install.syslib.'||to_char(m_clientOSFamily)||'.'||packageID||'.'||to_char(lib));
      if libSpec is null then 
          exit;
      end if;
      lib := lib + 1;
      libName := Delimstr.getString(libSpec,1,true,'|');
      libSize := Delimstr.getNumber(libSpec,2,true,'|');
      libVer  := Delimstr.getString(libSpec,3,true,'|');
      libProg := (upper(Delimstr.getString(libSpec,4,true,'|'))='TRUE');

      -- OK we now have the library information
      -- let's check if it's installed 
      installedVer := GetClientSetting('syslib.'||libname);
      if installedVer is null or installedVer <> libVer then 
        -- need to download
        if DownLoadFromURLInt(readFromPropertyBundle('install.syslib.location')||'/'||libName, 
                              libName,
                              1, -- put this into the bin directory
                              libSize,
                              libProg,
                              ReadTransFromMsgBundle('INST_PGRS_TITLE'),
                              ReadTransFromMsgBundle('INST_PGRS_SUBTITLE'),     
                              libName) then 
          SetClientSetting('syslib.'||libname,libVer);
        else
          log('Download of system library '||libName||' failed',true);
        end if;                          
      end if;
    END LOOP;
  END CheckLibs;
 
  FUNCTION getOSFamily(osName in VARCHAR2) return PLS_INTEGER is
    l_osName VARCHAR2(30) := lower(osName);
    result   PLS_INTEGER  := CLIENT_PLATFORM_UNKNOWN;
  BEGIN
    if m_clientOSFamily  is null then 
      if (instr(l_osName,'windows') > 0) then 
           result := CLIENT_PLATFORM_WIN32;
      elsif instr(l_osName,'mac') > 0 then 
          result := CLIENT_PLATFORM_MAC;      
      elsif instr(l_osName,'linux') > 0 then 
          result := CLIENT_PLATFORM_LINUX;      
      elsif instr(l_osName,'solaris') > 0 OR instr(l_osName, 'sunos') > 0 then 
          result := CLIENT_PLATFORM_SOLARIS;       
      elsif instr(l_osName,'hp-ux') > 0 then 
          result := CLIENT_PLATFORM_HP; 
      elsif instr(l_osName,'aix') > 0 then 
          result := CLIENT_PLATFORM_AIX;                                                       
      end if;            
      m_clientOSFamily := result;
    end if;
    return m_clientOSFamily;
  END getOSFamily;

  FUNCTION checkJava return BOOLEAN is
    classpath   VARCHAR2(4096 char);
    jarpos      PLS_INTEGER := 0;
    iStart      PLS_INTEGER := 0;
    iEnd        PLS_INTEGER := 0;      
    pathSep     VARCHAR2(1 CHAR);
    webUtilPath VARCHAR2(1024);
    jFile       ORA_JAVA.JOBJECT;
  BEGIN
    if m_javaOK is null then       
      m_javaOK := false;
      classpath := JAVA_SYSTEM.getProperty('java.class.path');
      pathSep   := JAVA_SYSTEM.getProperty('path.separator');      
      if pathSep = ';' then <multilinecomment> win32 </multilinecomment> 
        classpath := lower(classpath);
      end if;

      jarpos := instr(classpath,'frmwebutil.jar');
   
      if jarpos = 0 then 
        WebUtil_Core.Error(Webutil_Core.WUC_PACKAGE,134,'WEBUTIL_CORE.checkJava','frmwebutil.jar');
      else
        -- So we know that frmwebutil.jar is mentioned in the classpath let's check 
        -- to see if it actually is where the admin has said it is - this will 
        -- also check that Java can run at all. 
        iStart := instr(substr(classpath,1,jarPos),pathSep,-1,1);
        iEnd   := instr(classpath,pathSep,jarPos,1);          
        webUtilPath := substr(classpath,iStart+1,(iEnd-iStart)-1);
        jFile := JAVA_FILE.New(webUtilPath);
        if JAVA_FILE.Exists_(jFile) then
          m_javaOK := true;
        else
          -- frmwebutil.jar in classpath, but not physically found
          WebUtil_Core.Error(Webutil_Core.WUC_PACKAGE,135,'WEBUTIL_CORE.checkJava',webUtilPath);
        end if;
      end if;
    end if;  
    return m_javaOK;
  EXCEPTION
    when ORA_JAVA.JAVA_ERROR then 
      WebUtil_Core.Error(Webutil_Core.WUC_PACKAGE,122,'WEBUTIL_CORE.checkJava');
    when ORA_JAVA.EXCEPTION_THROWN then 
      WebUtil_Core.Error(Webutil_Core.WUC_PACKAGE,122,'WEBUTIL_CORE.checkJava');
  END checkJava;  
  
  PROCEDURE Init is
  begin 
    -- we don't need to do anything here - entering the package is enough to set it up.      
    null;
  end;      

BEGIN
  -- Initialise the Utility
  InitWebUtil;  
END WEBUTIL_CORE;
		*/
				//  internal exceptions
		 public class ClientFileNull extends Exception{}
		 public class UrlNull extends Exception{}
		//  Private package variables -------------------------------------
		// *
		// * Hold the list of all the beans that have made themselves known
		// * to the form
		private Webutilcore.Arrregistered mRegisteredpackages= null;
		// *
		// * Hold the list of callbacks
		// * and the ID of the last callback
		private Webutilcore.Arrcallbacks mCallbacks= null;
		private NInteger mLastcallback= NInteger.getNull();
		// *
		// * Hold the names of the pre-packaged webutil objects
		// * The Alert is the most important and must be avaiable
		// * See InitWebUtil for this and other setup.
		public final NString WEBUTIL_HIDDEN_WINDOW = toStr("WEBUTIL_HIDDEN_WINDOW");
		public final NString WEBUTIL_DUMMY_ITEM = toStr("WEBUTIL.DUMMY");
		public final NString WEBUTIL_ERROR_ALERT = toStr("WEBUTIL_ERROR");
		public final NString WEBUTIL_JAVA_ROOT = toStr("oracle.forms.webutil.");
		// *
		// * Hold a list of the implementation class for each bean
		private Webutilcore.Arrimplclass mImplclasses= null;
		// *
		// * hold all the properties from the config file
		private Webutilcore.Arrpropertybundle mPropertybundle= null;
		private NBool mConfigError = toBool(NBool.False);
		// *
		// * logging Information cached here
		private NBool mLoggingallowed = NBool.getNull();
		private NBool mLoggingerrorsonly = NBool.getNull();
		private NString mLoggingfile= NString.getNull();
		// *
		// * Information about the client
		private NString mClientip= NString.getNull();
		private NString mClientos= NString.getNull();
		private NInteger mClientosfamily= NInteger.getNull();
		private NString mClientusername= NString.getNull();
		private NString mClientpathsep= NString.getNull();
		private NString mClientfilesep= NString.getNull();
		private NString mServerfilesep= NString.getNull();
		private NString mClientlangcode= NString.getNull();
		// *
		// * If there is a mid tier error we'll need to
		// * display it in this alert.
		private AlertDescriptor mErroralert = findAlert(WEBUTIL_ERROR_ALERT);
		// *
		// * If the Info Window is shown cache the field
		// * we came from
		private ItemDescriptor mInfofrom= null;
		// *
		// * Can we call mid-teir java?
		private NBool mJavaok = NBool.getNull();
/* <p>
		*  Public Program Unit Implementations ----------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param eventname
		* @param eventparameters
		*/
		public void customeventhandler(NString eventname, NString eventparameters)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString datapayload= NString.getNull();
//			NString datamultipart= NString.getNull();
//			//  should be enough! 
//			NInteger chunknumber= NInteger.getNull();
//			NInteger payloadchunks= NInteger.getNull();
//			NInteger datatype= NInteger.getNull();
//			try
//			{
//				// Bug 2839033 - check for valid events only      
//				if ( !in(eventname, "WUC_LOG_EVENT", "WUC_ERROR_EVENT", "WUC_REGISTER", "WUH_CALLBACK_EVENT", "WUT_TRANSFER_EVENT").getValue() )
//				{
//					throw new Unhandled();
//				}
//				//  We're pretty much always going to need the data payload and 
//				//  number of parts that make up that payload so get it now..
//				datapayload = getParameter(eventparameters, "WUC_DATA");
//				datamultipart = getParameter(eventparameters, "WUC_DATA_MULTIPART");
//				//  split the MULTIPART info to work out how many messages from the 
//				//  client are required to create the completed payload
//				chunknumber = toInt(getContainer().getDelimstr().getnumber(datamultipart, toNumber(1), toBool(NBool.True), toStr("/")));
//				payloadchunks = toInt(getContainer().getDelimstr().getnumber(datamultipart, toNumber(2), toBool(NBool.True), toStr("/")));
//				//  Now deal with the specific events that the client may dispatch
//				//  This section will have to be extended for each new event that we 
//				//  Add in order to hook the handler code for that message to the data 
//				//  that is being sent - shame we can't subclass in PL/SQL :-)      
//				if ( eventname.equals("WUC_LOG_EVENT") )
//				{
//					log(datapayload, toBool(NBool.False));
//				}
//				else if ( eventname.equals("WUC_ERROR_EVENT") ) {
//					log(datapayload, toBool(NBool.True));
//				}
//				else if ( eventname.equals("WUC_REGISTER") ) {
//					registerbean(datapayload);
//				}
//				else if ( eventname.equals("WUH_CALLBACK_EVENT") ) {
//					try
//					{
//						mLastcallback = toNumber(datapayload);
//					}
//					catch(InvalidNumber e)
//					{
//						error(WUC_PACKAGE, toInt(408), toStr("WEBUTIL_CORE.CustomEventHandler"));
//					}
//					if ( !mLastcallback.isNull() )
//					{
//						// F2J_TO_COMPLETE : Call to built-in "EXECUTE_TRIGGER" was removed because it is not supported. See documentation for details "".
//						//						SupportClasses.SQLFORMS.ExecuteTrigger(mCallbacks.get(mLastcallback));
//						////
//						System.err.println("// F2J_TO_COMPLETE : Call to built-in 'EXECUTE_TRIGGER' was removed because it is not supported. See documentation for details ''.");
//						
//					}
//					else {
//						log(toStr("Callback trigger for host command not specified"), toBool(NBool.True));
//					}
//				}
//				else if ( eventname.equals("WUT_TRANSFER_EVENT") ) {
//					getContainer().getWebutilFileTransfer().setdata(datapayload);
//					setproperty(WUT_PACKAGE, toStr("WUT_TRANSFER_EVENT"), toBool("RECEIVED"));
//				}
//			}
//			catch(Unhandled e)
//			{
//			}
//			catch(Exception  e)
//			{
//				throw  e;
//			}
//
			this.getLogger().trace(this, "F2J : customeventhandler procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
/* </p>
		* @param packageid
		* @param propertyname
		* @param propertyvalue
		*/
		public void setproperty(NInteger packageid, NString propertyname, NString propertyvalue) {
			setproperty(packageid, propertyname, propertyvalue, toBool(NBool.True));
		}

/* <p>
/* </p>
		* @param packageid
		* @param propertyname
		* @param propertyvalue
		* @param bypasserrorcheck
		*/
		public void setproperty(NInteger packageid, NString propertyname, NString propertyvalue, NBool bypasserrorcheck)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			ItemDescriptor bean= null;
//			try
//			{
//				//  note that a call to the common package can be handled by
//				//  any bean
//				bean = findItem(gethandlerbean(packageid));
//				if ( (bean == null) )
//				{
//					throw new getWebutilcore().BeanNotRegistered();
//				}
//				// F2J_NOT_SUPPORTED : The property "CUSTOM's 1" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
//				//				SupportClasses.FORMS40.SetCustomProperty(bean, 1, propertyname, propertyvalue);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : The property 'CUSTOM's 1' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
//				
//				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					throw new getWebutilcore().PropertyError();
//				}
//				if ( bypasserrorcheck.not() )
//				{
//					checklasterror(bean);
//				}
//			}
//			catch(NoDataFoundException e)
//			{
//				throw new getWebutilcore().BeanNotRegistered();
//			}
//			catch(Exception  e)
//			{
//				throw  e;
//			}
//
			this.getLogger().trace(this, "F2J : setproperty procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param packageid
		* @param propertyname
		* @param propertyvalue
		*/
		public void setproperty(NInteger packageid, NString propertyname, NBool propertyvalue) {
			setproperty(packageid, propertyname, propertyvalue, toBool(NBool.True));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param packageid
		* @param propertyname
		* @param propertyvalue
		* @param bypasserrorcheck
		*/
		public void setproperty(NInteger packageid, NString propertyname, NBool propertyvalue, NBool bypasserrorcheck)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			setproperty(packageid, propertyname, getContainer().getWebutilUtil().booltostr(propertyvalue, toStr("TRUE"), toStr("FALSE")), bypasserrorcheck);
//
			this.getLogger().trace(this, "F2J : setproperty procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
/* </p>
		* @param packageid
		* @param propertyname
		*/
		public NString getproperty(NInteger packageid, NString propertyname) {
			return getproperty(packageid, propertyname, toBool(NBool.True));
		}

/* <p>
/* </p>
		* @param packageid
		* @param propertyname
		* @param bypasserrorcheck
		*/
		public NString getproperty(NInteger packageid, NString propertyname, NBool bypasserrorcheck)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			ItemDescriptor bean= null;
//			NString result= NString.getNull();
//			try
//			{
//				bean = findItem(gethandlerbean(packageid));
//				if ( (bean == null) )
//				{
//					throw new getWebutilcore().BeanNotRegistered();
//				}
//				// F2J_NOT_SUPPORTED : The property "CUSTOM's 1" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
//				//				result = SupportClasses.FORMS40.GetCustomProperty(bean, 1, propertyname);
//				////
//				System.err.println("// F2J_NOT_SUPPORTED : The property 'CUSTOM's 1' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
//				
//				if ( SupportClasses.SQLFORMS.FormSuccess().not() )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					throw new getWebutilcore().PropertyError();
//				}
//				if ( bypasserrorcheck.not() )
//				{
//					checklasterror(bean);
//				}
//				return result;
//			}
//			catch(NoDataFoundException e)
//			{
//				throw new getWebutilcore().BeanNotRegistered();
//			}
//			catch(Exception  e)
//			{
//				throw  e;
//			}
//
			this.getLogger().trace(this, "F2J : getproperty function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param propertyname
		*/
		public NString getclientsetting(NString propertyname)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString result= NString.getNull();
//			try
//			{
//				if ( !propertyname.isNull() )
//				{
//					setproperty(WUC_PACKAGE, toStr("WUC_GET_LOCAL_PROPERTY"), propertyname);
//					result = getproperty(WUC_PACKAGE, toStr("WUC_GET_LOCAL_PROPERTY"));
//				}
//				return result;
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				erroralert(getimplclass(WUC_PACKAGE).append(" bean not found. WEBUTIL_CORE.GetClientSetting will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : getclientsetting function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param propertyname
		* @param propertyvalue
		*/
		public void setclientsetting(NString propertyname, NString propertyvalue)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				if ( !propertyname.isNull() )
//				{
//					setproperty(WUC_PACKAGE, toStr("WUC_SET_LOCAL_PROPERTY"), propertyname.append("=").append(propertyvalue));
//				}
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				erroralert(getimplclass(WUC_PACKAGE).append(" bean not found. WEBUTIL_CORE.SetClientSetting will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : setclientsetting procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param msg
		* @param iserror
		*/
		public void log(NString msg, NBool iserror)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			ITextFile logfile= null;
//			NString logfilename= NString.getNull();
//			NBool erroronlymode= NBool.getNull();
//			try
//			{
//				//  check to see if we should do anything
//				if ( mLoggingallowed.isNull() )
//				{
//					//  set up the logging info Cache
//					mLoggingallowed = toBool(((lower(readfrompropertybundle(toStr("logging.enabled"))).equals("true"))));
//					mLoggingerrorsonly = toBool(((lower(readfrompropertybundle(toStr("logging.errorsonly"))).equals("true"))));
//					mLoggingfile = readfrompropertybundle(toStr("logging.file"));
//					if ( mLoggingallowed.getValue() )
//					{
//						if ( mLoggingfile.isNull() )
//						{
//							//  no file == no logging
//							mLoggingallowed = toBool(NBool.False);
//							if ( mRegisteredpackages.first().isNull() )
//							{
//								//  There is no bean registered yet. Throw error in English using alert
//								erroralert(toStr("WUC-008: Server side logging was requested but no log file was specified").append(" - logging is disabled"));
//							}
//							else {
//								setproperty(WUC_PACKAGE, toStr("WUC_SRV_LOGGING"), toBool("0"), toBool(NBool.True));
//								error(WUC_PACKAGE, toInt(8), toStr("WebUtil_Core.Log"));
//							}
//						}
//					}
//					if ( !mRegisteredpackages.first().isNull() )
//					{
//						//  At least one bean is registered. Can call setProperty(WUC_PACKAGE)
//						if ( mLoggingallowed.getValue() && mLoggingerrorsonly.getValue() )
//						{
//							setproperty(WUC_PACKAGE, toStr("WUC_SRV_LOGGING"), toBool("1"), toBool(NBool.True));
//						}
//						else if ( mLoggingallowed.getValue() ) {
//							setproperty(WUC_PACKAGE, toStr("WUC_SRV_LOGGING"), toBool("2"), toBool(NBool.True));
//						}
//						else {
//							setproperty(WUC_PACKAGE, toStr("WUC_SRV_LOGGING"), toBool("0"), toBool(NBool.True));
//						}
//					}
//				}
//				//  now log if allowed to do so
//				if ( mLoggingallowed.getValue() && !mClientip.isNull().getValue() )
//				{
//					if (((mLoggingerrorsonly.not()).getValue() || (mLoggingerrorsonly.getValue() && iserror.getValue()).getValue()))
//					{
//						// F2J_TO_COMPLETE Check if the file being opened is really a server side file or a file to be downloaded or uploaded, see documentation for details
//						logfile = TextFileManager.open(mLoggingfile, "A");
;
//						if ( logfile.isOpen().not() )
//						{
//							throw new NoDataFoundException();
//						}
//						logfile.writeLn(mClientip.append(":").append(mClientusername).append(": ").append(msg));
//						logfile.close();
//					}
//				}
//			}
//			catch(Exception  e)
//			{
//				if ( errorCode().equals("-302000") )
//				{
//					if ( mRegisteredpackages.first().isNull() )
//					{
//						//  There is no bean registered yet. Throw error in English using alert
//						erroralert(toStr("WUC-007: Unable to write to WebUtil Logging File ").append(mLoggingfile));
//					}
//					else {
//						setproperty(WUC_PACKAGE, toStr("WUC_SRV_LOGGING"), toBool("0"), toBool(NBool.True));
//						error(WUC_PACKAGE, toInt(7), toStr("WebUtil_Core.Log"), mLoggingfile);
//					}
//					mLoggingallowed = toBool(NBool.False);
//				}
//				else {
//					throw  e;
//				}
//			}
//
			this.getLogger().trace(this, "F2J : log procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param propertykey
		*/
		public NString readfrompropertybundle(NString propertykey)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString result= NString.getNull();
//			NInteger propcount = mPropertybundle.size();
//			if ( mConfigError.getValue() )
//			{
//				//  already encountered problem reading the config file.
//				return NString.getNull();
//			}
//			else if ((propcount.equals(0))) {
//				result = populatepropertybundle(propertykey);
//			}
//			else {
//				for ( int i = 1; i <= propcount; i++ )
//				{
//					if ( mPropertybundle.get(i).propertykey.equals(lower(propertykey)) )
//					{
//						result = mPropertybundle.get(i).propertyvalue;
//							break;
//					}
//				}
//			}
//			return result;
//
			this.getLogger().trace(this, "F2J : readfrompropertybundle function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param propertykey
		*/
		public NString readtransfrommsgbundle(NString propertykey) {
			return readtransfrommsgbundle(propertykey, NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param propertykey
		* @param args
		*/
		public NString readtransfrommsgbundle(NString propertykey, NString args)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			setproperty(WUC_PACKAGE, toStr("WUC_TRANS_MSG"), propertykey.append("|").append(args));
//			return getproperty(WUC_PACKAGE, toStr("WUC_TRANS_MSG"));
//
			this.getLogger().trace(this, "F2J : readtransfrommsgbundle function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param errtext
		*/
		public void erroralert(NString errtext)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  currently used for throwing a BEAN_NOT_REGISTERED or bean not found error.
//			NInteger ignore= NInteger.getNull();
//			if ( !(mErroralert == null) )
//			{
//				// SET_ALERT_PROPERTY(m_errorAlert,TITLE,'WebUtil Error'); -- title already set in alert property
//				setAlertMessageText(mErroralert, errtext);
//				ignore = toInt(showAlert(mErroralert));
//			}
//			else {
//				message(toStr("WebUtil Error").append(": ").append(errtext));
//			}
//
			this.getLogger().trace(this, "F2J : erroralert procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param packageid
		*/
		public NString getimplclass(NInteger packageid)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return WEBUTIL_JAVA_ROOT.append(mImplclasses.get(packageid));
//
			this.getLogger().trace(this, "F2J : getimplclass function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		*  Accessors for Error condition
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool iserror()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return mLasterror.notEquals(0);
//
			this.getLogger().trace(this, "F2J : iserror function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param packageid
		* @param code
		* @param puName
		*/
		public void error(NInteger packageid, NInteger code, NString puName) {
			error(packageid, code, puName, NString.getNull(), NString.getNull(), NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param packageid
		* @param code
		* @param puName
		* @param arg1
		*/
		public void error(NInteger packageid, NInteger code, NString puName, NString arg1) {
			error(packageid, code, puName, arg1, NString.getNull(), NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param packageid
		* @param code
		* @param puName
		* @param arg1
		* @param arg2
		*/
		public void error(NInteger packageid, NInteger code, NString puName, NString arg1, NString arg2) {
			error(packageid, code, puName, arg1, arg2, NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param packageid
		* @param code
		* @param puName
		* @param arg1
		* @param arg2
		* @param arg3
		*/
		public void error(NInteger packageid, NInteger code, NString puName, NString arg1, NString arg2, NString arg3)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString errtext= NString.getNull();
//			errtext = toStr("ERROR").append(lpad(toChar(code), 3, "0")).append("|").append(puName);
//			if ( !arg1.isNull() )
//			{
//				errtext = errtext.append("|").append(arg1);
//			}
//			if ( !arg2.isNull() )
//			{
//				errtext = errtext.append("|").append(arg2);
//			}
//			if ( !arg3.isNull() )
//			{
//				errtext = errtext.append("|").append(arg3);
//			}
//			setproperty(packageid, toStr("WUC_ERROR_MSG"), errtext);
//
			this.getLogger().trace(this, "F2J : error procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  Accessors for Client Information
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getclientusername()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return mClientusername;
//
			this.getLogger().trace(this, "F2J : getclientusername function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getclientipaddress()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return mClientip;
//
			this.getLogger().trace(this, "F2J : getclientipaddress function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getclientos()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return mClientos;
//
			this.getLogger().trace(this, "F2J : getclientos function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NInteger getclientosfamily()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return mClientosfamily;
//
			this.getLogger().trace(this, "F2J : getclientosfamily function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getclientpathsep()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return mClientpathsep;
//
			this.getLogger().trace(this, "F2J : getclientpathsep function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getclientfilesep()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return mClientfilesep;
//
			this.getLogger().trace(this, "F2J : getclientfilesep function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getserverfilesep()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return mServerfilesep;
//
			this.getLogger().trace(this, "F2J : getserverfilesep function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getclientlocale()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return mClientlangcode;
//
			this.getLogger().trace(this, "F2J : getclientlocale function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
/* </p>
		* @param show
		*/
		public void showbeans(NBool show)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			WindowDescriptor hwin = findWindow(WEBUTIL_HIDDEN_WINDOW);
//			//  Bug 2955789 - don't attempt to do this when in Enter Query Mode
//			if ( getMode().equals("NORMAL") )
//			{
//				if ( !(hwin == null) )
//				{
//					if ( show.getValue() )
//					{
//						mInfofrom = findItem(getCursorItem());
//						setWindowTitle(hwin, toStr("WebUtil ").append(webutilVersion));
//						showWindow(hwin);
//						goItem(WEBUTIL_DUMMY_ITEM);
//					}
//					else {
//						if ( !(mInfofrom == null) )
//						{
//							goItem(mInfofrom);
//						}
//						hideWindow(hwin);
//					}
//				}
//			}
//
			this.getLogger().trace(this, "F2J : showbeans procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param callbackkey
		* @param triggername
		*/
		public void setcallbacktrigger(NInteger callbackkey, NString triggername)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			
			this.getLogger().trace(this, "F2J : setcallbacktrigger procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param callbackkey
		*/
		public NString getcallbacktrigger(NInteger callbackkey)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return mCallbacks.get(callbackkey);
//
			this.getLogger().trace(this, "F2J : getcallbacktrigger function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param callbackkey
		*/
		public void clearcallbacktrigger(NInteger callbackkey)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ( mCallbacks.size() >= callbackkey )
//			{
//				mCallbacks.remove(callbackkey);
//			}
//
			this.getLogger().trace(this, "F2J : clearcallbacktrigger procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NInteger getlastcallbackid()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return mLastcallback;
//
			this.getLogger().trace(this, "F2J : getlastcallbackid function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceurl
		* @param clientdestination
		*/
		public NBool downloadfromurl(NString sourceurl, NString clientdestination) {
			return downloadfromurl(sourceurl, clientdestination, toInt(0));
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceurl
		* @param clientdestination
		* @param filesize
		*/
		public NBool downloadfromurl(NString sourceurl, NString clientdestination, NInteger filesize)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return downloadfromurlint(sourceurl, clientdestination, toInt(0), filesize, toBool(NBool.False), toStr(null), toStr(null), toStr(null));
//
			this.getLogger().trace(this, "F2J : downloadfromurl function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceurl
		* @param clientdestination
		* @param filesize
		* @param progresstitle
		* @param progresssubtitle
		* @param progressmessage
		*/
		public NBool downloadfromurlwithprogress(NString sourceurl, NString clientdestination, NInteger filesize, NString progresstitle, NString progresssubtitle, NString progressmessage)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return downloadfromurlint(sourceurl, clientdestination, toInt(0), filesize, toBool(NBool.True), progresstitle, progresssubtitle, progressmessage);
//
			this.getLogger().trace(this, "F2J : downloadfromurlwithprogress function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param packageid
		* @param objecthandle
		*/
		public void persistreference(NInteger packageid, NInteger objecthandle)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ((objecthandle.greater(0) && !objecthandle.isNull()))
//			{
//				setproperty(packageid, toStr("WUC_GLOBAL_REFERENCE"), toChar(objecthandle).append("|Y"));
//			}
//
			this.getLogger().trace(this, "F2J : persistreference procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param packageid
		* @param objecthandle
		*/
		public void freereference(NInteger packageid, NInteger objecthandle)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			if ((objecthandle.greater(0) && !objecthandle.isNull()))
//			{
//				setproperty(packageid, toStr("WUC_GLOBAL_REFERENCE"), toChar(objecthandle).append("|N"));
//			}
//
			this.getLogger().trace(this, "F2J : freereference procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  Private Program Unit Implementations ---------------------------
		* *
		* * registerBean is called when a WUC_REGISTER message is received
		* * from the client.  It maintains a list of the registered beans
		* * (and hence the packages that can be used - WUI, WUF etc.
		* *  Because it records the item that is hosting the bean, this
		* *  allows other Packages within the library to get an set
		* *  properties on that bean without having to know which item
		* *  it actually is - removing any name dependencies
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param clientinfo
		*/
		public void registerbean(NString clientinfo)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NInteger packageid= NInteger.getNull();
//			NString beanshortname= NString.getNull();
//			NBool newpackage = toBool(NBool.False);
//			NBool checkuserlibs = toBool(NBool.False);
//			beanshortname = getContainer().getDelimstr().getstring(clientinfo, toNumber(1), toBool(NBool.True), toStr("|"));
//			//  To speed access up we crossmatch the Bean Name string
//			//  with a constant - this constant is used to access the 
//			//  registered package array efficently
//			//  need to update this IF statement as we add new packages
//			if ( beanshortname.equals("WUC") )
//			{
//				packageid = WUC_PACKAGE;
//			}
//			else if ( beanshortname.equals("WUT") ) {
//				packageid = WUT_PACKAGE;
//			}
//			else if ( beanshortname.equals("WUF") ) {
//				packageid = WUF_PACKAGE;
//			}
//			else if ( beanshortname.equals("WUI") ) {
//				packageid = WUI_PACKAGE;
//			}
//			else if ( beanshortname.equals("WUH") ) {
//				packageid = WUH_PACKAGE;
//			}
//			else if ( beanshortname.equals("WUS") ) {
//				packageid = WUS_PACKAGE;
//			}
//			else if ( beanshortname.equals("WUB") ) {
//				packageid = WUB_PACKAGE;
//			}
//			else if ( beanshortname.equals("WUO") ) {
//				packageid = WUO_PACKAGE;
//			}
//			else if ( beanshortname.equals("WUU") ) {
//				packageid = WUU_PACKAGE;
//			}
//			else if ( beanshortname.equals("WUL") ) {
//				packageid = WUL_PACKAGE;
//			}
//			//  For the very first bean we can get a bit of useful information
//			//  Only do this once
//			if ( mClientip.isNull() )
//			{
//				checkuserlibs = toBool(NBool.True);
//				//  Format of the clientinfo packet is
//				//  BeanName|IP|OSName|UserName|pathSep|filesep
//				mClientip = getContainer().getDelimstr().getstring(clientinfo, toNumber(2), toBool(NBool.True), toStr("|"));
//				mClientos = getContainer().getDelimstr().getstring(clientinfo, toNumber(3), toBool(NBool.True), toStr("|"));
//				mClientosfamily = getosfamily(mClientos);
//				mClientusername = getContainer().getDelimstr().getstring(clientinfo, toNumber(4), toBool(NBool.True), toStr("|"));
//				mClientpathsep = getContainer().getDelimstr().getstring(clientinfo, toNumber(5), toBool(NBool.True), toStr("|"));
//				mClientfilesep = getContainer().getDelimstr().getstring(clientinfo, toNumber(6), toBool(NBool.True), toStr("|"));
//				mClientlangcode = getContainer().getDelimstr().getstring(clientinfo, toNumber(7), toBool(NBool.True), toStr("|"));
//			}
//			//  I'd only expect one instance of each bean per form
//			//  but just in case we only register the first 
//			//  so if multiple copies are used - e.g. it's 
//			//  placed in a multi-row block we just use the 
//			//  first instance.
//			if ( !mRegisteredpackages.size() >= packageid )
//			{
//								//  make sure all the required libraries are available
//				//  on the client
//				newpackage = toBool(NBool.True);
//			}
//			if ( checkuserlibs.getValue() )
//			{
//				//  checkUserLibs would be true if clientIP was null.
//				webutilVersion = getproperty(WUC_PACKAGE, toStr("WUC_BEAN_VERSION"));
//				//  We want to write the connection record if it's required.
//				//  Any call to ReadFromPropertyBundle or log should be preferably made after
//				//  registering at least one bean. That is the reason why the following log
//				//  comes after m_registeredPackages(packageID) := name_in('SYSTEM.TRIGGER_ITEM'); above
//				if ( lower(readfrompropertybundle(toStr("logging.connections"))).equals("true") )
//				{
//					log(toStr("Connection from Form=").append(getCurrentTaskName()).append(" Client O/S=").append(mClientos).append(" locale=").append(mClientlangcode), toBool(NBool.False));
//				}
//			}
//			if ( newpackage.getValue() )
//			{
//				checklibs(toChar(packageid));
//			}
//			if ( checkuserlibs.getValue() )
//			{
//				//  Call a dummy log to initialize m_loggingAllowed and m_loggingErrorsOnly
//				log(toStr(null), toBool(NBool.False));
//			}
//			//  Send server logging options to client bean so that the bean does not have
//			//  to send message to server unnecessarily.
//			if ( mLoggingallowed.getValue() && mLoggingerrorsonly.getValue() )
//			{
//				setproperty(packageid, toStr("WUC_SRV_LOGGING"), toBool("1"), toBool(NBool.True));
//			}
//			else if ( mLoggingallowed.getValue() ) {
//				setproperty(packageid, toStr("WUC_SRV_LOGGING"), toBool("2"), toBool(NBool.True));
//			}
//			else {
//				setproperty(packageid, toStr("WUC_SRV_LOGGING"), toBool("0"), toBool(NBool.True));
//			}
//			//  2836929 - move the user library check after the first package is registered 
//			//  so that a handler bean exists to do the download.     
//			if ( checkuserlibs.getValue() )
//			{
//				// Check for and download any user libs
//				checklibs(toStr("user"));
//			}
//
			this.getLogger().trace(this, "F2J : registerbean procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param propertykey
		*/
		public NString populatepropertybundle(NString propertykey)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString configfile= NString.getNull();
//			NString buffer= NString.getNull();
//			NString result= NString.getNull();
//			ITextFile propertyfile= null;
//			NInteger pos= NInteger.getNull();
//			NInteger propindex = toInt(0);
//			try
//			{
//				//  First of get the name of the cfg file 
//				//  This could come in a global  or from the Environment
//				setDefaultValue("[NOTSET]", WEBUTIL_CONFIG_GLOBAL);
//				configfile = getNameIn(WEBUTIL_CONFIG_GLOBAL);
//				if ( configfile.equals("[NOTSET]") )
//				{
//					configfile = toStr(null);
//					//  Try the environment
//					getEnvVar(WEBUTIL_CONFIG_ENV, configfile);
//					if ( configfile.isNull() )
//					{
//						//  Finally try the Forms parameters
//						configfile = getNameIn(WEBUTIL_CONFIG_PARAM);
//						//  if that fails then we have to raise an error
//						if ( configfile.isNull() )
//						{
//							throw new NoDataFoundException();
//						}
//					}
//				}
//				copy(configfile,WEBUTIL_CONFIG_GLOBAL);
//				// F2J_TO_COMPLETE Check if the file being opened is really a server side file or a file to be downloaded or uploaded, see documentation for details
//				propertyfile = TextFileManager.open(configfile, "R");
;
//				while (true) {
//					try
//					{
//						buffer = propertyfile.readLn();
//					}
//					catch(NoDataFoundException e)
//					{
//							break;
//					}
//					//  ignore lines which start with '#'
//					if ( substring(buffer, toInt(1), toInt(1)).notEquals("#") )
//					{
//						pos = inStr(buffer, toStr("="));
//						//  only process lines with a name value pair
//						if ( pos.greater(0) )
//						{
//							propindex = propindex.add(1);
//							mPropertybundle.get(propindex).propertykey = lower(ltrim(rtrim(substring(buffer, toInt(1), pos.subtract(1)))));
//							mPropertybundle.get(propindex).propertyvalue = ltrim(rtrim(replace(substring(buffer, pos.add(1)), chr(13), "")));
//							//  Check to see if this is the key we are looking for
//							if ( mPropertybundle.get(propindex).propertykey.equals(lower(propertykey)) )
//							{
//								result = mPropertybundle.get(propindex).propertyvalue;
//							}
//						}
//					}
//				}
//				propertyfile.close();
//				return result;
//			}
//			catch(NoDataFoundException e)
//			{
//				if ( mRegisteredpackages.first().isNull() )
//				{
//					//  There is no bean registered yet. Throw error in English using alert
//					erroralert(toStr("WUC-005: No WebUtil Configuration File specified"));
//				}
//				else {
//					error(WUC_PACKAGE, toInt(5), toStr("WebUtil_Core.PopulatePropertyBundle"));
//				}
//				mConfigError = toBool(NBool.True);
//				return NString.getNull();
//			}
//			catch(Exception  e)
//			{
//				if ( errorCode().equals("-302000") )
//				{
//					if ( mRegisteredpackages.first().isNull() )
//					{
//						//  There is no bean registered yet. Throw error in English using alert
//						erroralert(toStr("WUC-006: Unable to read WebUtil Configuration File"));
//					}
//					else {
//						error(WUC_PACKAGE, toInt(6), toStr("WebUtil_Core.PopulatePropertyBundle"), configfile);
//					}
//					mConfigError = toBool(NBool.True);
//					return NString.getNull();
//				}
//				else {
//					throw  e;
//				}
//			}
//
			this.getLogger().trace(this, "F2J : populatepropertybundle function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param bean
		*/
		public void checklasterror(ItemDescriptor bean)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString errorstr= NString.getNull();
//			// F2J_NOT_SUPPORTED : The property "CUSTOM's 1" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
//			//			errorstr = SupportClasses.FORMS40.GetCustomProperty(bean, 1, "WUC_CHECK_ERROR");
//			////
//			System.err.println("// F2J_NOT_SUPPORTED : The property 'CUSTOM's 1' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
//			
//			mLasterror = toInt(getContainer().getDelimstr().getnumber(errorstr, toNumber(1), toBool(NBool.True)));
//
			this.getLogger().trace(this, "F2J : checklasterror procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void initwebutil()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString startpoint = getCursorField();
//			ItemDescriptor hdummy = findItem(WEBUTIL_DUMMY_ITEM);
//			//  Set up the various package we know about.
//																																	//  Now check for the Webutil Object group which 
//			//  contains the Beans etc.
//			if ( (mErroralert == null) )
//			{
//				//  The Webutil error alert is not around
//				//  so the Code cannot operate 
//				message("The WEBUTIL object group is not available in this Form.  WebUtil cannot work");
//				// F2J_TO_REMOVE : Call to built-in "PAUSE" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\WEBUTILF2NMigrationGuide.xml#ExcludePause".
//				//				SupportClasses.SQLFORMS.Pause();
//				////
//				System.err.println("// F2J_TO_REMOVE : Call to built-in 'PAUSE' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\WEBUTILF2NMigrationGuide.xml#ExcludePause'.");
//				
//			}
//			else {
//				//  Bug 2955789 - this navigation causes problems if they are in Enter-Query mode 
//				//  Plus it's not really needed, except as a belt and braces kind of setup.
//				//  So put a check to prevent this in E-Q mode and set a top level flag to bypass it 
//				//  it all together which we can switch on or off if required as a furture W/A    
//				if ( FLAG_EXPICIT_INSTANCIATE.getValue() && getMode().equals("NORMAL").getValue() )
//				{
//					if ( !(hdummy == null) )
//					{
//						//  they are using the standard Object Group
//						goItem(hdummy);
//						if ( getItemBlock(startpoint).equals(getItemBlock(hdummy)) )
//						{
//							nextBlock();
//						}
//						else {
//							goItem(startpoint);
//						}
//						showbeans(toBool(NBool.False));
//					}
//					else {
//						//  do nothing assume that the programmer is doing their own thing.
//						//  with regards to setting up the bean areas and making sure they are drawn
//					}
//				}
//			}
//			//  Work out the server o/s informtion that we need
//			if ( inStr(upper(SupportClasses.FORMS40.GetApplicationProperty(SupportClasses.Property.OPERATING_SYSTEM)), toStr("WIN")).greater(0) )
//			{
//				// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//				mServerfilesep = toStr("\\");
//			}
//			else {
//				mServerfilesep = toStr("/");
//			}
//
			this.getLogger().trace(this, "F2J : initwebutil procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param packageid
		*/
		public NString gethandlerbean(NInteger packageid)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NInteger handler= NInteger.getNull();
//			if ( packageid.equals(WUC_PACKAGE) )
//			{
//				handler = mRegisteredpackages.first();
//			}
//			else {
//				handler = packageid;
//			}
//			return mRegisteredpackages.get(handler);
//
			this.getLogger().trace(this, "F2J : gethandlerbean function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceurl
		* @param clientdestination
		*/
		public NBool downloadfromurlint(NString sourceurl, NString clientdestination) {
			return downloadfromurlint(sourceurl, clientdestination, toInt(0), toInt(0), toBool(NBool.False), NString.getNull(), NString.getNull(), NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceurl
		* @param clientdestination
		* @param specialdestination
		*/
		public NBool downloadfromurlint(NString sourceurl, NString clientdestination, NInteger specialdestination) {
			return downloadfromurlint(sourceurl, clientdestination, specialdestination, toInt(0), toBool(NBool.False), NString.getNull(), NString.getNull(), NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceurl
		* @param clientdestination
		* @param specialdestination
		* @param filesize
		*/
		public NBool downloadfromurlint(NString sourceurl, NString clientdestination, NInteger specialdestination, NInteger filesize) {
			return downloadfromurlint(sourceurl, clientdestination, specialdestination, filesize, toBool(NBool.False), NString.getNull(), NString.getNull(), NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceurl
		* @param clientdestination
		* @param specialdestination
		* @param filesize
		* @param withprogress
		*/
		public NBool downloadfromurlint(NString sourceurl, NString clientdestination, NInteger specialdestination, NInteger filesize, NBool withprogress) {
			return downloadfromurlint(sourceurl, clientdestination, specialdestination, filesize, withprogress, NString.getNull(), NString.getNull(), NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceurl
		* @param clientdestination
		* @param specialdestination
		* @param filesize
		* @param withprogress
		* @param progresstitle
		*/
		public NBool downloadfromurlint(NString sourceurl, NString clientdestination, NInteger specialdestination, NInteger filesize, NBool withprogress, NString progresstitle) {
			return downloadfromurlint(sourceurl, clientdestination, specialdestination, filesize, withprogress, progresstitle, NString.getNull(), NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceurl
		* @param clientdestination
		* @param specialdestination
		* @param filesize
		* @param withprogress
		* @param progresstitle
		* @param progresssubtitle
		*/
		public NBool downloadfromurlint(NString sourceurl, NString clientdestination, NInteger specialdestination, NInteger filesize, NBool withprogress, NString progresstitle, NString progresssubtitle) {
			return downloadfromurlint(sourceurl, clientdestination, specialdestination, filesize, withprogress, progresstitle, progresssubtitle, NString.getNull());
		}

/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param sourceurl
		* @param clientdestination
		* @param specialdestination
		* @param filesize
		* @param withprogress
		* @param progresstitle
		* @param progresssubtitle
		* @param progressmessage
		*/
		public NBool downloadfromurlint(NString sourceurl, NString clientdestination, NInteger specialdestination, NInteger filesize, NBool withprogress, NString progresstitle, NString progresssubtitle, NString progressmessage)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString result = toStr("FALSE");
//			NString submitstring= NString.getNull();
//			NString sep = toStr("|");
//			try
//			{
//				if ( sourceurl.isNull() )
//				{
//					throw new UrlNull();
//				}
//				if ( clientdestination.isNull() )
//				{
//					throw new ClientFileNull();
//				}
//				if ( specialdestination.isNull() || specialdestination.lesser(0) || specialdestination.greater(2) )
//				{
//					submitstring = toStr("0").append(sep);
//				}
//				else {
//					submitstring = toChar(specialdestination).append(sep);
//				}
//				if ( filesize.isNull() )
//				{
//					submitstring = submitstring.append("0").append(sep);
//				}
//				else {
//					submitstring = submitstring.append(toChar(filesize)).append(sep);
//				}
//				if ( withprogress.isNull() || withprogress.not() )
//				{
//					submitstring = submitstring.append("N").append(sep);
//				}
//				else {
//					submitstring = submitstring.append("Y").append(sep);
//				}
//				submitstring = submitstring.append(sourceurl).append(sep).append(clientdestination).append(sep).append(isNull(progresstitle, " ")).append(sep).append(isNull(progresssubtitle, " ")).append(sep).append(isNull(progressmessage, " "));
//				setproperty(WUC_PACKAGE, toStr("WUC_URL_DOWNLOAD"), submitstring, toBool(NBool.True));
//				result = getproperty(WUC_PACKAGE, toStr("WUC_URL_DOWNLOAD"));
//				return ((result.equals("TRUE")));
//			}
//			catch(ClientFileNull e)
//			{
//				error(WUC_PACKAGE, toInt(130), toStr("WEBUTIL_CORE.DownloadFromURLInt"));
//				return  toBool(NBool.False);
//			}
//			catch(UrlNull e)
//			{
//				error(WUC_PACKAGE, toInt(25), toStr("WEBUTIL_CORE.DownloadFromURLInt"));
//				return  toBool(NBool.False);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				erroralert(getimplclass(WUC_PACKAGE).append(" bean not found. WEBUTIL_CORE.DownloadFromURLInt will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : downloadfromurlint function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param packageid
		*/
		public void checklibs(NString packageid)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NInteger lib = toInt(1);
//			NString libspec= NString.getNull();
//			NString libname= NString.getNull();
//			NInteger libsize= NInteger.getNull();
//			NString libver= NString.getNull();
//			NString installedver= NString.getNull();
//			NBool libprog = toBool(NBool.False);
//			//  Read through the property bundle for 
//			//  any libraries for this package
//			while (true) {
//				libspec = readfrompropertybundle(toStr("install.syslib.").append(toChar(mClientosfamily)).append(".").append(packageid).append(".").append(toChar(lib)));
//				if ( libspec.isNull() )
//				{
//						break;
//				}
//				lib = lib.add(1);
//				libname = getContainer().getDelimstr().getstring(libspec, toNumber(1), toBool(NBool.True), toStr("|"));
//				libsize = toInt(getContainer().getDelimstr().getnumber(libspec, toNumber(2), toBool(NBool.True), toStr("|")));
//				libver = getContainer().getDelimstr().getstring(libspec, toNumber(3), toBool(NBool.True), toStr("|"));
//				libprog = toBool(((upper(getContainer().getDelimstr().getstring(libspec, toNumber(4), toBool(NBool.True), toStr("|"))).equals("TRUE"))));
//				//  OK we now have the library information
//				//  let's check if it's installed 
//				installedver = getclientsetting(toStr("syslib.").append(libname));
//				if ( installedver.isNull() || installedver.notEquals(libver) )
//				{
//					//  need to download
//					if ( downloadfromurlint(readfrompropertybundle(toStr("install.syslib.location")).append("/").append(libname), libname, toInt(1), libsize, libprog, readtransfrommsgbundle(toStr("INST_PGRS_TITLE")), readtransfrommsgbundle(toStr("INST_PGRS_SUBTITLE")), libname).getValue() )
//					{
//						setclientsetting(toStr("syslib.").append(libname), libver);
//					}
//					else {
//						log(toStr("Download of system library ").append(libname).append(" failed"), toBool(NBool.True));
//					}
//				}
//			}
//
			this.getLogger().trace(this, "F2J : checklibs procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param osname
		*/
		public NInteger getosfamily(NString osname)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString lOsname = lower(osname);
//			NInteger result = CLIENT_PLATFORM_UNKNOWN;
//			if ( mClientosfamily.isNull() )
//			{
//				if ((inStr(lOsname, toStr("windows")).greater(0)))
//				{
//					result = CLIENT_PLATFORM_WIN32;
//				}
//				else if ( inStr(lOsname, toStr("mac")).greater(0) ) {
//					result = CLIENT_PLATFORM_MAC;
//				}
//				else if ( inStr(lOsname, toStr("linux")).greater(0) ) {
//					result = CLIENT_PLATFORM_LINUX;
//				}
//				else if ( inStr(lOsname, toStr("solaris")).greater(0) || inStr(lOsname, toStr("sunos")).greater(0) ) {
//					result = CLIENT_PLATFORM_SOLARIS;
//				}
//				else if ( inStr(lOsname, toStr("hp-ux")).greater(0) ) {
//					result = CLIENT_PLATFORM_HP;
//				}
//				else if ( inStr(lOsname, toStr("aix")).greater(0) ) {
//					result = CLIENT_PLATFORM_AIX;
//				}
//				mClientosfamily = result;
//			}
//			return mClientosfamily;
//
			this.getLogger().trace(this, "F2J : getosfamily function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NInteger.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool checkjava()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString classpath= NString.getNull();
//			NInteger jarpos = toInt(0);
//			NInteger istart = toInt(0);
//			NInteger iend = toInt(0);
//			NString pathsep= NString.getNull();
//			NString webutilpath= NString.getNull();
//			UnknownTypes.OraJavaJobject jfile= null;
//			try
//			{
//				if ( mJavaok.isNull() )
//				{
//					mJavaok = toBool(NBool.False);
//					classpath = getContainer().getJavaSystem().getproperty(toStr("java.class.path"));
//					pathsep = getContainer().getJavaSystem().getproperty(toStr("path.separator"));
//					if ( pathsep.equals(";") )
//					{
//						//  win32 
//						classpath = lower(classpath);
//					}
//					jarpos = inStr(classpath, toStr("frmwebutil.jar"));
//					if ( jarpos.equals(0) )
//					{
//						error(WUC_PACKAGE, toInt(134), toStr("WEBUTIL_CORE.checkJava"), toStr("frmwebutil.jar"));
//					}
//					else {
//						//  So we know that frmwebutil.jar is mentioned in the classpath let's check 
//						//  to see if it actually is where the admin has said it is - this will 
//						//  also check that Java can run at all. 
//						istart = inStr(substring(classpath, toInt(1), jarpos), pathsep, - (1), toInt(1));
//						iend = inStr(classpath, pathsep, jarpos, toInt(1));
//						webutilpath = substring(classpath, istart.add(1), (iend.subtract(istart)).subtract(1));
//						jfile = JavaFile._new(webutilpath);
//						if ( getContainer().getJavaFile().exists_(jfile).getValue() )
//						{
//							mJavaok = toBool(NBool.True);
//						}
//						else {
//							//  frmwebutil.jar in classpath, but not physically found
//							error(WUC_PACKAGE, toInt(135), toStr("WEBUTIL_CORE.checkJava"), webutilpath);
//						}
//					}
//				}
//				return mJavaok;
//			}
//			catch(Exception e)
//			{
//				error(WUC_PACKAGE, toInt(122), toStr("WEBUTIL_CORE.checkJava"));
//			}
//			catch(Exception e)
//			{
//				error(WUC_PACKAGE, toInt(122), toStr("WEBUTIL_CORE.checkJava"));
//			}
//
			this.getLogger().trace(this, "F2J : checkjava function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void init()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  we don't need to do anything here - entering the package is enough to set it up.      
//
			this.getLogger().trace(this, "F2J : init procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		public WebutilCore() {
			//F2J_WRAPPED_CODE : The code of this Package Constructor was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  Initialise the Utility
//			initwebutil();
//
			this.getLogger().trace(this, "F2J : WebutilCore Constructor is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		
	
public static class Arrregistered extends NStringTable{
}

public static class Recpropertybundle{
	public NString propertykey;
	public NString propertyvalue;
}

public static class Arrpropertybundle extends OraTable<Recpropertybundle>{
}

public static class Arrimplclass extends NStringTable{
}

public static class Arrcallbacks extends NStringTable{
}



	
}
