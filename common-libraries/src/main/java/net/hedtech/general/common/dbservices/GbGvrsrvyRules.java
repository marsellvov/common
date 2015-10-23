package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbGvrsrvyRules {
		public static NString fParentExistsFacScbcrky(NString pFacSubjCode,NString pFacCrseNumb) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY_RULES.F_PARENT_EXISTS_FAC_SCBCRKY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FAC_SUBJ_CODE", pFacSubjCode);
			cmd.addParameter("@P_FAC_CRSE_NUMB", pFacCrseNumb);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fParentExistsFacSsbsect(NString pFacTermCode,NString pFacCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY_RULES.F_PARENT_EXISTS_FAC_SSBSECT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FAC_TERM_CODE", pFacTermCode);
			cmd.addParameter("@P_FAC_CRN", pFacCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fParentExistsStuScbcrky(NString pStuSubjCode,NString pStuCrseNumb) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY_RULES.F_PARENT_EXISTS_STU_SCBCRKY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STU_SUBJ_CODE", pStuSubjCode);
			cmd.addParameter("@P_STU_CRSE_NUMB", pStuCrseNumb);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fParentExistsStuSsbsect(NString pStuTermCode,NString pStuCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY_RULES.F_PARENT_EXISTS_STU_SSBSECT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STU_TERM_CODE", pStuTermCode);
			cmd.addParameter("@P_STU_CRN", pStuCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pSrn,NString pGsrcCode,NString pStatusInd,NString pAnonymInd,NDate pDispFromDate,NDate pDispToDate,NString pCreator,NString pTargetCode,NNumber pObjectPidm,NNumber pCompleteSurveys,NDate pLastAnswDate,NString pInfoText,NString pComments,NString pPopselInd,NString pPsApplicationId,NString pPsSelectionId,NString pPsCreator,NString pPsUser,NString pStudentInd,NString pStuTermCode,NString pStuCrn,NString pStuSubjCode,NString pStuCrseNumb,NString pStuCampusCode,NString pStuCollCode,NString pStuProgramCode,NString pStuMajorCode,NString pStuStypCode,NString pStuAstdCode,NString pStuLevlCode,NString pStuDegcCode,NString pFacultyInd,NString pFacTermCode,NString pFacCrn,NString pFacSubjCode,NString pFacCrseNumb,NString pFacTeacherInd,NString pFacAdvisorInd,NString pFacFctgCode,NString pFacFstpCode,NString pFacCollCode,NString pFacDeptCode,NString pAlumniInd,NString pAluDonrCode,NString pAluPrefClas,NString pEmployeeInd,NString pEmpEclsCode,NString pEmpOrgnCode,NString pEmpPclsCode,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pSrn,NString pGsrcCode,NString pStatusInd,NString pAnonymInd,NDate pDispFromDate,NDate pDispToDate,NString pCreator,NString pTargetCode,NNumber pObjectPidm,NNumber pCompleteSurveys,NDate pLastAnswDate,NString pInfoText,NString pComments,NString pPopselInd,NString pPsApplicationId,NString pPsSelectionId,NString pPsCreator,NString pPsUser,NString pStudentInd,NString pStuTermCode,NString pStuCrn,NString pStuSubjCode,NString pStuCrseNumb,NString pStuCampusCode,NString pStuCollCode,NString pStuProgramCode,NString pStuMajorCode,NString pStuStypCode,NString pStuAstdCode,NString pStuLevlCode,NString pStuDegcCode,NString pFacultyInd,NString pFacTermCode,NString pFacCrn,NString pFacSubjCode,NString pFacCrseNumb,NString pFacTeacherInd,NString pFacAdvisorInd,NString pFacFctgCode,NString pFacFstpCode,NString pFacCollCode,NString pFacDeptCode,NString pAlumniInd,NString pAluDonrCode,NString pAluPrefClas,NString pEmployeeInd,NString pEmpEclsCode,NString pEmpOrgnCode,NString pEmpPclsCode,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRVY_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
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
				
			cmd.execute();


		}
		
	
	
	
}
