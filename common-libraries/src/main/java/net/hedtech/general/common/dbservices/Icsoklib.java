package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Icsoklib {
		public static NBool fValidTermRange(NString fromTermIn,NString toTermIn,NString includeToTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSOKLIB.F_VALID_TERM_RANGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@FROM_TERM_IN", fromTermIn);
			cmd.addParameter("@TO_TERM_IN", toTermIn);
			cmd.addParameter("@INCLUDE_TO_TERM", includeToTerm);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
