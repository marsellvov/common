package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskmgrd {
		public static void pWriteMidtermGrades(NString termIn,NString anchorCallIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKMGRD.P_WRITE_MIDTERM_GRADES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@ANCHOR_CALL_IN", anchorCallIn);
				
			cmd.execute();


		}
		
		public static void pWriteTermSelection() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKMGRD.P_WRITE_TERM_SELECTION", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
