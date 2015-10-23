package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Shkfunc {
//		public static void pGetAcadStand(NNumber pidmIn,NString termIn,Ref<List<Soktabs.SgbstdnTabTypeRow>> sgbstdnTable,Ref<List<Soktabs.ShrttrmTabTypeRow>> shrttrmTable,Ref<List<Soktabs.StvastdTabTypeRow>> stvastdTable,Ref<List<Soktabs.StvlevlTabTypeRow>> stvlevlTable) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKFUNC.P_GET_ACAD_STAND", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@TERM_IN", termIn);
//			// cmd.addParameter(DbTypes.getTableType("SGBSTDN_TABLE", "", sgbstdnTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("SHRTTRM_TABLE", "", shrttrmTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("STVASTD_TABLE", "", stvastdTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("STVLEVL_TABLE", "", stvlevlTable.val, object.class , true));
//				
//			cmd.execute();
//			// sgbstdnTable.val = cmd.getTableParameterValue("@SGBSTDN_TABLE", object.class);
//			// shrttrmTable.val = cmd.getTableParameterValue("@SHRTTRM_TABLE", object.class);
//			// stvastdTable.val = cmd.getTableParameterValue("@STVASTD_TABLE", object.class);
//			// stvlevlTable.val = cmd.getTableParameterValue("@STVLEVL_TABLE", object.class);
//
//
//		}
		
//		public static void pGetCourseData(Ref<List<Soktabs.ShrtcknTabTypeRow>> shrtcknTable,Ref<List<Soktabs.ShrtckgTabTypeRow>> shrtckgTable,Ref<List<Soktabs.StvsubjTabTypeRow>> stvsubjTable,NNumber pidmIn,NString termIn,Ref<NNumber> grdCntInOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKFUNC.P_GET_COURSE_DATA", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("SHRTCKN_TABLE", "", shrtcknTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("SHRTCKG_TABLE", "", shrtckgTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("STVSUBJ_TABLE", "", stvsubjTable.val, object.class , true));
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@GRD_CNT_IN_OUT", grdCntInOut, true);
//				
//			cmd.execute();
//			// shrtcknTable.val = cmd.getTableParameterValue("@SHRTCKN_TABLE", object.class);
//			// shrtckgTable.val = cmd.getTableParameterValue("@SHRTCKG_TABLE", object.class);
//			// stvsubjTable.val = cmd.getTableParameterValue("@STVSUBJ_TABLE", object.class);
//			grdCntInOut.val = cmd.getParameterValue("@GRD_CNT_IN_OUT", NNumber.class);
//
//
//		}
		
//		public static void pGetProgressData(NNumber pidmIn,NString termIn,Ref<List<Soktabs.SfrstcrTabTypeRow>> sfrstcrTable,Ref<List<Soktabs.SsbsectTabTypeRow>> ssbsectTable,Ref<List<Soktabs.StvsubjTabTypeRow>> stvsubjTable,Ref<NNumber> grdCnt2InOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKFUNC.P_GET_PROGRESS_DATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@TERM_IN", termIn);
//			// cmd.addParameter(DbTypes.getTableType("SFRSTCR_TABLE", "", sfrstcrTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("SSBSECT_TABLE", "", ssbsectTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("STVSUBJ_TABLE", "", stvsubjTable.val, object.class , true));
//			cmd.addParameter("@GRD_CNT2_IN_OUT", grdCnt2InOut, true);
//				
//			cmd.execute();
//			// sfrstcrTable.val = cmd.getTableParameterValue("@SFRSTCR_TABLE", object.class);
//			// ssbsectTable.val = cmd.getTableParameterValue("@SSBSECT_TABLE", object.class);
//			// stvsubjTable.val = cmd.getTableParameterValue("@STVSUBJ_TABLE", object.class);
//			grdCnt2InOut.val = cmd.getParameterValue("@GRD_CNT2_IN_OUT", NNumber.class);
//
//
//		}
		
		public static void pGetTermCumGpa(NNumber pidmIn,NString levlIn,NString termIn,NString typeIn,Ref<NNumber> termGpaInOut,Ref<NNumber> cumGpaInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKFUNC.P_GET_TERM_CUM_GPA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@TYPE_IN", typeIn);
			cmd.addParameter("@TERM_GPA_IN_OUT", termGpaInOut, true);
			cmd.addParameter("@CUM_GPA_IN_OUT", cumGpaInOut, true);
				
			cmd.execute();
			termGpaInOut.val = cmd.getParameterValue("@TERM_GPA_IN_OUT", NNumber.class);
			cumGpaInOut.val = cmd.getParameterValue("@CUM_GPA_IN_OUT", NNumber.class);


		}
		
	
	
	
}
