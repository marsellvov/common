package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sokccur {
//		public static List<CurriculumSavedtabRow> fCurrentActiveCurriculum(NNumber pPidm,NString pLmodCode,NString pTermCode,NNumber pKeySeqno,NString pEffTerm) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCCUR.F_CURRENT_ACTIVE_CURRICULUM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<CurriculumSavedtabRow>.class);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
//			cmd.addParameter("@P_EFF_TERM", pEffTerm);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<CurriculumSavedtabRow>.class);
//
//		}
		
//		public static List<CurriculumSavedtabRow> fCurriculum(NNumber pPidm,NString pLmodCode,NString pTermCode,NNumber pKeySeqno) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCCUR.F_CURRICULUM", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<CurriculumSavedtabRow>.class);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<CurriculumSavedtabRow>.class);
//
//		}
		
		public static NString fCurriculumValue(NNumber pPidm,NString pLmodCode,NString pTermCode,NNumber pKeySeqno,NString pEffTerm,NNumber pOrder,NString pField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCCUR.F_CURRICULUM_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_ORDER", pOrder);
			cmd.addParameter("@P_FIELD", pField);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<FieldofstudySavedtabRow> fFieldofstudy(NNumber pPidm,NString pLmodCode,NString pTermCode,NNumber pKeySeqno) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCCUR.F_FIELDOFSTUDY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<FieldofstudySavedtabRow>.class);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<FieldofstudySavedtabRow>.class);
