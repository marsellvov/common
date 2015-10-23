package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkdwaq {
//		public static void pDequeueDwDescRequest(NNumber pMaxWait,Ref<> pDwDescPayload) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_DEQUEUE_DW_DESC_REQUEST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_MAX_WAIT", pMaxWait);
//			cmd.addParameter("@P_DW_DESC_PAYLOAD", .class);
//				
//			cmd.execute();
//			pDwDescPayload.val = cmd.getParameterValue("@P_DW_DESC_PAYLOAD", .class);
//
//
//		}
		
//		public static void pDequeueDwDescResponseId(NString pCorrelationId,Ref<> pDwDescPayload,Ref<NString> pErrorMsg) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_DEQUEUE_DW_DESC_RESPONSE_ID", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_CORRELATION_ID", pCorrelationId);
//			cmd.addParameter("@P_DW_DESC_PAYLOAD", .class);
//			cmd.addParameter("@P_ERROR_MSG", NString.class);
//				
//			cmd.execute();
//			pDwDescPayload.val = cmd.getParameterValue("@P_DW_DESC_PAYLOAD", .class);
//			pErrorMsg.val = cmd.getParameterValue("@P_ERROR_MSG", NString.class);
//
//
//		}
		
//		public static void pDequeueDwPreqRequest(NNumber pMaxWait,Ref<> pDwPreqPayload) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_DEQUEUE_DW_PREQ_REQUEST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_MAX_WAIT", pMaxWait);
//			cmd.addParameter("@P_DW_PREQ_PAYLOAD", .class);
//				
//			cmd.execute();
//			pDwPreqPayload.val = cmd.getParameterValue("@P_DW_PREQ_PAYLOAD", .class);
//
//
//		}
//		
//		public static void pDequeueDwPreqResponseId(NString pCorrelationId,Ref<> pDwPreqPayload,Ref<NString> pErrorMsg) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_DEQUEUE_DW_PREQ_RESPONSE_ID", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_CORRELATION_ID", pCorrelationId);
//			cmd.addParameter("@P_DW_PREQ_PAYLOAD", .class);
//			cmd.addParameter("@P_ERROR_MSG", NString.class);
//				
//			cmd.execute();
//			pDwPreqPayload.val = cmd.getParameterValue("@P_DW_PREQ_PAYLOAD", .class);
//			pErrorMsg.val = cmd.getParameterValue("@P_ERROR_MSG", NString.class);
//
//
//		}
		
		public static void pDispDescRequestMessages() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_DISP_DESC_REQUEST_MESSAGES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispDescResponseMessages() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_DISP_DESC_RESPONSE_MESSAGES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispPreqRequestMessages() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_DISP_PREQ_REQUEST_MESSAGES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispPreqResponseMessages() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_DISP_PREQ_RESPONSE_MESSAGES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDisplayMessages(NString pQueueTable,NString pQueueName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_DISPLAY_MESSAGES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_QUEUE_TABLE", pQueueTable);
			cmd.addParameter("@P_QUEUE_NAME", pQueueName);
				
			cmd.execute();


		}
		
		public static void pEnqueueDwDescRequest(NString pDwDescPayload,Ref<NString> pErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_ENQUEUE_DW_DESC_REQUEST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DW_DESC_PAYLOAD", pDwDescPayload);
			cmd.addParameter("@P_ERROR_MSG", NString.class);
				
			cmd.execute();
			pErrorMsg.val = cmd.getParameterValue("@P_ERROR_MSG", NString.class);


		}
		
		public static void pEnqueueDwDescResponseId(NString pDwDescPayload,NString pCorrelationId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_ENQUEUE_DW_DESC_RESPONSE_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DW_DESC_PAYLOAD", pDwDescPayload);
			cmd.addParameter("@P_CORRELATION_ID", pCorrelationId);
				
			cmd.execute();


		}
		
		public static void pEnqueueDwPreqRequest(NString pDwPreqPayload,Ref<NString> pErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_ENQUEUE_DW_PREQ_REQUEST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DW_PREQ_PAYLOAD", pDwPreqPayload);
			cmd.addParameter("@P_ERROR_MSG", NString.class);
				
			cmd.execute();
			pErrorMsg.val = cmd.getParameterValue("@P_ERROR_MSG", NString.class);


		}
		
		public static void pEnqueueDwPreqResponseId(NString pDwPreqPayload,NString pCorrelationId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_ENQUEUE_DW_PREQ_RESPONSE_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DW_PREQ_PAYLOAD", pDwPreqPayload);
			cmd.addParameter("@P_CORRELATION_ID", pCorrelationId);
				
			cmd.execute();


		}
		
		public static void pKillDescServer() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_KILL_DESC_SERVER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pKillPreqServer() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_KILL_PREQ_SERVER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPurgeDwDescRequestQ() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_PURGE_DW_DESC_REQUEST_Q", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPurgeDwDescResponseQ() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_PURGE_DW_DESC_RESPONSE_Q", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPurgeDwPreqRequestQ() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_PURGE_DW_PREQ_REQUEST_Q", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPurgeDwPreqResponseQ() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_PURGE_DW_PREQ_RESPONSE_Q", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pStartDwDescRequestQ() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_START_DW_DESC_REQUEST_Q", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pStartDwDescResponseQ() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_START_DW_DESC_RESPONSE_Q", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pStartDwPreqRequestQ() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_START_DW_PREQ_REQUEST_Q", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pStartDwPreqResponseQ() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_START_DW_PREQ_RESPONSE_Q", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pStopDwDescRequestQ() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_STOP_DW_DESC_REQUEST_Q", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pStopDwDescResponseQ() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_STOP_DW_DESC_RESPONSE_Q", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pStopDwPreqRequestQ() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_STOP_DW_PREQ_REQUEST_Q", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pStopDwPreqResponseQ() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDWAQ.P_STOP_DW_PREQ_RESPONSE_Q", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
