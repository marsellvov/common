package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class XdbRvtrigPkg {
		public static void rvtrigDel(NString res,NString path) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("XDB_RVTRIG_PKG.RVTRIG_DEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RES", res);
			cmd.addParameter("@PATH", path);
				
			cmd.execute();


		}
		
		public static void rvtrigIns(NString res,NString path) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("XDB_RVTRIG_PKG.RVTRIG_INS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RES", res);
			cmd.addParameter("@PATH", path);
				
			cmd.execute();


		}
		
		public static void rvtrigUpd(NString oRes,NString nRes,NString oPath,NString nPath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("XDB_RVTRIG_PKG.RVTRIG_UPD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@O_RES", oRes);
			cmd.addParameter("@N_RES", nRes);
			cmd.addParameter("@O_PATH", oPath);
			cmd.addParameter("@N_PATH", nPath);
				
			cmd.execute();


		}
		
	
	
	
}
