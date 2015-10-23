package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkfslk {
		public static void pDisplocksummaryBody(NString pSortType,NString pgTerm,NString statselected,NString btnselected,NString pPidm,NString pLoginPidm,NString pgSourceInd,NString pgOrgnCode,NString pgCoasCode,NString pgNumrecs,NString pgRecno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFSLK.P_DISPLOCKSUMMARY_BODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SORT_TYPE", pSortType);
			cmd.addParameter("@PG_TERM", pgTerm);
			cmd.addParameter("@STATSELECTED", statselected);
			cmd.addParameter("@BTNSELECTED", btnselected);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LOGIN_PIDM", pLoginPidm);
			cmd.addParameter("@PG_SOURCE_IND", pgSourceInd);
			cmd.addParameter("@PG_ORGN_CODE", pgOrgnCode);
			cmd.addParameter("@PG_COAS_CODE", pgCoasCode);
			cmd.addParameter("@PG_NUMRECS", pgNumrecs);
			cmd.addParameter("@PG_RECNO", pgRecno);
				
			cmd.execute();


		}
		
//		public static void pUpdatelock(List<Twbklibs.Varchar2TabtypeRow> pPidm,List<Twbklibs.Varchar2TabtypeRow> pPosn,List<Twbklibs.Varchar2TabtypeRow> pSuff,List<Twbklibs.Varchar2TabtypeRow> pEffDate,List<Twbklibs.Varchar2TabtypeRow> pLockStatus,List<Twbklibs.Varchar2TabtypeRow> pgChglockInd,NString pgTerm,NString pgStatselected,NString pUserId,NString btnselected,NString pSortType,NString pSelectedPidm,NString pgNumrecs,NString pgRecno) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFSLK.P_UPDATELOCK", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_PIDM", "", pPidm, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_POSN", "", pPosn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SUFF", "", pSuff, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_EFF_DATE", "", pEffDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_LOCK_STATUS", "", pLockStatus, object.class));
//			// cmd.addParameter(DbTypes.getTableType("PG_CHGLOCK_IND", "", pgChglockInd, object.class));
//			cmd.addParameter("@PG_TERM", pgTerm);
//			cmd.addParameter("@PG_STATSELECTED", pgStatselected);
//			cmd.addParameter("@P_USER_ID", pUserId);
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
		
	
	
	
}
