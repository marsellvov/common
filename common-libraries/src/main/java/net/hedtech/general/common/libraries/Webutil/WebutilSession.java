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


public class WebutilSession extends AbstractSupportCodeObject {
	

	public WebutilSession(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) WEBUTIL_SESSION
	/*
	PACKAGE WEBUTIL_SESSION IS
<multilinecomment>********************************************************************************\
 * WEBUTIL_SESSION
 *   This Package contains routines to monitor the session and react to 
 *   specifically timeout events such as the frmweb being killed
 *********************************************************************************
 * Version 1.0.1
 *********************************************************************************
 * Change History
 *   1.0.0 DRMILLS 03/FEB/2003 - Creation
 *   1.0.1 DRMILLS 17/MAY/2003 - Added call to WebUtil_Core.Init
 *
\********************************************************************************</multilinecomment>  

  <multilinecomment>*
   * Enable_Redirect_On_TimeOut switches on the timeout functionality
   * If the Forms engine goes away this will be detected by WebUtil and then 
   * the browser will be re-directed to the nominated URL
   * Notes:
   * 1) You must supply a URL. It can be absolute or relative
   * 2) If you do not call Disable_Redirect_On_TimeOut() before exiting the 
   *    last form in the session that has the WebUtil Beans then you will 
   *    be automatically re-directed as soon as that Form closes
   *    This may be desirable but be aware of the behavior
   * 3) You can enable or disable the Timeout monitor from any WebUtil 
   *    capable Form that is open - you can disable it from a different
   *    Form from the one that started it.
   * 4) The monitor does not actively monitor the application server
   *    so a failure will not be detected until the user tries to carry 
   *    out an action in the Form
   * 5) The default monitor interval is every 5 seconds.  To change this 
   *    interval use the WebUtilDispatchMonitorInterval parameter in the 
   *    formsweb.cfg.  Set this to the number of seconds required
   * 6) Using this facility does not cause any extra network traffic between
   *    the Forms client and the application server except for the actual 
   *    calls to switch the monitoring on or off   
   </multilinecomment>
  PROCEDURE Enable_Redirect_On_TimeOut(redirectURL in VARCHAR2);

  <multilinecomment>*
   * Disable_Redirect_On_TimeOut switches off the timeout functionality
   </multilinecomment>
  PROCEDURE Disable_Redirect_On_TimeOut;  
  
END WEBUTIL_SESSION;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) WEBUTIL_SESSION
		/*
		PACKAGE BODY WEBUTIL_SESSION IS
  -- Private functions
  PROCEDURE RedirectOnTimeOut(redirectURL in VARCHAR2);
  

  -- Implementations of public functions
  PROCEDURE Enable_Redirect_On_TimeOut(redirectURL in VARCHAR2) is
  BEGIN
    RedirectOnTimeOut(redirectURL);
  END Enable_Redirect_On_TimeOut;

  PROCEDURE Disable_Redirect_On_TimeOut is
  BEGIN
    RedirectOnTimeOut(null);
  END Disable_Redirect_On_TimeOut;
  
  -- Implementations of private functions   
  PROCEDURE RedirectOnTimeOut(redirectURL in VARCHAR2) is
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUS_PACKAGE,'WUS_MONITOR_DISPATCHER',redirectURL);
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
       WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUS_PACKAGE)
                               ||' bean not fount. WEBUTIL_SESSION.RedirectOnTimeOut will not work');
  END RedirectOnTimeOut;
  
BEGIN
  -- Ensure that Core is instanciated.
  Webutil_Core.Init;
END WEBUTIL_SESSION;
		*/
		/* <p>
		*  Implementations of public functions
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param redirecturl
		*/
		public void enableRedirectOnTimeout(NString redirecturl)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			redirectontimeout(redirecturl);
//
			this.getLogger().trace(this, "F2J : enableRedirectOnTimeout procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void disableRedirectOnTimeout()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			redirectontimeout(toStr(null));
//
			this.getLogger().trace(this, "F2J : disableRedirectOnTimeout procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		*  Implementations of private functions   
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param redirecturl
		*/
		public void redirectontimeout(NString redirecturl)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUS_PACKAGE, toStr("WUS_MONITOR_DISPATCHER"), redirecturl);
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUS_PACKAGE).append(" bean not fount. WEBUTIL_SESSION.RedirectOnTimeOut will not work"));
//			}
//
			this.getLogger().trace(this, "F2J : redirectontimeout procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		public WebutilSession() {
			//F2J_WRAPPED_CODE : The code of this Package Constructor was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  Ensure that Core is instanciated.
//			getContainer().getWebutilCore().init();
//
			this.getLogger().trace(this, "F2J : WebutilSession Constructor is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		
	
	
}
