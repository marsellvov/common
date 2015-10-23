package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TsSbFeeassessmentRbt {
		public static void pTsFeeassessmentRbt(NString pSaveData,NString pPrintDetail,NString pTermCode,NString pSubjCode,NDate pActdate,NNumber pTestCase) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TS_SB_FEEASSESSMENT_RBT.P_TS_FEEASSESSMENT_RBT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SAVE_DATA", pSaveData);
			cmd.addParameter("@P_PRINT_DETAIL", pPrintDetail);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_ACTDATE", pActdate);
			cmd.addParameter("@P_TEST_CASE", pTestCase);
				
			cmd.execute();


		}
		
	
	
	
}
