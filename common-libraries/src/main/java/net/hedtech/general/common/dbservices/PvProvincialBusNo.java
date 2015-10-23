package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvProvincialBusNo {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUS_NO.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pEmprCode,NString pProvCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUS_NO.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ProvincialBusNoRecRow recOne,ProvincialBusNoRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUS_NO.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ProvincialBusNoRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ProvincialBusNoRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEmprCode,NString pProvCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUS_NO.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUS_NO.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEmprCode,NString pProvCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUS_NO.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEmprCode,NString pProvCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUS_NO.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEmprCode,NString pProvCode,NString pBusinessNumber,NString pContactName,NString pUserId,NString pEnterpriseNumber,NString pContactArea,NString pContactPhone,NString pContactExt,NString pEmailAddress,NString pLanguageInd,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUS_NO.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
			cmd.addParameter("@P_BUSINESS_NUMBER", pBusinessNumber);
			cmd.addParameter("@P_CONTACT_NAME", pContactName);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ENTERPRISE_NUMBER", pEnterpriseNumber);
			cmd.addParameter("@P_CONTACT_AREA", pContactArea);
			cmd.addParameter("@P_CONTACT_PHONE", pContactPhone);
			cmd.addParameter("@P_CONTACT_EXT", pContactExt);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_LANGUAGE_IND", pLanguageInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pEmprCode,NString pProvCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUS_NO.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pEmprCode,NString pProvCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUS_NO.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEmprCode,NString pProvCode,NString pBusinessNumber,NString pContactName,NString pUserId,NString pEnterpriseNumber,NString pContactArea,NString pContactPhone,NString pContactExt,NString pEmailAddress,NString pLanguageInd,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUS_NO.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
			cmd.addParameter("@P_BUSINESS_NUMBER", pBusinessNumber);
			cmd.addParameter("@P_CONTACT_NAME", pContactName);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ENTERPRISE_NUMBER", pEnterpriseNumber);
			cmd.addParameter("@P_CONTACT_AREA", pContactArea);
			cmd.addParameter("@P_CONTACT_PHONE", pContactPhone);
			cmd.addParameter("@P_CONTACT_EXT", pContactExt);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_LANGUAGE_IND", pLanguageInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="ProvincialBusNoRecRow", dataSourceName="PROVINCIAL_BUS_NO_REC", needsInitialization=true)
	public static class ProvincialBusNoRecRow
	{
		@DbRecordField(dataSourceName="R_EMPR_CODE")
		public NString REmprCode;
		@DbRecordField(dataSourceName="R_PROV_CODE")
		public NString RProvCode;
		@DbRecordField(dataSourceName="R_BUSINESS_NUMBER")
		public NString RBusinessNumber;
		@DbRecordField(dataSourceName="R_CONTACT_NAME")
		public NString RContactName;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_ENTERPRISE_NUMBER")
		public NString REnterpriseNumber;
		@DbRecordField(dataSourceName="R_CONTACT_AREA")
		public NString RContactArea;
		@DbRecordField(dataSourceName="R_CONTACT_PHONE")
		public NString RContactPhone;
		@DbRecordField(dataSourceName="R_CONTACT_EXT")
		public NString RContactExt;
		@DbRecordField(dataSourceName="R_EMAIL_ADDRESS")
		public NString REmailAddress;
		@DbRecordField(dataSourceName="R_LANGUAGE_IND")
		public NString RLanguageInd;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
