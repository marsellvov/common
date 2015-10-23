package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwckregs {
		public static NBool fDeceasedperscheck(Ref<NNumber> sqlErr,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.F_DECEASEDPERSCHECK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SQL_ERR", NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			sqlErr.val = cmd.getParameterValue("@SQL_ERR", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFinalizeAdmindrops(NNumber pidmIn,NString termIn,NString accessIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.F_FINALIZE_ADMINDROPS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@ACCESS_ID_IN", accessIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fGetstuclas() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.F_GETSTUCLAS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fReadmitRequired(NString termIn,NNumber pidmIn,NString termCodeAdmitIn,NString readmReqIn,NBool multiTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.F_READMIT_REQUIRED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_CODE_ADMIT_IN", termCodeAdmitIn);
			cmd.addParameter("@READM_REQ_IN", readmReqIn);
			cmd.addParameter("@MULTI_TERM_IN", multiTermIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fRegistrationAccess(NNumber pidmIn,NString termIn,NString accessIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.F_REGISTRATION_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@ACCESS_ID_IN", accessIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fStuhld(Ref<NNumber> sqlErr,NNumber pidmIn,NDate regsDateIn,NString holdServ,NString holdPass) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.F_STUHLD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SQL_ERR", NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REGS_DATE_IN", regsDateIn);
			cmd.addParameter("@HOLD_SERV", holdServ);
			cmd.addParameter("@HOLD_PASS", holdPass);
				
			cmd.execute();
			sqlErr.val = cmd.getParameterValue("@SQL_ERR", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidacpt(Ref<NNumber> sqlErr,NString ar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.F_VALIDACPT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SQL_ERR", NNumber.class);
			cmd.addParameter("@AR", ar);
				
			cmd.execute();
			sqlErr.val = cmd.getParameterValue("@SQL_ERR", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidappr(Ref<NNumber> sqlErr,NString apprInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.F_VALIDAPPR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SQL_ERR", NNumber.class);
			cmd.addParameter("@APPR_IND", apprInd);
				
			cmd.execute();
			sqlErr.val = cmd.getParameterValue("@SQL_ERR", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidbillhr(Ref<NNumber> sqlErr,NNumber billHr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.F_VALIDBILLHR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SQL_ERR", NNumber.class);
			cmd.addParameter("@BILL_HR", billHr);
				
			cmd.execute();
			sqlErr.val = cmd.getParameterValue("@SQL_ERR", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidcredhr(Ref<NNumber> sqlErr,NNumber credHr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.F_VALIDCREDHR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SQL_ERR", NNumber.class);
			cmd.addParameter("@CRED_HR", credHr);
				
			cmd.execute();
			sqlErr.val = cmd.getParameterValue("@SQL_ERR", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidcrn(Ref<NNumber> sqlErr,NString termIn,NString crn,NString subj,NString crse,NString seq) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.F_VALIDCRN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SQL_ERR", NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@SUBJ", subj);
			cmd.addParameter("@CRSE", crse);
			cmd.addParameter("@SEQ", seq);
				
			cmd.execute();
			sqlErr.val = cmd.getParameterValue("@SQL_ERR", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidenrl(Ref<NNumber> sqlErr,NString termIn,NString ests) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.F_VALIDENRL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SQL_ERR", NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@ESTS", ests);
				
			cmd.execute();
			sqlErr.val = cmd.getParameterValue("@SQL_ERR", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidgmod(Ref<NNumber> sqlErr,NString termIn,NString gmod,NString subj,NString crse,NString sectGmod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.F_VALIDGMOD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SQL_ERR", NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@GMOD", gmod);
			cmd.addParameter("@SUBJ", subj);
			cmd.addParameter("@CRSE", crse);
			cmd.addParameter("@SECT_GMOD", sectGmod);
				
			cmd.execute();
			sqlErr.val = cmd.getParameterValue("@SQL_ERR", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidlevl(Ref<NNumber> sqlErr,NString termIn,NString levl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.F_VALIDLEVL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SQL_ERR", NNumber.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@LEVL", levl);
				
			cmd.execute();
			sqlErr.val = cmd.getParameterValue("@SQL_ERR", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidrgre(Ref<NNumber> sqlErr,NString rgre) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.F_VALIDRGRE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SQL_ERR", NNumber.class);
			cmd.addParameter("@RGRE", rgre);
				
			cmd.execute();
			sqlErr.val = cmd.getParameterValue("@SQL_ERR", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidrsts(Ref<NNumber> sqlErr,NString rsts) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.F_VALIDRSTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SQL_ERR", NNumber.class);
			cmd.addParameter("@RSTS", rsts);
				
			cmd.execute();
			sqlErr.val = cmd.getParameterValue("@SQL_ERR", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pAddcrse() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.P_ADDCRSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pAllcrsechk(NString termIn,NString calledByIn,Ref<NString> cappTechErrorOut,Ref<List<Sfkcurs.DropProblemsRecTabtypeRow>> dropProblemsInOut,Ref<List<Sfkcurs.DropProblemsRecTabtypeRow>> dropFailuresInOut,List<OwaUtil.IdentArrRow> multiTermListIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.P_ALLCRSECHK", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@CALLED_BY_IN", calledByIn);
//			cmd.addParameter("@CAPP_TECH_ERROR_OUT", NString.class);
//			// cmd.addParameter(DbTypes.getTableType("DROP_PROBLEMS_IN_OUT", "", dropProblemsInOut.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("DROP_FAILURES_IN_OUT", "", dropFailuresInOut.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("MULTI_TERM_LIST_IN", "", multiTermListIn, object.class));
//				
//			cmd.execute();
//			cappTechErrorOut.val = cmd.getParameterValue("@CAPP_TECH_ERROR_OUT", NString.class);
//			// dropProblemsInOut.val = cmd.getTableParameterValue("@DROP_PROBLEMS_IN_OUT", object.class);
//			// dropFailuresInOut.val = cmd.getTableParameterValue("@DROP_FAILURES_IN_OUT", object.class);
//
//
//		}
		
		public static void pCalchrs(Ref<NNumber> totCred,Ref<NNumber> totBill,Ref<NNumber> totCeu,NString minHourOverride,NString maxHourOverride) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.P_CALCHRS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TOT_CRED", NNumber.class);
			cmd.addParameter("@TOT_BILL", NNumber.class);
			cmd.addParameter("@TOT_CEU", NNumber.class);
			cmd.addParameter("@MIN_HOUR_OVERRIDE", minHourOverride);
			cmd.addParameter("@MAX_HOUR_OVERRIDE", maxHourOverride);
				
			cmd.execute();
			totCred.val = cmd.getParameterValue("@TOT_CRED", NNumber.class);
			totBill.val = cmd.getParameterValue("@TOT_BILL", NNumber.class);
			totCeu.val = cmd.getParameterValue("@TOT_CEU", NNumber.class);


		}
		
		public static void pCapcchk() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.P_CAPCCHK", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDefstcr(NString addInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.P_DEFSTCR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ADD_IND", addInd);
				
			cmd.execute();


		}
		
		public static void pDropcrse(NString term,NString crn,NString rsts,NString reservedKey,NString recStat,NString subj,NString crse,NString seq,NString delInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.P_DROPCRSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@RSTS", rsts);
			cmd.addParameter("@RESERVED_KEY", reservedKey);
			cmd.addParameter("@REC_STAT", recStat);
			cmd.addParameter("@SUBJ", subj);
			cmd.addParameter("@CRSE", crse);
			cmd.addParameter("@SEQ", seq);
			cmd.addParameter("@DEL_IND", delInd);
				
			cmd.execute();


		}
		
//		public static void pFinalUpdates(List<OwaUtil.IdentArrRow> termIn,List<OwaUtil.IdentArrRow> errTerm,List<OwaUtil.IdentArrRow> errCrn,List<OwaUtil.IdentArrRow> errSubj,List<OwaUtil.IdentArrRow> errCrse,List<OwaUtil.IdentArrRow> errSec,List<OwaUtil.IdentArrRow> errCode,List<OwaUtil.IdentArrRow> errLevl,List<OwaUtil.IdentArrRow> errCred,List<OwaUtil.IdentArrRow> errGmod,NString dropResultLabelIn,List<Sfkcurs.DropProblemsRecTabtypeRow> dropProblemsIn,List<Sfkcurs.DropProblemsRecTabtypeRow> dropFailuresIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.P_FINAL_UPDATES", DbManager.getDataBaseFactory());
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
//			cmd.addParameter("@DROP_RESULT_LABEL_IN", dropResultLabelIn);
//			// cmd.addParameter(DbTypes.getTableType("DROP_PROBLEMS_IN", "", dropProblemsIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DROP_FAILURES_IN", "", dropFailuresIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pGetoverride() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.P_GETOVERRIDE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetsection(NString termIn,NString crn,Ref<NString> subj,Ref<NString> crse,Ref<NString> seq) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.P_GETSECTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@SUBJ", NString.class);
			cmd.addParameter("@CRSE", NString.class);
			cmd.addParameter("@SEQ", NString.class);
				
			cmd.execute();
			subj.val = cmd.getParameterValue("@SUBJ", NString.class);
			crse.val = cmd.getParameterValue("@CRSE", NString.class);
			seq.val = cmd.getParameterValue("@SEQ", NString.class);


		}
		
		public static void pInitFinalUpdateVars(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.P_INIT_FINAL_UPDATE_VARS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		
		
		public static void pRegschk() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.P_REGSCHK", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pRegsfees() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.P_REGSFEES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pStatuschg() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.P_STATUSCHG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdcrse() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKREGS.P_UPDCRSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
