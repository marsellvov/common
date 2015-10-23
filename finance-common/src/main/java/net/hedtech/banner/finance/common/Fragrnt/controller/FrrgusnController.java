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

		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FrrgusnController extends DefaultBlockController {


	
	public FrrgusnController(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER FRRGUSN.PRE-UPDATE
		 IF :frrgusn_SDAT_CODE_ATTR IS NULL THEN
   MESSAGE( G$_NLS.Get('FRAGRNT-0159', 'FORM','Literal must be entered.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
IF :FRRGUSN_SDAT_CODE_OPT_1 IS NULL THEN
   MESSAGE( G$_NLS.Get('FRAGRNT-0160', 'FORM','User Code must be entered.') );
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
		 * FRRGUSN.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void frrgusn_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				FrrgusnAdapter frrgusnElement = (FrrgusnAdapter)args.getRow();


				if ( frrgusnElement.getFrrgusnSdatCodeAttr().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0159"), toStr("FORM"), toStr("Literal must be entered.")));
					throw new ApplicationException();
				}
				if ( frrgusnElement.getFrrgusnSdatCodeOpt1().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0160"), toStr("FORM"), toStr("User Code must be entered.")));
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

		
		/* Original PL/SQL code code for TRIGGER FRRGUSN.PRE-INSERT
		 if :frrgusn_sdat_code_attr is null and
   :frrgusn_sdat_code_opt_1 is null then
   goto step_1;
end if;
IF :frrgusn_SDAT_CODE_ATTR IS NULL THEN
   MESSAGE( G$_NLS.Get('FRAGRNT-0161', 'FORM','Literal must be entered.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
IF :frrgusn_SDAT_CODE_OPT_1 IS NULL THEN
   MESSAGE( G$_NLS.Get('FRAGRNT-0162', 'FORM','User Code must be entered.') );
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
		 * FRRGUSN.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void frrgusn_BeforeRowInsert(RowAdapterEvent args)
		{
			
				FrrgusnAdapter frrgusnElement = (FrrgusnAdapter)args.getRow();


				if (!( frrgusnElement.getFrrgusnSdatCodeAttr().isNull() && frrgusnElement.getFrrgusnSdatCodeOpt1().isNull() ))
				{
//					 goto STEP_1;
//				}
					if ( frrgusnElement.getFrrgusnSdatCodeAttr().isNull() )
					{
						errorMessage(GNls.Fget(toStr("FRAGRNT-0161"), toStr("FORM"), toStr("Literal must be entered.")));
						throw new ApplicationException();
					}
					if ( frrgusnElement.getFrrgusnSdatCodeOpt1().isNull() )
					{
						errorMessage(GNls.Fget(toStr("FRAGRNT-0162"), toStr("FORM"), toStr("User Code must be entered.")));
						throw new ApplicationException();
					}
					else {
						executeAction("CHECK_OPT_1");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
				 //STEP_1:;
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGUSN.KEY-DELREC
		 if :del_ready = 'N' then
   :del_ready := 'Y';
   message(G$_NLS.Get('FRAGRNT-0163', 'FORM','Press ''Delete Record'' again to Delete this Record.'));
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
		 * FRRGUSN.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void frrgusn_DeleteRecord()
		{
			
				if ( getFormModel().getFormHeader().getDelReady().equals("N") )
				{
					getFormModel().getFormHeader().setDelReady(toStr("Y"));
					warningMessage(GNls.Fget(toStr("FRAGRNT-0163"), toStr("FORM"), toStr("Press 'Delete Record' again to Delete this Record.")));
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
		 * FRRGUSN.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void frrgusn_BeforeQuery(QueryEvent args)
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel().getFrbgrnt().getRowAdapter();                       
				
                if(frbgrntElement==null)
					return;
                
                ((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("FRBGRNT_CODE", frbgrntElement.getFrbgrntCode()));             


           
               }

		
		/* Original PL/SQL code code for TRIGGER FRRGUSN_SDAT_CODE_ATTR.KEY-LISTVAL
		 BEGIN
 EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'FRVSDAT', 'QUERY');
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0164', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;


END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGUSN_SDAT_CODE_ATTR.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRRGUSN_SDAT_CODE_ATTR", function=KeyFunction.LIST_VALUES)
		public void frrgusnSdatCodeAttr_ListValues()
		{
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FRVSDAT"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") ||  (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY_TWO");
						setGlobal("SDAT_ATTR", toStr(""));
						findItem(getCurrentItem()).setValid(false);
						validateItem(getCurrentItem());
						executeAction("NEXT_ITEM");
						findItem(getCurrentItem()).setValid(false);
						validateItem(getCurrentItem());
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0164"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGUSN_SDAT_CODE_ATTR.POST-CHANGE
		 DECLARE
  TEMP VARCHAR2(1);
  CURSOR C1 IS
    SELECT 'X' 
      FROM FRVSDAT
     WHERE  FRVSDAT_SDAT_CODE_ATTR   = :FRRGUSN_SDAT_CODE_ATTR;
     BEGIN
   OPEN C1;
   FETCH C1 INTO TEMP;
   IF C1%NOTFOUND THEN
      MESSAGE( G$_NLS.Get('FRAGRNT-0165', 'FORM','Literal is Invalid. LIST is available.') );
      RAISE FORM_TRIGGER_FAILURE;
   END IF;
  END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGUSN_SDAT_CODE_ATTR.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRRGUSN_SDAT_CODE_ATTR")
		public void frrgusnSdatCodeAttr_PostChange()
		{
			

				FrrgusnAdapter frrgusnElement = (FrrgusnAdapter)this.getFormModel().getFrrgusn().getRowAdapter(true);

				 if(frrgusnElement==null)
						return;

				int rowCount = 0;
				if(frrgusnElement.getFrrgusnSdatCodeAttr().isNull())
		return;
				{
					NString temp= NString.getNull();
					String sqlc1 = "SELECT 'X' " +
	" FROM FRVSDAT " +
	" WHERE FRVSDAT_SDAT_CODE_ATTR = :FRRGUSN_SDAT_CODE_ATTR ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("FRRGUSN_SDAT_CODE_ATTR", frrgusnElement.getFrrgusnSdatCodeAttr());
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							temp = c1Results.getStr(0);
						}
						if ( c1.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAGRNT-0165"), toStr("FORM"), toStr("Literal is Invalid. LIST is available.")));
							throw new ApplicationException();
						}
					} finally {
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGUSN_SDAT_CODE_OPT_1.KEY-LISTVAL
		 BEGIN
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FRVSDAT', 'QUERY');

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
       MESSAGE( G$_NLS.Get('FRAGRNT-0166', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;  
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGUSN_SDAT_CODE_OPT_1.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRRGUSN_SDAT_CODE_OPT_1", function=KeyFunction.LIST_VALUES)
		public void frrgusnSdatCodeOpt1_ListValues()
		{
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FRVSDAT"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") || (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY_TWO");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0166"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGUSN_SDAT_CODE_OPT_1.POST-CHANGE
		 EXECUTE_TRIGGER('VALIDATE_USER_FIELDS');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGUSN_SDAT_CODE_OPT_1.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRRGUSN_SDAT_CODE_OPT_1")
		public void frrgusnSdatCodeOpt1_PostChange()
		{
			

				FrrgusnAdapter frrgusnElement = (FrrgusnAdapter)this.getFormModel().getFrrgusn().getRowAdapter(true);

				if(frrgusnElement==null)
					return;

				if(frrgusnElement.getFrrgusnSdatCodeOpt1().isNull())
		return;
				executeAction("VALIDATE_USER_FIELDS");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGUSN_SDAT_CODE_OPT_1.POST-TEXT-ITEM
		 IF :FRRGUSN_SDAT_CODE_OPT_1 IS NULL THEN
   :FRRGUSN_DESC := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGUSN_SDAT_CODE_OPT_1.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRRGUSN_SDAT_CODE_OPT_1", function=KeyFunction.ITEM_OUT)
		public void frrgusnSdatCodeOpt1_itemOut()
		{
			

				FrrgusnAdapter frrgusnElement = (FrrgusnAdapter)this.getFormModel().getFrrgusn().getRowAdapter(true);
				if(frrgusnElement == null)
					return;

				if ( frrgusnElement.getFrrgusnSdatCodeOpt1().isNull() )
				{
					frrgusnElement.setFrrgusnDesc(toStr(""));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGUSN_SDAT_CODE_ATTR.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRGUSN_SDAT_CODE_ATTR")
		public void frrgusnSdatCodeAttr_validate()
		{
			
				FrrgusnAdapter frrgusnElement = (FrrgusnAdapter)this.getFormModel().getFrrgusn().getRowAdapter(true);
							this.frrgusnSdatCodeAttr_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGUSN.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void frrgusn_AfterQuery(RowAdapterEvent args)
		{
			
			FrrgusnAdapter frrgusnElement = (FrrgusnAdapter)args.getRow();			
						
				try {
				frrgusnElement.setLockDbValues(true);
                                 try {  
                                this.frrgusnSdatCodeAttr_PostChange(); 
                                } catch(Exception ex) { 
                                } 
                                 try {  
                                this.frrgusnSdatCodeOpt1_PostChange(); 
                                } catch(Exception ex) { 
                                } 

//[DELETE] 
//[DELETE] 
				 
			
						} finally {
							frrgusnElement.setLockDbValues(false);
						}
						

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGUSN_SDAT_CODE_OPT_1.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRGUSN_SDAT_CODE_OPT_1")
		public void frrgusnSdatCodeOpt1_validate()
		{
			
				FrrgusnAdapter frrgusnElement = (FrrgusnAdapter)this.getFormModel().getFrrgusn().getRowAdapter(true);
							this.frrgusnSdatCodeOpt1_PostChange();

			}

		
	
	
}

