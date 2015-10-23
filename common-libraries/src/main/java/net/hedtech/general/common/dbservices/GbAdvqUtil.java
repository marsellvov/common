package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbAdvqUtil {
		public static NNumber fCountQtableRows(NString pQueueTable,Ref<NString> pQueryStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.F_COUNT_QTABLE_ROWS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_QUEUE_TABLE", pQueueTable);
			cmd.addParameter("@P_QUERY_STR", NString.class);
				
			cmd.execute();
			pQueryStr.val = cmd.getParameterValue("@P_QUERY_STR", NString.class);

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fDbaQueueTableExists(NString pQueueTable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.F_DBA_QUEUE_TABLE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_QUEUE_TABLE", pQueueTable);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NNumber fGetMessageCount(NString pQueueTable,NString pQueueName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.F_GET_MESSAGE_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_QUEUE_TABLE", pQueueTable);
			cmd.addParameter("@P_QUEUE_NAME", pQueueName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
//		public static NString fGetMfMisc01Value( pMsgFragments) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.F_GET_MF_MISC_01_VALUE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@P_MSG_FRAGMENTS", pMsgFragments);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
		public static NString fGetUniqueToken() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.F_GET_UNIQUE_TOKEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fQueueEnabledForPurge(NString pQueueName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.F_QUEUE_ENABLED_FOR_PURGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_QUEUE_NAME", pQueueName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fQueueExists(NString pQueueName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.F_QUEUE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_QUEUE_NAME", pQueueName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fQueueTableExists(NString pQueueTable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.F_QUEUE_TABLE_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_QUEUE_TABLE", pQueueTable);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fUseAqAndNotPipes(NString pCode,NString pGroupCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.F_USE_AQ_AND_NOT_PIPES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_GROUP_CODE", pGroupCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pAddSubscriber(NString pQueueName,NString pSubscriberName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.P_ADD_SUBSCRIBER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_QUEUE_NAME", pQueueName);
			cmd.addParameter("@P_SUBSCRIBER_NAME", pSubscriberName);
				
			cmd.execute();


		}
		
		public static void pCreateQueue(NString pQueueTable,NString pPayloadType,NString pQueueName,NNumber pQueueType,NBool pMultipleConsumers) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.P_CREATE_QUEUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_QUEUE_TABLE", pQueueTable);
			cmd.addParameter("@P_PAYLOAD_TYPE", pPayloadType);
			cmd.addParameter("@P_QUEUE_NAME", pQueueName);
			cmd.addParameter("@P_QUEUE_TYPE", pQueueType);
			cmd.addParameter("@P_MULTIPLE_CONSUMERS", pMultipleConsumers);
				
			cmd.execute();


		}
		
//		public static void pDequeueMsgFragments(NString pQueueName,NNumber pMaxWait,Ref<> pMsgFragments,NString pRemoveNodata) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.P_DEQUEUE_MSG_FRAGMENTS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_QUEUE_NAME", pQueueName);
//			cmd.addParameter("@P_MAX_WAIT", pMaxWait);
//			cmd.addParameter("@P_MSG_FRAGMENTS", .class);
//			cmd.addParameter("@P_REMOVE_NODATA", pRemoveNodata);
//				
//			cmd.execute();
//			pMsgFragments.val = cmd.getParameterValue("@P_MSG_FRAGMENTS", .class);
//
//
//		}
//		
//		public static void pDequeueMsgFragmentsCondit(NString pQueueName,NString pConditValue,NNumber pMaxWait,NNumber pWaitFactor,Ref<> pMsgFragments) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.P_DEQUEUE_MSG_FRAGMENTS_CONDIT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_QUEUE_NAME", pQueueName);
//			cmd.addParameter("@P_CONDIT_VALUE", pConditValue);
//			cmd.addParameter("@P_MAX_WAIT", pMaxWait);
//			cmd.addParameter("@P_WAIT_FACTOR", pWaitFactor);
//			cmd.addParameter("@P_MSG_FRAGMENTS", .class);
//				
//			cmd.execute();
//			pMsgFragments.val = cmd.getParameterValue("@P_MSG_FRAGMENTS", .class);
//
//
//		}
//		
		public static void pDisplayMessages(NString pQueueTable,NString pQueueName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.P_DISPLAY_MESSAGES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_QUEUE_TABLE", pQueueTable);
			cmd.addParameter("@P_QUEUE_NAME", pQueueName);
				
			cmd.execute();


		}
		
		public static void pDisplaySubscribers(NString pQueueName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.P_DISPLAY_SUBSCRIBERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_QUEUE_NAME", pQueueName);
				
			cmd.execute();


		}
		
		public static void pDropQueue(NString pQueueTable,NString pQueueName,NBool pEnqueue,NBool pDequeue,NBool pWait) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.P_DROP_QUEUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_QUEUE_TABLE", pQueueTable);
			cmd.addParameter("@P_QUEUE_NAME", pQueueName);
			cmd.addParameter("@P_ENQUEUE", pEnqueue);
			cmd.addParameter("@P_DEQUEUE", pDequeue);
			cmd.addParameter("@P_WAIT", pWait);
				
			cmd.execute();


		}
		
		public static void pDropQueueTable(NString pQueueTable,NBool pForce,NBool pAutoCommit) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.P_DROP_QUEUE_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_QUEUE_TABLE", pQueueTable);
			cmd.addParameter("@P_FORCE", pForce);
			cmd.addParameter("@P_AUTO_COMMIT", pAutoCommit);
				
			cmd.execute();


		}
		
//		public static void pEnqueueMessage(NString pXml,NBool pBulkSynchronization,NString pBulkSyncCode,List<StringNtRow> pEntityList,NString pVpdInstCode,NBool pSyncPublisherEnabled,NNumber pMessageId) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.P_ENQUEUE_MESSAGE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_XML", pXml);
//			cmd.addParameter("@P_BULK_SYNCHRONIZATION", pBulkSynchronization);
//			cmd.addParameter("@P_BULK_SYNC_CODE", pBulkSyncCode);
//			// cmd.addParameter(DbTypes.getCollectionType("P_ENTITY_LIST", "", pEntityList, object.class));
//			cmd.addParameter("@P_VPD_INST_CODE", pVpdInstCode);
//			cmd.addParameter("@P_SYNC_PUBLISHER_ENABLED", pSyncPublisherEnabled);
//			cmd.addParameter("@P_MESSAGE_ID", pMessageId);
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pEnqueueMsgFragments(NString pQueueName, pMsgFragments,NNumber pDeliveryMode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.P_ENQUEUE_MSG_FRAGMENTS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_QUEUE_NAME", pQueueName);
//			cmd.addParameter("@P_MSG_FRAGMENTS", pMsgFragments);
//			cmd.addParameter("@P_DELIVERY_MODE", pDeliveryMode);
//				
//			cmd.execute();
//
//
//		}
//		
		public static void pHandshakeMsgFragmentsDeq1(NString pQueueName,NString pCondit,NNumber pMaxWait,NNumber pWaitFactor,Ref<NString> pReturnStatus,Ref<NString> pResponse) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.P_HANDSHAKE_MSG_FRAGMENTS_DEQ1", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_QUEUE_NAME", pQueueName);
			cmd.addParameter("@P_CONDIT", pCondit);
			cmd.addParameter("@P_MAX_WAIT", pMaxWait);
			cmd.addParameter("@P_WAIT_FACTOR", pWaitFactor);
			cmd.addParameter("@P_RETURN_STATUS", NString.class);
			cmd.addParameter("@P_RESPONSE", NString.class);
				
			cmd.execute();
			pReturnStatus.val = cmd.getParameterValue("@P_RETURN_STATUS", NString.class);
			pResponse.val = cmd.getParameterValue("@P_RESPONSE", NString.class);


		}
		
		public static void pHandshakeMsgFragmentsEnq(NString pQueueName,Ref<NString> pReturnStatus,NString pMfMisc01,Object pMf01, Object pMf02, Object pMf03, Object pMf04, Object pMf05, Object pMf06, Object pMf07, Object pMf08, Object pMf09, Object pMf10) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.P_HANDSHAKE_MSG_FRAGMENTS_ENQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_QUEUE_NAME", pQueueName);
			cmd.addParameter("@P_RETURN_STATUS", NString.class);
			cmd.addParameter("@P_MF_MISC_01", pMfMisc01);
			cmd.addParameter("@P_MF_01", pMf01);
			cmd.addParameter("@P_MF_02", pMf02);
			cmd.addParameter("@P_MF_03", pMf03);
			cmd.addParameter("@P_MF_04", pMf04);
			cmd.addParameter("@P_MF_05", pMf05);
			cmd.addParameter("@P_MF_06", pMf06);
			cmd.addParameter("@P_MF_07", pMf07);
			cmd.addParameter("@P_MF_08", pMf08);
			cmd.addParameter("@P_MF_09", pMf09);
			cmd.addParameter("@P_MF_10", pMf10);
				
			cmd.execute();
			pReturnStatus.val = cmd.getParameterValue("@P_RETURN_STATUS", NString.class);


		}
		
		public static void pPurgeEntireQueue(NString pQueueName,NNumber pItemsInQueue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.P_PURGE_ENTIRE_QUEUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_QUEUE_NAME", pQueueName);
			cmd.addParameter("@P_ITEMS_IN_QUEUE", pItemsInQueue);
				
			cmd.execute();


		}
		
		public static void pPurgeMessages(NString pQueue,NString pSubscriber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.P_PURGE_MESSAGES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_QUEUE", pQueue);
			cmd.addParameter("@P_SUBSCRIBER", pSubscriber);
				
			cmd.execute();


		}
		
		public static void pRemoveSubscriber(NString pQueueName,NString pSubscriberName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.P_REMOVE_SUBSCRIBER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_QUEUE_NAME", pQueueName);
			cmd.addParameter("@P_SUBSCRIBER_NAME", pSubscriberName);
				
			cmd.execute();


		}
		
		public static void pRestartQueue(NString pQueueName,NBool pWait) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_ADVQ_UTIL.P_RESTART_QUEUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_QUEUE_NAME", pQueueName);
			cmd.addParameter("@P_WAIT", pWait);
				
			cmd.execute();


		}
		
	
	
	
}
