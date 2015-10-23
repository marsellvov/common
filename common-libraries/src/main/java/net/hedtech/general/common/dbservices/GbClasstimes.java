package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbClasstimes {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CLASSTIMES.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CLASSTIMES.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ClasstimesRecRow recOne,ClasstimesRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CLASSTIMES.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ClasstimesRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ClasstimesRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTermCode,NString pCrn,NString pBeginTime,NString pEndTime,NString pBldgCode,NString pRoomCode,NDate pStartDate,NDate pEndDate,NString pCatagory,NString pSunDay,NString pMonDay,NString pTueDay,NString pWedDay,NString pThuDay,NString pFriDay,NString pSatDay,NString pSchdCode,NString pOverRide,NNumber pCreditHrSess,NNumber pMeetNo,NNumber pHrsWeek,NString pFuncCode,NString pComtCode,NString pSchsCode,NString pMtypCode,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CLASSTIMES.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
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
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CLASSTIMES.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTermCode,NString pCrn,NString pBeginTime,NString pEndTime,NString pBldgCode,NString pRoomCode,NDate pStartDate,NDate pEndDate,NString pCatagory,NString pSunDay,NString pMonDay,NString pTueDay,NString pWedDay,NString pThuDay,NString pFriDay,NString pSatDay,NString pSchdCode,NString pOverRide,NNumber pCreditHrSess,NNumber pMeetNo,NNumber pHrsWeek,NString pFuncCode,NString pComtCode,NString pSchsCode,NString pMtypCode,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CLASSTIMES.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
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
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CLASSTIMES.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
			
		
		public static void pCreate(NString pTermCode,NString pCrn,NString pDaysCode,NNumber pDayNumber,NString pBeginTime,NString pEndTime,NString pBldgCode,NString pRoomCode,NDate pStartDate,NDate pEndDate,NString pCatagory,NString pSunDay,NString pMonDay,NString pTueDay,NString pWedDay,NString pThuDay,NString pFriDay,NString pSatDay,NString pSchdCode,NString pOverRide,NNumber pCreditHrSess,NNumber pMeetNo,NNumber pHrsWeek,NString pFuncCode,NString pComtCode,NString pSchsCode,NString pMtypCode,NString pDataOrigin,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CLASSTIMES.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CLASSTIMES.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CLASSTIMES.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTermCode,NString pCrn,NString pDaysCode,NNumber pDayNumber,NString pBeginTime,NString pEndTime,NString pBldgCode,NString pRoomCode,NDate pStartDate,NDate pEndDate,NString pCatagory,NString pSunDay,NString pMonDay,NString pTueDay,NString pWedDay,NString pThuDay,NString pFriDay,NString pSatDay,NString pSchdCode,NString pOverRide,NNumber pCreditHrSess,NNumber pMeetNo,NNumber pHrsWeek,NString pFuncCode,NString pComtCode,NString pSchsCode,NString pMtypCode,NString pDataOrigin,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CLASSTIMES.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ClasstimesRecRow", dataSourceName="CLASSTIMES_REC")
	public static class ClasstimesRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_CRN")
		public NString RCrn;
		@DbRecordField(dataSourceName="R_BEGIN_TIME")
		public NString RBeginTime;
		@DbRecordField(dataSourceName="R_END_TIME")
		public NString REndTime;
		@DbRecordField(dataSourceName="R_BLDG_CODE")
		public NString RBldgCode;
		@DbRecordField(dataSourceName="R_ROOM_CODE")
		public NString RRoomCode;
		@DbRecordField(dataSourceName="R_START_DATE")
		public NDate RStartDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_CATAGORY")
		public NString RCatagory;
		@DbRecordField(dataSourceName="R_SUN_DAY")
		public NString RSunDay;
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
		@DbRecordField(dataSourceName="R_SCHD_CODE")
		public NString RSchdCode;
		@DbRecordField(dataSourceName="R_OVER_RIDE")
		public NString ROverRide;
		@DbRecordField(dataSourceName="R_CREDIT_HR_SESS")
		public NNumber RCreditHrSess;
		@DbRecordField(dataSourceName="R_MEET_NO")
		public NNumber RMeetNo;
		@DbRecordField(dataSourceName="R_HRS_WEEK")
		public NNumber RHrsWeek;
		@DbRecordField(dataSourceName="R_FUNC_CODE")
		public NString RFuncCode;
		@DbRecordField(dataSourceName="R_COMT_CODE")
		public NString RComtCode;
		@DbRecordField(dataSourceName="R_SCHS_CODE")
		public NString RSchsCode;
		@DbRecordField(dataSourceName="R_MTYP_CODE")
		public NString RMtypCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
