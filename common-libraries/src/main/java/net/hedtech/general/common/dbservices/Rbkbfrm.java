package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rbkbfrm {
		public static void pAddDefaultComponents(NString pAidyCode,NString pBgrpCode,NString pBtypCode,NString pAprdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKBFRM.P_ADD_DEFAULT_COMPONENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
				
			cmd.execute();


		}
		
		public static void pCopyBudget(NString pAidyCode,NString pBgrpCode,NString pBtypCode,NString pAprdCode,NString pToAidyCode,NString pToBgrpCode,NString pToBtypCode,NString pToAprdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKBFRM.P_COPY_BUDGET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_TO_AIDY_CODE", pToAidyCode);
			cmd.addParameter("@P_TO_BGRP_CODE", pToBgrpCode);
			cmd.addParameter("@P_TO_BTYP_CODE", pToBtypCode);
			cmd.addParameter("@P_TO_APRD_CODE", pToAprdCode);
				
			cmd.execute();


		}
		
		public static void pCopyFullYear(NString pAidyCode,NString pBgrpCode,NString pBtypCode,NString pToAprdCode,NNumber pFullYrPct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKBFRM.P_COPY_FULL_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
			cmd.addParameter("@P_BTYP_CODE", pBtypCode);
			cmd.addParameter("@P_TO_APRD_CODE", pToAprdCode);
			cmd.addParameter("@P_FULL_YR_PCT", pFullYrPct);
				
			cmd.execute();


		}
		
		public static void pVerifyGtypDefault(NString pBgrpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKBFRM.P_VERIFY_GTYP_DEFAULT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
				
			cmd.execute();


		}
		
		public static void pVerifyMixedPctTotal(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKBFRM.P_VERIFY_MIXED_PCT_TOTAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
	
	
	
}
