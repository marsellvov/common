package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GvEmailNotification {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_NOTIFICATION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pCode,NString pEsspCode,NString pPackageName,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_NOTIFICATION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ESSP_CODE", pEsspCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EmailNotificationRecRow recOne,EmailNotificationRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_NOTIFICATION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EmailNotificationRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EmailNotificationRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pCode,NString pEsspCode,NString pPackageName,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_NOTIFICATION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ESSP_CODE", pEsspCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_NOTIFICATION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCode,NString pEsspCode,NString pPackageName,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_NOTIFICATION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ESSP_CODE", pEsspCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pCode,NString pEsspCode,NString pPackageName,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_NOTIFICATION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ESSP_CODE", pEsspCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pCode,NString pEsspCode,NString pPackageName,NNumber pSeqNo,NString pActiveInd,NDate pStartDate,NString pRuleCode,NString pUserId,NString pHostCode,NString pRecipientAddress,NString pSenderAddress,NDate pEndDate,NString pPostRuleName,NString pCcAddress,NString pBccAddress,NString pSubject,NString pMessage,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_NOTIFICATION.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pCode,NString pEsspCode,NString pPackageName,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_NOTIFICATION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ESSP_CODE", pEsspCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pCode,NString pEsspCode,NString pPackageName,NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_NOTIFICATION.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ESSP_CODE", pEsspCode);
			cmd.addParameter("@P_PACKAGE_NAME", pPackageName);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pCode,NString pEsspCode,NString pPackageName,NNumber pSeqNo,NString pActiveInd,NDate pStartDate,NString pRuleCode,NString pUserId,NString pHostCode,NString pRecipientAddress,NString pSenderAddress,NDate pEndDate,NString pPostRuleName,NString pCcAddress,NString pBccAddress,NString pSubject,NString pMessage,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_EMAIL_NOTIFICATION.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="EmailNotificationRecRow", dataSourceName="EMAIL_NOTIFICATION_REC", needsInitialization=true)
	public static class EmailNotificationRecRow
	{
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
		@DbRecordField(dataSourceName="R_ESSP_CODE")
		public NString REsspCode;
		@DbRecordField(dataSourceName="R_PACKAGE_NAME")
		public NString RPackageName;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_ACTIVE_IND")
		public NString RActiveInd;
		@DbRecordField(dataSourceName="R_START_DATE")
		public NDate RStartDate;
		@DbRecordField(dataSourceName="R_RULE_CODE")
		public NString RRuleCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_HOST_CODE")
		public NString RHostCode;
		@DbRecordField(dataSourceName="R_RECIPIENT_ADDRESS")
		public NString RRecipientAddress;
		@DbRecordField(dataSourceName="R_SENDER_ADDRESS")
		public NString RSenderAddress;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_POST_RULE_NAME")
		public NString RPostRuleName;
		@DbRecordField(dataSourceName="R_CC_ADDRESS")
		public NString RCcAddress;
		@DbRecordField(dataSourceName="R_BCC_ADDRESS")
		public NString RBccAddress;
		@DbRecordField(dataSourceName="R_SUBJECT")
		public NString RSubject;
		@DbRecordField(dataSourceName="R_MESSAGE")
		public NString RMessage;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
