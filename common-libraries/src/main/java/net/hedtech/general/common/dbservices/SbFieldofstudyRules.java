package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbFieldofstudyRules {
		public static NString fGetConcAttachMajr(NNumber pConcAttachRule) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_RULES.F_GET_CONC_ATTACH_MAJR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CONC_ATTACH_RULE", pConcAttachRule);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fRolledLmodExists(NNumber pPidm,NNumber pLcurSeqno,NNumber pRolledSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_RULES.F_ROLLED_LMOD_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_ROLLED_SEQNO", pRolledSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fSeqno(NNumber pPidm,NNumber pLcurSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_RULES.F_SEQNO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NNumber pLcurSeqno,NNumber pSeqno,NString pLfstCode,NString pTermCode,NNumber pPriorityNo,NString pCstsCode,NString pCactCode,NString pDataOrigin,NString pUserId,NString pMajrCode,NString pTermCodeCtlg,NString pTermCodeEnd,NString pDeptCode,NNumber pLfosRule,NNumber pConcAttachRule,NDate pStartDate,NDate pEndDate,NString pTmstCode,NString pMajrCodeAttach,NNumber pRolledSeqno,NString pInternalRecordId,NString pUserIdUpdate,NString pCurrentCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_CSTS_CODE", pCstsCode);
			cmd.addParameter("@P_CACT_CODE", pCactCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_TERM_CODE_CTLG", pTermCodeCtlg);
			cmd.addParameter("@P_TERM_CODE_END", pTermCodeEnd);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_LFOS_RULE", pLfosRule);
			cmd.addParameter("@P_CONC_ATTACH_RULE", pConcAttachRule);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_MAJR_CODE_ATTACH", pMajrCodeAttach);
			cmd.addParameter("@P_ROLLED_SEQNO", pRolledSeqno);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
			cmd.addParameter("@P_USER_ID_UPDATE", pUserIdUpdate);
			cmd.addParameter("@P_CURRENT_CDE", pCurrentCde);
				
			cmd.execute();


		}
		
		public static void pValidateInsert(NNumber pPidm,NNumber pLcurSeqno,NNumber pSeqno,NString pLfstCode,NString pTermCode,NNumber pPriorityNo,NString pCstsCode,NString pCactCode,NString pDataOrigin,NString pUserId,NString pMajrCode,NString pTermCodeCtlg,NString pTermCodeEnd,NString pDeptCode,NNumber pLfosRule,NNumber pConcAttachRule,NDate pStartDate,NDate pEndDate,NString pTmstCode,NString pMajrCodeAttach,NNumber pRolledSeqno,Ref<NString> pTermCodeCtlgOut,Ref<NNumber> pLfosRuleOut,Ref<NNumber> pConcAttachRuleOut,Ref<NNumber> pCurrErrOut,Ref<NString> pCstsCodeOut,Ref<NString> pCactCodeOut,NString pOverrideSeverity,Ref<NString> pSeverityOut,NString pCurrentCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_RULES.P_VALIDATE_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LCUR_SEQNO", pLcurSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_CSTS_CODE", pCstsCode);
			cmd.addParameter("@P_CACT_CODE", pCactCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_TERM_CODE_CTLG", pTermCodeCtlg);
			cmd.addParameter("@P_TERM_CODE_END", pTermCodeEnd);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_LFOS_RULE", pLfosRule);
			cmd.addParameter("@P_CONC_ATTACH_RULE", pConcAttachRule);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_MAJR_CODE_ATTACH", pMajrCodeAttach);
			cmd.addParameter("@P_ROLLED_SEQNO", pRolledSeqno);
			cmd.addParameter("@P_TERM_CODE_CTLG_OUT", NString.class);
			cmd.addParameter("@P_LFOS_RULE_OUT", NNumber.class);
			cmd.addParameter("@P_CONC_ATTACH_RULE_OUT", NNumber.class);
			cmd.addParameter("@P_CURR_ERR_OUT", NNumber.class);
			cmd.addParameter("@P_CSTS_CODE_OUT", NString.class);
			cmd.addParameter("@P_CACT_CODE_OUT", NString.class);
			cmd.addParameter("@P_OVERRIDE_SEVERITY", pOverrideSeverity);
			cmd.addParameter("@P_SEVERITY_OUT", NString.class);
			cmd.addParameter("@P_CURRENT_CDE", pCurrentCde);
				
			cmd.execute();
			pTermCodeCtlgOut.val = cmd.getParameterValue("@P_TERM_CODE_CTLG_OUT", NString.class);
			pLfosRuleOut.val = cmd.getParameterValue("@P_LFOS_RULE_OUT", NNumber.class);
			pConcAttachRuleOut.val = cmd.getParameterValue("@P_CONC_ATTACH_RULE_OUT", NNumber.class);
			pCurrErrOut.val = cmd.getParameterValue("@P_CURR_ERR_OUT", NNumber.class);
			pCstsCodeOut.val = cmd.getParameterValue("@P_CSTS_CODE_OUT", NString.class);
			pCactCodeOut.val = cmd.getParameterValue("@P_CACT_CODE_OUT", NString.class);
			pSeverityOut.val = cmd.getParameterValue("@P_SEVERITY_OUT", NString.class);


		}
		
	
	
	
}
