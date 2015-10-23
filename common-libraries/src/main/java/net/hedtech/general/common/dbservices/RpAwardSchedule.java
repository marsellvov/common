package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RpAwardSchedule {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD_SCHEDULE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD_SCHEDULE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD_SCHEDULE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD_SCHEDULE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD_SCHEDULE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD_SCHEDULE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD_SCHEDULE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NString pTermCode,NNumber pOfferAmt,NDate pOfferDate,NDate pMemoExpDate,NNumber pAcceptAmt,NDate pAcceptDate,NString pPckgLoadInd,NString pNsldsOvrdInd,NString pPellAwrdLoadOpt,NString pLockInd,NString pCipOverrideCode,NString pMajrOverrideCode,NString pOverrideDisbRule,NString pAwstCode,NDate pAwstDate,NDate pOfferExpDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD_SCHEDULE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_OFFER_AMT", pOfferAmt);
			cmd.addParameter("@P_OFFER_DATE", pOfferDate);
			cmd.addParameter("@P_MEMO_EXP_DATE", pMemoExpDate);
			cmd.addParameter("@P_ACCEPT_AMT", pAcceptAmt);
			cmd.addParameter("@P_ACCEPT_DATE", pAcceptDate);
			cmd.addParameter("@P_PCKG_LOAD_IND", pPckgLoadInd);
			cmd.addParameter("@P_NSLDS_OVRD_IND", pNsldsOvrdInd);
			cmd.addParameter("@P_PELL_AWRD_LOAD_OPT", pPellAwrdLoadOpt);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_CIP_OVERRIDE_CODE", pCipOverrideCode);
			cmd.addParameter("@P_MAJR_OVERRIDE_CODE", pMajrOverrideCode);
			cmd.addParameter("@P_OVERRIDE_DISB_RULE", pOverrideDisbRule);
			cmd.addParameter("@P_AWST_CODE", pAwstCode);
			cmd.addParameter("@P_AWST_DATE", pAwstDate);
			cmd.addParameter("@P_OFFER_EXP_DATE", pOfferExpDate);
				
			cmd.execute();


		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pTermCode,NNumber pOfferAmt,NDate pOfferDate,NDate pMemoExpDate,NNumber pAcceptAmt,NDate pAcceptDate,NString pPckgLoadInd,NString pNsldsOvrdInd,NString pPellAwrdLoadOpt,NString pLockInd,NString pCipOverrideCode,NString pMajrOverrideCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD_SCHEDULE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_OFFER_AMT", pOfferAmt);
			cmd.addParameter("@P_OFFER_DATE", pOfferDate);
			cmd.addParameter("@P_MEMO_EXP_DATE", pMemoExpDate);
			cmd.addParameter("@P_ACCEPT_AMT", pAcceptAmt);
			cmd.addParameter("@P_ACCEPT_DATE", pAcceptDate);
			cmd.addParameter("@P_PCKG_LOAD_IND", pPckgLoadInd);
			cmd.addParameter("@P_NSLDS_OVRD_IND", pNsldsOvrdInd);
			cmd.addParameter("@P_PELL_AWRD_LOAD_OPT", pPellAwrdLoadOpt);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_CIP_OVERRIDE_CODE", pCipOverrideCode);
			cmd.addParameter("@P_MAJR_OVERRIDE_CODE", pMajrOverrideCode);
				
			cmd.execute();


		}
		
		public static void pDelete(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD_SCHEDULE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();


		}
		
		public static void pDelete(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD_SCHEDULE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NString pTermCode,NNumber pOfferAmt,NDate pOfferDate,NDate pMemoExpDate,NNumber pAcceptAmt,NDate pAcceptDate,NString pPckgLoadInd,NString pNsldsOvrdInd,NString pPellAwrdLoadOpt,NString pLockInd,NString pCipOverrideCode,NString pMajrOverrideCode,NString pOverrideDisbRule,NString pAwstCode,NDate pAwstDate,NDate pOfferExpDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD_SCHEDULE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_OFFER_AMT", pOfferAmt);
			cmd.addParameter("@P_OFFER_DATE", pOfferDate);
			cmd.addParameter("@P_MEMO_EXP_DATE", pMemoExpDate);
			cmd.addParameter("@P_ACCEPT_AMT", pAcceptAmt);
			cmd.addParameter("@P_ACCEPT_DATE", pAcceptDate);
			cmd.addParameter("@P_PCKG_LOAD_IND", pPckgLoadInd);
			cmd.addParameter("@P_NSLDS_OVRD_IND", pNsldsOvrdInd);
			cmd.addParameter("@P_PELL_AWRD_LOAD_OPT", pPellAwrdLoadOpt);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_CIP_OVERRIDE_CODE", pCipOverrideCode);
			cmd.addParameter("@P_MAJR_OVERRIDE_CODE", pMajrOverrideCode);
			cmd.addParameter("@P_OVERRIDE_DISB_RULE", pOverrideDisbRule);
			cmd.addParameter("@P_AWST_CODE", pAwstCode);
			cmd.addParameter("@P_AWST_DATE", pAwstDate);
			cmd.addParameter("@P_OFFER_EXP_DATE", pOfferExpDate);
				
			cmd.execute();


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pTermCode,NNumber pOfferAmt,NDate pOfferDate,NDate pMemoExpDate,NNumber pAcceptAmt,NDate pAcceptDate,NString pPckgLoadInd,NString pNsldsOvrdInd,NString pPellAwrdLoadOpt,NString pLockInd,NString pCipOverrideCode,NString pMajrOverrideCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RP_AWARD_SCHEDULE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_OFFER_AMT", pOfferAmt);
			cmd.addParameter("@P_OFFER_DATE", pOfferDate);
			cmd.addParameter("@P_MEMO_EXP_DATE", pMemoExpDate);
			cmd.addParameter("@P_ACCEPT_AMT", pAcceptAmt);
			cmd.addParameter("@P_ACCEPT_DATE", pAcceptDate);
			cmd.addParameter("@P_PCKG_LOAD_IND", pPckgLoadInd);
			cmd.addParameter("@P_NSLDS_OVRD_IND", pNsldsOvrdInd);
			cmd.addParameter("@P_PELL_AWRD_LOAD_OPT", pPellAwrdLoadOpt);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_CIP_OVERRIDE_CODE", pCipOverrideCode);
			cmd.addParameter("@P_MAJR_OVERRIDE_CODE", pMajrOverrideCode);
				
			cmd.execute();


		}
		
	
	
	
}
