package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbPayTrans {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_PAY_TRANS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPayTransId,NString pPtypCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_PAY_TRANS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NNumber fGetTotal(List<PayTransTabRow> pPayTransTab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_PAY_TRANS.F_GET_TOTAL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NNumber.class);
//			// cmd.addParameter(DbTypes.getTableType("P_PAY_TRANS_TAB", "", pPayTransTab, object.class));
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NNumber.class);
//
//		}
		
		public static NString fIsequal(PayTransRecRow recOne,PayTransRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_PAY_TRANS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PayTransRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PayTransRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPayTransId,NString pPtypCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_PAY_TRANS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_PAY_TRANS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPayTransId,NString pPtypCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_PAY_TRANS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPayTransId,NString pPtypCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_PAY_TRANS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
//		public static List<PayTransTabRow> fQuerySet(NNumber pPayTransId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_PAY_TRANS.F_QUERY_SET", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<PayTransTabRow>.class);
//			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<PayTransTabRow>.class);
//
//		}
		
		public static NString fUpdatePayments(NNumber pPayTransId,NNumber pTotalAmount,NNumber pPidm,NString pTermCode,NString pDetailCode,NString pUser,NString pSrceCode,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_PAY_TRANS.F_UPDATE_PAYMENTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
			cmd.addParameter("@P_TOTAL_AMOUNT", pTotalAmount);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DETAIL_CODE", pDetailCode);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_SRCE_CODE", pSrceCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreate(NNumber pPayTransId,NString pPtypCode,NString pProcess,NString pCode,NNumber pAmount,NString pDepReleaseInd,NDate pDepRelDate,NDate pDepExpDate,NNumber pDepMinAmount,NNumber pSortSeqno,NString pUserId,NNumber pSurrogateId,NNumber pVersion,NString pVpdiCode,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_PAY_TRANS.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_DEP_RELEASE_IND", pDepReleaseInd);
			cmd.addParameter("@P_DEP_REL_DATE", pDepRelDate);
			cmd.addParameter("@P_DEP_EXP_DATE", pDepExpDate);
			cmd.addParameter("@P_DEP_MIN_AMOUNT", pDepMinAmount);
			cmd.addParameter("@P_SORT_SEQNO", pSortSeqno);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
//		public static void pCreate(NNumber pPayTransId,List<PayTransTabRow> pPayTransTab,NString pUserId,NString pDataOrigin) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_PAY_TRANS.P_CREATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
//			// cmd.addParameter(DbTypes.getTableType("P_PAY_TRANS_TAB", "", pPayTransTab, object.class));
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pDelete(NNumber pPayTransId,NString pPtypCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_PAY_TRANS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteAll(NNumber pPayTransId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_PAY_TRANS.P_DELETE_ALL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPayTransId,NString pPtypCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_PAY_TRANS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPayTransId,NString pPtypCode,NString pProcess,NString pCode,NNumber pAmount,NString pDepReleaseInd,NDate pDepRelDate,NDate pDepExpDate,NNumber pDepMinAmount,NNumber pSortSeqno,NString pUserId,NNumber pSurrogateId,NNumber pVersion,NString pVpdiCode,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_PAY_TRANS.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PAY_TRANS_ID", pPayTransId);
			cmd.addParameter("@P_PTYP_CODE", pPtypCode);
			cmd.addParameter("@P_PROCESS", pProcess);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_AMOUNT", pAmount);
			cmd.addParameter("@P_DEP_RELEASE_IND", pDepReleaseInd);
			cmd.addParameter("@P_DEP_REL_DATE", pDepRelDate);
			cmd.addParameter("@P_DEP_EXP_DATE", pDepExpDate);
			cmd.addParameter("@P_DEP_MIN_AMOUNT", pDepMinAmount);
			cmd.addParameter("@P_SORT_SEQNO", pSortSeqno);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="PayTransRecRow", dataSourceName="PAY_TRANS_REC")
	public static class PayTransRecRow
	{
		@DbRecordField(dataSourceName="R_PAY_TRANS_ID")
		public NNumber RPayTransId;
		@DbRecordField(dataSourceName="R_PTYP_CODE")
		public NString RPtypCode;
		@DbRecordField(dataSourceName="R_PROCESS")
		public NString RProcess;
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
		@DbRecordField(dataSourceName="R_AMOUNT")
		public NNumber RAmount;
		@DbRecordField(dataSourceName="R_DEP_RELEASE_IND")
		public NString RDepReleaseInd;
		@DbRecordField(dataSourceName="R_DEP_REL_DATE")
		public NDate RDepRelDate;
		@DbRecordField(dataSourceName="R_DEP_EXP_DATE")
		public NDate RDepExpDate;
		@DbRecordField(dataSourceName="R_DEP_MIN_AMOUNT")
		public NNumber RDepMinAmount;
		@DbRecordField(dataSourceName="R_SORT_SEQNO")
		public NNumber RSortSeqno;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_SURROGATE_ID")
		public NNumber RSurrogateId;
		@DbRecordField(dataSourceName="R_VERSION")
		public NNumber RVersion;
		@DbRecordField(dataSourceName="R_VPDI_CODE")
		public NString RVpdiCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
