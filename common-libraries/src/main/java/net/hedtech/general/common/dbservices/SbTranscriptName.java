package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbTranscriptName {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTprtCode,NNumber pNameSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TPRT_CODE", pTprtCode);
			cmd.addParameter("@P_NAME_SEQNO", pNameSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TranscriptNameRecRow recOne,TranscriptNameRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TranscriptNameRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TranscriptNameRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTprtCode,NNumber pNameSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TPRT_CODE", pTprtCode);
			cmd.addParameter("@P_NAME_SEQNO", pNameSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTprtCode,NNumber pNameSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TPRT_CODE", pTprtCode);
			cmd.addParameter("@P_NAME_SEQNO", pNameSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTprtCode,NNumber pNameSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TPRT_CODE", pTprtCode);
			cmd.addParameter("@P_NAME_SEQNO", pNameSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTprtCode,NNumber pNameSeqno,NString pTrnsCode,NString pUserId,NString pDataOrigin,NString pNtypCode,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TPRT_CODE", pTprtCode);
			cmd.addParameter("@P_NAME_SEQNO", pNameSeqno);
			cmd.addParameter("@P_TRNS_CODE", pTrnsCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_NTYP_CODE", pNtypCode);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTprtCode,NNumber pNameSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TPRT_CODE", pTprtCode);
			cmd.addParameter("@P_NAME_SEQNO", pNameSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTprtCode,NNumber pNameSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TPRT_CODE", pTprtCode);
			cmd.addParameter("@P_NAME_SEQNO", pNameSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTprtCode,NNumber pNameSeqno,NString pTrnsCode,NString pUserId,NString pDataOrigin,NString pNtypCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TPRT_CODE", pTprtCode);
			cmd.addParameter("@P_NAME_SEQNO", pNameSeqno);
			cmd.addParameter("@P_TRNS_CODE", pTrnsCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_NTYP_CODE", pNtypCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TranscriptNameRecRow", dataSourceName="TRANSCRIPT_NAME_REC")
	public static class TranscriptNameRecRow
	{
		@DbRecordField(dataSourceName="R_TPRT_CODE")
		public NString RTprtCode;
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
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
