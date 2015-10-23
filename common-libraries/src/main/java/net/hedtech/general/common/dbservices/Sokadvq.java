package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sokadvq {
		public static NNumber fSfradvqRunning() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKADVQ.F_SFRADVQ_RUNNING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pDequeueSfkcmplRequest(NNumber pMaxWait,Ref<NString> pSfkcmplPayload) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKADVQ.P_DEQUEUE_SFKCMPL_REQUEST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MAX_WAIT", pMaxWait);
			cmd.addParameter("@P_SFKCMPL_PAYLOAD", NString.class);
				
			cmd.execute();
			pSfkcmplPayload.val = cmd.getParameterValue("@P_SFKCMPL_PAYLOAD", NString.class);


		}
		
		public static void pDequeueSfkcmplResponseId(NString pCorrelationId,Ref<NString> pSfkcmplPayload) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKADVQ.P_DEQUEUE_SFKCMPL_RESPONSE_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CORRELATION_ID", pCorrelationId);
			cmd.addParameter("@P_SFKCMPL_PAYLOAD", NString.class);
				
			cmd.execute();
			pSfkcmplPayload.val = cmd.getParameterValue("@P_SFKCMPL_PAYLOAD", NString.class);


		}
		
		public static void pDisplayMessages(NString pQueueTable,NString pQueueName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKADVQ.P_DISPLAY_MESSAGES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_QUEUE_TABLE", pQueueTable);
			cmd.addParameter("@P_QUEUE_NAME", pQueueName);
				
			cmd.execute();


		}
		
		public static void pDisplayRequestMessages() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKADVQ.P_DISPLAY_REQUEST_MESSAGES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDisplayResponseMessages() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKADVQ.P_DISPLAY_RESPONSE_MESSAGES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pEnqueueSfkcmplResponseId(NString pSfkcmplPayload,NString pCorrelationId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKADVQ.P_ENQUEUE_SFKCMPL_RESPONSE_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SFKCMPL_PAYLOAD", pSfkcmplPayload);
			cmd.addParameter("@P_CORRELATION_ID", pCorrelationId);
				
			cmd.execute();


		}
		
		public static void pKillAllServers() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKADVQ.P_KILL_ALL_SERVERS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPingAllServers() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKADVQ.P_PING_ALL_SERVERS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPurgeQueue(NString pQueueName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKADVQ.P_PURGE_QUEUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_QUEUE_NAME", pQueueName);
				
			cmd.execute();


		}
		
		public static void pSfkcmplSubmit(NNumber sfOneUpNo,NString sfRunmode,NNumber sfPidm,NNumber sfNewRequestNo,Ref<NNumber> sfStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKADVQ.P_SFKCMPL_SUBMIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SF_ONE_UP_NO", sfOneUpNo);
			cmd.addParameter("@SF_RUNMODE", sfRunmode);
			cmd.addParameter("@SF_PIDM", sfPidm);
			cmd.addParameter("@SF_NEW_REQUEST_NO", sfNewRequestNo);
			cmd.addParameter("@SF_STATUS", NNumber.class);
				
			cmd.execute();
			sfStatus.val = cmd.getParameterValue("@SF_STATUS", NNumber.class);


		}
		
		public static void pStartSfkcmplRequestQ() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKADVQ.P_START_SFKCMPL_REQUEST_Q", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pStartSfkcmplResponseQ() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKADVQ.P_START_SFKCMPL_RESPONSE_Q", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pStopSfkcmplRequestQ() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKADVQ.P_STOP_SFKCMPL_REQUEST_Q", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pStopSfkcmplResponseQ() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOKADVQ.P_STOP_SFKCMPL_RESPONSE_Q", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
