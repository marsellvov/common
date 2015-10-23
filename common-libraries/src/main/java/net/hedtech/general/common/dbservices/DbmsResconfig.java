package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DbmsResconfig {
		public static void addrepositoryresconfig(NString rcpath,NInteger pos) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RESCONFIG.ADDREPOSITORYRESCONFIG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RCPATH", rcpath);
			cmd.addParameter("@POS", pos);
				
			cmd.execute();


		}
		
		public static void addresconfig(NString respath,NString rcpath,NInteger pos) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RESCONFIG.ADDRESCONFIG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RESPATH", respath);
			cmd.addParameter("@RCPATH", rcpath);
			cmd.addParameter("@POS", pos);
				
			cmd.execute();


		}
		
		public static void appendresconfig(NString respath,NString rcpath,NInteger appendoption) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RESCONFIG.APPENDRESCONFIG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RESPATH", respath);
			cmd.addParameter("@RCPATH", rcpath);
			cmd.addParameter("@APPENDOPTION", appendoption);
				
			cmd.execute();


		}
		
		public static void deleterepositoryresconfig(NInteger pos) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RESCONFIG.DELETEREPOSITORYRESCONFIG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@POS", pos);
				
			cmd.execute();


		}
		
		public static void deleteresconfig(NString respath,NInteger pos) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RESCONFIG.DELETERESCONFIG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RESPATH", respath);
			cmd.addParameter("@POS", pos);
				
			cmd.execute();


		}
		
		public static void deleteresconfig(NString respath,NString rcpath,NInteger deleteoption) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RESCONFIG.DELETERESCONFIG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RESPATH", respath);
			cmd.addParameter("@RCPATH", rcpath);
			cmd.addParameter("@DELETEOPTION", deleteoption);
				
			cmd.execute();


		}
		
//		public static Fgetlisteners(NString path) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RESCONFIG.GETLISTENERS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@PATH", path);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static  Fgetrepositoryresconfig(NInteger pos) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RESCONFIG.GETREPOSITORYRESCONFIG", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@POS", pos);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static List<XdbStringListTRow> Fgetrepositoryresconfigpaths() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RESCONFIG.GETREPOSITORYRESCONFIGPATHS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<XdbStringListTRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<XdbStringListTRow>.class);
//
//		}
		
//		public static  Fgetresconfig(NString respath,NInteger pos) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RESCONFIG.GETRESCONFIG", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@RESPATH", respath);
//			cmd.addParameter("@POS", pos);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static List<XdbStringListTRow> Fgetresconfigpaths(NString respath) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DBMS_RESCONFIG.GETRESCONFIGPATHS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<XdbStringListTRow>.class);
//			cmd.addParameter("@RESPATH", respath);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<XdbStringListTRow>.class);
//
//		}
		
	
	
	
}
