package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fvktric {
		public static NString fBuildSelect(NString pCoas,NDate pDatefrom,NString pAgencyIds,NString pPiids,NString pGrantOption,NString pGrantFrom,NString pGrantTo,NString pExcludeGrants,NString pSpecificGrants,NString pGrantWildCards) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.F_BUILD_SELECT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_DATEFROM", pDatefrom);
			cmd.addParameter("@P_AGENCY_IDS", pAgencyIds);
			cmd.addParameter("@P_PIIDS", pPiids);
			cmd.addParameter("@P_GRANT_OPTION", pGrantOption);
			cmd.addParameter("@P_GRANT_FROM", pGrantFrom);
			cmd.addParameter("@P_GRANT_TO", pGrantTo);
			cmd.addParameter("@P_EXCLUDE_GRANTS", pExcludeGrants);
			cmd.addParameter("@P_SPECIFIC_GRANTS", pSpecificGrants);
			cmd.addParameter("@P_GRANT_WILD_CARDS", pGrantWildCards);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBuildform300xml(NNumber pGrantAgency,NString pStmtType,NNumber pPrinInv,NDate pYearEnd,NString pUnivAcct) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.F_BUILDFORM300XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_GRANT_AGENCY", pGrantAgency);
			cmd.addParameter("@P_STMT_TYPE", pStmtType);
			cmd.addParameter("@P_PRIN_INV", pPrinInv);
			cmd.addParameter("@P_YEAR_END", pYearEnd);
			cmd.addParameter("@P_UNIV_ACCT", pUnivAcct);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGenToken(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.F_GEN_TOKEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fGetPidmfrmtoken(NString pKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.F_GET_PIDMFRMTOKEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_KEY", pKey);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetToken(NString pKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.F_GET_TOKEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_KEY", pKey);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetUrl(NString pString) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.F_GET_URL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING", pString);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetexpendituredescription(NNumber pAgencypidm,NString pLinenumber,NDate pValidon,Ref<NString> pOmitind) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.F_GETEXPENDITUREDESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AGENCYPIDM", pAgencypidm);
			cmd.addParameter("@P_LINENUMBER", pLinenumber);
			cmd.addParameter("@P_VALIDON", pValidon);
			cmd.addParameter("@P_OMITIND", NString.class);
				
			cmd.execute();
			pOmitind.val = cmd.getParameterValue("@P_OMITIND", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetexpendituredescription(NNumber pAgencypidm,NString pLinenumber,NDate pValidon) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.F_GETEXPENDITUREDESCRIPTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AGENCYPIDM", pAgencypidm);
			cmd.addParameter("@P_LINENUMBER", pLinenumber);
			cmd.addParameter("@P_VALIDON", pValidon);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetomitind(NNumber pAgencypidm,NString pAcctCode,NDate pValidon) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.F_GETOMITIND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AGENCYPIDM", pAgencypidm);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_VALIDON", pValidon);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSelNetworkCode(NNumber pBoxInd,NNumber pGrant,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.F_SEL_NETWORK_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BOX_IND", pBoxInd);
			cmd.addParameter("@P_GRANT", pGrant);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fValidateTimestamp(NString pKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.F_VALIDATE_TIMESTAMP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_KEY", pKey);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAddSubBalfwrd(NString pSponsorAcctCodeKey,NNumber pYtdwork) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.P_ADD_SUB_BALFWRD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SPONSOR_ACCT_CODE_KEY", pSponsorAcctCodeKey);
			cmd.addParameter("@P_YTDWORK", pYtdwork);
				
			cmd.execute();


		}
		
		public static void pAddlineEncumberAmts(NString pSponsorAcctCodeKey,NNumber pYtdwork,NNumber pEncwork) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.P_ADDLINE_ENCUMBER_AMTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SPONSOR_ACCT_CODE_KEY", pSponsorAcctCodeKey);
			cmd.addParameter("@P_YTDWORK", pYtdwork);
			cmd.addParameter("@P_ENCWORK", pEncwork);
				
			cmd.execute();


		}
		
		public static void pFindGrantYear(Ref<NDate> pDateFrom,Ref<NDate> pDateTo,NString pProjectStartDate,NDate hDateFrom,NDate hDateTo,Ref<NString> pGrntYr,Ref<NString> pGrntYr2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.P_FIND_GRANT_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DATE_FROM", pDateFrom, true);
			cmd.addParameter("@P_DATE_TO", pDateTo, true);
			cmd.addParameter("@P_PROJECT_START_DATE", pProjectStartDate);
			cmd.addParameter("@H_DATE_FROM", hDateFrom);
			cmd.addParameter("@H_DATE_TO", hDateTo);
			cmd.addParameter("@P_GRNT_YR", NString.class);
			cmd.addParameter("@P_GRNT_YR2", NString.class);
				
			cmd.execute();
			pDateFrom.val = cmd.getParameterValue("@P_DATE_FROM", NDate.class);
			pDateTo.val = cmd.getParameterValue("@P_DATE_TO", NDate.class);
			pGrntYr.val = cmd.getParameterValue("@P_GRNT_YR", NString.class);
			pGrntYr2.val = cmd.getParameterValue("@P_GRNT_YR2", NString.class);


		}
		
		public static void pFindGrantYear2(NDate pDateFrom,NDate pDateTo,NString pProjectStartDate,NString pFrbgrntCode,Ref<NString> pGrntYr,Ref<NString> pGrntYr2,Ref<NString> pYtdperiod,Ref<NString> pYtdperiod2,Ref<NString> pTrialIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.P_FIND_GRANT_YEAR2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DATE_FROM", pDateFrom);
			cmd.addParameter("@P_DATE_TO", pDateTo);
			cmd.addParameter("@P_PROJECT_START_DATE", pProjectStartDate);
			cmd.addParameter("@P_FRBGRNT_CODE", pFrbgrntCode);
			cmd.addParameter("@P_GRNT_YR", NString.class);
			cmd.addParameter("@P_GRNT_YR2", NString.class);
			cmd.addParameter("@P_YTDPERIOD", NString.class);
			cmd.addParameter("@P_YTDPERIOD2", NString.class);
			cmd.addParameter("@P_TRIAL_IN", NString.class);
				
			cmd.execute();
			pGrntYr.val = cmd.getParameterValue("@P_GRNT_YR", NString.class);
			pGrntYr2.val = cmd.getParameterValue("@P_GRNT_YR2", NString.class);
			pYtdperiod.val = cmd.getParameterValue("@P_YTDPERIOD", NString.class);
			pYtdperiod2.val = cmd.getParameterValue("@P_YTDPERIOD2", NString.class);
			pTrialIn.val = cmd.getParameterValue("@P_TRIAL_IN", NString.class);


		}
		
		public static void pGetAdditionalInfo(NString pFrbgrntSponsorId,NNumber pFrbgrntAgencyPidm,NString pPrioryearmethod,NString pSummarizegrant,NString pFiscalYear,NString pCoas,NString pFrbgrntCode,NString pBalfwdGrntYr,NString pBalfwdGrntYr2,NString pFrrgrnlFundCode,NNumber pFrbgrntPiPidm,Ref<NNumber> pFvvagcyBoxInd,Ref<NString> pFvvagcyTitle,Ref<NNumber> pFvbxpinPinNo,Ref<NString> pPiName,Ref<NString> pPiNameFlat,Ref<NString> pErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.P_GET_ADDITIONAL_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FRBGRNT_SPONSOR_ID", pFrbgrntSponsorId);
			cmd.addParameter("@P_FRBGRNT_AGENCY_PIDM", pFrbgrntAgencyPidm);
			cmd.addParameter("@P_PRIORYEARMETHOD", pPrioryearmethod);
			cmd.addParameter("@P_SUMMARIZEGRANT", pSummarizegrant);
			cmd.addParameter("@P_FISCAL_YEAR", pFiscalYear);
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_FRBGRNT_CODE", pFrbgrntCode);
			cmd.addParameter("@P_BALFWD_GRNT_YR", pBalfwdGrntYr);
			cmd.addParameter("@P_BALFWD_GRNT_YR2", pBalfwdGrntYr2);
			cmd.addParameter("@P_FRRGRNL_FUND_CODE", pFrrgrnlFundCode);
			cmd.addParameter("@P_FRBGRNT_PI_PIDM", pFrbgrntPiPidm);
			cmd.addParameter("@P_FVVAGCY_BOX_IND", NNumber.class);
			cmd.addParameter("@P_FVVAGCY_TITLE", NString.class);
			cmd.addParameter("@P_FVBXPIN_PIN_NO", NNumber.class);
			cmd.addParameter("@P_PI_NAME", NString.class);
			cmd.addParameter("@P_PI_NAME_FLAT", NString.class);
			cmd.addParameter("@P_ERROR_MSG", NString.class);
				
			cmd.execute();
			pFvvagcyBoxInd.val = cmd.getParameterValue("@P_FVVAGCY_BOX_IND", NNumber.class);
			pFvvagcyTitle.val = cmd.getParameterValue("@P_FVVAGCY_TITLE", NString.class);
			pFvbxpinPinNo.val = cmd.getParameterValue("@P_FVBXPIN_PIN_NO", NNumber.class);
			pPiName.val = cmd.getParameterValue("@P_PI_NAME", NString.class);
			pPiNameFlat.val = cmd.getParameterValue("@P_PI_NAME_FLAT", NString.class);
			pErrorMsg.val = cmd.getParameterValue("@P_ERROR_MSG", NString.class);


		}
		
		public static void pGetForm300Data(Ref<NDate> pDateFrom,Ref<NDate> pDateTo,NDate hDateFrom,Ref<NDate> hDateTo,Ref<NNumber> pFundCount,NString pProjectStartDate,NString pFrbgrntCode,NString pCoas,NNumber pFrbgrntAgencyPidm,NString pPrioryearmethod,NString pSummarizegrant,NString pFiscalYear,NString pFrbgrntSponsorId,NString pFrrgrnlFundCode,NNumber pFrbgrntPiPidm,Ref<NNumber> pFvvagcyBoxInd,Ref<NString> pFvvagcyTitle,Ref<NNumber> pFvbxpinPinNo,Ref<NString> pPiName,Ref<NString> pPiNameFlat,Ref<NString> pErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.P_GET_FORM300_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DATE_FROM", pDateFrom, true);
			cmd.addParameter("@P_DATE_TO", pDateTo, true);
			cmd.addParameter("@H_DATE_FROM", hDateFrom);
			cmd.addParameter("@H_DATE_TO", hDateTo, true);
			cmd.addParameter("@P_FUND_COUNT", pFundCount, true);
			cmd.addParameter("@P_PROJECT_START_DATE", pProjectStartDate);
			cmd.addParameter("@P_FRBGRNT_CODE", pFrbgrntCode);
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_FRBGRNT_AGENCY_PIDM", pFrbgrntAgencyPidm);
			cmd.addParameter("@P_PRIORYEARMETHOD", pPrioryearmethod);
			cmd.addParameter("@P_SUMMARIZEGRANT", pSummarizegrant);
			cmd.addParameter("@P_FISCAL_YEAR", pFiscalYear);
			cmd.addParameter("@P_FRBGRNT_SPONSOR_ID", pFrbgrntSponsorId);
			cmd.addParameter("@P_FRRGRNL_FUND_CODE", pFrrgrnlFundCode);
			cmd.addParameter("@P_FRBGRNT_PI_PIDM", pFrbgrntPiPidm);
			cmd.addParameter("@P_FVVAGCY_BOX_IND", NNumber.class);
			cmd.addParameter("@P_FVVAGCY_TITLE", NString.class);
			cmd.addParameter("@P_FVBXPIN_PIN_NO", NNumber.class);
			cmd.addParameter("@P_PI_NAME", NString.class);
			cmd.addParameter("@P_PI_NAME_FLAT", NString.class);
			cmd.addParameter("@P_ERROR_MSG", NString.class);
				
			cmd.execute();
			pDateFrom.val = cmd.getParameterValue("@P_DATE_FROM", NDate.class);
			pDateTo.val = cmd.getParameterValue("@P_DATE_TO", NDate.class);
			hDateTo.val = cmd.getParameterValue("@H_DATE_TO", NDate.class);
			pFundCount.val = cmd.getParameterValue("@P_FUND_COUNT", NNumber.class);
			pFvvagcyBoxInd.val = cmd.getParameterValue("@P_FVVAGCY_BOX_IND", NNumber.class);
			pFvvagcyTitle.val = cmd.getParameterValue("@P_FVVAGCY_TITLE", NString.class);
			pFvbxpinPinNo.val = cmd.getParameterValue("@P_FVBXPIN_PIN_NO", NNumber.class);
			pPiName.val = cmd.getParameterValue("@P_PI_NAME", NString.class);
			pPiNameFlat.val = cmd.getParameterValue("@P_PI_NAME_FLAT", NString.class);
			pErrorMsg.val = cmd.getParameterValue("@P_ERROR_MSG", NString.class);


		}
		
		public static void pInsertForm300Data(NNumber pGrantingAgency,NString pStmtType,NNumber pPid,NDate pYearEnd,NString pUniversityAcct,NString pGrantId,NString pFamilyName,NString pGivenName,NString pInitials,NNumber pPin,NString pPrintType,NDate pDateFrom,Ref<NString> pErr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.P_INSERT_FORM300_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GRANTING_AGENCY", pGrantingAgency);
			cmd.addParameter("@P_STMT_TYPE", pStmtType);
			cmd.addParameter("@P_PID", pPid);
			cmd.addParameter("@P_YEAR_END", pYearEnd);
			cmd.addParameter("@P_UNIVERSITY_ACCT", pUniversityAcct);
			cmd.addParameter("@P_GRANT_ID", pGrantId);
			cmd.addParameter("@P_FAMILY_NAME", pFamilyName);
			cmd.addParameter("@P_GIVEN_NAME", pGivenName);
			cmd.addParameter("@P_INITIALS", pInitials);
			cmd.addParameter("@P_PIN", pPin);
			cmd.addParameter("@P_PRINT_TYPE", pPrintType);
			cmd.addParameter("@P_DATE_FROM", pDateFrom);
			cmd.addParameter("@P_ERR", NString.class);
				
			cmd.execute();
			pErr.val = cmd.getParameterValue("@P_ERR", NString.class);


		}
		
		public static void pRecalcData(NNumber pGrantingAgency,NString pStmtType,NNumber pPid,NDate pYearEnd,NString pFundCode,NString pGrantId,NString pSumgrantInd,NString pTricData,NString pThirdpartyInd,NString pBannerInd,Ref<NString> pErr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.P_RECALC_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GRANTING_AGENCY", pGrantingAgency);
			cmd.addParameter("@P_STMT_TYPE", pStmtType);
			cmd.addParameter("@P_PID", pPid);
			cmd.addParameter("@P_YEAR_END", pYearEnd);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_GRANT_ID", pGrantId);
			cmd.addParameter("@P_SUMGRANT_IND", pSumgrantInd);
			cmd.addParameter("@P_TRIC_DATA", pTricData);
			cmd.addParameter("@P_THIRDPARTY_IND", pThirdpartyInd);
			cmd.addParameter("@P_BANNER_IND", pBannerInd);
			cmd.addParameter("@P_ERR", NString.class);
				
			cmd.execute();
			pErr.val = cmd.getParameterValue("@P_ERR", NString.class);


		}
		
		public static void pResetVars() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.P_RESET_VARS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pSubbaladdEncumberAmts(NString pSponsorAcctCodeKey,NNumber pYtdwork,NNumber pEncwork) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.P_SUBBALADD_ENCUMBER_AMTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SPONSOR_ACCT_CODE_KEY", pSponsorAcctCodeKey);
			cmd.addParameter("@P_YTDWORK", pYtdwork);
			cmd.addParameter("@P_ENCWORK", pEncwork);
				
			cmd.execute();


		}
		
		public static void pSumPeriods(NNumber pAgencyPidm,NString pCoas,NString pAcctCodeKey,NDate pDateTo,Ref<NString> pSponsorAcctCodeKey) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FVKTRIC.P_SUM_PERIODS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AGENCY_PIDM", pAgencyPidm);
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_ACCT_CODE_KEY", pAcctCodeKey);
			cmd.addParameter("@P_DATE_TO", pDateTo);
			cmd.addParameter("@P_SPONSOR_ACCT_CODE_KEY", NString.class);
				
			cmd.execute();
			pSponsorAcctCodeKey.val = cmd.getParameterValue("@P_SPONSOR_ACCT_CODE_KEY", NString.class);


		}
		
	
	
	
}
