package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fbkd1ss {
		public static NBool fCheckFundOrgSecurityOn() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.F_CHECK_FUND_ORG_SECURITY_ON", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fCheckFundSecurity(NString coasIn,NString fundIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.F_CHECK_FUND_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COAS_IN", coasIn);
			cmd.addParameter("@FUND_IN", fundIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckGotdpar(NString tableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.F_CHECK_GOTDPAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME", tableName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckOrgnSecurity(NString coasIn,NString orgnIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.F_CHECK_ORGN_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COAS_IN", coasIn);
			cmd.addParameter("@ORGN_IN", orgnIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCoasSqlstr(NString tableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.F_COAS_SQLSTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME", tableName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDownloadHeaderSqlstr(NString tableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.F_DOWNLOAD_HEADER_SQLSTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME", tableName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDownloadHeaderSumCols(NString amountType,NString period) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.F_DOWNLOAD_HEADER_SUM_COLS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@AMOUNT_TYPE", amountType);
			cmd.addParameter("@PERIOD", period);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDownloadNullit(NString colVal) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.F_DOWNLOAD_NULLIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COL_VAL", colVal);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDownloadSqlstr(NString tableName,NString clauseName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.F_DOWNLOAD_SQLSTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@CLAUSE_NAME", clauseName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDownloadSqlstrWhereFoapal(NString tableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.F_DOWNLOAD_SQLSTR_WHERE_FOAPAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME", tableName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetFundSecurity(NString tableIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.F_GET_FUND_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_IN", tableIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetOpalAnd(NString opalCode,NString opalValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.F_GET_OPAL_AND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@OPAL_CODE", opalCode);
			cmd.addParameter("@OPAL_VALUE", opalValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetOrgnSecurity(NString tableIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.F_GET_ORGN_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_IN", tableIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fStepFbbblinSqlstr(NString tableName,NString stepName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.F_STEP_FBBBLIN_SQLSTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@STEP_NAME", stepName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fStepFbrdistSqlstr(NString tableName,NString stepName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.F_STEP_FBRDIST_SQLSTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@STEP_NAME", stepName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fStepFgbopalSqlstr(NString tableName,NString stepName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.F_STEP_FGBOPAL_SQLSTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@STEP_NAME", stepName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fStepFrrgrnlSqlstr(NString tableName,NString stepName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.F_STEP_FRRGRNL_SQLSTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@STEP_NAME", stepName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fStepSqlstr(NString tableName,NString stepName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.F_STEP_SQLSTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@STEP_NAME", stepName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSumSelSqlstr(NString tableName,NString amountType,NString period) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.F_SUM_SEL_SQLSTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@AMOUNT_TYPE", amountType);
			cmd.addParameter("@PERIOD", period);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCheckFundSecurity(NString coasCodeIn,NString fundCodeIn,NString currentUserIn,Ref<NString> errorTypeOut,Ref<NString> errorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.P_CHECK_FUND_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@FUND_CODE_IN", fundCodeIn);
			cmd.addParameter("@CURRENT_USER_IN", currentUserIn);
			cmd.addParameter("@ERROR_TYPE_OUT", NString.class);
			cmd.addParameter("@ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			errorTypeOut.val = cmd.getParameterValue("@ERROR_TYPE_OUT", NString.class);
			errorMsgOut.val = cmd.getParameterValue("@ERROR_MSG_OUT", NString.class);


		}
		
		public static void pCheckOrgnSecurity(NString coasCodeIn,NString orgnCodeIn,NString currentUserIn,Ref<NString> errorTypeOut,Ref<NString> errorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.P_CHECK_ORGN_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@ORGN_CODE_IN", orgnCodeIn);
			cmd.addParameter("@CURRENT_USER_IN", currentUserIn);
			cmd.addParameter("@ERROR_TYPE_OUT", NString.class);
			cmd.addParameter("@ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			errorTypeOut.val = cmd.getParameterValue("@ERROR_TYPE_OUT", NString.class);
			errorMsgOut.val = cmd.getParameterValue("@ERROR_MSG_OUT", NString.class);


		}
		
		public static void pDeleteFbtblin() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.P_DELETE_FBTBLIN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDeleteGobackGotdpar(NString tableName,NString stepName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.P_DELETE_GOBACK_GOTDPAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
			cmd.addParameter("@STEP_NAME", stepName);
				
			cmd.execute();


		}
		
		public static void pLoadFundSecurity(NString tableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.P_LOAD_FUND_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
				
			cmd.execute();


		}
		
		public static void pLoadOrgnSecurity(NString tableName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.P_LOAD_ORGN_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLE_NAME", tableName);
				
			cmd.execute();


		}
		
		public static void pValidateAcctCode(NString coasCodeIn,NString acctCodeIn,Ref<NString> errorTypeOut,Ref<NString> errorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.P_VALIDATE_ACCT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@ACCT_CODE_IN", acctCodeIn);
			cmd.addParameter("@ERROR_TYPE_OUT", NString.class);
			cmd.addParameter("@ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			errorTypeOut.val = cmd.getParameterValue("@ERROR_TYPE_OUT", NString.class);
			errorMsgOut.val = cmd.getParameterValue("@ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateActvCode(NString coasCodeIn,NString actvCodeIn,Ref<NString> errorTypeOut,Ref<NString> errorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.P_VALIDATE_ACTV_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@ACTV_CODE_IN", actvCodeIn);
			cmd.addParameter("@ERROR_TYPE_OUT", NString.class);
			cmd.addParameter("@ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			errorTypeOut.val = cmd.getParameterValue("@ERROR_TYPE_OUT", NString.class);
			errorMsgOut.val = cmd.getParameterValue("@ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateCoasCode(NString coasCodeIn,Ref<NString> errorTypeOut,Ref<NString> errorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.P_VALIDATE_COAS_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@ERROR_TYPE_OUT", NString.class);
			cmd.addParameter("@ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			errorTypeOut.val = cmd.getParameterValue("@ERROR_TYPE_OUT", NString.class);
			errorMsgOut.val = cmd.getParameterValue("@ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateFundCode(NString coasCodeIn,NString fundCodeIn,Ref<NString> errorTypeOut,Ref<NString> errorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.P_VALIDATE_FUND_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@FUND_CODE_IN", fundCodeIn);
			cmd.addParameter("@ERROR_TYPE_OUT", NString.class);
			cmd.addParameter("@ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			errorTypeOut.val = cmd.getParameterValue("@ERROR_TYPE_OUT", NString.class);
			errorMsgOut.val = cmd.getParameterValue("@ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateInsertFbtblin(NString workbook,NString worksheet,NNumber rowNumber,NString obudCode,NString coasCode,NString acctCode,NString fundCode,NString obphCode,NString budgDurCode,NString budgMeasType,NString budgPrdType,NNumber seqDisplayNum,NString budgAmt,NString orgnCode,NString progCode,NString actvCode,NString locnCode,NString textInd,NString textSeqNum,NString adjtAmt,NString rollAmt) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.P_VALIDATE_INSERT_FBTBLIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WORKBOOK", workbook);
			cmd.addParameter("@WORKSHEET", worksheet);
			cmd.addParameter("@ROW_NUMBER", rowNumber);
			cmd.addParameter("@OBUD_CODE", obudCode);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@ACCT_CODE", acctCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@OBPH_CODE", obphCode);
			cmd.addParameter("@BUDG_DUR_CODE", budgDurCode);
			cmd.addParameter("@BUDG_MEAS_TYPE", budgMeasType);
			cmd.addParameter("@BUDG_PRD_TYPE", budgPrdType);
			cmd.addParameter("@SEQ_DISPLAY_NUM", seqDisplayNum);
			cmd.addParameter("@BUDG_AMT", budgAmt);
			cmd.addParameter("@ORGN_CODE", orgnCode);
			cmd.addParameter("@PROG_CODE", progCode);
			cmd.addParameter("@ACTV_CODE", actvCode);
			cmd.addParameter("@LOCN_CODE", locnCode);
			cmd.addParameter("@TEXT_IND", textInd);
			cmd.addParameter("@TEXT_SEQ_NUM", textSeqNum);
			cmd.addParameter("@ADJT_AMT", adjtAmt);
			cmd.addParameter("@ROLL_AMT", rollAmt);
				
			cmd.execute();


		}
		
		public static void pValidateLocnCode(NString coasCodeIn,NString locnCodeIn,Ref<NString> errorTypeOut,Ref<NString> errorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.P_VALIDATE_LOCN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@LOCN_CODE_IN", locnCodeIn);
			cmd.addParameter("@ERROR_TYPE_OUT", NString.class);
			cmd.addParameter("@ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			errorTypeOut.val = cmd.getParameterValue("@ERROR_TYPE_OUT", NString.class);
			errorMsgOut.val = cmd.getParameterValue("@ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateOrgnCode(NString coasCodeIn,NString orgnCodeIn,Ref<NString> errorTypeOut,Ref<NString> errorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.P_VALIDATE_ORGN_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@ORGN_CODE_IN", orgnCodeIn);
			cmd.addParameter("@ERROR_TYPE_OUT", NString.class);
			cmd.addParameter("@ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			errorTypeOut.val = cmd.getParameterValue("@ERROR_TYPE_OUT", NString.class);
			errorMsgOut.val = cmd.getParameterValue("@ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateProgCode(NString coasCodeIn,NString progCodeIn,Ref<NString> errorTypeOut,Ref<NString> errorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD1SS.P_VALIDATE_PROG_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE_IN", coasCodeIn);
			cmd.addParameter("@PROG_CODE_IN", progCodeIn);
			cmd.addParameter("@ERROR_TYPE_OUT", NString.class);
			cmd.addParameter("@ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			errorTypeOut.val = cmd.getParameterValue("@ERROR_TYPE_OUT", NString.class);
			errorMsgOut.val = cmd.getParameterValue("@ERROR_MSG_OUT", NString.class);


		}
		
	
	
	
}
