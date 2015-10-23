package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoSemDowngradeUtl {
		public static void downgradeTo102(NString rdfTablespace,NBool retry) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_SEM_DOWNGRADE_UTL.DOWNGRADE_TO_102", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RDF_TABLESPACE", rdfTablespace);
			cmd.addParameter("@RETRY", retry);
				
			cmd.execute();


		}
		
		public static void restoreRulebases(NBool bupgrade) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_SEM_DOWNGRADE_UTL.RESTORE_RULEBASES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BUPGRADE", bupgrade);
				
			cmd.execute();


		}
		
		public static void restoreRuleindices(NBool bupgrade) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_SEM_DOWNGRADE_UTL.RESTORE_RULEINDICES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BUPGRADE", bupgrade);
				
			cmd.execute();


		}
		
		public static void restoreRuleindices() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_SEM_DOWNGRADE_UTL.RESTORE_RULEINDICES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
