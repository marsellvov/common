package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Goksevn {
		public static void pChangePin(NNumber pidm,NString pin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSEVN.P_CHANGE_PIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@PIN", pin);
				
			cmd.execute();


		}
		
		public static void pEmailInsert(NNumber pidm,NString ecode,NString prefInd,NString eaddr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSEVN.P_EMAIL_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@ECODE", ecode);
			cmd.addParameter("@PREF_IND", prefInd);
			cmd.addParameter("@EADDR", eaddr);
				
			cmd.execute();


		}
		
		public static void pEmailUpdate(NNumber pidm,NString ecode,NString prefInd,NString eaddr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSEVN.P_EMAIL_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@ECODE", ecode);
			cmd.addParameter("@PREF_IND", prefInd);
			cmd.addParameter("@EADDR", eaddr);
				
			cmd.execute();


		}
		
		public static void pEmaileventcheck(NString actionInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSEVN.P_EMAILEVENTCHECK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ACTION_IND", actionInd);
				
			cmd.execute();


		}
		
		public static void pPasswordevnt(NString uname,NString pword) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSEVN.P_PASSWORDEVNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@UNAME", uname);
			cmd.addParameter("@PWORD", pword);
				
			cmd.execute();


		}
		
		public static void pWfedevnt(NNumber transNo,Ref<NBool> errorInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKSEVN.P_WFEDEVNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_NO", transNo);
			cmd.addParameter("@ERROR_IND", errorInd, true);
				
			cmd.execute();
			errorInd.val = cmd.getParameterValue("@ERROR_IND", NBool.class);


		}
		
	
	
	
}
