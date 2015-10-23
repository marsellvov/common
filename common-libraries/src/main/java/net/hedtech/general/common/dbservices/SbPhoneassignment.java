package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPhoneassignment {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PHONEASSIGNMENT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PHONEASSIGNMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(PhoneassignmentRecRow recOne,PhoneassignmentRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PHONEASSIGNMENT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PhoneassignmentRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PhoneassignmentRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pTermCode,NString pPrcdCode,NString pPhoneAccountNumber,NString pPhoneArea,NString pPhoneExt,NString pPhoneNumber,NDate pBeginDate,NDate pEndDate,NNumber pTotalDays,NNumber pTotalMonths,NNumber pTotalTerms,NString pPscdCode,NDate pPscdDate,NString pOnlOrBat,NString pArInd,NString pRollInd,NString pAssessNeeded,NString pDataOrigin,NString pUserId,NString pCtryCodePhone) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PHONEASSIGNMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PRCD_CODE", pPrcdCode);
			cmd.addParameter("@P_PHONE_ACCOUNT_NUMBER", pPhoneAccountNumber);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_TOTAL_DAYS", pTotalDays);
			cmd.addParameter("@P_TOTAL_MONTHS", pTotalMonths);
			cmd.addParameter("@P_TOTAL_TERMS", pTotalTerms);
			cmd.addParameter("@P_PSCD_CODE", pPscdCode);
			cmd.addParameter("@P_PSCD_DATE", pPscdDate);
			cmd.addParameter("@P_ONL_OR_BAT", pOnlOrBat);
			cmd.addParameter("@P_AR_IND", pArInd);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_ASSESS_NEEDED", pAssessNeeded);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PHONEASSIGNMENT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pTermCode,NString pPrcdCode,NString pPhoneAccountNumber,NString pPhoneArea,NString pPhoneExt,NString pPhoneNumber,NDate pBeginDate,NDate pEndDate,NNumber pTotalDays,NNumber pTotalMonths,NNumber pTotalTerms,NString pPscdCode,NDate pPscdDate,NString pOnlOrBat,NString pArInd,NString pRollInd,NString pAssessNeeded,NString pDataOrigin,NString pUserId,NString pCtryCodePhone) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PHONEASSIGNMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PRCD_CODE", pPrcdCode);
			cmd.addParameter("@P_PHONE_ACCOUNT_NUMBER", pPhoneAccountNumber);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_TOTAL_DAYS", pTotalDays);
			cmd.addParameter("@P_TOTAL_MONTHS", pTotalMonths);
			cmd.addParameter("@P_TOTAL_TERMS", pTotalTerms);
			cmd.addParameter("@P_PSCD_CODE", pPscdCode);
			cmd.addParameter("@P_PSCD_DATE", pPscdDate);
			cmd.addParameter("@P_ONL_OR_BAT", pOnlOrBat);
			cmd.addParameter("@P_AR_IND", pArInd);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_ASSESS_NEEDED", pAssessNeeded);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PHONEASSIGNMENT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCalcDaysMonthsTerms(NString pTermCode,NString pPrcdCode,NNumber pTotalDays,NNumber pTotalMonths,NNumber pTotalTerms,Ref<NNumber> pTotalDaysOut,Ref<NNumber> pTotalMonthsOut,Ref<NNumber> pTotalTermsOut,Ref<NString> pErrMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PHONEASSIGNMENT.P_CALC_DAYS_MONTHS_TERMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PRCD_CODE", pPrcdCode);
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
		
		public static void pCreate(NNumber pPidm,NString pTermCode,NString pPrcdCode,NString pPhoneAccountNumber,NString pPhoneArea,NString pPhoneExt,NString pPhoneNumber,NDate pBeginDate,NDate pEndDate,NNumber pTotalDays,NNumber pTotalMonths,NNumber pTotalTerms,NString pPscdCode,NDate pPscdDate,NString pOnlOrBat,NString pArInd,NString pRollInd,NString pAssessNeeded,NString pDataOrigin,NString pUserId,NString pCtryCodePhone,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PHONEASSIGNMENT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PRCD_CODE", pPrcdCode);
			cmd.addParameter("@P_PHONE_ACCOUNT_NUMBER", pPhoneAccountNumber);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_TOTAL_DAYS", pTotalDays);
			cmd.addParameter("@P_TOTAL_MONTHS", pTotalMonths);
			cmd.addParameter("@P_TOTAL_TERMS", pTotalTerms);
			cmd.addParameter("@P_PSCD_CODE", pPscdCode);
			cmd.addParameter("@P_PSCD_DATE", pPscdDate);
			cmd.addParameter("@P_ONL_OR_BAT", pOnlOrBat);
			cmd.addParameter("@P_AR_IND", pArInd);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_ASSESS_NEEDED", pAssessNeeded);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pTermCode,NString pRowid,NString pPurgeProcess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PHONEASSIGNMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_PURGE_PROCESS", pPurgeProcess);
				
			cmd.execute();


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PHONEASSIGNMENT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pTermCode,NString pPrcdCode,NString pPhoneAccountNumber,NString pPhoneArea,NString pPhoneExt,NString pPhoneNumber,NDate pBeginDate,NDate pEndDate,NNumber pTotalDays,NNumber pTotalMonths,NNumber pTotalTerms,NString pPscdCode,NDate pPscdDate,NString pOnlOrBat,NString pArInd,NString pRollInd,NString pAssessNeeded,NString pDataOrigin,NString pUserId,NString pCtryCodePhone,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PHONEASSIGNMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PRCD_CODE", pPrcdCode);
			cmd.addParameter("@P_PHONE_ACCOUNT_NUMBER", pPhoneAccountNumber);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_TOTAL_DAYS", pTotalDays);
			cmd.addParameter("@P_TOTAL_MONTHS", pTotalMonths);
			cmd.addParameter("@P_TOTAL_TERMS", pTotalTerms);
			cmd.addParameter("@P_PSCD_CODE", pPscdCode);
			cmd.addParameter("@P_PSCD_DATE", pPscdDate);
			cmd.addParameter("@P_ONL_OR_BAT", pOnlOrBat);
			cmd.addParameter("@P_AR_IND", pArInd);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_ASSESS_NEEDED", pAssessNeeded);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="PhoneassignmentRecRow", dataSourceName="PHONEASSIGNMENT_REC")
	public static class PhoneassignmentRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_PRCD_CODE")
		public NString RPrcdCode;
		@DbRecordField(dataSourceName="R_PHONE_ACCOUNT_NUMBER")
		public NString RPhoneAccountNumber;
		@DbRecordField(dataSourceName="R_PHONE_AREA")
		public NString RPhoneArea;
		@DbRecordField(dataSourceName="R_PHONE_EXT")
		public NString RPhoneExt;
		@DbRecordField(dataSourceName="R_PHONE_NUMBER")
		public NString RPhoneNumber;
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
		@DbRecordField(dataSourceName="R_PSCD_CODE")
		public NString RPscdCode;
		@DbRecordField(dataSourceName="R_PSCD_DATE")
		public NDate RPscdDate;
		@DbRecordField(dataSourceName="R_ONL_OR_BAT")
		public NString ROnlOrBat;
		@DbRecordField(dataSourceName="R_AR_IND")
		public NString RArInd;
		@DbRecordField(dataSourceName="R_ROLL_IND")
		public NString RRollInd;
		@DbRecordField(dataSourceName="R_ASSESS_NEEDED")
		public NString RAssessNeeded;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_CTRY_CODE_PHONE")
		public NString RCtryCodePhone;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
