package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwgcbref {
		public static DataCursor fGetJobs(NString usernameIn,NNumber maxdaysIn,NNumber jobStart,NNumber jobCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGCBREF.F_GET_JOBS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@USERNAME_IN", usernameIn);
			cmd.addParameter("@MAXDAYS_IN", maxdaysIn);
			cmd.addParameter("@JOB_START", jobStart);
			cmd.addParameter("@JOB_COUNT", jobCount);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NNumber fGetJobsCount(NString usernameIn,NNumber maxdaysIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGCBREF.F_GET_JOBS_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@USERNAME_IN", usernameIn);
			cmd.addParameter("@MAXDAYS_IN", maxdaysIn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fGetRaceInfo(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGCBREF.F_GET_RACE_INFO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	@DbRecordType(id="GuboutpJobRecRow", dataSourceName="GUBOUTP_JOB_REC")
	public static class GuboutpJobRecRow
	{
		@DbRecordField(dataSourceName="R_GUBOUTP_JOB")
		public NString RGuboutpJob;
		@DbRecordField(dataSourceName="R_GUBOUTP_FILE_NAME")
		public NString RGuboutpFileName;
		@DbRecordField(dataSourceName="R_GUBOUTP_DATE_SAVED")
		public NDate RGuboutpDateSaved;
		@DbRecordField(dataSourceName="R_GUBOUTP_ONE_UP_NO")
		public NNumber RGuboutpOneUpNo;
	}

	
	
}
