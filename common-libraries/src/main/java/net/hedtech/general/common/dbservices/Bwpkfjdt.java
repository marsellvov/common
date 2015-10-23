package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkfjdt {
		public static void pDispJobDetlBody(NNumber pGlobalPidm,NString pUserId,NString pViewTab,NString pTermCode,NNumber pEmpPidm,NString pPosn,NString pSuff,NDate pOldEffDate,NString pNewEffDate,NString pContType,NString pBeginDate,NString pPersDate,NString pEndDate,NString pJcreCode,NString pJobTitle,NString pJobFte,NString pApptPct,NString pHrsDay,NString pSgrp,NString pSalTable,NString pSalGrade,NString pSalStep,NString pHrsPay,NString pRegRate,NString pAssignSal,NString pFactor,NString pPay,NString pAnnualSal,NString pDefdPay,NString pChangedField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFJDT.P_DISP_JOB_DETL_BODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GLOBAL_PIDM", pGlobalPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
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
		
//		public static void pDispJobEarningsBody(NNumber pGlobalPidm,NString pUserId,NString pViewTab,NString pTermCode,NNumber pEmpPidm,NString pPosn,NString pSuff,NDate pOldEffDate,List<Twbklibs.Varchar2TabtypeRow> pEffectiveDate,List<Twbklibs.Varchar2TabtypeRow> pEarnCode,List<Twbklibs.Varchar2TabtypeRow> pHrs,List<Twbklibs.Varchar2TabtypeRow> pDeemedHrs,List<Twbklibs.Varchar2TabtypeRow> pSpecialRate,List<Twbklibs.Varchar2TabtypeRow> pShift,List<Twbklibs.Varchar2TabtypeRow> pCancelDate,List<Twbklibs.Varchar2TabtypeRow> pRowid,List<Twbklibs.Varchar2TabtypeRow> pRemove) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFJDT.P_DISP_JOB_EARNINGS_BODY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_GLOBAL_PIDM", pGlobalPidm);
//			cmd.addParameter("@P_USER_ID", pUserId);
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
		
		public static void pUpdateJobdetail(NNumber pGlobalPidm,NString pTermCode,NString pEmpPidm,NString pPosn,NString pSuff,NString pOldEffDate,NString pgContType,NString pgBeginDate,NString pgEffDate,NString pgPersDate,NString pgEndDate,NString pgJcreCode,NString pgJobTitle,NString pgJobFte,NString pgApptPct,NString pgHrsDay,NString pgSgrp,NString pgSalTable,NString pgSalGrade,NString pgSalStep,NString pgHrsPay,NString pgRegRate,NString pgAssignSal,NString pgFactor,NString pgPay,NString pgAnnualSal,NString pgDefdPay,NString pgChangedField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFJDT.P_UPDATE_JOBDETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GLOBAL_PIDM", pGlobalPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_OLD_EFF_DATE", pOldEffDate);
			cmd.addParameter("@PG_CONT_TYPE", pgContType);
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
		
//		public static void pUpdateJobearnings(NNumber pGlobalPidm,NString pTermCode,NNumber pEmpPidm,NString pPosn,NString pSuff,NDate pOldEffDate,List<Twbklibs.Varchar2TabtypeRow> pEffectiveDate,List<Twbklibs.Varchar2TabtypeRow> pEarnCode,List<Twbklibs.Varchar2TabtypeRow> pHrs,List<Twbklibs.Varchar2TabtypeRow> pDeemedHrs,List<Twbklibs.Varchar2TabtypeRow> pSpecialRate,List<Twbklibs.Varchar2TabtypeRow> pShift,List<Twbklibs.Varchar2TabtypeRow> pCancelDate,List<Twbklibs.Varchar2TabtypeRow> pRowid,List<Twbklibs.Varchar2TabtypeRow> pRemove) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKFJDT.P_UPDATE_JOBEARNINGS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_GLOBAL_PIDM", pGlobalPidm);
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
//		
//	
	
	
}
