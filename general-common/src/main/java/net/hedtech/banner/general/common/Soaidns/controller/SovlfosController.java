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
import net.hedtech.general.common.libraries.Soqolib.model.SovlcurAdapter;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class SovlfosController extends DefaultBlockController {


	private net.hedtech.general.common.libraries.Soqolib.controller.SovlfosController getSoqolibSovlfosController() {
		return (net.hedtech.general.common.libraries.Soqolib.controller.SovlfosController) this.getTask().getTaskPart("SOQOLIB").getSupportCodeManager().getPackage("SOVLFOS");
	}	
	
	public SovlfosController(IFormController parentController, String name) 
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
		 * SOVLFOS.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void sovlfos_ClearRecord()
		{
			
				getSoqolibSovlfosController().sovlfos_ClearRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void sovlfos_KeyDupItem()
		{
			
				getSoqolibSovlfosController().sovlfos_KeyDupItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void sovlfos_TotalResults()
		{
			
				getSoqolibSovlfosController().sovlfos_TotalResults();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void sovlfos_CopyRecord()
		{
			
				getSoqolibSovlfosController().sovlfos_CopyRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void sovlfos_ExecuteQuery()
		{
			
				getSoqolibSovlfosController().sovlfos_ExecuteQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void sovlfos_DeleteRecord()
		{
			
				getSoqolibSovlfosController().sovlfos_DeleteRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void sovlfos_CreateRecord()
		{
			
				getSoqolibSovlfosController().sovlfos_CreateRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void sovlfos_keyClearBlock()
		{
			
				getSoqolibSovlfosController().sovlfos_keyClearBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void sovlfos_NextRecord()
		{
			
				getSoqolibSovlfosController().sovlfos_NextRecord();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void sovlfos_Search()
		{
			
				getSoqolibSovlfosController().sovlfos_Search();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void sovlfos_AfterQuery(RowAdapterEvent args)
		{
			
				getSoqolibSovlfosController().sovlfos_AfterQuery(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-NXTBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTBLK", function=KeyFunction.NEXT_BLOCK)
		public void sovlfos_NextBlock()
		{
			
				getSoqolibSovlfosController().sovlfos_NextBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.KEY-PRVBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVBLK", function=KeyFunction.PREVIOUS_BLOCK)
		public void sovlfos_PreviousBlock()
		{
			
				getSoqolibSovlfosController().sovlfos_PreviousBlock();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void sovlfos_blockChange()
		{
			
				getSoqolibSovlfosController().sovlfos_blockChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void sovlfos_recordChange()
		{
			
				getSoqolibSovlfosController().sovlfos_recordChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.POST-BLOCK
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="POST-BLOCK", function=KeyFunction.BLOCK_OUT)
		public void sovlfos_blockOut()
		{
			
				getSoqolibSovlfosController().sovlfos_blockOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * SOVLFOS.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void sovlfos_BeforeQuery(QueryEvent args)
		{
                
                SovlcurAdapter sovlcurElement = (SovlcurAdapter) this.getFormModel().getSovlcur().getRowAdapter();                       
				
                if(sovlcurElement!=null){
                
                ((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("SOVLCUR_PIDM", sovlcurElement.getSovlcurPidm()));             

                 
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("SOVLCUR_SEQNO", sovlcurElement.getSovlcurSeqno()));             

                }
           
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * GTVLFST_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GTVLFST_DESC", function=KeyFunction.ITEM_CHANGE)
		public void gtvlfstDesc_itemChange()
		{
			
				getSoqolibSovlfosController().gtvlfstDesc_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVMAJR_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVMAJR_DESC", function=KeyFunction.ITEM_CHANGE)
		public void stvmajrDesc_itemChange()
		{
			
				getSoqolibSovlfosController().stvmajrDesc_itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVDEPT_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVDEPT_DESC", function=KeyFunction.ITEM_CHANGE)
		public void stvdeptDesc_itemChange()
		{
			
				previousItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STVCONC_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STVCONC_DESC", function=KeyFunction.ITEM_CHANGE)
		public void stvconcDesc_itemChange()
		{
			
			previousItem();
			}

		
	
	
}

