package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Vrhkgrds {
//		public static void pVrCheckGrades(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRHKGRDS.P_VR_CHECK_GRADES", DbManager.getDataBaseFactory());
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
		
//		public static void pVrEndGrades(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRHKGRDS.P_VR_END_GRADES", DbManager.getDataBaseFactory());
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
		
//		public static void pVrGenGrdeInfo(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRHKGRDS.P_VR_GEN_GRDE_INFO", DbManager.getDataBaseFactory());
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
		
//		public static void pVrGetProgressData(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,Ref<NNumber> numRecs,Ref<NString> term,NNumber grdCnt2,NNumber grdCnt,NNumber numTriesIn,List<Soktabs.SfrstcrTabTypeRow> sfrstcrTable,List<Soktabs.SsbsectTabTypeRow> ssbsectTable,List<Soktabs.StvsubjTabTypeRow> stvsubjTable,List<Soktabs.ShrtcknTabTypeRow> shrtcknTable,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRHKGRDS.P_VR_GET_PROGRESS_DATA", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_RECS", numRecs, true);
//			cmd.addParameter("@TERM", term, true);
//			cmd.addParameter("@GRD_CNT2", grdCnt2);
//			cmd.addParameter("@GRD_CNT", grdCnt);
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			// cmd.addParameter(DbTypes.getTableType("SFRSTCR_TABLE", "", sfrstcrTable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SSBSECT_TABLE", "", ssbsectTable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("STVSUBJ_TABLE", "", stvsubjTable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SHRTCKN_TABLE", "", shrtcknTable, object.class));
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//			numRecs.val = cmd.getParameterValue("@NUM_RECS", NNumber.class);
//			term.val = cmd.getParameterValue("@TERM", NString.class);
//
//
//		}
		
//		public static void pVrGrdeInfoOpt(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRHKGRDS.P_VR_GRDE_INFO_OPT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPT_NUM_IN", optNumIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
		
//		public static void pVrGrdeMenuOpt(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRHKGRDS.P_VR_GRDE_MENU_OPT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPT_NUM_IN", optNumIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
		
//		public static void pVrGrdeOpt(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRHKGRDS.P_VR_GRDE_OPT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPT_NUM_IN", optNumIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
		
//		public static void pVrListGrades(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,Ref<NNumber> numRecs,Ref<NString> term,NNumber numTriesIn,List<Soktabs.ShrtcknTabTypeRow> shrtcknTable,List<Soktabs.ShrtckgTabTypeRow> shrtckgTable,List<Soktabs.StvsubjTabTypeRow> stvsubjTable,NNumber grdCnt,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRHKGRDS.P_VR_LIST_GRADES", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_RECS", numRecs, true);
//			cmd.addParameter("@TERM", term, true);
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			// cmd.addParameter(DbTypes.getTableType("SHRTCKN_TABLE", "", shrtcknTable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SHRTCKG_TABLE", "", shrtckgTable, object.class));
//			// cmd.addParameter(DbTypes.getTableType("STVSUBJ_TABLE", "", stvsubjTable, object.class));
//			cmd.addParameter("@GRD_CNT", grdCnt);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//			numRecs.val = cmd.getParameterValue("@NUM_RECS", NNumber.class);
//			term.val = cmd.getParameterValue("@TERM", NString.class);
//
//
//		}
//		
//		public static void pVrMultiTerms(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn,NString optNumIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRHKGRDS.P_VR_MULTI_TERMS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("VR_MSG_TABLE", "", vrMsgTable.val, object.class , true));
//			cmd.addParameter("@NUM_TRIES_IN", numTriesIn);
//			cmd.addParameter("@ID_IN", idIn);
//			cmd.addParameter("@TEMPID_IN", tempidIn);
//			cmd.addParameter("@ENTITY_IN", entityIn);
//			cmd.addParameter("@OPT_NUM_IN", optNumIn);
//				
//			cmd.execute();
//			// vrMsgTable.val = cmd.getTableParameterValue("@VR_MSG_TABLE", object.class);
//
//
//		}
//		
//		public static void pVrSingleTerm(Ref<List<Goktabs.CharTabTypeRow>> vrMsgTable,NNumber numTriesIn,NString idIn,NString tempidIn,NString entityIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("VRHKGRDS.P_VR_SINGLE_TERM", DbManager.getDataBaseFactory());
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
