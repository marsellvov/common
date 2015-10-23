package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Phkpens {
		public static void pCombineData() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKPENS.P_COMBINE_DATA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetServiceDates(NNumber parmLoopCnt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKPENS.P_GET_SERVICE_DATES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PARM_LOOP_CNT", parmLoopCnt);
				
			cmd.execute();


		}
		
		public static void pInsPens() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKPENS.P_INS_PENS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsPensStrsRetro() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKPENS.P_INS_PENS_STRS_RETRO", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pResetData() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKPENS.P_RESET_DATA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
