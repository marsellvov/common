package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Agkcpap {
		public static NNumber fCalcPdesAmt(NNumber pidmIn,NString pledgeNoIn,NString campIn,NString desgIn,NNumber instNoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKCPAP.F_CALC_PDES_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PLEDGE_NO_IN", pledgeNoIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@DESG_IN", desgIn);
			cmd.addParameter("@INST_NO_IN", instNoIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcPinsAmt(NNumber pidmIn,NString pledgeNoIn,NString campIn,NString desgIn,NNumber instNoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKCPAP.F_CALC_PINS_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PLEDGE_NO_IN", pledgeNoIn);
			cmd.addParameter("@CAMP_IN", campIn);
			cmd.addParameter("@DESG_IN", desgIn);
			cmd.addParameter("@INST_NO_IN", instNoIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
