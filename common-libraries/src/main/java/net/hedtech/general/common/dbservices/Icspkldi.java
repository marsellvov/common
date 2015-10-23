package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Icspkldi {
//		public static List<LdiNvNtRow> fGetPerson(NString sourcedIdIn,NString parameter1In,NString parameter2In,NNumber pidmIn,List<Icgokrol.RolesTableTypeRow> rolesIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKLDI.F_GET_PERSON", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<LdiNvNtRow>.class);
//			cmd.addParameter("@SOURCED_ID_IN", sourcedIdIn);
//			cmd.addParameter("@PARAMETER1_IN", parameter1In);
//			cmd.addParameter("@PARAMETER2_IN", parameter2In);
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			// cmd.addParameter(DbTypes.getTableType("ROLES_IN", "", rolesIn, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<LdiNvNtRow>.class);
//
//		}
		
		public static void pSavePerson(NNumber pidmIn,NString actionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKLDI.P_SAVE_PERSON", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ACTION_IN", actionIn);
				
			cmd.execute();


		}
		
		public static void pSendPerson() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSPKLDI.P_SEND_PERSON", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
