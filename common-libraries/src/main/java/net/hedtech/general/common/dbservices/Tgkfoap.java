package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Tgkfoap {
		public static NString fGetFtypOverrideInd(NDate asOfDateIn,NString coasCodeIn,NString ftypCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TGKFOAP.F_GET_FTYP_OVERRIDE_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AS_OF_DATE_IN", asOfDateIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@FTYP_CODE_IN", ftypCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static SyscSecurityRecRow fGetSecurityInd(NDate asOfDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TGKFOAP.F_GET_SECURITY_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(SyscSecurityRecRow.class));
			cmd.addParameter("@AS_OF_DATE_IN", asOfDateIn);
				
			cmd.execute();

			return cmd.getReturnValue(SyscSecurityRecRow.class);

		}
		
		public static void pEditAcciCode(NDate asOfDateIn,NString acciCodeIn,NString coasCodeIn,Ref<NString> holdFundCodeV,Ref<NString> holdOrgnCodeV,Ref<NString> holdAcctCodeV,Ref<NString> holdProgCodeV,Ref<NString> holdActvCodeV,Ref<NString> holdLocnCodeV,Ref<NString> fundOverrideV,Ref<NString> orgnOverrideV,Ref<NString> acctOverrideV,Ref<NString> progOverrideV,Ref<NString> actvOverrideV,Ref<NString> locnOverrideV,Ref<NString> errMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TGKFOAP.P_EDIT_ACCI_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AS_OF_DATE_IN", asOfDateIn);
			cmd.addParameter("@ACCI_CODE_IN", acciCodeIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@HOLD_FUND_CODE_V", holdFundCodeV, true);
			cmd.addParameter("@HOLD_ORGN_CODE_V", holdOrgnCodeV, true);
			cmd.addParameter("@HOLD_ACCT_CODE_V", holdAcctCodeV, true);
			cmd.addParameter("@HOLD_PROG_CODE_V", holdProgCodeV, true);
			cmd.addParameter("@HOLD_ACTV_CODE_V", holdActvCodeV, true);
			cmd.addParameter("@HOLD_LOCN_CODE_V", holdLocnCodeV, true);
			cmd.addParameter("@FUND_OVERRIDE_V", fundOverrideV, true);
			cmd.addParameter("@ORGN_OVERRIDE_V", orgnOverrideV, true);
			cmd.addParameter("@ACCT_OVERRIDE_V", acctOverrideV, true);
			cmd.addParameter("@PROG_OVERRIDE_V", progOverrideV, true);
			cmd.addParameter("@ACTV_OVERRIDE_V", actvOverrideV, true);
			cmd.addParameter("@LOCN_OVERRIDE_V", locnOverrideV, true);
			cmd.addParameter("@ERR_MSG_INOUT", errMsgInout, true);
				
			cmd.execute();
			holdFundCodeV.val = cmd.getParameterValue("@HOLD_FUND_CODE_V", NString.class);
			holdOrgnCodeV.val = cmd.getParameterValue("@HOLD_ORGN_CODE_V", NString.class);
			holdAcctCodeV.val = cmd.getParameterValue("@HOLD_ACCT_CODE_V", NString.class);
			holdProgCodeV.val = cmd.getParameterValue("@HOLD_PROG_CODE_V", NString.class);
			holdActvCodeV.val = cmd.getParameterValue("@HOLD_ACTV_CODE_V", NString.class);
			holdLocnCodeV.val = cmd.getParameterValue("@HOLD_LOCN_CODE_V", NString.class);
			fundOverrideV.val = cmd.getParameterValue("@FUND_OVERRIDE_V", NString.class);
			orgnOverrideV.val = cmd.getParameterValue("@ORGN_OVERRIDE_V", NString.class);
			acctOverrideV.val = cmd.getParameterValue("@ACCT_OVERRIDE_V", NString.class);
			progOverrideV.val = cmd.getParameterValue("@PROG_OVERRIDE_V", NString.class);
			actvOverrideV.val = cmd.getParameterValue("@ACTV_OVERRIDE_V", NString.class);
			locnOverrideV.val = cmd.getParameterValue("@LOCN_OVERRIDE_V", NString.class);
			errMsgInout.val = cmd.getParameterValue("@ERR_MSG_INOUT", NString.class);


		}
		
		public static void pEditAcctCode(NDate asOfDateIn,NString coasCodeIn,NString acctCodeIn,Ref<NString> errMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TGKFOAP.P_EDIT_ACCT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AS_OF_DATE_IN", asOfDateIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@ACCT_CODE_IN", acctCodeIn);
			cmd.addParameter("@ERR_MSG_INOUT", errMsgInout, true);
				
			cmd.execute();
			errMsgInout.val = cmd.getParameterValue("@ERR_MSG_INOUT", NString.class);


		}
		
		public static void pEditActvCode(NDate asOfDateIn,NString coasCodeIn,NString actvCodeIn,Ref<NString> errMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TGKFOAP.P_EDIT_ACTV_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AS_OF_DATE_IN", asOfDateIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@ACTV_CODE_IN", actvCodeIn);
			cmd.addParameter("@ERR_MSG_INOUT", errMsgInout, true);
				
			cmd.execute();
			errMsgInout.val = cmd.getParameterValue("@ERR_MSG_INOUT", NString.class);


		}
		
		public static void pEditCoasCode(NDate asOfDateIn,NString coasCodeIn,Ref<NString> errMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TGKFOAP.P_EDIT_COAS_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AS_OF_DATE_IN", asOfDateIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@ERR_MSG_INOUT", errMsgInout, true);
				
			cmd.execute();
			errMsgInout.val = cmd.getParameterValue("@ERR_MSG_INOUT", NString.class);


		}
		
		public static void pEditFundCode(NDate asOfDateIn,NString coasCodeIn,NString fundCodeIn,NString glFundOrgnSecV,NString currentUserV,Ref<NString> workOrgnV,NString reeditOrgnV,Ref<NString> errMsgInout,Ref<NString> ftypCodeV,Ref<NString> orgnCodeDefV,Ref<NString> progCodeDefV,Ref<NString> actvCodeDefV,Ref<NString> locnCodeDefV) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TGKFOAP.P_EDIT_FUND_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AS_OF_DATE_IN", asOfDateIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@FUND_CODE_IN", fundCodeIn);
			cmd.addParameter("@GL_FUND_ORGN_SEC_V", glFundOrgnSecV);
			cmd.addParameter("@CURRENT_USER_V", currentUserV);
			cmd.addParameter("@WORK_ORGN_V", workOrgnV, true);
			cmd.addParameter("@REEDIT_ORGN_V", reeditOrgnV);
			cmd.addParameter("@ERR_MSG_INOUT", errMsgInout, true);
			cmd.addParameter("@FTYP_CODE_V", ftypCodeV, true);
			cmd.addParameter("@ORGN_CODE_DEF_V", orgnCodeDefV, true);
			cmd.addParameter("@PROG_CODE_DEF_V", progCodeDefV, true);
			cmd.addParameter("@ACTV_CODE_DEF_V", actvCodeDefV, true);
			cmd.addParameter("@LOCN_CODE_DEF_V", locnCodeDefV, true);
				
			cmd.execute();
			workOrgnV.val = cmd.getParameterValue("@WORK_ORGN_V", NString.class);
			errMsgInout.val = cmd.getParameterValue("@ERR_MSG_INOUT", NString.class);
			ftypCodeV.val = cmd.getParameterValue("@FTYP_CODE_V", NString.class);
			orgnCodeDefV.val = cmd.getParameterValue("@ORGN_CODE_DEF_V", NString.class);
			progCodeDefV.val = cmd.getParameterValue("@PROG_CODE_DEF_V", NString.class);
			actvCodeDefV.val = cmd.getParameterValue("@ACTV_CODE_DEF_V", NString.class);
			locnCodeDefV.val = cmd.getParameterValue("@LOCN_CODE_DEF_V", NString.class);


		}
		
		public static void pEditLocnCode(NDate asOfDateIn,NString coasCodeIn,NString locnCodeIn,Ref<NString> errMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TGKFOAP.P_EDIT_LOCN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AS_OF_DATE_IN", asOfDateIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@LOCN_CODE_IN", locnCodeIn);
			cmd.addParameter("@ERR_MSG_INOUT", errMsgInout, true);
				
			cmd.execute();
			errMsgInout.val = cmd.getParameterValue("@ERR_MSG_INOUT", NString.class);


		}
		
		public static void pEditOrgnCode(NDate asOfDateIn,NString coasCodeIn,NString orgnCodeIn,NString glFundOrgnSecV,NString currentUserV,Ref<NString> workFundV,NString reeditIndV,Ref<NString> errMsgInout,Ref<NString> fundCodeDefV,Ref<NString> progCodeDefV,Ref<NString> actvCodeDefV,Ref<NString> locnCodeDefV) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TGKFOAP.P_EDIT_ORGN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AS_OF_DATE_IN", asOfDateIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@ORGN_CODE_IN", orgnCodeIn);
			cmd.addParameter("@GL_FUND_ORGN_SEC_V", glFundOrgnSecV);
			cmd.addParameter("@CURRENT_USER_V", currentUserV);
			cmd.addParameter("@WORK_FUND_V", workFundV, true);
			cmd.addParameter("@REEDIT_IND_V", reeditIndV);
			cmd.addParameter("@ERR_MSG_INOUT", errMsgInout, true);
			cmd.addParameter("@FUND_CODE_DEF_V", fundCodeDefV, true);
			cmd.addParameter("@PROG_CODE_DEF_V", progCodeDefV, true);
			cmd.addParameter("@ACTV_CODE_DEF_V", actvCodeDefV, true);
			cmd.addParameter("@LOCN_CODE_DEF_V", locnCodeDefV, true);
				
			cmd.execute();
			workFundV.val = cmd.getParameterValue("@WORK_FUND_V", NString.class);
			errMsgInout.val = cmd.getParameterValue("@ERR_MSG_INOUT", NString.class);
			fundCodeDefV.val = cmd.getParameterValue("@FUND_CODE_DEF_V", NString.class);
			progCodeDefV.val = cmd.getParameterValue("@PROG_CODE_DEF_V", NString.class);
			actvCodeDefV.val = cmd.getParameterValue("@ACTV_CODE_DEF_V", NString.class);
			locnCodeDefV.val = cmd.getParameterValue("@LOCN_CODE_DEF_V", NString.class);


		}
		
		public static void pEditProgCode(NDate asOfDateIn,NString coasCodeIn,NString progCodeIn,Ref<NString> errMsgInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TGKFOAP.P_EDIT_PROG_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AS_OF_DATE_IN", asOfDateIn);
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@PROG_CODE_IN", progCodeIn);
			cmd.addParameter("@ERR_MSG_INOUT", errMsgInout, true);
				
			cmd.execute();
			errMsgInout.val = cmd.getParameterValue("@ERR_MSG_INOUT", NString.class);


		}
		
		public static void pEditRuclCode(NDate asOfDateIn,NString ruclCodeIn,NString globalRuclSecIndV,NString currentFormV,NString currentUserV,Ref<NString> errMsgInout,Ref<NString> classTypeV) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TGKFOAP.P_EDIT_RUCL_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AS_OF_DATE_IN", asOfDateIn);
			cmd.addParameter("@RUCL_CODE_IN", ruclCodeIn);
			cmd.addParameter("@GLOBAL_RUCL_SEC_IND_V", globalRuclSecIndV);
			cmd.addParameter("@CURRENT_FORM_V", currentFormV);
			cmd.addParameter("@CURRENT_USER_V", currentUserV);
			cmd.addParameter("@ERR_MSG_INOUT", errMsgInout, true);
			cmd.addParameter("@CLASS_TYPE_V", NString.class);
				
			cmd.execute();
			errMsgInout.val = cmd.getParameterValue("@ERR_MSG_INOUT", NString.class);
			classTypeV.val = cmd.getParameterValue("@CLASS_TYPE_V", NString.class);


		}
		
		public static void pValidateAccounting(NString pCoasIn,NString pAcciIn,Ref<NString> pFundInout,Ref<NString> pOrgnInout,Ref<NString> pAcctInout,Ref<NString> pProgInout,Ref<NString> pActvInout,Ref<NString> pLocnInout,NDate pTransdateIn,NString pRuclCodeIn,NString pRuclTypeIn,NString pCurrFormIn,NString pUserIdIn,NString pAddErrPrefix,NString pDefaultIfNull,Ref<NString> pValidIndOut,Ref<NString> pErrMessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TGKFOAP.P_VALIDATE_ACCOUNTING", DbManager.getDataBaseFactory());
			
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
		
	
	
	@DbRecordType(id="SyscSecurityRecRow", dataSourceName="SYSC_SECURITY_REC")
	public static class SyscSecurityRecRow
	{
		@DbRecordField(dataSourceName="FUND_ORG_IND")
		public NString FundOrgInd;
		@DbRecordField(dataSourceName="RULE_CLASS_IND")
		public NString RuleClassInd;
	}

	
	
}
