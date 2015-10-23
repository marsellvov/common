package net.hedtech.banner.finance.common.Fragrnt.controller;
 
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

import net.hedtech.banner.finance.common.Fragrnt.model.*;
import net.hedtech.banner.finance.common.Fragrnt.*;
import net.hedtech.banner.finance.common.Fragrnt.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FrrglocController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public FrrglocController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FragrntTask getTask() {
		return (FragrntTask)super.getTask();
	}

	public FragrntModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER FRRGLOC.PRE-UPDATE
		    IF G$_NCHK(:commit_ind <> 'Y') THEN
      MESSAGE(  G$_NLS.Get('FRAGRNT-0167', 'FORM','Select SAVE to perform a Commit.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
--
  EXECUTE_TRIGGER('UPDATE_ACTIVITY_DATE');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('UPDATE_USER_ID');
  G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGLOC.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void frrgloc_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				if ( getTask().getGoqrpls().gNchk(toBool(getFormModel().getFormHeader().getCommitInd().notEquals("Y"))).getValue() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0167"), toStr("FORM"), toStr("Select SAVE to perform a Commit.")));
					throw new ApplicationException();
				}
				// 
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGLOC.PRE-INSERT
		    IF G$_NCHK(:commit_ind <> 'Y') THEN
      MESSAGE(  G$_NLS.Get('FRAGRNT-0168', 'FORM','Select SAVE to perform a Commit.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
--
  EXECUTE_TRIGGER('UPDATE_ACTIVITY_DATE');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('UPDATE_USER_ID');
  G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGLOC.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void frrgloc_BeforeRowInsert(RowAdapterEvent args)
		{
			
				if ( getTask().getGoqrpls().gNchk(toBool(getFormModel().getFormHeader().getCommitInd().notEquals("Y"))).getValue() )
				{
					warningMessage(GNls.Fget(toStr("FRAGRNT-0168"), toStr("FORM"), toStr("Select SAVE to perform a Commit.")));
					throw new ApplicationException();
				}
				// 
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGLOC.KEY-DELREC
		 if :del_ready = 'N' then
   :del_ready := 'Y';
   message(G$_NLS.Get('FRAGRNT-0169', 'FORM','Press ''Delete Record'' again to Delete this Record.'));
   raise form_trigger_failure;
end if;
   
:del_ready := 'N';

delete_record;	
g$_check_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGLOC.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void frrgloc_DeleteRecord()
		{
			
				if ( getFormModel().getFormHeader().getDelReady().equals("N") )
				{
					getFormModel().getFormHeader().setDelReady(toStr("Y"));
					warningMessage(GNls.Fget(toStr("FRAGRNT-0169"), toStr("FORM"), toStr("Press 'Delete Record' again to Delete this Record.")));
					throw new ApplicationException();
				}
				getFormModel().getFormHeader().setDelReady(toStr("N"));
				deleteRecord();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGLOC.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void frrgloc_BeforeQuery(QueryEvent args)
		{
			
               FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel().getFrbgrnt().getRowAdapter();                       
                if(frbgrntElement==null)
					return;
                
                ((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode()));             


           
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGLOC_LOCN_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRRGLOC_LOCN_CODE")
		public void frrglocLocnCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGLOC_LOCN_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRRGLOC_LOCN_CODE", function=KeyFunction.ITEM_CHANGE)
		public void frrglocLocnCode_itemChange()
		{
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGLOC_LOCN_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRRGLOC_LOCN_CODE")
		public void frrglocLocnCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGLOC_LOCN_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRRGLOC_LOCN_CODE", function=KeyFunction.NEXT_ITEM)
		public void frrglocLocnCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGLOC_LOCN_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRRGLOC_LOCN_CODE", function=KeyFunction.ITEM_OUT)
		public void frrglocLocnCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGLOC_LOCN_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVLOCN_LOCN_CODE', 'FTVLOCN_TITLE',
   G$_SEARCH_WHERE.F_FTVLOCN_ENTRY(':FRBGRNT_COAS_CODE', 'SYSDATE'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGLOC_LOCN_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRRGLOC_LOCN_CODE")
		public void frrglocLocnCode_GSearchParameters()
		{
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVLOCN_LOCN_CODE"), toStr("FTVLOCN_TITLE"), getTask().getGoqrpls().getGSearchWhere().fFtvlocnEntry(toStr(":FRBGRNT_COAS_CODE"), toStr("SYSDATE")));
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGLOC_LOCN_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   EXECUTE_TRIGGER( 'EDIT_LOCN_CODE' ) ;
   G$_CHECK_FAILURE ;
--
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      RAISE FORM_TRIGGER_FAILURE ;
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGLOC_LOCN_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRRGLOC_LOCN_CODE")
		public void frrglocLocnCode_PostChange()
		{
			

				FrrglocAdapter frrglocElement = (FrrglocAdapter)this.getFormModel().getFrrgloc().getRowAdapter(true);

				if(frrglocElement==null)
					return;

				if(frrglocElement.getFrrglocLocnCode().isNull())
					return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					executeAction("EDIT_LOCN_CODE");
					getTask().getGoqrpls().gCheckFailure();
					// 
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGLOC_LOCN_CODE.KEY-LISTVAL
		 BEGIN
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FTVLOCN', 'QUERY');
IF NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
  IF  GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),UPDATEABLE) = 'TRUE'
  OR (GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),UPDATE_NULL) = 'TRUE'
      AND :SYSTEM.CURSOR_VALUE IS NULL)
  OR  (:SYSTEM.MODE <> 'NORMAL' AND
       GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),QUERYABLE) = 'TRUE')
  OR  (:SYSTEM.RECORD_STATUS = 'NEW' AND
       GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),INSERT_ALLOWED) = 'TRUE')
  OR  (:SYSTEM.RECORD_STATUS = 'INSERT' AND
       GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),INSERT_ALLOWED) = 'TRUE')
  THEN  EXECUTE_TRIGGER('LIST_VALUES_COPY'); 
        :GLOBAL.VALUE := '';
        DO_KEY('NEXT_ITEM');
  ELSE
       MESSAGE( G$_NLS.Get('FRAGRNT-0170', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGLOC_LOCN_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRRGLOC_LOCN_CODE", function=KeyFunction.LIST_VALUES)
		public void frrglocLocnCode_ListValues()
		{
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FTVLOCN"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE")|| (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0170"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGLOC_LOCN_TITLE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRRGLOC_LOCN_TITLE", function=KeyFunction.ITEM_CHANGE)
		public void frrglocLocnTitle_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGLOC_LOCN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRGLOC_LOCN_CODE")
		public void frrglocLocnCode_validate()
		{
			
				FrrglocAdapter frrglocElement = (FrrglocAdapter)this.getFormModel().getFrrgloc().getRowAdapter(true);
							this.frrglocLocnCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGLOC.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void frrgloc_AfterQuery(RowAdapterEvent args)
		{
			
			FrrglocAdapter frrglocElement = (FrrglocAdapter)args.getRow();			
			
						
				try {
				frrglocElement.setLockDbValues(true);
				try { 
				this.frrglocLocnCode_PostChange();
				} catch(Exception ex) {
				}
			
						} finally {
							frrglocElement.setLockDbValues(false);
						}
						

		}

		
	
	
}

