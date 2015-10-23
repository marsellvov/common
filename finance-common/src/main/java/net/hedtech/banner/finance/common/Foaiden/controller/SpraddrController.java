package net.hedtech.banner.finance.common.Foaiden.controller;
 
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
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqclib.model.SpraddrAdapter;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.banner.finance.common.Foaiden.model.*;
import net.hedtech.banner.finance.common.Foaiden.*;
import net.hedtech.banner.finance.common.Foaiden.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SpraddrController extends DefaultBlockController {


	private net.hedtech.general.common.libraries.Goqclib.controller.SpraddrController getGoqclibSpraddrController() {
		return (net.hedtech.general.common.libraries.Goqclib.controller.SpraddrController) this.getTask().getTaskPart("GOQCLIB").getSupportCodeManager().getPackage("SPRADDR");
	}	
	
	public SpraddrController(IFormController parentController, String name) 
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
		 * SPRADDR.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void spraddr_blockChange()
		{
			
				getGoqclibSpraddrController().spraddr_blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void spraddr_BeforeQuery(QueryEvent args)
		{
			
				getGoqclibSpraddrController().spraddr_BeforeQuery(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void spraddr_AfterQuery(RowAdapterEvent args)
		{
			
				getGoqclibSpraddrController().spraddr_AfterQuery(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void spraddr_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGoqclibSpraddrController().spraddr_BeforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void spraddr_RowInsert(RowAdapterEvent args)
		{
			
				getGoqclibSpraddrController().spraddr_RowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.POST-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowInsert
		public void spraddr_AfterRowInsert(RowAdapterEvent args)
		{
			
				getGoqclibSpraddrController().spraddr_AfterRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void spraddr_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGoqclibSpraddrController().spraddr_BeforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowUpdate
		public void spraddr_RowUpdate(RowAdapterEvent args)
		{
			
				getGoqclibSpraddrController().spraddr_RowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.POST-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowUpdate
		public void spraddr_AfterRowUpdate(RowAdapterEvent args)
		{
			
				getGoqclibSpraddrController().spraddr_AfterRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.PRE-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowDelete
		public void spraddr_BeforeRowDelete(RowAdapterEvent args)
		{
			
				getGoqclibSpraddrController().spraddr_BeforeRowDelete(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.ON-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowDelete
		public void spraddr_RowDelete(RowAdapterEvent args)
		{
			
				getGoqclibSpraddrController().spraddr_RowDelete(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.POST-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowDelete
		public void spraddr_AfterRowDelete(RowAdapterEvent args)
		{
			
				getGoqclibSpraddrController().spraddr_AfterRowDelete(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-CLRFRM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRFRM", function=KeyFunction.CLEAR_FORM)
		public void spraddr_ClearTask()
		{
			
				getGoqclibSpraddrController().spraddr_ClearTask();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void spraddr_Save()
		{
			
				getGoqclibSpraddrController().spraddr_Save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void spraddr_DeleteRecord()
		{
			
				getGoqclibSpraddrController().spraddr_DeleteRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void spraddr_CopyRecord()
		{
			
				getGoqclibSpraddrController().spraddr_CopyRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void spraddr_Search()
		{
			
				getGoqclibSpraddrController().spraddr_Search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void spraddr_NextBlock()
		{
			
				getGoqclibSpraddrController().spraddr_NextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTKEY")
		public void spraddr_KeyNxtkey()
		{
			
				getGoqclibSpraddrController().spraddr_KeyNxtkey();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void spraddr_NextRecord()
		{
			
				getGoqclibSpraddrController().spraddr_NextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET")
		public void spraddr_KeyNxtset()
		{
			
				getGoqclibSpraddrController().spraddr_KeyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void spraddr_PreviousBlock()
		{
			
				getGoqclibSpraddrController().spraddr_PreviousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void spraddr_PreviousRecord()
		{
			
				getGoqclibSpraddrController().spraddr_PreviousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.CHECK_ADDRESS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_ADDRESS")
		public void spraddr_CheckAddress()
		{
			
				getGoqclibSpraddrController().spraddr_CheckAddress();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.CHECK_ADDRESS_EXISTS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_ADDRESS_EXISTS")
		public void spraddr_CheckAddressExists()
		{
			
				getGoqclibSpraddrController().spraddr_CheckAddressExists();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.CHECK_DATES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_DATES")
		public void spraddr_CheckDates()
		{
			
				getGoqclibSpraddrController().spraddr_CheckDates();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.CHECK_IF_PHONE_EXISTS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_IF_PHONE_EXISTS")
		public void spraddr_CheckIfPhoneExists()
		{
			
				getGoqclibSpraddrController().spraddr_CheckIfPhoneExists();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.CHECK_MULTIPLE_ZIPS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_MULTIPLE_ZIPS")
		public void spraddr_CheckMultipleZips()
		{
			
				getGoqclibSpraddrController().spraddr_CheckMultipleZips();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.CHECK_PHONE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_PHONE")
		public void spraddr_CheckPhone()
		{
			
				getGoqclibSpraddrController().spraddr_CheckPhone();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.CHECK_PHONE_UPDATE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_PHONE_UPDATE")
		public void spraddr_CheckPhoneUpdate()
		{
			
				getGoqclibSpraddrController().spraddr_CheckPhoneUpdate();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.CHECK_PHONES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_PHONES")
		public void spraddr_CheckPhones()
		{
			
				getGoqclibSpraddrController().spraddr_CheckPhones();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.ENABLE_PHONE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ENABLE_PHONE")
		public void spraddr_EnablePhone()
		{
			
				getGoqclibSpraddrController().spraddr_EnablePhone();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.FIELDS_ENTERED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="FIELDS_ENTERED")
		public void spraddr_FieldsEntered()
		{
			
				getGoqclibSpraddrController().spraddr_FieldsEntered();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.GET_PHONE_COUNT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_PHONE_COUNT")
		public void spraddr_GetPhoneCount()
		{
			
				getGoqclibSpraddrController().spraddr_GetPhoneCount();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.GET_PHONE_INFO
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="GET_PHONE_INFO")
		public void spraddr_GetPhoneInfo()
		{
			
				getGoqclibSpraddrController().spraddr_GetPhoneInfo();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.INSERT_SPRTELE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="INSERT_SPRTELE")
		public void spraddr_InsertSprtele()
		{
			
				getGoqclibSpraddrController().spraddr_InsertSprtele();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.PHONE_COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PHONE_COMMIT")
		public void spraddr_PhoneCommit()
		{
			
				getGoqclibSpraddrController().spraddr_PhoneCommit();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.RESET_FINANCE_RULES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="RESET_FINANCE_RULES")
		public void spraddr_ResetFinanceRules()
		{
			
				getGoqclibSpraddrController().spraddr_ResetFinanceRules();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.SET_CHECK_BOXES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SET_CHECK_BOXES")
		public void spraddr_SetCheckBoxes()
		{
			
				getGoqclibSpraddrController().spraddr_SetCheckBoxes();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.SET_FINANCE_DATES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SET_FINANCE_DATES")
		public void spraddr_SetFinanceDates()
		{
			
				getGoqclibSpraddrController().spraddr_SetFinanceDates();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.SET_FINANCE_RULES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SET_FINANCE_RULES")
		public void spraddr_SetFinanceRules()
		{
			
				getGoqclibSpraddrController().spraddr_SetFinanceRules();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.SHOW_PHONES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SHOW_PHONES")
		public void spraddr_ShowPhones()
		{
			
				getGoqclibSpraddrController().spraddr_ShowPhones();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.UPDATE_PHONE_STATUS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="UPDATE_PHONE_STATUS")
		public void spraddr_UpdatePhoneStatus()
		{
			
				getGoqclibSpraddrController().spraddr_UpdatePhoneStatus();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR.UPDATE_SPRTELE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="UPDATE_SPRTELE")
		public void spraddr_UpdateSprtele()
		{
			
				getGoqclibSpraddrController().spraddr_UpdateSprtele();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_FROM_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_FROM_DATE", function=KeyFunction.NEXT_ITEM)
		public void spraddrFromDate_keyNexItem()
		{
			
				getGoqclibSpraddrController().spraddrFromDate_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_FROM_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_FROM_DATE", function=KeyFunction.ITEM_CHANGE)
		public void spraddrFromDate_itemChange()
		{
			
				getGoqclibSpraddrController().spraddrFromDate_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_FROM_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRADDR_FROM_DATE", function=KeyFunction.ITEM_OUT)
		public void spraddrFromDate_itemOut()
		{
			
				getGoqclibSpraddrController().spraddrFromDate_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_FROM_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRADDR_FROM_DATE")
		public void spraddrFromDate_PostChange()
		{
			
				getGoqclibSpraddrController().spraddrFromDate_PostChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_FROM_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_FROM_DATE_DBT")
		public void spraddrFromDateDbt_click()
		{
			
				getGoqclibSpraddrController().spraddrFromDateDbt_click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_FROM_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRADDR_FROM_DATE_DBT")
		public void spraddrFromDateDbt_buttonClick()
		{
			
				getGoqclibSpraddrController().spraddrFromDateDbt_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_TO_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_TO_DATE", function=KeyFunction.NEXT_ITEM)
		public void spraddrToDate_keyNexItem()
		{
			
				getGoqclibSpraddrController().spraddrToDate_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_TO_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_TO_DATE", function=KeyFunction.ITEM_CHANGE)
		public void spraddrToDate_itemChange()
		{
			
				getGoqclibSpraddrController().spraddrToDate_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_TO_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRADDR_TO_DATE", function=KeyFunction.ITEM_OUT)
		public void spraddrToDate_itemOut()
		{
			
				getGoqclibSpraddrController().spraddrToDate_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_TO_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRADDR_TO_DATE")
		public void spraddrToDate_PostChange()
		{
			
				getGoqclibSpraddrController().spraddrToDate_PostChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_TO_DATE_DBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_TO_DATE_DBT")
		public void spraddrToDateDbt_click()
		{
			
				getGoqclibSpraddrController().spraddrToDateDbt_click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_TO_DATE_DBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRADDR_TO_DATE_DBT")
		public void spraddrToDateDbt_buttonClick()
		{
			
				getGoqclibSpraddrController().spraddrToDateDbt_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPRADDR_ATYP_CODE")
		public void spraddrAtypCode_doubleClick()
		{
			
				getGoqclibSpraddrController().spraddrAtypCode_WhenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_ATYP_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spraddrAtypCode_itemChange()
		{
			
				getGoqclibSpraddrController().spraddrAtypCode_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPRADDR_ATYP_CODE")
		public void spraddrAtypCode_GSearchParameters()
		{
			
				getGoqclibSpraddrController().spraddrAtypCode_GSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_ATYP_CODE", function=KeyFunction.NEXT_ITEM)
		public void spraddrAtypCode_keyNexItem()
		{
			
				getGoqclibSpraddrController().spraddrAtypCode_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRADDR_ATYP_CODE", function=KeyFunction.ITEM_OUT)
		public void spraddrAtypCode_itemOut()
		{
			
				getGoqclibSpraddrController().spraddrAtypCode_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPRADDR_ATYP_CODE")
		public void spraddrAtypCode_GSearchOptions()
		{
			
				getGoqclibSpraddrController().spraddrAtypCode_GSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRADDR_ATYP_CODE")
		public void spraddrAtypCode_PostChange()
		{
			
				getGoqclibSpraddrController().spraddrAtypCode_PostChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="SPRADDR_ATYP_CODE", function=KeyFunction.COUNT_QUERY)
		public void spraddrAtypCode_TotalResults()
		{
			
				getGoqclibSpraddrController().spraddrAtypCode_TotalResults();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_ATYP_CODE_LBT")
		public void spraddrAtypCodeLbt_click()
		{
			
				getGoqclibSpraddrController().spraddrAtypCodeLbt_click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SPRADDR_ATYP_CODE_LBT")
		public void spraddrAtypCodeLbt_buttonClick()
		{
			
				getGoqclibSpraddrController().spraddrAtypCodeLbt_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ATYP_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ATYP_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void atypDescription_itemChange()
		{
			
				getGoqclibSpraddrController().atypDescription_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPRADDR_STAT_CODE")
		public void spraddrStatCode_doubleClick()
		{
			
				getGoqclibSpraddrController().spraddrStatCode_WhenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_STAT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spraddrStatCode_itemChange()
		{
			
				getGoqclibSpraddrController().spraddrStatCode_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPRADDR_STAT_CODE")
		public void spraddrStatCode_GSearchParameters()
		{
			
				getGoqclibSpraddrController().spraddrStatCode_GSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPRADDR_STAT_CODE")
		public void spraddrStatCode_GSearchOptions()
		{
			
				getGoqclibSpraddrController().spraddrStatCode_GSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_STAT_CODE", function=KeyFunction.NEXT_ITEM)
		public void spraddrStatCode_keyNexItem()
		{
			
				getGoqclibSpraddrController().spraddrStatCode_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="SPRADDR_STAT_CODE", function=KeyFunction.ITEM_IN)
		public void spraddrStatCode_itemIn()
		{
			
				getGoqclibSpraddrController().spraddrStatCode_itemIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRADDR_STAT_CODE", function=KeyFunction.ITEM_OUT)
		public void spraddrStatCode_itemOut()
		{
			
				getGoqclibSpraddrController().spraddrStatCode_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRADDR_STAT_CODE")
		public void spraddrStatCode_PostChange()
		{
			
				getGoqclibSpraddrController().spraddrStatCode_PostChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_STAT_CODE_LBT")
		public void spraddrStatCodeLbt_click()
		{
			
				getGoqclibSpraddrController().spraddrStatCodeLbt_click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STAT_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STAT_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void statDescription_itemChange()
		{
			
				getGoqclibSpraddrController().statDescription_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ZIP.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SPRADDR_ZIP", function=KeyFunction.LIST_VALUES)
		public void spraddrZip_ListValues()
		{
			
				getGoqclibSpraddrController().spraddrZip_ListValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ZIP.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_ZIP", function=KeyFunction.NEXT_ITEM)
		public void spraddrZip_keyNexItem()
		{
			
				getGoqclibSpraddrController().spraddrZip_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ZIP.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="SPRADDR_ZIP", function=KeyFunction.PREVIOUS_ITEM)
		public void spraddrZip_PreviousItem()
		{
			
				getGoqclibSpraddrController().spraddrZip_PreviousItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ZIP.ADDR_DEFAULT_NXTFLD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ADDR_DEFAULT_NXTFLD", item="SPRADDR_ZIP")
		public void spraddrZip_AddrDefaultNxtfld()
		{
			
				getGoqclibSpraddrController().spraddrZip_AddrDefaultNxtfld();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ZIP_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_ZIP_LBT")
		public void spraddrZipLbt_click()
		{
			
				getGoqclibSpraddrController().spraddrZipLbt_click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPRADDR_CNTY_CODE")
		public void spraddrCntyCode_doubleClick()
		{
			
				getGoqclibSpraddrController().spraddrCntyCode_WhenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_CNTY_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spraddrCntyCode_itemChange()
		{
			
				getGoqclibSpraddrController().spraddrCntyCode_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPRADDR_CNTY_CODE")
		public void spraddrCntyCode_GSearchParameters()
		{
			
				getGoqclibSpraddrController().spraddrCntyCode_GSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPRADDR_CNTY_CODE")
		public void spraddrCntyCode_GSearchOptions()
		{
			
				getGoqclibSpraddrController().spraddrCntyCode_GSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_CNTY_CODE", function=KeyFunction.NEXT_ITEM)
		public void spraddrCntyCode_keyNexItem()
		{
			
				getGoqclibSpraddrController().spraddrCntyCode_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRADDR_CNTY_CODE", function=KeyFunction.ITEM_OUT)
		public void spraddrCntyCode_itemOut()
		{
			
				getGoqclibSpraddrController().spraddrCntyCode_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRADDR_CNTY_CODE")
		public void spraddrCntyCode_PostChange()
		{
			
				getGoqclibSpraddrController().spraddrCntyCode_PostChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_CNTY_CODE_LBT")
		public void spraddrCntyCodeLbt_click()
		{
			
				getGoqclibSpraddrController().spraddrCntyCodeLbt_click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CNTY_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="CNTY_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void cntyDescription_itemChange()
		{
			
				getGoqclibSpraddrController().cntyDescription_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPRADDR_NATN_CODE")
		public void spraddrNatnCode_doubleClick()
		{
			
				getGoqclibSpraddrController().spraddrNatnCode_WhenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_NATN_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spraddrNatnCode_itemChange()
		{
			
				getGoqclibSpraddrController().spraddrNatnCode_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPRADDR_NATN_CODE")
		public void spraddrNatnCode_GSearchOptions()
		{
			
				getGoqclibSpraddrController().spraddrNatnCode_GSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_NATN_CODE", function=KeyFunction.NEXT_ITEM)
		public void spraddrNatnCode_keyNexItem()
		{
			
				getGoqclibSpraddrController().spraddrNatnCode_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPRADDR_NATN_CODE")
		public void spraddrNatnCode_GSearchParameters()
		{
			
				getGoqclibSpraddrController().spraddrNatnCode_GSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRADDR_NATN_CODE", function=KeyFunction.ITEM_OUT)
		public void spraddrNatnCode_itemOut()
		{
			
				getGoqclibSpraddrController().spraddrNatnCode_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRADDR_NATN_CODE")
		public void spraddrNatnCode_PostChange()
		{
			
				getGoqclibSpraddrController().spraddrNatnCode_PostChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_NATN_CODE_LBT")
		public void spraddrNatnCodeLbt_click()
		{
			
				getGoqclibSpraddrController().spraddrNatnCodeLbt_click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NATN_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="NATN_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void natnDescription_itemChange()
		{
			
				getGoqclibSpraddrController().natnDescription_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="TELE_CODE")
		public void teleCode_doubleClick()
		{
			
				getGoqclibSpraddrController().teleCode_WhenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="TELE_CODE", function=KeyFunction.ITEM_CHANGE)
		public void teleCode_itemChange()
		{
			
				getGoqclibSpraddrController().teleCode_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="TELE_CODE")
		public void teleCode_GSearchParameters()
		{
			
				getGoqclibSpraddrController().teleCode_GSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="TELE_CODE")
		public void teleCode_GSearchOptions()
		{
			
				getGoqclibSpraddrController().teleCode_GSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="TELE_CODE", function=KeyFunction.NEXT_ITEM)
		public void teleCode_keyNexItem()
		{
			
				getGoqclibSpraddrController().teleCode_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="TELE_CODE", function=KeyFunction.ITEM_OUT)
		public void teleCode_itemOut()
		{
			
				getGoqclibSpraddrController().teleCode_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="TELE_CODE")
		public void teleCode_PostChange()
		{
			
				getGoqclibSpraddrController().teleCode_PostChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", item="TELE_CODE", function=KeyFunction.SAVE)
		public void teleCode_Save()
		{
			
				getGoqclibSpraddrController().teleCode_Save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TELE_CODE_LBT")
		public void teleCodeLbt_click()
		{
			
				getGoqclibSpraddrController().teleCodeLbt_click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="TELE_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void teleDescription_itemChange()
		{
			
				getGoqclibSpraddrController().teleDescription_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_CTRY.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PHONE_CTRY", function=KeyFunction.ITEM_CHANGE)
		public void phoneCtry_itemChange()
		{
			
				getGoqclibSpraddrController().phoneCtry_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_CTRY.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PHONE_CTRY", function=KeyFunction.ITEM_OUT)
		public void phoneCtry_itemOut()
		{
			
				getGoqclibSpraddrController().phoneCtry_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_CTRY.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", item="PHONE_CTRY", function=KeyFunction.SAVE)
		public void phoneCtry_Save()
		{
			
				getGoqclibSpraddrController().phoneCtry_Save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_CTRY.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="PHONE_CTRY", function=KeyFunction.COUNT_QUERY)
		public void phoneCtry_TotalResults()
		{
			
				getGoqclibSpraddrController().phoneCtry_TotalResults();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_AREA.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PHONE_AREA", function=KeyFunction.ITEM_CHANGE)
		public void phoneArea_itemChange()
		{
			
				getGoqclibSpraddrController().phoneArea_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_AREA.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PHONE_AREA", function=KeyFunction.ITEM_OUT)
		public void phoneArea_itemOut()
		{
			
				getGoqclibSpraddrController().phoneArea_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_AREA.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", item="PHONE_AREA", function=KeyFunction.SAVE)
		public void phoneArea_Save()
		{
			
				getGoqclibSpraddrController().phoneArea_Save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_AREA.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="PHONE_AREA", function=KeyFunction.COUNT_QUERY)
		public void phoneArea_TotalResults()
		{
			
				getGoqclibSpraddrController().phoneArea_TotalResults();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_NUMBER.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PHONE_NUMBER", function=KeyFunction.ITEM_CHANGE)
		public void phoneNumber_itemChange()
		{
			
				getGoqclibSpraddrController().phoneNumber_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_NUMBER.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PHONE_NUMBER", function=KeyFunction.ITEM_OUT)
		public void phoneNumber_itemOut()
		{
			
				getGoqclibSpraddrController().phoneNumber_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_NUMBER.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", item="PHONE_NUMBER", function=KeyFunction.SAVE)
		public void phoneNumber_Save()
		{
			
				getGoqclibSpraddrController().phoneNumber_Save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_NUMBER.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="PHONE_NUMBER", function=KeyFunction.COUNT_QUERY)
		public void phoneNumber_TotalResults()
		{
			
				getGoqclibSpraddrController().phoneNumber_TotalResults();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_EXT.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PHONE_EXT", function=KeyFunction.ITEM_CHANGE)
		public void phoneExt_itemChange()
		{
			
				getGoqclibSpraddrController().phoneExt_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_EXT.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="PHONE_EXT", function=KeyFunction.ITEM_OUT)
		public void phoneExt_itemOut()
		{
			
				getGoqclibSpraddrController().phoneExt_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_EXT.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", item="PHONE_EXT", function=KeyFunction.SAVE)
		public void phoneExt_Save()
		{
			
				getGoqclibSpraddrController().phoneExt_Save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_EXT.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="PHONE_EXT", function=KeyFunction.COUNT_QUERY)
		public void phoneExt_TotalResults()
		{
			
				getGoqclibSpraddrController().phoneExt_TotalResults();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="PHONE_BTN")
		public void phoneBtn_click()
		{
			
				getGoqclibSpraddrController().phoneBtn_click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="PHONE_BTN")
		public void phoneBtn_buttonClick()
		{
			
				getGoqclibSpraddrController().phoneBtn_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FAX_CTRY.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FAX_CTRY", function=KeyFunction.ITEM_CHANGE)
		public void faxCtry_itemChange()
		{
			
				getGoqclibSpraddrController().faxCtry_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FAX_CTRY.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FAX_CTRY", function=KeyFunction.ITEM_OUT)
		public void faxCtry_itemOut()
		{
			
				getGoqclibSpraddrController().faxCtry_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FAX_CTRY.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", item="FAX_CTRY", function=KeyFunction.SAVE)
		public void faxCtry_Save()
		{
			
				getGoqclibSpraddrController().faxCtry_Save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FAX_CTRY.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="FAX_CTRY", function=KeyFunction.COUNT_QUERY)
		public void faxCtry_TotalResults()
		{
			
				getGoqclibSpraddrController().faxCtry_TotalResults();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPRADDR_ASRC_CODE")
		public void spraddrAsrcCode_doubleClick()
		{
			
				getGoqclibSpraddrController().spraddrAsrcCode_WhenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_ASRC_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spraddrAsrcCode_itemChange()
		{
			
				getGoqclibSpraddrController().spraddrAsrcCode_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPRADDR_ASRC_CODE")
		public void spraddrAsrcCode_GSearchParameters()
		{
			
				getGoqclibSpraddrController().spraddrAsrcCode_GSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPRADDR_ASRC_CODE")
		public void spraddrAsrcCode_GSearchOptions()
		{
			
				getGoqclibSpraddrController().spraddrAsrcCode_GSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRADDR_ASRC_CODE", function=KeyFunction.ITEM_OUT)
		public void spraddrAsrcCode_itemOut()
		{
			
				getGoqclibSpraddrController().spraddrAsrcCode_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_ASRC_CODE", function=KeyFunction.NEXT_ITEM)
		public void spraddrAsrcCode_keyNexItem()
		{
			
				getGoqclibSpraddrController().spraddrAsrcCode_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPRADDR_ASRC_CODE")
		public void spraddrAsrcCode_PostChange()
		{
			
				getGoqclibSpraddrController().spraddrAsrcCode_PostChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPRADDR_ASRC_CODE_LBT")
		public void spraddrAsrcCodeLbt_click()
		{
			
				getGoqclibSpraddrController().spraddrAsrcCodeLbt_click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_DELIVERY_POINT.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_DELIVERY_POINT", function=KeyFunction.ITEM_CHANGE)
		public void spraddrDeliveryPoint_itemChange()
		{
			
				getGoqclibSpraddrController().spraddrDeliveryPoint_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRADDR_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void spraddrActivityDate_keyNexItem()
		{
			
				getGoqclibSpraddrController().spraddrActivityDate_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPRADDR_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void spraddrActivityDate_itemChange()
		{
			
				getGoqclibSpraddrController().spraddrActivityDate_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPRADDR_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void spraddrActivityDate_itemOut()
		{
			
				getGoqclibSpraddrController().spraddrActivityDate_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_FROM_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRADDR_FROM_DATE")
		public void spraddrFromDate_validate()
		{
			getGoqclibSpraddrController().spraddrFromDate_validate();
//				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);
//							this.spraddrFromDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_TO_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRADDR_TO_DATE")
		public void spraddrToDate_validate()
		{
			getGoqclibSpraddrController().spraddrToDate_validate();
//				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);
//							this.spraddrToDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ATYP_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRADDR_ATYP_CODE")
		public void spraddrAtypCode_validate()
		{
			getGoqclibSpraddrController().spraddrAtypCode_validate();
//				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);
//							this.spraddrAtypCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_STAT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRADDR_STAT_CODE")
		public void spraddrStatCode_validate()
		{
			getGoqclibSpraddrController().spraddrStatCode_validate();
//				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);
//							this.spraddrStatCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_CNTY_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRADDR_CNTY_CODE")
		public void spraddrCntyCode_validate()
		{
			getGoqclibSpraddrController().spraddrCntyCode_validate();
//				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);
//							this.spraddrCntyCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_NATN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRADDR_NATN_CODE")
		public void spraddrNatnCode_validate()
		{
			getGoqclibSpraddrController().spraddrNatnCode_validate();
//				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);
//							this.spraddrNatnCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TELE_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="TELE_CODE")
		public void teleCode_validate()
		{
			getGoqclibSpraddrController().teleCode_validate();
//				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);
//							this.teleCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRADDR_ASRC_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPRADDR_ASRC_CODE")
		public void spraddrAsrcCode_validate()
		{
			getGoqclibSpraddrController().spraddrAsrcCode_validate();
//				SpraddrAdapter spraddrElement = (SpraddrAdapter)this.getFormModel().getSpraddr().getRowAdapter(true);
//							this.spraddrAsrcCode_PostChange();

			}

		
	
	
}

