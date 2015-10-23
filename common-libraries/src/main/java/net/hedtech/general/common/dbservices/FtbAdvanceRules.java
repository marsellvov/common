package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FtbAdvanceRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_ADVANCE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pId,NString pDataOrigin,NDate pActivityDate,NString pUserId,NString pUserComment,NString pCompleteUser,NDate pCreateDate,NString pCreateSource,NString pCreateUser,NString pDescription,NString pDocCode,NString pEmailAddress,NString pName,NNumber pOwnerPidm,NString pRequestStatus,NDate pStatusDate,NDate pTransactionDate,NString pDirectDepositOverrideInd,NNumber pOwnerAddressSeqNum,NString pOwnerAddressTypeCode,NNumber pFtpbportId,NNumber pSentToTravelerBy,NDate pSentToTravelerDate,NNumber pFttvadrlId,NNumber pFtrbauthId,NDate pTripStartDate,NDate pTripEndDate,NDate pPaymentDueDate,NNumber pRequestAmount,NString pPostAuthorizationInd,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_ADVANCE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_USER_COMMENT", pUserComment);
			cmd.addParameter("@P_COMPLETE_USER", pCompleteUser);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_SOURCE", pCreateSource);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pId,NString pDataOrigin,NDate pActivityDate,NString pUserId,NString pUserComment,NString pCompleteUser,NDate pCreateDate,NString pCreateSource,NString pCreateUser,NString pDescription,NString pDocCode,NString pEmailAddress,NString pName,NNumber pOwnerPidm,NString pRequestStatus,NDate pStatusDate,NDate pTransactionDate,NString pDirectDepositOverrideInd,NNumber pOwnerAddressSeqNum,NString pOwnerAddressTypeCode,NNumber pFtpbportId,NNumber pSentToTravelerBy,NDate pSentToTravelerDate,NNumber pFttvadrlId,NNumber pFtrbauthId,NDate pTripStartDate,NDate pTripEndDate,NDate pPaymentDueDate,NNumber pRequestAmount,NString pPostAuthorizationInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_ADVANCE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_USER_COMMENT", pUserComment);
			cmd.addParameter("@P_COMPLETE_USER", pCompleteUser);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_SOURCE", pCreateSource);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
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
				
			cmd.execute();


		}
		
	
	
	
}