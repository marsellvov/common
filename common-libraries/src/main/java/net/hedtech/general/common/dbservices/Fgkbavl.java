package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fgkbavl {
		public static void abalPGetBavlFoap(NString chartOfAccounts,NString fundCode,NString organizationCode,NString account,NString program,NDate transactionDate,Ref<NString> errorMessage,Ref<NString> bavlFund,Ref<NString> bavlOrgn,Ref<NString> bavlAcct,Ref<NString> bavlProg,Ref<NString> controlPeriod,Ref<NString> controlSeverity) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FGKBAVL.ABAL_P_GET_BAVL_FOAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CHART_OF_ACCOUNTS", chartOfAccounts);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@ORGANIZATION_CODE", organizationCode);
			cmd.addParameter("@ACCOUNT", account);
			cmd.addParameter("@PROGRAM", program);
			cmd.addParameter("@TRANSACTION_DATE", transactionDate);
			cmd.addParameter("@ERROR_MESSAGE", NString.class);
			cmd.addParameter("@BAVL_FUND", NString.class);
			cmd.addParameter("@BAVL_ORGN", NString.class);
			cmd.addParameter("@BAVL_ACCT", NString.class);
			cmd.addParameter("@BAVL_PROG", NString.class);
			cmd.addParameter("@CONTROL_PERIOD", NString.class);
			cmd.addParameter("@CONTROL_SEVERITY", NString.class);
				
			cmd.execute();
			errorMessage.val = cmd.getParameterValue("@ERROR_MESSAGE", NString.class);
			bavlFund.val = cmd.getParameterValue("@BAVL_FUND", NString.class);
			bavlOrgn.val = cmd.getParameterValue("@BAVL_ORGN", NString.class);
			bavlAcct.val = cmd.getParameterValue("@BAVL_ACCT", NString.class);
			bavlProg.val = cmd.getParameterValue("@BAVL_PROG", NString.class);
			controlPeriod.val = cmd.getParameterValue("@CONTROL_PERIOD", NString.class);
			controlSeverity.val = cmd.getParameterValue("@CONTROL_SEVERITY", NString.class);


		}
		
		public static NString FabalPGetBavlPeriod(NString transactionFspd,NString bavlControlPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FGKBAVL.ABAL_P_GET_BAVL_PERIOD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TRANSACTION_FSPD", transactionFspd);
			cmd.addParameter("@BAVL_CONTROL_PERIOD", bavlControlPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool FbudgetHasRolled(NString chartOfAccounts,NString fiscalYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FGKBAVL.BUDGET_HAS_ROLLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@CHART_OF_ACCOUNTS", chartOfAccounts);
			cmd.addParameter("@FISCAL_YEAR", fiscalYear);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString FgetBgtPoolAcct(NString coasCode,NString acctCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FGKBAVL.GET_BGT_POOL_ACCT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@ACCT_CODE", acctCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void getBudgetEncumbRollCheck(NString chartOfAccounts,NString fiscalYear,Ref<NBool> budgHasRolled,Ref<NBool> encdHasRolled) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FGKBAVL.GET_BUDGET_ENCUMB_ROLL_CHECK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CHART_OF_ACCOUNTS", chartOfAccounts);
			cmd.addParameter("@FISCAL_YEAR", fiscalYear);
			cmd.addParameter("@BUDG_HAS_ROLLED", NBool.class);
			cmd.addParameter("@ENCD_HAS_ROLLED", NBool.class);
				
			cmd.execute();
			budgHasRolled.val = cmd.getParameterValue("@BUDG_HAS_ROLLED", NBool.class);
			encdHasRolled.val = cmd.getParameterValue("@ENCD_HAS_ROLLED", NBool.class);


		}
		
		public static NNumber FgetBudgetRollAmount(NString chartAcct,NString fiscalYr,NString fndCode,NDate transactDate,NNumber transactAmt,NString opalLedgField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FGKBAVL.GET_BUDGET_ROLL_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@CHART_ACCT", chartAcct);
			cmd.addParameter("@FISCAL_YR", fiscalYr);
			cmd.addParameter("@FND_CODE", fndCode);
			cmd.addParameter("@TRANSACT_DATE", transactDate);
			cmd.addParameter("@TRANSACT_AMT", transactAmt);
			cmd.addParameter("@OPAL_LEDG_FIELD", opalLedgField);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void getBudgetRollParameters(NString chartOfAccounts,NString fundCode,NDate transactionDate,Ref<NString> budgCfType,Ref<NString> budgClass,Ref<NNumber> budgRollPercent) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FGKBAVL.GET_BUDGET_ROLL_PARAMETERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CHART_OF_ACCOUNTS", chartOfAccounts);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@TRANSACTION_DATE", transactionDate);
			cmd.addParameter("@BUDG_CF_TYPE", NString.class);
			cmd.addParameter("@BUDG_CLASS", NString.class);
			cmd.addParameter("@BUDG_ROLL_PERCENT", NNumber.class);
				
			cmd.execute();
			budgCfType.val = cmd.getParameterValue("@BUDG_CF_TYPE", NString.class);
			budgClass.val = cmd.getParameterValue("@BUDG_CLASS", NString.class);
			budgRollPercent.val = cmd.getParameterValue("@BUDG_ROLL_PERCENT", NNumber.class);


		}
		
		public static NString FgetPoolAcct(NString chartOfAccounts,NString account,NDate transactionDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FGKBAVL.GET_POOL_ACCT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CHART_OF_ACCOUNTS", chartOfAccounts);
			cmd.addParameter("@ACCOUNT", account);
			cmd.addParameter("@TRANSACTION_DATE", transactionDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
