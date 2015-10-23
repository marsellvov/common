package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfcbref {
		public static DataCursor fFinalertSum(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFCBREF.F_FINALERT_SUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fFinalertTotal(NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFCBREF.F_FINALERT_TOTAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fFingrants(NNumber pPidm,NNumber pNodays) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFCBREF.F_FINGRANTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_NODAYS", pNodays);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static BudgetStatusRecRow fGetBudgetStatus(NString chartCode,NString fundCode,NString orgnCode,NDate asOfDate,NString userid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFCBREF.F_GET_BUDGET_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(BudgetStatusRecRow.class));
			cmd.addParameter("@CHART_CODE", chartCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@AS_OF_DATE", asOfDate);
			cmd.addParameter("@USERID", userid);
				
			cmd.execute();

			return cmd.getReturnValue(BudgetStatusRecRow.class);

		}
		
	
	
	@DbRecordType(id="BudgetStatusRecRow", dataSourceName="BUDGET_STATUS_REC")
	public static class BudgetStatusRecRow
	{
		@DbRecordField(dataSourceName="CHART")
		public NString Chart;
		@DbRecordField(dataSourceName="FISCAL_YEAR")
		public NString FiscalYear;
		@DbRecordField(dataSourceName="FUND")
		public NString Fund;
		@DbRecordField(dataSourceName="ORGANIZATION")
		public NString Organization;
		@DbRecordField(dataSourceName="TOTAL_BUDGET")
		public NNumber TotalBudget;
		@DbRecordField(dataSourceName="TOTAL_SPENT")
		public NNumber TotalSpent;
		@DbRecordField(dataSourceName="AVAILABLE_BALANCE")
		public NNumber AvailableBalance;
		@DbRecordField(dataSourceName="PERCENT_SPENT")
		public NNumber PercentSpent;
		@DbRecordField(dataSourceName="PERCENT_REMAINING")
		public NNumber PercentRemaining;
	}

	
	@DbRecordType(id="FinalertRecSumRow", dataSourceName="FINALERT_REC_SUM")
	public static class FinalertRecSumRow
	{
		@DbRecordField(dataSourceName="R_DOC_NUM")
		public NString RDocNum;
		@DbRecordField(dataSourceName="R_DOC_DESC")
		public NString RDocDesc;
		@DbRecordField(dataSourceName="R_COUNT")
		public NNumber RCount;
	}

	
	@DbRecordType(id="FinalertRecTotalRow", dataSourceName="FINALERT_REC_TOTAL")
	public static class FinalertRecTotalRow
	{
		@DbRecordField(dataSourceName="R_COUNT")
		public NNumber RCount;
	}

	
	@DbRecordType(id="FingrantsRecRow", dataSourceName="FINGRANTS_REC")
	public static class FingrantsRecRow
	{
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
		@DbRecordField(dataSourceName="R_TITLE")
		public NString RTitle;
		@DbRecordField(dataSourceName="R_AGENCY_TITLE")
		public NString RAgencyTitle;
		@DbRecordField(dataSourceName="R_START_DATE")
		public NString RStartDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NString REndDate;
	}

	
	
}
