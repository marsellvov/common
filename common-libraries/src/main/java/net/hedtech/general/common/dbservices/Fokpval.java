package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fokpval {
		public static void checkFgrfitd(NNumber oneUpNo,Ref<NString> errInd,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.CHECK_FGRFITD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONE_UP_NO", oneUpNo);
			cmd.addParameter("@ERR_IND", NString.class);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			errInd.val = cmd.getParameterValue("@ERR_IND", NString.class);
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);


		}
		
		public static NBool fBondCusipEqual(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_BOND_CUSIP_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFpbbidhEqual(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_FPBBIDH_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFpbpohdEqual(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_FPBPOHD_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFpbrcdtPackEqual(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_FPBRCDT_PACK_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFpbrchdLike(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_FPBRCHD_LIKE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFpbreqhEqual(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_FPBREQH_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFtvagcyEqual(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_FTVAGCY_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFtvcoasEqual(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_FTVCOAS_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFtvcommEqual(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_FTVCOMM_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFtvcommLike(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_FTVCOMM_LIKE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFtvdtypEqual(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_FTVDTYP_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFtvfundEqual(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_FTVFUND_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFtvimgrEqual(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_FTVIMGR_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFtvorgnEqualNoCoa(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_FTVORGN_EQUAL_NO_COA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFtvpaymEqual(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_FTVPAYM_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFtvshipEqual(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_FTVSHIP_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFtvshipLike(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_FTVSHIP_LIKE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFtvvendEqual(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_FTVVEND_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fFtvvtypEqual(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_FTVVTYP_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fGxvbankEqual(NString validationValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.F_GXVBANK_EQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void getGjbprunValue(NNumber oneUpNo,NString parmNo,Ref<NString> parmValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.GET_GJBPRUN_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONE_UP_NO", oneUpNo);
			cmd.addParameter("@PARM_NO", parmNo);
			cmd.addParameter("@PARM_VALUE", NString.class);
				
			cmd.execute();
			parmValue.val = cmd.getParameterValue("@PARM_VALUE", NString.class);


		}
		
		public static void pSetError(NString valLabel,Ref<NString> valErrInd,Ref<NString> valErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.P_SET_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VAL_LABEL", valLabel);
			cmd.addParameter("@VAL_ERR_IND", NString.class);
			cmd.addParameter("@VAL_ERR_MSG", NString.class);
				
			cmd.execute();
			valErrInd.val = cmd.getParameterValue("@VAL_ERR_IND", NString.class);
			valErrMsg.val = cmd.getParameterValue("@VAL_ERR_MSG", NString.class);


		}
		
		public static void pValidate(NString validationLabel,NNumber parmOneUpNo,NString validationValue,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_LABEL", validationLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
			cmd.addParameter("@VALIDATION_ERROR_IND", validationErrorInd, true);
			cmd.addParameter("@VALIDATION_ERROR_MSG", NString.class);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
		public static void pValidatePopSel(NString pApplication,NString pSelection,NString pCreatorId,Ref<NString> pErrInd,Ref<NString> pErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.P_VALIDATE_POP_SEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPLICATION", pApplication);
			cmd.addParameter("@P_SELECTION", pSelection);
			cmd.addParameter("@P_CREATOR_ID", pCreatorId);
			cmd.addParameter("@P_ERR_IND", NString.class);
			cmd.addParameter("@P_ERR_MSG", NString.class);
				
			cmd.execute();
			pErrInd.val = cmd.getParameterValue("@P_ERR_IND", NString.class);
			pErrMsg.val = cmd.getParameterValue("@P_ERR_MSG", NString.class);


		}
		
		public static void validAcct(NNumber oneUpNo,NString coasParmNo,NString parmNo,Ref<NString> errInd,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.VALID_ACCT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONE_UP_NO", oneUpNo);
			cmd.addParameter("@COAS_PARM_NO", coasParmNo);
			cmd.addParameter("@PARM_NO", parmNo);
			cmd.addParameter("@ERR_IND", NString.class);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			errInd.val = cmd.getParameterValue("@ERR_IND", NString.class);
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);


		}
		
		public static void validAcctType(NNumber oneUpNo,NString coasParmNo,NString parmNo,Ref<NString> errInd,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.VALID_ACCT_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONE_UP_NO", oneUpNo);
			cmd.addParameter("@COAS_PARM_NO", coasParmNo);
			cmd.addParameter("@PARM_NO", parmNo);
			cmd.addParameter("@ERR_IND", NString.class);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			errInd.val = cmd.getParameterValue("@ERR_IND", NString.class);
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);


		}
		
		public static void validActv(NNumber oneUpNo,NString coasParmNo,NString parmNo,Ref<NString> errInd,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.VALID_ACTV", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONE_UP_NO", oneUpNo);
			cmd.addParameter("@COAS_PARM_NO", coasParmNo);
			cmd.addParameter("@PARM_NO", parmNo);
			cmd.addParameter("@ERR_IND", NString.class);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			errInd.val = cmd.getParameterValue("@ERR_IND", NString.class);
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);


		}
		
		public static void validCatDesc(NString validationValue,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.VALID_CAT_DESC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
			cmd.addParameter("@VALIDATION_ERROR_IND", NString.class);
			cmd.addParameter("@VALIDATION_ERROR_MSG", NString.class);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
		public static void validCatRange(NString validationValue,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.VALID_CAT_RANGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
			cmd.addParameter("@VALIDATION_ERROR_IND", NString.class);
			cmd.addParameter("@VALIDATION_ERROR_MSG", NString.class);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
		public static void validCo(NNumber oneUpNo,NString pohdParmNo,NString parmNo,Ref<NString> errInd,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.VALID_CO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONE_UP_NO", oneUpNo);
			cmd.addParameter("@POHD_PARM_NO", pohdParmNo);
			cmd.addParameter("@PARM_NO", parmNo);
			cmd.addParameter("@ERR_IND", NString.class);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			errInd.val = cmd.getParameterValue("@ERR_IND", NString.class);
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);


		}
		
		public static void validFsyr(NNumber oneUpNo,NString coasParmNo,NString parmNo,Ref<NString> errInd,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.VALID_FSYR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONE_UP_NO", oneUpNo);
			cmd.addParameter("@COAS_PARM_NO", coasParmNo);
			cmd.addParameter("@PARM_NO", parmNo);
			cmd.addParameter("@ERR_IND", NString.class);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			errInd.val = cmd.getParameterValue("@ERR_IND", NString.class);
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);


		}
		
		public static void validFund(NNumber oneUpNo,NString coasParmNo,NString parmNo,Ref<NString> errInd,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.VALID_FUND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONE_UP_NO", oneUpNo);
			cmd.addParameter("@COAS_PARM_NO", coasParmNo);
			cmd.addParameter("@PARM_NO", parmNo);
			cmd.addParameter("@ERR_IND", NString.class);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			errInd.val = cmd.getParameterValue("@ERR_IND", NString.class);
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);


		}
		
		public static void validFundType(NNumber oneUpNo,NString coasParmNo,NString parmNo,Ref<NString> errInd,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.VALID_FUND_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONE_UP_NO", oneUpNo);
			cmd.addParameter("@COAS_PARM_NO", coasParmNo);
			cmd.addParameter("@PARM_NO", parmNo);
			cmd.addParameter("@ERR_IND", NString.class);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			errInd.val = cmd.getParameterValue("@ERR_IND", NString.class);
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);


		}
		
		public static void validLocn(NNumber oneUpNo,NString coasParmNo,NString parmNo,Ref<NString> errInd,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.VALID_LOCN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONE_UP_NO", oneUpNo);
			cmd.addParameter("@COAS_PARM_NO", coasParmNo);
			cmd.addParameter("@PARM_NO", parmNo);
			cmd.addParameter("@ERR_IND", NString.class);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			errInd.val = cmd.getParameterValue("@ERR_IND", NString.class);
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);


		}
		
		public static void validObph(NNumber oneUpNo,NString coasParmNo,NString obudParmNo,NString parmNo,Ref<NString> errInd,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.VALID_OBPH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONE_UP_NO", oneUpNo);
			cmd.addParameter("@COAS_PARM_NO", coasParmNo);
			cmd.addParameter("@OBUD_PARM_NO", obudParmNo);
			cmd.addParameter("@PARM_NO", parmNo);
			cmd.addParameter("@ERR_IND", NString.class);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			errInd.val = cmd.getParameterValue("@ERR_IND", NString.class);
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);


		}
		
		public static void validObud(NNumber oneUpNo,NString coasParmNo,NString parmNo,Ref<NString> errInd,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.VALID_OBUD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONE_UP_NO", oneUpNo);
			cmd.addParameter("@COAS_PARM_NO", coasParmNo);
			cmd.addParameter("@PARM_NO", parmNo);
			cmd.addParameter("@ERR_IND", NString.class);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			errInd.val = cmd.getParameterValue("@ERR_IND", NString.class);
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);


		}
		
		public static void validOrgn(NNumber oneUpNo,NString coasParmNo,NString parmNo,Ref<NString> errInd,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.VALID_ORGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONE_UP_NO", oneUpNo);
			cmd.addParameter("@COAS_PARM_NO", coasParmNo);
			cmd.addParameter("@PARM_NO", parmNo);
			cmd.addParameter("@ERR_IND", NString.class);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			errInd.val = cmd.getParameterValue("@ERR_IND", NString.class);
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);


		}
		
		public static void validPoolFund(NNumber oneUpNo,NString coasParmNo,NString parmNo,Ref<NString> errInd,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.VALID_POOL_FUND", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONE_UP_NO", oneUpNo);
			cmd.addParameter("@COAS_PARM_NO", coasParmNo);
			cmd.addParameter("@PARM_NO", parmNo);
			cmd.addParameter("@ERR_IND", NString.class);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			errInd.val = cmd.getParameterValue("@ERR_IND", NString.class);
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);


		}
		
		public static void validProg(NNumber oneUpNo,NString coasParmNo,NString parmNo,Ref<NString> errInd,Ref<NString> errMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FOKPVAL.VALID_PROG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ONE_UP_NO", oneUpNo);
			cmd.addParameter("@COAS_PARM_NO", coasParmNo);
			cmd.addParameter("@PARM_NO", parmNo);
			cmd.addParameter("@ERR_IND", NString.class);
			cmd.addParameter("@ERR_MSG", NString.class);
				
			cmd.execute();
			errInd.val = cmd.getParameterValue("@ERR_IND", NString.class);
			errMsg.val = cmd.getParameterValue("@ERR_MSG", NString.class);


		}
		
	
	
	
}
