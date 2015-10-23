package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwakmail {
		public static void pAddToMailList(NString mail,NString atyp,NString mdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKMAIL.P_ADD_TO_MAIL_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAIL", mail);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@MDATE", mdate);
				
			cmd.execute();


		}
		
		public static void pChangeMailList(NString mail,NString atyp,NString mdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKMAIL.P_CHANGE_MAIL_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAIL", mail);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@MDATE", mdate);
				
			cmd.execute();


		}
		
		public static void pProcaddToMailList(NString mail,NString atyp,NString mdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKMAIL.P_PROCADD_TO_MAIL_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAIL", mail);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@MDATE", mdate);
				
			cmd.execute();


		}
		
		public static void pProcchangeMailList(NString mail,NString atyp,NString mdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKMAIL.P_PROCCHANGE_MAIL_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAIL", mail);
			cmd.addParameter("@ATYP", atyp);
			cmd.addParameter("@MDATE", mdate);
				
			cmd.execute();


		}
		
		public static void pProcremoveFromMailList(NString mail) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKMAIL.P_PROCREMOVE_FROM_MAIL_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAIL", mail);
				
			cmd.execute();


		}
		
		public static void pRemoveFromMailList(NString mail) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKMAIL.P_REMOVE_FROM_MAIL_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAIL", mail);
				
			cmd.execute();


		}
		
		public static void pSelchangeMailList(NString mail) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKMAIL.P_SELCHANGE_MAIL_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAIL", mail);
				
			cmd.execute();


		}
		
		public static void pViewMailList() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKMAIL.P_VIEW_MAIL_LIST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
