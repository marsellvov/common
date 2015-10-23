package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwcklibs {
		public static NString fConfidstudinfoL(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.F_CONFIDSTUDINFO_L", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fConnectedCrnMessage(NString pRmsgCde,NString messageIn,NString connectedCrnsIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.F_CONNECTED_CRN_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_RMSG_CDE", pRmsgCde);
			cmd.addParameter("@MESSAGE_IN", messageIn);
			cmd.addParameter("@CONNECTED_CRNS_IN", connectedCrnsIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fConnectedCrns(NNumber pidmIn,NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.F_CONNECTED_CRNS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCourseTitle(NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.F_COURSE_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fGetSfraregStartDate(NNumber pidmIn,NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.F_GET_SFRAREG_START_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fGetgtvsdaxrule(NString sdaxInternalCode,NString sdaxInternalCodeGroup) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.F_GETGTVSDAXRULE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SDAX_INTERNAL_CODE", sdaxInternalCode);
			cmd.addParameter("@SDAX_INTERNAL_CODE_GROUP", sdaxInternalCodeGroup);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetholdpass() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.F_GETHOLDPASS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetid() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.F_GETID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetpidm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.F_GETPIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NDate fGetregdate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.F_GETREGDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fGetsamsys() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.F_GETSAMSYS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void fGetsobterm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.F_GETSOBTERM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fGetterm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.F_GETTERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fOlrDate(NString termIn,NString crnIn,NDate dateIn,NString dateTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.F_OLR_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@DATE_IN", dateIn);
			cmd.addParameter("@DATE_TYPE_IN", dateTypeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NBool fOpenLearningCourse(NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.F_OPEN_LEARNING_COURSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber fPidmToGenpidm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.F_PIDM_TO_GENPIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fTermDesc(NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.F_TERM_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fValidterm(Ref<NNumber> sqlErr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.F_VALIDTERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SQL_ERR", NNumber.class);
				
			cmd.execute();
			sqlErr.val = cmd.getParameterValue("@SQL_ERR", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pAddSfbetrm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_ADD_SFBETRM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pAddSfrbtch() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_ADD_SFRBTCH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pAddSfrthst() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_ADD_SFRTHST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pAddSftregs() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_ADD_SFTREGS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pAddTbrcbrq() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_ADD_TBRCBRQ", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pBuildDropProblemsList(NNumber pidmIn,NString termIn,Ref<List<Sfkcurs.DropProblemsRecTabtypeRow>> dropProblemsInOut,Ref<List<Sfkcurs.DropProblemsRecTabtypeRow>> dropFailuresInOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_BUILD_DROP_PROBLEMS_LIST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@TERM_IN", termIn);
//			// cmd.addParameter(DbTypes.getTableType("DROP_PROBLEMS_IN_OUT", "", dropProblemsInOut.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("DROP_FAILURES_IN_OUT", "", dropFailuresInOut.val, object.class , true));
//				
//			cmd.execute();
//			// dropProblemsInOut.val = cmd.getTableParameterValue("@DROP_PROBLEMS_IN_OUT", object.class);
//			// dropFailuresInOut.val = cmd.getTableParameterValue("@DROP_FAILURES_IN_OUT", object.class);
//
//
//		}
		
		public static void pConfidstudinfo(NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_CONFIDSTUDINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
//		public static void pConfirmDrops(NNumber pidmIn,List<OwaUtil.IdentArrRow> termIn,List<Sfkcurs.DropProblemsRecTabtypeRow> dropProblemsIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_CONFIRM_DROPS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DROP_PROBLEMS_IN", "", dropProblemsIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pDelSfrbtch() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_DEL_SFRBTCH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDelSftregs(NNumber pidmIn,NString term,NString crn,NString rsts,NString recStat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_DEL_SFTREGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@RSTS", rsts);
			cmd.addParameter("@REC_STAT", recStat);
				
			cmd.execute();


		}
		
		public static void pDelTbrcbrq() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_DEL_TBRCBRQ", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetDropHours(NNumber pidmIn,NString termIn,NString crnIn,NString dropCodeIn,Ref<NNumber> creditHrOut,Ref<NNumber> creditHrHoldOut,Ref<NNumber> billHrOut,Ref<NNumber> billHrHoldOut,Ref<NNumber> waivHrOut,Ref<NString> grdeCodeOut,Ref<NString> errorFlagOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_GET_DROP_HOURS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@DROP_CODE_IN", dropCodeIn);
			cmd.addParameter("@CREDIT_HR_OUT", NNumber.class);
			cmd.addParameter("@CREDIT_HR_HOLD_OUT", NNumber.class);
			cmd.addParameter("@BILL_HR_OUT", NNumber.class);
			cmd.addParameter("@BILL_HR_HOLD_OUT", NNumber.class);
			cmd.addParameter("@WAIV_HR_OUT", NNumber.class);
			cmd.addParameter("@GRDE_CODE_OUT", NString.class);
			cmd.addParameter("@ERROR_FLAG_OUT", NString.class);
				
			cmd.execute();
			creditHrOut.val = cmd.getParameterValue("@CREDIT_HR_OUT", NNumber.class);
			creditHrHoldOut.val = cmd.getParameterValue("@CREDIT_HR_HOLD_OUT", NNumber.class);
			billHrOut.val = cmd.getParameterValue("@BILL_HR_OUT", NNumber.class);
			billHrHoldOut.val = cmd.getParameterValue("@BILL_HR_HOLD_OUT", NNumber.class);
			waivHrOut.val = cmd.getParameterValue("@WAIV_HR_OUT", NNumber.class);
			grdeCodeOut.val = cmd.getParameterValue("@GRDE_CODE_OUT", NString.class);
			errorFlagOut.val = cmd.getParameterValue("@ERROR_FLAG_OUT", NString.class);


		}
		
		public static void pGetDropcode(NString termIn,NString crnIn,NString ptrmCodeIn,NDate startDateIn,NDate completionDateIn,NDate rstsDateIn,NString duntCodeIn,Ref<NString> dropCodeOut,Ref<NNumber> numberOfDropcodesOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_GET_DROPCODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PTRM_CODE_IN", ptrmCodeIn);
			cmd.addParameter("@START_DATE_IN", startDateIn);
			cmd.addParameter("@COMPLETION_DATE_IN", completionDateIn);
			cmd.addParameter("@RSTS_DATE_IN", rstsDateIn);
			cmd.addParameter("@DUNT_CODE_IN", duntCodeIn);
			cmd.addParameter("@DROP_CODE_OUT", NString.class);
			cmd.addParameter("@NUMBER_OF_DROPCODES_OUT", NNumber.class);
				
			cmd.execute();
			dropCodeOut.val = cmd.getParameterValue("@DROP_CODE_OUT", NString.class);
			numberOfDropcodesOut.val = cmd.getParameterValue("@NUMBER_OF_DROPCODES_OUT", NNumber.class);


		}
		
		public static void pGetsobterm(NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_GETSOBTERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();


		}
		
		public static void pHandleSftregsError() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_HANDLE_SFTREGS_ERROR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInitvalue(NNumber pidmIn,NString termIn,NString idIn,NDate regsDateIn,NString holdPasswdIn,NString samsysIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_INITVALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@ID_IN", idIn);
			cmd.addParameter("@REGS_DATE_IN", regsDateIn);
			cmd.addParameter("@HOLD_PASSWD_IN", holdPasswdIn);
			cmd.addParameter("@SAMSYS_IN", samsysIn);
				
			cmd.execute();


		}
		
//		public static void pResetDrops(NNumber pidmIn,List<Sfkcurs.DropProblemsRecTabtypeRow> dropProblemsIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_RESET_DROPS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			// cmd.addParameter(DbTypes.getTableType("DROP_PROBLEMS_IN", "", dropProblemsIn, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pResetFailures(NNumber pidmIn,List<Sfkcurs.DropProblemsRecTabtypeRow> dropFailuresIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_RESET_FAILURES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			// cmd.addParameter(DbTypes.getTableType("DROP_FAILURES_IN", "", dropFailuresIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pStoreterm(NString termIn,NString nameVar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_STORETERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@NAME_VAR", nameVar);
				
			cmd.execute();


		}
		
		public static void pUpdSfbetrm() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_UPD_SFBETRM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdSftregs() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_UPD_SFTREGS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateToDrop(NNumber pidmIn,NString termIn,NString crnIn,NString dropCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_UPDATE_TO_DROP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@DROP_CODE_IN", dropCodeIn);
				
			cmd.execute();


		}
		
		public static void pUpdvardataSftregs() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKLIBS.P_UPDVARDATA_SFTREGS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
