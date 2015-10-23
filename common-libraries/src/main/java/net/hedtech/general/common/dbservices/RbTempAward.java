package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbTempAward {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_AWARD.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pAidyCode,NString pFundCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_AWARD.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TempAwardRecRow recOne,TempAwardRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_AWARD.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TempAwardRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TempAwardRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pAidyCode,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_AWARD.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_AWARD.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pAidyCode,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_AWARD.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pAidyCode,NString pFundCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_AWARD.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static TempAwardRecRow fQueryOneRec(NNumber pPidm,NString pAidyCode,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_AWARD.F_QUERY_ONE_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(TempAwardRecRow.class));
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(TempAwardRecRow.class);

		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pAwstCode,NDate pAwstDate,NString pSysInd,NString pUnmetNeedOvrdeInd,NString pReplaceTfcOvrdeInd,NString pTreqOvrdeInd,NString pFedLimitOvrdeInd,NDate pOfferExpDate,NNumber pAcceptAmt,NDate pAcceptDate,NNumber pAuthorizeAmt,NDate pAuthorizeDate,NNumber pMemoAmt,NDate pMemoDate,NNumber pPaidAmt,NDate pPaidDate,NString pLockInd,NNumber pOrigOfferAmt,NDate pOrigOfferDate,NNumber pOfferAmt,NDate pOfferDate,NNumber pDeclineAmt,NDate pDeclineDate,NNumber pCancelAmt,NDate pCancelDate,NString pFundLimitOvrdeInd,NString pInfoAccessInd,NString pOverrideYrInColl,NString pOverrideNoPell,NString pOverrideFundRule,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_AWARD.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_AWST_CODE", pAwstCode);
			cmd.addParameter("@P_AWST_DATE", pAwstDate);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_UNMET_NEED_OVRDE_IND", pUnmetNeedOvrdeInd);
			cmd.addParameter("@P_REPLACE_TFC_OVRDE_IND", pReplaceTfcOvrdeInd);
			cmd.addParameter("@P_TREQ_OVRDE_IND", pTreqOvrdeInd);
			cmd.addParameter("@P_FED_LIMIT_OVRDE_IND", pFedLimitOvrdeInd);
			cmd.addParameter("@P_OFFER_EXP_DATE", pOfferExpDate);
			cmd.addParameter("@P_ACCEPT_AMT", pAcceptAmt);
			cmd.addParameter("@P_ACCEPT_DATE", pAcceptDate);
			cmd.addParameter("@P_AUTHORIZE_AMT", pAuthorizeAmt);
			cmd.addParameter("@P_AUTHORIZE_DATE", pAuthorizeDate);
			cmd.addParameter("@P_MEMO_AMT", pMemoAmt);
			cmd.addParameter("@P_MEMO_DATE", pMemoDate);
			cmd.addParameter("@P_PAID_AMT", pPaidAmt);
			cmd.addParameter("@P_PAID_DATE", pPaidDate);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_ORIG_OFFER_AMT", pOrigOfferAmt);
			cmd.addParameter("@P_ORIG_OFFER_DATE", pOrigOfferDate);
			cmd.addParameter("@P_OFFER_AMT", pOfferAmt);
			cmd.addParameter("@P_OFFER_DATE", pOfferDate);
			cmd.addParameter("@P_DECLINE_AMT", pDeclineAmt);
			cmd.addParameter("@P_DECLINE_DATE", pDeclineDate);
			cmd.addParameter("@P_CANCEL_AMT", pCancelAmt);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_FUND_LIMIT_OVRDE_IND", pFundLimitOvrdeInd);
			cmd.addParameter("@P_INFO_ACCESS_IND", pInfoAccessInd);
			cmd.addParameter("@P_OVERRIDE_YR_IN_COLL", pOverrideYrInColl);
			cmd.addParameter("@P_OVERRIDE_NO_PELL", pOverrideNoPell);
			cmd.addParameter("@P_OVERRIDE_FUND_RULE", pOverrideFundRule);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pAidyCode,NString pFundCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_AWARD.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pAidyCode,NString pFundCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_AWARD.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pAwstCode,NDate pAwstDate,NString pSysInd,NString pUnmetNeedOvrdeInd,NString pReplaceTfcOvrdeInd,NString pTreqOvrdeInd,NString pFedLimitOvrdeInd,NDate pOfferExpDate,NNumber pAcceptAmt,NDate pAcceptDate,NNumber pAuthorizeAmt,NDate pAuthorizeDate,NNumber pMemoAmt,NDate pMemoDate,NNumber pPaidAmt,NDate pPaidDate,NString pLockInd,NNumber pOrigOfferAmt,NDate pOrigOfferDate,NNumber pOfferAmt,NDate pOfferDate,NNumber pDeclineAmt,NDate pDeclineDate,NNumber pCancelAmt,NDate pCancelDate,NString pFundLimitOvrdeInd,NString pInfoAccessInd,NString pOverrideYrInColl,NString pOverrideNoPell,NString pOverrideFundRule,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_AWARD.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_AWST_CODE", pAwstCode);
			cmd.addParameter("@P_AWST_DATE", pAwstDate);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_UNMET_NEED_OVRDE_IND", pUnmetNeedOvrdeInd);
			cmd.addParameter("@P_REPLACE_TFC_OVRDE_IND", pReplaceTfcOvrdeInd);
			cmd.addParameter("@P_TREQ_OVRDE_IND", pTreqOvrdeInd);
			cmd.addParameter("@P_FED_LIMIT_OVRDE_IND", pFedLimitOvrdeInd);
			cmd.addParameter("@P_OFFER_EXP_DATE", pOfferExpDate);
			cmd.addParameter("@P_ACCEPT_AMT", pAcceptAmt);
			cmd.addParameter("@P_ACCEPT_DATE", pAcceptDate);
			cmd.addParameter("@P_AUTHORIZE_AMT", pAuthorizeAmt);
			cmd.addParameter("@P_AUTHORIZE_DATE", pAuthorizeDate);
			cmd.addParameter("@P_MEMO_AMT", pMemoAmt);
			cmd.addParameter("@P_MEMO_DATE", pMemoDate);
			cmd.addParameter("@P_PAID_AMT", pPaidAmt);
			cmd.addParameter("@P_PAID_DATE", pPaidDate);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_ORIG_OFFER_AMT", pOrigOfferAmt);
			cmd.addParameter("@P_ORIG_OFFER_DATE", pOrigOfferDate);
			cmd.addParameter("@P_OFFER_AMT", pOfferAmt);
			cmd.addParameter("@P_OFFER_DATE", pOfferDate);
			cmd.addParameter("@P_DECLINE_AMT", pDeclineAmt);
			cmd.addParameter("@P_DECLINE_DATE", pDeclineDate);
			cmd.addParameter("@P_CANCEL_AMT", pCancelAmt);
			cmd.addParameter("@P_CANCEL_DATE", pCancelDate);
			cmd.addParameter("@P_FUND_LIMIT_OVRDE_IND", pFundLimitOvrdeInd);
			cmd.addParameter("@P_INFO_ACCESS_IND", pInfoAccessInd);
			cmd.addParameter("@P_OVERRIDE_YR_IN_COLL", pOverrideYrInColl);
			cmd.addParameter("@P_OVERRIDE_NO_PELL", pOverrideNoPell);
			cmd.addParameter("@P_OVERRIDE_FUND_RULE", pOverrideFundRule);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TempAwardRecRow", dataSourceName="TEMP_AWARD_REC")
	public static class TempAwardRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_AWST_CODE")
		public NString RAwstCode;
		@DbRecordField(dataSourceName="R_AWST_DATE")
		public NDate RAwstDate;
		@DbRecordField(dataSourceName="R_SYS_IND")
		public NString RSysInd;
		@DbRecordField(dataSourceName="R_UNMET_NEED_OVRDE_IND")
		public NString RUnmetNeedOvrdeInd;
		@DbRecordField(dataSourceName="R_REPLACE_TFC_OVRDE_IND")
		public NString RReplaceTfcOvrdeInd;
		@DbRecordField(dataSourceName="R_TREQ_OVRDE_IND")
		public NString RTreqOvrdeInd;
		@DbRecordField(dataSourceName="R_FED_LIMIT_OVRDE_IND")
		public NString RFedLimitOvrdeInd;
		@DbRecordField(dataSourceName="R_OFFER_EXP_DATE")
		public NDate ROfferExpDate;
		@DbRecordField(dataSourceName="R_ACCEPT_AMT")
		public NNumber RAcceptAmt;
		@DbRecordField(dataSourceName="R_ACCEPT_DATE")
		public NDate RAcceptDate;
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
		@DbRecordField(dataSourceName="R_LOCK_IND")
		public NString RLockInd;
		@DbRecordField(dataSourceName="R_ORIG_OFFER_AMT")
		public NNumber ROrigOfferAmt;
		@DbRecordField(dataSourceName="R_ORIG_OFFER_DATE")
		public NDate ROrigOfferDate;
		@DbRecordField(dataSourceName="R_OFFER_AMT")
		public NNumber ROfferAmt;
		@DbRecordField(dataSourceName="R_OFFER_DATE")
		public NDate ROfferDate;
		@DbRecordField(dataSourceName="R_DECLINE_AMT")
		public NNumber RDeclineAmt;
		@DbRecordField(dataSourceName="R_DECLINE_DATE")
		public NDate RDeclineDate;
		@DbRecordField(dataSourceName="R_CANCEL_AMT")
		public NNumber RCancelAmt;
		@DbRecordField(dataSourceName="R_CANCEL_DATE")
		public NDate RCancelDate;
		@DbRecordField(dataSourceName="R_FUND_LIMIT_OVRDE_IND")
		public NString RFundLimitOvrdeInd;
		@DbRecordField(dataSourceName="R_INFO_ACCESS_IND")
		public NString RInfoAccessInd;
		@DbRecordField(dataSourceName="R_OVERRIDE_YR_IN_COLL")
		public NString ROverrideYrInColl;
		@DbRecordField(dataSourceName="R_OVERRIDE_NO_PELL")
		public NString ROverrideNoPell;
		@DbRecordField(dataSourceName="R_OVERRIDE_FUND_RULE")
		public NString ROverrideFundRule;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
