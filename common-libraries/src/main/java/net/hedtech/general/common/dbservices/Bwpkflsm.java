package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkflsm {
		public static void csv(NString pgTermCode,NString pgEmpPidm,NString pgAction) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLSM.CSV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PG_TERM_CODE", pgTermCode);
			cmd.addParameter("@PG_EMP_PIDM", pgEmpPidm);
			cmd.addParameter("@PG_ACTION", pgAction);
				
			cmd.execute();


		}
		
		public static void pDispempsummary(NString pTerm,NString pEmpPidm,NString pRecordNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLSM.P_DISPEMPSUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_RECORD_NO", pRecordNo);
				
			cmd.execute();


		}
		
		public static void pDisplocksummary(NString pSortType,NString pgTerm,NString statselected,NString btnselected,NString pPidm,NString pgSourceInd,NString pgOrgnCode,NString pgCoasCode,NString pgNumrecs,NString pgRecno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLSM.P_DISPLOCKSUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SORT_TYPE", pSortType);
			cmd.addParameter("@PG_TERM", pgTerm);
			cmd.addParameter("@STATSELECTED", statselected);
			cmd.addParameter("@BTNSELECTED", btnselected);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@PG_SOURCE_IND", pgSourceInd);
			cmd.addParameter("@PG_ORGN_CODE", pgOrgnCode);
			cmd.addParameter("@PG_COAS_CODE", pgCoasCode);
			cmd.addParameter("@PG_NUMRECS", pgNumrecs);
			cmd.addParameter("@PG_RECNO", pgRecno);
				
			cmd.execute();


		}
		
//		public static void pDisplocksummarydriver(List<Twbklibs.Varchar2TabtypeRow> pPidm,List<Twbklibs.Varchar2TabtypeRow> pPosn,List<Twbklibs.Varchar2TabtypeRow> pSuff,List<Twbklibs.Varchar2TabtypeRow> pEffDate,List<Twbklibs.Varchar2TabtypeRow> pLockStatus,List<Twbklibs.Varchar2TabtypeRow> pgChglockInd,NString pgTerm,NString pgStatselected,NString btnselected,NString pSortType,NString pSelectedPidm,NString pgNumrecs,NString pgRecno) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLSM.P_DISPLOCKSUMMARYDRIVER", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_PIDM", "", pPidm, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_POSN", "", pPosn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SUFF", "", pSuff, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_EFF_DATE", "", pEffDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_LOCK_STATUS", "", pLockStatus, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_CHGLOCK_IND", "", pgChglockInd, object.class));
//			cmd.addParameter("@PG_TERM", pgTerm);
//			cmd.addParameter("@PG_STATSELECTED", pgStatselected);
//			cmd.addParameter("@BTNSELECTED", btnselected);
//			cmd.addParameter("@P_SORT_TYPE", pSortType);
//			cmd.addParameter("@P_SELECTED_PIDM", pSelectedPidm);
//			cmd.addParameter("@PG_NUMRECS", pgNumrecs);
//			cmd.addParameter("@PG_RECNO", pgRecno);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pDisporgnsummary(NString pTermCode,NNumber pRecordNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLSM.P_DISPORGNSUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_RECORD_NO", pRecordNo);
				
			cmd.execute();


		}
		
//		public static void pRestart(List<Twbklibs.Varchar2TabtypeRow> pgRestartind,NNumber pgRecordNo,NString pgAction) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFLSM.P_RESTART", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("PG_RESTARTIND", "", pgRestartind, object.class));
//			cmd.addParameter("@PG_RECORD_NO", pgRecordNo);
//			cmd.addParameter("@PG_ACTION", pgAction);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
