package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Aoklibs {
		public static NNumber fCvtGetCurrSps(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLIBS.F_CVT_GET_CURR_SPS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetPrimarySpsPidm(NNumber pPidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLIBS.F_GET_PRIMARY_SPS_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetdescclob(NString rowidIn,NString startposIn,NString lobLen) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLIBS.F_GETDESCCLOB", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ROWID_IN", rowidIn);
			cmd.addParameter("@STARTPOS_IN", startposIn);
			cmd.addParameter("@LOB_LEN", lobLen);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetAlumniRules() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLIBS.P_GET_ALUMNI_RULES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetAubinstRules() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AOKLIBS.P_GET_AUBINST_RULES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
