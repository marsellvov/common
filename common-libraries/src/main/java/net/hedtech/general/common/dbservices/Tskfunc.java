package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Tskfunc {
		public static NString fRorstatExists(NString aidyIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKFUNC.F_RORSTAT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AIDY_IN", aidyIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fRprladbExists(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKFUNC.F_RPRLADB_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fRrrareqExists(NString aidyIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKFUNC.F_RRRAREQ_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AIDY_IN", aidyIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAdjustContMemos(NString termIn,NNumber pidmIn,NNumber startTranNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKFUNC.P_ADJUST_CONT_MEMOS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@START_TRAN_NUMBER", startTranNumber);
				
			cmd.execute();


		}
		
		public static void pAdjustContracts(NNumber startTranNumber,NDate effectiveDateIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKFUNC.P_ADJUST_CONTRACTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@START_TRAN_NUMBER", startTranNumber);
			cmd.addParameter("@EFFECTIVE_DATE_IN", effectiveDateIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pDoCredits(NString sessionidIn,NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKFUNC.P_DO_CREDITS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pInsertCtex(NString hasContIn,NString hasExptIn,NString sessionidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKFUNC.P_INSERT_CTEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@HAS_CONT_IN", hasContIn);
			cmd.addParameter("@HAS_EXPT_IN", hasExptIn);
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
				
			cmd.execute();


		}
		
//		public static void pLoadAmntAndDcatData(NNumber pidmIn,NString termCodeIn,NString cpTypeIn,Ref<NNumber> reqCntInOut,Ref<List<Toktabs.AmountTotalTabTypeRow>> totalAmountsTable,Ref<List<Toktabs.TtvdcatTabTypeRow>> ttvdcatTable) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKFUNC.P_LOAD_AMNT_AND_DCAT_DATA", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
//			cmd.addParameter("@CP_TYPE_IN", cpTypeIn);
//			cmd.addParameter("@REQ_CNT_IN_OUT", reqCntInOut, true);
//			// cmd.addParameter(DbTypes.getTableType("TOTAL_AMOUNTS_TABLE", "", totalAmountsTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("TTVDCAT_TABLE", "", ttvdcatTable.val, object.class , true));
//				
//			cmd.execute();
//			reqCntInOut.val = cmd.getParameterValue("@REQ_CNT_IN_OUT", NNumber.class);
//			// totalAmountsTable.val = cmd.getTableParameterValue("@TOTAL_AMOUNTS_TABLE", object.class);
//			// ttvdcatTable.val = cmd.getTableParameterValue("@TTVDCAT_TABLE", object.class);
//
//
//		}
		
		public static void pProcessContExpt(NNumber pidmIn,NString termIn,NString sessionidIn,NString hasContIn,NString hasExptIn,NString runModeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TSKFUNC.P_PROCESS_CONT_EXPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@HAS_CONT_IN", hasContIn);
			cmd.addParameter("@HAS_EXPT_IN", hasExptIn);
			cmd.addParameter("@RUN_MODE_IN", runModeIn);
				
			cmd.execute();


		}
		
	
	
	
}
