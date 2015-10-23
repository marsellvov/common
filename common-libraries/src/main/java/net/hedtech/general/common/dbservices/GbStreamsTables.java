package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbStreamsTables {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STREAMS_TABLES.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STREAMS_TABLES.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(StreamsTablesRecRow recOne,StreamsTablesRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STREAMS_TABLES.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, StreamsTablesRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, StreamsTablesRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STREAMS_TABLES.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STREAMS_TABLES.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STREAMS_TABLES.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STREAMS_TABLES.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pSeqNo,NString pSqprCode,NString pTableName,NString pTableOwner,NString pApplyHandler,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STREAMS_TABLES.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_SQPR_CODE", pSqprCode);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_APPLY_HANDLER", pApplyHandler);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STREAMS_TABLES.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STREAMS_TABLES.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pSeqNo,NString pSqprCode,NString pTableName,NString pTableOwner,NString pApplyHandler,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_STREAMS_TABLES.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_SQPR_CODE", pSqprCode);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_TABLE_OWNER", pTableOwner);
			cmd.addParameter("@P_APPLY_HANDLER", pApplyHandler);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="StreamsTablesRecRow", dataSourceName="STREAMS_TABLES_REC")
	public static class StreamsTablesRecRow
	{
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_SQPR_CODE")
		public NString RSqprCode;
		@DbRecordField(dataSourceName="R_TABLE_NAME")
		public NString RTableName;
		@DbRecordField(dataSourceName="R_TABLE_OWNER")
		public NString RTableOwner;
		@DbRecordField(dataSourceName="R_APPLY_HANDLER")
		public NString RApplyHandler;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
