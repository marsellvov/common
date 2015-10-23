package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkfstu {
		public static void pFacstuschd(NString xyz,NString term,NString crn,NString pinNumb,NString msgIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFSTU.P_FACSTUSCHD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@XYZ", xyz);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@PIN_NUMB", pinNumb);
			cmd.addParameter("@MSG_IN", msgIn);
				
			cmd.execute();


		}
		
		public static void pFacstuschdScp(NString xyz,NString term,NString crn,NString pinNumb,NString msgIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFSTU.P_FACSTUSCHD_SCP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@XYZ", xyz);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@PIN_NUMB", pinNumb);
			cmd.addParameter("@MSG_IN", msgIn);
				
			cmd.execute();


		}
		
	
	
	
}
