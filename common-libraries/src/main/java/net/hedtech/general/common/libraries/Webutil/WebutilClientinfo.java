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


public class WebutilClientinfo extends AbstractSupportCodeObject {
	

	public WebutilClientinfo(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) WEBUTIL_CLIENTINFO
	/*
	PACKAGE WEBUTIL_CLIENTINFO IS
<multilinecomment>********************************************************************************\
 * WEBUTIL_CLIENTINFO
 *   This Package contains routines to get basic information about the Client
 *   browser machine
 *   The functions in this package will work with any client type - not just 
 *   Windows clients.
 *   The oracle.forms.webutil.clientInfo.GetClientInfo bean is needed in your 
 *   Form to use these functions
 *********************************************************************************
 * Version 1.0.1
 *********************************************************************************
 * Change History
 *   1.0.0 DRMILLS 20/DEC/2002 - Creation
 *   1.0.1 DRMILLS 13/MAY/2003 - Added call to WebUtil_Core.Init
 *   1.0.3 OSINGH  06/NOV/2003 - Corrected the spelling of SEPARATOR
 *
\********************************************************************************</multilinecomment>

  <multilinecomment>*
   * GET_USER_NAME - returns the name of the O/S user of the Browser client
   </multilinecomment> 
  FUNCTION GET_USER_NAME return VARCHAR2;

  <multilinecomment>*
   * GET_IP_ADDRESS - returns the IP Address of the Browser client
   </multilinecomment> 
  FUNCTION GET_IP_ADDRESS return VARCHAR2;
  
  <multilinecomment>*
   * GET_HOST_NAME - returns the Hostname of the Browser client
   </multilinecomment> 
  FUNCTION GET_HOST_NAME return VARCHAR2;  

  <multilinecomment>*
   * GET_OPERATING_SYSTEM - returns the Operating system of the Browser client
   </multilinecomment> 
  FUNCTION GET_OPERATING_SYSTEM return VARCHAR2;

  <multilinecomment>*
   * GET_JAVA_VERSION - returns the version of the operating JVM in the Browser client
   </multilinecomment> 
  FUNCTION GET_JAVA_VERSION return VARCHAR2;
  
  <multilinecomment>*
   * GET_PATH_SEPARATOR - returns the path separator used by the client OS
   * e.g. ";" on a Windows Client, ":" on Unix/Linux
   </multilinecomment> 
  FUNCTION GET_PATH_SEPARATOR return VARCHAR2;
  
  <multilinecomment>*
   * GET_FILE_SEPARATOR - returns the file separator used by the client OS
   * e.g. "\" on a Windows Client, "/" on Unix/Linux   
   </multilinecomment> 
  FUNCTION GET_FILE_SEPARATOR return VARCHAR2;
  
  <multilinecomment>*
   * GET_LANGUAGE - returns the language country code of the client
   </multilinecomment> 
  FUNCTION GET_LANGUAGE return VARCHAR2;  

  <multilinecomment>*
   * GET_TIME_ZONE - returns the Timezone being used by the client
   </multilinecomment> 
  FUNCTION GET_TIME_ZONE return VARCHAR2;  

  <multilinecomment>*
   * GET_DATE_TIME - returns the date and time as it stands on the client
   </multilinecomment> 
  FUNCTION GET_DATE_TIME return DATE;  
  
  <multilinecomment>*
   * GET_SYSTEM_PROPERTY - returns the value of the specified Java System Property
   </multilinecomment> 
  FUNCTION GET_SYSTEM_PROPERTY(property in VARCHAR2) return VARCHAR2;    
 
END WEBUTIL_CLIENTINFO;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) WEBUTIL_CLIENTINFO
		/*
		PACKAGE BODY WEBUTIL_CLIENTINFO IS

  FUNCTION GET_USER_NAME return VARCHAR2 is
  begin
    return WebUtil_Core.getClientUserName;
  end GET_USER_NAME;
  
  FUNCTION GET_IP_ADDRESS return VARCHAR2 is
  begin
    return WebUtil_Core.getClientIPAddress;
  end GET_IP_ADDRESS;
  
  FUNCTION GET_HOST_NAME return VARCHAR2 is
  begin
    return WebUtil_Core.getProperty(WebUtil_Core.WUI_PACKAGE,'WUI_HOSTNAME');
  exception
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUL_PACKAGE)
                              ||' bean not found. WEBUTIL_C_API.REBIND_PARAMETER will not work');
      return null;
  end GET_HOST_NAME;
  
  FUNCTION GET_OPERATING_SYSTEM return VARCHAR2 is
  begin
    return WebUtil_Core.getClientOS;
  end GET_OPERATING_SYSTEM;
  
  FUNCTION GET_JAVA_VERSION return VARCHAR2 is
  begin
    return WebUtil_Core.getProperty(WebUtil_Core.WUI_PACKAGE,'WUI_CLIENT_JAVA_VERSION');
  exception
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUI_PACKAGE)
                              ||' bean not found. WEBUTIL_CLIENTINFO.GET_JAVA_VERSION will not work');
      return null;
  end GET_JAVA_VERSION;
  
  FUNCTION GET_PATH_SEPARATOR return VARCHAR2 is
  begin
    return WebUtil_Core.getClientPathSep;
  end GET_PATH_SEPARATOR;
  
  FUNCTION GET_FILE_SEPARATOR return VARCHAR2 is
  begin
    return WebUtil_Core.getClientFileSep;
  end GET_FILE_SEPARATOR;
  
  FUNCTION GET_LANGUAGE return VARCHAR2 is
  begin
    return WebUtil_Core.getClientLocale;
  end GET_LANGUAGE;
  
  FUNCTION GET_TIME_ZONE return VARCHAR2 is
  begin
    return WebUtil_Core.getProperty(WebUtil_Core.WUI_PACKAGE,'WUI_CLIENT_TZ');
  exception
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
    WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUI_PACKAGE)
                            ||' bean not found. WEBUTIL_CLIENTINFO.GET_TIME_ZONE will not work');
    return null;
  end GET_TIME_ZONE;
   
  FUNCTION GET_DATE_TIME return DATE is
    dateString VARCHAR2(40 char);
  begin
    dateString := WebUtil_Core.getProperty(WebUtil_Core.WUI_PACKAGE,'WUI_CLIENT_DATE');
    return to_date(dateString,'YYYY MM DD HH24:MI:SS');
  exception
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUI_PACKAGE)
              ||' bean not found. WEBUTIL_CLIENTINFO.GET_DATE_TIME will not work');
      return null;
  end GET_DATE_TIME;
   
  FUNCTION GET_SYSTEM_PROPERTY(property in VARCHAR2) return VARCHAR2 is
  begin
    WebUtil_Core.setProperty(WebUtil_Core.WUI_PACKAGE,'WUI_SYSTEM_PROPERTY',property); 
    return WebUtil_Core.getProperty(WebUtil_Core.WUI_PACKAGE,'WUI_SYSTEM_PROPERTY');
  exception
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUI_PACKAGE)
                              ||' bean not found. WEBUTIL_CLIENTINFO.GET_SYSTEM_PROPERTY will not work');
      return null;
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE;
  end GET_SYSTEM_PROPERTY;
  
  
BEGIN 
  -- Explicitly instanciate CORE
  WebUtil_Core.Init;
END WEBUTIL_CLIENTINFO;
		*/
		/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getUserName()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return getContainer().getWebutilCore().getclientusername();
//
			this.getLogger().trace(this, "F2J : getUserName function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getIpAddress()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return getContainer().getWebutilCore().getclientipaddress();
//
			this.getLogger().trace(this, "F2J : getIpAddress function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getHostName()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				return getContainer().getWebutilCore().getproperty(getWebutilcore().WUI_PACKAGE, toStr("WUI_HOSTNAME"));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUL_PACKAGE).append(" bean not found. WEBUTIL_C_API.REBIND_PARAMETER will not work"));
//				return NString.getNull();
//			}
//
			this.getLogger().trace(this, "F2J : getHostName function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getOperatingSystem()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return getContainer().getWebutilCore().getclientos();
//
			this.getLogger().trace(this, "F2J : getOperatingSystem function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getJavaVersion()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				return getContainer().getWebutilCore().getproperty(getWebutilcore().WUI_PACKAGE, toStr("WUI_CLIENT_JAVA_VERSION"));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUI_PACKAGE).append(" bean not found. WEBUTIL_CLIENTINFO.GET_JAVA_VERSION will not work"));
//				return NString.getNull();
//			}
//
			this.getLogger().trace(this, "F2J : getJavaVersion function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getPathSeparator()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return getContainer().getWebutilCore().getclientpathsep();
//
			this.getLogger().trace(this, "F2J : getPathSeparator function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getFileSeparator()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return getContainer().getWebutilCore().getclientfilesep();
//
			this.getLogger().trace(this, "F2J : getFileSeparator function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getLanguage()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return getContainer().getWebutilCore().getclientlocale();
//
			this.getLogger().trace(this, "F2J : getLanguage function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getTimeZone()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				return getContainer().getWebutilCore().getproperty(getWebutilcore().WUI_PACKAGE, toStr("WUI_CLIENT_TZ"));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUI_PACKAGE).append(" bean not found. WEBUTIL_CLIENTINFO.GET_TIME_ZONE will not work"));
//				return NString.getNull();
//			}
//
			this.getLogger().trace(this, "F2J : getTimeZone function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NDate getDateTime()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			NString datestring= NString.getNull();
//			try
//			{
//				datestring = getContainer().getWebutilCore().getproperty(getWebutilcore().WUI_PACKAGE, toStr("WUI_CLIENT_DATE"));
//				return toDate(datestring, "YYYY MM DD HH24:MI:SS");
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUI_PACKAGE).append(" bean not found. WEBUTIL_CLIENTINFO.GET_DATE_TIME will not work"));
//				return NDate.getNull();
//			}
//
			this.getLogger().trace(this, "F2J : getDateTime function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NDate.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param property
		*/
		public NString getSystemProperty(NString property)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUI_PACKAGE, toStr("WUI_SYSTEM_PROPERTY"), property);
//				return getContainer().getWebutilCore().getproperty(getWebutilcore().WUI_PACKAGE, toStr("WUI_SYSTEM_PROPERTY"));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUI_PACKAGE).append(" bean not found. WEBUTIL_CLIENTINFO.GET_SYSTEM_PROPERTY will not work"));
//				return NString.getNull();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw  e;
//			}
//
			this.getLogger().trace(this, "F2J : getSystemProperty function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
		public WebutilClientinfo() {
			//F2J_WRAPPED_CODE : The code of this Package Constructor was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  Explicitly instanciate CORE
//			getContainer().getWebutilCore().init();
//
			this.getLogger().trace(this, "F2J : WebutilClientinfo Constructor is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		
	
	
}
