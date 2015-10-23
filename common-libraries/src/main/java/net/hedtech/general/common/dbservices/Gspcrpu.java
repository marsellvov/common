package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gspcrpu {
		public static void pUnapply(byte[] xRaw,Ref<NString> yString) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GSPCRPU.P_UNAPPLY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@X_RAW", xRaw);
			cmd.addParameter("@Y_STRING", NString.class);
				
			cmd.execute();
			yString.val = cmd.getParameterValue("@Y_STRING", NString.class);


		}
		
		public static void pUnapplyV02(byte[] xRaw,Ref<NString> yString) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GSPCRPU.P_UNAPPLY_V02", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@X_RAW", xRaw);
			cmd.addParameter("@Y_STRING", NString.class);
				
			cmd.execute();
			yString.val = cmd.getParameterValue("@Y_STRING", NString.class);


		}
		
	
	
	
}
