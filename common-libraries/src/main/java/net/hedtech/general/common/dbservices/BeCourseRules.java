package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class BeCourseRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pSubjCode,NString pCrseNumb,NString pEffTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BE_COURSE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pCollCode,NString pDivsCode,NString pDeptCode,NString pCstaCode,NString pTitle,NString pCipcCode,NString pCreditHrInd,NNumber pCreditHrLow,NNumber pCreditHrHigh,NString pLecHrInd,NNumber pLecHrLow,NNumber pLecHrHigh,NString pLabHrInd,NNumber pLabHrLow,NNumber pLabHrHigh,NString pOthHrInd,NNumber pOthHrLow,NNumber pOthHrHigh,NString pBillHrInd,NNumber pBillHrLow,NNumber pBillHrHigh,NString pAprvCode,NNumber pRepeatLimit,NString pPwavCode,NString pTuiwInd,NString pAddFeesInd,NNumber pContHrLow,NString pContHrInd,NNumber pContHrHigh,NString pCeuInd,NString pRepsCode,NNumber pMaxRptUnits,NString pCappPrereqTestInd,NString pDuntCode,NNumber pNumberOfUnits,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BE_COURSE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DIVS_CODE", pDivsCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_CSTA_CODE", pCstaCode);
			cmd.addParameter("@P_TITLE", pTitle);
			cmd.addParameter("@P_CIPC_CODE", pCipcCode);
			cmd.addParameter("@P_CREDIT_HR_IND", pCreditHrInd);
			cmd.addParameter("@P_CREDIT_HR_LOW", pCreditHrLow);
			cmd.addParameter("@P_CREDIT_HR_HIGH", pCreditHrHigh);
			cmd.addParameter("@P_LEC_HR_IND", pLecHrInd);
			cmd.addParameter("@P_LEC_HR_LOW", pLecHrLow);
			cmd.addParameter("@P_LEC_HR_HIGH", pLecHrHigh);
			cmd.addParameter("@P_LAB_HR_IND", pLabHrInd);
			cmd.addParameter("@P_LAB_HR_LOW", pLabHrLow);
			cmd.addParameter("@P_LAB_HR_HIGH", pLabHrHigh);
			cmd.addParameter("@P_OTH_HR_IND", pOthHrInd);
			cmd.addParameter("@P_OTH_HR_LOW", pOthHrLow);
			cmd.addParameter("@P_OTH_HR_HIGH", pOthHrHigh);
			cmd.addParameter("@P_BILL_HR_IND", pBillHrInd);
			cmd.addParameter("@P_BILL_HR_LOW", pBillHrLow);
			cmd.addParameter("@P_BILL_HR_HIGH", pBillHrHigh);
			cmd.addParameter("@P_APRV_CODE", pAprvCode);
			cmd.addParameter("@P_REPEAT_LIMIT", pRepeatLimit);
			cmd.addParameter("@P_PWAV_CODE", pPwavCode);
			cmd.addParameter("@P_TUIW_IND", pTuiwInd);
			cmd.addParameter("@P_ADD_FEES_IND", pAddFeesInd);
			cmd.addParameter("@P_CONT_HR_LOW", pContHrLow);
			cmd.addParameter("@P_CONT_HR_IND", pContHrInd);
			cmd.addParameter("@P_CONT_HR_HIGH", pContHrHigh);
			cmd.addParameter("@P_CEU_IND", pCeuInd);
			cmd.addParameter("@P_REPS_CODE", pRepsCode);
			cmd.addParameter("@P_MAX_RPT_UNITS", pMaxRptUnits);
			cmd.addParameter("@P_CAPP_PREREQ_TEST_IND", pCappPrereqTestInd);
			cmd.addParameter("@P_DUNT_CODE", pDuntCode);
			cmd.addParameter("@P_NUMBER_OF_UNITS", pNumberOfUnits);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pCollCode,NString pDivsCode,NString pDeptCode,NString pCstaCode,NString pTitle,NString pCipcCode,NString pCreditHrInd,NNumber pCreditHrLow,NNumber pCreditHrHigh,NString pLecHrInd,NNumber pLecHrLow,NNumber pLecHrHigh,NString pLabHrInd,NNumber pLabHrLow,NNumber pLabHrHigh,NString pOthHrInd,NNumber pOthHrLow,NNumber pOthHrHigh,NString pBillHrInd,NNumber pBillHrLow,NNumber pBillHrHigh,NString pAprvCode,NNumber pRepeatLimit,NString pPwavCode,NString pTuiwInd,NString pAddFeesInd,NNumber pContHrLow,NString pContHrInd,NNumber pContHrHigh,NString pCeuInd,NString pRepsCode,NNumber pMaxRptUnits,NString pCappPrereqTestInd,NString pDuntCode,NNumber pNumberOfUnits,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BE_COURSE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DIVS_CODE", pDivsCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_CSTA_CODE", pCstaCode);
			cmd.addParameter("@P_TITLE", pTitle);
			cmd.addParameter("@P_CIPC_CODE", pCipcCode);
			cmd.addParameter("@P_CREDIT_HR_IND", pCreditHrInd);
			cmd.addParameter("@P_CREDIT_HR_LOW", pCreditHrLow);
			cmd.addParameter("@P_CREDIT_HR_HIGH", pCreditHrHigh);
			cmd.addParameter("@P_LEC_HR_IND", pLecHrInd);
			cmd.addParameter("@P_LEC_HR_LOW", pLecHrLow);
			cmd.addParameter("@P_LEC_HR_HIGH", pLecHrHigh);
			cmd.addParameter("@P_LAB_HR_IND", pLabHrInd);
			cmd.addParameter("@P_LAB_HR_LOW", pLabHrLow);
			cmd.addParameter("@P_LAB_HR_HIGH", pLabHrHigh);
			cmd.addParameter("@P_OTH_HR_IND", pOthHrInd);
			cmd.addParameter("@P_OTH_HR_LOW", pOthHrLow);
			cmd.addParameter("@P_OTH_HR_HIGH", pOthHrHigh);
			cmd.addParameter("@P_BILL_HR_IND", pBillHrInd);
			cmd.addParameter("@P_BILL_HR_LOW", pBillHrLow);
			cmd.addParameter("@P_BILL_HR_HIGH", pBillHrHigh);
			cmd.addParameter("@P_APRV_CODE", pAprvCode);
			cmd.addParameter("@P_REPEAT_LIMIT", pRepeatLimit);
			cmd.addParameter("@P_PWAV_CODE", pPwavCode);
			cmd.addParameter("@P_TUIW_IND", pTuiwInd);
			cmd.addParameter("@P_ADD_FEES_IND", pAddFeesInd);
			cmd.addParameter("@P_CONT_HR_LOW", pContHrLow);
			cmd.addParameter("@P_CONT_HR_IND", pContHrInd);
			cmd.addParameter("@P_CONT_HR_HIGH", pContHrHigh);
			cmd.addParameter("@P_CEU_IND", pCeuInd);
			cmd.addParameter("@P_REPS_CODE", pRepsCode);
			cmd.addParameter("@P_MAX_RPT_UNITS", pMaxRptUnits);
			cmd.addParameter("@P_CAPP_PREREQ_TEST_IND", pCappPrereqTestInd);
			cmd.addParameter("@P_DUNT_CODE", pDuntCode);
			cmd.addParameter("@P_NUMBER_OF_UNITS", pNumberOfUnits);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
