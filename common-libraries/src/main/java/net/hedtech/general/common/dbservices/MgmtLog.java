package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class MgmtLog {
		public static void logError(NString vModuleNameIn,NNumber vErrorCodeIn,NString vErrorMsgIn,NString vFacilityIn,NString vClientDataIn,NString vOmsUrlIn,NString vEmdUrlIn,NString vLogLevelIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_LOG.LOG_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_MODULE_NAME_IN", vModuleNameIn);
			cmd.addParameter("@V_ERROR_CODE_IN", vErrorCodeIn);
			cmd.addParameter("@V_ERROR_MSG_IN", vErrorMsgIn);
			cmd.addParameter("@V_FACILITY_IN", vFacilityIn);
			cmd.addParameter("@V_CLIENT_DATA_IN", vClientDataIn);
			cmd.addParameter("@V_OMS_URL_IN", vOmsUrlIn);
			cmd.addParameter("@V_EMD_URL_IN", vEmdUrlIn);
			cmd.addParameter("@V_LOG_LEVEL_IN", vLogLevelIn);
				
			cmd.execute();


		}
		
		public static void logPerformance(NString vJobNameIn,NNumber vDurationIn,NDate vTimeIn,NString vIsTotalIn,NString vNameIn,NString vValueIn,NString vModuleIn,NString vActionIn,NString vClientDataIn,NString vOmsUrlIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_LOG.LOG_PERFORMANCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_JOB_NAME_IN", vJobNameIn);
			cmd.addParameter("@V_DURATION_IN", vDurationIn);
			cmd.addParameter("@V_TIME_IN", vTimeIn);
			cmd.addParameter("@V_IS_TOTAL_IN", vIsTotalIn);
			cmd.addParameter("@V_NAME_IN", vNameIn);
			cmd.addParameter("@V_VALUE_IN", vValueIn);
			cmd.addParameter("@V_MODULE_IN", vModuleIn);
			cmd.addParameter("@V_ACTION_IN", vActionIn);
			cmd.addParameter("@V_CLIENT_DATA_IN", vClientDataIn);
			cmd.addParameter("@V_OMS_URL_IN", vOmsUrlIn);
				
			cmd.execute();


		}
		
		public static void registerLoggingModule(NString vJobNameIn,NString vDisplayNameIn,NString vDbmsJobnameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("MGMT_LOG.REGISTER_LOGGING_MODULE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_JOB_NAME_IN", vJobNameIn);
			cmd.addParameter("@V_DISPLAY_NAME_IN", vDisplayNameIn);
			cmd.addParameter("@V_DBMS_JOBNAME_IN", vDbmsJobnameIn);
				
			cmd.execute();


		}
		
	
	
	
}
