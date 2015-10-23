package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbApplDetail {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_APPL_DETAIL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_APPL_DETAIL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ApplDetailRecRow recOne,ApplDetailRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_APPL_DETAIL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ApplDetailRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ApplDetailRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NNumber pPayTranNumber,NNumber pChgTranNumber,NString pDirectPayInd,NString pReapplInd,NString pAcctFeedInd,NNumber pCpdtTranNumber,NString pDirectPayType,NString pInvNumberPaid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_APPL_DETAIL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PAY_TRAN_NUMBER", pPayTranNumber);
			cmd.addParameter("@P_CHG_TRAN_NUMBER", pChgTranNumber);
			cmd.addParameter("@P_DIRECT_PAY_IND", pDirectPayInd);
			cmd.addParameter("@P_REAPPL_IND", pReapplInd);
			cmd.addParameter("@P_ACCT_FEED_IND", pAcctFeedInd);
			cmd.addParameter("@P_CPDT_TRAN_NUMBER", pCpdtTranNumber);
			cmd.addParameter("@P_DIRECT_PAY_TYPE", pDirectPayType);
			cmd.addParameter("@P_INV_NUMBER_PAID", pInvNumberPaid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_APPL_DETAIL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NNumber pPayTranNumber,NNumber pChgTranNumber,NNumber pAmount,NString pDirectPayInd,NString pReapplInd,NString pUser,NString pAcctFeedInd,NDate pFeedDate,NString pFeedDocCode,NNumber pCpdtTranNumber,NString pDirectPayType,NString pInvNumberPaid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_APPL_DETAIL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PAY_TRAN_NUMBER", pPayTranNumber);
			cmd.addParameter("@P_CHG_TRAN_NUMBER", pChgTranNumber);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_DIRECT_PAY_IND", pDirectPayInd);
			cmd.addParameter("@P_REAPPL_IND", pReapplInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ACCT_FEED_IND", pAcctFeedInd);
			cmd.addParameter("@P_FEED_DATE", pFeedDate);
			cmd.addParameter("@P_FEED_DOC_CODE", pFeedDocCode);
			cmd.addParameter("@P_CPDT_TRAN_NUMBER", pCpdtTranNumber);
			cmd.addParameter("@P_DIRECT_PAY_TYPE", pDirectPayType);
			cmd.addParameter("@P_INV_NUMBER_PAID", pInvNumberPaid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NNumber pPayTranNumber,NNumber pChgTranNumber,NNumber pAmount,NString pDirectPayInd,NString pReapplInd,NString pUser,NString pAcctFeedInd,NDate pFeedDate,NString pFeedDocCode,NNumber pCpdtTranNumber,NString pDirectPayType,NString pInvNumberPaid,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_APPL_DETAIL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PAY_TRAN_NUMBER", pPayTranNumber);
			cmd.addParameter("@P_CHG_TRAN_NUMBER", pChgTranNumber);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_DIRECT_PAY_IND", pDirectPayInd);
			cmd.addParameter("@P_REAPPL_IND", pReapplInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ACCT_FEED_IND", pAcctFeedInd);
			cmd.addParameter("@P_FEED_DATE", pFeedDate);
			cmd.addParameter("@P_FEED_DOC_CODE", pFeedDocCode);
			cmd.addParameter("@P_CPDT_TRAN_NUMBER", pCpdtTranNumber);
			cmd.addParameter("@P_DIRECT_PAY_TYPE", pDirectPayType);
			cmd.addParameter("@P_INV_NUMBER_PAID", pInvNumberPaid);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_APPL_DETAIL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryToUnapply(NNumber pPidm,NNumber pPayTranNumber,NNumber pChgTranNumber,NNumber pCpdtTranNumber,NString pTermCode,NDate pApplyDate,NString pUnapplyDirectPay) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_APPL_DETAIL.F_QUERY_TO_UNAPPLY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PAY_TRAN_NUMBER", pPayTranNumber);
			cmd.addParameter("@P_CHG_TRAN_NUMBER", pChgTranNumber);
			cmd.addParameter("@P_CPDT_TRAN_NUMBER", pCpdtTranNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_APPLY_DATE", pApplyDate);
			cmd.addParameter("@P_UNAPPLY_DIRECT_PAY", pUnapplyDirectPay);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NNumber pPayTranNumber,NNumber pChgTranNumber,NNumber pAmount,NString pDirectPayInd,NString pReapplInd,NString pUser,NString pAcctFeedInd,NDate pFeedDate,NString pFeedDocCode,NNumber pCpdtTranNumber,NString pDirectPayType,NString pInvNumberPaid,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_APPL_DETAIL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PAY_TRAN_NUMBER", pPayTranNumber);
			cmd.addParameter("@P_CHG_TRAN_NUMBER", pChgTranNumber);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_DIRECT_PAY_IND", pDirectPayInd);
			cmd.addParameter("@P_REAPPL_IND", pReapplInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ACCT_FEED_IND", pAcctFeedInd);
			cmd.addParameter("@P_FEED_DATE", pFeedDate);
			cmd.addParameter("@P_FEED_DOC_CODE", pFeedDocCode);
			cmd.addParameter("@P_CPDT_TRAN_NUMBER", pCpdtTranNumber);
			cmd.addParameter("@P_DIRECT_PAY_TYPE", pDirectPayType);
			cmd.addParameter("@P_INV_NUMBER_PAID", pInvNumberPaid);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NNumber pPayTranNumber,NNumber pChgTranNumber,NNumber pAmount,NString pDirectPayInd,NString pReapplInd,NString pUser,NString pAcctFeedInd,NDate pFeedDate,NString pFeedDocCode,NNumber pCpdtTranNumber,NString pDirectPayType,NString pInvNumberPaid,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_APPL_DETAIL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PAY_TRAN_NUMBER", pPayTranNumber);
			cmd.addParameter("@P_CHG_TRAN_NUMBER", pChgTranNumber);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_DIRECT_PAY_IND", pDirectPayInd);
			cmd.addParameter("@P_REAPPL_IND", pReapplInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ACCT_FEED_IND", pAcctFeedInd);
			cmd.addParameter("@P_FEED_DATE", pFeedDate);
			cmd.addParameter("@P_FEED_DOC_CODE", pFeedDocCode);
			cmd.addParameter("@P_CPDT_TRAN_NUMBER", pCpdtTranNumber);
			cmd.addParameter("@P_DIRECT_PAY_TYPE", pDirectPayType);
			cmd.addParameter("@P_INV_NUMBER_PAID", pInvNumberPaid);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_APPL_DETAIL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NNumber pPayTranNumber,NNumber pChgTranNumber,NNumber pAmount,NString pDirectPayInd,NString pReapplInd,NString pUser,NString pAcctFeedInd,NDate pFeedDate,NString pFeedDocCode,NNumber pCpdtTranNumber,NString pDirectPayType,NString pInvNumberPaid,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_APPL_DETAIL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PAY_TRAN_NUMBER", pPayTranNumber);
			cmd.addParameter("@P_CHG_TRAN_NUMBER", pChgTranNumber);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_DIRECT_PAY_IND", pDirectPayInd);
			cmd.addParameter("@P_REAPPL_IND", pReapplInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ACCT_FEED_IND", pAcctFeedInd);
			cmd.addParameter("@P_FEED_DATE", pFeedDate);
			cmd.addParameter("@P_FEED_DOC_CODE", pFeedDocCode);
			cmd.addParameter("@P_CPDT_TRAN_NUMBER", pCpdtTranNumber);
			cmd.addParameter("@P_DIRECT_PAY_TYPE", pDirectPayType);
			cmd.addParameter("@P_INV_NUMBER_PAID", pInvNumberPaid);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ApplDetailRecRow", dataSourceName="APPL_DETAIL_REC")
	public static class ApplDetailRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_PAY_TRAN_NUMBER")
		public NNumber RPayTranNumber;
		@DbRecordField(dataSourceName="R_CHG_TRAN_NUMBER")
		public NNumber RChgTranNumber;
		@DbRecordField(dataSourceName="R_AMOUNT")
		public NNumber RAmount;
		@DbRecordField(dataSourceName="R_DIRECT_PAY_IND")
		public NString RDirectPayInd;
		@DbRecordField(dataSourceName="R_REAPPL_IND")
		public NString RReapplInd;
		@DbRecordField(dataSourceName="R_USER")
		public NString RUser;
		@DbRecordField(dataSourceName="R_ACCT_FEED_IND")
		public NString RAcctFeedInd;
		@DbRecordField(dataSourceName="R_FEED_DATE")
		public NDate RFeedDate;
		@DbRecordField(dataSourceName="R_FEED_DOC_CODE")
		public NString RFeedDocCode;
		@DbRecordField(dataSourceName="R_CPDT_TRAN_NUMBER")
		public NNumber RCpdtTranNumber;
		@DbRecordField(dataSourceName="R_DIRECT_PAY_TYPE")
		public NString RDirectPayType;
		@DbRecordField(dataSourceName="R_INV_NUMBER_PAID")
		public NString RInvNumberPaid;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
