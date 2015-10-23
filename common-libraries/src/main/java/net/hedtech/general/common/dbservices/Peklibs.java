package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Peklibs {
		public static NString fGetErrorString(NString pStringName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKLIBS.F_GET_ERROR_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING_NAME", pStringName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIbanAcctPrintFormat(NString pAcctIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKLIBS.F_IBAN_ACCT_PRINT_FORMAT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ACCT_IN", pAcctIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIbanInstalledGeneral() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKLIBS.F_IBAN_INSTALLED_GENERAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fJobEmplStatusDesc(NString status) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKLIBS.F_JOB_EMPL_STATUS_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STATUS", status);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidFormatBankAcctNum(NString pAcctIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKLIBS.F_VALID_FORMAT_BANK_ACCT_NUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ACCT_IN", pAcctIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidFormatBankRoutNum(NString pBankIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKLIBS.F_VALID_FORMAT_BANK_ROUT_NUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BANK_IN", pBankIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
