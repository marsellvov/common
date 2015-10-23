package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbHighSchoolDataRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_HIGH_SCHOOL_DATA_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pUserId,NString pApIbCourses,NString pReqCourses,NDate pHsGradDate,NString pHsGradStateCode,NString pAdvHonorsProgCode,NString pDataOrigin,NString pProgCodeReviewed,NString pAdmissionTestInd,NString pTeachExpertInd,NString pAtbtCodInd,NString pAtbtCodCde,NString pTadmCodCde,NString pAtbtCodTestCde,NDate pAtbtCompDate,NString pAtbtCdstCde,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_HIGH_SCHOOL_DATA_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_AP_IB_COURSES", pApIbCourses);
			cmd.addParameter("@P_REQ_COURSES", pReqCourses);
			cmd.addParameter("@P_HS_GRAD_DATE", pHsGradDate);
			cmd.addParameter("@P_HS_GRAD_STATE_CODE", pHsGradStateCode);
			cmd.addParameter("@P_ADV_HONORS_PROG_CODE", pAdvHonorsProgCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PROG_CODE_REVIEWED", pProgCodeReviewed);
			cmd.addParameter("@P_ADMISSION_TEST_IND", pAdmissionTestInd);
			cmd.addParameter("@P_TEACH_EXPERT_IND", pTeachExpertInd);
			cmd.addParameter("@P_ATBT_COD_IND", pAtbtCodInd);
			cmd.addParameter("@P_ATBT_COD_CDE", pAtbtCodCde);
			cmd.addParameter("@P_TADM_COD_CDE", pTadmCodCde);
			cmd.addParameter("@P_ATBT_COD_TEST_CDE", pAtbtCodTestCde);
			cmd.addParameter("@P_ATBT_COMP_DATE", pAtbtCompDate);
			cmd.addParameter("@P_ATBT_CDST_CDE", pAtbtCdstCde);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pUserId,NString pApIbCourses,NString pReqCourses,NDate pHsGradDate,NString pHsGradStateCode,NString pAdvHonorsProgCode,NString pDataOrigin,NString pProgCodeReviewed,NString pAdmissionTestInd,NString pTeachExpertInd,NString pAtbtCodInd,NString pAtbtCodCde,NString pTadmCodCde,NString pAtbtCodTestCde,NDate pAtbtCompDate,NString pAtbtCdstCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_HIGH_SCHOOL_DATA_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_AP_IB_COURSES", pApIbCourses);
			cmd.addParameter("@P_REQ_COURSES", pReqCourses);
			cmd.addParameter("@P_HS_GRAD_DATE", pHsGradDate);
			cmd.addParameter("@P_HS_GRAD_STATE_CODE", pHsGradStateCode);
			cmd.addParameter("@P_ADV_HONORS_PROG_CODE", pAdvHonorsProgCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PROG_CODE_REVIEWED", pProgCodeReviewed);
			cmd.addParameter("@P_ADMISSION_TEST_IND", pAdmissionTestInd);
			cmd.addParameter("@P_TEACH_EXPERT_IND", pTeachExpertInd);
			cmd.addParameter("@P_ATBT_COD_IND", pAtbtCodInd);
			cmd.addParameter("@P_ATBT_COD_CDE", pAtbtCodCde);
			cmd.addParameter("@P_TADM_COD_CDE", pTadmCodCde);
			cmd.addParameter("@P_ATBT_COD_TEST_CDE", pAtbtCodTestCde);
			cmd.addParameter("@P_ATBT_COMP_DATE", pAtbtCompDate);
			cmd.addParameter("@P_ATBT_CDST_CDE", pAtbtCdstCde);
				
			cmd.execute();


		}
		
	
	
	
}
