   package net.hedtech.banner.general.common.Goaintl.controller;
 
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
import net.hedtech.banner.general.common.Goaintl.model.*;
import net.hedtech.banner.general.common.Goaintl.*;
import net.hedtech.banner.general.common.Goaintl.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIdClass;	
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

	
	public KeyBlockController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
	
		
	@Override
	public GoaintlTask getTask() {
		return (GoaintlTask)super.getTask();
	}

	public GoaintlModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
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

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-NXTBLK
		 go_block('gorvisa');
		*/
		/*
		 *<p>
		 *This trigger will check if an id number or 'GENERATED' was entered.  If it

		 *was, then advance to next block. If not, display error message.
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

				goBlock(toStr("gorvisa"));

		}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.CHECK_KEYS
		 G$_CHECK_VALUE (:KEY_BLOCK.PIDM IS NULL, G$_NLS.Get('GOAINTL-0051', 'FORM','*ERROR*  An existing ID number must be entered for this function.') ,TRUE,TRUE);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.CHECK_KEYS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_KEYS")
		public void keyBlock_CheckKeys()
		{
			
				getTask().getGoqrpls().gCheckValue(toBool(getFormModel().getKeyBlock().getPidm().isNull()), GNls.Fget(toStr("GOAINTL-0051"), toStr("FORM"), toStr("*ERROR*  An existing ID number must be entered for this function.")), toBool(NBool.True), toBool(NBool.True));
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.POST-BLOCK
		 :CHECK_KEYS := 'Y';
:CHECK_KEYS := 'Y';
if :key_block.id is not null then
:GLOBAL.KEY_IDNO := :KEY_BLOCK.ID;
end if;
		*/
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
			
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("Y"));
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("Y"));
				if ( !getFormModel().getKeyBlock().getId().isNull() )
				{
					setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
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
		 * ID.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="ID", function=KeyFunction.COUNT_QUERY)
		public void id_TotalResults()
		{
			
				getGIdClass().totalResults();
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

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-LISTVAL
		    G$_COPY_FLD_ATTR;
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'SOAIDEN', 'QUERY');
   G$_RESET_GLOBAL;
--
   IF :GLOBAL.VALUE IS NOT NULL THEN
      COPY(:GLOBAL.VALUE, :SYSTEM.CURRENT_FIELD);
      NEXT_ITEM;
   END IF;
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
			
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("SOAIDEN"), toStr("QUERY"));
				getTask().getGoqrpls().gResetGlobal();
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					copy(getGlobal("VALUE"),getCurrentField());
					nextItem();
				}
				id_validate();
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEYCQUERY
		 G$_COPY_FLD_ATTR;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL (:GLOBAL.CURRENT_USER,'SOAIDEN','QUERY');
G$_RESET_GLOBAL;
--
 IF :GLOBAL.VALUE IS NOT NULL THEN
      COPY(:GLOBAL.VALUE, :SYSTEM.CURRENT_FIELD);
      NEXT_ITEM;
 END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEYCQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEYCQUERY", item="ID")
		public void id_Keycquery()
		{
			
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("SOAIDEN"), toStr("QUERY"));
				getTask().getGoqrpls().gResetGlobal();
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					copy(getGlobal("VALUE"),getCurrentField());
					nextItem();
				}
				id_validate();
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-DUP-ITEM
		 -- Added to call the new GUILATI form from Option List Window 
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(USER,'GUIALTI','QUERY');
--
IF :GLOBAL.VALUE IS NOT NULL THEN
  EXECUTE_TRIGGER('LIST_VALUES_COPY');
  G$_CHECK_FAILURE;
  NEXT_FIELD;
  G$_CHECK_FAILURE;
END IF;

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

		@ActionTrigger(action="KEY-DUP-ITEM", item="ID", function=KeyFunction.DUPLICATE_ITEM)
		public void id_KeyDupItem()
		{
			
				//  Added to call the new GUILATI form from Option List Window 
				//  Added to call the new GUILATI form from Option List Window 
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("GUIALTI"), toStr("QUERY"));
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
					getTask().getGoqrpls().gCheckFailure();
				}
				id_validate();
			}

		
		/* Original PL/SQL code code for TRIGGER ID.POST-CHANGE
		 G$_VALID_ID(:key_block.ID,:PIDM,:KEY_BLOCK.NAME,:CONF_INFO,:DECEASED_INFO);
G$_CHECK_FAILURE;
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
			KeyBlock keyBlockElement = this.getFormModel().getKeyBlock();
				if(keyBlockElement.getId().isNull())
					return;
				Ref<NString> pId_ref = new Ref<NString>(getFormModel().getKeyBlock().getId());
				Ref<NNumber> pPIdm_ref = new Ref<NNumber>(toNumber(getFormModel().getKeyBlock().getPidm()));
				Ref<NString> pFullName_ref = new Ref<NString>(getFormModel().getKeyBlock().getNname());
				Ref<NString> pConfidInd_ref = new Ref<NString>(getFormModel().getKeyBlock().getConfInfo());
				Ref<NString> pDcsdInd_ref = new Ref<NString>(getFormModel().getKeyBlock().getDeceasedInfo());
				getTask().getGoqrpls().gValidId(pId_ref, pPIdm_ref, pFullName_ref, pConfidInd_ref, pDcsdInd_ref);
				getFormModel().getKeyBlock().setId(pId_ref.val);
				getFormModel().getKeyBlock().setPidm(toStr(pPIdm_ref.val));
				getFormModel().getKeyBlock().setNname(pFullName_ref.val);
				getFormModel().getKeyBlock().setConfInfo(pConfidInd_ref.val);
				getFormModel().getKeyBlock().setDeceasedInfo(pDcsdInd_ref.val);
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="NAME", function=KeyFunction.NEXT_ITEM)
		public void name_keyNexItem()
		{
			
				getGNameClass().keyNexItem();
			}

		
	
	
}

