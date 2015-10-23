package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbChartOfAccounts {
		public static NString fCurrentVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CHART_OF_ACCOUNTS.F_CURRENT_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fExists(NString pCode,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CHART_OF_ACCOUNTS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fExistsActive(NString pCode,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CHART_OF_ACCOUNTS.F_EXISTS_ACTIVE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static DataCursor fQueryAll(NDate pEffDate,NString pStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CHART_OF_ACCOUNTS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_STATUS", pStatus);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCode,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CHART_OF_ACCOUNTS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
	
	
	@DbRecordType(id="CoasRecRow", dataSourceName="COAS_REC")
	public static class CoasRecRow
	{
		@DbRecordField(dataSourceName="COAS_CODE")
		public NString CoasCode;
		@DbRecordField(dataSourceName="EFF_DATE")
		public NDate EffDate;
		@DbRecordField(dataSourceName="ACTIVITY_DATE")
		public NDate ActivityDate;
		@DbRecordField(dataSourceName="USER_ID")
		public NString UserId;
		@DbRecordField(dataSourceName="NCHG_DATE")
		public NDate NchgDate;
		@DbRecordField(dataSourceName="TITLE")
		public NString Title;
		@DbRecordField(dataSourceName="STATUS_IND")
		public NString StatusInd;
		@DbRecordField(dataSourceName="CAL_START_MONTH")
		public NString CalStartMonth;
		@DbRecordField(dataSourceName="CAL_START_DAY")
		public NString CalStartDay;
		@DbRecordField(dataSourceName="CAL_END_MONTH")
		public NString CalEndMonth;
		@DbRecordField(dataSourceName="CAL_END_DAY")
		public NString CalEndDay;
		@DbRecordField(dataSourceName="METH_OF_ACCTG")
		public NString MethOfAcctg;
		@DbRecordField(dataSourceName="BAVL_KEY_FUND")
		public NString BavlKeyFund;
		@DbRecordField(dataSourceName="BAVL_KEY_ORGN")
		public NString BavlKeyOrgn;
		@DbRecordField(dataSourceName="BAVL_KEY_ACCT")
		public NString BavlKeyAcct;
		@DbRecordField(dataSourceName="BAVL_KEY_PROG")
		public NString BavlKeyProg;
		@DbRecordField(dataSourceName="BAVL_PERIOD")
		public NString BavlPeriod;
		@DbRecordField(dataSourceName="BAVL_SEVERITY")
		public NString BavlSeverity;
		@DbRecordField(dataSourceName="RUCL_CODE_ROLL_ENC")
		public NString RuclCodeRollEnc;
		@DbRecordField(dataSourceName="COMMIT_TYPE")
		public NString CommitType;
		@DbRecordField(dataSourceName="BUDGET_ROLL")
		public NString BudgetRoll;
		@DbRecordField(dataSourceName="BUDGET_DISPOSITION")
		public NString BudgetDisposition;
		@DbRecordField(dataSourceName="BUDGET_ROLL_PERCENT")
		public NNumber BudgetRollPercent;
		@DbRecordField(dataSourceName="RUCL_CODE_BUDG_CF")
		public NString RuclCodeBudgCf;
		@DbRecordField(dataSourceName="BUDG_CF_TYPE")
		public NString BudgCfType;
		@DbRecordField(dataSourceName="BUDG_CLASSIFICATION")
		public NString BudgClassification;
		@DbRecordField(dataSourceName="BUDG_CF_PERCENT")
		public NNumber BudgCfPercent;
		@DbRecordField(dataSourceName="RUCL_CODE_CLOSE_OP")
		public NString RuclCodeCloseOp;
		@DbRecordField(dataSourceName="ROLL_ENC_IND")
		public NString RollEncInd;
		@DbRecordField(dataSourceName="ROLL_PO_IND")
		public NString RollPoInd;
		@DbRecordField(dataSourceName="ROLL_MEMO_RES_IND")
		public NString RollMemoResInd;
		@DbRecordField(dataSourceName="ROLL_REQ_IND")
		public NString RollReqInd;
		@DbRecordField(dataSourceName="ROLL_LABOR_ENC_IND")
		public NString RollLaborEncInd;
		@DbRecordField(dataSourceName="ROLL_WO_IND")
		public NString RollWoInd;
		@DbRecordField(dataSourceName="TERM_DATE")
		public NDate TermDate;
		@DbRecordField(dataSourceName="ACCT_CODE_FUND_DUE_TO")
		public NString AcctCodeFundDueTo;
		@DbRecordField(dataSourceName="ACCT_CODE_FUND_DUE_FRM")
		public NString AcctCodeFundDueFrm;
		@DbRecordField(dataSourceName="ACCT_CODE_FUND_BAL")
		public NString AcctCodeFundBal;
		@DbRecordField(dataSourceName="ACCT_CODE_ACCRUAL_AP")
		public NString AcctCodeAccrualAp;
		@DbRecordField(dataSourceName="ACCT_CODE_ACCRUAL_AR")
		public NString AcctCodeAccrualAr;
		@DbRecordField(dataSourceName="CURRENT_YEAR_INCOME")
		public NNumber CurrentYearIncome;
		@DbRecordField(dataSourceName="ACCT_CODE_TRF_INCOME")
		public NString AcctCodeTrfIncome;
		@DbRecordField(dataSourceName="ORGN_CODE_TRF_INCOME")
		public NString OrgnCodeTrfIncome;
		@DbRecordField(dataSourceName="PROG_CODE_TRF_INCOME")
		public NString ProgCodeTrfIncome;
		@DbRecordField(dataSourceName="PY_RETAINED_INCOME")
		public NNumber PyRetainedIncome;
		@DbRecordField(dataSourceName="ACCT_CODE_TRF_RI_PY")
		public NString AcctCodeTrfRiPy;
		@DbRecordField(dataSourceName="ORGN_CODE_TRF_RI_PY")
		public NString OrgnCodeTrfRiPy;
		@DbRecordField(dataSourceName="PROG_CODE_TRF_RI_PY")
		public NString ProgCodeTrfRiPy;
		@DbRecordField(dataSourceName="REAL_GL")
		public NNumber RealGl;
		@DbRecordField(dataSourceName="ACCT_CODE_TRF_RGL")
		public NString AcctCodeTrfRgl;
		@DbRecordField(dataSourceName="ORGN_CODE_TRF_RGL")
		public NString OrgnCodeTrfRgl;
		@DbRecordField(dataSourceName="PROG_CODE_TRF_RGL")
		public NString ProgCodeTrfRgl;
		@DbRecordField(dataSourceName="REAL_GL_PY")
		public NNumber RealGlPy;
		@DbRecordField(dataSourceName="ACCT_CODE_TRF_RGL_PY")
		public NString AcctCodeTrfRglPy;
		@DbRecordField(dataSourceName="ORGN_CODE_TRF_RGL_PY")
		public NString OrgnCodeTrfRglPy;
		@DbRecordField(dataSourceName="PROG_CODE_TRF_RGL_PY")
		public NString ProgCodeTrfRglPy;
		@DbRecordField(dataSourceName="FUND_ATTRIBUTE_IND")
		public NString FundAttributeInd;
		@DbRecordField(dataSourceName="ORGN_ATTRIBUTE_IND")
		public NString OrgnAttributeInd;
		@DbRecordField(dataSourceName="ACCT_ATTRIBUTE_IND")
		public NString AcctAttributeInd;
		@DbRecordField(dataSourceName="PROG_ATTRIBUTE_IND")
		public NString ProgAttributeInd;
		@DbRecordField(dataSourceName="ACTV_ATTRIBUTE_IND")
		public NString ActvAttributeInd;
		@DbRecordField(dataSourceName="LOCN_ATTRIBUTE_IND")
		public NString LocnAttributeInd;
		@DbRecordField(dataSourceName="INTERNAL_RECORD_ID")
		public NString InternalRecordId;
	}

	
	
}
