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
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
import morphis.foundations.flavors.forms.appsupportlib.runtime.FormsMessageLevel;
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FrbgbilController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	

	
	public FrbgbilController(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER FRBGBIL.KEY-COMMIT
		 IF (:FRBGBIL_BUDGET_LIMIT_IND = 'L') AND (:FRBGBIL_BUD_CHECK_SOURCE_IND IS NULL) THEN
  message( G$_NLS.Get('FRAGRNT-0171', 'FORM','Invalid Budget Check Source Indicator for Line Item Budget limit. Select from list.') );
  Raise Form_Trigger_Failure;
ELSE
EXECUTE_TRIGGER('GET_ITEM_NAME');
--
--IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'FRAGRNT_1_CANVAS' THEN
   NEXT_ITEM;
   PREVIOUS_ITEM;
--END IF;
EXECUTE_TRIGGER('CHECK_FRRGLOC');
G$_CHECK_FAILURE;
--
  EXECUTE_TRIGGER('RE_EDIT');
  G$_CHECK_FAILURE;
--
 IF :SYSTEM.FORM_STATUS = 'CHANGED' THEN
    EXECUTE_TRIGGER( 'EDIT_ORGN_SEC_for_commit' ) ;
    G$_CHECK_FAILURE ;
    :COMMIT_IND := 'Y';
    COMMIT_FORM;
    G$_CHECK_FAILURE;
    IF :SYSTEM.FORM_STATUS <> 'QUERY' THEN
       :COMMIT_IND := 'N';
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
    :COMMIT_IND := 'N';
 END IF;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL.KEY-COMMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-COMMIT", function=KeyFunction.SAVE)
		public void frbgbil_Save()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null)
					return;

				if ( (frbgbilElement.getFrbgbilBudgetLimitInd().equals("L")) && (frbgbilElement.getFrbgbilBudCheckSourceInd().isNull()) )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0171"), toStr("FORM"), toStr("Invalid Budget Check Source Indicator for Line Item Budget limit. Select from list.")));
					throw new ApplicationException();
				}
				else {
					executeAction("GET_ITEM_NAME");
					// 
					// IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'FRAGRNT_1_CANVAS' THEN
					nextItem();
					previousItem();
					// END IF;
					executeAction("CHECK_FRRGLOC");
					getTask().getGoqrpls().gCheckFailure();
					// 
					executeAction("RE_EDIT");
					getTask().getGoqrpls().gCheckFailure();
					// 
					if ( getTaskStatus().equals("CHANGED") )
					{
						executeAction("EDIT_ORGN_SEC_for_commit");
						getTask().getGoqrpls().gCheckFailure();
						getFormModel().getFormHeader().setCommitInd(toStr("Y"));
						commitTask();
						getTask().getGoqrpls().gCheckFailure();
						if ( !getTaskStatus().equals("QUERY") )
						{
							getFormModel().getFormHeader().setCommitInd(toStr("N"));
							throw new ApplicationException();
						}
						getFormModel().getFormHeader().setCommitInd(toStr("N"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL.WHEN-NEW-BLOCK-INSTANCE
		 execute_query;

IF :CALLED_FROM_INQUIRY =1 THEN
	RETURN;
END IF;	

IF :frbgbil_coas_code IS NULL THEN
	:frbgbil_coas_code := :FRBGRNT_COAS_CODE;
END IF;
--
IF :frbgbil_billing_start_date IS NULL THEN
	:frbgbil_billing_start_date := :frbgrnt_project_start_date;
	:frbgbil_billing_end_date := :frbgrnt_project_end_date;
END IF;
--
IF :FRBGBIL_ADDR_TYPE IS NULL THEN
	:frbgbil_addr_type := :FRBGRNT_AGENCY_ADDR_CODE;
	:FRBGBIL_ADDR_SEQNO := :FRBGRNT_AGENCY_ADDR_SEQ_NUM;
END IF;
--
IF :FRBGBIL_BILLING_MAX_AMT IS NULL THEN
	:FRBGBIL_BILLING_MAX_AMT := :FRBGRNT_MAX_FUNDING_AMT;
END IF;

if :AGENCY_CODE_1 is null then
   :AGENCY_CODE_1 := :frbgrnt.frbgrnt_AGENCY_code;
   :AGENCY_NAME_1 := :frbgrnt.frbgrnt_AGENCY_name;
end if;

--for 82775
execute_trigger('SET_LIMIT');
g$_check_failure;

IF G$_QUERY_ONLY_ROLE THEN
  GOTO SET_ENABLE;
END IF;

IF :SYSTEM.BLOCK_STATUS = 'CHANGED'  THEN 
		IF Form_Success THEN 
    		:COMMIT_IND := 'Y';
    		:SYSTEM.MESSAGE_LEVEL := '5';
    		COMMIT_FORM;
    		G$_CHECK_FAILURE;  
    		:SYSTEM.MESSAGE_LEVEL := '0';
    		IF :SYSTEM.FORM_STATUS <> 'QUERY' THEN
       			:COMMIT_IND := 'N';
       			RAISE FORM_TRIGGER_FAILURE;
    		END IF;
    		:COMMIT_IND := 'N';
		END IF;
END IF; 

<<SET_ENABLE>>
declare
	holder varchar2(1);
	cursor trraccd_c is
	select 'y' from trraccd
	where trraccd_grnt_code = :FRBGBIL_GRNT_CODE;
begin
	open trraccd_c;
	fetch trraccd_c into holder;
	if holder = 'y' then
		 set_item_property('FRBGBIL_LAST_INV_SEQ_NO',       enabled, property_off);
		 set_item_property('FRBGBIL_CUMULATIVE_BILLED_AMT', enabled, property_off);
		 close trraccd_c;
	else
	   set_item_property('FRBGBIL_LAST_INV_SEQ_NO',       enabled, property_on);
		 set_item_property('FRBGBIL_CUMULATIVE_BILLED_AMT', enabled, property_on);
		 set_item_property('FRBGBIL_LAST_INV_SEQ_NO',       update_allowed, property_on);
		 set_item_property('FRBGBIL_CUMULATIVE_BILLED_AMT', update_allowed, property_on);

	end if;
exception
	when no_data_found then
     null;
end;
	
		
	


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL.WHEN-NEW-BLOCK-INSTANCE
		 *
		 *
		 *</p>
		*/

		@After
		@ActionTrigger(action="WHEN-NEW-BLOCK-INSTANCE", function=KeyFunction.BLOCK_CHANGE)
		public void frbgbil_blockChange()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgbilElement==null || frbgrntElement==null)
					return;

				int rowCount = 0;
				executeQuery();
				if ( getFormModel().getFormHeader().getCalledFromInquiry().equals(1) )
				{
					return ;
				}
				if ( frbgbilElement.getFrbgbilCoasCode().isNull() )
				{
					frbgbilElement.setFrbgbilCoasCode(frbgrntElement.getFrbgrntCoasCode());
				}
				// 
				if ( frbgbilElement.getFrbgbilBillingStartDate().isNull() )
				{
					frbgbilElement.setFrbgbilBillingStartDate(frbgrntElement.getFrbgrntProjectStartDate());
					frbgbilElement.setFrbgbilBillingEndDate(frbgrntElement.getFrbgrntProjectEndDate());
				}
				// 
				if ( frbgbilElement.getFrbgbilAddrType().isNull() )
				{
					frbgbilElement.setFrbgbilAddrType(frbgrntElement.getFrbgrntAgencyAddrCode());
					frbgbilElement.setFrbgbilAddrSeqno(frbgrntElement.getFrbgrntAgencyAddrSeqNum());
				}
				// 
				if ( frbgbilElement.getFrbgbilBillingMaxAmt().isNull() )
				{
					frbgbilElement.setFrbgbilBillingMaxAmt(frbgrntElement.getFrbgrntMaxFundingAmt());
				}
				if ( getFormModel().getBlock3().getAgencyCode1().isNull() )
				{
					getFormModel().getBlock3().setAgencyCode1(frbgrntElement.getFrbgrntAgencyCode());
					getFormModel().getBlock3().setAgencyName1(frbgrntElement.getFrbgrntAgencyName());
				}
				// for 82775
				executeAction("SET_LIMIT");
				getTask().getGoqrpls().gCheckFailure();
				if ( !(getTask().getGoqrpls().gQueryOnlyRole().getValue()) )
				{
//					 goto SET_ENABLE;
//				}
					try
					{
						
						if ( getBlockStatus().equals("CHANGED") )
						{
								getFormModel().getFormHeader().setCommitInd(toStr("Y"));

								try { 
									MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("5"));
								commitTask();
								getTask().getGoqrpls().gCheckFailure();
								} finally {
											
									MessageServices.setMessageLevel(FormsMessageLevel.decodeMessageLevel("0"));
								}
											
								if ( !getTaskStatus().equals("QUERY") )
								{
									getFormModel().getFormHeader().setCommitInd(toStr("N"));
									throw new ApplicationException();
								}
								getFormModel().getFormHeader().setCommitInd(toStr("N"));
							
						}

					}catch(Exception e){
						throw new ApplicationException();
						}
				}
				 //SET_ENABLE:;
				{
					NString holder= NString.getNull();
					String sqltrraccdC = "SELECT 'y' " +
	" FROM trraccd " +
	" WHERE trraccd_grnt_code = :FRBGBIL_GRNT_CODE ";
					DataCursor trraccdC = new DataCursor(sqltrraccdC);
					try
					{
						//Setting query parameters
						trraccdC.addParameter("FRBGBIL_GRNT_CODE", frbgbilElement.getFrbgbilGrntCode());
						trraccdC.open();
						ResultSet trraccdCResults = trraccdC.fetchInto();
						if ( trraccdCResults != null ) {
							holder = trraccdCResults.getStr(0);
						}
						if ( holder.equals("y") )
						{
							setItemEnabled("FRBGBIL_LAST_INV_SEQ_NO", false);
							setItemEnabled("FRBGBIL_CUMULATIVE_BILLED_AMT", false);
						}
						else {
							setItemEnabled("FRBGBIL_LAST_INV_SEQ_NO", true);
							setItemEnabled("FRBGBIL_CUMULATIVE_BILLED_AMT", true);
							setItemUpdateAllowed("FRBGBIL_LAST_INV_SEQ_NO", true);
							setItemUpdateAllowed("FRBGBIL_CUMULATIVE_BILLED_AMT", true);
						}
					}
					catch(NoDataFoundException e)
					{
					}
					finally{
						trraccdC.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL.PRE-UPDATE
		    IF G$_NCHK(:commit_ind <> 'Y') THEN
      MESSAGE(  G$_NLS.Get('FRAGRNT-0172', 'FORM','Select SAVE to perform a Commit.')  ) ;
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
		 * FRBGBIL.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void frbgbil_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				if ( getTask().getGoqrpls().gNchk(toBool(getFormModel().getFormHeader().getCommitInd().notEquals("Y"))).getValue() )
				{
					warningMessage(GNls.Fget(toStr("FRAGRNT-0172"), toStr("FORM"), toStr("Select SAVE to perform a Commit.")));
					throw new ApplicationException();
				}
				// 
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL.PRE-INSERT
		    IF G$_NCHK(:commit_ind <> 'Y') THEN
      MESSAGE(  G$_NLS.Get('FRAGRNT-0173', 'FORM','Select SAVE to perform a Commit.')  ) ;
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
		 * FRBGBIL.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void frbgbil_BeforeRowInsert(RowAdapterEvent args)
		{
			
				if ( getTask().getGoqrpls().gNchk(toBool(getFormModel().getFormHeader().getCommitInd().notEquals("Y"))).getValue() )
				{
					warningMessage(GNls.Fget(toStr("FRAGRNT-0173"), toStr("FORM"), toStr("Select SAVE to perform a Commit.")));
					throw new ApplicationException();
				}
				// 
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL.SET_LIMIT
		 if :FRBGBIL_BUDGET_LIMIT_IND is null then
	 :FRBGBIL_BUDGET_LIMIT_IND := 'N';
end if;

if NVL(:FRBGBIL_BUDGET_LIMIT_IND, 'N') = 'T' then
	 :FRBGBIL_BUD_LINE_EXCEED_IND  := '';
	 if :FRBGBIL_BUD_TOTAL_EXCEED_IND is null then
	    :FRBGBIL_BUD_TOTAL_EXCEED_IND := 'N';
	 end if;
	 set_item_property('FRBGBIL_BUD_LINE_EXCEED_IND', enabled, property_off);
	 set_item_property('FRBGBIL_BUD_TOTAL_EXCEED_IND', enabled, property_on);
	 set_item_property('FRBGBIL_BUD_TOTAL_EXCEED_IND', navigable, property_on);
	 set_item_property('FRBGBIL_BUD_TOTAL_EXCEED_IND', update_allowed, property_on);	 
	 set_item_property('FRBGBIL_BUD_CHECK_SOURCE_IND', enabled, property_on);
	 set_item_property('FRBGBIL_BUD_CHECK_SOURCE_IND', navigable, property_on);
	 set_item_property('FRBGBIL_BUD_CHECK_SOURCE_IND', update_allowed, property_on);
elsif NVL(:FRBGBIL_BUDGET_LIMIT_IND, 'N') = 'L' then
	 if :FRBGBIL_BUD_LINE_EXCEED_IND is null then
      :FRBGBIL_BUD_LINE_EXCEED_IND  := 'N';
   end if;
	 :FRBGBIL_BUD_TOTAL_EXCEED_IND := '';
	 :FRBGBIL_BUD_CHECK_SOURCE_IND := 'G';
	 set_item_property('FRBGBIL_BUD_LINE_EXCEED_IND', enabled, property_on);
	 set_item_property('FRBGBIL_BUD_LINE_EXCEED_IND', navigable, property_on);
	 set_item_property('FRBGBIL_BUD_LINE_EXCEED_IND', update_allowed, property_on);
	 set_item_property('FRBGBIL_BUD_TOTAL_EXCEED_IND', enabled, property_off);
	 set_item_property('FRBGBIL_BUD_CHECK_SOURCE_IND', enabled, property_off);
elsif NVL(:FRBGBIL_BUDGET_LIMIT_IND, 'N') = 'N' then
   :FRBGBIL_BUD_LINE_EXCEED_IND := '';
	 :FRBGBIL_BUD_TOTAL_EXCEED_IND := '';
	 :FRBGBIL_BUD_CHECK_SOURCE_IND := '';
	 set_item_property('FRBGBIL_BUD_LINE_EXCEED_IND', enabled, property_off);
	 set_item_property('FRBGBIL_BUD_TOTAL_EXCEED_IND', enabled, property_off);
	 set_item_property('FRBGBIL_BUD_CHECK_SOURCE_IND', enabled, property_off);
end if;
	 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL.SET_LIMIT
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="SET_LIMIT")
		public void frbgbil_SetLimit()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if (frbgbilElement==null)
					return;

				if ( frbgbilElement.getFrbgbilBudgetLimitInd().isNull() )
				{
					frbgbilElement.setFrbgbilBudgetLimitInd(toStr("N"));
				}
				if ( isNull(frbgbilElement.getFrbgbilBudgetLimitInd(), "N").equals("T") )
				{
					frbgbilElement.setFrbgbilBudLineExceedInd(toStr(""));
					if ( frbgbilElement.getFrbgbilBudTotalExceedInd().isNull() )
					{
						frbgbilElement.setFrbgbilBudTotalExceedInd(toStr("N"));
					}
					setItemEnabled("FRBGBIL_BUD_LINE_EXCEED_IND", false);
					setItemEnabled("FRBGBIL_BUD_TOTAL_EXCEED_IND", true);
					setItemNavigable("FRBGBIL_BUD_TOTAL_EXCEED_IND", true);
					setItemUpdateAllowed("FRBGBIL_BUD_TOTAL_EXCEED_IND", true);
					setItemEnabled("FRBGBIL_BUD_CHECK_SOURCE_IND", true);
					setItemNavigable("FRBGBIL_BUD_CHECK_SOURCE_IND", true);
					setItemUpdateAllowed("FRBGBIL_BUD_CHECK_SOURCE_IND", true);
				}
				else if ( isNull(frbgbilElement.getFrbgbilBudgetLimitInd(), "N").equals("L") ) {
					if ( frbgbilElement.getFrbgbilBudLineExceedInd().isNull() )
					{
						frbgbilElement.setFrbgbilBudLineExceedInd(toStr("N"));
					}
					frbgbilElement.setFrbgbilBudTotalExceedInd(toStr(""));
					frbgbilElement.setFrbgbilBudCheckSourceInd(toStr("G"));
					setItemEnabled("FRBGBIL_BUD_LINE_EXCEED_IND", true);
					setItemNavigable("FRBGBIL_BUD_LINE_EXCEED_IND", true);
					setItemUpdateAllowed("FRBGBIL_BUD_LINE_EXCEED_IND", true);
					setItemEnabled("FRBGBIL_BUD_TOTAL_EXCEED_IND", false);
					setItemEnabled("FRBGBIL_BUD_CHECK_SOURCE_IND", false);
				}
				else if ( isNull(frbgbilElement.getFrbgbilBudgetLimitInd(), "N").equals("N") ) {
					frbgbilElement.setFrbgbilBudLineExceedInd(toStr(""));
					frbgbilElement.setFrbgbilBudTotalExceedInd(toStr(""));
					frbgbilElement.setFrbgbilBudCheckSourceInd(toStr(""));
					setItemEnabled("FRBGBIL_BUD_LINE_EXCEED_IND", false);
					setItemEnabled("FRBGBIL_BUD_TOTAL_EXCEED_IND", false);
					setItemEnabled("FRBGBIL_BUD_CHECK_SOURCE_IND", false);
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL.KEY-DELREC
		 if :del_ready = 'N' then
   :del_ready := 'Y';
   message(G$_NLS.Get('FRAGRNT-0174', 'FORM','Press ''Delete Record'' again to Delete this Record.'));
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
		 * FRBGBIL.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void frbgbil_DeleteRecord()
		{
			
				if ( getFormModel().getFormHeader().getDelReady().equals("N") )
				{
					getFormModel().getFormHeader().setDelReady(toStr("Y"));
					warningMessage(GNls.Fget(toStr("FRAGRNT-0174"), toStr("FORM"), toStr("Press 'Delete Record' again to Delete this Record.")));
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
		 * FRBGBIL.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void frbgbil_BeforeQuery(QueryEvent args)
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
		 * FRBGBIL_PMSC_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBGBIL_PMSC_CODE")
		public void frbgbilPmscCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PMSC_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGBIL_PMSC_CODE", function=KeyFunction.ITEM_CHANGE)
		public void frbgbilPmscCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PMSC_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRBGBIL_PMSC_CODE")
		public void frbgbilPmscCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PMSC_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGBIL_PMSC_CODE", function=KeyFunction.NEXT_ITEM)
		public void frbgbilPmscCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_PMSC_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FRVPMSC_CODE', 'FRVPMSC_DESC');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PMSC_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRBGBIL_PMSC_CODE")
		public void frbgbilPmscCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FRVPMSC_CODE"), toStr("FRVPMSC_DESC"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_PMSC_CODE.KEY-LISTVAL
		 BEGIN
	G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
  G$_CHECK_FAILURE;
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
      G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FRVPMSC', 'QUERY');
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0175', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PMSC_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGBIL_PMSC_CODE", function=KeyFunction.LIST_VALUES)
		public void frbgbilPmscCode_ListValues()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FRVPMSC"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") || (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0175"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_PMSC_CODE.POST-CHANGE
		 DECLARE
     CURSOR get_name IS
        SELECT frvpmsc_desc
        FROM   frvpmsc
        WHERE  frvpmsc_code = :frbgbil.frbgbil_pmsc_code
	AND    frvpmsc_coas_code = :FRBGRNT_COAS_CODE;

     CURSOR get_payment_codes IS
        SELECT frvpmsc_loc_fund_code, frvpmsc_acct_code_receipts
	FROM frvpmsc
	WHERE frvpmsc_code = :frbgbil.frbgbil_pmsc_code
	AND    frvpmsc_coas_code = :FRBGRNT_COAS_CODE;

     CURSOR get_fund_name IS
        SELECT ftvfund_title
        FROM   ftvfund
        WHERE  ftvfund_fund_code = :frbgbil.FRBGBIL_payment_fund_code;

     CURSOR get_acct_name IS
        SELECT ftvacct_title
        FROM   ftvacct
        WHERE  ftvacct_acct_code = :frbgbil.FRBGBIL_payment_acct_code;


BEGIN
	
	OPEN get_name ;
        FETCH get_name INTO :pmsc_name;
	IF get_name%NOTFOUND THEN
		MESSAGE( G$_NLS.Get('FRAGRNT-0176', 'FORM','PMS Code is invalid. Use LIST') , NO_ACKNOWLEDGE);
		RAISE FORM_TRIGGER_FAILURE;
	END IF;
        CLOSE get_name;

   IF :CALLED_FROM_INQUIRY <>1 THEN
 		  OPEN get_payment_codes;
		 FETCH get_payment_codes INTO :FRBGBIL_PAYMENT_FUND_CODE, :FRBGBIL_PAYMENT_ACCT_CODE;
		 CLOSE get_payment_codes;
   END IF;	

	IF :frbgbil_payment_fund_code IS NOT NULL THEN
	OPEN get_fund_name ;
        FETCH get_fund_name INTO :payment_fund_name;
	close get_fund_name;
	END IF;

	IF :frbgbil_payment_fund_code IS NULL THEN
	:payment_fund_name := '';
	END IF;

	IF :frbgbil_payment_acct_code IS NOT NULL THEN
	OPEN get_acct_name ;
        FETCH get_acct_name INTO :payment_acct_name;
	close get_acct_name;
	END IF;

	IF :frbgbil_payment_acct_code IS NULL THEN
	:payment_acct_name := '';
	END IF;
END;



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PMSC_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGBIL_PMSC_CODE")
		public void frbgbilPmscCode_PostChange()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgbilElement==null || frbgrntElement==null)
					return;

				int rowCount = 0;
				if(frbgbilElement.getFrbgbilPmscCode().isNull())
		return;
				{
					String sqlgetName = "SELECT frvpmsc_desc " +
	" FROM frvpmsc " +
	" WHERE frvpmsc_code = :FRBGBIL_FRBGBIL_PMSC_CODE AND frvpmsc_coas_code = :FRBGRNT_COAS_CODE ";
					DataCursor getName = new DataCursor(sqlgetName);
					String sqlgetPaymentCodes = "SELECT frvpmsc_loc_fund_code, frvpmsc_acct_code_receipts " +
	" FROM frvpmsc " +
	" WHERE frvpmsc_code = :FRBGBIL_FRBGBIL_PMSC_CODE AND frvpmsc_coas_code = :FRBGRNT_COAS_CODE ";
					DataCursor getPaymentCodes = new DataCursor(sqlgetPaymentCodes);
					String sqlgetFundName = "SELECT ftvfund_title " +
	" FROM ftvfund " +
	" WHERE ftvfund_fund_code = :FRBGBIL_FRBGBIL_PAYMENT_FUND_CODE ";
					DataCursor getFundName = new DataCursor(sqlgetFundName);
					String sqlgetAcctName = "SELECT ftvacct_title " +
	" FROM ftvacct " +
	" WHERE ftvacct_acct_code = :FRBGBIL_FRBGBIL_PAYMENT_ACCT_CODE ";
					DataCursor getAcctName = new DataCursor(sqlgetAcctName);
					try {
						//Setting query parameters
						getName.addParameter("FRBGBIL_FRBGBIL_PMSC_CODE", frbgbilElement.getFrbgbilPmscCode());
						getName.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
						getName.open();
						ResultSet getNameResults = getName.fetchInto();
						if ( getNameResults != null ) {
							frbgbilElement.setPmscName(getNameResults.getStr(0));
						}
						if ( getName.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAGRNT-0176"), toStr("FORM"), toStr("PMS Code is invalid. Use LIST")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
							throw new ApplicationException();
						}
						if ( getFormModel().getFormHeader().getCalledFromInquiry().notEquals(1) )
						{
							//Setting query parameters
							getPaymentCodes.addParameter("FRBGBIL_FRBGBIL_PMSC_CODE", frbgbilElement.getFrbgbilPmscCode());
							getPaymentCodes.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
							getPaymentCodes.open();
							ResultSet getPaymentCodesResults = getPaymentCodes.fetchInto();
							if ( getPaymentCodesResults != null ) {
								frbgbilElement.setFrbgbilPaymentFundCode(getPaymentCodesResults.getStr(0));
								frbgbilElement.setFrbgbilPaymentAcctCode(getPaymentCodesResults.getStr(1));
							}
						}
						if ( !frbgbilElement.getFrbgbilPaymentFundCode().isNull() )
						{
							//Setting query parameters
							getFundName.addParameter("FRBGBIL_FRBGBIL_PAYMENT_FUND_CODE", frbgbilElement.getFrbgbilPaymentFundCode());
							getFundName.open();
							ResultSet getFundNameResults = getFundName.fetchInto();
							if ( getFundNameResults != null ) {
								frbgbilElement.setPaymentFundName(getFundNameResults.getStr(0));
							}
						}
						if ( frbgbilElement.getFrbgbilPaymentFundCode().isNull() )
						{
							frbgbilElement.setPaymentFundName(toStr(""));
						}
						if ( !frbgbilElement.getFrbgbilPaymentAcctCode().isNull() )
						{
							//Setting query parameters
							getAcctName.addParameter("FRBGBIL_FRBGBIL_PAYMENT_ACCT_CODE", frbgbilElement.getFrbgbilPaymentAcctCode());
							getAcctName.open();
							ResultSet getAcctNameResults = getAcctName.fetchInto();
							if ( getAcctNameResults != null ) {
								frbgbilElement.setPaymentAcctName(getAcctNameResults.getStr(0));
							}
						}
						if ( frbgbilElement.getFrbgbilPaymentAcctCode().isNull() )
						{
							frbgbilElement.setPaymentAcctName(toStr(""));
						}
					} finally {
						getName.close();
						getPaymentCodes.close();
						getFundName.close();
						getAcctName.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_PMSC_CODE.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
--
IF :frbgbil_pmsc_code IS NULL THEN
   :pmsc_name := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PMSC_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGBIL_PMSC_CODE", function=KeyFunction.ITEM_OUT)
		public void frbgbilPmscCode_itemOut()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null)
					return;

				getTask().getGoqrpls().getGSearch().postTextCode();
				// 
				if ( frbgbilElement.getFrbgbilPmscCode().isNull() )
				{
					frbgbilElement.setPmscName(toStr(""));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PMSC_NAME.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PMSC_NAME", function=KeyFunction.ITEM_CHANGE)
		public void pmscName_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BECL_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBGBIL_BECL_CODE")
		public void frbgbilBeclCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BECL_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGBIL_BECL_CODE", function=KeyFunction.ITEM_CHANGE)
		public void frbgbilBeclCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BECL_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRBGBIL_BECL_CODE")
		public void frbgbilBeclCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BECL_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGBIL_BECL_CODE", function=KeyFunction.NEXT_ITEM)
		public void frbgbilBeclCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BECL_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FRVBECL_CODE', 'FRVBECL_DESC','');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BECL_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRBGBIL_BECL_CODE")
		public void frbgbilBeclCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FRVBECL_CODE"), toStr("FRVBECL_DESC"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BECL_CODE.KEY-LISTVAL
		 BEGIN
	G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
  G$_CHECK_FAILURE;
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
      G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FRVBECL', 'QUERY');
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0177', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BECL_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGBIL_BECL_CODE", function=KeyFunction.LIST_VALUES)
		public void frbgbilBeclCode_ListValues()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FRVBECL"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") || (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0177"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BECL_CODE.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
--
IF :frbgbil_becl_code IS NULL THEN
   :becl_name := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BECL_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGBIL_BECL_CODE", function=KeyFunction.ITEM_OUT)
		public void frbgbilBeclCode_itemOut()
		{
				
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null)
					return;

				getTask().getGoqrpls().getGSearch().postTextCode();
				// 
				if ( frbgbilElement.getFrbgbilBeclCode().isNull() )
				{
					frbgbilElement.setBeclName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BECL_CODE.POST-CHANGE
		 declare

     CURSOR get_name IS
        SELECT frvbecl_desc
        FROM   frvbecl
        WHERE  frvbecl_code = :frbgbil.frbgbil_becl_code;

  BEGIN
       
        OPEN get_name ;
        FETCH get_name INTO :becl_name;
	IF get_name%NOTFOUND THEN
		MESSAGE( G$_NLS.Get('FRAGRNT-0178', 'FORM','Billing Exclusion Code is invalid. Use LIST') , NO_ACKNOWLEDGE);
		RAISE FORM_TRIGGER_FAILURE;
	END IF;
        close get_name;

END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BECL_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGBIL_BECL_CODE")
		public void frbgbilBeclCode_PostChange()
		{
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null)
					return;

				//int rowCount = 0;
				if(frbgbilElement.getFrbgbilBeclCode().isNull())
		return;
				{
					String sqlgetName = "SELECT frvbecl_desc " +
	" FROM frvbecl " +
	" WHERE frvbecl_code = :FRBGBIL_FRBGBIL_BECL_CODE ";
					DataCursor getName = new DataCursor(sqlgetName);
					try {
						//Setting query parameters
						getName.addParameter("FRBGBIL_FRBGBIL_BECL_CODE", frbgbilElement.getFrbgbilBeclCode());
						getName.open();
						ResultSet getNameResults = getName.fetchInto();
						if ( getNameResults != null ) {
							frbgbilElement.setBeclName(getNameResults.getStr(0));
						}
						if ( getName.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAGRNT-0178"), toStr("FORM"), toStr("Billing Exclusion Code is invalid. Use LIST")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
							throw new ApplicationException();
						}
					} finally {
						getName.close();						
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * BECL_NAME.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="BECL_NAME", function=KeyFunction.ITEM_CHANGE)
		public void beclName_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BUDGET_LIMIT_IND.WHEN-LIST-CHANGED
		 execute_trigger('set_limit');
G$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BUDGET_LIMIT_IND.WHEN-LIST-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-LIST-CHANGED", item="FRBGBIL_BUDGET_LIMIT_IND")
		public void frbgbilBudgetLimitInd_listChange()
		{
			
				executeAction("set_limit");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PAYMENT_FUND_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBGBIL_PAYMENT_FUND_CODE")
		public void frbgbilPaymentFundCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PAYMENT_FUND_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGBIL_PAYMENT_FUND_CODE", function=KeyFunction.ITEM_CHANGE)
		public void frbgbilPaymentFundCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PAYMENT_FUND_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRBGBIL_PAYMENT_FUND_CODE")
		public void frbgbilPaymentFundCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PAYMENT_FUND_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGBIL_PAYMENT_FUND_CODE", function=KeyFunction.NEXT_ITEM)
		public void frbgbilPaymentFundCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_PAYMENT_FUND_CODE.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
--
IF :frbgbil_payment_fund_code IS NULL THEN
   :payment_fund_name := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PAYMENT_FUND_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGBIL_PAYMENT_FUND_CODE", function=KeyFunction.ITEM_OUT)
		public void frbgbilPaymentFundCode_itemOut()
		{
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null)
					return;

				getTask().getGoqrpls().getGSearch().postTextCode();
				// 
				if ( frbgbilElement.getFrbgbilPaymentFundCode().isNull() )
				{
					frbgbilElement.setPaymentFundName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_PAYMENT_FUND_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVFUND_FUND_CODE', 'FTVFUND_TITLE',
   G$_SEARCH_WHERE.F_FTVFUND_KEY(':FRBGRNT_COAS_CODE','SYSDATE'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PAYMENT_FUND_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRBGBIL_PAYMENT_FUND_CODE")
		public void frbgbilPaymentFundCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVFUND_FUND_CODE"), toStr("FTVFUND_TITLE"), getTask().getGoqrpls().getGSearchWhere().fFtvfundKey(toStr(":FRBGRNT_COAS_CODE"), toStr("SYSDATE")));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_PAYMENT_FUND_CODE.POST-CHANGE
		 DECLARE
     CURSOR GET_NAME IS
        SELECT FTVFUND_TITLE
        FROM   FTVFUND
        WHERE  FTVFUND_FUND_CODE = :FRBGBIL_PAYMENT_FUND_CODE
  	  AND FTVFUND_COAS_CODE = :FRBGRNT_COAS_CODE
          AND FTVFUND_NCHG_DATE > SYSDATE
          AND FTVFUND_EFF_DATE <= SYSDATE;

BEGIN
	OPEN GET_NAME;
        FETCH GET_NAME INTO :payment_fund_name;

	IF GET_NAME%NOTFOUND THEN
	   MESSAGE( G$_NLS.Get('FRAGRNT-0179', 'FORM','Payment Fund Code is invalid. Use LIST') , NO_ACKNOWLEDGE);
	   RAISE FORM_TRIGGER_FAILURE;
	END IF;

        CLOSE GET_NAME;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PAYMENT_FUND_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGBIL_PAYMENT_FUND_CODE")
		public void frbgbilPaymentFundCode_PostChange()
		{
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgbilElement==null || frbgrntElement==null)
					return;

				int rowCount = 0;
				if(frbgbilElement.getFrbgbilPaymentFundCode().isNull())
		return;
				{
					String sqlgetName = "SELECT FTVFUND_TITLE " +
	" FROM FTVFUND " +
	" WHERE FTVFUND_FUND_CODE = :FRBGBIL_PAYMENT_FUND_CODE AND FTVFUND_COAS_CODE = :FRBGRNT_COAS_CODE AND FTVFUND_NCHG_DATE > SYSDATE AND FTVFUND_EFF_DATE <= SYSDATE ";
					DataCursor getName = new DataCursor(sqlgetName);
					try {
						//Setting query parameters
						getName.addParameter("FRBGBIL_PAYMENT_FUND_CODE", frbgbilElement.getFrbgbilPaymentFundCode());
						getName.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
						getName.open();
						ResultSet getNameResults = getName.fetchInto();
						if ( getNameResults != null ) {
							frbgbilElement.setPaymentFundName(getNameResults.getStr(0));
						}
						if ( getName.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAGRNT-0179"), toStr("FORM"), toStr("Payment Fund Code is invalid. Use LIST")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
							throw new ApplicationException();
						}
					} finally {
						getName.close();						
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_PAYMENT_FUND_CODE.KEY-LISTVAL
		 BEGIN
	G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
	G$_CHECK_FAILURE;	
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
      G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FTVFUND', 'QUERY');
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0180', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PAYMENT_FUND_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGBIL_PAYMENT_FUND_CODE", function=KeyFunction.LIST_VALUES)
		public void frbgbilPaymentFundCode_ListValues()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FTVFUND"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE")  || (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0180"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PAYMENT_FUND_NAME.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PAYMENT_FUND_NAME", function=KeyFunction.ITEM_CHANGE)
		public void paymentFundName_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PAYMENT_ACCT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBGBIL_PAYMENT_ACCT_CODE")
		public void frbgbilPaymentAcctCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PAYMENT_ACCT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGBIL_PAYMENT_ACCT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void frbgbilPaymentAcctCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PAYMENT_ACCT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRBGBIL_PAYMENT_ACCT_CODE")
		public void frbgbilPaymentAcctCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PAYMENT_ACCT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGBIL_PAYMENT_ACCT_CODE", function=KeyFunction.NEXT_ITEM)
		public void frbgbilPaymentAcctCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_PAYMENT_ACCT_CODE.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
--
IF :FRBGBIL_PAYMENT_ACCT_CODE IS NULL THEN
   :PAYMENT_ACCT_NAME := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PAYMENT_ACCT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGBIL_PAYMENT_ACCT_CODE", function=KeyFunction.ITEM_OUT)
		public void frbgbilPaymentAcctCode_itemOut()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null)
					return;

				getTask().getGoqrpls().getGSearch().postTextCode();
				// 
				if ( frbgbilElement.getFrbgbilPaymentAcctCode().isNull() )
				{
					frbgbilElement.setPaymentAcctName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_PAYMENT_ACCT_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVACCT_ACCT_CODE', 'FTVACCT_TITLE',
   G$_SEARCH_WHERE.F_FTVACCT_KEY(':FRBGRNT_COAS_CODE','SYSDATE'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PAYMENT_ACCT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRBGBIL_PAYMENT_ACCT_CODE")
		public void frbgbilPaymentAcctCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVACCT_ACCT_CODE"), toStr("FTVACCT_TITLE"), getTask().getGoqrpls().getGSearchWhere().fFtvacctKey(toStr(":FRBGRNT_COAS_CODE"), toStr("SYSDATE")));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_PAYMENT_ACCT_CODE.POST-CHANGE
		 DECLARE

TEMP_ACCT_DATA_IND VARCHAR2(1); 
TEMP_ACCT_ATYP VARCHAR2(2);
TEMP_C2 VARCHAR2(1);

CURSOR C1_CURSOR IS
 SELECT FTVACCT_DATA_ENTRY_IND,
        FTVACCT_ATYP_CODE
   FROM FTVACCT
  WHERE FTVACCT_ACCT_CODE = :FRBGBIL_PAYMENT_ACCT_CODE
    AND FTVACCT_COAS_CODE = :FRBGRNT_COAS_CODE
    AND FTVACCT_NCHG_DATE > SYSDATE
    AND FTVACCT_EFF_DATE <= SYSDATE;
    
  CURSOR C2_CURSOR IS
    SELECT 'X'
      FROM FTVATYP
     WHERE FTVATYP_COAS_CODE = :FRBGRNT_COAS_CODE
       AND FTVATYP_ATYP_CODE = TEMP_ACCT_ATYP
       AND FTVATYP_INTERNAL_ATYP_CODE IN ('10', '20', '90', '95')
       AND FTVATYP_EFF_DATE <= SYSDATE
       AND FTVATYP_NCHG_DATE > SYSDATE;
       

BEGIN
 OPEN C1_CURSOR;
 FETCH C1_CURSOR INTO TEMP_ACCT_DATA_IND, TEMP_ACCT_ATYP;

 IF C1_CURSOR%NOTFOUND THEN
    MESSAGE( G$_NLS.Get('FRAGRNT-0181', 'FORM','Undistributed Cash Receipts Account is Invalid.') );
    RAISE FORM_TRIGGER_FAILURE;

 ELSE

    OPEN C2_CURSOR;
    FETCH C2_CURSOR INTO TEMP_C2;
    IF C2_CURSOR%NOTFOUND THEN
     MESSAGE( G$_NLS.Get('FRAGRNT-0182', 'FORM','Undistributed Cash Receipts Account code must be of ATYP 10(Assets) 20(Liabilities), 90(Fund additions), 95(Fund deductions).') );
     RAISE FORM_TRIGGER_FAILURE;

    ELSE

       IF TEMP_ACCT_DATA_IND <> 'Y' THEN
          MESSAGE( G$_NLS.Get('FRAGRNT-0183', 'FORM','Undistributed Cash Receipts Account must be Data Enterable.') );
          RAISE FORM_TRIGGER_FAILURE;
       END IF;

    END IF;
    CLOSE C2_CURSOR;
 END IF;
 CLOSE C1_CURSOR;
END;

--
DECLARE
     CURSOR get_name IS
        SELECT ftvacct_title
          FROM ftvacct
         WHERE ftvacct_acct_code = :frbgbil.FRBGBIL_payment_acct_code
           AND ftvacct_coas_code = :FRBGRNT_COAS_CODE --defect 76318 begins
           AND FTVACCT_NCHG_DATE > SYSDATE
           AND FTVACCT_EFF_DATE <= SYSDATE;           --defect 76318 ends


BEGIN
	OPEN get_name ;
        FETCH get_name INTO :payment_acct_name;
	IF get_name%NOTFOUND THEN
		MESSAGE( G$_NLS.Get('FRAGRNT-0184', 'FORM','Payment Account Code is invalid. Use LIST') , NO_ACKNOWLEDGE);
		RAISE FORM_TRIGGER_FAILURE;
	END IF;
        close get_name;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PAYMENT_ACCT_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGBIL_PAYMENT_ACCT_CODE")
		public void frbgbilPaymentAcctCode_PostChange()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgbilElement==null || frbgrntElement==null)
					return;

				int rowCount = 0;
				if(frbgbilElement.getFrbgbilPaymentAcctCode().isNull())
		return;
				{
					NString tempAcctDataInd= NString.getNull();
					NString tempAcctAtyp= NString.getNull();
					NString tempC2= NString.getNull();
					String sqlc1Cursor = "SELECT FTVACCT_DATA_ENTRY_IND, FTVACCT_ATYP_CODE " +
	" FROM FTVACCT " +
	" WHERE FTVACCT_ACCT_CODE = :FRBGBIL_PAYMENT_ACCT_CODE AND FTVACCT_COAS_CODE = :FRBGRNT_COAS_CODE AND FTVACCT_NCHG_DATE > SYSDATE AND FTVACCT_EFF_DATE <= SYSDATE ";
					DataCursor c1Cursor = new DataCursor(sqlc1Cursor);
					String sqlc2Cursor = "SELECT 'X' " +
	" FROM FTVATYP " +
	" WHERE FTVATYP_COAS_CODE = :FRBGRNT_COAS_CODE AND FTVATYP_ATYP_CODE = :P_TEMP_ACCT_ATYP AND (FTVATYP_INTERNAL_ATYP_CODE) IN ('10', '20', '90', '95') AND FTVATYP_EFF_DATE <= SYSDATE AND FTVATYP_NCHG_DATE > SYSDATE ";
					DataCursor c2Cursor = new DataCursor(sqlc2Cursor);
					try {
						//Setting query parameters
						c1Cursor.addParameter("FRBGBIL_PAYMENT_ACCT_CODE", frbgbilElement.getFrbgbilPaymentAcctCode());
						c1Cursor.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
						c1Cursor.open();
						ResultSet c1CursorResults = c1Cursor.fetchInto();
						if ( c1CursorResults != null ) {
							tempAcctDataInd = c1CursorResults.getStr(0);
							tempAcctAtyp = c1CursorResults.getStr(1);
						}
						if ( c1Cursor.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAGRNT-0181"), toStr("FORM"), toStr("Undistributed Cash Receipts Account is Invalid.")));
							throw new ApplicationException();
						}
						else {
							//Setting query parameters
							c2Cursor.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
							c2Cursor.addParameter("P_TEMP_ACCT_ATYP", tempAcctAtyp);
							c2Cursor.open();
							ResultSet c2CursorResults = c2Cursor.fetchInto();
							if ( c2CursorResults != null ) {
								tempC2 = c2CursorResults.getStr(0);
							}
							if ( c2Cursor.notFound() )
							{
								errorMessage(GNls.Fget(toStr("FRAGRNT-0182"), toStr("FORM"), toStr("Undistributed Cash Receipts Account code must be of ATYP 10(Assets) 20(Liabilities), 90(Fund additions), 95(Fund deductions).")));
								throw new ApplicationException();
							}
							else {
								if ( tempAcctDataInd.notEquals("Y") )
								{
									errorMessage(GNls.Fget(toStr("FRAGRNT-0183"), toStr("FORM"), toStr("Undistributed Cash Receipts Account must be Data Enterable.")));
									throw new ApplicationException();
								}
							}
						}
					} finally {
						c1Cursor.close();	
						c2Cursor.close();
					}

				}
				{
					String sqlgetName = "SELECT ftvacct_title " +
	" FROM ftvacct " +
	" WHERE ftvacct_acct_code = :FRBGBIL_FRBGBIL_PAYMENT_ACCT_CODE AND ftvacct_coas_code = :FRBGRNT_COAS_CODE AND FTVACCT_NCHG_DATE > SYSDATE AND FTVACCT_EFF_DATE <= SYSDATE ";
					DataCursor getName = new DataCursor(sqlgetName);
					try {
						//Setting query parameters
						getName.addParameter("FRBGBIL_FRBGBIL_PAYMENT_ACCT_CODE", frbgbilElement.getFrbgbilPaymentAcctCode());
						getName.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
						getName.open();
						ResultSet getNameResults = getName.fetchInto();
						if ( getNameResults != null ) {
							frbgbilElement.setPaymentAcctName(getNameResults.getStr(0));
						}
						if ( getName.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAGRNT-0184"), toStr("FORM"), toStr("Payment Account Code is invalid. Use LIST")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
							throw new ApplicationException();
						}
					} finally {
						getName.close();						
					}

				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_PAYMENT_ACCT_CODE.KEY-LISTVAL
		 BEGIN
	G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
  G$_CHECK_FAILURE;
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
      G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FTVACCT', 'QUERY');
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0185', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PAYMENT_ACCT_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGBIL_PAYMENT_ACCT_CODE", function=KeyFunction.LIST_VALUES)
		public void frbgbilPaymentAcctCode_ListValues()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FTVACCT"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE")  || (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0185"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PAYMENT_ACCT_NAME.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="PAYMENT_ACCT_NAME", function=KeyFunction.ITEM_CHANGE)
		public void paymentAcctName_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_CLEARING_ACCT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBGBIL_CLEARING_ACCT_CODE")
		public void frbgbilClearingAcctCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_CLEARING_ACCT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGBIL_CLEARING_ACCT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void frbgbilClearingAcctCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_CLEARING_ACCT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRBGBIL_CLEARING_ACCT_CODE")
		public void frbgbilClearingAcctCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_CLEARING_ACCT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGBIL_CLEARING_ACCT_CODE", function=KeyFunction.NEXT_ITEM)
		public void frbgbilClearingAcctCode_keyNexItem()
		{
			
				
			
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_CLEARING_ACCT_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVACCT_ACCT_CODE', 'FTVACCT_TITLE',
 G$_SEARCH_WHERE.F_FTVACCT_KEY(':FRBGRNT_COAS_CODE',
				'SYSDATE'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_CLEARING_ACCT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRBGBIL_CLEARING_ACCT_CODE")
		public void frbgbilClearingAcctCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVACCT_ACCT_CODE"), toStr("FTVACCT_TITLE"), getTask().getGoqrpls().getGSearchWhere().fFtvacctKey(toStr(":FRBGRNT_COAS_CODE"), toStr("SYSDATE")));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_CLEARING_ACCT_CODE.KEY-LISTVAL
		 BEGIN
	G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
	G$_CHECK_FAILURE;	
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
      G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FTVACCT', 'QUERY');
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0186', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_CLEARING_ACCT_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGBIL_CLEARING_ACCT_CODE", function=KeyFunction.LIST_VALUES)
		public void frbgbilClearingAcctCode_ListValues()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FTVACCT"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") ||  (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0186"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_CLEARING_ACCT_CODE.POST-TEXT-ITEM
		 IF :frbgbil_clearing_acct_code IS NULL THEN
   :clearing_acct_name := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_CLEARING_ACCT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGBIL_CLEARING_ACCT_CODE", function=KeyFunction.ITEM_OUT)
		public void frbgbilClearingAcctCode_itemOut()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null)
					return;


				if ( frbgbilElement.getFrbgbilClearingAcctCode().isNull() )
				{
					frbgbilElement.setClearingAcctName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_CLEARING_ACCT_CODE.POST-CHANGE
		 
DECLARE

TEMP_ACCT_DATA_IND VARCHAR2(1); 
TEMP_ACCT_ATYP VARCHAR2(2);
TEMP_C2 VARCHAR2(1);

CURSOR C1_CURSOR IS
 SELECT FTVACCT_DATA_ENTRY_IND,
        FTVACCT_ATYP_CODE
   FROM FTVACCT
  WHERE FTVACCT_ACCT_CODE = :FRBGBIL_CLEARING_ACCT_CODE
    AND FTVACCT_COAS_CODE = :FRBGRNT_COAS_CODE
    AND FTVACCT_NCHG_DATE > SYSDATE
    AND FTVACCT_EFF_DATE <= SYSDATE;
    
  CURSOR C2_CURSOR IS
    SELECT 'X'
      FROM FTVATYP
     WHERE FTVATYP_COAS_CODE = :FRBGRNT_COAS_CODE
       AND FTVATYP_ATYP_CODE = TEMP_ACCT_ATYP
       AND FTVATYP_INTERNAL_ATYP_CODE IN ('10', '20', '90', '95')
       AND FTVATYP_EFF_DATE <= SYSDATE
       AND FTVATYP_NCHG_DATE > SYSDATE;
       

BEGIN
 OPEN C1_CURSOR;
 FETCH C1_CURSOR INTO TEMP_ACCT_DATA_IND, TEMP_ACCT_ATYP;

 IF C1_CURSOR%NOTFOUND THEN
    MESSAGE( G$_NLS.Get('FRAGRNT-0187', 'FORM','Clearing Account is Invalid.') );
    RAISE FORM_TRIGGER_FAILURE;

 ELSE

    OPEN C2_CURSOR;
    FETCH C2_CURSOR INTO TEMP_C2;
    IF C2_CURSOR%NOTFOUND THEN
     MESSAGE( G$_NLS.Get('FRAGRNT-0188', 'FORM','Clearing Account code must be of ATYP 10(Assets) 20(Liabilities), 90(Fund additions), 95(Fund deductions).') );
     RAISE FORM_TRIGGER_FAILURE;

    ELSE

       IF TEMP_ACCT_DATA_IND <> 'Y' THEN
          MESSAGE( G$_NLS.Get('FRAGRNT-0189', 'FORM','Clearing Account must be Data Enterable.') );
          RAISE FORM_TRIGGER_FAILURE;
       END IF;

    END IF;
    CLOSE C2_CURSOR;
 END IF;
 CLOSE C1_CURSOR;
END;



DECLARE
     CURSOR get_name IS
        SELECT ftvacct_title
          FROM ftvacct
         WHERE ftvacct_acct_code = :frbgbil.FRBGBIL_CLEARING_ACCT_CODE
           AND FTVACCT_COAS_CODE  = :FRBGRNT_COAS_CODE  --defect 76318 begins
           AND FTVACCT_NCHG_DATE > SYSDATE
           AND FTVACCT_EFF_DATE <= SYSDATE;              --defect 76318 ends


BEGIN
	OPEN get_name ;
        FETCH get_name INTO :CLEARING_ACCT_NAME;
	IF get_name%NOTFOUND THEN
		MESSAGE( G$_NLS.Get('FRAGRNT-0190', 'FORM','Clearing Account Code is invalid. Use LIST') , NO_ACKNOWLEDGE);
		RAISE FORM_TRIGGER_FAILURE;
	END IF;
        close get_name;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_CLEARING_ACCT_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGBIL_CLEARING_ACCT_CODE")
		public void frbgbilClearingAcctCode_PostChange()
		{
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgbilElement==null || frbgrntElement==null)
					return;


				int rowCount = 0;
				if(frbgbilElement.getFrbgbilClearingAcctCode().isNull())
		return;
				{
					NString tempAcctDataInd= NString.getNull();
					NString tempAcctAtyp= NString.getNull();
					NString tempC2= NString.getNull();
					String sqlc1Cursor = "SELECT FTVACCT_DATA_ENTRY_IND, FTVACCT_ATYP_CODE " +
	" FROM FTVACCT " +
	" WHERE FTVACCT_ACCT_CODE = :FRBGBIL_CLEARING_ACCT_CODE AND FTVACCT_COAS_CODE = :FRBGRNT_COAS_CODE AND FTVACCT_NCHG_DATE > SYSDATE AND FTVACCT_EFF_DATE <= SYSDATE ";
					DataCursor c1Cursor = new DataCursor(sqlc1Cursor);
					String sqlc2Cursor = "SELECT 'X' " +
	" FROM FTVATYP " +
	" WHERE FTVATYP_COAS_CODE = :FRBGRNT_COAS_CODE AND FTVATYP_ATYP_CODE = :P_TEMP_ACCT_ATYP AND (FTVATYP_INTERNAL_ATYP_CODE) IN ('10', '20', '90', '95') AND FTVATYP_EFF_DATE <= SYSDATE AND FTVATYP_NCHG_DATE > SYSDATE ";
					DataCursor c2Cursor = new DataCursor(sqlc2Cursor);
					try {
						//Setting query parameters
						c1Cursor.addParameter("FRBGBIL_CLEARING_ACCT_CODE", frbgbilElement.getFrbgbilClearingAcctCode());
						c1Cursor.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
						c1Cursor.open();
						ResultSet c1CursorResults = c1Cursor.fetchInto();
						if ( c1CursorResults != null ) {
							tempAcctDataInd = c1CursorResults.getStr(0);
							tempAcctAtyp = c1CursorResults.getStr(1);
						}
						if ( c1Cursor.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAGRNT-0187"), toStr("FORM"), toStr("Clearing Account is Invalid.")));
							throw new ApplicationException();
						}
						else {
							//Setting query parameters
							c2Cursor.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
							c2Cursor.addParameter("P_TEMP_ACCT_ATYP", tempAcctAtyp);
							c2Cursor.open();
							ResultSet c2CursorResults = c2Cursor.fetchInto();
							if ( c2CursorResults != null ) {
								tempC2 = c2CursorResults.getStr(0);
							}
							if ( c2Cursor.notFound() )
							{
								errorMessage(GNls.Fget(toStr("FRAGRNT-0188"), toStr("FORM"), toStr("Clearing Account code must be of ATYP 10(Assets) 20(Liabilities), 90(Fund additions), 95(Fund deductions).")));
								throw new ApplicationException();
							}
							else {
								if ( tempAcctDataInd.notEquals("Y") )
								{
									errorMessage(GNls.Fget(toStr("FRAGRNT-0189"), toStr("FORM"), toStr("Clearing Account must be Data Enterable.")));
									throw new ApplicationException();
								}
							}
							
						}
					} finally {
						c1Cursor.close();	
						c2Cursor.close();
					}

				}
				{
					String sqlgetName = "SELECT ftvacct_title " +
	" FROM ftvacct " +
	" WHERE ftvacct_acct_code = :FRBGBIL_FRBGBIL_CLEARING_ACCT_CODE AND FTVACCT_COAS_CODE = :FRBGRNT_COAS_CODE AND FTVACCT_NCHG_DATE > SYSDATE AND FTVACCT_EFF_DATE <= SYSDATE ";
					DataCursor getName = new DataCursor(sqlgetName);
					try {
						//Setting query parameters
						getName.addParameter("FRBGBIL_FRBGBIL_CLEARING_ACCT_CODE", frbgbilElement.getFrbgbilClearingAcctCode());
						getName.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
						getName.open();
						ResultSet getNameResults = getName.fetchInto();
						if ( getNameResults != null ) {
							frbgbilElement.setClearingAcctName(getNameResults.getStr(0));
						}
						if ( getName.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAGRNT-0190"), toStr("FORM"), toStr("Clearing Account Code is invalid. Use LIST")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
							throw new ApplicationException();
						}
					} finally {
						getName.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * CLEARING_ACCT_NAME.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="CLEARING_ACCT_NAME", function=KeyFunction.ITEM_CHANGE)
		public void clearingAcctName_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_ADDR_TYPE.KEY-LISTVAL
		 BEGIN
next_item;
do_key('LIST_VALUES');
g$_check_failure; 
go_item('FRBGBIL_LAST_INV_SEQ_NO');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_ADDR_TYPE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGBIL_ADDR_TYPE", function=KeyFunction.LIST_VALUES)
		public void frbgbilAddrType_ListValues()
		{
			
				nextItem();
				executeAction("LIST_VALUES");
				getTask().getGoqrpls().gCheckFailure();
				goItem(toStr("FRBGBIL_LAST_INV_SEQ_NO"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_ADDR_TYPE.POST-TEXT-ITEM
		    IF :CALLED_FROM_INQUIRY =1 THEN 
      RETURN;
   END IF;	
   IF :frbgbil_addr_type IS NULL  THEN
         :frbgbil_addr_type := '';
         :frbgbil_addr_seqno := '' ;
         G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_ADDR_TYPE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGBIL_ADDR_TYPE", function=KeyFunction.ITEM_OUT)
		public void frbgbilAddrType_itemOut()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null)
					return;


				if ( getFormModel().getFormHeader().getCalledFromInquiry().equals(1) )
				{
					return ;
				}
				if ( frbgbilElement.getFrbgbilAddrType().isNull() )
				{
					frbgbilElement.setFrbgbilAddrType(toStr(""));
					frbgbilElement.setFrbgbilAddrSeqno(toNumber(""));
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_ADDR_TYPE.POST-CHANGE
		 BEGIN

   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_STEP_001 ;
   END IF ;
--
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   STVATYP
         WHERE  STVATYP_CODE = :frbgbil_addr_type ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
          G$_NLS.Get('FRAGRNT-0191', 'FORM','Address type code is invalid; Use LIST.') , TRUE);
   END ;
--
   << PTI_STEP_001 >>
   IF :frbgrnt_AGENCY_ADDR_SEQ_NUM IS NOT NULL  THEN
--      EXECUTE_TRIGGER( 'CLR_ADDR' ) ;
      G$_CHECK_FAILURE ;
--      EXECUTE_TRIGGER( 'EDIT_SPRADDR' ) ;
      G$_CHECK_FAILURE ;
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
		 * FRBGBIL_ADDR_TYPE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGBIL_ADDR_TYPE")
		public void frbgbilAddrType_PostChange()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgbilElement==null || frbgrntElement==null)
					return;

				int rowCount = 0;
				if(frbgbilElement.getFrbgbilAddrType().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if (!(getGlobal("QUERY_MODE").equals("1")))
					{
//						 goto PTI_STEP_001;
//					}
//					{
						NString ptiIntoTemp= NString.getNull();
						String sqlptiCursor = "SELECT 'X' " +
												" FROM STVATYP " +
												" WHERE STVATYP_CODE = :FRBGBIL_ADDR_TYPE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("FRBGBIL_ADDR_TYPE", frbgbilElement.getFrbgbilAddrType());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								ptiIntoTemp = ptiCursorResults.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAGRNT-0191"), toStr("FORM"), toStr("Address type code is invalid; Use LIST.")), toBool(NBool.True));
						} finally {
							ptiCursor.close();
						}
					}
					 //PTI_STEP_001:;
					if ( !frbgrntElement.getFrbgrntAgencyAddrSeqNum().isNull() )
					{
						//       EXECUTE_TRIGGER( 'CLR_ADDR' ) ;
						getTask().getGoqrpls().gCheckFailure();
						//       EXECUTE_TRIGGER( 'EDIT_SPRADDR' ) ;
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

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_ADDR_SEQNO.KEY-LISTVAL
		 BEGIN
   :GLOBAL.ATYP_CODE := :frbgrnt_AGENCY_ADDR_CODE ;
   :GLOBAL.PIDM := :frbgrnt_AGENCY_PIDM;
--
   :GLOBAL.VALUE := '';
   G$_COPY_FLD_ATTR;
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER,'FOQADDR','QUERY');
--
   IF :GLOBAL.SEQNO IS NOT NULL THEN
      :frbgbil_ADDR_SEQNO := :GLOBAL.SEQNO;
   END IF; 
--
   IF :GLOBAL.ATYP_CODE IS NOT NULL THEN
      :frbgbil_addr_type  := :GLOBAL.ATYP_CODE ;
      GO_ITEM('frbgbil_last_inv_seq_no'); 
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_ADDR_SEQNO.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGBIL_ADDR_SEQNO", function=KeyFunction.LIST_VALUES)
		public void frbgbilAddrSeqno_ListValues()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null || frbgrntElement==null)
					return;


				setGlobal("ATYP_CODE", frbgrntElement.getFrbgrntAgencyAddrCode());
				setGlobal("PIDM", toStr(frbgrntElement.getFrbgrntAgencyPidm()));
				// 
				setGlobal("VALUE", toStr(""));
				getTask().getGoqrpls().gCopyFldAttr();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FOQADDR"), toStr("QUERY"));
				// 
				if ( !getGlobal("SEQNO").isNull() )
				{
					frbgbilElement.setFrbgbilAddrSeqno(toNumber(getGlobal("SEQNO")));
				}
				// 
				if ( !getGlobal("ATYP_CODE").isNull() )
				{
					frbgbilElement.setFrbgbilAddrType(getGlobal("ATYP_CODE"));
					goItem(toStr("frbgbil_last_inv_seq_no"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_ADDR_SEQNO.POST-CHANGE
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
         WHERE  SPRADDR_ATYP_CODE = :FRBGBIL_ADDR_TYPE
           AND  SPRADDR_SEQNO = :FRBGBIL_ADDR_SEQNO ;
     BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE(PTI_CURSOR%NOTFOUND,
  G$_NLS.Get('FRAGRNT-0192', 'FORM','Address does not currently exist on address table (SPRADDR)') ,FALSE);
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
		 * FRBGBIL_ADDR_SEQNO.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGBIL_ADDR_SEQNO")
		public void frbgbilAddrSeqno_PostChange()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null)
					return;


				int rowCount = 0;
				if(frbgbilElement.getFrbgbilAddrSeqno().isNull())
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
												" WHERE SPRADDR_ATYP_CODE = :FRBGBIL_ADDR_TYPE AND SPRADDR_SEQNO = :FRBGBIL_ADDR_SEQNO ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("FRBGBIL_ADDR_TYPE", frbgbilElement.getFrbgbilAddrType());
							ptiCursor.addParameter("FRBGBIL_ADDR_SEQNO", frbgbilElement.getFrbgbilAddrSeqno());
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								ptiIntoTemp = ptiCursorResults.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAGRNT-0192"), toStr("FORM"), toStr("Address does not currently exist on address table (SPRADDR)")), toBool(NBool.False));
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

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_ADDR_SEQNO.KEY-NEXT-ITEM
		    IF :FRBGBIL_ADDR_TYPE IS NULL  THEN
      NEXT_FIELD ;
   ELSE
      EXECUTE_TRIGGER( 'TRG_FAIL' ) ;
      IF NOT FORM_SUCCESS THEN
         GOTO DO_NXTFLD ;
      END IF ;
   END IF ;
--
   << DO_CLEAR >>
   :FRBGBIL_ADDR_TYPE := '' ;
--
   << DO_NXTFLD >>
   NEXT_FIELD ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_ADDR_SEQNO.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGBIL_ADDR_SEQNO", function=KeyFunction.NEXT_ITEM)
		public void frbgbilAddrSeqno_keyNexItem()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null)
					return;


				if ( frbgbilElement.getFrbgbilAddrType().isNull() )
				{
					nextItem();
				}
				else {
					try
					{
						executeAction("TRG_FAIL");
					}catch(Exception e)
					{
						nextItem();
						return;
					}
					
				}
				frbgbilElement.setFrbgbilAddrType(toStr(""));
				 //DO_CLEAR:;
				 //DO_NXTFLD:;
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BFRM_CODE_1034_EXT.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBGBIL_BFRM_CODE_1034_EXT")
		public void frbgbilBfrmCode1034Ext_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BFRM_CODE_1034_EXT.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGBIL_BFRM_CODE_1034_EXT", function=KeyFunction.ITEM_CHANGE)
		public void frbgbilBfrmCode1034Ext_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BFRM_CODE_1034_EXT.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRBGBIL_BFRM_CODE_1034_EXT")
		public void frbgbilBfrmCode1034Ext_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BFRM_CODE_1034_EXT.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGBIL_BFRM_CODE_1034_EXT", function=KeyFunction.NEXT_ITEM)
		public void frbgbilBfrmCode1034Ext_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BFRM_CODE_1034_EXT.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGBIL_BFRM_CODE_1034_EXT", function=KeyFunction.ITEM_OUT)
		public void frbgbilBfrmCode1034Ext_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BFRM_CODE_1034_EXT.POST-CHANGE
		 BEGIN
   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   frvbfrm
         WHERE  frvbfrm_code = :frbgbil_bfrm_code_1034_ext ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
          G$_NLS.Get('FRAGRNT-0193', 'FORM','1034 BFRM extension is invalid; Use LIST.') , TRUE);
   END ;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BFRM_CODE_1034_EXT.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGBIL_BFRM_CODE_1034_EXT")
		public void frbgbilBfrmCode1034Ext_PostChange()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null)
					return;


				int rowCount = 0;
				if(frbgbilElement.getFrbgbilBfrmCode1034Ext().isNull())
		return;
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM frvbfrm " +
	" WHERE frvbfrm_code = :FRBGBIL_BFRM_CODE_1034_EXT ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBGBIL_BFRM_CODE_1034_EXT", frbgbilElement.getFrbgbilBfrmCode1034Ext());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAGRNT-0193"), toStr("FORM"), toStr("1034 BFRM extension is invalid; Use LIST.")), toBool(NBool.True));
					} finally {
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BFRM_CODE_1034_EXT.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FRVBFRM_CODE', 'FRVBFRM_DESC','');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BFRM_CODE_1034_EXT.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRBGBIL_BFRM_CODE_1034_EXT")
		public void frbgbilBfrmCode1034Ext_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FRVBFRM_CODE"), toStr("FRVBFRM_DESC"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BFRM_CODE_1034_EXT.KEY-LISTVAL
		 BEGIN
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0194', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BFRM_CODE_1034_EXT.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGBIL_BFRM_CODE_1034_EXT", function=KeyFunction.LIST_VALUES)
		public void frbgbilBfrmCode1034Ext_ListValues()
		{
			
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
						errorMessage(GNls.Fget(toStr("FRAGRNT-0194"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BUD_LINE_EXCEED_IND.WHEN-VALIDATE-ITEM
		 if :FRBGBIL_BUD_LINE_EXCEED_IND is not null and
   :FRBGBIL_BUD_LINE_EXCEED_IND not in('Y','N')  then
      message( G$_NLS.Get('FRAGRNT-0195', 'FORM','Invalid Line Item Budget Indicator. Enter Y or N.') );
        Raise Form_Trigger_Failure;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BUD_LINE_EXCEED_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGBIL_BUD_LINE_EXCEED_IND")
		public void frbgbilBudLineExceedInd_validate()
		{
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null)
					return;


				if ( !frbgbilElement.getFrbgbilBudLineExceedInd().isNull() && !in(frbgbilElement.getFrbgbilBudLineExceedInd(), "Y", "N").getValue() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0195"), toStr("FORM"), toStr("Invalid Line Item Budget Indicator. Enter Y or N.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_MIN_NOT_REACHED_IND.WHEN-VALIDATE-ITEM
		 if :FRBGBIL_BUD_LINE_EXCEED_IND is not null and
   :FRBGBIL_BUD_LINE_EXCEED_IND not in('Y','N')  then
      message( G$_NLS.Get('FRAGRNT-0196', 'FORM','Invalid Minimum Not Reached Indicator. Enter Y or N.') );
        Raise Form_Trigger_Failure;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_MIN_NOT_REACHED_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGBIL_MIN_NOT_REACHED_IND")
		public void frbgbilMinNotReachedInd_validate()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null)
					return;


				if ( !frbgbilElement.getFrbgbilBudLineExceedInd().isNull() && !in(frbgbilElement.getFrbgbilBudLineExceedInd(), "Y", "N").getValue() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0196"), toStr("FORM"), toStr("Invalid Minimum Not Reached Indicator. Enter Y or N.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BUD_TOTAL_EXCEED_IND.WHEN-VALIDATE-ITEM
		 if :FRBGBIL_BUD_TOTAL_EXCEED_IND is not null and
   :FRBGBIL_BUD_TOTAL_EXCEED_IND not in('Y','N')  then
      message( G$_NLS.Get('FRAGRNT-0197', 'FORM','Invalid Budget Total Exceeded Indicator. Enter Y or N.') );
        Raise Form_Trigger_Failure;
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BUD_TOTAL_EXCEED_IND.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGBIL_BUD_TOTAL_EXCEED_IND")
		public void frbgbilBudTotalExceedInd_validate()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null)
					return;


				if ( !frbgbilElement.getFrbgbilBudTotalExceedInd().isNull() && !in(frbgbilElement.getFrbgbilBudTotalExceedInd(), "Y", "N").getValue() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0197"), toStr("FORM"), toStr("Invalid Budget Total Exceeded Indicator. Enter Y or N.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BILLING_START_DATE.KEY-NEXT-ITEM
		 g$_date_reformat('',''); g$_check_failure;
next_item;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BILLING_START_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGBIL_BILLING_START_DATE", function=KeyFunction.NEXT_ITEM)
		public void frbgbilBillingStartDate_keyNexItem()
		{

				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BILLING_START_DATE.WHEN-NEW-ITEM-INSTANCE
		 g$_date_when_new_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BILLING_START_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGBIL_BILLING_START_DATE", function=KeyFunction.ITEM_CHANGE)
		public void frbgbilBillingStartDate_itemChange()
		{
			
				getTask().getGoqrpls().gDateWhenNewItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BILLING_START_DATE.POST-TEXT-ITEM
		 g$_date_post_item; g$_check_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BILLING_START_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGBIL_BILLING_START_DATE", function=KeyFunction.ITEM_OUT)
		public void frbgbilBillingStartDate_itemOut()
		{
			
				getTask().getGoqrpls().gDatePostItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BILLING_START_DATE.POST-CHANGE
		 g$_date_reformat('',''); g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BILLING_START_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGBIL_BILLING_START_DATE")
		public void frbgbilBillingStartDate_PostChange()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null)
					return;


				if(frbgbilElement.getFrbgbilBillingStartDate().isNull())
					return;

			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BILLING_END_DATE.KEY-NEXT-ITEM
		 g$_date_reformat('',''); g$_check_failure;
next_item;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BILLING_END_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGBIL_BILLING_END_DATE", function=KeyFunction.NEXT_ITEM)
		public void frbgbilBillingEndDate_keyNexItem()
		{

				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BILLING_END_DATE.WHEN-NEW-ITEM-INSTANCE
		 g$_date_when_new_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BILLING_END_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGBIL_BILLING_END_DATE", function=KeyFunction.ITEM_CHANGE)
		public void frbgbilBillingEndDate_itemChange()
		{
			
				getTask().getGoqrpls().gDateWhenNewItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BILLING_END_DATE.POST-TEXT-ITEM
		 g$_date_post_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BILLING_END_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGBIL_BILLING_END_DATE", function=KeyFunction.ITEM_OUT)
		public void frbgbilBillingEndDate_itemOut()
		{
			
				getTask().getGoqrpls().gDatePostItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BILLING_END_DATE.POST-CHANGE
		 g$_date_reformat('',''); g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BILLING_END_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGBIL_BILLING_END_DATE")
		public void frbgbilBillingEndDate_PostChange()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null)
					return;


				if(frbgbilElement.getFrbgbilBillingEndDate().isNull())
					return;

			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BILLING_MIN_AMT.POST-CHANGE
		   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   DUAL
         WHERE  :frbgbil_billing_min_amt >= 0 ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('FRAGRNT-0198', 'FORM','Billing Minimum must be greater than or equal to 0') , TRUE);
   END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BILLING_MIN_AMT.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGBIL_BILLING_MIN_AMT")
		public void frbgbilBillingMinAmt_PostChange()
		{
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null)
					return;


				int rowCount = 0;
				if(frbgbilElement.getFrbgbilBillingMinAmt().isNull())
		return;
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM DUAL " +
	" WHERE :FRBGBIL_BILLING_MIN_AMT >= 0 ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
						//Setting query parameters
						ptiCursor.addParameter("FRBGBIL_BILLING_MIN_AMT", frbgbilElement.getFrbgbilBillingMinAmt());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAGRNT-0198"), toStr("FORM"), toStr("Billing Minimum must be greater than or equal to 0")), toBool(NBool.True));
					} finally {
						ptiCursor.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_BILLING_MAX_AMT.POST-CHANGE
		   DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   DUAL
         WHERE  :frbgbil_billing_max_amt > 0 ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
 G$_NLS.Get('FRAGRNT-0199', 'FORM','Billing Maximum must be greater than zero') , TRUE);
   END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BILLING_MAX_AMT.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGBIL_BILLING_MAX_AMT")
		public void frbgbilBillingMaxAmt_PostChange()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null)
					return;

				int rowCount = 0;
				if(frbgbilElement.getFrbgbilBillingMaxAmt().isNull())
					return;
				{
					NString ptiIntoTemp= NString.getNull();
					String sqlptiCursor = "SELECT 'X' " +
	" FROM DUAL " +
	" WHERE :FRBGBIL_BILLING_MAX_AMT > 0 ";
					DataCursor ptiCursor = new DataCursor(sqlptiCursor);
					try {
					//Setting query parameters
						ptiCursor.addParameter("FRBGBIL_BILLING_MAX_AMT", frbgbilElement.getFrbgbilBillingMaxAmt());
						ptiCursor.open();
						ResultSet ptiCursorResults = ptiCursor.fetchInto();
						if ( ptiCursorResults != null ) {
							ptiIntoTemp = ptiCursorResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAGRNT-0199"), toStr("FORM"), toStr("Billing Maximum must be greater than zero")), toBool(NBool.True));
					} finally {
						ptiCursor.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_DEFERRED_ACCT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBGBIL_DEFERRED_ACCT_CODE")
		public void frbgbilDeferredAcctCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_DEFERRED_ACCT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGBIL_DEFERRED_ACCT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void frbgbilDeferredAcctCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_DEFERRED_ACCT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRBGBIL_DEFERRED_ACCT_CODE")
		public void frbgbilDeferredAcctCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_DEFERRED_ACCT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGBIL_DEFERRED_ACCT_CODE", function=KeyFunction.NEXT_ITEM)
		public void frbgbilDeferredAcctCode_keyNexItem()
		{
				getGCodeClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_DEFERRED_ACCT_CODE.KEY-LISTVAL
		 BEGIN
	G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
	G$_CHECK_FAILURE;	
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
      G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FTVACCT', 'QUERY');
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0200', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_DEFERRED_ACCT_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGBIL_DEFERRED_ACCT_CODE", function=KeyFunction.LIST_VALUES)
		public void frbgbilDeferredAcctCode_ListValues()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FTVACCT"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") || (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0200"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_DEFERRED_ACCT_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVACCT_ACCT_CODE', 'FTVACCT_TITLE',
   G$_SEARCH_WHERE.F_FTVACCT_KEY(':FRBGRNT_COAS_CODE','SYSDATE'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_DEFERRED_ACCT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRBGBIL_DEFERRED_ACCT_CODE")
		public void frbgbilDeferredAcctCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVACCT_ACCT_CODE"), toStr("FTVACCT_TITLE"), getTask().getGoqrpls().getGSearchWhere().fFtvacctKey(toStr(":FRBGRNT_COAS_CODE"), toStr("SYSDATE")));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_DEFERRED_ACCT_CODE.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
--
IF :frbgbil_deferred_acct_code IS NULL THEN
   :deffered_acct_name := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_DEFERRED_ACCT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGBIL_DEFERRED_ACCT_CODE", function=KeyFunction.ITEM_OUT)
		public void frbgbilDeferredAcctCode_itemOut()
		{
			
			FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				
				if(frbgbilElement==null)
					return;

				getTask().getGoqrpls().getGSearch().postTextCode();
				// 
				if ( frbgbilElement.getFrbgbilDeferredAcctCode().isNull() )
				{
					frbgbilElement.setDefferedAcctName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGBIL_DEFERRED_ACCT_CODE.POST-CHANGE
		 DECLARE

TEMP_ACCT_DATA_IND VARCHAR2(1); 
TEMP_ACCT_ATYP VARCHAR2(2);
TEMP_C2 VARCHAR2(1);

CURSOR C1_CURSOR IS
 SELECT FTVACCT_DATA_ENTRY_IND,
        FTVACCT_ATYP_CODE
   FROM FTVACCT
  WHERE FTVACCT_ACCT_CODE = :FRBGBIL_DEFERRED_ACCT_CODE
    AND FTVACCT_COAS_CODE = :FRBGRNT_COAS_CODE
    AND FTVACCT_NCHG_DATE > SYSDATE
    AND FTVACCT_EFF_DATE <= SYSDATE;
    
  CURSOR C2_CURSOR IS
    SELECT 'X'
      FROM FTVATYP
     WHERE FTVATYP_COAS_CODE = :FRBGRNT_COAS_CODE
       AND FTVATYP_ATYP_CODE = TEMP_ACCT_ATYP
       AND FTVATYP_INTERNAL_ATYP_CODE IN ('10', '20', '90', '95')
       AND FTVATYP_EFF_DATE <= SYSDATE
       AND FTVATYP_NCHG_DATE > SYSDATE;
       

BEGIN
 OPEN C1_CURSOR;
 FETCH C1_CURSOR INTO TEMP_ACCT_DATA_IND, TEMP_ACCT_ATYP;

 IF C1_CURSOR%NOTFOUND THEN
    MESSAGE( G$_NLS.Get('FRAGRNT-0201', 'FORM','Deferred Account is Invalid.') );
    RAISE FORM_TRIGGER_FAILURE;

 ELSE

    OPEN C2_CURSOR;
    FETCH C2_CURSOR INTO TEMP_C2;
    IF C2_CURSOR%NOTFOUND THEN
     MESSAGE( G$_NLS.Get('FRAGRNT-0202', 'FORM','Deferred Account code must be of ATYP 10(Assets) 20(Liabilities), 90(Fund additions), 95(Fund deductions).') );
     RAISE FORM_TRIGGER_FAILURE;

    ELSE

       IF TEMP_ACCT_DATA_IND <> 'Y' THEN
          MESSAGE( G$_NLS.Get('FRAGRNT-0203', 'FORM','Deferred Account must be Data Enterable.') );
          RAISE FORM_TRIGGER_FAILURE;
       END IF;

    END IF;
    CLOSE C2_CURSOR;
 END IF;
 CLOSE C1_CURSOR;
END;

--
DECLARE
     CURSOR get_name IS
        SELECT ftvacct_title
        FROM   ftvacct
        WHERE  ftvacct_acct_code = :frbgbil.FRBGBIL_DEFERRED_ACCT_CODE
          AND FTVACCT_COAS_CODE = :FRBGRNT_COAS_CODE  --defect 76318 begins
           AND FTVACCT_NCHG_DATE > SYSDATE
          AND FTVACCT_EFF_DATE <= SYSDATE;             --defect 76318 ends


BEGIN
	OPEN get_name ;
        FETCH get_name INTO :DEFFERED_ACCT_NAME;
	IF get_name%NOTFOUND THEN
		MESSAGE( G$_NLS.Get('FRAGRNT-0204', 'FORM','Deferred Account Code is invalid. Use LIST') , NO_ACKNOWLEDGE);
		RAISE FORM_TRIGGER_FAILURE;
	END IF;
        close get_name;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_DEFERRED_ACCT_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGBIL_DEFERRED_ACCT_CODE")
		public void frbgbilDeferredAcctCode_PostChange()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgbilElement==null || frbgrntElement==null)
					return;

				int rowCount = 0;
				if(frbgbilElement.getFrbgbilDeferredAcctCode().isNull())
		return;
				{
					NString tempAcctDataInd= NString.getNull();
					NString tempAcctAtyp= NString.getNull();
					NString tempC2= NString.getNull();
					String sqlc1Cursor = "SELECT FTVACCT_DATA_ENTRY_IND, FTVACCT_ATYP_CODE " +
	" FROM FTVACCT " +
	" WHERE FTVACCT_ACCT_CODE = :FRBGBIL_DEFERRED_ACCT_CODE AND FTVACCT_COAS_CODE = :FRBGRNT_COAS_CODE AND FTVACCT_NCHG_DATE > SYSDATE AND FTVACCT_EFF_DATE <= SYSDATE ";
					DataCursor c1Cursor = new DataCursor(sqlc1Cursor);
					String sqlc2Cursor = "SELECT 'X' " +
	" FROM FTVATYP " +
	" WHERE FTVATYP_COAS_CODE = :FRBGRNT_COAS_CODE AND FTVATYP_ATYP_CODE = :P_TEMP_ACCT_ATYP AND (FTVATYP_INTERNAL_ATYP_CODE) IN ('10', '20', '90', '95') AND FTVATYP_EFF_DATE <= SYSDATE AND FTVATYP_NCHG_DATE > SYSDATE ";
					DataCursor c2Cursor = new DataCursor(sqlc2Cursor);
					try {
						//Setting query parameters
						c1Cursor.addParameter("FRBGBIL_DEFERRED_ACCT_CODE", frbgbilElement.getFrbgbilDeferredAcctCode());
						c1Cursor.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
						c1Cursor.open();
						ResultSet c1CursorResults = c1Cursor.fetchInto();
						if ( c1CursorResults != null ) {
							tempAcctDataInd = c1CursorResults.getStr(0);
							tempAcctAtyp = c1CursorResults.getStr(1);
						}
						if ( c1Cursor.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAGRNT-0201"), toStr("FORM"), toStr("Deferred Account is Invalid.")));
							throw new ApplicationException();
						}
						else {
							//Setting query parameters
							c2Cursor.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
							c2Cursor.addParameter("P_TEMP_ACCT_ATYP", tempAcctAtyp);
							c2Cursor.open();
							ResultSet c2CursorResults = c2Cursor.fetchInto();
							if ( c2CursorResults != null ) {
								tempC2 = c2CursorResults.getStr(0);
							}
							if ( c2Cursor.notFound() )
							{
								errorMessage(GNls.Fget(toStr("FRAGRNT-0202"), toStr("FORM"), toStr("Deferred Account code must be of ATYP 10(Assets) 20(Liabilities), 90(Fund additions), 95(Fund deductions).")));
								throw new ApplicationException();
							}
							else {
								if ( tempAcctDataInd.notEquals("Y") )
								{
									errorMessage(GNls.Fget(toStr("FRAGRNT-0203"), toStr("FORM"), toStr("Deferred Account must be Data Enterable.")));
									throw new ApplicationException();
								}
							}
						}
					} finally { 
						c1Cursor.close();
						c2Cursor.close();
					}
				}
				{
					String sqlgetName = "SELECT ftvacct_title " +
	" FROM ftvacct " +
	" WHERE ftvacct_acct_code = :FRBGBIL_FRBGBIL_DEFERRED_ACCT_CODE AND FTVACCT_COAS_CODE = :FRBGRNT_COAS_CODE AND FTVACCT_NCHG_DATE > SYSDATE AND FTVACCT_EFF_DATE <= SYSDATE ";
					DataCursor getName = new DataCursor(sqlgetName);
					try {
						//Setting query parameters
						getName.addParameter("FRBGBIL_FRBGBIL_DEFERRED_ACCT_CODE", frbgbilElement.getFrbgbilDeferredAcctCode());
						getName.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
						getName.open();
						ResultSet getNameResults = getName.fetchInto();
						if ( getNameResults != null ) {
							frbgbilElement.setDefferedAcctName(getNameResults.getStr(0));
						}
						if ( getName.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAGRNT-0204"), toStr("FORM"), toStr("Deferred Account Code is invalid. Use LIST")), OutputMessageUserResponse.NO_ACKNOWLEDGE);
							throw new ApplicationException();
						}
					} finally {
						getName.close();
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DEFFERED_ACCT_NAME.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="DEFFERED_ACCT_NAME", function=KeyFunction.ITEM_CHANGE)
		public void defferedAcctName_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PMSC_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGBIL_PMSC_CODE")
		public void frbgbilPmscCode_validate()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
							this.frbgbilPmscCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void frbgbil_AfterQuery(RowAdapterEvent args)
		{
			FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)args.getRow();                    
            try
            {
                         frbgbilElement.setLockDbValues(true);
                          try {  
                         this.frbgbilPmscCode_PostChange(); 
                         } catch(Exception ex) { 
                         } 
                          try {  
                         this.frbgbilBeclCode_PostChange(); 
                         } catch(Exception ex) { 
                         } 
                          try {  
                         this.frbgbilPaymentFundCode_PostChange(); 
                         } catch(Exception ex) { 
                         } 
                          try {  
                         this.frbgbilPaymentAcctCode_PostChange(); 
                         } catch(Exception ex) { 
                         } 
                          try {  
                         this.frbgbilClearingAcctCode_PostChange(); 
                         } catch(Exception ex) { 
                         } 
                          try {  
                         this.frbgbilAddrType_PostChange(); 
                         } catch(Exception ex) { 
                         } 
                          try {  
                         this.frbgbilAddrSeqno_PostChange(); 
                         } catch(Exception ex) { 
                         } 
                          try {  
                         this.frbgbilBfrmCode1034Ext_PostChange(); 
                         } catch(Exception ex) { 
                         } 
                          try {  
                         this.frbgbilBillingStartDate_PostChange(); 
                         } catch(Exception ex) { 
                         } 
                          try {  
                         this.frbgbilBillingEndDate_PostChange(); 
                         } catch(Exception ex) { 
                         } 
                          try {  
                         this.frbgbilBillingMinAmt_PostChange(); 
                         } catch(Exception ex) { 
                         } 
                          try {  
                         this.frbgbilBillingMaxAmt_PostChange(); 
                         } catch(Exception ex) { 
                         } 
                          try {  
                         this.frbgbilDeferredAcctCode_PostChange(); 
                         } catch(Exception ex) { 
                         } 

            } finally { 
                   frbgbilElement.setLockDbValues(false);
            }
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BECL_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGBIL_BECL_CODE")
		public void frbgbilBeclCode_validate()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
							this.frbgbilBeclCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PAYMENT_FUND_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGBIL_PAYMENT_FUND_CODE")
		public void frbgbilPaymentFundCode_validate()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
							this.frbgbilPaymentFundCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_PAYMENT_ACCT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGBIL_PAYMENT_ACCT_CODE")
		public void frbgbilPaymentAcctCode_validate()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
							this.frbgbilPaymentAcctCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_CLEARING_ACCT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGBIL_CLEARING_ACCT_CODE")
		public void frbgbilClearingAcctCode_validate()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
							this.frbgbilClearingAcctCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_ADDR_TYPE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGBIL_ADDR_TYPE")
		public void frbgbilAddrType_validate()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
							this.frbgbilAddrType_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_ADDR_SEQNO.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGBIL_ADDR_SEQNO")
		public void frbgbilAddrSeqno_validate()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
							this.frbgbilAddrSeqno_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BFRM_CODE_1034_EXT.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGBIL_BFRM_CODE_1034_EXT")
		public void frbgbilBfrmCode1034Ext_validate()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
							this.frbgbilBfrmCode1034Ext_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BILLING_START_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGBIL_BILLING_START_DATE")
		public void frbgbilBillingStartDate_validate()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
							this.frbgbilBillingStartDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BILLING_END_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGBIL_BILLING_END_DATE")
		public void frbgbilBillingEndDate_validate()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
							this.frbgbilBillingEndDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BILLING_MIN_AMT.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGBIL_BILLING_MIN_AMT")
		public void frbgbilBillingMinAmt_validate()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
							this.frbgbilBillingMinAmt_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_BILLING_MAX_AMT.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGBIL_BILLING_MAX_AMT")
		public void frbgbilBillingMaxAmt_validate()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
							this.frbgbilBillingMaxAmt_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGBIL_DEFERRED_ACCT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGBIL_DEFERRED_ACCT_CODE")
		public void frbgbilDeferredAcctCode_validate()
		{
			
				FrbgbilAdapter frbgbilElement = (FrbgbilAdapter)this.getFormModel().getFrbgbil().getRowAdapter(true);
							this.frbgbilDeferredAcctCode_PostChange();

			}

		
	
	
}

