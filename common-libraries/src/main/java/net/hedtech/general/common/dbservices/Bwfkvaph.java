package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkvaph {
		public static NString fGetEncUser(NString docnumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVAPH.F_GET_ENC_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DOCNUMBER", docnumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetInvUser(NString docnumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVAPH.F_GET_INV_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DOCNUMBER", docnumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetJvUser(NString docnumber,NNumber subnum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVAPH.F_GET_JV_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DOCNUMBER", docnumber);
			cmd.addParameter("@SUBNUM", subnum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetName(NString user) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVAPH.F_GET_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER", user);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPoUser(NString docnumber,NNumber chngnum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVAPH.F_GET_PO_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DOCNUMBER", docnumber);
			cmd.addParameter("@CHNGNUM", chngnum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetReqUser(NString docnumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVAPH.F_GET_REQ_USER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DOCNUMBER", docnumber);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pViewaph(NNumber doctype,NString docnumber,NNumber subnum,NNumber chngnum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVAPH.P_VIEWAPH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DOCTYPE", doctype);
			cmd.addParameter("@DOCNUMBER", docnumber);
			cmd.addParameter("@SUBNUM", subnum);
			cmd.addParameter("@CHNGNUM", chngnum);
				
			cmd.execute();


		}
		
		public static void pViewappr(NString queue,NNumber level) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKVAPH.P_VIEWAPPR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@QUEUE", queue);
			cmd.addParameter("@LEVEL", level);
				
			cmd.execute();


		}
		
	
	
	
}
