package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pvkpcrd {
		public static NNumber fPsCalcBenefitEarned(NNumber pYear,NNumber pPidm,NString pEmprCode,NString pBdcaCode,NNumber pApplGrs,NNumber pPenServ) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVKPCRD.F_PS_CALC_BENEFIT_EARNED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_APPL_GRS", pApplGrs);
			cmd.addParameter("@P_PEN_SERV", pPenServ);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
