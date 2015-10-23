package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Svkchinu {
		public static Boolean fCheckid (NString idcode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SVKCHINU.F_CHECKID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(Boolean.class);
			cmd.addParameter("@id_code", idcode);
				
			cmd.execute();

			return cmd.getReturnValue(Boolean.class);

		}
		
		public static Boolean fCheckverifydigit(NString idcode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SVKCHINU.F_CHECKVERIFYDIGIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(Boolean.class);
			cmd.addParameter("@id_code", idcode);
				
			cmd.execute();

			return cmd.getReturnValue(Boolean.class);


		}
		
	
	
	
}
