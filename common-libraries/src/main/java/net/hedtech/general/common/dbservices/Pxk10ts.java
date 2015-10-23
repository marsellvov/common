package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pxk10ts {
//		public static void pGetW2c(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,Ref<List<W2TabtypeRow>> pFormTableOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXK10TS.P_GET_W2C", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_YEAR", pYear);
//			cmd.addParameter("@P_QUARTER", pQuarter);
//			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_SEQ_NO", pSeqNo);
//			// cmd.addParameter(DbTypes.getTableType("P_FORM_TABLE_OUT", "", object.class));
//				
//			cmd.execute();
//			// pFormTableOut.val = cmd.getTableParameterValue("@P_FORM_TABLE_OUT", object.class);
//
//
//		}
		
		public static void pPrintW2Preview2010(NString inTaxYear,NString inEmprCode,NNumber pPidm,NString pRole) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXK10TS.P_PRINT_W2_PREVIEW_2010", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROLE", pRole);
				
			cmd.execute();


		}
		
		public static void pPrintW2cPreview2010(NNumber inTaxYear,NString inEmprCode,NNumber inSeqNo,NNumber pPidm,NString pRole) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXK10TS.P_PRINT_W2C_PREVIEW_2010", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_TAX_YEAR", inTaxYear);
			cmd.addParameter("@IN_EMPR_CODE", inEmprCode);
			cmd.addParameter("@IN_SEQ_NO", inSeqNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROLE", pRole);
				
			cmd.execute();


		}
		
		public static void pW2PrinterCss() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXK10TS.P_W2_PRINTER_CSS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pW2ScreenCss() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXK10TS.P_W2_SCREEN_CSS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pW2cPrinterCss() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXK10TS.P_W2C_PRINTER_CSS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pW2cScreenCss() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXK10TS.P_W2C_SCREEN_CSS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
