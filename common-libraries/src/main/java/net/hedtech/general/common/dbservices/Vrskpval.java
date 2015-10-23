package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Vrskpval {
//		public static void pVrChangePin(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKPVAL.P_VR_CHANGE_PIN", DbManager.getDataBaseFactory());
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
//		public static void pVrChangePinOpt(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKPVAL.P_VR_CHANGE_PIN_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrCheckHolds(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString termIn,NNumber pidmIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKPVAL.P_VR_CHECK_HOLDS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@PIDM_IN", pidmIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
//		
//		public static void pVrHoldOperOpt(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optionIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKPVAL.P_VR_HOLD_OPER_OPT", DbManager.getDataBaseFactory());
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
//		public static void pVrValidateAltPin(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString altPinIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKPVAL.P_VR_VALIDATE_ALT_PIN", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@ALT_PIN_IN", altPinIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
//		
//		public static void pVrValidateBirthDate(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString birthDateIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKPVAL.P_VR_VALIDATE_BIRTH_DATE", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@BIRTH_DATE_IN", birthDateIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
//		
//		public static void pVrValidateId(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString ivrIdIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKPVAL.P_VR_VALIDATE_ID", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@IVR_ID_IN", ivrIdIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
//		
//		public static void pVrValidateNewpin(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString pinIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKPVAL.P_VR_VALIDATE_NEWPIN", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@PIN_IN", pinIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
//		
//		public static void pVrValidatePin(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString pinIn,NString pinTypeIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKPVAL.P_VR_VALIDATE_PIN", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@PIN_IN", pinIn);
//			cmd.addParameter("@PIN_TYPE_IN", pinTypeIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
//		
//		public static void pVrValidateVerpin(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString pinIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRSKPVAL.P_VR_VALIDATE_VERPIN", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@PIN_IN", pinIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
//		
	
	
	
}
