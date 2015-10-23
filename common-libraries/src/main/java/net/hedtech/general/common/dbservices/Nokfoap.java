package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokfoap {
		public static NString fFoapalDesc(NString pFoapalType,NString pCoasCode,NString pFoapalCode,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.F_FOAPAL_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FOAPAL_TYPE", pFoapalType);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FOAPAL_CODE", pFoapalCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fString(NString pStringName,NString pValue01) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.F_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STRING_NAME", pStringName);
			cmd.addParameter("@P_VALUE_01", pValue01);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pEditFoapal(NString fieldName,NString value,NString coasCode,NString effectiveDate,NString exeSource,NString parDataEntryInd,Ref<NString> parTitle,Ref<NString> msg,Ref<NString> msgType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_EDIT_FOAPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FIELD_NAME", fieldName);
			cmd.addParameter("@VALUE", value);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@EFFECTIVE_DATE", effectiveDate);
			cmd.addParameter("@EXE_SOURCE", exeSource);
			cmd.addParameter("@PAR_DATA_ENTRY_IND", parDataEntryInd);
			cmd.addParameter("@PAR_TITLE", parTitle, true);
			cmd.addParameter("@MSG", NString.class);
			cmd.addParameter("@MSG_TYPE", NString.class);
				
			cmd.execute();
			parTitle.val = cmd.getParameterValue("@PAR_TITLE", NString.class);
			msg.val = cmd.getParameterValue("@MSG", NString.class);
			msgType.val = cmd.getParameterValue("@MSG_TYPE", NString.class);


		}
		
		public static void pEditFoapalCode(NString pFoapalType,NString pFieldTitle,NString pCoasCode,NString pFoapalCode,NDate pEffDate,NString pDataEntryInd,Ref<NString> pDescOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_EDIT_FOAPAL_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FOAPAL_TYPE", pFoapalType);
			cmd.addParameter("@P_FIELD_TITLE", pFieldTitle);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FOAPAL_CODE", pFoapalCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_DATA_ENTRY_IND", pDataEntryInd);
			cmd.addParameter("@P_DESC_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pDescOut.val = cmd.getParameterValue("@P_DESC_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pOpenAcciDefaultRc(Ref<DataCursor> pAcciRc,NString pCoas,NString pAcci,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_OPEN_ACCI_DEFAULT_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ACCI_RC", DataCursor.class);
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_ACCI", pAcci);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();
			pAcciRc.val = cmd.getParameterValue("@P_ACCI_RC", DataCursor.class);


		}
		
		public static void pOpenAcciRc(Ref<DataCursor> pAcciRc,NDate pEffectiveDate,NString pSrch,NString pCoas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_OPEN_ACCI_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ACCI_RC", DataCursor.class);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_SRCH", pSrch);
			cmd.addParameter("@P_COAS", pCoas);
				
			cmd.execute();
			pAcciRc.val = cmd.getParameterValue("@P_ACCI_RC", DataCursor.class);


		}
		
		public static void pOpenAcctRc(Ref<DataCursor> pAcctRc,NDate pEffectiveDate,NString pSrch,NString pCoas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_OPEN_ACCT_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ACCT_RC", DataCursor.class);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_SRCH", pSrch);
			cmd.addParameter("@P_COAS", pCoas);
				
			cmd.execute();
			pAcctRc.val = cmd.getParameterValue("@P_ACCT_RC", DataCursor.class);


		}
		
		public static void pOpenActvRc(Ref<DataCursor> pActvRc,NDate pEffectiveDate,NString pSrch,NString pCoas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_OPEN_ACTV_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ACTV_RC", DataCursor.class);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_SRCH", pSrch);
			cmd.addParameter("@P_COAS", pCoas);
				
			cmd.execute();
			pActvRc.val = cmd.getParameterValue("@P_ACTV_RC", DataCursor.class);


		}
		
		public static void pOpenAtypRc(Ref<DataCursor> pAtypRc,NDate pEffectiveDate,NString pSrch,NString pCoas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_OPEN_ATYP_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ATYP_RC", DataCursor.class);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_SRCH", pSrch);
			cmd.addParameter("@P_COAS", pCoas);
				
			cmd.execute();
			pAtypRc.val = cmd.getParameterValue("@P_ATYP_RC", DataCursor.class);


		}
		
		public static void pOpenCoasRc(Ref<DataCursor> pCoasRc,NDate pEffectiveDate,NString pSrch) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_OPEN_COAS_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_RC", DataCursor.class);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_SRCH", pSrch);
				
			cmd.execute();
			pCoasRc.val = cmd.getParameterValue("@P_COAS_RC", DataCursor.class);


		}
		
		public static void pOpenCtypRc(Ref<DataCursor> pCtypRc,NString pSrch) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_OPEN_CTYP_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CTYP_RC", DataCursor.class);
			cmd.addParameter("@P_SRCH", pSrch);
				
			cmd.execute();
			pCtypRc.val = cmd.getParameterValue("@P_CTYP_RC", DataCursor.class);


		}
		
		public static void pOpenFundRc(Ref<DataCursor> pFundRc,NDate pEffectiveDate,NString pSrch,NString pCoas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_OPEN_FUND_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FUND_RC", DataCursor.class);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_SRCH", pSrch);
			cmd.addParameter("@P_COAS", pCoas);
				
			cmd.execute();
			pFundRc.val = cmd.getParameterValue("@P_FUND_RC", DataCursor.class);


		}
		
		public static void pOpenLocnRc(Ref<DataCursor> pLocnRc,NDate pEffectiveDate,NString pSrch,NString pCoas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_OPEN_LOCN_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LOCN_RC", DataCursor.class);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_SRCH", pSrch);
			cmd.addParameter("@P_COAS", pCoas);
				
			cmd.execute();
			pLocnRc.val = cmd.getParameterValue("@P_LOCN_RC", DataCursor.class);


		}
		
		public static void pOpenOrgnRc(Ref<DataCursor> pOrgnRc,NDate pEffectiveDate,NString pSrch,NString pCoas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_OPEN_ORGN_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ORGN_RC", DataCursor.class);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_SRCH", pSrch);
			cmd.addParameter("@P_COAS", pCoas);
				
			cmd.execute();
			pOrgnRc.val = cmd.getParameterValue("@P_ORGN_RC", DataCursor.class);


		}
		
		public static void pOpenProgRc(Ref<DataCursor> pProgRc,NDate pEffectiveDate,NString pSrch,NString pCoas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_OPEN_PROG_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROG_RC", DataCursor.class);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_SRCH", pSrch);
			cmd.addParameter("@P_COAS", pCoas);
				
			cmd.execute();
			pProgRc.val = cmd.getParameterValue("@P_PROG_RC", DataCursor.class);


		}
		
		public static void pOpenProjRc(Ref<DataCursor> pProjRc,NDate pEffectiveDate,NString pSrch,NString pCoas) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_OPEN_PROJ_RC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROJ_RC", DataCursor.class);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_SRCH", pSrch);
			cmd.addParameter("@P_COAS", pCoas);
				
			cmd.execute();
			pProjRc.val = cmd.getParameterValue("@P_PROJ_RC", DataCursor.class);


		}
		
		public static void pValidateAcciCode(NDate pEffdateTime,NString pAcciCode,NString pCoasCode,Ref<NString> pHoldFundCodeInout,Ref<NString> pHoldOrgnCodeInout,Ref<NString> pHoldAcctCodeInout,Ref<NString> pHoldProgCodeInout,Ref<NString> pHoldActvCodeInout,Ref<NString> pHoldLocnCodeInout,Ref<NString> pFundOverrideOut,Ref<NString> pOrgnOverrideOut,Ref<NString> pAcctOverrideOut,Ref<NString> pProgOverrideOut,Ref<NString> pActvOverrideOut,Ref<NString> pLocnOverrideOut,Ref<NString> pErrMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_VALIDATE_ACCI_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_HOLD_FUND_CODE_INOUT", pHoldFundCodeInout, true);
			cmd.addParameter("@P_HOLD_ORGN_CODE_INOUT", pHoldOrgnCodeInout, true);
			cmd.addParameter("@P_HOLD_ACCT_CODE_INOUT", pHoldAcctCodeInout, true);
			cmd.addParameter("@P_HOLD_PROG_CODE_INOUT", pHoldProgCodeInout, true);
			cmd.addParameter("@P_HOLD_ACTV_CODE_INOUT", pHoldActvCodeInout, true);
			cmd.addParameter("@P_HOLD_LOCN_CODE_INOUT", pHoldLocnCodeInout, true);
			cmd.addParameter("@P_FUND_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_ORGN_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_ACCT_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_PROG_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_ACTV_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_LOCN_OVERRIDE_OUT", NString.class);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
				
			cmd.execute();
			pHoldFundCodeInout.val = cmd.getParameterValue("@P_HOLD_FUND_CODE_INOUT", NString.class);
			pHoldOrgnCodeInout.val = cmd.getParameterValue("@P_HOLD_ORGN_CODE_INOUT", NString.class);
			pHoldAcctCodeInout.val = cmd.getParameterValue("@P_HOLD_ACCT_CODE_INOUT", NString.class);
			pHoldProgCodeInout.val = cmd.getParameterValue("@P_HOLD_PROG_CODE_INOUT", NString.class);
			pHoldActvCodeInout.val = cmd.getParameterValue("@P_HOLD_ACTV_CODE_INOUT", NString.class);
			pHoldLocnCodeInout.val = cmd.getParameterValue("@P_HOLD_LOCN_CODE_INOUT", NString.class);
			pFundOverrideOut.val = cmd.getParameterValue("@P_FUND_OVERRIDE_OUT", NString.class);
			pOrgnOverrideOut.val = cmd.getParameterValue("@P_ORGN_OVERRIDE_OUT", NString.class);
			pAcctOverrideOut.val = cmd.getParameterValue("@P_ACCT_OVERRIDE_OUT", NString.class);
			pProgOverrideOut.val = cmd.getParameterValue("@P_PROG_OVERRIDE_OUT", NString.class);
			pActvOverrideOut.val = cmd.getParameterValue("@P_ACTV_OVERRIDE_OUT", NString.class);
			pLocnOverrideOut.val = cmd.getParameterValue("@P_LOCN_OVERRIDE_OUT", NString.class);
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateAcctCode(NDate pEffdateTime,NString pCoasCode,NString pAcctCode,Ref<NString> pErrMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_VALIDATE_ACCT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
				
			cmd.execute();
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateActvCode(NDate pEffdateTime,NString pCoasCode,NString pActvCode,Ref<NString> pErrMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_VALIDATE_ACTV_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
				
			cmd.execute();
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateCoasCode(NDate pEffdateTime,NString pCoasCode,Ref<NString> pErrMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_VALIDATE_COAS_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
				
			cmd.execute();
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateCtypCode(NString pCtypCode,Ref<NString> pErrMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_VALIDATE_CTYP_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
				
			cmd.execute();
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateFoapal(NString pCoasIn,NString pAcciIn,Ref<NString> pFundInout,Ref<NString> pOrgnInout,Ref<NString> pAcctInout,Ref<NString> pProgInout,Ref<NString> pActvInout,Ref<NString> pLocnInout,NDate pTransdateIn,Ref<NString> pValidInd,Ref<NString> pErrMessageOut,NString pErrPrefixReqd,NString pDefaultIfNull) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_VALIDATE_FOAPAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_IN", pCoasIn);
			cmd.addParameter("@P_ACCI_IN", pAcciIn);
			cmd.addParameter("@P_FUND_INOUT", pFundInout, true);
			cmd.addParameter("@P_ORGN_INOUT", pOrgnInout, true);
			cmd.addParameter("@P_ACCT_INOUT", pAcctInout, true);
			cmd.addParameter("@P_PROG_INOUT", pProgInout, true);
			cmd.addParameter("@P_ACTV_INOUT", pActvInout, true);
			cmd.addParameter("@P_LOCN_INOUT", pLocnInout, true);
			cmd.addParameter("@P_TRANSDATE_IN", pTransdateIn);
			cmd.addParameter("@P_VALID_IND", pValidInd, true);
			cmd.addParameter("@P_ERR_MESSAGE_OUT", pErrMessageOut, true);
			cmd.addParameter("@P_ERR_PREFIX_REQD", pErrPrefixReqd);
			cmd.addParameter("@P_DEFAULT_IF_NULL", pDefaultIfNull);
				
			cmd.execute();
			pFundInout.val = cmd.getParameterValue("@P_FUND_INOUT", NString.class);
			pOrgnInout.val = cmd.getParameterValue("@P_ORGN_INOUT", NString.class);
			pAcctInout.val = cmd.getParameterValue("@P_ACCT_INOUT", NString.class);
			pProgInout.val = cmd.getParameterValue("@P_PROG_INOUT", NString.class);
			pActvInout.val = cmd.getParameterValue("@P_ACTV_INOUT", NString.class);
			pLocnInout.val = cmd.getParameterValue("@P_LOCN_INOUT", NString.class);
			pValidInd.val = cmd.getParameterValue("@P_VALID_IND", NString.class);
			pErrMessageOut.val = cmd.getParameterValue("@P_ERR_MESSAGE_OUT", NString.class);


		}
		
		public static void pValidateFundCode(NDate pEffdateTime,NString pCoasCode,NString pAcciCode,Ref<NString> pFundCodeInout,Ref<NString> pOrgnCodeInout,Ref<NString> pAcctCodeInout,Ref<NString> pProgCodeInout,Ref<NString> pActvCodeInout,Ref<NString> pLocnCodeInout,Ref<NString> pErrMsgInout,NString pDoDefault) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_VALIDATE_FUND_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE_INOUT", pFundCodeInout, true);
			cmd.addParameter("@P_ORGN_CODE_INOUT", pOrgnCodeInout, true);
			cmd.addParameter("@P_ACCT_CODE_INOUT", pAcctCodeInout, true);
			cmd.addParameter("@P_PROG_CODE_INOUT", pProgCodeInout, true);
			cmd.addParameter("@P_ACTV_CODE_INOUT", pActvCodeInout, true);
			cmd.addParameter("@P_LOCN_CODE_INOUT", pLocnCodeInout, true);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
			cmd.addParameter("@P_DO_DEFAULT", pDoDefault);
				
			cmd.execute();
			pFundCodeInout.val = cmd.getParameterValue("@P_FUND_CODE_INOUT", NString.class);
			pOrgnCodeInout.val = cmd.getParameterValue("@P_ORGN_CODE_INOUT", NString.class);
			pAcctCodeInout.val = cmd.getParameterValue("@P_ACCT_CODE_INOUT", NString.class);
			pProgCodeInout.val = cmd.getParameterValue("@P_PROG_CODE_INOUT", NString.class);
			pActvCodeInout.val = cmd.getParameterValue("@P_ACTV_CODE_INOUT", NString.class);
			pLocnCodeInout.val = cmd.getParameterValue("@P_LOCN_CODE_INOUT", NString.class);
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateLocnCode(NDate pEffdateTime,NString pCoasCode,NString pLocnCode,Ref<NString> pErrMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_VALIDATE_LOCN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
				
			cmd.execute();
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateOrgnCode(NDate pEffdateTime,NString pCoasCode,NString pAcciCode,Ref<NString> pFundCodeInout,Ref<NString> pOrgnCodeInout,Ref<NString> pAcctCodeInout,Ref<NString> pProgCodeInout,Ref<NString> pActvCodeInout,Ref<NString> pLocnCodeInout,Ref<NString> pErrMsgInout,NString pDoDefault) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_VALIDATE_ORGN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE_INOUT", pFundCodeInout, true);
			cmd.addParameter("@P_ORGN_CODE_INOUT", pOrgnCodeInout, true);
			cmd.addParameter("@P_ACCT_CODE_INOUT", pAcctCodeInout, true);
			cmd.addParameter("@P_PROG_CODE_INOUT", pProgCodeInout, true);
			cmd.addParameter("@P_ACTV_CODE_INOUT", pActvCodeInout, true);
			cmd.addParameter("@P_LOCN_CODE_INOUT", pLocnCodeInout, true);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
			cmd.addParameter("@P_DO_DEFAULT", pDoDefault);
				
			cmd.execute();
			pFundCodeInout.val = cmd.getParameterValue("@P_FUND_CODE_INOUT", NString.class);
			pOrgnCodeInout.val = cmd.getParameterValue("@P_ORGN_CODE_INOUT", NString.class);
			pAcctCodeInout.val = cmd.getParameterValue("@P_ACCT_CODE_INOUT", NString.class);
			pProgCodeInout.val = cmd.getParameterValue("@P_PROG_CODE_INOUT", NString.class);
			pActvCodeInout.val = cmd.getParameterValue("@P_ACTV_CODE_INOUT", NString.class);
			pLocnCodeInout.val = cmd.getParameterValue("@P_LOCN_CODE_INOUT", NString.class);
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateOrgnCode(NDate pEffdateTime,NString pCoasCode,NString pOrgnCode,Ref<NString> pDescOut,Ref<NString> pErrMsgInout,NString pDataEntryInd,NString pCheckTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_VALIDATE_ORGN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_DESC_OUT", NString.class);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
			cmd.addParameter("@P_DATA_ENTRY_IND", pDataEntryInd);
			cmd.addParameter("@P_CHECK_TERM", pCheckTerm);
				
			cmd.execute();
			pDescOut.val = cmd.getParameterValue("@P_DESC_OUT", NString.class);
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateProgCode(NDate pEffdateTime,NString pCoasCode,NString pProgCode,Ref<NString> pErrMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_VALIDATE_PROG_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
				
			cmd.execute();
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
		public static void pValidateProjCode(NDate pEffdateTime,NString pCoasCode,NString pProjCode,Ref<NString> pErrMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKFOAP.P_VALIDATE_PROJ_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFDATE_TIME", pEffdateTime);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_ERR_MSG_INOUT", pErrMsgInout, true);
				
			cmd.execute();
			pErrMsgInout.val = cmd.getParameterValue("@P_ERR_MSG_INOUT", NString.class);


		}
		
	
	
	
}
