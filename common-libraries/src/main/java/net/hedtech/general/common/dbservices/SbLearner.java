package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbLearner {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNER.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fEligibleToRegister(NNumber pPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNER.F_ELIGIBLE_TO_REGISTER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pTermCodeEff,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNER.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(LearnerRecRow recOne,LearnerRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNER.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, LearnerRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, LearnerRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pTermCodeEff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNER.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNER.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fQueryCurrent(NNumber pPidm,NString pTermCodeEff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNER.F_QUERY_CURRENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fQueryEnd(NNumber pPidm,NString pTermCodeEff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNER.F_QUERY_END", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pTermCodeEff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNER.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pTermCodeEff,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNER.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCopyLearner(NNumber pPidm,NString pTermCodeOld,NString pTermCodeNew) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNER.P_COPY_LEARNER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_OLD", pTermCodeOld);
			cmd.addParameter("@P_TERM_CODE_NEW", pTermCodeNew);
				
			cmd.execute();


		}
		
		public static void pCreate(NNumber pPidm,NString pTermCodeEff,NString pStstCode,NString pStypCode,NDate pExpGradDate,NString pFullPartInd,NString pSessCode,NString pResdCode,NString pOrsnCode,NString pPracCode,NNumber pAdvrPidm,NString pGradCreditApprInd,NString pCaplCode,NString pLeavCode,NDate pLeavFromDate,NDate pLeavToDate,NString pAstdCode,NString pTermCodeAstd,NString pRateCode,NString pEdlvCode,NString pIncmCode,NString pEmexCode,NString pAprnCode,NString pTrcnCode,NString pGainCode,NString pVoedCode,NString pBlckCode,NString pTermCodeGrad,NString pAcyrCode,NString pSiteCode,NString pEgolCode,NString pDegcCodeDual,NString pLevlCodeDual,NString pDeptCodeDual,NString pCollCodeDual,NString pMajrCodeDual,NString pBsklCode,NString pPrevCode,NString pTermCodePrev,NString pCastCode,NString pTermCodeCast,NString pUserId,NString pDataOrigin,NString pScpcCode,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNER.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_STST_CODE", pStstCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_EXP_GRAD_DATE", pExpGradDate);
			cmd.addParameter("@P_FULL_PART_IND", pFullPartInd);
			cmd.addParameter("@P_SESS_CODE", pSessCode);
			cmd.addParameter("@P_RESD_CODE", pResdCode);
			cmd.addParameter("@P_ORSN_CODE", pOrsnCode);
			cmd.addParameter("@P_PRAC_CODE", pPracCode);
			cmd.addParameter("@P_ADVR_PIDM", pAdvrPidm);
			cmd.addParameter("@P_GRAD_CREDIT_APPR_IND", pGradCreditApprInd);
			cmd.addParameter("@P_CAPL_CODE", pCaplCode);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
			cmd.addParameter("@P_LEAV_FROM_DATE", pLeavFromDate);
			cmd.addParameter("@P_LEAV_TO_DATE", pLeavToDate);
			cmd.addParameter("@P_ASTD_CODE", pAstdCode);
			cmd.addParameter("@P_TERM_CODE_ASTD", pTermCodeAstd);
			cmd.addParameter("@P_RATE_CODE", pRateCode);
			cmd.addParameter("@P_EDLV_CODE", pEdlvCode);
			cmd.addParameter("@P_INCM_CODE", pIncmCode);
			cmd.addParameter("@P_EMEX_CODE", pEmexCode);
			cmd.addParameter("@P_APRN_CODE", pAprnCode);
			cmd.addParameter("@P_TRCN_CODE", pTrcnCode);
			cmd.addParameter("@P_GAIN_CODE", pGainCode);
			cmd.addParameter("@P_VOED_CODE", pVoedCode);
			cmd.addParameter("@P_BLCK_CODE", pBlckCode);
			cmd.addParameter("@P_TERM_CODE_GRAD", pTermCodeGrad);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_SITE_CODE", pSiteCode);
			cmd.addParameter("@P_EGOL_CODE", pEgolCode);
			cmd.addParameter("@P_DEGC_CODE_DUAL", pDegcCodeDual);
			cmd.addParameter("@P_LEVL_CODE_DUAL", pLevlCodeDual);
			cmd.addParameter("@P_DEPT_CODE_DUAL", pDeptCodeDual);
			cmd.addParameter("@P_COLL_CODE_DUAL", pCollCodeDual);
			cmd.addParameter("@P_MAJR_CODE_DUAL", pMajrCodeDual);
			cmd.addParameter("@P_BSKL_CODE", pBsklCode);
			cmd.addParameter("@P_PREV_CODE", pPrevCode);
			cmd.addParameter("@P_TERM_CODE_PREV", pTermCodePrev);
			cmd.addParameter("@P_CAST_CODE", pCastCode);
			cmd.addParameter("@P_TERM_CODE_CAST", pTermCodeCast);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SCPC_CODE", pScpcCode);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pTermCodeEff,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNER.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pTermCodeEff,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNER.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pTermCodeEff,NString pStstCode,NString pStypCode,NDate pExpGradDate,NString pFullPartInd,NString pSessCode,NString pResdCode,NString pOrsnCode,NString pPracCode,NNumber pAdvrPidm,NString pGradCreditApprInd,NString pCaplCode,NString pLeavCode,NDate pLeavFromDate,NDate pLeavToDate,NString pAstdCode,NString pTermCodeAstd,NString pRateCode,NString pEdlvCode,NString pIncmCode,NString pEmexCode,NString pAprnCode,NString pTrcnCode,NString pGainCode,NString pVoedCode,NString pBlckCode,NString pTermCodeGrad,NString pAcyrCode,NString pSiteCode,NString pEgolCode,NString pDegcCodeDual,NString pLevlCodeDual,NString pDeptCodeDual,NString pCollCodeDual,NString pMajrCodeDual,NString pBsklCode,NString pPrevCode,NString pTermCodePrev,NString pCastCode,NString pTermCodeCast,NString pUserId,NString pDataOrigin,NString pScpcCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNER.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_STST_CODE", pStstCode);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_EXP_GRAD_DATE", pExpGradDate);
			cmd.addParameter("@P_FULL_PART_IND", pFullPartInd);
			cmd.addParameter("@P_SESS_CODE", pSessCode);
			cmd.addParameter("@P_RESD_CODE", pResdCode);
			cmd.addParameter("@P_ORSN_CODE", pOrsnCode);
			cmd.addParameter("@P_PRAC_CODE", pPracCode);
			cmd.addParameter("@P_ADVR_PIDM", pAdvrPidm);
			cmd.addParameter("@P_GRAD_CREDIT_APPR_IND", pGradCreditApprInd);
			cmd.addParameter("@P_CAPL_CODE", pCaplCode);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
			cmd.addParameter("@P_LEAV_FROM_DATE", pLeavFromDate);
			cmd.addParameter("@P_LEAV_TO_DATE", pLeavToDate);
			cmd.addParameter("@P_ASTD_CODE", pAstdCode);
			cmd.addParameter("@P_TERM_CODE_ASTD", pTermCodeAstd);
			cmd.addParameter("@P_RATE_CODE", pRateCode);
			cmd.addParameter("@P_EDLV_CODE", pEdlvCode);
			cmd.addParameter("@P_INCM_CODE", pIncmCode);
			cmd.addParameter("@P_EMEX_CODE", pEmexCode);
			cmd.addParameter("@P_APRN_CODE", pAprnCode);
			cmd.addParameter("@P_TRCN_CODE", pTrcnCode);
			cmd.addParameter("@P_GAIN_CODE", pGainCode);
			cmd.addParameter("@P_VOED_CODE", pVoedCode);
			cmd.addParameter("@P_BLCK_CODE", pBlckCode);
			cmd.addParameter("@P_TERM_CODE_GRAD", pTermCodeGrad);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_SITE_CODE", pSiteCode);
			cmd.addParameter("@P_EGOL_CODE", pEgolCode);
			cmd.addParameter("@P_DEGC_CODE_DUAL", pDegcCodeDual);
			cmd.addParameter("@P_LEVL_CODE_DUAL", pLevlCodeDual);
			cmd.addParameter("@P_DEPT_CODE_DUAL", pDeptCodeDual);
			cmd.addParameter("@P_COLL_CODE_DUAL", pCollCodeDual);
			cmd.addParameter("@P_MAJR_CODE_DUAL", pMajrCodeDual);
			cmd.addParameter("@P_BSKL_CODE", pBsklCode);
			cmd.addParameter("@P_PREV_CODE", pPrevCode);
			cmd.addParameter("@P_TERM_CODE_PREV", pTermCodePrev);
			cmd.addParameter("@P_CAST_CODE", pCastCode);
			cmd.addParameter("@P_TERM_CODE_CAST", pTermCodeCast);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SCPC_CODE", pScpcCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="LearnerRecRow", dataSourceName="LEARNER_REC")
	public static class LearnerRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TERM_CODE_EFF")
		public NString RTermCodeEff;
		@DbRecordField(dataSourceName="R_STST_CODE")
		public NString RStstCode;
		@DbRecordField(dataSourceName="R_LEVL_CODE")
		public NString RLevlCode;
		@DbRecordField(dataSourceName="R_STYP_CODE")
		public NString RStypCode;
		@DbRecordField(dataSourceName="R_TERM_CODE_MATRIC")
		public NString RTermCodeMatric;
		@DbRecordField(dataSourceName="R_TERM_CODE_ADMIT")
		public NString RTermCodeAdmit;
		@DbRecordField(dataSourceName="R_EXP_GRAD_DATE")
		public NDate RExpGradDate;
		@DbRecordField(dataSourceName="R_CAMP_CODE")
		public NString RCampCode;
		@DbRecordField(dataSourceName="R_FULL_PART_IND")
		public NString RFullPartInd;
		@DbRecordField(dataSourceName="R_SESS_CODE")
		public NString RSessCode;
		@DbRecordField(dataSourceName="R_RESD_CODE")
		public NString RResdCode;
		@DbRecordField(dataSourceName="R_COLL_CODE_1")
		public NString RCollCode1;
		@DbRecordField(dataSourceName="R_DEGC_CODE_1")
		public NString RDegcCode1;
		@DbRecordField(dataSourceName="R_MAJR_CODE_1")
		public NString RMajrCode1;
		@DbRecordField(dataSourceName="R_MAJR_CODE_MINR_1")
		public NString RMajrCodeMinr1;
		@DbRecordField(dataSourceName="R_MAJR_CODE_MINR_1_2")
		public NString RMajrCodeMinr12;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_1")
		public NString RMajrCodeConc1;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_1_2")
		public NString RMajrCodeConc12;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_1_3")
		public NString RMajrCodeConc13;
		@DbRecordField(dataSourceName="R_COLL_CODE_2")
		public NString RCollCode2;
		@DbRecordField(dataSourceName="R_DEGC_CODE_2")
		public NString RDegcCode2;
		@DbRecordField(dataSourceName="R_MAJR_CODE_2")
		public NString RMajrCode2;
		@DbRecordField(dataSourceName="R_MAJR_CODE_MINR_2")
		public NString RMajrCodeMinr2;
		@DbRecordField(dataSourceName="R_MAJR_CODE_MINR_2_2")
		public NString RMajrCodeMinr22;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_2")
		public NString RMajrCodeConc2;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_2_2")
		public NString RMajrCodeConc22;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_2_3")
		public NString RMajrCodeConc23;
		@DbRecordField(dataSourceName="R_ORSN_CODE")
		public NString ROrsnCode;
		@DbRecordField(dataSourceName="R_PRAC_CODE")
		public NString RPracCode;
		@DbRecordField(dataSourceName="R_ADVR_PIDM")
		public NNumber RAdvrPidm;
		@DbRecordField(dataSourceName="R_GRAD_CREDIT_APPR_IND")
		public NString RGradCreditApprInd;
		@DbRecordField(dataSourceName="R_CAPL_CODE")
		public NString RCaplCode;
		@DbRecordField(dataSourceName="R_LEAV_CODE")
		public NString RLeavCode;
		@DbRecordField(dataSourceName="R_LEAV_FROM_DATE")
		public NDate RLeavFromDate;
		@DbRecordField(dataSourceName="R_LEAV_TO_DATE")
		public NDate RLeavToDate;
		@DbRecordField(dataSourceName="R_ASTD_CODE")
		public NString RAstdCode;
		@DbRecordField(dataSourceName="R_TERM_CODE_ASTD")
		public NString RTermCodeAstd;
		@DbRecordField(dataSourceName="R_RATE_CODE")
		public NString RRateCode;
		@DbRecordField(dataSourceName="R_MAJR_CODE_1_2")
		public NString RMajrCode12;
		@DbRecordField(dataSourceName="R_MAJR_CODE_2_2")
		public NString RMajrCode22;
		@DbRecordField(dataSourceName="R_EDLV_CODE")
		public NString REdlvCode;
		@DbRecordField(dataSourceName="R_INCM_CODE")
		public NString RIncmCode;
		@DbRecordField(dataSourceName="R_ADMT_CODE")
		public NString RAdmtCode;
		@DbRecordField(dataSourceName="R_EMEX_CODE")
		public NString REmexCode;
		@DbRecordField(dataSourceName="R_APRN_CODE")
		public NString RAprnCode;
		@DbRecordField(dataSourceName="R_TRCN_CODE")
		public NString RTrcnCode;
		@DbRecordField(dataSourceName="R_GAIN_CODE")
		public NString RGainCode;
		@DbRecordField(dataSourceName="R_VOED_CODE")
		public NString RVoedCode;
		@DbRecordField(dataSourceName="R_BLCK_CODE")
		public NString RBlckCode;
		@DbRecordField(dataSourceName="R_TERM_CODE_GRAD")
		public NString RTermCodeGrad;
		@DbRecordField(dataSourceName="R_ACYR_CODE")
		public NString RAcyrCode;
		@DbRecordField(dataSourceName="R_DEPT_CODE")
		public NString RDeptCode;
		@DbRecordField(dataSourceName="R_SITE_CODE")
		public NString RSiteCode;
		@DbRecordField(dataSourceName="R_DEPT_CODE_2")
		public NString RDeptCode2;
		@DbRecordField(dataSourceName="R_EGOL_CODE")
		public NString REgolCode;
		@DbRecordField(dataSourceName="R_DEGC_CODE_DUAL")
		public NString RDegcCodeDual;
		@DbRecordField(dataSourceName="R_LEVL_CODE_DUAL")
		public NString RLevlCodeDual;
		@DbRecordField(dataSourceName="R_DEPT_CODE_DUAL")
		public NString RDeptCodeDual;
		@DbRecordField(dataSourceName="R_COLL_CODE_DUAL")
		public NString RCollCodeDual;
		@DbRecordField(dataSourceName="R_MAJR_CODE_DUAL")
		public NString RMajrCodeDual;
		@DbRecordField(dataSourceName="R_BSKL_CODE")
		public NString RBsklCode;
		@DbRecordField(dataSourceName="R_PRIM_ROLL_IND")
		public NString RPrimRollInd;
		@DbRecordField(dataSourceName="R_PROGRAM_1")
		public NString RProgram1;
		@DbRecordField(dataSourceName="R_TERM_CODE_CTLG_1")
		public NString RTermCodeCtlg1;
		@DbRecordField(dataSourceName="R_DEPT_CODE_1_2")
		public NString RDeptCode12;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_121")
		public NString RMajrCodeConc121;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_122")
		public NString RMajrCodeConc122;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_123")
		public NString RMajrCodeConc123;
		@DbRecordField(dataSourceName="R_SECD_ROLL_IND")
		public NString RSecdRollInd;
		@DbRecordField(dataSourceName="R_TERM_CODE_ADMIT_2")
		public NString RTermCodeAdmit2;
		@DbRecordField(dataSourceName="R_ADMT_CODE_2")
		public NString RAdmtCode2;
		@DbRecordField(dataSourceName="R_PROGRAM_2")
		public NString RProgram2;
		@DbRecordField(dataSourceName="R_TERM_CODE_CTLG_2")
		public NString RTermCodeCtlg2;
		@DbRecordField(dataSourceName="R_LEVL_CODE_2")
		public NString RLevlCode2;
		@DbRecordField(dataSourceName="R_CAMP_CODE_2")
		public NString RCampCode2;
		@DbRecordField(dataSourceName="R_DEPT_CODE_2_2")
		public NString RDeptCode22;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_221")
		public NString RMajrCodeConc221;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_222")
		public NString RMajrCodeConc222;
		@DbRecordField(dataSourceName="R_MAJR_CODE_CONC_223")
		public NString RMajrCodeConc223;
		@DbRecordField(dataSourceName="R_CURR_RULE_1")
		public NNumber RCurrRule1;
		@DbRecordField(dataSourceName="R_CMJR_RULE_1_1")
		public NNumber RCmjrRule11;
		@DbRecordField(dataSourceName="R_CCON_RULE_11_1")
		public NNumber RCconRule111;
		@DbRecordField(dataSourceName="R_CCON_RULE_11_2")
		public NNumber RCconRule112;
		@DbRecordField(dataSourceName="R_CCON_RULE_11_3")
		public NNumber RCconRule113;
		@DbRecordField(dataSourceName="R_CMJR_RULE_1_2")
		public NNumber RCmjrRule12;
		@DbRecordField(dataSourceName="R_CCON_RULE_12_1")
		public NNumber RCconRule121;
		@DbRecordField(dataSourceName="R_CCON_RULE_12_2")
		public NNumber RCconRule122;
		@DbRecordField(dataSourceName="R_CCON_RULE_12_3")
		public NNumber RCconRule123;
		@DbRecordField(dataSourceName="R_CMNR_RULE_1_1")
		public NNumber RCmnrRule11;
		@DbRecordField(dataSourceName="R_CMNR_RULE_1_2")
		public NNumber RCmnrRule12;
		@DbRecordField(dataSourceName="R_CURR_RULE_2")
		public NNumber RCurrRule2;
		@DbRecordField(dataSourceName="R_CMJR_RULE_2_1")
		public NNumber RCmjrRule21;
		@DbRecordField(dataSourceName="R_CCON_RULE_21_1")
		public NNumber RCconRule211;
		@DbRecordField(dataSourceName="R_CCON_RULE_21_2")
		public NNumber RCconRule212;
		@DbRecordField(dataSourceName="R_CCON_RULE_21_3")
		public NNumber RCconRule213;
		@DbRecordField(dataSourceName="R_CMJR_RULE_2_2")
		public NNumber RCmjrRule22;
		@DbRecordField(dataSourceName="R_CCON_RULE_22_1")
		public NNumber RCconRule221;
		@DbRecordField(dataSourceName="R_CCON_RULE_22_2")
		public NNumber RCconRule222;
		@DbRecordField(dataSourceName="R_CCON_RULE_22_3")
		public NNumber RCconRule223;
		@DbRecordField(dataSourceName="R_CMNR_RULE_2_1")
		public NNumber RCmnrRule21;
		@DbRecordField(dataSourceName="R_CMNR_RULE_2_2")
		public NNumber RCmnrRule22;
		@DbRecordField(dataSourceName="R_PREV_CODE")
		public NString RPrevCode;
		@DbRecordField(dataSourceName="R_TERM_CODE_PREV")
		public NString RTermCodePrev;
		@DbRecordField(dataSourceName="R_CAST_CODE")
		public NString RCastCode;
		@DbRecordField(dataSourceName="R_TERM_CODE_CAST")
		public NString RTermCodeCast;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_SCPC_CODE")
		public NString RScpcCode;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
