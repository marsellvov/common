package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvEmployeeRules {
		public static NString fMinimalAddrInfoExists(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE_RULES.F_MINIMAL_ADDR_INFO_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fMinimalBioInfoExists(NNumber pPidm,Ref<NString> pErrorCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE_RULES.F_MINIMAL_BIO_INFO_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ERROR_CODE", NString.class);
				
			cmd.execute();
			pErrorCode.val = cmd.getParameterValue("@P_ERROR_CODE", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pEditCoasCodeDist(NString pCoasCodeDist,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE_RULES.P_EDIT_COAS_CODE_DIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE_DIST", pCoasCodeDist);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pEditCoasCodeHome(NString pCoasCodeHome,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE_RULES.P_EDIT_COAS_CODE_HOME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE_HOME", pCoasCodeHome);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pEditJobsStillOnLeave(NNumber pPidm,NDate pLoaEndDate,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE_RULES.P_EDIT_JOBS_STILL_ON_LEAVE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LOA_END_DATE", pLoaEndDate);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pEditOrgnCodeDist(NString pCoasCodeDist,NString pOrgnCodeDist,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE_RULES.P_EDIT_ORGN_CODE_DIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE_DIST", pCoasCodeDist);
			cmd.addParameter("@P_ORGN_CODE_DIST", pOrgnCodeDist);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pEditOrgnCodeHome(NString pCoasCodeHome,NString pOrgnCodeHome,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE_RULES.P_EDIT_ORGN_CODE_HOME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE_HOME", pCoasCodeHome);
			cmd.addParameter("@P_ORGN_CODE_HOME", pOrgnCodeHome);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pGetEclsDefaults(NString pEclsCode,Ref<NString> pLcatCodeOut,Ref<NString> pBcatCodeOut,Ref<NString> pStgrCodeOut,Ref<NString> pWkprCodeOut,Ref<NString> pFlsaIndOut,Ref<NString> pEgrpCodeOut,Ref<NString> pInternalFtPtIndOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE_RULES.P_GET_ECLS_DEFAULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_LCAT_CODE_OUT", NString.class);
			cmd.addParameter("@P_BCAT_CODE_OUT", NString.class);
			cmd.addParameter("@P_STGR_CODE_OUT", NString.class);
			cmd.addParameter("@P_WKPR_CODE_OUT", NString.class);
			cmd.addParameter("@P_FLSA_IND_OUT", NString.class);
			cmd.addParameter("@P_EGRP_CODE_OUT", NString.class);
			cmd.addParameter("@P_INTERNAL_FT_PT_IND_OUT", NString.class);
				
			cmd.execute();
			pLcatCodeOut.val = cmd.getParameterValue("@P_LCAT_CODE_OUT", NString.class);
			pBcatCodeOut.val = cmd.getParameterValue("@P_BCAT_CODE_OUT", NString.class);
			pStgrCodeOut.val = cmd.getParameterValue("@P_STGR_CODE_OUT", NString.class);
			pWkprCodeOut.val = cmd.getParameterValue("@P_WKPR_CODE_OUT", NString.class);
			pFlsaIndOut.val = cmd.getParameterValue("@P_FLSA_IND_OUT", NString.class);
			pEgrpCodeOut.val = cmd.getParameterValue("@P_EGRP_CODE_OUT", NString.class);
			pInternalFtPtIndOut.val = cmd.getParameterValue("@P_INTERNAL_FT_PT_IND_OUT", NString.class);


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pEmplStatus,NString pCoasCodeHome,NString pOrgnCodeHome,NString pCoasCodeDist,NString pOrgnCodeDist,NString pEclsCode,NString pLcatCode,NString pBcatCode,NDate pFirstHireDate,NDate pCurrentHireDate,NDate pAdjServiceDate,NDate pSeniorityDate,NString pLreaCode,NDate pLoaBegDate,NDate pLoaEndDate,NString pTreaCode,NDate pTermDate,NString pI9FormInd,NDate pI9Date,NDate pI9ExpireDate,NString pWkprCode,NString pFlsaInd,NString pStgrCode,NNumber pDaysInCanada,NString p1042RecipientCd,NString pInternalFtPtInd,NString pDicdCode,NString pEgrpCode,NString pIpedsSoftMoneyInd,NDate pFirstWorkDate,NDate pLastWorkDate,NString pCalifPensionInd,NString pNrsiCode,NString pSsnLastName,NString pSsnFirstName,NString pSsnMi,NString pSsnSuffix,NString pJblnCode,NString pCollCode,NString pCampCode,NString pUserId,NString pDataOrigin,NString pEw2ConsentInd,NDate pEw2ConsentDate,NString pEw2ConsentUserId,NString pInternalRecordId,NString pIpedsPrimaryFunction,NString pIpedsMedDentalInd,NString pEtaxConsentInd,NDate pEtaxConsentDate,NString pEtaxConsentUserId,NString pNewHireInd,NString pPersParticipantId,NString pPersApptId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMPL_STATUS", pEmplStatus);
			cmd.addParameter("@P_COAS_CODE_HOME", pCoasCodeHome);
			cmd.addParameter("@P_ORGN_CODE_HOME", pOrgnCodeHome);
			cmd.addParameter("@P_COAS_CODE_DIST", pCoasCodeDist);
			cmd.addParameter("@P_ORGN_CODE_DIST", pOrgnCodeDist);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
			cmd.addParameter("@P_FIRST_HIRE_DATE", pFirstHireDate);
			cmd.addParameter("@P_CURRENT_HIRE_DATE", pCurrentHireDate);
			cmd.addParameter("@P_ADJ_SERVICE_DATE", pAdjServiceDate);
			cmd.addParameter("@P_SENIORITY_DATE", pSeniorityDate);
			cmd.addParameter("@P_LREA_CODE", pLreaCode);
			cmd.addParameter("@P_LOA_BEG_DATE", pLoaBegDate);
			cmd.addParameter("@P_LOA_END_DATE", pLoaEndDate);
			cmd.addParameter("@P_TREA_CODE", pTreaCode);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
			cmd.addParameter("@P_I9_FORM_IND", pI9FormInd);
			cmd.addParameter("@P_I9_DATE", pI9Date);
			cmd.addParameter("@P_I9_EXPIRE_DATE", pI9ExpireDate);
			cmd.addParameter("@P_WKPR_CODE", pWkprCode);
			cmd.addParameter("@P_FLSA_IND", pFlsaInd);
			cmd.addParameter("@P_STGR_CODE", pStgrCode);
			cmd.addParameter("@P_DAYS_IN_CANADA", pDaysInCanada);
			cmd.addParameter("@P_1042_RECIPIENT_CD", p1042RecipientCd);
			cmd.addParameter("@P_INTERNAL_FT_PT_IND", pInternalFtPtInd);
			cmd.addParameter("@P_DICD_CODE", pDicdCode);
			cmd.addParameter("@P_EGRP_CODE", pEgrpCode);
			cmd.addParameter("@P_IPEDS_SOFT_MONEY_IND", pIpedsSoftMoneyInd);
			cmd.addParameter("@P_FIRST_WORK_DATE", pFirstWorkDate);
			cmd.addParameter("@P_LAST_WORK_DATE", pLastWorkDate);
			cmd.addParameter("@P_CALIF_PENSION_IND", pCalifPensionInd);
			cmd.addParameter("@P_NRSI_CODE", pNrsiCode);
			cmd.addParameter("@P_SSN_LAST_NAME", pSsnLastName);
			cmd.addParameter("@P_SSN_FIRST_NAME", pSsnFirstName);
			cmd.addParameter("@P_SSN_MI", pSsnMi);
			cmd.addParameter("@P_SSN_SUFFIX", pSsnSuffix);
			cmd.addParameter("@P_JBLN_CODE", pJblnCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_EW2_CONSENT_IND", pEw2ConsentInd);
			cmd.addParameter("@P_EW2_CONSENT_DATE", pEw2ConsentDate);
			cmd.addParameter("@P_EW2_CONSENT_USER_ID", pEw2ConsentUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
			cmd.addParameter("@P_IPEDS_PRIMARY_FUNCTION", pIpedsPrimaryFunction);
			cmd.addParameter("@P_IPEDS_MED_DENTAL_IND", pIpedsMedDentalInd);
			cmd.addParameter("@P_ETAX_CONSENT_IND", pEtaxConsentInd);
			cmd.addParameter("@P_ETAX_CONSENT_DATE", pEtaxConsentDate);
			cmd.addParameter("@P_ETAX_CONSENT_USER_ID", pEtaxConsentUserId);
			cmd.addParameter("@P_NEW_HIRE_IND", pNewHireInd);
			cmd.addParameter("@P_PERS_PARTICIPANT_ID", pPersParticipantId);
			cmd.addParameter("@P_PERS_APPT_ID", pPersApptId);
				
			cmd.execute();


		}
		
		public static void pValidate(Ref<PvEmployee.EmployeeRecRow> pValRecInout,NString pOperationType,NNumber pPidm,NString pEmplStatus,NString pCoasCodeHome,NString pOrgnCodeHome,NString pCoasCodeDist,NString pOrgnCodeDist,NString pEclsCode,NString pLcatCode,NString pBcatCode,NDate pFirstHireDate,NDate pCurrentHireDate,NDate pAdjServiceDate,NDate pSeniorityDate,NString pLreaCode,NDate pLoaBegDate,NDate pLoaEndDate,NString pTreaCode,NDate pTermDate,NString pI9FormInd,NDate pI9Date,NDate pI9ExpireDate,NString pWkprCode,NString pFlsaInd,NString pStgrCode,NNumber pDaysInCanada,NString p1042RecipientCd,NString pInternalFtPtInd,NString pDicdCode,NString pEgrpCode,NString pIpedsSoftMoneyInd,NDate pFirstWorkDate,NDate pLastWorkDate,NString pCalifPensionInd,NString pNrsiCode,NString pSsnLastName,NString pSsnFirstName,NString pSsnMi,NString pSsnSuffix,NString pJblnCode,NString pCollCode,NString pCampCode,NString pUserId,NString pDataOrigin,NString pEw2ConsentInd,NDate pEw2ConsentDate,NString pEw2ConsentUserId,NString pIpedsPrimaryFunction,NString pIpedsMedDentalInd,NString pEtaxConsentInd,NDate pEtaxConsentDate,NString pEtaxConsentUserId,NString pNewHireInd,NString pPersParticipantId,NString pPersApptId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_VAL_REC_INOUT", pValRecInout.val, PvEmployee.EmployeeRecRow.class, true));
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMPL_STATUS", pEmplStatus);
			cmd.addParameter("@P_COAS_CODE_HOME", pCoasCodeHome);
			cmd.addParameter("@P_ORGN_CODE_HOME", pOrgnCodeHome);
			cmd.addParameter("@P_COAS_CODE_DIST", pCoasCodeDist);
			cmd.addParameter("@P_ORGN_CODE_DIST", pOrgnCodeDist);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
			cmd.addParameter("@P_FIRST_HIRE_DATE", pFirstHireDate);
			cmd.addParameter("@P_CURRENT_HIRE_DATE", pCurrentHireDate);
			cmd.addParameter("@P_ADJ_SERVICE_DATE", pAdjServiceDate);
			cmd.addParameter("@P_SENIORITY_DATE", pSeniorityDate);
			cmd.addParameter("@P_LREA_CODE", pLreaCode);
			cmd.addParameter("@P_LOA_BEG_DATE", pLoaBegDate);
			cmd.addParameter("@P_LOA_END_DATE", pLoaEndDate);
			cmd.addParameter("@P_TREA_CODE", pTreaCode);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
			cmd.addParameter("@P_I9_FORM_IND", pI9FormInd);
			cmd.addParameter("@P_I9_DATE", pI9Date);
			cmd.addParameter("@P_I9_EXPIRE_DATE", pI9ExpireDate);
			cmd.addParameter("@P_WKPR_CODE", pWkprCode);
			cmd.addParameter("@P_FLSA_IND", pFlsaInd);
			cmd.addParameter("@P_STGR_CODE", pStgrCode);
			cmd.addParameter("@P_DAYS_IN_CANADA", pDaysInCanada);
			cmd.addParameter("@P_1042_RECIPIENT_CD", p1042RecipientCd);
			cmd.addParameter("@P_INTERNAL_FT_PT_IND", pInternalFtPtInd);
			cmd.addParameter("@P_DICD_CODE", pDicdCode);
			cmd.addParameter("@P_EGRP_CODE", pEgrpCode);
			cmd.addParameter("@P_IPEDS_SOFT_MONEY_IND", pIpedsSoftMoneyInd);
			cmd.addParameter("@P_FIRST_WORK_DATE", pFirstWorkDate);
			cmd.addParameter("@P_LAST_WORK_DATE", pLastWorkDate);
			cmd.addParameter("@P_CALIF_PENSION_IND", pCalifPensionInd);
			cmd.addParameter("@P_NRSI_CODE", pNrsiCode);
			cmd.addParameter("@P_SSN_LAST_NAME", pSsnLastName);
			cmd.addParameter("@P_SSN_FIRST_NAME", pSsnFirstName);
			cmd.addParameter("@P_SSN_MI", pSsnMi);
			cmd.addParameter("@P_SSN_SUFFIX", pSsnSuffix);
			cmd.addParameter("@P_JBLN_CODE", pJblnCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_EW2_CONSENT_IND", pEw2ConsentInd);
			cmd.addParameter("@P_EW2_CONSENT_DATE", pEw2ConsentDate);
			cmd.addParameter("@P_EW2_CONSENT_USER_ID", pEw2ConsentUserId);
			cmd.addParameter("@P_IPEDS_PRIMARY_FUNCTION", pIpedsPrimaryFunction);
			cmd.addParameter("@P_IPEDS_MED_DENTAL_IND", pIpedsMedDentalInd);
			cmd.addParameter("@P_ETAX_CONSENT_IND", pEtaxConsentInd);
			cmd.addParameter("@P_ETAX_CONSENT_DATE", pEtaxConsentDate);
			cmd.addParameter("@P_ETAX_CONSENT_USER_ID", pEtaxConsentUserId);
			cmd.addParameter("@P_NEW_HIRE_IND", pNewHireInd);
			cmd.addParameter("@P_PERS_PARTICIPANT_ID", pPersParticipantId);
			cmd.addParameter("@P_PERS_APPT_ID", pPersApptId);
				
			cmd.execute();
			pValRecInout.val = cmd.getParameterValue("@P_VAL_REC_INOUT", PvEmployee.EmployeeRecRow.class);


		}
		
		public static void pValidateDelete(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE_RULES.P_VALIDATE_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
	
	
	
}
