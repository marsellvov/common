package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkmenu {
		public static void pCopytolocalmenuitem(NString transType,NString nameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKMENU.P_COPYTOLOCALMENUITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_TYPE", transType);
			cmd.addParameter("@NAME_IN", nameIn);
				
			cmd.execute();


		}
		
		public static void pModifypgmenuitem(NString returnCode,NString returnMsg,NString transType,NString nameIn,NString imageIn,NString sequenceIn,NString urlIn,NString urlImageIn,NString urlTextIn,NString urlDescIn,NString enabledIn,NString dbLinkIndIn,NString submenuIndIn,NString statusTextIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKMENU.P_MODIFYPGMENUITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
			cmd.addParameter("@RETURN_MSG", returnMsg);
			cmd.addParameter("@TRANS_TYPE", transType);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@IMAGE_IN", imageIn);
			cmd.addParameter("@SEQUENCE_IN", sequenceIn);
			cmd.addParameter("@URL_IN", urlIn);
			cmd.addParameter("@URL_IMAGE_IN", urlImageIn);
			cmd.addParameter("@URL_TEXT_IN", urlTextIn);
			cmd.addParameter("@URL_DESC_IN", urlDescIn);
			cmd.addParameter("@ENABLED_IN", enabledIn);
			cmd.addParameter("@DB_LINK_IND_IN", dbLinkIndIn);
			cmd.addParameter("@SUBMENU_IND_IN", submenuIndIn);
			cmd.addParameter("@STATUS_TEXT_IN", statusTextIn);
				
			cmd.execute();


		}
		
		public static void pOptionpgmenuitem() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKMENU.P_OPTIONPGMENUITEM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pReordermenuitem(NString nameIn,List<Twbklibs.Varchar2TabtypeRow> origSeqTab,List<Twbklibs.Varchar2TabtypeRow> newSeqTab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKMENU.P_REORDERMENUITEM", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@NAME_IN", nameIn);
//			// cmd.addParameter(DbTypes.getTableType("ORIG_SEQ_TAB", "", origSeqTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("NEW_SEQ_TAB", "", newSeqTab, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pReorderpgmenuitem(NString returnCode,NString returnMsg,NString nameIn,NString srchName,NString srchDesc,NString transType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKMENU.P_REORDERPGMENUITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RETURN_CODE", returnCode);
			cmd.addParameter("@RETURN_MSG", returnMsg);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@SRCH_NAME", srchName);
			cmd.addParameter("@SRCH_DESC", srchDesc);
			cmd.addParameter("@TRANS_TYPE", transType);
				
			cmd.execute();


		}
		
		public static void pSavemenuitem(NString transType,NString nameIn,NString imageIn,NString sequenceIn,NString urlIn,NString urlImageIn,NString urlTextIn,NString urlDescIn,NString enabledIn,NString dbLinkIndIn,NString submenuIndIn,NString statusTextIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKMENU.P_SAVEMENUITEM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_TYPE", transType);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@IMAGE_IN", imageIn);
			cmd.addParameter("@SEQUENCE_IN", sequenceIn);
			cmd.addParameter("@URL_IN", urlIn);
			cmd.addParameter("@URL_IMAGE_IN", urlImageIn);
			cmd.addParameter("@URL_TEXT_IN", urlTextIn);
			cmd.addParameter("@URL_DESC_IN", urlDescIn);
			cmd.addParameter("@ENABLED_IN", enabledIn);
			cmd.addParameter("@DB_LINK_IND_IN", dbLinkIndIn);
			cmd.addParameter("@SUBMENU_IND_IN", submenuIndIn);
			cmd.addParameter("@STATUS_TEXT_IN", statusTextIn);
				
			cmd.execute();


		}
		
	
	
	
}
