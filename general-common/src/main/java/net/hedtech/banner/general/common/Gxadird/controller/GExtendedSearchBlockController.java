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

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class GExtendedSearchBlockController extends DefaultBlockController {


	private net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController getGoqolibGExtendedSearchBlockController() {
		return (net.hedtech.general.common.libraries.Goqolib.controller.GExtendedSearchBlockController) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_EXTENDED_SEARCH_BLOCK");
	}	
	
	public GExtendedSearchBlockController(IFormController parentController, String name) 
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

	@ActionTrigger(action="LIST_VALUES", item="IDNAME_EXTSEARCH_LIST", function=KeyFunction.LIST_VALUES)
	public void idExtSearchList(){
		getGoqolibGExtendedSearchBlockController().idExtSearchList();
	}

	@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="IDNAME_EXTSEARCH_BTN")
	public void idExtSearchListBtn_WhenButtonPressed(){
	getGoqolibGExtendedSearchBlockController().idExtSearchListBtn_WhenButtonPressed();

	}
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.PRE-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-BLOCK", function=KeyFunction.BLOCK_IN)
		public void gExtendedSearchBlock_blockIn()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_blockIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void gExtendedSearchBlock_blockOut()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void gExtendedSearchBlock_blockChange()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", function=KeyFunction.ITEM_CHANGE)
		public void gExtendedSearchBlock_itemChange()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED")
		public void gExtendedSearchBlock_buttonClick()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void gExtendedSearchBlock_keyClearBlock()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_keyClearBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void gExtendedSearchBlock_ClearRecord()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_ClearRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void gExtendedSearchBlock_Save()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_Save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void gExtendedSearchBlock_TotalResults()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_TotalResults();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void gExtendedSearchBlock_CreateRecord()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_CreateRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void gExtendedSearchBlock_DeleteRecord()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_DeleteRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void gExtendedSearchBlock_MoveDown()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_MoveDown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void gExtendedSearchBlock_KeyDupItem()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_KeyDupItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void gExtendedSearchBlock_CopyRecord()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_CopyRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void gExtendedSearchBlock_Search()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_Search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void gExtendedSearchBlock_ExecuteQuery()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_ExecuteQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-EXIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXIT", function=KeyFunction.EXIT)
		public void gExtendedSearchBlock_Exit()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_Exit();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-F0
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-F0", function=KeyFunction.KEY_F0)
		public void gExtendedSearchBlock_F0()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_F0();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-MENU
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-MENU")
		public void gExtendedSearchBlock_KeyMenu()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_KeyMenu();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void gExtendedSearchBlock_NextBlock()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_NextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTKEY")
		public void gExtendedSearchBlock_KeyNxtkey()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_KeyNxtkey();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET")
		public void gExtendedSearchBlock_KeyNxtset()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_KeyNxtset();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void gExtendedSearchBlock_NextRecord()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_NextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void gExtendedSearchBlock_PreviousBlock()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_PreviousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void gExtendedSearchBlock_PreviousRecord()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_PreviousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-SCRDOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-SCRDOWN")
		public void gExtendedSearchBlock_KeyScrdown()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_KeyScrdown();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-SCRUP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-SCRUP")
		public void gExtendedSearchBlock_KeyScrup()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_KeyScrup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-UP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void gExtendedSearchBlock_MoveUp()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_MoveUp();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * G$_EXTENDED_SEARCH_BLOCK.KEY-UPDREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UPDREC")
		public void gExtendedSearchBlock_KeyUpdrec()
		{
			
				getGoqolibGExtendedSearchBlockController().gExtendedSearchBlock_KeyUpdrec();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * IDNAME_EXTSEARCH_LIST.WHEN-LIST-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-LIST-CHANGED", item="IDNAME_EXTSEARCH_LIST")
		public void idnameExtsearchList_listChange()
		{
			
				getGoqolibGExtendedSearchBlockController().idnameExtsearchList_listChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * IDNAME_EXTSEARCH_LIST.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="IDNAME_EXTSEARCH_LIST", function=KeyFunction.PREVIOUS_ITEM)
		public void idnameExtsearchList_PreviousItem()
		{
			
				getGoqolibGExtendedSearchBlockController().idnameExtsearchList_PreviousItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERSON_DETAIL_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="PERSON_DETAIL_BTN")
		public void personDetailBtn_click()
		{
			
				getGoqolibGExtendedSearchBlockController().personDetailBtn_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PERSON_DETAIL_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="PERSON_DETAIL_BTN")
		public void personDetailBtn_buttonClick()
		{
			
				getGoqolibGExtendedSearchBlockController().personDetailBtn_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NPERSON_DETAIL_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="NPERSON_DETAIL_BTN")
		public void npersonDetailBtn_click()
		{
			
				getGoqolibGExtendedSearchBlockController().npersonDetailBtn_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NPERSON_DETAIL_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="NPERSON_DETAIL_BTN")
		public void npersonDetailBtn_buttonClick()
		{
			
				getGoqolibGExtendedSearchBlockController().npersonDetailBtn_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SEARCH_GROUP.WHEN-RADIO-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-RADIO-CHANGED", item="SEARCH_GROUP")
		public void searchGroup_radioGroupChange()
		{
			
				getGoqolibGExtendedSearchBlockController().searchGroup_radioGroupChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_STAT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SR_SPRADDR_STAT_CODE")
		public void srSpraddrStatCode_doubleClick()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpraddrStatCodeBtn_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_STAT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SR_SPRADDR_STAT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void srSpraddrStatCode_itemChange()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpraddrStatCode_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_STAT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS" , item = "SR_SPRADDR_STAT_CODE")
		public void srSpraddrStatCode_GSearchParameters()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpraddrStatCode_GSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_STAT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item = "SR_SPRADDR_STAT_CODE")
		public void srSpraddrStatCode_GSearchOptions()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpraddrStatCode_GSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_STAT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SR_SPRADDR_STAT_CODE", function=KeyFunction.NEXT_ITEM)
		public void srSpraddrStatCode_keyNexItem()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpraddrStatCode_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_STAT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SR_SPRADDR_STAT_CODE", function=KeyFunction.ITEM_OUT)
		public void srSpraddrStatCode_itemOut()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpraddrStatCode_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_ZIP.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SR_SPRADDR_ZIP", function=KeyFunction.LIST_VALUES)
		public void srSpraddrZip_ListValues()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpraddrZip_ListValues();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRIDEN_NTYP_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SR_SPRIDEN_NTYP_CODE")
		public void srSpridenNtypCode_doubleClick()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpridenNtypCodeBtn_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRIDEN_NTYP_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SR_SPRIDEN_NTYP_CODE", function=KeyFunction.ITEM_CHANGE)
		public void srSpridenNtypCode_itemChange()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpridenNtypCode_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRIDEN_NTYP_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item = "SR_SPRIDEN_NTYP_CODE")
		public void srSpridenNtypCode_GSearchParameters()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpridenNtypCode_GSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRIDEN_NTYP_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item = "SR_SPRIDEN_NTYP_CODE")
		public void srSpridenNtypCode_GSearchOptions()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpridenNtypCode_GSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRIDEN_NTYP_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SR_SPRIDEN_NTYP_CODE", function=KeyFunction.NEXT_ITEM)
		public void srSpridenNtypCode_keyNexItem()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpridenNtypCode_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRIDEN_NTYP_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SR_SPRIDEN_NTYP_CODE", function=KeyFunction.ITEM_OUT)
		public void srSpridenNtypCode_itemOut()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpridenNtypCode_itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPBPERS_SSN.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SR_SPBPERS_SSN", function=KeyFunction.ITEM_CHANGE)
		public void srSpbpersSsn_itemChange()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpbpersSsn_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPBPERS_BIRTH_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SR_SPBPERS_BIRTH_DATE", function=KeyFunction.NEXT_ITEM)
		public void srSpbpersBirthDate_keyNexItem()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpbpersBirthDate_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPBPERS_BIRTH_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SR_SPBPERS_BIRTH_DATE")
		public void srSpbpersBirthDate_PostChange()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpbpersBirthDate_PostChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPBPERS_SEX.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SR_SPBPERS_SEX")
		public void srSpbpersSex_validate()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpbpersSex_validate();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPBPERS_SEX.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SR_SPBPERS_SEX", function=KeyFunction.NEXT_ITEM)
		public void srSpbpersSex_keyNexItem()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpbpersSex_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_ZIP_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SR_SPRADDR_ZIP_BTN")
		public void srSpraddrZipBtn_click()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpraddrZipBtn_click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_ZIP_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SR_SPRADDR_ZIP_BTN")
		public void srSpraddrZipBtn_buttonClick()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpraddrZipBtn_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_STAT_CODE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SR_SPRADDR_STAT_CODE_BTN")
		public void srSpraddrStatCodeBtn_click()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpraddrStatCodeBtn_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRADDR_STAT_CODE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SR_SPRADDR_STAT_CODE_BTN")
		public void srSpraddrStatCodeBtn_buttonClick()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpraddrStatCodeBtn_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRIDEN_NTYP_CODE_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SR_SPRIDEN_NTYP_CODE_BTN")
		public void srSpridenNtypCodeBtn_click()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpridenNtypCodeBtn_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPRIDEN_NTYP_CODE_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="SR_SPRIDEN_NTYP_CODE_BTN")
		public void srSpridenNtypCodeBtn_buttonClick()
		{
			
				getGoqolibGExtendedSearchBlockController().srSpridenNtypCodeBtn_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NARROW_SEARCH_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="NARROW_SEARCH_BTN")
		public void narrowSearchBtn_click()
		{
			
				getGoqolibGExtendedSearchBlockController().narrowSearchBtn_click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * NARROW_SEARCH_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="NARROW_SEARCH_BTN")
		public void narrowSearchBtn_buttonClick()
		{
			
				getGoqolibGExtendedSearchBlockController().narrowSearchBtn_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EXTSEARCH_CLEAR_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="EXTSEARCH_CLEAR_BTN")
		public void extsearchClearBtn_click()
		{
			
				getGoqolibGExtendedSearchBlockController().extsearchClearBtn_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EXTSEARCH_CLEAR_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="EXTSEARCH_CLEAR_BTN")
		public void extsearchClearBtn_buttonClick()
		{
			
				getGoqolibGExtendedSearchBlockController().extsearchClearBtn_buttonClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SR_SPBPERS_BIRTH_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SR_SPBPERS_BIRTH_DATE")
		public void srSpbpersBirthDate_validate()
		{
			

							this.srSpbpersBirthDate_PostChange();

			}

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="CANCEL_BTN")
		public void cancelBtn_buttonClick()
		{
			
			goBlock("KEY_BLOCK");
				getTask().getGoqrpls().gCheckFailure();
			}
	
	
}

