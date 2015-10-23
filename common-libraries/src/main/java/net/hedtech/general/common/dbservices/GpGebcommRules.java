package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpGebcommRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GEBCOMM_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pSystCode,NString pCtypCode,NString pPerNotifyInd,NString pAdminNotifyInd,NString pProxyNotifyInd,NString pLetrPerNotiCode,NString pLetrAdmNotiCode,NString pLetrPxyNotiCode,NString pBccPerInd,NString pBccPxyInd,NString pHostName,NString pAdminEmail,NString pSystemReqInd,NString pUserId,NDate pCreateDate,NString pCreateUser,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GEBCOMM_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pSystCode,NString pCtypCode,NString pPerNotifyInd,NString pAdminNotifyInd,NString pProxyNotifyInd,NString pLetrPerNotiCode,NString pLetrAdmNotiCode,NString pLetrPxyNotiCode,NString pBccPerInd,NString pBccPxyInd,NString pHostName,NString pAdminEmail,NString pSystemReqInd,NString pUserId,NDate pCreateDate,NString pCreateUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GEBCOMM_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
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
				
			cmd.execute();


		}
		
	
	
	
}
