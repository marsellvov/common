package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gukmenu {
	
	public static void pBldPersMenu() {
		pBldPersMenu(NString.getNull());
	}
	
		public static void pBldPersMenu(NString pCallingApp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GUKMENU.P_BLD_PERS_MENU", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CALLING_APP", pCallingApp);
				
			cmd.execute();


		}
		
		public static void pBldProdMenu() {
			pBldProdMenu(NString.getNull());
		}
		
		public static void pBldProdMenu(NString pCallingApp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GUKMENU.P_BLD_PROD_MENU", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CALLING_APP", pCallingApp);
				
			cmd.execute();


		}
		
		public static void pRefreshHorizonMenu() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GUKMENU.P_REFRESH_HORIZON_MENU", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pRefreshMenu() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GUKMENU.P_REFRESH_MENU", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
