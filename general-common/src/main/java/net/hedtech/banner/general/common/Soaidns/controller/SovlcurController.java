package net.hedtech.banner.general.common.Soaidns.controller;
 
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
import net.hedtech.general.common.libraries.Soqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.general.common.Soaidns.model.*;
import net.hedtech.banner.general.common.Soaidns.*;
import net.hedtech.banner.general.common.Soaidns.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SovlcurController extends DefaultBlockController {


	private net.hedtech.general.common.libraries.Soqolib.controller.SovlcurController getSoqolibSovlcurController() {
		return (net.hedtech.general.common.libraries.Soqolib.controller.SovlcurController) this.getTask().getTaskPart("SOQOLIB").getSupportCodeManager().getPackage("SOVLCUR");
	}	
	
	public SovlcurController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public SoaidnsTask getTask() {
		return (SoaidnsTask)super.getTask();
	}

	public SoaidnsModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void sovlcur_Search()
		{
			
				getSoqolibSovlcurController().sovlcur_Search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void sovlcur_keyClearBlock()
		{
			
				getSoqolibSovlcurController().sovlcur_keyClearBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void sovlcur_ClearRecord()
		{
			
				getSoqolibSovlcurController().sovlcur_ClearRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void sovlcur_KeyDupItem()
		{
			
				getSoqolibSovlcurController().sovlcur_KeyDupItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void sovlcur_CreateRecord()
		{
			
				getSoqolibSovlcurController().sovlcur_CreateRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void sovlcur_DeleteRecord()
		{
			
				getSoqolibSovlcurController().sovlcur_DeleteRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void sovlcur_TotalResults()
		{
			
				getSoqolibSovlcurController().sovlcur_TotalResults();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void sovlcur_ExecuteQuery()
		{
			
				getSoqolibSovlcurController().sovlcur_ExecuteQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEYEXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEYEXEQRY")
		public void sovlcur_Keyexeqry()
		{
			
				getSoqolibSovlcurController().sovlcur_Keyexeqry();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void sovlcur_NextBlock()
		{
			
				getSoqolibSovlcurController().sovlcur_NextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void sovlcur_NextRecord()
		{
			
				getSoqolibSovlcurController().sovlcur_NextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void sovlcur_PreviousRecord()
		{
			
				getSoqolibSovlcurController().sovlcur_PreviousRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void sovlcur_PreviousBlock()
		{
			
				getSoqolibSovlcurController().sovlcur_PreviousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void sovlcur_CopyRecord()
		{
			
				getSoqolibSovlcurController().sovlcur_CopyRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.ON-POPULATE-DETAILS
		 *
		 *
		 *</p>
		 * @param args
		*/

		//@PopulateDetails
		public void sovlcur_PopulateDetails(RowAdapterEvent args)
		{
			
				getSoqolibSovlcurController().sovlcur_PopulateDetails(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void sovlcur_recordChange()
		{
			
				getSoqolibSovlcurController().sovlcur_recordChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void sovlcur_AfterQuery(RowAdapterEvent args)
		{
			
				getSoqolibSovlcurController().sovlcur_AfterQuery(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void sovlcur_blockChange()
		{
			
				getSoqolibSovlcurController().sovlcur_blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.PRIMARY_CURRICULUM_DISPLAY
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="PRIMARY_CURRICULUM_DISPLAY")
		public void sovlcur_PrimaryCurriculumDisplay()
		{
			
				getSoqolibSovlcurController().sovlcur_PrimaryCurriculumDisplay();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.PRIMARY_CURRICULUM_SETUP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRIMARY_CURRICULUM_SETUP")
		public void sovlcur_PrimaryCurriculumSetup()
		{
			
				getSoqolibSovlcurController().sovlcur_PrimaryCurriculumSetup();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void sovlcur_BeforeQuery(QueryEvent args)
		{
			
               

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("S___CURRICULA_SUMMARY_SUMMARY_CODE", this.getFormModel().getSCurriculaSummary().getSummaryCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("S___CURRICULA_SUMMARY_SUMMARY_KEY_SEQNO", this.getFormModel().getSCurriculaSummary().getSummaryKeySeqno()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("S___CURRICULA_SUMMARY_SUMMARY_TERM_CODE", this.getFormModel().getSCurriculaSummary().getSummaryTermCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("S___CURRICULA_SUMMARY_SUMMARY_END_TERM", this.getFormModel().getSCurriculaSummary().getSummaryEndTerm()));             


           
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR_PROGRAM_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SOVLCUR_PROGRAM_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sovlcurProgramDesc_itemChange()
		{
			
				getSoqolibSovlcurController().sovlcurProgramDesc_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVLEVL_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVLEVL_DESC", function=KeyFunction.ITEM_CHANGE)
		public void stvlevlDesc_itemChange()
		{
			
				previousItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVCAMP_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVCAMP_DESC", function=KeyFunction.ITEM_CHANGE)
		public void stvcampDesc_itemChange()
		{
			
			previousItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVCOLL_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVCOLL_DESC", function=KeyFunction.ITEM_CHANGE)
		public void stvcollDesc_itemChange()
		{
			
			previousItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEGC_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVDEGC_DESC", function=KeyFunction.ITEM_CHANGE)
		public void stvdegcDesc_itemChange()
		{
			
				getSoqolibSovlcurController().stvdegcDesc_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR_STVSTYP_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SOVLCUR_STVSTYP_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sovlcurStvstypDesc_itemChange()
		{
			
				getSoqolibSovlcurController().sovlcurStvstypDesc_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR_STVRATE_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SOVLCUR_STVRATE_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sovlcurStvrateDesc_itemChange()
		{
			
				getSoqolibSovlcurController().sovlcurStvrateDesc_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PRIMARY_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PRIMARY_DESC", function=KeyFunction.ITEM_CHANGE)
		public void primaryDesc_itemChange()
		{
			
				getSoqolibSovlcurController().primaryDesc_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR_LMOD_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SOVLCUR_LMOD_CODE", function=KeyFunction.ITEM_CHANGE)
		public void sovlcurLmodCode_itemChange()
		{
			
				getSoqolibSovlcurController().sovlcurLmodCode_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLCUR_LMOD_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="SOVLCUR_LMOD_DESC", function=KeyFunction.ITEM_CHANGE)
		public void sovlcurLmodDesc_itemChange()
		{
			
				getSoqolibSovlcurController().sovlcurLmodDesc_itemChange();
			}

		
	
	
}

