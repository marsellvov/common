package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GvEmailNotificationRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_NOTIFICATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pCode,NString pEsspCode,NString pPackageName,NNumber pSeqNo,NString pActiveInd,NDate pStartDate,NString pRuleCode,NString pUserId,NString pHostCode,NString pRecipientAddress,NString pSenderAddress,NDate pEndDate,NString pPostRuleName,NString pCcAddress,NString pBccAddress,NString pSubject,NString pMessage,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_NOTIFICATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ESSP_CODE", pEsspCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_RULE_CODE", pRuleCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_HOST_CODE", pHostCode);
			cmd.addParameter("@P_RECIPIENT_ADDRESS", pRecipientAddress);
			cmd.addParameter("@P_SENDER_ADDRESS", pSenderAddress);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_POST_RULE_NAME", pPostRuleName);
			cmd.addParameter("@P_CC_ADDRESS", pCcAddress);
			cmd.addParameter("@P_BCC_ADDRESS", pBccAddress);
			cmd.addParameter("@P_SUBJECT", pSubject);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pCode,NString pEsspCode,NString pPackageName,NNumber pSeqNo,NString pActiveInd,NDate pStartDate,NString pRuleCode,NString pUserId,NString pHostCode,NString pRecipientAddress,NString pSenderAddress,NDate pEndDate,NString pPostRuleName,NString pCcAddress,NString pBccAddress,NString pSubject,NString pMessage,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_NOTIFICATION_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ESSP_CODE", pEsspCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_RULE_CODE", pRuleCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_HOST_CODE", pHostCode);
			cmd.addParameter("@P_RECIPIENT_ADDRESS", pRecipientAddress);
			cmd.addParameter("@P_SENDER_ADDRESS", pSenderAddress);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_POST_RULE_NAME", pPostRuleName);
			cmd.addParameter("@P_CC_ADDRESS", pCcAddress);
			cmd.addParameter("@P_BCC_ADDRESS", pBccAddress);
			cmd.addParameter("@P_SUBJECT", pSubject);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
