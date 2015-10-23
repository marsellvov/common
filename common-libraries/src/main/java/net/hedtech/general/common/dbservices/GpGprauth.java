package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpGprauth {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRAUTH.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pProxyIdm,NNumber pPersonPidm,NString pPageName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRAUTH.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_PAGE_NAME", pPageName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GprauthRecRow recOne,GprauthRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRAUTH.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GprauthRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GprauthRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pProxyIdm,NNumber pPersonPidm,NString pPageName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRAUTH.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_PAGE_NAME", pPageName);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRAUTH.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pProxyIdm,NNumber pPersonPidm,NString pPageName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRAUTH.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_PAGE_NAME", pPageName);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pProxyIdm,NNumber pPersonPidm,NString pPageName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRAUTH.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_PAGE_NAME", pPageName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pProxyIdm,NNumber pPersonPidm,NString pPageName,NString pAuthInd,NString pCreateUser,NDate pCreateDate,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRAUTH.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_PAGE_NAME", pPageName);
			cmd.addParameter("@P_AUTH_IND", pAuthInd);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pProxyIdm,NNumber pPersonPidm,NString pPageName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRAUTH.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_PAGE_NAME", pPageName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pProxyIdm,NNumber pPersonPidm,NString pPageName,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRAUTH.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_PAGE_NAME", pPageName);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pProxyIdm,NNumber pPersonPidm,NString pPageName,NString pAuthInd,NString pCreateUser,NDate pCreateDate,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRAUTH.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_PAGE_NAME", pPageName);
			cmd.addParameter("@P_AUTH_IND", pAuthInd);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="GprauthRecRow", dataSourceName="GPRAUTH_REC")
	public static class GprauthRecRow
	{
		@DbRecordField(dataSourceName="R_PROXY_IDM")
		public NNumber RProxyIdm;
		@DbRecordField(dataSourceName="R_PERSON_PIDM")
		public NNumber RPersonPidm;
		@DbRecordField(dataSourceName="R_PAGE_NAME")
		public NString RPageName;
		@DbRecordField(dataSourceName="R_AUTH_IND")
		public NString RAuthInd;
		@DbRecordField(dataSourceName="R_CREATE_USER")
		public NString RCreateUser;
		@DbRecordField(dataSourceName="R_CREATE_DATE")
		public NDate RCreateDate;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
