package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pvkprgn {
		public static NNumber fPsCalcBenefitEarned(NNumber pYear,NNumber pPidm,NString pEmprCode,NString pBdcaCode,NNumber pWageBase,NNumber pExclEarnLow,NNumber pExclEarnHigh,NNumber pBenEntlCeil,NNumber pPenServ) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PVKPRGN.F_PS_CALC_BENEFIT_EARNED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_WAGE_BASE", pWageBase);
			cmd.addParameter("@P_EXCL_EARN_LOW", pExclEarnLow);
			cmd.addParameter("@P_EXCL_EARN_HIGH", pExclEarnHigh);
			cmd.addParameter("@P_BEN_ENTL_CEIL", pBenEntlCeil);
			cmd.addParameter("@P_PEN_SERV", pPenServ);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
