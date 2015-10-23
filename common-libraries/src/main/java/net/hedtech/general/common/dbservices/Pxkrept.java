package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pxkrept {
		public static void pDeleteReportData(NString reportCode2,NString year2,NNumber startMonth2,NNumber endMonth2,NString emprCode2,NNumber pidm2,NString rboxCode2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKREPT.P_DELETE_REPORT_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REPORT_CODE_2", reportCode2);
			cmd.addParameter("@YEAR_2", year2);
			cmd.addParameter("@START_MONTH_2", startMonth2);
			cmd.addParameter("@END_MONTH_2", endMonth2);
			cmd.addParameter("@EMPR_CODE_2", emprCode2);
			cmd.addParameter("@PIDM_2", pidm2);
			cmd.addParameter("@RBOX_CODE_2", rboxCode2);
				
			cmd.execute();


		}
		
		public static void pInsertReportData(NString reportCode,NString year,NNumber startMonth,NNumber endMonth,NString emprCode,NNumber pidm,NString rboxCode,NString sessionId,NNumber amount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKREPT.P_INSERT_REPORT_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@REPORT_CODE", reportCode);
			cmd.addParameter("@YEAR", year);
			cmd.addParameter("@START_MONTH", startMonth);
			cmd.addParameter("@END_MONTH", endMonth);
			cmd.addParameter("@EMPR_CODE", emprCode);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@RBOX_CODE", rboxCode);
			cmd.addParameter("@SESSION_ID", sessionId);
			cmd.addParameter("@AMOUNT", amount);
				
			cmd.execute();


		}
		
	
	
	
}
