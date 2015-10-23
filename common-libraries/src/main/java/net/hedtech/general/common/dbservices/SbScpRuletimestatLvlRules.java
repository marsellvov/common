package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbScpRuletimestatLvlRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_RULETIMESTAT_LVL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTmstCode,NString pScpsCodeEff,NString pCampCode,NString pLevlCode,NString pCollCode,NString pMajrCode,NString pStypCode,NString pDegcCode,NString pLevlCodeCrse,NNumber pMinCredits,NNumber pMaxCredits,NString pTaxInd,NNumber pNumbCredits,NNumber pNumbCourses,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_RULETIMESTAT_LVL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_SCPS_CODE_EFF", pScpsCodeEff);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_LEVL_CODE_CRSE", pLevlCodeCrse);
			cmd.addParameter("@P_MIN_CREDITS", pMinCredits);
			cmd.addParameter("@P_MAX_CREDITS", pMaxCredits);
			cmd.addParameter("@P_TAX_IND", pTaxInd);
			cmd.addParameter("@P_NUMB_CREDITS", pNumbCredits);
			cmd.addParameter("@P_NUMB_COURSES", pNumbCourses);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pTmstCode,NString pScpsCodeEff,NString pCampCode,NString pLevlCode,NString pCollCode,NString pMajrCode,NString pStypCode,NString pDegcCode,NString pLevlCodeCrse,NNumber pMinCredits,NNumber pMaxCredits,NString pTaxInd,NNumber pNumbCredits,NNumber pNumbCourses) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_RULETIMESTAT_LVL_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_SCPS_CODE_EFF", pScpsCodeEff);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_LEVL_CODE_CRSE", pLevlCodeCrse);
			cmd.addParameter("@P_MIN_CREDITS", pMinCredits);
			cmd.addParameter("@P_MAX_CREDITS", pMaxCredits);
			cmd.addParameter("@P_TAX_IND", pTaxInd);
			cmd.addParameter("@P_NUMB_CREDITS", pNumbCredits);
			cmd.addParameter("@P_NUMB_COURSES", pNumbCourses);
				
			cmd.execute();


		}
		
	
	
	
}
