package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbAwardScheduleRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_SCHEDULE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NNumber pOfferAmt,NDate pOfferDate,NString pDisbFinalInd,NNumber pDistPct,NDate pMemoExpDate,NNumber pOrigOfferAmt,NDate pOrigOfferDate,NNumber pAcceptAmt,NDate pAcceptDate,NNumber pDeclineAmt,NDate pDeclineDate,NNumber pCancelAmt,NDate pCancelDate,NNumber pAuthorizeAmt,NDate pAuthorizeDate,NNumber pMemoAmt,NDate pMemoDate,NNumber pPaidAmt,NDate pPaidDate,NString pPckgLoadInd,NString pNsldsOvrdInd,NString pPellAwrdLoadOpt,NString pLockInd,NString pUserId,NString pCipOverrideCode,NString pMajrOverrideCode,NString pDataOrigin,NString pOverrideDisbRule,NString pTermCode,NString pAwstCode,NDate pAwstDate,NDate pOfferExpDate,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_SCHEDULE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
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
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_AWST_CODE", pAwstCode);
			cmd.addParameter("@P_AWST_DATE", pAwstDate);
			cmd.addParameter("@P_OFFER_EXP_DATE", pOfferExpDate);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NNumber pOfferAmt,NDate pOfferDate,NString pDisbFinalInd,NNumber pDistPct,NDate pMemoExpDate,NNumber pOrigOfferAmt,NDate pOrigOfferDate,NNumber pAcceptAmt,NDate pAcceptDate,NNumber pDeclineAmt,NDate pDeclineDate,NNumber pCancelAmt,NDate pCancelDate,NNumber pAuthorizeAmt,NDate pAuthorizeDate,NNumber pMemoAmt,NDate pMemoDate,NNumber pPaidAmt,NDate pPaidDate,NString pPckgLoadInd,NString pNsldsOvrdInd,NString pPellAwrdLoadOpt,NString pLockInd,NString pUserId,NString pCipOverrideCode,NString pMajrOverrideCode,NString pDataOrigin,NString pOverrideDisbRule,NString pTermCode,NString pAwstCode,NDate pAwstDate,NDate pOfferExpDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_SCHEDULE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
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
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_AWST_CODE", pAwstCode);
			cmd.addParameter("@P_AWST_DATE", pAwstDate);
			cmd.addParameter("@P_OFFER_EXP_DATE", pOfferExpDate);
				
			cmd.execute();


		}
		
	
	
	
}
