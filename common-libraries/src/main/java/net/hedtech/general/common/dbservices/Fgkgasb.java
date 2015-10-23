package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fgkgasb {
		public static NString fGasbAcctHierarchy(NString chartOfAccounts,NDate asofDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FGKGASB.F_GASB_ACCT_HIERARCHY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CHART_OF_ACCOUNTS", chartOfAccounts);
			cmd.addParameter("@ASOF_DATE", asofDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void gasbPAcctAttributes(NString chartOfAccounts,NString acctCode,NString acctHierCode,NString acctAtypCode,NString internalAtyp,NNumber ledgerAmount,NString reportCode,Ref<NString> acctAttrType,Ref<NString> acctAttrValue,Ref<NNumber> gasbAmount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FGKGASB.GASB_P_ACCT_ATTRIBUTES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CHART_OF_ACCOUNTS", chartOfAccounts);
			cmd.addParameter("@ACCT_CODE", acctCode);
			cmd.addParameter("@ACCT_HIER_CODE", acctHierCode);
			cmd.addParameter("@ACCT_ATYP_CODE", acctAtypCode);
			cmd.addParameter("@INTERNAL_ATYP", internalAtyp);
			cmd.addParameter("@LEDGER_AMOUNT", ledgerAmount);
			cmd.addParameter("@REPORT_CODE", reportCode);
			cmd.addParameter("@ACCT_ATTR_TYPE", NString.class);
			cmd.addParameter("@ACCT_ATTR_VALUE", NString.class);
			cmd.addParameter("@GASB_AMOUNT", NNumber.class);
				
			cmd.execute();
			acctAttrType.val = cmd.getParameterValue("@ACCT_ATTR_TYPE", NString.class);
			acctAttrValue.val = cmd.getParameterValue("@ACCT_ATTR_VALUE", NString.class);
			gasbAmount.val = cmd.getParameterValue("@GASB_AMOUNT", NNumber.class);


		}
		
		public static void gasbPFundAttributes(NString chartOfAccounts,NString fundCode,NString fundHierCode,NString fundFtypCode,NString reportCode,Ref<NString> fundAttrType,Ref<NString> fundAttrValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FGKGASB.GASB_P_FUND_ATTRIBUTES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CHART_OF_ACCOUNTS", chartOfAccounts);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@FUND_HIER_CODE", fundHierCode);
			cmd.addParameter("@FUND_FTYP_CODE", fundFtypCode);
			cmd.addParameter("@REPORT_CODE", reportCode);
			cmd.addParameter("@FUND_ATTR_TYPE", NString.class);
			cmd.addParameter("@FUND_ATTR_VALUE", NString.class);
				
			cmd.execute();
			fundAttrType.val = cmd.getParameterValue("@FUND_ATTR_TYPE", NString.class);
			fundAttrValue.val = cmd.getParameterValue("@FUND_ATTR_VALUE", NString.class);


		}
		
		public static void gasbPProgAttributes(NString chartOfAccounts,NString progCode,NString progHierCode,NString reportCode,Ref<NString> progAttrType,Ref<NString> progAttrValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FGKGASB.GASB_P_PROG_ATTRIBUTES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CHART_OF_ACCOUNTS", chartOfAccounts);
			cmd.addParameter("@PROG_CODE", progCode);
			cmd.addParameter("@PROG_HIER_CODE", progHierCode);
			cmd.addParameter("@REPORT_CODE", reportCode);
			cmd.addParameter("@PROG_ATTR_TYPE", NString.class);
			cmd.addParameter("@PROG_ATTR_VALUE", NString.class);
				
			cmd.execute();
			progAttrType.val = cmd.getParameterValue("@PROG_ATTR_TYPE", NString.class);
			progAttrValue.val = cmd.getParameterValue("@PROG_ATTR_VALUE", NString.class);


		}
		
	
	
	
}
