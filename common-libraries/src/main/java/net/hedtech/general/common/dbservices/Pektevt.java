package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.Nokmsgs.MsgRectypeRow;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pektevt {
		public static MsgRectypeRow fValidateLeaveBalance(NNumber pPidm,NString pEarnCode,NNumber pJobseqno,NString pActionInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEVT.F_VALIDATE_LEAVE_BALANCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(MsgRectypeRow.class));
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_JOBSEQNO", pJobseqno);
			cmd.addParameter("@P_ACTION_IND", pActionInd);
				
			cmd.execute();

			return cmd.getReturnValue(MsgRectypeRow.class);

		}
		
		public static void pGetValidTransTypes(NNumber jobsSeqnoIn,NString userRoleIndIn,NNumber userPidmIn,NNumber proxyForPidmIn,Ref<NString> extractIndOut,Ref<NString> restartIndOut,Ref<NString> updateIndOut,Ref<NString> submitIndOut,Ref<NString> approveIndOut,Ref<NString> acknowIndOut,Ref<NString> returnIndOut,Ref<NString> deleteIndOut,Ref<NString> cancelIndOut,Ref<NString> recallIndOut,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEVT.P_GET_VALID_TRANS_TYPES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter("@USER_ROLE_IND_IN", userRoleIndIn);
			cmd.addParameter("@USER_PIDM_IN", userPidmIn);
			cmd.addParameter("@PROXY_FOR_PIDM_IN", proxyForPidmIn);
			cmd.addParameter("@EXTRACT_IND_OUT", NString.class);
			cmd.addParameter("@RESTART_IND_OUT", NString.class);
			cmd.addParameter("@UPDATE_IND_OUT", NString.class);
			cmd.addParameter("@SUBMIT_IND_OUT", NString.class);
			cmd.addParameter("@APPROVE_IND_OUT", NString.class);
			cmd.addParameter("@ACKNOW_IND_OUT", NString.class);
			cmd.addParameter("@RETURN_IND_OUT", NString.class);
			cmd.addParameter("@DELETE_IND_OUT", NString.class);
			cmd.addParameter("@CANCEL_IND_OUT", NString.class);
			cmd.addParameter("@RECALL_IND_OUT", NString.class);
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT",msgRecOut.val, Nokmsgs.MsgRectypeRow.class, true));
				
			cmd.execute();
			extractIndOut.val = cmd.getParameterValue("@EXTRACT_IND_OUT", NString.class);
			restartIndOut.val = cmd.getParameterValue("@RESTART_IND_OUT", NString.class);
			updateIndOut.val = cmd.getParameterValue("@UPDATE_IND_OUT", NString.class);
			submitIndOut.val = cmd.getParameterValue("@SUBMIT_IND_OUT", NString.class);
			approveIndOut.val = cmd.getParameterValue("@APPROVE_IND_OUT", NString.class);
			acknowIndOut.val = cmd.getParameterValue("@ACKNOW_IND_OUT", NString.class);
			returnIndOut.val = cmd.getParameterValue("@RETURN_IND_OUT", NString.class);
			deleteIndOut.val = cmd.getParameterValue("@DELETE_IND_OUT", NString.class);
			cancelIndOut.val = cmd.getParameterValue("@CANCEL_IND_OUT", NString.class);
			recallIndOut.val = cmd.getParameterValue("@RECALL_IND_OUT", NString.class);
			msgRecOut.val = cmd.getParameterValue("MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
		public static void pGetValidTransTypes(NString yearIn,NString pictCodeIn,NNumber paynoIn,NString actionIndIn,NNumber pidmIn,NString posnIn,NString suffIn,NDate effDateIn,NString userRoleIndIn,NNumber userPidmIn,NNumber proxyForPidmIn,Ref<NString> extractIndOut,Ref<NString> restartIndOut,Ref<NString> updateIndOut,Ref<NString> submitIndOut,Ref<NString> approveIndOut,Ref<NString> acknowIndOut,Ref<NString> returnIndOut,Ref<NString> deleteIndOut,Ref<NString> cancelIndOut,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEVT.P_GET_VALID_TRANS_TYPES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@YEAR_IN", yearIn);
			cmd.addParameter("@PICT_CODE_IN", pictCodeIn);
			cmd.addParameter("@PAYNO_IN", paynoIn);
			cmd.addParameter("@ACTION_IND_IN", actionIndIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@POSN_IN", posnIn);
			cmd.addParameter("@SUFF_IN", suffIn);
			cmd.addParameter("@EFF_DATE_IN", effDateIn);
			cmd.addParameter("@USER_ROLE_IND_IN", userRoleIndIn);
			cmd.addParameter("@USER_PIDM_IN", userPidmIn);
			cmd.addParameter("@PROXY_FOR_PIDM_IN", proxyForPidmIn);
			cmd.addParameter("@EXTRACT_IND_OUT", NString.class);
			cmd.addParameter("@RESTART_IND_OUT", NString.class);
			cmd.addParameter("@UPDATE_IND_OUT", NString.class);
			cmd.addParameter("@SUBMIT_IND_OUT", NString.class);
			cmd.addParameter("@APPROVE_IND_OUT", NString.class);
			cmd.addParameter("@ACKNOW_IND_OUT", NString.class);
			cmd.addParameter("@RETURN_IND_OUT", NString.class);
			cmd.addParameter("@DELETE_IND_OUT", NString.class);
			cmd.addParameter("@CANCEL_IND_OUT", NString.class);
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT",msgRecOut.val, Nokmsgs.MsgRectypeRow.class, true));
				
			cmd.execute();
			extractIndOut.val = cmd.getParameterValue("@EXTRACT_IND_OUT", NString.class);
			restartIndOut.val = cmd.getParameterValue("@RESTART_IND_OUT", NString.class);
			updateIndOut.val = cmd.getParameterValue("@UPDATE_IND_OUT", NString.class);
			submitIndOut.val = cmd.getParameterValue("@SUBMIT_IND_OUT", NString.class);
			approveIndOut.val = cmd.getParameterValue("@APPROVE_IND_OUT", NString.class);
			acknowIndOut.val = cmd.getParameterValue("@ACKNOW_IND_OUT", NString.class);
			returnIndOut.val = cmd.getParameterValue("@RETURN_IND_OUT", NString.class);
			deleteIndOut.val = cmd.getParameterValue("@DELETE_IND_OUT", NString.class);
			cancelIndOut.val = cmd.getParameterValue("@CANCEL_IND_OUT", NString.class);
			msgRecOut.val = cmd.getParameterValue("MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
		public static void pValidateProxy(NString userIdIn,NString proxyForUserIdIn,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEVT.P_VALIDATE_PROXY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_ID_IN", userIdIn);
			cmd.addParameter("@PROXY_FOR_USER_ID_IN", proxyForUserIdIn);
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT",msgRecOut.val, Nokmsgs.MsgRectypeRow.class, true));
				
			cmd.execute();
			msgRecOut.val = cmd.getParameterValue("@MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
		public static void pValidateRoutingQueue(NNumber jobsSeqnoIn,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEVT.P_VALIDATE_ROUTING_QUEUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO_IN", jobsSeqnoIn);
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT",msgRecOut.val, Nokmsgs.MsgRectypeRow.class, true));
				
			cmd.execute();
			msgRecOut.val = cmd.getParameterValue("@MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
//		public static void pValidateTime(Pektecm.TransactionRectypeRow transRecIn,Ref<List<Nokmsgs.MsgTabtypeRow>> msgTableOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEVT.P_VALIDATE_TIME", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter(DbTypes.createStructType("TRANS_REC_IN", transRecIn, Pektecm.TransactionRectypeRow.class ));
//			// cmd.addParameter(DbTypes.getTableType("MSG_TABLE_OUT", "", object.class));
//				
//			cmd.execute();
//			// msgTableOut.val = cmd.getTableParameterValue("@MSG_TABLE_OUT", object.class);
//
//
//		}
		
		public static void pValidateTransaction(Pektecm.TransactionRectypeRow transRecIn,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEVT.P_VALIDATE_TRANSACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("TRANS_REC_IN", transRecIn, Pektecm.TransactionRectypeRow.class ));
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT",msgRecOut.val, Nokmsgs.MsgRectypeRow.class, true));
				
			cmd.execute();
			msgRecOut.val = cmd.getParameterValue("@MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
		public static void pValidateUser(NString userRoleIndIn,NNumber userPidmIn,NNumber proxyForPidmIn,NString actionIndIn,Ref<Nokmsgs.MsgRectypeRow> msgRecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTEVT.P_VALIDATE_USER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@USER_ROLE_IND_IN", userRoleIndIn);
			cmd.addParameter("@USER_PIDM_IN", userPidmIn);
			cmd.addParameter("@PROXY_FOR_PIDM_IN", proxyForPidmIn);
			cmd.addParameter("@ACTION_IND_IN", actionIndIn);
			cmd.addParameter(DbTypes.createStructType("MSG_REC_OUT",msgRecOut.val, Nokmsgs.MsgRectypeRow.class, true));
				
			cmd.execute();
			msgRecOut.val = cmd.getParameterValue("@MSG_REC_OUT", Nokmsgs.MsgRectypeRow.class);


		}
		
	
	
	
}
