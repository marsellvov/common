package net.hedtech.banner.general.common.Gxadird.controller;
 
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
import net.hedtech.banner.general.common.Gxadird.model.*;
import net.hedtech.banner.general.common.Gxadird.*;
import net.hedtech.banner.general.common.Gxadird.services.*;
import net.hedtech.banner.general.common.Gxadird.model.KeyBlock;
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
	public GxadirdTask getTask() {
		return (GxadirdTask)super.getTask();
	}

	public GxadirdModel getFormModel() {
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
		 IF :ID is not null then
NEXT_BLOCK ;
:SYSTEM.MESSAGE_LEVEL:='5';
--EXECUTE_QUERY;
:SYSTEM.MESSAGE_LEVEL:='0';
ELSE
 MESSAGE( G$_NLS.Get('GXADIRD-0010', 'FORM','ID must be entered.') );
 RAISE FORM_TRIGGER_FAILURE;
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
			
				if ( !getFormModel().getKeyBlock().getId().isNull() )
				{
					nextBlock();
				}
				else {
					errorMessage(GNls.Fget(toStr("GXADIRD-0010"), toStr("FORM"), toStr("*ERROR* ID must be entered.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.CHECK_KEYS
		    G$_CHECK_VALUE ((:KEY_BLOCK.PIDM IS NULL),
       G$_NLS.Get('GXADIRD-0011', 'FORM','*ERROR* A valid ID must be entered for this function.') ,
         TRUE, TRUE);
--
   --N$_CHECK_PIDM(:PIDM);
   G$_CHECK_FAILURE;
  -- P$_DO_SECURITY (:PIDM,'') ;
   G$_CHECK_FAILURE ;
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
			
				getTask().getGoqrpls().gCheckValue(toBool((getFormModel().getKeyBlock().getPidm().isNull())), GNls.Fget(toStr("GXADIRD-0011"), toStr("FORM"), toStr("*ERROR* A valid ID must be entered for this function.")), toBool(NBool.True), toBool(NBool.True));
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.POST-BLOCK
		    :CHECK_KEYS := 'Y';
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
			getGKeyBlockClass().postBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.PRE-BLOCK
		 IF GET_ITEM_PROPERTY('GXRDIRD_STATUS',ENABLED) = 'TRUE' THEN         
   SET_ITEM_PROPERTY('GXRDIRD_STATUS',ENABLED,PROPERTY_OFF);
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void keyBlock_blockIn()
		{
			
				if ( getItemEnabled("GXRDIRD_STATUS").equals("TRUE") )
				{
					setItemEnabled("GXRDIRD_STATUS", false);
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
				getGIdClass().validate();
			}

		
		/* Original PL/SQL code code for TRIGGER ID.POST-CHANGE
		 DECLARE
  DESC_RET      VARCHAR2(2);
  HOLD_VALUE    VARCHAR2(1);
  SQL_STMT      VARCHAR2(200);
BEGIN
  G$_SEL_SPRIDEN_PIDM_NAME(:KEY_BLOCK.ID, 'NAME', 'Y', :PIDM);
  G$_CHECK_FAILURE;
--
  IF :GLOBAL.FINSYS = 'Y' THEN
    SQL_STMT := 'SELECT ''Y'' FROM FTVVEND ' ||
                ' WHERE FTVVEND_PIDM = ' || :PIDM || 
                '   AND FTVVEND_CURR_CODE IS NOT NULL';
    GOKDBMS.DYNAMIC_SQL(SQL_STMT,DESC_RET);
--
    IF DESC_RET IS NOT NULL THEN
      HOLD_VALUE := DESC_RET;
      MESSAGE(G$_NLS.Get('GXADIRD-0012','FORM','Direct Deposit Disbursements cannot be made in foreign currencies.  Vendor record is associated with a foreign currency.'));
      RAISE FORM_TRIGGER_FAILURE;
    ELSE
      NULL;
    END IF;
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
			
			KeyBlock keyBlockElement = (KeyBlock)  this.getFormModel().getKeyBlock();
			
				if(keyBlockElement.getId().isNull())
					return;
				{
					
					NString descRet= NString.getNull();
					NString holdValue= NString.getNull();
					NString sqlStmt= NString.getNull();
					Ref<NString> pId_ref = new Ref<NString>(getFormModel().getKeyBlock().getId());
					Ref<NNumber> pPidm_ref = new Ref<NNumber>(getFormModel().getKeyBlock().getPidm());
					
					getTask().getGoqrpls().gSelSpridenPidmName(pId_ref, toStr("KEY_BLOCK.NAME"), toStr("Y"), pPidm_ref);
					getFormModel().getKeyBlock().setId(pId_ref.val);
					getFormModel().getKeyBlock().setPidm(pPidm_ref.val);
					getTask().getGoqrpls().gCheckFailure();
					if ( getGlobal("FINSYS").equals("Y") )
					{
						sqlStmt = toStr("SELECT 'Y' FROM FTVVEND WHERE FTVVEND_PIDM = ").append(getFormModel().getKeyBlock().getPidm()).append("   AND FTVVEND_CURR_CODE IS NOT NULL");
						Ref<NString> p_return_value1_ref = new Ref<NString>(descRet);
						Gokdbms.dynamicSql(sqlStmt, p_return_value1_ref);
						descRet = p_return_value1_ref.val;
						if ( !descRet.isNull() )
						{
							holdValue = descRet;
							errorMessage(GNls.Fget(toStr("GXADIRD-0012"), toStr("FORM"), toStr("*ERROR* Direct Deposit Disbursements cannot be made in foreign currencies.  Vendor record is associated with a foreign currency.")));
							throw new ApplicationException();
						}
						else {
							return;
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-CQUERY
		 EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL (:GLOBAL.CURRENT_USER,'SOACOMP','QUERY');
--
   IF :GLOBAL.VALUE IS NOT NULL THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
      G$_CHECK_FAILURE ;
      NEXT_FIELD ;
   END IF ;
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
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("SOACOMP"), toStr("QUERY"));
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
					id_validate();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-LISTVAL
		 G$_COPY_FLD_ATTR;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL (:GLOBAL.CURRENT_USER,'SOAIDEN','QUERY');
G$_RESET_GLOBAL;
--
   IF :GLOBAL.VALUE IS NOT NULL THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
      G$_CHECK_FAILURE ;
      NEXT_FIELD ;
   END IF ;
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
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
					id_validate();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-DUP-ITEM
		 -- 54-1 added to present GUIALTI form in Option List Window
--      and Menu Bar Options
G$_COPY_FLD_ATTR;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL (:GLOBAL.CURRENT_USER,'GUIALTI','QUERY');
G$_RESET_GLOBAL;
--
IF :GLOBAL.VALUE IS NOT NULL THEN
   EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
   G$_CHECK_FAILURE ;
   NEXT_FIELD ;
END IF ;
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

		@ActionTrigger(action="KEY-DUP-ITEM", item = "ID")
		public void id_KeyDupItem()
		{
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("GUIALTI"), toStr("QUERY"));
				getTask().getGoqrpls().gResetGlobal();
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
					id_validate();
				}
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

