package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class UtGraderoll {
		public static void pUtGraderoll(NString pSaveData,NString pSubjCode,NString pCrseNumb) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("UT_GRADEROLL.P_UT_GRADEROLL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SAVE_DATA", pSaveData);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
				
			cmd.execute();


		}
		
	
	
	
}
