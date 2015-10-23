package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Slkmods {
		public static void pInsertSlrcolr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKMODS.P_INSERT_SLRCOLR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateSlrcolr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKMODS.P_UPDATE_SLRCOLR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateSlrmasgArInd(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKMODS.P_UPDATE_SLRMASG_AR_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pUpdateSlrmasgAssess(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKMODS.P_UPDATE_SLRMASG_ASSESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pUpdateSlrpasgArInd(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKMODS.P_UPDATE_SLRPASG_AR_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pUpdateSlrpasgAssess(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKMODS.P_UPDATE_SLRPASG_ASSESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pUpdateSlrrasgArInd(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKMODS.P_UPDATE_SLRRASG_AR_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pUpdateSlrrasgAssess(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SLKMODS.P_UPDATE_SLRRASG_ASSESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
	
	
	
}
