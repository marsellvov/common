package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkfcmt {
		public static void pDispcomments(NString pTerm,NString pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCMT.P_DISPCOMMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pDispcommentsadmin(NString pTerm,NString pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCMT.P_DISPCOMMENTSADMIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pDisperrors(NString pTerm,NString pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCMT.P_DISPERRORS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pDispnotes(NString pTerm,NString pFcnt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCMT.P_DISPNOTES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_FCNT", pFcnt);
				
			cmd.execute();


		}
		
		public static void pUpdatecomments(NString pComments,NString pRole) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFCMT.P_UPDATECOMMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_ROLE", pRole);
				
			cmd.execute();


		}
		
	
	
	
}
