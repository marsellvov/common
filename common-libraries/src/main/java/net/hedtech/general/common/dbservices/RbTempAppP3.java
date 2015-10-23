package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbTempAppP3 {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P3.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P3.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TempAppP3RecRow recOne,TempAppP3RecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P3.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TempAppP3RecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TempAppP3RecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P3.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P3.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P3.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P3.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
//		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NNumber pCInst1UnassessVa,NNumber pCInst2UnassessVa,NNumber pCInst3UnassessVa,NNumber pC1AltCtrb,NNumber pC2AltCtrb,NNumber pPell1AltCtrb,NNumber pPell2AltCtrb,NNumber pCPar1AltCtrb,NNumber pCPar2AltCtrb,NNumber pPell1AltPgi,NNumber pPell2AltPgi,NNumber pPar1AltAgi,NNumber pPar2AltAgi,NString pParAltMrtlStatus,NNumber pParAltFamSize,NString pParAltNoInColl,NString pAltOptLossToZero,NString pAltOptHmeVal,NString pAltOptParInColl,NString pMsg91,NString pMsg91Budg1,NString pMsg91Budg2,NString pMsg91Budg3,NString pMsg73Tax,NNumber pC1CtrbAdj18Mth,NNumber pC2CtrbAdj18Mth,NNumber pC1CtrbAdjOvr9Mth,NNumber pC2CtrbAdjOvr9Mth,NString pRejReasonPrty1,NString pRejReasonPrty2,NString pRejReasonPrty3,NString pRejReasonPrty4,NString pRejReasonPrty5,NString pRejReasonPrty6,NString pRejReasonPrty7,NString pRejReasonPrty8,NString pRejReasonPrty9,NString pRejReasonPrty10,NString pRejReasonPrty11,NString pRejReasonPrty12,NString pRejReasonPrty13,NString pRejReasonPrty14,NString pRejInAnalysisFlag,NString pMsg0,NString pMsg1,NString pMsg2,NString pMsg3,NString pMsg4,NString pMsg5,NString pMsg6,NString pMsg11,NString pMsg12,NString pMsg13,NString pMsg14,NString pMsg15,NString pMsg21,NString pMsg22,NString pMsg23,NString pMsg24,NString pMsg26,NString pMsg27,NString pMsg28,NString pMsg29,NString pMsg30,NString pMsg32,NString pMsg33,NString pMsg34,NString pMsg46,NString pMsg47,NString pMsg48,NString pMsg49,NString pMsg50,NString pMsg61,NString pMsg62,NString pMsg63,NString pMsg64,NString pMsg65,NString pMsg66,NString pMsg67,NString pMsg68,NString pMsg71,NString pMsg73,NString pMsg74,NString pMsg75,NString pMsg76,NString pMsg77,NString pMsg78,NString pMsg79,NString pMsg80,NString pMsg81,NString pMsg82,NString pMsg90,NString pMsg92,NString pMsg93,NString pMsg94,NString pMsg95,NString pMsg96,NString pMsg97,NString pMsg98,NString pMsg99,NString pMsg11ParFamMemb,NString pMsg12ParNoInColl,NNumber pMsg22ParDerAgi,NNumber pMsg27Val,NNumber pMsg47ParHmeVal,NNumber pMsg48ParHmeVal3,NNumber pMsg48ParHmeEqty3,NNumber pMsg49ParHmeVal,NNumber pMsg49ParHmeEqty,NString pMsg63FamMemb,NString pMsg64NoInColl,NNumber pMsg81AvailInc,NNumber pMsg90Inc,NNumber pMsg90Sma,NNumber pMsg90Diff,NNumber pMsg92Budg1,NNumber pMsg92Budg2,NNumber pMsg92Budg3,NNumber pMsg93Calc,NNumber pMsg93Resc,NNumber pPar1AltFedTax,NNumber pPar2AltFedTax,NString pMsg0Fed1FamCtrb,NString pMsg0Fed2FamCtrb,NString pMsg0Fed1Pgi,NString pMsg0Fed2Pgi,NString pAssumptionMsg1,NString pAssumptionMsg2,NString pAssumptionMsg3,NString pAssumptionMsg4,NString pAssumptionMsg5,NString pAssumptionMsg6,NString pMsg51,NNumber pMsg51Val,NString pMsg83,NString pMsg84,NString pMsg85,NNumber pMsg85Val,NString pAssumptOvrd1,NString pAssumptOvrd2,NString pAssumptOvrd3,NString pAssumptOvrd4,NString pAssumptOvrd5,NString pAssumptOvrd6,NString pAssumptOvrd7,NString pAssumptOvrd8,NString pAssumptOvrd9,NString pAttendSameColl,NNumber pBusDbt,NNumber pBusVal,NString pCSigned,NString pCSignedFath,NString pCSignedMoth,NString pCSignedMthDay,NString pCSignedPar,NString pCSignedSps,NString pCSignedYr,NNumber pCashChk,NNumber pChildCare,NNumber pChildSuppPaid,NString pDegreeType,NString pEfcMatch,NString pEstimateFlags,NString pFaaDepOverride,NString pFaaSignature,NString pFaaTitleIvCode,NString pFafFafsaData,NDate pFafRcptDate,NNumber pFarmDbt,NNumber pFarmVal,NString pFatherAge,NString pFatherHiGrade,NString pFedCollChoice4,NString pFedCollChoice5,NString pFedCollChoice6,NString pGaMatchFlag,NString pGedMthYr,NString pGradOrProf,NString pHsGradMthYr,NNumber pInvestDbt,NNumber pInvestVal,NString pLiveOnFarm,NString pMarried,NString pMotherAge,NString pMotherHiGrade,NString pMsg52,NNumber pMsg91SecFmEfc,NDate pPResDate,NNumber pParAltHmeVal,NNumber pParAltHmeValCap,NNumber pParBusDbt,NNumber pParBusVal,NNumber pParCashChk,NNumber pParChildSuppPaid,NNumber pParEic,NNumber pParFarmDbt,NNumber pParFarmVal,NNumber pParForIncExcl,NNumber pParHouseFoodOth,NNumber pParIncBenefits,NNumber pParInvestDbt,NNumber pParInvestVal,NNumber pParIraKeough,NString pParLiveOnFarm,NNumber pParMthMortRentPay,NNumber pParPortionOfPens,NNumber pParReDbt,NNumber pParReVal,NNumber pParSpecFuels,NNumber pParTaxDefPension,NNumber pParTeIntInc,NString pPin,NString pPreparerEin,NString pPreparerSign,NString pPreparerSsn,NString pPrevColl5,NNumber pReDbt,NNumber pReVal,NString pRejectOvrd1,NString pRejectOvrd2,NString pRejectOvrd3,NString pRejectOvrd4,NString pRejectOvrd5,NString pRejectOvrd6,NString pRejectOvrd7,NString pSMarMthYr,NString pSarCFlag,NNumber pSelfHelpValue,NString pSocSec,NNumber pStuAltNoInColl,NString pYrInColl2,NString pAdjEfcCalcReq,NNumber pFaaAdjEfcCorr,NString pEfcRecalcCorrReq,NDate pSResDate,NString pOfflUnofflInd,NString pAssumptionMsg7,NString pAssumptionMsg8,NString pAssumptionMsg9,NString pAssumptionMsg10,NNumber pPheaaGrantAmt1,NNumber pPheaaGrantAmt2,NNumber pPheaaGrantAmt3,NNumber pPheaaGrantAmt4,NString pPheaaGrantCde1,NString pPheaaGrantCde2,NString pPheaaGrantCde3,NString pPheaaGrantCde4,NNumber pParDepCareAndMed,NString pRejectOvrdA,NString pRejectOvrdC,NString pParMarMthYr,NNumber pParTuiFeeDed,NString pFathSsnMatch,NString pMothSsnMatch,NString pRejectOvrdG,NString pUserId,NString pRejectOvrd12,NString pRejectOvrdJ,NString pRejectOvrdK,NString pFedCollChoice7,NString pFedCollChoice8,NString pFedCollChoice9,NString pFedCollChoice10,NString pRejectOvrdB,NString pRejectOvrdN,NString pRejectOvrdW,NString pRejectOvrd20,NString pTeachCoursework,NNumber pEducCredits,NNumber pNeedBasedEmploy,NNumber pGrantScholarAid,NNumber pParEducCredits,NNumber pParNeedBasedEmploy,NNumber pParGrantScholarAid,NString pSpecCircumFlg,NNumber pTaxDefPension,NNumber pTeIntInc,NNumber pHouseFoodOth,NNumber pCoOpEarnings,NNumber pParCoOpEarnings,NString pIrsRequestFlag,NString pParIrsRequestFlag,NString pRejectOvrd21,NString pIrsAgiFlag,NString pParIrsAgiFlag,NString pIrsFitFlag,NString pParIrsFitFlag,Ref<NString> pRowidOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P3.P_CREATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_INFC_CODE", pInfcCode);
//			cmd.addParameter("@P_SEQ_NO", pSeqNo);
//			cmd.addParameter("@P_C_INST_1_UNASSESS_VA", pCInst1UnassessVa);
//			cmd.addParameter("@P_C_INST_2_UNASSESS_VA", pCInst2UnassessVa);
//			cmd.addParameter("@P_C_INST_3_UNASSESS_VA", pCInst3UnassessVa);
//			cmd.addParameter("@P_C_1_ALT_CTRB", pC1AltCtrb);
//			cmd.addParameter("@P_C_2_ALT_CTRB", pC2AltCtrb);
//			cmd.addParameter("@P_PELL_1_ALT_CTRB", pPell1AltCtrb);
//			cmd.addParameter("@P_PELL_2_ALT_CTRB", pPell2AltCtrb);
//			cmd.addParameter("@P_C_PAR_1_ALT_CTRB", pCPar1AltCtrb);
//			cmd.addParameter("@P_C_PAR_2_ALT_CTRB", pCPar2AltCtrb);
//			cmd.addParameter("@P_PELL_1_ALT_PGI", pPell1AltPgi);
//			cmd.addParameter("@P_PELL_2_ALT_PGI", pPell2AltPgi);
//			cmd.addParameter("@P_PAR_1_ALT_AGI", pPar1AltAgi);
//			cmd.addParameter("@P_PAR_2_ALT_AGI", pPar2AltAgi);
//			cmd.addParameter("@P_PAR_ALT_MRTL_STATUS", pParAltMrtlStatus);
//			cmd.addParameter("@P_PAR_ALT_FAM_SIZE", pParAltFamSize);
//			cmd.addParameter("@P_PAR_ALT_NO_IN_COLL", pParAltNoInColl);
//			cmd.addParameter("@P_ALT_OPT_LOSS_TO_ZERO", pAltOptLossToZero);
//			cmd.addParameter("@P_ALT_OPT_HME_VAL", pAltOptHmeVal);
//			cmd.addParameter("@P_ALT_OPT_PAR_IN_COLL", pAltOptParInColl);
//			cmd.addParameter("@P_MSG_91", pMsg91);
//			cmd.addParameter("@P_MSG_91_BUDG_1", pMsg91Budg1);
//			cmd.addParameter("@P_MSG_91_BUDG_2", pMsg91Budg2);
//			cmd.addParameter("@P_MSG_91_BUDG_3", pMsg91Budg3);
//			cmd.addParameter("@P_MSG_73_TAX", pMsg73Tax);
//			cmd.addParameter("@P_C_1_CTRB_ADJ_1_8_MTH", pC1CtrbAdj18Mth);
//			cmd.addParameter("@P_C_2_CTRB_ADJ_1_8_MTH", pC2CtrbAdj18Mth);
//			cmd.addParameter("@P_C_1_CTRB_ADJ_OVR_9_MTH", pC1CtrbAdjOvr9Mth);
//			cmd.addParameter("@P_C_2_CTRB_ADJ_OVR_9_MTH", pC2CtrbAdjOvr9Mth);
//			cmd.addParameter("@P_REJ_REASON_PRTY_1", pRejReasonPrty1);
//			cmd.addParameter("@P_REJ_REASON_PRTY_2", pRejReasonPrty2);
//			cmd.addParameter("@P_REJ_REASON_PRTY_3", pRejReasonPrty3);
//			cmd.addParameter("@P_REJ_REASON_PRTY_4", pRejReasonPrty4);
//			cmd.addParameter("@P_REJ_REASON_PRTY_5", pRejReasonPrty5);
//			cmd.addParameter("@P_REJ_REASON_PRTY_6", pRejReasonPrty6);
//			cmd.addParameter("@P_REJ_REASON_PRTY_7", pRejReasonPrty7);
//			cmd.addParameter("@P_REJ_REASON_PRTY_8", pRejReasonPrty8);
//			cmd.addParameter("@P_REJ_REASON_PRTY_9", pRejReasonPrty9);
//			cmd.addParameter("@P_REJ_REASON_PRTY_10", pRejReasonPrty10);
//			cmd.addParameter("@P_REJ_REASON_PRTY_11", pRejReasonPrty11);
//			cmd.addParameter("@P_REJ_REASON_PRTY_12", pRejReasonPrty12);
//			cmd.addParameter("@P_REJ_REASON_PRTY_13", pRejReasonPrty13);
//			cmd.addParameter("@P_REJ_REASON_PRTY_14", pRejReasonPrty14);
//			cmd.addParameter("@P_REJ_IN_ANALYSIS_FLAG", pRejInAnalysisFlag);
//			cmd.addParameter("@P_MSG_0", pMsg0);
//			cmd.addParameter("@P_MSG_1", pMsg1);
//			cmd.addParameter("@P_MSG_2", pMsg2);
//			cmd.addParameter("@P_MSG_3", pMsg3);
//			cmd.addParameter("@P_MSG_4", pMsg4);
//			cmd.addParameter("@P_MSG_5", pMsg5);
//			cmd.addParameter("@P_MSG_6", pMsg6);
//			cmd.addParameter("@P_MSG_11", pMsg11);
//			cmd.addParameter("@P_MSG_12", pMsg12);
//			cmd.addParameter("@P_MSG_13", pMsg13);
//			cmd.addParameter("@P_MSG_14", pMsg14);
//			cmd.addParameter("@P_MSG_15", pMsg15);
//			cmd.addParameter("@P_MSG_21", pMsg21);
//			cmd.addParameter("@P_MSG_22", pMsg22);
//			cmd.addParameter("@P_MSG_23", pMsg23);
//			cmd.addParameter("@P_MSG_24", pMsg24);
//			cmd.addParameter("@P_MSG_26", pMsg26);
//			cmd.addParameter("@P_MSG_27", pMsg27);
//			cmd.addParameter("@P_MSG_28", pMsg28);
//			cmd.addParameter("@P_MSG_29", pMsg29);
//			cmd.addParameter("@P_MSG_30", pMsg30);
//			cmd.addParameter("@P_MSG_32", pMsg32);
//			cmd.addParameter("@P_MSG_33", pMsg33);
//			cmd.addParameter("@P_MSG_34", pMsg34);
//			cmd.addParameter("@P_MSG_46", pMsg46);
//			cmd.addParameter("@P_MSG_47", pMsg47);
//			cmd.addParameter("@P_MSG_48", pMsg48);
//			cmd.addParameter("@P_MSG_49", pMsg49);
//			cmd.addParameter("@P_MSG_50", pMsg50);
//			cmd.addParameter("@P_MSG_61", pMsg61);
//			cmd.addParameter("@P_MSG_62", pMsg62);
//			cmd.addParameter("@P_MSG_63", pMsg63);
//			cmd.addParameter("@P_MSG_64", pMsg64);
//			cmd.addParameter("@P_MSG_65", pMsg65);
//			cmd.addParameter("@P_MSG_66", pMsg66);
//			cmd.addParameter("@P_MSG_67", pMsg67);
//			cmd.addParameter("@P_MSG_68", pMsg68);
//			cmd.addParameter("@P_MSG_71", pMsg71);
//			cmd.addParameter("@P_MSG_73", pMsg73);
//			cmd.addParameter("@P_MSG_74", pMsg74);
//			cmd.addParameter("@P_MSG_75", pMsg75);
//			cmd.addParameter("@P_MSG_76", pMsg76);
//			cmd.addParameter("@P_MSG_77", pMsg77);
//			cmd.addParameter("@P_MSG_78", pMsg78);
//			cmd.addParameter("@P_MSG_79", pMsg79);
//			cmd.addParameter("@P_MSG_80", pMsg80);
//			cmd.addParameter("@P_MSG_81", pMsg81);
//			cmd.addParameter("@P_MSG_82", pMsg82);
//			cmd.addParameter("@P_MSG_90", pMsg90);
//			cmd.addParameter("@P_MSG_92", pMsg92);
//			cmd.addParameter("@P_MSG_93", pMsg93);
//			cmd.addParameter("@P_MSG_94", pMsg94);
//			cmd.addParameter("@P_MSG_95", pMsg95);
//			cmd.addParameter("@P_MSG_96", pMsg96);
//			cmd.addParameter("@P_MSG_97", pMsg97);
//			cmd.addParameter("@P_MSG_98", pMsg98);
//			cmd.addParameter("@P_MSG_99", pMsg99);
//			cmd.addParameter("@P_MSG_11_PAR_FAM_MEMB", pMsg11ParFamMemb);
//			cmd.addParameter("@P_MSG_12_PAR_NO_IN_COLL", pMsg12ParNoInColl);
//			cmd.addParameter("@P_MSG_22_PAR_DER_AGI", pMsg22ParDerAgi);
//			cmd.addParameter("@P_MSG_27_VAL", pMsg27Val);
//			cmd.addParameter("@P_MSG_47_PAR_HME_VAL", pMsg47ParHmeVal);
//			cmd.addParameter("@P_MSG_48_PAR_HME_VAL_3", pMsg48ParHmeVal3);
//			cmd.addParameter("@P_MSG_48_PAR_HME_EQTY_3", pMsg48ParHmeEqty3);
//			cmd.addParameter("@P_MSG_49_PAR_HME_VAL", pMsg49ParHmeVal);
//			cmd.addParameter("@P_MSG_49_PAR_HME_EQTY", pMsg49ParHmeEqty);
//			cmd.addParameter("@P_MSG_63_FAM_MEMB", pMsg63FamMemb);
//			cmd.addParameter("@P_MSG_64_NO_IN_COLL", pMsg64NoInColl);
//			cmd.addParameter("@P_MSG_81_AVAIL_INC", pMsg81AvailInc);
//			cmd.addParameter("@P_MSG_90_INC", pMsg90Inc);
//			cmd.addParameter("@P_MSG_90_SMA", pMsg90Sma);
//			cmd.addParameter("@P_MSG_90_DIFF", pMsg90Diff);
//			cmd.addParameter("@P_MSG_92_BUDG_1", pMsg92Budg1);
//			cmd.addParameter("@P_MSG_92_BUDG_2", pMsg92Budg2);
//			cmd.addParameter("@P_MSG_92_BUDG_3", pMsg92Budg3);
//			cmd.addParameter("@P_MSG_93_CALC", pMsg93Calc);
//			cmd.addParameter("@P_MSG_93_RESC", pMsg93Resc);
//			cmd.addParameter("@P_PAR_1_ALT_FED_TAX", pPar1AltFedTax);
//			cmd.addParameter("@P_PAR_2_ALT_FED_TAX", pPar2AltFedTax);
//			cmd.addParameter("@P_MSG_0_FED_1_FAM_CTRB", pMsg0Fed1FamCtrb);
//			cmd.addParameter("@P_MSG_0_FED_2_FAM_CTRB", pMsg0Fed2FamCtrb);
//			cmd.addParameter("@P_MSG_0_FED_1_PGI", pMsg0Fed1Pgi);
//			cmd.addParameter("@P_MSG_0_FED_2_PGI", pMsg0Fed2Pgi);
//			cmd.addParameter("@P_ASSUMPTION_MSG_1", pAssumptionMsg1);
//			cmd.addParameter("@P_ASSUMPTION_MSG_2", pAssumptionMsg2);
//			cmd.addParameter("@P_ASSUMPTION_MSG_3", pAssumptionMsg3);
//			cmd.addParameter("@P_ASSUMPTION_MSG_4", pAssumptionMsg4);
//			cmd.addParameter("@P_ASSUMPTION_MSG_5", pAssumptionMsg5);
//			cmd.addParameter("@P_ASSUMPTION_MSG_6", pAssumptionMsg6);
//			cmd.addParameter("@P_MSG_51", pMsg51);
//			cmd.addParameter("@P_MSG_51_VAL", pMsg51Val);
//			cmd.addParameter("@P_MSG_83", pMsg83);
//			cmd.addParameter("@P_MSG_84", pMsg84);
//			cmd.addParameter("@P_MSG_85", pMsg85);
//			cmd.addParameter("@P_MSG_85_VAL", pMsg85Val);
//			cmd.addParameter("@P_ASSUMPT_OVRD_1", pAssumptOvrd1);
//			cmd.addParameter("@P_ASSUMPT_OVRD_2", pAssumptOvrd2);
//			cmd.addParameter("@P_ASSUMPT_OVRD_3", pAssumptOvrd3);
//			cmd.addParameter("@P_ASSUMPT_OVRD_4", pAssumptOvrd4);
//			cmd.addParameter("@P_ASSUMPT_OVRD_5", pAssumptOvrd5);
//			cmd.addParameter("@P_ASSUMPT_OVRD_6", pAssumptOvrd6);
//			cmd.addParameter("@P_ASSUMPT_OVRD_7", pAssumptOvrd7);
//			cmd.addParameter("@P_ASSUMPT_OVRD_8", pAssumptOvrd8);
//			cmd.addParameter("@P_ASSUMPT_OVRD_9", pAssumptOvrd9);
//			cmd.addParameter("@P_ATTEND_SAME_COLL", pAttendSameColl);
//			cmd.addParameter("@P_BUS_DBT", pBusDbt);
//			cmd.addParameter("@P_BUS_VAL", pBusVal);
//			cmd.addParameter("@P_C_SIGNED", pCSigned);
//			cmd.addParameter("@P_C_SIGNED_FATH", pCSignedFath);
//			cmd.addParameter("@P_C_SIGNED_MOTH", pCSignedMoth);
//			cmd.addParameter("@P_C_SIGNED_MTH_DAY", pCSignedMthDay);
//			cmd.addParameter("@P_C_SIGNED_PAR", pCSignedPar);
//			cmd.addParameter("@P_C_SIGNED_SPS", pCSignedSps);
//			cmd.addParameter("@P_C_SIGNED_YR", pCSignedYr);
//			cmd.addParameter("@P_CASH_CHK", pCashChk);
//			cmd.addParameter("@P_CHILD_CARE", pChildCare);
//			cmd.addParameter("@P_CHILD_SUPP_PAID", pChildSuppPaid);
//			cmd.addParameter("@P_DEGREE_TYPE", pDegreeType);
//			cmd.addParameter("@P_EFC_MATCH", pEfcMatch);
//			cmd.addParameter("@P_ESTIMATE_FLAGS", pEstimateFlags);
//			cmd.addParameter("@P_FAA_DEP_OVERRIDE", pFaaDepOverride);
//			cmd.addParameter("@P_FAA_SIGNATURE", pFaaSignature);
//			cmd.addParameter("@P_FAA_TITLE_IV_CODE", pFaaTitleIvCode);
//			cmd.addParameter("@P_FAF_FAFSA_DATA", pFafFafsaData);
//			cmd.addParameter("@P_FAF_RCPT_DATE", pFafRcptDate);
//			cmd.addParameter("@P_FARM_DBT", pFarmDbt);
//			cmd.addParameter("@P_FARM_VAL", pFarmVal);
//			cmd.addParameter("@P_FATHER_AGE", pFatherAge);
//			cmd.addParameter("@P_FATHER_HI_GRADE", pFatherHiGrade);
//			cmd.addParameter("@P_FED_COLL_CHOICE_4", pFedCollChoice4);
//			cmd.addParameter("@P_FED_COLL_CHOICE_5", pFedCollChoice5);
//			cmd.addParameter("@P_FED_COLL_CHOICE_6", pFedCollChoice6);
//			cmd.addParameter("@P_GA_MATCH_FLAG", pGaMatchFlag);
//			cmd.addParameter("@P_GED_MTH_YR", pGedMthYr);
//			cmd.addParameter("@P_GRAD_OR_PROF", pGradOrProf);
//			cmd.addParameter("@P_HS_GRAD_MTH_YR", pHsGradMthYr);
//			cmd.addParameter("@P_INVEST_DBT", pInvestDbt);
//			cmd.addParameter("@P_INVEST_VAL", pInvestVal);
//			cmd.addParameter("@P_LIVE_ON_FARM", pLiveOnFarm);
//			cmd.addParameter("@P_MARRIED", pMarried);
//			cmd.addParameter("@P_MOTHER_AGE", pMotherAge);
//			cmd.addParameter("@P_MOTHER_HI_GRADE", pMotherHiGrade);
//			cmd.addParameter("@P_MSG_52", pMsg52);
//			cmd.addParameter("@P_MSG_91_SEC_FM_EFC", pMsg91SecFmEfc);
//			cmd.addParameter("@P_P_RES_DATE", pPResDate);
//			cmd.addParameter("@P_PAR_ALT_HME_VAL", pParAltHmeVal);
//			cmd.addParameter("@P_PAR_ALT_HME_VAL_CAP", pParAltHmeValCap);
//			cmd.addParameter("@P_PAR_BUS_DBT", pParBusDbt);
//			cmd.addParameter("@P_PAR_BUS_VAL", pParBusVal);
//			cmd.addParameter("@P_PAR_CASH_CHK", pParCashChk);
//			cmd.addParameter("@P_PAR_CHILD_SUPP_PAID", pParChildSuppPaid);
//			cmd.addParameter("@P_PAR_EIC", pParEic);
//			cmd.addParameter("@P_PAR_FARM_DBT", pParFarmDbt);
//			cmd.addParameter("@P_PAR_FARM_VAL", pParFarmVal);
//			cmd.addParameter("@P_PAR_FOR_INC_EXCL", pParForIncExcl);
//			cmd.addParameter("@P_PAR_HOUSE_FOOD_OTH", pParHouseFoodOth);
//			cmd.addParameter("@P_PAR_INC_BENEFITS", pParIncBenefits);
//			cmd.addParameter("@P_PAR_INVEST_DBT", pParInvestDbt);
//			cmd.addParameter("@P_PAR_INVEST_VAL", pParInvestVal);
//			cmd.addParameter("@P_PAR_IRA_KEOUGH", pParIraKeough);
//			cmd.addParameter("@P_PAR_LIVE_ON_FARM", pParLiveOnFarm);
//			cmd.addParameter("@P_PAR_MTH_MORT_RENT_PAY", pParMthMortRentPay);
//			cmd.addParameter("@P_PAR_PORTION_OF_PENS", pParPortionOfPens);
//			cmd.addParameter("@P_PAR_RE_DBT", pParReDbt);
//			cmd.addParameter("@P_PAR_RE_VAL", pParReVal);
//			cmd.addParameter("@P_PAR_SPEC_FUELS", pParSpecFuels);
//			cmd.addParameter("@P_PAR_TAX_DEF_PENSION", pParTaxDefPension);
//			cmd.addParameter("@P_PAR_TE_INT_INC", pParTeIntInc);
//			cmd.addParameter("@P_PIN", pPin);
//			cmd.addParameter("@P_PREPARER_EIN", pPreparerEin);
//			cmd.addParameter("@P_PREPARER_SIGN", pPreparerSign);
//			cmd.addParameter("@P_PREPARER_SSN", pPreparerSsn);
//			cmd.addParameter("@P_PREV_COLL5", pPrevColl5);
//			cmd.addParameter("@P_RE_DBT", pReDbt);
//			cmd.addParameter("@P_RE_VAL", pReVal);
//			cmd.addParameter("@P_REJECT_OVRD_1", pRejectOvrd1);
//			cmd.addParameter("@P_REJECT_OVRD_2", pRejectOvrd2);
//			cmd.addParameter("@P_REJECT_OVRD_3", pRejectOvrd3);
//			cmd.addParameter("@P_REJECT_OVRD_4", pRejectOvrd4);
//			cmd.addParameter("@P_REJECT_OVRD_5", pRejectOvrd5);
//			cmd.addParameter("@P_REJECT_OVRD_6", pRejectOvrd6);
//			cmd.addParameter("@P_REJECT_OVRD_7", pRejectOvrd7);
//			cmd.addParameter("@P_S_MAR_MTH_YR", pSMarMthYr);
//			cmd.addParameter("@P_SAR_C_FLAG", pSarCFlag);
//			cmd.addParameter("@P_SELF_HELP_VALUE", pSelfHelpValue);
//			cmd.addParameter("@P_SOC_SEC", pSocSec);
//			cmd.addParameter("@P_STU_ALT_NO_IN_COLL", pStuAltNoInColl);
//			cmd.addParameter("@P_YR_IN_COLL_2", pYrInColl2);
//			cmd.addParameter("@P_ADJ_EFC_CALC_REQ", pAdjEfcCalcReq);
//			cmd.addParameter("@P_FAA_ADJ_EFC_CORR", pFaaAdjEfcCorr);
//			cmd.addParameter("@P_EFC_RECALC_CORR_REQ", pEfcRecalcCorrReq);
//			cmd.addParameter("@P_S_RES_DATE", pSResDate);
//			cmd.addParameter("@P_OFFL_UNOFFL_IND", pOfflUnofflInd);
//			cmd.addParameter("@P_ASSUMPTION_MSG_7", pAssumptionMsg7);
//			cmd.addParameter("@P_ASSUMPTION_MSG_8", pAssumptionMsg8);
//			cmd.addParameter("@P_ASSUMPTION_MSG_9", pAssumptionMsg9);
//			cmd.addParameter("@P_ASSUMPTION_MSG_10", pAssumptionMsg10);
//			cmd.addParameter("@P_PHEAA_GRANT_AMT_1", pPheaaGrantAmt1);
//			cmd.addParameter("@P_PHEAA_GRANT_AMT_2", pPheaaGrantAmt2);
//			cmd.addParameter("@P_PHEAA_GRANT_AMT_3", pPheaaGrantAmt3);
//			cmd.addParameter("@P_PHEAA_GRANT_AMT_4", pPheaaGrantAmt4);
//			cmd.addParameter("@P_PHEAA_GRANT_CDE_1", pPheaaGrantCde1);
//			cmd.addParameter("@P_PHEAA_GRANT_CDE_2", pPheaaGrantCde2);
//			cmd.addParameter("@P_PHEAA_GRANT_CDE_3", pPheaaGrantCde3);
//			cmd.addParameter("@P_PHEAA_GRANT_CDE_4", pPheaaGrantCde4);
//			cmd.addParameter("@P_PAR_DEP_CARE_AND_MED", pParDepCareAndMed);
//			cmd.addParameter("@P_REJECT_OVRD_A", pRejectOvrdA);
//			cmd.addParameter("@P_REJECT_OVRD_C", pRejectOvrdC);
//			cmd.addParameter("@P_PAR_MAR_MTH_YR", pParMarMthYr);
//			cmd.addParameter("@P_PAR_TUI_FEE_DED", pParTuiFeeDed);
//			cmd.addParameter("@P_FATH_SSN_MATCH", pFathSsnMatch);
//			cmd.addParameter("@P_MOTH_SSN_MATCH", pMothSsnMatch);
//			cmd.addParameter("@P_REJECT_OVRD_G", pRejectOvrdG);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_REJECT_OVRD_12", pRejectOvrd12);
//			cmd.addParameter("@P_REJECT_OVRD_J", pRejectOvrdJ);
//			cmd.addParameter("@P_REJECT_OVRD_K", pRejectOvrdK);
//			cmd.addParameter("@P_FED_COLL_CHOICE_7", pFedCollChoice7);
//			cmd.addParameter("@P_FED_COLL_CHOICE_8", pFedCollChoice8);
//			cmd.addParameter("@P_FED_COLL_CHOICE_9", pFedCollChoice9);
//			cmd.addParameter("@P_FED_COLL_CHOICE_10", pFedCollChoice10);
//			cmd.addParameter("@P_REJECT_OVRD_B", pRejectOvrdB);
//			cmd.addParameter("@P_REJECT_OVRD_N", pRejectOvrdN);
//			cmd.addParameter("@P_REJECT_OVRD_W", pRejectOvrdW);
//			cmd.addParameter("@P_REJECT_OVRD_20", pRejectOvrd20);
//			cmd.addParameter("@P_TEACH_COURSEWORK", pTeachCoursework);
//			cmd.addParameter("@P_EDUC_CREDITS", pEducCredits);
//			cmd.addParameter("@P_NEED_BASED_EMPLOY", pNeedBasedEmploy);
//			cmd.addParameter("@P_GRANT_SCHOLAR_AID", pGrantScholarAid);
//			cmd.addParameter("@P_PAR_EDUC_CREDITS", pParEducCredits);
//			cmd.addParameter("@P_PAR_NEED_BASED_EMPLOY", pParNeedBasedEmploy);
//			cmd.addParameter("@P_PAR_GRANT_SCHOLAR_AID", pParGrantScholarAid);
//			cmd.addParameter("@P_SPEC_CIRCUM_FLG", pSpecCircumFlg);
//			cmd.addParameter("@P_TAX_DEF_PENSION", pTaxDefPension);
//			cmd.addParameter("@P_TE_INT_INC", pTeIntInc);
//			cmd.addParameter("@P_HOUSE_FOOD_OTH", pHouseFoodOth);
//			cmd.addParameter("@P_CO_OP_EARNINGS", pCoOpEarnings);
//			cmd.addParameter("@P_PAR_CO_OP_EARNINGS", pParCoOpEarnings);
//			cmd.addParameter("@P_IRS_REQUEST_FLAG", pIrsRequestFlag);
//			cmd.addParameter("@P_PAR_IRS_REQUEST_FLAG", pParIrsRequestFlag);
//			cmd.addParameter("@P_REJECT_OVRD_21", pRejectOvrd21);
//			cmd.addParameter("@P_IRS_AGI_FLAG", pIrsAgiFlag);
//			cmd.addParameter("@P_PAR_IRS_AGI_FLAG", pParIrsAgiFlag);
//			cmd.addParameter("@P_IRS_FIT_FLAG", pIrsFitFlag);
//			cmd.addParameter("@P_PAR_IRS_FIT_FLAG", pParIrsFitFlag);
//			cmd.addParameter("@P_ROWID_OUT", NString.class);
//				
//			cmd.execute();
//			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);
//
//
//		}
		
		public static void pDelete(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P3.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteBulk(NString pAidyCode,NString pInfcCode,NString pDeleteFlag,Ref<NNumber> pDelCountOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P3.P_DELETE_BULK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_DELETE_FLAG", pDeleteFlag);
			cmd.addParameter("@P_DEL_COUNT_OUT", NNumber.class);
				
			cmd.execute();
			pDelCountOut.val = cmd.getParameterValue("@P_DEL_COUNT_OUT", NNumber.class);


		}
		
		public static void pLock(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P3.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
//		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NNumber pCInst1UnassessVa,NNumber pCInst2UnassessVa,NNumber pCInst3UnassessVa,NNumber pC1AltCtrb,NNumber pC2AltCtrb,NNumber pPell1AltCtrb,NNumber pPell2AltCtrb,NNumber pCPar1AltCtrb,NNumber pCPar2AltCtrb,NNumber pPell1AltPgi,NNumber pPell2AltPgi,NNumber pPar1AltAgi,NNumber pPar2AltAgi,NString pParAltMrtlStatus,NNumber pParAltFamSize,NString pParAltNoInColl,NString pAltOptLossToZero,NString pAltOptHmeVal,NString pAltOptParInColl,NString pMsg91,NString pMsg91Budg1,NString pMsg91Budg2,NString pMsg91Budg3,NString pMsg73Tax,NNumber pC1CtrbAdj18Mth,NNumber pC2CtrbAdj18Mth,NNumber pC1CtrbAdjOvr9Mth,NNumber pC2CtrbAdjOvr9Mth,NString pRejReasonPrty1,NString pRejReasonPrty2,NString pRejReasonPrty3,NString pRejReasonPrty4,NString pRejReasonPrty5,NString pRejReasonPrty6,NString pRejReasonPrty7,NString pRejReasonPrty8,NString pRejReasonPrty9,NString pRejReasonPrty10,NString pRejReasonPrty11,NString pRejReasonPrty12,NString pRejReasonPrty13,NString pRejReasonPrty14,NString pRejInAnalysisFlag,NString pMsg0,NString pMsg1,NString pMsg2,NString pMsg3,NString pMsg4,NString pMsg5,NString pMsg6,NString pMsg11,NString pMsg12,NString pMsg13,NString pMsg14,NString pMsg15,NString pMsg21,NString pMsg22,NString pMsg23,NString pMsg24,NString pMsg26,NString pMsg27,NString pMsg28,NString pMsg29,NString pMsg30,NString pMsg32,NString pMsg33,NString pMsg34,NString pMsg46,NString pMsg47,NString pMsg48,NString pMsg49,NString pMsg50,NString pMsg61,NString pMsg62,NString pMsg63,NString pMsg64,NString pMsg65,NString pMsg66,NString pMsg67,NString pMsg68,NString pMsg71,NString pMsg73,NString pMsg74,NString pMsg75,NString pMsg76,NString pMsg77,NString pMsg78,NString pMsg79,NString pMsg80,NString pMsg81,NString pMsg82,NString pMsg90,NString pMsg92,NString pMsg93,NString pMsg94,NString pMsg95,NString pMsg96,NString pMsg97,NString pMsg98,NString pMsg99,NString pMsg11ParFamMemb,NString pMsg12ParNoInColl,NNumber pMsg22ParDerAgi,NNumber pMsg27Val,NNumber pMsg47ParHmeVal,NNumber pMsg48ParHmeVal3,NNumber pMsg48ParHmeEqty3,NNumber pMsg49ParHmeVal,NNumber pMsg49ParHmeEqty,NString pMsg63FamMemb,NString pMsg64NoInColl,NNumber pMsg81AvailInc,NNumber pMsg90Inc,NNumber pMsg90Sma,NNumber pMsg90Diff,NNumber pMsg92Budg1,NNumber pMsg92Budg2,NNumber pMsg92Budg3,NNumber pMsg93Calc,NNumber pMsg93Resc,NNumber pPar1AltFedTax,NNumber pPar2AltFedTax,NString pMsg0Fed1FamCtrb,NString pMsg0Fed2FamCtrb,NString pMsg0Fed1Pgi,NString pMsg0Fed2Pgi,NString pAssumptionMsg1,NString pAssumptionMsg2,NString pAssumptionMsg3,NString pAssumptionMsg4,NString pAssumptionMsg5,NString pAssumptionMsg6,NString pMsg51,NNumber pMsg51Val,NString pMsg83,NString pMsg84,NString pMsg85,NNumber pMsg85Val,NString pAssumptOvrd1,NString pAssumptOvrd2,NString pAssumptOvrd3,NString pAssumptOvrd4,NString pAssumptOvrd5,NString pAssumptOvrd6,NString pAssumptOvrd7,NString pAssumptOvrd8,NString pAssumptOvrd9,NString pAttendSameColl,NNumber pBusDbt,NNumber pBusVal,NString pCSigned,NString pCSignedFath,NString pCSignedMoth,NString pCSignedMthDay,NString pCSignedPar,NString pCSignedSps,NString pCSignedYr,NNumber pCashChk,NNumber pChildCare,NNumber pChildSuppPaid,NString pDegreeType,NString pEfcMatch,NString pEstimateFlags,NString pFaaDepOverride,NString pFaaSignature,NString pFaaTitleIvCode,NString pFafFafsaData,NDate pFafRcptDate,NNumber pFarmDbt,NNumber pFarmVal,NString pFatherAge,NString pFatherHiGrade,NString pFedCollChoice4,NString pFedCollChoice5,NString pFedCollChoice6,NString pGaMatchFlag,NString pGedMthYr,NString pGradOrProf,NString pHsGradMthYr,NNumber pInvestDbt,NNumber pInvestVal,NString pLiveOnFarm,NString pMarried,NString pMotherAge,NString pMotherHiGrade,NString pMsg52,NNumber pMsg91SecFmEfc,NDate pPResDate,NNumber pParAltHmeVal,NNumber pParAltHmeValCap,NNumber pParBusDbt,NNumber pParBusVal,NNumber pParCashChk,NNumber pParChildSuppPaid,NNumber pParEic,NNumber pParFarmDbt,NNumber pParFarmVal,NNumber pParForIncExcl,NNumber pParHouseFoodOth,NNumber pParIncBenefits,NNumber pParInvestDbt,NNumber pParInvestVal,NNumber pParIraKeough,NString pParLiveOnFarm,NNumber pParMthMortRentPay,NNumber pParPortionOfPens,NNumber pParReDbt,NNumber pParReVal,NNumber pParSpecFuels,NNumber pParTaxDefPension,NNumber pParTeIntInc,NString pPin,NString pPreparerEin,NString pPreparerSign,NString pPreparerSsn,NString pPrevColl5,NNumber pReDbt,NNumber pReVal,NString pRejectOvrd1,NString pRejectOvrd2,NString pRejectOvrd3,NString pRejectOvrd4,NString pRejectOvrd5,NString pRejectOvrd6,NString pRejectOvrd7,NString pSMarMthYr,NString pSarCFlag,NNumber pSelfHelpValue,NString pSocSec,NNumber pStuAltNoInColl,NString pYrInColl2,NString pAdjEfcCalcReq,NNumber pFaaAdjEfcCorr,NString pEfcRecalcCorrReq,NDate pSResDate,NString pOfflUnofflInd,NString pAssumptionMsg7,NString pAssumptionMsg8,NString pAssumptionMsg9,NString pAssumptionMsg10,NNumber pPheaaGrantAmt1,NNumber pPheaaGrantAmt2,NNumber pPheaaGrantAmt3,NNumber pPheaaGrantAmt4,NString pPheaaGrantCde1,NString pPheaaGrantCde2,NString pPheaaGrantCde3,NString pPheaaGrantCde4,NNumber pParDepCareAndMed,NString pRejectOvrdA,NString pRejectOvrdC,NString pParMarMthYr,NNumber pParTuiFeeDed,NString pFathSsnMatch,NString pMothSsnMatch,NString pRejectOvrdG,NString pUserId,NString pRejectOvrd12,NString pRejectOvrdJ,NString pRejectOvrdK,NString pFedCollChoice7,NString pFedCollChoice8,NString pFedCollChoice9,NString pFedCollChoice10,NString pRejectOvrdB,NString pRejectOvrdN,NString pRejectOvrdW,NString pRejectOvrd20,NString pTeachCoursework,NNumber pEducCredits,NNumber pNeedBasedEmploy,NNumber pGrantScholarAid,NNumber pParEducCredits,NNumber pParNeedBasedEmploy,NNumber pParGrantScholarAid,NString pSpecCircumFlg,NNumber pTaxDefPension,NNumber pTeIntInc,NNumber pHouseFoodOth,NNumber pCoOpEarnings,NNumber pParCoOpEarnings,NString pIrsRequestFlag,NString pParIrsRequestFlag,NString pRejectOvrd21,NString pIrsAgiFlag,NString pParIrsAgiFlag,NString pIrsFitFlag,NString pParIrsFitFlag,NString pRowid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P3.P_UPDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_INFC_CODE", pInfcCode);
//			cmd.addParameter("@P_SEQ_NO", pSeqNo);
//			cmd.addParameter("@P_C_INST_1_UNASSESS_VA", pCInst1UnassessVa);
//			cmd.addParameter("@P_C_INST_2_UNASSESS_VA", pCInst2UnassessVa);
//			cmd.addParameter("@P_C_INST_3_UNASSESS_VA", pCInst3UnassessVa);
//			cmd.addParameter("@P_C_1_ALT_CTRB", pC1AltCtrb);
//			cmd.addParameter("@P_C_2_ALT_CTRB", pC2AltCtrb);
//			cmd.addParameter("@P_PELL_1_ALT_CTRB", pPell1AltCtrb);
//			cmd.addParameter("@P_PELL_2_ALT_CTRB", pPell2AltCtrb);
//			cmd.addParameter("@P_C_PAR_1_ALT_CTRB", pCPar1AltCtrb);
//			cmd.addParameter("@P_C_PAR_2_ALT_CTRB", pCPar2AltCtrb);
//			cmd.addParameter("@P_PELL_1_ALT_PGI", pPell1AltPgi);
//			cmd.addParameter("@P_PELL_2_ALT_PGI", pPell2AltPgi);
//			cmd.addParameter("@P_PAR_1_ALT_AGI", pPar1AltAgi);
//			cmd.addParameter("@P_PAR_2_ALT_AGI", pPar2AltAgi);
//			cmd.addParameter("@P_PAR_ALT_MRTL_STATUS", pParAltMrtlStatus);
//			cmd.addParameter("@P_PAR_ALT_FAM_SIZE", pParAltFamSize);
//			cmd.addParameter("@P_PAR_ALT_NO_IN_COLL", pParAltNoInColl);
//			cmd.addParameter("@P_ALT_OPT_LOSS_TO_ZERO", pAltOptLossToZero);
//			cmd.addParameter("@P_ALT_OPT_HME_VAL", pAltOptHmeVal);
//			cmd.addParameter("@P_ALT_OPT_PAR_IN_COLL", pAltOptParInColl);
//			cmd.addParameter("@P_MSG_91", pMsg91);
//			cmd.addParameter("@P_MSG_91_BUDG_1", pMsg91Budg1);
//			cmd.addParameter("@P_MSG_91_BUDG_2", pMsg91Budg2);
//			cmd.addParameter("@P_MSG_91_BUDG_3", pMsg91Budg3);
//			cmd.addParameter("@P_MSG_73_TAX", pMsg73Tax);
//			cmd.addParameter("@P_C_1_CTRB_ADJ_1_8_MTH", pC1CtrbAdj18Mth);
//			cmd.addParameter("@P_C_2_CTRB_ADJ_1_8_MTH", pC2CtrbAdj18Mth);
//			cmd.addParameter("@P_C_1_CTRB_ADJ_OVR_9_MTH", pC1CtrbAdjOvr9Mth);
//			cmd.addParameter("@P_C_2_CTRB_ADJ_OVR_9_MTH", pC2CtrbAdjOvr9Mth);
//			cmd.addParameter("@P_REJ_REASON_PRTY_1", pRejReasonPrty1);
//			cmd.addParameter("@P_REJ_REASON_PRTY_2", pRejReasonPrty2);
//			cmd.addParameter("@P_REJ_REASON_PRTY_3", pRejReasonPrty3);
//			cmd.addParameter("@P_REJ_REASON_PRTY_4", pRejReasonPrty4);
//			cmd.addParameter("@P_REJ_REASON_PRTY_5", pRejReasonPrty5);
//			cmd.addParameter("@P_REJ_REASON_PRTY_6", pRejReasonPrty6);
//			cmd.addParameter("@P_REJ_REASON_PRTY_7", pRejReasonPrty7);
//			cmd.addParameter("@P_REJ_REASON_PRTY_8", pRejReasonPrty8);
//			cmd.addParameter("@P_REJ_REASON_PRTY_9", pRejReasonPrty9);
//			cmd.addParameter("@P_REJ_REASON_PRTY_10", pRejReasonPrty10);
//			cmd.addParameter("@P_REJ_REASON_PRTY_11", pRejReasonPrty11);
//			cmd.addParameter("@P_REJ_REASON_PRTY_12", pRejReasonPrty12);
//			cmd.addParameter("@P_REJ_REASON_PRTY_13", pRejReasonPrty13);
//			cmd.addParameter("@P_REJ_REASON_PRTY_14", pRejReasonPrty14);
//			cmd.addParameter("@P_REJ_IN_ANALYSIS_FLAG", pRejInAnalysisFlag);
//			cmd.addParameter("@P_MSG_0", pMsg0);
//			cmd.addParameter("@P_MSG_1", pMsg1);
//			cmd.addParameter("@P_MSG_2", pMsg2);
//			cmd.addParameter("@P_MSG_3", pMsg3);
//			cmd.addParameter("@P_MSG_4", pMsg4);
//			cmd.addParameter("@P_MSG_5", pMsg5);
//			cmd.addParameter("@P_MSG_6", pMsg6);
//			cmd.addParameter("@P_MSG_11", pMsg11);
//			cmd.addParameter("@P_MSG_12", pMsg12);
//			cmd.addParameter("@P_MSG_13", pMsg13);
//			cmd.addParameter("@P_MSG_14", pMsg14);
//			cmd.addParameter("@P_MSG_15", pMsg15);
//			cmd.addParameter("@P_MSG_21", pMsg21);
//			cmd.addParameter("@P_MSG_22", pMsg22);
//			cmd.addParameter("@P_MSG_23", pMsg23);
//			cmd.addParameter("@P_MSG_24", pMsg24);
//			cmd.addParameter("@P_MSG_26", pMsg26);
//			cmd.addParameter("@P_MSG_27", pMsg27);
//			cmd.addParameter("@P_MSG_28", pMsg28);
//			cmd.addParameter("@P_MSG_29", pMsg29);
//			cmd.addParameter("@P_MSG_30", pMsg30);
//			cmd.addParameter("@P_MSG_32", pMsg32);
//			cmd.addParameter("@P_MSG_33", pMsg33);
//			cmd.addParameter("@P_MSG_34", pMsg34);
//			cmd.addParameter("@P_MSG_46", pMsg46);
//			cmd.addParameter("@P_MSG_47", pMsg47);
//			cmd.addParameter("@P_MSG_48", pMsg48);
//			cmd.addParameter("@P_MSG_49", pMsg49);
//			cmd.addParameter("@P_MSG_50", pMsg50);
//			cmd.addParameter("@P_MSG_61", pMsg61);
//			cmd.addParameter("@P_MSG_62", pMsg62);
//			cmd.addParameter("@P_MSG_63", pMsg63);
//			cmd.addParameter("@P_MSG_64", pMsg64);
//			cmd.addParameter("@P_MSG_65", pMsg65);
//			cmd.addParameter("@P_MSG_66", pMsg66);
//			cmd.addParameter("@P_MSG_67", pMsg67);
//			cmd.addParameter("@P_MSG_68", pMsg68);
//			cmd.addParameter("@P_MSG_71", pMsg71);
//			cmd.addParameter("@P_MSG_73", pMsg73);
//			cmd.addParameter("@P_MSG_74", pMsg74);
//			cmd.addParameter("@P_MSG_75", pMsg75);
//			cmd.addParameter("@P_MSG_76", pMsg76);
//			cmd.addParameter("@P_MSG_77", pMsg77);
//			cmd.addParameter("@P_MSG_78", pMsg78);
//			cmd.addParameter("@P_MSG_79", pMsg79);
//			cmd.addParameter("@P_MSG_80", pMsg80);
//			cmd.addParameter("@P_MSG_81", pMsg81);
//			cmd.addParameter("@P_MSG_82", pMsg82);
//			cmd.addParameter("@P_MSG_90", pMsg90);
//			cmd.addParameter("@P_MSG_92", pMsg92);
//			cmd.addParameter("@P_MSG_93", pMsg93);
//			cmd.addParameter("@P_MSG_94", pMsg94);
//			cmd.addParameter("@P_MSG_95", pMsg95);
//			cmd.addParameter("@P_MSG_96", pMsg96);
//			cmd.addParameter("@P_MSG_97", pMsg97);
//			cmd.addParameter("@P_MSG_98", pMsg98);
//			cmd.addParameter("@P_MSG_99", pMsg99);
//			cmd.addParameter("@P_MSG_11_PAR_FAM_MEMB", pMsg11ParFamMemb);
//			cmd.addParameter("@P_MSG_12_PAR_NO_IN_COLL", pMsg12ParNoInColl);
//			cmd.addParameter("@P_MSG_22_PAR_DER_AGI", pMsg22ParDerAgi);
//			cmd.addParameter("@P_MSG_27_VAL", pMsg27Val);
//			cmd.addParameter("@P_MSG_47_PAR_HME_VAL", pMsg47ParHmeVal);
//			cmd.addParameter("@P_MSG_48_PAR_HME_VAL_3", pMsg48ParHmeVal3);
//			cmd.addParameter("@P_MSG_48_PAR_HME_EQTY_3", pMsg48ParHmeEqty3);
//			cmd.addParameter("@P_MSG_49_PAR_HME_VAL", pMsg49ParHmeVal);
//			cmd.addParameter("@P_MSG_49_PAR_HME_EQTY", pMsg49ParHmeEqty);
//			cmd.addParameter("@P_MSG_63_FAM_MEMB", pMsg63FamMemb);
//			cmd.addParameter("@P_MSG_64_NO_IN_COLL", pMsg64NoInColl);
//			cmd.addParameter("@P_MSG_81_AVAIL_INC", pMsg81AvailInc);
//			cmd.addParameter("@P_MSG_90_INC", pMsg90Inc);
//			cmd.addParameter("@P_MSG_90_SMA", pMsg90Sma);
//			cmd.addParameter("@P_MSG_90_DIFF", pMsg90Diff);
//			cmd.addParameter("@P_MSG_92_BUDG_1", pMsg92Budg1);
//			cmd.addParameter("@P_MSG_92_BUDG_2", pMsg92Budg2);
//			cmd.addParameter("@P_MSG_92_BUDG_3", pMsg92Budg3);
//			cmd.addParameter("@P_MSG_93_CALC", pMsg93Calc);
//			cmd.addParameter("@P_MSG_93_RESC", pMsg93Resc);
//			cmd.addParameter("@P_PAR_1_ALT_FED_TAX", pPar1AltFedTax);
//			cmd.addParameter("@P_PAR_2_ALT_FED_TAX", pPar2AltFedTax);
//			cmd.addParameter("@P_MSG_0_FED_1_FAM_CTRB", pMsg0Fed1FamCtrb);
//			cmd.addParameter("@P_MSG_0_FED_2_FAM_CTRB", pMsg0Fed2FamCtrb);
//			cmd.addParameter("@P_MSG_0_FED_1_PGI", pMsg0Fed1Pgi);
//			cmd.addParameter("@P_MSG_0_FED_2_PGI", pMsg0Fed2Pgi);
//			cmd.addParameter("@P_ASSUMPTION_MSG_1", pAssumptionMsg1);
//			cmd.addParameter("@P_ASSUMPTION_MSG_2", pAssumptionMsg2);
//			cmd.addParameter("@P_ASSUMPTION_MSG_3", pAssumptionMsg3);
//			cmd.addParameter("@P_ASSUMPTION_MSG_4", pAssumptionMsg4);
//			cmd.addParameter("@P_ASSUMPTION_MSG_5", pAssumptionMsg5);
//			cmd.addParameter("@P_ASSUMPTION_MSG_6", pAssumptionMsg6);
//			cmd.addParameter("@P_MSG_51", pMsg51);
//			cmd.addParameter("@P_MSG_51_VAL", pMsg51Val);
//			cmd.addParameter("@P_MSG_83", pMsg83);
//			cmd.addParameter("@P_MSG_84", pMsg84);
//			cmd.addParameter("@P_MSG_85", pMsg85);
//			cmd.addParameter("@P_MSG_85_VAL", pMsg85Val);
//			cmd.addParameter("@P_ASSUMPT_OVRD_1", pAssumptOvrd1);
//			cmd.addParameter("@P_ASSUMPT_OVRD_2", pAssumptOvrd2);
//			cmd.addParameter("@P_ASSUMPT_OVRD_3", pAssumptOvrd3);
//			cmd.addParameter("@P_ASSUMPT_OVRD_4", pAssumptOvrd4);
//			cmd.addParameter("@P_ASSUMPT_OVRD_5", pAssumptOvrd5);
//			cmd.addParameter("@P_ASSUMPT_OVRD_6", pAssumptOvrd6);
//			cmd.addParameter("@P_ASSUMPT_OVRD_7", pAssumptOvrd7);
//			cmd.addParameter("@P_ASSUMPT_OVRD_8", pAssumptOvrd8);
//			cmd.addParameter("@P_ASSUMPT_OVRD_9", pAssumptOvrd9);
//			cmd.addParameter("@P_ATTEND_SAME_COLL", pAttendSameColl);
//			cmd.addParameter("@P_BUS_DBT", pBusDbt);
//			cmd.addParameter("@P_BUS_VAL", pBusVal);
//			cmd.addParameter("@P_C_SIGNED", pCSigned);
//			cmd.addParameter("@P_C_SIGNED_FATH", pCSignedFath);
//			cmd.addParameter("@P_C_SIGNED_MOTH", pCSignedMoth);
//			cmd.addParameter("@P_C_SIGNED_MTH_DAY", pCSignedMthDay);
//			cmd.addParameter("@P_C_SIGNED_PAR", pCSignedPar);
//			cmd.addParameter("@P_C_SIGNED_SPS", pCSignedSps);
//			cmd.addParameter("@P_C_SIGNED_YR", pCSignedYr);
//			cmd.addParameter("@P_CASH_CHK", pCashChk);
//			cmd.addParameter("@P_CHILD_CARE", pChildCare);
//			cmd.addParameter("@P_CHILD_SUPP_PAID", pChildSuppPaid);
//			cmd.addParameter("@P_DEGREE_TYPE", pDegreeType);
//			cmd.addParameter("@P_EFC_MATCH", pEfcMatch);
//			cmd.addParameter("@P_ESTIMATE_FLAGS", pEstimateFlags);
//			cmd.addParameter("@P_FAA_DEP_OVERRIDE", pFaaDepOverride);
//			cmd.addParameter("@P_FAA_SIGNATURE", pFaaSignature);
//			cmd.addParameter("@P_FAA_TITLE_IV_CODE", pFaaTitleIvCode);
//			cmd.addParameter("@P_FAF_FAFSA_DATA", pFafFafsaData);
//			cmd.addParameter("@P_FAF_RCPT_DATE", pFafRcptDate);
//			cmd.addParameter("@P_FARM_DBT", pFarmDbt);
//			cmd.addParameter("@P_FARM_VAL", pFarmVal);
//			cmd.addParameter("@P_FATHER_AGE", pFatherAge);
//			cmd.addParameter("@P_FATHER_HI_GRADE", pFatherHiGrade);
//			cmd.addParameter("@P_FED_COLL_CHOICE_4", pFedCollChoice4);
//			cmd.addParameter("@P_FED_COLL_CHOICE_5", pFedCollChoice5);
//			cmd.addParameter("@P_FED_COLL_CHOICE_6", pFedCollChoice6);
//			cmd.addParameter("@P_GA_MATCH_FLAG", pGaMatchFlag);
//			cmd.addParameter("@P_GED_MTH_YR", pGedMthYr);
//			cmd.addParameter("@P_GRAD_OR_PROF", pGradOrProf);
//			cmd.addParameter("@P_HS_GRAD_MTH_YR", pHsGradMthYr);
//			cmd.addParameter("@P_INVEST_DBT", pInvestDbt);
//			cmd.addParameter("@P_INVEST_VAL", pInvestVal);
//			cmd.addParameter("@P_LIVE_ON_FARM", pLiveOnFarm);
//			cmd.addParameter("@P_MARRIED", pMarried);
//			cmd.addParameter("@P_MOTHER_AGE", pMotherAge);
//			cmd.addParameter("@P_MOTHER_HI_GRADE", pMotherHiGrade);
//			cmd.addParameter("@P_MSG_52", pMsg52);
//			cmd.addParameter("@P_MSG_91_SEC_FM_EFC", pMsg91SecFmEfc);
//			cmd.addParameter("@P_P_RES_DATE", pPResDate);
//			cmd.addParameter("@P_PAR_ALT_HME_VAL", pParAltHmeVal);
//			cmd.addParameter("@P_PAR_ALT_HME_VAL_CAP", pParAltHmeValCap);
//			cmd.addParameter("@P_PAR_BUS_DBT", pParBusDbt);
//			cmd.addParameter("@P_PAR_BUS_VAL", pParBusVal);
//			cmd.addParameter("@P_PAR_CASH_CHK", pParCashChk);
//			cmd.addParameter("@P_PAR_CHILD_SUPP_PAID", pParChildSuppPaid);
//			cmd.addParameter("@P_PAR_EIC", pParEic);
//			cmd.addParameter("@P_PAR_FARM_DBT", pParFarmDbt);
//			cmd.addParameter("@P_PAR_FARM_VAL", pParFarmVal);
//			cmd.addParameter("@P_PAR_FOR_INC_EXCL", pParForIncExcl);
//			cmd.addParameter("@P_PAR_HOUSE_FOOD_OTH", pParHouseFoodOth);
//			cmd.addParameter("@P_PAR_INC_BENEFITS", pParIncBenefits);
//			cmd.addParameter("@P_PAR_INVEST_DBT", pParInvestDbt);
//			cmd.addParameter("@P_PAR_INVEST_VAL", pParInvestVal);
//			cmd.addParameter("@P_PAR_IRA_KEOUGH", pParIraKeough);
//			cmd.addParameter("@P_PAR_LIVE_ON_FARM", pParLiveOnFarm);
//			cmd.addParameter("@P_PAR_MTH_MORT_RENT_PAY", pParMthMortRentPay);
//			cmd.addParameter("@P_PAR_PORTION_OF_PENS", pParPortionOfPens);
//			cmd.addParameter("@P_PAR_RE_DBT", pParReDbt);
//			cmd.addParameter("@P_PAR_RE_VAL", pParReVal);
//			cmd.addParameter("@P_PAR_SPEC_FUELS", pParSpecFuels);
//			cmd.addParameter("@P_PAR_TAX_DEF_PENSION", pParTaxDefPension);
//			cmd.addParameter("@P_PAR_TE_INT_INC", pParTeIntInc);
//			cmd.addParameter("@P_PIN", pPin);
//			cmd.addParameter("@P_PREPARER_EIN", pPreparerEin);
//			cmd.addParameter("@P_PREPARER_SIGN", pPreparerSign);
//			cmd.addParameter("@P_PREPARER_SSN", pPreparerSsn);
//			cmd.addParameter("@P_PREV_COLL5", pPrevColl5);
//			cmd.addParameter("@P_RE_DBT", pReDbt);
//			cmd.addParameter("@P_RE_VAL", pReVal);
//			cmd.addParameter("@P_REJECT_OVRD_1", pRejectOvrd1);
//			cmd.addParameter("@P_REJECT_OVRD_2", pRejectOvrd2);
//			cmd.addParameter("@P_REJECT_OVRD_3", pRejectOvrd3);
//			cmd.addParameter("@P_REJECT_OVRD_4", pRejectOvrd4);
//			cmd.addParameter("@P_REJECT_OVRD_5", pRejectOvrd5);
//			cmd.addParameter("@P_REJECT_OVRD_6", pRejectOvrd6);
//			cmd.addParameter("@P_REJECT_OVRD_7", pRejectOvrd7);
//			cmd.addParameter("@P_S_MAR_MTH_YR", pSMarMthYr);
//			cmd.addParameter("@P_SAR_C_FLAG", pSarCFlag);
//			cmd.addParameter("@P_SELF_HELP_VALUE", pSelfHelpValue);
//			cmd.addParameter("@P_SOC_SEC", pSocSec);
//			cmd.addParameter("@P_STU_ALT_NO_IN_COLL", pStuAltNoInColl);
//			cmd.addParameter("@P_YR_IN_COLL_2", pYrInColl2);
//			cmd.addParameter("@P_ADJ_EFC_CALC_REQ", pAdjEfcCalcReq);
//			cmd.addParameter("@P_FAA_ADJ_EFC_CORR", pFaaAdjEfcCorr);
//			cmd.addParameter("@P_EFC_RECALC_CORR_REQ", pEfcRecalcCorrReq);
//			cmd.addParameter("@P_S_RES_DATE", pSResDate);
//			cmd.addParameter("@P_OFFL_UNOFFL_IND", pOfflUnofflInd);
//			cmd.addParameter("@P_ASSUMPTION_MSG_7", pAssumptionMsg7);
//			cmd.addParameter("@P_ASSUMPTION_MSG_8", pAssumptionMsg8);
//			cmd.addParameter("@P_ASSUMPTION_MSG_9", pAssumptionMsg9);
//			cmd.addParameter("@P_ASSUMPTION_MSG_10", pAssumptionMsg10);
//			cmd.addParameter("@P_PHEAA_GRANT_AMT_1", pPheaaGrantAmt1);
//			cmd.addParameter("@P_PHEAA_GRANT_AMT_2", pPheaaGrantAmt2);
//			cmd.addParameter("@P_PHEAA_GRANT_AMT_3", pPheaaGrantAmt3);
//			cmd.addParameter("@P_PHEAA_GRANT_AMT_4", pPheaaGrantAmt4);
//			cmd.addParameter("@P_PHEAA_GRANT_CDE_1", pPheaaGrantCde1);
//			cmd.addParameter("@P_PHEAA_GRANT_CDE_2", pPheaaGrantCde2);
//			cmd.addParameter("@P_PHEAA_GRANT_CDE_3", pPheaaGrantCde3);
//			cmd.addParameter("@P_PHEAA_GRANT_CDE_4", pPheaaGrantCde4);
//			cmd.addParameter("@P_PAR_DEP_CARE_AND_MED", pParDepCareAndMed);
//			cmd.addParameter("@P_REJECT_OVRD_A", pRejectOvrdA);
//			cmd.addParameter("@P_REJECT_OVRD_C", pRejectOvrdC);
//			cmd.addParameter("@P_PAR_MAR_MTH_YR", pParMarMthYr);
//			cmd.addParameter("@P_PAR_TUI_FEE_DED", pParTuiFeeDed);
//			cmd.addParameter("@P_FATH_SSN_MATCH", pFathSsnMatch);
//			cmd.addParameter("@P_MOTH_SSN_MATCH", pMothSsnMatch);
//			cmd.addParameter("@P_REJECT_OVRD_G", pRejectOvrdG);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_REJECT_OVRD_12", pRejectOvrd12);
//			cmd.addParameter("@P_REJECT_OVRD_J", pRejectOvrdJ);
//			cmd.addParameter("@P_REJECT_OVRD_K", pRejectOvrdK);
//			cmd.addParameter("@P_FED_COLL_CHOICE_7", pFedCollChoice7);
//			cmd.addParameter("@P_FED_COLL_CHOICE_8", pFedCollChoice8);
//			cmd.addParameter("@P_FED_COLL_CHOICE_9", pFedCollChoice9);
//			cmd.addParameter("@P_FED_COLL_CHOICE_10", pFedCollChoice10);
//			cmd.addParameter("@P_REJECT_OVRD_B", pRejectOvrdB);
//			cmd.addParameter("@P_REJECT_OVRD_N", pRejectOvrdN);
//			cmd.addParameter("@P_REJECT_OVRD_W", pRejectOvrdW);
//			cmd.addParameter("@P_REJECT_OVRD_20", pRejectOvrd20);
//			cmd.addParameter("@P_TEACH_COURSEWORK", pTeachCoursework);
//			cmd.addParameter("@P_EDUC_CREDITS", pEducCredits);
//			cmd.addParameter("@P_NEED_BASED_EMPLOY", pNeedBasedEmploy);
//			cmd.addParameter("@P_GRANT_SCHOLAR_AID", pGrantScholarAid);
//			cmd.addParameter("@P_PAR_EDUC_CREDITS", pParEducCredits);
//			cmd.addParameter("@P_PAR_NEED_BASED_EMPLOY", pParNeedBasedEmploy);
//			cmd.addParameter("@P_PAR_GRANT_SCHOLAR_AID", pParGrantScholarAid);
//			cmd.addParameter("@P_SPEC_CIRCUM_FLG", pSpecCircumFlg);
//			cmd.addParameter("@P_TAX_DEF_PENSION", pTaxDefPension);
//			cmd.addParameter("@P_TE_INT_INC", pTeIntInc);
//			cmd.addParameter("@P_HOUSE_FOOD_OTH", pHouseFoodOth);
//			cmd.addParameter("@P_CO_OP_EARNINGS", pCoOpEarnings);
//			cmd.addParameter("@P_PAR_CO_OP_EARNINGS", pParCoOpEarnings);
//			cmd.addParameter("@P_IRS_REQUEST_FLAG", pIrsRequestFlag);
//			cmd.addParameter("@P_PAR_IRS_REQUEST_FLAG", pParIrsRequestFlag);
//			cmd.addParameter("@P_REJECT_OVRD_21", pRejectOvrd21);
//			cmd.addParameter("@P_IRS_AGI_FLAG", pIrsAgiFlag);
//			cmd.addParameter("@P_PAR_IRS_AGI_FLAG", pParIrsAgiFlag);
//			cmd.addParameter("@P_IRS_FIT_FLAG", pIrsFitFlag);
//			cmd.addParameter("@P_PAR_IRS_FIT_FLAG", pParIrsFitFlag);
//			cmd.addParameter("@P_ROWID", pRowid);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	@DbRecordType(id="TempAppP3RecRow", dataSourceName="TEMP_APP_P3_REC")
	public static class TempAppP3RecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_INFC_CODE")
		public NString RInfcCode;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_C_INST_1_UNASSESS_VA")
		public NNumber RCInst1UnassessVa;
		@DbRecordField(dataSourceName="R_C_INST_2_UNASSESS_VA")
		public NNumber RCInst2UnassessVa;
		@DbRecordField(dataSourceName="R_C_INST_3_UNASSESS_VA")
		public NNumber RCInst3UnassessVa;
		@DbRecordField(dataSourceName="R_C_1_ALT_CTRB")
		public NNumber RC1AltCtrb;
		@DbRecordField(dataSourceName="R_C_2_ALT_CTRB")
		public NNumber RC2AltCtrb;
		@DbRecordField(dataSourceName="R_PELL_1_ALT_CTRB")
		public NNumber RPell1AltCtrb;
		@DbRecordField(dataSourceName="R_PELL_2_ALT_CTRB")
		public NNumber RPell2AltCtrb;
		@DbRecordField(dataSourceName="R_C_PAR_1_ALT_CTRB")
		public NNumber RCPar1AltCtrb;
		@DbRecordField(dataSourceName="R_C_PAR_2_ALT_CTRB")
		public NNumber RCPar2AltCtrb;
		@DbRecordField(dataSourceName="R_PELL_1_ALT_PGI")
		public NNumber RPell1AltPgi;
		@DbRecordField(dataSourceName="R_PELL_2_ALT_PGI")
		public NNumber RPell2AltPgi;
		@DbRecordField(dataSourceName="R_PAR_1_ALT_AGI")
		public NNumber RPar1AltAgi;
		@DbRecordField(dataSourceName="R_PAR_2_ALT_AGI")
		public NNumber RPar2AltAgi;
		@DbRecordField(dataSourceName="R_PAR_ALT_MRTL_STATUS")
		public NString RParAltMrtlStatus;
		@DbRecordField(dataSourceName="R_PAR_ALT_FAM_SIZE")
		public NNumber RParAltFamSize;
		@DbRecordField(dataSourceName="R_PAR_ALT_NO_IN_COLL")
		public NString RParAltNoInColl;
		@DbRecordField(dataSourceName="R_ALT_OPT_LOSS_TO_ZERO")
		public NString RAltOptLossToZero;
		@DbRecordField(dataSourceName="R_ALT_OPT_HME_VAL")
		public NString RAltOptHmeVal;
		@DbRecordField(dataSourceName="R_ALT_OPT_PAR_IN_COLL")
		public NString RAltOptParInColl;
		@DbRecordField(dataSourceName="R_MSG_91")
		public NString RMsg91;
		@DbRecordField(dataSourceName="R_MSG_91_BUDG_1")
		public NString RMsg91Budg1;
		@DbRecordField(dataSourceName="R_MSG_91_BUDG_2")
		public NString RMsg91Budg2;
		@DbRecordField(dataSourceName="R_MSG_91_BUDG_3")
		public NString RMsg91Budg3;
		@DbRecordField(dataSourceName="R_MSG_73_TAX")
		public NString RMsg73Tax;
		@DbRecordField(dataSourceName="R_C_1_CTRB_ADJ_1_8_MTH")
		public NNumber RC1CtrbAdj18Mth;
		@DbRecordField(dataSourceName="R_C_2_CTRB_ADJ_1_8_MTH")
		public NNumber RC2CtrbAdj18Mth;
		@DbRecordField(dataSourceName="R_C_1_CTRB_ADJ_OVR_9_MTH")
		public NNumber RC1CtrbAdjOvr9Mth;
		@DbRecordField(dataSourceName="R_C_2_CTRB_ADJ_OVR_9_MTH")
		public NNumber RC2CtrbAdjOvr9Mth;
		@DbRecordField(dataSourceName="R_REJ_REASON_PRTY_1")
		public NString RRejReasonPrty1;
		@DbRecordField(dataSourceName="R_REJ_REASON_PRTY_2")
		public NString RRejReasonPrty2;
		@DbRecordField(dataSourceName="R_REJ_REASON_PRTY_3")
		public NString RRejReasonPrty3;
		@DbRecordField(dataSourceName="R_REJ_REASON_PRTY_4")
		public NString RRejReasonPrty4;
		@DbRecordField(dataSourceName="R_REJ_REASON_PRTY_5")
		public NString RRejReasonPrty5;
		@DbRecordField(dataSourceName="R_REJ_REASON_PRTY_6")
		public NString RRejReasonPrty6;
		@DbRecordField(dataSourceName="R_REJ_REASON_PRTY_7")
		public NString RRejReasonPrty7;
		@DbRecordField(dataSourceName="R_REJ_REASON_PRTY_8")
		public NString RRejReasonPrty8;
		@DbRecordField(dataSourceName="R_REJ_REASON_PRTY_9")
		public NString RRejReasonPrty9;
		@DbRecordField(dataSourceName="R_REJ_REASON_PRTY_10")
		public NString RRejReasonPrty10;
		@DbRecordField(dataSourceName="R_REJ_REASON_PRTY_11")
		public NString RRejReasonPrty11;
		@DbRecordField(dataSourceName="R_REJ_REASON_PRTY_12")
		public NString RRejReasonPrty12;
		@DbRecordField(dataSourceName="R_REJ_REASON_PRTY_13")
		public NString RRejReasonPrty13;
		@DbRecordField(dataSourceName="R_REJ_REASON_PRTY_14")
		public NString RRejReasonPrty14;
		@DbRecordField(dataSourceName="R_REJ_IN_ANALYSIS_FLAG")
		public NString RRejInAnalysisFlag;
		@DbRecordField(dataSourceName="R_MSG_0")
		public NString RMsg0;
		@DbRecordField(dataSourceName="R_MSG_1")
		public NString RMsg1;
		@DbRecordField(dataSourceName="R_MSG_2")
		public NString RMsg2;
		@DbRecordField(dataSourceName="R_MSG_3")
		public NString RMsg3;
		@DbRecordField(dataSourceName="R_MSG_4")
		public NString RMsg4;
		@DbRecordField(dataSourceName="R_MSG_5")
		public NString RMsg5;
		@DbRecordField(dataSourceName="R_MSG_6")
		public NString RMsg6;
		@DbRecordField(dataSourceName="R_MSG_11")
		public NString RMsg11;
		@DbRecordField(dataSourceName="R_MSG_12")
		public NString RMsg12;
		@DbRecordField(dataSourceName="R_MSG_13")
		public NString RMsg13;
		@DbRecordField(dataSourceName="R_MSG_14")
		public NString RMsg14;
		@DbRecordField(dataSourceName="R_MSG_15")
		public NString RMsg15;
		@DbRecordField(dataSourceName="R_MSG_21")
		public NString RMsg21;
		@DbRecordField(dataSourceName="R_MSG_22")
		public NString RMsg22;
		@DbRecordField(dataSourceName="R_MSG_23")
		public NString RMsg23;
		@DbRecordField(dataSourceName="R_MSG_24")
		public NString RMsg24;
		@DbRecordField(dataSourceName="R_MSG_26")
		public NString RMsg26;
		@DbRecordField(dataSourceName="R_MSG_27")
		public NString RMsg27;
		@DbRecordField(dataSourceName="R_MSG_28")
		public NString RMsg28;
		@DbRecordField(dataSourceName="R_MSG_29")
		public NString RMsg29;
		@DbRecordField(dataSourceName="R_MSG_30")
		public NString RMsg30;
		@DbRecordField(dataSourceName="R_MSG_32")
		public NString RMsg32;
		@DbRecordField(dataSourceName="R_MSG_33")
		public NString RMsg33;
		@DbRecordField(dataSourceName="R_MSG_34")
		public NString RMsg34;
		@DbRecordField(dataSourceName="R_MSG_46")
		public NString RMsg46;
		@DbRecordField(dataSourceName="R_MSG_47")
		public NString RMsg47;
		@DbRecordField(dataSourceName="R_MSG_48")
		public NString RMsg48;
		@DbRecordField(dataSourceName="R_MSG_49")
		public NString RMsg49;
		@DbRecordField(dataSourceName="R_MSG_50")
		public NString RMsg50;
		@DbRecordField(dataSourceName="R_MSG_61")
		public NString RMsg61;
		@DbRecordField(dataSourceName="R_MSG_62")
		public NString RMsg62;
		@DbRecordField(dataSourceName="R_MSG_63")
		public NString RMsg63;
		@DbRecordField(dataSourceName="R_MSG_64")
		public NString RMsg64;
		@DbRecordField(dataSourceName="R_MSG_65")
		public NString RMsg65;
		@DbRecordField(dataSourceName="R_MSG_66")
		public NString RMsg66;
		@DbRecordField(dataSourceName="R_MSG_67")
		public NString RMsg67;
		@DbRecordField(dataSourceName="R_MSG_68")
		public NString RMsg68;
		@DbRecordField(dataSourceName="R_MSG_71")
		public NString RMsg71;
		@DbRecordField(dataSourceName="R_MSG_73")
		public NString RMsg73;
		@DbRecordField(dataSourceName="R_MSG_74")
		public NString RMsg74;
		@DbRecordField(dataSourceName="R_MSG_75")
		public NString RMsg75;
		@DbRecordField(dataSourceName="R_MSG_76")
		public NString RMsg76;
		@DbRecordField(dataSourceName="R_MSG_77")
		public NString RMsg77;
		@DbRecordField(dataSourceName="R_MSG_78")
		public NString RMsg78;
		@DbRecordField(dataSourceName="R_MSG_79")
		public NString RMsg79;
		@DbRecordField(dataSourceName="R_MSG_80")
		public NString RMsg80;
		@DbRecordField(dataSourceName="R_MSG_81")
		public NString RMsg81;
		@DbRecordField(dataSourceName="R_MSG_82")
		public NString RMsg82;
		@DbRecordField(dataSourceName="R_MSG_90")
		public NString RMsg90;
		@DbRecordField(dataSourceName="R_MSG_92")
		public NString RMsg92;
		@DbRecordField(dataSourceName="R_MSG_93")
		public NString RMsg93;
		@DbRecordField(dataSourceName="R_MSG_94")
		public NString RMsg94;
		@DbRecordField(dataSourceName="R_MSG_95")
		public NString RMsg95;
		@DbRecordField(dataSourceName="R_MSG_96")
		public NString RMsg96;
		@DbRecordField(dataSourceName="R_MSG_97")
		public NString RMsg97;
		@DbRecordField(dataSourceName="R_MSG_98")
		public NString RMsg98;
		@DbRecordField(dataSourceName="R_MSG_99")
		public NString RMsg99;
		@DbRecordField(dataSourceName="R_MSG_11_PAR_FAM_MEMB")
		public NString RMsg11ParFamMemb;
		@DbRecordField(dataSourceName="R_MSG_12_PAR_NO_IN_COLL")
		public NString RMsg12ParNoInColl;
		@DbRecordField(dataSourceName="R_MSG_22_PAR_DER_AGI")
		public NNumber RMsg22ParDerAgi;
		@DbRecordField(dataSourceName="R_MSG_27_VAL")
		public NNumber RMsg27Val;
		@DbRecordField(dataSourceName="R_MSG_47_PAR_HME_VAL")
		public NNumber RMsg47ParHmeVal;
		@DbRecordField(dataSourceName="R_MSG_48_PAR_HME_VAL_3")
		public NNumber RMsg48ParHmeVal3;
		@DbRecordField(dataSourceName="R_MSG_48_PAR_HME_EQTY_3")
		public NNumber RMsg48ParHmeEqty3;
		@DbRecordField(dataSourceName="R_MSG_49_PAR_HME_VAL")
		public NNumber RMsg49ParHmeVal;
		@DbRecordField(dataSourceName="R_MSG_49_PAR_HME_EQTY")
		public NNumber RMsg49ParHmeEqty;
		@DbRecordField(dataSourceName="R_MSG_63_FAM_MEMB")
		public NString RMsg63FamMemb;
		@DbRecordField(dataSourceName="R_MSG_64_NO_IN_COLL")
		public NString RMsg64NoInColl;
		@DbRecordField(dataSourceName="R_MSG_81_AVAIL_INC")
		public NNumber RMsg81AvailInc;
		@DbRecordField(dataSourceName="R_MSG_90_INC")
		public NNumber RMsg90Inc;
		@DbRecordField(dataSourceName="R_MSG_90_SMA")
		public NNumber RMsg90Sma;
		@DbRecordField(dataSourceName="R_MSG_90_DIFF")
		public NNumber RMsg90Diff;
		@DbRecordField(dataSourceName="R_MSG_92_BUDG_1")
		public NNumber RMsg92Budg1;
		@DbRecordField(dataSourceName="R_MSG_92_BUDG_2")
		public NNumber RMsg92Budg2;
		@DbRecordField(dataSourceName="R_MSG_92_BUDG_3")
		public NNumber RMsg92Budg3;
		@DbRecordField(dataSourceName="R_MSG_93_CALC")
		public NNumber RMsg93Calc;
		@DbRecordField(dataSourceName="R_MSG_93_RESC")
		public NNumber RMsg93Resc;
		@DbRecordField(dataSourceName="R_PAR_1_ALT_FED_TAX")
		public NNumber RPar1AltFedTax;
		@DbRecordField(dataSourceName="R_PAR_2_ALT_FED_TAX")
		public NNumber RPar2AltFedTax;
		@DbRecordField(dataSourceName="R_MSG_0_FED_1_FAM_CTRB")
		public NString RMsg0Fed1FamCtrb;
		@DbRecordField(dataSourceName="R_MSG_0_FED_2_FAM_CTRB")
		public NString RMsg0Fed2FamCtrb;
		@DbRecordField(dataSourceName="R_MSG_0_FED_1_PGI")
		public NString RMsg0Fed1Pgi;
		@DbRecordField(dataSourceName="R_MSG_0_FED_2_PGI")
		public NString RMsg0Fed2Pgi;
		@DbRecordField(dataSourceName="R_ASSUMPTION_MSG_1")
		public NString RAssumptionMsg1;
		@DbRecordField(dataSourceName="R_ASSUMPTION_MSG_2")
		public NString RAssumptionMsg2;
		@DbRecordField(dataSourceName="R_ASSUMPTION_MSG_3")
		public NString RAssumptionMsg3;
		@DbRecordField(dataSourceName="R_ASSUMPTION_MSG_4")
		public NString RAssumptionMsg4;
		@DbRecordField(dataSourceName="R_ASSUMPTION_MSG_5")
		public NString RAssumptionMsg5;
		@DbRecordField(dataSourceName="R_ASSUMPTION_MSG_6")
		public NString RAssumptionMsg6;
		@DbRecordField(dataSourceName="R_MSG_51")
		public NString RMsg51;
		@DbRecordField(dataSourceName="R_MSG_51_VAL")
		public NNumber RMsg51Val;
		@DbRecordField(dataSourceName="R_MSG_83")
		public NString RMsg83;
		@DbRecordField(dataSourceName="R_MSG_84")
		public NString RMsg84;
		@DbRecordField(dataSourceName="R_MSG_85")
		public NString RMsg85;
		@DbRecordField(dataSourceName="R_MSG_85_VAL")
		public NNumber RMsg85Val;
		@DbRecordField(dataSourceName="R_ASSUMPT_OVRD_1")
		public NString RAssumptOvrd1;
		@DbRecordField(dataSourceName="R_ASSUMPT_OVRD_2")
		public NString RAssumptOvrd2;
		@DbRecordField(dataSourceName="R_ASSUMPT_OVRD_3")
		public NString RAssumptOvrd3;
		@DbRecordField(dataSourceName="R_ASSUMPT_OVRD_4")
		public NString RAssumptOvrd4;
		@DbRecordField(dataSourceName="R_ASSUMPT_OVRD_5")
		public NString RAssumptOvrd5;
		@DbRecordField(dataSourceName="R_ASSUMPT_OVRD_6")
		public NString RAssumptOvrd6;
		@DbRecordField(dataSourceName="R_ASSUMPT_OVRD_7")
		public NString RAssumptOvrd7;
		@DbRecordField(dataSourceName="R_ASSUMPT_OVRD_8")
		public NString RAssumptOvrd8;
		@DbRecordField(dataSourceName="R_ASSUMPT_OVRD_9")
		public NString RAssumptOvrd9;
		@DbRecordField(dataSourceName="R_ATTEND_SAME_COLL")
		public NString RAttendSameColl;
		@DbRecordField(dataSourceName="R_BUS_DBT")
		public NNumber RBusDbt;
		@DbRecordField(dataSourceName="R_BUS_VAL")
		public NNumber RBusVal;
		@DbRecordField(dataSourceName="R_C_SIGNED")
		public NString RCSigned;
		@DbRecordField(dataSourceName="R_C_SIGNED_FATH")
		public NString RCSignedFath;
		@DbRecordField(dataSourceName="R_C_SIGNED_MOTH")
		public NString RCSignedMoth;
		@DbRecordField(dataSourceName="R_C_SIGNED_MTH_DAY")
		public NString RCSignedMthDay;
		@DbRecordField(dataSourceName="R_C_SIGNED_PAR")
		public NString RCSignedPar;
		@DbRecordField(dataSourceName="R_C_SIGNED_SPS")
		public NString RCSignedSps;
		@DbRecordField(dataSourceName="R_C_SIGNED_YR")
		public NString RCSignedYr;
		@DbRecordField(dataSourceName="R_CASH_CHK")
		public NNumber RCashChk;
		@DbRecordField(dataSourceName="R_CHILD_CARE")
		public NNumber RChildCare;
		@DbRecordField(dataSourceName="R_CHILD_SUPP_PAID")
		public NNumber RChildSuppPaid;
		@DbRecordField(dataSourceName="R_DEGREE_TYPE")
		public NString RDegreeType;
		@DbRecordField(dataSourceName="R_EFC_MATCH")
		public NString REfcMatch;
		@DbRecordField(dataSourceName="R_ESTIMATE_FLAGS")
		public NString REstimateFlags;
		@DbRecordField(dataSourceName="R_FAA_DEP_OVERRIDE")
		public NString RFaaDepOverride;
		@DbRecordField(dataSourceName="R_FAA_SIGNATURE")
		public NString RFaaSignature;
		@DbRecordField(dataSourceName="R_FAA_TITLE_IV_CODE")
		public NString RFaaTitleIvCode;
		@DbRecordField(dataSourceName="R_FAF_FAFSA_DATA")
		public NString RFafFafsaData;
		@DbRecordField(dataSourceName="R_FAF_RCPT_DATE")
		public NDate RFafRcptDate;
		@DbRecordField(dataSourceName="R_FARM_DBT")
		public NNumber RFarmDbt;
		@DbRecordField(dataSourceName="R_FARM_VAL")
		public NNumber RFarmVal;
		@DbRecordField(dataSourceName="R_FATHER_AGE")
		public NString RFatherAge;
		@DbRecordField(dataSourceName="R_FATHER_HI_GRADE")
		public NString RFatherHiGrade;
		@DbRecordField(dataSourceName="R_FED_COLL_CHOICE_4")
		public NString RFedCollChoice4;
		@DbRecordField(dataSourceName="R_FED_COLL_CHOICE_5")
		public NString RFedCollChoice5;
		@DbRecordField(dataSourceName="R_FED_COLL_CHOICE_6")
		public NString RFedCollChoice6;
		@DbRecordField(dataSourceName="R_GA_MATCH_FLAG")
		public NString RGaMatchFlag;
		@DbRecordField(dataSourceName="R_GED_MTH_YR")
		public NString RGedMthYr;
		@DbRecordField(dataSourceName="R_GRAD_OR_PROF")
		public NString RGradOrProf;
		@DbRecordField(dataSourceName="R_HS_GRAD_MTH_YR")
		public NString RHsGradMthYr;
		@DbRecordField(dataSourceName="R_INVEST_DBT")
		public NNumber RInvestDbt;
		@DbRecordField(dataSourceName="R_INVEST_VAL")
		public NNumber RInvestVal;
		@DbRecordField(dataSourceName="R_LIVE_ON_FARM")
		public NString RLiveOnFarm;
		@DbRecordField(dataSourceName="R_MARRIED")
		public NString RMarried;
		@DbRecordField(dataSourceName="R_MOTHER_AGE")
		public NString RMotherAge;
		@DbRecordField(dataSourceName="R_MOTHER_HI_GRADE")
		public NString RMotherHiGrade;
		@DbRecordField(dataSourceName="R_MSG_52")
		public NString RMsg52;
		@DbRecordField(dataSourceName="R_MSG_91_SEC_FM_EFC")
		public NNumber RMsg91SecFmEfc;
		@DbRecordField(dataSourceName="R_P_RES_DATE")
		public NDate RPResDate;
		@DbRecordField(dataSourceName="R_PAR_ALT_HME_VAL")
		public NNumber RParAltHmeVal;
		@DbRecordField(dataSourceName="R_PAR_ALT_HME_VAL_CAP")
		public NNumber RParAltHmeValCap;
		@DbRecordField(dataSourceName="R_PAR_BUS_DBT")
		public NNumber RParBusDbt;
		@DbRecordField(dataSourceName="R_PAR_BUS_VAL")
		public NNumber RParBusVal;
		@DbRecordField(dataSourceName="R_PAR_CASH_CHK")
		public NNumber RParCashChk;
		@DbRecordField(dataSourceName="R_PAR_CHILD_SUPP_PAID")
		public NNumber RParChildSuppPaid;
		@DbRecordField(dataSourceName="R_PAR_EIC")
		public NNumber RParEic;
		@DbRecordField(dataSourceName="R_PAR_FARM_DBT")
		public NNumber RParFarmDbt;
		@DbRecordField(dataSourceName="R_PAR_FARM_VAL")
		public NNumber RParFarmVal;
		@DbRecordField(dataSourceName="R_PAR_FOR_INC_EXCL")
		public NNumber RParForIncExcl;
		@DbRecordField(dataSourceName="R_PAR_HOUSE_FOOD_OTH")
		public NNumber RParHouseFoodOth;
		@DbRecordField(dataSourceName="R_PAR_INC_BENEFITS")
		public NNumber RParIncBenefits;
		@DbRecordField(dataSourceName="R_PAR_INVEST_DBT")
		public NNumber RParInvestDbt;
		@DbRecordField(dataSourceName="R_PAR_INVEST_VAL")
		public NNumber RParInvestVal;
		@DbRecordField(dataSourceName="R_PAR_IRA_KEOUGH")
		public NNumber RParIraKeough;
		@DbRecordField(dataSourceName="R_PAR_LIVE_ON_FARM")
		public NString RParLiveOnFarm;
		@DbRecordField(dataSourceName="R_PAR_MTH_MORT_RENT_PAY")
		public NNumber RParMthMortRentPay;
		@DbRecordField(dataSourceName="R_PAR_PORTION_OF_PENS")
		public NNumber RParPortionOfPens;
		@DbRecordField(dataSourceName="R_PAR_RE_DBT")
		public NNumber RParReDbt;
		@DbRecordField(dataSourceName="R_PAR_RE_VAL")
		public NNumber RParReVal;
		@DbRecordField(dataSourceName="R_PAR_SPEC_FUELS")
		public NNumber RParSpecFuels;
		@DbRecordField(dataSourceName="R_PAR_TAX_DEF_PENSION")
		public NNumber RParTaxDefPension;
		@DbRecordField(dataSourceName="R_PAR_TE_INT_INC")
		public NNumber RParTeIntInc;
		@DbRecordField(dataSourceName="R_PIN")
		public NString RPin;
		@DbRecordField(dataSourceName="R_PREPARER_EIN")
		public NString RPreparerEin;
		@DbRecordField(dataSourceName="R_PREPARER_SIGN")
		public NString RPreparerSign;
		@DbRecordField(dataSourceName="R_PREPARER_SSN")
		public NString RPreparerSsn;
		@DbRecordField(dataSourceName="R_PREV_COLL5")
		public NString RPrevColl5;
		@DbRecordField(dataSourceName="R_RE_DBT")
		public NNumber RReDbt;
		@DbRecordField(dataSourceName="R_RE_VAL")
		public NNumber RReVal;
		@DbRecordField(dataSourceName="R_REJECT_OVRD_1")
		public NString RRejectOvrd1;
		@DbRecordField(dataSourceName="R_REJECT_OVRD_2")
		public NString RRejectOvrd2;
		@DbRecordField(dataSourceName="R_REJECT_OVRD_3")
		public NString RRejectOvrd3;
		@DbRecordField(dataSourceName="R_REJECT_OVRD_4")
		public NString RRejectOvrd4;
		@DbRecordField(dataSourceName="R_REJECT_OVRD_5")
		public NString RRejectOvrd5;
		@DbRecordField(dataSourceName="R_REJECT_OVRD_6")
		public NString RRejectOvrd6;
		@DbRecordField(dataSourceName="R_REJECT_OVRD_7")
		public NString RRejectOvrd7;
		@DbRecordField(dataSourceName="R_S_MAR_MTH_YR")
		public NString RSMarMthYr;
		@DbRecordField(dataSourceName="R_SAR_C_FLAG")
		public NString RSarCFlag;
		@DbRecordField(dataSourceName="R_SELF_HELP_VALUE")
		public NNumber RSelfHelpValue;
		@DbRecordField(dataSourceName="R_SOC_SEC")
		public NString RSocSec;
		@DbRecordField(dataSourceName="R_STU_ALT_NO_IN_COLL")
		public NNumber RStuAltNoInColl;
		@DbRecordField(dataSourceName="R_YR_IN_COLL_2")
		public NString RYrInColl2;
		@DbRecordField(dataSourceName="R_ADJ_EFC_CALC_REQ")
		public NString RAdjEfcCalcReq;
		@DbRecordField(dataSourceName="R_FAA_ADJ_EFC_CORR")
		public NNumber RFaaAdjEfcCorr;
		@DbRecordField(dataSourceName="R_EFC_RECALC_CORR_REQ")
		public NString REfcRecalcCorrReq;
		@DbRecordField(dataSourceName="R_S_RES_DATE")
		public NDate RSResDate;
		@DbRecordField(dataSourceName="R_OFFL_UNOFFL_IND")
		public NString ROfflUnofflInd;
		@DbRecordField(dataSourceName="R_ASSUMPTION_MSG_7")
		public NString RAssumptionMsg7;
		@DbRecordField(dataSourceName="R_ASSUMPTION_MSG_8")
		public NString RAssumptionMsg8;
		@DbRecordField(dataSourceName="R_ASSUMPTION_MSG_9")
		public NString RAssumptionMsg9;
		@DbRecordField(dataSourceName="R_ASSUMPTION_MSG_10")
		public NString RAssumptionMsg10;
		@DbRecordField(dataSourceName="R_PHEAA_GRANT_AMT_1")
		public NNumber RPheaaGrantAmt1;
		@DbRecordField(dataSourceName="R_PHEAA_GRANT_AMT_2")
		public NNumber RPheaaGrantAmt2;
		@DbRecordField(dataSourceName="R_PHEAA_GRANT_AMT_3")
		public NNumber RPheaaGrantAmt3;
		@DbRecordField(dataSourceName="R_PHEAA_GRANT_AMT_4")
		public NNumber RPheaaGrantAmt4;
		@DbRecordField(dataSourceName="R_PHEAA_GRANT_CDE_1")
		public NString RPheaaGrantCde1;
		@DbRecordField(dataSourceName="R_PHEAA_GRANT_CDE_2")
		public NString RPheaaGrantCde2;
		@DbRecordField(dataSourceName="R_PHEAA_GRANT_CDE_3")
		public NString RPheaaGrantCde3;
		@DbRecordField(dataSourceName="R_PHEAA_GRANT_CDE_4")
		public NString RPheaaGrantCde4;
		@DbRecordField(dataSourceName="R_PAR_DEP_CARE_AND_MED")
		public NNumber RParDepCareAndMed;
		@DbRecordField(dataSourceName="R_REJECT_OVRD_A")
		public NString RRejectOvrdA;
		@DbRecordField(dataSourceName="R_REJECT_OVRD_C")
		public NString RRejectOvrdC;
		@DbRecordField(dataSourceName="R_PAR_MAR_MTH_YR")
		public NString RParMarMthYr;
		@DbRecordField(dataSourceName="R_PAR_TUI_FEE_DED")
		public NNumber RParTuiFeeDed;
		@DbRecordField(dataSourceName="R_FATH_SSN_MATCH")
		public NString RFathSsnMatch;
		@DbRecordField(dataSourceName="R_MOTH_SSN_MATCH")
		public NString RMothSsnMatch;
		@DbRecordField(dataSourceName="R_REJECT_OVRD_G")
		public NString RRejectOvrdG;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_REJECT_OVRD_12")
		public NString RRejectOvrd12;
		@DbRecordField(dataSourceName="R_REJECT_OVRD_J")
		public NString RRejectOvrdJ;
		@DbRecordField(dataSourceName="R_REJECT_OVRD_K")
		public NString RRejectOvrdK;
		@DbRecordField(dataSourceName="R_FED_COLL_CHOICE_7")
		public NString RFedCollChoice7;
		@DbRecordField(dataSourceName="R_FED_COLL_CHOICE_8")
		public NString RFedCollChoice8;
		@DbRecordField(dataSourceName="R_FED_COLL_CHOICE_9")
		public NString RFedCollChoice9;
		@DbRecordField(dataSourceName="R_FED_COLL_CHOICE_10")
		public NString RFedCollChoice10;
		@DbRecordField(dataSourceName="R_REJECT_OVRD_B")
		public NString RRejectOvrdB;
		@DbRecordField(dataSourceName="R_REJECT_OVRD_N")
		public NString RRejectOvrdN;
		@DbRecordField(dataSourceName="R_REJECT_OVRD_W")
		public NString RRejectOvrdW;
		@DbRecordField(dataSourceName="R_REJECT_OVRD_20")
		public NString RRejectOvrd20;
		@DbRecordField(dataSourceName="R_TEACH_COURSEWORK")
		public NString RTeachCoursework;
		@DbRecordField(dataSourceName="R_EDUC_CREDITS")
		public NNumber REducCredits;
		@DbRecordField(dataSourceName="R_NEED_BASED_EMPLOY")
		public NNumber RNeedBasedEmploy;
		@DbRecordField(dataSourceName="R_GRANT_SCHOLAR_AID")
		public NNumber RGrantScholarAid;
		@DbRecordField(dataSourceName="R_PAR_EDUC_CREDITS")
		public NNumber RParEducCredits;
		@DbRecordField(dataSourceName="R_PAR_NEED_BASED_EMPLOY")
		public NNumber RParNeedBasedEmploy;
		@DbRecordField(dataSourceName="R_PAR_GRANT_SCHOLAR_AID")
		public NNumber RParGrantScholarAid;
		@DbRecordField(dataSourceName="R_SPEC_CIRCUM_FLG")
		public NString RSpecCircumFlg;
		@DbRecordField(dataSourceName="R_TAX_DEF_PENSION")
		public NNumber RTaxDefPension;
		@DbRecordField(dataSourceName="R_TE_INT_INC")
		public NNumber RTeIntInc;
		@DbRecordField(dataSourceName="R_HOUSE_FOOD_OTH")
		public NNumber RHouseFoodOth;
		@DbRecordField(dataSourceName="R_CO_OP_EARNINGS")
		public NNumber RCoOpEarnings;
		@DbRecordField(dataSourceName="R_PAR_CO_OP_EARNINGS")
		public NNumber RParCoOpEarnings;
		@DbRecordField(dataSourceName="R_IRS_REQUEST_FLAG")
		public NString RIrsRequestFlag;
		@DbRecordField(dataSourceName="R_PAR_IRS_REQUEST_FLAG")
		public NString RParIrsRequestFlag;
		@DbRecordField(dataSourceName="R_REJECT_OVRD_21")
		public NString RRejectOvrd21;
		@DbRecordField(dataSourceName="R_IRS_AGI_FLAG")
		public NString RIrsAgiFlag;
		@DbRecordField(dataSourceName="R_PAR_IRS_AGI_FLAG")
		public NString RParIrsAgiFlag;
		@DbRecordField(dataSourceName="R_IRS_FIT_FLAG")
		public NString RIrsFitFlag;
		@DbRecordField(dataSourceName="R_PAR_IRS_FIT_FLAG")
		public NString RParIrsFitFlag;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
