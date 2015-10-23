package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sakfunc {
		public static void pGetMostRecentAppl(NNumber pidmIn,NString termCodeIn,NNumber applNoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKFUNC.P_GET_MOST_RECENT_APPL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@APPL_NO_IN", applNoIn);
				
			cmd.execute();


		}
		
//		public static void pGetSaradapRows(NNumber pidmIn,NString termCodeIn,Ref<NNumber> rowCntInOut,Ref<List<Soktabs.StvlevlTabTypeRow>> stvlevlRowTable,Ref<List<Soktabs.StvdegcTabTypeRow>> stvdegcRowTable,Ref<List<Soktabs.StvcollTabTypeRow>> stvcollRowTable,Ref<List<Soktabs.StvdeptTabTypeRow>> stvdeptRowTable,Ref<List<Soktabs.StvmajrTabTypeRow>> stvmajrRowTable,Ref<List<Soktabs.StvapstTabTypeRow>> stvapstRowTable,Ref<List<Soktabs.SaradapTabTypeRow>> saradapRowTable,NNumber applNoIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKFUNC.P_GET_SARADAP_ROWS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
//			cmd.addParameter("@ROW_CNT_IN_OUT", rowCntInOut, true);
//			// cmd.addParameter(DbTypes.getTableType("STVLEVL_ROW_TABLE", "", stvlevlRowTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("STVDEGC_ROW_TABLE", "", stvdegcRowTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("STVCOLL_ROW_TABLE", "", stvcollRowTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("STVDEPT_ROW_TABLE", "", stvdeptRowTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("STVMAJR_ROW_TABLE", "", stvmajrRowTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("STVAPST_ROW_TABLE", "", stvapstRowTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("SARADAP_ROW_TABLE", "", saradapRowTable.val, object.class , true));
//			cmd.addParameter("@APPL_NO_IN", applNoIn);
//				
//			cmd.execute();
//			rowCntInOut.val = cmd.getParameterValue("@ROW_CNT_IN_OUT", NNumber.class);
//			// stvlevlRowTable.val = cmd.getTableParameterValue("@STVLEVL_ROW_TABLE", object.class);
//			// stvdegcRowTable.val = cmd.getTableParameterValue("@STVDEGC_ROW_TABLE", object.class);
//			// stvcollRowTable.val = cmd.getTableParameterValue("@STVCOLL_ROW_TABLE", object.class);
//			// stvdeptRowTable.val = cmd.getTableParameterValue("@STVDEPT_ROW_TABLE", object.class);
//			// stvmajrRowTable.val = cmd.getTableParameterValue("@STVMAJR_ROW_TABLE", object.class);
//			// stvapstRowTable.val = cmd.getTableParameterValue("@STVAPST_ROW_TABLE", object.class);
//			// saradapRowTable.val = cmd.getTableParameterValue("@SARADAP_ROW_TABLE", object.class);
//
//
//		}
//		
//		public static void pGetSarchklRows(NNumber pidmIn,NString termCodeIn,NNumber applNoIn,Ref<NNumber> rowCntInOut,Ref<List<Soktabs.SarchklTabTypeRow>> sarchklRowTable) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKFUNC.P_GET_SARCHKL_ROWS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
//			cmd.addParameter("@APPL_NO_IN", applNoIn);
//			cmd.addParameter("@ROW_CNT_IN_OUT", rowCntInOut, true);
//			// cmd.addParameter(DbTypes.getTableType("SARCHKL_ROW_TABLE", "", sarchklRowTable.val, object.class , true));
//				
//			cmd.execute();
//			rowCntInOut.val = cmd.getParameterValue("@ROW_CNT_IN_OUT", NNumber.class);
//			// sarchklRowTable.val = cmd.getTableParameterValue("@SARCHKL_ROW_TABLE", object.class);
//
//
//		}
//		
//		public static void pGetSarchklRowsByRowid(NString rowIdIn,Ref<NNumber> rowCntInOut,Ref<List<Soktabs.SarchklTabTypeRow>> sarchklRowTable) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKFUNC.P_GET_SARCHKL_ROWS_BY_ROWID", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@ROW_ID_IN", rowIdIn);
//			cmd.addParameter("@ROW_CNT_IN_OUT", rowCntInOut, true);
//			// cmd.addParameter(DbTypes.getTableType("SARCHKL_ROW_TABLE", "", sarchklRowTable.val, object.class , true));
//				
//			cmd.execute();
//			rowCntInOut.val = cmd.getParameterValue("@ROW_CNT_IN_OUT", NNumber.class);
//			// sarchklRowTable.val = cmd.getTableParameterValue("@SARCHKL_ROW_TABLE", object.class);
//
//
//		}
//		
	
	
	
}
