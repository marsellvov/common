package net.hedtech.banner.student.common.Spaiden.controller;
 
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
import net.hedtech.general.common.libraries.Goqclib.model.SpremrgAdapter;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.banner.student.common.Spaiden.model.*;
import net.hedtech.banner.student.common.Spaiden.*;
import net.hedtech.banner.student.common.Spaiden.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SpremrgController extends DefaultBlockController {


	private net.hedtech.general.common.libraries.Goqclib.controller.SpremrgController getGoqclibSpremrgController() {
		return (net.hedtech.general.common.libraries.Goqclib.controller.SpremrgController) this.getTask().getTaskPart("GOQCLIB").getSupportCodeManager().getPackage("SPREMRG");
	}	
	
	public SpremrgController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public SpaidenTask getTask() {
		return (SpaidenTask)super.getTask();
	}

	public SpaidenModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
	
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void spremrg_BeforeQuery(QueryEvent args)
		{
			
			getGoqclibSpremrgController().spremrg_BeforeQuery(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void spremrg_BeforeRowInsert(RowAdapterEvent args)
		{
			
			getGoqclibSpremrgController().spremrg_BeforeRowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void spremrg_RowInsert(RowAdapterEvent args)
		{
			
			getGoqclibSpremrgController().spremrg_RowInsert(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void spremrg_BeforeRowUpdate(RowAdapterEvent args)
		{
			
			getGoqclibSpremrgController().spremrg_BeforeRowUpdate(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowUpdate
		public void spremrg_RowUpdate(RowAdapterEvent args)
		{
			
			getGoqclibSpremrgController().spremrg_RowUpdate(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG.ON-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowDelete
		public void spremrg_RowDelete(RowAdapterEvent args)
		{
			
			getGoqclibSpremrgController().spremrg_RowDelete(args);
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void spremrg_NextBlock()
		{
			
			getGoqclibSpremrgController().spremrg_NextBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG.KEY-NXTKEY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTKEY")
		public void spremrg_KeyNxtkey()
		{
			
			getGoqclibSpremrgController().spremrg_KeyNxtkey();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void spremrg_NextRecord()
		{
			
			getGoqclibSpremrgController().spremrg_NextRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG.KEY-NXTSET
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTSET")
		public void spremrg_KeyNxtset()
		{
			
			getGoqclibSpremrgController().spremrg_KeyNxtset();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void spremrg_PreviousRecord()
		{
			
			getGoqclibSpremrgController().spremrg_PreviousRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void spremrg_PreviousBlock()
		{
			
			getGoqclibSpremrgController().spremrg_PreviousBlock();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG.CALL_PHONE_FORM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CALL_PHONE_FORM")
		public void spremrg_CallPhoneForm()
		{
			
			getGoqclibSpremrgController().spremrg_CallPhoneForm();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG.CHECK_ADDRESS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_ADDRESS")
		public void spremrg_CheckAddress()
		{
			
			getGoqclibSpremrgController().spremrg_CheckAddress();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG.CHECK_ADDRESS_EXISTS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="CHECK_ADDRESS_EXISTS")
		public void spremrg_CheckAddressExists()
		{
			
			getGoqclibSpremrgController().spremrg_CheckAddressExists();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG.COPY_PHONE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="COPY_PHONE")
		public void spremrg_CopyPhone()
		{
			
			getGoqclibSpremrgController().spremrg_CopyPhone();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_RELT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPREMRG_RELT_CODE")
		public void spremrgReltCode_doubleClick()
		{
			
			getGoqclibSpremrgController().spremrgReltCode_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_RELT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPREMRG_RELT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spremrgReltCode_itemChange()
		{
			
			getGoqclibSpremrgController().spremrgReltCode_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_RELT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPREMRG_RELT_CODE")
		public void spremrgReltCode_GSearchParameters()
		{
			
			getGoqclibSpremrgController().spremrgReltCode_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_RELT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPREMRG_RELT_CODE")
		public void spremrgReltCode_GSearchOptions()
		{
			
			getGoqclibSpremrgController().spremrgReltCode_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_RELT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPREMRG_RELT_CODE", function=KeyFunction.NEXT_ITEM)
		public void spremrgReltCode_keyNexItem()
		{
			
			getGoqclibSpremrgController().spremrgReltCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_RELT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPREMRG_RELT_CODE", function=KeyFunction.ITEM_OUT)
		public void spremrgReltCode_itemOut()
		{
			
			getGoqclibSpremrgController().spremrgReltCode_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_RELT_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPREMRG_RELT_CODE")
		public void spremrgReltCode_PostChange()
		{
			
			getGoqclibSpremrgController().spremrgReltCode_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_RELT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPREMRG_RELT_CODE_LBT")
		@Before
		public void spremrgReltCodeLbt_click()
		{
			
			getGoqclibSpremrgController().spremrgReltCodeLbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * RELT_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="RELT_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void reltDescription_itemChange()
		{
			
			getGoqclibSpremrgController().reltDescription_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ATYP_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPREMRG_ATYP_CODE")
		public void spremrgAtypCode_doubleClick()
		{
			
			getGoqclibSpremrgController().spremrgAtypCode_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ATYP_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPREMRG_ATYP_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spremrgAtypCode_itemChange()
		{
			
			getGoqclibSpremrgController().spremrgAtypCode_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ATYP_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPREMRG_ATYP_CODE")
		public void spremrgAtypCode_GSearchParameters()
		{
			
			getGoqclibSpremrgController().spremrgAtypCode_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ATYP_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPREMRG_ATYP_CODE", function=KeyFunction.NEXT_ITEM)
		public void spremrgAtypCode_keyNexItem()
		{
			
			getGoqclibSpremrgController().spremrgAtypCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ATYP_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPREMRG_ATYP_CODE", function=KeyFunction.ITEM_OUT)
		public void spremrgAtypCode_itemOut()
		{
			
			getGoqclibSpremrgController().spremrgAtypCode_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ATYP_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPREMRG_ATYP_CODE")
		public void spremrgAtypCode_GSearchOptions()
		{
			
			getGoqclibSpremrgController().spremrgAtypCode_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ATYP_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPREMRG_ATYP_CODE")
		public void spremrgAtypCode_PostChange()
		{
			
			getGoqclibSpremrgController().spremrgAtypCode_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ATYP_CODE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="SPREMRG_ATYP_CODE", function=KeyFunction.COUNT_QUERY)
		public void spremrgAtypCode_TotalResults()
		{
			
			getGoqclibSpremrgController().spremrgAtypCode_TotalResults();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ATYP_CODE.RESET_RECORD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="RESET_RECORD", item="SPREMRG_ATYP_CODE")
		public void spremrgAtypCode_ResetRecord()
		{
			
			getGoqclibSpremrgController().spremrgAtypCode_ResetRecord();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ATYP_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPREMRG_ATYP_CODE_LBT")
		@Before
		public void spremrgAtypCodeLbt_click()
		{
			
			getGoqclibSpremrgController().spremrgAtypCodeLbt_click();
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
			
			getGoqclibSpremrgController().atypDescription_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_STAT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPREMRG_STAT_CODE")
		public void spremrgStatCode_doubleClick()
		{
			
			getGoqclibSpremrgController().spremrgStatCode_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_STAT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPREMRG_STAT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spremrgStatCode_itemChange()
		{
			
			getGoqclibSpremrgController().spremrgStatCode_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_STAT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPREMRG_STAT_CODE")
		public void spremrgStatCode_GSearchParameters()
		{
			
			getGoqclibSpremrgController().spremrgStatCode_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_STAT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPREMRG_STAT_CODE")
		public void spremrgStatCode_GSearchOptions()
		{
			
			getGoqclibSpremrgController().spremrgStatCode_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_STAT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPREMRG_STAT_CODE", function=KeyFunction.NEXT_ITEM)
		public void spremrgStatCode_keyNexItem()
		{
			
			getGoqclibSpremrgController().spremrgStatCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_STAT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPREMRG_STAT_CODE", function=KeyFunction.ITEM_OUT)
		public void spremrgStatCode_itemOut()
		{
			
			getGoqclibSpremrgController().spremrgStatCode_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_STAT_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPREMRG_STAT_CODE")
		public void spremrgStatCode_PostChange()
		{
			
			getGoqclibSpremrgController().spremrgStatCode_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_STAT_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPREMRG_STAT_CODE_LBT")
		@Before
		public void spremrgStatCodeLbt_click()
		{
			
			getGoqclibSpremrgController().spremrgStatCodeLbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STATE_DESCRIPTION.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STATE_DESCRIPTION", function=KeyFunction.ITEM_CHANGE)
		public void stateDescription_itemChange()
		{
			
			getGoqclibSpremrgController().stateDescription_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ZIP.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPREMRG_ZIP")
		public void spremrgZip_doubleClick()
		{
			
			getGoqclibSpremrgController().spremrgZip_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ZIP.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPREMRG_ZIP", function=KeyFunction.ITEM_CHANGE)
		public void spremrgZip_itemChange()
		{
			
			getGoqclibSpremrgController().spremrgZip_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ZIP.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPREMRG_ZIP")
		public void spremrgZip_GSearchParameters()
		{
			
			getGoqclibSpremrgController().spremrgZip_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ZIP.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPREMRG_ZIP")
		public void spremrgZip_GSearchOptions()
		{
			
			getGoqclibSpremrgController().spremrgZip_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ZIP.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPREMRG_ZIP", function=KeyFunction.ITEM_OUT)
		public void spremrgZip_itemOut()
		{
			
			getGoqclibSpremrgController().spremrgZip_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ZIP.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="SPREMRG_ZIP", function=KeyFunction.LIST_VALUES)
		public void spremrgZip_ListValues()
		{
			
			getGoqclibSpremrgController().spremrgZip_ListValues();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ZIP.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPREMRG_ZIP", function=KeyFunction.NEXT_ITEM)
		public void spremrgZip_keyNexItem()
		{
			
			getGoqclibSpremrgController().spremrgZip_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ZIP.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="SPREMRG_ZIP", function=KeyFunction.PREVIOUS_ITEM)
		public void spremrgZip_PreviousItem()
		{
			
			getGoqclibSpremrgController().spremrgZip_PreviousItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ZIP.ADDR_DEFAULT_NXTFLD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="ADDR_DEFAULT_NXTFLD", item="SPREMRG_ZIP")
		public void spremrgZip_AddrDefaultNxtfld()
		{
			
			getGoqclibSpremrgController().spremrgZip_AddrDefaultNxtfld();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ZIP_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPREMRG_ZIP_LBT")
		@Before
		public void spremrgZipLbt_click()
		{
			
			getGoqclibSpremrgController().spremrgZipLbt_click();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_NATN_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="SPREMRG_NATN_CODE")
		public void spremrgNatnCode_doubleClick()
		{
			
			getGoqclibSpremrgController().spremrgNatnCode_doubleClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_NATN_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPREMRG_NATN_CODE", function=KeyFunction.ITEM_CHANGE)
		public void spremrgNatnCode_itemChange()
		{
			
			getGoqclibSpremrgController().spremrgNatnCode_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_NATN_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="SPREMRG_NATN_CODE")
		public void spremrgNatnCode_GSearchOptions()
		{
			
			getGoqclibSpremrgController().spremrgNatnCode_GSearchOptions();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_NATN_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPREMRG_NATN_CODE", function=KeyFunction.NEXT_ITEM)
		public void spremrgNatnCode_keyNexItem()
		{
			
			getGoqclibSpremrgController().spremrgNatnCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_NATN_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="SPREMRG_NATN_CODE")
		public void spremrgNatnCode_GSearchParameters()
		{
			
			getGoqclibSpremrgController().spremrgNatnCode_GSearchParameters();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_NATN_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPREMRG_NATN_CODE", function=KeyFunction.ITEM_OUT)
		public void spremrgNatnCode_itemOut()
		{
			
			getGoqclibSpremrgController().spremrgNatnCode_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_NATN_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="SPREMRG_NATN_CODE")
		public void spremrgNatnCode_PostChange()
		{
			
			getGoqclibSpremrgController().spremrgNatnCode_PostChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_NATN_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="SPREMRG_NATN_CODE_LBT")
		@Before
		public void spremrgNatnCodeLbt_click()
		{
			
			getGoqclibSpremrgController().spremrgNatnCodeLbt_click();
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
			
			getGoqclibSpremrgController().natnDescription_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_CTRY_CODE_PHONE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="SPREMRG_CTRY_CODE_PHONE", function=KeyFunction.COUNT_QUERY)
		public void spremrgCtryCodePhone_TotalResults()
		{
			
			getGoqclibSpremrgController().spremrgCtryCodePhone_TotalResults();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_PHONE_AREA.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="SPREMRG_PHONE_AREA", function=KeyFunction.COUNT_QUERY)
		public void spremrgPhoneArea_TotalResults()
		{
			
			getGoqclibSpremrgController().spremrgPhoneArea_TotalResults();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_PHONE_NUMBER.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="SPREMRG_PHONE_NUMBER", function=KeyFunction.COUNT_QUERY)
		public void spremrgPhoneNumber_TotalResults()
		{
			
			getGoqclibSpremrgController().spremrgPhoneNumber_TotalResults();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_PHONE_EXT.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="SPREMRG_PHONE_EXT", function=KeyFunction.COUNT_QUERY)
		public void spremrgPhoneExt_TotalResults()
		{
			
			getGoqclibSpremrgController().spremrgPhoneExt_TotalResults();
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
		@Before
		public void phoneBtn_click()
		{
			
			getGoqclibSpremrgController().phoneBtn_click();
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
			
			getGoqclibSpremrgController().phoneBtn_buttonClick();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="SPREMRG_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void spremrgActivityDate_keyNexItem()
		{
			
			getGoqclibSpremrgController().spremrgActivityDate_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SPREMRG_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void spremrgActivityDate_itemChange()
		{
			
			getGoqclibSpremrgController().spremrgActivityDate_itemChange();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="SPREMRG_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void spremrgActivityDate_itemOut()
		{
			
			getGoqclibSpremrgController().spremrgActivityDate_itemOut();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_RELT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPREMRG_RELT_CODE")
		public void spremrgReltCode_validate()
		{
			

			SpremrgAdapter spremrgElement = (SpremrgAdapter)this.getFormModel().getSpremrg().getRowAdapter(true);
			if(spremrgElement.getSpremrgReltCode().isNotNull())
			this.spremrgReltCode_PostChange();

		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void spremrg_AfterQuery(RowAdapterEvent args)
		{
			

				SpremrgAdapter spremrgElement = (SpremrgAdapter)args.getRow();
				try
				{
					spremrgElement.setLockDbValues(true);
					try{
						this.spremrgReltCode_PostChange();

					} catch (Exception ex) { }
					try{
						this.spremrgAtypCode_PostChange();

					} catch (Exception ex) { }
					try{
						this.spremrgStatCode_PostChange();

					} catch (Exception ex) { }
					try{
						this.spremrgNatnCode_PostChange();

					} catch (Exception ex) { }

				} finally { 
					spremrgElement.setLockDbValues(false);
				}
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_ATYP_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPREMRG_ATYP_CODE")
		public void spremrgAtypCode_validate()
		{
			

			SpremrgAdapter spremrgElement = (SpremrgAdapter)this.getFormModel().getSpremrg().getRowAdapter(true);
			if(spremrgElement.getSpremrgAtypCode().isNotNull())
			this.spremrgAtypCode_PostChange();

		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_STAT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPREMRG_STAT_CODE")
		public void spremrgStatCode_validate()
		{
			

			SpremrgAdapter spremrgElement = (SpremrgAdapter)this.getFormModel().getSpremrg().getRowAdapter(true);
			if(spremrgElement.getSpremrgStatCode().isNotNull())
			this.spremrgStatCode_PostChange();

		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SPREMRG_NATN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="SPREMRG_NATN_CODE")
		public void spremrgNatnCode_validate()
		{
			

			SpremrgAdapter spremrgElement = (SpremrgAdapter)this.getFormModel().getSpremrg().getRowAdapter(true);
			if(spremrgElement.getSpremrgNatnCode().isNotNull())
			this.spremrgNatnCode_PostChange();

		}

		
	
	
}

