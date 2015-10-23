package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkepcr {
		public static void pPrintAddrSelection(NString pEpafid,NString pQuerydt,NString pAcat,NString pApty,NString pAptySeqno,NString pCurView,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPCR.P_PRINT_ADDR_SELECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EPAFID", pEpafid);
			cmd.addParameter("@P_QUERYDT", pQuerydt);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_APTY", pApty);
			cmd.addParameter("@P_APTY_SEQNO", pAptySeqno);
			cmd.addParameter("@P_CUR_VIEW", pCurView);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pPrintAddrteleSelection(NString pEpafid,NString pQuerydt,NString pAcat,NString pApty,NString pAptySeqno,NString pCurView,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPCR.P_PRINT_ADDRTELE_SELECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EPAFID", pEpafid);
			cmd.addParameter("@P_QUERYDT", pQuerydt);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_APTY", pApty);
			cmd.addParameter("@P_APTY_SEQNO", pAptySeqno);
			cmd.addParameter("@P_CUR_VIEW", pCurView);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pPrintJobsSelection(NNumber pPidm,NString pPosn,NString pSuff,NString selPersid,NString selQuerydt,NString selAcat,NString selApty,NString selAptySeqno,NString pInclTerminated) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPCR.P_PRINT_JOBS_SELECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@SEL_PERSID", selPersid);
			cmd.addParameter("@SEL_QUERYDT", selQuerydt);
			cmd.addParameter("@SEL_ACAT", selAcat);
			cmd.addParameter("@SEL_APTY", selApty);
			cmd.addParameter("@SEL_APTY_SEQNO", selAptySeqno);
			cmd.addParameter("@P_INCL_TERMINATED", pInclTerminated);
				
			cmd.execute();


		}
		
		public static void pPrintMatches(NString pUser,NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPCR.P_PRINT_MATCHES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pPrintPersSelection(NString pEpafid,NString pQuerydt,NString pAcat,NString pUser,NString btnselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPCR.P_PRINT_PERS_SELECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EPAFID", pEpafid);
			cmd.addParameter("@P_QUERYDT", pQuerydt);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@BTNSELECTED", btnselected);
				
			cmd.execute();


		}
		
//		public static void pPrintPosnSelection(NString pgPosnsrch,List<Twbklibs.Varchar2TabtypeRow> pgEcls,List<Twbklibs.Varchar2TabtypeRow> pgCoa,List<Twbklibs.Varchar2TabtypeRow> pgOrgn,NString btnselected,NString pSort,NNumber globalPidm) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPCR.P_PRINT_POSN_SELECTION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PG_POSNSRCH", pgPosnsrch);
//			// cmd.addParameter(DbTypes.getTableType("PG_ECLS", "", pgEcls, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_COA", "", pgCoa, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_ORGN", "", pgOrgn, object.class));
//			cmd.addParameter("@BTNSELECTED", btnselected);
//			cmd.addParameter("@P_SORT", pSort);
//			cmd.addParameter("@GLOBAL_PIDM", globalPidm);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pPrintTeleSelection(NString pEpafid,NString pQuerydt,NString pAcat,NString pApty,NString pAptySeqno,NString pCurView,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPCR.P_PRINT_TELE_SELECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EPAFID", pEpafid);
			cmd.addParameter("@P_QUERYDT", pQuerydt);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_APTY", pApty);
			cmd.addParameter("@P_APTY_SEQNO", pAptySeqno);
			cmd.addParameter("@P_CUR_VIEW", pCurView);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pPrintVerification(NString pSource,NNumber attemptno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPCR.P_PRINT_VERIFICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@ATTEMPTNO", attemptno);
				
			cmd.execute();


		}
		
//		public static void pSelectaddrtelebody(NNumber pPidm,NString pCurView,NString pNextApty,NString pNextAptySeq,NString aptyselected,List<Twbklibs.Varchar2TabtypeRow> valselected,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPCR.P_SELECTADDRTELEBODY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_CUR_VIEW", pCurView);
//			cmd.addParameter("@P_NEXT_APTY", pNextApty);
//			cmd.addParameter("@P_NEXT_APTY_SEQ", pNextAptySeq);
//			cmd.addParameter("@APTYSELECTED", aptyselected);
//			// cmd.addParameter(DbTypes.getTableType("VALSELECTED", "", valselected, object.class));
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pValidateDuplicatecheck(NString btnselected,NString selectedId,NNumber pTransNo,NNumber globalPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPCR.P_VALIDATE_DUPLICATECHECK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BTNSELECTED", btnselected);
			cmd.addParameter("@SELECTED_ID", selectedId);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
			cmd.addParameter("@GLOBAL_PIDM", globalPidm);
				
			cmd.execute();


		}
		
//		public static void pValidateJob(NString pgPidm,NString pgPosn,NString pgPosntitle,NString pgSuff,NString pgNextApty,NString pgNextAptySeqno,List<Twbklibs.Varchar2TabtypeRow> jobselected,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPCR.P_VALIDATE_JOB", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PG_PIDM", pgPidm);
//			cmd.addParameter("@PG_POSN", pgPosn);
//			cmd.addParameter("@PG_POSNTITLE", pgPosntitle);
//			cmd.addParameter("@PG_SUFF", pgSuff);
//			cmd.addParameter("@PG_NEXT_APTY", pgNextApty);
//			cmd.addParameter("@PG_NEXT_APTY_SEQNO", pgNextAptySeqno);
//			// cmd.addParameter(DbTypes.getTableType("JOBSELECTED", "", jobselected, object.class));
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pValidatePerson(NNumber globalPidm,NString pgPersid,NString pgQuerydt,NString pgAcat,NString globalUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPCR.P_VALIDATE_PERSON", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GLOBAL_PIDM", globalPidm);
			cmd.addParameter("@PG_PERSID", pgPersid);
			cmd.addParameter("@PG_QUERYDT", pgQuerydt);
			cmd.addParameter("@PG_ACAT", pgAcat);
			cmd.addParameter("@GLOBAL_USER", globalUser);
				
			cmd.execute();


		}
		
		public static void pValidatePin(NString usrid,NString pinno,NNumber attemptno,NString pSource,NNumber globalPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEPCR.P_VALIDATE_PIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USRID", usrid);
			cmd.addParameter("@PINNO", pinno);
			cmd.addParameter("@ATTEMPTNO", attemptno);
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@GLOBAL_PIDM", globalPidm);
				
			cmd.execute();


		}
		
	
	
	
}
