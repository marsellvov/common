package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvSpeling {
//		public static void acceptCorrections(NString pText,NString pFieldName,List<WwvFlowGlobal.VcArr2Row> pWords,List<WwvFlowGlobal.VcArr2Row> pLens,List<WwvFlowGlobal.VcArr2Row> pIdxs) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_SPELING.ACCEPT_CORRECTIONS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TEXT", pText);
//			cmd.addParameter("@P_FIELD_NAME", pFieldName);
//			// cmd.addParameter(DbTypes.getTableType("P_WORDS", "", pWords, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_LENS", "", pLens, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_IDXS", "", pIdxs, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void correctionFrame(NString pText,NString pFieldName,NString pHeaderProc,NString pFooterProc,NNumber pSearchType,NString pSgid,NString pUser,NString pLang,NString pFlowId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_SPELING.CORRECTION_FRAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TEXT", pText);
			cmd.addParameter("@P_FIELD_NAME", pFieldName);
			cmd.addParameter("@P_HEADER_PROC", pHeaderProc);
			cmd.addParameter("@P_FOOTER_PROC", pFooterProc);
			cmd.addParameter("@P_SEARCH_TYPE", pSearchType);
			cmd.addParameter("@P_SGID", pSgid);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_LANG", pLang);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
				
			cmd.execute();


		}
		
		public static void correctionWindow(NString pSgid,NString pUser,NString pLang,NString pFlowId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_SPELING.CORRECTION_WINDOW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SGID", pSgid);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_LANG", pLang);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
				
			cmd.execute();


		}
		
		public static void hiddenFrame(NString pWord,NString pSgid,NString pUser,NString pLang,NString pFlowId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_SPELING.HIDDEN_FRAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WORD", pWord);
			cmd.addParameter("@P_SGID", pSgid);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_LANG", pLang);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
				
			cmd.execute();


		}
		
		public static void initFieldWithImage(NString pFieldName,NString pImageName,NString pAltText,NString pImageAttributes,NNumber pSearchType,NString pSgid,NString pUser,NString pFlowId,NString pLang) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_SPELING.INIT_FIELD_WITH_IMAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FIELD_NAME", pFieldName);
			cmd.addParameter("@P_IMAGE_NAME", pImageName);
			cmd.addParameter("@P_ALT_TEXT", pAltText);
			cmd.addParameter("@P_IMAGE_ATTRIBUTES", pImageAttributes);
			cmd.addParameter("@P_SEARCH_TYPE", pSearchType);
			cmd.addParameter("@P_SGID", pSgid);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_LANG", pLang);
				
			cmd.execute();


		}
		
		public static void initPage(NString pHeaderProc,NString pFooterProc,NNumber pWindowHeight,NNumber pWindowWidth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_SPELING.INIT_PAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_HEADER_PROC", pHeaderProc);
			cmd.addParameter("@P_FOOTER_PROC", pFooterProc);
			cmd.addParameter("@P_WINDOW_HEIGHT", pWindowHeight);
			cmd.addParameter("@P_WINDOW_WIDTH", pWindowWidth);
				
			cmd.execute();


		}
		
		public static void preCorrectionFrame(NString pSgid,NString pUser,NString pLang,NString pFlowId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_SPELING.PRE_CORRECTION_FRAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SGID", pSgid);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_LANG", pLang);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
				
			cmd.execute();


		}
		
		public static void smallCorrectionWindow(NString pText,NString pFieldName,NString pSgid,NString pUser,NString pLang,NString pFlowId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_SPELING.SMALL_CORRECTION_WINDOW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TEXT", pText);
			cmd.addParameter("@P_FIELD_NAME", pFieldName);
			cmd.addParameter("@P_SGID", pSgid);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_LANG", pLang);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
				
			cmd.execute();


		}
		
	
	
	
}
