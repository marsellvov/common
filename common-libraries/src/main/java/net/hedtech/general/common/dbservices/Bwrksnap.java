package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwrksnap {
		public static void pDispFasnap(NString pId,NString pAidy,NString pApplication,NString pSelection,NString pCreator,NString pUser,NString pPopselDispInd,NNumber pPopselRecordNo,NString pLayout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKSNAP.P_DISP_FASNAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_AIDY", pAidy);
			cmd.addParameter("@P_APPLICATION", pApplication);
			cmd.addParameter("@P_SELECTION", pSelection);
			cmd.addParameter("@P_CREATOR", pCreator);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_POPSEL_DISP_IND", pPopselDispInd);
			cmd.addParameter("@P_POPSEL_RECORD_NO", pPopselRecordNo);
			cmd.addParameter("@P_LAYOUT", pLayout);
				
			cmd.execute();


		}
		
		public static void pDispPanes(NString pWspaCode,NNumber pSeq,NString pError) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKSNAP.P_DISP_PANES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WSPA_CODE", pWspaCode);
			cmd.addParameter("@P_SEQ", pSeq);
			cmd.addParameter("@P_ERROR", pError);
				
			cmd.execute();


		}
		
//		public static void pProcLayoutUpdate(List<OwaUtil.IdentArrRow> pPanes,List<OwaUtil.IdentArrRow> pSecWidth,List<OwaUtil.IdentArrRow> pRowNum,List<OwaUtil.IdentArrRow> pColNum,List<OwaUtil.IdentArrRow> pRowHeight,NString pLayout,NString pNewLayout,NString pButton,NNumber pColCount,NNumber pRowCount) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKSNAP.P_PROC_LAYOUT_UPDATE", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_PANES", "", pPanes, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SEC_WIDTH", "", pSecWidth, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ROW_NUM", "", pRowNum, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COL_NUM", "", pColNum, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ROW_HEIGHT", "", pRowHeight, object.class));
//			cmd.addParameter("@P_LAYOUT", pLayout);
//			cmd.addParameter("@P_NEW_LAYOUT", pNewLayout);
//			cmd.addParameter("@P_BUTTON", pButton);
//			cmd.addParameter("@P_COL_COUNT", pColCount);
//			cmd.addParameter("@P_ROW_COUNT", pRowCount);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pProcPanes(NString pWspaCode,NNumber pSeq,NString pDesc,NNumber pColumns,NString pLargeText,NString pSql,NString pButton,NNumber pColCount,NNumber pRowCount,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKSNAP.P_PROC_PANES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_WSPA_CODE", pWspaCode);
			cmd.addParameter("@P_SEQ", pSeq);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_COLUMNS", pColumns);
			cmd.addParameter("@P_LARGE_TEXT", pLargeText);
			cmd.addParameter("@P_SQL", pSql);
			cmd.addParameter("@P_BUTTON", pButton);
			cmd.addParameter("@P_COL_COUNT", pColCount);
			cmd.addParameter("@P_ROW_COUNT", pRowCount);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateLayout() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWRKSNAP.P_UPDATE_LAYOUT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
