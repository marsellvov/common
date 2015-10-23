package net.hedtech.general.common.libraries.Eoqepls;

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
	public EoqeplsServices getContainer() {
		return (EoqeplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) E$_IMG_UTIL
	/*
	PACKAGE E$_IMG_UTIL IS

   PROCEDURE p_set_menu(load_setting_flag BOOLEAN DEFAULT TRUE);
   PROCEDURE p_pre_form_trigger_driver;
   
   FUNCTION f_is_bxs_user RETURN BOOLEAN;
   FUNCTION f_get_form_name(i INTEGER) RETURN VARCHAR2;
   FUNCTION f_get_form_mode(i INTEGER) RETURN VARCHAR2;

   -- User preference related 
   FUNCTION f_load_setting RETURN VARCHAR2;
   FUNCTION f_get_data_source RETURN VARCHAR2;
   FUNCTION f_get_invokes RETURN VARCHAR2;
   FUNCTION f_get_doc_src RETURN NUMBER;
   FUNCTION f_get_ax_root_url RETURN VARCHAR2;
   FUNCTION f_get_wx_root_url RETURN VARCHAR2;
   
   PROCEDURE p_show_msg(msg VARCHAR2);   
	 FUNCTION f_get_credentials_url(encoding 	VARCHAR2 DEFAULT 'HEX', 
	                                flag 			BOOLEAN DEFAULT TRUE) RETURN VARCHAR2;
 	 
 	 FUNCTION f_is_wx_dotnet RETURN BOOLEAN;
   FUNCTION f_append_url_param(url IN VARCHAR2, param IN VARCHAR2) RETURN VARCHAR2;
   FUNCTION f_replace_string(s VARCHAR2, s1 VARCHAR2, s2 VARCHAR2) RETURN VARCHAR2;

   ---------------------------------------------------------------------------------
   -- BDMS error message constants
   ---------------------------------------------------------------------------------
   <multilinecomment> NO_WX_ROOT_URL_con CONSTANT VARCHAR2(200) :=
               'The root URL to invoke WebXtender(tm) is missing '         ||
               'from the Banner Document Management Suite Systems Settings form '   ||
               '(EXAINST). WebXtender cannot be invoked.' ;
               </multilinecomment>
    --Commented the above the with the below as part of product rebranding for BDM 8.5
              
 NO_WX_ROOT_URL_con CONSTANT VARCHAR2(200) :=
               'The root URL to invoke Web Access is missing '         ||
               'from the BDM  Systems Settings form '   ||
               '(EXAINST). ApplicationXtender Web Access .NET cannot be invoked.' ;

  <multilinecomment> NO_AX_ROOT_URL_con CONSTANT VARCHAR2(200) :=
               'The root URL to invoke ApplicationXtender(tm) is missing '         ||
               'from the Banner Document Management Suite Systems Settings form '   ||
               '(EXAINST).  ApplicationXtender cannot be invoked.' ; </multilinecomment>

     --Commented the above the with the below as part of product rebranding for BDM 8.5
               
NO_AX_ROOT_URL_con CONSTANT VARCHAR2(200) :=
               'The root URL to invoke ApplicationXtender Document Manager is missing '   ||
               'from the BDM Systems Settings form '   ||
               '(EXAINST). ApplicationXtender Document Manager cannot be invoked.' ;


<multilinecomment>
   UNABLE_TO_GET_USER_PREF_con CONSTANT VARCHAR2(200) := 
               'Unable to retrieve Banner Document Management Suite User Preference settings.'; </multilinecomment>
               
                --Commented the above the with the below as part of product rebranding for BDM 8.5
               
               UNABLE_TO_GET_USER_PREF_con CONSTANT VARCHAR2(200) := 
               'Unable to retrieve Banner Document Management User Preference settings.';
               
               

   AX_NOT_INSTALLED_con CONSTANT VARCHAR2(200) := 
               'ApplicationXtender is not installed on this workstation.';   
               
   OTGSCTHK_NOT_INSTALLED_con CONSTANT VARCHAR2(200) := 
               'OtgSctHk.dll in not installed/registered on this workstation.';

   <multilinecomment> IMG_NO_RULES_EXIST_con    CONSTANT VARCHAR2(100) :=
         'No Banner Document Management Suite Context Rules apply to this location.'; </multilinecomment>
        
         --Commented the above the with the below as part of product rebranding for BDM 8.5
         
         IMG_NO_RULES_EXIST_con    CONSTANT VARCHAR2(100) :=
         'No Banner Document Management Context Rules apply to this location.';
   
   <multilinecomment>
   IMG_NOT_AX_USER_con   CONSTANT VARCHAR2(300) :=
               'Banner Document Management Suite is installed at your site, '    ||
               'but you are not set up as a user in that system.'           ||
               '  Please contact your Administrator for information.' ; </multilinecomment>
               
               --Commented the above the with the below as part of product rebranding for BDM 8.5
               
               IMG_NOT_AX_USER_con   CONSTANT VARCHAR2(300) :=
               'Banner Document Management is installed at your site, '    ||
               'but you are not set up as a user in that system.'           ||
               '  Please contact your Administrator for information.' ;
   <multilinecomment>
   BXS_MENU_ERROR_con CONSTANT VARCHAR2(300) :=
               'Unable to set Banner Document Management Suite menu.';
               
   BXS_UNRECOGNIZED_PARAMS_con CONSTANT VARCHAR2(300) := 
               'Unrecogonized Banner Document Management Suite parameters.';
               
   BXS_UNHANDLED_EXCEPTION_con CONSTANT VARCHAR2(300) := 
               'Unhandled BDMS exceptions. Please contact your system administrator.';</multilinecomment>
               
    --Replaced the above 3 lines with the below as part of product rebranding for BDM 8.5   
            
               BXS_MENU_ERROR_con CONSTANT VARCHAR2(300) :=
               'Unable to set Banner Document Management menu.';
               
   BXS_UNRECOGNIZED_PARAMS_con CONSTANT VARCHAR2(300) := 
               'Unrecogonized Banner Document Management parameters.';
               
   BXS_UNHANDLED_EXCEPTION_con CONSTANT VARCHAR2(300) := 
               'Unhandled BDM exceptions. Please contact your system administrator.';
               
-- end
--

   BXS_WX_COUNT_ERROR_con CONSTANT VARCHAR2(300) := 
               'Unable to get the count of matched documents from ApplicationXtender Web Access .NET server.';     

   BXS_UNKNOWN_COUNT_ERROR_con CONSTANT VARCHAR2(300) := 
               'Unknown exception occured when retrieving the count of matched documents.';    
               
   <multilinecomment> BXS_PASSWORD_SYNC_con CONSTANT VARCHAR2(300) := 
                'Your BDMS password has been automatically synchronized with your Banner password. ' ||
                'You must use your Banner password if you wish to access AX / WX directly.' ;
                </multilinecomment>
                
                --Replaced the above 3 lines with the below as part of product rebranding for BDM 8.5   
                
                BXS_PASSWORD_SYNC_con CONSTANT VARCHAR2(300) := 
                'Your BDM password has been automatically synchronized with your Banner password. ' ||
                'You must use your Banner password if you wish to access ApplicationXtender Document Manager or Web Access.' ;              

   BXS_WX_SSO_KEY_NULL_con CONSTANT VARCHAR2(255) :=
               'The single sign-on key is not set in EXAINST';

   --
   -- Document Count related constant
   --    
   DOC_COUNT_ERROR            CONSTANT INTEGER := -1;
   DOC_COUNT_NO_CONTEXT_RULES CONSTANT INTEGER := -2;
   DOC_COUNT_INB_TO_AX        CONSTANT INTEGER := -4;
END;
	*/
	
			// -------------------------------------------------------------------------------
		//  BDMS error message constants
		// -------------------------------------------------------------------------------
		//  NO_WX_ROOT_URL_con CONSTANT VARCHAR2(200) :=
		// 'The root URL to invoke WebXtender(tm) is missing '         ||
		// 'from the Banner Document Management Suite Systems Settings form '   ||
		// '(EXAINST). WebXtender cannot be invoked.' ;
		// Commented the above the with the below as part of product rebranding for BDM 8.5
		public static final NString NO_WX_ROOT_URL_CON = toStr("The root URL to invoke Web Access is missing ").append("from the BDM  Systems Settings form ").append("(EXAINST). ApplicationXtender Web Access .NET cannot be invoked.");
		//  NO_AX_ROOT_URL_con CONSTANT VARCHAR2(200) :=
		// 'The root URL to invoke ApplicationXtender(tm) is missing '         ||
		// 'from the Banner Document Management Suite Systems Settings form '   ||
		// '(EXAINST).  ApplicationXtender cannot be invoked.' ; 
		// Commented the above the with the below as part of product rebranding for BDM 8.5
		public static final NString NO_AX_ROOT_URL_CON = toStr("The root URL to invoke ApplicationXtender Document Manager is missing ").append("from the BDM Systems Settings form ").append("(EXAINST). ApplicationXtender Document Manager cannot be invoked.");
		// UNABLE_TO_GET_USER_PREF_con CONSTANT VARCHAR2(200) :=
		// 'Unable to retrieve Banner Document Management Suite User Preference settings.'; 
		// Commented the above the with the below as part of product rebranding for BDM 8.5
		public static final NString UNABLE_TO_GET_USER_PREF_CON = toStr("Unable to retrieve Banner Document Management User Preference settings.");
		public static final NString AX_NOT_INSTALLED_CON = toStr("ApplicationXtender is not installed on this workstation.");
		public static final NString OTGSCTHK_NOT_INSTALLED_CON = toStr("OtgSctHk.dll in not installed/registered on this workstation.");
		//  IMG_NO_RULES_EXIST_con    CONSTANT VARCHAR2(100) :=
		// 'No Banner Document Management Suite Context Rules apply to this location.'; 
		// Commented the above the with the below as part of product rebranding for BDM 8.5
		public static final NString IMG_NO_RULES_EXIST_CON = toStr("No Banner Document Management Context Rules apply to this location.");
		// IMG_NOT_AX_USER_con   CONSTANT VARCHAR2(300) :=
		// 'Banner Document Management Suite is installed at your site, '    ||
		// 'but you are not set up as a user in that system.'           ||
		// '  Please contact your Administrator for information.' ; 
		// Commented the above the with the below as part of product rebranding for BDM 8.5
		public static final NString IMG_NOT_AX_USER_CON = toStr("Banner Document Management is installed at your site, ").append("but you are not set up as a user in that system.").append("  Please contact your Administrator for information.");
		// BXS_MENU_ERROR_con CONSTANT VARCHAR2(300) :=
		// 'Unable to set Banner Document Management Suite menu.';
		// BXS_UNRECOGNIZED_PARAMS_con CONSTANT VARCHAR2(300) :=
		// 'Unrecogonized Banner Document Management Suite parameters.';
		// BXS_UNHANDLED_EXCEPTION_con CONSTANT VARCHAR2(300) :=
		// 'Unhandled BDMS exceptions. Please contact your system administrator.';
		// Replaced the above 3 lines with the below as part of product rebranding for BDM 8.5   
		public static final NString BXS_MENU_ERROR_CON = toStr("Unable to set Banner Document Management menu.");
		public static final NString BXS_UNRECOGNIZED_PARAMS_CON = toStr("Unrecogonized Banner Document Management parameters.");
		public static final NString BXS_UNHANDLED_EXCEPTION_CON = toStr("Unhandled BDM exceptions. Please contact your system administrator.");
		//  end
		// 
		public static final NString BXS_WX_COUNT_ERROR_CON = toStr("Unable to get the count of matched documents from ApplicationXtender Web Access .NET server.");
		public static final NString BXS_UNKNOWN_COUNT_ERROR_CON = toStr("Unknown exception occured when retrieving the count of matched documents.");
		//  BXS_PASSWORD_SYNC_con CONSTANT VARCHAR2(300) :=
		// 'Your BDMS password has been automatically synchronized with your Banner password. ' ||
		// 'You must use your Banner password if you wish to access AX / WX directly.' ;
		// Replaced the above 3 lines with the below as part of product rebranding for BDM 8.5   
		public static final NString BXS_PASSWORD_SYNC_CON = toStr("Your BDM password has been automatically synchronized with your Banner password. ").append("You must use your Banner password if you wish to access ApplicationXtender Document Manager or Web Access.");
		public static final NString BXS_WX_SSO_KEY_NULL_CON = toStr("The single sign-on key is not set in EXAINST");
		// 
		//  Document Count related constant
		//     
		public static final NInteger DOC_COUNT_ERROR = toInt(-1);
		public static final NInteger DOC_COUNT_NO_CONTEXT_RULES = toInt(-2);
		public static final NInteger DOC_COUNT_INB_TO_AX = toInt(-4);

			
		//Original PL/SQL code for Package Prog Unit (BODY) E$_IMG_UTIL
		/*
		PACKAGE BODY E$_IMG_UTIL IS
   --=======================================================================================
   -- Private package variables definition
   --=======================================================================================

   -- The encryption keys used for single login
   SCT_BXS_KEY CONSTANT VARCHAR2(64) := 'E73406AA-3424-42d0-8412-7C82B8237F00';
   wx_sso_key VARCHAR2(64);
                  
   -- User preference related variables
   v_upref_enabled exbinst.exbinst_allow_uprf_ind%TYPE;   
   v_data_source   exbinst.exbinst_data_source_name%TYPE;
   v_ax_root_url   exbinst.exbinst_ax_root%TYPE;
   v_wx_root_url   exbinst.exbinst_web_ext_root%TYPE;
   v_csb_invokes   exbuprf.exbuprf_csb_invokes%TYPE;
   v_inb_invokes   exbuprf.exbuprf_inb_invokes%TYPE;
   v_ax_doc_src    exbuprf.exbuprf_ax_doc_source%TYPE;
   v_wx_doc_src    exbuprf.exbuprf_wx_doc_source%TYPE;
   v_invokes       exbuprf.exbuprf_csb_invokes%TYPE;
   v_doc_src       exbuprf.exbuprf_ax_doc_source%TYPE;

   ----------------------------------------------------------------------------------
   -- PURPOSE:    Checks whether OTGSCTHK.dll and AX are installed on the local PC. 
   --             This procedure should be used by C/S Banner only
   -- PARAMETERS: is_otgscthk_installed, boolean, true if OtgSctHk.dll is installed
   --   	        is_ax_installed, boolean, true if AX is installed
   -- RETURN:     None
   -- EXCEPTIONS: None
   ----------------------------------------------------------------------------------
   PROCEDURE check_ax(is_otgscthk_installed OUT BOOLEAN, is_ax_installed OUT BOOLEAN) IS
      obj    OLE2.OBJ_TYPE;
      num    NUMBER;
   BEGIN
   	
   	
   	  is_otgscthk_installed := FALSE;
   	  is_ax_installed       := FALSE;
   	  
   	  obj := OLE2.CREATE_OBJ('OTGSCTHK.CMAccess');
  	  num := OLE2.INVOKE_NUM(obj, 'IsAXInstalled');
   	  is_otgscthk_installed := TRUE;
   	  IF (num <> 0) THEN
   	     is_ax_installed := TRUE;
   	  END IF;
   	  
   	  OLE2.RELEASE_OBJ(obj);
   	  
      RETURN;
      
      
   EXCEPTION
   	  	
   	  WHEN OTHERS THEN
   	     RETURN;
   END;   
	 
   --------------------------------------------------------------------------------
   -- PURPOSE:    Retrieve the SSO key from the system settings table
   -- PARAMETERS: None
   -- RETURN:     The plain text SSO key
   -- EXCEPTIONS: None
   --------------------------------------------------------------------------------   
   FUNCTION f_get_sso_key RETURN VARCHAR2 IS
      s VARCHAR2(64);
   BEGIN
   	
   	  SELECT eoksecr.f_decrypt(exbinst_sso_key, 'w9FUxoM4') INTO s FROM exbinst;
      RETURN s;
      
      
   EXCEPTION
   	  WHEN OTHERS THEN
   	     RETURN NULL;
   END;
   
   ------------------------------------------------------------------------------
   -- PURPOSE:    Generates the credential string to support single login.
   -- PARAMETERS: encoding, 'HEX', use HEX encoding 
   --                       'BASE64', use BASE64 encoding
   --             flag, 		boolean
   -- RETURN:     The credential string to be appended to the original URL
   -- EXCEPTIONS: None
   ------------------------------------------------------------------------------
	 FUNCTION f_get_credentials_url(encoding 	VARCHAR2 DEFAULT 'HEX', 
	                                flag 			BOOLEAN DEFAULT TRUE) RETURN VARCHAR2 IS
	    url                     VARCHAR2(1024) DEFAULT NULL;
	    uname                   VARCHAR2(64);
	    passwd                  VARCHAR2(64);
      forms_server_on_windows BOOLEAN;
      encryption_key          VARCHAR2(64);
      result                  VARCHAR2(1024) DEFAULT NULL;
      r                       RAW(500);
   BEGIN
   	
   	
   	
   	  IF (wx_sso_key IS NULL) THEN
   	  	 wx_sso_key := f_get_sso_key();
   	  	 IF (wx_sso_key IS NULL) THEN
            p_show_msg(BXS_WX_SSO_KEY_NULL_con);	  	 
   	  	    RETURN NULL;
   	  	 END IF;   
   	  END IF;	
   	  
   	  IF (flag) THEN
		     uname 					:= GET_APPLICATION_PROPERTY(USERNAME);
		     passwd 				:= GET_APPLICATION_PROPERTY(PASSWORD);
		     encryption_key := wx_sso_key;
   	  ELSE
   	  	 uname  				:= wx_sso_key;
   	  	 passwd 				:= NULL;
   	  	 encryption_key := SCT_BXS_KEY;
   	  END IF;	
	 	
	  	url := eoksecr.f_generate_credentials(uname, passwd, encryption_key);
	  	
	  	IF (NOT url is NULL) THEN
	  		 IF (encoding = 'BASE64') THEN
	  		 	  url := SUBSTR(url, 4);
            r   := UTL_ENCODE.BASE64_ENCODE(hextoraw(url));
            url := UTL_RAW.CAST_TO_VARCHAR2(r);
            -- Remove =, CR, and LF character added by Oracle's BASE64_ENCODE function 
            url := REPLACE(url, CHR(13));
            url := REPLACE(url, CHR(10));
            url := REPLACE(url, '=', '-');
            -- url := UTL_URL.ESCAPE(url, TRUE); Defect 8.2
            url := GOKDBMS.URL_ESCAPE(url);
	  		 END IF;
	  		 
	  	   IF (flag) THEN	    
			      result := 'Credentials=' || url;	
	  	   ELSE
	  		    result := '__K=' || url;	
	  	   END IF;
	  	END IF;   
	  	
	  	RETURN result;
	  	
	  	
   END f_get_credentials_url;


   ------------------------------------------------------------------------------
   -- PURPOSE:    Loads BDMS system and user setting and stores them into private
   --             package variables
   -- PARAMETERS: wx_url_str  VARCHAR2, the URL used to launch WX  
   -- RETURN:     error message. If no error, then NULL is returned
   -- EXCEPTIONS: none
   ------------------------------------------------------------------------------
   FUNCTION f_load_setting RETURN VARCHAR2 IS
      IsAXInstalled            BOOLEAN;
      IsOtgSctHkInstalled      BOOLEAN;
      INST_CODES VARCHAR2(25); --RS  datasource modification for MEP 
      lv_process_code   VARCHAR2(06) := SYS_CONTEXT('g$_vpdi_process_context','vpdi_process_code');--RS  datasource modification for MEP 
   BEGIN
   	
   	
   	  
	    IF (NOT eokutil.f_get_bxs_setting(
	    	                       v_upref_enabled,
	    	                       v_data_source ,
                               v_ax_root_url , 
                               v_wx_root_url , 
                               v_csb_invokes , 
                               v_inb_invokes , 
                               v_ax_doc_src ,
                               v_wx_doc_src)) THEN
         return UNABLE_TO_GET_USER_PREF_con;
	    END IF;   
	    
      ---RS  datasource modification for MEP starts
      IF G$_VPDI_SECURITY.g$_is_mif_enabled 
      	
      THEN
      
         INST_CODES := GSPVPDI.get_mif_default_code_for_user(SYS_CONTEXT('USERENV','SESSION_USER'));
          IF INST_CODES <> lv_process_code
		      THEN
		      		v_data_source := v_data_source||'_'||lv_process_code ;
		      ELSE	
		      		v_data_source := v_data_source||'_'||INST_CODES ;           
		      END IF;
      END IF;  
      ---RS  datasource modification for MEP ends
   
	    IF (e$_env_is_web()) THEN
	    	 v_invokes := v_inb_invokes;
	    ELSE
	    	 v_invokes := v_csb_invokes;
	    END IF;
	    
	    IF (v_invokes = 'AX') THEN
	    	 v_doc_src := v_ax_doc_src;
	    ELSE
	    	 v_doc_src := v_wx_doc_src;
	    END IF;
	    
      -- Check root URL settings	
      IF (v_invokes = 'WX') AND (v_wx_root_url IS NULL) THEN
      	 RETURN NO_WX_ROOT_URL_con;
      END IF;
      
      IF (v_invokes = 'AX') AND e$_env_is_web() AND v_ax_root_url IS NULL THEN
      	 RETURN NO_AX_ROOT_URL_con;
      END IF;


 	    -- Check AX and OtgSctHk.dll installation status for C/S Banner
 	    IF (NOT e$_env_is_web()) THEN
         check_ax(IsOtgSctHkInstalled, IsAxInstalled);      	

       	 IF (NOT IsOtgSctHkInstalled) THEN
            RETURN OTGSCTHK_NOT_INSTALLED_con;
         END IF;

         IF (v_invokes = 'AX' AND NOT IsAxInstalled) THEN
         	  RETURN AX_NOT_INSTALLED_con;
         END IF;	  
 	    END IF;
	    
   	  RETURN NULL;
   	  
   END;
   

   ----------------------------------------------------------------------------------
   -- Return the data source
   ----------------------------------------------------------------------------------
   FUNCTION f_get_data_source RETURN VARCHAR2 IS
   BEGIN
   	
   	  return v_data_source;
   	
   END;

   ----------------------------------------------------------------------------------
   -- Return AX/WX to be invoked in current setting
   ----------------------------------------------------------------------------------
   FUNCTION f_get_invokes RETURN VARCHAR2 IS
   BEGIN
   	  return v_invokes;
   END;

   ----------------------------------------------------------------------------------
   -- Return the new doc source
   ----------------------------------------------------------------------------------
   FUNCTION f_get_doc_src RETURN NUMBER IS
   BEGIN
   	  return v_doc_src;
   END;

   ----------------------------------------------------------------------------------
   -- Return the AX root URL
   ----------------------------------------------------------------------------------
   FUNCTION f_get_ax_root_url RETURN VARCHAR2 IS
   BEGIN
   	  return v_ax_root_url;
   END;

   ----------------------------------------------------------------------------------
   -- Return the AX root URL
   ----------------------------------------------------------------------------------
   FUNCTION f_get_wx_root_url RETURN VARCHAR2 IS
   BEGIN
   	  return v_wx_root_url;
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
   -- All configurable menuitems should be disabled in the inital state. Will enable
   -- when necessary
   ----------------------------------------------------------------------------------
   PROCEDURE p_set_menu(load_setting_flag BOOLEAN DEFAULT TRUE) IS 
      is_bxs_enabled   VARCHAR2(1) DEFAULT 'N';
      is_ax_user       VARCHAR2(1) DEFAULT 'N';
      msg              VARCHAR2(1000);
      menu_item_name   VARCHAR2(64);
   BEGIN
   	  
   	  IF (load_setting_flag) THEN
   	     msg := f_load_setting();
         -- Ignore system setting error message here
    	   msg := null;
    	END IF;   
   	    
   	  efkimag.p_get_bax_enabled_ind(NULL, is_bxs_enabled, msg);
    	p_show_msg(msg);
    	msg := null;
   	  
      IF (is_bxs_enabled = 'Y') THEN
      	
      	 -- Enables Tools menu and BDMS menu
         SET_MENU_ITEM_PROPERTY('Main.Tools', ENABLED, PROPERTY_TRUE);
   	     SET_MENU_ITEM_PROPERTY('TOOLS.BXS',  ENABLED, PROPERTY_TRUE);
   	     
   	     IF (v_upref_enabled = 'Y') THEN
   	     	  SET_MENU_ITEM_PROPERTY('BXS.PREFERENCES', ENABLED, PROPERTY_TRUE);
   	     ELSE	  
   	     	  SET_MENU_ITEM_PROPERTY('BXS.PREFERENCES', ENABLED, PROPERTY_FALSE);
   	     END IF;	

   	     -- AX or WX
   	     IF (v_invokes = 'WX') THEN
   	     	  SET_MENU_ITEM_PROPERTY('BXS_SUBMENU_1.SCAN', ENABLED, PROPERTY_FALSE); 
   	     	  SET_MENU_ITEM_PROPERTY('BXS_SUBMENU_1.CLIPBOARD_PASTE', ENABLED, PROPERTY_FALSE); 
   	     	  SET_MENU_ITEM_PROPERTY('BXS_SUBMENU_1.CLIPBOARD_PASTE_SPECIAL', ENABLED, PROPERTY_FALSE); 
   	     	  SET_MENU_ITEM_PROPERTY('BXS_SUBMENU_1.INSERT_OBJECTS', ENABLED, PROPERTY_FALSE); 
   	     	  SET_MENU_ITEM_PROPERTY('BXS_SUBMENU_1.IMPORT_FILE', ENABLED, PROPERTY_TRUE); 
   	     	  SET_MENU_ITEM_PROPERTY('BXS_SUBMENU_1.FAXIN_QUEUE', ENABLED, PROPERTY_FALSE); 
   	     ELSE
   	     	  SET_MENU_ITEM_PROPERTY('BXS_SUBMENU_1.SCAN', ENABLED, PROPERTY_TRUE); 
   	     	  SET_MENU_ITEM_PROPERTY('BXS_SUBMENU_1.CLIPBOARD_PASTE', ENABLED, PROPERTY_TRUE); 
   	     	  SET_MENU_ITEM_PROPERTY('BXS_SUBMENU_1.CLIPBOARD_PASTE_SPECIAL', ENABLED, PROPERTY_TRUE); 
   	     	  SET_MENU_ITEM_PROPERTY('BXS_SUBMENU_1.INSERT_OBJECTS', ENABLED, PROPERTY_TRUE); 
   	     	  SET_MENU_ITEM_PROPERTY('BXS_SUBMENU_1.IMPORT_FILE', ENABLED, PROPERTY_TRUE); 
   	     	  SET_MENU_ITEM_PROPERTY('BXS_SUBMENU_1.FAXIN_QUEUE', ENABLED, PROPERTY_TRUE); 
   	     END IF;
   	     
   	     -- DEFAULT NEW DOC SOURCE
	    	 SET_MENU_ITEM_PROPERTY('BXS_SUBMENU_1.SCAN', CHECKED, PROPERTY_FALSE); 
   	     SET_MENU_ITEM_PROPERTY('BXS_SUBMENU_1.CLIPBOARD_PASTE', CHECKED, PROPERTY_FALSE); 
   	     SET_MENU_ITEM_PROPERTY('BXS_SUBMENU_1.CLIPBOARD_PASTE_SPECIAL', CHECKED, PROPERTY_FALSE); 
   	     SET_MENU_ITEM_PROPERTY('BXS_SUBMENU_1.INSERT_OBJECTS', CHECKED, PROPERTY_FALSE); 
   	     SET_MENU_ITEM_PROPERTY('BXS_SUBMENU_1.IMPORT_FILE', CHECKED, PROPERTY_FALSE); 
   	     SET_MENU_ITEM_PROPERTY('BXS_SUBMENU_1.FAXIN_QUEUE', CHECKED, PROPERTY_FALSE); 
   	     
   	     IF (v_doc_src = 9) THEN
   	        menu_item_name := 'CLIPBOARD_PASTE';
   	     ELSIF (v_doc_src = 10) THEN 
   	     	  menu_item_name := 'CLIPBOARD_PASTE_SPECIAL';
   	     ELSIF (v_doc_src = 11) THEN 
   	        menu_item_name := 'INSERT_OBJECTS';
   	     ELSIF (v_doc_src = 13) THEN 
   	        menu_item_name := 'SCAN';
   	     ELSIF (v_doc_src = 14) THEN 
   	        menu_item_name := 'FAXIN_QUEUE';
   	     ELSE   
   	        menu_item_name := 'IMPORT_FILE';
   	     END IF;
   	     
   	     menu_item_name := 'BXS_SUBMENU_1.' || menu_item_name;
   	     SET_MENU_ITEM_PROPERTY(menu_item_name, CHECKED, PROPERTY_TRUE); 
   	     
         SET_MENU_ITEM_PROPERTY('Icons.BXS',      ENABLED, PROPERTY_TRUE);
  	     SET_MENU_ITEM_PROPERTY('Icons.BXS_PLUS', ENABLED, PROPERTY_TRUE);
   	     
      END IF;      
      
      
   END p_set_menu;     
  	
   ----------------------------------------------------------------------------------
   -- The trigger is called by pre-form trigger of all Banner forms. 
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
      is_bxs_user   VARCHAR2(1)   DEFAULT 'N';      
      msg           VARCHAR2(300) DEFAULT NULL;
      flag          BOOLEAN;      
   BEGIN
      efkimag.p_is_user_ax_user('OTGMGR', USER, is_bxs_user, msg);
 	    IF (is_bxs_user <> 'Y' and USER <> 'BASELINE') THEN
 	       flag := FALSE;
 	    ELSE
 	    	 flag := TRUE;
 	    END IF;
 	    
 	    RETURN flag;
   END;
   
   ----------------------------------------------------------------------------------
   -- Gets the form name based on the index value.
   -- RETURNS: 'EXAUPRF' if i = 0
   -- Note: We may have more BDMS user forms in future release
   ----------------------------------------------------------------------------------
   FUNCTION  f_get_form_name(i INTEGER) RETURN VARCHAR2 IS
      form_name VARCHAR2(32) DEFAULT NULL;
   BEGIN
   	  IF (i = 0) THEN
   	  	  form_name := 'EXAUPRF';
   	  END IF;	  
   	  
   	  RETURN form_name;
   END;
   
   
   ----------------------------------------------------------------------------------
   -- Gets the form invoking mode based on the index value.
   -- RETURNS: '' if i = 0
   -- Note: We may have more BDMS user forms in future release
   ----------------------------------------------------------------------------------
   FUNCTION  f_get_form_mode(i INTEGER) RETURN VARCHAR2 IS
      form_mode VARCHAR2(32) DEFAULT NULL;
   BEGIN
   	  IF (i = 0) THEN
   	  	  form_mode := '';
   	  END IF;	  
   	  
   	  RETURN form_mode;
   END;	
   

   ----------------------------------------------------------------------------------
   -- Returns true if WX Root is a WX .NET url
   -- Otherwise, return false	
   ----------------------------------------------------------------------------------
 	 FUNCTION f_is_wx_dotnet RETURN BOOLEAN IS
 	    is_wx_dotnet BOOLEAN DEFAULT TRUE;
   BEGIN
   	  IF ((v_wx_root_url IS NOT NULL) AND (INSTR(LOWER(v_wx_root_url),'servlet') > 0)) THEN
   	  	 is_wx_dotnet := FALSE;
   	  END IF;	
   	  
   	  RETURN is_wx_dotnet;
   END;
   
   --------------------------------------------------------------------------------
   -- PURPOSE:   Append a parameter to a URL. This function adds "?" or "&" as seperator
   --            depending on the original URL
   -- PARAMETER: url, the URL
   --            param, the parameter string to be appended
   -- RETURN:    A new url with param appended to the end of the original url   
   --------------------------------------------------------------------------------   
   FUNCTION f_append_url_param(url IN VARCHAR2, param IN VARCHAR2) RETURN VARCHAR2 IS
      v_url VARCHAR2(1024);
   BEGIN
      IF INSTR(url, '?') = 0 THEN
         v_url := url || '?';
      ELSE
         v_url := url || '&';
      END IF;
      v_url := v_url || param;
      
      RETURN v_url;
   END;


   --------------------------------------------------------------------------------
   -- PURPOSE:   Replace a string with another string
   -- PARAMETER: s, a string 
   --            s1, the string to be replaced
   --            s2, the string to replace s1 with
   -- RETURN:    a new string 
   --------------------------------------------------------------------------------   
   FUNCTION f_replace_string(s VARCHAR2, s1 VARCHAR2, s2 VARCHAR2) RETURN VARCHAR2 IS
      t   VARCHAR2(1024);
      i   INTEGER;
   BEGIN
   	  t := s;
   	  i := INSTR(LOWER(s), LOWER(s1));
   	  IF (i>0) THEN
   	  	 t := SUBSTR(s,1,i-1) || s2 || SUBSTR(s,i+LENGTH(s1));
   	  END IF;	
   	  
   	  RETURN t;
   END;   
   
END;
		*/
				// =======================================================================================
		//  Private package variables definition
		// =======================================================================================
		//  The encryption keys used for single login
		public static final NString SCT_BXS_KEY = toStr("E73406AA-3424-42d0-8412-7C82B8237F00");
		private NString wxSsoKey= NString.getNull();
		//  User preference related variables
		private NString vUprefEnabled= NString.getNull();
		private NString vDataSource= NString.getNull();
		private NString vAxRootUrl= NString.getNull();
		private NString vWxRootUrl= NString.getNull();
		private NString vCsbInvokes= NString.getNull();
		private NString vInbInvokes= NString.getNull();
		private NNumber vAxDocSrc= NNumber.getNull();
		private NNumber vWxDocSrc= NNumber.getNull();
		private NString vInvokes= NString.getNull();
		private NNumber vDocSrc= NNumber.getNull();
/* <p>
		* --------------------------------------------------------------------------------
		*  PURPOSE:    Checks whether OTGSCTHK.dll and AX are installed on the local PC. 
		*              This procedure should be used by C/S Banner only
		*  PARAMETERS: is_otgscthk_installed, boolean, true if OtgSctHk.dll is installed
		*    	        is_ax_installed, boolean, true if AX is installed
		*  RETURN:     None
		*  EXCEPTIONS: None
		* --------------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param isOtgscthkInstalled
		* @param isAxInstalled
		*/
		public void checkAx(Ref<NBool> isOtgscthkInstalled, Ref<NBool> isAxInstalled)
		{
			UnknownTypes.Ole2ObjType obj= null;
			NNumber num= NNumber.getNull();
			try
			{
				isOtgscthkInstalled.val = toBool(NBool.False);
				isAxInstalled.val = toBool(NBool.False);
				// F2J_NOT_SUPPORTED : Call to built-in "CREATE_OBJ" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\EOQEPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1".
				//				obj = SupportClasses.OLE2.CreateObj("OTGSCTHK.CMAccess");
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'CREATE_OBJ' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\EOQEPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin1'.");
				
				// F2J_NOT_SUPPORTED : Call to built-in "INVOKE_NUM" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\EOQEPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin2".
				//				num = SupportClasses.OLE2.InvokeNum(obj, "IsAXInstalled");
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'INVOKE_NUM' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\EOQEPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin2'.");
				
				isOtgscthkInstalled.val = toBool(NBool.True);
				if ((num.notEquals(0)))
				{
					isAxInstalled.val = toBool(NBool.True);
				}
				// F2J_NOT_SUPPORTED : Call to built-in "RELEASE_OBJ" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\EOQEPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.OLE2.ReleaseObj(obj);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'RELEASE_OBJ' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\EOQEPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				return ;
			}
			catch(Exception  e)
			{
				return ;
			}
		}
/* <p>
		* ------------------------------------------------------------------------------
		*  PURPOSE:    Retrieve the SSO key from the system settings table
		*  PARAMETERS: None
		*  RETURN:     The plain text SSO key
		*  EXCEPTIONS: None
		* ------------------------------------------------------------------------------   
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString fGetSsoKey()
		{
			int rowCount = 0;
			NString s= NString.getNull();
			try
			{
				String sql1 = "SELECT eoksecr.f_decrypt(exbinst_sso_key, 'w9FUxoM4') " +
	" FROM exbinst ";
				DataCommand command1 = new DataCommand(sql1);
				ResultSet results1 = command1.executeQuery();
				rowCount = command1.getRowCount();
				if ( results1.hasData() ) {
					s = results1.getStr(0);
				}
				results1.close();
				return s;
			}
			catch(Exception  e)
			{
				return NString.getNull();
			}
		}
/* <p>
		* ----------------------------------------------------------------------------
		*  PURPOSE:    Generates the credential string to support single login.
		*  PARAMETERS: encoding, 'HEX', use HEX encoding 
		*                        'BASE64', use BASE64 encoding
		*              flag, 		boolean
		*  RETURN:     The credential string to be appended to the original URL
		*  EXCEPTIONS: None
		* ----------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString fGetCredentialsUrl() {
			return fGetCredentialsUrl(toStr("HEX"), toBool(NBool.True));
		}

/* <p>
		* ----------------------------------------------------------------------------
		*  PURPOSE:    Generates the credential string to support single login.
		*  PARAMETERS: encoding, 'HEX', use HEX encoding 
		*                        'BASE64', use BASE64 encoding
		*              flag, 		boolean
		*  RETURN:     The credential string to be appended to the original URL
		*  EXCEPTIONS: None
		* ----------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param encoding
		*/
		public NString fGetCredentialsUrl(NString encoding) {
			return fGetCredentialsUrl(encoding, toBool(NBool.True));
		}

/* <p>
		* ----------------------------------------------------------------------------
		*  PURPOSE:    Generates the credential string to support single login.
		*  PARAMETERS: encoding, 'HEX', use HEX encoding 
		*                        'BASE64', use BASE64 encoding
		*              flag, 		boolean
		*  RETURN:     The credential string to be appended to the original URL
		*  EXCEPTIONS: None
		* ----------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param encoding
		* @param flag
		*/
		public NString fGetCredentialsUrl(NString encoding, NBool flag)
		{
			NString url = NString.getNull();
			NString uname= NString.getNull();
			NString passwd= NString.getNull();
			NBool formsServerOnWindows= NBool.getNull();
			NString encryptionKey= NString.getNull();
			NString result = NString.getNull();
			byte[] r= null;
			if ((wxSsoKey.isNull()))
			{
				wxSsoKey = fGetSsoKey();
				if ((wxSsoKey.isNull()))
				{
					pShowMsg(BXS_WX_SSO_KEY_NULL_CON);
					return NString.getNull();
				}
			}
			if ((flag.isTrue()))
			{
				uname = toStr(getUser());
				passwd = toStr(getPassword());
				encryptionKey = wxSsoKey;
			}
			else {
				uname = wxSsoKey;
				passwd = toStr(null);
				encryptionKey = SCT_BXS_KEY;
			}
			url = Eoksecr.fGenerateCredentials(uname, passwd, encryptionKey);
			if ((! (url.isNull())))
			{
				if ((encoding.equals("BASE64")))
				{
					url = substring(url, toInt(4));
					// F2J_NOT_SUPPORTED : Call to built-in "HEXTORAW" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\EOQEPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
					//					r = UtlEncode.base64Encode(SupportClasses.STANDARD.Hextoraw(url));
					this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'HEXTORAW' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\EOQEPLSF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
					
					url = UtlRaw.castToVarchar2(r);
					//  Remove =, CR, and LF character added by Oracle's BASE64_ENCODE function 
					url = replace(url, chr(13));
					url = replace(url, chr(10));
					url = replace(url, "=", "-");
					//  url := UTL_URL.ESCAPE(url, TRUE); Defect 8.2
					url = Gokdbms.FurlEscape(url);
				}
				if ((flag))
				{
					result = toStr("Credentials=").append(url);
				}
				else {
					result = toStr("__K=").append(url);
				}
			}
			return result;
		}
/* <p>
		* ----------------------------------------------------------------------------
		*  PURPOSE:    Loads BDMS system and user setting and stores them into private
		*              package variables
		*  PARAMETERS: wx_url_str  VARCHAR2, the URL used to launch WX  
		*  RETURN:     error message. If no error, then NULL is returned
		*  EXCEPTIONS: none
		* ----------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString fLoadSetting()
		{
			NBool isaxinstalled= NBool.getNull();
			NBool isotgscthkinstalled= NBool.getNull();
			NString instCodes= NString.getNull();
			// RS  datasource modification for MEP 
			NString lvProcessCode = sysContext("g$_vpdi_process_context", "vpdi_process_code");
			if ((Eokutil.fGetBxsSetting(user_pref_enabled_ref, data_source_ref, ax_root_url_ref, wx_root_url_ref, csb_invokes_ref, inb_invokes_ref, ax_doc_src_ref, wx_doc_src_ref).not()))
			{
				return UNABLE_TO_GET_USER_PREF_CON;
			}
			// -RS  datasource modification for MEP starts
			if ( GVpdiSecurity.FgIsMifEnabled().getValue() )
			{
				instCodes = Gspvpdi.FgetMifDefaultCodeForUser(sysContext("USERENV", "SESSION_USER"));
				if ( instCodes.notEquals(lvProcessCode) )
				{
					vDataSource = vDataSource.append("_").append(lvProcessCode);
				}
				else {
					vDataSource = vDataSource.append("_").append(instCodes);
				}
			}
			// -RS  datasource modification for MEP ends
			if ((getContainer().eEnvIsWeb()))
			{
				vInvokes = vInbInvokes;
			}
			else {
				vInvokes = vCsbInvokes;
			}
			if ((vInvokes.equals("AX")))
			{
				vDocSrc = vAxDocSrc;
			}
			else {
				vDocSrc = vWxDocSrc;
			}
			//  Check root URL settings	
			if ( (vInvokes.equals("WX")) && (vWxRootUrl.isNull()) )
			{
				return NO_WX_ROOT_URL_CON;
			}
			if ( (vInvokes.equals("AX")) && getContainer().eEnvIsWeb() && vAxRootUrl.isNull() )
			{
				return NO_AX_ROOT_URL_CON;
			}
			//  Check AX and OtgSctHk.dll installation status for C/S Banner
			if ((getContainer().eEnvIsWeb().not()))
			{
				Ref<NBool> isOtgscthkInstalled_ref = new Ref<NBool>(isotgscthkinstalled);
				Ref<NBool> isAxInstalled_ref = new Ref<NBool>(isaxinstalled);
				checkAx(isOtgscthkInstalled_ref, isAxInstalled_ref);
				isotgscthkinstalled = isOtgscthkInstalled_ref.val;
				isaxinstalled = isAxInstalled_ref.val;
				if ((isotgscthkinstalled.not()))
				{
					return OTGSCTHK_NOT_INSTALLED_CON;
				}
				if ((vInvokes.equals("AX") && isaxinstalled.not()))
				{
					return AX_NOT_INSTALLED_CON;
				}
			}
			return NString.getNull();
		}
/* <p>
		* --------------------------------------------------------------------------------
		*  Return the data source
		* --------------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString fGetDataSource()
		{
			return vDataSource;
		}
/* <p>
		* --------------------------------------------------------------------------------
		*  Return AX/WX to be invoked in current setting
		* --------------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString fGetInvokes()
		{
			return vInvokes;
		}
/* <p>
		* --------------------------------------------------------------------------------
		*  Return the new doc source
		* --------------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NNumber fGetDocSrc()
		{
			return vDocSrc;
		}
/* <p>
		* --------------------------------------------------------------------------------
		*  Return the AX root URL
		* --------------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString fGetAxRootUrl()
		{
			return vAxRootUrl;
		}
/* <p>
		* --------------------------------------------------------------------------------
		*  Return the AX root URL
		* --------------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NString fGetWxRootUrl()
		{
			return vWxRootUrl;
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
			AlertDescriptor alertInfo= null;
			NInteger num= NInteger.getNull();
			if ((! (msg.isNull())))
			{
				alertInfo = findAlert("G$_EXTEND_SOLUT_ALERT");
				if ( (alertInfo == null) )
				{
					message(msg);
				}
				else {
					setAlertMessageText(alertInfo, msg);
					// SET_ALERT_PROPERTY(alert_info, TITLE, 'XtenderSolutions');
					num = toInt(showAlert(alertInfo));
				}
			}
		}
/* <p>
		* --------------------------------------------------------------------------------
		*  All configurable menuitems should be disabled in the inital state. Will enable
		*  when necessary
		* --------------------------------------------------------------------------------
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
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
		* F2J_STRONG_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param loadSettingFlag
		*/
		public void pSetMenu(NBool loadSettingFlag)
		{
			NString isBxsEnabled = toStr("N");
			NString isAxUser = toStr("N");
			NString msg= NString.getNull();
			NString menuItemName= NString.getNull();
			if ((loadSettingFlag))
			{
				msg = fLoadSetting();
				//  Ignore system setting error message here
				msg = toStr(null);
			}
			Ref<NString> enabled_ind_in_out_ref = new Ref<NString>(isBxsEnabled);
			Ref<NString> message3_in_out_ref = new Ref<NString>(msg);
			Efkimag.pGetBaxEnabledInd(toStr(null), enabled_ind_in_out_ref, message3_in_out_ref);
			isBxsEnabled = enabled_ind_in_out_ref.val;
			msg = message3_in_out_ref.val;
			pShowMsg(msg);
			msg = toStr(null);
			if ((isBxsEnabled.equals("Y")))
			{
				//  Enables Tools menu and BDMS menu
				setMenuItemEnabled("Main.Tools", true);
				setMenuItemEnabled("TOOLS.BXS", true);
				if ((vUprefEnabled.equals("Y")))
				{
					setMenuItemEnabled("BXS.PREFERENCES", true);
				}
				else {
					setMenuItemEnabled("BXS.PREFERENCES", false);
				}
				//  AX or WX
				if ((vInvokes.equals("WX")))
				{
					setMenuItemEnabled("BXS_SUBMENU_1.SCAN", false);
					setMenuItemEnabled("BXS_SUBMENU_1.CLIPBOARD_PASTE", false);
					setMenuItemEnabled("BXS_SUBMENU_1.CLIPBOARD_PASTE_SPECIAL", false);
					setMenuItemEnabled("BXS_SUBMENU_1.INSERT_OBJECTS", false);
					setMenuItemEnabled("BXS_SUBMENU_1.IMPORT_FILE", true);
					setMenuItemEnabled("BXS_SUBMENU_1.FAXIN_QUEUE", false);
				}
				else {
					setMenuItemEnabled("BXS_SUBMENU_1.SCAN", true);
					setMenuItemEnabled("BXS_SUBMENU_1.CLIPBOARD_PASTE", true);
					setMenuItemEnabled("BXS_SUBMENU_1.CLIPBOARD_PASTE_SPECIAL", true);
					setMenuItemEnabled("BXS_SUBMENU_1.INSERT_OBJECTS", true);
					setMenuItemEnabled("BXS_SUBMENU_1.IMPORT_FILE", true);
					setMenuItemEnabled("BXS_SUBMENU_1.FAXIN_QUEUE", true);
				}
				//  DEFAULT NEW DOC SOURCE
				setMenuItemChecked("BXS_SUBMENU_1.SCAN", false);
				setMenuItemChecked("BXS_SUBMENU_1.CLIPBOARD_PASTE", false);
				setMenuItemChecked("BXS_SUBMENU_1.CLIPBOARD_PASTE_SPECIAL", false);
				setMenuItemChecked("BXS_SUBMENU_1.INSERT_OBJECTS", false);
				setMenuItemChecked("BXS_SUBMENU_1.IMPORT_FILE", false);
				setMenuItemChecked("BXS_SUBMENU_1.FAXIN_QUEUE", false);
				if ((vDocSrc.equals(9)))
				{
					menuItemName = toStr("CLIPBOARD_PASTE");
				}
				else if ((vDocSrc.equals(10))) {
					menuItemName = toStr("CLIPBOARD_PASTE_SPECIAL");
				}
				else if ((vDocSrc.equals(11))) {
					menuItemName = toStr("INSERT_OBJECTS");
				}
				else if ((vDocSrc.equals(13))) {
					menuItemName = toStr("SCAN");
				}
				else if ((vDocSrc.equals(14))) {
					menuItemName = toStr("FAXIN_QUEUE");
				}
				else {
					menuItemName = toStr("IMPORT_FILE");
				}
				menuItemName = toStr("BXS_SUBMENU_1.").append(menuItemName);
				setMenuItemChecked(menuItemName, true);
				setMenuItemEnabled("Icons.BXS", true);
				setMenuItemEnabled("Icons.BXS_PLUS", true);
			}
		}
/* <p>
		* --------------------------------------------------------------------------------
		*  The trigger is called by pre-form trigger of all Banner forms. 
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
			NString isBxsUser = toStr("N");
			NString msg = NString.getNull();
			NBool flag= NBool.getNull();
			Ref<NString> is_ax_user_ref = new Ref<NString>(isBxsUser);
			Ref<NString> message3_in_out_ref = new Ref<NString>(msg);
			Efkimag.pIsUserAxUser(toStr("OTGMGR"), getUser(), is_ax_user_ref, message3_in_out_ref);
			isBxsUser = is_ax_user_ref.val;
			msg = message3_in_out_ref.val;
			if ((isBxsUser.notEquals("Y") && getUser().notEquals("BASELINE")))
			{
				flag = toBool(NBool.False);
			}
			else {
				flag = toBool(NBool.True);
			}
			return flag;
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
			NString formName = NString.getNull();
			if ((i.equals(0)))
			{
				formName = toStr("EXAUPRF");
			}
			return formName;
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
			NString formMode = NString.getNull();
			if ((i.equals(0)))
			{
				formMode = toStr("");
			}
			return formMode;
		}
/* <p>
		* --------------------------------------------------------------------------------
		*  Returns true if WX Root is a WX .NET url
		*  Otherwise, return false	
		* --------------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public NBool fIsWxDotnet()
		{
			NBool isWxDotnet = toBool(NBool.True);
			if (((!vWxRootUrl.isNull()) && (inStr(lower(vWxRootUrl), toStr("servlet")).greater(0))))
			{
				isWxDotnet = toBool(NBool.False);
			}
			return isWxDotnet;
		}
/* <p>
		* ------------------------------------------------------------------------------
		*  PURPOSE:   Append a parameter to a URL. This function adds "?" or "&" as seperator
		*             depending on the original URL
		*  PARAMETER: url, the URL
		*             param, the parameter string to be appended
		*  RETURN:    A new url with param appended to the end of the original url   
		* ------------------------------------------------------------------------------   
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param url
		* @param param
		*/
		public NString fAppendUrlParam(NString url, NString param)
		{
			NString vUrl= NString.getNull();
			if ( inStr(url, toStr("?")).equals(0) )
			{
				vUrl = url.append("?");
			}
			else {
				vUrl = url.append("&");
			}
			vUrl = vUrl.append(param);
			return vUrl;
		}
/* <p>
		* ------------------------------------------------------------------------------
		*  PURPOSE:   Replace a string with another string
		*  PARAMETER: s, a string 
		*             s1, the string to be replaced
		*             s2, the string to replace s1 with
		*  RETURN:    a new string 
		* ------------------------------------------------------------------------------   
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param s
		* @param s1
		* @param s2
		*/
		public NString fReplaceString(NString s, NString s1, NString s2)
		{
			NString t= NString.getNull();
			NInteger i= NInteger.getNull();
			t = s;
			i = inStr(lower(s), lower(s1));
			if ((i.greater(0)))
			{
				t = substring(s, toInt(1), i.subtract(1)).append(s2).append(substring(s, i.add(length(s1))));
			}
			return t;
		}
		
	
	
}
