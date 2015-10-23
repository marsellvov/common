package net.hedtech.banner.finance.common.Frikgnt.controller;
 
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
import net.hedtech.general.common.libraries.Foqrpls.*;
import net.hedtech.general.common.libraries.Goqrpls.*;
import net.hedtech.general.common.libraries.Goqwflw.*;
import net.hedtech.general.common.libraries.Eoqrpls.*;

import net.hedtech.banner.finance.common.Frikgnt.model.*;
import net.hedtech.banner.finance.common.Frikgnt.*;
import net.hedtech.banner.finance.common.Frikgnt.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FrbgrntController extends DefaultBlockController {


	
	public FrbgrntController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FrikgntTask getTask() {
		return (FrikgntTask)super.getTask();
	}

	public FrikgntModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER FRBGRNT.PRE-QUERY
		    
   IF :KEY_BLOCK.TITLE  IS  NULL  THEN
      :KEY_BLOCK.TITLE := '%';
   END IF; 
--
    IF :ENT_QRY = 'Y' THEN
    SET_BLOCK_PROPERTY('FRBPROP',DEFAULT_WHERE,PROPERTY_OFF);  
    SET_BLOCK_PROPERTY('FRBGRNT',DEFAULT_WHERE,
  'upper (frbprop_long_title) like upper (:title)
   or  upper (frbprop_title) like upper (:title) 
   AND FRBGRNT_CODE LIKE :FRBGRNT_CODE 
   AND FRBGRNT_GRNT_CODE LIKE :FRBGRNT_GRNT_CODE
   AND FRBGRNT_STATUS_CODE LIKE :FRBGRNT_STATUS_CODE
   AND FRBGRNT_STATUS_DATE LIKE :FRBGRNT_STATUS_DATE'); 
   
    END IF;
   :ENT_QRY := 'N';
     SET_BLOCK_PROPERTY('FRBGRNT',DEFAULT_WHERE,PROPERTY_ON);
   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void frbgrnt_BeforeQuery(QueryEvent args)
		{
			

			if ( getFormModel().getKeyBlock().getTitle().isNull() )
			{
				getFormModel().getKeyBlock().setTitle(toStr("%"));
			}
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("TITLE", this.getFormModel().getKeyBlock().getTitle()));             


           
				
				// 
				if ( getFormModel().getFormHeader().getEntQry().equals("Y") )
				{
//					setBlockWhereClause("FRBPROP", false);
//					setBlockWhereClause("FRBGRNT", "upper (frbprop_long_title) like upper (:title)\n   or  upper (frbprop_title) like upper (:title) \n   AND FRBGRNT_CODE LIKE :FRBGRNT_CODE \n   AND FRBGRNT_GRNT_CODE LIKE :FRBGRNT_GRNT_CODE\n   AND FRBGRNT_STATUS_CODE LIKE :FRBGRNT_STATUS_CODE\n   AND FRBGRNT_STATUS_DATE LIKE :FRBGRNT_STATUS_DATE");
				}
				getFormModel().getFormHeader().setEntQry(toStr("N"));
//				setBlockWhereClause("FRBGRNT",true);
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.POST-QUERY
		   
 IF :KEY_BLOCK.TITLE = '%'  THEN
    :KEY_BLOCK.TITLE := '' ;  
    ELSE
    NULL;
 END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void frbgrnt_AfterQuery(RowAdapterEvent args)
		{
			
				if ( getFormModel().getKeyBlock().getTitle().equals("%") )
				{
					getFormModel().getKeyBlock().setTitle(toStr(""));
				}
				else {
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.KEY-DUPREC
		 execute_trigger('MNU_OPT_FOR_GRANT');
 g$_CHECK_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void frbgrnt_CopyRecord()
		{
			
				executeAction("MNU_OPT_FOR_GRANT");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.KEY-ENTQRY
		      ENTER_QUERY; 
    SET_BLOCK_PROPERTY('FRBGRNT',DEFAULT_WHERE,PROPERTY_OFF);
    :ENT_QRY := 'Y';
   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.KEY-ENTQRY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-ENTQRY", function=KeyFunction.SEARCH)
		public void frbgrnt_Search()
		{
			
				enterQuery();
				//setBlockWhereClause("FRBGRNT", "false");
				getFormModel().getFormHeader().setEntQry(toStr("Y"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.KEY-DUP-ITEM
		 execute_trigger('MNU_OPT_FOR_PROPOSAL');
 g$_CHECK_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void frbgrnt_KeyDupItem()
		{
			
				executeAction("MNU_OPT_FOR_PROPOSAL");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.WHEN-NEW-RECORD-INSTANCE
		 IF :FRBGRNT_PROP_CODE IS NOT NULL THEN
G$_NAVIGATION_FRAME.ENABLE_OPTION('FRAPROP','L');
ELSE
G$_NAVIGATION_FRAME.DISABLE_OPTION('FRAPROP','L');
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void frbgrnt_recordChange()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				if( frbgrntElement == null)
					return;

				if ( !frbgrntElement.getFrbgrntPropCode().isNull() )
				{
					getTask().getGoqrpls().getGNavigationFrame().enableOption(toStr("FRAPROP"), toStr("L"));
				}
				else {
					getTask().getGoqrpls().getGNavigationFrame().disableOption(toStr("FRAPROP"), toStr("L"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_CODE.WHEN-NEW-ITEM-INSTANCE
		 execute_trigger('CHECK_BUTTONS');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntCode_itemChange()
		{
			
				executeAction("CHECK_BUTTONS");
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_PROP_CODE.WHEN-NEW-ITEM-INSTANCE
		 execute_trigger('CHECK_BUTTONS');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROP_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_PROP_CODE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntPropCode_itemChange()
		{
			
				executeAction("CHECK_BUTTONS");
			}

		
	
	
}

