package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkfjob {
//		public static void pDispjobacctdistr(NString pEmpPidm,NString pTermCode,NString pPosn,NString pSuff,NString pEffectiveDate,List<Twbklibs.Varchar2TabtypeRow> dseqno,List<Twbklibs.Varchar2TabtypeRow> dcoas,List<Twbklibs.Varchar2TabtypeRow> dacci,List<Twbklibs.Varchar2TabtypeRow> dfund,List<Twbklibs.Varchar2TabtypeRow> dorgn,List<Twbklibs.Varchar2TabtypeRow> dacct,List<Twbklibs.Varchar2TabtypeRow> dprog,List<Twbklibs.Varchar2TabtypeRow> dactv,List<Twbklibs.Varchar2TabtypeRow> dlocn,List<Twbklibs.Varchar2TabtypeRow> dproj,List<Twbklibs.Varchar2TabtypeRow> dctyp,List<Twbklibs.Varchar2TabtypeRow> dpct,List<Twbklibs.Varchar2TabtypeRow> dacctext,List<Twbklibs.Varchar2TabtypeRow> drowid,List<Twbklibs.Varchar2TabtypeRow> dremove,List<Twbklibs.Varchar2TabtypeRow> dfunddb,List<Twbklibs.Varchar2TabtypeRow> dencenddate) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFJOB.P_DISPJOBACCTDISTR", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_POSN", pPosn);
//			cmd.addParameter("@P_SUFF", pSuff);
//			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
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
		
		public static void pDispjobdetl(NString pViewTab,NString pTermCode,NString pEmpPidm,NString pPosn,NString pSuff,NString pOldEffDate,NString pNewEffDate,NString pContType,NString pBeginDate,NString pPersDate,NString pEndDate,NString pJcreCode,NString pJobTitle,NString pJobFte,NString pApptPct,NString pHrsDay,NString pSgrp,NString pSalTable,NString pSalGrade,NString pSalStep,NString pHrsPay,NString pRegRate,NString pAssignSal,NString pFactor,NString pPay,NString pAnnualSal,NString pDefdPay,NString pChangedField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFJOB.P_DISPJOBDETL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VIEW_TAB", pViewTab);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_OLD_EFF_DATE", pOldEffDate);
			cmd.addParameter("@P_NEW_EFF_DATE", pNewEffDate);
			cmd.addParameter("@P_CONT_TYPE", pContType);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_PERS_DATE", pPersDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_JCRE_CODE", pJcreCode);
			cmd.addParameter("@P_JOB_TITLE", pJobTitle);
			cmd.addParameter("@P_JOB_FTE", pJobFte);
			cmd.addParameter("@P_APPT_PCT", pApptPct);
			cmd.addParameter("@P_HRS_DAY", pHrsDay);
			cmd.addParameter("@P_SGRP", pSgrp);
			cmd.addParameter("@P_SAL_TABLE", pSalTable);
			cmd.addParameter("@P_SAL_GRADE", pSalGrade);
			cmd.addParameter("@P_SAL_STEP", pSalStep);
			cmd.addParameter("@P_HRS_PAY", pHrsPay);
			cmd.addParameter("@P_REG_RATE", pRegRate);
			cmd.addParameter("@P_ASSIGN_SAL", pAssignSal);
			cmd.addParameter("@P_FACTOR", pFactor);
			cmd.addParameter("@P_PAY", pPay);
			cmd.addParameter("@P_ANNUAL_SAL", pAnnualSal);
			cmd.addParameter("@P_DEFD_PAY", pDefdPay);
			cmd.addParameter("@P_CHANGED_FIELD", pChangedField);
				
			cmd.execute();


		}
		
//		public static void pDispjobearnings(NString pViewTab,NString pTermCode,NString pEmpPidm,NString pPosn,NString pSuff,NString pOldEffDate,List<Twbklibs.Varchar2TabtypeRow> pEffectiveDate,List<Twbklibs.Varchar2TabtypeRow> pEarnCode,List<Twbklibs.Varchar2TabtypeRow> pHrs,List<Twbklibs.Varchar2TabtypeRow> pDeemedHrs,List<Twbklibs.Varchar2TabtypeRow> pSpecialRate,List<Twbklibs.Varchar2TabtypeRow> pShift,List<Twbklibs.Varchar2TabtypeRow> pCancelDate,List<Twbklibs.Varchar2TabtypeRow> pRowid,List<Twbklibs.Varchar2TabtypeRow> pRemove) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFJOB.P_DISPJOBEARNINGS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_VIEW_TAB", pViewTab);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
//			cmd.addParameter("@P_POSN", pPosn);
//			cmd.addParameter("@P_SUFF", pSuff);
//			cmd.addParameter("@P_OLD_EFF_DATE", pOldEffDate);
//			// cmd.addParameter(DbTypes.getTableType("P_EFFECTIVE_DATE", "", pEffectiveDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_EARN_CODE", "", pEarnCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_HRS", "", pHrs, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_DEEMED_HRS", "", pDeemedHrs, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SPECIAL_RATE", "", pSpecialRate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SHIFT", "", pShift, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CANCEL_DATE", "", pCancelDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ROWID", "", pRowid, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_REMOVE", "", pRemove, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pDispvalidsalavalues(NString lovName,NString salGroup,NString salTable,NString salGrade,NString srchval,NString btnselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFJOB.P_DISPVALIDSALAVALUES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LOV_NAME", lovName);
			cmd.addParameter("@SAL_GROUP", salGroup);
			cmd.addParameter("@SAL_TABLE", salTable);
			cmd.addParameter("@SAL_GRADE", salGrade);
			cmd.addParameter("@SRCHVAL", srchval);
			cmd.addParameter("@BTNSELECTED", btnselected);
				
			cmd.execute();


		}
		
		public static void pPrintEmpJobInfo(NString pTermCode,NNumber pEmpPidm,NString pPosn,NString pSuff,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFJOB.P_PRINT_EMP_JOB_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();


		}
		
		public static void pSetTabDriver(NString pViewTab,NString pTermCode,NString pEmpPidm,NString pPosn,NString pSuff,NString pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFJOB.P_SET_TAB_DRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VIEW_TAB", pViewTab);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();


		}
		
