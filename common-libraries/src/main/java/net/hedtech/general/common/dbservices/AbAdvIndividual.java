package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class AbAdvIndividual {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_INDIVIDUAL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_INDIVIDUAL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(AdvIndividualRecRow recOne,AdvIndividualRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_INDIVIDUAL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AdvIndividualRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AdvIndividualRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_INDIVIDUAL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_INDIVIDUAL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_INDIVIDUAL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_INDIVIDUAL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pPrefLastName,NString pPrefFirstName,NString pPrefMi,NString pNickname,NString pGradName,NString pParentsName,NString pMaidenLastName,NString pPrefClas,NString pCollCodePref,NString pHomeCity,NString pStatCodeHome,NString pNatnCodeHome,NString pCmName,NString pAtypCodeCm,NString pDottCode,NString pIncmCode,NString pAtypCodePref,NString pAddrName,NString pAtypCodeGeor,NString pSocietyName,NString pDataOrigin,NString pUserId,NString pDonrCode,NString pSurnamePrefix,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_INDIVIDUAL.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_INDIVIDUAL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_INDIVIDUAL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pPrefLastName,NString pPrefFirstName,NString pPrefMi,NString pNickname,NString pGradName,NString pParentsName,NString pMaidenLastName,NString pPrefClas,NString pCollCodePref,NString pHomeCity,NString pStatCodeHome,NString pNatnCodeHome,NString pCmName,NString pAtypCodeCm,NString pDottCode,NString pIncmCode,NString pAtypCodePref,NString pAddrName,NString pAtypCodeGeor,NString pSocietyName,NString pDataOrigin,NString pUserId,NString pSurnamePrefix,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_ADV_INDIVIDUAL.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="AdvIndividualRecRow", dataSourceName="ADV_INDIVIDUAL_REC")
	public static class AdvIndividualRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_PREF_LAST_NAME")
		public NString RPrefLastName;
		@DbRecordField(dataSourceName="R_PREF_FIRST_NAME")
		public NString RPrefFirstName;
		@DbRecordField(dataSourceName="R_PREF_MI")
		public NString RPrefMi;
		@DbRecordField(dataSourceName="R_NICKNAME")
		public NString RNickname;
		@DbRecordField(dataSourceName="R_GRAD_NAME")
		public NString RGradName;
		@DbRecordField(dataSourceName="R_PARENTS_NAME")
		public NString RParentsName;
		@DbRecordField(dataSourceName="R_MAIDEN_LAST_NAME")
		public NString RMaidenLastName;
		@DbRecordField(dataSourceName="R_PREF_CLAS")
		public NString RPrefClas;
		@DbRecordField(dataSourceName="R_COLL_CODE_PREF")
		public NString RCollCodePref;
		@DbRecordField(dataSourceName="R_HOME_CITY")
		public NString RHomeCity;
		@DbRecordField(dataSourceName="R_STAT_CODE_HOME")
		public NString RStatCodeHome;
		@DbRecordField(dataSourceName="R_NATN_CODE_HOME")
		public NString RNatnCodeHome;
		@DbRecordField(dataSourceName="R_CM_NAME")
		public NString RCmName;
		@DbRecordField(dataSourceName="R_ATYP_CODE_CM")
		public NString RAtypCodeCm;
		@DbRecordField(dataSourceName="R_DOTT_CODE")
		public NString RDottCode;
		@DbRecordField(dataSourceName="R_INCM_CODE")
		public NString RIncmCode;
		@DbRecordField(dataSourceName="R_ATYP_CODE_PREF")
		public NString RAtypCodePref;
		@DbRecordField(dataSourceName="R_ADDR_NAME")
		public NString RAddrName;
		@DbRecordField(dataSourceName="R_ATYP_CODE_GEOR")
		public NString RAtypCodeGeor;
		@DbRecordField(dataSourceName="R_SOCIETY_NAME")
		public NString RSocietyName;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_SURNAME_PREFIX")
		public NString RSurnamePrefix;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
