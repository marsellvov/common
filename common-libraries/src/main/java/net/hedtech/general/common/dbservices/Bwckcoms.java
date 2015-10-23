package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwckcoms {
		public static NString fGetstudypathname(NNumber pPidm,NString pTerm,NNumber pSpSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.F_GETSTUDYPATHNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_SP_SEQNO", pSpSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fRegAccessStillGood(NNumber pidmIn,NString termIn,NString callPathIn,NString procNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.F_REG_ACCESS_STILL_GOOD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CALL_PATH_IN", callPathIn);
			cmd.addParameter("@PROC_NAME_IN", procNameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fStudypathenabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.F_STUDYPATHENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fStudypathreq(NString pTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.F_STUDYPATHREQ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM", pTerm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTrimSelCrn(NString selCrnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.F_TRIM_SEL_CRN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SEL_CRN_IN", selCrnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTrimSelCrnTerm(NString selCrnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.F_TRIM_SEL_CRN_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SEL_CRN_IN", selCrnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fValidatestudentpin(NNumber pidm,NString pin,NString ldapUserid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.F_VALIDATESTUDENTPIN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@PIN", pin);
			cmd.addParameter("@LDAP_USERID", ldapUserid);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pAddDropCrn1(NNumber callType,NNumber selCrnCountIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_ADD_DROP_CRN1", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CALL_TYPE", callType);
			cmd.addParameter("@SEL_CRN_COUNT_IN", selCrnCountIn);
				
			cmd.execute();


		}
		
		public static void pAddDropCrn2(NNumber addRowNumber,NNumber regsCount,NNumber waitCount,NString multiTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_ADD_DROP_CRN2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ADD_ROW_NUMBER", addRowNumber);
			cmd.addParameter("@REGS_COUNT", regsCount);
			cmd.addParameter("@WAIT_COUNT", waitCount);
			cmd.addParameter("@MULTI_TERM", multiTerm);
				
			cmd.execute();


		}
		
//		public static void pAddDropInit(List<OwaUtil.IdentArrRow> termIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_ADD_DROP_INIT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pAdddrop(List<OwaUtil.IdentArrRow> term,List<OwaUtil.IdentArrRow> assocTerm,List<OwaUtil.IdentArrRow> selCrn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_ADDDROP", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM", "", term, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ASSOC_TERM", "", assocTerm, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_CRN", "", selCrn, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pAdddrop1(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> selCrn,List<OwaUtil.IdentArrRow> assocTermIn,List<OwaUtil.IdentArrRow> crnIn,List<OwaUtil.IdentArrRow> startDateIn,List<OwaUtil.IdentArrRow> endDateIn,List<OwaUtil.IdentArrRow> rstsIn,List<OwaUtil.IdentArrRow> subj,List<OwaUtil.IdentArrRow> crse,List<OwaUtil.IdentArrRow> sec,List<OwaUtil.IdentArrRow> levl,List<OwaUtil.IdentArrRow> cred,List<OwaUtil.IdentArrRow> gmod,List<Varchar2TabtypeRow> title,List<OwaUtil.IdentArrRow> mesg,NNumber regsRow,NNumber addRow,NNumber waitRow) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_ADDDROP1", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_CRN", "", selCrn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ASSOC_TERM_IN", "", assocTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRN_IN", "", crnIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("START_DATE_IN", "", startDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("END_DATE_IN", "", endDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RSTS_IN", "", rstsIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SUBJ", "", subj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRSE", "", crse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEC", "", sec, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LEVL", "", levl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRED", "", cred, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GMOD", "", gmod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TITLE", "", title, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MESG", "", mesg, object.class));
//			cmd.addParameter("@REGS_ROW", regsRow);
//			cmd.addParameter("@ADD_ROW", addRow);
//			cmd.addParameter("@WAIT_ROW", waitRow);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pAdddrop2(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> errTerm,List<OwaUtil.IdentArrRow> errCrn,List<OwaUtil.IdentArrRow> errSubj,List<OwaUtil.IdentArrRow> errCrse,List<OwaUtil.IdentArrRow> errSec,List<OwaUtil.IdentArrRow> errCode,List<OwaUtil.IdentArrRow> errLevl,List<OwaUtil.IdentArrRow> errCred,List<OwaUtil.IdentArrRow> errGmod,Ref<NString> cappTechErrorInOut,NString dropResultLabelIn,List<Sfkcurs.DropProblemsRecTabtypeRow> dropProblemsIn,List<Sfkcurs.DropProblemsRecTabtypeRow> dropFailuresIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_ADDDROP2", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_TERM", "", errTerm, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_CRN", "", errCrn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_SUBJ", "", errSubj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_CRSE", "", errCrse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_SEC", "", errSec, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_CODE", "", errCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_LEVL", "", errLevl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_CRED", "", errCred, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_GMOD", "", errGmod, object.class));
//			cmd.addParameter("@CAPP_TECH_ERROR_IN_OUT", cappTechErrorInOut, true);
//			cmd.addParameter("@DROP_RESULT_LABEL_IN", dropResultLabelIn);
//			// cmd.addParameter(DbTypes.getTableType("DROP_PROBLEMS_IN", "", dropProblemsIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DROP_FAILURES_IN", "", dropFailuresIn, object.class));
//				
//			cmd.execute();
//			cappTechErrorInOut.val = cmd.getParameterValue("@CAPP_TECH_ERROR_IN_OUT", NString.class);
//
//
//		}
//		
//		public static void pAddfromsearch(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> assocTermIn,List<OwaUtil.IdentArrRow> selCrn,List<OwaUtil.IdentArrRow> addBtn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_ADDFROMSEARCH", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ASSOC_TERM_IN", "", assocTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_CRN", "", selCrn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ADD_BTN", "", addBtn, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pAddfromsearch1(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> assocTermIn,List<OwaUtil.IdentArrRow> selCrn,List<OwaUtil.IdentArrRow> rsts,List<OwaUtil.IdentArrRow> crn,List<OwaUtil.IdentArrRow> startDateIn,List<OwaUtil.IdentArrRow> endDateIn,List<OwaUtil.IdentArrRow> subj,List<OwaUtil.IdentArrRow> crse,List<OwaUtil.IdentArrRow> sec,List<OwaUtil.IdentArrRow> levl,List<OwaUtil.IdentArrRow> cred,List<OwaUtil.IdentArrRow> gmod,List<Varchar2TabtypeRow> title,List<OwaUtil.IdentArrRow> mesg,NNumber regsRow,NNumber addRow,NNumber waitRow,List<OwaUtil.IdentArrRow> addBtn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_ADDFROMSEARCH1", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ASSOC_TERM_IN", "", assocTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_CRN", "", selCrn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RSTS", "", rsts, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRN", "", crn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("START_DATE_IN", "", startDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("END_DATE_IN", "", endDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SUBJ", "", subj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRSE", "", crse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEC", "", sec, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LEVL", "", levl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRED", "", cred, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GMOD", "", gmod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TITLE", "", title, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MESG", "", mesg, object.class));
//			cmd.addParameter("@REGS_ROW", regsRow);
//			cmd.addParameter("@ADD_ROW", addRow);
//			cmd.addParameter("@WAIT_ROW", waitRow);
//			// cmd.addParameter(DbTypes.getTableType("ADD_BTN", "", addBtn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pBuildActionPulldown(NString termIn,NNumber pidmIn,NString crnIn,NDate startDateIn,NDate completionDateIn,NDate regstatusDateIn,NString duntIn,NNumber regsCountIn,NString rstsCodeIn,NString ptrmCodeIn,NString sdaxRstsCodeIn,NString holdRstsIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_BUILD_ACTION_PULLDOWN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@START_DATE_IN", startDateIn);
			cmd.addParameter("@COMPLETION_DATE_IN", completionDateIn);
			cmd.addParameter("@REGSTATUS_DATE_IN", regstatusDateIn);
			cmd.addParameter("@DUNT_IN", duntIn);
			cmd.addParameter("@REGS_COUNT_IN", regsCountIn);
			cmd.addParameter("@RSTS_CODE_IN", rstsCodeIn);
			cmd.addParameter("@PTRM_CODE_IN", ptrmCodeIn);
			cmd.addParameter("@SDAX_RSTS_CODE_IN", sdaxRstsCodeIn);
			cmd.addParameter("@HOLD_RSTS_IN", holdRstsIn);
				
			cmd.execute();


		}
		
		public static void pBuildWaitActionPulldown(NString termIn,NNumber pidmIn,NString crnIn,NNumber waitCountIn,NString ptrmCodeIn,NString rstsIn,Ref<NNumber> rowCountOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_BUILD_WAIT_ACTION_PULLDOWN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@WAIT_COUNT_IN", waitCountIn);
			cmd.addParameter("@PTRM_CODE_IN", ptrmCodeIn);
			cmd.addParameter("@RSTS_IN", rstsIn);
			cmd.addParameter("@ROW_COUNT_OUT", NNumber.class);
				
			cmd.execute();
			rowCountOut.val = cmd.getParameterValue("@ROW_COUNT_OUT", NNumber.class);


		}
		
		public static void pCurrSchedHeading(Ref<NBool> headingDisplayed,NString term,NBool multiTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_CURR_SCHED_HEADING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@HEADING_DISPLAYED", headingDisplayed, true);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@MULTI_TERM_IN", multiTermIn);
				
			cmd.execute();
			headingDisplayed.val = cmd.getParameterValue("@HEADING_DISPLAYED", NBool.class);


		}
		
		public static void pDeletemultistudypath(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_DELETEMULTISTUDYPATH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pDeletestudypath() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_DELETESTUDYPATH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pDispConfirmDrops(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> errTermIn,List<OwaUtil.IdentArrRow> errCrnIn,List<OwaUtil.IdentArrRow> errSubjIn,List<OwaUtil.IdentArrRow> errCrseIn,List<OwaUtil.IdentArrRow> errSecIn,List<OwaUtil.IdentArrRow> errCodeIn,List<OwaUtil.IdentArrRow> errLevlIn,List<OwaUtil.IdentArrRow> errCredIn,List<OwaUtil.IdentArrRow> errGmodIn,List<Sfkcurs.DropProblemsRecTabtypeRow> dropProblemsIn,List<Sfkcurs.DropProblemsRecTabtypeRow> dropFailuresIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_DISP_CONFIRM_DROPS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_TERM_IN", "", errTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_CRN_IN", "", errCrnIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_SUBJ_IN", "", errSubjIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_CRSE_IN", "", errCrseIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_SEC_IN", "", errSecIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_CODE_IN", "", errCodeIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_LEVL_IN", "", errLevlIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_CRED_IN", "", errCredIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_GMOD_IN", "", errGmodIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DROP_PROBLEMS_IN", "", dropProblemsIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DROP_FAILURES_IN", "", dropFailuresIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pDispPinPrompt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_DISP_PIN_PROMPT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pDispStartDateConfirm(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> rstsIn,List<OwaUtil.IdentArrRow> assocTermIn,List<OwaUtil.IdentArrRow> crnIn,List<OwaUtil.IdentArrRow> startDateIn,List<OwaUtil.IdentArrRow> endDateIn,List<OwaUtil.IdentArrRow> subj,List<OwaUtil.IdentArrRow> crse,List<OwaUtil.IdentArrRow> sec,List<OwaUtil.IdentArrRow> levl,List<OwaUtil.IdentArrRow> cred,List<OwaUtil.IdentArrRow> gmod,List<Varchar2TabtypeRow> title,List<OwaUtil.IdentArrRow> mesg,List<OwaUtil.IdentArrRow> regBtn,NNumber regsRow,NNumber addRow,NNumber waitRow,NString nextProcIn,NString msgIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_DISP_START_DATE_CONFIRM", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RSTS_IN", "", rstsIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ASSOC_TERM_IN", "", assocTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRN_IN", "", crnIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("START_DATE_IN", "", startDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("END_DATE_IN", "", endDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SUBJ", "", subj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRSE", "", crse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEC", "", sec, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LEVL", "", levl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRED", "", cred, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GMOD", "", gmod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TITLE", "", title, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MESG", "", mesg, object.class));
//			// cmd.addParameter(DbTypes.getTableType("REG_BTN", "", regBtn, object.class));
//			cmd.addParameter("@REGS_ROW", regsRow);
//			cmd.addParameter("@ADD_ROW", addRow);
//			cmd.addParameter("@WAIT_ROW", waitRow);
//			cmd.addParameter("@NEXT_PROC_IN", nextProcIn);
//			cmd.addParameter("@MSG_IN", msgIn);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pDropFailuresList(List<Sfkcurs.DropProblemsRecTabtypeRow> dropFailuresIn,NBool multiTermIn,Ref<NBool> tableOpenInOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_DROP_FAILURES_LIST", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("DROP_FAILURES_IN", "", dropFailuresIn, object.class));
//			cmd.addParameter("@MULTI_TERM_IN", multiTermIn);
//			cmd.addParameter("@TABLE_OPEN_IN_OUT", tableOpenInOut, true);
//				
//			cmd.execute();
//			tableOpenInOut.val = cmd.getParameterValue("@TABLE_OPEN_IN_OUT", NBool.class);
//
//
//		}
//		
//		public static void pDropProblemsList(List<Sfkcurs.DropProblemsRecTabtypeRow> dropProblemsIn,NBool multiTermIn,Ref<NBool> tableOpenInOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_DROP_PROBLEMS_LIST", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("DROP_PROBLEMS_IN", "", dropProblemsIn, object.class));
//			cmd.addParameter("@MULTI_TERM_IN", multiTermIn);
//			cmd.addParameter("@TABLE_OPEN_IN_OUT", tableOpenInOut, true);
//				
//			cmd.execute();
//			tableOpenInOut.val = cmd.getParameterValue("@TABLE_OPEN_IN_OUT", NBool.class);
//
//
//		}
		
		public static void pDropProblemsTableOpen(NBool multiTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_DROP_PROBLEMS_TABLE_OPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MULTI_TERM_IN", multiTermIn);
				
			cmd.execute();


		}
		
//		public static void pGroupEdits(List<OwaUtil.IdentArrRow> termIn,NNumber pidmIn,Ref<NBool> etrmDoneInOut,Ref<NString> cappTechErrorInOut,Ref<List<Sfkcurs.DropProblemsRecTabtypeRow>> dropProblemsInOut,Ref<List<Sfkcurs.DropProblemsRecTabtypeRow>> dropFailuresInOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_GROUP_EDITS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@ETRM_DONE_IN_OUT", etrmDoneInOut, true);
//			cmd.addParameter("@CAPP_TECH_ERROR_IN_OUT", cappTechErrorInOut, true);
//			// cmd.addParameter(DbTypes.getTableType("DROP_PROBLEMS_IN_OUT", "", dropProblemsInOut.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("DROP_FAILURES_IN_OUT", "", dropFailuresInOut.val, object.class , true));
//				
//			cmd.execute();
//			etrmDoneInOut.val = cmd.getParameterValue("@ETRM_DONE_IN_OUT", NBool.class);
//			cappTechErrorInOut.val = cmd.getParameterValue("@CAPP_TECH_ERROR_IN_OUT", NString.class);
//			// dropProblemsInOut.val = cmd.getTableParameterValue("@DROP_PROBLEMS_IN_OUT", object.class);
//			// dropFailuresInOut.val = cmd.getTableParameterValue("@DROP_FAILURES_IN_OUT", object.class);
//
//
//		}
		
		public static void pOpenRstsrowc(Ref<DataCursor> rstsrowc,Ref<NBool> openLearning,NString termIn,NNumber pidmIn,NString crnIn,NString rstsIn,NString ptrmIn,NString sdaxRstsCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_OPEN_RSTSROWC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RSTSROWC", DataCursor.class);
			cmd.addParameter("@OPEN_LEARNING", NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@RSTS_IN", rstsIn);
			cmd.addParameter("@PTRM_IN", ptrmIn);
			cmd.addParameter("@SDAX_RSTS_CODE_IN", sdaxRstsCodeIn);
				
			cmd.execute();
			rstsrowc.val = cmd.getParameterValue("@RSTSROWC", DataCursor.class);
			openLearning.val = cmd.getParameterValue("@OPEN_LEARNING", NBool.class);


		}
		
		public static void pOpenWaitrstsrowc(Ref<DataCursor> waitrstsrowc,Ref<NBool> openLearning,NString termIn,NNumber pidmIn,NString crnIn,NString ptrmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_OPEN_WAITRSTSROWC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WAITRSTSROWC", DataCursor.class);
			cmd.addParameter("@OPEN_LEARNING", NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PTRM_IN", ptrmIn);
				
			cmd.execute();
			waitrstsrowc.val = cmd.getParameterValue("@WAITRSTSROWC", DataCursor.class);
			openLearning.val = cmd.getParameterValue("@OPEN_LEARNING", NBool.class);


		}
		
//		public static void pProblems(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> errTerm,List<OwaUtil.IdentArrRow> errCrn,List<OwaUtil.IdentArrRow> errSubj,List<OwaUtil.IdentArrRow> errCrse,List<OwaUtil.IdentArrRow> errSec,List<OwaUtil.IdentArrRow> errCode,List<OwaUtil.IdentArrRow> errLevl,List<OwaUtil.IdentArrRow> errCred,List<OwaUtil.IdentArrRow> errGmod,List<Sfkcurs.DropProblemsRecTabtypeRow> dropProblemsIn,List<Sfkcurs.DropProblemsRecTabtypeRow> dropFailuresIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_PROBLEMS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_TERM", "", errTerm, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_CRN", "", errCrn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_SUBJ", "", errSubj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_CRSE", "", errCrse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_SEC", "", errSec, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_CODE", "", errCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_LEVL", "", errLevl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_CRED", "", errCred, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_GMOD", "", errGmod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DROP_PROBLEMS_IN", "", dropProblemsIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DROP_FAILURES_IN", "", dropFailuresIn, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pProcConfirmDrops(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> errTermIn,List<OwaUtil.IdentArrRow> errCrnIn,List<OwaUtil.IdentArrRow> errSubjIn,List<OwaUtil.IdentArrRow> errCrseIn,List<OwaUtil.IdentArrRow> errSecIn,List<OwaUtil.IdentArrRow> errCodeIn,List<OwaUtil.IdentArrRow> errLevlIn,List<OwaUtil.IdentArrRow> errCredIn,List<OwaUtil.IdentArrRow> errGmodIn,List<OwaUtil.IdentArrRow> dPTermCode,List<OwaUtil.IdentArrRow> dPCrn,List<OwaUtil.IdentArrRow> dPSubj,List<OwaUtil.IdentArrRow> dPCrse,List<OwaUtil.IdentArrRow> dPSec,List<OwaUtil.IdentArrRow> dPPtrmCode,List<OwaUtil.IdentArrRow> dPRmsgCde,List<OwaUtil.IdentArrRow> dPMessage,List<OwaUtil.IdentArrRow> dPStartDate,List<OwaUtil.IdentArrRow> dPCompDate,List<OwaUtil.IdentArrRow> dPRstsDate,List<OwaUtil.IdentArrRow> dPDuntCode,List<OwaUtil.IdentArrRow> dPDropCode,List<Varchar2TabtypeRow> dPDropConn,List<OwaUtil.IdentArrRow> dFTermCode,List<OwaUtil.IdentArrRow> dFCrn,List<OwaUtil.IdentArrRow> dFSubj,List<OwaUtil.IdentArrRow> dFCrse,List<OwaUtil.IdentArrRow> dFSec,List<OwaUtil.IdentArrRow> dFPtrmCode,List<OwaUtil.IdentArrRow> dFRmsgCde,List<OwaUtil.IdentArrRow> dFMessage,List<OwaUtil.IdentArrRow> dFStartDate,List<OwaUtil.IdentArrRow> dFCompDate,List<OwaUtil.IdentArrRow> dFRstsDate,List<OwaUtil.IdentArrRow> dFDuntCode,List<OwaUtil.IdentArrRow> dFDropCode,List<Varchar2TabtypeRow> dFDropConn,NString submitBtn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_PROC_CONFIRM_DROPS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_TERM_IN", "", errTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_CRN_IN", "", errCrnIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_SUBJ_IN", "", errSubjIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_CRSE_IN", "", errCrseIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_SEC_IN", "", errSecIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_CODE_IN", "", errCodeIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_LEVL_IN", "", errLevlIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_CRED_IN", "", errCredIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ERR_GMOD_IN", "", errGmodIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_P_TERM_CODE", "", dPTermCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_P_CRN", "", dPCrn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_P_SUBJ", "", dPSubj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_P_CRSE", "", dPCrse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_P_SEC", "", dPSec, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_P_PTRM_CODE", "", dPPtrmCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_P_RMSG_CDE", "", dPRmsgCde, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_P_MESSAGE", "", dPMessage, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_P_START_DATE", "", dPStartDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_P_COMP_DATE", "", dPCompDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_P_RSTS_DATE", "", dPRstsDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_P_DUNT_CODE", "", dPDuntCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_P_DROP_CODE", "", dPDropCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_P_DROP_CONN", "", dPDropConn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_F_TERM_CODE", "", dFTermCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_F_CRN", "", dFCrn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_F_SUBJ", "", dFSubj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_F_CRSE", "", dFCrse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_F_SEC", "", dFSec, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_F_PTRM_CODE", "", dFPtrmCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_F_RMSG_CDE", "", dFRmsgCde, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_F_MESSAGE", "", dFMessage, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_F_START_DATE", "", dFStartDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_F_COMP_DATE", "", dFCompDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_F_RSTS_DATE", "", dFRstsDate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_F_DUNT_CODE", "", dFDuntCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_F_DROP_CODE", "", dFDropCode, object.class));
//			// cmd.addParameter(DbTypes.getTableType("D_F_DROP_CONN", "", dFDropConn, object.class));
//			cmd.addParameter("@SUBMIT_BTN", submitBtn);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pProcStartDateConfirm(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> rstsIn,List<OwaUtil.IdentArrRow> assocTermIn,List<OwaUtil.IdentArrRow> crnIn,List<OwaUtil.IdentArrRow> startDateIn,List<OwaUtil.IdentArrRow> endDateIn,List<OwaUtil.IdentArrRow> subj,List<OwaUtil.IdentArrRow> crse,List<OwaUtil.IdentArrRow> sec,List<OwaUtil.IdentArrRow> levl,List<OwaUtil.IdentArrRow> cred,List<OwaUtil.IdentArrRow> gmod,List<Varchar2TabtypeRow> title,List<OwaUtil.IdentArrRow> mesg,List<OwaUtil.IdentArrRow> regBtn,NNumber regsRow,NNumber addRow,NNumber waitRow,List<OwaUtil.IdentArrRow> startDateFromIn,List<OwaUtil.IdentArrRow> startDateToIn,List<OwaUtil.IdentArrRow> endDateFromIn,List<OwaUtil.IdentArrRow> endDateToIn,NString nextProcIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_PROC_START_DATE_CONFIRM", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RSTS_IN", "", rstsIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ASSOC_TERM_IN", "", assocTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRN_IN", "", crnIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("START_DATE_IN", "", startDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("END_DATE_IN", "", endDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SUBJ", "", subj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRSE", "", crse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEC", "", sec, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LEVL", "", levl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRED", "", cred, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GMOD", "", gmod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TITLE", "", title, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MESG", "", mesg, object.class));
//			// cmd.addParameter(DbTypes.getTableType("REG_BTN", "", regBtn, object.class));
//			cmd.addParameter("@REGS_ROW", regsRow);
//			cmd.addParameter("@ADD_ROW", addRow);
//			cmd.addParameter("@WAIT_ROW", waitRow);
//			// cmd.addParameter(DbTypes.getTableType("START_DATE_FROM_IN", "", startDateFromIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("START_DATE_TO_IN", "", startDateToIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("END_DATE_FROM_IN", "", endDateFromIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("END_DATE_TO_IN", "", endDateToIn, object.class));
//			cmd.addParameter("@NEXT_PROC_IN", nextProcIn);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pRegErrHeading(NNumber callType,NBool multiTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_REG_ERR_HEADING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CALL_TYPE", callType);
			cmd.addParameter("@MULTI_TERM_IN", multiTermIn);
				
			cmd.execute();


		}
		
//		public static void pRegs(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> rstsIn,List<OwaUtil.IdentArrRow> assocTermIn,List<OwaUtil.IdentArrRow> crnIn,List<OwaUtil.IdentArrRow> startDateIn,List<OwaUtil.IdentArrRow> endDateIn,List<OwaUtil.IdentArrRow> subj,List<OwaUtil.IdentArrRow> crse,List<OwaUtil.IdentArrRow> sec,List<OwaUtil.IdentArrRow> levl,List<OwaUtil.IdentArrRow> cred,List<OwaUtil.IdentArrRow> gmod,List<Varchar2TabtypeRow> title,List<OwaUtil.IdentArrRow> mesg,List<OwaUtil.IdentArrRow> regBtn,NNumber regsRow,NNumber addRow,NNumber waitRow) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_REGS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RSTS_IN", "", rstsIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ASSOC_TERM_IN", "", assocTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRN_IN", "", crnIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("START_DATE_IN", "", startDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("END_DATE_IN", "", endDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SUBJ", "", subj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRSE", "", crse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEC", "", sec, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LEVL", "", levl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRED", "", cred, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GMOD", "", gmod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TITLE", "", title, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MESG", "", mesg, object.class));
//			// cmd.addParameter(DbTypes.getTableType("REG_BTN", "", regBtn, object.class));
//			cmd.addParameter("@REGS_ROW", regsRow);
//			cmd.addParameter("@ADD_ROW", addRow);
//			cmd.addParameter("@WAIT_ROW", waitRow);
//				
//			cmd.execute();
//
//
//		}
//		
		public static void pRegsEnspChk(NNumber pPidm,NNumber pSpSeqNo,NString pTermCode,NBool createSfrensp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_REGS_ENSP_CHK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SP_SEQ_NO", pSpSeqNo);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@CREATE_SFRENSP", createSfrensp);
				
			cmd.execute();


		}
		
		public static void pRegsEtrmChk(NNumber pidmIn,NString termIn,Ref<NString> clasCode,NBool multiTermIn,NBool createSfbetrmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_REGS_ETRM_CHK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CLAS_CODE", clasCode, true);
			cmd.addParameter("@MULTI_TERM_IN", multiTermIn);
			cmd.addParameter("@CREATE_SFBETRM_IN", createSfbetrmIn);
				
			cmd.execute();
			clasCode.val = cmd.getParameterValue("@CLAS_CODE", NString.class);


		}
		
//		public static void pSelmultistudypath(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> assocTermIn,List<OwaUtil.IdentArrRow> selCrn,List<OwaUtil.IdentArrRow> rsts,List<OwaUtil.IdentArrRow> crn,List<OwaUtil.IdentArrRow> startDateIn,List<OwaUtil.IdentArrRow> endDateIn,List<OwaUtil.IdentArrRow> subj,List<OwaUtil.IdentArrRow> crse,List<OwaUtil.IdentArrRow> sec,List<OwaUtil.IdentArrRow> levl,List<OwaUtil.IdentArrRow> cred,List<OwaUtil.IdentArrRow> gmod,List<Varchar2TabtypeRow> title,List<OwaUtil.IdentArrRow> mesg,NNumber regsRow,NNumber addRow,NNumber waitRow,List<OwaUtil.IdentArrRow> addBtn,NString msg,NString callingProcName) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_SELMULTISTUDYPATH", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ASSOC_TERM_IN", "", assocTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_CRN", "", selCrn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RSTS", "", rsts, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRN", "", crn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("START_DATE_IN", "", startDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("END_DATE_IN", "", endDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SUBJ", "", subj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRSE", "", crse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEC", "", sec, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LEVL", "", levl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRED", "", cred, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GMOD", "", gmod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TITLE", "", title, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MESG", "", mesg, object.class));
//			cmd.addParameter("@REGS_ROW", regsRow);
//			cmd.addParameter("@ADD_ROW", addRow);
//			cmd.addParameter("@WAIT_ROW", waitRow);
//			// cmd.addParameter(DbTypes.getTableType("ADD_BTN", "", addBtn, object.class));
//			cmd.addParameter("@MSG", msg);
//			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pSelstudypath(NString termIn,NString callingProcName,NString stPathReq,NString msg,List<OwaUtil.IdentArrRow> pTermIn,List<OwaUtil.IdentArrRow> assocTermIn,List<OwaUtil.IdentArrRow> selCrn,List<OwaUtil.IdentArrRow> rsts,List<OwaUtil.IdentArrRow> crn,List<OwaUtil.IdentArrRow> startDateIn,List<OwaUtil.IdentArrRow> endDateIn,List<OwaUtil.IdentArrRow> subj,List<OwaUtil.IdentArrRow> crse,List<OwaUtil.IdentArrRow> sec,List<OwaUtil.IdentArrRow> levl,List<OwaUtil.IdentArrRow> cred,List<OwaUtil.IdentArrRow> gmod,List<Varchar2TabtypeRow> title,List<OwaUtil.IdentArrRow> mesg,NNumber regsRow,NNumber addRow,NNumber waitRow) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_SELSTUDYPATH", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
//			cmd.addParameter("@ST_PATH_REQ", stPathReq);
//			cmd.addParameter("@MSG", msg);
//			// cmd.addParameter(DbTypes.getTableType("P_TERM_IN", "", pTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ASSOC_TERM_IN", "", assocTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_CRN", "", selCrn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RSTS", "", rsts, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRN", "", crn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("START_DATE_IN", "", startDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("END_DATE_IN", "", endDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SUBJ", "", subj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRSE", "", crse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEC", "", sec, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LEVL", "", levl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRED", "", cred, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GMOD", "", gmod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TITLE", "", title, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MESG", "", mesg, object.class));
//			cmd.addParameter("@REGS_ROW", regsRow);
//			cmd.addParameter("@ADD_ROW", addRow);
//			cmd.addParameter("@WAIT_ROW", waitRow);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pStoremultistudypath(List<OwaUtil.IdentArrRow> pStPath,List<OwaUtil.IdentArrRow> pTermIn,List<OwaUtil.IdentArrRow> pAssocTermIn,List<OwaUtil.IdentArrRow> pSelCrn,List<OwaUtil.IdentArrRow> pRsts,List<OwaUtil.IdentArrRow> pCrn,List<OwaUtil.IdentArrRow> pStartDateIn,List<OwaUtil.IdentArrRow> pEndDateIn,List<OwaUtil.IdentArrRow> pSubj,List<OwaUtil.IdentArrRow> pCrse,List<OwaUtil.IdentArrRow> pSec,List<OwaUtil.IdentArrRow> pLevl,List<OwaUtil.IdentArrRow> pCred,List<OwaUtil.IdentArrRow> pGmod,List<Varchar2TabtypeRow> pTitle,List<OwaUtil.IdentArrRow> pMesg,NNumber pRegsRow,NNumber pAddRow,NNumber pWaitRow,List<OwaUtil.IdentArrRow> pAddBtn,NString callingProcName,List<OwaUtil.IdentArrRow> regBtn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_STOREMULTISTUDYPATH", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_ST_PATH", "", pStPath, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_TERM_IN", "", pTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ASSOC_TERM_IN", "", pAssocTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SEL_CRN", "", pSelCrn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_RSTS", "", pRsts, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CRN", "", pCrn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_START_DATE_IN", "", pStartDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_END_DATE_IN", "", pEndDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SUBJ", "", pSubj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CRSE", "", pCrse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SEC", "", pSec, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_LEVL", "", pLevl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_CRED", "", pCred, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_GMOD", "", pGmod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_TITLE", "", pTitle, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_MESG", "", pMesg, object.class));
//			cmd.addParameter("@P_REGS_ROW", pRegsRow);
//			cmd.addParameter("@P_ADD_ROW", pAddRow);
//			cmd.addParameter("@P_WAIT_ROW", pWaitRow);
//			// cmd.addParameter(DbTypes.getTableType("P_ADD_BTN", "", pAddBtn, object.class));
//			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
//			// cmd.addParameter(DbTypes.getTableType("REG_BTN", "", regBtn, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pStorestudypath(NString stPath,NString callingProcName,NString stPathReq,List<OwaUtil.IdentArrRow> pTermIn,List<OwaUtil.IdentArrRow> assocTermIn,List<OwaUtil.IdentArrRow> selCrn,List<OwaUtil.IdentArrRow> rsts,List<OwaUtil.IdentArrRow> crn,List<OwaUtil.IdentArrRow> startDateIn,List<OwaUtil.IdentArrRow> endDateIn,List<OwaUtil.IdentArrRow> subj,List<OwaUtil.IdentArrRow> crse,List<OwaUtil.IdentArrRow> sec,List<OwaUtil.IdentArrRow> levl,List<OwaUtil.IdentArrRow> cred,List<OwaUtil.IdentArrRow> gmod,List<Varchar2TabtypeRow> title,List<OwaUtil.IdentArrRow> mesg,NNumber regsRow,NNumber addRow,NNumber waitRow) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_STORESTUDYPATH", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ST_PATH", stPath);
//			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
//			cmd.addParameter("@ST_PATH_REQ", stPathReq);
//			// cmd.addParameter(DbTypes.getTableType("P_TERM_IN", "", pTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("ASSOC_TERM_IN", "", assocTermIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEL_CRN", "", selCrn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("RSTS", "", rsts, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRN", "", crn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("START_DATE_IN", "", startDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("END_DATE_IN", "", endDateIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SUBJ", "", subj, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRSE", "", crse, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SEC", "", sec, object.class));
//			// cmd.addParameter(DbTypes.getTableType("LEVL", "", levl, object.class));
//			// cmd.addParameter(DbTypes.getTableType("CRED", "", cred, object.class));
//			// cmd.addParameter(DbTypes.getTableType("GMOD", "", gmod, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TITLE", "", title, object.class));
//			// cmd.addParameter(DbTypes.getTableType("MESG", "", mesg, object.class));
//			cmd.addParameter("@REGS_ROW", regsRow);
//			cmd.addParameter("@ADD_ROW", addRow);
//			cmd.addParameter("@WAIT_ROW", waitRow);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pSummary(NString term,NNumber totCreditHr,NNumber totBillHr,NNumber totCeu,NNumber regsCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCOMS.P_SUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@TOT_CREDIT_HR", totCreditHr);
			cmd.addParameter("@TOT_BILL_HR", totBillHr);
			cmd.addParameter("@TOT_CEU", totCeu);
			cmd.addParameter("@REGS_COUNT", regsCount);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="RstsrowcRecTypRow", dataSourceName="RSTSROWC_REC_TYP")
	public static class RstsrowcRecTypRow
	{
		@DbRecordField(dataSourceName="STVRSTS_CODE")
		public NString StvrstsCode;
		@DbRecordField(dataSourceName="STVRSTS_DESC")
		public NString StvrstsDesc;
		@DbRecordField(dataSourceName="SSRRSTS_USAGE_CUTOFF_PCT_FROM")
		public NNumber SsrrstsUsageCutoffPctFrom;
		@DbRecordField(dataSourceName="SSRRSTS_USAGE_CUTOFF_PCT_TO")
		public NNumber SsrrstsUsageCutoffPctTo;
		@DbRecordField(dataSourceName="SSRRSTS_USAGE_CUTOFF_DUR_FROM")
		public NNumber SsrrstsUsageCutoffDurFrom;
		@DbRecordField(dataSourceName="SSRRSTS_USAGE_CUTOFF_DUR_TO")
		public NNumber SsrrstsUsageCutoffDurTo;
	}

	
	
}
