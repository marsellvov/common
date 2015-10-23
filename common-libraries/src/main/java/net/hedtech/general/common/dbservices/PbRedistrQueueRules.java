package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbRedistrQueueRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_REDISTR_QUEUE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pId,NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo,NNumber pMemberPidm,NString pMemberAction,NString pMemberType,NNumber pApproverSeqno,NString pUserSuperuserInd,NString pUserId,NString pCoasCode,NString pFundCode,NString pOrgnCode,NString pGrntCode,NNumber pUserPidm,NString pUserAction,NDate pUserActionDate,NNumber pUserProxyForPidm,NString pQprtCode,NString pDataOrigin,NNumber pTransBatchId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_REDISTR_QUEUE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_ID", pId);
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
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pYear,NString pPictCode,NNumber pPayno,NNumber pPidm,NNumber pSeqNo,NNumber pMemberPidm,NString pMemberAction,NString pMemberType,NNumber pApproverSeqno,NString pUserSuperuserInd,NString pUserId,NString pCoasCode,NString pFundCode,NString pOrgnCode,NString pGrntCode,NNumber pUserPidm,NString pUserAction,NDate pUserActionDate,NNumber pUserProxyForPidm,NString pQprtCode,NString pDataOrigin,NNumber pTransBatchId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_REDISTR_QUEUE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
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
				
			cmd.execute();


		}
		
	
	
	
}
