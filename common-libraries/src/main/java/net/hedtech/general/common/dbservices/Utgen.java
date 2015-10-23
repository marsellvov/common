package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utgen {
		public static void addToGrid(NString ownerIn,NString packageIn,NString prognameIn,NNumber overloadIn,NString tcnameIn,NString messageIn,NString arglistIn,NString returnValueIn,NString assertionTypeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.ADD_TO_GRID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OWNER_IN", ownerIn);
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@PROGNAME_IN", prognameIn);
			cmd.addParameter("@OVERLOAD_IN", overloadIn);
			cmd.addParameter("@TCNAME_IN", tcnameIn);
			cmd.addParameter("@MESSAGE_IN", messageIn);
			cmd.addParameter("@ARGLIST_IN", arglistIn);
			cmd.addParameter("@RETURN_VALUE_IN", returnValueIn);
			cmd.addParameter("@ASSERTION_TYPE_IN", assertionTypeIn);
				
			cmd.execute();


		}
		
		public static NBool Fatfirstrow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.ATFIRSTROW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool Fatlastrow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.ATLASTROW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void clearGrid(NString ownerIn,NString packageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.CLEAR_GRID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OWNER_IN", ownerIn);
			cmd.addParameter("@PACKAGE_IN", packageIn);
				
			cmd.execute();


		}
		
		public static NInteger Fcountrows() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.COUNTROWS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger firstbodyrow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.FIRSTBODYROW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger firstrow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.FIRSTROW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString Fgetrow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.GETROW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool Fisfunction(NString schemaIn,NString packageIn,NString programIn,NInteger overloadIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.ISFUNCTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SCHEMA_IN", schemaIn);
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@OVERLOAD_IN", overloadIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NInteger Flastrow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.LASTROW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void nextrow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.NEXTROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString Fnthrow(NInteger nth,NInteger direction) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.NTHROW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NTH", nth);
			cmd.addParameter("@DIRECTION", direction);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fpkgstring() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.PKGSTRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void prevrow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.PREVROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void setrow(NInteger nth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.SETROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NTH", nth);
				
			cmd.execute();


		}
		
		public static void showrows(NInteger startrow,NInteger endrow) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.SHOWROWS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STARTROW", startrow);
			cmd.addParameter("@ENDROW", endrow);
				
			cmd.execute();


		}
		
		public static void testpkg(NString packageIn,NString programIn,NBool samepackageIn,NString prefixIn,NString schemaIn,NInteger outputTypeIn,NString dirIn,NString overrideFileIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.TESTPKG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@SAMEPACKAGE_IN", samepackageIn);
			cmd.addParameter("@PREFIX_IN", prefixIn);
			cmd.addParameter("@SCHEMA_IN", schemaIn);
			cmd.addParameter("@OUTPUT_TYPE_IN", outputTypeIn);
			cmd.addParameter("@DIR_IN", dirIn);
			cmd.addParameter("@OVERRIDE_FILE_IN", overrideFileIn);
				
			cmd.execute();


		}
		
