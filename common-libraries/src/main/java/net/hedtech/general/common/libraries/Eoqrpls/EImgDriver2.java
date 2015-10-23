package net.hedtech.general.common.libraries.Eoqrpls;

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


public class EImgDriver2 extends AbstractSupportCodeObject {
	

	public EImgDriver2(ISupportCodeContainer container) {
		super(container);
	}
	
	@Override
	public EoqrplsServices getContainer() {
		return (EoqrplsServices)super.getContainer();
	}
	//Original PL/SQL code for Package Prog Unit (SPEC) E$_IMG_DRIVER2
	/*
	PACKAGE E$_IMG_DRIVER2 IS
   --------------------------------------------------------------------------
   --
   -- action:  0 - query or count
   --              param: none
   --          1 - query
   --              param: none
   --          2 - count
   --              param: none
   --          3 - push
   --              param: 
   --                      9 - paste
   --                     10 - paste special
   --                     11 - insert object
   --                     12 - import
   --                     13 - scan
   --                     14 - fax
   --------------------------------------------------------------------------
   PROCEDURE p_call_xs(action_in INTEGER DEFAULT 0, param INTEGER DEFAULT 0);      
   PROCEDURE push_csb_ax(param INTEGER, msg OUT VARCHAR2);


END;
	*/
	
	
			
