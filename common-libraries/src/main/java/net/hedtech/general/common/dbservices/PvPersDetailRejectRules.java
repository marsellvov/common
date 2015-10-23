package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvPersDetailRejectRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_DETAIL_REJECT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pBatch,NString pPersEmployerId,NNumber pPidm,NDate pBeginDate,NDate pEndDate,NString pPosn,NString pSuff,NString pMessage,NString pUserId,NString pTransType,NNumber pEarnings,NString pPersApptId,NString pPersDivisionId,NString pPersPlanSipId,NString pPayRateType,NNumber pPayRate,NNumber pSchedDays,NNumber pPersSchedHrsWeek,NString pPsccCode,NString pPsctCode,NNumber pSpecialCompAmt,NNumber pPretaxMemberCont,NNumber pPotaxMemberCont,NNumber pPretaxEmprCont,NNumber pSurvMemberCont,NNumber pSurvSpouMemberCont,NNumber pSurvChilMemberCont,NNumber pPotaxAddlMemberCont,NNumber pPretaxAddlEmprCont,NNumber pTotalWorkHrs,NNumber pPotaxLoanPayment,NString pDataOrigin,NNumber pEmprCostCont,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_DETAIL_REJECT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pBatch,NString pPersEmployerId,NNumber pPidm,NDate pBeginDate,NDate pEndDate,NString pPosn,NString pSuff,NString pMessage,NString pUserId,NString pTransType,NNumber pEarnings,NString pPersApptId,NString pPersDivisionId,NString pPersPlanSipId,NString pPayRateType,NNumber pPayRate,NNumber pSchedDays,NNumber pPersSchedHrsWeek,NString pPsccCode,NString pPsctCode,NNumber pSpecialCompAmt,NNumber pPretaxMemberCont,NNumber pPotaxMemberCont,NNumber pPretaxEmprCont,NNumber pSurvMemberCont,NNumber pSurvSpouMemberCont,NNumber pSurvChilMemberCont,NNumber pPotaxAddlMemberCont,NNumber pPretaxAddlEmprCont,NNumber pTotalWorkHrs,NNumber pPotaxLoanPayment,NString pDataOrigin,NNumber pEmprCostCont) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_DETAIL_REJECT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
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


		}
		
	
	
	
}
