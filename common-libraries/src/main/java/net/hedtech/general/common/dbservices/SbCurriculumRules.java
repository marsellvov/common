package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbCurriculumRules {
		public static NNumber fSeqno(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM_RULES.F_SEQNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NNumber pSeqno,NString pLmodCode,NString pTermCode,NNumber pKeySeqno,NNumber pPriorityNo,NString pRollInd,NString pCactCode,NString pUserId,NString pDataOrigin,NString pLevlCode,NString pCollCode,NString pDegcCode,NString pTermCodeCtlg,NString pTermCodeEnd,NString pTermCodeMatric,NString pTermCodeAdmit,NString pAdmtCode,NString pCampCode,NString pProgram,NDate pStartDate,NDate pEndDate,NNumber pCurrRule,NNumber pRolledSeqno,NString pStypCode,NDate pExpGradDate,NString pLeavCode,NDate pLeavFromDate,NDate pLeavToDate,NString pRateCode,NString pTermCodeGrad,NString pAcyrCode,NString pSiteCode,NNumber pApplKeySeqno,NNumber pApplSeqno,NString pInternalRecordId,NString pUserIdUpdate,NNumber pGappSeqno,NString pCurrentCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_CACT_CODE", pCactCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_TERM_CODE_CTLG", pTermCodeCtlg);
			cmd.addParameter("@P_TERM_CODE_END", pTermCodeEnd);
			cmd.addParameter("@P_TERM_CODE_MATRIC", pTermCodeMatric);
			cmd.addParameter("@P_TERM_CODE_ADMIT", pTermCodeAdmit);
			cmd.addParameter("@P_ADMT_CODE", pAdmtCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_CURR_RULE", pCurrRule);
			cmd.addParameter("@P_ROLLED_SEQNO", pRolledSeqno);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_EXP_GRAD_DATE", pExpGradDate);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
			cmd.addParameter("@P_LEAV_FROM_DATE", pLeavFromDate);
			cmd.addParameter("@P_LEAV_TO_DATE", pLeavToDate);
			cmd.addParameter("@P_RATE_CODE", pRateCode);
			cmd.addParameter("@P_TERM_CODE_GRAD", pTermCodeGrad);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_SITE_CODE", pSiteCode);
			cmd.addParameter("@P_APPL_KEY_SEQNO", pApplKeySeqno);
			cmd.addParameter("@P_APPL_SEQNO", pApplSeqno);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
			cmd.addParameter("@P_USER_ID_UPDATE", pUserIdUpdate);
			cmd.addParameter("@P_GAPP_SEQNO", pGappSeqno);
			cmd.addParameter("@P_CURRENT_CDE", pCurrentCde);
				
			cmd.execute();


		}
		
		public static void pValidateInsert(NNumber pPidm,NNumber pSeqno,NString pLmodCode,NString pTermCode,NNumber pKeySeqno,NNumber pPriorityNo,NString pRollInd,NString pCactCode,NString pUserId,NString pDataOrigin,NString pLevlCode,NString pCollCode,NString pDegcCode,NString pTermCodeCtlg,NString pTermCodeEnd,NString pTermCodeMatric,NString pTermCodeAdmit,NString pAdmtCode,NString pCampCode,NString pProgram,NDate pStartDate,NDate pEndDate,NNumber pRolledSeqno,Ref<NNumber> pKeyseqnoOut,Ref<NString> pTermCodeCtlgOut,Ref<NString> pRollIndOut,Ref<NNumber> pCurrRuleOut,Ref<NNumber> pCurrErrOut,Ref<NString> pCactCodeOut,Ref<NString> pTermCodeOut,Ref<NString> pTermCodeAdmitOut,Ref<NString> pTermCodeMatricOut,NString pOverrideSeverity,Ref<NString> pSeverityOut,NString pStypCode,NDate pExpGradDate,NString pLeavCode,NDate pLeavFromDate,NDate pLeavToDate,NString pRateCode,NString pTermCodeGrad,NString pAcyrCode,NString pSiteCode,NNumber pApplSeqno,NNumber pApplKeySeqno,NString pCurrentCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CURRICULUM_RULES.P_VALIDATE_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_ROLL_IND", pRollInd);
			cmd.addParameter("@P_CACT_CODE", pCactCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_TERM_CODE_CTLG", pTermCodeCtlg);
			cmd.addParameter("@P_TERM_CODE_END", pTermCodeEnd);
			cmd.addParameter("@P_TERM_CODE_MATRIC", pTermCodeMatric);
			cmd.addParameter("@P_TERM_CODE_ADMIT", pTermCodeAdmit);
			cmd.addParameter("@P_ADMT_CODE", pAdmtCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_ROLLED_SEQNO", pRolledSeqno);
			cmd.addParameter("@P_KEYSEQNO_OUT", NNumber.class);
			cmd.addParameter("@P_TERM_CODE_CTLG_OUT", NString.class);
			cmd.addParameter("@P_ROLL_IND_OUT", NString.class);
			cmd.addParameter("@P_CURR_RULE_OUT", NNumber.class);
			cmd.addParameter("@P_CURR_ERR_OUT", NNumber.class);
			cmd.addParameter("@P_CACT_CODE_OUT", NString.class);
			cmd.addParameter("@P_TERM_CODE_OUT", NString.class);
			cmd.addParameter("@P_TERM_CODE_ADMIT_OUT", NString.class);
			cmd.addParameter("@P_TERM_CODE_MATRIC_OUT", NString.class);
			cmd.addParameter("@P_OVERRIDE_SEVERITY", pOverrideSeverity);
			cmd.addParameter("@P_SEVERITY_OUT", NString.class);
			cmd.addParameter("@P_STYP_CODE", pStypCode);
			cmd.addParameter("@P_EXP_GRAD_DATE", pExpGradDate);
			cmd.addParameter("@P_LEAV_CODE", pLeavCode);
			cmd.addParameter("@P_LEAV_FROM_DATE", pLeavFromDate);
			cmd.addParameter("@P_LEAV_TO_DATE", pLeavToDate);
			cmd.addParameter("@P_RATE_CODE", pRateCode);
			cmd.addParameter("@P_TERM_CODE_GRAD", pTermCodeGrad);
			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
			cmd.addParameter("@P_SITE_CODE", pSiteCode);
			cmd.addParameter("@P_APPL_SEQNO", pApplSeqno);
			cmd.addParameter("@P_APPL_KEY_SEQNO", pApplKeySeqno);
			cmd.addParameter("@P_CURRENT_CDE", pCurrentCde);
				
			cmd.execute();
			pKeyseqnoOut.val = cmd.getParameterValue("@P_KEYSEQNO_OUT", NNumber.class);
			pTermCodeCtlgOut.val = cmd.getParameterValue("@P_TERM_CODE_CTLG_OUT", NString.class);
			pRollIndOut.val = cmd.getParameterValue("@P_ROLL_IND_OUT", NString.class);
			pCurrRuleOut.val = cmd.getParameterValue("@P_CURR_RULE_OUT", NNumber.class);
			pCurrErrOut.val = cmd.getParameterValue("@P_CURR_ERR_OUT", NNumber.class);
			pCactCodeOut.val = cmd.getParameterValue("@P_CACT_CODE_OUT", NString.class);
			pTermCodeOut.val = cmd.getParameterValue("@P_TERM_CODE_OUT", NString.class);
			pTermCodeAdmitOut.val = cmd.getParameterValue("@P_TERM_CODE_ADMIT_OUT", NString.class);
			pTermCodeMatricOut.val = cmd.getParameterValue("@P_TERM_CODE_MATRIC_OUT", NString.class);
			pSeverityOut.val = cmd.getParameterValue("@P_SEVERITY_OUT", NString.class);


		}
		
	
	
	
}
