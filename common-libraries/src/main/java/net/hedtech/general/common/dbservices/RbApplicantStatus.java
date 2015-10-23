package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbApplicantStatus {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_STATUS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_STATUS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ApplicantStatusRecRow recOne,ApplicantStatusRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_STATUS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ApplicantStatusRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ApplicantStatusRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_STATUS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_STATUS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_STATUS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_STATUS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pLockInd,NString pPgrpLockInd,NString pBgrpProcInd,NString pPgrpProcInd,NString pTgrpProcInd,NString pPckgFundProcInd,NString pVerComplete,NString pUserId,NString pVerPayInd,NString pBgrpCode,NString pAprdCode,NString pPgrpCode,NString pTgrpCode,NString pRecalcNaInd,NNumber pPc,NNumber pSc,NDate pApplRcvdDate,NDate pPckgFundDate,NDate pNeedDate,NDate pPckgCompDate,NDate pAllReqCompDate,NDate pMemoReqCompDate,NDate pPckgReqCompDate,NDate pDisbReqCompDate,NNumber pPellSchedAwd,NNumber pPriSarPgi,NNumber pSecSarPgi,NDate pSarDate,NString pSarTranNo,NString pSarSsn,NString pSarInit,NString pCmScLockInd,NString pCmPcLockInd,NString pCmTfcLockInd,NString pPgiLockInd,NString pInstScLockInd,NString pInstPcLockInd,NNumber pGrsNeed,NNumber pUnmetNeed,NNumber pTfc,NString pAwdLtrInd,NNumber pResourceAmt,NDate pResourceActDate,NString pTrkLtrInd,NNumber pImGrsNeed,NNumber pImUnmetNeed,NNumber pImTfc,NString pAddlStfdEligInd,NString pImLock,NString pFmBatchLock,NString pImBatchLock,NString pNsldsOvrdInd,NString pFormerHealInd,NNumber pPellLtHalfCoa,NString pInfoAccessInd,NString pBorrowerBasedCde,NString pPellOrigInd,NString pPellDisbLockInd,NString pPostBaPellOvrd,NString pInfcCode,NString pAlternatePellInd,NNumber pPellAttendCost,NNumber pLowTuitionCost,NNumber pSubLoanExclAmt,NString pTgrpCodeLockInd,NString pBgrpCodeLockInd,NString pPgrpCodeLockInd,NDate pTrkLtrIndDate,NString pTurnOffPellInd,NString pVerUserId,NDate pVerDate,NString pDataOrigin,NString pPrepOrTeachInd,NString pAcgDisbLockInd,NString pSmartDisbLockInd,NString pAutoZeroEfcInd,NString pAddlPellEligInd,NString pDepNoParData,NString pAprdCodePell,NString pPost911PellElig,NString pPbudInfoAccessInd,NString pHighPellLeuFlag,NString pSsInfoAccessInd,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_STATUS.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pLock(NString pAidyCode,NNumber pPidm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_STATUS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pLockInd,NString pPgrpLockInd,NString pBgrpProcInd,NString pPgrpProcInd,NString pTgrpProcInd,NString pPckgFundProcInd,NString pVerComplete,NString pUserId,NString pVerPayInd,NString pBgrpCode,NString pAprdCode,NString pPgrpCode,NString pTgrpCode,NString pRecalcNaInd,NNumber pPc,NNumber pSc,NDate pApplRcvdDate,NDate pPckgFundDate,NDate pNeedDate,NDate pPckgCompDate,NDate pAllReqCompDate,NDate pMemoReqCompDate,NDate pPckgReqCompDate,NDate pDisbReqCompDate,NNumber pPellSchedAwd,NNumber pPriSarPgi,NNumber pSecSarPgi,NDate pSarDate,NString pSarTranNo,NString pSarSsn,NString pSarInit,NString pCmScLockInd,NString pCmPcLockInd,NString pCmTfcLockInd,NString pPgiLockInd,NString pInstScLockInd,NString pInstPcLockInd,NNumber pGrsNeed,NNumber pUnmetNeed,NNumber pTfc,NString pAwdLtrInd,NNumber pResourceAmt,NDate pResourceActDate,NString pTrkLtrInd,NNumber pImGrsNeed,NNumber pImUnmetNeed,NNumber pImTfc,NString pAddlStfdEligInd,NString pImLock,NString pFmBatchLock,NString pImBatchLock,NString pNsldsOvrdInd,NString pFormerHealInd,NNumber pPellLtHalfCoa,NString pInfoAccessInd,NString pBorrowerBasedCde,NString pPellOrigInd,NString pPellDisbLockInd,NString pPostBaPellOvrd,NString pInfcCode,NString pAlternatePellInd,NNumber pPellAttendCost,NNumber pLowTuitionCost,NNumber pSubLoanExclAmt,NString pTgrpCodeLockInd,NString pBgrpCodeLockInd,NString pPgrpCodeLockInd,NDate pTrkLtrIndDate,NString pTurnOffPellInd,NString pVerUserId,NDate pVerDate,NString pDataOrigin,NString pPrepOrTeachInd,NString pAcgDisbLockInd,NString pSmartDisbLockInd,NString pAutoZeroEfcInd,NString pAddlPellEligInd,NString pDepNoParData,NString pAprdCodePell,NString pPost911PellElig,NString pPbudInfoAccessInd,NString pHighPellLeuFlag,NString pSsInfoAccessInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_APPLICANT_STATUS.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ApplicantStatusRecRow", dataSourceName="APPLICANT_STATUS_REC")
	public static class ApplicantStatusRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_LOCK_IND")
		public NString RLockInd;
		@DbRecordField(dataSourceName="R_PGRP_LOCK_IND")
		public NString RPgrpLockInd;
		@DbRecordField(dataSourceName="R_BGRP_PROC_IND")
		public NString RBgrpProcInd;
		@DbRecordField(dataSourceName="R_PGRP_PROC_IND")
		public NString RPgrpProcInd;
		@DbRecordField(dataSourceName="R_TGRP_PROC_IND")
		public NString RTgrpProcInd;
		@DbRecordField(dataSourceName="R_PCKG_FUND_PROC_IND")
		public NString RPckgFundProcInd;
		@DbRecordField(dataSourceName="R_VER_COMPLETE")
		public NString RVerComplete;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_VER_PAY_IND")
		public NString RVerPayInd;
		@DbRecordField(dataSourceName="R_BGRP_CODE")
		public NString RBgrpCode;
		@DbRecordField(dataSourceName="R_APRD_CODE")
		public NString RAprdCode;
		@DbRecordField(dataSourceName="R_PGRP_CODE")
		public NString RPgrpCode;
		@DbRecordField(dataSourceName="R_TGRP_CODE")
		public NString RTgrpCode;
		@DbRecordField(dataSourceName="R_RECALC_NA_IND")
		public NString RRecalcNaInd;
		@DbRecordField(dataSourceName="R_PC")
		public NNumber RPc;
		@DbRecordField(dataSourceName="R_SC")
		public NNumber RSc;
		@DbRecordField(dataSourceName="R_APPL_RCVD_DATE")
		public NDate RApplRcvdDate;
		@DbRecordField(dataSourceName="R_PCKG_FUND_DATE")
		public NDate RPckgFundDate;
		@DbRecordField(dataSourceName="R_NEED_DATE")
		public NDate RNeedDate;
		@DbRecordField(dataSourceName="R_PCKG_COMP_DATE")
		public NDate RPckgCompDate;
		@DbRecordField(dataSourceName="R_ALL_REQ_COMP_DATE")
		public NDate RAllReqCompDate;
		@DbRecordField(dataSourceName="R_MEMO_REQ_COMP_DATE")
		public NDate RMemoReqCompDate;
		@DbRecordField(dataSourceName="R_PCKG_REQ_COMP_DATE")
		public NDate RPckgReqCompDate;
		@DbRecordField(dataSourceName="R_DISB_REQ_COMP_DATE")
		public NDate RDisbReqCompDate;
		@DbRecordField(dataSourceName="R_PELL_SCHED_AWD")
		public NNumber RPellSchedAwd;
		@DbRecordField(dataSourceName="R_PRI_SAR_PGI")
		public NNumber RPriSarPgi;
		@DbRecordField(dataSourceName="R_SEC_SAR_PGI")
		public NNumber RSecSarPgi;
		@DbRecordField(dataSourceName="R_SAR_DATE")
		public NDate RSarDate;
		@DbRecordField(dataSourceName="R_SAR_TRAN_NO")
		public NString RSarTranNo;
		@DbRecordField(dataSourceName="R_SAR_SSN")
		public NString RSarSsn;
		@DbRecordField(dataSourceName="R_SAR_INIT")
		public NString RSarInit;
		@DbRecordField(dataSourceName="R_CM_SC_LOCK_IND")
		public NString RCmScLockInd;
		@DbRecordField(dataSourceName="R_CM_PC_LOCK_IND")
		public NString RCmPcLockInd;
		@DbRecordField(dataSourceName="R_CM_TFC_LOCK_IND")
		public NString RCmTfcLockInd;
		@DbRecordField(dataSourceName="R_PGI_LOCK_IND")
		public NString RPgiLockInd;
		@DbRecordField(dataSourceName="R_INST_SC_LOCK_IND")
		public NString RInstScLockInd;
		@DbRecordField(dataSourceName="R_INST_PC_LOCK_IND")
		public NString RInstPcLockInd;
		@DbRecordField(dataSourceName="R_GRS_NEED")
		public NNumber RGrsNeed;
		@DbRecordField(dataSourceName="R_UNMET_NEED")
		public NNumber RUnmetNeed;
		@DbRecordField(dataSourceName="R_TFC")
		public NNumber RTfc;
		@DbRecordField(dataSourceName="R_AWD_LTR_IND")
		public NString RAwdLtrInd;
		@DbRecordField(dataSourceName="R_RESOURCE_AMT")
		public NNumber RResourceAmt;
		@DbRecordField(dataSourceName="R_RESOURCE_ACT_DATE")
		public NDate RResourceActDate;
		@DbRecordField(dataSourceName="R_TRK_LTR_IND")
		public NString RTrkLtrInd;
		@DbRecordField(dataSourceName="R_IM_GRS_NEED")
		public NNumber RImGrsNeed;
		@DbRecordField(dataSourceName="R_IM_UNMET_NEED")
		public NNumber RImUnmetNeed;
		@DbRecordField(dataSourceName="R_IM_TFC")
		public NNumber RImTfc;
		@DbRecordField(dataSourceName="R_ADDL_STFD_ELIG_IND")
		public NString RAddlStfdEligInd;
		@DbRecordField(dataSourceName="R_IM_LOCK")
		public NString RImLock;
		@DbRecordField(dataSourceName="R_FM_BATCH_LOCK")
		public NString RFmBatchLock;
		@DbRecordField(dataSourceName="R_IM_BATCH_LOCK")
		public NString RImBatchLock;
		@DbRecordField(dataSourceName="R_NSLDS_OVRD_IND")
		public NString RNsldsOvrdInd;
		@DbRecordField(dataSourceName="R_FORMER_HEAL_IND")
		public NString RFormerHealInd;
		@DbRecordField(dataSourceName="R_PELL_LT_HALF_COA")
		public NNumber RPellLtHalfCoa;
		@DbRecordField(dataSourceName="R_INFO_ACCESS_IND")
		public NString RInfoAccessInd;
		@DbRecordField(dataSourceName="R_BORROWER_BASED_CDE")
		public NString RBorrowerBasedCde;
		@DbRecordField(dataSourceName="R_PELL_ORIG_IND")
		public NString RPellOrigInd;
		@DbRecordField(dataSourceName="R_PELL_DISB_LOCK_IND")
		public NString RPellDisbLockInd;
		@DbRecordField(dataSourceName="R_POST_BA_PELL_OVRD")
		public NString RPostBaPellOvrd;
		@DbRecordField(dataSourceName="R_INFC_CODE")
		public NString RInfcCode;
		@DbRecordField(dataSourceName="R_ALTERNATE_PELL_IND")
		public NString RAlternatePellInd;
		@DbRecordField(dataSourceName="R_PELL_ATTEND_COST")
		public NNumber RPellAttendCost;
		@DbRecordField(dataSourceName="R_LOW_TUITION_COST")
		public NNumber RLowTuitionCost;
		@DbRecordField(dataSourceName="R_SUB_LOAN_EXCL_AMT")
		public NNumber RSubLoanExclAmt;
		@DbRecordField(dataSourceName="R_TGRP_CODE_LOCK_IND")
		public NString RTgrpCodeLockInd;
		@DbRecordField(dataSourceName="R_BGRP_CODE_LOCK_IND")
		public NString RBgrpCodeLockInd;
		@DbRecordField(dataSourceName="R_PGRP_CODE_LOCK_IND")
		public NString RPgrpCodeLockInd;
		@DbRecordField(dataSourceName="R_TRK_LTR_IND_DATE")
		public NDate RTrkLtrIndDate;
		@DbRecordField(dataSourceName="R_TURN_OFF_PELL_IND")
		public NString RTurnOffPellInd;
		@DbRecordField(dataSourceName="R_VER_USER_ID")
		public NString RVerUserId;
		@DbRecordField(dataSourceName="R_VER_DATE")
		public NDate RVerDate;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_PREP_OR_TEACH_IND")
		public NString RPrepOrTeachInd;
		@DbRecordField(dataSourceName="R_ACG_DISB_LOCK_IND")
		public NString RAcgDisbLockInd;
		@DbRecordField(dataSourceName="R_SMART_DISB_LOCK_IND")
		public NString RSmartDisbLockInd;
		@DbRecordField(dataSourceName="R_AUTO_ZERO_EFC_IND")
		public NString RAutoZeroEfcInd;
		@DbRecordField(dataSourceName="R_ADDL_PELL_ELIG_IND")
		public NString RAddlPellEligInd;
		@DbRecordField(dataSourceName="R_DEP_NO_PAR_DATA")
		public NString RDepNoParData;
		@DbRecordField(dataSourceName="R_APRD_CODE_PELL")
		public NString RAprdCodePell;
		@DbRecordField(dataSourceName="R_POST_911_PELL_ELIG")
		public NString RPost911PellElig;
		@DbRecordField(dataSourceName="R_PBUD_INFO_ACCESS_IND")
		public NString RPbudInfoAccessInd;
		@DbRecordField(dataSourceName="R_HIGH_PELL_LEU_FLAG")
		public NString RHighPellLeuFlag;
		@DbRecordField(dataSourceName="R_SS_INFO_ACCESS_IND")
		public NString RSsInfoAccessInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
