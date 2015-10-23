package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gfksjpa {
		public static NString fGetRowId(NString tablename,NNumber id) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GFKSJPA.F_GET_ROW_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLENAME", tablename);
			cmd.addParameter("@ID", id);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber Fgetid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GFKSJPA.GETID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber Fgetversion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GFKSJPA.GETVERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void setid(NNumber idV) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GFKSJPA.SETID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ID_V", idV);
				
			cmd.execute();


		}
		
		public static void setversion(NNumber versionV) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GFKSJPA.SETVERSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VERSION_V", versionV);
				
			cmd.execute();


		}
		
	
	
	
}
