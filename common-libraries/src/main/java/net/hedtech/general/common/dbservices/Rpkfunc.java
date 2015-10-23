package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rpkfunc {
		public static void pCalcFinTotals(NNumber pidmIn,NString aidyIn,Ref<Rpksels.RprawrdRecTypeRow> rprawrdRecordInOut,Ref<NNumber> recCountInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKFUNC.P_CALC_FIN_TOTALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@AIDY_IN", aidyIn);
			cmd.addParameter(DbTypes.createStructType("RPRAWRD_RECORD_IN_OUT", rprawrdRecordInOut.val, Rpksels.RprawrdRecTypeRow.class, true));
			cmd.addParameter("@REC_COUNT_IN_OUT", recCountInOut, true);
				
			cmd.execute();
			rprawrdRecordInOut.val = cmd.getParameterValue("@RPRAWRD_RECORD_IN_OUT", Rpksels.RprawrdRecTypeRow.class);
			recCountInOut.val = cmd.getParameterValue("@REC_COUNT_IN_OUT", NNumber.class);


		}
		
//		public static void pGetRpratrmRtvawstRows(Ref<List<Roktabs.RpratrmTabTypeRow>> rpratrmTable,Ref<List<Roktabs.RfrbaseTabTypeRow>> rfrbaseTable,Ref<List<Roktabs.RtvawstTabTypeRow>> rtvawstTable,NString aidyIn,NNumber pidmIn,NString termIn,Ref<NNumber> numRecsInOut,Ref<NNumber> twgrCountInOut,NString compositeKeyIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKFUNC.P_GET_RPRATRM_RTVAWST_ROWS", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("RPRATRM_TABLE", "", rpratrmTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("RFRBASE_TABLE", "", rfrbaseTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("RTVAWST_TABLE", "", rtvawstTable.val, object.class , true));
//			cmd.addParameter("@AIDY_IN", aidyIn);
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@NUM_RECS_IN_OUT", numRecsInOut, true);
//			cmd.addParameter("@TWGR_COUNT_IN_OUT", twgrCountInOut, true);
//			cmd.addParameter("@COMPOSITE_KEY_IN", compositeKeyIn);
//				
//			cmd.execute();
//			// rpratrmTable.val = cmd.getTableParameterValue("@RPRATRM_TABLE", object.class);
//			// rfrbaseTable.val = cmd.getTableParameterValue("@RFRBASE_TABLE", object.class);
//			// rtvawstTable.val = cmd.getTableParameterValue("@RTVAWST_TABLE", object.class);
//			numRecsInOut.val = cmd.getParameterValue("@NUM_RECS_IN_OUT", NNumber.class);
//			twgrCountInOut.val = cmd.getParameterValue("@TWGR_COUNT_IN_OUT", NNumber.class);
//
//
//		}
//		
//		public static void pGetRprawrdRows(NNumber pidmIn,NString aidyIn,Ref<NNumber> recsCountInOut,Ref<NNumber> twgrCountInOut,Ref<List<Roktabs.RtvawstTabTypeRow>> rtvawstTable,Ref<List<Roktabs.RfrbaseTabTypeRow>> rfrbaseTable,Ref<List<Roktabs.RprawrdTabTypeRow>> rprawrdTable,NString compositeKeyIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKFUNC.P_GET_RPRAWRD_ROWS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@AIDY_IN", aidyIn);
//			cmd.addParameter("@RECS_COUNT_IN_OUT", recsCountInOut, true);
//			cmd.addParameter("@TWGR_COUNT_IN_OUT", twgrCountInOut, true);
//			// cmd.addParameter(DbTypes.getTableType("RTVAWST_TABLE", "", rtvawstTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("RFRBASE_TABLE", "", rfrbaseTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("RPRAWRD_TABLE", "", rprawrdTable.val, object.class , true));
//			cmd.addParameter("@COMPOSITE_KEY_IN", compositeKeyIn);
//				
//			cmd.execute();
//			recsCountInOut.val = cmd.getParameterValue("@RECS_COUNT_IN_OUT", NNumber.class);
//			twgrCountInOut.val = cmd.getParameterValue("@TWGR_COUNT_IN_OUT", NNumber.class);
//			// rtvawstTable.val = cmd.getTableParameterValue("@RTVAWST_TABLE", object.class);
//			// rfrbaseTable.val = cmd.getTableParameterValue("@RFRBASE_TABLE", object.class);
//			// rprawrdTable.val = cmd.getTableParameterValue("@RPRAWRD_TABLE", object.class);
//
//
//		}
//		
//		public static void pGetRprlappRows(NNumber pidmIn,NString aidyIn,Ref<NNumber> numLoansInOut,Ref<List<Roktabs.RprlappTabTypeRow>> rprlappTable,Ref<List<Roktabs.RfrbaseTabTypeRow>> rfrbaseTable,Ref<List<Roktabs.RtvlnstTabTypeRow>> rtvlnstTable) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKFUNC.P_GET_RPRLAPP_ROWS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@AIDY_IN", aidyIn);
//			cmd.addParameter("@NUM_LOANS_IN_OUT", numLoansInOut, true);
//			// cmd.addParameter(DbTypes.getTableType("RPRLAPP_TABLE", "", rprlappTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("RFRBASE_TABLE", "", rfrbaseTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("RTVLNST_TABLE", "", rtvlnstTable.val, object.class , true));
//				
//			cmd.execute();
//			numLoansInOut.val = cmd.getParameterValue("@NUM_LOANS_IN_OUT", NNumber.class);
//			// rprlappTable.val = cmd.getTableParameterValue("@RPRLAPP_TABLE", object.class);
//			// rfrbaseTable.val = cmd.getTableParameterValue("@RFRBASE_TABLE", object.class);
//			// rtvlnstTable.val = cmd.getTableParameterValue("@RTVLNST_TABLE", object.class);
//
//
//		}
		
	
	
	
}
