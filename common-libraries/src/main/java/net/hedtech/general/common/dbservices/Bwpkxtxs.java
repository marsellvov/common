package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkxtxs {
		public static NString fTaxoptcodedesc(NString inOptName,NString inTitle,NString inBdtyCode,NString inTxcdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.F_TAXOPTCODEDESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_OPT_NAME", inOptName);
			cmd.addParameter("@IN_TITLE", inTitle);
			cmd.addParameter("@IN_BDTY_CODE", inBdtyCode);
			cmd.addParameter("@IN_TXCD_CODE", inTxcdCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTaxoptcodevalue(NString inOptName,NString inValue,NString inBdtyCode,NString inTxcdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.F_TAXOPTCODEVALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_OPT_NAME", inOptName);
			cmd.addParameter("@IN_VALUE", inValue);
			cmd.addParameter("@IN_BDTY_CODE", inBdtyCode);
			cmd.addParameter("@IN_TXCD_CODE", inTxcdCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCertificationdriver(NString pTaxYear,NString pEmprCode,NString pSeqNo,NString pUsrid,NString pPinno,NNumber pAttemptno,NString pFormType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_CERTIFICATIONDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TAX_YEAR", pTaxYear);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_USRID", pUsrid);
			cmd.addParameter("@P_PINNO", pPinno);
			cmd.addParameter("@P_ATTEMPTNO", pAttemptno);
			cmd.addParameter("@P_FORM_TYPE", pFormType);
				
			cmd.execute();


		}
		
		public static void pChoosetaxoptcode(NString inOptName,NString inReqInd,NString inFieldName,NString inFieldTag,NString inValue,NString inBdtyCode,NString inTxcdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_CHOOSETAXOPTCODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_OPT_NAME", inOptName);
			cmd.addParameter("@IN_REQ_IND", inReqInd);
			cmd.addParameter("@IN_FIELD_NAME", inFieldName);
			cmd.addParameter("@IN_FIELD_TAG", inFieldTag);
			cmd.addParameter("@IN_VALUE", inValue);
			cmd.addParameter("@IN_BDTY_CODE", inBdtyCode);
			cmd.addParameter("@IN_TXCD_CODE", inTxcdCode);
				
			cmd.execute();


		}
		
		public static void pChoosew2ckey(NString taxYear,NString emprCode,NString seqNo,NString w2cError) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_CHOOSEW2CKEY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TAX_YEAR", taxYear);
			cmd.addParameter("@EMPR_CODE", emprCode);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@W2C_ERROR", w2cError);
				
			cmd.execute();


		}
		
		public static void pChoosew2key(NString w2TaxYear,NString w2Error) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_CHOOSEW2KEY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@W2_TAX_YEAR", w2TaxYear);
			cmd.addParameter("@W2_ERROR", w2Error);
				
			cmd.execute();


		}
		
		public static void pDisplayEmployeeDetails(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_DISPLAY_EMPLOYEE_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pDisplayLockinDetails() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_DISPLAY_LOCKIN_DETAILS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispw4driver(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_DISPW4DRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pPrintPreview(NString inTaxYear,NString inEmprCode,NString inSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_PRINT_PREVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
				
			cmd.execute();


		}
		
		public static void pPrintW2Preview2005(NString inTaxYear,NString inEmprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_PRINT_W2_PREVIEW_2005", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
				
			cmd.execute();


		}
		
		public static void pPrintW2Preview2006(NString inTaxYear,NString inEmprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_PRINT_W2_PREVIEW_2006", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
				
			cmd.execute();


		}
		
		public static void pPrintW2cPreview2005(NNumber inTaxYear,NString inEmprCode,NNumber inSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_PRINT_W2C_PREVIEW_2005", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
				
			cmd.execute();


		}
		
		public static void pPrintW2cPreview2006(NNumber inTaxYear,NString inEmprCode,NNumber inSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_PRINT_W2C_PREVIEW_2006", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
				
			cmd.execute();


		}
		
		public static void pPrintw4(NString pDcdeCode,NString pEmprCode,NString pEffectiveDate,NString pBackLink) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_PRINTW4", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCDE_CODE", pDcdeCode);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_BACK_LINK", pBackLink);
				
			cmd.execute();


		}
		
		public static void pVieww2(NString inTaxYear,NString inEmprCode,NString btnselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_VIEWW2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
			cmd.addParameter("@BTNSELECTED", btnselected);
				
			cmd.execute();


		}
		
		public static void pVieww2Before2001(NString inTaxYear,NString inEmprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_VIEWW2_BEFORE_2001", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
				
			cmd.execute();


		}
		
		public static void pVieww2c(NNumber inTaxYear,NString inEmprCode,NNumber inSeqNo,NString btnselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_VIEWW2C", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
			cmd.addParameter("@BTNSELECTED", btnselected);
				
			cmd.execute();


		}
		
		public static void pVieww2cdriver(NString inTaxYear,NString inEmprCode,NString inSeqNo,NString w2action) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_VIEWW2CDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
			cmd.addParameter("@W2ACTION", w2action);
				
			cmd.execute();


		}
		
		public static void pVieww2driver(NString inTaxYear,NString inEmprCode,NString w2action) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_VIEWW2DRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
			cmd.addParameter("@W2ACTION", w2action);
				
			cmd.execute();


		}
		
		public static void pVieww4() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_VIEWW4", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pW2Certification(NString pTaxYear,NString pEmprCode,NString pSeqNo,NNumber pAttemptno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_W2_CERTIFICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TAX_YEAR", pTaxYear);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ATTEMPTNO", pAttemptno);
				
			cmd.execute();


		}
		
		public static void pW2cCertification(NString pTaxYear,NString pEmprCode,NString pSeqNo,NNumber pAttemptno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_W2C_CERTIFICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TAX_YEAR", pTaxYear);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ATTEMPTNO", pAttemptno);
				
			cmd.execute();


		}
		
		public static void pW2consent(NString srce) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_W2CONSENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SRCE", srce);
				
			cmd.execute();


		}
		
		public static void pW2consentdriver(NString consentInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXS.P_W2CONSENTDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONSENT_IND", consentInd);
				
			cmd.execute();


		}
		
	
	
	
}
