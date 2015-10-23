package net.hedtech.general.common.libraries.Aoqclib.services;

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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.*;
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
import static morphis.foundations.core.appsupportlib.runtime.ListServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TreeServices.*;

import static morphis.foundations.core.appsupportlib.Math.*;
import static morphis.foundations.core.appsupportlib.Lib.*;
import static morphis.foundations.core.appsupportlib.Globals.*;
import static morphis.foundations.core.types.Types.*;
import morphis.foundations.core.util.*;


import net.hedtech.general.common.libraries.Aoqclib.*;

import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Aoqclib.model.*;



public class AoqclibServices extends AbstractSupportCodeObject{
	
	
	public AoqclibServices(ISupportCodeContainer container) {
		super(container);
	}
	
	public AoqclibTaskPart  getContainer() {
		return (AoqclibTaskPart )super.getContainer();
	}

	
	public net.hedtech.general.common.libraries.Aoqclib.model.AoqclibModel getFormModel() {
		return getContainer().getModel();
	}

	/* Original PL/SQL code for Prog Unit COPYRIGHT
	
	PROCEDURE COPYRIGHT  IS
<multilinecomment> 
Copyright 2010-2013 Ellucian Company L.P. and its affiliates.
</multilinecomment> 
BEGIN
  NULL;
END;

	*/
	//ID:380
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void copyright()
		{
		}

	
	/* Original PL/SQL code for Prog Unit INSERT_AMRATTN
	
	PROCEDURE INSERT_AMRATTN(IDEN_CODE_IN VARCHAR2, ITEM_REFNO_IN NUMBER) IS
BEGIN
--
   INSERT INTO AMRATTN
    ( AMRATTN_PIDM, AMRATTN_ITEM_REFNO,  
      AMRATTN_ATTN_IDEN_CODE, AMRATTN_ORIG_IND,
      AMRATTN_DATA_ORIGIN, AMRATTN_USER_ID,
      AMRATTN_ACTIVITY_DATE )
   VALUES ( :PIDM, ITEM_REFNO_IN,
            IDEN_CODE_IN, '1', 'AMRCONT', 
            USER, SYSDATE ) ;
--
   G$_CHECK_VALUE (SQL%NOTFOUND, NULL, FALSE);
--
END;
	*/
	//ID:381
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param idenCodeIn
		* @param itemRefnoIn
		*/
		public void insertAmrattn(NString idenCodeIn, NNumber itemRefnoIn)
		{
			int rowCount = 0;
			// 
			// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
			String sql1 = "INSERT INTO AMRATTN " +
	"(AMRATTN_PIDM, AMRATTN_ITEM_REFNO, AMRATTN_ATTN_IDEN_CODE, AMRATTN_ORIG_IND, AMRATTN_DATA_ORIGIN, AMRATTN_USER_ID, AMRATTN_ACTIVITY_DATE)" +
	"VALUES (:PIDM, :P_ITEM_REFNO_IN, :P_IDEN_CODE_IN, '1', 'AMRCONT', USER, SYSDATE)";
			DataCommand command1 = new DataCommand(sql1);
			//Setting query parameters
			command1.addParameter("PIDM", this.getFormModel().getBusinessObject("KEY_BLOCK").getValue("PIDM"));
			command1.addParameter("P_ITEM_REFNO_IN", itemRefnoIn);
			command1.addParameter("P_IDEN_CODE_IN", idenCodeIn);
			rowCount = command1.execute();
			// 
			getContainer().getGoqrpls().gCheckValue(rowCount == 0, null, NBool.False);
		}

	
	/* Original PL/SQL code for Prog Unit DELETE_AMRATTN
	
	PROCEDURE DELETE_AMRATTN IS
<multilinecomment> This Procedure will delete AMRATTN row being deleted.
   Invoked from PRE-DELETE of AMRCONT Block. </multilinecomment>
BEGIN
   DELETE FROM AMRATTN
   WHERE  AMRATTN_PIDM      = :AMRCONT_PIDM
   AND    AMRATTN_ITEM_REFNO = :AMRCONT_ITEM_REFNO
   AND    AMRATTN_ORIG_IND = '1';
--   
SET_TAB_PAGE_PROPERTY('AMRATTN_TAB', LABEL, g$_nls.get('AOQCLIB-0062','FORM','Additional Attendees '));
EXECUTE_TRIGGER('DISABLE_AMRATTN_TAB');
END;
--
	*/
	//ID:382
	/* <p>
		* F2J_WEAK_PRESENTATION_LOGIC : The code of this procedure was identified as containing presentation logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
//		public void deleteAmrattn()
//		{
//			int rowCount = 0;
//			// F2J_TO_COMPLETE : The conversion process could not determine the name of the intended business object. Determine the correct Business Object name and complete the code.
//			String sql1 = "DELETE FROM AMRATTN " +
//	" WHERE AMRATTN_PIDM = :AMRCONT_PIDM AND AMRATTN_ITEM_REFNO = :AMRCONT_ITEM_REFNO AND AMRATTN_ORIG_IND = '1'";
//			DataCommand command1 = new DataCommand(sql1);
//			//Setting query parameters
//			command1.addParameter("AMRCONT_PIDM", this.getModel().getValue(F2N_UKNOWN_BUSINESS_OBJECT,AMRCONT_PIDM));
//			command1.addParameter("AMRCONT_ITEM_REFNO", this.getModel()getValue(F2N_UKNOWN_BUSINESS_OBJECT,AMRCONT_ITEM_REFNO));
//			rowCount = command1.execute();
//			//    
//			setTabPageLabel("AMRATTN_TAB", GNls.Fget(toStr("AOQCLIB-0062"), toStr("FORM"), toStr("Additional Attendees ")));
//			executeAction("DISABLE_AMRATTN_TAB");
//		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_3_2
	
	PROCEDURE AUDIT_TRAIL_8_3_2 IS
<multilinecomment>
AUDIT TRAIL: 8.3.2
1. New library for Advancement                          Scott Geiser  05/10/2010 
   a. Add objects for User Alert Enhancement. 
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:383
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail832()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_MSGKEY_UPDATE
	
	PROCEDURE AUDIT_TRAIL_MSGKEY_UPDATE IS
-- PROJECT : MSGKEY
-- MODULE  : AOQCLIB
-- SOURCE  : enUS
-- TARGET  : I18N
-- DATE    : Fri Oct 04 05:27:24 2013
-- MSGSIGN : #6f38a9bc24393a61
BEGIN
  NULL;
END AUDIT_TRAIL_MSGKEY_UPDATE;

	*/
	//ID:384
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrailMsgkeyUpdate()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4
	
