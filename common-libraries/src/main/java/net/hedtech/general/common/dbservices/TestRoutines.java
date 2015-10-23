package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TestRoutines {
		public static NString fQueryOneString(NString pCode,NString pRowid,NString pSeparationChar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TEST_ROUTINES.F_QUERY_ONE_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_SEPARATION_CHAR", pSeparationChar);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void populateRecord(NString datastring,NNumber datarownum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TEST_ROUTINES.POPULATE_RECORD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DATASTRING", datastring);
			cmd.addParameter("@DATAROWNUM", datarownum);
				
			cmd.execute();


		}
		
		public static void populateTable(NString tablename,NString ownername,NString packagename,NString recordname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TEST_ROUTINES.POPULATE_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLENAME", tablename);
			cmd.addParameter("@OWNERNAME", ownername);
			cmd.addParameter("@PACKAGENAME", packagename);
			cmd.addParameter("@RECORDNAME", recordname);
				
			cmd.execute();


		}
		
	
	
	
}
