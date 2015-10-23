package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbPescStatusImp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_IMP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRecvDocumentId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_IMP.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_RECV_DOCUMENT_ID", pRecvDocumentId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(PescStatusImpRecRow recOne,PescStatusImpRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_IMP.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PescStatusImpRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PescStatusImpRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pRecvDocumentId,NString pSentDocumentId,NString pSentOrgCde,NString pSentOrgCdeType,NString pSentOrgName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_IMP.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_RECV_DOCUMENT_ID", pRecvDocumentId);
			cmd.addParameter("@P_SENT_DOCUMENT_ID", pSentDocumentId);
			cmd.addParameter("@P_SENT_ORG_CDE", pSentOrgCde);
			cmd.addParameter("@P_SENT_ORG_CDE_TYPE", pSentOrgCdeType);
			cmd.addParameter("@P_SENT_ORG_NAME", pSentOrgName);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_IMP.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pRecvDocumentId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_IMP.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_RECV_DOCUMENT_ID", pRecvDocumentId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pRecvDocumentId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_IMP.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_RECV_DOCUMENT_ID", pRecvDocumentId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pRecvDocumentId,NString pSentDocumentId,NString pSentOrgCde,NString pSentOrgCdeType,NString pSentOrgName,NDate pDocIdReceiveDate,NString pDocIdReceiveStatus,NNumber pDcmtSeqno,NDate pProcessedDate,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_IMP.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RECV_DOCUMENT_ID", pRecvDocumentId);
			cmd.addParameter("@P_SENT_DOCUMENT_ID", pSentDocumentId);
			cmd.addParameter("@P_SENT_ORG_CDE", pSentOrgCde);
			cmd.addParameter("@P_SENT_ORG_CDE_TYPE", pSentOrgCdeType);
			cmd.addParameter("@P_SENT_ORG_NAME", pSentOrgName);
			cmd.addParameter("@P_DOC_ID_RECEIVE_DATE", pDocIdReceiveDate);
			cmd.addParameter("@P_DOC_ID_RECEIVE_STATUS", pDocIdReceiveStatus);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_PROCESSED_DATE", pProcessedDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pRecvDocumentId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_IMP.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RECV_DOCUMENT_ID", pRecvDocumentId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pRecvDocumentId,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_IMP.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RECV_DOCUMENT_ID", pRecvDocumentId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pRecvDocumentId,NString pSentDocumentId,NString pSentOrgCde,NString pSentOrgCdeType,NString pSentOrgName,NDate pDocIdReceiveDate,NString pDocIdReceiveStatus,NNumber pDcmtSeqno,NDate pProcessedDate,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_PESC_STATUS_IMP.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RECV_DOCUMENT_ID", pRecvDocumentId);
			cmd.addParameter("@P_SENT_DOCUMENT_ID", pSentDocumentId);
			cmd.addParameter("@P_SENT_ORG_CDE", pSentOrgCde);
			cmd.addParameter("@P_SENT_ORG_CDE_TYPE", pSentOrgCdeType);
			cmd.addParameter("@P_SENT_ORG_NAME", pSentOrgName);
			cmd.addParameter("@P_DOC_ID_RECEIVE_DATE", pDocIdReceiveDate);
			cmd.addParameter("@P_DOC_ID_RECEIVE_STATUS", pDocIdReceiveStatus);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_PROCESSED_DATE", pProcessedDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="PescStatusImpRecRow", dataSourceName="PESC_STATUS_IMP_REC")
	public static class PescStatusImpRecRow
	{
		@DbRecordField(dataSourceName="R_RECV_DOCUMENT_ID")
		public NString RRecvDocumentId;
		@DbRecordField(dataSourceName="R_SENT_DOCUMENT_ID")
		public NString RSentDocumentId;
		@DbRecordField(dataSourceName="R_SENT_ORG_CDE")
		public NString RSentOrgCde;
		@DbRecordField(dataSourceName="R_SENT_ORG_CDE_TYPE")
		public NString RSentOrgCdeType;
		@DbRecordField(dataSourceName="R_SENT_ORG_NAME")
		public NString RSentOrgName;
		@DbRecordField(dataSourceName="R_DOC_ID_RECEIVE_DATE")
		public NDate RDocIdReceiveDate;
		@DbRecordField(dataSourceName="R_DOC_ID_RECEIVE_STATUS")
		public NString RDocIdReceiveStatus;
		@DbRecordField(dataSourceName="R_DCMT_SEQNO")
		public NNumber RDcmtSeqno;
		@DbRecordField(dataSourceName="R_PROCESSED_DATE")
		public NDate RProcessedDate;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
