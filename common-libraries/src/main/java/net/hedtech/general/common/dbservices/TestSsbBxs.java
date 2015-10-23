package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TestSsbBxs {
		public static void pChangepwd(NString pEobuserUname,NString pEobuserPwd,NString btnchosen) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TEST_SSB_BXS.P_CHANGEPWD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EOBUSER_UNAME", pEobuserUname);
			cmd.addParameter("@P_EOBUSER_PWD", pEobuserPwd);
			cmd.addParameter("@BTNCHOSEN", btnchosen);
				
			cmd.execute();


		}
		
		public static void pEobparmGui() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TEST_SSB_BXS.P_EOBPARM_GUI", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pSave(List<Twbklibs.Varchar2TabtypeRow> pEobuserUname,List<Twbklibs.Varchar2TabtypeRow> pEobuserApname,List<Twbklibs.Varchar2TabtypeRow> deleteRecord,List<Twbklibs.Varchar2TabtypeRow> pRowid,NString btnselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TEST_SSB_BXS.P_SAVE", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_EOBUSER_UNAME", "", pEobuserUname, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_EOBUSER_APNAME", "", pEobuserApname, object.class));
//			// cmd.addParameter(DbTypes.getTableType("DELETE_RECORD", "", deleteRecord, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ROWID", "", pRowid, object.class));
//			cmd.addParameter("@BTNSELECTED", btnselected);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