//		public static void pUpdatejobacctdistr(NString pgEffectiveDate,List<Twbklibs.Varchar2TabtypeRow> dseqno,List<Twbklibs.Varchar2TabtypeRow> dcoas,List<Twbklibs.Varchar2TabtypeRow> dacci,List<Twbklibs.Varchar2TabtypeRow> dfund,List<Twbklibs.Varchar2TabtypeRow> dorgn,List<Twbklibs.Varchar2TabtypeRow> dacct,List<Twbklibs.Varchar2TabtypeRow> dprog,List<Twbklibs.Varchar2TabtypeRow> dactv,List<Twbklibs.Varchar2TabtypeRow> dlocn,List<Twbklibs.Varchar2TabtypeRow> dproj,List<Twbklibs.Varchar2TabtypeRow> dctyp,List<Twbklibs.Varchar2TabtypeRow> dpct,List<Twbklibs.Varchar2TabtypeRow> dacctext,List<Twbklibs.Varchar2TabtypeRow> dremove,List<Twbklibs.Varchar2TabtypeRow> drowid,List<Twbklibs.Varchar2TabtypeRow> dfunddb,List<Twbklibs.Varchar2TabtypeRow> dencenddate,NString btnAction) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFJOB.P_UPDATEJOBACCTDISTR", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PG_EFFECTIVE_DATE", pgEffectiveDate);
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
		
		public static void pUpdatejobdetail(NString pgContType,NString pOldEffDate,NString pgBeginDate,NString pgEffDate,NString pgPersDate,NString pgEndDate,NString pgJcreCode,NString pgJobTitle,NString pgJobFte,NString pgApptPct,NString pgHrsDay,NString pgSgrp,NString pgSalTable,NString pgSalGrade,NString pgSalStep,NString pgHrsPay,NString pgRegRate,NString pgAssignSal,NString pgFactor,NString pgPay,NString pgAnnualSal,NString pgDefdPay,NString pgChangedField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFJOB.P_UPDATEJOBDETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PG_CONT_TYPE", pgContType);
			cmd.addParameter("@P_OLD_EFF_DATE", pOldEffDate);
			cmd.addParameter("@PG_BEGIN_DATE", pgBeginDate);
			cmd.addParameter("@PG_EFF_DATE", pgEffDate);
			cmd.addParameter("@PG_PERS_DATE", pgPersDate);
			cmd.addParameter("@PG_END_DATE", pgEndDate);
			cmd.addParameter("@PG_JCRE_CODE", pgJcreCode);
			cmd.addParameter("@PG_JOB_TITLE", pgJobTitle);
			cmd.addParameter("@PG_JOB_FTE", pgJobFte);
			cmd.addParameter("@PG_APPT_PCT", pgApptPct);
			cmd.addParameter("@PG_HRS_DAY", pgHrsDay);
			cmd.addParameter("@PG_SGRP", pgSgrp);
			cmd.addParameter("@PG_SAL_TABLE", pgSalTable);
			cmd.addParameter("@PG_SAL_GRADE", pgSalGrade);
			cmd.addParameter("@PG_SAL_STEP", pgSalStep);
			cmd.addParameter("@PG_HRS_PAY", pgHrsPay);
			cmd.addParameter("@PG_REG_RATE", pgRegRate);
			cmd.addParameter("@PG_ASSIGN_SAL", pgAssignSal);
			cmd.addParameter("@PG_FACTOR", pgFactor);
			cmd.addParameter("@PG_PAY", pgPay);
			cmd.addParameter("@PG_ANNUAL_SAL", pgAnnualSal);
			cmd.addParameter("@PG_DEFD_PAY", pgDefdPay);
			cmd.addParameter("@PG_CHANGED_FIELD", pgChangedField);
				
			cmd.execute();


		}
		
//		public static void pUpdatejobearnings(NString pOldEffDate,List<Twbklibs.Varchar2TabtypeRow> pEffectiveDate,List<Twbklibs.Varchar2TabtypeRow> pEarnCode,List<Twbklibs.Varchar2TabtypeRow> pHrs,List<Twbklibs.Varchar2TabtypeRow> pDeemedHrs,List<Twbklibs.Varchar2TabtypeRow> pSpecialRate,List<Twbklibs.Varchar2TabtypeRow> pShift,List<Twbklibs.Varchar2TabtypeRow> pCancelDate,List<Twbklibs.Varchar2TabtypeRow> pRowid,List<Twbklibs.Varchar2TabtypeRow> pRemove) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFJOB.P_UPDATEJOBEARNINGS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_OLD_EFF_DATE", pOldEffDate);
//			// cmd.addParameter(DbTypes.getTableType("P_EFFECTIVE_DATE", "", pEffectiveDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_EARN_CODE", "", pEarnCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_HRS", "", pHrs, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_DEEMED_HRS", "", pDeemedHrs, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SPECIAL_RATE", "", pSpecialRate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SHIFT", "", pShift, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CANCEL_DATE", "", pCancelDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ROWID", "", pRowid, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_REMOVE", "", pRemove, object.class));
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
