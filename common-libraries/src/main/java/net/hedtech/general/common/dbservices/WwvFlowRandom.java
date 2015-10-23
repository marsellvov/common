package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowRandom {
		public static void getRand(Ref<NNumber> r) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_RANDOM.GET_RAND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@R", NNumber.class);
				
			cmd.execute();
			r.val = cmd.getParameterValue("@R", NNumber.class);


		}
		
		public static void getRandMax(Ref<NNumber> r,NNumber n) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_RANDOM.GET_RAND_MAX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@R", NNumber.class);
			cmd.addParameter("@N", n);
				
			cmd.execute();
			r.val = cmd.getParameterValue("@R", NNumber.class);


		}
		
		public static NNumber Frand() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_RANDOM.RAND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FrandMax(NNumber n) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_RANDOM.RAND_MAX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@N", n);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void srand(NNumber newSeed) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_RANDOM.SRAND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NEW_SEED", newSeed);
				
			cmd.execute();


		}
		
	
	
	
}
