package net.hedtech.banner.finance.common.Ftvfund.controller;
 
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
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.finance.common.Ftvfund.model.*;
import net.hedtech.banner.finance.common.Ftvfund.*;
import net.hedtech.banner.finance.common.Ftvfund.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FtvfundController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public FtvfundController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FtvfundTask getTask() {
		return (FtvfundTask)super.getTask();
	}

	public FtvfundModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVFUND_GRNT_CODE", function=KeyFunction.ITEM_CHANGE) 
	                public void ftvfundGrntCode_itemChange() 
	                { 
	                         
	                              
	                                 
	                        }
	@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="GRNT_DESC", function=KeyFunction.ITEM_CHANGE) 
	                public void grntDesc_itemChange() 
	                { 
	                         
	                                
	                                 
	                        }
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER FTVFUND.KEY-EXEQRY
		 SET_BLOCK_PROPERTY('FTVFUND',DEFAULT_WHERE,
	'where (ftvfund_coas_code = :hold_coas_code 
	 or ftvfund_coas_code = :ftvfund_coas_code)');
EXECUTE_QUERY;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void ftvfund_ExecuteQuery()
		{
			
//				setBlockWhereClause("FTVFUND", "where (ftvfund_coas_code = :hold_coas_code \n	 or ftvfund_coas_code = :ftvfund_coas_code)");
				FtvfundAdapter ftvfundElement = (FtvfundAdapter) this.getFormModel().getFtvfund().getRowAdapter();                       
				if (ftvfundElement != null && ftvfundElement.getFtvfundCoasCode().isNotNull())
					setBlockWhereClause("FTVFUND", "");
				else
					setBlockWhereClause("FTVFUND", "WHERE (ftvfund_coas_code = NVL(:HOLD_COAS_CODE, ftvfund_coas_code))");
				executeQuery();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND.PRE-QUERY
		   :HOLD_COAS_CODE := :GLOBAL.COAS_CODE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void ftvfund_BeforeQuery(QueryEvent args)
		{

				getFormModel().getFormHeader().setHoldCoasCode(getGlobal("COAS_CODE"));
				

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("HOLD_COAS_CODE", this.getFormModel().getFormHeader().getHoldCoasCode()));             


                FtvfundAdapter ftvfundElement = (FtvfundAdapter) this.getFormModel().getFtvfund().getRowAdapter();                       
                if(ftvfundElement!=null)
                {
					((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("FTVFUND_COAS_CODE", ftvfundElement.getFtvfundCoasCode()));             
	
	
					((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("FTVFUND_DATA_ENTRY_IND", ftvfundElement.getFtvfundDataEntryInd()));
                }


           
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND.POST-QUERY
		 DISPLAY_GRNT_TITLE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void ftvfund_AfterQuery(RowAdapterEvent args)
		{
			
				FtvfundAdapter ftvfundElement = (FtvfundAdapter)args.getRow();


				this.getTask().getServices().displayGrntTitle(ftvfundElement);
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND.WHEN-NEW-RECORD-INSTANCE
		 IF :FTVFUND_GRNT_CODE IS NULL  THEN
    G$_NAVIGATION_FRAME.DISABLE_OPTION('FRIFUND','F');      
ELSE
   		G$_NAVIGATION_FRAME.ENABLE_OPTION('FRIFUND','F');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void ftvfund_recordChange()
		{
			

				FtvfundAdapter ftvfundElement = (FtvfundAdapter)this.getFormModel().getFtvfund().getRowAdapter(true);


				if (ftvfundElement!=null && ftvfundElement.getFtvfundGrntCode().isNull() )
				{
					getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("FRIFUND"), toStr("F"));
				}
				else {
					getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("FRIFUND"), toStr("F"));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND_EFF_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVFUND_EFF_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftvfundEffDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND_EFF_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVFUND_EFF_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftvfundEffDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND_EFF_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVFUND_EFF_DATE", function=KeyFunction.ITEM_OUT)
		public void ftvfundEffDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND_TERM_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVFUND_TERM_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftvfundTermDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND_TERM_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVFUND_TERM_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftvfundTermDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND_TERM_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVFUND_TERM_DATE", function=KeyFunction.ITEM_OUT)
		public void ftvfundTermDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVFUND_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftvfundActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVFUND_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftvfundActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVFUND_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void ftvfundActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVFUND_GRNT_CODE.KEY-NEXT-ITEM
		 	SCROLL_VIEW('FTVFUND_2_CANVAS',0,0);
	NEXT_ITEM;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVFUND_GRNT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVFUND_GRNT_CODE", function=KeyFunction.NEXT_ITEM)
		public void ftvfundGrntCode_keyNexItem()
		{
			
				
				nextItem();
			}

		
	
	
}

