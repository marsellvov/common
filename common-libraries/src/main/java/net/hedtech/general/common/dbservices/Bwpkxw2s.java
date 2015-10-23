package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkxw2s {
		public static NString fAppendSpaces(NString pLabel,NNumber pSpaceCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.F_APPEND_SPACES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LABEL", pLabel);
			cmd.addParameter("@P_SPACE_COUNT", pSpaceCount);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFormatItem(NNumber pValue,NString pFormatMask) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.F_FORMAT_ITEM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_FORMAT_MASK", pFormatMask);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fGetEmplData(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.F_GET_EMPL_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fGetEmployeeW2Consent(NNumber pEmpPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.F_GET_EMPLOYEE_W2_CONSENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetEmprId(NString pEmprId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.F_GET_EMPR_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EMPR_ID", pEmprId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fW2Restriction(NNumber pEmpPidm,NNumber pTaxYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.F_W2_RESTRICTION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_EMP_PIDM", pEmpPidm);
			cmd.addParameter("@P_TAX_YEAR", pTaxYear);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fW2cExists(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.F_W2C_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCertifcationBody(NString pTaxYear,NString pEmprCode,NString pSeqNo,NNumber pAttemptno,NString pFormType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.P_CERTIFCATION_BODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TAX_YEAR", pTaxYear);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ATTEMPTNO", pAttemptno);
			cmd.addParameter("@P_FORM_TYPE", pFormType);
				
			cmd.execute();


		}
		
		public static void pChoosew2cEmprCode(NNumber pPidm,NString pSelectedTaxYear,Ref<NString> pSelectedEmprCodeInOut,NString pEmprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.P_CHOOSEW2C_EMPR_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SELECTED_TAX_YEAR", pSelectedTaxYear);
			cmd.addParameter("@P_SELECTED_EMPR_CODE_IN_OUT", pSelectedEmprCodeInOut, true);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
				
			cmd.execute();
			pSelectedEmprCodeInOut.val = cmd.getParameterValue("@P_SELECTED_EMPR_CODE_IN_OUT", NString.class);


		}
		
		public static void pChoosew2cSeqno(NNumber pPidm,NString pSelectedTaxYear,NString pSelectedEmprCode,Ref<NString> pSelectedSeqNoInOut,NString pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.P_CHOOSEW2C_SEQNO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SELECTED_TAX_YEAR", pSelectedTaxYear);
			cmd.addParameter("@P_SELECTED_EMPR_CODE", pSelectedEmprCode);
			cmd.addParameter("@P_SELECTED_SEQ_NO_IN_OUT", pSelectedSeqNoInOut, true);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();
			pSelectedSeqNoInOut.val = cmd.getParameterValue("@P_SELECTED_SEQ_NO_IN_OUT", NString.class);


		}
		
		public static void pChoosew2cTaxYear(NNumber pPidm,Ref<NString> pSelectedTaxYearInOut,NString pTaxYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.P_CHOOSEW2C_TAX_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SELECTED_TAX_YEAR_IN_OUT", pSelectedTaxYearInOut, true);
			cmd.addParameter("@P_TAX_YEAR", pTaxYear);
				
			cmd.execute();
			pSelectedTaxYearInOut.val = cmd.getParameterValue("@P_SELECTED_TAX_YEAR_IN_OUT", NString.class);


		}
		
		public static void pJscriptW2consentprompt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.P_JSCRIPT_W2CONSENTPROMPT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPrintChoosew2key(NNumber pPidm,NString w2TaxYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.P_PRINT_CHOOSEW2KEY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@W2_TAX_YEAR", w2TaxYear);
				
			cmd.execute();


		}
		
		public static void pPrintW2Consent(NNumber pPidm,NString pSrce) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.P_PRINT_W2_CONSENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SRCE", pSrce);
				
			cmd.execute();


		}
		
		public static void pPrintW2Preview2005(NString inTaxYear,NString inEmprCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.P_PRINT_W2_PREVIEW_2005", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pPrintW2c2005(NNumber inTaxYear,NString inEmprCode,NNumber inSeqNo,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.P_PRINT_W2C_2005", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pPrintW2cPreview2005(NNumber inTaxYear,NString inEmprCode,NNumber inSeqNo,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.P_PRINT_W2C_PREVIEW_2005", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pUpdateW2Consent(NNumber pPidm,NString pConsentInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.P_UPDATE_W2_CONSENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CONSENT_IND", pConsentInd);
				
			cmd.execute();


		}
		
		public static void pVieww22005(NString inTaxYear,NString inEmprCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.P_VIEWW2_2005", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pW2PrinterCss() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.P_W2_PRINTER_CSS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pW2ScreenCss() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.P_W2_SCREEN_CSS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pW2cPrinterCss() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.P_W2C_PRINTER_CSS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pW2cScreenCss() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXW2S.P_W2C_SCREEN_CSS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
