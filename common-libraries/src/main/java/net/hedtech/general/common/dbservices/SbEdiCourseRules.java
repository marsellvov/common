package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEdiCourseRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_COURSE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pDcmtSeqno,NNumber pAsesSeqno,NString pBasiCode,NString pCredCode,NNumber pHoursAttempted,NNumber pHoursEarned,NString pAmcasGradeQual,NString pGrade,NString pHonorsInd,NString pCourseLevel,NString pRepeatInd,NString pXcurrCodeQual,NString pXcurrCode,NNumber pQualityPoints,NString pK12GradeLevel,NString pSubjCode,NString pCrseNumb,NString pCrseTitle,NNumber pK12DaysAttend,NNumber pK12DaysAbsent,NString pDropDate,NString pOverrideCode,NString pDuplicate,NString pDataOrigin,NString pUserId,NString pUde,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_COURSE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ASES_SEQNO", pAsesSeqno);
			cmd.addParameter("@P_BASI_CODE", pBasiCode);
			cmd.addParameter("@P_CRED_CODE", pCredCode);
			cmd.addParameter("@P_HOURS_ATTEMPTED", pHoursAttempted);
			cmd.addParameter("@P_HOURS_EARNED", pHoursEarned);
			cmd.addParameter("@P_AMCAS_GRADE_QUAL", pAmcasGradeQual);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_HONORS_IND", pHonorsInd);
			cmd.addParameter("@P_COURSE_LEVEL", pCourseLevel);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
			cmd.addParameter("@P_XCURR_CODE_QUAL", pXcurrCodeQual);
			cmd.addParameter("@P_XCURR_CODE", pXcurrCode);
			cmd.addParameter("@P_QUALITY_POINTS", pQualityPoints);
			cmd.addParameter("@P_K12_GRADE_LEVEL", pK12GradeLevel);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_CRSE_TITLE", pCrseTitle);
			cmd.addParameter("@P_K12_DAYS_ATTEND", pK12DaysAttend);
			cmd.addParameter("@P_K12_DAYS_ABSENT", pK12DaysAbsent);
			cmd.addParameter("@P_DROP_DATE", pDropDate);
			cmd.addParameter("@P_OVERRIDE_CODE", pOverrideCode);
			cmd.addParameter("@P_DUPLICATE", pDuplicate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_UDE", pUde);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pDcmtSeqno,NNumber pAsesSeqno,NString pBasiCode,NString pCredCode,NNumber pHoursAttempted,NNumber pHoursEarned,NString pAmcasGradeQual,NString pGrade,NString pHonorsInd,NString pCourseLevel,NString pRepeatInd,NString pXcurrCodeQual,NString pXcurrCode,NNumber pQualityPoints,NString pK12GradeLevel,NString pSubjCode,NString pCrseNumb,NString pCrseTitle,NNumber pK12DaysAttend,NNumber pK12DaysAbsent,NString pDropDate,NString pOverrideCode,NString pDuplicate,NString pDataOrigin,NString pUserId,NString pUde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_COURSE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ASES_SEQNO", pAsesSeqno);
			cmd.addParameter("@P_BASI_CODE", pBasiCode);
			cmd.addParameter("@P_CRED_CODE", pCredCode);
			cmd.addParameter("@P_HOURS_ATTEMPTED", pHoursAttempted);
			cmd.addParameter("@P_HOURS_EARNED", pHoursEarned);
			cmd.addParameter("@P_AMCAS_GRADE_QUAL", pAmcasGradeQual);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_HONORS_IND", pHonorsInd);
			cmd.addParameter("@P_COURSE_LEVEL", pCourseLevel);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
			cmd.addParameter("@P_XCURR_CODE_QUAL", pXcurrCodeQual);
			cmd.addParameter("@P_XCURR_CODE", pXcurrCode);
			cmd.addParameter("@P_QUALITY_POINTS", pQualityPoints);
			cmd.addParameter("@P_K12_GRADE_LEVEL", pK12GradeLevel);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_CRSE_TITLE", pCrseTitle);
			cmd.addParameter("@P_K12_DAYS_ATTEND", pK12DaysAttend);
			cmd.addParameter("@P_K12_DAYS_ABSENT", pK12DaysAbsent);
			cmd.addParameter("@P_DROP_DATE", pDropDate);
			cmd.addParameter("@P_OVERRIDE_CODE", pOverrideCode);
			cmd.addParameter("@P_DUPLICATE", pDuplicate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_UDE", pUde);
				
			cmd.execute();


		}
		
	
	
	
}
