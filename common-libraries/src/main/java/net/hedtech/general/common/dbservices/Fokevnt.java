package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fokevnt {
		public static void pInsDocapprove(NString docnumber,NNumber doctype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKEVNT.P_INS_DOCAPPROVE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOCNUMBER", docnumber);
			cmd.addParameter("@DOCTYPE", doctype);
				
			cmd.execute();


		}
		
	
	
	
}
