package net.hedtech.banner.alumni.common.Apaiden.controller;
 
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
import morphis.core.utils.behavior.annotations.*;
import morphis.foundations.flavors.forms.appsupportlib.runtime.*;
import net.hedtech.general.common.dbservices.*;
import net.hedtech.general.common.dbservices.dbtypes.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.alumni.common.Apaiden.model.*;
import net.hedtech.banner.alumni.common.Apaiden.*;
import net.hedtech.banner.alumni.common.Apaiden.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GKeyBlockClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIdClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GNameClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
		
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
	public ApaidenTask getTask() {
		return (ApaidenTask)super.getTask();
	}

	public ApaidenModel getFormModel() {
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

		@ActionTrigger(action="KEY-UP", function=KeyFunction.UP)
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

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.DOWN)
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

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.POST-BLOCK
		 :CHECK_KEYS := 'Y';
:GLOBAL.VALUE := '';
<multilinecomment> New Lines - TV 01-15-99</multilinecomment>
IF :ENTITY_IND <> 'P' THEN
 G$_NAVIGATION_FRAME.DISABLE_OPTION('APAPERS','L');
ELSE
 G$_NAVIGATION_FRAME.ENABLE_OPTION('APAPERS','L');
END IF;



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
		@After
		public void keyBlock_blockOut()
		{
			
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("Y"));
				setGlobal("VALUE", toStr(""));
				//  New Lines - TV 01-15-99
				if ( getFormModel().getKeyBlock().getEntityInd().notEquals("P") )
				{
					getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("APAPERS"), toStr("L"));
				}
				else {
					getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("APAPERS"), toStr("L"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.OLDKEYMENU
		    NEXT_FIELD ;
--
   G$_CHECK_VALUE ((:KEY_BLOCK.PIDM IS NULL),
 G$_NLS.Get('APAIDEN-0034', 'FORM','*ERROR* An existing id number must be entered for this function.') , TRUE,
          TRUE);
--
   EXECUTE_TRIGGER( 'MENU_TRIGGER' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *This trigger will check for a valid PIDM. If one exists, it will execute

		 *the menu trigger. If not, an error is displayed.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.OLDKEYMENU
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="OLDKEYMENU")
		public void keyBlock_Oldkeymenu()
		{
			
				nextItem();
				// 
				getTask().getGoqrpls().gCheckValue(((getFormModel().getKeyBlock().getPidm().isNull())), GNls.Fget(toStr("APAIDEN-0034"), toStr("FORM"), toStr("*ERROR* An existing id number must be entered for this function.")), toBool(NBool.True), toBool(NBool.True));
				// 
				executeAction("MENU_TRIGGER");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.SEARCH_ALT_ID
		 -- Added to call new GUIALTI form for Alternate ID Search.
--
GO_ITEM('KEY_BLOCK.ID');
:GLOBAL.FORM_WAS_CALLED := 'Y' ;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'GUIALTI','QUERY');
:GLOBAL.FORM_WAS_CALLED := '' ;
--
   IF :GLOBAL.VALUE IS NOT NULL  THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
      G$_CHECK_FAILURE ;
      NEXT_FIELD ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.SEARCH_ALT_ID
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SEARCH_ALT_ID")
		public void keyBlock_SearchAltId()
		{
			
				//  Added to call new GUIALTI form for Alternate ID Search.
				// 
				//  Added to call new GUIALTI form for Alternate ID Search.
				// 
				goItem(toStr("KEY_BLOCK.ID"));
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("GUIALTI"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr(""));
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-NXTBLK
		 NEXT_BLOCK;


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
			
				nextBlock();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.OLDKEYPRVBLK
		    NEXT_FIELD ;
--
   G$_CHECK_VALUE ((:KEY_BLOCK.PIDM IS NULL),
 G$_NLS.Get('APAIDEN-0035', 'FORM','*ERROR* An existing id number must be entered for this function.') , TRUE,
          TRUE);
--
   GO_BLOCK( 'SPRADDR' ) ;
   EXECUTE_QUERY ;
		*/
		/*
		 *<p>
		 *This trigger checks if a valid PIDM exists.  If it does, perform previous

		 *block and execute query.  If not, display error message.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.OLDKEYPRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="OLDKEYPRVBLK")
		public void keyBlock_Oldkeyprvblk()
		{
			
				nextItem();
				// 
				getTask().getGoqrpls().gCheckValue(((getFormModel().getKeyBlock().getPidm().isNull())), GNls.Fget(toStr("APAIDEN-0035"), toStr("FORM"), toStr("*ERROR* An existing id number must be entered for this function.")), toBool(NBool.True), toBool(NBool.True));
				// 
				goBlock(toStr("SPRADDR"));
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.KEY-CLRFRM
		   EXECUTE_TRIGGER( 'INVALID_FUNCTION_MSG' ) ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void keyBlock_ClearTask()
		{
			
				//executeAction("INVALID_FUNCTION_MSG");
				executeAction("CLRFRM_TRIGGER");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.INVALID_KEY
		 message( G$_NLS.Get('APAIDEN-0036', 'FORM','*ERROR* A valid ID must be entered for this function.') );
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * KEY_BLOCK.INVALID_KEY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="INVALID_KEY")
		public void keyBlock_InvalidKey()
		{
			
				errorMessage(GNls.Fget(toStr("APAIDEN-0036"), toStr("FORM"), toStr("*ERROR* A valid ID must be entered for this function.")));
			}

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.CHECK_KEYS
		 if :key_block.id is null then
  execute_trigger('invalid_key');
end if;
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
			
				if ( getFormModel().getKeyBlock().getId().isNull() )
				{
					executeAction("invalid_key");
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
			
			getGIdClass().nextItem();
		}

		
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
			
			getGIdClass().postChange();
			
			if(getFormModel().getKeyBlock().getId().isNotNull())
			{
				setItemVisible("DONR_CAT_LBT", true);
			}
			else
			{
				setItemVisible("DONR_CAT_LBT", false);
			}
		}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-CQUERY
		 EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'SOACOMP','QUERY');
--
   IF :GLOBAL.VALUE IS NOT NULL  THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
      G$_CHECK_FAILURE ;
      NEXT_FIELD;
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
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-LISTVAL
		 EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'SOAIDEN','QUERY');
--
   IF :GLOBAL.VALUE IS NOT NULL  THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
      G$_CHECK_FAILURE ;
      NEXT_FIELD;
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
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("SOAIDEN"), toStr("QUERY"));
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-DUP-ITEM
		 :ID := 'GENERATED';
:global.key_idno := 'GENERATED';
--
EXECUTE_TRIGGER('VALIDATE_ID');
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

		@ActionTrigger(action="KEY-DUP-ITEM", item="ID", function=KeyFunction.DUPLICATE_ITEM)
		public void id_KeyDupItem()
		{
			
				getFormModel().getKeyBlock().setId(toStr("GENERATED"));
				setGlobal("KEY_IDNO", toStr("GENERATED"));
				// 
				executeAction("VALIDATE_ID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ID.WHEN-VALIDATE-ITEM
		 EXECUTE_TRIGGER('VALIDATE_ID');
G$_CHECK_FAILURE;

		*/
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
				executeAction("VALIDATE_ID");
				getGIdClass().nextItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-DUPREC
		 EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'AOAIDEN','');
--
   IF :GLOBAL.VALUE IS NOT NULL  THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
      G$_CHECK_FAILURE ;
      NEXT_FIELD;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", item="ID", function=KeyFunction.DUPLICATE_RECORD)
		public void id_CopyRecord()
		{
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("AOAIDEN"), toStr(""));
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-PRVREC
		 EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'AOAORGN','QUERY');
--
   IF :GLOBAL.VALUE IS NOT NULL  THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
      G$_CHECK_FAILURE ;
      NEXT_FIELD;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", item="ID", function=KeyFunction.PREVIOUS_RECORD)
		public void id_PreviousRecord()
		{
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("AOAORGN"), toStr("QUERY"));
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-NXTSET
		 :GLOBAL.FORM_WAS_CALLED := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'APASBIO','QUERY');
