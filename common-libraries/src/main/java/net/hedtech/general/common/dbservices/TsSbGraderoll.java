package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TsSbGraderoll {
		public static void pTsGraderoll(NString pSaveData,NString pSubjCode,NString pCrseNumb,NString pTermCode,NString pTermCode2,NString pTermCode3,NString pTermCode4,NNumber pTestCase) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TS_SB_GRADEROLL.P_TS_GRADEROLL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SAVE_DATA", pSaveData);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_TERM_CODE2", pTermCode2);
			cmd.addParameter("@P_TERM_CODE3", pTermCode3);
			cmd.addParameter("@P_TERM_CODE4", pTermCode4);
			cmd.addParameter("@P_TEST_CASE", pTestCase);
				
			cmd.execute();


		}
		
	
	
	
}
