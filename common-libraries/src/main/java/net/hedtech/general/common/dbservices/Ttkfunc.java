package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ttkfunc {
		public static NNumber fReptTotal(NNumber pidm,NNumber taxYear,NString reptCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TTKFUNC.F_REPT_TOTAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TAX_YEAR", taxYear);
			cmd.addParameter("@REPT_CODE", reptCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fTaxAmount(NNumber taxYear,NString reptCode,NString detcCode,NString termCode,NNumber tranAmount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TTKFUNC.F_TAX_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TAX_YEAR", taxYear);
			cmd.addParameter("@REPT_CODE", reptCode);
			cmd.addParameter("@DETC_CODE", detcCode);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@TRAN_AMOUNT", tranAmount);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fValidTaxYear(NString taxYearIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TTKFUNC.F_VALID_TAX_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TAX_YEAR_IN", taxYearIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
