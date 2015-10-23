package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rfkaspc {
		public static void pRecalcAllFunds(NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RFKASPC.P_RECALC_ALL_FUNDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();


		}
		
		public static void pRecalcSingleFund(NString pAidyCode,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RFKASPC.P_RECALC_SINGLE_FUND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();


		}
		
	
	
	
}
