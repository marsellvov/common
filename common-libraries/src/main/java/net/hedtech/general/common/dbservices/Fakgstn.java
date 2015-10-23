package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fakgstn {
		public static NNumber fGstRetrievePct(NString coasCode,NString tratCode,NString fundCodeInput,NString orgnCodeInput,NString acctCodeInput,NString progCodeInput,NDate transDateInput) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FAKGSTN.F_GST_RETRIEVE_PCT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@TRAT_CODE", tratCode);
			cmd.addParameter("@FUND_CODE_INPUT", fundCodeInput);
			cmd.addParameter("@ORGN_CODE_INPUT", orgnCodeInput);
			cmd.addParameter("@ACCT_CODE_INPUT", acctCodeInput);
			cmd.addParameter("@PROG_CODE_INPUT", progCodeInput);
			cmd.addParameter("@TRANS_DATE_INPUT", transDateInput);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
