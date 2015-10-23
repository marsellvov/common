package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbFacCrsassign {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CRSASSIGN.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fChkFacultyJobAccess(NString pTerm,NNumber pPidm,NString pCrn,NString pCategory,NString pAccessInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CRSASSIGN.F_CHK_FACULTY_JOB_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_ACCESS_IND", pAccessInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CRSASSIGN.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FacCrsassignRecRow recOne,FacCrsassignRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CRSASSIGN.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FacCrsassignRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FacCrsassignRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CRSASSIGN.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CRSASSIGN.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CRSASSIGN.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CRSASSIGN.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,NString pCampCode,NString pCollCode,NString pFcntCode,NString pPosn,NString pSuff,NDate pJobEffectiveDate,NNumber pPercentResponse,NNumber pPercentSess,NNumber pTotalCreditHrSess,NNumber pTotalHrsWeek,NNumber pWorkload,NNumber pEnrl,NString pUserId,NString pDataOrigin,NString pPtrmCode,NNumber pWorkloadIncr,NNumber pRevisedCreditHrs,NNumber pRevisedHrsWeek,NNumber pRevisedWorkload,NNumber pRevisedEnrl,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CRSASSIGN.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_JOB_EFFECTIVE_DATE", pJobEffectiveDate);
			cmd.addParameter("@P_PERCENT_RESPONSE", pPercentResponse);
			cmd.addParameter("@P_PERCENT_SESS", pPercentSess);
			cmd.addParameter("@P_TOTAL_CREDIT_HR_SESS", pTotalCreditHrSess);
			cmd.addParameter("@P_TOTAL_HRS_WEEK", pTotalHrsWeek);
			cmd.addParameter("@P_WORKLOAD", pWorkload);
			cmd.addParameter("@P_ENRL", pEnrl);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PTRM_CODE", pPtrmCode);
			cmd.addParameter("@P_WORKLOAD_INCR", pWorkloadIncr);
			cmd.addParameter("@P_REVISED_CREDIT_HRS", pRevisedCreditHrs);
			cmd.addParameter("@P_REVISED_HRS_WEEK", pRevisedHrsWeek);
			cmd.addParameter("@P_REVISED_WORKLOAD", pRevisedWorkload);
			cmd.addParameter("@P_REVISED_ENRL", pRevisedEnrl);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CRSASSIGN.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CRSASSIGN.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,NString pCampCode,NString pCollCode,NString pFcntCode,NString pPosn,NString pSuff,NDate pJobEffectiveDate,NNumber pPercentResponse,NNumber pPercentSess,NNumber pTotalCreditHrSess,NNumber pTotalHrsWeek,NNumber pWorkload,NNumber pEnrl,NString pUserId,NString pDataOrigin,NString pPtrmCode,NNumber pWorkloadIncr,NNumber pRevisedCreditHrs,NNumber pRevisedHrsWeek,NNumber pRevisedWorkload,NNumber pRevisedEnrl,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_CRSASSIGN.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_JOB_EFFECTIVE_DATE", pJobEffectiveDate);
			cmd.addParameter("@P_PERCENT_RESPONSE", pPercentResponse);
			cmd.addParameter("@P_PERCENT_SESS", pPercentSess);
			cmd.addParameter("@P_TOTAL_CREDIT_HR_SESS", pTotalCreditHrSess);
			cmd.addParameter("@P_TOTAL_HRS_WEEK", pTotalHrsWeek);
			cmd.addParameter("@P_WORKLOAD", pWorkload);
			cmd.addParameter("@P_ENRL", pEnrl);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PTRM_CODE", pPtrmCode);
			cmd.addParameter("@P_WORKLOAD_INCR", pWorkloadIncr);
			cmd.addParameter("@P_REVISED_CREDIT_HRS", pRevisedCreditHrs);
			cmd.addParameter("@P_REVISED_HRS_WEEK", pRevisedHrsWeek);
			cmd.addParameter("@P_REVISED_WORKLOAD", pRevisedWorkload);
			cmd.addParameter("@P_REVISED_ENRL", pRevisedEnrl);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FacCrsassignRecRow", dataSourceName="FAC_CRSASSIGN_REC")
	public static class FacCrsassignRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_CRN")
		public NString RCrn;
		@DbRecordField(dataSourceName="R_CATEGORY")
		public NString RCategory;
		@DbRecordField(dataSourceName="R_CAMP_CODE")
		public NString RCampCode;
		@DbRecordField(dataSourceName="R_COLL_CODE")
		public NString RCollCode;
		@DbRecordField(dataSourceName="R_FCNT_CODE")
		public NString RFcntCode;
		@DbRecordField(dataSourceName="R_POSN")
		public NString RPosn;
		@DbRecordField(dataSourceName="R_SUFF")
		public NString RSuff;
		@DbRecordField(dataSourceName="R_JOB_EFFECTIVE_DATE")
		public NDate RJobEffectiveDate;
		@DbRecordField(dataSourceName="R_PERCENT_RESPONSE")
		public NNumber RPercentResponse;
		@DbRecordField(dataSourceName="R_PERCENT_SESS")
		public NNumber RPercentSess;
		@DbRecordField(dataSourceName="R_TOTAL_CREDIT_HR_SESS")
		public NNumber RTotalCreditHrSess;
		@DbRecordField(dataSourceName="R_TOTAL_HRS_WEEK")
		public NNumber RTotalHrsWeek;
		@DbRecordField(dataSourceName="R_WORKLOAD")
		public NNumber RWorkload;
		@DbRecordField(dataSourceName="R_ENRL")
		public NNumber REnrl;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_PTRM_CODE")
		public NString RPtrmCode;
		@DbRecordField(dataSourceName="R_WORKLOAD_INCR")
		public NNumber RWorkloadIncr;
		@DbRecordField(dataSourceName="R_REVISED_CREDIT_HRS")
		public NNumber RRevisedCreditHrs;
		@DbRecordField(dataSourceName="R_REVISED_HRS_WEEK")
		public NNumber RRevisedHrsWeek;
		@DbRecordField(dataSourceName="R_REVISED_WORKLOAD")
		public NNumber RRevisedWorkload;
		@DbRecordField(dataSourceName="R_REVISED_ENRL")
		public NNumber RRevisedEnrl;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
