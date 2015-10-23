package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvPersDetailReject {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_DETAIL_REJECT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_DETAIL_REJECT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(PersDetailRejectRecRow recOne,PersDetailRejectRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_DETAIL_REJECT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PersDetailRejectRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PersDetailRejectRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pBatch,NString pPersEmployerId,NNumber pPidm,NDate pBeginDate,NDate pEndDate,NString pPosn,NString pSuff,NString pMessage,NString pUserId,NString pTransType,NNumber pEarnings,NString pPersApptId,NString pPersDivisionId,NString pPersPlanSipId,NString pPayRateType,NNumber pPayRate,NNumber pSchedDays,NNumber pPersSchedHrsWeek,NString pPsccCode,NString pPsctCode,NNumber pSpecialCompAmt,NNumber pPretaxMemberCont,NNumber pPotaxMemberCont,NNumber pPretaxEmprCont,NNumber pSurvMemberCont,NNumber pSurvSpouMemberCont,NNumber pSurvChilMemberCont,NNumber pPotaxAddlMemberCont,NNumber pPretaxAddlEmprCont,NNumber pTotalWorkHrs,NNumber pPotaxLoanPayment,NString pDataOrigin,NNumber pEmprCostCont) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_DETAIL_REJECT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_PERS_EMPLOYER_ID", pPersEmployerId);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_TRANS_TYPE", pTransType);
			cmd.addParameter("@P_EARNINGS", pEarnings);
			cmd.addParameter("@P_PERS_APPT_ID", pPersApptId);
			cmd.addParameter("@P_PERS_DIVISION_ID", pPersDivisionId);
			cmd.addParameter("@P_PERS_PLAN_SIP_ID", pPersPlanSipId);
			cmd.addParameter("@P_PAY_RATE_TYPE", pPayRateType);
			cmd.addParameter("@P_PAY_RATE", pPayRate);
			cmd.addParameter("@P_SCHED_DAYS", pSchedDays);
			cmd.addParameter("@P_PERS_SCHED_HRS_WEEK", pPersSchedHrsWeek);
			cmd.addParameter("@P_PSCC_CODE", pPsccCode);
			cmd.addParameter("@P_PSCT_CODE", pPsctCode);
			cmd.addParameter("@P_SPECIAL_COMP_AMT", pSpecialCompAmt);
			cmd.addParameter("@P_PRETAX_MEMBER_CONT", pPretaxMemberCont);
			cmd.addParameter("@P_POTAX_MEMBER_CONT", pPotaxMemberCont);
			cmd.addParameter("@P_PRETAX_EMPR_CONT", pPretaxEmprCont);
			cmd.addParameter("@P_SURV_MEMBER_CONT", pSurvMemberCont);
			cmd.addParameter("@P_SURV_SPOU_MEMBER_CONT", pSurvSpouMemberCont);
			cmd.addParameter("@P_SURV_CHIL_MEMBER_CONT", pSurvChilMemberCont);
			cmd.addParameter("@P_POTAX_ADDL_MEMBER_CONT", pPotaxAddlMemberCont);
			cmd.addParameter("@P_PRETAX_ADDL_EMPR_CONT", pPretaxAddlEmprCont);
			cmd.addParameter("@P_TOTAL_WORK_HRS", pTotalWorkHrs);
			cmd.addParameter("@P_POTAX_LOAN_PAYMENT", pPotaxLoanPayment);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_EMPR_COST_CONT", pEmprCostCont);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_DETAIL_REJECT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pBatch,NString pPersEmployerId,NNumber pPidm,NDate pBeginDate,NDate pEndDate,NString pPosn,NString pSuff,NString pMessage,NString pUserId,NString pTransType,NNumber pEarnings,NString pPersApptId,NString pPersDivisionId,NString pPersPlanSipId,NString pPayRateType,NNumber pPayRate,NNumber pSchedDays,NNumber pPersSchedHrsWeek,NString pPsccCode,NString pPsctCode,NNumber pSpecialCompAmt,NNumber pPretaxMemberCont,NNumber pPotaxMemberCont,NNumber pPretaxEmprCont,NNumber pSurvMemberCont,NNumber pSurvSpouMemberCont,NNumber pSurvChilMemberCont,NNumber pPotaxAddlMemberCont,NNumber pPretaxAddlEmprCont,NNumber pTotalWorkHrs,NNumber pPotaxLoanPayment,NString pDataOrigin,NNumber pEmprCostCont) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_DETAIL_REJECT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_PERS_EMPLOYER_ID", pPersEmployerId);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_TRANS_TYPE", pTransType);
			cmd.addParameter("@P_EARNINGS", pEarnings);
			cmd.addParameter("@P_PERS_APPT_ID", pPersApptId);
			cmd.addParameter("@P_PERS_DIVISION_ID", pPersDivisionId);
			cmd.addParameter("@P_PERS_PLAN_SIP_ID", pPersPlanSipId);
			cmd.addParameter("@P_PAY_RATE_TYPE", pPayRateType);
			cmd.addParameter("@P_PAY_RATE", pPayRate);
			cmd.addParameter("@P_SCHED_DAYS", pSchedDays);
			cmd.addParameter("@P_PERS_SCHED_HRS_WEEK", pPersSchedHrsWeek);
			cmd.addParameter("@P_PSCC_CODE", pPsccCode);
			cmd.addParameter("@P_PSCT_CODE", pPsctCode);
			cmd.addParameter("@P_SPECIAL_COMP_AMT", pSpecialCompAmt);
			cmd.addParameter("@P_PRETAX_MEMBER_CONT", pPretaxMemberCont);
			cmd.addParameter("@P_POTAX_MEMBER_CONT", pPotaxMemberCont);
			cmd.addParameter("@P_PRETAX_EMPR_CONT", pPretaxEmprCont);
			cmd.addParameter("@P_SURV_MEMBER_CONT", pSurvMemberCont);
			cmd.addParameter("@P_SURV_SPOU_MEMBER_CONT", pSurvSpouMemberCont);
			cmd.addParameter("@P_SURV_CHIL_MEMBER_CONT", pSurvChilMemberCont);
			cmd.addParameter("@P_POTAX_ADDL_MEMBER_CONT", pPotaxAddlMemberCont);
			cmd.addParameter("@P_PRETAX_ADDL_EMPR_CONT", pPretaxAddlEmprCont);
			cmd.addParameter("@P_TOTAL_WORK_HRS", pTotalWorkHrs);
			cmd.addParameter("@P_POTAX_LOAN_PAYMENT", pPotaxLoanPayment);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_EMPR_COST_CONT", pEmprCostCont);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pBatch,NString pPersEmployerId,NNumber pPidm,NDate pBeginDate,NDate pEndDate,NString pPosn,NString pSuff,NString pMessage,NString pUserId,NString pTransType,NNumber pEarnings,NString pPersApptId,NString pPersDivisionId,NString pPersPlanSipId,NString pPayRateType,NNumber pPayRate,NNumber pSchedDays,NNumber pPersSchedHrsWeek,NString pPsccCode,NString pPsctCode,NNumber pSpecialCompAmt,NNumber pPretaxMemberCont,NNumber pPotaxMemberCont,NNumber pPretaxEmprCont,NNumber pSurvMemberCont,NNumber pSurvSpouMemberCont,NNumber pSurvChilMemberCont,NNumber pPotaxAddlMemberCont,NNumber pPretaxAddlEmprCont,NNumber pTotalWorkHrs,NNumber pPotaxLoanPayment,NString pDataOrigin,NNumber pEmprCostCont,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_DETAIL_REJECT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_PERS_EMPLOYER_ID", pPersEmployerId);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_TRANS_TYPE", pTransType);
			cmd.addParameter("@P_EARNINGS", pEarnings);
			cmd.addParameter("@P_PERS_APPT_ID", pPersApptId);
			cmd.addParameter("@P_PERS_DIVISION_ID", pPersDivisionId);
			cmd.addParameter("@P_PERS_PLAN_SIP_ID", pPersPlanSipId);
			cmd.addParameter("@P_PAY_RATE_TYPE", pPayRateType);
			cmd.addParameter("@P_PAY_RATE", pPayRate);
			cmd.addParameter("@P_SCHED_DAYS", pSchedDays);
			cmd.addParameter("@P_PERS_SCHED_HRS_WEEK", pPersSchedHrsWeek);
			cmd.addParameter("@P_PSCC_CODE", pPsccCode);
			cmd.addParameter("@P_PSCT_CODE", pPsctCode);
			cmd.addParameter("@P_SPECIAL_COMP_AMT", pSpecialCompAmt);
			cmd.addParameter("@P_PRETAX_MEMBER_CONT", pPretaxMemberCont);
			cmd.addParameter("@P_POTAX_MEMBER_CONT", pPotaxMemberCont);
			cmd.addParameter("@P_PRETAX_EMPR_CONT", pPretaxEmprCont);
			cmd.addParameter("@P_SURV_MEMBER_CONT", pSurvMemberCont);
			cmd.addParameter("@P_SURV_SPOU_MEMBER_CONT", pSurvSpouMemberCont);
			cmd.addParameter("@P_SURV_CHIL_MEMBER_CONT", pSurvChilMemberCont);
			cmd.addParameter("@P_POTAX_ADDL_MEMBER_CONT", pPotaxAddlMemberCont);
			cmd.addParameter("@P_PRETAX_ADDL_EMPR_CONT", pPretaxAddlEmprCont);
			cmd.addParameter("@P_TOTAL_WORK_HRS", pTotalWorkHrs);
			cmd.addParameter("@P_POTAX_LOAN_PAYMENT", pPotaxLoanPayment);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_EMPR_COST_CONT", pEmprCostCont);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pBatch,NString pPersEmployerId,NNumber pPidm,NDate pBeginDate,NDate pEndDate,NString pPosn,NString pSuff,NString pMessage,NString pUserId,NString pTransType,NNumber pEarnings,NString pPersApptId,NString pPersDivisionId,NString pPersPlanSipId,NString pPayRateType,NNumber pPayRate,NNumber pSchedDays,NNumber pPersSchedHrsWeek,NString pPsccCode,NString pPsctCode,NNumber pSpecialCompAmt,NNumber pPretaxMemberCont,NNumber pPotaxMemberCont,NNumber pPretaxEmprCont,NNumber pSurvMemberCont,NNumber pSurvSpouMemberCont,NNumber pSurvChilMemberCont,NNumber pPotaxAddlMemberCont,NNumber pPretaxAddlEmprCont,NNumber pTotalWorkHrs,NNumber pPotaxLoanPayment,NString pDataOrigin,NNumber pEmprCostCont,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_DETAIL_REJECT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_PERS_EMPLOYER_ID", pPersEmployerId);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_TRANS_TYPE", pTransType);
			cmd.addParameter("@P_EARNINGS", pEarnings);
			cmd.addParameter("@P_PERS_APPT_ID", pPersApptId);
			cmd.addParameter("@P_PERS_DIVISION_ID", pPersDivisionId);
			cmd.addParameter("@P_PERS_PLAN_SIP_ID", pPersPlanSipId);
			cmd.addParameter("@P_PAY_RATE_TYPE", pPayRateType);
			cmd.addParameter("@P_PAY_RATE", pPayRate);
			cmd.addParameter("@P_SCHED_DAYS", pSchedDays);
			cmd.addParameter("@P_PERS_SCHED_HRS_WEEK", pPersSchedHrsWeek);
			cmd.addParameter("@P_PSCC_CODE", pPsccCode);
			cmd.addParameter("@P_PSCT_CODE", pPsctCode);
			cmd.addParameter("@P_SPECIAL_COMP_AMT", pSpecialCompAmt);
			cmd.addParameter("@P_PRETAX_MEMBER_CONT", pPretaxMemberCont);
			cmd.addParameter("@P_POTAX_MEMBER_CONT", pPotaxMemberCont);
			cmd.addParameter("@P_PRETAX_EMPR_CONT", pPretaxEmprCont);
			cmd.addParameter("@P_SURV_MEMBER_CONT", pSurvMemberCont);
			cmd.addParameter("@P_SURV_SPOU_MEMBER_CONT", pSurvSpouMemberCont);
			cmd.addParameter("@P_SURV_CHIL_MEMBER_CONT", pSurvChilMemberCont);
			cmd.addParameter("@P_POTAX_ADDL_MEMBER_CONT", pPotaxAddlMemberCont);
			cmd.addParameter("@P_PRETAX_ADDL_EMPR_CONT", pPretaxAddlEmprCont);
			cmd.addParameter("@P_TOTAL_WORK_HRS", pTotalWorkHrs);
			cmd.addParameter("@P_POTAX_LOAN_PAYMENT", pPotaxLoanPayment);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_EMPR_COST_CONT", pEmprCostCont);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pBatch,NString pPersEmployerId,NNumber pPidm,NDate pBeginDate,NDate pEndDate,NString pPosn,NString pSuff,NString pMessage,NString pUserId,NString pTransType,NNumber pEarnings,NString pPersApptId,NString pPersDivisionId,NString pPersPlanSipId,NString pPayRateType,NNumber pPayRate,NNumber pSchedDays,NNumber pPersSchedHrsWeek,NString pPsccCode,NString pPsctCode,NNumber pSpecialCompAmt,NNumber pPretaxMemberCont,NNumber pPotaxMemberCont,NNumber pPretaxEmprCont,NNumber pSurvMemberCont,NNumber pSurvSpouMemberCont,NNumber pSurvChilMemberCont,NNumber pPotaxAddlMemberCont,NNumber pPretaxAddlEmprCont,NNumber pTotalWorkHrs,NNumber pPotaxLoanPayment,NString pDataOrigin,NNumber pEmprCostCont,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_DETAIL_REJECT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_PERS_EMPLOYER_ID", pPersEmployerId);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_TRANS_TYPE", pTransType);
			cmd.addParameter("@P_EARNINGS", pEarnings);
			cmd.addParameter("@P_PERS_APPT_ID", pPersApptId);
			cmd.addParameter("@P_PERS_DIVISION_ID", pPersDivisionId);
			cmd.addParameter("@P_PERS_PLAN_SIP_ID", pPersPlanSipId);
			cmd.addParameter("@P_PAY_RATE_TYPE", pPayRateType);
			cmd.addParameter("@P_PAY_RATE", pPayRate);
			cmd.addParameter("@P_SCHED_DAYS", pSchedDays);
			cmd.addParameter("@P_PERS_SCHED_HRS_WEEK", pPersSchedHrsWeek);
			cmd.addParameter("@P_PSCC_CODE", pPsccCode);
			cmd.addParameter("@P_PSCT_CODE", pPsctCode);
			cmd.addParameter("@P_SPECIAL_COMP_AMT", pSpecialCompAmt);
			cmd.addParameter("@P_PRETAX_MEMBER_CONT", pPretaxMemberCont);
			cmd.addParameter("@P_POTAX_MEMBER_CONT", pPotaxMemberCont);
			cmd.addParameter("@P_PRETAX_EMPR_CONT", pPretaxEmprCont);
			cmd.addParameter("@P_SURV_MEMBER_CONT", pSurvMemberCont);
			cmd.addParameter("@P_SURV_SPOU_MEMBER_CONT", pSurvSpouMemberCont);
			cmd.addParameter("@P_SURV_CHIL_MEMBER_CONT", pSurvChilMemberCont);
			cmd.addParameter("@P_POTAX_ADDL_MEMBER_CONT", pPotaxAddlMemberCont);
			cmd.addParameter("@P_PRETAX_ADDL_EMPR_CONT", pPretaxAddlEmprCont);
			cmd.addParameter("@P_TOTAL_WORK_HRS", pTotalWorkHrs);
			cmd.addParameter("@P_POTAX_LOAN_PAYMENT", pPotaxLoanPayment);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_EMPR_COST_CONT", pEmprCostCont);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_DETAIL_REJECT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pBatch,NString pPersEmployerId,NNumber pPidm,NDate pBeginDate,NDate pEndDate,NString pPosn,NString pSuff,NString pMessage,NString pUserId,NString pTransType,NNumber pEarnings,NString pPersApptId,NString pPersDivisionId,NString pPersPlanSipId,NString pPayRateType,NNumber pPayRate,NNumber pSchedDays,NNumber pPersSchedHrsWeek,NString pPsccCode,NString pPsctCode,NNumber pSpecialCompAmt,NNumber pPretaxMemberCont,NNumber pPotaxMemberCont,NNumber pPretaxEmprCont,NNumber pSurvMemberCont,NNumber pSurvSpouMemberCont,NNumber pSurvChilMemberCont,NNumber pPotaxAddlMemberCont,NNumber pPretaxAddlEmprCont,NNumber pTotalWorkHrs,NNumber pPotaxLoanPayment,NString pDataOrigin,NNumber pEmprCostCont,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_DETAIL_REJECT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_PERS_EMPLOYER_ID", pPersEmployerId);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_TRANS_TYPE", pTransType);
			cmd.addParameter("@P_EARNINGS", pEarnings);
			cmd.addParameter("@P_PERS_APPT_ID", pPersApptId);
			cmd.addParameter("@P_PERS_DIVISION_ID", pPersDivisionId);
			cmd.addParameter("@P_PERS_PLAN_SIP_ID", pPersPlanSipId);
			cmd.addParameter("@P_PAY_RATE_TYPE", pPayRateType);
			cmd.addParameter("@P_PAY_RATE", pPayRate);
			cmd.addParameter("@P_SCHED_DAYS", pSchedDays);
			cmd.addParameter("@P_PERS_SCHED_HRS_WEEK", pPersSchedHrsWeek);
			cmd.addParameter("@P_PSCC_CODE", pPsccCode);
			cmd.addParameter("@P_PSCT_CODE", pPsctCode);
			cmd.addParameter("@P_SPECIAL_COMP_AMT", pSpecialCompAmt);
			cmd.addParameter("@P_PRETAX_MEMBER_CONT", pPretaxMemberCont);
			cmd.addParameter("@P_POTAX_MEMBER_CONT", pPotaxMemberCont);
			cmd.addParameter("@P_PRETAX_EMPR_CONT", pPretaxEmprCont);
			cmd.addParameter("@P_SURV_MEMBER_CONT", pSurvMemberCont);
			cmd.addParameter("@P_SURV_SPOU_MEMBER_CONT", pSurvSpouMemberCont);
			cmd.addParameter("@P_SURV_CHIL_MEMBER_CONT", pSurvChilMemberCont);
			cmd.addParameter("@P_POTAX_ADDL_MEMBER_CONT", pPotaxAddlMemberCont);
			cmd.addParameter("@P_PRETAX_ADDL_EMPR_CONT", pPretaxAddlEmprCont);
			cmd.addParameter("@P_TOTAL_WORK_HRS", pTotalWorkHrs);
			cmd.addParameter("@P_POTAX_LOAN_PAYMENT", pPotaxLoanPayment);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_EMPR_COST_CONT", pEmprCostCont);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="PersDetailRejectRecRow", dataSourceName="PERS_DETAIL_REJECT_REC", needsInitialization=true)
	public static class PersDetailRejectRecRow
	{
		@DbRecordField(dataSourceName="R_BATCH")
		public NString RBatch;
		@DbRecordField(dataSourceName="R_PERS_EMPLOYER_ID")
		public NString RPersEmployerId;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_BEGIN_DATE")
		public NDate RBeginDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_POSN")
		public NString RPosn;
		@DbRecordField(dataSourceName="R_SUFF")
		public NString RSuff;
		@DbRecordField(dataSourceName="R_MESSAGE")
		public NString RMessage;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_TRANS_TYPE")
		public NString RTransType;
		@DbRecordField(dataSourceName="R_EARNINGS")
		public NNumber REarnings;
		@DbRecordField(dataSourceName="R_PERS_APPT_ID")
		public NString RPersApptId;
		@DbRecordField(dataSourceName="R_PERS_DIVISION_ID")
		public NString RPersDivisionId;
		@DbRecordField(dataSourceName="R_PERS_PLAN_SIP_ID")
		public NString RPersPlanSipId;
		@DbRecordField(dataSourceName="R_PAY_RATE_TYPE")
		public NString RPayRateType;
		@DbRecordField(dataSourceName="R_PAY_RATE")
		public NNumber RPayRate;
		@DbRecordField(dataSourceName="R_SCHED_DAYS")
		public NNumber RSchedDays;
		@DbRecordField(dataSourceName="R_PERS_SCHED_HRS_WEEK")
		public NNumber RPersSchedHrsWeek;
		@DbRecordField(dataSourceName="R_PSCC_CODE")
		public NString RPsccCode;
		@DbRecordField(dataSourceName="R_PSCT_CODE")
		public NString RPsctCode;
		@DbRecordField(dataSourceName="R_SPECIAL_COMP_AMT")
		public NNumber RSpecialCompAmt;
		@DbRecordField(dataSourceName="R_PRETAX_MEMBER_CONT")
		public NNumber RPretaxMemberCont;
		@DbRecordField(dataSourceName="R_POTAX_MEMBER_CONT")
		public NNumber RPotaxMemberCont;
		@DbRecordField(dataSourceName="R_PRETAX_EMPR_CONT")
		public NNumber RPretaxEmprCont;
		@DbRecordField(dataSourceName="R_SURV_MEMBER_CONT")
		public NNumber RSurvMemberCont;
		@DbRecordField(dataSourceName="R_SURV_SPOU_MEMBER_CONT")
		public NNumber RSurvSpouMemberCont;
		@DbRecordField(dataSourceName="R_SURV_CHIL_MEMBER_CONT")
		public NNumber RSurvChilMemberCont;
		@DbRecordField(dataSourceName="R_POTAX_ADDL_MEMBER_CONT")
		public NNumber RPotaxAddlMemberCont;
		@DbRecordField(dataSourceName="R_PRETAX_ADDL_EMPR_CONT")
		public NNumber RPretaxAddlEmprCont;
		@DbRecordField(dataSourceName="R_TOTAL_WORK_HRS")
		public NNumber RTotalWorkHrs;
		@DbRecordField(dataSourceName="R_POTAX_LOAN_PAYMENT")
		public NNumber RPotaxLoanPayment;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_EMPR_COST_CONT")
		public NNumber REmprCostCont;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
