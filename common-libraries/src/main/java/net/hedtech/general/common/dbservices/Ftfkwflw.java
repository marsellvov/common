package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ftfkwflw {
		public static NString fGetBaseCurrency() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKWFLW.F_GET_BASE_CURRENCY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreateAdhocCirculation(NNumber pCirculationKey,NNumber pNodeKey,NString pApproverWfId,NString pApproverLogonIn,NString pCommentIn,NString pExpenseOwnerName,NString pExpenseOwnerEmail,NString pDocCode,NNumber pDocType,NString pTeUrl,NString pBudgetAvailInd,NNumber pDocumentId,NString pDelegateName,NString pDelegateEmail,NString pDocCode2,NString pApproverName,NString pPreviousComment) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKWFLW.P_CREATE_ADHOC_CIRCULATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CIRCULATION_KEY", pCirculationKey);
			cmd.addParameter("@P_NODE_KEY", pNodeKey);
			cmd.addParameter("@P_APPROVER_WF_ID", pApproverWfId);
			cmd.addParameter("@P_APPROVER_LOGON_IN", pApproverLogonIn);
			cmd.addParameter("@P_COMMENT_IN", pCommentIn);
			cmd.addParameter("@P_EXPENSE_OWNER_NAME", pExpenseOwnerName);
			cmd.addParameter("@P_EXPENSE_OWNER_EMAIL", pExpenseOwnerEmail);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_TE_URL", pTeUrl);
			cmd.addParameter("@P_BUDGET_AVAIL_IND", pBudgetAvailInd);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_DELEGATE_NAME", pDelegateName);
			cmd.addParameter("@P_DELEGATE_EMAIL", pDelegateEmail);
			cmd.addParameter("@P_DOC_CODE2", pDocCode2);
			cmd.addParameter("@P_APPROVER_NAME", pApproverName);
			cmd.addParameter("@P_PREVIOUS_COMMENT", pPreviousComment);
				
			cmd.execute();


		}
		
		public static void pCreateDocument(NNumber pDocType,NNumber pDocId,NString pDocCode,Ref<NString> pDocCreatedOut,Ref<NString> pSuccessMsgOut,Ref<NString> pErrorMsgOut,Ref<NString> pWarnMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKWFLW.P_CREATE_DOCUMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_DOC_ID", pDocId);
			cmd.addParameter("@P_DOC_CODE", pDocCode);
			cmd.addParameter("@P_DOC_CREATED_OUT", NString.class);
			cmd.addParameter("@P_SUCCESS_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
			cmd.addParameter("@P_WARN_MSG_OUT", NString.class);
				
			cmd.execute();
			pDocCreatedOut.val = cmd.getParameterValue("@P_DOC_CREATED_OUT", NString.class);
			pSuccessMsgOut.val = cmd.getParameterValue("@P_SUCCESS_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);
			pWarnMsgOut.val = cmd.getParameterValue("@P_WARN_MSG_OUT", NString.class);


		}
		
		public static void pFormatDollarAmount(NNumber pAmount,NString pCurrency,Ref<NString> pAmountFormatted) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKWFLW.P_FORMAT_DOLLAR_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_CURRENCY", pCurrency);
			cmd.addParameter("@P_AMOUNT_FORMATTED", NString.class);
				
			cmd.execute();
			pAmountFormatted.val = cmd.getParameterValue("@P_AMOUNT_FORMATTED", NString.class);


		}
		
		public static void pGetAffiliation(NNumber pId,Ref<NString> pAffiliation) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKWFLW.P_GET_AFFILIATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_AFFILIATION", NString.class);
				
			cmd.execute();
			pAffiliation.val = cmd.getParameterValue("@P_AFFILIATION", NString.class);


		}
		
		public static void pGetEmailInfo(NString pDocumentCode,NString pDocumentCode2,NNumber pDocType,NString pAdvancepostauthind,NString pApproverName,NString pStatus,Ref<NString> pSubject,Ref<NString> pBodyText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKWFLW.P_GET_EMAIL_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOCUMENT_CODE", pDocumentCode);
			cmd.addParameter("@P_DOCUMENT_CODE2", pDocumentCode2);
			cmd.addParameter("@P_DOC_TYPE", pDocType);
			cmd.addParameter("@P_ADVANCEPOSTAUTHIND", pAdvancepostauthind);
			cmd.addParameter("@P_APPROVER_NAME", pApproverName);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_SUBJECT", NString.class);
			cmd.addParameter("@P_BODY_TEXT", NString.class);
				
			cmd.execute();
			pSubject.val = cmd.getParameterValue("@P_SUBJECT", NString.class);
			pBodyText.val = cmd.getParameterValue("@P_BODY_TEXT", NString.class);


		}
		
		public static void pGetPortfolio(NNumber pId,Ref<NString> pPortfolioType,Ref<NString> pRelocationInd,Ref<NString> pName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKWFLW.P_GET_PORTFOLIO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_PORTFOLIO_TYPE", NString.class);
			cmd.addParameter("@P_RELOCATION_IND", NString.class);
			cmd.addParameter("@P_NAME", NString.class);
				
			cmd.execute();
			pPortfolioType.val = cmd.getParameterValue("@P_PORTFOLIO_TYPE", NString.class);
			pRelocationInd.val = cmd.getParameterValue("@P_RELOCATION_IND", NString.class);
			pName.val = cmd.getParameterValue("@P_NAME", NString.class);


		}
		
		public static void pSelectAdvance(NNumber pDocId,Ref<NString> pDocCode,Ref<NNumber> pRelatedAuthDocId,Ref<NString> pDocComments,Ref<NString> pDocDescription,Ref<NString> pPostAuthorizationInd,Ref<NString> pRequestAmount,Ref<NString> pDocPurpose,Ref<NString> pCurrencyCode,Ref<NString> pTripStartDate,Ref<NString> pTripEndDate,Ref<NString> pPaymentDueDate,Ref<NString> pTravelInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKWFLW.P_SELECT_ADVANCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_ID", pDocId);
			cmd.addParameter("@P_DOC_CODE", NString.class);
			cmd.addParameter("@P_RELATED_AUTH_DOC_ID", NNumber.class);
			cmd.addParameter("@P_DOC_COMMENTS", NString.class);
			cmd.addParameter("@P_DOC_DESCRIPTION", NString.class);
			cmd.addParameter("@P_POST_AUTHORIZATION_IND", NString.class);
			cmd.addParameter("@P_REQUEST_AMOUNT", NString.class);
			cmd.addParameter("@P_DOC_PURPOSE", NString.class);
			cmd.addParameter("@P_CURRENCY_CODE", NString.class);
			cmd.addParameter("@P_TRIP_START_DATE", NString.class);
			cmd.addParameter("@P_TRIP_END_DATE", NString.class);
			cmd.addParameter("@P_PAYMENT_DUE_DATE", NString.class);
			cmd.addParameter("@P_TRAVEL_IND", NString.class);
				
			cmd.execute();
			pDocCode.val = cmd.getParameterValue("@P_DOC_CODE", NString.class);
			pRelatedAuthDocId.val = cmd.getParameterValue("@P_RELATED_AUTH_DOC_ID", NNumber.class);
			pDocComments.val = cmd.getParameterValue("@P_DOC_COMMENTS", NString.class);
			pDocDescription.val = cmd.getParameterValue("@P_DOC_DESCRIPTION", NString.class);
			pPostAuthorizationInd.val = cmd.getParameterValue("@P_POST_AUTHORIZATION_IND", NString.class);
			pRequestAmount.val = cmd.getParameterValue("@P_REQUEST_AMOUNT", NString.class);
			pDocPurpose.val = cmd.getParameterValue("@P_DOC_PURPOSE", NString.class);
			pCurrencyCode.val = cmd.getParameterValue("@P_CURRENCY_CODE", NString.class);
			pTripStartDate.val = cmd.getParameterValue("@P_TRIP_START_DATE", NString.class);
			pTripEndDate.val = cmd.getParameterValue("@P_TRIP_END_DATE", NString.class);
			pPaymentDueDate.val = cmd.getParameterValue("@P_PAYMENT_DUE_DATE", NString.class);
			pTravelInd.val = cmd.getParameterValue("@P_TRAVEL_IND", NString.class);


		}
		
		public static void pSelectAdvance85(NNumber pDocId,Ref<NString> pDocCode,Ref<NNumber> pRelatedAuthDocId,Ref<NString> pDocComments,Ref<NString> pDocDescription,Ref<NString> pPostAuthorizationInd,Ref<NString> pRequestAmount,Ref<NString> pDocPurpose,Ref<NString> pCurrencyCode,Ref<NString> pTripStartDate,Ref<NString> pTripEndDate,Ref<NString> pPaymentDueDate,Ref<NString> pReportType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKWFLW.P_SELECT_ADVANCE85", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_ID", pDocId);
			cmd.addParameter("@P_DOC_CODE", NString.class);
			cmd.addParameter("@P_RELATED_AUTH_DOC_ID", NNumber.class);
			cmd.addParameter("@P_DOC_COMMENTS", NString.class);
			cmd.addParameter("@P_DOC_DESCRIPTION", NString.class);
			cmd.addParameter("@P_POST_AUTHORIZATION_IND", NString.class);
			cmd.addParameter("@P_REQUEST_AMOUNT", NString.class);
			cmd.addParameter("@P_DOC_PURPOSE", NString.class);
			cmd.addParameter("@P_CURRENCY_CODE", NString.class);
			cmd.addParameter("@P_TRIP_START_DATE", NString.class);
			cmd.addParameter("@P_TRIP_END_DATE", NString.class);
			cmd.addParameter("@P_PAYMENT_DUE_DATE", NString.class);
			cmd.addParameter("@P_REPORT_TYPE", NString.class);
				
			cmd.execute();
			pDocCode.val = cmd.getParameterValue("@P_DOC_CODE", NString.class);
			pRelatedAuthDocId.val = cmd.getParameterValue("@P_RELATED_AUTH_DOC_ID", NNumber.class);
			pDocComments.val = cmd.getParameterValue("@P_DOC_COMMENTS", NString.class);
			pDocDescription.val = cmd.getParameterValue("@P_DOC_DESCRIPTION", NString.class);
			pPostAuthorizationInd.val = cmd.getParameterValue("@P_POST_AUTHORIZATION_IND", NString.class);
			pRequestAmount.val = cmd.getParameterValue("@P_REQUEST_AMOUNT", NString.class);
			pDocPurpose.val = cmd.getParameterValue("@P_DOC_PURPOSE", NString.class);
			pCurrencyCode.val = cmd.getParameterValue("@P_CURRENCY_CODE", NString.class);
			pTripStartDate.val = cmd.getParameterValue("@P_TRIP_START_DATE", NString.class);
			pTripEndDate.val = cmd.getParameterValue("@P_TRIP_END_DATE", NString.class);
			pPaymentDueDate.val = cmd.getParameterValue("@P_PAYMENT_DUE_DATE", NString.class);
			pReportType.val = cmd.getParameterValue("@P_REPORT_TYPE", NString.class);


		}
		
		public static void pSelectAuthorization(NNumber pDocId,Ref<NString> pDocCode,Ref<NString> pDocComments,Ref<NString> pDocDescription,Ref<NString> pDocPurpose,Ref<NString> pRelocationInd,Ref<NString> pTravelInd,Ref<NString> pCurrencyCode,Ref<NString> pTravelerAffiliation,Ref<NString> pReportDate,Ref<NString> pTotalAmount,Ref<NString> pReimbAmount,Ref<NString> pPaidByOtherAmount,Ref<NNumber> pFtrbadvcId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKWFLW.P_SELECT_AUTHORIZATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_ID", pDocId);
			cmd.addParameter("@P_DOC_CODE", NString.class);
			cmd.addParameter("@P_DOC_COMMENTS", NString.class);
			cmd.addParameter("@P_DOC_DESCRIPTION", NString.class);
			cmd.addParameter("@P_DOC_PURPOSE", NString.class);
			cmd.addParameter("@P_RELOCATION_IND", NString.class);
			cmd.addParameter("@P_TRAVEL_IND", NString.class);
			cmd.addParameter("@P_CURRENCY_CODE", NString.class);
			cmd.addParameter("@P_TRAVELER_AFFILIATION", NString.class);
			cmd.addParameter("@P_REPORT_DATE", NString.class);
			cmd.addParameter("@P_TOTAL_AMOUNT", NString.class);
			cmd.addParameter("@P_REIMB_AMOUNT", NString.class);
			cmd.addParameter("@P_PAID_BY_OTHER_AMOUNT", NString.class);
			cmd.addParameter("@P_FTRBADVC_ID", NNumber.class);
				
			cmd.execute();
			pDocCode.val = cmd.getParameterValue("@P_DOC_CODE", NString.class);
			pDocComments.val = cmd.getParameterValue("@P_DOC_COMMENTS", NString.class);
			pDocDescription.val = cmd.getParameterValue("@P_DOC_DESCRIPTION", NString.class);
			pDocPurpose.val = cmd.getParameterValue("@P_DOC_PURPOSE", NString.class);
			pRelocationInd.val = cmd.getParameterValue("@P_RELOCATION_IND", NString.class);
			pTravelInd.val = cmd.getParameterValue("@P_TRAVEL_IND", NString.class);
			pCurrencyCode.val = cmd.getParameterValue("@P_CURRENCY_CODE", NString.class);
			pTravelerAffiliation.val = cmd.getParameterValue("@P_TRAVELER_AFFILIATION", NString.class);
			pReportDate.val = cmd.getParameterValue("@P_REPORT_DATE", NString.class);
			pTotalAmount.val = cmd.getParameterValue("@P_TOTAL_AMOUNT", NString.class);
			pReimbAmount.val = cmd.getParameterValue("@P_REIMB_AMOUNT", NString.class);
			pPaidByOtherAmount.val = cmd.getParameterValue("@P_PAID_BY_OTHER_AMOUNT", NString.class);
			pFtrbadvcId.val = cmd.getParameterValue("@P_FTRBADVC_ID", NNumber.class);


		}
		
		public static void pSelectAuthorization85(NNumber pDocId,Ref<NString> pDocCode,Ref<NString> pDocComments,Ref<NString> pDocDescription,Ref<NString> pDocPurpose,Ref<NString> pRelocationInd,Ref<NString> pReportType,Ref<NString> pCurrencyCode,Ref<NString> pTravelerAffiliation,Ref<NString> pReportDate,Ref<NString> pTotalAmount,Ref<NString> pReimbAmount,Ref<NString> pPaidByOtherAmount,Ref<NNumber> pFtrbadvcId,Ref<NString> pPerdiemAmount,Ref<NString> pActualAmount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKWFLW.P_SELECT_AUTHORIZATION85", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_ID", pDocId);
			cmd.addParameter("@P_DOC_CODE", NString.class);
			cmd.addParameter("@P_DOC_COMMENTS", NString.class);
			cmd.addParameter("@P_DOC_DESCRIPTION", NString.class);
			cmd.addParameter("@P_DOC_PURPOSE", NString.class);
			cmd.addParameter("@P_RELOCATION_IND", NString.class);
			cmd.addParameter("@P_REPORT_TYPE", NString.class);
			cmd.addParameter("@P_CURRENCY_CODE", NString.class);
			cmd.addParameter("@P_TRAVELER_AFFILIATION", NString.class);
			cmd.addParameter("@P_REPORT_DATE", NString.class);
			cmd.addParameter("@P_TOTAL_AMOUNT", NString.class);
			cmd.addParameter("@P_REIMB_AMOUNT", NString.class);
			cmd.addParameter("@P_PAID_BY_OTHER_AMOUNT", NString.class);
			cmd.addParameter("@P_FTRBADVC_ID", NNumber.class);
			cmd.addParameter("@P_PERDIEM_AMOUNT", NString.class);
			cmd.addParameter("@P_ACTUAL_AMOUNT", NString.class);
				
			cmd.execute();
			pDocCode.val = cmd.getParameterValue("@P_DOC_CODE", NString.class);
			pDocComments.val = cmd.getParameterValue("@P_DOC_COMMENTS", NString.class);
			pDocDescription.val = cmd.getParameterValue("@P_DOC_DESCRIPTION", NString.class);
			pDocPurpose.val = cmd.getParameterValue("@P_DOC_PURPOSE", NString.class);
			pRelocationInd.val = cmd.getParameterValue("@P_RELOCATION_IND", NString.class);
			pReportType.val = cmd.getParameterValue("@P_REPORT_TYPE", NString.class);
			pCurrencyCode.val = cmd.getParameterValue("@P_CURRENCY_CODE", NString.class);
			pTravelerAffiliation.val = cmd.getParameterValue("@P_TRAVELER_AFFILIATION", NString.class);
			pReportDate.val = cmd.getParameterValue("@P_REPORT_DATE", NString.class);
			pTotalAmount.val = cmd.getParameterValue("@P_TOTAL_AMOUNT", NString.class);
			pReimbAmount.val = cmd.getParameterValue("@P_REIMB_AMOUNT", NString.class);
			pPaidByOtherAmount.val = cmd.getParameterValue("@P_PAID_BY_OTHER_AMOUNT", NString.class);
			pFtrbadvcId.val = cmd.getParameterValue("@P_FTRBADVC_ID", NNumber.class);
			pPerdiemAmount.val = cmd.getParameterValue("@P_PERDIEM_AMOUNT", NString.class);
			pActualAmount.val = cmd.getParameterValue("@P_ACTUAL_AMOUNT", NString.class);


		}
		
		public static void pSelectReimbursement(NNumber pDocId,Ref<NString> pDocCode,Ref<NString> pDocComments,Ref<NString> pDocDescription,Ref<NString> pPayByWireInd,Ref<NString> pPayBy,Ref<NString> pDocPurpose,Ref<NString> pRelocationInd,Ref<NString> pTravelInd,Ref<NString> pPayCurrencyCode,Ref<NString> pBaseCurrencyCode,Ref<NString> pTravelerAffiliation,Ref<NString> pReportDate,Ref<NString> pTotalAmount,Ref<NString> pReimbAmount,Ref<NString> pPaidByOtherAmount,Ref<NString> pPayAmount,Ref<NString> pAdvcAmount,Ref<NString> pWarningMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKWFLW.P_SELECT_REIMBURSEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_ID", pDocId);
			cmd.addParameter("@P_DOC_CODE", NString.class);
			cmd.addParameter("@P_DOC_COMMENTS", NString.class);
			cmd.addParameter("@P_DOC_DESCRIPTION", NString.class);
			cmd.addParameter("@P_PAY_BY_WIRE_IND", NString.class);
			cmd.addParameter("@P_PAY_BY", NString.class);
			cmd.addParameter("@P_DOC_PURPOSE", NString.class);
			cmd.addParameter("@P_RELOCATION_IND", NString.class);
			cmd.addParameter("@P_TRAVEL_IND", NString.class);
			cmd.addParameter("@P_PAY_CURRENCY_CODE", NString.class);
			cmd.addParameter("@P_BASE_CURRENCY_CODE", NString.class);
			cmd.addParameter("@P_TRAVELER_AFFILIATION", NString.class);
			cmd.addParameter("@P_REPORT_DATE", NString.class);
			cmd.addParameter("@P_TOTAL_AMOUNT", NString.class);
			cmd.addParameter("@P_REIMB_AMOUNT", NString.class);
			cmd.addParameter("@P_PAID_BY_OTHER_AMOUNT", NString.class);
			cmd.addParameter("@P_PAY_AMOUNT", NString.class);
			cmd.addParameter("@P_ADVC_AMOUNT", NString.class);
			cmd.addParameter("@P_WARNING_MSG", NString.class);
				
			cmd.execute();
			pDocCode.val = cmd.getParameterValue("@P_DOC_CODE", NString.class);
			pDocComments.val = cmd.getParameterValue("@P_DOC_COMMENTS", NString.class);
			pDocDescription.val = cmd.getParameterValue("@P_DOC_DESCRIPTION", NString.class);
			pPayByWireInd.val = cmd.getParameterValue("@P_PAY_BY_WIRE_IND", NString.class);
			pPayBy.val = cmd.getParameterValue("@P_PAY_BY", NString.class);
			pDocPurpose.val = cmd.getParameterValue("@P_DOC_PURPOSE", NString.class);
			pRelocationInd.val = cmd.getParameterValue("@P_RELOCATION_IND", NString.class);
			pTravelInd.val = cmd.getParameterValue("@P_TRAVEL_IND", NString.class);
			pPayCurrencyCode.val = cmd.getParameterValue("@P_PAY_CURRENCY_CODE", NString.class);
			pBaseCurrencyCode.val = cmd.getParameterValue("@P_BASE_CURRENCY_CODE", NString.class);
			pTravelerAffiliation.val = cmd.getParameterValue("@P_TRAVELER_AFFILIATION", NString.class);
			pReportDate.val = cmd.getParameterValue("@P_REPORT_DATE", NString.class);
			pTotalAmount.val = cmd.getParameterValue("@P_TOTAL_AMOUNT", NString.class);
			pReimbAmount.val = cmd.getParameterValue("@P_REIMB_AMOUNT", NString.class);
			pPaidByOtherAmount.val = cmd.getParameterValue("@P_PAID_BY_OTHER_AMOUNT", NString.class);
			pPayAmount.val = cmd.getParameterValue("@P_PAY_AMOUNT", NString.class);
			pAdvcAmount.val = cmd.getParameterValue("@P_ADVC_AMOUNT", NString.class);
			pWarningMsg.val = cmd.getParameterValue("@P_WARNING_MSG", NString.class);


		}
		
		public static void pSelectReimbursement85(NNumber pDocId,Ref<NString> pDocCode,Ref<NString> pDocComments,Ref<NString> pDocDescription,Ref<NString> pPayByWireInd,Ref<NString> pPayBy,Ref<NString> pDocPurpose,Ref<NString> pRelocationInd,Ref<NString> pReportType,Ref<NString> pPayCurrencyCode,Ref<NString> pBaseCurrencyCode,Ref<NString> pTravelerAffiliation,Ref<NString> pReportDate,Ref<NString> pTotalAmount,Ref<NString> pReimbAmount,Ref<NString> pPaidByOtherAmount,Ref<NString> pPayAmount,Ref<NString> pAdvcAmount,Ref<NString> pWarningMsg,Ref<NString> pPerdiemAmount,Ref<NString> pActualAmount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKWFLW.P_SELECT_REIMBURSEMENT85", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_ID", pDocId);
			cmd.addParameter("@P_DOC_CODE", NString.class);
			cmd.addParameter("@P_DOC_COMMENTS", NString.class);
			cmd.addParameter("@P_DOC_DESCRIPTION", NString.class);
			cmd.addParameter("@P_PAY_BY_WIRE_IND", NString.class);
			cmd.addParameter("@P_PAY_BY", NString.class);
			cmd.addParameter("@P_DOC_PURPOSE", NString.class);
			cmd.addParameter("@P_RELOCATION_IND", NString.class);
			cmd.addParameter("@P_REPORT_TYPE", NString.class);
			cmd.addParameter("@P_PAY_CURRENCY_CODE", NString.class);
			cmd.addParameter("@P_BASE_CURRENCY_CODE", NString.class);
			cmd.addParameter("@P_TRAVELER_AFFILIATION", NString.class);
			cmd.addParameter("@P_REPORT_DATE", NString.class);
			cmd.addParameter("@P_TOTAL_AMOUNT", NString.class);
			cmd.addParameter("@P_REIMB_AMOUNT", NString.class);
			cmd.addParameter("@P_PAID_BY_OTHER_AMOUNT", NString.class);
			cmd.addParameter("@P_PAY_AMOUNT", NString.class);
			cmd.addParameter("@P_ADVC_AMOUNT", NString.class);
			cmd.addParameter("@P_WARNING_MSG", NString.class);
			cmd.addParameter("@P_PERDIEM_AMOUNT", NString.class);
			cmd.addParameter("@P_ACTUAL_AMOUNT", NString.class);
				
			cmd.execute();
			pDocCode.val = cmd.getParameterValue("@P_DOC_CODE", NString.class);
			pDocComments.val = cmd.getParameterValue("@P_DOC_COMMENTS", NString.class);
			pDocDescription.val = cmd.getParameterValue("@P_DOC_DESCRIPTION", NString.class);
			pPayByWireInd.val = cmd.getParameterValue("@P_PAY_BY_WIRE_IND", NString.class);
			pPayBy.val = cmd.getParameterValue("@P_PAY_BY", NString.class);
			pDocPurpose.val = cmd.getParameterValue("@P_DOC_PURPOSE", NString.class);
			pRelocationInd.val = cmd.getParameterValue("@P_RELOCATION_IND", NString.class);
			pReportType.val = cmd.getParameterValue("@P_REPORT_TYPE", NString.class);
			pPayCurrencyCode.val = cmd.getParameterValue("@P_PAY_CURRENCY_CODE", NString.class);
			pBaseCurrencyCode.val = cmd.getParameterValue("@P_BASE_CURRENCY_CODE", NString.class);
			pTravelerAffiliation.val = cmd.getParameterValue("@P_TRAVELER_AFFILIATION", NString.class);
			pReportDate.val = cmd.getParameterValue("@P_REPORT_DATE", NString.class);
			pTotalAmount.val = cmd.getParameterValue("@P_TOTAL_AMOUNT", NString.class);
			pReimbAmount.val = cmd.getParameterValue("@P_REIMB_AMOUNT", NString.class);
			pPaidByOtherAmount.val = cmd.getParameterValue("@P_PAID_BY_OTHER_AMOUNT", NString.class);
			pPayAmount.val = cmd.getParameterValue("@P_PAY_AMOUNT", NString.class);
			pAdvcAmount.val = cmd.getParameterValue("@P_ADVC_AMOUNT", NString.class);
			pWarningMsg.val = cmd.getParameterValue("@P_WARNING_MSG", NString.class);
			pPerdiemAmount.val = cmd.getParameterValue("@P_PERDIEM_AMOUNT", NString.class);
			pActualAmount.val = cmd.getParameterValue("@P_ACTUAL_AMOUNT", NString.class);


		}
		
	
	
	
}
