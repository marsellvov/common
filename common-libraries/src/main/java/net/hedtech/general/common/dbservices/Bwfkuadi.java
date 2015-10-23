package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkuadi {
		public static void pAppdisappdoc(NString action,NString userid,NString qdocnum,NString qnextapprover,NString nextapprover,NString doctype,NString docnum,NNumber seqnum,NNumber chngnum,NNumber subnum,NNumber amount,NString comment,NString nsfind,NString queuetype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKUADI.P_APPDISAPPDOC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ACTION", action);
			cmd.addParameter("@USERID", userid);
			cmd.addParameter("@QDOCNUM", qdocnum);
			cmd.addParameter("@QNEXTAPPROVER", qnextapprover);
			cmd.addParameter("@NEXTAPPROVER", nextapprover);
			cmd.addParameter("@DOCTYPE", doctype);
			cmd.addParameter("@DOCNUM", docnum);
			cmd.addParameter("@SEQNUM", seqnum);
			cmd.addParameter("@CHNGNUM", chngnum);
			cmd.addParameter("@SUBNUM", subnum);
			cmd.addParameter("@AMOUNT", amount);
			cmd.addParameter("@COMMENT", comment);
			cmd.addParameter("@NSFIND", nsfind);
			cmd.addParameter("@QUEUETYPE", queuetype);
				
			cmd.execute();


		}
		
		public static void pApprovedoc(NString action,NString userid,NString qdocnum,NString qnextapprover,NString nextapprover,NString doctype,NString docnum,NNumber seqnum,NNumber chngnum,NNumber subnum,NNumber amount,NString comment,NString nsfind,NString queuetype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKUADI.P_APPROVEDOC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ACTION", action);
			cmd.addParameter("@USERID", userid);
			cmd.addParameter("@QDOCNUM", qdocnum);
			cmd.addParameter("@QNEXTAPPROVER", qnextapprover);
			cmd.addParameter("@NEXTAPPROVER", nextapprover);
			cmd.addParameter("@DOCTYPE", doctype);
			cmd.addParameter("@DOCNUM", docnum);
			cmd.addParameter("@SEQNUM", seqnum);
			cmd.addParameter("@CHNGNUM", chngnum);
			cmd.addParameter("@SUBNUM", subnum);
			cmd.addParameter("@AMOUNT", amount);
			cmd.addParameter("@COMMENT", comment);
			cmd.addParameter("@NSFIND", nsfind);
			cmd.addParameter("@QUEUETYPE", queuetype);
				
			cmd.execute();


		}
		
		public static void pDisapprovedoc(NString action,NString userid,NString qdocnum,NString qnextapprover,NString nextapprover,NString doctype,NString docnum,NNumber seqnum,NNumber chngnum,NNumber subnum,NNumber amount,NString comment,NString nsfind,NString queuetype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKUADI.P_DISAPPROVEDOC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ACTION", action);
			cmd.addParameter("@USERID", userid);
			cmd.addParameter("@QDOCNUM", qdocnum);
			cmd.addParameter("@QNEXTAPPROVER", qnextapprover);
			cmd.addParameter("@NEXTAPPROVER", nextapprover);
			cmd.addParameter("@DOCTYPE", doctype);
			cmd.addParameter("@DOCNUM", docnum);
			cmd.addParameter("@SEQNUM", seqnum);
			cmd.addParameter("@CHNGNUM", chngnum);
			cmd.addParameter("@SUBNUM", subnum);
			cmd.addParameter("@AMOUNT", amount);
			cmd.addParameter("@COMMENT", comment);
			cmd.addParameter("@NSFIND", nsfind);
			cmd.addParameter("@QUEUETYPE", queuetype);
				
			cmd.execute();


		}
		
	
	
	
}
