package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokmods {
		public static void pUpdateGobtpac(NNumber pidmIn,NString pinIn,NDate expDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMODS.P_UPDATE_GOBTPAC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PIN_IN", pinIn);
			cmd.addParameter("@EXP_DATE_IN", expDateIn);
				
			cmd.execute();


		}
		
		public static void pUpdateGobtpac(NNumber pidmIn,NString pinIn,NDate expDateIn,NString insertSource) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKMODS.P_UPDATE_GOBTPAC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PIN_IN", pinIn);
			cmd.addParameter("@EXP_DATE_IN", expDateIn);
			cmd.addParameter("@INSERT_SOURCE", insertSource);
				
			cmd.execute();


		}
		
	
	
	
}
