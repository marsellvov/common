package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkfdbk {
		public static void pFacultyfeedback(NString pCrn,NString pTerm,NString pMsgLabel,NInteger pTargetRec,NInteger pClassSize,NInteger pSessionControlId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFDBK.P_FACULTYFEEDBACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_MSG_LABEL", pMsgLabel);
			cmd.addParameter("@P_TARGET_REC", pTargetRec);
			cmd.addParameter("@P_CLASS_SIZE", pClassSize);
			cmd.addParameter("@P_SESSION_CONTROL_ID", pSessionControlId);
				
			cmd.execute();


		}
		
//		public static void pFacultyfeedbackpost(List<OwaUtil.IdentArrRow> pPidmTab,List<OwaUtil.IdentArrRow> pEgrdeTab,List<OwaUtil.IdentArrRow> pPcheckTab,List<OwaUtil.IdentArrRow> pRcheckTab,List<OwaUtil.VcArrRow> pCommentsTab,NInteger pStudentCount,NInteger pTargetRec,NInteger pClassSize,NString pCrnIn,NInteger pSessionControlIdIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFDBK.P_FACULTYFEEDBACKPOST", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_PIDM_TAB", "", pPidmTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_EGRDE_TAB", "", pEgrdeTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PCHECK_TAB", "", pPcheckTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_RCHECK_TAB", "", pRcheckTab, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_COMMENTS_TAB", "", pCommentsTab, object.class));
//			cmd.addParameter("@P_STUDENT_COUNT", pStudentCount);
//			cmd.addParameter("@P_TARGET_REC", pTargetRec);
//			cmd.addParameter("@P_CLASS_SIZE", pClassSize);
//			cmd.addParameter("@P_CRN_IN", pCrnIn);
//			cmd.addParameter("@P_SESSION_CONTROL_ID_IN", pSessionControlIdIn);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pFeedbackTermCrn(NString pTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFDBK.P_FEEDBACK_TERM_CRN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
				
			cmd.execute();


		}
		
	
	
	
}
