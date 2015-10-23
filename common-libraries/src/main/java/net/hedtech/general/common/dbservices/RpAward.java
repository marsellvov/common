package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RpAward {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pAidyCode,NString pFundCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pAidyCode,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pAidyCode,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pAwstCode,NDate pAwstDate,NString pSysInd,NString pLockInd,NString pUnmetNeedOvrdeInd,NString pReplaceTfcOvrdeInd,NString pTreqOvrdeInd,NString pFedLimitOvrdeInd,NString pFundLimitOvrdeInd,NDate pOfferExpDate,NNumber pAcceptAmt,NDate pAcceptDate,NNumber pOfferAmt,NDate pOfferDate,NString pInfoAccessInd,NString pOverrideYrInColl,NString pDataOrigin,NString pOverrideNoPell,NString pOverrideFundRule) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_OFFER_AMT", pOfferAmt);
			cmd.addParameter("@P_OFFER_DATE", pOfferDate);
			cmd.addParameter("@P_INFO_ACCESS_IND", pInfoAccessInd);
			cmd.addParameter("@P_OVERRIDE_YR_IN_COLL", pOverrideYrInColl);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_OVERRIDE_NO_PELL", pOverrideNoPell);
			cmd.addParameter("@P_OVERRIDE_FUND_RULE", pOverrideFundRule);
				
			cmd.execute();


		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pAwstCode,NDate pAwstDate,NString pSysInd,NString pLockInd,NString pUnmetNeedOvrdeInd,NString pReplaceTfcOvrdeInd,NString pTreqOvrdeInd,NString pFedLimitOvrdeInd,NString pFundLimitOvrdeInd,NDate pOfferExpDate,NNumber pAcceptAmt,NDate pAcceptDate,NNumber pOfferAmt,NDate pOfferDate,NString pInfoAccessInd,NString pOverrideYrInColl,NString pDataOrigin,NString pOverrideNoPell) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_OFFER_AMT", pOfferAmt);
			cmd.addParameter("@P_OFFER_DATE", pOfferDate);
			cmd.addParameter("@P_INFO_ACCESS_IND", pInfoAccessInd);
			cmd.addParameter("@P_OVERRIDE_YR_IN_COLL", pOverrideYrInColl);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_OVERRIDE_NO_PELL", pOverrideNoPell);
				
			cmd.execute();


		}
		
		public static void pDelete(NString pAidyCode,NNumber pPidm,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();


		}
		
		public static void pReschedule(NString pAidyCode,NNumber pPidm,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD.P_RESCHEDULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pAwstCode,NDate pAwstDate,NString pSysInd,NString pLockInd,NString pUnmetNeedOvrdeInd,NString pReplaceTfcOvrdeInd,NString pTreqOvrdeInd,NString pFedLimitOvrdeInd,NString pFundLimitOvrdeInd,NDate pOfferExpDate,NNumber pAcceptAmt,NDate pAcceptDate,NNumber pOfferAmt,NDate pOfferDate,NString pInfoAccessInd,NDate pLastWebUpdate,NString pOverrideYrInColl,NString pDataOrigin,NString pOverrideNoPell,NString pOverrideFundRule) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_OFFER_AMT", pOfferAmt);
			cmd.addParameter("@P_OFFER_DATE", pOfferDate);
			cmd.addParameter("@P_INFO_ACCESS_IND", pInfoAccessInd);
			cmd.addParameter("@P_LAST_WEB_UPDATE", pLastWebUpdate);
			cmd.addParameter("@P_OVERRIDE_YR_IN_COLL", pOverrideYrInColl);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_OVERRIDE_NO_PELL", pOverrideNoPell);
			cmd.addParameter("@P_OVERRIDE_FUND_RULE", pOverrideFundRule);
				
			cmd.execute();


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pAwstCode,NDate pAwstDate,NString pSysInd,NString pLockInd,NString pUnmetNeedOvrdeInd,NString pReplaceTfcOvrdeInd,NString pTreqOvrdeInd,NString pFedLimitOvrdeInd,NString pFundLimitOvrdeInd,NDate pOfferExpDate,NNumber pAcceptAmt,NDate pAcceptDate,NNumber pOfferAmt,NDate pOfferDate,NString pInfoAccessInd,NDate pLastWebUpdate,NString pOverrideYrInColl,NString pDataOrigin,NString pOverrideNoPell) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_OFFER_AMT", pOfferAmt);
			cmd.addParameter("@P_OFFER_DATE", pOfferDate);
			cmd.addParameter("@P_INFO_ACCESS_IND", pInfoAccessInd);
			cmd.addParameter("@P_LAST_WEB_UPDATE", pLastWebUpdate);
			cmd.addParameter("@P_OVERRIDE_YR_IN_COLL", pOverrideYrInColl);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_OVERRIDE_NO_PELL", pOverrideNoPell);
				
			cmd.execute();


		}
		
	
	
	
}
