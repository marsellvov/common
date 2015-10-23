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


public class WebutilSeparateframe extends AbstractSupportCodeObject {
	

	public WebutilSeparateframe(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public WebutilServices getContainer() {
		return (WebutilServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) WEBUTIL_SEPARATEFRAME
	/*
	PACKAGE WEBUTIL_SEPARATEFRAME IS

<multilinecomment>********************************************************************************\
 * WEBUTIL_SEPARATEFRAME
 *   This Package contains routines to interact with the MDI frame when Forms
 *   is running with the parameter separateFrame=true
 *   The functions in this package will work with any client type - not just 
 *   Windows clients.
 *   The oracle.forms.webutil.browser.BrowserFunctions bean is needed in your 
 *   Form to use these functions
 *********************************************************************************
 * Version 1.0.0
 *********************************************************************************
 * Change History
 *   1.0.0 DRMILLS 25/MAY/2003 - Creation
 *   1.0.1 DRMILLS 27/MAY/2003 - Added call to get frame size 
 *
\********************************************************************************</multilinecomment>

  <multilinecomment>*
   *  IsSeparateFrame - Allows you to check if the form 
   *                is running in separateFrame mode or not
   </multilinecomment> 
  FUNCTION IsSeparateFrame RETURN BOOLEAN;
   
  <multilinecomment>*
   *  GetSeparateFrameSize - returns a width,height pair showing the 
   *                frame size in Pixels
   </multilinecomment> 
  FUNCTION GetSeparateFrameSize RETURN VARCHAR2;   

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
   *  SetTitle -    Set the title on the separateFrame
   </multilinecomment> 
   PROCEDURE SetTitle(title VARCHAR2); 
   
  <multilinecomment>*
   *  SetIcon -     Change the icon used on the separateFrame
   *                This should be a GIF or JPG image
   *                The location of the icon is relative to the value defined
   *                in your IMAGEBASE.  e.g. if you are already using IMAGEBASE=CODEBASE
   *                to read icons from a JAR file, then SetIcon will look there as well
   *                Otherwise it will look relative to the DOCUMENTBASE.
   </multilinecomment> 
   PROCEDURE SetIcon(icon VARCHAR2); 

  <multilinecomment>*
   *  AllowResize - Enable or disable the ability to resize the Forms MDI frame 
   </multilinecomment> 
   PROCEDURE AllowResize(allow BOOLEAN); 

  <multilinecomment>*
   *  CenterMDI -  Centers the Forms frame in the display 
   *               There are two versions of this the second allows you
   *               to nudge the frame up or down on the Y axis to allow
   *               for the task bar etc. 
   *               Positive adjust Values shift that number of pixels *down* from 
   *               the centered position and negative values shift up.
   </multilinecomment> 
   PROCEDURE CenterMDI; 
   PROCEDURE CenterMDI(adjustY PLS_INTEGER);    
     
   
  
END WEBUTIL_SEPARATEFRAME;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) WEBUTIL_SEPARATEFRAME
		/*
		PACKAGE BODY WEBUTIL_SEPARATEFRAME IS

  FUNCTION IsSeparateFrame RETURN BOOLEAN is
  BEGIN
    if WebUtil_Core.getProperty(WebUtil_Core.WUB_PACKAGE,'WUB_SEPARATEFRAME_MODE') = 'TRUE' then
      return TRUE;
    else
      return FALSE;
    end if;
  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUB_PACKAGE)
                              ||' bean not found. WEBUTIL_SEPARATEFRAME.IsSeparateFrame will not work');
      return null;  
  END IsSeparateFrame;
   
  FUNCTION GetSeparateFrameSize RETURN VARCHAR2 is 
  BEGIN
      return WebUtil_Core.getProperty(WebUtil_Core.WUB_PACKAGE,'WUB_APPLET_SIZE');
  EXCEPTION
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUB_PACKAGE)
                              ||' bean not found. WEBUTIL_SEPARATEFRAME.GetSeparateFrameSize will not work');
      return null;  
  END GetSeparateFrameSize;  
  
  PROCEDURE ShowMenuBar(showBar BOOLEAN) is
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUB_PACKAGE,'WUB_SHOWMENUBAR',WebUtil_Util.BoolToStr(showBar), true);
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUB_PACKAGE)
                              ||' bean not found. WEBUTIL_SEPARATEFRAME.ShowMenuBar will not work');
     RAISE FORM_TRIGGER_FAILURE;  
   when WebUtil_Core.PROPERTY_ERROR then 
     RAISE FORM_TRIGGER_FAILURE;   
  END ShowMenuBar;
  
  
  PROCEDURE ShowStatusBar(showBar BOOLEAN) is
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUB_PACKAGE,'WUB_SHOWSTATUSBAR',WebUtil_Util.BoolToStr(showBar), true);
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUB_PACKAGE)
                              ||' bean not found. WEBUTIL_SEPARATEFRAME.ShowStatusBar will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;   
  END ShowStatusBar;
  
  PROCEDURE SetTitle(title VARCHAR2) is 
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUB_PACKAGE,'WUB_SEPARATEFRAME_TITLE',title, true);
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUB_PACKAGE)
                              ||' bean not found. WEBUTIL_SEPARATEFRAME.SetTitle will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;   
  END SetTitle;


  PROCEDURE SetIcon(icon VARCHAR2) is
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUB_PACKAGE,'WUB_SEPARATEFRAME_ICON',icon, false);
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUB_PACKAGE)
                              ||' bean not found. WEBUTIL_SEPARATEFRAME.SetIcon will not work');
      RAISE FORM_TRIGGER_FAILURE;  
    when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;   
  END SetIcon;
  
  PROCEDURE AllowResize(allow BOOLEAN) is
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUB_PACKAGE,'WUB_SEPARATEFRAME_RESIZABLE',WebUtil_Util.BoolToStr(allow), true);
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUB_PACKAGE)
                              ||' bean not found. WEBUTIL_SEPARATEFRAME.AllowResize will not work');
      RAISE FORM_TRIGGER_FAILURE;  
   when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;   
  END AllowResize;
  
  PROCEDURE CenterMDI is 
  BEGIN
    CenterMDI(0);
  END CenterMDI;
  
  PROCEDURE CenterMDI(adjustY PLS_INTEGER) is
  BEGIN
    WebUtil_Core.setProperty(WebUtil_Core.WUB_PACKAGE,'WUB_SEPARATEFRAME_CENTER',to_char(adjustY), true);
  EXCEPTION  
    when WebUtil_Core.BEAN_NOT_REGISTERED then 
      WebUtil_Core.ErrorAlert(WebUtil_Core.getImplClass(WebUtil_Core.WUB_PACKAGE)
                              ||' bean not found. WEBUTIL_SEPARATEFRAME.CenterMDI will not work');
      RAISE FORM_TRIGGER_FAILURE;  
   when WebUtil_Core.PROPERTY_ERROR then 
      RAISE FORM_TRIGGER_FAILURE;   
  END CenterMDI;
       
BEGIN 
    -- Explicitly instanciate CORE
    WebUtil_Core.Init;  
END WEBUTIL_SEPARATEFRAME;
		*/
		/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool isseparateframe()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				if ( getContainer().getWebutilCore().getproperty(getWebutilcore().WUB_PACKAGE, toStr("WUB_SEPARATEFRAME_MODE")).equals("TRUE") )
//				{
//					return  toBool(NBool.True);
//				}
//				else {
//					return  toBool(NBool.False);
//				}
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUB_PACKAGE).append(" bean not found. WEBUTIL_SEPARATEFRAME.IsSeparateFrame will not work"));
//				return NBool.getNull();
//			}
//
			this.getLogger().trace(this, "F2J : isseparateframe function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NBool.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString getseparateframesize()
		{
			//F2J_WRAPPED_CODE : The code of this Function was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				return getContainer().getWebutilCore().getproperty(getWebutilcore().WUB_PACKAGE, toStr("WUB_APPLET_SIZE"));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUB_PACKAGE).append(" bean not found. WEBUTIL_SEPARATEFRAME.GetSeparateFrameSize will not work"));
//				return NString.getNull();
//			}
//
			this.getLogger().trace(this, "F2J : getseparateframesize function is not completely migrated yet. Please read the Migration Guide.");
			
			
			return NString.getNull();
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param showbar
		*/
		public void showmenubar(NBool showbar)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUB_PACKAGE, toStr("WUB_SHOWMENUBAR"), getContainer().getWebutilUtil().booltostr(showbar), toBool(NBool.True));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUB_PACKAGE).append(" bean not found. WEBUTIL_SEPARATEFRAME.ShowMenuBar will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
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
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUB_PACKAGE, toStr("WUB_SHOWSTATUSBAR"), getContainer().getWebutilUtil().booltostr(showbar), toBool(NBool.True));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUB_PACKAGE).append(" bean not found. WEBUTIL_SEPARATEFRAME.ShowStatusBar will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : showstatusbar procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param title
		*/
		public void settitle(NString title)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUB_PACKAGE, toStr("WUB_SEPARATEFRAME_TITLE"), title, toBool(NBool.True));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUB_PACKAGE).append(" bean not found. WEBUTIL_SEPARATEFRAME.SetTitle will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : settitle procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param icon
		*/
		public void seticon(NString icon)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUB_PACKAGE, toStr("WUB_SEPARATEFRAME_ICON"), icon, toBool(NBool.False));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUB_PACKAGE).append(" bean not found. WEBUTIL_SEPARATEFRAME.SetIcon will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : seticon procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param allow
		*/
		public void allowresize(NBool allow)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUB_PACKAGE, toStr("WUB_SEPARATEFRAME_RESIZABLE"), getContainer().getWebutilUtil().booltostr(allow), toBool(NBool.True));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUB_PACKAGE).append(" bean not found. WEBUTIL_SEPARATEFRAME.AllowResize will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : allowresize procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void centermdi()
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			centermdi(0);
//
			this.getLogger().trace(this, "F2J : centermdi procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param adjusty
		*/
		public void centermdi(NInteger adjusty)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			try
//			{
//				getContainer().getWebutilCore().setproperty(getWebutilcore().WUB_PACKAGE, toStr("WUB_SEPARATEFRAME_CENTER"), toChar(adjusty), toBool(NBool.True));
//			}
//			catch(getWebutilcore().BeanNotRegistered e)
//			{
//				getContainer().getWebutilCore().erroralert(getContainer().getWebutilCore().getimplclass(getWebutilcore().WUB_PACKAGE).append(" bean not found. WEBUTIL_SEPARATEFRAME.CenterMDI will not work"));
//				throw new ApplicationException();
//			}
//			catch(getWebutilcore().PropertyError e)
//			{
//				throw new ApplicationException();
//			}
//
			this.getLogger().trace(this, "F2J : centermdi procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		public WebutilSeparateframe() {
			//F2J_WRAPPED_CODE : The code of this Package Constructor was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			//  Explicitly instanciate CORE
//			getContainer().getWebutilCore().init();
//
			this.getLogger().trace(this, "F2J : WebutilSeparateframe Constructor is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
		
	
	
}