:GLOBAL.FORM_WAS_CALLED := '';
--
   IF :GLOBAL.VALUE IS NOT NULL  THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
      G$_CHECK_FAILURE ;
      NEXT_FIELD;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET", item="ID")
		public void id_KeyNxtset()
		{
			
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("APASBIO"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr(""));
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-NXTREC
		 EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
  G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'AOACOMP','QUERY');
--
   IF :GLOBAL.VALUE IS NOT NULL  THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
      G$_CHECK_FAILURE ;
      NEXT_FIELD;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", item="ID", function=KeyFunction.NEXT_RECORD)
		public void id_NextRecord()
		{
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("AOACOMP"), toStr("QUERY"));
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FULL_NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FULL_NAME", function=KeyFunction.NEXT_ITEM)
		public void fullName_keyNexItem()
		{
			
			getGNameClass().nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPS_NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPS_NAME", function=KeyFunction.NEXT_ITEM)
		public void spsName_keyNexItem()
		{
			
			getGNameClass().nextItem();
			if(getFormModel().getKeyBlock().getId().isNotNull())
			{
				setItemVisible("DONR_CAT_LBT", true);
			}
			else
			{
				setItemVisible("DONR_CAT_LBT", false);
			}
		}

		
		/* Original PL/SQL code code for TRIGGER SPS_IDNO.KEY-LISTVAL
		   IF :GLOBAL.ALUM_CALLED_FORM IS NULL  THEN
      :GLOBAL.ALUM_CALLED_FORM := 'Y' ;
      :GLOBAL.FORM_WAS_CALLED := 'Y';
      :GLOBAL.KEY_IDNO := :SPS_IDNO;
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
      G$_SECURED_FORM_CALL(:global.current_user,'APASBIO','QUERY');
      :GLOBAL.KEY_IDNO := :ID;
      :GLOBAL.ALUM_CALLED_FORM := '' ;
      :GLOBAL.FORM_WAS_CALLED := '';
   ELSE
      RETURN ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPS_IDNO.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SPS_IDNO", function=KeyFunction.LIST_VALUES)
		public void spsIdno_ListValues()
		{
			
				if ( getGlobal("ALUM_CALLED_FORM").isNull() )
				{
					setGlobal("ALUM_CALLED_FORM", toStr("Y"));
					setGlobal("FORM_WAS_CALLED", toStr("Y"));
					setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getSpsIdno());
					executeAction("G$_REVOKE_ACCESS");
					getTask().getGoqrpls().gCheckFailure();
					getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("APASBIO"), toStr("QUERY"));
					setGlobal("KEY_IDNO", getFormModel().getKeyBlock().getId());
					setGlobal("ALUM_CALLED_FORM", toStr(""));
					setGlobal("FORM_WAS_CALLED", toStr(""));
				}
				else {
					return ;
				}
			}

		
		/* Original PL/SQL code code for TRIGGER SPS_IDNO.WHEN-NEW-ITEM-INSTANCE
		 IF :SPS_IDNO IS NULL THEN
 GO_ITEM('KEY_BLOCK.ID');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPS_IDNO.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPS_IDNO", function=KeyFunction.ITEM_CHANGE)
		public void spsIdno_itemChange()
		{
			
				if ( getFormModel().getKeyBlock().getSpsIdno().isNull() )
				{
					goItem(toStr("KEY_BLOCK.ID"));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DONR_CAT_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="DONR_CAT_LBT")
		@Before
		public void donrCatLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER DONR_CAT_LBT.WHEN-BUTTON-PRESSED
		 A$_DISPLAY_APRCATG_LOV;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DONR_CAT_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="DONR_CAT_LBT")
		public void donrCatLbt_buttonClick()
		{
				//MORPHIS TODO MP LOV bug
				getTask().getAoqrpls().aDisplayAprcatgLov();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPS_IDNO_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPS_IDNO_LBT")
		@Before
		public void spsIdnoLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER SPS_IDNO_LBT.WHEN-BUTTON-PRESSED
		 go_item('sps_idno');
G$_CHECK_FAILURE;
DO_KEY('LIST_VALUES');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPS_IDNO_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPS_IDNO_LBT")
		public void spsIdnoLbt_buttonClick()
		{
			
				goItem(toStr("sps_idno"));
				getTask().getGoqrpls().gCheckFailure();
				executeAction(KeyFunction.LIST_VALUES);
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
		@Before
		public void idLbt_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER ID_LBT.WHEN-BUTTON-PRESSED
		 set_window_property ('G$_OPT_WINDOW', POSITION, 19, 4);
G$_KEY_OPT_MENU ('KEY_BLOCK.ID',
                  G$_NLS.Get('APAIDEN-0037', 'FORM','Constituent Search (AOAIDEN)') , 'DUPLICATE_RECORD',
                  G$_NLS.Get('APAIDEN-0038', 'FORM','Person Search (SOAIDEN)') , 'LIST_VALUES', 
                  G$_NLS.Get('APAIDEN-0039', 'FORM','Constituent Summary (APASBIO)') , 'NEXT_SET',
                  G$_NLS.Get('APAIDEN-0040', 'FORM','Organization Search (AOACOMP)') , 'NEXT_RECORD',
                  G$_NLS.Get('APAIDEN-0041', 'FORM','Non-Person Search (SOACOMP)') , 'COUNT_QUERY',
                  G$_NLS.Get('APAIDEN-0042', 'FORM','Organization Header (AOAORGN)') , 'PREVIOUS_RECORD');  
G$_CHECK_FAILURE;
:CHECK_KEYS := 'N';

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
			
				// F2J_NOT_SUPPORTED : The property "WINDOW's POSITION" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\APAIDENF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.FORMS4W.SetWindowProperty("G$_OPT_WINDOW", SupportClasses.Property.POSITION, 19, 4);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : The property 'WINDOW's POSITION' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\APAIDENF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				
				getTask().getGoqrpls().gKeyOptMenu(toStr("KEY_BLOCK.ID"), GNls.Fget(toStr("APAIDEN-0037"), toStr("FORM"), toStr("Constituent Search (AOAIDEN)")), toStr("DUPLICATE_RECORD"), GNls.Fget(toStr("APAIDEN-0038"), toStr("FORM"), toStr("Person Search (SOAIDEN)")), toStr("LIST_VALUES"), GNls.Fget(toStr("APAIDEN-0039"), toStr("FORM"), toStr("Constituent Summary (APASBIO)")), toStr("NEXT_SET"), GNls.Fget(toStr("APAIDEN-0040"), toStr("FORM"), toStr("Organization Search (AOACOMP)")), toStr("NEXT_RECORD"), GNls.Fget(toStr("APAIDEN-0041"), toStr("FORM"), toStr("Non-Person Search (SOACOMP)")), toStr("COUNT_QUERY"), GNls.Fget(toStr("APAIDEN-0042"), toStr("FORM"), toStr("Organization Header (AOAORGN)")), toStr("PREVIOUS_RECORD"));
				getTask().getGoqrpls().gCheckFailure();
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
			}

		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GENERATE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GENERATE_BTN")
		@Before
		public void generateBtn_click()
		{
			
			getGIconBtnClass().click();
		}

		
		/* Original PL/SQL code code for TRIGGER GENERATE_BTN.WHEN-BUTTON-PRESSED
		 DO_KEY ('DUPLICATE_ITEM');


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GENERATE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="GENERATE_BTN")
		public void generateBtn_buttonClick()
		{
			
				// F2J_NOT_SUPPORTED : Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\APAIDENF2NMigrationGuide.xml#DefaultExcludeBuiltin5".
				//				SupportClasses.SQLFORMS.DoKey("DUPLICATE_ITEM");
			executeAction(KeyFunction.DUPLICATE_RECORD);
				this.getLogger().trace(this, "// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\APAIDENF2NMigrationGuide.xml#DefaultExcludeBuiltin5'.");
				
				
			}
	
	
}

