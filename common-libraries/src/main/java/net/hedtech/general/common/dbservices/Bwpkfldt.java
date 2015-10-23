package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkfldt {
		public static void pCreateCsv(NNumber pEmpPidm,NString pEmpTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLDT.P_CREATE_CSV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_EMP_TERM", pEmpTerm);
				
			cmd.execute();


		}
		
		public static void pPrintAssignment(NNumber pEmpPidm,NString pEmpTerm,NString pEmpRole,NNumber pLoginPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLDT.P_PRINT_ASSIGNMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_EMP_TERM", pEmpTerm);
			cmd.addParameter("@P_EMP_ROLE", pEmpRole);
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
				
			cmd.execute();


		}
		
		public static void pPrintCrseInfoWindow(NString pCollege,NString pCampus,NString pCrns,NString pPtrm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLDT.P_PRINT_CRSE_INFO_WINDOW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLLEGE", pCollege);
			cmd.addParameter("@P_CAMPUS", pCampus);
			cmd.addParameter("@P_CRNS", pCrns);
			cmd.addParameter("@P_PTRM", pPtrm);
				
			cmd.execute();


		}
		
//		public static void pSaveAcknowledge(NString pTerm,NString pPidm,List<Twbklibs.Varchar2TabtypeRow> pPosn,List<Twbklibs.Varchar2TabtypeRow> pSuff,NString pgComment,List<Twbklibs.Varchar2TabtypeRow> pgAck,NString pgTerm,NString btnselected,NString pUserId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLDT.P_SAVE_ACKNOWLEDGE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TERM", pTerm);
//			cmd.addParameter("@P_PIDM", pPidm);
//			// cmd.addParameter(DbTypes.getTableType("P_POSN", "", pPosn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SUFF", "", pSuff, object.class));
//			cmd.addParameter("@PG_COMMENT", pgComment);
//			// cmd.addParameter(DbTypes.getTableType("PG_ACK", "", pgAck, object.class));
//			cmd.addParameter("@PG_TERM", pgTerm);
//			cmd.addParameter("@BTNSELECTED", btnselected);
//			cmd.addParameter("@P_USER_ID", pUserId);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
