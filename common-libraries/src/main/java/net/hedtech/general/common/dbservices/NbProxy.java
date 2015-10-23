package net.hedtech.general.common.dbservices;

import java.sql.RowId;
import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class NbProxy {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_PROXY.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pUserId,NString pProxyUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_PROXY.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_USER_ID", pProxyUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ProxyRecRow recOne,ProxyRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_PROXY.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ProxyRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ProxyRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pUserId,NString pProxyUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_PROXY.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_USER_ID", pProxyUserId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryById(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_PROXY.F_QUERY_BY_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_PROXY.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pUserId,NString pProxyUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_PROXY.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_USER_ID", pProxyUserId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pUserId,NString pProxyUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_PROXY.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_USER_ID", pProxyUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pUserId,NString pProxyUserId,NString pAdminId,NString pDataOrigin,Ref<NNumber> pIdOut,Ref<byte[]> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_PROXY.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_USER_ID", pProxyUserId);
			cmd.addParameter("@P_ADMIN_ID", pAdminId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ID_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pIdOut.val = cmd.getParameterValue("@P_ID_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", String.class).getBytes();


		}
		
		public static void pDelete(NString pUserId,NString pProxyUserId,RowId pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_PROXY.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_USER_ID", pProxyUserId);
			cmd.addParameter("@P_ROWID",DbManager.getDataBaseFactory().rowidToString(pRowid));
				
			cmd.execute();


		}
		
		public static void pLock(NString pUserId,NString pProxyUserId,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_PROXY.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PROXY_USER_ID", pProxyUserId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
	
	
	@DbRecordType(id="ProxyRecRow", dataSourceName="PROXY_REC")
	public static class ProxyRecRow
	{
		@DbRecordField(dataSourceName="R_ID")
		public NNumber RId;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_PROXY_USER_ID")
		public NString RProxyUserId;
		@DbRecordField(dataSourceName="R_ADMIN_ID")
		public NString RAdminId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
