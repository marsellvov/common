package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ututp {
		public static void add(NString programIn,NString ownerIn,NString descriptionIn,NString filenameIn,NString frequencyIn,NString programMapIn,NString declarationsIn,NString setupIn,NString teardownIn,NString exceptionsIn,NString programDirectoryIn,NString directoryIn,NString nameIn,NString utpOwnerIn,NString prefixIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUTP.ADD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@OWNER_IN", ownerIn);
			cmd.addParameter("@DESCRIPTION_IN", descriptionIn);
			cmd.addParameter("@FILENAME_IN", filenameIn);
			cmd.addParameter("@FREQUENCY_IN", frequencyIn);
			cmd.addParameter("@PROGRAM_MAP_IN", programMapIn);
			cmd.addParameter("@DECLARATIONS_IN", declarationsIn);
			cmd.addParameter("@SETUP_IN", setupIn);
			cmd.addParameter("@TEARDOWN_IN", teardownIn);
			cmd.addParameter("@EXCEPTIONS_IN", exceptionsIn);
			cmd.addParameter("@PROGRAM_DIRECTORY_IN", programDirectoryIn);
			cmd.addParameter("@DIRECTORY_IN", directoryIn);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@UTP_OWNER_IN", utpOwnerIn);
			cmd.addParameter("@PREFIX_IN", prefixIn);
				
			cmd.execute();


		}
		
		public static void add(NString programIn,NString ownerIn,NString descriptionIn,NString filenameIn,NString frequencyIn,NString programMapIn,NString declarationsIn,NString setupIn,NString teardownIn,NString exceptionsIn,NString programDirectoryIn,NString directoryIn,NString nameIn,NString utpOwnerIn,NString prefixIn,Ref<NNumber> idOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUTP.ADD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@OWNER_IN", ownerIn);
			cmd.addParameter("@DESCRIPTION_IN", descriptionIn);
			cmd.addParameter("@FILENAME_IN", filenameIn);
			cmd.addParameter("@FREQUENCY_IN", frequencyIn);
			cmd.addParameter("@PROGRAM_MAP_IN", programMapIn);
			cmd.addParameter("@DECLARATIONS_IN", declarationsIn);
			cmd.addParameter("@SETUP_IN", setupIn);
			cmd.addParameter("@TEARDOWN_IN", teardownIn);
			cmd.addParameter("@EXCEPTIONS_IN", exceptionsIn);
			cmd.addParameter("@PROGRAM_DIRECTORY_IN", programDirectoryIn);
			cmd.addParameter("@DIRECTORY_IN", directoryIn);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@UTP_OWNER_IN", utpOwnerIn);
			cmd.addParameter("@PREFIX_IN", prefixIn);
			cmd.addParameter("@ID_OUT", NNumber.class);
				
			cmd.execute();
			idOut.val = cmd.getParameterValue("@ID_OUT", NNumber.class);


		}
		
		public static NBool Fexists(NString ownerIn,NString programIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUTP.EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@OWNER_IN", ownerIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void getOnerow(NString ownerIn,NString programIn,Ref<NNumber> idOut,Ref<NString> descriptionOut,Ref<NString> filenameOut,Ref<NString> programDirectoryOut,Ref<NString> directoryOut,Ref<NString> nameOut,Ref<NString> utpOwnerOut,Ref<NString> prefixOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUTP.GET_ONEROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OWNER_IN", ownerIn);
			cmd.addParameter("@PROGRAM_IN", programIn);
			cmd.addParameter("@ID_OUT", NNumber.class);
			cmd.addParameter("@DESCRIPTION_OUT", NString.class);
			cmd.addParameter("@FILENAME_OUT", NString.class);
			cmd.addParameter("@PROGRAM_DIRECTORY_OUT", NString.class);
			cmd.addParameter("@DIRECTORY_OUT", NString.class);
			cmd.addParameter("@NAME_OUT", NString.class);
			cmd.addParameter("@UTP_OWNER_OUT", NString.class);
			cmd.addParameter("@PREFIX_OUT", NString.class);
				
			cmd.execute();
			idOut.val = cmd.getParameterValue("@ID_OUT", NNumber.class);
			descriptionOut.val = cmd.getParameterValue("@DESCRIPTION_OUT", NString.class);
			filenameOut.val = cmd.getParameterValue("@FILENAME_OUT", NString.class);
			programDirectoryOut.val = cmd.getParameterValue("@PROGRAM_DIRECTORY_OUT", NString.class);
			directoryOut.val = cmd.getParameterValue("@DIRECTORY_OUT", NString.class);
			nameOut.val = cmd.getParameterValue("@NAME_OUT", NString.class);
			utpOwnerOut.val = cmd.getParameterValue("@UTP_OWNER_OUT", NString.class);
			prefixOut.val = cmd.getParameterValue("@PREFIX_OUT", NString.class);


		}
		
		public static NNumber Fid(NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUTP.ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString F_name() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUTP.NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString F_name(NNumber idIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUTP.NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID_IN", idIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void onerow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUTP.ONEROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void onerow() {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUTP.ONEROW", DbManager.getDataBaseFactory());
//			
//				
//			cmd.execute();
//
//
//		}
		
		public static NString Fprefix() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUTP.PREFIX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FqualifiedName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUTP.QUALIFIED_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FqualifiedName(NNumber idIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUTP.QUALIFIED_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID_IN", idIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void rem(NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUTP.REM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();


		}
		
		public static void rem(NNumber idIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUTP.REM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ID_IN", idIn);
				
			cmd.execute();


		}
		
		public static NString FsetupProcedure() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUTP.SETUP_PROCEDURE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FteardownProcedure() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUTP.TEARDOWN_PROCEDURE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor Futps(NString programLikeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTUTP.UTPS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@PROGRAM_LIKE_IN", programLikeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
	
	
	
}
