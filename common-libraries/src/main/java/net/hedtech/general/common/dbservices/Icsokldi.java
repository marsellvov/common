package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Icsokldi {
//		public static List<LdiNvNtRow> fGetTerm(NString sourcedIdIn,NString recstatusIn,NString actionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSOKLDI.F_GET_TERM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<LdiNvNtRow>.class);
//			cmd.addParameter("@SOURCED_ID_IN", sourcedIdIn);
//			cmd.addParameter("@RECSTATUS_IN", recstatusIn);
//			cmd.addParameter("@ACTION_IN", actionIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<LdiNvNtRow>.class);
//
//		}
		
		public static void pSaveTerm(NString termCodeIn,NString actionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSOKLDI.P_SAVE_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@ACTION_IN", actionIn);
				
			cmd.execute();


		}
		
		public static void pSendTerm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSOKLDI.P_SEND_TERM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
