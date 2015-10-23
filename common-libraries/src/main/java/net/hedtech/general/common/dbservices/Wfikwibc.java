package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Wfikwibc {
		public static void declareWorkComplete(NString wfUrl,NString proxyUrl,NString workId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WFIKWIBC.DECLARE_WORK_COMPLETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WF_URL", wfUrl);
			cmd.addParameter("@PROXY_URL", proxyUrl);
			cmd.addParameter("@WORK_ID", workId);
				
			cmd.execute();


		}
		
		public static NString FexecuteWorkflowCommand(NString cmdText,NString wfUrl,NString proxyUrl,NNumber retry,NString workitem,NString clientid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WFIKWIBC.EXECUTE_WORKFLOW_COMMAND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CMD", cmdText);
			cmd.addParameter("@WF_URL", wfUrl);
			cmd.addParameter("@PROXY_URL", proxyUrl);
			cmd.addParameter("@RETRY", retry);
			cmd.addParameter("@WORKITEM", workitem);
			cmd.addParameter("@CLIENTID", clientid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void getWorkParameters(NString wfUrl,NString proxyUrl,NString clientIdArg,NString workIdArg,Ref<NString> parameternames,Ref<NString> parameternamesvalues) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WFIKWIBC.GET_WORK_PARAMETERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WF_URL", wfUrl);
			cmd.addParameter("@PROXY_URL", proxyUrl);
			cmd.addParameter("@CLIENT_ID_ARG", clientIdArg);
			cmd.addParameter("@WORK_ID_ARG", workIdArg);
			cmd.addParameter("@PARAMETERNAMES", NString.class);
			cmd.addParameter("@PARAMETERNAMESVALUES", NString.class);
				
			cmd.execute();
			parameternames.val = cmd.getParameterValue("@PARAMETERNAMES", NString.class);
			parameternamesvalues.val = cmd.getParameterValue("@PARAMETERNAMESVALUES", NString.class);


		}
		
		public static void getWorkitemQueue(NString clientIdVar,Ref<NString> workitemidVar,Ref<NString> objectNameVar,Ref<NString> activityNameVar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WFIKWIBC.GET_WORKITEM_QUEUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CLIENT_ID_VAR", clientIdVar);
			cmd.addParameter("@WORKITEMID_VAR", NString.class);
			cmd.addParameter("@OBJECT_NAME_VAR", NString.class);
			cmd.addParameter("@ACTIVITY_NAME_VAR", NString.class);
				
			cmd.execute();
			workitemidVar.val = cmd.getParameterValue("@WORKITEMID_VAR", NString.class);
			objectNameVar.val = cmd.getParameterValue("@OBJECT_NAME_VAR", NString.class);
			activityNameVar.val = cmd.getParameterValue("@ACTIVITY_NAME_VAR", NString.class);


		}
		
		public static void getWorkitemQueue(NString clientIdVar,Ref<NString> vpdiCode,Ref<NString> workitemidVar,Ref<NString> objectNameVar,Ref<NString> activityNameVar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WFIKWIBC.GET_WORKITEM_QUEUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CLIENT_ID_VAR", clientIdVar);
			cmd.addParameter("@VPDI_CODE", NString.class);
			cmd.addParameter("@WORKITEMID_VAR", NString.class);
			cmd.addParameter("@OBJECT_NAME_VAR", NString.class);
			cmd.addParameter("@ACTIVITY_NAME_VAR", NString.class);
				
			cmd.execute();
			vpdiCode.val = cmd.getParameterValue("@VPDI_CODE", NString.class);
			workitemidVar.val = cmd.getParameterValue("@WORKITEMID_VAR", NString.class);
			objectNameVar.val = cmd.getParameterValue("@OBJECT_NAME_VAR", NString.class);
			activityNameVar.val = cmd.getParameterValue("@ACTIVITY_NAME_VAR", NString.class);


		}
		
		public static NString FhttpRequestRetry(NString url,NString proxyUrl,NNumber retry) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WFIKWIBC.HTTP_REQUEST_RETRY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@URL", url);
			cmd.addParameter("@PROXY_URL", proxyUrl);
			cmd.addParameter("@RETRY", retry);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FisBannerClientAlive(NString clientIdVar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WFIKWIBC.IS_BANNER_CLIENT_ALIVE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@CLIENT_ID_VAR", clientIdVar);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void purgeOutdatedClientSessions() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WFIKWIBC.PURGE_OUTDATED_CLIENT_SESSIONS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void releaseWork(NString wfUrl,NString proxyUrl,NString workId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WFIKWIBC.RELEASE_WORK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WF_URL", wfUrl);
			cmd.addParameter("@PROXY_URL", proxyUrl);
			cmd.addParameter("@WORK_ID", workId);
				
			cmd.execute();


		}
		
		public static void sendUserInfo(NString clientid,NString logon,NString credential,NNumber expiration,NString encryptionKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WFIKWIBC.SEND_USER_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CLIENTID", clientid);
			cmd.addParameter("@LOGON", logon);
			cmd.addParameter("@CREDENTIAL", credential);
			cmd.addParameter("@EXPIRATION", expiration);
			cmd.addParameter("@ENCRYPTION_KEY", encryptionKey);
				
			cmd.execute();


		}
		
		public static void setWorkParameters(NString wfUrl,NString proxyUrl,NString clientIdArg,NString workIdArg,NString nameValueStringArg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WFIKWIBC.SET_WORK_PARAMETERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WF_URL", wfUrl);
			cmd.addParameter("@PROXY_URL", proxyUrl);
			cmd.addParameter("@CLIENT_ID_ARG", clientIdArg);
			cmd.addParameter("@WORK_ID_ARG", workIdArg);
			cmd.addParameter("@NAME_VALUE_STRING_ARG", nameValueStringArg);
				
			cmd.execute();


		}
		
		public static void setWorkitemQueue(NString clientIdVar,NString workitemidVar,NString objectNameVar,NString activityNameVar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WFIKWIBC.SET_WORKITEM_QUEUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CLIENT_ID_VAR", clientIdVar);
			cmd.addParameter("@WORKITEMID_VAR", workitemidVar);
			cmd.addParameter("@OBJECT_NAME_VAR", objectNameVar);
			cmd.addParameter("@ACTIVITY_NAME_VAR", activityNameVar);
				
			cmd.execute();


		}
		
		public static void updateClientId(NString clientIdVar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WFIKWIBC.UPDATE_CLIENT_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CLIENT_ID_VAR", clientIdVar);
				
			cmd.execute();


		}
		
	
	
	
}
