package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbPcardAcctg {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_ACCTG.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pFarinvtSurrogateId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_ACCTG.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FARINVT_SURROGATE_ID", pFarinvtSurrogateId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NString pFarinvtSystemId,NString pFarinvtSystemTimeStamp,NNumber pFarinvtTranNum,NNumber pFarinvtSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_ACCTG.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FARINVT_SYSTEM_ID", pFarinvtSystemId);
			cmd.addParameter("@P_FARINVT_SYSTEM_TIME_STAMP", pFarinvtSystemTimeStamp);
			cmd.addParameter("@P_FARINVT_TRAN_NUM", pFarinvtTranNum);
			cmd.addParameter("@P_FARINVT_SEQ_NUM", pFarinvtSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsByHeader(NNumber pFarinvtFabinvtId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_ACCTG.F_EXISTS_BY_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FARINVT_FABINVT_ID", pFarinvtFabinvtId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(PcardAcctgRecRow recOne,PcardAcctgRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_ACCTG.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PcardAcctgRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PcardAcctgRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pFarinvtSystemId,NString pFarinvtSystemTimeStamp,NNumber pFarinvtTranNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_ACCTG.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FARINVT_SYSTEM_ID", pFarinvtSystemId);
			cmd.addParameter("@P_FARINVT_SYSTEM_TIME_STAMP", pFarinvtSystemTimeStamp);
			cmd.addParameter("@P_FARINVT_TRAN_NUM", pFarinvtTranNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByHeader(NNumber pFarinvtFabinvtId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_ACCTG.F_QUERY_BY_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FARINVT_FABINVT_ID", pFarinvtFabinvtId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_ACCTG.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pFarinvtSurrogateId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_ACCTG.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FARINVT_SURROGATE_ID", pFarinvtSurrogateId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pFarinvtSystemId,NString pFarinvtSystemTimeStamp,NNumber pFarinvtTranNum,NNumber pFarinvtSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_ACCTG.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FARINVT_SYSTEM_ID", pFarinvtSystemId);
			cmd.addParameter("@P_FARINVT_SYSTEM_TIME_STAMP", pFarinvtSystemTimeStamp);
			cmd.addParameter("@P_FARINVT_TRAN_NUM", pFarinvtTranNum);
			cmd.addParameter("@P_FARINVT_SEQ_NUM", pFarinvtSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pFarinvtSurrogateId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_ACCTG.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FARINVT_SURROGATE_ID", pFarinvtSurrogateId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pFarinvtSystemId,NString pFarinvtSystemTimeStamp,NNumber pFarinvtTranNum,NNumber pFarinvtSeqNum,NString pFarinvtUserId,NString pFarinvtCoasCode,NString pFarinvtAcciCode,NString pFarinvtFundCode,NString pFarinvtOrgnCode,NString pFarinvtAcctCode,NString pFarinvtProgCode,NString pFarinvtActvCode,NString pFarinvtLocnCode,NString pFarinvtProjCode,NString pFarinvtBankCode,NNumber pFarinvtAmtPct,NNumber pFarinvtTransAmt,NNumber pFarinvtFabinvtId,NString pFarinvtDataOrigin,NString pFarinvtVpdiCode,NNumber pFarinvtVersion,Ref<NNumber> pFarinvtSurrogateIdOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_ACCTG.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FARINVT_SYSTEM_ID", pFarinvtSystemId);
			cmd.addParameter("@P_FARINVT_SYSTEM_TIME_STAMP", pFarinvtSystemTimeStamp);
			cmd.addParameter("@P_FARINVT_TRAN_NUM", pFarinvtTranNum);
			cmd.addParameter("@P_FARINVT_SEQ_NUM", pFarinvtSeqNum);
			cmd.addParameter("@P_FARINVT_USER_ID", pFarinvtUserId);
			cmd.addParameter("@P_FARINVT_COAS_CODE", pFarinvtCoasCode);
			cmd.addParameter("@P_FARINVT_ACCI_CODE", pFarinvtAcciCode);
			cmd.addParameter("@P_FARINVT_FUND_CODE", pFarinvtFundCode);
			cmd.addParameter("@P_FARINVT_ORGN_CODE", pFarinvtOrgnCode);
			cmd.addParameter("@P_FARINVT_ACCT_CODE", pFarinvtAcctCode);
			cmd.addParameter("@P_FARINVT_PROG_CODE", pFarinvtProgCode);
			cmd.addParameter("@P_FARINVT_ACTV_CODE", pFarinvtActvCode);
			cmd.addParameter("@P_FARINVT_LOCN_CODE", pFarinvtLocnCode);
			cmd.addParameter("@P_FARINVT_PROJ_CODE", pFarinvtProjCode);
			cmd.addParameter("@P_FARINVT_BANK_CODE", pFarinvtBankCode);
			cmd.addParameter("@P_FARINVT_AMT_PCT", pFarinvtAmtPct);
			cmd.addParameter("@P_FARINVT_TRANS_AMT", pFarinvtTransAmt);
			cmd.addParameter("@P_FARINVT_FABINVT_ID", pFarinvtFabinvtId);
			cmd.addParameter("@P_FARINVT_DATA_ORIGIN", pFarinvtDataOrigin);
			cmd.addParameter("@P_FARINVT_VPDI_CODE", pFarinvtVpdiCode);
			cmd.addParameter("@P_FARINVT_VERSION", pFarinvtVersion);
			cmd.addParameter("@P_FARINVT_SURROGATE_ID_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pFarinvtSurrogateIdOut.val = cmd.getParameterValue("@P_FARINVT_SURROGATE_ID_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pFarinvtSurrogateId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_ACCTG.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FARINVT_SURROGATE_ID", pFarinvtSurrogateId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteAllByTrans(NString pFarinvtSystemId,NString pFarinvtSystemTimeStamp,NNumber pFarinvtTranNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_ACCTG.P_DELETE_ALL_BY_TRANS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FARINVT_SYSTEM_ID", pFarinvtSystemId);
			cmd.addParameter("@P_FARINVT_SYSTEM_TIME_STAMP", pFarinvtSystemTimeStamp);
			cmd.addParameter("@P_FARINVT_TRAN_NUM", pFarinvtTranNum);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pFarinvtSurrogateId,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_ACCTG.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FARINVT_SURROGATE_ID", pFarinvtSurrogateId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pFarinvtSystemId,NString pFarinvtSystemTimeStamp,NNumber pFarinvtTranNum,NNumber pFarinvtSeqNum,NString pFarinvtUserId,NString pFarinvtCoasCode,NString pFarinvtAcciCode,NString pFarinvtFundCode,NString pFarinvtOrgnCode,NString pFarinvtAcctCode,NString pFarinvtProgCode,NString pFarinvtActvCode,NString pFarinvtLocnCode,NString pFarinvtProjCode,NString pFarinvtBankCode,NNumber pFarinvtAmtPct,NNumber pFarinvtTransAmt,NNumber pFarinvtFabinvtId,NNumber pFarinvtSurrogateId,NString pFarinvtDataOrigin,NNumber pFarinvtVersion,NString pFarinvtVpdiCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_PCARD_ACCTG.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FARINVT_SYSTEM_ID", pFarinvtSystemId);
			cmd.addParameter("@P_FARINVT_SYSTEM_TIME_STAMP", pFarinvtSystemTimeStamp);
			cmd.addParameter("@P_FARINVT_TRAN_NUM", pFarinvtTranNum);
			cmd.addParameter("@P_FARINVT_SEQ_NUM", pFarinvtSeqNum);
			cmd.addParameter("@P_FARINVT_USER_ID", pFarinvtUserId);
			cmd.addParameter("@P_FARINVT_COAS_CODE", pFarinvtCoasCode);
			cmd.addParameter("@P_FARINVT_ACCI_CODE", pFarinvtAcciCode);
			cmd.addParameter("@P_FARINVT_FUND_CODE", pFarinvtFundCode);
			cmd.addParameter("@P_FARINVT_ORGN_CODE", pFarinvtOrgnCode);
			cmd.addParameter("@P_FARINVT_ACCT_CODE", pFarinvtAcctCode);
			cmd.addParameter("@P_FARINVT_PROG_CODE", pFarinvtProgCode);
			cmd.addParameter("@P_FARINVT_ACTV_CODE", pFarinvtActvCode);
			cmd.addParameter("@P_FARINVT_LOCN_CODE", pFarinvtLocnCode);
			cmd.addParameter("@P_FARINVT_PROJ_CODE", pFarinvtProjCode);
			cmd.addParameter("@P_FARINVT_BANK_CODE", pFarinvtBankCode);
			cmd.addParameter("@P_FARINVT_AMT_PCT", pFarinvtAmtPct);
			cmd.addParameter("@P_FARINVT_TRANS_AMT", pFarinvtTransAmt);
			cmd.addParameter("@P_FARINVT_FABINVT_ID", pFarinvtFabinvtId);
			cmd.addParameter("@P_FARINVT_SURROGATE_ID", pFarinvtSurrogateId);
			cmd.addParameter("@P_FARINVT_DATA_ORIGIN", pFarinvtDataOrigin);
			cmd.addParameter("@P_FARINVT_VERSION", pFarinvtVersion);
			cmd.addParameter("@P_FARINVT_VPDI_CODE", pFarinvtVpdiCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="PcardAcctgRecRow", dataSourceName="PCARD_ACCTG_REC")
	public static class PcardAcctgRecRow
	{
		@DbRecordField(dataSourceName="R_FARINVT_SYSTEM_ID")
		public NString RFarinvtSystemId;
		@DbRecordField(dataSourceName="R_FARINVT_SYSTEM_TIME_STAMP")
		public NString RFarinvtSystemTimeStamp;
		@DbRecordField(dataSourceName="R_FARINVT_TRAN_NUM")
		public NNumber RFarinvtTranNum;
		@DbRecordField(dataSourceName="R_FARINVT_SEQ_NUM")
		public NNumber RFarinvtSeqNum;
		@DbRecordField(dataSourceName="R_FARINVT_USER_ID")
		public NString RFarinvtUserId;
		@DbRecordField(dataSourceName="R_FARINVT_COAS_CODE")
		public NString RFarinvtCoasCode;
		@DbRecordField(dataSourceName="R_FARINVT_ACCI_CODE")
		public NString RFarinvtAcciCode;
		@DbRecordField(dataSourceName="R_FARINVT_FUND_CODE")
		public NString RFarinvtFundCode;
		@DbRecordField(dataSourceName="R_FARINVT_ORGN_CODE")
		public NString RFarinvtOrgnCode;
		@DbRecordField(dataSourceName="R_FARINVT_ACCT_CODE")
		public NString RFarinvtAcctCode;
		@DbRecordField(dataSourceName="R_FARINVT_PROG_CODE")
		public NString RFarinvtProgCode;
		@DbRecordField(dataSourceName="R_FARINVT_ACTV_CODE")
		public NString RFarinvtActvCode;
		@DbRecordField(dataSourceName="R_FARINVT_LOCN_CODE")
		public NString RFarinvtLocnCode;
		@DbRecordField(dataSourceName="R_FARINVT_PROJ_CODE")
		public NString RFarinvtProjCode;
		@DbRecordField(dataSourceName="R_FARINVT_BANK_CODE")
		public NString RFarinvtBankCode;
		@DbRecordField(dataSourceName="R_FARINVT_AMT_PCT")
		public NNumber RFarinvtAmtPct;
		@DbRecordField(dataSourceName="R_FARINVT_TRANS_AMT")
		public NNumber RFarinvtTransAmt;
		@DbRecordField(dataSourceName="R_FARINVT_FABINVT_ID")
		public NNumber RFarinvtFabinvtId;
		@DbRecordField(dataSourceName="R_FARINVT_SURROGATE_ID")
		public NNumber RFarinvtSurrogateId;
		@DbRecordField(dataSourceName="R_FARINVT_DATA_ORIGIN")
		public NString RFarinvtDataOrigin;
		@DbRecordField(dataSourceName="R_FARINVT_VERSION")
		public NNumber RFarinvtVersion;
		@DbRecordField(dataSourceName="R_FARINVT_VPDI_CODE")
		public NString RFarinvtVpdiCode;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
