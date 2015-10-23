package net.hedtech.banner.general.common.Guahelp.controller;
 
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
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.general.common.Guahelp.model.*;
import net.hedtech.banner.general.common.Guahelp.*;
import net.hedtech.banner.general.common.Guahelp.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GFormClass;
import net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class DisplayHelpController extends DefaultBlockController {

	private GNonIconBtnClass getGNonIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NON_ICON_BTN_CLASS");
	}	

	private GFormClass getGFormClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GFormClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_FORM_CLASS");
	}	
	
	public DisplayHelpController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GuahelpTask getTask() {
		return (GuahelpTask)super.getTask();
	}

	public GuahelpModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER DISPLAY_HELP.KEY-NXTBLK
		 DECLARE
  WIN_Y   NUMBER;
BEGIN
  DEFAULT_VALUE('0','GLOBAL.Y_LINE');
  WIN_Y := TO_NUMBER(:GLOBAL.Y_LINE) + 1;
--    SET_WINDOW_PROPERTY('GUAHELP_WINDOW',POSITION,15,WIN_Y);
  GO_ITEM('HELP_COMMENT');
  EDIT_TEXTITEM;
  GO_FIELD('HELP_TYPE');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_HELP.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void displayHelp_NextBlock()
		{
			
				{
					NNumber winY= NNumber.getNull();
					setDefaultValue("0", "GLOBAL.Y_LINE");
					winY = toNumber(toNumber(getGlobal("Y_LINE")).add(1));
					//     SET_WINDOW_PROPERTY('GUAHELP_WINDOW',POSITION,15,WIN_Y);
					goItem(toStr("HELP_COMMENT"));
					goItem(toStr("HELP_TYPE"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER HELP_FORM.WHEN-VALIDATE-ITEM
		 EXECUTE_TRIGGER('FIND_HELP');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * HELP_FORM.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="HELP_FORM")
		public void helpForm_validate()
		{
			
				executeAction("FIND_HELP");
			}

		
		/* Original PL/SQL code code for TRIGGER HELP_FORM.POST-TEXT-ITEM
		 IF :HELP_FORM IS NULL THEN
  IF G$_DISPLAY_ALERT('', G$_NLS.Get('GUAHELP-0012', 'FORM','*ERROR* Form name is required') ) IS NOT NULL THEN
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * HELP_FORM.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="HELP_FORM", function=KeyFunction.ITEM_OUT)
		public void helpForm_itemOut()
		{
			
				if ( getFormModel().getDisplayHelp().getHelpForm().isNull() )
				{
					if ( !getTask().getGoqrpls().gDisplayAlert(toStr(""), GNls.Fget(toStr("GUAHELP-0012"), toStr("FORM"), toStr("*ERROR* Form name is required"))).isNull() )
					{
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER HELP_BLOCK.WHEN-VALIDATE-ITEM
		 EXECUTE_TRIGGER('FIND_HELP');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * HELP_BLOCK.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="HELP_BLOCK")
		public void helpBlock_validate()
		{
			
				executeAction("FIND_HELP");
			}

		
		/* Original PL/SQL code code for TRIGGER HELP_FIELD.WHEN-VALIDATE-ITEM
		 EXECUTE_TRIGGER('FIND_HELP');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * HELP_FIELD.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="HELP_FIELD")
		public void helpField_validate()
		{
			
				executeAction("FIND_HELP");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP_FIND_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GUAHELP_FIND_BTN")
		public void guahelpFindBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER GUAHELP_FIND_BTN.WHEN-BUTTON-PRESSED
		 DECLARE
  WIN_Y     NUMBER;
  ALT_BTN   NUMBER;
BEGIN
  IF :DISPLAY_HELP.HELP_FORM IS NULL THEN
    ALT_BTN := G$_DISPLAY_ALERT('', G$_NLS.Get('GUAHELP-0013', 'FORM','*ERROR* Form name is required ') );
    GO_ITEM('DISPLAY_HELP.HELP_FORM');
    RAISE FORM_TRIGGER_FAILURE;  
  ELSIF :DISPLAY_HELP.HELP_SEL = 'B' THEN
    IF :DISPLAY_HELP.HELP_BLOCK IS NULL THEN
      ALT_BTN := G$_DISPLAY_ALERT('', G$_NLS.Get('GUAHELP-0014', 'FORM','*ERROR* Form name and block name are required for this selection') 
                        );
      GO_ITEM('DISPLAY_HELP.HELP_BLOCK');
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
  ELSIF :DISPLAY_HELP.HELP_SEL = 'I' THEN
    IF :DISPLAY_HELP.HELP_FIELD IS NULL OR :DISPLAY_HELP.HELP_BLOCK IS NULL THEN
      ALT_BTN := G$_DISPLAY_ALERT('', G$_NLS.Get('GUAHELP-0015', 'FORM','*ERROR* Form name, block name and field name are required for this selection') 
                        );
      GO_ITEM('DISPLAY_HELP.HELP_FIELD');
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
  END IF;        
--
  DEFAULT_VALUE('0','GLOBAL.Y_LINE');
  WIN_Y := TO_NUMBER(:GLOBAL.Y_LINE) + 1;
  GO_ITEM('SHOW_HELP.HELP_COMMENT');
--
  IF NVL(LENGTH(:show_help.help_comment), 0) > 0 THEN
    EDIT_TEXTITEM;
    G$_CHECK_FAILURE;
--
    IF :SHOW_HELP.HOLD_COMMENT <> :SHOW_HELP.HELP_COMMENT THEN
      :SHOW_HELP.HOLD_COMMENT := :SHOW_HELP.HELP_COMMENT;
      :SHOW_HELP.HELP_CHG := 'Y';
    ELSE
      :SHOW_HELP.HELP_CHG := 'N';
    END IF;
    GO_FIELD('DISPLAY_HELP.HELP_TYPE');
  ELSE
    IF :GLOBAL.HELP_UPD = 'Y' THEN
      EDIT_TEXTITEM; 
      G$_CHECK_FAILURE;
--
      IF :SHOW_HELP.HELP_COMMENT IS NOT NULL THEN
        :SHOW_HELP.HOLD_COMMENT := :SHOW_HELP.HELP_COMMENT;
        :SHOW_HELP.HELP_CHG := 'Y';
      ELSE
        :SHOW_HELP.HELP_CHG := 'N';
      END IF;
    ELSE
      EXECUTE_TRIGGER('nohelp');
    END IF;
    GO_FIELD('DISPLAY_HELP.HELP_TYPE');
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP_FIND_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GUAHELP_FIND_BTN")
		public void guahelpFindBtn_buttonClick()
		{
			
				{
					NNumber winY= NNumber.getNull();
					NNumber altBtn= NNumber.getNull();
					if ( getFormModel().getDisplayHelp().getHelpForm().isNull() )
					{
						altBtn = getTask().getGoqrpls().gDisplayAlert(toStr(""), GNls.Fget(toStr("GUAHELP-0013"), toStr("FORM"), toStr("*ERROR* Form name is required ")));
						goItem(toStr("DISPLAY_HELP.HELP_FORM"));
						throw new ApplicationException();
					}
					else if ( getFormModel().getDisplayHelp().getHelpSel().equals("B") ) {
						if ( getFormModel().getDisplayHelp().getHelpBlock().isNull() )
						{
							altBtn = getTask().getGoqrpls().gDisplayAlert(toStr(""), GNls.Fget(toStr("GUAHELP-0014"), toStr("FORM"), toStr("*ERROR* Form name and block name are required for this selection")));
							goItem(toStr("DISPLAY_HELP.HELP_BLOCK"));
							throw new ApplicationException();
						}
					}
					else if ( getFormModel().getDisplayHelp().getHelpSel().equals("I") ) {
						if ( getFormModel().getDisplayHelp().getHelpField().isNull() || getFormModel().getDisplayHelp().getHelpBlock().isNull() )
						{
							altBtn = getTask().getGoqrpls().gDisplayAlert(toStr(""), GNls.Fget(toStr("GUAHELP-0015"), toStr("FORM"), toStr("*ERROR* Form name, block name and field name are required for this selection")));
							goItem(toStr("DISPLAY_HELP.HELP_FIELD"));
							throw new ApplicationException();
						}
					}
					// 
					setDefaultValue("0", "GLOBAL.Y_LINE");
					winY = toNumber(toNumber(getGlobal("Y_LINE")).add(1));
					goItem(toStr("SHOW_HELP.HELP_COMMENT"));
					
					Ref<NBool> edOk= new Ref<NBool>();
					Ref<NString> returnedText= new Ref<NString>();
					
					
					editTextitem(returnedText,edOk);
					// 
//					if ( isNull(length(getFormModel().getShowHelp().getHelpComment()), 0).greater(0) )
					if ( length(returnedText.val).greater(0) )
					{
//						TaskServices.editTextItem(true);
						
						
						getTask().getGoqrpls().gCheckFailure();
						// 
						if ( !getFormModel().getShowHelp().getHoldComment().equals(toStr(getFormModel().getShowHelp().getHelpComment())) )
						{
							getFormModel().getShowHelp().setHoldComment(toStr(getFormModel().getShowHelp().getHelpComment()));
							getFormModel().getShowHelp().setHelpChg(toStr("Y"));
						}
						else {
							getFormModel().getShowHelp().setHelpChg(toStr("N"));
						}
						goItem(toStr("DISPLAY_HELP.HELP_TYPE"));
					}
					else {
						if ( getGlobal("HELP_UPD").equals("Y") )
						{
//							TaskServices.editTextItem(true);

							getTask().getGoqrpls().gCheckFailure();
							// 
							if ( !getFormModel().getShowHelp().getHelpComment().isNull() )
							{
								getFormModel().getShowHelp().setHoldComment(toStr(getFormModel().getShowHelp().getHelpComment()));
								getFormModel().getShowHelp().setHelpChg(toStr("Y"));
							}
							else {
								getFormModel().getShowHelp().setHelpChg(toStr("N"));
							}
						}
						else {
							executeAction("nohelp");
						}
						goItem(toStr("DISPLAY_HELP.HELP_TYPE"));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP_1_ROLLBACK_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GUAHELP_1_ROLLBACK_BTN")
		public void guahelp1RollbackBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}
		

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GUAHELP_1_ROLLBACK_BTN")
		public void guahelp1RollbackBtn_buttonClick()
		{
			
				getGFormClass().clearTask();
			}
		
		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP_1_SAVE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GUAHELP_1_SAVE_BTN")
		public void guahelp1SaveBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GUAHELP_1_EXIT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GUAHELP_1_EXIT_BTN")
		public void guahelp1ExitBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
			}

		
	
	
}

