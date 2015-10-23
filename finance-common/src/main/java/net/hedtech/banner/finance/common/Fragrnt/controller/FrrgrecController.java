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
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FrrgrecController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	

	
	public FrrgrecController(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER FRRGREC.POST-QUERY
		 SELECT_ACCT_VAL_DESC;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void frrgrec_AfterQuery(RowAdapterEvent args)
		{
			
				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)args.getRow();
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				try
				{
					frrgrecElement.setLockDbValues(true);
                                                                 try {  
                        this.frrgrecEccgCode_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                                                                this.frrgrecGrntCode_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 

//[DELETE] 
//[DELETE] 

				} finally { 
					frrgrecElement.setLockDbValues(false);
				}
				this.getTask().getServices().selectAcctValDesc(frrgrecElement, frbgrntElement);
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC.ON-INSERT
		 BEGIN
    fb_grant_effcert.p_create(
                        p_acct_element           => :frrgrec_acct_element,
										    p_acct_element_value     => :frrgrec_acct_element_value,
										    p_coas_code              => :frrgrec_coas_code,
										    p_grnt_code              => :frrgrec_grnt_code,
										    p_eccg_code              => :frrgrec_eccg_code,
										    p_report_section         => :frrgrec_report_section,
										    p_charge_type            => :frrgrec_charge_type,
										    p_user_id                => :global.user_id,
										    p_data_origin            => :global.data_origin,
										    p_id_out                 => :frrgrec_id,
										    p_rowid_out              => :frrgrec.rowid);
--
  :frrgrec_activity_date := TO_DATE(G$_RESYNCH_RECORD(:frrgrec.rowid),'DDMONYYYYHH24MISS');
--
EXCEPTION
  WHEN OTHERS THEN
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC.ON-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowInsert
		public void frrgrec_RowInsert(RowAdapterEvent args)
		{
			
				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)args.getRow();


				try
				{
					Ref<NNumber> p_id_out_ref = new Ref<NNumber>(frrgrecElement.getFrrgrecId());
					Ref<NString> p_rowid_out_ref = new Ref<NString>(NString.getNull());
					FbGrantEffcert.pCreate(/*pCoasCode=>*/frrgrecElement.getFrrgrecCoasCode(),
							/*pGrntCode=>*/frrgrecElement.getFrrgrecGrntCode(),
							/*pAcctElement=>*/frrgrecElement.getFrrgrecAcctElement(),
							/*pAcctElementValue=>*/frrgrecElement.getFrrgrecAcctElementValue(),
							/*pReportSection=>*/frrgrecElement.getFrrgrecReportSection(),
							/*pChargeType=>*/frrgrecElement.getFrrgrecChargeType(),
							/*pUserId=>*/getGlobal("USER_ID"),
							/*pEccgCode=>*/frrgrecElement.getFrrgrecEccgCode(),
							/*pDataOrigin=>*/getGlobal("DATA_ORIGIN"),
							p_id_out_ref,
							p_rowid_out_ref);
					frrgrecElement.setFrrgrecId(p_id_out_ref.val);
					frrgrecElement.setROWID(p_rowid_out_ref.val.getValue().getBytes());
					frrgrecElement.setFrrgrecActivityDate(toDate(getTask().getGoqrpls().gResynchRecord(frrgrecElement.getROWID()), "DDMONYYYYHH24MISS"));
				}
				catch(Exception  e)
				{
					getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC.ON-DELETE
		 BEGIN
--
    fb_grant_effcert.p_delete(
    							   p_acct_element         =>	:frrgrec_acct_element,
    							   p_acct_element_value   =>	:frrgrec_acct_element_value,
    							   p_grnt_code            =>  :frrgrec_grnt_code, 
    							   p_coas_code            =>  :frrgrec_coas_code);
--
EXCEPTION
  WHEN OTHERS THEN
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC.ON-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowDelete
		public void frrgrec_RowDelete(RowAdapterEvent args)
		{
			
				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)args.getRow();


				try
				{
					// 
					FbGrantEffcert.pDelete(/*pCoasCode=>*/toStr(frrgrecElement.getFrrgrecCoasCode()),
							/*pGrntCode=>*/frrgrecElement.getFrrgrecGrntCode(),
							/*pAcctElement=>*/frrgrecElement.getFrrgrecAcctElement(),
							/*pAcctElementValue=>*/frrgrecElement.getFrrgrecAcctElementValue(),
							toStr(""));
				}
				catch(Exception  e)
				{
					getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC.ON-UPDATE
		 BEGIN
     fb_grant_effcert.p_update(
                        p_acct_element           => :frrgrec_acct_element,
										    p_acct_element_value     => :frrgrec_acct_element_value,
										    p_coas_code              => :frrgrec_coas_code,
										    p_grnt_code              => :frrgrec_grnt_code,
										    p_eccg_code              => :frrgrec_eccg_code,
										    p_report_section         => :frrgrec_report_section,
										    p_charge_type            => :frrgrec_charge_type,
										    p_user_id                => :global.user_id,
										    p_data_origin            => :global.data_origin,
										    p_rowid                  => :frrgrec.rowid);
--
  :frrgrec_activity_date := TO_DATE(G$_RESYNCH_RECORD(:frrgrec.rowid),'DDMONYYYYHH24MISS');
--
EXCEPTION
  WHEN OTHERS THEN
    G$_DISPLAY_ERR_MSG(SQLERRM);
    RAISE FORM_TRIGGER_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC.ON-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@RowUpdate
		public void frrgrec_RowUpdate(RowAdapterEvent args)
		{
			
				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)args.getRow();


				try
				{
					FbGrantEffcert.pUpdate(
							/*pCoasCode=>*/frrgrecElement.getFrrgrecCoasCode(),
							/*pGrntCode=>*/frrgrecElement.getFrrgrecGrntCode(),
							/*pAcctElement=>*/frrgrecElement.getFrrgrecAcctElement(),
							/*pAcctElementValue=>*/frrgrecElement.getFrrgrecAcctElementValue(),
							/*pReportSection=>*/frrgrecElement.getFrrgrecReportSection(),
							/*pChargeType=>*/frrgrecElement.getFrrgrecChargeType(),
							/*pUserId=>*/getGlobal("USER_ID"),
							/*pEccgCode=>*/frrgrecElement.getFrrgrecEccgCode(),
							/*pDataOrigin=>*/getGlobal("DATA_ORIGIN"),
							/*pRowid=>*/toStr(DbManager.getDataBaseFactory().rowidToString(frrgrecElement.getROWID())));
					frrgrecElement.setFrrgrecActivityDate(toDate(getTask().getGoqrpls().gResynchRecord(frrgrecElement.getROWID()), "DDMONYYYYHH24MISS"));
				}
				catch(Exception  e)
				{
					getTask().getGoqrpls().gDisplayErrMsg(errorMessage());
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC.WHEN-NEW-RECORD-INSTANCE
		 IF :HOLD_FRRGREC_FIELDS = 'Y' THEN
	 :HOLD_FRRGREC_FIELDS := 'N';
	 GO_RECORD(:HOLD_FRRGREC_CURRREC);
	 GO_ITEM(:HOLD_FRRGREC_CURITEM);
END IF;	 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@Before
		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void frrgrec_recordChange()
		{
			
				if ( getFormModel().getFormHeader().getHoldFrrgrecFields().equals("Y") )
				{
					getFormModel().getFormHeader().setHoldFrrgrecFields(toStr("N"));
					setCurrentRecord(getFormModel().getFormHeader().getHoldFrrgrecCurrrec());
					goItem(getFormModel().getFormHeader().getHoldFrrgrecCuritem());
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC.POST-RECORD
		 IF :FRRGREC_ACCT_ELEMENT IS NOT NULL AND 
	 (:FRRGREC_ACCT_ELEMENT_VALUE IS NULL OR :FRRGREC_REPORT_SECTION IS NULL 
	 OR (:FRRGREC_CHARGE_TYPE IS NULL AND :FRRGREC_REPORT_SECTION <> 'A' )) THEN
	 :HOLD_FRRGREC_FIELDS := 'Y';
	 :HOLD_FRRGREC_CURRREC := :SYSTEM.CURSOR_RECORD;
	 :HOLD_FRRGREC_CURITEM := :SYSTEM.CURSOR_ITEM;	 
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC.POST-RECORD
		 *
		 *
		 *</p>
		*/

		@Before
		@ActionTrigger(action="POST-RECORD")
		public void frrgrec_PostRecord()
		{
			

				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)this.getFormModel().getFrrgrec().getRowAdapter(true);

				if(frrgrecElement==null)
					return;

				if ( !frrgrecElement.getFrrgrecAcctElement().isNull() && (frrgrecElement.getFrrgrecAcctElementValue().isNull() || frrgrecElement.getFrrgrecReportSection().isNull() || (frrgrecElement.getFrrgrecChargeType().isNull() && frrgrecElement.getFrrgrecReportSection().notEquals("A"))) )
				{
					getFormModel().getFormHeader().setHoldFrrgrecFields(toStr("Y"));
					getFormModel().getFormHeader().setHoldFrrgrecCurrrec(getCursorRecord());
					getFormModel().getFormHeader().setHoldFrrgrecCuritem(toStr(getCursorItem()));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void frrgrec_BeforeQuery(QueryEvent args)
		{
			

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("DISPLAY_FRBGRNT_CODE", this.getFormModel().getKeyBlock().getDisplayFrbgrntCode()));             


           
               }

		
		/* Original PL/SQL code code for TRIGGER FRRGREC_ACCT_ELEMENT.WHEN-LIST-CHANGED
		 :FRRGREC_ACCT_ELEMENT_VALUE := NULL;
:FRRGREC_ACCT_ELEMENT_VALUE_DES := NULL;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_ACCT_ELEMENT.WHEN-LIST-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-LIST-CHANGED", item="FRRGREC_ACCT_ELEMENT")
		public void frrgrecAcctElement_listChange()
		{
			

				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)this.getFormModel().getFrrgrec().getRowAdapter(true);

				if(frrgrecElement==null)
					return;

				frrgrecElement.setFrrgrecAcctElementValue(toStr(null));
				frrgrecElement.setFrrgrecAcctElementValueDes(toStr(null));
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC_ACCT_ELEMENT_VALUE.WHEN-VALIDATE-ITEM
		 IF :FRRGREC_ACCT_ELEMENT_VALUE IS NOT NULL THEN
	  SELECT_ACCT_VAL_DESC;
ELSE
	 :FRRGREC_ACCT_ELEMENT_VALUE_DES := NULL;
END IF;	  
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_ACCT_ELEMENT_VALUE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRGREC_ACCT_ELEMENT_VALUE")
		public void frrgrecAcctElementValue_validate()
		{
			

				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)this.getFormModel().getFrrgrec().getRowAdapter(true);
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if(frrgrecElement==null ||frbgrntElement==null)
					return;

				if ( !frrgrecElement.getFrrgrecAcctElementValue().isNull() )
				{
					this.getTask().getServices().selectAcctValDesc(frrgrecElement, frbgrntElement);
				}
				else {
					frrgrecElement.setFrrgrecAcctElementValueDes(toStr(null));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC_ACCT_ELEMENT_VALUE.KEY-LISTVAL
		 IF :FRRGREC_ID IS NULL THEN 
	
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;

IF :FRRGREC_ACCT_ELEMENT = 'F' THEN
    G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FTVFUND', 'QUERY');
ELSIF
	 :FRRGREC_ACCT_ELEMENT = 'O' THEN
	 G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FTVORGN', 'QUERY');
ELSIF
	 :FRRGREC_ACCT_ELEMENT = 'P' THEN
	 G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FTVPROG', 'QUERY');
ELSIF
	:FRRGREC_ACCT_ELEMENT = 'L' THEN
	 G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FTVLOCN', 'QUERY');
ELSIF
   :FRRGREC_ACCT_ELEMENT = 'A' THEN
	 G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FTVACTV', 'QUERY');	 
END IF;	 

:GLOBAL.FORM_WAS_CALLED := 'N';
G$_RESET_GLOBAL;
G$_CHECK_FAILURE;
IF :GLOBAL.VALUE IS NOT NULL THEN
		EXECUTE_TRIGGER('LIST_VALUES_COPY'); 
    :GLOBAL.VALUE := '';
    DO_KEY('NEXT_ITEM');
END IF;

END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_ACCT_ELEMENT_VALUE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRRGREC_ACCT_ELEMENT_VALUE", function=KeyFunction.LIST_VALUES)
		public void frrgrecAcctElementValue_ListValues()
		{
				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)this.getFormModel().getFrrgrec().getRowAdapter(true);

if (frrgrecElement != null) {
	

				if ( frrgrecElement.getFrrgrecId().isNull() )
				{
					executeAction("G$_REVOKE_ACCESS");
					getTask().getGoqrpls().gCheckFailure();
					if ( frrgrecElement.getFrrgrecAcctElement().equals("F") )
					{
						getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FTVFUND"), toStr("QUERY"));
					}
					else if ( frrgrecElement.getFrrgrecAcctElement().equals("O") ) {
						getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FTVORGN"), toStr("QUERY"));
					}
					else if ( frrgrecElement.getFrrgrecAcctElement().equals("P") ) {
						getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FTVPROG"), toStr("QUERY"));
					}
					else if ( frrgrecElement.getFrrgrecAcctElement().equals("L") ) {
						getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FTVLOCN"), toStr("QUERY"));
					}
					else if ( frrgrecElement.getFrrgrecAcctElement().equals("A") ) {
						getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FTVACTV"), toStr("QUERY"));
					}
					setGlobal("FORM_WAS_CALLED", toStr("N"));
					getTask().getGoqrpls().gResetGlobal();
					getTask().getGoqrpls().gCheckFailure();
					if ( !getGlobal("VALUE").isNull() )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
				}
}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC_ACCT_ELEMENT_VALUE.KEY-CQUERY
		 IF :FRRGREC_ID IS NULL THEN 
	
IF :FRRGREC_ACCT_ELEMENT = 'F' THEN
     G$_DISPLAY_LOV('','HRECFUND_LOV');
     G$_CHECK_FAILURE;
ELSIF :FRRGREC_ACCT_ELEMENT = 'O' THEN
	   G$_DISPLAY_LOV('','HRECORGN_LOV');
	   G$_CHECK_FAILURE;
ELSIF
	 :FRRGREC_ACCT_ELEMENT = 'P' THEN
	  G$_DISPLAY_LOV('','HRECPROG_LOV');
	  G$_CHECK_FAILURE ;
ELSIF
	:FRRGREC_ACCT_ELEMENT = 'L' THEN
	 G$_DISPLAY_LOV('','HRECLOCN_LOV');
	 G$_CHECK_FAILURE ;
ELSIF
   :FRRGREC_ACCT_ELEMENT = 'A' THEN
	  G$_DISPLAY_LOV('','HRECACTV_LOV');
	  G$_CHECK_FAILURE ;
END IF;	 

IF :GLOBAL.VALUE IS NOT NULL THEN
		EXECUTE_TRIGGER('LIST_VALUES_COPY'); 
    :GLOBAL.VALUE := '';
    DO_KEY('NEXT_ITEM');
END IF;

END IF;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_ACCT_ELEMENT_VALUE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="FRRGREC_ACCT_ELEMENT_VALUE", function=KeyFunction.COUNT_QUERY)
		public void frrgrecAcctElementValue_TotalResults()
		{

				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)this.getFormModel().getFrrgrec().getRowAdapter(true);

if (frrgrecElement != null) {
	

				if ( frrgrecElement.getFrrgrecId().isNull() )
				{
					if ( frrgrecElement.getFrrgrecAcctElement().equals("F") )
					{
						getTask().getGoqrpls().gDisplayLov(toStr(""), toStr("HRECFUND_LOV"));
						getTask().getGoqrpls().gCheckFailure();
					}
					else if ( frrgrecElement.getFrrgrecAcctElement().equals("O") ) {
						getTask().getGoqrpls().gDisplayLov(toStr(""), toStr("HRECORGN_LOV"));
						getTask().getGoqrpls().gCheckFailure();
					}
					else if ( frrgrecElement.getFrrgrecAcctElement().equals("P") ) {
						getTask().getGoqrpls().gDisplayLov(toStr(""), toStr("HRECPROG_LOV"));
						getTask().getGoqrpls().gCheckFailure();
					}
					else if ( frrgrecElement.getFrrgrecAcctElement().equals("L") ) {
						getTask().getGoqrpls().gDisplayLov(toStr(""), toStr("HRECLOCN_LOV"));
						getTask().getGoqrpls().gCheckFailure();
					}
					else if ( frrgrecElement.getFrrgrecAcctElement().equals("A") ) {
						getTask().getGoqrpls().gDisplayLov(toStr(""), toStr("HRECACTV_LOV"));
						getTask().getGoqrpls().gCheckFailure();
					}
					if ( !getGlobal("VALUE").isNull() )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
				}
}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_ECCG_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRRGREC_ECCG_CODE")
		public void frrgrecEccgCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC_ECCG_CODE.WHEN-NEW-ITEM-INSTANCE
		 BEGIN
  G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
  G$_CHECK_FAILURE;
END;
IF :FRRGREC_ACCT_ELEMENT_VALUE IS NULL AND :FRRGREC_ACCT_ELEMENT IS NOT NULL THEN 
	 GO_ITEM('FRRGREC_ACCT_ELEMENT_VALUE');
END IF;	 

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_ECCG_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRRGREC_ECCG_CODE", function=KeyFunction.ITEM_CHANGE)
		public void frrgrecEccgCode_itemChange()
		{
			

				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)this.getFormModel().getFrrgrec().getRowAdapter(true);

				if(frrgrecElement==null)
					return;


				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				if ( frrgrecElement.getFrrgrecAcctElementValue().isNull() && !frrgrecElement.getFrrgrecAcctElement().isNull() )
				{
					goItem(toStr("FRRGREC_ACCT_ELEMENT_VALUE"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC_ECCG_CODE.G$_SEARCH_PARAMETERS
		 BEGIN
  G$_SEARCH.PARAMETERS('NTVECCG_CODE','NTVECCG_DESC','');
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_ECCG_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRRGREC_ECCG_CODE")
		public void frrgrecEccgCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("NTVECCG_CODE"), toStr("NTVECCG_DESC"), toStr(""));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_ECCG_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRRGREC_ECCG_CODE")
		public void frrgrecEccgCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_ECCG_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRRGREC_ECCG_CODE", function=KeyFunction.NEXT_ITEM)
		public void frrgrecEccgCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_ECCG_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRRGREC_ECCG_CODE", function=KeyFunction.ITEM_OUT)
		public void frrgrecEccgCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC_ECCG_CODE.POST-CHANGE
		 DECLARE
 	lv_sql_stmt		VARCHAR2(500);
 	val_result		VARCHAR2(100);
BEGIN
--
IF :FRRGREC_ECCG_CODE IS NOT NULL THEN
   IF  NAME_IN('GLOBAL.HRESYS')='Y' THEN
		 lv_sql_stmt := 'SELECT NTVECCG_CODE FROM NTVECCG WHERE NTVECCG_CODE = '||''''||:FRRGREC_ECCG_CODE||'''';
	--
		 GOKDBMS.DYNAMIC_SQL(LV_SQL_STMT,VAL_RESULT);
	--
			IF VAL_RESULT IS NULL THEN
				  message(G$_NLS.Get('FRAGRNT-0226', 'FORM','*ERROR* Invalid Effort Category Type Code entered; Press LIST for valid codes.'));
		  	  RAISE FORM_TRIGGER_FAILURE;
			 END IF;
	ELSE
		  MESSAGE(G$_NLS.Get('FRAGRNT-0227', 'FORM','Function is valid only when BANNER Position Control is installed.'));
	END IF;	  		
END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_ECCG_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRRGREC_ECCG_CODE")
		public void frrgrecEccgCode_PostChange()
		{
			

				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)this.getFormModel().getFrrgrec().getRowAdapter(true);

				if(frrgrecElement==null)
					return;


				if(frrgrecElement.getFrrgrecEccgCode().isNull())
		return;
				{
					NString lvSqlStmt= NString.getNull();
					NString valResult= NString.getNull();
					// 
					if ( !frrgrecElement.getFrrgrecEccgCode().isNull() )
					{
						if ( getNameIn("GLOBAL.HRESYS").equals("Y") )
						{
							lvSqlStmt = toStr("SELECT NTVECCG_CODE FROM NTVECCG WHERE NTVECCG_CODE = ").append("'").append(frrgrecElement.getFrrgrecEccgCode()).append("'");
							// 
							Ref<NString> p_return_value1_ref = new Ref<NString>(valResult);
							Gokdbms.dynamicSql(lvSqlStmt, p_return_value1_ref);
							valResult = p_return_value1_ref.val;
							// 
							if ( valResult.isNull() )
							{
								errorMessage(GNls.Fget(toStr("FRAGRNT-0226"), toStr("FORM"), toStr("*ERROR* Invalid Effort Category Type Code entered; Press LIST for valid codes.")));
								throw new ApplicationException();
							}
						}
						else {
//							message(GNls.Fget(toStr("FRAGRNT-0227"), toStr("FORM"), toStr("Function is valid only when BANNER Position Control is installed.")));
							warningMessage(GNls.Fget(toStr("FRAGRNT-0227"), toStr("FORM"), toStr("Function is valid only when BANNER Position Control is installed.")));
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC_ECCG_CODE.KEY-LISTVAL
		 IF :FRRGREC_REPORT_SECTION = 'A' THEN
	 MESSAGE(G$_NLS.Get('FRAGRNT-0228', 'FORM','Function is valid only when Report Section is not Allocable.'));
	 RAISE FORM_TRIGGER_FAILURE;
ELSIF NAME_IN('GLOBAL.HRESYS')='Y' THEN
   POPULATE_NTVECCG_RG;
   G$_DISPLAY_LOV ('','NTVECCG_LOV');
   G$_CHECK_FAILURE ;
 ELSE
    MESSAGE(G$_NLS.Get('FRAGRNT-0229', 'FORM','Function is valid only when BANNER Position Control is installed.'));
END IF;    
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_ECCG_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRRGREC_ECCG_CODE", function=KeyFunction.LIST_VALUES)
		public void frrgrecEccgCode_ListValues()
		{

				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)this.getFormModel().getFrrgrec().getRowAdapter(true);

if (frrgrecElement != null) {
	

				if ( frrgrecElement.getFrrgrecReportSection().equals("A") )
				{
					warningMessage(GNls.Fget(toStr("FRAGRNT-0228"), toStr("FORM"), toStr("Function is valid only when Report Section is not Allocable.")));
					throw new ApplicationException();
				}
				else if ( getNameIn("GLOBAL.HRESYS").equals("Y") ) {
					this.getTask().getServices().populateNtveccgRg();
					getTask().getGoqrpls().gDisplayLov(toStr(""), toStr("NTVECCG_LOV"));
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
//					message(GNls.Fget(toStr("FRAGRNT-0229"), toStr("FORM"), toStr("Function is valid only when BANNER Position Control is installed.")));
					warningMessage(GNls.Fget(toStr("FRAGRNT-0229"), toStr("FORM"), toStr("Function is valid only when BANNER Position Control is installed.")));
				}
}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC_REPORT_SECTION.WHEN-LIST-CHANGED
		 IF :FRRGREC_REPORT_SECTION = 'A' Then
	 :FRRGREC_ECCG_CODE := NULL;
	 :FRRGREC_CHARGE_TYPE := NULL;
	 SET_ALLOC_PROPERTIES('A','N');	

ELSE
	 SET_ALLOC_PROPERTIES('N','N');	
END IF;	 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_REPORT_SECTION.WHEN-LIST-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-LIST-CHANGED", item="FRRGREC_REPORT_SECTION")
		public void frrgrecReportSection_listChange()
		{
			

				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)this.getFormModel().getFrrgrec().getRowAdapter(true);

				if(frrgrecElement==null)
					return;


				if ( frrgrecElement.getFrrgrecReportSection().equals("A") )
				{
					frrgrecElement.setFrrgrecEccgCode(toStr(null));
					frrgrecElement.setFrrgrecChargeType(toStr(null));
					this.getTask().getServices().setAllocProperties(toStr("A"), toStr("N"));
				}
				else {
					this.getTask().getServices().setAllocProperties(toStr("N"), toStr("N"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC_GRNT_CODE.WHEN-MOUSE-DOUBLECLICK
		 BEGIN
  G$_SEARCH.WHEN_MOUSE_CLICK;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_GRNT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRRGREC_GRNT_CODE")
		public void frrgrecGrntCode_WhenMouseDoubleclick()
		{
			
				getTask().getGoqrpls().getGSearch().whenMouseClick();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC_GRNT_CODE.WHEN-NEW-ITEM-INSTANCE
		 BEGIN
  G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_GRNT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRRGREC_GRNT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void frrgrecGrntCode_itemChange()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC_GRNT_CODE.G$_SEARCH_OPTIONS
		 BEGIN
  DO_KEY('LIST_VALUES');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_GRNT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRRGREC_GRNT_CODE")
		public void frrgrecGrntCode_GSearchOptions()
		{
			
				executeAction("LIST_VALUES");
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC_GRNT_CODE.KEY-NEXT-ITEM
		 BEGIN
  G$_SEARCH.CODE_KEY_NEXT_ITEM;
  G$_CHECK_FAILURE;
  NEXT_ITEM;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_GRNT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRRGREC_GRNT_CODE", function=KeyFunction.NEXT_ITEM)
		public void frrgrecGrntCode_keyNexItem()
		{
			
				getTask().getGoqrpls().getGSearch().codeKeyNextItem();
				getTask().getGoqrpls().gCheckFailure();
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC_GRNT_CODE.POST-TEXT-ITEM
		 BEGIN
  G$_SEARCH.POST_TEXT_CODE;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_GRNT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRRGREC_GRNT_CODE", function=KeyFunction.ITEM_OUT)
		public void frrgrecGrntCode_itemOut()
		{
			
				getTask().getGoqrpls().getGSearch().postTextCode();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC_GRNT_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVCOAS_COAS_CODE', 'FTVCOAS_TITLE',
   G$_SEARCH_WHERE.F_FTVCOAS_ENTRY('SYSDATE'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_GRNT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRRGREC_GRNT_CODE")
		public void frrgrecGrntCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVCOAS_COAS_CODE"), toStr("FTVCOAS_TITLE"), getTask().getGoqrpls().getGSearchWhere().fFtvcoasEntry(toStr("SYSDATE")));
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC_GRNT_CODE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
     EXECUTE_TRIGGER( 'EDIT_COAS_CODE' ) ;
     G$_CHECK_FAILURE; 
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
		 * FRRGREC_GRNT_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRRGREC_GRNT_CODE")
		public void frrgrecGrntCode_PostChange()
		{

				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)this.getFormModel().getFrrgrec().getRowAdapter(true);

if (frrgrecElement != null) {
				if(frrgrecElement.getFrrgrecGrntCode().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					executeAction("EDIT_COAS_CODE");
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

		
		/* Original PL/SQL code code for TRIGGER FRRGREC_GRNT_CODE.POST_TEXT_ITEMXXX
		 IF :frbgrnt_COAS_CODE IS NULL THEN
   MESSAGE( G$_NLS.Get('FRAGRNT-0230', 'FORM','Chart of Accounts Code must be entered.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_GRNT_CODE.POST_TEXT_ITEMXXX
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST_TEXT_ITEMXXX", item="FRRGREC_GRNT_CODE")
		public void frrgrecGrntCode_PostTextItemxxx()
		{
			

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if(frbgrntElement==null)
					return;


				if ( frbgrntElement.getFrbgrntCoasCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0230"), toStr("FORM"), toStr("Chart of Accounts Code must be entered.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRRGREC_GRNT_CODE.KEY-PREV-ITEM
		 
go_item('frbgrnt_sponsor_id');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_GRNT_CODE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="FRRGREC_GRNT_CODE", function=KeyFunction.PREVIOUS_ITEM)
		public void frrgrecGrntCode_PreviousItem()
		{
			
				goItem(toStr("frbgrnt_sponsor_id"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_ECCG_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRGREC_ECCG_CODE")
		public void frrgrecEccgCode_validate()
		{
			
				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)this.getFormModel().getFrrgrec().getRowAdapter(true);
							this.frrgrecEccgCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRRGREC_GRNT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRRGREC_GRNT_CODE")
		public void frrgrecGrntCode_validate()
		{
			
				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)this.getFormModel().getFrrgrec().getRowAdapter(true);
							this.frrgrecGrntCode_PostChange();

			}
		
		@ActionTrigger(action="WHEN-BUTTON-PRESSED", item="FRRGREC_ACCT_ELEMENT_VALUE")
		public void frrgrecAcctElementValue_buttonClick()
		{

				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)this.getFormModel().getFrrgrec().getRowAdapter(true);

				if (frrgrecElement != null) {
	

				getFormModel().getFormHeader().setCheckKeys(toStr("N"));
				{
					NString lv1= NString.getNull();
					NString lv2= NString.getNull();
					if ( frrgrecElement.getFrrgrecAcctElement().equals("O") )
					{
						lv1 = GNls.Fget(toStr("FRAGRNT-0238"), toStr("FORM"), toStr("Organization Validation (FTVORGN)"));
						lv2 = GNls.Fget(toStr("FRAGRNT-0239"), toStr("FORM"), toStr("View Organization Codes"));
					}
					else if ( frrgrecElement.getFrrgrecAcctElement().equals("F") ) {
						lv1 = GNls.Fget(toStr("FRAGRNT-0240"), toStr("FORM"), toStr("Fund Code Validation (FTVFUND)"));
						lv2 = GNls.Fget(toStr("FRAGRNT-0241"), toStr("FORM"), toStr("View Fund Codes"));
					}
					else if ( frrgrecElement.getFrrgrecAcctElement().equals("P") ) {
						lv1 = GNls.Fget(toStr("FRAGRNT-0242"), toStr("FORM"), toStr("Program Code Validation (FTVPROG)"));
						lv2 = GNls.Fget(toStr("FRAGRNT-0243"), toStr("FORM"), toStr("View Program Codes"));
					}
					else if ( frrgrecElement.getFrrgrecAcctElement().equals("L") ) {
						lv1 = GNls.Fget(toStr("FRAGRNT-0244"), toStr("FORM"), toStr("Location Code Validation (FTVLOCN)"));
						lv2 = GNls.Fget(toStr("FRAGRNT-0245"), toStr("FORM"), toStr("View Location Codes"));
					}
					else if ( frrgrecElement.getFrrgrecAcctElement().equals("A") ) {
						lv1 = GNls.Fget(toStr("FRAGRNT-0246"), toStr("FORM"), toStr("Activity Code Validation (FTVACTV)"));
						lv2 = GNls.Fget(toStr("FRAGRNT-0247"), toStr("FORM"), toStr("View Activity Codes"));
					}
					getTask().getGoqrpls().gKeyOptMenu(toStr("FRRGREC.FRRGREC_ACCT_ELEMENT_VALUE"), GNls.formatmsg(toStr("x"), toStr("FORM"), lv1, toStr(""), toStr(""), toStr(""), NString.getNull(), NString.getNull(),toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""),toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr("")), toStr("LIST_VALUES"), GNls.formatmsg(toStr("x"), toStr("FORM"), lv2, toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr(""), toStr("")), toStr("COUNT_QUERY"), toStr(""), toStr(""), toStr(""), toStr(""));
					getTask().getGoqrpls().gCheckFailure();
				}
			}
		}

		
	
	
}

