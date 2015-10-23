package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkadvr {
		public static void pDispadvisees(NString term,NString displayEmail) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKADVR.P_DISPADVISEES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@DISPLAY_EMAIL", displayEmail);
				
			cmd.execute();


		}
		
	
	
	
}
