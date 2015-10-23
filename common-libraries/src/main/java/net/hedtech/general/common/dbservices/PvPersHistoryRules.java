package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvPersHistoryRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_HISTORY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pBatch,NString pPersEmployerId,NDate pBeginDate,NDate pEndDate,NString pProgramType,NString pReportType,NString pRecordType,NNumber pPidm,NString pTransType,NString pPosn,NString pSuff,NString pUserId,NString pPersDivisionId,NString pSpecialCompInd,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NString pPersApptId,NString pPersPlanSipId,NString pPayRateType,NNumber pPayRate,NNumber pPersSchedHrsWeek,NString pPersSpecialOnlyInd,NString pAdjSamePayrollInd,NString pPersReportInd,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_HISTORY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_PERS_EMPLOYER_ID", pPersEmployerId);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_PROGRAM_TYPE", pProgramType);
			cmd.addParameter("@P_REPORT_TYPE", pReportType);
			cmd.addParameter("@P_RECORD_TYPE", pRecordType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRANS_TYPE", pTransType);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PERS_DIVISION_ID", pPersDivisionId);
			cmd.addParameter("@P_SPECIAL_COMP_IND", pSpecialCompInd);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PERS_APPT_ID", pPersApptId);
			cmd.addParameter("@P_PERS_PLAN_SIP_ID", pPersPlanSipId);
			cmd.addParameter("@P_PAY_RATE_TYPE", pPayRateType);
			cmd.addParameter("@P_PAY_RATE", pPayRate);
			cmd.addParameter("@P_PERS_SCHED_HRS_WEEK", pPersSchedHrsWeek);
			cmd.addParameter("@P_PERS_SPECIAL_ONLY_IND", pPersSpecialOnlyInd);
			cmd.addParameter("@P_ADJ_SAME_PAYROLL_IND", pAdjSamePayrollInd);
			cmd.addParameter("@P_PERS_REPORT_IND", pPersReportInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pBatch,NString pPersEmployerId,NDate pBeginDate,NDate pEndDate,NString pProgramType,NString pReportType,NString pRecordType,NNumber pPidm,NString pTransType,NString pPosn,NString pSuff,NString pUserId,NString pPersDivisionId,NString pSpecialCompInd,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NString pPersApptId,NString pPersPlanSipId,NString pPayRateType,NNumber pPayRate,NNumber pPersSchedHrsWeek,NString pPersSpecialOnlyInd,NString pAdjSamePayrollInd,NString pPersReportInd,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_HISTORY_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_PERS_EMPLOYER_ID", pPersEmployerId);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_PROGRAM_TYPE", pProgramType);
			cmd.addParameter("@P_REPORT_TYPE", pReportType);
			cmd.addParameter("@P_RECORD_TYPE", pRecordType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRANS_TYPE", pTransType);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PERS_DIVISION_ID", pPersDivisionId);
			cmd.addParameter("@P_SPECIAL_COMP_IND", pSpecialCompInd);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PERS_APPT_ID", pPersApptId);
			cmd.addParameter("@P_PERS_PLAN_SIP_ID", pPersPlanSipId);
			cmd.addParameter("@P_PAY_RATE_TYPE", pPayRateType);
			cmd.addParameter("@P_PAY_RATE", pPayRate);
			cmd.addParameter("@P_PERS_SCHED_HRS_WEEK", pPersSchedHrsWeek);
			cmd.addParameter("@P_PERS_SPECIAL_ONLY_IND", pPersSpecialOnlyInd);
			cmd.addParameter("@P_ADJ_SAME_PAYROLL_IND", pAdjSamePayrollInd);
			cmd.addParameter("@P_PERS_REPORT_IND", pPersReportInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
