package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwckfrmt {
		public static NString fAnchorFocus(NString textIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKFRMT.F_ANCHOR_FOCUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TEXT_IN", textIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispInstrEmailIcon(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKFRMT.F_DISP_INSTR_EMAIL_ICON", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDispinfo(NString pName,NString pLabel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKFRMT.F_DISPINFO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_LABEL", pLabel);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTranslateString(NString pString) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKFRMT.F_TRANSLATE_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING", pString);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDegreeCurriculum(NNumber pSeqNo,NString pTprtCode,NString pLevl,NNumber pColspan1,NNumber pColspan2,NNumber pColspan3,NNumber pCol1Width,NString pDispLevl,NString pDispDegc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKFRMT.P_DEGREE_CURRICULUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_TPRT_CODE", pTprtCode);
			cmd.addParameter("@P_LEVL", pLevl);
			cmd.addParameter("@P_COLSPAN1", pColspan1);
			cmd.addParameter("@P_COLSPAN2", pColspan2);
			cmd.addParameter("@P_COLSPAN3", pColspan3);
			cmd.addParameter("@P_COL1_WIDTH", pCol1Width);
			cmd.addParameter("@P_DISP_LEVL", pDispLevl);
			cmd.addParameter("@P_DISP_DEGC", pDispDegc);
				
			cmd.execute();


		}
		
		public static void pDispBackAnchor() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKFRMT.P_DISP_BACK_ANCHOR", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispCreditHours(NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKFRMT.P_DISP_CREDIT_HOURS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
		public static void pDispGradeMode(NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKFRMT.P_DISP_GRADE_MODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
		public static void pDispInstrEmailIcon(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKFRMT.P_DISP_INSTR_EMAIL_ICON", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pDispLevel(NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKFRMT.P_DISP_LEVEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
		public static void pDispMeetingTimes(NString termIn,NString crnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKFRMT.P_DISP_MEETING_TIMES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
				
			cmd.execute();


		}
		
		public static void pInstructorLinks(NString pTerm,NString pCrn,NString pPtrmCode,NNumber pPidm,NString pCallPath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKFRMT.P_INSTRUCTOR_LINKS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PTRM_CODE", pPtrmCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CALL_PATH", pCallPath);
				
			cmd.execute();


		}
		
		public static void pInstructorList(NString pTerm,NString pCrn,NString pCat,NBool pDisplayEmail) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKFRMT.P_INSTRUCTOR_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CAT", pCat);
			cmd.addParameter("@P_DISPLAY_EMAIL", pDisplayEmail);
				
			cmd.execute();


		}
		
		public static void pOfficeHours(NString termIn,NString crnIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKFRMT.P_OFFICE_HOURS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pOpenDoc(NString procedureNameIn,NString termIn,NString headerTextIn,NBool multiTermIn,NString termFromIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKFRMT.P_OPEN_DOC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROCEDURE_NAME_IN", procedureNameIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@HEADER_TEXT_IN", headerTextIn);
			cmd.addParameter("@MULTI_TERM_IN", multiTermIn);
			cmd.addParameter("@TERM_FROM_IN", termFromIn);
				
			cmd.execute();


		}
		
		public static void pStudentCurriculum(NString pTerm,NString pTprtCode,NString pLevl,NNumber pColspan1,NNumber pColspan2,NNumber pColspan3,NNumber pCol1Width,NNumber pSeqno,NString pDispLevl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKFRMT.P_STUDENT_CURRICULUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_TPRT_CODE", pTprtCode);
			cmd.addParameter("@P_LEVL", pLevl);
			cmd.addParameter("@P_COLSPAN1", pColspan1);
			cmd.addParameter("@P_COLSPAN2", pColspan2);
			cmd.addParameter("@P_COLSPAN3", pColspan3);
			cmd.addParameter("@P_COL1_WIDTH", pCol1Width);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_DISP_LEVL", pDispLevl);
				
			cmd.execute();


		}
		
	
	
	
}
