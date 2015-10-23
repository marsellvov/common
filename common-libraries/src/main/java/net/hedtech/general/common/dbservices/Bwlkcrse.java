package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkcrse {
		public static void pFacstuschd(NString xyz,NString term,NString pinNumb,NString msgIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKCRSE.P_FACSTUSCHD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@XYZ", xyz);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@PIN_NUMB", pinNumb);
			cmd.addParameter("@MSG_IN", msgIn);
				
			cmd.execute();


		}
		
	
	
	
}
