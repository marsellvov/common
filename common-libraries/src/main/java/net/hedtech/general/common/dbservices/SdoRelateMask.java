package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoRelateMask {
		public static void deleteMask(NString mask) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_RELATE_MASK.DELETE_MASK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MASK", mask);
				
			cmd.execute();


		}
		
		public static void insertMask(NString mask,NString relation) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_RELATE_MASK.INSERT_MASK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MASK", mask);
			cmd.addParameter("@RELATION", relation);
				
			cmd.execute();


		}
		
		public static void updateMask(NString mask,NString relation) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_RELATE_MASK.UPDATE_MASK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MASK", mask);
			cmd.addParameter("@RELATION", relation);
				
			cmd.execute();


		}
		
	
	
	
}
