package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvPersBp {
		public static NNumber fEarningsPriority(NString pEarnCode,NString pEarnTypeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_BP.F_EARNINGS_PRIORITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_EARN_TYPE_IND", pEarnTypeInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fJobOrder(NString pPersSpecialOnlyInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_BP.F_JOB_ORDER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PERS_SPECIAL_ONLY_IND", pPersSpecialOnlyInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fPayRate(NString pEarnTypeInd,NString pPensionableHrsInd,NString pSpecialCompInd,NString pPayRateType,NNumber pApptPct,NNumber pAssgnSalary,NNumber pRegRate,NNumber pRate,NNumber pPersPayRateOver) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_BP.F_PAY_RATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_EARN_TYPE_IND", pEarnTypeInd);
			cmd.addParameter("@P_PENSIONABLE_HRS_IND", pPensionableHrsInd);
			cmd.addParameter("@P_SPECIAL_COMP_IND", pSpecialCompInd);
			cmd.addParameter("@P_PAY_RATE_TYPE", pPayRateType);
			cmd.addParameter("@P_APPT_PCT", pApptPct);
			cmd.addParameter("@P_ASSGN_SALARY", pAssgnSalary);
			cmd.addParameter("@P_REG_RATE", pRegRate);
			cmd.addParameter("@P_RATE", pRate);
			cmd.addParameter("@P_PERS_PAY_RATE_OVER", pPersPayRateOver);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fPretaxInd(NString pBdcaCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_BP.F_PRETAX_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fProrateDeduction(NNumber pDeduction,NNumber pEarnings,NNumber pEarningsSum,NBool pIsLastIndex,Ref<NNumber> pDeductionProrateSum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_BP.F_PRORATE_DEDUCTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_DEDUCTION", pDeduction);
			cmd.addParameter("@P_EARNINGS", pEarnings);
			cmd.addParameter("@P_EARNINGS_SUM", pEarningsSum);
			cmd.addParameter("@P_IS_LAST_INDEX", pIsLastIndex);
			cmd.addParameter("@P_DEDUCTION_PRORATE_SUM", pDeductionProrateSum, true);
				
			cmd.execute();
			pDeductionProrateSum.val = cmd.getParameterValue("@P_DEDUCTION_PRORATE_SUM", NNumber.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fSumDeductions(NNumber pPretaxMemberCont,NNumber pPotaxMemberCont,NNumber pPretaxEmprCont,NNumber pSurvMemberCont,NNumber pSurvSpouMemberCont,NNumber pSurvChilMemberCont,NNumber pPotaxAddlMemberCont,NNumber pPretaxAddlEmprCont,NNumber pPotaxLoanPayment) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_BP.F_SUM_DEDUCTIONS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PRETAX_MEMBER_CONT", pPretaxMemberCont);
			cmd.addParameter("@P_POTAX_MEMBER_CONT", pPotaxMemberCont);
			cmd.addParameter("@P_PRETAX_EMPR_CONT", pPretaxEmprCont);
			cmd.addParameter("@P_SURV_MEMBER_CONT", pSurvMemberCont);
			cmd.addParameter("@P_SURV_SPOU_MEMBER_CONT", pSurvSpouMemberCont);
			cmd.addParameter("@P_SURV_CHIL_MEMBER_CONT", pSurvChilMemberCont);
			cmd.addParameter("@P_POTAX_ADDL_MEMBER_CONT", pPotaxAddlMemberCont);
			cmd.addParameter("@P_PRETAX_ADDL_EMPR_CONT", pPretaxAddlEmprCont);
			cmd.addParameter("@P_POTAX_LOAN_PAYMENT", pPotaxLoanPayment);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fTransType(NDate pCalnStartDate,NDate pCalnEndDate,NString pCalifPensionInd,NString pTypeInd,NString pEarnTypeInd,NString pSpecialCompInd,NString pPosnCalifType,NNumber pMaxSeqNo,NNumber pAssocSeqNo,NString pAssocTypeInd,NDate pReportBeginDate,NDate pReportEndDate,NDate pAdjsDate,NDate pEventDate,NString pPriorPeriodInd,NDate pPriorBeginDate,NDate pPriorEndDate,NString pAdjByVoidReissInd,NString pAdjByAdjustInd,NString pOrigPersReportInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_BP.F_TRANS_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CALN_START_DATE", pCalnStartDate);
			cmd.addParameter("@P_CALN_END_DATE", pCalnEndDate);
			cmd.addParameter("@P_CALIF_PENSION_IND", pCalifPensionInd);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
			cmd.addParameter("@P_EARN_TYPE_IND", pEarnTypeInd);
			cmd.addParameter("@P_SPECIAL_COMP_IND", pSpecialCompInd);
			cmd.addParameter("@P_POSN_CALIF_TYPE", pPosnCalifType);
			cmd.addParameter("@P_MAX_SEQ_NO", pMaxSeqNo);
			cmd.addParameter("@P_ASSOC_SEQ_NO", pAssocSeqNo);
			cmd.addParameter("@P_ASSOC_TYPE_IND", pAssocTypeInd);
			cmd.addParameter("@P_REPORT_BEGIN_DATE", pReportBeginDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
			cmd.addParameter("@P_ADJS_DATE", pAdjsDate);
			cmd.addParameter("@P_EVENT_DATE", pEventDate);
			cmd.addParameter("@P_PRIOR_PERIOD_IND", pPriorPeriodInd);
			cmd.addParameter("@P_PRIOR_BEGIN_DATE", pPriorBeginDate);
			cmd.addParameter("@P_PRIOR_END_DATE", pPriorEndDate);
			cmd.addParameter("@P_ADJ_BY_VOID_REISS_IND", pAdjByVoidReissInd);
			cmd.addParameter("@P_ADJ_BY_ADJUST_IND", pAdjByAdjustInd);
			cmd.addParameter("@P_ORIG_PERS_REPORT_IND", pOrigPersReportInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAnalyzeTables() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_BP.P_ANALYZE_TABLES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetDetails(NString pBatch,NDate pReportBeginDate,NDate pReportEndDate,NString pReportType,NString pSetFinalInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_BP.P_GET_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_REPORT_BEGIN_DATE", pReportBeginDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
			cmd.addParameter("@P_REPORT_TYPE", pReportType);
			cmd.addParameter("@P_SET_FINAL_IND", pSetFinalInd);
				
			cmd.execute();


		}
		
		public static void pGetParticipants(NString pBatch) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_BP.P_GET_PARTICIPANTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BATCH", pBatch);
				
			cmd.execute();


		}
		
		public static void pGetReports(NString pBatch,NDate pReportBeginDate,NDate pReportEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_BP.P_GET_REPORTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_REPORT_BEGIN_DATE", pReportBeginDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
				
			cmd.execute();


		}
		
		public static void pMsg(NString pMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_BP.P_MSG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MSG", pMsg);
				
			cmd.execute();


		}
		
		public static void pUpdateBatch(NString pBatch,NDate pReportBeginDate,NDate pReportEndDate,NString pReportType,NString pCreateDataInd,NString pTestReportInd,NString pCreateXmlInd,NString pSetFinalInd,Ref<NString> pOutFinalInd,Ref<NString> pOutMatchdatesInd,Ref<NString> pOutMissingEmprInd,Ref<NString> pOutNopaydataInd,Ref<NString> pOutWrongreportInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_BP.P_UPDATE_BATCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_REPORT_BEGIN_DATE", pReportBeginDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
			cmd.addParameter("@P_REPORT_TYPE", pReportType);
			cmd.addParameter("@P_CREATE_DATA_IND", pCreateDataInd);
			cmd.addParameter("@P_TEST_REPORT_IND", pTestReportInd);
			cmd.addParameter("@P_CREATE_XML_IND", pCreateXmlInd);
			cmd.addParameter("@P_SET_FINAL_IND", pSetFinalInd);
			cmd.addParameter("@P_OUT_FINAL_IND", NString.class);
			cmd.addParameter("@P_OUT_MATCHDATES_IND", NString.class);
			cmd.addParameter("@P_OUT_MISSING_EMPR_IND", NString.class);
			cmd.addParameter("@P_OUT_NOPAYDATA_IND", NString.class);
			cmd.addParameter("@P_OUT_WRONGREPORT_IND", NString.class);
				
			cmd.execute();
			pOutFinalInd.val = cmd.getParameterValue("@P_OUT_FINAL_IND", NString.class);
			pOutMatchdatesInd.val = cmd.getParameterValue("@P_OUT_MATCHDATES_IND", NString.class);
			pOutMissingEmprInd.val = cmd.getParameterValue("@P_OUT_MISSING_EMPR_IND", NString.class);
			pOutNopaydataInd.val = cmd.getParameterValue("@P_OUT_NOPAYDATA_IND", NString.class);
			pOutWrongreportInd.val = cmd.getParameterValue("@P_OUT_WRONGREPORT_IND", NString.class);


		}
		
	
	
	
}
