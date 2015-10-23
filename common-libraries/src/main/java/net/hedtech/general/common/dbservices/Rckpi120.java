package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rckpi120 {
		public static NString fGetVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKPI120.F_GET_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void pInsertRcrtmp1(NNumber pPidm,NString pAidyCode,NString pInfcCode,NNumber pSeqNo,NString pAcyrCode,List<StringNtRow> pAddlCollCdes,NString pAddr,NString pAddr2,NNumber pAfdc,NDate pBirthDate,NNumber pBusFarmDbt,NNumber pBusFarmVal,NNumber pCashAmt,NNumber pChildSupp,NString pCity,NString pCitzInd,NString pCollCde,List<StringNtRow> pCollCdes,NString pCreateDate,NString pDislWrk,NNumber pExpAcyrInc,NNumber pExpAcyrOthTaxInc,NNumber pExpAcyrUntaxInc,NNumber pExpFathIncFrWrk,NNumber pExpMothIncFrWrk,NNumber pExpParOthTaxInc,NNumber pExpParUntaxInc,NNumber pExpSmrInc,NNumber pExpSmrOthTaxInc,NNumber pExpSmrUntaxInc,NNumber pExpSpsAcyrInc,NNumber pExpSpsSmrInc,NNumber pFamMemb,NNumber pFathIncFrWrk,NString pFirstName,NString pHasLegalDepend,NNumber pHmeDbt,NNumber pHmeVal,List<StringNtRow> pHousCdes,NNumber pIncFrWrk,NString pLastName,NString pLine2AttendColl,NString pLine2Relship,NString pLine3AttendColl,NString pLine3Relship,List<StringNtRow> pLinesAttendColl,List<StringNtRow> pLinesRelship,NString pLowestIncFiler,NString pMailAddr,NString pMailAddr2,NString pMailCity,NString pMailCountryCde,NString pMailPostalCde,NString pMailStatCode,NString pMeansTestBen,NNumber pMedDenExp,NString pMi,NNumber pMothIncFrWrk,NString pMrtlStatus,NNumber pNoExempt,NNumber pNoInColl,NNumber pOthUntaxInc,NNumber pOthVaAmt,NNumber pOthVaMth,NNumber pParAdjToInc,NNumber pParAfdc,NNumber pParBusFarmInc,NNumber pParCashAmt,NNumber pParChildSupp,NString pParCntryCodeRes,NString pParDislWrk,NNumber pParDivInc,NNumber pParFamMemb,NNumber pParHmeDbt,NNumber pParHmePurchAmt,NNumber pParHmeVal,NNumber pParHmeYrPurch,NString pParHousStat,NNumber pParIntInc,NNumber pParIraDistributions,NString pParMeansTestBen,NNumber pParMedDenExp,NString pParMrtlStatus,NNumber pParNoChildTuit,NNumber pParNoExempt,NNumber pParNoInColl,NNumber pParOthTaxInc,NString pParRecdSsi,NString pParRecdTanf,NDate pParRemarriageDate,NNumber pParSsBene,NString pParStatCodeRes,NString pParTaxFormInd,NNumber pParTuitPd,NNumber pParUntaxPensions,NNumber pParUsInc,NNumber pParUsIncTaxPd,NNumber pParWages,NString pPhoneNo,NDate pRcptDate,NNumber pSpsIncFrWrk,NNumber pSsBene,NString pSsn,NString pStatCode,NString pStatCodeRes,NString pTaxFormInd,NString pTitle,NString pTypeVetBenefits,NNumber pUsInc,NNumber pUsIncTaxPd,NString pUsVet,NString pWardOfCourt,NString pYrInColl,NString pZip,NString pForeignAddrInd,NString pCssid,NNumber pParVetsNonEdBen) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKPI120.P_INSERT_RCRTMP1", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_INFC_CODE", pInfcCode);
