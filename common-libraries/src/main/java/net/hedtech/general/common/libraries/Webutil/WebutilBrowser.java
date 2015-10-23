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


public class WebutilBrowser extends AbstractSupportCodeObject {
	

	public WebutilBrowser(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) WEBUTIL_BROWSER
	/*
	PACKAGE WEBUTIL_BROWSER IS
<multilinecomment>********************************************************************************\
 * WEBUTIL_BROWSER
 *   This Package contains routines to interact with the hosting Browser or
 *   The functions in this package will work with any client type - not just 
 *   Windows clients.
 *   The oracle.forms.webutil.browser.BrowserFunctions bean is needed in your 
 *   Form to use these functions
 *********************************************************************************
 * Version 1.0.0
 *********************************************************************************
 * Change History
 *   1.0.0 DRMILLS 25/MAY/2003 - Creation
 *   1.0.1 DRMILLS 27/MAY/2003 - Added call to get Applet Size & Applet Parameters
 *
\********************************************************************************</multilinecomment>

  -- Browser Functions

  <multilinecomment>*
   *  ShowMenuBar - Hide or show the Forms menu Bar
   *                Note this only works when the Menu property in the Form 
   *                is set to null - e.g only the "Window" menu shows.
   *                As such this call allows you to create a menuless form
   *                For best effect also set logo=no in the FormsWeb.cfg or
   *                you'll still have the space at the top of the screen allocated
   *                for that
   </multilinecomment> 
   
   PROCEDURE ShowMenuBar(showBar BOOLEAN);
   
  <multilinecomment>*
   *  ShowStatusBar - Hide or show the Forms status Bar
   *                This is just like setting the console window property
   *                but can be done dynamically rather than at design time
   </multilinecomment> 
   
   PROCEDURE ShowStatusBar(showBar BOOLEAN);
   
  <multilinecomment>*
   *  BrowserMessage - Sends a message to the Browser status line
   </multilinecomment>   
   PROCEDURE BrowserMessage(msg VARCHAR2);
   
  <multilinecomment>*
   *  GetAppletSize - returns the available size of the Applet Area as a
   *                  width,height pair - measured in Pixels
   </multilinecomment>   
   FUNCTION GetAppletSize return VARCHAR2;
   
  <multilinecomment>*
   * GetAppletParameter - returns the value of the specified parameter to the Applet
   </multilinecomment> 
  FUNCTION GetAppletParameter(parameter in VARCHAR2) return VARCHAR2;       
 
END WEBUTIL_BROWSER;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) WEBUTIL_BROWSER
		/*
		PACKAGE BODY WEBUTIL_BROWSER IS

  -- Implemenations   
  PROCEDURE ShowMenuBar(showBar BOOLEAN) is 
  BEGIN 
    WebUtil_SeparateFrame.ShowMenuBar(showBar);
  END ShowMenuBar;
  
  PROCEDURE ShowStatusBar(showBar BOOLEAN) is
  BEGIN 
    WebUtil_SeparateFrame.ShowStatusBar(showBar);
  END ShowStatusBar;
  
  PROCEDURE BrowserMessage(msg VARCHAR2) is
  BEGIN
    if msg is null OR msg = '' then
      WebUtil_Core.setProperty(WebUtil_Core.WUB_PACKAGE,'WUB_BROWSER_MESSAGE',' ', true);
    else
      WebUtil_Core.setProperty(WebUtil_Core.WUB_PACKAGE,'WUB_BROWSER_MESSAGE',msg, true);
    end if;
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUB_PACKAGE)
                              ||' bean not found. WEBUTIL_BROWSER.BrowserMessage will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;        
  END BrowserMessage;  
  
  FUNCTION GetAppletSize return VARCHAR2 is
  BEGIN 
    return WebUtil_SeparateFrame.GetSeparateFrameSize;
  END GetAppletSize;
  
  FUNCTION GetAppletParameter(parameter in VARCHAR2) return VARCHAR2 is  
  begin
    WebUtil_Core.setProperty(WebUtil_Core.WUB_PACKAGE,'WUB_APPLET_PARAMETER',parameter); 
    return WebUtil_Core.getProperty(WebUtil_Core.WUB_PACKAGE,'WUB_APPLET_PARAMETER');
  exception
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUB_PACKAGE)
                              ||' bean not found. WEBUTIL_BROWSER.GetAppletParameter will not work');
      return null;
   when WebUtil_Core.PROPERTY_ERROR then 
     RAISE FORM_TRIGGER_FAILURE;  
  END GetAppletParameter;  
  
BEGIN 
  -- Explicitly instanciate CORE
  WebUtil_Core.Init; 
END WEBUTIL_BROWSER;
		*/
		/* <p>
		*  Implemenations   
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param showbar
		*/
		public void showmenubar(NBool showbar)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			getContainer().getWebutilSeparateframe().showmenubar(showbar);
//
			this.getLogger().trace(this, "F2J : showmenubar procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param showbar
		*/
		public void showstatusbar(NBool showbar)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			getContainer().getWebutilSeparateframe().showstatusbar(showbar);
//
			this.getLogger().trace(this, "F2J : showstatusbar procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param msg
		*/
		public void browsermessage(NString msg)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				if ( msg.isNull() || msg.equals("") )
//				{
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUB_PACKAGE, toStr("WUB_BROWSER_MESSAGE"), toBool(" "), toBool(NBool.True));
//				}
//				else {
//					getContainer().getWebutilCore().setproperty(getWebutilcore().WUB_PACKAGE, toStr("WUB_BROWSER_MESSAGE"), msg, toBool(NBool.True));
//				}
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUB_PACKAGE).append(" bean not found. WEBUTIL_BROWSER.BrowserMessage will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : browsermessage procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getappletsize()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			return getContainer().getWebutilSeparateframe().getseparateframesize();
//
			this.getLogger().trace(this, "F2J : getappletsize function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param parameter
		*/
		public NString getappletparameter(NString parameter)
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUB_PACKAGE, toStr("WUB_APPLET_PARAMETER"), parameter);
//				return getContainer().getWebutilCore().getproperty(getWebutilcore().WUB_PACKAGE, toStr("WUB_APPLET_PARAMETER"));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUB_PACKAGE).append(" bean not found. WEBUTIL_BROWSER.GetAppletParameter will not work"));
//				return NString.getNull();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : getappletparameter function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
		public WebutilBrowser() {
			//F2J_WRAPPED_CODE : The code of this Package Constructor was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  Explicitly instanciate CORE
//			getContainer().getWebutilCore().init();
//
			this.getLogger().trace(this, "F2J : WebutilBrowser Constructor is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		
	
	
}
