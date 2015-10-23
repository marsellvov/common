package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbTranscriptNameSource {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME_SOURCE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTrnsCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME_SOURCE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TRNS_CODE", pTrnsCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TranscriptNameSourceRecRow recOne,TranscriptNameSourceRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME_SOURCE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TranscriptNameSourceRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TranscriptNameSourceRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTrnsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME_SOURCE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TRNS_CODE", pTrnsCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME_SOURCE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTrnsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME_SOURCE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TRNS_CODE", pTrnsCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTrnsCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME_SOURCE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TRNS_CODE", pTrnsCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTrnsCode,NString pSysReqInd,NString pEdiInd,NString pNtypInd,NString pDegrInd,NString pDataOrigin,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME_SOURCE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRNS_CODE", pTrnsCode);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_EDI_IND", pEdiInd);
			cmd.addParameter("@P_NTYP_IND", pNtypInd);
			cmd.addParameter("@P_DEGR_IND", pDegrInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTrnsCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME_SOURCE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRNS_CODE", pTrnsCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTrnsCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME_SOURCE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRNS_CODE", pTrnsCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTrnsCode,NString pSysReqInd,NString pEdiInd,NString pNtypInd,NString pDegrInd,NString pDataOrigin,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_TRANSCRIPT_NAME_SOURCE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRNS_CODE", pTrnsCode);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_EDI_IND", pEdiInd);
			cmd.addParameter("@P_NTYP_IND", pNtypInd);
			cmd.addParameter("@P_DEGR_IND", pDegrInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TranscriptNameSourceRecRow", dataSourceName="TRANSCRIPT_NAME_SOURCE_REC")
	public static class TranscriptNameSourceRecRow
	{
		@DbRecordField(dataSourceName="R_TRNS_CODE")
		public NString RTrnsCode;
		@DbRecordField(dataSourceName="R_SYS_REQ_IND")
		public NString RSysReqInd;
		@DbRecordField(dataSourceName="R_EDI_IND")
		public NString REdiInd;
		@DbRecordField(dataSourceName="R_NTYP_IND")
		public NString RNtypInd;
		@DbRecordField(dataSourceName="R_DEGR_IND")
		public NString RDegrInd;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
