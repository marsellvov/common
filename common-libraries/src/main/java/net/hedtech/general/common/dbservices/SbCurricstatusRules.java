package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbCurricstatusRules {
		public static void pRegisterEntity() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICSTATUS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pRegisterEntity() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICSTATUS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
		public static void pValidate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICSTATUS_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
