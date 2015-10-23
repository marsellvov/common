package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbFacassignmentRules {
		public static NString fCheckAssignments(NString pTermCode,NString pCrn,NNumber pPidm,NString pCategory) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACASSIGNMENT_RULES.F_CHECK_ASSIGNMENTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CATEGORY", pCategory);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckSsrmeetSession(NString pTermCode,NString pCrn,NString pCategory) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACASSIGNMENT_RULES.F_CHECK_SSRMEET_SESSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetSession(NString pCrn,NString pTermCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACASSIGNMENT_RULES.F_GET_SESSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fParentExists(NString pTermCode,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACASSIGNMENT_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACASSIGNMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTermCode,NString pCrn,NNumber pPidm,NString pCategory,NNumber pPercentResponse,NNumber pWorkloadAdjust,NNumber pPercentSess,NString pPrimaryInd,NString pOverRide,NNumber pPosition,NString pFcntCode,NString pPosn,NString pSuff,NString pAstyCode,NString pDataOrigin,NString pUserId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACASSIGNMENT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_PERCENT_RESPONSE", pPercentResponse);
			cmd.addParameter("@P_WORKLOAD_ADJUST", pWorkloadAdjust);
			cmd.addParameter("@P_PERCENT_SESS", pPercentSess);
			cmd.addParameter("@P_PRIMARY_IND", pPrimaryInd);
			cmd.addParameter("@P_OVER_RIDE", pOverRide);
			cmd.addParameter("@P_POSITION", pPosition);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_ASTY_CODE", pAstyCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pTermCode,NString pCrn,NNumber pPidm,NString pCategory,NNumber pPercentResponse,NNumber pWorkloadAdjust,NNumber pPercentSess,NString pPrimaryInd,NString pOverRide,NNumber pPosition,NString pFcntCode,NString pPosn,NString pSuff,NString pAstyCode,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACASSIGNMENT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_PERCENT_RESPONSE", pPercentResponse);
			cmd.addParameter("@P_WORKLOAD_ADJUST", pWorkloadAdjust);
			cmd.addParameter("@P_PERCENT_SESS", pPercentSess);
			cmd.addParameter("@P_PRIMARY_IND", pPrimaryInd);
			cmd.addParameter("@P_OVER_RIDE", pOverRide);
			cmd.addParameter("@P_POSITION", pPosition);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_ASTY_CODE", pAstyCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
