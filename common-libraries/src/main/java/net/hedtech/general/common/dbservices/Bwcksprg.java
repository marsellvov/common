package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwcksprg {
		public static void pPurgerequest(NNumber pidmIn,NNumber reqnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSPRG.P_PURGEREQUEST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@REQNO_IN", reqnoIn);
				
			cmd.execute();


		}
		
//		public static void pSubmitpurgerequest(List<OwaUtil.IdentArrRow> deleteReqnoIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKSPRG.P_SUBMITPURGEREQUEST", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("DELETE_REQNO_IN", "", deleteReqnoIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
