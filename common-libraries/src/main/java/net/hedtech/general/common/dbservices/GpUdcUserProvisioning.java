package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpUdcUserProvisioning {
//		public static NNumber fCheckMatches( pUser) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_UDC_USER_PROVISIONING.F_CHECK_MATCHES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@P_USER", pUser);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber fCheckMatches( pUser) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_UDC_USER_PROVISIONING.F_CHECK_MATCHES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@P_USER", pUser);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber fCreateUser( pUser) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_UDC_USER_PROVISIONING.F_CREATE_USER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@P_USER", pUser);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber fCreateUser( pUser) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_UDC_USER_PROVISIONING.F_CREATE_USER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@P_USER", pUser);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
		public static NString fLookupUser(NString pUdcid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_UDC_USER_PROVISIONING.F_LOOKUP_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_UDCID", pUdcid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryCmPidms() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_UDC_USER_PROVISIONING.F_QUERY_CM_PIDMS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
//		public static void pCheckMatches( pUser,Ref<NNumber> pCount,Ref<DataCursor> pRef) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_UDC_USER_PROVISIONING.P_CHECK_MATCHES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_USER", pUser);
//			cmd.addParameter("@P_COUNT", NNumber.class);
//			cmd.addParameter("@P_REF", DataCursor.class);
//				
//			cmd.execute();
//			pCount.val = cmd.getParameterValue("@P_COUNT", NNumber.class);
//			pRef.val = cmd.getParameterValue("@P_REF", DataCursor.class);
//
//
//		}
		
//		public static void pCheckMatches( pUser,Ref<NNumber> pCount,Ref<DataCursor> pRef) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_UDC_USER_PROVISIONING.P_CHECK_MATCHES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_USER", pUser);
//			cmd.addParameter("@P_COUNT", NNumber.class);
//			cmd.addParameter("@P_REF", DataCursor.class);
//				
//			cmd.execute();
//			pCount.val = cmd.getParameterValue("@P_COUNT", NNumber.class);
//			pRef.val = cmd.getParameterValue("@P_REF", DataCursor.class);
//
//
//		}
		
//		public static void pModifyUser( pUser) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_UDC_USER_PROVISIONING.P_MODIFY_USER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_USER", pUser);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void pModifyUser( pUser) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_UDC_USER_PROVISIONING.P_MODIFY_USER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_USER", pUser);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	@DbRecordType(id="CmPidmRecRow", dataSourceName="CM_PIDM_REC")
	public static class CmPidmRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
	}

	
	
}
