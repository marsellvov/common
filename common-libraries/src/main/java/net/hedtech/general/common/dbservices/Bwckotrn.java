package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwckotrn {
		public static NBool fTestSfrstcrExist(NNumber pidmIn,NString levlIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKOTRN.F_TEST_SFRSTCR_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@LEVL_IN", levlIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fTestShrtritExist(NNumber pidmIn,NString levlIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKOTRN.F_TEST_SHRTRIT_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@LEVL_IN", levlIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pViewtranscript(NString levl,NString tprt,NString callingProcIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKOTRN.P_VIEWTRANSCRIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LEVL", levl);
			cmd.addParameter("@TPRT", tprt);
			cmd.addParameter("@CALLING_PROC_IN", callingProcIn);
				
			cmd.execute();


		}
		
	
	
	
}
