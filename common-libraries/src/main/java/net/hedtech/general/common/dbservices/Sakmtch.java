package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sakmtch {
		public static void pInsertGotcmmeMatching(NString pLastName,NString pEntityCde,NString pFirstName,NString pMi,NString pId,NString pStreetLine1,NString pStreetLine2,NString pStreetLine3,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pCntyCode,NString pPhoneArea,NString pPhoneNumber,NString pPhoneExt,NString pSsn,NString pBirthDay,NString pBirthMon,NString pBirthYear,NString pSex,NString pEmailAddress,NString pAtypCode,NString pTeleCode,NString pEmalCode,NString pAsrcCode,NString pAddidCode,NString pAddid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMTCH.P_INSERT_GOTCMME_MATCHING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_ENTITY_CDE", pEntityCde);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_CNTY_CODE", pCntyCode);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_BIRTH_DAY", pBirthDay);
			cmd.addParameter("@P_BIRTH_MON", pBirthMon);
			cmd.addParameter("@P_BIRTH_YEAR", pBirthYear);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_EMAL_CODE", pEmalCode);
			cmd.addParameter("@P_ASRC_CODE", pAsrcCode);
			cmd.addParameter("@P_ADDID_CODE", pAddidCode);
			cmd.addParameter("@P_ADDID", pAddid);
				
			cmd.execute();


		}
		
		public static void pInsertSotcmme(NString pSbgiCode,NString pSbgiName,NString pSbgiCity,NString pSbgiStatCode,NString pSbgiZip,NString pAmcasId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMTCH.P_INSERT_SOTCMME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_SBGI_NAME", pSbgiName);
			cmd.addParameter("@P_SBGI_CITY", pSbgiCity);
			cmd.addParameter("@P_SBGI_STAT_CODE", pSbgiStatCode);
			cmd.addParameter("@P_SBGI_ZIP", pSbgiZip);
			cmd.addParameter("@P_AMCAS_ID", pAmcasId);
				
			cmd.execute();


		}
		
		public static void pMatchAmcasId(Ref<NString> pCmscCode,Ref<NNumber> pCmsrPriorityNo,Ref<NNumber> pPidm,Ref<NString> pResultType,Ref<NNumber> pMatchCount,Ref<NNumber> pMissingCount,Ref<NNumber> pUnmatchCount,Ref<NString> pMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMTCH.P_MATCH_AMCAS_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode, true);
			cmd.addParameter("@P_CMSR_PRIORITY_NO", pCmsrPriorityNo, true);
			cmd.addParameter("@P_PIDM", pPidm, true);
			cmd.addParameter("@P_RESULT_TYPE", pResultType, true);
			cmd.addParameter("@P_MATCH_COUNT", pMatchCount, true);
			cmd.addParameter("@P_MISSING_COUNT", pMissingCount, true);
			cmd.addParameter("@P_UNMATCH_COUNT", pUnmatchCount, true);
			cmd.addParameter("@P_MESSAGE", pMessage, true);
				
			cmd.execute();
			pCmscCode.val = cmd.getParameterValue("@P_CMSC_CODE", NString.class);
			pCmsrPriorityNo.val = cmd.getParameterValue("@P_CMSR_PRIORITY_NO", NNumber.class);
			pPidm.val = cmd.getParameterValue("@P_PIDM", NNumber.class);
			pResultType.val = cmd.getParameterValue("@P_RESULT_TYPE", NString.class);
			pMatchCount.val = cmd.getParameterValue("@P_MATCH_COUNT", NNumber.class);
			pMissingCount.val = cmd.getParameterValue("@P_MISSING_COUNT", NNumber.class);
			pUnmatchCount.val = cmd.getParameterValue("@P_UNMATCH_COUNT", NNumber.class);
			pMessage.val = cmd.getParameterValue("@P_MESSAGE", NString.class);


		}
		
		public static void pMatchSorhsch(Ref<NString> pCmscCode,Ref<NNumber> pCmsrPriorityNo,Ref<NNumber> pPidm,Ref<NString> pResultType,Ref<NNumber> pMatchCount,Ref<NNumber> pMissingCount,Ref<NNumber> pUnmatchCount,Ref<NString> pMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKMTCH.P_MATCH_SORHSCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode, true);
			cmd.addParameter("@P_CMSR_PRIORITY_NO", pCmsrPriorityNo, true);
			cmd.addParameter("@P_PIDM", pPidm, true);
			cmd.addParameter("@P_RESULT_TYPE", pResultType, true);
			cmd.addParameter("@P_MATCH_COUNT", pMatchCount, true);
			cmd.addParameter("@P_MISSING_COUNT", pMissingCount, true);
			cmd.addParameter("@P_UNMATCH_COUNT", pUnmatchCount, true);
			cmd.addParameter("@P_MESSAGE", pMessage, true);
				
			cmd.execute();
			pCmscCode.val = cmd.getParameterValue("@P_CMSC_CODE", NString.class);
			pCmsrPriorityNo.val = cmd.getParameterValue("@P_CMSR_PRIORITY_NO", NNumber.class);
			pPidm.val = cmd.getParameterValue("@P_PIDM", NNumber.class);
			pResultType.val = cmd.getParameterValue("@P_RESULT_TYPE", NString.class);
			pMatchCount.val = cmd.getParameterValue("@P_MATCH_COUNT", NNumber.class);
			pMissingCount.val = cmd.getParameterValue("@P_MISSING_COUNT", NNumber.class);
			pUnmatchCount.val = cmd.getParameterValue("@P_UNMATCH_COUNT", NNumber.class);
			pMessage.val = cmd.getParameterValue("@P_MESSAGE", NString.class);


		}
		
	
	
	
}
