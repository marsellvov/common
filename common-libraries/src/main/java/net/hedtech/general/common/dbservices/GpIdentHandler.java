package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpIdentHandler {
		public static void pHandleIamEvent(Object inAny) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_IDENT_HANDLER.P_HANDLE_IAM_EVENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_ANY", inAny);
				
			cmd.execute();


		}
		
	
	
	
}
