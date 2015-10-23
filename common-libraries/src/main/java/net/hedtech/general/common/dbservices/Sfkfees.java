package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkfees {
		public static NNumber fCalcPerCredCharge(NNumber maxCharge,NNumber minCharge,NString dcatCode,NString crseWaivInd,NNumber billHr,NNumber liabBillHrTuit,NNumber liabBillHrFees,NNumber waivHr,NNumber liabWaivHrTuit,NNumber liabWaivHrFees,NNumber perCredCharge) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_CALC_PER_CRED_CHARGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@MAX_CHARGE", maxCharge);
			cmd.addParameter("@MIN_CHARGE", minCharge);
			cmd.addParameter("@DCAT_CODE", dcatCode);
			cmd.addParameter("@CRSE_WAIV_IND", crseWaivInd);
			cmd.addParameter("@BILL_HR", billHr);
			cmd.addParameter("@LIAB_BILL_HR_TUIT", liabBillHrTuit);
			cmd.addParameter("@LIAB_BILL_HR_FEES", liabBillHrFees);
			cmd.addParameter("@WAIV_HR", waivHr);
			cmd.addParameter("@LIAB_WAIV_HR_TUIT", liabWaivHrTuit);
			cmd.addParameter("@LIAB_WAIV_HR_FEES", liabWaivHrFees);
			cmd.addParameter("@PER_CRED_CHARGE", perCredCharge);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcRuleHrs(NString dcatCode,NString crseWaivInd,NNumber regBillHr,NNumber liabBillHrTuit,NNumber liabBillHrFees,NNumber regWaivHr,NNumber liabWaivHrTuit,NNumber liabWaivHrFees) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_CALC_RULE_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@DCAT_CODE", dcatCode);
			cmd.addParameter("@CRSE_WAIV_IND", crseWaivInd);
			cmd.addParameter("@REG_BILL_HR", regBillHr);
			cmd.addParameter("@LIAB_BILL_HR_TUIT", liabBillHrTuit);
			cmd.addParameter("@LIAB_BILL_HR_FEES", liabBillHrFees);
			cmd.addParameter("@REG_WAIV_HR", regWaivHr);
			cmd.addParameter("@LIAB_WAIV_HR_TUIT", liabWaivHrTuit);
			cmd.addParameter("@LIAB_WAIV_HR_FEES", liabWaivHrFees);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor fCourseRecords(NString termIn,NNumber pidmIn,NString typeIn,NString typeValueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_COURSE_RECORDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TYPE_IN", typeIn);
			cmd.addParameter("@TYPE_VALUE_IN", typeValueIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fCourseTypes(NString termIn,NNumber pidmIn,NString typeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_COURSE_TYPES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TYPE_IN", typeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fCrnRecords(NString termIn,NNumber pidmIn,NString typeIn,NString typeValueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_CRN_RECORDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TYPE_IN", typeIn);
			cmd.addParameter("@TYPE_VALUE_IN", typeValueIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NBool fDdSinceLastAssessment(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_DD_SINCE_LAST_ASSESSMENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fEstablishoriginalcharge(NNumber pidmIn,NString termCodeIn,NString sourceCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_ESTABLISHORIGINALCHARGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@SOURCE_CODE_IN", sourceCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fEstsMeansWd(NString estsCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_ESTS_MEANS_WD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ESTS_CODE_IN", estsCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fEstsWdAssessed(NNumber pidmIn,NString termIn,Ref<NString> changedEstsDateIndOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_ESTS_WD_ASSESSED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CHANGED_ESTS_DATE_IND_OUT", NString.class);
				
			cmd.execute();
			changedEstsDateIndOut.val = cmd.getParameterValue("@CHANGED_ESTS_DATE_IND_OUT", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFlatRuleExists(NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_FLAT_RULE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NDate fGetAccdEffDate(NDate faEffDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_GET_ACCD_EFF_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@FA_EFF_DATE_IN", faEffDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate fGetDdHandledDate(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_GET_DD_HANDLED_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NNumber fGetPrevNondropHrs(NNumber pidmIn,NString termIn,NString crseWaivIn,NString typeIn,NString ruleValueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_GET_PREV_NONDROP_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRSE_WAIV_IN", crseWaivIn);
			cmd.addParameter("@TYPE_IN", typeIn);
			cmd.addParameter("@RULE_VALUE_IN", ruleValueIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetSfrfaudSeqno(NNumber pidmIn,NString termIn,NString sessionidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_GET_SFRFAUD_SEQNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NDate fGetSfrstcrDate(NNumber pidmIn,NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_GET_SFRSTCR_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate fLastDdActivityDate(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_LAST_DD_ACTIVITY_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NBool fPrevFlatRuleMet(NNumber pidmIn,NString termIn,NString ruleTypeIn,NString ruleValueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_PREV_FLAT_RULE_MET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@RULE_TYPE_IN", ruleTypeIn);
			cmd.addParameter("@RULE_VALUE_IN", ruleValueIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fRstsIncludeInAssess(NString rstsCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_RSTS_INCLUDE_IN_ASSESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@RSTS_CODE_IN", rstsCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fRstsMeansWd(NString rstsCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_RSTS_MEANS_WD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@RSTS_CODE_IN", rstsCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fRuleTypeDefined(NString termIn,NString ruleTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_RULE_TYPE_DEFINED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@RULE_TYPE_IN", ruleTypeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fSfrfmaxDefined(NString termIn,NString detlCodeIn,Ref<NNumber> minCharge,Ref<NNumber> maxCharge) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_SFRFMAX_DEFINED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@DETL_CODE_IN", detlCodeIn);
			cmd.addParameter("@MIN_CHARGE", NNumber.class);
			cmd.addParameter("@MAX_CHARGE", NNumber.class);
				
			cmd.execute();
			minCharge.val = cmd.getParameterValue("@MIN_CHARGE", NNumber.class);
			maxCharge.val = cmd.getParameterValue("@MAX_CHARGE", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTbraccdExists(NNumber pidmIn,NString termIn,NString detlCodeIn,NNumber amountIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_TBRACCD_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@DETL_CODE_IN", detlCodeIn);
			cmd.addParameter("@AMOUNT_IN", amountIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fVarCreditIntermediate(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.F_VAR_CREDIT_INTERMEDIATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pAdditionalfees(NNumber pidmIn,NString termIn,NString sourcePgmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_ADDITIONALFEES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SOURCE_PGM_IN", sourcePgmIn);
				
			cmd.execute();


		}
		
		public static void pApplyrules(NNumber pidmIn,NString termIn,NString ruleSourceIn,NString ruleTypeIn,NString ruleValueIn,NString ptrmRuleIn,NString gmodCodeIn,NString schdCodeIn,NString insmCodeIn,NString assessByCourseIndIn,NString sourcePgmIn,NNumber processFlatFromHrs,NNumber processFlatToHrs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_APPLYRULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@RULE_SOURCE_IN", ruleSourceIn);
			cmd.addParameter("@RULE_TYPE_IN", ruleTypeIn);
			cmd.addParameter("@RULE_VALUE_IN", ruleValueIn);
			cmd.addParameter("@PTRM_RULE_IN", ptrmRuleIn);
			cmd.addParameter("@GMOD_CODE_IN", gmodCodeIn);
			cmd.addParameter("@SCHD_CODE_IN", schdCodeIn);
			cmd.addParameter("@INSM_CODE_IN", insmCodeIn);
			cmd.addParameter("@ASSESS_BY_COURSE_IND_IN", assessByCourseIndIn);
			cmd.addParameter("@SOURCE_PGM_IN", sourcePgmIn);
			cmd.addParameter("@PROCESS_FLAT_FROM_HRS", processFlatFromHrs);
			cmd.addParameter("@PROCESS_FLAT_TO_HRS", processFlatToHrs);
				
			cmd.execute();


		}
		
		public static void pCalcFlatHrLiability(NNumber pidmIn,NString termIn,Ref<NNumber> tuiNondropBillHrInOut,Ref<NNumber> tuiNondropWaivHrInOut,Ref<NNumber> feeNondropBillHrInOut,Ref<NNumber> feeNondropWaivHrInOut,Ref<NNumber> liabOlBillHrTuitInOut,Ref<NNumber> liabOlWaivHrTuitInOut,Ref<NNumber> liabFlatBillHrTuitInOut,Ref<NNumber> liabFlatWaivHrTuitInOut,Ref<NNumber> liabBillHrTuitInOut,Ref<NNumber> liabWaivHrTuitInOut,Ref<NNumber> liabOlBillHrFeesInOut,Ref<NNumber> liabOlWaivHrFeesInOut,Ref<NNumber> liabFlatBillHrFeesInOut,Ref<NNumber> liabFlatWaivHrFeesInOut,Ref<NNumber> liabBillHrFeesInOut,Ref<NNumber> liabWaivHrFeesInOut,NNumber prevRuleFromFlatHrTuiIn,NNumber prevRuleOlStartHrTuiIn,NString lastMetFlatRuleIndTuiIn,NNumber prevRuleFromFlatHrFeeIn,NNumber prevRuleOlStartHrFeeIn,NString lastMetFlatRuleIndFeeIn,Ref<NBool> tuiCalculatedIndInOut,Ref<NBool> feeCalculatedIndInOut,Ref<NInteger> tuiFlatCnt,Ref<NInteger> tuiWaivFlatCnt,Ref<NInteger> feeFlatCnt,Ref<NInteger> feeWaivFlatCnt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_CALC_FLAT_HR_LIABILITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@TUI_NONDROP_BILL_HR_IN_OUT", tuiNondropBillHrInOut, true);
			cmd.addParameter("@TUI_NONDROP_WAIV_HR_IN_OUT", tuiNondropWaivHrInOut, true);
			cmd.addParameter("@FEE_NONDROP_BILL_HR_IN_OUT", feeNondropBillHrInOut, true);
			cmd.addParameter("@FEE_NONDROP_WAIV_HR_IN_OUT", feeNondropWaivHrInOut, true);
			cmd.addParameter("@LIAB_OL_BILL_HR_TUIT_IN_OUT", liabOlBillHrTuitInOut, true);
			cmd.addParameter("@LIAB_OL_WAIV_HR_TUIT_IN_OUT", liabOlWaivHrTuitInOut, true);
			cmd.addParameter("@LIAB_FLAT_BILL_HR_TUIT_IN_OUT", liabFlatBillHrTuitInOut, true);
			cmd.addParameter("@LIAB_FLAT_WAIV_HR_TUIT_IN_OUT", liabFlatWaivHrTuitInOut, true);
			cmd.addParameter("@LIAB_BILL_HR_TUIT_IN_OUT", liabBillHrTuitInOut, true);
			cmd.addParameter("@LIAB_WAIV_HR_TUIT_IN_OUT", liabWaivHrTuitInOut, true);
			cmd.addParameter("@LIAB_OL_BILL_HR_FEES_IN_OUT", liabOlBillHrFeesInOut, true);
			cmd.addParameter("@LIAB_OL_WAIV_HR_FEES_IN_OUT", liabOlWaivHrFeesInOut, true);
			cmd.addParameter("@LIAB_FLAT_BILL_HR_FEES_IN_OUT", liabFlatBillHrFeesInOut, true);
			cmd.addParameter("@LIAB_FLAT_WAIV_HR_FEES_IN_OUT", liabFlatWaivHrFeesInOut, true);
			cmd.addParameter("@LIAB_BILL_HR_FEES_IN_OUT", liabBillHrFeesInOut, true);
			cmd.addParameter("@LIAB_WAIV_HR_FEES_IN_OUT", liabWaivHrFeesInOut, true);
			cmd.addParameter("@PREV_RULE_FROM_FLAT_HR_TUI_IN", prevRuleFromFlatHrTuiIn);
			cmd.addParameter("@PREV_RULE_OL_START_HR_TUI_IN", prevRuleOlStartHrTuiIn);
			cmd.addParameter("@LAST_MET_FLAT_RULE_IND_TUI_IN", lastMetFlatRuleIndTuiIn);
			cmd.addParameter("@PREV_RULE_FROM_FLAT_HR_FEE_IN", prevRuleFromFlatHrFeeIn);
			cmd.addParameter("@PREV_RULE_OL_START_HR_FEE_IN", prevRuleOlStartHrFeeIn);
			cmd.addParameter("@LAST_MET_FLAT_RULE_IND_FEE_IN", lastMetFlatRuleIndFeeIn);
			cmd.addParameter("@TUI_CALCULATED_IND_IN_OUT", tuiCalculatedIndInOut, true);
			cmd.addParameter("@FEE_CALCULATED_IND_IN_OUT", feeCalculatedIndInOut, true);
			cmd.addParameter("@TUI_FLAT_CNT", tuiFlatCnt, true);
			cmd.addParameter("@TUI_WAIV_FLAT_CNT", tuiWaivFlatCnt, true);
			cmd.addParameter("@FEE_FLAT_CNT", feeFlatCnt, true);
			cmd.addParameter("@FEE_WAIV_FLAT_CNT", feeWaivFlatCnt, true);
				
			cmd.execute();
			tuiNondropBillHrInOut.val = cmd.getParameterValue("@TUI_NONDROP_BILL_HR_IN_OUT", NNumber.class);
			tuiNondropWaivHrInOut.val = cmd.getParameterValue("@TUI_NONDROP_WAIV_HR_IN_OUT", NNumber.class);
			feeNondropBillHrInOut.val = cmd.getParameterValue("@FEE_NONDROP_BILL_HR_IN_OUT", NNumber.class);
			feeNondropWaivHrInOut.val = cmd.getParameterValue("@FEE_NONDROP_WAIV_HR_IN_OUT", NNumber.class);
			liabOlBillHrTuitInOut.val = cmd.getParameterValue("@LIAB_OL_BILL_HR_TUIT_IN_OUT", NNumber.class);
			liabOlWaivHrTuitInOut.val = cmd.getParameterValue("@LIAB_OL_WAIV_HR_TUIT_IN_OUT", NNumber.class);
			liabFlatBillHrTuitInOut.val = cmd.getParameterValue("@LIAB_FLAT_BILL_HR_TUIT_IN_OUT", NNumber.class);
			liabFlatWaivHrTuitInOut.val = cmd.getParameterValue("@LIAB_FLAT_WAIV_HR_TUIT_IN_OUT", NNumber.class);
			liabBillHrTuitInOut.val = cmd.getParameterValue("@LIAB_BILL_HR_TUIT_IN_OUT", NNumber.class);
			liabWaivHrTuitInOut.val = cmd.getParameterValue("@LIAB_WAIV_HR_TUIT_IN_OUT", NNumber.class);
			liabOlBillHrFeesInOut.val = cmd.getParameterValue("@LIAB_OL_BILL_HR_FEES_IN_OUT", NNumber.class);
			liabOlWaivHrFeesInOut.val = cmd.getParameterValue("@LIAB_OL_WAIV_HR_FEES_IN_OUT", NNumber.class);
			liabFlatBillHrFeesInOut.val = cmd.getParameterValue("@LIAB_FLAT_BILL_HR_FEES_IN_OUT", NNumber.class);
			liabFlatWaivHrFeesInOut.val = cmd.getParameterValue("@LIAB_FLAT_WAIV_HR_FEES_IN_OUT", NNumber.class);
			liabBillHrFeesInOut.val = cmd.getParameterValue("@LIAB_BILL_HR_FEES_IN_OUT", NNumber.class);
			liabWaivHrFeesInOut.val = cmd.getParameterValue("@LIAB_WAIV_HR_FEES_IN_OUT", NNumber.class);
			tuiCalculatedIndInOut.val = cmd.getParameterValue("@TUI_CALCULATED_IND_IN_OUT", NBool.class);
			feeCalculatedIndInOut.val = cmd.getParameterValue("@FEE_CALCULATED_IND_IN_OUT", NBool.class);
			tuiFlatCnt.val = cmd.getParameterValue("@TUI_FLAT_CNT", NInteger.class);
			tuiWaivFlatCnt.val = cmd.getParameterValue("@TUI_WAIV_FLAT_CNT", NInteger.class);
			feeFlatCnt.val = cmd.getParameterValue("@FEE_FLAT_CNT", NInteger.class);
			feeWaivFlatCnt.val = cmd.getParameterValue("@FEE_WAIV_FLAT_CNT", NInteger.class);


		}
		
		public static void pCalcRbtRefunds(NNumber pidmIn,NString termIn,NString sourcePgmIn,NString ignoreSfrfmaxIndIn,NString postRbtPenaltiesIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_CALC_RBT_REFUNDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SOURCE_PGM_IN", sourcePgmIn);
			cmd.addParameter("@IGNORE_SFRFMAX_IND_IN", ignoreSfrfmaxIndIn);
			cmd.addParameter("@POST_RBT_PENALTIES_IN", postRbtPenaltiesIn);
				
			cmd.execute();


		}
		
		public static void pCalcRbtRefundsByCrn(NNumber pidmIn,NString termIn,NString sourcePgmIn,NString ignoreSfrfmaxIndIn,NString postRbtPenaltiesIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_CALC_RBT_REFUNDS_BY_CRN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SOURCE_PGM_IN", sourcePgmIn);
			cmd.addParameter("@IGNORE_SFRFMAX_IND_IN", ignoreSfrfmaxIndIn);
			cmd.addParameter("@POST_RBT_PENALTIES_IN", postRbtPenaltiesIn);
				
			cmd.execute();


		}
		
		public static void pCalcRegHrLiability(Ref<NNumber> pTotRegBillHr,Ref<NNumber> pTotLiabBillHrTuit,Ref<NNumber> pTotLiabBillHrFees,Ref<NNumber> pTotRegWaivHr,Ref<NNumber> pTotLiabWaivHrTuit,Ref<NNumber> pTotLiabWaivHrFees) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_CALC_REG_HR_LIABILITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TOT_REG_BILL_HR", pTotRegBillHr, true);
			cmd.addParameter("@P_TOT_LIAB_BILL_HR_TUIT", pTotLiabBillHrTuit, true);
			cmd.addParameter("@P_TOT_LIAB_BILL_HR_FEES", pTotLiabBillHrFees, true);
			cmd.addParameter("@P_TOT_REG_WAIV_HR", pTotRegWaivHr, true);
			cmd.addParameter("@P_TOT_LIAB_WAIV_HR_TUIT", pTotLiabWaivHrTuit, true);
			cmd.addParameter("@P_TOT_LIAB_WAIV_HR_FEES", pTotLiabWaivHrFees, true);
				
			cmd.execute();
			pTotRegBillHr.val = cmd.getParameterValue("@P_TOT_REG_BILL_HR", NNumber.class);
			pTotLiabBillHrTuit.val = cmd.getParameterValue("@P_TOT_LIAB_BILL_HR_TUIT", NNumber.class);
			pTotLiabBillHrFees.val = cmd.getParameterValue("@P_TOT_LIAB_BILL_HR_FEES", NNumber.class);
			pTotRegWaivHr.val = cmd.getParameterValue("@P_TOT_REG_WAIV_HR", NNumber.class);
			pTotLiabWaivHrTuit.val = cmd.getParameterValue("@P_TOT_LIAB_WAIV_HR_TUIT", NNumber.class);
			pTotLiabWaivHrFees.val = cmd.getParameterValue("@P_TOT_LIAB_WAIV_HR_FEES", NNumber.class);


		}
		
		public static void pCalcRfstLiability(NNumber pidmIn,NString termIn,NString estsWdAssessedIndIn,NString sourcePgmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_CALC_RFST_LIABILITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@ESTS_WD_ASSESSED_IND_IN", estsWdAssessedIndIn);
			cmd.addParameter("@SOURCE_PGM_IN", sourcePgmIn);
				
			cmd.execute();


		}
		
		public static void pCalcSwapLiability(NNumber pidmIn,NString termIn,NNumber phrsIn,NDate pstartIn,NDate pendIn,NString sourcePgmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_CALC_SWAP_LIABILITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PHRS_IN", phrsIn);
			cmd.addParameter("@PSTART_IN", pstartIn);
			cmd.addParameter("@PEND_IN", pendIn);
			cmd.addParameter("@SOURCE_PGM_IN", sourcePgmIn);
				
			cmd.execute();


		}
		
		public static void pCalcliability(NNumber pidmIn,NString termIn,NString sourcePgmIn,NString typeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_CALCLIABILITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SOURCE_PGM_IN", sourcePgmIn);
			cmd.addParameter("@TYPE_IN", typeIn);
				
			cmd.execute();


		}
		
		public static void pCoursesByRfcr(NNumber pidmIn,NString termIn,NString sourcePgmIn,Ref<NNumber> returnStatusInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_COURSES_BY_RFCR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SOURCE_PGM_IN", sourcePgmIn);
			cmd.addParameter("@RETURN_STATUS_IN_OUT", returnStatusInOut, true);
				
			cmd.execute();
			returnStatusInOut.val = cmd.getParameterValue("@RETURN_STATUS_IN_OUT", NNumber.class);


		}
		
		public static void pCreateNondropHrsSfrfaud(NNumber pidmIn,NString termIn,NString sourcePgmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_CREATE_NONDROP_HRS_SFRFAUD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SOURCE_PGM_IN", sourcePgmIn);
				
			cmd.execute();


		}
		
		public static void pCreateNondropType(NNumber pidmIn,NString termIn,NString sourcePgmIn,NString typeIn,NString ruleValueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_CREATE_NONDROP_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SOURCE_PGM_IN", sourcePgmIn);
			cmd.addParameter("@TYPE_IN", typeIn);
			cmd.addParameter("@RULE_VALUE_IN", ruleValueIn);
				
			cmd.execute();


		}
		
		public static void pDeleteMockAssessment(NNumber pidmIn,NString termIn,NString sessionidIn,NString actDateStrIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_DELETE_MOCK_ASSESSMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@ACT_DATE_STR_IN", actDateStrIn);
				
			cmd.execute();


		}
		
		public static void pDeleteSfrbtch(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_DELETE_SFRBTCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pExtensionfees(NNumber pidmIn,NString termIn,NString sourcePgmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_EXTENSIONFEES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SOURCE_PGM_IN", sourcePgmIn);
				
			cmd.execute();


		}
		
		public static void pGetLastAssessFlatData(NNumber pidmIn,NString termIn,Ref<NNumber> prevLiabBillHrInOut,Ref<NNumber> prevRuleFromFlatHrTuiIo,Ref<NNumber> prevRuleFromFlatHrFeeIo,Ref<NNumber> prevRuleOlStartHrTuiIo,Ref<NNumber> prevRuleOlStartHrFeeIo,NString ruleTypeIn,NString ruleValueIn,Ref<NString> lastMetFlatIndTuiInOut,Ref<NString> lastMetFlatIndFeeInOut,Ref<NString> prevRuleCrseWaivIndTuiIo,Ref<NString> prevRuleCrseWaivIndFeeIo,Ref<NNumber> startingLiabBillHrTuiOut,Ref<NNumber> startingLiabBillHrFeeOut,NNumber processFlatFromHrs,NNumber processFlatToHrs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_GET_LAST_ASSESS_FLAT_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PREV_LIAB_BILL_HR_IN_OUT", prevLiabBillHrInOut, true);
			cmd.addParameter("@PREV_RULE_FROM_FLAT_HR_TUI_IO", prevRuleFromFlatHrTuiIo, true);
			cmd.addParameter("@PREV_RULE_FROM_FLAT_HR_FEE_IO", prevRuleFromFlatHrFeeIo, true);
			cmd.addParameter("@PREV_RULE_OL_START_HR_TUI_IO", prevRuleOlStartHrTuiIo, true);
			cmd.addParameter("@PREV_RULE_OL_START_HR_FEE_IO", prevRuleOlStartHrFeeIo, true);
			cmd.addParameter("@RULE_TYPE_IN", ruleTypeIn);
			cmd.addParameter("@RULE_VALUE_IN", ruleValueIn);
			cmd.addParameter("@LAST_MET_FLAT_IND_TUI_IN_OUT", lastMetFlatIndTuiInOut, true);
			cmd.addParameter("@LAST_MET_FLAT_IND_FEE_IN_OUT", lastMetFlatIndFeeInOut, true);
			cmd.addParameter("@PREV_RULE_CRSE_WAIV_IND_TUI_IO", prevRuleCrseWaivIndTuiIo, true);
			cmd.addParameter("@PREV_RULE_CRSE_WAIV_IND_FEE_IO", prevRuleCrseWaivIndFeeIo, true);
			cmd.addParameter("@STARTING_LIAB_BILL_HR_TUI_OUT", NNumber.class);
			cmd.addParameter("@STARTING_LIAB_BILL_HR_FEE_OUT", NNumber.class);
			cmd.addParameter("@PROCESS_FLAT_FROM_HRS", processFlatFromHrs);
			cmd.addParameter("@PROCESS_FLAT_TO_HRS", processFlatToHrs);
				
			cmd.execute();
			prevLiabBillHrInOut.val = cmd.getParameterValue("@PREV_LIAB_BILL_HR_IN_OUT", NNumber.class);
			prevRuleFromFlatHrTuiIo.val = cmd.getParameterValue("@PREV_RULE_FROM_FLAT_HR_TUI_IO", NNumber.class);
			prevRuleFromFlatHrFeeIo.val = cmd.getParameterValue("@PREV_RULE_FROM_FLAT_HR_FEE_IO", NNumber.class);
			prevRuleOlStartHrTuiIo.val = cmd.getParameterValue("@PREV_RULE_OL_START_HR_TUI_IO", NNumber.class);
			prevRuleOlStartHrFeeIo.val = cmd.getParameterValue("@PREV_RULE_OL_START_HR_FEE_IO", NNumber.class);
			lastMetFlatIndTuiInOut.val = cmd.getParameterValue("@LAST_MET_FLAT_IND_TUI_IN_OUT", NString.class);
			lastMetFlatIndFeeInOut.val = cmd.getParameterValue("@LAST_MET_FLAT_IND_FEE_IN_OUT", NString.class);
			prevRuleCrseWaivIndTuiIo.val = cmd.getParameterValue("@PREV_RULE_CRSE_WAIV_IND_TUI_IO", NString.class);
			prevRuleCrseWaivIndFeeIo.val = cmd.getParameterValue("@PREV_RULE_CRSE_WAIV_IND_FEE_IO", NString.class);
			startingLiabBillHrTuiOut.val = cmd.getParameterValue("@STARTING_LIAB_BILL_HR_TUI_OUT", NNumber.class);
			startingLiabBillHrFeeOut.val = cmd.getParameterValue("@STARTING_LIAB_BILL_HR_FEE_OUT", NNumber.class);


		}
		
		public static void pGetNdropHrs(NNumber pidmIn,NString termIn,Ref<NNumber> sumNdropBillHrTuitIo,Ref<NNumber> sumNdropBillHrFeesIo,Ref<NNumber> sumNdropWaivHrTuitIo,Ref<NNumber> sumNdropWaivHrFeesIo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_GET_NDROP_HRS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SUM_NDROP_BILL_HR_TUIT_IO", sumNdropBillHrTuitIo, true);
			cmd.addParameter("@SUM_NDROP_BILL_HR_FEES_IO", sumNdropBillHrFeesIo, true);
			cmd.addParameter("@SUM_NDROP_WAIV_HR_TUIT_IO", sumNdropWaivHrTuitIo, true);
			cmd.addParameter("@SUM_NDROP_WAIV_HR_FEES_IO", sumNdropWaivHrFeesIo, true);
				
			cmd.execute();
			sumNdropBillHrTuitIo.val = cmd.getParameterValue("@SUM_NDROP_BILL_HR_TUIT_IO", NNumber.class);
			sumNdropBillHrFeesIo.val = cmd.getParameterValue("@SUM_NDROP_BILL_HR_FEES_IO", NNumber.class);
			sumNdropWaivHrTuitIo.val = cmd.getParameterValue("@SUM_NDROP_WAIV_HR_TUIT_IO", NNumber.class);
			sumNdropWaivHrFeesIo.val = cmd.getParameterValue("@SUM_NDROP_WAIV_HR_FEES_IO", NNumber.class);


		}
		
		public static void pGetSfrstcrData(NNumber pidmIn,NString termIn,NString needOrigBillHrs,Ref<NDate> actDate,Ref<NDate> addDate,Ref<NDate> firstActDate,Ref<NNumber> origBillHrs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_GET_SFRSTCR_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@NEED_ORIG_BILL_HRS", needOrigBillHrs);
			cmd.addParameter("@ACT_DATE", NDate.class);
			cmd.addParameter("@ADD_DATE", NDate.class);
			cmd.addParameter("@FIRST_ACT_DATE", NDate.class);
			cmd.addParameter("@ORIG_BILL_HRS", NNumber.class);
				
			cmd.execute();
			actDate.val = cmd.getParameterValue("@ACT_DATE", NDate.class);
			addDate.val = cmd.getParameterValue("@ADD_DATE", NDate.class);
			firstActDate.val = cmd.getParameterValue("@FIRST_ACT_DATE", NDate.class);
			origBillHrs.val = cmd.getParameterValue("@ORIG_BILL_HRS", NNumber.class);


		}
		
		public static void pInitGlobalVars() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_INIT_GLOBAL_VARS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertSfrfaud(NNumber pidmIn,NString termIn,NNumber sfrfaudSeqnoIn,NString assessRfndPenltyCdeIn,NString dcatCodeIn,NString detlCodeIn,NNumber chargeIn,NString assessByCrseIndIn,NString sourcePgmIn,NNumber sfrrgfeSeqnoIn,NString sfrrgfeTypeIn,NString crnIn,NString rstsCodeIn,NDate rstsDateIn,NString estsCodeIn,NDate estsDateIn,NString rfndTableIn,NNumber regBillHrIn,NNumber regWaivHrIn,NNumber ruleCredHrIn,NNumber ruleStudHrIn,NNumber perCredChargeIn,NNumber flatFeeAmtIn,NNumber overloadHrsIn,NNumber overloadChargeIn,NNumber tranNumberIn,NString noteIn,NNumber liableCredHrIn,NNumber rulePerCredChargeIn,NNumber ruleFlatFeeAmountIn,NNumber ruleFromFlatHrsIn,NNumber ruleToFlatHrsIn,NNumber ruleCrseOlStartHrIn,NString rgfeRuleValue,NString spathValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_INSERT_SFRFAUD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SFRFAUD_SEQNO_IN", sfrfaudSeqnoIn);
			cmd.addParameter("@ASSESS_RFND_PENLTY_CDE_IN", assessRfndPenltyCdeIn);
			cmd.addParameter("@DCAT_CODE_IN", dcatCodeIn);
			cmd.addParameter("@DETL_CODE_IN", detlCodeIn);
			cmd.addParameter("@CHARGE_IN", chargeIn);
			cmd.addParameter("@ASSESS_BY_CRSE_IND_IN", assessByCrseIndIn);
			cmd.addParameter("@SOURCE_PGM_IN", sourcePgmIn);
			cmd.addParameter("@SFRRGFE_SEQNO_IN", sfrrgfeSeqnoIn);
			cmd.addParameter("@SFRRGFE_TYPE_IN", sfrrgfeTypeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@RSTS_CODE_IN", rstsCodeIn);
			cmd.addParameter("@RSTS_DATE_IN", rstsDateIn);
			cmd.addParameter("@ESTS_CODE_IN", estsCodeIn);
			cmd.addParameter("@ESTS_DATE_IN", estsDateIn);
			cmd.addParameter("@RFND_TABLE_IN", rfndTableIn);
			cmd.addParameter("@REG_BILL_HR_IN", regBillHrIn);
			cmd.addParameter("@REG_WAIV_HR_IN", regWaivHrIn);
			cmd.addParameter("@RULE_CRED_HR_IN", ruleCredHrIn);
			cmd.addParameter("@RULE_STUD_HR_IN", ruleStudHrIn);
			cmd.addParameter("@PER_CRED_CHARGE_IN", perCredChargeIn);
			cmd.addParameter("@FLAT_FEE_AMT_IN", flatFeeAmtIn);
			cmd.addParameter("@OVERLOAD_HRS_IN", overloadHrsIn);
			cmd.addParameter("@OVERLOAD_CHARGE_IN", overloadChargeIn);
			cmd.addParameter("@TRAN_NUMBER_IN", tranNumberIn);
			cmd.addParameter("@NOTE_IN", noteIn);
			cmd.addParameter("@LIABLE_CRED_HR_IN", liableCredHrIn);
			cmd.addParameter("@RULE_PER_CRED_CHARGE_IN", rulePerCredChargeIn);
			cmd.addParameter("@RULE_FLAT_FEE_AMOUNT_IN", ruleFlatFeeAmountIn);
			cmd.addParameter("@RULE_FROM_FLAT_HRS_IN", ruleFromFlatHrsIn);
			cmd.addParameter("@RULE_TO_FLAT_HRS_IN", ruleToFlatHrsIn);
			cmd.addParameter("@RULE_CRSE_OL_START_HR_IN", ruleCrseOlStartHrIn);
			cmd.addParameter("@RGFE_RULE_VALUE", rgfeRuleValue);
			cmd.addParameter("@SPATH_VALUE", spathValue);
				
			cmd.execute();


		}
		
		public static void pInsertTbraccdRec(NNumber pidmIn,Ref<NNumber> accdTranNumInOut,NString termIn,NString audDetlCodeIn,NNumber amountIn,NNumber balanceIn,NDate effDateIn,NString srceCodeIn,NString crnIn,NDate transDateIn,NString origChgIndIn,NNumber stspKeySequence) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_INSERT_TBRACCD_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ACCD_TRAN_NUM_IN_OUT", accdTranNumInOut, true);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@AUD_DETL_CODE_IN", audDetlCodeIn);
			cmd.addParameter("@AMOUNT_IN", amountIn);
			cmd.addParameter("@BALANCE_IN", balanceIn);
			cmd.addParameter("@EFF_DATE_IN", effDateIn);
			cmd.addParameter("@SRCE_CODE_IN", srceCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TRANS_DATE_IN", transDateIn);
			cmd.addParameter("@ORIG_CHG_IND_IN", origChgIndIn);
			cmd.addParameter("@STSP_KEY_SEQUENCE", stspKeySequence);
				
			cmd.execute();
			accdTranNumInOut.val = cmd.getParameterValue("@ACCD_TRAN_NUM_IN_OUT", NNumber.class);


		}
		
		public static void pMultipleRules(NNumber pidmIn,NString termIn,NString ruleTypeIn,NString ruleValueIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_MULTIPLE_RULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@RULE_TYPE_IN", ruleTypeIn);
			cmd.addParameter("@RULE_VALUE_IN", ruleValueIn);
				
			cmd.execute();


		}
		
		public static void pPostRbtPenalties(NNumber pidmIn,NString termIn,NString sourcePgmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_POST_RBT_PENALTIES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SOURCE_PGM_IN", sourcePgmIn);
				
			cmd.execute();


		}
		
		public static void pPrintDbms(NString dbmsMsgIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_PRINT_DBMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DBMS_MSG_IN", dbmsMsgIn);
				
			cmd.execute();


		}
		
		public static void pProcessEtrmDrop(NNumber pidmIn,NString termIn,NDate dropDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_PROCESS_ETRM_DROP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@DROP_DATE_IN", dropDateIn);
				
			cmd.execute();


		}
		
		public static void pProcessHoursSwap(NNumber pidmIn,NString termIn,Ref<NNumber> phrsOut,Ref<NDate> pstartOut,Ref<NDate> pendOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_PROCESS_HOURS_SWAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PHRS_OUT", NNumber.class);
			cmd.addParameter("@PSTART_OUT", NDate.class);
			cmd.addParameter("@PEND_OUT", NDate.class);
				
			cmd.execute();
			phrsOut.val = cmd.getParameterValue("@PHRS_OUT", NNumber.class);
			pstartOut.val = cmd.getParameterValue("@PSTART_OUT", NDate.class);
			pendOut.val = cmd.getParameterValue("@PEND_OUT", NDate.class);


		}
		
		public static void pProcesscourse(NNumber pidmIn,NString termIn,NString rfndSourceTableIn,NString sourcePgmIn,Ref<NNumber> returnStatusInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_PROCESSCOURSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@RFND_SOURCE_TABLE_IN", rfndSourceTableIn);
			cmd.addParameter("@SOURCE_PGM_IN", sourcePgmIn);
			cmd.addParameter("@RETURN_STATUS_IN_OUT", returnStatusInOut, true);
				
			cmd.execute();
			returnStatusInOut.val = cmd.getParameterValue("@RETURN_STATUS_IN_OUT", NNumber.class);


		}
		
		public static void pProcessfeeassessment(NString termIn,NNumber pidmIn,NDate faEffDateIn,NDate rbtRfndDateIn,NString ruleEntryTypeIn,NString createAccdIndIn,NString sourcePgmIn,NString commitIndIn,Ref<NString> saveActDateOut,NString ignoreSfrfmaxIndIn,Ref<NNumber> returnStatusInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_PROCESSFEEASSESSMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@FA_EFF_DATE_IN", faEffDateIn);
			cmd.addParameter("@RBT_RFND_DATE_IN", rbtRfndDateIn);
			cmd.addParameter("@RULE_ENTRY_TYPE_IN", ruleEntryTypeIn);
			cmd.addParameter("@CREATE_ACCD_IND_IN", createAccdIndIn);
			cmd.addParameter("@SOURCE_PGM_IN", sourcePgmIn);
			cmd.addParameter("@COMMIT_IND_IN", commitIndIn);
			cmd.addParameter("@SAVE_ACT_DATE_OUT", NString.class);
			cmd.addParameter("@IGNORE_SFRFMAX_IND_IN", ignoreSfrfmaxIndIn);
			cmd.addParameter("@RETURN_STATUS_IN_OUT", returnStatusInOut, true);
				
			cmd.execute();
			saveActDateOut.val = cmd.getParameterValue("@SAVE_ACT_DATE_OUT", NString.class);
			returnStatusInOut.val = cmd.getParameterValue("@RETURN_STATUS_IN_OUT", NNumber.class);


		}
		
		public static void pReinitTempVars() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_REINIT_TEMP_VARS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pRevNonswapRbt(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_REV_NONSWAP_RBT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pReverseNaCharges(NNumber pidmIn,NString termIn,NString sourcePgmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_REVERSE_NA_CHARGES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SOURCE_PGM_IN", sourcePgmIn);
				
			cmd.execute();


		}
		
		public static void pSectionfees(NNumber pidmIn,NString termIn,NString sourcePgmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_SECTIONFEES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SOURCE_PGM_IN", sourcePgmIn);
				
			cmd.execute();


		}
		
		public static void pSetRbtVariables(NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_SET_RBT_VARIABLES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pSetRfstVariables(NString termIn,NString estsCodeIn,NDate estsDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_SET_RFST_VARIABLES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@ESTS_CODE_IN", estsCodeIn);
			cmd.addParameter("@ESTS_DATE_IN", estsDateIn);
				
			cmd.execute();


		}
		
		public static void pStudentcourses(NNumber pidmIn,NString termIn,NString sourcePgmIn,Ref<NNumber> returnStatusInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_STUDENTCOURSES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SOURCE_PGM_IN", sourcePgmIn);
			cmd.addParameter("@RETURN_STATUS_IN_OUT", returnStatusInOut, true);
				
			cmd.execute();
			returnStatusInOut.val = cmd.getParameterValue("@RETURN_STATUS_IN_OUT", NNumber.class);


		}
		
		public static void pTotalfees(NNumber pidmIn,NString termIn,NString sourcePgmIn,NString ignoreSfrfmaxIndIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKFEES.P_TOTALFEES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SOURCE_PGM_IN", sourcePgmIn);
			cmd.addParameter("@IGNORE_SFRFMAX_IND_IN", ignoreSfrfmaxIndIn);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="SftfeesRecRow", dataSourceName="SFTFEES_REC")
	public static class SftfeesRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TERM_CDE")
		public NString RTermCde;
		@DbRecordField(dataSourceName="R_CRN")
		public NString RCrn;
		@DbRecordField(dataSourceName="R_LEVL_CDE_CRSE")
		public NString RLevlCdeCrse;
		@DbRecordField(dataSourceName="R_CAMP_CDE_CRSE")
		public NString RCampCdeCrse;
		@DbRecordField(dataSourceName="R_PTRM_CDE")
		public NString RPtrmCde;
		@DbRecordField(dataSourceName="R_ADD_DATE")
		public NDate RAddDate;
		@DbRecordField(dataSourceName="R_RSTS_CDE")
		public NString RRstsCde;
		@DbRecordField(dataSourceName="R_RSTS_DATE")
		public NDate RRstsDate;
		@DbRecordField(dataSourceName="R_ESTS_CDE")
		public NString REstsCde;
		@DbRecordField(dataSourceName="R_ESTS_DATE")
		public NDate REstsDate;
		@DbRecordField(dataSourceName="R_REFUND_SOURCE_TABLE")
		public NString RRefundSourceTable;
		@DbRecordField(dataSourceName="R_GMOD_CDE")
		public NString RGmodCde;
		@DbRecordField(dataSourceName="R_CRSE_START_DATE")
		public NDate RCrseStartDate;
		@DbRecordField(dataSourceName="R_CRSE_END_DATE")
		public NDate RCrseEndDate;
		@DbRecordField(dataSourceName="R_REG_BILL_HR")
		public NNumber RRegBillHr;
		@DbRecordField(dataSourceName="R_BILL_HR_TUIT")
		public NNumber RBillHrTuit;
		@DbRecordField(dataSourceName="R_BILL_HR_FEES")
		public NNumber RBillHrFees;
		@DbRecordField(dataSourceName="R_REG_WAIV_HR")
		public NNumber RRegWaivHr;
		@DbRecordField(dataSourceName="R_WAIV_HR_TUIT")
		public NNumber RWaivHrTuit;
		@DbRecordField(dataSourceName="R_WAIV_HR_FEES")
		public NNumber RWaivHrFees;
		@DbRecordField(dataSourceName="R_TUIT_LIAB_PERCENTAGE")
		public NNumber RTuitLiabPercentage;
		@DbRecordField(dataSourceName="R_FEES_LIAB_PERCENTAGE")
		public NNumber RFeesLiabPercentage;
		@DbRecordField(dataSourceName="R_INSM_CDE")
		public NString RInsmCde;
		@DbRecordField(dataSourceName="R_SCHD_CDE")
		public NString RSchdCde;
	}

	
	@DbRecordType(id="SftfeesTypeRecRow", dataSourceName="SFTFEES_TYPE_REC")
	public static class SftfeesTypeRecRow
	{
		@DbRecordField(dataSourceName="SFTFEES_REC_TYPE")
		public NString SftfeesRecType;
	}

	
	
}
