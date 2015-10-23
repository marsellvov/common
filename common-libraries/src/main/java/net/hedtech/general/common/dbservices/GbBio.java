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

public class GbBio {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BIO.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BIO.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(BioRecRow recOne,BioRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BIO.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, BioRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, BioRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BIO.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BIO.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static Cursor fQueryOne(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BIO.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BIO.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm, NString pSsn, NString pDataOrigin, Ref<byte[]> pRowidOut) {
			GbBio.pCreate(pPidm, pSsn, NDate.getNull(), NString.getNull(), 
					NString.getNull(), NString.getNull(), NString.getNull(), NString.getNull(), 
					NString.getNull(), NString.getNull(), NString.getNull(), 
					NString.getNull(), NString.getNull(), NString.getNull(), 
					NString.getNull(), NString.getNull(), NDate.getNull(), NString.getNull(), 
					NDate.getNull(), NString.getNull(), pDataOrigin, 
					NString.getNull(), NString.getNull(), NString.getNull(), NDate.getNull(), 
					NString.toStr("N"), pRowidOut);
		}
		
		public static void pCreate(
				NNumber pPidm, 
				NString pSsn,
				NString pMrtlCode,
				NString pSex, 
				NString pLegalName,
				NString pPrefFirstName, 
				NString pNamePrefix, 
				NString pNameSuffix,
				NString pDataOrigin, 
				NString pUserId, 
				Ref<byte[]> pRowidOut) {
			GbBio.pCreate(pPidm, pSsn, NDate.getNull(), NString.getNull(), 
					NString.getNull(), pMrtlCode, NString.getNull(), pSex, 
					NString.getNull(), NString.getNull(), NString.getNull(), 
					pLegalName, pPrefFirstName, pNamePrefix, 
					pNameSuffix, NString.getNull(), NDate.getNull(), NString.getNull(), 
					NDate.getNull(), NString.getNull(), pDataOrigin, 
					pUserId, NString.getNull(), NString.getNull(), NDate.getNull(), 
					NString.toStr("N"), pRowidOut);
			
		}
		
		public static void pCreate(
				NNumber pPidm, 
				NString pSsn,
				NDate pBirthDate, 
				NString pLgcyCode,
				NString pEthnCode, 
				NString pMrtlCode,
				NString pRelgCode, 
				NString pSex,
				NString pConfidInd, 
				NString pDeadInd,
				NString pVetcFileNumber, 
				NString pLegalName,
				NString pPrefFirstName, 
				NString pNamePrefix,
				NString pNameSuffix, 
				NString pVeraInd,
				NDate pDeadDate,
				NString pCitzCode, 
				NDate pActiveDutySeprDate, 
				NString pSdvetInd, 
				NString pDataOrigin,
				NString pUserId, 
				NString pEthnCde,
				NString pConfirmedReCde, 
				NDate pConfirmedReDate,
				NString pArmedServMedVetInd, Ref<byte[]> pRowidOut) {
			GbBio.pCreate(pPidm, pSsn, pBirthDate, 
					pLgcyCode, pEthnCode, pMrtlCode, 
					pRelgCode, pSex, pConfidInd, pDeadInd, 
					pVetcFileNumber, pLegalName, pPrefFirstName, 
					pNamePrefix, pNameSuffix, pVeraInd, 
					NString.getNull(), pDeadDate, pCitzCode, 
					NString.getNull(), NString.getNull(), NString.getNull(), NString.getNull(), 
					NString.getNull(), NString.getNull(), NString.getNull(), 
					NString.getNull(), NNumber.getNull(), NString.getNull(), NNumber.getNull(), 
					pSdvetInd, NDate.getNull(), NDate.getNull(), 
					NString.getNull(), NNumber.getNull(), pActiveDutySeprDate, pDataOrigin, 
					pUserId, pEthnCde, pConfirmedReCde, pConfirmedReDate, 
					pArmedServMedVetInd, pRowidOut);
			
		}

		
		public static void pCreate(
				NNumber pPidm,
				NString pSsn,
				NDate pBirthDate,
				NString pLgcyCode,
				NString pEthnCode,
				NString pMrtlCode,
				NString pRelgCode,
				NString pSex,
				NString pConfidInd,
				NString pDeadInd,
				NString pVetcFileNumber,
				NString pLegalName,
				NString pPrefFirstName,
				NString pNamePrefix,
				NString pNameSuffix,
				NString pVeraInd,
				NString pCitzInd,
				NDate pDeadDate,
				NString pCitzCode,
				NString pHairCode,
				NString pEyesCode,
				NString pCityBirth,
				NString pStatCodeBirth,
				NString pDriverLicense,
				NString pStatCodeDriver,
				NString pNatnCodeDriver,
				NString pUomsCodeHeight,
				NNumber pHeight,
				NString pUomsCodeWeight,
				NNumber pWeight,
				NString pSdvetInd,
				NDate pLicenseIssuedDate,
				NDate pLicenseExpiresDate,
				NString pIncarInd,
				NNumber pItin,
				NDate pActiveDutySeprDate,
				NString pDataOrigin,
				NString pUserId,
				NString pEthnCde,
				NString pConfirmedReCde,
				NDate pConfirmedReDate,NString pArmedServMedVetInd,Ref<byte[]> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BIO.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", String.class).getBytes();


		}
		
		public static void pDelete(NNumber pPidm,java.sql.RowId pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BIO.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", DbManager.getDataBaseFactory().rowidToString(pRowid));
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BIO.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(
				NNumber pPidm, 
				NString pSsn,
				NString pDataOrigin) {
			
			GbBio.pUpdate(pPidm, pSsn, DmlCommon.fUnspecifiedDate(), DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), 
					DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), 
					DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), 
					DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedDate(), DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedDate(), 
					DmlCommon.fUnspecifiedString(), pDataOrigin, GbCommon.fSctUser(), DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), 
					DmlCommon.fUnspecifiedDate(), NString.toStr("N"), null);
		}
		
		public static void pUpdate(
				NNumber pPidm, 
				NString pSsn,
				NString pMrtlCode, 
				NString pNamePrefix, 
				NString pNameSuffix,
				NString pPrefFirstName, 
				NString pLegalName, 
				NString pDataOrigin,
				NString pUserId, 
				java.sql.RowId pRowid) {
			GbBio.pUpdate(pPidm, pSsn, DmlCommon.fUnspecifiedDate(), DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), 
					pMrtlCode, DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), 
					DmlCommon.fUnspecifiedString(), pLegalName, pPrefFirstName, pNamePrefix, 
					pNameSuffix, DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedDate(), DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedDate(), 
					DmlCommon.fUnspecifiedString(), pDataOrigin, pUserId, DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), 
					DmlCommon.fUnspecifiedDate(), NString.toStr("N"), pRowid);
			
		}
		
		public static void pUpdate(
				NNumber pPidm, 
				NString pSsn,
				NDate pBirthDate, 
				NString pLgcyCode,
				NString pEthnCode, 
				NString pMrtlCode,
				NString pRelgCode, 
				NString pSex,
				NString pConfidInd, 
				NString pDeadInd,
				NString pVetcFileNumber,
				NString pLegalName,
				NString pPrefFirstName,
				NString pNamePrefix,
				NString pNameSuffix,
				NString pVeraInd,
				NDate pDeadDate,
				NString pCitzCode,
				NDate pActiveDutySeprDate,
				NString pSdvetInd,
				NString pDataOrigin,
				NString pUserId, 
				NString pEthnCde,
				NString pConfirmedReCde, 
				NDate pConfirmedReDate,
				NString pArmedServMedVetInd, 
				java.sql.RowId pRowid) {
			GbBio.pUpdate(pPidm, pSsn, pBirthDate, pLgcyCode, pEthnCode, pMrtlCode, 
					pRelgCode, pSex, pConfidInd, pDeadInd, pVetcFileNumber, pLegalName, 
					pPrefFirstName, pNamePrefix, pNameSuffix, pVeraInd, DmlCommon.fUnspecifiedString(), 
					pDeadDate, pCitzCode, DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), 
					DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedString(), 
					DmlCommon.fUnspecifiedNumber(), DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedNumber(), pSdvetInd, 
					DmlCommon.fUnspecifiedDate(), DmlCommon.fUnspecifiedDate(), DmlCommon.fUnspecifiedString(), DmlCommon.fUnspecifiedNumber(), 
					pActiveDutySeprDate, pDataOrigin, pUserId, pEthnCde, pConfirmedReCde, 
					pConfirmedReDate, pArmedServMedVetInd, pRowid);
			
		}
		
		public static void pUpdate(NNumber pPidm,NString pSsn,NDate pBirthDate,NString pLgcyCode,NString pEthnCode,NString pMrtlCode,NString pRelgCode,NString pSex,NString pConfidInd,NString pDeadInd,NString pVetcFileNumber,NString pLegalName,NString pPrefFirstName,NString pNamePrefix,NString pNameSuffix,NString pVeraInd,NString pCitzInd,NDate pDeadDate,NString pCitzCode,NString pHairCode,NString pEyesCode,NString pCityBirth,NString pStatCodeBirth,NString pDriverLicense,NString pStatCodeDriver,NString pNatnCodeDriver,NString pUomsCodeHeight,NNumber pHeight,NString pUomsCodeWeight,NNumber pWeight,NString pSdvetInd,NDate pLicenseIssuedDate,NDate pLicenseExpiresDate,NString pIncarInd,NNumber pItin,NDate pActiveDutySeprDate,NString pDataOrigin,NString pUserId,NString pEthnCde,NString pConfirmedReCde,NDate pConfirmedReDate,NString pArmedServMedVetInd,java.sql.RowId pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_BIO.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID",  DbManager.getDataBaseFactory().rowidToString(pRowid));
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="BioRecRow", dataSourceName="BIO_REC")
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
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		public BioRecRow() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public BioRecRow(Row spbpersRefResults) {
			super();
			RPidm = toNumber(spbpersRefResults.getObject(1));
			RSsn = toStr(spbpersRefResults.getObject(2));
			RBirthDate = toDate(spbpersRefResults.getObject(3));
			RLgcyCode = toStr(spbpersRefResults.getObject(4));
			REthnCode = toStr(spbpersRefResults.getObject(5));
			RMrtlCode = toStr(spbpersRefResults.getObject(6));
			RRelgCode = toStr(spbpersRefResults.getObject(7));
			RSex = toStr(spbpersRefResults.getObject(8));
			RConfidInd = toStr(spbpersRefResults.getObject(9));
			RDeadInd = toStr(spbpersRefResults.getObject(10));
			RVetcFileNumber = toStr(spbpersRefResults.getObject(11));
			RLegalName = toStr(spbpersRefResults.getObject(12));
			RPrefFirstName = toStr(spbpersRefResults.getObject(13));
			RNamePrefix = toStr(spbpersRefResults.getObject(14));
			RNameSuffix = toStr(spbpersRefResults.getObject(15));
			RVeraInd = toStr(spbpersRefResults.getObject(16));
			RCitzInd = toStr(spbpersRefResults.getObject(17));
			RDeadDate = toDate(spbpersRefResults.getObject(18));
			RCitzCode = toStr(spbpersRefResults.getObject(19));
			RHairCode = toStr(spbpersRefResults.getObject(20));
			REyesCode = toStr(spbpersRefResults.getObject(21));
			RCityBirth = toStr(spbpersRefResults.getObject(22));
			RStatCodeBirth = toStr(spbpersRefResults.getObject(23));
			RDriverLicense = toStr(spbpersRefResults.getObject(24));
			RStatCodeDriver = toStr(spbpersRefResults.getObject(25));
			RNatnCodeDriver = toStr(spbpersRefResults.getObject(26));
			RUomsCodeHeight = toStr(spbpersRefResults.getObject(27));
			RHeight = toNumber(spbpersRefResults.getObject(28));
			RUomsCodeWeight = toStr(spbpersRefResults.getObject(29));
			RWeight = toNumber(spbpersRefResults.getObject(30));
			RSdvetInd = toStr(spbpersRefResults.getObject(31));
			RLicenseIssuedDate = toDate(spbpersRefResults.getObject(32));
			RLicenseExpiresDate = toDate(spbpersRefResults.getObject(33));
			RIncarInd = toStr(spbpersRefResults.getObject(34));
			RItin = toNumber(spbpersRefResults.getObject(35));
			RActiveDutySeprDate = toDate(spbpersRefResults.getObject(36));
			RDataOrigin = toStr(spbpersRefResults.getObject(37));
			RUserId = toStr(spbpersRefResults.getObject(38));
			REthnCde = toStr(spbpersRefResults.getObject(39));
			RConfirmedReCde = toStr(spbpersRefResults.getObject(40));
			RConfirmedReDate = toDate(spbpersRefResults.getObject(41));
			RArmedServMedVetInd = toStr(spbpersRefResults.getObject(42));
			RInternalRecordId = toStr(spbpersRefResults.getObject(43));
		}
	}



	



	



	







	

	
	
}
