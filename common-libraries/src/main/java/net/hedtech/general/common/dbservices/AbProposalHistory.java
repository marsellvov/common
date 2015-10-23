package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class AbProposalHistory {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROPOSAL_HISTORY.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROPOSAL_HISTORY.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ProposalHistoryRecRow recOne,ProposalHistoryRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROPOSAL_HISTORY.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ProposalHistoryRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ProposalHistoryRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROPOSAL_HISTORY.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROPOSAL_HISTORY.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROPOSAL_HISTORY.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROPOSAL_HISTORY.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NNumber pSeqNo,NString pUserId,NString pDataOrigin,NString pPrstCodeChgInd,NString pPrstCode,NString pPrstDateChgInd,NDate pPrstDate,NString pStaffPidmChgInd,NNumber pStaffPidm,NString pStaffIdenChgInd,NString pStaffIdenCode,NString pDueDateChgInd,NDate pDueDate,NString pFinanceCodeChgInd,NString pFinanceCode,NString pAskAmountChgInd,NNumber pAskAmount,NString pCommentChgInd,NString pComment,NDate pCreateDate,NString pCreateDateChgInd,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROPOSAL_HISTORY.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROPOSAL_HISTORY.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pPropCode,NNumber pPropSeqNo,NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_PROPOSAL_HISTORY.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROP_CODE", pPropCode);
			cmd.addParameter("@P_PROP_SEQ_NO", pPropSeqNo);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
	
	
	@DbRecordType(id="ProposalHistoryRecRow", dataSourceName="PROPOSAL_HISTORY_REC")
	public static class ProposalHistoryRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_PROP_CODE")
		public NString RPropCode;
		@DbRecordField(dataSourceName="R_PROP_SEQ_NO")
		public NNumber RPropSeqNo;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_PRST_CODE_CHG_IND")
		public NString RPrstCodeChgInd;
		@DbRecordField(dataSourceName="R_PRST_CODE")
		public NString RPrstCode;
		@DbRecordField(dataSourceName="R_PRST_DATE_CHG_IND")
		public NString RPrstDateChgInd;
		@DbRecordField(dataSourceName="R_PRST_DATE")
		public NDate RPrstDate;
		@DbRecordField(dataSourceName="R_STAFF_PIDM_CHG_IND")
		public NString RStaffPidmChgInd;
		@DbRecordField(dataSourceName="R_STAFF_PIDM")
		public NNumber RStaffPidm;
		@DbRecordField(dataSourceName="R_STAFF_IDEN_CHG_IND")
		public NString RStaffIdenChgInd;
		@DbRecordField(dataSourceName="R_STAFF_IDEN_CODE")
		public NString RStaffIdenCode;
		@DbRecordField(dataSourceName="R_DUE_DATE_CHG_IND")
		public NString RDueDateChgInd;
		@DbRecordField(dataSourceName="R_DUE_DATE")
		public NDate RDueDate;
		@DbRecordField(dataSourceName="R_FINANCE_CODE_CHG_IND")
		public NString RFinanceCodeChgInd;
		@DbRecordField(dataSourceName="R_FINANCE_CODE")
		public NString RFinanceCode;
		@DbRecordField(dataSourceName="R_ASK_AMOUNT_CHG_IND")
		public NString RAskAmountChgInd;
		@DbRecordField(dataSourceName="R_ASK_AMOUNT")
		public NNumber RAskAmount;
		@DbRecordField(dataSourceName="R_COMMENT_CHG_IND")
		public NString RCommentChgInd;
		@DbRecordField(dataSourceName="R_COMMENT")
		public NString RComment;
		@DbRecordField(dataSourceName="R_CREATE_DATE")
		public NDate RCreateDate;
		@DbRecordField(dataSourceName="R_CREATE_DATE_CHG_IND")
		public NString RCreateDateChgInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