//			cmd.addParameter("@P_SEQ_NO", pSeqNo);
//			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
//			// cmd.addParameter(DbTypes.getCollectionType("P_ADDL_COLL_CDES", "", pAddlCollCdes, object.class));
//			cmd.addParameter("@P_ADDR", pAddr);
//			cmd.addParameter("@P_ADDR2", pAddr2);
//			cmd.addParameter("@P_AFDC", pAfdc);
//			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
//			cmd.addParameter("@P_BUS_FARM_DBT", pBusFarmDbt);
//			cmd.addParameter("@P_BUS_FARM_VAL", pBusFarmVal);
//			cmd.addParameter("@P_CASH_AMT", pCashAmt);
//			cmd.addParameter("@P_CHILD_SUPP", pChildSupp);
//			cmd.addParameter("@P_CITY", pCity);
//			cmd.addParameter("@P_CITZ_IND", pCitzInd);
//			cmd.addParameter("@P_COLL_CDE", pCollCde);
//			// cmd.addParameter(DbTypes.getCollectionType("P_COLL_CDES", "", pCollCdes, object.class));
//			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
//			cmd.addParameter("@P_DISL_WRK", pDislWrk);
//			cmd.addParameter("@P_EXP_ACYR_INC", pExpAcyrInc);
//			cmd.addParameter("@P_EXP_ACYR_OTH_TAX_INC", pExpAcyrOthTaxInc);
//			cmd.addParameter("@P_EXP_ACYR_UNTAX_INC", pExpAcyrUntaxInc);
//			cmd.addParameter("@P_EXP_FATH_INC_FR_WRK", pExpFathIncFrWrk);
//			cmd.addParameter("@P_EXP_MOTH_INC_FR_WRK", pExpMothIncFrWrk);
//			cmd.addParameter("@P_EXP_PAR_OTH_TAX_INC", pExpParOthTaxInc);
//			cmd.addParameter("@P_EXP_PAR_UNTAX_INC", pExpParUntaxInc);
//			cmd.addParameter("@P_EXP_SMR_INC", pExpSmrInc);
//			cmd.addParameter("@P_EXP_SMR_OTH_TAX_INC", pExpSmrOthTaxInc);
//			cmd.addParameter("@P_EXP_SMR_UNTAX_INC", pExpSmrUntaxInc);
//			cmd.addParameter("@P_EXP_SPS_ACYR_INC", pExpSpsAcyrInc);
//			cmd.addParameter("@P_EXP_SPS_SMR_INC", pExpSpsSmrInc);
//			cmd.addParameter("@P_FAM_MEMB", pFamMemb);
//			cmd.addParameter("@P_FATH_INC_FR_WRK", pFathIncFrWrk);
//			cmd.addParameter("@P_FIRST_NAME", pFirstName);
//			cmd.addParameter("@P_HAS_LEGAL_DEPEND", pHasLegalDepend);
//			cmd.addParameter("@P_HME_DBT", pHmeDbt);
//			cmd.addParameter("@P_HME_VAL", pHmeVal);
//			// cmd.addParameter(DbTypes.getCollectionType("P_HOUS_CDES", "", pHousCdes, object.class));
//			cmd.addParameter("@P_INC_FR_WRK", pIncFrWrk);
//			cmd.addParameter("@P_LAST_NAME", pLastName);
//			cmd.addParameter("@P_LINE2_ATTEND_COLL", pLine2AttendColl);
//			cmd.addParameter("@P_LINE2_RELSHIP", pLine2Relship);
//			cmd.addParameter("@P_LINE3_ATTEND_COLL", pLine3AttendColl);
//			cmd.addParameter("@P_LINE3_RELSHIP", pLine3Relship);
//			// cmd.addParameter(DbTypes.getCollectionType("P_LINES_ATTEND_COLL", "", pLinesAttendColl, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_LINES_RELSHIP", "", pLinesRelship, object.class));
//			cmd.addParameter("@P_LOWEST_INC_FILER", pLowestIncFiler);
//			cmd.addParameter("@P_MAIL_ADDR", pMailAddr);
//			cmd.addParameter("@P_MAIL_ADDR2", pMailAddr2);
//			cmd.addParameter("@P_MAIL_CITY", pMailCity);
//			cmd.addParameter("@P_MAIL_COUNTRY_CDE", pMailCountryCde);
//			cmd.addParameter("@P_MAIL_POSTAL_CDE", pMailPostalCde);
//			cmd.addParameter("@P_MAIL_STAT_CODE", pMailStatCode);
//			cmd.addParameter("@P_MEANS_TEST_BEN", pMeansTestBen);
//			cmd.addParameter("@P_MED_DEN_EXP", pMedDenExp);
//			cmd.addParameter("@P_MI", pMi);
//			cmd.addParameter("@P_MOTH_INC_FR_WRK", pMothIncFrWrk);
//			cmd.addParameter("@P_MRTL_STATUS", pMrtlStatus);
//			cmd.addParameter("@P_NO_EXEMPT", pNoExempt);
//			cmd.addParameter("@P_NO_IN_COLL", pNoInColl);
//			cmd.addParameter("@P_OTH_UNTAX_INC", pOthUntaxInc);
//			cmd.addParameter("@P_OTH_VA_AMT", pOthVaAmt);
//			cmd.addParameter("@P_OTH_VA_MTH", pOthVaMth);
//			cmd.addParameter("@P_PAR_ADJ_TO_INC", pParAdjToInc);
//			cmd.addParameter("@P_PAR_AFDC", pParAfdc);
//			cmd.addParameter("@P_PAR_BUS_FARM_INC", pParBusFarmInc);
//			cmd.addParameter("@P_PAR_CASH_AMT", pParCashAmt);
//			cmd.addParameter("@P_PAR_CHILD_SUPP", pParChildSupp);
//			cmd.addParameter("@P_PAR_CNTRY_CODE_RES", pParCntryCodeRes);
//			cmd.addParameter("@P_PAR_DISL_WRK", pParDislWrk);
//			cmd.addParameter("@P_PAR_DIV_INC", pParDivInc);
//			cmd.addParameter("@P_PAR_FAM_MEMB", pParFamMemb);
//			cmd.addParameter("@P_PAR_HME_DBT", pParHmeDbt);
//			cmd.addParameter("@P_PAR_HME_PURCH_AMT", pParHmePurchAmt);
//			cmd.addParameter("@P_PAR_HME_VAL", pParHmeVal);
//			cmd.addParameter("@P_PAR_HME_YR_PURCH", pParHmeYrPurch);
//			cmd.addParameter("@P_PAR_HOUS_STAT", pParHousStat);
//			cmd.addParameter("@P_PAR_INT_INC", pParIntInc);
//			cmd.addParameter("@P_PAR_IRA_DISTRIBUTIONS", pParIraDistributions);
//			cmd.addParameter("@P_PAR_MEANS_TEST_BEN", pParMeansTestBen);
//			cmd.addParameter("@P_PAR_MED_DEN_EXP", pParMedDenExp);
//			cmd.addParameter("@P_PAR_MRTL_STATUS", pParMrtlStatus);
//			cmd.addParameter("@P_PAR_NO_CHILD_TUIT", pParNoChildTuit);
//			cmd.addParameter("@P_PAR_NO_EXEMPT", pParNoExempt);
//			cmd.addParameter("@P_PAR_NO_IN_COLL", pParNoInColl);
//			cmd.addParameter("@P_PAR_OTH_TAX_INC", pParOthTaxInc);
//			cmd.addParameter("@P_PAR_RECD_SSI", pParRecdSsi);
//			cmd.addParameter("@P_PAR_RECD_TANF", pParRecdTanf);
//			cmd.addParameter("@P_PAR_REMARRIAGE_DATE", pParRemarriageDate);
//			cmd.addParameter("@P_PAR_SS_BENE", pParSsBene);
//			cmd.addParameter("@P_PAR_STAT_CODE_RES", pParStatCodeRes);
//			cmd.addParameter("@P_PAR_TAX_FORM_IND", pParTaxFormInd);
//			cmd.addParameter("@P_PAR_TUIT_PD", pParTuitPd);
//			cmd.addParameter("@P_PAR_UNTAX_PENSIONS", pParUntaxPensions);
//			cmd.addParameter("@P_PAR_US_INC", pParUsInc);
//			cmd.addParameter("@P_PAR_US_INC_TAX_PD", pParUsIncTaxPd);
//			cmd.addParameter("@P_PAR_WAGES", pParWages);
//			cmd.addParameter("@P_PHONE_NO", pPhoneNo);
//			cmd.addParameter("@P_RCPT_DATE", pRcptDate);
//			cmd.addParameter("@P_SPS_INC_FR_WRK", pSpsIncFrWrk);
//			cmd.addParameter("@P_SS_BENE", pSsBene);
//			cmd.addParameter("@P_SSN", pSsn);
//			cmd.addParameter("@P_STAT_CODE", pStatCode);
//			cmd.addParameter("@P_STAT_CODE_RES", pStatCodeRes);
//			cmd.addParameter("@P_TAX_FORM_IND", pTaxFormInd);
//			cmd.addParameter("@P_TITLE", pTitle);
//			cmd.addParameter("@P_TYPE_VET_BENEFITS", pTypeVetBenefits);
//			cmd.addParameter("@P_US_INC", pUsInc);
//			cmd.addParameter("@P_US_INC_TAX_PD", pUsIncTaxPd);
//			cmd.addParameter("@P_US_VET", pUsVet);
//			cmd.addParameter("@P_WARD_OF_COURT", pWardOfCourt);
//			cmd.addParameter("@P_YR_IN_COLL", pYrInColl);
//			cmd.addParameter("@P_ZIP", pZip);
//			cmd.addParameter("@P_FOREIGN_ADDR_IND", pForeignAddrInd);
//			cmd.addParameter("@P_CSSID", pCssid);
//			cmd.addParameter("@P_PAR_VETS_NON_ED_BEN", pParVetsNonEdBen);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pInsertRcrtmp2(NNumber pPidm,NString pAidyCode,NString pInfcCode,NNumber pSeqNo,NString pC1AnlyType,NNumber pC1CtrbForStdt,NNumber pC1CtrbFrAsset,NNumber pC1CtrbFrInc,NNumber pC1TotInc,NNumber pCAge,NString pCAssumeYrInColl,NString pCDependStatus,NNumber pCFamMemb,NString pCMrtlStatus,NNumber pCNoInColl,NString pCPar1AnlyType,NNumber pCPar1CtrbForStdt,NNumber pCPar1CtrbFrAsset,NNumber pCPar1CtrbFrInc,NNumber pCPar1TotInc,NNumber pCParFamMemb,NString pCParMrtlStatus,NNumber pCParNoInColl,NString pEpsCde,NNumber pFmInst1FedEfc,NString pModelCde,NNumber pPellPgi,NString pTfcProInd,NString pAprdCode,NString pLastName,NString pCssid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKPI120.P_INSERT_RCRTMP2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_C_1_ANLY_TYPE", pC1AnlyType);
			cmd.addParameter("@P_C_1_CTRB_FOR_STDT", pC1CtrbForStdt);
			cmd.addParameter("@P_C_1_CTRB_FR_ASSET", pC1CtrbFrAsset);
			cmd.addParameter("@P_C_1_CTRB_FR_INC", pC1CtrbFrInc);
			cmd.addParameter("@P_C_1_TOT_INC", pC1TotInc);
			cmd.addParameter("@P_C_AGE", pCAge);
			cmd.addParameter("@P_C_ASSUME_YR_IN_COLL", pCAssumeYrInColl);
			cmd.addParameter("@P_C_DEPEND_STATUS", pCDependStatus);
			cmd.addParameter("@P_C_FAM_MEMB", pCFamMemb);
			cmd.addParameter("@P_C_MRTL_STATUS", pCMrtlStatus);
			cmd.addParameter("@P_C_NO_IN_COLL", pCNoInColl);
			cmd.addParameter("@P_C_PAR_1_ANLY_TYPE", pCPar1AnlyType);
			cmd.addParameter("@P_C_PAR_1_CTRB_FOR_STDT", pCPar1CtrbForStdt);
			cmd.addParameter("@P_C_PAR_1_CTRB_FR_ASSET", pCPar1CtrbFrAsset);
			cmd.addParameter("@P_C_PAR_1_CTRB_FR_INC", pCPar1CtrbFrInc);
			cmd.addParameter("@P_C_PAR_1_TOT_INC", pCPar1TotInc);
			cmd.addParameter("@P_C_PAR_FAM_MEMB", pCParFamMemb);
			cmd.addParameter("@P_C_PAR_MRTL_STATUS", pCParMrtlStatus);
			cmd.addParameter("@P_C_PAR_NO_IN_COLL", pCParNoInColl);
			cmd.addParameter("@P_EPS_CDE", pEpsCde);
			cmd.addParameter("@P_FM_INST_1_FED_EFC", pFmInst1FedEfc);
			cmd.addParameter("@P_MODEL_CDE", pModelCde);
			cmd.addParameter("@P_PELL_PGI", pPellPgi);
			cmd.addParameter("@P_TFC_PRO_IND", pTfcProInd);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_CSSID", pCssid);
				
			cmd.execute();


		}
		
