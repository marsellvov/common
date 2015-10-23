package net.hedtech.banner.finance.common.Fraprop.controller;
 
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
import net.hedtech.banner.finance.common.Fraprop.model.*;
import net.hedtech.banner.finance.common.Fraprop.*;
import net.hedtech.banner.finance.common.Fraprop.services.*;

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FrrpusnController extends DefaultBlockController {


	
	public FrrpusnController(IFormController parentController, String name) 
	{
		super(parentController, name);
	}
		
		
		
	@Override
	public FrapropTask getTask() {
		return (FrapropTask)super.getTask();
	}

	public FrapropModel getFormModel() {
		return this.getTask().getModel();
	}
		
			
	//action methods generated from triggers
		/* Original PL/SQL code code for TRIGGER FRRPUSN.PRE-UPDATE
		 IF :FRRPUSN_SDAT_CODE_ATTR IS NULL THEN
   MESSAGE( G$_NLS.Get('FRAPROP-0135', 'FORM','Literal must be entered.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
IF :FRRPUSN_SDAT_CODE_OPT_1 IS NULL THEN
   MESSAGE( G$_NLS.Get('FRAPROP-0136', 'FORM','Value Code must be entered.') );
   RAISE FORM_TRIGGER_FAILURE;
ELSE
   EXECUTE_TRIGGER('CHECK_OPT_1');
   G$_CHECK_FAILURE;
END IF;
  EXECUTE_TRIGGER('UPDATE_ACTIVITY_DATE');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('UPDATE_USER_ID');
  G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPUSN.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void frrpusn_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				FrrpusnAdapter frrpusnElement = (FrrpusnAdapter)args.getRow();


				if ( frrpusnElement.getFrrpusnSdatCodeAttr().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0135"), toStr("FORM"), toStr("Literal must be entered.")));
					throw new ApplicationException();
				}
				if ( frrpusnElement.getFrrpusnSdatCodeOpt1().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0136"), toStr("FORM"), toStr("Value Code must be entered.")));
					throw new ApplicationException();
				}
				else {
					executeAction("CHECK_OPT_1");
					getTask().getGoqrpls().gCheckFailure();
				}
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPUSN.PRE-INSERT
		 if :frrpusn_sdat_code_attr is null and
   :frrpusn_sdat_code_opt_1 is null then
   goto step_1;
end if;
IF :FRRPUSN_SDAT_CODE_ATTR IS NULL THEN
   MESSAGE( G$_NLS.Get('FRAPROP-0137', 'FORM','Literal must be entered.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
IF :FRRPUSN_SDAT_CODE_OPT_1 IS NULL THEN
   MESSAGE( G$_NLS.Get('FRAPROP-0138', 'FORM','Value Code must be entered.') );
   RAISE FORM_TRIGGER_FAILURE;
ELSE
   EXECUTE_TRIGGER('CHECK_OPT_1');
   G$_CHECK_FAILURE;

END IF;
<<step_1>>
  EXECUTE_TRIGGER('UPDATE_ACTIVITY_DATE');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('UPDATE_USER_ID');
  G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPUSN.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void frrpusn_BeforeRowInsert(RowAdapterEvent args)
		{
			
				FrrpusnAdapter frrpusnElement = (FrrpusnAdapter)args.getRow();


				if ( frrpusnElement.getFrrpusnSdatCodeAttr().isNull() && frrpusnElement.getFrrpusnSdatCodeOpt1().isNull() )
				{
//					 goto STEP_1;
//					 STEP_1:;
						executeAction("UPDATE_ACTIVITY_DATE");
						getTask().getGoqrpls().gCheckFailure();
						executeAction("UPDATE_USER_ID");
						getTask().getGoqrpls().gCheckFailure();
						return;
				}
				if ( frrpusnElement.getFrrpusnSdatCodeAttr().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0137"), toStr("FORM"), toStr("Literal must be entered.")));
					throw new ApplicationException();
				}
				if ( frrpusnElement.getFrrpusnSdatCodeOpt1().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0138"), toStr("FORM"), toStr("Value Code must be entered.")));
					throw new ApplicationException();
				}
				else {
					executeAction("CHECK_OPT_1");
					getTask().getGoqrpls().gCheckFailure();
				}
				 STEP_1:;
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPUSN.KEY-DELREC
		 if :del_ready = 'N' then
   :del_ready := 'Y';
   message(G$_NLS.Get('FRAPROP-0139', 'FORM','Press ''Delete Record'' again to Delete this Record.'));
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
		 * FRRPUSN.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void frrpusn_DeleteRecord()
		{
			
				if ( getFormModel().getFormHeader().getDelReady().equals("N") )
				{
					getFormModel().getFormHeader().setDelReady(toStr("Y"));
					warningMessage(GNls.Fget(toStr("FRAPROP-0139"), toStr("FORM"), toStr("Press 'Delete Record' again to Delete this Record.")));
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
		 * FRRPUSN.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void frrpusn_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

                // F2J_WARNING : Caution, the variable may be null.                  
                FrbpropAdapter frbpropElement = (FrbpropAdapter) this.getFormModel().getFrbprop().getRowAdapter();                       
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("FRBPROP_CODE", frbpropElement.getFrbpropCode()));             


           
               }

		
		/* Original PL/SQL code code for TRIGGER FRRPUSN_SDAT_CODE_ATTR.KEY-LISTVAL
		 BEGIN
      execute_trigger('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER1, 'FRVSDAT', 'QUERY');
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
  THEN  EXECUTE_TRIGGER('LIST_VALUES_COPY_TWO'); 
       :GLOBAL.SDAT_ATTR := '';
        DO_KEY('NEXT_ITEM');
        DO_KEY('NEXT_ITEM');
  ELSE
       MESSAGE( G$_NLS.Get('FRAPROP-0140', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;


END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPUSN_SDAT_CODE_ATTR.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRRPUSN_SDAT_CODE_ATTR", function=KeyFunction.LIST_VALUES)
		public void frrpusnSdatCodeAttr_ListValues()
		{
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FRVSDAT"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") || (
						//Morphis TODO
//						(SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.UPDATE_NULL).equals("TRUE") && 
//						(SupportClasses.AppContext.CursorValue) == null) ||
						(INullable)getItemValue(getCursorItem())).isNull() ||
						(!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						executeAction("LIST_VALUES_COPY_TWO");
						setGlobal("SDAT_ATTR", toStr(""));
						executeAction("NEXT_ITEM");
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAPROP-0140"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPUSN_SDAT_CODE_ATTR.POST-CHANGE
		 DECLARE
  TEMP VARCHAR2(1);
  CURSOR C1 IS
    SELECT 'X' 
      FROM FRVSDAT
     WHERE  FRVSDAT_SDAT_CODE_ATTR   = :FRRPUSN_SDAT_CODE_ATTR;
     BEGIN
   OPEN C1;
   FETCH C1 INTO TEMP;
   IF C1%NOTFOUND THEN
      MESSAGE( G$_NLS.Get('FRAPROP-0141', 'FORM','Literal is Invalid. LIST is available.') );
      RAISE FORM_TRIGGER_FAILURE;
   END IF;
  END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPUSN_SDAT_CODE_ATTR.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRRPUSN_SDAT_CODE_ATTR")
		public void frrpusnSdatCodeAttr_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrpusnAdapter frrpusnElement = (FrrpusnAdapter)this.getFormModel().getFrrpusn().getRowAdapter(true);


				int rowCount = 0;
				if(frrpusnElement.getFrrpusnSdatCodeAttr().isNull())
		return;
				{
					NString temp= NString.getNull();
					String sqlc1 = "SELECT 'X' " +
	" FROM FRVSDAT " +
	" WHERE FRVSDAT_SDAT_CODE_ATTR = :FRRPUSN_SDAT_CODE_ATTR ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("FRRPUSN_SDAT_CODE_ATTR", frrpusnElement.getFrrpusnSdatCodeAttr());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							temp = c1Results.getStr(0);
						}
						if ( c1.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAPROP-0141"), toStr("FORM"), toStr("Literal is Invalid. LIST is available.")));
							throw new ApplicationException();
						}
					}
					finally{
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPUSN_SDAT_CODE_OPT_1.KEY-LISTVAL
		 BEGIN
      execute_trigger('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER1, 'FRVSDAT', 'QUERY');

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
  THEN  EXECUTE_TRIGGER('LIST_VALUES_COPY_TWO'); 
        :GLOBAL.VALUE := '';
        DO_KEY('NEXT_ITEM');
  ELSE
       MESSAGE( G$_NLS.Get('FRAPROP-0142', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;  
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPUSN_SDAT_CODE_OPT_1.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRRPUSN_SDAT_CODE_OPT_1", function=KeyFunction.LIST_VALUES)
		public void frrpusnSdatCodeOpt1_ListValues()
		{
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FRVSDAT"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") || (
						//Morphis TODO
//						(SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.UPDATE_NULL).equals("TRUE") && 
//						(SupportClasses.AppContext.CursorValue) == null) || 
						(INullable)getItemValue(getCursorItem())).isNull() ||
						(!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						executeAction("LIST_VALUES_COPY_TWO");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAPROP-0142"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPUSN_SDAT_CODE_OPT_1.POST-CHANGE
		 EXECUTE_TRIGGER('VALIDATE_USER_FIELDS');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPUSN_SDAT_CODE_OPT_1.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRRPUSN_SDAT_CODE_OPT_1")
		public void frrpusnSdatCodeOpt1_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrpusnAdapter frrpusnElement = (FrrpusnAdapter)this.getFormModel().getFrrpusn().getRowAdapter(true);


				if(frrpusnElement.getFrrpusnSdatCodeOpt1().isNull())
		return;
				executeAction("VALIDATE_USER_FIELDS");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPUSN_SDAT_CODE_OPT_1.POST-TEXT-ITEM
		 IF :FRRPUSN_SDAT_CODE_OPT_1 IS NULL THEN
   :FRRPUSN_DESC := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPUSN_SDAT_CODE_OPT_1.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRRPUSN_SDAT_CODE_OPT_1", function=KeyFunction.ITEM_OUT)
		public void frrpusnSdatCodeOpt1_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrpusnAdapter frrpusnElement = (FrrpusnAdapter)this.getFormModel().getFrrpusn().getRowAdapter(true);


				if ( frrpusnElement.getFrrpusnSdatCodeOpt1().isNull() )
				{
					frrpusnElement.setFrrpusnDesc(toStr(""));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPUSN_SDAT_CODE_ATTR.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRPUSN_SDAT_CODE_ATTR")
		public void frrpusnSdatCodeAttr_validate()
		{
			
				FrrpusnAdapter frrpusnElement = (FrrpusnAdapter)this.getFormModel().getFrrpusn().getRowAdapter(true);
							this.frrpusnSdatCodeAttr_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPUSN.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void frrpusn_AfterQuery(RowAdapterEvent args)
		{
			
			FrrpusnAdapter frrpusnElement = (FrrpusnAdapter)args.getRow();			
			
			FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
			
			frrpusnElement.setFrrpusnPropCode(frbpropElement.getFrbpropCode());
			
			try { 
			this.frrpusnSdatCodeAttr_PostChange();
			} catch(Exception ex) {
			}

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPUSN_SDAT_CODE_OPT_1.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRPUSN_SDAT_CODE_OPT_1")
		public void frrpusnSdatCodeOpt1_validate()
		{
			
				FrrpusnAdapter frrpusnElement = (FrrpusnAdapter)this.getFormModel().getFrrpusn().getRowAdapter(true);
							this.frrpusnSdatCodeOpt1_PostChange();

			}

		
	
	
}

