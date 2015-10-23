package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbAwardSchedule {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_SCHEDULE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fAwardTermLocked(NString pAidyCode,NNumber pPidm,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_SCHEDULE.F_AWARD_TERM_LOCKED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_SCHEDULE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetAwardLock(NNumber pPidm,NString pAidyCode,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_SCHEDULE.F_GET_AWARD_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetAwardSchedLock(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_SCHEDULE.F_GET_AWARD_SCHED_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(AwardScheduleRecRow recOne,AwardScheduleRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_SCHEDULE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AwardScheduleRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AwardScheduleRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_SCHEDULE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_SCHEDULE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_SCHEDULE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_SCHEDULE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NString pTermCode,NNumber pOfferAmt,NDate pOfferDate,NString pDisbFinalInd,NNumber pDistPct,NDate pMemoExpDate,NNumber pOrigOfferAmt,NDate pOrigOfferDate,NNumber pAcceptAmt,NDate pAcceptDate,NNumber pDeclineAmt,NDate pDeclineDate,NNumber pCancelAmt,NDate pCancelDate,NNumber pAuthorizeAmt,NDate pAuthorizeDate,NNumber pMemoAmt,NDate pMemoDate,NNumber pPaidAmt,NDate pPaidDate,NString pPckgLoadInd,NString pNsldsOvrdInd,NString pPellAwrdLoadOpt,NString pLockInd,NString pUserId,NString pCipOverrideCode,NString pMajrOverrideCode,NString pDataOrigin,NString pOverrideDisbRule,NString pAwstCode,NDate pAwstDate,NDate pOfferExpDate,NString pCallingProcess,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_SCHEDULE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_OFFER_AMT", pOfferAmt);
			cmd.addParameter("@P_OFFER_DATE", pOfferDate);
			cmd.addParameter("@P_DISB_FINAL_IND", pDisbFinalInd);
			cmd.addParameter("@P_DIST_PCT", pDistPct);
			cmd.addParameter("@P_MEMO_EXP_DATE", pMemoExpDate);
			cmd.addParameter("@P_ORIG_OFFER_AMT", pOrigOfferAmt);
			cmd.addParameter("@P_ORIG_OFFER_DATE", pOrigOfferDate);
			cmd.addParameter("@P_ACCEPT_AMT", pAcceptAmt);
			cmd.addParameter("@P_ACCEPT_DATE", pAcceptDate);
			cmd.addParameter("@P_DECLINE_AMT", pDeclineAmt);
			cmd.addParameter("@P_DECLINE_DATE", pDeclineDate);
			cmd.addParameter("@P_CANCEL_AMT", pCancelAmt);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_AUTHORIZE_AMT", pAuthorizeAmt);
			cmd.addParameter("@P_AUTHORIZE_DATE", pAuthorizeDate);
			cmd.addParameter("@P_MEMO_AMT", pMemoAmt);
			cmd.addParameter("@P_MEMO_DATE", pMemoDate);
			cmd.addParameter("@P_PAID_AMT", pPaidAmt);
			cmd.addParameter("@P_PAID_DATE", pPaidDate);
			cmd.addParameter("@P_PCKG_LOAD_IND", pPckgLoadInd);
			cmd.addParameter("@P_NSLDS_OVRD_IND", pNsldsOvrdInd);
			cmd.addParameter("@P_PELL_AWRD_LOAD_OPT", pPellAwrdLoadOpt);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CIP_OVERRIDE_CODE", pCipOverrideCode);
			cmd.addParameter("@P_MAJR_OVERRIDE_CODE", pMajrOverrideCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_OVERRIDE_DISB_RULE", pOverrideDisbRule);
			cmd.addParameter("@P_AWST_CODE", pAwstCode);
			cmd.addParameter("@P_AWST_DATE", pAwstDate);
			cmd.addParameter("@P_OFFER_EXP_DATE", pOfferExpDate);
			cmd.addParameter("@P_CALLING_PROCESS", pCallingProcess);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NString pCallingProcess,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_SCHEDULE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_CALLING_PROCESS", pCallingProcess);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_SCHEDULE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NString pTermCode,NNumber pOfferAmt,NDate pOfferDate,NString pDisbFinalInd,NNumber pDistPct,NDate pMemoExpDate,NNumber pOrigOfferAmt,NDate pOrigOfferDate,NNumber pAcceptAmt,NDate pAcceptDate,NNumber pDeclineAmt,NDate pDeclineDate,NNumber pCancelAmt,NDate pCancelDate,NNumber pAuthorizeAmt,NDate pAuthorizeDate,NNumber pMemoAmt,NDate pMemoDate,NNumber pPaidAmt,NDate pPaidDate,NString pPckgLoadInd,NString pNsldsOvrdInd,NString pPellAwrdLoadOpt,NString pLockInd,NString pUserId,NString pCipOverrideCode,NString pMajrOverrideCode,NString pDataOrigin,NString pOverrideDisbRule,NString pAwstCode,NDate pAwstDate,NDate pOfferExpDate,NString pCallingProcess,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_SCHEDULE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_OFFER_AMT", pOfferAmt);
			cmd.addParameter("@P_OFFER_DATE", pOfferDate);
			cmd.addParameter("@P_DISB_FINAL_IND", pDisbFinalInd);
			cmd.addParameter("@P_DIST_PCT", pDistPct);
			cmd.addParameter("@P_MEMO_EXP_DATE", pMemoExpDate);
			cmd.addParameter("@P_ORIG_OFFER_AMT", pOrigOfferAmt);
			cmd.addParameter("@P_ORIG_OFFER_DATE", pOrigOfferDate);
			cmd.addParameter("@P_ACCEPT_AMT", pAcceptAmt);
			cmd.addParameter("@P_ACCEPT_DATE", pAcceptDate);
			cmd.addParameter("@P_DECLINE_AMT", pDeclineAmt);
			cmd.addParameter("@P_DECLINE_DATE", pDeclineDate);
			cmd.addParameter("@P_CANCEL_AMT", pCancelAmt);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_AUTHORIZE_AMT", pAuthorizeAmt);
			cmd.addParameter("@P_AUTHORIZE_DATE", pAuthorizeDate);
			cmd.addParameter("@P_MEMO_AMT", pMemoAmt);
			cmd.addParameter("@P_MEMO_DATE", pMemoDate);
			cmd.addParameter("@P_PAID_AMT", pPaidAmt);
			cmd.addParameter("@P_PAID_DATE", pPaidDate);
			cmd.addParameter("@P_PCKG_LOAD_IND", pPckgLoadInd);
			cmd.addParameter("@P_NSLDS_OVRD_IND", pNsldsOvrdInd);
			cmd.addParameter("@P_PELL_AWRD_LOAD_OPT", pPellAwrdLoadOpt);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CIP_OVERRIDE_CODE", pCipOverrideCode);
			cmd.addParameter("@P_MAJR_OVERRIDE_CODE", pMajrOverrideCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_OVERRIDE_DISB_RULE", pOverrideDisbRule);
			cmd.addParameter("@P_AWST_CODE", pAwstCode);
			cmd.addParameter("@P_AWST_DATE", pAwstDate);
			cmd.addParameter("@P_OFFER_EXP_DATE", pOfferExpDate);
			cmd.addParameter("@P_CALLING_PROCESS", pCallingProcess);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="AwardScheduleRecRow", dataSourceName="AWARD_SCHEDULE_REC")
	public static class AwardScheduleRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_PERIOD")
		public NString RPeriod;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_OFFER_AMT")
		public NNumber ROfferAmt;
		@DbRecordField(dataSourceName="R_OFFER_DATE")
		public NDate ROfferDate;
		@DbRecordField(dataSourceName="R_DISB_FINAL_IND")
		public NString RDisbFinalInd;
		@DbRecordField(dataSourceName="R_DIST_PCT")
		public NNumber RDistPct;
		@DbRecordField(dataSourceName="R_MEMO_EXP_DATE")
		public NDate RMemoExpDate;
		@DbRecordField(dataSourceName="R_ORIG_OFFER_AMT")
		public NNumber ROrigOfferAmt;
		@DbRecordField(dataSourceName="R_ORIG_OFFER_DATE")
		public NDate ROrigOfferDate;
		@DbRecordField(dataSourceName="R_ACCEPT_AMT")
		public NNumber RAcceptAmt;
		@DbRecordField(dataSourceName="R_ACCEPT_DATE")
		public NDate RAcceptDate;
		@DbRecordField(dataSourceName="R_DECLINE_AMT")
		public NNumber RDeclineAmt;
		@DbRecordField(dataSourceName="R_DECLINE_DATE")
		public NDate RDeclineDate;
		@DbRecordField(dataSourceName="R_CANCEL_AMT")
		public NNumber RCancelAmt;
		@DbRecordField(dataSourceName="R_CANCEL_DATE")
		public NDate RCancelDate;
		@DbRecordField(dataSourceName="R_AUTHORIZE_AMT")
		public NNumber RAuthorizeAmt;
		@DbRecordField(dataSourceName="R_AUTHORIZE_DATE")
		public NDate RAuthorizeDate;
		@DbRecordField(dataSourceName="R_MEMO_AMT")
		public NNumber RMemoAmt;
		@DbRecordField(dataSourceName="R_MEMO_DATE")
		public NDate RMemoDate;
		@DbRecordField(dataSourceName="R_PAID_AMT")
		public NNumber RPaidAmt;
		@DbRecordField(dataSourceName="R_PAID_DATE")
		public NDate RPaidDate;
		@DbRecordField(dataSourceName="R_PCKG_LOAD_IND")
		public NString RPckgLoadInd;
		@DbRecordField(dataSourceName="R_NSLDS_OVRD_IND")
		public NString RNsldsOvrdInd;
		@DbRecordField(dataSourceName="R_PELL_AWRD_LOAD_OPT")
		public NString RPellAwrdLoadOpt;
		@DbRecordField(dataSourceName="R_LOCK_IND")
		public NString RLockInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_CIP_OVERRIDE_CODE")
		public NString RCipOverrideCode;
		@DbRecordField(dataSourceName="R_MAJR_OVERRIDE_CODE")
		public NString RMajrOverrideCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_OVERRIDE_DISB_RULE")
		public NString ROverrideDisbRule;
		@DbRecordField(dataSourceName="R_AWST_CODE")
		public NString RAwstCode;
		@DbRecordField(dataSourceName="R_AWST_DATE")
		public NDate RAwstDate;
		@DbRecordField(dataSourceName="R_OFFER_EXP_DATE")
		public NDate ROfferExpDate;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
