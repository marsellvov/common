package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpCardholder {
//		public static NString fGetEligibleCardholder( pXt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_CARDHOLDER.F_GET_ELIGIBLE_CARDHOLDER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@P_XT", pXt);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static  fGetEligibleCardholder( pRequestOot) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_CARDHOLDER.F_GET_ELIGIBLE_CARDHOLDER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@P_REQUEST_OOT", pRequestOot);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
	
//		public static NString fGetEligibleCardholders( pXt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_CARDHOLDER.F_GET_ELIGIBLE_CARDHOLDERS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@P_XT", pXt);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static  fGetEligibleCardholders( pRequestOot) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_CARDHOLDER.F_GET_ELIGIBLE_CARDHOLDERS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@P_REQUEST_OOT", pRequestOot);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static void pHandleEvent(Object inAny) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_CARDHOLDER.P_HANDLE_EVENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_ANY", inAny);
				
			cmd.execute();


		}
		
//		public static void pSyncEligibleCardholders(List<RcoRoleNtRow> rolesTab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_CARDHOLDER.P_SYNC_ELIGIBLE_CARDHOLDERS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getCollectionType("ROLES_TAB", "", rolesTab, object.class));
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
