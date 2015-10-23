package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbComment {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_COMMENT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pCommentCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_COMMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_COMMENT_CODE", pCommentCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CommentRecRow recOne,CommentRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_COMMENT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CommentRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CommentRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pForm,NNumber pSeqNumber,NString pOrigCode,NString pText,NString pUser,NString pCommentCode,NString pTerm,NString pRestrictUpdateInd,NString pPurgeInd,NDate pEnddate,NString pCreatedBy,NDate pCreatedDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_COMMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FORM", pForm);
			cmd.addParameter("@P_SEQ_NUMBER", pSeqNumber);
			cmd.addParameter("@P_ORIG_CODE", pOrigCode);
			cmd.addParameter("@P_TEXT", pText);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_COMMENT_CODE", pCommentCode);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_RESTRICT_UPDATE_IND", pRestrictUpdateInd);
			cmd.addParameter("@P_PURGE_IND", pPurgeInd);
			cmd.addParameter("@P_ENDDATE", pEnddate);
			cmd.addParameter("@P_CREATED_BY", pCreatedBy);
			cmd.addParameter("@P_CREATED_DATE", pCreatedDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_COMMENT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pForm,NNumber pSeqNumber,NString pOrigCode,NString pText,NString pUser,NString pCommentCode,NString pTerm,NString pRestrictUpdateInd,NString pPurgeInd,NDate pEnddate,NString pCreatedBy,NDate pCreatedDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_COMMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FORM", pForm);
			cmd.addParameter("@P_SEQ_NUMBER", pSeqNumber);
			cmd.addParameter("@P_ORIG_CODE", pOrigCode);
			cmd.addParameter("@P_TEXT", pText);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_COMMENT_CODE", pCommentCode);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_RESTRICT_UPDATE_IND", pRestrictUpdateInd);
			cmd.addParameter("@P_PURGE_IND", pPurgeInd);
			cmd.addParameter("@P_ENDDATE", pEnddate);
			cmd.addParameter("@P_CREATED_BY", pCreatedBy);
			cmd.addParameter("@P_CREATED_DATE", pCreatedDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pForm,NNumber pSeqNumber,NString pOrigCode,NString pText,NString pUser,NString pCommentCode,NString pTerm,NString pRestrictUpdateInd,NString pPurgeInd,NDate pEnddate,NString pCreatedBy,NDate pCreatedDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_COMMENT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FORM", pForm);
			cmd.addParameter("@P_SEQ_NUMBER", pSeqNumber);
			cmd.addParameter("@P_ORIG_CODE", pOrigCode);
			cmd.addParameter("@P_TEXT", pText);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_COMMENT_CODE", pCommentCode);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_RESTRICT_UPDATE_IND", pRestrictUpdateInd);
			cmd.addParameter("@P_PURGE_IND", pPurgeInd);
			cmd.addParameter("@P_ENDDATE", pEnddate);
			cmd.addParameter("@P_CREATED_BY", pCreatedBy);
			cmd.addParameter("@P_CREATED_DATE", pCreatedDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pForm,NNumber pSeqNumber,NString pOrigCode,NString pText,NString pUser,NString pCommentCode,NString pTerm,NString pRestrictUpdateInd,NString pPurgeInd,NDate pEnddate,NString pComment,NString pCreatedBy,NDate pCreatedDate,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_COMMENT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FORM", pForm);
			cmd.addParameter("@P_SEQ_NUMBER", pSeqNumber);
			cmd.addParameter("@P_ORIG_CODE", pOrigCode);
			cmd.addParameter("@P_TEXT", pText);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_COMMENT_CODE", pCommentCode);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_RESTRICT_UPDATE_IND", pRestrictUpdateInd);
			cmd.addParameter("@P_PURGE_IND", pPurgeInd);
			cmd.addParameter("@P_ENDDATE", pEnddate);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_CREATED_BY", pCreatedBy);
			cmd.addParameter("@P_CREATED_DATE", pCreatedDate);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pCommentCode,NString pPurgeInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_COMMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_COMMENT_CODE", pCommentCode);
			cmd.addParameter("@P_PURGE_IND", pPurgeInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_COMMENT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pForm,NNumber pSeqNumber,NString pOrigCode,NString pText,NString pUser,NString pCommentCode,NString pTerm,NString pRestrictUpdateInd,NString pPurgeInd,NDate pEnddate,NString pComment,NString pCreatedBy,NDate pCreatedDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_COMMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FORM", pForm);
			cmd.addParameter("@P_SEQ_NUMBER", pSeqNumber);
			cmd.addParameter("@P_ORIG_CODE", pOrigCode);
			cmd.addParameter("@P_TEXT", pText);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_COMMENT_CODE", pCommentCode);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_RESTRICT_UPDATE_IND", pRestrictUpdateInd);
			cmd.addParameter("@P_PURGE_IND", pPurgeInd);
			cmd.addParameter("@P_ENDDATE", pEnddate);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_CREATED_BY", pCreatedBy);
			cmd.addParameter("@P_CREATED_DATE", pCreatedDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CommentRecRow", dataSourceName="COMMENT_REC")
	public static class CommentRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_FORM")
		public NString RForm;
		@DbRecordField(dataSourceName="R_SEQ_NUMBER")
		public NNumber RSeqNumber;
		@DbRecordField(dataSourceName="R_ORIG_CODE")
		public NString ROrigCode;
		@DbRecordField(dataSourceName="R_TEXT")
		public NString RText;
		@DbRecordField(dataSourceName="R_USER")
		public NString RUser;
		@DbRecordField(dataSourceName="R_COMMENT_CODE")
		public NString RCommentCode;
		@DbRecordField(dataSourceName="R_TERM")
		public NString RTerm;
		@DbRecordField(dataSourceName="R_RESTRICT_UPDATE_IND")
		public NString RRestrictUpdateInd;
		@DbRecordField(dataSourceName="R_PURGE_IND")
		public NString RPurgeInd;
		@DbRecordField(dataSourceName="R_ENDDATE")
		public NDate REnddate;
		@DbRecordField(dataSourceName="R_COMMENT")
		public NString RComment;
		@DbRecordField(dataSourceName="R_CREATED_BY")
		public NString RCreatedBy;
		@DbRecordField(dataSourceName="R_CREATED_DATE")
		public NDate RCreatedDate;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
