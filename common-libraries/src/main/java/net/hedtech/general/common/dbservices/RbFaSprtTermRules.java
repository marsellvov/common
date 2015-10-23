package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbFaSprtTermRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_SPRT_TERM_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pPeriod,NString pFaspCode,NString pAatpCode,NNumber pPotentialAidAmt,NNumber pAthlAidTermAmt,NNumber pTermPct,NNumber pTermCount,NNumber pSummerTermCount,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_SPRT_TERM_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
			cmd.addParameter("@P_AATP_CODE", pAatpCode);
			cmd.addParameter("@P_POTENTIAL_AID_AMT", pPotentialAidAmt);
			cmd.addParameter("@P_ATHL_AID_TERM_AMT", pAthlAidTermAmt);
			cmd.addParameter("@P_TERM_PCT", pTermPct);
			cmd.addParameter("@P_TERM_COUNT", pTermCount);
			cmd.addParameter("@P_SUMMER_TERM_COUNT", pSummerTermCount);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pPeriod,NString pFaspCode,NString pAatpCode,NNumber pPotentialAidAmt,NNumber pAthlAidTermAmt,NNumber pTermPct,NNumber pTermCount,NNumber pSummerTermCount,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_FA_SPRT_TERM_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FASP_CODE", pFaspCode);
			cmd.addParameter("@P_AATP_CODE", pAatpCode);
			cmd.addParameter("@P_POTENTIAL_AID_AMT", pPotentialAidAmt);
			cmd.addParameter("@P_ATHL_AID_TERM_AMT", pAthlAidTermAmt);
			cmd.addParameter("@P_TERM_PCT", pTermPct);
			cmd.addParameter("@P_TERM_COUNT", pTermCount);
			cmd.addParameter("@P_SUMMER_TERM_COUNT", pSummerTermCount);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
