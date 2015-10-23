package net.hedtech.banner.alumni.common.Apcaddr.controller;
 
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
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.banner.alumni.common.Apcaddr.model.*;
import net.hedtech.banner.alumni.common.Apcaddr.*;
import net.hedtech.banner.alumni.common.Apcaddr.services.*;
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
	public ApcaddrTask getTask() {
		return (ApcaddrTask)super.getTask();
	}

	public ApcaddrModel getFormModel() {
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
			
			getGKeyBlockClass().blockOut();
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
			
			getGKeyBlockClass().nextBlock();
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

		
		/* Original PL/SQL code code for TRIGGER KEY_BLOCK.CHECK_KEYS
		    IF :KEY_BLOCK.ID IS NULL  THEN
      EXECUTE_TRIGGER( 'INVALID_KEY' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
--
   
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
					executeAction("INVALID_KEY");
					getTask().getGoqrpls().gCheckFailure();
				}
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
			
				//MORPHIS TODO: (JP) Workaround added so the FormController ClearTask method is called when user clicks on startOver (this method was being called because KEY-CLRFRM is a keyBlock item)
				if (getCurrentBlock().equals("KEY_BLOCK")){
					executeAction("INVALID_FUNCTION_MSG");
					getTask().getGoqrpls().gCheckFailure();
				}else{
					((ApcaddrFormController)this.getParentController()).Apcaddr_ClearTask();
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
			if(getFormModel().getKeyBlock().getId().isNotNull())
			{
				setItemVisible("SPS_IDNO_LBT", true);
				setItemVisible("DONR_CAT_LBT", true);

			}
			else
			{
				setItemVisible("SPS_IDNO_LBT", false);
				setItemVisible("DONR_CAT_LBT", false);

			}
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
				setItemVisible("SPS_IDNO_LBT", true);
				setItemVisible("DONR_CAT_LBT", true);

			}
			else
			{
				setItemVisible("SPS_IDNO_LBT", false);
				setItemVisible("DONR_CAT_LBT", false);

			}
			
		}

		
		/* Original PL/SQL code code for TRIGGER ID.WHEN-VALIDATE-ITEM
		 begin
 A$_SEL_ID_INFO;
 G$_CHECK_FAILURE;
end;


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
			getTask().getAoqrpls().aSelIdInfo();
		}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-CQUERY
		 GO_ITEM('KEY_BLOCK.ID');
:GLOBAL.FORM_WAS_CALLED := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'AOACOMP','QUERY');
:GLOBAL.FORM_WAS_CALLED := '';
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
		 * ID.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="ID", function=KeyFunction.COUNT_QUERY)
		public void id_TotalResults()
		{
			
				goItem(toStr("KEY_BLOCK.ID"));
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("AOACOMP"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr(""));
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-LISTVAL
		 GO_ITEM('KEY_BLOCK.ID');
:GLOBAL.FORM_WAS_CALLED := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'AOAIDEN','QUERY');
:GLOBAL.FORM_WAS_CALLED := '';
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
		 * ID.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="ID", function=KeyFunction.LIST_VALUES)
		public void id_ListValues()
		{
			
				goItem(toStr("KEY_BLOCK.ID"));
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("AOAIDEN"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr(""));
				// 
				if ( !getGlobal("VALUE").isNull() )
				{
					executeAction("LIST_VALUES_COPY");
					getTask().getGoqrpls().gCheckFailure();
					nextItem();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-DUPREC
		 GO_ITEM('KEY_BLOCK.ID');
:GLOBAL.FORM_WAS_CALLED := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'APASBIO','QUERY');
:GLOBAL.FORM_WAS_CALLED := '';
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
			
				goItem(toStr("KEY_BLOCK.ID"));
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("APASBIO"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER ID.KEY-DUP-ITEM
		 GO_ITEM('KEY_BLOCK.ID');
:GLOBAL.FORM_WAS_CALLED := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:global.current_user,'AOAORGN','QUERY');
:GLOBAL.FORM_WAS_CALLED := '';
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
			
				goItem(toStr("KEY_BLOCK.ID"));
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("AOAORGN"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER ID.WHEN-MOUSE-DOUBLECLICK
		 G$_KEY_OPT_MENU('KEY_BLOCK.ID', G$_NLS.Get('APCADDR-0004', 'FORM','Constituent Search (AOAIDEN)') ,'LIST_VALUES',
                                G$_NLS.Get('APCADDR-0005', 'FORM','Constituent Summary (APASBIO)') ,'DUPLICATE_RECORD',
                                G$_NLS.Get('APCADDR-0006', 'FORM','Organization Search (AOACOMP)') ,'COUNT_QUERY',
                                G$_NLS.Get('APCADDR-0007', 'FORM','Organization Header (AOAORGN)') ,'DUPLICATE_ITEM');
G$_CHECK_FAILURE; 
:CHECK_KEYS := 'N';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ID.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="ID")
		public void id_doubleClick()
		{
			
				getTask().getGoqrpls().gKeyOptMenu(toStr("KEY_BLOCK.ID"), GNls.Fget(toStr("APCADDR-0004"), toStr("FORM"), toStr("Constituent Search (AOAIDEN)")), toStr("LIST_VALUES"), GNls.Fget(toStr("APCADDR-0005"), toStr("FORM"), toStr("Constituent Summary (APASBIO)")), toStr("DUPLICATE_RECORD"), GNls.Fget(toStr("APCADDR-0006"), toStr("FORM"), toStr("Organization Search (AOACOMP)")), toStr("COUNT_QUERY"), GNls.Fget(toStr("APCADDR-0007"), toStr("FORM"), toStr("Organization Header (AOAORGN)")), toStr("DUPLICATE_ITEM"));
				getTask().getGoqrpls().gCheckFailure();
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
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

		
		/* Original PL/SQL code code for TRIGGER DONR_CAT.WHEN-MOUSE-DOUBLECLICK
		 A$_DISPLAY_APRCATG_LOV;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DONR_CAT.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="DONR_CAT")
		public void donrCat_doubleClick()
		{
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
		 G$_KEY_OPT_MENU('KEY_BLOCK.ID', G$_NLS.Get('APCADDR-0008', 'FORM','Constituent Search (AOAIDEN)') ,'LIST_VALUES',
                                G$_NLS.Get('APCADDR-0009', 'FORM','Constituent Summary (APASBIO)') ,'DUPLICATE_RECORD',
                                G$_NLS.Get('APCADDR-0010', 'FORM','Organization Search (AOACOMP)') ,'COUNT_QUERY',
                                G$_NLS.Get('APCADDR-0011', 'FORM','Organization Header (AOAORGN)') ,'DUPLICATE_ITEM');
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
			
				getTask().getGoqrpls().gKeyOptMenu(toStr("KEY_BLOCK.ID"), GNls.Fget(toStr("APCADDR-0008"), toStr("FORM"), toStr("Constituent Search (AOAIDEN)")), toStr("LIST_VALUES"), GNls.Fget(toStr("APCADDR-0009"), toStr("FORM"), toStr("Constituent Summary (APASBIO)")), toStr("DUPLICATE_RECORD"), GNls.Fget(toStr("APCADDR-0010"), toStr("FORM"), toStr("Organization Search (AOACOMP)")), toStr("COUNT_QUERY"), GNls.Fget(toStr("APCADDR-0011"), toStr("FORM"), toStr("Organization Header (AOAORGN)")), toStr("DUPLICATE_ITEM"));
				getTask().getGoqrpls().gCheckFailure();
				getFormModel().getButtonControlBlock().setCheckKeys(toStr("N"));
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

		
		/* Original PL/SQL code code for TRIGGER SPS_IDNO.WHEN-MOUSE-DOUBLECLICK
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
		 * SPS_IDNO.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPS_IDNO")
		public void spsIdno_doubleClick()
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
			getTask().getAoqrpls().aDisplayAprcatgLov();	
		}

		
	
	
}

