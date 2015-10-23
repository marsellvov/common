package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescStatusExport {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_EXPORT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pDocumentId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_EXPORT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(PescStatusExportRecRow recOne,PescStatusExportRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_EXPORT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PescStatusExportRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PescStatusExportRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pDocumentId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_EXPORT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_EXPORT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pDocumentId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_EXPORT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pDocumentId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_EXPORT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NNumber pRequestSeqNo,NString pUserId,NString pDocumentId,NDate pDocIdExtractDate,NDate pDocIdRcptProcDate,NDate pDocIdRespProcDate,NString pDocIdRespStatus,NString pDocIdReceiptStatus,NString pDocumentType,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_EXPORT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REQUEST_SEQ_NO", pRequestSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_DOC_ID_EXTRACT_DATE", pDocIdExtractDate);
			cmd.addParameter("@P_DOC_ID_RCPT_PROC_DATE", pDocIdRcptProcDate);
			cmd.addParameter("@P_DOC_ID_RESP_PROC_DATE", pDocIdRespProcDate);
			cmd.addParameter("@P_DOC_ID_RESP_STATUS", pDocIdRespStatus);
			cmd.addParameter("@P_DOC_ID_RECEIPT_STATUS", pDocIdReceiptStatus);
			cmd.addParameter("@P_DOCUMENT_TYPE", pDocumentType);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pDocumentId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_EXPORT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pDocumentId,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_EXPORT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NNumber pRequestSeqNo,NString pUserId,NString pDocumentId,NDate pDocIdExtractDate,NDate pDocIdRcptProcDate,NDate pDocIdRespProcDate,NString pDocIdRespStatus,NString pDocIdReceiptStatus,NString pDocumentType,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_EXPORT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_REQUEST_SEQ_NO", pRequestSeqNo);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_DOC_ID_EXTRACT_DATE", pDocIdExtractDate);
			cmd.addParameter("@P_DOC_ID_RCPT_PROC_DATE", pDocIdRcptProcDate);
			cmd.addParameter("@P_DOC_ID_RESP_PROC_DATE", pDocIdRespProcDate);
			cmd.addParameter("@P_DOC_ID_RESP_STATUS", pDocIdRespStatus);
			cmd.addParameter("@P_DOC_ID_RECEIPT_STATUS", pDocIdReceiptStatus);
			cmd.addParameter("@P_DOCUMENT_TYPE", pDocumentType);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="PescStatusExportRecRow", dataSourceName="PESC_STATUS_EXPORT_REC")
	public static class PescStatusExportRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_REQUEST_SEQ_NO")
		public NNumber RRequestSeqNo;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DOCUMENT_ID")
		public NString RDocumentId;
		@DbRecordField(dataSourceName="R_DOC_ID_EXTRACT_DATE")
		public NDate RDocIdExtractDate;
		@DbRecordField(dataSourceName="R_DOC_ID_RCPT_PROC_DATE")
		public NDate RDocIdRcptProcDate;
		@DbRecordField(dataSourceName="R_DOC_ID_RESP_PROC_DATE")
		public NDate RDocIdRespProcDate;
		@DbRecordField(dataSourceName="R_DOC_ID_RESP_STATUS")
		public NString RDocIdRespStatus;
		@DbRecordField(dataSourceName="R_DOC_ID_RECEIPT_STATUS")
		public NString RDocIdReceiptStatus;
		@DbRecordField(dataSourceName="R_DOCUMENT_TYPE")
		public NString RDocumentType;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