	PROCEDURE AUDIT_TRAIL_8_4 IS
<multilinecomment>
AUDIT TRAIL: 8.4
1. Planned Giving Enhancement                         Scott Geiser  10/12/2010 
   a. Add objects for AGRADTL.
   a. Add objects for AGRPGBE. 
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:385
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail84()
		{
		}

	
	/* Original PL/SQL code for Prog Unit VALID_PLEDGE_GIFT_COMBO
	
	FUNCTION VALID_PLEDGE_GIFT_COMBO ( PIDM      IN NUMBER,
                                     PLEDGE_NO IN VARCHAR2,
                                     GIFT_NO  IN VARCHAR2) RETURN BOOLEAN IS
   COMBO_FOUND   VARCHAR2(1) := '';
   CURSOR AGRGDES_CURSOR IS
         SELECT 'Y'
         FROM   AGRGDES
         WHERE  AGRGDES_PIDM      = PIDM
           AND  AGRGDES_PLEDGE_NO = PLEDGE_NO
           AND  AGRGDES_GIFT_NO   = GIFT_NO ;

BEGIN 
	    IF PLEDGE_NO IS NULL OR
	    	 GIFT_NO IS NULL THEN
         RETURN TRUE ;
	    END IF;
      OPEN  AGRGDES_CURSOR ;
      FETCH AGRGDES_CURSOR INTO COMBO_FOUND ;
      IF AGRGDES_CURSOR%NOTFOUND THEN
        CLOSE AGRGDES_CURSOR ;
      	RETURN FALSE;
      END IF;
      CLOSE AGRGDES_CURSOR ;
      RETURN TRUE ;
END ;
	*/
	//ID:386
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this function was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		* @param pidm
		* @param pledgeNo
		* @param giftNo
		*/
		public NBool validPledgeGiftCombo(NNumber pidm, NString pledgeNo, NString giftNo)
		{
			int rowCount = 0;
			NString comboFound = toStr("");
			String sqlagrgdesCursor = "SELECT 'Y' " +
	" FROM AGRGDES " +
	" WHERE AGRGDES_PIDM = :P_PIDM AND AGRGDES_PLEDGE_NO = :P_PLEDGE_NO AND AGRGDES_GIFT_NO = :P_GIFT_NO ";
			DataCursor agrgdesCursor = new DataCursor(sqlagrgdesCursor);
			try {
				if ( pledgeNo.isNull() || giftNo.isNull() )
				{
					return  toBool(NBool.True);
				}
				//Setting query parameters
				agrgdesCursor.addParameter("P_PIDM", pidm);
				agrgdesCursor.addParameter("P_PLEDGE_NO", pledgeNo);
				agrgdesCursor.addParameter("P_GIFT_NO", giftNo);
				//F2J_WARNING : Make sure that the method "Close" is being called over the variable agrgdesCursor.
				agrgdesCursor.open();
				ResultSet agrgdesCursorResults = agrgdesCursor.fetchInto();
				if ( agrgdesCursorResults != null ) {
					comboFound = agrgdesCursorResults.getStr(0);
				}
				if ( agrgdesCursor.notFound() )
				{
					agrgdesCursor.close();
					return  toBool(NBool.False);
				}
				agrgdesCursor.close();
				return  toBool(NBool.True);
				}finally{
					agrgdesCursor.close();
				}
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4_1
	
	PROCEDURE AUDIT_TRAIL_8_4_1 IS
<multilinecomment>
AUDIT TRAIL: 8.4.1
1. Defect #1-GAXLUB                         Scott Geiser  03/02/2011 
   Problem:  The current design of the pop-up for user alerts only has 
             displays the pop-up the first time a user goes to a form 
             for a constituent that has a user alert associated with it 
             (within a Banner Advancement session). This works fine if 
             all alerts for this constituent are 'general' in that they 
             display on all forms supporting User Alerts functionality.  
             Therefore, when viewing the list of alerts when this notification 
             is initially presented, the user is aware of all alerts for this 
             constituent. This does not handle the scenario when the actual 
             alerts differ from form to form.
   Solution: Modified the A$_CHECK_USER_ALERTS trigger as follows:
             1. Added CHECK_CATEGORY_AURALRT_C cursor
             2. Added code to check CHECK_CATEGORY_AURALRT_C regardless
                if the keyblock_id changed or not.
   
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:387
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail841()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_4_2
	
	PROCEDURE AUDIT_TRAIL_8_4_2 IS
<multilinecomment>
AUDIT TRAIL: 8.4.2
1. Defect #1-G9OURZ                         Venkata Krishna   05/27/2011 
   Problem:  A pledge payment has been made on AGAGIFT and the user has exited this form and come back in
             to try to add an Additional Details record or Beneficiary record that just has  a pledge # 
             referenced (no gift #). This is currently not allowed but should be.Currently the user gets
             an error saying the Gift # must match the value in the key block.This should be fixed so it
             works consistently with this same scenario when done upon initial pledge entry or done via 
             the AGAADTL or AGAPGBE forms directly.These correctly allow the creation of an Additional 
             Detail or Beneficiary record that is tied only to the pledge and not the gift.
             This is an issue both when the record is being created (add) and when it's saved and the user
             goes back in to update the existing record (mod).  Please test.   
   Solution: a) Modified WHEN-VALIDATE-ITEM trigger for both items AGRPGBE_GIFT_NO and AGRADTL_GIFT_NO.
             b) Modified PRE_COMMIT_VALIDATE block level trigger for the blocks AGRPGBE and AGRADTL. 
             
2. Defect# 1-G9OUS1                         Venkata Krishna   05/29/2011                
   Problem:  On AGAGIFT after entering a pledge payment for multiple pledges and saving, the user moves to
             the Additional Detail or Beneficiary tab.  They add a new record, space out the defaulted gift#
             and enter in a different gift # that is valid for the constituent but is not the current gift. 
             The user should not be allowed to do this and successfully save.Currently they can.This should
             be changed so it works consistently with how this scenario is handled when the user comes into
             AGAGIFT at a subsequent time and is retrieving an existing pledge payment.  In that scenario 
             when they attempt this invalid add/save, they get a message indicating that the Gift # must match 
             the Gift # value in the key block.  This is the correct handling for this situation.   
   Solution: a) Modified WHEN-VALIDATE-ITEM trigger for both items AGRPGBE_GIFT_NO and AGRADTL_GIFT_NO.

