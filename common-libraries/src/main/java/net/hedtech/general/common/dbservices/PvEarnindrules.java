package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvEarnindrules {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EARNINDRULES.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EARNINDRULES.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EarnindrulesRecRow recOne,EarnindrulesRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EARNINDRULES.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EarnindrulesRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EarnindrulesRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEarnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EARNINDRULES.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EARNINDRULES.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEarnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EARNINDRULES.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EARNINDRULES.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEarnCode,NString pLeaveWopWobInd,NString pLeaveWopWbInd,NString pLeaveWppInd,NString pLeaveWfpInd,NString pHolidaysInd,NString pSaturdaysInd,NString pSundaysInd,NString pUserId,NString pDataOrigin,NString pPayHolidaysInd,NString pDockPayInd,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EARNINDRULES.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_LEAVE_WOP_WOB_IND", pLeaveWopWobInd);
			cmd.addParameter("@P_LEAVE_WOP_WB_IND", pLeaveWopWbInd);
			cmd.addParameter("@P_LEAVE_WPP_IND", pLeaveWppInd);
			cmd.addParameter("@P_LEAVE_WFP_IND", pLeaveWfpInd);
			cmd.addParameter("@P_HOLIDAYS_IND", pHolidaysInd);
			cmd.addParameter("@P_SATURDAYS_IND", pSaturdaysInd);
			cmd.addParameter("@P_SUNDAYS_IND", pSundaysInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PAY_HOLIDAYS_IND", pPayHolidaysInd);
			cmd.addParameter("@P_DOCK_PAY_IND", pDockPayInd);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EARNINDRULES.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pEarnCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EARNINDRULES.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEarnCode,NString pLeaveWopWobInd,NString pLeaveWopWbInd,NString pLeaveWppInd,NString pLeaveWfpInd,NString pHolidaysInd,NString pSaturdaysInd,NString pSundaysInd,NString pUserId,NString pDataOrigin,NString pPayHolidaysInd,NString pDockPayInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EARNINDRULES.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_LEAVE_WOP_WOB_IND", pLeaveWopWobInd);
			cmd.addParameter("@P_LEAVE_WOP_WB_IND", pLeaveWopWbInd);
			cmd.addParameter("@P_LEAVE_WPP_IND", pLeaveWppInd);
			cmd.addParameter("@P_LEAVE_WFP_IND", pLeaveWfpInd);
			cmd.addParameter("@P_HOLIDAYS_IND", pHolidaysInd);
			cmd.addParameter("@P_SATURDAYS_IND", pSaturdaysInd);
			cmd.addParameter("@P_SUNDAYS_IND", pSundaysInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PAY_HOLIDAYS_IND", pPayHolidaysInd);
			cmd.addParameter("@P_DOCK_PAY_IND", pDockPayInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="EarnindrulesRecRow", dataSourceName="EARNINDRULES_REC", needsInitialization=true)
	public static class EarnindrulesRecRow
	{
		@DbRecordField(dataSourceName="R_EARN_CODE")
		public NString REarnCode;
		@DbRecordField(dataSourceName="R_LEAVE_WOP_WOB_IND")
		public NString RLeaveWopWobInd;
		@DbRecordField(dataSourceName="R_LEAVE_WOP_WB_IND")
		public NString RLeaveWopWbInd;
		@DbRecordField(dataSourceName="R_LEAVE_WPP_IND")
		public NString RLeaveWppInd;
		@DbRecordField(dataSourceName="R_LEAVE_WFP_IND")
		public NString RLeaveWfpInd;
		@DbRecordField(dataSourceName="R_HOLIDAYS_IND")
		public NString RHolidaysInd;
		@DbRecordField(dataSourceName="R_SATURDAYS_IND")
		public NString RSaturdaysInd;
		@DbRecordField(dataSourceName="R_SUNDAYS_IND")
		public NString RSundaysInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_PAY_HOLIDAYS_IND")
		public NString RPayHolidaysInd;
		@DbRecordField(dataSourceName="R_DOCK_PAY_IND")
		public NString RDockPayInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
