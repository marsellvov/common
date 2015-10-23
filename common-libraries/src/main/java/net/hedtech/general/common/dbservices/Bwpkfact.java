package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkfact {
		public static void csv(NString btnselected,NString pEmpPidm,NString pEmpTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFACT.CSV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BTNSELECTED", btnselected);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_EMP_TERM", pEmpTerm);
				
			cmd.execute();


		}
		
		public static void pDispacknowledge(NString pTerm,NString pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFACT.P_DISPACKNOWLEDGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pDispcrseinfowindow(NString pCollege,NString pCampus,NString pCrns,NString pPtrm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFACT.P_DISPCRSEINFOWINDOW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLLEGE", pCollege);
			cmd.addParameter("@P_CAMPUS", pCampus);
			cmd.addParameter("@P_CRNS", pCrns);
			cmd.addParameter("@P_PTRM", pPtrm);
				
			cmd.execute();


		}
		
//		public static void pUpdateacknowledge(NString pTerm,NString pPidm,List<Twbklibs.Varchar2TabtypeRow> pPosn,List<Twbklibs.Varchar2TabtypeRow> pSuff,List<Twbklibs.Varchar2TabtypeRow> pEffDate,NString pgComment,List<Twbklibs.Varchar2TabtypeRow> pgAck,NString pgTerm,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFACT.P_UPDATEACKNOWLEDGE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TERM", pTerm);
//			cmd.addParameter("@P_PIDM", pPidm);
//			// cmd.addParameter(DbTypes.getTableType("P_POSN", "", pPosn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SUFF", "", pSuff, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_EFF_DATE", "", pEffDate, object.class));
//			cmd.addParameter("@PG_COMMENT", pgComment);
//			// cmd.addParameter(DbTypes.getTableType("PG_ACK", "", pgAck, object.class));
//			cmd.addParameter("@PG_TERM", pgTerm);
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
//		
	
	
	
}