3. Defect#1-GDAIT9                         Venkata Krishna    06/22/2011
   Problem:  1) On APAIDEN go to the Additional Identification tab for someone with no alerts.
             2) Click next block and the User Alerts window pops up.
             3) Click on the 'Close' button and you get the following error: FRM-40105 - Unable to resolve reference to item.
                and you cannot close this or the APAIDEN window using the X. 
Workaround:  Click next block rather than close when you receive the error and it will take you back to the APAIDEn window.  
  Solution:  User Alerts window has to open only with any one of the below methods, Not while navigating between the tabs. 
             > Click the User Alerts button in the upper right corner of the form.
             > Select User Alerts from the Options menu.
             
             a) AURALRT_MESSAGE text item - Keyboard Navigation property changed to 'No'                 
             b) USER_ALERT_CLOSE_BTN push button - Enabled property changed to 'No'
             c) Added code to A$_SHOW_USER_ALERTS trigger. 
             d) Added code to WHEN-BUTTON-PRESSED trigger of USER_ALERT_CLOSE_BTN.
             
4. Defect#1-M05LDQ                       Venkat Krishna       06/30/2011
   Problem: The Alert box pop-up is displayed when the form with the alert is the first 
            form accessed for this Userid.  If other forms are accessed prior to the alert
            form then the alert does not pop up, even though the alert icon is illuminated.

  Solution: Added code in the A$_CHECK_USER_ALERTS trigger, to pop up user alert, if the Userid is changed in previously 
            opened non user alert form.

