package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pxktaxs {
		public static void pPrintW4Preview(NDate pEffectiveDate,NString pEmprCode,NString pDedCode,NNumber pPidm,NString pAccessBy,NString pBackLink) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKTAXS.P_PRINT_W4_PREVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_DED_CODE", pDedCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ACCESS_BY", pAccessBy);
			cmd.addParameter("@P_BACK_LINK", pBackLink);
				
			cmd.execute();


		}
		
		public static void pW4PrinterCss() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKTAXS.P_W4_PRINTER_CSS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pW4ScreenCss() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKTAXS.P_W4_SCREEN_CSS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
