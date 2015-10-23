package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbLoanSchedule {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_SCHEDULE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pFundCode,NNumber pApplNo,NString pPeriod,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_SCHEDULE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(LoanScheduleRecRow recOne,LoanScheduleRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_SCHEDULE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, LoanScheduleRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, LoanScheduleRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pFundCode,NNumber pApplNo,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_SCHEDULE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_SCHEDULE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pFundCode,NNumber pApplNo,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_SCHEDULE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pFundCode,NNumber pApplNo,NString pPeriod,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_SCHEDULE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pFundCode,NNumber pApplNo,NString pPeriod,NNumber pLoanPct,NNumber pRecommendAmt,NNumber pRequestAmt,NNumber pExpectAmt,NNumber pApproveAmt,NDate pMemoExpDate,NNumber pCertHr,NString pAidyCode,NNumber pDlSeqNo,NString pUserId,NString pExcludeLnexFlag,NString pTermCode,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_SCHEDULE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_LOAN_PCT", pLoanPct);
			cmd.addParameter("@P_RECOMMEND_AMT", pRecommendAmt);
			cmd.addParameter("@P_REQUEST_AMT", pRequestAmt);
			cmd.addParameter("@P_EXPECT_AMT", pExpectAmt);
			cmd.addParameter("@P_APPROVE_AMT", pApproveAmt);
			cmd.addParameter("@P_MEMO_EXP_DATE", pMemoExpDate);
			cmd.addParameter("@P_CERT_HR", pCertHr);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_DL_SEQ_NO", pDlSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_EXCLUDE_LNEX_FLAG", pExcludeLnexFlag);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pFundCode,NNumber pApplNo,NString pPeriod,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_SCHEDULE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pFundCode,NNumber pApplNo,NString pPeriod,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_SCHEDULE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pFundCode,NNumber pApplNo,NString pPeriod,NNumber pLoanPct,NNumber pRecommendAmt,NNumber pRequestAmt,NNumber pExpectAmt,NNumber pApproveAmt,NDate pMemoExpDate,NNumber pCertHr,NString pAidyCode,NNumber pDlSeqNo,NString pUserId,NString pExcludeLnexFlag,NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_LOAN_SCHEDULE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_LOAN_PCT", pLoanPct);
			cmd.addParameter("@P_RECOMMEND_AMT", pRecommendAmt);
			cmd.addParameter("@P_REQUEST_AMT", pRequestAmt);
			cmd.addParameter("@P_EXPECT_AMT", pExpectAmt);
			cmd.addParameter("@P_APPROVE_AMT", pApproveAmt);
			cmd.addParameter("@P_MEMO_EXP_DATE", pMemoExpDate);
			cmd.addParameter("@P_CERT_HR", pCertHr);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_DL_SEQ_NO", pDlSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_EXCLUDE_LNEX_FLAG", pExcludeLnexFlag);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="LoanScheduleRecRow", dataSourceName="LOAN_SCHEDULE_REC")
	public static class LoanScheduleRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_APPL_NO")
		public NNumber RApplNo;
		@DbRecordField(dataSourceName="R_PERIOD")
		public NString RPeriod;
		@DbRecordField(dataSourceName="R_LOAN_PCT")
		public NNumber RLoanPct;
		@DbRecordField(dataSourceName="R_RECOMMEND_AMT")
		public NNumber RRecommendAmt;
		@DbRecordField(dataSourceName="R_REQUEST_AMT")
		public NNumber RRequestAmt;
		@DbRecordField(dataSourceName="R_EXPECT_AMT")
		public NNumber RExpectAmt;
		@DbRecordField(dataSourceName="R_APPROVE_AMT")
		public NNumber RApproveAmt;
		@DbRecordField(dataSourceName="R_MEMO_EXP_DATE")
		public NDate RMemoExpDate;
		@DbRecordField(dataSourceName="R_CERT_HR")
		public NNumber RCertHr;
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_DL_SEQ_NO")
		public NNumber RDlSeqNo;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_EXCLUDE_LNEX_FLAG")
		public NString RExcludeLnexFlag;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
