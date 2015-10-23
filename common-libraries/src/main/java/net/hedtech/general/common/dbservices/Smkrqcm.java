package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Smkrqcm {
		public static void pUpdateAreaGroupChg(NString area,NString grp,NString termFrom,NString objectName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKRQCM.P_UPDATE_AREA_GROUP_CHG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AREA", area);
			cmd.addParameter("@GRP", grp);
			cmd.addParameter("@TERM_FROM", termFrom);
			cmd.addParameter("@OBJECT_NAME", objectName);
				
			cmd.execute();


		}
		
		public static void pUpdateProgChg(NString prog,NString termFrom,NString objectName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKRQCM.P_UPDATE_PROG_CHG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROG", prog);
			cmd.addParameter("@TERM_FROM", termFrom);
			cmd.addParameter("@OBJECT_NAME", objectName);
				
			cmd.execute();


		}
		
	
	
	
}
