package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rcked140 {
		public static NString fGetRcrtptrConvCode(NString pInfcCode,NString pTname,NString pTapeCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKED140.F_GET_RCRTPTR_CONV_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_TNAME", pTname);
			cmd.addParameter("@P_TAPE_CODE", pTapeCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKED140.F_GET_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetDefaults(NString pAidyCode,NString pInfcCode,NString pParmAddrTypeCode,NString pParmTeleTypeCode,NString pParmStuEmailType,NString pParmParEmailType,Ref<NString> pCurrentTermCode,Ref<NString> pApplDateInd,Ref<NString> pSbgiConvInd,Ref<NString> pAprdCodeDef,Ref<NString> pSaprCode,Ref<NString> pFedSchoolCode,Ref<NString> pTfcProInd,Ref<NString> pInfcSbgiCode,Ref<NString> pInfcCtypCode,Ref<NString> pSbgiSrceInd,Ref<NString> pMajorCode,Ref<NNumber> pAprdTfcPct,Ref<NString> pMaritalCode,Ref<NString> pAtypTeleCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKED140.P_GET_DEFAULTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_PARM_ADDR_TYPE_CODE", pParmAddrTypeCode);
			cmd.addParameter("@P_PARM_TELE_TYPE_CODE", pParmTeleTypeCode);
			cmd.addParameter("@P_PARM_STU_EMAIL_TYPE", pParmStuEmailType);
			cmd.addParameter("@P_PARM_PAR_EMAIL_TYPE", pParmParEmailType);
			cmd.addParameter("@P_CURRENT_TERM_CODE", NString.class);
			cmd.addParameter("@P_APPL_DATE_IND", NString.class);
			cmd.addParameter("@P_SBGI_CONV_IND", NString.class);
			cmd.addParameter("@P_APRD_CODE_DEF", NString.class);
			cmd.addParameter("@P_SAPR_CODE", NString.class);
			cmd.addParameter("@P_FED_SCHOOL_CODE", NString.class);
			cmd.addParameter("@P_TFC_PRO_IND", NString.class);
			cmd.addParameter("@P_INFC_SBGI_CODE", NString.class);
			cmd.addParameter("@P_INFC_CTYP_CODE", NString.class);
			cmd.addParameter("@P_SBGI_SRCE_IND", NString.class);
			cmd.addParameter("@P_MAJOR_CODE", NString.class);
			cmd.addParameter("@P_APRD_TFC_PCT", NNumber.class);
			cmd.addParameter("@P_MARITAL_CODE", NString.class);
			cmd.addParameter("@P_ATYP_TELE_CODE", NString.class);
				
			cmd.execute();
			pCurrentTermCode.val = cmd.getParameterValue("@P_CURRENT_TERM_CODE", NString.class);
			pApplDateInd.val = cmd.getParameterValue("@P_APPL_DATE_IND", NString.class);
			pSbgiConvInd.val = cmd.getParameterValue("@P_SBGI_CONV_IND", NString.class);
			pAprdCodeDef.val = cmd.getParameterValue("@P_APRD_CODE_DEF", NString.class);
			pSaprCode.val = cmd.getParameterValue("@P_SAPR_CODE", NString.class);
			pFedSchoolCode.val = cmd.getParameterValue("@P_FED_SCHOOL_CODE", NString.class);
			pTfcProInd.val = cmd.getParameterValue("@P_TFC_PRO_IND", NString.class);
			pInfcSbgiCode.val = cmd.getParameterValue("@P_INFC_SBGI_CODE", NString.class);
			pInfcCtypCode.val = cmd.getParameterValue("@P_INFC_CTYP_CODE", NString.class);
			pSbgiSrceInd.val = cmd.getParameterValue("@P_SBGI_SRCE_IND", NString.class);
			pMajorCode.val = cmd.getParameterValue("@P_MAJOR_CODE", NString.class);
			pAprdTfcPct.val = cmd.getParameterValue("@P_APRD_TFC_PCT", NNumber.class);
			pMaritalCode.val = cmd.getParameterValue("@P_MARITAL_CODE", NString.class);
			pAtypTeleCode.val = cmd.getParameterValue("@P_ATYP_TELE_CODE", NString.class);


		}
		
		public static void pProcessAcg(NString pAidyCode,NString pInfcCode,NNumber pPidm,NString pSequenceNumber,NString pSchoolCode,NString pTransactionNumber,NString pLastUpdateDate,NString pScheduledAwardAmount,NString pAmountPaidToDate,NString pPercentEligibility,NString pAwardAmount,NString pAcademicYearLevel,NString pEligibilityCode,NString pHighSchooolProgramCode,NString pSequenceCode,NString pAwardYear,NString pTotalPercentEligibility) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKED140.P_PROCESS_ACG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQUENCE_NUMBER", pSequenceNumber);
			cmd.addParameter("@P_SCHOOL_CODE", pSchoolCode);
			cmd.addParameter("@P_TRANSACTION_NUMBER", pTransactionNumber);
			cmd.addParameter("@P_LAST_UPDATE_DATE", pLastUpdateDate);
			cmd.addParameter("@P_SCHEDULED_AWARD_AMOUNT", pScheduledAwardAmount);
			cmd.addParameter("@P_AMOUNT_PAID_TO_DATE", pAmountPaidToDate);
			cmd.addParameter("@P_PERCENT_ELIGIBILITY", pPercentEligibility);
			cmd.addParameter("@P_AWARD_AMOUNT", pAwardAmount);
			cmd.addParameter("@P_ACADEMIC_YEAR_LEVEL", pAcademicYearLevel);
			cmd.addParameter("@P_ELIGIBILITY_CODE", pEligibilityCode);
			cmd.addParameter("@P_HIGH_SCHOOOL_PROGRAM_CODE", pHighSchooolProgramCode);
			cmd.addParameter("@P_SEQUENCE_CODE", pSequenceCode);
			cmd.addParameter("@P_AWARD_YEAR", pAwardYear);
			cmd.addParameter("@P_TOTAL_PERCENT_ELIGIBILITY", pTotalPercentEligibility);
				
			cmd.execute();


		}
		
		public static void pProcessLoan(NString pAidyCode,NString pInfcCode,NNumber pPidm,NString pTransactionNumber,NString pSequenceNumber,NString pTypeCode,NString pChangeFlag,NString pProgramCode,NString pNetAmount,NString pCurrentStatusCode,NString pCurrentStatusDate,NString pAggregratePrincipalBalance,NString pPrincipalBalanceDate,NString pBeginDate,NString pEndDate,NString pGuarantyAgencyCode,NString pContactType,NString pSchoolCode,NString pContactCode,NString pGradeLevel,NString pAdditionalUnsubsidizedFlag,NString pCapitalizedInterestFlag,NString pDisbursementAmount,NString pDisbursementDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKED140.P_PROCESS_LOAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRANSACTION_NUMBER", pTransactionNumber);
			cmd.addParameter("@P_SEQUENCE_NUMBER", pSequenceNumber);
			cmd.addParameter("@P_TYPE_CODE", pTypeCode);
			cmd.addParameter("@P_CHANGE_FLAG", pChangeFlag);
			cmd.addParameter("@P_PROGRAM_CODE", pProgramCode);
			cmd.addParameter("@P_NET_AMOUNT", pNetAmount);
			cmd.addParameter("@P_CURRENT_STATUS_CODE", pCurrentStatusCode);
			cmd.addParameter("@P_CURRENT_STATUS_DATE", pCurrentStatusDate);
			cmd.addParameter("@P_AGGREGRATE_PRINCIPAL_BALANCE", pAggregratePrincipalBalance);
			cmd.addParameter("@P_PRINCIPAL_BALANCE_DATE", pPrincipalBalanceDate);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_GUARANTY_AGENCY_CODE", pGuarantyAgencyCode);
			cmd.addParameter("@P_CONTACT_TYPE", pContactType);
			cmd.addParameter("@P_SCHOOL_CODE", pSchoolCode);
			cmd.addParameter("@P_CONTACT_CODE", pContactCode);
			cmd.addParameter("@P_GRADE_LEVEL", pGradeLevel);
			cmd.addParameter("@P_ADDITIONAL_UNSUBSIDIZED_FLAG", pAdditionalUnsubsidizedFlag);
			cmd.addParameter("@P_CAPITALIZED_INTEREST_FLAG", pCapitalizedInterestFlag);
			cmd.addParameter("@P_DISBURSEMENT_AMOUNT", pDisbursementAmount);
			cmd.addParameter("@P_DISBURSEMENT_DATE", pDisbursementDate);
				
			cmd.execute();


		}
		
		public static void pProcessNslds(NString pAidyCode,NString pInfcCode,NNumber pPidm,NString pTransactionNumber,NString pPostscrnReasonCodes,NString pDatabaseResultsFlag,NString pAcgOverpaymentFlag,NString pAcgOverpaymentContact,NString pPellOverpaymentFlag,NString pPellOverpaymentContact,NString pSeogOverpaymentFlag,NString pSeogOverpaymentContact,NString pPerkinsOverpaymentFlag,NString pPerkinsOverpaymentContact,NString pSmartOverpaymentFlag,NString pSmartOverpaymentContact,NString pTeachOverpaymentFlag,NString pTeachOverpaymentContact,NString pIraqServiceOverpayFlag,NString pIraqOverpayContact,NString pDefaultedLoanFlag,NString pDischargedLoanFlag,NString pFraudLoanFlag,NString pLoanSatisfactoryRepayFlag,NString pActiveBankruptcyFlag,NString pTeachLoanConversionFlag,NString pAggrSubLatePrinciple,NString pAggrUnsubLatePrinciple,NString pAggrCombLatePrinciple,NString pAggrUnallocConsLatePrinc,NString pAggrTeachLoanPrincipal,NString pAggrSubPendingDisb,NString pAggrUnsubPendingDisb,NString pAggrCombinedPendingDisb,NString pAggrSubsidizedTotal,NString pAggrUnsubsidizedTotal,NString pAggrCombinedTotal,NString pUnallocConsolidatedTotal,NString pTeachLoanTotal,NString pPerkinsCumulativeDisbAmt,NString pPerkinsCurrYearDisbAmt,NString pAggrTeachDisbAmount,NString pAggrTeachGradDisbAmt,NString pDefaultedLoanChangeFlag,NString pFraudLoanChangeFlag,NString pDischargedLoanChangeFlag,NString pLoanSatRepayChangeFlag,NString pActiveBankruptChangeFlag,NString pTeachLoanConvChangeFlag,NString pOverpaymentsChangeFlag,NString pAggregrateLoanChangeFlag,NString pPerkinsLoanChangeFlag,NString pPellPaymentChangeFlag,NString pAcgPaymentChangeFlag,NString pSmartChangeFlag,NString pTeachChangeFlag,NString pAdditionalPellFlag,NString pAdditionalLoansFlag,NString pAdditionalAcgFlag,NString pAdditionalSmartFlag,NString pAdditionalTeachFlag,NString pDirectLoanPromNoteFlag,NString pDirectLnPlusPromNFlag,NString pDirectLnGplusPromNFlag,NString pUgSubLoanLimitFlag,NString pUgCombLoanLimitFlag,NString pGradSubLoanLimitFlag,NString pGradCombLoanLimitFlag,NString pPellLifetimeLimitFlag,NString pPellLifetimeEligUsed,NString pEnrollmentPatternFlag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKED140.P_PROCESS_NSLDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TRANSACTION_NUMBER", pTransactionNumber);
			cmd.addParameter("@P_POSTSCRN_REASON_CODES", pPostscrnReasonCodes);
			cmd.addParameter("@P_DATABASE_RESULTS_FLAG", pDatabaseResultsFlag);
			cmd.addParameter("@P_ACG_OVERPAYMENT_FLAG", pAcgOverpaymentFlag);
			cmd.addParameter("@P_ACG_OVERPAYMENT_CONTACT", pAcgOverpaymentContact);
			cmd.addParameter("@P_PELL_OVERPAYMENT_FLAG", pPellOverpaymentFlag);
			cmd.addParameter("@P_PELL_OVERPAYMENT_CONTACT", pPellOverpaymentContact);
			cmd.addParameter("@P_SEOG_OVERPAYMENT_FLAG", pSeogOverpaymentFlag);
			cmd.addParameter("@P_SEOG_OVERPAYMENT_CONTACT", pSeogOverpaymentContact);
			cmd.addParameter("@P_PERKINS_OVERPAYMENT_FLAG", pPerkinsOverpaymentFlag);
			cmd.addParameter("@P_PERKINS_OVERPAYMENT_CONTACT", pPerkinsOverpaymentContact);
			cmd.addParameter("@P_SMART_OVERPAYMENT_FLAG", pSmartOverpaymentFlag);
			cmd.addParameter("@P_SMART_OVERPAYMENT_CONTACT", pSmartOverpaymentContact);
			cmd.addParameter("@P_TEACH_OVERPAYMENT_FLAG", pTeachOverpaymentFlag);
			cmd.addParameter("@P_TEACH_OVERPAYMENT_CONTACT", pTeachOverpaymentContact);
			cmd.addParameter("@P_IRAQ_SERVICE_OVERPAY_FLAG", pIraqServiceOverpayFlag);
			cmd.addParameter("@P_IRAQ_OVERPAY_CONTACT", pIraqOverpayContact);
			cmd.addParameter("@P_DEFAULTED_LOAN_FLAG", pDefaultedLoanFlag);
			cmd.addParameter("@P_DISCHARGED_LOAN_FLAG", pDischargedLoanFlag);
			cmd.addParameter("@P_FRAUD_LOAN_FLAG", pFraudLoanFlag);
			cmd.addParameter("@P_LOAN_SATISFACTORY_REPAY_FLAG", pLoanSatisfactoryRepayFlag);
			cmd.addParameter("@P_ACTIVE_BANKRUPTCY_FLAG", pActiveBankruptcyFlag);
			cmd.addParameter("@P_TEACH_LOAN_CONVERSION_FLAG", pTeachLoanConversionFlag);
			cmd.addParameter("@P_AGGR_SUB_LATE_PRINCIPLE", pAggrSubLatePrinciple);
			cmd.addParameter("@P_AGGR_UNSUB_LATE_PRINCIPLE", pAggrUnsubLatePrinciple);
			cmd.addParameter("@P_AGGR_COMB_LATE_PRINCIPLE", pAggrCombLatePrinciple);
			cmd.addParameter("@P_AGGR_UNALLOC_CONS_LATE_PRINC", pAggrUnallocConsLatePrinc);
			cmd.addParameter("@P_AGGR_TEACH_LOAN_PRINCIPAL", pAggrTeachLoanPrincipal);
			cmd.addParameter("@P_AGGR_SUB_PENDING_DISB", pAggrSubPendingDisb);
			cmd.addParameter("@P_AGGR_UNSUB_PENDING_DISB", pAggrUnsubPendingDisb);
			cmd.addParameter("@P_AGGR_COMBINED_PENDING_DISB", pAggrCombinedPendingDisb);
			cmd.addParameter("@P_AGGR_SUBSIDIZED_TOTAL", pAggrSubsidizedTotal);
			cmd.addParameter("@P_AGGR_UNSUBSIDIZED_TOTAL", pAggrUnsubsidizedTotal);
			cmd.addParameter("@P_AGGR_COMBINED_TOTAL", pAggrCombinedTotal);
			cmd.addParameter("@P_UNALLOC__CONSOLIDATED_TOTAL", pUnallocConsolidatedTotal);
			cmd.addParameter("@P_TEACH_LOAN_TOTAL", pTeachLoanTotal);
			cmd.addParameter("@P_PERKINS_CUMULATIVE_DISB_AMT", pPerkinsCumulativeDisbAmt);
			cmd.addParameter("@P_PERKINS_CURR_YEAR_DISB_AMT", pPerkinsCurrYearDisbAmt);
			cmd.addParameter("@P_AGGR_TEACH_DISB_AMOUNT", pAggrTeachDisbAmount);
			cmd.addParameter("@P_AGGR_TEACH_GRAD_DISB_AMT", pAggrTeachGradDisbAmt);
			cmd.addParameter("@P_DEFAULTED_LOAN_CHANGE_FLAG", pDefaultedLoanChangeFlag);
			cmd.addParameter("@P_FRAUD_LOAN_CHANGE_FLAG", pFraudLoanChangeFlag);
			cmd.addParameter("@P_DISCHARGED_LOAN_CHANGE_FLAG", pDischargedLoanChangeFlag);
			cmd.addParameter("@P_LOAN_SAT_REPAY_CHANGE_FLAG", pLoanSatRepayChangeFlag);
			cmd.addParameter("@P_ACTIVE_BANKRUPT_CHANGE_FLAG", pActiveBankruptChangeFlag);
			cmd.addParameter("@P_TEACH_LOAN_CONV_CHANGE_FLAG", pTeachLoanConvChangeFlag);
			cmd.addParameter("@P_OVERPAYMENTS_CHANGE_FLAG", pOverpaymentsChangeFlag);
			cmd.addParameter("@P_AGGREGRATE_LOAN_CHANGE_FLAG", pAggregrateLoanChangeFlag);
			cmd.addParameter("@P_PERKINS_LOAN_CHANGE_FLAG", pPerkinsLoanChangeFlag);
			cmd.addParameter("@P_PELL_PAYMENT_CHANGE_FLAG", pPellPaymentChangeFlag);
			cmd.addParameter("@P_ACG_PAYMENT_CHANGE_FLAG", pAcgPaymentChangeFlag);
			cmd.addParameter("@P_SMART_CHANGE_FLAG", pSmartChangeFlag);
			cmd.addParameter("@P_TEACH_CHANGE_FLAG", pTeachChangeFlag);
			cmd.addParameter("@P_ADDITIONAL_PELL_FLAG", pAdditionalPellFlag);
			cmd.addParameter("@P_ADDITIONAL_LOANS_FLAG", pAdditionalLoansFlag);
			cmd.addParameter("@P_ADDITIONAL_ACG_FLAG", pAdditionalAcgFlag);
			cmd.addParameter("@P_ADDITIONAL_SMART_FLAG", pAdditionalSmartFlag);
			cmd.addParameter("@P_ADDITIONAL_TEACH_FLAG", pAdditionalTeachFlag);
			cmd.addParameter("@P_DIRECT_LOAN_PROM_NOTE_FLAG", pDirectLoanPromNoteFlag);
			cmd.addParameter("@P_DIRECT_LN_PLUS_PROM_N_FLAG", pDirectLnPlusPromNFlag);
			cmd.addParameter("@P_DIRECT_LN_GPLUS_PROM_N_FLAG", pDirectLnGplusPromNFlag);
			cmd.addParameter("@P_UG_SUB_LOAN_LIMIT_FLAG", pUgSubLoanLimitFlag);
			cmd.addParameter("@P_UG_COMB_LOAN_LIMIT_FLAG", pUgCombLoanLimitFlag);
			cmd.addParameter("@P_GRAD_SUB_LOAN_LIMIT_FLAG", pGradSubLoanLimitFlag);
			cmd.addParameter("@P_GRAD_COMB_LOAN_LIMIT_FLAG", pGradCombLoanLimitFlag);
			cmd.addParameter("@P_PELL_LIFETIME_LIMIT_FLAG", pPellLifetimeLimitFlag);
			cmd.addParameter("@P_PELL_LIFETIME_ELIG_USED", pPellLifetimeEligUsed);
			cmd.addParameter("@P_ENROLLMENT_PATTERN_FLAG", pEnrollmentPatternFlag);
				
			cmd.execute();


		}
		
		public static void pProcessPell(NString pAidyCode,NString pInfcCode,NNumber pPidm,NString pSequenceNumber,NString pVerificationFlag,NString pEfc,NString pSchoolCode,NString pTransactionNumber,NString pLastUpdateDate,NString pScheduledAmount,NString pAmountPaidToDate,NString pPercentScheduledAward,NString pAwardAmount,NString pAdditionalEligibilityInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKED140.P_PROCESS_PELL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQUENCE_NUMBER", pSequenceNumber);
			cmd.addParameter("@P_VERIFICATION_FLAG", pVerificationFlag);
			cmd.addParameter("@P_EFC", pEfc);
			cmd.addParameter("@P_SCHOOL_CODE", pSchoolCode);
			cmd.addParameter("@P_TRANSACTION_NUMBER", pTransactionNumber);
			cmd.addParameter("@P_LAST_UPDATE_DATE", pLastUpdateDate);
			cmd.addParameter("@P_SCHEDULED_AMOUNT", pScheduledAmount);
			cmd.addParameter("@P_AMOUNT_PAID_TO_DATE", pAmountPaidToDate);
			cmd.addParameter("@P_PERCENT_SCHEDULED_AWARD", pPercentScheduledAward);
			cmd.addParameter("@P_AWARD_AMOUNT", pAwardAmount);
			cmd.addParameter("@P_ADDITIONAL_ELIGIBILITY_IND", pAdditionalEligibilityInd);
				
			cmd.execute();


		}
		
//		public static void pProcessRecord(NString pAidyCode,NString pInfcCode,NString pGeneratedIdInd,NString pRecalNeedInd,NString pAddrTypeCode,NString pTeleTypeCode,NString pStuEmailType,NString pParEmailType,Ref<NNumber> pPidmOut,NString pInstCurrentTermCode,NString pInstApplDateInd,NString pInstAprdCodeDef,NString pInstFedSchoolCode,NString pInfcSbgiCode,NString pInfcCtypCode,NString pSbgiSrceInd,NString pAddrSeqno,NString pMajorCode,NString pAprdTfcPct,NString pNsldsTransactionNumber,NString pYear,NString pAssignedSsn,NString pOriginalNameId,NString pTransactionNumber,NString pLastName,NString pFirstName,NString pMiddleInitial,NString pStreet,NString pCity,NString pState,NString pZip,NString pDob,NString pPhone,NString pDriverLicence,NString pLicState,NString pEmail,NString pCitizen,NString pAlienNumber,NString pMaritalStatus,NString pMaritalStatusDate,NString pStateOfResidence,NString pResidenceBeforeDate,NString pResidenceDate,NString pMaleOrFemale,NString pSelectiveService,NString pDrugConviction,NString pFatherHighGrade,NString pMotherHighGrade,NString pHighSchoolDiploma,NString pHsName,NString pHsCity,NString pHsState,NString pHsCode,NString pFirstDegree,NString pYearInCollege,NString pDegreeType,NString pFws,NString pTaxReturnDone,NString pTaxType,NString p1040aEligible,NString pAgi,NString pIncomeTax,NString pTaxExemptions,NString pIncomeFromWork,NString pSpouseIncomeFromWork,NString pCashAndSaving,NString pInvestment,NString pBusiness,NString pEducationalCredits,NString pChildSupport,NString pNeedBasedEmployment,NString pGrantAndScholarshipAid,NString pCombatPay,NString pCoOpEarning,NString pPension,NString pIra,NString pChildSupportReceived,NString pInterestIncome,NString pIraDistribution,NString pUntaxedPension,NString pMilitaryAllowances,NString pVeteransBenefits,NString pOtherUntaxedIncome,NString pOtherNonReported,NString pBornBeforeDate,NString pMarried,NString pMasterOrDoctor,NString pActiveDuty,NString pVeteran,NString pHaveChildSupport,NString pLegalDependent,NString pOrphan,NString pEmancipatedMinor,NString pGuardianship,NString pUnaccompaniedYouthSchool,NString pUnaccompaniedYouthHud,NString pHomeless,NString pParentMaritalStatus,NString pParentMaritalStatusDate,NString pFatherSsn,NString pFatherLastName,NString pFatherFirstNameInitial,NString pFatherDob,NString pMotherSsn,NString pMotherLastName,NString pMotherFirstNameInitial,NString pMotherDob,NString pParentEmail,NString pParentStateOfResidence,NString pParentResidenceBeforeDate,NString pParentResidenceDate,NString pParentNumberInFamily,NString pParentNumberInCollege,NString pParentSsi,NString pParentFoodStamp,NString pParentFreeLunch,NString pParentTanf,NString pParentWic,NString pParentTaxReturn,NString pParentTaxType,NString pParent1040aEligible,NString pParentDislocateWorker,NString pParentAgi,NString pParentIncomeTax,NString pParentTaxExemptions,NString pFatherIncomeFromWork,NString pMotherIncomeFromWork,NString pParentCashAndSaving,NString pParentInvestment,NString pParentBusiness,NString pParentEducationalCredits,NString pParentChildSupport,NString pParentNeedBasedEmployment,NString pParentGrantAndScholarAid,NString pParentCombatPay,NString pParentCoOpEarning,NString pParentPension,NString pParentIra,NString pParentChildSuppReceived,NString pParentInterestIncome,NString pParentIraDistribution,NString pParentUntaxedPension,NString pParentMilitaryAllowances,NString pParentVeteransBenefits,NString pParentOtherUntaxedIncome,NString pNumberInFamily,NString pNumberInCollege,NString pSsi,NString pFoodStamp,NString pFreeLunch,NString pTanf,NString pWic,NString pDislocatedWorker,NString pSchoolCode1,NString pHousingPlans1,NString pSchoolCode2,NString pHousingPlans2,NString pSchoolCode3,NString pHousingPlans3,NString pSchoolCode4,NString pHousingPlans4,NString pSchoolCode5,NString pHousingPlans5,NString pSchoolCode6,NString pHousingPlans6,NString pSchoolCode7,NString pHousingPlans7,NString pSchoolCode8,NString pHousingPlans8,NString pSchoolCode9,NString pHousingPlans9,NString pSchoolCode10,NString pHousingPlans10,NString pApplicationCompleteDate,NString pSignedBy,NString pPreparerSsn,NString pPreparerEin,NString pPreparerSign,NString pDependencyOverride,NString pFaaSchoolCode,NString pDependencyStatus,NString pTransactionSource,NString pTransactionReceiptDate,NString pSpecialCircumstancesFlag,NString pIrsRequestFlag,NString pParentIrsRequestFlag,NString pParentAssetThreshold,NString pAssetThreshold,NString pAgiDataFieldFlag,NString pFitDataFieldFlag,NString pParentAgiDataFieldFlag,NString pParentFitDataFieldFlag,NString pAssumptionOverride1,NString pAssumptionOverride2,NString pAssumptionOverride3,NString pAssumptionOverride4,NString pAssumptionOverride5,NString pAssumptionOverride6,NString pEtiDestinationCode,NString pRejectOverride3,NString pRejectOverride12,NString pRejectOverride20,NString pRejectOverrideA,NString pRejectOverrideB,NString pRejectOverrideC,NString pRejectOverrideG,NString pRejectOverrideJ,NString pRejectOverrideK,NString pRejectOverrideN,NString pRejectOverrideW,NString pRejectOverride21,NString pSsn,NString pCorrectionOnTransaction,NString pEfcAdjustment,NString pApplicationDataSource,NString pApplicationReceiptDate,NString pAddressChangeFlag,NString pPushIsirFlag,NString pEfcChangeFlag,NString pSsnChangeFlag,NString pRejectStatusChangeFlag,NString pSarChangeFlag,NString pVerificationChangeFlag,NString pComputerNumber,NString pSourceOfCorrection,NString pDuplicateSsnInd,NString pGraduateFlag,NString pPellEligibilityFlag,NString pTransactionProcessedDate,NString pProcessedRecordType,NString pRejectReasonCodes,NString pReprocessedReasonCode,NString pSarCFlag,NString pAutoZeroEfc,NString pSnt,NString pParentCalculatedTaxStatus,NString pCalculatedTaxStatus,NString pAdditionalFinancialTotal,NString pUntaxedIncomeTotal,NString pParentAddFinancialTot,NString pParentUntaxedIncomeTotal,NString pHsFlag,NString pAssumedCitizenship,NString pAssumedMaritalStatus,NString pAssumedAgi,NString pAssumedTaxPaid,NString pAssumedIncome,NString pAssumedSpouseIncome,NString pAssumedAddFinancialTot,NString pAssumedDobPrior,NString pAssumedMarried,NString pAssumedHaveChild,NString pAssumedDependents,NString pAssumedNumberInFamily,NString pAssumedNumberInCollege,NString pAssumedHomelessSchool,NString pAssumedHomelessHud,NString pAssumedHomeless,NString pAssumedAssetThreshold,NString pAssumedParentMaritalStat,NString pAssumedFatherSsnBlank,NString pAssumedMotherSsnBlank,NString pAssumedParentNumInFamily,NString pAssumedParentNumInColl,NString pAssumedParentAgi,NString pAssumedParentTaxPaid,NString pAssumedFatherIncome,NString pAssumedMotherIncome,NString pAssumedParentSpouseIncome,NString pAssumedParentAssetThresh,NString pPrimaryEfc,NString pSecondaryEfc,NString pSignatureRejectEfc,NString pPrimaryEfcType,NString pSecondaryEfcType,NString pPrimaryAlternateMonth1,NString pPrimaryAlternateMonth2,NString pPrimaryAlternateMonth3,NString pPrimaryAlternateMonth4,NString pPrimaryAlternateMonth5,NString pPrimaryAlternateMonth6,NString pPrimaryAlternateMonth7,NString pPrimaryAlternateMonth8,NString pPrimaryAlternateMonth10,NString pPrimaryAlternateMonth11,NString pPrimaryAlternateMonth12,NString pSecondaryAlternateMonth1,NString pSecondaryAlternateMonth2,NString pSecondaryAlternateMonth3,NString pSecondaryAlternateMonth4,NString pSecondaryAlternateMonth5,NString pSecondaryAlternateMonth6,NString pSecondaryAlternateMonth7,NString pSecondaryAlternateMonth8,NString pSecondaryAlternateMonth10,NString pSecondaryAlternateMonth11,NString pSecondaryAlternateMonth12,NString pTi,NString pAti,NString pStx,NString pEa,NString pIpa,NString pAi,NString pCai,NString pDnw,NString pNw,NString pApa,NString pPca,NString pAai,NString pTsc,NString pTpc,NString pPc,NString pSti,NString pSati,NString pSic,NString pSdnw,NString pSca,NString pFti,NString pSecTi,NString pSecAti,NString pSecStx,NString pSecEa,NString pSecIpa,NString pSecAi,NString pSecCai,NString pSecDnw,NString pSecNw,NString pSecApa,NString pSecPca,NString pSecAai,NString pSecTsc,NString pSecTpc,NString pSecPc,NString pSecSti,NString pSecSati,NString pSecSic,NString pSecSdnw,NString pSecSca,NString pSecFti,NString pCorrectionFlags,NString pHighlightFlags,NString pVerifyFlags,NString pDhsMatchFlag,NString pSecondaryDhsMatchFlag,NString pDhsVerificationNumber,NString pNsldsMatchFlag,NString pNsldsPostscrnReasonCodes,NString pFatherSsnMatchFlag,NString pMotherSsnMatchFlag,NString pSelectiveServiceMatchFlag,NString pSelectiveServiceRegFlag,NString pSsaCitizenFlag,NString pSsnMatchFlag,NString pVaMatchFlag,NString pDodMatchFlag,NString pDodParentDateOfDeath,NString pCommentCodes,NString pSchoolCodeInd,NString pEti,NString pMultiSchoolCodeFlags,NString pVerificationTrackingFlag,NString pSelectedForVerification) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKED140.P_PROCESS_RECORD", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_INFC_CODE", pInfcCode);
//			cmd.addParameter("@P_GENERATED_ID_IND", pGeneratedIdInd);
//			cmd.addParameter("@P_RECAL_NEED_IND", pRecalNeedInd);
//			cmd.addParameter("@P_ADDR_TYPE_CODE", pAddrTypeCode);
//			cmd.addParameter("@P_TELE_TYPE_CODE", pTeleTypeCode);
//			cmd.addParameter("@P_STU_EMAIL_TYPE", pStuEmailType);
//			cmd.addParameter("@P_PAR_EMAIL_TYPE", pParEmailType);
//			cmd.addParameter("@P_PIDM_OUT", NNumber.class);
//			cmd.addParameter("@P_INST_CURRENT_TERM_CODE", pInstCurrentTermCode);
//			cmd.addParameter("@P_INST_APPL_DATE_IND", pInstApplDateInd);
//			cmd.addParameter("@P_INST_APRD_CODE_DEF", pInstAprdCodeDef);
//			cmd.addParameter("@P_INST_FED_SCHOOL_CODE", pInstFedSchoolCode);
//			cmd.addParameter("@P_INFC_SBGI_CODE", pInfcSbgiCode);
//			cmd.addParameter("@P_INFC_CTYP_CODE", pInfcCtypCode);
//			cmd.addParameter("@P_SBGI_SRCE_IND", pSbgiSrceInd);
//			cmd.addParameter("@P_ADDR_SEQNO", pAddrSeqno);
//			cmd.addParameter("@P_MAJOR_CODE", pMajorCode);
//			cmd.addParameter("@P_APRD_TFC_PCT", pAprdTfcPct);
//			cmd.addParameter("@P_NSLDS_TRANSACTION_NUMBER", pNsldsTransactionNumber);
//			cmd.addParameter("@P_YEAR", pYear);
//			cmd.addParameter("@P_ASSIGNED_SSN", pAssignedSsn);
//			cmd.addParameter("@P_ORIGINAL_NAME_ID", pOriginalNameId);
//			cmd.addParameter("@P_TRANSACTION_NUMBER", pTransactionNumber);
//			cmd.addParameter("@P_LAST_NAME", pLastName);
//			cmd.addParameter("@P_FIRST_NAME", pFirstName);
//			cmd.addParameter("@P_MIDDLE_INITIAL", pMiddleInitial);
//			cmd.addParameter("@P_STREET", pStreet);
//			cmd.addParameter("@P_CITY", pCity);
//			cmd.addParameter("@P_STATE", pState);
//			cmd.addParameter("@P_ZIP", pZip);
//			cmd.addParameter("@P_DOB", pDob);
//			cmd.addParameter("@P_PHONE", pPhone);
//			cmd.addParameter("@P_DRIVER_LICENCE", pDriverLicence);
//			cmd.addParameter("@P_LIC_STATE", pLicState);
//			cmd.addParameter("@P_EMAIL", pEmail);
//			cmd.addParameter("@P_CITIZEN", pCitizen);
//			cmd.addParameter("@P_ALIEN_NUMBER", pAlienNumber);
//			cmd.addParameter("@P_MARITAL_STATUS", pMaritalStatus);
//			cmd.addParameter("@P_MARITAL_STATUS_DATE", pMaritalStatusDate);
//			cmd.addParameter("@P_STATE_OF_RESIDENCE", pStateOfResidence);
//			cmd.addParameter("@P_RESIDENCE_BEFORE_DATE", pResidenceBeforeDate);
//			cmd.addParameter("@P_RESIDENCE_DATE", pResidenceDate);
//			cmd.addParameter("@P_MALE_OR_FEMALE", pMaleOrFemale);
//			cmd.addParameter("@P_SELECTIVE_SERVICE", pSelectiveService);
//			cmd.addParameter("@P_DRUG_CONVICTION", pDrugConviction);
//			cmd.addParameter("@P_FATHER_HIGH_GRADE", pFatherHighGrade);
//			cmd.addParameter("@P_MOTHER_HIGH_GRADE", pMotherHighGrade);
//			cmd.addParameter("@P_HIGH_SCHOOL_DIPLOMA", pHighSchoolDiploma);
//			cmd.addParameter("@P_HS_NAME", pHsName);
//			cmd.addParameter("@P_HS_CITY", pHsCity);
//			cmd.addParameter("@P_HS_STATE", pHsState);
//			cmd.addParameter("@P_HS_CODE", pHsCode);
//			cmd.addParameter("@P_FIRST_DEGREE", pFirstDegree);
//			cmd.addParameter("@P_YEAR_IN_COLLEGE", pYearInCollege);
//			cmd.addParameter("@P_DEGREE_TYPE", pDegreeType);
//			cmd.addParameter("@P_FWS", pFws);
//			cmd.addParameter("@P_TAX_RETURN_DONE", pTaxReturnDone);
//			cmd.addParameter("@P_TAX_TYPE", pTaxType);
//			cmd.addParameter("@P_1040A_ELIGIBLE", p1040aEligible);
//			cmd.addParameter("@P_AGI", pAgi);
//			cmd.addParameter("@P_INCOME_TAX", pIncomeTax);
//			cmd.addParameter("@P_TAX_EXEMPTIONS", pTaxExemptions);
//			cmd.addParameter("@P_INCOME_FROM_WORK", pIncomeFromWork);
//			cmd.addParameter("@P_SPOUSE_INCOME_FROM_WORK", pSpouseIncomeFromWork);
//			cmd.addParameter("@P_CASH_AND_SAVING", pCashAndSaving);
//			cmd.addParameter("@P_INVESTMENT", pInvestment);
//			cmd.addParameter("@P_BUSINESS", pBusiness);
//			cmd.addParameter("@P_EDUCATIONAL_CREDITS", pEducationalCredits);
//			cmd.addParameter("@P_CHILD_SUPPORT", pChildSupport);
//			cmd.addParameter("@P_NEED_BASED_EMPLOYMENT", pNeedBasedEmployment);
//			cmd.addParameter("@P_GRANT_AND_SCHOLARSHIP_AID", pGrantAndScholarshipAid);
//			cmd.addParameter("@P_COMBAT_PAY", pCombatPay);
//			cmd.addParameter("@P_CO_OP_EARNING", pCoOpEarning);
//			cmd.addParameter("@P_PENSION", pPension);
//			cmd.addParameter("@P_IRA", pIra);
//			cmd.addParameter("@P_CHILD_SUPPORT_RECEIVED", pChildSupportReceived);
//			cmd.addParameter("@P_INTEREST_INCOME", pInterestIncome);
//			cmd.addParameter("@P_IRA_DISTRIBUTION", pIraDistribution);
//			cmd.addParameter("@P_UNTAXED_PENSION", pUntaxedPension);
//			cmd.addParameter("@P_MILITARY_ALLOWANCES", pMilitaryAllowances);
//			cmd.addParameter("@P_VETERANS_BENEFITS", pVeteransBenefits);
//			cmd.addParameter("@P_OTHER_UNTAXED_INCOME", pOtherUntaxedIncome);
//			cmd.addParameter("@P_OTHER_NON_REPORTED", pOtherNonReported);
//			cmd.addParameter("@P_BORN_BEFORE_DATE", pBornBeforeDate);
//			cmd.addParameter("@P_MARRIED", pMarried);
//			cmd.addParameter("@P_MASTER_OR_DOCTOR", pMasterOrDoctor);
//			cmd.addParameter("@P_ACTIVE_DUTY", pActiveDuty);
//			cmd.addParameter("@P_VETERAN", pVeteran);
//			cmd.addParameter("@P_HAVE_CHILD_SUPPORT", pHaveChildSupport);
//			cmd.addParameter("@P_LEGAL_DEPENDENT", pLegalDependent);
//			cmd.addParameter("@P_ORPHAN", pOrphan);
//			cmd.addParameter("@P_EMANCIPATED_MINOR", pEmancipatedMinor);
//			cmd.addParameter("@P_GUARDIANSHIP", pGuardianship);
//			cmd.addParameter("@P_UNACCOMPANIED_YOUTH_SCHOOL", pUnaccompaniedYouthSchool);
//			cmd.addParameter("@P_UNACCOMPANIED_YOUTH_HUD", pUnaccompaniedYouthHud);
//			cmd.addParameter("@P_HOMELESS", pHomeless);
//			cmd.addParameter("@P_PARENT_MARITAL_STATUS", pParentMaritalStatus);
//			cmd.addParameter("@P_PARENT_MARITAL_STATUS_DATE", pParentMaritalStatusDate);
//			cmd.addParameter("@P_FATHER_SSN", pFatherSsn);
//			cmd.addParameter("@P_FATHER_LAST_NAME", pFatherLastName);
//			cmd.addParameter("@P_FATHER_FIRST_NAME_INITIAL", pFatherFirstNameInitial);
//			cmd.addParameter("@P_FATHER_DOB", pFatherDob);
//			cmd.addParameter("@P_MOTHER_SSN", pMotherSsn);
//			cmd.addParameter("@P_MOTHER_LAST_NAME", pMotherLastName);
//			cmd.addParameter("@P_MOTHER_FIRST_NAME_INITIAL", pMotherFirstNameInitial);
//			cmd.addParameter("@P_MOTHER_DOB", pMotherDob);
//			cmd.addParameter("@P_PARENT_EMAIL", pParentEmail);
//			cmd.addParameter("@P_PARENT_STATE_OF_RESIDENCE", pParentStateOfResidence);
//			cmd.addParameter("@P_PARENT_RESIDENCE_BEFORE_DATE", pParentResidenceBeforeDate);
//			cmd.addParameter("@P_PARENT_RESIDENCE_DATE", pParentResidenceDate);
//			cmd.addParameter("@P_PARENT_NUMBER_IN_FAMILY", pParentNumberInFamily);
//			cmd.addParameter("@P_PARENT_NUMBER_IN_COLLEGE", pParentNumberInCollege);
//			cmd.addParameter("@P_PARENT_SSI", pParentSsi);
//			cmd.addParameter("@P_PARENT_FOOD_STAMP", pParentFoodStamp);
//			cmd.addParameter("@P_PARENT_FREE_LUNCH", pParentFreeLunch);
//			cmd.addParameter("@P_PARENT_TANF", pParentTanf);
//			cmd.addParameter("@P_PARENT_WIC", pParentWic);
//			cmd.addParameter("@P_PARENT_TAX_RETURN", pParentTaxReturn);
//			cmd.addParameter("@P_PARENT_TAX_TYPE", pParentTaxType);
//			cmd.addParameter("@P_PARENT_1040A_ELIGIBLE", pParent1040aEligible);
//			cmd.addParameter("@P_PARENT_DISLOCATE_WORKER", pParentDislocateWorker);
//			cmd.addParameter("@P_PARENT_AGI", pParentAgi);
//			cmd.addParameter("@P_PARENT_INCOME_TAX", pParentIncomeTax);
//			cmd.addParameter("@P_PARENT_TAX_EXEMPTIONS", pParentTaxExemptions);
//			cmd.addParameter("@P_FATHER_INCOME_FROM_WORK", pFatherIncomeFromWork);
//			cmd.addParameter("@P_MOTHER_INCOME_FROM_WORK", pMotherIncomeFromWork);
//			cmd.addParameter("@P_PARENT_CASH_AND_SAVING", pParentCashAndSaving);
//			cmd.addParameter("@P_PARENT_INVESTMENT", pParentInvestment);
//			cmd.addParameter("@P_PARENT_BUSINESS", pParentBusiness);
//			cmd.addParameter("@P_PARENT_EDUCATIONAL_CREDITS", pParentEducationalCredits);
//			cmd.addParameter("@P_PARENT_CHILD_SUPPORT", pParentChildSupport);
//			cmd.addParameter("@P_PARENT_NEED_BASED_EMPLOYMENT", pParentNeedBasedEmployment);
//			cmd.addParameter("@P_PARENT_GRANT_AND_SCHOLAR_AID", pParentGrantAndScholarAid);
//			cmd.addParameter("@P_PARENT_COMBAT_PAY", pParentCombatPay);
//			cmd.addParameter("@P_PARENT_CO_OP_EARNING", pParentCoOpEarning);
//			cmd.addParameter("@P_PARENT_PENSION", pParentPension);
//			cmd.addParameter("@P_PARENT_IRA", pParentIra);
//			cmd.addParameter("@P_PARENT_CHILD_SUPP_RECEIVED", pParentChildSuppReceived);
//			cmd.addParameter("@P_PARENT_INTEREST_INCOME", pParentInterestIncome);
//			cmd.addParameter("@P_PARENT_IRA_DISTRIBUTION", pParentIraDistribution);
//			cmd.addParameter("@P_PARENT_UNTAXED_PENSION", pParentUntaxedPension);
//			cmd.addParameter("@P_PARENT_MILITARY_ALLOWANCES", pParentMilitaryAllowances);
//			cmd.addParameter("@P_PARENT_VETERANS_BENEFITS", pParentVeteransBenefits);
//			cmd.addParameter("@P_PARENT_OTHER_UNTAXED_INCOME", pParentOtherUntaxedIncome);
//			cmd.addParameter("@P_NUMBER_IN_FAMILY", pNumberInFamily);
//			cmd.addParameter("@P_NUMBER_IN_COLLEGE", pNumberInCollege);
//			cmd.addParameter("@P_SSI", pSsi);
//			cmd.addParameter("@P_FOOD_STAMP", pFoodStamp);
//			cmd.addParameter("@P_FREE_LUNCH", pFreeLunch);
//			cmd.addParameter("@P_TANF", pTanf);
//			cmd.addParameter("@P_WIC", pWic);
//			cmd.addParameter("@P_DISLOCATED_WORKER", pDislocatedWorker);
//			cmd.addParameter("@P_SCHOOL_CODE_1", pSchoolCode1);
//			cmd.addParameter("@P_HOUSING_PLANS_1", pHousingPlans1);
//			cmd.addParameter("@P_SCHOOL_CODE_2", pSchoolCode2);
//			cmd.addParameter("@P_HOUSING_PLANS_2", pHousingPlans2);
//			cmd.addParameter("@P_SCHOOL_CODE_3", pSchoolCode3);
//			cmd.addParameter("@P_HOUSING_PLANS_3", pHousingPlans3);
//			cmd.addParameter("@P_SCHOOL_CODE_4", pSchoolCode4);
//			cmd.addParameter("@P_HOUSING_PLANS_4", pHousingPlans4);
//			cmd.addParameter("@P_SCHOOL_CODE_5", pSchoolCode5);
//			cmd.addParameter("@P_HOUSING_PLANS_5", pHousingPlans5);
//			cmd.addParameter("@P_SCHOOL_CODE_6", pSchoolCode6);
//			cmd.addParameter("@P_HOUSING_PLANS_6", pHousingPlans6);
//			cmd.addParameter("@P_SCHOOL_CODE_7", pSchoolCode7);
//			cmd.addParameter("@P_HOUSING_PLANS_7", pHousingPlans7);
//			cmd.addParameter("@P_SCHOOL_CODE_8", pSchoolCode8);
//			cmd.addParameter("@P_HOUSING_PLANS_8", pHousingPlans8);
//			cmd.addParameter("@P_SCHOOL_CODE_9", pSchoolCode9);
//			cmd.addParameter("@P_HOUSING_PLANS_9", pHousingPlans9);
//			cmd.addParameter("@P_SCHOOL_CODE_10", pSchoolCode10);
//			cmd.addParameter("@P_HOUSING_PLANS_10", pHousingPlans10);
//			cmd.addParameter("@P_APPLICATION_COMPLETE_DATE", pApplicationCompleteDate);
//			cmd.addParameter("@P_SIGNED_BY", pSignedBy);
//			cmd.addParameter("@P_PREPARER_SSN", pPreparerSsn);
//			cmd.addParameter("@P_PREPARER_EIN", pPreparerEin);
//			cmd.addParameter("@P_PREPARER_SIGN", pPreparerSign);
//			cmd.addParameter("@P_DEPENDENCY_OVERRIDE", pDependencyOverride);
//			cmd.addParameter("@P_FAA_SCHOOL_CODE", pFaaSchoolCode);
//			cmd.addParameter("@P_DEPENDENCY_STATUS", pDependencyStatus);
//			cmd.addParameter("@P_TRANSACTION_SOURCE", pTransactionSource);
//			cmd.addParameter("@P_TRANSACTION_RECEIPT_DATE", pTransactionReceiptDate);
//			cmd.addParameter("@P_SPECIAL_CIRCUMSTANCES_FLAG", pSpecialCircumstancesFlag);
//			cmd.addParameter("@P_IRS_REQUEST_FLAG", pIrsRequestFlag);
//			cmd.addParameter("@P_PARENT_IRS_REQUEST_FLAG", pParentIrsRequestFlag);
//			cmd.addParameter("@P_PARENT_ASSET_THRESHOLD", pParentAssetThreshold);
//			cmd.addParameter("@P_ASSET_THRESHOLD", pAssetThreshold);
//			cmd.addParameter("@P_AGI_DATA_FIELD_FLAG", pAgiDataFieldFlag);
//			cmd.addParameter("@P_FIT_DATA_FIELD_FLAG", pFitDataFieldFlag);
//			cmd.addParameter("@P_PARENT_AGI_DATA_FIELD_FLAG", pParentAgiDataFieldFlag);
//			cmd.addParameter("@P_PARENT_FIT_DATA_FIELD_FLAG", pParentFitDataFieldFlag);
//			cmd.addParameter("@P_ASSUMPTION_OVERRIDE_1", pAssumptionOverride1);
//			cmd.addParameter("@P_ASSUMPTION_OVERRIDE_2", pAssumptionOverride2);
//			cmd.addParameter("@P_ASSUMPTION_OVERRIDE_3", pAssumptionOverride3);
//			cmd.addParameter("@P_ASSUMPTION_OVERRIDE_4", pAssumptionOverride4);
//			cmd.addParameter("@P_ASSUMPTION_OVERRIDE_5", pAssumptionOverride5);
//			cmd.addParameter("@P_ASSUMPTION_OVERRIDE_6", pAssumptionOverride6);
//			cmd.addParameter("@P_ETI_DESTINATION_CODE", pEtiDestinationCode);
//			cmd.addParameter("@P_REJECT_OVERRIDE_3", pRejectOverride3);
//			cmd.addParameter("@P_REJECT_OVERRIDE_12", pRejectOverride12);
//			cmd.addParameter("@P_REJECT_OVERRIDE_20", pRejectOverride20);
//			cmd.addParameter("@P_REJECT_OVERRIDE_A", pRejectOverrideA);
//			cmd.addParameter("@P_REJECT_OVERRIDE_B", pRejectOverrideB);
//			cmd.addParameter("@P_REJECT_OVERRIDE_C", pRejectOverrideC);
//			cmd.addParameter("@P_REJECT_OVERRIDE_G", pRejectOverrideG);
//			cmd.addParameter("@P_REJECT_OVERRIDE_J", pRejectOverrideJ);
//			cmd.addParameter("@P_REJECT_OVERRIDE_K", pRejectOverrideK);
//			cmd.addParameter("@P_REJECT_OVERRIDE_N", pRejectOverrideN);
//			cmd.addParameter("@P_REJECT_OVERRIDE_W", pRejectOverrideW);
//			cmd.addParameter("@P_REJECT_OVERRIDE_21", pRejectOverride21);
//			cmd.addParameter("@P_SSN", pSsn);
//			cmd.addParameter("@P_CORRECTION_ON_TRANSACTION", pCorrectionOnTransaction);
//			cmd.addParameter("@P_EFC_ADJUSTMENT", pEfcAdjustment);
//			cmd.addParameter("@P_APPLICATION_DATA_SOURCE", pApplicationDataSource);
//			cmd.addParameter("@P_APPLICATION_RECEIPT_DATE", pApplicationReceiptDate);
//			cmd.addParameter("@P_ADDRESS_CHANGE_FLAG", pAddressChangeFlag);
//			cmd.addParameter("@P_PUSH_ISIR_FLAG", pPushIsirFlag);
//			cmd.addParameter("@P_EFC_CHANGE_FLAG", pEfcChangeFlag);
//			cmd.addParameter("@P_SSN_CHANGE_FLAG", pSsnChangeFlag);
//			cmd.addParameter("@P_REJECT_STATUS_CHANGE_FLAG", pRejectStatusChangeFlag);
//			cmd.addParameter("@P_SAR_CHANGE_FLAG", pSarChangeFlag);
//			cmd.addParameter("@P_VERIFICATION_CHANGE_FLAG", pVerificationChangeFlag);
//			cmd.addParameter("@P_COMPUTER_NUMBER", pComputerNumber);
//			cmd.addParameter("@P_SOURCE_OF_CORRECTION", pSourceOfCorrection);
//			cmd.addParameter("@P_DUPLICATE_SSN_IND", pDuplicateSsnInd);
//			cmd.addParameter("@P_GRADUATE_FLAG", pGraduateFlag);
//			cmd.addParameter("@P_PELL_ELIGIBILITY_FLAG", pPellEligibilityFlag);
//			cmd.addParameter("@P_TRANSACTION_PROCESSED_DATE", pTransactionProcessedDate);
//			cmd.addParameter("@P_PROCESSED_RECORD_TYPE", pProcessedRecordType);
//			cmd.addParameter("@P_REJECT_REASON_CODES", pRejectReasonCodes);
//			cmd.addParameter("@P_REPROCESSED_REASON_CODE", pReprocessedReasonCode);
//			cmd.addParameter("@P_SAR_C_FLAG", pSarCFlag);
//			cmd.addParameter("@P_AUTO_ZERO_EFC", pAutoZeroEfc);
//			cmd.addParameter("@P_SNT", pSnt);
//			cmd.addParameter("@P_PARENT_CALCULATED_TAX_STATUS", pParentCalculatedTaxStatus);
//			cmd.addParameter("@P_CALCULATED_TAX_STATUS", pCalculatedTaxStatus);
//			cmd.addParameter("@P_ADDITIONAL_FINANCIAL_TOTAL", pAdditionalFinancialTotal);
//			cmd.addParameter("@P_UNTAXED_INCOME_TOTAL", pUntaxedIncomeTotal);
//			cmd.addParameter("@P_PARENT_ADD_FINANCIAL_TOT", pParentAddFinancialTot);
//			cmd.addParameter("@P_PARENT_UNTAXED_INCOME_TOTAL", pParentUntaxedIncomeTotal);
//			cmd.addParameter("@P_HS_FLAG", pHsFlag);
//			cmd.addParameter("@P_ASSUMED_CITIZENSHIP", pAssumedCitizenship);
//			cmd.addParameter("@P_ASSUMED_MARITAL_STATUS", pAssumedMaritalStatus);
//			cmd.addParameter("@P_ASSUMED_AGI", pAssumedAgi);
//			cmd.addParameter("@P_ASSUMED_TAX_PAID", pAssumedTaxPaid);
//			cmd.addParameter("@P_ASSUMED_INCOME", pAssumedIncome);
//			cmd.addParameter("@P_ASSUMED_SPOUSE_INCOME", pAssumedSpouseIncome);
//			cmd.addParameter("@P_ASSUMED_ADD_FINANCIAL_TOT", pAssumedAddFinancialTot);
//			cmd.addParameter("@P_ASSUMED_DOB_PRIOR", pAssumedDobPrior);
//			cmd.addParameter("@P_ASSUMED_MARRIED", pAssumedMarried);
//			cmd.addParameter("@P_ASSUMED_HAVE_CHILD", pAssumedHaveChild);
//			cmd.addParameter("@P_ASSUMED_DEPENDENTS", pAssumedDependents);
//			cmd.addParameter("@P_ASSUMED_NUMBER_IN_FAMILY", pAssumedNumberInFamily);
//			cmd.addParameter("@P_ASSUMED_NUMBER_IN_COLLEGE", pAssumedNumberInCollege);
//			cmd.addParameter("@P_ASSUMED_HOMELESS_SCHOOL", pAssumedHomelessSchool);
//			cmd.addParameter("@P_ASSUMED_HOMELESS_HUD", pAssumedHomelessHud);
//			cmd.addParameter("@P_ASSUMED_HOMELESS", pAssumedHomeless);
//			cmd.addParameter("@P_ASSUMED_ASSET_THRESHOLD", pAssumedAssetThreshold);
//			cmd.addParameter("@P_ASSUMED_PARENT_MARITAL_STAT", pAssumedParentMaritalStat);
//			cmd.addParameter("@P_ASSUMED_FATHER_SSN_BLANK", pAssumedFatherSsnBlank);
//			cmd.addParameter("@P_ASSUMED_MOTHER_SSN_BLANK", pAssumedMotherSsnBlank);
//			cmd.addParameter("@P_ASSUMED_PARENT_NUM_IN_FAMILY", pAssumedParentNumInFamily);
//			cmd.addParameter("@P_ASSUMED_PARENT_NUM_IN_COLL", pAssumedParentNumInColl);
//			cmd.addParameter("@P_ASSUMED_PARENT_AGI", pAssumedParentAgi);
//			cmd.addParameter("@P_ASSUMED_PARENT_TAX_PAID", pAssumedParentTaxPaid);
//			cmd.addParameter("@P_ASSUMED_FATHER_INCOME", pAssumedFatherIncome);
//			cmd.addParameter("@P_ASSUMED_MOTHER_INCOME", pAssumedMotherIncome);
//			cmd.addParameter("@P_ASSUMED_PARENT_SPOUSE_INCOME", pAssumedParentSpouseIncome);
//			cmd.addParameter("@P_ASSUMED_PARENT_ASSET_THRESH", pAssumedParentAssetThresh);
//			cmd.addParameter("@P_PRIMARY_EFC", pPrimaryEfc);
//			cmd.addParameter("@P_SECONDARY_EFC", pSecondaryEfc);
//			cmd.addParameter("@P_SIGNATURE_REJECT_EFC", pSignatureRejectEfc);
//			cmd.addParameter("@P_PRIMARY_EFC_TYPE", pPrimaryEfcType);
//			cmd.addParameter("@P_SECONDARY_EFC_TYPE", pSecondaryEfcType);
//			cmd.addParameter("@P_PRIMARY_ALTERNATE_MONTH_1", pPrimaryAlternateMonth1);
//			cmd.addParameter("@P_PRIMARY_ALTERNATE_MONTH_2", pPrimaryAlternateMonth2);
//			cmd.addParameter("@P_PRIMARY_ALTERNATE_MONTH_3", pPrimaryAlternateMonth3);
//			cmd.addParameter("@P_PRIMARY_ALTERNATE_MONTH_4", pPrimaryAlternateMonth4);
//			cmd.addParameter("@P_PRIMARY_ALTERNATE_MONTH_5", pPrimaryAlternateMonth5);
//			cmd.addParameter("@P_PRIMARY_ALTERNATE_MONTH_6", pPrimaryAlternateMonth6);
//			cmd.addParameter("@P_PRIMARY_ALTERNATE_MONTH_7", pPrimaryAlternateMonth7);
//			cmd.addParameter("@P_PRIMARY_ALTERNATE_MONTH_8", pPrimaryAlternateMonth8);
//			cmd.addParameter("@P_PRIMARY_ALTERNATE_MONTH_10", pPrimaryAlternateMonth10);
//			cmd.addParameter("@P_PRIMARY_ALTERNATE_MONTH_11", pPrimaryAlternateMonth11);
//			cmd.addParameter("@P_PRIMARY_ALTERNATE_MONTH_12", pPrimaryAlternateMonth12);
//			cmd.addParameter("@P_SECONDARY_ALTERNATE_MONTH_1", pSecondaryAlternateMonth1);
//			cmd.addParameter("@P_SECONDARY_ALTERNATE_MONTH_2", pSecondaryAlternateMonth2);
//			cmd.addParameter("@P_SECONDARY_ALTERNATE_MONTH_3", pSecondaryAlternateMonth3);
//			cmd.addParameter("@P_SECONDARY_ALTERNATE_MONTH_4", pSecondaryAlternateMonth4);
//			cmd.addParameter("@P_SECONDARY_ALTERNATE_MONTH_5", pSecondaryAlternateMonth5);
//			cmd.addParameter("@P_SECONDARY_ALTERNATE_MONTH_6", pSecondaryAlternateMonth6);
//			cmd.addParameter("@P_SECONDARY_ALTERNATE_MONTH_7", pSecondaryAlternateMonth7);
//			cmd.addParameter("@P_SECONDARY_ALTERNATE_MONTH_8", pSecondaryAlternateMonth8);
//			cmd.addParameter("@P_SECONDARY_ALTERNATE_MONTH_10", pSecondaryAlternateMonth10);
//			cmd.addParameter("@P_SECONDARY_ALTERNATE_MONTH_11", pSecondaryAlternateMonth11);
//			cmd.addParameter("@P_SECONDARY_ALTERNATE_MONTH_12", pSecondaryAlternateMonth12);
//			cmd.addParameter("@P_TI", pTi);
//			cmd.addParameter("@P_ATI", pAti);
//			cmd.addParameter("@P_STX", pStx);
//			cmd.addParameter("@P_EA", pEa);
//			cmd.addParameter("@P_IPA", pIpa);
//			cmd.addParameter("@P_AI", pAi);
//			cmd.addParameter("@P_CAI", pCai);
//			cmd.addParameter("@P_DNW", pDnw);
//			cmd.addParameter("@P_NW", pNw);
//			cmd.addParameter("@P_APA", pApa);
//			cmd.addParameter("@P_PCA", pPca);
//			cmd.addParameter("@P_AAI", pAai);
//			cmd.addParameter("@P_TSC", pTsc);
//			cmd.addParameter("@P_TPC", pTpc);
//			cmd.addParameter("@P_PC", pPc);
//			cmd.addParameter("@P_STI", pSti);
//			cmd.addParameter("@P_SATI", pSati);
//			cmd.addParameter("@P_SIC", pSic);
//			cmd.addParameter("@P_SDNW", pSdnw);
//			cmd.addParameter("@P_SCA", pSca);
//			cmd.addParameter("@P_FTI", pFti);
//			cmd.addParameter("@P_SEC_TI", pSecTi);
//			cmd.addParameter("@P_SEC_ATI", pSecAti);
//			cmd.addParameter("@P_SEC_STX", pSecStx);
//			cmd.addParameter("@P_SEC_EA", pSecEa);
//			cmd.addParameter("@P_SEC_IPA", pSecIpa);
//			cmd.addParameter("@P_SEC_AI", pSecAi);
//			cmd.addParameter("@P_SEC_CAI", pSecCai);
//			cmd.addParameter("@P_SEC_DNW", pSecDnw);
//			cmd.addParameter("@P_SEC_NW", pSecNw);
//			cmd.addParameter("@P_SEC_APA", pSecApa);
//			cmd.addParameter("@P_SEC_PCA", pSecPca);
//			cmd.addParameter("@P_SEC_AAI", pSecAai);
//			cmd.addParameter("@P_SEC_TSC", pSecTsc);
//			cmd.addParameter("@P_SEC_TPC", pSecTpc);
//			cmd.addParameter("@P_SEC_PC", pSecPc);
//			cmd.addParameter("@P_SEC_STI", pSecSti);
//			cmd.addParameter("@P_SEC_SATI", pSecSati);
//			cmd.addParameter("@P_SEC_SIC", pSecSic);
//			cmd.addParameter("@P_SEC_SDNW", pSecSdnw);
//			cmd.addParameter("@P_SEC_SCA", pSecSca);
//			cmd.addParameter("@P_SEC_FTI", pSecFti);
//			cmd.addParameter("@P_CORRECTION_FLAGS", pCorrectionFlags);
//			cmd.addParameter("@P_HIGHLIGHT_FLAGS", pHighlightFlags);
//			cmd.addParameter("@P_VERIFY_FLAGS", pVerifyFlags);
//			cmd.addParameter("@P_DHS_MATCH_FLAG", pDhsMatchFlag);
//			cmd.addParameter("@P_SECONDARY_DHS_MATCH_FLAG", pSecondaryDhsMatchFlag);
//			cmd.addParameter("@P_DHS_VERIFICATION_NUMBER", pDhsVerificationNumber);
//			cmd.addParameter("@P_NSLDS_MATCH_FLAG", pNsldsMatchFlag);
//			cmd.addParameter("@P_NSLDS_POSTSCRN_REASON_CODES", pNsldsPostscrnReasonCodes);
//			cmd.addParameter("@P_FATHER_SSN_MATCH_FLAG", pFatherSsnMatchFlag);
//			cmd.addParameter("@P_MOTHER_SSN_MATCH_FLAG", pMotherSsnMatchFlag);
//			cmd.addParameter("@P_SELECTIVE_SERVICE_MATCH_FLAG", pSelectiveServiceMatchFlag);
//			cmd.addParameter("@P_SELECTIVE_SERVICE_REG_FLAG", pSelectiveServiceRegFlag);
//			cmd.addParameter("@P_SSA_CITIZEN_FLAG", pSsaCitizenFlag);
//			cmd.addParameter("@P_SSN_MATCH_FLAG", pSsnMatchFlag);
//			cmd.addParameter("@P_VA_MATCH_FLAG", pVaMatchFlag);
//			cmd.addParameter("@P_DOD_MATCH_FLAG", pDodMatchFlag);
//			cmd.addParameter("@P_DOD_PARENT_DATE_OF_DEATH", pDodParentDateOfDeath);
//			cmd.addParameter("@P_COMMENT_CODES", pCommentCodes);
//			cmd.addParameter("@P_SCHOOL_CODE_IND", pSchoolCodeInd);
//			cmd.addParameter("@P_ETI", pEti);
//			cmd.addParameter("@P_MULTI_SCHOOL_CODE_FLAGS", pMultiSchoolCodeFlags);
//			cmd.addParameter("@P_VERIFICATION_TRACKING_FLAG", pVerificationTrackingFlag);
//			cmd.addParameter("@P_SELECTED_FOR_VERIFICATION", pSelectedForVerification);
//				
//			cmd.execute();
//			pPidmOut.val = cmd.getParameterValue("@P_PIDM_OUT", NNumber.class);
//
//
//		}
		
		public static void pProcessSmart(NString pAidyCode,NString pInfcCode,NNumber pPidm,NString pSequenceNumber,NString pSchoolCode,NString pTransactionNumber,NString pLastUpdateDate,NString pScheduledAwardAmount,NString pAmountPaidToDate,NString pPercentEligibility,NString pAwardAmount,NString pAcademicYearLevel,NString pInstructionalProgramsCode,NString pSequenceCode,NString pAwardYear,NString pTotalPercentEligibility) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKED140.P_PROCESS_SMART", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQUENCE_NUMBER", pSequenceNumber);
			cmd.addParameter("@P_SCHOOL_CODE", pSchoolCode);
			cmd.addParameter("@P_TRANSACTION_NUMBER", pTransactionNumber);
			cmd.addParameter("@P_LAST_UPDATE_DATE", pLastUpdateDate);
			cmd.addParameter("@P_SCHEDULED_AWARD_AMOUNT", pScheduledAwardAmount);
			cmd.addParameter("@P_AMOUNT_PAID_TO_DATE", pAmountPaidToDate);
			cmd.addParameter("@P_PERCENT_ELIGIBILITY", pPercentEligibility);
			cmd.addParameter("@P_AWARD_AMOUNT", pAwardAmount);
			cmd.addParameter("@P_ACADEMIC_YEAR_LEVEL", pAcademicYearLevel);
			cmd.addParameter("@P_INSTRUCTIONAL_PROGRAMS_CODE", pInstructionalProgramsCode);
			cmd.addParameter("@P_SEQUENCE_CODE", pSequenceCode);
			cmd.addParameter("@P_AWARD_YEAR", pAwardYear);
			cmd.addParameter("@P_TOTAL_PERCENT_ELIGIBILITY", pTotalPercentEligibility);
				
			cmd.execute();


		}
		
		public static void pProcessTeach(NString pAidyCode,NString pInfcCode,NNumber pPidm,NString pSequenceNumber,NString pSchoolCode,NString pTransactionNumber,NString pLastUpdateDate,NString pScheduledAwardAmount,NString pAmountPaidToDate,NString pAwardAmount,NString pAcademicYearLevel,NString pSequenceCode,NString pAwardYear,NString pLoanConversionFlag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RCKED140.P_PROCESS_TEACH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_INFC_CODE", pInfcCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQUENCE_NUMBER", pSequenceNumber);
			cmd.addParameter("@P_SCHOOL_CODE", pSchoolCode);
			cmd.addParameter("@P_TRANSACTION_NUMBER", pTransactionNumber);
			cmd.addParameter("@P_LAST_UPDATE_DATE", pLastUpdateDate);
			cmd.addParameter("@P_SCHEDULED_AWARD_AMOUNT", pScheduledAwardAmount);
			cmd.addParameter("@P_AMOUNT_PAID_TO_DATE", pAmountPaidToDate);
			cmd.addParameter("@P_AWARD_AMOUNT", pAwardAmount);
			cmd.addParameter("@P_ACADEMIC_YEAR_LEVEL", pAcademicYearLevel);
			cmd.addParameter("@P_SEQUENCE_CODE", pSequenceCode);
			cmd.addParameter("@P_AWARD_YEAR", pAwardYear);
			cmd.addParameter("@P_LOAN_CONVERSION_FLAG", pLoanConversionFlag);
				
			cmd.execute();


		}
		
	
	
	
}
