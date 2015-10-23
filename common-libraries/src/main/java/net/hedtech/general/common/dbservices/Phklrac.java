package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Phklrac {
		public static NString fLaborApprove(NString pYear,NString pPict,NNumber pPayno,NNumber pPidm,NNumber pSeqno,NString pSuperuserInd,NNumber pUserPidm,NNumber pProxyForPidm,NNumber pApproverSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLRAC.F_LABOR_APPROVE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_SUPERUSER_IND", pSuperuserInd);
			cmd.addParameter("@P_USER_PIDM", pUserPidm);
			cmd.addParameter("@P_PROXY_FOR_PIDM", pProxyForPidm);
			cmd.addParameter("@P_APPROVER_SEQNO", pApproverSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fLaborFyi(NString pYear,NString pPict,NNumber pPayno,NNumber pPidm,NNumber pSeqno,NString pSuperuserInd,NNumber pUserPidm,NNumber pProxyForPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLRAC.F_LABOR_FYI", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_SUPERUSER_IND", pSuperuserInd);
			cmd.addParameter("@P_USER_PIDM", pUserPidm);
			cmd.addParameter("@P_PROXY_FOR_PIDM", pProxyForPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fLaborReturn(NString pYear,NString pPict,NNumber pPayno,NNumber pPidm,NNumber pSeqno,NString pSuperuserInd,NNumber pUserPidm,NNumber pProxyForPidm,NNumber pApproverSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLRAC.F_LABOR_RETURN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_SUPERUSER_IND", pSuperuserInd);
			cmd.addParameter("@P_USER_PIDM", pUserPidm);
			cmd.addParameter("@P_PROXY_FOR_PIDM", pProxyForPidm);
			cmd.addParameter("@P_APPROVER_SEQNO", pApproverSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidPhrllrqMemberType(NString pMemberType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLRAC.F_VALID_PHRLLRQ_MEMBER_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_MEMBER_TYPE", pMemberType);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetLaborRoutingActions(NString pYear,NString pPict,NNumber pPayno,NNumber pPidm,NNumber pSeqno,NString pSuperuserInd,NNumber pUserPidm,NNumber pProxyForPidm,Ref<NBool> pApprove,Ref<NBool> pFyi,Ref<NBool> pReturn,Ref<NBool> pNoAction) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLRAC.P_GET_LABOR_ROUTING_ACTIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT", pPict);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_SUPERUSER_IND", pSuperuserInd);
			cmd.addParameter("@P_USER_PIDM", pUserPidm);
			cmd.addParameter("@P_PROXY_FOR_PIDM", pProxyForPidm);
			cmd.addParameter("@P_APPROVE", NBool.class);
			cmd.addParameter("@P_FYI", NBool.class);
			cmd.addParameter("@P_RETURN", NBool.class);
			cmd.addParameter("@P_NO_ACTION", NBool.class);
				
			cmd.execute();
			pApprove.val = cmd.getParameterValue("@P_APPROVE", NBool.class);
			pFyi.val = cmd.getParameterValue("@P_FYI", NBool.class);
			pReturn.val = cmd.getParameterValue("@P_RETURN", NBool.class);
			pNoAction.val = cmd.getParameterValue("@P_NO_ACTION", NBool.class);


		}
		
		public static void pSaveQueueAction(NNumber pId,NNumber pUserPidm,NString pUserAction,NNumber pUserProxyForPidm,NString pUserSuperuserInd,Ref<NString> pErrorMsgOut,Ref<NString> pPendingQueueOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PHKLRAC.P_SAVE_QUEUE_ACTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_USER_PIDM", pUserPidm);
			cmd.addParameter("@P_USER_ACTION", pUserAction);
			cmd.addParameter("@P_USER_PROXY_FOR_PIDM", pUserProxyForPidm);
			cmd.addParameter("@P_USER_SUPERUSER_IND", pUserSuperuserInd);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
			cmd.addParameter("@P_PENDING_QUEUE_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);
			pPendingQueueOut.val = cmd.getParameterValue("@P_PENDING_QUEUE_OUT", NString.class);


		}
		
	
	
	
}
