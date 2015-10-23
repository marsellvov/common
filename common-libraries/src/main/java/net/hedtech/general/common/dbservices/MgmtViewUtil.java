package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class MgmtViewUtil {
		public static NDate FadjustTz(NDate vDateIn,NString vFromTz,NString vToTz) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_VIEW_UTIL.ADJUST_TZ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@V_DATE_IN", vDateIn);
			cmd.addParameter("@V_FROM_TZ", vFromTz);
			cmd.addParameter("@V_TO_TZ", vToTz);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
//		public static  FgetDeltaKeyNlsString(byte[] vKeyRowGuid,NString vTargetType,NString vSnapshotType,NString vCollectionType,NString vLocale) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_VIEW_UTIL.GET_DELTA_KEY_NLS_STRING", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@V_KEY_ROW_GUID", vKeyRowGuid);
//			cmd.addParameter("@V_TARGET_TYPE", vTargetType);
//			cmd.addParameter("@V_SNAPSHOT_TYPE", vSnapshotType);
//			cmd.addParameter("@V_COLLECTION_TYPE", vCollectionType);
//			cmd.addParameter("@V_LOCALE", vLocale);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FgetDeltaResourceNlsString(NString vResourceId,NString vResourceBundle,NString vLocale,NString vDefault) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_VIEW_UTIL.GET_DELTA_RESOURCE_NLS_STRING", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@V_RESOURCE_ID", vResourceId);
//			cmd.addParameter("@V_RESOURCE_BUNDLE", vResourceBundle);
//			cmd.addParameter("@V_LOCALE", vLocale);
//			cmd.addParameter("@V_DEFAULT", vDefault);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  FgetDeltaValueNlsString(NString vColumnName,NString vTargetType,NString vSnapshotType,NString vCollectionType,NString vLocale) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_VIEW_UTIL.GET_DELTA_VALUE_NLS_STRING", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@V_COLUMN_NAME", vColumnName);
//			cmd.addParameter("@V_TARGET_TYPE", vTargetType);
//			cmd.addParameter("@V_SNAPSHOT_TYPE", vSnapshotType);
//			cmd.addParameter("@V_COLLECTION_TYPE", vCollectionType);
//			cmd.addParameter("@V_LOCALE", vLocale);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NNumber Fnv(NString vTextinquestion) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_VIEW_UTIL.NV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@V_TEXTINQUESTION", vTextinquestion);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
