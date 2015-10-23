package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpGprhist {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRHIST.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRHIST.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GprhistRecRow recOne,GprhistRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRHIST.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GprhistRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GprhistRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPersonPidm,NString pPageName,NString pOldAuthInd,NString pNewAuthInd,NString pCreateUser,NDate pCreateDate,NString pUserId,NNumber pProxyIdm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRHIST.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_PAGE_NAME", pPageName);
			cmd.addParameter("@P_OLD_AUTH_IND", pOldAuthInd);
			cmd.addParameter("@P_NEW_AUTH_IND", pNewAuthInd);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRHIST.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPersonPidm,NString pPageName,NString pOldAuthInd,NString pNewAuthInd,NString pCreateUser,NDate pCreateDate,NString pUserId,NNumber pProxyIdm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRHIST.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_PAGE_NAME", pPageName);
			cmd.addParameter("@P_OLD_AUTH_IND", pOldAuthInd);
			cmd.addParameter("@P_NEW_AUTH_IND", pNewAuthInd);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPersonPidm,NString pPageName,NString pOldAuthInd,NString pNewAuthInd,NString pCreateUser,NDate pCreateDate,NString pUserId,NNumber pProxyIdm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRHIST.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_PAGE_NAME", pPageName);
			cmd.addParameter("@P_OLD_AUTH_IND", pOldAuthInd);
			cmd.addParameter("@P_NEW_AUTH_IND", pNewAuthInd);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPersonPidm,NString pPageName,NString pOldAuthInd,NString pNewAuthInd,NString pCreateUser,NDate pCreateDate,NString pUserId,NNumber pProxyIdm,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRHIST.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_PAGE_NAME", pPageName);
			cmd.addParameter("@P_OLD_AUTH_IND", pOldAuthInd);
			cmd.addParameter("@P_NEW_AUTH_IND", pNewAuthInd);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPersonPidm,NString pPageName,NString pOldAuthInd,NString pNewAuthInd,NString pCreateUser,NDate pCreateDate,NString pUserId,NNumber pProxyIdm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRHIST.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_PAGE_NAME", pPageName);
			cmd.addParameter("@P_OLD_AUTH_IND", pOldAuthInd);
			cmd.addParameter("@P_NEW_AUTH_IND", pNewAuthInd);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRHIST.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPersonPidm,NString pPageName,NString pOldAuthInd,NString pNewAuthInd,NString pCreateUser,NDate pCreateDate,NString pUserId,NNumber pProxyIdm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GPRHIST.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PERSON_PIDM", pPersonPidm);
			cmd.addParameter("@P_PAGE_NAME", pPageName);
			cmd.addParameter("@P_OLD_AUTH_IND", pOldAuthInd);
			cmd.addParameter("@P_NEW_AUTH_IND", pNewAuthInd);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_IDM", pProxyIdm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="GprhistRecRow", dataSourceName="GPRHIST_REC")
	public static class GprhistRecRow
	{
		@DbRecordField(dataSourceName="R_PERSON_PIDM")
		public NNumber RPersonPidm;
		@DbRecordField(dataSourceName="R_PAGE_NAME")
		public NString RPageName;
		@DbRecordField(dataSourceName="R_OLD_AUTH_IND")
		public NString ROldAuthInd;
		@DbRecordField(dataSourceName="R_NEW_AUTH_IND")
		public NString RNewAuthInd;
		@DbRecordField(dataSourceName="R_CREATE_USER")
		public NString RCreateUser;
		@DbRecordField(dataSourceName="R_CREATE_DATE")
		public NDate RCreateDate;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_PROXY_IDM")
		public NNumber RProxyIdm;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
