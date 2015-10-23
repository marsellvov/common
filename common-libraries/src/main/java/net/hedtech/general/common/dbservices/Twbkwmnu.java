package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkwmnu {
		public static void pCopytolocalpgwebmain(NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWMNU.P_COPYTOLOCALPGWEBMAIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();


		}
		
		public static void pDisplayWebProcedures(NString srchName,NString srchDesc,NString nextProcedure,NString parmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWMNU.P_DISPLAY_WEB_PROCEDURES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCH_NAME", srchName);
			cmd.addParameter("@SRCH_DESC", srchDesc);
			cmd.addParameter("@NEXT_PROCEDURE", nextProcedure);
			cmd.addParameter("@PARM_IN", parmIn);
				
			cmd.execute();


		}
		
		public static void pModifypgwebmain(NString returnCode,NString returnMsg,NString transType,NString nameIn,NString descIn,NString pageTitleIn,NString headerIn,NString headerImageIn,NString pageCssUrlIn,NString mapTitleIn,NString cacheIndIn,NString exitImageIn,NString menuImageIn,NString helpUrlIn,NString helpCssUrlIn,NString helpImageIn,NString commentIn,NString backUrlIn,NString backLinkIn,NString backImageIn,NString backMenuIndIn,NString admAccessIndIn,NString moduleIn,NString enabledIndIn,NString insecureAllowedIndIn,NString origNameIn,NString srchName,NString srchDesc,NString printCssUrlIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWMNU.P_MODIFYPGWEBMAIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
			cmd.addParameter("@RETURN_MSG", returnMsg);
			cmd.addParameter("@TRANS_TYPE", transType);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@DESC_IN", descIn);
			cmd.addParameter("@PAGE_TITLE_IN", pageTitleIn);
			cmd.addParameter("@HEADER_IN", headerIn);
			cmd.addParameter("@HEADER_IMAGE_IN", headerImageIn);
			cmd.addParameter("@PAGE_CSS_URL_IN", pageCssUrlIn);
			cmd.addParameter("@MAP_TITLE_IN", mapTitleIn);
			cmd.addParameter("@CACHE_IND_IN", cacheIndIn);
			cmd.addParameter("@EXIT_IMAGE_IN", exitImageIn);
			cmd.addParameter("@MENU_IMAGE_IN", menuImageIn);
			cmd.addParameter("@HELP_URL_IN", helpUrlIn);
			cmd.addParameter("@HELP_CSS_URL_IN", helpCssUrlIn);
			cmd.addParameter("@HELP_IMAGE_IN", helpImageIn);
			cmd.addParameter("@COMMENT_IN", commentIn);
			cmd.addParameter("@BACK_URL_IN", backUrlIn);
			cmd.addParameter("@BACK_LINK_IN", backLinkIn);
			cmd.addParameter("@BACK_IMAGE_IN", backImageIn);
			cmd.addParameter("@BACK_MENU_IND_IN", backMenuIndIn);
			cmd.addParameter("@ADM_ACCESS_IND_IN", admAccessIndIn);
			cmd.addParameter("@MODULE_IN", moduleIn);
			cmd.addParameter("@ENABLED_IND_IN", enabledIndIn);
			cmd.addParameter("@INSECURE_ALLOWED_IND_IN", insecureAllowedIndIn);
			cmd.addParameter("@ORIG_NAME_IN", origNameIn);
			cmd.addParameter("@SRCH_NAME", srchName);
			cmd.addParameter("@SRCH_DESC", srchDesc);
			cmd.addParameter("@PRINT_CSS_URL_IN", printCssUrlIn);
				
			cmd.execute();


		}
		
		public static void pOptionpgwebmain(NString returnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWMNU.P_OPTIONPGWEBMAIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
				
			cmd.execute();


		}
		
//		public static void pSavewebmain(NString transType,NString submitbutton,NString nameIn,NString descIn,NString pageTitleIn,NString headerIn,NString headerImageIn,NString pageCssUrlIn,NString mapTitleIn,NString cacheIndIn,NString exitImageIn,NString menuImageIn,NString helpUrlIn,NString helpCssUrlIn,NString helpImageIn,NString commentIn,NString backUrlIn,NString backLinkIn,NString backImageIn,NString backMenuIndIn,NString admAccessIndIn,NString moduleIn,NString enabledIndIn,NString insecureAllowedIndIn,List<Twbklibs.Varchar2TabtypeRow> roleTableIn,NString numRolesIn,NString origNameIn,NString printCssUrlIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKWMNU.P_SAVEWEBMAIN", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TRANS_TYPE", transType);
//			cmd.addParameter("@SUBMITBUTTON", submitbutton);
//			cmd.addParameter("@NAME_IN", nameIn);
//			cmd.addParameter("@DESC_IN", descIn);
//			cmd.addParameter("@PAGE_TITLE_IN", pageTitleIn);
//			cmd.addParameter("@HEADER_IN", headerIn);
//			cmd.addParameter("@HEADER_IMAGE_IN", headerImageIn);
//			cmd.addParameter("@PAGE_CSS_URL_IN", pageCssUrlIn);
//			cmd.addParameter("@MAP_TITLE_IN", mapTitleIn);
//			cmd.addParameter("@CACHE_IND_IN", cacheIndIn);
//			cmd.addParameter("@EXIT_IMAGE_IN", exitImageIn);
//			cmd.addParameter("@MENU_IMAGE_IN", menuImageIn);
//			cmd.addParameter("@HELP_URL_IN", helpUrlIn);
//			cmd.addParameter("@HELP_CSS_URL_IN", helpCssUrlIn);
//			cmd.addParameter("@HELP_IMAGE_IN", helpImageIn);
//			cmd.addParameter("@COMMENT_IN", commentIn);
//			cmd.addParameter("@BACK_URL_IN", backUrlIn);
//			cmd.addParameter("@BACK_LINK_IN", backLinkIn);
//			cmd.addParameter("@BACK_IMAGE_IN", backImageIn);
//			cmd.addParameter("@BACK_MENU_IND_IN", backMenuIndIn);
//			cmd.addParameter("@ADM_ACCESS_IND_IN", admAccessIndIn);
//			cmd.addParameter("@MODULE_IN", moduleIn);
//			cmd.addParameter("@ENABLED_IND_IN", enabledIndIn);
//			cmd.addParameter("@INSECURE_ALLOWED_IND_IN", insecureAllowedIndIn);
//			// cmd.addParameter(DbTypes.getTableType("ROLE_TABLE_IN", "", roleTableIn, object.class));
//			cmd.addParameter("@NUM_ROLES_IN", numRolesIn);
//			cmd.addParameter("@ORIG_NAME_IN", origNameIn);
//			cmd.addParameter("@PRINT_CSS_URL_IN", printCssUrlIn);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
