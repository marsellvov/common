package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvDe9cBp {
		public static NNumber fMnthToQtr(NNumber pMonth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_DE9C_BP.F_MNTH_TO_QTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_MONTH", pMonth);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fNumberEmployeesMonth(NNumber pYear,NNumber pMonth,NNumber pQuarter,NString pEmprCode,NString pWgplCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_DE9C_BP.F_NUMBER_EMPLOYEES_MONTH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_MONTH", pMonth);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_WGPL_CODE", pWgplCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fQtrUiTotalWages(NNumber pApplGrs,NString pWgplCode,NString pUiWagesInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_DE9C_BP.F_QTR_UI_TOTAL_WAGES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_APPL_GRS", pApplGrs);
			cmd.addParameter("@P_WGPL_CODE", pWgplCode);
			cmd.addParameter("@P_UI_WAGES_IND", pUiWagesInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fRptPeriod(NNumber pYear,NNumber pQuarter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_DE9C_BP.F_RPT_PERIOD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fStateIncomeTax(NNumber pEmplAmtTot,NString pWgplCode,NString pPitAmountsInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_DE9C_BP.F_STATE_INCOME_TAX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_EMPL_AMT_TOT", pEmplAmtTot);
			cmd.addParameter("@P_WGPL_CODE", pWgplCode);
			cmd.addParameter("@P_PIT_AMOUNTS_IND", pPitAmountsInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fStateTaxableWages(NNumber pApplGrs,NString pWgplCode,NString pPitAmountsInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_DE9C_BP.F_STATE_TAXABLE_WAGES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_APPL_GRS", pApplGrs);
			cmd.addParameter("@P_WGPL_CODE", pWgplCode);
			cmd.addParameter("@P_PIT_AMOUNTS_IND", pPitAmountsInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
