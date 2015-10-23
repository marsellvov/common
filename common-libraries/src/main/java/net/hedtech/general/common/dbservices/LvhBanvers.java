package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class LvhBanvers {
		public static void pBannerVersions() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("LVH_BANVERS.P_BANNER_VERSIONS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
