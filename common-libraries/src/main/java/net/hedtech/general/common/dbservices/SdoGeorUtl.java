package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoGeorUtl {
//		public static NNumber Fcalcrasternominalsize( geor,NString padding,NString pyramid,NString bitmapmask) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_UTL.CALCRASTERNOMINALSIZE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOR", geor);
//			cmd.addParameter("@PADDING", padding);
//			cmd.addParameter("@PYRAMID", pyramid);
//			cmd.addParameter("@BITMAPMASK", bitmapmask);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static NNumber Fcalcrasterstoragesize( geor) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_UTL.CALCRASTERSTORAGESIZE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			cmd.addParameter("@GEOR", geor);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
		public static void createdmltrigger(NString tablename,NString columnname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_UTL.CREATEDMLTRIGGER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLENAME", tablename);
			cmd.addParameter("@COLUMNNAME", columnname);
				
			cmd.execute();


		}
		
		public static void makerdtnamesunique() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_UTL.MAKERDTNAMESUNIQUE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void renamerdt(NString oldrdts,NString newrdts) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_UTL.RENAMERDT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLDRDTS", oldrdts);
			cmd.addParameter("@NEWRDTS", newrdts);
				
			cmd.execute();


		}
		
	
	
	
}
