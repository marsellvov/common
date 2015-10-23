package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Vrgkoctl {
		public static NString fVrGetNextTrans(NString pkgIn,NString processIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOCTL.F_VR_GET_NEXT_TRANS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PKG_IN", pkgIn);
			cmd.addParameter("@PROCESS_IN", processIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void pVrApplyCcPayment(Ref<List<Goktabs.CharTabTypeRow>> vrBillRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString endCallIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOCTL.P_VR_APPLY_CC_PAYMENT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_BILL_RECS", "", vrBillRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@END_CALL_IN", endCallIn);
//				
//			cmd.execute();
//			// vrBillRecs.val = cmd.getTableParameterValue("@VR_BILL_RECS", object.class);
//
//
//		}
		
//		public static void pVrAssessFees(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString funcTypeIn,NString termIn,NNumber pidmIn,NString choiceIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOCTL.P_VR_ASSESS_FEES", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@FUNC_TYPE_IN", funcTypeIn);
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@CHOICE_IN", choiceIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
		
//		public static void pVrEndCall(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOCTL.P_VR_END_CALL", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
		
//		public static void pVrEndInfcTable(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,Ref<NNumber> numRecsIn,NNumber nrecPosIn,NNumber optPosIn,NString nextStepIn,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString ccOperIn,NNumber tctlNumIn,NString locProcIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOCTL.P_VR_END_INFC_TABLE", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_RECS_IN", numRecsIn, true);
//			cmd.addParameter("@NREC_POS_IN", nrecPosIn);
//			cmd.addParameter("@OPT_POS_IN", optPosIn);
//			cmd.addParameter("@NEXT_STEP_IN", nextStepIn);
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@CC_OPER_IN", ccOperIn);
//			cmd.addParameter("@TCTL_NUM_IN", tctlNumIn);
//			cmd.addParameter("@LOC_PROC_IN", locProcIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//			numRecsIn.val = cmd.getParameterValue("@NUM_RECS_IN", NNumber.class);
//
//
//		}
		
//		public static void pVrException(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NString nextStepIn,NString msgIn,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOCTL.P_VR_EXCEPTION", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NEXT_STEP_IN", nextStepIn);
//			cmd.addParameter("@MSG_IN", msgIn);
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
		
//		public static void pVrGetAidyDates(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString dlnIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOCTL.P_VR_GET_AIDY_DATES", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@DLN_IN", dlnIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
		
//		public static void pVrGetBillingDeadlnDates(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOCTL.P_VR_GET_BILLING_DEADLN_DATES", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
		
//		public static void pVrGetMenu(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString menuFlagIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOCTL.P_VR_GET_MENU", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@MENU_FLAG_IN", menuFlagIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
		
//		public static void pVrGetTermDates(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString termIn,NNumber pidmIn,NString dataTypeIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOCTL.P_VR_GET_TERM_DATES", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@DATA_TYPE_IN", dataTypeIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
		
//		public static void pVrInitInfcTable(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,Ref<NNumber> numRecsInOut,Ref<NNumber> nrecPosInOut,Ref<NNumber> optPosInOut,NString functionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOCTL.P_VR_INIT_INFC_TABLE", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_RECS_IN_OUT", numRecsInOut, true);
//			cmd.addParameter("@NREC_POS_IN_OUT", nrecPosInOut, true);
//			cmd.addParameter("@OPT_POS_IN_OUT", optPosInOut, true);
//			cmd.addParameter("@FUNCTION_IN", functionIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//			numRecsInOut.val = cmd.getParameterValue("@NUM_RECS_IN_OUT", NNumber.class);
//			nrecPosInOut.val = cmd.getParameterValue("@NREC_POS_IN_OUT", NNumber.class);
//			optPosInOut.val = cmd.getParameterValue("@OPT_POS_IN_OUT", NNumber.class);
//
//
//		}
		
//		public static void pVrMainMenu(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOCTL.P_VR_MAIN_MENU", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
//		
//		public static void pVrMainMenuReturn(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NNumber pidmIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOCTL.P_VR_MAIN_MENU_RETURN", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@PIDM_IN", pidmIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
//		
//		public static void pVrMaxTriesExceeded(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString nextStepIn,NString vrMsgIn,NString operFuncIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOCTL.P_VR_MAX_TRIES_EXCEEDED", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@NEXT_STEP_IN", nextStepIn);
//			cmd.addParameter("@VR_MSG_IN", vrMsgIn);
//			cmd.addParameter("@OPER_FUNC_IN", operFuncIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
		
//		public static void pVrMenuOption(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOCTL.P_VR_MENU_OPTION", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPTION_IN", optionIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
		
//		public static void pVrMifMenu(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NString numTriesIn,NString lastOptionIn,NString tempDummy,NString entityDummy,NString choiceIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOCTL.P_VR_MIF_MENU", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@LAST_OPTION_IN", lastOptionIn);
//			cmd.addParameter("@TEMP_DUMMY", tempDummy);
//			cmd.addParameter("@ENTITY_DUMMY", entityDummy);
//			cmd.addParameter("@CHOICE_IN", choiceIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
//		
//		public static void pVrRebuildCurrentMenu(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString ctrlTypeIn,NString menuTypeIn,NString funcTypeIn,NString nextStepIn,NString useOperIn,NString messageIn,NNumber pidmIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOCTL.P_VR_REBUILD_CURRENT_MENU", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@CTRL_TYPE_IN", ctrlTypeIn);
//			cmd.addParameter("@MENU_TYPE_IN", menuTypeIn);
//			cmd.addParameter("@FUNC_TYPE_IN", funcTypeIn);
//			cmd.addParameter("@NEXT_STEP_IN", nextStepIn);
//			cmd.addParameter("@USE_OPER_IN", useOperIn);
//			cmd.addParameter("@MESSAGE_IN", messageIn);
//			cmd.addParameter("@PIDM_IN", pidmIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
		
//		public static void pVrSystemProblem(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRGKOCTL.P_VR_SYSTEM_PROBLEM", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
		
	
	
	
}
