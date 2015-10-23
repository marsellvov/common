package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkjscr {
		public static NString fJscriptlinkpreviewcolor(NString fieldName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKJSCR.F_JSCRIPTLINKPREVIEWCOLOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FIELD_NAME", fieldName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fJscriptlinkpreviewimage(NString fieldName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKJSCR.F_JSCRIPTLINKPREVIEWIMAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@FIELD_NAME", fieldName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pJscriptclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKJSCR.P_JSCRIPTCLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptlinkpreviewcolor(NString fieldName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKJSCR.P_JSCRIPTLINKPREVIEWCOLOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FIELD_NAME", fieldName);
				
			cmd.execute();


		}
		
		public static void pJscriptlinkpreviewimage(NString fieldName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKJSCR.P_JSCRIPTLINKPREVIEWIMAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FIELD_NAME", fieldName);
				
			cmd.execute();


		}
		
		public static void pJscriptmaxlencheck() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKJSCR.P_JSCRIPTMAXLENCHECK", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptonsubmit() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKJSCR.P_JSCRIPTONSUBMIT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptopen() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKJSCR.P_JSCRIPTOPEN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptpreviewcolor() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKJSCR.P_JSCRIPTPREVIEWCOLOR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptpreviewimageclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKJSCR.P_JSCRIPTPREVIEWIMAGECLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptpreviewimageopen(NBool previewFromSelectList) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKJSCR.P_JSCRIPTPREVIEWIMAGEOPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PREVIEW_FROM_SELECT_LIST", previewFromSelectList);
				
			cmd.execute();


		}
		
		public static void pJscriptwindowopen() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKJSCR.P_JSCRIPTWINDOWOPEN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
