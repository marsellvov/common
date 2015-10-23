package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvProvincialBusino {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUSINO.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pMtinCode,NString pProvCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUSINO.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_MTIN_CODE", pMtinCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ProvincialBusinoRecRow recOne,ProvincialBusinoRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUSINO.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ProvincialBusinoRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ProvincialBusinoRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pMtinCode,NString pProvCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUSINO.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_MTIN_CODE", pMtinCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUSINO.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pMtinCode,NString pProvCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUSINO.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_MTIN_CODE", pMtinCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pMtinCode,NString pProvCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUSINO.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_MTIN_CODE", pMtinCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pMtinCode,NString pProvCode,NString pXmitNumber,NNumber pXmitType,NString pXmitNameLine1,NString pXmitNameLine2,NString pXmitAddressLine1,NString pXmitAddressLine2,NString pXmitCity,NString pXmitProvCode,NString pXmitPostalCode,NString pXmitNatnCode,NString pContactName,NString pUserId,NString pSoftwareCertNum,NString pContactArea,NString pContactPhone,NString pContactExt,NString pEmailAddress,NString pLanguageInd,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUSINO.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MTIN_CODE", pMtinCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
			cmd.addParameter("@P_XMIT_NUMBER", pXmitNumber);
			cmd.addParameter("@P_XMIT_TYPE", pXmitType);
			cmd.addParameter("@P_XMIT_NAME_LINE_1", pXmitNameLine1);
			cmd.addParameter("@P_XMIT_NAME_LINE_2", pXmitNameLine2);
			cmd.addParameter("@P_XMIT_ADDRESS_LINE_1", pXmitAddressLine1);
			cmd.addParameter("@P_XMIT_ADDRESS_LINE_2", pXmitAddressLine2);
			cmd.addParameter("@P_XMIT_CITY", pXmitCity);
			cmd.addParameter("@P_XMIT_PROV_CODE", pXmitProvCode);
			cmd.addParameter("@P_XMIT_POSTAL_CODE", pXmitPostalCode);
			cmd.addParameter("@P_XMIT_NATN_CODE", pXmitNatnCode);
			cmd.addParameter("@P_CONTACT_NAME", pContactName);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SOFTWARE_CERT_NUM", pSoftwareCertNum);
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
		
		public static void pDelete(NString pMtinCode,NString pProvCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUSINO.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MTIN_CODE", pMtinCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pMtinCode,NString pProvCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUSINO.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MTIN_CODE", pMtinCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pMtinCode,NString pProvCode,NString pXmitNumber,NNumber pXmitType,NString pXmitNameLine1,NString pXmitNameLine2,NString pXmitAddressLine1,NString pXmitAddressLine2,NString pXmitCity,NString pXmitProvCode,NString pXmitPostalCode,NString pXmitNatnCode,NString pContactName,NString pUserId,NString pSoftwareCertNum,NString pContactArea,NString pContactPhone,NString pContactExt,NString pEmailAddress,NString pLanguageInd,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PROVINCIAL_BUSINO.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MTIN_CODE", pMtinCode);
			cmd.addParameter("@P_PROV_CODE", pProvCode);
			cmd.addParameter("@P_XMIT_NUMBER", pXmitNumber);
			cmd.addParameter("@P_XMIT_TYPE", pXmitType);
			cmd.addParameter("@P_XMIT_NAME_LINE_1", pXmitNameLine1);
			cmd.addParameter("@P_XMIT_NAME_LINE_2", pXmitNameLine2);
			cmd.addParameter("@P_XMIT_ADDRESS_LINE_1", pXmitAddressLine1);
			cmd.addParameter("@P_XMIT_ADDRESS_LINE_2", pXmitAddressLine2);
			cmd.addParameter("@P_XMIT_CITY", pXmitCity);
			cmd.addParameter("@P_XMIT_PROV_CODE", pXmitProvCode);
			cmd.addParameter("@P_XMIT_POSTAL_CODE", pXmitPostalCode);
			cmd.addParameter("@P_XMIT_NATN_CODE", pXmitNatnCode);
			cmd.addParameter("@P_CONTACT_NAME", pContactName);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SOFTWARE_CERT_NUM", pSoftwareCertNum);
			cmd.addParameter("@P_CONTACT_AREA", pContactArea);
			cmd.addParameter("@P_CONTACT_PHONE", pContactPhone);
			cmd.addParameter("@P_CONTACT_EXT", pContactExt);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_LANGUAGE_IND", pLanguageInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="ProvincialBusinoRecRow", dataSourceName="PROVINCIAL_BUSINO_REC", needsInitialization=true)
	public static class ProvincialBusinoRecRow
	{
		@DbRecordField(dataSourceName="R_MTIN_CODE")
		public NString RMtinCode;
		@DbRecordField(dataSourceName="R_PROV_CODE")
		public NString RProvCode;
		@DbRecordField(dataSourceName="R_XMIT_NUMBER")
		public NString RXmitNumber;
		@DbRecordField(dataSourceName="R_XMIT_TYPE")
		public NNumber RXmitType;
		@DbRecordField(dataSourceName="R_XMIT_NAME_LINE_1")
		public NString RXmitNameLine1;
		@DbRecordField(dataSourceName="R_XMIT_NAME_LINE_2")
		public NString RXmitNameLine2;
		@DbRecordField(dataSourceName="R_XMIT_ADDRESS_LINE_1")
		public NString RXmitAddressLine1;
		@DbRecordField(dataSourceName="R_XMIT_ADDRESS_LINE_2")
		public NString RXmitAddressLine2;
		@DbRecordField(dataSourceName="R_XMIT_CITY")
		public NString RXmitCity;
		@DbRecordField(dataSourceName="R_XMIT_PROV_CODE")
		public NString RXmitProvCode;
		@DbRecordField(dataSourceName="R_XMIT_POSTAL_CODE")
		public NString RXmitPostalCode;
		@DbRecordField(dataSourceName="R_XMIT_NATN_CODE")
		public NString RXmitNatnCode;
		@DbRecordField(dataSourceName="R_CONTACT_NAME")
		public NString RContactName;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_SOFTWARE_CERT_NUM")
		public NString RSoftwareCertNum;
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
