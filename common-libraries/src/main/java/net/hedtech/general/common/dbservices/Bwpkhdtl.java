package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkhdtl {
//		public static void pChooseEarnByPosnBody(NNumber pPidm,List<Twbklibs.Varchar2TabtypeRow> pYears) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHDTL.P_CHOOSE_EARN_BY_POSN_BODY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			// cmd.addParameter(DbTypes.getTableType("P_YEARS", "", pYears, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pGenerateEarnByPosnCsv(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHDTL.P_GENERATE_EARN_BY_POSN_CSV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
//		public static void pViewEarnByPosnBody(NNumber pPidm,List<Twbklibs.Varchar2TabtypeRow> pPositions) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHDTL.P_VIEW_EARN_BY_POSN_BODY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			// cmd.addParameter(DbTypes.getTableType("P_POSITIONS", "", pPositions, object.class));
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
