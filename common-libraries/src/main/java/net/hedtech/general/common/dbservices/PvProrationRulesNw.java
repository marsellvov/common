package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvProrationRulesNw {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES_NW.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pEarnCode,NString pNotWorkedEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES_NW.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_NOT_WORKED_EARN_CODE", pNotWorkedEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ProrationRulesNwRecRow recOne,ProrationRulesNwRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES_NW.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ProrationRulesNwRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ProrationRulesNwRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEarnCode,NString pNotWorkedEarnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES_NW.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_NOT_WORKED_EARN_CODE", pNotWorkedEarnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES_NW.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEarnCode,NString pNotWorkedEarnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES_NW.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_NOT_WORKED_EARN_CODE", pNotWorkedEarnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEarnCode,NString pNotWorkedEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES_NW.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_NOT_WORKED_EARN_CODE", pNotWorkedEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEarnCode,NString pNotWorkedEarnCode,NString pDaysHrsInd,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES_NW.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_NOT_WORKED_EARN_CODE", pNotWorkedEarnCode);
			cmd.addParameter("@P_DAYS_HRS_IND", pDaysHrsInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pEarnCode,NString pNotWorkedEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES_NW.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_NOT_WORKED_EARN_CODE", pNotWorkedEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pEarnCode,NString pNotWorkedEarnCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES_NW.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_NOT_WORKED_EARN_CODE", pNotWorkedEarnCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEarnCode,NString pNotWorkedEarnCode,NString pDaysHrsInd,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES_NW.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_NOT_WORKED_EARN_CODE", pNotWorkedEarnCode);
			cmd.addParameter("@P_DAYS_HRS_IND", pDaysHrsInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="ProrationRulesNwRecRow", dataSourceName="PRORATION_RULES_NW_REC", needsInitialization=true)
	public static class ProrationRulesNwRecRow
	{
		@DbRecordField(dataSourceName="R_EARN_CODE")
		public NString REarnCode;
		@DbRecordField(dataSourceName="R_NOT_WORKED_EARN_CODE")
		public NString RNotWorkedEarnCode;
		@DbRecordField(dataSourceName="R_DAYS_HRS_IND")
		public NString RDaysHrsInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
