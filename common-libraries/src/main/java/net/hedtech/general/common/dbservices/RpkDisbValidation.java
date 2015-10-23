package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RpkDisbValidation {
		public static void pValidateDisbursement(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NString pLoad,NString pAttendLoad,NString pPckgLoad,NString pAttendingHrInd,NString pAtrmNsldsOvrdInd,NString pLockInd,NString pCipcOverrideCode,NString pOverrideDisbRule,NString pMajrOverrideCode,Ref<NString> pFundInelBefCutOut,Ref<NString> pFundInelAftCutOut,Ref<NString> pAttendWarning59Out,Ref<NString> pAttendWarning60Out,Ref<NString> pAttendWarning61Out,Ref<NString> pPellWarning62Out) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_DISB_VALIDATION.P_VALIDATE_DISBURSEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_LOAD", pLoad);
			cmd.addParameter("@P_ATTEND_LOAD", pAttendLoad);
			cmd.addParameter("@P_PCKG_LOAD", pPckgLoad);
			cmd.addParameter("@P_ATTENDING_HR_IND", pAttendingHrInd);
			cmd.addParameter("@P_ATRM_NSLDS_OVRD_IND", pAtrmNsldsOvrdInd);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_CIPC_OVERRIDE_CODE", pCipcOverrideCode);
			cmd.addParameter("@P_OVERRIDE_DISB_RULE", pOverrideDisbRule);
			cmd.addParameter("@P_MAJR_OVERRIDE_CODE", pMajrOverrideCode);
			cmd.addParameter("@P_FUND_INEL_BEF_CUT_OUT", NString.class);
			cmd.addParameter("@P_FUND_INEL_AFT_CUT_OUT", NString.class);
			cmd.addParameter("@P_ATTEND_WARNING_59_OUT", NString.class);
			cmd.addParameter("@P_ATTEND_WARNING_60_OUT", NString.class);
			cmd.addParameter("@P_ATTEND_WARNING_61_OUT", NString.class);
			cmd.addParameter("@P_PELL_WARNING_62_OUT", NString.class);
				
			cmd.execute();
			pFundInelBefCutOut.val = cmd.getParameterValue("@P_FUND_INEL_BEF_CUT_OUT", NString.class);
			pFundInelAftCutOut.val = cmd.getParameterValue("@P_FUND_INEL_AFT_CUT_OUT", NString.class);
			pAttendWarning59Out.val = cmd.getParameterValue("@P_ATTEND_WARNING_59_OUT", NString.class);
			pAttendWarning60Out.val = cmd.getParameterValue("@P_ATTEND_WARNING_60_OUT", NString.class);
			pAttendWarning61Out.val = cmd.getParameterValue("@P_ATTEND_WARNING_61_OUT", NString.class);
			pPellWarning62Out.val = cmd.getParameterValue("@P_PELL_WARNING_62_OUT", NString.class);


		}
		
		public static void pValidateElDisbursement(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pApplNo,NString pPeriod,NDate pDisburseDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_DISB_VALIDATION.P_VALIDATE_EL_DISBURSEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
				
			cmd.execute();


		}
		
		public static void pValidateMemos(NString pAidyCode,NString pPeriod,NNumber pPidm,NString pFundCode,NString pLoad,NString pPckgLoad) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_DISB_VALIDATION.P_VALIDATE_MEMOS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_LOAD", pLoad);
			cmd.addParameter("@P_PCKG_LOAD", pPckgLoad);
				
			cmd.execute();


		}
		
	
	
	
}
