package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class NbRedistrDfltQueueRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_REDISTR_DFLT_QUEUE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pId,NNumber pNtrqprtId,NNumber pSeqNo,NString pGrantsOnlyInd,NString pApproverAction,NString pUserId,NNumber pElapsedDays,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_REDISTR_DFLT_QUEUE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_NTRQPRT_ID", pNtrqprtId);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_GRANTS_ONLY_IND", pGrantsOnlyInd);
			cmd.addParameter("@P_APPROVER_ACTION", pApproverAction);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ELAPSED_DAYS", pElapsedDays);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pNtrqprtId,NNumber pSeqNo,NString pGrantsOnlyInd,NString pApproverAction,NString pUserId,NNumber pElapsedDays,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_REDISTR_DFLT_QUEUE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NTRQPRT_ID", pNtrqprtId);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_GRANTS_ONLY_IND", pGrantsOnlyInd);
			cmd.addParameter("@P_APPROVER_ACTION", pApproverAction);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ELAPSED_DAYS", pElapsedDays);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
