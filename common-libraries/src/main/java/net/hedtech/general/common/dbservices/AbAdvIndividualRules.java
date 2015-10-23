package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class AbAdvIndividualRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_INDIVIDUAL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pPrefLastName,NString pPrefFirstName,NString pPrefMi,NString pNickname,NString pGradName,NString pParentsName,NString pMaidenLastName,NString pPrefClas,NString pCollCodePref,NString pHomeCity,NString pStatCodeHome,NString pNatnCodeHome,NString pCmName,NString pAtypCodeCm,NString pDottCode,NString pIncmCode,NString pAtypCodePref,NString pAddrName,NString pAtypCodeGeor,NString pSocietyName,NString pDataOrigin,NString pUserId,NString pSurnamePrefix,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_INDIVIDUAL_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PREF_LAST_NAME", pPrefLastName);
			cmd.addParameter("@P_PREF_FIRST_NAME", pPrefFirstName);
			cmd.addParameter("@P_PREF_MI", pPrefMi);
			cmd.addParameter("@P_NICKNAME", pNickname);
			cmd.addParameter("@P_GRAD_NAME", pGradName);
			cmd.addParameter("@P_PARENTS_NAME", pParentsName);
			cmd.addParameter("@P_MAIDEN_LAST_NAME", pMaidenLastName);
			cmd.addParameter("@P_PREF_CLAS", pPrefClas);
			cmd.addParameter("@P_COLL_CODE_PREF", pCollCodePref);
			cmd.addParameter("@P_HOME_CITY", pHomeCity);
			cmd.addParameter("@P_STAT_CODE_HOME", pStatCodeHome);
			cmd.addParameter("@P_NATN_CODE_HOME", pNatnCodeHome);
			cmd.addParameter("@P_CM_NAME", pCmName);
			cmd.addParameter("@P_ATYP_CODE_CM", pAtypCodeCm);
			cmd.addParameter("@P_DOTT_CODE", pDottCode);
			cmd.addParameter("@P_INCM_CODE", pIncmCode);
			cmd.addParameter("@P_ATYP_CODE_PREF", pAtypCodePref);
			cmd.addParameter("@P_ADDR_NAME", pAddrName);
			cmd.addParameter("@P_ATYP_CODE_GEOR", pAtypCodeGeor);
			cmd.addParameter("@P_SOCIETY_NAME", pSocietyName);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pPrefLastName,NString pPrefFirstName,NString pPrefMi,NString pNickname,NString pGradName,NString pParentsName,NString pMaidenLastName,NString pPrefClas,NString pCollCodePref,NString pHomeCity,NString pStatCodeHome,NString pNatnCodeHome,NString pCmName,NString pAtypCodeCm,NString pDottCode,NString pIncmCode,NString pAtypCodePref,NString pAddrName,NString pAtypCodeGeor,NString pSocietyName,NString pDataOrigin,NString pUserId,NString pDonrCode,NString pSurnamePrefix) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_INDIVIDUAL_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PREF_LAST_NAME", pPrefLastName);
			cmd.addParameter("@P_PREF_FIRST_NAME", pPrefFirstName);
			cmd.addParameter("@P_PREF_MI", pPrefMi);
			cmd.addParameter("@P_NICKNAME", pNickname);
			cmd.addParameter("@P_GRAD_NAME", pGradName);
			cmd.addParameter("@P_PARENTS_NAME", pParentsName);
			cmd.addParameter("@P_MAIDEN_LAST_NAME", pMaidenLastName);
			cmd.addParameter("@P_PREF_CLAS", pPrefClas);
			cmd.addParameter("@P_COLL_CODE_PREF", pCollCodePref);
			cmd.addParameter("@P_HOME_CITY", pHomeCity);
			cmd.addParameter("@P_STAT_CODE_HOME", pStatCodeHome);
			cmd.addParameter("@P_NATN_CODE_HOME", pNatnCodeHome);
			cmd.addParameter("@P_CM_NAME", pCmName);
			cmd.addParameter("@P_ATYP_CODE_CM", pAtypCodeCm);
			cmd.addParameter("@P_DOTT_CODE", pDottCode);
			cmd.addParameter("@P_INCM_CODE", pIncmCode);
			cmd.addParameter("@P_ATYP_CODE_PREF", pAtypCodePref);
			cmd.addParameter("@P_ADDR_NAME", pAddrName);
			cmd.addParameter("@P_ATYP_CODE_GEOR", pAtypCodeGeor);
			cmd.addParameter("@P_SOCIETY_NAME", pSocietyName);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DONR_CODE", pDonrCode);
			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
				
			cmd.execute();


		}
		
	
	
	
}
