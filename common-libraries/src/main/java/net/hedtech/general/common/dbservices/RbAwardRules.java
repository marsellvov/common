package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbAwardRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAidyCode,NNumber pPidm,NString pFundCode,NString pAwstCode,NDate pAwstDate,NString pSysInd,NString pLockInd,NString pUnmetNeedOvrdeInd,NString pReplaceTfcOvrdeInd,NString pTreqOvrdeInd,NString pFedLimitOvrdeInd,NString pFundLimitOvrdeInd,NDate pOfferExpDate,NNumber pAcceptAmt,NDate pAcceptDate,NNumber pAuthorizeAmt,NDate pAuthorizeDate,NNumber pMemoAmt,NDate pMemoDate,NNumber pPaidAmt,NDate pPaidDate,NNumber pOrigOfferAmt,NDate pOrigOfferDate,NNumber pOfferAmt,NDate pOfferDate,NNumber pDeclineAmt,NDate pDeclineDate,NNumber pCancelAmt,NDate pCancelDate,NString pInfoAccessInd,NDate pLastWebUpdate,NString pUserId,NString pOverrideYrInColl,NString pDataOrigin,NString pOverrideNoPell,NString pOverrideFundRule,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_AWST_CODE", pAwstCode);
			cmd.addParameter("@P_AWST_DATE", pAwstDate);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_UNMET_NEED_OVRDE_IND", pUnmetNeedOvrdeInd);
			cmd.addParameter("@P_REPLACE_TFC_OVRDE_IND", pReplaceTfcOvrdeInd);
			cmd.addParameter("@P_TREQ_OVRDE_IND", pTreqOvrdeInd);
			cmd.addParameter("@P_FED_LIMIT_OVRDE_IND", pFedLimitOvrdeInd);
			cmd.addParameter("@P_FUND_LIMIT_OVRDE_IND", pFundLimitOvrdeInd);
			cmd.addParameter("@P_OFFER_EXP_DATE", pOfferExpDate);
			cmd.addParameter("@P_ACCEPT_AMT", pAcceptAmt);
			cmd.addParameter("@P_ACCEPT_DATE", pAcceptDate);
			cmd.addParameter("@P_AUTHORIZE_AMT", pAuthorizeAmt);
			cmd.addParameter("@P_AUTHORIZE_DATE", pAuthorizeDate);
			cmd.addParameter("@P_MEMO_AMT", pMemoAmt);
			cmd.addParameter("@P_MEMO_DATE", pMemoDate);
			cmd.addParameter("@P_PAID_AMT", pPaidAmt);
			cmd.addParameter("@P_PAID_DATE", pPaidDate);
			cmd.addParameter("@P_ORIG_OFFER_AMT", pOrigOfferAmt);
			cmd.addParameter("@P_ORIG_OFFER_DATE", pOrigOfferDate);
			cmd.addParameter("@P_OFFER_AMT", pOfferAmt);
			cmd.addParameter("@P_OFFER_DATE", pOfferDate);
			cmd.addParameter("@P_DECLINE_AMT", pDeclineAmt);
			cmd.addParameter("@P_DECLINE_DATE", pDeclineDate);
			cmd.addParameter("@P_CANCEL_AMT", pCancelAmt);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_INFO_ACCESS_IND", pInfoAccessInd);
			cmd.addParameter("@P_LAST_WEB_UPDATE", pLastWebUpdate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_OVERRIDE_YR_IN_COLL", pOverrideYrInColl);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_OVERRIDE_NO_PELL", pOverrideNoPell);
			cmd.addParameter("@P_OVERRIDE_FUND_RULE", pOverrideFundRule);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pAwstCode,NDate pAwstDate,NString pSysInd,NString pLockInd,NString pUnmetNeedOvrdeInd,NString pReplaceTfcOvrdeInd,NString pTreqOvrdeInd,NString pFedLimitOvrdeInd,NString pFundLimitOvrdeInd,NDate pOfferExpDate,NNumber pAcceptAmt,NDate pAcceptDate,NNumber pAuthorizeAmt,NDate pAuthorizeDate,NNumber pMemoAmt,NDate pMemoDate,NNumber pPaidAmt,NDate pPaidDate,NNumber pOrigOfferAmt,NDate pOrigOfferDate,NNumber pOfferAmt,NDate pOfferDate,NNumber pDeclineAmt,NDate pDeclineDate,NNumber pCancelAmt,NDate pCancelDate,NString pInfoAccessInd,NDate pLastWebUpdate,NString pUserId,NString pOverrideYrInColl,NString pDataOrigin,NString pOverrideNoPell,NString pOverrideFundRule) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_AWARD_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_AWST_CODE", pAwstCode);
			cmd.addParameter("@P_AWST_DATE", pAwstDate);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_UNMET_NEED_OVRDE_IND", pUnmetNeedOvrdeInd);
			cmd.addParameter("@P_REPLACE_TFC_OVRDE_IND", pReplaceTfcOvrdeInd);
			cmd.addParameter("@P_TREQ_OVRDE_IND", pTreqOvrdeInd);
			cmd.addParameter("@P_FED_LIMIT_OVRDE_IND", pFedLimitOvrdeInd);
			cmd.addParameter("@P_FUND_LIMIT_OVRDE_IND", pFundLimitOvrdeInd);
			cmd.addParameter("@P_OFFER_EXP_DATE", pOfferExpDate);
			cmd.addParameter("@P_ACCEPT_AMT", pAcceptAmt);
			cmd.addParameter("@P_ACCEPT_DATE", pAcceptDate);
			cmd.addParameter("@P_AUTHORIZE_AMT", pAuthorizeAmt);
			cmd.addParameter("@P_AUTHORIZE_DATE", pAuthorizeDate);
			cmd.addParameter("@P_MEMO_AMT", pMemoAmt);
			cmd.addParameter("@P_MEMO_DATE", pMemoDate);
			cmd.addParameter("@P_PAID_AMT", pPaidAmt);
			cmd.addParameter("@P_PAID_DATE", pPaidDate);
			cmd.addParameter("@P_ORIG_OFFER_AMT", pOrigOfferAmt);
			cmd.addParameter("@P_ORIG_OFFER_DATE", pOrigOfferDate);
			cmd.addParameter("@P_OFFER_AMT", pOfferAmt);
			cmd.addParameter("@P_OFFER_DATE", pOfferDate);
			cmd.addParameter("@P_DECLINE_AMT", pDeclineAmt);
			cmd.addParameter("@P_DECLINE_DATE", pDeclineDate);
			cmd.addParameter("@P_CANCEL_AMT", pCancelAmt);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_INFO_ACCESS_IND", pInfoAccessInd);
			cmd.addParameter("@P_LAST_WEB_UPDATE", pLastWebUpdate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_OVERRIDE_YR_IN_COLL", pOverrideYrInColl);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_OVERRIDE_NO_PELL", pOverrideNoPell);
			cmd.addParameter("@P_OVERRIDE_FUND_RULE", pOverrideFundRule);
				
			cmd.execute();


		}
		
	
	
	
}
