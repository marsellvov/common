package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskogrd {
		public static void pViewgrde(NString termIn,NString anchorCallIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKOGRD.P_VIEWGRDE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@ANCHOR_CALL_IN", anchorCallIn);
				
			cmd.execute();


		}
		
		public static void pViewtermgrde(NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKOGRD.P_VIEWTERMGRDE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
				
			cmd.execute();


		}
		
	
	
	
}
