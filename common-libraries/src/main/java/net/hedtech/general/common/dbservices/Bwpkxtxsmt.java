package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkxtxsmt {
		public static NString fAppendSpaces(NString pLabel,NNumber pSpaceCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXSMT.F_APPEND_SPACES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LABEL", pLabel);
			cmd.addParameter("@P_SPACE_COUNT", pSpaceCount);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTaxoptcodedesc(NString inOptName,NString inTitle,NString inBdtyCode,NString inTxcdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXSMT.F_TAXOPTCODEDESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_OPT_NAME", inOptName);
			cmd.addParameter("@IN_TITLE", inTitle);
			cmd.addParameter("@IN_BDTY_CODE", inBdtyCode);
			cmd.addParameter("@IN_TXCD_CODE", inTxcdCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTaxoptcodevalue(NString inOptName,NString inValue,NString inBdtyCode,NString inTxcdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXSMT.F_TAXOPTCODEVALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_OPT_NAME", inOptName);
			cmd.addParameter("@IN_VALUE", inValue);
			cmd.addParameter("@IN_BDTY_CODE", inBdtyCode);
			cmd.addParameter("@IN_TXCD_CODE", inTxcdCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pChoosetaxoptcode(NString inOptName,NString inReqInd,NString inFieldName,NString inFieldTag,NString inValue,NString inBdtyCode,NString inTxcdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXSMT.P_CHOOSETAXOPTCODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_OPT_NAME", inOptName);
			cmd.addParameter("@IN_REQ_IND", inReqInd);
			cmd.addParameter("@IN_FIELD_NAME", inFieldName);
			cmd.addParameter("@IN_FIELD_TAG", inFieldTag);
			cmd.addParameter("@IN_VALUE", inValue);
			cmd.addParameter("@IN_BDTY_CODE", inBdtyCode);
			cmd.addParameter("@IN_TXCD_CODE", inTxcdCode);
				
			cmd.execute();


		}
		
		public static void pChoosew2ckey() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXSMT.P_CHOOSEW2CKEY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pChoosew2key() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXSMT.P_CHOOSEW2KEY", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispw4driver(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXSMT.P_DISPW4DRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pPrintCss() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXSMT.P_PRINT_CSS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPrintPrinterCss() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXSMT.P_PRINT_PRINTER_CSS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pVieww2(NString inTaxYear,NString inEmprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXSMT.P_VIEWW2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
				
			cmd.execute();


		}
		
		public static void pVieww2Before2001(NString inTaxYear,NString inEmprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXSMT.P_VIEWW2_BEFORE_2001", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
				
			cmd.execute();


		}
		
		public static void pVieww2c(NNumber inTaxYear,NString inEmprCode,NNumber inSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXSMT.P_VIEWW2C", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
				
			cmd.execute();


		}
		
		public static void pVieww2cdriver(NNumber inTaxYear,NString inEmprCode,NNumber inSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXSMT.P_VIEWW2CDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
				
			cmd.execute();


		}
		
		public static void pVieww2driver(NString inTaxYear,NString inEmprCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXSMT.P_VIEWW2DRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
				
			cmd.execute();


		}
		
		public static void pVieww4() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXSMT.P_VIEWW4", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pW2consent() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXSMT.P_W2CONSENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pW2consentdriver(NString consentInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKXTXSMT.P_W2CONSENTDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONSENT_IND", consentInd);
				
			cmd.execute();


		}
		
	
	
	
}
