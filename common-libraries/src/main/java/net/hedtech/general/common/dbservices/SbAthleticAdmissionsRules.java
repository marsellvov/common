package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbAthleticAdmissionsRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_ADMISSIONS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pUserId,NString pCombinedSat,NString pCompositeAct,NNumber pAthleteGpa,NString pSaqsCode,NNumber pHsCoreCourses,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_ADMISSIONS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_COMBINED_SAT", pCombinedSat);
			cmd.addParameter("@P_COMPOSITE_ACT", pCompositeAct);
			cmd.addParameter("@P_ATHLETE_GPA", pAthleteGpa);
			cmd.addParameter("@P_SAQS_CODE", pSaqsCode);
			cmd.addParameter("@P_HS_CORE_COURSES", pHsCoreCourses);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pUserId,NString pCombinedSat,NString pCompositeAct,NNumber pAthleteGpa,NString pSaqsCode,NNumber pHsCoreCourses,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_ADMISSIONS_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_COMBINED_SAT", pCombinedSat);
			cmd.addParameter("@P_COMPOSITE_ACT", pCompositeAct);
			cmd.addParameter("@P_ATHLETE_GPA", pAthleteGpa);
			cmd.addParameter("@P_SAQS_CODE", pSaqsCode);
			cmd.addParameter("@P_HS_CORE_COURSES", pHsCoreCourses);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
