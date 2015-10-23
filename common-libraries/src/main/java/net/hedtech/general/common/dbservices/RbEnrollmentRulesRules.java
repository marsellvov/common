package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbEnrollmentRulesRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ENROLLMENT_RULES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAidyCode,NString pEnrrCode,NString pRepCourseInd,NString pCourseInPgrmInd,NString pRemedialCourseInd,NString pAttendVerifyInd,NString pSystemReqInd,NString pComment,NNumber pRepCourseCount,NString pUserId,NString pDataOrigin,NString pCountWdAsRepeatInd,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ENROLLMENT_RULES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
			cmd.addParameter("@P_REP_COURSE_IND", pRepCourseInd);
			cmd.addParameter("@P_COURSE_IN_PGRM_IND", pCourseInPgrmInd);
			cmd.addParameter("@P_REMEDIAL_COURSE_IND", pRemedialCourseInd);
			cmd.addParameter("@P_ATTEND_VERIFY_IND", pAttendVerifyInd);
			cmd.addParameter("@P_SYSTEM_REQ_IND", pSystemReqInd);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_REP_COURSE_COUNT", pRepCourseCount);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_COUNT_WD_AS_REPEAT_IND", pCountWdAsRepeatInd);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAidyCode,NString pEnrrCode,NString pRepCourseInd,NString pCourseInPgrmInd,NString pRemedialCourseInd,NString pAttendVerifyInd,NString pSystemReqInd,NString pComment,NNumber pRepCourseCount,NString pUserId,NString pDataOrigin,NString pCountWdAsRepeatInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ENROLLMENT_RULES_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
			cmd.addParameter("@P_REP_COURSE_IND", pRepCourseInd);
			cmd.addParameter("@P_COURSE_IN_PGRM_IND", pCourseInPgrmInd);
			cmd.addParameter("@P_REMEDIAL_COURSE_IND", pRemedialCourseInd);
			cmd.addParameter("@P_ATTEND_VERIFY_IND", pAttendVerifyInd);
			cmd.addParameter("@P_SYSTEM_REQ_IND", pSystemReqInd);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_REP_COURSE_COUNT", pRepCourseCount);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_COUNT_WD_AS_REPEAT_IND", pCountWdAsRepeatInd);
				
			cmd.execute();


		}
		
	
	
	
}
