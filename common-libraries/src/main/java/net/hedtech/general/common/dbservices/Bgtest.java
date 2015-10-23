package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bgtest {
		public static void pDbmsLobRead(NNumber pMediaId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BGTEST.P_DBMS_LOB_READ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MEDIA_ID", pMediaId);
				
			cmd.execute();


		}
		
		public static void pWpgDocload(NNumber pMediaId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BGTEST.P_WPG_DOCLOAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MEDIA_ID", pMediaId);
				
			cmd.execute();


		}
		
	
	
	
}
