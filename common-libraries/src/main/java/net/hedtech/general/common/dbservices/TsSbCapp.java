package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TsSbCapp {
		public static void pTsCapp(NString pSaveData,NString pPrintDetail,NString pShowDelErrs,NString pPrintXml,NString pTermCode,NString pSubjCode,NDate pActdate,NNumber pTestCase) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TS_SB_CAPP.P_TS_CAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SAVE_DATA", pSaveData);
			cmd.addParameter("@P_PRINT_DETAIL", pPrintDetail);
			cmd.addParameter("@P_SHOW_DEL_ERRS", pShowDelErrs);
			cmd.addParameter("@P_PRINT_XML", pPrintXml);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_ACTDATE", pActdate);
			cmd.addParameter("@P_TEST_CASE", pTestCase);
				
			cmd.execute();


		}
		
		public static void pWait3secs() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TS_SB_CAPP.P_WAIT_3SECS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
