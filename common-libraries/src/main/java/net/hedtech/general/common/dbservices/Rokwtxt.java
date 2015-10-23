package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rokwtxt {
		public static NString fCalcSelectValue(NString pAidyCode,NString pWtxtCode,NNumber pPidm,NString pAlternateAidyCode,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWTXT.F_CALC_SELECT_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_WTXT_CODE", pWtxtCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ALTERNATE_AIDY_CODE", pAlternateAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetText(NString pAidyCode,NString pWtxtCode,NString pTab,NString pSelectValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWTXT.F_GET_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_WTXT_CODE", pWtxtCode);
			cmd.addParameter("@P_TAB", pTab);
			cmd.addParameter("@P_SELECT_VALUE", pSelectValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fValidateSqlRule(NString pSqlStatement) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKWTXT.F_VALIDATE_SQL_RULE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_SQL_STATEMENT", pSqlStatement);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
