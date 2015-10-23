package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwscbref {
		public static NString fGetClassDesc(NNumber pPidm,NString pLevel,NString pTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCBREF.F_GET_CLASS_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LEVEL", pLevel);
			cmd.addParameter("@P_TERM", pTerm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetFinalDisplayC(NNumber pPidm,NString pTerm,NString pCrn,NString pLevel,NDate pGrdeDate,NString pCallPath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCBREF.F_GET_FINAL_DISPLAY_C", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_LEVEL", pLevel);
			cmd.addParameter("@P_GRDE_DATE", pGrdeDate);
			cmd.addParameter("@P_CALL_PATH", pCallPath);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGrdebookGradeExist(NNumber pPidm,NString pTerm,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCBREF.F_GET_GRDEBOOK_GRADE_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGrdebookLink(NNumber pPidm,NString pTerm,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCBREF.F_GET_GRDEBOOK_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMidtermDisplayC(NNumber pPidm,NString pTerm,NString pCrn,NString pCallPath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCBREF.F_GET_MIDTERM_DISPLAY_C", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CALL_PATH", pCallPath);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetRegcrsec(NNumber pPidm,NString pTerm,NString pCrn,NString pHistInd,Ref<DataCursor> pStudentGradesRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCBREF.P_GET_REGCRSEC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_HIST_IND", pHistInd);
			cmd.addParameter("@P_STUDENT_GRADES_REF", DataCursor.class);
				
			cmd.execute();
			pStudentGradesRef.val = cmd.getParameterValue("@P_STUDENT_GRADES_REF", DataCursor.class);


		}
		
		public static void pGetStatement(NNumber pPidm,NNumber pStmtNum,Ref<DataCursor> stmtRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCBREF.P_GET_STATEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_STMT_NUM", pStmtNum);
			cmd.addParameter("@STMT_REF", DataCursor.class);
				
			cmd.execute();
			stmtRef.val = cmd.getParameterValue("@STMT_REF", DataCursor.class);


		}
		
		public static void pGetStudentAdvisors(NNumber pPidm,NString pTerm,Ref<DataCursor> pStudentAdvisorsRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCBREF.P_GET_STUDENT_ADVISORS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_STUDENT_ADVISORS_REF", DataCursor.class);
				
			cmd.execute();
			pStudentAdvisorsRef.val = cmd.getParameterValue("@P_STUDENT_ADVISORS_REF", DataCursor.class);


		}
		
		public static void pGetStudentCurriculum(NNumber pPidm,NString pTerm,NString pTermOrPriority,Ref<DataCursor> pStudentCurriculumRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCBREF.P_GET_STUDENT_CURRICULUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_TERM_OR_PRIORITY", pTermOrPriority);
			cmd.addParameter("@P_STUDENT_CURRICULUM_REF", DataCursor.class);
				
			cmd.execute();
			pStudentCurriculumRef.val = cmd.getParameterValue("@P_STUDENT_CURRICULUM_REF", DataCursor.class);


		}
		
		public static void pGetTermAcctSummary(NNumber pPidm,Ref<DataCursor> acctTermRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCBREF.P_GET_TERM_ACCT_SUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@ACCT_TERM_REF", DataCursor.class);
				
			cmd.execute();
			acctTermRef.val = cmd.getParameterValue("@ACCT_TERM_REF", DataCursor.class);


		}
		
		public static void pGetViewTermSelect(Ref<DataCursor> pViewTermSelectRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSCBREF.P_GET_VIEW_TERM_SELECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VIEW_TERM_SELECT_REF", DataCursor.class);
				
			cmd.execute();
			pViewTermSelectRef.val = cmd.getParameterValue("@P_VIEW_TERM_SELECT_REF", DataCursor.class);


		}
		
	
	
	
}
