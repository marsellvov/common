package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbFacNiolcomp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NIOLCOMP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fChkFacultyJobAccess(NString pTerm,NNumber pPidm,NNumber pNistSeqNo,NString pAccessInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NIOLCOMP.F_CHK_FACULTY_JOB_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_NIST_SEQ_NO", pNistSeqNo);
			cmd.addParameter("@P_ACCESS_IND", pAccessInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NString pTermCode,NNumber pPidm,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NIOLCOMP.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FacNiolcompRecRow recOne,FacNiolcompRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NIOLCOMP.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FacNiolcompRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FacNiolcompRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTermCode,NNumber pPidm,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NIOLCOMP.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NIOLCOMP.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTermCode,NNumber pPidm,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NIOLCOMP.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTermCode,NNumber pPidm,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NIOLCOMP.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTermCode,NNumber pPidm,NNumber pSeqNo,NString pNistCode,NString pPosn,NString pSuff,NDate pJobEffectiveDate,NString pUserId,NString pDataOrigin,NString pCollCode,NString pDeptCode,NNumber pRate,NString pCalcMethod,NNumber pCompNistWorkload,NNumber pCompWeeklyHrs,NNumber pCompensationAmount,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NIOLCOMP.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_NIST_CODE", pNistCode);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_JOB_EFFECTIVE_DATE", pJobEffectiveDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_RATE", pRate);
			cmd.addParameter("@P_CALC_METHOD", pCalcMethod);
			cmd.addParameter("@P_COMP_NIST_WORKLOAD", pCompNistWorkload);
			cmd.addParameter("@P_COMP_WEEKLY_HRS", pCompWeeklyHrs);
			cmd.addParameter("@P_COMPENSATION_AMOUNT", pCompensationAmount);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTermCode,NNumber pPidm,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NIOLCOMP.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTermCode,NNumber pPidm,NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NIOLCOMP.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTermCode,NNumber pPidm,NNumber pSeqNo,NString pNistCode,NString pPosn,NString pSuff,NDate pJobEffectiveDate,NString pUserId,NString pDataOrigin,NString pCollCode,NString pDeptCode,NNumber pRate,NString pCalcMethod,NNumber pCompNistWorkload,NNumber pCompWeeklyHrs,NNumber pCompensationAmount,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NIOLCOMP.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_NIST_CODE", pNistCode);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_JOB_EFFECTIVE_DATE", pJobEffectiveDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_RATE", pRate);
			cmd.addParameter("@P_CALC_METHOD", pCalcMethod);
			cmd.addParameter("@P_COMP_NIST_WORKLOAD", pCompNistWorkload);
			cmd.addParameter("@P_COMP_WEEKLY_HRS", pCompWeeklyHrs);
			cmd.addParameter("@P_COMPENSATION_AMOUNT", pCompensationAmount);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FacNiolcompRecRow", dataSourceName="FAC_NIOLCOMP_REC")
	public static class FacNiolcompRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_NIST_CODE")
		public NString RNistCode;
		@DbRecordField(dataSourceName="R_POSN")
		public NString RPosn;
		@DbRecordField(dataSourceName="R_SUFF")
		public NString RSuff;
		@DbRecordField(dataSourceName="R_JOB_EFFECTIVE_DATE")
		public NDate RJobEffectiveDate;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_COLL_CODE")
		public NString RCollCode;
		@DbRecordField(dataSourceName="R_DEPT_CODE")
		public NString RDeptCode;
		@DbRecordField(dataSourceName="R_RATE")
		public NNumber RRate;
		@DbRecordField(dataSourceName="R_CALC_METHOD")
		public NString RCalcMethod;
		@DbRecordField(dataSourceName="R_COMP_NIST_WORKLOAD")
		public NNumber RCompNistWorkload;
		@DbRecordField(dataSourceName="R_COMP_WEEKLY_HRS")
		public NNumber RCompWeeklyHrs;
		@DbRecordField(dataSourceName="R_COMPENSATION_AMOUNT")
		public NNumber RCompensationAmount;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
