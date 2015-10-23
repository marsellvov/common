package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Teststr {
		public static NString fMain(NNumber pNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TESTSTR.F_MAIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NUMBER", pNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fMainstr(NNumber pNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TESTSTR.F_MAINSTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NUMBER", pNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pMain(NNumber pNumber,Ref<NString> pStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TESTSTR.P_MAIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NUMBER", pNumber);
			cmd.addParameter("@P_STR", NString.class);
				
			cmd.execute();
			pStr.val = cmd.getParameterValue("@P_STR", NString.class);


		}
		
	
	
	
}
