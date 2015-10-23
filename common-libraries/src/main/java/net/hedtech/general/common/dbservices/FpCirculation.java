package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FpCirculation {
		public static NNumber fWorkflowLogonPidm(NString pWorkflowUserLogonIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FP_CIRCULATION.F_WORKFLOW_LOGON_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_WORKFLOW_USER_LOGON_IN", pWorkflowUserLogonIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pCreateCirculation(NNumber pCirculationKey,NNumber pNodeKey,NString pApproverWfId,NString pApproverLogonIn,NString pCommentIn,NString pExpenseOwnerName,NString pExpenseOwnerEmail,NString pDocCode,NNumber pDocType,NString pDocPurpose,NString pDocDescription,NString pDocComments,NString pTravelInd,NString pRelocationInd,NNumber pTotalAmt,NNumber pReimburseAmt,NNumber pPaidByOtherAmt,NString pTeUrl,NString pBudgetAvailInd,NNumber pDocumentId,NString pDelegateName,NString pDelegateEmail) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FP_CIRCULATION.P_CREATE_CIRCULATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CIRCULATION_KEY", pCirculationKey);
			cmd.addParameter("@P_NODE_KEY", pNodeKey);
			cmd.addParameter("@P_APPROVER_WF_ID", pApproverWfId);
			cmd.addParameter("@P_APPROVER_LOGON_IN", pApproverLogonIn);
			cmd.addParameter("@P_COMMENT_IN", pCommentIn);
			cmd.addParameter("@P_EXPENSE_OWNER_NAME", pExpenseOwnerName);
			cmd.addParameter("@P_EXPENSE_OWNER_EMAIL", pExpenseOwnerEmail);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_DOC_PURPOSE", pDocPurpose);
			cmd.addParameter("@P_DOC_DESCRIPTION", pDocDescription);
			cmd.addParameter("@P_DOC_COMMENTS", pDocComments);
			cmd.addParameter("@P_TRAVEL_IND", pTravelInd);
			cmd.addParameter("@P_RELOCATION_IND", pRelocationInd);
			cmd.addParameter("@P_TOTAL_AMT", pTotalAmt);
			cmd.addParameter("@P_REIMBURSE_AMT", pReimburseAmt);
			cmd.addParameter("@P_PAID_BY_OTHER_AMT", pPaidByOtherAmt);
			cmd.addParameter("@P_TE_URL", pTeUrl);
			cmd.addParameter("@P_BUDGET_AVAIL_IND", pBudgetAvailInd);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_DELEGATE_NAME", pDelegateName);
			cmd.addParameter("@P_DELEGATE_EMAIL", pDelegateEmail);
				
			cmd.execute();


		}
		
		public static void pUpdateCirculation(NNumber pFobcirhId,NNumber pNodeKey,NNumber pDocType,NNumber pDocumentId,NString pStatusIn,NString pWorkflowLogonIn,NString pApproverLogonIn,NString pCommentIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FP_CIRCULATION.P_UPDATE_CIRCULATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FOBCIRH_ID", pFobcirhId);
			cmd.addParameter("@P_NODE_KEY", pNodeKey);
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_STATUS_IN", pStatusIn);
			cmd.addParameter("@P_WORKFLOW_LOGON_IN", pWorkflowLogonIn);
			cmd.addParameter("@P_APPROVER_LOGON_IN", pApproverLogonIn);
			cmd.addParameter("@P_COMMENT_IN", pCommentIn);
				
			cmd.execute();


		}
		
		public static void pUpdateNotification(Ref<NNumber> pFobcirhId,Ref<NNumber> pNodeKey,Ref<NNumber> pDocType,Ref<NNumber> pDocumentId,NString pWorkflowLogonIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FP_CIRCULATION.P_UPDATE_NOTIFICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FOBCIRH_ID", pFobcirhId, true);
			cmd.addParameter("@P_NODE_KEY", pNodeKey, true);
			cmd.addParameter("@P_DOC_TYPE", pDocType, true);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId, true);
			cmd.addParameter("@P_WORKFLOW_LOGON_IN", pWorkflowLogonIn);
				
			cmd.execute();
			pFobcirhId.val = cmd.getParameterValue("@P_FOBCIRH_ID", NNumber.class);
			pNodeKey.val = cmd.getParameterValue("@P_NODE_KEY", NNumber.class);
			pDocType.val = cmd.getParameterValue("@P_DOC_TYPE", NNumber.class);
			pDocumentId.val = cmd.getParameterValue("@P_DOCUMENT_ID", NNumber.class);


		}
		
	
	
	
}
