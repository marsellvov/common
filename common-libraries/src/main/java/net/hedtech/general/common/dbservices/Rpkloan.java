package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rpkloan {
		public static NString fFirstTimeBorrower(NNumber pPidm,NString pAidyCode,NString pFirstPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKLOAN.F_FIRST_TIME_BORROWER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_FIRST_PERIOD", pFirstPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAddAwardRec(NString aidyCode,NNumber pidm,NString fundCode,NNumber applNo,NString defAwstCode,Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKLOAN.P_ADD_AWARD_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY_CODE", aidyCode);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@APPL_NO", applNo);
			cmd.addParameter("@DEF_AWST_CODE", defAwstCode);
			cmd.addParameter("@ERROR_MSG", errorMsg, true);
				
			cmd.execute();
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);


		}
		
		public static void pAddAwardTermRec(NString aidyCode,NNumber pidm,NString fundCode,NNumber applNo,NString defAwstCode,Ref<NString> errorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKLOAN.P_ADD_AWARD_TERM_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY_CODE", aidyCode);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@APPL_NO", applNo);
			cmd.addParameter("@DEF_AWST_CODE", defAwstCode);
			cmd.addParameter("@ERROR_MSG", errorMsg, true);
				
			cmd.execute();
			errorMsg.val = cmd.getParameterValue("@ERROR_MSG", NString.class);


		}
		
		public static void pAddLoanProcess(NString addAidyCode,NNumber addPidm,NString addFundCode,NNumber addApplNo,NString addUser,Ref<NString> addErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKLOAN.P_ADD_LOAN_PROCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ADD_AIDY_CODE", addAidyCode);
			cmd.addParameter("@ADD_PIDM", addPidm);
			cmd.addParameter("@ADD_FUND_CODE", addFundCode);
			cmd.addParameter("@ADD_APPL_NO", addApplNo);
			cmd.addParameter("@ADD_USER", addUser);
			cmd.addParameter("@ADD_ERROR_MSG", addErrorMsg, true);
				
			cmd.execute();
			addErrorMsg.val = cmd.getParameterValue("@ADD_ERROR_MSG", NString.class);


		}
		
		public static void pAddTrackingRec(NString aidyCode,NNumber pidm,NString fundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKLOAN.P_ADD_TRACKING_REC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDY_CODE", aidyCode);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@FUND_CODE", fundCode);
				
			cmd.execute();


		}
		
		public static void pCalcLoanEnrollStatus(NString pAidyCode,NString pPeriod,NNumber pPidm,NString pStdnLevlCode,NString pFundCode,Ref<NString> pEnrollStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKLOAN.P_CALC_LOAN_ENROLL_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_STDN_LEVL_CODE", pStdnLevlCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ENROLL_STATUS", NString.class);
				
			cmd.execute();
			pEnrollStatus.val = cmd.getParameterValue("@P_ENROLL_STATUS", NString.class);


		}
		
		public static void pClearAddInd(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKLOAN.P_CLEAR_ADD_IND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pUpdateYearSpec(NNumber pidm,NString fundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPKLOAN.P_UPDATE_YEAR_SPEC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@FUND_CODE", fundCode);
				
			cmd.execute();


		}
		
	
	
	
}
