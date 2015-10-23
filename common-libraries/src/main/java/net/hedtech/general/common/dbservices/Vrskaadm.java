package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Vrskaadm {
//		public static void pVrAdmApptOperOpt(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_ADM_APPT_OPER_OPT", DbManager.getDataBaseFactory());
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
//		
//		public static void pVrAdmInfoOption(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_ADM_INFO_OPTION", DbManager.getDataBaseFactory());
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
//		
//		public static void pVrAdmMaterialsOption(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_ADM_MATERIALS_OPTION", DbManager.getDataBaseFactory());
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
//		
//		public static void pVrAdmOrientationOpt(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_ADM_ORIENTATION_OPT", DbManager.getDataBaseFactory());
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
//		
//		public static void pVrAdmRequestOption(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_ADM_REQUEST_OPTION", DbManager.getDataBaseFactory());
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
//		
//		public static void pVrBuildMissingReq(Ref<List<Goktabs.CharTabTypeRow>> vrAdmnRecs,Ref<NNumber> numberRecs,NNumber tableRow,List<Soktabs.SarchklTabTypeRow> sarchklRowTable) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_BUILD_MISSING_REQ", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_ADMN_RECS", "", vrAdmnRecs.val, object.class , true));
//			cmd.addParameter("@NUMBER_RECS", numberRecs, true);
//			cmd.addParameter("@TABLE_ROW", tableRow);
//			// cmd.addParameter(DbTypes.getTableType("SARCHKL_ROW_TABLE", "", sarchklRowTable, object.class));
//				
//			cmd.execute();
//			// vrAdmnRecs.val = cmd.getTableParameterValue("@VR_ADMN_RECS", object.class);
//			numberRecs.val = cmd.getParameterValue("@NUMBER_RECS", NNumber.class);
//
//
//		}
		
		public static void pVrGetAnyVrMsgNo(NString anyCodeIn,NString anyTableIn,Ref<NNumber> anyVrnoInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_GET_ANY_VR_MSG_NO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ANY_CODE_IN", anyCodeIn);
			cmd.addParameter("@ANY_TABLE_IN", anyTableIn);
			cmd.addParameter("@ANY_VRNO_IN_OUT", anyVrnoInOut, true);
				
			cmd.execute();
			anyVrnoInOut.val = cmd.getParameterValue("@ANY_VRNO_IN_OUT", NNumber.class);


		}
		
//		public static void pVrGiveDecision(Ref<List<Goktabs.CharTabTypeRow>> vrAdmnRecs,Ref<NNumber> numberRecs,NString functionName,Ref<NString> processName,NNumber numberRecsPos,Ref<NNumber> validOptionPos,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NNumber pidmIn,NString termCodeIn,NNumber applNoIn,List<Soktabs.StvlevlTabTypeRow> stvlevlRowTable) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_GIVE_DECISION", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_ADMN_RECS", "", vrAdmnRecs.val, object.class , true));
//			cmd.addParameter("@NUMBER_RECS", numberRecs, true);
//			cmd.addParameter("@FUNCTION_NAME", functionName);
//			cmd.addParameter("@PROCESS_NAME", processName, true);
//			cmd.addParameter("@NUMBER_RECS_POS", numberRecsPos);
//			cmd.addParameter("@VALID_OPTION_POS", validOptionPos, true);
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
//			cmd.addParameter("@APPL_NO_IN", applNoIn);
//			// cmd.addParameter(DbTypes.getTableType("STVLEVL_ROW_TABLE", "", stvlevlRowTable, object.class));
//				
//			cmd.execute();
//			// vrAdmnRecs.val = cmd.getTableParameterValue("@VR_ADMN_RECS", object.class);
//			numberRecs.val = cmd.getParameterValue("@NUMBER_RECS", NNumber.class);
//			processName.val = cmd.getParameterValue("@PROCESS_NAME", NString.class);
//			validOptionPos.val = cmd.getParameterValue("@VALID_OPTION_POS", NNumber.class);
//
//
//		}
//		
//		public static void pVrGiveStatus(Ref<List<Goktabs.CharTabTypeRow>> vrAdmnRecs,NNumber pidmIn,NString termCodeIn,NNumber rowCntInOut,List<Soktabs.StvlevlTabTypeRow> stvlevlRowTable,List<Soktabs.StvdegcTabTypeRow> stvdegcRowTable,List<Soktabs.StvcollTabTypeRow> stvcollRowTable,List<Soktabs.StvdeptTabTypeRow> stvdeptRowTable,List<Soktabs.StvmajrTabTypeRow> stvmajrRowTable,List<Soktabs.StvapstTabTypeRow> stvapstRowTable,List<Soktabs.SaradapTabTypeRow> saradapRowTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_GIVE_STATUS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_ADMN_RECS", "", vrAdmnRecs.val, object.class , true));
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
//			cmd.addParameter("@ROW_CNT_IN_OUT", rowCntInOut);
//			// cmd.addParameter(DbTypes.getTableType("STVLEVL_ROW_TABLE", "", stvlevlRowTable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("STVDEGC_ROW_TABLE", "", stvdegcRowTable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("STVCOLL_ROW_TABLE", "", stvcollRowTable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("STVDEPT_ROW_TABLE", "", stvdeptRowTable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("STVMAJR_ROW_TABLE", "", stvmajrRowTable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("STVAPST_ROW_TABLE", "", stvapstRowTable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SARADAP_ROW_TABLE", "", saradapRowTable, object.class));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrAdmnRecs.val = cmd.getTableParameterValue("@VR_ADMN_RECS", object.class);
//
//
//		}
//		
//		public static void pVrNoApplication(Ref<List<Goktabs.CharTabTypeRow>> vrAdmnRecs,NString termCodeIn,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_NO_APPLICATION", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_ADMN_RECS", "", vrAdmnRecs.val, object.class , true));
//			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrAdmnRecs.val = cmd.getTableParameterValue("@VR_ADMN_RECS", object.class);
//
//
//		}
//		
//		public static void pVrProcStAdmAppl(Ref<List<Goktabs.CharTabTypeRow>> vrAdmnRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_PROC_ST_ADM_APPL", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_ADMN_RECS", "", vrAdmnRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPTION_IN", optionIn);
//				
//			cmd.execute();
//			// vrAdmnRecs.val = cmd.getTableParameterValue("@VR_ADMN_RECS", object.class);
//
//
//		}
//		
//		public static void pVrProcessAdmAppl(Ref<List<Goktabs.CharTabTypeRow>> vrAdmnRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_PROCESS_ADM_APPL", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_ADMN_RECS", "", vrAdmnRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPTION_NUM_IN", optionNumIn);
//				
//			cmd.execute();
//			// vrAdmnRecs.val = cmd.getTableParameterValue("@VR_ADMN_RECS", object.class);
//
//
//		}
//		
//		public static void pVrProcessAdmApplOpt(Ref<List<Goktabs.CharTabTypeRow>> vrAdmnRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_PROCESS_ADM_APPL_OPT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_ADMN_RECS", "", vrAdmnRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPTION_IN", optionIn);
//				
//			cmd.execute();
//			// vrAdmnRecs.val = cmd.getTableParameterValue("@VR_ADMN_RECS", object.class);
//
//
//		}
//		
//		public static void pVrProcessAnotherAppl(Ref<List<Goktabs.CharTabTypeRow>> vrAdmnRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_PROCESS_ANOTHER_APPL", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_ADMN_RECS", "", vrAdmnRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPTION_NUM_IN", optionNumIn);
//				
//			cmd.execute();
//			// vrAdmnRecs.val = cmd.getTableParameterValue("@VR_ADMN_RECS", object.class);
//
//
//		}
//		
//		public static void pVrProcessMissingReqmnts(Ref<List<Goktabs.CharTabTypeRow>> vrAdmnRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn,NString loadFlag) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_PROCESS_MISSING_REQMNTS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_ADMN_RECS", "", vrAdmnRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPTION_NUM_IN", optionNumIn);
//			cmd.addParameter("@LOAD_FLAG", loadFlag);
//				
//			cmd.execute();
//			// vrAdmnRecs.val = cmd.getTableParameterValue("@VR_ADMN_RECS", object.class);
//
//
//		}
//		
//		public static void pVrProcessMoreReq(Ref<List<Goktabs.CharTabTypeRow>> vrAdmnRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_PROCESS_MORE_REQ", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_ADMN_RECS", "", vrAdmnRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPTION_NUM_IN", optionNumIn);
//				
//			cmd.execute();
//			// vrAdmnRecs.val = cmd.getTableParameterValue("@VR_ADMN_RECS", object.class);
//
//
//		}
//		
//		public static void pVrPromptAnotherAppl(Ref<List<Goktabs.CharTabTypeRow>> vrAdmnRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_PROMPT_ANOTHER_APPL", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_ADMN_RECS", "", vrAdmnRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrAdmnRecs.val = cmd.getTableParameterValue("@VR_ADMN_RECS", object.class);
//
//
//		}
//		
//		public static void pVrPromptMissingReqmnts(Ref<List<Goktabs.CharTabTypeRow>> vrAdmnRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_PROMPT_MISSING_REQMNTS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_ADMN_RECS", "", vrAdmnRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrAdmnRecs.val = cmd.getTableParameterValue("@VR_ADMN_RECS", object.class);
//
//
//		}
//		
//		public static void pVrPromptMoreReqmnts(Ref<List<Goktabs.CharTabTypeRow>> vrAdmnRecs,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_PROMPT_MORE_REQMNTS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_ADMN_RECS", "", vrAdmnRecs.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrAdmnRecs.val = cmd.getTableParameterValue("@VR_ADMN_RECS", object.class);
//
//
//		}
//		
//		public static void pVrSelectAnotherAppl(Ref<List<Goktabs.CharTabTypeRow>> vrAdmnRecs,Ref<NNumber> numberRecs,Ref<NNumber> validOptionPos,NString procName,Ref<NString> nextStep,NString termCodeIn,NNumber pidmIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_SELECT_ANOTHER_APPL", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_ADMN_RECS", "", vrAdmnRecs.val, object.class , true));
//			cmd.addParameter("@NUMBER_RECS", numberRecs, true);
//			cmd.addParameter("@VALID_OPTION_POS", validOptionPos, true);
//			cmd.addParameter("@PROC_NAME", procName);
//			cmd.addParameter("@NEXT_STEP", nextStep, true);
//			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
//			cmd.addParameter("@PIDM_IN", pidmIn);
//				
//			cmd.execute();
//			// vrAdmnRecs.val = cmd.getTableParameterValue("@VR_ADMN_RECS", object.class);
//			numberRecs.val = cmd.getParameterValue("@NUMBER_RECS", NNumber.class);
//			validOptionPos.val = cmd.getParameterValue("@VALID_OPTION_POS", NNumber.class);
//			nextStep.val = cmd.getParameterValue("@NEXT_STEP", NString.class);
//
//
//		}
		
//		public static void pVrSelectApplication(Ref<List<Goktabs.CharTabTypeRow>> vrAdmnRecs,NNumber pidmIn,NString termCodeIn,NNumber rowCntInOut,List<Soktabs.StvlevlTabTypeRow> stvlevlRowTable,List<Soktabs.StvdegcTabTypeRow> stvdegcRowTable,List<Soktabs.StvcollTabTypeRow> stvcollRowTable,List<Soktabs.StvdeptTabTypeRow> stvdeptRowTable,List<Soktabs.StvmajrTabTypeRow> stvmajrRowTable,List<Soktabs.StvapstTabTypeRow> stvapstRowTable,List<Soktabs.SaradapTabTypeRow> saradapRowTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKAADM.P_VR_SELECT_APPLICATION", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_ADMN_RECS", "", vrAdmnRecs.val, object.class , true));
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
//			cmd.addParameter("@ROW_CNT_IN_OUT", rowCntInOut);
//			// cmd.addParameter(DbTypes.getTableType("STVLEVL_ROW_TABLE", "", stvlevlRowTable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("STVDEGC_ROW_TABLE", "", stvdegcRowTable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("STVCOLL_ROW_TABLE", "", stvcollRowTable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("STVDEPT_ROW_TABLE", "", stvdeptRowTable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("STVMAJR_ROW_TABLE", "", stvmajrRowTable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("STVAPST_ROW_TABLE", "", stvapstRowTable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SARADAP_ROW_TABLE", "", saradapRowTable, object.class));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrAdmnRecs.val = cmd.getTableParameterValue("@VR_ADMN_RECS", object.class);
//
//
//		}
//		
	
	
	
}
