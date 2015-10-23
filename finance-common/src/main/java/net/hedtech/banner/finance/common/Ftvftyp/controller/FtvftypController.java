package net.hedtech.banner.finance.common.Ftvftyp.controller;
 
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
import net.hedtech.banner.finance.common.Ftvftyp.model.*;
import net.hedtech.banner.finance.common.Ftvftyp.*;
import net.hedtech.banner.finance.common.Ftvftyp.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FtvftypController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public FtvftypController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FtvftypTask getTask() {
		return (FtvftypTask)super.getTask();
	}

	public FtvftypModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER FTVFTYP.PRE-QUERY
		   :hold_coas_code := :global.coas_code ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFTYP.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void ftvftyp_BeforeQuery(QueryEvent args)
		{
			

				getFormModel().getFormHeader().setHoldCoasCode(getGlobal("COAS_CODE"));			
			
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("HOLD_COAS_CODE", this.getFormModel().getFormHeader().getHoldCoasCode()));             

                FtvftypAdapter ftvftypElement = (FtvftypAdapter) this.getFormModel().getFtvftyp().getRowAdapter();    
				if(ftvftypElement!=null){
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("FTVFTYP_COAS_CODE", ftvftypElement.getFtvftypCoasCode()));             
				}
		}
		
		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void ftvftyp_ExecuteQuery()
		{
			
				FtvftypAdapter ftvftypElement = (FtvftypAdapter) this.getFormModel().getFtvftyp().getRowAdapter();
				if (ftvftypElement != null && ftvftypElement.getFtvftypCoasCode().isNotNull())
					setBlockWhereClause("FTVFTYP", "");
				else
					setBlockWhereClause("FTVFTYP", "WHERE (ftvftyp_coas_code = NVL(:HOLD_COAS_CODE, ftvftyp_coas_code))");
				executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFTYP_EFF_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVFTYP_EFF_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftvftypEffDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFTYP_EFF_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVFTYP_EFF_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftvftypEffDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFTYP_EFF_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVFTYP_EFF_DATE", function=KeyFunction.ITEM_OUT)
		public void ftvftypEffDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFTYP_TERM_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVFTYP_TERM_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftvftypTermDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFTYP_TERM_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVFTYP_TERM_DATE", function=KeyFunction.ITEM_OUT)
		public void ftvftypTermDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFTYP_TERM_DATE.POST-CHANGE
		    G$_DATE_REFORMAT ('','') ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFTYP_TERM_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FTVFTYP_TERM_DATE")
		public void ftvftypTermDate_PostChange()
		{
			

				FtvftypAdapter ftvftypElement = (FtvftypAdapter)this.getFormModel().getFtvftyp().getRowAdapter(true);

				if(ftvftypElement!=null){

				if(ftvftypElement.getFtvftypTermDate().isNull())
		return;
				}

			}

		
		/* Original PL/SQL code code for TRIGGER FTVFTYP_TERM_DATE.KEY-NEXT-ITEM
		    G$_DATE_REFORMAT ('','') ;
   G$_CHECK_FAILURE ;
   NEXT_FIELD ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFTYP_TERM_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVFTYP_TERM_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftvftypTermDate_keyNexItem()
		{

				nextItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFTYP_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVFTYP_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftvftypActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFTYP_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVFTYP_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftvftypActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFTYP_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVFTYP_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void ftvftypActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFTYP_TERM_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FTVFTYP_TERM_DATE")
		public void ftvftypTermDate_validate()
		{
			
				FtvftypAdapter ftvftypElement = (FtvftypAdapter)this.getFormModel().getFtvftyp().getRowAdapter(true);
							this.ftvftypTermDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFTYP.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void ftvftyp_AfterQuery(RowAdapterEvent args)
		{
			
			FtvftypAdapter ftvftypElement = (FtvftypAdapter)args.getRow();			
			
						
				try {
				ftvftypElement.setLockDbValues(true);
				try { 
				this.ftvftypTermDate_PostChange();
				} catch(Exception ex) {
				}
			
						} finally {
							ftvftypElement.setLockDbValues(false);
						}
						

		}

		
	
	
}

