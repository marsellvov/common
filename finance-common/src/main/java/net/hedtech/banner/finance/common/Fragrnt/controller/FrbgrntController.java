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
import net.hedtech.general.common.libraries.Goqolib.services.GNameClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIdClass;	
		
import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FrbgrntController extends DefaultBlockController {

	private GNameClass getGNameClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNameClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NAME_CLASS");
	}	
	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	
	private GIdClass getGIdClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIdClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ID_CLASS");
	}	

	
	public FrbgrntController(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER FRBGRNT.KEY-CQUERY
		 execute_trigger('call_form_frigrst');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void frbgrnt_TotalResults()
		{
			
				executeAction("call_form_frigrst");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.POST-QUERY
		 DECLARE 
  errnum NUMBER       := ERROR_CODE; 
  CURSOR ftvsdat_title_cur (p_ftvsdat_entity VARCHAR2,p_ftvsdat_attr VARCHAR2,p_ftvsdat_opt_1 VARCHAR2) IS
  SELECT ftvsdat_title 
    FROM ftvsdat
   WHERE ftvsdat_sdat_code_entity = p_ftvsdat_entity
     AND ftvsdat_sdat_code_attr = p_ftvsdat_attr
     AND ftvsdat_sdat_code_opt_1 = p_ftvsdat_opt_1; 
BEGIN 
  IF errnum = 40350 THEN 
    Message(F_GET_ERROR('USER_NOT_AUTH'));  
    RAISE Form_Trigger_Failure; 
  END IF; 

END;
-- 1-1A1JGI
DECLARE
 CURSOR ftvsdat_title_cur (p_ftvsdat_attr VARCHAR2,p_ftvsdat_opt_1 VARCHAR2) IS
 SELECT ftvsdat_title
   FROM ftvsdat
  WHERE	ftvsdat_sdat_code_entity = 'FRBGRNT'
    AND ftvsdat_sdat_code_attr = p_ftvsdat_attr
    AND ftvsdat_sdat_code_opt_1 = p_ftvsdat_opt_1
    AND ftvsdat_eff_date <= sysdate
    AND (ftvsdat_nchg_date is null
     OR ftvsdat_nchg_date > sysdate)
    AND ftvsdat_status_ind = 'A';	 
BEGIN
	OPEN ftvsdat_title_cur('GRANT_TYPE',:frbgrnt_grant_type);
	FETCH ftvsdat_title_cur INTO :frbgrnt_grant_desc;
	CLOSE ftvsdat_title_cur;
	OPEN ftvsdat_title_cur('CATEGORY',:frbgrnt_category);
	FETCH ftvsdat_title_cur INTO :frbgrnt_category_desc;
	CLOSE ftvsdat_title_cur;	
	OPEN ftvsdat_title_cur('SUB_CATEGORY',:frbgrnt_sub_category);
	FETCH ftvsdat_title_cur INTO :frbgrnt_sub_cat_desc;
	CLOSE ftvsdat_title_cur;	
END;
--after execute_query on frbgrnt
  :POST_QUERY_IND := 'Y';
--
  EXECUTE_TRIGGER('CHECK_TEXT');
  G$_CHECK_FAILURE;
--
  EXECUTE_TRIGGER('GET_AGENCY_CODE');
  G$_CHECK_FAILURE;
--
  EXECUTE_TRIGGER('GET_PI_ID_CODE');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('GET_AGCY_CODE_PRED_PIDM');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('GET_CFDA_CODE');
  G$_CHECK_FAILURE; 
  WHAT_IS_HOLD;
--
   :HOLD_STATUS_CODE := :frbgrnt_STATUS_CODE;
   :HOLD_PI_ID_CODE  := :frbgrnt_PI_ID_CODE;
   :HOLD_STATUS_DATE := :frbgrnt_status_date;
 	 :form_header.hold_alt_status_desc := :frbgrnt.frbgrnt_alternate_status_desc;
   
   IF :frbgrnt_status_code IS NOT NULL THEN
   		execute_trigger('get_status_desc');
	 		g$_check_failure;
	 		:frbgrnt.status_descr := '';
   		:frbgrnt.status_descr := :form_header.store_org_status_desc ||' '||
														 	 :frbgrnt.frbgrnt_alternate_status_desc;
	 END IF;														 	 
	
											
-- for rollback
    SET_RECORD_PROPERTY(1,'frbgrnt',STATUS,QUERY_STATUS);
--
	EXECUTE_TRIGGER('CHECK_UNCHECK_PT');
  G$_CHECK_FAILURE; 
    
  :POST_QUERY_IND := 'N';
 
--blitz
IF :FRBGRNT_AGENCY_PHONE_TYPE IS NOT NULL 
  and :FRBGRNT_AGENCY_TELE_SEQNO IS NOT NULL THEN  
  DECLARE
    CURSOR PHONE_CURSOR IS
       SELECT sprtele_ctry_code_phone, 
              sprtele_phone_area, 
              sprtele_phone_number,
              sprtele_phone_ext
       FROM   SPRTELE
       WHERE  SPRTELE_PIDM      = :frbgrnt_AGENCY_PIDM
         AND  SPRTELE_TELE_CODE = :FRBGRNT_AGENCY_PHONE_TYPE
         AND  SPRTELE_SEQNO     = :FRBGRNT_AGENCY_TELE_SEQNO ;
  BEGIN
     OPEN PHONE_CURSOR ;
     FETCH PHONE_CURSOR INTO   
       :ctry_code_phone,
       :area_code, 
       :phone_number, 
       :extension ;
     CLOSE PHONE_CURSOR;
  END ;
END IF ; 
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
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)args.getRow();
				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)this.getFormModel().getFrrgrec().getRowAdapter(true);


				int rowCount = 0;
				
							try
							{
								frbgrntElement.setLockDbValues(true);
                                                                 try {  
                                                                this.frbgrntCoasCode_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntOrgnCodeRespOffice_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntLongTitle_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntAgencyCode_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntPiIdCode_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntProjectStartDate_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntProjectEndDate_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntTermDate_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntExpendEndDate_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntStatusCode_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntStatusDate_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntGrntCodeRelated_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntAgencyAddrCode_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntAgencyAddrSeqNum_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntCoasCodeIcCs_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntBasiCodeIc_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntIndrCodeRate_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntIndaCodeCharge_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntInddCodeDistr_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntBasiCodeCs_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntCstrCodeRate_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntCstaCodeCharge_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 
                                                                 try {  
                                                                this.frbgrntCstdCodeDistr_PostChange(); 
                                                                } catch(Exception ex) { 
                                                                } 

//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 
								
				
							} 
							finally { 
								frbgrntElement.setLockDbValues(false);
							}
				
				
				{
					NNumber errnum = errorCode();
					String sqlftvsdatTitleCur = " SELECT ftvsdat_title "
												+ "FROM ftvsdat "
												+ "WHERE ftvsdat_sdat_code_entity = :P_P_FTVSDAT_ENTITY "
												+ "AND ftvsdat_sdat_code_attr = :P_P_FTVSDAT_ATTR "
												+ "AND ftvsdat_sdat_code_opt_1 = :P_P_FTVSDAT_OPT_1 ";
					
					DataCursor ftvsdatTitleCur = new DataCursor(sqlftvsdatTitleCur);
					
					NString pFtvsdatEntity = NString.getNull();
					if ( errnum.equals(40350) )
					{
						errorMessage(this.getTask().getServices().fGetError(toStr("USER_NOT_AUTH")));
						throw new ApplicationException();
					}
				}
				{
					String sqlftvsdatTitleCur = " SELECT ftvsdat_title " +
												" FROM ftvsdat " +
												" WHERE ftvsdat_sdat_code_entity = 'FRBGRNT' " +
												" AND ftvsdat_sdat_code_attr = :P_P_FTVSDAT_ATTR " +
												" AND ftvsdat_sdat_code_opt_1 = :P_P_FTVSDAT_OPT_1 " +
												" AND ftvsdat_eff_date <= sysdate " +
												" AND (ftvsdat_nchg_date IS NULL OR ftvsdat_nchg_date > sysdate) " + 
												" AND ftvsdat_status_ind = 'A' ";
					DataCursor ftvsdatTitleCur = new DataCursor(sqlftvsdatTitleCur);
					try {
						NString pFtvsdatAttr = NString.getNull();
						NString pFtvsdatOpt1 = NString.getNull();
						pFtvsdatAttr=toStr("GRANT_TYPE");
						pFtvsdatOpt1=frbgrntElement.getFrbgrntGrantType();
						
						//Setting query parameters
						ftvsdatTitleCur.addParameter("P_P_FTVSDAT_ATTR", pFtvsdatAttr);
						ftvsdatTitleCur.addParameter("P_P_FTVSDAT_OPT_1", pFtvsdatOpt1);
						
						ftvsdatTitleCur.open();
						ResultSet ftvsdatTitleCurResults = ftvsdatTitleCur.fetchInto();
						if ( ftvsdatTitleCurResults != null ) {
							frbgrntElement.setFrbgrntGrantDesc(ftvsdatTitleCurResults.getStr(0));
						}
						ftvsdatTitleCur.close();
						pFtvsdatAttr=toStr("CATEGORY");
						pFtvsdatOpt1=frbgrntElement.getFrbgrntCategory();
						
						//Setting query parameters
						ftvsdatTitleCur.addParameter("P_P_FTVSDAT_ATTR", pFtvsdatAttr);
						ftvsdatTitleCur.addParameter("P_P_FTVSDAT_OPT_1", pFtvsdatOpt1);
						
						ftvsdatTitleCur.open();
						
	//					ResultSet ftvsdatTitleCurResults = ftvsdatTitleCur.fetchInto();
						ftvsdatTitleCurResults = ftvsdatTitleCur.fetchInto();
						if ( ftvsdatTitleCurResults != null ) {
							frbgrntElement.setFrbgrntCategoryDesc(ftvsdatTitleCurResults.getStr(0));
						}
						ftvsdatTitleCur.close();
						pFtvsdatAttr=toStr("SUB_CATEGORY");
						pFtvsdatOpt1=frbgrntElement.getFrbgrntSubCategory();
						
						//Setting query parameters
						ftvsdatTitleCur.addParameter("P_P_FTVSDAT_ATTR", pFtvsdatAttr);
						ftvsdatTitleCur.addParameter("P_P_FTVSDAT_OPT_1", pFtvsdatOpt1);
						
						ftvsdatTitleCur.open();
	//					ResultSet ftvsdatTitleCurResults = ftvsdatTitleCur.fetchInto();
						ftvsdatTitleCurResults = ftvsdatTitleCur.fetchInto();
						if ( ftvsdatTitleCurResults != null ) {
							frbgrntElement.setFrbgrntSubCatDesc(ftvsdatTitleCurResults.getStr(0));
						}
					} finally {
						ftvsdatTitleCur.close();
					}
				}
				// after execute_query on frbgrnt
				getFormModel().getFormHeader().setPostQueryInd(toStr("Y"));
				// 
				executeAction("CHECK_TEXT");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("GET_AGENCY_CODE");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("GET_PI_ID_CODE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GET_AGCY_CODE_PRED_PIDM");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("GET_CFDA_CODE");
				getTask().getGoqrpls().gCheckFailure();
				this.getTask().getServices().whatIsHold(frbgrntElement);
				// 
				getFormModel().getFormHeader().setHoldStatusCode(frbgrntElement.getFrbgrntStatusCode());
				getFormModel().getFormHeader().setHoldPiIdCode(frbgrntElement.getFrbgrntPiIdCode());
				getFormModel().getFormHeader().setHoldStatusDate(frbgrntElement.getFrbgrntStatusDate());
				getFormModel().getFormHeader().setHoldAltStatusDesc(frbgrntElement.getFrbgrntAlternateStatusDesc());
				if ( !frbgrntElement.getFrbgrntStatusCode().isNull() )
				{
					executeAction("get_status_desc");
					getTask().getGoqrpls().gCheckFailure();
					frbgrntElement.setStatusDescr(toStr(""));
					frbgrntElement.setStatusDescr(getFormModel().getFormHeader().getStoreOrgStatusDesc().append(" ").append(frbgrntElement.getFrbgrntAlternateStatusDesc()));
				}
				frbgrntElement.getRow().setStatus(DataRowStatus.UNCHANGED);
				
				
				
				// 
				executeAction("CHECK_UNCHECK_PT");
				getTask().getGoqrpls().gCheckFailure();
				getFormModel().getFormHeader().setPostQueryInd(toStr("N"));
				// blitz
				if ( !frbgrntElement.getFrbgrntAgencyPhoneType().isNull() && !frbgrntElement.getFrbgrntAgencyTeleSeqno().isNull() )
				{
					{
						String sqlphoneCursor = " SELECT sprtele_ctry_code_phone, sprtele_phone_area, sprtele_phone_number, sprtele_phone_ext " +
												" FROM SPRTELE " +
												" WHERE SPRTELE_PIDM = :FRBGRNT_AGENCY_PIDM "
												+ "AND SPRTELE_TELE_CODE = :FRBGRNT_AGENCY_PHONE_TYPE "
												+ "AND SPRTELE_SEQNO = :FRBGRNT_AGENCY_TELE_SEQNO ";
						
						DataCursor phoneCursor = new DataCursor(sqlphoneCursor);
						try {
							//Setting query parameters
							phoneCursor.addParameter("FRBGRNT_AGENCY_PIDM", frbgrntElement.getFrbgrntAgencyPidm());
							phoneCursor.addParameter("FRBGRNT_AGENCY_PHONE_TYPE", frbgrntElement.getFrbgrntAgencyPhoneType());
							phoneCursor.addParameter("FRBGRNT_AGENCY_TELE_SEQNO", frbgrntElement.getFrbgrntAgencyTeleSeqno());
							phoneCursor.open();
							ResultSet phoneCursorResults = phoneCursor.fetchInto();
							if ( phoneCursorResults != null ) {
								frbgrntElement.setCtryCodePhone(phoneCursorResults.getStr(0));
								frbgrntElement.setAreaCode(phoneCursorResults.getStr(1));
								frbgrntElement.setPhoneNumber(phoneCursorResults.getStr(2));
								frbgrntElement.setExtension(phoneCursorResults.getStr(3));
							}
						} finally {
							phoneCursor.close();
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.PRE-UPDATE
		   BEGIN
   IF G$_NCHK(:commit_ind <> 'Y') THEN
      MESSAGE(  G$_NLS.Get('FRAGRNT-0098', 'FORM','Select SAVE to perform a Commit.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
--
  EXECUTE_TRIGGER('SET_FIELDS');
  G$_CHECK_FAILURE;
--
  EXECUTE_TRIGGER('RE_EDIT');
  G$_CHECK_FAILURE;
--

IF :HOLD_END_DATE IS NULL AND :FRBGRNT_PROJECT_END_DATE IS NULL THEN
    :CHANGED_DATE := '';
ELSIF :HOLD_END_DATE = :FRBGRNT_PROJECT_END_DATE THEN
     :CHANGED_DATE := '';
ELSE
    :CHANGED_DATE := 'Y';
END IF;


--
if :changed_date is null then
    GOTO AAA;
END IF;
 if determine_end_date_yes  then                                
    if determine_in_budget_table then                  
    message( G$_NLS.Get('FRAGRNT-0099', 'FORM','WARNING--> Changing Project End date may affect Trail Out period postings in the Grant Ledger.') );    
    end if;
  else
      if determine_end_date then   
          if determine_in_budget_table then   
 message( G$_NLS.Get('FRAGRNT-0100', 'FORM','WARNING--> Changing Project End date may affect Trail Out period postings in the Grant Ledger.') );          
          end if;
       end if;
  end if;
:changed_date := ' ';
:HOLD_END_DATE  := :FRBGRNT_PROJECT_END_DATE;
--
<<AAA>>
  EXECUTE_TRIGGER('UPDATE_ACTIVITY_DATE');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('UPDATE_USER_ID');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('CHECK_TEXT');
  G$_CHECK_FAILURE;
--
 IF :frbgrnt_status_code is not null then
   if :hold_status_code is null then
      EXECUTE_TRIGGER('GET_HISTORY');
      G$_CHECK_FAILURE;
      return;
   END IF;
 END IF;
-- 
 IF :frbgrnt_STATUS_CODE IS NOT NULL THEN
   IF :HOLD_STATUS_CODE <> :frbgrnt_STATUS_CODE THEN
      EXECUTE_TRIGGER('GET_HISTORY');
      G$_CHECK_FAILURE;
      return;
   END IF;
 END IF; 
--

 IF (:frbgrnt_alternate_status_desc IS NOT NULL AND :HOLD_ALT_STATUS_DESC is null )OR 
    (:frbgrnt_alternate_status_desc IS NOT NULL AND :HOLD_ALT_STATUS_DESC <> :frbgrnt_alternate_status_desc) OR 
    (:frbgrnt_alternate_status_desc IS NULL and :HOLD_ALT_STATUS_DESC IS NOT NULL) OR
    (:frbgrnt_STATUS_date IS NOT NULL AND :HOLD_STATUS_date <> :frbgrnt_STATUS_date) THEN
    EXECUTE_TRIGGER('GET_HISTORY');
    G$_CHECK_FAILURE;
    RETURN;
  END IF;
  
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void frbgrnt_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)args.getRow();


				if ( getTask().getGoqrpls().gNchk(toBool(getFormModel().getFormHeader().getCommitInd().notEquals("Y"))).getValue() )
				{
					warningMessage(GNls.Fget(toStr("FRAGRNT-0098"), toStr("FORM"), toStr("Select SAVE to perform a Commit.")));
					throw new ApplicationException();
				}
				// 
				executeAction("SET_FIELDS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("RE_EDIT");
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( frbgrntElement.getHoldEndDate().isNull() && frbgrntElement.getFrbgrntProjectEndDate().isNull() )
				{
					getFormModel().getFormHeader().setChangedDate(toStr(""));
				}
				else if ( frbgrntElement.getHoldEndDate().equals(frbgrntElement.getFrbgrntProjectEndDate()) ) {
					getFormModel().getFormHeader().setChangedDate(toStr(""));
				}
				else {
					getFormModel().getFormHeader().setChangedDate(toStr("Y"));
				}
				// 
				if ( !(getFormModel().getFormHeader().getChangedDate().isNull() ))
				{
//					 goto AAA;
//				}
					if ( this.getTask().getServices().determineEndDateYes(frbgrntElement).getValue() )
					{
						if ( this.getTask().getServices().determineInBudgetTable().getValue() )
						{
//							message(GNls.Fget(toStr("FRAGRNT-0099"), toStr("FORM"), toStr("WARNING--> Changing Project End date may affect Trail Out period postings in the Grant Ledger.")));
							warningMessage(GNls.Fget(toStr("FRAGRNT-0099"), toStr("FORM"), toStr("WARNING--> Changing Project End date may affect Trail Out period postings in the Grant Ledger.")));
						}
					}
					else {
						if ( this.getTask().getServices().determineEndDate(frbgrntElement).getValue() )
						{
							if ( this.getTask().getServices().determineInBudgetTable().getValue() )
							{
//								message(GNls.Fget(toStr("FRAGRNT-0100"), toStr("FORM"), toStr("WARNING--> Changing Project End date may affect Trail Out period postings in the Grant Ledger.")));
								warningMessage(GNls.Fget(toStr("FRAGRNT-0100"), toStr("FORM"), toStr("WARNING--> Changing Project End date may affect Trail Out period postings in the Grant Ledger.")));
							}
						}
					}
					getFormModel().getFormHeader().setChangedDate(toStr(" "));
					frbgrntElement.setHoldEndDate(frbgrntElement.getFrbgrntProjectEndDate());
				}
				// AAA:;
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("CHECK_TEXT");
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( !frbgrntElement.getFrbgrntStatusCode().isNull() )
				{
					if ( getFormModel().getFormHeader().getHoldStatusCode().isNull() )
					{
						executeAction("GET_HISTORY");
						getTask().getGoqrpls().gCheckFailure();
						return ;
					}
				}
				//  
				if ( !frbgrntElement.getFrbgrntStatusCode().isNull() )
				{
					if ( getFormModel().getFormHeader().getHoldStatusCode().notEquals(frbgrntElement.getFrbgrntStatusCode()) )
					{
						executeAction("GET_HISTORY");
						getTask().getGoqrpls().gCheckFailure();
						return ;
					}
				}
				// 
				if ( (!frbgrntElement.getFrbgrntAlternateStatusDesc().isNull() && getFormModel().getFormHeader().getHoldAltStatusDesc().isNull()) || (!frbgrntElement.getFrbgrntAlternateStatusDesc().isNull() && getFormModel().getFormHeader().getHoldAltStatusDesc().notEquals(frbgrntElement.getFrbgrntAlternateStatusDesc())) || (frbgrntElement.getFrbgrntAlternateStatusDesc().isNull() && !getFormModel().getFormHeader().getHoldAltStatusDesc().isNull()) || (!frbgrntElement.getFrbgrntStatusDate().isNull() && getFormModel().getFormHeader().getHoldStatusDate().notEquals(frbgrntElement.getFrbgrntStatusDate())) )
				{
					executeAction("GET_HISTORY");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.PRE-INSERT
		 BEGIN
   IF G$_NCHK(:commit_ind <> 'Y') THEN
      MESSAGE(  G$_NLS.Get('FRAGRNT-0101', 'FORM','Select SAVE to perform a Commit.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
--
  EXECUTE_TRIGGER('SET_FIELDS');
  G$_CHECK_FAILURE;
--
  EXECUTE_TRIGGER('RE_EDIT');
  G$_CHECK_FAILURE;
--
  IF :DISPLAY_frbgrnt_CODE = :FORM_HEADER.NEXT_DOC_NUM THEN
     EXECUTE_TRIGGER('GEN_DOC_NUMBER');
     G$_CHECK_FAILURE;
  ELSE
     :frbgrnt_CODE := :DISPLAY_frbgrnt_CODE;
  END IF;
--
  EXECUTE_TRIGGER('UPDATE_ACTIVITY_DATE');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('UPDATE_USER_ID');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('CHECK_TEXT');
  G$_CHECK_FAILURE;
--
 -- 54-0033
  IF :frbgrnt_STATUS_CODE IS NOT NULL THEN
       EXECUTE_TRIGGER('GET_HISTORY');
      G$_CHECK_FAILURE;
      return;
   END IF;
--
  COPY_FROM_TO_FRBPROP;
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void frbgrnt_BeforeRowInsert(RowAdapterEvent args)
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)args.getRow();


				if ( getTask().getGoqrpls().gNchk(toBool(getFormModel().getFormHeader().getCommitInd().notEquals("Y"))).getValue() )
				{
					warningMessage(GNls.Fget(toStr("FRAGRNT-0101"), toStr("FORM"), toStr("Select SAVE to perform a Commit.")));
					throw new ApplicationException();
				}
				// 
				executeAction("SET_FIELDS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("RE_EDIT");
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( getFormModel().getKeyBlock().getDisplayFrbgrntCode().equals(getFormModel().getFormHeader().getNextDocNum()) )
				{
					executeAction("GEN_DOC_NUMBER");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					frbgrntElement.setFrbgrntCode(getFormModel().getKeyBlock().getDisplayFrbgrntCode());
				}
				// 
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("CHECK_TEXT");
				getTask().getGoqrpls().gCheckFailure();
				// 
				//  54-0033
				if ( !frbgrntElement.getFrbgrntStatusCode().isNull() )
				{
					executeAction("GET_HISTORY");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
				// 
				this.getTask().getServices().copyFromToFrbprop(frbgrntElement);
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.POST-DELETE
		 EXECUTE_TRIGGER('DELETE_TEXT');
G$_CHECK_FAILURE;
--
EXECUTE_TRIGGER('DELETE_LOCN');
G$_CHECK_FAILURE;
--
EXECUTE_TRIGGER('DELETE_FRVPRST');
G$_CHECK_FAILURE;
--
EXECUTE_TRIGGER('DELETE_FRRGRPI');
G$_CHECK_FAILURE;
--
EXECUTE_TRIGGER('DELETE_FRRGUSN');
G$_CHECK_FAILURE;
--
EXECUTE_TRIGGER('DELETE_FRBGBIL');
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.POST-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowDelete
		public void frbgrnt_AfterRowDelete(RowAdapterEvent args)
		{
			
				executeAction("DELETE_TEXT");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("DELETE_LOCN");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("DELETE_FRVPRST");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("DELETE_FRRGRPI");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("DELETE_FRRGUSN");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("DELETE_FRBGBIL");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.WHEN-NEW-ITEM-INSTANCE
		  if :system.cursor_item = 'FRBGRNT.FRBGRNT_AGENCY_CONTACT' then
 	  if :FRBGRNT_AGENCY_CODE_2 is null then
 	  	 :FRBGRNT_AGENCY_CODE_2 := :FRBGRNT_AGENCY_CODE;
 	  	 :FRBGRNT_AGENCY_NAME_2 := :FRBGRNT_AGENCY_NAME;
 	  end if;
 end if;

 IF :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN
      IF (:SYSTEM.TRIGGER_ITEM = 'frbgrnt.frbgrnt_COAS_CODE' OR 
          :SYSTEM.TRIGGER_ITEM = 'frbgrnt.frbgrnt_ORGN_CODE_RESP_OFFICE') THEN
         RETURN;
      END IF;
--
      EXECUTE_TRIGGER('CHECK_SECURITY_ENTERED');
      G$_CHECK_FAILURE;
 END IF;
 
 
 if :system.cursor_item = 'FRBGRNT.FRBGRNT_AGENCY_CONTACT' then
 	  if :FRBGRNT_AGENCY_CODE_2 is null then
 	  	 :FRBGRNT_AGENCY_CODE_2 := :FRBGRNT_AGENCY_CODE;
 	  	 :FRBGRNT_AGENCY_NAME_2 := :FRBGRNT_AGENCY_NAME;
 	  end if;
 end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrnt_itemChange()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if (frbgrntElement != null) {
	
					if ( getCursorItem().equals("FRBGRNT.FRBGRNT_AGENCY_CONTACT") )
					{
						if ( frbgrntElement.getFrbgrntAgencyCode2().isNull() )
						{
							frbgrntElement.setFrbgrntAgencyCode2(frbgrntElement.getFrbgrntAgencyCode());
							frbgrntElement.setFrbgrntAgencyName2(frbgrntElement.getFrbgrntAgencyName());
						}
					}
					if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
					{
						if ((getTriggerItem().equals("frbgrnt.frbgrnt_COAS_CODE") || getTriggerItem().equals("frbgrnt.frbgrnt_ORGN_CODE_RESP_OFFICE")))
						{
							return ;
						}
						// 
						executeAction("CHECK_SECURITY_ENTERED");
						getTask().getGoqrpls().gCheckFailure();
					}
					if ( getCursorItem().equals("FRBGRNT.FRBGRNT_AGENCY_CONTACT") )
					{
						if ( frbgrntElement.getFrbgrntAgencyCode2().isNull() )
						{
							frbgrntElement.setFrbgrntAgencyCode2(frbgrntElement.getFrbgrntAgencyCode());
							frbgrntElement.setFrbgrntAgencyName2(frbgrntElement.getFrbgrntAgencyName());
						}
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.POST-RECORD
		  IF :SYSTEM.MODE = 'QUERY' THEN
    RETURN;
 END IF;
--
--EXECUTE_TRIGGER('RE_EDIT');
--G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.POST-RECORD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-RECORD")
		public void frbgrnt_PostRecord()
		{
			
				if ( getMode().equals("QUERY") )
				{
					return ;
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.POST-INSERT
		 IF :COPY_FUNCT_PROCESS = 'Y' THEN
   COPY_INSERT_frbgrnt.COPY_INSERT_FOBTEXT;
   COPY_INSERT_frbgrnt.COPY_INSERT_FRRgloc;
   COPY_INSERT_frbgrnt.COPY_INSERT_FRRgrpi;
   COPY_INSERT_frbgrnt.COPY_INSERT_FRRgusn;
   COPY_INSERT_frbgrnt.COPY_INSERT_FRBGBIL;
   COPY_INSERT_frbgrnt.COPY_INSERT_frragpt;
   return;
END IF;
--
IF :COPY_FROM_PROP = 'Y' THEN
     COPY_FROM_PROP_TO.COPY_FROM_PROP_FRRGLOC;
     COPY_FROM_PROP_TO.COPY_FROM_PROP_FRRGRPI;
     COPY_FROM_PROP_TO.COPY_FROM_PROP_FRRGUSN;
     COPY_FROM_PROP_TO.COPY_FROM_PROP_FRBGBIL;
     COPY_FROM_PROP_TO.COPY_FROM_TO_FOATEXT;
     COPY_FROM_PROP_TO.COPY_FROM_PROP_FRRAGPT;
    return;
END IF;
--
IF :frbgrnt_PI_ID_CODE IS NOT NULL THEN
     INSERT_FRRgrpi_1;
     G$_CHECK_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.POST-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowInsert
		public void frbgrnt_AfterRowInsert(RowAdapterEvent args)
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)args.getRow();


				if ( getFormModel().getFormHeader().getCopyFunctProcess().equals("Y") )
				{
					getTask().getCopyInsertFrbgrnt().copyInsertFobtext();
					getTask().getCopyInsertFrbgrnt().copyInsertFrrgloc();
					getTask().getCopyInsertFrbgrnt().copyInsertFrrgrpi(frbgrntElement);
					getTask().getCopyInsertFrbgrnt().copyInsertFrrgusn();
					getTask().getCopyInsertFrbgrnt().copyInsertFrbgbil();
					getTask().getCopyInsertFrbgrnt().copyInsertFrragpt();
					return ;
				}
				// 
				if ( getFormModel().getFormHeader().getCopyFromProp().equals("Y") )
				{
					getTask().getCopyFromPropTo().copyFromPropFrrgloc(frbgrntElement);
					getTask().getCopyFromPropTo().copyFromPropFrrgrpi();
					getTask().getCopyFromPropTo().copyFromPropFrrgusn();
					getTask().getCopyFromPropTo().copyFromPropFrbgbil();
					getTask().getCopyFromPropTo().copyFromToFoatext();
					getTask().getCopyFromPropTo().copyFromPropFrragpt();
					return ;
				}
				// 
				if ( !frbgrntElement.getFrbgrntPiIdCode().isNull() )
				{
					this.getTask().getServices().insertFrrgrpi1(frbgrntElement);
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.POST-UPDATE
		  IF :FRRgrpi_frbgrnt_COPY_ID = 'N' OR :FRRgrpi_frbgrnt_COPY_ID IS NULL THEN
    IF :frbgrnt_PI_ID_CODE IS NOT NULL THEN
      IF :HOLD_PI_ID_CODE IS NOT NULL THEN
            IF :HOLD_PI_ID_CODE <> :frbgrnt_PI_ID_CODE THEN
               UPDATE_FRRgrpi_1;
               G$_CHECK_FAILURE;
            END IF;
     ELSE
         INSERT_FRRgrpi_1;
     END IF;
  ELSE 
    IF :HOLD_PI_ID_CODE IS NOT NULL AND :frbgrnt_PI_ID_CODE IS NULL THEN
       DELETE_FRRgrpi_1;
      G$_CHECK_FAILURE;
    END IF;
 END IF;
END IF;
--
  :FRRgrpi_frbgrnt_COPY_ID := 'N';




		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.POST-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowUpdate
		public void frbgrnt_AfterRowUpdate(RowAdapterEvent args)
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)args.getRow();


				if ( getFormModel().getFormHeader().getFrrgrpiFrbgrntCopyId().equals("N") || getFormModel().getFormHeader().getFrrgrpiFrbgrntCopyId().isNull() )
				{
					if ( !frbgrntElement.getFrbgrntPiIdCode().isNull() )
					{
						if ( !getFormModel().getFormHeader().getHoldPiIdCode().isNull() )
						{
							if ( getFormModel().getFormHeader().getHoldPiIdCode().notEquals(frbgrntElement.getFrbgrntPiIdCode()) )
							{
								this.getTask().getServices().updateFrrgrpi1(frbgrntElement);
								getTask().getGoqrpls().gCheckFailure();
							}
						}
						else {
							this.getTask().getServices().insertFrrgrpi1(frbgrntElement);
						}
					}
					else {
						if ( !getFormModel().getFormHeader().getHoldPiIdCode().isNull() && frbgrntElement.getFrbgrntPiIdCode().isNull() )
						{
							this.getTask().getServices().deleteFrrgrpi1(frbgrntElement);
							getTask().getGoqrpls().gCheckFailure();
						}
					}
				}
				// 
				getFormModel().getFormHeader().setFrrgrpiFrbgrntCopyId(toStr("N"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.KEY-DUP-ITEM
		 if :System.Record_Status NOT IN ('NEW','INSERT') then
    MESSAGE( G$_NLS.Get('FRAGRNT-0102', 'FORM','This function not allowed when a record is already present.') );
    RAISE FORM_TRIGGER_FAILURE;
end if;
--
if :copy_from_prop = 'Y' then
    MESSAGE( G$_NLS.Get('FRAGRNT-0103', 'FORM','This function is not allowed when record is being copied from the Proposal.') );
    RAISE FORM_TRIGGER_FAILURE;
end if;
--
EXECUTE_TRIGGER('SET_REQUIRED_OFF');
--
message( G$_NLS.Get('FRAGRNT-0104', 'FORM','Existing Information will be overriden') );
--
go_item('COPY_BLOCK.COPY_grnt_CODE');
g$_check_failure;
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
			
				if ( !(getRecordStatus().equals("NEW") || getRecordStatus().equals("INSERT")) )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0102"), toStr("FORM"), toStr("This function not allowed when a record is already present.")));
					throw new ApplicationException();
				}
				// 
				if ( getFormModel().getFormHeader().getCopyFromProp().equals("Y") )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0103"), toStr("FORM"), toStr("This function is not allowed when record is being copied from the Proposal.")));
					throw new ApplicationException();
				}
				// 
				executeAction("SET_REQUIRED_OFF");
				// 
				warningMessage(GNls.Fget(toStr("FRAGRNT-0104"), toStr("FORM"), toStr("Existing Information will be overriden")));
				// 
				goItem(toStr("COPY_BLOCK.COPY_grnt_CODE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.KEY-CREREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void frbgrnt_CreateRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.KEY-CLRREC
		 if get_item_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'FRAgrnt_1_CANVAS' AND
   (:SYSTEM.RECORD_STATUS = 'QUERY' OR :SYSTEM.RECORD_STATUS = 'CHANGED') then
   execute_trigger('INVALID_FUNCTION_MSG');
   g$_check_failure;
else 
 clear_fields(:SYSTEM.CURSOR_BLOCK,:SYSTEM.CURSOR_ITEM);
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void frbgrnt_ClearRecord()
		{
			
				if ( getItemCanvas(getCursorItem()).equals("FRAgrnt_1_CANVAS") && (getRecordStatus().equals("QUERY") || getRecordStatus().equals("CHANGED")) )
				{
					executeAction("INVALID_FUNCTION_MSG");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					this.getTask().getServices().clearFields(toStr(getCursorBlock()), toStr(getCursorItem()));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.KEY-NXTREC
		 IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'FRAgrnt_5_CANVAS' THEN
  IF :SYSTEM.CURSOR_ITEM = 'frbgrnt.frbgrnt_USER_CODE_10' THEN
     GO_ITEM('frbgrnt_USER_CODE_1');
  ELSIF :SYSTEM.CURSOR_ITEM = 'frbgrnt.frbgrnt_USER_CODE_10_DESCR' THEN
     GO_ITEM('frbgrnt_USER_CODE_1_DESCR');
  ELSE
    DO_KEY('NEXT_ITEM');
    DO_KEY('NEXT_ITEM');
  END IF;
ELSE
  EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
  G$_CHECK_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void frbgrnt_NextRecord()
		{
			
				if ( getItemCanvas(getCursorItem()).equals("FRAgrnt_5_CANVAS") )
				{
					if ( getCursorItem().equals("frbgrnt.frbgrnt_USER_CODE_10") )
					{
						goItem(toStr("frbgrnt_USER_CODE_1"));
					}
					else if ( getCursorItem().equals("frbgrnt.frbgrnt_USER_CODE_10_DESCR") ) {
						goItem(toStr("frbgrnt_USER_CODE_1_DESCR"));
					}
					else {
						executeAction("NEXT_ITEM");
						executeAction("NEXT_ITEM");
					}
				}
				else {
					executeAction("INVALID_FUNCTION_MSG");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.KEY-UP
		 IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'FRAgrnt_5_CANVAS' THEN
  IF :SYSTEM.CURSOR_ITEM = 'frbgrnt.frbgrnt_USER_CODE_1' THEN
     GO_ITEM('frbgrnt_USER_CODE_10');
  ELSIF :SYSTEM.CURSOR_ITEM = 'frbgrnt.frbgrnt_USER_CODE_1_DESCR' THEN
     GO_ITEM('frbgrnt_USER_CODE_10_DESCR');
  ELSE
    DO_KEY('PREVIOUS_ITEM');
    DO_KEY('PREVIOUS_ITEM');
  END IF;
ELSE
  EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
  G$_CHECK_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.KEY-UP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void frbgrnt_MoveUp()
		{
			
				if ( getItemCanvas(getCursorItem()).equals("FRAgrnt_5_CANVAS") )
				{
					if ( getCursorItem().equals("frbgrnt.frbgrnt_USER_CODE_1") )
					{
						goItem(toStr("frbgrnt_USER_CODE_10"));
					}
					else if ( getCursorItem().equals("frbgrnt.frbgrnt_USER_CODE_1_DESCR") ) {
						goItem(toStr("frbgrnt_USER_CODE_10_DESCR"));
					}
					else {
						executeAction("PREVIOUS_ITEM");
						executeAction("PREVIOUS_ITEM");
					}
				}
				else {
					executeAction("INVALID_FUNCTION_MSG");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.KEY-DOWN
		 IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'FRAgrnt_5_CANVAS' THEN
  IF :SYSTEM.CURSOR_ITEM = 'frbgrnt.frbgrnt_USER_CODE_10' THEN
     GO_ITEM('frbgrnt_USER_CODE_1');
  ELSIF :SYSTEM.CURSOR_ITEM = 'frbgrnt.frbgrnt_USER_CODE_10_DESCR' THEN
     GO_ITEM('frbgrnt_USER_CODE_1_DESCR');
  ELSE
    DO_KEY('NEXT_ITEM');
    DO_KEY('NEXT_ITEM');
  END IF;
ELSE
  EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
  G$_CHECK_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void frbgrnt_MoveDown()
		{
			
				if ( getItemCanvas(getCursorItem()).equals("FRAgrnt_5_CANVAS") )
				{
					if ( getCursorItem().equals("frbgrnt.frbgrnt_USER_CODE_10") )
					{
						goItem(toStr("frbgrnt_USER_CODE_1"));
					}
					else if ( getCursorItem().equals("frbgrnt.frbgrnt_USER_CODE_10_DESCR") ) {
						goItem(toStr("frbgrnt_USER_CODE_1_DESCR"));
					}
					else {
						executeAction("NEXT_ITEM");
						executeAction("NEXT_ITEM");
					}
				}
				else {
					executeAction("INVALID_FUNCTION_MSG");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.KEY-CLRBLK
		  clear_fields(:SYSTEM.CURSOR_BLOCK,:SYSTEM.CURSOR_ITEM);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void frbgrnt_keyClearBlock()
		{
			
				this.getTask().getServices().clearFields(toStr(getCursorBlock()), toStr(getCursorItem()));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.ON-ERROR
		 DECLARE 
	 errnum NUMBER       := ERROR_CODE; 
	 errtxt VARCHAR2(80) := ERROR_TEXT; 
	 errtyp VARCHAR2(3)  := ERROR_TYPE; 
BEGIN 
	G$_ERRORS.POPULATE_VARIABLES;-- add error handling logic for 7.0	
  IF DBMS_ERROR_CODE = G$_ERRORS.CHECK_POLICY_VIOLATION THEN
     Message(G$_ERRORS.CHECK_POLICY_MESSAGE);
     RAISE FORM_TRIGGER_FAILURE;--end 7.0    
  ELSIF errnum = 40350 THEN 
     Message(F_GET_ERROR('USER_NOT_AUTH'));  
     RAISE Form_Trigger_Failure; 
	ELSE                          -- add error handling logic for 7.0	
		Message(errtyp||'-'||TO_CHAR(errnum)||': '||errtxt); 
		RAISE Form_Trigger_Failure; --end 7.0
  END IF; 

END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/

		@OnError
		public void frbgrnt_OnError(EventObject args)
		{
			
				{
					NNumber errnum = errorCode();
					NString errtxt = errorMessage();
					NString errtyp = toStr("");//SupportClasses.SQLFORMS.ErrorType();
					getTask().getGoqrpls().getGErrors().populateVariables();
					//  add error handling logic for 7.0	
					if ( errorCode().equals(getTask().getGoqrpls().getGErrors().checkPolicyViolation) )
					{
						errorMessage(getTask().getGoqrpls().getGErrors().checkPolicyMessage);
						throw new ApplicationException();
					}
					else if ( errnum.equals(40350) ) {
						errorMessage(this.getTask().getServices().fGetError(toStr("USER_NOT_AUTH")));
						throw new ApplicationException();
					}
					else {
						//  add error handling logic for 7.0	
						errorMessage(errtyp.append("-").append(toChar(errnum)).append(": ").append(errtxt));
						throw new ApplicationException();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.KEY-PRVREC
		 IF GET_ITEM_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'FRAgrnt_5_CANVAS' THEN
  IF :SYSTEM.CURSOR_ITEM = 'frbgrnt.frbgrnt_USER_CODE_1' THEN
     GO_ITEM('frbgrnt_USER_CODE_10');
  ELSIF :SYSTEM.CURSOR_ITEM = 'frbgrnt.frbgrnt_USER_CODE_1_DESCR' THEN
     GO_ITEM('frbgrnt_USER_CODE_10_DESCR');
  ELSE
    DO_KEY('PREVIOUS_ITEM');
    DO_KEY('PREVIOUS_ITEM');
  END IF;
ELSE
  EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
  G$_CHECK_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void frbgrnt_PreviousRecord()
		{
			
				if ( getItemCanvas(getCursorItem()).equals("FRAgrnt_5_CANVAS") )
				{
					if ( getCursorItem().equals("frbgrnt.frbgrnt_USER_CODE_1") )
					{
						goItem(toStr("frbgrnt_USER_CODE_10"));
					}
					else if ( getCursorItem().equals("frbgrnt.frbgrnt_USER_CODE_1_DESCR") ) {
						goItem(toStr("frbgrnt_USER_CODE_10_DESCR"));
					}
					else {
						executeAction("PREVIOUS_ITEM");
						executeAction("PREVIOUS_ITEM");
					}
				}
				else {
					executeAction("INVALID_FUNCTION_MSG");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.KEY-DELREC
		 DECLARE
 GRNL_EXIST  VARCHAR2(1);
 FUND_EXIST  VARCHAR2(1);
 CURSOR C1 IS
   SELECT 'Y'
   FROM   FTVFUND
   WHERE  FTVFUND_grnt_CODE = :DISPLAY_frbgrnt_CODE
   AND    FTVFUND_COAS_CODE = :FRBGRNT_COAS_CODE
   AND    FTVFUND_EFF_DATE <= SYSDATE
   AND    FTVFUND_NCHG_DATE > SYSDATE
   AND   (ftvfund_term_date > sysdate or ftvfund_term_date is null);
 CURSOR C2 IS
   SELECT 'X'
     FROM FRRGRNL
    WHERE FRRGRNL_GRNT_CODE = :DISPLAY_frbgrnt_CODE;

BEGIN
 OPEN  C1;
 FETCH C1 INTO FUND_EXIST;
 IF C1%FOUND THEN
 	  CLOSE C1;
 	  OPEN  C2;
    FETCH C2 INTO GRNL_EXIST;
    IF C2%FOUND THEN
       MESSAGE( G$_NLS.Get('FRAGRNT-0105', 'FORM','Grant cannot be deleted when it is attached to a valid fund,'||
                                                  ' and grant ledger Records exist.') );
       CLOSE C2;
       RAISE FORM_TRIGGER_FAILURE;
    ELSIF C2%NOTFOUND THEN
	  	 MESSAGE( G$_NLS.Get('FRAGRNT-0106', 'FORM','Grant cannot be deleted when it is attached to a valid fund.') );
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
 ELSIF C1%NOTFOUND THEN
    OPEN C2;
    FETCH C2 INTO GRNL_EXIST;
    IF C2%FOUND THEN	
       MESSAGE( G$_NLS.Get('FRAGRNT-0107', 'FORM','Grant cannot be deleted when grant ledger Records exist.') );
       CLOSE C2;
       RAISE FORM_TRIGGER_FAILURE;
    END IF;
 END IF;
 
   if :del_ready = 'N' then
   	  :del_ready := 'Y';
   	  message(G$_NLS.Get('FRAGRNT-0108', 'FORM','Press ''Delete Record'' again to Delete this Record.'));
   	  raise form_trigger_failure;
   end if;
   
   :del_ready := 'N';
   if get_item_PROPERTY(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) = 'HEADER_INFORMATION' then
      delete_record;
      execute_trigger('FORCE_COMMIT');
      g$_check_failure;
   else
      clear_fields(:SYSTEM.CURSOR_BLOCK,:SYSTEM.CURSOR_ITEM);
   end if;

END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void frbgrnt_DeleteRecord()
		{
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				if(frbgrntElement==null)
					return;

				int rowCount = 0;
				{
					NString grnlExist= NString.getNull();
					NString fundExist= NString.getNull();
					String sqlc1 = "SELECT 'Y' " +
	" FROM FTVFUND " +
	" WHERE FTVFUND_grnt_CODE = :DISPLAY_FRBGRNT_CODE AND FTVFUND_COAS_CODE = :FRBGRNT_COAS_CODE AND FTVFUND_EFF_DATE <= SYSDATE AND FTVFUND_NCHG_DATE > SYSDATE AND (ftvfund_term_date > sysdate OR ftvfund_term_date IS NULL) ";
					DataCursor c1 = new DataCursor(sqlc1);
					String sqlc2 = "SELECT 'X' " +
	" FROM FRRGRNL " +
	" WHERE FRRGRNL_GRNT_CODE = :DISPLAY_FRBGRNT_CODE ";
					DataCursor c2 = new DataCursor(sqlc2);
					try {
						//Setting query parameters
						c1.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel().getKeyBlock().getDisplayFrbgrntCode());
						c1.addParameter("FRBGRNT_COAS_CODE", frbgrntElement.getFrbgrntCoasCode());
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							fundExist = c1Results.getStr(0);
						}
						if ( c1.found() )
						{
							c1.close();
							//Setting query parameters
							c2.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel().getKeyBlock().getDisplayFrbgrntCode());
							c2.open();
							ResultSet c2Results = c2.fetchInto();
							if ( c2Results != null ) {
								grnlExist = c2Results.getStr(0);
							}
							if ( c2.found() )
							{
								errorMessage(GNls.Fget(toStr("FRAGRNT-0105"), toStr("FORM"), toStr("Grant cannot be deleted when it is attached to a valid fund,").append(" and grant ledger Records exist.")));
								c2.close();
								throw new ApplicationException();
							}
							else if ( c2.notFound() ) {
								errorMessage(GNls.Fget(toStr("FRAGRNT-0106"), toStr("FORM"), toStr("Grant cannot be deleted when it is attached to a valid fund.")));
								throw new ApplicationException();
							}
						}
						else if ( c1.notFound() ) {
							//Setting query parameters
							c2.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel().getKeyBlock().getDisplayFrbgrntCode());
							c2.open();
							ResultSet c2Results = c2.fetchInto();
							if ( c2Results != null ) {
								grnlExist = c2Results.getStr(0);
							}
							if ( c2.found() )
							{
								errorMessage(GNls.Fget(toStr("FRAGRNT-0107"), toStr("FORM"), toStr("Grant cannot be deleted when grant ledger Records exist.")));
								c2.close();
								throw new ApplicationException();
							}
						}
						if ( getFormModel().getFormHeader().getDelReady().equals("N") )
						{
							getFormModel().getFormHeader().setDelReady(toStr("Y"));
							warningMessage(GNls.Fget(toStr("FRAGRNT-0108"), toStr("FORM"), toStr("Press 'Delete Record' again to Delete this Record.")));
							throw new ApplicationException();
						}
						getFormModel().getFormHeader().setDelReady(toStr("N"));
	//					if ( SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.ITEM_TAB_PAGE).equals("HEADER_INFORMATION") )
						if (getCanvasTopMostTabPage("FRAGRNT_1_TAB_CANVAS").equals("HEADER_INFORMATION") )
						{
							deleteRecord();
							executeAction("FORCE_COMMIT");
							getTask().getGoqrpls().gCheckFailure();
						}
						else {
							this.getTask().getServices().clearFields(toStr(getCursorBlock()), toStr(getCursorItem()));
						}
					} finally {
						c1.close();
						c2.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT.EDIT_PROJECT_DATES
		 MESSAGE(G$_NLS.GET('FRAGRNT-0109','FORM','*WARNING* Research Accounting Fund Budget Period Start and End Dates may need similar changes to support multi-year encumbrances.'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT.EDIT_PROJECT_DATES
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="EDIT_PROJECT_DATES")
		public void frbgrnt_EditProjectDates()
		{
			
				warningMessage(GNls.Fget(toStr("FRAGRNT-0109"), toStr("FORM"), toStr("*WARNING* Research Accounting Fund Budget Period Start and End Dates may need similar changes to support multi-year encumbrances.")));
			}

		
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
			
            	if (NString.isNullOrEmpty(getBlockWhereClause(getCurrentBlock()))){
					setBlockWhereClause("FRBGRNT", "frbgrnt_code = :KEY_BLOCK_DISPLAY_FRBGRNT_CODE AND :KEY_BLOCK_DISPLAY_FRBGRNT_CODE <> :FORM_HEADER_NEXT_DOC_NUM");
				}

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_DISPLAY_FRBGRNT_CODE", this.getFormModel().getKeyBlock().getDisplayFrbgrntCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("FORM_HEADER_NEXT_DOC_NUM", this.getFormModel().getFormHeader().getNextDocNum()));             
				

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("COPY_grnt_CODE", this.getFormModel().getCopyBlock().getCopyGrntCode()));

               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_NAME_2.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_AGENCY_NAME_2", function=KeyFunction.NEXT_ITEM)
		public void frbgrntAgencyName2_keyNexItem()
		{
			
				getGNameClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_COAS_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBGRNT_COAS_CODE")
		public void frbgrntCoasCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_COAS_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_COAS_CODE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntCoasCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_COAS_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRBGRNT_COAS_CODE")
		public void frbgrntCoasCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_COAS_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_COAS_CODE", function=KeyFunction.NEXT_ITEM)
		public void frbgrntCoasCode_keyNexItem()
		{
				frbgrntCoasCode_validate();
				nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_COAS_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_COAS_CODE", function=KeyFunction.ITEM_OUT)
		public void frbgrntCoasCode_itemOut()
		{
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_COAS_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVCOAS_COAS_CODE', 'FTVCOAS_TITLE',
   G$_SEARCH_WHERE.F_FTVCOAS_ENTRY('SYSDATE'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_COAS_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRBGRNT_COAS_CODE")
		public void frbgrntCoasCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVCOAS_COAS_CODE"), toStr("FTVCOAS_TITLE"), getTask().getGoqrpls().getGSearchWhere().fFtvcoasEntry(toStr("SYSDATE")));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_COAS_CODE.POST-CHANGE
		 DECLARE
	 AL_BUTTON        NUMBER;
BEGIN
   G$_CHECK_QUERY_MODE ;
--
     EXECUTE_TRIGGER( 'EDIT_COAS_CODE' ) ;
     G$_CHECK_FAILURE; 
--
   :GLOBAL.QUERY_MODE := '0' ;
--   

  IF :SYSTEM.FORM_STATUS = 'CHANGED' AND  :FRBGRNT_EFF_CERT_REQUIRED_IND = 'Y' AND NAME_IN('GLOBAL.HRESYS') = 'Y' THEN
      IF CHECK_ACCT_ELE_VAL = 'Y' THEN 
         SET_ALERT_PROPERTY('G$_WARNING_ALERT',ALERT_MESSAGE_TEXT,
          G$_NLS.Get('FRAGRNT-0110', 'FORM','*WARNING* There are existing Effort Reporting values.'));
         AL_BUTTON := SHOW_ALERT('G$_WARNING_ALERT');
      END IF;
  END IF;
--  
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
		 * FRBGRNT_COAS_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_COAS_CODE")
		public void frbgrntCoasCode_PostChange()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				FrrgrecAdapter frrgrecElement = (FrrgrecAdapter)this.getFormModel().getFrrgrec().getRowAdapter(true);

if (frbgrntElement != null) {
	

				if(frbgrntElement.getFrbgrntCoasCode().isNull())
		return;
				{
					NNumber alButton= NNumber.getNull();
					try
					{
						getTask().getGoqrpls().gCheckQueryMode();
						// 
						executeAction("EDIT_COAS_CODE");
						getTask().getGoqrpls().gCheckFailure();
						// 
						setGlobal("QUERY_MODE", toStr("0"));
						//    
						if ( getTaskStatus().equals("CHANGED") && frbgrntElement.getFrbgrntEffCertRequiredInd().equals("Y") && getNameIn("GLOBAL.HRESYS").equals("Y") )
						{
							if ( this.getTask().getServices().checkAcctEleVal(frrgrecElement).equals("Y") )
							{
								setAlertMessageText("G$_WARNING_ALERT", GNls.Fget(toStr("FRAGRNT-0110"), toStr("FORM"), toStr("*WARNING* There are existing Effort Reporting values.")));
								alButton = toNumber(showAlert("G$_WARNING_ALERT"));
							}
						}
					}
					catch(ApplicationException e)
					{
						setGlobal("QUERY_MODE", toStr("0"));
						throw new ApplicationException();
					}
				}
}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_COAS_CODE.POST_TEXT_ITEMXXX
		 IF :frbgrnt_COAS_CODE IS NULL THEN
   MESSAGE( G$_NLS.Get('FRAGRNT-0111', 'FORM','Chart of Accounts Code must be entered.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_COAS_CODE.POST_TEXT_ITEMXXX
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST_TEXT_ITEMXXX", item="FRBGRNT_COAS_CODE")
		public void frbgrntCoasCode_PostTextItemxxx()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgrntElement==null)
					return;


				if ( frbgrntElement.getFrbgrntCoasCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0111"), toStr("FORM"), toStr("Chart of Accounts Code must be entered.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_COAS_CODE.KEY-PREV-ITEM
		 
go_item('frbgrnt_sponsor_id');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_COAS_CODE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="FRBGRNT_COAS_CODE", function=KeyFunction.PREVIOUS_ITEM)
		public void frbgrntCoasCode_PreviousItem()
		{
			
				goItem(toStr("frbgrnt_sponsor_id"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_ORGN_CODE_RESP_OFFICE.POST-CHANGE
		 BEGIN
 
   G$_CHECK_QUERY_MODE ;
--
   if :from_new_item = 'N' and :key_block.display_frbgrnt_code <> :FORM_HEADER.NEXT_DOC_NUM then
     :frbgrnt_orgn_code_resp_office := :hold_orgn;
     :orgn_code_descr := :hold_desc;
     return;
   end if;
   IF :frbgrnt_ORGN_CODE_RESP_OFFICE  IS  NOT NULL  THEN
      EXECUTE_TRIGGER( 'EDIT_ORGN_CODE' ) ;
      G$_CHECK_FAILURE ;
   END IF;

   IF :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN 
   IF :frbgrnt_ORGN_CODE_RESP_OFFICE  IS  NOT NULL  THEN
      EXECUTE_TRIGGER('ENABLE_BUTTONS_AFTER_PASSW');
      G$_CHECK_FAILURE;
      <multilinecomment>EXECUTE_TRIGGER( 'EDIT_ORGN_CODE' ) ;
      G$_CHECK_FAILURE ; --1-BMV7IL</multilinecomment>
   END IF;
END IF;


--  IF :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN
--     EXECUTE_TRIGGER('ENABLE_BUTTONS_AFTER_PASSW');
--     G$_CHECK_FAILURE;
--  END IF;
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
		 * FRBGRNT_ORGN_CODE_RESP_OFFICE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_ORGN_CODE_RESP_OFFICE")
		public void frbgrntOrgnCodeRespOffice_PostChange()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

if (frbgrntElement != null) {
	

				if(frbgrntElement.getFrbgrntOrgnCodeRespOffice().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if ( getFormModel().getFormHeader().getFromNewItem().equals("N") && getFormModel().getKeyBlock().getDisplayFrbgrntCode().notEquals(getFormModel().getFormHeader().getNextDocNum()) )
					{
						frbgrntElement.setFrbgrntOrgnCodeRespOffice(getFormModel().getFormHeader().getHoldOrgn());
						frbgrntElement.setOrgnCodeDescr(getFormModel().getFormHeader().getHoldDesc());
						return ;
					}
					if ( !frbgrntElement.getFrbgrntOrgnCodeRespOffice().isNull() )
					{
						executeAction("EDIT_ORGN_CODE");
						getTask().getGoqrpls().gCheckFailure();
					}
					if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
					{
						if ( !frbgrntElement.getFrbgrntOrgnCodeRespOffice().isNull() )
						{
							executeAction("ENABLE_BUTTONS_AFTER_PASSW");
							getTask().getGoqrpls().gCheckFailure();
						}
					}
					//   IF :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN
					//      EXECUTE_TRIGGER('ENABLE_BUTTONS_AFTER_PASSW');
					//      G$_CHECK_FAILURE;
					//   END IF;
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

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_ORGN_CODE_RESP_OFFICE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVORGN_ORGN_CODE', 'FTVORGN_TITLE',
   G$_SEARCH_WHERE.F_FTVORGN_ENTRY(':FRBGRNT_COAS_CODE','SYSDATE'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_ORGN_CODE_RESP_OFFICE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRBGRNT_ORGN_CODE_RESP_OFFICE")
		public void frbgrntOrgnCodeRespOffice_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVORGN_ORGN_CODE"), toStr("FTVORGN_TITLE"), getTask().getGoqrpls().getGSearchWhere().fFtvorgnEntry(toStr(":FRBGRNT_COAS_CODE"), toStr("SYSDATE")));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_ORGN_CODE_RESP_OFFICE.KEY-LISTVAL
		 IF :frbgrnt_COAS_CODE IS NULL THEN
   GO_ITEM('frbgrnt_COAS_CODE');
   MESSAGE( G$_NLS.Get('FRAGRNT-0112', 'FORM','Chart of Accounts Code must be entered.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
--
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0113', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_ORGN_CODE_RESP_OFFICE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGRNT_ORGN_CODE_RESP_OFFICE", function=KeyFunction.LIST_VALUES)
		public void frbgrntOrgnCodeRespOffice_ListValues()
		{
	
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

if (frbgrntElement != null) {
	

				if ( frbgrntElement.getFrbgrntCoasCode().isNull() )
				{
					goItem(toStr("frbgrnt_COAS_CODE"));
					errorMessage(GNls.Fget(toStr("FRAGRNT-0112"), toStr("FORM"), toStr("Chart of Accounts Code must be entered.")));
					throw new ApplicationException();
				}
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FTVORGN"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE")  || (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0113"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_ORGN_CODE_RESP_OFFICE.WHEN-NEW-ITEM-INSTANCE
		 G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;

IF :frbgrnt_COAS_CODE IS NULL THEN
   GO_ITEM('frbgrnt_COAS_CODE');
   MESSAGE( G$_NLS.Get('FRAGRNT-0114', 'FORM','Chart of Accounts Code must be entered.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
     :hold_orgn := :frbgrnt_orgn_code_resp_office;
     :hold_desc := :orgn_code_descr;
     
IF :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN 
   IF :frbgrnt_ORGN_CODE_RESP_OFFICE  IS  NOT NULL  THEN
      EXECUTE_TRIGGER('ENABLE_BUTTONS_AFTER_PASSW');
      G$_CHECK_FAILURE;
      <multilinecomment> 1-BMV7IL
      EXECUTE_TRIGGER( 'EDIT_ORGN_CODE' ) ;
      G$_CHECK_FAILURE ;</multilinecomment>
      :from_new_item := 'Y';
      EXECUTE_TRIGGER( 'EDIT_ORGN_SEC_for_commit' ) ;
      G$_CHECK_FAILURE ;
   END IF;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_ORGN_CODE_RESP_OFFICE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_ORGN_CODE_RESP_OFFICE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntOrgnCodeRespOffice_itemChange()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

if (frbgrntElement != null) {

				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				if ( frbgrntElement.getFrbgrntCoasCode().isNull() )
				{
					goItem(toStr("frbgrnt_COAS_CODE"));
					errorMessage(GNls.Fget(toStr("FRAGRNT-0114"), toStr("FORM"), toStr("Chart of Accounts Code must be entered.")));
					throw new ApplicationException();
				}
				getFormModel().getFormHeader().setHoldOrgn(frbgrntElement.getFrbgrntOrgnCodeRespOffice());
				getFormModel().getFormHeader().setHoldDesc(frbgrntElement.getOrgnCodeDescr());
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
					if ( !frbgrntElement.getFrbgrntOrgnCodeRespOffice().isNull() )
					{
						executeAction("ENABLE_BUTTONS_AFTER_PASSW");
						getTask().getGoqrpls().gCheckFailure();
						//  1-BMV7IL
						// EXECUTE_TRIGGER( 'EDIT_ORGN_CODE' ) ;
						// G$_CHECK_FAILURE ;
						getFormModel().getFormHeader().setFromNewItem(toStr("Y"));
						executeAction("EDIT_ORGN_SEC_for_commit");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
		}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_ORGN_CODE_RESP_OFFICE.POST-TEXT-ITEM
		 :from_new_item := 'I';
IF :FRBGRNT_ORGN_CODE_RESP_OFFICE IS NOT NULL THEN  --87303
  EXECUTE_TRIGGER('EDIT_ORGN_SECURITY');
  G$_CHECK_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_ORGN_CODE_RESP_OFFICE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_ORGN_CODE_RESP_OFFICE", function=KeyFunction.ITEM_OUT)
		public void frbgrntOrgnCodeRespOffice_itemOut()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

if (frbgrntElement != null) {
	

				getFormModel().getFormHeader().setFromNewItem(toStr("I"));
				if ( !frbgrntElement.getFrbgrntOrgnCodeRespOffice().isNull() )
				{
					// 87303
					executeAction("EDIT_ORGN_SECURITY");
					getTask().getGoqrpls().gCheckFailure();
				}
}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * ORGN_CODE_DESCR.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="ORGN_CODE_DESCR", function=KeyFunction.ITEM_CHANGE)
		public void orgnCodeDescr_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_LONG_TITLE.POST-CHANGE
		 IF :CALLED_FROM_INQUIRY =1 THEN 
   RETURN;
END IF;	
if :frbgrnt_title is null then
   :frbgrnt_title := substr(:frbgrnt_long_title,1,35);
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_LONG_TITLE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_LONG_TITLE")
		public void frbgrntLongTitle_PostChange()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

if (frbgrntElement != null) {
	

				if(frbgrntElement.getFrbgrntLongTitle().isNull())
		return;
				if ( getFormModel().getFormHeader().getCalledFromInquiry().equals(1) )
				{
					return ;
				}
				if ( frbgrntElement.getFrbgrntTitle().isNull() )
				{
					frbgrntElement.setFrbgrntTitle(substring(frbgrntElement.getFrbgrntLongTitle(), toInt(1), toInt(35)));
				}
}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_EFF_CERT_REQUIRED_IND.WHEN-CHECKBOX-CHANGED
		 IF :FRBGRNT.ROWID IS NOT NULL AND :FRBGRNT_EFF_CERT_REQUIRED_IND = 'N' THEN
	 DECLARE
	   IND_VAL VARCHAR2(1);
	 BEGIN	 
	 	 IND_VAL := GET_ITEM_PROPERTY('FRBGRNT_EFF_CERT_REQUIRED_IND',DATABASE_VALUE);
	 	 IF IND_VAL = 'Y' THEN
	 	 	  MESSAGE( G$_NLS.Get('FRAGRNT-0115', 'FORM','*WARNING* Requires Effort Certification indicator will be removed from all associated funds.'));
	 	 END IF;
	 END;
END IF;	 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_EFF_CERT_REQUIRED_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="FRBGRNT_EFF_CERT_REQUIRED_IND")
		public void frbgrntEffCertRequiredInd_checkBoxChange()
		{
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgrntElement==null)
					return;


				if ( !frbgrntElement.getRowState().equals(DataRowStatus.INSERTED) && frbgrntElement.getFrbgrntEffCertRequiredInd().equals("N") )
				{
					{
						NString indVal= NString.getNull();
						indVal = toStr(getItemDataBaseValue("FRBGRNT_EFF_CERT_REQUIRED_IND"));
						if ( indVal.equals("Y") )
						{
							warningMessage(GNls.Fget(toStr("FRAGRNT-0115"), toStr("FORM"), toStr("*WARNING* Requires Effort Certification indicator will be removed from all associated funds.")));
						}
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_CODE.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="FRBGRNT_AGENCY_CODE", function=KeyFunction.ITEM_IN)
		public void frbgrntAgencyCode_itemIn()
		{
			
				getGIdClass().itemIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_AGENCY_CODE", function=KeyFunction.NEXT_ITEM)
		public void frbgrntAgencyCode_keyNexItem()
		{
			
				getGIdClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_AGENCY_CODE")
		public void frbgrntAgencyCode_PostChange()
		{
				getGIdClass().postChange();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_AGENCY_CODE.KEY-CQUERY
		 BEGIN
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0116', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_CODE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="FRBGRNT_AGENCY_CODE", function=KeyFunction.COUNT_QUERY)
		public void frbgrntAgencyCode_TotalResults()
		{
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FTIIDEN"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE")  || (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0116"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_AGENCY_CODE.KEY-LISTVAL
		 DO_KEY('COUNT_QUERY');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGRNT_AGENCY_CODE", function=KeyFunction.LIST_VALUES)
		public void frbgrntAgencyCode_ListValues()
		{
			
				executeAction("COUNT_QUERY");
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_AGENCY_CODE.WHEN-VALIDATE-ITEM
		 
IF :CALLED_FROM_INQUIRY =1 THEN
	RETURN;
END IF;	

IF :frbgrnt_AGENCY_CODE IS NULL THEN	
  :frbgrnt_AGENCY_NAME := '';
  :frbgrnt_AGENCY_PIDM := '';  
  :frbgrnt_AGENCY_TELE_SEQNO := '';  
  :frbgrnt_AGENCY_EMAIL := '';  
  :frbgrnt_AGENCY_PHONE_TYPE := '';  
  :frbgrnt_AGENCY_ADDR_SEQ_NUM := '';  
  :frbgrnt_AGENCY_ADDR_CODE := '';  
  :frbgrnt_AGENCY_CONTACT := '';  
  RETURN;
END IF;
-- does not fire from post query
IF :POST_QUERY_IND = 'Y' THEN
  RETURN;
END IF;
-- 
DECLARE
  hold_pidm   SPRIDEN.SPRIDEN_PIDM%TYPE := NULL;
  agency_pidm SPRIDEN.SPRIDEN_PIDM%TYPE := NULL;
  status      VARCHAR2(1);

  CURSOR s_pidm IS
    SELECT SPRIDEN_PIDM
    FROM   SPRIDEN
    WHERE  SPRIDEN_ID = :FRBGRNT.FRBGRNT_AGENCY_CODE;

  CURSOR VALIDATE_AGCY IS
    SELECT FTVAGCY_AGCY_CODE_PIDM 
    FROM FTVAGCY
    WHERE FTVAGCY_AGCY_CODE_PIDM = hold_pidm;
    
  CURSOR AGCY_STATUS IS					        -- CURSOR FOR FIXING 93222
    SELECT 'X' 
    FROM   FTVAGCY
    WHERE  FTVAGCY_AGCY_CODE_PIDM = hold_pidm
    AND    FTVAGCY_STATUS_IND = 'A';
BEGIN
	:FRBGRNT_AGENCY_NAME := NULL;
  OPEN s_pidm;
  FETCH s_pidm INTO hold_pidm;
  CLOSE s_pidm;

  OPEN VALIDATE_AGCY;
  FETCH VALIDATE_AGCY INTO agency_pidm;
  G$_CHECK_VALUE(VALIDATE_AGCY%NOTFOUND,
    G$_NLS.Get('FRAGRNT-0117', 'FORM', 'Agency ID is new; please create Agency using FTMAGCY.'), TRUE);
  CLOSE VALIDATE_AGCY;

  OPEN AGCY_STATUS;                    -- validate status for fixing 93222
  FETCH AGCY_STATUS INTO status;
  G$_CHECK_VALUE(AGCY_STATUS%NOTFOUND,
    G$_NLS.Get('FRAGRNT-0118', 'FORM', 'Agency is not active.'), TRUE);
  CLOSE AGCY_STATUS;

  g$_sel_spriden_id_name(hold_pidm, 'FRBGRNT_AGENCY_NAME', 'Y', :FRBGRNT.FRBGRNT_AGENCY_CODE);
  --
  <<GET_INFO>>
  :frbgrnt_agency_pidm := agency_pidm;
  -- 
  EXECUTE_TRIGGER('GET_AGCY_CODE_PRED_PIDM');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('GET_AGENCY_CONTACT');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('GET_ADDR_TYPE_SEQ_NUM');
  G$_CHECK_FAILURE;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_AGENCY_CODE")
		public void frbgrntAgencyCode_validate()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

if (frbgrntElement != null) {
	

				int rowCount = 0;
			this.frbgrntAgencyCode_PostChange();

				if ( getFormModel().getFormHeader().getCalledFromInquiry().equals(1) )
				{
					return ;
				}
				if ( frbgrntElement.getFrbgrntAgencyCode().isNull() )
				{
					frbgrntElement.setFrbgrntAgencyName(toStr(""));
					frbgrntElement.setFrbgrntAgencyPidm(toNumber(""));
					frbgrntElement.setFrbgrntAgencyTeleSeqno(toNumber(""));
					frbgrntElement.setFrbgrntAgencyEmail(toStr(""));
					frbgrntElement.setFrbgrntAgencyPhoneType(toStr(""));
					frbgrntElement.setFrbgrntAgencyAddrSeqNum(toNumber(""));
					frbgrntElement.setFrbgrntAgencyAddrCode(toStr(""));
					frbgrntElement.setFrbgrntAgencyContact(toStr(""));
					return ;
				}
				//  does not fire from post query
				if ( getFormModel().getFormHeader().getPostQueryInd().equals("Y") )
				{
					return ;
				}
				{
					NNumber holdPidm = NNumber.getNull();
					NNumber agencyPidm = NNumber.getNull();
					NString status= NString.getNull();
					String sqlsPidm = "SELECT SPRIDEN_PIDM " +
	" FROM SPRIDEN " +
	" WHERE SPRIDEN_ID = :FRBGRNT_FRBGRNT_AGENCY_CODE ";
					DataCursor sPidm = new DataCursor(sqlsPidm);
					String sqlvalidateAgcy = "SELECT FTVAGCY_AGCY_CODE_PIDM " +
	" FROM FTVAGCY " +
	" WHERE FTVAGCY_AGCY_CODE_PIDM = :P_HOLD_PIDM ";
					DataCursor validateAgcy = new DataCursor(sqlvalidateAgcy);
					String sqlagcyStatus = "SELECT 'X' " +
	" FROM FTVAGCY " +
	" WHERE FTVAGCY_AGCY_CODE_PIDM = :P_HOLD_PIDM AND FTVAGCY_STATUS_IND = 'A' ";
					DataCursor agcyStatus = new DataCursor(sqlagcyStatus);
					try {
						frbgrntElement.setFrbgrntAgencyName(toStr(null));
						//Setting query parameters
						sPidm.addParameter("FRBGRNT_FRBGRNT_AGENCY_CODE", frbgrntElement.getFrbgrntAgencyCode());
	
						sPidm.open();
						ResultSet sPidmResults = sPidm.fetchInto();
						if ( sPidmResults != null ) {
							holdPidm = sPidmResults.getNumber(0);
						}
						sPidm.close();
						
						//Setting query parameters
						validateAgcy.addParameter("P_HOLD_PIDM", holdPidm);
	
						validateAgcy.open();
						ResultSet validateAgcyResults = validateAgcy.fetchInto();
						if ( validateAgcyResults != null ) {
							agencyPidm = validateAgcyResults.getNumber(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(validateAgcy.notFound()), GNls.Fget(toStr("FRAGRNT-0117"), toStr("FORM"), toStr("Agency ID is new; please create Agency using FTMAGCY.")), toBool(NBool.True));
						validateAgcy.close();
						
						//Setting query parameters
						agcyStatus.addParameter("P_HOLD_PIDM", holdPidm);
	
						
						agcyStatus.open();
						//  validate status for fixing 93222
						ResultSet agcyStatusResults = agcyStatus.fetchInto();
						if ( agcyStatusResults != null ) {
							status = agcyStatusResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(agcyStatus.notFound()), GNls.Fget(toStr("FRAGRNT-0118"), toStr("FORM"), toStr("Agency is not active.")), toBool(NBool.True));
						agcyStatus.close();
						
						Ref<NString> pId_ref = new Ref<NString>(frbgrntElement.getFrbgrntAgencyCode());
						getTask().getGoqrpls().gSelSpridenIdName(holdPidm, toStr("FRBGRNT_AGENCY_NAME"), toStr("Y"), pId_ref);
						frbgrntElement.setFrbgrntAgencyCode(pId_ref.val);
						
						// GET_INFO:;
						frbgrntElement.setFrbgrntAgencyPidm(agencyPidm);
						//  
						executeAction("GET_AGCY_CODE_PRED_PIDM");
						getTask().getGoqrpls().gCheckFailure();
						executeAction("GET_AGENCY_CONTACT");
						getTask().getGoqrpls().gCheckFailure();
						executeAction("GET_ADDR_TYPE_SEQ_NUM");
						getTask().getGoqrpls().gCheckFailure();
					//MORPHIS FLAVOUR START
						validateItem("FRBGRNT_AGENCY_ADDR_SEQ_NUM",true);
					//MORPHIS FLAVOUR END
//						frbgrntAgencyAddrSeqNum_validate();
					} finally {
						sPidm.close();
						validateAgcy.close();
						agcyStatus.close();
					}
				}
}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_AGENCY_NAME", function=KeyFunction.NEXT_ITEM)
		public void frbgrntAgencyName_keyNexItem()
		{
			
				getGNameClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PI_ID_CODE.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="FRBGRNT_PI_ID_CODE", function=KeyFunction.ITEM_IN)
		public void frbgrntPiIdCode_itemIn()
		{
			
				getGIdClass().itemIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PI_ID_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_PI_ID_CODE", function=KeyFunction.NEXT_ITEM)
		public void frbgrntPiIdCode_keyNexItem()
		{
			
				getGIdClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PI_ID_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_PI_ID_CODE")
		public void frbgrntPiIdCode_PostChange()
		{
			
				getGIdClass().postChange();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_PI_ID_CODE.KEY-CQUERY
		 BEGIN
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
:GLOBAL.PERSONNEL_CODE:='Y';
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0119', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PI_ID_CODE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="FRBGRNT_PI_ID_CODE", function=KeyFunction.COUNT_QUERY)
		public void frbgrntPiIdCode_TotalResults()
		{
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("PERSONNEL_CODE", toStr("Y"));
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FTIIDEN"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE")  || (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0119"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_PI_ID_CODE.WHEN-VALIDATE-ITEM
		 IF :CALLED_FROM_INQUIRY =1 THEN
	RETURN;
END IF;	

IF :frbgrnt_PI_ID_CODE IS NULL THEN
  :frbgrnt_PI_ID_NAME := '';
  :frbgrnt_PI_PIDM := '';
  RETURN;
END IF;
--
IF :POST_QUERY_IND = 'Y' THEN
  RETURN;
END IF;
--
:FRBGRNT_PI_ID_NAME := NULL;
g$_sel_spriden_pidm_name(:FRBGRNT_PI_ID_CODE, 'FRBGRNT_PI_ID_NAME', 'Y', :FRBGRNT_PI_PIDM);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PI_ID_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_PI_ID_CODE")
		public void frbgrntPiIdCode_validate()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

if (frbgrntElement != null) {
	

			this.frbgrntPiIdCode_PostChange();

				if ( getFormModel().getFormHeader().getCalledFromInquiry().equals(1) )
				{
					return ;
				}
				if ( frbgrntElement.getFrbgrntPiIdCode().isNull() )
				{
					frbgrntElement.setFrbgrntPiIdName(toStr(""));
					frbgrntElement.setFrbgrntPiPidm(toNumber(""));
					return ;
				}
				// 
				if ( getFormModel().getFormHeader().getPostQueryInd().equals("Y") )
				{
					return ;
				}
				// 
				frbgrntElement.setFrbgrntPiIdName(toStr(null));
				Ref<NString> pId_ref = new Ref<NString>(frbgrntElement.getFrbgrntPiIdCode());
				Ref<NNumber> pPidm_ref = new Ref<NNumber>(frbgrntElement.getFrbgrntPiPidm());
				getTask().getGoqrpls().gSelSpridenPidmName(pId_ref, toStr("FRBGRNT_PI_ID_NAME"), toStr("Y"), pPidm_ref);
				frbgrntElement.setFrbgrntPiIdCode(pId_ref.val);
				frbgrntElement.setFrbgrntPiPidm(pPidm_ref.val);
}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_PI_ID_CODE.KEY-LISTVAL
		 DO_KEY('COUNT_QUERY');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PI_ID_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGRNT_PI_ID_CODE", function=KeyFunction.LIST_VALUES)
		public void frbgrntPiIdCode_ListValues()
		{
			
				executeAction("COUNT_QUERY");
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PI_ID_NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_PI_ID_NAME", function=KeyFunction.NEXT_ITEM)
		public void frbgrntPiIdName_keyNexItem()
		{
			
				getGNameClass().keyNexItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_PROJECT_START_DATE.WHEN-NEW-ITEM-INSTANCE
		 g$_date_when_new_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_START_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_PROJECT_START_DATE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntProjectStartDate_itemChange()
		{
			
				getTask().getGoqrpls().gDateWhenNewItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_PROJECT_START_DATE.POST-TEXT-ITEM
		 g$_date_post_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_START_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_PROJECT_START_DATE", function=KeyFunction.ITEM_OUT)
		public void frbgrntProjectStartDate_itemOut()
		{
			
				getTask().getGoqrpls().gDatePostItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_PROJECT_START_DATE.POST-CHANGE
		 g$_date_reformat('',''); g$_check_failure;
IF :HOLD_START_DATE <> :FRBGRNT_PROJECT_START_DATE THEN
  EXECUTE_TRIGGER('EDIT_PROJECT_DATES');
  g$_check_failure;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_START_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_PROJECT_START_DATE")
		public void frbgrntProjectStartDate_PostChange()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if (frbgrntElement != null) {
					if(frbgrntElement.getFrbgrntProjectStartDate().isNull())
				return;

					if ( frbgrntElement.getHoldStartDate().notEquals(frbgrntElement.getFrbgrntProjectStartDate()) )
					{
						executeAction("EDIT_PROJECT_DATES");
						getTask().getGoqrpls().gCheckFailure();
					}
				}

		}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_PROJECT_START_DATE.WHEN-VALIDATE-ITEM
		 WHAT_IS_START;
G$_CHECK_FAILURE;
--
EXECUTE_TRIGGER('EDIT_START_DATE');
G$_CHECK_FAILURE;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_START_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_PROJECT_START_DATE")
		public void frbgrntProjectStartDate_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgrntElement==null)
					return;


			this.frbgrntProjectStartDate_PostChange();

				this.getTask().getServices().whatIsStart(frbgrntElement);
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("EDIT_START_DATE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_PROJECT_START_DATE.KEY-NEXT-ITEM
		 g$_date_reformat('',''); g$_check_failure;
next_item;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_START_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_PROJECT_START_DATE", function=KeyFunction.NEXT_ITEM)
		public void frbgrntProjectStartDate_keyNexItem()
		{

				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_PROJECT_END_DATE.WHEN-NEW-ITEM-INSTANCE
		 g$_date_when_new_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_END_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_PROJECT_END_DATE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntProjectEndDate_itemChange()
		{
			
				getTask().getGoqrpls().gDateWhenNewItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_PROJECT_END_DATE.POST-TEXT-ITEM
		 g$_date_post_item; g$_check_failure;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_END_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_PROJECT_END_DATE", function=KeyFunction.ITEM_OUT)
		public void frbgrntProjectEndDate_itemOut()
		{
			
				getTask().getGoqrpls().gDatePostItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_PROJECT_END_DATE.POST-CHANGE
		 g$_date_reformat('',''); g$_check_failure;
IF :HOLD_END_DATE <> :FRBGRNT_PROJECT_END_DATE THEN
  EXECUTE_TRIGGER('EDIT_PROJECT_DATES');
  g$_check_failure;
END IF;



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_END_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_PROJECT_END_DATE")
		public void frbgrntProjectEndDate_PostChange()
		{
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if (frbgrntElement != null) {
					if(frbgrntElement.getFrbgrntProjectEndDate().isNull())
				return;

					if ( frbgrntElement.getHoldEndDate().notEquals(frbgrntElement.getFrbgrntProjectEndDate()) )
					{
						executeAction("EDIT_PROJECT_DATES");
						getTask().getGoqrpls().gCheckFailure();
					}
				}

		}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_PROJECT_END_DATE.WHEN-VALIDATE-ITEM
		 WHAT_IS_HOLD;
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_END_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_PROJECT_END_DATE")
		public void frbgrntProjectEndDate_validate()
		{

			FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
	
			if (frbgrntElement != null) {
				this.frbgrntProjectEndDate_PostChange();
			
				this.getTask().getServices().whatIsHold(frbgrntElement);
				getTask().getGoqrpls().gCheckFailure();
			}

		}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_PROJECT_END_DATE.KEY-NEXT-ITEM
		 g$_date_reformat('',''); g$_check_failure;
next_item;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROJECT_END_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_PROJECT_END_DATE", function=KeyFunction.NEXT_ITEM)
		public void frbgrntProjectEndDate_keyNexItem()
		{

				nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROP_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBGRNT_PROP_CODE")
		public void frbgrntPropCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
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
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROP_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRBGRNT_PROP_CODE")
		public void frbgrntPropCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROP_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_PROP_CODE", function=KeyFunction.NEXT_ITEM)
		public void frbgrntPropCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROP_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_PROP_CODE", function=KeyFunction.ITEM_OUT)
		public void frbgrntPropCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_PROP_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FRBPROP_CODE','FRBPROP_TITLE','');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROP_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRBGRNT_PROP_CODE")
		public void frbgrntPropCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FRBPROP_CODE"), toStr("FRBPROP_TITLE"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_PROP_CODE.KEY-LISTVAL
		 BEGIN
G$_COPY_FLD_ATTR;
:GLOBAL.FORM_WAS_CALLED := 'Y';
EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
G$_CHECK_FAILURE;
g$_secured_form_call(:global.current_user,'FRIPROP','QUERY');
:GLOBAL.FORM_WAS_CALLED := 'N';
G$_RESET_GLOBAL;
G$_CHECK_FAILURE;
IF :GLOBAL.VALUE IS NOT NULL THEN
   :FRBGRNT_PROP_CODE := :GLOBAL.VALUE;
   :GLOBAL.VALUE := '';
END IF;
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROP_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGRNT_PROP_CODE", function=KeyFunction.LIST_VALUES)
		public void frbgrntPropCode_ListValues()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

if (frbgrntElement != null) {
	getTask().getGoqrpls().gCopyFldAttr();
	setGlobal("FORM_WAS_CALLED", toStr("Y"));
	executeAction("G$_REVOKE_ACCESS");
	getTask().getGoqrpls().gCheckFailure();
	getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FRIPROP"), toStr("QUERY"));
	setGlobal("FORM_WAS_CALLED", toStr("N"));
	getTask().getGoqrpls().gResetGlobal();
	getTask().getGoqrpls().gCheckFailure();
	if ( !getGlobal("VALUE").isNull() )
	{
		frbgrntElement.setFrbgrntPropCode(getGlobal("VALUE"));
		setGlobal("VALUE", toStr(""));
	}
}

			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_PROP_CODE.WHEN-VALIDATE-ITEM
		 IF :FRBGRNT_PROP_CODE IS NULL THEN
    RETURN;
END IF;
    IF SELECT_FRBPROP_1(:FRBGRNT_PROP_CODE) THEN
        MESSAGE( G$_NLS.Get('FRAGRNT-0120', 'FORM','Proposal code is invalid; LIST is available.') );
        RAISE FORM_TRIGGER_FAILURE;
     END IF;    
--
declare
 temp_data   varchar2(9);
 cursor c1 is 
  select frbgrnt_prop_code
   from frbgrnt
     where frbgrnt_code = :FRBGRNT_PROP_CODE;
begin
 if not select_frbgrnt_1(:FRBGRNT_PROP_CODE) then
    return;
 end if;
 open c1;
   fetch c1 into temp_data;
   IF temp_data is null and 
      :FRBGRNT_PROP_CODE is not null then
       message( G$_NLS.Get('FRAGRNT-0121', 'FORM',
	'Proposal code entered is not valid for Grant %01%' 
	,  :display_frbgrnt_code));
       RAISE FORM_TRIGGER_FAILURE;
   ELSIF temp_data is not null and
         temp_data <> :FRBGRNT_PROP_CODE then
         message( G$_NLS.Get('FRAGRNT-0122', 'FORM',
	'Proposal code entered is not valid for Grant %01%' 
	,  :display_frbgrnt_code));
         RAISE FORM_TRIGGER_FAILURE;
   end if;
      
 end;
 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_PROP_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_PROP_CODE")
		public void frbgrntPropCode_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgrntElement==null)
					return;


				int rowCount = 0;
				if ( frbgrntElement.getFrbgrntPropCode().isNull() )
				{
					return ;
				}
				if ( this.getTask().getServices().selectFrbprop1(frbgrntElement.getFrbgrntPropCode()).getValue() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0120"), toStr("FORM"), toStr("Proposal code is invalid; LIST is available.")));
					throw new ApplicationException();
				}
				{
					NString tempData= NString.getNull();
					String sqlc1 = "SELECT frbgrnt_prop_code " +
	" FROM frbgrnt " +
	" WHERE frbgrnt_code = :FRBGRNT_PROP_CODE ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						if ( this.getTask().getServices().selectFrbgrnt1(frbgrntElement.getFrbgrntPropCode()).not() )
						{
							return ;
						}
						//Setting query parameters
						c1.addParameter("FRBGRNT_PROP_CODE", frbgrntElement.getFrbgrntPropCode());
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							tempData = c1Results.getStr(0);
						}
						if ( tempData.isNull() && !frbgrntElement.getFrbgrntPropCode().isNull() )
						{
							errorMessage(GNls.Fget(toStr("FRAGRNT-0121"), toStr("FORM"), toStr("Proposal code entered is not valid for Grant %01%"), getFormModel().getKeyBlock().getDisplayFrbgrntCode()));
							throw new ApplicationException();
						}
						else if ( !tempData.isNull() && tempData.notEquals(frbgrntElement.getFrbgrntPropCode()) ) {
							errorMessage(GNls.Fget(toStr("FRAGRNT-0122"), toStr("FORM"), toStr("Proposal code entered is not valid for Grant %01%"), getFormModel().getKeyBlock().getDisplayFrbgrntCode()));
							throw new ApplicationException();
						}
					} finally {
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_TERM_DATE.WHEN-NEW-ITEM-INSTANCE
		 g$_date_when_new_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_TERM_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_TERM_DATE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntTermDate_itemChange()
		{
			
				getTask().getGoqrpls().gDateWhenNewItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_TERM_DATE.POST-TEXT-ITEM
		 g$_date_post_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_TERM_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_TERM_DATE", function=KeyFunction.ITEM_OUT)
		public void frbgrntTermDate_itemOut()
		{
			
				getTask().getGoqrpls().gDatePostItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_TERM_DATE.POST-CHANGE
		 g$_date_reformat('',''); g$_check_failure;
--

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_TERM_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_TERM_DATE")
		public void frbgrntTermDate_PostChange()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

			if (frbgrntElement != null) {
				if(frbgrntElement.getFrbgrntTermDate().isNull())
			return;

			}

		}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_TERM_DATE.KEY-NEXT-ITEM
		 g$_date_reformat('',''); g$_check_failure;
next_item;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_TERM_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_TERM_DATE", function=KeyFunction.NEXT_ITEM)
		public void frbgrntTermDate_keyNexItem()
		{

				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_EXPEND_END_DATE.WHEN-NEW-ITEM-INSTANCE
		 g$_date_when_new_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_EXPEND_END_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_EXPEND_END_DATE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntExpendEndDate_itemChange()
		{
			
				getTask().getGoqrpls().gDateWhenNewItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_EXPEND_END_DATE.POST-TEXT-ITEM
		 g$_date_post_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_EXPEND_END_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_EXPEND_END_DATE", function=KeyFunction.ITEM_OUT)
		public void frbgrntExpendEndDate_itemOut()
		{
			
				getTask().getGoqrpls().gDatePostItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_EXPEND_END_DATE.POST-CHANGE
		 g$_date_reformat('',''); g$_check_failure;
--

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_EXPEND_END_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_EXPEND_END_DATE")
		public void frbgrntExpendEndDate_PostChange()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

if (frbgrntElement != null) {
	if(frbgrntElement.getFrbgrntExpendEndDate().isNull())
return;
	
}

			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_EXPEND_END_DATE.KEY-NEXT-ITEM
		 g$_date_reformat('',''); g$_check_failure;
next_item;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_EXPEND_END_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_EXPEND_END_DATE", function=KeyFunction.NEXT_ITEM)
		public void frbgrntExpendEndDate_keyNexItem()
		{

				nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBGRNT_STATUS_CODE")
		public void frbgrntStatusCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_STATUS_CODE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntStatusCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRBGRNT_STATUS_CODE")
		public void frbgrntStatusCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_STATUS_CODE", function=KeyFunction.NEXT_ITEM)
		public void frbgrntStatusCode_keyNexItem()
		{

				frbgrntStatusCode_validate();
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_STATUS_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVSDAT_SDAT_CODE_OPT_1','FTVSDAT_TITLE', 
   'WHERE FTVSDAT_SDAT_CODE_ENTITY=''FRBGRNT'''||
   ' AND FTVSDAT_SDAT_CODE_ATTR=''STATUS_CODE'''||
   ' AND FTVSDAT_EFF_DATE <= SYSDATE'||
   ' AND (FTVSDAT_NCHG_DATE IS NULL'||
   ' OR FTVSDAT_NCHG_DATE > SYSDATE)'||
   ' AND FTVSDAT_STATUS_IND=''A''');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRBGRNT_STATUS_CODE")
		public void frbgrntStatusCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVSDAT_SDAT_CODE_OPT_1"), toStr("FTVSDAT_TITLE"), toStr("WHERE FTVSDAT_SDAT_CODE_ENTITY='FRBGRNT'").append(" AND FTVSDAT_SDAT_CODE_ATTR='STATUS_CODE'").append(" AND FTVSDAT_EFF_DATE <= SYSDATE").append(" AND (FTVSDAT_NCHG_DATE IS NULL").append(" OR FTVSDAT_NCHG_DATE > SYSDATE)").append(" AND FTVSDAT_STATUS_IND='A'"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_STATUS_CODE.POST-CHANGE
		 :frbgrnt.status_descr := '';
:frbgrnt.frbgrnt_alternate_status_desc := '';
execute_trigger('get_status_desc');
g$_check_failure;
:frbgrnt.status_descr := :form_header.store_org_status_desc ||' '||
	 											 :frbgrnt.frbgrnt_alternate_status_desc;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_STATUS_CODE")
		public void frbgrntStatusCode_PostChange()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if (frbgrntElement != null) 
				{
					if(frbgrntElement.getFrbgrntStatusCode().isNull())
						return;
					frbgrntElement.setStatusDescr(toStr(""));
					frbgrntElement.setFrbgrntAlternateStatusDesc(toStr(""));
					executeAction("get_status_desc");
					getTask().getGoqrpls().gCheckFailure();
					frbgrntElement.setStatusDescr(getFormModel().getFormHeader().getStoreOrgStatusDesc().append(" ").append(frbgrntElement.getFrbgrntAlternateStatusDesc()));	
				}

		}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_STATUS_CODE.KEY-LISTVAL
		 BEGIN
G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
G$_CHECK_FAILURE;	
:GLOBAL.SDAT_COAS := '';
:GLOBAL.SDAT_ENTITY := 'FRBGRNT';
:GLOBAL.SDAT_ATTR := 'STATUS_CODE';
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0123', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGRNT_STATUS_CODE", function=KeyFunction.LIST_VALUES)
		public void frbgrntStatusCode_ListValues()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("SDAT_COAS", toStr(""));
				setGlobal("SDAT_ENTITY", toStr("FRBGRNT"));
				setGlobal("SDAT_ATTR", toStr("STATUS_CODE"));
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
						errorMessage(GNls.Fget(toStr("FRAGRNT-0123"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_STATUS_CODE.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
--

if :frbgrnt_status_code is null then
  :status_descr := '';
  return;
end if;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_STATUS_CODE", function=KeyFunction.ITEM_OUT)
		public void frbgrntStatusCode_itemOut()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

if (frbgrntElement != null) {
	getTask().getGoqrpls().getGSearch().postTextCode();
	// 
	if ( frbgrntElement.getFrbgrntStatusCode().isNull() )
	{
		frbgrntElement.setStatusDescr(toStr(""));
		return ;
	}
}

			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_STATUS_CODE.ON-ERROR
		 IF ERROR_TYPE = 'FRM' and ERROR_CODE = 40831 THEN
	MESSAGE(G$_NLS.Get('FRAGRNT-0124','FORM','Status Code cannot exceed 2 characters'));
	RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_CODE.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/

		@OnError
		public void frbgrntStatusCode_OnError(EventObject args)
		{
			
				if (  errorCode().equals(40831) )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0124"), toStr("FORM"), toStr("Status Code cannot exceed 2 characters")));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * STATUS_DESCR.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="STATUS_DESCR", function=KeyFunction.ITEM_CHANGE)
		public void statusDescr_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_PASS_THRU_IND.KEY-NEXT-ITEM
		 :frbgrnt.display_pass_thru_ind := 'N';
go_item('FRBGRNT_GRANT_TYPE');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_PASS_THRU_IND.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="DISPLAY_PASS_THRU_IND", function=KeyFunction.NEXT_ITEM)
		public void displayPassThruInd_keyNexItem()
		{
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgrntElement==null)
					return;


				frbgrntElement.setDisplayPassThruInd(toStr("N"));
				goItem(toStr("FRBGRNT_GRANT_TYPE"));
			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_PASS_THRU_IND.WHEN-CHECKBOX-CHANGED
		 IF :FRBGRNT.DISPLAY_PASS_THRU_IND = 'Y' THEN 
	DECLARE
		CURSOR C1 IS
	  	SELECT FRRAGPT_AGCY_PIDM, FRRAGPT_FEDERAL_FUND_PERCENT
		  FROM   FRRAGPT
		  WHERE  FRRAGPT_GRNT_CODE = :DISPLAY_FRBGRNT_CODE;
		
		CURSOR C2 IS
  		SELECT SPRIDEN_PIDM
			FROM   SPRIDEN S, FTVAGCY F
			WHERE  F.FTVAGCY_AGCY_CODE_PIDM = S.SPRIDEN_PIDM 
			  AND  SPRIDEN_ENTITY_IND = 'C';
			  
    lv_pidm SPRIDEN.SPRIDEN_PIDM%TYPE := NULL;			  
    lv_id   SPRIDEN.SPRIDEN_ID%TYPE := NULL;			  
  BEGIN
	  go_block ('FRRAGPT');
	  go_item('frragpt.frragpt_agcy_pidm');
	  RAISE FORM_TRIGGER_FAILURE;

    OPEN c1;
	  FETCH c1 INTO :frragpt.frragpt_agcy_pidm, :frragpt.frragpt_federal_fund_percent;
	  IF :frragpt.frragpt_agcy_pidm IS NULL THEN
		  RETURN;
	  ELSE
		  OPEN c2;
		  FETCH c2 INTO lv_pidm; 
		   --RPE# 1-19V7ZZD: All occurances of the word "Agent" changed to "Agency"
		  G$_CHECK_VALUE(c2%NOTFOUND, 
		    G$_NLS.Get('FRAGRNT-0125', 'FORM','Agency Name not Found'), TRUE);
		  g$_sel_spriden_id_name(lv_pidm, 'FRRAGPT.FRRAGPT_AGCY_NAME', 'Y', lv_id);  
	  END IF;
	  CLOSE c1;
	  CLOSE c2;
  END;	
ELSE
	execute_trigger('get_pass_thru_details');
	IF :frbgrnt.display_pass_thru_ind = 'Y' THEN
		message( G$_NLS.Get('FRAGRNT-0126', 'FORM','Pass Through Indicator Details Exist...Cannot Uncheck') );
		RAISE form_trigger_failure;
	ELSE
		:frbgrnt.display_pass_thru_ind := 'N';
		go_item('FRBGRNT_GRANT_TYPE');
	END IF;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * DISPLAY_PASS_THRU_IND.WHEN-CHECKBOX-CHANGED
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-CHECKBOX-CHANGED", item="DISPLAY_PASS_THRU_IND")
		public void displayPassThruInd_checkBoxChange()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				FrragptAdapter frragptElement = (FrragptAdapter)this.getFormModel().getFrragpt().getRowAdapter(true);
				
				if(frragptElement==null || frbgrntElement==null)
					return;


				int rowCount = 0;
				if ( frbgrntElement.getDisplayPassThruInd().equals("Y") )
				{
					{
						String sqlc1 = "SELECT FRRAGPT_AGCY_PIDM, FRRAGPT_FEDERAL_FUND_PERCENT " +
										" FROM FRRAGPT " +
										" WHERE FRRAGPT_GRNT_CODE = :DISPLAY_FRBGRNT_CODE ";
						DataCursor c1 = new DataCursor(sqlc1);
						String sqlc2 = "SELECT SPRIDEN_PIDM " +
										" FROM SPRIDEN S, FTVAGCY F " +
										" WHERE F.FTVAGCY_AGCY_CODE_PIDM = S.SPRIDEN_PIDM AND SPRIDEN_ENTITY_IND = 'C' ";
						DataCursor c2 = new DataCursor(sqlc2);
						NNumber lvPidm = NNumber.getNull();
						NString lvId = NString.getNull();

						try{
							goBlock(toStr("FRRAGPT"));
							goItem(toStr("frragpt.frragpt_agcy_pidm"));
						}
						catch(ApplicationException e)
						{
							
							throw new ApplicationException();
						} finally {
							c1.close();
							c2.close();
						}
						try {
							//Setting query parameters
							c1.addParameter("DISPLAY_FRBGRNT_CODE", getFormModel().getKeyBlock().getDisplayFrbgrntCode());
							
							c1.open();
							ResultSet c1Results = c1.fetchInto();
							if ( c1Results != null ) {
								frragptElement.setFrragptAgcyPidm(c1Results.getNumber(0));
								frragptElement.setFrragptFederalFundPercent(c1Results.getNumber(1));
							}
							if ( frragptElement.getFrragptAgcyPidm().isNull() )
							{
								return ;
							}
							else {
								c2.open();
								ResultSet c2Results = c2.fetchInto();
								if ( c2Results != null ) {
									lvPidm = c2Results.getNumber(0);
								}
								// RPE# 1-19V7ZZD: All occurances of the word "Agent" changed to "Agency"
								getTask().getGoqrpls().gCheckValue(toBool(c2.notFound()), GNls.Fget(toStr("FRAGRNT-0125"), toStr("FORM"), toStr("Agency Name not Found")), toBool(NBool.True));
								Ref<NString> pId_ref = new Ref<NString>(lvId);
								getTask().getGoqrpls().gSelSpridenIdName(lvPidm, toStr("FRRAGPT.FRRAGPT_AGCY_NAME"), toStr("Y"), pId_ref);
								lvId = pId_ref.val;
							}
						} finally {
							c1.close();
							c2.close();
						}
					}
				}
				else {
					executeAction("get_pass_thru_details");
					if ( frbgrntElement.getDisplayPassThruInd().equals("Y") )
					{
						errorMessage(GNls.Fget(toStr("FRAGRNT-0126"), toStr("FORM"), toStr("Pass Through Indicator Details Exist...Cannot Uncheck")));
						throw new ApplicationException();
					}
					else {
						frbgrntElement.setDisplayPassThruInd(toStr("N"));
						goItem(toStr("FRBGRNT_GRANT_TYPE"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_ALTERNATE_STATUS_DESC.WHEN-VALIDATE-ITEM
		 IF :frbgrnt_alternate_status_desc IS NOT NULL and :frbgrnt.frbgrnt_status_code IS NULL THEN
		message( G$_NLS.Get('FRAGRNT-0127', 'FORM','Status Code Should be Entered Before Alternate Desciption') );
		raise form_trigger_failure;
END IF;

:frbgrnt.status_descr := '';
:frbgrnt.status_descr := :form_header.store_org_status_desc ||' '||
												 :frbgrnt.frbgrnt_alternate_status_desc;
						 
												 
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_ALTERNATE_STATUS_DESC.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_ALTERNATE_STATUS_DESC")
		public void frbgrntAlternateStatusDesc_validate()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

if (frbgrntElement != null) {
	

				if ( !frbgrntElement.getFrbgrntAlternateStatusDesc().isNull() && frbgrntElement.getFrbgrntStatusCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0127"), toStr("FORM"), toStr("Status Code Should be Entered Before Alternate Desciption")));
					throw new ApplicationException();
				}
				frbgrntElement.setStatusDescr(toStr(""));
				frbgrntElement.setStatusDescr(getFormModel().getFormHeader().getStoreOrgStatusDesc().append(" ").append(frbgrntElement.getFrbgrntAlternateStatusDesc()));
}			
}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_STATUS_DATE.WHEN-NEW-ITEM-INSTANCE
		 g$_date_when_new_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_STATUS_DATE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntStatusDate_itemChange()
		{
			
				getTask().getGoqrpls().gDateWhenNewItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_STATUS_DATE.POST-TEXT-ITEM
		 g$_date_post_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_STATUS_DATE", function=KeyFunction.ITEM_OUT)
		public void frbgrntStatusDate_itemOut()
		{
			
				getTask().getGoqrpls().gDatePostItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_STATUS_DATE.POST-CHANGE
		 g$_date_reformat('',''); g$_check_failure;
declare
 cursor c1 is 
  select ftvsdat_title
   from ftvsdat
     where ftvsdat_sdat_code_entity = 'FRBGRNT'
       and ftvsdat_sdat_code_attr = 'STATUS_CODE'
       and ftvsdat_sdat_code_opt_1 = :frbgrnt_status_code
       and ftvsdat_eff_date <= :frbgrnt_status_date
       and (ftvsdat_nchg_date is null
       or ftvsdat_nchg_date > :frbgrnt_status_date)
       and ftvsdat_status_ind = 'A';
begin
 open c1;
   fetch c1 into :status_descr;
   if :frbgrnt.frbgrnt_alternate_status_desc is not null then
   		:frbgrnt.status_descr := :status_descr ||' '||:frbgrnt.frbgrnt_alternate_status_desc;
   end if;
      if c1%notfound then
         message( G$_NLS.Get('FRAGRNT-0128', 'FORM','Status is invalid. LIST is available.') );
         close c1;
         raise form_trigger_failure;
      end if;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_STATUS_DATE")
		public void frbgrntStatusDate_PostChange()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

if (frbgrntElement != null) {
	

				int rowCount = 0;
				if(frbgrntElement.getFrbgrntStatusDate().isNull())
		return;

				{
					String sqlc1 = "SELECT ftvsdat_title " +
	" FROM ftvsdat " +
	" WHERE ftvsdat_sdat_code_entity = 'FRBGRNT' AND ftvsdat_sdat_code_attr = 'STATUS_CODE' AND ftvsdat_sdat_code_opt_1 = :FRBGRNT_STATUS_CODE AND ftvsdat_eff_date <= :FRBGRNT_STATUS_DATE AND (ftvsdat_nchg_date IS NULL OR ftvsdat_nchg_date > :FRBGRNT_STATUS_DATE) AND ftvsdat_status_ind = 'A' ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("FRBGRNT_STATUS_CODE", frbgrntElement.getFrbgrntStatusCode());
						c1.addParameter("FRBGRNT_STATUS_DATE", frbgrntElement.getFrbgrntStatusDate());
	
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							frbgrntElement.setStatusDescr(c1Results.getStr(0));
						}
						if ( !frbgrntElement.getFrbgrntAlternateStatusDesc().isNull() )
						{
							frbgrntElement.setStatusDescr(frbgrntElement.getStatusDescr().append(" ").append(frbgrntElement.getFrbgrntAlternateStatusDesc()));
						}
						if ( c1.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAGRNT-0128"), toStr("FORM"), toStr("Status is invalid. LIST is available.")));
							c1.close();
							throw new ApplicationException();
						}
					} finally {
						c1.close();
					}
				}
}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_STATUS_DATE.KEY-NEXT-ITEM
		 g$_date_reformat('',''); g$_check_failure;
next_item;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_STATUS_DATE", function=KeyFunction.NEXT_ITEM)
		public void frbgrntStatusDate_keyNexItem()
		{

				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_GRNT_CODE_RELATED.POST-CHANGE
		 if :frbgrnt_grnt_code_related is null then
    :related_grnt_descr := '';
    return;
end if;
--
declare
 cursor c1 is 
  select frbgrnt_title
   from frbgrnt
     where frbgrnt_code = :frbgrnt_grnt_code_related;
begin
 open c1;
   fetch c1 into :related_grnt_descr;
         close c1;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_GRNT_CODE_RELATED.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_GRNT_CODE_RELATED")
		public void frbgrntGrntCodeRelated_PostChange()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

if (frbgrntElement != null) {
	

				int rowCount = 0;
				if(frbgrntElement.getFrbgrntGrntCodeRelated().isNull())
		return;
				if ( frbgrntElement.getFrbgrntGrntCodeRelated().isNull() )
				{
					frbgrntElement.setRelatedGrntDescr(toStr(""));
					return ;
				}
				{
					String sqlc1 = "SELECT frbgrnt_title " +
	" FROM frbgrnt " +
	" WHERE frbgrnt_code = :FRBGRNT_GRNT_CODE_RELATED ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("FRBGRNT_GRNT_CODE_RELATED", frbgrntElement.getFrbgrntGrntCodeRelated());
	
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							frbgrntElement.setRelatedGrntDescr(c1Results.getStr(0));
						}
					} finally {
						c1.close();	
					}
				}
}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_GRANT_TYPE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBGRNT_GRANT_TYPE")
		public void frbgrntGrantType_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_GRANT_TYPE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_GRANT_TYPE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntGrantType_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_GRANT_TYPE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRBGRNT_GRANT_TYPE")
		public void frbgrntGrantType_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_GRANT_TYPE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_GRANT_TYPE", function=KeyFunction.NEXT_ITEM)
		public void frbgrntGrantType_keyNexItem()
		{
			
			getGCodeClass().keyNexItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_GRANT_TYPE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_GRANT_TYPE", function=KeyFunction.ITEM_OUT)
		public void frbgrntGrantType_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_GRANT_TYPE.KEY-LISTVAL
		 BEGIN
G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
G$_CHECK_FAILURE;	
:GLOBAL.SDAT_COAS := '';
:GLOBAL.SDAT_ENTITY := 'FRBGRNT';
:GLOBAL.SDAT_ATTR := 'GRANT_TYPE';
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0129', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_GRANT_TYPE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGRNT_GRANT_TYPE", function=KeyFunction.LIST_VALUES)
		public void frbgrntGrantType_ListValues()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("SDAT_COAS", toStr(""));
				setGlobal("SDAT_ENTITY", toStr("FRBGRNT"));
				setGlobal("SDAT_ATTR", toStr("GRANT_TYPE"));
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
						errorMessage(GNls.Fget(toStr("FRAGRNT-0129"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_GRANT_TYPE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVSDAT_SDAT_CODE_OPT_1','FTVSDAT_TITLE',
    'WHERE FTVSDAT_SDAT_CODE_ENTITY=''FRBGRNT'''||
   ' AND FTVSDAT_SDAT_CODE_ATTR=''GRANT_TYPE'''||
   ' AND FTVSDAT_EFF_DATE <= SYSDATE'||
   ' AND (FTVSDAT_NCHG_DATE IS NULL'||
   ' OR FTVSDAT_NCHG_DATE > SYSDATE)'||
   ' AND FTVSDAT_STATUS_IND=''A''');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_GRANT_TYPE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRBGRNT_GRANT_TYPE")
		public void frbgrntGrantType_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVSDAT_SDAT_CODE_OPT_1"), toStr("FTVSDAT_TITLE"), toStr("WHERE FTVSDAT_SDAT_CODE_ENTITY='FRBGRNT'").append(" AND FTVSDAT_SDAT_CODE_ATTR='GRANT_TYPE'").append(" AND FTVSDAT_EFF_DATE <= SYSDATE").append(" AND (FTVSDAT_NCHG_DATE IS NULL").append(" OR FTVSDAT_NCHG_DATE > SYSDATE)").append(" AND FTVSDAT_STATUS_IND='A'"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_GRANT_TYPE.WHEN-VALIDATE-ITEM
		 if :frbgrnt_grant_type is null then
   return;
end if;
-- 
declare
 cursor c1 is 
  select ftvsdat_title
   from ftvsdat
     where ftvsdat_sdat_code_entity = 'FRBGRNT'
       and ftvsdat_sdat_code_attr = 'GRANT_TYPE'
       and ftvsdat_sdat_code_opt_1 = :frbgrnt_grant_type
       and ftvsdat_eff_date <= sysdate
       and (ftvsdat_nchg_date is null
       or ftvsdat_nchg_date > sysdate)
       and ftvsdat_status_ind = 'A';    
begin
 open c1;
   fetch c1 into :frbgrnt_grant_desc;
      if c1%notfound then
         message( G$_NLS.Get('FRAGRNT-0130', 'FORM','Grant Type Code is invalid. LIST is available.') );
         close c1;
         raise form_trigger_failure;
      end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_GRANT_TYPE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_GRANT_TYPE")
		public void frbgrntGrantType_validate()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

if (frbgrntElement != null) {
	

				int rowCount = 0;
				if ( frbgrntElement.getFrbgrntGrantType().isNull() )
				{
					return ;
				}
				{
					String sqlc1 = "SELECT ftvsdat_title " +
									" FROM ftvsdat " +
									" WHERE ftvsdat_sdat_code_entity = 'FRBGRNT' AND ftvsdat_sdat_code_attr = 'GRANT_TYPE' AND ftvsdat_sdat_code_opt_1 = :FRBGRNT_GRANT_TYPE AND ftvsdat_eff_date <= sysdate AND (ftvsdat_nchg_date IS NULL OR ftvsdat_nchg_date > sysdate) AND ftvsdat_status_ind = 'A' ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("FRBGRNT_GRANT_TYPE", frbgrntElement.getFrbgrntGrantType());
	
	
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							frbgrntElement.setFrbgrntGrantDesc(c1Results.getStr(0));
						}
						if ( c1.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAGRNT-0130"), toStr("FORM"), toStr("Grant Type Code is invalid. LIST is available.")));
							c1.close();
							throw new ApplicationException();
						}
					} finally {
						c1.close();
					}
				}
}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_GRANT_TYPE.ON-ERROR
		 IF ERROR_TYPE = 'FRM' and ERROR_CODE = 40831 THEN
	MESSAGE(G$_NLS.Get('FRAGRNT-0131','FORM','Grant type cannot exceed 2 characters'));
	RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_GRANT_TYPE.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/

		//@OnError
		@ActionTrigger(action="ON_ERROR")
		public void frbgrntGrantType_OnError(Exception args)
		{
			
				if (  errorCode().equals(40831) )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0131"), toStr("FORM"), toStr("Grant type cannot exceed 2 characters")));
					throw new ApplicationException();
				}
				throw new ApplicationException(args);
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_GRANT_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_GRANT_DESC", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntGrantDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CATEGORY.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBGRNT_CATEGORY")
		public void frbgrntCategory_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CATEGORY.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_CATEGORY", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntCategory_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CATEGORY.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRBGRNT_CATEGORY")
		public void frbgrntCategory_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CATEGORY.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_CATEGORY", function=KeyFunction.NEXT_ITEM)
		public void frbgrntCategory_keyNexItem()
		{
			getGCodeClass().keyNexItem();
			
			frbgrntCategory_validate();
			nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CATEGORY.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_CATEGORY", function=KeyFunction.ITEM_OUT)
		public void frbgrntCategory_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_CATEGORY.KEY-LISTVAL
		 BEGIN
G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
G$_CHECK_FAILURE;	
:GLOBAL.SDAT_COAS := '';
:GLOBAL.SDAT_ENTITY := 'FRBGRNT';
:GLOBAL.SDAT_ATTR := 'CATEGORY';
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0132', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CATEGORY.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGRNT_CATEGORY", function=KeyFunction.LIST_VALUES)
		public void frbgrntCategory_ListValues()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("SDAT_COAS", toStr(""));
				setGlobal("SDAT_ENTITY", toStr("FRBGRNT"));
				setGlobal("SDAT_ATTR", toStr("CATEGORY"));
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
						errorMessage(GNls.Fget(toStr("FRAGRNT-0132"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_CATEGORY.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVSDAT_SDAT_CODE_OPT_1','FTVSDAT_TITLE',
    'WHERE FTVSDAT_SDAT_CODE_ENTITY=''FRBGRNT'''||
   ' AND FTVSDAT_SDAT_CODE_ATTR=''CATEGORY'''||
   ' AND FTVSDAT_EFF_DATE <= SYSDATE'||
   ' AND (FTVSDAT_NCHG_DATE IS NULL'||
   ' OR FTVSDAT_NCHG_DATE > SYSDATE)'||
   ' AND FTVSDAT_STATUS_IND=''A''');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CATEGORY.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRBGRNT_CATEGORY")
		public void frbgrntCategory_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVSDAT_SDAT_CODE_OPT_1"), toStr("FTVSDAT_TITLE"), toStr("WHERE FTVSDAT_SDAT_CODE_ENTITY='FRBGRNT'").append(" AND FTVSDAT_SDAT_CODE_ATTR='CATEGORY'").append(" AND FTVSDAT_EFF_DATE <= SYSDATE").append(" AND (FTVSDAT_NCHG_DATE IS NULL").append(" OR FTVSDAT_NCHG_DATE > SYSDATE)").append(" AND FTVSDAT_STATUS_IND='A'"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_CATEGORY.WHEN-VALIDATE-ITEM
		 if :frbgrnt_category is null then
    return;
end if;
--   
declare
 cursor c1 is 
  select ftvsdat_title
   from ftvsdat
     where ftvsdat_sdat_code_entity = 'FRBGRNT'
       and ftvsdat_sdat_code_attr = 'CATEGORY'
       and ftvsdat_sdat_code_opt_1 = :frbgrnt_category
       and ftvsdat_eff_date <= sysdate
       and (ftvsdat_nchg_date is null
       or ftvsdat_nchg_date > sysdate)
       and ftvsdat_status_ind = 'A';
begin
 open c1;
   fetch c1 into :frbgrnt_category_desc;
      if c1%notfound then
         message( G$_NLS.Get('FRAGRNT-0133', 'FORM','Category Code is invalid. LIST is available.') );
         close c1;
         raise form_trigger_failure;
      end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CATEGORY.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_CATEGORY")
		public void frbgrntCategory_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if(frbgrntElement==null)
					return;

				int rowCount = 0;
				if ( frbgrntElement.getFrbgrntCategory().isNull() )
				{
					return ;
				}
				{
					String sqlc1 = "SELECT ftvsdat_title " +
	" FROM ftvsdat " +
	" WHERE ftvsdat_sdat_code_entity = 'FRBGRNT' AND ftvsdat_sdat_code_attr = 'CATEGORY' AND ftvsdat_sdat_code_opt_1 = :FRBGRNT_CATEGORY AND ftvsdat_eff_date <= sysdate AND (ftvsdat_nchg_date IS NULL OR ftvsdat_nchg_date > sysdate) AND ftvsdat_status_ind = 'A' ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("FRBGRNT_CATEGORY", frbgrntElement.getFrbgrntCategory());
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							frbgrntElement.setFrbgrntCategoryDesc(c1Results.getStr(0));
						}
						if ( c1.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAGRNT-0133"), toStr("FORM"), toStr("Category Code is invalid. LIST is available.")));
							throw new ApplicationException();
						}
					} finally {
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_CATEGORY.ON-ERROR
		 IF ERROR_TYPE = 'FRM' and ERROR_CODE = 40831 THEN
	MESSAGE(G$_NLS.Get('FRAGRNT-0134','FORM','Category cannot exceed 1 character'));
	RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CATEGORY.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/

		@OnError
		public void frbgrntCategory_OnError(EventObject args)
		{
			
				if (  errorCode().equals(40831) )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0134"), toStr("FORM"), toStr("Category cannot exceed 1 character")));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CATEGORY_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_CATEGORY_DESC", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntCategoryDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_SUB_CATEGORY.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBGRNT_SUB_CATEGORY")
		public void frbgrntSubCategory_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_SUB_CATEGORY.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_SUB_CATEGORY", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntSubCategory_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_SUB_CATEGORY.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRBGRNT_SUB_CATEGORY")
		public void frbgrntSubCategory_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_SUB_CATEGORY.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_SUB_CATEGORY", function=KeyFunction.NEXT_ITEM)
		public void frbgrntSubCategory_keyNexItem()
		{
			frbgrntSubCategory_validate();
			nextItem();
		}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_SUB_CATEGORY.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_SUB_CATEGORY", function=KeyFunction.ITEM_OUT)
		public void frbgrntSubCategory_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_SUB_CATEGORY.WHEN-VALIDATE-ITEM
		 if :frbgrnt_sub_category is null then
    return;
end if;
--
declare
 cursor c1 is 
  select ftvsdat_title
   from ftvsdat
     where ftvsdat_sdat_code_entity = 'FRBGRNT'
       and ftvsdat_sdat_code_attr = 'SUB_CATEGORY'
       and ftvsdat_sdat_code_opt_1 = :frbgrnt_sub_category
       and ftvsdat_eff_date <= sysdate
       and (ftvsdat_nchg_date is null
       or ftvsdat_nchg_date > sysdate)
       and ftvsdat_status_ind = 'A';
begin
 open c1;
   fetch c1 into :frbgrnt_sub_cat_desc;
      if c1%notfound then
         message( G$_NLS.Get('FRAGRNT-0135', 'FORM','Sub Category Code is invalid. LIST is available.') );
         close c1;
         raise form_trigger_failure;
      end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_SUB_CATEGORY.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_SUB_CATEGORY")
		public void frbgrntSubCategory_validate()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if (frbgrntElement != null) {
					int rowCount = 0;
					if ( frbgrntElement.getFrbgrntSubCategory().isNull() )
					{
						return ;
					}
					{
						String sqlc1 = "SELECT ftvsdat_title " +
		" FROM ftvsdat " +
		" WHERE ftvsdat_sdat_code_entity = 'FRBGRNT' AND ftvsdat_sdat_code_attr = 'SUB_CATEGORY' AND ftvsdat_sdat_code_opt_1 = :FRBGRNT_SUB_CATEGORY AND ftvsdat_eff_date <= sysdate AND (ftvsdat_nchg_date IS NULL OR ftvsdat_nchg_date > sysdate) AND ftvsdat_status_ind = 'A' ";
						DataCursor c1 = new DataCursor(sqlc1);
						try {
							//Setting query parameters
							c1.addParameter("FRBGRNT_SUB_CATEGORY", frbgrntElement.getFrbgrntSubCategory());
							
							c1.open();
							ResultSet c1Results = c1.fetchInto();
							if ( c1Results != null ) {
								frbgrntElement.setFrbgrntSubCatDesc(c1Results.getStr(0));
							}
							if ( c1.notFound() )
							{
								findItem("FRBGRNT_SUB_CATEGORY").setValid(false);
								frbgrntElement.setFrbgrntSubCatDesc(toStr(""));
								errorMessage(GNls.Fget(toStr("FRAGRNT-0135"), toStr("FORM"), toStr("Sub Category Code is invalid. LIST is available.")));
								c1.close();
								throw new ApplicationException();
							}
						} finally {
							c1.close();
						}
					}
				}

			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_SUB_CATEGORY.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVSDAT_SDAT_CODE_OPT_1','FTVSDAT_TITLE',
    'WHERE FTVSDAT_SDAT_CODE_ENTITY=''FRBGRNT'''||
   ' AND FTVSDAT_SDAT_CODE_ATTR=''SUB_CATEGORY'''||
   ' AND FTVSDAT_EFF_DATE <= SYSDATE'||
   ' AND (FTVSDAT_NCHG_DATE IS NULL'||
   ' OR FTVSDAT_NCHG_DATE > SYSDATE)'||
   ' AND FTVSDAT_STATUS_IND=''A''');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_SUB_CATEGORY.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRBGRNT_SUB_CATEGORY")
		public void frbgrntSubCategory_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVSDAT_SDAT_CODE_OPT_1"), toStr("FTVSDAT_TITLE"), toStr("WHERE FTVSDAT_SDAT_CODE_ENTITY='FRBGRNT'").append(" AND FTVSDAT_SDAT_CODE_ATTR='SUB_CATEGORY'").append(" AND FTVSDAT_EFF_DATE <= SYSDATE").append(" AND (FTVSDAT_NCHG_DATE IS NULL").append(" OR FTVSDAT_NCHG_DATE > SYSDATE)").append(" AND FTVSDAT_STATUS_IND='A'"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_SUB_CATEGORY.KEY-LISTVAL
		 BEGIN
G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
G$_CHECK_FAILURE;	
:GLOBAL.SDAT_COAS := '';
:GLOBAL.SDAT_ENTITY := 'FRBGRNT';
:GLOBAL.SDAT_ATTR := 'SUB_CATEGORY';
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0136', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_SUB_CATEGORY.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGRNT_SUB_CATEGORY", function=KeyFunction.LIST_VALUES)
		public void frbgrntSubCategory_ListValues()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("SDAT_COAS", toStr(""));
				setGlobal("SDAT_ENTITY", toStr("FRBGRNT"));
				setGlobal("SDAT_ATTR", toStr("SUB_CATEGORY"));
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
						errorMessage(GNls.Fget(toStr("FRAGRNT-0136"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_SUB_CATEGORY.ON-ERROR
		 IF ERROR_TYPE = 'FRM' and ERROR_CODE = 40831 THEN
	MESSAGE(G$_NLS.Get('FRAGRNT-0137','FORM','Sub Category cannot exceed 4 characters'));
	RAISE FORM_TRIGGER_FAILURE;
END IF;




		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_SUB_CATEGORY.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/

		@OnError
		public void frbgrntSubCategory_OnError(EventObject args)
		{
			
				if (  errorCode().equals(40831) )
				{
					errorMessage(GNls.Fget(toStr("FRAGRNT-0137"), toStr("FORM"), toStr("Sub Category cannot exceed 4 characters")));
					throw new ApplicationException();
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_SUB_CAT_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_SUB_CAT_DESC", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntSubCatDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CFDA_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBGRNT_CFDA_CODE")
		public void frbgrntCfdaCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CFDA_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_CFDA_CODE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntCfdaCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CFDA_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRBGRNT_CFDA_CODE")
		public void frbgrntCfdaCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CFDA_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_CFDA_CODE", function=KeyFunction.NEXT_ITEM)
		public void frbgrntCfdaCode_keyNexItem()
		{
			
				//*
				frbgrntCfdaCode_validate();
				getGCodeClass().keyNexItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CFDA_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_CFDA_CODE", function=KeyFunction.ITEM_OUT)
		public void frbgrntCfdaCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_CFDA_CODE.KEY-LISTVAL
		 BEGIN
	G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
  G$_CHECK_FAILURE;
      EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
      G$_CHECK_FAILURE;
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER, 'FRVCFDA', 'QUERY');
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
       MESSAGE( G$_NLS.Get('FRAGRNT-0138', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CFDA_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGRNT_CFDA_CODE", function=KeyFunction.LIST_VALUES)
		public void frbgrntCfdaCode_ListValues()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER"), toStr("FRVCFDA"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE")  || (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0138"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_CFDA_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FRVCFDA_CFDA_CODE','FRVCFDA_TITLE','WHERE FRVCFDA_STATUS = ''A''');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CFDA_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRBGRNT_CFDA_CODE")
		public void frbgrntCfdaCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FRVCFDA_CFDA_CODE"), toStr("FRVCFDA_TITLE"), toStr("WHERE FRVCFDA_STATUS = 'A'"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_CFDA_CODE.WHEN-VALIDATE-ITEM
		 --defect  56141 Begins
--if :frbgrnt_cfda_code is null then
--   return;
--end if;
--defect  56141 Begins

declare
 hold_cfda_int_id   frbgrnt.frbgrnt_cfda_internal_id_no%type; 
 cursor c1 is 
  select distinct frvcfda_internal_id_no
   from frvcfda
     where frvcfda_cfda_code = :frbgrnt_cfda_code
       and frvcfda_status = 'A';
begin
 --defect  56141 Begins
 If :frbgrnt_cfda_code IS NOT NULL THEN
   open c1;
   fetch c1 into hold_cfda_int_id;
   if c1%notfound then
      message(
           G$_NLS.Get('FRAGRNT-0139', 'FORM','Category of Federal Domestic Assistance Number is invalid. LIST is available.') );
         close c1;
         raise form_trigger_failure;
    else
         :frbgrnt_cfda_internal_id_no := hold_cfda_int_id;
    end if;
  else
   	:frbgrnt_cfda_internal_id_no :=NULL;
  END IF;
--defect  56141 Ends
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CFDA_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_CFDA_CODE")
		public void frbgrntCfdaCode_validate()
		{
			
				// defect  56141 Begins
				// if :frbgrnt_cfda_code is null then
				//    return;
				// end if;
				// defect  56141 Begins

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgrntElement==null)
					return;

				//int rowCount = 0;
				{
					NNumber holdCfdaIntId= NNumber.getNull();
					String sqlc1 = "SELECT DISTINCT frvcfda_internal_id_no " +
	" FROM frvcfda " +
	" WHERE frvcfda_cfda_code = :FRBGRNT_CFDA_CODE AND frvcfda_status = 'A' ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						// defect  56141 Begins
						if ( !frbgrntElement.getFrbgrntCfdaCode().isNull() )
						{
							//Setting query parameters
							c1.addParameter("FRBGRNT_CFDA_CODE", frbgrntElement.getFrbgrntCfdaCode());
							c1.open();
							ResultSet c1Results = c1.fetchInto();
							if ( c1Results != null ) {
								holdCfdaIntId = c1Results.getNumber(0);
							}
							if ( c1.notFound() )
							{	
								findItem("FRBGRNT_CFDA_CODE").setValid(false);
								errorMessage(GNls.Fget(toStr("FRAGRNT-0139"), toStr("FORM"), toStr("Category of Federal Domestic Assistance Number is invalid. LIST is available.")));
								throw new ApplicationException();
							}
							else {
								frbgrntElement.setFrbgrntCfdaInternalIdNo(holdCfdaIntId);
							}
						}
						else {
							frbgrntElement.setFrbgrntCfdaInternalIdNo(toNumber(null));
						}
					} finally {
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_SPONSOR_ID.KEY-NEXT-ITEM
		 go_item('frbgrnt_coas_code');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_SPONSOR_ID.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_SPONSOR_ID", function=KeyFunction.NEXT_ITEM)
		public void frbgrntSponsorId_keyNexItem()
		{
			
				goItem(toStr("frbgrnt_coas_code"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_AGENCY_CONTACT.KEY-PREV-ITEM
		 go_item('frbgrnt_AGENCY_ADDR_SEQ_NUM');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_CONTACT.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="FRBGRNT_AGENCY_CONTACT", function=KeyFunction.PREVIOUS_ITEM)
		public void frbgrntAgencyContact_PreviousItem()
		{
			
				goItem(toStr("frbgrnt_AGENCY_ADDR_SEQ_NUM"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_AGENCY_ADDR_CODE.KEY-LISTVAL
		 <multilinecomment> 1-3OW3C6 </multilinecomment>
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
      :frbgrnt_AGENCY_ADDR_SEQ_NUM := :GLOBAL.SEQNO;
   END IF; 
--
   IF :GLOBAL.ATYP_CODE IS NOT NULL THEN   	  
      :frbgrnt_AGENCY_ADDR_CODE  := :GLOBAL.ATYP_CODE ;     
      GO_ITEM('FRBGRNT_AGENCY_ADDR_SEQ_NUM');
      GO_ITEM('frbgrnt_AGENCY_CONTACT'); 
   END IF;
END;



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_ADDR_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGRNT_AGENCY_ADDR_CODE", function=KeyFunction.LIST_VALUES)
		public void frbgrntAgencyAddrCode_ListValues()
		{
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if (frbgrntElement != null) {
	
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
						frbgrntElement.setFrbgrntAgencyAddrSeqNum(toNumber(getGlobal("SEQNO")));
					}
					// 
					if ( !getGlobal("ATYP_CODE").isNull() )
					{
						frbgrntElement.setFrbgrntAgencyAddrCode(getGlobal("ATYP_CODE"));
						this.frbgrntAgencyAddrCode_PostChange();
						goItem(toStr("FRBGRNT_AGENCY_ADDR_SEQ_NUM"));
						this.frbgrntAgencyAddrSeqNum_PostChange();
						goItem(toStr("frbgrnt_AGENCY_CONTACT"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_AGENCY_ADDR_CODE.POST-TEXT-ITEM
		    IF :frbgrnt_AGENCY_ADDR_CODE IS NULL  THEN
   	   IF :CALLED_FROM_INQUIRY <>1 THEN 
         EXECUTE_TRIGGER( 'CLR_ATYP' ) ;
         G$_CHECK_FAILURE ;
   	   END IF;
   	   
       EXECUTE_TRIGGER( 'CLR_ADDR' ) ;
       G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_ADDR_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_AGENCY_ADDR_CODE", function=KeyFunction.ITEM_OUT)
		public void frbgrntAgencyAddrCode_itemOut()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if (frbgrntElement != null) {
					
				
					if ( frbgrntElement.getFrbgrntAgencyAddrCode().isNull() )
					{
						if ( getFormModel().getFormHeader().getCalledFromInquiry().notEquals(1) )
						{
							executeAction("CLR_ATYP");
							getTask().getGoqrpls().gCheckFailure();
						}
						executeAction("CLR_ADDR");
						getTask().getGoqrpls().gCheckFailure();
					}
								
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_AGENCY_ADDR_CODE.POST-CHANGE
		 
BEGIN
   IF :CALLED_FROM_INQUIRY =1 THEN 
      RETURN;
   END IF;	
   
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
         WHERE  STVATYP_CODE = :frbgrnt_AGENCY_ADDR_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
          G$_NLS.Get('FRAGRNT-0140', 'FORM','Address type code is invalid') , TRUE);
   END ;
--

	<multilinecomment>change start for 1-3V2XSE</multilinecomment>
    DECLARE
      PTI_INTO_TEMP        VARCHAR2(255);
      CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   SPRADDR
         WHERE  SPRADDR_PIDM = :FRBGRNT.FRBGRNT_AGENCY_PIDM 
    	     AND  SPRADDR_ATYP_CODE = :FRBGRNT.FRBGRNT_AGENCY_ADDR_CODE
	         --AND  SPRADDR_SEQNO = :FRBGRNT.FRBGRNT_AGENCY_ADDR_SEQ_NUM    <multilinecomment>1-3V2XSE: it's stopping to fetch the available addtress</multilinecomment>
           AND NVL(SPRADDR_STATUS_IND,'X') != 'I';	  <multilinecomment>Added this line to fix the defect: 1-3V2XSE changed SPRADDR_STATUS_IND = 'A' to NVL(SPRADDR_STATUS_IND,'A') != 'I' because it wasn't fetching for SPRADDR_STATUS_IND is null</multilinecomment>                

    BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE(PTI_CURSOR%NOTFOUND,
        G$_NLS.Get('FRAGRNT-0141', 'FORM','*ERROR* The Address Type and Sequence Number combination is invalid or inactive') ,TRUE);
    END ;
 	<multilinecomment>change end for 1-3V2XSE </multilinecomment>

--
   << PTI_STEP_001 >>
   IF :frbgrnt_AGENCY_ADDR_SEQ_NUM IS NOT NULL  THEN
      :frbgrnt_AGENCY_ADDR_SEQ_NUM := :frbgrnt_AGENCY_ADDR_SEQ_NUM; <multilinecomment> 1-3V2XSE </multilinecomment>       
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
		 * FRBGRNT_AGENCY_ADDR_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_AGENCY_ADDR_CODE")
		public void frbgrntAgencyAddrCode_PostChange()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

if (frbgrntElement != null) {
	

	int rowCount = 0;
	if(frbgrntElement.getFrbgrntAgencyAddrCode().isNull())
return;
	try
	{
		if ( getFormModel().getFormHeader().getCalledFromInquiry().equals(1) )
		{
			return ;
		}
		getTask().getGoqrpls().gCheckQueryMode();
		// 
		if (!(getGlobal("QUERY_MODE").equals("1")))
		{
//			 goto PTI_STEP_001;
		
//		}
		{
			NString ptiIntoTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
									" FROM STVATYP " +
									" WHERE STVATYP_CODE = :FRBGRNT_AGENCY_ADDR_CODE ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				ptiCursor.addParameter("FRBGRNT_AGENCY_ADDR_CODE", frbgrntElement.getFrbgrntAgencyAddrCode());
				
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAGRNT-0140"), toStr("FORM"), toStr("Address type code is invalid")), toBool(NBool.True));
			} finally {
				ptiCursor.close();
			}

		}
		{
			NString ptiIntoTemp= NString.getNull();
			String sqlptiCursor = "SELECT 'X' " +
								 " FROM SPRADDR " +
								 " WHERE SPRADDR_PIDM = :FRBGRNT_FRBGRNT_AGENCY_PIDM AND SPRADDR_ATYP_CODE = :FRBGRNT_FRBGRNT_AGENCY_ADDR_CODE AND NVL(SPRADDR_STATUS_IND, 'X') != 'I' ";
			DataCursor ptiCursor = new DataCursor(sqlptiCursor);
			try {
				//Setting query parameters
				ptiCursor.addParameter("FRBGRNT_FRBGRNT_AGENCY_PIDM", frbgrntElement.getFrbgrntAgencyPidm());
				ptiCursor.addParameter("FRBGRNT_FRBGRNT_AGENCY_ADDR_CODE", frbgrntElement.getFrbgrntAgencyAddrCode());
				
	
				ptiCursor.open();
				ResultSet ptiCursorResults = ptiCursor.fetchInto();
				if ( ptiCursorResults != null ) {
					ptiIntoTemp = ptiCursorResults.getStr(0);
				}
				getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAGRNT-0141"), toStr("FORM"), toStr("*ERROR* The Address Type and Sequence Number combination is invalid or inactive")), toBool(NBool.True));
			} finally {
				ptiCursor.close();
			}

		}
		}
//		 PTI_STEP_001:;
		if ( !frbgrntElement.getFrbgrntAgencyAddrSeqNum().isNull() )
		{
			frbgrntElement.setFrbgrntAgencyAddrSeqNum(frbgrntElement.getFrbgrntAgencyAddrSeqNum());
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

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_AGENCY_ADDR_SEQ_NUM.KEY-NEXT-ITEM
		 --GO_ITEM('frbgrnt_AGENCY_CONTACT');
next_item;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_ADDR_SEQ_NUM.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_AGENCY_ADDR_SEQ_NUM", function=KeyFunction.NEXT_ITEM)
		public void frbgrntAgencyAddrSeqNum_keyNexItem()
		{
			
				// GO_ITEM('frbgrnt_AGENCY_CONTACT');
				// GO_ITEM('frbgrnt_AGENCY_CONTACT');
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_AGENCY_ADDR_SEQ_NUM.KEY-LISTVAL
		 
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
      :frbgrnt_AGENCY_ADDR_SEQ_NUM := :GLOBAL.SEQNO;
   END IF; 
--
   IF :GLOBAL.ATYP_CODE IS NOT NULL THEN   	  
      :frbgrnt_AGENCY_ADDR_CODE  := :GLOBAL.ATYP_CODE ;
      GO_ITEM('frbgrnt_AGENCY_CONTACT'); 
   END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_ADDR_SEQ_NUM.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGRNT_AGENCY_ADDR_SEQ_NUM", function=KeyFunction.LIST_VALUES)
		public void frbgrntAgencyAddrSeqNum_ListValues()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if(frbgrntElement==null)
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
					frbgrntElement.setFrbgrntAgencyAddrSeqNum(toNumber(getGlobal("SEQNO")));
				}
				// 
				if ( !getGlobal("ATYP_CODE").isNull() )
				{
					frbgrntElement.setFrbgrntAgencyAddrCode(getGlobal("ATYP_CODE"));
					goItem(toStr("frbgrnt_AGENCY_CONTACT"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_AGENCY_ADDR_SEQ_NUM.POST-TEXT-ITEM
		    IF :frbgrnt_AGENCY_ADDR_SEQ_NUM IS NULL  THEN
   	  IF :CALLED_FROM_INQUIRY <>1 THEN 
         EXECUTE_TRIGGER( 'CLR_ATYP' ) ;
         G$_CHECK_FAILURE ;
      END IF;
      EXECUTE_TRIGGER( 'CLR_ADDR' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_ADDR_SEQ_NUM.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_AGENCY_ADDR_SEQ_NUM", function=KeyFunction.ITEM_OUT)
		public void frbgrntAgencyAddrSeqNum_itemOut()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgrntElement==null)
					return;

				if ( frbgrntElement.getFrbgrntAgencyAddrSeqNum().isNull() )
				{
					if ( getFormModel().getFormHeader().getCalledFromInquiry().notEquals(1) )
					{
						executeAction("CLR_ATYP");
						getTask().getGoqrpls().gCheckFailure();
					}
					executeAction("CLR_ADDR");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_AGENCY_ADDR_SEQ_NUM.POST-CHANGE
		 
BEGIN
   G$_CHECK_QUERY_MODE ;
  IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_STEP_001 ;
     END IF;
--
   << PTI_STEP_001 >>
   EXECUTE_TRIGGER( 'CLR_ADDR' ) ;
   G$_CHECK_FAILURE ;
   EXECUTE_TRIGGER( 'EDIT_SPRADDR' ) ;
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
		 * FRBGRNT_AGENCY_ADDR_SEQ_NUM.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_AGENCY_ADDR_SEQ_NUM")
		public void frbgrntAgencyAddrSeqNum_PostChange()
		{
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgrntElement==null)
					return;


				if(frbgrntElement.getFrbgrntAgencyAddrSeqNum().isNull())
						return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
//					if ((getGlobal("QUERY_MODE").equals("1")))
//					{
//						 goto PTI_STEP_001;
//					}
//					 PTI_STEP_001:;
					executeAction("CLR_ADDR");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("EDIT_SPRADDR");
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

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_AGENCY_PHONE_TYPE.WHEN-VALIDATE-ITEM
		 --87631
if :frbgrnt_agency_phone_type is null then
	 return;
end if;

DECLARE
   holder       VARCHAR2(1);
   CURSOR tele_c IS
   SELECT 'X'
   FROM   SPRTELE
   WHERE  SPRTELE_TELE_CODE = :frbgrnt_agency_phone_type
   AND    SPRTELE_PIDM = :frbgrnt_agency_pidm
   AND    NVL(SPRTELE_STATUS_IND, 'A') <> 'I' ;
BEGIN
   OPEN tele_c ;
   FETCH tele_c INTO holder ;
   G$_CHECK_VALUE (tele_c%NOTFOUND,
          G$_NLS.Get('FRAGRNT-0142', 'FORM','Phone type is invalid; Use LIST.') , TRUE);
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_PHONE_TYPE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_AGENCY_PHONE_TYPE")
		public void frbgrntAgencyPhoneType_validate()
		{
			
				// 87631
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgrntElement==null)
					return;


				//int rowCount = 0;
				// 87631
				if ( frbgrntElement.getFrbgrntAgencyPhoneType().isNull() )
				{
					return ;
				}
				{
					NString holder= NString.getNull();
					String sqlteleC = "SELECT 'X' " +
	" FROM SPRTELE " +
	" WHERE SPRTELE_TELE_CODE = :FRBGRNT_AGENCY_PHONE_TYPE AND SPRTELE_PIDM = :FRBGRNT_AGENCY_PIDM AND NVL(SPRTELE_STATUS_IND, 'A') <> 'I' ";
					DataCursor teleC = new DataCursor(sqlteleC);
					try {
						//Setting query parameters
						teleC.addParameter("FRBGRNT_AGENCY_PHONE_TYPE", frbgrntElement.getFrbgrntAgencyPhoneType());
						teleC.addParameter("FRBGRNT_AGENCY_PIDM", frbgrntElement.getFrbgrntAgencyPidm());
						teleC.open();
						ResultSet teleCResults = teleC.fetchInto();
						if ( teleCResults != null ) {
							holder = teleCResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(teleC.notFound()), GNls.Fget(toStr("FRAGRNT-0142"), toStr("FORM"), toStr("Phone type is invalid; Use LIST.")), toBool(NBool.True));
					} finally {
						teleC.close();
					}
				}	
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_AGENCY_PHONE_TYPE.KEY-LISTVAL
		 DECLARE
	lv_form VARCHAR2(10) := 'FOAIDEN';
BEGIN
  IF INSTR(G$_SECURITY.G$_GET_TAB_SECURITY_FNC(lv_form,USER),'TELEPHONE_TAB:N') > 0 THEN
    MESSAGE(G$_NLS.Get('FRAGRNT-0143','FORM','*ERROR* User %01% is not authorized to access %02% on %03%.',
            USER,
            NVL(G$_SECURITY.G$_GET_TAB_DESC_FNC(lv_form,'TELEPHONE_TAB'),'TELEPHONE_TAB'),
            lv_form));
    RAISE FORM_TRIGGER_FAILURE;
  ELSE
--   :GLOBAL.ATYP_CODE := :frbgrnt_AGENCY_ADDR_CODE ;
   :GLOBAL.FORM_WAS_CALLED := 'Y';
   :GLOBAL.PIDM := :frbgrnt_AGENCY_PIDM;
   :GLOBAL.KEY_IDNO := :FRBGRNT_AGENCY_CODE_2;
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
    	 
      :FRBGRNT_AGENCY_PHONE_TYPE := :GLOBAL.TELE_CODE;	
      :FRBGRNT_AGENCY_TELE_SEQNO := :GLOBAL.TELE_SEQNO;
      :ctry_code_phone           := :global.ctry_code_phone;
      :area_code                 := :global.phone_area;
      :phone_number              := :global.phone_number;
      :extension                 := :global.phone_ext;
   END IF; 
    GO_ITEM('FRBGRNT_AGENCY_ADDR_CODE'); 
  END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_PHONE_TYPE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGRNT_AGENCY_PHONE_TYPE", function=KeyFunction.LIST_VALUES)
		public void frbgrntAgencyPhoneType_ListValues()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgrntElement==null)
					return;


				{
					NString lvForm = toStr("FOAIDEN");
					//if ( inStr(GSecurity.gGetTabSecurityFnc(lvForm, getUser()), toStr("TELEPHONE_TAB:N")).greater(0) )
					if ( inStr(GSecurity.FgGetTabSecurityFnc(lvForm, getUser()), toStr("TELEPHONE_TAB:N")).greater(0) )
					{
						//message(GNls.Fget(toStr("FRAGRNT-0143"), toStr("FORM"), toStr("*ERROR* User %01% is not authorized to access %02% on %03%."), getUser(), isNull(GSecurity.gGetTabDescFnc(lvForm, "TELEPHONE_TAB"), "TELEPHONE_TAB"), lvForm));
						errorMessage(GNls.Fget(toStr("FRAGRNT-0143"), toStr("FORM"), toStr("*ERROR* User %01% is not authorized to access %02% on %03%."), getUser(), isNull(GSecurity.FgGetTabDescFnc(lvForm, toStr("TELEPHONE_TAB")), "TELEPHONE_TAB"), lvForm));
						throw new ApplicationException();
					}
					else {
						//    :GLOBAL.ATYP_CODE := :frbgrnt_AGENCY_ADDR_CODE ;
						setGlobal("FORM_WAS_CALLED", toStr("Y"));
						setGlobal("PIDM", toStr(frbgrntElement.getFrbgrntAgencyPidm()));
						setGlobal("KEY_IDNO", frbgrntElement.getFrbgrntAgencyCode2());
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
							frbgrntElement.setFrbgrntAgencyPhoneType(getGlobal("TELE_CODE"));
							frbgrntElement.setFrbgrntAgencyTeleSeqno(toNumber(getGlobal("TELE_SEQNO")));
							frbgrntElement.setCtryCodePhone(getGlobal("CTRY_CODE_PHONE"));
							frbgrntElement.setAreaCode(getGlobal("PHONE_AREA"));
							frbgrntElement.setPhoneNumber(getGlobal("PHONE_NUMBER"));
							frbgrntElement.setExtension(getGlobal("PHONE_EXT"));
						}
						goItem(toStr("FRBGRNT_AGENCY_ADDR_CODE"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_AGENCY_PHONE_TYPE.KEY-PREV-ITEM
		 go_item('frbgrnt_AGENCY_ADDR_SEQ_NUM');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_PHONE_TYPE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="FRBGRNT_AGENCY_PHONE_TYPE", function=KeyFunction.PREVIOUS_ITEM)
		public void frbgrntAgencyPhoneType_PreviousItem()
		{
			
				goItem(toStr("frbgrnt_AGENCY_ADDR_SEQ_NUM"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_AGENCY_TELE_SEQNO.KEY-NEXT-ITEM
		 GO_ITEM('frbgrnt_AGENCY_CONTACT');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_TELE_SEQNO.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_AGENCY_TELE_SEQNO", function=KeyFunction.NEXT_ITEM)
		public void frbgrntAgencyTeleSeqno_keyNexItem()
		{
			
				goItem(toStr("frbgrnt_AGENCY_CONTACT"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_AGENCY_TELE_SEQNO.WHEN-VALIDATE-ITEM
		 --87631
if :frbgrnt_agency_phone_type is null and :frbgrnt_agency_tele_seqno is null then
	 return;
elsif :frbgrnt_agency_tele_seqno is null then
	 message(G$_NLS.Get('FRAGRNT-0144', 'FORM', 'Agency phone sequence number is needed.'));
	 raise form_trigger_failure;
end if;

DECLARE
   holder       VARCHAR2(1);
   CURSOR tele_c IS
   SELECT 'X'
   FROM   SPRTELE
   WHERE  SPRTELE_TELE_CODE = :frbgrnt_agency_phone_type
   AND    SPRTELE_SEQNO = :frbgrnt_agency_tele_seqno
   AND    SPRTELE_PIDM = :frbgrnt_agency_pidm
   AND    NVL(SPRTELE_STATUS_IND, 'A') <> 'I' ;
BEGIN
   OPEN tele_c ;
   FETCH tele_c INTO holder ;
   G$_CHECK_VALUE (tele_c%NOTFOUND,
          G$_NLS.Get('FRAGRNT-0145', 'FORM','Phone sequence number is invalid; Use LIST.') , TRUE);
END ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_TELE_SEQNO.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_AGENCY_TELE_SEQNO")
		public void frbgrntAgencyTeleSeqno_validate()
		{
			
				// 87631
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgrntElement==null)
					return;

				//int rowCount = 0;
				// 87631
				if ( frbgrntElement.getFrbgrntAgencyPhoneType().isNull() && frbgrntElement.getFrbgrntAgencyTeleSeqno().isNull() )
				{
					return ;
				}
				else if ( frbgrntElement.getFrbgrntAgencyTeleSeqno().isNull() ) {
					errorMessage(GNls.Fget(toStr("FRAGRNT-0144"), toStr("FORM"), toStr("Agency phone sequence number is needed.")));
					throw new ApplicationException();
				}
				{
					NString holder= NString.getNull();
					String sqlteleC = "SELECT 'X' " +
	" FROM SPRTELE " +
	" WHERE SPRTELE_TELE_CODE = :FRBGRNT_AGENCY_PHONE_TYPE AND SPRTELE_SEQNO = :FRBGRNT_AGENCY_TELE_SEQNO AND SPRTELE_PIDM = :FRBGRNT_AGENCY_PIDM AND NVL(SPRTELE_STATUS_IND, 'A') <> 'I' ";
					DataCursor teleC = new DataCursor(sqlteleC);
					try {
						//Setting query parameters
						teleC.addParameter("FRBGRNT_AGENCY_PHONE_TYPE", frbgrntElement.getFrbgrntAgencyPhoneType());
						teleC.addParameter("FRBGRNT_AGENCY_TELE_SEQNO", frbgrntElement.getFrbgrntAgencyTeleSeqno());
						teleC.addParameter("FRBGRNT_AGENCY_PIDM", frbgrntElement.getFrbgrntAgencyPidm());
						teleC.open();
						ResultSet teleCResults = teleC.fetchInto();
						if ( teleCResults != null ) {
							holder = teleCResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(teleC.notFound()), GNls.Fget(toStr("FRAGRNT-0145"), toStr("FORM"), toStr("Phone sequence number is invalid; Use LIST.")), toBool(NBool.True));
					} finally {
						teleC.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_AGENCY_TELE_SEQNO.KEY-LISTVAL
		 DECLARE
	lv_form VARCHAR2(10) := 'FOAIDEN';
BEGIN
  IF INSTR(G$_SECURITY.G$_GET_TAB_SECURITY_FNC(lv_form,USER),'TELEPHONE_TAB:N') > 0 THEN
    MESSAGE(G$_NLS.Get('FRAGRNT-0146','FORM','*ERROR* User %01% is not authorized to access %02% on %03%.',
            USER,
            NVL(G$_SECURITY.G$_GET_TAB_DESC_FNC(lv_form,'TELEPHONE_TAB'),'TELEPHONE_TAB'),
            lv_form));
    RAISE FORM_TRIGGER_FAILURE;
  ELSE
--   :GLOBAL.ATYP_CODE := :frbgrnt_AGENCY_ADDR_CODE ;
   :GLOBAL.FORM_WAS_CALLED := 'Y';
   :GLOBAL.PIDM := :frbgrnt_AGENCY_PIDM;
   :GLOBAL.KEY_IDNO := :FRBGRNT_AGENCY_CODE_2;
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
    :FRBGRNT_AGENCY_PHONE_TYPE := :GLOBAL.TELE_CODE;	
    :FRBGRNT_AGENCY_TELE_SEQNO := :GLOBAL.TELE_SEQNO;
   --  1-3OW3C6 begin 
    :CTRY_CODE_PHONE           := :GLOBAL.CTRY_CODE_PHONE;
    :AREA_CODE                 := :GLOBAL.PHONE_AREA;
    :PHONE_NUMBER              := :GLOBAL.PHONE_NUMBER;
    :EXTENSION                 := :GLOBAL.PHONE_EXT;
    -- 1-3OW3C6 end </multilinecomment>
--        :FRBGRNT_AGENCY_ADDR_CODE := :GLOBAL.ATYP_CODE;
--        :FRBGRNT_AGENCY_ADDR_SEQ_NUM := :GLOBAL.SEQNO;
  END IF;
    GO_ITEM('FRBGRNT_AGENCY_ADDR_CODE');
  END IF; 
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_TELE_SEQNO.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGRNT_AGENCY_TELE_SEQNO", function=KeyFunction.LIST_VALUES)
		public void frbgrntAgencyTeleSeqno_ListValues()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgrntElement==null)
					return;

				{
					NString lvForm = toStr("FOAIDEN");
					if ( inStr(GSecurity.FgGetTabSecurityFnc(lvForm, getUser()), toStr("TELEPHONE_TAB:N")).greater(0) )
					{
						errorMessage(GNls.Fget(toStr("FRAGRNT-0146"), toStr("FORM"), toStr("*ERROR* User %01% is not authorized to access %02% on %03%."), getUser(), isNull(GSecurity.FgGetTabDescFnc(lvForm, toStr("TELEPHONE_TAB")), "TELEPHONE_TAB"), lvForm));
						throw new ApplicationException();
					}
					else {
						//    :GLOBAL.ATYP_CODE := :frbgrnt_AGENCY_ADDR_CODE ;
						setGlobal("FORM_WAS_CALLED", toStr("Y"));
						setGlobal("PIDM", toStr(frbgrntElement.getFrbgrntAgencyPidm()));
						setGlobal("KEY_IDNO", frbgrntElement.getFrbgrntAgencyCode2());
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
							frbgrntElement.setFrbgrntAgencyPhoneType(getGlobal("TELE_CODE"));
							frbgrntElement.setFrbgrntAgencyTeleSeqno(toNumber(getGlobal("TELE_SEQNO")));
							//   1-3OW3C6 begin 
							frbgrntElement.setCtryCodePhone(getGlobal("CTRY_CODE_PHONE"));
							frbgrntElement.setAreaCode(getGlobal("PHONE_AREA"));
							frbgrntElement.setPhoneNumber(getGlobal("PHONE_NUMBER"));
							frbgrntElement.setExtension(getGlobal("PHONE_EXT"));
						}
						goItem(toStr("FRBGRNT_AGENCY_ADDR_CODE"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_IDC_ENC_IND.KEY-PREV-ITEM
		 --RPE# 1-G32Z5
go_item('frbgrnt_cstd_code_distr');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_IDC_ENC_IND.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="FRBGRNT_IDC_ENC_IND", function=KeyFunction.PREVIOUS_ITEM)
		public void frbgrntIdcEncInd_PreviousItem()
		{
			
				// RPE# 1-G32Z5
				// RPE# 1-G32Z5
				goItem(toStr("frbgrnt_cstd_code_distr"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_COAS_CODE_IC_CS.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBGRNT_COAS_CODE_IC_CS")
		public void frbgrntCoasCodeIcCs_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_COAS_CODE_IC_CS.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_COAS_CODE_IC_CS", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntCoasCodeIcCs_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_COAS_CODE_IC_CS.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS", item="FRBGRNT_COAS_CODE_IC_CS")
		public void frbgrntCoasCodeIcCs_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_COAS_CODE_IC_CS.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_COAS_CODE_IC_CS", function=KeyFunction.NEXT_ITEM)
		public void frbgrntCoasCodeIcCs_keyNexItem()
		{
		

			frbgrntCoasCodeIcCs_validate();
			nextItem();
		}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_COAS_CODE_IC_CS.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVCOAS_COAS_CODE', 'FTVCOAS_TITLE',
   G$_SEARCH_WHERE.F_FTVCOAS_ENTRY('SYSDATE'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_COAS_CODE_IC_CS.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRBGRNT_COAS_CODE_IC_CS")
		public void frbgrntCoasCodeIcCs_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVCOAS_COAS_CODE"), toStr("FTVCOAS_TITLE"), getTask().getGoqrpls().getGSearchWhere().fFtvcoasEntry(toStr("SYSDATE")));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_COAS_CODE_IC_CS.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
     EXECUTE_TRIGGER( 'EDIT_COAS_CODE_IC_CS' ) ;
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
		 * FRBGRNT_COAS_CODE_IC_CS.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_COAS_CODE_IC_CS")
		public void frbgrntCoasCodeIcCs_PostChange()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if (frbgrntElement != null) {
					if (frbgrntElement.getFrbgrntCoasCodeIcCs().isNull())
						return;
					try {
						getTask().getGoqrpls().gCheckQueryMode();
						//
						executeAction("EDIT_COAS_CODE_IC_CS");
						getTask().getGoqrpls().gCheckFailure();
						//
						setGlobal("QUERY_MODE", toStr("0"));
					} catch (ApplicationException e) {
						setGlobal("QUERY_MODE", toStr("0"));
						throw new ApplicationException();
					}
				}

			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_COAS_CODE_IC_CS.POST-TEXT-ITEM
		 null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_COAS_CODE_IC_CS.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_COAS_CODE_IC_CS", function=KeyFunction.ITEM_OUT)
		public void frbgrntCoasCodeIcCs_itemOut()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_BASI_CODE_IC.KEY-LISTVAL
		 BEGIN
   :GLOBAL.BASIS_TYPE := 'I';
   :GLOBAL.FORM_WAS_CALLED := 'Y';
--
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(USER,'FRVBASI','QUERY');
   :GLOBAL.FORM_WAS_CALLED := 'N';
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
      THEN  
         EXECUTE_TRIGGER('LIST_VALUES_COPY'); 
         :GLOBAL.VALUE := '';
         DO_KEY('NEXT_ITEM');
      ELSE
         MESSAGE( G$_NLS.Get('FRAGRNT-0147', 'FORM','*ERROR* Item is protected against update.') );             
      END IF;     
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_BASI_CODE_IC.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGRNT_BASI_CODE_IC", function=KeyFunction.LIST_VALUES)
		public void frbgrntBasiCodeIc_ListValues()
		{
			
				setGlobal("BASIS_TYPE", toStr("I"));
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				// 
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("FRVBASI"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE")  || (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0147"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_BASI_CODE_IC.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
     EXECUTE_TRIGGER( 'EDIT_BASI_CODE_IC' ) ;
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
		 * FRBGRNT_BASI_CODE_IC.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_BASI_CODE_IC")
		public void frbgrntBasiCodeIc_PostChange()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

			if (frbgrntElement != null) {
				if (frbgrntElement.getFrbgrntBasiCodeIc().isNull())
					return;
				try {
					getTask().getGoqrpls().gCheckQueryMode();
					//
					executeAction("EDIT_BASI_CODE_IC");
					getTask().getGoqrpls().gCheckFailure();
					//
					setGlobal("QUERY_MODE", toStr("0"));
				} catch (ApplicationException e) {
					setGlobal("QUERY_MODE", toStr("0"));
					throw new ApplicationException();
				}
			}

		}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_BASI_CODE_IC.POST-TEXT-ITEM
		 IF :frbgrnt_BASI_CODE_IC IS NULL THEN
   :frbgrnt_BASI_CODE_IC_NAME := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_BASI_CODE_IC.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_BASI_CODE_IC", function=KeyFunction.ITEM_OUT)
		public void frbgrntBasiCodeIc_itemOut()
		{
			FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
	
			if (frbgrntElement != null) {
				if ( frbgrntElement.getFrbgrntBasiCodeIc().isNull() )
				{
					frbgrntElement.setFrbgrntBasiCodeIcName(toStr(""));
				}
			}
		}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_BASI_CODE_IC.WHEN-NEW-ITEM-INSTANCE
		 NULL;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_BASI_CODE_IC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_BASI_CODE_IC", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntBasiCodeIc_itemChange()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_INDR_CODE_RATE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   EXECUTE_TRIGGER('EDIT_INDR_CODE_RATE');
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
		 * FRBGRNT_INDR_CODE_RATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_INDR_CODE_RATE")
		public void frbgrntIndrCodeRate_PostChange()
		{
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgrntElement==null)
					return;


				if(frbgrntElement.getFrbgrntIndrCodeRate().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					executeAction("EDIT_INDR_CODE_RATE");
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

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_INDR_CODE_RATE.WHEN-NEW-ITEM-INSTANCE
		 NULL;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_INDR_CODE_RATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_INDR_CODE_RATE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntIndrCodeRate_itemChange()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_INDR_CODE_RATE.KEY-LISTVAL
		 BEGIN
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(USER,'FRVINDR','QUERY');
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
      THEN  
         EXECUTE_TRIGGER('LIST_VALUES_COPY'); 
         :GLOBAL.VALUE := '';
         DO_KEY('NEXT_ITEM');
      ELSE
         MESSAGE( G$_NLS.Get('FRAGRNT-0148', 'FORM','*ERROR* Item is protected against update.') );              
      END IF;     
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_INDR_CODE_RATE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGRNT_INDR_CODE_RATE", function=KeyFunction.LIST_VALUES)
		public void frbgrntIndrCodeRate_ListValues()
		{
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("FRVINDR"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE")  || (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0148"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_INDR_CODE_RATE.POST-TEXT-ITEM
		 IF :frbgrnt_INDR_CODE_RATE IS NULL THEN
   :frbgrnt_INDR_CODE_RATE_NAME := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_INDR_CODE_RATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_INDR_CODE_RATE", function=KeyFunction.ITEM_OUT)
		public void frbgrntIndrCodeRate_itemOut()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgrntElement==null)
					return;

				if ( frbgrntElement.getFrbgrntIndrCodeRate().isNull() )
				{
					frbgrntElement.setFrbgrntIndrCodeRateName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_INDA_CODE_CHARGE.WHEN-NEW-ITEM-INSTANCE
		 NULL;
null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_INDA_CODE_CHARGE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_INDA_CODE_CHARGE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntIndaCodeCharge_itemChange()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_INDA_CODE_CHARGE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   EXECUTE_TRIGGER('EDIT_INDA_CODE_CHARGE');
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
		 * FRBGRNT_INDA_CODE_CHARGE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_INDA_CODE_CHARGE")
		public void frbgrntIndaCodeCharge_PostChange()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgrntElement==null)
					return;

				if(frbgrntElement.getFrbgrntIndaCodeCharge().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					executeAction("EDIT_INDA_CODE_CHARGE");
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

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_INDA_CODE_CHARGE.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
--
IF :frbgrnt_INDA_CODE_CHARGE IS NULL THEN
   :frbgrnt_INDA_CODE_CHARGE_NAME := '';
END IF; 
   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_INDA_CODE_CHARGE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_INDA_CODE_CHARGE", function=KeyFunction.ITEM_OUT)
		public void frbgrntIndaCodeCharge_itemOut()
		{
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				
				if(frbgrntElement==null)
					return;

				getTask().getGoqrpls().getGSearch().postTextCode();
				// 
				if ( frbgrntElement.getFrbgrntIndaCodeCharge().isNull() )
				{
					frbgrntElement.setFrbgrntIndaCodeChargeName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_INDA_CODE_CHARGE.KEY-LISTVAL
		 BEGIN
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(USER,'FRVINDA','QUERY');
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
      THEN  
         EXECUTE_TRIGGER('LIST_VALUES_COPY'); 
         :GLOBAL.VALUE := '';
         DO_KEY('NEXT_ITEM');
      ELSE
         MESSAGE( G$_NLS.Get('FRAGRNT-0149', 'FORM','*ERROR* Item is protected against update.') );              
      END IF;     
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_INDA_CODE_CHARGE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGRNT_INDA_CODE_CHARGE", function=KeyFunction.LIST_VALUES)
		public void frbgrntIndaCodeCharge_ListValues()
		{
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("FRVINDA"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE")  || (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0149"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_INDD_CODE_DISTR.WHEN-NEW-ITEM-INSTANCE
		 NULL;
null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_INDD_CODE_DISTR.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_INDD_CODE_DISTR", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntInddCodeDistr_itemChange()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_INDD_CODE_DISTR.KEY-LISTVAL
		 BEGIN
    EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
    G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(USER,'FRVINDD','QUERY');
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
      THEN  
         EXECUTE_TRIGGER('LIST_VALUES_COPY'); 
         :GLOBAL.VALUE := '';
         DO_KEY('NEXT_ITEM');
      ELSE
         MESSAGE( G$_NLS.Get('FRAGRNT-0150', 'FORM','*ERROR* Item is protected against update.') );              
      END IF;     
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_INDD_CODE_DISTR.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGRNT_INDD_CODE_DISTR", function=KeyFunction.LIST_VALUES)
		public void frbgrntInddCodeDistr_ListValues()
		{
			
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("FRVINDD"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") ||  (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0150"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_INDD_CODE_DISTR.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
--
IF :frbgrnt_INDD_CODE_DISTR IS NULL THEN
   :frbgrnt_INDD_CODE_DISTR_NAME := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_INDD_CODE_DISTR.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_INDD_CODE_DISTR", function=KeyFunction.ITEM_OUT)
		public void frbgrntInddCodeDistr_itemOut()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				if(frbgrntElement==null)
					return;


				getTask().getGoqrpls().getGSearch().postTextCode();
				// 
				if ( frbgrntElement.getFrbgrntInddCodeDistr().isNull() )
				{
					frbgrntElement.setFrbgrntInddCodeDistrName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_INDD_CODE_DISTR.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   EXECUTE_TRIGGER('EDIT_INDD_CODE_DISTR');
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
		 * FRBGRNT_INDD_CODE_DISTR.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_INDD_CODE_DISTR")
		public void frbgrntInddCodeDistr_PostChange()
		{
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if(frbgrntElement==null)
					return;

				if(frbgrntElement.getFrbgrntInddCodeDistr().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					executeAction("EDIT_INDD_CODE_DISTR");
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

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_BASI_CODE_CS.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FRVBASI_CODE', 'FRVBASI_DESC');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_BASI_CODE_CS.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS", item="FRBGRNT_BASI_CODE_CS")
		public void frbgrntBasiCodeCs_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FRVBASI_CODE"), toStr("FRVBASI_DESC"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_BASI_CODE_CS.KEY-LISTVAL
		 BEGIN
   :GLOBAL.BASIS_TYPE := 'C';
   :GLOBAL.FORM_WAS_CALLED := 'Y';
--
   EXECUTE_TRIGGER('G$_REVOKE_ACCESS');
   G$_CHECK_FAILURE;
   G$_SECURED_FORM_CALL(USER,'FRVBASI','QUERY');
   :GLOBAL.FORM_WAS_CALLED := 'N';
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
      THEN  
         EXECUTE_TRIGGER('LIST_VALUES_COPY'); 
         :GLOBAL.VALUE := '';
         DO_KEY('NEXT_ITEM');
      ELSE
         MESSAGE( G$_NLS.Get('FRAGRNT-0151', 'FORM','*ERROR* Item is protected against update.') );             
      END IF;     
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_BASI_CODE_CS.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBGRNT_BASI_CODE_CS", function=KeyFunction.LIST_VALUES)
		public void frbgrntBasiCodeCs_ListValues()
		{
			
				setGlobal("BASIS_TYPE", toStr("C"));
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				// 
				executeAction("G$_REVOKE_ACCESS");
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("FRVBASI"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") || (!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAGRNT-0151"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_BASI_CODE_CS.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
     EXECUTE_TRIGGER( 'EDIT_BASI_CODE_CS' ) ;
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
		 * FRBGRNT_BASI_CODE_CS.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_BASI_CODE_CS")
		public void frbgrntBasiCodeCs_PostChange()
		{
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				if(frbgrntElement==null)
					return;


				if(frbgrntElement.getFrbgrntBasiCodeCs().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					executeAction("EDIT_BASI_CODE_CS");
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

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_BASI_CODE_CS.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
--
IF :frbgrnt_BASI_CODE_CS IS NULL THEN
    :frbgrnt_BASI_CODE_CS_NAME := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_BASI_CODE_CS.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_BASI_CODE_CS", function=KeyFunction.ITEM_OUT)
		public void frbgrntBasiCodeCs_itemOut()
		{
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
				if(frbgrntElement==null)
					return;

				getTask().getGoqrpls().getGSearch().postTextCode();
				// 
				if ( frbgrntElement.getFrbgrntBasiCodeCs().isNull() )
				{
					frbgrntElement.setFrbgrntBasiCodeCsName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_BASI_CODE_CS.WHEN-NEW-ITEM-INSTANCE
		 G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_BASI_CODE_CS.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_BASI_CODE_CS", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntBasiCodeCs_itemChange()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_CSTR_CODE_RATE.WHEN-NEW-ITEM-INSTANCE
		 null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CSTR_CODE_RATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_CSTR_CODE_RATE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntCstrCodeRate_itemChange()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_CSTR_CODE_RATE.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
--
IF :frbgrnt_CSTR_CODE_RATE IS NULL THEN
   :frbgrnt_CSTR_CODE_RATE_NAME := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CSTR_CODE_RATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_CSTR_CODE_RATE", function=KeyFunction.ITEM_OUT)
		public void frbgrntCstrCodeRate_itemOut()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if (frbgrntElement != null) {
					getTask().getGoqrpls().getGSearch().postTextCode();
					// 
					if ( frbgrntElement.getFrbgrntCstrCodeRate().isNull() )
					{
						frbgrntElement.setFrbgrntCstrCodeRateName(toStr(""));
					}
				}
		}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_CSTR_CODE_RATE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   EXECUTE_TRIGGER('EDIT_CSTR_CODE_RATE');
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
		 * FRBGRNT_CSTR_CODE_RATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_CSTR_CODE_RATE")
		public void frbgrntCstrCodeRate_PostChange()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

if (frbgrntElement != null) {
	

				if(frbgrntElement.getFrbgrntCstrCodeRate().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					executeAction("EDIT_CSTR_CODE_RATE");
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

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_CSTA_CODE_CHARGE.WHEN-NEW-ITEM-INSTANCE
		 null;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CSTA_CODE_CHARGE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBGRNT_CSTA_CODE_CHARGE", function=KeyFunction.ITEM_CHANGE)
		public void frbgrntCstaCodeCharge_itemChange()
		{
			
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_CSTA_CODE_CHARGE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   EXECUTE_TRIGGER('EDIT_CSTA_CODE_CHARGE');
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
		 * FRBGRNT_CSTA_CODE_CHARGE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_CSTA_CODE_CHARGE")
		public void frbgrntCstaCodeCharge_PostChange()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

if (frbgrntElement != null) {
	

				if(frbgrntElement.getFrbgrntCstaCodeCharge().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					executeAction("EDIT_CSTA_CODE_CHARGE");
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

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_CSTA_CODE_CHARGE.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
--
IF :frbgrnt_CSTA_CODE_CHARGE IS NULL THEN
   :frbgrnt_CSTA_CODE_CHARGE_NAME := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CSTA_CODE_CHARGE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_CSTA_CODE_CHARGE", function=KeyFunction.ITEM_OUT)
		public void frbgrntCstaCodeCharge_itemOut()
		{

			FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
	
			if (frbgrntElement != null) {
				getTask().getGoqrpls().getGSearch().postTextCode();
				// 
				if ( frbgrntElement.getFrbgrntCstaCodeCharge().isNull() )
				{
					frbgrntElement.setFrbgrntCstaCodeChargeName(toStr(""));
				}
			}

		}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_CSTD_CODE_DISTR.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
--
IF :frbgrnt_CSTD_CODE_DISTR IS NULL THEN
   :frbgrnt_CSTD_CODE_DISTR_NAME := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CSTD_CODE_DISTR.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBGRNT_CSTD_CODE_DISTR", function=KeyFunction.ITEM_OUT)
		public void frbgrntCstdCodeDistr_itemOut()
		{
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

				if(frbgrntElement==null)
					return;

				getTask().getGoqrpls().getGSearch().postTextCode();
				// 
				if ( frbgrntElement.getFrbgrntCstdCodeDistr().isNull() )
				{
					frbgrntElement.setFrbgrntCstdCodeDistrName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_CSTD_CODE_DISTR.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   EXECUTE_TRIGGER('EDIT_CSTD_CODE_DISTR');
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
		 * FRBGRNT_CSTD_CODE_DISTR.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBGRNT_CSTD_CODE_DISTR")
		public void frbgrntCstdCodeDistr_PostChange()
		{

				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);

if (frbgrntElement != null) {
	

				if(frbgrntElement.getFrbgrntCstdCodeDistr().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					executeAction("EDIT_CSTD_CODE_DISTR");
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

		
		/* Original PL/SQL code code for TRIGGER FRBGRNT_CSTD_CODE_DISTR.KEY-NEXT-ITEM
		 go_item('FRBGRNT_IDC_ENC_IND');  --RPE# 1-G32Z5
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CSTD_CODE_DISTR.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBGRNT_CSTD_CODE_DISTR", function=KeyFunction.NEXT_ITEM)
		public void frbgrntCstdCodeDistr_keyNexItem()
		{
			
				goItem(toStr("FRBGRNT_IDC_ENC_IND"));
				// RPE# 1-G32Z5
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_COAS_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_COAS_CODE")
		public void frbgrntCoasCode_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
							this.frbgrntCoasCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_ORGN_CODE_RESP_OFFICE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_ORGN_CODE_RESP_OFFICE")
		public void frbgrntOrgnCodeRespOffice_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
							this.frbgrntOrgnCodeRespOffice_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_LONG_TITLE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_LONG_TITLE")
		public void frbgrntLongTitle_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
							this.frbgrntLongTitle_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_TERM_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_TERM_DATE")
		public void frbgrntTermDate_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
							this.frbgrntTermDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_EXPEND_END_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_EXPEND_END_DATE")
		public void frbgrntExpendEndDate_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
							this.frbgrntExpendEndDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_STATUS_CODE")
		public void frbgrntStatusCode_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
							this.frbgrntStatusCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_STATUS_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_STATUS_DATE")
		public void frbgrntStatusDate_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
							this.frbgrntStatusDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_GRNT_CODE_RELATED.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_GRNT_CODE_RELATED")
		public void frbgrntGrntCodeRelated_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
							this.frbgrntGrntCodeRelated_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_ADDR_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_AGENCY_ADDR_CODE")
		public void frbgrntAgencyAddrCode_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
							this.frbgrntAgencyAddrCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_AGENCY_ADDR_SEQ_NUM.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_AGENCY_ADDR_SEQ_NUM")
		public void frbgrntAgencyAddrSeqNum_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
							this.frbgrntAgencyAddrSeqNum_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_COAS_CODE_IC_CS.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_COAS_CODE_IC_CS")
		public void frbgrntCoasCodeIcCs_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
							this.frbgrntCoasCodeIcCs_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_BASI_CODE_IC.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_BASI_CODE_IC")
		public void frbgrntBasiCodeIc_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
							this.frbgrntBasiCodeIc_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_INDR_CODE_RATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_INDR_CODE_RATE")
		public void frbgrntIndrCodeRate_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
							this.frbgrntIndrCodeRate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_INDA_CODE_CHARGE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_INDA_CODE_CHARGE")
		public void frbgrntIndaCodeCharge_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
							this.frbgrntIndaCodeCharge_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_INDD_CODE_DISTR.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_INDD_CODE_DISTR")
		public void frbgrntInddCodeDistr_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
							this.frbgrntInddCodeDistr_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_BASI_CODE_CS.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_BASI_CODE_CS")
		public void frbgrntBasiCodeCs_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
							this.frbgrntBasiCodeCs_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CSTR_CODE_RATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_CSTR_CODE_RATE")
		public void frbgrntCstrCodeRate_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
							this.frbgrntCstrCodeRate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CSTA_CODE_CHARGE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_CSTA_CODE_CHARGE")
		public void frbgrntCstaCodeCharge_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
							this.frbgrntCstaCodeCharge_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBGRNT_CSTD_CODE_DISTR.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBGRNT_CSTD_CODE_DISTR")
		public void frbgrntCstdCodeDistr_validate()
		{
			
				FrbgrntAdapter frbgrntElement = (FrbgrntAdapter)this.getFormModel().getFrbgrnt().getRowAdapter(true);
							this.frbgrntCstdCodeDistr_PostChange();

			}
		
		@ActionTrigger(action="KEY-DUPREC", function=KeyFunction.DUPLICATE_RECORD)
		public void frbgrnt_CopyRecord()
		{
			executeAction("INVALID_FUNCTION_MSG");
			getTask().getGoqrpls().gCheckFailure();
			
			}

		
	
	
}

