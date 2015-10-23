package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nbkbudg {
		public static NNumber fCalcBudgetBasis(NNumber pBudgetFte,NNumber pAnnBasis,NNumber pApptPct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.F_CALC_BUDGET_BASIS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_BUDGET_FTE", pBudgetFte);
			cmd.addParameter("@P_ANN_BASIS", pAnnBasis);
			cmd.addParameter("@P_APPT_PCT", pApptPct);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcchgamtMethodamt(NNumber chgAmt,NNumber rndFactor,NString prorateMethod,NNumber prorateFactor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.F_CALCCHGAMT_METHODAMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@CHG_AMT", chgAmt);
			cmd.addParameter("@RND_FACTOR", rndFactor);
			cmd.addParameter("@PRORATE_METHOD", prorateMethod);
			cmd.addParameter("@PRORATE_FACTOR", prorateFactor);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcchgamtMethodpct(NNumber baseAmt,NNumber chgPercent,NNumber rndFactor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.F_CALCCHGAMT_METHODPCT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@BASE_AMT", baseAmt);
			cmd.addParameter("@CHG_PERCENT", chgPercent);
			cmd.addParameter("@RND_FACTOR", rndFactor);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcchgpctMethodamt(NNumber baseAmt,NNumber chgAmt,NNumber rndFactor,NString prorateMethod,NNumber prorateFactor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.F_CALCCHGPCT_METHODAMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@BASE_AMT", baseAmt);
			cmd.addParameter("@CHG_AMT", chgAmt);
			cmd.addParameter("@RND_FACTOR", rndFactor);
			cmd.addParameter("@PRORATE_METHOD", prorateMethod);
			cmd.addParameter("@PRORATE_FACTOR", prorateFactor);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fCanUserEditOrgn(NString extract,NString scenario,NString inUser,NString inOrgn,NString inCoas,NDate effDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.F_CAN_USER_EDIT_ORGN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@IN_USER", inUser);
			cmd.addParameter("@IN_ORGN", inOrgn);
			cmd.addParameter("@IN_COAS", inCoas);
			cmd.addParameter("@EFF_DATE", effDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExtractExists(NString pExtractId,NString pScenarioName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.F_EXTRACT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO_NAME", pScenarioName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExtractScenarioExists(NString pExtractId,NString pScenario) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.F_EXTRACT_SCENARIO_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO", pScenario);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExtractSpecExists(NString pExtractId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.F_EXTRACT_SPEC_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFinInstalledInd() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.F_FIN_INSTALLED_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetLockStatus(NString extract,NString scenario,NString inOrgn,NString inCoas,NDate inAsofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.F_GET_LOCK_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@IN_ORGN", inOrgn);
			cmd.addParameter("@IN_COAS", inCoas);
			cmd.addParameter("@IN_ASOFDATE", inAsofdate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetNbrejldChgStatus(NString pExtractId,NString pScenario,NNumber pPidm,NString pPosn,NString pSuff,NString pWaitingInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.F_GET_NBREJLD_CHG_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_WAITING_IND", pWaitingInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetNbrerrnChgStatus(NString pExtractId,NString pScenario,NNumber pPidm,NString pPosn,NString pSuff,NString pWaitingInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.F_GET_NBRERRN_CHG_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_WAITING_IND", pWaitingInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetPosnEstFyBudg(NNumber parmPidm,NString parmExtract,NString parmScenario,NString parmUser,NString parmOrgn,NString parmPosn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.F_GET_POSN_EST_FY_BUDG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PARM_PIDM", parmPidm);
			cmd.addParameter("@PARM_EXTRACT", parmExtract);
			cmd.addParameter("@PARM_SCENARIO", parmScenario);
			cmd.addParameter("@PARM_USER", parmUser);
			cmd.addParameter("@PARM_ORGN", parmOrgn);
			cmd.addParameter("@PARM_POSN", parmPosn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetPosnEstFyBudgExcl(NNumber parmPidm,NString parmExtract,NString parmScenario,NString parmUser,NString parmOrgn,NString parmPosn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.F_GET_POSN_EST_FY_BUDG_EXCL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PARM_PIDM", parmPidm);
			cmd.addParameter("@PARM_EXTRACT", parmExtract);
			cmd.addParameter("@PARM_SCENARIO", parmScenario);
			cmd.addParameter("@PARM_USER", parmUser);
			cmd.addParameter("@PARM_ORGN", parmOrgn);
			cmd.addParameter("@PARM_POSN", parmPosn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetRankCode(NNumber pidm,NString posn,NString suff,NDate effDate,NString coas,NString orgn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.F_GET_RANK_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@POSN", posn);
			cmd.addParameter("@SUFF", suff);
			cmd.addParameter("@EFF_DATE", effDate);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@ORGN", orgn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsFeedToBudgetSet(NString pFisc,NString pCoas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.F_IS_FEED_TO_BUDGET_SET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FISC", pFisc);
			cmd.addParameter("@P_COAS", pCoas);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fUnlockedOrgnList(NString extractIn,NString scenarioIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.F_UNLOCKED_ORGN_LIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@EXTRACT_IN", extractIn);
			cmd.addParameter("@SCENARIO_IN", scenarioIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fValidBudgOrgnList(NString userIdIn,NString extractIn,NString scenarioIn,NString coasCodeIn,NDate asofDateIn,NString accessTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.F_VALID_BUDG_ORGN_LIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@USER_ID_IN", userIdIn);
			cmd.addParameter("@EXTRACT_IN", extractIn);
			cmd.addParameter("@SCENARIO_IN", scenarioIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@ASOF_DATE_IN", asofDateIn);
			cmd.addParameter("@ACCESS_TYPE_IN", accessTypeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fValidHrBudgOrgnMulList(NString userIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.F_VALID_HR_BUDG_ORGN_MUL_LIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@USER_ID_IN", userIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pAddNewBudgets(NString pExtractId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_ADD_NEW_BUDGETS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
				
			cmd.execute();


		}
		
		public static void pCopyNbrlock(NString pExtractId,NString pScenarioFrom,NString pScenarioTo,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_COPY_NBRLOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO_FROM", pScenarioFrom);
			cmd.addParameter("@P_SCENARIO_TO", pScenarioTo);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
		public static void pCopyNbrlockWeb(NString pExtractId,NString pScenarioFrom,NString pScenarioTo,NString pUserId,NString pOrgnSelect) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_COPY_NBRLOCK_WEB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO_FROM", pScenarioFrom);
			cmd.addParameter("@P_SCENARIO_TO", pScenarioTo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ORGN_SELECT", pOrgnSelect);
				
			cmd.execute();


		}
		
		public static void pCopyPosnDistToJobs(NString pMode,NString pExtractId,NString pOrgn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_COPY_POSN_DIST_TO_JOBS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MODE", pMode);
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_ORGN", pOrgn);
				
			cmd.execute();


		}
		
		public static void pCopyScenario(NString pExtractId,NString pScenarioFrom,NString pScenarioTo,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_COPY_SCENARIO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO_FROM", pScenarioFrom);
			cmd.addParameter("@P_SCENARIO_TO", pScenarioTo);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
		public static void pCopyScenarioWeb(NString pExtractId,NString pScenarioFrom,NString pScenarioTo,NString pUserId,NString pAutoUpdPosnInd,NString pAutoUpdBudDevInd,NString pPostToBudPoolInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_COPY_SCENARIO_WEB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO_FROM", pScenarioFrom);
			cmd.addParameter("@P_SCENARIO_TO", pScenarioTo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_AUTO_UPD_POSN_IND", pAutoUpdPosnInd);
			cmd.addParameter("@P_AUTO_UPD_BUD_DEV_IND", pAutoUpdBudDevInd);
			cmd.addParameter("@P_POST_TO_BUD_POOL_IND", pPostToBudPoolInd);
				
			cmd.execute();


		}
		
		public static void pDeleteInvalidBudgets(NString pExtractId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_DELETE_INVALID_BUDGETS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
				
			cmd.execute();


		}
		
		public static void pDeleteNbtjerr() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_DELETE_NBTJERR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDeleteScenario(NString pExtractId,NString pScenario,NString pZeroBuddevInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_DELETE_SCENARIO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_ZERO_BUDDEV_IND", pZeroBuddevInd);
				
			cmd.execute();


		}
		
		public static void pDeleteTempByPidm(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_DELETE_TEMP_BY_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pExtractBudget(NString pExtractId,NDate pEffDate,NString pSgrpCode,NString pScenario) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_EXTRACT_BUDGET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_SGRP_CODE", pSgrpCode);
			cmd.addParameter("@P_SCENARIO", pScenario);
				
			cmd.execute();


		}
		
		public static void pInsertNbtjerr(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffDate,NString pMsgType,NString pErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_INSERT_NBTJERR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_MSG_TYPE", pMsgType);
			cmd.addParameter("@P_ERR_MSG", pErrMsg);
				
			cmd.execute();


		}
		
		public static void pInsertNbtperr(NString pPosn,NString pMsgType,NString pErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_INSERT_NBTPERR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_MSG_TYPE", pMsgType);
			cmd.addParameter("@P_ERR_MSG", pErrMsg);
				
			cmd.execute();


		}
		
		public static void pSubmitEpafEarn(NNumber pPidm,NString pPosn,NString pSuff,NString pAcat,NNumber pEpafTranNo,NDate pNbrerrnEffDateProposed,NString pNbrerrnEarnCode,NNumber pNbrerrnHrsProposed,NDate pNbrerrnCancelDate,NString pNbrerrnShift,NString pMode,NString pComment,Ref<NString> pErrorType,Ref<NString> pErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_SUBMIT_EPAF_EARN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_EPAF_TRAN_NO", pEpafTranNo);
			cmd.addParameter("@P_NBRERRN_EFF_DATE_PROPOSED", pNbrerrnEffDateProposed);
			cmd.addParameter("@P_NBRERRN_EARN_CODE", pNbrerrnEarnCode);
			cmd.addParameter("@P_NBRERRN_HRS_PROPOSED", pNbrerrnHrsProposed);
			cmd.addParameter("@P_NBRERRN_CANCEL_DATE", pNbrerrnCancelDate);
			cmd.addParameter("@P_NBRERRN_SHIFT", pNbrerrnShift);
			cmd.addParameter("@P_MODE", pMode);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_ERROR_TYPE", pErrorType, true);
			cmd.addParameter("@P_ERROR_MSG", pErrorMsg, true);
				
			cmd.execute();
			pErrorType.val = cmd.getParameterValue("@P_ERROR_TYPE", NString.class);
			pErrorMsg.val = cmd.getParameterValue("@P_ERROR_MSG", NString.class);


		}
		
		public static void pSubmitEpafJlbd(NNumber pPidm,NString pPosn,NString pSuff,NString pExtractId,NString pScenario,NString pAcat,NNumber pEpafTranNo,NString pMode,NString pComment,Ref<NString> pErrorType,Ref<NString> pErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_SUBMIT_EPAF_JLBD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_EPAF_TRAN_NO", pEpafTranNo);
			cmd.addParameter("@P_MODE", pMode);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_ERROR_TYPE", pErrorType, true);
			cmd.addParameter("@P_ERROR_MSG", pErrorMsg, true);
				
			cmd.execute();
			pErrorType.val = cmd.getParameterValue("@P_ERROR_TYPE", NString.class);
			pErrorMsg.val = cmd.getParameterValue("@P_ERROR_MSG", NString.class);


		}
		
		public static void pSubmitEpafJobs(NNumber pPidm,NString pPosn,NString pSuff,NString pAcat,NString pJcre,NNumber pEpafTranNo,NDate pNbrejobEffDateProposed,NString pNbrejobAnnSalaryProposed,NDate pNbrejobPersChgDate,NString pNbrejobApptPctProposed,NString pNbrejobHrsDayProposed,NString pNbrejobHrsPayProposed,NString pNbrejobSgrpCodeProposed,NString pNbrejobDescProposed,NString pNbrejobRegRateProposed,NString pNbrejobFteProposed,NString pNbrejobSalTableProposed,NString pNbrejobSalGradeProposed,NString pNbrejobSalStepProposed,NString pMode,NString pComment,Ref<NString> pErrorType,Ref<NString> pErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_SUBMIT_EPAF_JOBS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_ACAT", pAcat);
			cmd.addParameter("@P_JCRE", pJcre);
			cmd.addParameter("@P_EPAF_TRAN_NO", pEpafTranNo);
			cmd.addParameter("@P_NBREJOB_EFF_DATE_PROPOSED", pNbrejobEffDateProposed);
			cmd.addParameter("@P_NBREJOB_ANN_SALARY_PROPOSED", pNbrejobAnnSalaryProposed);
			cmd.addParameter("@P_NBREJOB_PERS_CHG_DATE", pNbrejobPersChgDate);
			cmd.addParameter("@P_NBREJOB_APPT_PCT_PROPOSED", pNbrejobApptPctProposed);
			cmd.addParameter("@P_NBREJOB_HRS_DAY_PROPOSED", pNbrejobHrsDayProposed);
			cmd.addParameter("@P_NBREJOB_HRS_PAY_PROPOSED", pNbrejobHrsPayProposed);
			cmd.addParameter("@P_NBREJOB_SGRP_CODE_PROPOSED", pNbrejobSgrpCodeProposed);
			cmd.addParameter("@P_NBREJOB_DESC_PROPOSED", pNbrejobDescProposed);
			cmd.addParameter("@P_NBREJOB_REG_RATE_PROPOSED", pNbrejobRegRateProposed);
			cmd.addParameter("@P_NBREJOB_FTE_PROPOSED", pNbrejobFteProposed);
			cmd.addParameter("@P_NBREJOB_SAL_TABLE_PROPOSED", pNbrejobSalTableProposed);
			cmd.addParameter("@P_NBREJOB_SAL_GRADE_PROPOSED", pNbrejobSalGradeProposed);
			cmd.addParameter("@P_NBREJOB_SAL_STEP_PROPOSED", pNbrejobSalStepProposed);
			cmd.addParameter("@P_MODE", pMode);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_ERROR_TYPE", pErrorType, true);
			cmd.addParameter("@P_ERROR_MSG", pErrorMsg, true);
				
			cmd.execute();
			pErrorType.val = cmd.getParameterValue("@P_ERROR_TYPE", NString.class);
			pErrorMsg.val = cmd.getParameterValue("@P_ERROR_MSG", NString.class);


		}
		
		public static void pUpdateExtractLock(NString pExtractId,NString pLockMode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_UPDATE_EXTRACT_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_LOCK_MODE", pLockMode);
				
			cmd.execute();


		}
		
		public static void pUpdateNbrejldWRecStatus(NString pExtractId,NString pScenario,NNumber pPidm,NString pPosn,NString pSuff,NString pStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_UPDATE_NBREJLD_W_REC_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_STATUS", pStatus);
				
			cmd.execute();


		}
		
		public static void pUpdateNbrejobPretran(NString pExtractId,NString pScenario,NNumber pPidm,NString pPosn,NString pSuff,NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_UPDATE_NBREJOB_PRETRAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pUpdateNbrejobWRecStatus(NString pExtractId,NString pScenario,NNumber pPidm,NString pPosn,NString pSuff,NString pStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_UPDATE_NBREJOB_W_REC_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_STATUS", pStatus);
				
			cmd.execute();


		}
		
		public static void pUpdateNbrerrnPretran(NString pExtractId,NString pScenario,NNumber pPidm,NString pPosn,NString pSuff,NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_UPDATE_NBRERRN_PRETRAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();


		}
		
		public static void pUpdateNbrerrnWRecStatus(NString pExtractId,NString pScenario,NNumber pPidm,NString pPosn,NString pSuff,NString pStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_UPDATE_NBRERRN_W_REC_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_STATUS", pStatus);
				
			cmd.execute();


		}
		
		public static void pUpdateNbrplbd(NString pExtractId,NString pScenarioName,NString pFisc,NString pCoas,NString pObud,NString pObph,NDate pBudCreateDate,NString pPosn,NString pOrgn,NString pZeroBuddevInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_UPDATE_NBRPLBD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO_NAME", pScenarioName);
			cmd.addParameter("@P_FISC", pFisc);
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_OBUD", pObud);
			cmd.addParameter("@P_OBPH", pObph);
			cmd.addParameter("@P_BUD_CREATE_DATE", pBudCreateDate);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_ORGN", pOrgn);
			cmd.addParameter("@P_ZERO_BUDDEV_IND", pZeroBuddevInd);
				
			cmd.execute();


		}
		
		public static void pUpdatePosnBudget(NString pFisc,NString pCoas,NString pObud,NString pObph,NDate pBudCreateDate,NString pPosn,NString pOrgn,NNumber pBudProposed,NNumber pFteProposed,NNumber pApptPctProposed,NString pComments) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_UPDATE_POSN_BUDGET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FISC", pFisc);
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_OBUD", pObud);
			cmd.addParameter("@P_OBPH", pObph);
			cmd.addParameter("@P_BUD_CREATE_DATE", pBudCreateDate);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_ORGN", pOrgn);
			cmd.addParameter("@P_BUD_PROPOSED", pBudProposed);
			cmd.addParameter("@P_FTE_PROPOSED", pFteProposed);
			cmd.addParameter("@P_APPT_PCT_PROPOSED", pApptPctProposed);
			cmd.addParameter("@P_COMMENTS", pComments);
				
			cmd.execute();


		}
		
		public static void pUpdateSalaryPlannerEpld(NString extract,NString scenario,NString orgnCode,NString posn,NNumber posnBudget,NString epsaUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_UPDATE_SALARY_PLANNER_EPLD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EXTRACT", extract);
			cmd.addParameter("@SCENARIO", scenario);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@POSN", posn);
			cmd.addParameter("@POSN_BUDGET", posnBudget);
			cmd.addParameter("@EPSA_USER", epsaUser);
				
			cmd.execute();


		}
		
		public static void pUpdateTmpDistFlag(NString pExtractId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_UPDATE_TMP_DIST_FLAG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
				
			cmd.execute();


		}
		
		public static void pUpdateWRecStatus(NString pExtractId,NString pScenario,NNumber pPidm,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_UPDATE_W_REC_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();


		}
		
		public static void pValidateJlbd(NString pExtractId,NString pScenarioName,NDate pEvalDate,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_VALIDATE_JLBD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO_NAME", pScenarioName);
			cmd.addParameter("@P_EVAL_DATE", pEvalDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();


		}
		
		public static void pValidateJobsFopal(NString pCoas,NDate pEvalDate,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffDate,NString pFund,NString pOrgn,NString pAcct,NString pProg,NString pActv,NString pLocn,NString pProj,NString pCtyp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_VALIDATE_JOBS_FOPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_EVAL_DATE", pEvalDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_FUND", pFund);
			cmd.addParameter("@P_ORGN", pOrgn);
			cmd.addParameter("@P_ACCT", pAcct);
			cmd.addParameter("@P_PROG", pProg);
			cmd.addParameter("@P_ACTV", pActv);
			cmd.addParameter("@P_LOCN", pLocn);
			cmd.addParameter("@P_PROJ", pProj);
			cmd.addParameter("@P_CTYP", pCtyp);
				
			cmd.execute();


		}
		
		public static void pValidatePlbd(NString pExtractId,NString pScenarioName,NDate pEvalDate,NString pOrgn,NString pPosn,NNumber pPosnBudget) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_VALIDATE_PLBD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO_NAME", pScenarioName);
			cmd.addParameter("@P_EVAL_DATE", pEvalDate);
			cmd.addParameter("@P_ORGN", pOrgn);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_POSN_BUDGET", pPosnBudget);
				
			cmd.execute();


		}
		
		public static void pValidatePosnFopal(NString pCoas,NDate pEvalDate,NString pPosn,NString pFund,NString pOrgn,NString pAcct,NString pProg,NString pActv,NString pLocn,NString pProj,NString pCtyp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_VALIDATE_POSN_FOPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_EVAL_DATE", pEvalDate);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_FUND", pFund);
			cmd.addParameter("@P_ORGN", pOrgn);
			cmd.addParameter("@P_ACCT", pAcct);
			cmd.addParameter("@P_PROG", pProg);
			cmd.addParameter("@P_ACTV", pActv);
			cmd.addParameter("@P_LOCN", pLocn);
			cmd.addParameter("@P_PROJ", pProj);
			cmd.addParameter("@P_CTYP", pCtyp);
				
			cmd.execute();


		}
		
		public static void pWriteUnbalancedPlbdamts(NString pExtractId,NString pScenarioName,NDate pEvalDate,NString pOrgn,NString pPosn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKBUDG.P_WRITE_UNBALANCED_PLBDAMTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EXTRACT_ID", pExtractId);
			cmd.addParameter("@P_SCENARIO_NAME", pScenarioName);
			cmd.addParameter("@P_EVAL_DATE", pEvalDate);
			cmd.addParameter("@P_ORGN", pOrgn);
			cmd.addParameter("@P_POSN", pPosn);
				
			cmd.execute();


		}
		
	
	
	
}
