package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rpkltrm {
		public static NString fTimeValidForLoanPeriod(NString pLoanPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKLTRM.F_TIME_VALID_FOR_LOAN_PERIOD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LOAN_PERIOD", pLoanPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDeleteLoanPeriod(NString pLoanPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKLTRM.P_DELETE_LOAN_PERIOD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOAN_PERIOD", pLoanPeriod);
				
			cmd.execute();


		}
		
		public static void pFinalizeDisbSchedule(NString pLoanPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKLTRM.P_FINALIZE_DISB_SCHEDULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOAN_PERIOD", pLoanPeriod);
				
			cmd.execute();


		}
		
		public static void pFinalizeLoanSchedule(NString pLoanPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKLTRM.P_FINALIZE_LOAN_SCHEDULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOAN_PERIOD", pLoanPeriod);
				
			cmd.execute();


		}
		
	
	
	
}
