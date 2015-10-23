package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cmprmenu {
		public static void pMenuDisplay(NString module,NString tableType,NString wmnuTableName,NString menuTableName,NString wmnuTableOwner,NString menuTableOwner,NString instTableOwner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CMPRMENU.P_MENU_DISPLAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MODULE", module);
			cmd.addParameter("@TABLE_TYPE", tableType);
			cmd.addParameter("@WMNU_TABLE_NAME", wmnuTableName);
			cmd.addParameter("@MENU_TABLE_NAME", menuTableName);
			cmd.addParameter("@WMNU_TABLE_OWNER", wmnuTableOwner);
			cmd.addParameter("@MENU_TABLE_OWNER", menuTableOwner);
			cmd.addParameter("@INST_TABLE_OWNER", instTableOwner);
				
			cmd.execute();


		}
		
		public static void pStart(NString returnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CMPRMENU.P_START", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
				
			cmd.execute();


		}
		
	
	
	
}
