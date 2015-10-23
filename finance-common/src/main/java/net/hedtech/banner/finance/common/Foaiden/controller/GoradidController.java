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

public class GoradidController extends DefaultBlockController {


	private net.hedtech.general.common.libraries.Goqclib.controller.GoradidController getGoqclibGoradidController() {
		return (net.hedtech.general.common.libraries.Goqclib.controller.GoradidController) this.getTask().getTaskPart("GOQCLIB").getSupportCodeManager().getPackage("GORADID");
	}	
	
	public GoradidController(IFormController parentController, String name) 
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
		 * GORADID.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void goradid_blockChange()
		{
			
				getGoqclibGoradidController().goradid_blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void goradid_AfterQuery(RowAdapterEvent args)
		{
			
				getGoqclibGoradidController().goradid_AfterQuery(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void goradid_blockOut()
		{
			
				getGoqclibGoradidController().goradid_blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void goradid_BeforeRowInsert(RowAdapterEvent args)
		{
			
				getGoqclibGoradidController().goradid_BeforeRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void goradid_RowInsert(RowAdapterEvent args)
		{
			
				getGoqclibGoradidController().goradid_RowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.POST-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowInsert
		public void goradid_AfterRowInsert(RowAdapterEvent args)
		{
			
				getGoqclibGoradidController().goradid_AfterRowInsert(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void goradid_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				getGoqclibGoradidController().goradid_BeforeRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowUpdate
		public void goradid_RowUpdate(RowAdapterEvent args)
		{
			
				getGoqclibGoradidController().goradid_RowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.POST-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowUpdate
		public void goradid_AfterRowUpdate(RowAdapterEvent args)
		{
			
				getGoqclibGoradidController().goradid_AfterRowUpdate(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.ON-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowDelete
		public void goradid_RowDelete(RowAdapterEvent args)
		{
			
				getGoqclibGoradidController().goradid_RowDelete(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void goradid_Save()
		{
			
				getGoqclibGoradidController().goradid_Save();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void goradid_NextBlock()
		{
			
				getGoqclibGoradidController().goradid_NextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void goradid_PreviousBlock()
		{
			
				getGoqclibGoradidController().goradid_PreviousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.DISABLE_KEYS
		 *
		 *
		 *</p>
		*/

		@Before
		@ActionTrigger(action="DISABLE_KEYS")
		public void goradid_DisableKeys()
		{
			
				getGoqclibGoradidController().goradid_DisableKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.ENABLE_KEYS
		 *
		 *
		 *</p>
		*/

		@Before
		@ActionTrigger(action="ENABLE_KEYS")
		public void goradid_EnableKeys()
		{
			
				getGoqclibGoradidController().goradid_EnableKeys();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.PRE_COMMIT_VALIDATE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE_COMMIT_VALIDATE")
		public void goradid_PreCommitValidate()
		{
			
				getGoqclibGoradidController().goradid_PreCommitValidate();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void goradid_BeforeQuery(QueryEvent args)
		{
			

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("PIDM", this.getFormModel().getKeyBlock().getPidm()));             


           
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID_ADID_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="GORADID_ADID_CODE")
		public void goradidAdidCode_doubleClick()
		{
				getGoqclibGoradidController().goradidAdidCode_doubleClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID_ADID_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GORADID_ADID_CODE", function=KeyFunction.ITEM_CHANGE)
		public void goradidAdidCode_itemChange()
		{
				getGoqclibGoradidController().goradidAdidCode_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID_ADID_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="GORADID_ADID_CODE")
		public void goradidAdidCode_GSearchParameters()
		{
				getGoqclibGoradidController().goradidAdidCode_GSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID_ADID_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="GORADID_ADID_CODE")
		public void goradidAdidCode_GSearchOptions()
		{
				getGoqclibGoradidController().goradidAdidCode_GSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID_ADID_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GORADID_ADID_CODE", function=KeyFunction.NEXT_ITEM)
		public void goradidAdidCode_keyNexItem()
		{
			getGoqclibGoradidController().goradidAdidCode_keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID_ADID_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GORADID_ADID_CODE", function=KeyFunction.ITEM_OUT)
		public void goradidAdidCode_itemOut()
		{
				getTask().getGoqrpls().getGSearch().postTextCode();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID_ADID_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GORADID_ADID_CODE")
		public void goradidAdidCode_validate()
		{
			
				getGoqclibGoradidController().goradidAdidCode_validate();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID_ADID_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="GORADID_ADID_CODE_LBT")
		public void goradidAdidCodeLbt_click()
		{
				getGoqclibGoradidController().goradidAdidCodeLbt_click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ADID_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ADID_DESC", function=KeyFunction.ITEM_CHANGE)
		public void adidDesc_itemChange()
		{
				getGoqclibGoradidController().adidDesc_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID_ADDITIONAL_ID.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="GORADID_ADDITIONAL_ID")
		public void goradidAdditionalId_validate()
		{
			
				getGoqclibGoradidController().goradidAdditionalId_validate();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="GORADID_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void goradidActivityDate_keyNexItem()
		{
			
				getGoqclibGoradidController().goradidActivityDate_keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GORADID_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void goradidActivityDate_itemChange()
		{
			
				getGoqclibGoradidController().goradidActivityDate_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GORADID_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="GORADID_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void goradidActivityDate_itemOut()
		{
			
				getGoqclibGoradidController().goradidActivityDate_itemOut();
			}

		
	
	
}

