package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rnknana {
		public static NString fEfcValuesIsLocked(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNANA.F_EFC_VALUES_IS_LOCKED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDataAvail(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNANA.F_GET_DATA_AVAIL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDeleteRptPopsel(NNumber pOneUp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNANA.P_DELETE_RPT_POPSEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ONE_UP", pOneUp);
				
			cmd.execute();


		}
		
		public static void pGetProcessRunStatus(NString pAidyCode,NNumber pPidm,Ref<NString> pRunFm,Ref<NString> pRunIm,Ref<NString> pRunReport,Ref<NString> pErrorInd,Ref<NString> pErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNANA.P_GET_PROCESS_RUN_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_FM", NString.class);
			cmd.addParameter("@P_RUN_IM", NString.class);
			cmd.addParameter("@P_RUN_REPORT", NString.class);
			cmd.addParameter("@P_ERROR_IND", NString.class);
			cmd.addParameter("@P_ERROR_MSG", NString.class);
				
			cmd.execute();
			pRunFm.val = cmd.getParameterValue("@P_RUN_FM", NString.class);
			pRunIm.val = cmd.getParameterValue("@P_RUN_IM", NString.class);
			pRunReport.val = cmd.getParameterValue("@P_RUN_REPORT", NString.class);
			pErrorInd.val = cmd.getParameterValue("@P_ERROR_IND", NString.class);
			pErrorMsg.val = cmd.getParameterValue("@P_ERROR_MSG", NString.class);


		}
		
		public static void pGetRptPopselParameters(NString pJobName,NNumber pOneUp,Ref<NString> pRptApplication,Ref<NString> pRptSelection,Ref<NString> pRptCreator,Ref<NString> pRptUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNANA.P_GET_RPT_POPSEL_PARAMETERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_NAME", pJobName);
			cmd.addParameter("@P_ONE_UP", pOneUp);
			cmd.addParameter("@P_RPT_APPLICATION", NString.class);
			cmd.addParameter("@P_RPT_SELECTION", NString.class);
			cmd.addParameter("@P_RPT_CREATOR", NString.class);
			cmd.addParameter("@P_RPT_USER", NString.class);
				
			cmd.execute();
			pRptApplication.val = cmd.getParameterValue("@P_RPT_APPLICATION", NString.class);
			pRptSelection.val = cmd.getParameterValue("@P_RPT_SELECTION", NString.class);
			pRptCreator.val = cmd.getParameterValue("@P_RPT_CREATOR", NString.class);
			pRptUser.val = cmd.getParameterValue("@P_RPT_USER", NString.class);


		}
		
		public static void pInsertRptPopsel(NString pAidycode,NString pProcessind,NString pStudentid,NString pApplication,NString pSelection,NString pCreator,NString pUser,NNumber pOneUp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNANA.P_INSERT_RPT_POPSEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDYCODE", pAidycode);
			cmd.addParameter("@P_PROCESSIND", pProcessind);
			cmd.addParameter("@P_STUDENTID", pStudentid);
			cmd.addParameter("@P_APPLICATION", pApplication);
			cmd.addParameter("@P_SELECTION", pSelection);
			cmd.addParameter("@P_CREATOR", pCreator);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_ONE_UP", pOneUp);
				
			cmd.execute();


		}
		
		public static void pReturnAq(NString pJobName,NString pOneUpNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNANA.P_RETURN_AQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_NAME", pJobName);
			cmd.addParameter("@P_ONE_UP_NO", pOneUpNo);
				
			cmd.execute();


		}
		
		public static void pSetImNull(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNANA.P_SET_IM_NULL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pStartAq(NString pJobName,Ref<NString> pCommand,Ref<NString> pUserName,Ref<NString> pPassword,Ref<NString> pOneUpNo,Ref<NString> pJobNameOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNANA.P_START_AQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOB_NAME", pJobName);
			cmd.addParameter("@P_COMMAND", NString.class);
			cmd.addParameter("@P_USER_NAME", NString.class);
			cmd.addParameter("@P_PASSWORD", NString.class);
			cmd.addParameter("@P_ONE_UP_NO", NString.class);
			cmd.addParameter("@P_JOB_NAME_OUT", NString.class);
				
			cmd.execute();
			pCommand.val = cmd.getParameterValue("@P_COMMAND", NString.class);
			pUserName.val = cmd.getParameterValue("@P_USER_NAME", NString.class);
			pPassword.val = cmd.getParameterValue("@P_PASSWORD", NString.class);
			pOneUpNo.val = cmd.getParameterValue("@P_ONE_UP_NO", NString.class);
			pJobNameOut.val = cmd.getParameterValue("@P_JOB_NAME_OUT", NString.class);


		}
		
	
	
	
}
