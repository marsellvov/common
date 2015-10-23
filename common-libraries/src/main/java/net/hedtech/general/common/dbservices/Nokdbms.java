package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokdbms {
		public static void applicationInfoReadModule(Ref<NString> pModuleName,Ref<NString> pActionName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.APPLICATION_INFO_READ_MODULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MODULE_NAME", NString.class);
			cmd.addParameter("@P_ACTION_NAME", NString.class);
				
			cmd.execute();
			pModuleName.val = cmd.getParameterValue("@P_MODULE_NAME", NString.class);
			pActionName.val = cmd.getParameterValue("@P_ACTION_NAME", NString.class);


		}
		
		public static void dynamicSql(NString pSqlStmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.DYNAMIC_SQL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQL_STMT", pSqlStmt);
				
			cmd.execute();


		}
		
		public static void dynamicSql(NString pSqlStmt,Ref<NString> pReturnValue1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.DYNAMIC_SQL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQL_STMT", pSqlStmt);
			cmd.addParameter("@P_RETURN_VALUE1", NString.class);
				
			cmd.execute();
			pReturnValue1.val = cmd.getParameterValue("@P_RETURN_VALUE1", NString.class);


		}
		
		public static void dynamicSql(NString pSqlStmt,Ref<NString> pReturnValue1,Ref<NString> pReturnValue2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.DYNAMIC_SQL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQL_STMT", pSqlStmt);
			cmd.addParameter("@P_RETURN_VALUE1", NString.class);
			cmd.addParameter("@P_RETURN_VALUE2", NString.class);
				
			cmd.execute();
			pReturnValue1.val = cmd.getParameterValue("@P_RETURN_VALUE1", NString.class);
			pReturnValue2.val = cmd.getParameterValue("@P_RETURN_VALUE2", NString.class);


		}
		
		public static void dynamicSql(NString pSqlStmt,Ref<NString> pReturnValue1,Ref<NString> pReturnValue2,Ref<NString> pReturnValue3) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.DYNAMIC_SQL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQL_STMT", pSqlStmt);
			cmd.addParameter("@P_RETURN_VALUE1", NString.class);
			cmd.addParameter("@P_RETURN_VALUE2", NString.class);
			cmd.addParameter("@P_RETURN_VALUE3", NString.class);
				
			cmd.execute();
			pReturnValue1.val = cmd.getParameterValue("@P_RETURN_VALUE1", NString.class);
			pReturnValue2.val = cmd.getParameterValue("@P_RETURN_VALUE2", NString.class);
			pReturnValue3.val = cmd.getParameterValue("@P_RETURN_VALUE3", NString.class);


		}
		
		public static void dynamicSql(NString pSqlStmt,Ref<NString> pReturnValue1,Ref<NString> pReturnValue2,Ref<NString> pReturnValue3,Ref<NString> pReturnValue4) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.DYNAMIC_SQL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQL_STMT", pSqlStmt);
			cmd.addParameter("@P_RETURN_VALUE1", NString.class);
			cmd.addParameter("@P_RETURN_VALUE2", NString.class);
			cmd.addParameter("@P_RETURN_VALUE3", NString.class);
			cmd.addParameter("@P_RETURN_VALUE4", NString.class);
				
			cmd.execute();
			pReturnValue1.val = cmd.getParameterValue("@P_RETURN_VALUE1", NString.class);
			pReturnValue2.val = cmd.getParameterValue("@P_RETURN_VALUE2", NString.class);
			pReturnValue3.val = cmd.getParameterValue("@P_RETURN_VALUE3", NString.class);
			pReturnValue4.val = cmd.getParameterValue("@P_RETURN_VALUE4", NString.class);


		}
		
		public static void dynamicSqlBind(NString pSqlStmt,Ref<NString> pReturnValue1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.DYNAMIC_SQL_BIND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQL_STMT", pSqlStmt);
			cmd.addParameter("@P_RETURN_VALUE1", NString.class);
				
			cmd.execute();
			pReturnValue1.val = cmd.getParameterValue("@P_RETURN_VALUE1", NString.class);


		}
		
		public static void dynamicSqlBind(NString pSqlStmt,Ref<NString> pReturnValue1,Ref<NString> pReturnValue2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.DYNAMIC_SQL_BIND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQL_STMT", pSqlStmt);
			cmd.addParameter("@P_RETURN_VALUE1", NString.class);
			cmd.addParameter("@P_RETURN_VALUE2", NString.class);
				
			cmd.execute();
			pReturnValue1.val = cmd.getParameterValue("@P_RETURN_VALUE1", NString.class);
			pReturnValue2.val = cmd.getParameterValue("@P_RETURN_VALUE2", NString.class);


		}
		
		public static void dynamicSqlBind(NString pSqlStmt,Ref<NString> pReturnValue1,Ref<NString> pReturnValue2,Ref<NString> pReturnValue3) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.DYNAMIC_SQL_BIND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQL_STMT", pSqlStmt);
			cmd.addParameter("@P_RETURN_VALUE1", NString.class);
			cmd.addParameter("@P_RETURN_VALUE2", NString.class);
			cmd.addParameter("@P_RETURN_VALUE3", NString.class);
				
			cmd.execute();
			pReturnValue1.val = cmd.getParameterValue("@P_RETURN_VALUE1", NString.class);
			pReturnValue2.val = cmd.getParameterValue("@P_RETURN_VALUE2", NString.class);
			pReturnValue3.val = cmd.getParameterValue("@P_RETURN_VALUE3", NString.class);


		}
		
		public static void dynamicSqlBind(NString pSqlStmt,Ref<NString> pReturnValue1,Ref<NString> pReturnValue2,Ref<NString> pReturnValue3,Ref<NString> pReturnValue4) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.DYNAMIC_SQL_BIND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQL_STMT", pSqlStmt);
			cmd.addParameter("@P_RETURN_VALUE1", NString.class);
			cmd.addParameter("@P_RETURN_VALUE2", NString.class);
			cmd.addParameter("@P_RETURN_VALUE3", NString.class);
			cmd.addParameter("@P_RETURN_VALUE4", NString.class);
				
			cmd.execute();
			pReturnValue1.val = cmd.getParameterValue("@P_RETURN_VALUE1", NString.class);
			pReturnValue2.val = cmd.getParameterValue("@P_RETURN_VALUE2", NString.class);
			pReturnValue3.val = cmd.getParameterValue("@P_RETURN_VALUE3", NString.class);
			pReturnValue4.val = cmd.getParameterValue("@P_RETURN_VALUE4", NString.class);


		}
		
		public static NString FlobSubstr(NString pLobLocator,NNumber pStrLength,NNumber pStrPosition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.LOB_SUBSTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LOB_LOCATOR", pLobLocator);
			cmd.addParameter("@P_STR_LENGTH", pStrLength);
			cmd.addParameter("@P_STR_POSITION", pStrPosition);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void lockSleep(NNumber pSeconds) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.LOCK_SLEEP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SECONDS", pSeconds);
				
			cmd.execute();


		}
		
		public static void pWebaccessdate(NNumber pidmIn,Ref<NDate> dateOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.P_WEBACCESSDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@DATE_OUT", dateOut, true);
				
			cmd.execute();
			dateOut.val = cmd.getParameterValue("@DATE_OUT", NDate.class);


		}
		
		public static NNumber FpipeCreatePipe(NString pPipename,NNumber pMaxpipesize,NBool pPrivate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.PIPE_CREATE_PIPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIPENAME", pPipename);
			cmd.addParameter("@P_MAXPIPESIZE", pMaxpipesize);
			cmd.addParameter("@P_PRIVATE", pPrivate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FpipeNextItemType() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.PIPE_NEXT_ITEM_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pipePackMessage(NString pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.PIPE_PACK_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ITEM", pItem);
				
			cmd.execute();


		}
		
		public static void pipePurge(NString pPipename) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.PIPE_PURGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIPENAME", pPipename);
				
			cmd.execute();


		}
		
		public static NNumber FpipeReceiveMessage(NString pPipename,NNumber pTimeout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.PIPE_RECEIVE_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIPENAME", pPipename);
			cmd.addParameter("@P_TIMEOUT", pTimeout);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FpipeRemovePipe(NString pPipename) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.PIPE_REMOVE_PIPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIPENAME", pPipename);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pipeResetBuffer() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.PIPE_RESET_BUFFER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NNumber FpipeSendMessage(NString pPipename,NNumber pTimeout,NNumber pMaxpipesize) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.PIPE_SEND_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIPENAME", pPipename);
			cmd.addParameter("@P_TIMEOUT", pTimeout);
			cmd.addParameter("@P_MAXPIPESIZE", pMaxpipesize);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FpipeUniqueSessionName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.PIPE_UNIQUE_SESSION_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pipeUnpackMessage(Ref<NString> pItem) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.PIPE_UNPACK_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ITEM", NString.class);
				
			cmd.execute();
			pItem.val = cmd.getParameterValue("@P_ITEM", NString.class);


		}
		
		public static NInteger FprofilerFlushData() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.PROFILER_FLUSH_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger FprofilerStartProfiler(NString pRunComment1,NString pRunComment2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.PROFILER_START_PROFILER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
			cmd.addParameter("@P_RUN_COMMENT1", pRunComment1);
			cmd.addParameter("@P_RUN_COMMENT2", pRunComment2);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger FprofilerStopProfiler() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.PROFILER_STOP_PROFILER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NInteger FrandomNumber() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.RANDOM_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString FurlEscape(NString pUrl) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.URL_ESCAPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_URL", pUrl);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FutilityGetTime() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKDBMS.UTILITY_GET_TIME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
