package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbConfigSubsLeave {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CONFIG_SUBS_LEAVE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CONFIG_SUBS_LEAVE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ConfigSubsLeaveRecRow recOne,ConfigSubsLeaveRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CONFIG_SUBS_LEAVE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ConfigSubsLeaveRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ConfigSubsLeaveRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEarnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CONFIG_SUBS_LEAVE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CONFIG_SUBS_LEAVE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEarnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CONFIG_SUBS_LEAVE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CONFIG_SUBS_LEAVE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEarnCode,NNumber pNumSal,NString pSlreCode,NString pAssocEarnCode,NNumber pMaxDaysBenefits,NNumber pMaxPctgGrsPay,NString pUserId,NString pDataOrigin,NNumber pDaysNotSubsidized,NNumber pMonthsWSubsLeav,NString pInstEarnCode,NString pPayAlgInd,NString pCalendarYearInd,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CONFIG_SUBS_LEAVE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_NUM_SAL", pNumSal);
			cmd.addParameter("@P_SLRE_CODE", pSlreCode);
			cmd.addParameter("@P_ASSOC_EARN_CODE", pAssocEarnCode);
			cmd.addParameter("@P_MAX_DAYS_BENEFITS", pMaxDaysBenefits);
			cmd.addParameter("@P_MAX_PCTG_GRS_PAY", pMaxPctgGrsPay);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_DAYS_NOT_SUBSIDIZED", pDaysNotSubsidized);
			cmd.addParameter("@P_MONTHS_W_SUBS_LEAV", pMonthsWSubsLeav);
			cmd.addParameter("@P_INST_EARN_CODE", pInstEarnCode);
			cmd.addParameter("@P_PAY_ALG_IND", pPayAlgInd);
			cmd.addParameter("@P_CALENDAR_YEAR_IND", pCalendarYearInd);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CONFIG_SUBS_LEAVE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pEarnCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CONFIG_SUBS_LEAVE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEarnCode,NNumber pNumSal,NString pSlreCode,NString pAssocEarnCode,NNumber pMaxDaysBenefits,NNumber pMaxPctgGrsPay,NString pUserId,NString pDataOrigin,NNumber pDaysNotSubsidized,NNumber pMonthsWSubsLeav,NString pInstEarnCode,NString pPayAlgInd,NString pCalendarYearInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CONFIG_SUBS_LEAVE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_NUM_SAL", pNumSal);
			cmd.addParameter("@P_SLRE_CODE", pSlreCode);
			cmd.addParameter("@P_ASSOC_EARN_CODE", pAssocEarnCode);
			cmd.addParameter("@P_MAX_DAYS_BENEFITS", pMaxDaysBenefits);
			cmd.addParameter("@P_MAX_PCTG_GRS_PAY", pMaxPctgGrsPay);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_DAYS_NOT_SUBSIDIZED", pDaysNotSubsidized);
			cmd.addParameter("@P_MONTHS_W_SUBS_LEAV", pMonthsWSubsLeav);
			cmd.addParameter("@P_INST_EARN_CODE", pInstEarnCode);
			cmd.addParameter("@P_PAY_ALG_IND", pPayAlgInd);
			cmd.addParameter("@P_CALENDAR_YEAR_IND", pCalendarYearInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="ConfigSubsLeaveRecRow", dataSourceName="CONFIG_SUBS_LEAVE_REC", needsInitialization=true)
	public static class ConfigSubsLeaveRecRow
	{
		@DbRecordField(dataSourceName="R_EARN_CODE")
		public NString REarnCode;
		@DbRecordField(dataSourceName="R_NUM_SAL")
		public NNumber RNumSal;
		@DbRecordField(dataSourceName="R_SLRE_CODE")
		public NString RSlreCode;
		@DbRecordField(dataSourceName="R_ASSOC_EARN_CODE")
		public NString RAssocEarnCode;
		@DbRecordField(dataSourceName="R_MAX_DAYS_BENEFITS")
		public NNumber RMaxDaysBenefits;
		@DbRecordField(dataSourceName="R_MAX_PCTG_GRS_PAY")
		public NNumber RMaxPctgGrsPay;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_DAYS_NOT_SUBSIDIZED")
		public NNumber RDaysNotSubsidized;
		@DbRecordField(dataSourceName="R_MONTHS_W_SUBS_LEAV")
		public NNumber RMonthsWSubsLeav;
		@DbRecordField(dataSourceName="R_INST_EARN_CODE")
		public NString RInstEarnCode;
		@DbRecordField(dataSourceName="R_PAY_ALG_IND")
		public NString RPayAlgInd;
		@DbRecordField(dataSourceName="R_CALENDAR_YEAR_IND")
		public NString RCalendarYearInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
