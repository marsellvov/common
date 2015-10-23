package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rokadvq {
		public static NNumber fGetIdlewait(NString pJobName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKADVQ.F_GET_IDLEWAIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_JOB_NAME", pJobName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fUseAqAndNotPipes(NString pJobName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKADVQ.F_USE_AQ_AND_NOT_PIPES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_JOB_NAME", pJobName);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pInit(NString pJobName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKADVQ.P_INIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_NAME", pJobName);
				
			cmd.execute();


		}
		
		public static void pQueueExitCommandWait(NString pJobName,NNumber pMaxWait) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKADVQ.P_QUEUE_EXIT_COMMAND_WAIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_NAME", pJobName);
			cmd.addParameter("@P_MAX_WAIT", pMaxWait);
				
			cmd.execute();


		}
		
		public static void pQueueRunJobWait(NString pJobName,NString pCommand,NString pUserName,NString pPassword,NNumber pOneUpNo,NString pProcessToDbInd,NNumber pMaxWait,Ref<NString> pCallResult,Ref<NString> pLogResult,Ref<NString> pFileName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKADVQ.P_QUEUE_RUN_JOB_WAIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_NAME", pJobName);
			cmd.addParameter("@P_COMMAND", pCommand);
			cmd.addParameter("@P_USER_NAME", pUserName);
			cmd.addParameter("@P_PASSWORD", pPassword);
			cmd.addParameter("@P_ONE_UP_NO", pOneUpNo);
			cmd.addParameter("@P_PROCESS_TO_DB_IND", pProcessToDbInd);
			cmd.addParameter("@P_MAX_WAIT", pMaxWait);
			cmd.addParameter("@P_CALL_RESULT", NString.class);
			cmd.addParameter("@P_LOG_RESULT", NString.class);
			cmd.addParameter("@P_FILE_NAME", NString.class);
				
			cmd.execute();
			pCallResult.val = cmd.getParameterValue("@P_CALL_RESULT", NString.class);
			pLogResult.val = cmd.getParameterValue("@P_LOG_RESULT", NString.class);
			pFileName.val = cmd.getParameterValue("@P_FILE_NAME", NString.class);


		}
		
		public static void pQueueWaitForCommand(NString pJobName,NNumber pMaxWait,Ref<NString> pCommand,Ref<NString> pUserName,Ref<NString> pPassword,Ref<NString> pOneUpNo,Ref<NString> pJobNameOut,Ref<NString> pProcessToDbInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKADVQ.P_QUEUE_WAIT_FOR_COMMAND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_NAME", pJobName);
			cmd.addParameter("@P_MAX_WAIT", pMaxWait);
			cmd.addParameter("@P_COMMAND", NString.class);
			cmd.addParameter("@P_USER_NAME", NString.class);
			cmd.addParameter("@P_PASSWORD", NString.class);
			cmd.addParameter("@P_ONE_UP_NO", NString.class);
			cmd.addParameter("@P_JOB_NAME_OUT", NString.class);
			cmd.addParameter("@P_PROCESS_TO_DB_IND", NString.class);
				
			cmd.execute();
			pCommand.val = cmd.getParameterValue("@P_COMMAND", NString.class);
			pUserName.val = cmd.getParameterValue("@P_USER_NAME", NString.class);
			pPassword.val = cmd.getParameterValue("@P_PASSWORD", NString.class);
			pOneUpNo.val = cmd.getParameterValue("@P_ONE_UP_NO", NString.class);
			pJobNameOut.val = cmd.getParameterValue("@P_JOB_NAME_OUT", NString.class);
			pProcessToDbInd.val = cmd.getParameterValue("@P_PROCESS_TO_DB_IND", NString.class);


		}
		
		public static void pRtnQueueExitCommandAck(NString pJobName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKADVQ.P_RTN_QUEUE_EXIT_COMMAND_ACK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_NAME", pJobName);
				
			cmd.execute();


		}
		
		public static void pRtnQueueSendResults(NString pJobName,NNumber pOneUpNo,NString pCallResult,NString pWriteResult,NString pFileName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKADVQ.P_RTN_QUEUE_SEND_RESULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_NAME", pJobName);
			cmd.addParameter("@P_ONE_UP_NO", pOneUpNo);
			cmd.addParameter("@P_CALL_RESULT", pCallResult);
			cmd.addParameter("@P_WRITE_RESULT", pWriteResult);
			cmd.addParameter("@P_FILE_NAME", pFileName);
				
			cmd.execute();


		}
		
	
	
	
}
