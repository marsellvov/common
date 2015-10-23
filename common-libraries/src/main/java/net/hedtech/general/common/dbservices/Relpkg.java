package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Relpkg {
		public static NString Flrelease(NString inval) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RELPKG.LRELEASE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INVAL", inval);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fsrelease(NString inval) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RELPKG.SRELEASE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INVAL", inval);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
