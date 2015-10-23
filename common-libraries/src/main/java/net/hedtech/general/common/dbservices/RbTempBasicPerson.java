package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbTempBasicPerson {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_BASIC_PERSON.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_BASIC_PERSON.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TempBasicPersonRecRow recOne,TempBasicPersonRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_BASIC_PERSON.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TempBasicPersonRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TempBasicPersonRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_BASIC_PERSON.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_BASIC_PERSON.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_BASIC_PERSON.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_BASIC_PERSON.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pSsn,NDate pBirthDate,NString pLgcyCode,NString pEthnCode,NString pMrtlCode,NString pRelgCode,NString pSex,NString pConfidInd,NString pDeadInd,NString pVetcFileNumber,NString pLegalName,NString pPrefFirstName,NString pNamePrefix,NString pNameSuffix,NString pBirthDay,NString pBirthMon,NString pBirthYear,NString pInfcCode,NString pAidyCode,NString pCitzInd,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_BASIC_PERSON.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_BIRTH_DAY", pBirthDay);
			cmd.addParameter("@P_BIRTH_MON", pBirthMon);
			cmd.addParameter("@P_BIRTH_YEAR", pBirthYear);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CITZ_IND", pCitzInd);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_BASIC_PERSON.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteBulk(NString pAidyCode,NString pInfcCode,NString pDeleteFlag,Ref<NNumber> pDelCountOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_BASIC_PERSON.P_DELETE_BULK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_DELETE_FLAG", pDeleteFlag);
			cmd.addParameter("@P_DEL_COUNT_OUT", NNumber.class);
				
			cmd.execute();
			pDelCountOut.val = cmd.getParameterValue("@P_DEL_COUNT_OUT", NNumber.class);


		}
		
		public static void pLock(NNumber pPidm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_BASIC_PERSON.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pSsn,NDate pBirthDate,NString pLgcyCode,NString pEthnCode,NString pMrtlCode,NString pRelgCode,NString pSex,NString pConfidInd,NString pDeadInd,NString pVetcFileNumber,NString pLegalName,NString pPrefFirstName,NString pNamePrefix,NString pNameSuffix,NString pBirthDay,NString pBirthMon,NString pBirthYear,NString pInfcCode,NString pAidyCode,NString pCitzInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_BASIC_PERSON.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_BIRTH_DAY", pBirthDay);
			cmd.addParameter("@P_BIRTH_MON", pBirthMon);
			cmd.addParameter("@P_BIRTH_YEAR", pBirthYear);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CITZ_IND", pCitzInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TempBasicPersonRecRow", dataSourceName="TEMP_BASIC_PERSON_REC")
	public static class TempBasicPersonRecRow
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
		@DbRecordField(dataSourceName="R_BIRTH_DAY")
		public NString RBirthDay;
		@DbRecordField(dataSourceName="R_BIRTH_MON")
		public NString RBirthMon;
		@DbRecordField(dataSourceName="R_BIRTH_YEAR")
		public NString RBirthYear;
		@DbRecordField(dataSourceName="R_INFC_CODE")
		public NString RInfcCode;
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_CITZ_IND")
		public NString RCitzInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
