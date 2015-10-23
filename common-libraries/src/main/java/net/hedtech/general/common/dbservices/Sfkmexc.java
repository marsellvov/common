package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkmexc {
		public static NString fCompareGradeValues(NString pTermCode,NString pLevlCode,NString pGrdeCode,NString pMexcTerm,NString pMexcLevl,NString pMexcGrde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMEXC.F_COMPARE_GRADE_VALUES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_GRDE_CODE", pGrdeCode);
			cmd.addParameter("@P_MEXC_TERM", pMexcTerm);
			cmd.addParameter("@P_MEXC_LEVL", pMexcLevl);
			cmd.addParameter("@P_MEXC_GRDE", pMexcGrde);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetGradeNumericValue(NString pTermCode,NString pLevlCode,NString pGrdeCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMEXC.F_GET_GRADE_NUMERIC_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_GRDE_CODE", pGrdeCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pCheckMexcSftregs(NNumber pPidm,NString pTermCode,NString pMexcSeverity,NString pAdminProcessing) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKMEXC.P_CHECK_MEXC_SFTREGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_MEXC_SEVERITY", pMexcSeverity);
			cmd.addParameter("@P_ADMIN_PROCESSING", pAdminProcessing);
				
			cmd.execute();


		}
		
	
	
	
}
