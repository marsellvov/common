package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ttkmods {
		public static void pReportableAmounts(NNumber pidm,NNumber taxYear,NString processMode,Ref<NNumber> chargesBilled,Ref<NNumber> adjustCharges,Ref<NNumber> scholGrant,Ref<NNumber> adjustSchol,Ref<NString> futureInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TTKMODS.P_REPORTABLE_AMOUNTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TAX_YEAR", taxYear);
			cmd.addParameter("@PROCESS_MODE", processMode);
			cmd.addParameter("@CHARGES_BILLED", NNumber.class);
			cmd.addParameter("@ADJUST_CHARGES", NNumber.class);
			cmd.addParameter("@SCHOL_GRANT", NNumber.class);
			cmd.addParameter("@ADJUST_SCHOL", NNumber.class);
			cmd.addParameter("@FUTURE_IND", NString.class);
				
			cmd.execute();
			chargesBilled.val = cmd.getParameterValue("@CHARGES_BILLED", NNumber.class);
			adjustCharges.val = cmd.getParameterValue("@ADJUST_CHARGES", NNumber.class);
			scholGrant.val = cmd.getParameterValue("@SCHOL_GRANT", NNumber.class);
			adjustSchol.val = cmd.getParameterValue("@ADJUST_SCHOL", NNumber.class);
			futureInd.val = cmd.getParameterValue("@FUTURE_IND", NString.class);


		}
		
		public static void pResetTaxyear(NNumber pidmIn,NNumber taxYearIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TTKMODS.P_RESET_TAXYEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TAX_YEAR_IN", taxYearIn);
				
			cmd.execute();


		}
		
	
	
	
}
