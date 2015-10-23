package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkfsem {
		public static NString fCheckAssignChanges(NNumber pPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFSEM.F_CHECK_ASSIGN_CHANGES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckMoreAssgnExists(NNumber pPidm,NString pTermCode,NString pPosn,NString pSuff,NDate pEffectiveDate,NNumber pGlobalPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFSEM.F_CHECK_MORE_ASSGN_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_GLOBAL_PIDM", pGlobalPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fJobOverloadEffectivedt(NNumber pPidm,NString pTermCode,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFSEM.F_JOB_OVERLOAD_EFFECTIVEDT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static void pDispEmpSummaryBody(NNumber globalPidm,NNumber pEmpPidm,NString pTermCode,NNumber pRecordNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFSEM.P_DISP_EMP_SUMMARY_BODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GLOBAL_PIDM", globalPidm);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_RECORD_NO", pRecordNo);
				
			cmd.execute();


		}
		
		public static void pDispSelectedFilters(NNumber globalPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFSEM.P_DISP_SELECTED_FILTERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GLOBAL_PIDM", globalPidm);
				
			cmd.execute();


		}
		
		public static void pDownload(NNumber globalPidm,NString pEmpPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFSEM.P_DOWNLOAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@GLOBAL_PIDM", globalPidm);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();


		}
		
//		public static void pRestart(NString pgTermCode,List<Twbklibs.Varchar2TabtypeRow> pgRestartind,NString pgEmpPidm,NString pUserId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFSEM.P_RESTART", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PG_TERM_CODE", pgTermCode);
//			// cmd.addParameter(DbTypes.getTableType("PG_RESTARTIND", "", pgRestartind, object.class));
//			cmd.addParameter("@PG_EMP_PIDM", pgEmpPidm);
//			cmd.addParameter("@P_USER_ID", pUserId);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
