package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Vrtksbil {
		public static NNumber fVrCheckAcctReviewMenu(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.F_VR_CHECK_ACCT_REVIEW_MENU", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pFhCredits(NString sessionidIn,NString finaidInstalledIn,NString arIndIn,NString rasgArIndIn,NString masgArIndIn,NString pasgArIndIn,NString chgsAcceptedIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_FH_CREDITS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@FINAID_INSTALLED_IN", finaidInstalledIn);
			cmd.addParameter("@AR_IND_IN", arIndIn);
			cmd.addParameter("@RASG_AR_IND_IN", rasgArIndIn);
			cmd.addParameter("@MASG_AR_IND_IN", masgArIndIn);
			cmd.addParameter("@PASG_AR_IND_IN", pasgArIndIn);
			cmd.addParameter("@CHGS_ACCEPTED_IN", chgsAcceptedIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
//		public static void pVrAcctReviewBalance(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_ACCT_REVIEW_BALANCE", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrBilInfoMenuOpt(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_BIL_INFO_MENU_OPT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPTION_NUM_IN", optionNumIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrBilOptionsMenu(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_BIL_OPTIONS_MENU", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrBuildAcctReviewMenu(NNumber pidmIn,Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,Ref<NNumber> numberRecs,Ref<NNumber> validOptionPos) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_BUILD_ACCT_REVIEW_MENU", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUMBER_RECS", numberRecs, true);
//			cmd.addParameter("@VALID_OPTION_POS", validOptionPos, true);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//			numberRecs.val = cmd.getParameterValue("@NUMBER_RECS", NNumber.class);
//			validOptionPos.val = cmd.getParameterValue("@VALID_OPTION_POS", NNumber.class);
//
//
//		}
//		
//		public static void pVrBuildCcMenu(NNumber pidmIn,NString funcTypeIn,Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,Ref<NNumber> numberRecs,Ref<NNumber> validOptionPos) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_BUILD_CC_MENU", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@FUNC_TYPE_IN", funcTypeIn);
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUMBER_RECS", numberRecs, true);
//			cmd.addParameter("@VALID_OPTION_POS", validOptionPos, true);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//			numberRecs.val = cmd.getParameterValue("@NUMBER_RECS", NNumber.class);
//			validOptionPos.val = cmd.getParameterValue("@VALID_OPTION_POS", NNumber.class);
//
//
//		}
//		
//		public static void pVrBuildStAccountMenu(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_BUILD_ST_ACCOUNT_MENU", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrPmptStBillingOptions(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_PMPT_ST_BILLING_OPTIONS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrProcesNonstuDetOpt(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_PROCES_NONSTU_DET_OPT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPTION_NUM_IN", optionNumIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrProcessBillingOptions(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_PROCESS_BILLING_OPTIONS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPTION_NUM_IN", optionNumIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrProcessDetailOptions(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_PROCESS_DETAIL_OPTIONS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPTION_NUM_IN", optionNumIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrProcessReviewOptions(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_PROCESS_REVIEW_OPTIONS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPTION_NUM_IN", optionNumIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrPromptBillingOptions(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_PROMPT_BILLING_OPTIONS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPTION_NUM_IN", optionNumIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrRevAndSpkAcctMenu(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_REV_AND_SPK_ACCT_MENU", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrRevNonstuChrgAndPmnt(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn,NString loadFlag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_REV_NONSTU_CHRG_AND_PMNT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPTION_NUM_IN", optionNumIn);
//			cmd.addParameter("@LOAD_FLAG", loadFlag);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrReviewChrgsAndPymnts(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn,NString loadFlag,NString repromptIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_REVIEW_CHRGS_AND_PYMNTS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPTION_NUM_IN", optionNumIn);
//			cmd.addParameter("@LOAD_FLAG", loadFlag);
//			cmd.addParameter("@REPROMPT_IN", repromptIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrReviewDetailMenu(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString repromptIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_REVIEW_DETAIL_MENU", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@REPROMPT_IN", repromptIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrReviewInstlPmnt(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_REVIEW_INSTL_PMNT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrReviewMoreChpy(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_REVIEW_MORE_CHPY", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPTION_NUM_IN", optionNumIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrReviewMoreInstl(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_REVIEW_MORE_INSTL", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPTION_NUM_IN", optionNumIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrReviewNonstuBalance(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_REVIEW_NONSTU_BALANCE", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrReviewNonstuDetailMenu(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSBIL.P_VR_REVIEW_NONSTU_DETAIL_MENU", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//	
	
	
}
