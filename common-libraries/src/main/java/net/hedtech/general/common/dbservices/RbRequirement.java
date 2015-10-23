package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbRequirement {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pAidyCode,NString pTreqCode,NString pFundCode,NString pPeriod,NString pTreqDesc,NString pSbgiTypeInd,NString pSbgiCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TREQ_DESC", pTreqDesc);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(RequirementRecRow recOne,RequirementRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, RequirementRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, RequirementRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pAidyCode,NString pTreqCode,NString pFundCode,NString pPeriod,NString pTreqDesc,NString pSbgiTypeInd,NString pSbgiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TREQ_DESC", pTreqDesc);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pAidyCode,NString pTreqCode,NString pFundCode,NString pPeriod,NString pTreqDesc,NString pSbgiTypeInd,NString pSbgiCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TREQ_DESC", pTreqDesc);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pAidyCode,NString pTreqCode,NString pFundCode,NString pPeriod,NString pTreqDesc,NString pSbgiTypeInd,NString pSbgiCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TREQ_DESC", pTreqDesc);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fReqIsMpn(NString pAidyCode,NString pTreqCode,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT.F_REQ_IS_MPN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fReqIsSatisfyOnce(NString pTreqCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT.F_REQ_IS_SATISFY_ONCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pTreqCode,NString pTreqDesc,NString pSatInd,NDate pStatDate,NDate pEstDate,NString pTrstCode,NString pPckgInd,NString pDisbInd,NString pFundCode,NString pSysInd,NString pSbgiCode,NString pMemoInd,NString pUserId,NDate pPerkMpnExpDate,NDate pSatisfiedDate,NDate pMpnFirstDisbDate,NDate pMpnSignedDate,NString pTrkLtrInd,NString pDataOrigin,NString pInfoAccessInd,NString pTermCode,NString pSbgiTypeInd,NString pPeriod,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_TREQ_DESC", pTreqDesc);
			cmd.addParameter("@P_SAT_IND", pSatInd);
			cmd.addParameter("@P_STAT_DATE", pStatDate);
			cmd.addParameter("@P_EST_DATE", pEstDate);
			cmd.addParameter("@P_TRST_CODE", pTrstCode);
			cmd.addParameter("@P_PCKG_IND", pPckgInd);
			cmd.addParameter("@P_DISB_IND", pDisbInd);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_MEMO_IND", pMemoInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PERK_MPN_EXP_DATE", pPerkMpnExpDate);
			cmd.addParameter("@P_SATISFIED_DATE", pSatisfiedDate);
			cmd.addParameter("@P_MPN_FIRST_DISB_DATE", pMpnFirstDisbDate);
			cmd.addParameter("@P_MPN_SIGNED_DATE", pMpnSignedDate);
			cmd.addParameter("@P_TRK_LTR_IND", pTrkLtrInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INFO_ACCESS_IND", pInfoAccessInd);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pAidyCode,NString pTreqCode,NString pFundCode,NString pPeriod,NString pTreqDesc,NString pSbgiTypeInd,NString pSbgiCode,NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TREQ_DESC", pTreqDesc);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pAidyCode,NString pTreqCode,NString pFundCode,NString pPeriod,NString pTreqDesc,NString pSbgiTypeInd,NString pSbgiCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TREQ_DESC", pTreqDesc);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pTreqCode,NString pTreqDesc,NString pSatInd,NDate pStatDate,NDate pEstDate,NString pTrstCode,NString pPckgInd,NString pDisbInd,NString pFundCode,NString pSysInd,NString pSbgiCode,NString pMemoInd,NString pUserId,NDate pPerkMpnExpDate,NDate pSatisfiedDate,NDate pMpnFirstDisbDate,NDate pMpnSignedDate,NString pTrkLtrInd,NString pDataOrigin,NString pInfoAccessInd,NString pTermCode,NString pSbgiTypeInd,NString pPeriod,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_TREQ_DESC", pTreqDesc);
			cmd.addParameter("@P_SAT_IND", pSatInd);
			cmd.addParameter("@P_STAT_DATE", pStatDate);
			cmd.addParameter("@P_EST_DATE", pEstDate);
			cmd.addParameter("@P_TRST_CODE", pTrstCode);
			cmd.addParameter("@P_PCKG_IND", pPckgInd);
			cmd.addParameter("@P_DISB_IND", pDisbInd);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_SYS_IND", pSysInd);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_MEMO_IND", pMemoInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PERK_MPN_EXP_DATE", pPerkMpnExpDate);
			cmd.addParameter("@P_SATISFIED_DATE", pSatisfiedDate);
			cmd.addParameter("@P_MPN_FIRST_DISB_DATE", pMpnFirstDisbDate);
			cmd.addParameter("@P_MPN_SIGNED_DATE", pMpnSignedDate);
			cmd.addParameter("@P_TRK_LTR_IND", pTrkLtrInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INFO_ACCESS_IND", pInfoAccessInd);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SBGI_TYPE_IND", pSbgiTypeInd);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="RequirementRecRow", dataSourceName="REQUIREMENT_REC")
	public static class RequirementRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TREQ_CODE")
		public NString RTreqCode;
		@DbRecordField(dataSourceName="R_TREQ_DESC")
		public NString RTreqDesc;
		@DbRecordField(dataSourceName="R_SAT_IND")
		public NString RSatInd;
		@DbRecordField(dataSourceName="R_STAT_DATE")
		public NDate RStatDate;
		@DbRecordField(dataSourceName="R_EST_DATE")
		public NDate REstDate;
		@DbRecordField(dataSourceName="R_TRST_CODE")
		public NString RTrstCode;
		@DbRecordField(dataSourceName="R_PCKG_IND")
		public NString RPckgInd;
		@DbRecordField(dataSourceName="R_DISB_IND")
		public NString RDisbInd;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_SYS_IND")
		public NString RSysInd;
		@DbRecordField(dataSourceName="R_SBGI_CODE")
		public NString RSbgiCode;
		@DbRecordField(dataSourceName="R_MEMO_IND")
		public NString RMemoInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_PERK_MPN_EXP_DATE")
		public NDate RPerkMpnExpDate;
		@DbRecordField(dataSourceName="R_SATISFIED_DATE")
		public NDate RSatisfiedDate;
		@DbRecordField(dataSourceName="R_MPN_FIRST_DISB_DATE")
		public NDate RMpnFirstDisbDate;
		@DbRecordField(dataSourceName="R_MPN_SIGNED_DATE")
		public NDate RMpnSignedDate;
		@DbRecordField(dataSourceName="R_TRK_LTR_IND")
		public NString RTrkLtrInd;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INFO_ACCESS_IND")
		public NString RInfoAccessInd;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_SBGI_TYPE_IND")
		public NString RSbgiTypeInd;
		@DbRecordField(dataSourceName="R_PERIOD")
		public NString RPeriod;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
