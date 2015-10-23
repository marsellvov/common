package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbCodDocument {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_DOCUMENT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pDocumentId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_DOCUMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CodDocumentRecRow recOne,CodDocumentRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_DOCUMENT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CodDocumentRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CodDocumentRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pDocumentId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_DOCUMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_DOCUMENT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pDocumentId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_DOCUMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pDocumentId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_DOCUMENT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NString pUserId,NString pDocumentId,NDate pDocIdExtractDate,NDate pDocIdRcptProcDate,NDate pDocIdRespProcDate,NString pDocIdRespStatus,NString pDocIdReceiptStatus,NString pDocumentType,NString pDataOrigin,NString pExtractFile,NString pResentAsDocId,NString pAttendingId,NString pReportingId,NString pSourceId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_DOCUMENT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_DOC_ID_EXTRACT_DATE", pDocIdExtractDate);
			cmd.addParameter("@P_DOC_ID_RCPT_PROC_DATE", pDocIdRcptProcDate);
			cmd.addParameter("@P_DOC_ID_RESP_PROC_DATE", pDocIdRespProcDate);
			cmd.addParameter("@P_DOC_ID_RESP_STATUS", pDocIdRespStatus);
			cmd.addParameter("@P_DOC_ID_RECEIPT_STATUS", pDocIdReceiptStatus);
			cmd.addParameter("@P_DOCUMENT_TYPE", pDocumentType);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_EXTRACT_FILE", pExtractFile);
			cmd.addParameter("@P_RESENT_AS_DOC_ID", pResentAsDocId);
			cmd.addParameter("@P_ATTENDING_ID", pAttendingId);
			cmd.addParameter("@P_REPORTING_ID", pReportingId);
			cmd.addParameter("@P_SOURCE_ID", pSourceId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pLock(NString pDocumentId,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_DOCUMENT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NString pUserId,NString pDocumentId,NDate pDocIdExtractDate,NDate pDocIdRcptProcDate,NDate pDocIdRespProcDate,NString pDocIdRespStatus,NString pDocIdReceiptStatus,NString pDocumentType,NString pDataOrigin,NString pExtractFile,NString pResentAsDocId,NString pAttendingId,NString pReportingId,NString pSourceId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_DOCUMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_DOC_ID_EXTRACT_DATE", pDocIdExtractDate);
			cmd.addParameter("@P_DOC_ID_RCPT_PROC_DATE", pDocIdRcptProcDate);
			cmd.addParameter("@P_DOC_ID_RESP_PROC_DATE", pDocIdRespProcDate);
			cmd.addParameter("@P_DOC_ID_RESP_STATUS", pDocIdRespStatus);
			cmd.addParameter("@P_DOC_ID_RECEIPT_STATUS", pDocIdReceiptStatus);
			cmd.addParameter("@P_DOCUMENT_TYPE", pDocumentType);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_EXTRACT_FILE", pExtractFile);
			cmd.addParameter("@P_RESENT_AS_DOC_ID", pResentAsDocId);
			cmd.addParameter("@P_ATTENDING_ID", pAttendingId);
			cmd.addParameter("@P_REPORTING_ID", pReportingId);
			cmd.addParameter("@P_SOURCE_ID", pSourceId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CodDocumentRecRow", dataSourceName="COD_DOCUMENT_REC")
	public static class CodDocumentRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
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
		@DbRecordField(dataSourceName="R_EXTRACT_FILE")
		public NString RExtractFile;
		@DbRecordField(dataSourceName="R_RESENT_AS_DOC_ID")
		public NString RResentAsDocId;
		@DbRecordField(dataSourceName="R_ATTENDING_ID")
		public NString RAttendingId;
		@DbRecordField(dataSourceName="R_REPORTING_ID")
		public NString RReportingId;
		@DbRecordField(dataSourceName="R_SOURCE_ID")
		public NString RSourceId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
