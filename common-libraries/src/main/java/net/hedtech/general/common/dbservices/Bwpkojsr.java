package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkojsr {
		public static void pJsCheckadjustedtime() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JS_CHECKADJUSTEDTIME", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptConfirmWindow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JSCRIPT_CONFIRM_WINDOW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptFillUsrnameArray() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JSCRIPT_FILL_USRNAME_ARRAY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptFormatnum() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JSCRIPT_FORMATNUM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptIsdigit() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JSCRIPT_ISDIGIT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptIsnum() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JSCRIPT_ISNUM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptLtrim() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JSCRIPT_LTRIM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptNottoolarge() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JSCRIPT_NOTTOOLARGE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptRemovecomma() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JSCRIPT_REMOVECOMMA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptRounding() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JSCRIPT_ROUNDING", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptRtrim() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JSCRIPT_RTRIM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptUpdtLevelArray() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JSCRIPT_UPDT_LEVEL_ARRAY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptZeropctDist() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JSCRIPT_ZEROPCT_DIST", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptchoosesalavalue() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JSCRIPTCHOOSESALAVALUE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptchooseval(NString pValueType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JSCRIPTCHOOSEVAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VALUE_TYPE", pValueType);
				
			cmd.execute();


		}
		
		public static void pJscriptmoredetlwindowopen(NNumber pHeight,NNumber pWidth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JSCRIPTMOREDETLWINDOWOPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_HEIGHT", pHeight);
			cmd.addParameter("@P_WIDTH", pWidth);
				
			cmd.execute();


		}
		
		public static void pJscriptsalawindowopen() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JSCRIPTSALAWINDOWOPEN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pJscriptvalueswinopen(NString pValueType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JSCRIPTVALUESWINOPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VALUE_TYPE", pValueType);
				
			cmd.execute();


		}
		
		public static void pJscriptwindowcloseredirect(NString pWindow,NString pUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JSCRIPTWINDOWCLOSEREDIRECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WINDOW", pWindow);
			cmd.addParameter("@P_URL", pUrl);
				
			cmd.execute();


		}
		
		public static void pJscriptwindowopen() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOJSR.P_JSCRIPTWINDOWOPEN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
