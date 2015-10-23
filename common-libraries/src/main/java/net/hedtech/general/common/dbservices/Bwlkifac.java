package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkifac {
		public static void pFacProcCrseSchd(NString gotoDateIn,NString startDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKIFAC.P_FAC_PROC_CRSE_SCHD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GOTO_DATE_IN", gotoDateIn);
			cmd.addParameter("@START_DATE_IN", startDateIn);
				
			cmd.execute();


		}
		
		public static void pFacdaysched(NString startDateIn,NString errorMsgIn,NString errorDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKIFAC.P_FACDAYSCHED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@START_DATE_IN", startDateIn);
			cmd.addParameter("@ERROR_MSG_IN", errorMsgIn);
			cmd.addParameter("@ERROR_DATE_IN", errorDateIn);
				
			cmd.execute();


		}
		
		public static void pFacsched(NString term,NString crn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKIFAC.P_FACSCHED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
				
			cmd.execute();


		}
		
//		public static void pFacsched(List<TempTermInRow> termIn,NString crn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKIFAC.P_FACSCHED", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			cmd.addParameter("@CRN", crn);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
