package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokorgn {
		public static NString fGetOrgnDesc(NString orgnIn,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKORGN.F_GET_ORGN_DESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ORGN_IN", orgnIn);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fGetPredecessorOrgnsCv(NString pOrgnCode,NString pCoasCode,NDate pAsofDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKORGN.F_GET_PREDECESSOR_ORGNS_CV", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ASOF_DATE", pAsofDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fGetSuccessorOrgns(NString pOrgnCode,NString pOrgnLevelStr,NString pCoasCode,NDate pAsofDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKORGN.F_GET_SUCCESSOR_ORGNS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ORGN_LEVEL_STR", pOrgnLevelStr);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ASOF_DATE", pAsofDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fValidFinRollupOrgns(NString pUserId,NString pModuleType,NString pCoasCode,NDate pAsofDate,NString pAccessType,NString pExtract,NString pScenario,NString pTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKORGN.F_VALID_FIN_ROLLUP_ORGNS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MODULE_TYPE", pModuleType);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ASOF_DATE", pAsofDate);
			cmd.addParameter("@P_ACCESS_TYPE", pAccessType);
			cmd.addParameter("@P_EXTRACT", pExtract);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_TERM", pTerm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fValidHrRollupOrgns(NString pUserId,NString pModuleType,NString pExtract,NString pScenario,NString pTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKORGN.F_VALID_HR_ROLLUP_ORGNS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MODULE_TYPE", pModuleType);
			cmd.addParameter("@P_EXTRACT", pExtract);
			cmd.addParameter("@P_SCENARIO", pScenario);
			cmd.addParameter("@P_TERM", pTerm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
	
	
	
}
