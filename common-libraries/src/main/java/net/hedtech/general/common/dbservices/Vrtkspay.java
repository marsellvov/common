package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Vrtkspay {
//		public static void pVrBuildBadCcMenu(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_BUILD_BAD_CC_MENU", DbManager.getDataBaseFactory());
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
//		public static void pVrBuildExpirOptions(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_BUILD_EXPIR_OPTIONS", DbManager.getDataBaseFactory());
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
//		public static void pVrBuildPaymentOptions(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_BUILD_PAYMENT_OPTIONS", DbManager.getDataBaseFactory());
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
//		public static void pVrProcessBadAmtOpt(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROCESS_BAD_AMT_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrProcessBadCcOpt(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROCESS_BAD_CC_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrProcessBadCcStatus(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROCESS_BAD_CC_STATUS", DbManager.getDataBaseFactory());
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
//		public static void pVrProcessBadExpdate(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROCESS_BAD_EXPDATE", DbManager.getDataBaseFactory());
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
//		public static void pVrProcessBadExpdateOpt(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROCESS_BAD_EXPDATE_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrProcessCcNumberOpt(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROCESS_CC_NUMBER_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrProcessCcStatus(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString approvalFlagIn,NString authCodeIn,NNumber amountIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROCESS_CC_STATUS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@APPROVAL_FLAG_IN", approvalFlagIn);
//			cmd.addParameter("@AUTH_CODE_IN", authCodeIn);
//			cmd.addParameter("@AMOUNT_IN", amountIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrProcessCcType(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROCESS_CC_TYPE", DbManager.getDataBaseFactory());
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
//		public static void pVrProcessDiffAmountOpt(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROCESS_DIFF_AMOUNT_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrProcessExpDateOpt(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROCESS_EXP_DATE_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrProcessExpirOptions(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROCESS_EXPIR_OPTIONS", DbManager.getDataBaseFactory());
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
//		public static void pVrProcessGoodAmtOpt(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROCESS_GOOD_AMT_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrProcessGoodCcOpt(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROCESS_GOOD_CC_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrProcessMultiCcOpt(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROCESS_MULTI_CC_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrProcessNewAmtOpt(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROCESS_NEW_AMT_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrProcessSingleCcOpt(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROCESS_SINGLE_CC_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrProcessTotalAmtOpt(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROCESS_TOTAL_AMT_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrPromptCcNumber(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROMPT_CC_NUMBER", DbManager.getDataBaseFactory());
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
//		public static void pVrPromptDiffAmt(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROMPT_DIFF_AMT", DbManager.getDataBaseFactory());
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
//		public static void pVrPromptExpDate(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn,NString repromptIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_PROMPT_EXP_DATE", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPTION_NUM_IN", optionNumIn);
//			cmd.addParameter("@REPROMPT_IN", repromptIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
//		
//		public static void pVrVerifyCreditCard(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRTKSPAY.P_VR_VERIFY_CREDIT_CARD", DbManager.getDataBaseFactory());
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
		
	
	
	
}
