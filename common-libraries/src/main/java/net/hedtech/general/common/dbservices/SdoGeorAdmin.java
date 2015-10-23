package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoGeorAdmin {
//		public static List<SdoString2ArrayRow> Fchecksysdataentries() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_ADMIN.CHECKSYSDATAENTRIES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoString2ArrayRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoString2ArrayRow>.class);
//
//		}
		
		public static void createdmltrigger(NString tablename,NString columnname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_ADMIN.CREATEDMLTRIGGER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLENAME", tablename);
			cmd.addParameter("@COLUMNNAME", columnname);
				
			cmd.execute();


		}
		
		public static NString Fgetuniquerdtname() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_ADMIN.GETUNIQUERDTNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fisrdtnameunique(NString rdtname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_ADMIN.ISRDTNAMEUNIQUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@RDTNAME", rdtname);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<SdoString2ArrayRow> Fisupgradeneeded() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_ADMIN.ISUPGRADENEEDED", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoString2ArrayRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoString2ArrayRow>.class);
//
//		}
		
//		public static List<SdoString2ArraysetRow> Flistdanglingrasterdata() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_ADMIN.LISTDANGLINGRASTERDATA", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoString2ArraysetRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoString2ArraysetRow>.class);
//
//		}
		
//		public static List<SdoString2ArraysetRow> Flistgeorastercolumns() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_ADMIN.LISTGEORASTERCOLUMNS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoString2ArraysetRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoString2ArraysetRow>.class);
//
//		}
		
//		public static List<SdoString2ArraysetRow> Flistgeorasterobjects() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_ADMIN.LISTGEORASTEROBJECTS", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoString2ArraysetRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoString2ArraysetRow>.class);
//
//		}
		
//		public static List<SdoString2ArraysetRow> Flistgeorastertables() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_ADMIN.LISTGEORASTERTABLES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoString2ArraysetRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoString2ArraysetRow>.class);
//
//		}
		
//		public static List<SdoString2ArraysetRow> Flistrdt() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_ADMIN.LISTRDT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoString2ArraysetRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoString2ArraysetRow>.class);
//
//		}
		
//		public static List<SdoString2ArraysetRow> Flistregisteredrdt() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_ADMIN.LISTREGISTEREDRDT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoString2ArraysetRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoString2ArraysetRow>.class);
//
//		}
		
//		public static List<SdoString2ArraysetRow> Flistunregisteredrdt() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_ADMIN.LISTUNREGISTEREDRDT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoString2ArraysetRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoString2ArraysetRow>.class);
//
//		}
		
//		public static List<SdoString2ArrayRow> Fmaintainsysdataentries() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_ADMIN.MAINTAINSYSDATAENTRIES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoString2ArrayRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoString2ArrayRow>.class);
//
//		}
		
		public static void registergeorastercolumns() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_ADMIN.REGISTERGEORASTERCOLUMNS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void registergeorasterobjects() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_ADMIN.REGISTERGEORASTEROBJECTS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static List<SdoString2ArrayRow> Fupgradegeoraster() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GEOR_ADMIN.UPGRADEGEORASTER", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoString2ArrayRow>.class);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoString2ArrayRow>.class);
//
//		}
		
	
	
	
}
