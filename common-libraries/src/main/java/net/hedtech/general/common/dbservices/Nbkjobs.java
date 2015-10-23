package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nbkjobs {
		public static NBool fCheckJobCommentsExist(NNumber parPidm,NString parPosn,NString parSuff,NDate parEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.F_CHECK_JOB_COMMENTS_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_POSN", parPosn);
			cmd.addParameter("@PAR_SUFF", parSuff);
			cmd.addParameter("@PAR_EFFECTIVE_DATE", parEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckJobPosnExists(NString pPosn,NString pCoasCode,NString pFiscCode,NString pPtotStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.F_CHECK_JOB_POSN_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FISC_CODE", pFiscCode);
			cmd.addParameter("@P_PTOT_STATUS", pPtotStatus);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckJobPosnExists(NString pPosn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.F_CHECK_JOB_POSN_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_POSN", pPosn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fCheckLcatExist(NNumber parPidm,NString parPosn,NString parSuff,NString parLcatCode,NDate parEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.F_CHECK_LCAT_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_POSN", parPosn);
			cmd.addParameter("@PAR_SUFF", parSuff);
			cmd.addParameter("@PAR_LCAT_CODE", parLcatCode);
			cmd.addParameter("@PAR_EFFECTIVE_DATE", parEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fFiscCode(NDate pDate,NString pCoasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.F_FISC_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DATE", pDate);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPreviousJobStatus(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.F_GET_PREVIOUS_JOB_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		

		
		public static DataCursor fNbrjobsByDateRc(NNumber pPidm,NString pPosn,NString pSuff,NDate pQueryDate,NString pInclTermInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.F_NBRJOBS_BY_DATE_RC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_QUERY_DATE", pQueryDate);
			cmd.addParameter("@P_INCL_TERM_IND", pInclTermInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fPayPeriodDefinedInd(NString pPictCode,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.F_PAY_PERIOD_DEFINED_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCalcSalEncumbrance(NNumber pidm,NString posn,NString suff,NDate encBdate,NDate encEdate,NNumber bjobSalEnc,NString payrollSysInd,NString financeSysInd,NString source,Ref<NNumber> salEncum,Ref<NString> errInd,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_CALC_SAL_ENCUMBRANCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@POSN", posn);
			cmd.addParameter("@SUFF", suff);
			cmd.addParameter("@ENC_BDATE", encBdate);
			cmd.addParameter("@ENC_EDATE", encEdate);
			cmd.addParameter("@BJOB_SAL_ENC", bjobSalEnc);
			cmd.addParameter("@PAYROLL_SYS_IND", payrollSysInd);
			cmd.addParameter("@FINANCE_SYS_IND", financeSysInd);
			cmd.addParameter("@SOURCE", source);
			cmd.addParameter("@SAL_ENCUM", salEncum, true);
			cmd.addParameter("@ERR_IND", errInd, true);
			cmd.addParameter("@ERR_MSG", errMsg, true);
				
			cmd.execute();
			salEncum.val = cmd.getParameterValue("@SAL_ENCUM", NNumber.class);
			errInd.val = cmd.getParameterValue("@ERR_IND", NString.class);
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);


		}
		
		public static void pCanChangeLcatCode(NNumber parPidm,NString parPosn,NString parSuff,NString parLcatCode,NDate parEffectiveDate,Ref<NString> parMsgType,Ref<NString> parMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_CAN_CHANGE_LCAT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_POSN", parPosn);
			cmd.addParameter("@PAR_SUFF", parSuff);
			cmd.addParameter("@PAR_LCAT_CODE", parLcatCode);
			cmd.addParameter("@PAR_EFFECTIVE_DATE", parEffectiveDate);
			cmd.addParameter("@PAR_MSG_TYPE", parMsgType, true);
			cmd.addParameter("@PAR_MSG", parMsg, true);
				
			cmd.execute();
			parMsgType.val = cmd.getParameterValue("@PAR_MSG_TYPE", NString.class);
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);


		}
		
		public static void pCheckEclsFringe(NString pFiscCode,NString pCoasCode,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_CHECK_ECLS_FRINGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FISC_CODE", pFiscCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
		public static void pCheckNonZeroBalanceExist(NNumber parPidm,NString parPosn,NString parSuff,Ref<NString> parMsg,Ref<NString> parMsgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_CHECK_NON_ZERO_BALANCE_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_POSN", parPosn);
			cmd.addParameter("@PAR_SUFF", parSuff);
			cmd.addParameter("@PAR_MSG", parMsg, true);
			cmd.addParameter("@PAR_MSG_TYPE", parMsgType, true);
				
			cmd.execute();
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);
			parMsgType.val = cmd.getParameterValue("@PAR_MSG_TYPE", NString.class);


		}
		
		public static void pCheckPartialPay(NString pStatus,NString pEclsCode,NString pEclsEncInd,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_CHECK_PARTIAL_PAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_ECLS_ENC_IND", pEclsEncInd);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pCheckPlbd(NString pPosn,NString pFiscCode,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_CHECK_PLBD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_FISC_CODE", pFiscCode);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pCheckTimeSheets(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pCoasCodeTs,NString pOrgnCodeTs,NString pPictCode,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_CHECK_TIME_SHEETS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_COAS_CODE_TS", pCoasCodeTs);
			cmd.addParameter("@P_ORGN_CODE_TS", pOrgnCodeTs);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
		public static void pCreateJobHistory(NString pJobBaseRowid,NString pJobDetailRowid,NString pUserId,NString pDataOrigin,NString pComment,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_CREATE_JOB_HISTORY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_BASE_ROWID", pJobBaseRowid);
			cmd.addParameter("@P_JOB_DETAIL_ROWID", pJobDetailRowid);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pDelHistoryForJob(NNumber parPidm,NString parPosn,NString parSuff,NString tableName,NDate parEffDate,Ref<NString> parMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_DEL_HISTORY_FOR_JOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_POSN", parPosn);
			cmd.addParameter("@PAR_SUFF", parSuff);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@PAR_EFF_DATE", parEffDate);
			cmd.addParameter("@PAR_MSG", parMsg, true);
				
			cmd.execute();
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);


		}
		
		public static void pEditJobNetChangeSalEnc(NString pPosn,NString pSuff,NString pCoasCode,NNumber pSalaryEncumbrance,Ref<NString> pErrorMsgOut,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_EDIT_JOB_NET_CHANGE_SAL_ENC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_SALARY_ENCUMBRANCE", pSalaryEncumbrance);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
		public static void pEditSupervisorId1(Ref<NString> parSupId,Ref<NString> parSupName,Ref<NNumber> parNbrjobsSupervisorPidm,Ref<NString> msg,Ref<NString> msgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_EDIT_SUPERVISOR_ID1", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_SUP_ID", parSupId, true);
			cmd.addParameter("@PAR_SUP_NAME", NString.class);
			cmd.addParameter("@PAR_NBRJOBS_SUPERVISOR_PIDM", NNumber.class);
			cmd.addParameter("@MSG", NString.class);
			cmd.addParameter("@MSG_TYPE", NString.class);
				
			cmd.execute();
			parSupId.val = cmd.getParameterValue("@PAR_SUP_ID", NString.class);
			parSupName.val = cmd.getParameterValue("@PAR_SUP_NAME", NString.class);
			parNbrjobsSupervisorPidm.val = cmd.getParameterValue("@PAR_NBRJOBS_SUPERVISOR_PIDM", NNumber.class);
			msg.val = cmd.getParameterValue("@MSG", NString.class);
			msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);


		}
		
		public static void pEditSupervisorId2(NNumber parNbrjobsSupervisorPidm,NDate parNbrjobsEffectiveDate,NString parHrsysInd,Ref<NString> parNbrjobsSupervisorPosn,Ref<NString> parNbrjobsSupervisorSuff,Ref<NString> parSupTitle,Ref<NString> msg,Ref<NString> msgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_EDIT_SUPERVISOR_ID2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_NBRJOBS_SUPERVISOR_PIDM", parNbrjobsSupervisorPidm);
			cmd.addParameter("@PAR_NBRJOBS_EFFECTIVE_DATE", parNbrjobsEffectiveDate);
			cmd.addParameter("@PAR_HRSYS_IND", parHrsysInd);
			cmd.addParameter("@PAR_NBRJOBS_SUPERVISOR_POSN", NString.class);
			cmd.addParameter("@PAR_NBRJOBS_SUPERVISOR_SUFF", parNbrjobsSupervisorSuff, true);
			cmd.addParameter("@PAR_SUP_TITLE", NString.class);
			cmd.addParameter("@MSG", NString.class);
			cmd.addParameter("@MSG_TYPE", NString.class);
				
			cmd.execute();
			parNbrjobsSupervisorPosn.val = cmd.getParameterValue("@PAR_NBRJOBS_SUPERVISOR_POSN", NString.class);
			parNbrjobsSupervisorSuff.val = cmd.getParameterValue("@PAR_NBRJOBS_SUPERVISOR_SUFF", NString.class);
			parSupTitle.val = cmd.getParameterValue("@PAR_SUP_TITLE", NString.class);
			msg.val = cmd.getParameterValue("@MSG", NString.class);
			msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);


		}
		
		public static void pEligibleLeaveCodesJob(NString parMode,NNumber parPidm,NString parPosn,NString parSuff,NString parLcatCode,NDate parEmpAdjServiceDate,NDate parEmpCurrentHireDate,NDate parEmpFirstHireDate,NDate parEmpSeniorityDate,NString parUser,Ref<NString> parMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_ELIGIBLE_LEAVE_CODES_JOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_MODE", parMode);
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_POSN", parPosn);
			cmd.addParameter("@PAR_SUFF", parSuff);
			cmd.addParameter("@PAR_LCAT_CODE", parLcatCode);
			cmd.addParameter("@PAR_EMP_ADJ_SERVICE_DATE", parEmpAdjServiceDate);
			cmd.addParameter("@PAR_EMP_CURRENT_HIRE_DATE", parEmpCurrentHireDate);
			cmd.addParameter("@PAR_EMP_FIRST_HIRE_DATE", parEmpFirstHireDate);
			cmd.addParameter("@PAR_EMP_SENIORITY_DATE", parEmpSeniorityDate);
			cmd.addParameter("@PAR_USER", parUser);
			cmd.addParameter("@PAR_MSG", parMsg, true);
				
			cmd.execute();
			parMsg.val = cmd.getParameterValue("@PAR_MSG", NString.class);


		}
		
		public static void pGetBaseEarnCode(NString pEclsCode,Ref<NString> pBaseEarnCodeOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_GET_BASE_EARN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_BASE_EARN_CODE_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pBaseEarnCodeOut.val = cmd.getParameterValue("@P_BASE_EARN_CODE_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pGetCurrentFisc(NString pPosn,NString pCoasCode,Ref<NString> pFiscCodeOut,Ref<NDate> pFiscBeginDateOut,Ref<NDate> pFiscEndDateOut,Ref<NString> pPtotStatusOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_GET_CURRENT_FISC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FISC_CODE_OUT", NString.class);
			cmd.addParameter("@P_FISC_BEGIN_DATE_OUT", NDate.class);
			cmd.addParameter("@P_FISC_END_DATE_OUT", NDate.class);
			cmd.addParameter("@P_PTOT_STATUS_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pFiscCodeOut.val = cmd.getParameterValue("@P_FISC_CODE_OUT", NString.class);
			pFiscBeginDateOut.val = cmd.getParameterValue("@P_FISC_BEGIN_DATE_OUT", NDate.class);
			pFiscEndDateOut.val = cmd.getParameterValue("@P_FISC_END_DATE_OUT", NDate.class);
			pPtotStatusOut.val = cmd.getParameterValue("@P_PTOT_STATUS_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pGetPosnBudgetInfo(NString pPosn,NString pCoasCode,Ref<NString> pFiscCodeOut,Ref<NDate> pFiscBeginDateOut,Ref<NDate> pFiscEndDateOut,Ref<NString> pPtotCoasCodeOut,Ref<NString> pPtotOrgnCodeOut,Ref<NString> pPtotStatusOut,Ref<NNumber> pPtotFteOut,Ref<NNumber> pPtotBudgetOut,Ref<NNumber> pPtotAvailOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_GET_POSN_BUDGET_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FISC_CODE_OUT", NString.class);
			cmd.addParameter("@P_FISC_BEGIN_DATE_OUT", NDate.class);
			cmd.addParameter("@P_FISC_END_DATE_OUT", NDate.class);
			cmd.addParameter("@P_PTOT_COAS_CODE_OUT", NString.class);
			cmd.addParameter("@P_PTOT_ORGN_CODE_OUT", NString.class);
			cmd.addParameter("@P_PTOT_STATUS_OUT", NString.class);
			cmd.addParameter("@P_PTOT_FTE_OUT", NNumber.class);
			cmd.addParameter("@P_PTOT_BUDGET_OUT", NNumber.class);
			cmd.addParameter("@P_PTOT_AVAIL_OUT", NNumber.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pFiscCodeOut.val = cmd.getParameterValue("@P_FISC_CODE_OUT", NString.class);
			pFiscBeginDateOut.val = cmd.getParameterValue("@P_FISC_BEGIN_DATE_OUT", NDate.class);
			pFiscEndDateOut.val = cmd.getParameterValue("@P_FISC_END_DATE_OUT", NDate.class);
			pPtotCoasCodeOut.val = cmd.getParameterValue("@P_PTOT_COAS_CODE_OUT", NString.class);
			pPtotOrgnCodeOut.val = cmd.getParameterValue("@P_PTOT_ORGN_CODE_OUT", NString.class);
			pPtotStatusOut.val = cmd.getParameterValue("@P_PTOT_STATUS_OUT", NString.class);
			pPtotFteOut.val = cmd.getParameterValue("@P_PTOT_FTE_OUT", NNumber.class);
			pPtotBudgetOut.val = cmd.getParameterValue("@P_PTOT_BUDGET_OUT", NNumber.class);
			pPtotAvailOut.val = cmd.getParameterValue("@P_PTOT_AVAIL_OUT", NNumber.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pProcessJobLeave(NString pMode,NNumber pPidm,NString pPosn,NString pSuff,NString pLcatCode,NString pUserId,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_PROCESS_JOB_LEAVE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MODE", pMode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateApptPct(NNumber pApptPct,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_APPT_PCT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPT_PCT", pApptPct);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateAssnCode(NString pAssnCode,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_ASSN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ASSN_CODE", pAssnCode);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateDfprCode(NString pDfprCode,Ref<NString> pPictCodeOut,Ref<NNumber> pFactorOut,Ref<NNumber> pPaysOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_DFPR_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DFPR_CODE", pDfprCode);
			cmd.addParameter("@P_PICT_CODE_OUT", NString.class);
			cmd.addParameter("@P_FACTOR_OUT", NNumber.class);
			cmd.addParameter("@P_PAYS_OUT", NNumber.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pPictCodeOut.val = cmd.getParameterValue("@P_PICT_CODE_OUT", NString.class);
			pFactorOut.val = cmd.getParameterValue("@P_FACTOR_OUT", NNumber.class);
			pPaysOut.val = cmd.getParameterValue("@P_PAYS_OUT", NNumber.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateEffDateVsBjob(NDate pEffectiveDate,NDate pJobBeginDate,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_EFF_DATE_VS_BJOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_JOB_BEGIN_DATE", pJobBeginDate);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateEffDateVsFisc(NDate pEffectiveDate,NString pCoasCode,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_EFF_DATE_VS_FISC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateEffDateVsLpd(NDate pEffectiveDate,NDate pLastPaidDate,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_EFF_DATE_VS_LPD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_LAST_PAID_DATE", pLastPaidDate);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateEffDateVsMax(NDate pEffectiveDate,NDate pMaxEffDate,NDate pNextEffDate,Ref<NString> pWarningMsgOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_EFF_DATE_VS_MAX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_MAX_EFF_DATE", pMaxEffDate);
			cmd.addParameter("@P_NEXT_EFF_DATE", pNextEffDate);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateEffDateVsPosn(NDate pEffectiveDate,NDate pPosnBeginDate,NDate pPosnEndDate,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_EFF_DATE_VS_POSN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_POSN_BEGIN_DATE", pPosnBeginDate);
			cmd.addParameter("@P_POSN_END_DATE", pPosnEndDate);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateEffDateVsTerm(NDate pEffectiveDate,NDate pEmplTermDate,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_EFF_DATE_VS_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_EMPL_TERM_DATE", pEmplTermDate);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateEmprCode(NString pEmprCode,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_EMPR_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateEncumbranceHrs(NNumber pPidm,NString pPosn,NString pSuff,NNumber pTotalEncumbranceHrs,NNumber pTotalContractHrs,NDate pFiscBeginDate,NDate pFiscEndDate,Ref<NString> pWarningMsgOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_ENCUMBRANCE_HRS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_TOTAL_ENCUMBRANCE_HRS", pTotalEncumbranceHrs);
			cmd.addParameter("@P_TOTAL_CONTRACT_HRS", pTotalContractHrs);
			cmd.addParameter("@P_FISC_BEGIN_DATE", pFiscBeginDate);
			cmd.addParameter("@P_FISC_END_DATE", pFiscEndDate);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateEsklForEeog(NString pEsklCode,NString pEeogCode,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_ESKL_FOR_EEOG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ESKL_CODE", pEsklCode);
			cmd.addParameter("@P_EEOG_CODE", pEeogCode);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateFactor(NNumber pFactor,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_FACTOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FACTOR", pFactor);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateFte(NNumber pFte,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_FTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FTE", pFte);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
		public static void pValidateFteExceedsEmpl(NNumber pFte,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_FTE_EXCEEDS_EMPL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FTE", pFte);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
		public static void pValidateFteExceedsPtot(NNumber pJobsFte,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NNumber pPtotFte,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_FTE_EXCEEDS_PTOT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOBS_FTE", pJobsFte);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_PTOT_FTE", pPtotFte);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
		public static void pValidateHrsDay(NNumber pHrsDay,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_HRS_DAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_HRS_DAY", pHrsDay);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateHrsPay(NNumber pHrsPay,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_HRS_PAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_HRS_PAY", pHrsPay);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateJblnCode(NString pJblnCode,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_JBLN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JBLN_CODE", pJblnCode);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateJcreCode(NString pJcreCode,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_JCRE_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JCRE_CODE", pJcreCode);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateLcatChange(NString pLcatCode,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_LCAT_CHANGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateLcatCode(NString pLcatCode,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_LCAT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateLcatForEcls(NString pLcatCode,NString pEclsCode,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_LCAT_FOR_ECLS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateLgcdCode(NString pLgcdCode,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_LGCD_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LGCD_CODE", pLgcdCode);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateLocnCode(NString pLocnCode,Ref<NString> pEmprCodeOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_LOCN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_EMPR_CODE_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pEmprCodeOut.val = cmd.getParameterValue("@P_EMPR_CODE_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidatePayPlan(NString pSgrpCode,NString pSalTable,NString pSalGrade,NNumber pSalStep,Ref<NString> pNtrsalbIndOut,Ref<NNumber> pNtrsalbLowOut,Ref<NNumber> pNtrsalbHighOut,Ref<NNumber> pNtrsalaAmountOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_PAY_PLAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SGRP_CODE", pSgrpCode);
			cmd.addParameter("@P_SAL_TABLE", pSalTable);
			cmd.addParameter("@P_SAL_GRADE", pSalGrade);
			cmd.addParameter("@P_SAL_STEP", pSalStep);
			cmd.addParameter("@P_NTRSALB_IND_OUT", NString.class);
			cmd.addParameter("@P_NTRSALB_LOW_OUT", NNumber.class);
			cmd.addParameter("@P_NTRSALB_HIGH_OUT", NNumber.class);
			cmd.addParameter("@P_NTRSALA_AMOUNT_OUT", NNumber.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pNtrsalbIndOut.val = cmd.getParameterValue("@P_NTRSALB_IND_OUT", NString.class);
			pNtrsalbLowOut.val = cmd.getParameterValue("@P_NTRSALB_LOW_OUT", NNumber.class);
			pNtrsalbHighOut.val = cmd.getParameterValue("@P_NTRSALB_HIGH_OUT", NNumber.class);
			pNtrsalaAmountOut.val = cmd.getParameterValue("@P_NTRSALA_AMOUNT_OUT", NNumber.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidatePays(NNumber pPays,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_PAYS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PAYS", pPays);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidatePcatCode(NString pPcatCode,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_PCAT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PCAT_CODE", pPcatCode);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidatePcatEarnCodes(NString pPcatCode,NString pEclsCode,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_PCAT_EARN_CODES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PCAT_CODE", pPcatCode);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateSchlCode(NString pSchlCode,Ref<NString> pEmprCodeOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_SCHL_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SCHL_CODE", pSchlCode);
			cmd.addParameter("@P_EMPR_CODE_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pEmprCodeOut.val = cmd.getParameterValue("@P_EMPR_CODE_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateSupervisorJob(NNumber pSupervisorPidm,NString pSupervisorPosn,NString pSupervisorSuff,NDate pEffDate,NString pStatus,Ref<NString> pTitleOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_SUPERVISOR_JOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUPERVISOR_PIDM", pSupervisorPidm);
			cmd.addParameter("@P_SUPERVISOR_POSN", pSupervisorPosn);
			cmd.addParameter("@P_SUPERVISOR_SUFF", pSupervisorSuff);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_TITLE_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pTitleOut.val = cmd.getParameterValue("@P_TITLE_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateSupervisorPidm(NNumber pSupervisorPidm,NDate pEffectiveDate,Ref<NString> pPrimaryPosnOut,Ref<NString> pPrimarySuffOut,Ref<NString> pPrimaryTitleOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_SUPERVISOR_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUPERVISOR_PIDM", pSupervisorPidm);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_PRIMARY_POSN_OUT", NString.class);
			cmd.addParameter("@P_PRIMARY_SUFF_OUT", NString.class);
			cmd.addParameter("@P_PRIMARY_TITLE_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pPrimaryPosnOut.val = cmd.getParameterValue("@P_PRIMARY_POSN_OUT", NString.class);
			pPrimarySuffOut.val = cmd.getParameterValue("@P_PRIMARY_SUFF_OUT", NString.class);
			pPrimaryTitleOut.val = cmd.getParameterValue("@P_PRIMARY_TITLE_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateWkcpCode(NString pWkcpCode,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJOBS.P_VALIDATE_WKCP_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WKCP_CODE", pWkcpCode);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
	
	
	
}
