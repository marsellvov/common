package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbClasstimesRules {
		public static NNumber fCalcExclusionDays(NDate pStartDate,NDate pEndDate,NString pPtrmCode,NString pSunDay,NString pMonDay,NString pTueDay,NString pWedDay,NString pThuDay,NString pFriDay,NString pSatDay) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CLASSTIMES_RULES.F_CALC_EXCLUSION_DAYS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_PTRM_CODE", pPtrmCode);
			cmd.addParameter("@P_SUN_DAY", pSunDay);
			cmd.addParameter("@P_MON_DAY", pMonDay);
			cmd.addParameter("@P_TUE_DAY", pTueDay);
			cmd.addParameter("@P_WED_DAY", pWedDay);
			cmd.addParameter("@P_THU_DAY", pThuDay);
			cmd.addParameter("@P_FRI_DAY", pFriDay);
			cmd.addParameter("@P_SAT_DAY", pSatDay);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcHrsPerWeek(NString pTermCode,NString pCrn,NString pBeginTime,NString pEndTime,NString pMonDay,NString pTueDay,NString pWedDay,NString pThuDay,NString pFriDay,NString pSatDay,NString pSunDay) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CLASSTIMES_RULES.F_CALC_HRS_PER_WEEK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_BEGIN_TIME", pBeginTime);
			cmd.addParameter("@P_END_TIME", pEndTime);
			cmd.addParameter("@P_MON_DAY", pMonDay);
			cmd.addParameter("@P_TUE_DAY", pTueDay);
			cmd.addParameter("@P_WED_DAY", pWedDay);
			cmd.addParameter("@P_THU_DAY", pThuDay);
			cmd.addParameter("@P_FRI_DAY", pFriDay);
			cmd.addParameter("@P_SAT_DAY", pSatDay);
			cmd.addParameter("@P_SUN_DAY", pSunDay);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcNumberOfDays(NDate pStartDate,NDate pEndDate,NString pSunDay,NString pMonDay,NString pTueDay,NString pWedDay,NString pThuDay,NString pFriDay,NString pSatDay) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CLASSTIMES_RULES.F_CALC_NUMBER_OF_DAYS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_SUN_DAY", pSunDay);
			cmd.addParameter("@P_MON_DAY", pMonDay);
			cmd.addParameter("@P_TUE_DAY", pTueDay);
			cmd.addParameter("@P_WED_DAY", pWedDay);
			cmd.addParameter("@P_THU_DAY", pThuDay);
			cmd.addParameter("@P_FRI_DAY", pFriDay);
			cmd.addParameter("@P_SAT_DAY", pSatDay);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CLASSTIMES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTermCode,NString pCrn,NString pBeginTime,NString pEndTime,NString pBldgCode,NString pRoomCode,NDate pStartDate,NDate pEndDate,NString pCatagory,NString pSunDay,NString pMonDay,NString pTueDay,NString pWedDay,NString pThuDay,NString pFriDay,NString pSatDay,NString pSchdCode,NString pOverRide,NNumber pCreditHrSess,NNumber pMeetNo,NNumber pHrsWeek,NString pFuncCode,NString pComtCode,NString pSchsCode,NString pMtypCode,NString pDataOrigin,NString pUserId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CLASSTIMES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_BEGIN_TIME", pBeginTime);
			cmd.addParameter("@P_END_TIME", pEndTime);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_CODE", pRoomCode);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_CATAGORY", pCatagory);
			cmd.addParameter("@P_SUN_DAY", pSunDay);
			cmd.addParameter("@P_MON_DAY", pMonDay);
			cmd.addParameter("@P_TUE_DAY", pTueDay);
			cmd.addParameter("@P_WED_DAY", pWedDay);
			cmd.addParameter("@P_THU_DAY", pThuDay);
			cmd.addParameter("@P_FRI_DAY", pFriDay);
			cmd.addParameter("@P_SAT_DAY", pSatDay);
			cmd.addParameter("@P_SCHD_CODE", pSchdCode);
			cmd.addParameter("@P_OVER_RIDE", pOverRide);
			cmd.addParameter("@P_CREDIT_HR_SESS", pCreditHrSess);
			cmd.addParameter("@P_MEET_NO", pMeetNo);
			cmd.addParameter("@P_HRS_WEEK", pHrsWeek);
			cmd.addParameter("@P_FUNC_CODE", pFuncCode);
			cmd.addParameter("@P_COMT_CODE", pComtCode);
			cmd.addParameter("@P_SCHS_CODE", pSchsCode);
			cmd.addParameter("@P_MTYP_CODE", pMtypCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pSectionQueryOne(NString pTermCode,NString pCrn,Ref<NString> pSubjectCode,Ref<NString> pCrseNumb,Ref<NString> pPtrmCode,Ref<NNumber> pCreditHrs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CLASSTIMES_RULES.P_SECTION_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_SUBJECT_CODE", NString.class);
			cmd.addParameter("@P_CRSE_NUMB", NString.class);
			cmd.addParameter("@P_PTRM_CODE", NString.class);
			cmd.addParameter("@P_CREDIT_HRS", NNumber.class);
				
			cmd.execute();
			pSubjectCode.val = cmd.getParameterValue("@P_SUBJECT_CODE", NString.class);
			pCrseNumb.val = cmd.getParameterValue("@P_CRSE_NUMB", NString.class);
			pPtrmCode.val = cmd.getParameterValue("@P_PTRM_CODE", NString.class);
			pCreditHrs.val = cmd.getParameterValue("@P_CREDIT_HRS", NNumber.class);


		}
		
		public static void pValidate(NString pTermCode,NString pCrn,NString pDaysCode,NNumber pDayNumber,NString pBeginTime,NString pEndTime,NString pBldgCode,NString pRoomCode,NDate pStartDate,NDate pEndDate,Ref<NString> pCatagory,NString pSunDay,NString pMonDay,NString pTueDay,NString pWedDay,NString pThuDay,NString pFriDay,NString pSatDay,Ref<NString> pSchdCode,NString pOverRide,Ref<NNumber> pCreditHrSess,Ref<NNumber> pMeetNo,Ref<NNumber> pHrsWeek,Ref<NString> pFuncCode,Ref<NString> pComtCode,Ref<NString> pSchsCode,Ref<NString> pMtypCode,NString pDataOrigin,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CLASSTIMES_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_DAYS_CODE", pDaysCode);
			cmd.addParameter("@P_DAY_NUMBER", pDayNumber);
			cmd.addParameter("@P_BEGIN_TIME", pBeginTime);
			cmd.addParameter("@P_END_TIME", pEndTime);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_CODE", pRoomCode);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_CATAGORY", pCatagory, true);
			cmd.addParameter("@P_SUN_DAY", pSunDay);
			cmd.addParameter("@P_MON_DAY", pMonDay);
			cmd.addParameter("@P_TUE_DAY", pTueDay);
			cmd.addParameter("@P_WED_DAY", pWedDay);
			cmd.addParameter("@P_THU_DAY", pThuDay);
			cmd.addParameter("@P_FRI_DAY", pFriDay);
			cmd.addParameter("@P_SAT_DAY", pSatDay);
			cmd.addParameter("@P_SCHD_CODE", pSchdCode, true);
			cmd.addParameter("@P_OVER_RIDE", pOverRide);
			cmd.addParameter("@P_CREDIT_HR_SESS", pCreditHrSess, true);
			cmd.addParameter("@P_MEET_NO", pMeetNo, true);
			cmd.addParameter("@P_HRS_WEEK", pHrsWeek, true);
			cmd.addParameter("@P_FUNC_CODE", pFuncCode, true);
			cmd.addParameter("@P_COMT_CODE", pComtCode, true);
			cmd.addParameter("@P_SCHS_CODE", pSchsCode, true);
			cmd.addParameter("@P_MTYP_CODE", pMtypCode, true);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();
			pCatagory.val = cmd.getParameterValue("@P_CATAGORY", NString.class);
			pSchdCode.val = cmd.getParameterValue("@P_SCHD_CODE", NString.class);
			pCreditHrSess.val = cmd.getParameterValue("@P_CREDIT_HR_SESS", NNumber.class);
			pMeetNo.val = cmd.getParameterValue("@P_MEET_NO", NNumber.class);
			pHrsWeek.val = cmd.getParameterValue("@P_HRS_WEEK", NNumber.class);
			pFuncCode.val = cmd.getParameterValue("@P_FUNC_CODE", NString.class);
			pComtCode.val = cmd.getParameterValue("@P_COMT_CODE", NString.class);
			pSchsCode.val = cmd.getParameterValue("@P_SCHS_CODE", NString.class);
			pMtypCode.val = cmd.getParameterValue("@P_MTYP_CODE", NString.class);


		}
		
	
	
	
}
