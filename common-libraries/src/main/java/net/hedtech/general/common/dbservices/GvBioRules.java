package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GvBioRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BIO_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pSsn,NDate pBirthDate,NString pLgcyCode,NString pEthnCode,NString pMrtlCode,NString pRelgCode,NString pSex,NString pConfidInd,NString pDeadInd,NString pVetcFileNumber,NString pLegalName,NString pPrefFirstName,NString pNamePrefix,NString pNameSuffix,NString pVeraInd,NString pCitzInd,NDate pDeadDate,NString pCitzCode,NString pHairCode,NString pEyesCode,NString pCityBirth,NString pStatCodeBirth,NString pDriverLicense,NString pStatCodeDriver,NString pNatnCodeDriver,NString pUomsCodeHeight,NNumber pHeight,NString pUomsCodeWeight,NNumber pWeight,NString pSdvetInd,NDate pLicenseIssuedDate,NDate pLicenseExpiresDate,NString pIncarInd,NNumber pItin,NDate pActiveDutySeprDate,NString pDataOrigin,NString pUserId,NString pEthnCde,NString pConfirmedReCde,NDate pConfirmedReDate,NString pArmedServMedVetInd,NString pCpfId,NString pOwnCpfInd,NString pCnpjCde,NString pRgCde,NString pStatCodeRg,NString pEntityRgCde,NString pCountyStatIns,NString pElecReg,NString pMilitaryId,NDate pIssueDateRg,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BIO_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_LGCY_CODE", pLgcyCode);
			cmd.addParameter("@P_ETHN_CODE", pEthnCode);
			cmd.addParameter("@P_MRTL_CODE", pMrtlCode);
			cmd.addParameter("@P_RELG_CODE", pRelgCode);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_CONFID_IND", pConfidInd);
			cmd.addParameter("@P_DEAD_IND", pDeadInd);
			cmd.addParameter("@P_VETC_FILE_NUMBER", pVetcFileNumber);
			cmd.addParameter("@P_LEGAL_NAME", pLegalName);
			cmd.addParameter("@P_PREF_FIRST_NAME", pPrefFirstName);
			cmd.addParameter("@P_NAME_PREFIX", pNamePrefix);
			cmd.addParameter("@P_NAME_SUFFIX", pNameSuffix);
			cmd.addParameter("@P_VERA_IND", pVeraInd);
			cmd.addParameter("@P_CITZ_IND", pCitzInd);
			cmd.addParameter("@P_DEAD_DATE", pDeadDate);
			cmd.addParameter("@P_CITZ_CODE", pCitzCode);
			cmd.addParameter("@P_HAIR_CODE", pHairCode);
			cmd.addParameter("@P_EYES_CODE", pEyesCode);
			cmd.addParameter("@P_CITY_BIRTH", pCityBirth);
			cmd.addParameter("@P_STAT_CODE_BIRTH", pStatCodeBirth);
			cmd.addParameter("@P_DRIVER_LICENSE", pDriverLicense);
			cmd.addParameter("@P_STAT_CODE_DRIVER", pStatCodeDriver);
			cmd.addParameter("@P_NATN_CODE_DRIVER", pNatnCodeDriver);
			cmd.addParameter("@P_UOMS_CODE_HEIGHT", pUomsCodeHeight);
			cmd.addParameter("@P_HEIGHT", pHeight);
			cmd.addParameter("@P_UOMS_CODE_WEIGHT", pUomsCodeWeight);
			cmd.addParameter("@P_WEIGHT", pWeight);
			cmd.addParameter("@P_SDVET_IND", pSdvetInd);
			cmd.addParameter("@P_LICENSE_ISSUED_DATE", pLicenseIssuedDate);
			cmd.addParameter("@P_LICENSE_EXPIRES_DATE", pLicenseExpiresDate);
			cmd.addParameter("@P_INCAR_IND", pIncarInd);
			cmd.addParameter("@P_ITIN", pItin);
			cmd.addParameter("@P_ACTIVE_DUTY_SEPR_DATE", pActiveDutySeprDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ETHN_CDE", pEthnCde);
			cmd.addParameter("@P_CONFIRMED_RE_CDE", pConfirmedReCde);
			cmd.addParameter("@P_CONFIRMED_RE_DATE", pConfirmedReDate);
			cmd.addParameter("@P_ARMED_SERV_MED_VET_IND", pArmedServMedVetInd);
			cmd.addParameter("@P_CPF_ID", pCpfId);
			cmd.addParameter("@P_OWN_CPF_IND", pOwnCpfInd);
			cmd.addParameter("@P_CNPJ_CDE", pCnpjCde);
			cmd.addParameter("@P_RG_CDE", pRgCde);
			cmd.addParameter("@P_STAT_CODE_RG", pStatCodeRg);
			cmd.addParameter("@P_ENTITY_RG_CDE", pEntityRgCde);
			cmd.addParameter("@P_COUNTY_STAT_INS", pCountyStatIns);
			cmd.addParameter("@P_ELEC_REG", pElecReg);
			cmd.addParameter("@P_MILITARY_ID", pMilitaryId);
			cmd.addParameter("@P_ISSUE_DATE_RG", pIssueDateRg);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pSsn,NDate pBirthDate,NString pLgcyCode,NString pEthnCode,NString pMrtlCode,NString pRelgCode,NString pSex,NString pConfidInd,NString pDeadInd,NString pVetcFileNumber,NString pLegalName,NString pPrefFirstName,NString pNamePrefix,NString pNameSuffix,NString pVeraInd,NString pCitzInd,NDate pDeadDate,NString pCitzCode,NString pHairCode,NString pEyesCode,NString pCityBirth,NString pStatCodeBirth,NString pDriverLicense,NString pStatCodeDriver,NString pNatnCodeDriver,NString pUomsCodeHeight,NNumber pHeight,NString pUomsCodeWeight,NNumber pWeight,NString pSdvetInd,NDate pLicenseIssuedDate,NDate pLicenseExpiresDate,NString pIncarInd,NNumber pItin,NDate pActiveDutySeprDate,NString pDataOrigin,NString pUserId,NString pEthnCde,NString pConfirmedReCde,NDate pConfirmedReDate,NString pArmedServMedVetInd,NString pCpfId,NString pOwnCpfInd,NString pCnpjCde,NString pRgCde,NString pStatCodeRg,NString pEntityRgCde,NString pCountyStatIns,NString pElecReg,NString pMilitaryId,NDate pIssueDateRg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BIO_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_LGCY_CODE", pLgcyCode);
			cmd.addParameter("@P_ETHN_CODE", pEthnCode);
			cmd.addParameter("@P_MRTL_CODE", pMrtlCode);
			cmd.addParameter("@P_RELG_CODE", pRelgCode);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_CONFID_IND", pConfidInd);
			cmd.addParameter("@P_DEAD_IND", pDeadInd);
			cmd.addParameter("@P_VETC_FILE_NUMBER", pVetcFileNumber);
			cmd.addParameter("@P_LEGAL_NAME", pLegalName);
			cmd.addParameter("@P_PREF_FIRST_NAME", pPrefFirstName);
			cmd.addParameter("@P_NAME_PREFIX", pNamePrefix);
			cmd.addParameter("@P_NAME_SUFFIX", pNameSuffix);
			cmd.addParameter("@P_VERA_IND", pVeraInd);
			cmd.addParameter("@P_CITZ_IND", pCitzInd);
			cmd.addParameter("@P_DEAD_DATE", pDeadDate);
			cmd.addParameter("@P_CITZ_CODE", pCitzCode);
			cmd.addParameter("@P_HAIR_CODE", pHairCode);
			cmd.addParameter("@P_EYES_CODE", pEyesCode);
			cmd.addParameter("@P_CITY_BIRTH", pCityBirth);
			cmd.addParameter("@P_STAT_CODE_BIRTH", pStatCodeBirth);
			cmd.addParameter("@P_DRIVER_LICENSE", pDriverLicense);
			cmd.addParameter("@P_STAT_CODE_DRIVER", pStatCodeDriver);
			cmd.addParameter("@P_NATN_CODE_DRIVER", pNatnCodeDriver);
			cmd.addParameter("@P_UOMS_CODE_HEIGHT", pUomsCodeHeight);
			cmd.addParameter("@P_HEIGHT", pHeight);
			cmd.addParameter("@P_UOMS_CODE_WEIGHT", pUomsCodeWeight);
			cmd.addParameter("@P_WEIGHT", pWeight);
			cmd.addParameter("@P_SDVET_IND", pSdvetInd);
			cmd.addParameter("@P_LICENSE_ISSUED_DATE", pLicenseIssuedDate);
			cmd.addParameter("@P_LICENSE_EXPIRES_DATE", pLicenseExpiresDate);
			cmd.addParameter("@P_INCAR_IND", pIncarInd);
			cmd.addParameter("@P_ITIN", pItin);
			cmd.addParameter("@P_ACTIVE_DUTY_SEPR_DATE", pActiveDutySeprDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ETHN_CDE", pEthnCde);
			cmd.addParameter("@P_CONFIRMED_RE_CDE", pConfirmedReCde);
			cmd.addParameter("@P_CONFIRMED_RE_DATE", pConfirmedReDate);
			cmd.addParameter("@P_ARMED_SERV_MED_VET_IND", pArmedServMedVetInd);
			cmd.addParameter("@P_CPF_ID", pCpfId);
			cmd.addParameter("@P_OWN_CPF_IND", pOwnCpfInd);
			cmd.addParameter("@P_CNPJ_CDE", pCnpjCde);
			cmd.addParameter("@P_RG_CDE", pRgCde);
			cmd.addParameter("@P_STAT_CODE_RG", pStatCodeRg);
			cmd.addParameter("@P_ENTITY_RG_CDE", pEntityRgCde);
			cmd.addParameter("@P_COUNTY_STAT_INS", pCountyStatIns);
			cmd.addParameter("@P_ELEC_REG", pElecReg);
			cmd.addParameter("@P_MILITARY_ID", pMilitaryId);
			cmd.addParameter("@P_ISSUE_DATE_RG", pIssueDateRg);
				
			cmd.execute();


		}
		
	
	
	
}
