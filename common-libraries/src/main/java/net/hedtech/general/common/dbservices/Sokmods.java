package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sokmods {
		public static NBool fInsertSorfadr(NString idIn,NNumber pidmIn,NDate currDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKMODS.F_INSERT_SORFADR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ID_IN", idIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@CURR_DATE_IN", currDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fUpdateSobseqn(NString functionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKMODS.F_UPDATE_SOBSEQN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@FUNCTION_IN", functionIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
