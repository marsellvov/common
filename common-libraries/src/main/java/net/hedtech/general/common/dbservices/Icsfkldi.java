package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Icsfkldi {
//		public static List<LdiNvNtRow> fGetEnrollment(NString sourcedIdIn,NString memberSourcedIdIn,NString recstatusIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKLDI.F_GET_ENROLLMENT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<LdiNvNtRow>.class);
//			cmd.addParameter("@SOURCED_ID_IN", sourcedIdIn);
//			cmd.addParameter("@MEMBER_SOURCED_ID_IN", memberSourcedIdIn);
//			cmd.addParameter("@RECSTATUS_IN", recstatusIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<LdiNvNtRow>.class);
//
//		}
		
		public static void pSaveEnrollment(NString termCodeIn,NString crnIn,NNumber pidmIn,NString actionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKLDI.P_SAVE_ENROLLMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ACTION_IN", actionIn);
				
			cmd.execute();


		}
		
		public static void pSendEnrollment() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSFKLDI.P_SEND_ENROLLMENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
