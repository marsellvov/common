package net.hedtech.general.common.libraries.Soqolib.controller;
 
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
import morphis.foundations.core.appsupportlib.runtime.controlsModel.items.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.lovs.*;
import morphis.foundations.core.appsupportlib.runtime.controlsModel.containers.*;
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
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Soqolib.model.*;
import net.hedtech.general.common.libraries.Soqolib.*;
import net.hedtech.general.common.libraries.Soqolib.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;		
		
public class SAdminAssignController extends AbstractSupportCodeObject {
	
	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getContainer().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	

	
	public SAdminAssignController(ISupportCodeContainer container) 
	{
		super(container);
	}
		
		
		
	@Override
	public SoqolibTaskPart getContainer() {
		return (SoqolibTaskPart)super.getContainer();
	}

	public SoqolibModel getFormModel() {
		return this.getContainer().getModel();
	}
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SORAINF_RADM_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SORAINF_RADM_CODE_LBT")
		public void sorainfRadmCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADMIN_ASSIGN_CANVAS_TERM_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ADMIN_ASSIGN_CANVAS_TERM_BTN")
		public void adminAssignCanvasTermBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER ADMIN_ASSIGN_CANVAS_TERM_BTN.WHEN-BUTTON-PRESSED
		 GO_ITEM('SORAINF.SORAINF_TERM_CODE');
DO_KEY('LIST_VALUES');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADMIN_ASSIGN_CANVAS_TERM_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ADMIN_ASSIGN_CANVAS_TERM_BTN")
		public void adminAssignCanvasTermBtn_buttonClick()
		{
			
				goItem(toStr("SORAINF.SORAINF_TERM_CODE"));
				executeAction("LIST_VALUES");
			}

		
		/* Original PL/SQL code code for TRIGGER ADMIN_ASSIGN_CANVAS_ASSIGN_BTN.WHEN-BUTTON-PRESSED
		 DECLARE 
   alert_button	 NUMBER; 
BEGIN 
       alert_button := Show_Alert('admin_assign_alert'); 
       IF alert_button = ALERT_BUTTON2 THEN 
          Message( G$_NLS.Get('SOQOLIB-0424', 'FORM','Administrator Assignment Calculation Cancelled.') );
          return;
       else 
          <multilinecomment> sokainf.p_assign_admin(:admin_pidm, :admin_assign_term_code, 
            :admin_assign_seqno, :admin_assign_module); </multilinecomment>
          Message( G$_NLS.Get('SOQOLIB-0425', 'FORM','Administrator Assignment Calculation Completed.') );
          go_block('sorainf');
          execute_query;
      END IF; 

END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADMIN_ASSIGN_CANVAS_ASSIGN_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ADMIN_ASSIGN_CANVAS_ASSIGN_BTN")
		public void adminAssignCanvasAssignBtn_buttonClick()
		{
			
				{
					NNumber alertButton= NNumber.getNull();
					alertButton = toNumber(showAlert("admin_assign_alert"));
					if ( alertButton.equals(MessageServices.BUTTON2) )
					{
						warningMessage(GNls.Fget(toStr("SOQOLIB-0424"), toStr("FORM"), toStr("Administrator Assignment Calculation Cancelled.")));
						return ;
					}
					else {
						//  sokainf.p_assign_admin(:admin_pidm, :admin_assign_term_code,
						// :admin_assign_seqno, :admin_assign_module); 
						message(GNls.Fget(toStr("SOQOLIB-0425"), toStr("FORM"), toStr("Administrator Assignment Calculation Completed.")));
						goBlock(toStr("sorainf"));
						executeQuery();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ADMIN_ASSIGN_CANVAS_RETURN_BTN.WHEN-BUTTON-PRESSED
		 -- force commit before exiting block so that the validations
-- of multiple assignment, type, term, seq and active status
-- will be validated.
execute_trigger('sorainf_return');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADMIN_ASSIGN_CANVAS_RETURN_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ADMIN_ASSIGN_CANVAS_RETURN_BTN")
		public void adminAssignCanvasReturnBtn_buttonClick()
		{
			
				//  force commit before exiting block so that the validations
				//  of multiple assignment, type, term, seq and active status
				//  will be validated.
				//  force commit before exiting block so that the validations
				//  of multiple assignment, type, term, seq and active status
				//  will be validated.
				executeAction("sorainf_return");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADMIN_ID_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ADMIN_ID_LBT")
		public void adminIdLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER ADMIN_ID_LBT.WHEN-BUTTON-PRESSED
		  g$_key_opt_menu ('sorainf.ADMIN_ID',
    G$_NLS.Get('SOQOLIB-0426', 'FORM','Person Search Form') , 'LIST_VALUES',
    G$_NLS.Get('SOQOLIB-0427', 'FORM','Admin Assign Search Form') ,'COUNT_QUERY', 
   '', '',
   '','' );
g$_check_failure;
:ADMIN_ASSIGN_OPTION_IND := 'N';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADMIN_ID_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ADMIN_ID_LBT")
		public void adminIdLbt_buttonClick()
		{
			
				getContainer().getGoqrpls().gKeyOptMenu(toStr("sorainf.ADMIN_ID"), GNls.Fget(toStr("SOQOLIB-0426"), toStr("FORM"), toStr("Person Search Form")), toStr("LIST_VALUES"), GNls.Fget(toStr("SOQOLIB-0427"), toStr("FORM"), toStr("Admin Assign Search Form")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
				getContainer().getGoqrpls().gCheckFailure();
				getFormModel().getSAdminAssign().setAdminAssignOptionInd(toStr("N"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADMIN_ASSIGN_CANVAS_SEQNO_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ADMIN_ASSIGN_CANVAS_SEQNO_BTN")
		public void adminAssignCanvasSeqnoBtn_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER ADMIN_ASSIGN_CANVAS_SEQNO_BTN.WHEN-BUTTON-PRESSED
		 GO_ITEM('SORAINF.SORAINF_SEQNO');
DO_KEY('LIST_VALUES');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADMIN_ASSIGN_CANVAS_SEQNO_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ADMIN_ASSIGN_CANVAS_SEQNO_BTN")
		public void adminAssignCanvasSeqnoBtn_buttonClick()
		{
			
				goItem(toStr("SORAINF.SORAINF_SEQNO"));
				executeAction("LIST_VALUES");
			}

		
	
	
}

