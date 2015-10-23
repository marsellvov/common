package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbTempAppP1 {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P1.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P1.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(TempAppP1RecRow recOne,TempAppP1RecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P1.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, TempAppP1RecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, TempAppP1RecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P1.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P1.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P1.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P1.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
//		public static void pCreate(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pCurrRecInd,NString pCreatorId,NString pUserId,NDate pCreateDate,NString pCollCde,NString pAcyrCode,NString pLastName,NString pFirstName,NString pMi,NString pTitle,NString pAddr,NString pCity,NString pStatCode,NString pZip,NString pSsnPrefix,NString pSsn,NDate pBirthDate,NString pPhoneArea,NString pPhoneNo,NString pStatCodeRes,NString pStartResMthYr,NDate pRcptDate,NDate pRevRcptDate,NDate pOrigCompDate,NDate pRevCompDate,NString pCitzInd,NString pAlienRegNo,NString pMrtlStatus,NString pHsCde,NString pExpEnrollStatus,NString pYrInColl,NString pCrseOfStudy,NString pExpGradMthYr,NString pDegreeByJuly,NString pMoreThan3PrevColl,NNumber pNoSch,NString pPrevColl1,NString pPrevColl2,NString pPrevColl3,NString pDriverLicNo,NString pStatCodeLic,NString pDislWrk,NString pDispHme,NNumber pFamMemb,NNumber pNoInColl,NNumber pCashAmt,NNumber pHmeVal,NNumber pHmeDbt,NNumber pReInvVal,NNumber pReInvDbt,NNumber pBusFarmVal,NNumber pBusFarmDbt,NString pInclFarm,NString pBornBefore11Xx,NString pUsVet,NString pWardOfCourt,NString pHasLegalDepend,NString pTaxFormInd,NNumber pNoExempt,NNumber pUsInc,NNumber pUsIncTaxPd,NNumber pIncFrWrk,NNumber pSpsIncFrWrk,NNumber pSsBene,NNumber pAfdc,NNumber pChildSupp,NNumber pOthUntaxInc,NNumber pMedDenExp,NNumber pTuitPd,NNumber pNoChildTuit,NNumber pExpTaxPd,NNumber pExpIncFrWrk,NNumber pExpSpsIncFrWrk,NNumber pExpOthTaxInc,NNumber pExpUntaxInc,NNumber pExpSmrInc,NNumber pExpAcyrInc,NNumber pExpSpsSmrInc,NNumber pExpSpsAcyrInc,NNumber pExpSmrOthTaxInc,NNumber pExpAcyrOthTaxInc,NNumber pExpSmrUntaxInc,NNumber pExpAcyrUntaxInc,NNumber pGiDeabAmt,NNumber pGiDeabMth,NNumber pVeapBenAmt,NNumber pVeapBenMth,NNumber pOthVaAmt,NNumber pOthVaMth,NString pClmAsTaxExempt2yr,NString pClmAsTaxExempt1yr,NString pClmAsTaxExempt,NString pWhenRcvdAid,NString p1985Rsrc40008788,NString p1986Rsrc40008788,NString p1986Rsrc40008889,NString p1987Rsrc40008889,NString p1987Rsrc40008990,NString p1988Rsrc40008990,NString p1988Rsrc40009091,NString p1989Rsrc40009091,NString pNoAidRsrc40002yr,NString pNoAidRsrc40001yr,NString pLine2Relship,NString pLine2AttendColl,NString pLine3Relship,NString pLine3AttendColl,NString pLine4Relship,NString pLine4AttendColl,NString pLine5Relship,NString pLine5AttendColl,NString pLine6Relship,NString pLine6AttendColl,NString pLine7Relship,NString pLine7AttendColl,NString pLine8Relship,NString pLine8AttendColl,NString pParMrtlStatus,NNumber pParOlderAge,NString pParStatCodeRes,NString pParDislWrk,NString pParDispHme,NNumber pParFamMemb,NNumber pParNoInColl,NNumber pParCashAmt,NNumber pParHmeVal,NNumber pParHmeDbt,NNumber pParReInvVal,NNumber pParReInvDbt,NNumber pParCurrInvVal,NNumber pParBusFarmVal,NNumber pParBusFarmDbt,NString pParInclFarm,NNumber pParHmeYrPurch,NNumber pParHmePurchAmt,NString pParDivSepRemInd,NString pParTaxFormInd,NNumber pParNoExempt,NNumber pParUsInc,NNumber pParWages,NNumber pParIntInc,NNumber pParDivInc,NNumber pParBusFarmInc,NNumber pParOthTaxInc,NNumber pParAdjToInc,NNumber pParUsIncTaxPd,NNumber pFathIncFrWrk,NNumber pMothIncFrWrk,NNumber pParSsBene,NNumber pParAfdc,NNumber pParChildSupp,NNumber pParOthUntaxInc,NNumber pParMedDenExp,NNumber pParTuitPd,NNumber pParNoChildTuit,NNumber pExpParTaxPd,NNumber pExpParOthTaxInc,NNumber pExpParUntaxInc,NNumber pExpFathIncFrWrk,NNumber pExpMothIncFrWrk,NString pFedCollChoice1,NString pFedCollChoice2,NString pFedCollChoice3,NString pCollChoiceNo,NString pInDefault,NString pOwesRefund,NString pConsiderForStaf,NNumber pBalOnAllStaf,NNumber pRecentStafBal,NString pRecentStafIntRate,NString pRecentStafFrMthYr,NString pRecentStafToMthYr,NString pRecentStafClass,NString pRqstFaPref,NString pRqstFaFrMthYr,NString pRqstFaToMthYr,NNumber pRqstStafAmt,NString pRqstStafFaFrMthYr,NString pRqstStafFaToMthYr,NString pRqstFaSummerThisYr,NString pRqstFaFallThisYr,NString pRqstFaWinterNextYr,NString pRqstFaSpringNextYr,NString pRqstFaSummerNextYr,NString pRqstFaOther,NString pClassification,NString pExpWrkHrs,NString pInstHousCde,NString pCollCde1,NString pHousCde1,NString pCollCde2,NString pHousCde2,NString pCollCde3,NString pHousCde3,NString pCollCde4,NString pHousCde4,NString pCollCde5,NString pHousCde5,NString pCollCde6,NString pHousCde6,NString pCollCde7,NString pHousCde7,NString pCollCde8,NString pHousCde8,NString pAddlCollCde1,NString pAddlCollCde2,NString pAddlCollCde3,NString pAddlCollCde4,NString pAddlCollCde5,NString pAddlCollCde6,NString pAddlCollCde7,NString pAddlCollCde8,NString pExtraRequest,NString pRelToState,NString pRelToUsEd,NString pRelUsEdToState,NString pRelUsEdToColl,NString pBusFarmSuppFiled,NString pSigned,NString pSignedSps,NString pSignedFath,NString pSignedMoth,NString pSignedPar,NString pSignedMthDay,NString pSignedYr,NNumber pDependAge05,NNumber pDependAge612,NNumber pDependAge13Plus,NString pContWrkAcyr,NString pPermitDraftReg,NString pPellRelMsg,NString pStAgencyRelMsg,NString pVerificationMsg,NString pVerificationPrty,NString pIns,NString pSelectiveService,NString pSpecCondInd,NString pTitleIvDefault,NString pInasOption,NString pEdeSource,NString pEdeSpecCondInd,NString pUsedTransNo,NString pDefMatchRegion,NString pPrevColl4,NString p1989Rsrc40009192,NString p1990Rsrc40009192,NString pInDefOweRef,NNumber pParSsBeneStuOnly,NDate pCompletionDate,NDate pParRemarriageDate,NString pLowestIncFiler,NString pMeansTestBen,NString pParRecdTanf,NString pParRecdSsi,NString pParMeansTestBen,NString pParHousStat,NString pActiveDuty,NString pParFoodStamps,NString pParSchoolLunch,NString pParRecdWic,NString pRecdSsi,NString pFoodStamps,NString pSchoolLunch,NString pRecdTanf,NString pRecdWic,NString pSurnamePrefix,NString pCtryCodePhone,NString pAddr2,NString pAddr3,NString pAddr4,NString pHouseNumber,NString pRecvVetBenefits,NString pTypeVetBenefits,NNumber pIraDistributions,NNumber pUntaxPensions,NNumber pVetsNonEdBen,NNumber pOthNonReportMoney,NString pEmancipatedMinor,NString pLegalGuardian,NString pUnaccompYouthSchool,NString pUnaccompYouthHud,NString pAtRiskHomeless,NNumber pParIraDistributions,NNumber pParUntaxPensions,NNumber pParVetsNonEdBen,NString pParCntryCodeRes,NString pMailAddr,NString pMailCity,NString pMailStatCode,NString pMailPostalCde,NString pIntlPhoneNo,NString pMailCountryCde,NString pPreferredName,Ref<NString> pRowidOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P1.P_CREATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_INFC_CODE", pInfcCode);
//			cmd.addParameter("@P_SEQ_NO", pSeqNo);
//			cmd.addParameter("@P_CURR_REC_IND", pCurrRecInd);
//			cmd.addParameter("@P_CREATOR_ID", pCreatorId);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
//			cmd.addParameter("@P_COLL_CDE", pCollCde);
//			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
//			cmd.addParameter("@P_LAST_NAME", pLastName);
//			cmd.addParameter("@P_FIRST_NAME", pFirstName);
//			cmd.addParameter("@P_MI", pMi);
//			cmd.addParameter("@P_TITLE", pTitle);
//			cmd.addParameter("@P_ADDR", pAddr);
//			cmd.addParameter("@P_CITY", pCity);
//			cmd.addParameter("@P_STAT_CODE", pStatCode);
//			cmd.addParameter("@P_ZIP", pZip);
//			cmd.addParameter("@P_SSN_PREFIX", pSsnPrefix);
//			cmd.addParameter("@P_SSN", pSsn);
//			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
//			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
//			cmd.addParameter("@P_PHONE_NO", pPhoneNo);
//			cmd.addParameter("@P_STAT_CODE_RES", pStatCodeRes);
//			cmd.addParameter("@P_START_RES_MTH_YR", pStartResMthYr);
//			cmd.addParameter("@P_RCPT_DATE", pRcptDate);
//			cmd.addParameter("@P_REV_RCPT_DATE", pRevRcptDate);
//			cmd.addParameter("@P_ORIG_COMP_DATE", pOrigCompDate);
//			cmd.addParameter("@P_REV_COMP_DATE", pRevCompDate);
//			cmd.addParameter("@P_CITZ_IND", pCitzInd);
//			cmd.addParameter("@P_ALIEN_REG_NO", pAlienRegNo);
//			cmd.addParameter("@P_MRTL_STATUS", pMrtlStatus);
//			cmd.addParameter("@P_HS_CDE", pHsCde);
//			cmd.addParameter("@P_EXP_ENROLL_STATUS", pExpEnrollStatus);
//			cmd.addParameter("@P_YR_IN_COLL", pYrInColl);
//			cmd.addParameter("@P_CRSE_OF_STUDY", pCrseOfStudy);
//			cmd.addParameter("@P_EXP_GRAD_MTH_YR", pExpGradMthYr);
//			cmd.addParameter("@P_DEGREE_BY_JULY", pDegreeByJuly);
//			cmd.addParameter("@P_MORE_THAN_3_PREV_COLL", pMoreThan3PrevColl);
//			cmd.addParameter("@P_NO_SCH", pNoSch);
//			cmd.addParameter("@P_PREV_COLL1", pPrevColl1);
//			cmd.addParameter("@P_PREV_COLL2", pPrevColl2);
//			cmd.addParameter("@P_PREV_COLL3", pPrevColl3);
//			cmd.addParameter("@P_DRIVER_LIC_NO", pDriverLicNo);
//			cmd.addParameter("@P_STAT_CODE_LIC", pStatCodeLic);
//			cmd.addParameter("@P_DISL_WRK", pDislWrk);
//			cmd.addParameter("@P_DISP_HME", pDispHme);
//			cmd.addParameter("@P_FAM_MEMB", pFamMemb);
//			cmd.addParameter("@P_NO_IN_COLL", pNoInColl);
//			cmd.addParameter("@P_CASH_AMT", pCashAmt);
//			cmd.addParameter("@P_HME_VAL", pHmeVal);
//			cmd.addParameter("@P_HME_DBT", pHmeDbt);
//			cmd.addParameter("@P_RE_INV_VAL", pReInvVal);
//			cmd.addParameter("@P_RE_INV_DBT", pReInvDbt);
//			cmd.addParameter("@P_BUS_FARM_VAL", pBusFarmVal);
//			cmd.addParameter("@P_BUS_FARM_DBT", pBusFarmDbt);
//			cmd.addParameter("@P_INCL_FARM", pInclFarm);
//			cmd.addParameter("@P_BORN_BEFORE_1_1_XX", pBornBefore11Xx);
//			cmd.addParameter("@P_US_VET", pUsVet);
//			cmd.addParameter("@P_WARD_OF_COURT", pWardOfCourt);
//			cmd.addParameter("@P_HAS_LEGAL_DEPEND", pHasLegalDepend);
//			cmd.addParameter("@P_TAX_FORM_IND", pTaxFormInd);
//			cmd.addParameter("@P_NO_EXEMPT", pNoExempt);
//			cmd.addParameter("@P_US_INC", pUsInc);
//			cmd.addParameter("@P_US_INC_TAX_PD", pUsIncTaxPd);
//			cmd.addParameter("@P_INC_FR_WRK", pIncFrWrk);
//			cmd.addParameter("@P_SPS_INC_FR_WRK", pSpsIncFrWrk);
//			cmd.addParameter("@P_SS_BENE", pSsBene);
//			cmd.addParameter("@P_AFDC", pAfdc);
//			cmd.addParameter("@P_CHILD_SUPP", pChildSupp);
//			cmd.addParameter("@P_OTH_UNTAX_INC", pOthUntaxInc);
//			cmd.addParameter("@P_MED_DEN_EXP", pMedDenExp);
//			cmd.addParameter("@P_TUIT_PD", pTuitPd);
//			cmd.addParameter("@P_NO_CHILD_TUIT", pNoChildTuit);
//			cmd.addParameter("@P_EXP_TAX_PD", pExpTaxPd);
//			cmd.addParameter("@P_EXP_INC_FR_WRK", pExpIncFrWrk);
//			cmd.addParameter("@P_EXP_SPS_INC_FR_WRK", pExpSpsIncFrWrk);
//			cmd.addParameter("@P_EXP_OTH_TAX_INC", pExpOthTaxInc);
//			cmd.addParameter("@P_EXP_UNTAX_INC", pExpUntaxInc);
//			cmd.addParameter("@P_EXP_SMR_INC", pExpSmrInc);
//			cmd.addParameter("@P_EXP_ACYR_INC", pExpAcyrInc);
//			cmd.addParameter("@P_EXP_SPS_SMR_INC", pExpSpsSmrInc);
//			cmd.addParameter("@P_EXP_SPS_ACYR_INC", pExpSpsAcyrInc);
//			cmd.addParameter("@P_EXP_SMR_OTH_TAX_INC", pExpSmrOthTaxInc);
//			cmd.addParameter("@P_EXP_ACYR_OTH_TAX_INC", pExpAcyrOthTaxInc);
//			cmd.addParameter("@P_EXP_SMR_UNTAX_INC", pExpSmrUntaxInc);
//			cmd.addParameter("@P_EXP_ACYR_UNTAX_INC", pExpAcyrUntaxInc);
//			cmd.addParameter("@P_GI_DEAB_AMT", pGiDeabAmt);
//			cmd.addParameter("@P_GI_DEAB_MTH", pGiDeabMth);
//			cmd.addParameter("@P_VEAP_BEN_AMT", pVeapBenAmt);
//			cmd.addParameter("@P_VEAP_BEN_MTH", pVeapBenMth);
//			cmd.addParameter("@P_OTH_VA_AMT", pOthVaAmt);
//			cmd.addParameter("@P_OTH_VA_MTH", pOthVaMth);
//			cmd.addParameter("@P_CLM_AS_TAX_EXEMPT_2YR", pClmAsTaxExempt2yr);
//			cmd.addParameter("@P_CLM_AS_TAX_EXEMPT_1YR", pClmAsTaxExempt1yr);
//			cmd.addParameter("@P_CLM_AS_TAX_EXEMPT", pClmAsTaxExempt);
//			cmd.addParameter("@P_WHEN_RCVD_AID", pWhenRcvdAid);
//			cmd.addParameter("@P_1985_RSRC_4000_8788", p1985Rsrc40008788);
//			cmd.addParameter("@P_1986_RSRC_4000_8788", p1986Rsrc40008788);
//			cmd.addParameter("@P_1986_RSRC_4000_8889", p1986Rsrc40008889);
//			cmd.addParameter("@P_1987_RSRC_4000_8889", p1987Rsrc40008889);
//			cmd.addParameter("@P_1987_RSRC_4000_8990", p1987Rsrc40008990);
//			cmd.addParameter("@P_1988_RSRC_4000_8990", p1988Rsrc40008990);
//			cmd.addParameter("@P_1988_RSRC_4000_9091", p1988Rsrc40009091);
//			cmd.addParameter("@P_1989_RSRC_4000_9091", p1989Rsrc40009091);
//			cmd.addParameter("@P_NO_AID_RSRC_4000_2YR", pNoAidRsrc40002yr);
//			cmd.addParameter("@P_NO_AID_RSRC_4000_1YR", pNoAidRsrc40001yr);
//			cmd.addParameter("@P_LINE2_RELSHIP", pLine2Relship);
//			cmd.addParameter("@P_LINE2_ATTEND_COLL", pLine2AttendColl);
//			cmd.addParameter("@P_LINE3_RELSHIP", pLine3Relship);
//			cmd.addParameter("@P_LINE3_ATTEND_COLL", pLine3AttendColl);
//			cmd.addParameter("@P_LINE4_RELSHIP", pLine4Relship);
//			cmd.addParameter("@P_LINE4_ATTEND_COLL", pLine4AttendColl);
//			cmd.addParameter("@P_LINE5_RELSHIP", pLine5Relship);
//			cmd.addParameter("@P_LINE5_ATTEND_COLL", pLine5AttendColl);
//			cmd.addParameter("@P_LINE6_RELSHIP", pLine6Relship);
//			cmd.addParameter("@P_LINE6_ATTEND_COLL", pLine6AttendColl);
//			cmd.addParameter("@P_LINE7_RELSHIP", pLine7Relship);
//			cmd.addParameter("@P_LINE7_ATTEND_COLL", pLine7AttendColl);
//			cmd.addParameter("@P_LINE8_RELSHIP", pLine8Relship);
//			cmd.addParameter("@P_LINE8_ATTEND_COLL", pLine8AttendColl);
//			cmd.addParameter("@P_PAR_MRTL_STATUS", pParMrtlStatus);
//			cmd.addParameter("@P_PAR_OLDER_AGE", pParOlderAge);
//			cmd.addParameter("@P_PAR_STAT_CODE_RES", pParStatCodeRes);
//			cmd.addParameter("@P_PAR_DISL_WRK", pParDislWrk);
//			cmd.addParameter("@P_PAR_DISP_HME", pParDispHme);
//			cmd.addParameter("@P_PAR_FAM_MEMB", pParFamMemb);
//			cmd.addParameter("@P_PAR_NO_IN_COLL", pParNoInColl);
//			cmd.addParameter("@P_PAR_CASH_AMT", pParCashAmt);
//			cmd.addParameter("@P_PAR_HME_VAL", pParHmeVal);
//			cmd.addParameter("@P_PAR_HME_DBT", pParHmeDbt);
//			cmd.addParameter("@P_PAR_RE_INV_VAL", pParReInvVal);
//			cmd.addParameter("@P_PAR_RE_INV_DBT", pParReInvDbt);
//			cmd.addParameter("@P_PAR_CURR_INV_VAL", pParCurrInvVal);
//			cmd.addParameter("@P_PAR_BUS_FARM_VAL", pParBusFarmVal);
//			cmd.addParameter("@P_PAR_BUS_FARM_DBT", pParBusFarmDbt);
//			cmd.addParameter("@P_PAR_INCL_FARM", pParInclFarm);
//			cmd.addParameter("@P_PAR_HME_YR_PURCH", pParHmeYrPurch);
//			cmd.addParameter("@P_PAR_HME_PURCH_AMT", pParHmePurchAmt);
//			cmd.addParameter("@P_PAR_DIV_SEP_REM_IND", pParDivSepRemInd);
//			cmd.addParameter("@P_PAR_TAX_FORM_IND", pParTaxFormInd);
//			cmd.addParameter("@P_PAR_NO_EXEMPT", pParNoExempt);
//			cmd.addParameter("@P_PAR_US_INC", pParUsInc);
//			cmd.addParameter("@P_PAR_WAGES", pParWages);
//			cmd.addParameter("@P_PAR_INT_INC", pParIntInc);
//			cmd.addParameter("@P_PAR_DIV_INC", pParDivInc);
//			cmd.addParameter("@P_PAR_BUS_FARM_INC", pParBusFarmInc);
//			cmd.addParameter("@P_PAR_OTH_TAX_INC", pParOthTaxInc);
//			cmd.addParameter("@P_PAR_ADJ_TO_INC", pParAdjToInc);
//			cmd.addParameter("@P_PAR_US_INC_TAX_PD", pParUsIncTaxPd);
//			cmd.addParameter("@P_FATH_INC_FR_WRK", pFathIncFrWrk);
//			cmd.addParameter("@P_MOTH_INC_FR_WRK", pMothIncFrWrk);
//			cmd.addParameter("@P_PAR_SS_BENE", pParSsBene);
//			cmd.addParameter("@P_PAR_AFDC", pParAfdc);
//			cmd.addParameter("@P_PAR_CHILD_SUPP", pParChildSupp);
//			cmd.addParameter("@P_PAR_OTH_UNTAX_INC", pParOthUntaxInc);
//			cmd.addParameter("@P_PAR_MED_DEN_EXP", pParMedDenExp);
//			cmd.addParameter("@P_PAR_TUIT_PD", pParTuitPd);
//			cmd.addParameter("@P_PAR_NO_CHILD_TUIT", pParNoChildTuit);
//			cmd.addParameter("@P_EXP_PAR_TAX_PD", pExpParTaxPd);
//			cmd.addParameter("@P_EXP_PAR_OTH_TAX_INC", pExpParOthTaxInc);
//			cmd.addParameter("@P_EXP_PAR_UNTAX_INC", pExpParUntaxInc);
//			cmd.addParameter("@P_EXP_FATH_INC_FR_WRK", pExpFathIncFrWrk);
//			cmd.addParameter("@P_EXP_MOTH_INC_FR_WRK", pExpMothIncFrWrk);
//			cmd.addParameter("@P_FED_COLL_CHOICE_1", pFedCollChoice1);
//			cmd.addParameter("@P_FED_COLL_CHOICE_2", pFedCollChoice2);
//			cmd.addParameter("@P_FED_COLL_CHOICE_3", pFedCollChoice3);
//			cmd.addParameter("@P_COLL_CHOICE_NO", pCollChoiceNo);
//			cmd.addParameter("@P_IN_DEFAULT", pInDefault);
//			cmd.addParameter("@P_OWES_REFUND", pOwesRefund);
//			cmd.addParameter("@P_CONSIDER_FOR_STAF", pConsiderForStaf);
//			cmd.addParameter("@P_BAL_ON_ALL_STAF", pBalOnAllStaf);
//			cmd.addParameter("@P_RECENT_STAF_BAL", pRecentStafBal);
//			cmd.addParameter("@P_RECENT_STAF_INT_RATE", pRecentStafIntRate);
//			cmd.addParameter("@P_RECENT_STAF_FR_MTH_YR", pRecentStafFrMthYr);
//			cmd.addParameter("@P_RECENT_STAF_TO_MTH_YR", pRecentStafToMthYr);
//			cmd.addParameter("@P_RECENT_STAF_CLASS", pRecentStafClass);
//			cmd.addParameter("@P_RQST_FA_PREF", pRqstFaPref);
//			cmd.addParameter("@P_RQST_FA_FR_MTH_YR", pRqstFaFrMthYr);
//			cmd.addParameter("@P_RQST_FA_TO_MTH_YR", pRqstFaToMthYr);
//			cmd.addParameter("@P_RQST_STAF_AMT", pRqstStafAmt);
//			cmd.addParameter("@P_RQST_STAF_FA_FR_MTH_YR", pRqstStafFaFrMthYr);
//			cmd.addParameter("@P_RQST_STAF_FA_TO_MTH_YR", pRqstStafFaToMthYr);
//			cmd.addParameter("@P_RQST_FA_SUMMER_THIS_YR", pRqstFaSummerThisYr);
//			cmd.addParameter("@P_RQST_FA_FALL_THIS_YR", pRqstFaFallThisYr);
//			cmd.addParameter("@P_RQST_FA_WINTER_NEXT_YR", pRqstFaWinterNextYr);
//			cmd.addParameter("@P_RQST_FA_SPRING_NEXT_YR", pRqstFaSpringNextYr);
//			cmd.addParameter("@P_RQST_FA_SUMMER_NEXT_YR", pRqstFaSummerNextYr);
//			cmd.addParameter("@P_RQST_FA_OTHER", pRqstFaOther);
//			cmd.addParameter("@P_CLASSIFICATION", pClassification);
//			cmd.addParameter("@P_EXP_WRK_HRS", pExpWrkHrs);
//			cmd.addParameter("@P_INST_HOUS_CDE", pInstHousCde);
//			cmd.addParameter("@P_COLL_CDE_1", pCollCde1);
//			cmd.addParameter("@P_HOUS_CDE_1", pHousCde1);
//			cmd.addParameter("@P_COLL_CDE_2", pCollCde2);
//			cmd.addParameter("@P_HOUS_CDE_2", pHousCde2);
//			cmd.addParameter("@P_COLL_CDE_3", pCollCde3);
//			cmd.addParameter("@P_HOUS_CDE_3", pHousCde3);
//			cmd.addParameter("@P_COLL_CDE_4", pCollCde4);
//			cmd.addParameter("@P_HOUS_CDE_4", pHousCde4);
//			cmd.addParameter("@P_COLL_CDE_5", pCollCde5);
//			cmd.addParameter("@P_HOUS_CDE_5", pHousCde5);
//			cmd.addParameter("@P_COLL_CDE_6", pCollCde6);
//			cmd.addParameter("@P_HOUS_CDE_6", pHousCde6);
//			cmd.addParameter("@P_COLL_CDE_7", pCollCde7);
//			cmd.addParameter("@P_HOUS_CDE_7", pHousCde7);
//			cmd.addParameter("@P_COLL_CDE_8", pCollCde8);
//			cmd.addParameter("@P_HOUS_CDE_8", pHousCde8);
//			cmd.addParameter("@P_ADDL_COLL_CDE_1", pAddlCollCde1);
//			cmd.addParameter("@P_ADDL_COLL_CDE_2", pAddlCollCde2);
//			cmd.addParameter("@P_ADDL_COLL_CDE_3", pAddlCollCde3);
//			cmd.addParameter("@P_ADDL_COLL_CDE_4", pAddlCollCde4);
//			cmd.addParameter("@P_ADDL_COLL_CDE_5", pAddlCollCde5);
//			cmd.addParameter("@P_ADDL_COLL_CDE_6", pAddlCollCde6);
//			cmd.addParameter("@P_ADDL_COLL_CDE_7", pAddlCollCde7);
//			cmd.addParameter("@P_ADDL_COLL_CDE_8", pAddlCollCde8);
//			cmd.addParameter("@P_EXTRA_REQUEST", pExtraRequest);
//			cmd.addParameter("@P_REL_TO_STATE", pRelToState);
//			cmd.addParameter("@P_REL_TO_US_ED", pRelToUsEd);
//			cmd.addParameter("@P_REL_US_ED_TO_STATE", pRelUsEdToState);
//			cmd.addParameter("@P_REL_US_ED_TO_COLL", pRelUsEdToColl);
//			cmd.addParameter("@P_BUS_FARM_SUPP_FILED", pBusFarmSuppFiled);
//			cmd.addParameter("@P_SIGNED", pSigned);
//			cmd.addParameter("@P_SIGNED_SPS", pSignedSps);
//			cmd.addParameter("@P_SIGNED_FATH", pSignedFath);
//			cmd.addParameter("@P_SIGNED_MOTH", pSignedMoth);
//			cmd.addParameter("@P_SIGNED_PAR", pSignedPar);
//			cmd.addParameter("@P_SIGNED_MTH_DAY", pSignedMthDay);
//			cmd.addParameter("@P_SIGNED_YR", pSignedYr);
//			cmd.addParameter("@P_DEPEND_AGE_0_5", pDependAge05);
//			cmd.addParameter("@P_DEPEND_AGE_6_12", pDependAge612);
//			cmd.addParameter("@P_DEPEND_AGE_13_PLUS", pDependAge13Plus);
//			cmd.addParameter("@P_CONT_WRK_ACYR", pContWrkAcyr);
//			cmd.addParameter("@P_PERMIT_DRAFT_REG", pPermitDraftReg);
//			cmd.addParameter("@P_PELL_REL_MSG", pPellRelMsg);
//			cmd.addParameter("@P_ST_AGENCY_REL_MSG", pStAgencyRelMsg);
//			cmd.addParameter("@P_VERIFICATION_MSG", pVerificationMsg);
//			cmd.addParameter("@P_VERIFICATION_PRTY", pVerificationPrty);
//			cmd.addParameter("@P_INS", pIns);
//			cmd.addParameter("@P_SELECTIVE_SERVICE", pSelectiveService);
//			cmd.addParameter("@P_SPEC_COND_IND", pSpecCondInd);
//			cmd.addParameter("@P_TITLE_IV_DEFAULT", pTitleIvDefault);
//			cmd.addParameter("@P_INAS_OPTION", pInasOption);
//			cmd.addParameter("@P_EDE_SOURCE", pEdeSource);
//			cmd.addParameter("@P_EDE_SPEC_COND_IND", pEdeSpecCondInd);
//			cmd.addParameter("@P_USED_TRANS_NO", pUsedTransNo);
//			cmd.addParameter("@P_DEF_MATCH_REGION", pDefMatchRegion);
//			cmd.addParameter("@P_PREV_COLL4", pPrevColl4);
//			cmd.addParameter("@P_1989_RSRC_4000_9192", p1989Rsrc40009192);
//			cmd.addParameter("@P_1990_RSRC_4000_9192", p1990Rsrc40009192);
//			cmd.addParameter("@P_IN_DEF_OWE_REF", pInDefOweRef);
//			cmd.addParameter("@P_PAR_SS_BENE_STU_ONLY", pParSsBeneStuOnly);
//			cmd.addParameter("@P_COMPLETION_DATE", pCompletionDate);
//			cmd.addParameter("@P_PAR_REMARRIAGE_DATE", pParRemarriageDate);
//			cmd.addParameter("@P_LOWEST_INC_FILER", pLowestIncFiler);
//			cmd.addParameter("@P_MEANS_TEST_BEN", pMeansTestBen);
//			cmd.addParameter("@P_PAR_RECD_TANF", pParRecdTanf);
//			cmd.addParameter("@P_PAR_RECD_SSI", pParRecdSsi);
//			cmd.addParameter("@P_PAR_MEANS_TEST_BEN", pParMeansTestBen);
//			cmd.addParameter("@P_PAR_HOUS_STAT", pParHousStat);
//			cmd.addParameter("@P_ACTIVE_DUTY", pActiveDuty);
//			cmd.addParameter("@P_PAR_FOOD_STAMPS", pParFoodStamps);
//			cmd.addParameter("@P_PAR_SCHOOL_LUNCH", pParSchoolLunch);
//			cmd.addParameter("@P_PAR_RECD_WIC", pParRecdWic);
//			cmd.addParameter("@P_RECD_SSI", pRecdSsi);
//			cmd.addParameter("@P_FOOD_STAMPS", pFoodStamps);
//			cmd.addParameter("@P_SCHOOL_LUNCH", pSchoolLunch);
//			cmd.addParameter("@P_RECD_TANF", pRecdTanf);
//			cmd.addParameter("@P_RECD_WIC", pRecdWic);
//			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
//			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
//			cmd.addParameter("@P_ADDR2", pAddr2);
//			cmd.addParameter("@P_ADDR3", pAddr3);
//			cmd.addParameter("@P_ADDR4", pAddr4);
//			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
//			cmd.addParameter("@P_RECV_VET_BENEFITS", pRecvVetBenefits);
//			cmd.addParameter("@P_TYPE_VET_BENEFITS", pTypeVetBenefits);
//			cmd.addParameter("@P_IRA_DISTRIBUTIONS", pIraDistributions);
//			cmd.addParameter("@P_UNTAX_PENSIONS", pUntaxPensions);
//			cmd.addParameter("@P_VETS_NON_ED_BEN", pVetsNonEdBen);
//			cmd.addParameter("@P_OTH_NON_REPORT_MONEY", pOthNonReportMoney);
//			cmd.addParameter("@P_EMANCIPATED_MINOR", pEmancipatedMinor);
//			cmd.addParameter("@P_LEGAL_GUARDIAN", pLegalGuardian);
//			cmd.addParameter("@P_UNACCOMP_YOUTH_SCHOOL", pUnaccompYouthSchool);
//			cmd.addParameter("@P_UNACCOMP_YOUTH_HUD", pUnaccompYouthHud);
//			cmd.addParameter("@P_AT_RISK_HOMELESS", pAtRiskHomeless);
//			cmd.addParameter("@P_PAR_IRA_DISTRIBUTIONS", pParIraDistributions);
//			cmd.addParameter("@P_PAR_UNTAX_PENSIONS", pParUntaxPensions);
//			cmd.addParameter("@P_PAR_VETS_NON_ED_BEN", pParVetsNonEdBen);
//			cmd.addParameter("@P_PAR_CNTRY_CODE_RES", pParCntryCodeRes);
//			cmd.addParameter("@P_MAIL_ADDR", pMailAddr);
//			cmd.addParameter("@P_MAIL_CITY", pMailCity);
//			cmd.addParameter("@P_MAIL_STAT_CODE", pMailStatCode);
//			cmd.addParameter("@P_MAIL_POSTAL_CDE", pMailPostalCde);
//			cmd.addParameter("@P_INTL_PHONE_NO", pIntlPhoneNo);
//			cmd.addParameter("@P_MAIL_COUNTRY_CDE", pMailCountryCde);
//			cmd.addParameter("@P_PREFERRED_NAME", pPreferredName);
//			cmd.addParameter("@P_ROWID_OUT", NString.class);
//				
//			cmd.execute();
//			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);
//
//
//		}
		
		public static void pDelete(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P1.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteBulk(NString pAidyCode,NString pInfcCode,NString pDeleteFlag,Ref<NNumber> pDelCountOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P1.P_DELETE_BULK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_DELETE_FLAG", pDeleteFlag);
			cmd.addParameter("@P_DEL_COUNT_OUT", NNumber.class);
				
			cmd.execute();
			pDelCountOut.val = cmd.getParameterValue("@P_DEL_COUNT_OUT", NNumber.class);


		}
		
		public static void pLock(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P1.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
//		public static void pUpdate(NString pAidyCode,NNumber pPidm,NString pInfcCode,NNumber pSeqNo,NString pCurrRecInd,NString pCreatorId,NString pUserId,NDate pCreateDate,NString pCollCde,NString pAcyrCode,NString pLastName,NString pFirstName,NString pMi,NString pTitle,NString pAddr,NString pCity,NString pStatCode,NString pZip,NString pSsnPrefix,NString pSsn,NDate pBirthDate,NString pPhoneArea,NString pPhoneNo,NString pStatCodeRes,NString pStartResMthYr,NDate pRcptDate,NDate pRevRcptDate,NDate pOrigCompDate,NDate pRevCompDate,NString pCitzInd,NString pAlienRegNo,NString pMrtlStatus,NString pHsCde,NString pExpEnrollStatus,NString pYrInColl,NString pCrseOfStudy,NString pExpGradMthYr,NString pDegreeByJuly,NString pMoreThan3PrevColl,NNumber pNoSch,NString pPrevColl1,NString pPrevColl2,NString pPrevColl3,NString pDriverLicNo,NString pStatCodeLic,NString pDislWrk,NString pDispHme,NNumber pFamMemb,NNumber pNoInColl,NNumber pCashAmt,NNumber pHmeVal,NNumber pHmeDbt,NNumber pReInvVal,NNumber pReInvDbt,NNumber pBusFarmVal,NNumber pBusFarmDbt,NString pInclFarm,NString pBornBefore11Xx,NString pUsVet,NString pWardOfCourt,NString pHasLegalDepend,NString pTaxFormInd,NNumber pNoExempt,NNumber pUsInc,NNumber pUsIncTaxPd,NNumber pIncFrWrk,NNumber pSpsIncFrWrk,NNumber pSsBene,NNumber pAfdc,NNumber pChildSupp,NNumber pOthUntaxInc,NNumber pMedDenExp,NNumber pTuitPd,NNumber pNoChildTuit,NNumber pExpTaxPd,NNumber pExpIncFrWrk,NNumber pExpSpsIncFrWrk,NNumber pExpOthTaxInc,NNumber pExpUntaxInc,NNumber pExpSmrInc,NNumber pExpAcyrInc,NNumber pExpSpsSmrInc,NNumber pExpSpsAcyrInc,NNumber pExpSmrOthTaxInc,NNumber pExpAcyrOthTaxInc,NNumber pExpSmrUntaxInc,NNumber pExpAcyrUntaxInc,NNumber pGiDeabAmt,NNumber pGiDeabMth,NNumber pVeapBenAmt,NNumber pVeapBenMth,NNumber pOthVaAmt,NNumber pOthVaMth,NString pClmAsTaxExempt2yr,NString pClmAsTaxExempt1yr,NString pClmAsTaxExempt,NString pWhenRcvdAid,NString p1985Rsrc40008788,NString p1986Rsrc40008788,NString p1986Rsrc40008889,NString p1987Rsrc40008889,NString p1987Rsrc40008990,NString p1988Rsrc40008990,NString p1988Rsrc40009091,NString p1989Rsrc40009091,NString pNoAidRsrc40002yr,NString pNoAidRsrc40001yr,NString pLine2Relship,NString pLine2AttendColl,NString pLine3Relship,NString pLine3AttendColl,NString pLine4Relship,NString pLine4AttendColl,NString pLine5Relship,NString pLine5AttendColl,NString pLine6Relship,NString pLine6AttendColl,NString pLine7Relship,NString pLine7AttendColl,NString pLine8Relship,NString pLine8AttendColl,NString pParMrtlStatus,NNumber pParOlderAge,NString pParStatCodeRes,NString pParDislWrk,NString pParDispHme,NNumber pParFamMemb,NNumber pParNoInColl,NNumber pParCashAmt,NNumber pParHmeVal,NNumber pParHmeDbt,NNumber pParReInvVal,NNumber pParReInvDbt,NNumber pParCurrInvVal,NNumber pParBusFarmVal,NNumber pParBusFarmDbt,NString pParInclFarm,NNumber pParHmeYrPurch,NNumber pParHmePurchAmt,NString pParDivSepRemInd,NString pParTaxFormInd,NNumber pParNoExempt,NNumber pParUsInc,NNumber pParWages,NNumber pParIntInc,NNumber pParDivInc,NNumber pParBusFarmInc,NNumber pParOthTaxInc,NNumber pParAdjToInc,NNumber pParUsIncTaxPd,NNumber pFathIncFrWrk,NNumber pMothIncFrWrk,NNumber pParSsBene,NNumber pParAfdc,NNumber pParChildSupp,NNumber pParOthUntaxInc,NNumber pParMedDenExp,NNumber pParTuitPd,NNumber pParNoChildTuit,NNumber pExpParTaxPd,NNumber pExpParOthTaxInc,NNumber pExpParUntaxInc,NNumber pExpFathIncFrWrk,NNumber pExpMothIncFrWrk,NString pFedCollChoice1,NString pFedCollChoice2,NString pFedCollChoice3,NString pCollChoiceNo,NString pInDefault,NString pOwesRefund,NString pConsiderForStaf,NNumber pBalOnAllStaf,NNumber pRecentStafBal,NString pRecentStafIntRate,NString pRecentStafFrMthYr,NString pRecentStafToMthYr,NString pRecentStafClass,NString pRqstFaPref,NString pRqstFaFrMthYr,NString pRqstFaToMthYr,NNumber pRqstStafAmt,NString pRqstStafFaFrMthYr,NString pRqstStafFaToMthYr,NString pRqstFaSummerThisYr,NString pRqstFaFallThisYr,NString pRqstFaWinterNextYr,NString pRqstFaSpringNextYr,NString pRqstFaSummerNextYr,NString pRqstFaOther,NString pClassification,NString pExpWrkHrs,NString pInstHousCde,NString pCollCde1,NString pHousCde1,NString pCollCde2,NString pHousCde2,NString pCollCde3,NString pHousCde3,NString pCollCde4,NString pHousCde4,NString pCollCde5,NString pHousCde5,NString pCollCde6,NString pHousCde6,NString pCollCde7,NString pHousCde7,NString pCollCde8,NString pHousCde8,NString pAddlCollCde1,NString pAddlCollCde2,NString pAddlCollCde3,NString pAddlCollCde4,NString pAddlCollCde5,NString pAddlCollCde6,NString pAddlCollCde7,NString pAddlCollCde8,NString pExtraRequest,NString pRelToState,NString pRelToUsEd,NString pRelUsEdToState,NString pRelUsEdToColl,NString pBusFarmSuppFiled,NString pSigned,NString pSignedSps,NString pSignedFath,NString pSignedMoth,NString pSignedPar,NString pSignedMthDay,NString pSignedYr,NNumber pDependAge05,NNumber pDependAge612,NNumber pDependAge13Plus,NString pContWrkAcyr,NString pPermitDraftReg,NString pPellRelMsg,NString pStAgencyRelMsg,NString pVerificationMsg,NString pVerificationPrty,NString pIns,NString pSelectiveService,NString pSpecCondInd,NString pTitleIvDefault,NString pInasOption,NString pEdeSource,NString pEdeSpecCondInd,NString pUsedTransNo,NString pDefMatchRegion,NString pPrevColl4,NString p1989Rsrc40009192,NString p1990Rsrc40009192,NString pInDefOweRef,NNumber pParSsBeneStuOnly,NDate pCompletionDate,NDate pParRemarriageDate,NString pLowestIncFiler,NString pMeansTestBen,NString pParRecdTanf,NString pParRecdSsi,NString pParMeansTestBen,NString pParHousStat,NString pActiveDuty,NString pParFoodStamps,NString pParSchoolLunch,NString pParRecdWic,NString pRecdSsi,NString pFoodStamps,NString pSchoolLunch,NString pRecdTanf,NString pRecdWic,NString pSurnamePrefix,NString pCtryCodePhone,NString pAddr2,NString pAddr3,NString pAddr4,NString pHouseNumber,NString pRecvVetBenefits,NString pTypeVetBenefits,NNumber pIraDistributions,NNumber pUntaxPensions,NNumber pVetsNonEdBen,NNumber pOthNonReportMoney,NString pEmancipatedMinor,NString pLegalGuardian,NString pUnaccompYouthSchool,NString pUnaccompYouthHud,NString pAtRiskHomeless,NNumber pParIraDistributions,NNumber pParUntaxPensions,NNumber pParVetsNonEdBen,NString pParCntryCodeRes,NString pMailAddr,NString pMailCity,NString pMailStatCode,NString pMailPostalCde,NString pIntlPhoneNo,NString pMailCountryCde,NString pPreferredName,NString pRowid) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEMP_APP_P1.P_UPDATE", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_INFC_CODE", pInfcCode);
//			cmd.addParameter("@P_SEQ_NO", pSeqNo);
//			cmd.addParameter("@P_CURR_REC_IND", pCurrRecInd);
//			cmd.addParameter("@P_CREATOR_ID", pCreatorId);
//			cmd.addParameter("@P_USER_ID", pUserId);
//			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
//			cmd.addParameter("@P_COLL_CDE", pCollCde);
//			cmd.addParameter("@P_ACYR_CODE", pAcyrCode);
//			cmd.addParameter("@P_LAST_NAME", pLastName);
//			cmd.addParameter("@P_FIRST_NAME", pFirstName);
//			cmd.addParameter("@P_MI", pMi);
//			cmd.addParameter("@P_TITLE", pTitle);
//			cmd.addParameter("@P_ADDR", pAddr);
//			cmd.addParameter("@P_CITY", pCity);
//			cmd.addParameter("@P_STAT_CODE", pStatCode);
//			cmd.addParameter("@P_ZIP", pZip);
//			cmd.addParameter("@P_SSN_PREFIX", pSsnPrefix);
//			cmd.addParameter("@P_SSN", pSsn);
//			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
//			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
//			cmd.addParameter("@P_PHONE_NO", pPhoneNo);
//			cmd.addParameter("@P_STAT_CODE_RES", pStatCodeRes);
//			cmd.addParameter("@P_START_RES_MTH_YR", pStartResMthYr);
//			cmd.addParameter("@P_RCPT_DATE", pRcptDate);
//			cmd.addParameter("@P_REV_RCPT_DATE", pRevRcptDate);
//			cmd.addParameter("@P_ORIG_COMP_DATE", pOrigCompDate);
//			cmd.addParameter("@P_REV_COMP_DATE", pRevCompDate);
//			cmd.addParameter("@P_CITZ_IND", pCitzInd);
//			cmd.addParameter("@P_ALIEN_REG_NO", pAlienRegNo);
//			cmd.addParameter("@P_MRTL_STATUS", pMrtlStatus);
//			cmd.addParameter("@P_HS_CDE", pHsCde);
//			cmd.addParameter("@P_EXP_ENROLL_STATUS", pExpEnrollStatus);
//			cmd.addParameter("@P_YR_IN_COLL", pYrInColl);
//			cmd.addParameter("@P_CRSE_OF_STUDY", pCrseOfStudy);
//			cmd.addParameter("@P_EXP_GRAD_MTH_YR", pExpGradMthYr);
//			cmd.addParameter("@P_DEGREE_BY_JULY", pDegreeByJuly);
//			cmd.addParameter("@P_MORE_THAN_3_PREV_COLL", pMoreThan3PrevColl);
//			cmd.addParameter("@P_NO_SCH", pNoSch);
//			cmd.addParameter("@P_PREV_COLL1", pPrevColl1);
//			cmd.addParameter("@P_PREV_COLL2", pPrevColl2);
//			cmd.addParameter("@P_PREV_COLL3", pPrevColl3);
//			cmd.addParameter("@P_DRIVER_LIC_NO", pDriverLicNo);
//			cmd.addParameter("@P_STAT_CODE_LIC", pStatCodeLic);
//			cmd.addParameter("@P_DISL_WRK", pDislWrk);
//			cmd.addParameter("@P_DISP_HME", pDispHme);
//			cmd.addParameter("@P_FAM_MEMB", pFamMemb);
//			cmd.addParameter("@P_NO_IN_COLL", pNoInColl);
//			cmd.addParameter("@P_CASH_AMT", pCashAmt);
//			cmd.addParameter("@P_HME_VAL", pHmeVal);
//			cmd.addParameter("@P_HME_DBT", pHmeDbt);
//			cmd.addParameter("@P_RE_INV_VAL", pReInvVal);
//			cmd.addParameter("@P_RE_INV_DBT", pReInvDbt);
//			cmd.addParameter("@P_BUS_FARM_VAL", pBusFarmVal);
//			cmd.addParameter("@P_BUS_FARM_DBT", pBusFarmDbt);
//			cmd.addParameter("@P_INCL_FARM", pInclFarm);
//			cmd.addParameter("@P_BORN_BEFORE_1_1_XX", pBornBefore11Xx);
//			cmd.addParameter("@P_US_VET", pUsVet);
//			cmd.addParameter("@P_WARD_OF_COURT", pWardOfCourt);
//			cmd.addParameter("@P_HAS_LEGAL_DEPEND", pHasLegalDepend);
//			cmd.addParameter("@P_TAX_FORM_IND", pTaxFormInd);
//			cmd.addParameter("@P_NO_EXEMPT", pNoExempt);
//			cmd.addParameter("@P_US_INC", pUsInc);
//			cmd.addParameter("@P_US_INC_TAX_PD", pUsIncTaxPd);
//			cmd.addParameter("@P_INC_FR_WRK", pIncFrWrk);
//			cmd.addParameter("@P_SPS_INC_FR_WRK", pSpsIncFrWrk);
//			cmd.addParameter("@P_SS_BENE", pSsBene);
//			cmd.addParameter("@P_AFDC", pAfdc);
//			cmd.addParameter("@P_CHILD_SUPP", pChildSupp);
//			cmd.addParameter("@P_OTH_UNTAX_INC", pOthUntaxInc);
//			cmd.addParameter("@P_MED_DEN_EXP", pMedDenExp);
//			cmd.addParameter("@P_TUIT_PD", pTuitPd);
//			cmd.addParameter("@P_NO_CHILD_TUIT", pNoChildTuit);
//			cmd.addParameter("@P_EXP_TAX_PD", pExpTaxPd);
//			cmd.addParameter("@P_EXP_INC_FR_WRK", pExpIncFrWrk);
//			cmd.addParameter("@P_EXP_SPS_INC_FR_WRK", pExpSpsIncFrWrk);
//			cmd.addParameter("@P_EXP_OTH_TAX_INC", pExpOthTaxInc);
//			cmd.addParameter("@P_EXP_UNTAX_INC", pExpUntaxInc);
//			cmd.addParameter("@P_EXP_SMR_INC", pExpSmrInc);
//			cmd.addParameter("@P_EXP_ACYR_INC", pExpAcyrInc);
//			cmd.addParameter("@P_EXP_SPS_SMR_INC", pExpSpsSmrInc);
//			cmd.addParameter("@P_EXP_SPS_ACYR_INC", pExpSpsAcyrInc);
//			cmd.addParameter("@P_EXP_SMR_OTH_TAX_INC", pExpSmrOthTaxInc);
//			cmd.addParameter("@P_EXP_ACYR_OTH_TAX_INC", pExpAcyrOthTaxInc);
//			cmd.addParameter("@P_EXP_SMR_UNTAX_INC", pExpSmrUntaxInc);
//			cmd.addParameter("@P_EXP_ACYR_UNTAX_INC", pExpAcyrUntaxInc);
//			cmd.addParameter("@P_GI_DEAB_AMT", pGiDeabAmt);
//			cmd.addParameter("@P_GI_DEAB_MTH", pGiDeabMth);
//			cmd.addParameter("@P_VEAP_BEN_AMT", pVeapBenAmt);
//			cmd.addParameter("@P_VEAP_BEN_MTH", pVeapBenMth);
//			cmd.addParameter("@P_OTH_VA_AMT", pOthVaAmt);
//			cmd.addParameter("@P_OTH_VA_MTH", pOthVaMth);
//			cmd.addParameter("@P_CLM_AS_TAX_EXEMPT_2YR", pClmAsTaxExempt2yr);
//			cmd.addParameter("@P_CLM_AS_TAX_EXEMPT_1YR", pClmAsTaxExempt1yr);
//			cmd.addParameter("@P_CLM_AS_TAX_EXEMPT", pClmAsTaxExempt);
//			cmd.addParameter("@P_WHEN_RCVD_AID", pWhenRcvdAid);
//			cmd.addParameter("@P_1985_RSRC_4000_8788", p1985Rsrc40008788);
//			cmd.addParameter("@P_1986_RSRC_4000_8788", p1986Rsrc40008788);
//			cmd.addParameter("@P_1986_RSRC_4000_8889", p1986Rsrc40008889);
//			cmd.addParameter("@P_1987_RSRC_4000_8889", p1987Rsrc40008889);
//			cmd.addParameter("@P_1987_RSRC_4000_8990", p1987Rsrc40008990);
//			cmd.addParameter("@P_1988_RSRC_4000_8990", p1988Rsrc40008990);
//			cmd.addParameter("@P_1988_RSRC_4000_9091", p1988Rsrc40009091);
//			cmd.addParameter("@P_1989_RSRC_4000_9091", p1989Rsrc40009091);
//			cmd.addParameter("@P_NO_AID_RSRC_4000_2YR", pNoAidRsrc40002yr);
//			cmd.addParameter("@P_NO_AID_RSRC_4000_1YR", pNoAidRsrc40001yr);
//			cmd.addParameter("@P_LINE2_RELSHIP", pLine2Relship);
//			cmd.addParameter("@P_LINE2_ATTEND_COLL", pLine2AttendColl);
//			cmd.addParameter("@P_LINE3_RELSHIP", pLine3Relship);
//			cmd.addParameter("@P_LINE3_ATTEND_COLL", pLine3AttendColl);
//			cmd.addParameter("@P_LINE4_RELSHIP", pLine4Relship);
//			cmd.addParameter("@P_LINE4_ATTEND_COLL", pLine4AttendColl);
//			cmd.addParameter("@P_LINE5_RELSHIP", pLine5Relship);
//			cmd.addParameter("@P_LINE5_ATTEND_COLL", pLine5AttendColl);
//			cmd.addParameter("@P_LINE6_RELSHIP", pLine6Relship);
//			cmd.addParameter("@P_LINE6_ATTEND_COLL", pLine6AttendColl);
//			cmd.addParameter("@P_LINE7_RELSHIP", pLine7Relship);
//			cmd.addParameter("@P_LINE7_ATTEND_COLL", pLine7AttendColl);
//			cmd.addParameter("@P_LINE8_RELSHIP", pLine8Relship);
//			cmd.addParameter("@P_LINE8_ATTEND_COLL", pLine8AttendColl);
//			cmd.addParameter("@P_PAR_MRTL_STATUS", pParMrtlStatus);
//			cmd.addParameter("@P_PAR_OLDER_AGE", pParOlderAge);
//			cmd.addParameter("@P_PAR_STAT_CODE_RES", pParStatCodeRes);
//			cmd.addParameter("@P_PAR_DISL_WRK", pParDislWrk);
//			cmd.addParameter("@P_PAR_DISP_HME", pParDispHme);
//			cmd.addParameter("@P_PAR_FAM_MEMB", pParFamMemb);
//			cmd.addParameter("@P_PAR_NO_IN_COLL", pParNoInColl);
//			cmd.addParameter("@P_PAR_CASH_AMT", pParCashAmt);
//			cmd.addParameter("@P_PAR_HME_VAL", pParHmeVal);
//			cmd.addParameter("@P_PAR_HME_DBT", pParHmeDbt);
//			cmd.addParameter("@P_PAR_RE_INV_VAL", pParReInvVal);
//			cmd.addParameter("@P_PAR_RE_INV_DBT", pParReInvDbt);
//			cmd.addParameter("@P_PAR_CURR_INV_VAL", pParCurrInvVal);
//			cmd.addParameter("@P_PAR_BUS_FARM_VAL", pParBusFarmVal);
//			cmd.addParameter("@P_PAR_BUS_FARM_DBT", pParBusFarmDbt);
//			cmd.addParameter("@P_PAR_INCL_FARM", pParInclFarm);
//			cmd.addParameter("@P_PAR_HME_YR_PURCH", pParHmeYrPurch);
//			cmd.addParameter("@P_PAR_HME_PURCH_AMT", pParHmePurchAmt);
//			cmd.addParameter("@P_PAR_DIV_SEP_REM_IND", pParDivSepRemInd);
//			cmd.addParameter("@P_PAR_TAX_FORM_IND", pParTaxFormInd);
//			cmd.addParameter("@P_PAR_NO_EXEMPT", pParNoExempt);
//			cmd.addParameter("@P_PAR_US_INC", pParUsInc);
//			cmd.addParameter("@P_PAR_WAGES", pParWages);
//			cmd.addParameter("@P_PAR_INT_INC", pParIntInc);
//			cmd.addParameter("@P_PAR_DIV_INC", pParDivInc);
//			cmd.addParameter("@P_PAR_BUS_FARM_INC", pParBusFarmInc);
//			cmd.addParameter("@P_PAR_OTH_TAX_INC", pParOthTaxInc);
//			cmd.addParameter("@P_PAR_ADJ_TO_INC", pParAdjToInc);
//			cmd.addParameter("@P_PAR_US_INC_TAX_PD", pParUsIncTaxPd);
//			cmd.addParameter("@P_FATH_INC_FR_WRK", pFathIncFrWrk);
//			cmd.addParameter("@P_MOTH_INC_FR_WRK", pMothIncFrWrk);
//			cmd.addParameter("@P_PAR_SS_BENE", pParSsBene);
//			cmd.addParameter("@P_PAR_AFDC", pParAfdc);
//			cmd.addParameter("@P_PAR_CHILD_SUPP", pParChildSupp);
//			cmd.addParameter("@P_PAR_OTH_UNTAX_INC", pParOthUntaxInc);
//			cmd.addParameter("@P_PAR_MED_DEN_EXP", pParMedDenExp);
//			cmd.addParameter("@P_PAR_TUIT_PD", pParTuitPd);
//			cmd.addParameter("@P_PAR_NO_CHILD_TUIT", pParNoChildTuit);
//			cmd.addParameter("@P_EXP_PAR_TAX_PD", pExpParTaxPd);
//			cmd.addParameter("@P_EXP_PAR_OTH_TAX_INC", pExpParOthTaxInc);
//			cmd.addParameter("@P_EXP_PAR_UNTAX_INC", pExpParUntaxInc);
//			cmd.addParameter("@P_EXP_FATH_INC_FR_WRK", pExpFathIncFrWrk);
//			cmd.addParameter("@P_EXP_MOTH_INC_FR_WRK", pExpMothIncFrWrk);
//			cmd.addParameter("@P_FED_COLL_CHOICE_1", pFedCollChoice1);
//			cmd.addParameter("@P_FED_COLL_CHOICE_2", pFedCollChoice2);
//			cmd.addParameter("@P_FED_COLL_CHOICE_3", pFedCollChoice3);
//			cmd.addParameter("@P_COLL_CHOICE_NO", pCollChoiceNo);
//			cmd.addParameter("@P_IN_DEFAULT", pInDefault);
//			cmd.addParameter("@P_OWES_REFUND", pOwesRefund);
//			cmd.addParameter("@P_CONSIDER_FOR_STAF", pConsiderForStaf);
//			cmd.addParameter("@P_BAL_ON_ALL_STAF", pBalOnAllStaf);
//			cmd.addParameter("@P_RECENT_STAF_BAL", pRecentStafBal);
//			cmd.addParameter("@P_RECENT_STAF_INT_RATE", pRecentStafIntRate);
//			cmd.addParameter("@P_RECENT_STAF_FR_MTH_YR", pRecentStafFrMthYr);
//			cmd.addParameter("@P_RECENT_STAF_TO_MTH_YR", pRecentStafToMthYr);
//			cmd.addParameter("@P_RECENT_STAF_CLASS", pRecentStafClass);
//			cmd.addParameter("@P_RQST_FA_PREF", pRqstFaPref);
//			cmd.addParameter("@P_RQST_FA_FR_MTH_YR", pRqstFaFrMthYr);
//			cmd.addParameter("@P_RQST_FA_TO_MTH_YR", pRqstFaToMthYr);
//			cmd.addParameter("@P_RQST_STAF_AMT", pRqstStafAmt);
//			cmd.addParameter("@P_RQST_STAF_FA_FR_MTH_YR", pRqstStafFaFrMthYr);
//			cmd.addParameter("@P_RQST_STAF_FA_TO_MTH_YR", pRqstStafFaToMthYr);
//			cmd.addParameter("@P_RQST_FA_SUMMER_THIS_YR", pRqstFaSummerThisYr);
//			cmd.addParameter("@P_RQST_FA_FALL_THIS_YR", pRqstFaFallThisYr);
//			cmd.addParameter("@P_RQST_FA_WINTER_NEXT_YR", pRqstFaWinterNextYr);
//			cmd.addParameter("@P_RQST_FA_SPRING_NEXT_YR", pRqstFaSpringNextYr);
//			cmd.addParameter("@P_RQST_FA_SUMMER_NEXT_YR", pRqstFaSummerNextYr);
//			cmd.addParameter("@P_RQST_FA_OTHER", pRqstFaOther);
//			cmd.addParameter("@P_CLASSIFICATION", pClassification);
//			cmd.addParameter("@P_EXP_WRK_HRS", pExpWrkHrs);
//			cmd.addParameter("@P_INST_HOUS_CDE", pInstHousCde);
//			cmd.addParameter("@P_COLL_CDE_1", pCollCde1);
//			cmd.addParameter("@P_HOUS_CDE_1", pHousCde1);
//			cmd.addParameter("@P_COLL_CDE_2", pCollCde2);
//			cmd.addParameter("@P_HOUS_CDE_2", pHousCde2);
//			cmd.addParameter("@P_COLL_CDE_3", pCollCde3);
//			cmd.addParameter("@P_HOUS_CDE_3", pHousCde3);
//			cmd.addParameter("@P_COLL_CDE_4", pCollCde4);
//			cmd.addParameter("@P_HOUS_CDE_4", pHousCde4);
//			cmd.addParameter("@P_COLL_CDE_5", pCollCde5);
//			cmd.addParameter("@P_HOUS_CDE_5", pHousCde5);
//			cmd.addParameter("@P_COLL_CDE_6", pCollCde6);
//			cmd.addParameter("@P_HOUS_CDE_6", pHousCde6);
//			cmd.addParameter("@P_COLL_CDE_7", pCollCde7);
//			cmd.addParameter("@P_HOUS_CDE_7", pHousCde7);
//			cmd.addParameter("@P_COLL_CDE_8", pCollCde8);
//			cmd.addParameter("@P_HOUS_CDE_8", pHousCde8);
//			cmd.addParameter("@P_ADDL_COLL_CDE_1", pAddlCollCde1);
//			cmd.addParameter("@P_ADDL_COLL_CDE_2", pAddlCollCde2);
//			cmd.addParameter("@P_ADDL_COLL_CDE_3", pAddlCollCde3);
//			cmd.addParameter("@P_ADDL_COLL_CDE_4", pAddlCollCde4);
//			cmd.addParameter("@P_ADDL_COLL_CDE_5", pAddlCollCde5);
//			cmd.addParameter("@P_ADDL_COLL_CDE_6", pAddlCollCde6);
//			cmd.addParameter("@P_ADDL_COLL_CDE_7", pAddlCollCde7);
//			cmd.addParameter("@P_ADDL_COLL_CDE_8", pAddlCollCde8);
//			cmd.addParameter("@P_EXTRA_REQUEST", pExtraRequest);
//			cmd.addParameter("@P_REL_TO_STATE", pRelToState);
//			cmd.addParameter("@P_REL_TO_US_ED", pRelToUsEd);
//			cmd.addParameter("@P_REL_US_ED_TO_STATE", pRelUsEdToState);
//			cmd.addParameter("@P_REL_US_ED_TO_COLL", pRelUsEdToColl);
//			cmd.addParameter("@P_BUS_FARM_SUPP_FILED", pBusFarmSuppFiled);
//			cmd.addParameter("@P_SIGNED", pSigned);
//			cmd.addParameter("@P_SIGNED_SPS", pSignedSps);
//			cmd.addParameter("@P_SIGNED_FATH", pSignedFath);
//			cmd.addParameter("@P_SIGNED_MOTH", pSignedMoth);
//			cmd.addParameter("@P_SIGNED_PAR", pSignedPar);
//			cmd.addParameter("@P_SIGNED_MTH_DAY", pSignedMthDay);
//			cmd.addParameter("@P_SIGNED_YR", pSignedYr);
//			cmd.addParameter("@P_DEPEND_AGE_0_5", pDependAge05);
//			cmd.addParameter("@P_DEPEND_AGE_6_12", pDependAge612);
//			cmd.addParameter("@P_DEPEND_AGE_13_PLUS", pDependAge13Plus);
//			cmd.addParameter("@P_CONT_WRK_ACYR", pContWrkAcyr);
//			cmd.addParameter("@P_PERMIT_DRAFT_REG", pPermitDraftReg);
//			cmd.addParameter("@P_PELL_REL_MSG", pPellRelMsg);
//			cmd.addParameter("@P_ST_AGENCY_REL_MSG", pStAgencyRelMsg);
//			cmd.addParameter("@P_VERIFICATION_MSG", pVerificationMsg);
//			cmd.addParameter("@P_VERIFICATION_PRTY", pVerificationPrty);
//			cmd.addParameter("@P_INS", pIns);
//			cmd.addParameter("@P_SELECTIVE_SERVICE", pSelectiveService);
//			cmd.addParameter("@P_SPEC_COND_IND", pSpecCondInd);
//			cmd.addParameter("@P_TITLE_IV_DEFAULT", pTitleIvDefault);
//			cmd.addParameter("@P_INAS_OPTION", pInasOption);
//			cmd.addParameter("@P_EDE_SOURCE", pEdeSource);
//			cmd.addParameter("@P_EDE_SPEC_COND_IND", pEdeSpecCondInd);
//			cmd.addParameter("@P_USED_TRANS_NO", pUsedTransNo);
//			cmd.addParameter("@P_DEF_MATCH_REGION", pDefMatchRegion);
//			cmd.addParameter("@P_PREV_COLL4", pPrevColl4);
//			cmd.addParameter("@P_1989_RSRC_4000_9192", p1989Rsrc40009192);
//			cmd.addParameter("@P_1990_RSRC_4000_9192", p1990Rsrc40009192);
//			cmd.addParameter("@P_IN_DEF_OWE_REF", pInDefOweRef);
//			cmd.addParameter("@P_PAR_SS_BENE_STU_ONLY", pParSsBeneStuOnly);
//			cmd.addParameter("@P_COMPLETION_DATE", pCompletionDate);
//			cmd.addParameter("@P_PAR_REMARRIAGE_DATE", pParRemarriageDate);
//			cmd.addParameter("@P_LOWEST_INC_FILER", pLowestIncFiler);
//			cmd.addParameter("@P_MEANS_TEST_BEN", pMeansTestBen);
//			cmd.addParameter("@P_PAR_RECD_TANF", pParRecdTanf);
//			cmd.addParameter("@P_PAR_RECD_SSI", pParRecdSsi);
//			cmd.addParameter("@P_PAR_MEANS_TEST_BEN", pParMeansTestBen);
//			cmd.addParameter("@P_PAR_HOUS_STAT", pParHousStat);
//			cmd.addParameter("@P_ACTIVE_DUTY", pActiveDuty);
//			cmd.addParameter("@P_PAR_FOOD_STAMPS", pParFoodStamps);
//			cmd.addParameter("@P_PAR_SCHOOL_LUNCH", pParSchoolLunch);
//			cmd.addParameter("@P_PAR_RECD_WIC", pParRecdWic);
//			cmd.addParameter("@P_RECD_SSI", pRecdSsi);
//			cmd.addParameter("@P_FOOD_STAMPS", pFoodStamps);
//			cmd.addParameter("@P_SCHOOL_LUNCH", pSchoolLunch);
//			cmd.addParameter("@P_RECD_TANF", pRecdTanf);
//			cmd.addParameter("@P_RECD_WIC", pRecdWic);
//			cmd.addParameter("@P_SURNAME_PREFIX", pSurnamePrefix);
//			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
//			cmd.addParameter("@P_ADDR2", pAddr2);
//			cmd.addParameter("@P_ADDR3", pAddr3);
//			cmd.addParameter("@P_ADDR4", pAddr4);
//			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
//			cmd.addParameter("@P_RECV_VET_BENEFITS", pRecvVetBenefits);
//			cmd.addParameter("@P_TYPE_VET_BENEFITS", pTypeVetBenefits);
//			cmd.addParameter("@P_IRA_DISTRIBUTIONS", pIraDistributions);
//			cmd.addParameter("@P_UNTAX_PENSIONS", pUntaxPensions);
//			cmd.addParameter("@P_VETS_NON_ED_BEN", pVetsNonEdBen);
//			cmd.addParameter("@P_OTH_NON_REPORT_MONEY", pOthNonReportMoney);
//			cmd.addParameter("@P_EMANCIPATED_MINOR", pEmancipatedMinor);
//			cmd.addParameter("@P_LEGAL_GUARDIAN", pLegalGuardian);
//			cmd.addParameter("@P_UNACCOMP_YOUTH_SCHOOL", pUnaccompYouthSchool);
//			cmd.addParameter("@P_UNACCOMP_YOUTH_HUD", pUnaccompYouthHud);
//			cmd.addParameter("@P_AT_RISK_HOMELESS", pAtRiskHomeless);
//			cmd.addParameter("@P_PAR_IRA_DISTRIBUTIONS", pParIraDistributions);
//			cmd.addParameter("@P_PAR_UNTAX_PENSIONS", pParUntaxPensions);
//			cmd.addParameter("@P_PAR_VETS_NON_ED_BEN", pParVetsNonEdBen);
//			cmd.addParameter("@P_PAR_CNTRY_CODE_RES", pParCntryCodeRes);
//			cmd.addParameter("@P_MAIL_ADDR", pMailAddr);
//			cmd.addParameter("@P_MAIL_CITY", pMailCity);
//			cmd.addParameter("@P_MAIL_STAT_CODE", pMailStatCode);
//			cmd.addParameter("@P_MAIL_POSTAL_CDE", pMailPostalCde);
//			cmd.addParameter("@P_INTL_PHONE_NO", pIntlPhoneNo);
//			cmd.addParameter("@P_MAIL_COUNTRY_CDE", pMailCountryCde);
//			cmd.addParameter("@P_PREFERRED_NAME", pPreferredName);
//			cmd.addParameter("@P_ROWID", pRowid);
//				
//			cmd.execute();
//
//
//		}
		
	
	
	@DbRecordType(id="TempAppP1RecRow", dataSourceName="TEMP_APP_P1_REC")
	public static class TempAppP1RecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_INFC_CODE")
		public NString RInfcCode;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_CURR_REC_IND")
		public NString RCurrRecInd;
		@DbRecordField(dataSourceName="R_CREATOR_ID")
		public NString RCreatorId;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_CREATE_DATE")
		public NDate RCreateDate;
		@DbRecordField(dataSourceName="R_COLL_CDE")
		public NString RCollCde;
		@DbRecordField(dataSourceName="R_ACYR_CODE")
		public NString RAcyrCode;
		@DbRecordField(dataSourceName="R_LAST_NAME")
		public NString RLastName;
		@DbRecordField(dataSourceName="R_FIRST_NAME")
		public NString RFirstName;
		@DbRecordField(dataSourceName="R_MI")
		public NString RMi;
		@DbRecordField(dataSourceName="R_TITLE")
		public NString RTitle;
		@DbRecordField(dataSourceName="R_ADDR")
		public NString RAddr;
		@DbRecordField(dataSourceName="R_CITY")
		public NString RCity;
		@DbRecordField(dataSourceName="R_STAT_CODE")
		public NString RStatCode;
		@DbRecordField(dataSourceName="R_ZIP")
		public NString RZip;
		@DbRecordField(dataSourceName="R_SSN_PREFIX")
		public NString RSsnPrefix;
		@DbRecordField(dataSourceName="R_SSN")
		public NString RSsn;
		@DbRecordField(dataSourceName="R_BIRTH_DATE")
		public NDate RBirthDate;
		@DbRecordField(dataSourceName="R_PHONE_AREA")
		public NString RPhoneArea;
		@DbRecordField(dataSourceName="R_PHONE_NO")
		public NString RPhoneNo;
		@DbRecordField(dataSourceName="R_STAT_CODE_RES")
		public NString RStatCodeRes;
		@DbRecordField(dataSourceName="R_START_RES_MTH_YR")
		public NString RStartResMthYr;
		@DbRecordField(dataSourceName="R_RCPT_DATE")
		public NDate RRcptDate;
		@DbRecordField(dataSourceName="R_REV_RCPT_DATE")
		public NDate RRevRcptDate;
		@DbRecordField(dataSourceName="R_ORIG_COMP_DATE")
		public NDate ROrigCompDate;
		@DbRecordField(dataSourceName="R_REV_COMP_DATE")
		public NDate RRevCompDate;
		@DbRecordField(dataSourceName="R_CITZ_IND")
		public NString RCitzInd;
		@DbRecordField(dataSourceName="R_ALIEN_REG_NO")
		public NString RAlienRegNo;
		@DbRecordField(dataSourceName="R_MRTL_STATUS")
		public NString RMrtlStatus;
		@DbRecordField(dataSourceName="R_HS_CDE")
		public NString RHsCde;
		@DbRecordField(dataSourceName="R_EXP_ENROLL_STATUS")
		public NString RExpEnrollStatus;
		@DbRecordField(dataSourceName="R_YR_IN_COLL")
		public NString RYrInColl;
		@DbRecordField(dataSourceName="R_CRSE_OF_STUDY")
		public NString RCrseOfStudy;
		@DbRecordField(dataSourceName="R_EXP_GRAD_MTH_YR")
		public NString RExpGradMthYr;
		@DbRecordField(dataSourceName="R_DEGREE_BY_JULY")
		public NString RDegreeByJuly;
		@DbRecordField(dataSourceName="R_MORE_THAN_3_PREV_COLL")
		public NString RMoreThan3PrevColl;
		@DbRecordField(dataSourceName="R_NO_SCH")
		public NNumber RNoSch;
		@DbRecordField(dataSourceName="R_PREV_COLL1")
		public NString RPrevColl1;
		@DbRecordField(dataSourceName="R_PREV_COLL2")
		public NString RPrevColl2;
		@DbRecordField(dataSourceName="R_PREV_COLL3")
		public NString RPrevColl3;
		@DbRecordField(dataSourceName="R_DRIVER_LIC_NO")
		public NString RDriverLicNo;
		@DbRecordField(dataSourceName="R_STAT_CODE_LIC")
		public NString RStatCodeLic;
		@DbRecordField(dataSourceName="R_DISL_WRK")
		public NString RDislWrk;
		@DbRecordField(dataSourceName="R_DISP_HME")
		public NString RDispHme;
		@DbRecordField(dataSourceName="R_FAM_MEMB")
		public NNumber RFamMemb;
		@DbRecordField(dataSourceName="R_NO_IN_COLL")
		public NNumber RNoInColl;
		@DbRecordField(dataSourceName="R_CASH_AMT")
		public NNumber RCashAmt;
		@DbRecordField(dataSourceName="R_HME_VAL")
		public NNumber RHmeVal;
		@DbRecordField(dataSourceName="R_HME_DBT")
		public NNumber RHmeDbt;
		@DbRecordField(dataSourceName="R_RE_INV_VAL")
		public NNumber RReInvVal;
		@DbRecordField(dataSourceName="R_RE_INV_DBT")
		public NNumber RReInvDbt;
		@DbRecordField(dataSourceName="R_BUS_FARM_VAL")
		public NNumber RBusFarmVal;
		@DbRecordField(dataSourceName="R_BUS_FARM_DBT")
		public NNumber RBusFarmDbt;
		@DbRecordField(dataSourceName="R_INCL_FARM")
		public NString RInclFarm;
		@DbRecordField(dataSourceName="R_BORN_BEFORE_1_1_XX")
		public NString RBornBefore11Xx;
		@DbRecordField(dataSourceName="R_US_VET")
		public NString RUsVet;
		@DbRecordField(dataSourceName="R_WARD_OF_COURT")
		public NString RWardOfCourt;
		@DbRecordField(dataSourceName="R_HAS_LEGAL_DEPEND")
		public NString RHasLegalDepend;
		@DbRecordField(dataSourceName="R_TAX_FORM_IND")
		public NString RTaxFormInd;
		@DbRecordField(dataSourceName="R_NO_EXEMPT")
		public NNumber RNoExempt;
		@DbRecordField(dataSourceName="R_US_INC")
		public NNumber RUsInc;
		@DbRecordField(dataSourceName="R_US_INC_TAX_PD")
		public NNumber RUsIncTaxPd;
		@DbRecordField(dataSourceName="R_INC_FR_WRK")
		public NNumber RIncFrWrk;
		@DbRecordField(dataSourceName="R_SPS_INC_FR_WRK")
		public NNumber RSpsIncFrWrk;
		@DbRecordField(dataSourceName="R_SS_BENE")
		public NNumber RSsBene;
		@DbRecordField(dataSourceName="R_AFDC")
		public NNumber RAfdc;
		@DbRecordField(dataSourceName="R_CHILD_SUPP")
		public NNumber RChildSupp;
		@DbRecordField(dataSourceName="R_OTH_UNTAX_INC")
		public NNumber ROthUntaxInc;
		@DbRecordField(dataSourceName="R_MED_DEN_EXP")
		public NNumber RMedDenExp;
		@DbRecordField(dataSourceName="R_TUIT_PD")
		public NNumber RTuitPd;
		@DbRecordField(dataSourceName="R_NO_CHILD_TUIT")
		public NNumber RNoChildTuit;
		@DbRecordField(dataSourceName="R_EXP_TAX_PD")
		public NNumber RExpTaxPd;
		@DbRecordField(dataSourceName="R_EXP_INC_FR_WRK")
		public NNumber RExpIncFrWrk;
		@DbRecordField(dataSourceName="R_EXP_SPS_INC_FR_WRK")
		public NNumber RExpSpsIncFrWrk;
		@DbRecordField(dataSourceName="R_EXP_OTH_TAX_INC")
		public NNumber RExpOthTaxInc;
		@DbRecordField(dataSourceName="R_EXP_UNTAX_INC")
		public NNumber RExpUntaxInc;
		@DbRecordField(dataSourceName="R_EXP_SMR_INC")
		public NNumber RExpSmrInc;
		@DbRecordField(dataSourceName="R_EXP_ACYR_INC")
		public NNumber RExpAcyrInc;
		@DbRecordField(dataSourceName="R_EXP_SPS_SMR_INC")
		public NNumber RExpSpsSmrInc;
		@DbRecordField(dataSourceName="R_EXP_SPS_ACYR_INC")
		public NNumber RExpSpsAcyrInc;
		@DbRecordField(dataSourceName="R_EXP_SMR_OTH_TAX_INC")
		public NNumber RExpSmrOthTaxInc;
		@DbRecordField(dataSourceName="R_EXP_ACYR_OTH_TAX_INC")
		public NNumber RExpAcyrOthTaxInc;
		@DbRecordField(dataSourceName="R_EXP_SMR_UNTAX_INC")
		public NNumber RExpSmrUntaxInc;
		@DbRecordField(dataSourceName="R_EXP_ACYR_UNTAX_INC")
		public NNumber RExpAcyrUntaxInc;
		@DbRecordField(dataSourceName="R_GI_DEAB_AMT")
		public NNumber RGiDeabAmt;
		@DbRecordField(dataSourceName="R_GI_DEAB_MTH")
		public NNumber RGiDeabMth;
		@DbRecordField(dataSourceName="R_VEAP_BEN_AMT")
		public NNumber RVeapBenAmt;
		@DbRecordField(dataSourceName="R_VEAP_BEN_MTH")
		public NNumber RVeapBenMth;
		@DbRecordField(dataSourceName="R_OTH_VA_AMT")
		public NNumber ROthVaAmt;
		@DbRecordField(dataSourceName="R_OTH_VA_MTH")
		public NNumber ROthVaMth;
		@DbRecordField(dataSourceName="R_CLM_AS_TAX_EXEMPT_2YR")
		public NString RClmAsTaxExempt2yr;
		@DbRecordField(dataSourceName="R_CLM_AS_TAX_EXEMPT_1YR")
		public NString RClmAsTaxExempt1yr;
		@DbRecordField(dataSourceName="R_CLM_AS_TAX_EXEMPT")
		public NString RClmAsTaxExempt;
		@DbRecordField(dataSourceName="R_WHEN_RCVD_AID")
		public NString RWhenRcvdAid;
		@DbRecordField(dataSourceName="R_1985_RSRC_4000_8788")
		public NString R1985Rsrc40008788;
		@DbRecordField(dataSourceName="R_1986_RSRC_4000_8788")
		public NString R1986Rsrc40008788;
		@DbRecordField(dataSourceName="R_1986_RSRC_4000_8889")
		public NString R1986Rsrc40008889;
		@DbRecordField(dataSourceName="R_1987_RSRC_4000_8889")
		public NString R1987Rsrc40008889;
		@DbRecordField(dataSourceName="R_1987_RSRC_4000_8990")
		public NString R1987Rsrc40008990;
		@DbRecordField(dataSourceName="R_1988_RSRC_4000_8990")
		public NString R1988Rsrc40008990;
		@DbRecordField(dataSourceName="R_1988_RSRC_4000_9091")
		public NString R1988Rsrc40009091;
		@DbRecordField(dataSourceName="R_1989_RSRC_4000_9091")
		public NString R1989Rsrc40009091;
		@DbRecordField(dataSourceName="R_NO_AID_RSRC_4000_2YR")
		public NString RNoAidRsrc40002yr;
		@DbRecordField(dataSourceName="R_NO_AID_RSRC_4000_1YR")
		public NString RNoAidRsrc40001yr;
		@DbRecordField(dataSourceName="R_LINE2_RELSHIP")
		public NString RLine2Relship;
		@DbRecordField(dataSourceName="R_LINE2_ATTEND_COLL")
		public NString RLine2AttendColl;
		@DbRecordField(dataSourceName="R_LINE3_RELSHIP")
		public NString RLine3Relship;
		@DbRecordField(dataSourceName="R_LINE3_ATTEND_COLL")
		public NString RLine3AttendColl;
		@DbRecordField(dataSourceName="R_LINE4_RELSHIP")
		public NString RLine4Relship;
		@DbRecordField(dataSourceName="R_LINE4_ATTEND_COLL")
		public NString RLine4AttendColl;
		@DbRecordField(dataSourceName="R_LINE5_RELSHIP")
		public NString RLine5Relship;
		@DbRecordField(dataSourceName="R_LINE5_ATTEND_COLL")
		public NString RLine5AttendColl;
		@DbRecordField(dataSourceName="R_LINE6_RELSHIP")
		public NString RLine6Relship;
		@DbRecordField(dataSourceName="R_LINE6_ATTEND_COLL")
		public NString RLine6AttendColl;
		@DbRecordField(dataSourceName="R_LINE7_RELSHIP")
		public NString RLine7Relship;
		@DbRecordField(dataSourceName="R_LINE7_ATTEND_COLL")
		public NString RLine7AttendColl;
		@DbRecordField(dataSourceName="R_LINE8_RELSHIP")
		public NString RLine8Relship;
		@DbRecordField(dataSourceName="R_LINE8_ATTEND_COLL")
		public NString RLine8AttendColl;
		@DbRecordField(dataSourceName="R_PAR_MRTL_STATUS")
		public NString RParMrtlStatus;
		@DbRecordField(dataSourceName="R_PAR_OLDER_AGE")
		public NNumber RParOlderAge;
		@DbRecordField(dataSourceName="R_PAR_STAT_CODE_RES")
		public NString RParStatCodeRes;
		@DbRecordField(dataSourceName="R_PAR_DISL_WRK")
		public NString RParDislWrk;
		@DbRecordField(dataSourceName="R_PAR_DISP_HME")
		public NString RParDispHme;
		@DbRecordField(dataSourceName="R_PAR_FAM_MEMB")
		public NNumber RParFamMemb;
		@DbRecordField(dataSourceName="R_PAR_NO_IN_COLL")
		public NNumber RParNoInColl;
		@DbRecordField(dataSourceName="R_PAR_CASH_AMT")
		public NNumber RParCashAmt;
		@DbRecordField(dataSourceName="R_PAR_HME_VAL")
		public NNumber RParHmeVal;
		@DbRecordField(dataSourceName="R_PAR_HME_DBT")
		public NNumber RParHmeDbt;
		@DbRecordField(dataSourceName="R_PAR_RE_INV_VAL")
		public NNumber RParReInvVal;
		@DbRecordField(dataSourceName="R_PAR_RE_INV_DBT")
		public NNumber RParReInvDbt;
		@DbRecordField(dataSourceName="R_PAR_CURR_INV_VAL")
		public NNumber RParCurrInvVal;
		@DbRecordField(dataSourceName="R_PAR_BUS_FARM_VAL")
		public NNumber RParBusFarmVal;
		@DbRecordField(dataSourceName="R_PAR_BUS_FARM_DBT")
		public NNumber RParBusFarmDbt;
		@DbRecordField(dataSourceName="R_PAR_INCL_FARM")
		public NString RParInclFarm;
		@DbRecordField(dataSourceName="R_PAR_HME_YR_PURCH")
		public NNumber RParHmeYrPurch;
		@DbRecordField(dataSourceName="R_PAR_HME_PURCH_AMT")
		public NNumber RParHmePurchAmt;
		@DbRecordField(dataSourceName="R_PAR_DIV_SEP_REM_IND")
		public NString RParDivSepRemInd;
		@DbRecordField(dataSourceName="R_PAR_TAX_FORM_IND")
		public NString RParTaxFormInd;
		@DbRecordField(dataSourceName="R_PAR_NO_EXEMPT")
		public NNumber RParNoExempt;
		@DbRecordField(dataSourceName="R_PAR_US_INC")
		public NNumber RParUsInc;
		@DbRecordField(dataSourceName="R_PAR_WAGES")
		public NNumber RParWages;
		@DbRecordField(dataSourceName="R_PAR_INT_INC")
		public NNumber RParIntInc;
		@DbRecordField(dataSourceName="R_PAR_DIV_INC")
		public NNumber RParDivInc;
		@DbRecordField(dataSourceName="R_PAR_BUS_FARM_INC")
		public NNumber RParBusFarmInc;
		@DbRecordField(dataSourceName="R_PAR_OTH_TAX_INC")
		public NNumber RParOthTaxInc;
		@DbRecordField(dataSourceName="R_PAR_ADJ_TO_INC")
		public NNumber RParAdjToInc;
		@DbRecordField(dataSourceName="R_PAR_US_INC_TAX_PD")
		public NNumber RParUsIncTaxPd;
		@DbRecordField(dataSourceName="R_FATH_INC_FR_WRK")
		public NNumber RFathIncFrWrk;
		@DbRecordField(dataSourceName="R_MOTH_INC_FR_WRK")
		public NNumber RMothIncFrWrk;
		@DbRecordField(dataSourceName="R_PAR_SS_BENE")
		public NNumber RParSsBene;
		@DbRecordField(dataSourceName="R_PAR_AFDC")
		public NNumber RParAfdc;
		@DbRecordField(dataSourceName="R_PAR_CHILD_SUPP")
		public NNumber RParChildSupp;
		@DbRecordField(dataSourceName="R_PAR_OTH_UNTAX_INC")
		public NNumber RParOthUntaxInc;
		@DbRecordField(dataSourceName="R_PAR_MED_DEN_EXP")
		public NNumber RParMedDenExp;
		@DbRecordField(dataSourceName="R_PAR_TUIT_PD")
		public NNumber RParTuitPd;
		@DbRecordField(dataSourceName="R_PAR_NO_CHILD_TUIT")
		public NNumber RParNoChildTuit;
		@DbRecordField(dataSourceName="R_EXP_PAR_TAX_PD")
		public NNumber RExpParTaxPd;
		@DbRecordField(dataSourceName="R_EXP_PAR_OTH_TAX_INC")
		public NNumber RExpParOthTaxInc;
		@DbRecordField(dataSourceName="R_EXP_PAR_UNTAX_INC")
		public NNumber RExpParUntaxInc;
		@DbRecordField(dataSourceName="R_EXP_FATH_INC_FR_WRK")
		public NNumber RExpFathIncFrWrk;
		@DbRecordField(dataSourceName="R_EXP_MOTH_INC_FR_WRK")
		public NNumber RExpMothIncFrWrk;
		@DbRecordField(dataSourceName="R_FED_COLL_CHOICE_1")
		public NString RFedCollChoice1;
		@DbRecordField(dataSourceName="R_FED_COLL_CHOICE_2")
		public NString RFedCollChoice2;
		@DbRecordField(dataSourceName="R_FED_COLL_CHOICE_3")
		public NString RFedCollChoice3;
		@DbRecordField(dataSourceName="R_COLL_CHOICE_NO")
		public NString RCollChoiceNo;
		@DbRecordField(dataSourceName="R_IN_DEFAULT")
		public NString RInDefault;
		@DbRecordField(dataSourceName="R_OWES_REFUND")
		public NString ROwesRefund;
		@DbRecordField(dataSourceName="R_CONSIDER_FOR_STAF")
		public NString RConsiderForStaf;
		@DbRecordField(dataSourceName="R_BAL_ON_ALL_STAF")
		public NNumber RBalOnAllStaf;
		@DbRecordField(dataSourceName="R_RECENT_STAF_BAL")
		public NNumber RRecentStafBal;
		@DbRecordField(dataSourceName="R_RECENT_STAF_INT_RATE")
		public NString RRecentStafIntRate;
		@DbRecordField(dataSourceName="R_RECENT_STAF_FR_MTH_YR")
		public NString RRecentStafFrMthYr;
		@DbRecordField(dataSourceName="R_RECENT_STAF_TO_MTH_YR")
		public NString RRecentStafToMthYr;
		@DbRecordField(dataSourceName="R_RECENT_STAF_CLASS")
		public NString RRecentStafClass;
		@DbRecordField(dataSourceName="R_RQST_FA_PREF")
		public NString RRqstFaPref;
		@DbRecordField(dataSourceName="R_RQST_FA_FR_MTH_YR")
		public NString RRqstFaFrMthYr;
		@DbRecordField(dataSourceName="R_RQST_FA_TO_MTH_YR")
		public NString RRqstFaToMthYr;
		@DbRecordField(dataSourceName="R_RQST_STAF_AMT")
		public NNumber RRqstStafAmt;
		@DbRecordField(dataSourceName="R_RQST_STAF_FA_FR_MTH_YR")
		public NString RRqstStafFaFrMthYr;
		@DbRecordField(dataSourceName="R_RQST_STAF_FA_TO_MTH_YR")
		public NString RRqstStafFaToMthYr;
		@DbRecordField(dataSourceName="R_RQST_FA_SUMMER_THIS_YR")
		public NString RRqstFaSummerThisYr;
		@DbRecordField(dataSourceName="R_RQST_FA_FALL_THIS_YR")
		public NString RRqstFaFallThisYr;
		@DbRecordField(dataSourceName="R_RQST_FA_WINTER_NEXT_YR")
		public NString RRqstFaWinterNextYr;
		@DbRecordField(dataSourceName="R_RQST_FA_SPRING_NEXT_YR")
		public NString RRqstFaSpringNextYr;
		@DbRecordField(dataSourceName="R_RQST_FA_SUMMER_NEXT_YR")
		public NString RRqstFaSummerNextYr;
		@DbRecordField(dataSourceName="R_RQST_FA_OTHER")
		public NString RRqstFaOther;
		@DbRecordField(dataSourceName="R_CLASSIFICATION")
		public NString RClassification;
		@DbRecordField(dataSourceName="R_EXP_WRK_HRS")
		public NString RExpWrkHrs;
		@DbRecordField(dataSourceName="R_INST_HOUS_CDE")
		public NString RInstHousCde;
		@DbRecordField(dataSourceName="R_COLL_CDE_1")
		public NString RCollCde1;
		@DbRecordField(dataSourceName="R_HOUS_CDE_1")
		public NString RHousCde1;
		@DbRecordField(dataSourceName="R_COLL_CDE_2")
		public NString RCollCde2;
		@DbRecordField(dataSourceName="R_HOUS_CDE_2")
		public NString RHousCde2;
		@DbRecordField(dataSourceName="R_COLL_CDE_3")
		public NString RCollCde3;
		@DbRecordField(dataSourceName="R_HOUS_CDE_3")
		public NString RHousCde3;
		@DbRecordField(dataSourceName="R_COLL_CDE_4")
		public NString RCollCde4;
		@DbRecordField(dataSourceName="R_HOUS_CDE_4")
		public NString RHousCde4;
		@DbRecordField(dataSourceName="R_COLL_CDE_5")
		public NString RCollCde5;
		@DbRecordField(dataSourceName="R_HOUS_CDE_5")
		public NString RHousCde5;
		@DbRecordField(dataSourceName="R_COLL_CDE_6")
		public NString RCollCde6;
		@DbRecordField(dataSourceName="R_HOUS_CDE_6")
		public NString RHousCde6;
		@DbRecordField(dataSourceName="R_COLL_CDE_7")
		public NString RCollCde7;
		@DbRecordField(dataSourceName="R_HOUS_CDE_7")
		public NString RHousCde7;
		@DbRecordField(dataSourceName="R_COLL_CDE_8")
		public NString RCollCde8;
		@DbRecordField(dataSourceName="R_HOUS_CDE_8")
		public NString RHousCde8;
		@DbRecordField(dataSourceName="R_ADDL_COLL_CDE_1")
		public NString RAddlCollCde1;
		@DbRecordField(dataSourceName="R_ADDL_COLL_CDE_2")
		public NString RAddlCollCde2;
		@DbRecordField(dataSourceName="R_ADDL_COLL_CDE_3")
		public NString RAddlCollCde3;
		@DbRecordField(dataSourceName="R_ADDL_COLL_CDE_4")
		public NString RAddlCollCde4;
		@DbRecordField(dataSourceName="R_ADDL_COLL_CDE_5")
		public NString RAddlCollCde5;
		@DbRecordField(dataSourceName="R_ADDL_COLL_CDE_6")
		public NString RAddlCollCde6;
		@DbRecordField(dataSourceName="R_ADDL_COLL_CDE_7")
		public NString RAddlCollCde7;
		@DbRecordField(dataSourceName="R_ADDL_COLL_CDE_8")
		public NString RAddlCollCde8;
		@DbRecordField(dataSourceName="R_EXTRA_REQUEST")
		public NString RExtraRequest;
		@DbRecordField(dataSourceName="R_REL_TO_STATE")
		public NString RRelToState;
		@DbRecordField(dataSourceName="R_REL_TO_US_ED")
		public NString RRelToUsEd;
		@DbRecordField(dataSourceName="R_REL_US_ED_TO_STATE")
		public NString RRelUsEdToState;
		@DbRecordField(dataSourceName="R_REL_US_ED_TO_COLL")
		public NString RRelUsEdToColl;
		@DbRecordField(dataSourceName="R_BUS_FARM_SUPP_FILED")
		public NString RBusFarmSuppFiled;
		@DbRecordField(dataSourceName="R_SIGNED")
		public NString RSigned;
		@DbRecordField(dataSourceName="R_SIGNED_SPS")
		public NString RSignedSps;
		@DbRecordField(dataSourceName="R_SIGNED_FATH")
		public NString RSignedFath;
		@DbRecordField(dataSourceName="R_SIGNED_MOTH")
		public NString RSignedMoth;
		@DbRecordField(dataSourceName="R_SIGNED_PAR")
		public NString RSignedPar;
		@DbRecordField(dataSourceName="R_SIGNED_MTH_DAY")
		public NString RSignedMthDay;
		@DbRecordField(dataSourceName="R_SIGNED_YR")
		public NString RSignedYr;
		@DbRecordField(dataSourceName="R_DEPEND_AGE_0_5")
		public NNumber RDependAge05;
		@DbRecordField(dataSourceName="R_DEPEND_AGE_6_12")
		public NNumber RDependAge612;
		@DbRecordField(dataSourceName="R_DEPEND_AGE_13_PLUS")
		public NNumber RDependAge13Plus;
		@DbRecordField(dataSourceName="R_CONT_WRK_ACYR")
		public NString RContWrkAcyr;
		@DbRecordField(dataSourceName="R_PERMIT_DRAFT_REG")
		public NString RPermitDraftReg;
		@DbRecordField(dataSourceName="R_PELL_REL_MSG")
		public NString RPellRelMsg;
		@DbRecordField(dataSourceName="R_ST_AGENCY_REL_MSG")
		public NString RStAgencyRelMsg;
		@DbRecordField(dataSourceName="R_VERIFICATION_MSG")
		public NString RVerificationMsg;
		@DbRecordField(dataSourceName="R_VERIFICATION_PRTY")
		public NString RVerificationPrty;
		@DbRecordField(dataSourceName="R_INS")
		public NString RIns;
		@DbRecordField(dataSourceName="R_SELECTIVE_SERVICE")
		public NString RSelectiveService;
		@DbRecordField(dataSourceName="R_SPEC_COND_IND")
		public NString RSpecCondInd;
		@DbRecordField(dataSourceName="R_TITLE_IV_DEFAULT")
		public NString RTitleIvDefault;
		@DbRecordField(dataSourceName="R_INAS_OPTION")
		public NString RInasOption;
		@DbRecordField(dataSourceName="R_EDE_SOURCE")
		public NString REdeSource;
		@DbRecordField(dataSourceName="R_EDE_SPEC_COND_IND")
		public NString REdeSpecCondInd;
		@DbRecordField(dataSourceName="R_USED_TRANS_NO")
		public NString RUsedTransNo;
		@DbRecordField(dataSourceName="R_DEF_MATCH_REGION")
		public NString RDefMatchRegion;
		@DbRecordField(dataSourceName="R_PREV_COLL4")
		public NString RPrevColl4;
		@DbRecordField(dataSourceName="R_1989_RSRC_4000_9192")
		public NString R1989Rsrc40009192;
		@DbRecordField(dataSourceName="R_1990_RSRC_4000_9192")
		public NString R1990Rsrc40009192;
		@DbRecordField(dataSourceName="R_IN_DEF_OWE_REF")
		public NString RInDefOweRef;
		@DbRecordField(dataSourceName="R_PAR_SS_BENE_STU_ONLY")
		public NNumber RParSsBeneStuOnly;
		@DbRecordField(dataSourceName="R_COMPLETION_DATE")
		public NDate RCompletionDate;
		@DbRecordField(dataSourceName="R_PAR_REMARRIAGE_DATE")
		public NDate RParRemarriageDate;
		@DbRecordField(dataSourceName="R_LOWEST_INC_FILER")
		public NString RLowestIncFiler;
		@DbRecordField(dataSourceName="R_MEANS_TEST_BEN")
		public NString RMeansTestBen;
		@DbRecordField(dataSourceName="R_PAR_RECD_TANF")
		public NString RParRecdTanf;
		@DbRecordField(dataSourceName="R_PAR_RECD_SSI")
		public NString RParRecdSsi;
		@DbRecordField(dataSourceName="R_PAR_MEANS_TEST_BEN")
		public NString RParMeansTestBen;
		@DbRecordField(dataSourceName="R_PAR_HOUS_STAT")
		public NString RParHousStat;
		@DbRecordField(dataSourceName="R_ACTIVE_DUTY")
		public NString RActiveDuty;
		@DbRecordField(dataSourceName="R_PAR_FOOD_STAMPS")
		public NString RParFoodStamps;
		@DbRecordField(dataSourceName="R_PAR_SCHOOL_LUNCH")
		public NString RParSchoolLunch;
		@DbRecordField(dataSourceName="R_PAR_RECD_WIC")
		public NString RParRecdWic;
		@DbRecordField(dataSourceName="R_RECD_SSI")
		public NString RRecdSsi;
		@DbRecordField(dataSourceName="R_FOOD_STAMPS")
		public NString RFoodStamps;
		@DbRecordField(dataSourceName="R_SCHOOL_LUNCH")
		public NString RSchoolLunch;
		@DbRecordField(dataSourceName="R_RECD_TANF")
		public NString RRecdTanf;
		@DbRecordField(dataSourceName="R_RECD_WIC")
		public NString RRecdWic;
		@DbRecordField(dataSourceName="R_SURNAME_PREFIX")
		public NString RSurnamePrefix;
		@DbRecordField(dataSourceName="R_CTRY_CODE_PHONE")
		public NString RCtryCodePhone;
		@DbRecordField(dataSourceName="R_ADDR2")
		public NString RAddr2;
		@DbRecordField(dataSourceName="R_ADDR3")
		public NString RAddr3;
		@DbRecordField(dataSourceName="R_ADDR4")
		public NString RAddr4;
		@DbRecordField(dataSourceName="R_HOUSE_NUMBER")
		public NString RHouseNumber;
		@DbRecordField(dataSourceName="R_RECV_VET_BENEFITS")
		public NString RRecvVetBenefits;
		@DbRecordField(dataSourceName="R_TYPE_VET_BENEFITS")
		public NString RTypeVetBenefits;
		@DbRecordField(dataSourceName="R_IRA_DISTRIBUTIONS")
		public NNumber RIraDistributions;
		@DbRecordField(dataSourceName="R_UNTAX_PENSIONS")
		public NNumber RUntaxPensions;
		@DbRecordField(dataSourceName="R_VETS_NON_ED_BEN")
		public NNumber RVetsNonEdBen;
		@DbRecordField(dataSourceName="R_OTH_NON_REPORT_MONEY")
		public NNumber ROthNonReportMoney;
		@DbRecordField(dataSourceName="R_EMANCIPATED_MINOR")
		public NString REmancipatedMinor;
		@DbRecordField(dataSourceName="R_LEGAL_GUARDIAN")
		public NString RLegalGuardian;
		@DbRecordField(dataSourceName="R_UNACCOMP_YOUTH_SCHOOL")
		public NString RUnaccompYouthSchool;
		@DbRecordField(dataSourceName="R_UNACCOMP_YOUTH_HUD")
		public NString RUnaccompYouthHud;
		@DbRecordField(dataSourceName="R_AT_RISK_HOMELESS")
		public NString RAtRiskHomeless;
		@DbRecordField(dataSourceName="R_PAR_IRA_DISTRIBUTIONS")
		public NNumber RParIraDistributions;
		@DbRecordField(dataSourceName="R_PAR_UNTAX_PENSIONS")
		public NNumber RParUntaxPensions;
		@DbRecordField(dataSourceName="R_PAR_VETS_NON_ED_BEN")
		public NNumber RParVetsNonEdBen;
		@DbRecordField(dataSourceName="R_PAR_CNTRY_CODE_RES")
		public NString RParCntryCodeRes;
		@DbRecordField(dataSourceName="R_MAIL_ADDR")
		public NString RMailAddr;
		@DbRecordField(dataSourceName="R_MAIL_CITY")
		public NString RMailCity;
		@DbRecordField(dataSourceName="R_MAIL_STAT_CODE")
		public NString RMailStatCode;
		@DbRecordField(dataSourceName="R_MAIL_POSTAL_CDE")
		public NString RMailPostalCde;
		@DbRecordField(dataSourceName="R_INTL_PHONE_NO")
		public NString RIntlPhoneNo;
		@DbRecordField(dataSourceName="R_MAIL_COUNTRY_CDE")
		public NString RMailCountryCde;
		@DbRecordField(dataSourceName="R_PREFERRED_NAME")
		public NString RPreferredName;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
