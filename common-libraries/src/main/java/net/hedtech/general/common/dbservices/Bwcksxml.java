package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwcksxml {
		public static NNumber fGetadvrpidm(NNumber pidm,NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSXML.F_GETADVRPIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetemailaddress(NNumber pidmIn,NString emailCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSXML.F_GETEMAILADDRESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@EMAIL_CODE_IN", emailCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetemailnamestr(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSXML.F_GETEMAILNAMESTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void report(NNumber pRequestNo,NString pStvcprt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSXML.REPORT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_NO", pRequestNo);
			cmd.addParameter("@P_STVCPRT", pStvcprt);
				
			cmd.execute();


		}
		
		public static void xml(NNumber pRequestNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSXML.XML", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REQUEST_NO", pRequestNo);
				
			cmd.execute();


		}
		
	
	
	
}
