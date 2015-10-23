package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;
import static morphis.foundations.core.types.Types.*;


public class GvBio {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BIO.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BIO.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(BioRecRow recOne,BioRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BIO.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, BioRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, BioRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BIO.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BIO.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static Cursor fQueryOne(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BIO.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BIO.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pSsn,NDate pBirthDate,NString pLgcyCode,NString pEthnCode,NString pMrtlCode,NString pRelgCode,NString pSex,NString pConfidInd,NString pDeadInd,NString pVetcFileNumber,NString pLegalName,NString pPrefFirstName,NString pNamePrefix,NString pNameSuffix,NString pVeraInd,NString pCitzInd,NDate pDeadDate,NString pCitzCode,NString pHairCode,NString pEyesCode,NString pCityBirth,NString pStatCodeBirth,NString pDriverLicense,NString pStatCodeDriver,NString pNatnCodeDriver,NString pUomsCodeHeight,NNumber pHeight,NString pUomsCodeWeight,NNumber pWeight,NString pSdvetInd,NDate pLicenseIssuedDate,NDate pLicenseExpiresDate,NString pIncarInd,NNumber pItin,NDate pActiveDutySeprDate,NString pDataOrigin,NString pUserId,NString pEthnCde,NString pConfirmedReCde,NDate pConfirmedReDate,NString pArmedServMedVetInd,NString pCpfId,NString pOwnCpfInd,NString pCnpjCde,NString pRgCde,NString pStatCodeRg,NString pEntityRgCde,NString pCountyStatIns,NString pElecReg,NString pMilitaryId,NDate pIssueDateRg,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BIO.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BIO.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BIO.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pSsn,NDate pBirthDate,NString pLgcyCode,NString pEthnCode,NString pMrtlCode,NString pRelgCode,NString pSex,NString pConfidInd,NString pDeadInd,NString pVetcFileNumber,NString pLegalName,NString pPrefFirstName,NString pNamePrefix,NString pNameSuffix,NString pVeraInd,NString pCitzInd,NDate pDeadDate,NString pCitzCode,NString pHairCode,NString pEyesCode,NString pCityBirth,NString pStatCodeBirth,NString pDriverLicense,NString pStatCodeDriver,NString pNatnCodeDriver,NString pUomsCodeHeight,NNumber pHeight,NString pUomsCodeWeight,NNumber pWeight,NString pSdvetInd,NDate pLicenseIssuedDate,NDate pLicenseExpiresDate,NString pIncarInd,NNumber pItin,NDate pActiveDutySeprDate,NString pDataOrigin,NString pUserId,NString pEthnCde,NString pConfirmedReCde,NDate pConfirmedReDate,NString pArmedServMedVetInd,NString pCpfId,NString pOwnCpfInd,NString pCnpjCde,NString pRgCde,NString pStatCodeRg,NString pEntityRgCde,NString pCountyStatIns,NString pElecReg,NString pMilitaryId,NDate pIssueDateRg,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_BIO.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="BioRecRow", dataSourceName="BIO_REC" /* ,needsInitialization=true*/)
	public static class BioRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SSN")
		public NString RSsn;
		@DbRecordField(dataSourceName="R_BIRTH_DATE")
		public NDate RBirthDate;
		@DbRecordField(dataSourceName="R_LGCY_CODE")
		public NString RLgcyCode;
		@DbRecordField(dataSourceName="R_ETHN_CODE")
		public NString REthnCode;
		@DbRecordField(dataSourceName="R_MRTL_CODE")
		public NString RMrtlCode;
		@DbRecordField(dataSourceName="R_RELG_CODE")
		public NString RRelgCode;
		@DbRecordField(dataSourceName="R_SEX")
		public NString RSex;
		@DbRecordField(dataSourceName="R_CONFID_IND")
		public NString RConfidInd;
		@DbRecordField(dataSourceName="R_DEAD_IND")
		public NString RDeadInd;
		@DbRecordField(dataSourceName="R_VETC_FILE_NUMBER")
		public NString RVetcFileNumber;
		@DbRecordField(dataSourceName="R_LEGAL_NAME")
		public NString RLegalName;
		@DbRecordField(dataSourceName="R_PREF_FIRST_NAME")
		public NString RPrefFirstName;
		@DbRecordField(dataSourceName="R_NAME_PREFIX")
		public NString RNamePrefix;
		@DbRecordField(dataSourceName="R_NAME_SUFFIX")
		public NString RNameSuffix;
		@DbRecordField(dataSourceName="R_VERA_IND")
		public NString RVeraInd;
		@DbRecordField(dataSourceName="R_CITZ_IND")
		public NString RCitzInd;
		@DbRecordField(dataSourceName="R_DEAD_DATE")
		public NDate RDeadDate;
		@DbRecordField(dataSourceName="R_CITZ_CODE")
		public NString RCitzCode;
		@DbRecordField(dataSourceName="R_HAIR_CODE")
		public NString RHairCode;
		@DbRecordField(dataSourceName="R_EYES_CODE")
		public NString REyesCode;
		@DbRecordField(dataSourceName="R_CITY_BIRTH")
		public NString RCityBirth;
		@DbRecordField(dataSourceName="R_STAT_CODE_BIRTH")
		public NString RStatCodeBirth;
		@DbRecordField(dataSourceName="R_DRIVER_LICENSE")
		public NString RDriverLicense;
		@DbRecordField(dataSourceName="R_STAT_CODE_DRIVER")
		public NString RStatCodeDriver;
		@DbRecordField(dataSourceName="R_NATN_CODE_DRIVER")
		public NString RNatnCodeDriver;
		@DbRecordField(dataSourceName="R_UOMS_CODE_HEIGHT")
		public NString RUomsCodeHeight;
		@DbRecordField(dataSourceName="R_HEIGHT")
		public NNumber RHeight;
		@DbRecordField(dataSourceName="R_UOMS_CODE_WEIGHT")
		public NString RUomsCodeWeight;
		@DbRecordField(dataSourceName="R_WEIGHT")
		public NNumber RWeight;
		@DbRecordField(dataSourceName="R_SDVET_IND")
		public NString RSdvetInd;
		@DbRecordField(dataSourceName="R_LICENSE_ISSUED_DATE")
		public NDate RLicenseIssuedDate;
		@DbRecordField(dataSourceName="R_LICENSE_EXPIRES_DATE")
		public NDate RLicenseExpiresDate;
		@DbRecordField(dataSourceName="R_INCAR_IND")
		public NString RIncarInd;
		@DbRecordField(dataSourceName="R_ITIN")
		public NNumber RItin;
		@DbRecordField(dataSourceName="R_ACTIVE_DUTY_SEPR_DATE")
		public NDate RActiveDutySeprDate;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_ETHN_CDE")
		public NString REthnCde;
		@DbRecordField(dataSourceName="R_CONFIRMED_RE_CDE")
		public NString RConfirmedReCde;
		@DbRecordField(dataSourceName="R_CONFIRMED_RE_DATE")
		public NDate RConfirmedReDate;
		@DbRecordField(dataSourceName="R_ARMED_SERV_MED_VET_IND")
		public NString RArmedServMedVetInd;
		@DbRecordField(dataSourceName="R_CPF_ID")
		public NString RCpfId;
		@DbRecordField(dataSourceName="R_OWN_CPF_IND")
		public NString ROwnCpfInd;
		@DbRecordField(dataSourceName="R_CNPJ_CDE")
		public NString RCnpjCde;
		@DbRecordField(dataSourceName="R_RG_CDE")
		public NString RRgCde;
		@DbRecordField(dataSourceName="R_STAT_CODE_RG")
		public NString RStatCodeRg;
		@DbRecordField(dataSourceName="R_ENTITY_RG_CDE")
		public NString REntityRgCde;
		@DbRecordField(dataSourceName="R_COUNTY_STAT_INS")
		public NString RCountyStatIns;
		@DbRecordField(dataSourceName="R_ELEC_REG")
		public NString RElecReg;
		@DbRecordField(dataSourceName="R_MILITARY_ID")
		public NString RMilitaryId;
		@DbRecordField(dataSourceName="R_ISSUE_DATE_RG")
		public NDate RIssueDateRg;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		
		public BioRecRow () {
			super();
		}
		
		public BioRecRow(Row row){
			RPidm = toNumber(row.getObject("SPBPERS_PIDM"));
			this.RSsn= toStr(row.getObject("SPBPERS_SSN"));
			this.RBirthDate= toDate(row.getObject("SPBPERS_BIRTH_DATE"));
			this.RLgcyCode= toStr(row.getObject("SPBPERS_LGCY_CODE"));
			this.REthnCode= toStr(row.getObject("SPBPERS_ETHN_CODE"));
			this.RMrtlCode= toStr(row.getObject("SPBPERS_MRTL_CODE"));
			this.RRelgCode= toStr(row.getObject("SPBPERS_RELG_CODE"));
			this.RSex= toStr(row.getObject("SPBPERS_SEX"));
			this.RConfidInd= toStr(row.getObject("SPBPERS_CONFID_IND"));
			this.RDeadInd= toStr(row.getObject("SPBPERS_DEAD_IND"));
			this.RVetcFileNumber= toStr(row.getObject("SPBPERS_VETC_FILE_NUMBER"));
			this.RLegalName= toStr(row.getObject("SPBPERS_LEGAL_NAME"));
			this.RPrefFirstName= toStr(row.getObject("SPBPERS_PREF_FIRST_NAME"));
			this.RNamePrefix= toStr(row.getObject("SPBPERS_NAME_PREFIX"));
			this.RNameSuffix= toStr(row.getObject("SPBPERS_NAME_SUFFIX"));
			this.RVeraInd= toStr(row.getObject("SPBPERS_VERA_IND"));
			this.RCitzInd= toStr(row.getObject("SPBPERS_CITZ_IND"));
			this.RDeadDate= toDate(row.getObject("SPBPERS_DEAD_DATE"));
			this.RCitzCode= toStr(row.getObject("SPBPERS_CITZ_CODE"));
			this.RHairCode= toStr(row.getObject("SPBPERS_HAIR_CODE"));
			this.REyesCode= toStr(row.getObject("SPBPERS_EYES_CODE"));
			this.RCityBirth= toStr(row.getObject("SPBPERS_CITY_BIRTH"));
			this.RStatCodeBirth= toStr(row.getObject("SPBPERS_STAT_CODE_BIRTH"));
			this.RDriverLicense= toStr(row.getObject("SPBPERS_DRIVER_LICENSE"));
			this.RStatCodeDriver= toStr(row.getObject("SPBPERS_STAT_CODE_DRIVER"));
			this.RNatnCodeDriver= toStr(row.getObject("SPBPERS_NATN_CODE_DRIVER"));
			this.RUomsCodeHeight= toStr(row.getObject("SPBPERS_UOMS_CODE_HEIGHT"));
			this.RHeight= toNumber(row.getObject("SPBPERS_HEIGHT"));
			this.RUomsCodeWeight= toStr(row.getObject("SPBPERS_UOMS_CODE_WEIGHT"));
			this.RWeight= toNumber(row.getObject("SPBPERS_WEIGHT"));
			this.RSdvetInd= toStr(row.getObject("SPBPERS_SDVET_IND"));
			this.RLicenseIssuedDate= toDate(row.getObject("SPBPERS_LICENSE_ISSUED_DATE"));
			this.RLicenseExpiresDate= toDate(row.getObject("SPBPERS_LICENSE_EXPIRES_DATE"));
			this.RIncarInd= toStr(row.getObject("SPBPERS_INCAR_IND"));
			this.RActiveDutySeprDate= toDate(row.getObject("SPBPERS_ACTIVE_DUTY_SEPR_DATE"));
			this.RDataOrigin= toStr(row.getObject("SPBPERS_DATA_ORIGIN"));
			this.RUserId= toStr(row.getObject("SPBPERS_USER_ID"));
			this.REthnCde= toStr(row.getObject("SPBPERS_ETHN_CDE"));
			this.RConfirmedReCde= toStr(row.getObject("SPBPERS_CONFIRMED_RE_CDE"));
			this.RConfirmedReDate= toDate(row.getObject("SPBPERS_CONFIRMED_RE_DATE"));
			this.RArmedServMedVetInd= toStr(row.getObject("SPBPERS_ARMED_SERV_MED_VET_IND"));
			this.RCpfId= toStr(row.getObject("SPBPERS_CPF_ID"));
			this.ROwnCpfInd= toStr(row.getObject("SPBPERS_OWN_CPF_IND"));
			this.RCnpjCde= toStr(row.getObject("SPBPERS_CNPJ_CDE"));
			this.RRgCde= toStr(row.getObject("SPBPERS_RG_CDE"));
			this.RStatCodeRg= toStr(row.getObject("SPBPERS_STAT_CODE_RG"));
			this.REntityRgCde= toStr(row.getObject("SPBPERS_ENTITY_RG_CDE"));
			this.RCountyStatIns= toStr(row.getObject("SPBPERS_COUNTY_STAT_INS"));
			this.RElecReg= toStr(row.getObject("SPBPERS_ELEC_REG"));
			this.RMilitaryId= toStr(row.getObject("SPBPERS_MILITARY_ID"));
			this.RIssueDateRg= toDate(row.getObject("SPBPERS_ISSUE_DATE_RG"));
		}
	}

	
	
}
