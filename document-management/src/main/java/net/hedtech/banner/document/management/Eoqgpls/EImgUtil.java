package net.hedtech.banner.document.management.Eoqgpls;

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


public class EImgUtil extends AbstractSupportCodeObject {
	

	public EImgUtil(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public EoqgplsServices getContainer() {
		return (EoqgplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) E$_IMG_UTIL
	/*
	PACKAGE E$_IMG_UTIL IS

   PROCEDURE p_set_menu(load_setting_flag BOOLEAN DEFAULT TRUE);
      
   PROCEDURE p_pre_form_trigger_driver;
   PROCEDURE p_show_msg(msg VARCHAR2);

   FUNCTION  f_is_bxs_user RETURN BOOLEAN;
   FUNCTION  f_get_form_name(i INTEGER) RETURN VARCHAR2;
   FUNCTION  f_get_form_mode(i INTEGER) RETURN VARCHAR2;
   
   IMG_NOT_AX_USER_con CONSTANT VARCHAR2(300) := G$_NLS.Get('EOQRPLS-0001','LIB',
               'SCT Banner Document Management Suite is installed at your site, '    ||
               'but you are not set up as a user in that system.'           ||
               '  Please contact your Administrator for information.');   

END;
	*/
	
			public static final NString IMG_NOT_AX_USER_CON = GNls.Fget(toStr("EOQRPLS-0001"), toStr("LIB"), toStr("SCT Banner Document Management Suite is installed at your site, ").append("but you are not set up as a user in that system.").append("  Please contact your Administrator for information."));

			
		//Original PL/SQL code for Package Prog Unit (BODY) E$_IMG_UTIL
		/*
		PACKAGE BODY E$_IMG_UTIL IS

   ----------------------------------------------------------------------------------
   -- All configurable menuitems should be disabled in the inital state. Will enable
   -- when necessary
   ----------------------------------------------------------------------------------
   PROCEDURE p_set_menu(load_setting_flag BOOLEAN DEFAULT TRUE) IS 
   BEGIN
   	  NULL;
   END p_set_menu;     


   ----------------------------------------------------------------------------------
   -- This procedure is called in the pre-form trigger of every Banner form
   ----------------------------------------------------------------------------------
   PROCEDURE p_pre_form_trigger_driver IS
   BEGIN
      NULL;
   END;		
   
   ----------------------------------------------------------------------------------
   -- This function return a boolean value to indicate whether current user is 
   -- a BDMS user.
   -- If BDMS is not installed, this function returns false
   ----------------------------------------------------------------------------------
   FUNCTION f_is_bxs_user RETURN BOOLEAN IS
   BEGIN
 	    RETURN FALSE;
   END;

   ----------------------------------------------------------------------------------
   -- Shows a message in an alert box
   ----------------------------------------------------------------------------------
   PROCEDURE p_show_msg(msg VARCHAR2) IS
      alert_info  ALERT;
      num         INTEGER;
   BEGIN
   	  IF (NOT msg IS NULL) THEN
   	     alert_info := FIND_ALERT('G$_EXTEND_SOLUT_ALERT');
   	     IF ID_NULL(alert_info) THEN
   	        MESSAGE(msg);
   	     ELSE   	
            SET_ALERT_PROPERTY(alert_info, ALERT_MESSAGE_TEXT, msg);
            --SET_ALERT_PROPERTY(alert_info, TITLE, 'XtenderSolutions');
            num := SHOW_ALERT(alert_info);	   	  
         END IF;   
      END IF;   
   END;   
   
   ----------------------------------------------------------------------------------
   -- Gets the form name based on the index value.
   -- RETURNS: 'EXAUPRF' if i = 0
   -- Note: We may have more BDMS user forms in future release
   ----------------------------------------------------------------------------------
   FUNCTION  f_get_form_name(i INTEGER) RETURN VARCHAR2 IS
   BEGIN
   	  RETURN NULL;
   END;
   
   
   ----------------------------------------------------------------------------------
   -- Gets the form invoking mode based on the index value.
   -- RETURNS: '' if i = 0
   -- Note: We may have more BDMS user forms in future release
   ----------------------------------------------------------------------------------
   FUNCTION  f_get_form_mode(i INTEGER) RETURN VARCHAR2 IS
   BEGIN
   	  RETURN NULL;
   END;	
   
END;
		*/
		/* <p>
		* --------------------------------------------------------------------------------
		*  All configurable menuitems should be disabled in the inital state. Will enable
		*  when necessary
		* --------------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void pSetMenu() {
			pSetMenu(toBool(NBool.True));
		}

/* <p>
		* --------------------------------------------------------------------------------
		*  All configurable menuitems should be disabled in the inital state. Will enable
		*  when necessary
		* --------------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param loadSettingFlag
		*/
		public void pSetMenu(NBool loadSettingFlag)
		{
			
			
		}
/* <p>
		* --------------------------------------------------------------------------------
		*  This procedure is called in the pre-form trigger of every Banner form
		* --------------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void pPreFormTriggerDriver()
		{

		}
/* <p>
		* --------------------------------------------------------------------------------
		*  This function return a boolean value to indicate whether current user is 
		*  a BDMS user.
		*  If BDMS is not installed, this function returns false
		* --------------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool fIsBxsUser()
		{

			return  toBool(NBool.False);

		}
/* <p>
		* --------------------------------------------------------------------------------
		*  Shows a message in an alert box
		* --------------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param msg
		*/
		public void pShowMsg(NString msg)
		{
			//F2J_WRAPPED_CODE : The code of this Procedure was commented out so that you can migrate, compile and check your code in an iterative way.
//
//			AlertDescriptor alertInfo= null;
//			NInteger num= NInteger.getNull();
//			if ((! (msg.isNull())))
//			{
//				alertInfo = findAlert("G$_EXTEND_SOLUT_ALERT");
//				if ( (alertInfo == null) )
//				{
//					message(msg);
//				}
//				else {
//					setAlertMessageText(alertInfo, msg);
//					// SET_ALERT_PROPERTY(alert_info, TITLE, 'XtenderSolutions');
//					num = toInt(showAlert(alertInfo));
//				}
//			}
//
			this.getLogger().trace(this, "F2J : pShowMsg procedure is not completely migrated yet. Please read the Migration Guide.");
			
			
		}
/* <p>
		* --------------------------------------------------------------------------------
		*  Gets the form name based on the index value.
		*  RETURNS: 'EXAUPRF' if i = 0
		*  Note: We may have more BDMS user forms in future release
		* --------------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param i
		*/
		public NString fGetFormName(NInteger i)
		{

			return NString.getNull();
		}
/* <p>
		* --------------------------------------------------------------------------------
		*  Gets the form invoking mode based on the index value.
		*  RETURNS: '' if i = 0
		*  Note: We may have more BDMS user forms in future release
		* --------------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param i
		*/
		public NString fGetFormMode(NInteger i)
		{

			
			return NString.getNull();
		}
		
	
	
}
