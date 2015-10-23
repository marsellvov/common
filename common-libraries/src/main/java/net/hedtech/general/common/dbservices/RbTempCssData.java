package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbTempCssData {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_CSS_DATA.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_CSS_DATA.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TempCssDataRecRow recOne,TempCssDataRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_CSS_DATA.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TempCssDataRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TempCssDataRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_CSS_DATA.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_CSS_DATA.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_CSS_DATA.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_CSS_DATA.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pCreatorId,NString pUserId,NDate pCreateDate,NDate pRegisRcptDate,NString pRegisType,NString pApplicType,NDate pElecExtractDate,NDate pAddlSchlReqDate,NString pFinAidStatus,NString pCitzCountry,NNumber pItemDeductns,NNumber pEic,NNumber pTaxStuAid,NNumber pIraKeoghAcctVal,NNumber pTrustAmt,NString pTrustAvailInd,NString pTrustEstabBy,NNumber pExpGrantSchlrshp,NNumber pExpTuitBene,NNumber pExpParCtrb,NNumber pExpOthCtrb,NString pParPrntInColl,NString pParNtrlSepDiv,NNumber pParEdLnRpayAmt,NNumber pExpParChildSuppPd,NNumber pExpParEdLnRpayAmt,NNumber pExpParMedDenExpn,NString pParOwnBusFarm,NNumber pParOthReYrPurch,NNumber pParOthRePurchAmt,NNumber pParPryrAgi,NNumber pParPryrUsTaxPd,NNumber pParPryrItemDeductns,NNumber pParPryrUntaxInc,NNumber pParItemDeductns,NString pCollCde9,NString pHousCde9,NString pCollCde10,NString pHousCde10,NString pAddlCollCde9,NString pAddlCollCde10,NString pSignedCertified,NNumber pParAltHmeDbt,NString pParAltAaiRate,NString pAltIraKeogh,NString pAltAiRate,NString pSAltOptHmeVal,NNumber pAltHmeVal,NNumber pAltHmeDbt,NString pAltSumAyInc,NNumber pC2CtrbAdj18Mth,NNumber pC2CtrbAdjOvr9Mth,NString pMsg6,NString pMsg7,NString pMsg8,NString pMsg9,NString pMsg10,NString pMsg20,NString pMsg25,NString pMsg34,NString pMsg35,NString pMsg36,NString pMsg37,NString pMsg38,NString pMsg45,NString pMsg55,NString pMsg56,NString pMsg57,NString pMsg58,NString pMsg59,NString pMsg60,NString pMsg73,NString pMsgFamMemb,NString pMsgNumInColl,NNumber pMsgAvailInc,NNumber pMsgUsTax,NNumber pMsgCalcHmeVal,NNumber pMsgMultHmeVal,NNumber pMsgMultHmeEqty,NNumber pMsgXpctHmeVal,NNumber pMsgXpctHmeEqty,NNumber pMsgCapHmeEqty,NString pMsgParFamMemb,NString pMsgParNumInColl,NNumber pMsgParAgiDiff,NNumber pMsgParUsTax,NNumber pMsgParCalcHmeVal,NNumber pMsgParMultHmeVal,NNumber pMsgParMultHmeEqty,NNumber pMsgParXpctHmeVal,NNumber pMsgParXpctHmeEqty,NNumber pMsgParCapHmeEqty,NString pAssumptProfMsg1,NString pAssumptProfMsg2,NString pAssumptProfMsg3,NString pAssumptProfMsg4,NString pAssumptProfMsg5,NString pAssumptProfMsg6,NString pAssumptProfMsg7,NString pAssumptProfMsg8,NString pAssumptProfMsg9,NString pAssumptProfMsg10,NNumber pBusDepreciation,NNumber pParBusDepreciation,NNumber pBusInHomeMisc,NNumber pParBusInHomeMisc,NNumber pRentDepreciation,NNumber pParRentDepreciation,NNumber pOthAddback1,NNumber pParOthAddback1,NNumber pOthAddback2,NNumber pParOthAddback2,NString pCustNoncustParent,NNumber pPcNonCustPar,NNumber pLine2Age,NNumber pLine3Age,NNumber pLine4Age,NNumber pLine5Age,NNumber pLine6Age,NNumber pLine7Age,NNumber pLine8Age,NString pLine2SchlType,NString pLine3SchlType,NString pLine4SchlType,NString pLine5SchlType,NString pLine6SchlType,NString pLine7SchlType,NString pLine8SchlType,NString pForeignAddrInd,NString pForeignPostalCde,NString pCountry,NNumber pParSiblingAssets,NNumber pHopeLlCredit,NNumber pParHopeLlCredit,NString pParYrSep,NString pParYrDiv,NString pOnlineSig,NString pHopeLlCreditOpt,NString pParHopeLlCreditOpt,NString pAesa,NString pParAesa,NString pCesa,NString pParCesa,NString pMsg13,NString pMsg27,NString pMsg51,NString pMsg64,NNumber pAnnualEdSavings,NNumber pParAnnualEdSavings,NNumber pCumEdSavings,NNumber pParCumEdSavings,NNumber pLowIncAllow,NNumber pParLowIncAllow,NNumber pEmergResAllow,NNumber pParEmergResAllow,NNumber pParSibPreTuit,NNumber pParStuPreTuit,NString pMsg39,NString pMsg52,NString pMsg65,NNumber pParOptTotInc,NNumber pParOptCtrbForStdt,NNumber pParOptCtrbFrInc,NNumber pParOptCtrbFrAsset,NNumber pSEstTotInc,NNumber pSEstCtrbForStdt,NNumber pSEstCtrbFrInc,NNumber pSEstCtrbFrAsset,NNumber pSOptTotInc,NNumber pSOptCtrbForStdt,NNumber pSOptCtrbFrInc,NNumber pSOptCtrbFrAsset,NNumber pFmInst1PellAwd,NString pParColaAltAdjOpt,NString pParStuFamAssetsOpt,NString pParIptAssetsOpt,NString pIptAssetsOpt,NString pParColaAdjValueOpt,NString pIndStuIptAssetsOpt,NString pStuLivesWith,NString pStuMostSupportFrom,NString pLocationComputer,NString pCustParCtrbAdjOpt,NNumber pCustParOptPctInc,NNumber pParOptCtrbInc,NNumber pParOptCtrbAssets,NNumber pParOptTotCtrb,NString pOwnBusHmSelfEmp,NString pSmallBusiness,NNumber pFathRetAcctVal,NNumber pMothRetAcctVal,NString pParSelfEmployed,NString pParSmallBusiness,NString pMsg53,NString pMsg40,NString pSchoolAssignedId,NString pExpTuitBenefitInd,NString pExpGovSuppInd,NString pExpFoundSuppInd,NNumber pParAddlChildTxCred,NNumber pParMilHousAllow,NNumber pParImOthUntaxedInc,NNumber pParFamSupportInc,NNumber pParOwedByOthers,NNumber pParIncFromDebts,NNumber pParOtherAssets,NNumber pParUtilitiesExpense,NNumber pParFoodExpense,NNumber pParClothingExpense,NNumber pParHouseholdExpense,NNumber pParDebtExpense,NNumber pParAnnualDebtPay,NNumber pParAutoExpense,NNumber pParPropertyInsur,NNumber pParVacationExpense,NNumber pParEntertainCosts,NNumber pParNbrEmployed,NNumber pParAmtPdHomeEmploy,NNumber pParOthExpense,NString pCurrencyCde,NNumber pCurrencyRate,NNumber pCountryCoefficient,NString pConvCurrencyCde,NNumber pConvCurrencyRate,NString pParIptHomeValueOpt,NString pIptHomeValueOpt,NString pParBusTaxRtrnCde1,NString pParBusTaxRtrnCde2,NString pParBusTaxRtrnCde3,NString pParBusTaxRtrnCde4,NString pParBusTaxRtrnCde5,NString pParBusTaxRtrnCde6,NString pParBusTaxRtrnCde7,NString pParBusTaxRtrnCde8,NString pParBusTaxRtrnCde9,NString pTravelPayPlanCde,NString pFatherName,NString pMotherName,NString pLine4Name,NString pLine5Name,NString pLine6Name,NString pLine7Name,NString pLine8Name,NString pNonCustParName,NString pExplanationsText,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_CSS_DATA.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_CREATOR_ID", pCreatorId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_REGIS_RCPT_DATE", pRegisRcptDate);
			cmd.addParameter("@P_REGIS_TYPE", pRegisType);
			cmd.addParameter("@P_APPLIC_TYPE", pApplicType);
			cmd.addParameter("@P_ELEC_EXTRACT_DATE", pElecExtractDate);
			cmd.addParameter("@P_ADDL_SCHL_REQ_DATE", pAddlSchlReqDate);
			cmd.addParameter("@P_FIN_AID_STATUS", pFinAidStatus);
			cmd.addParameter("@P_CITZ_COUNTRY", pCitzCountry);
			cmd.addParameter("@P_ITEM_DEDUCTNS", pItemDeductns);
			cmd.addParameter("@P_EIC", pEic);
			cmd.addParameter("@P_TAX_STU_AID", pTaxStuAid);
			cmd.addParameter("@P_IRA_KEOGH_ACCT_VAL", pIraKeoghAcctVal);
			cmd.addParameter("@P_TRUST_AMT", pTrustAmt);
			cmd.addParameter("@P_TRUST_AVAIL_IND", pTrustAvailInd);
			cmd.addParameter("@P_TRUST_ESTAB_BY", pTrustEstabBy);
			cmd.addParameter("@P_EXP_GRANT_SCHLRSHP", pExpGrantSchlrshp);
			cmd.addParameter("@P_EXP_TUIT_BENE", pExpTuitBene);
			cmd.addParameter("@P_EXP_PAR_CTRB", pExpParCtrb);
			cmd.addParameter("@P_EXP_OTH_CTRB", pExpOthCtrb);
			cmd.addParameter("@P_PAR_PRNT_IN_COLL", pParPrntInColl);
			cmd.addParameter("@P_PAR_NTRL_SEP_DIV", pParNtrlSepDiv);
			cmd.addParameter("@P_PAR_ED_LN_RPAY_AMT", pParEdLnRpayAmt);
			cmd.addParameter("@P_EXP_PAR_CHILD_SUPP_PD", pExpParChildSuppPd);
			cmd.addParameter("@P_EXP_PAR_ED_LN_RPAY_AMT", pExpParEdLnRpayAmt);
			cmd.addParameter("@P_EXP_PAR_MED_DEN_EXPN", pExpParMedDenExpn);
			cmd.addParameter("@P_PAR_OWN_BUS_FARM", pParOwnBusFarm);
			cmd.addParameter("@P_PAR_OTH_RE_YR_PURCH", pParOthReYrPurch);
			cmd.addParameter("@P_PAR_OTH_RE_PURCH_AMT", pParOthRePurchAmt);
			cmd.addParameter("@P_PAR_PRYR_AGI", pParPryrAgi);
			cmd.addParameter("@P_PAR_PRYR_US_TAX_PD", pParPryrUsTaxPd);
			cmd.addParameter("@P_PAR_PRYR_ITEM_DEDUCTNS", pParPryrItemDeductns);
			cmd.addParameter("@P_PAR_PRYR_UNTAX_INC", pParPryrUntaxInc);
			cmd.addParameter("@P_PAR_ITEM_DEDUCTNS", pParItemDeductns);
			cmd.addParameter("@P_COLL_CDE_9", pCollCde9);
			cmd.addParameter("@P_HOUS_CDE_9", pHousCde9);
			cmd.addParameter("@P_COLL_CDE_10", pCollCde10);
			cmd.addParameter("@P_HOUS_CDE_10", pHousCde10);
			cmd.addParameter("@P_ADDL_COLL_CDE_9", pAddlCollCde9);
			cmd.addParameter("@P_ADDL_COLL_CDE_10", pAddlCollCde10);
			cmd.addParameter("@P_SIGNED_CERTIFIED", pSignedCertified);
			cmd.addParameter("@P_PAR_ALT_HME_DBT", pParAltHmeDbt);
			cmd.addParameter("@P_PAR_ALT_AAI_RATE", pParAltAaiRate);
			cmd.addParameter("@P_ALT_IRA_KEOGH", pAltIraKeogh);
			cmd.addParameter("@P_ALT_AI_RATE", pAltAiRate);
			cmd.addParameter("@P_S_ALT_OPT_HME_VAL", pSAltOptHmeVal);
			cmd.addParameter("@P_ALT_HME_VAL", pAltHmeVal);
			cmd.addParameter("@P_ALT_HME_DBT", pAltHmeDbt);
			cmd.addParameter("@P_ALT_SUM_AY_INC", pAltSumAyInc);
			cmd.addParameter("@P_C_2_CTRB_ADJ_1_8_MTH", pC2CtrbAdj18Mth);
			cmd.addParameter("@P_C_2_CTRB_ADJ_OVR_9_MTH", pC2CtrbAdjOvr9Mth);
			cmd.addParameter("@P_MSG_6", pMsg6);
			cmd.addParameter("@P_MSG_7", pMsg7);
			cmd.addParameter("@P_MSG_8", pMsg8);
			cmd.addParameter("@P_MSG_9", pMsg9);
			cmd.addParameter("@P_MSG_10", pMsg10);
			cmd.addParameter("@P_MSG_20", pMsg20);
			cmd.addParameter("@P_MSG_25", pMsg25);
			cmd.addParameter("@P_MSG_34", pMsg34);
			cmd.addParameter("@P_MSG_35", pMsg35);
			cmd.addParameter("@P_MSG_36", pMsg36);
			cmd.addParameter("@P_MSG_37", pMsg37);
			cmd.addParameter("@P_MSG_38", pMsg38);
			cmd.addParameter("@P_MSG_45", pMsg45);
			cmd.addParameter("@P_MSG_55", pMsg55);
			cmd.addParameter("@P_MSG_56", pMsg56);
			cmd.addParameter("@P_MSG_57", pMsg57);
			cmd.addParameter("@P_MSG_58", pMsg58);
			cmd.addParameter("@P_MSG_59", pMsg59);
			cmd.addParameter("@P_MSG_60", pMsg60);
			cmd.addParameter("@P_MSG_73", pMsg73);
			cmd.addParameter("@P_MSG_FAM_MEMB", pMsgFamMemb);
			cmd.addParameter("@P_MSG_NUM_IN_COLL", pMsgNumInColl);
			cmd.addParameter("@P_MSG_AVAIL_INC", pMsgAvailInc);
			cmd.addParameter("@P_MSG_US_TAX", pMsgUsTax);
			cmd.addParameter("@P_MSG_CALC_HME_VAL", pMsgCalcHmeVal);
			cmd.addParameter("@P_MSG_MULT_HME_VAL", pMsgMultHmeVal);
			cmd.addParameter("@P_MSG_MULT_HME_EQTY", pMsgMultHmeEqty);
			cmd.addParameter("@P_MSG_XPCT_HME_VAL", pMsgXpctHmeVal);
			cmd.addParameter("@P_MSG_XPCT_HME_EQTY", pMsgXpctHmeEqty);
			cmd.addParameter("@P_MSG_CAP_HME_EQTY", pMsgCapHmeEqty);
			cmd.addParameter("@P_MSG_PAR_FAM_MEMB", pMsgParFamMemb);
			cmd.addParameter("@P_MSG_PAR_NUM_IN_COLL", pMsgParNumInColl);
			cmd.addParameter("@P_MSG_PAR_AGI_DIFF", pMsgParAgiDiff);
			cmd.addParameter("@P_MSG_PAR_US_TAX", pMsgParUsTax);
			cmd.addParameter("@P_MSG_PAR_CALC_HME_VAL", pMsgParCalcHmeVal);
			cmd.addParameter("@P_MSG_PAR_MULT_HME_VAL", pMsgParMultHmeVal);
			cmd.addParameter("@P_MSG_PAR_MULT_HME_EQTY", pMsgParMultHmeEqty);
			cmd.addParameter("@P_MSG_PAR_XPCT_HME_VAL", pMsgParXpctHmeVal);
			cmd.addParameter("@P_MSG_PAR_XPCT_HME_EQTY", pMsgParXpctHmeEqty);
			cmd.addParameter("@P_MSG_PAR_CAP_HME_EQTY", pMsgParCapHmeEqty);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_1", pAssumptProfMsg1);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_2", pAssumptProfMsg2);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_3", pAssumptProfMsg3);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_4", pAssumptProfMsg4);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_5", pAssumptProfMsg5);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_6", pAssumptProfMsg6);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_7", pAssumptProfMsg7);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_8", pAssumptProfMsg8);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_9", pAssumptProfMsg9);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_10", pAssumptProfMsg10);
			cmd.addParameter("@P_BUS_DEPRECIATION", pBusDepreciation);
			cmd.addParameter("@P_PAR_BUS_DEPRECIATION", pParBusDepreciation);
			cmd.addParameter("@P_BUS_IN_HOME_MISC", pBusInHomeMisc);
			cmd.addParameter("@P_PAR_BUS_IN_HOME_MISC", pParBusInHomeMisc);
			cmd.addParameter("@P_RENT_DEPRECIATION", pRentDepreciation);
			cmd.addParameter("@P_PAR_RENT_DEPRECIATION", pParRentDepreciation);
			cmd.addParameter("@P_OTH_ADDBACK_1", pOthAddback1);
			cmd.addParameter("@P_PAR_OTH_ADDBACK_1", pParOthAddback1);
			cmd.addParameter("@P_OTH_ADDBACK_2", pOthAddback2);
			cmd.addParameter("@P_PAR_OTH_ADDBACK_2", pParOthAddback2);
			cmd.addParameter("@P_CUST_NONCUST_PARENT", pCustNoncustParent);
			cmd.addParameter("@P_PC_NON_CUST_PAR", pPcNonCustPar);
			cmd.addParameter("@P_LINE2_AGE", pLine2Age);
			cmd.addParameter("@P_LINE3_AGE", pLine3Age);
			cmd.addParameter("@P_LINE4_AGE", pLine4Age);
			cmd.addParameter("@P_LINE5_AGE", pLine5Age);
			cmd.addParameter("@P_LINE6_AGE", pLine6Age);
			cmd.addParameter("@P_LINE7_AGE", pLine7Age);
			cmd.addParameter("@P_LINE8_AGE", pLine8Age);
			cmd.addParameter("@P_LINE2_SCHL_TYPE", pLine2SchlType);
			cmd.addParameter("@P_LINE3_SCHL_TYPE", pLine3SchlType);
			cmd.addParameter("@P_LINE4_SCHL_TYPE", pLine4SchlType);
			cmd.addParameter("@P_LINE5_SCHL_TYPE", pLine5SchlType);
			cmd.addParameter("@P_LINE6_SCHL_TYPE", pLine6SchlType);
			cmd.addParameter("@P_LINE7_SCHL_TYPE", pLine7SchlType);
			cmd.addParameter("@P_LINE8_SCHL_TYPE", pLine8SchlType);
			cmd.addParameter("@P_FOREIGN_ADDR_IND", pForeignAddrInd);
			cmd.addParameter("@P_FOREIGN_POSTAL_CDE", pForeignPostalCde);
			cmd.addParameter("@P_COUNTRY", pCountry);
			cmd.addParameter("@P_PAR_SIBLING_ASSETS", pParSiblingAssets);
			cmd.addParameter("@P_HOPE_LL_CREDIT", pHopeLlCredit);
			cmd.addParameter("@P_PAR_HOPE_LL_CREDIT", pParHopeLlCredit);
			cmd.addParameter("@P_PAR_YR_SEP", pParYrSep);
			cmd.addParameter("@P_PAR_YR_DIV", pParYrDiv);
			cmd.addParameter("@P_ONLINE_SIG", pOnlineSig);
			cmd.addParameter("@P_HOPE_LL_CREDIT_OPT", pHopeLlCreditOpt);
			cmd.addParameter("@P_PAR_HOPE_LL_CREDIT_OPT", pParHopeLlCreditOpt);
			cmd.addParameter("@P_AESA", pAesa);
			cmd.addParameter("@P_PAR_AESA", pParAesa);
			cmd.addParameter("@P_CESA", pCesa);
			cmd.addParameter("@P_PAR_CESA", pParCesa);
			cmd.addParameter("@P_MSG_13", pMsg13);
			cmd.addParameter("@P_MSG_27", pMsg27);
			cmd.addParameter("@P_MSG_51", pMsg51);
			cmd.addParameter("@P_MSG_64", pMsg64);
			cmd.addParameter("@P_ANNUAL_ED_SAVINGS", pAnnualEdSavings);
			cmd.addParameter("@P_PAR_ANNUAL_ED_SAVINGS", pParAnnualEdSavings);
			cmd.addParameter("@P_CUM_ED_SAVINGS", pCumEdSavings);
			cmd.addParameter("@P_PAR_CUM_ED_SAVINGS", pParCumEdSavings);
			cmd.addParameter("@P_LOW_INC_ALLOW", pLowIncAllow);
			cmd.addParameter("@P_PAR_LOW_INC_ALLOW", pParLowIncAllow);
			cmd.addParameter("@P_EMERG_RES_ALLOW", pEmergResAllow);
			cmd.addParameter("@P_PAR_EMERG_RES_ALLOW", pParEmergResAllow);
			cmd.addParameter("@P_PAR_SIB_PRE_TUIT", pParSibPreTuit);
			cmd.addParameter("@P_PAR_STU_PRE_TUIT", pParStuPreTuit);
			cmd.addParameter("@P_MSG_39", pMsg39);
			cmd.addParameter("@P_MSG_52", pMsg52);
			cmd.addParameter("@P_MSG_65", pMsg65);
			cmd.addParameter("@P_PAR_OPT_TOT_INC", pParOptTotInc);
			cmd.addParameter("@P_PAR_OPT_CTRB_FOR_STDT", pParOptCtrbForStdt);
			cmd.addParameter("@P_PAR_OPT_CTRB_FR_INC", pParOptCtrbFrInc);
			cmd.addParameter("@P_PAR_OPT_CTRB_FR_ASSET", pParOptCtrbFrAsset);
			cmd.addParameter("@P_S_EST_TOT_INC", pSEstTotInc);
			cmd.addParameter("@P_S_EST_CTRB_FOR_STDT", pSEstCtrbForStdt);
			cmd.addParameter("@P_S_EST_CTRB_FR_INC", pSEstCtrbFrInc);
			cmd.addParameter("@P_S_EST_CTRB_FR_ASSET", pSEstCtrbFrAsset);
			cmd.addParameter("@P_S_OPT_TOT_INC", pSOptTotInc);
			cmd.addParameter("@P_S_OPT_CTRB_FOR_STDT", pSOptCtrbForStdt);
			cmd.addParameter("@P_S_OPT_CTRB_FR_INC", pSOptCtrbFrInc);
			cmd.addParameter("@P_S_OPT_CTRB_FR_ASSET", pSOptCtrbFrAsset);
			cmd.addParameter("@P_FM_INST_1_PELL_AWD", pFmInst1PellAwd);
			cmd.addParameter("@P_PAR_COLA_ALT_ADJ_OPT", pParColaAltAdjOpt);
			cmd.addParameter("@P_PAR_STU_FAM_ASSETS_OPT", pParStuFamAssetsOpt);
			cmd.addParameter("@P_PAR_IPT_ASSETS_OPT", pParIptAssetsOpt);
			cmd.addParameter("@P_IPT_ASSETS_OPT", pIptAssetsOpt);
			cmd.addParameter("@P_PAR_COLA_ADJ_VALUE_OPT", pParColaAdjValueOpt);
			cmd.addParameter("@P_IND_STU_IPT_ASSETS_OPT", pIndStuIptAssetsOpt);
			cmd.addParameter("@P_STU_LIVES_WITH", pStuLivesWith);
			cmd.addParameter("@P_STU_MOST_SUPPORT_FROM", pStuMostSupportFrom);
			cmd.addParameter("@P_LOCATION_COMPUTER", pLocationComputer);
			cmd.addParameter("@P_CUST_PAR_CTRB_ADJ_OPT", pCustParCtrbAdjOpt);
			cmd.addParameter("@P_CUST_PAR_OPT_PCT_INC", pCustParOptPctInc);
			cmd.addParameter("@P_PAR_OPT_CTRB_INC", pParOptCtrbInc);
			cmd.addParameter("@P_PAR_OPT_CTRB_ASSETS", pParOptCtrbAssets);
			cmd.addParameter("@P_PAR_OPT_TOT_CTRB", pParOptTotCtrb);
			cmd.addParameter("@P_OWN_BUS_HM_SELF_EMP", pOwnBusHmSelfEmp);
			cmd.addParameter("@P_SMALL_BUSINESS", pSmallBusiness);
			cmd.addParameter("@P_FATH_RET_ACCT_VAL", pFathRetAcctVal);
			cmd.addParameter("@P_MOTH_RET_ACCT_VAL", pMothRetAcctVal);
			cmd.addParameter("@P_PAR_SELF_EMPLOYED", pParSelfEmployed);
			cmd.addParameter("@P_PAR_SMALL_BUSINESS", pParSmallBusiness);
			cmd.addParameter("@P_MSG_53", pMsg53);
			cmd.addParameter("@P_MSG_40", pMsg40);
			cmd.addParameter("@P_SCHOOL_ASSIGNED_ID", pSchoolAssignedId);
			cmd.addParameter("@P_EXP_TUIT_BENEFIT_IND", pExpTuitBenefitInd);
			cmd.addParameter("@P_EXP_GOV_SUPP_IND", pExpGovSuppInd);
			cmd.addParameter("@P_EXP_FOUND_SUPP_IND", pExpFoundSuppInd);
			cmd.addParameter("@P_PAR_ADDL_CHILD_TX_CRED", pParAddlChildTxCred);
			cmd.addParameter("@P_PAR_MIL_HOUS_ALLOW", pParMilHousAllow);
			cmd.addParameter("@P_PAR_IM_OTH_UNTAXED_INC", pParImOthUntaxedInc);
			cmd.addParameter("@P_PAR_FAM_SUPPORT_INC", pParFamSupportInc);
			cmd.addParameter("@P_PAR_OWED_BY_OTHERS", pParOwedByOthers);
			cmd.addParameter("@P_PAR_INC_FROM_DEBTS", pParIncFromDebts);
			cmd.addParameter("@P_PAR_OTHER_ASSETS", pParOtherAssets);
			cmd.addParameter("@P_PAR_UTILITIES_EXPENSE", pParUtilitiesExpense);
			cmd.addParameter("@P_PAR_FOOD_EXPENSE", pParFoodExpense);
			cmd.addParameter("@P_PAR_CLOTHING_EXPENSE", pParClothingExpense);
			cmd.addParameter("@P_PAR_HOUSEHOLD_EXPENSE", pParHouseholdExpense);
			cmd.addParameter("@P_PAR_DEBT_EXPENSE", pParDebtExpense);
			cmd.addParameter("@P_PAR_ANNUAL_DEBT_PAY", pParAnnualDebtPay);
			cmd.addParameter("@P_PAR_AUTO_EXPENSE", pParAutoExpense);
			cmd.addParameter("@P_PAR_PROPERTY_INSUR", pParPropertyInsur);
			cmd.addParameter("@P_PAR_VACATION_EXPENSE", pParVacationExpense);
			cmd.addParameter("@P_PAR_ENTERTAIN_COSTS", pParEntertainCosts);
			cmd.addParameter("@P_PAR_NBR_EMPLOYED", pParNbrEmployed);
			cmd.addParameter("@P_PAR_AMT_PD_HOME_EMPLOY", pParAmtPdHomeEmploy);
			cmd.addParameter("@P_PAR_OTH_EXPENSE", pParOthExpense);
			cmd.addParameter("@P_CURRENCY_CDE", pCurrencyCde);
			cmd.addParameter("@P_CURRENCY_RATE", pCurrencyRate);
			cmd.addParameter("@P_COUNTRY_COEFFICIENT", pCountryCoefficient);
			cmd.addParameter("@P_CONV_CURRENCY_CDE", pConvCurrencyCde);
			cmd.addParameter("@P_CONV_CURRENCY_RATE", pConvCurrencyRate);
			cmd.addParameter("@P_PAR_IPT_HOME_VALUE_OPT", pParIptHomeValueOpt);
			cmd.addParameter("@P_IPT_HOME_VALUE_OPT", pIptHomeValueOpt);
			cmd.addParameter("@P_PAR_BUS_TAX_RTRN_CDE_1", pParBusTaxRtrnCde1);
			cmd.addParameter("@P_PAR_BUS_TAX_RTRN_CDE_2", pParBusTaxRtrnCde2);
			cmd.addParameter("@P_PAR_BUS_TAX_RTRN_CDE_3", pParBusTaxRtrnCde3);
			cmd.addParameter("@P_PAR_BUS_TAX_RTRN_CDE_4", pParBusTaxRtrnCde4);
			cmd.addParameter("@P_PAR_BUS_TAX_RTRN_CDE_5", pParBusTaxRtrnCde5);
			cmd.addParameter("@P_PAR_BUS_TAX_RTRN_CDE_6", pParBusTaxRtrnCde6);
			cmd.addParameter("@P_PAR_BUS_TAX_RTRN_CDE_7", pParBusTaxRtrnCde7);
			cmd.addParameter("@P_PAR_BUS_TAX_RTRN_CDE_8", pParBusTaxRtrnCde8);
			cmd.addParameter("@P_PAR_BUS_TAX_RTRN_CDE_9", pParBusTaxRtrnCde9);
			cmd.addParameter("@P_TRAVEL_PAY_PLAN_CDE", pTravelPayPlanCde);
			cmd.addParameter("@P_FATHER_NAME", pFatherName);
			cmd.addParameter("@P_MOTHER_NAME", pMotherName);
			cmd.addParameter("@P_LINE4_NAME", pLine4Name);
			cmd.addParameter("@P_LINE5_NAME", pLine5Name);
			cmd.addParameter("@P_LINE6_NAME", pLine6Name);
			cmd.addParameter("@P_LINE7_NAME", pLine7Name);
			cmd.addParameter("@P_LINE8_NAME", pLine8Name);
			cmd.addParameter("@P_NON_CUST_PAR_NAME", pNonCustParName);
			cmd.addParameter("@P_EXPLANATIONS_TEXT", pExplanationsText);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_CSS_DATA.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteBulk(NString pAidyCode,NString pInfcCode,NString pDeleteFlag,Ref<NNumber> pDelCountOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_CSS_DATA.P_DELETE_BULK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_DELETE_FLAG", pDeleteFlag);
			cmd.addParameter("@P_DEL_COUNT_OUT", NNumber.class);
				
			cmd.execute();
			pDelCountOut.val = cmd.getParameterValue("@P_DEL_COUNT_OUT", NNumber.class);


		}
		
		public static void pLock(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_CSS_DATA.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pCreatorId,NString pUserId,NDate pCreateDate,NDate pRegisRcptDate,NString pRegisType,NString pApplicType,NDate pElecExtractDate,NDate pAddlSchlReqDate,NString pFinAidStatus,NString pCitzCountry,NNumber pItemDeductns,NNumber pEic,NNumber pTaxStuAid,NNumber pIraKeoghAcctVal,NNumber pTrustAmt,NString pTrustAvailInd,NString pTrustEstabBy,NNumber pExpGrantSchlrshp,NNumber pExpTuitBene,NNumber pExpParCtrb,NNumber pExpOthCtrb,NString pParPrntInColl,NString pParNtrlSepDiv,NNumber pParEdLnRpayAmt,NNumber pExpParChildSuppPd,NNumber pExpParEdLnRpayAmt,NNumber pExpParMedDenExpn,NString pParOwnBusFarm,NNumber pParOthReYrPurch,NNumber pParOthRePurchAmt,NNumber pParPryrAgi,NNumber pParPryrUsTaxPd,NNumber pParPryrItemDeductns,NNumber pParPryrUntaxInc,NNumber pParItemDeductns,NString pCollCde9,NString pHousCde9,NString pCollCde10,NString pHousCde10,NString pAddlCollCde9,NString pAddlCollCde10,NString pSignedCertified,NNumber pParAltHmeDbt,NString pParAltAaiRate,NString pAltIraKeogh,NString pAltAiRate,NString pSAltOptHmeVal,NNumber pAltHmeVal,NNumber pAltHmeDbt,NString pAltSumAyInc,NNumber pC2CtrbAdj18Mth,NNumber pC2CtrbAdjOvr9Mth,NString pMsg6,NString pMsg7,NString pMsg8,NString pMsg9,NString pMsg10,NString pMsg20,NString pMsg25,NString pMsg34,NString pMsg35,NString pMsg36,NString pMsg37,NString pMsg38,NString pMsg45,NString pMsg55,NString pMsg56,NString pMsg57,NString pMsg58,NString pMsg59,NString pMsg60,NString pMsg73,NString pMsgFamMemb,NString pMsgNumInColl,NNumber pMsgAvailInc,NNumber pMsgUsTax,NNumber pMsgCalcHmeVal,NNumber pMsgMultHmeVal,NNumber pMsgMultHmeEqty,NNumber pMsgXpctHmeVal,NNumber pMsgXpctHmeEqty,NNumber pMsgCapHmeEqty,NString pMsgParFamMemb,NString pMsgParNumInColl,NNumber pMsgParAgiDiff,NNumber pMsgParUsTax,NNumber pMsgParCalcHmeVal,NNumber pMsgParMultHmeVal,NNumber pMsgParMultHmeEqty,NNumber pMsgParXpctHmeVal,NNumber pMsgParXpctHmeEqty,NNumber pMsgParCapHmeEqty,NString pAssumptProfMsg1,NString pAssumptProfMsg2,NString pAssumptProfMsg3,NString pAssumptProfMsg4,NString pAssumptProfMsg5,NString pAssumptProfMsg6,NString pAssumptProfMsg7,NString pAssumptProfMsg8,NString pAssumptProfMsg9,NString pAssumptProfMsg10,NNumber pBusDepreciation,NNumber pParBusDepreciation,NNumber pBusInHomeMisc,NNumber pParBusInHomeMisc,NNumber pRentDepreciation,NNumber pParRentDepreciation,NNumber pOthAddback1,NNumber pParOthAddback1,NNumber pOthAddback2,NNumber pParOthAddback2,NString pCustNoncustParent,NNumber pPcNonCustPar,NNumber pLine2Age,NNumber pLine3Age,NNumber pLine4Age,NNumber pLine5Age,NNumber pLine6Age,NNumber pLine7Age,NNumber pLine8Age,NString pLine2SchlType,NString pLine3SchlType,NString pLine4SchlType,NString pLine5SchlType,NString pLine6SchlType,NString pLine7SchlType,NString pLine8SchlType,NString pForeignAddrInd,NString pForeignPostalCde,NString pCountry,NNumber pParSiblingAssets,NNumber pHopeLlCredit,NNumber pParHopeLlCredit,NString pParYrSep,NString pParYrDiv,NString pOnlineSig,NString pHopeLlCreditOpt,NString pParHopeLlCreditOpt,NString pAesa,NString pParAesa,NString pCesa,NString pParCesa,NString pMsg13,NString pMsg27,NString pMsg51,NString pMsg64,NNumber pAnnualEdSavings,NNumber pParAnnualEdSavings,NNumber pCumEdSavings,NNumber pParCumEdSavings,NNumber pLowIncAllow,NNumber pParLowIncAllow,NNumber pEmergResAllow,NNumber pParEmergResAllow,NNumber pParSibPreTuit,NNumber pParStuPreTuit,NString pMsg39,NString pMsg52,NString pMsg65,NNumber pParOptTotInc,NNumber pParOptCtrbForStdt,NNumber pParOptCtrbFrInc,NNumber pParOptCtrbFrAsset,NNumber pSEstTotInc,NNumber pSEstCtrbForStdt,NNumber pSEstCtrbFrInc,NNumber pSEstCtrbFrAsset,NNumber pSOptTotInc,NNumber pSOptCtrbForStdt,NNumber pSOptCtrbFrInc,NNumber pSOptCtrbFrAsset,NNumber pFmInst1PellAwd,NString pParColaAltAdjOpt,NString pParStuFamAssetsOpt,NString pParIptAssetsOpt,NString pIptAssetsOpt,NString pParColaAdjValueOpt,NString pIndStuIptAssetsOpt,NString pStuLivesWith,NString pStuMostSupportFrom,NString pLocationComputer,NString pCustParCtrbAdjOpt,NNumber pCustParOptPctInc,NNumber pParOptCtrbInc,NNumber pParOptCtrbAssets,NNumber pParOptTotCtrb,NString pOwnBusHmSelfEmp,NString pSmallBusiness,NNumber pFathRetAcctVal,NNumber pMothRetAcctVal,NString pParSelfEmployed,NString pParSmallBusiness,NString pMsg53,NString pMsg40,NString pSchoolAssignedId,NString pExpTuitBenefitInd,NString pExpGovSuppInd,NString pExpFoundSuppInd,NNumber pParAddlChildTxCred,NNumber pParMilHousAllow,NNumber pParImOthUntaxedInc,NNumber pParFamSupportInc,NNumber pParOwedByOthers,NNumber pParIncFromDebts,NNumber pParOtherAssets,NNumber pParUtilitiesExpense,NNumber pParFoodExpense,NNumber pParClothingExpense,NNumber pParHouseholdExpense,NNumber pParDebtExpense,NNumber pParAnnualDebtPay,NNumber pParAutoExpense,NNumber pParPropertyInsur,NNumber pParVacationExpense,NNumber pParEntertainCosts,NNumber pParNbrEmployed,NNumber pParAmtPdHomeEmploy,NNumber pParOthExpense,NString pCurrencyCde,NNumber pCurrencyRate,NNumber pCountryCoefficient,NString pConvCurrencyCde,NNumber pConvCurrencyRate,NString pParIptHomeValueOpt,NString pIptHomeValueOpt,NString pParBusTaxRtrnCde1,NString pParBusTaxRtrnCde2,NString pParBusTaxRtrnCde3,NString pParBusTaxRtrnCde4,NString pParBusTaxRtrnCde5,NString pParBusTaxRtrnCde6,NString pParBusTaxRtrnCde7,NString pParBusTaxRtrnCde8,NString pParBusTaxRtrnCde9,NString pTravelPayPlanCde,NString pFatherName,NString pMotherName,NString pLine4Name,NString pLine5Name,NString pLine6Name,NString pLine7Name,NString pLine8Name,NString pNonCustParName,NString pExplanationsText,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_CSS_DATA.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_CREATOR_ID", pCreatorId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_REGIS_RCPT_DATE", pRegisRcptDate);
			cmd.addParameter("@P_REGIS_TYPE", pRegisType);
			cmd.addParameter("@P_APPLIC_TYPE", pApplicType);
			cmd.addParameter("@P_ELEC_EXTRACT_DATE", pElecExtractDate);
			cmd.addParameter("@P_ADDL_SCHL_REQ_DATE", pAddlSchlReqDate);
			cmd.addParameter("@P_FIN_AID_STATUS", pFinAidStatus);
			cmd.addParameter("@P_CITZ_COUNTRY", pCitzCountry);
			cmd.addParameter("@P_ITEM_DEDUCTNS", pItemDeductns);
			cmd.addParameter("@P_EIC", pEic);
			cmd.addParameter("@P_TAX_STU_AID", pTaxStuAid);
			cmd.addParameter("@P_IRA_KEOGH_ACCT_VAL", pIraKeoghAcctVal);
			cmd.addParameter("@P_TRUST_AMT", pTrustAmt);
			cmd.addParameter("@P_TRUST_AVAIL_IND", pTrustAvailInd);
			cmd.addParameter("@P_TRUST_ESTAB_BY", pTrustEstabBy);
			cmd.addParameter("@P_EXP_GRANT_SCHLRSHP", pExpGrantSchlrshp);
			cmd.addParameter("@P_EXP_TUIT_BENE", pExpTuitBene);
			cmd.addParameter("@P_EXP_PAR_CTRB", pExpParCtrb);
			cmd.addParameter("@P_EXP_OTH_CTRB", pExpOthCtrb);
			cmd.addParameter("@P_PAR_PRNT_IN_COLL", pParPrntInColl);
			cmd.addParameter("@P_PAR_NTRL_SEP_DIV", pParNtrlSepDiv);
			cmd.addParameter("@P_PAR_ED_LN_RPAY_AMT", pParEdLnRpayAmt);
			cmd.addParameter("@P_EXP_PAR_CHILD_SUPP_PD", pExpParChildSuppPd);
			cmd.addParameter("@P_EXP_PAR_ED_LN_RPAY_AMT", pExpParEdLnRpayAmt);
			cmd.addParameter("@P_EXP_PAR_MED_DEN_EXPN", pExpParMedDenExpn);
			cmd.addParameter("@P_PAR_OWN_BUS_FARM", pParOwnBusFarm);
			cmd.addParameter("@P_PAR_OTH_RE_YR_PURCH", pParOthReYrPurch);
			cmd.addParameter("@P_PAR_OTH_RE_PURCH_AMT", pParOthRePurchAmt);
			cmd.addParameter("@P_PAR_PRYR_AGI", pParPryrAgi);
			cmd.addParameter("@P_PAR_PRYR_US_TAX_PD", pParPryrUsTaxPd);
			cmd.addParameter("@P_PAR_PRYR_ITEM_DEDUCTNS", pParPryrItemDeductns);
			cmd.addParameter("@P_PAR_PRYR_UNTAX_INC", pParPryrUntaxInc);
			cmd.addParameter("@P_PAR_ITEM_DEDUCTNS", pParItemDeductns);
			cmd.addParameter("@P_COLL_CDE_9", pCollCde9);
			cmd.addParameter("@P_HOUS_CDE_9", pHousCde9);
			cmd.addParameter("@P_COLL_CDE_10", pCollCde10);
			cmd.addParameter("@P_HOUS_CDE_10", pHousCde10);
			cmd.addParameter("@P_ADDL_COLL_CDE_9", pAddlCollCde9);
			cmd.addParameter("@P_ADDL_COLL_CDE_10", pAddlCollCde10);
			cmd.addParameter("@P_SIGNED_CERTIFIED", pSignedCertified);
			cmd.addParameter("@P_PAR_ALT_HME_DBT", pParAltHmeDbt);
			cmd.addParameter("@P_PAR_ALT_AAI_RATE", pParAltAaiRate);
			cmd.addParameter("@P_ALT_IRA_KEOGH", pAltIraKeogh);
			cmd.addParameter("@P_ALT_AI_RATE", pAltAiRate);
			cmd.addParameter("@P_S_ALT_OPT_HME_VAL", pSAltOptHmeVal);
			cmd.addParameter("@P_ALT_HME_VAL", pAltHmeVal);
			cmd.addParameter("@P_ALT_HME_DBT", pAltHmeDbt);
			cmd.addParameter("@P_ALT_SUM_AY_INC", pAltSumAyInc);
			cmd.addParameter("@P_C_2_CTRB_ADJ_1_8_MTH", pC2CtrbAdj18Mth);
			cmd.addParameter("@P_C_2_CTRB_ADJ_OVR_9_MTH", pC2CtrbAdjOvr9Mth);
			cmd.addParameter("@P_MSG_6", pMsg6);
			cmd.addParameter("@P_MSG_7", pMsg7);
			cmd.addParameter("@P_MSG_8", pMsg8);
			cmd.addParameter("@P_MSG_9", pMsg9);
			cmd.addParameter("@P_MSG_10", pMsg10);
			cmd.addParameter("@P_MSG_20", pMsg20);
			cmd.addParameter("@P_MSG_25", pMsg25);
			cmd.addParameter("@P_MSG_34", pMsg34);
			cmd.addParameter("@P_MSG_35", pMsg35);
			cmd.addParameter("@P_MSG_36", pMsg36);
			cmd.addParameter("@P_MSG_37", pMsg37);
			cmd.addParameter("@P_MSG_38", pMsg38);
			cmd.addParameter("@P_MSG_45", pMsg45);
			cmd.addParameter("@P_MSG_55", pMsg55);
			cmd.addParameter("@P_MSG_56", pMsg56);
			cmd.addParameter("@P_MSG_57", pMsg57);
			cmd.addParameter("@P_MSG_58", pMsg58);
			cmd.addParameter("@P_MSG_59", pMsg59);
			cmd.addParameter("@P_MSG_60", pMsg60);
			cmd.addParameter("@P_MSG_73", pMsg73);
			cmd.addParameter("@P_MSG_FAM_MEMB", pMsgFamMemb);
			cmd.addParameter("@P_MSG_NUM_IN_COLL", pMsgNumInColl);
			cmd.addParameter("@P_MSG_AVAIL_INC", pMsgAvailInc);
			cmd.addParameter("@P_MSG_US_TAX", pMsgUsTax);
			cmd.addParameter("@P_MSG_CALC_HME_VAL", pMsgCalcHmeVal);
			cmd.addParameter("@P_MSG_MULT_HME_VAL", pMsgMultHmeVal);
			cmd.addParameter("@P_MSG_MULT_HME_EQTY", pMsgMultHmeEqty);
			cmd.addParameter("@P_MSG_XPCT_HME_VAL", pMsgXpctHmeVal);
			cmd.addParameter("@P_MSG_XPCT_HME_EQTY", pMsgXpctHmeEqty);
			cmd.addParameter("@P_MSG_CAP_HME_EQTY", pMsgCapHmeEqty);
			cmd.addParameter("@P_MSG_PAR_FAM_MEMB", pMsgParFamMemb);
			cmd.addParameter("@P_MSG_PAR_NUM_IN_COLL", pMsgParNumInColl);
			cmd.addParameter("@P_MSG_PAR_AGI_DIFF", pMsgParAgiDiff);
			cmd.addParameter("@P_MSG_PAR_US_TAX", pMsgParUsTax);
			cmd.addParameter("@P_MSG_PAR_CALC_HME_VAL", pMsgParCalcHmeVal);
			cmd.addParameter("@P_MSG_PAR_MULT_HME_VAL", pMsgParMultHmeVal);
			cmd.addParameter("@P_MSG_PAR_MULT_HME_EQTY", pMsgParMultHmeEqty);
			cmd.addParameter("@P_MSG_PAR_XPCT_HME_VAL", pMsgParXpctHmeVal);
			cmd.addParameter("@P_MSG_PAR_XPCT_HME_EQTY", pMsgParXpctHmeEqty);
			cmd.addParameter("@P_MSG_PAR_CAP_HME_EQTY", pMsgParCapHmeEqty);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_1", pAssumptProfMsg1);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_2", pAssumptProfMsg2);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_3", pAssumptProfMsg3);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_4", pAssumptProfMsg4);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_5", pAssumptProfMsg5);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_6", pAssumptProfMsg6);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_7", pAssumptProfMsg7);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_8", pAssumptProfMsg8);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_9", pAssumptProfMsg9);
			cmd.addParameter("@P_ASSUMPT_PROF_MSG_10", pAssumptProfMsg10);
			cmd.addParameter("@P_BUS_DEPRECIATION", pBusDepreciation);
			cmd.addParameter("@P_PAR_BUS_DEPRECIATION", pParBusDepreciation);
			cmd.addParameter("@P_BUS_IN_HOME_MISC", pBusInHomeMisc);
			cmd.addParameter("@P_PAR_BUS_IN_HOME_MISC", pParBusInHomeMisc);
			cmd.addParameter("@P_RENT_DEPRECIATION", pRentDepreciation);
			cmd.addParameter("@P_PAR_RENT_DEPRECIATION", pParRentDepreciation);
			cmd.addParameter("@P_OTH_ADDBACK_1", pOthAddback1);
			cmd.addParameter("@P_PAR_OTH_ADDBACK_1", pParOthAddback1);
			cmd.addParameter("@P_OTH_ADDBACK_2", pOthAddback2);
			cmd.addParameter("@P_PAR_OTH_ADDBACK_2", pParOthAddback2);
			cmd.addParameter("@P_CUST_NONCUST_PARENT", pCustNoncustParent);
			cmd.addParameter("@P_PC_NON_CUST_PAR", pPcNonCustPar);
			cmd.addParameter("@P_LINE2_AGE", pLine2Age);
			cmd.addParameter("@P_LINE3_AGE", pLine3Age);
			cmd.addParameter("@P_LINE4_AGE", pLine4Age);
			cmd.addParameter("@P_LINE5_AGE", pLine5Age);
			cmd.addParameter("@P_LINE6_AGE", pLine6Age);
			cmd.addParameter("@P_LINE7_AGE", pLine7Age);
			cmd.addParameter("@P_LINE8_AGE", pLine8Age);
			cmd.addParameter("@P_LINE2_SCHL_TYPE", pLine2SchlType);
			cmd.addParameter("@P_LINE3_SCHL_TYPE", pLine3SchlType);
			cmd.addParameter("@P_LINE4_SCHL_TYPE", pLine4SchlType);
			cmd.addParameter("@P_LINE5_SCHL_TYPE", pLine5SchlType);
			cmd.addParameter("@P_LINE6_SCHL_TYPE", pLine6SchlType);
			cmd.addParameter("@P_LINE7_SCHL_TYPE", pLine7SchlType);
			cmd.addParameter("@P_LINE8_SCHL_TYPE", pLine8SchlType);
			cmd.addParameter("@P_FOREIGN_ADDR_IND", pForeignAddrInd);
			cmd.addParameter("@P_FOREIGN_POSTAL_CDE", pForeignPostalCde);
			cmd.addParameter("@P_COUNTRY", pCountry);
			cmd.addParameter("@P_PAR_SIBLING_ASSETS", pParSiblingAssets);
			cmd.addParameter("@P_HOPE_LL_CREDIT", pHopeLlCredit);
			cmd.addParameter("@P_PAR_HOPE_LL_CREDIT", pParHopeLlCredit);
			cmd.addParameter("@P_PAR_YR_SEP", pParYrSep);
			cmd.addParameter("@P_PAR_YR_DIV", pParYrDiv);
			cmd.addParameter("@P_ONLINE_SIG", pOnlineSig);
			cmd.addParameter("@P_HOPE_LL_CREDIT_OPT", pHopeLlCreditOpt);
			cmd.addParameter("@P_PAR_HOPE_LL_CREDIT_OPT", pParHopeLlCreditOpt);
			cmd.addParameter("@P_AESA", pAesa);
			cmd.addParameter("@P_PAR_AESA", pParAesa);
			cmd.addParameter("@P_CESA", pCesa);
			cmd.addParameter("@P_PAR_CESA", pParCesa);
			cmd.addParameter("@P_MSG_13", pMsg13);
			cmd.addParameter("@P_MSG_27", pMsg27);
			cmd.addParameter("@P_MSG_51", pMsg51);
			cmd.addParameter("@P_MSG_64", pMsg64);
			cmd.addParameter("@P_ANNUAL_ED_SAVINGS", pAnnualEdSavings);
			cmd.addParameter("@P_PAR_ANNUAL_ED_SAVINGS", pParAnnualEdSavings);
			cmd.addParameter("@P_CUM_ED_SAVINGS", pCumEdSavings);
			cmd.addParameter("@P_PAR_CUM_ED_SAVINGS", pParCumEdSavings);
			cmd.addParameter("@P_LOW_INC_ALLOW", pLowIncAllow);
			cmd.addParameter("@P_PAR_LOW_INC_ALLOW", pParLowIncAllow);
			cmd.addParameter("@P_EMERG_RES_ALLOW", pEmergResAllow);
			cmd.addParameter("@P_PAR_EMERG_RES_ALLOW", pParEmergResAllow);
			cmd.addParameter("@P_PAR_SIB_PRE_TUIT", pParSibPreTuit);
			cmd.addParameter("@P_PAR_STU_PRE_TUIT", pParStuPreTuit);
			cmd.addParameter("@P_MSG_39", pMsg39);
			cmd.addParameter("@P_MSG_52", pMsg52);
			cmd.addParameter("@P_MSG_65", pMsg65);
			cmd.addParameter("@P_PAR_OPT_TOT_INC", pParOptTotInc);
			cmd.addParameter("@P_PAR_OPT_CTRB_FOR_STDT", pParOptCtrbForStdt);
			cmd.addParameter("@P_PAR_OPT_CTRB_FR_INC", pParOptCtrbFrInc);
			cmd.addParameter("@P_PAR_OPT_CTRB_FR_ASSET", pParOptCtrbFrAsset);
			cmd.addParameter("@P_S_EST_TOT_INC", pSEstTotInc);
			cmd.addParameter("@P_S_EST_CTRB_FOR_STDT", pSEstCtrbForStdt);
			cmd.addParameter("@P_S_EST_CTRB_FR_INC", pSEstCtrbFrInc);
			cmd.addParameter("@P_S_EST_CTRB_FR_ASSET", pSEstCtrbFrAsset);
			cmd.addParameter("@P_S_OPT_TOT_INC", pSOptTotInc);
			cmd.addParameter("@P_S_OPT_CTRB_FOR_STDT", pSOptCtrbForStdt);
			cmd.addParameter("@P_S_OPT_CTRB_FR_INC", pSOptCtrbFrInc);
			cmd.addParameter("@P_S_OPT_CTRB_FR_ASSET", pSOptCtrbFrAsset);
			cmd.addParameter("@P_FM_INST_1_PELL_AWD", pFmInst1PellAwd);
			cmd.addParameter("@P_PAR_COLA_ALT_ADJ_OPT", pParColaAltAdjOpt);
			cmd.addParameter("@P_PAR_STU_FAM_ASSETS_OPT", pParStuFamAssetsOpt);
			cmd.addParameter("@P_PAR_IPT_ASSETS_OPT", pParIptAssetsOpt);
			cmd.addParameter("@P_IPT_ASSETS_OPT", pIptAssetsOpt);
			cmd.addParameter("@P_PAR_COLA_ADJ_VALUE_OPT", pParColaAdjValueOpt);
			cmd.addParameter("@P_IND_STU_IPT_ASSETS_OPT", pIndStuIptAssetsOpt);
			cmd.addParameter("@P_STU_LIVES_WITH", pStuLivesWith);
			cmd.addParameter("@P_STU_MOST_SUPPORT_FROM", pStuMostSupportFrom);
			cmd.addParameter("@P_LOCATION_COMPUTER", pLocationComputer);
			cmd.addParameter("@P_CUST_PAR_CTRB_ADJ_OPT", pCustParCtrbAdjOpt);
			cmd.addParameter("@P_CUST_PAR_OPT_PCT_INC", pCustParOptPctInc);
			cmd.addParameter("@P_PAR_OPT_CTRB_INC", pParOptCtrbInc);
			cmd.addParameter("@P_PAR_OPT_CTRB_ASSETS", pParOptCtrbAssets);
			cmd.addParameter("@P_PAR_OPT_TOT_CTRB", pParOptTotCtrb);
			cmd.addParameter("@P_OWN_BUS_HM_SELF_EMP", pOwnBusHmSelfEmp);
			cmd.addParameter("@P_SMALL_BUSINESS", pSmallBusiness);
			cmd.addParameter("@P_FATH_RET_ACCT_VAL", pFathRetAcctVal);
			cmd.addParameter("@P_MOTH_RET_ACCT_VAL", pMothRetAcctVal);
			cmd.addParameter("@P_PAR_SELF_EMPLOYED", pParSelfEmployed);
			cmd.addParameter("@P_PAR_SMALL_BUSINESS", pParSmallBusiness);
			cmd.addParameter("@P_MSG_53", pMsg53);
			cmd.addParameter("@P_MSG_40", pMsg40);
			cmd.addParameter("@P_SCHOOL_ASSIGNED_ID", pSchoolAssignedId);
			cmd.addParameter("@P_EXP_TUIT_BENEFIT_IND", pExpTuitBenefitInd);
			cmd.addParameter("@P_EXP_GOV_SUPP_IND", pExpGovSuppInd);
			cmd.addParameter("@P_EXP_FOUND_SUPP_IND", pExpFoundSuppInd);
			cmd.addParameter("@P_PAR_ADDL_CHILD_TX_CRED", pParAddlChildTxCred);
			cmd.addParameter("@P_PAR_MIL_HOUS_ALLOW", pParMilHousAllow);
			cmd.addParameter("@P_PAR_IM_OTH_UNTAXED_INC", pParImOthUntaxedInc);
			cmd.addParameter("@P_PAR_FAM_SUPPORT_INC", pParFamSupportInc);
			cmd.addParameter("@P_PAR_OWED_BY_OTHERS", pParOwedByOthers);
			cmd.addParameter("@P_PAR_INC_FROM_DEBTS", pParIncFromDebts);
			cmd.addParameter("@P_PAR_OTHER_ASSETS", pParOtherAssets);
			cmd.addParameter("@P_PAR_UTILITIES_EXPENSE", pParUtilitiesExpense);
			cmd.addParameter("@P_PAR_FOOD_EXPENSE", pParFoodExpense);
			cmd.addParameter("@P_PAR_CLOTHING_EXPENSE", pParClothingExpense);
			cmd.addParameter("@P_PAR_HOUSEHOLD_EXPENSE", pParHouseholdExpense);
			cmd.addParameter("@P_PAR_DEBT_EXPENSE", pParDebtExpense);
			cmd.addParameter("@P_PAR_ANNUAL_DEBT_PAY", pParAnnualDebtPay);
			cmd.addParameter("@P_PAR_AUTO_EXPENSE", pParAutoExpense);
			cmd.addParameter("@P_PAR_PROPERTY_INSUR", pParPropertyInsur);
			cmd.addParameter("@P_PAR_VACATION_EXPENSE", pParVacationExpense);
			cmd.addParameter("@P_PAR_ENTERTAIN_COSTS", pParEntertainCosts);
			cmd.addParameter("@P_PAR_NBR_EMPLOYED", pParNbrEmployed);
			cmd.addParameter("@P_PAR_AMT_PD_HOME_EMPLOY", pParAmtPdHomeEmploy);
			cmd.addParameter("@P_PAR_OTH_EXPENSE", pParOthExpense);
			cmd.addParameter("@P_CURRENCY_CDE", pCurrencyCde);
			cmd.addParameter("@P_CURRENCY_RATE", pCurrencyRate);
			cmd.addParameter("@P_COUNTRY_COEFFICIENT", pCountryCoefficient);
			cmd.addParameter("@P_CONV_CURRENCY_CDE", pConvCurrencyCde);
			cmd.addParameter("@P_CONV_CURRENCY_RATE", pConvCurrencyRate);
			cmd.addParameter("@P_PAR_IPT_HOME_VALUE_OPT", pParIptHomeValueOpt);
			cmd.addParameter("@P_IPT_HOME_VALUE_OPT", pIptHomeValueOpt);
			cmd.addParameter("@P_PAR_BUS_TAX_RTRN_CDE_1", pParBusTaxRtrnCde1);
			cmd.addParameter("@P_PAR_BUS_TAX_RTRN_CDE_2", pParBusTaxRtrnCde2);
			cmd.addParameter("@P_PAR_BUS_TAX_RTRN_CDE_3", pParBusTaxRtrnCde3);
			cmd.addParameter("@P_PAR_BUS_TAX_RTRN_CDE_4", pParBusTaxRtrnCde4);
			cmd.addParameter("@P_PAR_BUS_TAX_RTRN_CDE_5", pParBusTaxRtrnCde5);
			cmd.addParameter("@P_PAR_BUS_TAX_RTRN_CDE_6", pParBusTaxRtrnCde6);
			cmd.addParameter("@P_PAR_BUS_TAX_RTRN_CDE_7", pParBusTaxRtrnCde7);
			cmd.addParameter("@P_PAR_BUS_TAX_RTRN_CDE_8", pParBusTaxRtrnCde8);
			cmd.addParameter("@P_PAR_BUS_TAX_RTRN_CDE_9", pParBusTaxRtrnCde9);
			cmd.addParameter("@P_TRAVEL_PAY_PLAN_CDE", pTravelPayPlanCde);
			cmd.addParameter("@P_FATHER_NAME", pFatherName);
			cmd.addParameter("@P_MOTHER_NAME", pMotherName);
			cmd.addParameter("@P_LINE4_NAME", pLine4Name);
			cmd.addParameter("@P_LINE5_NAME", pLine5Name);
			cmd.addParameter("@P_LINE6_NAME", pLine6Name);
			cmd.addParameter("@P_LINE7_NAME", pLine7Name);
			cmd.addParameter("@P_LINE8_NAME", pLine8Name);
			cmd.addParameter("@P_NON_CUST_PAR_NAME", pNonCustParName);
			cmd.addParameter("@P_EXPLANATIONS_TEXT", pExplanationsText);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TempCssDataRecRow", dataSourceName="TEMP_CSS_DATA_REC")
	public static class TempCssDataRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_INFC_CODE")
		public NString RInfcCode;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_CREATOR_ID")
		public NString RCreatorId;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_CREATE_DATE")
		public NDate RCreateDate;
		@DbRecordField(dataSourceName="R_REGIS_RCPT_DATE")
		public NDate RRegisRcptDate;
		@DbRecordField(dataSourceName="R_REGIS_TYPE")
		public NString RRegisType;
		@DbRecordField(dataSourceName="R_APPLIC_TYPE")
		public NString RApplicType;
		@DbRecordField(dataSourceName="R_ELEC_EXTRACT_DATE")
		public NDate RElecExtractDate;
		@DbRecordField(dataSourceName="R_ADDL_SCHL_REQ_DATE")
		public NDate RAddlSchlReqDate;
		@DbRecordField(dataSourceName="R_FIN_AID_STATUS")
		public NString RFinAidStatus;
		@DbRecordField(dataSourceName="R_CITZ_COUNTRY")
		public NString RCitzCountry;
		@DbRecordField(dataSourceName="R_ITEM_DEDUCTNS")
		public NNumber RItemDeductns;
		@DbRecordField(dataSourceName="R_EIC")
		public NNumber REic;
		@DbRecordField(dataSourceName="R_TAX_STU_AID")
		public NNumber RTaxStuAid;
		@DbRecordField(dataSourceName="R_IRA_KEOGH_ACCT_VAL")
		public NNumber RIraKeoghAcctVal;
		@DbRecordField(dataSourceName="R_TRUST_AMT")
		public NNumber RTrustAmt;
		@DbRecordField(dataSourceName="R_TRUST_AVAIL_IND")
		public NString RTrustAvailInd;
		@DbRecordField(dataSourceName="R_TRUST_ESTAB_BY")
		public NString RTrustEstabBy;
		@DbRecordField(dataSourceName="R_EXP_GRANT_SCHLRSHP")
		public NNumber RExpGrantSchlrshp;
		@DbRecordField(dataSourceName="R_EXP_TUIT_BENE")
		public NNumber RExpTuitBene;
		@DbRecordField(dataSourceName="R_EXP_PAR_CTRB")
		public NNumber RExpParCtrb;
		@DbRecordField(dataSourceName="R_EXP_OTH_CTRB")
		public NNumber RExpOthCtrb;
		@DbRecordField(dataSourceName="R_PAR_PRNT_IN_COLL")
		public NString RParPrntInColl;
		@DbRecordField(dataSourceName="R_PAR_NTRL_SEP_DIV")
		public NString RParNtrlSepDiv;
		@DbRecordField(dataSourceName="R_PAR_ED_LN_RPAY_AMT")
		public NNumber RParEdLnRpayAmt;
		@DbRecordField(dataSourceName="R_EXP_PAR_CHILD_SUPP_PD")
		public NNumber RExpParChildSuppPd;
		@DbRecordField(dataSourceName="R_EXP_PAR_ED_LN_RPAY_AMT")
		public NNumber RExpParEdLnRpayAmt;
		@DbRecordField(dataSourceName="R_EXP_PAR_MED_DEN_EXPN")
		public NNumber RExpParMedDenExpn;
		@DbRecordField(dataSourceName="R_PAR_OWN_BUS_FARM")
		public NString RParOwnBusFarm;
		@DbRecordField(dataSourceName="R_PAR_OTH_RE_YR_PURCH")
		public NNumber RParOthReYrPurch;
		@DbRecordField(dataSourceName="R_PAR_OTH_RE_PURCH_AMT")
		public NNumber RParOthRePurchAmt;
		@DbRecordField(dataSourceName="R_PAR_PRYR_AGI")
		public NNumber RParPryrAgi;
		@DbRecordField(dataSourceName="R_PAR_PRYR_US_TAX_PD")
		public NNumber RParPryrUsTaxPd;
		@DbRecordField(dataSourceName="R_PAR_PRYR_ITEM_DEDUCTNS")
		public NNumber RParPryrItemDeductns;
		@DbRecordField(dataSourceName="R_PAR_PRYR_UNTAX_INC")
		public NNumber RParPryrUntaxInc;
		@DbRecordField(dataSourceName="R_PAR_ITEM_DEDUCTNS")
		public NNumber RParItemDeductns;
		@DbRecordField(dataSourceName="R_COLL_CDE_9")
		public NString RCollCde9;
		@DbRecordField(dataSourceName="R_HOUS_CDE_9")
		public NString RHousCde9;
		@DbRecordField(dataSourceName="R_COLL_CDE_10")
		public NString RCollCde10;
		@DbRecordField(dataSourceName="R_HOUS_CDE_10")
		public NString RHousCde10;
		@DbRecordField(dataSourceName="R_ADDL_COLL_CDE_9")
		public NString RAddlCollCde9;
		@DbRecordField(dataSourceName="R_ADDL_COLL_CDE_10")
		public NString RAddlCollCde10;
		@DbRecordField(dataSourceName="R_SIGNED_CERTIFIED")
		public NString RSignedCertified;
		@DbRecordField(dataSourceName="R_PAR_ALT_HME_DBT")
		public NNumber RParAltHmeDbt;
		@DbRecordField(dataSourceName="R_PAR_ALT_AAI_RATE")
		public NString RParAltAaiRate;
		@DbRecordField(dataSourceName="R_ALT_IRA_KEOGH")
		public NString RAltIraKeogh;
		@DbRecordField(dataSourceName="R_ALT_AI_RATE")
		public NString RAltAiRate;
		@DbRecordField(dataSourceName="R_S_ALT_OPT_HME_VAL")
		public NString RSAltOptHmeVal;
		@DbRecordField(dataSourceName="R_ALT_HME_VAL")
		public NNumber RAltHmeVal;
		@DbRecordField(dataSourceName="R_ALT_HME_DBT")
		public NNumber RAltHmeDbt;
		@DbRecordField(dataSourceName="R_ALT_SUM_AY_INC")
		public NString RAltSumAyInc;
		@DbRecordField(dataSourceName="R_C_2_CTRB_ADJ_1_8_MTH")
		public NNumber RC2CtrbAdj18Mth;
		@DbRecordField(dataSourceName="R_C_2_CTRB_ADJ_OVR_9_MTH")
		public NNumber RC2CtrbAdjOvr9Mth;
		@DbRecordField(dataSourceName="R_MSG_6")
		public NString RMsg6;
		@DbRecordField(dataSourceName="R_MSG_7")
		public NString RMsg7;
		@DbRecordField(dataSourceName="R_MSG_8")
		public NString RMsg8;
		@DbRecordField(dataSourceName="R_MSG_9")
		public NString RMsg9;
		@DbRecordField(dataSourceName="R_MSG_10")
		public NString RMsg10;
		@DbRecordField(dataSourceName="R_MSG_20")
		public NString RMsg20;
		@DbRecordField(dataSourceName="R_MSG_25")
		public NString RMsg25;
		@DbRecordField(dataSourceName="R_MSG_34")
		public NString RMsg34;
		@DbRecordField(dataSourceName="R_MSG_35")
		public NString RMsg35;
		@DbRecordField(dataSourceName="R_MSG_36")
		public NString RMsg36;
		@DbRecordField(dataSourceName="R_MSG_37")
		public NString RMsg37;
		@DbRecordField(dataSourceName="R_MSG_38")
		public NString RMsg38;
		@DbRecordField(dataSourceName="R_MSG_45")
		public NString RMsg45;
		@DbRecordField(dataSourceName="R_MSG_55")
		public NString RMsg55;
		@DbRecordField(dataSourceName="R_MSG_56")
		public NString RMsg56;
		@DbRecordField(dataSourceName="R_MSG_57")
		public NString RMsg57;
		@DbRecordField(dataSourceName="R_MSG_58")
		public NString RMsg58;
		@DbRecordField(dataSourceName="R_MSG_59")
		public NString RMsg59;
		@DbRecordField(dataSourceName="R_MSG_60")
		public NString RMsg60;
		@DbRecordField(dataSourceName="R_MSG_73")
		public NString RMsg73;
		@DbRecordField(dataSourceName="R_MSG_FAM_MEMB")
		public NString RMsgFamMemb;
		@DbRecordField(dataSourceName="R_MSG_NUM_IN_COLL")
		public NString RMsgNumInColl;
		@DbRecordField(dataSourceName="R_MSG_AVAIL_INC")
		public NNumber RMsgAvailInc;
		@DbRecordField(dataSourceName="R_MSG_US_TAX")
		public NNumber RMsgUsTax;
		@DbRecordField(dataSourceName="R_MSG_CALC_HME_VAL")
		public NNumber RMsgCalcHmeVal;
		@DbRecordField(dataSourceName="R_MSG_MULT_HME_VAL")
		public NNumber RMsgMultHmeVal;
		@DbRecordField(dataSourceName="R_MSG_MULT_HME_EQTY")
		public NNumber RMsgMultHmeEqty;
		@DbRecordField(dataSourceName="R_MSG_XPCT_HME_VAL")
		public NNumber RMsgXpctHmeVal;
		@DbRecordField(dataSourceName="R_MSG_XPCT_HME_EQTY")
		public NNumber RMsgXpctHmeEqty;
		@DbRecordField(dataSourceName="R_MSG_CAP_HME_EQTY")
		public NNumber RMsgCapHmeEqty;
		@DbRecordField(dataSourceName="R_MSG_PAR_FAM_MEMB")
		public NString RMsgParFamMemb;
		@DbRecordField(dataSourceName="R_MSG_PAR_NUM_IN_COLL")
		public NString RMsgParNumInColl;
		@DbRecordField(dataSourceName="R_MSG_PAR_AGI_DIFF")
		public NNumber RMsgParAgiDiff;
		@DbRecordField(dataSourceName="R_MSG_PAR_US_TAX")
		public NNumber RMsgParUsTax;
		@DbRecordField(dataSourceName="R_MSG_PAR_CALC_HME_VAL")
		public NNumber RMsgParCalcHmeVal;
		@DbRecordField(dataSourceName="R_MSG_PAR_MULT_HME_VAL")
		public NNumber RMsgParMultHmeVal;
		@DbRecordField(dataSourceName="R_MSG_PAR_MULT_HME_EQTY")
		public NNumber RMsgParMultHmeEqty;
		@DbRecordField(dataSourceName="R_MSG_PAR_XPCT_HME_VAL")
		public NNumber RMsgParXpctHmeVal;
		@DbRecordField(dataSourceName="R_MSG_PAR_XPCT_HME_EQTY")
		public NNumber RMsgParXpctHmeEqty;
		@DbRecordField(dataSourceName="R_MSG_PAR_CAP_HME_EQTY")
		public NNumber RMsgParCapHmeEqty;
		@DbRecordField(dataSourceName="R_ASSUMPT_PROF_MSG_1")
		public NString RAssumptProfMsg1;
		@DbRecordField(dataSourceName="R_ASSUMPT_PROF_MSG_2")
		public NString RAssumptProfMsg2;
		@DbRecordField(dataSourceName="R_ASSUMPT_PROF_MSG_3")
		public NString RAssumptProfMsg3;
		@DbRecordField(dataSourceName="R_ASSUMPT_PROF_MSG_4")
		public NString RAssumptProfMsg4;
		@DbRecordField(dataSourceName="R_ASSUMPT_PROF_MSG_5")
		public NString RAssumptProfMsg5;
		@DbRecordField(dataSourceName="R_ASSUMPT_PROF_MSG_6")
		public NString RAssumptProfMsg6;
		@DbRecordField(dataSourceName="R_ASSUMPT_PROF_MSG_7")
		public NString RAssumptProfMsg7;
		@DbRecordField(dataSourceName="R_ASSUMPT_PROF_MSG_8")
		public NString RAssumptProfMsg8;
		@DbRecordField(dataSourceName="R_ASSUMPT_PROF_MSG_9")
		public NString RAssumptProfMsg9;
		@DbRecordField(dataSourceName="R_ASSUMPT_PROF_MSG_10")
		public NString RAssumptProfMsg10;
		@DbRecordField(dataSourceName="R_BUS_DEPRECIATION")
		public NNumber RBusDepreciation;
		@DbRecordField(dataSourceName="R_PAR_BUS_DEPRECIATION")
		public NNumber RParBusDepreciation;
		@DbRecordField(dataSourceName="R_BUS_IN_HOME_MISC")
		public NNumber RBusInHomeMisc;
		@DbRecordField(dataSourceName="R_PAR_BUS_IN_HOME_MISC")
		public NNumber RParBusInHomeMisc;
		@DbRecordField(dataSourceName="R_RENT_DEPRECIATION")
		public NNumber RRentDepreciation;
		@DbRecordField(dataSourceName="R_PAR_RENT_DEPRECIATION")
		public NNumber RParRentDepreciation;
		@DbRecordField(dataSourceName="R_OTH_ADDBACK_1")
		public NNumber ROthAddback1;
		@DbRecordField(dataSourceName="R_PAR_OTH_ADDBACK_1")
		public NNumber RParOthAddback1;
		@DbRecordField(dataSourceName="R_OTH_ADDBACK_2")
		public NNumber ROthAddback2;
		@DbRecordField(dataSourceName="R_PAR_OTH_ADDBACK_2")
		public NNumber RParOthAddback2;
		@DbRecordField(dataSourceName="R_CUST_NONCUST_PARENT")
		public NString RCustNoncustParent;
		@DbRecordField(dataSourceName="R_PC_NON_CUST_PAR")
		public NNumber RPcNonCustPar;
		@DbRecordField(dataSourceName="R_LINE2_AGE")
		public NNumber RLine2Age;
		@DbRecordField(dataSourceName="R_LINE3_AGE")
		public NNumber RLine3Age;
		@DbRecordField(dataSourceName="R_LINE4_AGE")
		public NNumber RLine4Age;
		@DbRecordField(dataSourceName="R_LINE5_AGE")
		public NNumber RLine5Age;
		@DbRecordField(dataSourceName="R_LINE6_AGE")
		public NNumber RLine6Age;
		@DbRecordField(dataSourceName="R_LINE7_AGE")
		public NNumber RLine7Age;
		@DbRecordField(dataSourceName="R_LINE8_AGE")
		public NNumber RLine8Age;
		@DbRecordField(dataSourceName="R_LINE2_SCHL_TYPE")
		public NString RLine2SchlType;
		@DbRecordField(dataSourceName="R_LINE3_SCHL_TYPE")
		public NString RLine3SchlType;
		@DbRecordField(dataSourceName="R_LINE4_SCHL_TYPE")
		public NString RLine4SchlType;
		@DbRecordField(dataSourceName="R_LINE5_SCHL_TYPE")
		public NString RLine5SchlType;
		@DbRecordField(dataSourceName="R_LINE6_SCHL_TYPE")
		public NString RLine6SchlType;
		@DbRecordField(dataSourceName="R_LINE7_SCHL_TYPE")
		public NString RLine7SchlType;
		@DbRecordField(dataSourceName="R_LINE8_SCHL_TYPE")
		public NString RLine8SchlType;
		@DbRecordField(dataSourceName="R_FOREIGN_ADDR_IND")
		public NString RForeignAddrInd;
		@DbRecordField(dataSourceName="R_FOREIGN_POSTAL_CDE")
		public NString RForeignPostalCde;
		@DbRecordField(dataSourceName="R_COUNTRY")
		public NString RCountry;
		@DbRecordField(dataSourceName="R_PAR_SIBLING_ASSETS")
		public NNumber RParSiblingAssets;
		@DbRecordField(dataSourceName="R_HOPE_LL_CREDIT")
		public NNumber RHopeLlCredit;
		@DbRecordField(dataSourceName="R_PAR_HOPE_LL_CREDIT")
		public NNumber RParHopeLlCredit;
		@DbRecordField(dataSourceName="R_PAR_YR_SEP")
		public NString RParYrSep;
		@DbRecordField(dataSourceName="R_PAR_YR_DIV")
		public NString RParYrDiv;
		@DbRecordField(dataSourceName="R_ONLINE_SIG")
		public NString ROnlineSig;
		@DbRecordField(dataSourceName="R_HOPE_LL_CREDIT_OPT")
		public NString RHopeLlCreditOpt;
		@DbRecordField(dataSourceName="R_PAR_HOPE_LL_CREDIT_OPT")
		public NString RParHopeLlCreditOpt;
		@DbRecordField(dataSourceName="R_AESA")
		public NString RAesa;
		@DbRecordField(dataSourceName="R_PAR_AESA")
		public NString RParAesa;
		@DbRecordField(dataSourceName="R_CESA")
		public NString RCesa;
		@DbRecordField(dataSourceName="R_PAR_CESA")
		public NString RParCesa;
		@DbRecordField(dataSourceName="R_MSG_13")
		public NString RMsg13;
		@DbRecordField(dataSourceName="R_MSG_27")
		public NString RMsg27;
		@DbRecordField(dataSourceName="R_MSG_51")
		public NString RMsg51;
		@DbRecordField(dataSourceName="R_MSG_64")
		public NString RMsg64;
		@DbRecordField(dataSourceName="R_ANNUAL_ED_SAVINGS")
		public NNumber RAnnualEdSavings;
		@DbRecordField(dataSourceName="R_PAR_ANNUAL_ED_SAVINGS")
		public NNumber RParAnnualEdSavings;
		@DbRecordField(dataSourceName="R_CUM_ED_SAVINGS")
		public NNumber RCumEdSavings;
		@DbRecordField(dataSourceName="R_PAR_CUM_ED_SAVINGS")
		public NNumber RParCumEdSavings;
		@DbRecordField(dataSourceName="R_LOW_INC_ALLOW")
		public NNumber RLowIncAllow;
		@DbRecordField(dataSourceName="R_PAR_LOW_INC_ALLOW")
		public NNumber RParLowIncAllow;
		@DbRecordField(dataSourceName="R_EMERG_RES_ALLOW")
		public NNumber REmergResAllow;
		@DbRecordField(dataSourceName="R_PAR_EMERG_RES_ALLOW")
		public NNumber RParEmergResAllow;
		@DbRecordField(dataSourceName="R_PAR_SIB_PRE_TUIT")
		public NNumber RParSibPreTuit;
		@DbRecordField(dataSourceName="R_PAR_STU_PRE_TUIT")
		public NNumber RParStuPreTuit;
		@DbRecordField(dataSourceName="R_MSG_39")
		public NString RMsg39;
		@DbRecordField(dataSourceName="R_MSG_52")
		public NString RMsg52;
		@DbRecordField(dataSourceName="R_MSG_65")
		public NString RMsg65;
		@DbRecordField(dataSourceName="R_PAR_OPT_TOT_INC")
		public NNumber RParOptTotInc;
		@DbRecordField(dataSourceName="R_PAR_OPT_CTRB_FOR_STDT")
		public NNumber RParOptCtrbForStdt;
		@DbRecordField(dataSourceName="R_PAR_OPT_CTRB_FR_INC")
		public NNumber RParOptCtrbFrInc;
		@DbRecordField(dataSourceName="R_PAR_OPT_CTRB_FR_ASSET")
		public NNumber RParOptCtrbFrAsset;
		@DbRecordField(dataSourceName="R_S_EST_TOT_INC")
		public NNumber RSEstTotInc;
		@DbRecordField(dataSourceName="R_S_EST_CTRB_FOR_STDT")
		public NNumber RSEstCtrbForStdt;
		@DbRecordField(dataSourceName="R_S_EST_CTRB_FR_INC")
		public NNumber RSEstCtrbFrInc;
		@DbRecordField(dataSourceName="R_S_EST_CTRB_FR_ASSET")
		public NNumber RSEstCtrbFrAsset;
		@DbRecordField(dataSourceName="R_S_OPT_TOT_INC")
		public NNumber RSOptTotInc;
		@DbRecordField(dataSourceName="R_S_OPT_CTRB_FOR_STDT")
		public NNumber RSOptCtrbForStdt;
		@DbRecordField(dataSourceName="R_S_OPT_CTRB_FR_INC")
		public NNumber RSOptCtrbFrInc;
		@DbRecordField(dataSourceName="R_S_OPT_CTRB_FR_ASSET")
		public NNumber RSOptCtrbFrAsset;
		@DbRecordField(dataSourceName="R_FM_INST_1_PELL_AWD")
		public NNumber RFmInst1PellAwd;
		@DbRecordField(dataSourceName="R_PAR_COLA_ALT_ADJ_OPT")
		public NString RParColaAltAdjOpt;
		@DbRecordField(dataSourceName="R_PAR_STU_FAM_ASSETS_OPT")
		public NString RParStuFamAssetsOpt;
		@DbRecordField(dataSourceName="R_PAR_IPT_ASSETS_OPT")
		public NString RParIptAssetsOpt;
		@DbRecordField(dataSourceName="R_IPT_ASSETS_OPT")
		public NString RIptAssetsOpt;
		@DbRecordField(dataSourceName="R_PAR_COLA_ADJ_VALUE_OPT")
		public NString RParColaAdjValueOpt;
		@DbRecordField(dataSourceName="R_IND_STU_IPT_ASSETS_OPT")
		public NString RIndStuIptAssetsOpt;
		@DbRecordField(dataSourceName="R_STU_LIVES_WITH")
		public NString RStuLivesWith;
		@DbRecordField(dataSourceName="R_STU_MOST_SUPPORT_FROM")
		public NString RStuMostSupportFrom;
		@DbRecordField(dataSourceName="R_LOCATION_COMPUTER")
		public NString RLocationComputer;
		@DbRecordField(dataSourceName="R_CUST_PAR_CTRB_ADJ_OPT")
		public NString RCustParCtrbAdjOpt;
		@DbRecordField(dataSourceName="R_CUST_PAR_OPT_PCT_INC")
		public NNumber RCustParOptPctInc;
		@DbRecordField(dataSourceName="R_PAR_OPT_CTRB_INC")
		public NNumber RParOptCtrbInc;
		@DbRecordField(dataSourceName="R_PAR_OPT_CTRB_ASSETS")
		public NNumber RParOptCtrbAssets;
		@DbRecordField(dataSourceName="R_PAR_OPT_TOT_CTRB")
		public NNumber RParOptTotCtrb;
		@DbRecordField(dataSourceName="R_OWN_BUS_HM_SELF_EMP")
		public NString ROwnBusHmSelfEmp;
		@DbRecordField(dataSourceName="R_SMALL_BUSINESS")
		public NString RSmallBusiness;
		@DbRecordField(dataSourceName="R_FATH_RET_ACCT_VAL")
		public NNumber RFathRetAcctVal;
		@DbRecordField(dataSourceName="R_MOTH_RET_ACCT_VAL")
		public NNumber RMothRetAcctVal;
		@DbRecordField(dataSourceName="R_PAR_SELF_EMPLOYED")
		public NString RParSelfEmployed;
		@DbRecordField(dataSourceName="R_PAR_SMALL_BUSINESS")
		public NString RParSmallBusiness;
		@DbRecordField(dataSourceName="R_MSG_53")
		public NString RMsg53;
		@DbRecordField(dataSourceName="R_MSG_40")
		public NString RMsg40;
		@DbRecordField(dataSourceName="R_SCHOOL_ASSIGNED_ID")
		public NString RSchoolAssignedId;
		@DbRecordField(dataSourceName="R_EXP_TUIT_BENEFIT_IND")
		public NString RExpTuitBenefitInd;
		@DbRecordField(dataSourceName="R_EXP_GOV_SUPP_IND")
		public NString RExpGovSuppInd;
		@DbRecordField(dataSourceName="R_EXP_FOUND_SUPP_IND")
		public NString RExpFoundSuppInd;
		@DbRecordField(dataSourceName="R_PAR_ADDL_CHILD_TX_CRED")
		public NNumber RParAddlChildTxCred;
		@DbRecordField(dataSourceName="R_PAR_MIL_HOUS_ALLOW")
		public NNumber RParMilHousAllow;
		@DbRecordField(dataSourceName="R_PAR_IM_OTH_UNTAXED_INC")
		public NNumber RParImOthUntaxedInc;
		@DbRecordField(dataSourceName="R_PAR_FAM_SUPPORT_INC")
		public NNumber RParFamSupportInc;
		@DbRecordField(dataSourceName="R_PAR_OWED_BY_OTHERS")
		public NNumber RParOwedByOthers;
		@DbRecordField(dataSourceName="R_PAR_INC_FROM_DEBTS")
		public NNumber RParIncFromDebts;
		@DbRecordField(dataSourceName="R_PAR_OTHER_ASSETS")
		public NNumber RParOtherAssets;
		@DbRecordField(dataSourceName="R_PAR_UTILITIES_EXPENSE")
		public NNumber RParUtilitiesExpense;
		@DbRecordField(dataSourceName="R_PAR_FOOD_EXPENSE")
		public NNumber RParFoodExpense;
		@DbRecordField(dataSourceName="R_PAR_CLOTHING_EXPENSE")
		public NNumber RParClothingExpense;
		@DbRecordField(dataSourceName="R_PAR_HOUSEHOLD_EXPENSE")
		public NNumber RParHouseholdExpense;
		@DbRecordField(dataSourceName="R_PAR_DEBT_EXPENSE")
		public NNumber RParDebtExpense;
		@DbRecordField(dataSourceName="R_PAR_ANNUAL_DEBT_PAY")
		public NNumber RParAnnualDebtPay;
		@DbRecordField(dataSourceName="R_PAR_AUTO_EXPENSE")
		public NNumber RParAutoExpense;
		@DbRecordField(dataSourceName="R_PAR_PROPERTY_INSUR")
		public NNumber RParPropertyInsur;
		@DbRecordField(dataSourceName="R_PAR_VACATION_EXPENSE")
		public NNumber RParVacationExpense;
		@DbRecordField(dataSourceName="R_PAR_ENTERTAIN_COSTS")
		public NNumber RParEntertainCosts;
		@DbRecordField(dataSourceName="R_PAR_NBR_EMPLOYED")
		public NNumber RParNbrEmployed;
		@DbRecordField(dataSourceName="R_PAR_AMT_PD_HOME_EMPLOY")
		public NNumber RParAmtPdHomeEmploy;
		@DbRecordField(dataSourceName="R_PAR_OTH_EXPENSE")
		public NNumber RParOthExpense;
		@DbRecordField(dataSourceName="R_CURRENCY_CDE")
		public NString RCurrencyCde;
		@DbRecordField(dataSourceName="R_CURRENCY_RATE")
		public NNumber RCurrencyRate;
		@DbRecordField(dataSourceName="R_COUNTRY_COEFFICIENT")
		public NNumber RCountryCoefficient;
		@DbRecordField(dataSourceName="R_CONV_CURRENCY_CDE")
		public NString RConvCurrencyCde;
		@DbRecordField(dataSourceName="R_CONV_CURRENCY_RATE")
		public NNumber RConvCurrencyRate;
		@DbRecordField(dataSourceName="R_PAR_IPT_HOME_VALUE_OPT")
		public NString RParIptHomeValueOpt;
		@DbRecordField(dataSourceName="R_IPT_HOME_VALUE_OPT")
		public NString RIptHomeValueOpt;
		@DbRecordField(dataSourceName="R_PAR_BUS_TAX_RTRN_CDE_1")
		public NString RParBusTaxRtrnCde1;
		@DbRecordField(dataSourceName="R_PAR_BUS_TAX_RTRN_CDE_2")
		public NString RParBusTaxRtrnCde2;
		@DbRecordField(dataSourceName="R_PAR_BUS_TAX_RTRN_CDE_3")
		public NString RParBusTaxRtrnCde3;
		@DbRecordField(dataSourceName="R_PAR_BUS_TAX_RTRN_CDE_4")
		public NString RParBusTaxRtrnCde4;
		@DbRecordField(dataSourceName="R_PAR_BUS_TAX_RTRN_CDE_5")
		public NString RParBusTaxRtrnCde5;
		@DbRecordField(dataSourceName="R_PAR_BUS_TAX_RTRN_CDE_6")
		public NString RParBusTaxRtrnCde6;
		@DbRecordField(dataSourceName="R_PAR_BUS_TAX_RTRN_CDE_7")
		public NString RParBusTaxRtrnCde7;
		@DbRecordField(dataSourceName="R_PAR_BUS_TAX_RTRN_CDE_8")
		public NString RParBusTaxRtrnCde8;
		@DbRecordField(dataSourceName="R_PAR_BUS_TAX_RTRN_CDE_9")
		public NString RParBusTaxRtrnCde9;
		@DbRecordField(dataSourceName="R_TRAVEL_PAY_PLAN_CDE")
		public NString RTravelPayPlanCde;
		@DbRecordField(dataSourceName="R_FATHER_NAME")
		public NString RFatherName;
		@DbRecordField(dataSourceName="R_MOTHER_NAME")
		public NString RMotherName;
		@DbRecordField(dataSourceName="R_LINE4_NAME")
		public NString RLine4Name;
		@DbRecordField(dataSourceName="R_LINE5_NAME")
		public NString RLine5Name;
		@DbRecordField(dataSourceName="R_LINE6_NAME")
		public NString RLine6Name;
		@DbRecordField(dataSourceName="R_LINE7_NAME")
		public NString RLine7Name;
		@DbRecordField(dataSourceName="R_LINE8_NAME")
		public NString RLine8Name;
		@DbRecordField(dataSourceName="R_NON_CUST_PAR_NAME")
		public NString RNonCustParName;
		@DbRecordField(dataSourceName="R_EXPLANATIONS_TEXT")
		public NString RExplanationsText;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
