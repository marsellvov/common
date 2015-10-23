package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwaknote {
		public static void pChildrennote() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKNOTE.P_CHILDRENNOTE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDegreenote() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKNOTE.P_DEGREENOTE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGeneralnote() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKNOTE.P_GENERALNOTE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertComment(NString comment,NString okForNotes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKNOTE.P_INSERT_COMMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COMMENT", comment);
			cmd.addParameter("@OK_FOR_NOTES", okForNotes);
				
			cmd.execute();


		}
		
		public static void pJobnote() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKNOTE.P_JOBNOTE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pMaritalnote() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKNOTE.P_MARITALNOTE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
