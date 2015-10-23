package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fokwext {
		public static void pExtractgeneralledger(NString chartCode,NString fiscalYear,NString fiscalPeriod,NString fillHierarchy,NString userid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKWEXT.P_EXTRACTGENERALLEDGER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CHART_CODE", chartCode);
			cmd.addParameter("@FISCAL_YEAR", fiscalYear);
			cmd.addParameter("@FISCAL_PERIOD", fiscalPeriod);
			cmd.addParameter("@FILL_HIERARCHY", fillHierarchy);
			cmd.addParameter("@USERID", userid);
				
			cmd.execute();


		}
		
		public static void pExtractoperatingledger(NString chartCode,NString fiscalYear,NString fiscalPeriod,NString includeAccrual,NString fillHierarchy,NString userid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKWEXT.P_EXTRACTOPERATINGLEDGER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CHART_CODE", chartCode);
			cmd.addParameter("@FISCAL_YEAR", fiscalYear);
			cmd.addParameter("@FISCAL_PERIOD", fiscalPeriod);
			cmd.addParameter("@INCLUDE_ACCRUAL", includeAccrual);
			cmd.addParameter("@FILL_HIERARCHY", fillHierarchy);
			cmd.addParameter("@USERID", userid);
				
			cmd.execute();


		}
		
		public static void pExtractresearch(NString chartCode,NString fiscalYear,NString fiscalPeriod,NString includeAccrual,NString fillHierarchy,NString userid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKWEXT.P_EXTRACTRESEARCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CHART_CODE", chartCode);
			cmd.addParameter("@FISCAL_YEAR", fiscalYear);
			cmd.addParameter("@FISCAL_PERIOD", fiscalPeriod);
			cmd.addParameter("@INCLUDE_ACCRUAL", includeAccrual);
			cmd.addParameter("@FILL_HIERARCHY", fillHierarchy);
			cmd.addParameter("@USERID", userid);
				
			cmd.execute();


		}
		
	
	
	
}
