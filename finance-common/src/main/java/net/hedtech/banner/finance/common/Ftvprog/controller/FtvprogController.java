package net.hedtech.banner.finance.common.Ftvprog.controller;
 
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
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.finance.common.Ftvprog.model.*;
import net.hedtech.banner.finance.common.Ftvprog.*;
import net.hedtech.banner.finance.common.Ftvprog.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FtvprogController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public FtvprogController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FtvprogTask getTask() {
		return (FtvprogTask)super.getTask();
	}

	public FtvprogModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER FTVPROG.PRE-QUERY
		   :hold_coas_code := :global.coas_code ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVPROG.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void ftvprog_BeforeQuery(QueryEvent args)
		{
			
				getFormModel().getFormHeader().setHoldCoasCode(getGlobal("COAS_CODE"));
				
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("HOLD_COAS_CODE", this.getFormModel().getFormHeader().getHoldCoasCode()));             


                FtvprogAdapter ftvprogElement = (FtvprogAdapter) this.getFormModel().getFtvprog().getRowAdapter();      
				if(ftvprogElement!=null){

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("FTVPROG_COAS_CODE", ftvprogElement.getFtvprogCoasCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("FTVPROG_DATA_ENTRY_IND", ftvprogElement.getFtvprogDataEntryInd()));             
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FTVPROG.KEY-EXEQRY
		 SET_BLOCK_PROPERTY('FTVPROG',DEFAULT_WHERE,
	'where (ftvprog_coas_code = :hold_coas_code 
	 or ftvprog_coas_code = :ftvprog_coas_code)');
EXECUTE_QUERY;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVPROG.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void ftvprog_ExecuteQuery()
		{
			
//				setBlockWhereClause("FTVPROG", "where (ftvprog_coas_code = :hold_coas_code \n	 or ftvprog_coas_code = :ftvprog_coas_code)");
				FtvprogAdapter ftvprogElement = (FtvprogAdapter) this.getFormModel().getFtvprog().getRowAdapter(); 
				if (ftvprogElement != null && ftvprogElement.getFtvprogCoasCode().isNotNull())
					setBlockWhereClause("FTVPROG", "");
				else
					setBlockWhereClause("FTVPROG", "WHERE (ftvprog_coas_code = NVL(:HOLD_COAS_CODE, ftvprog_coas_code))");
				executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVPROG_EFF_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVPROG_EFF_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftvprogEffDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVPROG_EFF_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVPROG_EFF_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftvprogEffDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVPROG_EFF_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVPROG_EFF_DATE", function=KeyFunction.ITEM_OUT)
		public void ftvprogEffDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVPROG_TERM_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVPROG_TERM_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftvprogTermDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVPROG_TERM_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVPROG_TERM_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftvprogTermDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVPROG_TERM_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVPROG_TERM_DATE", function=KeyFunction.ITEM_OUT)
		public void ftvprogTermDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVPROG_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVPROG_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftvprogActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVPROG_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVPROG_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftvprogActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVPROG_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVPROG_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void ftvprogActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
	
	
}

