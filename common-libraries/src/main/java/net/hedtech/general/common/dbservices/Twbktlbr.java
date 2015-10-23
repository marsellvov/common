package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbktlbr {
		public static void pCreatecolorbar(NString tbName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKTLBR.P_CREATECOLORBAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TB_NAME", tbName);
				
			cmd.execute();


		}
		
		public static void pCreatetoolbar(NString tbName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKTLBR.P_CREATETOOLBAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TB_NAME", tbName);
				
			cmd.execute();


		}
		
	
	
	
}
