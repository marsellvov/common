package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Smkcgpa {
		public static NNumber fAreaGpa(NString pidm,NNumber requestNo,NString areaCode,NString areaLevel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKCGPA.F_AREA_GPA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@REQUEST_NO", requestNo);
			cmd.addParameter("@AREA_CODE", areaCode);
			cmd.addParameter("@AREA_LEVEL", areaLevel);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCumProgramGpa(NString pidm,NString programLevel,NString minTermCode,NString maxTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKCGPA.F_CUM_PROGRAM_GPA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@PROGRAM_LEVEL", programLevel);
			cmd.addParameter("@MIN_TERM_CODE", minTermCode);
			cmd.addParameter("@MAX_TERM_CODE", maxTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fProgramGpa(NString pidm,NNumber requestNo,NString programCode,NString programLevel) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SMKCGPA.F_PROGRAM_GPA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@REQUEST_NO", requestNo);
			cmd.addParameter("@PROGRAM_CODE", programCode);
			cmd.addParameter("@PROGRAM_LEVEL", programLevel);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
