package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbCirculationNotice {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_NOTICE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_NOTICE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString fIsequal(CirculationNoticeRecRow recOne,CirculationNoticeRecRow recTwo) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_NOTICE.F_ISEQUAL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CirculationNoticeRecRow.class ));
//			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CirculationNoticeRecRow.class ));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static DataCursor fQueryAll(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_NOTICE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByForcirrId(NNumber pForcirrId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_NOTICE.F_QUERY_BY_FORCIRR_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FORCIRR_ID", pForcirrId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_NOTICE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_NOTICE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_NOTICE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(Ref<NNumber> pId,NString pStatus,NDate pStatusDate,NNumber pForcirrId,NString pUserId,NString pResolvedInd,NString pDataOrigin,NString pComment,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_NOTICE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", NNumber.class);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_STATUS_DATE", pStatusDate);
			cmd.addParameter("@P_FORCIRR_ID", pForcirrId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_RESOLVED_IND", pResolvedInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pId.val = cmd.getParameterValue("@P_ID", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_NOTICE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteByForcirrId(NNumber pForcirrId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_NOTICE.P_DELETE_BY_FORCIRR_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FORCIRR_ID", pForcirrId);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pId,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_NOTICE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pId,NString pStatus,NDate pStatusDate,NNumber pForcirrId,NString pUserId,NString pResolvedInd,NString pDataOrigin,NString pComment,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_NOTICE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_STATUS_DATE", pStatusDate);
			cmd.addParameter("@P_FORCIRR_ID", pForcirrId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_RESOLVED_IND", pResolvedInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CirculationNoticeRecRow", dataSourceName="CIRCULATION_NOTICE_REC")
	public static class CirculationNoticeRecRow
	{
		@DbRecordField(dataSourceName="R_ID")
		public NNumber RId;
		@DbRecordField(dataSourceName="R_STATUS")
		public NString RStatus;
//		@DbRecordField(dataSourceName="R_STATUS_DATE")
//		public UnknownTypes.Timestamp RStatusDate;
		@DbRecordField(dataSourceName="R_FORCIRR_ID")
		public NNumber RForcirrId;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_RESOLVED_IND")
		public NString RResolvedInd;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_COMMENT")
		public NString RComment;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
