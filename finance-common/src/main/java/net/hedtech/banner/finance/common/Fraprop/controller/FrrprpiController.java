package net.hedtech.banner.finance.common.Fraprop.controller;
 
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
import net.hedtech.banner.finance.common.Fraprop.model.*;
import net.hedtech.banner.finance.common.Fraprop.*;
import net.hedtech.banner.finance.common.Fraprop.services.*;
import net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIdClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GNameClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FrrprpiController extends DefaultBlockController {

	private GNonIconBtnClass getGNonIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NON_ICON_BTN_CLASS");
	}	
	private GIdClass getGIdClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIdClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ID_CLASS");
	}	
	private GNameClass getGNameClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNameClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NAME_CLASS");
	}	
	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	
	private GIconBtnClass getGIconBtnClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ICON_BTN_CLASS");
	}	

	
	public FrrprpiController(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER FRRPRPI.PRE-UPDATE
		 BEGIN
--   IF G$_NCHK(:commit_ind <> 'Y') THEN
--      MESSAGE( 'Select SAVE to perform a Commit.' ) ;
--      RAISE FORM_TRIGGER_FAILURE ;
--   END IF ;
--
  EXECUTE_TRIGGER('UPDATE_ACTIVITY_DATE');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('UPDATE_USER_ID');
  G$_CHECK_FAILURE;
--  EXECUTE_TRIGGER('CHECK_TEXT');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void frrprpi_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				//    IF G$_NCHK(:commit_ind <> 'Y') THEN
				//       MESSAGE( 'Select SAVE to perform a Commit.' ) ;
				//       RAISE FORM_TRIGGER_FAILURE ;
				//    END IF ;
				// 
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
				//   EXECUTE_TRIGGER('CHECK_TEXT');
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI.PRE-INSERT
		 BEGIN
--   IF G$_NCHK(:commit_ind <> 'Y') THEN
--      MESSAGE( 'Select SAVE to perform a Commit.' ) ;
--      RAISE FORM_TRIGGER_FAILURE ;
--   END IF ;

--
  EXECUTE_TRIGGER('UPDATE_ACTIVITY_DATE');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('UPDATE_USER_ID');
  G$_CHECK_FAILURE;
--  EXECUTE_TRIGGER('CHECK_TEXT');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void frrprpi_BeforeRowInsert(RowAdapterEvent args)
		{
			
				//    IF G$_NCHK(:commit_ind <> 'Y') THEN
				//       MESSAGE( 'Select SAVE to perform a Commit.' ) ;
				//       RAISE FORM_TRIGGER_FAILURE ;
				//    END IF ;
				// 
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
				//   EXECUTE_TRIGGER('CHECK_TEXT');
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI.POST-QUERY
		 

--after execute_query on frrprpi
  :POST_QUERY_IND := 'Y';
--
--  EXECUTE_TRIGGER('CHECK_TEXT');
--  G$_CHECK_FAILURE;

  EXECUTE_TRIGGER('GET_ID_CODE');
  G$_CHECK_FAILURE;
  :FRRPRPI_COAS := :FRBPROP_COAS_CODE;
-- for rollback
    SET_RECORD_PROPERTY(1,'FRRPRPI',STATUS,QUERY_STATUS);
--
   :POST_QUERY_IND := 'N';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void frrprpi_AfterQuery(RowAdapterEvent args)
		{
			
				// after execute_query on frrprpi
				FrrprpiAdapter frrprpiElement = (FrrprpiAdapter)args.getRow();
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);

				frrprpiElement.setFrrprpiPropCode(frbpropElement.getFrbpropCode());
				
				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.

				try
				{
					frrprpiElement.setLockDbValues(true);
                                                                 try {  
                        this.frrprpiId_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frrprpiIdInd_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                                                                this.frrprpiOrgnCode_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 

//[DELETE] 
//[DELETE] 
//[DELETE] 

				} finally { 
					frrprpiElement.setLockDbValues(false);
				}
				// after execute_query on frrprpi
				getFormModel().getFormHeader().setPostQueryInd(toStr("Y"));
				// 
				//   EXECUTE_TRIGGER('CHECK_TEXT');
				//   G$_CHECK_FAILURE;
				executeAction("GET_ID_CODE");
				getTask().getGoqrpls().gCheckFailure();
				frrprpiElement.setFrrprpiCoas(frbpropElement.getFrbpropCoasCode());
				//  for rollback
				// F2J_NOT_SUPPORTED *: The property "RECORD's STATUS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\FRAPROPF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
				//				SupportClasses.FORMS40.SetRecordProperty(1, "FRRPRPI", SupportClasses.Property.STATUS, SupportClasses.Constants.QUERY_STATUS);
//				System.err.println("// F2J_NOT_SUPPORTED : The property 'RECORD's STATUS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\FRAPROPF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
				
				// 
				getFormModel().getFormHeader().setPostQueryInd(toStr("N"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI.WHEN-NEW-RECORD-INSTANCE
		 <multilinecomment>IF :SYSTEM.MODE <> 'QUERY' THEN
   IF :FRRPRPI_ID_IND = '001' THEN
     SET_ITEM_PROPERTY('FRRPRPI_ID',INSERT_ALLOWED,PROPERTY_OFF);
     SET_ITEM_PROPERTY('FRRPRPI_ID',UPDATE_ALLOWED,PROPERTY_OFF);
     SET_ITEM_PROPERTY('FRRPRPI_ID_IND',INSERT_ALLOWED,PROPERTY_OFF);
     SET_ITEM_PROPERTY('FRRPRPI_ID_IND',UPDATE_ALLOWED,PROPERTY_OFF);
   ELSE
     SET_ITEM_PROPERTY('FRRPRPI_ID',INSERT_ALLOWED,PROPERTY_ON);
     SET_ITEM_PROPERTY('FRRPRPI_ID',UPDATE_ALLOWED,PROPERTY_ON);
     SET_ITEM_PROPERTY('FRRPRPI_ID_IND',INSERT_ALLOWED,PROPERTY_ON);
     SET_ITEM_PROPERTY('FRRPRPI_ID_IND',UPDATE_ALLOWED,PROPERTY_ON);
   END IF; </multilinecomment>
--
-- Fix for defect # 1-DL9B5 begins
-- Checks whether the person is employee or not and populate the field.
IF :FRRPRPI_ID IS NOT NULL THEN
  EXECUTE_TRIGGER('CHECK_EMPLOYEE');
  G$_CHECK_FAILURE;
END IF;
-- Fix for defect # 1-DL9B5 ends

  EXECUTE_TRIGGER('FORCE_COMMIT');
  G$_CHECK_FAILURE;
   
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void frrprpi_recordChange()
		{
			
				// IF :SYSTEM.MODE <> 'QUERY' THEN
				// IF :FRRPRPI_ID_IND = '001' THEN
				// SET_ITEM_PROPERTY('FRRPRPI_ID',INSERT_ALLOWED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('FRRPRPI_ID',UPDATE_ALLOWED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('FRRPRPI_ID_IND',INSERT_ALLOWED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('FRRPRPI_ID_IND',UPDATE_ALLOWED,PROPERTY_OFF);
				// ELSE
				// SET_ITEM_PROPERTY('FRRPRPI_ID',INSERT_ALLOWED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('FRRPRPI_ID',UPDATE_ALLOWED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('FRRPRPI_ID_IND',INSERT_ALLOWED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('FRRPRPI_ID_IND',UPDATE_ALLOWED,PROPERTY_ON);
				// END IF; 
				// 
				//  Fix for defect # 1-DL9B5 begins
				//  Checks whether the person is employee or not and populate the field.

				//F2J_WARNING : Caution, the variable may be null.
				FrrprpiAdapter frrprpiElement = (FrrprpiAdapter)this.getFormModel().getFrrprpi().getRowAdapter(true);


				// IF :SYSTEM.MODE <> 'QUERY' THEN
				// IF :FRRPRPI_ID_IND = '001' THEN
				// SET_ITEM_PROPERTY('FRRPRPI_ID',INSERT_ALLOWED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('FRRPRPI_ID',UPDATE_ALLOWED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('FRRPRPI_ID_IND',INSERT_ALLOWED,PROPERTY_OFF);
				// SET_ITEM_PROPERTY('FRRPRPI_ID_IND',UPDATE_ALLOWED,PROPERTY_OFF);
				// ELSE
				// SET_ITEM_PROPERTY('FRRPRPI_ID',INSERT_ALLOWED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('FRRPRPI_ID',UPDATE_ALLOWED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('FRRPRPI_ID_IND',INSERT_ALLOWED,PROPERTY_ON);
				// SET_ITEM_PROPERTY('FRRPRPI_ID_IND',UPDATE_ALLOWED,PROPERTY_ON);
				// END IF; 
				// 
				//  Fix for defect # 1-DL9B5 begins
				//  Checks whether the person is employee or not and populate the field.
				if ( !frrprpiElement.getFrrprpiId().isNull() )
				{
					executeAction("CHECK_EMPLOYEE");
					getTask().getGoqrpls().gCheckFailure();
				}
				//  Fix for defect # 1-DL9B5 ends
				executeAction("FORCE_COMMIT");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI.POST-RECORD
		 declare
 temp    varchar2(1);
 cursor check_001 is
  select 'X'
    from frrprpi
     where frrprpi_prop_code = :frrprpi_prop_code
       and frrprpi_id_ind = '001'
       and frrprpi.rowid = :frrprpi.rowid;
begin
 if :frrprpi_id_ind = '001' then 
   if (:frbprop_pi_id_code <> :frrprpi_id or :frbprop_pi_id_code is null) then
       :frbprop_pi_id_code := :frrprpi_id;
       :frrprpi_frbprop_copy_id := 'Y'; 
   end if;
 else
  open check_001;
  fetch check_001 into temp;
    if check_001%FOUND then
        :frbprop_pi_id_code := '';
        :frrprpi_frbprop_copy_id := 'Y';
    end if;   
 end if;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI.POST-RECORD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-RECORD")
		public void frrprpi_PostRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprpiAdapter frrprpiElement = (FrrprpiAdapter)this.getFormModel().getFrrprpi().getRowAdapter(true);
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				{
					NString temp= NString.getNull();
					String sqlcheck001 = "SELECT 'X' " +
	" FROM frrprpi " +
	" WHERE frrprpi_prop_code = :FRRPRPI_PROP_CODE AND frrprpi_id_ind = '001' AND frrprpi.rowid = :FRRPRPI_ROWID ";
					DataCursor check001 = new DataCursor(sqlcheck001);
					try {
						if ( frrprpiElement.getFrrprpiIdInd().equals("001") )
						{
							if ((frbpropElement.getFrbpropPiIdCode().notEquals(frrprpiElement.getFrrprpiId()) || frbpropElement.getFrbpropPiIdCode().isNull()))
							{
								frbpropElement.setFrbpropPiIdCode(frrprpiElement.getFrrprpiId());
								getFormModel().getFormHeader().setFrrprpiFrbpropCopyId(toStr("Y"));
							}
						}
						else {
							//Setting query parameters
							check001.addParameter("FRRPRPI_PROP_CODE", frrprpiElement.getFrrprpiPropCode());
							check001.addParameter("FRRPRPI_ROWID", frrprpiElement.getROWID());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable check001.
							check001.open();
							ResultSet check001Results = check001.fetchInto();
							if ( check001Results != null ) {
								temp = check001Results.getStr(0);
							}
							if ( check001.found() )
							{
								frbpropElement.setFrbpropPiIdCode(toStr(""));
								getFormModel().getFormHeader().setFrrprpiFrbpropCopyId(toStr("Y"));
							}
						}
					}
					finally{
						check001.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI.KEY-DUPREC
		 EXECUTE_TRIGGER('CALL_FORM_EVENT');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void frrprpi_CopyRecord()
		{
			
				executeAction("CALL_FORM_EVENT");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI.KEY-DUP-ITEM
		 EXECUTE_TRIGGER('CALL_FORM_FOAETXT');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void frrprpi_KeyDupItem()
		{
			
				executeAction("CALL_FORM_FOAETXT");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI.POST-UPDATE
		 <multilinecomment>IF CHECK_PI_PIDM_EQUAL THEN
   UPDATE_FRBPROP_1;
   G$_CHECK_FAILURE;
END IF;</multilinecomment>
null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI.POST-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowUpdate
		public void frrprpi_AfterRowUpdate(RowAdapterEvent args)
		{
			
				// IF CHECK_PI_PIDM_EQUAL THEN
				// UPDATE_FRBPROP_1;
				// G$_CHECK_FAILURE;
				// END IF;
				// IF CHECK_PI_PIDM_EQUAL THEN
				// UPDATE_FRBPROP_1;
				// G$_CHECK_FAILURE;
				// END IF;
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI.KEY-DELREC
		 if :del_ready = 'N' then
   :del_ready := 'Y';
   message(G$_NLS.Get('FRAPROP-0145', 'FORM','Press ''Delete Record'' again to Delete this Record.'));
   raise form_trigger_failure;
end if;
   
:del_ready := 'N';

IF :FRRPRPI_ID_IND = '001' THEN
   DELETE_RECORD;
       :frbprop_pi_id_code := '';
       :frbprop_pi_pidm := '';
       :frrprpi_frbprop_copy_id := 'Y';
ELSE
  DELETE_RECORD;
END IF; 
--
 EXECUTE_TRIGGER('FORCE_COMMIT');
 G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void frrprpi_DeleteRecord()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprpiAdapter frrprpiElement = (FrrprpiAdapter)this.getFormModel().getFrrprpi().getRowAdapter(true);
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( getFormModel().getFormHeader().getDelReady().equals("N") )
				{
					getFormModel().getFormHeader().setDelReady(toStr("Y"));
					warningMessage(GNls.Fget(toStr("FRAPROP-0145"), toStr("FORM"), toStr("Press 'Delete Record' again to Delete this Record.")));
					throw new ApplicationException();
				}
				getFormModel().getFormHeader().setDelReady(toStr("N"));
				if ( frrprpiElement.getFrrprpiIdInd().equals("001") )
				{
					deleteRecord();
					frbpropElement.setFrbpropPiIdCode(toStr(""));
					frbpropElement.setFrbpropPiPidm(toNumber(""));
					getFormModel().getFormHeader().setFrrprpiFrbpropCopyId(toStr("Y"));
				}
				else {
					deleteRecord();
				}
				// 
				executeAction("FORCE_COMMIT");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void frrprpi_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

                // F2J_WARNING : Caution, the variable may be null.                  
                FrbpropAdapter frbpropElement = (FrbpropAdapter) this.getFormModel().getFrbprop().getRowAdapter();                       
				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("FRBPROP_CODE", frbpropElement.getFrbpropCode()));             


           
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EVENTS_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="EVENTS_BTN")
		public void eventsBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick(); //.click();
			}

		
		/* Original PL/SQL code code for TRIGGER EVENTS_BTN.WHEN-BUTTON-PRESSED
		 DO_KEY('DUPLICATE_RECORD');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * EVENTS_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="EVENTS_BTN")
		public void eventsBtn_buttonClick()
		{
			
				executeAction("DUPLICATE_RECORD");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TEXT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TEXT_BTN")
		public void textBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick(); //.click();
			}

		
		/* Original PL/SQL code code for TRIGGER TEXT_BTN.WHEN-BUTTON-PRESSED
		 DO_KEY('DUPLICATE_ITEM');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * TEXT_BTN.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="TEXT_BTN")
		public void textBtn_buttonClick()
		{
			
				// F2J_NOT_SUPPORTED *: Call to built-in "DO_KEY" was removed because it is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\FRAPROPF2NMigrationGuide.xml#DefaultExcludeBuiltin3".
				//				SupportClasses.SQLFORMS.DoKey("DUPLICATE_ITEM");
//				System.err.println("// F2J_NOT_SUPPORTED : Call to built-in 'DO_KEY' was removed because it is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\FRAPROPF2NMigrationGuide.xml#DefaultExcludeBuiltin3'.");
				
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="FRRPRPI_ID", function=KeyFunction.ITEM_IN)
		public void frrprpiId_itemIn()
		{
			
				getGIdClass().itemIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRRPRPI_ID", function=KeyFunction.NEXT_ITEM)
		public void frrprpiId_keyNexItem()
		{
			
				getGIdClass().keyNexItem(); //.nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRRPRPI_ID")
		public void frrprpiId_PostChange()
		{
			
				getGIdClass().postChange();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI_ID.KEY-CQUERY
		 BEGIN
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER1, 'FOIIDEN', 'QUERY');
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
       MESSAGE( G$_NLS.Get('FRAPROP-0146', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="FRRPRPI_ID", function=KeyFunction.COUNT_QUERY)
		public void frrprpiId_TotalResults()
		{
			
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FOIIDEN"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") || (
							//Morphis TODO
//							SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.UPDATE_NULL).equals("TRUE") && 
//							(SupportClasses.AppContext.CursorValue) == null) ||
							(INullable)getItemValue(getCursorItem())).isNull() ||
							(!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAPROP-0146"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI_ID.WHEN-VALIDATE-ITEM
		 IF  :FRRPRPI_ID IS NULL THEN
  RETURN;
END IF;
--
IF :POST_QUERY_IND = 'Y' THEN
  RETURN;
END IF;
--
IF :SYSTEM.MODE = 'QUERY' THEN
  RETURN;
END IF;
--
DECLARE
  hold_orgn    frrprpi.frrprpi_orgn_code%type;
   	
  CURSOR get_orgn IS
    SELECT TO_CHAR(FTVFMGR_TERM_DATE, 'YYYYMMDDHH24MISS'),
           FTVFMGR_STATUS_IND, FTVFMGR_ORGN_CODE
    FROM   FTVFMGR
    WHERE  FTVFMGR_FMGR_CODE_PIDM = :frrprpi_id_pidm
      AND  FTVFMGR_EFF_DATE <= SYSDATE
      AND  (FTVFMGR_NCHG_DATE > SYSDATE OR FTVFMGR_NCHG_DATE IS NULL);
BEGIN
  :frrprpi_id_name := '';
  g$_sel_spriden_pidm_name(:FRRPRPI_ID, 'FRRPRPI_ID_NAME', 'Y', :frrprpi_id_pidm);
  --
  IF :FRRPRPI_ORGN_CODE IS NULL THEN 
    OPEN get_orgn;
    FETCH get_orgn INTO :WORKFLD, :WORK_STATUS_IND, hold_orgn;
    if get_orgn%NOTFOUND then
      goto get_val;
    end if;  
    --
    EXECUTE_TRIGGER( 'TEST_TABLE_STATUS' );
    if NOT FORM_SUCCESS then
      hold_orgn := '';
    end if;
  
    EXECUTE_TRIGGER( 'TEST_TABLE_TERM' );
    if NOT FORM_SUCCESS then
      hold_orgn := '';
    end if; 
    :frrprpi_orgn_code := hold_orgn;
  END IF;
  --         
  <<GET_VAL>>
  execute_trigger('check_employee');
  g$_check_failure; 
END;
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRPRPI_ID")
		public void frrprpiId_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprpiAdapter frrprpiElement = (FrrprpiAdapter)this.getFormModel().getFrrprpi().getRowAdapter(true);


				int rowCount = 0;
			this.frrprpiId_PostChange();

				if ( frrprpiElement.getFrrprpiId().isNull() )
				{
					return ;
				}
				// 
				if ( getFormModel().getFormHeader().getPostQueryInd().equals("Y") )
				{
					return ;
				}
				// 
				if ( getMode().equals("QUERY") )
				{
					return ;
				}
				{
					NString holdOrgn= NString.getNull();
					String sqlgetOrgn = "SELECT TO_CHAR(FTVFMGR_TERM_DATE, 'YYYYMMDDHH24MISS'), FTVFMGR_STATUS_IND, FTVFMGR_ORGN_CODE " +
	" FROM FTVFMGR " +
	" WHERE FTVFMGR_FMGR_CODE_PIDM = :FRRPRPI_ID_PIDM AND FTVFMGR_EFF_DATE <= SYSDATE AND (FTVFMGR_NCHG_DATE > SYSDATE OR FTVFMGR_NCHG_DATE IS NULL) ";
					DataCursor getOrgn = new DataCursor(sqlgetOrgn);
					try {
						frrprpiElement.setFrrprpiIdName(toStr(""));
						Ref<NString> pId_ref = new Ref<NString>(frrprpiElement.getFrrprpiId());
						Ref<NNumber> pPidm_ref = new Ref<NNumber>(frrprpiElement.getFrrprpiIdPidm());
						getTask().getGoqrpls().gSelSpridenPidmName(pId_ref, toStr("FRRPRPI_ID_NAME"), toStr("Y"), pPidm_ref);
						frrprpiElement.setFrrprpiId(pId_ref.val);
						frrprpiElement.setFrrprpiIdPidm(pPidm_ref.val);
						// 
						if ( frrprpiElement.getFrrprpiOrgnCode().isNull() )
						{
							//Setting query parameters
							getOrgn.addParameter("FRRPRPI_ID_PIDM", frrprpiElement.getFrrprpiIdPidm());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable getOrgn.
							getOrgn.open();
							ResultSet getOrgnResults = getOrgn.fetchInto();
							if ( getOrgnResults != null ) {
								getFormModel().getFormHeader().setWorkfld(getOrgnResults.getStr(0));
								getFormModel().getFormHeader().setWorkStatusInd(getOrgnResults.getStr(1));
								holdOrgn = getOrgnResults.getStr(2);
							}
							if ( getOrgn.notFound() )
							{
//								 goto GET_VAL;
//								 GET_VAL:;
									executeAction("check_employee");
									getTask().getGoqrpls().gCheckFailure();
									return;
							}
							// 
							try {
								executeAction("TEST_TABLE_STATUS");
							}
							catch (Exception e) 
//							if ( SupportClasses.SQLFORMS.FormSuccess().not() )
							{
								// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
								holdOrgn = toStr("");
							}
							try {
								executeAction("TEST_TABLE_TERM");
							}
							catch(Exception e)
//							if ( SupportClasses.SQLFORMS.FormSuccess().not() )
							{
								// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
								holdOrgn = toStr("");
							}
							frrprpiElement.setFrrprpiOrgnCode(holdOrgn);
						}
						 GET_VAL:;
						executeAction("check_employee");
						getTask().getGoqrpls().gCheckFailure();
					}
					finally{
						getOrgn.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI_ID.KEY-LISTVAL
		 BEGIN
:GLOBAL.PERSONNEL_CODE := 'Y';
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER1, 'FTIIDEN', 'QUERY');
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
       MESSAGE( G$_NLS.Get('FRAPROP-0147', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRRPRPI_ID", function=KeyFunction.LIST_VALUES)
		public void frrprpiId_ListValues()
		{
			
				setGlobal("PERSONNEL_CODE", toStr("Y"));
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FTIIDEN"), toStr("QUERY"));
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
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAPROP-0147"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID_NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRRPRPI_ID_NAME", function=KeyFunction.NEXT_ITEM)
		public void frrprpiIdName_keyNexItem()
		{
			
				getGNameClass().keyNexItem(); //.nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID_IND.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRRPRPI_ID_IND")
		public void frrprpiIdInd_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick(); //.doubleClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID_IND.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRRPRPI_ID_IND", function=KeyFunction.ITEM_CHANGE)
		public void frrprpiIdInd_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID_IND.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRRPRPI_ID_IND")
		public void frrprpiIdInd_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRRPRPI_ID_IND", function=KeyFunction.NEXT_ITEM)
		public void frrprpiIdInd_keyNexItem()
		{
			
				getGCodeClass().keyNexItem(); //.nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI_ID_IND.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVSDAT_SDAT_CODE_OPT_1', 'FTVSDAT_TITLE',
   'WHERE FTVSDAT_SDAT_CODE_ENTITY = ''FRRPRPI'''||
   ' AND FTVSDAT_SDAT_CODE_ATTR = ''ID_INDICATOR'''||
   ' AND FTVSDAT_EFF_DATE < SYSDATE'||
   ' AND (FTVSDAT_NCHG_DATE IS NULL'||
   '  OR  FTVSDAT_NCHG_DATE > SYSDATE)'||
   ' AND FTVSDAT_STATUS_IND = ''A''');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID_IND.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRRPRPI_ID_IND")
		public void frrprpiIdInd_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVSDAT_SDAT_CODE_OPT_1"), toStr("FTVSDAT_TITLE"), toStr("WHERE FTVSDAT_SDAT_CODE_ENTITY = 'FRRPRPI'").append(" AND FTVSDAT_SDAT_CODE_ATTR = 'ID_INDICATOR'").append(" AND FTVSDAT_EFF_DATE < SYSDATE").append(" AND (FTVSDAT_NCHG_DATE IS NULL").append("  OR  FTVSDAT_NCHG_DATE > SYSDATE)").append(" AND FTVSDAT_STATUS_IND = 'A'"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI_ID_IND.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
--
if :frrprpi_id_ind is null then
   :frrprpi_id_ind_name := '';
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID_IND.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRRPRPI_ID_IND", function=KeyFunction.ITEM_OUT)
		public void frrprpiIdInd_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprpiAdapter frrprpiElement = (FrrprpiAdapter)this.getFormModel().getFrrprpi().getRowAdapter(true);


				getTask().getGoqrpls().getGSearch().postTextCode();
				// 
				if ( frrprpiElement.getFrrprpiIdInd().isNull() )
				{
					frrprpiElement.setFrrprpiIdIndName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI_ID_IND.KEY-LISTVAL
		 BEGIN
:GLOBAL.SDAT_COAS := '';
:GLOBAL.SDAT_ENTITY := 'FRRPRPI';
:GLOBAL.SDAT_ATTR := 'ID_INDICATOR';
--
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER1, 'FOQSDLV', 'QUERY');
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
       MESSAGE( G$_NLS.Get('FRAPROP-0148', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID_IND.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRRPRPI_ID_IND", function=KeyFunction.LIST_VALUES)
		public void frrprpiIdInd_ListValues()
		{
			
				setGlobal("SDAT_COAS", toStr(""));
				setGlobal("SDAT_ENTITY", toStr("FRRPRPI"));
				setGlobal("SDAT_ATTR", toStr("ID_INDICATOR"));
				// 
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FOQSDLV"), toStr("QUERY"));
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
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAPROP-0148"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI_ID_IND.POST-CHANGE
		 if :SYSTEM.MODE <> 'QUERY' then
   if :frrprpi_id_ind = '001' then
     if check_pi_pidm_equal then
         message( G$_NLS.Get('FRAPROP-0149', 'FORM','You cannot create another Primary Principal Investigator.') );
         Raise Form_Trigger_Failure;
      end if;
  end if;
end if;
--
declare
 cursor c1 is 
  select ftvsdat_title
   from ftvsdat
     where ftvsdat_sdat_code_entity = 'FRRPRPI'
       and ftvsdat_sdat_code_attr = 'ID_INDICATOR'
       and ftvsdat_sdat_code_opt_1 = :frrprpi_id_ind
       and ftvsdat_eff_date <= sysdate
       and (ftvsdat_nchg_date is null
       or ftvsdat_nchg_date > sysdate)
       and ftvsdat_status_ind = 'A';
begin
 open c1;
   fetch c1 into :frrprpi_id_ind_name;
      if c1%notfound then
         message( G$_NLS.Get('FRAPROP-0150', 'FORM','ID Indicator is invalid. LIST is available.') );
         close c1;
         raise form_trigger_failure;
      end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID_IND.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRRPRPI_ID_IND")
		public void frrprpiIdInd_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprpiAdapter frrprpiElement = (FrrprpiAdapter)this.getFormModel().getFrrprpi().getRowAdapter(true);


				int rowCount = 0;
				if(frrprpiElement.getFrrprpiIdInd().isNull())
		return;
				if ( !getMode().equals("QUERY") )
				{
					if ( frrprpiElement.getFrrprpiIdInd().equals("001") )
					{
						if ( this.getTask().getServices().checkPiPidmEqual(frrprpiElement).getValue() )
						{
							errorMessage(GNls.Fget(toStr("FRAPROP-0149"), toStr("FORM"), toStr("You cannot create another Primary Principal Investigator.")));
							throw new ApplicationException();
						}
					}
				}
				{
					String sqlc1 = "SELECT ftvsdat_title " +
	" FROM ftvsdat " +
	" WHERE ftvsdat_sdat_code_entity = 'FRRPRPI' AND ftvsdat_sdat_code_attr = 'ID_INDICATOR' AND ftvsdat_sdat_code_opt_1 = :FRRPRPI_ID_IND AND ftvsdat_eff_date <= sysdate AND (ftvsdat_nchg_date IS NULL OR ftvsdat_nchg_date > sysdate) AND ftvsdat_status_ind = 'A' ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("FRRPRPI_ID_IND", frrprpiElement.getFrrprpiIdInd());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							frrprpiElement.setFrrprpiIdIndName(c1Results.getStr(0));
						}
						if ( c1.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAPROP-0150"), toStr("FORM"), toStr("ID Indicator is invalid. LIST is available.")));
							c1.close();
							throw new ApplicationException();
						}
					}
					finally{
						c1.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID_IND_NAME.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRRPRPI_ID_IND_NAME", function=KeyFunction.ITEM_CHANGE)
		public void frrprpiIdIndName_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI_ORGN_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVORGN_ORGN_CODE', 'FTVORGN_TITLE', 
   G$_SEARCH_WHERE.F_FTVORGN_ENTRY(':FRBPROP_COAS_CODE', 'SYSDATE'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ORGN_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRRPRPI_ORGN_CODE")
		public void frrprpiOrgnCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVORGN_ORGN_CODE"), toStr("FTVORGN_TITLE"), getTask().getGoqrpls().getGSearchWhere().fFtvorgnEntry(toStr(":FRBPROP_COAS_CODE"), toStr("SYSDATE")));
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI_ORGN_CODE.KEY-LISTVAL
		 BEGIN
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER1, 'FTVORGN', 'QUERY');
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
       MESSAGE( G$_NLS.Get('FRAPROP-0151', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ORGN_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRRPRPI_ORGN_CODE", function=KeyFunction.LIST_VALUES)
		public void frrprpiOrgnCode_ListValues()
		{
			
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FTVORGN"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") || (
							//Morphis TODO	
//							(SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.UPDATE_NULL).equals("TRUE") && 
//							(SupportClasses.AppContext.CursorValue) == null) || 
							(INullable)getItemValue(getCursorItem())).isNull() ||
							(!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAPROP-0151"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI_ORGN_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF :FRBPROP_ORGN_CODE_RESP_OFFICE  IS  NOT NULL  THEN
   	  :FORM_HEADER.ORG_P_VALIDATE_FLAG := 'Y';   --1-113DE2
      EXECUTE_TRIGGER( 'EDIT_ORGN_CODE_FRRPRPI' ) ;
      G$_CHECK_FAILURE ;
   END IF;
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
		 * FRRPRPI_ORGN_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRRPRPI_ORGN_CODE")
		public void frrprpiOrgnCode_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
				FrrprpiAdapter frrprpiElement = (FrrprpiAdapter)this.getFormModel().getFrrprpi().getRowAdapter(true);


				if(frrprpiElement.getFrrprpiOrgnCode().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if ( !frbpropElement.getFrbpropOrgnCodeRespOffice().isNull() )
					{
						getFormModel().getFormHeader().setOrgPValidateFlag(toStr("Y"));
						// 1-113DE2
						executeAction("EDIT_ORGN_CODE_FRRPRPI");
						getTask().getGoqrpls().gCheckFailure();
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

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ORGN_CODE_NAME.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRRPRPI_ORGN_CODE_NAME", function=KeyFunction.ITEM_CHANGE)
		public void frrprpiOrgnCodeName_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI_EMPLOYEE_IND.WHEN-VALIDATE-ITEM
		 if :frrprpi_employee_ind is not null and
   :frrprpi_employee_ind not in('Y','N')  then
      message( G$_NLS.Get('FRAPROP-0152', 'FORM','Invalid Employee Indicator. Enter Y or N.') );
        Raise Form_Trigger_Failure;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_EMPLOYEE_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRPRPI_EMPLOYEE_IND")
		public void frrprpiEmployeeInd_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrrprpiAdapter frrprpiElement = (FrrprpiAdapter)this.getFormModel().getFrrprpi().getRowAdapter(true);


				if ( !frrprpiElement.getFrrprpiEmployeeInd().isNull() && !in(frrprpiElement.getFrrprpiEmployeeInd(), "Y", "N").getValue() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0152"), toStr("FORM"), toStr("Invalid Employee Indicator. Enter Y or N.")));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ORGN_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRRPRPI_ORGN_CODE_LBT")
		public void frrprpiOrgnCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick(); //.click();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI_ID_PIDM.PRE-TEXT-ITEM
		 <multilinecomment>if :frrprpi_id_pidm is null then
    :frrprpi_id := :frbprop_pi_id_code;
    :frrprpi_id_ind := '001';
    :frrprpi_id_pidm := :frbprop_pi_pidm;
end if;</multilinecomment>
null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID_PIDM.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="FRRPRPI_ID_PIDM", function=KeyFunction.ITEM_IN)
		public void frrprpiIdPidm_itemIn()
		{
			
				// if :frrprpi_id_pidm is null then
				// :frrprpi_id := :frbprop_pi_id_code;
				// :frrprpi_id_ind := '001';
				// :frrprpi_id_pidm := :frbprop_pi_pidm;
				// end if;
				// if :frrprpi_id_pidm is null then
				// :frrprpi_id := :frbprop_pi_id_code;
				// :frrprpi_id_ind := '001';
				// :frrprpi_id_pidm := :frbprop_pi_pidm;
				// end if;
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRRPRPI_ID_LBT")
		public void frrprpiIdLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick(); //.click();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRPRPI_ID_LBT.WHEN-BUTTON-PRESSED
		 :GLOBAL.FORM_WAS_CALLED := 'Y';
G$_KEY_OPT_MENU('FRRPRPI_ID',
                 G$_NLS.Get('FRAPROP-0153', 'FORM','List of Proposal Personnel (FTIIDEN)') ,'LIST_VALUES',
                 G$_NLS.Get('FRAPROP-0154', 'FORM','Person Search Form (FOIIDEN)') ,'COUNT_QUERY',
                '','',
                '','');
:GLOBAL.FORM_WAS_CALLED := 'N';

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRRPRPI_ID_LBT")
		public void frrprpiIdLbt_buttonClick()
		{
			
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				getTask().getGoqrpls().gKeyOptMenu(toStr("FRRPRPI_ID"), GNls.Fget(toStr("FRAPROP-0153"), toStr("FORM"), toStr("List of Proposal Personnel (FTIIDEN)")), toStr("LIST_VALUES"), GNls.Fget(toStr("FRAPROP-0154"), toStr("FORM"), toStr("Person Search Form (FOIIDEN)")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID_IND_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRRPRPI_ID_IND_LBT")
		public void frrprpiIdIndLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick(); //.click();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ID_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRPRPI_ID_IND")
		public void frrprpiIdInd_validate()
		{
			
				FrrprpiAdapter frrprpiElement = (FrrprpiAdapter)this.getFormModel().getFrrprpi().getRowAdapter(true);
							this.frrprpiIdInd_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRPRPI_ORGN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRPRPI_ORGN_CODE")
		public void frrprpiOrgnCode_validate()
		{
			
				FrrprpiAdapter frrprpiElement = (FrrprpiAdapter)this.getFormModel().getFrrprpi().getRowAdapter(true);
							this.frrprpiOrgnCode_PostChange();

			}

		
	
	
}

