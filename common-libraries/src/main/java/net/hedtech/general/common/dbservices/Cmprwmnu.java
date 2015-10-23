package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cmprwmnu {
		public static void pStart(NString returnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CMPRWMNU.P_START", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
				
			cmd.execute();


		}
		
		public static void pWebMenuDisplay(NString module,NString tableType,NString wmnuTableName,NString wmrlTableName,NString wmnuTableOwner,NString wmrlTableOwner,NString instTableOwner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CMPRWMNU.P_WEB_MENU_DISPLAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MODULE", module);
			cmd.addParameter("@TABLE_TYPE", tableType);
			cmd.addParameter("@WMNU_TABLE_NAME", wmnuTableName);
			cmd.addParameter("@WMRL_TABLE_NAME", wmrlTableName);
			cmd.addParameter("@WMNU_TABLE_OWNER", wmnuTableOwner);
			cmd.addParameter("@WMRL_TABLE_OWNER", wmrlTableOwner);
			cmd.addParameter("@INST_TABLE_OWNER", instTableOwner);
				
			cmd.execute();


		}
		
	
	
	
}
