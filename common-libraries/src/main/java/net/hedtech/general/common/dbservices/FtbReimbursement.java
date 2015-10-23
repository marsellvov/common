package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FtbReimbursement {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_REIMBURSEMENT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NNumber fDocCodeExists(NString pDocCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_REIMBURSEMENT.F_DOC_CODE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fExists(NNumber pId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_REIMBURSEMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NString pDocCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_REIMBURSEMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString fIsequal(FtrbrembRecRow recOne,FtrbrembRecRow recTwo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_REIMBURSEMENT.F_ISEQUAL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FtrbrembRecRow.class ));
//			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FtrbrembRecRow.class ));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static DataCursor fQueryAll(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_REIMBURSEMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByDocCode(NString pDocCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_REIMBURSEMENT.F_QUERY_BY_DOC_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_REIMBURSEMENT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_REIMBURSEMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_REIMBURSEMENT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pId,NString pDataOrigin,NString pUserId,NString pUserComment,NString pCompleteUser,NString pDescription,NString pDocCode,NString pEmailAddress,NString pName,NNumber pOwnerPidm,NString pRequestStatus,NDate pStatusDate,NDate pTransactionDate,NString pDirectDepositOverrideInd,NString pNonResidentAlienInd,NNumber pOwnerAddressSeqNum,NString pOwnerAddressTypeCode,NNumber pPayeeAddressSeqNum,NString pPayeeAddressTypeCode,NNumber pPayeePidm,NNumber pFtpbportId,NNumber pSentToTravelerBy,NDate pSentToTravelerDate,NNumber pFttvcurrId,NNumber pFttvafflId,NString pPayByWireInd,NNumber pPayToBaseExchngRate,NDate pWireDate,NString pWireRefNum,NNumber pWireBaseAmount,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_REIMBURSEMENT.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_NON_RESIDENT_ALIEN_IND", pNonResidentAlienInd);
			cmd.addParameter("@P_OWNER_ADDRESS_SEQ_NUM", pOwnerAddressSeqNum);
			cmd.addParameter("@P_OWNER_ADDRESS_TYPE_CODE", pOwnerAddressTypeCode);
			cmd.addParameter("@P_PAYEE_ADDRESS_SEQ_NUM", pPayeeAddressSeqNum);
			cmd.addParameter("@P_PAYEE_ADDRESS_TYPE_CODE", pPayeeAddressTypeCode);
			cmd.addParameter("@P_PAYEE_PIDM", pPayeePidm);
			cmd.addParameter("@P_FTPBPORT_ID", pFtpbportId);
			cmd.addParameter("@P_SENT_TO_TRAVELER_BY", pSentToTravelerBy);
			cmd.addParameter("@P_SENT_TO_TRAVELER_DATE", pSentToTravelerDate);
			cmd.addParameter("@P_FTTVCURR_ID", pFttvcurrId);
			cmd.addParameter("@P_FTTVAFFL_ID", pFttvafflId);
			cmd.addParameter("@P_PAY_BY_WIRE_IND", pPayByWireInd);
			cmd.addParameter("@P_PAY_TO_BASE_EXCHNG_RATE", pPayToBaseExchngRate);
			cmd.addParameter("@P_WIRE_DATE", pWireDate);
			cmd.addParameter("@P_WIRE_REF_NUM", pWireRefNum);
			cmd.addParameter("@P_WIRE_BASE_AMOUNT", pWireBaseAmount);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_REIMBURSEMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pId,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_REIMBURSEMENT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pId,NString pDataOrigin,NString pUserId,NString pUserComment,NString pCompleteUser,NString pDescription,NString pDocCode,NString pEmailAddress,NString pName,NNumber pOwnerPidm,NString pRequestStatus,NDate pStatusDate,NDate pTransactionDate,NString pDirectDepositOverrideInd,NString pNonResidentAlienInd,NNumber pOwnerAddressSeqNum,NString pOwnerAddressTypeCode,NNumber pPayeeAddressSeqNum,NString pPayeeAddressTypeCode,NNumber pPayeePidm,NNumber pFtpbportId,NNumber pSentToTravelerBy,NDate pSentToTravelerDate,NNumber pFttvcurrId,NNumber pFttvafflId,NString pPayByWireInd,NNumber pPayToBaseExchngRate,NDate pWireDate,NString pWireRefNum,NNumber pWireBaseAmount,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_REIMBURSEMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_NON_RESIDENT_ALIEN_IND", pNonResidentAlienInd);
			cmd.addParameter("@P_OWNER_ADDRESS_SEQ_NUM", pOwnerAddressSeqNum);
			cmd.addParameter("@P_OWNER_ADDRESS_TYPE_CODE", pOwnerAddressTypeCode);
			cmd.addParameter("@P_PAYEE_ADDRESS_SEQ_NUM", pPayeeAddressSeqNum);
			cmd.addParameter("@P_PAYEE_ADDRESS_TYPE_CODE", pPayeeAddressTypeCode);
			cmd.addParameter("@P_PAYEE_PIDM", pPayeePidm);
			cmd.addParameter("@P_FTPBPORT_ID", pFtpbportId);
			cmd.addParameter("@P_SENT_TO_TRAVELER_BY", pSentToTravelerBy);
			cmd.addParameter("@P_SENT_TO_TRAVELER_DATE", pSentToTravelerDate);
			cmd.addParameter("@P_FTTVCURR_ID", pFttvcurrId);
			cmd.addParameter("@P_FTTVAFFL_ID", pFttvafflId);
			cmd.addParameter("@P_PAY_BY_WIRE_IND", pPayByWireInd);
			cmd.addParameter("@P_PAY_TO_BASE_EXCHNG_RATE", pPayToBaseExchngRate);
			cmd.addParameter("@P_WIRE_DATE", pWireDate);
			cmd.addParameter("@P_WIRE_REF_NUM", pWireRefNum);
			cmd.addParameter("@P_WIRE_BASE_AMOUNT", pWireBaseAmount);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FtrbrembRecRow", dataSourceName="FTRBREMB_REC")
	public static class FtrbrembRecRow
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
		@DbRecordField(dataSourceName="R_NON_RESIDENT_ALIEN_IND")
		public NString RNonResidentAlienInd;
		@DbRecordField(dataSourceName="R_OWNER_ADDRESS_SEQ_NUM")
		public NNumber ROwnerAddressSeqNum;
		@DbRecordField(dataSourceName="R_OWNER_ADDRESS_TYPE_CODE")
		public NString ROwnerAddressTypeCode;
		@DbRecordField(dataSourceName="R_PAYEE_ADDRESS_SEQ_NUM")
		public NNumber RPayeeAddressSeqNum;
		@DbRecordField(dataSourceName="R_PAYEE_ADDRESS_TYPE_CODE")
		public NString RPayeeAddressTypeCode;
		@DbRecordField(dataSourceName="R_PAYEE_PIDM")
		public NNumber RPayeePidm;
		@DbRecordField(dataSourceName="R_FTPBPORT_ID")
		public NNumber RFtpbportId;
		@DbRecordField(dataSourceName="R_SENT_TO_TRAVELER_BY")
		public NNumber RSentToTravelerBy;
//		@DbRecordField(dataSourceName="R_SENT_TO_TRAVELER_DATE")
//		public UnknownTypes.Timestamp RSentToTravelerDate;
		@DbRecordField(dataSourceName="R_FTTVCURR_ID")
		public NNumber RFttvcurrId;
		@DbRecordField(dataSourceName="R_FTTVAFFL_ID")
		public NNumber RFttvafflId;
		@DbRecordField(dataSourceName="R_PAY_BY_WIRE_IND")
		public NString RPayByWireInd;
		@DbRecordField(dataSourceName="R_PAY_TO_BASE_EXCHNG_RATE")
		public NNumber RPayToBaseExchngRate;
//		@DbRecordField(dataSourceName="R_WIRE_DATE")
//		public UnknownTypes.Timestamp RWireDate;
		@DbRecordField(dataSourceName="R_WIRE_REF_NUM")
		public NString RWireRefNum;
		@DbRecordField(dataSourceName="R_WIRE_BASE_AMOUNT")
		public NNumber RWireBaseAmount;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
