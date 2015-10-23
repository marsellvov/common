package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbWlNotification {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_NOTIFICATION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTermCode,NString pCrn,NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_NOTIFICATION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(WlNotificationRecRow recOne,WlNotificationRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_NOTIFICATION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, WlNotificationRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, WlNotificationRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTermCode,NString pCrn,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_NOTIFICATION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_NOTIFICATION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTermCode,NString pCrn,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_NOTIFICATION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTermCode,NString pCrn,NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_NOTIFICATION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTermCode,NString pCrn,NNumber pPidm,NString pUserId,NDate pStartDate,NDate pEndDate,NNumber pWlPriority,NString pRegConfStat,NString pDataOrigin,NString pErrorStatus,NNumber pErrorCount,NString pLastErrorMessage,NDate pLastErrorDate,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_NOTIFICATION.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_WL_PRIORITY", pWlPriority);
			cmd.addParameter("@P_REG_CONF_STAT", pRegConfStat);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ERROR_STATUS", pErrorStatus);
			cmd.addParameter("@P_ERROR_COUNT", pErrorCount);
			cmd.addParameter("@P_LAST_ERROR_MESSAGE", pLastErrorMessage);
			cmd.addParameter("@P_LAST_ERROR_DATE", pLastErrorDate);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTermCode,NString pCrn,NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_NOTIFICATION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTermCode,NString pCrn,NNumber pPidm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_NOTIFICATION.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTermCode,NString pCrn,NNumber pPidm,NString pUserId,NDate pStartDate,NDate pEndDate,NNumber pWlPriority,NString pRegConfStat,NString pDataOrigin,NString pErrorStatus,NNumber pErrorCount,NString pLastErrorMessage,NDate pLastErrorDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_WL_NOTIFICATION.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_WL_PRIORITY", pWlPriority);
			cmd.addParameter("@P_REG_CONF_STAT", pRegConfStat);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ERROR_STATUS", pErrorStatus);
			cmd.addParameter("@P_ERROR_COUNT", pErrorCount);
			cmd.addParameter("@P_LAST_ERROR_MESSAGE", pLastErrorMessage);
			cmd.addParameter("@P_LAST_ERROR_DATE", pLastErrorDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="WlNotificationRecRow", dataSourceName="WL_NOTIFICATION_REC")
	public static class WlNotificationRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_CRN")
		public NString RCrn;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_START_DATE")
		public NDate RStartDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_WL_PRIORITY")
		public NNumber RWlPriority;
		@DbRecordField(dataSourceName="R_REG_CONF_STAT")
		public NString RRegConfStat;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_ERROR_STATUS")
		public NString RErrorStatus;
		@DbRecordField(dataSourceName="R_ERROR_COUNT")
		public NNumber RErrorCount;
		@DbRecordField(dataSourceName="R_LAST_ERROR_MESSAGE")
		public NString RLastErrorMessage;
		@DbRecordField(dataSourceName="R_LAST_ERROR_DATE")
		public NDate RLastErrorDate;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
