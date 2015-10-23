package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gkkwins {
		public static NBool fExecWebsProcess(NString pProcessCode,Ref<NString> pMessageOut,Ref<NNumber> pRunSeq,NString pRunNowFlag,NInteger pDiagnosticSeverity) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINS.F_EXEC_WEBS_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_PROCESS_CODE", pProcessCode);
			cmd.addParameter("@P_MESSAGE_OUT", NString.class);
			cmd.addParameter("@P_RUN_SEQ", NNumber.class);
			cmd.addParameter("@P_RUN_NOW_FLAG", pRunNowFlag);
			cmd.addParameter("@P_DIAGNOSTIC_SEVERITY", pDiagnosticSeverity);
				
			cmd.execute();
			pMessageOut.val = cmd.getParameterValue("@P_MESSAGE_OUT", NString.class);
			pRunSeq.val = cmd.getParameterValue("@P_RUN_SEQ", NNumber.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fExportWebsProcess(NString pProcessCode,NString pReleaseYear,NString pDirectory,Ref<NString> pMessageOut,NString pProcessCodeNew) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINS.F_EXPORT_WEBS_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_PROCESS_CODE", pProcessCode);
			cmd.addParameter("@P_RELEASE_YEAR", pReleaseYear);
			cmd.addParameter("@P_DIRECTORY", pDirectory);
			cmd.addParameter("@P_MESSAGE_OUT", NString.class);
			cmd.addParameter("@P_PROCESS_CODE_NEW", pProcessCodeNew);
				
			cmd.execute();
			pMessageOut.val = cmd.getParameterValue("@P_MESSAGE_OUT", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fGetDynParam(NInteger pParamRowIndex,NNumber pParamColIndex) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINS.F_GET_DYN_PARAM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PARAM_ROW_INDEX", pParamRowIndex);
			cmd.addParameter("@P_PARAM_COL_INDEX", pParamColIndex);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDynParamCurrRowKey() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINS.F_GET_DYN_PARAM_CURR_ROW_KEY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetDynParamIdx(NString pWsprCode,NNumber pWsopId,NString pWsmpName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINS.F_GET_DYN_PARAM_IDX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_WSPR_CODE", pWsprCode);
			cmd.addParameter("@P_WSOP_ID", pWsopId);
			cmd.addParameter("@P_WSMP_NAME", pWsmpName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NBool fGetIterateFlag() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINS.F_GET_ITERATE_FLAG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fGetIterativeParam(NNumber pParamIndex) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINS.F_GET_ITERATIVE_PARAM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PARAM_INDEX", pParamIndex);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetLogRunSeq() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINS.F_GET_LOG_RUN_SEQ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetOperationId() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINS.F_GET_OPERATION_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetWebsProcessCode() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINS.F_GET_WEBS_PROCESS_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fInsertGkrwlog(NNumber pRunSeq,Ref<NNumber> pStmtSeq,NString pProcessCode,NString pLogText,NNumber pWsopId,NString pBacktrace,NString pSoapMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINS.F_INSERT_GKRWLOG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_RUN_SEQ", pRunSeq);
			cmd.addParameter("@P_STMT_SEQ", pStmtSeq, true);
			cmd.addParameter("@P_PROCESS_CODE", pProcessCode);
			cmd.addParameter("@P_LOG_TEXT", pLogText);
			cmd.addParameter("@P_WSOP_ID", pWsopId);
			cmd.addParameter("@P_BACKTRACE", pBacktrace);
			cmd.addParameter("@P_SOAP_MSG", pSoapMsg);
				
			cmd.execute();
			pStmtSeq.val = cmd.getParameterValue("@P_STMT_SEQ", NNumber.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDeleteGkrwlog(NNumber pDeleteType,NString pProcessCode,NNumber pRunSeq,Ref<NString> pErrorMsg,Ref<NNumber> pDeleteCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINS.P_DELETE_GKRWLOG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DELETE_TYPE", pDeleteType);
			cmd.addParameter("@P_PROCESS_CODE", pProcessCode);
			cmd.addParameter("@P_RUN_SEQ", pRunSeq);
			cmd.addParameter("@P_ERROR_MSG", NString.class);
			cmd.addParameter("@P_DELETE_COUNT", NNumber.class);
				
			cmd.execute();
			pErrorMsg.val = cmd.getParameterValue("@P_ERROR_MSG", NString.class);
			pDeleteCount.val = cmd.getParameterValue("@P_DELETE_COUNT", NNumber.class);


		}
		
		public static void pSetDynParam(NInteger pParamRowIndex,NNumber pParamColIndex,NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINS.P_SET_DYN_PARAM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PARAM_ROW_INDEX", pParamRowIndex);
			cmd.addParameter("@P_PARAM_COL_INDEX", pParamColIndex);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();


		}
		
		public static void pSetDynParamKey(NInteger pParamRowIndex,NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINS.P_SET_DYN_PARAM_KEY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PARAM_ROW_INDEX", pParamRowIndex);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();


		}
		
		public static void pSetIteration(NBool pIterateFlag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINS.P_SET_ITERATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ITERATE_FLAG", pIterateFlag);
				
			cmd.execute();


		}
		
		public static void pSetIterativeParam(NNumber pParamIndex,NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKWINS.P_SET_ITERATIVE_PARAM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PARAM_INDEX", pParamIndex);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();


		}
		
	
	
	
}
