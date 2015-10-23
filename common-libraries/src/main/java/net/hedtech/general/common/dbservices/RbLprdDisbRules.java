package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbLprdDisbRules {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LPRD_DISB_RULES.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pLoanPeriod,NString pPeriod,NDate pDisburseDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LPRD_DISB_RULES.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LOAN_PERIOD", pLoanPeriod);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(LprdDisbRulesRecRow recOne,LprdDisbRulesRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LPRD_DISB_RULES.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, LprdDisbRulesRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, LprdDisbRulesRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pLoanPeriod,NString pPeriod,NDate pDisburseDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LPRD_DISB_RULES.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_LOAN_PERIOD", pLoanPeriod);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LPRD_DISB_RULES.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pLoanPeriod,NString pPeriod,NDate pDisburseDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LPRD_DISB_RULES.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_LOAN_PERIOD", pLoanPeriod);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pLoanPeriod,NString pPeriod,NDate pDisburseDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LPRD_DISB_RULES.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_LOAN_PERIOD", pLoanPeriod);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pLoanPeriod,NDate pDisburseDate,NString pPeriod,NNumber pLoanPct,NNumber pMemoExpDays,NDate pPnDisbDate,NString pUserId,NString pDataOrigin,NString pTermCode,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LPRD_DISB_RULES.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOAN_PERIOD", pLoanPeriod);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_LOAN_PCT", pLoanPct);
			cmd.addParameter("@P_MEMO_EXP_DAYS", pMemoExpDays);
			cmd.addParameter("@P_PN_DISB_DATE", pPnDisbDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pLoanPeriod,NString pPeriod,NDate pDisburseDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LPRD_DISB_RULES.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOAN_PERIOD", pLoanPeriod);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pLoanPeriod,NString pPeriod,NDate pDisburseDate,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LPRD_DISB_RULES.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOAN_PERIOD", pLoanPeriod);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pLoanPeriod,NDate pDisburseDate,NString pPeriod,NNumber pLoanPct,NNumber pMemoExpDays,NDate pPnDisbDate,NString pUserId,NString pDataOrigin,NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LPRD_DISB_RULES.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOAN_PERIOD", pLoanPeriod);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_LOAN_PCT", pLoanPct);
			cmd.addParameter("@P_MEMO_EXP_DAYS", pMemoExpDays);
			cmd.addParameter("@P_PN_DISB_DATE", pPnDisbDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="LprdDisbRulesRecRow", dataSourceName="LPRD_DISB_RULES_REC")
	public static class LprdDisbRulesRecRow
	{
		@DbRecordField(dataSourceName="R_LOAN_PERIOD")
		public NString RLoanPeriod;
		@DbRecordField(dataSourceName="R_DISBURSE_DATE")
		public NDate RDisburseDate;
		@DbRecordField(dataSourceName="R_PERIOD")
		public NString RPeriod;
		@DbRecordField(dataSourceName="R_LOAN_PCT")
		public NNumber RLoanPct;
		@DbRecordField(dataSourceName="R_MEMO_EXP_DAYS")
		public NNumber RMemoExpDays;
		@DbRecordField(dataSourceName="R_PN_DISB_DATE")
		public NDate RPnDisbDate;
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
