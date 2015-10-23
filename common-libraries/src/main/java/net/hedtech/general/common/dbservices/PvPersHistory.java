package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvPersHistory {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_HISTORY.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pBatch,NString pPersEmployerId,NDate pBeginDate,NDate pEndDate,NString pProgramType,NString pReportType,NString pRecordType,NNumber pPidm,NString pTransType,NString pPosn,NString pSuff,NString pPersDivisionId,NString pSpecialCompInd,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NString pPersApptId,NString pPersPlanSipId,NString pPayRateType,NNumber pPayRate,NNumber pPersSchedHrsWeek,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_HISTORY.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(PersHistoryRecRow recOne,PersHistoryRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_HISTORY.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PersHistoryRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PersHistoryRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pBatch,NString pPersEmployerId,NDate pBeginDate,NDate pEndDate,NString pProgramType,NString pReportType,NString pRecordType,NNumber pPidm,NString pTransType,NString pPosn,NString pSuff,NString pPersDivisionId,NString pSpecialCompInd,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NString pPersApptId,NString pPersPlanSipId,NString pPayRateType,NNumber pPayRate,NNumber pPersSchedHrsWeek) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_HISTORY.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
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
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_HISTORY.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pBatch,NString pPersEmployerId,NDate pBeginDate,NDate pEndDate,NString pProgramType,NString pReportType,NString pRecordType,NNumber pPidm,NString pTransType,NString pPosn,NString pSuff,NString pPersDivisionId,NString pSpecialCompInd,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NString pPersApptId,NString pPersPlanSipId,NString pPayRateType,NNumber pPayRate,NNumber pPersSchedHrsWeek) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_HISTORY.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
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
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pBatch,NString pPersEmployerId,NDate pBeginDate,NDate pEndDate,NString pProgramType,NString pReportType,NString pRecordType,NNumber pPidm,NString pTransType,NString pPosn,NString pSuff,NString pPersDivisionId,NString pSpecialCompInd,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NString pPersApptId,NString pPersPlanSipId,NString pPayRateType,NNumber pPayRate,NNumber pPersSchedHrsWeek,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_HISTORY.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pBatch,NString pPersEmployerId,NDate pBeginDate,NDate pEndDate,NString pProgramType,NString pReportType,NString pRecordType,NNumber pPidm,NString pTransType,NString pPosn,NString pSuff,NString pUserId,NString pPersDivisionId,NString pSpecialCompInd,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NString pPersApptId,NString pPersPlanSipId,NString pPayRateType,NNumber pPayRate,NNumber pPersSchedHrsWeek,NString pPersSpecialOnlyInd,NString pAdjSamePayrollInd,NString pPersReportInd,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_HISTORY.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pBatch,NString pPersEmployerId,NDate pBeginDate,NDate pEndDate,NString pProgramType,NString pReportType,NString pRecordType,NNumber pPidm,NString pTransType,NString pPosn,NString pSuff,NString pPersDivisionId,NString pSpecialCompInd,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NString pPersApptId,NString pPersPlanSipId,NString pPayRateType,NNumber pPayRate,NNumber pPersSchedHrsWeek,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_HISTORY.P_DELETE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pBatch,NString pPersEmployerId,NDate pBeginDate,NDate pEndDate,NString pProgramType,NString pReportType,NString pRecordType,NNumber pPidm,NString pTransType,NString pPosn,NString pSuff,NString pPersDivisionId,NString pSpecialCompInd,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NString pPersApptId,NString pPersPlanSipId,NString pPayRateType,NNumber pPayRate,NNumber pPersSchedHrsWeek,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_HISTORY.P_LOCK", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pBatch,NString pPersEmployerId,NDate pBeginDate,NDate pEndDate,NString pProgramType,NString pReportType,NString pRecordType,NNumber pPidm,NString pTransType,NString pPosn,NString pSuff,NString pUserId,NString pPersDivisionId,NString pSpecialCompInd,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NString pPersApptId,NString pPersPlanSipId,NString pPayRateType,NNumber pPayRate,NNumber pPersSchedHrsWeek,NString pPersSpecialOnlyInd,NString pAdjSamePayrollInd,NString pPersReportInd,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_HISTORY.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="PersHistoryRecRow", dataSourceName="PERS_HISTORY_REC", needsInitialization=true)
	public static class PersHistoryRecRow
	{
		@DbRecordField(dataSourceName="R_BATCH")
		public NString RBatch;
		@DbRecordField(dataSourceName="R_PERS_EMPLOYER_ID")
		public NString RPersEmployerId;
		@DbRecordField(dataSourceName="R_BEGIN_DATE")
		public NDate RBeginDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_PROGRAM_TYPE")
		public NString RProgramType;
		@DbRecordField(dataSourceName="R_REPORT_TYPE")
		public NString RReportType;
		@DbRecordField(dataSourceName="R_RECORD_TYPE")
		public NString RRecordType;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TRANS_TYPE")
		public NString RTransType;
		@DbRecordField(dataSourceName="R_POSN")
		public NString RPosn;
		@DbRecordField(dataSourceName="R_SUFF")
		public NString RSuff;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_PERS_DIVISION_ID")
		public NString RPersDivisionId;
		@DbRecordField(dataSourceName="R_SPECIAL_COMP_IND")
		public NString RSpecialCompInd;
		@DbRecordField(dataSourceName="R_YEAR")
		public NString RYear;
		@DbRecordField(dataSourceName="R_PICT_CODE")
		public NString RPictCode;
		@DbRecordField(dataSourceName="R_PAYNO")
		public NNumber RPayno;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_PERS_APPT_ID")
		public NString RPersApptId;
		@DbRecordField(dataSourceName="R_PERS_PLAN_SIP_ID")
		public NString RPersPlanSipId;
		@DbRecordField(dataSourceName="R_PAY_RATE_TYPE")
		public NString RPayRateType;
		@DbRecordField(dataSourceName="R_PAY_RATE")
		public NNumber RPayRate;
		@DbRecordField(dataSourceName="R_PERS_SCHED_HRS_WEEK")
		public NNumber RPersSchedHrsWeek;
		@DbRecordField(dataSourceName="R_PERS_SPECIAL_ONLY_IND")
		public NString RPersSpecialOnlyInd;
		@DbRecordField(dataSourceName="R_ADJ_SAME_PAYROLL_IND")
		public NString RAdjSamePayrollInd;
		@DbRecordField(dataSourceName="R_PERS_REPORT_IND")
		public NString RPersReportInd;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
