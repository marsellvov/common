package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Aukcdrv {
		public static void pPostProcess(NNumber transIdIn,Ref<NString> statusOut,Ref<NString> procNameOut,Ref<NString> errorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AUKCDRV.P_POST_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_ID_IN", transIdIn);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@PROC_NAME_OUT", NString.class);
			cmd.addParameter("@ERROR_OUT", NString.class);
				
			cmd.execute();
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			procNameOut.val = cmd.getParameterValue("@PROC_NAME_OUT", NString.class);
			errorOut.val = cmd.getParameterValue("@ERROR_OUT", NString.class);


		}
		
	
	
	
}
