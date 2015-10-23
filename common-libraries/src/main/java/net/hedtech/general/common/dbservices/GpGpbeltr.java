package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpGpbeltr {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBELTR.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBELTR.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GpbeltrRecRow recOne,GpbeltrRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBELTR.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GpbeltrRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GpbeltrRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pSystCode,NString pCtypCode,NString pCtypUrl,NDate pCtypExpDate,NDate pCtypExeDate,NDate pTransmitDate,NNumber pProxyIdm,NString pProxyOldData,NString pProxyNewData,NNumber pPersonPidm,NString pUserId,NDate pCreateDate,NString pCreateUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBELTR.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_CTYP_URL", pCtypUrl);
			cmd.addParameter("@P_CTYP_EXP_DATE", pCtypExpDate);
			cmd.addParameter("@P_CTYP_EXE_DATE", pCtypExeDate);
			cmd.addParameter("@P_TRANSMIT_DATE", pTransmitDate);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_PROXY_OLD_DATA", pProxyOldData);
			cmd.addParameter("@P_PROXY_NEW_DATA", pProxyNewData);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBELTR.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pSystCode,NString pCtypCode,NString pCtypUrl,NDate pCtypExpDate,NDate pCtypExeDate,NDate pTransmitDate,NNumber pProxyIdm,NString pProxyOldData,NString pProxyNewData,NNumber pPersonPidm,NString pUserId,NDate pCreateDate,NString pCreateUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBELTR.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_CTYP_URL", pCtypUrl);
			cmd.addParameter("@P_CTYP_EXP_DATE", pCtypExpDate);
			cmd.addParameter("@P_CTYP_EXE_DATE", pCtypExeDate);
			cmd.addParameter("@P_TRANSMIT_DATE", pTransmitDate);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_PROXY_OLD_DATA", pProxyOldData);
			cmd.addParameter("@P_PROXY_NEW_DATA", pProxyNewData);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pSystCode,NString pCtypCode,NString pCtypUrl,NDate pCtypExpDate,NDate pCtypExeDate,NDate pTransmitDate,NNumber pProxyIdm,NString pProxyOldData,NString pProxyNewData,NNumber pPersonPidm,NString pUserId,NDate pCreateDate,NString pCreateUser,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBELTR.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_CTYP_URL", pCtypUrl);
			cmd.addParameter("@P_CTYP_EXP_DATE", pCtypExpDate);
			cmd.addParameter("@P_CTYP_EXE_DATE", pCtypExeDate);
			cmd.addParameter("@P_TRANSMIT_DATE", pTransmitDate);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_PROXY_OLD_DATA", pProxyOldData);
			cmd.addParameter("@P_PROXY_NEW_DATA", pProxyNewData);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pSystCode,NString pCtypCode,NString pCtypUrl,NDate pCtypExpDate,NDate pCtypExeDate,NDate pTransmitDate,NNumber pProxyIdm,NString pProxyOldData,NString pProxyNewData,NNumber pPersonPidm,NString pUserId,NDate pCreateDate,NString pCreateUser,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBELTR.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_CTYP_URL", pCtypUrl);
			cmd.addParameter("@P_CTYP_EXP_DATE", pCtypExpDate);
			cmd.addParameter("@P_CTYP_EXE_DATE", pCtypExeDate);
			cmd.addParameter("@P_TRANSMIT_DATE", pTransmitDate);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_PROXY_OLD_DATA", pProxyOldData);
			cmd.addParameter("@P_PROXY_NEW_DATA", pProxyNewData);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pSystCode,NString pCtypCode,NString pCtypUrl,NDate pCtypExpDate,NDate pCtypExeDate,NDate pTransmitDate,NNumber pProxyIdm,NString pProxyOldData,NString pProxyNewData,NNumber pPersonPidm,NString pUserId,NDate pCreateDate,NString pCreateUser,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBELTR.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_CTYP_URL", pCtypUrl);
			cmd.addParameter("@P_CTYP_EXP_DATE", pCtypExpDate);
			cmd.addParameter("@P_CTYP_EXE_DATE", pCtypExeDate);
			cmd.addParameter("@P_TRANSMIT_DATE", pTransmitDate);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_PROXY_OLD_DATA", pProxyOldData);
			cmd.addParameter("@P_PROXY_NEW_DATA", pProxyNewData);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBELTR.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pSystCode,NString pCtypCode,NString pCtypUrl,NDate pCtypExpDate,NDate pCtypExeDate,NDate pTransmitDate,NNumber pProxyIdm,NString pProxyOldData,NString pProxyNewData,NNumber pPersonPidm,NString pUserId,NDate pCreateDate,NString pCreateUser,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPBELTR.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_CTYP_URL", pCtypUrl);
			cmd.addParameter("@P_CTYP_EXP_DATE", pCtypExpDate);
			cmd.addParameter("@P_CTYP_EXE_DATE", pCtypExeDate);
			cmd.addParameter("@P_TRANSMIT_DATE", pTransmitDate);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_PROXY_OLD_DATA", pProxyOldData);
			cmd.addParameter("@P_PROXY_NEW_DATA", pProxyNewData);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="GpbeltrRecRow", dataSourceName="GPBELTR_REC")
	public static class GpbeltrRecRow
	{
		@DbRecordField(dataSourceName="R_SYST_CODE")
		public NString RSystCode;
		@DbRecordField(dataSourceName="R_CTYP_CODE")
		public NString RCtypCode;
		@DbRecordField(dataSourceName="R_CTYP_URL")
		public NString RCtypUrl;
		@DbRecordField(dataSourceName="R_CTYP_EXP_DATE")
		public NDate RCtypExpDate;
		@DbRecordField(dataSourceName="R_CTYP_EXE_DATE")
		public NDate RCtypExeDate;
		@DbRecordField(dataSourceName="R_TRANSMIT_DATE")
		public NDate RTransmitDate;
		@DbRecordField(dataSourceName="R_PROXY_IDM")
		public NNumber RProxyIdm;
		@DbRecordField(dataSourceName="R_PROXY_OLD_DATA")
		public NString RProxyOldData;
		@DbRecordField(dataSourceName="R_PROXY_NEW_DATA")
		public NString RProxyNewData;
		@DbRecordField(dataSourceName="R_PERSON_PIDM")
		public NNumber RPersonPidm;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_CREATE_DATE")
		public NDate RCreateDate;
		@DbRecordField(dataSourceName="R_CREATE_USER")
		public NString RCreateUser;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
