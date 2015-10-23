package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbRoomassignment {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetRate(NString pRoomNumber,NString pBldgCode,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT.F_GET_RATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(RoomassignmentRecRow recOne,RoomassignmentRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, RoomassignmentRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, RoomassignmentRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pBldgCode,NString pRoomNumber,NString pTermCode,NString pRrcdCode,NDate pBeginDate,NDate pEndDate,NNumber pTotalDays,NNumber pTotalMonths,NNumber pTotalTerms,NString pAscdCode,NDate pAscdDate,NString pOnlOrBat,NString pArInd,NString pOverloadInd,NString pRollInd,NString pOverrideError,NString pAssessNeeded,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_RRCD_CODE", pRrcdCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_TOTAL_DAYS", pTotalDays);
			cmd.addParameter("@P_TOTAL_MONTHS", pTotalMonths);
			cmd.addParameter("@P_TOTAL_TERMS", pTotalTerms);
			cmd.addParameter("@P_ASCD_CODE", pAscdCode);
			cmd.addParameter("@P_ASCD_DATE", pAscdDate);
			cmd.addParameter("@P_ONL_OR_BAT", pOnlOrBat);
			cmd.addParameter("@P_AR_IND", pArInd);
			cmd.addParameter("@P_OVERLOAD_IND", pOverloadInd);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_OVERRIDE_ERROR", pOverrideError);
			cmd.addParameter("@P_ASSESS_NEEDED", pAssessNeeded);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pBldgCode,NString pRoomNumber,NString pTermCode,NString pRrcdCode,NDate pBeginDate,NDate pEndDate,NNumber pTotalDays,NNumber pTotalMonths,NNumber pTotalTerms,NString pAscdCode,NDate pAscdDate,NString pOnlOrBat,NString pArInd,NString pOverloadInd,NString pRollInd,NString pOverrideError,NString pAssessNeeded,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_RRCD_CODE", pRrcdCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_TOTAL_DAYS", pTotalDays);
			cmd.addParameter("@P_TOTAL_MONTHS", pTotalMonths);
			cmd.addParameter("@P_TOTAL_TERMS", pTotalTerms);
			cmd.addParameter("@P_ASCD_CODE", pAscdCode);
			cmd.addParameter("@P_ASCD_DATE", pAscdDate);
			cmd.addParameter("@P_ONL_OR_BAT", pOnlOrBat);
			cmd.addParameter("@P_AR_IND", pArInd);
			cmd.addParameter("@P_OVERLOAD_IND", pOverloadInd);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_OVERRIDE_ERROR", pOverrideError);
			cmd.addParameter("@P_ASSESS_NEEDED", pAssessNeeded);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCalcDaysMonthsTerms(NString pTermCode,NString pRrcdCode,NNumber pTotalDays,NNumber pTotalMonths,NNumber pTotalTerms,Ref<NNumber> pTotalDaysOut,Ref<NNumber> pTotalMonthsOut,Ref<NNumber> pTotalTermsOut,Ref<NString> pErrMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT.P_CALC_DAYS_MONTHS_TERMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_RRCD_CODE", pRrcdCode);
			cmd.addParameter("@P_TOTAL_DAYS", pTotalDays);
			cmd.addParameter("@P_TOTAL_MONTHS", pTotalMonths);
			cmd.addParameter("@P_TOTAL_TERMS", pTotalTerms);
			cmd.addParameter("@P_TOTAL_DAYS_OUT", NNumber.class);
			cmd.addParameter("@P_TOTAL_MONTHS_OUT", NNumber.class);
			cmd.addParameter("@P_TOTAL_TERMS_OUT", NNumber.class);
			cmd.addParameter("@P_ERR_MSG_OUT", NString.class);
				
			cmd.execute();
			pTotalDaysOut.val = cmd.getParameterValue("@P_TOTAL_DAYS_OUT", NNumber.class);
			pTotalMonthsOut.val = cmd.getParameterValue("@P_TOTAL_MONTHS_OUT", NNumber.class);
			pTotalTermsOut.val = cmd.getParameterValue("@P_TOTAL_TERMS_OUT", NNumber.class);
			pErrMsgOut.val = cmd.getParameterValue("@P_ERR_MSG_OUT", NString.class);


		}
		
		public static void pCreate(NNumber pPidm,NString pBldgCode,NString pRoomNumber,NString pTermCode,NString pRrcdCode,NDate pBeginDate,NDate pEndDate,NNumber pTotalDays,NNumber pTotalMonths,NNumber pTotalTerms,NString pAscdCode,NDate pAscdDate,NString pOnlOrBat,NString pArInd,NString pOverloadInd,NString pRollInd,NString pOverrideError,NString pAssessNeeded,NString pDataOrigin,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_RRCD_CODE", pRrcdCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_TOTAL_DAYS", pTotalDays);
			cmd.addParameter("@P_TOTAL_MONTHS", pTotalMonths);
			cmd.addParameter("@P_TOTAL_TERMS", pTotalTerms);
			cmd.addParameter("@P_ASCD_CODE", pAscdCode);
			cmd.addParameter("@P_ASCD_DATE", pAscdDate);
			cmd.addParameter("@P_ONL_OR_BAT", pOnlOrBat);
			cmd.addParameter("@P_AR_IND", pArInd);
			cmd.addParameter("@P_OVERLOAD_IND", pOverloadInd);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_OVERRIDE_ERROR", pOverrideError);
			cmd.addParameter("@P_ASSESS_NEEDED", pAssessNeeded);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pTermCode,NString pRowid,NString pPurgeProcess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_PURGE_PROCESS", pPurgeProcess);
				
			cmd.execute();


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pBldgCode,NString pRoomNumber,NString pTermCode,NString pRrcdCode,NDate pBeginDate,NDate pEndDate,NNumber pTotalDays,NNumber pTotalMonths,NNumber pTotalTerms,NString pAscdCode,NDate pAscdDate,NString pOnlOrBat,NString pArInd,NString pOverloadInd,NString pRollInd,NString pOverrideError,NString pAssessNeeded,NString pDataOrigin,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ROOMASSIGNMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BLDG_CODE", pBldgCode);
			cmd.addParameter("@P_ROOM_NUMBER", pRoomNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_RRCD_CODE", pRrcdCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_TOTAL_DAYS", pTotalDays);
			cmd.addParameter("@P_TOTAL_MONTHS", pTotalMonths);
			cmd.addParameter("@P_TOTAL_TERMS", pTotalTerms);
			cmd.addParameter("@P_ASCD_CODE", pAscdCode);
			cmd.addParameter("@P_ASCD_DATE", pAscdDate);
			cmd.addParameter("@P_ONL_OR_BAT", pOnlOrBat);
			cmd.addParameter("@P_AR_IND", pArInd);
			cmd.addParameter("@P_OVERLOAD_IND", pOverloadInd);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_OVERRIDE_ERROR", pOverrideError);
			cmd.addParameter("@P_ASSESS_NEEDED", pAssessNeeded);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="RoomassignmentRecRow", dataSourceName="ROOMASSIGNMENT_REC")
	public static class RoomassignmentRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_BLDG_CODE")
		public NString RBldgCode;
		@DbRecordField(dataSourceName="R_ROOM_NUMBER")
		public NString RRoomNumber;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_RRCD_CODE")
		public NString RRrcdCode;
		@DbRecordField(dataSourceName="R_BEGIN_DATE")
		public NDate RBeginDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_TOTAL_DAYS")
		public NNumber RTotalDays;
		@DbRecordField(dataSourceName="R_TOTAL_MONTHS")
		public NNumber RTotalMonths;
		@DbRecordField(dataSourceName="R_TOTAL_TERMS")
		public NNumber RTotalTerms;
		@DbRecordField(dataSourceName="R_ASCD_CODE")
		public NString RAscdCode;
		@DbRecordField(dataSourceName="R_ASCD_DATE")
		public NDate RAscdDate;
		@DbRecordField(dataSourceName="R_ONL_OR_BAT")
		public NString ROnlOrBat;
		@DbRecordField(dataSourceName="R_AR_IND")
		public NString RArInd;
		@DbRecordField(dataSourceName="R_OVERLOAD_IND")
		public NString ROverloadInd;
		@DbRecordField(dataSourceName="R_ROLL_IND")
		public NString RRollInd;
		@DbRecordField(dataSourceName="R_OVERRIDE_ERROR")
		public NString ROverrideError;
		@DbRecordField(dataSourceName="R_ASSESS_NEEDED")
		public NString RAssessNeeded;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
