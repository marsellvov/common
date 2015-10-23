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
import net.hedtech.general.common.libraries.Goqolib.services.GCodeClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GDescClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GIdClass;	
import net.hedtech.general.common.libraries.Goqolib.services.GNameClass;	

import net.hedtech.general.common.forms.controller.DefaultBlockController;

public class FrbpropController extends DefaultBlockController {

	private GCodeClass getGCodeClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GCodeClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_CODE_CLASS");
	}	
	private GDescClass getGDescClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GDescClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_DESC_CLASS");
	}	
	private GIdClass getGIdClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GIdClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_ID_CLASS");
	}	
	private GNameClass getGNameClass() {
		return (net.hedtech.general.common.libraries.Goqolib.services.GNameClass) this.getTask().getTaskPart("GOQOLIB").getSupportCodeManager().getPackage("G$_NAME_CLASS");
	}	

	
	public FrbpropController(IFormController parentController, String name) 
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
		/* Original PL/SQL code code for TRIGGER FRBPROP.KEY-CQUERY
		 execute_trigger('call_form_friprst');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", function=KeyFunction.COUNT_QUERY)
		public void frbprop_TotalResults()
		{
			
				executeAction("call_form_friprst");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP.POST-QUERY
		 
--after execute_query on frbprop
  :POST_QUERY_IND := 'Y';
  
-- Fix for defect # 1-8KTK2 begins
-- do not call the trigger to validate organization code from POST_QUERY
  -- EXECUTE_TRIGGER('EDIT_ORGN_CODE');
  -- G$_CHECK_FAILURE;
-- Fix for defect # 1-8KTK2 ends
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
--
   :HOLD_STATUS_CODE := :FRBPROP_STATUS_CODE;
   :HOLD_PI_ID_CODE  := :FRBPROP_PI_ID_CODE;
   :HOLD_STATUS_DATE := :FRBPROP_status_date;
   :form_header.hold_alt_status_desc := :frbprop.frbprop_alternate_status_desc;
   
   IF :frbprop_status_code IS NOT NULL THEN
   			execute_trigger('get_status_desc');
   			g$_check_failure;
   			:frbprop.status_descr := '';
	 			:frbprop.status_descr := 	:form_header.store_org_status_desc ||' '||
																	:frbprop.frbprop_alternate_status_desc;
		END IF;

-- for rollback
    SET_RECORD_PROPERTY(1,'FRBPROP',STATUS,QUERY_STATUS);
--
declare
		temp varchar2(1);
		cursor c1 is	
		select 'x' 
		from frrprpt
		where frrprpt_prop_code = :key_block.display_frbprop_code;	
begin
		open c1;
		fetch c1 into temp;
		if c1%found then
				:frbprop.display_pass_thru_ind := 'Y';
		else 
				if c1%notfound then
						:frbprop.display_pass_thru_ind := 'N';
				end if;
		end if;
		close c1;
end;
g$_check_failure; 

--1-1A1JGI
DECLARE
	CURSOR ftvsdat_title_cur (p_ftvsdat_attr VARCHAR2, p_ftvsdat_opt_1 VARCHAR2) is
  SELECT ftvsdat_title
    FROM ftvsdat
   WHERE ftvsdat_sdat_code_entity = 'FRBPROP'
      and ftvsdat_sdat_code_attr = p_ftvsdat_attr    --    'PROPOSAL_TYPE'
      and ftvsdat_sdat_code_opt_1 = p_ftvsdat_opt_1  --   :frbprop_proposal_type
       and ftvsdat_eff_date <= sysdate
       and (ftvsdat_nchg_date is null
       or ftvsdat_nchg_date > sysdate)
       and ftvsdat_status_ind = 'A';	
BEGIN
	OPEN ftvsdat_title_cur('PROPOSAL_TYPE', :FRBPROP_PROPOSAL_TYPE);
	FETCH ftvsdat_title_cur INTO :FRBPROP_PROPOSAL_DESC;
	CLOSE ftvsdat_title_cur;
	OPEN ftvsdat_title_cur('CATEGORY', :FRBPROP_CATEGORY);
	FETCH ftvsdat_title_cur INTO :FRBPROP_CATEGORY_DESC;
	CLOSE ftvsdat_title_cur;
	OPEN ftvsdat_title_cur('SUB_CATEGORY', :FRBPROP_SUB_CATEGORY);
	FETCH ftvsdat_title_cur INTO :FRBPROP_SUB_CAT_DESC;
	CLOSE ftvsdat_title_cur;
END;
--  
:POST_QUERY_IND := 'N';
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP.POST-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterQuery
		public void frbprop_AfterQuery(RowAdapterEvent args)
		{
			
				// after execute_query on frbprop
				FrbpropAdapter frbpropElement = (FrbpropAdapter)args.getRow();


				int rowCount = 0;
				// F2J_WARNING : Post-query code is executed once for every row retrieved. If you expect the query to return many records, this may cause a performance problem.

				try
				{
					frbpropElement.setLockDbValues(true);
                                                                 try {  
                        this.frbpropCoasCode_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropOrgnCodeRespOffice_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropLongTitle_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropAgencyCode_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropPiIdCode_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropOrigPrepDate_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropDueDate_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropSubmittedDate_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropStatusCode_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropStatusDate_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropProjectStartDate_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropProjectEndDate_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropBudgPrdStartDat_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropBudgPrdEndDate_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropExpectedGrantDat_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropPropCodeRelated_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropAgencyAddrCode_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropAgencyAddrSeqNum_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropCoasCodeIcCs_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropBasiCodeIc_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropIndrCodeRate_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropIndaCodeCharge_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropInddCodeDistr_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropBasiCodeCs_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropCstrCodeRate_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                        this.frbpropCstaCodeCharge_PostChange(); 
                        } catch(Exception ex) { 
                        } 
                                                                 try {  
                                                                this.frbpropCstdCodeDistr_PostChange(); 
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
//[DELETE] 
//[DELETE] 
//[DELETE] 
//[DELETE] 

				} finally { 
					frbpropElement.setLockDbValues(false);
				}
				// after execute_query on frbprop
				getFormModel().getFormHeader().setPostQueryInd(toStr("Y"));
				//  Fix for defect # 1-8KTK2 begins
				//  do not call the trigger to validate organization code from POST_QUERY
				//  EXECUTE_TRIGGER('EDIT_ORGN_CODE');
				//  G$_CHECK_FAILURE;
				//  Fix for defect # 1-8KTK2 ends
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
				// 
				getFormModel().getFormHeader().setHoldStatusCode(frbpropElement.getFrbpropStatusCode());
				getFormModel().getFormHeader().setHoldPiIdCode(frbpropElement.getFrbpropPiIdCode());
				getFormModel().getFormHeader().setHoldStatusDate(frbpropElement.getFrbpropStatusDate());
				getFormModel().getFormHeader().setHoldAltStatusDesc(frbpropElement.getFrbpropAlternateStatusDesc());
				if ( !frbpropElement.getFrbpropStatusCode().isNull() )
				{
					executeAction("get_status_desc");
					getTask().getGoqrpls().gCheckFailure();
					frbpropElement.setStatusDescr(toStr(""));
					frbpropElement.setStatusDescr(getFormModel().getFormHeader().getStoreOrgStatusDesc().append(" ").append(frbpropElement.getFrbpropAlternateStatusDesc()));
				}
				//  for rollback
				// F2J_NOT_SUPPORTED *: The property "RECORD's STATUS" is not supported. See documentation for details "file://D:\Work\forms2net\Projects\Ellucian\Conversion\Docs\FRAPROPF2NMigrationGuide.xml#DefaultExcludeBuiltin4".
				//				SupportClasses.FORMS40.SetRecordProperty(1, "FRBPROP", SupportClasses.Property.STATUS, SupportClasses.Constants.QUERY_STATUS);
//				System.err.println("// F2J_NOT_SUPPORTED : The property 'RECORD's STATUS' is not supported. See documentation for details 'file://D:\\Work\\forms2net\\Projects\\Ellucian\\Conversion\\Docs\\FRAPROPF2NMigrationGuide.xml#DefaultExcludeBuiltin4'.");
				
				{
					NString temp= NString.getNull();
					String sqlc1 = "SELECT 'x' " +
	" FROM frrprpt " +
	" WHERE frrprpt_prop_code = :KEY_BLOCK_DISPLAY_FRBPROP_CODE ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("KEY_BLOCK_DISPLAY_FRBPROP_CODE", getFormModel().getKeyBlock().getDisplayFrbpropCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							temp = c1Results.getStr(0);
						}
						if ( c1.found() )
						{
							frbpropElement.setDisplayPassThruInd(toStr("Y"));
						}
						else {
							if ( c1.notFound() )
							{
								frbpropElement.setDisplayPassThruInd(toStr("N"));
							}
						}
						c1.close();
					}
					finally{
						c1.close();
					}
				}
				getTask().getGoqrpls().gCheckFailure();
				{
					String sqlftvsdatTitleCur = "SELECT ftvsdat_title " +
	" FROM ftvsdat " +
	" WHERE ftvsdat_sdat_code_entity = 'FRBPROP' AND ftvsdat_sdat_code_attr = :P_P_FTVSDAT_ATTR AND ftvsdat_sdat_code_opt_1 = :P_P_FTVSDAT_OPT_1 AND ftvsdat_eff_date <= sysdate AND (ftvsdat_nchg_date IS NULL OR ftvsdat_nchg_date > sysdate) AND ftvsdat_status_ind = 'A' ";
					DataCursor ftvsdatTitleCur = new DataCursor(sqlftvsdatTitleCur);
					NString pFtvsdatAttr = NString.getNull();
					NString pFtvsdatOpt1 = NString.getNull();
					try {
						pFtvsdatAttr=toStr("PROPOSAL_TYPE");
						pFtvsdatOpt1=frbpropElement.getFrbpropProposalType();
						//Setting query parameters
						ftvsdatTitleCur.addParameter("P_P_FTVSDAT_ATTR", pFtvsdatAttr);
						ftvsdatTitleCur.addParameter("P_P_FTVSDAT_OPT_1", pFtvsdatOpt1);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ftvsdatTitleCur.
						ftvsdatTitleCur.open();
						ResultSet ftvsdatTitleCurResults = ftvsdatTitleCur.fetchInto();
						if ( ftvsdatTitleCurResults != null ) {
							frbpropElement.setFrbpropProposalDesc(ftvsdatTitleCurResults.getStr(0));
						}
						ftvsdatTitleCur.close();
						pFtvsdatAttr=toStr("CATEGORY");
						pFtvsdatOpt1=frbpropElement.getFrbpropCategory();
						//Setting query parameters
						ftvsdatTitleCur.addParameter("P_P_FTVSDAT_ATTR", pFtvsdatAttr);
						ftvsdatTitleCur.addParameter("P_P_FTVSDAT_OPT_1", pFtvsdatOpt1);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ftvsdatTitleCur.
						ftvsdatTitleCur.open();
						ftvsdatTitleCurResults = ftvsdatTitleCur.fetchInto();
						if ( ftvsdatTitleCurResults != null ) {
							frbpropElement.setFrbpropCategoryDesc(ftvsdatTitleCurResults.getStr(0));
						}
						ftvsdatTitleCur.close();
						pFtvsdatAttr=toStr("SUB_CATEGORY");
						pFtvsdatOpt1=frbpropElement.getFrbpropSubCategory();
						//Setting query parameters
						ftvsdatTitleCur.addParameter("P_P_FTVSDAT_ATTR", pFtvsdatAttr);
						ftvsdatTitleCur.addParameter("P_P_FTVSDAT_OPT_1", pFtvsdatOpt1);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable ftvsdatTitleCur.
						ftvsdatTitleCur.open();
						ftvsdatTitleCurResults = ftvsdatTitleCur.fetchInto();
						if ( ftvsdatTitleCurResults != null ) {
							frbpropElement.setFrbpropSubCatDesc(ftvsdatTitleCurResults.getStr(0));
						}
						ftvsdatTitleCur.close();
					}
					finally{
						ftvsdatTitleCur.close();
					}
				}
				//   
				getFormModel().getFormHeader().setPostQueryInd(toStr("N"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP.PRE-UPDATE
		 BEGIN
   IF G$_NCHK(:commit_ind <> 'Y') THEN
      MESSAGE(  G$_NLS.Get('FRAPROP-0087', 'FORM','Select SAVE to perform a Commit.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
--
  EXECUTE_TRIGGER('SET_FIELDS');
  G$_CHECK_FAILURE;
--
  EXECUTE_TRIGGER('RE_EDIT');
  G$_CHECK_FAILURE;
--
  EXECUTE_TRIGGER('UPDATE_ACTIVITY_DATE');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('UPDATE_USER_ID');
  G$_CHECK_FAILURE;
  EXECUTE_TRIGGER('CHECK_TEXT');
  G$_CHECK_FAILURE;
--
IF :frbprop_status_code is not null then
   if :hold_status_code is null then
      EXECUTE_TRIGGER('GET_HISTORY');
      G$_CHECK_FAILURE;
      return;
   END IF;
 END IF;
--
 IF :FRBPROP_STATUS_CODE IS NOT NULL THEN
   IF :HOLD_STATUS_CODE <> :FRBPROP_STATUS_CODE THEN
      EXECUTE_TRIGGER('GET_HISTORY');
      G$_CHECK_FAILURE;
      return;
   END IF;
 END IF; 
--
IF :frbprop_STATUS_date IS NOT NULL THEN
   IF :HOLD_STATUS_date <> :frbprop_STATUS_date THEN
      EXECUTE_TRIGGER('GET_HISTORY');
      G$_CHECK_FAILURE;
   END IF;
 END IF;
--
-- 54-0033
-- CASE 1: Alt desc changed from null to not null
IF :frbprop_alternate_status_desc IS NOT NULL THEN
   IF :HOLD_ALT_STATUS_DESC is null THEN
   	  EXECUTE_TRIGGER('GET_HISTORY');
      G$_CHECK_FAILURE;
   END IF;
END IF;

-- CASE 2: Alt desc changed (not null to not null)
IF :frbprop_alternate_status_desc IS NOT NULL THEN
   IF :HOLD_ALT_STATUS_DESC <> :frbprop_alternate_status_desc THEN
      EXECUTE_TRIGGER('GET_HISTORY');
      G$_CHECK_FAILURE;
      return;
   END IF;
END IF;

-- CASE 3: Alt desc changed from not null to null
IF :frbprop_alternate_status_desc IS NULL and :HOLD_ALT_STATUS_DESC IS NOT NULL THEN
      EXECUTE_TRIGGER('GET_HISTORY');
      G$_CHECK_FAILURE;
      return;
END IF;
 
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP.PRE-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowUpdate
		public void frbprop_BeforeRowUpdate(RowAdapterEvent args)
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)args.getRow();


				if ( getTask().getGoqrpls().gNchk( toBool(getFormModel().getFormHeader().getCommitInd().notEquals("Y"))).getValue() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0087"), toStr("FORM"), toStr("Select SAVE to perform a Commit.")));
					throw new ApplicationException();
				}
				// 
				executeAction("SET_FIELDS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("RE_EDIT");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("UPDATE_ACTIVITY_DATE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("UPDATE_USER_ID");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("CHECK_TEXT");
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( !frbpropElement.getFrbpropStatusCode().isNull() )
				{
					if ( getFormModel().getFormHeader().getHoldStatusCode().isNull() )
					{
						executeAction("GET_HISTORY");
						getTask().getGoqrpls().gCheckFailure();
						return ;
					}
				}
				// 
				if ( !frbpropElement.getFrbpropStatusCode().isNull() )
				{
					if ( getFormModel().getFormHeader().getHoldStatusCode().notEquals(frbpropElement.getFrbpropStatusCode()) )
					{
						executeAction("GET_HISTORY");
						getTask().getGoqrpls().gCheckFailure();
						return ;
					}
				}
				// 
				if ( !frbpropElement.getFrbpropStatusDate().isNull() )
				{
					if ( getFormModel().getFormHeader().getHoldStatusDate().notEquals(frbpropElement.getFrbpropStatusDate()) )
					{
						executeAction("GET_HISTORY");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
				// 
				//  54-0033
				//  CASE 1: Alt desc changed from null to not null
				if ( !frbpropElement.getFrbpropAlternateStatusDesc().isNull() )
				{
					if ( getFormModel().getFormHeader().getHoldAltStatusDesc().isNull() )
					{
						executeAction("GET_HISTORY");
						getTask().getGoqrpls().gCheckFailure();
					}
				}
				//  CASE 2: Alt desc changed (not null to not null)
				if ( !frbpropElement.getFrbpropAlternateStatusDesc().isNull() )
				{
					if ( getFormModel().getFormHeader().getHoldAltStatusDesc().notEquals(frbpropElement.getFrbpropAlternateStatusDesc()) )
					{
						executeAction("GET_HISTORY");
						getTask().getGoqrpls().gCheckFailure();
						return ;
					}
				}
				//  CASE 3: Alt desc changed from not null to null
				if ( frbpropElement.getFrbpropAlternateStatusDesc().isNull() && !getFormModel().getFormHeader().getHoldAltStatusDesc().isNull() )
				{
					executeAction("GET_HISTORY");
					getTask().getGoqrpls().gCheckFailure();
					return ;
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP.PRE-INSERT
		 BEGIN
   IF G$_NCHK(:commit_ind <> 'Y') THEN
      MESSAGE(  G$_NLS.Get('FRAPROP-0088', 'FORM','Select SAVE to perform a Commit.')  ) ;
      RAISE FORM_TRIGGER_FAILURE ;
   END IF ;
--
  EXECUTE_TRIGGER('SET_FIELDS');
  G$_CHECK_FAILURE;
--
  EXECUTE_TRIGGER('RE_EDIT');
  G$_CHECK_FAILURE;
--
  IF :DISPLAY_FRBPROP_CODE = :FORM_HEADER.NEXT_DOC_NUM THEN
     EXECUTE_TRIGGER('GEN_DOC_NUMBER');
     G$_CHECK_FAILURE;
  ELSE
     :FRBPROP_CODE := :DISPLAY_FRBPROP_CODE;
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
   	IF :frbprop_status_code IS NOT NULL THEN
      EXECUTE_TRIGGER('GET_HISTORY');
      G$_CHECK_FAILURE;
	END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP.PRE-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeRowInsert
		public void frbprop_BeforeRowInsert(RowAdapterEvent args)
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)args.getRow();


				if ( getTask().getGoqrpls().gNchk(toBool(getFormModel().getFormHeader().getCommitInd().notEquals("Y"))).getValue() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0088"), toStr("FORM"), toStr("Select SAVE to perform a Commit.")));
					throw new ApplicationException();
				}
				// 
				executeAction("SET_FIELDS");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("RE_EDIT");
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( getFormModel().getKeyBlock().getDisplayFrbpropCode().equals(getFormModel().getFormHeader().getNextDocNum()) )
				{
					executeAction("GEN_DOC_NUMBER");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					frbpropElement.setFrbpropCode(getFormModel().getKeyBlock().getDisplayFrbpropCode());
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
				if ( !frbpropElement.getFrbpropStatusCode().isNull() )
				{
					executeAction("GET_HISTORY");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP.POST-DELETE
		 EXECUTE_TRIGGER('DELETE_TEXT');
G$_CHECK_FAILURE;
--
EXECUTE_TRIGGER('DELETE_LOCN');
G$_CHECK_FAILURE;
--
EXECUTE_TRIGGER('DELETE_FRVPRST');
G$_CHECK_FAILURE;
--
EXECUTE_TRIGGER('DELETE_FRRPRPI');
G$_CHECK_FAILURE;
--
EXECUTE_TRIGGER('DELETE_FRRPUSN');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP.POST-DELETE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowDelete
		public void frbprop_AfterRowDelete(RowAdapterEvent args)
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
				executeAction("DELETE_FRRPRPI");
				getTask().getGoqrpls().gCheckFailure();
				// 
				executeAction("DELETE_FRRPUSN");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP.WHEN-NEW-ITEM-INSTANCE
		  IF :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN
      IF (:SYSTEM.TRIGGER_ITEM = 'FRBPROP.FRBPROP_COAS_CODE' OR 
          :SYSTEM.TRIGGER_ITEM = 'FRBPROP.FRBPROP_ORGN_CODE_RESP_OFFICE') THEN
         RETURN;
      END IF;
--
      EXECUTE_TRIGGER('CHECK_SECURITY_ENTERED');
      G$_CHECK_FAILURE;
--
 END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", function=KeyFunction.ITEM_CHANGE)
		public void frbprop_itemChange()
		{
			
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
					if ((getTriggerItem().equals("FRBPROP.FRBPROP_COAS_CODE") || getTriggerItem().equals("FRBPROP.FRBPROP_ORGN_CODE_RESP_OFFICE")))
					{
						return ;
					}
					// 
					executeAction("CHECK_SECURITY_ENTERED");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP.POST-RECORD
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
		 * FRBPROP.POST-RECORD
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-RECORD")
		public void frbprop_PostRecord()
		{
			
				if ( getMode().equals("QUERY") )
				{
					return ;
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP.POST-INSERT
		 IF :COPY_FUNCT_PROCESS = 'Y' THEN
   			COPY_INSERT_FRBPROP.COPY_INSERT_FOBTEXT;
   			COPY_INSERT_FRBPROP.COPY_INSERT_FRRPLOC;
   			COPY_INSERT_FRBPROP.COPY_INSERT_FRRPRPI;
   			COPY_INSERT_FRBPROP.COPY_INSERT_FRRPUSN;
   			COPY_INSERT_FRBPROP.COPY_INSERT_FRRPRPT;
ELSE
  		IF :FRBPROP_PI_ID_CODE IS NOT NULL THEN
     			INSERT_FRRPRPI_1;
     			G$_CHECK_FAILURE;
  		END IF;
END IF;



		
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP.POST-INSERT
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowInsert
		public void frbprop_AfterRowInsert(RowAdapterEvent args)
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)args.getRow();


				if ( getFormModel().getFormHeader().getCopyFunctProcess().equals("Y") )
				{
					getTask().getCopyInsertFrbprop().copyInsertFobtext(frbpropElement);
					getTask().getCopyInsertFrbprop().copyInsertFrrploc();
					getTask().getCopyInsertFrbprop().copyInsertFrrprpi();
					getTask().getCopyInsertFrbprop().copyInsertFrrpusn();
					getTask().getCopyInsertFrbprop().copyInsertFrrprpt(frbpropElement);
				}
				else {
					if ( !frbpropElement.getFrbpropPiIdCode().isNull() )
					{
						this.getTask().getServices().insertFrrprpi1(frbpropElement);
						getTask().getGoqrpls().gCheckFailure();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP.POST-UPDATE
		 <multilinecomment>IF :FRBPROP_PI_ID_CODE IS NOT NULL THEN
  IF :HOLD_PI_ID_CODE <> :FRBPROP_PI_ID_CODE THEN
     UPDATE_FRRPRPI_1;
     G$_CHECK_FAILURE;
  END IF;
END IF;</multilinecomment>
 IF :FRRPRPI_FRBPROP_COPY_ID = 'N' OR :FRRPRPI_FRBPROP_COPY_ID IS NULL THEN
    IF :FRBPROP_PI_ID_CODE IS NOT NULL THEN
      IF :HOLD_PI_ID_CODE IS NOT NULL THEN
            IF :HOLD_PI_ID_CODE <> :FRBPROP_PI_ID_CODE THEN
               UPDATE_FRRPRPI_1;
               G$_CHECK_FAILURE;
            END IF;
     ELSE
         INSERT_FRRPRPI_1;
     END IF;
  ELSE 
    IF :HOLD_PI_ID_CODE IS NOT NULL AND :FRBPROP_PI_ID_CODE IS NULL THEN
       DELETE_FRRPRPI_1;
      G$_CHECK_FAILURE;
    END IF;
 END IF;
END IF;
--
  :FRRPRPI_FRBPROP_COPY_ID := 'N';




		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP.POST-UPDATE
		 *
		 *
		 *</p>
		 * @param args
		*/

		@AfterRowUpdate
		public void frbprop_AfterRowUpdate(RowAdapterEvent args)
		{
			
				// IF :FRBPROP_PI_ID_CODE IS NOT NULL THEN
				// IF :HOLD_PI_ID_CODE <> :FRBPROP_PI_ID_CODE THEN
				// UPDATE_FRRPRPI_1;
				// G$_CHECK_FAILURE;
				// END IF;
				// END IF;
				FrbpropAdapter frbpropElement = (FrbpropAdapter)args.getRow();


				// IF :FRBPROP_PI_ID_CODE IS NOT NULL THEN
				// IF :HOLD_PI_ID_CODE <> :FRBPROP_PI_ID_CODE THEN
				// UPDATE_FRRPRPI_1;
				// G$_CHECK_FAILURE;
				// END IF;
				// END IF;
				if ( getFormModel().getFormHeader().getFrrprpiFrbpropCopyId().equals("N") || getFormModel().getFormHeader().getFrrprpiFrbpropCopyId().isNull() )
				{
					if ( !frbpropElement.getFrbpropPiIdCode().isNull() )
					{
						if ( !getFormModel().getFormHeader().getHoldPiIdCode().isNull() )
						{
							if ( getFormModel().getFormHeader().getHoldPiIdCode().notEquals(frbpropElement.getFrbpropPiIdCode()) )
							{
								this.getTask().getServices().updateFrrprpi1(frbpropElement);
								getTask().getGoqrpls().gCheckFailure();
							}
						}
						else {
							this.getTask().getServices().insertFrrprpi1(frbpropElement);
						}
					}
					else {
						if ( !getFormModel().getFormHeader().getHoldPiIdCode().isNull() && frbpropElement.getFrbpropPiIdCode().isNull() )
						{
							this.getTask().getServices().deleteFrrprpi1(frbpropElement);
							getTask().getGoqrpls().gCheckFailure();
						}
					}
				}
				// 
				getFormModel().getFormHeader().setFrrprpiFrbpropCopyId(toStr("N"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP.KEY-DUP-ITEM
		 if :System.Record_Status NOT IN ('NEW','INSERT') then
    MESSAGE( G$_NLS.Get('FRAPROP-0089', 'FORM','This function not allowed when a record is already present.') );
    RAISE FORM_TRIGGER_FAILURE;
end if;
--
EXECUTE_TRIGGER('SET_REQUIRED_OFF');
--
message( G$_NLS.Get('FRAPROP-0090', 'FORM','Existing Information will be overriden') );
--
go_item('COPY_BLOCK.COPY_PROP_CODE');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP.KEY-DUP-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DUP-ITEM", function=KeyFunction.DUPLICATE_ITEM)
		public void frbprop_KeyDupItem()
		{
			
				// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
				if ( !(getRecordStatus().equals("NEW") || getRecordStatus().equals("INSERT")) )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0089"), toStr("FORM"), toStr("This function not allowed when a record is already present.")));
					throw new ApplicationException();
				}
				// 
				executeAction("SET_REQUIRED_OFF");
				// 
				warningMessage(GNls.Fget(toStr("FRAPROP-0090"), toStr("FORM"), toStr("Existing Information will be overriden")));
				// 
				goItem(toStr("COPY_BLOCK.COPY_PROP_CODE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP.KEY-DELREC
		 DECLARE
 VAR_EXIST  VARCHAR2(1);
 CURSOR C1 IS
   SELECT 'X'
     FROM FRBBUDP
    WHERE FRBBUDP_PROP_CODE = :DISPLAY_FRBPROP_CODE;
BEGIN
 OPEN C1;
 FETCH C1 INTO VAR_EXIST;
 IF C1%FOUND THEN
    MESSAGE( G$_NLS.Get('FRAPROP-0091', 'FORM','Proposal cannot be deleted when Budget Records exist.') );
    RAISE FORM_TRIGGER_FAILURE;
 ELSE
    if :del_ready = 'N' then
   	   :del_ready := 'Y';
   	   message(G$_NLS.Get('FRAPROP-0092', 'FORM','Press ''Delete Record'' again to Delete this Record.'));
   	   raise form_trigger_failure;
    end if;
   
    :del_ready := 'N';
	
    if get_item_property(:SYSTEM.CURSOR_ITEM,ITEM_TAB_PAGE) = 'HEADER_INFORMATION' then
       delete_record;
       execute_trigger('FORCE_COMMIT');
       g$_check_failure;
    else
       clear_fields(:SYSTEM.CURSOR_BLOCK,:SYSTEM.CURSOR_ITEM);
    end if;
 END IF;
 CLOSE C1;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP.KEY-DELREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DELREC", function=KeyFunction.DELETE_RECORD)
		public void frbprop_DeleteRecord()
		{
			
				int rowCount = 0;
				{
					NString varExist= NString.getNull();
					String sqlc1 = "SELECT 'X' " +
	" FROM FRBBUDP " +
	" WHERE FRBBUDP_PROP_CODE = :DISPLAY_FRBPROP_CODE ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("DISPLAY_FRBPROP_CODE", getFormModel().getKeyBlock().getDisplayFrbpropCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							varExist = c1Results.getStr(0);
						}
						if ( c1.found() )
						{
							errorMessage(GNls.Fget(toStr("FRAPROP-0091"), toStr("FORM"), toStr("Proposal cannot be deleted when Budget Records exist.")));
							throw new ApplicationException();
						}
						else {
							if ( getFormModel().getFormHeader().getDelReady().equals("N") )
							{
								getFormModel().getFormHeader().setDelReady(toStr("Y"));
								errorMessage(GNls.Fget(toStr("FRAPROP-0092"), toStr("FORM"), toStr("Press 'Delete Record' again to Delete this Record.")));
								throw new ApplicationException();
							}
							getFormModel().getFormHeader().setDelReady(toStr("N"));
//							if ( SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.ITEM_TAB_PAGE).equals("HEADER_INFORMATION") )
							if (getCanvasTopMostTabPage("FFRAPROP_1_TAB_CANVAS").equals("HEADER_INFORMATION") )
							{
								// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
								deleteRecord();
								executeAction("FORCE_COMMIT");
								getTask().getGoqrpls().gCheckFailure();
							}
							else {
								this.getTask().getServices().clearFields(toStr(getCursorBlock()), toStr(getCursorItem()));
							}
						}
						c1.close();
					}
					finally{
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP.KEY-CREREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP.KEY-CREREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CREREC", function=KeyFunction.CREATE_RECORD)
		public void frbprop_CreateRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP.KEY-CLRREC
		 if get_item_property(:SYSTEM.CURSOR_ITEM,ITEM_CANVAS) = 'FRAPROP_1_CANVAS' AND
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
		 * FRBPROP.KEY-CLRREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRREC", function=KeyFunction.CLEAR_RECORD)
		public void frbprop_ClearRecord()
		{
			
				// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
				if ( getItemCanvas(getCursorItem()).equals("FRAPROP_1_CANVAS") && (getRecordStatus().equals("QUERY") || getRecordStatus().equals("CHANGED")) )
				{
					executeAction("INVALID_FUNCTION_MSG");
					getTask().getGoqrpls().gCheckFailure();
				}
				else {
					this.getTask().getServices().clearFields(toStr(getCursorBlock()), toStr(getCursorItem()));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP.KEY-NXTREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP.KEY-NXTREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NXTREC", function=KeyFunction.NEXT_RECORD)
		public void frbprop_NextRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP.KEY-UP
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP.KEY-UP
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-UP", function=KeyFunction.PREVIOUS_RECORD)
		public void frbprop_MoveUp()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP.KEY-DOWN
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP.KEY-DOWN
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-DOWN", function=KeyFunction.NEXT_RECORD)
		public void frbprop_MoveDown()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP.KEY-CLRBLK
		  clear_fields(:SYSTEM.CURSOR_BLOCK,:SYSTEM.CURSOR_ITEM);
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP.KEY-CLRBLK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CLRBLK", function=KeyFunction.CLEAR_BLOCK)
		public void frbprop_keyClearBlock()
		{
			
				this.getTask().getServices().clearFields(toStr(getCursorBlock()), toStr(getCursorItem()));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP.KEY-PRVREC
		 EXECUTE_TRIGGER('INVALID_FUNCTION_MSG');
G$_CHECK_FAILURE;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP.KEY-PRVREC
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PRVREC", function=KeyFunction.PREVIOUS_RECORD)
		public void frbprop_PreviousRecord()
		{
			
				executeAction("INVALID_FUNCTION_MSG");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP.WHEN-NEW-RECORD-INSTANCE
		 -- Fix for defect # 1-8KTK2 begins
BEGIN
	 EXECUTE_TRIGGER('VALIDATE_AGENCY_CODE');
   G$_CHECK_FAILURE;
   
   EXECUTE_TRIGGER('VALIDATE_CFDA_CODE');
   G$_CHECK_FAILURE;
END;
-- Fix for defect # 1-8KTK2 ends
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP.WHEN-NEW-RECORD-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-RECORD-INSTANCE", function=KeyFunction.RECORD_CHANGE)
		public void frbprop_recordChange()
		{
			
				//  Fix for defect # 1-8KTK2 begins
				executeAction("VALIDATE_AGENCY_CODE");
				getTask().getGoqrpls().gCheckFailure();
				executeAction("VALIDATE_CFDA_CODE");
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP.PRE-QUERY
		 *
		 *
		 *</p>
		 * @param args
		*/

		@BeforeQuery
		public void frbprop_BeforeQuery(QueryEvent args)
		{
			
               // F2J_WARNING : Query Parameters initialization. Make sure that all the query parameters are properly initialized

				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("KEY_BLOCK_DISPLAY_FRBPROP_CODE", this.getFormModel().getKeyBlock().getDisplayFrbpropCode()));             


				((IDBBusinessObject)args.getSource()).getSelectCommandParams().add(DbManager.getDataBaseFactory().createDataParameter("FORM_HEADER_NEXT_DOC_NUM", this.getFormModel().getFormHeader().getNextDocNum()));             


           
               }

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_COAS_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBPROP_COAS_CODE")
		public void frbpropCoasCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick(); //.doubleClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_COAS_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_COAS_CODE", function=KeyFunction.ITEM_CHANGE)
		public void frbpropCoasCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_COAS_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void frbpropCoasCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_COAS_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_COAS_CODE", function=KeyFunction.NEXT_ITEM)
		public void frbpropCoasCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem(); //.nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_COAS_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_COAS_CODE", function=KeyFunction.ITEM_OUT)
		public void frbpropCoasCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_COAS_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVCOAS_COAS_CODE', 'FTVCOAS_TITLE',
   G$_SEARCH_WHERE.F_FTVCOAS_ENTRY('SYSDATE'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_COAS_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void frbpropCoasCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVCOAS_COAS_CODE"), toStr("FTVCOAS_TITLE"), getTask().getGoqrpls().getGSearchWhere().fFtvcoasEntry(toStr("SYSDATE")));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_COAS_CODE.POST-CHANGE
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
		 * FRBPROP_COAS_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_COAS_CODE")
		public void frbpropCoasCode_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropCoasCode().isNull())
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

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_COAS_CODE.POST_TEXT_ITEMXXX
		 IF :FRBPROP_COAS_CODE IS NULL THEN
   MESSAGE( G$_NLS.Get('FRAPROP-0093', 'FORM','Chart of Accounts Code must be entered.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_COAS_CODE.POST_TEXT_ITEMXXX
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST_TEXT_ITEMXXX")
		public void frbpropCoasCode_PostTextItemxxx()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( frbpropElement.getFrbpropCoasCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0093"), toStr("FORM"), toStr("Chart of Accounts Code must be entered.")));
					throw new ApplicationException();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_COAS_CODE.KEY-PREV-ITEM
		 go_item('frbprop_sponsor_id');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_COAS_CODE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="FRBPROP_COAS_CODE", function=KeyFunction.PREVIOUS_ITEM)
		public void frbpropCoasCode_PreviousItem()
		{
			
				goItem(toStr("frbprop_sponsor_id"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_ORGN_CODE_RESP_OFFICE.WHEN-VALIDATE-ITEM
		 BEGIN
	 IF NAME_IN(:SYSTEM.TRIGGER_ITEM) IS NULL THEN
      COPY(NULL, NAME_IN('SYSTEM.TRIGGER_BLOCK')||'.'||GET_ITEM_PROPERTY(:SYSTEM.TRIGGER_ITEM, NEXTITEM));
   END IF;

   EXCEPTION
      -- Description didn't exist
      WHEN FORM_TRIGGER_FAILURE THEN
         NULL;
END;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_ORGN_CODE_RESP_OFFICE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_ORGN_CODE_RESP_OFFICE")
		public void frbpropOrgnCodeRespOffice_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


			this.frbpropOrgnCodeRespOffice_PostChange();

				try
				{
					if ( getNameIn(getTriggerItem()).isNull() )
					{
						copy(null,getTriggerBlock().append(".").append(getItemNextItem(getTriggerItem())));
					}
				}
				catch(ApplicationException e)
				{
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_ORGN_CODE_RESP_OFFICE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVORGN_ORGN_CODE', 'FTVORGN_TITLE', 
   G$_SEARCH_WHERE.F_FTVORGN_ENTRY(':FRBPROP_COAS_CODE', 'SYSDATE'));


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_ORGN_CODE_RESP_OFFICE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void frbpropOrgnCodeRespOffice_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVORGN_ORGN_CODE"), toStr("FTVORGN_TITLE"), getTask().getGoqrpls().getGSearchWhere().fFtvorgnEntry(toStr(":FRBPROP_COAS_CODE"), toStr("SYSDATE")));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_ORGN_CODE_RESP_OFFICE.POST-CHANGE
		 BEGIN
   G$_CHECK_QUERY_MODE ;
--
   if :from_new_item = 'N' and :key_block.display_frbprop_code <> :FORM_HEADER.NEXT_DOC_NUM then
     :frbprop_orgn_code_resp_office := :hold_orgn;
     :orgn_code_descr := :hold_desc;
     return;
   end if;
   IF :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN 
   IF :FRBPROP_ORGN_CODE_RESP_OFFICE  IS  NOT NULL  THEN
      EXECUTE_TRIGGER('ENABLE_BUTTONS_AFTER_PASSW');
      G$_CHECK_FAILURE;
      EXECUTE_TRIGGER( 'EDIT_ORGN_CODE' ) ;
      G$_CHECK_FAILURE ; 
   END IF;
   :hold_orgn := :frbprop_orgn_code_resp_office;
END IF;

--
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
		 * FRBPROP_ORGN_CODE_RESP_OFFICE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_ORGN_CODE_RESP_OFFICE")
		public void frbpropOrgnCodeRespOffice_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropOrgnCodeRespOffice().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if ( getFormModel().getFormHeader().getFromNewItem().equals("N") && getFormModel().getKeyBlock().getDisplayFrbpropCode().notEquals(getFormModel().getFormHeader().getNextDocNum()) )
					{
						frbpropElement.setFrbpropOrgnCodeRespOffice(getFormModel().getFormHeader().getHoldOrgn());
						frbpropElement.setOrgnCodeDescr(getFormModel().getFormHeader().getHoldDesc());
						return ;
					}
					if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
					{
						if ( !frbpropElement.getFrbpropOrgnCodeRespOffice().isNull() )
						{
							executeAction("ENABLE_BUTTONS_AFTER_PASSW");
							getTask().getGoqrpls().gCheckFailure();
							executeAction("EDIT_ORGN_CODE");
							getTask().getGoqrpls().gCheckFailure();
						}
						getFormModel().getFormHeader().setHoldOrgn(frbpropElement.getFrbpropOrgnCodeRespOffice());
					}
					// 
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

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_ORGN_CODE_RESP_OFFICE.POST-TEXT-ITEM
		 :from_new_item := 'I';
IF :FRBPROP_ORGN_CODE_RESP_OFFICE IS NOT NULL THEN  --87303
  EXECUTE_TRIGGER('EDIT_ORGN_SECURITY');
  G$_CHECK_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_ORGN_CODE_RESP_OFFICE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_ORGN_CODE_RESP_OFFICE", function=KeyFunction.ITEM_OUT)
		public void frbpropOrgnCodeRespOffice_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				getFormModel().getFormHeader().setFromNewItem(toStr("I"));
				if ( !frbpropElement.getFrbpropOrgnCodeRespOffice().isNull() )
				{
					// 87303
					executeAction("EDIT_ORGN_SECURITY");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_ORGN_CODE_RESP_OFFICE.KEY-LISTVAL
		 IF :FRBPROP_COAS_CODE IS NULL THEN
   GO_ITEM('FRBPROP_COAS_CODE');
   MESSAGE( G$_NLS.Get('FRAPROP-0094', 'FORM','Chart of Accounts Code must be entered.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
--
BEGIN
G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
G$_CHECK_FAILURE;	
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
       MESSAGE( G$_NLS.Get('FRAPROP-0095', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_ORGN_CODE_RESP_OFFICE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBPROP_ORGN_CODE_RESP_OFFICE", function=KeyFunction.LIST_VALUES)
		public void frbpropOrgnCodeRespOffice_ListValues()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( frbpropElement.getFrbpropCoasCode().isNull() )
				{
					goItem(toStr("FRBPROP_COAS_CODE"));
					errorMessage(GNls.Fget(toStr("FRAPROP-0094"), toStr("FORM"), toStr("Chart of Accounts Code must be entered.")));
					throw new ApplicationException();
				}
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FTVORGN"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") || 
							(
//							TODO MORPHIS: get support to migrate 		
//							SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.UPDATE_NULL).equals("TRUE") && 
							(INullable)getItemValue(getCursorItem())).isNull() || //(SupportClasses.AppContext.CursorValue) == null) ||
							(!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAPROP-0095"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_ORGN_CODE_RESP_OFFICE.WHEN-NEW-ITEM-INSTANCE
		 G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
G$_CHECK_FAILURE ;
--
IF :FRBPROP_COAS_CODE IS NULL THEN
   GO_ITEM('FRBPROP_COAS_CODE');
   MESSAGE( G$_NLS.Get('FRAPROP-0096', 'FORM','Chart of Accounts Code must be entered.') );
   RAISE FORM_TRIGGER_FAILURE;
END IF;
     :hold_orgn := :frbprop_orgn_code_resp_office;
     :hold_desc := :orgn_code_descr;
IF :GLOBAL.FUND_ORG_SECURITY_IND = 'Y' THEN 
     :from_new_item := 'Y';
   IF :FRBPROP_ORGN_CODE_RESP_OFFICE  IS  NOT NULL  THEN
      EXECUTE_TRIGGER('ENABLE_BUTTONS_AFTER_PASSW');
      G$_CHECK_FAILURE;
      <multilinecomment> 1-BMV7IL
      EXECUTE_TRIGGER( 'EDIT_ORGN_CODE' ) ;
      G$_CHECK_FAILURE ;</multilinecomment>
      EXECUTE_TRIGGER( 'EDIT_ORGN_SEC_for_commit' ) ;
      G$_CHECK_FAILURE ;
    END IF;
END IF;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_ORGN_CODE_RESP_OFFICE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_ORGN_CODE_RESP_OFFICE", function=KeyFunction.ITEM_CHANGE)
		public void frbpropOrgnCodeRespOffice_itemChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				// 
				if ( frbpropElement.getFrbpropCoasCode().isNull() )
				{
					goItem(toStr("FRBPROP_COAS_CODE"));
					errorMessage(GNls.Fget(toStr("FRAPROP-0096"), toStr("FORM"), toStr("Chart of Accounts Code must be entered.")));
					throw new ApplicationException();
				}
				getFormModel().getFormHeader().setHoldOrgn(frbpropElement.getFrbpropOrgnCodeRespOffice());
				getFormModel().getFormHeader().setHoldDesc(frbpropElement.getOrgnCodeDescr());
				if ( getGlobal("FUND_ORG_SECURITY_IND").equals("Y") )
				{
					getFormModel().getFormHeader().setFromNewItem(toStr("Y"));
					if ( !frbpropElement.getFrbpropOrgnCodeRespOffice().isNull() )
					{
						executeAction("ENABLE_BUTTONS_AFTER_PASSW");
						getTask().getGoqrpls().gCheckFailure();
						//  1-BMV7IL
						// EXECUTE_TRIGGER( 'EDIT_ORGN_CODE' ) ;
						// G$_CHECK_FAILURE ;
						executeAction("EDIT_ORGN_SEC_for_commit");
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

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_LONG_TITLE.POST-CHANGE
		 if :frbprop.frbprop_title is null then
   :frbprop.frbprop_title := substr(:frbprop.frbprop_long_title,1,35);
end if;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_LONG_TITLE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_LONG_TITLE")
		public void frbpropLongTitle_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropLongTitle().isNull())
		return;
				if ( frbpropElement.getFrbpropTitle().isNull() )
				{
					frbpropElement.setFrbpropTitle(substring(frbpropElement.getFrbpropLongTitle(), toInt(1), toInt(35)));
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_AGENCY_CODE.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="FRBPROP_AGENCY_CODE", function=KeyFunction.ITEM_IN)
		public void frbpropAgencyCode_itemIn()
		{
			
				getGIdClass().itemIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_AGENCY_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_AGENCY_CODE", function=KeyFunction.NEXT_ITEM)
		public void frbpropAgencyCode_keyNexItem()
		{
			
				getGIdClass().keyNexItem(); //.nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_AGENCY_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_AGENCY_CODE")
		public void frbpropAgencyCode_PostChange()
		{
			
				getGIdClass().postChange();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_AGENCY_CODE.WHEN-VALIDATE-ITEM
		 IF :FRBPROP_AGENCY_CODE IS NULL THEN
  :FRBPROP_AGENCY_NAME := '';
  :FRBPROP_AGENCY_PIDM := '';  
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

  CURSOR s_pidm IS
    SELECT SPRIDEN_PIDM
    FROM   SPRIDEN
    WHERE  SPRIDEN_ID = :FRBPROP.FRBPROP_AGENCY_code;

  cursor validate_pidm is
    select ftvagcy_agcy_code_pidm 
    from   ftvagcy
    where  ftvagcy_agcy_code_pidm = hold_pidm;
    
-- Fix for defect # 1-8KTK2 begins
-- check whether the agency is active or not.
  CURSOR AGCY_STATUS IS
    SELECT 'X' 
    FROM   FTVAGCY
    WHERE  FTVAGCY_AGCY_CODE_PIDM = hold_pidm
    AND    FTVAGCY_STATUS_IND = 'A';
    
  status      VARCHAR2(1);
-- Fix for defect # 1-8KTK2 ends
    
BEGIN
  :frbprop_agency_name := '';
  OPEN s_pidm;
  FETCH s_pidm INTO hold_pidm;
  CLOSE s_pidm;

  OPEN validate_pidm;
  FETCH validate_pidm into agency_pidm;
  IF validate_pidm%NOTFOUND THEN
    MESSAGE(G$_NLS.Get('FRAPROP-0097', 'FORM','Agency ID is new; please create Agency using FTMAGCY.'));
    CLOSE validate_pidm;
    RAISE FORM_TRIGGER_FAILURE;
  END IF;
  CLOSE validate_pidm;
  
-- Fix for defect # 1-8KTK2 begins
-- check whether the agency is active or not.
  OPEN AGCY_STATUS;
    FETCH AGCY_STATUS INTO status;
    G$_CHECK_VALUE(AGCY_STATUS%NOTFOUND, G$_NLS.Get('FRAPROP-0098', 'FORM', 'Agency is not active.'), TRUE);
  CLOSE AGCY_STATUS;
-- Fix for defect # 1-8KTK2 ends

  g$_sel_spriden_pidm_name(:frbprop.frbprop_agency_code, 'FRBPROP_AGENCY_NAME', 'Y', agency_pidm);
  :frbprop_agency_pidm := agency_pidm;
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
		 * FRBPROP_AGENCY_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_AGENCY_CODE")
		public void frbpropAgencyCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
			this.frbpropAgencyCode_PostChange();

				if ( frbpropElement.getFrbpropAgencyCode().isNull() )
				{
					frbpropElement.setFrbpropAgencyName(toStr(""));
					frbpropElement.setFrbpropAgencyPidm(toNumber(""));
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
					String sqlsPidm = "SELECT SPRIDEN_PIDM " +
	" FROM SPRIDEN " +
	" WHERE SPRIDEN_ID = :FRBPROP_FRBPROP_AGENCY_CODE ";
					DataCursor sPidm = new DataCursor(sqlsPidm);
					String sqlvalidatePidm = "SELECT ftvagcy_agcy_code_pidm " +
	" FROM ftvagcy " +
	" WHERE ftvagcy_agcy_code_pidm = :P_HOLD_PIDM ";
					DataCursor validatePidm = new DataCursor(sqlvalidatePidm);
					String sqlagcyStatus = "SELECT 'X' " +
	" FROM FTVAGCY " +
	" WHERE FTVAGCY_AGCY_CODE_PIDM = :P_HOLD_PIDM AND FTVAGCY_STATUS_IND = 'A' ";
					DataCursor agcyStatus = new DataCursor(sqlagcyStatus);
					NString status= NString.getNull();
					try {
						frbpropElement.setFrbpropAgencyName(toStr(""));
						//Setting query parameters
						sPidm.addParameter("FRBPROP_FRBPROP_AGENCY_CODE", frbpropElement.getFrbpropAgencyCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable sPidm.
						sPidm.open();
						ResultSet sPidmResults = sPidm.fetchInto();
						if ( sPidmResults != null ) {
							holdPidm = sPidmResults.getNumber(0);
						}
						sPidm.close();
						//Setting query parameters
						validatePidm.addParameter("P_HOLD_PIDM", holdPidm);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable validatePidm.
						validatePidm.open();
						ResultSet validatePidmResults = validatePidm.fetchInto();
						if ( validatePidmResults != null ) {
							agencyPidm = validatePidmResults.getNumber(0);
						}
						if ( validatePidm.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAPROP-0097"), toStr("FORM"), toStr("Agency ID is new; please create Agency using FTMAGCY.")));
							validatePidm.close();
							throw new ApplicationException();
						}
						validatePidm.close();
						//  Fix for defect # 1-8KTK2 begins
						//  check whether the agency is active or not.
						//Setting query parameters
						agcyStatus.addParameter("P_HOLD_PIDM", holdPidm);
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable agcyStatus.
						agcyStatus.open();
						ResultSet agcyStatusResults = agcyStatus.fetchInto();
						if ( agcyStatusResults != null ) {
							status = agcyStatusResults.getStr(0);
						}
						getTask().getGoqrpls().gCheckValue(toBool(agcyStatus.notFound()), GNls.Fget(toStr("FRAPROP-0098"), toStr("FORM"), toStr("Agency is not active.")), toBool(NBool.True));
						agcyStatus.close();
						//  Fix for defect # 1-8KTK2 ends
						Ref<NString> pId_ref = new Ref<NString>(frbpropElement.getFrbpropAgencyCode());
						Ref<NNumber> pPidm_ref = new Ref<NNumber>(agencyPidm);
						getTask().getGoqrpls().gSelSpridenPidmName(pId_ref, toStr("FRBPROP_AGENCY_NAME"), toStr("Y"), pPidm_ref);
						frbpropElement.setFrbpropAgencyCode(pId_ref.val);
						agencyPidm = pPidm_ref.val;
						frbpropElement.setFrbpropAgencyPidm(agencyPidm);
						//  
						executeAction("GET_AGCY_CODE_PRED_PIDM");
						getTask().getGoqrpls().gCheckFailure();
						executeAction("GET_AGENCY_CONTACT");
						getTask().getGoqrpls().gCheckFailure();
						executeAction("GET_ADDR_TYPE_SEQ_NUM");
						getTask().getGoqrpls().gCheckFailure();
					}
					finally{
						sPidm.close();
						validatePidm.close();
						agcyStatus.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_AGENCY_CODE.KEY-CQUERY
		 BEGIN
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
       MESSAGE( G$_NLS.Get('FRAPROP-0099', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_AGENCY_CODE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="FRBPROP_AGENCY_CODE", function=KeyFunction.COUNT_QUERY)
		public void frbpropAgencyCode_TotalResults()
		{
			
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FTIIDEN"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") || (
							//morphis TODO
//							SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.UPDATE_NULL).equals("TRUE") && 
							(INullable)getItemValue(getCursorItem())).isNull() ||
//							(SupportClasses.AppContext.CursorValue) == null) ||
							(!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAPROP-0099"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_AGENCY_CODE.KEY-LISTVAL
		 BEGIN
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
       MESSAGE( G$_NLS.Get('FRAPROP-0100', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_AGENCY_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBPROP_AGENCY_CODE", function=KeyFunction.LIST_VALUES)
		public void frbpropAgencyCode_ListValues()
		{
			
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FTIIDEN"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") || (
							//morphis TODO
//							(SupportClasses.FORMS40.GetItemProperty(getCursorItem(), SupportClasses.Property.UPDATE_NULL).equals("TRUE") &&
//									(SupportClasses.AppContext.CursorValue) == null) || 
							(INullable)getItemValue(getCursorItem())).isNull() ||
							(!getMode().equals("NORMAL") && getItemQueryAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("NEW") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) || (getRecordStatus().equals("INSERT") && getItemInsertAllowed(getCursorItem()).equals("TRUE")) )
					{
						// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
						executeAction("LIST_VALUES_COPY");
						setGlobal("VALUE", toStr(""));
						executeAction("NEXT_ITEM");
					}
					else {
						errorMessage(GNls.Fget(toStr("FRAPROP-0100"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_AGENCY_NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_AGENCY_NAME", function=KeyFunction.NEXT_ITEM)
		public void frbpropAgencyName_keyNexItem()
		{
			
				getGNameClass().keyNexItem(); //.nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PI_ID_CODE.PRE-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="PRE-TEXT-ITEM", item="FRBPROP_PI_ID_CODE", function=KeyFunction.ITEM_IN)
		public void frbpropPiIdCode_itemIn()
		{
			
				getGIdClass().itemIn();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PI_ID_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_PI_ID_CODE", function=KeyFunction.NEXT_ITEM)
		public void frbpropPiIdCode_keyNexItem()
		{
			
				getGIdClass().keyNexItem();  //.nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PI_ID_CODE.KEY-CQUERY
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-CQUERY", item="FRBPROP_PI_ID_CODE", function=KeyFunction.COUNT_QUERY)
		public void frbpropPiIdCode_TotalResults()
		{
			
				getGIdClass().totalResults();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PI_ID_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_PI_ID_CODE")
		public void frbpropPiIdCode_PostChange()
		{
			
				getGIdClass().postChange();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_PI_ID_CODE.WHEN-VALIDATE-ITEM
		 IF :FRBPROP_PI_ID_CODE IS NULL THEN
  :FRBPROP_PI_ID_NAME := '';
  :FRBPROP_PI_PIDM := '';
  RETURN;
END IF;
--
IF :POST_QUERY_IND = 'Y' THEN
  RETURN;
END IF;
--
:frbprop_pi_id_name := '';
g$_sel_spriden_pidm_name(:FRBPROP_pi_id_code, 'FRBPROP_PI_ID_NAME' ,'Y', :frbprop_pi_pidm);

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PI_ID_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_PI_ID_CODE")
		public void frbpropPiIdCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


			this.frbpropPiIdCode_PostChange();

				if ( frbpropElement.getFrbpropPiIdCode().isNull() )
				{
					frbpropElement.setFrbpropPiIdName(toStr(""));
					frbpropElement.setFrbpropPiPidm(toNumber(""));
					return ;
				}
				// 
				if ( getFormModel().getFormHeader().getPostQueryInd().equals("Y") )
				{
					return ;
				}
				// 
				frbpropElement.setFrbpropPiIdName(toStr(""));
				Ref<NString> pId_ref = new Ref<NString>(frbpropElement.getFrbpropPiIdCode());
				Ref<NNumber> pPidm_ref = new Ref<NNumber>(frbpropElement.getFrbpropPiPidm());
				getTask().getGoqrpls().gSelSpridenPidmName(pId_ref, toStr("FRBPROP_PI_ID_NAME"), toStr("Y"), pPidm_ref);
				frbpropElement.setFrbpropPiIdCode(pId_ref.val);
				frbpropElement.setFrbpropPiPidm(pPidm_ref.val);
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_PI_ID_CODE.KEY-LISTVAL
		 BEGIN
:GLOBAL.PERSONNEL_CODE:='Y';
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
       MESSAGE( G$_NLS.Get('FRAPROP-0101', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PI_ID_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBPROP_PI_ID_CODE", function=KeyFunction.LIST_VALUES)
		public void frbpropPiIdCode_ListValues()
		{
			
				setGlobal("PERSONNEL_CODE", toStr("Y"));
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FTIIDEN"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") || (
							//morphis TODO
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
						errorMessage(GNls.Fget(toStr("FRAPROP-0101"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PI_ID_NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_PI_ID_NAME", function=KeyFunction.NEXT_ITEM)
		public void frbpropPiIdName_keyNexItem()
		{
			
				getGNameClass().keyNexItem(); //.nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_PASS_THRU_IND.KEY-NEXT-ITEM
		 :frbprop.display_pass_thru_ind := 'N';
go_item('FRBPROP_ORIG_PREP_DATE');
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
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				frbpropElement.setDisplayPassThruInd(toStr("N"));
				goItem(toStr("FRBPROP_ORIG_PREP_DATE"));
			}

		
		/* Original PL/SQL code code for TRIGGER DISPLAY_PASS_THRU_IND.WHEN-CHECKBOX-CHANGED
		 IF :frbprop.display_pass_thru_ind = 'Y' THEN 
	DECLARE
		lv_pidm spriden.spriden_pidm%type := NULL;
		lv_id   spriden.spriden_id%type := NULL;
		
		CURSOR c1 IS
  		SELECT frrprpt_agcy_pidm, frrprpt_federal_fund_percent
	  	FROM   FRRPRPT
		  WHERE  frrprpt_prop_code = :display_frbprop_code;
		
		CURSOR c2 IS
		  SELECT spriden_pidm
			FROM   spriden s, ftvagcy f
			WHERE  f.ftvagcy_agcy_code_pidm = s.spriden_pidm 
			  and  spriden_entity_ind = 'C';
	BEGIN
		go_block ('FRRPRPT');
		go_item('frrprpt.frrprpt_agcy_pidm');
		RAISE FORM_TRIGGER_FAILURE;
		
	  OPEN c1;
   	FETCH c1 INTO :frrprpt.frrprpt_agcy_pidm, :frrprpt.frrprpt_federal_fund_percent;
	  IF :frrprpt.frrprpt_agcy_pidm IS NULL THEN
			RETURN;
	  ELSE
			OPEN c2;
			FETCH c2 INTO lv_pidm; 
			--1-19V7ZZD: The word "Agent" modified to "Agency" in the below message.
			G$_CHECK_VALUE(lv_pidm IS NULL,
		  	G$_NLS.Get('FRAPROP-0102', 'FORM','Agency Name not Found'), TRUE);
		  g$_sel_spriden_id_name(lv_pidm, 'FRRPRPT.FRRPRPT_AGCY_NAME', 'Y', lv_id);	
  	END IF;
	  CLOSE c1;
	  CLOSE c2;
  END;	
ELSE
  execute_trigger('get_pass_thru_details');
  IF :frbprop.display_pass_thru_ind = 'Y' THEN
		message(G$_NLS.Get('FRAPROP-0103', 'FORM','Pass Through Indicator Details Exist...Cannot Uncheck') );
		RAISE form_trigger_failure;
  ELSE
		:frbprop.display_pass_thru_ind := 'N';
		go_item('FRBPROP_ORIG_PREP_DATE');
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
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
				FrrprptAdapter frrprptElement = (FrrprptAdapter)this.getFormModel().getFrrprpt().getRowAdapter(true);


				int rowCount = 0;
				if ( frbpropElement.getDisplayPassThruInd().equals("Y") )
				{
					{
						NNumber lvPidm = NNumber.getNull();
						NString lvId = NString.getNull();
						String sqlc1 = "SELECT frrprpt_agcy_pidm, frrprpt_federal_fund_percent " +
	" FROM FRRPRPT " +
	" WHERE frrprpt_prop_code = :DISPLAY_FRBPROP_CODE ";
						DataCursor c1 = new DataCursor(sqlc1);
						String sqlc2 = "SELECT spriden_pidm " +
	" FROM spriden s, ftvagcy f " +
	" WHERE f.ftvagcy_agcy_code_pidm = s.spriden_pidm AND spriden_entity_ind = 'C' ";
						DataCursor c2 = new DataCursor(sqlc2);
						try {
							goBlock(toStr("FRRPRPT"));
							goItem(toStr("frrprpt.frrprpt_agcy_pidm"));
							throw new ApplicationException();
							//Setting query parameters
//							c1.addParameter("DISPLAY_FRBPROP_CODE", getFormModel().getKeyBlock().getDisplayFrbpropCode());
//							//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
//							c1.open();
//							ResultSet c1Results = c1.fetchInto();
//							if ( c1Results != null ) {
//								frrprptElement.setFrrprptAgcyPidm(c1Results.getNumber(0));
//								frrprptElement.setFrrprptFederalFundPercent(c1Results.getNumber(1));
//							}
//							if ( frrprptElement.getFrrprptAgcyPidm().isNull() )
//							{
//								return ;
//							}
//							else {
//								//F2J_WARNING : Make sure that the method "Close" is being called over the variable c2.
//								c2.open();
//								ResultSet c2Results = c2.fetchInto();
//								if ( c2Results != null ) {
//									lvPidm = c2Results.getNumber(0);
//								}
//								// 1-19V7ZZD: The word "Agent" modified to "Agency" in the below message.
//								getTask().getGoqrpls().gCheckValue(toBool(lvPidm.isNull()), GNls.Fget(toStr("FRAPROP-0102"), toStr("FORM"), toStr("Agency Name not Found")), toBool(NBool.True));
//								Ref<NString> pId_ref = new Ref<NString>(lvId);
//								getTask().getGoqrpls().gSelSpridenIdName(lvPidm, toStr("FRRPRPT.FRRPRPT_AGCY_NAME"), toStr("Y"), pId_ref);
//								lvId = pId_ref.val;
//							}
//							c1.close();
//							c2.close();
						}
						finally{
							c1.close();
							c2.close();
						}
					}
				}
				else {
					executeAction("get_pass_thru_details");
					if ( frbpropElement.getDisplayPassThruInd().equals("Y") )
					{
						errorMessage(GNls.Fget(toStr("FRAPROP-0103"), toStr("FORM"), toStr("Pass Through Indicator Details Exist...Cannot Uncheck")));
						throw new ApplicationException();
					}
					else {
						frbpropElement.setDisplayPassThruInd(toStr("N"));
						goItem(toStr("FRBPROP_ORIG_PREP_DATE"));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_ORIG_PREP_DATE.WHEN-NEW-ITEM-INSTANCE
		 g$_date_when_new_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_ORIG_PREP_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_ORIG_PREP_DATE", function=KeyFunction.ITEM_CHANGE)
		public void frbpropOrigPrepDate_itemChange()
		{
			
				getTask().getGoqrpls().gDateWhenNewItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_ORIG_PREP_DATE.POST-TEXT-ITEM
		 g$_date_post_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_ORIG_PREP_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_ORIG_PREP_DATE", function=KeyFunction.ITEM_OUT)
		public void frbpropOrigPrepDate_itemOut()
		{
			
				getTask().getGoqrpls().gDatePostItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_ORIG_PREP_DATE.POST-CHANGE
		 g$_date_reformat('',''); g$_check_failure;

<multilinecomment>BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_STEP_001 ;
   END IF ;
   G$_CHECK_VALUE ((TRUNC(:FRBPROP_DUE_DATE) < TRUNC(:FRBPROP_ORIG_PREP_DATE)
      AND  :FRBPROP_DUE_DATE IS NOT NULL),
'The due date must be greater than/equal to proposal original date', TRUE);
--
  << PTI_STEP_001 >>
--
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      G$_DATE_WHEN_NEW_ITEM;
      RAISE FORM_TRIGGER_FAILURE ;
END ;</multilinecomment>


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_ORIG_PREP_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_ORIG_PREP_DATE")
		public void frbpropOrigPrepDate_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropOrigPrepDate().isNull())
		return;

			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_ORIG_PREP_DATE.KEY-NEXT-ITEM
		 g$_date_reformat('',''); g$_check_failure;
next_item;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_ORIG_PREP_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_ORIG_PREP_DATE", function=KeyFunction.NEXT_ITEM)
		public void frbpropOrigPrepDate_keyNexItem()
		{

				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_DUE_DATE.WHEN-NEW-ITEM-INSTANCE
		 g$_date_when_new_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_DUE_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_DUE_DATE", function=KeyFunction.ITEM_CHANGE)
		public void frbpropDueDate_itemChange()
		{
			
				getTask().getGoqrpls().gDateWhenNewItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_DUE_DATE.POST-TEXT-ITEM
		 g$_date_post_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_DUE_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_DUE_DATE", function=KeyFunction.ITEM_OUT)
		public void frbpropDueDate_itemOut()
		{
			
				getTask().getGoqrpls().gDatePostItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_DUE_DATE.POST-CHANGE
		 G$_DATE_REFORMAT('',''); G$_CHECK_FAILURE;
--
<multilinecomment>BEGIN
   G$_CHECK_QUERY_MODE ;
--
   IF ( :GLOBAL.QUERY_MODE = '1' ) THEN
      GOTO PTI_STEP_001 ;
   END IF ;
   G$_CHECK_VALUE ((TRUNC(:FRBPROP_DUE_DATE) < TRUNC(:FRBPROP_ORIG_PREP_DATE)
      OR  :FRBPROP_ORIG_PREP_DATE IS NULL),
'The due date must be greater than/equal to proposal original date', TRUE);
--
  << PTI_STEP_001 >>
--
   :GLOBAL.QUERY_MODE := '0' ;
EXCEPTION
   WHEN FORM_TRIGGER_FAILURE THEN
      :GLOBAL.QUERY_MODE := '0' ;
      G$_DATE_WHEN_NEW_ITEM;
      RAISE FORM_TRIGGER_FAILURE ;
END ;</multilinecomment>


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_DUE_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_DUE_DATE")
		public void frbpropDueDate_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropDueDate().isNull())
		return;

			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_DUE_DATE.KEY-NEXT-ITEM
		 G$_DATE_REFORMAT('',''); G$_CHECK_FAILURE;
NEXT_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_DUE_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_DUE_DATE", function=KeyFunction.NEXT_ITEM)
		public void frbpropDueDate_keyNexItem()
		{

				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_SUBMITTED_DATE.WHEN-NEW-ITEM-INSTANCE
		 g$_date_when_new_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SUBMITTED_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_SUBMITTED_DATE", function=KeyFunction.ITEM_CHANGE)
		public void frbpropSubmittedDate_itemChange()
		{
			
				getTask().getGoqrpls().gDateWhenNewItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_SUBMITTED_DATE.POST-TEXT-ITEM
		 g$_date_post_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SUBMITTED_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_SUBMITTED_DATE", function=KeyFunction.ITEM_OUT)
		public void frbpropSubmittedDate_itemOut()
		{
			
				getTask().getGoqrpls().gDatePostItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_SUBMITTED_DATE.POST-CHANGE
		 g$_date_reformat('',''); g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SUBMITTED_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_SUBMITTED_DATE")
		public void frbpropSubmittedDate_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropSubmittedDate().isNull())
		return;

			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_SUBMITTED_DATE.KEY-NEXT-ITEM
		 g$_date_reformat('',''); g$_check_failure;
next_item;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SUBMITTED_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_SUBMITTED_DATE", function=KeyFunction.NEXT_ITEM)
		public void frbpropSubmittedDate_keyNexItem()
		{

				nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_STATUS_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBPROP_STATUS_CODE")
		public void frbpropStatusCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick(); //.doubleClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_STATUS_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_STATUS_CODE", function=KeyFunction.ITEM_CHANGE)
		public void frbpropStatusCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_STATUS_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void frbpropStatusCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_STATUS_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_STATUS_CODE", function=KeyFunction.NEXT_ITEM)
		public void frbpropStatusCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem(); //.nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_STATUS_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVSDAT_SDAT_CODE_OPT_1', 'FTVSDAT_TITLE',
   'WHERE FTVSDAT_SDAT_CODE_ENTITY=''FRBPROP'''||
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
		 * FRBPROP_STATUS_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void frbpropStatusCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVSDAT_SDAT_CODE_OPT_1"), toStr("FTVSDAT_TITLE"), toStr("WHERE FTVSDAT_SDAT_CODE_ENTITY='FRBPROP'").append(" AND FTVSDAT_SDAT_CODE_ATTR='STATUS_CODE'").append(" AND FTVSDAT_EFF_DATE <= SYSDATE").append(" AND (FTVSDAT_NCHG_DATE IS NULL").append(" OR FTVSDAT_NCHG_DATE > SYSDATE)").append(" AND FTVSDAT_STATUS_IND='A'"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_STATUS_CODE.POST-CHANGE
		 :frbprop.status_descr := '';
:frbprop.frbprop_alternate_status_desc := '';
execute_trigger('get_status_desc');
g$_check_failure;
:frbprop.status_descr := :form_header.store_org_status_desc ||' '||
	 											 :frbprop.frbprop_alternate_status_desc;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_STATUS_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_STATUS_CODE")
		public void frbpropStatusCode_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropStatusCode().isNull())
		return;
				frbpropElement.setStatusDescr(toStr(""));
				frbpropElement.setFrbpropAlternateStatusDesc(toStr(""));
				executeAction("get_status_desc");
				getTask().getGoqrpls().gCheckFailure();
				frbpropElement.setStatusDescr(getFormModel().getFormHeader().getStoreOrgStatusDesc().append(" ").append(frbpropElement.getFrbpropAlternateStatusDesc()));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_STATUS_CODE.KEY-LISTVAL
		 BEGIN
G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
G$_CHECK_FAILURE;
:GLOBAL.SDAT_COAS := '';
:GLOBAL.SDAT_ENTITY := 'FRBPROP';
:GLOBAL.SDAT_ATTR := 'STATUS_CODE';
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
       MESSAGE( G$_NLS.Get('FRAPROP-0104', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_STATUS_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBPROP_STATUS_CODE", function=KeyFunction.LIST_VALUES)
		public void frbpropStatusCode_ListValues()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("SDAT_COAS", toStr(""));
				setGlobal("SDAT_ENTITY", toStr("FRBPROP"));
				setGlobal("SDAT_ATTR", toStr("STATUS_CODE"));
				// 
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FOQSDLV"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") || (
							//morphis TODO
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
						errorMessage(GNls.Fget(toStr("FRAPROP-0104"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_STATUS_CODE.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
--
if :frbprop_status_code is null then
  :status_descr := '';
  return;
end if;
<multilinecomment>
else 
  :frbprop_status_date := sysdate;
end if;</multilinecomment>
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_STATUS_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_STATUS_CODE", function=KeyFunction.ITEM_OUT)
		public void frbpropStatusCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				getTask().getGoqrpls().getGSearch().postTextCode();
				// 
				if ( frbpropElement.getFrbpropStatusCode().isNull() )
				{
					frbpropElement.setStatusDescr(toStr(""));
					return ;
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_STATUS_CODE.ON-ERROR
		 IF ERROR_TYPE = 'FRM' and ERROR_CODE = 40831 THEN
	MESSAGE(G$_NLS.Get('FRAPROP-0105','FORM','Status Code cannot exceed 2 characters'));
	RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_STATUS_CODE.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/

		@OnError
		public void frbpropStatusCode_OnError(EventObject args)
		{
			
//				if ( SupportClasses.SQLFORMS.ErrorType().equals("FRM") && SupportClasses.SQLFORMS.ErrorCode().equals(40831) )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					message(GNls.Fget(toStr("FRAPROP-0105"), toStr("FORM"), toStr("Status Code cannot exceed 2 characters")));
					throw new ApplicationException();
//				}
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

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_ALTERNATE_STATUS_DESC.WHEN-VALIDATE-ITEM
		 IF :frbprop_alternate_status_desc IS NOT NULL and :frbprop.frbprop_status_code IS NULL THEN
		message( G$_NLS.Get('FRAPROP-0106', 'FORM','Status Code Should be Entered Before Alternate Desciption') );
		raise form_trigger_failure;
END IF;

:frbprop.status_descr := '';
:frbprop.status_descr := :form_header.store_org_status_desc ||' '||
												 :frbprop.frbprop_alternate_status_desc;
													 
	
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_ALTERNATE_STATUS_DESC.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_ALTERNATE_STATUS_DESC")
		public void frbpropAlternateStatusDesc_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( !frbpropElement.getFrbpropAlternateStatusDesc().isNull() && frbpropElement.getFrbpropStatusCode().isNull() )
				{
					errorMessage(GNls.Fget(toStr("FRAPROP-0106"), toStr("FORM"), toStr("Status Code Should be Entered Before Alternate Desciption")));
					throw new ApplicationException();
				}
				frbpropElement.setStatusDescr(toStr(""));
				frbpropElement.setStatusDescr(getFormModel().getFormHeader().getStoreOrgStatusDesc().append(" ").append(frbpropElement.getFrbpropAlternateStatusDesc()));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_STATUS_DATE.WHEN-NEW-ITEM-INSTANCE
		 g$_date_when_new_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_STATUS_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_STATUS_DATE", function=KeyFunction.ITEM_CHANGE)
		public void frbpropStatusDate_itemChange()
		{
			
				getTask().getGoqrpls().gDateWhenNewItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_STATUS_DATE.POST-TEXT-ITEM
		 g$_date_post_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_STATUS_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_STATUS_DATE", function=KeyFunction.ITEM_OUT)
		public void frbpropStatusDate_itemOut()
		{
			
				getTask().getGoqrpls().gDatePostItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_STATUS_DATE.POST-CHANGE
		 g$_date_reformat('',''); g$_check_failure;
declare
 cursor c1 is 
  select ftvsdat_title
   from ftvsdat
     where ftvsdat_sdat_code_entity = 'FRBPROP'
       and ftvsdat_sdat_code_attr = 'STATUS_CODE'
       and ftvsdat_sdat_code_opt_1 = :frbprop_status_code
       and ftvsdat_eff_date <= :FRBPROP_STATUS_DATE
       and (ftvsdat_nchg_date is null
       or ftvsdat_nchg_date > :FRBPROP_STATUS_DATE)
       and ftvsdat_status_ind = 'A';
begin
 open c1;
   fetch c1 into :status_descr;
   if :frbprop.frbprop_alternate_status_desc is not null then
   		:frbprop.status_descr := :status_descr ||' '||:frbprop.frbprop_alternate_status_desc;
   end if;
      if c1%notfound then
         message( G$_NLS.Get('FRAPROP-0107', 'FORM','Status is invalid. LIST is available.') );
         close c1;
         raise form_trigger_failure;
      end if;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_STATUS_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_STATUS_DATE")
		public void frbpropStatusDate_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if(frbpropElement.getFrbpropStatusDate().isNull())
		return;

				{
					String sqlc1 = "SELECT ftvsdat_title " +
	" FROM ftvsdat " +
	" WHERE ftvsdat_sdat_code_entity = 'FRBPROP' AND ftvsdat_sdat_code_attr = 'STATUS_CODE' AND ftvsdat_sdat_code_opt_1 = :FRBPROP_STATUS_CODE AND ftvsdat_eff_date <= :FRBPROP_STATUS_DATE AND (ftvsdat_nchg_date IS NULL OR ftvsdat_nchg_date > :FRBPROP_STATUS_DATE) AND ftvsdat_status_ind = 'A' ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("FRBPROP_STATUS_CODE", frbpropElement.getFrbpropStatusCode());
						c1.addParameter("FRBPROP_STATUS_DATE", frbpropElement.getFrbpropStatusDate());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							frbpropElement.setStatusDescr(c1Results.getStr(0));
						}
						if ( !frbpropElement.getFrbpropAlternateStatusDesc().isNull() )
						{
							frbpropElement.setStatusDescr(frbpropElement.getStatusDescr().append(" ").append(frbpropElement.getFrbpropAlternateStatusDesc()));
						}
						if ( c1.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAPROP-0107"), toStr("FORM"), toStr("Status is invalid. LIST is available.")));
							c1.close();
							throw new ApplicationException();
						}
					}
					finally{
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_STATUS_DATE.KEY-NEXT-ITEM
		 g$_date_reformat('',''); g$_check_failure;
next_item;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_STATUS_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_STATUS_DATE", function=KeyFunction.NEXT_ITEM)
		public void frbpropStatusDate_keyNexItem()
		{

				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_PROJECT_START_DATE.WHEN-NEW-ITEM-INSTANCE
		 g$_date_when_new_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROJECT_START_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_PROJECT_START_DATE", function=KeyFunction.ITEM_CHANGE)
		public void frbpropProjectStartDate_itemChange()
		{
			
				getTask().getGoqrpls().gDateWhenNewItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_PROJECT_START_DATE.POST-TEXT-ITEM
		 g$_date_post_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROJECT_START_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_PROJECT_START_DATE", function=KeyFunction.ITEM_OUT)
		public void frbpropProjectStartDate_itemOut()
		{
			
				getTask().getGoqrpls().gDatePostItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_PROJECT_START_DATE.POST-CHANGE
		 g$_date_reformat('',''); g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROJECT_START_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_PROJECT_START_DATE")
		public void frbpropProjectStartDate_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropProjectStartDate().isNull())
		return;

			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_PROJECT_START_DATE.KEY-NEXT-ITEM
		 g$_date_reformat('',''); g$_check_failure;
next_item;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROJECT_START_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_PROJECT_START_DATE", function=KeyFunction.NEXT_ITEM)
		public void frbpropProjectStartDate_keyNexItem()
		{

				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_PROJECT_END_DATE.WHEN-NEW-ITEM-INSTANCE
		 g$_date_when_new_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROJECT_END_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_PROJECT_END_DATE", function=KeyFunction.ITEM_CHANGE)
		public void frbpropProjectEndDate_itemChange()
		{
			
				getTask().getGoqrpls().gDateWhenNewItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_PROJECT_END_DATE.POST-TEXT-ITEM
		 g$_date_post_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROJECT_END_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_PROJECT_END_DATE", function=KeyFunction.ITEM_OUT)
		public void frbpropProjectEndDate_itemOut()
		{
			
				getTask().getGoqrpls().gDatePostItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_PROJECT_END_DATE.POST-CHANGE
		 g$_date_reformat('',''); g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROJECT_END_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_PROJECT_END_DATE")
		public void frbpropProjectEndDate_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropProjectEndDate().isNull())
		return;

			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_PROJECT_END_DATE.KEY-NEXT-ITEM
		 g$_date_reformat('',''); g$_check_failure;
next_item;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROJECT_END_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_PROJECT_END_DATE", function=KeyFunction.NEXT_ITEM)
		public void frbpropProjectEndDate_keyNexItem()
		{

				nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_GRNT_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBPROP_GRNT_CODE")
		public void frbpropGrntCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick(); //.doubleClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_GRNT_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_GRNT_CODE", function=KeyFunction.ITEM_CHANGE)
		public void frbpropGrntCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_GRNT_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void frbpropGrntCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_GRNT_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_GRNT_CODE", function=KeyFunction.NEXT_ITEM)
		public void frbpropGrntCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem(); //.nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_GRNT_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_GRNT_CODE", function=KeyFunction.ITEM_OUT)
		public void frbpropGrntCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_GRNT_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FRBGRNT_CODE', 'FRBGRNT_TITLE','');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_GRNT_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void frbpropGrntCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FRBGRNT_CODE"), toStr("FRBGRNT_TITLE"), toStr(""));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_GRNT_CODE.WHEN-VALIDATE-ITEM
		 if :frbprop_grnt_code is null then
    return;
end if;
--
declare
 temp_data   varchar2(2);
 cursor c1 is 
  select 'X'
   from frbgrnt
     where  frbgrnt_code = :frbprop_grnt_code;
begin
 open c1;
   fetch c1 into temp_data;
      if c1%notfound then
         message( G$_NLS.Get('FRAPROP-0108', 'FORM','Grant Code is invalid. LIST is available.') );
         close c1;
         raise form_trigger_failure;
      end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_GRNT_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_GRNT_CODE")
		public void frbpropGrntCode_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if ( frbpropElement.getFrbpropGrntCode().isNull() )
				{
					return ;
				}
				{
					NString tempData= NString.getNull();
					String sqlc1 = "SELECT 'X' " +
	" FROM frbgrnt " +
	" WHERE frbgrnt_code = :FRBPROP_GRNT_CODE ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("FRBPROP_GRNT_CODE", frbpropElement.getFrbpropGrntCode());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							tempData = c1Results.getStr(0);
						}
						if ( c1.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAPROP-0108"), toStr("FORM"), toStr("Grant Code is invalid. LIST is available.")));
							c1.close();
							throw new ApplicationException();
						}
					}
					finally{
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_GRNT_CODE.KEY-LISTVAL
		 BEGIN
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER1, 'FRIGRNT', 'QUERY');
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
       MESSAGE( G$_NLS.Get('FRAPROP-0109', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_GRNT_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBPROP_GRNT_CODE", function=KeyFunction.LIST_VALUES)
		public void frbpropGrntCode_ListValues()
		{
			
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FRIGRNT"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") || (
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
						errorMessage(GNls.Fget(toStr("FRAPROP-0109"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_BUDG_PRD_START_DAT.WHEN-NEW-ITEM-INSTANCE
		 G$_DATE_WHEN_NEW_ITEM; G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BUDG_PRD_START_DAT.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_BUDG_PRD_START_DAT", function=KeyFunction.ITEM_CHANGE)
		public void frbpropBudgPrdStartDat_itemChange()
		{
			
				getTask().getGoqrpls().gDateWhenNewItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_BUDG_PRD_START_DAT.POST-TEXT-ITEM
		 G$_DATE_POST_ITEM; G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BUDG_PRD_START_DAT.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_BUDG_PRD_START_DAT", function=KeyFunction.ITEM_OUT)
		public void frbpropBudgPrdStartDat_itemOut()
		{
			
				getTask().getGoqrpls().gDatePostItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_BUDG_PRD_START_DAT.POST-CHANGE
		 G$_DATE_REFORMAT('',''); G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BUDG_PRD_START_DAT.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_BUDG_PRD_START_DAT")
		public void frbpropBudgPrdStartDat_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropBudgPrdStartDat().isNull())
		return;

			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_BUDG_PRD_START_DAT.KEY-NEXT-ITEM
		 G$_DATE_REFORMAT('',''); G$_CHECK_FAILURE;
NEXT_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BUDG_PRD_START_DAT.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_BUDG_PRD_START_DAT", function=KeyFunction.NEXT_ITEM)
		public void frbpropBudgPrdStartDat_keyNexItem()
		{

				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_BUDG_PRD_END_DATE.KEY-NEXT-ITEM
		 G$_DATE_REFORMAT('',''); G$_CHECK_FAILURE;
NEXT_ITEM;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BUDG_PRD_END_DATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_BUDG_PRD_END_DATE", function=KeyFunction.NEXT_ITEM)
		public void frbpropBudgPrdEndDate_keyNexItem()
		{

				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_BUDG_PRD_END_DATE.POST-CHANGE
		 G$_DATE_REFORMAT('',''); G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BUDG_PRD_END_DATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_BUDG_PRD_END_DATE")
		public void frbpropBudgPrdEndDate_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropBudgPrdEndDate().isNull())
		return;

			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_BUDG_PRD_END_DATE.POST-TEXT-ITEM
		 G$_DATE_POST_ITEM; G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BUDG_PRD_END_DATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_BUDG_PRD_END_DATE", function=KeyFunction.ITEM_OUT)
		public void frbpropBudgPrdEndDate_itemOut()
		{
			
				getTask().getGoqrpls().gDatePostItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_BUDG_PRD_END_DATE.WHEN-NEW-ITEM-INSTANCE
		 G$_DATE_WHEN_NEW_ITEM; G$_CHECK_FAILURE;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BUDG_PRD_END_DATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_BUDG_PRD_END_DATE", function=KeyFunction.ITEM_CHANGE)
		public void frbpropBudgPrdEndDate_itemChange()
		{
			
				getTask().getGoqrpls().gDateWhenNewItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_EXPECTED_GRANT_DAT.WHEN-NEW-ITEM-INSTANCE
		 g$_date_when_new_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_EXPECTED_GRANT_DAT.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_EXPECTED_GRANT_DAT", function=KeyFunction.ITEM_CHANGE)
		public void frbpropExpectedGrantDat_itemChange()
		{
			
				getTask().getGoqrpls().gDateWhenNewItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_EXPECTED_GRANT_DAT.POST-TEXT-ITEM
		 g$_date_post_item; g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_EXPECTED_GRANT_DAT.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_EXPECTED_GRANT_DAT", function=KeyFunction.ITEM_OUT)
		public void frbpropExpectedGrantDat_itemOut()
		{
			
				getTask().getGoqrpls().gDatePostItem();
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_EXPECTED_GRANT_DAT.POST-CHANGE
		 g$_date_reformat('',''); g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_EXPECTED_GRANT_DAT.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_EXPECTED_GRANT_DAT")
		public void frbpropExpectedGrantDat_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropExpectedGrantDat().isNull())
		return;

			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_EXPECTED_GRANT_DAT.KEY-NEXT-ITEM
		 g$_date_reformat('',''); g$_check_failure;
next_item;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_EXPECTED_GRANT_DAT.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_EXPECTED_GRANT_DAT", function=KeyFunction.NEXT_ITEM)
		public void frbpropExpectedGrantDat_keyNexItem()
		{

				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_PROP_CODE_RELATED.POST-CHANGE
		 if :frbprop_prop_code_related is null then
    :related_prop_descr := '';
    return;
end if;
--
declare
 cursor c1 is 
  select frbprop_title
   from frbprop
     where frbprop_code = :frbprop_prop_code_related;
begin
 open c1;
   fetch c1 into :related_prop_descr;
         close c1;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROP_CODE_RELATED.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_PROP_CODE_RELATED")
		public void frbpropPropCodeRelated_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if(frbpropElement.getFrbpropPropCodeRelated().isNull())
		return;
				if ( frbpropElement.getFrbpropPropCodeRelated().isNull() )
				{
					frbpropElement.setRelatedPropDescr(toStr(""));
					return ;
				}
				{
					String sqlc1 = "SELECT frbprop_title " +
	" FROM frbprop " +
	" WHERE frbprop_code = :FRBPROP_PROP_CODE_RELATED ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("FRBPROP_PROP_CODE_RELATED", frbpropElement.getFrbpropPropCodeRelated());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							frbpropElement.setRelatedPropDescr(c1Results.getStr(0));
						}
						c1.close();
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
		 * FRBPROP_PROPOSAL_TYPE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBPROP_PROPOSAL_TYPE")
		public void frbpropProposalType_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick(); //.doubleClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROPOSAL_TYPE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_PROPOSAL_TYPE", function=KeyFunction.ITEM_CHANGE)
		public void frbpropProposalType_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROPOSAL_TYPE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void frbpropProposalType_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROPOSAL_TYPE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_PROPOSAL_TYPE", function=KeyFunction.NEXT_ITEM)
		public void frbpropProposalType_keyNexItem()
		{
			
				getGCodeClass().keyNexItem(); //.nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROPOSAL_TYPE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_PROPOSAL_TYPE", function=KeyFunction.ITEM_OUT)
		public void frbpropProposalType_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_PROPOSAL_TYPE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVSDAT_SDAT_CODE_OPT_1','FTVSDAT_TITLE',
   'WHERE FTVSDAT_SDAT_CODE_ENTITY=''FRBPROP'''||
   ' AND FTVSDAT_SDAT_CODE_ATTR=''PROPOSAL_TYPE'''||
   ' AND FTVSDAT_EFF_DATE <= SYSDATE'||
   ' AND (FTVSDAT_NCHG_DATE IS NULL'||
   ' OR FTVSDAT_NCHG_DATE > SYSDATE)'||
   ' AND FTVSDAT_STATUS_IND=''A''');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROPOSAL_TYPE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void frbpropProposalType_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVSDAT_SDAT_CODE_OPT_1"), toStr("FTVSDAT_TITLE"), toStr("WHERE FTVSDAT_SDAT_CODE_ENTITY='FRBPROP'").append(" AND FTVSDAT_SDAT_CODE_ATTR='PROPOSAL_TYPE'").append(" AND FTVSDAT_EFF_DATE <= SYSDATE").append(" AND (FTVSDAT_NCHG_DATE IS NULL").append(" OR FTVSDAT_NCHG_DATE > SYSDATE)").append(" AND FTVSDAT_STATUS_IND='A'"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_PROPOSAL_TYPE.KEY-LISTVAL
		 BEGIN
G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
G$_CHECK_FAILURE;
:GLOBAL.SDAT_COAS := '';
:GLOBAL.SDAT_ENTITY := 'FRBPROP';
:GLOBAL.SDAT_ATTR := 'PROPOSAL_TYPE';
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
       MESSAGE( G$_NLS.Get('FRAPROP-0110', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROPOSAL_TYPE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBPROP_PROPOSAL_TYPE", function=KeyFunction.LIST_VALUES)
		public void frbpropProposalType_ListValues()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("SDAT_COAS", toStr(""));
				setGlobal("SDAT_ENTITY", toStr("FRBPROP"));
				setGlobal("SDAT_ATTR", toStr("PROPOSAL_TYPE"));
				// 
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FOQSDLV"), toStr("QUERY"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") || (
							//morphis TODO
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
						errorMessage(GNls.Fget(toStr("FRAPROP-0110"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_PROPOSAL_TYPE.WHEN-VALIDATE-ITEM
		 if :frbprop_proposal_type is null then
   return;
end if;
-- 
declare
 temp_data   varchar2(2);
 cursor c1 is 
  select ftvsdat_title
   from ftvsdat
     where ftvsdat_sdat_code_entity = 'FRBPROP'
       and ftvsdat_sdat_code_attr = 'PROPOSAL_TYPE'
       and ftvsdat_sdat_code_opt_1 = :frbprop_proposal_type
       and ftvsdat_eff_date <= sysdate
       and (ftvsdat_nchg_date is null
       or ftvsdat_nchg_date > sysdate)
       and ftvsdat_status_ind = 'A';
begin
 open c1;
   fetch c1 into :frbprop_proposal_desc;
      if c1%notfound then
         message( G$_NLS.Get('FRAPROP-0111', 'FORM','Proposal Type Code is invalid. LIST is available.') );
         close c1;
         raise form_trigger_failure;
      end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROPOSAL_TYPE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_PROPOSAL_TYPE")
		public void frbpropProposalType_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if ( frbpropElement.getFrbpropProposalType().isNull() )
				{
					return ;
				}
				{
					NString tempData= NString.getNull();
					String sqlc1 = "SELECT ftvsdat_title " +
	" FROM ftvsdat " +
	" WHERE ftvsdat_sdat_code_entity = 'FRBPROP' AND ftvsdat_sdat_code_attr = 'PROPOSAL_TYPE' AND ftvsdat_sdat_code_opt_1 = :FRBPROP_PROPOSAL_TYPE AND ftvsdat_eff_date <= sysdate AND (ftvsdat_nchg_date IS NULL OR ftvsdat_nchg_date > sysdate) AND ftvsdat_status_ind = 'A' ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("FRBPROP_PROPOSAL_TYPE", frbpropElement.getFrbpropProposalType());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							frbpropElement.setFrbpropProposalDesc(c1Results.getStr(0));
						}
						if ( c1.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAPROP-0111"), toStr("FORM"), toStr("Proposal Type Code is invalid. LIST is available.")));
							c1.close();
							throw new ApplicationException();
						}
					}
					finally{
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_PROPOSAL_TYPE.ON-ERROR
		 IF ERROR_TYPE = 'FRM' and ERROR_CODE = 40831 THEN
	MESSAGE(G$_NLS.Get('FRAPROP-0112','FORM','Proposal type cannot exceed 2 characters'));
	RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROPOSAL_TYPE.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/

		@OnError
		public void frbpropProposalType_OnError(EventObject args)
		{
			
//				if ( SupportClasses.SQLFORMS.ErrorType().equals("FRM") && SupportClasses.SQLFORMS.ErrorCode().equals(40831) )
//				{
					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					message(GNls.Fget(toStr("FRAPROP-0112"), toStr("FORM"), toStr("Proposal type cannot exceed 2 characters")));
					throw new ApplicationException();
//				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROPOSAL_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_PROPOSAL_DESC", function=KeyFunction.ITEM_CHANGE)
		public void frbpropProposalDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CATEGORY.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBPROP_CATEGORY")
		public void frbpropCategory_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick(); //.doubleClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CATEGORY.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_CATEGORY", function=KeyFunction.ITEM_CHANGE)
		public void frbpropCategory_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CATEGORY.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void frbpropCategory_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CATEGORY.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_CATEGORY", function=KeyFunction.NEXT_ITEM)
		public void frbpropCategory_keyNexItem()
		{
			
				getGCodeClass().keyNexItem(); //.nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CATEGORY.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_CATEGORY", function=KeyFunction.ITEM_OUT)
		public void frbpropCategory_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_CATEGORY.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVSDAT_SDAT_CODE_OPT_1','FTVSDAT_TITLE',
    'WHERE FTVSDAT_SDAT_CODE_ENTITY=''FRBPROP'''||
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
		 * FRBPROP_CATEGORY.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void frbpropCategory_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVSDAT_SDAT_CODE_OPT_1"), toStr("FTVSDAT_TITLE"), toStr("WHERE FTVSDAT_SDAT_CODE_ENTITY='FRBPROP'").append(" AND FTVSDAT_SDAT_CODE_ATTR='CATEGORY'").append(" AND FTVSDAT_EFF_DATE <= SYSDATE").append(" AND (FTVSDAT_NCHG_DATE IS NULL").append(" OR FTVSDAT_NCHG_DATE > SYSDATE)").append(" AND FTVSDAT_STATUS_IND='A'"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_CATEGORY.KEY-LISTVAL
		 BEGIN
G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
G$_CHECK_FAILURE;
:GLOBAL.SDAT_COAS := '';
:GLOBAL.SDAT_ENTITY := 'FRBPROP';
:GLOBAL.SDAT_ATTR := 'CATEGORY';
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
       MESSAGE( G$_NLS.Get('FRAPROP-0113', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CATEGORY.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBPROP_CATEGORY", function=KeyFunction.LIST_VALUES)
		public void frbpropCategory_ListValues()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("SDAT_COAS", toStr(""));
				setGlobal("SDAT_ENTITY", toStr("FRBPROP"));
				setGlobal("SDAT_ATTR", toStr("CATEGORY"));
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
						errorMessage(GNls.Fget(toStr("FRAPROP-0113"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_CATEGORY.WHEN-VALIDATE-ITEM
		 if :frbprop_category is null then
    return;
end if;
--   
declare
 temp_data   varchar2(2);
 cursor c1 is 
  select ftvsdat_title
   from ftvsdat
     where ftvsdat_sdat_code_entity = 'FRBPROP'
       and ftvsdat_sdat_code_attr = 'CATEGORY'
       and ftvsdat_sdat_code_opt_1 = :frbprop_category
       and ftvsdat_eff_date <= sysdate
       and (ftvsdat_nchg_date is null
       or ftvsdat_nchg_date > sysdate)
       and ftvsdat_status_ind = 'A';
begin
 open c1;
   fetch c1 into :frbprop_category_desc;
      if c1%notfound then
         message( G$_NLS.Get('FRAPROP-0114', 'FORM','Category Code is invalid. LIST is available.') );
         close c1;
         raise form_trigger_failure;
      end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CATEGORY.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_CATEGORY")
		public void frbpropCategory_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if ( frbpropElement.getFrbpropCategory().isNull() )
				{
					return ;
				}
				{
					NString tempData= NString.getNull();
					String sqlc1 = "SELECT ftvsdat_title " +
	" FROM ftvsdat " +
	" WHERE ftvsdat_sdat_code_entity = 'FRBPROP' AND ftvsdat_sdat_code_attr = 'CATEGORY' AND ftvsdat_sdat_code_opt_1 = :FRBPROP_CATEGORY AND ftvsdat_eff_date <= sysdate AND (ftvsdat_nchg_date IS NULL OR ftvsdat_nchg_date > sysdate) AND ftvsdat_status_ind = 'A' ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("FRBPROP_CATEGORY", frbpropElement.getFrbpropCategory());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							frbpropElement.setFrbpropCategoryDesc(c1Results.getStr(0));
						}
						if ( c1.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAPROP-0114"), toStr("FORM"), toStr("Category Code is invalid. LIST is available.")));
							c1.close();
							throw new ApplicationException();
						}
					}
					finally{
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_CATEGORY.ON-ERROR
		 IF ERROR_TYPE = 'FRM' and ERROR_CODE = 40831 THEN
	MESSAGE(G$_NLS.Get('FRAPROP-0115','FORM','Category cannot exceed 1 character'));
	RAISE FORM_TRIGGER_FAILURE;
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CATEGORY.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/

		@OnError
		public void frbpropCategory_OnError(EventObject args)
		{
			
//				if ( SupportClasses.SQLFORMS.ErrorType().equals("FRM") && SupportClasses.SQLFORMS.ErrorCode().equals(40831) )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					message(GNls.Fget(toStr("FRAPROP-0115"), toStr("FORM"), toStr("Category cannot exceed 1 character")));
					throw new ApplicationException();
//				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CATEGORY_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_CATEGORY_DESC", function=KeyFunction.ITEM_CHANGE)
		public void frbpropCategoryDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SUB_CATEGORY.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBPROP_SUB_CATEGORY")
		public void frbpropSubCategory_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick(); //.doubleClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SUB_CATEGORY.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_SUB_CATEGORY", function=KeyFunction.ITEM_CHANGE)
		public void frbpropSubCategory_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SUB_CATEGORY.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void frbpropSubCategory_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SUB_CATEGORY.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_SUB_CATEGORY", function=KeyFunction.NEXT_ITEM)
		public void frbpropSubCategory_keyNexItem()
		{
			
				getGCodeClass().keyNexItem(); //.nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SUB_CATEGORY.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_SUB_CATEGORY", function=KeyFunction.ITEM_OUT)
		public void frbpropSubCategory_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_SUB_CATEGORY.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVSDAT_SDAT_CODE_OPT_1','FTVSDAT_TITLE',
    'WHERE FTVSDAT_SDAT_CODE_ENTITY=''FRBPROP'''||
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
		 * FRBPROP_SUB_CATEGORY.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void frbpropSubCategory_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVSDAT_SDAT_CODE_OPT_1"), toStr("FTVSDAT_TITLE"), toStr("WHERE FTVSDAT_SDAT_CODE_ENTITY='FRBPROP'").append(" AND FTVSDAT_SDAT_CODE_ATTR='SUB_CATEGORY'").append(" AND FTVSDAT_EFF_DATE <= SYSDATE").append(" AND (FTVSDAT_NCHG_DATE IS NULL").append(" OR FTVSDAT_NCHG_DATE > SYSDATE)").append(" AND FTVSDAT_STATUS_IND='A'"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_SUB_CATEGORY.WHEN-VALIDATE-ITEM
		 if :frbprop_sub_category is null then
    return;
end if;
--
declare
 temp_data   varchar2(2);
 cursor c1 is 
  select ftvsdat_title
   from ftvsdat
     where ftvsdat_sdat_code_entity = 'FRBPROP'
       and ftvsdat_sdat_code_attr = 'SUB_CATEGORY'
       and ftvsdat_sdat_code_opt_1 = :frbprop_sub_category
       and ftvsdat_eff_date <= sysdate
       and (ftvsdat_nchg_date is null
       or ftvsdat_nchg_date > sysdate)
       and ftvsdat_status_ind = 'A';
begin
 open c1;
   fetch c1 into :frbprop_sub_cat_desc;
      if c1%notfound then
         message( G$_NLS.Get('FRAPROP-0116', 'FORM','Sub Category Code is invalid. LIST is available.') );
         close c1;
         raise form_trigger_failure;
      end if;
end;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SUB_CATEGORY.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_SUB_CATEGORY")
		public void frbpropSubCategory_validate()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if ( frbpropElement.getFrbpropSubCategory().isNull() )
				{
					return ;
				}
				{
					NString tempData= NString.getNull();
					String sqlc1 = "SELECT ftvsdat_title " +
	" FROM ftvsdat " +
	" WHERE ftvsdat_sdat_code_entity = 'FRBPROP' AND ftvsdat_sdat_code_attr = 'SUB_CATEGORY' AND ftvsdat_sdat_code_opt_1 = :FRBPROP_SUB_CATEGORY AND ftvsdat_eff_date <= sysdate AND (ftvsdat_nchg_date IS NULL OR ftvsdat_nchg_date > sysdate) AND ftvsdat_status_ind = 'A' ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						//Setting query parameters
						c1.addParameter("FRBPROP_SUB_CATEGORY", frbpropElement.getFrbpropSubCategory());
						//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
						c1.open();
						ResultSet c1Results = c1.fetchInto();
						if ( c1Results != null ) {
							frbpropElement.setFrbpropSubCatDesc(c1Results.getStr(0));
						}
						if ( c1.notFound() )
						{
							errorMessage(GNls.Fget(toStr("FRAPROP-0116"), toStr("FORM"), toStr("Sub Category Code is invalid. LIST is available.")));
							c1.close();
							throw new ApplicationException();
						}
					}
					finally{
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_SUB_CATEGORY.KEY-LISTVAL
		 BEGIN
G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
G$_CHECK_FAILURE;
:GLOBAL.SDAT_COAS := '';
:GLOBAL.SDAT_ENTITY := 'FRBPROP';
:GLOBAL.SDAT_ATTR := 'SUB_CATEGORY';
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
       MESSAGE( G$_NLS.Get('FRAPROP-0117', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SUB_CATEGORY.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBPROP_SUB_CATEGORY", function=KeyFunction.LIST_VALUES)
		public void frbpropSubCategory_ListValues()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				setGlobal("SDAT_COAS", toStr(""));
				setGlobal("SDAT_ENTITY", toStr("FRBPROP"));
				setGlobal("SDAT_ATTR", toStr("SUB_CATEGORY"));
				// 
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FOQSDLV"), toStr("QUERY"));
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
						errorMessage(GNls.Fget(toStr("FRAPROP-0117"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_SUB_CATEGORY.ON-ERROR
		 IF ERROR_TYPE = 'FRM' and ERROR_CODE = 40831 THEN
	MESSAGE(G$_NLS.Get('FRAPROP-0118','FORM','Sub Category cannot exceed 4 characters'));
	RAISE FORM_TRIGGER_FAILURE;
END IF;




		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SUB_CATEGORY.ON-ERROR
		 *
		 *
		 *</p>
		 * @param args
		*/

		@OnError
		public void frbpropSubCategory_OnError(EventObject args)
		{
			
//				if ( SupportClasses.SQLFORMS.ErrorType().equals("FRM") && SupportClasses.SQLFORMS.ErrorCode().equals(40831) )
//				{
//					// F2N_TODO: The above condition uses unsupported features. You should eliminate all references to SupportClasses.
//					message(GNls.Fget(toStr("FRAPROP-0118"), toStr("FORM"), toStr("Sub Category cannot exceed 4 characters")));
					throw new ApplicationException();
//				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SUB_CAT_DESC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_SUB_CAT_DESC", function=KeyFunction.ITEM_CHANGE)
		public void frbpropSubCatDesc_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CFDA_CODE.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBPROP_CFDA_CODE")
		public void frbpropCfdaCode_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick(); //.doubleClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CFDA_CODE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_CFDA_CODE", function=KeyFunction.ITEM_CHANGE)
		public void frbpropCfdaCode_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CFDA_CODE.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void frbpropCfdaCode_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CFDA_CODE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_CFDA_CODE", function=KeyFunction.NEXT_ITEM)
		public void frbpropCfdaCode_keyNexItem()
		{
			
				getGCodeClass().keyNexItem(); //.nextItem();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CFDA_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_CFDA_CODE", function=KeyFunction.ITEM_OUT)
		public void frbpropCfdaCode_itemOut()
		{
			
				getGCodeClass().itemOut();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_CFDA_CODE.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FRVCFDA_CFDA_CODE','FRVCFDA_TITLE','WHERE FRVCFDA_STATUS = ''A''');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CFDA_CODE.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void frbpropCfdaCode_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FRVCFDA_CFDA_CODE"), toStr("FRVCFDA_TITLE"), toStr("WHERE FRVCFDA_STATUS = 'A'"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_CFDA_CODE.KEY-LISTVAL
		 BEGIN
G$_SEARCH.CODE_WHEN_NEW_ITEM_INST;
G$_CHECK_FAILURE;	
G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER1, 'FRVCFDA', 'QUERY');
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
       MESSAGE( G$_NLS.Get('FRAPROP-0119', 'FORM','*ERROR* Item is protected against update.') );              
  END IF;     
END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CFDA_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBPROP_CFDA_CODE", function=KeyFunction.LIST_VALUES)
		public void frbpropCfdaCode_ListValues()
		{
			
				getTask().getGoqrpls().getGSearch().codeWhenNewItemInst();
				getTask().getGoqrpls().gCheckFailure();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FRVCFDA"), toStr("QUERY"));
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
						errorMessage(GNls.Fget(toStr("FRAPROP-0119"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_CFDA_CODE.WHEN-VALIDATE-ITEM
		 
--1-LP0QEC
declare
 hold_cfda_int_id   frbprop.frbprop_cfda_internal_id_no%type; 
 cursor c1 is 
  select distinct frvcfda_internal_id_no
   from frvcfda
     where frvcfda_cfda_code = :frbprop_cfda_code
       and frvcfda_status = 'A';
begin
 if :frbprop_cfda_code is not null then	
 open c1;
   fetch c1 into hold_cfda_int_id;
      if c1%notfound then
         message(
           G$_NLS.Get('FRAPROP-0120', 'FORM','Category of Federal Domestic Assistance Number is invalid. LIST is available.') );
         close c1;
         raise form_trigger_failure;
      else
         :frbprop_cfda_internal_id_no := hold_cfda_int_id;
      end if;
  else
      :frbprop_cfda_internal_id_no := NULL;
  end if;
end;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CFDA_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_CFDA_CODE")
		public void frbpropCfdaCode_validate()
		{
			
				// 1-LP0QEC

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				{
					NNumber holdCfdaIntId= NNumber.getNull();
					String sqlc1 = "SELECT DISTINCT frvcfda_internal_id_no " +
	" FROM frvcfda " +
	" WHERE frvcfda_cfda_code = :FRBPROP_CFDA_CODE AND frvcfda_status = 'A' ";
					DataCursor c1 = new DataCursor(sqlc1);
					try {
						if ( !frbpropElement.getFrbpropCfdaCode().isNull() )
						{
							//Setting query parameters
							c1.addParameter("FRBPROP_CFDA_CODE", frbpropElement.getFrbpropCfdaCode());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable c1.
							c1.open();
							ResultSet c1Results = c1.fetchInto();
							if ( c1Results != null ) {
								holdCfdaIntId = c1Results.getNumber(0);
							}
							if ( c1.notFound() )
							{
								errorMessage(GNls.Fget(toStr("FRAPROP-0120"), toStr("FORM"), toStr("Category of Federal Domestic Assistance Number is invalid. LIST is available.")));
								c1.close();
								throw new ApplicationException();
							}
							else {
								frbpropElement.setFrbpropCfdaInternalIdNo(holdCfdaIntId);
							}
						}
						else {
							frbpropElement.setFrbpropCfdaInternalIdNo(toNumber(null));
						}
					}
					finally{
						c1.close();
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_SPONSOR_ID.KEY-NEXT-ITEM
		 go_item('frbprop_coas_code');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SPONSOR_ID.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_SPONSOR_ID", function=KeyFunction.NEXT_ITEM)
		public void frbpropSponsorId_keyNexItem()
		{
			
				goItem(toStr("frbprop_coas_code"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_AGENCY_CONTACT.KEY-PREV-ITEM
		 go_item('FRBPROP_AGENCY_ADDR_SEQ_NUM');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_AGENCY_CONTACT.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="FRBPROP_AGENCY_CONTACT", function=KeyFunction.PREVIOUS_ITEM)
		public void frbpropAgencyContact_PreviousItem()
		{
			
				goItem(toStr("FRBPROP_AGENCY_ADDR_SEQ_NUM"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_AGENCY_PRED_NAME.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_AGENCY_PRED_NAME", function=KeyFunction.NEXT_ITEM)
		public void frbpropAgencyPredName_keyNexItem()
		{
			
				getGNameClass().keyNexItem(); //.nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_AGENCY_ADDR_CODE.KEY-LISTVAL
		 BEGIN
<multilinecomment>G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER1, 'STVATYP', 'QUERY');
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
       MESSAGE('*ERROR* Item is protected against update.');              
  END IF;     
END IF;</multilinecomment>
next_item;
do_key('LIST_VALUES');
g$_check_failure; 
go_item('FRBPROP_AGENCY_CONTACT');
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_AGENCY_ADDR_CODE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBPROP_AGENCY_ADDR_CODE", function=KeyFunction.LIST_VALUES)
		public void frbpropAgencyAddrCode_ListValues()
		{
			
				// G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER1, 'STVATYP', 'QUERY');
				// IF NAME_IN('GLOBAL.VALUE') IS NOT NULL THEN
				// IF  GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),UPDATEABLE) = 'TRUE'
				// OR (GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),UPDATE_NULL) = 'TRUE'
				// AND :SYSTEM.CURSOR_VALUE IS NULL)
				// OR  (:SYSTEM.MODE <> 'NORMAL' AND
				// GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),QUERYABLE) = 'TRUE')
				// OR  (:SYSTEM.RECORD_STATUS = 'NEW' AND
				// GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),INSERT_ALLOWED) = 'TRUE')
				// OR  (:SYSTEM.RECORD_STATUS = 'INSERT' AND
				// GET_ITEM_PROPERTY(NAME_IN('SYSTEM.CURSOR_ITEM'),INSERT_ALLOWED) = 'TRUE')
				// THEN  EXECUTE_TRIGGER('LIST_VALUES_COPY');
				// :GLOBAL.VALUE := '';
				// DO_KEY('NEXT_ITEM');
				// ELSE
				// MESSAGE('*ERROR* Item is protected against update.');
				// END IF;
				// END IF;
				nextItem();
				executeAction("LIST_VALUES");
				getTask().getGoqrpls().gCheckFailure();
				goItem(toStr("FRBPROP_AGENCY_CONTACT"));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_AGENCY_ADDR_CODE.POST-TEXT-ITEM
		    IF :FRBPROP_AGENCY_ADDR_CODE IS NULL  THEN
         EXECUTE_TRIGGER( 'CLR_ATYP' ) ;
         G$_CHECK_FAILURE ;
         EXECUTE_TRIGGER( 'CLR_ADDR' ) ;
         G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_AGENCY_ADDR_CODE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_AGENCY_ADDR_CODE", function=KeyFunction.ITEM_OUT)
		public void frbpropAgencyAddrCode_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( frbpropElement.getFrbpropAgencyAddrCode().isNull() )
				{
					executeAction("CLR_ATYP");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("CLR_ADDR");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_AGENCY_ADDR_CODE.POST-CHANGE
		 
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
         WHERE  STVATYP_CODE = :FRBPROP_AGENCY_ADDR_CODE ;
   BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE (PTI_CURSOR%NOTFOUND,
          G$_NLS.Get('FRAPROP-0121', 'FORM','Address type code is invalid') , TRUE);
   END ;
--
    <multilinecomment>change start: fetches all addressed other than inactive - 'I'</multilinecomment>
    DECLARE
     PTI_INTO_TEMP        VARCHAR2(255);
     CURSOR PTI_CURSOR IS
         SELECT 'X'
         FROM   SPRADDR
         WHERE  SPRADDR_PIDM = :FRBPROP.FRBPROP_AGENCY_PIDM 
           AND  SPRADDR_ATYP_CODE = :FRBPROP.FRBPROP_AGENCY_ADDR_CODE
           AND NVL(SPRADDR_STATUS_IND,'X') != 'I';	  
     BEGIN
      OPEN PTI_CURSOR ;
      FETCH PTI_CURSOR INTO PTI_INTO_TEMP ;
      G$_CHECK_VALUE(PTI_CURSOR%NOTFOUND,
        G$_NLS.Get('FRAPROP-0122', 'FORM','*ERROR* Address type is invalid or inactive') ,TRUE);
    END ;
<multilinecomment>change end: fetches all addressed other than inactive - 'I'</multilinecomment>

   << PTI_STEP_001 >>
   IF :FRBPROP_AGENCY_ADDR_SEQ_NUM IS NOT NULL  THEN
      EXECUTE_TRIGGER( 'CLR_ADDR' ) ;
      G$_CHECK_FAILURE ;
      :FRBPROP_AGENCY_ADDR_SEQ_NUM := :FRBPROP_AGENCY_ADDR_SEQ_NUM;
      --EXECUTE_TRIGGER( 'EDIT_SPRADDR' ) ; <multilinecomment>commented because this line of code is not allowing to navigate to select sequesnce number, stopping the cursor at address type</multilinecomment>
      --G$_CHECK_FAILURE ;
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
		 * FRBPROP_AGENCY_ADDR_CODE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_AGENCY_ADDR_CODE")
		public void frbpropAgencyAddrCode_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				int rowCount = 0;
				if(frbpropElement.getFrbpropAgencyAddrCode().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					if ((getGlobal("QUERY_MODE").equals("1")))
					{
//						 goto PTI_STEP_001;
//						 PTI_STEP_001:;
							if ( !frbpropElement.getFrbpropAgencyAddrSeqNum().isNull() )
							{
								executeAction("CLR_ADDR");
								getTask().getGoqrpls().gCheckFailure();
								frbpropElement.setFrbpropAgencyAddrSeqNum(frbpropElement.getFrbpropAgencyAddrSeqNum());
							}
							// 
							setGlobal("QUERY_MODE", toStr("0"));
							return;
					}
					{
						NString ptiIntoTemp= NString.getNull();
						String sqlptiCursor = "SELECT 'X' " +
	" FROM STVATYP " +
	" WHERE STVATYP_CODE = :FRBPROP_AGENCY_ADDR_CODE ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("FRBPROP_AGENCY_ADDR_CODE", frbpropElement.getFrbpropAgencyAddrCode());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								ptiIntoTemp = ptiCursorResults.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0121"), toStr("FORM"), toStr("Address type code is invalid")), toBool(NBool.True));
						}
						finally{
							ptiCursor.close();
						}
					}
					{
						NString ptiIntoTemp= NString.getNull();
						String sqlptiCursor = "SELECT 'X' " +
	" FROM SPRADDR " +
	" WHERE SPRADDR_PIDM = :FRBPROP_FRBPROP_AGENCY_PIDM AND SPRADDR_ATYP_CODE = :FRBPROP_FRBPROP_AGENCY_ADDR_CODE AND NVL(SPRADDR_STATUS_IND, 'X') != 'I' ";
						DataCursor ptiCursor = new DataCursor(sqlptiCursor);
						try {
							//Setting query parameters
							ptiCursor.addParameter("FRBPROP_FRBPROP_AGENCY_PIDM", frbpropElement.getFrbpropAgencyPidm());
							ptiCursor.addParameter("FRBPROP_FRBPROP_AGENCY_ADDR_CODE", frbpropElement.getFrbpropAgencyAddrCode());
							//F2J_WARNING : Make sure that the method "Close" is being called over the variable ptiCursor.
							ptiCursor.open();
							ResultSet ptiCursorResults = ptiCursor.fetchInto();
							if ( ptiCursorResults != null ) {
								ptiIntoTemp = ptiCursorResults.getStr(0);
							}
							getTask().getGoqrpls().gCheckValue(toBool(ptiCursor.notFound()), GNls.Fget(toStr("FRAPROP-0122"), toStr("FORM"), toStr("*ERROR* Address type is invalid or inactive")), toBool(NBool.True));
						}
						finally{
							ptiCursor.close();
						}
					}
					 PTI_STEP_001:;
					if ( !frbpropElement.getFrbpropAgencyAddrSeqNum().isNull() )
					{
						executeAction("CLR_ADDR");
						getTask().getGoqrpls().gCheckFailure();
						frbpropElement.setFrbpropAgencyAddrSeqNum(frbpropElement.getFrbpropAgencyAddrSeqNum());
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

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_AGENCY_ADDR_SEQ_NUM.KEY-NEXT-ITEM
		 --GO_ITEM('FRBPROP_AGENCY_CONTACT');
next_item;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_AGENCY_ADDR_SEQ_NUM.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_AGENCY_ADDR_SEQ_NUM", function=KeyFunction.NEXT_ITEM)
		public void frbpropAgencyAddrSeqNum_keyNexItem()
		{
			
				// GO_ITEM('FRBPROP_AGENCY_CONTACT');
				// GO_ITEM('FRBPROP_AGENCY_CONTACT');
				nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_AGENCY_ADDR_SEQ_NUM.KEY-LISTVAL
		 BEGIN
   :GLOBAL.ATYP_CODE := :FRBPROP_AGENCY_ADDR_CODE ;
   :GLOBAL.PIDM := :FRBPROP_AGENCY_PIDM;
--
   :GLOBAL.VALUE := '';
   G$_COPY_FLD_ATTR;
   G$_SECURED_FORM_CALL(:GLOBAL.CURRENT_USER1,'FOQADDR','QUERY');
--
   IF :GLOBAL.SEQNO IS NOT NULL THEN
      :FRBPROP_AGENCY_ADDR_SEQ_NUM := :GLOBAL.SEQNO;
   END IF; 
--
   IF :GLOBAL.ATYP_CODE IS NOT NULL THEN
      :FRBPROP_AGENCY_ADDR_CODE  := :GLOBAL.ATYP_CODE ;
      GO_ITEM('FRBPROP_AGENCY_CONTACT'); 
   END IF;
<multilinecomment>   G$_RESET_GLOBAL;
   IF :GLOBAL.ATYP_CODE = :FRBPROP_AGENCY_ADDR_CODE OR (
      :GLOBAL.ATYP_CODE IS NULL AND :FRBPROP_AGENCY_ADDR_CODE  IS
      NULL ) THEN
      NULL ;
   ELSIF :GLOBAL.ATYP_CODE IS NULL  THEN
      NULL ;
   ELSE
      EXECUTE_TRIGGER( 'TRIG_FAIL' ) ;
      IF NOT FORM_SUCCESS THEN
         GOTO DO_COPY ;
      END IF ;
   END IF ;
   GOTO DO_TEST ;
--
   << DO_COPY >>
   :FRBPROP_AGENCY_ADDR_CODE  := :GLOBAL.ATYP_CODE ;
--
   << DO_TEST >>
   IF :GLOBAL.VALUE IS NOT NULL  THEN
      EXECUTE_TRIGGER( 'LIST_VALUES_COPY' ) ;
      G$_CHECK_FAILURE ;
      NEXT_ITEM;
   END IF ;</multilinecomment>
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_AGENCY_ADDR_SEQ_NUM.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBPROP_AGENCY_ADDR_SEQ_NUM", function=KeyFunction.LIST_VALUES)
		public void frbpropAgencyAddrSeqNum_ListValues()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				setGlobal("ATYP_CODE", frbpropElement.getFrbpropAgencyAddrCode());
				setGlobal("PIDM", toStr(frbpropElement.getFrbpropAgencyPidm()));
				// 
				setGlobal("VALUE", toStr(""));
				getTask().getGoqrpls().gCopyFldAttr();
				getTask().getGoqrpls().gSecuredFormCall(getGlobal("CURRENT_USER1"), toStr("FOQADDR"), toStr("QUERY"));
				// 
				if ( !getGlobal("SEQNO").isNull() )
				{
					frbpropElement.setFrbpropAgencyAddrSeqNum(toNumber(getGlobal("SEQNO")));
				}
				// 
				if ( !getGlobal("ATYP_CODE").isNull() )
				{
					frbpropElement.setFrbpropAgencyAddrCode(getGlobal("ATYP_CODE"));
					goItem(toStr("FRBPROP_AGENCY_CONTACT"));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_AGENCY_ADDR_SEQ_NUM.POST-TEXT-ITEM
		    IF :FRBPROP_AGENCY_ADDR_SEQ_NUM IS NULL  THEN
      EXECUTE_TRIGGER( 'CLR_ATYP' ) ;
      G$_CHECK_FAILURE ;
      EXECUTE_TRIGGER( 'CLR_ADDR' ) ;
      G$_CHECK_FAILURE ;
   END IF ;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_AGENCY_ADDR_SEQ_NUM.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_AGENCY_ADDR_SEQ_NUM", function=KeyFunction.ITEM_OUT)
		public void frbpropAgencyAddrSeqNum_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( frbpropElement.getFrbpropAgencyAddrSeqNum().isNull() )
				{
					executeAction("CLR_ATYP");
					getTask().getGoqrpls().gCheckFailure();
					executeAction("CLR_ADDR");
					getTask().getGoqrpls().gCheckFailure();
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_AGENCY_ADDR_SEQ_NUM.POST-CHANGE
		 
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
		 * FRBPROP_AGENCY_ADDR_SEQ_NUM.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_AGENCY_ADDR_SEQ_NUM")
		public void frbpropAgencyAddrSeqNum_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropAgencyAddrSeqNum().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					if ((getGlobal("QUERY_MODE").equals("1")))
					{
//						 goto PTI_STEP_001;
					}
					 PTI_STEP_001:;
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

		
		/* Original PL/SQL code code for TRIGGER PHONE_TYPE.KEY-NEXT-ITEM
		 GO_ITEM('FRBPROP_AGENCY_CONTACT');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_TYPE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="PHONE_TYPE", function=KeyFunction.NEXT_ITEM)
		public void phoneType_keyNexItem()
		{
			
				goItem(toStr("FRBPROP_AGENCY_CONTACT"));
			}

		
		/* Original PL/SQL code code for TRIGGER PHONE_TYPE.KEY-PREV-ITEM
		 go_item('FRBPROP_AGENCY_ADDR_SEQ_NUM');
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * PHONE_TYPE.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="PHONE_TYPE", function=KeyFunction.PREVIOUS_ITEM)
		public void phoneType_PreviousItem()
		{
			
				goItem(toStr("FRBPROP_AGENCY_ADDR_SEQ_NUM"));
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_COAS_CODE_IC_CS.WHEN-MOUSE-DOUBLECLICK
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-MOUSE-DOUBLECLICK", item="FRBPROP_COAS_CODE_IC_CS")
		public void frbpropCoasCodeIcCs_doubleClick()
		{
			
				getGCodeClass().whenMouseDoubleclick(); //.doubleClick();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_COAS_CODE_IC_CS.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_COAS_CODE_IC_CS", function=KeyFunction.ITEM_CHANGE)
		public void frbpropCoasCodeIcCs_itemChange()
		{
			
				getGCodeClass().itemChange();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_COAS_CODE_IC_CS.G$_SEARCH_OPTIONS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_OPTIONS")
		public void frbpropCoasCodeIcCs_GSearchOptions()
		{
			
				getGCodeClass().gSearchOptions();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_COAS_CODE_IC_CS.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_COAS_CODE_IC_CS", function=KeyFunction.NEXT_ITEM)
		public void frbpropCoasCodeIcCs_keyNexItem()
		{
			
				getGCodeClass().keyNexItem(); //.nextItem();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_COAS_CODE_IC_CS.G$_SEARCH_PARAMETERS
		 G$_SEARCH.PARAMETERS('FTVCOAS_COAS_CODE', 'FTVCOAS_TITLE',
   G$_SEARCH_WHERE.F_FTVCOAS_ENTRY('SYSDATE'));
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_COAS_CODE_IC_CS.G$_SEARCH_PARAMETERS
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="G$_SEARCH_PARAMETERS")
		public void frbpropCoasCodeIcCs_GSearchParameters()
		{
			
				getTask().getGoqrpls().getGSearch().parameters(toStr("FTVCOAS_COAS_CODE"), toStr("FTVCOAS_TITLE"), getTask().getGoqrpls().getGSearchWhere().fFtvcoasEntry(toStr("SYSDATE")));
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_COAS_CODE_IC_CS.POST-CHANGE
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
		 * FRBPROP_COAS_CODE_IC_CS.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_COAS_CODE_IC_CS")
		public void frbpropCoasCodeIcCs_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropCoasCodeIcCs().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					executeAction("EDIT_COAS_CODE_IC_CS");
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

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_COAS_CODE_IC_CS.POST-TEXT-ITEM
		 G$_SEARCH.POST_TEXT_CODE;
--
<multilinecomment>IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
   IF :FRBPROP_BASI_CODE_IC IS NOT NULL OR :FRBPROP_BASI_CODE_CS IS NOT NULL THEN
      MESSAGE('Chart of Accounts must be entered.');
      Raise Form_Trigger_Failure;
   END IF;
END IF;</multilinecomment>
null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_COAS_CODE_IC_CS.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_COAS_CODE_IC_CS", function=KeyFunction.ITEM_OUT)
		public void frbpropCoasCodeIcCs_itemOut()
		{
			
				getTask().getGoqrpls().getGSearch().postTextCode();
				// 
				// IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
				// IF :FRBPROP_BASI_CODE_IC IS NOT NULL OR :FRBPROP_BASI_CODE_CS IS NOT NULL THEN
				// MESSAGE('Chart of Accounts must be entered.');
				// Raise Form_Trigger_Failure;
				// END IF;
				// END IF;
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_COAS_CODE_IC_CS.KEY-PREV-ITEM
		 go_item('FRBPROP_FRINGE_RATE');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_COAS_CODE_IC_CS.KEY-PREV-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-PREV-ITEM", item="FRBPROP_COAS_CODE_IC_CS", function=KeyFunction.PREVIOUS_ITEM)
		public void frbpropCoasCodeIcCs_PreviousItem()
		{
			
				goItem(toStr("FRBPROP_FRINGE_RATE"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_BASI_CODE_IC.KEY-LISTVAL
		 BEGIN
   :GLOBAL.BASIS_TYPE := 'I';
   :GLOBAL.FORM_WAS_CALLED := 'Y';
--
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
         MESSAGE( G$_NLS.Get('FRAPROP-0123', 'FORM','*ERROR* Item is protected against update.') );             
      END IF;     
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BASI_CODE_IC.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBPROP_BASI_CODE_IC", function=KeyFunction.LIST_VALUES)
		public void frbpropBasiCodeIc_ListValues()
		{
			
				setGlobal("BASIS_TYPE", toStr("I"));
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				// 
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("FRVBASI"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
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
						errorMessage(GNls.Fget(toStr("FRAPROP-0123"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_BASI_CODE_IC.POST-CHANGE
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
		 * FRBPROP_BASI_CODE_IC.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_BASI_CODE_IC")
		public void frbpropBasiCodeIc_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropBasiCodeIc().isNull())
		return;
				try
				{
					getTask().getGoqrpls().gCheckQueryMode();
					// 
					executeAction("EDIT_BASI_CODE_IC");
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

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_BASI_CODE_IC.POST-TEXT-ITEM
		 IF :FRBPROP_BASI_CODE_IC IS NULL THEN
   :FRBPROP_BASI_CODE_IC_NAME := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BASI_CODE_IC.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_BASI_CODE_IC", function=KeyFunction.ITEM_OUT)
		public void frbpropBasiCodeIc_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( frbpropElement.getFrbpropBasiCodeIc().isNull() )
				{
					frbpropElement.setFrbpropBasiCodeIcName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_BASI_CODE_IC.WHEN-NEW-ITEM-INSTANCE
		 <multilinecomment>EXECUTE_TRIGGER('CHECK_COST_SHARE_ITEMS');
G$_CHECK_FAILURE;
--
IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
   GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
   MESSAGE('Chart of Accounts must be entered.');
   RAISE FORM_TRIGGER_FAILURE;
END IF;</multilinecomment>
null;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BASI_CODE_IC.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_BASI_CODE_IC", function=KeyFunction.ITEM_CHANGE)
		public void frbpropBasiCodeIc_itemChange()
		{
			
				// EXECUTE_TRIGGER('CHECK_COST_SHARE_ITEMS');
				// G$_CHECK_FAILURE;
				// --
				// IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
				// GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
				// MESSAGE('Chart of Accounts must be entered.');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				// EXECUTE_TRIGGER('CHECK_COST_SHARE_ITEMS');
				// G$_CHECK_FAILURE;
				// --
				// IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
				// GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
				// MESSAGE('Chart of Accounts must be entered.');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_INDR_CODE_RATE.POST-CHANGE
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
		 * FRBPROP_INDR_CODE_RATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_INDR_CODE_RATE")
		public void frbpropIndrCodeRate_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropIndrCodeRate().isNull())
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

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_INDR_CODE_RATE.WHEN-NEW-ITEM-INSTANCE
		 <multilinecomment>IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
   GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
   MESSAGE('Chart of Accounts must be entered.');
   RAISE FORM_TRIGGER_FAILURE;
END IF;
--
IF :FRBPROP_BASI_CODE_IC IS NULL THEN
   GO_ITEM('FRBPROP_BASI_CODE_IC');
   G$_CHECK_FAILURE;
   MESSAGE('I/C Basis Code is required if a I/C Rate Code is entered');
   RAISE FORM_TRIGGER_FAILURE;
END IF;</multilinecomment>
null;



		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_INDR_CODE_RATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_INDR_CODE_RATE", function=KeyFunction.ITEM_CHANGE)
		public void frbpropIndrCodeRate_itemChange()
		{
			
				// IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
				// GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
				// MESSAGE('Chart of Accounts must be entered.');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				// --
				// IF :FRBPROP_BASI_CODE_IC IS NULL THEN
				// GO_ITEM('FRBPROP_BASI_CODE_IC');
				// G$_CHECK_FAILURE;
				// MESSAGE('I/C Basis Code is required if a I/C Rate Code is entered');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				// IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
				// GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
				// MESSAGE('Chart of Accounts must be entered.');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				// --
				// IF :FRBPROP_BASI_CODE_IC IS NULL THEN
				// GO_ITEM('FRBPROP_BASI_CODE_IC');
				// G$_CHECK_FAILURE;
				// MESSAGE('I/C Basis Code is required if a I/C Rate Code is entered');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_INDR_CODE_RATE.KEY-LISTVAL
		 BEGIN
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
         MESSAGE( G$_NLS.Get('FRAPROP-0124', 'FORM','*ERROR* Item is protected against update.') );              
      END IF;     
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_INDR_CODE_RATE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBPROP_INDR_CODE_RATE", function=KeyFunction.LIST_VALUES)
		public void frbpropIndrCodeRate_ListValues()
		{
			
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("FRVINDR"), toStr("QUERY"));
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
						errorMessage(GNls.Fget(toStr("FRAPROP-0124"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_INDR_CODE_RATE.POST-TEXT-ITEM
		 IF :FRBPROP_INDR_CODE_RATE IS NULL THEN
   :FRBPROP_INDR_CODE_RATE_NAME := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_INDR_CODE_RATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_INDR_CODE_RATE", function=KeyFunction.ITEM_OUT)
		public void frbpropIndrCodeRate_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( frbpropElement.getFrbpropIndrCodeRate().isNull() )
				{
					frbpropElement.setFrbpropIndrCodeRateName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_INDA_CODE_CHARGE.WHEN-NEW-ITEM-INSTANCE
		 
<multilinecomment>EXECUTE_TRIGGER('CHECK_COST_SHARE_ITEMS');
G$_CHECK_FAILURE;
--
IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
   GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
   MESSAGE('Chart of Accounts must be entered.');
   RAISE FORM_TRIGGER_FAILURE;
END IF;
--
IF :FRBPROP_BASI_CODE_IC IS NULL THEN
   GO_ITEM('FRBPROP_BASI_CODE_IC');
   G$_CHECK_FAILURE;
   MESSAGE('I/C Basis Code is required if a I/C Charge Code is entered');
   RAISE FORM_TRIGGER_FAILURE;
END IF;</multilinecomment>
null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_INDA_CODE_CHARGE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_INDA_CODE_CHARGE", function=KeyFunction.ITEM_CHANGE)
		public void frbpropIndaCodeCharge_itemChange()
		{
			
				// EXECUTE_TRIGGER('CHECK_COST_SHARE_ITEMS');
				// G$_CHECK_FAILURE;
				// --
				// IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
				// GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
				// MESSAGE('Chart of Accounts must be entered.');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				// --
				// IF :FRBPROP_BASI_CODE_IC IS NULL THEN
				// GO_ITEM('FRBPROP_BASI_CODE_IC');
				// G$_CHECK_FAILURE;
				// MESSAGE('I/C Basis Code is required if a I/C Charge Code is entered');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				// EXECUTE_TRIGGER('CHECK_COST_SHARE_ITEMS');
				// G$_CHECK_FAILURE;
				// --
				// IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
				// GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
				// MESSAGE('Chart of Accounts must be entered.');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				// --
				// IF :FRBPROP_BASI_CODE_IC IS NULL THEN
				// GO_ITEM('FRBPROP_BASI_CODE_IC');
				// G$_CHECK_FAILURE;
				// MESSAGE('I/C Basis Code is required if a I/C Charge Code is entered');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_INDA_CODE_CHARGE.POST-CHANGE
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
		 * FRBPROP_INDA_CODE_CHARGE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_INDA_CODE_CHARGE")
		public void frbpropIndaCodeCharge_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropIndaCodeCharge().isNull())
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

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_INDA_CODE_CHARGE.POST-TEXT-ITEM
		 IF :FRBPROP_INDA_CODE_CHARGE IS NULL THEN
   :FRBPROP_INDA_CODE_CHARGE_NAME := '';
END IF; 
   
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_INDA_CODE_CHARGE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_INDA_CODE_CHARGE", function=KeyFunction.ITEM_OUT)
		public void frbpropIndaCodeCharge_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( frbpropElement.getFrbpropIndaCodeCharge().isNull() )
				{
					frbpropElement.setFrbpropIndaCodeChargeName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_INDA_CODE_CHARGE.KEY-LISTVAL
		 BEGIN
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
         MESSAGE( G$_NLS.Get('FRAPROP-0125', 'FORM','*ERROR* Item is protected against update.') );              
      END IF;     
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_INDA_CODE_CHARGE.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBPROP_INDA_CODE_CHARGE", function=KeyFunction.LIST_VALUES)
		public void frbpropIndaCodeCharge_ListValues()
		{
			
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("FRVINDA"), toStr("QUERY"));
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
						errorMessage(GNls.Fget(toStr("FRAPROP-0125"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_INDA_CODE_CHARGE_NAME.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_INDA_CODE_CHARGE_NAME", function=KeyFunction.ITEM_CHANGE)
		public void frbpropIndaCodeChargeName_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_INDD_CODE_DISTR.WHEN-NEW-ITEM-INSTANCE
		 
<multilinecomment>EXECUTE_TRIGGER('CHECK_COST_SHARE_ITEMS');
G$_CHECK_FAILURE;
--
IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
   GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
   MESSAGE('Chart of Accounts must be entered.');
   RAISE FORM_TRIGGER_FAILURE;
END IF;
--
IF :FRBPROP_BASI_CODE_IC IS NULL THEN
   GO_ITEM('FRBPROP_BASI_CODE_IC');
   G$_CHECK_FAILURE;
   MESSAGE('I/C Basis Code is required if a I/C Distribution Code is entered');
   RAISE FORM_TRIGGER_FAILURE;
END IF;</multilinecomment>
null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_INDD_CODE_DISTR.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_INDD_CODE_DISTR", function=KeyFunction.ITEM_CHANGE)
		public void frbpropInddCodeDistr_itemChange()
		{
			
				// EXECUTE_TRIGGER('CHECK_COST_SHARE_ITEMS');
				// G$_CHECK_FAILURE;
				// --
				// IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
				// GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
				// MESSAGE('Chart of Accounts must be entered.');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				// --
				// IF :FRBPROP_BASI_CODE_IC IS NULL THEN
				// GO_ITEM('FRBPROP_BASI_CODE_IC');
				// G$_CHECK_FAILURE;
				// MESSAGE('I/C Basis Code is required if a I/C Distribution Code is entered');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				// EXECUTE_TRIGGER('CHECK_COST_SHARE_ITEMS');
				// G$_CHECK_FAILURE;
				// --
				// IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
				// GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
				// MESSAGE('Chart of Accounts must be entered.');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				// --
				// IF :FRBPROP_BASI_CODE_IC IS NULL THEN
				// GO_ITEM('FRBPROP_BASI_CODE_IC');
				// G$_CHECK_FAILURE;
				// MESSAGE('I/C Basis Code is required if a I/C Distribution Code is entered');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_INDD_CODE_DISTR.KEY-LISTVAL
		 BEGIN
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
         MESSAGE( G$_NLS.Get('FRAPROP-0126', 'FORM','*ERROR* Item is protected against update.') );              
      END IF;     
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_INDD_CODE_DISTR.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBPROP_INDD_CODE_DISTR", function=KeyFunction.LIST_VALUES)
		public void frbpropInddCodeDistr_ListValues()
		{
			
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("FRVINDD"), toStr("QUERY"));
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
						errorMessage(GNls.Fget(toStr("FRAPROP-0126"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_INDD_CODE_DISTR.POST-TEXT-ITEM
		 IF :FRBPROP_INDD_CODE_DISTR IS NULL THEN
   :FRBPROP_INDD_CODE_DISTR_NAME := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_INDD_CODE_DISTR.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_INDD_CODE_DISTR", function=KeyFunction.ITEM_OUT)
		public void frbpropInddCodeDistr_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( frbpropElement.getFrbpropInddCodeDistr().isNull() )
				{
					frbpropElement.setFrbpropInddCodeDistrName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_INDD_CODE_DISTR.POST-CHANGE
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
		 * FRBPROP_INDD_CODE_DISTR.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_INDD_CODE_DISTR")
		public void frbpropInddCodeDistr_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropInddCodeDistr().isNull())
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

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_INDD_CODE_DISTR_NAME.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_INDD_CODE_DISTR_NAME", function=KeyFunction.ITEM_CHANGE)
		public void frbpropInddCodeDistrName_itemChange()
		{
			
				getGDescClass().itemChange();
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_BASI_CODE_CS.KEY-LISTVAL
		 BEGIN
   :GLOBAL.BASIS_TYPE := 'C';
   :GLOBAL.FORM_WAS_CALLED := 'Y';
--
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
         MESSAGE( G$_NLS.Get('FRAPROP-0127', 'FORM','*ERROR* Item is protected against update.') );             
      END IF;     
   END IF;
END;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BASI_CODE_CS.KEY-LISTVAL
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-LISTVAL", item="FRBPROP_BASI_CODE_CS", function=KeyFunction.LIST_VALUES)
		public void frbpropBasiCodeCs_ListValues()
		{
			
				setGlobal("BASIS_TYPE", toStr("C"));
				setGlobal("FORM_WAS_CALLED", toStr("Y"));
				// 
				getTask().getGoqrpls().gSecuredFormCall(getUser(), toStr("FRVBASI"), toStr("QUERY"));
				setGlobal("FORM_WAS_CALLED", toStr("N"));
				if ( !getNameIn("GLOBAL.VALUE").isNull() )
				{
					// F2J_WARNING : The built-in  call was converted but there can be semantic differences in the resulting code.
					if ( getItemUpdateAllowed(getCursorItem()).equals("TRUE") || (
							//morphis TODO
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
						errorMessage(GNls.Fget(toStr("FRAPROP-0127"), toStr("FORM"), toStr("*ERROR* Item is protected against update.")));
					}
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_BASI_CODE_CS.POST-CHANGE
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
		 * FRBPROP_BASI_CODE_CS.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_BASI_CODE_CS")
		public void frbpropBasiCodeCs_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropBasiCodeCs().isNull())
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

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_BASI_CODE_CS.POST-TEXT-ITEM
		 IF :FRBPROP_BASI_CODE_CS IS NULL THEN
    :FRBPROP_BASI_CODE_CS_NAME := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BASI_CODE_CS.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_BASI_CODE_CS", function=KeyFunction.ITEM_OUT)
		public void frbpropBasiCodeCs_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( frbpropElement.getFrbpropBasiCodeCs().isNull() )
				{
					frbpropElement.setFrbpropBasiCodeCsName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_BASI_CODE_CS.WHEN-NEW-ITEM-INSTANCE
		 <multilinecomment> EXECUTE_TRIGGER('CHECK_INDIRECT_COST_ITEMS');
 G$_CHECK_FAILURE; 
--
IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
   GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
   MESSAGE('Chart of Accounts must be entered.');
   RAISE FORM_TRIGGER_FAILURE;
END IF;</multilinecomment>
null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BASI_CODE_CS.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_BASI_CODE_CS", function=KeyFunction.ITEM_CHANGE)
		public void frbpropBasiCodeCs_itemChange()
		{
			
				//  EXECUTE_TRIGGER('CHECK_INDIRECT_COST_ITEMS');
				// G$_CHECK_FAILURE;
				// --
				// IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
				// GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
				// MESSAGE('Chart of Accounts must be entered.');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				//  EXECUTE_TRIGGER('CHECK_INDIRECT_COST_ITEMS');
				// G$_CHECK_FAILURE;
				// --
				// IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
				// GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
				// MESSAGE('Chart of Accounts must be entered.');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_CSTR_CODE_RATE.WHEN-NEW-ITEM-INSTANCE
		  <multilinecomment>EXECUTE_TRIGGER('CHECK_INDIRECT_COST_ITEMS');
 G$_CHECK_FAILURE; 
--
IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
   GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
   MESSAGE('Chart of Accounts must be entered.');
   RAISE FORM_TRIGGER_FAILURE;
END IF;
--
IF :FRBPROP_BASI_CODE_CS IS NULL THEN
   GO_ITEM('FRBPROP_BASI_CODE_CS');
   G$_CHECK_FAILURE;
   MESSAGE('C/S Basis Code is required if a C/S Rate Code is entered');
   RAISE FORM_TRIGGER_FAILURE;
END IF;</multilinecomment>
null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CSTR_CODE_RATE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_CSTR_CODE_RATE", function=KeyFunction.ITEM_CHANGE)
		public void frbpropCstrCodeRate_itemChange()
		{
			
				// EXECUTE_TRIGGER('CHECK_INDIRECT_COST_ITEMS');
				// G$_CHECK_FAILURE;
				// --
				// IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
				// GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
				// MESSAGE('Chart of Accounts must be entered.');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				// --
				// IF :FRBPROP_BASI_CODE_CS IS NULL THEN
				// GO_ITEM('FRBPROP_BASI_CODE_CS');
				// G$_CHECK_FAILURE;
				// MESSAGE('C/S Basis Code is required if a C/S Rate Code is entered');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				// EXECUTE_TRIGGER('CHECK_INDIRECT_COST_ITEMS');
				// G$_CHECK_FAILURE;
				// --
				// IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
				// GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
				// MESSAGE('Chart of Accounts must be entered.');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				// --
				// IF :FRBPROP_BASI_CODE_CS IS NULL THEN
				// GO_ITEM('FRBPROP_BASI_CODE_CS');
				// G$_CHECK_FAILURE;
				// MESSAGE('C/S Basis Code is required if a C/S Rate Code is entered');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_CSTR_CODE_RATE.POST-TEXT-ITEM
		 IF :FRBPROP_CSTR_CODE_RATE IS NULL THEN
   :FRBPROP_CSTR_CODE_RATE_NAME := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CSTR_CODE_RATE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_CSTR_CODE_RATE", function=KeyFunction.ITEM_OUT)
		public void frbpropCstrCodeRate_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( frbpropElement.getFrbpropCstrCodeRate().isNull() )
				{
					frbpropElement.setFrbpropCstrCodeRateName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_CSTR_CODE_RATE.POST-CHANGE
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
		 * FRBPROP_CSTR_CODE_RATE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_CSTR_CODE_RATE")
		public void frbpropCstrCodeRate_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropCstrCodeRate().isNull())
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

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_CSTA_CODE_CHARGE.WHEN-NEW-ITEM-INSTANCE
		 <multilinecomment> EXECUTE_TRIGGER('CHECK_INDIRECT_COST_ITEMS');
 G$_CHECK_FAILURE; 
--
IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
   GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
   MESSAGE('Chart of Accounts must be entered.');
   RAISE FORM_TRIGGER_FAILURE;
END IF;
--
IF :FRBPROP_BASI_CODE_CS IS NULL THEN
   GO_ITEM('FRBPROP_BASI_CODE_CS');
   G$_CHECK_FAILURE;
   MESSAGE('C/S Basis Code is required if a C/S Charge Code is entered');
   RAISE FORM_TRIGGER_FAILURE;
END IF;</multilinecomment>
null;


		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CSTA_CODE_CHARGE.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_CSTA_CODE_CHARGE", function=KeyFunction.ITEM_CHANGE)
		public void frbpropCstaCodeCharge_itemChange()
		{
			
				//  EXECUTE_TRIGGER('CHECK_INDIRECT_COST_ITEMS');
				// G$_CHECK_FAILURE;
				// --
				// IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
				// GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
				// MESSAGE('Chart of Accounts must be entered.');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				// --
				// IF :FRBPROP_BASI_CODE_CS IS NULL THEN
				// GO_ITEM('FRBPROP_BASI_CODE_CS');
				// G$_CHECK_FAILURE;
				// MESSAGE('C/S Basis Code is required if a C/S Charge Code is entered');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				//  EXECUTE_TRIGGER('CHECK_INDIRECT_COST_ITEMS');
				// G$_CHECK_FAILURE;
				// --
				// IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
				// GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
				// MESSAGE('Chart of Accounts must be entered.');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				// --
				// IF :FRBPROP_BASI_CODE_CS IS NULL THEN
				// GO_ITEM('FRBPROP_BASI_CODE_CS');
				// G$_CHECK_FAILURE;
				// MESSAGE('C/S Basis Code is required if a C/S Charge Code is entered');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_CSTA_CODE_CHARGE.POST-CHANGE
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
		 * FRBPROP_CSTA_CODE_CHARGE.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_CSTA_CODE_CHARGE")
		public void frbpropCstaCodeCharge_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropCstaCodeCharge().isNull())
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

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_CSTA_CODE_CHARGE.POST-TEXT-ITEM
		 IF :FRBPROP_CSTA_CODE_CHARGE IS NULL THEN
   :FRBPROP_CSTA_CODE_CHARGE_NAME := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CSTA_CODE_CHARGE.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_CSTA_CODE_CHARGE", function=KeyFunction.ITEM_OUT)
		public void frbpropCstaCodeCharge_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( frbpropElement.getFrbpropCstaCodeCharge().isNull() )
				{
					frbpropElement.setFrbpropCstaCodeChargeName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_CSTD_CODE_DISTR.WHEN-NEW-ITEM-INSTANCE
		 <multilinecomment> EXECUTE_TRIGGER('CHECK_INDIRECT_COST_ITEMS');
 G$_CHECK_FAILURE; 
--
IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
   GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
   MESSAGE('Chart of Accounts must be entered.');
   RAISE FORM_TRIGGER_FAILURE;
END IF;
--
IF :FRBPROP_BASI_CODE_CS IS NULL THEN
   GO_ITEM('FRBPROP_BASI_CODE_CS');
   G$_CHECK_FAILURE;
   MESSAGE('C/S Basis Code is required if a C/S Distribution Code is entered');
   RAISE FORM_TRIGGER_FAILURE;
END IF;</multilinecomment>
null;

		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CSTD_CODE_DISTR.WHEN-NEW-ITEM-INSTANCE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="WHEN-NEW-ITEM-INSTANCE", item="FRBPROP_CSTD_CODE_DISTR", function=KeyFunction.ITEM_CHANGE)
		public void frbpropCstdCodeDistr_itemChange()
		{
			
				//  EXECUTE_TRIGGER('CHECK_INDIRECT_COST_ITEMS');
				// G$_CHECK_FAILURE;
				// --
				// IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
				// GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
				// MESSAGE('Chart of Accounts must be entered.');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				// --
				// IF :FRBPROP_BASI_CODE_CS IS NULL THEN
				// GO_ITEM('FRBPROP_BASI_CODE_CS');
				// G$_CHECK_FAILURE;
				// MESSAGE('C/S Basis Code is required if a C/S Distribution Code is entered');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				//  EXECUTE_TRIGGER('CHECK_INDIRECT_COST_ITEMS');
				// G$_CHECK_FAILURE;
				// --
				// IF :FRBPROP_COAS_CODE_IC_CS IS NULL THEN
				// GO_ITEM('FRBPROP_COAS_CODE_IC_CS');
				// MESSAGE('Chart of Accounts must be entered.');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
				// --
				// IF :FRBPROP_BASI_CODE_CS IS NULL THEN
				// GO_ITEM('FRBPROP_BASI_CODE_CS');
				// G$_CHECK_FAILURE;
				// MESSAGE('C/S Basis Code is required if a C/S Distribution Code is entered');
				// RAISE FORM_TRIGGER_FAILURE;
				// END IF;
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_CSTD_CODE_DISTR.POST-TEXT-ITEM
		 IF :FRBPROP_CSTD_CODE_DISTR IS NULL THEN
   :FRBPROP_CSTD_CODE_DISTR_NAME := '';
END IF;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CSTD_CODE_DISTR.POST-TEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-TEXT-ITEM", item="FRBPROP_CSTD_CODE_DISTR", function=KeyFunction.ITEM_OUT)
		public void frbpropCstdCodeDistr_itemOut()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if ( frbpropElement.getFrbpropCstdCodeDistr().isNull() )
				{
					frbpropElement.setFrbpropCstdCodeDistrName(toStr(""));
				}
			}

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_CSTD_CODE_DISTR.POST-CHANGE
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
		 * FRBPROP_CSTD_CODE_DISTR.POST-CHANGE
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="POST-CHANGE", item="FRBPROP_CSTD_CODE_DISTR")
		public void frbpropCstdCodeDistr_PostChange()
		{
			

				//F2J_WARNING : Caution, the variable may be null.
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);


				if(frbpropElement.getFrbpropCstdCodeDistr().isNull())
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

		
		/* Original PL/SQL code code for TRIGGER FRBPROP_FRINGE_RATE.KEY-NEXT-ITEM
		 go_item('FRBPROP_COAS_CODE_IC_CS');
g$_check_failure;
		*/
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_FRINGE_RATE.KEY-NEXT-ITEM
		 *
		 *
		 *</p>
		*/

		@ActionTrigger(action="KEY-NEXT-ITEM", item="FRBPROP_FRINGE_RATE", function=KeyFunction.NEXT_ITEM)
		public void frbpropFringeRate_keyNexItem()
		{
			
				goItem(toStr("FRBPROP_COAS_CODE_IC_CS"));
				getTask().getGoqrpls().gCheckFailure();
			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_COAS_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_COAS_CODE")
		public void frbpropCoasCode_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropCoasCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_LONG_TITLE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_LONG_TITLE")
		public void frbpropLongTitle_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropLongTitle_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_ORIG_PREP_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_ORIG_PREP_DATE")
		public void frbpropOrigPrepDate_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropOrigPrepDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_DUE_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_DUE_DATE")
		public void frbpropDueDate_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropDueDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_SUBMITTED_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_SUBMITTED_DATE")
		public void frbpropSubmittedDate_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropSubmittedDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_STATUS_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_STATUS_CODE")
		public void frbpropStatusCode_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropStatusCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_STATUS_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_STATUS_DATE")
		public void frbpropStatusDate_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropStatusDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROJECT_START_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_PROJECT_START_DATE")
		public void frbpropProjectStartDate_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropProjectStartDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROJECT_END_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_PROJECT_END_DATE")
		public void frbpropProjectEndDate_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropProjectEndDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BUDG_PRD_START_DAT.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_BUDG_PRD_START_DAT")
		public void frbpropBudgPrdStartDat_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropBudgPrdStartDat_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BUDG_PRD_END_DATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_BUDG_PRD_END_DATE")
		public void frbpropBudgPrdEndDate_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropBudgPrdEndDate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_EXPECTED_GRANT_DAT.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_EXPECTED_GRANT_DAT")
		public void frbpropExpectedGrantDat_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropExpectedGrantDat_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_PROP_CODE_RELATED.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_PROP_CODE_RELATED")
		public void frbpropPropCodeRelated_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropPropCodeRelated_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_AGENCY_ADDR_CODE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_AGENCY_ADDR_CODE")
		public void frbpropAgencyAddrCode_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropAgencyAddrCode_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_AGENCY_ADDR_SEQ_NUM.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_AGENCY_ADDR_SEQ_NUM")
		public void frbpropAgencyAddrSeqNum_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropAgencyAddrSeqNum_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_COAS_CODE_IC_CS.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_COAS_CODE_IC_CS")
		public void frbpropCoasCodeIcCs_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropCoasCodeIcCs_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BASI_CODE_IC.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_BASI_CODE_IC")
		public void frbpropBasiCodeIc_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropBasiCodeIc_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_INDR_CODE_RATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_INDR_CODE_RATE")
		public void frbpropIndrCodeRate_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropIndrCodeRate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_INDA_CODE_CHARGE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_INDA_CODE_CHARGE")
		public void frbpropIndaCodeCharge_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropIndaCodeCharge_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_INDD_CODE_DISTR.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_INDD_CODE_DISTR")
		public void frbpropInddCodeDistr_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropInddCodeDistr_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_BASI_CODE_CS.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_BASI_CODE_CS")
		public void frbpropBasiCodeCs_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropBasiCodeCs_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CSTR_CODE_RATE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_CSTR_CODE_RATE")
		public void frbpropCstrCodeRate_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropCstrCodeRate_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CSTA_CODE_CHARGE.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_CSTA_CODE_CHARGE")
		public void frbpropCstaCodeCharge_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropCstaCodeCharge_PostChange();

			}

		
		/*
		 *<p>
		 *<b>Migration Comments</b>
		 * Generated from trigger:
		 * FRBPROP_CSTD_CODE_DISTR.WHEN-VALIDATE-ITEM
		 *
		 *
		 *</p>
		*/

		@ValidationTrigger(item="FRBPROP_CSTD_CODE_DISTR")
		public void frbpropCstdCodeDistr_validate()
		{
			
				FrbpropAdapter frbpropElement = (FrbpropAdapter)this.getFormModel().getFrbprop().getRowAdapter(true);
							this.frbpropCstdCodeDistr_PostChange();

			}

		
	
	
}

