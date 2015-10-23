package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkocrn {
		public static void pFaccrnsel(NString term,NString callingProcName,NString callingProcName2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOCRN.P_FACCRNSEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
				
			cmd.execute();


		}
		
		public static void pFacentercrn(NString term,NString callingProcName,NString callingProcName2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOCRN.P_FACENTERCRN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
				
			cmd.execute();


		}
		
		public static void pFacstorecrn(NString crn,NString name1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOCRN.P_FACSTORECRN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@NAME1", name1);
				
			cmd.execute();


		}
		
		public static void pFacverifycrn(NString term,NString crn,NString callingProcName,NString callingProcName2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOCRN.P_FACVERIFYCRN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
				
			cmd.execute();


		}
		
	
	
	
}
