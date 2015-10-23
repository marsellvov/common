package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pekwemp {
		public static NString fInclTerminated(NNumber pidm,NDate selectDate,NDate fiscBegin,NDate fiscEnd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKWEMP.F_INCL_TERMINATED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SELECT_DATE", selectDate);
			cmd.addParameter("@FISC_BEGIN", fiscBegin);
			cmd.addParameter("@FISC_END", fiscEnd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pBuildpetwemp(NDate selectDate,NString userId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKWEMP.P_BUILDPETWEMP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SELECT_DATE", selectDate);
			cmd.addParameter("@USER_ID", userId);
				
			cmd.execute();


		}
		
	
	
	
}
