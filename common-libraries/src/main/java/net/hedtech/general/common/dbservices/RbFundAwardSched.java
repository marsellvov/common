package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbFundAwardSched {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_AWARD_SCHED.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NString pAprdCode,NString pFundCode,NString pPeriod,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_AWARD_SCHED.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FundAwardSchedRecRow recOne,FundAwardSchedRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_AWARD_SCHED.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FundAwardSchedRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FundAwardSchedRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NString pAprdCode,NString pFundCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_AWARD_SCHED.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_AWARD_SCHED.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NString pAprdCode,NString pFundCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_AWARD_SCHED.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NString pAprdCode,NString pFundCode,NString pPeriod,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_AWARD_SCHED.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NString pAprdCode,NString pFundCode,NString pPeriod,NNumber pAwardPct,NDate pMemoExpDate,NNumber pPellAwardPct,NString pUserId,NString pDataOrigin,NString pTermCode,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_AWARD_SCHED.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_AWARD_PCT", pAwardPct);
			cmd.addParameter("@P_MEMO_EXP_DATE", pMemoExpDate);
			cmd.addParameter("@P_PELL_AWARD_PCT", pPellAwardPct);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pAidyCode,NString pAprdCode,NString pFundCode,NString pPeriod,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_AWARD_SCHED.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pAidyCode,NString pAprdCode,NString pFundCode,NString pPeriod,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_AWARD_SCHED.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NString pAprdCode,NString pFundCode,NString pPeriod,NNumber pAwardPct,NDate pMemoExpDate,NNumber pPellAwardPct,NString pUserId,NString pDataOrigin,NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FUND_AWARD_SCHED.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_AWARD_PCT", pAwardPct);
			cmd.addParameter("@P_MEMO_EXP_DATE", pMemoExpDate);
			cmd.addParameter("@P_PELL_AWARD_PCT", pPellAwardPct);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FundAwardSchedRecRow", dataSourceName="FUND_AWARD_SCHED_REC")
	public static class FundAwardSchedRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_APRD_CODE")
		public NString RAprdCode;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_PERIOD")
		public NString RPeriod;
		@DbRecordField(dataSourceName="R_AWARD_PCT")
		public NNumber RAwardPct;
		@DbRecordField(dataSourceName="R_MEMO_EXP_DATE")
		public NDate RMemoExpDate;
		@DbRecordField(dataSourceName="R_PELL_AWARD_PCT")
		public NNumber RPellAwardPct;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