5. Multiple Originators Enhancement                         Heidi Dombroski 07/28/2011 
   a. Add objects for AMRATTN.            

6. Defect #1-S4R1IH                                         Heidi Dombroski 08/03/2011
   Problem: When trying to save changes to AGAADTL and/or AGAPGBE the following 
            error may be encountered: FRM-40735: ON-INSERT trigger raised unhandled 
            exception ORA-32767: No server connection for this operation If you then 
            do a Rollback, popup displays asking if you want to save changes, if you 
            select Yes this error displays: FRM-40735: ON-INSERT trigger raised unhandled 
            exception ORA-00600: internal error code, arguments:0,0,0,0,0,0,0,0,0,0,0,0, 
            The above was from a client running OFM (Oracle Fusion Middleware) 11g. See 
            attached document defect-1-S4R1LH.doc for additional details. 
   Solution: Modified the ON-INSERT AGRADTL block level trigger to pass individual fields
             to dml_agradtl.p_insert_columns instead of agradtl_rec.
             Modified the ON-INSERT AGRPGBE block level trigger to pass individual fields
             to dml_agradtl.p_insert_columns instead of agrpgbe_rec.    
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:388
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail842()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_5
	
	PROCEDURE AUDIT_TRAIL_8_5 IS
<multilinecomment>
AUDIT TRAIL: 8.5
1. Defect #1-GSLFBM                           Heidi Dombroski   08/26/2011 
   Problem: AGAPGBE biographic information not updating when beneficiary has a valid Banner ID. 
            Once a beneficiary with a valid Banner ID has been added to a gift or pledge, then 
            if the biographic data such a birth date, gender etc is updated on APAIDEN/Bio tab 
            then the new data is not automatically updating the data on the APRPGBE table and 
            that data cannot be updated on AGAPGBE as the fields are protected.   
   Solution: Add PGBE_XXXX work fields to handle updated bio data from APAIDEN to the Beneficiary
             tab.  Also added COPY_FIELDS & CLEAR_AGRPGBE_FIELDS form level triggers.
AUDIT TRAIL END
</multilinecomment>
BEGIN
  NULL;
END;
	*/
	//ID:389
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail85()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_6
	
	PROCEDURE AUDIT_TRAIL_8_6  IS
<multilinecomment> 
AUDIT TRAIL: 8.6
1. Defect 1-1B4LE5                              Scott Geiser 06/14/2012
   Problem:  In several Advancement forms, when the amount is lower than 1, 
             the leading zero is not displayed. Issue may be in more than the 
             specified forms. Affects all non-US customers since in other 
             countries, the leading zero is always stated. 
   Solution: Changed Format Mask of monetary fields to include a zero before
             the decimal place holder.
   
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;

	*/
	//ID:390
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail86()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_6_1
	
	PROCEDURE AUDIT_TRAIL_8_6_1  IS
<multilinecomment> 
AUDIT TRAIL: 8.6.1
1. Defect 1-1AMSBKO                              Heidi Dombroski 03/28/2013
   Problem:  In the INB 8.5.1. release, the form-specific user alerts pop-up 
             is not displaying in a particular circumstance.  
             See attachment titled alert_issue_full_description for further information.  
   Solution: Modified code in the A$_CHECK_USER_ALERTS trigger, to pop up form specific 
             user alert, if the form is different from the previous form the alert
             displayed on.
   
AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;

	*/
	//ID:391
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail861()
		{
		}

	
	/* Original PL/SQL code for Prog Unit AUDIT_TRAIL_8_7
	
	PROCEDURE AUDIT_TRAIL_8_7  IS
<multilinecomment> 
AUDIT TRAIL: 8.7
1.RPE - Enhancing atvxref lookup list                               Venkata Krishna 01/10/2013
  AOQOLIB.FMB modifications on ATVXREF_LOV are not reflecting here, so reset the link.

AUDIT TRAIL END 
</multilinecomment> 
BEGIN
  NULL;
END;
	*/
	//ID:392
	/* <p>
		* F2J_PURE_BUSINESS_LOGIC : The code of this procedure was identified as containing business logic. See documentation for details ms-help://atx.forms2net.en/Forms2NetHelp/html/MigrationGuide.html.
/* </p>
		*/
		public void auditTrail87()
		{
		}

	
	

}
