package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbJvHeader {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_HEADER.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pDocNum,NNumber pSubmissionNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_HEADER.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(JvHeaderRecRow recOne,JvHeaderRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_HEADER.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, JvHeaderRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, JvHeaderRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pDocNum,NNumber pSubmissionNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_HEADER.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_HEADER.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pDocNum,NNumber pSubmissionNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_HEADER.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pDocNum,NNumber pSubmissionNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_HEADER.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(Ref<NString> pDocNumInOut,NNumber pSubmissionNumber,NString pUserId,NDate pTransDate,NString pDocDescription,NNumber pDocAmt,NString pAutoJrnlId,NString pReversalInd,NString pObudCode,NString pObphCode,NString pBudgDurCode,NString pEditDeferInd,NString pStatusInd,NString pApprovalInd,NNumber pDistribAmt,NString pNsfOnOffInd,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_HEADER.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_NUM_IN_OUT", pDocNumInOut, true);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_DOC_DESCRIPTION", pDocDescription);
			cmd.addParameter("@P_DOC_AMT", pDocAmt);
			cmd.addParameter("@P_AUTO_JRNL_ID", pAutoJrnlId);
			cmd.addParameter("@P_REVERSAL_IND", pReversalInd);
			cmd.addParameter("@P_OBUD_CODE", pObudCode);
			cmd.addParameter("@P_OBPH_CODE", pObphCode);
			cmd.addParameter("@P_BUDG_DUR_CODE", pBudgDurCode);
			cmd.addParameter("@P_EDIT_DEFER_IND", pEditDeferInd);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_APPROVAL_IND", pApprovalInd);
			cmd.addParameter("@P_DISTRIB_AMT", pDistribAmt);
			cmd.addParameter("@P_NSF_ON_OFF_IND", pNsfOnOffInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pDocNumInOut.val = cmd.getParameterValue("@P_DOC_NUM_IN_OUT", NString.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pDocNum,NNumber pSubmissionNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_HEADER.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pDocNum,NNumber pSubmissionNumber,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_HEADER.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pDocNum,NNumber pSubmissionNumber,NString pUserId,NDate pTransDate,NString pDocDescription,NNumber pDocAmt,NString pAutoJrnlId,NString pReversalInd,NString pObudCode,NString pObphCode,NString pBudgDurCode,NString pEditDeferInd,NString pStatusInd,NString pApprovalInd,NNumber pDistribAmt,NString pNsfOnOffInd,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_HEADER.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_TRANS_DATE", pTransDate);
			cmd.addParameter("@P_DOC_DESCRIPTION", pDocDescription);
			cmd.addParameter("@P_DOC_AMT", pDocAmt);
			cmd.addParameter("@P_AUTO_JRNL_ID", pAutoJrnlId);
			cmd.addParameter("@P_REVERSAL_IND", pReversalInd);
			cmd.addParameter("@P_OBUD_CODE", pObudCode);
			cmd.addParameter("@P_OBPH_CODE", pObphCode);
			cmd.addParameter("@P_BUDG_DUR_CODE", pBudgDurCode);
			cmd.addParameter("@P_EDIT_DEFER_IND", pEditDeferInd);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_APPROVAL_IND", pApprovalInd);
			cmd.addParameter("@P_DISTRIB_AMT", pDistribAmt);
			cmd.addParameter("@P_NSF_ON_OFF_IND", pNsfOnOffInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateInternal(NString pDocNum,NNumber pSubmissionNumber,NString pStatusInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_HEADER.P_UPDATE_INTERNAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_APPROVAL_IND", NString.getNull());
			cmd.addParameter("@P_ALL_LEDGERS_IND", NString.getNull());
				
			cmd.execute();


		}

		public static void pUpdateInternal(NString pDocNum,NNumber pSubmissionNumber,NString pStatusInd,NString pApprovalInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_JV_HEADER.P_UPDATE_INTERNAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOC_NUM", pDocNum);
			cmd.addParameter("@P_SUBMISSION_NUMBER", pSubmissionNumber);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_APPROVAL_IND", pApprovalInd);
				
			cmd.execute();


		}
		
		
		
	
	
	@DbRecordType(id="JvHeaderRecRow", dataSourceName="JV_HEADER_REC")
	public static class JvHeaderRecRow
	{
		@DbRecordField(dataSourceName="R_DOC_NUM")
		public NString RDocNum;
		@DbRecordField(dataSourceName="R_SUBMISSION_NUMBER")
		public NNumber RSubmissionNumber;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_TRANS_DATE")
		public NDate RTransDate;
		@DbRecordField(dataSourceName="R_DOC_DESCRIPTION")
		public NString RDocDescription;
		@DbRecordField(dataSourceName="R_DOC_AMT")
		public NNumber RDocAmt;
		@DbRecordField(dataSourceName="R_AUTO_JRNL_ID")
		public NString RAutoJrnlId;
		@DbRecordField(dataSourceName="R_REVERSAL_IND")
		public NString RReversalInd;
		@DbRecordField(dataSourceName="R_OBUD_CODE")
		public NString RObudCode;
		@DbRecordField(dataSourceName="R_OBPH_CODE")
		public NString RObphCode;
		@DbRecordField(dataSourceName="R_BUDG_DUR_CODE")
		public NString RBudgDurCode;
		@DbRecordField(dataSourceName="R_PROCESS_IND")
		public NString RProcessInd;
		@DbRecordField(dataSourceName="R_EDIT_DEFER_IND")
		public NString REditDeferInd;
		@DbRecordField(dataSourceName="R_STATUS_IND")
		public NString RStatusInd;
		@DbRecordField(dataSourceName="R_APPROVAL_IND")
		public NString RApprovalInd;
		@DbRecordField(dataSourceName="R_DISTRIB_AMT")
		public NNumber RDistribAmt;
		@DbRecordField(dataSourceName="R_NSF_ON_OFF_IND")
		public NString RNsfOnOffInd;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_CREATE_SOURCE")
		public NString RCreateSource;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
