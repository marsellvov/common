package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkostm {
		public static void pAdvselterm(NString term,NString callingProcName,NString callingProcName2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOSTM.P_ADVSELTERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
				
			cmd.execute();


		}
		
		public static void pFacselterm(NString term,NString callingProcName,NString callingProcName2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOSTM.P_FACSELTERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
				
			cmd.execute();


		}
		
		public static void pFacstoreterm(NString term,NString name1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOSTM.P_FACSTORETERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@NAME1", name1);
				
			cmd.execute();


		}
		
	
	
	
}
