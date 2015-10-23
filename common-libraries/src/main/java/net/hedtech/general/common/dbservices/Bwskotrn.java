package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskotrn {
		public static void pViewtermtran() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKOTRN.P_VIEWTERMTRAN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pViewtran(NString levl,NString tprt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKOTRN.P_VIEWTRAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LEVL", levl);
			cmd.addParameter("@TPRT", tprt);
				
			cmd.execute();


		}
		
	
	
	
}
