package net.hedtech.general.common.libraries.Aoqclib.controller;

import java.util.*;

import org.jdesktop.databuffer.DataRow.DataRowStatus;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.events.*;
import morphis.foundations.core.types.*;
import morphis.foundations.core.appsupportlib.*;
import morphis.foundations.core.appsupportlib.exceptions.*;
import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.appsupportlib.util.*;
import morphis.foundations.core.appsupportlib.runtime.*;
import morphis.foundations.core.appsupportlib.runtime.control.*;
import morphis.foundations.core.appsupportlib.runtime.events.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.alerts.*;
import morphis.foundations.core.appsupportlib.runtime.action.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.*;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ViewServices.*;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ValueSetServices.*;
import static morphis.foundations.core.appsupportlib.runtime.LovServices.*;
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;
import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;
import morphis.core.utils.behavior.annotations.*;
import morphis.foundations.flavors.forms.appsupportlib.runtime.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.forms.controller.DefaultFormController;


import net.hedtech.general.common.libraries.Aoqclib.model.*;
import net.hedtech.general.common.libraries.Aoqclib.*;
import net.hedtech.general.common.libraries.Aoqclib.services.*;
import net.hedtech.general.common.libraries.Goqclib.GoqclibTaskPart;
import net.hedtech.general.common.libraries.Goqrpls.GNavigationFrame;

		

public class AoqclibFormController extends AbstractSupportCodeObject  {

		
	
	
	public AoqclibFormController (ISupportCodeContainer container) {
		super(container);
	}
	
	
	@Override
	public AoqclibTaskPart getContainer() {
		return (AoqclibTaskPart)super.getContainer();
	}
	
	
	public AoqclibModel getFormModel() {
		return this.getContainer().getModel();
	}	
	
