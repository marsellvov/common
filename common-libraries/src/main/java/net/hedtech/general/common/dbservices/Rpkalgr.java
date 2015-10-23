package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rpkalgr {
		public static NNumber fCalcAlgorithmicAmount(NString pAidyCode,NString pAlgrCode,NNumber pPidm,NString pFundCode,NString pFedFundId,NString pFtypCode,NString pFsrcCode,NString pAlternateAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKALGR.F_CALC_ALGORITHMIC_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ALGR_CODE", pAlgrCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_FED_FUND_ID", pFedFundId);
			cmd.addParameter("@P_FTYP_CODE", pFtypCode);
			cmd.addParameter("@P_FSRC_CODE", pFsrcCode);
			cmd.addParameter("@P_ALTERNATE_AIDY_CODE", pAlternateAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetFfidOffer(NString pAidyCode,NNumber pPidm,NString pFedFundId,NString pSimulateSw) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKALGR.F_GET_FFID_OFFER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FED_FUND_ID", pFedFundId);
			cmd.addParameter("@P_SIMULATE_SW", pSimulateSw);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetFundOffer(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pSimulateSw) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKALGR.F_GET_FUND_OFFER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_SIMULATE_SW", pSimulateSw);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetPriorYearFfidOffer(NString pAidyCode,NNumber pPidm,NString pFedFundId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKALGR.F_GET_PRIOR_YEAR_FFID_OFFER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FED_FUND_ID", pFedFundId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetPriorYearFundOffer(NString pAidyCode,NNumber pPidm,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKALGR.F_GET_PRIOR_YEAR_FUND_OFFER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fValidateSqlRule(NString pSqlStatement) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKALGR.F_VALIDATE_SQL_RULE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_SQL_STATEMENT", pSqlStatement);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
