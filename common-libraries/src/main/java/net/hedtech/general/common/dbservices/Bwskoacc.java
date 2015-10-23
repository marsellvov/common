package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskoacc {
		public static void pDisplaytabs(NString tabType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKOACC.P_DISPLAYTABS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TAB_TYPE", tabType);
				
			cmd.execute();


		}
		
		public static void pSeldefterm(NString termIn,NString callingProcName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKOACC.P_SELDEFTERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
				
			cmd.execute();


		}
		
		public static void pSelectterm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKOACC.P_SELECTTERM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSelecttermacct() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKOACC.P_SELECTTERMACCT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pViewacct() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKOACC.P_VIEWACCT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pViewacctterm(NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKOACC.P_VIEWACCTTERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pViewaccttotal() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKOACC.P_VIEWACCTTOTAL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pViewar() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKOACC.P_VIEWAR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pViewhold(NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKOACC.P_VIEWHOLD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
				
			cmd.execute();


		}
		
		public static void pViewinstallments(NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKOACC.P_VIEWINSTALLMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
	
	
	
}