		//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER AOQCLIB.LOAD_CURRENT_RELEASE
		 :CURRENT_RELEASE := '8.7';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQCLIB.LOAD_CURRENT_RELEASE
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="LOAD_CURRENT_RELEASE")
		public void Aoqclib_LoadCurrentRelease()
		{
			
				getFormModel().getFormHeader().setCurrentRelease(toStr("9.0"));
			}

		
		/* Original PL/SQL code code for TRIGGER AOQCLIB.A$_CHECK_USER_ALERTS
		 DECLARE
  
  al_button    NUMBER;
  alerts_found1 VARCHAR2(1) := '0';
  alerts_found2 VARCHAR2(1) := '0';--defect#1-M05LDQ added   
  supervisor   VARCHAR2(1)  := '0';
  current_form VARCHAR2(30);
  hold_current_form VARCHAR2(30);
  general_alert_message varchar2(500) := G$_NLS.Get('AOQCLIB-0000','FORM','*Note* User Alerts exist for this ID.');
  form_alert_message varchar2(500) := G$_NLS.Get('AOQCLIB-0001','FORM','*Note*  Please check User Alerts for this form.  Specific alerts are associated with this form.');
	
  CURSOR CHECK_AURALRT_C IS
  SELECT '1'
  FROM   AURALRT
  WHERE  AURALRT_PIDM = :KEY_BLOCK.PIDM
  AND    AURALRT_ACTIVE_IND = '1'
  AND    SYSDATE BETWEEN NVL(AURALRT_START_DATE, SYSDATE) AND NVL(AURALRT_END_DATE, SYSDATE)
  AND    AURALRT_ALRT_CODE IN (SELECT ATVALRT_CODE
                               FROM   ATVALRT
                               WHERE (ATVALRT_SUPER_IND = '0' OR supervisor = '1' )
                               AND   (ATVALRT_ACAT_CODE IS NULL OR :CURRENT_FORM IN (SELECT AARACAT_OBJECT
                                                                                    FROM   AARACAT
                                                                                    WHERE  AARACAT_ACAT_CODE = ATVALRT_ACAT_CODE)));
                                                                                    
  CURSOR CHECK_CATEGORY_AURALRT_C IS
  SELECT '1'
  FROM   AURALRT
  WHERE  AURALRT_PIDM = :KEY_BLOCK.PIDM
  AND    AURALRT_ACTIVE_IND = '1'
  AND    SYSDATE BETWEEN NVL(AURALRT_START_DATE, SYSDATE) AND NVL(AURALRT_END_DATE, SYSDATE)
  AND    AURALRT_ALRT_CODE IN (SELECT ATVALRT_CODE
                               FROM   ATVALRT
                               WHERE (ATVALRT_SUPER_IND = '0' OR supervisor = '1' )
                               AND   :CURRENT_FORM IN (SELECT AARACAT_OBJECT
                                                        FROM   AARACAT
                                                        WHERE  AARACAT_ACAT_CODE = ATVALRT_ACAT_CODE));
                                                        
  CURSOR CHECK_SUPERVISOR_C IS
  SELECT '1'
  FROM   AABCTRL
  WHERE  AABCTRL_SUPER_ID = :GLOBAL.CURRENT_USER;
BEGIN
--	current_form := UPPER(GET_APPLICATION_PROPERTY(CURRENT_FORM_NAME));
	
  OPEN CHECK_SUPERVISOR_C;
  FETCH CHECK_SUPERVISOR_C INTO supervisor;
  CLOSE CHECK_SUPERVISOR_C;
	
  OPEN CHECK_AURALRT_C;
  FETCH CHECK_AURALRT_C INTO alerts_found1;
  CLOSE CHECK_AURALRT_C;

	OPEN CHECK_CATEGORY_AURALRT_C;
	FETCH CHECK_CATEGORY_AURALRT_C INTO alerts_found2;
	CLOSE CHECK_CATEGORY_AURALRT_C;

  SET_ITEM_PROPERTY('USER_ALERTS_BTN',ENABLED,PROPERTY_OFF);
  G$_Navigation_Frame.Disable_Option('AURALRT','P');
  IF alerts_found1 = '1' THEN
  	IF GET_ITEM_PROPERTY('USER_ALERTS_BTN',ENABLED) = 'FALSE' THEN
       SET_ITEM_PROPERTY('USER_ALERTS_BTN',ENABLED,PROPERTY_ON);
       G$_Navigation_Frame.Enable_Option('AURALRT','P');
  	END IF;
 	  IF (:KEY_BLOCK.ID <> :HOLD_KEY_IDNO_FOR_ALERTS OR 
 	  	 :HOLD_KEY_IDNO_FOR_ALERTS IS NULL) AND alerts_found2 <> '1' THEN --defect#1-M05LDQ modified IF
   	   set_alert_property('A$_USER_ALERTS',alert_message_text,general_alert_message); 
       al_button := SHOW_ALERT('A$_USER_ALERTS'); 
       :GLOBAL.FORM_USER_ALERTS_IND := 'Y';  --defect#1-M05LDQ  added   
 	  ELSE
       IF alerts_found2 = '1' AND (:GLOBAL.FORM_USER_ALERTS_IND <> 'S' OR
       	                           nvl(:GLOBAL.CURRENT_FORM,'xxx') <> :SYSTEM.CURRENT_FORM) THEN  --defect#1-M05LDQ modified IF
       	  set_alert_property('A$_USER_ALERTS',alert_message_text,form_alert_message); 
          al_button := SHOW_ALERT('A$_USER_ALERTS'); 
       --Begin defect#1-M05LDQ  added   
          :GLOBAL.FORM_USER_ALERTS_IND := 'S'; -- here 'S' to avoid alert on roll back for the ID with form specific alert
       ELSE
       	 IF :KEY_BLOCK.ID = :HOLD_KEY_IDNO_FOR_ALERTS AND :GLOBAL.FORM_USER_ALERTS_IND = 'N' THEN
   	        set_alert_property('A$_USER_ALERTS',alert_message_text,general_alert_message); 
            al_button := SHOW_ALERT('A$_USER_ALERTS'); 
            :GLOBAL.FORM_USER_ALERTS_IND := 'Y';
       	 END IF;    
       --End defect#1-M05LDQ  added   
 	    END IF;
    END IF;    
  END IF;
  :GLOBAL.CURRENT_FORM := :SYSTEM.CURRENT_FORM;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQCLIB.A$_CHECK_USER_ALERTS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="A$_CHECK_USER_ALERTS")
		public void ACheckUserAlerts()
		{
			
				int rowCount = 0;
				{
					NNumber alButton= NNumber.getNull();
					NString alertsFound1 = toStr("0");
					NString alertsFound2 = toStr("0");
					// defect#1-M05LDQ added   
					NString supervisor = toStr("0");
					NString currentForm= NString.getNull();
					NString holdCurrentForm= NString.getNull();
					NString generalAlertMessage = GNls.Fget(toStr("AOQCLIB-0000"), toStr("FORM"), toStr("*Note* User Alerts exist for this ID."));
					NString formAlertMessage = GNls.Fget(toStr("AOQCLIB-0001"), toStr("FORM"), toStr("*Note*  Please check User Alerts for this form.  Specific alerts are associated with this form."));
					String sqlcheckAuralrtC = "SELECT '1' " +
	" FROM AURALRT " +
	" WHERE AURALRT_PIDM = :KEY_BLOCK_PIDM AND AURALRT_ACTIVE_IND = '1' AND SYSDATE BETWEEN NVL(AURALRT_START_DATE, SYSDATE) AND NVL(AURALRT_END_DATE, SYSDATE) AND (AURALRT_ALRT_CODE) IN ((SELECT ATVALRT_CODE " +
		" FROM ATVALRT " +
		" WHERE (ATVALRT_SUPER_IND = '0' OR :P_SUPERVISOR = '1') AND (ATVALRT_ACAT_CODE IS NULL OR (:CURRENT_FORM) IN ((SELECT AARACAT_OBJECT " +
			" FROM AARACAT " +
			" WHERE AARACAT_ACAT_CODE = ATVALRT_ACAT_CODE ))) )) ";
					DataCursor checkAuralrtC = new DataCursor(sqlcheckAuralrtC);
					String sqlcheckCategoryAuralrtC = "SELECT '1' " +
	" FROM AURALRT " +
	" WHERE AURALRT_PIDM = :KEY_BLOCK_PIDM AND AURALRT_ACTIVE_IND = '1' AND SYSDATE BETWEEN NVL(AURALRT_START_DATE, SYSDATE) AND NVL(AURALRT_END_DATE, SYSDATE) AND (AURALRT_ALRT_CODE) IN ((SELECT ATVALRT_CODE " +
		" FROM ATVALRT " +
		" WHERE (ATVALRT_SUPER_IND = '0' OR :P_SUPERVISOR = '1') AND (:CURRENT_FORM) IN ((SELECT AARACAT_OBJECT " +
			" FROM AARACAT " +
			" WHERE AARACAT_ACAT_CODE = ATVALRT_ACAT_CODE )) )) ";
					DataCursor checkCategoryAuralrtC = new DataCursor(sqlcheckCategoryAuralrtC);
					String sqlcheckSupervisorC = "SELECT '1' " +
	" FROM AABCTRL " +
	" WHERE AABCTRL_SUPER_ID = :GLOBAL_CURRENT_USER ";
					DataCursor checkSupervisorC = new DataCursor(sqlcheckSupervisorC);
					// 	current_form := UPPER(GET_APPLICATION_PROPERTY(CURRENT_FORM_NAME));
					//Setting query parameters
					checkSupervisorC.addParameter("GLOBAL_CURRENT_USER", getGlobal("CURRENT_USER"));
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable checkSupervisorC.
					checkSupervisorC.open();
					ResultSet checkSupervisorCResults = checkSupervisorC.fetchInto();
					if ( checkSupervisorCResults != null ) {
						supervisor = checkSupervisorCResults.getStr(0);
					}
					checkSupervisorC.close();
					//Setting query parameters
					checkAuralrtC.addParameter("KEY_BLOCK_PIDM", this.getFormModel().getBusinessObject("KEY_BLOCK").getValue("PIDM"));
					checkAuralrtC.addParameter("P_SUPERVISOR", supervisor);
					checkAuralrtC.addParameter("CURRENT_FORM", this.getFormModel().getBusinessObject("FORM_HEADER").getValue("CURRENT_FORM"));
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable checkAuralrtC.
					checkAuralrtC.open();
					ResultSet checkAuralrtCResults = checkAuralrtC.fetchInto();
					if ( checkAuralrtCResults != null ) {
						alertsFound1 = checkAuralrtCResults.getStr(0);
					}
					checkAuralrtC.close();
					//Setting query parameters
					checkCategoryAuralrtC.addParameter("KEY_BLOCK_PIDM",  this.getFormModel().getBusinessObject("KEY_BLOCK").getValue("PIDM"));
					checkCategoryAuralrtC.addParameter("P_SUPERVISOR", supervisor);
					checkCategoryAuralrtC.addParameter("CURRENT_FORM", this.getFormModel().getBusinessObject("FORM_HEADER").getValue("CURRENT_FORM"));
					//F2J_WARNING : Make sure that the method "Close" is being called over the variable checkCategoryAuralrtC.
					checkCategoryAuralrtC.open();
					ResultSet checkCategoryAuralrtCResults = checkCategoryAuralrtC.fetchInto();
					if ( checkCategoryAuralrtCResults != null ) {
						alertsFound2 = checkCategoryAuralrtCResults.getStr(0);
					}
					checkCategoryAuralrtC.close();
					setItemEnabled("USER_ALERTS_BTN", false);
					this.getContainer().getGoqrpls().getGNavigationFrame().disableOption(toStr("AURALRT"), toStr("P"));
					if ( alertsFound1.equals("1") )
					{
						if ( getItemEnabled("USER_ALERTS_BTN").equals("FALSE") )
						{
							setItemEnabled("USER_ALERTS_BTN", true);
							this.getContainer().getGoqrpls().getGNavigationFrame().enableOption(toStr("AURALRT"), toStr("P"));
						}
						// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
						if ( (toStr(this.getFormModel().getBusinessObject("KEY_BLOCK").getValue("ID")).notEquals(getFormModel().getBusinessObject("FORM_HEADER").getValue("HOLD_KEY_IDNO_FOR_ALERTS")) || toStr(getFormModel().getBusinessObject("FORM_HEADER").getValue("HOLD_KEY_IDNO_FOR_ALERTS")).isNull()) && alertsFound2.notEquals("1") )
						{
							// defect#1-M05LDQ modified IF
							setAlertMessageText("A$_USER_ALERTS", generalAlertMessage);
							alButton = toNumber(showAlert("A$_USER_ALERTS"));
							setGlobal("FORM_USER_ALERTS_IND", toStr("Y"));
						}
						else {
							if ( alertsFound2.equals("1") && (getGlobal("FORM_USER_ALERTS_IND").notEquals("S") || isNull(getGlobal("CURRENT_FORM"), "xxx").notEquals(getCurrentTaskName())) )
							{
								// defect#1-M05LDQ modified IF
								setAlertMessageText("A$_USER_ALERTS", formAlertMessage);
								alButton = toNumber(showAlert("A$_USER_ALERTS"));
								// Begin defect#1-M05LDQ  added   
								setGlobal("FORM_USER_ALERTS_IND", toStr("S"));
							}
							else {
								// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
								if ( this.getFormModel().getBusinessObject("KEY_BLOCK").getValue("ID").equals(getFormModel().getBusinessObject("FORM_HEADER").getValue("HOLD_KEY_IDNO_FOR_ALERTS")) && getGlobal("FORM_USER_ALERTS_IND").equals("N") )
								{
									setAlertMessageText("A$_USER_ALERTS", generalAlertMessage);
									alButton = toNumber(showAlert("A$_USER_ALERTS"));
									setGlobal("FORM_USER_ALERTS_IND", toStr("Y"));
								}
							}
						}
					}
					setGlobal("CURRENT_FORM", toStr(getCurrentTaskName()));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER AOQCLIB.A$_SHOW_USER_ALERTS
		 :CALLED_FROM_ITEM := :SYSTEM.CURSOR_ITEM;
--Begin defect#1-GDAIT9 added code
SET_ITEM_PROPERTY('AURALRT.AURALRT_MESSAGE',NAVIGABLE,PROPERTY_TRUE);
SET_ITEM_PROPERTY('AURALRT.USER_ALERT_CLOSE_BTN',ENABLED,PROPERTY_TRUE);
--End defect#1-GDAIT9 added code
GO_ITEM('ALRT_PARK_SPOT');
EXECUTE_QUERY;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQCLIB.A$_SHOW_USER_ALERTS
		 *
		 *
		 *</p>
		*/
		@ActionTrigger(action="A$_SHOW_USER_ALERTS")
		public void AShowUserAlerts()
		{
			
				getFormModel().getFormHeader().setCalledFromItem(toStr(getCursorItem()));
				// Begin defect#1-GDAIT9 added code
				setItemNavigable("AURALRT.AURALRT_MESSAGE", true);
				setItemEnabled("AURALRT.USER_ALERT_CLOSE_BTN", true);
				// End defect#1-GDAIT9 added code
				goItem(toStr("ALRT_PARK_SPOT"));
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER AOQCLIB.CHECK_ATTN_INFO
		 DECLARE
	  tab_topmost VARCHAR2(30) := GET_CANVAS_PROPERTY('A$_CONTACTS_CANVAS',TOPMOST_TAB_PAGE);
	  CURSOR ATTN_CURSOR IS
         SELECT COUNT(*)
         FROM   AMRATTN
         WHERE  AMRATTN_PIDM = :AMRCONT_PIDM 
         AND    AMRATTN_ITEM_REFNO = :AMRCONT_ITEM_REFNO;
BEGIN   
   OPEN ATTN_CURSOR;
   FETCH ATTN_CURSOR INTO :ATTN_COUNT ;
   CLOSE ATTN_CURSOR;
   IF :ATTN_COUNT > 0 THEN
   	   SET_TAB_PAGE_PROPERTY('AMRATTN_TAB', LABEL, g$_nls.get('AOQCLIB-0002','FORM','Additional Attendees (%01%)',
   	                         :ATTN_COUNT ));
   ELSE
   	   SET_TAB_PAGE_PROPERTY('AMRATTN_TAB', LABEL, g$_nls.get('AOQCLIB-0003','FORM','Additional Attendees'));
   END IF;
   IF :SYSTEM.CURRENT_BLOCK = 'AMRATTN' THEN
   	  GO_ITEM('AMRATTN_ATTN_IDEN_CODE');
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * AOQCLIB.CHECK_ATTN_INFO
		 *
		 *
		 *</p>
		*/
//		@ActionTrigger(action="CHECK_ATTN_INFO")
//		public void Aoqclib_CheckAttnInfo()
//		{
//			
//				int rowCount = 0;
//				{
//					NString tabTopmost = getCanvasTopMostTabPage("A$_CONTACTS_CANVAS");
//					String sqlattnCursor = "SELECT COUNT(*) " +
//	" FROM AMRATTN " +
//	" WHERE AMRATTN_PIDM = :AMRCONT_PIDM AND AMRATTN_ITEM_REFNO = :AMRCONT_ITEM_REFNO ";
//					DataCursor attnCursor = new DataCursor(sqlattnCursor);
//					try {
//						//Setting query parameters
//						attnCursor.addParameter("AMRCONT_PIDM", this.getModel()getValue(F2N_UKNOWN_BUSINESS_OBJECT,AMRCONT_PIDM));
//						attnCursor.addParameter("AMRCONT_ITEM_REFNO", this.getModel()getValue(F2N_UKNOWN_BUSINESS_OBJECT,AMRCONT_ITEM_REFNO));
//						//F2J_WARNING : Make sure that the method "Close" is being called over the variable attnCursor.
//						attnCursor.open();
//						ResultSet attnCursorResults = attnCursor.fetchInto();
//						if ( attnCursorResults != null ) {
//							getFormModel().getFormHeader().setAttnCount(attnCursorResults.getInteger(0));
//						}
//						attnCursor.close();
//						if ( getFormModel().getFormHeader().getAttnCount().greater(0) )
//						{
//							setTabPageLabel("AMRATTN_TAB", GNls.Fget(toStr("AOQCLIB-0002"), toStr("FORM"), toStr("Additional Attendees (%01%)"), toStr(getFormModel().getFormHeader().getAttnCount())));
//						}
//						else {
//							setTabPageLabel("AMRATTN_TAB", GNls.Fget(toStr("AOQCLIB-0003"), toStr("FORM"), toStr("Additional Attendees")));
//						}
//						if ( getCurrentBlock().equals("AMRATTN") )
//						{
//							goItem(toStr("AMRATTN_ATTN_IDEN_CODE"));
//						}
//					}
//					finally{
//						attnCursor.close();
//					}
//				}
//			}

		
	
}
	
