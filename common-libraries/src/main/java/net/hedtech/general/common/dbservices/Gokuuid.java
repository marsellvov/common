package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokuuid {
		public static NString fCreateUniqueId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKUUID.F_CREATE_UNIQUE_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<StringNtRow> fCreateUniqueIdBatch(NNumber pHowmany,NNumber pHowmany) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKUUID.F_CREATE_UNIQUE_ID_BATCH", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<StringNtRow>.class);
//			cmd.addParameter("@P_HOWMANY", pHowmany);
//			cmd.addParameter("@P_HOWMANY", pHowmany);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<StringNtRow>.class);
//
//		}
		
	
	
	
}
