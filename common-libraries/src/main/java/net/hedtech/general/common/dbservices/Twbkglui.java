package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkglui {
		public static void pModifypgglobalui(NString returnCode,NString returnMsg,NString systemNameIn,NString helpImageIn,NString mainMenuNameIn,NString headerImageIn,NString errorImageIn,NString warningImageIn,NString exitImageIn,NString menuImageIn,NString backImageIn,NString cssUrlIn,NString helpUrlIn,NString sctHomepageIn,NString submenuImageIn,NString appPageImageIn,NString requiredImageIn,NString helpCssUrlIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKGLUI.P_MODIFYPGGLOBALUI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
			cmd.addParameter("@RETURN_MSG", returnMsg);
			cmd.addParameter("@SYSTEM_NAME_IN", systemNameIn);
			cmd.addParameter("@HELP_IMAGE_IN", helpImageIn);
			cmd.addParameter("@MAIN_MENU_NAME_IN", mainMenuNameIn);
			cmd.addParameter("@HEADER_IMAGE_IN", headerImageIn);
			cmd.addParameter("@ERROR_IMAGE_IN", errorImageIn);
			cmd.addParameter("@WARNING_IMAGE_IN", warningImageIn);
			cmd.addParameter("@EXIT_IMAGE_IN", exitImageIn);
			cmd.addParameter("@MENU_IMAGE_IN", menuImageIn);
			cmd.addParameter("@BACK_IMAGE_IN", backImageIn);
			cmd.addParameter("@CSS_URL_IN", cssUrlIn);
			cmd.addParameter("@HELP_URL_IN", helpUrlIn);
			cmd.addParameter("@SCT_HOMEPAGE_IN", sctHomepageIn);
			cmd.addParameter("@SUBMENU_IMAGE_IN", submenuImageIn);
			cmd.addParameter("@APP_PAGE_IMAGE_IN", appPageImageIn);
			cmd.addParameter("@REQUIRED_IMAGE_IN", requiredImageIn);
			cmd.addParameter("@HELP_CSS_URL_IN", helpCssUrlIn);
				
			cmd.execute();


		}
		
		public static void pSaveglobalui(NString transType,NString systemNameIn,NString helpImageIn,NString mainMenuNameIn,NString headerImageIn,NString errorImageIn,NString warningImageIn,NString exitImageIn,NString menuImageIn,NString backImageIn,NString cssUrlIn,NString helpUrlIn,NString sctHomepageIn,NString submenuImageIn,NString appPageImageIn,NString requiredImageIn,NString helpCssUrlIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKGLUI.P_SAVEGLOBALUI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_TYPE", transType);
			cmd.addParameter("@SYSTEM_NAME_IN", systemNameIn);
			cmd.addParameter("@HELP_IMAGE_IN", helpImageIn);
			cmd.addParameter("@MAIN_MENU_NAME_IN", mainMenuNameIn);
			cmd.addParameter("@HEADER_IMAGE_IN", headerImageIn);
			cmd.addParameter("@ERROR_IMAGE_IN", errorImageIn);
			cmd.addParameter("@WARNING_IMAGE_IN", warningImageIn);
			cmd.addParameter("@EXIT_IMAGE_IN", exitImageIn);
			cmd.addParameter("@MENU_IMAGE_IN", menuImageIn);
			cmd.addParameter("@BACK_IMAGE_IN", backImageIn);
			cmd.addParameter("@CSS_URL_IN", cssUrlIn);
			cmd.addParameter("@HELP_URL_IN", helpUrlIn);
			cmd.addParameter("@SCT_HOMEPAGE_IN", sctHomepageIn);
			cmd.addParameter("@SUBMENU_IMAGE_IN", submenuImageIn);
			cmd.addParameter("@APP_PAGE_IMAGE_IN", appPageImageIn);
			cmd.addParameter("@REQUIRED_IMAGE_IN", requiredImageIn);
			cmd.addParameter("@HELP_CSS_URL_IN", helpCssUrlIn);
				
			cmd.execute();


		}
		
	
	
	
}
