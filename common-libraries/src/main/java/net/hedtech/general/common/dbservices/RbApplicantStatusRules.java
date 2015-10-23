package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbApplicantStatusRules {
		public static NString fParentExists(NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_STATUS_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAidyCode,NNumber pPidm,NString pLockInd,NString pPgrpLockInd,NString pBgrpProcInd,NString pPgrpProcInd,NString pTgrpProcInd,NString pPckgFundProcInd,NString pVerComplete,NString pUserId,NString pVerPayInd,NString pBgrpCode,NString pAprdCode,NString pPgrpCode,NString pTgrpCode,NString pRecalcNaInd,NNumber pPc,NNumber pSc,NDate pApplRcvdDate,NDate pPckgFundDate,NDate pNeedDate,NDate pPckgCompDate,NDate pAllReqCompDate,NDate pMemoReqCompDate,NDate pPckgReqCompDate,NDate pDisbReqCompDate,NNumber pPellSchedAwd,NNumber pPriSarPgi,NNumber pSecSarPgi,NDate pSarDate,NString pSarTranNo,NString pSarSsn,NString pSarInit,NString pCmScLockInd,NString pCmPcLockInd,NString pCmTfcLockInd,NString pPgiLockInd,NString pInstScLockInd,NString pInstPcLockInd,NNumber pGrsNeed,NNumber pUnmetNeed,NNumber pTfc,NString pAwdLtrInd,NNumber pResourceAmt,NDate pResourceActDate,NString pTrkLtrInd,NNumber pImGrsNeed,NNumber pImUnmetNeed,NNumber pImTfc,NString pAddlStfdEligInd,NString pImLock,NString pFmBatchLock,NString pImBatchLock,NString pNsldsOvrdInd,NString pFormerHealInd,NNumber pPellLtHalfCoa,NString pInfoAccessInd,NString pBorrowerBasedCde,NString pPellOrigInd,NString pPellDisbLockInd,NString pPostBaPellOvrd,NString pInfcCode,NString pAlternatePellInd,NNumber pPellAttendCost,NNumber pLowTuitionCost,NNumber pSubLoanExclAmt,NString pTgrpCodeLockInd,NString pBgrpCodeLockInd,NString pPgrpCodeLockInd,NDate pTrkLtrIndDate,NString pTurnOffPellInd,NString pVerUserId,NDate pVerDate,NString pDataOrigin,NString pPrepOrTeachInd,NString pAcgDisbLockInd,NString pSmartDisbLockInd,NString pAutoZeroEfcInd,NString pAddlPellEligInd,NString pDepNoParData,NString pAprdCodePell,NString pPost911PellElig,NString pPbudInfoAccessInd,NString pHighPellLeuFlag,NString pSsInfoAccessInd,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_STATUS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_PGRP_LOCK_IND", pPgrpLockInd);
			cmd.addParameter("@P_BGRP_PROC_IND", pBgrpProcInd);
			cmd.addParameter("@P_PGRP_PROC_IND", pPgrpProcInd);
			cmd.addParameter("@P_TGRP_PROC_IND", pTgrpProcInd);
			cmd.addParameter("@P_PCKG_FUND_PROC_IND", pPckgFundProcInd);
			cmd.addParameter("@P_VER_COMPLETE", pVerComplete);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VER_PAY_IND", pVerPayInd);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_PGRP_CODE", pPgrpCode);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_RECALC_NA_IND", pRecalcNaInd);
			cmd.addParameter("@P_PC", pPc);
			cmd.addParameter("@P_SC", pSc);
			cmd.addParameter("@P_APPL_RCVD_DATE", pApplRcvdDate);
			cmd.addParameter("@P_PCKG_FUND_DATE", pPckgFundDate);
			cmd.addParameter("@P_NEED_DATE", pNeedDate);
			cmd.addParameter("@P_PCKG_COMP_DATE", pPckgCompDate);
			cmd.addParameter("@P_ALL_REQ_COMP_DATE", pAllReqCompDate);
			cmd.addParameter("@P_MEMO_REQ_COMP_DATE", pMemoReqCompDate);
			cmd.addParameter("@P_PCKG_REQ_COMP_DATE", pPckgReqCompDate);
			cmd.addParameter("@P_DISB_REQ_COMP_DATE", pDisbReqCompDate);
			cmd.addParameter("@P_PELL_SCHED_AWD", pPellSchedAwd);
			cmd.addParameter("@P_PRI_SAR_PGI", pPriSarPgi);
			cmd.addParameter("@P_SEC_SAR_PGI", pSecSarPgi);
			cmd.addParameter("@P_SAR_DATE", pSarDate);
			cmd.addParameter("@P_SAR_TRAN_NO", pSarTranNo);
			cmd.addParameter("@P_SAR_SSN", pSarSsn);
			cmd.addParameter("@P_SAR_INIT", pSarInit);
			cmd.addParameter("@P_CM_SC_LOCK_IND", pCmScLockInd);
			cmd.addParameter("@P_CM_PC_LOCK_IND", pCmPcLockInd);
			cmd.addParameter("@P_CM_TFC_LOCK_IND", pCmTfcLockInd);
			cmd.addParameter("@P_PGI_LOCK_IND", pPgiLockInd);
			cmd.addParameter("@P_INST_SC_LOCK_IND", pInstScLockInd);
			cmd.addParameter("@P_INST_PC_LOCK_IND", pInstPcLockInd);
			cmd.addParameter("@P_GRS_NEED", pGrsNeed);
			cmd.addParameter("@P_UNMET_NEED", pUnmetNeed);
			cmd.addParameter("@P_TFC", pTfc);
			cmd.addParameter("@P_AWD_LTR_IND", pAwdLtrInd);
			cmd.addParameter("@P_RESOURCE_AMT", pResourceAmt);
			cmd.addParameter("@P_RESOURCE_ACT_DATE", pResourceActDate);
			cmd.addParameter("@P_TRK_LTR_IND", pTrkLtrInd);
			cmd.addParameter("@P_IM_GRS_NEED", pImGrsNeed);
			cmd.addParameter("@P_IM_UNMET_NEED", pImUnmetNeed);
			cmd.addParameter("@P_IM_TFC", pImTfc);
			cmd.addParameter("@P_ADDL_STFD_ELIG_IND", pAddlStfdEligInd);
			cmd.addParameter("@P_IM_LOCK", pImLock);
			cmd.addParameter("@P_FM_BATCH_LOCK", pFmBatchLock);
			cmd.addParameter("@P_IM_BATCH_LOCK", pImBatchLock);
			cmd.addParameter("@P_NSLDS_OVRD_IND", pNsldsOvrdInd);
			cmd.addParameter("@P_FORMER_HEAL_IND", pFormerHealInd);
			cmd.addParameter("@P_PELL_LT_HALF_COA", pPellLtHalfCoa);
			cmd.addParameter("@P_INFO_ACCESS_IND", pInfoAccessInd);
			cmd.addParameter("@P_BORROWER_BASED_CDE", pBorrowerBasedCde);
			cmd.addParameter("@P_PELL_ORIG_IND", pPellOrigInd);
			cmd.addParameter("@P_PELL_DISB_LOCK_IND", pPellDisbLockInd);
			cmd.addParameter("@P_POST_BA_PELL_OVRD", pPostBaPellOvrd);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_ALTERNATE_PELL_IND", pAlternatePellInd);
			cmd.addParameter("@P_PELL_ATTEND_COST", pPellAttendCost);
			cmd.addParameter("@P_LOW_TUITION_COST", pLowTuitionCost);
			cmd.addParameter("@P_SUB_LOAN_EXCL_AMT", pSubLoanExclAmt);
			cmd.addParameter("@P_TGRP_CODE_LOCK_IND", pTgrpCodeLockInd);
			cmd.addParameter("@P_BGRP_CODE_LOCK_IND", pBgrpCodeLockInd);
			cmd.addParameter("@P_PGRP_CODE_LOCK_IND", pPgrpCodeLockInd);
			cmd.addParameter("@P_TRK_LTR_IND_DATE", pTrkLtrIndDate);
			cmd.addParameter("@P_TURN_OFF_PELL_IND", pTurnOffPellInd);
			cmd.addParameter("@P_VER_USER_ID", pVerUserId);
			cmd.addParameter("@P_VER_DATE", pVerDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PREP_OR_TEACH_IND", pPrepOrTeachInd);
			cmd.addParameter("@P_ACG_DISB_LOCK_IND", pAcgDisbLockInd);
			cmd.addParameter("@P_SMART_DISB_LOCK_IND", pSmartDisbLockInd);
			cmd.addParameter("@P_AUTO_ZERO_EFC_IND", pAutoZeroEfcInd);
			cmd.addParameter("@P_ADDL_PELL_ELIG_IND", pAddlPellEligInd);
			cmd.addParameter("@P_DEP_NO_PAR_DATA", pDepNoParData);
			cmd.addParameter("@P_APRD_CODE_PELL", pAprdCodePell);
			cmd.addParameter("@P_POST_911_PELL_ELIG", pPost911PellElig);
			cmd.addParameter("@P_PBUD_INFO_ACCESS_IND", pPbudInfoAccessInd);
			cmd.addParameter("@P_HIGH_PELL_LEU_FLAG", pHighPellLeuFlag);
			cmd.addParameter("@P_SS_INFO_ACCESS_IND", pSsInfoAccessInd);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAidyCode,NNumber pPidm,NString pLockInd,NString pPgrpLockInd,NString pBgrpProcInd,NString pPgrpProcInd,NString pTgrpProcInd,NString pPckgFundProcInd,NString pVerComplete,NString pUserId,NString pVerPayInd,NString pBgrpCode,NString pAprdCode,NString pPgrpCode,NString pTgrpCode,NString pRecalcNaInd,NNumber pPc,NNumber pSc,NDate pApplRcvdDate,NDate pPckgFundDate,NDate pNeedDate,NDate pPckgCompDate,NDate pAllReqCompDate,NDate pMemoReqCompDate,NDate pPckgReqCompDate,NDate pDisbReqCompDate,NNumber pPellSchedAwd,NNumber pPriSarPgi,NNumber pSecSarPgi,NDate pSarDate,NString pSarTranNo,NString pSarSsn,NString pSarInit,NString pCmScLockInd,NString pCmPcLockInd,NString pCmTfcLockInd,NString pPgiLockInd,NString pInstScLockInd,NString pInstPcLockInd,NNumber pGrsNeed,NNumber pUnmetNeed,NNumber pTfc,NString pAwdLtrInd,NNumber pResourceAmt,NDate pResourceActDate,NString pTrkLtrInd,NNumber pImGrsNeed,NNumber pImUnmetNeed,NNumber pImTfc,NString pAddlStfdEligInd,NString pImLock,NString pFmBatchLock,NString pImBatchLock,NString pNsldsOvrdInd,NString pFormerHealInd,NNumber pPellLtHalfCoa,NString pInfoAccessInd,NString pBorrowerBasedCde,NString pPellOrigInd,NString pPellDisbLockInd,NString pPostBaPellOvrd,NString pInfcCode,NString pAlternatePellInd,NNumber pPellAttendCost,NNumber pLowTuitionCost,NNumber pSubLoanExclAmt,NString pTgrpCodeLockInd,NString pBgrpCodeLockInd,NString pPgrpCodeLockInd,NDate pTrkLtrIndDate,NString pTurnOffPellInd,NString pVerUserId,NDate pVerDate,NString pDataOrigin,NString pPrepOrTeachInd,NString pAcgDisbLockInd,NString pSmartDisbLockInd,NString pAutoZeroEfcInd,NString pAddlPellEligInd,NString pDepNoParData,NString pBypassPidm,NString pAprdCodePell,NString pPost911PellElig,NString pPbudInfoAccessInd,NString pHighPellLeuFlag,NString pSsInfoAccessInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_STATUS_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_PGRP_LOCK_IND", pPgrpLockInd);
			cmd.addParameter("@P_BGRP_PROC_IND", pBgrpProcInd);
			cmd.addParameter("@P_PGRP_PROC_IND", pPgrpProcInd);
			cmd.addParameter("@P_TGRP_PROC_IND", pTgrpProcInd);
			cmd.addParameter("@P_PCKG_FUND_PROC_IND", pPckgFundProcInd);
			cmd.addParameter("@P_VER_COMPLETE", pVerComplete);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VER_PAY_IND", pVerPayInd);
			cmd.addParameter("@P_BGRP_CODE", pBgrpCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_PGRP_CODE", pPgrpCode);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_RECALC_NA_IND", pRecalcNaInd);
			cmd.addParameter("@P_PC", pPc);
			cmd.addParameter("@P_SC", pSc);
			cmd.addParameter("@P_APPL_RCVD_DATE", pApplRcvdDate);
			cmd.addParameter("@P_PCKG_FUND_DATE", pPckgFundDate);
			cmd.addParameter("@P_NEED_DATE", pNeedDate);
			cmd.addParameter("@P_PCKG_COMP_DATE", pPckgCompDate);
			cmd.addParameter("@P_ALL_REQ_COMP_DATE", pAllReqCompDate);
			cmd.addParameter("@P_MEMO_REQ_COMP_DATE", pMemoReqCompDate);
			cmd.addParameter("@P_PCKG_REQ_COMP_DATE", pPckgReqCompDate);
			cmd.addParameter("@P_DISB_REQ_COMP_DATE", pDisbReqCompDate);
			cmd.addParameter("@P_PELL_SCHED_AWD", pPellSchedAwd);
			cmd.addParameter("@P_PRI_SAR_PGI", pPriSarPgi);
			cmd.addParameter("@P_SEC_SAR_PGI", pSecSarPgi);
			cmd.addParameter("@P_SAR_DATE", pSarDate);
			cmd.addParameter("@P_SAR_TRAN_NO", pSarTranNo);
			cmd.addParameter("@P_SAR_SSN", pSarSsn);
			cmd.addParameter("@P_SAR_INIT", pSarInit);
			cmd.addParameter("@P_CM_SC_LOCK_IND", pCmScLockInd);
			cmd.addParameter("@P_CM_PC_LOCK_IND", pCmPcLockInd);
			cmd.addParameter("@P_CM_TFC_LOCK_IND", pCmTfcLockInd);
			cmd.addParameter("@P_PGI_LOCK_IND", pPgiLockInd);
			cmd.addParameter("@P_INST_SC_LOCK_IND", pInstScLockInd);
			cmd.addParameter("@P_INST_PC_LOCK_IND", pInstPcLockInd);
			cmd.addParameter("@P_GRS_NEED", pGrsNeed);
			cmd.addParameter("@P_UNMET_NEED", pUnmetNeed);
			cmd.addParameter("@P_TFC", pTfc);
			cmd.addParameter("@P_AWD_LTR_IND", pAwdLtrInd);
			cmd.addParameter("@P_RESOURCE_AMT", pResourceAmt);
			cmd.addParameter("@P_RESOURCE_ACT_DATE", pResourceActDate);
			cmd.addParameter("@P_TRK_LTR_IND", pTrkLtrInd);
			cmd.addParameter("@P_IM_GRS_NEED", pImGrsNeed);
			cmd.addParameter("@P_IM_UNMET_NEED", pImUnmetNeed);
			cmd.addParameter("@P_IM_TFC", pImTfc);
			cmd.addParameter("@P_ADDL_STFD_ELIG_IND", pAddlStfdEligInd);
			cmd.addParameter("@P_IM_LOCK", pImLock);
			cmd.addParameter("@P_FM_BATCH_LOCK", pFmBatchLock);
			cmd.addParameter("@P_IM_BATCH_LOCK", pImBatchLock);
			cmd.addParameter("@P_NSLDS_OVRD_IND", pNsldsOvrdInd);
			cmd.addParameter("@P_FORMER_HEAL_IND", pFormerHealInd);
			cmd.addParameter("@P_PELL_LT_HALF_COA", pPellLtHalfCoa);
			cmd.addParameter("@P_INFO_ACCESS_IND", pInfoAccessInd);
			cmd.addParameter("@P_BORROWER_BASED_CDE", pBorrowerBasedCde);
			cmd.addParameter("@P_PELL_ORIG_IND", pPellOrigInd);
			cmd.addParameter("@P_PELL_DISB_LOCK_IND", pPellDisbLockInd);
			cmd.addParameter("@P_POST_BA_PELL_OVRD", pPostBaPellOvrd);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_ALTERNATE_PELL_IND", pAlternatePellInd);
			cmd.addParameter("@P_PELL_ATTEND_COST", pPellAttendCost);
			cmd.addParameter("@P_LOW_TUITION_COST", pLowTuitionCost);
			cmd.addParameter("@P_SUB_LOAN_EXCL_AMT", pSubLoanExclAmt);
			cmd.addParameter("@P_TGRP_CODE_LOCK_IND", pTgrpCodeLockInd);
			cmd.addParameter("@P_BGRP_CODE_LOCK_IND", pBgrpCodeLockInd);
			cmd.addParameter("@P_PGRP_CODE_LOCK_IND", pPgrpCodeLockInd);
			cmd.addParameter("@P_TRK_LTR_IND_DATE", pTrkLtrIndDate);
			cmd.addParameter("@P_TURN_OFF_PELL_IND", pTurnOffPellInd);
			cmd.addParameter("@P_VER_USER_ID", pVerUserId);
			cmd.addParameter("@P_VER_DATE", pVerDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PREP_OR_TEACH_IND", pPrepOrTeachInd);
			cmd.addParameter("@P_ACG_DISB_LOCK_IND", pAcgDisbLockInd);
			cmd.addParameter("@P_SMART_DISB_LOCK_IND", pSmartDisbLockInd);
			cmd.addParameter("@P_AUTO_ZERO_EFC_IND", pAutoZeroEfcInd);
			cmd.addParameter("@P_ADDL_PELL_ELIG_IND", pAddlPellEligInd);
			cmd.addParameter("@P_DEP_NO_PAR_DATA", pDepNoParData);
			cmd.addParameter("@P_BYPASS_PIDM", pBypassPidm);
			cmd.addParameter("@P_APRD_CODE_PELL", pAprdCodePell);
			cmd.addParameter("@P_POST_911_PELL_ELIG", pPost911PellElig);
			cmd.addParameter("@P_PBUD_INFO_ACCESS_IND", pPbudInfoAccessInd);
			cmd.addParameter("@P_HIGH_PELL_LEU_FLAG", pHighPellLeuFlag);
			cmd.addParameter("@P_SS_INFO_ACCESS_IND", pSsInfoAccessInd);
				
			cmd.execute();


		}
		
	
	
	
}
