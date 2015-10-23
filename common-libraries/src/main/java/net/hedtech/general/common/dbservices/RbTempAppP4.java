package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbTempAppP4 {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P4.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P4.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TempAppP4RecRow recOne,TempAppP4RecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P4.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TempAppP4RecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TempAppP4RecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P4.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P4.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P4.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P4.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
//		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pRecType,NString pMdeIdNo,NString pCtrlNo,NDate pTapeRptExtrctDate,NString pInstRptType,NString pSectRWrittenExplain,NNumber pSectSInstId,NString pStSpecificInfo,NString pCInst1OutStTuit,NString pCInst1BudgName,NNumber pCInst1BudgDur,NNumber pCInst1TuitFee,NNumber pCInst1Books,NNumber pCInst1LivingExp,NNumber pCInst1TotExp,NNumber pCInst1TotCtrb,NNumber pCInst1TotParCtrb,NNumber pCInst1TotFamCtrb,NString pCInst1TfcOfflEst,NNumber pCInst1EstFaNeed,NNumber pCInst1EstPellAwrd,NNumber pCInst1EstStAwrd,NString pCInst2BudgName,NNumber pCInst2BudgDur,NNumber pCInst2TuitFee,NNumber pCInst2Books,NNumber pCInst2LivingExp,NNumber pCInst2TotExp,NNumber pCInst2TotCtrb,NNumber pCInst2TotParCtrb,NNumber pCInst2TotFamCtrb,NString pCInst2TfcOfflEst,NNumber pCInst2EstFaNeed,NNumber pCInst2EstPellAwrd,NNumber pCInst2EstStAwrd,NString pCInst3BudgName,NNumber pCInst3BudgDur,NNumber pCInst3TuitFee,NNumber pCInst3Books,NNumber pCInst3LivingExp,NNumber pCInst3TotExp,NNumber pCInst3TotCtrb,NNumber pCInst3TotParCtrb,NNumber pCInst3TotFamCtrb,NString pCInst3TfcOfflEst,NNumber pCInst3EstFaNeed,NNumber pCInst3EstPellAwrd,NNumber pCInst3EstStAwrd,NNumber pCInst1DependCare,NNumber pCInst2DependCare,NNumber pCInst3DependCare,NString pCNa1CtrbOfflEst,NNumber pCNa1CtrbForStdt,NString pCNa1AnlyType,NString pCNa2CtrbOfflEst,NNumber pCNa2CtrbForStdt,NString pCNa2AnlyType,NString pCNa1PCtrbOfflEst,NNumber pCNa1PCtrbForStdt,NString pCNa1PAnlyType,NString pCNa2PCtrbOfflEst,NNumber pCNa2PCtrbForStdt,NString pCNa2PAnlyType,NNumber pCNa1TotFamCtrb,NString pCNa1TfcOfflEst,NNumber pCNa2TotFamCtrb,NString pCNa2TfcOfflEst,NString pCNa1PellOfflEst,NNumber pCNa1PellPgi,NString pCNa2PellOfflEst,NNumber pCNa2PellPgi,NNumber pCNa1ImCtrbStdt,NString pCNa1ImAnlyType,NNumber pCNa2ImCtrbStdt,NString pCNa2ImAnlyType,NNumber pCNa1PImCtrbStdt,NString pCNa1PImAnlyType,NNumber pCNa2PImCtrbStdt,NString pCNa2PImAnlyType,NNumber pCNa1ImTotFamCtrb,NNumber pCNaFisapInc,NString pRecordMark,NString pCollSpecificInfo,NNumber pAdjEfc,NString pEfcType,NString pEsarUserDefFields,NString pCInst1AssumHous,NString pCInst2AssumHous,NString pCInst3AssumHous,NString pCInst4AssumHous,NNumber pCInst4BudgDur,NString pCInst4BudgName,NNumber pCInst4EstFaNeed,NNumber pCInst4EstPellAwrd,NNumber pCInst4LivingExp,NNumber pCInst4TotExp,NNumber pCInst4TotCtrb,NNumber pCInst4TotFamCtrb,NNumber pCInst4TotParCtrb,NNumber pCInst4TuitFee,NNumber pCInst4UnassessVa,NString pCInst5AssumHous,NNumber pCInst5BudgDur,NString pCInst5BudgName,NNumber pCInst5EstFaNeed,NNumber pCInst5EstPellAwrd,NNumber pCInst5LivingExp,NNumber pCInst5TotExp,NNumber pCInst5TotCtrb,NNumber pCInst5TotFamCtrb,NNumber pCInst5TotParCtrb,NNumber pCInst5TuitFee,NNumber pCInst5UnassessVa,NNumber pC2Inst1EstPellAwd,NNumber pC2Inst1TotFamCtrb,NNumber pC2Inst2EstPellAwd,NNumber pC2Inst2TotFamCtrb,NNumber pC2Inst3EstPellAwd,NNumber pC2Inst3TotFamCtrb,NNumber pC2Inst4EstPellAwd,NNumber pC2Inst4TotFamCtrb,NNumber pC2Inst5EstPellAwd,NNumber pC2Inst5TotFamCtrb,NNumber pPell1Efc,NNumber pPell2Efc,NNumber pSIvInc,NNumber pPIvInc,NString pCurrentPlus,NString pCurrentConsol,NString pWorkStudy,NString pLoanInt,NString pPlusInt,NNumber pSDivIntInc,NNumber pSFarmValFaf,NNumber pSFarmDbtFaf,NNumber pPFarmValFaf,NNumber pPFarmDbtFaf,NString pVerifNum,NString pAltOptTuit,NString pMsg31,NString pMsg72,NString pOldestLoanDate,NString pNsldsMatch,NNumber pBalOnSls,NString pCNa1ImPcInd,NNumber pIraKeoghAmt,NString pVisaClass,NNumber pC1IncAdj,NNumber pC1OthAllow,NNumber pC1IraKeogh,NNumber pC1TrustVal,NNumber pC1OthAsset,NNumber pC1OthAssetAllow,NNumber pC2IncAdj,NNumber pC2OthAllow,NNumber pC2IraKeogh,NNumber pC2TrustVal,NNumber pC2OthAsset,NNumber pC2OthAssetAllow,NNumber pCPar1IncAdj,NNumber pCPar1OthAllow,NNumber pCPar1OthAsset,NNumber pCPar1OthAssetAllw,NNumber pCPar2IncAdj,NNumber pCPar2OthAllow,NNumber pCPar2OthAsset,NNumber pCPar2OthAssetAllw,NString pTypeDataAvail,NString pImParDataAvail,NString pFmParDataAvail,NNumber pImBudgDurForCalc,NString pStateForTaxes,NString pParStateForTaxes,NString pFormulaForCalc,NString pTaxFiler,NString pParTaxFiler,NString pTypeFmCalc,NNumber pParDepCareAndMed,NNumber pExpParTuitPd,NNumber pExpParNoChildTuit,NNumber pHmeYrPurch,NNumber pHmePurchAmt,NNumber pCInst1OthCtrb,NNumber pSEic,NString pSsaCitizenInd,NNumber pSarEfc,NString pHsGedRcvd,NNumber pFisapInc,NString pEmailAddress,NString pNsldsTranNo,NString pDriversLicInd,NString pLegalResInd,NString pParLegalResInd,NString pTxRetFiledInd,NString pParTxRetFiledInd,NString p1040aEligInd,NString pPar1040aEligInd,NNumber pInvNetWorth,NNumber pParInvNetWorth,NNumber pBusNetWorth,NNumber pParBusNetWorth,NNumber pFarmNetWorth,NNumber pParFarmNetWorth,NDate pDeathDate,NString pVaMatchFlag,NNumber pFisap2Inc,NString pDrugOffenseConvic,NString pFathLastName,NString pMothLastName,NString pFathSsn,NString pMothSsn,NString pSubVerifSelected,NString pPResDateMoYr,NString pSResDateMoYr,NString pPrisonerMatchFlag,NString pHaveChildren,NNumber pParWorksheetC,NNumber pWorksheetC,NString pSourceCorrection,NString pEfcChangeInd,NString pDupSsnInd,NString pEarlyAdmFlag,NString pSecInsMatchInd,NNumber pWorksheetA,NNumber pParWorksheetA,NNumber pWorksheetB,NNumber pParWorksheetB,NString pSsMatch,NString pSsRegFlag,NString pFathFirstNameIni,NDate pFathBirthDate,NString pMothFirstNameIni,NDate pMothBirthDate,NString pPEmailAddress,NString pAddressChgFlag,NString pPushIsirFlag,NString pSarCChangeFlag,NString pCustodialParent,NNumber pCustParBasePctInc,NNumber pParBaseCtrbInc,NNumber pParBaseCtrbAssets,NNumber pParBaseTotCtrb,NString pUserId,NString pFeeWaiverInd,NString pWrkStdyLoansInt,NString pApFlag,NString pPar1Occupation,NString pPar1Employer,NString pPar2Occupation,NString pPar2Employer,NString pAdoptedAfter13,NString pHomeless,NNumber pCombatPay,NNumber pParNumBusinesses,NNumber pParNumFarms,NNumber pParCombatPay,NString pParentType1,NString pParentType2,NString pDodMatchFlag,NDate pDodParDeathDate,NString pHighSchoolName,NString pHighSchoolCity,NString pStatCodeHighSch,NString pHighSchoolCde,NString pHighSchoolFlg,NString pPAssetThreshExcd,NString pSAssetThreshExcd,NNumber pParFsaHealthCare,NNumber pParDependentCare,NNumber pParHealthSavAccount,Ref<NString> pRowidOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P4.P_CREATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_INFC_CODE", pInfcCode);
//			cmd.addParameter("@P_SEQ_NO", pSeqNo);
//			cmd.addParameter("@P_REC_TYPE", pRecType);
//			cmd.addParameter("@P_MDE_ID_NO", pMdeIdNo);
//			cmd.addParameter("@P_CTRL_NO", pCtrlNo);
//			cmd.addParameter("@P_TAPE_RPT_EXTRCT_DATE", pTapeRptExtrctDate);
//			cmd.addParameter("@P_INST_RPT_TYPE", pInstRptType);
//			cmd.addParameter("@P_SECT_R_WRITTEN_EXPLAIN", pSectRWrittenExplain);
//			cmd.addParameter("@P_SECT_S_INST_ID", pSectSInstId);
//			cmd.addParameter("@P_ST_SPECIFIC_INFO", pStSpecificInfo);
//			cmd.addParameter("@P_C_INST_1_OUT_ST_TUIT", pCInst1OutStTuit);
//			cmd.addParameter("@P_C_INST_1_BUDG_NAME", pCInst1BudgName);
//			cmd.addParameter("@P_C_INST_1_BUDG_DUR", pCInst1BudgDur);
//			cmd.addParameter("@P_C_INST_1_TUIT_FEE", pCInst1TuitFee);
//			cmd.addParameter("@P_C_INST_1_BOOKS", pCInst1Books);
//			cmd.addParameter("@P_C_INST_1_LIVING_EXP", pCInst1LivingExp);
//			cmd.addParameter("@P_C_INST_1_TOT_EXP", pCInst1TotExp);
//			cmd.addParameter("@P_C_INST_1_TOT_CTRB", pCInst1TotCtrb);
//			cmd.addParameter("@P_C_INST_1_TOT_PAR_CTRB", pCInst1TotParCtrb);
//			cmd.addParameter("@P_C_INST_1_TOT_FAM_CTRB", pCInst1TotFamCtrb);
//			cmd.addParameter("@P_C_INST_1_TFC_OFFL_EST", pCInst1TfcOfflEst);
//			cmd.addParameter("@P_C_INST_1_EST_FA_NEED", pCInst1EstFaNeed);
//			cmd.addParameter("@P_C_INST_1_EST_PELL_AWRD", pCInst1EstPellAwrd);
//			cmd.addParameter("@P_C_INST_1_EST_ST_AWRD", pCInst1EstStAwrd);
//			cmd.addParameter("@P_C_INST_2_BUDG_NAME", pCInst2BudgName);
//			cmd.addParameter("@P_C_INST_2_BUDG_DUR", pCInst2BudgDur);
//			cmd.addParameter("@P_C_INST_2_TUIT_FEE", pCInst2TuitFee);
//			cmd.addParameter("@P_C_INST_2_BOOKS", pCInst2Books);
//			cmd.addParameter("@P_C_INST_2_LIVING_EXP", pCInst2LivingExp);
//			cmd.addParameter("@P_C_INST_2_TOT_EXP", pCInst2TotExp);
//			cmd.addParameter("@P_C_INST_2_TOT_CTRB", pCInst2TotCtrb);
//			cmd.addParameter("@P_C_INST_2_TOT_PAR_CTRB", pCInst2TotParCtrb);
//			cmd.addParameter("@P_C_INST_2_TOT_FAM_CTRB", pCInst2TotFamCtrb);
//			cmd.addParameter("@P_C_INST_2_TFC_OFFL_EST", pCInst2TfcOfflEst);
//			cmd.addParameter("@P_C_INST_2_EST_FA_NEED", pCInst2EstFaNeed);
//			cmd.addParameter("@P_C_INST_2_EST_PELL_AWRD", pCInst2EstPellAwrd);
//			cmd.addParameter("@P_C_INST_2_EST_ST_AWRD", pCInst2EstStAwrd);
//			cmd.addParameter("@P_C_INST_3_BUDG_NAME", pCInst3BudgName);
//			cmd.addParameter("@P_C_INST_3_BUDG_DUR", pCInst3BudgDur);
//			cmd.addParameter("@P_C_INST_3_TUIT_FEE", pCInst3TuitFee);
//			cmd.addParameter("@P_C_INST_3_BOOKS", pCInst3Books);
//			cmd.addParameter("@P_C_INST_3_LIVING_EXP", pCInst3LivingExp);
//			cmd.addParameter("@P_C_INST_3_TOT_EXP", pCInst3TotExp);
//			cmd.addParameter("@P_C_INST_3_TOT_CTRB", pCInst3TotCtrb);
//			cmd.addParameter("@P_C_INST_3_TOT_PAR_CTRB", pCInst3TotParCtrb);
//			cmd.addParameter("@P_C_INST_3_TOT_FAM_CTRB", pCInst3TotFamCtrb);
//			cmd.addParameter("@P_C_INST_3_TFC_OFFL_EST", pCInst3TfcOfflEst);
//			cmd.addParameter("@P_C_INST_3_EST_FA_NEED", pCInst3EstFaNeed);
//			cmd.addParameter("@P_C_INST_3_EST_PELL_AWRD", pCInst3EstPellAwrd);
//			cmd.addParameter("@P_C_INST_3_EST_ST_AWRD", pCInst3EstStAwrd);
//			cmd.addParameter("@P_C_INST_1_DEPEND_CARE", pCInst1DependCare);
//			cmd.addParameter("@P_C_INST_2_DEPEND_CARE", pCInst2DependCare);
//			cmd.addParameter("@P_C_INST_3_DEPEND_CARE", pCInst3DependCare);
//			cmd.addParameter("@P_C_NA_1_CTRB_OFFL_EST", pCNa1CtrbOfflEst);
//			cmd.addParameter("@P_C_NA_1_CTRB_FOR_STDT", pCNa1CtrbForStdt);
//			cmd.addParameter("@P_C_NA_1_ANLY_TYPE", pCNa1AnlyType);
//			cmd.addParameter("@P_C_NA_2_CTRB_OFFL_EST", pCNa2CtrbOfflEst);
//			cmd.addParameter("@P_C_NA_2_CTRB_FOR_STDT", pCNa2CtrbForStdt);
//			cmd.addParameter("@P_C_NA_2_ANLY_TYPE", pCNa2AnlyType);
//			cmd.addParameter("@P_C_NA_1_P_CTRB_OFFL_EST", pCNa1PCtrbOfflEst);
//			cmd.addParameter("@P_C_NA_1_P_CTRB_FOR_STDT", pCNa1PCtrbForStdt);
//			cmd.addParameter("@P_C_NA_1_P_ANLY_TYPE", pCNa1PAnlyType);
//			cmd.addParameter("@P_C_NA_2_P_CTRB_OFFL_EST", pCNa2PCtrbOfflEst);
//			cmd.addParameter("@P_C_NA_2_P_CTRB_FOR_STDT", pCNa2PCtrbForStdt);
//			cmd.addParameter("@P_C_NA_2_P_ANLY_TYPE", pCNa2PAnlyType);
//			cmd.addParameter("@P_C_NA_1_TOT_FAM_CTRB", pCNa1TotFamCtrb);
//			cmd.addParameter("@P_C_NA_1_TFC_OFFL_EST", pCNa1TfcOfflEst);
//			cmd.addParameter("@P_C_NA_2_TOT_FAM_CTRB", pCNa2TotFamCtrb);
//			cmd.addParameter("@P_C_NA_2_TFC_OFFL_EST", pCNa2TfcOfflEst);
//			cmd.addParameter("@P_C_NA_1_PELL_OFFL_EST", pCNa1PellOfflEst);
//			cmd.addParameter("@P_C_NA_1_PELL_PGI", pCNa1PellPgi);
//			cmd.addParameter("@P_C_NA_2_PELL_OFFL_EST", pCNa2PellOfflEst);
//			cmd.addParameter("@P_C_NA_2_PELL_PGI", pCNa2PellPgi);
//			cmd.addParameter("@P_C_NA_1_IM_CTRB_STDT", pCNa1ImCtrbStdt);
//			cmd.addParameter("@P_C_NA_1_IM_ANLY_TYPE", pCNa1ImAnlyType);
//			cmd.addParameter("@P_C_NA_2_IM_CTRB_STDT", pCNa2ImCtrbStdt);
//			cmd.addParameter("@P_C_NA_2_IM_ANLY_TYPE", pCNa2ImAnlyType);
//			cmd.addParameter("@P_C_NA_1_P_IM_CTRB_STDT", pCNa1PImCtrbStdt);
//			cmd.addParameter("@P_C_NA_1_P_IM_ANLY_TYPE", pCNa1PImAnlyType);
//			cmd.addParameter("@P_C_NA_2_P_IM_CTRB_STDT", pCNa2PImCtrbStdt);
//			cmd.addParameter("@P_C_NA_2_P_IM_ANLY_TYPE", pCNa2PImAnlyType);
//			cmd.addParameter("@P_C_NA_1_IM_TOT_FAM_CTRB", pCNa1ImTotFamCtrb);
//			cmd.addParameter("@P_C_NA_FISAP_INC", pCNaFisapInc);
//			cmd.addParameter("@P_RECORD_MARK", pRecordMark);
//			cmd.addParameter("@P_COLL_SPECIFIC_INFO", pCollSpecificInfo);
//			cmd.addParameter("@P_ADJ_EFC", pAdjEfc);
//			cmd.addParameter("@P_EFC_TYPE", pEfcType);
//			cmd.addParameter("@P_ESAR_USER_DEF_FIELDS", pEsarUserDefFields);
//			cmd.addParameter("@P_C_INST_1_ASSUM_HOUS", pCInst1AssumHous);
//			cmd.addParameter("@P_C_INST_2_ASSUM_HOUS", pCInst2AssumHous);
//			cmd.addParameter("@P_C_INST_3_ASSUM_HOUS", pCInst3AssumHous);
//			cmd.addParameter("@P_C_INST_4_ASSUM_HOUS", pCInst4AssumHous);
//			cmd.addParameter("@P_C_INST_4_BUDG_DUR", pCInst4BudgDur);
//			cmd.addParameter("@P_C_INST_4_BUDG_NAME", pCInst4BudgName);
//			cmd.addParameter("@P_C_INST_4_EST_FA_NEED", pCInst4EstFaNeed);
//			cmd.addParameter("@P_C_INST_4_EST_PELL_AWRD", pCInst4EstPellAwrd);
//			cmd.addParameter("@P_C_INST_4_LIVING_EXP", pCInst4LivingExp);
//			cmd.addParameter("@P_C_INST_4_TOT_EXP", pCInst4TotExp);
//			cmd.addParameter("@P_C_INST_4_TOT_CTRB", pCInst4TotCtrb);
//			cmd.addParameter("@P_C_INST_4_TOT_FAM_CTRB", pCInst4TotFamCtrb);
//			cmd.addParameter("@P_C_INST_4_TOT_PAR_CTRB", pCInst4TotParCtrb);
//			cmd.addParameter("@P_C_INST_4_TUIT_FEE", pCInst4TuitFee);
//			cmd.addParameter("@P_C_INST_4_UNASSESS_VA", pCInst4UnassessVa);
//			cmd.addParameter("@P_C_INST_5_ASSUM_HOUS", pCInst5AssumHous);
//			cmd.addParameter("@P_C_INST_5_BUDG_DUR", pCInst5BudgDur);
//			cmd.addParameter("@P_C_INST_5_BUDG_NAME", pCInst5BudgName);
//			cmd.addParameter("@P_C_INST_5_EST_FA_NEED", pCInst5EstFaNeed);
//			cmd.addParameter("@P_C_INST_5_EST_PELL_AWRD", pCInst5EstPellAwrd);
//			cmd.addParameter("@P_C_INST_5_LIVING_EXP", pCInst5LivingExp);
//			cmd.addParameter("@P_C_INST_5_TOT_EXP", pCInst5TotExp);
//			cmd.addParameter("@P_C_INST_5_TOT_CTRB", pCInst5TotCtrb);
//			cmd.addParameter("@P_C_INST_5_TOT_FAM_CTRB", pCInst5TotFamCtrb);
//			cmd.addParameter("@P_C_INST_5_TOT_PAR_CTRB", pCInst5TotParCtrb);
//			cmd.addParameter("@P_C_INST_5_TUIT_FEE", pCInst5TuitFee);
//			cmd.addParameter("@P_C_INST_5_UNASSESS_VA", pCInst5UnassessVa);
//			cmd.addParameter("@P_C2_INST_1_EST_PELL_AWD", pC2Inst1EstPellAwd);
//			cmd.addParameter("@P_C2_INST_1_TOT_FAM_CTRB", pC2Inst1TotFamCtrb);
//			cmd.addParameter("@P_C2_INST_2_EST_PELL_AWD", pC2Inst2EstPellAwd);
//			cmd.addParameter("@P_C2_INST_2_TOT_FAM_CTRB", pC2Inst2TotFamCtrb);
//			cmd.addParameter("@P_C2_INST_3_EST_PELL_AWD", pC2Inst3EstPellAwd);
//			cmd.addParameter("@P_C2_INST_3_TOT_FAM_CTRB", pC2Inst3TotFamCtrb);
//			cmd.addParameter("@P_C2_INST_4_EST_PELL_AWD", pC2Inst4EstPellAwd);
//			cmd.addParameter("@P_C2_INST_4_TOT_FAM_CTRB", pC2Inst4TotFamCtrb);
//			cmd.addParameter("@P_C2_INST_5_EST_PELL_AWD", pC2Inst5EstPellAwd);
//			cmd.addParameter("@P_C2_INST_5_TOT_FAM_CTRB", pC2Inst5TotFamCtrb);
//			cmd.addParameter("@P_PELL_1_EFC", pPell1Efc);
//			cmd.addParameter("@P_PELL_2_EFC", pPell2Efc);
//			cmd.addParameter("@P_S_IV_INC", pSIvInc);
//			cmd.addParameter("@P_P_IV_INC", pPIvInc);
//			cmd.addParameter("@P_CURRENT_PLUS", pCurrentPlus);
//			cmd.addParameter("@P_CURRENT_CONSOL", pCurrentConsol);
//			cmd.addParameter("@P_WORK_STUDY", pWorkStudy);
//			cmd.addParameter("@P_LOAN_INT", pLoanInt);
//			cmd.addParameter("@P_PLUS_INT", pPlusInt);
//			cmd.addParameter("@P_S_DIV_INT_INC", pSDivIntInc);
//			cmd.addParameter("@P_S_FARM_VAL_FAF", pSFarmValFaf);
//			cmd.addParameter("@P_S_FARM_DBT_FAF", pSFarmDbtFaf);
//			cmd.addParameter("@P_P_FARM_VAL_FAF", pPFarmValFaf);
//			cmd.addParameter("@P_P_FARM_DBT_FAF", pPFarmDbtFaf);
//			cmd.addParameter("@P_VERIF_NUM", pVerifNum);
//			cmd.addParameter("@P_ALT_OPT_TUIT", pAltOptTuit);
//			cmd.addParameter("@P_MSG_31", pMsg31);
//			cmd.addParameter("@P_MSG_72", pMsg72);
//			cmd.addParameter("@P_OLDEST_LOAN_DATE", pOldestLoanDate);
//			cmd.addParameter("@P_NSLDS_MATCH", pNsldsMatch);
//			cmd.addParameter("@P_BAL_ON_SLS", pBalOnSls);
//			cmd.addParameter("@P_C_NA_1_IM_PC_IND", pCNa1ImPcInd);
//			cmd.addParameter("@P_IRA_KEOGH_AMT", pIraKeoghAmt);
//			cmd.addParameter("@P_VISA_CLASS", pVisaClass);
//			cmd.addParameter("@P_C_1_INC_ADJ", pC1IncAdj);
//			cmd.addParameter("@P_C_1_OTH_ALLOW", pC1OthAllow);
//			cmd.addParameter("@P_C_1_IRA_KEOGH", pC1IraKeogh);
//			cmd.addParameter("@P_C_1_TRUST_VAL", pC1TrustVal);
//			cmd.addParameter("@P_C_1_OTH_ASSET", pC1OthAsset);
//			cmd.addParameter("@P_C_1_OTH_ASSET_ALLOW", pC1OthAssetAllow);
//			cmd.addParameter("@P_C_2_INC_ADJ", pC2IncAdj);
//			cmd.addParameter("@P_C_2_OTH_ALLOW", pC2OthAllow);
//			cmd.addParameter("@P_C_2_IRA_KEOGH", pC2IraKeogh);
//			cmd.addParameter("@P_C_2_TRUST_VAL", pC2TrustVal);
//			cmd.addParameter("@P_C_2_OTH_ASSET", pC2OthAsset);
//			cmd.addParameter("@P_C_2_OTH_ASSET_ALLOW", pC2OthAssetAllow);
//			cmd.addParameter("@P_C_PAR_1_INC_ADJ", pCPar1IncAdj);
//			cmd.addParameter("@P_C_PAR_1_OTH_ALLOW", pCPar1OthAllow);
//			cmd.addParameter("@P_C_PAR_1_OTH_ASSET", pCPar1OthAsset);
//			cmd.addParameter("@P_C_PAR_1_OTH_ASSET_ALLW", pCPar1OthAssetAllw);
//			cmd.addParameter("@P_C_PAR_2_INC_ADJ", pCPar2IncAdj);
//			cmd.addParameter("@P_C_PAR_2_OTH_ALLOW", pCPar2OthAllow);
//			cmd.addParameter("@P_C_PAR_2_OTH_ASSET", pCPar2OthAsset);
//			cmd.addParameter("@P_C_PAR_2_OTH_ASSET_ALLW", pCPar2OthAssetAllw);
//			cmd.addParameter("@P_TYPE_DATA_AVAIL", pTypeDataAvail);
//			cmd.addParameter("@P_IM_PAR_DATA_AVAIL", pImParDataAvail);
//			cmd.addParameter("@P_FM_PAR_DATA_AVAIL", pFmParDataAvail);
//			cmd.addParameter("@P_IM_BUDG_DUR_FOR_CALC", pImBudgDurForCalc);
//			cmd.addParameter("@P_STATE_FOR_TAXES", pStateForTaxes);
//			cmd.addParameter("@P_PAR_STATE_FOR_TAXES", pParStateForTaxes);
//			cmd.addParameter("@P_FORMULA_FOR_CALC", pFormulaForCalc);
//			cmd.addParameter("@P_TAX_FILER", pTaxFiler);
//			cmd.addParameter("@P_PAR_TAX_FILER", pParTaxFiler);
//			cmd.addParameter("@P_TYPE_FM_CALC", pTypeFmCalc);
//			cmd.addParameter("@P_PAR_DEP_CARE_AND_MED", pParDepCareAndMed);
//			cmd.addParameter("@P_EXP_PAR_TUIT_PD", pExpParTuitPd);
//			cmd.addParameter("@P_EXP_PAR_NO_CHILD_TUIT", pExpParNoChildTuit);
//			cmd.addParameter("@P_HME_YR_PURCH", pHmeYrPurch);
//			cmd.addParameter("@P_HME_PURCH_AMT", pHmePurchAmt);
//			cmd.addParameter("@P_C_INST_1_OTH_CTRB", pCInst1OthCtrb);
//			cmd.addParameter("@P_S_EIC", pSEic);
//			cmd.addParameter("@P_SSA_CITIZEN_IND", pSsaCitizenInd);
//			cmd.addParameter("@P_SAR_EFC", pSarEfc);
//			cmd.addParameter("@P_HS_GED_RCVD", pHsGedRcvd);
//			cmd.addParameter("@P_FISAP_INC", pFisapInc);
//			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
//			cmd.addParameter("@P_NSLDS_TRAN_NO", pNsldsTranNo);
//			cmd.addParameter("@P_DRIVERS_LIC_IND", pDriversLicInd);
//			cmd.addParameter("@P_LEGAL_RES_IND", pLegalResInd);
//			cmd.addParameter("@P_PAR_LEGAL_RES_IND", pParLegalResInd);
//			cmd.addParameter("@P_TX_RET_FILED_IND", pTxRetFiledInd);
//			cmd.addParameter("@P_PAR_TX_RET_FILED_IND", pParTxRetFiledInd);
//			cmd.addParameter("@P_1040A_ELIG_IND", p1040aEligInd);
//			cmd.addParameter("@P_PAR_1040A_ELIG_IND", pPar1040aEligInd);
//			cmd.addParameter("@P_INV_NET_WORTH", pInvNetWorth);
//			cmd.addParameter("@P_PAR_INV_NET_WORTH", pParInvNetWorth);
//			cmd.addParameter("@P_BUS_NET_WORTH", pBusNetWorth);
//			cmd.addParameter("@P_PAR_BUS_NET_WORTH", pParBusNetWorth);
//			cmd.addParameter("@P_FARM_NET_WORTH", pFarmNetWorth);
//			cmd.addParameter("@P_PAR_FARM_NET_WORTH", pParFarmNetWorth);
//			cmd.addParameter("@P_DEATH_DATE", pDeathDate);
//			cmd.addParameter("@P_VA_MATCH_FLAG", pVaMatchFlag);
//			cmd.addParameter("@P_FISAP_2_INC", pFisap2Inc);
//			cmd.addParameter("@P_DRUG_OFFENSE_CONVIC", pDrugOffenseConvic);
//			cmd.addParameter("@P_FATH_LAST_NAME", pFathLastName);
//			cmd.addParameter("@P_MOTH_LAST_NAME", pMothLastName);
//			cmd.addParameter("@P_FATH_SSN", pFathSsn);
//			cmd.addParameter("@P_MOTH_SSN", pMothSsn);
//			cmd.addParameter("@P_SUB_VERIF_SELECTED", pSubVerifSelected);
//			cmd.addParameter("@P_P_RES_DATE_MO_YR", pPResDateMoYr);
//			cmd.addParameter("@P_S_RES_DATE_MO_YR", pSResDateMoYr);
//			cmd.addParameter("@P_PRISONER_MATCH_FLAG", pPrisonerMatchFlag);
//			cmd.addParameter("@P_HAVE_CHILDREN", pHaveChildren);
//			cmd.addParameter("@P_PAR_WORKSHEET_C", pParWorksheetC);
//			cmd.addParameter("@P_WORKSHEET_C", pWorksheetC);
//			cmd.addParameter("@P_SOURCE_CORRECTION", pSourceCorrection);
//			cmd.addParameter("@P_EFC_CHANGE_IND", pEfcChangeInd);
//			cmd.addParameter("@P_DUP_SSN_IND", pDupSsnInd);
//			cmd.addParameter("@P_EARLY_ADM_FLAG", pEarlyAdmFlag);
//			cmd.addParameter("@P_SEC_INS_MATCH_IND", pSecInsMatchInd);
//			cmd.addParameter("@P_WORKSHEET_A", pWorksheetA);
//			cmd.addParameter("@P_PAR_WORKSHEET_A", pParWorksheetA);
//			cmd.addParameter("@P_WORKSHEET_B", pWorksheetB);
//			cmd.addParameter("@P_PAR_WORKSHEET_B", pParWorksheetB);
//			cmd.addParameter("@P_SS_MATCH", pSsMatch);
//			cmd.addParameter("@P_SS_REG_FLAG", pSsRegFlag);
//			cmd.addParameter("@P_FATH_FIRST_NAME_INI", pFathFirstNameIni);
//			cmd.addParameter("@P_FATH_BIRTH_DATE", pFathBirthDate);
//			cmd.addParameter("@P_MOTH_FIRST_NAME_INI", pMothFirstNameIni);
//			cmd.addParameter("@P_MOTH_BIRTH_DATE", pMothBirthDate);
//			cmd.addParameter("@P_P_EMAIL_ADDRESS", pPEmailAddress);
//			cmd.addParameter("@P_ADDRESS_CHG_FLAG", pAddressChgFlag);
//			cmd.addParameter("@P_PUSH_ISIR_FLAG", pPushIsirFlag);
//			cmd.addParameter("@P_SAR_C_CHANGE_FLAG", pSarCChangeFlag);
//			cmd.addParameter("@P_CUSTODIAL_PARENT", pCustodialParent);
//			cmd.addParameter("@P_CUST_PAR_BASE_PCT_INC", pCustParBasePctInc);
//			cmd.addParameter("@P_PAR_BASE_CTRB_INC", pParBaseCtrbInc);
//			cmd.addParameter("@P_PAR_BASE_CTRB_ASSETS", pParBaseCtrbAssets);
//			cmd.addParameter("@P_PAR_BASE_TOT_CTRB", pParBaseTotCtrb);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_FEE_WAIVER_IND", pFeeWaiverInd);
//			cmd.addParameter("@P_WRK_STDY_LOANS_INT", pWrkStdyLoansInt);
//			cmd.addParameter("@P_AP_FLAG", pApFlag);
//			cmd.addParameter("@P_PAR1_OCCUPATION", pPar1Occupation);
//			cmd.addParameter("@P_PAR1_EMPLOYER", pPar1Employer);
//			cmd.addParameter("@P_PAR2_OCCUPATION", pPar2Occupation);
//			cmd.addParameter("@P_PAR2_EMPLOYER", pPar2Employer);
//			cmd.addParameter("@P_ADOPTED_AFTER_13", pAdoptedAfter13);
//			cmd.addParameter("@P_HOMELESS", pHomeless);
//			cmd.addParameter("@P_COMBAT_PAY", pCombatPay);
//			cmd.addParameter("@P_PAR_NUM_BUSINESSES", pParNumBusinesses);
//			cmd.addParameter("@P_PAR_NUM_FARMS", pParNumFarms);
//			cmd.addParameter("@P_PAR_COMBAT_PAY", pParCombatPay);
//			cmd.addParameter("@P_PARENT_TYPE_1", pParentType1);
//			cmd.addParameter("@P_PARENT_TYPE_2", pParentType2);
//			cmd.addParameter("@P_DOD_MATCH_FLAG", pDodMatchFlag);
//			cmd.addParameter("@P_DOD_PAR_DEATH_DATE", pDodParDeathDate);
//			cmd.addParameter("@P_HIGH_SCHOOL_NAME", pHighSchoolName);
//			cmd.addParameter("@P_HIGH_SCHOOL_CITY", pHighSchoolCity);
//			cmd.addParameter("@P_STAT_CODE_HIGH_SCH", pStatCodeHighSch);
//			cmd.addParameter("@P_HIGH_SCHOOL_CDE", pHighSchoolCde);
//			cmd.addParameter("@P_HIGH_SCHOOL_FLG", pHighSchoolFlg);
//			cmd.addParameter("@P_P_ASSET_THRESH_EXCD", pPAssetThreshExcd);
//			cmd.addParameter("@P_S_ASSET_THRESH_EXCD", pSAssetThreshExcd);
//			cmd.addParameter("@P_PAR_FSA_HEALTH_CARE", pParFsaHealthCare);
//			cmd.addParameter("@P_PAR_DEPENDENT_CARE", pParDependentCare);
//			cmd.addParameter("@P_PAR_HEALTH_SAV_ACCOUNT", pParHealthSavAccount);
//			cmd.addParameter("@P_ROWID_OUT", NString.class);
//				
//			cmd.execute();
//			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);
//
//
//		}
		
		public static void pDelete(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P4.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteBulk(NString pAidyCode,NString pInfcCode,NString pDeleteFlag,Ref<NNumber> pDelCountOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P4.P_DELETE_BULK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_DELETE_FLAG", pDeleteFlag);
			cmd.addParameter("@P_DEL_COUNT_OUT", NNumber.class);
				
			cmd.execute();
			pDelCountOut.val = cmd.getParameterValue("@P_DEL_COUNT_OUT", NNumber.class);


		}
		
		public static void pLock(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P4.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
//		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pRecType,NString pMdeIdNo,NString pCtrlNo,NDate pTapeRptExtrctDate,NString pInstRptType,NString pSectRWrittenExplain,NNumber pSectSInstId,NString pStSpecificInfo,NString pCInst1OutStTuit,NString pCInst1BudgName,NNumber pCInst1BudgDur,NNumber pCInst1TuitFee,NNumber pCInst1Books,NNumber pCInst1LivingExp,NNumber pCInst1TotExp,NNumber pCInst1TotCtrb,NNumber pCInst1TotParCtrb,NNumber pCInst1TotFamCtrb,NString pCInst1TfcOfflEst,NNumber pCInst1EstFaNeed,NNumber pCInst1EstPellAwrd,NNumber pCInst1EstStAwrd,NString pCInst2BudgName,NNumber pCInst2BudgDur,NNumber pCInst2TuitFee,NNumber pCInst2Books,NNumber pCInst2LivingExp,NNumber pCInst2TotExp,NNumber pCInst2TotCtrb,NNumber pCInst2TotParCtrb,NNumber pCInst2TotFamCtrb,NString pCInst2TfcOfflEst,NNumber pCInst2EstFaNeed,NNumber pCInst2EstPellAwrd,NNumber pCInst2EstStAwrd,NString pCInst3BudgName,NNumber pCInst3BudgDur,NNumber pCInst3TuitFee,NNumber pCInst3Books,NNumber pCInst3LivingExp,NNumber pCInst3TotExp,NNumber pCInst3TotCtrb,NNumber pCInst3TotParCtrb,NNumber pCInst3TotFamCtrb,NString pCInst3TfcOfflEst,NNumber pCInst3EstFaNeed,NNumber pCInst3EstPellAwrd,NNumber pCInst3EstStAwrd,NNumber pCInst1DependCare,NNumber pCInst2DependCare,NNumber pCInst3DependCare,NString pCNa1CtrbOfflEst,NNumber pCNa1CtrbForStdt,NString pCNa1AnlyType,NString pCNa2CtrbOfflEst,NNumber pCNa2CtrbForStdt,NString pCNa2AnlyType,NString pCNa1PCtrbOfflEst,NNumber pCNa1PCtrbForStdt,NString pCNa1PAnlyType,NString pCNa2PCtrbOfflEst,NNumber pCNa2PCtrbForStdt,NString pCNa2PAnlyType,NNumber pCNa1TotFamCtrb,NString pCNa1TfcOfflEst,NNumber pCNa2TotFamCtrb,NString pCNa2TfcOfflEst,NString pCNa1PellOfflEst,NNumber pCNa1PellPgi,NString pCNa2PellOfflEst,NNumber pCNa2PellPgi,NNumber pCNa1ImCtrbStdt,NString pCNa1ImAnlyType,NNumber pCNa2ImCtrbStdt,NString pCNa2ImAnlyType,NNumber pCNa1PImCtrbStdt,NString pCNa1PImAnlyType,NNumber pCNa2PImCtrbStdt,NString pCNa2PImAnlyType,NNumber pCNa1ImTotFamCtrb,NNumber pCNaFisapInc,NString pRecordMark,NString pCollSpecificInfo,NNumber pAdjEfc,NString pEfcType,NString pEsarUserDefFields,NString pCInst1AssumHous,NString pCInst2AssumHous,NString pCInst3AssumHous,NString pCInst4AssumHous,NNumber pCInst4BudgDur,NString pCInst4BudgName,NNumber pCInst4EstFaNeed,NNumber pCInst4EstPellAwrd,NNumber pCInst4LivingExp,NNumber pCInst4TotExp,NNumber pCInst4TotCtrb,NNumber pCInst4TotFamCtrb,NNumber pCInst4TotParCtrb,NNumber pCInst4TuitFee,NNumber pCInst4UnassessVa,NString pCInst5AssumHous,NNumber pCInst5BudgDur,NString pCInst5BudgName,NNumber pCInst5EstFaNeed,NNumber pCInst5EstPellAwrd,NNumber pCInst5LivingExp,NNumber pCInst5TotExp,NNumber pCInst5TotCtrb,NNumber pCInst5TotFamCtrb,NNumber pCInst5TotParCtrb,NNumber pCInst5TuitFee,NNumber pCInst5UnassessVa,NNumber pC2Inst1EstPellAwd,NNumber pC2Inst1TotFamCtrb,NNumber pC2Inst2EstPellAwd,NNumber pC2Inst2TotFamCtrb,NNumber pC2Inst3EstPellAwd,NNumber pC2Inst3TotFamCtrb,NNumber pC2Inst4EstPellAwd,NNumber pC2Inst4TotFamCtrb,NNumber pC2Inst5EstPellAwd,NNumber pC2Inst5TotFamCtrb,NNumber pPell1Efc,NNumber pPell2Efc,NNumber pSIvInc,NNumber pPIvInc,NString pCurrentPlus,NString pCurrentConsol,NString pWorkStudy,NString pLoanInt,NString pPlusInt,NNumber pSDivIntInc,NNumber pSFarmValFaf,NNumber pSFarmDbtFaf,NNumber pPFarmValFaf,NNumber pPFarmDbtFaf,NString pVerifNum,NString pAltOptTuit,NString pMsg31,NString pMsg72,NString pOldestLoanDate,NString pNsldsMatch,NNumber pBalOnSls,NString pCNa1ImPcInd,NNumber pIraKeoghAmt,NString pVisaClass,NNumber pC1IncAdj,NNumber pC1OthAllow,NNumber pC1IraKeogh,NNumber pC1TrustVal,NNumber pC1OthAsset,NNumber pC1OthAssetAllow,NNumber pC2IncAdj,NNumber pC2OthAllow,NNumber pC2IraKeogh,NNumber pC2TrustVal,NNumber pC2OthAsset,NNumber pC2OthAssetAllow,NNumber pCPar1IncAdj,NNumber pCPar1OthAllow,NNumber pCPar1OthAsset,NNumber pCPar1OthAssetAllw,NNumber pCPar2IncAdj,NNumber pCPar2OthAllow,NNumber pCPar2OthAsset,NNumber pCPar2OthAssetAllw,NString pTypeDataAvail,NString pImParDataAvail,NString pFmParDataAvail,NNumber pImBudgDurForCalc,NString pStateForTaxes,NString pParStateForTaxes,NString pFormulaForCalc,NString pTaxFiler,NString pParTaxFiler,NString pTypeFmCalc,NNumber pParDepCareAndMed,NNumber pExpParTuitPd,NNumber pExpParNoChildTuit,NNumber pHmeYrPurch,NNumber pHmePurchAmt,NNumber pCInst1OthCtrb,NNumber pSEic,NString pSsaCitizenInd,NNumber pSarEfc,NString pHsGedRcvd,NNumber pFisapInc,NString pEmailAddress,NString pNsldsTranNo,NString pDriversLicInd,NString pLegalResInd,NString pParLegalResInd,NString pTxRetFiledInd,NString pParTxRetFiledInd,NString p1040aEligInd,NString pPar1040aEligInd,NNumber pInvNetWorth,NNumber pParInvNetWorth,NNumber pBusNetWorth,NNumber pParBusNetWorth,NNumber pFarmNetWorth,NNumber pParFarmNetWorth,NDate pDeathDate,NString pVaMatchFlag,NNumber pFisap2Inc,NString pDrugOffenseConvic,NString pFathLastName,NString pMothLastName,NString pFathSsn,NString pMothSsn,NString pSubVerifSelected,NString pPResDateMoYr,NString pSResDateMoYr,NString pPrisonerMatchFlag,NString pHaveChildren,NNumber pParWorksheetC,NNumber pWorksheetC,NString pSourceCorrection,NString pEfcChangeInd,NString pDupSsnInd,NString pEarlyAdmFlag,NString pSecInsMatchInd,NNumber pWorksheetA,NNumber pParWorksheetA,NNumber pWorksheetB,NNumber pParWorksheetB,NString pSsMatch,NString pSsRegFlag,NString pFathFirstNameIni,NDate pFathBirthDate,NString pMothFirstNameIni,NDate pMothBirthDate,NString pPEmailAddress,NString pAddressChgFlag,NString pPushIsirFlag,NString pSarCChangeFlag,NString pCustodialParent,NNumber pCustParBasePctInc,NNumber pParBaseCtrbInc,NNumber pParBaseCtrbAssets,NNumber pParBaseTotCtrb,NString pUserId,NString pFeeWaiverInd,NString pWrkStdyLoansInt,NString pApFlag,NString pPar1Occupation,NString pPar1Employer,NString pPar2Occupation,NString pPar2Employer,NString pAdoptedAfter13,NString pHomeless,NNumber pCombatPay,NNumber pParNumBusinesses,NNumber pParNumFarms,NNumber pParCombatPay,NString pParentType1,NString pParentType2,NString pDodMatchFlag,NDate pDodParDeathDate,NString pHighSchoolName,NString pHighSchoolCity,NString pStatCodeHighSch,NString pHighSchoolCde,NString pHighSchoolFlg,NString pPAssetThreshExcd,NString pSAssetThreshExcd,NNumber pParFsaHealthCare,NNumber pParDependentCare,NNumber pParHealthSavAccount,NString pRowid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P4.P_UPDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_INFC_CODE", pInfcCode);
//			cmd.addParameter("@P_SEQ_NO", pSeqNo);
//			cmd.addParameter("@P_REC_TYPE", pRecType);
//			cmd.addParameter("@P_MDE_ID_NO", pMdeIdNo);
//			cmd.addParameter("@P_CTRL_NO", pCtrlNo);
//			cmd.addParameter("@P_TAPE_RPT_EXTRCT_DATE", pTapeRptExtrctDate);
//			cmd.addParameter("@P_INST_RPT_TYPE", pInstRptType);
//			cmd.addParameter("@P_SECT_R_WRITTEN_EXPLAIN", pSectRWrittenExplain);
//			cmd.addParameter("@P_SECT_S_INST_ID", pSectSInstId);
//			cmd.addParameter("@P_ST_SPECIFIC_INFO", pStSpecificInfo);
//			cmd.addParameter("@P_C_INST_1_OUT_ST_TUIT", pCInst1OutStTuit);
//			cmd.addParameter("@P_C_INST_1_BUDG_NAME", pCInst1BudgName);
//			cmd.addParameter("@P_C_INST_1_BUDG_DUR", pCInst1BudgDur);
//			cmd.addParameter("@P_C_INST_1_TUIT_FEE", pCInst1TuitFee);
//			cmd.addParameter("@P_C_INST_1_BOOKS", pCInst1Books);
//			cmd.addParameter("@P_C_INST_1_LIVING_EXP", pCInst1LivingExp);
//			cmd.addParameter("@P_C_INST_1_TOT_EXP", pCInst1TotExp);
//			cmd.addParameter("@P_C_INST_1_TOT_CTRB", pCInst1TotCtrb);
//			cmd.addParameter("@P_C_INST_1_TOT_PAR_CTRB", pCInst1TotParCtrb);
//			cmd.addParameter("@P_C_INST_1_TOT_FAM_CTRB", pCInst1TotFamCtrb);
//			cmd.addParameter("@P_C_INST_1_TFC_OFFL_EST", pCInst1TfcOfflEst);
//			cmd.addParameter("@P_C_INST_1_EST_FA_NEED", pCInst1EstFaNeed);
//			cmd.addParameter("@P_C_INST_1_EST_PELL_AWRD", pCInst1EstPellAwrd);
//			cmd.addParameter("@P_C_INST_1_EST_ST_AWRD", pCInst1EstStAwrd);
//			cmd.addParameter("@P_C_INST_2_BUDG_NAME", pCInst2BudgName);
//			cmd.addParameter("@P_C_INST_2_BUDG_DUR", pCInst2BudgDur);
//			cmd.addParameter("@P_C_INST_2_TUIT_FEE", pCInst2TuitFee);
//			cmd.addParameter("@P_C_INST_2_BOOKS", pCInst2Books);
//			cmd.addParameter("@P_C_INST_2_LIVING_EXP", pCInst2LivingExp);
//			cmd.addParameter("@P_C_INST_2_TOT_EXP", pCInst2TotExp);
//			cmd.addParameter("@P_C_INST_2_TOT_CTRB", pCInst2TotCtrb);
//			cmd.addParameter("@P_C_INST_2_TOT_PAR_CTRB", pCInst2TotParCtrb);
//			cmd.addParameter("@P_C_INST_2_TOT_FAM_CTRB", pCInst2TotFamCtrb);
//			cmd.addParameter("@P_C_INST_2_TFC_OFFL_EST", pCInst2TfcOfflEst);
//			cmd.addParameter("@P_C_INST_2_EST_FA_NEED", pCInst2EstFaNeed);
//			cmd.addParameter("@P_C_INST_2_EST_PELL_AWRD", pCInst2EstPellAwrd);
//			cmd.addParameter("@P_C_INST_2_EST_ST_AWRD", pCInst2EstStAwrd);
//			cmd.addParameter("@P_C_INST_3_BUDG_NAME", pCInst3BudgName);
//			cmd.addParameter("@P_C_INST_3_BUDG_DUR", pCInst3BudgDur);
//			cmd.addParameter("@P_C_INST_3_TUIT_FEE", pCInst3TuitFee);
//			cmd.addParameter("@P_C_INST_3_BOOKS", pCInst3Books);
//			cmd.addParameter("@P_C_INST_3_LIVING_EXP", pCInst3LivingExp);
//			cmd.addParameter("@P_C_INST_3_TOT_EXP", pCInst3TotExp);
//			cmd.addParameter("@P_C_INST_3_TOT_CTRB", pCInst3TotCtrb);
//			cmd.addParameter("@P_C_INST_3_TOT_PAR_CTRB", pCInst3TotParCtrb);
//			cmd.addParameter("@P_C_INST_3_TOT_FAM_CTRB", pCInst3TotFamCtrb);
//			cmd.addParameter("@P_C_INST_3_TFC_OFFL_EST", pCInst3TfcOfflEst);
//			cmd.addParameter("@P_C_INST_3_EST_FA_NEED", pCInst3EstFaNeed);
//			cmd.addParameter("@P_C_INST_3_EST_PELL_AWRD", pCInst3EstPellAwrd);
//			cmd.addParameter("@P_C_INST_3_EST_ST_AWRD", pCInst3EstStAwrd);
//			cmd.addParameter("@P_C_INST_1_DEPEND_CARE", pCInst1DependCare);
//			cmd.addParameter("@P_C_INST_2_DEPEND_CARE", pCInst2DependCare);
//			cmd.addParameter("@P_C_INST_3_DEPEND_CARE", pCInst3DependCare);
//			cmd.addParameter("@P_C_NA_1_CTRB_OFFL_EST", pCNa1CtrbOfflEst);
//			cmd.addParameter("@P_C_NA_1_CTRB_FOR_STDT", pCNa1CtrbForStdt);
//			cmd.addParameter("@P_C_NA_1_ANLY_TYPE", pCNa1AnlyType);
//			cmd.addParameter("@P_C_NA_2_CTRB_OFFL_EST", pCNa2CtrbOfflEst);
//			cmd.addParameter("@P_C_NA_2_CTRB_FOR_STDT", pCNa2CtrbForStdt);
//			cmd.addParameter("@P_C_NA_2_ANLY_TYPE", pCNa2AnlyType);
//			cmd.addParameter("@P_C_NA_1_P_CTRB_OFFL_EST", pCNa1PCtrbOfflEst);
//			cmd.addParameter("@P_C_NA_1_P_CTRB_FOR_STDT", pCNa1PCtrbForStdt);
//			cmd.addParameter("@P_C_NA_1_P_ANLY_TYPE", pCNa1PAnlyType);
//			cmd.addParameter("@P_C_NA_2_P_CTRB_OFFL_EST", pCNa2PCtrbOfflEst);
//			cmd.addParameter("@P_C_NA_2_P_CTRB_FOR_STDT", pCNa2PCtrbForStdt);
//			cmd.addParameter("@P_C_NA_2_P_ANLY_TYPE", pCNa2PAnlyType);
//			cmd.addParameter("@P_C_NA_1_TOT_FAM_CTRB", pCNa1TotFamCtrb);
//			cmd.addParameter("@P_C_NA_1_TFC_OFFL_EST", pCNa1TfcOfflEst);
//			cmd.addParameter("@P_C_NA_2_TOT_FAM_CTRB", pCNa2TotFamCtrb);
//			cmd.addParameter("@P_C_NA_2_TFC_OFFL_EST", pCNa2TfcOfflEst);
//			cmd.addParameter("@P_C_NA_1_PELL_OFFL_EST", pCNa1PellOfflEst);
//			cmd.addParameter("@P_C_NA_1_PELL_PGI", pCNa1PellPgi);
//			cmd.addParameter("@P_C_NA_2_PELL_OFFL_EST", pCNa2PellOfflEst);
//			cmd.addParameter("@P_C_NA_2_PELL_PGI", pCNa2PellPgi);
//			cmd.addParameter("@P_C_NA_1_IM_CTRB_STDT", pCNa1ImCtrbStdt);
//			cmd.addParameter("@P_C_NA_1_IM_ANLY_TYPE", pCNa1ImAnlyType);
//			cmd.addParameter("@P_C_NA_2_IM_CTRB_STDT", pCNa2ImCtrbStdt);
//			cmd.addParameter("@P_C_NA_2_IM_ANLY_TYPE", pCNa2ImAnlyType);
//			cmd.addParameter("@P_C_NA_1_P_IM_CTRB_STDT", pCNa1PImCtrbStdt);
//			cmd.addParameter("@P_C_NA_1_P_IM_ANLY_TYPE", pCNa1PImAnlyType);
//			cmd.addParameter("@P_C_NA_2_P_IM_CTRB_STDT", pCNa2PImCtrbStdt);
//			cmd.addParameter("@P_C_NA_2_P_IM_ANLY_TYPE", pCNa2PImAnlyType);
//			cmd.addParameter("@P_C_NA_1_IM_TOT_FAM_CTRB", pCNa1ImTotFamCtrb);
//			cmd.addParameter("@P_C_NA_FISAP_INC", pCNaFisapInc);
//			cmd.addParameter("@P_RECORD_MARK", pRecordMark);
//			cmd.addParameter("@P_COLL_SPECIFIC_INFO", pCollSpecificInfo);
//			cmd.addParameter("@P_ADJ_EFC", pAdjEfc);
//			cmd.addParameter("@P_EFC_TYPE", pEfcType);
//			cmd.addParameter("@P_ESAR_USER_DEF_FIELDS", pEsarUserDefFields);
//			cmd.addParameter("@P_C_INST_1_ASSUM_HOUS", pCInst1AssumHous);
//			cmd.addParameter("@P_C_INST_2_ASSUM_HOUS", pCInst2AssumHous);
//			cmd.addParameter("@P_C_INST_3_ASSUM_HOUS", pCInst3AssumHous);
//			cmd.addParameter("@P_C_INST_4_ASSUM_HOUS", pCInst4AssumHous);
//			cmd.addParameter("@P_C_INST_4_BUDG_DUR", pCInst4BudgDur);
//			cmd.addParameter("@P_C_INST_4_BUDG_NAME", pCInst4BudgName);
//			cmd.addParameter("@P_C_INST_4_EST_FA_NEED", pCInst4EstFaNeed);
//			cmd.addParameter("@P_C_INST_4_EST_PELL_AWRD", pCInst4EstPellAwrd);
//			cmd.addParameter("@P_C_INST_4_LIVING_EXP", pCInst4LivingExp);
//			cmd.addParameter("@P_C_INST_4_TOT_EXP", pCInst4TotExp);
//			cmd.addParameter("@P_C_INST_4_TOT_CTRB", pCInst4TotCtrb);
//			cmd.addParameter("@P_C_INST_4_TOT_FAM_CTRB", pCInst4TotFamCtrb);
//			cmd.addParameter("@P_C_INST_4_TOT_PAR_CTRB", pCInst4TotParCtrb);
//			cmd.addParameter("@P_C_INST_4_TUIT_FEE", pCInst4TuitFee);
//			cmd.addParameter("@P_C_INST_4_UNASSESS_VA", pCInst4UnassessVa);
//			cmd.addParameter("@P_C_INST_5_ASSUM_HOUS", pCInst5AssumHous);
//			cmd.addParameter("@P_C_INST_5_BUDG_DUR", pCInst5BudgDur);
//			cmd.addParameter("@P_C_INST_5_BUDG_NAME", pCInst5BudgName);
//			cmd.addParameter("@P_C_INST_5_EST_FA_NEED", pCInst5EstFaNeed);
//			cmd.addParameter("@P_C_INST_5_EST_PELL_AWRD", pCInst5EstPellAwrd);
//			cmd.addParameter("@P_C_INST_5_LIVING_EXP", pCInst5LivingExp);
//			cmd.addParameter("@P_C_INST_5_TOT_EXP", pCInst5TotExp);
//			cmd.addParameter("@P_C_INST_5_TOT_CTRB", pCInst5TotCtrb);
//			cmd.addParameter("@P_C_INST_5_TOT_FAM_CTRB", pCInst5TotFamCtrb);
//			cmd.addParameter("@P_C_INST_5_TOT_PAR_CTRB", pCInst5TotParCtrb);
//			cmd.addParameter("@P_C_INST_5_TUIT_FEE", pCInst5TuitFee);
//			cmd.addParameter("@P_C_INST_5_UNASSESS_VA", pCInst5UnassessVa);
//			cmd.addParameter("@P_C2_INST_1_EST_PELL_AWD", pC2Inst1EstPellAwd);
//			cmd.addParameter("@P_C2_INST_1_TOT_FAM_CTRB", pC2Inst1TotFamCtrb);
//			cmd.addParameter("@P_C2_INST_2_EST_PELL_AWD", pC2Inst2EstPellAwd);
//			cmd.addParameter("@P_C2_INST_2_TOT_FAM_CTRB", pC2Inst2TotFamCtrb);
//			cmd.addParameter("@P_C2_INST_3_EST_PELL_AWD", pC2Inst3EstPellAwd);
//			cmd.addParameter("@P_C2_INST_3_TOT_FAM_CTRB", pC2Inst3TotFamCtrb);
//			cmd.addParameter("@P_C2_INST_4_EST_PELL_AWD", pC2Inst4EstPellAwd);
//			cmd.addParameter("@P_C2_INST_4_TOT_FAM_CTRB", pC2Inst4TotFamCtrb);
//			cmd.addParameter("@P_C2_INST_5_EST_PELL_AWD", pC2Inst5EstPellAwd);
//			cmd.addParameter("@P_C2_INST_5_TOT_FAM_CTRB", pC2Inst5TotFamCtrb);
//			cmd.addParameter("@P_PELL_1_EFC", pPell1Efc);
//			cmd.addParameter("@P_PELL_2_EFC", pPell2Efc);
//			cmd.addParameter("@P_S_IV_INC", pSIvInc);
//			cmd.addParameter("@P_P_IV_INC", pPIvInc);
//			cmd.addParameter("@P_CURRENT_PLUS", pCurrentPlus);
//			cmd.addParameter("@P_CURRENT_CONSOL", pCurrentConsol);
//			cmd.addParameter("@P_WORK_STUDY", pWorkStudy);
//			cmd.addParameter("@P_LOAN_INT", pLoanInt);
//			cmd.addParameter("@P_PLUS_INT", pPlusInt);
//			cmd.addParameter("@P_S_DIV_INT_INC", pSDivIntInc);
//			cmd.addParameter("@P_S_FARM_VAL_FAF", pSFarmValFaf);
//			cmd.addParameter("@P_S_FARM_DBT_FAF", pSFarmDbtFaf);
//			cmd.addParameter("@P_P_FARM_VAL_FAF", pPFarmValFaf);
//			cmd.addParameter("@P_P_FARM_DBT_FAF", pPFarmDbtFaf);
//			cmd.addParameter("@P_VERIF_NUM", pVerifNum);
//			cmd.addParameter("@P_ALT_OPT_TUIT", pAltOptTuit);
//			cmd.addParameter("@P_MSG_31", pMsg31);
//			cmd.addParameter("@P_MSG_72", pMsg72);
//			cmd.addParameter("@P_OLDEST_LOAN_DATE", pOldestLoanDate);
//			cmd.addParameter("@P_NSLDS_MATCH", pNsldsMatch);
//			cmd.addParameter("@P_BAL_ON_SLS", pBalOnSls);
//			cmd.addParameter("@P_C_NA_1_IM_PC_IND", pCNa1ImPcInd);
//			cmd.addParameter("@P_IRA_KEOGH_AMT", pIraKeoghAmt);
//			cmd.addParameter("@P_VISA_CLASS", pVisaClass);
//			cmd.addParameter("@P_C_1_INC_ADJ", pC1IncAdj);
//			cmd.addParameter("@P_C_1_OTH_ALLOW", pC1OthAllow);
//			cmd.addParameter("@P_C_1_IRA_KEOGH", pC1IraKeogh);
//			cmd.addParameter("@P_C_1_TRUST_VAL", pC1TrustVal);
//			cmd.addParameter("@P_C_1_OTH_ASSET", pC1OthAsset);
//			cmd.addParameter("@P_C_1_OTH_ASSET_ALLOW", pC1OthAssetAllow);
//			cmd.addParameter("@P_C_2_INC_ADJ", pC2IncAdj);
//			cmd.addParameter("@P_C_2_OTH_ALLOW", pC2OthAllow);
//			cmd.addParameter("@P_C_2_IRA_KEOGH", pC2IraKeogh);
//			cmd.addParameter("@P_C_2_TRUST_VAL", pC2TrustVal);
//			cmd.addParameter("@P_C_2_OTH_ASSET", pC2OthAsset);
//			cmd.addParameter("@P_C_2_OTH_ASSET_ALLOW", pC2OthAssetAllow);
//			cmd.addParameter("@P_C_PAR_1_INC_ADJ", pCPar1IncAdj);
//			cmd.addParameter("@P_C_PAR_1_OTH_ALLOW", pCPar1OthAllow);
//			cmd.addParameter("@P_C_PAR_1_OTH_ASSET", pCPar1OthAsset);
//			cmd.addParameter("@P_C_PAR_1_OTH_ASSET_ALLW", pCPar1OthAssetAllw);
//			cmd.addParameter("@P_C_PAR_2_INC_ADJ", pCPar2IncAdj);
//			cmd.addParameter("@P_C_PAR_2_OTH_ALLOW", pCPar2OthAllow);
//			cmd.addParameter("@P_C_PAR_2_OTH_ASSET", pCPar2OthAsset);
//			cmd.addParameter("@P_C_PAR_2_OTH_ASSET_ALLW", pCPar2OthAssetAllw);
//			cmd.addParameter("@P_TYPE_DATA_AVAIL", pTypeDataAvail);
//			cmd.addParameter("@P_IM_PAR_DATA_AVAIL", pImParDataAvail);
//			cmd.addParameter("@P_FM_PAR_DATA_AVAIL", pFmParDataAvail);
//			cmd.addParameter("@P_IM_BUDG_DUR_FOR_CALC", pImBudgDurForCalc);
//			cmd.addParameter("@P_STATE_FOR_TAXES", pStateForTaxes);
//			cmd.addParameter("@P_PAR_STATE_FOR_TAXES", pParStateForTaxes);
//			cmd.addParameter("@P_FORMULA_FOR_CALC", pFormulaForCalc);
//			cmd.addParameter("@P_TAX_FILER", pTaxFiler);
//			cmd.addParameter("@P_PAR_TAX_FILER", pParTaxFiler);
//			cmd.addParameter("@P_TYPE_FM_CALC", pTypeFmCalc);
//			cmd.addParameter("@P_PAR_DEP_CARE_AND_MED", pParDepCareAndMed);
//			cmd.addParameter("@P_EXP_PAR_TUIT_PD", pExpParTuitPd);
//			cmd.addParameter("@P_EXP_PAR_NO_CHILD_TUIT", pExpParNoChildTuit);
//			cmd.addParameter("@P_HME_YR_PURCH", pHmeYrPurch);
//			cmd.addParameter("@P_HME_PURCH_AMT", pHmePurchAmt);
//			cmd.addParameter("@P_C_INST_1_OTH_CTRB", pCInst1OthCtrb);
//			cmd.addParameter("@P_S_EIC", pSEic);
//			cmd.addParameter("@P_SSA_CITIZEN_IND", pSsaCitizenInd);
//			cmd.addParameter("@P_SAR_EFC", pSarEfc);
//			cmd.addParameter("@P_HS_GED_RCVD", pHsGedRcvd);
//			cmd.addParameter("@P_FISAP_INC", pFisapInc);
//			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
//			cmd.addParameter("@P_NSLDS_TRAN_NO", pNsldsTranNo);
//			cmd.addParameter("@P_DRIVERS_LIC_IND", pDriversLicInd);
//			cmd.addParameter("@P_LEGAL_RES_IND", pLegalResInd);
//			cmd.addParameter("@P_PAR_LEGAL_RES_IND", pParLegalResInd);
//			cmd.addParameter("@P_TX_RET_FILED_IND", pTxRetFiledInd);
//			cmd.addParameter("@P_PAR_TX_RET_FILED_IND", pParTxRetFiledInd);
//			cmd.addParameter("@P_1040A_ELIG_IND", p1040aEligInd);
//			cmd.addParameter("@P_PAR_1040A_ELIG_IND", pPar1040aEligInd);
//			cmd.addParameter("@P_INV_NET_WORTH", pInvNetWorth);
//			cmd.addParameter("@P_PAR_INV_NET_WORTH", pParInvNetWorth);
//			cmd.addParameter("@P_BUS_NET_WORTH", pBusNetWorth);
//			cmd.addParameter("@P_PAR_BUS_NET_WORTH", pParBusNetWorth);
//			cmd.addParameter("@P_FARM_NET_WORTH", pFarmNetWorth);
//			cmd.addParameter("@P_PAR_FARM_NET_WORTH", pParFarmNetWorth);
//			cmd.addParameter("@P_DEATH_DATE", pDeathDate);
//			cmd.addParameter("@P_VA_MATCH_FLAG", pVaMatchFlag);
//			cmd.addParameter("@P_FISAP_2_INC", pFisap2Inc);
//			cmd.addParameter("@P_DRUG_OFFENSE_CONVIC", pDrugOffenseConvic);
//			cmd.addParameter("@P_FATH_LAST_NAME", pFathLastName);
//			cmd.addParameter("@P_MOTH_LAST_NAME", pMothLastName);
//			cmd.addParameter("@P_FATH_SSN", pFathSsn);
//			cmd.addParameter("@P_MOTH_SSN", pMothSsn);
//			cmd.addParameter("@P_SUB_VERIF_SELECTED", pSubVerifSelected);
//			cmd.addParameter("@P_P_RES_DATE_MO_YR", pPResDateMoYr);
//			cmd.addParameter("@P_S_RES_DATE_MO_YR", pSResDateMoYr);
//			cmd.addParameter("@P_PRISONER_MATCH_FLAG", pPrisonerMatchFlag);
//			cmd.addParameter("@P_HAVE_CHILDREN", pHaveChildren);
//			cmd.addParameter("@P_PAR_WORKSHEET_C", pParWorksheetC);
//			cmd.addParameter("@P_WORKSHEET_C", pWorksheetC);
//			cmd.addParameter("@P_SOURCE_CORRECTION", pSourceCorrection);
//			cmd.addParameter("@P_EFC_CHANGE_IND", pEfcChangeInd);
//			cmd.addParameter("@P_DUP_SSN_IND", pDupSsnInd);
//			cmd.addParameter("@P_EARLY_ADM_FLAG", pEarlyAdmFlag);
//			cmd.addParameter("@P_SEC_INS_MATCH_IND", pSecInsMatchInd);
//			cmd.addParameter("@P_WORKSHEET_A", pWorksheetA);
//			cmd.addParameter("@P_PAR_WORKSHEET_A", pParWorksheetA);
//			cmd.addParameter("@P_WORKSHEET_B", pWorksheetB);
//			cmd.addParameter("@P_PAR_WORKSHEET_B", pParWorksheetB);
//			cmd.addParameter("@P_SS_MATCH", pSsMatch);
//			cmd.addParameter("@P_SS_REG_FLAG", pSsRegFlag);
//			cmd.addParameter("@P_FATH_FIRST_NAME_INI", pFathFirstNameIni);
//			cmd.addParameter("@P_FATH_BIRTH_DATE", pFathBirthDate);
//			cmd.addParameter("@P_MOTH_FIRST_NAME_INI", pMothFirstNameIni);
//			cmd.addParameter("@P_MOTH_BIRTH_DATE", pMothBirthDate);
//			cmd.addParameter("@P_P_EMAIL_ADDRESS", pPEmailAddress);
//			cmd.addParameter("@P_ADDRESS_CHG_FLAG", pAddressChgFlag);
//			cmd.addParameter("@P_PUSH_ISIR_FLAG", pPushIsirFlag);
//			cmd.addParameter("@P_SAR_C_CHANGE_FLAG", pSarCChangeFlag);
//			cmd.addParameter("@P_CUSTODIAL_PARENT", pCustodialParent);
//			cmd.addParameter("@P_CUST_PAR_BASE_PCT_INC", pCustParBasePctInc);
//			cmd.addParameter("@P_PAR_BASE_CTRB_INC", pParBaseCtrbInc);
//			cmd.addParameter("@P_PAR_BASE_CTRB_ASSETS", pParBaseCtrbAssets);
//			cmd.addParameter("@P_PAR_BASE_TOT_CTRB", pParBaseTotCtrb);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_FEE_WAIVER_IND", pFeeWaiverInd);
//			cmd.addParameter("@P_WRK_STDY_LOANS_INT", pWrkStdyLoansInt);
//			cmd.addParameter("@P_AP_FLAG", pApFlag);
//			cmd.addParameter("@P_PAR1_OCCUPATION", pPar1Occupation);
//			cmd.addParameter("@P_PAR1_EMPLOYER", pPar1Employer);
//			cmd.addParameter("@P_PAR2_OCCUPATION", pPar2Occupation);
//			cmd.addParameter("@P_PAR2_EMPLOYER", pPar2Employer);
//			cmd.addParameter("@P_ADOPTED_AFTER_13", pAdoptedAfter13);
//			cmd.addParameter("@P_HOMELESS", pHomeless);
//			cmd.addParameter("@P_COMBAT_PAY", pCombatPay);
//			cmd.addParameter("@P_PAR_NUM_BUSINESSES", pParNumBusinesses);
//			cmd.addParameter("@P_PAR_NUM_FARMS", pParNumFarms);
//			cmd.addParameter("@P_PAR_COMBAT_PAY", pParCombatPay);
//			cmd.addParameter("@P_PARENT_TYPE_1", pParentType1);
//			cmd.addParameter("@P_PARENT_TYPE_2", pParentType2);
//			cmd.addParameter("@P_DOD_MATCH_FLAG", pDodMatchFlag);
//			cmd.addParameter("@P_DOD_PAR_DEATH_DATE", pDodParDeathDate);
//			cmd.addParameter("@P_HIGH_SCHOOL_NAME", pHighSchoolName);
//			cmd.addParameter("@P_HIGH_SCHOOL_CITY", pHighSchoolCity);
//			cmd.addParameter("@P_STAT_CODE_HIGH_SCH", pStatCodeHighSch);
//			cmd.addParameter("@P_HIGH_SCHOOL_CDE", pHighSchoolCde);
//			cmd.addParameter("@P_HIGH_SCHOOL_FLG", pHighSchoolFlg);
//			cmd.addParameter("@P_P_ASSET_THRESH_EXCD", pPAssetThreshExcd);
//			cmd.addParameter("@P_S_ASSET_THRESH_EXCD", pSAssetThreshExcd);
//			cmd.addParameter("@P_PAR_FSA_HEALTH_CARE", pParFsaHealthCare);
//			cmd.addParameter("@P_PAR_DEPENDENT_CARE", pParDependentCare);
//			cmd.addParameter("@P_PAR_HEALTH_SAV_ACCOUNT", pParHealthSavAccount);
//			cmd.addParameter("@P_ROWID", pRowid);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	@DbRecordType(id="TempAppP4RecRow", dataSourceName="TEMP_APP_P4_REC")
	public static class TempAppP4RecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_INFC_CODE")
		public NString RInfcCode;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_REC_TYPE")
		public NString RRecType;
		@DbRecordField(dataSourceName="R_MDE_ID_NO")
		public NString RMdeIdNo;
		@DbRecordField(dataSourceName="R_CTRL_NO")
		public NString RCtrlNo;
		@DbRecordField(dataSourceName="R_TAPE_RPT_EXTRCT_DATE")
		public NDate RTapeRptExtrctDate;
		@DbRecordField(dataSourceName="R_INST_RPT_TYPE")
		public NString RInstRptType;
		@DbRecordField(dataSourceName="R_SECT_R_WRITTEN_EXPLAIN")
		public NString RSectRWrittenExplain;
		@DbRecordField(dataSourceName="R_SECT_S_INST_ID")
		public NNumber RSectSInstId;
		@DbRecordField(dataSourceName="R_ST_SPECIFIC_INFO")
		public NString RStSpecificInfo;
		@DbRecordField(dataSourceName="R_C_INST_1_OUT_ST_TUIT")
		public NString RCInst1OutStTuit;
		@DbRecordField(dataSourceName="R_C_INST_1_BUDG_NAME")
		public NString RCInst1BudgName;
		@DbRecordField(dataSourceName="R_C_INST_1_BUDG_DUR")
		public NNumber RCInst1BudgDur;
		@DbRecordField(dataSourceName="R_C_INST_1_TUIT_FEE")
		public NNumber RCInst1TuitFee;
		@DbRecordField(dataSourceName="R_C_INST_1_BOOKS")
		public NNumber RCInst1Books;
		@DbRecordField(dataSourceName="R_C_INST_1_LIVING_EXP")
		public NNumber RCInst1LivingExp;
		@DbRecordField(dataSourceName="R_C_INST_1_TOT_EXP")
		public NNumber RCInst1TotExp;
		@DbRecordField(dataSourceName="R_C_INST_1_TOT_CTRB")
		public NNumber RCInst1TotCtrb;
		@DbRecordField(dataSourceName="R_C_INST_1_TOT_PAR_CTRB")
		public NNumber RCInst1TotParCtrb;
		@DbRecordField(dataSourceName="R_C_INST_1_TOT_FAM_CTRB")
		public NNumber RCInst1TotFamCtrb;
		@DbRecordField(dataSourceName="R_C_INST_1_TFC_OFFL_EST")
		public NString RCInst1TfcOfflEst;
		@DbRecordField(dataSourceName="R_C_INST_1_EST_FA_NEED")
		public NNumber RCInst1EstFaNeed;
		@DbRecordField(dataSourceName="R_C_INST_1_EST_PELL_AWRD")
		public NNumber RCInst1EstPellAwrd;
		@DbRecordField(dataSourceName="R_C_INST_1_EST_ST_AWRD")
		public NNumber RCInst1EstStAwrd;
		@DbRecordField(dataSourceName="R_C_INST_2_BUDG_NAME")
		public NString RCInst2BudgName;
		@DbRecordField(dataSourceName="R_C_INST_2_BUDG_DUR")
		public NNumber RCInst2BudgDur;
		@DbRecordField(dataSourceName="R_C_INST_2_TUIT_FEE")
		public NNumber RCInst2TuitFee;
		@DbRecordField(dataSourceName="R_C_INST_2_BOOKS")
		public NNumber RCInst2Books;
		@DbRecordField(dataSourceName="R_C_INST_2_LIVING_EXP")
		public NNumber RCInst2LivingExp;
		@DbRecordField(dataSourceName="R_C_INST_2_TOT_EXP")
		public NNumber RCInst2TotExp;
		@DbRecordField(dataSourceName="R_C_INST_2_TOT_CTRB")
		public NNumber RCInst2TotCtrb;
		@DbRecordField(dataSourceName="R_C_INST_2_TOT_PAR_CTRB")
		public NNumber RCInst2TotParCtrb;
		@DbRecordField(dataSourceName="R_C_INST_2_TOT_FAM_CTRB")
		public NNumber RCInst2TotFamCtrb;
		@DbRecordField(dataSourceName="R_C_INST_2_TFC_OFFL_EST")
		public NString RCInst2TfcOfflEst;
		@DbRecordField(dataSourceName="R_C_INST_2_EST_FA_NEED")
		public NNumber RCInst2EstFaNeed;
		@DbRecordField(dataSourceName="R_C_INST_2_EST_PELL_AWRD")
		public NNumber RCInst2EstPellAwrd;
		@DbRecordField(dataSourceName="R_C_INST_2_EST_ST_AWRD")
		public NNumber RCInst2EstStAwrd;
		@DbRecordField(dataSourceName="R_C_INST_3_BUDG_NAME")
		public NString RCInst3BudgName;
		@DbRecordField(dataSourceName="R_C_INST_3_BUDG_DUR")
		public NNumber RCInst3BudgDur;
		@DbRecordField(dataSourceName="R_C_INST_3_TUIT_FEE")
		public NNumber RCInst3TuitFee;
		@DbRecordField(dataSourceName="R_C_INST_3_BOOKS")
		public NNumber RCInst3Books;
		@DbRecordField(dataSourceName="R_C_INST_3_LIVING_EXP")
		public NNumber RCInst3LivingExp;
		@DbRecordField(dataSourceName="R_C_INST_3_TOT_EXP")
		public NNumber RCInst3TotExp;
		@DbRecordField(dataSourceName="R_C_INST_3_TOT_CTRB")
		public NNumber RCInst3TotCtrb;
		@DbRecordField(dataSourceName="R_C_INST_3_TOT_PAR_CTRB")
		public NNumber RCInst3TotParCtrb;
		@DbRecordField(dataSourceName="R_C_INST_3_TOT_FAM_CTRB")
		public NNumber RCInst3TotFamCtrb;
		@DbRecordField(dataSourceName="R_C_INST_3_TFC_OFFL_EST")
		public NString RCInst3TfcOfflEst;
		@DbRecordField(dataSourceName="R_C_INST_3_EST_FA_NEED")
		public NNumber RCInst3EstFaNeed;
		@DbRecordField(dataSourceName="R_C_INST_3_EST_PELL_AWRD")
		public NNumber RCInst3EstPellAwrd;
		@DbRecordField(dataSourceName="R_C_INST_3_EST_ST_AWRD")
		public NNumber RCInst3EstStAwrd;
		@DbRecordField(dataSourceName="R_C_INST_1_DEPEND_CARE")
		public NNumber RCInst1DependCare;
		@DbRecordField(dataSourceName="R_C_INST_2_DEPEND_CARE")
		public NNumber RCInst2DependCare;
		@DbRecordField(dataSourceName="R_C_INST_3_DEPEND_CARE")
		public NNumber RCInst3DependCare;
		@DbRecordField(dataSourceName="R_C_NA_1_CTRB_OFFL_EST")
		public NString RCNa1CtrbOfflEst;
		@DbRecordField(dataSourceName="R_C_NA_1_CTRB_FOR_STDT")
		public NNumber RCNa1CtrbForStdt;
		@DbRecordField(dataSourceName="R_C_NA_1_ANLY_TYPE")
		public NString RCNa1AnlyType;
		@DbRecordField(dataSourceName="R_C_NA_2_CTRB_OFFL_EST")
		public NString RCNa2CtrbOfflEst;
		@DbRecordField(dataSourceName="R_C_NA_2_CTRB_FOR_STDT")
		public NNumber RCNa2CtrbForStdt;
		@DbRecordField(dataSourceName="R_C_NA_2_ANLY_TYPE")
		public NString RCNa2AnlyType;
		@DbRecordField(dataSourceName="R_C_NA_1_P_CTRB_OFFL_EST")
		public NString RCNa1PCtrbOfflEst;
		@DbRecordField(dataSourceName="R_C_NA_1_P_CTRB_FOR_STDT")
		public NNumber RCNa1PCtrbForStdt;
		@DbRecordField(dataSourceName="R_C_NA_1_P_ANLY_TYPE")
		public NString RCNa1PAnlyType;
		@DbRecordField(dataSourceName="R_C_NA_2_P_CTRB_OFFL_EST")
		public NString RCNa2PCtrbOfflEst;
		@DbRecordField(dataSourceName="R_C_NA_2_P_CTRB_FOR_STDT")
		public NNumber RCNa2PCtrbForStdt;
		@DbRecordField(dataSourceName="R_C_NA_2_P_ANLY_TYPE")
		public NString RCNa2PAnlyType;
		@DbRecordField(dataSourceName="R_C_NA_1_TOT_FAM_CTRB")
		public NNumber RCNa1TotFamCtrb;
		@DbRecordField(dataSourceName="R_C_NA_1_TFC_OFFL_EST")
		public NString RCNa1TfcOfflEst;
		@DbRecordField(dataSourceName="R_C_NA_2_TOT_FAM_CTRB")
		public NNumber RCNa2TotFamCtrb;
		@DbRecordField(dataSourceName="R_C_NA_2_TFC_OFFL_EST")
		public NString RCNa2TfcOfflEst;
		@DbRecordField(dataSourceName="R_C_NA_1_PELL_OFFL_EST")
		public NString RCNa1PellOfflEst;
		@DbRecordField(dataSourceName="R_C_NA_1_PELL_PGI")
		public NNumber RCNa1PellPgi;
		@DbRecordField(dataSourceName="R_C_NA_2_PELL_OFFL_EST")
		public NString RCNa2PellOfflEst;
		@DbRecordField(dataSourceName="R_C_NA_2_PELL_PGI")
		public NNumber RCNa2PellPgi;
		@DbRecordField(dataSourceName="R_C_NA_1_IM_CTRB_STDT")
		public NNumber RCNa1ImCtrbStdt;
		@DbRecordField(dataSourceName="R_C_NA_1_IM_ANLY_TYPE")
		public NString RCNa1ImAnlyType;
		@DbRecordField(dataSourceName="R_C_NA_2_IM_CTRB_STDT")
		public NNumber RCNa2ImCtrbStdt;
		@DbRecordField(dataSourceName="R_C_NA_2_IM_ANLY_TYPE")
		public NString RCNa2ImAnlyType;
		@DbRecordField(dataSourceName="R_C_NA_1_P_IM_CTRB_STDT")
		public NNumber RCNa1PImCtrbStdt;
		@DbRecordField(dataSourceName="R_C_NA_1_P_IM_ANLY_TYPE")
		public NString RCNa1PImAnlyType;
		@DbRecordField(dataSourceName="R_C_NA_2_P_IM_CTRB_STDT")
		public NNumber RCNa2PImCtrbStdt;
		@DbRecordField(dataSourceName="R_C_NA_2_P_IM_ANLY_TYPE")
		public NString RCNa2PImAnlyType;
		@DbRecordField(dataSourceName="R_C_NA_1_IM_TOT_FAM_CTRB")
		public NNumber RCNa1ImTotFamCtrb;
		@DbRecordField(dataSourceName="R_C_NA_FISAP_INC")
		public NNumber RCNaFisapInc;
		@DbRecordField(dataSourceName="R_RECORD_MARK")
		public NString RRecordMark;
		@DbRecordField(dataSourceName="R_COLL_SPECIFIC_INFO")
		public NString RCollSpecificInfo;
		@DbRecordField(dataSourceName="R_ADJ_EFC")
		public NNumber RAdjEfc;
		@DbRecordField(dataSourceName="R_EFC_TYPE")
		public NString REfcType;
		@DbRecordField(dataSourceName="R_ESAR_USER_DEF_FIELDS")
		public NString REsarUserDefFields;
		@DbRecordField(dataSourceName="R_C_INST_1_ASSUM_HOUS")
		public NString RCInst1AssumHous;
		@DbRecordField(dataSourceName="R_C_INST_2_ASSUM_HOUS")
		public NString RCInst2AssumHous;
		@DbRecordField(dataSourceName="R_C_INST_3_ASSUM_HOUS")
		public NString RCInst3AssumHous;
		@DbRecordField(dataSourceName="R_C_INST_4_ASSUM_HOUS")
		public NString RCInst4AssumHous;
		@DbRecordField(dataSourceName="R_C_INST_4_BUDG_DUR")
		public NNumber RCInst4BudgDur;
		@DbRecordField(dataSourceName="R_C_INST_4_BUDG_NAME")
		public NString RCInst4BudgName;
		@DbRecordField(dataSourceName="R_C_INST_4_EST_FA_NEED")
		public NNumber RCInst4EstFaNeed;
		@DbRecordField(dataSourceName="R_C_INST_4_EST_PELL_AWRD")
		public NNumber RCInst4EstPellAwrd;
		@DbRecordField(dataSourceName="R_C_INST_4_LIVING_EXP")
		public NNumber RCInst4LivingExp;
		@DbRecordField(dataSourceName="R_C_INST_4_TOT_EXP")
		public NNumber RCInst4TotExp;
		@DbRecordField(dataSourceName="R_C_INST_4_TOT_CTRB")
		public NNumber RCInst4TotCtrb;
		@DbRecordField(dataSourceName="R_C_INST_4_TOT_FAM_CTRB")
		public NNumber RCInst4TotFamCtrb;
		@DbRecordField(dataSourceName="R_C_INST_4_TOT_PAR_CTRB")
		public NNumber RCInst4TotParCtrb;
		@DbRecordField(dataSourceName="R_C_INST_4_TUIT_FEE")
		public NNumber RCInst4TuitFee;
		@DbRecordField(dataSourceName="R_C_INST_4_UNASSESS_VA")
		public NNumber RCInst4UnassessVa;
		@DbRecordField(dataSourceName="R_C_INST_5_ASSUM_HOUS")
		public NString RCInst5AssumHous;
		@DbRecordField(dataSourceName="R_C_INST_5_BUDG_DUR")
		public NNumber RCInst5BudgDur;
		@DbRecordField(dataSourceName="R_C_INST_5_BUDG_NAME")
		public NString RCInst5BudgName;
		@DbRecordField(dataSourceName="R_C_INST_5_EST_FA_NEED")
		public NNumber RCInst5EstFaNeed;
		@DbRecordField(dataSourceName="R_C_INST_5_EST_PELL_AWRD")
		public NNumber RCInst5EstPellAwrd;
		@DbRecordField(dataSourceName="R_C_INST_5_LIVING_EXP")
		public NNumber RCInst5LivingExp;
		@DbRecordField(dataSourceName="R_C_INST_5_TOT_EXP")
		public NNumber RCInst5TotExp;
		@DbRecordField(dataSourceName="R_C_INST_5_TOT_CTRB")
		public NNumber RCInst5TotCtrb;
		@DbRecordField(dataSourceName="R_C_INST_5_TOT_FAM_CTRB")
		public NNumber RCInst5TotFamCtrb;
		@DbRecordField(dataSourceName="R_C_INST_5_TOT_PAR_CTRB")
		public NNumber RCInst5TotParCtrb;
		@DbRecordField(dataSourceName="R_C_INST_5_TUIT_FEE")
		public NNumber RCInst5TuitFee;
		@DbRecordField(dataSourceName="R_C_INST_5_UNASSESS_VA")
		public NNumber RCInst5UnassessVa;
		@DbRecordField(dataSourceName="R_C2_INST_1_EST_PELL_AWD")
		public NNumber RC2Inst1EstPellAwd;
		@DbRecordField(dataSourceName="R_C2_INST_1_TOT_FAM_CTRB")
		public NNumber RC2Inst1TotFamCtrb;
		@DbRecordField(dataSourceName="R_C2_INST_2_EST_PELL_AWD")
		public NNumber RC2Inst2EstPellAwd;
		@DbRecordField(dataSourceName="R_C2_INST_2_TOT_FAM_CTRB")
		public NNumber RC2Inst2TotFamCtrb;
		@DbRecordField(dataSourceName="R_C2_INST_3_EST_PELL_AWD")
		public NNumber RC2Inst3EstPellAwd;
		@DbRecordField(dataSourceName="R_C2_INST_3_TOT_FAM_CTRB")
		public NNumber RC2Inst3TotFamCtrb;
		@DbRecordField(dataSourceName="R_C2_INST_4_EST_PELL_AWD")
		public NNumber RC2Inst4EstPellAwd;
		@DbRecordField(dataSourceName="R_C2_INST_4_TOT_FAM_CTRB")
		public NNumber RC2Inst4TotFamCtrb;
		@DbRecordField(dataSourceName="R_C2_INST_5_EST_PELL_AWD")
		public NNumber RC2Inst5EstPellAwd;
		@DbRecordField(dataSourceName="R_C2_INST_5_TOT_FAM_CTRB")
		public NNumber RC2Inst5TotFamCtrb;
		@DbRecordField(dataSourceName="R_PELL_1_EFC")
		public NNumber RPell1Efc;
		@DbRecordField(dataSourceName="R_PELL_2_EFC")
		public NNumber RPell2Efc;
		@DbRecordField(dataSourceName="R_S_IV_INC")
		public NNumber RSIvInc;
		@DbRecordField(dataSourceName="R_P_IV_INC")
		public NNumber RPIvInc;
		@DbRecordField(dataSourceName="R_CURRENT_PLUS")
		public NString RCurrentPlus;
		@DbRecordField(dataSourceName="R_CURRENT_CONSOL")
		public NString RCurrentConsol;
		@DbRecordField(dataSourceName="R_WORK_STUDY")
		public NString RWorkStudy;
		@DbRecordField(dataSourceName="R_LOAN_INT")
		public NString RLoanInt;
		@DbRecordField(dataSourceName="R_PLUS_INT")
		public NString RPlusInt;
		@DbRecordField(dataSourceName="R_S_DIV_INT_INC")
		public NNumber RSDivIntInc;
		@DbRecordField(dataSourceName="R_S_FARM_VAL_FAF")
		public NNumber RSFarmValFaf;
		@DbRecordField(dataSourceName="R_S_FARM_DBT_FAF")
		public NNumber RSFarmDbtFaf;
		@DbRecordField(dataSourceName="R_P_FARM_VAL_FAF")
		public NNumber RPFarmValFaf;
		@DbRecordField(dataSourceName="R_P_FARM_DBT_FAF")
		public NNumber RPFarmDbtFaf;
		@DbRecordField(dataSourceName="R_VERIF_NUM")
		public NString RVerifNum;
		@DbRecordField(dataSourceName="R_ALT_OPT_TUIT")
		public NString RAltOptTuit;
		@DbRecordField(dataSourceName="R_MSG_31")
		public NString RMsg31;
		@DbRecordField(dataSourceName="R_MSG_72")
		public NString RMsg72;
		@DbRecordField(dataSourceName="R_OLDEST_LOAN_DATE")
		public NString ROldestLoanDate;
		@DbRecordField(dataSourceName="R_NSLDS_MATCH")
		public NString RNsldsMatch;
		@DbRecordField(dataSourceName="R_BAL_ON_SLS")
		public NNumber RBalOnSls;
		@DbRecordField(dataSourceName="R_C_NA_1_IM_PC_IND")
		public NString RCNa1ImPcInd;
		@DbRecordField(dataSourceName="R_IRA_KEOGH_AMT")
		public NNumber RIraKeoghAmt;
		@DbRecordField(dataSourceName="R_VISA_CLASS")
		public NString RVisaClass;
		@DbRecordField(dataSourceName="R_C_1_INC_ADJ")
		public NNumber RC1IncAdj;
		@DbRecordField(dataSourceName="R_C_1_OTH_ALLOW")
		public NNumber RC1OthAllow;
		@DbRecordField(dataSourceName="R_C_1_IRA_KEOGH")
		public NNumber RC1IraKeogh;
		@DbRecordField(dataSourceName="R_C_1_TRUST_VAL")
		public NNumber RC1TrustVal;
		@DbRecordField(dataSourceName="R_C_1_OTH_ASSET")
		public NNumber RC1OthAsset;
		@DbRecordField(dataSourceName="R_C_1_OTH_ASSET_ALLOW")
		public NNumber RC1OthAssetAllow;
		@DbRecordField(dataSourceName="R_C_2_INC_ADJ")
		public NNumber RC2IncAdj;
		@DbRecordField(dataSourceName="R_C_2_OTH_ALLOW")
		public NNumber RC2OthAllow;
		@DbRecordField(dataSourceName="R_C_2_IRA_KEOGH")
		public NNumber RC2IraKeogh;
		@DbRecordField(dataSourceName="R_C_2_TRUST_VAL")
		public NNumber RC2TrustVal;
		@DbRecordField(dataSourceName="R_C_2_OTH_ASSET")
		public NNumber RC2OthAsset;
		@DbRecordField(dataSourceName="R_C_2_OTH_ASSET_ALLOW")
		public NNumber RC2OthAssetAllow;
		@DbRecordField(dataSourceName="R_C_PAR_1_INC_ADJ")
		public NNumber RCPar1IncAdj;
		@DbRecordField(dataSourceName="R_C_PAR_1_OTH_ALLOW")
		public NNumber RCPar1OthAllow;
		@DbRecordField(dataSourceName="R_C_PAR_1_OTH_ASSET")
		public NNumber RCPar1OthAsset;
		@DbRecordField(dataSourceName="R_C_PAR_1_OTH_ASSET_ALLW")
		public NNumber RCPar1OthAssetAllw;
		@DbRecordField(dataSourceName="R_C_PAR_2_INC_ADJ")
		public NNumber RCPar2IncAdj;
		@DbRecordField(dataSourceName="R_C_PAR_2_OTH_ALLOW")
		public NNumber RCPar2OthAllow;
		@DbRecordField(dataSourceName="R_C_PAR_2_OTH_ASSET")
		public NNumber RCPar2OthAsset;
		@DbRecordField(dataSourceName="R_C_PAR_2_OTH_ASSET_ALLW")
		public NNumber RCPar2OthAssetAllw;
		@DbRecordField(dataSourceName="R_TYPE_DATA_AVAIL")
		public NString RTypeDataAvail;
		@DbRecordField(dataSourceName="R_IM_PAR_DATA_AVAIL")
		public NString RImParDataAvail;
		@DbRecordField(dataSourceName="R_FM_PAR_DATA_AVAIL")
		public NString RFmParDataAvail;
		@DbRecordField(dataSourceName="R_IM_BUDG_DUR_FOR_CALC")
		public NNumber RImBudgDurForCalc;
		@DbRecordField(dataSourceName="R_STATE_FOR_TAXES")
		public NString RStateForTaxes;
		@DbRecordField(dataSourceName="R_PAR_STATE_FOR_TAXES")
		public NString RParStateForTaxes;
		@DbRecordField(dataSourceName="R_FORMULA_FOR_CALC")
		public NString RFormulaForCalc;
		@DbRecordField(dataSourceName="R_TAX_FILER")
		public NString RTaxFiler;
		@DbRecordField(dataSourceName="R_PAR_TAX_FILER")
		public NString RParTaxFiler;
		@DbRecordField(dataSourceName="R_TYPE_FM_CALC")
		public NString RTypeFmCalc;
		@DbRecordField(dataSourceName="R_PAR_DEP_CARE_AND_MED")
		public NNumber RParDepCareAndMed;
		@DbRecordField(dataSourceName="R_EXP_PAR_TUIT_PD")
		public NNumber RExpParTuitPd;
		@DbRecordField(dataSourceName="R_EXP_PAR_NO_CHILD_TUIT")
		public NNumber RExpParNoChildTuit;
		@DbRecordField(dataSourceName="R_HME_YR_PURCH")
		public NNumber RHmeYrPurch;
		@DbRecordField(dataSourceName="R_HME_PURCH_AMT")
		public NNumber RHmePurchAmt;
		@DbRecordField(dataSourceName="R_C_INST_1_OTH_CTRB")
		public NNumber RCInst1OthCtrb;
		@DbRecordField(dataSourceName="R_S_EIC")
		public NNumber RSEic;
		@DbRecordField(dataSourceName="R_SSA_CITIZEN_IND")
		public NString RSsaCitizenInd;
		@DbRecordField(dataSourceName="R_SAR_EFC")
		public NNumber RSarEfc;
		@DbRecordField(dataSourceName="R_HS_GED_RCVD")
		public NString RHsGedRcvd;
		@DbRecordField(dataSourceName="R_FISAP_INC")
		public NNumber RFisapInc;
		@DbRecordField(dataSourceName="R_EMAIL_ADDRESS")
		public NString REmailAddress;
		@DbRecordField(dataSourceName="R_NSLDS_TRAN_NO")
		public NString RNsldsTranNo;
		@DbRecordField(dataSourceName="R_DRIVERS_LIC_IND")
		public NString RDriversLicInd;
		@DbRecordField(dataSourceName="R_LEGAL_RES_IND")
		public NString RLegalResInd;
		@DbRecordField(dataSourceName="R_PAR_LEGAL_RES_IND")
		public NString RParLegalResInd;
		@DbRecordField(dataSourceName="R_TX_RET_FILED_IND")
		public NString RTxRetFiledInd;
		@DbRecordField(dataSourceName="R_PAR_TX_RET_FILED_IND")
		public NString RParTxRetFiledInd;
		@DbRecordField(dataSourceName="R_1040A_ELIG_IND")
		public NString R1040aEligInd;
		@DbRecordField(dataSourceName="R_PAR_1040A_ELIG_IND")
		public NString RPar1040aEligInd;
		@DbRecordField(dataSourceName="R_INV_NET_WORTH")
		public NNumber RInvNetWorth;
		@DbRecordField(dataSourceName="R_PAR_INV_NET_WORTH")
		public NNumber RParInvNetWorth;
		@DbRecordField(dataSourceName="R_BUS_NET_WORTH")
		public NNumber RBusNetWorth;
		@DbRecordField(dataSourceName="R_PAR_BUS_NET_WORTH")
		public NNumber RParBusNetWorth;
		@DbRecordField(dataSourceName="R_FARM_NET_WORTH")
		public NNumber RFarmNetWorth;
		@DbRecordField(dataSourceName="R_PAR_FARM_NET_WORTH")
		public NNumber RParFarmNetWorth;
		@DbRecordField(dataSourceName="R_DEATH_DATE")
		public NDate RDeathDate;
		@DbRecordField(dataSourceName="R_VA_MATCH_FLAG")
		public NString RVaMatchFlag;
		@DbRecordField(dataSourceName="R_FISAP_2_INC")
		public NNumber RFisap2Inc;
		@DbRecordField(dataSourceName="R_DRUG_OFFENSE_CONVIC")
		public NString RDrugOffenseConvic;
		@DbRecordField(dataSourceName="R_FATH_LAST_NAME")
		public NString RFathLastName;
		@DbRecordField(dataSourceName="R_MOTH_LAST_NAME")
		public NString RMothLastName;
		@DbRecordField(dataSourceName="R_FATH_SSN")
		public NString RFathSsn;
		@DbRecordField(dataSourceName="R_MOTH_SSN")
		public NString RMothSsn;
		@DbRecordField(dataSourceName="R_SUB_VERIF_SELECTED")
		public NString RSubVerifSelected;
		@DbRecordField(dataSourceName="R_P_RES_DATE_MO_YR")
		public NString RPResDateMoYr;
		@DbRecordField(dataSourceName="R_S_RES_DATE_MO_YR")
		public NString RSResDateMoYr;
		@DbRecordField(dataSourceName="R_PRISONER_MATCH_FLAG")
		public NString RPrisonerMatchFlag;
		@DbRecordField(dataSourceName="R_HAVE_CHILDREN")
		public NString RHaveChildren;
		@DbRecordField(dataSourceName="R_PAR_WORKSHEET_C")
		public NNumber RParWorksheetC;
		@DbRecordField(dataSourceName="R_WORKSHEET_C")
		public NNumber RWorksheetC;
		@DbRecordField(dataSourceName="R_SOURCE_CORRECTION")
		public NString RSourceCorrection;
		@DbRecordField(dataSourceName="R_EFC_CHANGE_IND")
		public NString REfcChangeInd;
		@DbRecordField(dataSourceName="R_DUP_SSN_IND")
		public NString RDupSsnInd;
		@DbRecordField(dataSourceName="R_EARLY_ADM_FLAG")
		public NString REarlyAdmFlag;
		@DbRecordField(dataSourceName="R_SEC_INS_MATCH_IND")
		public NString RSecInsMatchInd;
		@DbRecordField(dataSourceName="R_WORKSHEET_A")
		public NNumber RWorksheetA;
		@DbRecordField(dataSourceName="R_PAR_WORKSHEET_A")
		public NNumber RParWorksheetA;
		@DbRecordField(dataSourceName="R_WORKSHEET_B")
		public NNumber RWorksheetB;
		@DbRecordField(dataSourceName="R_PAR_WORKSHEET_B")
		public NNumber RParWorksheetB;
		@DbRecordField(dataSourceName="R_SS_MATCH")
		public NString RSsMatch;
		@DbRecordField(dataSourceName="R_SS_REG_FLAG")
		public NString RSsRegFlag;
		@DbRecordField(dataSourceName="R_FATH_FIRST_NAME_INI")
		public NString RFathFirstNameIni;
		@DbRecordField(dataSourceName="R_FATH_BIRTH_DATE")
		public NDate RFathBirthDate;
		@DbRecordField(dataSourceName="R_MOTH_FIRST_NAME_INI")
		public NString RMothFirstNameIni;
		@DbRecordField(dataSourceName="R_MOTH_BIRTH_DATE")
		public NDate RMothBirthDate;
		@DbRecordField(dataSourceName="R_P_EMAIL_ADDRESS")
		public NString RPEmailAddress;
		@DbRecordField(dataSourceName="R_ADDRESS_CHG_FLAG")
		public NString RAddressChgFlag;
		@DbRecordField(dataSourceName="R_PUSH_ISIR_FLAG")
		public NString RPushIsirFlag;
		@DbRecordField(dataSourceName="R_SAR_C_CHANGE_FLAG")
		public NString RSarCChangeFlag;
		@DbRecordField(dataSourceName="R_CUSTODIAL_PARENT")
		public NString RCustodialParent;
		@DbRecordField(dataSourceName="R_CUST_PAR_BASE_PCT_INC")
		public NNumber RCustParBasePctInc;
		@DbRecordField(dataSourceName="R_PAR_BASE_CTRB_INC")
		public NNumber RParBaseCtrbInc;
		@DbRecordField(dataSourceName="R_PAR_BASE_CTRB_ASSETS")
		public NNumber RParBaseCtrbAssets;
		@DbRecordField(dataSourceName="R_PAR_BASE_TOT_CTRB")
		public NNumber RParBaseTotCtrb;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_FEE_WAIVER_IND")
		public NString RFeeWaiverInd;
		@DbRecordField(dataSourceName="R_WRK_STDY_LOANS_INT")
		public NString RWrkStdyLoansInt;
		@DbRecordField(dataSourceName="R_AP_FLAG")
		public NString RApFlag;
		@DbRecordField(dataSourceName="R_PAR1_OCCUPATION")
		public NString RPar1Occupation;
		@DbRecordField(dataSourceName="R_PAR1_EMPLOYER")
		public NString RPar1Employer;
		@DbRecordField(dataSourceName="R_PAR2_OCCUPATION")
		public NString RPar2Occupation;
		@DbRecordField(dataSourceName="R_PAR2_EMPLOYER")
		public NString RPar2Employer;
		@DbRecordField(dataSourceName="R_ADOPTED_AFTER_13")
		public NString RAdoptedAfter13;
		@DbRecordField(dataSourceName="R_HOMELESS")
		public NString RHomeless;
		@DbRecordField(dataSourceName="R_COMBAT_PAY")
		public NNumber RCombatPay;
		@DbRecordField(dataSourceName="R_PAR_NUM_BUSINESSES")
		public NNumber RParNumBusinesses;
		@DbRecordField(dataSourceName="R_PAR_NUM_FARMS")
		public NNumber RParNumFarms;
		@DbRecordField(dataSourceName="R_PAR_COMBAT_PAY")
		public NNumber RParCombatPay;
		@DbRecordField(dataSourceName="R_PARENT_TYPE_1")
		public NString RParentType1;
		@DbRecordField(dataSourceName="R_PARENT_TYPE_2")
		public NString RParentType2;
		@DbRecordField(dataSourceName="R_DOD_MATCH_FLAG")
		public NString RDodMatchFlag;
		@DbRecordField(dataSourceName="R_DOD_PAR_DEATH_DATE")
		public NDate RDodParDeathDate;
		@DbRecordField(dataSourceName="R_HIGH_SCHOOL_NAME")
		public NString RHighSchoolName;
		@DbRecordField(dataSourceName="R_HIGH_SCHOOL_CITY")
		public NString RHighSchoolCity;
		@DbRecordField(dataSourceName="R_STAT_CODE_HIGH_SCH")
		public NString RStatCodeHighSch;
		@DbRecordField(dataSourceName="R_HIGH_SCHOOL_CDE")
		public NString RHighSchoolCde;
		@DbRecordField(dataSourceName="R_HIGH_SCHOOL_FLG")
		public NString RHighSchoolFlg;
		@DbRecordField(dataSourceName="R_P_ASSET_THRESH_EXCD")
		public NString RPAssetThreshExcd;
		@DbRecordField(dataSourceName="R_S_ASSET_THRESH_EXCD")
		public NString RSAssetThreshExcd;
		@DbRecordField(dataSourceName="R_PAR_FSA_HEALTH_CARE")
		public NNumber RParFsaHealthCare;
		@DbRecordField(dataSourceName="R_PAR_DEPENDENT_CARE")
		public NNumber RParDependentCare;
		@DbRecordField(dataSourceName="R_PAR_HEALTH_SAV_ACCOUNT")
		public NNumber RParHealthSavAccount;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
