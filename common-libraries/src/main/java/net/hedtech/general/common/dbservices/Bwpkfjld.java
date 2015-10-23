package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkfjld {
		public static void pPrintEmpJobInfo(NString pTermCode,NNumber pEmpPidm,NString pPosn,NString pSuff,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFJLD.P_PRINT_EMP_JOB_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();


		}
		
//		public static void pPrintJoblabordist(NNumber pEmpPidm,NString pTermCode,NString pPosn,NString pSuff,NDate pEffectiveDate,NNumber pGlobalPidm,List<Twbklibs.Varchar2TabtypeRow> dseqno,List<Twbklibs.Varchar2TabtypeRow> dcoas,List<Twbklibs.Varchar2TabtypeRow> dacci,List<Twbklibs.Varchar2TabtypeRow> dfund,List<Twbklibs.Varchar2TabtypeRow> dorgn,List<Twbklibs.Varchar2TabtypeRow> dacct,List<Twbklibs.Varchar2TabtypeRow> dprog,List<Twbklibs.Varchar2TabtypeRow> dactv,List<Twbklibs.Varchar2TabtypeRow> dlocn,List<Twbklibs.Varchar2TabtypeRow> dproj,List<Twbklibs.Varchar2TabtypeRow> dctyp,List<Twbklibs.Varchar2TabtypeRow> dpct,List<Twbklibs.Varchar2TabtypeRow> dacctext,List<Twbklibs.Varchar2TabtypeRow> drowid,List<Twbklibs.Varchar2TabtypeRow> dremove,List<Twbklibs.Varchar2TabtypeRow> dfunddb,List<Twbklibs.Varchar2TabtypeRow> dencenddate) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFJLD.P_PRINT_JOBLABORDIST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_POSN", pPosn);
//			cmd.addParameter("@P_SUFF", pSuff);
//			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
//			cmd.addParameter("@P_GLOBAL_PIDM", pGlobalPidm);
//			// cmd.addParameter(DbTypes.getTableType("DSEQNO", "", dseqno, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DCOAS", "", dcoas, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DACCI", "", dacci, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DFUND", "", dfund, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DORGN", "", dorgn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DACCT", "", dacct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DPROG", "", dprog, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DACTV", "", dactv, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DLOCN", "", dlocn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DPROJ", "", dproj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DCTYP", "", dctyp, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DPCT", "", dpct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DACCTEXT", "", dacctext, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DROWID", "", drowid, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DREMOVE", "", dremove, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DFUNDDB", "", dfunddb, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DENCENDDATE", "", dencenddate, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pSetTabDriver(NString pViewTab,NString pTermCode,NString pEmpPidm,NString pPosn,NString pSuff,NString pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFJLD.P_SET_TAB_DRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VIEW_TAB", pViewTab);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();


		}
		
//		public static void pUpdateJoblabordist(NNumber pEmpPidm,NString pTermCode,NString pPosn,NString pSuff,NDate pEffectiveDate,NNumber pGlobalPidm,List<Twbklibs.Varchar2TabtypeRow> dseqno,List<Twbklibs.Varchar2TabtypeRow> dcoas,List<Twbklibs.Varchar2TabtypeRow> dacci,List<Twbklibs.Varchar2TabtypeRow> dfund,List<Twbklibs.Varchar2TabtypeRow> dorgn,List<Twbklibs.Varchar2TabtypeRow> dacct,List<Twbklibs.Varchar2TabtypeRow> dprog,List<Twbklibs.Varchar2TabtypeRow> dactv,List<Twbklibs.Varchar2TabtypeRow> dlocn,List<Twbklibs.Varchar2TabtypeRow> dproj,List<Twbklibs.Varchar2TabtypeRow> dctyp,List<Twbklibs.Varchar2TabtypeRow> dpct,List<Twbklibs.Varchar2TabtypeRow> dacctext,List<Twbklibs.Varchar2TabtypeRow> dremove,List<Twbklibs.Varchar2TabtypeRow> drowid,List<Twbklibs.Varchar2TabtypeRow> dfunddb,List<Twbklibs.Varchar2TabtypeRow> dencenddate,NString btnAction) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFJLD.P_UPDATE_JOBLABORDIST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_POSN", pPosn);
//			cmd.addParameter("@P_SUFF", pSuff);
//			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
//			cmd.addParameter("@P_GLOBAL_PIDM", pGlobalPidm);
//			// cmd.addParameter(DbTypes.getTableType("DSEQNO", "", dseqno, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DCOAS", "", dcoas, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DACCI", "", dacci, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DFUND", "", dfund, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DORGN", "", dorgn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DACCT", "", dacct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DPROG", "", dprog, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DACTV", "", dactv, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DLOCN", "", dlocn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DPROJ", "", dproj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DCTYP", "", dctyp, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DPCT", "", dpct, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DACCTEXT", "", dacctext, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DREMOVE", "", dremove, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DROWID", "", drowid, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DFUNDDB", "", dfunddb, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DENCENDDATE", "", dencenddate, object.class));
//			cmd.addParameter("@BTN_ACTION", btnAction);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
