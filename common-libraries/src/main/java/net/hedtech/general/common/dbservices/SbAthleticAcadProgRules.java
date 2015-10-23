package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbAthleticAcadProgRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_ACAD_PROG_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pTermCode,NNumber pSeqNo,NString pActiveInd,NString pUserId,NNumber pSingleTermHours,NNumber pTerm1Hours,NNumber pTerm2Hours,NNumber pTerm3Hours,NNumber pTotalYearHours,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_ACAD_PROG_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SINGLE_TERM_HOURS", pSingleTermHours);
			cmd.addParameter("@P_TERM_1_HOURS", pTerm1Hours);
			cmd.addParameter("@P_TERM_2_HOURS", pTerm2Hours);
			cmd.addParameter("@P_TERM_3_HOURS", pTerm3Hours);
			cmd.addParameter("@P_TOTAL_YEAR_HOURS", pTotalYearHours);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pTermCode,NNumber pSeqNo,NString pActiveInd,NString pUserId,NNumber pSingleTermHours,NNumber pTerm1Hours,NNumber pTerm2Hours,NNumber pTerm3Hours,NNumber pTotalYearHours,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_ACAD_PROG_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SINGLE_TERM_HOURS", pSingleTermHours);
			cmd.addParameter("@P_TERM_1_HOURS", pTerm1Hours);
			cmd.addParameter("@P_TERM_2_HOURS", pTerm2Hours);
			cmd.addParameter("@P_TERM_3_HOURS", pTerm3Hours);
			cmd.addParameter("@P_TOTAL_YEAR_HOURS", pTotalYearHours);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
