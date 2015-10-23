package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Utoutput {
		public static NNumber Fcount() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUT.COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static NNumber Fextract(Ref<List<DbmsOutput.ChararrRow>> bufferOut,NNumber maxLinesIn,NBool saveIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUT.EXTRACT", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			// cmd.addParameter(DbTypes.getTableType("BUFFER_OUT", "", object.class));
//			cmd.addParameter("@MAX_LINES_IN", maxLinesIn);
//			cmd.addParameter("@SAVE_IN", saveIn);
//				
//			cmd.execute();
//			// bufferOut.val = cmd.getTableParameterValue("@BUFFER_OUT", object.class);
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
//		public static void extract(Ref<List<DbmsOutput.ChararrRow>> bufferOut,NNumber maxLinesIn,NBool saveIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUT.EXTRACT", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("BUFFER_OUT", "", object.class));
//			cmd.addParameter("@MAX_LINES_IN", maxLinesIn);
//			cmd.addParameter("@SAVE_IN", saveIn);
//				
//			cmd.execute();
//			// bufferOut.val = cmd.getTableParameterValue("@BUFFER_OUT", object.class);
//
//
//		}
		
		public static NNumber Fextract(NNumber maxLinesIn,NBool saveIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUT.EXTRACT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@MAX_LINES_IN", maxLinesIn);
			cmd.addParameter("@SAVE_IN", saveIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void extract(NNumber maxLinesIn,NBool saveIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUT.EXTRACT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAX_LINES_IN", maxLinesIn);
			cmd.addParameter("@SAVE_IN", saveIn);
				
			cmd.execute();


		}
		
		public static NString Fnextline(NBool raiseExcIn,NBool saveIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUT.NEXTLINE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@RAISE_EXC_IN", raiseExcIn);
			cmd.addParameter("@SAVE_IN", saveIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void nosave() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUT.NOSAVE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void replace() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUT.REPLACE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void save() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUT.SAVE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NBool Fsaving() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UTOUTPUT.SAVING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
