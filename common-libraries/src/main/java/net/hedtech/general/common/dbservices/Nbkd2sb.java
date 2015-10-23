package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nbkd2sb {
		public static NBool fCheckGotdpar(NString stepName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.F_CHECK_GOTDPAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@STEP_NAME", stepName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NDate fFiscyrBeginDate(NString parmFiscyr,NString parmCoas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.F_FISCYR_BEGIN_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PARM_FISCYR", parmFiscyr);
			cmd.addParameter("@PARM_COAS", parmCoas);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NDate fGetAsofDate(NString stepname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.F_GET_ASOF_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@STEPNAME", stepname);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NNumber fGetBudget(NDate asOfDate,NString positionKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.F_GET_BUDGET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@AS_OF_DATE", asOfDate);
			cmd.addParameter("@POSITION_KEY", positionKey);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetFiscalYear(NDate asOfDate,NString coasCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.F_GET_FISCAL_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AS_OF_DATE", asOfDate);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetFringeMethod(NString parmFiscyr,NString parmCoas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.F_GET_FRINGE_METHOD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PARM_FISCYR", parmFiscyr);
			cmd.addParameter("@PARM_COAS", parmCoas);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPositionStatus(NDate asOfDate,NString positionKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.F_GET_POSITION_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AS_OF_DATE", asOfDate);
			cmd.addParameter("@POSITION_KEY", positionKey);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fLookupCodeDesc(NString whichTable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.F_LOOKUP_CODE_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@WHICH_TABLE", whichTable);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNdesc(NString whichTable,NString code,NNumber howBig) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.F_NDESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@WHICH_TABLE", whichTable);
			cmd.addParameter("@CODE", code);
			cmd.addParameter("@HOW_BIG", howBig);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fPercentBudget(NNumber budgtAmt,NNumber totalBudgtAmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.F_PERCENT_BUDGET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@BUDGT_AMT", budgtAmt);
			cmd.addParameter("@TOTAL_BUDGT_AMT", totalBudgtAmt);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NDate fPosnBeginDate(NString parmPosn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.F_POSN_BEGIN_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PARM_POSN", parmPosn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NBool fPosnExists(NString parmPosn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.F_POSN_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PARM_POSN", parmPosn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
//		public static  fPtotRowid(NString parmPosn,NString parmFiscyr,NString parmCoas,NString parmOrgn,NString parmObud,NString parmObph,NString parmStatus) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.F_PTOT_ROWID", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@PARM_POSN", parmPosn);
//			cmd.addParameter("@PARM_FISCYR", parmFiscyr);
//			cmd.addParameter("@PARM_COAS", parmCoas);
//			cmd.addParameter("@PARM_ORGN", parmOrgn);
//			cmd.addParameter("@PARM_OBUD", parmObud);
//			cmd.addParameter("@PARM_OBPH", parmObph);
//			cmd.addParameter("@PARM_STATUS", parmStatus);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  fPtotRowidWoutOrgn(NString parmPosn,NString parmFiscyr,NString parmCoas,NString parmObud,NString parmObph,NString parmStatus) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.F_PTOT_ROWID_WOUT_ORGN", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@PARM_POSN", parmPosn);
//			cmd.addParameter("@PARM_FISCYR", parmFiscyr);
//			cmd.addParameter("@PARM_COAS", parmCoas);
//			cmd.addParameter("@PARM_OBUD", parmObud);
//			cmd.addParameter("@PARM_OBPH", parmObph);
//			cmd.addParameter("@PARM_STATUS", parmStatus);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NNumber fRecordExists(NString parmPosn,NString parmFiscyr,NString parmObud,NString parmObph,NString parmOtherCode,NString tabname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.F_RECORD_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PARM_POSN", parmPosn);
			cmd.addParameter("@PARM_FISCYR", parmFiscyr);
			cmd.addParameter("@PARM_OBUD", parmObud);
			cmd.addParameter("@PARM_OBPH", parmObph);
			cmd.addParameter("@PARM_OTHER_CODE", parmOtherCode);
			cmd.addParameter("@TABNAME", tabname);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NDate fSetPtotEffDate(NDate posnBeginDate,NString reqFiscyr,NString reqCoas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.F_SET_PTOT_EFF_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@POSN_BEGIN_DATE", posnBeginDate);
			cmd.addParameter("@REQ_FISCYR", reqFiscyr);
			cmd.addParameter("@REQ_COAS", reqCoas);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
//		public static void pAddPlbdBudgets(NInteger rows,List<PtottabtypeRow> ptottab,Ref<NString> parmMsg,Ref<NString> parmMsgType) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_ADD_PLBD_BUDGETS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ROWS", rows);
//			// cmd.addParameter(DbTypes.getTableType("PTOTTAB", "", ptottab, object.class));
//			cmd.addParameter("@PARM_MSG", NString.class);
//			cmd.addParameter("@PARM_MSG_TYPE", NString.class);
//				
//			cmd.execute();
//			parmMsg.val = cmd.getParameterValue("@PARM_MSG", NString.class);
//			parmMsgType.val = cmd.getParameterValue("@PARM_MSG_TYPE", NString.class);
//
//
//		}
		
		public static void pBuildFtotSelect(Ref<NString> parmselstr,Ref<NString> parmheaderstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_BUILD_FTOT_SELECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARMSELSTR", parmselstr, true);
			cmd.addParameter("@PARMHEADERSTR", parmheaderstr, true);
				
			cmd.execute();
			parmselstr.val = cmd.getParameterValue("@PARMSELSTR", NString.class);
			parmheaderstr.val = cmd.getParameterValue("@PARMHEADERSTR", NString.class);


		}
		
		public static void pBuildJobsAllSelect(Ref<NString> parmselstr,Ref<NString> parmheaderstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_BUILD_JOBS_ALL_SELECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARMSELSTR", parmselstr, true);
			cmd.addParameter("@PARMHEADERSTR", parmheaderstr, true);
				
			cmd.execute();
			parmselstr.val = cmd.getParameterValue("@PARMSELSTR", NString.class);
			parmheaderstr.val = cmd.getParameterValue("@PARMHEADERSTR", NString.class);


		}
		
		public static void pBuildJobsSalarySelect(Ref<NString> parmselstr,Ref<NString> parmheaderstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_BUILD_JOBS_SALARY_SELECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARMSELSTR", parmselstr, true);
			cmd.addParameter("@PARMHEADERSTR", parmheaderstr, true);
				
			cmd.execute();
			parmselstr.val = cmd.getParameterValue("@PARMSELSTR", NString.class);
			parmheaderstr.val = cmd.getParameterValue("@PARMHEADERSTR", NString.class);


		}
		
		public static void pBuildPlbdSelect(Ref<NString> parmselstr,Ref<NString> parmheaderstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_BUILD_PLBD_SELECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARMSELSTR", parmselstr, true);
			cmd.addParameter("@PARMHEADERSTR", parmheaderstr, true);
				
			cmd.execute();
			parmselstr.val = cmd.getParameterValue("@PARMSELSTR", NString.class);
			parmheaderstr.val = cmd.getParameterValue("@PARMHEADERSTR", NString.class);


		}
		
		public static void pBuildPtotSelect(Ref<NString> parmselstr,Ref<NString> parmheaderstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_BUILD_PTOT_SELECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARMSELSTR", parmselstr, true);
			cmd.addParameter("@PARMHEADERSTR", parmheaderstr, true);
				
			cmd.execute();
			parmselstr.val = cmd.getParameterValue("@PARMSELSTR", NString.class);
			parmheaderstr.val = cmd.getParameterValue("@PARMHEADERSTR", NString.class);


		}
		
		public static void pBuildRtotSelect(Ref<NString> parmselstr,Ref<NString> parmheaderstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_BUILD_RTOT_SELECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARMSELSTR", parmselstr, true);
			cmd.addParameter("@PARMHEADERSTR", parmheaderstr, true);
				
			cmd.execute();
			parmselstr.val = cmd.getParameterValue("@PARMSELSTR", NString.class);
			parmheaderstr.val = cmd.getParameterValue("@PARMHEADERSTR", NString.class);


		}
		
		public static void pCheckForNull(NString parmValue,Ref<NString> parmMsg,Ref<NString> parmMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_CHECK_FOR_NULL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_VALUE", parmValue);
			cmd.addParameter("@PARM_MSG", parmMsg, true);
			cmd.addParameter("@PARM_MSG_TYPE", parmMsgType, true);
				
			cmd.execute();
			parmMsg.val = cmd.getParameterValue("@PARM_MSG", NString.class);
			parmMsgType.val = cmd.getParameterValue("@PARM_MSG_TYPE", NString.class);


		}
		
		public static void pChkNumericFormat(NString xcelValue,NNumber decimalNum,NNumber maxValue,Ref<NString> parmMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_CHK_NUMERIC_FORMAT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@XCEL_VALUE", xcelValue);
			cmd.addParameter("@DECIMAL_NUM", decimalNum);
			cmd.addParameter("@MAX_VALUE", maxValue);
			cmd.addParameter("@PARM_MSG", parmMsg, true);
				
			cmd.execute();
			parmMsg.val = cmd.getParameterValue("@PARM_MSG", NString.class);


		}
		
//		public static void pDelRecWoFinance(NString tabname,NInteger rows,List<PtottabtypeRow> ptottab,Ref<NString> parmMsgType,Ref<NString> parmMsg) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_DEL_REC_WO_FINANCE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TABNAME", tabname);
//			cmd.addParameter("@ROWS", rows);
//			// cmd.addParameter(DbTypes.getTableType("PTOTTAB", "", ptottab, object.class));
//			cmd.addParameter("@PARM_MSG_TYPE", parmMsgType, true);
//			cmd.addParameter("@PARM_MSG", parmMsg, true);
//				
//			cmd.execute();
//			parmMsgType.val = cmd.getParameterValue("@PARM_MSG_TYPE", NString.class);
//			parmMsg.val = cmd.getParameterValue("@PARM_MSG", NString.class);
//
//
//		}
		
		public static void pDelTempTables() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_DEL_TEMP_TABLES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDeleteTable(NString tabname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_DELETE_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABNAME", tabname);
				
			cmd.execute();


		}
		
		public static void pEditBaseUnits(NString xcelBaseUnits,Ref<NString> parmMsg,Ref<NString> parmMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_EDIT_BASE_UNITS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@XCEL_BASE_UNITS", xcelBaseUnits);
			cmd.addParameter("@PARM_MSG", parmMsg, true);
			cmd.addParameter("@PARM_MSG_TYPE", parmMsgType, true);
				
			cmd.execute();
			parmMsg.val = cmd.getParameterValue("@PARM_MSG", NString.class);
			parmMsgType.val = cmd.getParameterValue("@PARM_MSG_TYPE", NString.class);


		}
		
		public static void pEditBudgApptPct(NString xcelBudgApptPct,Ref<NString> parmMsg,Ref<NString> parmMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_EDIT_BUDG_APPT_PCT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@XCEL_BUDG_APPT_PCT", xcelBudgApptPct);
			cmd.addParameter("@PARM_MSG", parmMsg, true);
			cmd.addParameter("@PARM_MSG_TYPE", parmMsgType, true);
				
			cmd.execute();
			parmMsg.val = cmd.getParameterValue("@PARM_MSG", NString.class);
			parmMsgType.val = cmd.getParameterValue("@PARM_MSG_TYPE", NString.class);


		}
		
		public static void pEditBudgetAmt(NString xcelBudget,Ref<NString> parmMsg,Ref<NString> parmMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_EDIT_BUDGET_AMT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@XCEL_BUDGET", xcelBudget);
			cmd.addParameter("@PARM_MSG", parmMsg, true);
			cmd.addParameter("@PARM_MSG_TYPE", parmMsgType, true);
				
			cmd.execute();
			parmMsg.val = cmd.getParameterValue("@PARM_MSG", NString.class);
			parmMsgType.val = cmd.getParameterValue("@PARM_MSG_TYPE", NString.class);


		}
		
		public static void pEditEcls(NString parmPosn,Ref<NString> parmMsg,Ref<NString> parmMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_EDIT_ECLS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_POSN", parmPosn);
			cmd.addParameter("@PARM_MSG", NString.class);
			cmd.addParameter("@PARM_MSG_TYPE", NString.class);
				
			cmd.execute();
			parmMsg.val = cmd.getParameterValue("@PARM_MSG", NString.class);
			parmMsgType.val = cmd.getParameterValue("@PARM_MSG_TYPE", NString.class);


		}
		
		public static void pEditFiscyrEndDate(NString reqCoas,NString reqFiscyr,NDate posnBeginDate,Ref<NString> parmMsg,Ref<NString> parmMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_EDIT_FISCYR_END_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REQ_COAS", reqCoas);
			cmd.addParameter("@REQ_FISCYR", reqFiscyr);
			cmd.addParameter("@POSN_BEGIN_DATE", posnBeginDate);
			cmd.addParameter("@PARM_MSG", parmMsg, true);
			cmd.addParameter("@PARM_MSG_TYPE", parmMsgType, true);
				
			cmd.execute();
			parmMsg.val = cmd.getParameterValue("@PARM_MSG", NString.class);
			parmMsgType.val = cmd.getParameterValue("@PARM_MSG_TYPE", NString.class);


		}
		
		public static void pEditFte(NString xcelFte,Ref<NString> parmMsg,Ref<NString> parmMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_EDIT_FTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@XCEL_FTE", xcelFte);
			cmd.addParameter("@PARM_MSG", parmMsg, true);
			cmd.addParameter("@PARM_MSG_TYPE", parmMsgType, true);
				
			cmd.execute();
			parmMsg.val = cmd.getParameterValue("@PARM_MSG", NString.class);
			parmMsgType.val = cmd.getParameterValue("@PARM_MSG_TYPE", NString.class);


		}
		
		public static void pEditFteCalc(NString xcelFte,NString xcelBudgBasis,NString xcelAnnBasis,NString xcelBudgApptPct,NString xcelBaseUnits,Ref<NString> parmMsg,Ref<NString> parmMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_EDIT_FTE_CALC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@XCEL_FTE", xcelFte);
			cmd.addParameter("@XCEL_BUDG_BASIS", xcelBudgBasis);
			cmd.addParameter("@XCEL_ANN_BASIS", xcelAnnBasis);
			cmd.addParameter("@XCEL_BUDG_APPT_PCT", xcelBudgApptPct);
			cmd.addParameter("@XCEL_BASE_UNITS", xcelBaseUnits);
			cmd.addParameter("@PARM_MSG", parmMsg, true);
			cmd.addParameter("@PARM_MSG_TYPE", parmMsgType, true);
				
			cmd.execute();
			parmMsg.val = cmd.getParameterValue("@PARM_MSG", NString.class);
			parmMsgType.val = cmd.getParameterValue("@PARM_MSG_TYPE", NString.class);


		}
		
		public static void pEditMaxlen(NString parmValue,NNumber parmMaxlen,Ref<NString> parmMsg,Ref<NString> parmMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_EDIT_MAXLEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_VALUE", parmValue);
			cmd.addParameter("@PARM_MAXLEN", parmMaxlen);
			cmd.addParameter("@PARM_MSG", parmMsg, true);
			cmd.addParameter("@PARM_MSG_TYPE", parmMsgType, true);
				
			cmd.execute();
			parmMsg.val = cmd.getParameterValue("@PARM_MSG", NString.class);
			parmMsgType.val = cmd.getParameterValue("@PARM_MSG_TYPE", NString.class);


		}
		
		public static void pEditPlbdBudgets() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_EDIT_PLBD_BUDGETS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pEditPosn(NString parmPosn,Ref<NString> parmMsg,Ref<NString> parmMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_EDIT_POSN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_POSN", parmPosn);
			cmd.addParameter("@PARM_MSG", NString.class);
			cmd.addParameter("@PARM_MSG_TYPE", NString.class);
				
			cmd.execute();
			parmMsg.val = cmd.getParameterValue("@PARM_MSG", NString.class);
			parmMsgType.val = cmd.getParameterValue("@PARM_MSG_TYPE", NString.class);


		}
		
		public static void pEditPosnBasis(NString xcelPosnBasis,Ref<NString> parmMsg,Ref<NString> parmMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_EDIT_POSN_BASIS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@XCEL_POSN_BASIS", xcelPosnBasis);
			cmd.addParameter("@PARM_MSG", parmMsg, true);
			cmd.addParameter("@PARM_MSG_TYPE", parmMsgType, true);
				
			cmd.execute();
			parmMsg.val = cmd.getParameterValue("@PARM_MSG", NString.class);
			parmMsgType.val = cmd.getParameterValue("@PARM_MSG_TYPE", NString.class);


		}
		
		public static void pEditPosnCoas(NString parmPosn,NString parmCoas,Ref<NString> parmMsg,Ref<NString> parmMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_EDIT_POSN_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_POSN", parmPosn);
			cmd.addParameter("@PARM_COAS", parmCoas);
			cmd.addParameter("@PARM_MSG", NString.class);
			cmd.addParameter("@PARM_MSG_TYPE", NString.class);
				
			cmd.execute();
			parmMsg.val = cmd.getParameterValue("@PARM_MSG", NString.class);
			parmMsgType.val = cmd.getParameterValue("@PARM_MSG_TYPE", NString.class);


		}
		
//		public static void pFindWorkingPtot(NInteger rows,List<PtottabtypeRow> ptottab,Ref<NString> parmMsgType,Ref<NString> parmMsg) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_FIND_WORKING_PTOT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ROWS", rows);
//			// cmd.addParameter(DbTypes.getTableType("PTOTTAB", "", ptottab, object.class));
//			cmd.addParameter("@PARM_MSG_TYPE", parmMsgType, true);
//			cmd.addParameter("@PARM_MSG", parmMsg, true);
//				
//			cmd.execute();
//			parmMsgType.val = cmd.getParameterValue("@PARM_MSG_TYPE", NString.class);
//			parmMsg.val = cmd.getParameterValue("@PARM_MSG", NString.class);
//
//
//		}
		
		public static void pFormatDate(NString requestDate,Ref<NString> formatDate,Ref<NString> parmMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_FORMAT_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REQUEST_DATE", requestDate);
			cmd.addParameter("@FORMAT_DATE", NString.class);
			cmd.addParameter("@PARM_MSG", NString.class);
				
			cmd.execute();
			formatDate.val = cmd.getParameterValue("@FORMAT_DATE", NString.class);
			parmMsg.val = cmd.getParameterValue("@PARM_MSG", NString.class);


		}
		
		public static void pGetPtotData(NString parmPosn,NString parmFiscyr,NString parmCoas,NString parmObud,NString parmObph,Ref<NDate> parmDate,Ref<NString> parmOrgn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_GET_PTOT_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_POSN", parmPosn);
			cmd.addParameter("@PARM_FISCYR", parmFiscyr);
			cmd.addParameter("@PARM_COAS", parmCoas);
			cmd.addParameter("@PARM_OBUD", parmObud);
			cmd.addParameter("@PARM_OBPH", parmObph);
			cmd.addParameter("@PARM_DATE", NDate.class);
			cmd.addParameter("@PARM_ORGN", NString.class);
				
			cmd.execute();
			parmDate.val = cmd.getParameterValue("@PARM_DATE", NDate.class);
			parmOrgn.val = cmd.getParameterValue("@PARM_ORGN", NString.class);


		}
		
		public static void pInitMessage(Ref<NString> parmMsg,Ref<NString> parmMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_INIT_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_MSG", NString.class);
			cmd.addParameter("@PARM_MSG_TYPE", NString.class);
				
			cmd.execute();
			parmMsg.val = cmd.getParameterValue("@PARM_MSG", NString.class);
			parmMsgType.val = cmd.getParameterValue("@PARM_MSG_TYPE", NString.class);


		}
		
		public static void pInsertBudgetData() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_INSERT_BUDGET_DATA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pLookupBdca(Ref<NString> parmSqlstr,Ref<NString> columnHeaders,Ref<NString> boundColumn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_LOOKUP_BDCA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
			cmd.addParameter("@COLUMN_HEADERS", NString.class);
			cmd.addParameter("@BOUND_COLUMN", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);
			columnHeaders.val = cmd.getParameterValue("@COLUMN_HEADERS", NString.class);
			boundColumn.val = cmd.getParameterValue("@BOUND_COLUMN", NString.class);


		}
		
		public static void pLookupEarn(Ref<NString> parmSqlstr,Ref<NString> columnHeaders,Ref<NString> boundColumn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_LOOKUP_EARN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
			cmd.addParameter("@COLUMN_HEADERS", NString.class);
			cmd.addParameter("@BOUND_COLUMN", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);
			columnHeaders.val = cmd.getParameterValue("@COLUMN_HEADERS", NString.class);
			boundColumn.val = cmd.getParameterValue("@BOUND_COLUMN", NString.class);


		}
		
		public static void pLookupEcls(Ref<NString> parmSqlstr,Ref<NString> columnHeaders,Ref<NString> boundColumn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_LOOKUP_ECLS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
			cmd.addParameter("@COLUMN_HEADERS", NString.class);
			cmd.addParameter("@BOUND_COLUMN", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);
			columnHeaders.val = cmd.getParameterValue("@COLUMN_HEADERS", NString.class);
			boundColumn.val = cmd.getParameterValue("@BOUND_COLUMN", NString.class);


		}
		
		public static void pLookupFiscyr(Ref<NString> parmSqlstr,Ref<NString> columnHeaders,Ref<NString> boundColumn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_LOOKUP_FISCYR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
			cmd.addParameter("@COLUMN_HEADERS", NString.class);
			cmd.addParameter("@BOUND_COLUMN", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);
			columnHeaders.val = cmd.getParameterValue("@COLUMN_HEADERS", NString.class);
			boundColumn.val = cmd.getParameterValue("@BOUND_COLUMN", NString.class);


		}
		
		public static void pLookupObph(Ref<NString> parmSqlstr,Ref<NString> columnHeaders,Ref<NString> boundColumn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_LOOKUP_OBPH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
			cmd.addParameter("@COLUMN_HEADERS", NString.class);
			cmd.addParameter("@BOUND_COLUMN", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);
			columnHeaders.val = cmd.getParameterValue("@COLUMN_HEADERS", NString.class);
			boundColumn.val = cmd.getParameterValue("@BOUND_COLUMN", NString.class);


		}
		
		public static void pLookupObud(Ref<NString> parmSqlstr,Ref<NString> columnHeaders,Ref<NString> boundColumn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_LOOKUP_OBUD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
			cmd.addParameter("@COLUMN_HEADERS", NString.class);
			cmd.addParameter("@BOUND_COLUMN", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);
			columnHeaders.val = cmd.getParameterValue("@COLUMN_HEADERS", NString.class);
			boundColumn.val = cmd.getParameterValue("@BOUND_COLUMN", NString.class);


		}
		
		public static void pLookupOrgn(Ref<NString> parmSqlstr,Ref<NString> columnHeaders,Ref<NString> boundColumn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_LOOKUP_ORGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
			cmd.addParameter("@COLUMN_HEADERS", NString.class);
			cmd.addParameter("@BOUND_COLUMN", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);
			columnHeaders.val = cmd.getParameterValue("@COLUMN_HEADERS", NString.class);
			boundColumn.val = cmd.getParameterValue("@BOUND_COLUMN", NString.class);


		}
		
		public static void pLookupPosn(Ref<NString> parmSqlstr,Ref<NString> columnHeaders,Ref<NString> boundColumn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_LOOKUP_POSN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_SQLSTR", NString.class);
			cmd.addParameter("@COLUMN_HEADERS", NString.class);
			cmd.addParameter("@BOUND_COLUMN", NString.class);
				
			cmd.execute();
			parmSqlstr.val = cmd.getParameterValue("@PARM_SQLSTR", NString.class);
			columnHeaders.val = cmd.getParameterValue("@COLUMN_HEADERS", NString.class);
			boundColumn.val = cmd.getParameterValue("@BOUND_COLUMN", NString.class);


		}
		
		public static void pSetPtotNotfoundMsg(Ref<NString> parmMsg,Ref<NString> parmMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_SET_PTOT_NOTFOUND_MSG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_MSG", NString.class);
			cmd.addParameter("@PARM_MSG_TYPE", NString.class);
				
			cmd.execute();
			parmMsg.val = cmd.getParameterValue("@PARM_MSG", NString.class);
			parmMsgType.val = cmd.getParameterValue("@PARM_MSG_TYPE", NString.class);


		}
		
		public static void pUploadFtot() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_UPLOAD_FTOT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUploadPlbd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_UPLOAD_PLBD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUploadPtot() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_UPLOAD_PTOT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUploadRtot() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_UPLOAD_RTOT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pValidateFtot(NString workbook,NString worksheet,NNumber rowNumb,NString reqFiscyr,NString reqCoas,NString reqObud,NString reqObph,NString xcelPosn,NString xcelBudget,NString xcelBdca) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_VALIDATE_FTOT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WORKBOOK", workbook);
			cmd.addParameter("@WORKSHEET", worksheet);
			cmd.addParameter("@ROW_NUMB", rowNumb);
			cmd.addParameter("@REQ_FISCYR", reqFiscyr);
			cmd.addParameter("@REQ_COAS", reqCoas);
			cmd.addParameter("@REQ_OBUD", reqObud);
			cmd.addParameter("@REQ_OBPH", reqObph);
			cmd.addParameter("@XCEL_POSN", xcelPosn);
			cmd.addParameter("@XCEL_BUDGET", xcelBudget);
			cmd.addParameter("@XCEL_BDCA", xcelBdca);
				
			cmd.execute();


		}
		
		public static void pValidatePlbd(NString workbook,NString worksheet,NNumber rowNumb,NString reqFiscyr,NString reqCoas,NString reqObud,NString reqObph,NString xcelPosn,NString xcelBudget,NString xcelFund,NString xcelOrgn,NString xcelAcct,NString xcelProg,NString xcelActv,NString xcelLocn,NString xcelAcctExt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_VALIDATE_PLBD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WORKBOOK", workbook);
			cmd.addParameter("@WORKSHEET", worksheet);
			cmd.addParameter("@ROW_NUMB", rowNumb);
			cmd.addParameter("@REQ_FISCYR", reqFiscyr);
			cmd.addParameter("@REQ_COAS", reqCoas);
			cmd.addParameter("@REQ_OBUD", reqObud);
			cmd.addParameter("@REQ_OBPH", reqObph);
			cmd.addParameter("@XCEL_POSN", xcelPosn);
			cmd.addParameter("@XCEL_BUDGET", xcelBudget);
			cmd.addParameter("@XCEL_FUND", xcelFund);
			cmd.addParameter("@XCEL_ORGN", xcelOrgn);
			cmd.addParameter("@XCEL_ACCT", xcelAcct);
			cmd.addParameter("@XCEL_PROG", xcelProg);
			cmd.addParameter("@XCEL_ACTV", xcelActv);
			cmd.addParameter("@XCEL_LOCN", xcelLocn);
			cmd.addParameter("@XCEL_ACCT_EXT", xcelAcctExt);
				
			cmd.execute();


		}
		
		public static void pValidatePtot(NString workbook,NString worksheet,NNumber rowNumb,NString reqFiscyr,NString reqCoas,NString reqObud,NString reqObph,NString xcelPosn,NString xcelBudget,NString xcelOrgn,NString xcelFte,NString xcelBudgBasis,NString xcelAnnBasis,NString xcelBudgApptPct,NString xcelBaseUnits,NString xcelCreateJfte) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_VALIDATE_PTOT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WORKBOOK", workbook);
			cmd.addParameter("@WORKSHEET", worksheet);
			cmd.addParameter("@ROW_NUMB", rowNumb);
			cmd.addParameter("@REQ_FISCYR", reqFiscyr);
			cmd.addParameter("@REQ_COAS", reqCoas);
			cmd.addParameter("@REQ_OBUD", reqObud);
			cmd.addParameter("@REQ_OBPH", reqObph);
			cmd.addParameter("@XCEL_POSN", xcelPosn);
			cmd.addParameter("@XCEL_BUDGET", xcelBudget);
			cmd.addParameter("@XCEL_ORGN", xcelOrgn);
			cmd.addParameter("@XCEL_FTE", xcelFte);
			cmd.addParameter("@XCEL_BUDG_BASIS", xcelBudgBasis);
			cmd.addParameter("@XCEL_ANN_BASIS", xcelAnnBasis);
			cmd.addParameter("@XCEL_BUDG_APPT_PCT", xcelBudgApptPct);
			cmd.addParameter("@XCEL_BASE_UNITS", xcelBaseUnits);
			cmd.addParameter("@XCEL_CREATE_JFTE", xcelCreateJfte);
				
			cmd.execute();


		}
		
		public static void pValidateRtot(NString workbook,NString worksheet,NNumber rowNumb,NString reqFiscyr,NString reqCoas,NString reqObud,NString reqObph,NString xcelPosn,NString xcelBudget,NString xcelEarn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKD2SB.P_VALIDATE_RTOT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WORKBOOK", workbook);
			cmd.addParameter("@WORKSHEET", worksheet);
			cmd.addParameter("@ROW_NUMB", rowNumb);
			cmd.addParameter("@REQ_FISCYR", reqFiscyr);
			cmd.addParameter("@REQ_COAS", reqCoas);
			cmd.addParameter("@REQ_OBUD", reqObud);
			cmd.addParameter("@REQ_OBPH", reqObph);
			cmd.addParameter("@XCEL_POSN", xcelPosn);
			cmd.addParameter("@XCEL_BUDGET", xcelBudget);
			cmd.addParameter("@XCEL_EARN", xcelEarn);
				
			cmd.execute();


		}
		
	
	
	
}
