package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbGvrsrvy {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pSrn,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GvrsrvyRecRow recOne,GvrsrvyRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GvrsrvyRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GvrsrvyRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pSrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SRN", pSrn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pSrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SRN", pSrn);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pSrn,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pSrn,NString pGsrcCode,NString pStatusInd,NString pAnonymInd,NDate pDispFromDate,NDate pDispToDate,NString pCreator,NString pTargetCode,NNumber pObjectPidm,NNumber pCompleteSurveys,NDate pLastAnswDate,NClob pInfoText,NClob pComments,NString pPopselInd,NString pPsApplicationId,NString pPsSelectionId,NString pPsCreator,NString pPsUser,NString pStudentInd,NString pStuTermCode,NString pStuCrn,NString pStuSubjCode,NString pStuCrseNumb,NString pStuCampusCode,NString pStuCollCode,NString pStuProgramCode,NString pStuMajorCode,NString pStuStypCode,NString pStuAstdCode,NString pStuLevlCode,NString pStuDegcCode,NString pFacultyInd,NString pFacTermCode,NString pFacCrn,NString pFacSubjCode,NString pFacCrseNumb,NString pFacTeacherInd,NString pFacAdvisorInd,NString pFacFctgCode,NString pFacFstpCode,NString pFacCollCode,NString pFacDeptCode,NString pAlumniInd,NString pAluDonrCode,NString pAluPrefClas,NString pEmployeeInd,NString pEmpEclsCode,NString pEmpOrgnCode,NString pEmpPclsCode,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_ANONYM_IND", pAnonymInd);
			cmd.addParameter("@P_DISP_FROM_DATE", pDispFromDate);
			cmd.addParameter("@P_DISP_TO_DATE", pDispToDate);
			cmd.addParameter("@P_CREATOR", pCreator);
			cmd.addParameter("@P_TARGET_CODE", pTargetCode);
			cmd.addParameter("@P_OBJECT_PIDM", pObjectPidm);
			cmd.addParameter("@P_COMPLETE_SURVEYS", pCompleteSurveys);
			cmd.addParameter("@P_LAST_ANSW_DATE", pLastAnswDate);
			cmd.addParameter("@P_INFO_TEXT", pInfoText);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_POPSEL_IND", pPopselInd);
			cmd.addParameter("@P_PS_APPLICATION_ID", pPsApplicationId);
			cmd.addParameter("@P_PS_SELECTION_ID", pPsSelectionId);
			cmd.addParameter("@P_PS_CREATOR", pPsCreator);
			cmd.addParameter("@P_PS_USER", pPsUser);
			cmd.addParameter("@P_STUDENT_IND", pStudentInd);
			cmd.addParameter("@P_STU_TERM_CODE", pStuTermCode);
			cmd.addParameter("@P_STU_CRN", pStuCrn);
			cmd.addParameter("@P_STU_SUBJ_CODE", pStuSubjCode);
			cmd.addParameter("@P_STU_CRSE_NUMB", pStuCrseNumb);
			cmd.addParameter("@P_STU_CAMPUS_CODE", pStuCampusCode);
			cmd.addParameter("@P_STU_COLL_CODE", pStuCollCode);
			cmd.addParameter("@P_STU_PROGRAM_CODE", pStuProgramCode);
			cmd.addParameter("@P_STU_MAJOR_CODE", pStuMajorCode);
			cmd.addParameter("@P_STU_STYP_CODE", pStuStypCode);
			cmd.addParameter("@P_STU_ASTD_CODE", pStuAstdCode);
			cmd.addParameter("@P_STU_LEVL_CODE", pStuLevlCode);
			cmd.addParameter("@P_STU_DEGC_CODE", pStuDegcCode);
			cmd.addParameter("@P_FACULTY_IND", pFacultyInd);
			cmd.addParameter("@P_FAC_TERM_CODE", pFacTermCode);
			cmd.addParameter("@P_FAC_CRN", pFacCrn);
			cmd.addParameter("@P_FAC_SUBJ_CODE", pFacSubjCode);
			cmd.addParameter("@P_FAC_CRSE_NUMB", pFacCrseNumb);
			cmd.addParameter("@P_FAC_TEACHER_IND", pFacTeacherInd);
			cmd.addParameter("@P_FAC_ADVISOR_IND", pFacAdvisorInd);
			cmd.addParameter("@P_FAC_FCTG_CODE", pFacFctgCode);
			cmd.addParameter("@P_FAC_FSTP_CODE", pFacFstpCode);
			cmd.addParameter("@P_FAC_COLL_CODE", pFacCollCode);
			cmd.addParameter("@P_FAC_DEPT_CODE", pFacDeptCode);
			cmd.addParameter("@P_ALUMNI_IND", pAlumniInd);
			cmd.addParameter("@P_ALU_DONR_CODE", pAluDonrCode);
			cmd.addParameter("@P_ALU_PREF_CLAS", pAluPrefClas);
			cmd.addParameter("@P_EMPLOYEE_IND", pEmployeeInd);
			cmd.addParameter("@P_EMP_ECLS_CODE", pEmpEclsCode);
			cmd.addParameter("@P_EMP_ORGN_CODE", pEmpOrgnCode);
			cmd.addParameter("@P_EMP_PCLS_CODE", pEmpPclsCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pCreateToclob(NNumber pSrn,NString pGsrcCode,NString pStatusInd,NString pAnonymInd,NDate pDispFromDate,NDate pDispToDate,NString pCreator,NString pTargetCode,NNumber pObjectPidm,NNumber pCompleteSurveys,NDate pLastAnswDate,NClob pInfoText,NClob pComments,NString pPopselInd,NString pPsApplicationId,NString pPsSelectionId,NString pPsCreator,NString pPsUser,NString pStudentInd,NString pStuTermCode,NString pStuCrn,NString pStuSubjCode,NString pStuCrseNumb,NString pStuCampusCode,NString pStuCollCode,NString pStuProgramCode,NString pStuMajorCode,NString pStuStypCode,NString pStuAstdCode,NString pStuLevlCode,NString pStuDegcCode,NString pFacultyInd,NString pFacTermCode,NString pFacCrn,NString pFacSubjCode,NString pFacCrseNumb,NString pFacTeacherInd,NString pFacAdvisorInd,NString pFacFctgCode,NString pFacFstpCode,NString pFacCollCode,NString pFacDeptCode,NString pAlumniInd,NString pAluDonrCode,NString pAluPrefClas,NString pEmployeeInd,NString pEmpEclsCode,NString pEmpOrgnCode,NString pEmpPclsCode,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY.P_CREATE_TOCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_ANONYM_IND", pAnonymInd);
			cmd.addParameter("@P_DISP_FROM_DATE", pDispFromDate);
			cmd.addParameter("@P_DISP_TO_DATE", pDispToDate);
			cmd.addParameter("@P_CREATOR", pCreator);
			cmd.addParameter("@P_TARGET_CODE", pTargetCode);
			cmd.addParameter("@P_OBJECT_PIDM", pObjectPidm);
			cmd.addParameter("@P_COMPLETE_SURVEYS", pCompleteSurveys);
			cmd.addParameter("@P_LAST_ANSW_DATE", pLastAnswDate);
			cmd.addParameter("@P_INFO_TEXT", pInfoText);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_POPSEL_IND", pPopselInd);
			cmd.addParameter("@P_PS_APPLICATION_ID", pPsApplicationId);
			cmd.addParameter("@P_PS_SELECTION_ID", pPsSelectionId);
			cmd.addParameter("@P_PS_CREATOR", pPsCreator);
			cmd.addParameter("@P_PS_USER", pPsUser);
			cmd.addParameter("@P_STUDENT_IND", pStudentInd);
			cmd.addParameter("@P_STU_TERM_CODE", pStuTermCode);
			cmd.addParameter("@P_STU_CRN", pStuCrn);
			cmd.addParameter("@P_STU_SUBJ_CODE", pStuSubjCode);
			cmd.addParameter("@P_STU_CRSE_NUMB", pStuCrseNumb);
			cmd.addParameter("@P_STU_CAMPUS_CODE", pStuCampusCode);
			cmd.addParameter("@P_STU_COLL_CODE", pStuCollCode);
			cmd.addParameter("@P_STU_PROGRAM_CODE", pStuProgramCode);
			cmd.addParameter("@P_STU_MAJOR_CODE", pStuMajorCode);
			cmd.addParameter("@P_STU_STYP_CODE", pStuStypCode);
			cmd.addParameter("@P_STU_ASTD_CODE", pStuAstdCode);
			cmd.addParameter("@P_STU_LEVL_CODE", pStuLevlCode);
			cmd.addParameter("@P_STU_DEGC_CODE", pStuDegcCode);
			cmd.addParameter("@P_FACULTY_IND", pFacultyInd);
			cmd.addParameter("@P_FAC_TERM_CODE", pFacTermCode);
			cmd.addParameter("@P_FAC_CRN", pFacCrn);
			cmd.addParameter("@P_FAC_SUBJ_CODE", pFacSubjCode);
			cmd.addParameter("@P_FAC_CRSE_NUMB", pFacCrseNumb);
			cmd.addParameter("@P_FAC_TEACHER_IND", pFacTeacherInd);
			cmd.addParameter("@P_FAC_ADVISOR_IND", pFacAdvisorInd);
			cmd.addParameter("@P_FAC_FCTG_CODE", pFacFctgCode);
			cmd.addParameter("@P_FAC_FSTP_CODE", pFacFstpCode);
			cmd.addParameter("@P_FAC_COLL_CODE", pFacCollCode);
			cmd.addParameter("@P_FAC_DEPT_CODE", pFacDeptCode);
			cmd.addParameter("@P_ALUMNI_IND", pAlumniInd);
			cmd.addParameter("@P_ALU_DONR_CODE", pAluDonrCode);
			cmd.addParameter("@P_ALU_PREF_CLAS", pAluPrefClas);
			cmd.addParameter("@P_EMPLOYEE_IND", pEmployeeInd);
			cmd.addParameter("@P_EMP_ECLS_CODE", pEmpEclsCode);
			cmd.addParameter("@P_EMP_ORGN_CODE", pEmpOrgnCode);
			cmd.addParameter("@P_EMP_PCLS_CODE", pEmpPclsCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pCreateToclob(NNumber pSrn,NString pGsrcCode,NString pStatusInd,NString pAnonymInd,NDate pDispFromDate,NDate pDispToDate,NString pCreator,NString pTargetCode,NNumber pObjectPidm,NNumber pCompleteSurveys,NDate pLastAnswDate,NString pInfoText,NString pComments,NString pPopselInd,NString pPsApplicationId,NString pPsSelectionId,NString pPsCreator,NString pPsUser,NString pStudentInd,NString pStuTermCode,NString pStuCrn,NString pStuSubjCode,NString pStuCrseNumb,NString pStuCampusCode,NString pStuCollCode,NString pStuProgramCode,NString pStuMajorCode,NString pStuStypCode,NString pStuAstdCode,NString pStuLevlCode,NString pStuDegcCode,NString pFacultyInd,NString pFacTermCode,NString pFacCrn,NString pFacSubjCode,NString pFacCrseNumb,NString pFacTeacherInd,NString pFacAdvisorInd,NString pFacFctgCode,NString pFacFstpCode,NString pFacCollCode,NString pFacDeptCode,NString pAlumniInd,NString pAluDonrCode,NString pAluPrefClas,NString pEmployeeInd,NString pEmpEclsCode,NString pEmpOrgnCode,NString pEmpPclsCode,NString pUserId,NString pDataOrigin,NString pWebappInd,NString pWebWappCode,NString pWebTermCode,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY.P_CREATE_TOCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_ANONYM_IND", pAnonymInd);
			cmd.addParameter("@P_DISP_FROM_DATE", pDispFromDate);
			cmd.addParameter("@P_DISP_TO_DATE", pDispToDate);
			cmd.addParameter("@P_CREATOR", pCreator);
			cmd.addParameter("@P_TARGET_CODE", pTargetCode);
			cmd.addParameter("@P_OBJECT_PIDM", pObjectPidm);
			cmd.addParameter("@P_COMPLETE_SURVEYS", pCompleteSurveys);
			cmd.addParameter("@P_LAST_ANSW_DATE", pLastAnswDate);
			cmd.addParameter("@P_INFO_TEXT", pInfoText);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_POPSEL_IND", pPopselInd);
			cmd.addParameter("@P_PS_APPLICATION_ID", pPsApplicationId);
			cmd.addParameter("@P_PS_SELECTION_ID", pPsSelectionId);
			cmd.addParameter("@P_PS_CREATOR", pPsCreator);
			cmd.addParameter("@P_PS_USER", pPsUser);
			cmd.addParameter("@P_STUDENT_IND", pStudentInd);
			cmd.addParameter("@P_STU_TERM_CODE", pStuTermCode);
			cmd.addParameter("@P_STU_CRN", pStuCrn);
			cmd.addParameter("@P_STU_SUBJ_CODE", pStuSubjCode);
			cmd.addParameter("@P_STU_CRSE_NUMB", pStuCrseNumb);
			cmd.addParameter("@P_STU_CAMPUS_CODE", pStuCampusCode);
			cmd.addParameter("@P_STU_COLL_CODE", pStuCollCode);
			cmd.addParameter("@P_STU_PROGRAM_CODE", pStuProgramCode);
			cmd.addParameter("@P_STU_MAJOR_CODE", pStuMajorCode);
			cmd.addParameter("@P_STU_STYP_CODE", pStuStypCode);
			cmd.addParameter("@P_STU_ASTD_CODE", pStuAstdCode);
			cmd.addParameter("@P_STU_LEVL_CODE", pStuLevlCode);
			cmd.addParameter("@P_STU_DEGC_CODE", pStuDegcCode);
			cmd.addParameter("@P_FACULTY_IND", pFacultyInd);
			cmd.addParameter("@P_FAC_TERM_CODE", pFacTermCode);
			cmd.addParameter("@P_FAC_CRN", pFacCrn);
			cmd.addParameter("@P_FAC_SUBJ_CODE", pFacSubjCode);
			cmd.addParameter("@P_FAC_CRSE_NUMB", pFacCrseNumb);
			cmd.addParameter("@P_FAC_TEACHER_IND", pFacTeacherInd);
			cmd.addParameter("@P_FAC_ADVISOR_IND", pFacAdvisorInd);
			cmd.addParameter("@P_FAC_FCTG_CODE", pFacFctgCode);
			cmd.addParameter("@P_FAC_FSTP_CODE", pFacFstpCode);
			cmd.addParameter("@P_FAC_COLL_CODE", pFacCollCode);
			cmd.addParameter("@P_FAC_DEPT_CODE", pFacDeptCode);
			cmd.addParameter("@P_ALUMNI_IND", pAlumniInd);
			cmd.addParameter("@P_ALU_DONR_CODE", pAluDonrCode);
			cmd.addParameter("@P_ALU_PREF_CLAS", pAluPrefClas);
			cmd.addParameter("@P_EMPLOYEE_IND", pEmployeeInd);
			cmd.addParameter("@P_EMP_ECLS_CODE", pEmpEclsCode);
			cmd.addParameter("@P_EMP_ORGN_CODE", pEmpOrgnCode);
			cmd.addParameter("@P_EMP_PCLS_CODE", pEmpPclsCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_WEBAPP_IND", pWebappInd);
			cmd.addParameter("@P_WEB_WAPP_CODE", pWebWappCode);
			cmd.addParameter("@P_WEB_TERM_CODE", pWebTermCode);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pSrn,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pSrn,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pSrn,NString pGsrcCode,NString pStatusInd,NString pAnonymInd,NDate pDispFromDate,NDate pDispToDate,NString pCreator,NString pTargetCode,NNumber pObjectPidm,NNumber pCompleteSurveys,NDate pLastAnswDate,NClob pInfoText,NClob pComments,NString pPopselInd,NString pPsApplicationId,NString pPsSelectionId,NString pPsCreator,NString pPsUser,NString pStudentInd,NString pStuTermCode,NString pStuCrn,NString pStuSubjCode,NString pStuCrseNumb,NString pStuCampusCode,NString pStuCollCode,NString pStuProgramCode,NString pStuMajorCode,NString pStuStypCode,NString pStuAstdCode,NString pStuLevlCode,NString pStuDegcCode,NString pFacultyInd,NString pFacTermCode,NString pFacCrn,NString pFacSubjCode,NString pFacCrseNumb,NString pFacTeacherInd,NString pFacAdvisorInd,NString pFacFctgCode,NString pFacFstpCode,NString pFacCollCode,NString pFacDeptCode,NString pAlumniInd,NString pAluDonrCode,NString pAluPrefClas,NString pEmployeeInd,NString pEmpEclsCode,NString pEmpOrgnCode,NString pEmpPclsCode,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_ANONYM_IND", pAnonymInd);
			cmd.addParameter("@P_DISP_FROM_DATE", pDispFromDate);
			cmd.addParameter("@P_DISP_TO_DATE", pDispToDate);
			cmd.addParameter("@P_CREATOR", pCreator);
			cmd.addParameter("@P_TARGET_CODE", pTargetCode);
			cmd.addParameter("@P_OBJECT_PIDM", pObjectPidm);
			cmd.addParameter("@P_COMPLETE_SURVEYS", pCompleteSurveys);
			cmd.addParameter("@P_LAST_ANSW_DATE", pLastAnswDate);
			cmd.addParameter("@P_INFO_TEXT", pInfoText);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_POPSEL_IND", pPopselInd);
			cmd.addParameter("@P_PS_APPLICATION_ID", pPsApplicationId);
			cmd.addParameter("@P_PS_SELECTION_ID", pPsSelectionId);
			cmd.addParameter("@P_PS_CREATOR", pPsCreator);
			cmd.addParameter("@P_PS_USER", pPsUser);
			cmd.addParameter("@P_STUDENT_IND", pStudentInd);
			cmd.addParameter("@P_STU_TERM_CODE", pStuTermCode);
			cmd.addParameter("@P_STU_CRN", pStuCrn);
			cmd.addParameter("@P_STU_SUBJ_CODE", pStuSubjCode);
			cmd.addParameter("@P_STU_CRSE_NUMB", pStuCrseNumb);
			cmd.addParameter("@P_STU_CAMPUS_CODE", pStuCampusCode);
			cmd.addParameter("@P_STU_COLL_CODE", pStuCollCode);
			cmd.addParameter("@P_STU_PROGRAM_CODE", pStuProgramCode);
			cmd.addParameter("@P_STU_MAJOR_CODE", pStuMajorCode);
			cmd.addParameter("@P_STU_STYP_CODE", pStuStypCode);
			cmd.addParameter("@P_STU_ASTD_CODE", pStuAstdCode);
			cmd.addParameter("@P_STU_LEVL_CODE", pStuLevlCode);
			cmd.addParameter("@P_STU_DEGC_CODE", pStuDegcCode);
			cmd.addParameter("@P_FACULTY_IND", pFacultyInd);
			cmd.addParameter("@P_FAC_TERM_CODE", pFacTermCode);
			cmd.addParameter("@P_FAC_CRN", pFacCrn);
			cmd.addParameter("@P_FAC_SUBJ_CODE", pFacSubjCode);
			cmd.addParameter("@P_FAC_CRSE_NUMB", pFacCrseNumb);
			cmd.addParameter("@P_FAC_TEACHER_IND", pFacTeacherInd);
			cmd.addParameter("@P_FAC_ADVISOR_IND", pFacAdvisorInd);
			cmd.addParameter("@P_FAC_FCTG_CODE", pFacFctgCode);
			cmd.addParameter("@P_FAC_FSTP_CODE", pFacFstpCode);
			cmd.addParameter("@P_FAC_COLL_CODE", pFacCollCode);
			cmd.addParameter("@P_FAC_DEPT_CODE", pFacDeptCode);
			cmd.addParameter("@P_ALUMNI_IND", pAlumniInd);
			cmd.addParameter("@P_ALU_DONR_CODE", pAluDonrCode);
			cmd.addParameter("@P_ALU_PREF_CLAS", pAluPrefClas);
			cmd.addParameter("@P_EMPLOYEE_IND", pEmployeeInd);
			cmd.addParameter("@P_EMP_ECLS_CODE", pEmpEclsCode);
			cmd.addParameter("@P_EMP_ORGN_CODE", pEmpOrgnCode);
			cmd.addParameter("@P_EMP_PCLS_CODE", pEmpPclsCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateToclob(NNumber pSrn,NString pGsrcCode,NString pStatusInd,NString pAnonymInd,NDate pDispFromDate,NDate pDispToDate,NString pCreator,NString pTargetCode,NNumber pObjectPidm,NNumber pCompleteSurveys,NDate pLastAnswDate,NClob pInfoText,NClob pComments,NString pPopselInd,NString pPsApplicationId,NString pPsSelectionId,NString pPsCreator,NString pPsUser,NString pStudentInd,NString pStuTermCode,NString pStuCrn,NString pStuSubjCode,NString pStuCrseNumb,NString pStuCampusCode,NString pStuCollCode,NString pStuProgramCode,NString pStuMajorCode,NString pStuStypCode,NString pStuAstdCode,NString pStuLevlCode,NString pStuDegcCode,NString pFacultyInd,NString pFacTermCode,NString pFacCrn,NString pFacSubjCode,NString pFacCrseNumb,NString pFacTeacherInd,NString pFacAdvisorInd,NString pFacFctgCode,NString pFacFstpCode,NString pFacCollCode,NString pFacDeptCode,NString pAlumniInd,NString pAluDonrCode,NString pAluPrefClas,NString pEmployeeInd,NString pEmpEclsCode,NString pEmpOrgnCode,NString pEmpPclsCode,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY.P_UPDATE_TOCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_ANONYM_IND", pAnonymInd);
			cmd.addParameter("@P_DISP_FROM_DATE", pDispFromDate);
			cmd.addParameter("@P_DISP_TO_DATE", pDispToDate);
			cmd.addParameter("@P_CREATOR", pCreator);
			cmd.addParameter("@P_TARGET_CODE", pTargetCode);
			cmd.addParameter("@P_OBJECT_PIDM", pObjectPidm);
			cmd.addParameter("@P_COMPLETE_SURVEYS", pCompleteSurveys);
			cmd.addParameter("@P_LAST_ANSW_DATE", pLastAnswDate);
			cmd.addParameter("@P_INFO_TEXT", pInfoText);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_POPSEL_IND", pPopselInd);
			cmd.addParameter("@P_PS_APPLICATION_ID", pPsApplicationId);
			cmd.addParameter("@P_PS_SELECTION_ID", pPsSelectionId);
			cmd.addParameter("@P_PS_CREATOR", pPsCreator);
			cmd.addParameter("@P_PS_USER", pPsUser);
			cmd.addParameter("@P_STUDENT_IND", pStudentInd);
			cmd.addParameter("@P_STU_TERM_CODE", pStuTermCode);
			cmd.addParameter("@P_STU_CRN", pStuCrn);
			cmd.addParameter("@P_STU_SUBJ_CODE", pStuSubjCode);
			cmd.addParameter("@P_STU_CRSE_NUMB", pStuCrseNumb);
			cmd.addParameter("@P_STU_CAMPUS_CODE", pStuCampusCode);
			cmd.addParameter("@P_STU_COLL_CODE", pStuCollCode);
			cmd.addParameter("@P_STU_PROGRAM_CODE", pStuProgramCode);
			cmd.addParameter("@P_STU_MAJOR_CODE", pStuMajorCode);
			cmd.addParameter("@P_STU_STYP_CODE", pStuStypCode);
			cmd.addParameter("@P_STU_ASTD_CODE", pStuAstdCode);
			cmd.addParameter("@P_STU_LEVL_CODE", pStuLevlCode);
			cmd.addParameter("@P_STU_DEGC_CODE", pStuDegcCode);
			cmd.addParameter("@P_FACULTY_IND", pFacultyInd);
			cmd.addParameter("@P_FAC_TERM_CODE", pFacTermCode);
			cmd.addParameter("@P_FAC_CRN", pFacCrn);
			cmd.addParameter("@P_FAC_SUBJ_CODE", pFacSubjCode);
			cmd.addParameter("@P_FAC_CRSE_NUMB", pFacCrseNumb);
			cmd.addParameter("@P_FAC_TEACHER_IND", pFacTeacherInd);
			cmd.addParameter("@P_FAC_ADVISOR_IND", pFacAdvisorInd);
			cmd.addParameter("@P_FAC_FCTG_CODE", pFacFctgCode);
			cmd.addParameter("@P_FAC_FSTP_CODE", pFacFstpCode);
			cmd.addParameter("@P_FAC_COLL_CODE", pFacCollCode);
			cmd.addParameter("@P_FAC_DEPT_CODE", pFacDeptCode);
			cmd.addParameter("@P_ALUMNI_IND", pAlumniInd);
			cmd.addParameter("@P_ALU_DONR_CODE", pAluDonrCode);
			cmd.addParameter("@P_ALU_PREF_CLAS", pAluPrefClas);
			cmd.addParameter("@P_EMPLOYEE_IND", pEmployeeInd);
			cmd.addParameter("@P_EMP_ECLS_CODE", pEmpEclsCode);
			cmd.addParameter("@P_EMP_ORGN_CODE", pEmpOrgnCode);
			cmd.addParameter("@P_EMP_PCLS_CODE", pEmpPclsCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
public static void pUpdateToclob(NNumber pSrn,NString pGsrcCode,NString pStatusInd,NString pAnonymInd,NDate pDispFromDate,NDate pDispToDate,NString pCreator,NString pTargetCode,NNumber pObjectPidm,NNumber pCompleteSurveys,NDate pLastAnswDate,NString pInfoText,NString pComments,NString pPopselInd,NString pPsApplicationId,NString pPsSelectionId,NString pPsCreator,NString pPsUser,NString pStudentInd,NString pStuTermCode,NString pStuCrn,NString pStuSubjCode,NString pStuCrseNumb,NString pStuCampusCode,NString pStuCollCode,NString pStuProgramCode,NString pStuMajorCode,NString pStuStypCode,NString pStuAstdCode,NString pStuLevlCode,NString pStuDegcCode,NString pFacultyInd,NString pFacTermCode,NString pFacCrn,NString pFacSubjCode,NString pFacCrseNumb,NString pFacTeacherInd,NString pFacAdvisorInd,NString pFacFctgCode,NString pFacFstpCode,NString pFacCollCode,NString pFacDeptCode,NString pAlumniInd,NString pAluDonrCode,NString pAluPrefClas,NString pEmployeeInd,NString pEmpEclsCode,NString pEmpOrgnCode,NString pEmpPclsCode,NString pUserId,NString pDataOrigin,NString pWebappInd,NString pWebWappCode,NString pWebTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY.P_UPDATE_TOCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SRN", pSrn);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_ANONYM_IND", pAnonymInd);
			cmd.addParameter("@P_DISP_FROM_DATE", pDispFromDate);
			cmd.addParameter("@P_DISP_TO_DATE", pDispToDate);
			cmd.addParameter("@P_CREATOR", pCreator);
			cmd.addParameter("@P_TARGET_CODE", pTargetCode);
			cmd.addParameter("@P_OBJECT_PIDM", pObjectPidm);
			cmd.addParameter("@P_COMPLETE_SURVEYS", pCompleteSurveys);
			cmd.addParameter("@P_LAST_ANSW_DATE", pLastAnswDate);
			cmd.addParameter("@P_INFO_TEXT", pInfoText);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_POPSEL_IND", pPopselInd);
			cmd.addParameter("@P_PS_APPLICATION_ID", pPsApplicationId);
			cmd.addParameter("@P_PS_SELECTION_ID", pPsSelectionId);
			cmd.addParameter("@P_PS_CREATOR", pPsCreator);
			cmd.addParameter("@P_PS_USER", pPsUser);
			cmd.addParameter("@P_STUDENT_IND", pStudentInd);
			cmd.addParameter("@P_STU_TERM_CODE", pStuTermCode);
			cmd.addParameter("@P_STU_CRN", pStuCrn);
			cmd.addParameter("@P_STU_SUBJ_CODE", pStuSubjCode);
			cmd.addParameter("@P_STU_CRSE_NUMB", pStuCrseNumb);
			cmd.addParameter("@P_STU_CAMPUS_CODE", pStuCampusCode);
			cmd.addParameter("@P_STU_COLL_CODE", pStuCollCode);
			cmd.addParameter("@P_STU_PROGRAM_CODE", pStuProgramCode);
			cmd.addParameter("@P_STU_MAJOR_CODE", pStuMajorCode);
			cmd.addParameter("@P_STU_STYP_CODE", pStuStypCode);
			cmd.addParameter("@P_STU_ASTD_CODE", pStuAstdCode);
			cmd.addParameter("@P_STU_LEVL_CODE", pStuLevlCode);
			cmd.addParameter("@P_STU_DEGC_CODE", pStuDegcCode);
			cmd.addParameter("@P_FACULTY_IND", pFacultyInd);
			cmd.addParameter("@P_FAC_TERM_CODE", pFacTermCode);
			cmd.addParameter("@P_FAC_CRN", pFacCrn);
			cmd.addParameter("@P_FAC_SUBJ_CODE", pFacSubjCode);
			cmd.addParameter("@P_FAC_CRSE_NUMB", pFacCrseNumb);
			cmd.addParameter("@P_FAC_TEACHER_IND", pFacTeacherInd);
			cmd.addParameter("@P_FAC_ADVISOR_IND", pFacAdvisorInd);
			cmd.addParameter("@P_FAC_FCTG_CODE", pFacFctgCode);
			cmd.addParameter("@P_FAC_FSTP_CODE", pFacFstpCode);
			cmd.addParameter("@P_FAC_COLL_CODE", pFacCollCode);
			cmd.addParameter("@P_FAC_DEPT_CODE", pFacDeptCode);
			cmd.addParameter("@P_ALUMNI_IND", pAlumniInd);
			cmd.addParameter("@P_ALU_DONR_CODE", pAluDonrCode);
			cmd.addParameter("@P_ALU_PREF_CLAS", pAluPrefClas);
			cmd.addParameter("@P_EMPLOYEE_IND", pEmployeeInd);
			cmd.addParameter("@P_EMP_ECLS_CODE", pEmpEclsCode);
			cmd.addParameter("@P_EMP_ORGN_CODE", pEmpOrgnCode);
			cmd.addParameter("@P_EMP_PCLS_CODE", pEmpPclsCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_WEBAPP_IND", pWebappInd);
			cmd.addParameter("@P_WEB_WAPP_CODE", pWebWappCode);
			cmd.addParameter("@P_WEB_TERM_CODE", pWebTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			
			cmd.execute();


		}
	
	@DbRecordType(id="GvrsrvyRecRow", dataSourceName="GVRSRVY_REC" /*, needsInitialization=true*/)
	public static class GvrsrvyRecRow
	{
		@DbRecordField(dataSourceName="R_SRN")
		public NNumber RSrn;
		@DbRecordField(dataSourceName="R_GSRC_CODE")
		public NString RGsrcCode;
		@DbRecordField(dataSourceName="R_STATUS_IND")
		public NString RStatusInd;
		@DbRecordField(dataSourceName="R_ANONYM_IND")
		public NString RAnonymInd;
		@DbRecordField(dataSourceName="R_DISP_FROM_DATE")
		public NDate RDispFromDate;
		@DbRecordField(dataSourceName="R_DISP_TO_DATE")
		public NDate RDispToDate;
		@DbRecordField(dataSourceName="R_CREATOR")
		public NString RCreator;
		@DbRecordField(dataSourceName="R_TARGET_CODE")
		public NString RTargetCode;
		@DbRecordField(dataSourceName="R_OBJECT_PIDM")
		public NNumber RObjectPidm;
		@DbRecordField(dataSourceName="R_COMPLETE_SURVEYS")
		public NNumber RCompleteSurveys;
		@DbRecordField(dataSourceName="R_LAST_ANSW_DATE")
		public NDate RLastAnswDate;
		@DbRecordField(dataSourceName="R_INFO_TEXT")
		public NString RInfoText;
		@DbRecordField(dataSourceName="R_COMMENTS")
		public NString RComments;
		@DbRecordField(dataSourceName="R_POPSEL_IND")
		public NString RPopselInd;
		@DbRecordField(dataSourceName="R_PS_APPLICATION_ID")
		public NString RPsApplicationId;
		@DbRecordField(dataSourceName="R_PS_SELECTION_ID")
		public NString RPsSelectionId;
		@DbRecordField(dataSourceName="R_PS_CREATOR")
		public NString RPsCreator;
		@DbRecordField(dataSourceName="R_PS_USER")
		public NString RPsUser;
		@DbRecordField(dataSourceName="R_STUDENT_IND")
		public NString RStudentInd;
		@DbRecordField(dataSourceName="R_STU_TERM_CODE")
		public NString RStuTermCode;
		@DbRecordField(dataSourceName="R_STU_CRN")
		public NString RStuCrn;
		@DbRecordField(dataSourceName="R_STU_SUBJ_CODE")
		public NString RStuSubjCode;
		@DbRecordField(dataSourceName="R_STU_CRSE_NUMB")
		public NString RStuCrseNumb;
		@DbRecordField(dataSourceName="R_STU_CAMPUS_CODE")
		public NString RStuCampusCode;
		@DbRecordField(dataSourceName="R_STU_COLL_CODE")
		public NString RStuCollCode;
		@DbRecordField(dataSourceName="R_STU_PROGRAM_CODE")
		public NString RStuProgramCode;
		@DbRecordField(dataSourceName="R_STU_MAJOR_CODE")
		public NString RStuMajorCode;
		@DbRecordField(dataSourceName="R_STU_STYP_CODE")
		public NString RStuStypCode;
		@DbRecordField(dataSourceName="R_STU_ASTD_CODE")
		public NString RStuAstdCode;
		@DbRecordField(dataSourceName="R_STU_LEVL_CODE")
		public NString RStuLevlCode;
		@DbRecordField(dataSourceName="R_STU_DEGC_CODE")
		public NString RStuDegcCode;
		@DbRecordField(dataSourceName="R_FACULTY_IND")
		public NString RFacultyInd;
		@DbRecordField(dataSourceName="R_FAC_TERM_CODE")
		public NString RFacTermCode;
		@DbRecordField(dataSourceName="R_FAC_CRN")
		public NString RFacCrn;
		@DbRecordField(dataSourceName="R_FAC_SUBJ_CODE")
		public NString RFacSubjCode;
		@DbRecordField(dataSourceName="R_FAC_CRSE_NUMB")
		public NString RFacCrseNumb;
		@DbRecordField(dataSourceName="R_FAC_TEACHER_IND")
		public NString RFacTeacherInd;
		@DbRecordField(dataSourceName="R_FAC_ADVISOR_IND")
		public NString RFacAdvisorInd;
		@DbRecordField(dataSourceName="R_FAC_FCTG_CODE")
		public NString RFacFctgCode;
		@DbRecordField(dataSourceName="R_FAC_FSTP_CODE")
		public NString RFacFstpCode;
		@DbRecordField(dataSourceName="R_FAC_COLL_CODE")
		public NString RFacCollCode;
		@DbRecordField(dataSourceName="R_FAC_DEPT_CODE")
		public NString RFacDeptCode;
		@DbRecordField(dataSourceName="R_ALUMNI_IND")
		public NString RAlumniInd;
		@DbRecordField(dataSourceName="R_ALU_DONR_CODE")
		public NString RAluDonrCode;
		@DbRecordField(dataSourceName="R_ALU_PREF_CLAS")
		public NString RAluPrefClas;
		@DbRecordField(dataSourceName="R_EMPLOYEE_IND")
		public NString REmployeeInd;
		@DbRecordField(dataSourceName="R_EMP_ECLS_CODE")
		public NString REmpEclsCode;
		@DbRecordField(dataSourceName="R_EMP_ORGN_CODE")
		public NString REmpOrgnCode;
		@DbRecordField(dataSourceName="R_EMP_PCLS_CODE")
		public NString REmpPclsCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
