package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwsksphs {
		public static void pDisplaystatement(NNumber pStmtNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKSPHS.P_DISPLAYSTATEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STMT_NUMBER", pStmtNumber);
				
			cmd.execute();


		}
		
		public static void pViewstatement(NString pViewType,NNumber pStmtNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKSPHS.P_VIEWSTATEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VIEW_TYPE", pViewType);
			cmd.addParameter("@P_STMT_NUMBER", pStmtNumber);
				
			cmd.execute();


		}
		
		public static void pViewstatementbody(NString pViewType,NNumber pStmtNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKSPHS.P_VIEWSTATEMENTBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VIEW_TYPE", pViewType);
			cmd.addParameter("@P_STMT_NUMBER", pStmtNumber);
				
			cmd.execute();


		}
		
	
	
	
}
