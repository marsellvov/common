package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbEncumbranceDetail {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static void fEntityToRow() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL.F_ENTITY_TO_ROW", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fExists(NString pNum,NNumber pItem,NNumber pSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsItem(NString pNum,NNumber pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL.F_EXISTS_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_ITEM", pItem);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetIntConstant(NString pNameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL.F_GET_INT_CONSTANT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_NAME_IN", pNameIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetMaxSeq(NString pNum,NNumber pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL.F_GET_MAX_SEQ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_ITEM", pItem);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fIsequal(EncumbranceDetailRecRow recOne,EncumbranceDetailRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EncumbranceDetailRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EncumbranceDetailRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fNetTransAmt(NString pNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL.F_NET_TRANS_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_NUM", pNum);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static DataCursor fQueryAll(NString pNum,NNumber pItem,NNumber pSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pNum,NNumber pItem,NNumber pSeqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pNum,NNumber pItem,NNumber pSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fValidDistribution(NString pNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL.F_VALID_DISTRIBUTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_NUM", pNum);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreate(NString pNum,NNumber pItem,NNumber pSeqNum,NString pUserId,NString pRuclCode,NString pFsyrCode,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pPostingPeriod,Ref<NString> pStatusIndInOut,NString pPrjdCode,NNumber pPendAmt,NNumber pDistPct,NString pOpalFieldCode,NString pStatus,NString pAbalOverride,NString pApprInd,NString pCmtType,NNumber pCmtPct,NString pDataOrigin,Ref<NString> pWarningOut,Ref<NString> pAbalSeverityOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_FSYR_CODE", pFsyrCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_POSTING_PERIOD", pPostingPeriod);
			cmd.addParameter("@P_STATUS_IND_IN_OUT", pStatusIndInOut, true);
			cmd.addParameter("@P_PRJD_CODE", pPrjdCode);
			cmd.addParameter("@P_PEND_AMT", pPendAmt);
			cmd.addParameter("@P_DIST_PCT", pDistPct);
			cmd.addParameter("@P_OPAL_FIELD_CODE", pOpalFieldCode);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_ABAL_OVERRIDE", pAbalOverride);
			cmd.addParameter("@P_APPR_IND", pApprInd);
			cmd.addParameter("@P_CMT_TYPE", pCmtType);
			cmd.addParameter("@P_CMT_PCT", pCmtPct);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_WARNING_OUT", NString.class);
			cmd.addParameter("@P_ABAL_SEVERITY_OUT", NString.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pStatusIndInOut.val = cmd.getParameterValue("@P_STATUS_IND_IN_OUT", NString.class);
			pWarningOut.val = cmd.getParameterValue("@P_WARNING_OUT", NString.class);
			pAbalSeverityOut.val = cmd.getParameterValue("@P_ABAL_SEVERITY_OUT", NString.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pNum,NNumber pItem,NNumber pSeqNum,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteAll(NString pNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL.P_DELETE_ALL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NUM", pNum);
				
			cmd.execute();


		}
		
		public static void pLock(NString pNum,NNumber pItem,NNumber pSeqNum,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pNum,NNumber pItem,NNumber pSeqNum,NString pUserId,NString pRuclCode,NString pFsyrCode,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pPostingPeriod,Ref<NString> pStatusIndInOut,NString pPrjdCode,NNumber pPendAmt,NNumber pDistPct,NString pOpalFieldCode,NString pStatus,NString pAbalOverride,NString pApprInd,NString pCmtType,NNumber pCmtPct,NString pDataOrigin,Ref<NString> pWarningOut,Ref<NString> pAbalSeverityOut,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_RUCL_CODE", pRuclCode);
			cmd.addParameter("@P_FSYR_CODE", pFsyrCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_POSTING_PERIOD", pPostingPeriod);
			cmd.addParameter("@P_STATUS_IND_IN_OUT", pStatusIndInOut, true);
			cmd.addParameter("@P_PRJD_CODE", pPrjdCode);
			cmd.addParameter("@P_PEND_AMT", pPendAmt);
			cmd.addParameter("@P_DIST_PCT", pDistPct);
			cmd.addParameter("@P_OPAL_FIELD_CODE", pOpalFieldCode);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_ABAL_OVERRIDE", pAbalOverride);
			cmd.addParameter("@P_APPR_IND", pApprInd);
			cmd.addParameter("@P_CMT_TYPE", pCmtType);
			cmd.addParameter("@P_CMT_PCT", pCmtPct);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_WARNING_OUT", NString.class);
			cmd.addParameter("@P_ABAL_SEVERITY_OUT", NString.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();
			pStatusIndInOut.val = cmd.getParameterValue("@P_STATUS_IND_IN_OUT", NString.class);
			pWarningOut.val = cmd.getParameterValue("@P_WARNING_OUT", NString.class);
			pAbalSeverityOut.val = cmd.getParameterValue("@P_ABAL_SEVERITY_OUT", NString.class);


		}
		
		public static void pUpdateInternal(NString pNum,NNumber pItem,NNumber pSeqNum,NString pStatusInd,NNumber pPendAmt,NString pOpalFieldCode,NString pStatus,NString pAbalOverride,NString pApprInd,NString pCmtType,NNumber pCmtPct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_ENCUMBRANCE_DETAIL.P_UPDATE_INTERNAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_ITEM", pItem);
			cmd.addParameter("@P_SEQ_NUM", pSeqNum);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_PEND_AMT", pPendAmt);
			cmd.addParameter("@P_OPAL_FIELD_CODE", pOpalFieldCode);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_ABAL_OVERRIDE", pAbalOverride);
			cmd.addParameter("@P_APPR_IND", pApprInd);
			cmd.addParameter("@P_CMT_TYPE", pCmtType);
			cmd.addParameter("@P_CMT_PCT", pCmtPct);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EncumbranceDetailRecRow", dataSourceName="ENCUMBRANCE_DETAIL_REC")
	public static class EncumbranceDetailRecRow
	{
		@DbRecordField(dataSourceName="R_NUM")
		public NString RNum;
		@DbRecordField(dataSourceName="R_ITEM")
		public NNumber RItem;
		@DbRecordField(dataSourceName="R_SEQ_NUM")
		public NNumber RSeqNum;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_RUCL_CODE")
		public NString RRuclCode;
		@DbRecordField(dataSourceName="R_FSYR_CODE")
		public NString RFsyrCode;
		@DbRecordField(dataSourceName="R_COAS_CODE")
		public NString RCoasCode;
		@DbRecordField(dataSourceName="R_ACCI_CODE")
		public NString RAcciCode;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_ORGN_CODE")
		public NString ROrgnCode;
		@DbRecordField(dataSourceName="R_ACCT_CODE")
		public NString RAcctCode;
		@DbRecordField(dataSourceName="R_PROG_CODE")
		public NString RProgCode;
		@DbRecordField(dataSourceName="R_ACTV_CODE")
		public NString RActvCode;
		@DbRecordField(dataSourceName="R_LOCN_CODE")
		public NString RLocnCode;
		@DbRecordField(dataSourceName="R_POSTING_PERIOD")
		public NString RPostingPeriod;
		@DbRecordField(dataSourceName="R_STATUS_IND")
		public NString RStatusInd;
		@DbRecordField(dataSourceName="R_PRJD_CODE")
		public NString RPrjdCode;
		@DbRecordField(dataSourceName="R_PEND_AMT")
		public NNumber RPendAmt;
		@DbRecordField(dataSourceName="R_DIST_PCT")
		public NNumber RDistPct;
		@DbRecordField(dataSourceName="R_OPAL_FIELD_CODE")
		public NString ROpalFieldCode;
		@DbRecordField(dataSourceName="R_STATUS")
		public NString RStatus;
		@DbRecordField(dataSourceName="R_ABAL_OVERRIDE")
		public NString RAbalOverride;
		@DbRecordField(dataSourceName="R_POST_BAVL")
		public NString RPostBavl;
		@DbRecordField(dataSourceName="R_APPR_IND")
		public NString RApprInd;
		@DbRecordField(dataSourceName="R_CMT_TYPE")
		public NString RCmtType;
		@DbRecordField(dataSourceName="R_CMT_PCT")
		public NNumber RCmtPct;
		@DbRecordField(dataSourceName="R_CREATE_DATE")
		public NDate RCreateDate;
		@DbRecordField(dataSourceName="R_CREATE_USER")
		public NString RCreateUser;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_CREATE_SOURCE")
		public NString RCreateSource;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
