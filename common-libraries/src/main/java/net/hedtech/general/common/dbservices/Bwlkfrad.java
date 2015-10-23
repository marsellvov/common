package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkfrad {
		public static void pFacadddropcrse(NString term,NString xyz,NString stupin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFRAD.P_FACADDDROPCRSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@XYZ", xyz);
			cmd.addParameter("@STUPIN", stupin);
				
			cmd.execute();


		}
		
		public static void pFacchangecrseopt(NString termIn,NString xyz,NString stupin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFRAD.P_FACCHANGECRSEOPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@XYZ", xyz);
			cmd.addParameter("@STUPIN", stupin);
				
			cmd.execute();


		}
		
	
	
	
}
