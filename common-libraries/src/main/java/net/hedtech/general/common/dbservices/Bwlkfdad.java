package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkfdad {
		public static void pAddSession(NString pTermCode,NString pDescription,NString pStartDate,NString pEndDate,NString pSuspendInd,NString pAddComments,NString pAddRecommends,NString pCallSource) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFDAD.P_ADD_SESSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_SUSPEND_IND", pSuspendInd);
			cmd.addParameter("@P_ADD_COMMENTS", pAddComments);
			cmd.addParameter("@P_ADD_RECOMMENDS", pAddRecommends);
			cmd.addParameter("@P_CALL_SOURCE", pCallSource);
				
			cmd.execute();


		}
		
		public static void pAddSessionPost(NString pTermCode,NString pDescription,NString pStartDate,NString pEndDate,NString pSuspendInd,NString pAddComments,NString pAddRecommends,NString pSubmitButton) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFDAD.P_ADD_SESSION_POST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_SUSPEND_IND", pSuspendInd);
			cmd.addParameter("@P_ADD_COMMENTS", pAddComments);
			cmd.addParameter("@P_ADD_RECOMMENDS", pAddRecommends);
			cmd.addParameter("@P_SUBMIT_BUTTON", pSubmitButton);
				
			cmd.execute();


		}
		
//		public static void pDefineIssues(NString modeIn,List<OwaUtil.IdentArrRow> pIdTab,List<OwaUtil.IdentArrRow> pDescriptionTab,List<OwaUtil.IdentArrRow> pActiveIndTab,List<OwaUtil.IdentArrRow> pDeleteIndTab,List<OwaUtil.IdentArrRow> pVersionTab,NString pCode,NString pDesc,NString pActiveInd) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFDAD.P_DEFINE_ISSUES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@MODE_IN", modeIn);
//			// cmd.addParameter(DbTypes.getTableType("P_ID_TAB", "", pIdTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_DESCRIPTION_TAB", "", pDescriptionTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ACTIVE_IND_TAB", "", pActiveIndTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_DELETE_IND_TAB", "", pDeleteIndTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_VERSION_TAB", "", pVersionTab, object.class));
//			cmd.addParameter("@P_CODE", pCode);
//			cmd.addParameter("@P_DESC", pDesc);
//			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pDefineRecommendations(NString modeIn,List<OwaUtil.IdentArrRow> pIdTab,List<OwaUtil.IdentArrRow> pDescriptionTab,List<OwaUtil.IdentArrRow> pActiveIndTab,List<OwaUtil.IdentArrRow> pDeleteIndTab,List<OwaUtil.IdentArrRow> pVersionTab,NString pCode,NString pDesc,NString pActiveInd) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFDAD.P_DEFINE_RECOMMENDATIONS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@MODE_IN", modeIn);
//			// cmd.addParameter(DbTypes.getTableType("P_ID_TAB", "", pIdTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_DESCRIPTION_TAB", "", pDescriptionTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ACTIVE_IND_TAB", "", pActiveIndTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_DELETE_IND_TAB", "", pDeleteIndTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_VERSION_TAB", "", pVersionTab, object.class));
//			cmd.addParameter("@P_CODE", pCode);
//			cmd.addParameter("@P_DESC", pDesc);
//			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pSessionControl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFDAD.P_SESSION_CONTROL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
//		public static void pSessionControlPost(List<OwaUtil.IdentArrRow> pSessionIdTab,List<OwaUtil.IdentArrRow> pTermCodeTab,List<OwaUtil.IdentArrRow> pDescriptionTab,List<OwaUtil.IdentArrRow> pStartDateTab,List<OwaUtil.IdentArrRow> pEndDateTab,List<OwaUtil.IdentArrRow> pSuspendIndTab,List<OwaUtil.IdentArrRow> pAddCommentsTab,List<OwaUtil.IdentArrRow> pAddRecommendsTab,List<OwaUtil.IdentArrRow> pVersionTab,List<OwaUtil.IdentArrRow> pRecordSelectedTab,NString pSubmitButton) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFDAD.P_SESSION_CONTROL_POST", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_SESSION_ID_TAB", "", pSessionIdTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_TERM_CODE_TAB", "", pTermCodeTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_DESCRIPTION_TAB", "", pDescriptionTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_START_DATE_TAB", "", pStartDateTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_END_DATE_TAB", "", pEndDateTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_SUSPEND_IND_TAB", "", pSuspendIndTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ADD_COMMENTS_TAB", "", pAddCommentsTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ADD_RECOMMENDS_TAB", "", pAddRecommendsTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_VERSION_TAB", "", pVersionTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_RECORD_SELECTED_TAB", "", pRecordSelectedTab, object.class));
//			cmd.addParameter("@P_SUBMIT_BUTTON", pSubmitButton);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
