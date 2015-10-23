package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sikafla {
		public static NString fAsgnCompensationApplied(NNumber pPidm,NString pTerm,NString pCrn,NString pCtg,NString pPosn,NString pSuff,NString pHrsysInd,NString pPosbudInd,NString pSikvalsInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.F_ASGN_COMPENSATION_APPLIED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CTG", pCtg);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_HRSYS_IND", pHrsysInd);
			cmd.addParameter("@P_POSBUD_IND", pPosbudInd);
			cmd.addParameter("@P_SIKVALS_IND", pSikvalsInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fAsgnCompensationExtracted(NNumber pPidm,NString pTerm,NString pCrn,NString pCtg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.F_ASGN_COMPENSATION_EXTRACTED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CTG", pCtg);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckPosnIsValidActive(NString pPosn,NString pHrsysInd,NString pPosbudInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.F_CHECK_POSN_IS_VALID_ACTIVE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_HRSYS_IND", pHrsysInd);
			cmd.addParameter("@P_POSBUD_IND", pPosbudInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFinanceInstalled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.F_FINANCE_INSTALLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetMessage(NString pStringName,NString pValue01) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.F_GET_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING_NAME", pStringName);
			cmd.addParameter("@P_VALUE_01", pValue01);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPosnMessage(NString pMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.F_GET_POSN_MESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_MSG", pMsg);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPtrinstFacPosnInd(NString pSysInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.F_GET_PTRINST_FAC_POSN_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SYS_IND", pSysInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNistCompensationApplied(NNumber pPidm,NString pTerm,NString pNist,NString pColl,NString pDept,NNumber pWorkload,NString pFcnt,NString pPosn,NString pSuff,NNumber pWeeklyHrs,NString pHrsysInd,NString pPosbudInd,NString pSikvalsInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.F_NIST_COMPENSATION_APPLIED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_NIST", pNist);
			cmd.addParameter("@P_COLL", pColl);
			cmd.addParameter("@P_DEPT", pDept);
			cmd.addParameter("@P_WORKLOAD", pWorkload);
			cmd.addParameter("@P_FCNT", pFcnt);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_WEEKLY_HRS", pWeeklyHrs);
			cmd.addParameter("@P_HRSYS_IND", pHrsysInd);
			cmd.addParameter("@P_POSBUD_IND", pPosbudInd);
			cmd.addParameter("@P_SIKVALS_IND", pSikvalsInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fNistCompensationExtracted(NNumber pPidm,NString pTerm,NString pNist,NString pColl,NString pDept,NNumber pWorkload,NString pFcnt,NString pPosn,NString pSuff,NNumber pWeeklyHrs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.F_NIST_COMPENSATION_EXTRACTED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_NIST", pNist);
			cmd.addParameter("@P_COLL", pColl);
			cmd.addParameter("@P_DEPT", pDept);
			cmd.addParameter("@P_WORKLOAD", pWorkload);
			cmd.addParameter("@P_FCNT", pFcnt);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_WEEKLY_HRS", pWeeklyHrs);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetAcciValues(NDate pEffdateTime,NString pAcciCode,NString pCoasCode,Ref<NString> pHoldFundCodeInout,Ref<NString> pHoldOrgnCodeInout,Ref<NString> pHoldAcctCodeInout,Ref<NString> pHoldProgCodeInout,Ref<NString> pHoldActvCodeInout,Ref<NString> pHoldLocnCodeInout,Ref<NString> pFundOverrideOut,Ref<NString> pOrgnOverrideOut,Ref<NString> pAcctOverrideOut,Ref<NString> pProgOverrideOut,Ref<NString> pActvOverrideOut,Ref<NString> pLocnOverrideOut,Ref<NString> pErrMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.P_GET_ACCI_VALUES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_HOLD_FUND_CODE_INOUT", pHoldFundCodeInout, true);
			cmd.addParameter("@P_HOLD_ORGN_CODE_INOUT", pHoldOrgnCodeInout, true);
			cmd.addParameter("@P_HOLD_ACCT_CODE_INOUT", pHoldAcctCodeInout, true);
			cmd.addParameter("@P_HOLD_PROG_CODE_INOUT", pHoldProgCodeInout, true);
			cmd.addParameter("@P_HOLD_ACTV_CODE_INOUT", pHoldActvCodeInout, true);
			cmd.addParameter("@P_HOLD_LOCN_CODE_INOUT", pHoldLocnCodeInout, true);
			cmd.addParameter("@P_FUND_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_ORGN_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_ACCT_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_PROG_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_ACTV_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_LOCN_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
				
			cmd.execute();
			pHoldFundCodeInout.val = cmd.getParameterValue("@P_HOLD_FUND_CODE_INOUT", NString.class);
			pHoldOrgnCodeInout.val = cmd.getParameterValue("@P_HOLD_ORGN_CODE_INOUT", NString.class);
			pHoldAcctCodeInout.val = cmd.getParameterValue("@P_HOLD_ACCT_CODE_INOUT", NString.class);
			pHoldProgCodeInout.val = cmd.getParameterValue("@P_HOLD_PROG_CODE_INOUT", NString.class);
			pHoldActvCodeInout.val = cmd.getParameterValue("@P_HOLD_ACTV_CODE_INOUT", NString.class);
			pHoldLocnCodeInout.val = cmd.getParameterValue("@P_HOLD_LOCN_CODE_INOUT", NString.class);
			pFundOverrideOut.val = cmd.getParameterValue("@P_FUND_OVERRIDE_OUT", NString.class);
			pOrgnOverrideOut.val = cmd.getParameterValue("@P_ORGN_OVERRIDE_OUT", NString.class);
			pAcctOverrideOut.val = cmd.getParameterValue("@P_ACCT_OVERRIDE_OUT", NString.class);
			pProgOverrideOut.val = cmd.getParameterValue("@P_PROG_OVERRIDE_OUT", NString.class);
			pActvOverrideOut.val = cmd.getParameterValue("@P_ACTV_OVERRIDE_OUT", NString.class);
			pLocnOverrideOut.val = cmd.getParameterValue("@P_LOCN_OVERRIDE_OUT", NString.class);
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateAcciCode(NDate pEffdateTime,NString pAcciCode,NString pCoasCode,Ref<NString> pHoldFundCodeInout,Ref<NString> pHoldOrgnCodeInout,Ref<NString> pHoldAcctCodeInout,Ref<NString> pHoldProgCodeInout,Ref<NString> pHoldActvCodeInout,Ref<NString> pHoldLocnCodeInout,Ref<NString> pFundOverrideOut,Ref<NString> pOrgnOverrideOut,Ref<NString> pAcctOverrideOut,Ref<NString> pProgOverrideOut,Ref<NString> pActvOverrideOut,Ref<NString> pLocnOverrideOut,Ref<NString> pErrMsgInout,NString pValidateAcct,NString pCheckTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.P_VALIDATE_ACCI_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_HOLD_FUND_CODE_INOUT", pHoldFundCodeInout, true);
			cmd.addParameter("@P_HOLD_ORGN_CODE_INOUT", pHoldOrgnCodeInout, true);
			cmd.addParameter("@P_HOLD_ACCT_CODE_INOUT", pHoldAcctCodeInout, true);
			cmd.addParameter("@P_HOLD_PROG_CODE_INOUT", pHoldProgCodeInout, true);
			cmd.addParameter("@P_HOLD_ACTV_CODE_INOUT", pHoldActvCodeInout, true);
			cmd.addParameter("@P_HOLD_LOCN_CODE_INOUT", pHoldLocnCodeInout, true);
			cmd.addParameter("@P_FUND_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_ORGN_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_ACCT_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_PROG_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_ACTV_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_LOCN_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
			cmd.addParameter("@P_VALIDATE_ACCT", pValidateAcct);
			cmd.addParameter("@P_CHECK_TERM", pCheckTerm);
				
			cmd.execute();
			pHoldFundCodeInout.val = cmd.getParameterValue("@P_HOLD_FUND_CODE_INOUT", NString.class);
			pHoldOrgnCodeInout.val = cmd.getParameterValue("@P_HOLD_ORGN_CODE_INOUT", NString.class);
			pHoldAcctCodeInout.val = cmd.getParameterValue("@P_HOLD_ACCT_CODE_INOUT", NString.class);
			pHoldProgCodeInout.val = cmd.getParameterValue("@P_HOLD_PROG_CODE_INOUT", NString.class);
			pHoldActvCodeInout.val = cmd.getParameterValue("@P_HOLD_ACTV_CODE_INOUT", NString.class);
			pHoldLocnCodeInout.val = cmd.getParameterValue("@P_HOLD_LOCN_CODE_INOUT", NString.class);
			pFundOverrideOut.val = cmd.getParameterValue("@P_FUND_OVERRIDE_OUT", NString.class);
			pOrgnOverrideOut.val = cmd.getParameterValue("@P_ORGN_OVERRIDE_OUT", NString.class);
			pAcctOverrideOut.val = cmd.getParameterValue("@P_ACCT_OVERRIDE_OUT", NString.class);
			pProgOverrideOut.val = cmd.getParameterValue("@P_PROG_OVERRIDE_OUT", NString.class);
			pActvOverrideOut.val = cmd.getParameterValue("@P_ACTV_OVERRIDE_OUT", NString.class);
			pLocnOverrideOut.val = cmd.getParameterValue("@P_LOCN_OVERRIDE_OUT", NString.class);
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateAcctCode(NDate pEffdateTime,NString pCoasCode,NString pAcctCode,Ref<NString> pErrMsgInout,NString pDataEntryInd,NString pCheckTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.P_VALIDATE_ACCT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
			cmd.addParameter("@P_DATA_ENTRY_IND", pDataEntryInd);
			cmd.addParameter("@P_CHECK_TERM", pCheckTerm);
				
			cmd.execute();
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateActvCode(NDate pEffdateTime,NString pCoasCode,NString pActvCode,Ref<NString> pErrMsgInout,NString pCheckTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.P_VALIDATE_ACTV_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
			cmd.addParameter("@P_CHECK_TERM", pCheckTerm);
				
			cmd.execute();
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateCoasCode(NDate pEffdateTime,NString pCoasCode,Ref<NString> pErrMsgInout,NString pCheckTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.P_VALIDATE_COAS_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
			cmd.addParameter("@P_CHECK_TERM", pCheckTerm);
				
			cmd.execute();
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateCtypCode(NString pCtypCode,Ref<NString> pErrMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.P_VALIDATE_CTYP_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
				
			cmd.execute();
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateFundCode(NDate pEffdateTime,NString pCoasCode,NString pAcciCode,Ref<NString> pFundCodeInout,Ref<NString> pOrgnCodeInout,Ref<NString> pAcctCodeInout,Ref<NString> pProgCodeInout,Ref<NString> pActvCodeInout,Ref<NString> pLocnCodeInout,Ref<NString> pErrMsgInout,NString pDoDefault,NString pDataEntryInd,NString pCheckTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.P_VALIDATE_FUND_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE_INOUT", pFundCodeInout, true);
			cmd.addParameter("@P_ORGN_CODE_INOUT", pOrgnCodeInout, true);
			cmd.addParameter("@P_ACCT_CODE_INOUT", pAcctCodeInout, true);
			cmd.addParameter("@P_PROG_CODE_INOUT", pProgCodeInout, true);
			cmd.addParameter("@P_ACTV_CODE_INOUT", pActvCodeInout, true);
			cmd.addParameter("@P_LOCN_CODE_INOUT", pLocnCodeInout, true);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
			cmd.addParameter("@P_DO_DEFAULT", pDoDefault);
			cmd.addParameter("@P_DATA_ENTRY_IND", pDataEntryInd);
			cmd.addParameter("@P_CHECK_TERM", pCheckTerm);
				
			cmd.execute();
			pFundCodeInout.val = cmd.getParameterValue("@P_FUND_CODE_INOUT", NString.class);
			pOrgnCodeInout.val = cmd.getParameterValue("@P_ORGN_CODE_INOUT", NString.class);
			pAcctCodeInout.val = cmd.getParameterValue("@P_ACCT_CODE_INOUT", NString.class);
			pProgCodeInout.val = cmd.getParameterValue("@P_PROG_CODE_INOUT", NString.class);
			pActvCodeInout.val = cmd.getParameterValue("@P_ACTV_CODE_INOUT", NString.class);
			pLocnCodeInout.val = cmd.getParameterValue("@P_LOCN_CODE_INOUT", NString.class);
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateLocnCode(NDate pEffdateTime,NString pCoasCode,NString pLocnCode,Ref<NString> pErrMsgInout,NString pCheckTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.P_VALIDATE_LOCN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
			cmd.addParameter("@P_CHECK_TERM", pCheckTerm);
				
			cmd.execute();
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateOrgnCode(NDate pEffdateTime,NString pCoasCode,NString pOrgnCode,Ref<NString> pDescOut,Ref<NString> pErrMsgInout,NString pDataEntryInd,NString pCheckTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.P_VALIDATE_ORGN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_DESC_OUT", NString.class);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
			cmd.addParameter("@P_DATA_ENTRY_IND", pDataEntryInd);
			cmd.addParameter("@P_CHECK_TERM", pCheckTerm);
				
			cmd.execute();
			pDescOut.val = cmd.getParameterValue("@P_DESC_OUT", NString.class);
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateProgCode(NDate pEffdateTime,NString pCoasCode,NString pProgCode,Ref<NString> pErrMsgInout,NString pDataEntryInd,NString pCheckTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.P_VALIDATE_PROG_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
			cmd.addParameter("@P_DATA_ENTRY_IND", pDataEntryInd);
			cmd.addParameter("@P_CHECK_TERM", pCheckTerm);
				
			cmd.execute();
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateProjCode(NDate pEffdateTime,NString pCoasCode,NString pProjCode,Ref<NString> pErrMsgInout,NString pPostedInd,NString pCheckTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIKAFLA.P_VALIDATE_PROJ_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
			cmd.addParameter("@P_POSTED_IND", pPostedInd);
			cmd.addParameter("@P_CHECK_TERM", pCheckTerm);
				
			cmd.execute();
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
	
	
	
}
