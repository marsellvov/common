package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Viewinfo {
		public static void pInfoTextDisplay(NString module,NString tableType,NString wmnuTableName,NString infoTableName,NString wmnuTableOwner,NString infoTableOwner,NString instTableOwner) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VIEWINFO.P_INFO_TEXT_DISPLAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MODULE", module);
			cmd.addParameter("@TABLE_TYPE", tableType);
			cmd.addParameter("@WMNU_TABLE_NAME", wmnuTableName);
			cmd.addParameter("@INFO_TABLE_NAME", infoTableName);
			cmd.addParameter("@WMNU_TABLE_OWNER", wmnuTableOwner);
			cmd.addParameter("@INFO_TABLE_OWNER", infoTableOwner);
			cmd.addParameter("@INST_TABLE_OWNER", instTableOwner);
				
			cmd.execute();


		}
		
		public static void pStart(NString returnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VIEWINFO.P_START", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
				
			cmd.execute();


		}
		
	
	
	
}
