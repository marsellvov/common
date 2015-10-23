package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sokeprt {
		public static NNumber fGetpidm(NString userId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKEPRT.F_GETPIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@USER_ID", userId);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fUserhassirdpclrec(NNumber userPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKEPRT.F_USERHASSIRDPCLREC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@USER_PIDM", userPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pGetaccessiblecolldept(Ref<DataCursor> colllist,Ref<DataCursor> colldeptlist,NNumber userPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKEPRT.P_GETACCESSIBLECOLLDEPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COLLLIST", DataCursor.class);
			cmd.addParameter("@COLLDEPTLIST", DataCursor.class);
			cmd.addParameter("@USER_PIDM", userPidm);
				
			cmd.execute();
			colllist.val = cmd.getParameterValue("@COLLLIST", DataCursor.class);
			colldeptlist.val = cmd.getParameterValue("@COLLDEPTLIST", DataCursor.class);


		}
		
	
	
	
}