//
//		}
		
		public static NString fFieldofstudyValue(NNumber pPidm,NString pLmodCode,NString pTermCode,NNumber pKeySeqno,NNumber pLcurSeqno,NString pLfstCode,NNumber pOrder,NString pField) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCCUR.F_FIELDOFSTUDY_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_ORDER", pOrder);
			cmd.addParameter("@P_FIELD", pField);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fLearnerOrder(NNumber pPidm,NNumber pSeqno,NString pEffTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCCUR.F_LEARNER_ORDER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fMatchCurriculum(NNumber pPidm,NString pLmodCode,NString pTermCode,NNumber pKeySeqno,NString pLevlCode,NString pCollCode,NString pDegcCode,NString pCampCode,NString pProgram,NString pPrimSecCde,NString pLfstCode,NString pMajrCode,NString pDeptCode,NString pAdmtCode,NString pTermCodeAdmt,NString pTermCodeMatric,NString pStypCode,NString pRateCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCCUR.F_MATCH_CURRICULUM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_PRIM_SEC_CDE", pPrimSecCde);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_ADMT_CODE", pAdmtCode);
			cmd.addParameter("@P_TERM_CODE_ADMT", pTermCodeAdmt);
			cmd.addParameter("@P_TERM_CODE_MATRIC", pTermCodeMatric);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_RATE_CODE", pRateCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fOrder(NNumber pPidm,NString pLmodCode,NNumber pSeqno,NString pTermCode,NNumber pKeySeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCCUR.F_ORDER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor fQueryLearner(NNumber pPidm,NString pLmodCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCCUR.F_QUERY_LEARNER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOutcome(NNumber pPidm,NString pLmodCode,NNumber pKeySeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCCUR.F_QUERY_OUTCOME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryRecruitAppl(NNumber pPidm,NString pLmodCode,NString pTermCode,NNumber pKeySeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCCUR.F_QUERY_RECRUIT_APPL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pDeleteTabs() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCCUR.P_DELETE_TABS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDeleteXmlclob() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCCUR.P_DELETE_XMLCLOB", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetCurriculaData(NNumber pPidm,NString pTerm,NString pLmod,NNumber pKeySeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCCUR.P_GET_CURRICULA_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_LMOD", pLmod);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
				
			cmd.execute();


		}
		
		public static void pNumberOfLcur(NString pTerm,Ref<NNumber> pLcuradmtcount,Ref<NNumber> pLcurrecrcount,Ref<NNumber> pLcuroutccount,Ref<NNumber> pLcurlrnrcount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCCUR.P_NUMBER_OF_LCUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_LCURADMTCOUNT", pLcuradmtcount, true);
			cmd.addParameter("@P_LCURRECRCOUNT", pLcurrecrcount, true);
			cmd.addParameter("@P_LCUROUTCCOUNT", pLcuroutccount, true);
			cmd.addParameter("@P_LCURLRNRCOUNT", pLcurlrnrcount, true);
				
			cmd.execute();
			pLcuradmtcount.val = cmd.getParameterValue("@P_LCURADMTCOUNT", NNumber.class);
			pLcurrecrcount.val = cmd.getParameterValue("@P_LCURRECRCOUNT", NNumber.class);
			pLcuroutccount.val = cmd.getParameterValue("@P_LCUROUTCCOUNT", NNumber.class);
			pLcurlrnrcount.val = cmd.getParameterValue("@P_LCURLRNRCOUNT", NNumber.class);


		}
		
		public static void pParseLcurData(NString pLmod,NString pTerm,NString pLcurindex,Ref<NNumber> pSeqno,Ref<NString> pLevl,Ref<NString> pCollCode,Ref<NString> pCampCode,Ref<NString> pDegcCode,Ref<NString> pProgram,Ref<NString> pTermCtlg,Ref<NString> pTermAdmit,Ref<NString> pTermMatric,Ref<NString> pAdmtCode,Ref<NString> pRollInd,Ref<NNumber> pLcurRule) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCCUR.P_PARSE_LCUR_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LMOD", pLmod);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_LCURINDEX", pLcurindex);
			cmd.addParameter("@P_SEQNO", pSeqno, true);
			cmd.addParameter("@P_LEVL", pLevl, true);
			cmd.addParameter("@P_COLL_CODE", pCollCode, true);
			cmd.addParameter("@P_CAMP_CODE", pCampCode, true);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode, true);
			cmd.addParameter("@P_PROGRAM", pProgram, true);
			cmd.addParameter("@P_TERM_CTLG", pTermCtlg, true);
			cmd.addParameter("@P_TERM_ADMIT", pTermAdmit, true);
			cmd.addParameter("@P_TERM_MATRIC", pTermMatric, true);
			cmd.addParameter("@P_ADMT_CODE", pAdmtCode, true);
			cmd.addParameter("@P_ROLL_IND", pRollInd, true);
			cmd.addParameter("@P_LCUR_RULE", pLcurRule, true);
				
			cmd.execute();
			pSeqno.val = cmd.getParameterValue("@P_SEQNO", NNumber.class);
			pLevl.val = cmd.getParameterValue("@P_LEVL", NString.class);
			pCollCode.val = cmd.getParameterValue("@P_COLL_CODE", NString.class);
			pCampCode.val = cmd.getParameterValue("@P_CAMP_CODE", NString.class);
			pDegcCode.val = cmd.getParameterValue("@P_DEGC_CODE", NString.class);
			pProgram.val = cmd.getParameterValue("@P_PROGRAM", NString.class);
			pTermCtlg.val = cmd.getParameterValue("@P_TERM_CTLG", NString.class);
			pTermAdmit.val = cmd.getParameterValue("@P_TERM_ADMIT", NString.class);
			pTermMatric.val = cmd.getParameterValue("@P_TERM_MATRIC", NString.class);
			pAdmtCode.val = cmd.getParameterValue("@P_ADMT_CODE", NString.class);
			pRollInd.val = cmd.getParameterValue("@P_ROLL_IND", NString.class);
			pLcurRule.val = cmd.getParameterValue("@P_LCUR_RULE", NNumber.class);


		}
		
		public static void pParseLfosData(NString pLmod,NString pTerm,NNumber pSeqno,NNumber pLcurindex,NNumber pLfosindex,NNumber pConcindex,NString pLfstcode,Ref<NString> pMajrCode,Ref<NString> pTermCodeCtlg,Ref<NString> pTermCodeEnd,Ref<NString> pDeptCode,Ref<NNumber> pLfosRule,Ref<NNumber> pLfosseqno,Ref<NNumber> pConcAttachRule,Ref<NDate> pStartDate,Ref<NDate> pEndDate,Ref<NString> pTmstCode,Ref<NNumber> pRolledSeqno,Ref<NString> pMajrCodeAttach) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCCUR.P_PARSE_LFOS_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LMOD", pLmod);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LCURINDEX", pLcurindex);
			cmd.addParameter("@P_LFOSINDEX", pLfosindex);
			cmd.addParameter("@P_CONCINDEX", pConcindex);
			cmd.addParameter("@P_LFSTCODE", pLfstcode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode, true);
			cmd.addParameter("@P_TERM_CODE_CTLG", pTermCodeCtlg, true);
			cmd.addParameter("@P_TERM_CODE_END", pTermCodeEnd, true);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode, true);
			cmd.addParameter("@P_LFOS_RULE", pLfosRule, true);
			cmd.addParameter("@P_LFOSSEQNO", pLfosseqno, true);
			cmd.addParameter("@P_CONC_ATTACH_RULE", pConcAttachRule, true);
			cmd.addParameter("@P_START_DATE", pStartDate, true);
			cmd.addParameter("@P_END_DATE", pEndDate, true);
			cmd.addParameter("@P_TMST_CODE", pTmstCode, true);
			cmd.addParameter("@P_ROLLED_SEQNO", pRolledSeqno, true);
			cmd.addParameter("@P_MAJR_CODE_ATTACH", pMajrCodeAttach, true);
				
			cmd.execute();
			pMajrCode.val = cmd.getParameterValue("@P_MAJR_CODE", NString.class);
			pTermCodeCtlg.val = cmd.getParameterValue("@P_TERM_CODE_CTLG", NString.class);
			pTermCodeEnd.val = cmd.getParameterValue("@P_TERM_CODE_END", NString.class);
			pDeptCode.val = cmd.getParameterValue("@P_DEPT_CODE", NString.class);
			pLfosRule.val = cmd.getParameterValue("@P_LFOS_RULE", NNumber.class);
			pLfosseqno.val = cmd.getParameterValue("@P_LFOSSEQNO", NNumber.class);
			pConcAttachRule.val = cmd.getParameterValue("@P_CONC_ATTACH_RULE", NNumber.class);
			pStartDate.val = cmd.getParameterValue("@P_START_DATE", NDate.class);
			pEndDate.val = cmd.getParameterValue("@P_END_DATE", NDate.class);
			pTmstCode.val = cmd.getParameterValue("@P_TMST_CODE", NString.class);
			pRolledSeqno.val = cmd.getParameterValue("@P_ROLLED_SEQNO", NNumber.class);
			pMajrCodeAttach.val = cmd.getParameterValue("@P_MAJR_CODE_ATTACH", NString.class);


		}
		
		public static void pParseMaxValues(NString pLmod,NString pTerm,NNumber pLcurindex,Ref<NNumber> pMajrMax,Ref<NNumber> pMinrMax,Ref<NNumber> pConcMax) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKCCUR.P_PARSE_MAX_VALUES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LMOD", pLmod);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_LCURINDEX", pLcurindex);
			cmd.addParameter("@P_MAJR_MAX", pMajrMax, true);
			cmd.addParameter("@P_MINR_MAX", pMinrMax, true);
			cmd.addParameter("@P_CONC_MAX", pConcMax, true);
				
			cmd.execute();
			pMajrMax.val = cmd.getParameterValue("@P_MAJR_MAX", NNumber.class);
			pMinrMax.val = cmd.getParameterValue("@P_MINR_MAX", NNumber.class);
			pConcMax.val = cmd.getParameterValue("@P_CONC_MAX", NNumber.class);


		}
		
	
	
	@DbRecordType(id="CurriculumSavedrecRow", dataSourceName="CURRICULUM_SAVEDREC")
	public static class CurriculumSavedrecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_LMOD_CODE")
		public NString RLmodCode;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_KEY_SEQNO")
		public NNumber RKeySeqno;
		@DbRecordField(dataSourceName="R_PRIORITY_NO")
		public NNumber RPriorityNo;
		@DbRecordField(dataSourceName="R_ROLL_IND")
		public NString RRollInd;
		@DbRecordField(dataSourceName="R_CACT_CODE")
		public NString RCactCode;
		@DbRecordField(dataSourceName="R_LEVL_CODE")
		public NString RLevlCode;
		@DbRecordField(dataSourceName="R_COLL_CODE")
		public NString RCollCode;
		@DbRecordField(dataSourceName="R_DEGC_CODE")
		public NString RDegcCode;
		@DbRecordField(dataSourceName="R_TERM_CODE_CTLG")
		public NString RTermCodeCtlg;
		@DbRecordField(dataSourceName="R_TERM_CODE_END")
		public NString RTermCodeEnd;
		@DbRecordField(dataSourceName="R_TERM_CODE_MATRIC")
		public NString RTermCodeMatric;
		@DbRecordField(dataSourceName="R_TERM_CODE_ADMIT")
		public NString RTermCodeAdmit;
		@DbRecordField(dataSourceName="R_ADMT_CODE")
		public NString RAdmtCode;
		@DbRecordField(dataSourceName="R_CAMP_CODE")
		public NString RCampCode;
		@DbRecordField(dataSourceName="R_PROGRAM")
		public NString RProgram;
		@DbRecordField(dataSourceName="R_START_DATE")
		public NDate RStartDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_CURR_RULE")
		public NNumber RCurrRule;
		@DbRecordField(dataSourceName="R_ROLLED_SEQNO")
		public NNumber RRolledSeqno;
		@DbRecordField(dataSourceName="R_STYP_CODE")
		public NString RStypCode;
		@DbRecordField(dataSourceName="R_EXP_GRAD_DATE")
		public NDate RExpGradDate;
		@DbRecordField(dataSourceName="R_LEAV_CODE")
		public NString RLeavCode;
		@DbRecordField(dataSourceName="R_LEAV_FROM_DATE")
		public NDate RLeavFromDate;
		@DbRecordField(dataSourceName="R_LEAV_TO_DATE")
		public NDate RLeavToDate;
		@DbRecordField(dataSourceName="R_RATE_CODE")
		public NString RRateCode;
		@DbRecordField(dataSourceName="R_TERM_CODE_GRAD")
		public NString RTermCodeGrad;
		@DbRecordField(dataSourceName="R_ACYR_CODE")
		public NString RAcyrCode;
		@DbRecordField(dataSourceName="R_SITE_CODE")
		public NString RSiteCode;
		@DbRecordField(dataSourceName="R_APPL_KEY_SEQNO")
		public NNumber RApplKeySeqno;
		@DbRecordField(dataSourceName="R_APPL_SEQNO")
		public NNumber RApplSeqno;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		@DbRecordField(dataSourceName="R_ACTIVE")
		public NString RActive;
		@DbRecordField(dataSourceName="R_ORDER")
		public NNumber ROrder;
		@DbRecordField(dataSourceName="R_CURRENT")
		public NString RCurrent;
		@DbRecordField(dataSourceName="R_GAPP_SEQNO")
		public NNumber RGappSeqno;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_ACTIVITY_DATE")
		public NDate RActivityDate;
		@DbRecordField(dataSourceName="R_USER_ID_UPDATE")
		public NString RUserIdUpdate;
		@DbRecordField(dataSourceName="R_ACTIVITY_DATE_UPDATE")
		public NDate RActivityDateUpdate;
	}

	
	@DbRecordType(id="FieldofstudySavedrecRow", dataSourceName="FIELDOFSTUDY_SAVEDREC")
	public static class FieldofstudySavedrecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_LCUR_SEQNO")
		public NNumber RLcurSeqno;
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_LFST_CODE")
		public NString RLfstCode;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_PRIORITY_NO")
		public NNumber RPriorityNo;
		@DbRecordField(dataSourceName="R_CACT_CODE")
		public NString RCactCode;
		@DbRecordField(dataSourceName="R_MAJR_CODE")
		public NString RMajrCode;
		@DbRecordField(dataSourceName="R_TERM_CODE_CTLG")
		public NString RTermCodeCtlg;
		@DbRecordField(dataSourceName="R_TERM_CODE_END")
		public NString RTermCodeEnd;
		@DbRecordField(dataSourceName="R_DEPT_CODE")
		public NString RDeptCode;
		@DbRecordField(dataSourceName="R_LFOS_RULE")
		public NNumber RLfosRule;
		@DbRecordField(dataSourceName="R_CONC_ATTACH_RULE")
		public NNumber RConcAttachRule;
		@DbRecordField(dataSourceName="R_START_DATE")
		public NDate RStartDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_TMST_CODE")
		public NString RTmstCode;
		@DbRecordField(dataSourceName="R_MAJR_CODE_ATTACH")
		public NString RMajrCodeAttach;
		@DbRecordField(dataSourceName="R_ROLLED_SEQNO")
		public NNumber RRolledSeqno;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		@DbRecordField(dataSourceName="R_ACTIVE")
		public NString RActive;
		@DbRecordField(dataSourceName="R_ORDER")
		public NNumber ROrder;
		@DbRecordField(dataSourceName="R_CURRENT")
		public NString RCurrent;
		@DbRecordField(dataSourceName="R_CSTS_CODE")
		public NString RCstsCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_ACTIVITY_DATE")
		public NDate RActivityDate;
		@DbRecordField(dataSourceName="R_USER_ID_UPDATE")
		public NString RUserIdUpdate;
		@DbRecordField(dataSourceName="R_ACTIVITY_DATE_UPDATE")
		public NDate RActivityDateUpdate;
	}

	
	
}
