package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TsSbCurriculum {
		public static void pTsCurriculum(NString pSaveData,NString pTermCode,NString pTermCode2,NString pTermCode3,NString pTermCode4,NNumber pTestCase,NNumber pTcPidm,NString pTcLmod,NString pTcBackcheck,NString pPrintDetails,NString pCreatePopsel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TS_SB_CURRICULUM.P_TS_CURRICULUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SAVE_DATA", pSaveData);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_TERM_CODE2", pTermCode2);
			cmd.addParameter("@P_TERM_CODE3", pTermCode3);
			cmd.addParameter("@P_TERM_CODE4", pTermCode4);
			cmd.addParameter("@P_TEST_CASE", pTestCase);
			cmd.addParameter("@P_TC_PIDM", pTcPidm);
			cmd.addParameter("@P_TC_LMOD", pTcLmod);
			cmd.addParameter("@P_TC_BACKCHECK", pTcBackcheck);
			cmd.addParameter("@P_PRINT_DETAILS", pPrintDetails);
			cmd.addParameter("@P_CREATE_POPSEL", pCreatePopsel);
				
			cmd.execute();


		}
		
	
	
	
}