//		public static void testpkg(NString packageIn,List<GridTtRow> gridIn,NString programIn,NBool samepackageIn,NString prefixIn,NString schemaIn,NInteger outputTypeIn,NString dirIn,NString delimIn,NString dateFormatIn,NBool onlyIfInGridIn,NString overrideFileIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.TESTPKG", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@PACKAGE_IN", packageIn);
//			// cmd.addParameter(DbTypes.getTableType("GRID_IN", "", gridIn, object.class));
//			cmd.addParameter("@PROGRAM_IN", programIn);
//			cmd.addParameter("@SAMEPACKAGE_IN", samepackageIn);
//			cmd.addParameter("@PREFIX_IN", prefixIn);
//			cmd.addParameter("@SCHEMA_IN", schemaIn);
//			cmd.addParameter("@OUTPUT_TYPE_IN", outputTypeIn);
//			cmd.addParameter("@DIR_IN", dirIn);
//			cmd.addParameter("@DELIM_IN", delimIn);
//			cmd.addParameter("@DATE_FORMAT_IN", dateFormatIn);
//			cmd.addParameter("@ONLY_IF_IN_GRID_IN", onlyIfInGridIn);
//			cmd.addParameter("@OVERRIDE_FILE_IN", overrideFileIn);
//				
//			cmd.execute();
//
//
//		}
		
		public static void testpkgFromFile(NString packageIn,NString gridfileLocIn,NString gridfileIn,NString programIn,NBool samepackageIn,NString prefixIn,NString schemaIn,NInteger outputTypeIn,NString dirIn,NString fieldDelimIn,NString argDelimIn,NString dateFormatIn,NBool onlyIfInGridIn,NString overrideFileIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.TESTPKG_FROM_FILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@GRIDFILE_LOC_IN", gridfileLocIn);
			cmd.addParameter("@GRIDFILE_IN", gridfileIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@SAMEPACKAGE_IN", samepackageIn);
			cmd.addParameter("@PREFIX_IN", prefixIn);
			cmd.addParameter("@SCHEMA_IN", schemaIn);
			cmd.addParameter("@OUTPUT_TYPE_IN", outputTypeIn);
			cmd.addParameter("@DIR_IN", dirIn);
			cmd.addParameter("@FIELD_DELIM_IN", fieldDelimIn);
			cmd.addParameter("@ARG_DELIM_IN", argDelimIn);
			cmd.addParameter("@DATE_FORMAT_IN", dateFormatIn);
			cmd.addParameter("@ONLY_IF_IN_GRID_IN", onlyIfInGridIn);
			cmd.addParameter("@OVERRIDE_FILE_IN", overrideFileIn);
				
			cmd.execute();


		}
		
		public static void testpkgFromString(NString packageIn,NString gridIn,NString programIn,NBool samepackageIn,NString prefixIn,NString schemaIn,NInteger outputTypeIn,NString dirIn,NString lineDelimIn,NString fieldDelimIn,NString argDelimIn,NString dateFormatIn,NBool onlyIfInGridIn,NString overrideFileIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.TESTPKG_FROM_STRING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@GRID_IN", gridIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@SAMEPACKAGE_IN", samepackageIn);
			cmd.addParameter("@PREFIX_IN", prefixIn);
			cmd.addParameter("@SCHEMA_IN", schemaIn);
			cmd.addParameter("@OUTPUT_TYPE_IN", outputTypeIn);
			cmd.addParameter("@DIR_IN", dirIn);
			cmd.addParameter("@LINE_DELIM_IN", lineDelimIn);
			cmd.addParameter("@FIELD_DELIM_IN", fieldDelimIn);
			cmd.addParameter("@ARG_DELIM_IN", argDelimIn);
			cmd.addParameter("@DATE_FORMAT_IN", dateFormatIn);
			cmd.addParameter("@ONLY_IF_IN_GRID_IN", onlyIfInGridIn);
			cmd.addParameter("@OVERRIDE_FILE_IN", overrideFileIn);
				
			cmd.execute();


		}
		
		public static void testpkgFromStringOd(NString packageIn,NString gridIn,NString dirIn,NString overrideFileIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.TESTPKG_FROM_STRING_OD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@GRID_IN", gridIn);
			cmd.addParameter("@DIR_IN", dirIn);
			cmd.addParameter("@OVERRIDE_FILE_IN", overrideFileIn);
				
			cmd.execute();


		}
		
		public static void testpkgFromTable(NString packageIn,NString programIn,NBool samepackageIn,NString prefixIn,NString schemaIn,NInteger outputTypeIn,NString dirIn,NString dateFormatIn,NString overrideFileIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTGEN.TESTPKG_FROM_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PACKAGE_IN", packageIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@SAMEPACKAGE_IN", samepackageIn);
			cmd.addParameter("@PREFIX_IN", prefixIn);
			cmd.addParameter("@SCHEMA_IN", schemaIn);
			cmd.addParameter("@OUTPUT_TYPE_IN", outputTypeIn);
			cmd.addParameter("@DIR_IN", dirIn);
			cmd.addParameter("@DATE_FORMAT_IN", dateFormatIn);
			cmd.addParameter("@OVERRIDE_FILE_IN", overrideFileIn);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="GridRtRow", dataSourceName="GRID_RT")
	public static class GridRtRow
	{
		@DbRecordField(dataSourceName="PROGNAME")
		public NString Progname;
		@DbRecordField(dataSourceName="OVERLOAD")
		public NInteger Overload;
		@DbRecordField(dataSourceName="TCNAME")
		public NString Tcname;
		@DbRecordField(dataSourceName="MESSAGE")
		public NString Message;
		@DbRecordField(dataSourceName="ARGLIST")
		public NString Arglist;
		@DbRecordField(dataSourceName="RETURN_VALUE")
		public NString ReturnValue;
		@DbRecordField(dataSourceName="ASSERTION_TYPE")
		public NString AssertionType;
		@DbRecordField(dataSourceName="NULL_OK")
		public NString NullOk;
	}

	
	
}
