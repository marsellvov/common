package net.hedtech.banner.finance.common.Fragrnt.controller;
 
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
import morphis.foundations.core.appsupportlib.runtime.web.message.OutputMessage.OutputMessageUserResponse;
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
import net.hedtech.general.common.libraries.Goqolib.services.GNonIconBtnClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIdClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GNameClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIconBtnClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FrrgrpiController extends DefaultBlockController {

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

	
	public FrrgrpiController(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER FRRGRPI.PRE-UPDATE
		 BEGIN
   IF G$_NCHK(:commit_ind <> 'Y') THEN
      MESSAGE(  G$_NLS.Get('FRAGRNT-0205', 'FORM','Select SAVE to perform a Commit.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
--
  EXECUTE_TRIGGER('UPDATE_ACTIVITY_DATE');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('UPDATE_USER_ID');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void frrgrpi_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				if ( getTask().getGoqrpls().gNchk(toBool(getFormModel().getFormHeader().getCommitInd().notEquals("Y"))).getValue() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0205"), toStr("FORM"), toStr("Select SAVE to perform a Commit.")));
					throw new ApplicationException();
				}
				// 
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI.PRE-INSERT
		 BEGIN
   IF G$_NCHK(:commit_ind <> 'Y') THEN
      MESSAGE(  G$_NLS.Get('FRAGRNT-0206', 'FORM','Select SAVE to perform a Commit.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
--
  EXECUTE_TRIGGER('UPDATE_ACTIVITY_DATE');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('UPDATE_USER_ID');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void frrgrpi_BeforeRowInsert(RowAdapterEvent args)
		{
			
				if ( getTask().getGoqrpls().gNchk(toBool(getFormModel().getFormHeader().getCommitInd().notEquals("Y"))).getValue() )
				{
					warningMessage(GNls.Fget(toStr("FRAGRNT-0206"), toStr("FORM"), toStr("Select SAVE to perform a Commit.")));
					throw new ApplicationException();
				}
				// 
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI.POST-QUERY
		 
--after execute_query on frrgrpi
  :POST_QUERY_IND := 'Y';
  EXECUTE_TRIGGER('GET_ID_CODE');
  G$_CHECK_FAILURE;
  :frrgrpi_COAS := :frbgrnt_COAS_CODE;
-- for rollback
    SET_RECORD_PROPERTY(1,'frrgrpi',STATUS,QUERY_STATUS);
--
   :POST_QUERY_IND := 'N';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void frrgrpi_AfterQuery(RowAdapterEvent args)
		{
			
				// after execute_query on frrgrpi
				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)args.getRow();
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);



				try
				{
					frrgrpiElement.setLockDbValues(true);
                                                                 try {  
                        this.frrgrpiId_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frrgrpiIdInd_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frrgrpiOrgnCode_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frrgrpiAddrType_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frrgrpiAddrSeqno_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frrgrpiPhoneType_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                                                                this.frrgrpiBfrmCode_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 

//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 

				} finally { 
					frrgrpiElement.setLockDbValues(false);
				}
				// after execute_query on frrgrpi
				getFormModel().getFormHeader().setPostQueryInd(toStr("Y"));
				executeAction("GET_ID_CODE");
				getTask().getGoqrpls().gCheckFailure();
				frrgrpiElement.setFrrgrpiCoas(frbgrntElement.getFrbgrntCoasCode());
				//  for rollback
				frrgrpiElement.getRow().setStatus(DataRowStatus.UNCHANGED);				
				
				
				getFormModel().getFormHeader().setPostQueryInd(toStr("N"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI.WHEN-NEW-RECORD-INSTANCE
		 IF :FRRGRPI_ID IS NOT NULL THEN
  NEXT_ITEM;
  PREVIOUS_ITEM;
	-- Fix for defect # 1-DL9B5 begins
  -- Checks whether the person is employee or not and populate the field.
  EXECUTE_TRIGGER('CHECK_EMPLOYEE');
  G$_CHECK_FAILURE;
  -- Fix for defect # 1-DL9B5 ends
END IF;
EXECUTE_TRIGGER('FORCE_COMMIT');
G$_CHECK_FAILURE;
   
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void frrgrpi_recordChange()
		{
			

				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);
				
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter) this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				
				if(frrgrpiElement==null)
					return;

				if ( !frrgrpiElement.getFrrgrpiId().isNull() )
				{
					nextItem();
					previousItem();
					//  Fix for defect # 1-DL9B5 begins
					//  Checks whether the person is employee or not and populate the field.
					executeAction("CHECK_EMPLOYEE");
					getTask().getGoqrpls().gCheckFailure();
				}
				executeAction("FORCE_COMMIT");
				getTask().getGoqrpls().gCheckFailure();
				
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI.KEY-DUPREC
		 EXECUTE_TRIGGER('CALL_FORM_EVENT');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI.KEY-DUPREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void frrgrpi_CopyRecord()
		{
			
				executeAction("CALL_FORM_EVENT");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI.KEY-DUP-ITEM
		 EXECUTE_TRIGGER('CALL_FORM_FOAETXT');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void frrgrpi_KeyDupItem()
		{
			
				executeAction("CALL_FORM_FOAETXT");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI.POST-RECORD
		 declare
 temp    varchar2(1);
 cursor check_001 is
  select 'X'
    from frrgrpi
     where frrgrpi_grnt_code = :frrgrpi_grnt_code
       and frrgrpi_id_ind = '001'
       and frrgrpi.rowid = :frrgrpi.rowid;
begin
 if :frrgrpi_id_ind = '001' then 
   if (:frbgrnt_pi_id_code <> :frrgrpi_id or :frbgrnt_pi_id_code is null) then
       :frbgrnt_pi_id_code := :frrgrpi_id;
       :frrgrpi_frbgrnt_copy_id := 'Y'; 
   end if;
 else
  open check_001;
  fetch check_001 into temp;
    if check_001%FOUND then
        :frbgrnt_pi_id_code := '';
        :frrgrpi_frbgrnt_copy_id := 'Y';
    end if;   
 end if;
end;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI.POST-RECORD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-RECORD")
		public void frrgrpi_PostRecord()
		{
			

				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if(frrgrpiElement==null || frbgrntElement==null)
					return;

				int rowCount = 0;
				{
					NString temp= NString.getNull();
					String sqlcheck001 = "SELECT 'X' " +
	" FROM frrgrpi " +
	" WHERE frrgrpi_grnt_code = :FRRGRPI_GRNT_CODE AND frrgrpi_id_ind = '001' AND frrgrpi.rowid = :FRRGRPI_ROWID ";
					DataCursor check001 = new DataCursor(sqlcheck001);
					try {
						if ( frrgrpiElement.getFrrgrpiIdInd().equals("001") )
						{
							if ((frbgrntElement.getFrbgrntPiIdCode().notEquals(frrgrpiElement.getFrrgrpiId()) || frbgrntElement.getFrbgrntPiIdCode().isNull()))
							{
								frbgrntElement.setFrbgrntPiIdCode(frrgrpiElement.getFrrgrpiId());
								getFormModel().getFormHeader().setFrrgrpiFrbgrntCopyId(toStr("Y"));
							}
						}
						else {
							//Setting query parameters
							check001.addParameter("FRRGRPI_GRNT_CODE", frrgrpiElement.getFrrgrpiGrntCode());
							check001.addParameter("FRRGRPI_ROWID", frrgrpiElement.getROWID());
							check001.open();
							ResultSet check001Results = check001.fetchInto();
							if ( check001Results != null ) {
								temp = check001Results.getStr(0);
							}
							if ( check001.found() )
							{
								frbgrntElement.setFrbgrntPiIdCode(toStr(""));
								getFormModel().getFormHeader().setFrrgrpiFrbgrntCopyId(toStr("Y"));
							}
						}
					} finally {
						check001.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI.KEY-DELREC
		 if :del_ready = 'N' then
   :del_ready := 'Y';
   message(G$_NLS.Get('FRAGRNT-0207', 'FORM','Press ''Delete Record'' again to Delete this Record.'));
   raise form_trigger_failure;
end if;
   
:del_ready := 'N';

IF :FRRgrpi_ID_IND = '001' THEN
   DELETE_RECORD;
       :frbgrnt_pi_id_code := '';
       :frbgrnt_pi_pidm := '';
       :frrgrpi_frbgrnt_copy_id := 'Y';
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
		 * FRRGRPI.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void frrgrpi_DeleteRecord()
		{
			


				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if(frrgrpiElement!=null && frbgrntElement!=null){
				if ( getFormModel().getFormHeader().getDelReady().equals("N") )
				{
					getFormModel().getFormHeader().setDelReady(toStr("Y"));
					warningMessage(GNls.Fget(toStr("FRAGRNT-0207"), toStr("FORM"), toStr("Press 'Delete Record' again to Delete this Record.")));
					throw new ApplicationException();
				}
				getFormModel().getFormHeader().setDelReady(toStr("N"));
				if ( frrgrpiElement.getFrrgrpiIdInd().equals("001") )
				{
					deleteRecord();
					frbgrntElement.setFrbgrntPiIdCode(toStr(""));
					frbgrntElement.setFrbgrntPiPidm(toNumber(""));
					getFormModel().getFormHeader().setFrrgrpiFrbgrntCopyId(toStr("Y"));
				}
				else {
					deleteRecord();
				}
				// 
				executeAction("FORCE_COMMIT");
				getTask().getGoqrpls().gCheckFailure();
			}
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void frrgrpi_BeforeQuery(QueryEvent args)
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
		 * TEXT_BTN.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="TEXT_BTN")
		public void textBtn_click()
		{
			
				getGNonIconBtnClass().whenMouseClick();
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
				
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ID.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="FRRGRPI_ID", function=KeyFunction.ITEM_IN)
		public void frrgrpiId_itemIn()
		{
			
				getGIdClass().itemIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ID.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRRGRPI_ID", function=KeyFunction.NEXT_ITEM)
		public void frrgrpiId_keyNexItem()
		{
				findItem("FRRGRPI_ID").setValid(false);
				getGIdClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ID.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRRGRPI_ID")
		public void frrgrpiId_PostChange()
		{
			
				getGIdClass().postChange();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_ID.KEY-CQUERY
		 BEGIN
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FOIIDEN', 'QUERY');
   IF NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
      IF  GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),UPDATEABLE) = 'TRUE'
         OR (GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),UPDATE_NULL) = 'TRUE' AND
          :SYSTEM.CURSOR_VALUE IS NULL)
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
         MESSAGE( G$_NLS.Get('FRAGRNT-0208', 'FORM','*ERROR* Item is protected against update.') );              
      END IF;     
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ID.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="FRRGRPI_ID", function=KeyFunction.COUNT_QUERY)
		public void frrgrpiId_TotalResults()
		{
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FOIIDEN"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") ||  (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0208"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_ID.WHEN-VALIDATE-ITEM
		 IF  :FRRGRPI_ID IS NULL THEN
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
IF :CALLED_FROM_INQUIRY =1 THEN
	RETURN;
END IF;	

DECLARE
  hold_orgn    frrgrpi.frrgrpi_orgn_code%type;

  CURSOR get_orgn IS
    SELECT TO_CHAR(FTVFMGR_TERM_DATE, 'YYYYMMDDHH24MISS'),
           FTVFMGR_STATUS_IND, FTVFMGR_ORGN_CODE
    FROM   FTVFMGR
    WHERE  FTVFMGR_FMGR_CODE_PIDM = :frrgrpi_id_pidm
      AND  FTVFMGR_EFF_DATE <= SYSDATE
      AND  (FTVFMGR_NCHG_DATE > SYSDATE OR FTVFMGR_NCHG_DATE IS NULL);
BEGIN
	:FRRGRPI_ID_NAME := NULL;
  g$_sel_spriden_pidm_name(:FRRGRPI_ID, 'FRRGRPI_ID_NAME', 'Y', :frrgrpi_id_pidm);
  --
  IF :FRRgrpi_ORGN_CODE IS NULL THEN 
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
    :frrgrpi_orgn_code := hold_orgn;
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
		 * FRRGRPI_ID.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRGRPI_ID")
		public void frrgrpiId_validate()
		{
			

				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);

				if(frrgrpiElement==null)
					return;

				int rowCount = 0;
			this.frrgrpiId_PostChange();

				if ( frrgrpiElement.getFrrgrpiId().isNull() )
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
				// 
				if ( getFormModel().getFormHeader().getCalledFromInquiry().equals(1) )
				{
					return ;
				}
				{
					NString holdOrgn= NString.getNull();
					String sqlgetOrgn = "SELECT TO_CHAR(FTVFMGR_TERM_DATE, 'YYYYMMDDHH24MISS'), FTVFMGR_STATUS_IND, FTVFMGR_ORGN_CODE " +
	" FROM FTVFMGR " +
	" WHERE FTVFMGR_FMGR_CODE_PIDM = :FRRGRPI_ID_PIDM AND FTVFMGR_EFF_DATE <= SYSDATE AND (FTVFMGR_NCHG_DATE > SYSDATE OR FTVFMGR_NCHG_DATE IS NULL) ";
					DataCursor getOrgn = new DataCursor(sqlgetOrgn);
					try {
						frrgrpiElement.setFrrgrpiIdName(toStr(null));
						Ref<NString> pId_ref = new Ref<NString>(frrgrpiElement.getFrrgrpiId());
						Ref<NNumber> pPidm_ref = new Ref<NNumber>(frrgrpiElement.getFrrgrpiIdPidm());
						getTask().getGoqrpls().gSelSpridenPidmName(pId_ref, toStr("FRRGRPI_ID_NAME"), toStr("Y"), pPidm_ref);
						frrgrpiElement.setFrrgrpiId(pId_ref.val);
						frrgrpiElement.setFrrgrpiIdPidm(pPidm_ref.val);
						// 
						if ( frrgrpiElement.getFrrgrpiOrgnCode().isNull() )
						{
							//Setting query parameters
							getOrgn.addParameter("FRRGRPI_ID_PIDM", frrgrpiElement.getFrrgrpiIdPidm());
							getOrgn.open();
							ResultSet getOrgnResults = getOrgn.fetchInto();
							if ( getOrgnResults != null ) {
								getFormModel().getFormHeader().setWorkfld(getOrgnResults.getStr(0));
								getFormModel().getFormHeader().setWorkStatusInd(getOrgnResults.getStr(1));
								holdOrgn = getOrgnResults.getStr(2);
							}
							if ( !(getOrgn.notFound()) )
							{
	//							 goto GET_VAL;
	//						}
							// 
								try{
								executeAction("TEST_TABLE_STATUS");
									holdOrgn = toStr("");
								}catch(Exception e){
									throw new ApplicationException();
									}
								executeAction("TEST_TABLE_TERM");
								try{
									holdOrgn = toStr("");
								}catch(Exception e){
									throw new ApplicationException();
									}
								frrgrpiElement.setFrrgrpiOrgnCode(holdOrgn);
							}
						}
						 //GET_VAL:;
						executeAction("check_employee");
						getTask().getGoqrpls().gCheckFailure();
					} finally {
						getOrgn.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_ID.KEY-LISTVAL
		 BEGIN
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
:GLOBAL.PERSONNEL_CODE := 'Y';
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FTIIDEN', 'QUERY');
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0209', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ID.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRRGRPI_ID", function=KeyFunction.LIST_VALUES)
		public void frrgrpiId_ListValues()
		{
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("PERSONNEL_CODE", toStr("Y"));
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FTIIDEN"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") ||  (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0209"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ID_NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRRGRPI_ID_NAME", function=KeyFunction.NEXT_ITEM)
		public void frrgrpiIdName_keyNexItem()
		{
			
				getGNameClass().keyNexItem();
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
			
				getGNonIconBtnClass().whenMouseClick();
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
		 * FRRGRPI_ID_IND.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRRGRPI_ID_IND")
		public void frrgrpiIdInd_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ID_IND.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRRGRPI_ID_IND", function=KeyFunction.ITEM_CHANGE)
		public void frrgrpiIdInd_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ID_IND.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRRGRPI_ID_IND")
		public void frrgrpiIdInd_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ID_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRRGRPI_ID_IND", function=KeyFunction.NEXT_ITEM)
		public void frrgrpiIdInd_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_ID_IND.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVSDAT_SDAT_CODE_OPT_1', 'FTVSDAT_TITLE',
  'WHERE FTVSDAT_SDAT_CODE_ENTITY = ''FRRGRPI'''||
  ' AND FTVSDAT_SDAT_CODE_ATTR = ''ID_INDICATOR'''||
  ' AND FTVSDAT_EFF_DATE <= SYSDATE'||
  ' AND (FTVSDAT_NCHG_DATE IS NULL'||
  '  OR  FTVSDAT_NCHG_DATE > SYSDATE)'||
  ' AND FTVSDAT_STATUS_IND = ''A''');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ID_IND.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRRGRPI_ID_IND")
		public void frrgrpiIdInd_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVSDAT_SDAT_CODE_OPT_1"), toStr("FTVSDAT_TITLE"), toStr("WHERE FTVSDAT_SDAT_CODE_ENTITY = 'FRRGRPI'").append(" AND FTVSDAT_SDAT_CODE_ATTR = 'ID_INDICATOR'").append(" AND FTVSDAT_EFF_DATE <= SYSDATE").append(" AND (FTVSDAT_NCHG_DATE IS NULL").append("  OR  FTVSDAT_NCHG_DATE > SYSDATE)").append(" AND FTVSDAT_STATUS_IND = 'A'"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_ID_IND.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
--
if :frrgrpi_id_ind is null then
   :frrgrpi_id_ind_name := '';
end if; 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ID_IND.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRRGRPI_ID_IND", function=KeyFunction.ITEM_OUT)
		public void frrgrpiIdInd_itemOut()
		{
			

				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);

				if(frrgrpiElement==null)
					return;

				getTask().getGoqrpls().getGSearch().postTextCode();
				// 
				if ( frrgrpiElement.getFrrgrpiIdInd().isNull() )
				{
					frrgrpiElement.setFrrgrpiIdIndName(toStr(""));
				}
			}
		
		@ActionTrigger(action="PRE-TEXT-ITEM", item="FRRGRPI_ID_IND", function=KeyFunction.ITEM_IN)
		public void frrgrpiIdInd_itemIn()
		{
			setItemRequired(getCurrentItem(),true);
		}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_ID_IND.KEY-LISTVAL
		 BEGIN
G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
G$_CHECK_FAILURE;	
:GLOBAL.SDAT_COAS := '';
:GLOBAL.SDAT_ENTITY := 'FRRGRPI';
:GLOBAL.SDAT_ATTR := 'ID_INDICATOR';
--
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FOQSDLV', 'QUERY');
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0210', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ID_IND.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRRGRPI_ID_IND", function=KeyFunction.LIST_VALUES)
		public void frrgrpiIdInd_ListValues()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("SDAT_COAS", toStr(""));
				setGlobal("SDAT_ENTITY", toStr("FRRGRPI"));
				setGlobal("SDAT_ATTR", toStr("ID_INDICATOR"));
				// 
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FOQSDLV"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE")  || (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0210"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_ID_IND.POST-CHANGE
		 if :SYSTEM.MODE <> 'QUERY' then
   if :frrgrpi_id_ind = '001' then
     if check_pi_pidm_equal then
         message( G$_NLS.Get('FRAGRNT-0211', 'FORM','You cannot create another Primary Principal Investigator.') );
         Raise Form_Trigger_Failure;
      end if;
  end if;
end if;
--
declare
 cursor c1 is 
  select ftvsdat_title
   from ftvsdat
     where ftvsdat_sdat_code_entity = 'FRRGRPI'
       and ftvsdat_sdat_code_attr = 'ID_INDICATOR'
       and ftvsdat_sdat_code_opt_1 = :frrgrpi_id_ind
       and ftvsdat_eff_date <= sysdate
       and (ftvsdat_nchg_date is null
       or ftvsdat_nchg_date > sysdate)
       and ftvsdat_status_ind = 'A';
begin
 open c1;
   fetch c1 into :frrgrpi_id_ind_name;
      if c1%notfound then
         message( G$_NLS.Get('FRAGRNT-0212', 'FORM','ID Indicator is invalid. LIST is available.') );
         close c1;
         raise form_trigger_failure;
      end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ID_IND.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRRGRPI_ID_IND")
		public void frrgrpiIdInd_PostChange()
		{
			

				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);

				if(frrgrpiElement==null)
					return;

				int rowCount = 0;
				if(frrgrpiElement.getFrrgrpiIdInd().isNull())
		return;
				if ( !getMode().equals("QUERY") )
				{
					if ( frrgrpiElement.getFrrgrpiIdInd().equals("001") )
					{
						if ( this.getTask().getServices().checkPiPidmEqual(frrgrpiElement).getValue() )
						{
							errorMessage(GNls.Fget(toStr("FRAGRNT-0211"), toStr("FORM"), toStr("You cannot create another Primary Principal Investigator.")));
							throw new ApplicationException();
						}
					}
				}
				{
					String sqlc1 = "SELECT ftvsdat_title " +
	" FROM ftvsdat " +
	" WHERE ftvsdat_sdat_code_entity = 'FRRGRPI' AND ftvsdat_sdat_code_attr = 'ID_INDICATOR' AND ftvsdat_sdat_code_opt_1 = :FRRGRPI_ID_IND AND ftvsdat_eff_date <= sysdate AND (ftvsdat_nchg_date IS NULL OR ftvsdat_nchg_date > sysdate) AND ftvsdat_status_ind = 'A' ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("FRRGRPI_ID_IND", frrgrpiElement.getFrrgrpiIdInd());
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							frrgrpiElement.setFrrgrpiIdIndName(c1Results.getStr(0));
						}
						if ( c1.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAGRNT-0212"), toStr("FORM"), toStr("ID Indicator is invalid. LIST is available.")));
							throw new ApplicationException();
						}
					} finally { 
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_COAS.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVCOAS_CODE_COAS', 'FTVCOAS_TITLE', '');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_COAS.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRRGRPI_COAS")
		public void frrgrpiCoas_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVCOAS_CODE_COAS"), toStr("FTVCOAS_TITLE"), toStr(""));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ID_IND_NAME.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRRGRPI_ID_IND_NAME", function=KeyFunction.ITEM_CHANGE)
		public void frrgrpiIdIndName_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_ORGN_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVORGN_ORGN_CODE', 'FTVORGN_TITLE', 
   'WHERE FTVORGN_NCHG_DATE > SYSDATE'||
   '  AND FTVORGN_EFF_DATE <= SYSDATE'||
   '  AND (FTVORGN_TERM_DATE > SYSDATE'||
   '   OR FTVORGN_TERM_DATE IS NULL)'||
   '  AND FTVORGN_COAS_CODE = :FRBGRNT_COAS_CODE'||
   '  AND FTVORGN_STATUS_IND =''A''');


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ORGN_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRRGRPI_ORGN_CODE")
		public void frrgrpiOrgnCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVORGN_ORGN_CODE"), toStr("FTVORGN_TITLE"), toStr("WHERE FTVORGN_NCHG_DATE > SYSDATE").append("  AND FTVORGN_EFF_DATE <= SYSDATE").append("  AND (FTVORGN_TERM_DATE > SYSDATE").append("   OR FTVORGN_TERM_DATE IS NULL)").append("  AND FTVORGN_COAS_CODE = :FRBGRNT_COAS_CODE").append("  AND FTVORGN_STATUS_IND ='A'"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_ORGN_CODE.KEY-LISTVAL
		 BEGIN
G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
G$_CHECK_FAILURE;
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FTVORGN', 'QUERY');
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0213', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ORGN_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRRGRPI_ORGN_CODE", function=KeyFunction.LIST_VALUES)
		public void frrgrpiOrgnCode_ListValues()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FTVORGN"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") ||  (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0213"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_ORGN_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
       :FORM_HEADER.ORG_P_VALIDATE_FLAG := 'Y'; --1-BMV7IL
       EXECUTE_TRIGGER( 'EDIT_ORGN_CODE_FRRGRPI' ) ;
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
		 * FRRGRPI_ORGN_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRRGRPI_ORGN_CODE")
		public void frrgrpiOrgnCode_PostChange()
		{
			

				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);

				if(frrgrpiElement==null)
					return;

				if(frrgrpiElement.getFrrgrpiOrgnCode().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					getFormModel().getFormHeader().setOrgPValidateFlag(toStr("Y"));
					// 1-BMV7IL
					executeAction("EDIT_ORGN_CODE_FRRGRPI");
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

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ORGN_CODE_NAME.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRRGRPI_ORGN_CODE_NAME", function=KeyFunction.ITEM_CHANGE)
		public void frrgrpiOrgnCodeName_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_ADDR_TYPE.KEY-LISTVAL
		 BEGIN
  :GLOBAL.PIDM := :FRRGRPI_ID_PIDM;
--
   :GLOBAL.VALUE := '';
   G$_COPY_FLD_ATTR;
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'FOQADDR','QUERY');
--
   IF :GLOBAL.SEQNO IS NOT NULL THEN
      :frrgrpi_ADDR_SEQNO := :GLOBAL.SEQNO;
   END IF; 
--
   IF :GLOBAL.ATYP_CODE IS NOT NULL THEN
      :frrgrpi_addr_type  := :GLOBAL.ATYP_CODE ;
      GO_ITEM('frrgrpi_phone_type'); 
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ADDR_TYPE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRRGRPI_ADDR_TYPE", function=KeyFunction.LIST_VALUES)
		public void frrgrpiAddrType_ListValues()
		{
			

				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);

				if(frrgrpiElement==null)
					return;

				setGlobal("PIDM", toStr(frrgrpiElement.getFrrgrpiIdPidm()));
				// 
				setGlobal("VALUE", toStr(""));
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FOQADDR"), toStr("QUERY"));
				// 
				if ( !getGlobal("SEQNO").isNull() )
				{
					frrgrpiElement.setFrrgrpiAddrSeqno(toNumber(getGlobal("SEQNO")));
				}
				// 
				if ( !getGlobal("ATYP_CODE").isNull() )
				{
					frrgrpiElement.setFrrgrpiAddrType(getGlobal("ATYP_CODE"));
					goItem(toStr("frrgrpi_phone_type"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_ADDR_TYPE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
     DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   SPRADDR
         WHERE  SPRADDR_PIDM = :FRRGRPI.FRRGRPI_ID_PIDM  			    <multilinecomment>Added this line to fix the defect: 1-3V2XSE</multilinecomment>	                 
	   			 AND  SPRADDR_ATYP_CODE = :FRRGRPI.FRRGRPI_ADDR_TYPE
           --AND  SPRADDR_SEQNO = :FRRGRPI.FRRGRPI_ADDR_SEQNO	  <multilinecomment>Added this line to fix the defect: 1-3V2XSE commented because it was stopping to fetch the available valid addtresses</multilinecomment>
           AND  NVL(SPRADDR_STATUS_IND,'A') != 'I';               <multilinecomment>Added this line to fix the defect: 1-3V2XSE changed SPRADDR_STATUS_IND = 'A' to NVL(SPRADDR_STATUS_IND,'A') != 'I' because it wasn't fetching for SPRADDR_STATUS_IND is null</multilinecomment>	                 
     BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE(PTI_CURSOR%NOTFOUND,
  G$_NLS.Get('FRAGRNT-0214', 'FORM','The Address Type and Sequence combination is Invalid or Inactive') ,TRUE); <multilinecomment>Changed error message "Address does not currently exist on address table (SPRADDR)" to "The Address Type and Sequence combination is Invalid or Inactive" </multilinecomment>
   END ;

  --
   << PTI_END_TRIGGER >>
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
		 * FRRGRPI_ADDR_TYPE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRRGRPI_ADDR_TYPE")
		public void frrgrpiAddrType_PostChange()
		{
			

				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);

				if(frrgrpiElement==null)
					return;

				int rowCount = 0;
				if(frrgrpiElement.getFrrgrpiAddrType().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if (!(getGlobal("QUERY_MODE").equals("1")))
					{
//						 goto PTI_END_TRIGGER;
//					}
//					{
						NString ptiIntoTemp= NString.getNull();
						String sqlptiCursor = "SELECT 'X' " +
												" FROM SPRADDR " +
												" WHERE SPRADDR_PIDM = :FRRGRPI_FRRGRPI_ID_PIDM AND SPRADDR_ATYP_CODE = :FRRGRPI_FRRGRPI_ADDR_TYPE AND NVL(SPRADDR_STATUS_IND, 'A') != 'I' ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("FRRGRPI_FRRGRPI_ID_PIDM", frrgrpiElement.getFrrgrpiIdPidm());
							ptiCursor.addParameter("FRRGRPI_FRRGRPI_ADDR_TYPE", frrgrpiElement.getFrrgrpiAddrType());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								ptiIntoTemp = ptiCursorResults.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAGRNT-0214"), toStr("FORM"), toStr("The Address Type and Sequence combination is Invalid or Inactive")), toBool(NBool.True));
						} finally {
							ptiCursor.close();
						}
					}	
					 //PTI_END_TRIGGER:;
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_ADDR_SEQNO.KEY-LISTVAL
		 BEGIN
     :GLOBAL.PIDM := :FRRGRPI_ID_PIDM;
--
   :GLOBAL.VALUE := '';
   G$_COPY_FLD_ATTR;
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'FOQADDR','QUERY');
--
   IF :GLOBAL.SEQNO IS NOT NULL THEN
      :frrgrpi_ADDR_SEQNO := :GLOBAL.SEQNO;
   END IF; 
--
   IF :GLOBAL.ATYP_CODE IS NOT NULL THEN
      :frrgrpi_addr_type  := :GLOBAL.ATYP_CODE ;
      GO_ITEM('frrgrpi_phone_type'); 
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ADDR_SEQNO.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRRGRPI_ADDR_SEQNO", function=KeyFunction.LIST_VALUES)
		public void frrgrpiAddrSeqno_ListValues()
		{
			

				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);

				if(frrgrpiElement==null)
					return;

				setGlobal("PIDM", toStr(frrgrpiElement.getFrrgrpiIdPidm()));
				// 
				setGlobal("VALUE", toStr(""));
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FOQADDR"), toStr("QUERY"));
				// 
				if ( !getGlobal("SEQNO").isNull() )
				{
					frrgrpiElement.setFrrgrpiAddrSeqno(toNumber(getGlobal("SEQNO")));
				}
				// 
				if ( !getGlobal("ATYP_CODE").isNull() )
				{
					frrgrpiElement.setFrrgrpiAddrType(getGlobal("ATYP_CODE"));
					goItem(toStr("frrgrpi_phone_type"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_ADDR_SEQNO.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_END_TRIGGER ;
   END IF ;
     DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   SPRADDR
         WHERE  SPRADDR_PIDM = :FRRGRPI.FRRGRPI_ID_PIDM  			<multilinecomment>Added this line to fix the defect: 1-3V2XSE</multilinecomment>	                 
	   			 AND  SPRADDR_ATYP_CODE = :FRRGRPI.FRRGRPI_ADDR_TYPE
           AND  SPRADDR_SEQNO = :FRRGRPI.FRRGRPI_ADDR_SEQNO
           AND NVL(SPRADDR_STATUS_IND,'A') != 'I';           <multilinecomment>Added this line to fix the defect: 1-3V2XSE changed SPRADDR_STATUS_IND = 'A' to NVL(SPRADDR_STATUS_IND,'A') != 'I' because it wasn't fetching for SPRADDR_STATUS_IND is null</multilinecomment>	                 	
     BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE(PTI_CURSOR%NOTFOUND,
  G$_NLS.Get('FRAGRNT-0215', 'FORM','The Address Type and Sequence combination is Invalid or Inactive'), TRUE); <multilinecomment>Changed error message "Address does not currently exist on address table (SPRADDR)" to "The Address Type and Sequence combination is Invalid or Inactive" </multilinecomment>
   END ;
  --
   << PTI_END_TRIGGER >> 
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
		 * FRRGRPI_ADDR_SEQNO.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRRGRPI_ADDR_SEQNO")
		public void frrgrpiAddrSeqno_PostChange()
		{
			

				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);

				if(frrgrpiElement==null)
					return;

				int rowCount = 0;
				if(frrgrpiElement.getFrrgrpiAddrSeqno().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if (!(getGlobal("QUERY_MODE").equals("1")))
					{
//						 goto PTI_END_TRIGGER;
//					}
//					{
						NString ptiIntoTemp= NString.getNull();
						String sqlptiCursor = "SELECT 'X' " +
												" FROM SPRADDR " +
												" WHERE SPRADDR_PIDM = :FRRGRPI_FRRGRPI_ID_PIDM AND SPRADDR_ATYP_CODE = :FRRGRPI_FRRGRPI_ADDR_TYPE AND SPRADDR_SEQNO = :FRRGRPI_FRRGRPI_ADDR_SEQNO AND NVL(SPRADDR_STATUS_IND, 'A') != 'I' ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("FRRGRPI_FRRGRPI_ID_PIDM", frrgrpiElement.getFrrgrpiIdPidm());
							ptiCursor.addParameter("FRRGRPI_FRRGRPI_ADDR_TYPE", frrgrpiElement.getFrrgrpiAddrType());
							ptiCursor.addParameter("FRRGRPI_FRRGRPI_ADDR_SEQNO", frrgrpiElement.getFrrgrpiAddrSeqno());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								ptiIntoTemp = ptiCursorResults.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAGRNT-0215"), toStr("FORM"), toStr("The Address Type and Sequence combination is Invalid or Inactive")), toBool(NBool.True));
						} finally {
							ptiCursor.close();
						}
					}	
					 //PTI_END_TRIGGER:;
					setGlobal("QUERY_MODE", toStr("0"));
				}
				catch(ApplicationException e)
				{
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_PHONE_TYPE.KEY-LISTVAL
		 DECLARE
	lv_form VARCHAR2(10) := 'FOAIDEN';
BEGIN
  IF INSTR(G$_SECURITY.G$_GET_TAB_SECURITY_FNC(lv_form,USER),'TELEPHONE_TAB:N') > 0 THEN
    MESSAGE(G$_NLS.Get('FRAGRNT-0216','FORM','*ERROR* User %01% is not authorized to access %02% on %03%.',
            USER,
            NVL(G$_SECURITY.G$_GET_TAB_DESC_FNC(lv_form,'TELEPHONE_TAB'),'TELEPHONE_TAB'),
            lv_form));
    RAISE FORM_TRIGGER_FAILURE;
  ELSE
    :GLOBAL.FORM_WAS_CALLED := 'Y';
    :GLOBAL.PIDM := :frrgrpi_id_PIDM;
    :GLOBAL.KEY_IDNO := :FRRGRPI_ID;
--
    :GLOBAL.VALUE := '';
    G$_COPY_FLD_ATTR;
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    :GLOBAL.NAVIGATE_TO_TAB := 'TELEPHONE';
    G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,lv_form,'QUERY');
--
    :GLOBAL.FORM_WAS_CALLED := '';
-- 
    IF :GLOBAL.TELE_CODE IS NOT NULL THEN
      :FRRGRPI_PHONE_TYPE := :GLOBAL.TELE_CODE;	
      :FRRGRPI_TELE_SEQNO := :GLOBAL.TELE_SEQNO; 
       -- To set the phone numbers here too.
    END IF;
    GO_ITEM('FRRGRPI_EMAIL'); --7.4.1    
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_PHONE_TYPE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRRGRPI_PHONE_TYPE", function=KeyFunction.LIST_VALUES)
		public void frrgrpiPhoneType_ListValues()
		{
			

				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);

				if(frrgrpiElement==null)
					return;

				{
					NString lvForm = toStr("FOAIDEN");
//					if ( inStr(GSecurity.gGetTabSecurityFnc(lvForm, getUser()), toStr("TELEPHONE_TAB:N")).greater(0) )
//					{
//						message(GNls.Fget(toStr("FRAGRNT-0216"), toStr("FORM"), toStr("*ERROR* User %01% is not authorized to access %02% on %03%."), getUser(), isNull(GSecurity.gGetTabDescFnc(lvForm, "TELEPHONE_TAB"), "TELEPHONE_TAB"), lvForm));
//						throw new ApplicationException();
//					}
					if ( inStr(GSecurity.FgGetTabSecurityFnc(lvForm, getUser()), toStr("TELEPHONE_TAB:N")).greater(0) )
					{
						errorMessage(GNls.Fget(toStr("FRAGRNT-0216"), toStr("FORM"), toStr("*ERROR* User %01% is not authorized to access %02% on %03%."), getUser(), isNull(GSecurity.FgGetTabDescFnc(lvForm, toStr("TELEPHONE_TAB")), "TELEPHONE_TAB"), lvForm));
						throw new ApplicationException();
					}
					else {
						setGlobal("FORM_WAS_CALLED", toStr("Y"));
						setGlobal("PIDM", toStr(frrgrpiElement.getFrrgrpiIdPidm()));
						setGlobal("KEY_IDNO", frrgrpiElement.getFrrgrpiId());
						// 
						setGlobal("VALUE", toStr(""));
						getTask().getGoqrpls().gCopyFldAttr();
						executeAction("G$_REVOKE_ACCESS");
						getTask().getGoqrpls().gCheckFailure();
						setGlobal("NAVIGATE_TO_TAB", toStr("TELEPHONE"));
						getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), lvForm, toStr("QUERY"));
						// 
						setGlobal("FORM_WAS_CALLED", toStr(""));
						//  
						if ( !getGlobal("TELE_CODE").isNull() )
						{
							frrgrpiElement.setFrrgrpiPhoneType(getGlobal("TELE_CODE"));
							frrgrpiElement.setFrrgrpiTeleSeqno(toNumber(getGlobal("TELE_SEQNO")));
						}
						goItem(toStr("FRRGRPI_EMAIL"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_PHONE_TYPE.POST-CHANGE
		 --87631
DECLARE
   holder       VARCHAR2(1);
   CURSOR tele_c IS
   SELECT 'X'
   FROM   SPRTELE
   WHERE  SPRTELE_TELE_CODE = :frrgrpi_phone_type
   AND    SPRTELE_PIDM = :frrgrpi_id_pidm
   AND    NVL(SPRTELE_STATUS_IND, 'A') <> 'I' ;
   BEGIN
      OPEN tele_c ;
      FETCH tele_c INTO holder ;
      G$_CHECK_VALUE (tele_c%NOTFOUND,
          G$_NLS.Get('FRAGRNT-0217', 'FORM','Phone type code is invalid; Use LIST.') , TRUE);
   END ;
   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_PHONE_TYPE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRRGRPI_PHONE_TYPE")
		public void frrgrpiPhoneType_PostChange()
		{
			
				// 87631

				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);

				if(frrgrpiElement==null)
					return;

				int rowCount = 0;
				if(frrgrpiElement.getFrrgrpiPhoneType().isNull())
		return;
				{
					NString holder= NString.getNull();
					String sqlteleC = "SELECT 'X' " +
	" FROM SPRTELE " +
	" WHERE SPRTELE_TELE_CODE = :FRRGRPI_PHONE_TYPE AND SPRTELE_PIDM = :FRRGRPI_ID_PIDM AND NVL(SPRTELE_STATUS_IND, 'A') <> 'I' ";
					DataCursor teleC = new DataCursor(sqlteleC);
					try {
						//Setting query parameters
						teleC.addParameter("FRRGRPI_PHONE_TYPE", frrgrpiElement.getFrrgrpiPhoneType());
						teleC.addParameter("FRRGRPI_ID_PIDM", frrgrpiElement.getFrrgrpiIdPidm());
						teleC.open();
						ResultSet teleCResults = teleC.fetchInto();
						if ( teleCResults != null ) {
							holder = teleCResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(teleC.notFound()), GNls.Fget(toStr("FRAGRNT-0217"), toStr("FORM"), toStr("Phone type code is invalid; Use LIST.")), toBool(NBool.True));
					} finally {
						teleC.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_TELE_SEQNO.KEY-LISTVAL
		 DECLARE
	lv_form VARCHAR2(10) := 'FOAIDEN';
BEGIN
  IF INSTR(G$_SECURITY.G$_GET_TAB_SECURITY_FNC(lv_form,USER),'TELEPHONE_TAB:N') > 0 THEN
    MESSAGE(G$_NLS.Get('FRAGRNT-0218','FORM','*ERROR* User %01% is not authorized to access %02% on %03%.',
            USER,
            NVL(G$_SECURITY.G$_GET_TAB_DESC_FNC(lv_form,'TELEPHONE_TAB'),'TELEPHONE_TAB'),
            lv_form));
    RAISE FORM_TRIGGER_FAILURE;
  ELSE
    :GLOBAL.FORM_WAS_CALLED := 'Y';
    :GLOBAL.PIDM := :frrgrpi_id_PIDM;
    :GLOBAL.KEY_IDNO := :FRRGRPI_ID;
--
    :GLOBAL.VALUE := '';
    G$_COPY_FLD_ATTR;
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
    :GLOBAL.NAVIGATE_TO_TAB := 'TELEPHONE';
    G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,lv_form,'QUERY');
--
    :GLOBAL.FORM_WAS_CALLED := '';
-- 
--       IF :GLOBAL.TELE_CODE IS NOT NULL THEN
    :FRRGRPI_PHONE_TYPE := :GLOBAL.TELE_CODE;	
    :FRRGRPI_TELE_SEQNO := :GLOBAL.TELE_SEQNO;
    :FRRGRPI_ADDR_TYPE := :GLOBAL.ATYP_CODE;
    :FRRGRPI_ADDR_SEQNO := :GLOBAL.SEQNO;
--       END IF;
    GO_ITEM('FRRGRPI_BFRM_CODE'); 
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_TELE_SEQNO.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRRGRPI_TELE_SEQNO", function=KeyFunction.LIST_VALUES)
		public void frrgrpiTeleSeqno_ListValues()
		{
			

				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);

				if(frrgrpiElement==null)
					return;

				{
					NString lvForm = toStr("FOAIDEN");
					if ( inStr(GSecurity.FgGetTabSecurityFnc(lvForm, getUser()), toStr("TELEPHONE_TAB:N")).greater(0) )
					{
						errorMessage(GNls.Fget(toStr("FRAGRNT-0218"), toStr("FORM"), toStr("*ERROR* User %01% is not authorized to access %02% on %03%."), getUser(), isNull(GSecurity.FgGetTabDescFnc(lvForm, toStr("TELEPHONE_TAB")), "TELEPHONE_TAB"), lvForm));
						throw new ApplicationException();
					}
					else {
						setGlobal("FORM_WAS_CALLED", toStr("Y"));
						setGlobal("PIDM", toStr(frrgrpiElement.getFrrgrpiIdPidm()));
						setGlobal("KEY_IDNO", frrgrpiElement.getFrrgrpiId());
						// 
						setGlobal("VALUE", toStr(""));
						getTask().getGoqrpls().gCopyFldAttr();
						executeAction("G$_REVOKE_ACCESS");
						getTask().getGoqrpls().gCheckFailure();
						setGlobal("NAVIGATE_TO_TAB", toStr("TELEPHONE"));
						getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), lvForm, toStr("QUERY"));
						// 
						setGlobal("FORM_WAS_CALLED", toStr(""));
						//  
						//        IF :GLOBAL.TELE_CODE IS NOT NULL THEN
						frrgrpiElement.setFrrgrpiPhoneType(getGlobal("TELE_CODE"));
						frrgrpiElement.setFrrgrpiTeleSeqno(toNumber(getGlobal("TELE_SEQNO")));
						frrgrpiElement.setFrrgrpiAddrType(getGlobal("ATYP_CODE"));
						frrgrpiElement.setFrrgrpiAddrSeqno(toNumber(getGlobal("SEQNO")));
						//        END IF;
						goItem(toStr("FRRGRPI_BFRM_CODE"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_TELE_SEQNO.WHEN-VALIDATE-ITEM
		 --87631
if :frrgrpi_phone_type is null and  :frrgrpi_tele_seqno is null then
	 return;
elsif  :frrgrpi_tele_seqno is null then
	 message(G$_NLS.Get('FRAGRNT-0219', 'FORM','Phone sequence number is needed.'));
	 raise form_trigger_failure;
end if;

DECLARE
   holder       VARCHAR2(1);
   CURSOR tele_c IS
   SELECT 'X'
   FROM   SPRTELE
   WHERE  SPRTELE_TELE_CODE = :frrgrpi_phone_type
   AND    SPRTELE_SEQNO = :frrgrpi_tele_seqno
   AND    SPRTELE_PIDM = :frrgrpi_id_pidm
   AND    NVL(SPRTELE_STATUS_IND, 'A') <> 'I' ;
BEGIN
   OPEN tele_c ;
   FETCH tele_c INTO holder ;
   G$_CHECK_VALUE (tele_c%NOTFOUND,
          G$_NLS.Get('FRAGRNT-0220', 'FORM','Phone sequence number is invalid; Use LIST.') , TRUE);
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_TELE_SEQNO.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRGRPI_TELE_SEQNO")
		public void frrgrpiTeleSeqno_validate()
		{
			
				// 87631

				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);

				if (frrgrpiElement == null)
					return;
				
				int rowCount = 0;
				// 87631
				if ( frrgrpiElement.getFrrgrpiPhoneType().isNull() && frrgrpiElement.getFrrgrpiTeleSeqno().isNull() )
				{
					return ;
				}
				else if ( frrgrpiElement.getFrrgrpiTeleSeqno().isNull() ) {
					errorMessage(GNls.Fget(toStr("FRAGRNT-0219"), toStr("FORM"), toStr("Phone sequence number is needed.")));
					throw new ApplicationException();
				}
				{
					NString holder= NString.getNull();
					String sqlteleC = "SELECT 'X' " +
	" FROM SPRTELE " +
	" WHERE SPRTELE_TELE_CODE = :FRRGRPI_PHONE_TYPE AND SPRTELE_SEQNO = :FRRGRPI_TELE_SEQNO AND SPRTELE_PIDM = :FRRGRPI_ID_PIDM AND NVL(SPRTELE_STATUS_IND, 'A') <> 'I' ";
					DataCursor teleC = new DataCursor(sqlteleC);
					try {
						//Setting query parameters
						teleC.addParameter("FRRGRPI_PHONE_TYPE", frrgrpiElement.getFrrgrpiPhoneType());
						teleC.addParameter("FRRGRPI_TELE_SEQNO", frrgrpiElement.getFrrgrpiTeleSeqno());
						teleC.addParameter("FRRGRPI_ID_PIDM", frrgrpiElement.getFrrgrpiIdPidm());
						teleC.open();
						ResultSet teleCResults = teleC.fetchInto();
						if ( teleCResults != null ) {
							holder = teleCResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(teleC.notFound()), GNls.Fget(toStr("FRAGRNT-0220"), toStr("FORM"), toStr("Phone sequence number is invalid; Use LIST.")), toBool(NBool.True));
					} finally {
						teleC.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_BFRM_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRRGRPI_BFRM_CODE")
		public void frrgrpiBfrmCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_BFRM_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRRGRPI_BFRM_CODE", function=KeyFunction.ITEM_CHANGE)
		public void frrgrpiBfrmCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_BFRM_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRRGRPI_BFRM_CODE")
		public void frrgrpiBfrmCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_BFRM_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRRGRPI_BFRM_CODE", function=KeyFunction.NEXT_ITEM)
		public void frrgrpiBfrmCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_BFRM_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FRVBFRM_CODE', 'FRVBFRM_DESC','');

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_BFRM_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRRGRPI_BFRM_CODE")
		public void frrgrpiBfrmCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FRVBFRM_CODE"), toStr("FRVBFRM_DESC"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_BFRM_CODE.KEY-LISTVAL
		 BEGIN
	G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
  G$_CHECK_FAILURE;

      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
      G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FRVBFRM', 'QUERY');
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0221', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_BFRM_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRRGRPI_BFRM_CODE", function=KeyFunction.LIST_VALUES)
		public void frrgrpiBfrmCode_ListValues()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FRVBFRM"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") || (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0221"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_BFRM_CODE.POST-CHANGE
		 DECLARE
     CURSOR get_name IS
        SELECT frvbfrm_desc
        FROM   frvbfrm
        WHERE  frvbfrm_code = :frrgrpi.frrgrpi_bfrm_code;

BEGIN
	OPEN get_name ;
        FETCH get_name INTO :bfrm_name;
	IF get_name%NOTFOUND THEN
		MESSAGE(G$_NLS.Get('FRAGRNT-0222','FORM','BFRM Code is invalid. Use LIST'), NO_ACKNOWLEDGE);
		RAISE FORM_TRIGGER_FAILURE;
	END IF;
        CLOSE get_name;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_BFRM_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRRGRPI_BFRM_CODE")
		public void frrgrpiBfrmCode_PostChange()
		{
			

				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);

				if(frrgrpiElement==null)
					return;

				int rowCount = 0;
				if(frrgrpiElement.getFrrgrpiBfrmCode().isNull())
		return;
				{
					String sqlgetName = "SELECT frvbfrm_desc " +
	" FROM frvbfrm " +
	" WHERE frvbfrm_code = :FRRGRPI_FRRGRPI_BFRM_CODE ";
					DataCursor getName = new DataCursor(sqlgetName);
					try {
						//Setting query parameters
						getName.addParameter("FRRGRPI_FRRGRPI_BFRM_CODE", frrgrpiElement.getFrrgrpiBfrmCode());
						getName.open();
						ResultSet getNameResults = getName.fetchInto();
						if ( getNameResults != null ) {
							frrgrpiElement.setBfrmName(getNameResults.getStr(0));
						}
						if ( getName.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAGRNT-0222"), toStr("FORM"), toStr("BFRM Code is invalid. Use LIST")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
							throw new ApplicationException();
						}
					} finally {
						getName.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_BFRM_CODE.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
--
IF :frrgrpi_bfrm_code IS NULL THEN
   :bfrm_name := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_BFRM_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRRGRPI_BFRM_CODE", function=KeyFunction.ITEM_OUT)
		public void frrgrpiBfrmCode_itemOut()
		{
			

				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);

				if(frrgrpiElement==null)
					return;

				getTask().getGoqrpls().getGSearch().postTextCode();
				// 
				if ( frrgrpiElement.getFrrgrpiBfrmCode().isNull() )
				{
					frrgrpiElement.setBfrmName(toStr(""));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * BFRM_NAME.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="BFRM_NAME", function=KeyFunction.ITEM_CHANGE)
		public void bfrmName_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_EMPLOYEE_IND.WHEN-VALIDATE-ITEM
		 if :frrgrpi_employee_ind is not null and
   :frrgrpi_employee_ind not in('Y','N')  then
      message( G$_NLS.Get('FRAGRNT-0223', 'FORM','Invalid Employee Indicator. Enter Y or N.') );
        Raise Form_Trigger_Failure;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_EMPLOYEE_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRGRPI_EMPLOYEE_IND")
		public void frrgrpiEmployeeInd_validate()
		{
			

				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);

				if(frrgrpiElement==null)
					return;

				if ( !frrgrpiElement.getFrrgrpiEmployeeInd().isNull() && !in(frrgrpiElement.getFrrgrpiEmployeeInd(), "Y", "N").getValue() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0223"), toStr("FORM"), toStr("Invalid Employee Indicator. Enter Y or N.")));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ORGN_CODE_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRRGRPI_ORGN_CODE_LBT")
		public void frrgrpiOrgnCodeLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ID_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRRGRPI_ID_LBT")
		public void frrgrpiIdLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGRPI_ID_LBT.WHEN-BUTTON-PRESSED
		 :GLOBAL.FORM_WAS_CALLED := 'Y';
G$_KEY_OPT_MENU('FRRGRPI_ID',
                 G$_NLS.Get('FRAGRNT-0224', 'FORM','List of Grant Personnel (FTIIDEN)') ,'LIST_VALUES',
                 G$_NLS.Get('FRAGRNT-0225', 'FORM','Person Search Form (FOIIDEN)') ,'COUNT_QUERY',
                '','',
                '','');
:GLOBAL.FORM_WAS_CALLED := 'N';

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ID_LBT.WHEN-BUTTON-PRESSED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRRGRPI_ID_LBT")
		public void frrgrpiIdLbt_buttonClick()
		{
			
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				getTask().getGoqrpls().gKeyOptMenu(toStr("FRRGRPI_ID"), GNls.Fget(toStr("FRAGRNT-0224"), toStr("FORM"), toStr("List of Grant Personnel (FTIIDEN)")), toStr("LIST_VALUES"), GNls.Fget(toStr("FRAGRNT-0225"), toStr("FORM"), toStr("Person Search Form (FOIIDEN)")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ID_IND_LBT.WHEN-MOUSE-CLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-CLICK", item="FRRGRPI_ID_IND_LBT")
		public void frrgrpiIdIndLbt_click()
		{
			
				getGIconBtnClass().whenMouseClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ID_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRGRPI_ID_IND")
		public void frrgrpiIdInd_validate()
		{
			
				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);
							this.frrgrpiIdInd_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ORGN_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRGRPI_ORGN_CODE")
		public void frrgrpiOrgnCode_validate()
		{
			
				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);
							this.frrgrpiOrgnCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ADDR_TYPE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRGRPI_ADDR_TYPE")
		public void frrgrpiAddrType_validate()
		{
			
				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);
							this.frrgrpiAddrType_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_ADDR_SEQNO.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRGRPI_ADDR_SEQNO")
		public void frrgrpiAddrSeqno_validate()
		{
			
				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);
							this.frrgrpiAddrSeqno_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_PHONE_TYPE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRGRPI_PHONE_TYPE")
		public void frrgrpiPhoneType_validate()
		{
			
				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);
							this.frrgrpiPhoneType_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGRPI_BFRM_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRGRPI_BFRM_CODE")
		public void frrgrpiBfrmCode_validate()
		{
			
				FrrgrpiAdapter frrgrpiElement = (FrrgrpiAdapter)this.getFormModel().getFrrgrpi().getRowAdapter(true);
							this.frrgrpiBfrmCode_PostChange();

			}

		
	
	
}

