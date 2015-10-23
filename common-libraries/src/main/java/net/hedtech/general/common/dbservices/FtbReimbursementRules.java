package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FtbReimbursementRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_REIMBURSEMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pId,NString pDataOrigin,NDate pActivityDate,NString pUserId,NString pUserComment,NString pCompleteUser,NDate pCreateDate,NString pCreateSource,NString pCreateUser,NString pDescription,NString pDocCode,NString pEmailAddress,NString pName,NNumber pOwnerPidm,NString pRequestStatus,NDate pStatusDate,NDate pTransactionDate,NString pDirectDepositOverrideInd,NString pNonResidentAlienInd,NNumber pOwnerAddressSeqNum,NString pOwnerAddressTypeCode,NNumber pPayeeAddressSeqNum,NString pPayeeAddressTypeCode,NNumber pPayeePidm,NNumber pFtpbportId,NNumber pSentToTravelerBy,NDate pSentToTravelerDate,NNumber pFttvcurrId,NNumber pFttvafflId,NString pPayByWireInd,NNumber pPayToBaseExchngRate,NDate pWireDate,NString pWireRefNum,NNumber pWireBaseAmount,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_REIMBURSEMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pId,NString pDataOrigin,NDate pActivityDate,NString pUserId,NString pUserComment,NString pCompleteUser,NDate pCreateDate,NString pCreateSource,NString pCreateUser,NString pDescription,NString pDocCode,NString pEmailAddress,NString pName,NNumber pOwnerPidm,NString pRequestStatus,NDate pStatusDate,NDate pTransactionDate,NString pDirectDepositOverrideInd,NString pNonResidentAlienInd,NNumber pOwnerAddressSeqNum,NString pOwnerAddressTypeCode,NNumber pPayeeAddressSeqNum,NString pPayeeAddressTypeCode,NNumber pPayeePidm,NNumber pFtpbportId,NNumber pSentToTravelerBy,NDate pSentToTravelerDate,NNumber pFttvcurrId,NNumber pFttvafflId,NString pPayByWireInd,NNumber pPayToBaseExchngRate,NDate pWireDate,NString pWireRefNum,NNumber pWireBaseAmount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_REIMBURSEMENT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
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
				
			cmd.execute();


		}
		
	
	
	
}
