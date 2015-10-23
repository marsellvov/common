package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FtbStatushistory {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_STATUSHISTORY.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_STATUSHISTORY.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString fIsequal(FtrrsthsRecRow recOne,FtrrsthsRecRow recTwo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_STATUSHISTORY.F_ISEQUAL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FtrrsthsRecRow.class ));
//			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FtrrsthsRecRow.class ));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static DataCursor fQueryAll(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_STATUSHISTORY.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_STATUSHISTORY.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_STATUSHISTORY.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_STATUSHISTORY.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pId,NString pDataOrigin,NString pUserId,NString pMessage,NString pStatus,NDate pStatusDate,NNumber pFtrbauthId,NNumber pFtrbrembId,NNumber pFtrbadvcId,NNumber pFtrbadvrId,NString pAdvanceStatus,NDate pAdvanceStatusDate,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_STATUSHISTORY.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_STATUS_DATE", pStatusDate);
			cmd.addParameter("@P_FTRBAUTH_ID", pFtrbauthId);
			cmd.addParameter("@P_FTRBREMB_ID", pFtrbrembId);
			cmd.addParameter("@P_FTRBADVC_ID", pFtrbadvcId);
			cmd.addParameter("@P_FTRBADVR_ID", pFtrbadvrId);
			cmd.addParameter("@P_ADVANCE_STATUS", pAdvanceStatus);
			cmd.addParameter("@P_ADVANCE_STATUS_DATE", pAdvanceStatusDate);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_STATUSHISTORY.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pId,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_STATUSHISTORY.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pId,NString pDataOrigin,NDate pActivityDate,NString pUserId,NString pMessage,NString pStatus,NDate pStatusDate,NNumber pFtrbauthId,NNumber pFtrbrembId,NNumber pFtrbadvcId,NNumber pFtrbadvrId,NString pAdvanceStatus,NDate pAdvanceStatusDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTB_STATUSHISTORY.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_STATUS_DATE", pStatusDate);
			cmd.addParameter("@P_FTRBAUTH_ID", pFtrbauthId);
			cmd.addParameter("@P_FTRBREMB_ID", pFtrbrembId);
			cmd.addParameter("@P_FTRBADVC_ID", pFtrbadvcId);
			cmd.addParameter("@P_FTRBADVR_ID", pFtrbadvrId);
			cmd.addParameter("@P_ADVANCE_STATUS", pAdvanceStatus);
			cmd.addParameter("@P_ADVANCE_STATUS_DATE", pAdvanceStatusDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FtrrsthsRecRow", dataSourceName="FTRRSTHS_REC")
	public static class FtrrsthsRecRow
	{
		@DbRecordField(dataSourceName="R_ID")
		public NNumber RId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
//		@DbRecordField(dataSourceName="R_ACTIVITY_DATE")
//		public UnknownTypes.Timestamp RActivityDate;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_MESSAGE")
		public NString RMessage;
		@DbRecordField(dataSourceName="R_STATUS")
		public NString RStatus;
//		@DbRecordField(dataSourceName="R_STATUS_DATE")
//		public UnknownTypes.Timestamp RStatusDate;
		@DbRecordField(dataSourceName="R_FTRBAUTH_ID")
		public NNumber RFtrbauthId;
		@DbRecordField(dataSourceName="R_FTRBREMB_ID")
		public NNumber RFtrbrembId;
		@DbRecordField(dataSourceName="R_FTRBADVC_ID")
		public NNumber RFtrbadvcId;
		@DbRecordField(dataSourceName="R_FTRBADVR_ID")
		public NNumber RFtrbadvrId;
		@DbRecordField(dataSourceName="R_ADVANCE_STATUS")
		public NString RAdvanceStatus;
//		@DbRecordField(dataSourceName="R_ADVANCE_STATUS_DATE")
//		public UnknownTypes.Timestamp RAdvanceStatusDate;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
