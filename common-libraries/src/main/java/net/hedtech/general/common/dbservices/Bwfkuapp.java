package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkuapp {
		public static NString fGetdocnsf(NNumber seqnum,NString docnum,NNumber chngnum,NNumber subnum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKUAPP.F_GETDOCNSF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SEQNUM", seqnum);
			cmd.addParameter("@DOCNUM", docnum);
			cmd.addParameter("@CHNGNUM", chngnum);
			cmd.addParameter("@SUBNUM", subnum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetdoctype(NString docnum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKUAPP.F_GETDOCTYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DOCNUM", docnum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetqueuetype(NString userid,NString docnum,NNumber seqnum,NNumber chngnum,NNumber subnum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKUAPP.F_GETQUEUETYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USERID", userid);
			cmd.addParameter("@DOCNUM", docnum);
			cmd.addParameter("@SEQNUM", seqnum);
			cmd.addParameter("@CHNGNUM", chngnum);
			cmd.addParameter("@SUBNUM", subnum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetuserid(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKUAPP.F_GETUSERID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDisplaydoc(NString qdocnum,NString userid,NString qnextapprover,NString nextapprover,NString docnum,NNumber seqnum,NNumber chngnum,NNumber subnum,NString originator,NNumber amount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKUAPP.P_DISPLAYDOC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@QDOCNUM", qdocnum);
			cmd.addParameter("@USERID", userid);
			cmd.addParameter("@QNEXTAPPROVER", qnextapprover);
			cmd.addParameter("@NEXTAPPROVER", nextapprover);
			cmd.addParameter("@DOCNUM", docnum);
			cmd.addParameter("@SEQNUM", seqnum);
			cmd.addParameter("@CHNGNUM", chngnum);
			cmd.addParameter("@SUBNUM", subnum);
			cmd.addParameter("@ORIGINATOR", originator);
			cmd.addParameter("@AMOUNT", amount);
				
			cmd.execute();


		}
		
		public static void pUserapproval(NString action,NString userid,NString qdocnum,NString qnextapprover) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKUAPP.P_USERAPPROVAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ACTION", action);
			cmd.addParameter("@USERID", userid);
			cmd.addParameter("@QDOCNUM", qdocnum);
			cmd.addParameter("@QNEXTAPPROVER", qnextapprover);
				
			cmd.execute();


		}
		
	
	
	
}
