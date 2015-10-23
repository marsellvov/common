package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ftfkfoap {
		public static NString fFundOrgSecurityFnc(NString coasCode,NString fundCode,NString orgCode,NDate asofDate,NString queryOrPost,NString whichUserId,NString whichAccess,NString bypassSecurity) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKFOAP.F_FUND_ORG_SECURITY_FNC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@ORG_CODE", orgCode);
			cmd.addParameter("@ASOF_DATE", asofDate);
			cmd.addParameter("@QUERY_OR_POST", queryOrPost);
			cmd.addParameter("@WHICH_USER_ID", whichUserId);
			cmd.addParameter("@WHICH_ACCESS", whichAccess);
			cmd.addParameter("@BYPASS_SECURITY", bypassSecurity);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetAcciTitle(NString pCoasCode,NString pAcciCode,NDate pAsofDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKFOAP.F_GET_ACCI_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_ASOF_DATE", pAsofDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetAcctTitle(NString pCoasCode,NString pAcctCode,NDate pAsofDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKFOAP.F_GET_ACCT_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_ASOF_DATE", pAsofDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetActvTitle(NString pCoasCode,NString pActvCode,NDate pAsofDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKFOAP.F_GET_ACTV_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_ASOF_DATE", pAsofDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetBankTitle(NString pBankCode,NDate pAsofDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKFOAP.F_GET_BANK_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_BANK_CODE", pBankCode);
			cmd.addParameter("@P_ASOF_DATE", pAsofDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetCoasTitle(NString pCoasCode,NDate pAsofDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKFOAP.F_GET_COAS_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ASOF_DATE", pAsofDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetFundTitle(NString pCoasCode,NString pFundCode,NDate pAsofDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKFOAP.F_GET_FUND_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ASOF_DATE", pAsofDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetLocnTitle(NString pCoasCode,NString pLocnCode,NDate pAsofDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKFOAP.F_GET_LOCN_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_ASOF_DATE", pAsofDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetOrgnTitle(NString pCoasCode,NString pOrgnCode,NDate pAsofDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKFOAP.F_GET_ORGN_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ASOF_DATE", pAsofDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetProgTitle(NString pCoasCode,NString pProgCode,NDate pAsofDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKFOAP.F_GET_PROG_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ASOF_DATE", pAsofDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetProjTitle(NString pProjCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKFOAP.F_GET_PROJ_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetFoapalTitles(NString pCoasCode,NDate pTransdate,NString pAcciCodeIn,NString pFundCodeIn,NString pOrgnCodeIn,NString pAcctCodeIn,NString pProgCodeIn,NString pActvCodeIn,NString pLocnCodeIn,NString pProjCodeIn,Ref<NString> pCoasTitleOut,Ref<NString> pAcciTitleOut,Ref<NString> pFundTitleOut,Ref<NString> pOrgnTitleOut,Ref<NString> pAcctTitleOut,Ref<NString> pProgTitleOut,Ref<NString> pActvTitleOut,Ref<NString> pLocnTitleOut,Ref<NString> pProjDescOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKFOAP.P_GET_FOAPAL_TITLES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_TRANSDATE", pTransdate);
			cmd.addParameter("@P_ACCI_CODE_IN", pAcciCodeIn);
			cmd.addParameter("@P_FUND_CODE_IN", pFundCodeIn);
			cmd.addParameter("@P_ORGN_CODE_IN", pOrgnCodeIn);
			cmd.addParameter("@P_ACCT_CODE_IN", pAcctCodeIn);
			cmd.addParameter("@P_PROG_CODE_IN", pProgCodeIn);
			cmd.addParameter("@P_ACTV_CODE_IN", pActvCodeIn);
			cmd.addParameter("@P_LOCN_CODE_IN", pLocnCodeIn);
			cmd.addParameter("@P_PROJ_CODE_IN", pProjCodeIn);
			cmd.addParameter("@P_COAS_TITLE_OUT", NString.class);
			cmd.addParameter("@P_ACCI_TITLE_OUT", NString.class);
			cmd.addParameter("@P_FUND_TITLE_OUT", NString.class);
			cmd.addParameter("@P_ORGN_TITLE_OUT", NString.class);
			cmd.addParameter("@P_ACCT_TITLE_OUT", NString.class);
			cmd.addParameter("@P_PROG_TITLE_OUT", NString.class);
			cmd.addParameter("@P_ACTV_TITLE_OUT", NString.class);
			cmd.addParameter("@P_LOCN_TITLE_OUT", NString.class);
			cmd.addParameter("@P_PROJ_DESC_OUT", NString.class);
				
			cmd.execute();
			pCoasTitleOut.val = cmd.getParameterValue("@P_COAS_TITLE_OUT", NString.class);
			pAcciTitleOut.val = cmd.getParameterValue("@P_ACCI_TITLE_OUT", NString.class);
			pFundTitleOut.val = cmd.getParameterValue("@P_FUND_TITLE_OUT", NString.class);
			pOrgnTitleOut.val = cmd.getParameterValue("@P_ORGN_TITLE_OUT", NString.class);
			pAcctTitleOut.val = cmd.getParameterValue("@P_ACCT_TITLE_OUT", NString.class);
			pProgTitleOut.val = cmd.getParameterValue("@P_PROG_TITLE_OUT", NString.class);
			pActvTitleOut.val = cmd.getParameterValue("@P_ACTV_TITLE_OUT", NString.class);
			pLocnTitleOut.val = cmd.getParameterValue("@P_LOCN_TITLE_OUT", NString.class);
			pProjDescOut.val = cmd.getParameterValue("@P_PROJ_DESC_OUT", NString.class);


		}
		
		public static void pValidateAcciCode(NDate pTransdate,NString pAcciCode,NString pCoasCode,Ref<NString> pFundCodeInOut,Ref<NString> pOrgnCodeInOut,Ref<NString> pAcctCodeInOut,Ref<NString> pProgCodeInOut,Ref<NString> pActvCodeInOut,Ref<NString> pLocnCodeInOut,Ref<NString> pFundOverrideOut,Ref<NString> pOrgnOverrideOut,Ref<NString> pAcctOverrideOut,Ref<NString> pProgOverrideOut,Ref<NString> pActvOverrideOut,Ref<NString> pLocnOverrideOut,Ref<NString> pMessageInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKFOAP.P_VALIDATE_ACCI_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANSDATE", pTransdate);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FUND_CODE_IN_OUT", pFundCodeInOut, true);
			cmd.addParameter("@P_ORGN_CODE_IN_OUT", pOrgnCodeInOut, true);
			cmd.addParameter("@P_ACCT_CODE_IN_OUT", pAcctCodeInOut, true);
			cmd.addParameter("@P_PROG_CODE_IN_OUT", pProgCodeInOut, true);
			cmd.addParameter("@P_ACTV_CODE_IN_OUT", pActvCodeInOut, true);
			cmd.addParameter("@P_LOCN_CODE_IN_OUT", pLocnCodeInOut, true);
			cmd.addParameter("@P_FUND_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_ORGN_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_ACCT_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_PROG_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_ACTV_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_LOCN_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_MESSAGE_IN_OUT", pMessageInOut, true);
				
			cmd.execute();
			pFundCodeInOut.val = cmd.getParameterValue("@P_FUND_CODE_IN_OUT", NString.class);
			pOrgnCodeInOut.val = cmd.getParameterValue("@P_ORGN_CODE_IN_OUT", NString.class);
			pAcctCodeInOut.val = cmd.getParameterValue("@P_ACCT_CODE_IN_OUT", NString.class);
			pProgCodeInOut.val = cmd.getParameterValue("@P_PROG_CODE_IN_OUT", NString.class);
			pActvCodeInOut.val = cmd.getParameterValue("@P_ACTV_CODE_IN_OUT", NString.class);
			pLocnCodeInOut.val = cmd.getParameterValue("@P_LOCN_CODE_IN_OUT", NString.class);
			pFundOverrideOut.val = cmd.getParameterValue("@P_FUND_OVERRIDE_OUT", NString.class);
			pOrgnOverrideOut.val = cmd.getParameterValue("@P_ORGN_OVERRIDE_OUT", NString.class);
			pAcctOverrideOut.val = cmd.getParameterValue("@P_ACCT_OVERRIDE_OUT", NString.class);
			pProgOverrideOut.val = cmd.getParameterValue("@P_PROG_OVERRIDE_OUT", NString.class);
			pActvOverrideOut.val = cmd.getParameterValue("@P_ACTV_OVERRIDE_OUT", NString.class);
			pLocnOverrideOut.val = cmd.getParameterValue("@P_LOCN_OVERRIDE_OUT", NString.class);
			pMessageInOut.val = cmd.getParameterValue("@P_MESSAGE_IN_OUT", NString.class);


		}
		
		public static void pValidateAdrlFoap(NString pCoasCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pClearingFundCode,NString pClearingAcctCode,Ref<NString> pValidIndOut,Ref<NString> pMessageOut,Ref<NString> pCoasTitleOut,Ref<NString> pFundTitleOut,Ref<NString> pOrgnTitleOut,Ref<NString> pAcctTitleOut,Ref<NString> pProgTitleOut,Ref<NString> pActvTitleOut,Ref<NString> pLocnTitleOut,Ref<NString> pClearingFundTitleOut,Ref<NString> pClearingAcctTitleOut,Ref<NString> pBankNameOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKFOAP.P_VALIDATE_ADRL_FOAP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_CLEARING_FUND_CODE", pClearingFundCode);
			cmd.addParameter("@P_CLEARING_ACCT_CODE", pClearingAcctCode);
			cmd.addParameter("@P_VALID_IND_OUT", NString.class);
			cmd.addParameter("@P_MESSAGE_OUT", NString.class);
			cmd.addParameter("@P_COAS_TITLE_OUT", NString.class);
			cmd.addParameter("@P_FUND_TITLE_OUT", NString.class);
			cmd.addParameter("@P_ORGN_TITLE_OUT", NString.class);
			cmd.addParameter("@P_ACCT_TITLE_OUT", NString.class);
			cmd.addParameter("@P_PROG_TITLE_OUT", NString.class);
			cmd.addParameter("@P_ACTV_TITLE_OUT", NString.class);
			cmd.addParameter("@P_LOCN_TITLE_OUT", NString.class);
			cmd.addParameter("@P_CLEARING_FUND_TITLE_OUT", NString.class);
			cmd.addParameter("@P_CLEARING_ACCT_TITLE_OUT", NString.class);
			cmd.addParameter("@P_BANK_NAME_OUT", NString.class);
				
			cmd.execute();
			pValidIndOut.val = cmd.getParameterValue("@P_VALID_IND_OUT", NString.class);
			pMessageOut.val = cmd.getParameterValue("@P_MESSAGE_OUT", NString.class);
			pCoasTitleOut.val = cmd.getParameterValue("@P_COAS_TITLE_OUT", NString.class);
			pFundTitleOut.val = cmd.getParameterValue("@P_FUND_TITLE_OUT", NString.class);
			pOrgnTitleOut.val = cmd.getParameterValue("@P_ORGN_TITLE_OUT", NString.class);
			pAcctTitleOut.val = cmd.getParameterValue("@P_ACCT_TITLE_OUT", NString.class);
			pProgTitleOut.val = cmd.getParameterValue("@P_PROG_TITLE_OUT", NString.class);
			pActvTitleOut.val = cmd.getParameterValue("@P_ACTV_TITLE_OUT", NString.class);
			pLocnTitleOut.val = cmd.getParameterValue("@P_LOCN_TITLE_OUT", NString.class);
			pClearingFundTitleOut.val = cmd.getParameterValue("@P_CLEARING_FUND_TITLE_OUT", NString.class);
			pClearingAcctTitleOut.val = cmd.getParameterValue("@P_CLEARING_ACCT_TITLE_OUT", NString.class);
			pBankNameOut.val = cmd.getParameterValue("@P_BANK_NAME_OUT", NString.class);


		}
		
		public static void pValidateFunding(NString pCoasCode,NString pAcciCode,Ref<NString> pFundCodeInout,Ref<NString> pOrgnCodeInout,Ref<NString> pAcctCodeInout,Ref<NString> pProgCodeInout,Ref<NString> pActvCodeInout,Ref<NString> pLocnCodeInout,NString pProjCode,Ref<NString> pBankCodeInout,NString pDefaultBank,NString pPayCurrCode,NString pPayByWireInd,NDate pTransdate,NString pErrPrefixReqd,NString pDefaultIfNull,NString pJvInd,NString pUserId,NString pCheckUserAuth,NString pFundingExpense,NString pBypassFundOrgSec,Ref<NString> pValidIndOut,Ref<NString> pMessageOut,Ref<NString> pCoasTitleOut,Ref<NString> pAcciTitleOut,Ref<NString> pFundTitleOut,Ref<NString> pOrgnTitleOut,Ref<NString> pAcctTitleOut,Ref<NString> pProgTitleOut,Ref<NString> pActvTitleOut,Ref<NString> pLocnTitleOut,Ref<NString> pProjDescOut,Ref<NString> pBankNameOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKFOAP.P_VALIDATE_FUNDING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE_INOUT", pFundCodeInout, true);
			cmd.addParameter("@P_ORGN_CODE_INOUT", pOrgnCodeInout, true);
			cmd.addParameter("@P_ACCT_CODE_INOUT", pAcctCodeInout, true);
			cmd.addParameter("@P_PROG_CODE_INOUT", pProgCodeInout, true);
			cmd.addParameter("@P_ACTV_CODE_INOUT", pActvCodeInout, true);
			cmd.addParameter("@P_LOCN_CODE_INOUT", pLocnCodeInout, true);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_BANK_CODE_INOUT", pBankCodeInout, true);
			cmd.addParameter("@P_DEFAULT_BANK", pDefaultBank);
			cmd.addParameter("@P_PAY_CURR_CODE", pPayCurrCode);
			cmd.addParameter("@P_PAY_BY_WIRE_IND", pPayByWireInd);
			cmd.addParameter("@P_TRANSDATE", pTransdate);
			cmd.addParameter("@P_ERR_PREFIX_REQD", pErrPrefixReqd);
			cmd.addParameter("@P_DEFAULT_IF_NULL", pDefaultIfNull);
			cmd.addParameter("@P_JV_IND", pJvInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CHECK_USER_AUTH", pCheckUserAuth);
			cmd.addParameter("@P_FUNDING_EXPENSE", pFundingExpense);
			cmd.addParameter("@P_BYPASS_FUND_ORG_SEC", pBypassFundOrgSec);
			cmd.addParameter("@P_VALID_IND_OUT", NString.class);
			cmd.addParameter("@P_MESSAGE_OUT", NString.class);
			cmd.addParameter("@P_COAS_TITLE_OUT", NString.class);
			cmd.addParameter("@P_ACCI_TITLE_OUT", NString.class);
			cmd.addParameter("@P_FUND_TITLE_OUT", NString.class);
			cmd.addParameter("@P_ORGN_TITLE_OUT", NString.class);
			cmd.addParameter("@P_ACCT_TITLE_OUT", NString.class);
			cmd.addParameter("@P_PROG_TITLE_OUT", NString.class);
			cmd.addParameter("@P_ACTV_TITLE_OUT", NString.class);
			cmd.addParameter("@P_LOCN_TITLE_OUT", NString.class);
			cmd.addParameter("@P_PROJ_DESC_OUT", NString.class);
			cmd.addParameter("@P_BANK_NAME_OUT", NString.class);
				
			cmd.execute();
			pFundCodeInout.val = cmd.getParameterValue("@P_FUND_CODE_INOUT", NString.class);
			pOrgnCodeInout.val = cmd.getParameterValue("@P_ORGN_CODE_INOUT", NString.class);
			pAcctCodeInout.val = cmd.getParameterValue("@P_ACCT_CODE_INOUT", NString.class);
			pProgCodeInout.val = cmd.getParameterValue("@P_PROG_CODE_INOUT", NString.class);
			pActvCodeInout.val = cmd.getParameterValue("@P_ACTV_CODE_INOUT", NString.class);
			pLocnCodeInout.val = cmd.getParameterValue("@P_LOCN_CODE_INOUT", NString.class);
			pBankCodeInout.val = cmd.getParameterValue("@P_BANK_CODE_INOUT", NString.class);
			pValidIndOut.val = cmd.getParameterValue("@P_VALID_IND_OUT", NString.class);
			pMessageOut.val = cmd.getParameterValue("@P_MESSAGE_OUT", NString.class);
			pCoasTitleOut.val = cmd.getParameterValue("@P_COAS_TITLE_OUT", NString.class);
			pAcciTitleOut.val = cmd.getParameterValue("@P_ACCI_TITLE_OUT", NString.class);
			pFundTitleOut.val = cmd.getParameterValue("@P_FUND_TITLE_OUT", NString.class);
			pOrgnTitleOut.val = cmd.getParameterValue("@P_ORGN_TITLE_OUT", NString.class);
			pAcctTitleOut.val = cmd.getParameterValue("@P_ACCT_TITLE_OUT", NString.class);
			pProgTitleOut.val = cmd.getParameterValue("@P_PROG_TITLE_OUT", NString.class);
			pActvTitleOut.val = cmd.getParameterValue("@P_ACTV_TITLE_OUT", NString.class);
			pLocnTitleOut.val = cmd.getParameterValue("@P_LOCN_TITLE_OUT", NString.class);
			pProjDescOut.val = cmd.getParameterValue("@P_PROJ_DESC_OUT", NString.class);
			pBankNameOut.val = cmd.getParameterValue("@P_BANK_NAME_OUT", NString.class);


		}
		
		public static void pValidateProj(NDate pTransdate,NString pCoasCode,NString pProjCode,Ref<NString> pMessageInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FTFKFOAP.P_VALIDATE_PROJ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TRANSDATE", pTransdate);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_MESSAGE_IN_OUT", pMessageInOut, true);
				
			cmd.execute();
			pMessageInOut.val = cmd.getParameterValue("@P_MESSAGE_IN_OUT", NString.class);


		}
		
	
	
	
}
