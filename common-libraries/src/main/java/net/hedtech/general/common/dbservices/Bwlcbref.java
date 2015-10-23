package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlcbref {
		public static NString fClassEmailStr(NString pTerm,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCBREF.F_CLASS_EMAIL_STR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCrseGrdeStatus(NString termIn,NNumber pidmIn,NString crnIn,NString caseIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCBREF.F_GET_CRSE_GRDE_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@CASE_IN", caseIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fGetDashboardCount(NNumber pPidm,NString pTermcutoff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCBREF.F_GET_DASHBOARD_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERMCUTOFF", pTermcutoff);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetDashboardSubj(NNumber pPidm,NNumber pNoRecs,NString pTermcutoff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCBREF.F_GET_DASHBOARD_SUBJ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_NO_RECS", pNoRecs);
			cmd.addParameter("@P_TERMCUTOFF", pTermcutoff);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetDashboardTerm(NNumber pPidm,NNumber pNoRecs,NString pTermcutoff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCBREF.F_GET_DASHBOARD_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_NO_RECS", pNoRecs);
			cmd.addParameter("@P_TERMCUTOFF", pTermcutoff);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetFacdtrange(NString pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCBREF.F_GET_FACDTRANGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetFacsch(NString pPidm,NDate pStartDate,NDate pEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCBREF.F_GET_FACSCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetFacunsch(NString pPidm,NDate pStartDate,NDate pEndDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCBREF.F_GET_FACUNSCH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fGetFinalDisplayC(NNumber pPidm,NString pTerm,NString pCrn,NString pLevel,NDate pGrdeDate,NString pCallPath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCBREF.F_GET_FINAL_DISPLAY_C", DbManager.getDataBaseFactory());
			
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
		
		public static NString fGetGrdebookLink(NNumber pPidm,NString pTerm,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCBREF.F_GET_GRDEBOOK_LINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMidtermDisplayC(NNumber pPidm,NString pTerm,NString pCrn,NString pCallPath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCBREF.F_GET_MIDTERM_DISPLAY_C", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CALL_PATH", pCallPath);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetOhr(NString pPidm,NString pTermCd,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCBREF.F_GET_OHR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CD", pTermCd);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetFacFinal(NNumber pPidm,NString pCase,NString pTermcutoff,NNumber pRownum,Ref<DataCursor> grdeAssgnFinalRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCBREF.P_GET_FAC_FINAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CASE", pCase);
			cmd.addParameter("@P_TERMCUTOFF", pTermcutoff);
			cmd.addParameter("@P_ROWNUM", pRownum);
			cmd.addParameter("@GRDE_ASSGN_FINAL_REF", DataCursor.class);
				
			cmd.execute();
			grdeAssgnFinalRef.val = cmd.getParameterValue("@GRDE_ASSGN_FINAL_REF", DataCursor.class);


		}
		
		public static void pGetFacGrdebook(NNumber pPidm,NString pCase,NString pTermcutoff,NNumber pRownum,Ref<DataCursor> grdeAssgnGrdebookRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCBREF.P_GET_FAC_GRDEBOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CASE", pCase);
			cmd.addParameter("@P_TERMCUTOFF", pTermcutoff);
			cmd.addParameter("@P_ROWNUM", pRownum);
			cmd.addParameter("@GRDE_ASSGN_GRDEBOOK_REF", DataCursor.class);
				
			cmd.execute();
			grdeAssgnGrdebookRef.val = cmd.getParameterValue("@GRDE_ASSGN_GRDEBOOK_REF", DataCursor.class);


		}
		
		public static void pGetFacMidterm(NNumber pPidm,NString pCase,NString pTermcutoff,NNumber pRownum,Ref<DataCursor> grdeAssgnMidtermRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCBREF.P_GET_FAC_MIDTERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CASE", pCase);
			cmd.addParameter("@P_TERMCUTOFF", pTermcutoff);
			cmd.addParameter("@P_ROWNUM", pRownum);
			cmd.addParameter("@GRDE_ASSGN_MIDTERM_REF", DataCursor.class);
				
			cmd.execute();
			grdeAssgnMidtermRef.val = cmd.getParameterValue("@GRDE_ASSGN_MIDTERM_REF", DataCursor.class);


		}
		
		public static void pGetViewTermSelect(Ref<DataCursor> pViewTermSelectRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLCBREF.P_GET_VIEW_TERM_SELECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_VIEW_TERM_SELECT_REF", DataCursor.class);
				
			cmd.execute();
			pViewTermSelectRef.val = cmd.getParameterValue("@P_VIEW_TERM_SELECT_REF", DataCursor.class);


		}
		
	
	
	@DbRecordType(id="FacschRecRow", dataSourceName="FACSCH_REC")
	public static class FacschRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_CRN")
		public NString RCrn;
		@DbRecordField(dataSourceName="R_SUBJ_CODE")
		public NString RSubjCode;
		@DbRecordField(dataSourceName="R_CRSE_NUMB")
		public NString RCrseNumb;
		@DbRecordField(dataSourceName="R_SEQ_NUMB")
		public NString RSeqNumb;
		@DbRecordField(dataSourceName="R_MON_DAY")
		public NString RMonDay;
		@DbRecordField(dataSourceName="R_TUE_DAY")
		public NString RTueDay;
		@DbRecordField(dataSourceName="R_WED_DAY")
		public NString RWedDay;
		@DbRecordField(dataSourceName="R_THU_DAY")
		public NString RThuDay;
		@DbRecordField(dataSourceName="R_FRI_DAY")
		public NString RFriDay;
		@DbRecordField(dataSourceName="R_SAT_DAY")
		public NString RSatDay;
		@DbRecordField(dataSourceName="R_SUN_DAY")
		public NString RSunDay;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_START_DATE")
		public NDate RStartDate;
		@DbRecordField(dataSourceName="R_SFRAREG_START_DATE")
		public NDate RSfraregStartDate;
		@DbRecordField(dataSourceName="R_COMPLETION_DATE")
		public NDate RCompletionDate;
		@DbRecordField(dataSourceName="R_BEGIN_TIME")
		public NString RBeginTime;
		@DbRecordField(dataSourceName="R_END_TIME")
		public NString REndTime;
		@DbRecordField(dataSourceName="R_BEGIN_TIME_DISP")
		public NString RBeginTimeDisp;
		@DbRecordField(dataSourceName="R_END_TIME_DISP")
		public NString REndTimeDisp;
		@DbRecordField(dataSourceName="R_BLDG_CODE")
		public NString RBldgCode;
		@DbRecordField(dataSourceName="R_ROOM_CODE")
		public NString RRoomCode;
		@DbRecordField(dataSourceName="R_MTYP_CODE")
		public NString RMtypCode;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_OHR_LINK")
		public NString ROhrLink;
		@DbRecordField(dataSourceName="R_BLDG_DESC")
		public NString RBldgDesc;
		@DbRecordField(dataSourceName="R_SECTION_NO")
		public NString RSectionNo;
		@DbRecordField(dataSourceName="R_CRSE_TITLE")
		public NString RCrseTitle;
	}

	
	@DbRecordType(id="FacunschRecRow", dataSourceName="FACUNSCH_REC")
	public static class FacunschRecRow
	{
		@DbRecordField(dataSourceName="R_SUBJ_CODE")
		public NString RSubjCode;
		@DbRecordField(dataSourceName="R_CRSE_NUMB")
		public NString RCrseNumb;
		@DbRecordField(dataSourceName="R_SEQ_NUMB")
		public NString RSeqNumb;
		@DbRecordField(dataSourceName="R_CRN")
		public NString RCrn;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_PTRM_CODE")
		public NString RPtrmCode;
	}

	
	@DbRecordType(id="ScbrseRecRow", dataSourceName="SCBRSE_REC")
	public static class ScbrseRecRow
	{
		@DbRecordField(dataSourceName="R_SCBCRSE_TITLE")
		public NString RScbcrseTitle;
		@DbRecordField(dataSourceName="R_SCBCRSE_SUBJ_CODE")
		public NString RScbcrseSubjCode;
		@DbRecordField(dataSourceName="R_SCBCRSE_CRSE_NUMB")
		public NString RScbcrseCrseNumb;
		@DbRecordField(dataSourceName="R_TERM_DESC")
		public NString RTermDesc;
		@DbRecordField(dataSourceName="R_WAIT_CAPACITY")
		public NNumber RWaitCapacity;
		@DbRecordField(dataSourceName="R_COURSE_LINK")
		public NString RCourseLink;
		@DbRecordField(dataSourceName="R_CLASSLIST_LINK")
		public NString RClasslistLink;
		@DbRecordField(dataSourceName="R_SYLL_LINK")
		public NString RSyllLink;
		@DbRecordField(dataSourceName="R_WAITLIST_LINK")
		public NString RWaitlistLink;
		@DbRecordField(dataSourceName="R_EMAIL_LINK")
		public NString REmailLink;
		@DbRecordField(dataSourceName="R_EMAIL_ERROR")
		public NString REmailError;
		@DbRecordField(dataSourceName="R_OHR_LINK")
		public NString ROhrLink;
	}

	
	@DbRecordType(id="ScbrseRecCountRow", dataSourceName="SCBRSE_REC_COUNT")
	public static class ScbrseRecCountRow
	{
		@DbRecordField(dataSourceName="R_SCBCRSE_COUNT")
		public NNumber RScbcrseCount;
	}

	
	
}
