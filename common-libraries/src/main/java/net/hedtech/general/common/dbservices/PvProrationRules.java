package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvProrationRules {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ProrationRulesRecRow recOne,ProrationRulesRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ProrationRulesRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ProrationRulesRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEarnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEarnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEarnCode,NString pProrateUnitsInd,NString pProrateInd,NNumber pMonthsToConsider,NString pProrateMore100Ind,NString pCalendaryearInd,NString pTerminatedInd,NString pLeaveWopWobInd,NString pLeaveWopWbInd,NString pLeaveWppInd,NString pLeaveWfpInd,NString pSaturdaysInd,NString pSundaysInd,NString pHolidaysInd,NNumber pSenMonthsFrom,NNumber pSenMonthsTo,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_PRORATE_UNITS_IND", pProrateUnitsInd);
			cmd.addParameter("@P_PRORATE_IND", pProrateInd);
			cmd.addParameter("@P_MONTHS_TO_CONSIDER", pMonthsToConsider);
			cmd.addParameter("@P_PRORATE_MORE_100_IND", pProrateMore100Ind);
			cmd.addParameter("@P_CALENDARYEAR_IND", pCalendaryearInd);
			cmd.addParameter("@P_TERMINATED_IND", pTerminatedInd);
			cmd.addParameter("@P_LEAVE_WOP_WOB_IND", pLeaveWopWobInd);
			cmd.addParameter("@P_LEAVE_WOP_WB_IND", pLeaveWopWbInd);
			cmd.addParameter("@P_LEAVE_WPP_IND", pLeaveWppInd);
			cmd.addParameter("@P_LEAVE_WFP_IND", pLeaveWfpInd);
			cmd.addParameter("@P_SATURDAYS_IND", pSaturdaysInd);
			cmd.addParameter("@P_SUNDAYS_IND", pSundaysInd);
			cmd.addParameter("@P_HOLIDAYS_IND", pHolidaysInd);
			cmd.addParameter("@P_SEN_MONTHS_FROM", pSenMonthsFrom);
			cmd.addParameter("@P_SEN_MONTHS_TO", pSenMonthsTo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pEarnCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEarnCode,NString pProrateUnitsInd,NString pProrateInd,NNumber pMonthsToConsider,NString pProrateMore100Ind,NString pCalendaryearInd,NString pTerminatedInd,NString pLeaveWopWobInd,NString pLeaveWopWbInd,NString pLeaveWppInd,NString pLeaveWfpInd,NString pSaturdaysInd,NString pSundaysInd,NString pHolidaysInd,NNumber pSenMonthsFrom,NNumber pSenMonthsTo,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PRORATION_RULES.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_PRORATE_UNITS_IND", pProrateUnitsInd);
			cmd.addParameter("@P_PRORATE_IND", pProrateInd);
			cmd.addParameter("@P_MONTHS_TO_CONSIDER", pMonthsToConsider);
			cmd.addParameter("@P_PRORATE_MORE_100_IND", pProrateMore100Ind);
			cmd.addParameter("@P_CALENDARYEAR_IND", pCalendaryearInd);
			cmd.addParameter("@P_TERMINATED_IND", pTerminatedInd);
			cmd.addParameter("@P_LEAVE_WOP_WOB_IND", pLeaveWopWobInd);
			cmd.addParameter("@P_LEAVE_WOP_WB_IND", pLeaveWopWbInd);
			cmd.addParameter("@P_LEAVE_WPP_IND", pLeaveWppInd);
			cmd.addParameter("@P_LEAVE_WFP_IND", pLeaveWfpInd);
			cmd.addParameter("@P_SATURDAYS_IND", pSaturdaysInd);
			cmd.addParameter("@P_SUNDAYS_IND", pSundaysInd);
			cmd.addParameter("@P_HOLIDAYS_IND", pHolidaysInd);
			cmd.addParameter("@P_SEN_MONTHS_FROM", pSenMonthsFrom);
			cmd.addParameter("@P_SEN_MONTHS_TO", pSenMonthsTo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="ProrationRulesRecRow", dataSourceName="PRORATION_RULES_REC", needsInitialization=true)
	public static class ProrationRulesRecRow
	{
		@DbRecordField(dataSourceName="R_EARN_CODE")
		public NString REarnCode;
		@DbRecordField(dataSourceName="R_PRORATE_UNITS_IND")
		public NString RProrateUnitsInd;
		@DbRecordField(dataSourceName="R_PRORATE_IND")
		public NString RProrateInd;
		@DbRecordField(dataSourceName="R_MONTHS_TO_CONSIDER")
		public NNumber RMonthsToConsider;
		@DbRecordField(dataSourceName="R_PRORATE_MORE_100_IND")
		public NString RProrateMore100Ind;
		@DbRecordField(dataSourceName="R_CALENDARYEAR_IND")
		public NString RCalendaryearInd;
		@DbRecordField(dataSourceName="R_TERMINATED_IND")
		public NString RTerminatedInd;
		@DbRecordField(dataSourceName="R_LEAVE_WOP_WOB_IND")
		public NString RLeaveWopWobInd;
		@DbRecordField(dataSourceName="R_LEAVE_WOP_WB_IND")
		public NString RLeaveWopWbInd;
		@DbRecordField(dataSourceName="R_LEAVE_WPP_IND")
		public NString RLeaveWppInd;
		@DbRecordField(dataSourceName="R_LEAVE_WFP_IND")
		public NString RLeaveWfpInd;
		@DbRecordField(dataSourceName="R_SATURDAYS_IND")
		public NString RSaturdaysInd;
		@DbRecordField(dataSourceName="R_SUNDAYS_IND")
		public NString RSundaysInd;
		@DbRecordField(dataSourceName="R_HOLIDAYS_IND")
		public NString RHolidaysInd;
		@DbRecordField(dataSourceName="R_SEN_MONTHS_FROM")
		public NNumber RSenMonthsFrom;
		@DbRecordField(dataSourceName="R_SEN_MONTHS_TO")
		public NNumber RSenMonthsTo;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
