package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Lmarinch {
		public static NString fMakeDispWebFormat(NNumber nbr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("LMARINCH.F_MAKE_DISP_WEB_FORMAT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NBR", nbr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fRonsFunction(NNumber nbr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("LMARINCH.F_RONS_FUNCTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NBR", nbr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
