package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SdoGcdr {
//		public static List<SdoKeywordarrayRow> FbatchGeocode(NString addressList,NString gcUsername,NNumber maxResultCount) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.BATCH_GEOCODE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoKeywordarrayRow>.class);
//			cmd.addParameter("@ADDRESS_LIST", addressList);
//			cmd.addParameter("@GC_USERNAME", gcUsername);
//			cmd.addParameter("@MAX_RESULT_COUNT", maxResultCount);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoKeywordarrayRow>.class);
//
//		}
		
		public static void createProfileTables() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.CREATE_PROFILE_TABLES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static  Fgeocode(NString username,List<SdoKeywordarrayRow> addrLines,NString country,NString matchMode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.GEOCODE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@USERNAME", username);
//			// cmd.addParameter(DbTypes.getCollectionType("ADDR_LINES", "", addrLines, object.class));
//			cmd.addParameter("@COUNTRY", country);
//			cmd.addParameter("@MATCH_MODE", matchMode);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FgeocodeAddr(NString gcUsername, address) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.GEOCODE_ADDR", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@GC_USERNAME", gcUsername);
//			cmd.addParameter("@ADDRESS", address);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static List<SdoAddrArrayRow> FgeocodeAddrAll(NString gcUsername, address,NNumber maxResNum) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.GEOCODE_ADDR_ALL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoAddrArrayRow>.class);
//			cmd.addParameter("@GC_USERNAME", gcUsername);
//			cmd.addParameter("@ADDRESS", address);
//			cmd.addParameter("@MAX_RES_NUM", maxResNum);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoAddrArrayRow>.class);
//
//		}
		
//		public static List<SdoAddrArrayRow> FgeocodeAll(NString gcUsername,List<SdoKeywordarrayRow> addrLines,NString country,NString matchMode,NNumber maxResNum) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.GEOCODE_ALL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SdoAddrArrayRow>.class);
//			cmd.addParameter("@GC_USERNAME", gcUsername);
//			// cmd.addParameter(DbTypes.getCollectionType("ADDR_LINES", "", addrLines, object.class));
//			cmd.addParameter("@COUNTRY", country);
//			cmd.addParameter("@MATCH_MODE", matchMode);
//			cmd.addParameter("@MAX_RES_NUM", maxResNum);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SdoAddrArrayRow>.class);
//
//		}
//		
//		public static  FgeocodeAsGeometry(NString username,List<SdoKeywordarrayRow> addrLines,NString country) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.GEOCODE_AS_GEOMETRY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@USERNAME", username);
//			// cmd.addParameter(DbTypes.getCollectionType("ADDR_LINES", "", addrLines, object.class));
//			cmd.addParameter("@COUNTRY", country);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FreverseGeocode(NString username,NNumber longitude,NNumber latitude,NString country) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.REVERSE_GEOCODE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@USERNAME", username);
//			cmd.addParameter("@LONGITUDE", longitude);
//			cmd.addParameter("@LATITUDE", latitude);
//			cmd.addParameter("@COUNTRY", country);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
//		
//		public static  FreverseGeocode(NString username, location,NString country) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.REVERSE_GEOCODE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@USERNAME", username);
//			cmd.addParameter("@LOCATION", location);
//			cmd.addParameter("@COUNTRY", country);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
//		public static void validatecityrow(NString country,NString _out,List<SdoKeywordarrayRow> keys) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.VALIDATECITYROW", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@COUNTRY", country);
//			cmd.addParameter("@OUT", _out);
//			// cmd.addParameter(DbTypes.getCollectionType("KEYS", "", keys, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void validatecountryrow(NString country,List<SdoKeywordarrayRow> keys) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.VALIDATECOUNTRYROW", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@COUNTRY", country);
//			// cmd.addParameter(DbTypes.getCollectionType("KEYS", "", keys, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void validateinlinestreettyperow(NString country,NString pos,NString sep,NString _out,List<SdoKeywordarrayRow> keys) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.VALIDATEINLINESTREETTYPEROW", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@COUNTRY", country);
//			cmd.addParameter("@POS", pos);
//			cmd.addParameter("@SEP", sep);
//			cmd.addParameter("@OUT", _out);
//			// cmd.addParameter(DbTypes.getCollectionType("KEYS", "", keys, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void validatelocalitydictrow(NString country,NString _out,List<SdoKeywordarrayRow> keys) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.VALIDATELOCALITYDICTROW", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@COUNTRY", country);
//			cmd.addParameter("@OUT", _out);
//			// cmd.addParameter(DbTypes.getCollectionType("KEYS", "", keys, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void validateplacenamerow(NString country,NString _out) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.VALIDATEPLACENAMEROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COUNTRY", country);
			cmd.addParameter("@OUT", _out);
				
			cmd.execute();


		}
		
//		public static void validatepoboxrow(NString country,NString _out,List<SdoKeywordarrayRow> keys) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.VALIDATEPOBOXROW", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@COUNTRY", country);
//			cmd.addParameter("@OUT", _out);
//			// cmd.addParameter(DbTypes.getCollectionType("KEYS", "", keys, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void validateregionrow(NString country,NString _out,List<SdoKeywordarrayRow> keys) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.VALIDATEREGIONROW", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@COUNTRY", country);
//			cmd.addParameter("@OUT", _out);
//			// cmd.addParameter(DbTypes.getCollectionType("KEYS", "", keys, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void validatesecondunitrow(NString country,NString pos,NString _out,List<SdoKeywordarrayRow> keys) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.VALIDATESECONDUNITROW", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@COUNTRY", country);
//			cmd.addParameter("@POS", pos);
//			cmd.addParameter("@OUT", _out);
//			// cmd.addParameter(DbTypes.getCollectionType("KEYS", "", keys, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void validatestreetdictrow(NString country,NString _out,List<SdoKeywordarrayRow> keys) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.VALIDATESTREETDICTROW", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@COUNTRY", country);
//			cmd.addParameter("@OUT", _out);
//			// cmd.addParameter(DbTypes.getCollectionType("KEYS", "", keys, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void validatestreetprefixrow(NString country,NString _out,List<SdoKeywordarrayRow> keys) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.VALIDATESTREETPREFIXROW", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@COUNTRY", country);
//			cmd.addParameter("@OUT", _out);
//			// cmd.addParameter(DbTypes.getCollectionType("KEYS", "", keys, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void validatestreetsuffixrow(NString country,NString _out,List<SdoKeywordarrayRow> keys) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.VALIDATESTREETSUFFIXROW", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@COUNTRY", country);
//			cmd.addParameter("@OUT", _out);
//			// cmd.addParameter(DbTypes.getCollectionType("KEYS", "", keys, object.class));
//				
//			cmd.execute();
//
//
//		}
		
//		public static void validatestreettyperow(NString country,NString pos,NString sep,NString _out,List<SdoKeywordarrayRow> keys) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SDO_GCDR.VALIDATESTREETTYPEROW", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@COUNTRY", country);
//			cmd.addParameter("@POS", pos);
//			cmd.addParameter("@SEP", sep);
//			cmd.addParameter("@OUT", _out);
//			// cmd.addParameter(DbTypes.getCollectionType("KEYS", "", keys, object.class));
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
