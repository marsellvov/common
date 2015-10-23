package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbTempAppP2 {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P2.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P2.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TempAppP2RecRow recOne,TempAppP2RecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P2.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TempAppP2RecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TempAppP2RecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P2.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P2.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P2.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P2.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
//		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pModelCde,NString pCParDataPresent,NString pCDataPresent,NString pCDependStatus,NNumber pCAge,NString pCMrtlStatus,NNumber pCFamMemb,NNumber pCNoInColl,NString pCParMrtlStatus,NNumber pCParFamMemb,NNumber pCParNoInColl,NNumber pCParParInColl,NNumber pCParOthInColl,NString pCAssumeYrInColl,NString pCPar1AnlyType,NNumber pCPar1AgiTaxInc,NNumber pCPar1TotUntaxInc,NNumber pCPar1TotInc,NNumber pCPar1UsIncTax,NNumber pCPar1StOthTax,NNumber pCPar1FicaTax,NNumber pCPar1MedDenExp,NNumber pCPar1SchTuit,NNumber pCPar1EmpAllow,NNumber pCPar1MntAllow,NNumber pCPar1TotAllow,NNumber pCPar1AvailDiscInc,NNumber pCPar1CashAmt,NNumber pCPar1HmeVal,NNumber pCPar1ReInvVal,NNumber pCPar1AdjBfNetWth,NNumber pCPar1NetWth,NNumber pCPar1ProtAllow,NNumber pCPar1DiscNetWth,NNumber pCPar1ConvPct,NNumber pCPar1IncSupplement,NNumber pCPar1AdjAvailInc,NNumber pCPar1TotCtrb,NNumber pCPar1NoInColl,NNumber pCPar1CtrbForStdt,NString pCPar1CtrbOfflEst,NNumber pCPar1CtrbFrInc,NNumber pCPar1CtrbFrAsset,NString pCPar2AnlyType,NNumber pCPar2AgiTaxInc,NNumber pCPar2TotUntaxInc,NNumber pCPar2TotInc,NNumber pCPar2UsIncTax,NNumber pCPar2StOthTax,NNumber pCPar2FicaTax,NNumber pCPar2MedDenExp,NNumber pCPar2SchTuit,NNumber pCPar2EmpAllow,NNumber pCPar2MntAllow,NNumber pCPar2TotAllow,NNumber pCPar2AvailDiscInc,NNumber pCPar2CashAmt,NNumber pCPar2HmeVal,NNumber pCPar2ReInvVal,NNumber pCPar2AdjBfNetWth,NNumber pCPar2NetWth,NNumber pCPar2ProtAllow,NNumber pCPar2DiscNetWth,NNumber pCPar2ConvPct,NNumber pCPar2IncSupplement,NNumber pCPar2AdjAvailInc,NNumber pCPar2TotCtrb,NNumber pCPar2NoInColl,NNumber pCPar2CtrbForStdt,NString pCPar2CtrbOfflEst,NNumber pCPar2CtrbFrInc,NNumber pCPar2CtrbFrAsset,NString pC1AnlyType,NNumber pC1AgiTaxInc,NNumber pC1TotUntaxInc,NNumber pC1TotInc,NNumber pC1UsIncTax,NNumber pC1StOthTax,NNumber pC1FicaTax,NNumber pC1MedDenExp,NNumber pC1SchTuit,NNumber pC1EmpAllow,NNumber pC1MntAllow,NNumber pC1AvailTaxInc,NNumber pC1AvailDiscInc,NNumber pC1CashAmt,NNumber pC1HmeVal,NNumber pC1ReInvVal,NNumber pC1AdjBfNetWth,NNumber pC1NetWth,NNumber pC1ProtAllow,NNumber pC1DiscNetWth,NNumber pC1ConvPct,NNumber pC1IncSupplement,NNumber pC1AdjAvailInc,NNumber pC1TotCtrb,NNumber pC1NoInColl,NNumber pC1CtrbForStdt,NString pC1CtrbOfflEst,NNumber pC1CtrbFrInc,NNumber pC1CtrbFrAsset,NString pC1VaBenIncl,NNumber pC1TaxIncCtrb,NNumber pC1TotAllow,NNumber pC1CalcAvailInc,NString pC2AnlyType,NNumber pC2AgiTaxInc,NNumber pC2TotUntaxInc,NNumber pC2TotInc,NNumber pC2UsIncTax,NNumber pC2StOthTax,NNumber pC2FicaTax,NNumber pC2MedDenExp,NNumber pC2SchTuit,NNumber pC2EmpAllow,NNumber pC2MntAllow,NNumber pC2AvailTaxInc,NNumber pC2AvailDiscInc,NNumber pC2CashAmt,NNumber pC2HmeVal,NNumber pC2ReInvVal,NNumber pC2AdjBfNetWth,NNumber pC2NetWth,NNumber pC2ProtAllow,NNumber pC2DiscNetWth,NNumber pC2ConvPct,NNumber pC2IncSupplement,NNumber pC2AdjAvailInc,NNumber pC2TotCtrb,NNumber pC2NoInColl,NNumber pC2CtrbForStdt,NString pC2CtrbOfflEst,NNumber pC2CtrbFrInc,NNumber pC2CtrbFrAsset,NString pC2VaBenIncl,NNumber pC2TaxIncCtrb,NNumber pC2TotAllow,NNumber pC2CalcAvailInc,NNumber pC1TotFamCtrb,NString pC1TfcOfflEst,NNumber pC2TotFamCtrb,NString pC2TfcOfflEst,NString pPellPAnlyType,NNumber pPellPAgiTaxInc,NNumber pPellPTotUntaxInc,NNumber pPellPTotInc,NNumber pPellPUsIncTax,NNumber pPellPStOthTax,NNumber pPellPMedDenExp,NNumber pPellPSchTuit,NNumber pPellPEmpAllow,NNumber pPellPMntAllow,NNumber pPellPTotAllow,NNumber pPellPAvailDiscInc,NNumber pPellPCashAmt,NNumber pPellPHmeVal,NNumber pPellPReInvVal,NNumber pPellPAdjBfNetWth,NNumber pPellPNetWth,NNumber pPellPProtAllow,NNumber pPellPDiscNetWth,NNumber pPellPConvPct,NNumber pPellPTotCtrb,NNumber pPellPNoInColl,NNumber pPellPCtrbForStdt,NString pPellPCtrbOfflEst,NNumber pPellPCtrbFrInc,NNumber pPellPCtrbFrAsset,NString pPellP2AnlyType,NString pPellAnlyType,NNumber pPellAgiTaxInc,NNumber pPellTotUntaxInc,NNumber pPellTotInc,NNumber pPellUsIncTax,NNumber pPellStOthTax,NNumber pPellMedDenExp,NNumber pPellSchTuit,NNumber pPellEmpAllow,NNumber pPellMntAllow,NNumber pPellTotAllow,NNumber pPellAvailDiscInc,NNumber pPellCashAmt,NNumber pPellHmeVal,NNumber pPellReInvVal,NNumber pPellAdjBfNetWth,NNumber pPellNetWth,NNumber pPellProtAllow,NNumber pPellDiscNetWth,NNumber pPellConvPct,NNumber pPellTotCtrb,NNumber pPellNoInColl,NNumber pPellCtrbForStdt,NString pPellCtrbOfflEst,NNumber pPellCtrbFrInc,NNumber pPellCtrbFrAsset,NNumber pPellPgi,NString pPellPgiOfflEst,NString pPell2AnlyType,NNumber pPell2Pgi,NString pPell2PgiOfflEst,NNumber pImBudgLength,NString pIm1AnlyType,NNumber pIm1Sc,NString pIm1ParAnlyType,NNumber pIm1Pc,NNumber pIm1UnassessedVa,NNumber pIm1Tfc,NString pIm2AnlyType,NNumber pIm2Sc,NString pIm2ParAnlyType,NNumber pIm2Pc,NNumber pIm2UnassessedVa,NNumber pInasCtr,NNumber pRqstSlsAmt,NString pDeferSlsPmts,NString pSlsIntsPmts,NNumber pBalOnAllSls,NNumber pRecentSlsBal,NString pRecentSlsFrMthYr,NString pRecentSlsClass,NString pLenderCode,NString pDegreeSought,NString pDrugAbuse,NString pEligibilityMsg,NString pEpsCde,NString pHsGraduate,NDate pOrigRcptDate,NString pDurEligOvrdInd,NNumber pC1UnadjBusNet,NNumber pC1UnadjFarmNet,NNumber pCPar1UnadjBusNet,NNumber pCPar1UnadjFarmNet,NNumber pCPar2CalcAvailInc,NNumber pCPar2UnadjBusNet,NNumber pCPar2UnadjFarmNet,NNumber pFmInst1FedEfc,NNumber pFmInst1FedElig,NNumber pFmInst1VaBen,NNumber pFmInst2FedEfc,NNumber pFmInst2FedElig,NNumber pFmInst2VaBen,NNumber pFmInst3FedEfc,NNumber pFmInst3FedElig,NNumber pFmInst3VaBen,NString pCm2ImCalcInd,NNumber pCParAge,NString pUserId,NNumber pCAddlFinancial,NNumber pCUntaxInc,NNumber pCParAddlFinancial,NNumber pCParUntaxInc,Ref<NString> pRowidOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P2.P_CREATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_INFC_CODE", pInfcCode);
//			cmd.addParameter("@P_SEQ_NO", pSeqNo);
//			cmd.addParameter("@P_MODEL_CDE", pModelCde);
//			cmd.addParameter("@P_C_PAR_DATA_PRESENT", pCParDataPresent);
//			cmd.addParameter("@P_C_DATA_PRESENT", pCDataPresent);
//			cmd.addParameter("@P_C_DEPEND_STATUS", pCDependStatus);
//			cmd.addParameter("@P_C_AGE", pCAge);
//			cmd.addParameter("@P_C_MRTL_STATUS", pCMrtlStatus);
//			cmd.addParameter("@P_C_FAM_MEMB", pCFamMemb);
//			cmd.addParameter("@P_C_NO_IN_COLL", pCNoInColl);
//			cmd.addParameter("@P_C_PAR_MRTL_STATUS", pCParMrtlStatus);
//			cmd.addParameter("@P_C_PAR_FAM_MEMB", pCParFamMemb);
//			cmd.addParameter("@P_C_PAR_NO_IN_COLL", pCParNoInColl);
//			cmd.addParameter("@P_C_PAR_PAR_IN_COLL", pCParParInColl);
//			cmd.addParameter("@P_C_PAR_OTH_IN_COLL", pCParOthInColl);
//			cmd.addParameter("@P_C_ASSUME_YR_IN_COLL", pCAssumeYrInColl);
//			cmd.addParameter("@P_C_PAR_1_ANLY_TYPE", pCPar1AnlyType);
//			cmd.addParameter("@P_C_PAR_1_AGI_TAX_INC", pCPar1AgiTaxInc);
//			cmd.addParameter("@P_C_PAR_1_TOT_UNTAX_INC", pCPar1TotUntaxInc);
//			cmd.addParameter("@P_C_PAR_1_TOT_INC", pCPar1TotInc);
//			cmd.addParameter("@P_C_PAR_1_US_INC_TAX", pCPar1UsIncTax);
//			cmd.addParameter("@P_C_PAR_1_ST_OTH_TAX", pCPar1StOthTax);
//			cmd.addParameter("@P_C_PAR_1_FICA_TAX", pCPar1FicaTax);
//			cmd.addParameter("@P_C_PAR_1_MED_DEN_EXP", pCPar1MedDenExp);
//			cmd.addParameter("@P_C_PAR_1_SCH_TUIT", pCPar1SchTuit);
//			cmd.addParameter("@P_C_PAR_1_EMP_ALLOW", pCPar1EmpAllow);
//			cmd.addParameter("@P_C_PAR_1_MNT_ALLOW", pCPar1MntAllow);
//			cmd.addParameter("@P_C_PAR_1_TOT_ALLOW", pCPar1TotAllow);
//			cmd.addParameter("@P_C_PAR_1_AVAIL_DISC_INC", pCPar1AvailDiscInc);
//			cmd.addParameter("@P_C_PAR_1_CASH_AMT", pCPar1CashAmt);
//			cmd.addParameter("@P_C_PAR_1_HME_VAL", pCPar1HmeVal);
//			cmd.addParameter("@P_C_PAR_1_RE_INV_VAL", pCPar1ReInvVal);
//			cmd.addParameter("@P_C_PAR_1_ADJ_BF_NET_WTH", pCPar1AdjBfNetWth);
//			cmd.addParameter("@P_C_PAR_1_NET_WTH", pCPar1NetWth);
//			cmd.addParameter("@P_C_PAR_1_PROT_ALLOW", pCPar1ProtAllow);
//			cmd.addParameter("@P_C_PAR_1_DISC_NET_WTH", pCPar1DiscNetWth);
//			cmd.addParameter("@P_C_PAR_1_CONV_PCT", pCPar1ConvPct);
//			cmd.addParameter("@P_C_PAR_1_INC_SUPPLEMENT", pCPar1IncSupplement);
//			cmd.addParameter("@P_C_PAR_1_ADJ_AVAIL_INC", pCPar1AdjAvailInc);
//			cmd.addParameter("@P_C_PAR_1_TOT_CTRB", pCPar1TotCtrb);
//			cmd.addParameter("@P_C_PAR_1_NO_IN_COLL", pCPar1NoInColl);
//			cmd.addParameter("@P_C_PAR_1_CTRB_FOR_STDT", pCPar1CtrbForStdt);
//			cmd.addParameter("@P_C_PAR_1_CTRB_OFFL_EST", pCPar1CtrbOfflEst);
//			cmd.addParameter("@P_C_PAR_1_CTRB_FR_INC", pCPar1CtrbFrInc);
//			cmd.addParameter("@P_C_PAR_1_CTRB_FR_ASSET", pCPar1CtrbFrAsset);
//			cmd.addParameter("@P_C_PAR_2_ANLY_TYPE", pCPar2AnlyType);
//			cmd.addParameter("@P_C_PAR_2_AGI_TAX_INC", pCPar2AgiTaxInc);
//			cmd.addParameter("@P_C_PAR_2_TOT_UNTAX_INC", pCPar2TotUntaxInc);
//			cmd.addParameter("@P_C_PAR_2_TOT_INC", pCPar2TotInc);
//			cmd.addParameter("@P_C_PAR_2_US_INC_TAX", pCPar2UsIncTax);
//			cmd.addParameter("@P_C_PAR_2_ST_OTH_TAX", pCPar2StOthTax);
//			cmd.addParameter("@P_C_PAR_2_FICA_TAX", pCPar2FicaTax);
//			cmd.addParameter("@P_C_PAR_2_MED_DEN_EXP", pCPar2MedDenExp);
//			cmd.addParameter("@P_C_PAR_2_SCH_TUIT", pCPar2SchTuit);
//			cmd.addParameter("@P_C_PAR_2_EMP_ALLOW", pCPar2EmpAllow);
//			cmd.addParameter("@P_C_PAR_2_MNT_ALLOW", pCPar2MntAllow);
//			cmd.addParameter("@P_C_PAR_2_TOT_ALLOW", pCPar2TotAllow);
//			cmd.addParameter("@P_C_PAR_2_AVAIL_DISC_INC", pCPar2AvailDiscInc);
//			cmd.addParameter("@P_C_PAR_2_CASH_AMT", pCPar2CashAmt);
//			cmd.addParameter("@P_C_PAR_2_HME_VAL", pCPar2HmeVal);
//			cmd.addParameter("@P_C_PAR_2_RE_INV_VAL", pCPar2ReInvVal);
//			cmd.addParameter("@P_C_PAR_2_ADJ_BF_NET_WTH", pCPar2AdjBfNetWth);
//			cmd.addParameter("@P_C_PAR_2_NET_WTH", pCPar2NetWth);
//			cmd.addParameter("@P_C_PAR_2_PROT_ALLOW", pCPar2ProtAllow);
//			cmd.addParameter("@P_C_PAR_2_DISC_NET_WTH", pCPar2DiscNetWth);
//			cmd.addParameter("@P_C_PAR_2_CONV_PCT", pCPar2ConvPct);
//			cmd.addParameter("@P_C_PAR_2_INC_SUPPLEMENT", pCPar2IncSupplement);
//			cmd.addParameter("@P_C_PAR_2_ADJ_AVAIL_INC", pCPar2AdjAvailInc);
//			cmd.addParameter("@P_C_PAR_2_TOT_CTRB", pCPar2TotCtrb);
//			cmd.addParameter("@P_C_PAR_2_NO_IN_COLL", pCPar2NoInColl);
//			cmd.addParameter("@P_C_PAR_2_CTRB_FOR_STDT", pCPar2CtrbForStdt);
//			cmd.addParameter("@P_C_PAR_2_CTRB_OFFL_EST", pCPar2CtrbOfflEst);
//			cmd.addParameter("@P_C_PAR_2_CTRB_FR_INC", pCPar2CtrbFrInc);
//			cmd.addParameter("@P_C_PAR_2_CTRB_FR_ASSET", pCPar2CtrbFrAsset);
//			cmd.addParameter("@P_C_1_ANLY_TYPE", pC1AnlyType);
//			cmd.addParameter("@P_C_1_AGI_TAX_INC", pC1AgiTaxInc);
//			cmd.addParameter("@P_C_1_TOT_UNTAX_INC", pC1TotUntaxInc);
//			cmd.addParameter("@P_C_1_TOT_INC", pC1TotInc);
//			cmd.addParameter("@P_C_1_US_INC_TAX", pC1UsIncTax);
//			cmd.addParameter("@P_C_1_ST_OTH_TAX", pC1StOthTax);
//			cmd.addParameter("@P_C_1_FICA_TAX", pC1FicaTax);
//			cmd.addParameter("@P_C_1_MED_DEN_EXP", pC1MedDenExp);
//			cmd.addParameter("@P_C_1_SCH_TUIT", pC1SchTuit);
//			cmd.addParameter("@P_C_1_EMP_ALLOW", pC1EmpAllow);
//			cmd.addParameter("@P_C_1_MNT_ALLOW", pC1MntAllow);
//			cmd.addParameter("@P_C_1_AVAIL_TAX_INC", pC1AvailTaxInc);
//			cmd.addParameter("@P_C_1_AVAIL_DISC_INC", pC1AvailDiscInc);
//			cmd.addParameter("@P_C_1_CASH_AMT", pC1CashAmt);
//			cmd.addParameter("@P_C_1_HME_VAL", pC1HmeVal);
//			cmd.addParameter("@P_C_1_RE_INV_VAL", pC1ReInvVal);
//			cmd.addParameter("@P_C_1_ADJ_BF_NET_WTH", pC1AdjBfNetWth);
//			cmd.addParameter("@P_C_1_NET_WTH", pC1NetWth);
//			cmd.addParameter("@P_C_1_PROT_ALLOW", pC1ProtAllow);
//			cmd.addParameter("@P_C_1_DISC_NET_WTH", pC1DiscNetWth);
//			cmd.addParameter("@P_C_1_CONV_PCT", pC1ConvPct);
//			cmd.addParameter("@P_C_1_INC_SUPPLEMENT", pC1IncSupplement);
//			cmd.addParameter("@P_C_1_ADJ_AVAIL_INC", pC1AdjAvailInc);
//			cmd.addParameter("@P_C_1_TOT_CTRB", pC1TotCtrb);
//			cmd.addParameter("@P_C_1_NO_IN_COLL", pC1NoInColl);
//			cmd.addParameter("@P_C_1_CTRB_FOR_STDT", pC1CtrbForStdt);
//			cmd.addParameter("@P_C_1_CTRB_OFFL_EST", pC1CtrbOfflEst);
//			cmd.addParameter("@P_C_1_CTRB_FR_INC", pC1CtrbFrInc);
//			cmd.addParameter("@P_C_1_CTRB_FR_ASSET", pC1CtrbFrAsset);
//			cmd.addParameter("@P_C_1_VA_BEN_INCL", pC1VaBenIncl);
//			cmd.addParameter("@P_C_1_TAX_INC_CTRB", pC1TaxIncCtrb);
//			cmd.addParameter("@P_C_1_TOT_ALLOW", pC1TotAllow);
//			cmd.addParameter("@P_C_1_CALC_AVAIL_INC", pC1CalcAvailInc);
//			cmd.addParameter("@P_C_2_ANLY_TYPE", pC2AnlyType);
//			cmd.addParameter("@P_C_2_AGI_TAX_INC", pC2AgiTaxInc);
//			cmd.addParameter("@P_C_2_TOT_UNTAX_INC", pC2TotUntaxInc);
//			cmd.addParameter("@P_C_2_TOT_INC", pC2TotInc);
//			cmd.addParameter("@P_C_2_US_INC_TAX", pC2UsIncTax);
//			cmd.addParameter("@P_C_2_ST_OTH_TAX", pC2StOthTax);
//			cmd.addParameter("@P_C_2_FICA_TAX", pC2FicaTax);
//			cmd.addParameter("@P_C_2_MED_DEN_EXP", pC2MedDenExp);
//			cmd.addParameter("@P_C_2_SCH_TUIT", pC2SchTuit);
//			cmd.addParameter("@P_C_2_EMP_ALLOW", pC2EmpAllow);
//			cmd.addParameter("@P_C_2_MNT_ALLOW", pC2MntAllow);
//			cmd.addParameter("@P_C_2_AVAIL_TAX_INC", pC2AvailTaxInc);
//			cmd.addParameter("@P_C_2_AVAIL_DISC_INC", pC2AvailDiscInc);
//			cmd.addParameter("@P_C_2_CASH_AMT", pC2CashAmt);
//			cmd.addParameter("@P_C_2_HME_VAL", pC2HmeVal);
//			cmd.addParameter("@P_C_2_RE_INV_VAL", pC2ReInvVal);
//			cmd.addParameter("@P_C_2_ADJ_BF_NET_WTH", pC2AdjBfNetWth);
//			cmd.addParameter("@P_C_2_NET_WTH", pC2NetWth);
//			cmd.addParameter("@P_C_2_PROT_ALLOW", pC2ProtAllow);
//			cmd.addParameter("@P_C_2_DISC_NET_WTH", pC2DiscNetWth);
//			cmd.addParameter("@P_C_2_CONV_PCT", pC2ConvPct);
//			cmd.addParameter("@P_C_2_INC_SUPPLEMENT", pC2IncSupplement);
//			cmd.addParameter("@P_C_2_ADJ_AVAIL_INC", pC2AdjAvailInc);
//			cmd.addParameter("@P_C_2_TOT_CTRB", pC2TotCtrb);
//			cmd.addParameter("@P_C_2_NO_IN_COLL", pC2NoInColl);
//			cmd.addParameter("@P_C_2_CTRB_FOR_STDT", pC2CtrbForStdt);
//			cmd.addParameter("@P_C_2_CTRB_OFFL_EST", pC2CtrbOfflEst);
//			cmd.addParameter("@P_C_2_CTRB_FR_INC", pC2CtrbFrInc);
//			cmd.addParameter("@P_C_2_CTRB_FR_ASSET", pC2CtrbFrAsset);
//			cmd.addParameter("@P_C_2_VA_BEN_INCL", pC2VaBenIncl);
//			cmd.addParameter("@P_C_2_TAX_INC_CTRB", pC2TaxIncCtrb);
//			cmd.addParameter("@P_C_2_TOT_ALLOW", pC2TotAllow);
//			cmd.addParameter("@P_C_2_CALC_AVAIL_INC", pC2CalcAvailInc);
//			cmd.addParameter("@P_C_1_TOT_FAM_CTRB", pC1TotFamCtrb);
//			cmd.addParameter("@P_C_1_TFC_OFFL_EST", pC1TfcOfflEst);
//			cmd.addParameter("@P_C_2_TOT_FAM_CTRB", pC2TotFamCtrb);
//			cmd.addParameter("@P_C_2_TFC_OFFL_EST", pC2TfcOfflEst);
//			cmd.addParameter("@P_PELL_P_ANLY_TYPE", pPellPAnlyType);
//			cmd.addParameter("@P_PELL_P_AGI_TAX_INC", pPellPAgiTaxInc);
//			cmd.addParameter("@P_PELL_P_TOT_UNTAX_INC", pPellPTotUntaxInc);
//			cmd.addParameter("@P_PELL_P_TOT_INC", pPellPTotInc);
//			cmd.addParameter("@P_PELL_P_US_INC_TAX", pPellPUsIncTax);
//			cmd.addParameter("@P_PELL_P_ST_OTH_TAX", pPellPStOthTax);
//			cmd.addParameter("@P_PELL_P_MED_DEN_EXP", pPellPMedDenExp);
//			cmd.addParameter("@P_PELL_P_SCH_TUIT", pPellPSchTuit);
//			cmd.addParameter("@P_PELL_P_EMP_ALLOW", pPellPEmpAllow);
//			cmd.addParameter("@P_PELL_P_MNT_ALLOW", pPellPMntAllow);
//			cmd.addParameter("@P_PELL_P_TOT_ALLOW", pPellPTotAllow);
//			cmd.addParameter("@P_PELL_P_AVAIL_DISC_INC", pPellPAvailDiscInc);
//			cmd.addParameter("@P_PELL_P_CASH_AMT", pPellPCashAmt);
//			cmd.addParameter("@P_PELL_P_HME_VAL", pPellPHmeVal);
//			cmd.addParameter("@P_PELL_P_RE_INV_VAL", pPellPReInvVal);
//			cmd.addParameter("@P_PELL_P_ADJ_BF_NET_WTH", pPellPAdjBfNetWth);
//			cmd.addParameter("@P_PELL_P_NET_WTH", pPellPNetWth);
//			cmd.addParameter("@P_PELL_P_PROT_ALLOW", pPellPProtAllow);
//			cmd.addParameter("@P_PELL_P_DISC_NET_WTH", pPellPDiscNetWth);
//			cmd.addParameter("@P_PELL_P_CONV_PCT", pPellPConvPct);
//			cmd.addParameter("@P_PELL_P_TOT_CTRB", pPellPTotCtrb);
//			cmd.addParameter("@P_PELL_P_NO_IN_COLL", pPellPNoInColl);
//			cmd.addParameter("@P_PELL_P_CTRB_FOR_STDT", pPellPCtrbForStdt);
//			cmd.addParameter("@P_PELL_P_CTRB_OFFL_EST", pPellPCtrbOfflEst);
//			cmd.addParameter("@P_PELL_P_CTRB_FR_INC", pPellPCtrbFrInc);
//			cmd.addParameter("@P_PELL_P_CTRB_FR_ASSET", pPellPCtrbFrAsset);
//			cmd.addParameter("@P_PELL_P_2_ANLY_TYPE", pPellP2AnlyType);
//			cmd.addParameter("@P_PELL_ANLY_TYPE", pPellAnlyType);
//			cmd.addParameter("@P_PELL_AGI_TAX_INC", pPellAgiTaxInc);
//			cmd.addParameter("@P_PELL_TOT_UNTAX_INC", pPellTotUntaxInc);
//			cmd.addParameter("@P_PELL_TOT_INC", pPellTotInc);
//			cmd.addParameter("@P_PELL_US_INC_TAX", pPellUsIncTax);
//			cmd.addParameter("@P_PELL_ST_OTH_TAX", pPellStOthTax);
//			cmd.addParameter("@P_PELL_MED_DEN_EXP", pPellMedDenExp);
//			cmd.addParameter("@P_PELL_SCH_TUIT", pPellSchTuit);
//			cmd.addParameter("@P_PELL_EMP_ALLOW", pPellEmpAllow);
//			cmd.addParameter("@P_PELL_MNT_ALLOW", pPellMntAllow);
//			cmd.addParameter("@P_PELL_TOT_ALLOW", pPellTotAllow);
//			cmd.addParameter("@P_PELL_AVAIL_DISC_INC", pPellAvailDiscInc);
//			cmd.addParameter("@P_PELL_CASH_AMT", pPellCashAmt);
//			cmd.addParameter("@P_PELL_HME_VAL", pPellHmeVal);
//			cmd.addParameter("@P_PELL_RE_INV_VAL", pPellReInvVal);
//			cmd.addParameter("@P_PELL_ADJ_BF_NET_WTH", pPellAdjBfNetWth);
//			cmd.addParameter("@P_PELL_NET_WTH", pPellNetWth);
//			cmd.addParameter("@P_PELL_PROT_ALLOW", pPellProtAllow);
//			cmd.addParameter("@P_PELL_DISC_NET_WTH", pPellDiscNetWth);
//			cmd.addParameter("@P_PELL_CONV_PCT", pPellConvPct);
//			cmd.addParameter("@P_PELL_TOT_CTRB", pPellTotCtrb);
//			cmd.addParameter("@P_PELL_NO_IN_COLL", pPellNoInColl);
//			cmd.addParameter("@P_PELL_CTRB_FOR_STDT", pPellCtrbForStdt);
//			cmd.addParameter("@P_PELL_CTRB_OFFL_EST", pPellCtrbOfflEst);
//			cmd.addParameter("@P_PELL_CTRB_FR_INC", pPellCtrbFrInc);
//			cmd.addParameter("@P_PELL_CTRB_FR_ASSET", pPellCtrbFrAsset);
//			cmd.addParameter("@P_PELL_PGI", pPellPgi);
//			cmd.addParameter("@P_PELL_PGI_OFFL_EST", pPellPgiOfflEst);
//			cmd.addParameter("@P_PELL_2_ANLY_TYPE", pPell2AnlyType);
//			cmd.addParameter("@P_PELL_2_PGI", pPell2Pgi);
//			cmd.addParameter("@P_PELL_2_PGI_OFFL_EST", pPell2PgiOfflEst);
//			cmd.addParameter("@P_IM_BUDG_LENGTH", pImBudgLength);
//			cmd.addParameter("@P_IM_1_ANLY_TYPE", pIm1AnlyType);
//			cmd.addParameter("@P_IM_1_SC", pIm1Sc);
//			cmd.addParameter("@P_IM_1_PAR_ANLY_TYPE", pIm1ParAnlyType);
//			cmd.addParameter("@P_IM_1_PC", pIm1Pc);
//			cmd.addParameter("@P_IM_1_UNASSESSED_VA", pIm1UnassessedVa);
//			cmd.addParameter("@P_IM_1_TFC", pIm1Tfc);
//			cmd.addParameter("@P_IM_2_ANLY_TYPE", pIm2AnlyType);
//			cmd.addParameter("@P_IM_2_SC", pIm2Sc);
//			cmd.addParameter("@P_IM_2_PAR_ANLY_TYPE", pIm2ParAnlyType);
//			cmd.addParameter("@P_IM_2_PC", pIm2Pc);
//			cmd.addParameter("@P_IM_2_UNASSESSED_VA", pIm2UnassessedVa);
//			cmd.addParameter("@P_INAS_CTR", pInasCtr);
//			cmd.addParameter("@P_RQST_SLS_AMT", pRqstSlsAmt);
//			cmd.addParameter("@P_DEFER_SLS_PMTS", pDeferSlsPmts);
//			cmd.addParameter("@P_SLS_INTS_PMTS", pSlsIntsPmts);
//			cmd.addParameter("@P_BAL_ON_ALL_SLS", pBalOnAllSls);
//			cmd.addParameter("@P_RECENT_SLS_BAL", pRecentSlsBal);
//			cmd.addParameter("@P_RECENT_SLS_FR_MTH_YR", pRecentSlsFrMthYr);
//			cmd.addParameter("@P_RECENT_SLS_CLASS", pRecentSlsClass);
//			cmd.addParameter("@P_LENDER_CODE", pLenderCode);
//			cmd.addParameter("@P_DEGREE_SOUGHT", pDegreeSought);
//			cmd.addParameter("@P_DRUG_ABUSE", pDrugAbuse);
//			cmd.addParameter("@P_ELIGIBILITY_MSG", pEligibilityMsg);
//			cmd.addParameter("@P_EPS_CDE", pEpsCde);
//			cmd.addParameter("@P_HS_GRADUATE", pHsGraduate);
//			cmd.addParameter("@P_ORIG_RCPT_DATE", pOrigRcptDate);
//			cmd.addParameter("@P_DUR_ELIG_OVRD_IND", pDurEligOvrdInd);
//			cmd.addParameter("@P_C_1_UNADJ_BUS_NET", pC1UnadjBusNet);
//			cmd.addParameter("@P_C_1_UNADJ_FARM_NET", pC1UnadjFarmNet);
//			cmd.addParameter("@P_C_PAR_1_UNADJ_BUS_NET", pCPar1UnadjBusNet);
//			cmd.addParameter("@P_C_PAR_1_UNADJ_FARM_NET", pCPar1UnadjFarmNet);
//			cmd.addParameter("@P_C_PAR_2_CALC_AVAIL_INC", pCPar2CalcAvailInc);
//			cmd.addParameter("@P_C_PAR_2_UNADJ_BUS_NET", pCPar2UnadjBusNet);
//			cmd.addParameter("@P_C_PAR_2_UNADJ_FARM_NET", pCPar2UnadjFarmNet);
//			cmd.addParameter("@P_FM_INST_1_FED_EFC", pFmInst1FedEfc);
//			cmd.addParameter("@P_FM_INST_1_FED_ELIG", pFmInst1FedElig);
//			cmd.addParameter("@P_FM_INST_1_VA_BEN", pFmInst1VaBen);
//			cmd.addParameter("@P_FM_INST_2_FED_EFC", pFmInst2FedEfc);
//			cmd.addParameter("@P_FM_INST_2_FED_ELIG", pFmInst2FedElig);
//			cmd.addParameter("@P_FM_INST_2_VA_BEN", pFmInst2VaBen);
//			cmd.addParameter("@P_FM_INST_3_FED_EFC", pFmInst3FedEfc);
//			cmd.addParameter("@P_FM_INST_3_FED_ELIG", pFmInst3FedElig);
//			cmd.addParameter("@P_FM_INST_3_VA_BEN", pFmInst3VaBen);
//			cmd.addParameter("@P_CM2_IM_CALC_IND", pCm2ImCalcInd);
//			cmd.addParameter("@P_C_PAR_AGE", pCParAge);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_C_ADDL_FINANCIAL", pCAddlFinancial);
//			cmd.addParameter("@P_C_UNTAX_INC", pCUntaxInc);
//			cmd.addParameter("@P_C_PAR_ADDL_FINANCIAL", pCParAddlFinancial);
//			cmd.addParameter("@P_C_PAR_UNTAX_INC", pCParUntaxInc);
//			cmd.addParameter("@P_ROWID_OUT", NString.class);
//				
//			cmd.execute();
//			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);
//
//
//		}
		
		public static void pDelete(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P2.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteBulk(NString pAidyCode,NString pInfcCode,NString pDeleteFlag,Ref<NNumber> pDelCountOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P2.P_DELETE_BULK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_DELETE_FLAG", pDeleteFlag);
			cmd.addParameter("@P_DEL_COUNT_OUT", NNumber.class);
				
			cmd.execute();
			pDelCountOut.val = cmd.getParameterValue("@P_DEL_COUNT_OUT", NNumber.class);


		}
		
		public static void pLock(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P2.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
//		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pModelCde,NString pCParDataPresent,NString pCDataPresent,NString pCDependStatus,NNumber pCAge,NString pCMrtlStatus,NNumber pCFamMemb,NNumber pCNoInColl,NString pCParMrtlStatus,NNumber pCParFamMemb,NNumber pCParNoInColl,NNumber pCParParInColl,NNumber pCParOthInColl,NString pCAssumeYrInColl,NString pCPar1AnlyType,NNumber pCPar1AgiTaxInc,NNumber pCPar1TotUntaxInc,NNumber pCPar1TotInc,NNumber pCPar1UsIncTax,NNumber pCPar1StOthTax,NNumber pCPar1FicaTax,NNumber pCPar1MedDenExp,NNumber pCPar1SchTuit,NNumber pCPar1EmpAllow,NNumber pCPar1MntAllow,NNumber pCPar1TotAllow,NNumber pCPar1AvailDiscInc,NNumber pCPar1CashAmt,NNumber pCPar1HmeVal,NNumber pCPar1ReInvVal,NNumber pCPar1AdjBfNetWth,NNumber pCPar1NetWth,NNumber pCPar1ProtAllow,NNumber pCPar1DiscNetWth,NNumber pCPar1ConvPct,NNumber pCPar1IncSupplement,NNumber pCPar1AdjAvailInc,NNumber pCPar1TotCtrb,NNumber pCPar1NoInColl,NNumber pCPar1CtrbForStdt,NString pCPar1CtrbOfflEst,NNumber pCPar1CtrbFrInc,NNumber pCPar1CtrbFrAsset,NString pCPar2AnlyType,NNumber pCPar2AgiTaxInc,NNumber pCPar2TotUntaxInc,NNumber pCPar2TotInc,NNumber pCPar2UsIncTax,NNumber pCPar2StOthTax,NNumber pCPar2FicaTax,NNumber pCPar2MedDenExp,NNumber pCPar2SchTuit,NNumber pCPar2EmpAllow,NNumber pCPar2MntAllow,NNumber pCPar2TotAllow,NNumber pCPar2AvailDiscInc,NNumber pCPar2CashAmt,NNumber pCPar2HmeVal,NNumber pCPar2ReInvVal,NNumber pCPar2AdjBfNetWth,NNumber pCPar2NetWth,NNumber pCPar2ProtAllow,NNumber pCPar2DiscNetWth,NNumber pCPar2ConvPct,NNumber pCPar2IncSupplement,NNumber pCPar2AdjAvailInc,NNumber pCPar2TotCtrb,NNumber pCPar2NoInColl,NNumber pCPar2CtrbForStdt,NString pCPar2CtrbOfflEst,NNumber pCPar2CtrbFrInc,NNumber pCPar2CtrbFrAsset,NString pC1AnlyType,NNumber pC1AgiTaxInc,NNumber pC1TotUntaxInc,NNumber pC1TotInc,NNumber pC1UsIncTax,NNumber pC1StOthTax,NNumber pC1FicaTax,NNumber pC1MedDenExp,NNumber pC1SchTuit,NNumber pC1EmpAllow,NNumber pC1MntAllow,NNumber pC1AvailTaxInc,NNumber pC1AvailDiscInc,NNumber pC1CashAmt,NNumber pC1HmeVal,NNumber pC1ReInvVal,NNumber pC1AdjBfNetWth,NNumber pC1NetWth,NNumber pC1ProtAllow,NNumber pC1DiscNetWth,NNumber pC1ConvPct,NNumber pC1IncSupplement,NNumber pC1AdjAvailInc,NNumber pC1TotCtrb,NNumber pC1NoInColl,NNumber pC1CtrbForStdt,NString pC1CtrbOfflEst,NNumber pC1CtrbFrInc,NNumber pC1CtrbFrAsset,NString pC1VaBenIncl,NNumber pC1TaxIncCtrb,NNumber pC1TotAllow,NNumber pC1CalcAvailInc,NString pC2AnlyType,NNumber pC2AgiTaxInc,NNumber pC2TotUntaxInc,NNumber pC2TotInc,NNumber pC2UsIncTax,NNumber pC2StOthTax,NNumber pC2FicaTax,NNumber pC2MedDenExp,NNumber pC2SchTuit,NNumber pC2EmpAllow,NNumber pC2MntAllow,NNumber pC2AvailTaxInc,NNumber pC2AvailDiscInc,NNumber pC2CashAmt,NNumber pC2HmeVal,NNumber pC2ReInvVal,NNumber pC2AdjBfNetWth,NNumber pC2NetWth,NNumber pC2ProtAllow,NNumber pC2DiscNetWth,NNumber pC2ConvPct,NNumber pC2IncSupplement,NNumber pC2AdjAvailInc,NNumber pC2TotCtrb,NNumber pC2NoInColl,NNumber pC2CtrbForStdt,NString pC2CtrbOfflEst,NNumber pC2CtrbFrInc,NNumber pC2CtrbFrAsset,NString pC2VaBenIncl,NNumber pC2TaxIncCtrb,NNumber pC2TotAllow,NNumber pC2CalcAvailInc,NNumber pC1TotFamCtrb,NString pC1TfcOfflEst,NNumber pC2TotFamCtrb,NString pC2TfcOfflEst,NString pPellPAnlyType,NNumber pPellPAgiTaxInc,NNumber pPellPTotUntaxInc,NNumber pPellPTotInc,NNumber pPellPUsIncTax,NNumber pPellPStOthTax,NNumber pPellPMedDenExp,NNumber pPellPSchTuit,NNumber pPellPEmpAllow,NNumber pPellPMntAllow,NNumber pPellPTotAllow,NNumber pPellPAvailDiscInc,NNumber pPellPCashAmt,NNumber pPellPHmeVal,NNumber pPellPReInvVal,NNumber pPellPAdjBfNetWth,NNumber pPellPNetWth,NNumber pPellPProtAllow,NNumber pPellPDiscNetWth,NNumber pPellPConvPct,NNumber pPellPTotCtrb,NNumber pPellPNoInColl,NNumber pPellPCtrbForStdt,NString pPellPCtrbOfflEst,NNumber pPellPCtrbFrInc,NNumber pPellPCtrbFrAsset,NString pPellP2AnlyType,NString pPellAnlyType,NNumber pPellAgiTaxInc,NNumber pPellTotUntaxInc,NNumber pPellTotInc,NNumber pPellUsIncTax,NNumber pPellStOthTax,NNumber pPellMedDenExp,NNumber pPellSchTuit,NNumber pPellEmpAllow,NNumber pPellMntAllow,NNumber pPellTotAllow,NNumber pPellAvailDiscInc,NNumber pPellCashAmt,NNumber pPellHmeVal,NNumber pPellReInvVal,NNumber pPellAdjBfNetWth,NNumber pPellNetWth,NNumber pPellProtAllow,NNumber pPellDiscNetWth,NNumber pPellConvPct,NNumber pPellTotCtrb,NNumber pPellNoInColl,NNumber pPellCtrbForStdt,NString pPellCtrbOfflEst,NNumber pPellCtrbFrInc,NNumber pPellCtrbFrAsset,NNumber pPellPgi,NString pPellPgiOfflEst,NString pPell2AnlyType,NNumber pPell2Pgi,NString pPell2PgiOfflEst,NNumber pImBudgLength,NString pIm1AnlyType,NNumber pIm1Sc,NString pIm1ParAnlyType,NNumber pIm1Pc,NNumber pIm1UnassessedVa,NNumber pIm1Tfc,NString pIm2AnlyType,NNumber pIm2Sc,NString pIm2ParAnlyType,NNumber pIm2Pc,NNumber pIm2UnassessedVa,NNumber pInasCtr,NNumber pRqstSlsAmt,NString pDeferSlsPmts,NString pSlsIntsPmts,NNumber pBalOnAllSls,NNumber pRecentSlsBal,NString pRecentSlsFrMthYr,NString pRecentSlsClass,NString pLenderCode,NString pDegreeSought,NString pDrugAbuse,NString pEligibilityMsg,NString pEpsCde,NString pHsGraduate,NDate pOrigRcptDate,NString pDurEligOvrdInd,NNumber pC1UnadjBusNet,NNumber pC1UnadjFarmNet,NNumber pCPar1UnadjBusNet,NNumber pCPar1UnadjFarmNet,NNumber pCPar2CalcAvailInc,NNumber pCPar2UnadjBusNet,NNumber pCPar2UnadjFarmNet,NNumber pFmInst1FedEfc,NNumber pFmInst1FedElig,NNumber pFmInst1VaBen,NNumber pFmInst2FedEfc,NNumber pFmInst2FedElig,NNumber pFmInst2VaBen,NNumber pFmInst3FedEfc,NNumber pFmInst3FedElig,NNumber pFmInst3VaBen,NString pCm2ImCalcInd,NNumber pCParAge,NString pUserId,NNumber pCAddlFinancial,NNumber pCUntaxInc,NNumber pCParAddlFinancial,NNumber pCParUntaxInc,NString pRowid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P2.P_UPDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_INFC_CODE", pInfcCode);
//			cmd.addParameter("@P_SEQ_NO", pSeqNo);
//			cmd.addParameter("@P_MODEL_CDE", pModelCde);
//			cmd.addParameter("@P_C_PAR_DATA_PRESENT", pCParDataPresent);
//			cmd.addParameter("@P_C_DATA_PRESENT", pCDataPresent);
//			cmd.addParameter("@P_C_DEPEND_STATUS", pCDependStatus);
//			cmd.addParameter("@P_C_AGE", pCAge);
//			cmd.addParameter("@P_C_MRTL_STATUS", pCMrtlStatus);
//			cmd.addParameter("@P_C_FAM_MEMB", pCFamMemb);
//			cmd.addParameter("@P_C_NO_IN_COLL", pCNoInColl);
//			cmd.addParameter("@P_C_PAR_MRTL_STATUS", pCParMrtlStatus);
//			cmd.addParameter("@P_C_PAR_FAM_MEMB", pCParFamMemb);
//			cmd.addParameter("@P_C_PAR_NO_IN_COLL", pCParNoInColl);
//			cmd.addParameter("@P_C_PAR_PAR_IN_COLL", pCParParInColl);
//			cmd.addParameter("@P_C_PAR_OTH_IN_COLL", pCParOthInColl);
//			cmd.addParameter("@P_C_ASSUME_YR_IN_COLL", pCAssumeYrInColl);
//			cmd.addParameter("@P_C_PAR_1_ANLY_TYPE", pCPar1AnlyType);
//			cmd.addParameter("@P_C_PAR_1_AGI_TAX_INC", pCPar1AgiTaxInc);
//			cmd.addParameter("@P_C_PAR_1_TOT_UNTAX_INC", pCPar1TotUntaxInc);
//			cmd.addParameter("@P_C_PAR_1_TOT_INC", pCPar1TotInc);
//			cmd.addParameter("@P_C_PAR_1_US_INC_TAX", pCPar1UsIncTax);
//			cmd.addParameter("@P_C_PAR_1_ST_OTH_TAX", pCPar1StOthTax);
//			cmd.addParameter("@P_C_PAR_1_FICA_TAX", pCPar1FicaTax);
//			cmd.addParameter("@P_C_PAR_1_MED_DEN_EXP", pCPar1MedDenExp);
//			cmd.addParameter("@P_C_PAR_1_SCH_TUIT", pCPar1SchTuit);
//			cmd.addParameter("@P_C_PAR_1_EMP_ALLOW", pCPar1EmpAllow);
//			cmd.addParameter("@P_C_PAR_1_MNT_ALLOW", pCPar1MntAllow);
//			cmd.addParameter("@P_C_PAR_1_TOT_ALLOW", pCPar1TotAllow);
//			cmd.addParameter("@P_C_PAR_1_AVAIL_DISC_INC", pCPar1AvailDiscInc);
//			cmd.addParameter("@P_C_PAR_1_CASH_AMT", pCPar1CashAmt);
//			cmd.addParameter("@P_C_PAR_1_HME_VAL", pCPar1HmeVal);
//			cmd.addParameter("@P_C_PAR_1_RE_INV_VAL", pCPar1ReInvVal);
//			cmd.addParameter("@P_C_PAR_1_ADJ_BF_NET_WTH", pCPar1AdjBfNetWth);
//			cmd.addParameter("@P_C_PAR_1_NET_WTH", pCPar1NetWth);
//			cmd.addParameter("@P_C_PAR_1_PROT_ALLOW", pCPar1ProtAllow);
//			cmd.addParameter("@P_C_PAR_1_DISC_NET_WTH", pCPar1DiscNetWth);
//			cmd.addParameter("@P_C_PAR_1_CONV_PCT", pCPar1ConvPct);
//			cmd.addParameter("@P_C_PAR_1_INC_SUPPLEMENT", pCPar1IncSupplement);
//			cmd.addParameter("@P_C_PAR_1_ADJ_AVAIL_INC", pCPar1AdjAvailInc);
//			cmd.addParameter("@P_C_PAR_1_TOT_CTRB", pCPar1TotCtrb);
//			cmd.addParameter("@P_C_PAR_1_NO_IN_COLL", pCPar1NoInColl);
//			cmd.addParameter("@P_C_PAR_1_CTRB_FOR_STDT", pCPar1CtrbForStdt);
//			cmd.addParameter("@P_C_PAR_1_CTRB_OFFL_EST", pCPar1CtrbOfflEst);
//			cmd.addParameter("@P_C_PAR_1_CTRB_FR_INC", pCPar1CtrbFrInc);
//			cmd.addParameter("@P_C_PAR_1_CTRB_FR_ASSET", pCPar1CtrbFrAsset);
//			cmd.addParameter("@P_C_PAR_2_ANLY_TYPE", pCPar2AnlyType);
//			cmd.addParameter("@P_C_PAR_2_AGI_TAX_INC", pCPar2AgiTaxInc);
//			cmd.addParameter("@P_C_PAR_2_TOT_UNTAX_INC", pCPar2TotUntaxInc);
//			cmd.addParameter("@P_C_PAR_2_TOT_INC", pCPar2TotInc);
//			cmd.addParameter("@P_C_PAR_2_US_INC_TAX", pCPar2UsIncTax);
//			cmd.addParameter("@P_C_PAR_2_ST_OTH_TAX", pCPar2StOthTax);
//			cmd.addParameter("@P_C_PAR_2_FICA_TAX", pCPar2FicaTax);
//			cmd.addParameter("@P_C_PAR_2_MED_DEN_EXP", pCPar2MedDenExp);
//			cmd.addParameter("@P_C_PAR_2_SCH_TUIT", pCPar2SchTuit);
//			cmd.addParameter("@P_C_PAR_2_EMP_ALLOW", pCPar2EmpAllow);
//			cmd.addParameter("@P_C_PAR_2_MNT_ALLOW", pCPar2MntAllow);
//			cmd.addParameter("@P_C_PAR_2_TOT_ALLOW", pCPar2TotAllow);
//			cmd.addParameter("@P_C_PAR_2_AVAIL_DISC_INC", pCPar2AvailDiscInc);
//			cmd.addParameter("@P_C_PAR_2_CASH_AMT", pCPar2CashAmt);
//			cmd.addParameter("@P_C_PAR_2_HME_VAL", pCPar2HmeVal);
//			cmd.addParameter("@P_C_PAR_2_RE_INV_VAL", pCPar2ReInvVal);
//			cmd.addParameter("@P_C_PAR_2_ADJ_BF_NET_WTH", pCPar2AdjBfNetWth);
//			cmd.addParameter("@P_C_PAR_2_NET_WTH", pCPar2NetWth);
//			cmd.addParameter("@P_C_PAR_2_PROT_ALLOW", pCPar2ProtAllow);
//			cmd.addParameter("@P_C_PAR_2_DISC_NET_WTH", pCPar2DiscNetWth);
//			cmd.addParameter("@P_C_PAR_2_CONV_PCT", pCPar2ConvPct);
//			cmd.addParameter("@P_C_PAR_2_INC_SUPPLEMENT", pCPar2IncSupplement);
//			cmd.addParameter("@P_C_PAR_2_ADJ_AVAIL_INC", pCPar2AdjAvailInc);
//			cmd.addParameter("@P_C_PAR_2_TOT_CTRB", pCPar2TotCtrb);
//			cmd.addParameter("@P_C_PAR_2_NO_IN_COLL", pCPar2NoInColl);
//			cmd.addParameter("@P_C_PAR_2_CTRB_FOR_STDT", pCPar2CtrbForStdt);
//			cmd.addParameter("@P_C_PAR_2_CTRB_OFFL_EST", pCPar2CtrbOfflEst);
//			cmd.addParameter("@P_C_PAR_2_CTRB_FR_INC", pCPar2CtrbFrInc);
//			cmd.addParameter("@P_C_PAR_2_CTRB_FR_ASSET", pCPar2CtrbFrAsset);
//			cmd.addParameter("@P_C_1_ANLY_TYPE", pC1AnlyType);
//			cmd.addParameter("@P_C_1_AGI_TAX_INC", pC1AgiTaxInc);
//			cmd.addParameter("@P_C_1_TOT_UNTAX_INC", pC1TotUntaxInc);
//			cmd.addParameter("@P_C_1_TOT_INC", pC1TotInc);
//			cmd.addParameter("@P_C_1_US_INC_TAX", pC1UsIncTax);
//			cmd.addParameter("@P_C_1_ST_OTH_TAX", pC1StOthTax);
//			cmd.addParameter("@P_C_1_FICA_TAX", pC1FicaTax);
//			cmd.addParameter("@P_C_1_MED_DEN_EXP", pC1MedDenExp);
//			cmd.addParameter("@P_C_1_SCH_TUIT", pC1SchTuit);
//			cmd.addParameter("@P_C_1_EMP_ALLOW", pC1EmpAllow);
//			cmd.addParameter("@P_C_1_MNT_ALLOW", pC1MntAllow);
//			cmd.addParameter("@P_C_1_AVAIL_TAX_INC", pC1AvailTaxInc);
//			cmd.addParameter("@P_C_1_AVAIL_DISC_INC", pC1AvailDiscInc);
//			cmd.addParameter("@P_C_1_CASH_AMT", pC1CashAmt);
//			cmd.addParameter("@P_C_1_HME_VAL", pC1HmeVal);
//			cmd.addParameter("@P_C_1_RE_INV_VAL", pC1ReInvVal);
//			cmd.addParameter("@P_C_1_ADJ_BF_NET_WTH", pC1AdjBfNetWth);
//			cmd.addParameter("@P_C_1_NET_WTH", pC1NetWth);
//			cmd.addParameter("@P_C_1_PROT_ALLOW", pC1ProtAllow);
//			cmd.addParameter("@P_C_1_DISC_NET_WTH", pC1DiscNetWth);
//			cmd.addParameter("@P_C_1_CONV_PCT", pC1ConvPct);
//			cmd.addParameter("@P_C_1_INC_SUPPLEMENT", pC1IncSupplement);
//			cmd.addParameter("@P_C_1_ADJ_AVAIL_INC", pC1AdjAvailInc);
//			cmd.addParameter("@P_C_1_TOT_CTRB", pC1TotCtrb);
//			cmd.addParameter("@P_C_1_NO_IN_COLL", pC1NoInColl);
//			cmd.addParameter("@P_C_1_CTRB_FOR_STDT", pC1CtrbForStdt);
//			cmd.addParameter("@P_C_1_CTRB_OFFL_EST", pC1CtrbOfflEst);
//			cmd.addParameter("@P_C_1_CTRB_FR_INC", pC1CtrbFrInc);
//			cmd.addParameter("@P_C_1_CTRB_FR_ASSET", pC1CtrbFrAsset);
//			cmd.addParameter("@P_C_1_VA_BEN_INCL", pC1VaBenIncl);
//			cmd.addParameter("@P_C_1_TAX_INC_CTRB", pC1TaxIncCtrb);
//			cmd.addParameter("@P_C_1_TOT_ALLOW", pC1TotAllow);
//			cmd.addParameter("@P_C_1_CALC_AVAIL_INC", pC1CalcAvailInc);
//			cmd.addParameter("@P_C_2_ANLY_TYPE", pC2AnlyType);
//			cmd.addParameter("@P_C_2_AGI_TAX_INC", pC2AgiTaxInc);
//			cmd.addParameter("@P_C_2_TOT_UNTAX_INC", pC2TotUntaxInc);
//			cmd.addParameter("@P_C_2_TOT_INC", pC2TotInc);
//			cmd.addParameter("@P_C_2_US_INC_TAX", pC2UsIncTax);
//			cmd.addParameter("@P_C_2_ST_OTH_TAX", pC2StOthTax);
//			cmd.addParameter("@P_C_2_FICA_TAX", pC2FicaTax);
//			cmd.addParameter("@P_C_2_MED_DEN_EXP", pC2MedDenExp);
//			cmd.addParameter("@P_C_2_SCH_TUIT", pC2SchTuit);
//			cmd.addParameter("@P_C_2_EMP_ALLOW", pC2EmpAllow);
//			cmd.addParameter("@P_C_2_MNT_ALLOW", pC2MntAllow);
//			cmd.addParameter("@P_C_2_AVAIL_TAX_INC", pC2AvailTaxInc);
//			cmd.addParameter("@P_C_2_AVAIL_DISC_INC", pC2AvailDiscInc);
//			cmd.addParameter("@P_C_2_CASH_AMT", pC2CashAmt);
//			cmd.addParameter("@P_C_2_HME_VAL", pC2HmeVal);
//			cmd.addParameter("@P_C_2_RE_INV_VAL", pC2ReInvVal);
//			cmd.addParameter("@P_C_2_ADJ_BF_NET_WTH", pC2AdjBfNetWth);
//			cmd.addParameter("@P_C_2_NET_WTH", pC2NetWth);
//			cmd.addParameter("@P_C_2_PROT_ALLOW", pC2ProtAllow);
//			cmd.addParameter("@P_C_2_DISC_NET_WTH", pC2DiscNetWth);
//			cmd.addParameter("@P_C_2_CONV_PCT", pC2ConvPct);
//			cmd.addParameter("@P_C_2_INC_SUPPLEMENT", pC2IncSupplement);
//			cmd.addParameter("@P_C_2_ADJ_AVAIL_INC", pC2AdjAvailInc);
//			cmd.addParameter("@P_C_2_TOT_CTRB", pC2TotCtrb);
//			cmd.addParameter("@P_C_2_NO_IN_COLL", pC2NoInColl);
//			cmd.addParameter("@P_C_2_CTRB_FOR_STDT", pC2CtrbForStdt);
//			cmd.addParameter("@P_C_2_CTRB_OFFL_EST", pC2CtrbOfflEst);
//			cmd.addParameter("@P_C_2_CTRB_FR_INC", pC2CtrbFrInc);
//			cmd.addParameter("@P_C_2_CTRB_FR_ASSET", pC2CtrbFrAsset);
//			cmd.addParameter("@P_C_2_VA_BEN_INCL", pC2VaBenIncl);
//			cmd.addParameter("@P_C_2_TAX_INC_CTRB", pC2TaxIncCtrb);
//			cmd.addParameter("@P_C_2_TOT_ALLOW", pC2TotAllow);
//			cmd.addParameter("@P_C_2_CALC_AVAIL_INC", pC2CalcAvailInc);
//			cmd.addParameter("@P_C_1_TOT_FAM_CTRB", pC1TotFamCtrb);
//			cmd.addParameter("@P_C_1_TFC_OFFL_EST", pC1TfcOfflEst);
//			cmd.addParameter("@P_C_2_TOT_FAM_CTRB", pC2TotFamCtrb);
//			cmd.addParameter("@P_C_2_TFC_OFFL_EST", pC2TfcOfflEst);
//			cmd.addParameter("@P_PELL_P_ANLY_TYPE", pPellPAnlyType);
//			cmd.addParameter("@P_PELL_P_AGI_TAX_INC", pPellPAgiTaxInc);
//			cmd.addParameter("@P_PELL_P_TOT_UNTAX_INC", pPellPTotUntaxInc);
//			cmd.addParameter("@P_PELL_P_TOT_INC", pPellPTotInc);
//			cmd.addParameter("@P_PELL_P_US_INC_TAX", pPellPUsIncTax);
//			cmd.addParameter("@P_PELL_P_ST_OTH_TAX", pPellPStOthTax);
//			cmd.addParameter("@P_PELL_P_MED_DEN_EXP", pPellPMedDenExp);
//			cmd.addParameter("@P_PELL_P_SCH_TUIT", pPellPSchTuit);
//			cmd.addParameter("@P_PELL_P_EMP_ALLOW", pPellPEmpAllow);
//			cmd.addParameter("@P_PELL_P_MNT_ALLOW", pPellPMntAllow);
//			cmd.addParameter("@P_PELL_P_TOT_ALLOW", pPellPTotAllow);
//			cmd.addParameter("@P_PELL_P_AVAIL_DISC_INC", pPellPAvailDiscInc);
//			cmd.addParameter("@P_PELL_P_CASH_AMT", pPellPCashAmt);
//			cmd.addParameter("@P_PELL_P_HME_VAL", pPellPHmeVal);
//			cmd.addParameter("@P_PELL_P_RE_INV_VAL", pPellPReInvVal);
//			cmd.addParameter("@P_PELL_P_ADJ_BF_NET_WTH", pPellPAdjBfNetWth);
//			cmd.addParameter("@P_PELL_P_NET_WTH", pPellPNetWth);
//			cmd.addParameter("@P_PELL_P_PROT_ALLOW", pPellPProtAllow);
//			cmd.addParameter("@P_PELL_P_DISC_NET_WTH", pPellPDiscNetWth);
//			cmd.addParameter("@P_PELL_P_CONV_PCT", pPellPConvPct);
//			cmd.addParameter("@P_PELL_P_TOT_CTRB", pPellPTotCtrb);
//			cmd.addParameter("@P_PELL_P_NO_IN_COLL", pPellPNoInColl);
//			cmd.addParameter("@P_PELL_P_CTRB_FOR_STDT", pPellPCtrbForStdt);
//			cmd.addParameter("@P_PELL_P_CTRB_OFFL_EST", pPellPCtrbOfflEst);
//			cmd.addParameter("@P_PELL_P_CTRB_FR_INC", pPellPCtrbFrInc);
//			cmd.addParameter("@P_PELL_P_CTRB_FR_ASSET", pPellPCtrbFrAsset);
//			cmd.addParameter("@P_PELL_P_2_ANLY_TYPE", pPellP2AnlyType);
//			cmd.addParameter("@P_PELL_ANLY_TYPE", pPellAnlyType);
//			cmd.addParameter("@P_PELL_AGI_TAX_INC", pPellAgiTaxInc);
//			cmd.addParameter("@P_PELL_TOT_UNTAX_INC", pPellTotUntaxInc);
//			cmd.addParameter("@P_PELL_TOT_INC", pPellTotInc);
//			cmd.addParameter("@P_PELL_US_INC_TAX", pPellUsIncTax);
//			cmd.addParameter("@P_PELL_ST_OTH_TAX", pPellStOthTax);
//			cmd.addParameter("@P_PELL_MED_DEN_EXP", pPellMedDenExp);
//			cmd.addParameter("@P_PELL_SCH_TUIT", pPellSchTuit);
//			cmd.addParameter("@P_PELL_EMP_ALLOW", pPellEmpAllow);
//			cmd.addParameter("@P_PELL_MNT_ALLOW", pPellMntAllow);
//			cmd.addParameter("@P_PELL_TOT_ALLOW", pPellTotAllow);
//			cmd.addParameter("@P_PELL_AVAIL_DISC_INC", pPellAvailDiscInc);
//			cmd.addParameter("@P_PELL_CASH_AMT", pPellCashAmt);
//			cmd.addParameter("@P_PELL_HME_VAL", pPellHmeVal);
//			cmd.addParameter("@P_PELL_RE_INV_VAL", pPellReInvVal);
//			cmd.addParameter("@P_PELL_ADJ_BF_NET_WTH", pPellAdjBfNetWth);
//			cmd.addParameter("@P_PELL_NET_WTH", pPellNetWth);
//			cmd.addParameter("@P_PELL_PROT_ALLOW", pPellProtAllow);
//			cmd.addParameter("@P_PELL_DISC_NET_WTH", pPellDiscNetWth);
//			cmd.addParameter("@P_PELL_CONV_PCT", pPellConvPct);
//			cmd.addParameter("@P_PELL_TOT_CTRB", pPellTotCtrb);
//			cmd.addParameter("@P_PELL_NO_IN_COLL", pPellNoInColl);
//			cmd.addParameter("@P_PELL_CTRB_FOR_STDT", pPellCtrbForStdt);
//			cmd.addParameter("@P_PELL_CTRB_OFFL_EST", pPellCtrbOfflEst);
//			cmd.addParameter("@P_PELL_CTRB_FR_INC", pPellCtrbFrInc);
//			cmd.addParameter("@P_PELL_CTRB_FR_ASSET", pPellCtrbFrAsset);
//			cmd.addParameter("@P_PELL_PGI", pPellPgi);
//			cmd.addParameter("@P_PELL_PGI_OFFL_EST", pPellPgiOfflEst);
//			cmd.addParameter("@P_PELL_2_ANLY_TYPE", pPell2AnlyType);
//			cmd.addParameter("@P_PELL_2_PGI", pPell2Pgi);
//			cmd.addParameter("@P_PELL_2_PGI_OFFL_EST", pPell2PgiOfflEst);
//			cmd.addParameter("@P_IM_BUDG_LENGTH", pImBudgLength);
//			cmd.addParameter("@P_IM_1_ANLY_TYPE", pIm1AnlyType);
//			cmd.addParameter("@P_IM_1_SC", pIm1Sc);
//			cmd.addParameter("@P_IM_1_PAR_ANLY_TYPE", pIm1ParAnlyType);
//			cmd.addParameter("@P_IM_1_PC", pIm1Pc);
//			cmd.addParameter("@P_IM_1_UNASSESSED_VA", pIm1UnassessedVa);
//			cmd.addParameter("@P_IM_1_TFC", pIm1Tfc);
//			cmd.addParameter("@P_IM_2_ANLY_TYPE", pIm2AnlyType);
//			cmd.addParameter("@P_IM_2_SC", pIm2Sc);
//			cmd.addParameter("@P_IM_2_PAR_ANLY_TYPE", pIm2ParAnlyType);
//			cmd.addParameter("@P_IM_2_PC", pIm2Pc);
//			cmd.addParameter("@P_IM_2_UNASSESSED_VA", pIm2UnassessedVa);
//			cmd.addParameter("@P_INAS_CTR", pInasCtr);
//			cmd.addParameter("@P_RQST_SLS_AMT", pRqstSlsAmt);
//			cmd.addParameter("@P_DEFER_SLS_PMTS", pDeferSlsPmts);
//			cmd.addParameter("@P_SLS_INTS_PMTS", pSlsIntsPmts);
//			cmd.addParameter("@P_BAL_ON_ALL_SLS", pBalOnAllSls);
//			cmd.addParameter("@P_RECENT_SLS_BAL", pRecentSlsBal);
//			cmd.addParameter("@P_RECENT_SLS_FR_MTH_YR", pRecentSlsFrMthYr);
//			cmd.addParameter("@P_RECENT_SLS_CLASS", pRecentSlsClass);
//			cmd.addParameter("@P_LENDER_CODE", pLenderCode);
//			cmd.addParameter("@P_DEGREE_SOUGHT", pDegreeSought);
//			cmd.addParameter("@P_DRUG_ABUSE", pDrugAbuse);
//			cmd.addParameter("@P_ELIGIBILITY_MSG", pEligibilityMsg);
//			cmd.addParameter("@P_EPS_CDE", pEpsCde);
//			cmd.addParameter("@P_HS_GRADUATE", pHsGraduate);
//			cmd.addParameter("@P_ORIG_RCPT_DATE", pOrigRcptDate);
//			cmd.addParameter("@P_DUR_ELIG_OVRD_IND", pDurEligOvrdInd);
//			cmd.addParameter("@P_C_1_UNADJ_BUS_NET", pC1UnadjBusNet);
//			cmd.addParameter("@P_C_1_UNADJ_FARM_NET", pC1UnadjFarmNet);
//			cmd.addParameter("@P_C_PAR_1_UNADJ_BUS_NET", pCPar1UnadjBusNet);
//			cmd.addParameter("@P_C_PAR_1_UNADJ_FARM_NET", pCPar1UnadjFarmNet);
//			cmd.addParameter("@P_C_PAR_2_CALC_AVAIL_INC", pCPar2CalcAvailInc);
//			cmd.addParameter("@P_C_PAR_2_UNADJ_BUS_NET", pCPar2UnadjBusNet);
//			cmd.addParameter("@P_C_PAR_2_UNADJ_FARM_NET", pCPar2UnadjFarmNet);
//			cmd.addParameter("@P_FM_INST_1_FED_EFC", pFmInst1FedEfc);
//			cmd.addParameter("@P_FM_INST_1_FED_ELIG", pFmInst1FedElig);
//			cmd.addParameter("@P_FM_INST_1_VA_BEN", pFmInst1VaBen);
//			cmd.addParameter("@P_FM_INST_2_FED_EFC", pFmInst2FedEfc);
//			cmd.addParameter("@P_FM_INST_2_FED_ELIG", pFmInst2FedElig);
//			cmd.addParameter("@P_FM_INST_2_VA_BEN", pFmInst2VaBen);
//			cmd.addParameter("@P_FM_INST_3_FED_EFC", pFmInst3FedEfc);
//			cmd.addParameter("@P_FM_INST_3_FED_ELIG", pFmInst3FedElig);
//			cmd.addParameter("@P_FM_INST_3_VA_BEN", pFmInst3VaBen);
//			cmd.addParameter("@P_CM2_IM_CALC_IND", pCm2ImCalcInd);
//			cmd.addParameter("@P_C_PAR_AGE", pCParAge);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_C_ADDL_FINANCIAL", pCAddlFinancial);
//			cmd.addParameter("@P_C_UNTAX_INC", pCUntaxInc);
//			cmd.addParameter("@P_C_PAR_ADDL_FINANCIAL", pCParAddlFinancial);
//			cmd.addParameter("@P_C_PAR_UNTAX_INC", pCParUntaxInc);
//			cmd.addParameter("@P_ROWID", pRowid);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	@DbRecordType(id="TempAppP2RecRow", dataSourceName="TEMP_APP_P2_REC")
	public static class TempAppP2RecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_INFC_CODE")
		public NString RInfcCode;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_MODEL_CDE")
		public NString RModelCde;
		@DbRecordField(dataSourceName="R_C_PAR_DATA_PRESENT")
		public NString RCParDataPresent;
		@DbRecordField(dataSourceName="R_C_DATA_PRESENT")
		public NString RCDataPresent;
		@DbRecordField(dataSourceName="R_C_DEPEND_STATUS")
		public NString RCDependStatus;
		@DbRecordField(dataSourceName="R_C_AGE")
		public NNumber RCAge;
		@DbRecordField(dataSourceName="R_C_MRTL_STATUS")
		public NString RCMrtlStatus;
		@DbRecordField(dataSourceName="R_C_FAM_MEMB")
		public NNumber RCFamMemb;
		@DbRecordField(dataSourceName="R_C_NO_IN_COLL")
		public NNumber RCNoInColl;
		@DbRecordField(dataSourceName="R_C_PAR_MRTL_STATUS")
		public NString RCParMrtlStatus;
		@DbRecordField(dataSourceName="R_C_PAR_FAM_MEMB")
		public NNumber RCParFamMemb;
		@DbRecordField(dataSourceName="R_C_PAR_NO_IN_COLL")
		public NNumber RCParNoInColl;
		@DbRecordField(dataSourceName="R_C_PAR_PAR_IN_COLL")
		public NNumber RCParParInColl;
		@DbRecordField(dataSourceName="R_C_PAR_OTH_IN_COLL")
		public NNumber RCParOthInColl;
		@DbRecordField(dataSourceName="R_C_ASSUME_YR_IN_COLL")
		public NString RCAssumeYrInColl;
		@DbRecordField(dataSourceName="R_C_PAR_1_ANLY_TYPE")
		public NString RCPar1AnlyType;
		@DbRecordField(dataSourceName="R_C_PAR_1_AGI_TAX_INC")
		public NNumber RCPar1AgiTaxInc;
		@DbRecordField(dataSourceName="R_C_PAR_1_TOT_UNTAX_INC")
		public NNumber RCPar1TotUntaxInc;
		@DbRecordField(dataSourceName="R_C_PAR_1_TOT_INC")
		public NNumber RCPar1TotInc;
		@DbRecordField(dataSourceName="R_C_PAR_1_US_INC_TAX")
		public NNumber RCPar1UsIncTax;
		@DbRecordField(dataSourceName="R_C_PAR_1_ST_OTH_TAX")
		public NNumber RCPar1StOthTax;
		@DbRecordField(dataSourceName="R_C_PAR_1_FICA_TAX")
		public NNumber RCPar1FicaTax;
		@DbRecordField(dataSourceName="R_C_PAR_1_MED_DEN_EXP")
		public NNumber RCPar1MedDenExp;
		@DbRecordField(dataSourceName="R_C_PAR_1_SCH_TUIT")
		public NNumber RCPar1SchTuit;
		@DbRecordField(dataSourceName="R_C_PAR_1_EMP_ALLOW")
		public NNumber RCPar1EmpAllow;
		@DbRecordField(dataSourceName="R_C_PAR_1_MNT_ALLOW")
		public NNumber RCPar1MntAllow;
		@DbRecordField(dataSourceName="R_C_PAR_1_TOT_ALLOW")
		public NNumber RCPar1TotAllow;
		@DbRecordField(dataSourceName="R_C_PAR_1_AVAIL_DISC_INC")
		public NNumber RCPar1AvailDiscInc;
		@DbRecordField(dataSourceName="R_C_PAR_1_CASH_AMT")
		public NNumber RCPar1CashAmt;
		@DbRecordField(dataSourceName="R_C_PAR_1_HME_VAL")
		public NNumber RCPar1HmeVal;
		@DbRecordField(dataSourceName="R_C_PAR_1_RE_INV_VAL")
		public NNumber RCPar1ReInvVal;
		@DbRecordField(dataSourceName="R_C_PAR_1_ADJ_BF_NET_WTH")
		public NNumber RCPar1AdjBfNetWth;
		@DbRecordField(dataSourceName="R_C_PAR_1_NET_WTH")
		public NNumber RCPar1NetWth;
		@DbRecordField(dataSourceName="R_C_PAR_1_PROT_ALLOW")
		public NNumber RCPar1ProtAllow;
		@DbRecordField(dataSourceName="R_C_PAR_1_DISC_NET_WTH")
		public NNumber RCPar1DiscNetWth;
		@DbRecordField(dataSourceName="R_C_PAR_1_CONV_PCT")
		public NNumber RCPar1ConvPct;
		@DbRecordField(dataSourceName="R_C_PAR_1_INC_SUPPLEMENT")
		public NNumber RCPar1IncSupplement;
		@DbRecordField(dataSourceName="R_C_PAR_1_ADJ_AVAIL_INC")
		public NNumber RCPar1AdjAvailInc;
		@DbRecordField(dataSourceName="R_C_PAR_1_TOT_CTRB")
		public NNumber RCPar1TotCtrb;
		@DbRecordField(dataSourceName="R_C_PAR_1_NO_IN_COLL")
		public NNumber RCPar1NoInColl;
		@DbRecordField(dataSourceName="R_C_PAR_1_CTRB_FOR_STDT")
		public NNumber RCPar1CtrbForStdt;
		@DbRecordField(dataSourceName="R_C_PAR_1_CTRB_OFFL_EST")
		public NString RCPar1CtrbOfflEst;
		@DbRecordField(dataSourceName="R_C_PAR_1_CTRB_FR_INC")
		public NNumber RCPar1CtrbFrInc;
		@DbRecordField(dataSourceName="R_C_PAR_1_CTRB_FR_ASSET")
		public NNumber RCPar1CtrbFrAsset;
		@DbRecordField(dataSourceName="R_C_PAR_2_ANLY_TYPE")
		public NString RCPar2AnlyType;
		@DbRecordField(dataSourceName="R_C_PAR_2_AGI_TAX_INC")
		public NNumber RCPar2AgiTaxInc;
		@DbRecordField(dataSourceName="R_C_PAR_2_TOT_UNTAX_INC")
		public NNumber RCPar2TotUntaxInc;
		@DbRecordField(dataSourceName="R_C_PAR_2_TOT_INC")
		public NNumber RCPar2TotInc;
		@DbRecordField(dataSourceName="R_C_PAR_2_US_INC_TAX")
		public NNumber RCPar2UsIncTax;
		@DbRecordField(dataSourceName="R_C_PAR_2_ST_OTH_TAX")
		public NNumber RCPar2StOthTax;
		@DbRecordField(dataSourceName="R_C_PAR_2_FICA_TAX")
		public NNumber RCPar2FicaTax;
		@DbRecordField(dataSourceName="R_C_PAR_2_MED_DEN_EXP")
		public NNumber RCPar2MedDenExp;
		@DbRecordField(dataSourceName="R_C_PAR_2_SCH_TUIT")
		public NNumber RCPar2SchTuit;
		@DbRecordField(dataSourceName="R_C_PAR_2_EMP_ALLOW")
		public NNumber RCPar2EmpAllow;
		@DbRecordField(dataSourceName="R_C_PAR_2_MNT_ALLOW")
		public NNumber RCPar2MntAllow;
		@DbRecordField(dataSourceName="R_C_PAR_2_TOT_ALLOW")
		public NNumber RCPar2TotAllow;
		@DbRecordField(dataSourceName="R_C_PAR_2_AVAIL_DISC_INC")
		public NNumber RCPar2AvailDiscInc;
		@DbRecordField(dataSourceName="R_C_PAR_2_CASH_AMT")
		public NNumber RCPar2CashAmt;
		@DbRecordField(dataSourceName="R_C_PAR_2_HME_VAL")
		public NNumber RCPar2HmeVal;
		@DbRecordField(dataSourceName="R_C_PAR_2_RE_INV_VAL")
		public NNumber RCPar2ReInvVal;
		@DbRecordField(dataSourceName="R_C_PAR_2_ADJ_BF_NET_WTH")
		public NNumber RCPar2AdjBfNetWth;
		@DbRecordField(dataSourceName="R_C_PAR_2_NET_WTH")
		public NNumber RCPar2NetWth;
		@DbRecordField(dataSourceName="R_C_PAR_2_PROT_ALLOW")
		public NNumber RCPar2ProtAllow;
		@DbRecordField(dataSourceName="R_C_PAR_2_DISC_NET_WTH")
		public NNumber RCPar2DiscNetWth;
		@DbRecordField(dataSourceName="R_C_PAR_2_CONV_PCT")
		public NNumber RCPar2ConvPct;
		@DbRecordField(dataSourceName="R_C_PAR_2_INC_SUPPLEMENT")
		public NNumber RCPar2IncSupplement;
		@DbRecordField(dataSourceName="R_C_PAR_2_ADJ_AVAIL_INC")
		public NNumber RCPar2AdjAvailInc;
		@DbRecordField(dataSourceName="R_C_PAR_2_TOT_CTRB")
		public NNumber RCPar2TotCtrb;
		@DbRecordField(dataSourceName="R_C_PAR_2_NO_IN_COLL")
		public NNumber RCPar2NoInColl;
		@DbRecordField(dataSourceName="R_C_PAR_2_CTRB_FOR_STDT")
		public NNumber RCPar2CtrbForStdt;
		@DbRecordField(dataSourceName="R_C_PAR_2_CTRB_OFFL_EST")
		public NString RCPar2CtrbOfflEst;
		@DbRecordField(dataSourceName="R_C_PAR_2_CTRB_FR_INC")
		public NNumber RCPar2CtrbFrInc;
		@DbRecordField(dataSourceName="R_C_PAR_2_CTRB_FR_ASSET")
		public NNumber RCPar2CtrbFrAsset;
		@DbRecordField(dataSourceName="R_C_1_ANLY_TYPE")
		public NString RC1AnlyType;
		@DbRecordField(dataSourceName="R_C_1_AGI_TAX_INC")
		public NNumber RC1AgiTaxInc;
		@DbRecordField(dataSourceName="R_C_1_TOT_UNTAX_INC")
		public NNumber RC1TotUntaxInc;
		@DbRecordField(dataSourceName="R_C_1_TOT_INC")
		public NNumber RC1TotInc;
		@DbRecordField(dataSourceName="R_C_1_US_INC_TAX")
		public NNumber RC1UsIncTax;
		@DbRecordField(dataSourceName="R_C_1_ST_OTH_TAX")
		public NNumber RC1StOthTax;
		@DbRecordField(dataSourceName="R_C_1_FICA_TAX")
		public NNumber RC1FicaTax;
		@DbRecordField(dataSourceName="R_C_1_MED_DEN_EXP")
		public NNumber RC1MedDenExp;
		@DbRecordField(dataSourceName="R_C_1_SCH_TUIT")
		public NNumber RC1SchTuit;
		@DbRecordField(dataSourceName="R_C_1_EMP_ALLOW")
		public NNumber RC1EmpAllow;
		@DbRecordField(dataSourceName="R_C_1_MNT_ALLOW")
		public NNumber RC1MntAllow;
		@DbRecordField(dataSourceName="R_C_1_AVAIL_TAX_INC")
		public NNumber RC1AvailTaxInc;
		@DbRecordField(dataSourceName="R_C_1_AVAIL_DISC_INC")
		public NNumber RC1AvailDiscInc;
		@DbRecordField(dataSourceName="R_C_1_CASH_AMT")
		public NNumber RC1CashAmt;
		@DbRecordField(dataSourceName="R_C_1_HME_VAL")
		public NNumber RC1HmeVal;
		@DbRecordField(dataSourceName="R_C_1_RE_INV_VAL")
		public NNumber RC1ReInvVal;
		@DbRecordField(dataSourceName="R_C_1_ADJ_BF_NET_WTH")
		public NNumber RC1AdjBfNetWth;
		@DbRecordField(dataSourceName="R_C_1_NET_WTH")
		public NNumber RC1NetWth;
		@DbRecordField(dataSourceName="R_C_1_PROT_ALLOW")
		public NNumber RC1ProtAllow;
		@DbRecordField(dataSourceName="R_C_1_DISC_NET_WTH")
		public NNumber RC1DiscNetWth;
		@DbRecordField(dataSourceName="R_C_1_CONV_PCT")
		public NNumber RC1ConvPct;
		@DbRecordField(dataSourceName="R_C_1_INC_SUPPLEMENT")
		public NNumber RC1IncSupplement;
		@DbRecordField(dataSourceName="R_C_1_ADJ_AVAIL_INC")
		public NNumber RC1AdjAvailInc;
		@DbRecordField(dataSourceName="R_C_1_TOT_CTRB")
		public NNumber RC1TotCtrb;
		@DbRecordField(dataSourceName="R_C_1_NO_IN_COLL")
		public NNumber RC1NoInColl;
		@DbRecordField(dataSourceName="R_C_1_CTRB_FOR_STDT")
		public NNumber RC1CtrbForStdt;
		@DbRecordField(dataSourceName="R_C_1_CTRB_OFFL_EST")
		public NString RC1CtrbOfflEst;
		@DbRecordField(dataSourceName="R_C_1_CTRB_FR_INC")
		public NNumber RC1CtrbFrInc;
		@DbRecordField(dataSourceName="R_C_1_CTRB_FR_ASSET")
		public NNumber RC1CtrbFrAsset;
		@DbRecordField(dataSourceName="R_C_1_VA_BEN_INCL")
		public NString RC1VaBenIncl;
		@DbRecordField(dataSourceName="R_C_1_TAX_INC_CTRB")
		public NNumber RC1TaxIncCtrb;
		@DbRecordField(dataSourceName="R_C_1_TOT_ALLOW")
		public NNumber RC1TotAllow;
		@DbRecordField(dataSourceName="R_C_1_CALC_AVAIL_INC")
		public NNumber RC1CalcAvailInc;
		@DbRecordField(dataSourceName="R_C_2_ANLY_TYPE")
		public NString RC2AnlyType;
		@DbRecordField(dataSourceName="R_C_2_AGI_TAX_INC")
		public NNumber RC2AgiTaxInc;
		@DbRecordField(dataSourceName="R_C_2_TOT_UNTAX_INC")
		public NNumber RC2TotUntaxInc;
		@DbRecordField(dataSourceName="R_C_2_TOT_INC")
		public NNumber RC2TotInc;
		@DbRecordField(dataSourceName="R_C_2_US_INC_TAX")
		public NNumber RC2UsIncTax;
		@DbRecordField(dataSourceName="R_C_2_ST_OTH_TAX")
		public NNumber RC2StOthTax;
		@DbRecordField(dataSourceName="R_C_2_FICA_TAX")
		public NNumber RC2FicaTax;
		@DbRecordField(dataSourceName="R_C_2_MED_DEN_EXP")
		public NNumber RC2MedDenExp;
		@DbRecordField(dataSourceName="R_C_2_SCH_TUIT")
		public NNumber RC2SchTuit;
		@DbRecordField(dataSourceName="R_C_2_EMP_ALLOW")
		public NNumber RC2EmpAllow;
		@DbRecordField(dataSourceName="R_C_2_MNT_ALLOW")
		public NNumber RC2MntAllow;
		@DbRecordField(dataSourceName="R_C_2_AVAIL_TAX_INC")
		public NNumber RC2AvailTaxInc;
		@DbRecordField(dataSourceName="R_C_2_AVAIL_DISC_INC")
		public NNumber RC2AvailDiscInc;
		@DbRecordField(dataSourceName="R_C_2_CASH_AMT")
		public NNumber RC2CashAmt;
		@DbRecordField(dataSourceName="R_C_2_HME_VAL")
		public NNumber RC2HmeVal;
		@DbRecordField(dataSourceName="R_C_2_RE_INV_VAL")
		public NNumber RC2ReInvVal;
		@DbRecordField(dataSourceName="R_C_2_ADJ_BF_NET_WTH")
		public NNumber RC2AdjBfNetWth;
		@DbRecordField(dataSourceName="R_C_2_NET_WTH")
		public NNumber RC2NetWth;
		@DbRecordField(dataSourceName="R_C_2_PROT_ALLOW")
		public NNumber RC2ProtAllow;
		@DbRecordField(dataSourceName="R_C_2_DISC_NET_WTH")
		public NNumber RC2DiscNetWth;
		@DbRecordField(dataSourceName="R_C_2_CONV_PCT")
		public NNumber RC2ConvPct;
		@DbRecordField(dataSourceName="R_C_2_INC_SUPPLEMENT")
		public NNumber RC2IncSupplement;
		@DbRecordField(dataSourceName="R_C_2_ADJ_AVAIL_INC")
		public NNumber RC2AdjAvailInc;
		@DbRecordField(dataSourceName="R_C_2_TOT_CTRB")
		public NNumber RC2TotCtrb;
		@DbRecordField(dataSourceName="R_C_2_NO_IN_COLL")
		public NNumber RC2NoInColl;
		@DbRecordField(dataSourceName="R_C_2_CTRB_FOR_STDT")
		public NNumber RC2CtrbForStdt;
		@DbRecordField(dataSourceName="R_C_2_CTRB_OFFL_EST")
		public NString RC2CtrbOfflEst;
		@DbRecordField(dataSourceName="R_C_2_CTRB_FR_INC")
		public NNumber RC2CtrbFrInc;
		@DbRecordField(dataSourceName="R_C_2_CTRB_FR_ASSET")
		public NNumber RC2CtrbFrAsset;
		@DbRecordField(dataSourceName="R_C_2_VA_BEN_INCL")
		public NString RC2VaBenIncl;
		@DbRecordField(dataSourceName="R_C_2_TAX_INC_CTRB")
		public NNumber RC2TaxIncCtrb;
		@DbRecordField(dataSourceName="R_C_2_TOT_ALLOW")
		public NNumber RC2TotAllow;
		@DbRecordField(dataSourceName="R_C_2_CALC_AVAIL_INC")
		public NNumber RC2CalcAvailInc;
		@DbRecordField(dataSourceName="R_C_1_TOT_FAM_CTRB")
		public NNumber RC1TotFamCtrb;
		@DbRecordField(dataSourceName="R_C_1_TFC_OFFL_EST")
		public NString RC1TfcOfflEst;
		@DbRecordField(dataSourceName="R_C_2_TOT_FAM_CTRB")
		public NNumber RC2TotFamCtrb;
		@DbRecordField(dataSourceName="R_C_2_TFC_OFFL_EST")
		public NString RC2TfcOfflEst;
		@DbRecordField(dataSourceName="R_PELL_P_ANLY_TYPE")
		public NString RPellPAnlyType;
		@DbRecordField(dataSourceName="R_PELL_P_AGI_TAX_INC")
		public NNumber RPellPAgiTaxInc;
		@DbRecordField(dataSourceName="R_PELL_P_TOT_UNTAX_INC")
		public NNumber RPellPTotUntaxInc;
		@DbRecordField(dataSourceName="R_PELL_P_TOT_INC")
		public NNumber RPellPTotInc;
		@DbRecordField(dataSourceName="R_PELL_P_US_INC_TAX")
		public NNumber RPellPUsIncTax;
		@DbRecordField(dataSourceName="R_PELL_P_ST_OTH_TAX")
		public NNumber RPellPStOthTax;
		@DbRecordField(dataSourceName="R_PELL_P_MED_DEN_EXP")
		public NNumber RPellPMedDenExp;
		@DbRecordField(dataSourceName="R_PELL_P_SCH_TUIT")
		public NNumber RPellPSchTuit;
		@DbRecordField(dataSourceName="R_PELL_P_EMP_ALLOW")
		public NNumber RPellPEmpAllow;
		@DbRecordField(dataSourceName="R_PELL_P_MNT_ALLOW")
		public NNumber RPellPMntAllow;
		@DbRecordField(dataSourceName="R_PELL_P_TOT_ALLOW")
		public NNumber RPellPTotAllow;
		@DbRecordField(dataSourceName="R_PELL_P_AVAIL_DISC_INC")
		public NNumber RPellPAvailDiscInc;
		@DbRecordField(dataSourceName="R_PELL_P_CASH_AMT")
		public NNumber RPellPCashAmt;
		@DbRecordField(dataSourceName="R_PELL_P_HME_VAL")
		public NNumber RPellPHmeVal;
		@DbRecordField(dataSourceName="R_PELL_P_RE_INV_VAL")
		public NNumber RPellPReInvVal;
		@DbRecordField(dataSourceName="R_PELL_P_ADJ_BF_NET_WTH")
		public NNumber RPellPAdjBfNetWth;
		@DbRecordField(dataSourceName="R_PELL_P_NET_WTH")
		public NNumber RPellPNetWth;
		@DbRecordField(dataSourceName="R_PELL_P_PROT_ALLOW")
		public NNumber RPellPProtAllow;
		@DbRecordField(dataSourceName="R_PELL_P_DISC_NET_WTH")
		public NNumber RPellPDiscNetWth;
		@DbRecordField(dataSourceName="R_PELL_P_CONV_PCT")
		public NNumber RPellPConvPct;
		@DbRecordField(dataSourceName="R_PELL_P_TOT_CTRB")
		public NNumber RPellPTotCtrb;
		@DbRecordField(dataSourceName="R_PELL_P_NO_IN_COLL")
		public NNumber RPellPNoInColl;
		@DbRecordField(dataSourceName="R_PELL_P_CTRB_FOR_STDT")
		public NNumber RPellPCtrbForStdt;
		@DbRecordField(dataSourceName="R_PELL_P_CTRB_OFFL_EST")
		public NString RPellPCtrbOfflEst;
		@DbRecordField(dataSourceName="R_PELL_P_CTRB_FR_INC")
		public NNumber RPellPCtrbFrInc;
		@DbRecordField(dataSourceName="R_PELL_P_CTRB_FR_ASSET")
		public NNumber RPellPCtrbFrAsset;
		@DbRecordField(dataSourceName="R_PELL_P_2_ANLY_TYPE")
		public NString RPellP2AnlyType;
		@DbRecordField(dataSourceName="R_PELL_ANLY_TYPE")
		public NString RPellAnlyType;
		@DbRecordField(dataSourceName="R_PELL_AGI_TAX_INC")
		public NNumber RPellAgiTaxInc;
		@DbRecordField(dataSourceName="R_PELL_TOT_UNTAX_INC")
		public NNumber RPellTotUntaxInc;
		@DbRecordField(dataSourceName="R_PELL_TOT_INC")
		public NNumber RPellTotInc;
		@DbRecordField(dataSourceName="R_PELL_US_INC_TAX")
		public NNumber RPellUsIncTax;
		@DbRecordField(dataSourceName="R_PELL_ST_OTH_TAX")
		public NNumber RPellStOthTax;
		@DbRecordField(dataSourceName="R_PELL_MED_DEN_EXP")
		public NNumber RPellMedDenExp;
		@DbRecordField(dataSourceName="R_PELL_SCH_TUIT")
		public NNumber RPellSchTuit;
		@DbRecordField(dataSourceName="R_PELL_EMP_ALLOW")
		public NNumber RPellEmpAllow;
		@DbRecordField(dataSourceName="R_PELL_MNT_ALLOW")
		public NNumber RPellMntAllow;
		@DbRecordField(dataSourceName="R_PELL_TOT_ALLOW")
		public NNumber RPellTotAllow;
		@DbRecordField(dataSourceName="R_PELL_AVAIL_DISC_INC")
		public NNumber RPellAvailDiscInc;
		@DbRecordField(dataSourceName="R_PELL_CASH_AMT")
		public NNumber RPellCashAmt;
		@DbRecordField(dataSourceName="R_PELL_HME_VAL")
		public NNumber RPellHmeVal;
		@DbRecordField(dataSourceName="R_PELL_RE_INV_VAL")
		public NNumber RPellReInvVal;
		@DbRecordField(dataSourceName="R_PELL_ADJ_BF_NET_WTH")
		public NNumber RPellAdjBfNetWth;
		@DbRecordField(dataSourceName="R_PELL_NET_WTH")
		public NNumber RPellNetWth;
		@DbRecordField(dataSourceName="R_PELL_PROT_ALLOW")
		public NNumber RPellProtAllow;
		@DbRecordField(dataSourceName="R_PELL_DISC_NET_WTH")
		public NNumber RPellDiscNetWth;
		@DbRecordField(dataSourceName="R_PELL_CONV_PCT")
		public NNumber RPellConvPct;
		@DbRecordField(dataSourceName="R_PELL_TOT_CTRB")
		public NNumber RPellTotCtrb;
		@DbRecordField(dataSourceName="R_PELL_NO_IN_COLL")
		public NNumber RPellNoInColl;
		@DbRecordField(dataSourceName="R_PELL_CTRB_FOR_STDT")
		public NNumber RPellCtrbForStdt;
		@DbRecordField(dataSourceName="R_PELL_CTRB_OFFL_EST")
		public NString RPellCtrbOfflEst;
		@DbRecordField(dataSourceName="R_PELL_CTRB_FR_INC")
		public NNumber RPellCtrbFrInc;
		@DbRecordField(dataSourceName="R_PELL_CTRB_FR_ASSET")
		public NNumber RPellCtrbFrAsset;
		@DbRecordField(dataSourceName="R_PELL_PGI")
		public NNumber RPellPgi;
		@DbRecordField(dataSourceName="R_PELL_PGI_OFFL_EST")
		public NString RPellPgiOfflEst;
		@DbRecordField(dataSourceName="R_PELL_2_ANLY_TYPE")
		public NString RPell2AnlyType;
		@DbRecordField(dataSourceName="R_PELL_2_PGI")
		public NNumber RPell2Pgi;
		@DbRecordField(dataSourceName="R_PELL_2_PGI_OFFL_EST")
		public NString RPell2PgiOfflEst;
		@DbRecordField(dataSourceName="R_IM_BUDG_LENGTH")
		public NNumber RImBudgLength;
		@DbRecordField(dataSourceName="R_IM_1_ANLY_TYPE")
		public NString RIm1AnlyType;
		@DbRecordField(dataSourceName="R_IM_1_SC")
		public NNumber RIm1Sc;
		@DbRecordField(dataSourceName="R_IM_1_PAR_ANLY_TYPE")
		public NString RIm1ParAnlyType;
		@DbRecordField(dataSourceName="R_IM_1_PC")
		public NNumber RIm1Pc;
		@DbRecordField(dataSourceName="R_IM_1_UNASSESSED_VA")
		public NNumber RIm1UnassessedVa;
		@DbRecordField(dataSourceName="R_IM_1_TFC")
		public NNumber RIm1Tfc;
		@DbRecordField(dataSourceName="R_IM_2_ANLY_TYPE")
		public NString RIm2AnlyType;
		@DbRecordField(dataSourceName="R_IM_2_SC")
		public NNumber RIm2Sc;
		@DbRecordField(dataSourceName="R_IM_2_PAR_ANLY_TYPE")
		public NString RIm2ParAnlyType;
		@DbRecordField(dataSourceName="R_IM_2_PC")
		public NNumber RIm2Pc;
		@DbRecordField(dataSourceName="R_IM_2_UNASSESSED_VA")
		public NNumber RIm2UnassessedVa;
		@DbRecordField(dataSourceName="R_INAS_CTR")
		public NNumber RInasCtr;
		@DbRecordField(dataSourceName="R_RQST_SLS_AMT")
		public NNumber RRqstSlsAmt;
		@DbRecordField(dataSourceName="R_DEFER_SLS_PMTS")
		public NString RDeferSlsPmts;
		@DbRecordField(dataSourceName="R_SLS_INTS_PMTS")
		public NString RSlsIntsPmts;
		@DbRecordField(dataSourceName="R_BAL_ON_ALL_SLS")
		public NNumber RBalOnAllSls;
		@DbRecordField(dataSourceName="R_RECENT_SLS_BAL")
		public NNumber RRecentSlsBal;
		@DbRecordField(dataSourceName="R_RECENT_SLS_FR_MTH_YR")
		public NString RRecentSlsFrMthYr;
		@DbRecordField(dataSourceName="R_RECENT_SLS_CLASS")
		public NString RRecentSlsClass;
		@DbRecordField(dataSourceName="R_LENDER_CODE")
		public NString RLenderCode;
		@DbRecordField(dataSourceName="R_DEGREE_SOUGHT")
		public NString RDegreeSought;
		@DbRecordField(dataSourceName="R_DRUG_ABUSE")
		public NString RDrugAbuse;
		@DbRecordField(dataSourceName="R_ELIGIBILITY_MSG")
		public NString REligibilityMsg;
		@DbRecordField(dataSourceName="R_EPS_CDE")
		public NString REpsCde;
		@DbRecordField(dataSourceName="R_HS_GRADUATE")
		public NString RHsGraduate;
		@DbRecordField(dataSourceName="R_ORIG_RCPT_DATE")
		public NDate ROrigRcptDate;
		@DbRecordField(dataSourceName="R_DUR_ELIG_OVRD_IND")
		public NString RDurEligOvrdInd;
		@DbRecordField(dataSourceName="R_C_1_UNADJ_BUS_NET")
		public NNumber RC1UnadjBusNet;
		@DbRecordField(dataSourceName="R_C_1_UNADJ_FARM_NET")
		public NNumber RC1UnadjFarmNet;
		@DbRecordField(dataSourceName="R_C_PAR_1_UNADJ_BUS_NET")
		public NNumber RCPar1UnadjBusNet;
		@DbRecordField(dataSourceName="R_C_PAR_1_UNADJ_FARM_NET")
		public NNumber RCPar1UnadjFarmNet;
		@DbRecordField(dataSourceName="R_C_PAR_2_CALC_AVAIL_INC")
		public NNumber RCPar2CalcAvailInc;
		@DbRecordField(dataSourceName="R_C_PAR_2_UNADJ_BUS_NET")
		public NNumber RCPar2UnadjBusNet;
		@DbRecordField(dataSourceName="R_C_PAR_2_UNADJ_FARM_NET")
		public NNumber RCPar2UnadjFarmNet;
		@DbRecordField(dataSourceName="R_FM_INST_1_FED_EFC")
		public NNumber RFmInst1FedEfc;
		@DbRecordField(dataSourceName="R_FM_INST_1_FED_ELIG")
		public NNumber RFmInst1FedElig;
		@DbRecordField(dataSourceName="R_FM_INST_1_VA_BEN")
		public NNumber RFmInst1VaBen;
		@DbRecordField(dataSourceName="R_FM_INST_2_FED_EFC")
		public NNumber RFmInst2FedEfc;
		@DbRecordField(dataSourceName="R_FM_INST_2_FED_ELIG")
		public NNumber RFmInst2FedElig;
		@DbRecordField(dataSourceName="R_FM_INST_2_VA_BEN")
		public NNumber RFmInst2VaBen;
		@DbRecordField(dataSourceName="R_FM_INST_3_FED_EFC")
		public NNumber RFmInst3FedEfc;
		@DbRecordField(dataSourceName="R_FM_INST_3_FED_ELIG")
		public NNumber RFmInst3FedElig;
		@DbRecordField(dataSourceName="R_FM_INST_3_VA_BEN")
		public NNumber RFmInst3VaBen;
		@DbRecordField(dataSourceName="R_CM2_IM_CALC_IND")
		public NString RCm2ImCalcInd;
		@DbRecordField(dataSourceName="R_C_PAR_AGE")
		public NNumber RCParAge;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_C_ADDL_FINANCIAL")
		public NNumber RCAddlFinancial;
		@DbRecordField(dataSourceName="R_C_UNTAX_INC")
		public NNumber RCUntaxInc;
		@DbRecordField(dataSourceName="R_C_PAR_ADDL_FINANCIAL")
		public NNumber RCParAddlFinancial;
		@DbRecordField(dataSourceName="R_C_PAR_UNTAX_INC")
		public NNumber RCParUntaxInc;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
