package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbRedistrQueue {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_REDISTR_QUEUE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo,NNumber pMemberPidm,NNumber pApproverSeqno,NString pCoasCode,NString pFundCode,NString pOrgnCode,NString pGrntCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_REDISTR_QUEUE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_MEMBER_PIDM", pMemberPidm);
			cmd.addParameter("@P_APPROVER_SEQNO", pApproverSeqno);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_GRNT_CODE", pGrntCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(RedistrQueueRecRow recOne,RedistrQueueRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_REDISTR_QUEUE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, RedistrQueueRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, RedistrQueueRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo,NNumber pMemberPidm,NNumber pApproverSeqno,NString pCoasCode,NString pFundCode,NString pOrgnCode,NString pGrntCode,NString pQprtCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_REDISTR_QUEUE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_MEMBER_PIDM", pMemberPidm);
			cmd.addParameter("@P_APPROVER_SEQNO", pApproverSeqno);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_GRNT_CODE", pGrntCode);
			cmd.addParameter("@P_QPRT_CODE", pQprtCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryById(NNumber pId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_REDISTR_QUEUE.F_QUERY_BY_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ID", pId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_REDISTR_QUEUE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo,NNumber pMemberPidm,NNumber pApproverSeqno,NString pCoasCode,NString pFundCode,NString pOrgnCode,NString pGrntCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_REDISTR_QUEUE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_MEMBER_PIDM", pMemberPidm);
			cmd.addParameter("@P_APPROVER_SEQNO", pApproverSeqno);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_GRNT_CODE", pGrntCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo,NNumber pMemberPidm,NNumber pApproverSeqno,NString pCoasCode,NString pFundCode,NString pOrgnCode,NString pGrntCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_REDISTR_QUEUE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_MEMBER_PIDM", pMemberPidm);
			cmd.addParameter("@P_APPROVER_SEQNO", pApproverSeqno);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_GRNT_CODE", pGrntCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo,NNumber pMemberPidm,NString pMemberAction,NString pMemberType,NNumber pApproverSeqno,NString pUserSuperuserInd,NString pUserId,NString pCoasCode,NString pFundCode,NString pOrgnCode,NString pGrntCode,NNumber pUserPidm,NString pUserAction,NDate pUserActionDate,NNumber pUserProxyForPidm,NString pQprtCode,NString pDataOrigin,NNumber pTransBatchId,Ref<NNumber> pIdOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_REDISTR_QUEUE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_MEMBER_PIDM", pMemberPidm);
			cmd.addParameter("@P_MEMBER_ACTION", pMemberAction);
			cmd.addParameter("@P_MEMBER_TYPE", pMemberType);
			cmd.addParameter("@P_APPROVER_SEQNO", pApproverSeqno);
			cmd.addParameter("@P_USER_SUPERUSER_IND", pUserSuperuserInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_GRNT_CODE", pGrntCode);
			cmd.addParameter("@P_USER_PIDM", pUserPidm);
			cmd.addParameter("@P_USER_ACTION", pUserAction);
			cmd.addParameter("@P_USER_ACTION_DATE", pUserActionDate);
			cmd.addParameter("@P_USER_PROXY_FOR_PIDM", pUserProxyForPidm);
			cmd.addParameter("@P_QPRT_CODE", pQprtCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TRANS_BATCH_ID", pTransBatchId);
			cmd.addParameter("@P_ID_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pIdOut.val = cmd.getParameterValue("@P_ID_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo,NNumber pMemberPidm,NNumber pApproverSeqno,NString pCoasCode,NString pFundCode,NString pOrgnCode,NString pGrntCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_REDISTR_QUEUE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_MEMBER_PIDM", pMemberPidm);
			cmd.addParameter("@P_APPROVER_SEQNO", pApproverSeqno);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_GRNT_CODE", pGrntCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteByPayEvent(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_REDISTR_QUEUE.P_DELETE_BY_PAY_EVENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();


		}
		
		public static void pLock(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo,NNumber pMemberPidm,NNumber pApproverSeqno,NString pCoasCode,NString pFundCode,NString pOrgnCode,NString pGrntCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_REDISTR_QUEUE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_MEMBER_PIDM", pMemberPidm);
			cmd.addParameter("@P_APPROVER_SEQNO", pApproverSeqno);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_GRNT_CODE", pGrntCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo,NNumber pMemberPidm,NString pMemberAction,NString pMemberType,NNumber pApproverSeqno,NString pUserSuperuserInd,NString pUserId,NString pCoasCode,NString pFundCode,NString pOrgnCode,NString pGrntCode,NNumber pUserPidm,NString pUserAction,NDate pUserActionDate,NNumber pUserProxyForPidm,NString pQprtCode,NString pDataOrigin,NNumber pTransBatchId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_REDISTR_QUEUE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_MEMBER_PIDM", pMemberPidm);
			cmd.addParameter("@P_MEMBER_ACTION", pMemberAction);
			cmd.addParameter("@P_MEMBER_TYPE", pMemberType);
			cmd.addParameter("@P_APPROVER_SEQNO", pApproverSeqno);
			cmd.addParameter("@P_USER_SUPERUSER_IND", pUserSuperuserInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_GRNT_CODE", pGrntCode);
			cmd.addParameter("@P_USER_PIDM", pUserPidm);
			cmd.addParameter("@P_USER_ACTION", pUserAction);
			cmd.addParameter("@P_USER_ACTION_DATE", pUserActionDate);
			cmd.addParameter("@P_USER_PROXY_FOR_PIDM", pUserProxyForPidm);
			cmd.addParameter("@P_QPRT_CODE", pQprtCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TRANS_BATCH_ID", pTransBatchId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="RedistrQueueRecRow", dataSourceName="REDISTR_QUEUE_REC")
	public static class RedistrQueueRecRow
	{
		@DbRecordField(dataSourceName="R_ID")
		public NNumber RId;
		@DbRecordField(dataSourceName="R_YEAR")
		public NString RYear;
		@DbRecordField(dataSourceName="R_PICT_CODE")
		public NString RPictCode;
		@DbRecordField(dataSourceName="R_PAYNO")
		public NNumber RPayno;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_MEMBER_PIDM")
		public NNumber RMemberPidm;
		@DbRecordField(dataSourceName="R_MEMBER_ACTION")
		public NString RMemberAction;
		@DbRecordField(dataSourceName="R_MEMBER_TYPE")
		public NString RMemberType;
		@DbRecordField(dataSourceName="R_APPROVER_SEQNO")
		public NNumber RApproverSeqno;
		@DbRecordField(dataSourceName="R_USER_SUPERUSER_IND")
		public NString RUserSuperuserInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_COAS_CODE")
		public NString RCoasCode;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_ORGN_CODE")
		public NString ROrgnCode;
		@DbRecordField(dataSourceName="R_GRNT_CODE")
		public NString RGrntCode;
		@DbRecordField(dataSourceName="R_USER_PIDM")
		public NNumber RUserPidm;
		@DbRecordField(dataSourceName="R_USER_ACTION")
		public NString RUserAction;
		@DbRecordField(dataSourceName="R_USER_ACTION_DATE")
		public NDate RUserActionDate;
		@DbRecordField(dataSourceName="R_USER_PROXY_FOR_PIDM")
		public NNumber RUserProxyForPidm;
		@DbRecordField(dataSourceName="R_QPRT_CODE")
		public NString RQprtCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_TRANS_BATCH_ID")
		public NNumber RTransBatchId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
