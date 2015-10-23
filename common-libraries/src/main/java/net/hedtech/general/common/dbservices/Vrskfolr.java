package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Vrskfolr {
		public static NDate fVerifyDateEntry(NString optionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKFOLR.F_VERIFY_DATE_ENTRY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@OPTION_IN", optionIn);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
//		public static void pVrBypassTermChecks(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKFOLR.P_VR_BYPASS_TERM_CHECKS", DbManager.getDataBaseFactory());
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
//		public static void pVrCrnList(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKFOLR.P_VR_CRN_LIST", DbManager.getDataBaseFactory());
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
//		public static void pVrCrnListMultiOpt(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKFOLR.P_VR_CRN_LIST_MULTI_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrCrnListOpt(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKFOLR.P_VR_CRN_LIST_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrRegApplMenuOptCont(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKFOLR.P_VR_REG_APPL_MENU_OPT_CONT", DbManager.getDataBaseFactory());
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
//		
//		public static void pVrRegTermDates(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NNumber pidmIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKFOLR.P_VR_REG_TERM_DATES", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@PIDM_IN", pidmIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
//		
//		public static void pVrRegTermEligible(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKFOLR.P_VR_REG_TERM_ELIGIBLE", DbManager.getDataBaseFactory());
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
//		
//		public static void pVrSchedDayOpt(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKFOLR.P_VR_SCHED_DAY_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrStartDateOpt(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKFOLR.P_VR_START_DATE_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrVerifyDrop(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKFOLR.P_VR_VERIFY_DROP", DbManager.getDataBaseFactory());
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
//		
//		public static void pVrVerifyStartDateOpt(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKFOLR.P_VR_VERIFY_START_DATE_OPT", DbManager.getDataBaseFactory());
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
		
	
	
	
}
