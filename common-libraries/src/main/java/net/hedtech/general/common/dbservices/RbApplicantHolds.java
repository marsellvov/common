package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbApplicantHolds {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_HOLDS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NNumber pPidm,NString pHoldCode,NDate pFromDate,NString pPeriod,NString pFundCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_HOLDS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_HOLD_CODE", pHoldCode);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ApplicantHoldsRecRow recOne,ApplicantHoldsRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_HOLDS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ApplicantHoldsRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ApplicantHoldsRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NNumber pPidm,NString pHoldCode,NDate pFromDate,NDate pToDate,NString pReleaseInd,NString pPeriod,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_HOLDS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_HOLD_CODE", pHoldCode);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_TO_DATE", pToDate);
			cmd.addParameter("@P_RELEASE_IND", pReleaseInd);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_HOLDS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NNumber pPidm,NString pHoldCode,NDate pFromDate,NString pPeriod,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_HOLDS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_HOLD_CODE", pHoldCode);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NNumber pPidm,NString pHoldCode,NDate pFromDate,NString pPeriod,NString pFundCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_HOLDS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_HOLD_CODE", pHoldCode);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pHoldCode,NDate pFromDate,NDate pToDate,NString pReleaseInd,NString pUserId,NString pReason,NString pPeriod,NString pFundCode,NString pDataOrigin,NString pTermCode,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_HOLDS.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_HOLD_CODE", pHoldCode);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_TO_DATE", pToDate);
			cmd.addParameter("@P_RELEASE_IND", pReleaseInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_REASON", pReason);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pAidyCode,NNumber pPidm,NString pHoldCode,NDate pFromDate,NString pPeriod,NString pFundCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_HOLDS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_HOLD_CODE", pHoldCode);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_HOLDS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pHoldCode,NDate pFromDate,NDate pToDate,NString pReleaseInd,NString pUserId,NString pReason,NString pPeriod,NString pFundCode,NString pDataOrigin,NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_HOLDS.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_HOLD_CODE", pHoldCode);
			cmd.addParameter("@P_FROM_DATE", pFromDate);
			cmd.addParameter("@P_TO_DATE", pToDate);
			cmd.addParameter("@P_RELEASE_IND", pReleaseInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_REASON", pReason);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ApplicantHoldsRecRow", dataSourceName="APPLICANT_HOLDS_REC")
	public static class ApplicantHoldsRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_HOLD_CODE")
		public NString RHoldCode;
		@DbRecordField(dataSourceName="R_FROM_DATE")
		public NDate RFromDate;
		@DbRecordField(dataSourceName="R_TO_DATE")
		public NDate RToDate;
		@DbRecordField(dataSourceName="R_RELEASE_IND")
		public NString RReleaseInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_REASON")
		public NString RReason;
		@DbRecordField(dataSourceName="R_PERIOD")
		public NString RPeriod;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
