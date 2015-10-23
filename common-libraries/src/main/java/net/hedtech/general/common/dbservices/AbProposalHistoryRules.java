package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class AbProposalHistoryRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROPOSAL_HISTORY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NNumber pSeqNo,NString pUserId,NString pDataOrigin,NString pPrstCodeChgInd,NString pPrstCode,NString pPrstDateChgInd,NDate pPrstDate,NString pStaffPidmChgInd,NNumber pStaffPidm,NString pStaffIdenChgInd,NString pStaffIdenCode,NString pDueDateChgInd,NDate pDueDate,NString pFinanceCodeChgInd,NString pFinanceCode,NString pAskAmountChgInd,NNumber pAskAmount,NString pCommentChgInd,NString pComment,NDate pCreateDate,NString pCreateDateChgInd,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROPOSAL_HISTORY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PRST_CODE_CHG_IND", pPrstCodeChgInd);
			cmd.addParameter("@P_PRST_CODE", pPrstCode);
			cmd.addParameter("@P_PRST_DATE_CHG_IND", pPrstDateChgInd);
			cmd.addParameter("@P_PRST_DATE", pPrstDate);
			cmd.addParameter("@P_STAFF_PIDM_CHG_IND", pStaffPidmChgInd);
			cmd.addParameter("@P_STAFF_PIDM", pStaffPidm);
			cmd.addParameter("@P_STAFF_IDEN_CHG_IND", pStaffIdenChgInd);
			cmd.addParameter("@P_STAFF_IDEN_CODE", pStaffIdenCode);
			cmd.addParameter("@P_DUE_DATE_CHG_IND", pDueDateChgInd);
			cmd.addParameter("@P_DUE_DATE", pDueDate);
			cmd.addParameter("@P_FINANCE_CODE_CHG_IND", pFinanceCodeChgInd);
			cmd.addParameter("@P_FINANCE_CODE", pFinanceCode);
			cmd.addParameter("@P_ASK_AMOUNT_CHG_IND", pAskAmountChgInd);
			cmd.addParameter("@P_ASK_AMOUNT", pAskAmount);
			cmd.addParameter("@P_COMMENT_CHG_IND", pCommentChgInd);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_DATE_CHG_IND", pCreateDateChgInd);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NNumber pSeqNo,NString pUserId,NString pDataOrigin,NString pPrstCodeChgInd,NString pPrstCode,NString pPrstDateChgInd,NDate pPrstDate,NString pStaffPidmChgInd,NNumber pStaffPidm,NString pStaffIdenChgInd,NString pStaffIdenCode,NString pDueDateChgInd,NDate pDueDate,NString pFinanceCodeChgInd,NString pFinanceCode,NString pAskAmountChgInd,NNumber pAskAmount,NString pCommentChgInd,NString pComment,NDate pCreateDate,NString pCreateDateChgInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROPOSAL_HISTORY_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PRST_CODE_CHG_IND", pPrstCodeChgInd);
			cmd.addParameter("@P_PRST_CODE", pPrstCode);
			cmd.addParameter("@P_PRST_DATE_CHG_IND", pPrstDateChgInd);
			cmd.addParameter("@P_PRST_DATE", pPrstDate);
			cmd.addParameter("@P_STAFF_PIDM_CHG_IND", pStaffPidmChgInd);
			cmd.addParameter("@P_STAFF_PIDM", pStaffPidm);
			cmd.addParameter("@P_STAFF_IDEN_CHG_IND", pStaffIdenChgInd);
			cmd.addParameter("@P_STAFF_IDEN_CODE", pStaffIdenCode);
			cmd.addParameter("@P_DUE_DATE_CHG_IND", pDueDateChgInd);
			cmd.addParameter("@P_DUE_DATE", pDueDate);
			cmd.addParameter("@P_FINANCE_CODE_CHG_IND", pFinanceCodeChgInd);
			cmd.addParameter("@P_FINANCE_CODE", pFinanceCode);
			cmd.addParameter("@P_ASK_AMOUNT_CHG_IND", pAskAmountChgInd);
			cmd.addParameter("@P_ASK_AMOUNT", pAskAmount);
			cmd.addParameter("@P_COMMENT_CHG_IND", pCommentChgInd);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_DATE_CHG_IND", pCreateDateChgInd);
				
			cmd.execute();


		}
		
	
	
	
}
