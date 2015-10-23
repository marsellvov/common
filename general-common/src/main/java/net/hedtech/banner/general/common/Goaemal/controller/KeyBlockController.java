package net.hedtech.banner.general.common.Goaemal.controller;
 
import static morphis.foundations.core.appsupportlib.Globals.getGlobal;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.nextBlock;
import static morphis.foundations.core.appsupportlib.runtime.BlockServices.validateBlock;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.goItem;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.nextItem;
import static morphis.foundations.core.appsupportlib.runtime.ItemServices.setItemVisible;
import static morphis.foundations.core.appsupportlib.runtime.MessageServices.*;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.executeAction;
import static morphis.foundations.core.appsupportlib.runtime.TaskServices.getUser;
import static morphis.foundations.core.types.Types.toStr;
import morphis.foundations.core.appsupportlib.exceptions.ApplicationException;
import morphis.foundations.core.appsupportlib.runtime.action.ActionTrigger;
import morphis.foundations.core.appsupportlib.runtime.action.ValidationTrigger;
import morphis.foundations.core.appsupportlib.runtime.control.AbstractBlockController;
import morphis.foundations.core.appsupportlib.runtime.control.IFormController;
import morphis.foundations.core.appsupportlib.ui.KeyFunction;
import morphis.foundations.core.types.NInteger;
import morphis.foundations.core.types.NNumber;
import morphis.foundations.core.types.NString;
import morphis.foundations.core.util.Ref;
import net.hedtech.banner.general.common.Goaemal.GoaemalTask;
import net.hedtech.banner.general.common.Goaemal.model.GoaemalModel;
import net.hedtech.banner.general.common.Goaemal.model.KeyBlock;
import net.hedtech.general.common.dbservices.GNls;
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;
import net.hedtech.general.common.libraries.Goqolib.services.GIdClass;
import net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass;
import net.hedtech.general.common.libraries.Goqolib.services.GNameClass;
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class KeyBlockController extends DefaultBlockController {

	private GKeyBlockClass getGKeyBlockClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_KEY_BLOCK_CLASS");
	}	
	private GIdClass getGIdClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIdClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ID_CLASS");
	}	
	private GNameClass getGNameClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNameClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NAME_CLASS");
	}	
	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	

	
	public KeyBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public GoaemalTask getTask() {
		return (GoaemalTask)super.getTask();
	}

	public GoaemalModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void keyBlock_blockOut()
		{
			
				getGKeyBlockClass().postBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void keyBlock_Save()
		{
			
				getGKeyBlockClass().save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-UP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void keyBlock_MoveUp()
		{
			
				getGKeyBlockClass().moveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void keyBlock_MoveDown()
		{
			
				getGKeyBlockClass().moveDown();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void keyBlock_CreateRecord()
		{
			
				getGKeyBlockClass().createRecord();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void keyBlock_DeleteRecord()
		{
			
				getGKeyBlockClass().deleteRecord();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void keyBlock_Search()
		{
			
				getGKeyBlockClass().search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void keyBlock_ExecuteQuery()
		{
			
				getGKeyBlockClass().executeQuery();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void keyBlock_NextRecord()
		{
			
				getGKeyBlockClass().nextRecord();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET")
		public void keyBlock_KeyNxtset()
		{
			
				getGKeyBlockClass().keyNxtset();
			}

		
		/*
		 *<p>
		 *This trigger checks if a valid PIDM exists.  If it does, perform previous

		 *block and execute query.  If not, display error message.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void keyBlock_PreviousBlock()
		{
			
				getGKeyBlockClass().previousBlock();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void keyBlock_PreviousRecord()
		{
			
				getGKeyBlockClass().previousRecord();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-LISTVAL
		 EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(USER,'SOAIDEN','QUERY');
--
G$_RESET_GLOBAL;
G$_CHECK_FAILURE;
:ID := :GLOBAL.VALUE;
NEXT_ITEM;
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", function=KeyFunction.LIST_VALUES)
		public void keyBlock_ListValues()
		{
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("SOAIDEN"), toStr("QUERY"));
				// 
				getTask().getGoqrpls().gResetGlobal();
				getTask().getGoqrpls().gCheckFailure();
				getFormModel().getKeyBlock().setId(getGlobal("VALUE"));
				nextItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-DUPREC
		 G$_INVALID_FUNCTION_MSG;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void keyBlock_CopyRecord()
		{
			
				getTask().getGoqrpls().gInvalidFunctionMsg();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-NXTBLK
		 IF :ID IS NULL THEN
  MESSAGE(G$_NLS.Get('GOAEMAL-0001','FORM','*ERROR* Invalid code; press LIST for valid value.') );	
ELSE
  NEXT_BLOCK;
  EXECUTE_TRIGGER('DISABLE_KEYS');
  EXECUTE_TRIGGER('ENABLE_TAB_PAGES');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void keyBlock_NextBlock()
		{
			
				if ( getFormModel().getKeyBlock().getId().isNull() )
				{
					errorMessage(GNls.Fget(toStr("GOAEMAL-0001"), toStr("FORM"), toStr("*ERROR* Invalid code; press LIST for valid value.")));
				}
				else {
					executeAction("DISABLE_KEYS");
					executeAction("ENABLE_TAB_PAGES");
					nextBlock();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="ID", function=KeyFunction.ITEM_IN)
		public void id_itemIn()
		{
			getGIdClass().itemIn();
		}		

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="ID", function=KeyFunction.NEXT_ITEM)
		public void id_keyNexItem()
		{
				getGIdClass().keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="ID")
		public void id_validate()
		{
			this.id_PostChange();
		}

		
		/* Original PL/SQL code code for TRIGGER ID.POST-CHANGE
		 DECLARE
  cursora      INTEGER;
  ignore_value NUMBER(1);
  lv_col_err   NUMBER;
  lv_col_len   NUMBER;
	lv_sp_id     VARCHAR2(9);
  lv_sql_stmt  VARCHAR2(2000);
  ret_code     INTEGER;
BEGIN
  :KEYBLOCK_NAME := '';
--
-- Added to set up fields visibility on/off control
--
  SET_ITEM_PROPERTY('CONF_INFO',DISPLAYED, PROPERTY_OFF);
  SET_ITEM_PROPERTY('DECEASED_INFO',DISPLAYED, PROPERTY_OFF);
--
-- Changed to G$_VALID_ALL_ID From G$_VALID_ID To allow for non-person emails 4/13/99
--
  G$_VALID_ALL_ID(:ID,:PIDM,:KEYBLOCK_NAME,:CONF_INFO,:DECEASED_INFO);
--
  IF :CONF_INFO IS NOT NULL THEN
    SET_ITEM_PROPERTY('CONF_INFO', DISPLAYED, PROPERTY_ON);
  END IF;
--
  IF :DECEASED_INFO IS NOT NULL THEN
	  SET_ITEM_PROPERTY('DECEASED_INFO', DISPLAYED, PROPERTY_ON);
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="ID")
		public void id_PostChange()
		{
			
				KeyBlock keyBlockElement = (KeyBlock) this.getFormModel().getKeyBlock();
			
				if(keyBlockElement.getId().isNull()){
					keyBlockElement.setKeyblockName(toStr(""));
					return;
				}
				{
//					NInteger cursora= NInteger.getNull();
//					NNumber ignoreValue= NNumber.getNull();
//					NNumber lvColErr= NNumber.getNull();
//					NNumber lvColLen= NNumber.getNull();
//					NString lvSpId= NString.getNull();
//					NString lvSqlStmt= NString.getNull();
//					NInteger retCode= NInteger.getNull();
					
					getFormModel().getKeyBlock().setKeyblockName(toStr(""));
					// 
					//  Added to set up fields visibility on/off control
					// 
					setItemVisible("CONF_INFO", false);
					setItemVisible("DECEASED_INFO", false);
					// 
					//  Changed to G$_VALID_ALL_ID From G$_VALID_ID To allow for non-person emails 4/13/99
					// 
					Ref<NString> pId_ref = new Ref<NString>(getFormModel().getKeyBlock().getId());
					Ref<NNumber> pPidm_ref = new Ref<NNumber>(getFormModel().getKeyBlock().getPidm());
					Ref<NString> pFullName_ref = new Ref<NString>(getFormModel().getKeyBlock().getKeyblockName());
					Ref<NString> pConfidInd_ref = new Ref<NString>(getFormModel().getKeyBlock().getConfInfo());
					Ref<NString> pDcsdInd_ref = new Ref<NString>(getFormModel().getKeyBlock().getDeceasedInfo());
					getTask().getGoqrpls().gValidAllId(pId_ref, pPidm_ref, pFullName_ref, pConfidInd_ref, pDcsdInd_ref);
					getFormModel().getKeyBlock().setId(pId_ref.val);
					getFormModel().getKeyBlock().setPidm(pPidm_ref.val);
					getFormModel().getKeyBlock().setKeyblockName(pFullName_ref.val);
					getFormModel().getKeyBlock().setConfInfo(pConfidInd_ref.val);
					getFormModel().getKeyBlock().setDeceasedInfo(pDcsdInd_ref.val);
					// 
					if ( !getFormModel().getKeyBlock().getConfInfo().isNull() )
					{
						setItemVisible("CONF_INFO", true);
					}
					// 
					if ( !getFormModel().getKeyBlock().getDeceasedInfo().isNull() )
					{
						setItemVisible("DECEASED_INFO", true);
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-CQUERY
		 -- Trigger added 4/13/99 to allow for non-person email addresses
G$_COPY_FLD_ATTR;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(USER,'SOACOMP','QUERY');
G$_RESET_GLOBAL;
G$_CHECK_FAILURE;
EXECUTE_TRIGGER('LIST_VALUES_COPY');
NEXT_ITEM;
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="ID", function=KeyFunction.COUNT_QUERY)
		public void id_TotalResults()
		{
			
				//  Trigger added 4/13/99 to allow for non-person email addresses
				//  Trigger added 4/13/99 to allow for non-person email addresses
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("SOACOMP"), toStr("QUERY"));
				getTask().getGoqrpls().gResetGlobal();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LIST_VALUES_COPY");
				nextItem();
				id_validate();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-DUP-ITEM
		 -- 54-2 add trigger to provide Option List Window display and
--      access to GUIALTI form
G$_COPY_FLD_ATTR;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(USER,'GUIALTI','QUERY');
G$_RESET_GLOBAL;
G$_CHECK_FAILURE;
EXECUTE_TRIGGER('LIST_VALUES_COPY');
NEXT_ITEM;
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", item="ID", function=KeyFunction.DUPLICATE_RECORD)
		public void id_KeyDupItem()
		{
				//MORPHIS FLAVOR START (function=KeyFunction.DUPLICATE_RECORD added to the trigger KEY-DUP-ITEM)
				//MORPHIS FLAVOR END
				//  54-2 add trigger to provide Option List Window display and
				//       access to GUIALTI form
				//  54-2 add trigger to provide Option List Window display and
				//       access to GUIALTI form
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("GUIALTI"), toStr("QUERY"));
				getTask().getGoqrpls().gResetGlobal();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LIST_VALUES_COPY");
				nextItem();
				id_validate();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-LISTVAL
		 -- Trigger Added 4/13/99 to allow for non-person email addresses
G$_COPY_FLD_ATTR;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(USER,'SOAIDEN','QUERY');
G$_RESET_GLOBAL;
G$_CHECK_FAILURE;
EXECUTE_TRIGGER('LIST_VALUES_COPY');
NEXT_ITEM;
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="ID", function=KeyFunction.LIST_VALUES)
		public void id_ListValues()
		{
			
				//  Trigger Added 4/13/99 to allow for non-person email addresses
				//  Trigger Added 4/13/99 to allow for non-person email addresses
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("SOAIDEN"), toStr("QUERY"));
				getTask().getGoqrpls().gResetGlobal();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("LIST_VALUES_COPY");
				nextItem();
				id_validate();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEYBLOCK_NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="KEYBLOCK_NAME", function=KeyFunction.NEXT_ITEM)
		public void keyblockName_keyNexItem()
		{
			
				getGNameClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ID_LBT")
		public void idLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER ID_LBT.WHEN-BUTTON-PRESSED
		 -- 54-2 add DUPLICATE_ITEM to provide Option List Window 
--      display and access to GUIALTI form
-- Adding the ability to have email address for non-persons 4/13/99
G$_KEY_OPT_MENU('ID',G$_NLS.GET('GOAEMAL-0002','FORM','Person Search (SOAIDEN)'),'LIST_VALUES',
                     G$_NLS.GET('GOAEMAL-0003','FORM','Non-person Search (SOACOMP)'),'COUNT_QUERY',
                     G$_NLS.GET('GOAEMAL-0004','FORM','Alternate ID Search (GUIALTI)'),'DUPLICATE_ITEM',
                     '','');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ID_LBT")
		public void idLbt_buttonClick()
		{
			
				//  54-2 add DUPLICATE_ITEM to provide Option List Window 
				//       display and access to GUIALTI form
				//  Adding the ability to have email address for non-persons 4/13/99
				//  54-2 add DUPLICATE_ITEM to provide Option List Window 
				//       display and access to GUIALTI form
				//  Adding the ability to have email address for non-persons 4/13/99
				getTask().getGoqrpls().gKeyOptMenu(toStr("KEY_BLOCK.ID"), GNls.Fget(toStr("GOAEMAL-0002"), toStr("FORM"), toStr("Person Search (SOAIDEN)")), toStr("LIST_VALUES"), GNls.Fget(toStr("GOAEMAL-0003"), toStr("FORM"), toStr("Non-person Search (SOACOMP)")), toStr("COUNT_QUERY"), GNls.Fget(toStr("GOAEMAL-0004"), toStr("FORM"), toStr("Alternate ID Search (GUIALTI)")), toStr("DUPLICATE_RECORD"), toStr(""), toStr(""));
				getTask().getGoqrpls().gCheckFailure();

		}
	
}