//		public static void pInsertRcrtmp3(NNumber pPidm,NString pAidyCode,NString pInfcCode,NNumber pSeqNo,NString pAltOptHmeVal,NString pAltOptLossToZero,List<StringNtRow> pAssumptionMsgs,NNumber pChildSuppPaid,NString pGradOrProf,NNumber pInvestDbt,NNumber pInvestVal,NString pLiveOnFarm,NString pMrtlStatus,List<StringNtRow> pMsgNo,List<StringNtRow> pMsgValue,NNumber pParBusDbt,NNumber pParBusVal,NNumber pParChildSuppPaid,NNumber pParEic,NNumber pParFarmDbt,NNumber pParFarmVal,NNumber pParForIncExcl,NNumber pParHouseFoodOth,NNumber pParIncBenefits,NNumber pParInvestDbt,NNumber pParInvestVal,NNumber pParIraKeough,NString pParLiveOnFarm,NNumber pParMthMortRentPay,NNumber pParReDbt,NNumber pParReVal,NNumber pParTaxDefPension,NNumber pParTeIntInc,NNumber pParTuiFeeDed,NNumber pReDbt,NNumber pReVal,NString pLastName,NString pCssid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKPI120.P_INSERT_RCRTMP3", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_INFC_CODE", pInfcCode);
//			cmd.addParameter("@P_SEQ_NO", pSeqNo);
//			cmd.addParameter("@P_ALT_OPT_HME_VAL", pAltOptHmeVal);
//			cmd.addParameter("@P_ALT_OPT_LOSS_TO_ZERO", pAltOptLossToZero);
//			// cmd.addParameter(DbTypes.getCollectionType("P_ASSUMPTION_MSGS", "", pAssumptionMsgs, object.class));
//			cmd.addParameter("@P_CHILD_SUPP_PAID", pChildSuppPaid);
//			cmd.addParameter("@P_GRAD_OR_PROF", pGradOrProf);
//			cmd.addParameter("@P_INVEST_DBT", pInvestDbt);
//			cmd.addParameter("@P_INVEST_VAL", pInvestVal);
//			cmd.addParameter("@P_LIVE_ON_FARM", pLiveOnFarm);
//			cmd.addParameter("@P_MRTL_STATUS", pMrtlStatus);
//			// cmd.addParameter(DbTypes.getCollectionType("P_MSG_NO", "", pMsgNo, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_MSG_VALUE", "", pMsgValue, object.class));
//			cmd.addParameter("@P_PAR_BUS_DBT", pParBusDbt);
//			cmd.addParameter("@P_PAR_BUS_VAL", pParBusVal);
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
//			cmd.addParameter("@P_PAR_RE_DBT", pParReDbt);
//			cmd.addParameter("@P_PAR_RE_VAL", pParReVal);
//			cmd.addParameter("@P_PAR_TAX_DEF_PENSION", pParTaxDefPension);
//			cmd.addParameter("@P_PAR_TE_INT_INC", pParTeIntInc);
//			cmd.addParameter("@P_PAR_TUI_FEE_DED", pParTuiFeeDed);
//			cmd.addParameter("@P_RE_DBT", pReDbt);
//			cmd.addParameter("@P_RE_VAL", pReVal);
//			cmd.addParameter("@P_LAST_NAME", pLastName);
//			cmd.addParameter("@P_CSSID", pCssid);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void pInsertRcrtmp4(NNumber pPidm,NString pAidyCode,NString pInfcCode,NNumber pSeqNo,NString pAdoptedAfter13,NString pAltOptTuit,NNumber pCInst1TotFamCtrb,NNumber pCNa1CtrbForStdt,NString pCNa1PAnlyType,NNumber pCNa1PCtrbForStdt,NNumber pCNa1PellPgi,NNumber pCombatPay,NNumber pCustParBasePctInc,NString pEmailAddress,NNumber pExpParNoChildTuit,NNumber pExpParTuitPd,NDate pFathBirthDate,NString pFeeWaiverInd,NNumber pHmePurchAmt,NNumber pHmeYrPurch,NString pHomeless,NString pMdeIdNo,NDate pMothBirthDate,NString pPEmailAddress,NString pPar1Employer,NString pPar1Occupation,NString pPar2Employer,NString pPar2Occupation,NNumber pParBaseCtrbAssets,NNumber pParBaseCtrbInc,NNumber pParBaseTotCtrb,NNumber pParCombatPay,NNumber pParDepCareAndMed,NNumber pParNumBusinesses,NNumber pParNumFarms,NString pParTxRetFiledInd,NString pParentType1,NString pParentType2,NString pRecType,NNumber pSDivIntInc,NNumber pSarEfc,NString pSectRWrittenExplain,NString pTxRetFiledInd,NString pVisaClass,NString pCustodialParent,List<StringNtRow> pMsgNo,List<StringNtRow> pMsgValue,NString pCNa1AnlyType,NString pLastName,NString pCssid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKPI120.P_INSERT_RCRTMP4", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_INFC_CODE", pInfcCode);
//			cmd.addParameter("@P_SEQ_NO", pSeqNo);
//			cmd.addParameter("@P_ADOPTED_AFTER_13", pAdoptedAfter13);
//			cmd.addParameter("@P_ALT_OPT_TUIT", pAltOptTuit);
//			cmd.addParameter("@P_C_INST_1_TOT_FAM_CTRB", pCInst1TotFamCtrb);
//			cmd.addParameter("@P_C_NA_1_CTRB_FOR_STDT", pCNa1CtrbForStdt);
//			cmd.addParameter("@P_C_NA_1_P_ANLY_TYPE", pCNa1PAnlyType);
//			cmd.addParameter("@P_C_NA_1_P_CTRB_FOR_STDT", pCNa1PCtrbForStdt);
//			cmd.addParameter("@P_C_NA_1_PELL_PGI", pCNa1PellPgi);
//			cmd.addParameter("@P_COMBAT_PAY", pCombatPay);
//			cmd.addParameter("@P_CUST_PAR_BASE_PCT_INC", pCustParBasePctInc);
//			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
//			cmd.addParameter("@P_EXP_PAR_NO_CHILD_TUIT", pExpParNoChildTuit);
//			cmd.addParameter("@P_EXP_PAR_TUIT_PD", pExpParTuitPd);
//			cmd.addParameter("@P_FATH_BIRTH_DATE", pFathBirthDate);
//			cmd.addParameter("@P_FEE_WAIVER_IND", pFeeWaiverInd);
//			cmd.addParameter("@P_HME_PURCH_AMT", pHmePurchAmt);
//			cmd.addParameter("@P_HME_YR_PURCH", pHmeYrPurch);
//			cmd.addParameter("@P_HOMELESS", pHomeless);
//			cmd.addParameter("@P_MDE_ID_NO", pMdeIdNo);
//			cmd.addParameter("@P_MOTH_BIRTH_DATE", pMothBirthDate);
//			cmd.addParameter("@P_P_EMAIL_ADDRESS", pPEmailAddress);
//			cmd.addParameter("@P_PAR1_EMPLOYER", pPar1Employer);
//			cmd.addParameter("@P_PAR1_OCCUPATION", pPar1Occupation);
//			cmd.addParameter("@P_PAR2_EMPLOYER", pPar2Employer);
//			cmd.addParameter("@P_PAR2_OCCUPATION", pPar2Occupation);
//			cmd.addParameter("@P_PAR_BASE_CTRB_ASSETS", pParBaseCtrbAssets);
//			cmd.addParameter("@P_PAR_BASE_CTRB_INC", pParBaseCtrbInc);
//			cmd.addParameter("@P_PAR_BASE_TOT_CTRB", pParBaseTotCtrb);
//			cmd.addParameter("@P_PAR_COMBAT_PAY", pParCombatPay);
//			cmd.addParameter("@P_PAR_DEP_CARE_AND_MED", pParDepCareAndMed);
//			cmd.addParameter("@P_PAR_NUM_BUSINESSES", pParNumBusinesses);
//			cmd.addParameter("@P_PAR_NUM_FARMS", pParNumFarms);
//			cmd.addParameter("@P_PAR_TX_RET_FILED_IND", pParTxRetFiledInd);
//			cmd.addParameter("@P_PARENT_TYPE_1", pParentType1);
//			cmd.addParameter("@P_PARENT_TYPE_2", pParentType2);
//			cmd.addParameter("@P_REC_TYPE", pRecType);
//			cmd.addParameter("@P_S_DIV_INT_INC", pSDivIntInc);
//			cmd.addParameter("@P_SAR_EFC", pSarEfc);
//			cmd.addParameter("@P_SECT_R_WRITTEN_EXPLAIN", pSectRWrittenExplain);
//			cmd.addParameter("@P_TX_RET_FILED_IND", pTxRetFiledInd);
//			cmd.addParameter("@P_VISA_CLASS", pVisaClass);
//			cmd.addParameter("@P_CUSTODIAL_PARENT", pCustodialParent);
//			// cmd.addParameter(DbTypes.getCollectionType("P_MSG_NO", "", pMsgNo, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_MSG_VALUE", "", pMsgValue, object.class));
//			cmd.addParameter("@P_C_NA_1_ANLY_TYPE", pCNa1AnlyType);
//			cmd.addParameter("@P_LAST_NAME", pLastName);
//			cmd.addParameter("@P_CSSID", pCssid);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void pInsertRcrtmp5(NNumber pPidm,NString pAidyCode,NString pInfcCode,NNumber pSeqNo,NString pAesa,NString pAltIraKeogh,NString pAltSumAyInc,NString pApplicType,NString pCesa,NString pCitzCountry,NString pConvCurrencyCde,NString pConvCurrencyRate,NString pCountry,NString pCountryCoefficient,NString pCurrencyCde,NString pCurrencyRate,NString pCustParCtrbAdjOpt,NNumber pEic,NString pExpFoundSuppInd,NString pExpGovSuppInd,NNumber pExpGrantSchlrshp,NNumber pExpOthCtrb,NNumber pExpParChildSuppPd,NNumber pExpParCtrb,NNumber pExpParEdLnRpayAmt,NNumber pExpParMedDenExpn,NNumber pExpTuitBene,NString pExpTuitBenefitInd,NNumber pFathRetAcctVal,NString pFinAidStatus,NNumber pFmInst1PellAwd,NString pForeignAddrInd,NString pForeignPostalCde,NNumber pHopeLlCredit,NString pHopeLlCreditOpt,NString pIptAssetsOpt,NNumber pIraKeoghAcctVal,NNumber pItemDeductns,NNumber pLine2Age,NString pLine2SchlType,NNumber pLine3Age,NString pLine3SchlType,List<StringNtRow> pLinesAge,List<StringNtRow> pLinesSchlType,NNumber pMothRetAcctVal,NString pOwnBusHmSelfEmp,NNumber pParAddlChildTxCred,NString pParAesa,NNumber pParAmtPdHomeEmploy,NNumber pParAnnualDebtPay,NNumber pParAutoExpense,NString pParCesa,NNumber pParClothingExpense,NString pParColaAdjValueOpt,NString pParColaAltAdjOpt,NNumber pParDebtExpense,NNumber pParEdLnRpayAmt,NNumber pParEntertainCosts,NNumber pParFamSupportInc,NNumber pParFoodExpense,NNumber pParHopeLlCredit,NString pParHopeLlCreditOpt,NNumber pParHouseholdExpense,NNumber pParImOthUntaxedInc,NNumber pParIncFromDebts,NString pParIptAssetsOpt,NNumber pParItemDeductns,NNumber pParMilHousAllow,NNumber pParNbrEmployed,NString pParNtrlSepDiv,NNumber pParOptCtrbForStdt,NNumber pParOptCtrbFrAsset,NNumber pParOptCtrbFrInc,NNumber pParOptTotInc,NNumber pParOthReYrPurch,NNumber pParOthRePurchAmt,NNumber pParOtherAssets,NNumber pParOthExpense,NNumber pParOwedByOthers,NNumber pParPropertyInsur,NNumber pParPryrAgi,NNumber pParPryrItemDeductns,NNumber pParPryrUntaxInc,NNumber pParPryrUsTaxPd,NString pParSelfEmployed,NNumber pParSiblingAssets,NString pParSmallBusiness,NString pParStuFamAssetsOpt,NNumber pParUtilitiesExpense,NNumber pParVacationExpense,NString pParYrDiv,NString pParYrSep,NNumber pPcNonCustPar,NDate pRegisRcptDate,NString pSAltOptHmeVal,NNumber pSOptCtrbForStdt,NNumber pSOptCtrbFrAsset,NNumber pSOptCtrbFrInc,NNumber pSOptTotInc,NString pSchoolAssignedId,NString pSmallBusiness,NString pStuLivesWith,NString pStuMostSupportFrom,NNumber pTaxStuAid,NNumber pTrustAmt,NString pTrustAvailInd,NString pTrustEstabBy,List<StringNtRow> pMsgNo,List<StringNtRow> pMsgValue,List<StringNtRow> pMsgValue2,NString pLastName,NString pCssid,List<StringNtRow> pCollCdes,List<StringNtRow> pHousCdes,List<StringNtRow> pAddlCollCdes,NString pIptHomeValueOpt,NString pParIptHomeValueOpt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKPI120.P_INSERT_RCRTMP5", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_INFC_CODE", pInfcCode);
//			cmd.addParameter("@P_SEQ_NO", pSeqNo);
//			cmd.addParameter("@P_AESA", pAesa);
//			cmd.addParameter("@P_ALT_IRA_KEOGH", pAltIraKeogh);
//			cmd.addParameter("@P_ALT_SUM_AY_INC", pAltSumAyInc);
//			cmd.addParameter("@P_APPLIC_TYPE", pApplicType);
//			cmd.addParameter("@P_CESA", pCesa);
//			cmd.addParameter("@P_CITZ_COUNTRY", pCitzCountry);
//			cmd.addParameter("@P_CONV_CURRENCY_CDE", pConvCurrencyCde);
//			cmd.addParameter("@P_CONV_CURRENCY_RATE", pConvCurrencyRate);
//			cmd.addParameter("@P_COUNTRY", pCountry);
//			cmd.addParameter("@P_COUNTRY_COEFFICIENT", pCountryCoefficient);
//			cmd.addParameter("@P_CURRENCY_CDE", pCurrencyCde);
//			cmd.addParameter("@P_CURRENCY_RATE", pCurrencyRate);
//			cmd.addParameter("@P_CUST_PAR_CTRB_ADJ_OPT", pCustParCtrbAdjOpt);
//			cmd.addParameter("@P_EIC", pEic);
//			cmd.addParameter("@P_EXP_FOUND_SUPP_IND", pExpFoundSuppInd);
//			cmd.addParameter("@P_EXP_GOV_SUPP_IND", pExpGovSuppInd);
//			cmd.addParameter("@P_EXP_GRANT_SCHLRSHP", pExpGrantSchlrshp);
//			cmd.addParameter("@P_EXP_OTH_CTRB", pExpOthCtrb);
//			cmd.addParameter("@P_EXP_PAR_CHILD_SUPP_PD", pExpParChildSuppPd);
//			cmd.addParameter("@P_EXP_PAR_CTRB", pExpParCtrb);
//			cmd.addParameter("@P_EXP_PAR_ED_LN_RPAY_AMT", pExpParEdLnRpayAmt);
//			cmd.addParameter("@P_EXP_PAR_MED_DEN_EXPN", pExpParMedDenExpn);
//			cmd.addParameter("@P_EXP_TUIT_BENE", pExpTuitBene);
//			cmd.addParameter("@P_EXP_TUIT_BENEFIT_IND", pExpTuitBenefitInd);
//			cmd.addParameter("@P_FATH_RET_ACCT_VAL", pFathRetAcctVal);
//			cmd.addParameter("@P_FIN_AID_STATUS", pFinAidStatus);
//			cmd.addParameter("@P_FM_INST_1_PELL_AWD", pFmInst1PellAwd);
//			cmd.addParameter("@P_FOREIGN_ADDR_IND", pForeignAddrInd);
//			cmd.addParameter("@P_FOREIGN_POSTAL_CDE", pForeignPostalCde);
//			cmd.addParameter("@P_HOPE_LL_CREDIT", pHopeLlCredit);
//			cmd.addParameter("@P_HOPE_LL_CREDIT_OPT", pHopeLlCreditOpt);
//			cmd.addParameter("@P_IPT_ASSETS_OPT", pIptAssetsOpt);
//			cmd.addParameter("@P_IRA_KEOGH_ACCT_VAL", pIraKeoghAcctVal);
//			cmd.addParameter("@P_ITEM_DEDUCTNS", pItemDeductns);
//			cmd.addParameter("@P_LINE2_AGE", pLine2Age);
//			cmd.addParameter("@P_LINE2_SCHL_TYPE", pLine2SchlType);
//			cmd.addParameter("@P_LINE3_AGE", pLine3Age);
//			cmd.addParameter("@P_LINE3_SCHL_TYPE", pLine3SchlType);
//			// cmd.addParameter(DbTypes.getCollectionType("P_LINES_AGE", "", pLinesAge, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_LINES_SCHL_TYPE", "", pLinesSchlType, object.class));
//			cmd.addParameter("@P_MOTH_RET_ACCT_VAL", pMothRetAcctVal);
//			cmd.addParameter("@P_OWN_BUS_HM_SELF_EMP", pOwnBusHmSelfEmp);
//			cmd.addParameter("@P_PAR_ADDL_CHILD_TX_CRED", pParAddlChildTxCred);
//			cmd.addParameter("@P_PAR_AESA", pParAesa);
//			cmd.addParameter("@P_PAR_AMT_PD_HOME_EMPLOY", pParAmtPdHomeEmploy);
//			cmd.addParameter("@P_PAR_ANNUAL_DEBT_PAY", pParAnnualDebtPay);
//			cmd.addParameter("@P_PAR_AUTO_EXPENSE", pParAutoExpense);
//			cmd.addParameter("@P_PAR_CESA", pParCesa);
//			cmd.addParameter("@P_PAR_CLOTHING_EXPENSE", pParClothingExpense);
//			cmd.addParameter("@P_PAR_COLA_ADJ_VALUE_OPT", pParColaAdjValueOpt);
//			cmd.addParameter("@P_PAR_COLA_ALT_ADJ_OPT", pParColaAltAdjOpt);
//			cmd.addParameter("@P_PAR_DEBT_EXPENSE", pParDebtExpense);
//			cmd.addParameter("@P_PAR_ED_LN_RPAY_AMT", pParEdLnRpayAmt);
//			cmd.addParameter("@P_PAR_ENTERTAIN_COSTS", pParEntertainCosts);
//			cmd.addParameter("@P_PAR_FAM_SUPPORT_INC", pParFamSupportInc);
//			cmd.addParameter("@P_PAR_FOOD_EXPENSE", pParFoodExpense);
//			cmd.addParameter("@P_PAR_HOPE_LL_CREDIT", pParHopeLlCredit);
//			cmd.addParameter("@P_PAR_HOPE_LL_CREDIT_OPT", pParHopeLlCreditOpt);
//			cmd.addParameter("@P_PAR_HOUSEHOLD_EXPENSE", pParHouseholdExpense);
//			cmd.addParameter("@P_PAR_IM_OTH_UNTAXED_INC", pParImOthUntaxedInc);
//			cmd.addParameter("@P_PAR_INC_FROM_DEBTS", pParIncFromDebts);
//			cmd.addParameter("@P_PAR_IPT_ASSETS_OPT", pParIptAssetsOpt);
//			cmd.addParameter("@P_PAR_ITEM_DEDUCTNS", pParItemDeductns);
//			cmd.addParameter("@P_PAR_MIL_HOUS_ALLOW", pParMilHousAllow);
//			cmd.addParameter("@P_PAR_NBR_EMPLOYED", pParNbrEmployed);
//			cmd.addParameter("@P_PAR_NTRL_SEP_DIV", pParNtrlSepDiv);
//			cmd.addParameter("@P_PAR_OPT_CTRB_FOR_STDT", pParOptCtrbForStdt);
//			cmd.addParameter("@P_PAR_OPT_CTRB_FR_ASSET", pParOptCtrbFrAsset);
//			cmd.addParameter("@P_PAR_OPT_CTRB_FR_INC", pParOptCtrbFrInc);
//			cmd.addParameter("@P_PAR_OPT_TOT_INC", pParOptTotInc);
//			cmd.addParameter("@P_PAR_OTH_RE_YR_PURCH", pParOthReYrPurch);
//			cmd.addParameter("@P_PAR_OTH_RE_PURCH_AMT", pParOthRePurchAmt);
//			cmd.addParameter("@P_PAR_OTHER_ASSETS", pParOtherAssets);
//			cmd.addParameter("@P_PAR_OTH_EXPENSE", pParOthExpense);
//			cmd.addParameter("@P_PAR_OWED_BY_OTHERS", pParOwedByOthers);
//			cmd.addParameter("@P_PAR_PROPERTY_INSUR", pParPropertyInsur);
//			cmd.addParameter("@P_PAR_PRYR_AGI", pParPryrAgi);
//			cmd.addParameter("@P_PAR_PRYR_ITEM_DEDUCTNS", pParPryrItemDeductns);
//			cmd.addParameter("@P_PAR_PRYR_UNTAX_INC", pParPryrUntaxInc);
//			cmd.addParameter("@P_PAR_PRYR_US_TAX_PD", pParPryrUsTaxPd);
//			cmd.addParameter("@P_PAR_SELF_EMPLOYED", pParSelfEmployed);
//			cmd.addParameter("@P_PAR_SIBLING_ASSETS", pParSiblingAssets);
//			cmd.addParameter("@P_PAR_SMALL_BUSINESS", pParSmallBusiness);
//			cmd.addParameter("@P_PAR_STU_FAM_ASSETS_OPT", pParStuFamAssetsOpt);
//			cmd.addParameter("@P_PAR_UTILITIES_EXPENSE", pParUtilitiesExpense);
//			cmd.addParameter("@P_PAR_VACATION_EXPENSE", pParVacationExpense);
//			cmd.addParameter("@P_PAR_YR_DIV", pParYrDiv);
//			cmd.addParameter("@P_PAR_YR_SEP", pParYrSep);
//			cmd.addParameter("@P_PC_NON_CUST_PAR", pPcNonCustPar);
//			cmd.addParameter("@P_REGIS_RCPT_DATE", pRegisRcptDate);
//			cmd.addParameter("@P_S_ALT_OPT_HME_VAL", pSAltOptHmeVal);
//			cmd.addParameter("@P_S_OPT_CTRB_FOR_STDT", pSOptCtrbForStdt);
//			cmd.addParameter("@P_S_OPT_CTRB_FR_ASSET", pSOptCtrbFrAsset);
//			cmd.addParameter("@P_S_OPT_CTRB_FR_INC", pSOptCtrbFrInc);
//			cmd.addParameter("@P_S_OPT_TOT_INC", pSOptTotInc);
//			cmd.addParameter("@P_SCHOOL_ASSIGNED_ID", pSchoolAssignedId);
//			cmd.addParameter("@P_SMALL_BUSINESS", pSmallBusiness);
//			cmd.addParameter("@P_STU_LIVES_WITH", pStuLivesWith);
//			cmd.addParameter("@P_STU_MOST_SUPPORT_FROM", pStuMostSupportFrom);
//			cmd.addParameter("@P_TAX_STU_AID", pTaxStuAid);
//			cmd.addParameter("@P_TRUST_AMT", pTrustAmt);
//			cmd.addParameter("@P_TRUST_AVAIL_IND", pTrustAvailInd);
//			cmd.addParameter("@P_TRUST_ESTAB_BY", pTrustEstabBy);
//			// cmd.addParameter(DbTypes.getCollectionType("P_MSG_NO", "", pMsgNo, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_MSG_VALUE", "", pMsgValue, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_MSG_VALUE2", "", pMsgValue2, object.class));
//			cmd.addParameter("@P_LAST_NAME", pLastName);
//			cmd.addParameter("@P_CSSID", pCssid);
//			// cmd.addParameter(DbTypes.getCollectionType("P_COLL_CDES", "", pCollCdes, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_HOUS_CDES", "", pHousCdes, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_ADDL_COLL_CDES", "", pAddlCollCdes, object.class));
//			cmd.addParameter("@P_IPT_HOME_VALUE_OPT", pIptHomeValueOpt);
//			cmd.addParameter("@P_PAR_IPT_HOME_VALUE_OPT", pParIptHomeValueOpt);
//				
//			cmd.execute();
//
//
//		}
		
