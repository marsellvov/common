package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class NbQueueParticipant {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_QUEUE_PARTICIPANT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pCoasCode,NString pQprtCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_QUEUE_PARTICIPANT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_QPRT_CODE", pQprtCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(QueueParticipantRecRow recOne,QueueParticipantRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_QUEUE_PARTICIPANT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, QueueParticipantRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, QueueParticipantRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pCoasCode,NString pQprtCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_QUEUE_PARTICIPANT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_QPRT_CODE", pQprtCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryById(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_QUEUE_PARTICIPANT.F_QUERY_BY_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_QUEUE_PARTICIPANT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCoasCode,NString pQprtCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_QUEUE_PARTICIPANT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_QPRT_CODE", pQprtCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pCoasCode,NString pQprtCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_QUEUE_PARTICIPANT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_QPRT_CODE", pQprtCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pCoasCode,NString pQprtCode,NString pDataSourceType,NString pCatchAllGroupInd,NString pUserId,NString pPersonnelId,NString pDataOrigin,Ref<NNumber> pIdOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_QUEUE_PARTICIPANT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_QPRT_CODE", pQprtCode);
			cmd.addParameter("@P_DATA_SOURCE_TYPE", pDataSourceType);
			cmd.addParameter("@P_CATCH_ALL_GROUP_IND", pCatchAllGroupInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PERSONNEL_ID", pPersonnelId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ID_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pIdOut.val = cmd.getParameterValue("@P_ID_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pCoasCode,NString pQprtCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_QUEUE_PARTICIPANT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_QPRT_CODE", pQprtCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pCoasCode,NString pQprtCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_QUEUE_PARTICIPANT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_QPRT_CODE", pQprtCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pCoasCode,NString pQprtCode,NString pDataSourceType,NString pCatchAllGroupInd,NString pUserId,NString pPersonnelId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_QUEUE_PARTICIPANT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_QPRT_CODE", pQprtCode);
			cmd.addParameter("@P_DATA_SOURCE_TYPE", pDataSourceType);
			cmd.addParameter("@P_CATCH_ALL_GROUP_IND", pCatchAllGroupInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PERSONNEL_ID", pPersonnelId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="QueueParticipantRecRow", dataSourceName="QUEUE_PARTICIPANT_REC")
	public static class QueueParticipantRecRow
	{
		@DbRecordField(dataSourceName="R_ID")
		public NNumber RId;
		@DbRecordField(dataSourceName="R_COAS_CODE")
		public NString RCoasCode;
		@DbRecordField(dataSourceName="R_QPRT_CODE")
		public NString RQprtCode;
		@DbRecordField(dataSourceName="R_DATA_SOURCE_TYPE")
		public NString RDataSourceType;
		@DbRecordField(dataSourceName="R_CATCH_ALL_GROUP_IND")
		public NString RCatchAllGroupInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_PERSONNEL_ID")
		public NString RPersonnelId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
