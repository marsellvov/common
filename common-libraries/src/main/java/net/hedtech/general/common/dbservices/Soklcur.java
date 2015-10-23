package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Soklcur {
		public static NString fConvertApplicant(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.F_CONVERT_APPLICANT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fConvertLearner(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.F_CONVERT_LEARNER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fConvertOutcome(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.F_CONVERT_OUTCOME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fConvertRecruit(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.F_CONVERT_RECRUIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCountLcur(NNumber pPidm,NString pLmodCode,NString pTermCode,NNumber pKeyseqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.F_COUNT_LCUR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEYSEQNO", pKeyseqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCountLfos(NNumber pPidm,NNumber pLcurSeqno,NString pLmodCode,NString pLfstCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.F_COUNT_LFOS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCurrentLcur(NNumber pPidm,NString pLmodCode,NString pTermCode,NNumber pKeyseqno,NNumber pPriority,NNumber pLcurSeqno,NString pActiveInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.F_CURRENT_LCUR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEYSEQNO", pKeyseqno);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCurrentLfos(NNumber pPidm,NNumber pLcurSeqno,NNumber pPriority,NString pLfstCode,NNumber pLfosSeqno,NString pActiveInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.F_CURRENT_LFOS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_LFOS_SEQNO", pLfosSeqno);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDefaultCact(NString pCactCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.F_DEFAULT_CACT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CACT_CODE", pCactCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEventStatus(NString pCstsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.F_EVENT_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CSTS_CODE", pCstsCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFindRolledDegree(NNumber pPidm,NString pProgram,NString pCollCode,NString pDegcCode,NString pLevlCode,Ref<NNumber> pLcurSeqnoOut,Ref<NNumber> pKeySeqnoOut,NNumber pGappSeqno,NNumber pStudyPath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.F_FIND_ROLLED_DEGREE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_LCUR_SEQNO_OUT", NNumber.class);
			cmd.addParameter("@P_KEY_SEQNO_OUT", NNumber.class);
			cmd.addParameter("@P_GAPP_SEQNO", pGappSeqno);
			cmd.addParameter("@P_STUDY_PATH", pStudyPath);
				
			cmd.execute();
			pLcurSeqnoOut.val = cmd.getParameterValue("@P_LCUR_SEQNO_OUT", NNumber.class);
			pKeySeqnoOut.val = cmd.getParameterValue("@P_KEY_SEQNO_OUT", NNumber.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fLcurCountStatus(NNumber pPidm,NString pLmod,NString pTermCode,NNumber pKeyseqno,NNumber pPriorityNo,NString pDefaultStatus,Ref<NString> pNewCsts) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.F_LCUR_COUNT_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD", pLmod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEYSEQNO", pKeyseqno);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_DEFAULT_STATUS", pDefaultStatus);
			cmd.addParameter("@P_NEW_CSTS", pNewCsts, true);
				
			cmd.execute();
			pNewCsts.val = cmd.getParameterValue("@P_NEW_CSTS", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fLcurRowid(NString pLmod,NNumber pPidm,NString pTermCode,NNumber pKeyseqno,NDate pActDate,NNumber pPriority) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.F_LCUR_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LMOD", pLmod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEYSEQNO", pKeyseqno);
			cmd.addParameter("@P_ACT_DATE", pActDate);
			cmd.addParameter("@P_PRIORITY", pPriority);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fLfosCountStatus(NNumber pPidm,NNumber pLcurSeqno,NString pLfstCode,NNumber pPriorityNo,NString pLmodCode,NString pDefaultStatus,Ref<NString> pNewCsts) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.F_LFOS_COUNT_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_DEFAULT_STATUS", pDefaultStatus);
			cmd.addParameter("@P_NEW_CSTS", pNewCsts, true);
				
			cmd.execute();
			pNewCsts.val = cmd.getParameterValue("@P_NEW_CSTS", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fLfosRowid(NString pLmodCode,NNumber pLcurSeqno,NString pLfstCode,NNumber pPidm,NString pTermCode,NDate pActDate,NNumber pPriority) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.F_LFOS_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACT_DATE", pActDate);
			cmd.addParameter("@P_PRIORITY", pPriority);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fRolledAwarded(NNumber pPidm,NString pLmodCode,NNumber pRolledSeqno,NNumber pKeySeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.F_ROLLED_AWARDED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_ROLLED_SEQNO", pRolledSeqno);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateDegsCsts(NString pDegsCode,NString pCstsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.F_VALIDATE_DEGS_CSTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DEGS_CODE", pDegsCode);
			cmd.addParameter("@P_CSTS_CODE", pCstsCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pBackloadCurr(NString pLmod,NString pTermCode,NNumber pKeyseqno,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_BACKLOAD_CURR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LMOD", pLmod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEYSEQNO", pKeyseqno);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pConvertCurr(NString pLmod,NNumber pPidm,NString pLmodRow,NString pCurriculumInd,NString pCurrExistsInd,NString pUseDefaultCounts) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_CONVERT_CURR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LMOD", pLmod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD_ROW", pLmodRow);
			cmd.addParameter("@P_CURRICULUM_IND", pCurriculumInd);
			cmd.addParameter("@P_CURR_EXISTS_IND", pCurrExistsInd);
			cmd.addParameter("@P_USE_DEFAULT_COUNTS", pUseDefaultCounts);
				
			cmd.execute();


		}
		
		public static void pCopyStudypath(NNumber pPidm,NString pTermCodeOld,NString pTermCodeNew,NNumber pKeyseqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_COPY_STUDYPATH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_OLD", pTermCodeOld);
			cmd.addParameter("@P_TERM_CODE_NEW", pTermCodeNew);
			cmd.addParameter("@P_KEYSEQNO", pKeyseqno);
				
			cmd.execute();


		}
		
		public static void pCreateSotlcur(NNumber pPidm,NNumber pSeqno,NString pLmodCode,NString pTermCode,NNumber pKeySeqno,NString pCactCode,NNumber pPriorityNo,NString pLevlCode,NString pCollCode,NString pDegcCode,NString pTermCodeCtlg,NString pCampCode,NString pProgram) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_CREATE_SOTLCUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_CACT_CODE", pCactCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_TERM_CODE_CTLG", pTermCodeCtlg);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
				
			cmd.execute();


		}
		
		public static void pCreateSotlfos(NNumber pPidm,NNumber pLcurSeqno,NNumber pSeqno,NString pCactCode,NString pLfstCode,NNumber pPriorityNo,NString pMajrCode,NString pDeptCode,NString pTermCodeCtlg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_CREATE_SOTLFOS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_CACT_CODE", pCactCode);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_TERM_CODE_CTLG", pTermCodeCtlg);
				
			cmd.execute();


		}
		
		public static void pCreateSotvcur(NNumber pPidm,NString pTermCode,NString pLmodCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_CREATE_SOTVCUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
				
			cmd.execute();


		}
		
		public static void pCreateStudypath(NNumber pPidm,NString pTermCode,NNumber pSeqno,NNumber pApplNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_CREATE_STUDYPATH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_APPL_NO", pApplNo);
				
			cmd.execute();


		}
		
		public static void pDefaultStatus(NNumber pPidm,NString pLmodCode,NString pTermCode,NNumber pKeyseqno,NString pStstCode,NString pDegsCode,NString pApdcCode,Ref<NString> pCactOut,Ref<NString> pCstsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_DEFAULT_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEYSEQNO", pKeyseqno);
			cmd.addParameter("@P_STST_CODE", pStstCode);
			cmd.addParameter("@P_DEGS_CODE", pDegsCode);
			cmd.addParameter("@P_APDC_CODE", pApdcCode);
			cmd.addParameter("@P_CACT_OUT", NString.class);
			cmd.addParameter("@P_CSTS_OUT", NString.class);
				
			cmd.execute();
			pCactOut.val = cmd.getParameterValue("@P_CACT_OUT", NString.class);
			pCstsOut.val = cmd.getParameterValue("@P_CSTS_OUT", NString.class);


		}
		
		public static void pDeleteSotlcur(NNumber pPidm,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_DELETE_SOTLCUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();


		}
		
		public static void pDeleteSotlfos(NNumber pPidm,NNumber pLcurSeqno,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_DELETE_SOTLFOS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();


		}
		
		public static void pDeleteSotvcur(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_DELETE_SOTVCUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pGradappSeqno(NNumber pPidm,NNumber pSeqno,NString pUserId,NNumber pGappSeqno,NString pRowid,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_GRADAPP_SEQNO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_GAPP_SEQNO", pGappSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pLcurPriority(NString pLmod,NNumber pPidm,NString pTermCode,NNumber pKeyseqno,NDate pActDate,NNumber pPriority,Ref<SbCurriculum.CurriculumRecRow> pSorlcurRow,Ref<NString> pLcurRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_LCUR_PRIORITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LMOD", pLmod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEYSEQNO", pKeyseqno);
			cmd.addParameter("@P_ACT_DATE", pActDate);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter(DbTypes.createStructType("P_SORLCUR_ROW", pSorlcurRow.val, SbCurriculum.CurriculumRecRow.class));
            cmd.addParameter("@P_LCUR_ROWID", NString.class);
				
			cmd.execute();
			pSorlcurRow.val = cmd.getParameterValue("P_SORLCUR_ROW", SbCurriculum.CurriculumRecRow.class);
			pLcurRowid.val = cmd.getParameterValue("@P_LCUR_ROWID", NString.class);


		}
		
		public static void pLearnerLcurRolled(NNumber pPidm,NString pDegcCode,NString pLevlCode,NString pCollCode,NString pProgram,NNumber pLcurSeqno,Ref<NString> pRolledOut,NString pCampCode,Ref<NNumber> pLearnerPriority) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_LEARNER_LCUR_ROLLED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_ROLLED_OUT", NString.class);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_LEARNER_PRIORITY", NNumber.class);
				
			cmd.execute();
			pRolledOut.val = cmd.getParameterValue("@P_ROLLED_OUT", NString.class);
			pLearnerPriority.val = cmd.getParameterValue("@P_LEARNER_PRIORITY", NNumber.class);


		}
		
		public static void pLearnerLfosRolled(NNumber pPidm,NString pMajrCode,NString pLfstCode,NNumber pLcurSeqno,NNumber pLfosSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_LEARNER_LFOS_ROLLED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_LFOS_SEQNO", pLfosSeqno);
				
			cmd.execute();


		}
		
		public static void pLfosPriority(NString pLmod,NNumber pLcurSeqno,NString pLfstCode,NNumber pPidm,NString pTermCode,NDate pActDate,NNumber pPriority,Ref<NString> dMajrCode,Ref<NString> dDeptCode,Ref<NNumber> dLfosRule,Ref<NNumber> dAttachRule,Ref<NString> dCatlgTerm,Ref<NString> dLfosRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_LFOS_PRIORITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LMOD", pLmod);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACT_DATE", pActDate);
			cmd.addParameter("@P_PRIORITY", pPriority);
			cmd.addParameter("@D_MAJR_CODE", NString.class);
			cmd.addParameter("@D_DEPT_CODE", NString.class);
			cmd.addParameter("@D_LFOS_RULE", NNumber.class);
			cmd.addParameter("@D_ATTACH_RULE", NNumber.class);
			cmd.addParameter("@D_CATLG_TERM", NString.class);
			cmd.addParameter("@D_LFOS_ROWID", NString.class);
				
			cmd.execute();
			dMajrCode.val = cmd.getParameterValue("@D_MAJR_CODE", NString.class);
			dDeptCode.val = cmd.getParameterValue("@D_DEPT_CODE", NString.class);
			dLfosRule.val = cmd.getParameterValue("@D_LFOS_RULE", NNumber.class);
			dAttachRule.val = cmd.getParameterValue("@D_ATTACH_RULE", NNumber.class);
			dCatlgTerm.val = cmd.getParameterValue("@D_CATLG_TERM", NString.class);
			dLfosRowid.val = cmd.getParameterValue("@D_LFOS_ROWID", NString.class);


		}
		
		public static void pLoadCurrent(NString pLmodCode,NNumber pPidm,NString pTermCode,NNumber pKeySeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_LOAD_CURRENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
				
			cmd.execute();


		}
		
		public static void pPushDecisionCurriculum(NNumber pPidm,NString pTermCode,NNumber pKeyseqno,NString pApdcCode,NString pActiveInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_PUSH_DECISION_CURRICULUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEYSEQNO", pKeyseqno);
			cmd.addParameter("@P_APDC_CODE", pApdcCode);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
				
			cmd.execute();


		}
		
		public static void pPushDegreeCurriculum(NNumber pPidm,NString pTermCode,NNumber pKeyseqno,NString pDegsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_PUSH_DEGREE_CURRICULUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEYSEQNO", pKeyseqno);
			cmd.addParameter("@P_DEGS_CODE", pDegsCode);
				
			cmd.execute();


		}
		
		public static void pPushLearnerCurriculum(NNumber pPidm,NString pTermCode,NString pStstCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_PUSH_LEARNER_CURRICULUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_STST_CODE", pStstCode);
				
			cmd.execute();


		}
		
		public static void pPushRecruitCurriculum(NNumber pPidm,NString pTermCode,NNumber pKeyseqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKLCUR.P_PUSH_RECRUIT_CURRICULUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEYSEQNO", pKeyseqno);
				
			cmd.execute();


		}
		
	
	
	
}
