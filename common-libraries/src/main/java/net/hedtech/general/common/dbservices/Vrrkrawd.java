package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Vrrkrawd {
//		public static void pVrAwMultiOpt(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRRKRAWD.P_VR_AW_MULTI_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrAwSingleOpt(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRRKRAWD.P_VR_AW_SINGLE_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrBuildAwards(Ref<NString> vrMsgInOut,NNumber reqCount,Ref<List<Roktabs.RtvawstTabTypeRow>> rtvawstTable,Ref<List<Roktabs.RfrbaseTabTypeRow>> rfrbaseTable,Ref<List<Roktabs.RprawrdTabTypeRow>> rprawrdTable) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRRKRAWD.P_VR_BUILD_AWARDS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@VR_MSG_IN_OUT", vrMsgInOut, true);
//			cmd.addParameter("@REQ_COUNT", reqCount);
//			// cmd.addParameter(DbTypes.getTableType("RTVAWST_TABLE", "", rtvawstTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("RFRBASE_TABLE", "", rfrbaseTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("RPRAWRD_TABLE", "", rprawrdTable.val, object.class , true));
//				
//			cmd.execute();
//			vrMsgInOut.val = cmd.getParameterValue("@VR_MSG_IN_OUT", NString.class);
//			// rtvawstTable.val = cmd.getTableParameterValue("@RTVAWST_TABLE", object.class);
//			// rfrbaseTable.val = cmd.getTableParameterValue("@RFRBASE_TABLE", object.class);
//			// rprawrdTable.val = cmd.getTableParameterValue("@RPRAWRD_TABLE", object.class);
//
//
//		}
//		
//		public static void pVrGetApplStatus(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NNumber pidmIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRRKRAWD.P_VR_GET_APPL_STATUS", DbManager.getDataBaseFactory());
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
//		public static void pVrGetOfferInfo(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NNumber pidmIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRRKRAWD.P_VR_GET_OFFER_INFO", DbManager.getDataBaseFactory());
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
//		public static void pVrListAwards(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString compositeFlagIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRRKRAWD.P_VR_LIST_AWARDS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@COMPOSITE_FLAG_IN", compositeFlagIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
//		
//		public static void pVrListMoreAwards(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRRKRAWD.P_VR_LIST_MORE_AWARDS", DbManager.getDataBaseFactory());
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
//		public static void pVrProcessOfferOpt(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRRKRAWD.P_VR_PROCESS_OFFER_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrProcessOptions(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn,NNumber pidmIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRRKRAWD.P_VR_PROCESS_OPTIONS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPTION_IN", optionIn);
//			cmd.addParameter("@PIDM_IN", pidmIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
		
	
	
	
}
