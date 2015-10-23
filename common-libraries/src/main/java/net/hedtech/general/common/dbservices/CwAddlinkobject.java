package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class CwAddlinkobject {
		public static void cleanup() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_ADDLINKOBJECT.CLEANUP", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void cleanuptable(NNumber connectid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_ADDLINKOBJECT.CLEANUPTABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONNECTID", connectid);
				
			cmd.execute();


		}
		
		public static void cwAddlinkobjects(NNumber connectid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_ADDLINKOBJECT.CW_ADDLINKOBJECTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONNECTID", connectid);
				
			cmd.execute();


		}
		
		public static void cwUpdateobjectlinks(NNumber connectid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_ADDLINKOBJECT.CW_UPDATEOBJECTLINKS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONNECTID", connectid);
				
			cmd.execute();


		}
		
		public static void getversion(Ref<NInteger> major,Ref<NInteger> minor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_ADDLINKOBJECT.GETVERSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAJOR", NInteger.class);
			cmd.addParameter("@MINOR", NInteger.class);
				
			cmd.execute();
			major.val = cmd.getParameterValue("@MAJOR", NInteger.class);
			minor.val = cmd.getParameterValue("@MINOR", NInteger.class);


		}
		
		public static void insertintotable(NNumber spid,NNumber objectKey,NString objectOwner,NString objectName,NString objectDblink,NString objectType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CW_ADDLINKOBJECT.INSERTINTOTABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SPID", spid);
			cmd.addParameter("@OBJECT_KEY", objectKey);
			cmd.addParameter("@OBJECT_OWNER", objectOwner);
			cmd.addParameter("@OBJECT_NAME", objectName);
			cmd.addParameter("@OBJECT_DBLINK", objectDblink);
			cmd.addParameter("@OBJECT_TYPE", objectType);
				
			cmd.execute();


		}
		
	
	
	
}
