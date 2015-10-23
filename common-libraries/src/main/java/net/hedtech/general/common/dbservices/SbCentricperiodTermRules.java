package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbCentricperiodTermRules {
		public static NString fCheckScptCycleCode(NString pScpsCode,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CENTRICPERIOD_TERM_RULES.F_CHECK_SCPT_CYCLE_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCPS_CODE", pScpsCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSfrstshExists(NString pScpsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CENTRICPERIOD_TERM_RULES.F_SFRSTSH_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCPS_CODE", pScpsCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSfrstslExists(NString pScpsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CENTRICPERIOD_TERM_RULES.F_SFRSTSL_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCPS_CODE", pScpsCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSfrststExists(NString pScpsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CENTRICPERIOD_TERM_RULES.F_SFRSTST_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCPS_CODE", pScpsCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSgbstdnExists(NString pScpsCode,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CENTRICPERIOD_TERM_RULES.F_SGBSTDN_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCPS_CODE", pScpsCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fShrassrExists(NString pScpsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CENTRICPERIOD_TERM_RULES.F_SHRASSR_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCPS_CODE", pScpsCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fShrsgpaExists(NString pScpsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CENTRICPERIOD_TERM_RULES.F_SHRSGPA_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCPS_CODE", pScpsCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fShrttrmExists(NString pScpsCode,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CENTRICPERIOD_TERM_RULES.F_SHRTTRM_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCPS_CODE", pScpsCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSorcscpExists(NString pScpsCode,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CENTRICPERIOD_TERM_RULES.F_SORCSCP_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SCPS_CODE", pScpsCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CENTRICPERIOD_TERM_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pScpsCode,NString pTermCode,NString pUserId,NString pDataOrigin,NString pTermControlInd,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CENTRICPERIOD_TERM_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_SCPS_CODE", pScpsCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TERM_CONTROL_IND", pTermControlInd);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pScpsCode,NString pTermCode,NString pUserId,NString pDataOrigin,NString pTermControlInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CENTRICPERIOD_TERM_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SCPS_CODE", pScpsCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TERM_CONTROL_IND", pTermControlInd);
				
			cmd.execute();


		}
		
	
	
	
}
