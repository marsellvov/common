package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sskschn {
		public static NNumber fNextSchedNumber(NNumber schedNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKSCHN.F_NEXT_SCHED_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@SCHED_NUMBER", schedNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pResetOneupSchedNumber() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKSCHN.P_RESET_ONEUP_SCHED_NUMBER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pResetStvrdefSchedNumber() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKSCHN.P_RESET_STVRDEF_SCHED_NUMBER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
