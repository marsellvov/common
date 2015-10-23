package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkauth {
		public static NString fCpauthenticate(NString id,NString pin,NString encrFlag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKAUTH.F_CPAUTHENTICATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID", id);
			cmd.addParameter("@PIN", pin);
			cmd.addParameter("@ENCR_FLAG", encrFlag);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFetchcpcookieval() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKAUTH.F_FETCHCPCOOKIEVAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fFetchcplastaccess() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKAUTH.F_FETCHCPLASTACCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fGetlastactivitytime(NString id) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKAUTH.F_GETLASTACTIVITYTIME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID", id);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fReconstructcpcookie(NString webid,NString pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKAUTH.F_RECONSTRUCTCPCOOKIE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@WEBID", webid);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fRetrieveroles(NString id) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKAUTH.F_RETRIEVEROLES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID", id);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pParsecpcookie(NString cookieval) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKAUTH.P_PARSECPCOOKIE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COOKIEVAL", cookieval);
				
			cmd.execute();


		}
		
		public static void pSessionInit(NString pUdcid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKAUTH.P_SESSION_INIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_UDCID", pUdcid);
				
			cmd.execute();


		}
		
	
	
	
}
