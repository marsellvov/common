package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Roksapr {
		public static NBool fChkGurmailDups(NString letterIn,NString effTerm,NNumber pidm,Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSAPR.F_CHK_GURMAIL_DUPS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@LETTER_IN", letterIn);
			cmd.addParameter("@EFF_TERM", effTerm);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@ERROR_MSG", errorMsg, true);
				
			cmd.execute();
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fChkGurmailDupsByAidy(NString pLetrCodeIn,NString pAidyCodeIn,NNumber pPidmIn,NDate pPrintedDateIn,NString pRowidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSAPR.F_CHK_GURMAIL_DUPS_BY_AIDY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LETR_CODE_IN", pLetrCodeIn);
			cmd.addParameter("@P_AIDY_CODE_IN", pAidyCodeIn);
			cmd.addParameter("@P_PIDM_IN", pPidmIn);
			cmd.addParameter("@P_PRINTED_DATE_IN", pPrintedDateIn);
			cmd.addParameter("@P_ROWID_IN", pRowidIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetDefaultSaprCode(NString pAidy) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSAPR.F_GET_DEFAULT_SAPR_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY", pAidy);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetGjbprunParms(NString jobName,NNumber oneUp,NString parmNo,Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSAPR.F_GET_GJBPRUN_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@JOB_NAME", jobName);
			cmd.addParameter("@ONE_UP", oneUp);
			cmd.addParameter("@PARM_NO", parmNo);
			cmd.addParameter("@ERROR_MSG", errorMsg, true);
				
			cmd.execute();
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPrevSapCode(NNumber pidm,NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSAPR.F_GET_PREV_SAP_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPrevSapTerm(NNumber pidm,NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSAPR.F_GET_PREV_SAP_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSpridenPidm(NString idIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSAPR.F_GET_SPRIDEN_PIDM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ID_IN", idIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAddLetter(NNumber pidm,NString userId,NString preSap,NString calcSap,NString newSap,Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSAPR.P_ADD_LETTER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@PRE_SAP", preSap);
			cmd.addParameter("@CALC_SAP", calcSap);
			cmd.addParameter("@NEW_SAP", newSap);
			cmd.addParameter("@ERROR_MSG", errorMsg, true);
				
			cmd.execute();
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);


		}
		
		public static void pAddResult(NString job,NNumber oneUp,NString user,NString statusInd,Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSAPR.P_ADD_RESULT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOB", job);
			cmd.addParameter("@ONE_UP", oneUp);
			cmd.addParameter("@USER", user);
			cmd.addParameter("@STATUS_IND", statusInd);
			cmd.addParameter("@ERROR_MSG", errorMsg, true);
				
			cmd.execute();
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);


		}
		
		public static void pAddRorsapr(NNumber pidm,NString term,NString ruleIn,NString userId,NString aidy,Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSAPR.P_ADD_RORSAPR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@RULE_IN", ruleIn);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@AIDY", aidy);
			cmd.addParameter("@ERROR_MSG", errorMsg, true);
				
			cmd.execute();
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);


		}
		
		public static void pAllRorstatForTerm(NString job,NNumber oneUp,NString userId,Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSAPR.P_ALL_RORSTAT_FOR_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOB", job);
			cmd.addParameter("@ONE_UP", oneUp);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@ERROR_MSG", errorMsg, true);
				
			cmd.execute();
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);


		}
		
		public static void pAllSfbetrmForTerm(NString job,NNumber oneUp,NString userId,Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSAPR.P_ALL_SFBETRM_FOR_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOB", job);
			cmd.addParameter("@ONE_UP", oneUp);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@ERROR_MSG", errorMsg, true);
				
			cmd.execute();
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);


		}
		
		public static void pExeRobbgrp(NString job,NNumber oneUp,NString userId,Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSAPR.P_EXE_ROBBGRP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOB", job);
			cmd.addParameter("@ONE_UP", oneUp);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@ERROR_MSG", errorMsg, true);
				
			cmd.execute();
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);


		}
		
		public static void pExeRooauto(NString job,NNumber oneUp,NString userId,Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSAPR.P_EXE_ROOAUTO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOB", job);
			cmd.addParameter("@ONE_UP", oneUp);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@ERROR_MSG", errorMsg, true);
				
			cmd.execute();
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);


		}
		
		public static void pFetchJobParms(NString job,NNumber oneUp,Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSAPR.P_FETCH_JOB_PARMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOB", job);
			cmd.addParameter("@ONE_UP", oneUp);
			cmd.addParameter("@ERROR_MSG", errorMsg, true);
				
			cmd.execute();
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);


		}
		
		public static void pFireTheRule(NString ruleTerm,NString ruleAidy,NNumber rulePidm,Ref<NBool> ruleIn,Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSAPR.P_FIRE_THE_RULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@RULE_TERM", ruleTerm);
			cmd.addParameter("@RULE_AIDY", ruleAidy);
			cmd.addParameter("@RULE_PIDM", rulePidm);
			cmd.addParameter("@RULE_IN", ruleIn, true);
			cmd.addParameter("@ERROR_MSG", errorMsg, true);
				
			cmd.execute();
			ruleIn.val = cmd.getParameterValue("@RULE_IN", NBool.class);
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);


		}
		
		public static void pStartSap(NString jobName,NNumber oneUpNo,NString user,Ref<NString> sapErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSAPR.P_START_SAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOB_NAME", jobName);
			cmd.addParameter("@ONE_UP_NO", oneUpNo);
			cmd.addParameter("@USER", user);
			cmd.addParameter("@SAP_ERROR_MSG", sapErrorMsg, true);
				
			cmd.execute();
			sapErrorMsg.val = cmd.getParameterValue("@SAP_ERROR_MSG", NString.class);


		}
		
		public static void pTranslateRule(NNumber pidm,NString currTerm,NString currSap,NString userId,Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ROKSAPR.P_TRANSLATE_RULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@CURR_TERM", currTerm);
			cmd.addParameter("@CURR_SAP", currSap);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@ERROR_MSG", errorMsg, true);
				
			cmd.execute();
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);


		}
		
	
	
	
}
