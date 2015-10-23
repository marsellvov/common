package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rokfunc {
		public static NString fGetTurnOffPellInd(NNumber pidmIn,NString aidyIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKFUNC.F_GET_TURN_OFF_PELL_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@AIDY_IN", aidyIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void pGetFinHolds(NNumber pidmIn,NString aidyIn,Ref<List<Roktabs.RorholdTabTypeRow>> rorholdTable,Ref<List<Roktabs.RtvholdTabTypeRow>> rtvholdTable,Ref<NNumber> numHoldsInOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKFUNC.P_GET_FIN_HOLDS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@AIDY_IN", aidyIn);
//			// cmd.addParameter(DbTypes.getTableType("RORHOLD_TABLE", "", rorholdTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("RTVHOLD_TABLE", "", rtvholdTable.val, object.class , true));
//			cmd.addParameter("@NUM_HOLDS_IN_OUT", numHoldsInOut, true);
//				
//			cmd.execute();
//			// rorholdTable.val = cmd.getTableParameterValue("@RORHOLD_TABLE", object.class);
//			// rtvholdTable.val = cmd.getTableParameterValue("@RTVHOLD_TABLE", object.class);
//			numHoldsInOut.val = cmd.getParameterValue("@NUM_HOLDS_IN_OUT", NNumber.class);
//
//
//		}
//		
//		public static void pGetRorsaprRtvsaprRows(NNumber pidmIn,Ref<List<Roktabs.RorsaprTabTypeRow>> rorsaprTable,Ref<List<Roktabs.RtvsaprTabTypeRow>> rtvsaprTable,Ref<NNumber> numRecsInOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKFUNC.P_GET_RORSAPR_RTVSAPR_ROWS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			// cmd.addParameter(DbTypes.getTableType("RORSAPR_TABLE", "", rorsaprTable.val, object.class , true));
//			// cmd.addParameter(DbTypes.getTableType("RTVSAPR_TABLE", "", rtvsaprTable.val, object.class , true));
//			cmd.addParameter("@NUM_RECS_IN_OUT", numRecsInOut, true);
//				
//			cmd.execute();
//			// rorsaprTable.val = cmd.getTableParameterValue("@RORSAPR_TABLE", object.class);
//			// rtvsaprTable.val = cmd.getTableParameterValue("@RTVSAPR_TABLE", object.class);
//			numRecsInOut.val = cmd.getParameterValue("@NUM_RECS_IN_OUT", NNumber.class);
//
//
//		}
		
		public static void pGetRorstatRows() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKFUNC.P_GET_RORSTAT_ROWS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
