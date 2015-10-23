package net.hedtech.banner.finance.common.Ftmecls.controller;
 
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

import net.hedtech.banner.finance.common.Ftmecls.model.*;
import net.hedtech.banner.finance.common.Ftmecls.*;
import net.hedtech.banner.finance.common.Ftmecls.services.*;

import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDateClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FtveclsController extends DefaultBlockController {

	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	
	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	
	private GDateClass getGDateClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDateClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DATE_CLASS");
	}	

	
	public FtveclsController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FtmeclsTask getTask() {
		return (FtmeclsTask)super.getTask();
	}

	public FtmeclsModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVECLS_ECLS_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FTVECLS_ECLS_CODE_LBT")
		public void ftveclsEclsCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVECLS_ECLS_CODE.WHEN-MOUSE-DOUBLECLICK
		 BEGIN
	DO_KEY('LIST_VALUES');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVECLS_ECLS_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FTVECLS_ECLS_CODE")
		public void ftveclsEclsCode_doubleClick()
		{
			
				executeAction("LIST_VALUES");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVECLS_WKSH_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FTVECLS_WKSH_CODE")
		public void ftveclsWkshCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVECLS_WKSH_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVECLS_WKSH_CODE", function=KeyFunction.ITEM_CHANGE)
		public void ftveclsWkshCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVECLS_WKSH_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FTVECLS_WKSH_CODE")
		public void ftveclsWkshCode_GSearchParameters()
		{
			
				getGCodeClass().gSearchParameters();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVECLS_WKSH_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FTVECLS_WKSH_CODE")
		public void ftveclsWkshCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVECLS_WKSH_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVECLS_WKSH_CODE", function=KeyFunction.NEXT_ITEM)
		public void ftveclsWkshCode_keyNexItem()
		{
				
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVECLS_WKSH_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVECLS_WKSH_CODE", function=KeyFunction.ITEM_OUT)
		public void ftveclsWkshCode_itemOut()
		{
				this.ftveclsWkshCode_PostChange();
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVECLS_WKSH_CODE.POST-CHANGE
		 DECLARE 
  CURSOR SCHED IS 
    SELECT NTVWKSH_DESC 
    FROM  NTVWKSH
    WHERE NTVWKSH_CODE = :FTVECLS_WKSH_CODE ;
BEGIN
  OPEN SCHED ;
  FETCH SCHED INTO :WKSH_CODE_DESC ;
   IF SCHED%NOTFOUND THEN  
      MESSAGE ( G$_NLS.Get('FTMECLS-0021', 'FORM','*ERROR* Invalid Work Schedule code; press LIST for valid codes') ) ;
      RAISE FORM_TRIGGER_FAILURE; 
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVECLS_WKSH_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FTVECLS_WKSH_CODE")
		public void ftveclsWkshCode_PostChange()
		{
			

				
				FtveclsAdapter ftveclsElement = (FtveclsAdapter)this.getFormModel().getFtvecls().getRowAdapter(true);

				if(ftveclsElement!=null){
				ftveclsElement.getFtveclsDesc();

				int rowCount = 0;
				if(ftveclsElement.getFtveclsWkshCode().isNull())
		return;
				{
					String sqlsched = "SELECT NTVWKSH_DESC " +
	" FROM NTVWKSH " +
	" WHERE NTVWKSH_CODE = :FTVECLS_WKSH_CODE ";
					DataCursor sched = new DataCursor(sqlsched);
					try {
						//Setting query parameters
						sched.addParameter("FTVECLS_WKSH_CODE", ftveclsElement.getFtveclsWkshCode());
						sched.open();
						ResultSet schedResults = sched.fetchInto();
						if ( schedResults != null ) {
							ftveclsElement.setWkshCodeDesc(schedResults.getStr(0));
						}
						if ( sched.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FTMECLS-0021"), toStr("FORM"), toStr("*ERROR* Invalid Work Schedule code; press LIST for valid codes")));
							throw new ApplicationException();
						}
					}
					finally{
						sched.close();
					}
				}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * WKSH_CODE_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="WKSH_CODE_DESC", function=KeyFunction.ITEM_CHANGE)
		public void wkshCodeDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVECLS_CONTRACT_IND.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF :FTVECLS_CONTRACT_IND = 'A' THEN
      NULL ;
   ELSIF :FTVECLS_CONTRACT_IND = 'H' THEN
      NULL ;
   ELSIF :FTVECLS_CONTRACT_IND = 'S' THEN
      NULL ;
   ELSIF :FTVECLS_CONTRACT_IND = 'V' THEN
      NULL ;
   ELSE
      MESSAGE(  G$_NLS.Get('FTMECLS-0019', 'FORM','*ERROR* Contract Ind; (H)ours input, (V)alue, (S)ystem Calc, (A)nnual Sal')  
          ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
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
		 * FTVECLS_CONTRACT_IND.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FTVECLS_CONTRACT_IND")
		public void ftveclsContractInd_PostChange()
		{
			

				FtveclsAdapter ftveclsElement = (FtveclsAdapter)this.getFormModel().getFtvecls().getRowAdapter(true);

				if(ftveclsElement!=null){
				if(ftveclsElement.getFtveclsContractInd().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if ( ftveclsElement.getFtveclsContractInd().equals("A") )
					{
					}
					else if ( ftveclsElement.getFtveclsContractInd().equals("H") ) {
					}
					else if ( ftveclsElement.getFtveclsContractInd().equals("S") ) {
					}
					else if ( ftveclsElement.getFtveclsContractInd().equals("V") ) {
					}
					else {
						errorMessage(GNls.Fget(toStr("FTMECLS-0019"), toStr("FORM"), toStr("*ERROR* Contract Ind; (H)ours input, (V)alue, (S)ystem Calc, (A)nnual Sal")));
						throw new ApplicationException();
					}
					// 
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FTVECLS_BUDGET_ROLL_IND.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;

   IF :FTVECLS_BUDGET_ROLL_IND = 'C' THEN
      NULL ;
   ELSIF :FTVECLS_BUDGET_ROLL_IND = 'M' THEN
      NULL ;
   ELSIF :FTVECLS_BUDGET_ROLL_IND = 'R' THEN
      NULL ;
   ELSIF :FTVECLS_BUDGET_ROLL_IND = 'S' THEN
      NULL ;
   ELSIF :FTVECLS_BUDGET_ROLL_IND = 'V' THEN
      NULL ;
   ELSIF :FTVECLS_BUDGET_ROLL_IND = 'Z' THEN
      NULL ;
   ELSE
      MESSAGE(  G$_NLS.Get('FTMECLS-0020', 'FORM','*ERROR* Budget Roll; (C)urr,(M)edian,(R)emain,(Z)ero,(S)alary,Contract (V)al')  
          ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
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
		 * FTVECLS_BUDGET_ROLL_IND.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FTVECLS_BUDGET_ROLL_IND")
		public void ftveclsBudgetRollInd_PostChange()
		{
			

				FtveclsAdapter ftveclsElement = (FtveclsAdapter)this.getFormModel().getFtvecls().getRowAdapter(true);

				if(ftveclsElement!=null){
				if(ftveclsElement.getFtveclsBudgetRollInd().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					if ( ftveclsElement.getFtveclsBudgetRollInd().equals("C") )
					{
					}
					else if ( ftveclsElement.getFtveclsBudgetRollInd().equals("M") ) {
					}
					else if ( ftveclsElement.getFtveclsBudgetRollInd().equals("R") ) {
					}
					else if ( ftveclsElement.getFtveclsBudgetRollInd().equals("S") ) {
					}
					else if ( ftveclsElement.getFtveclsBudgetRollInd().equals("V") ) {
					}
					else if ( ftveclsElement.getFtveclsBudgetRollInd().equals("Z") ) {
					}
					else {
						errorMessage(GNls.Fget(toStr("FTMECLS-0020"), toStr("FORM"), toStr("*ERROR* Budget Roll; (C)urr,(M)edian,(R)emain,(Z)ero,(S)alary,Contract (V)al")));
						throw new ApplicationException();
					}
					// 
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVECLS_WKSH_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FTVECLS_WKSH_CODE_LBT")
		public void ftveclsWkshCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER FTVECLS_HOURS_PER_DAY.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   EXECUTE_TRIGGER( 'EDIT_HOURS_DAY' ) ;
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
		 * FTVECLS_HOURS_PER_DAY.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FTVECLS_HOURS_PER_DAY")
		public void ftveclsHoursPerDay_PostChange()
		{
			

				FtveclsAdapter ftveclsElement = (FtveclsAdapter)this.getFormModel().getFtvecls().getRowAdapter(true);

				if(ftveclsElement!=null){
				if(ftveclsElement.getFtveclsHoursPerDay().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					executeAction("EDIT_HOURS_DAY");
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
			}

		
		/* Original PL/SQL code code for TRIGGER FTVECLS_HOURS_PER_PAY.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   EXECUTE_TRIGGER( 'EDIT_HOURS_PAY' ) ;
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
		 * FTVECLS_HOURS_PER_PAY.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FTVECLS_HOURS_PER_PAY")
		public void ftveclsHoursPerPay_PostChange()
		{
			

				FtveclsAdapter ftveclsElement = (FtveclsAdapter)this.getFormModel().getFtvecls().getRowAdapter(true);

				if(ftveclsElement!=null){
				if(ftveclsElement.getFtveclsHoursPerPay().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					executeAction("EDIT_HOURS_PAY");
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
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVECLS_ACTIVITY_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FTVECLS_ACTIVITY_DATE", function=KeyFunction.NEXT_ITEM)
		public void ftveclsActivityDate_keyNexItem()
		{
			
				getGDateClass().nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVECLS_ACTIVITY_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FTVECLS_ACTIVITY_DATE", function=KeyFunction.ITEM_CHANGE)
		public void ftveclsActivityDate_itemChange()
		{
			
				getGDateClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVECLS_ACTIVITY_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FTVECLS_ACTIVITY_DATE", function=KeyFunction.ITEM_OUT)
		public void ftveclsActivityDate_itemOut()
		{
			
				getGDateClass().itemOut();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVECLS_WKSH_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FTVECLS_WKSH_CODE")
		public void ftveclsWkshCode_validate()
		{
			
				FtveclsAdapter ftveclsElement = (FtveclsAdapter)this.getFormModel().getFtvecls().getRowAdapter(true);
							this.ftveclsWkshCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVECLS.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void ftvecls_AfterQuery(RowAdapterEvent args)
		{
			
			FtveclsAdapter ftveclsElement = (FtveclsAdapter)args.getRow();			
						
				try {
				ftveclsElement.setLockDbValues(true);
                                 try {  
                                this.ftveclsWkshCode_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.ftveclsContractInd_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.ftveclsBudgetRollInd_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.ftveclsHoursPerDay_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.ftveclsHoursPerPay_PostChange(); 
                                } catch(Exception ex) { 
                                } 

//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
				 
			
						} finally {
							ftveclsElement.setLockDbValues(false);
						}
						

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVECLS_CONTRACT_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FTVECLS_CONTRACT_IND")
		public void ftveclsContractInd_validate()
		{
			
				FtveclsAdapter ftveclsElement = (FtveclsAdapter)this.getFormModel().getFtvecls().getRowAdapter(true);
							this.ftveclsContractInd_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVECLS_BUDGET_ROLL_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FTVECLS_BUDGET_ROLL_IND")
		public void ftveclsBudgetRollInd_validate()
		{
			
				FtveclsAdapter ftveclsElement = (FtveclsAdapter)this.getFormModel().getFtvecls().getRowAdapter(true);
							this.ftveclsBudgetRollInd_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVECLS_HOURS_PER_DAY.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FTVECLS_HOURS_PER_DAY")
		public void ftveclsHoursPerDay_validate()
		{
			
				FtveclsAdapter ftveclsElement = (FtveclsAdapter)this.getFormModel().getFtvecls().getRowAdapter(true);
							this.ftveclsHoursPerDay_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FTVECLS_HOURS_PER_PAY.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FTVECLS_HOURS_PER_PAY")
		public void ftveclsHoursPerPay_validate()
		{
			
				FtveclsAdapter ftveclsElement = (FtveclsAdapter)this.getFormModel().getFtvecls().getRowAdapter(true);
							this.ftveclsHoursPerPay_PostChange();

			}

		
	
	
}

