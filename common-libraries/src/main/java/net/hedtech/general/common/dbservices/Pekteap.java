package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pekteap {
		public static void pAcknowledgeTime(NNumber jobsSeqnoIn,NString userRoleIndIn,NNumber userPidmIn,NNumber proxyForPidmIn,NString sourceIndIn,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEAP.P_ACKNOWLEDGE_TIME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@USER_ROLE_IND_IN", userRoleIndIn);
			cmd.addParameter("@USER_PIDM_IN", userPidmIn);
			cmd.addParameter("@PROXY_FOR_PIDM_IN", proxyForPidmIn);
			cmd.addParameter("@SOURCE_IND_IN", sourceIndIn);
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT", msgRecOut.val, Nokmsgs.MsgRectypeRow.class));
				
			cmd.execute();
			msgRecOut.val = cmd.getParameterValue("@MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
		public static void pApproveTime(NNumber jobsSeqnoIn,NString userRoleIndIn,NNumber userPidmIn,NNumber proxyForPidmIn,NString sourceIndIn,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEAP.P_APPROVE_TIME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@USER_ROLE_IND_IN", userRoleIndIn);
			cmd.addParameter("@USER_PIDM_IN", userPidmIn);
			cmd.addParameter("@PROXY_FOR_PIDM_IN", proxyForPidmIn);
			cmd.addParameter("@SOURCE_IND_IN", sourceIndIn);
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT", msgRecOut.val, Nokmsgs.MsgRectypeRow.class));
				
			cmd.execute();
			msgRecOut.val = cmd.getParameterValue("MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
		public static void pCancelTime(NNumber jobsSeqnoIn,NString userRoleIndIn,NNumber userPidmIn,NNumber proxyForPidmIn,NString sourceIndIn,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEAP.P_CANCEL_TIME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@USER_ROLE_IND_IN", userRoleIndIn);
			cmd.addParameter("@USER_PIDM_IN", userPidmIn);
			cmd.addParameter("@PROXY_FOR_PIDM_IN", proxyForPidmIn);
			cmd.addParameter("@SOURCE_IND_IN", sourceIndIn);
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT", msgRecOut.val, Nokmsgs.MsgRectypeRow.class));
				
			cmd.execute();
			msgRecOut.val = cmd.getParameterValue("MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
		public static void pDeleteTime(NNumber jobsSeqnoIn,NString userRoleIndIn,NNumber userPidmIn,NNumber proxyForPidmIn,NString sourceIndIn,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEAP.P_DELETE_TIME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@USER_ROLE_IND_IN", userRoleIndIn);
			cmd.addParameter("@USER_PIDM_IN", userPidmIn);
			cmd.addParameter("@PROXY_FOR_PIDM_IN", proxyForPidmIn);
			cmd.addParameter("@SOURCE_IND_IN", sourceIndIn);
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT", msgRecOut.val, Nokmsgs.MsgRectypeRow.class));
				
			cmd.execute();
			msgRecOut.val = cmd.getParameterValue("MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
//		public static void pEndTransaction(Pektecm.TransactionRectypeRow transRecIn,NString transStatusIn, List<Nokmsgs.MsgTabtypeRow> msgTableIn, Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEAP.P_END_TRANSACTION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("TRANS_REC_IN", transRecIn, Pektecm.TransactionRectypeRow.class ));
//			cmd.addParameter("@TRANS_STATUS_IN", transStatusIn);
//			// cmd.addParameter(DbTypes.getTableType("MSG_TABLE_IN", "", msgTableIn, object.class));
//			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT", msgRecOut.val, Nokmsgs.MsgRectypeRow.class));
//				
//			cmd.execute();
//			msgRecOut.val = cmd.getParameterValue("MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);
//
//
//		}
		
		public static void pInspectTime(NNumber jobsSeqnoIn,NString userRoleIndIn,NNumber userPidmIn,NNumber proxyForPidmIn,NString sourceIndIn,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEAP.P_INSPECT_TIME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@USER_ROLE_IND_IN", userRoleIndIn);
			cmd.addParameter("@USER_PIDM_IN", userPidmIn);
			cmd.addParameter("@PROXY_FOR_PIDM_IN", proxyForPidmIn);
			cmd.addParameter("@SOURCE_IND_IN", sourceIndIn);
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT", msgRecOut.val, Nokmsgs.MsgRectypeRow.class));
				
			cmd.execute();
			msgRecOut.val = cmd.getParameterValue("MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
		public static void pRecallTime(NNumber pJobsSeqnoIn,NString pUserRoleIndIn,NNumber pUserPidmIn,NNumber pProxyForPidmIn,NString pSourceIndIn,Ref<Nokmsgs.MsgRectypeRow> pMsgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEAP.P_RECALL_TIME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOBS_SEQNO_IN", pJobsSeqnoIn);
			cmd.addParameter("@P_USER_ROLE_IND_IN", pUserRoleIndIn);
			cmd.addParameter("@P_USER_PIDM_IN", pUserPidmIn);
			cmd.addParameter("@P_PROXY_FOR_PIDM_IN", pProxyForPidmIn);
			cmd.addParameter("@P_SOURCE_IND_IN", pSourceIndIn);
			cmd.addParameter(DbTypes.createStructType("P_MSG_REC_OUT", pMsgRecOut.val, Nokmsgs.MsgRectypeRow.class));
				
			cmd.execute();
			pMsgRecOut.val = cmd.getParameterValue("P_MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
		public static void pReturnTime(NNumber jobsSeqnoIn,NString userRoleIndIn,NNumber userPidmIn,NNumber proxyForPidmIn,NString sourceIndIn,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEAP.P_RETURN_TIME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@USER_ROLE_IND_IN", userRoleIndIn);
			cmd.addParameter("@USER_PIDM_IN", userPidmIn);
			cmd.addParameter("@PROXY_FOR_PIDM_IN", proxyForPidmIn);
			cmd.addParameter("@SOURCE_IND_IN", sourceIndIn);
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT", msgRecOut.val, Nokmsgs.MsgRectypeRow.class));
				
			cmd.execute();
			msgRecOut.val = cmd.getParameterValue("MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
		public static void pStartTransaction(NNumber jobsSeqnoIn,NString transTypeIndIn,NString userRoleIndIn,NNumber userPidmIn,NNumber proxyForPidmIn,NString sourceIndIn,Ref<Pektecm.TransactionRectypeRow> transRecOut,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEAP.P_START_TRANSACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@TRANS_TYPE_IND_IN", transTypeIndIn);
			cmd.addParameter("@USER_ROLE_IND_IN", userRoleIndIn);
			cmd.addParameter("@USER_PIDM_IN", userPidmIn);
			cmd.addParameter("@PROXY_FOR_PIDM_IN", proxyForPidmIn);
			cmd.addParameter("@SOURCE_IND_IN", sourceIndIn);
			cmd.addParameter(DbTypes.createStructType("TRANS_REC_OUT", transRecOut.val, Pektecm.TransactionRectypeRow.class));
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT", msgRecOut.val, Nokmsgs.MsgRectypeRow.class));
				
			cmd.execute();
			transRecOut.val = cmd.getParameterValue("TRANS_REC_OUT", Pektecm.TransactionRectypeRow.class);
			msgRecOut.val = cmd.getParameterValue("MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
		public static void pSubmitTime(NNumber jobsSeqnoIn,NString userRoleIndIn,NNumber userPidmIn,NNumber proxyForPidmIn,NString sourceIndIn,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEAP.P_SUBMIT_TIME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@USER_ROLE_IND_IN", userRoleIndIn);
			cmd.addParameter("@USER_PIDM_IN", userPidmIn);
			cmd.addParameter("@PROXY_FOR_PIDM_IN", proxyForPidmIn);
			cmd.addParameter("@SOURCE_IND_IN", sourceIndIn);
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT", msgRecOut.val, Nokmsgs.MsgRectypeRow.class));
				
			cmd.execute();
			msgRecOut.val = cmd.getParameterValue("MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
	
	
	
}
