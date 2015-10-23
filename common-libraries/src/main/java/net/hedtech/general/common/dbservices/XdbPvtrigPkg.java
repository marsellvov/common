package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class XdbPvtrigPkg {
		public static void pvtrigDel(NString res,NString link,NString path) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("XDB_PVTRIG_PKG.PVTRIG_DEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RES", res);
			cmd.addParameter("@LINK", link);
			cmd.addParameter("@PATH", path);
				
			cmd.execute();


		}
		
		public static void pvtrigIns(NString res,NString link,NString path) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("XDB_PVTRIG_PKG.PVTRIG_INS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RES", res);
			cmd.addParameter("@LINK", link);
			cmd.addParameter("@PATH", path);
				
			cmd.execute();


		}
		
		public static void pvtrigUpd(NString oRes,NString nRes,NString oLink,NString nLink,NString oPath,NString nPath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("XDB_PVTRIG_PKG.PVTRIG_UPD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@O_RES", oRes);
			cmd.addParameter("@N_RES", nRes);
			cmd.addParameter("@O_LINK", oLink);
			cmd.addParameter("@N_LINK", nLink);
			cmd.addParameter("@O_PATH", oPath);
			cmd.addParameter("@N_PATH", nPath);
				
			cmd.execute();


		}
		
	
	
	
}
