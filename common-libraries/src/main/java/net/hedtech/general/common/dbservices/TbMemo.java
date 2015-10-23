package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbMemo {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MEMO.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NNumber pTranNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MEMO.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(MemoRecRow recOne,MemoRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MEMO.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, MemoRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, MemoRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fMaxTranNumber(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MEMO.F_MAX_TRAN_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pTermCode,NString pDetailCode,NString pBillingInd,NString pSrceCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MEMO.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter("@P_BILLING_IND", pBillingInd);
			cmd.addParameter("@P_SRCE_CODE", pSrceCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MEMO.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NNumber pTranNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MEMO.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NNumber pTranNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MEMO.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NNumber fSumNetAmount(NNumber pPidm,NString pTermCode,NString pDetailCode,NString pDcatCode,NString pSrceCode,NDate pExpireDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MEMO.F_SUM_NET_AMOUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter("@P_DCAT_CODE", pDcatCode);
			cmd.addParameter("@P_SRCE_CODE", pSrceCode);
			cmd.addParameter("@P_EXPIRE_DATE", pExpireDate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pTermCode,NString pDetailCode,NNumber pAmount,NString pUser,NDate pEntryDate,NString pBillingInd,NString pDesc,NDate pReleaseDate,NDate pExpirationDate,NDate pEffectiveDate,NString pSrceCode,NNumber pCrossrefPidm,NNumber pCrossrefNumber,NString pCrossrefDetailCode,NString pCrossrefSrceCode,NString pAtypCode,NNumber pAtypSeqno,NString pDataOrigin,NString pCrossrefDcatCode,NString pOverrideHold,NString pAidyCode,NString pPeriod,Ref<NNumber> pTranNumberOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MEMO.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ENTRY_DATE", pEntryDate);
			cmd.addParameter("@P_BILLING_IND", pBillingInd);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_RELEASE_DATE", pReleaseDate);
			cmd.addParameter("@P_EXPIRATION_DATE", pExpirationDate);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_SRCE_CODE", pSrceCode);
			cmd.addParameter("@P_CROSSREF_PIDM", pCrossrefPidm);
			cmd.addParameter("@P_CROSSREF_NUMBER", pCrossrefNumber);
			cmd.addParameter("@P_CROSSREF_DETAIL_CODE", pCrossrefDetailCode);
			cmd.addParameter("@P_CROSSREF_SRCE_CODE", pCrossrefSrceCode);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQNO", pAtypSeqno);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CROSSREF_DCAT_CODE", pCrossrefDcatCode);
			cmd.addParameter("@P_OVERRIDE_HOLD", pOverrideHold);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TRAN_NUMBER_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pTranNumberOut.val = cmd.getParameterValue("@P_TRAN_NUMBER_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NNumber pTranNumber,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MEMO.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NNumber pTranNumber,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MEMO.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NNumber pTranNumber,NNumber pAmount,NString pUser,NString pBillingInd,NString pDesc,NDate pReleaseDate,NDate pExpirationDate,NDate pEffectiveDate,NString pAtypCode,NNumber pAtypSeqno,NString pDataOrigin,NString pRowid,NString pAidyCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MEMO.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRAN_NUMBER", pTranNumber);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_BILLING_IND", pBillingInd);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_RELEASE_DATE", pReleaseDate);
			cmd.addParameter("@P_EXPIRATION_DATE", pExpirationDate);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_ATYP_SEQNO", pAtypSeqno);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="MemoRecRow", dataSourceName="MEMO_REC")
	public static class MemoRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TRAN_NUMBER")
		public NNumber RTranNumber;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_DETAIL_CODE")
		public NString RDetailCode;
		@DbRecordField(dataSourceName="R_AMOUNT")
		public NNumber RAmount;
		@DbRecordField(dataSourceName="R_USER")
		public NString RUser;
		@DbRecordField(dataSourceName="R_ENTRY_DATE")
		public NDate REntryDate;
		@DbRecordField(dataSourceName="R_BILLING_IND")
		public NString RBillingInd;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_RELEASE_DATE")
		public NDate RReleaseDate;
		@DbRecordField(dataSourceName="R_EXPIRATION_DATE")
		public NDate RExpirationDate;
		@DbRecordField(dataSourceName="R_EFFECTIVE_DATE")
		public NDate REffectiveDate;
		@DbRecordField(dataSourceName="R_SRCE_CODE")
		public NString RSrceCode;
		@DbRecordField(dataSourceName="R_CROSSREF_PIDM")
		public NNumber RCrossrefPidm;
		@DbRecordField(dataSourceName="R_CROSSREF_NUMBER")
		public NNumber RCrossrefNumber;
		@DbRecordField(dataSourceName="R_CROSSREF_DETAIL_CODE")
		public NString RCrossrefDetailCode;
		@DbRecordField(dataSourceName="R_CROSSREF_SRCE_CODE")
		public NString RCrossrefSrceCode;
		@DbRecordField(dataSourceName="R_ATYP_CODE")
		public NString RAtypCode;
		@DbRecordField(dataSourceName="R_ATYP_SEQNO")
		public NNumber RAtypSeqno;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_CREATE_USER")
		public NString RCreateUser;
		@DbRecordField(dataSourceName="R_CROSSREF_DCAT_CODE")
		public NString RCrossrefDcatCode;
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PERIOD")
		public NString RPeriod;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
