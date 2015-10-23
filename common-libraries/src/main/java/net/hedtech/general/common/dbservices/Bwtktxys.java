package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwtktxys {
		public static void pGetTaxYear(NString taxYearIn,NString callingProcNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWTKTXYS.P_GET_TAX_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TAX_YEAR_IN", taxYearIn);
			cmd.addParameter("@CALLING_PROC_NAME_IN", callingProcNameIn);
				
			cmd.execute();


		}
		
		public static void pStoreTaxYear(NString taxYearIn,NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWTKTXYS.P_STORE_TAX_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TAX_YEAR_IN", taxYearIn);
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();


		}
		
	
	
	
}
