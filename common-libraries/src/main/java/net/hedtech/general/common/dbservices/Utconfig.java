package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utconfig {
		public static void autocompile(NBool onoffIn,NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.AUTOCOMPILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONOFF_IN", onoffIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();


		}
		
		public static NBool Fautocompiling(NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.AUTOCOMPILING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static DataCursor FbrowserContents(NString schemaIn,NString nameLikeIn,NString typeLikeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.BROWSER_CONTENTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@SCHEMA_IN", schemaIn);
			cmd.addParameter("@NAME_LIKE_IN", nameLikeIn);
			cmd.addParameter("@TYPE_LIKE_IN", typeLikeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString Fdateformat(NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.DATEFORMAT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fdelimiter(NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.DELIMITER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString Fdir(NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.DIR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString filedir(NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.FILEDIR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fileextension(NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.FILEEXTENSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static RecFileinfoRow fileinfo(NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.FILEINFO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(RecFileinfoRow.class));
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();

			return cmd.getReturnValue(RecFileinfoRow.class);

		}
		
		public static void getOnerow(NString schemaIn,Ref<NString> usernameOut,Ref<NString> autocompileOut,Ref<NString> prefixOut,Ref<NString> showFailuresOnlyOut,Ref<NString> directoryOut,Ref<NString> filedirOut,Ref<NString> showConfigInfoOut,Ref<NString> editorOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.GET_ONEROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SCHEMA_IN", schemaIn);
			cmd.addParameter("@USERNAME_OUT", NString.class);
			cmd.addParameter("@AUTOCOMPILE_OUT", NString.class);
			cmd.addParameter("@PREFIX_OUT", NString.class);
			cmd.addParameter("@SHOW_FAILURES_ONLY_OUT", NString.class);
			cmd.addParameter("@DIRECTORY_OUT", NString.class);
			cmd.addParameter("@FILEDIR_OUT", NString.class);
			cmd.addParameter("@SHOW_CONFIG_INFO_OUT", NString.class);
			cmd.addParameter("@EDITOR_OUT", NString.class);
				
			cmd.execute();
			usernameOut.val = cmd.getParameterValue("@USERNAME_OUT", NString.class);
			autocompileOut.val = cmd.getParameterValue("@AUTOCOMPILE_OUT", NString.class);
			prefixOut.val = cmd.getParameterValue("@PREFIX_OUT", NString.class);
			showFailuresOnlyOut.val = cmd.getParameterValue("@SHOW_FAILURES_ONLY_OUT", NString.class);
			directoryOut.val = cmd.getParameterValue("@DIRECTORY_OUT", NString.class);
			filedirOut.val = cmd.getParameterValue("@FILEDIR_OUT", NString.class);
			showConfigInfoOut.val = cmd.getParameterValue("@SHOW_CONFIG_INFO_OUT", NString.class);
			editorOut.val = cmd.getParameterValue("@EDITOR_OUT", NString.class);


		}
		
		public static NString Fgetreporter(NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.GETREPORTER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool Fincludeprogname(NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.INCLUDEPROGNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static DataCursor Fonerow(NString schemaIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.ONEROW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@SCHEMA_IN", schemaIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString Fprefix(NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.PREFIX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool Fregisteringtest(NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.REGISTERINGTEST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void registertest(NBool onoffIn,NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.REGISTERTEST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONOFF_IN", onoffIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();


		}
		
		public static void setdateformat(NString dateformatIn,NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.SETDATEFORMAT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DATEFORMAT_IN", dateformatIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();


		}
		
		public static void setdelimiter(NString delimiterIn,NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.SETDELIMITER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DELIMITER_IN", delimiterIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();


		}
		
		public static void setdir(NString dirIn,NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.SETDIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DIR_IN", dirIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();


		}
		
		public static void setfiledir(NString dirIn,NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.SETFILEDIR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DIR_IN", dirIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();


		}
		
		public static void setfileextension(NString fileextensionIn,NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.SETFILEEXTENSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FILEEXTENSION_IN", fileextensionIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();


		}
		
		public static void setfileinfo(NString dirIn,NString userprefixIn,NBool incnameIn,NString dateformatIn,NString fileextensionIn,NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.SETFILEINFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DIR_IN", dirIn);
			cmd.addParameter("@USERPREFIX_IN", userprefixIn);
			cmd.addParameter("@INCNAME_IN", incnameIn);
			cmd.addParameter("@DATEFORMAT_IN", dateformatIn);
			cmd.addParameter("@FILEEXTENSION_IN", fileextensionIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();


		}
		
		public static void setincludeprogname(NBool incnameIn,NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.SETINCLUDEPROGNAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INCNAME_IN", incnameIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();


		}
		
		public static void setprefix(NString prefixIn,NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.SETPREFIX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PREFIX_IN", prefixIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();


		}
		
		public static void setreporter(NString reporterIn,NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.SETREPORTER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REPORTER_IN", reporterIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();


		}
		
		public static void settester(NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.SETTESTER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();


		}
		
		public static void setuserprefix(NString userprefixIn,NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.SETUSERPREFIX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USERPREFIX_IN", userprefixIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();


		}
		
		public static void showconfig(NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.SHOWCONFIG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();


		}
		
		public static void showfailuresonly(NBool onoffIn,NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.SHOWFAILURESONLY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONOFF_IN", onoffIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();


		}
		
		public static NBool Fshowingfailuresonly(NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.SHOWINGFAILURESONLY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static DataCursor FsourceForProgram(NString schemaIn,NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.SOURCE_FOR_PROGRAM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@SCHEMA_IN", schemaIn);
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString Ftester() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.TESTER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void upd(NString usernameIn,NString autocompileIn,NString prefixIn,NString showFailuresOnlyIn,NString directoryIn,NString filedirIn,NString showConfigInfoIn,NString editorIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.UPD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USERNAME_IN", usernameIn);
			cmd.addParameter("@AUTOCOMPILE_IN", autocompileIn);
			cmd.addParameter("@PREFIX_IN", prefixIn);
			cmd.addParameter("@SHOW_FAILURES_ONLY_IN", showFailuresOnlyIn);
			cmd.addParameter("@DIRECTORY_IN", directoryIn);
			cmd.addParameter("@FILEDIR_IN", filedirIn);
			cmd.addParameter("@SHOW_CONFIG_INFO_IN", showConfigInfoIn);
			cmd.addParameter("@EDITOR_IN", editorIn);
				
			cmd.execute();


		}
		
		public static NString Fuserprefix(NString usernameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTCONFIG.USERPREFIX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USERNAME_IN", usernameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	@DbRecordType(id="RecFileinfoRow", dataSourceName="REC_FILEINFO")
	public static class RecFileinfoRow
	{
		@DbRecordField(dataSourceName="FILEDIR")
		public NString Filedir;
		@DbRecordField(dataSourceName="FILEUSERPREFIX")
		public NString Fileuserprefix;
		@DbRecordField(dataSourceName="FILEINCPROGNAME")
		public NString Fileincprogname;
		@DbRecordField(dataSourceName="FILEDATEFORMAT")
		public NString Filedateformat;
		@DbRecordField(dataSourceName="FILEEXTENSION")
		public NString Fileextension;
	}

	
	
}
