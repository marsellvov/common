package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rpkafrm {
		public static NString fRprbakoExists(NString pSessionId,NString pCurrentUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAFRM.F_RPRBAKO_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SESSION_ID", pSessionId);
			cmd.addParameter("@P_CURRENT_USER", pCurrentUser);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSpecificRprbakoExists(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pCurrentUser,NString pSessionId,NString pCallType,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAFRM.F_SPECIFIC_RPRBAKO_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_CURRENT_USER", pCurrentUser);
			cmd.addParameter("@P_SESSION_ID", pSessionId);
			cmd.addParameter("@P_CALL_TYPE", pCallType);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDeleteRprbako(NString pSessionId,NString pCurrentUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAFRM.P_DELETE_RPRBAKO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSION_ID", pSessionId);
			cmd.addParameter("@P_CURRENT_USER", pCurrentUser);
				
			cmd.execute();


		}
		
		public static void pDeleteSpecificRprbako(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pCurrentUser,NString pSessionId,NString pCallType,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAFRM.P_DELETE_SPECIFIC_RPRBAKO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_CURRENT_USER", pCurrentUser);
			cmd.addParameter("@P_SESSION_ID", pSessionId);
			cmd.addParameter("@P_CALL_TYPE", pCallType);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();


		}
		
		public static void pInsertRprbako(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pCurrentUser,NString pSessionId,NString pCallType,NString pAwstCode,NDate pAwstDate,NString pSysInd,NDate pActivityDate,NDate pOfferExpDate,NNumber pAcceptAmt,NDate pAcceptDate,NString pLockInd,NNumber pOrigOfferAmt,NDate pOrigOfferDate,NNumber pOfferAmt,NDate pOfferDate,NString pUnmetNeedOvrdeInd,NString pReplaceTfcOvrdeInd,NString pTreqOvrdeInd,NString pFedLimitOvrdeInd,NString pFundLimitOvrdeInd,NString pOverrideYrInColl,NString pOverrideNoPell,NString pInfoAccessInd,NString pPeriod,NString pDisbFinalInd,NDate pMemoExpDate,NString pPckgLoadInd,NString pNsldsOvrdInd,NString pPellAwrdLoadOpt,NString pCipOverrideCode,NString pMajrOverrideCode,NString pOverrideFundRule,NString pOverrideDisbRule,NString pCallingProcess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAFRM.P_INSERT_RPRBAKO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_CURRENT_USER", pCurrentUser);
			cmd.addParameter("@P_SESSION_ID", pSessionId);
			cmd.addParameter("@P_CALL_TYPE", pCallType);
			cmd.addParameter("@P_AWST_CODE", pAwstCode);
			cmd.addParameter("@P_AWST_DATE", pAwstDate);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_OFFER_EXP_DATE", pOfferExpDate);
			cmd.addParameter("@P_ACCEPT_AMT", pAcceptAmt);
			cmd.addParameter("@P_ACCEPT_DATE", pAcceptDate);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_ORIG_OFFER_AMT", pOrigOfferAmt);
			cmd.addParameter("@P_ORIG_OFFER_DATE", pOrigOfferDate);
			cmd.addParameter("@P_OFFER_AMT", pOfferAmt);
			cmd.addParameter("@P_OFFER_DATE", pOfferDate);
			cmd.addParameter("@P_UNMET_NEED_OVRDE_IND", pUnmetNeedOvrdeInd);
			cmd.addParameter("@P_REPLACE_TFC_OVRDE_IND", pReplaceTfcOvrdeInd);
			cmd.addParameter("@P_TREQ_OVRDE_IND", pTreqOvrdeInd);
			cmd.addParameter("@P_FED_LIMIT_OVRDE_IND", pFedLimitOvrdeInd);
			cmd.addParameter("@P_FUND_LIMIT_OVRDE_IND", pFundLimitOvrdeInd);
			cmd.addParameter("@P_OVERRIDE_YR_IN_COLL", pOverrideYrInColl);
			cmd.addParameter("@P_OVERRIDE_NO_PELL", pOverrideNoPell);
			cmd.addParameter("@P_INFO_ACCESS_IND", pInfoAccessInd);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DISB_FINAL_IND", pDisbFinalInd);
			cmd.addParameter("@P_MEMO_EXP_DATE", pMemoExpDate);
			cmd.addParameter("@P_PCKG_LOAD_IND", pPckgLoadInd);
			cmd.addParameter("@P_NSLDS_OVRD_IND", pNsldsOvrdInd);
			cmd.addParameter("@P_PELL_AWRD_LOAD_OPT", pPellAwrdLoadOpt);
			cmd.addParameter("@P_CIP_OVERRIDE_CODE", pCipOverrideCode);
			cmd.addParameter("@P_MAJR_OVERRIDE_CODE", pMajrOverrideCode);
			cmd.addParameter("@P_OVERRIDE_FUND_RULE", pOverrideFundRule);
			cmd.addParameter("@P_OVERRIDE_DISB_RULE", pOverrideDisbRule);
			cmd.addParameter("@P_CALLING_PROCESS", pCallingProcess);
				
			cmd.execute();


		}
		
		public static void pProcessOnlineAwards(NString pSessionId,NString pCurrentUser,Ref<NString> pErrorMessageOut,Ref<NString> pFundCodeOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAFRM.P_PROCESS_ONLINE_AWARDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSION_ID", pSessionId);
			cmd.addParameter("@P_CURRENT_USER", pCurrentUser);
			cmd.addParameter("@P_ERROR_MESSAGE_OUT", NString.class);
			cmd.addParameter("@P_FUND_CODE_OUT", NString.class);
				
			cmd.execute();
			pErrorMessageOut.val = cmd.getParameterValue("@P_ERROR_MESSAGE_OUT", NString.class);
			pFundCodeOut.val = cmd.getParameterValue("@P_FUND_CODE_OUT", NString.class);


		}
		
		public static void pProcessOnlineTerms(NString pSessionId,NString pCurrentUser,Ref<NString> pErrorMessageOut,Ref<NString> pFundCodeOut,Ref<NString> pPeriodOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKAFRM.P_PROCESS_ONLINE_TERMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SESSION_ID", pSessionId);
			cmd.addParameter("@P_CURRENT_USER", pCurrentUser);
			cmd.addParameter("@P_ERROR_MESSAGE_OUT", NString.class);
			cmd.addParameter("@P_FUND_CODE_OUT", NString.class);
			cmd.addParameter("@P_PERIOD_OUT", NString.class);
				
			cmd.execute();
			pErrorMessageOut.val = cmd.getParameterValue("@P_ERROR_MESSAGE_OUT", NString.class);
			pFundCodeOut.val = cmd.getParameterValue("@P_FUND_CODE_OUT", NString.class);
			pPeriodOut.val = cmd.getParameterValue("@P_PERIOD_OUT", NString.class);


		}
		
	
	
	
}
