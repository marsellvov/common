package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ftfkrqst {
		public static void pUpdateTravel(NNumber pDocType,NString pDocCode,NString pProcessContext) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKRQST.P_UPDATE_TRAVEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_PROCESS_CONTEXT", pProcessContext);
				
			cmd.execute();


		}
		
		public static void pValidapprover(NString pWorkflowUserIn,Ref<NString> pReturnValueOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKRQST.P_VALIDAPPROVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WORKFLOW_USER_IN", pWorkflowUserIn);
			cmd.addParameter("@P_RETURN_VALUE_OUT", NString.class);
				
			cmd.execute();
			pReturnValueOut.val = cmd.getParameterValue("@P_RETURN_VALUE_OUT", NString.class);


		}
		
		public static void pValidfinapprover(NNumber pApproverPidmIn,Ref<NString> pReturnValueOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKRQST.P_VALIDFINAPPROVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPROVER_PIDM_IN", pApproverPidmIn);
			cmd.addParameter("@P_RETURN_VALUE_OUT", NString.class);
				
			cmd.execute();
			pReturnValueOut.val = cmd.getParameterValue("@P_RETURN_VALUE_OUT", NString.class);


		}
		
		public static void pValiduser(NString pWorkflowUserIn,Ref<NString> pReturnValueOut,Ref<NString> pSpridenLastNameOut,Ref<NString> pSpridenFirstNameOut,Ref<NString> pEmailAddressOut,Ref<NString> pBannerIdOut,Ref<NNumber> pRecipientPidmOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKRQST.P_VALIDUSER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WORKFLOW_USER_IN", pWorkflowUserIn);
			cmd.addParameter("@P_RETURN_VALUE_OUT", NString.class);
			cmd.addParameter("@P_SPRIDEN_LAST_NAME_OUT", NString.class);
			cmd.addParameter("@P_SPRIDEN_FIRST_NAME_OUT", NString.class);
			cmd.addParameter("@P_EMAIL_ADDRESS_OUT", NString.class);
			cmd.addParameter("@P_BANNER_ID_OUT", NString.class);
			cmd.addParameter("@P_RECIPIENT_PIDM_OUT", NNumber.class);
				
			cmd.execute();
			pReturnValueOut.val = cmd.getParameterValue("@P_RETURN_VALUE_OUT", NString.class);
			pSpridenLastNameOut.val = cmd.getParameterValue("@P_SPRIDEN_LAST_NAME_OUT", NString.class);
			pSpridenFirstNameOut.val = cmd.getParameterValue("@P_SPRIDEN_FIRST_NAME_OUT", NString.class);
			pEmailAddressOut.val = cmd.getParameterValue("@P_EMAIL_ADDRESS_OUT", NString.class);
			pBannerIdOut.val = cmd.getParameterValue("@P_BANNER_ID_OUT", NString.class);
			pRecipientPidmOut.val = cmd.getParameterValue("@P_RECIPIENT_PIDM_OUT", NNumber.class);


		}
		
		public static void pWorkflowUpdate(NNumber pDocType,NNumber pDocumentId,NString pStatusIn,NString pStatusMsgIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKRQST.P_WORKFLOW_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_STATUS_IN", pStatusIn);
			cmd.addParameter("@P_STATUS_MSG_IN", pStatusMsgIn);
				
			cmd.execute();


		}
		
	
	
	
}
