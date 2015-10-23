package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FtbAdvance {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_ADVANCE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NNumber fDocCodeExists(NString pDocCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_ADVANCE.F_DOC_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fExists(NNumber pId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_ADVANCE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString fIsequal(AdvanceRecRow recOne,AdvanceRecRow recTwo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_ADVANCE.F_ISEQUAL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AdvanceRecRow.class ));
//			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AdvanceRecRow.class ));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static DataCursor fQueryAll(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_ADVANCE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByAuthId(NNumber pAuthId,NString pWithAuth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_ADVANCE.F_QUERY_BY_AUTH_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AUTH_ID", pAuthId);
			cmd.addParameter("@P_WITH_AUTH", pWithAuth);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByDocCode(NString pDocCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_ADVANCE.F_QUERY_BY_DOC_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_ADVANCE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_ADVANCE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_ADVANCE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pId,NString pDataOrigin,NString pUserId,NString pUserComment,NString pCompleteUser,NString pDescription,NString pDocCode,NString pEmailAddress,NString pName,NNumber pOwnerPidm,NString pRequestStatus,NDate pStatusDate,NDate pTransactionDate,NString pDirectDepositOverrideInd,NNumber pOwnerAddressSeqNum,NString pOwnerAddressTypeCode,NNumber pFtpbportId,NNumber pSentToTravelerBy,NDate pSentToTravelerDate,NNumber pFttvadrlId,NNumber pFtrbauthId,NDate pTripStartDate,NDate pTripEndDate,NDate pPaymentDueDate,NNumber pRequestAmount,NString pPostAuthorizationInd,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_ADVANCE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_USER_COMMENT", pUserComment);
			cmd.addParameter("@P_COMPLETE_USER", pCompleteUser);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_OWNER_PIDM", pOwnerPidm);
			cmd.addParameter("@P_REQUEST_STATUS", pRequestStatus);
			cmd.addParameter("@P_STATUS_DATE", pStatusDate);
			cmd.addParameter("@P_TRANSACTION_DATE", pTransactionDate);
			cmd.addParameter("@P_DIRECT_DEPOSIT_OVERRIDE_IND", pDirectDepositOverrideInd);
			cmd.addParameter("@P_OWNER_ADDRESS_SEQ_NUM", pOwnerAddressSeqNum);
			cmd.addParameter("@P_OWNER_ADDRESS_TYPE_CODE", pOwnerAddressTypeCode);
			cmd.addParameter("@P_FTPBPORT_ID", pFtpbportId);
			cmd.addParameter("@P_SENT_TO_TRAVELER_BY", pSentToTravelerBy);
			cmd.addParameter("@P_SENT_TO_TRAVELER_DATE", pSentToTravelerDate);
			cmd.addParameter("@P_FTTVADRL_ID", pFttvadrlId);
			cmd.addParameter("@P_FTRBAUTH_ID", pFtrbauthId);
			cmd.addParameter("@P_TRIP_START_DATE", pTripStartDate);
			cmd.addParameter("@P_TRIP_END_DATE", pTripEndDate);
			cmd.addParameter("@P_PAYMENT_DUE_DATE", pPaymentDueDate);
			cmd.addParameter("@P_REQUEST_AMOUNT", pRequestAmount);
			cmd.addParameter("@P_POST_AUTHORIZATION_IND", pPostAuthorizationInd);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_ADVANCE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pId,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_ADVANCE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pId,NString pDataOrigin,NString pUserId,NString pUserComment,NString pCompleteUser,NString pDescription,NString pDocCode,NString pEmailAddress,NString pName,NNumber pOwnerPidm,NString pRequestStatus,NDate pStatusDate,NDate pTransactionDate,NString pDirectDepositOverrideInd,NNumber pOwnerAddressSeqNum,NString pOwnerAddressTypeCode,NNumber pFtpbportId,NNumber pSentToTravelerBy,NDate pSentToTravelerDate,NNumber pFttvadrlId,NNumber pFtrbauthId,NDate pTripStartDate,NDate pTripEndDate,NDate pPaymentDueDate,NNumber pRequestAmount,NString pPostAuthorizationInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_ADVANCE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_USER_COMMENT", pUserComment);
			cmd.addParameter("@P_COMPLETE_USER", pCompleteUser);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_OWNER_PIDM", pOwnerPidm);
			cmd.addParameter("@P_REQUEST_STATUS", pRequestStatus);
			cmd.addParameter("@P_STATUS_DATE", pStatusDate);
			cmd.addParameter("@P_TRANSACTION_DATE", pTransactionDate);
			cmd.addParameter("@P_DIRECT_DEPOSIT_OVERRIDE_IND", pDirectDepositOverrideInd);
			cmd.addParameter("@P_OWNER_ADDRESS_SEQ_NUM", pOwnerAddressSeqNum);
			cmd.addParameter("@P_OWNER_ADDRESS_TYPE_CODE", pOwnerAddressTypeCode);
			cmd.addParameter("@P_FTPBPORT_ID", pFtpbportId);
			cmd.addParameter("@P_SENT_TO_TRAVELER_BY", pSentToTravelerBy);
			cmd.addParameter("@P_SENT_TO_TRAVELER_DATE", pSentToTravelerDate);
			cmd.addParameter("@P_FTTVADRL_ID", pFttvadrlId);
			cmd.addParameter("@P_FTRBAUTH_ID", pFtrbauthId);
			cmd.addParameter("@P_TRIP_START_DATE", pTripStartDate);
			cmd.addParameter("@P_TRIP_END_DATE", pTripEndDate);
			cmd.addParameter("@P_PAYMENT_DUE_DATE", pPaymentDueDate);
			cmd.addParameter("@P_REQUEST_AMOUNT", pRequestAmount);
			cmd.addParameter("@P_POST_AUTHORIZATION_IND", pPostAuthorizationInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="AdvanceRecRow", dataSourceName="ADVANCE_REC")
	public static class AdvanceRecRow
	{
		@DbRecordField(dataSourceName="R_ID")
		public NNumber RId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
//		@DbRecordField(dataSourceName="R_ACTIVITY_DATE")
//		public UnknownTypes.Timestamp RActivityDate;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_USER_COMMENT")
		public NString RUserComment;
		@DbRecordField(dataSourceName="R_COMPLETE_USER")
		public NString RCompleteUser;
//		@DbRecordField(dataSourceName="R_CREATE_DATE")
//		public UnknownTypes.Timestamp RCreateDate;
		@DbRecordField(dataSourceName="R_CREATE_SOURCE")
		public NString RCreateSource;
		@DbRecordField(dataSourceName="R_CREATE_USER")
		public NString RCreateUser;
		@DbRecordField(dataSourceName="R_DESCRIPTION")
		public NString RDescription;
		@DbRecordField(dataSourceName="R_DOC_CODE")
		public NString RDocCode;
		@DbRecordField(dataSourceName="R_EMAIL_ADDRESS")
		public NString REmailAddress;
		@DbRecordField(dataSourceName="R_NAME")
		public NString RName;
		@DbRecordField(dataSourceName="R_OWNER_PIDM")
		public NNumber ROwnerPidm;
		@DbRecordField(dataSourceName="R_REQUEST_STATUS")
		public NString RRequestStatus;
//		@DbRecordField(dataSourceName="R_STATUS_DATE")
//		public UnknownTypes.Timestamp RStatusDate;
//		@DbRecordField(dataSourceName="R_TRANSACTION_DATE")
//		public UnknownTypes.Timestamp RTransactionDate;
		@DbRecordField(dataSourceName="R_DIRECT_DEPOSIT_OVERRIDE_IND")
		public NString RDirectDepositOverrideInd;
		@DbRecordField(dataSourceName="R_OWNER_ADDRESS_SEQ_NUM")
		public NNumber ROwnerAddressSeqNum;
		@DbRecordField(dataSourceName="R_OWNER_ADDRESS_TYPE_CODE")
		public NString ROwnerAddressTypeCode;
		@DbRecordField(dataSourceName="R_FTPBPORT_ID")
		public NNumber RFtpbportId;
		@DbRecordField(dataSourceName="R_SENT_TO_TRAVELER_BY")
		public NNumber RSentToTravelerBy;
//		@DbRecordField(dataSourceName="R_SENT_TO_TRAVELER_DATE")
//		public UnknownTypes.Timestamp RSentToTravelerDate;
		@DbRecordField(dataSourceName="R_FTTVADRL_ID")
		public NNumber RFttvadrlId;
		@DbRecordField(dataSourceName="R_FTRBAUTH_ID")
		public NNumber RFtrbauthId;
//		@DbRecordField(dataSourceName="R_TRIP_START_DATE")
//		public UnknownTypes.Timestamp RTripStartDate;
//		@DbRecordField(dataSourceName="R_TRIP_END_DATE")
//		public UnknownTypes.Timestamp RTripEndDate;
//		@DbRecordField(dataSourceName="R_PAYMENT_DUE_DATE")
//		public UnknownTypes.Timestamp RPaymentDueDate;
		@DbRecordField(dataSourceName="R_REQUEST_AMOUNT")
		public NNumber RRequestAmount;
		@DbRecordField(dataSourceName="R_POST_AUTHORIZATION_IND")
		public NString RPostAuthorizationInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
