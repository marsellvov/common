package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbTranscriptReqName {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_REQ_NAME.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTranUser,NNumber pPidm,NNumber pTranSeqno,NNumber pNameSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_REQ_NAME.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRAN_USER", pTranUser);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_SEQNO", pTranSeqno);
			cmd.addParameter("@P_NAME_SEQNO", pNameSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TranscriptReqNameRecRow recOne,TranscriptReqNameRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_REQ_NAME.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TranscriptReqNameRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TranscriptReqNameRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTranUser,NNumber pPidm,NNumber pTranSeqno,NNumber pNameSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_REQ_NAME.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TRAN_USER", pTranUser);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_SEQNO", pTranSeqno);
			cmd.addParameter("@P_NAME_SEQNO", pNameSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_REQ_NAME.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTranUser,NNumber pPidm,NNumber pTranSeqno,NNumber pNameSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_REQ_NAME.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TRAN_USER", pTranUser);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_SEQNO", pTranSeqno);
			cmd.addParameter("@P_NAME_SEQNO", pNameSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTranUser,NNumber pPidm,NNumber pTranSeqno,NNumber pNameSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_REQ_NAME.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TRAN_USER", pTranUser);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_SEQNO", pTranSeqno);
			cmd.addParameter("@P_NAME_SEQNO", pNameSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTranUser,NNumber pPidm,NNumber pTranSeqno,NNumber pNameSeqno,NString pTrnsCode,NString pUserId,NString pDataOrigin,NString pNtypCode,NNumber pDegrSeqNo,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_REQ_NAME.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRAN_USER", pTranUser);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_SEQNO", pTranSeqno);
			cmd.addParameter("@P_NAME_SEQNO", pNameSeqno);
			cmd.addParameter("@P_TRNS_CODE", pTrnsCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_NTYP_CODE", pNtypCode);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTranUser,NNumber pPidm,NNumber pTranSeqno,NNumber pNameSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_REQ_NAME.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRAN_USER", pTranUser);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_SEQNO", pTranSeqno);
			cmd.addParameter("@P_NAME_SEQNO", pNameSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTranUser,NNumber pPidm,NNumber pTranSeqno,NNumber pNameSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_REQ_NAME.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRAN_USER", pTranUser);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_SEQNO", pTranSeqno);
			cmd.addParameter("@P_NAME_SEQNO", pNameSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTranUser,NNumber pPidm,NNumber pTranSeqno,NNumber pNameSeqno,NString pTrnsCode,NString pUserId,NString pDataOrigin,NString pNtypCode,NNumber pDegrSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_REQ_NAME.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRAN_USER", pTranUser);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_SEQNO", pTranSeqno);
			cmd.addParameter("@P_NAME_SEQNO", pNameSeqno);
			cmd.addParameter("@P_TRNS_CODE", pTrnsCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_NTYP_CODE", pNtypCode);
			cmd.addParameter("@P_DEGR_SEQ_NO", pDegrSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TranscriptReqNameRecRow", dataSourceName="TRANSCRIPT_REQ_NAME_REC")
	public static class TranscriptReqNameRecRow
	{
		@DbRecordField(dataSourceName="R_TRAN_USER")
		public NString RTranUser;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TRAN_SEQNO")
		public NNumber RTranSeqno;
		@DbRecordField(dataSourceName="R_NAME_SEQNO")
		public NNumber RNameSeqno;
		@DbRecordField(dataSourceName="R_TRNS_CODE")
		public NString RTrnsCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_NTYP_CODE")
		public NString RNtypCode;
		@DbRecordField(dataSourceName="R_DEGR_SEQ_NO")
		public NNumber RDegrSeqNo;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
