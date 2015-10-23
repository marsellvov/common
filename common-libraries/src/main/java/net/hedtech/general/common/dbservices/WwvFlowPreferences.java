package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowPreferences {
		public static NString FgetPreference(NString pPreference,NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_PREFERENCES.GET_PREFERENCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PREFERENCE", pPreference);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void removeFspSort(NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_PREFERENCES.REMOVE_FSP_SORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();


		}
		
		public static void removePreference(NString pPreference,NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_PREFERENCES.REMOVE_PREFERENCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PREFERENCE", pPreference);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();


		}
		
		public static void removePreferences(NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_PREFERENCES.REMOVE_PREFERENCES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();


		}
		
//		public static void resetSortPreference(NNumber pRegionId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_PREFERENCES.RESET_SORT_PREFERENCE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_REGION_ID", pRegionId);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void resetSortPreference(NNumber pPageId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_PREFERENCES.RESET_SORT_PREFERENCE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PAGE_ID", pPageId);
//				
//			cmd.execute();
//
//
//		}
		
		public static void resetSortPreference(NNumber pPageId,NString pRegionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_PREFERENCES.RESET_SORT_PREFERENCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PAGE_ID", pPageId);
			cmd.addParameter("@P_REGION_NAME", pRegionName);
				
			cmd.execute();


		}
		
		public static void setPreference(NString pPreference,NString pValue,NString pUser,NBool pForceUpper) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_PREFERENCES.SET_PREFERENCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PREFERENCE", pPreference);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_FORCE_UPPER", pForceUpper);
				
			cmd.execute();


		}
		
//		public static void setPreferences(List<WwvFlowGlobal.VcArr2Row> pPreferences,List<WwvFlowGlobal.VcArr2Row> pValues,NString pUser) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_PREFERENCES.SET_PREFERENCES", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_PREFERENCES", "", pPreferences, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_VALUES", "", pValues, object.class));
//			cmd.addParameter("@P_USER", pUser);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
