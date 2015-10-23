package net.hedtech.banner.finance.common.Ftvorgn.controller;
 
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

import net.hedtech.banner.finance.common.Ftvorgn.model.*;
import net.hedtech.banner.finance.common.Ftvorgn.*;
import net.hedtech.banner.finance.common.Ftvorgn.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FtvorgnController extends DefaultBlockController {

	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public FtvorgnController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FtvorgnTask getTask() {
		return (FtvorgnTask)super.getTask();
	}

	public FtvorgnModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER FTVORGN.PRE-QUERY
		   :hold_coas_code := :global.coas_code ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVORGN.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void ftvorgn_BeforeQuery(QueryEvent args)
		{

				getFormModel().getFormHeader().setHoldCoasCode(getGlobal("COAS_CODE"));
			

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("HOLD_COAS_CODE", this.getFormModel().getFormHeader().getHoldCoasCode()));             


                FtvorgnAdapter ftvorgnElement = (FtvorgnAdapter) this.getFormModel().getFtvorgn().getRowAdapter();                       
                if(ftvorgnElement!=null){
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("FTVORGN_COAS_CODE", ftvorgnElement.getFtvorgnCoasCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("FTVORGN_DATA_ENTRY_IND", ftvorgnElement.getFtvorgnDataEntryInd()));             
                }

           
			}

		
		/* Original PL/SQL code code for TRIGGER FTVORGN.KEY-EXEQRY
		 SET_BLOCK_PROPERTY('FTVORGN',DEFAULT_WHERE,
	'where (ftvorgn_coas_code = :hold_coas_code 
	 or ftvorgn_coas_code = :ftvorgn_coas_code)');
EXECUTE_QUERY;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVORGN.KEY-EXEQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-EXEQRY", function=KeyFunction.EXECUTE_QUERY)
		public void ftvorgn_ExecuteQuery()
		{
			
//				setBlockWhereClause("FTVORGN", "where (ftvorgn_coas_code = :hold_coas_code \n	 or ftvorgn_coas_code = :ftvorgn_coas_code)");
				FtvorgnAdapter ftvorgnElement = (FtvorgnAdapter) this.getFormModel().getFtvorgn().getRowAdapter();                       
            	if (ftvorgnElement != null && ftvorgnElement.getFtvorgnCoasCode().isNotNull())
            		setBlockWhereClause("FTVORGN", "");
            	else
            		setBlockWhereClause("FTVORGN", "WHERE (ftvorgn_coas_code = NVL(:HOLD_COAS_CODE, ftvorgn_coas_code))");
				executeQuery();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVORGN_EFF_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVORGN_EFF_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftvorgnEffDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVORGN_EFF_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVORGN_EFF_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftvorgnEffDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVORGN_EFF_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVORGN_EFF_DATE", function=KeyFunction.ITEM_OUT)
		public void ftvorgnEffDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVORGN_TERM_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVORGN_TERM_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftvorgnTermDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVORGN_TERM_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVORGN_TERM_DATE", function=KeyFunction.ITEM_OUT)
		public void ftvorgnTermDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVORGN_TERM_DATE.POST-CHANGE
		    G$_DATE_REFORMAT ('','') ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVORGN_TERM_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FTVORGN_TERM_DATE")
		public void ftvorgnTermDate_PostChange()
		{
			

				FtvorgnAdapter ftvorgnElement = (FtvorgnAdapter)this.getFormModel().getFtvorgn().getRowAdapter(true);


				if(ftvorgnElement!=null && ftvorgnElement.getFtvorgnTermDate().isNull())
		return;

			}

		
		/* Original PL/SQL code code for TRIGGER FTVORGN_TERM_DATE.KEY-NEXT-ITEM
		    G$_DATE_REFORMAT ('','') ;
   G$_CHECK_FAILURE ;
   NEXT_FIELD ;
   G$_CHECK_FAILURE ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVORGN_TERM_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVORGN_TERM_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftvorgnTermDate_keyNexItem()
		{

				nextItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVORGN_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVORGN_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftvorgnActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVORGN_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVORGN_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftvorgnActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVORGN_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVORGN_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void ftvorgnActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVORGN_TERM_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FTVORGN_TERM_DATE")
		public void ftvorgnTermDate_validate()
		{
			
				FtvorgnAdapter ftvorgnElement = (FtvorgnAdapter)this.getFormModel().getFtvorgn().getRowAdapter(true);
							this.ftvorgnTermDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVORGN.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void ftvorgn_AfterQuery(RowAdapterEvent args)
		{
			
			FtvorgnAdapter ftvorgnElement = (FtvorgnAdapter)args.getRow();			
						
				try {
				ftvorgnElement.setLockDbValues(true);
				try { 
				this.ftvorgnTermDate_PostChange();
				} catch(Exception ex) {
				}
			
						} finally {
							ftvorgnElement.setLockDbValues(false);
						}
						

			}

		
	
	
}

