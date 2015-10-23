package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Shkrols {
		public static void pDoGraderoll(NString termIn,NString crnIn,NString userIn,NString sessionidIn,NString printSelIn,NString reportModeIn,NString startFromDateIn,NString startToDateIn,NString gradeTermIn,NString rollTitleIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKROLS.P_DO_GRADEROLL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@USER_IN", userIn);
			cmd.addParameter("@SESSIONID_IN", sessionidIn);
			cmd.addParameter("@PRINT_SEL_IN", printSelIn);
			cmd.addParameter("@REPORT_MODE_IN", reportModeIn);
			cmd.addParameter("@START_FROM_DATE_IN", startFromDateIn);
			cmd.addParameter("@START_TO_DATE_IN", startToDateIn);
			cmd.addParameter("@GRADE_TERM_IN", gradeTermIn);
			cmd.addParameter("@ROLL_TITLE_IN", rollTitleIn);
				
			cmd.execute();


		}
		
		public static void pGradappRoll(NNumber pPidm,NNumber pGappSeqno,NString pRollCurriculum,NString pApplyCourses,Ref<NString> pErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKROLS.P_GRADAPP_ROLL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_GAPP_SEQNO", pGappSeqno);
			cmd.addParameter("@P_ROLL_CURRICULUM", pRollCurriculum);
			cmd.addParameter("@P_APPLY_COURSES", pApplyCourses);
			cmd.addParameter("@P_ERR_MSG", NString.class);
				
			cmd.execute();
			pErrMsg.val = cmd.getParameterValue("@P_ERR_MSG", NString.class);


		}
		
		public static void pRollManualDegree(NNumber pPidm,NString pTermCode,NNumber pLcurSeqno,NString pTermCodeEff,NString pCurrentInd,NString pUserId,NString pGrstCode,NString pAwardCourses,NDate pGraduationDate,NString pAcyrCode,NString pFeeInd,NDate pFeeDate,NString pTermCodeGrad,NDate pGradappDate,NString pRollInd,NString pTermCodeCompleted,Ref<NNumber> pDegreeSeqno,Ref<NString> pErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKROLS.P_ROLL_MANUAL_DEGREE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_CURRENT_IND", pCurrentInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_GRST_CODE", pGrstCode);
			cmd.addParameter("@P_AWARD_COURSES", pAwardCourses);
			cmd.addParameter("@P_GRADUATION_DATE", pGraduationDate);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_FEE_IND", pFeeInd);
			cmd.addParameter("@P_FEE_DATE", pFeeDate);
			cmd.addParameter("@P_TERM_CODE_GRAD", pTermCodeGrad);
			cmd.addParameter("@P_GRADAPP_DATE", pGradappDate);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_TERM_CODE_COMPLETED", pTermCodeCompleted);
			cmd.addParameter("@P_DEGREE_SEQNO", pDegreeSeqno, true);
			cmd.addParameter("@P_ERR_MSG", NString.class);
				
			cmd.execute();
			pDegreeSeqno.val = cmd.getParameterValue("@P_DEGREE_SEQNO", NNumber.class);
			pErrMsg.val = cmd.getParameterValue("@P_ERR_MSG", NString.class);


		}
		
		public static void pRollOutcome(NNumber pPidm,NString pTermCode,NNumber pLcurSeqno,SbCurriculum.CurriculumRecRow pLcurRec,NString pCurrentInd,NString pRollInd,NString pGrstCode,NDate pGraduationDate,NString pAcyrCode,NString pFeeInd,NDate pFeeDate,NString pTermCodeGrad,NString pTermCodeCompleted,Ref<NNumber> pDegreeSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKROLS.P_ROLL_OUTCOME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter(DbTypes.createStructType("P_LCUR_REC", pLcurRec, SbCurriculum.CurriculumRecRow.class ));
			cmd.addParameter("@P_CURRENT_IND", pCurrentInd);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_GRST_CODE", pGrstCode);
			cmd.addParameter("@P_GRADUATION_DATE", pGraduationDate);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_FEE_IND", pFeeInd);
			cmd.addParameter("@P_FEE_DATE", pFeeDate);
			cmd.addParameter("@P_TERM_CODE_GRAD", pTermCodeGrad);
			cmd.addParameter("@P_TERM_CODE_COMPLETED", pTermCodeCompleted);
			cmd.addParameter("@P_DEGREE_SEQNO", pDegreeSeqno, true);
				
			cmd.execute();
			pDegreeSeqno.val = cmd.getParameterValue("@P_DEGREE_SEQNO", NNumber.class);


		}
		
	
	
	
}
