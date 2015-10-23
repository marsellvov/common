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
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.banner.finance.common.Foaiden.model.*;
import net.hedtech.banner.finance.common.Foaiden.*;
import net.hedtech.banner.finance.common.Foaiden.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SpridenPreviousController extends DefaultBlockController {


	private net.hedtech.general.common.libraries.Goqclib.controller.SpridenPreviousController getGoqclibSpridenPreviousController() {
		return (net.hedtech.general.common.libraries.Goqclib.controller.SpridenPreviousController) this.getTask().getTaskPart("GOQCLIB").getSupportCodeManager().getPackage("SPRIDEN_PREVIOUS");
	}	
	
	public SpridenPreviousController(IFormController parentController, String name) 
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
		 * SPRIDEN_PREVIOUS.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void spridenPrevious_blockChange()
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void spridenPrevious_recordChange()
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_recordChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", function=KeyFunction.ITEM_CHANGE)
		public void spridenPrevious_itemChange()
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void spridenPrevious_AfterQuery(RowAdapterEvent args)
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_AfterQuery(args);
			}
		
		@BeforeQuery
		public void spridenPrevious_BeforeQuery(QueryEvent args) {
			
			getGoqclibSpridenPreviousController().spridenPrevious_BeforeQuery(args);
		}
		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.PRE-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowDelete
		public void spridenPrevious_BeforeRowDelete(RowAdapterEvent args)
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_BeforeRowDelete(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.ON-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowDelete
		public void spridenPrevious_RowDelete(RowAdapterEvent args)
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_RowDelete(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void spridenPrevious_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_BeforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void spridenPrevious_RowInsert(RowAdapterEvent args)
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_RowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void spridenPrevious_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_BeforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowUpdate
		public void spridenPrevious_RowUpdate(RowAdapterEvent args)
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_RowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void spridenPrevious_Save()
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_Save();
			}

		
		/*
		 *<p>
		 *Invalid function.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void spridenPrevious_CreateRecord()
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_CreateRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void spridenPrevious_DeleteRecord()
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_DeleteRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void spridenPrevious_CopyRecord()
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_CopyRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void spridenPrevious_NextBlock()
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_NextBlock();
			}

		
		/*
		 *<p>
		 *This trigger will determine if the cursor is about to move onto a null

		 *record.  If it is, then display the last row message.
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void spridenPrevious_NextRecord()
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_NextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void spridenPrevious_PreviousBlock()
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_PreviousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.DISABLE_ITEMS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="DISABLE_ITEMS")
		public void spridenPrevious_DisableItems()
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_DisableItems();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.ENABLE_ITEMS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ENABLE_ITEMS")
		public void spridenPrevious_EnableItems()
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_EnableItems();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.SET_ID_NAVIGABLE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SET_ID_NAVIGABLE")
		public void spridenPrevious_SetIdNavigable()
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_SetIdNavigable();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_PREVIOUS.SET_NAME_NAVIGABLE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SET_NAME_NAVIGABLE")
		public void spridenPrevious_SetNameNavigable()
		{
			
				getGoqclibSpridenPreviousController().spridenPrevious_SetNameNavigable();
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
			
				getGoqclibSpridenPreviousController().spridenNtypCode_WhenMouseDoubleclick();
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
			
				getGoqclibSpridenPreviousController().spridenNtypCode_itemChange();
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
			
				getGoqclibSpridenPreviousController().spridenNtypCode_GSearchParameters();
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
			
				getGoqclibSpridenPreviousController().spridenNtypCode_GSearchOptions();
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
			
				getGoqclibSpridenPreviousController().spridenNtypCode_itemOut();
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
			
				getGoqclibSpridenPreviousController().spridenNtypCode_validate();
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
			
				getGoqclibSpridenPreviousController().spridenNtypCode_keyNexItem();
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
			
				getGoqclibSpridenPreviousController().spridenNtypCode_ListValuesCopy();
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
			
				getGoqclibSpridenPreviousController().spridenNtypCodeLbt_click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PREVIOUS_NTYP_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PREVIOUS_NTYP_DESC", function=KeyFunction.ITEM_CHANGE)
		public void previousNtypDesc_itemChange()
		{
			
				getGoqclibSpridenPreviousController().previousNtypDesc_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_CHANGE_IND.WHEN-LIST-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-LIST-CHANGED", item="SPRIDEN_CHANGE_IND")
		public void spridenChangeInd_listChange()
		{
			
				getGoqclibSpridenPreviousController().spridenChangeInd_listChange();
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
			
				getGoqclibSpridenPreviousController().spridenId_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPRIDEN_LAST_NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPRIDEN_LAST_NAME", function=KeyFunction.NEXT_ITEM)
		public void spridenLastName_keyNexItem()
		{
			
				getGoqclibSpridenPreviousController().spridenLastName_keyNexItem();
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
			
				getGoqclibSpridenPreviousController().spridenOrigin_keyNexItem();
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
			
				getGoqclibSpridenPreviousController().spridenUser_PreviousItem();
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
			
				getGoqclibSpridenPreviousController().spridenActivityDate_keyNexItem();
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
			
				getGoqclibSpridenPreviousController().spridenActivityDate_itemChange();
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
			
				getGoqclibSpridenPreviousController().spridenActivityDate_itemOut();
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
			
				getGoqclibSpridenPreviousController().spridenCreateDate_keyNexItem();
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
			
				getGoqclibSpridenPreviousController().spridenCreateDate_itemChange();
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
			
				getGoqclibSpridenPreviousController().spridenCreateDate_itemOut();
			}

		
	
	
}

