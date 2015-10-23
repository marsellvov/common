package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpGebcomm {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GEBCOMM.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pSystCode,NString pCtypCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GEBCOMM.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GebcommRecRow recOne,GebcommRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GEBCOMM.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GebcommRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GebcommRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pSystCode,NString pCtypCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GEBCOMM.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GEBCOMM.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pSystCode,NString pCtypCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GEBCOMM.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pSystCode,NString pCtypCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GEBCOMM.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pSystCode,NString pCtypCode,NString pPerNotifyInd,NString pAdminNotifyInd,NString pProxyNotifyInd,NString pLetrPerNotiCode,NString pLetrAdmNotiCode,NString pLetrPxyNotiCode,NString pBccPerInd,NString pBccPxyInd,NString pHostName,NString pAdminEmail,NString pSystemReqInd,NString pUserId,NDate pCreateDate,NString pCreateUser,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GEBCOMM.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_PER_NOTIFY_IND", pPerNotifyInd);
			cmd.addParameter("@P_ADMIN_NOTIFY_IND", pAdminNotifyInd);
			cmd.addParameter("@P_PROXY_NOTIFY_IND", pProxyNotifyInd);
			cmd.addParameter("@P_LETR_PER_NOTI_CODE", pLetrPerNotiCode);
			cmd.addParameter("@P_LETR_ADM_NOTI_CODE", pLetrAdmNotiCode);
			cmd.addParameter("@P_LETR_PXY_NOTI_CODE", pLetrPxyNotiCode);
			cmd.addParameter("@P_BCC_PER_IND", pBccPerInd);
			cmd.addParameter("@P_BCC_PXY_IND", pBccPxyInd);
			cmd.addParameter("@P_HOST_NAME", pHostName);
			cmd.addParameter("@P_ADMIN_EMAIL", pAdminEmail);
			cmd.addParameter("@P_SYSTEM_REQ_IND", pSystemReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pSystCode,NString pCtypCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GEBCOMM.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pSystCode,NString pCtypCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GEBCOMM.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pSystCode,NString pCtypCode,NString pPerNotifyInd,NString pAdminNotifyInd,NString pProxyNotifyInd,NString pLetrPerNotiCode,NString pLetrAdmNotiCode,NString pLetrPxyNotiCode,NString pBccPerInd,NString pBccPxyInd,NString pHostName,NString pAdminEmail,NString pSystemReqInd,NString pUserId,NDate pCreateDate,NString pCreateUser,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GEBCOMM.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_PER_NOTIFY_IND", pPerNotifyInd);
			cmd.addParameter("@P_ADMIN_NOTIFY_IND", pAdminNotifyInd);
			cmd.addParameter("@P_PROXY_NOTIFY_IND", pProxyNotifyInd);
			cmd.addParameter("@P_LETR_PER_NOTI_CODE", pLetrPerNotiCode);
			cmd.addParameter("@P_LETR_ADM_NOTI_CODE", pLetrAdmNotiCode);
			cmd.addParameter("@P_LETR_PXY_NOTI_CODE", pLetrPxyNotiCode);
			cmd.addParameter("@P_BCC_PER_IND", pBccPerInd);
			cmd.addParameter("@P_BCC_PXY_IND", pBccPxyInd);
			cmd.addParameter("@P_HOST_NAME", pHostName);
			cmd.addParameter("@P_ADMIN_EMAIL", pAdminEmail);
			cmd.addParameter("@P_SYSTEM_REQ_IND", pSystemReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="GebcommRecRow", dataSourceName="GEBCOMM_REC")
	public static class GebcommRecRow
	{
		@DbRecordField(dataSourceName="R_SYST_CODE")
		public NString RSystCode;
		@DbRecordField(dataSourceName="R_CTYP_CODE")
		public NString RCtypCode;
		@DbRecordField(dataSourceName="R_PER_NOTIFY_IND")
		public NString RPerNotifyInd;
		@DbRecordField(dataSourceName="R_ADMIN_NOTIFY_IND")
		public NString RAdminNotifyInd;
		@DbRecordField(dataSourceName="R_PROXY_NOTIFY_IND")
		public NString RProxyNotifyInd;
		@DbRecordField(dataSourceName="R_LETR_PER_NOTI_CODE")
		public NString RLetrPerNotiCode;
		@DbRecordField(dataSourceName="R_LETR_ADM_NOTI_CODE")
		public NString RLetrAdmNotiCode;
		@DbRecordField(dataSourceName="R_LETR_PXY_NOTI_CODE")
		public NString RLetrPxyNotiCode;
		@DbRecordField(dataSourceName="R_BCC_PER_IND")
		public NString RBccPerInd;
		@DbRecordField(dataSourceName="R_BCC_PXY_IND")
		public NString RBccPxyInd;
		@DbRecordField(dataSourceName="R_HOST_NAME")
		public NString RHostName;
		@DbRecordField(dataSourceName="R_ADMIN_EMAIL")
		public NString RAdminEmail;
		@DbRecordField(dataSourceName="R_SYSTEM_REQ_IND")
		public NString RSystemReqInd;
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
