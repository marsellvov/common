package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkmodu {
		public static void pModifypgmodule(NString returnCode,NString returnMsg,NString transType,NString codeIn,NString descIn,NString moduleCssUrlIn,NString helpUrlIn,NString helpCssUrlIn,NString globalMenuIn,NString headerCapsOnIn,NString displayExitIndIn,NString currReleaseNoIn,NString exitImageIn,NString helpImageIn,NString menuImageIn,NString backImageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKMODU.P_MODIFYPGMODULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
			cmd.addParameter("@RETURN_MSG", returnMsg);
			cmd.addParameter("@TRANS_TYPE", transType);
			cmd.addParameter("@CODE_IN", codeIn);
			cmd.addParameter("@DESC_IN", descIn);
			cmd.addParameter("@MODULE_CSS_URL_IN", moduleCssUrlIn);
			cmd.addParameter("@HELP_URL_IN", helpUrlIn);
			cmd.addParameter("@HELP_CSS_URL_IN", helpCssUrlIn);
			cmd.addParameter("@GLOBAL_MENU_IN", globalMenuIn);
			cmd.addParameter("@HEADER_CAPS_ON_IN", headerCapsOnIn);
			cmd.addParameter("@DISPLAY_EXIT_IND_IN", displayExitIndIn);
			cmd.addParameter("@CURR_RELEASE_NO_IN", currReleaseNoIn);
			cmd.addParameter("@EXIT_IMAGE_IN", exitImageIn);
			cmd.addParameter("@HELP_IMAGE_IN", helpImageIn);
			cmd.addParameter("@MENU_IMAGE_IN", menuImageIn);
			cmd.addParameter("@BACK_IMAGE_IN", backImageIn);
				
			cmd.execute();


		}
		
		public static void pOptionpgmodule(NString returnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKMODU.P_OPTIONPGMODULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
				
			cmd.execute();


		}
		
		public static void pSavemodule(NString transType,NString codeIn,NString descIn,NString moduleCssUrlIn,NString helpUrlIn,NString helpCssUrlIn,NString globalMenuIn,NString headerCapsOnIn,NString displayExitIndIn,NString currReleaseNoIn,NString exitImageIn,NString helpImageIn,NString menuImageIn,NString backImageIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKMODU.P_SAVEMODULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_TYPE", transType);
			cmd.addParameter("@CODE_IN", codeIn);
			cmd.addParameter("@DESC_IN", descIn);
			cmd.addParameter("@MODULE_CSS_URL_IN", moduleCssUrlIn);
			cmd.addParameter("@HELP_URL_IN", helpUrlIn);
			cmd.addParameter("@HELP_CSS_URL_IN", helpCssUrlIn);
			cmd.addParameter("@GLOBAL_MENU_IN", globalMenuIn);
			cmd.addParameter("@HEADER_CAPS_ON_IN", headerCapsOnIn);
			cmd.addParameter("@DISPLAY_EXIT_IND_IN", displayExitIndIn);
			cmd.addParameter("@CURR_RELEASE_NO_IN", currReleaseNoIn);
			cmd.addParameter("@EXIT_IMAGE_IN", exitImageIn);
			cmd.addParameter("@HELP_IMAGE_IN", helpImageIn);
			cmd.addParameter("@MENU_IMAGE_IN", menuImageIn);
			cmd.addParameter("@BACK_IMAGE_IN", backImageIn);
				
			cmd.execute();


		}
		
	
	
	
}
