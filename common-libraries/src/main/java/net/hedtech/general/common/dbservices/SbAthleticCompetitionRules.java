package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbAthleticCompetitionRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pTermCode,NString pActcCode,NNumber pSeqNo,NString pCurrentInd,NNumber pSeasonsAvailable,NString pSeasonUsedInd,NString pUserId,NDate pCreateActivityDate,NString pCreateUserId,NString pSareCode,NString pEligBeginTermCode,NString pEligEndTermCode,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_CURRENT_IND", pCurrentInd);
			cmd.addParameter("@P_SEASONS_AVAILABLE", pSeasonsAvailable);
			cmd.addParameter("@P_SEASON_USED_IND", pSeasonUsedInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_ACTIVITY_DATE", pCreateActivityDate);
			cmd.addParameter("@P_CREATE_USER_ID", pCreateUserId);
			cmd.addParameter("@P_SARE_CODE", pSareCode);
			cmd.addParameter("@P_ELIG_BEGIN_TERM_CODE", pEligBeginTermCode);
			cmd.addParameter("@P_ELIG_END_TERM_CODE", pEligEndTermCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pTermCode,NString pActcCode,NNumber pSeqNo,NString pCurrentInd,NNumber pSeasonsAvailable,NString pSeasonUsedInd,NString pUserId,NDate pCreateActivityDate,NString pCreateUserId,NString pSareCode,NString pEligBeginTermCode,NString pEligEndTermCode,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPETITION_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_CURRENT_IND", pCurrentInd);
			cmd.addParameter("@P_SEASONS_AVAILABLE", pSeasonsAvailable);
			cmd.addParameter("@P_SEASON_USED_IND", pSeasonUsedInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_ACTIVITY_DATE", pCreateActivityDate);
			cmd.addParameter("@P_CREATE_USER_ID", pCreateUserId);
			cmd.addParameter("@P_SARE_CODE", pSareCode);
			cmd.addParameter("@P_ELIG_BEGIN_TERM_CODE", pEligBeginTermCode);
			cmd.addParameter("@P_ELIG_END_TERM_CODE", pEligEndTermCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