//		public static void pInsertRcrtmp6(NNumber pPidm,NString pAidyCode,NString pInfcCode,List<StringNtRow> pValues,List<StringNtRow> pNumbers,NString pLastName,NString pCssid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKPI120.P_INSERT_RCRTMP6", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_INFC_CODE", pInfcCode);
//			// cmd.addParameter(DbTypes.getCollectionType("P_VALUES", "", pValues, object.class));
//			// cmd.addParameter(DbTypes.getCollectionType("P_NUMBERS", "", pNumbers, object.class));
//			cmd.addParameter("@P_LAST_NAME", pLastName);
//			cmd.addParameter("@P_CSSID", pCssid);
//				
//			cmd.execute();
//
//
//		}
		
		public static void pInsertRctrecr(NNumber pPidm,NString pTermCode,NString pInfcCode,NString pAidyCode,NString pLastName,NString pCssid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKPI120.P_INSERT_RCTRECR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_CSSID", pCssid);
				
			cmd.execute();


		}
		
		public static void pInsertRctrsrc(NNumber pPidm,NString pTermCode,NString pSbgiCode,NString pPrimarySrceInd,NString pInfcCode,NString pAidyCode,NString pLastName,NString pCssid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKPI120.P_INSERT_RCTRSRC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SBGI_CODE", pSbgiCode);
			cmd.addParameter("@P_PRIMARY_SRCE_IND", pPrimarySrceInd);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_CSSID", pCssid);
				
			cmd.execute();


		}
		
		public static void pInsertRotaddr(NNumber pPidm,NString pAtypCode,NString pStreetLine1,NString pStreetLine2,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pPhoneNumber,NString pTeleCode,NString pInfcCode,NString pAidyCode,NString pLastName,NString pCssid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKPI120.P_INSERT_ROTADDR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_PHONE_NUMBER", pPhoneNumber);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_CSSID", pCssid);
				
			cmd.execute();


		}
		
		public static void pInsertRotemal(NNumber pPidm,NString pEmalCode,NString pEmailAddress,NString pInfcCode,NString pAidyCode,NString pLastName,NString pCssid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKPI120.P_INSERT_ROTEMAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMAL_CODE", pEmalCode);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_CSSID", pCssid);
				
			cmd.execute();


		}
		
		public static void pInsertRotiden(NNumber pPidm,NString pId,NString pLastName,NString pFirstName,NString pMi,NString pInfcCode,NString pAidyCode,NString pSsn,NString pCssid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKPI120.P_INSERT_ROTIDEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_CSSID", pCssid);
				
			cmd.execute();


		}
		
		public static void pInsertRotpers(NNumber pPidm,NString pSsn,NDate pBirthDate,NString pMrtlCode,NString pSex,NString pNamePrefix,NString pInfcCode,NString pAidyCode,NString pCitzInd,NString pLastName,NString pCssid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKPI120.P_INSERT_ROTPERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_MRTL_CODE", pMrtlCode);
			cmd.addParameter("@P_SEX", pSex);
			cmd.addParameter("@P_NAME_PREFIX", pNamePrefix);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CITZ_IND", pCitzInd);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_CSSID", pCssid);
				
			cmd.execute();


		}
		
		public static void pInsertRotstat(NNumber pPidm,NString pAidyCode,NString pRecalcNaInd,NDate pApplRcvdDate,NString pAprdCode,NString pInfcCode,NString pLastName,NString pCssid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKPI120.P_INSERT_ROTSTAT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_RECALC_NA_IND", pRecalcNaInd);
			cmd.addParameter("@P_APPL_RCVD_DATE", pApplRcvdDate);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_CSSID", pCssid);
				
			cmd.execute();


		}
		
		public static void pInsertRptcont(NNumber pPidm,NString pCtypCode,NString pInfcCode,NString pAidyCode,NString pLastName,NString pCssid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKPI120.P_INSERT_RPTCONT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_CSSID", pCssid);
				
			cmd.execute();


		}
		
	
	
	
}
