package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rrkfunc {
		public static void pGetFinaidReqmntData(NNumber pidmIn,NString aidyIn,Ref<NNumber> reqCntInOut,Ref<NNumber> promCntInOut,Ref<NNumber> reqNotSatCntInOut,Ref<NNumber> promNotSatCntInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RRKFUNC.P_GET_FINAID_REQMNT_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@AIDY_IN", aidyIn);
			cmd.addParameter("@REQ_CNT_IN_OUT", reqCntInOut, true);
			cmd.addParameter("@PROM_CNT_IN_OUT", promCntInOut, true);
			cmd.addParameter("@REQ_NOT_SAT_CNT_IN_OUT", reqNotSatCntInOut, true);
			cmd.addParameter("@PROM_NOT_SAT_CNT_IN_OUT", promNotSatCntInOut, true);
				
			cmd.execute();
			reqCntInOut.val = cmd.getParameterValue("@REQ_CNT_IN_OUT", NNumber.class);
			promCntInOut.val = cmd.getParameterValue("@PROM_CNT_IN_OUT", NNumber.class);
			reqNotSatCntInOut.val = cmd.getParameterValue("@REQ_NOT_SAT_CNT_IN_OUT", NNumber.class);
			promNotSatCntInOut.val = cmd.getParameterValue("@PROM_NOT_SAT_CNT_IN_OUT", NNumber.class);


		}
		
		public static void pGetStvsbgiRow(NString sbgiCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RRKFUNC.P_GET_STVSBGI_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SBGI_CODE_IN", sbgiCodeIn);
				
			cmd.execute();


		}
		
//		public static void pNonCodeReqmntData(NNumber pidmIn,NString aidyIn,Ref<NNumber> recCountInOut,Ref<List<Roktabs.RrrareqTabTypeRow>> rrrareqTable) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RRKFUNC.P_NON_CODE_REQMNT_DATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@AIDY_IN", aidyIn);
//			cmd.addParameter("@REC_COUNT_IN_OUT", recCountInOut, true);
//			// cmd.addParameter(DbTypes.getTableType("RRRAREQ_TABLE", "", rrrareqTable.val, object.class , true));
//				
//			cmd.execute();
//			recCountInOut.val = cmd.getParameterValue("@REC_COUNT_IN_OUT", NNumber.class);
//			// rrrareqTable.val = cmd.getTableParameterValue("@RRRAREQ_TABLE", object.class);
//
//
//		}
		
	
	
	
}
