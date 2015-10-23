package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskflib {
		public static NBool fValidterm(NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKFLIB.F_VALIDTERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidterm1(NNumber pidmIn,NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKFLIB.F_VALIDTERM1", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidviewterm(NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKFLIB.F_VALIDVIEWTERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pSeldefterm(NString termIn,NString callingProcName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKFLIB.P_SELDEFTERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
				
			cmd.execute();


		}
		
	
	
	
}
