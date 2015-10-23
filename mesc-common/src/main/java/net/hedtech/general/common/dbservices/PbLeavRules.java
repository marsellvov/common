package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbLeavRules {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_LEAV_RULES.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pLcatCode,NString pLeavCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_LEAV_RULES.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(LeavRulesRecRow recOne,LeavRulesRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_LEAV_RULES.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, LeavRulesRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, LeavRulesRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pLcatCode,NString pLeavCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_LEAV_RULES.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_LEAV_RULES.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pLcatCode,NString pLeavCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_LEAV_RULES.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pLcatCode,NString pLeavCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_LEAV_RULES.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pLcatCode,NString pLeavCode,NString pQueueCode,NString pAccess,NNumber pMinLeav,NNumber pMaxLeav,NString pLimitType,NNumber pMaxLimit,NString pEmpCancel,NString pEmpReturn,NString pAllowAdv,NString pSex,NString pMartlCode,NNumber pNumMonths,NString pPayrollUpd,NString pEarnCode,NString pUserId,NString pDataOrigin,NString pIncWeekEnd,NString pIncHoliday,NString pAllowWeholStart,NString pEmpPartLeav,NString pAllowDoc,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_LEAV_RULES.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
			cmd.addParameter("@P_QUEUE_CODE", pQueueCode);
			cmd.addParameter("@P_ACCESS", pAccess);
			cmd.addParameter("@P_MIN_LEAV", pMinLeav);
			cmd.addParameter("@P_MAX_LEAV", pMaxLeav);
			cmd.addParameter("@P_LIMIT_TYPE", pLimitType);
			cmd.addParameter("@P_MAX_LIMIT", pMaxLimit);
			cmd.addParameter("@P_EMP_CANCEL", pEmpCancel);
			cmd.addParameter("@P_EMP_RETURN", pEmpReturn);
			cmd.addParameter("@P_ALLOW_ADV", pAllowAdv);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_MARTL_CODE", pMartlCode);
			cmd.addParameter("@P_NUM_MONTHS", pNumMonths);
			cmd.addParameter("@P_PAYROLL_UPD", pPayrollUpd);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INC_WEEK_END", pIncWeekEnd);
			cmd.addParameter("@P_INC_HOLIDAY", pIncHoliday);
			cmd.addParameter("@P_ALLOW_WEHOL_START", pAllowWeholStart);
			cmd.addParameter("@P_EMP_PART_LEAV", pEmpPartLeav);
			cmd.addParameter("@P_ALLOW_DOC", pAllowDoc);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pLcatCode,NString pLeavCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_LEAV_RULES.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pLcatCode,NString pLeavCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_LEAV_RULES.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pLcatCode,NString pLeavCode,NString pQueueCode,NString pAccess,NNumber pMinLeav,NNumber pMaxLeav,NString pLimitType,NNumber pMaxLimit,NString pEmpCancel,NString pEmpReturn,NString pAllowAdv,NString pSex,NString pMartlCode,NNumber pNumMonths,NString pPayrollUpd,NString pEarnCode,NString pUserId,NString pDataOrigin,NString pIncWeekEnd,NString pIncHoliday,NString pAllowWeholStart,NString pEmpPartLeav,NString pAllowDoc,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_LEAV_RULES.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
			cmd.addParameter("@P_QUEUE_CODE", pQueueCode);
			cmd.addParameter("@P_ACCESS", pAccess);
			cmd.addParameter("@P_MIN_LEAV", pMinLeav);
			cmd.addParameter("@P_MAX_LEAV", pMaxLeav);
			cmd.addParameter("@P_LIMIT_TYPE", pLimitType);
			cmd.addParameter("@P_MAX_LIMIT", pMaxLimit);
			cmd.addParameter("@P_EMP_CANCEL", pEmpCancel);
			cmd.addParameter("@P_EMP_RETURN", pEmpReturn);
			cmd.addParameter("@P_ALLOW_ADV", pAllowAdv);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_MARTL_CODE", pMartlCode);
			cmd.addParameter("@P_NUM_MONTHS", pNumMonths);
			cmd.addParameter("@P_PAYROLL_UPD", pPayrollUpd);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INC_WEEK_END", pIncWeekEnd);
			cmd.addParameter("@P_INC_HOLIDAY", pIncHoliday);
			cmd.addParameter("@P_ALLOW_WEHOL_START", pAllowWeholStart);
			cmd.addParameter("@P_EMP_PART_LEAV", pEmpPartLeav);
			cmd.addParameter("@P_ALLOW_DOC", pAllowDoc);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="LeavRulesRecRow", dataSourceName="LEAV_RULES_REC")
	public static class LeavRulesRecRow
	{
		@DbRecordField(dataSourceName="R_LCAT_CODE")
		public NString RLcatCode;
		@DbRecordField(dataSourceName="R_LEAV_CODE")
		public NString RLeavCode;
		@DbRecordField(dataSourceName="R_QUEUE_CODE")
		public NString RQueueCode;
		@DbRecordField(dataSourceName="R_ACCESS")
		public NString RAccess;
		@DbRecordField(dataSourceName="R_MIN_LEAV")
		public NNumber RMinLeav;
		@DbRecordField(dataSourceName="R_MAX_LEAV")
		public NNumber RMaxLeav;
		@DbRecordField(dataSourceName="R_LIMIT_TYPE")
		public NString RLimitType;
		@DbRecordField(dataSourceName="R_MAX_LIMIT")
		public NNumber RMaxLimit;
		@DbRecordField(dataSourceName="R_EMP_CANCEL")
		public NString REmpCancel;
		@DbRecordField(dataSourceName="R_EMP_RETURN")
		public NString REmpReturn;
		@DbRecordField(dataSourceName="R_ALLOW_ADV")
		public NString RAllowAdv;
		@DbRecordField(dataSourceName="R_SEX")
		public NString RSex;
		@DbRecordField(dataSourceName="R_MARTL_CODE")
		public NString RMartlCode;
		@DbRecordField(dataSourceName="R_NUM_MONTHS")
		public NNumber RNumMonths;
		@DbRecordField(dataSourceName="R_PAYROLL_UPD")
		public NString RPayrollUpd;
		@DbRecordField(dataSourceName="R_EARN_CODE")
		public NString REarnCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INC_WEEK_END")
		public NString RIncWeekEnd;
		@DbRecordField(dataSourceName="R_INC_HOLIDAY")
		public NString RIncHoliday;
		@DbRecordField(dataSourceName="R_ALLOW_WEHOL_START")
		public NString RAllowWeholStart;
		@DbRecordField(dataSourceName="R_EMP_PART_LEAV")
		public NString REmpPartLeav;
		@DbRecordField(dataSourceName="R_ALLOW_DOC")
		public NString RAllowDoc;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
