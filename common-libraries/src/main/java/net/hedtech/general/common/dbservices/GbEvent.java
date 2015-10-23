package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbEvent {
		public static NBool fEntityPublishable(NString pSourceInd,NString pEntityName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EVENT.F_ENTITY_PUBLISHABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_SOURCE_IND", pSourceInd);
			cmd.addParameter("@P_ENTITY_NAME", pEntityName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fMessagingEnabled(NString pSourceInd,NString pEntityName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EVENT.F_MESSAGING_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_SOURCE_IND", pSourceInd);
			cmd.addParameter("@P_ENTITY_NAME", pEntityName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pAddParameter(NString pName,NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EVENT.P_ADD_PARAMETER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();


		}
		
		public static void pAddParameter(NString pName,NDate pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EVENT.P_ADD_PARAMETER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();


		}
		
		public static void pAddParameter(NString pName,NNumber pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EVENT.P_ADD_PARAMETER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();


		}
		
		public static void pDisableSyncPublisher() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EVENT.P_DISABLE_SYNC_PUBLISHER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDiscard() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EVENT.P_DISCARD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pEnableSyncPublisher() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EVENT.P_ENABLE_SYNC_PUBLISHER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pEnableSyncPublisher(NString pTestSuiteName,NString pTestSeriesNumber,NString pTestCaseNumber,NString pTestStepNumber,NString pTestMessageRelease) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EVENT.P_ENABLE_SYNC_PUBLISHER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TEST_SUITE_NAME", pTestSuiteName);
			cmd.addParameter("@P_TEST_SERIES_NUMBER", pTestSeriesNumber);
			cmd.addParameter("@P_TEST_CASE_NUMBER", pTestCaseNumber);
			cmd.addParameter("@P_TEST_STEP_NUMBER", pTestStepNumber);
			cmd.addParameter("@P_TEST_MESSAGE_RELEASE", pTestMessageRelease);
				
			cmd.execute();


		}
		
		public static void pPublish() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EVENT.P_PUBLISH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NString pEntityName,NNumber pOperationType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EVENT.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ENTITY_NAME", pEntityName);
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
				
			cmd.execute();


		}
		
		public static void pSetBulksyncCode(NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EVENT.P_SET_BULKSYNC_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();


		}
		
	
	
	
}
