package net.hedtech.banner.finance.common.Foaiden.controller;
 
import java.util.*;
import morphis.core.utils.behavior.annotations.After;
import morphis.core.utils.behavior.annotations.Before;
			

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
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqclib.model.SpridenCurrentAdapter;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.banner.finance.common.Foaiden.model.*;
import net.hedtech.banner.finance.common.Foaiden.*;
import net.hedtech.banner.finance.common.Foaiden.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SpridenCurrentController extends DefaultBlockController {


	private net.hedtech.general.common.libraries.Goqclib.controller.SpridenCurrentController getGoqclibSpridenCurrentController() {
		return (net.hedtech.general.common.libraries.Goqclib.controller.SpridenCurrentController) this.getTask().getTaskPart("GOQCLIB").getSupportCodeManager().getPackage("SPRIDEN_CURRENT");
	}	
	
	public SpridenCurrentController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FoaidenTask getTask() {
		return (FoaidenTask)super.getTask();
	}

	public FoaidenModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void spridenCurrent_blockChange()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void spridenCurrent_AfterQuery(RowAdapterEvent args)
		{
			
		getGoqclibSpridenCurrentController().spridenCurrent_AfterQuery(args);
			}

		
		/*
		 *<p>
		 *This trigger will validate the current information and generate a new PIDM.

		 *If the id is to be generated, this will be performed.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void spridenCurrent_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_BeforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void spridenCurrent_RowInsert(RowAdapterEvent args)
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_RowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.POST-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowInsert
		public void spridenCurrent_AfterRowInsert(RowAdapterEvent args)
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_AfterRowInsert(args);
			}

		
		/*
		 *<p>
		 *This trigger will validate the current information and check if any changes

		 *were made to the name or id.  If there were changes, new records are

		 *created to record the changes.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void spridenCurrent_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_BeforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowUpdate
		public void spridenCurrent_RowUpdate(RowAdapterEvent args)
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_RowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.POST-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowUpdate
		public void spridenCurrent_AfterRowUpdate(RowAdapterEvent args)
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_AfterRowUpdate(args);
			}

		
		/*
		 *<p>
		 *This trigger will clear the block and execute a query.  This is done to

		 *clear out an erroneous delete.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void spridenCurrent_keyClearBlock()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_keyClearBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void spridenCurrent_ClearRecord()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_ClearRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void spridenCurrent_Save()
		{
			//TODO Luís Luz para aparecer mensagem desejada. resoluçao do bug ELLBHR-18307
			executeAction("CHECK_PERS_NONPERS");
				executeAction("CHECK_PERS_NONPERS");
				getGoqclibSpridenCurrentController().spridenCurrent_Save();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void spridenCurrent_CreateRecord()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_CreateRecord();
			}

		
		/*
		 *<p>
		 *This trigger will display messages to inform the user of the permanancy of

		 *this function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void spridenCurrent_DeleteRecord()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_DeleteRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void spridenCurrent_KeyDupItem()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_KeyDupItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void spridenCurrent_CopyRecord()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_CopyRecord();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void spridenCurrent_Search()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_Search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void spridenCurrent_NextBlock()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_NextBlock();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void spridenCurrent_NextRecord()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_NextRecord();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET")
		public void spridenCurrent_KeyNxtset()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_KeyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void spridenCurrent_PreviousBlock()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_PreviousBlock();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void spridenCurrent_PreviousRecord()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_PreviousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-SCRDOWN")
		public void spridenCurrent_KeyScrdown()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_KeyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.KEY-SCRUP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-SCRUP")
		public void spridenCurrent_KeyScrup()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_KeyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.CHECK_FIRST_LAST_NAME
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_FIRST_LAST_NAME")
		public void spridenCurrent_CheckFirstLastName()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_CheckFirstLastName();
			}

		
		/*
		 *<p>
		 *This trigger checks that the last and first names are entered for a person.

		 *It then checks if a new person was added and must be committed or if an

		 *existing person was changed and must be committed.  Finally, the name

		 *information is copied onto subsequent pages.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.CHECK_NAME_AND_ID
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_NAME_AND_ID")
		public void spridenCurrent_CheckNameAndId()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_CheckNameAndId();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.CHECK_ORG_SOUNDEX_NAMES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_ORG_SOUNDEX_NAMES")
		public void spridenCurrent_CheckOrgSoundexNames()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_CheckOrgSoundexNames();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.CHECK_PERS_NONPERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_PERS_NONPERS")
		public void spridenCurrent_CheckPersNonpers()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_CheckPersNonpers();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.CHECK_PERS_SOUNDEX_NAMES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_PERS_SOUNDEX_NAMES")
		public void spridenCurrent_CheckPersSoundexNames()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_CheckPersSoundexNames();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.CHECK_SSN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_SSN")
		public void spridenCurrent_CheckSsn()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_CheckSsn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.COMMIT_SPBPERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="COMMIT_SPBPERS")
		public void spridenCurrent_CommitSpbpers()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_CommitSpbpers();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.EDIT_EMPLOYEE_STATUS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="EDIT_EMPLOYEE_STATUS")
		public void spridenCurrent_EditEmployeeStatus()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_EditEmployeeStatus();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.GET_FULLNAME
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_FULLNAME")
		public void spridenCurrent_GetFullname()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_GetFullname();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.GET_NAME_TYPE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_NAME_TYPE")
		public void spridenCurrent_GetNameType()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_GetNameType();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.GET_PERS_INFO
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_PERS_INFO")
		public void spridenCurrent_GetPersInfo()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_GetPersInfo();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.INSERT_SPBPERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="INSERT_SPBPERS")
		public void spridenCurrent_InsertSpbpers()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_InsertSpbpers();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN_CURRENT.REQUEST_NAME_SEARCH
		 DECLARE
  ALERT_ID         ALERT;
  AL_NAME          VARCHAR2(40);
  ALERT_BUT        NUMBER;
  ALERT_STRING     VARCHAR2(120);
  ALERT_FORM       VARCHAR2(20);
BEGIN 
  IF :which_name_search = 'ORG' THEN
    ALERT_ID := FIND_ALERT('ORG_SEARCH_ALERT');
  ELSE
    ALERT_ID := FIND_ALERT('PERS_SEARCH_ALERT');
  END IF;
--
  IF ID_NULL(ALERT_ID) THEN
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  ALERT_BUT := SHOW_ALERT(ALERT_ID);
  IF ALERT_BUT = ALERT_BUTTON1 THEN
    :GLOBAL.FIRST_NAME := :SPRIDEN_CURRENT.PERS_FIRST_NAME;  
    :GLOBAL.FORM_WAS_CALLED := 'Y';
    :GLOBAL.CALLING_FORM := 'NAME_SEARCH';
--
    IF :which_name_search = 'ORG' THEN
      :GLOBAL.LAST_NAME := :SPRIDEN_CURRENT.NON_PERS_NAME;
      ALERT_FORM := 'SOACOMP';
    ELSE
      :GLOBAL.LAST_NAME := :SPRIDEN_CURRENT.PERS_LAST_NAME;
      ALERT_FORM := 'FTIIDEN'; --changed 'SOAIDEN' by 'FTIIDEN' to fix 1-456XCF
    END IF;
--
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,alert_form,'');
--
    :GLOBAL.FORM_WAS_CALLED := '';
    :GLOBAL.CALLING_FORM := '';
    :GLOBAL.FIRST_NAME := '';
    :GLOBAL.LAST_NAME := '';
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.REQUEST_NAME_SEARCH
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="REQUEST_NAME_SEARCH")
		public void spridenCurrent_RequestNameSearch()
		{
			

				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);

				if(spridenCurrentElement!=null){
				{
					AlertDescriptor alertId= null;
					NString alName= NString.getNull();
					NNumber alertBut= NNumber.getNull();
					NString alertString= NString.getNull();
					NString alertForm= NString.getNull();
					if ( getFormModel().getFormHeader().getWhichNameSearch().equals("ORG") )
					{
						alertId = findAlert("ORG_SEARCH_ALERT");
					}
					else {
						alertId = findAlert("PERS_SEARCH_ALERT");
					}
					// 
					if ( (alertId == null) )
					{
						throw new ApplicationException();
					}
					// 
					alertBut = toNumber(showAlert(alertId));
					if ( alertBut.equals(MessageServices.BUTTON1) )
					{
						setGlobal("FIRST_NAME", spridenCurrentElement.getPersFirstName());
						setGlobal("FORM_WAS_CALLED", toStr("Y"));
						setGlobal("CALLING_FORM", toStr("NAME_SEARCH"));
						// 
						if ( getFormModel().getFormHeader().getWhichNameSearch().equals("ORG") )
						{
							setGlobal("LAST_NAME", spridenCurrentElement.getNonPersName());
							alertForm = toStr("SOACOMP");
						}
						else {
							setGlobal("LAST_NAME", spridenCurrentElement.getPersLastName());
							alertForm = toStr("FTIIDEN");
						}
						// 
						executeAction("G$_REVOKE_ACCESS");
						getTask().getGoqrpls().gCheckFailure();
						getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), alertForm, toStr(""));
						// 
						setGlobal("FORM_WAS_CALLED", toStr(""));
						setGlobal("CALLING_FORM", toStr(""));
						setGlobal("FIRST_NAME", toStr(""));
						setGlobal("LAST_NAME", toStr(""));
					}
				}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.SET_AUDIT_INFO
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SET_AUDIT_INFO")
		public void spridenCurrent_SetAuditInfo()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_SetAuditInfo();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.SET_MRTL_ITEMS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SET_MRTL_ITEMS")
		public void spridenCurrent_SetMrtlItems()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_SetMrtlItems();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.UPDATE_SPBPERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="UPDATE_SPBPERS")
		public void spridenCurrent_UpdateSpbpers()
		{
			
				getGoqclibSpridenCurrentController().spridenCurrent_UpdateSpbpers();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CURRENT.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void spridenCurrent_BeforeQuery(QueryEvent args)
		{
			

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_ID", this.getFormModel().getKeyBlock().getId()));             


           
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_ID.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRIDEN_ID", function=KeyFunction.ITEM_CHANGE)
		public void spridenId_itemChange()
		{
			
				getGoqclibSpridenCurrentController().spridenId_itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER SPRIDEN_ID.POST-CHANGE
		 DECLARE
  PTI_INTO_TEMP  VARCHAR2(255);
  pii_active     VARCHAR2(1) := 'N';
--
  CURSOR PTI_CURSOR1 IS
    SELECT SPRIDEN_PIDM
      FROM SPRIDEN
     WHERE SPRIDEN_ID = :SPRIDEN_CURRENT.SPRIDEN_ID
       AND SPRIDEN_PIDM <> :SPRIDEN_CURRENT.SPRIDEN_PIDM
       AND SPRIDEN_CHANGE_IND IS NULL;
--
  CURSOR PTI_CURSOR2 IS
    SELECT SPRIDEN_PIDM
      FROM SPRIDEN
     WHERE SPRIDEN_ID = :SPRIDEN_CURRENT.SPRIDEN_ID
       AND SPRIDEN_CHANGE_IND = 'I'
       AND SPRIDEN_PIDM <> :SPRIDEN_CURRENT.SPRIDEN_PIDM;
-- -- --
-- 81-4  remove Outer Join to improve perfomance
  CURSOR SSN_CURSOR IS
    SELECT 'X'
      FROM SPRIDEN,
           SPBPERS
     WHERE SPBPERS_SSN = :SPRIDEN_CURRENT.SPRIDEN_ID
       AND SPRIDEN_CHANGE_IND IS NULL
       AND SPRIDEN_PIDM = SPBPERS_PIDM;				-- 81-4
--       AND SPRIDEN_PIDM = SPBPERS_PIDM(+);  -- 81-4
-- -- --
BEGIN
  G$_CHECK_QUERY_MODE;
--
-- This trigger step checks if the id number was changed for a person who does
-- not yet have a PIDM. If so, display an error.
--
  IF (:GLOBAL.QUERY_MODE = '1') THEN
   :GLOBAL.QUERY_MODE := '0';
   RETURN;
  END IF;
--
  pii_active := gokfgac.f_spriden_pii_active;
--
--  Check to see if NEXT is being used as the new ID.
--  This is an invalid entry.
--
  IF :SPRIDEN_CURRENT.SPRIDEN_ID = :FORM_HEADER.NEXT_DOC_NUM THEN
    MESSAGE( G$_NLS.Get('FOAIDEN-0015', 'FORM','%01% is not valid for this form.',:FORM_HEADER.NEXT_DOC_NUM) );
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
  IF (:SPRIDEN_CURRENT.SPRIDEN_PIDM IS NULL AND
      :KEY_BLOCK.ID <> :SPRIDEN_CURRENT.SPRIDEN_ID) THEN
    MESSAGE( G$_NLS.Get('FOAIDEN-0016', 'FORM','*ERROR* You may not change current ID on an add; change ID in key block.') );
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
--
-- This trigger step checks the changed id to determine if it is the current
-- id of another entity.  If it is, an error message is generated.
--
  IF pii_active = 'Y' THEN
    -- spriden pii is active, turn fgac off 
    gokfgac.p_turn_fgac_off;
  END IF;
  OPEN PTI_CURSOR1;
  FETCH PTI_CURSOR1 INTO PTI_INTO_TEMP;
  IF PTI_CURSOR1%FOUND THEN
    CLOSE PTI_CURSOR1;
    MESSAGE(G$_NLS.Get('FOAIDEN-0017','FORM','*ERROR* ID number entered is current ID number for another person or non-person.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
  CLOSE PTI_CURSOR1;
--
-- This trigger step checks if the changed id number is the previous id of
-- another entity.  If it is, an error message is generated.
--
  OPEN PTI_CURSOR2;
  FETCH PTI_CURSOR2 INTO PTI_INTO_TEMP;
  IF PTI_CURSOR2%FOUND THEN
    CLOSE PTI_CURSOR2;
    MESSAGE(G$_NLS.Get('FOAIDEN-0018','FORM','*ERROR* ID number entered is previous ID number for another person or non-person.'));
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
  CLOSE PTI_CURSOR2;
--
-- -- -- This trigger step checks if the changed id number is an SSN/SIN/TIN of
-- -- -- another entity.  If it is, a, error message is generated.  This is only done
-- -- -- if SSN Searching is enabled (GUBINST_SSN_SEARCH_ENABLED_IND = 'Y')
-- -- --
  IF :GLOBAL.SSN_SEARCH_ENABLED_IND = 'Y' THEN
    OPEN SSN_CURSOR;
    FETCH SSN_CURSOR INTO PTI_INTO_TEMP;
    IF SSN_CURSOR%FOUND THEN
      CLOSE SSN_CURSOR;
      MESSAGE(G$_NLS.Get('FOAIDEN-0019','FORM','*ERROR* ID number entered is an SSN/SIN/TIN.'));
      RAISE FORM_TRIGGER_FAILURE;
    END IF;
    CLOSE SSN_CURSOR;
  END IF;
-- -- --
  IF pii_active = 'Y' THEN
    -- spriden pii is active, turn fgac on 
    gokfgac.p_turn_fgac_on;
  END IF;
--
  :GLOBAL.QUERY_MODE := '0';
  IF :SPRIDEN_CURRENT.PERS_LAST_NAME is null and :SPRIDEN_CURRENT.NON_PERS_NAME IS NULL THEN
  	-- New ID creation
    RETURN;
  END IF;
--
  :CHANGE_IDEN := 'Y';
EXCEPTION
  WHEN FORM_TRIGGER_FAILURE THEN
    IF pii_active = 'Y' THEN
      -- spriden pii is active, turn fgac on 
      gokfgac.p_turn_fgac_on;
    END IF;
    :GLOBAL.QUERY_MODE := '0';
    RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_ID.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRIDEN_ID")
		public void spridenId_PostChange()
		{
			

				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);

				if(spridenCurrentElement!=null){
				int rowCount = 0;
				if(spridenCurrentElement.getSpridenId().isNull())
		return;
				{
					NString ptiIntoTemp= NString.getNull();
					NString piiActive = toStr("N");
					String sqlptiCursor1 = "SELECT SPRIDEN_PIDM " +
	" FROM SPRIDEN " +
	" WHERE SPRIDEN_ID = :SPRIDEN_CURRENT_SPRIDEN_ID AND SPRIDEN_PIDM <> :SPRIDEN_CURRENT_SPRIDEN_PIDM AND SPRIDEN_CHANGE_IND IS NULL ";
					DataCursor ptiCursor1 = new DataCursor(sqlptiCursor1);
					String sqlptiCursor2 = "SELECT SPRIDEN_PIDM " +
	" FROM SPRIDEN " +
	" WHERE SPRIDEN_ID = :SPRIDEN_CURRENT_SPRIDEN_ID AND SPRIDEN_CHANGE_IND = 'I' AND SPRIDEN_PIDM <> :SPRIDEN_CURRENT_SPRIDEN_PIDM ";
					DataCursor ptiCursor2 = new DataCursor(sqlptiCursor2);
					String sqlssnCursor = "SELECT 'X' " +
	" FROM SPRIDEN, SPBPERS " +
	" WHERE SPBPERS_SSN = :SPRIDEN_CURRENT_SPRIDEN_ID AND SPRIDEN_CHANGE_IND IS NULL AND SPRIDEN_PIDM = SPBPERS_PIDM ";
					DataCursor ssnCursor = new DataCursor(sqlssnCursor);
					try {
						try
						{
							getTask().getGoqrpls().gCheckQueryMode();
							// 
							//  This trigger step checks if the id number was changed for a person who does
							//  not yet have a PIDM. If so, display an error.
							// 
							if ((getGlobal("QUERY_MODE").equals("1")))
							{
								setGlobal("QUERY_MODE", toStr("0"));
								return ;
							}
							// 
							piiActive = Gokfgac.fSpridenPiiActive();
							// 
							//   Check to see if NEXT is being used as the new ID.
							//   This is an invalid entry.
							// 
							if ( spridenCurrentElement.getSpridenId().equals(getFormModel().getFormHeader().getNextDocNum()) )
							{
								errorMessage(GNls.Fget(toStr("FOAIDEN-0015"), toStr("FORM"), toStr("%01% is not valid for this form."), getFormModel().getFormHeader().getNextDocNum()));
								throw new ApplicationException();
							}
							// 
							if ((spridenCurrentElement.getSpridenPidm().isNull() && getFormModel().getKeyBlock().getId().notEquals(spridenCurrentElement.getSpridenId())))
							{
								errorMessage(GNls.Fget(toStr("FOAIDEN-0016"), toStr("FORM"), toStr("*ERROR* You may not change current ID on an add; change ID in key block.")));
								throw new ApplicationException();
							}
							// 
							//  This trigger step checks the changed id to determine if it is the current
							//  id of another entity.  If it is, an error message is generated.
							// 
							if ( piiActive.equals("Y") )
							{
								//  spriden pii is active, turn fgac off 
								Gokfgac.pTurnFgacOff();
							}
							//Setting query parameters
							ptiCursor1.addParameter("SPRIDEN_CURRENT_SPRIDEN_ID", spridenCurrentElement.getSpridenId());
							ptiCursor1.addParameter("SPRIDEN_CURRENT_SPRIDEN_PIDM", spridenCurrentElement.getSpridenPidm());
							ptiCursor1.open();
							ResultSet ptiCursor1Results = ptiCursor1.fetchInto();
							if ( ptiCursor1Results != null ) {
								ptiIntoTemp = ptiCursor1Results.getStr(0);
							}
							if ( ptiCursor1.found() )
							{
								ptiCursor1.close();
								errorMessage(GNls.Fget(toStr("FOAIDEN-0017"), toStr("FORM"), toStr("*ERROR* ID number entered is current ID number for another person or non-person.")));
								throw new ApplicationException();
							}
							ptiCursor1.close();
							// 
							//  This trigger step checks if the changed id number is the previous id of
							//  another entity.  If it is, an error message is generated.
							// 
							//Setting query parameters
							ptiCursor2.addParameter("SPRIDEN_CURRENT_SPRIDEN_ID", spridenCurrentElement.getSpridenId());
							ptiCursor2.addParameter("SPRIDEN_CURRENT_SPRIDEN_PIDM", spridenCurrentElement.getSpridenPidm());
							ptiCursor2.open();
							ResultSet ptiCursor2Results = ptiCursor2.fetchInto();
							if ( ptiCursor2Results != null ) {
								ptiIntoTemp = ptiCursor2Results.getStr(0);
							}
							if ( ptiCursor2.found() )
							{
								ptiCursor2.close();
								errorMessage(GNls.Fget(toStr("FOAIDEN-0018"), toStr("FORM"), toStr("*ERROR* ID number entered is previous ID number for another person or non-person.")));
								throw new ApplicationException();
							}
							ptiCursor2.close();
							// 
							//  -- -- This trigger step checks if the changed id number is an SSN/SIN/TIN of
							//  -- -- another entity.  If it is, a, error message is generated.  This is only done
							//  -- -- if SSN Searching is enabled (GUBINST_SSN_SEARCH_ENABLED_IND = 'Y')
							//  -- --
							if ( getGlobal("SSN_SEARCH_ENABLED_IND").equals("Y") )
							{
								//Setting query parameters
								ssnCursor.addParameter("SPRIDEN_CURRENT_SPRIDEN_ID", spridenCurrentElement.getSpridenId());
								ssnCursor.open();
								ResultSet ssnCursorResults = ssnCursor.fetchInto();
								if ( ssnCursorResults != null ) {
									ptiIntoTemp = ssnCursorResults.getStr(0);
								}
								if ( ssnCursor.found() )
								{
									ssnCursor.close();
									errorMessage(GNls.Fget(toStr("FOAIDEN-0019"), toStr("FORM"), toStr("*ERROR* ID number entered is an SSN/SIN/TIN.")));
									throw new ApplicationException();
								}
								ssnCursor.close();
							}
							//  -- --
							if ( piiActive.equals("Y") )
							{
								//  spriden pii is active, turn fgac on 
								Gokfgac.pTurnFgacOn();
							}
							// 
							setGlobal("QUERY_MODE", toStr("0"));
							if ( spridenCurrentElement.getPersLastName().isNull() && spridenCurrentElement.getNonPersName().isNull() )
							{
								//  New ID creation
								return ;
							}
							// 
							spridenCurrentElement.setChangeIden(toStr("Y"));
						}
						catch(ApplicationException e)
						{
							if ( piiActive.equals("Y") )
							{
								//  spriden pii is active, turn fgac on 
								Gokfgac.pTurnFgacOn();
							}
							setGlobal("QUERY_MODE", toStr("0"));
							throw new ApplicationException();
						}
					}
					finally{
						ptiCursor1.close();
						ptiCursor2.close();
						ssnCursor.close();
					}
				}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_ID.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="SPRIDEN_ID", function=KeyFunction.PREVIOUS_ITEM)
		public void spridenId_PreviousItem()
		{
			
				getGoqclibSpridenCurrentController().spridenId_PreviousItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPRIDEN_NTYP_CODE")
		public void spridenNtypCode_doubleClick()
		{
			
				getGoqclibSpridenCurrentController().spridenNtypCode_WhenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRIDEN_NTYP_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spridenNtypCode_itemChange()
		{
			
				getGoqclibSpridenCurrentController().spridenNtypCode_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPRIDEN_NTYP_CODE")
		public void spridenNtypCode_GSearchParameters()
		{
			
				getGoqclibSpridenCurrentController().spridenNtypCode_GSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPRIDEN_NTYP_CODE")
		public void spridenNtypCode_GSearchOptions()
		{
			
				getGoqclibSpridenCurrentController().spridenNtypCode_GSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRIDEN_NTYP_CODE", function=KeyFunction.ITEM_OUT)
		public void spridenNtypCode_itemOut()
		{
			
				getGoqclibSpridenCurrentController().spridenNtypCode_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRIDEN_NTYP_CODE")
		public void spridenNtypCode_validate()
		{
			
				getGoqclibSpridenCurrentController().spridenNtypCode_validate();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRIDEN_NTYP_CODE", function=KeyFunction.NEXT_ITEM)
		public void spridenNtypCode_keyNexItem()
		{
			
				getGoqclibSpridenCurrentController().spridenNtypCode_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE.LIST_VALUES_COPY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="LIST_VALUES_COPY", item="SPRIDEN_NTYP_CODE")
		public void spridenNtypCode_ListValuesCopy()
		{
			
				getGoqclibSpridenCurrentController().spridenNtypCode_ListValuesCopy();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_NTYP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRIDEN_NTYP_CODE_LBT")
		public void spridenNtypCodeLbt_click()
		{
			
				getGoqclibSpridenCurrentController().spridenNtypCodeLbt_click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CURRENT_NTYP_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="CURRENT_NTYP_DESC", function=KeyFunction.ITEM_CHANGE)
		public void currentNtypDesc_itemChange()
		{
			
				getGoqclibSpridenCurrentController().currentNtypDesc_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_SSN.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="PERS_SSN")
		public void persSsn_validate()
		{
			
				getGoqclibSpridenCurrentController().persSsn_validate();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_SSN.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PERS_SSN", function=KeyFunction.ITEM_CHANGE)
		public void persSsn_itemChange()
		{
			
				getGoqclibSpridenCurrentController().persSsn_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_SSN.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="PERS_SSN", function=KeyFunction.NEXT_ITEM)
		public void persSsn_keyNexItem()
		{
			
				getGoqclibSpridenCurrentController().persSsn_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_SURNAME_PREFIX.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="PERS_SURNAME_PREFIX")
		public void persSurnamePrefix_validate()
		{
			
				getGoqclibSpridenCurrentController().persSurnamePrefix_validate();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_SURNAME_PREFIX.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PERS_SURNAME_PREFIX", function=KeyFunction.ITEM_OUT)
		public void persSurnamePrefix_itemOut()
		{
			
				getGoqclibSpridenCurrentController().persSurnamePrefix_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_LAST_NAME.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="PERS_LAST_NAME", function=KeyFunction.COUNT_QUERY)
		public void persLastName_TotalResults()
		{
			
				getGoqclibSpridenCurrentController().persLastName_TotalResults();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_LAST_NAME.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="PERS_LAST_NAME")
		public void persLastName_validate()
		{
			
				getGoqclibSpridenCurrentController().persLastName_validate();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_LAST_NAME.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="PERS_LAST_NAME", function=KeyFunction.PREVIOUS_ITEM)
		public void persLastName_PreviousItem()
		{
			
				getGoqclibSpridenCurrentController().persLastName_PreviousItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * LAST_NAME_SRCH_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="LAST_NAME_SRCH_BTN")
		public void lastNameSrchBtn_click()
		{
			
				getGoqclibSpridenCurrentController().lastNameSrchBtn_click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * LAST_NAME_SRCH_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="LAST_NAME_SRCH_BTN")
		public void lastNameSrchBtn_buttonClick()
		{
			
				getGoqclibSpridenCurrentController().lastNameSrchBtn_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_FIRST_NAME.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="PERS_FIRST_NAME", function=KeyFunction.COUNT_QUERY)
		public void persFirstName_TotalResults()
		{
			
				getGoqclibSpridenCurrentController().persFirstName_TotalResults();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_FIRST_NAME.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="PERS_FIRST_NAME")
		public void persFirstName_validate()
		{
			
				getGoqclibSpridenCurrentController().persFirstName_validate();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_FIRST_NAME.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PERS_FIRST_NAME", function=KeyFunction.ITEM_OUT)
		public void persFirstName_itemOut()
		{
			
				getGoqclibSpridenCurrentController().persFirstName_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FIRST_NAME_SRCH_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FIRST_NAME_SRCH_BTN")
		public void firstNameSrchBtn_click()
		{
			
				getGoqclibSpridenCurrentController().firstNameSrchBtn_click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FIRST_NAME_SRCH_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FIRST_NAME_SRCH_BTN")
		public void firstNameSrchBtn_buttonClick()
		{
			
				getGoqclibSpridenCurrentController().firstNameSrchBtn_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_MI.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PERS_MI", function=KeyFunction.ITEM_OUT)
		public void persMi_itemOut()
		{
			
				getGoqclibSpridenCurrentController().persMi_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_MI.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="PERS_MI")
		public void persMi_validate()
		{
			
				getGoqclibSpridenCurrentController().persMi_validate();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_PREFIX.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="PERS_PREFIX")
		public void persPrefix_validate()
		{
			
				getGoqclibSpridenCurrentController().persPrefix_validate();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_PREFIX.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", item="PERS_PREFIX", function=KeyFunction.SAVE)
		public void persPrefix_Save()
		{
			
				getGoqclibSpridenCurrentController().persPrefix_Save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_SUFFIX.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="PERS_SUFFIX")
		public void persSuffix_validate()
		{
			
				getGoqclibSpridenCurrentController().persSuffix_validate();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_SUFFIX.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", item="PERS_SUFFIX", function=KeyFunction.SAVE)
		public void persSuffix_Save()
		{
			
				getGoqclibSpridenCurrentController().persSuffix_Save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_PREF_FNAME.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="PERS_PREF_FNAME")
		public void persPrefFname_validate()
		{
			
				getGoqclibSpridenCurrentController().persPrefFname_validate();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_PREF_FNAME.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", item="PERS_PREF_FNAME", function=KeyFunction.SAVE)
		public void persPrefFname_Save()
		{
			
				getGoqclibSpridenCurrentController().persPrefFname_Save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_LEGAL_NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="PERS_LEGAL_NAME", function=KeyFunction.NEXT_ITEM)
		public void persLegalName_keyNexItem()
		{
			
				getGoqclibSpridenCurrentController().persLegalName_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_LEGAL_NAME.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="PERS_LEGAL_NAME")
		public void persLegalName_validate()
		{
			
				getGoqclibSpridenCurrentController().persLegalName_validate();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_LEGAL_NAME.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", item="PERS_LEGAL_NAME", function=KeyFunction.SAVE)
		public void persLegalName_Save()
		{
			
				getGoqclibSpridenCurrentController().persLegalName_Save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_MRTL_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="PERS_MRTL_CODE")
		public void persMrtlCode_doubleClick()
		{
			
				getGoqclibSpridenCurrentController().persMrtlCode_WhenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_MRTL_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PERS_MRTL_CODE", function=KeyFunction.ITEM_CHANGE)
		public void persMrtlCode_itemChange()
		{
			
				getGoqclibSpridenCurrentController().persMrtlCode_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_MRTL_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="PERS_MRTL_CODE")
		public void persMrtlCode_GSearchParameters()
		{
			
				getGoqclibSpridenCurrentController().persMrtlCode_GSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_MRTL_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="PERS_MRTL_CODE")
		public void persMrtlCode_GSearchOptions()
		{
			
				getGoqclibSpridenCurrentController().persMrtlCode_GSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_MRTL_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PERS_MRTL_CODE", function=KeyFunction.ITEM_OUT)
		public void persMrtlCode_itemOut()
		{
			
				getGoqclibSpridenCurrentController().persMrtlCode_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_MRTL_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="PERS_MRTL_CODE")
		public void persMrtlCode_validate()
		{
			
				getGoqclibSpridenCurrentController().persMrtlCode_validate();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_MRTL_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="PERS_MRTL_CODE")
		public void persMrtlCode_PostChange()
		{
			
				getGoqclibSpridenCurrentController().persMrtlCode_PostChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_MRTL_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="PERS_MRTL_CODE", function=KeyFunction.NEXT_ITEM)
		public void persMrtlCode_keyNexItem()
		{
			
				getGoqclibSpridenCurrentController().persMrtlCode_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_MRTL_CODE.KEY_NXTKEY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY_NXTKEY", item="PERS_MRTL_CODE")
		public void persMrtlCode_KeyNxtkey()
		{
			
				getGoqclibSpridenCurrentController().persMrtlCode_KeyNxtkey();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERS_MRTL_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="PERS_MRTL_CODE_LBT")
		public void persMrtlCodeLbt_click()
		{
			
				getGoqclibSpridenCurrentController().persMrtlCodeLbt_click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * MRTL_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="MRTL_DESC", function=KeyFunction.ITEM_CHANGE)
		public void mrtlDesc_itemChange()
		{
			
				getGoqclibSpridenCurrentController().mrtlDesc_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NON_PERS_NAME.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="NON_PERS_NAME", function=KeyFunction.COUNT_QUERY)
		public void nonPersName_TotalResults()
		{
			
				getGoqclibSpridenCurrentController().nonPersName_TotalResults();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NON_PERS_NAME.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="NON_PERS_NAME")
		public void nonPersName_validate()
		{
			
				getGoqclibSpridenCurrentController().nonPersName_validate();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NON_PERS_NAME.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="NON_PERS_NAME", function=KeyFunction.PREVIOUS_ITEM)
		public void nonPersName_PreviousItem()
		{
			
				getGoqclibSpridenCurrentController().nonPersName_PreviousItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NON_PERS_NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="NON_PERS_NAME", function=KeyFunction.NEXT_ITEM)
		public void nonPersName_keyNexItem()
		{
			
				getGoqclibSpridenCurrentController().nonPersName_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NON_PERS_NAME.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="NON_PERS_NAME", function=KeyFunction.ITEM_CHANGE)
		public void nonPersName_itemChange()
		{
			
				getGoqclibSpridenCurrentController().nonPersName_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ORG_NAME_SRCH_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="ORG_NAME_SRCH_BTN")
		public void orgNameSrchBtn_click()
		{
			
				getGoqclibSpridenCurrentController().orgNameSrchBtn_click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ORG_NAME_SRCH_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="ORG_NAME_SRCH_BTN")
		public void orgNameSrchBtn_buttonClick()
		{
			
				getGoqclibSpridenCurrentController().orgNameSrchBtn_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_USER.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="SPRIDEN_USER", function=KeyFunction.PREVIOUS_ITEM)
		public void spridenUser_PreviousItem()
		{
			
				getGoqclibSpridenCurrentController().spridenUser_PreviousItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRIDEN_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void spridenActivityDate_keyNexItem()
		{
			
				getGoqclibSpridenCurrentController().spridenActivityDate_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRIDEN_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void spridenActivityDate_itemChange()
		{
			
				getGoqclibSpridenCurrentController().spridenActivityDate_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRIDEN_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void spridenActivityDate_itemOut()
		{
			
				getGoqclibSpridenCurrentController().spridenActivityDate_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_ORIGIN.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRIDEN_ORIGIN", function=KeyFunction.NEXT_ITEM)
		public void spridenOrigin_keyNexItem()
		{
			
				getGoqclibSpridenCurrentController().spridenOrigin_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CREATE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRIDEN_CREATE_DATE", function=KeyFunction.NEXT_ITEM)
		public void spridenCreateDate_keyNexItem()
		{
			
				getGoqclibSpridenCurrentController().spridenCreateDate_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CREATE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRIDEN_CREATE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void spridenCreateDate_itemChange()
		{
			
				getGoqclibSpridenCurrentController().spridenCreateDate_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CREATE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRIDEN_CREATE_DATE", function=KeyFunction.ITEM_OUT)
		public void spridenCreateDate_itemOut()
		{
			
				getGoqclibSpridenCurrentController().spridenCreateDate_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_MI.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRIDEN_MI")
		public void spridenMi_PostChange()
		{
			
				getGoqclibSpridenCurrentController().spridenMi_PostChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_FIRST_NAME.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRIDEN_FIRST_NAME")
		public void spridenFirstName_PostChange()
		{
			
				getGoqclibSpridenCurrentController().spridenFirstName_PostChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_SURNAME_PREFIX.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRIDEN_SURNAME_PREFIX")
		public void spridenSurnamePrefix_PostChange()
		{
			
				getGoqclibSpridenCurrentController().spridenSurnamePrefix_PostChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_LAST_NAME.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRIDEN_LAST_NAME")
		public void spridenLastName_PostChange()
		{
			
				getGoqclibSpridenCurrentController().spridenLastName_PostChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_ID.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRIDEN_ID")
		public void spridenId_validate()
		{
			getGoqclibSpridenCurrentController().spridenId_validate();
//				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);
//							this.spridenId_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_MI.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRIDEN_MI")
		public void spridenMi_validate()
		{
			getGoqclibSpridenCurrentController().spridenMi_validate();
//				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);
//							this.spridenMi_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_FIRST_NAME.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRIDEN_FIRST_NAME")
		public void spridenFirstName_validate()
		{
			getGoqclibSpridenCurrentController().spridenFirstName_validate();
//				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);
//							this.spridenFirstName_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_SURNAME_PREFIX.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRIDEN_SURNAME_PREFIX")
		public void spridenSurnamePrefix_validate()
		{
			getGoqclibSpridenCurrentController().spridenSurnamePrefix_validate();
//				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);
//							this.spridenSurnamePrefix_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_LAST_NAME.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRIDEN_LAST_NAME")
		public void spridenLastName_validate()
		{
			getGoqclibSpridenCurrentController().spridenLastName_validate();
//				SpridenCurrentAdapter spridenCurrentElement = (SpridenCurrentAdapter)this.getFormModel().getSpridenCurrent().getRowAdapter(true);
//							this.spridenLastName_PostChange();

			}

		
	
	
}

