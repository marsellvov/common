package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rokpell {
		public static NNumber fCountRfrbaseFundCodes(NString pFedFundId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPELL.F_COUNT_RFRBASE_FUND_CODES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_FED_FUND_ID", pFedFundId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pGetTermPellFund(NNumber pPidm,NString pPeriod,Ref<NString> pPellFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPELL.P_GET_TERM_PELL_FUND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PELL_FUND_CODE", NString.class);
				
			cmd.execute();
			pPellFundCode.val = cmd.getParameterValue("@P_PELL_FUND_CODE", NString.class);


		}
		
		public static void pSelectAidyCode(NString pPeriod,Ref<NString> pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPELL.P_SELECT_AIDY_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_AIDY_CODE", NString.class);
				
			cmd.execute();
			pAidyCode.val = cmd.getParameterValue("@P_AIDY_CODE", NString.class);


		}
		
		public static void pSelectRfrbaseFund(NString pFedFundId,Ref<NString> pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPELL.P_SELECT_RFRBASE_FUND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FED_FUND_ID", pFedFundId);
			cmd.addParameter("@P_FUND_CODE", NString.class);
				
			cmd.execute();
			pFundCode.val = cmd.getParameterValue("@P_FUND_CODE", NString.class);


		}
		
		public static void pSelectRobinstPellFund(NString pAidyCode,Ref<NString> pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPELL.P_SELECT_ROBINST_PELL_FUND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", NString.class);
				
			cmd.execute();
			pFundCode.val = cmd.getParameterValue("@P_FUND_CODE", NString.class);


		}
		
		public static void pSelectRorcampPellFund(NString pAidyCode,NString pCampCode,Ref<NString> pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPELL.P_SELECT_RORCAMP_PELL_FUND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_FUND_CODE", NString.class);
				
			cmd.execute();
			pFundCode.val = cmd.getParameterValue("@P_FUND_CODE", NString.class);


		}
		
		public static void pSelectSgbstdnCampus(NNumber pPidm,NString pPeriod,Ref<NString> pCampCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKPELL.P_SELECT_SGBSTDN_CAMPUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_CAMP_CODE", NString.class);
				
			cmd.execute();
			pCampCode.val = cmd.getParameterValue("@P_CAMP_CODE", NString.class);


		}
		
	
	
	
}
