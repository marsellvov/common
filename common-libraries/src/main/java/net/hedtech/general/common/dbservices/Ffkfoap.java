package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ffkfoap {
		public static NBool fGetInternAtyp(NString atypCode,NString intAtypCode,NString coasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.F_GET_INTERN_ATYP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@ATYP_CODE", atypCode);
			cmd.addParameter("@INT_ATYP_CODE", intAtypCode);
			cmd.addParameter("@COAS_CODE", coasCode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pEditAcciCode(NString effdateEffDateTime,NString acciCode,NString coasCode,Ref<NString> holdFundCode,Ref<NString> holdOrgnCode,Ref<NString> holdAcctCode,Ref<NString> holdProgCode,Ref<NString> holdActvCode,Ref<NString> holdLocnCode,Ref<NString> fundOverride,Ref<NString> orgnOverride,Ref<NString> acctOverride,Ref<NString> progOverride,Ref<NString> actvOverride,Ref<NString> locnOverride,Ref<NString> mess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_EDIT_ACCI_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFFDATE_EFF_DATE_TIME", effdateEffDateTime);
			cmd.addParameter("@ACCI_CODE", acciCode);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@HOLD_FUND_CODE", holdFundCode, true);
			cmd.addParameter("@HOLD_ORGN_CODE", holdOrgnCode, true);
			cmd.addParameter("@HOLD_ACCT_CODE", holdAcctCode, true);
			cmd.addParameter("@HOLD_PROG_CODE", holdProgCode, true);
			cmd.addParameter("@HOLD_ACTV_CODE", holdActvCode, true);
			cmd.addParameter("@HOLD_LOCN_CODE", holdLocnCode, true);
			cmd.addParameter("@FUND_OVERRIDE", fundOverride, true);
			cmd.addParameter("@ORGN_OVERRIDE", orgnOverride, true);
			cmd.addParameter("@ACCT_OVERRIDE", acctOverride, true);
			cmd.addParameter("@PROG_OVERRIDE", progOverride, true);
			cmd.addParameter("@ACTV_OVERRIDE", actvOverride, true);
			cmd.addParameter("@LOCN_OVERRIDE", locnOverride, true);
			cmd.addParameter("@MESS", mess, true);
				
			cmd.execute();
			holdFundCode.val = cmd.getParameterValue("@HOLD_FUND_CODE", NString.class);
			holdOrgnCode.val = cmd.getParameterValue("@HOLD_ORGN_CODE", NString.class);
			holdAcctCode.val = cmd.getParameterValue("@HOLD_ACCT_CODE", NString.class);
			holdProgCode.val = cmd.getParameterValue("@HOLD_PROG_CODE", NString.class);
			holdActvCode.val = cmd.getParameterValue("@HOLD_ACTV_CODE", NString.class);
			holdLocnCode.val = cmd.getParameterValue("@HOLD_LOCN_CODE", NString.class);
			fundOverride.val = cmd.getParameterValue("@FUND_OVERRIDE", NString.class);
			orgnOverride.val = cmd.getParameterValue("@ORGN_OVERRIDE", NString.class);
			acctOverride.val = cmd.getParameterValue("@ACCT_OVERRIDE", NString.class);
			progOverride.val = cmd.getParameterValue("@PROG_OVERRIDE", NString.class);
			actvOverride.val = cmd.getParameterValue("@ACTV_OVERRIDE", NString.class);
			locnOverride.val = cmd.getParameterValue("@LOCN_OVERRIDE", NString.class);
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
		public static void pEditAcctCode(NString effdateEffDateTime,NString acctCode,NString coasCode,Ref<NString> mess,NString acctTitle,NString intAtypCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_EDIT_ACCT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFFDATE_EFF_DATE_TIME", effdateEffDateTime);
			cmd.addParameter("@ACCT_CODE", acctCode);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@MESS", mess, true);
			cmd.addParameter("@ACCT_TITLE", acctTitle);
			cmd.addParameter("@INT_ATYP_CODE", intAtypCode);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
		public static void pEditActvCode(NString effdateEffDateTime,NString actvCode,NString coasCode,Ref<NString> mess,NString actvTitle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_EDIT_ACTV_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFFDATE_EFF_DATE_TIME", effdateEffDateTime);
			cmd.addParameter("@ACTV_CODE", actvCode);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@MESS", mess, true);
			cmd.addParameter("@ACTV_TITLE", actvTitle);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
		public static void pEditBankCode(NString effdateEffDateTime,NString bankCode,NString coasCode,Ref<NString> mess,NString checkBankNullInd,Ref<NString> acctName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_EDIT_BANK_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFFDATE_EFF_DATE_TIME", effdateEffDateTime);
			cmd.addParameter("@BANK_CODE", bankCode);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@MESS", mess, true);
			cmd.addParameter("@CHECK_BANK_NULL_IND", checkBankNullInd);
			cmd.addParameter("@ACCT_NAME", NString.class);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);
			acctName.val = cmd.getParameterValue("@ACCT_NAME", NString.class);


		}
		
		public static void pEditCoasCode(NString effdateEffDateTime,NString coasCode,Ref<NString> mess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_EDIT_COAS_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFFDATE_EFF_DATE_TIME", effdateEffDateTime);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@MESS", mess, true);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
		public static void pEditFundCode(NString effdateEffDateTime,NString fundCode,NString coasCode,Ref<NString> mess,NString fundTitle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_EDIT_FUND_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFFDATE_EFF_DATE_TIME", effdateEffDateTime);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@MESS", mess, true);
			cmd.addParameter("@FUND_TITLE", fundTitle);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
		public static void pEditLocnCode(NString effdateEffDateTime,NString locnCode,NString coasCode,Ref<NString> mess,NString locnTitle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_EDIT_LOCN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFFDATE_EFF_DATE_TIME", effdateEffDateTime);
			cmd.addParameter("@LOCN_CODE", locnCode);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@MESS", mess, true);
			cmd.addParameter("@LOCN_TITLE", locnTitle);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
		public static void pEditOrgnCode(NString effdateEffDateTime,NString orgnCode,NString coasCode,Ref<NString> mess,NString orgnTitle,NString checkOrgnNullInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_EDIT_ORGN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFFDATE_EFF_DATE_TIME", effdateEffDateTime);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@MESS", mess, true);
			cmd.addParameter("@ORGN_TITLE", orgnTitle);
			cmd.addParameter("@CHECK_ORGN_NULL_IND", checkOrgnNullInd);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
		public static void pEditProgCode(NString effdateEffDateTime,NString progCode,NString coasCode,Ref<NString> mess,NString progTitle,NString checkProgNullInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_EDIT_PROG_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFFDATE_EFF_DATE_TIME", effdateEffDateTime);
			cmd.addParameter("@PROG_CODE", progCode);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@MESS", mess, true);
			cmd.addParameter("@PROG_TITLE", progTitle);
			cmd.addParameter("@CHECK_PROG_NULL_IND", checkProgNullInd);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
		public static void pEditProjCode(NString effdateEffDateTime,NString projCode,NString coasCode,Ref<NString> mess,NString projTitle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_EDIT_PROJ_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFFDATE_EFF_DATE_TIME", effdateEffDateTime);
			cmd.addParameter("@PROJ_CODE", projCode);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@MESS", mess, true);
			cmd.addParameter("@PROJ_TITLE", projTitle);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
		public static void pEditRuclCode(NString effdateEffDateTime,NString ruclCode,NString globalRuclSecInd,NString currentForm,NString currentUser,Ref<NString> mess,Ref<NString> classType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_EDIT_RUCL_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFFDATE_EFF_DATE_TIME", effdateEffDateTime);
			cmd.addParameter("@RUCL_CODE", ruclCode);
			cmd.addParameter("@GLOBAL_RUCL_SEC_IND", globalRuclSecInd);
			cmd.addParameter("@CURRENT_FORM", currentForm);
			cmd.addParameter("@CURRENT_USER", currentUser);
			cmd.addParameter("@MESS", mess, true);
			cmd.addParameter("@CLASS_TYPE", NString.class);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);
			classType.val = cmd.getParameterValue("@CLASS_TYPE", NString.class);


		}
		
		public static void pEditTableEntry(NString code,NString testDataEntryInd,Ref<NString> mess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_EDIT_TABLE_ENTRY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CODE", code);
			cmd.addParameter("@TEST_DATA_ENTRY_IND", testDataEntryInd);
			cmd.addParameter("@MESS", mess, true);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
		public static void pEditTableStatus(NString code,NString testStatusInd,Ref<NString> mess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_EDIT_TABLE_STATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CODE", code);
			cmd.addParameter("@TEST_STATUS_IND", testStatusInd);
			cmd.addParameter("@MESS", mess, true);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
		public static void pGetDefaultFoapal(NString chartCode,NDate transDate,NString acciCode,Ref<NString> fundCode,Ref<NString> orgnCode,Ref<NString> acctCode,Ref<NString> progCode,Ref<NString> actvCode,Ref<NString> locnCode,NString errPrefixReqd,NString defaultIfNull,NString stopAtAcci,Ref<NString> errorMesg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_GET_DEFAULT_FOAPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CHART_CODE", chartCode);
			cmd.addParameter("@TRANS_DATE", transDate);
			cmd.addParameter("@ACCI_CODE", acciCode);
			cmd.addParameter("@FUND_CODE", fundCode, true);
			cmd.addParameter("@ORGN_CODE", orgnCode, true);
			cmd.addParameter("@ACCT_CODE", acctCode, true);
			cmd.addParameter("@PROG_CODE", progCode, true);
			cmd.addParameter("@ACTV_CODE", actvCode, true);
			cmd.addParameter("@LOCN_CODE", locnCode, true);
			cmd.addParameter("@ERR_PREFIX_REQD", errPrefixReqd);
			cmd.addParameter("@DEFAULT_IF_NULL", defaultIfNull);
			cmd.addParameter("@STOP_AT_ACCI", stopAtAcci);
			cmd.addParameter("@ERROR_MESG", NString.class);
				
			cmd.execute();
			fundCode.val = cmd.getParameterValue("@FUND_CODE", NString.class);
			orgnCode.val = cmd.getParameterValue("@ORGN_CODE", NString.class);
			acctCode.val = cmd.getParameterValue("@ACCT_CODE", NString.class);
			progCode.val = cmd.getParameterValue("@PROG_CODE", NString.class);
			actvCode.val = cmd.getParameterValue("@ACTV_CODE", NString.class);
			locnCode.val = cmd.getParameterValue("@LOCN_CODE", NString.class);
			errorMesg.val = cmd.getParameterValue("@ERROR_MESG", NString.class);


		}
		
		public static void pValidateAcci(NDate transdate,NString coas,NString acci,Ref<NString> holdFund,Ref<NString> holdOrgn,Ref<NString> holdAcct,Ref<NString> holdProg,Ref<NString> holdActv,Ref<NString> holdLocn,Ref<NString> mess,NString errPrefixReqd,NString defaultIfNull) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_VALIDATE_ACCI", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSDATE", transdate);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@ACCI", acci);
			cmd.addParameter("@HOLD_FUND", holdFund, true);
			cmd.addParameter("@HOLD_ORGN", holdOrgn, true);
			cmd.addParameter("@HOLD_ACCT", holdAcct, true);
			cmd.addParameter("@HOLD_PROG", holdProg, true);
			cmd.addParameter("@HOLD_ACTV", holdActv, true);
			cmd.addParameter("@HOLD_LOCN", holdLocn, true);
			cmd.addParameter("@MESS", mess, true);
			cmd.addParameter("@ERR_PREFIX_REQD", errPrefixReqd);
			cmd.addParameter("@DEFAULT_IF_NULL", defaultIfNull);
				
			cmd.execute();
			holdFund.val = cmd.getParameterValue("@HOLD_FUND", NString.class);
			holdOrgn.val = cmd.getParameterValue("@HOLD_ORGN", NString.class);
			holdAcct.val = cmd.getParameterValue("@HOLD_ACCT", NString.class);
			holdProg.val = cmd.getParameterValue("@HOLD_PROG", NString.class);
			holdActv.val = cmd.getParameterValue("@HOLD_ACTV", NString.class);
			holdLocn.val = cmd.getParameterValue("@HOLD_LOCN", NString.class);
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
		public static void pValidateAccounting(NString pCoasIn,NString pAcciIn,Ref<NString> pFundInout,Ref<NString> pOrgnInout,Ref<NString> pAcctInout,Ref<NString> pProgInout,Ref<NString> pActvInout,Ref<NString> pLocnInout,NDate pTransdateIn,NString pRuclCodeIn,NString pRuclTypeIn,NString pCurrFormIn,NString pUserIdIn,NString pAddErrPrefix,NString pDefaultIfNull,Ref<NString> pValidIndOut,Ref<NString> pErrMessageOut,NString pJvInd,NString pCheckUserAuth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_VALIDATE_ACCOUNTING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_IN", pCoasIn);
			cmd.addParameter("@P_ACCI_IN", pAcciIn);
			cmd.addParameter("@P_FUND_INOUT", pFundInout, true);
			cmd.addParameter("@P_ORGN_INOUT", pOrgnInout, true);
			cmd.addParameter("@P_ACCT_INOUT", pAcctInout, true);
			cmd.addParameter("@P_PROG_INOUT", pProgInout, true);
			cmd.addParameter("@P_ACTV_INOUT", pActvInout, true);
			cmd.addParameter("@P_LOCN_INOUT", pLocnInout, true);
			cmd.addParameter("@P_TRANSDATE_IN", pTransdateIn);
			cmd.addParameter("@P_RUCL_CODE_IN", pRuclCodeIn);
			cmd.addParameter("@P_RUCL_TYPE_IN", pRuclTypeIn);
			cmd.addParameter("@P_CURR_FORM_IN", pCurrFormIn);
			cmd.addParameter("@P_USER_ID_IN", pUserIdIn);
			cmd.addParameter("@P_ADD_ERR_PREFIX", pAddErrPrefix);
			cmd.addParameter("@P_DEFAULT_IF_NULL", pDefaultIfNull);
			cmd.addParameter("@P_VALID_IND_OUT", NString.class);
			cmd.addParameter("@P_ERR_MESSAGE_OUT", NString.class);
			cmd.addParameter("@P_JV_IND", pJvInd);
			cmd.addParameter("@P_CHECK_USER_AUTH", pCheckUserAuth);
				
			cmd.execute();
			pFundInout.val = cmd.getParameterValue("@P_FUND_INOUT", NString.class);
			pOrgnInout.val = cmd.getParameterValue("@P_ORGN_INOUT", NString.class);
			pAcctInout.val = cmd.getParameterValue("@P_ACCT_INOUT", NString.class);
			pProgInout.val = cmd.getParameterValue("@P_PROG_INOUT", NString.class);
			pActvInout.val = cmd.getParameterValue("@P_ACTV_INOUT", NString.class);
			pLocnInout.val = cmd.getParameterValue("@P_LOCN_INOUT", NString.class);
			pValidIndOut.val = cmd.getParameterValue("@P_VALID_IND_OUT", NString.class);
			pErrMessageOut.val = cmd.getParameterValue("@P_ERR_MESSAGE_OUT", NString.class);


		}
		
		public static void pValidateAcct(NDate transdate,NString coas,NString acct,Ref<NString> mess,NString checkStatus,NString checkDataentry) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_VALIDATE_ACCT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSDATE", transdate);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@ACCT", acct);
			cmd.addParameter("@MESS", mess, true);
			cmd.addParameter("@CHECK_STATUS", checkStatus);
			cmd.addParameter("@CHECK_DATAENTRY", checkDataentry);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
		public static void pValidateActv(NDate transdate,NString coas,NString actv,Ref<NString> mess,NString checkStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_VALIDATE_ACTV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSDATE", transdate);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@ACTV", actv);
			cmd.addParameter("@MESS", mess, true);
			cmd.addParameter("@CHECK_STATUS", checkStatus);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
		public static void pValidateCoas(NDate transdate,NString coas,Ref<NString> mess,NString checkStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_VALIDATE_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSDATE", transdate);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@MESS", mess, true);
			cmd.addParameter("@CHECK_STATUS", checkStatus);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
		public static void pValidateFoapal(NString coas,NString acci,Ref<NString> fund,Ref<NString> orgn,Ref<NString> acct,Ref<NString> prog,Ref<NString> actv,Ref<NString> locn,NDate transdate,Ref<NString> validInd,Ref<NString> message,NString errPrefixReqd,NString defaultIfNull,NString jvInd,NString userId,NString checkUserAuth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_VALIDATE_FOAPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@ACCI", acci);
			cmd.addParameter("@FUND", fund, true);
			cmd.addParameter("@ORGN", orgn, true);
			cmd.addParameter("@ACCT", acct, true);
			cmd.addParameter("@PROG", prog, true);
			cmd.addParameter("@ACTV", actv, true);
			cmd.addParameter("@LOCN", locn, true);
			cmd.addParameter("@TRANSDATE", transdate);
			cmd.addParameter("@VALID_IND", validInd, true);
			cmd.addParameter("@MESSAGE", message, true);
			cmd.addParameter("@ERR_PREFIX_REQD", errPrefixReqd);
			cmd.addParameter("@DEFAULT_IF_NULL", defaultIfNull);
			cmd.addParameter("@JV_IND", jvInd);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@CHECK_USER_AUTH", checkUserAuth);
				
			cmd.execute();
			fund.val = cmd.getParameterValue("@FUND", NString.class);
			orgn.val = cmd.getParameterValue("@ORGN", NString.class);
			acct.val = cmd.getParameterValue("@ACCT", NString.class);
			prog.val = cmd.getParameterValue("@PROG", NString.class);
			actv.val = cmd.getParameterValue("@ACTV", NString.class);
			locn.val = cmd.getParameterValue("@LOCN", NString.class);
			validInd.val = cmd.getParameterValue("@VALID_IND", NString.class);
			message.val = cmd.getParameterValue("@MESSAGE", NString.class);


		}
		
		public static void pValidateFund(NDate transdate,NString coas,NString fund,Ref<NString> mess,NString checkStatus,NString checkDataentry,NString userId,NString checkUserAuth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_VALIDATE_FUND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSDATE", transdate);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@MESS", mess, true);
			cmd.addParameter("@CHECK_STATUS", checkStatus);
			cmd.addParameter("@CHECK_DATAENTRY", checkDataentry);
			cmd.addParameter("@USER_ID", userId);
			cmd.addParameter("@CHECK_USER_AUTH", checkUserAuth);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
		public static void pValidateLocn(NDate transdate,NString coas,NString locn,Ref<NString> mess,NString checkStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_VALIDATE_LOCN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSDATE", transdate);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@LOCN", locn);
			cmd.addParameter("@MESS", mess, true);
			cmd.addParameter("@CHECK_STATUS", checkStatus);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
		public static void pValidateOrgn(NDate transdate,NString coas,NString orgn,Ref<NString> mess,NString checkStatus,NString checkDataentry) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_VALIDATE_ORGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSDATE", transdate);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@MESS", mess, true);
			cmd.addParameter("@CHECK_STATUS", checkStatus);
			cmd.addParameter("@CHECK_DATAENTRY", checkDataentry);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
		public static void pValidateProg(NDate transdate,NString coas,NString prog,Ref<NString> mess,NString checkStatus,NString checkDataentry) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKFOAP.P_VALIDATE_PROG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSDATE", transdate);
			cmd.addParameter("@COAS", coas);
			cmd.addParameter("@PROG", prog);
			cmd.addParameter("@MESS", mess, true);
			cmd.addParameter("@CHECK_STATUS", checkStatus);
			cmd.addParameter("@CHECK_DATAENTRY", checkDataentry);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);


		}
		
	
	
	
}
