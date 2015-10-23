package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbAthleticTransfer {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_TRANSFER.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_TRANSFER.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(AthleticTransferRecRow recOne,AthleticTransferRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_TRANSFER.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AthleticTransferRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AthleticTransferRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pTransEligibleInd,NString pResReqInd,NString pMetCreditYrInd,NString pSatrCode,NString pSarxCode,NDate pTransAcceptDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_TRANSFER.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRANS_ELIGIBLE_IND", pTransEligibleInd);
			cmd.addParameter("@P_RES_REQ_IND", pResReqInd);
			cmd.addParameter("@P_MET_CREDIT_YR_IND", pMetCreditYrInd);
			cmd.addParameter("@P_SATR_CODE", pSatrCode);
			cmd.addParameter("@P_SARX_CODE", pSarxCode);
			cmd.addParameter("@P_TRANS_ACCEPT_DATE", pTransAcceptDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_TRANSFER.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_TRANSFER.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_TRANSFER.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pTransEligibleInd,NString pResReqInd,NString pMetCreditYrInd,NString pUserId,NNumber pTransQualityPoints,NNumber pTransGpa,NNumber pTransTermsAttended,NNumber pTransHoursAttempted,NNumber pTransHoursEarned,NDate pTransAcceptDate,NString pSatrCode,NString pSarxCode,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_TRANSFER.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRANS_ELIGIBLE_IND", pTransEligibleInd);
			cmd.addParameter("@P_RES_REQ_IND", pResReqInd);
			cmd.addParameter("@P_MET_CREDIT_YR_IND", pMetCreditYrInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_TRANS_QUALITY_POINTS", pTransQualityPoints);
			cmd.addParameter("@P_TRANS_GPA", pTransGpa);
			cmd.addParameter("@P_TRANS_TERMS_ATTENDED", pTransTermsAttended);
			cmd.addParameter("@P_TRANS_HOURS_ATTEMPTED", pTransHoursAttempted);
			cmd.addParameter("@P_TRANS_HOURS_EARNED", pTransHoursEarned);
			cmd.addParameter("@P_TRANS_ACCEPT_DATE", pTransAcceptDate);
			cmd.addParameter("@P_SATR_CODE", pSatrCode);
			cmd.addParameter("@P_SARX_CODE", pSarxCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_TRANSFER.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_TRANSFER.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pTransEligibleInd,NString pResReqInd,NString pMetCreditYrInd,NString pUserId,NNumber pTransQualityPoints,NNumber pTransGpa,NNumber pTransTermsAttended,NNumber pTransHoursAttempted,NNumber pTransHoursEarned,NDate pTransAcceptDate,NString pSatrCode,NString pSarxCode,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_TRANSFER.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRANS_ELIGIBLE_IND", pTransEligibleInd);
			cmd.addParameter("@P_RES_REQ_IND", pResReqInd);
			cmd.addParameter("@P_MET_CREDIT_YR_IND", pMetCreditYrInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_TRANS_QUALITY_POINTS", pTransQualityPoints);
			cmd.addParameter("@P_TRANS_GPA", pTransGpa);
			cmd.addParameter("@P_TRANS_TERMS_ATTENDED", pTransTermsAttended);
			cmd.addParameter("@P_TRANS_HOURS_ATTEMPTED", pTransHoursAttempted);
			cmd.addParameter("@P_TRANS_HOURS_EARNED", pTransHoursEarned);
			cmd.addParameter("@P_TRANS_ACCEPT_DATE", pTransAcceptDate);
			cmd.addParameter("@P_SATR_CODE", pSatrCode);
			cmd.addParameter("@P_SARX_CODE", pSarxCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="AthleticTransferRecRow", dataSourceName="ATHLETIC_TRANSFER_REC")
	public static class AthleticTransferRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TRANS_ELIGIBLE_IND")
		public NString RTransEligibleInd;
		@DbRecordField(dataSourceName="R_RES_REQ_IND")
		public NString RResReqInd;
		@DbRecordField(dataSourceName="R_MET_CREDIT_YR_IND")
		public NString RMetCreditYrInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_TRANS_QUALITY_POINTS")
		public NNumber RTransQualityPoints;
		@DbRecordField(dataSourceName="R_TRANS_GPA")
		public NNumber RTransGpa;
		@DbRecordField(dataSourceName="R_TRANS_TERMS_ATTENDED")
		public NNumber RTransTermsAttended;
		@DbRecordField(dataSourceName="R_TRANS_HOURS_ATTEMPTED")
		public NNumber RTransHoursAttempted;
		@DbRecordField(dataSourceName="R_TRANS_HOURS_EARNED")
		public NNumber RTransHoursEarned;
		@DbRecordField(dataSourceName="R_TRANS_ACCEPT_DATE")
		public NDate RTransAcceptDate;
		@DbRecordField(dataSourceName="R_SATR_CODE")
		public NString RSatrCode;
		@DbRecordField(dataSourceName="R_SARX_CODE")
		public NString RSarxCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