		//Original PL/SQL code for Package Prog Unit (BODY) E$_IMG_DRIVER2
		/*
		PACKAGE BODY E$_IMG_DRIVER2 IS

   --======================================================================================
   -- Private package variable definition
   --======================================================================================

               
   --======================================================================================
   -- Private package procedures and functions 
   --======================================================================================
   --------------------------------------------------------------------------
   -- PURPOSE:    Call the main entry function in the e$_img_driver package
   -- PARAMETERS: action INTEGER, 1 - query, 2 - count, 3 - push
   --             param  INTEGER, 
   -- RETURN:     none
   -- EXCEPTIONS: all exceptions should be processed in the p_call_xs main procedure
   --------------------------------------------------------------------------
   PROCEDURE call_driver(action INTEGER, param INTEGER) IS
      Quant_Results_In_Out    INTEGER  DEFAULT -1 ;
      AX_Application_In_Out   EXRBCXT.EXRBCXT_AXAP_CODE%TYPE;
      Doc_Type_In_Out         EXRBCXT.EXRBCXT_DTYP_CODE%TYPE;   
      InquiryOnly_Ind         INTEGER DEFAULT 0;   

      Imaging_User_Ind_In_Out VARCHAR2(1)    := 'N';
      Message2_In_Out         VARCHAR2(1000) := '' ;
      Message3_In_Out         VARCHAR2(1000) := '' ;
      Message4_In_Out         VARCHAR2(1000) := '' ;
      Message5_In_Out         VARCHAR2(1000) := '' ;
      Message6_In_Out         VARCHAR2(1000) := '' ;
      Message7_In_Out         VARCHAR2(1000) := '' ;
      Message8_In_Out         VARCHAR2(1000) := '' ;
      
      push_flag               INTEGER DEFAULT 0;

      Cursor_Style_Former     VARCHAR2(30);
      password_sync_result    INTEGER;
      
      SET_CM_PASSWORD_OK      INTEGER := 0;   
   BEGIN

      -- Store the current Mouse Cursor style. Make the mouse pointer look busy. 
      -- System load can make the return time unsuitable under some circumstances.
      Cursor_Style_Former := GET_APPLICATION_PROPERTY(CURSOR_STYLE);
      SET_APPLICATION_PROPERTY ( CURSOR_STYLE, 'BUSY' ) ;   	  
      
      -- Synchronize password if necessary
      IF (eoksecr.f_get_ax_security_provider() = 'CM') THEN
      	 password_sync_result := eoksecr.f_set_cm_password(GET_APPLICATION_PROPERTY(USERNAME),
      	                                                   GET_APPLICATION_PROPERTY(PASSWORD));
      	 IF (password_sync_result = SET_CM_PASSWORD_OK) THEN
      	 	  e$_img_util.p_show_msg(e$_img_util.BXS_PASSWORD_SYNC_con);
      	 END IF;                                                  
      END IF;

   	  IF (action = 1) THEN
   	  	 InquiryOnly_Ind := 0;
      	 push_flag       := 0;
      ELSIF (action = 2) THEN
   	  	 InquiryOnly_Ind := 1;
      	 push_flag       := 0;
      ELSIF (action = 3) THEN
   	  	 InquiryOnly_Ind := 0;
      	 push_flag       := param;
      END IF;  
      
      e$_img_driver.p_call_extend_solut(NAME_IN('SYSTEM.CURRENT_FORM'),
                                        NAME_IN('SYSTEM.CURRENT_BLOCK'),  
                                        NAME_IN('SYSTEM.CURRENT_ITEM'),
                                        GET_APPLICATION_PROPERTY(USERNAME),
                                        Imaging_User_Ind_In_Out,
                                        Message2_In_Out,
                                        Message3_In_Out,
                                        Message4_In_Out,
                                        Message5_In_Out,
                                        Message6_In_Out,
                                        Message7_In_Out,
                                        Message8_In_Out,
                                        InquiryOnly_Ind,
                                        Quant_Results_In_Out,
                                        Doc_Type_In_Out,
                                        AX_Application_In_Out,
                                        push_flag);      
                                      
      -- Restore cursor      
      SET_APPLICATION_PROPERTY(CURSOR_STYLE, Cursor_Style_Former);

      -- count                                  
      IF (action = 2) THEN                                  
      	 IF (Quant_Results_In_Out >= 0) THEN
      	    e$_img_util.p_show_msg(TO_CHAR(Quant_Results_In_Out) || ' document(s) found.');
      	 ELSIF (Quant_Results_In_Out = e$_img_util.DOC_COUNT_ERROR) THEN
      	 	  e$_img_util.p_show_msg(e$_img_util.BXS_WX_COUNT_ERROR_con);
      	 ELSIF (Quant_Results_In_Out = e$_img_util.DOC_COUNT_NO_CONTEXT_RULES) THEN
      	 	  e$_img_util.p_show_msg(e$_img_util.IMG_NO_RULES_EXIST_con);
      	 ELSIF (Quant_Results_In_Out = e$_img_util.DOC_COUNT_INB_TO_AX) THEN
      	 	  -- INB to AX count, do nothing
      	 	  NULL;
      	 ELSE
      	 	  e$_img_util.p_show_msg(e$_img_util.BXS_UNKNOWN_COUNT_ERROR_con || Quant_Results_In_Out);
      	 END IF;	
      END IF;	


      -- show messages
      e$_img_util.p_show_msg(Message2_In_Out);
      e$_img_util.p_show_msg(Message3_In_Out);
      e$_img_util.p_show_msg(Message4_In_Out);
      e$_img_util.p_show_msg(Message5_In_Out);
      e$_img_util.p_show_msg(Message6_In_Out);
      e$_img_util.p_show_msg(Message7_In_Out);
      e$_img_util.p_show_msg(Message8_In_Out);
   END;	
   
   --======================================================================================
   -- Public package procedures and functions 
   --======================================================================================
   --------------------------------------------------------------------------
   -- Direct index from C/S Banner to AX
   --------------------------------------------------------------------------
   PROCEDURE push_csb_ax(param INTEGER, msg OUT VARCHAR2) IS   
   BEGIN
		RETURN;
   END;
   	  
   	  
   --------------------------------------------------------------------------
   --
   -- action:  0 - toolbar icons click, could be query, count, or push
   --              param: none
   --          1 - query
   --              param: none
   --          2 - count
   --              param: none
   --          3 - push
   --              param: 
   --                      9 - paste
   --                     10 - paste special
   --                     11 - insert object
   --                     12 - import file
   --                     13 - scan
   --                     14 - fax
   --          4 - show preference window
   --          5 - show current context rule window 
   --------------------------------------------------------------------------
   PROCEDURE p_call_xs(action_in INTEGER DEFAULT 0, param INTEGER DEFAULT 0) IS
      action       INTEGER;
      new_param    INTEGER;
      msg          VARCHAR2(300) DEFAULT NULL;
      is_ax_user   VARCHAR2(1) DEFAULT 'N';      
      name_of_icon VARCHAR2(32);
   BEGIN
      
      action := action_in;   	
      
      <multilinecomment>
      -- Toolbar icons click. Check which icon is clicked  
      IF (action = 0) THEN 
      	
		     name_of_icon := NVL(UPPER(GET_ITEM_PROPERTY(NAME_IN('SYSTEM.MOUSE_ITEM'), ICON_NAME )), 'X');
         IF (name_of_icon = 'WMS') THEN
            IF (NAME_IN('SYSTEM.MOUSE_BUTTON_PRESSED') = '1' AND 
         	     NVL(UPPER(NAME_IN('SYSTEM.MOUSE_BUTTON_SHIFT_STATE')), 'X') <> 'SHIFT+') THEN
               action := 1;
            ELSE
               action := 2;
            END IF;
         ELSIF (name_of_icon = 'WMS_PLUS') THEN   
            action := 3;
         ELSE
         	  RETURN;
         END IF;   
      END IF;
      </multilinecomment>

      -- Check whether the current user is an BDMS user.	
      -- BASELINE user is the only exception since administrators need to access exbuprf
   	  -- form to change BDMS default user preference settings
      efkimag.p_is_user_ax_user('OTGMGR', USER, is_ax_user, msg);
 	    e$_img_util.p_show_msg(msg);
 	    IF (is_ax_user <> 'Y' and USER <> 'BASELINE') THEN
 	    	 e$_img_util.p_show_msg(e$_img_util.IMG_NOT_AX_USER_con);
 	       RETURN;
 	    END IF;

   	  -- Load user preference when the action is query, count, or push	 
      IF (action = 1 OR action = 2 OR action = 3) THEN
      	 msg := e$_img_util.f_load_setting(); 
      	 IF (NOT msg IS NULL) THEN
            e$_img_util.p_show_msg(msg);
            RETURN;
         END IF;   
         
	  	   new_param := param;  
   	     IF (action = 3 and new_param = 0) THEN  -- toolbar icon click
   	        new_param := e$_img_util.f_get_doc_src();
   	     ELSIF (action = 3 and new_param <> 0) THEN  -- menu push click 
   	        e$_img_util.p_set_menu(FALSE); -- Mouse clicks will change which item is checked
   	     END IF;   
   	     
      	 call_driver(action, new_param);
      	 
   	  ELSIF (action = 4) THEN
   	     --Note: this logic has been moved to GUMAPPL   	
     		 --call_form('exauprf', NO_HIDE, NO_REPLACE);
         --G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),'EXAUPRF','');     		 
         NULL;
      ELSE
         e$_img_util.p_show_msg(e$_img_util.BXS_UNRECOGNIZED_PARAMS_con);	
      END IF;	
   
   EXCEPTION   	  
      WHEN OTHERS THEN   	
         msg := ERROR_TEXT;
         eokrslt.p_insert_exrrslt
                  (
                     'PACKAGE',
                     'EOQRPLS.E$_IMG_DRIVER2.P_CALL_XS',
                     'CONTEXT',
                     SUBSTR(msg, 1, 200),
                     USER,
                     SYSDATE
                  ) ;
         e$_img_util.p_show_msg(msg);         
   END p_call_xs;
   
   
END E$_IMG_DRIVER2;
		*/
		/* <p>
		* ======================================================================================
		*  Private package variable definition
		* ======================================================================================
		* ======================================================================================
		*  Private package procedures and functions 
		* ======================================================================================
		* ------------------------------------------------------------------------
		*  PURPOSE:    Call the main entry function in the e$_img_driver package
		*  PARAMETERS: action INTEGER, 1 - query, 2 - count, 3 - push
		*              param  INTEGER, 
		*  RETURN:     none
		*  EXCEPTIONS: all exceptions should be processed in the p_call_xs main procedure
		* ------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param action
		* @param param
		*/
		public void callDriver(NInteger action, NInteger param)
		{
			NInteger quantResultsInOut = toInt(-1);
			NString axApplicationInOut= NString.getNull();
			NString docTypeInOut= NString.getNull();
			NInteger inquiryonlyInd = toInt(0);
			NString imagingUserIndInOut = toStr("N");
			NString message2InOut = toStr("");
			NString message3InOut = toStr("");
			NString message4InOut = toStr("");
			NString message5InOut = toStr("");
			NString message6InOut = toStr("");
			NString message7InOut = toStr("");
			NString message8InOut = toStr("");
			NInteger pushFlag = toInt(0);
			NString cursorStyleFormer= NString.getNull();
			NInteger passwordSyncResult= NInteger.getNull();
			NInteger setCmPasswordOk = toInt(0);
			//  Store the current Mouse Cursor style. Make the mouse pointer look busy. 
			//  System load can make the return time unsuitable under some circumstances.
			
			
			//  Synchronize password if necessary
//			if ((Eoksecr.fGetAxSecurityProvider().equals("CM")))
//			{
//				passwordSyncResult = toInt(Eoksecr.fSetCmPassword(toStr(getUser()), toStr(getPassword())));
//				if ((passwordSyncResult.equals(setCmPasswordOk)))
//				{
//					getContainer().getEImgUtil().pShowMsg(EImgUtil.BXS_PASSWORD_SYNC_CON);
//				}
//			}
			if ((action.equals(1)))
			{
				inquiryonlyInd = toInt(0);
				pushFlag = toInt(0);
			}
			else if ((action.equals(2))) {
				inquiryonlyInd = toInt(1);
				pushFlag = toInt(0);
			}
			else if ((action.equals(3))) {
				inquiryonlyInd = toInt(0);
				pushFlag = param;
			}
			Ref<NString> imagingUserIndInOut_ref = new Ref<NString>(imagingUserIndInOut);
			Ref<NString> message2InOut_ref = new Ref<NString>(message2InOut);
			Ref<NString> message3InOut_ref = new Ref<NString>(message3InOut);
			Ref<NString> message4InOut_ref = new Ref<NString>(message4InOut);
			Ref<NString> message5InOut_ref = new Ref<NString>(message5InOut);
			Ref<NString> message6InOut_ref = new Ref<NString>(message6InOut);
			Ref<NString> message7InOut_ref = new Ref<NString>(message7InOut);
			Ref<NString> message8InOut_ref = new Ref<NString>(message8InOut);
			Ref<NInteger> quantResultsInOut_ref = new Ref<NInteger>(quantResultsInOut);
			Ref<NString> docTypeInOut_ref = new Ref<NString>(docTypeInOut);
			Ref<NString> axApplicationInOut_ref = new Ref<NString>(axApplicationInOut);
			getContainer().getEImgDriver().pCallExtendSolut(getCurrentTaskName(), getCurrentBlock(), getCurrentItem(), toStr(getUser()), imagingUserIndInOut_ref, message2InOut_ref, message3InOut_ref, message4InOut_ref, message5InOut_ref, message6InOut_ref, message7InOut_ref, message8InOut_ref, inquiryonlyInd, quantResultsInOut_ref, docTypeInOut_ref, axApplicationInOut_ref, pushFlag);
			imagingUserIndInOut = imagingUserIndInOut_ref.val;
			message2InOut = message2InOut_ref.val;
			message3InOut = message3InOut_ref.val;
			message4InOut = message4InOut_ref.val;
			message5InOut = message5InOut_ref.val;
			message6InOut = message6InOut_ref.val;
			message7InOut = message7InOut_ref.val;
			message8InOut = message8InOut_ref.val;
			quantResultsInOut = quantResultsInOut_ref.val;
			docTypeInOut = docTypeInOut_ref.val;
			axApplicationInOut = axApplicationInOut_ref.val;
			//  Restore cursor      
			//  count                                  
			if ((action.equals(2)))
			{
				if ((quantResultsInOut.greaterOrEquals(0)))
				{
					getContainer().getEImgUtil().pShowMsg(toChar(quantResultsInOut).append(" document(s) found."));
				}
				else if ((quantResultsInOut.equals(EImgUtil.DOC_COUNT_ERROR))) {
					getContainer().getEImgUtil().pShowMsg(EImgUtil.BXS_WX_COUNT_ERROR_CON);
				}
				else if ((quantResultsInOut.equals(EImgUtil.DOC_COUNT_NO_CONTEXT_RULES))) {
					getContainer().getEImgUtil().pShowMsg(EImgUtil.IMG_NO_RULES_EXIST_CON);
				}
				else if ((quantResultsInOut.equals(EImgUtil.DOC_COUNT_INB_TO_AX))) {
					//  INB to AX count, do nothing
				}
				else {
					getContainer().getEImgUtil().pShowMsg(EImgUtil.BXS_UNKNOWN_COUNT_ERROR_CON.append(quantResultsInOut));
				}
			}
			//  show messages
			getContainer().getEImgUtil().pShowMsg(message2InOut);
			getContainer().getEImgUtil().pShowMsg(message3InOut);
			getContainer().getEImgUtil().pShowMsg(message4InOut);
			getContainer().getEImgUtil().pShowMsg(message5InOut);
			getContainer().getEImgUtil().pShowMsg(message6InOut);
			getContainer().getEImgUtil().pShowMsg(message7InOut);
			getContainer().getEImgUtil().pShowMsg(message8InOut);
		}
/* <p>
		* ======================================================================================
		*  Public package procedures and functions 
		* ======================================================================================
		* ------------------------------------------------------------------------
		*  Direct index from C/S Banner to AX
		* ------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param param
		* @param msg
		*/
		public void pushCsbAx(NInteger param, Ref<NString> msg)
		{
			return ;
		}
/* <p>
		* ------------------------------------------------------------------------
		* 
		*  action:  0 - toolbar icons click, could be query, count, or push
		*               param: none
		*           1 - query
		*               param: none
		*           2 - count
		*               param: none
		*           3 - push
		*               param: 
		*                       9 - paste
		*                      10 - paste special
		*                      11 - insert object
		*                      12 - import file
		*                      13 - scan
		*                      14 - fax
		*           4 - show preference window
		*           5 - show current context rule window 
		* ------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void pCallXs() {
			pCallXs(toInt(0), toInt(0));
		}

/* <p>
		* ------------------------------------------------------------------------
		* 
		*  action:  0 - toolbar icons click, could be query, count, or push
		*               param: none
		*           1 - query
		*               param: none
		*           2 - count
		*               param: none
		*           3 - push
		*               param: 
		*                       9 - paste
		*                      10 - paste special
		*                      11 - insert object
		*                      12 - import file
		*                      13 - scan
		*                      14 - fax
		*           4 - show preference window
		*           5 - show current context rule window 
		* ------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param actionIn
		*/
		public void pCallXs(NInteger actionIn) {
			pCallXs(actionIn, toInt(0));
		}

/* <p>
		* ------------------------------------------------------------------------
		* 
		*  action:  0 - toolbar icons click, could be query, count, or push
		*               param: none
		*           1 - query
		*               param: none
		*           2 - count
		*               param: none
		*           3 - push
		*               param: 
		*                       9 - paste
		*                      10 - paste special
		*                      11 - insert object
		*                      12 - import file
		*                      13 - scan
		*                      14 - fax
		*           4 - show preference window
		*           5 - show current context rule window 
		* ------------------------------------------------------------------------
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param actionIn
		* @param param
		*/
		public void pCallXs(NInteger actionIn, NInteger param)
		{
			NInteger action= NInteger.getNull();
			NInteger newParam= NInteger.getNull();
			NString msg = NString.getNull();
			NString isAxUser = toStr("N");
			NString nameOfIcon= NString.getNull();
			try
			{
				action = actionIn;
				// -- Toolbar icons click. Check which icon is clicked
				// IF (action = 0) THEN
				// name_of_icon := NVL(UPPER(GET_ITEM_PROPERTY(NAME_IN('SYSTEM.MOUSE_ITEM'), ICON_NAME )), 'X');
				// IF (name_of_icon = 'WMS') THEN
				// IF (NAME_IN('SYSTEM.MOUSE_BUTTON_PRESSED') = '1' AND
				// NVL(UPPER(NAME_IN('SYSTEM.MOUSE_BUTTON_SHIFT_STATE')), 'X') <> 'SHIFT+') THEN
				// action := 1;
				// ELSE
				// action := 2;
				// END IF;
				// ELSIF (name_of_icon = 'WMS_PLUS') THEN
				// action := 3;
				// ELSE
				// RETURN;
				// END IF;
				// END IF;
				//  Check whether the current user is an BDMS user.	
				//  BASELINE user is the only exception since administrators need to access exbuprf
				//  form to change BDMS default user preference settings
				Ref<NString> is_ax_user_ref = new Ref<NString>(isAxUser);
				Ref<NString> message3_in_out_ref = new Ref<NString>(msg);
				Efkimag.pIsUserAxUser(toStr("OTGMGR"), getUser(), is_ax_user_ref, message3_in_out_ref);
				isAxUser = is_ax_user_ref.val;
				msg = message3_in_out_ref.val;
				getContainer().getEImgUtil().pShowMsg(msg);
				if ((isAxUser.notEquals("Y") && getUser().notEquals("BASELINE")))
				{
					getContainer().getEImgUtil().pShowMsg(EImgUtil.IMG_NOT_AX_USER_CON);
					return ;
				}
				//  Load user preference when the action is query, count, or push	 
				if ((action.equals(1) || action.equals(2) || action.equals(3)))
				{
					msg = getContainer().getEImgUtil().fLoadSetting();
					if ((! (msg.isNull())))
					{
						getContainer().getEImgUtil().pShowMsg(msg);
						return ;
					}
					newParam = param;
					if ((action.equals(3) && newParam.equals(0)))
					{
						//  toolbar icon click
						newParam = toInt(getContainer().getEImgUtil().fGetDocSrc());
					}
					else if ((action.equals(3) && newParam.notEquals(0))) {
						//  menu push click 
						getContainer().getEImgUtil().pSetMenu(NBool.False);
					}
					callDriver(action, newParam);
				}
				else if ((action.equals(4))) {
					// Note: this logic has been moved to GUMAPPL   	
					// call_form('exauprf', NO_HIDE, NO_REPLACE);
					// G$_SECURED_FORM_CALL(NAME_IN('GLOBAL.CURRENT_USER'),'EXAUPRF','');     		 
				}
				else {
					getContainer().getEImgUtil().pShowMsg(EImgUtil.BXS_UNRECOGNIZED_PARAMS_CON);
				}
			}
			catch(Exception  e)
			{
				// F2J_TO_REMOVE : Call to built-in "ERROR_TEXT" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\EOQRPLSF2NMigrationGuide.xml#ExcludeErrorBuiltins".
				//				msg = SupportClasses.SQLFORMS.ErrorText();
				this.getLogger().trace(this, "// F2J_TO_REMOVE : Call to built-in 'ERROR_TEXT' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\EOQRPLSF2NMigrationGuide.xml#ExcludeErrorBuiltins'.");
				
				
				Eokrslt.pInsertExrrslt(toStr("PACKAGE"), toStr("EOQRPLS.E$_IMG_DRIVER2.P_CALL_XS"), toStr("CONTEXT"), substring(msg, toInt(1), toInt(200)), getUser(), NDate.getNow());
				getContainer().getEImgUtil().pShowMsg(msg);
			}
		}
		
	
	
}
