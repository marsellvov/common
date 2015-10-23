package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Testlvhw {
		public static void pFix(NString pVar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TESTLVHW.P_FIX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VAR", pVar);
				
			cmd.execute();


		}
		
		public static void pTest(Ref<NString> pVar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TESTLVHW.P_TEST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VAR", pVar, true);
				
			cmd.execute();
			pVar.val = cmd.getParameterValue("@P_VAR", NString.class);


		}
		
	
	
	
}
