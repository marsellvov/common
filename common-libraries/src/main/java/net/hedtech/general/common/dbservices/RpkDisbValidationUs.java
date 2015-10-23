package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RpkDisbValidationUs {
		public static void pValidateDisbursementUs(NString pAidyCode,NNumber pPidm,NString pFundCode,NString pPeriod,NString pLoad,NString pAttendLoad,NString pPckgLoad,NString pAttendingHrInd,NString pAtrmNsldsOvrdInd,NString pLockInd,NString pCipcOverrideCode,NString pMajrOverrideCode,Ref<NString> pFundInelBefCutOut,Ref<NString> pFundInelAftCutOut,Ref<NString> pAttendWarning60Out,Ref<NString> pPellWarning62Out) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_DISB_VALIDATION_US.P_VALIDATE_DISBURSEMENT_US", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_MAJR_OVERRIDE_CODE", pMajrOverrideCode);
			cmd.addParameter("@P_FUND_INEL_BEF_CUT_OUT", NString.class);
			cmd.addParameter("@P_FUND_INEL_AFT_CUT_OUT", NString.class);
			cmd.addParameter("@P_ATTEND_WARNING_60_OUT", NString.class);
			cmd.addParameter("@P_PELL_WARNING_62_OUT", NString.class);
				
			cmd.execute();
			pFundInelBefCutOut.val = cmd.getParameterValue("@P_FUND_INEL_BEF_CUT_OUT", NString.class);
			pFundInelAftCutOut.val = cmd.getParameterValue("@P_FUND_INEL_AFT_CUT_OUT", NString.class);
			pAttendWarning60Out.val = cmd.getParameterValue("@P_ATTEND_WARNING_60_OUT", NString.class);
			pPellWarning62Out.val = cmd.getParameterValue("@P_PELL_WARNING_62_OUT", NString.class);


		}
		
		public static void pValidateDlDisbursement(NString pAidyCode,NNumber pPidm,NString pFundCode,NNumber pApplNo,NNumber pDlSeqNo,NString pDlAffirmInd,NString pAffirmFlag,NDate pDisburseDate,NNumber pDlDisbNo,NNumber pDlGrossAmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_DISB_VALIDATION_US.P_VALIDATE_DL_DISBURSEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_DL_SEQ_NO", pDlSeqNo);
			cmd.addParameter("@P_DL_AFFIRM_IND", pDlAffirmInd);
			cmd.addParameter("@P_AFFIRM_FLAG", pAffirmFlag);
			cmd.addParameter("@P_DISBURSE_DATE", pDisburseDate);
			cmd.addParameter("@P_DL_DISB_NO", pDlDisbNo);
			cmd.addParameter("@P_DL_GROSS_AMT", pDlGrossAmt);
				
			cmd.execute();


		}
		
	
	
	
}
