package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pnnlogg {
		public static NString fGetBannerId(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PNNLOGG.F_GET_BANNER_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetuserid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PNNLOGG.F_GETUSERID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetuserid(NString userid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PNNLOGG.F_GETUSERID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USERID", userid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pSetuserid(NString userid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PNNLOGG.P_SETUSERID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USERID", userid);
				
			cmd.execute();


		}
		
	
	
	
}
