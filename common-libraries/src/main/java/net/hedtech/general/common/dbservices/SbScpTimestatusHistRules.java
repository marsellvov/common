package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbScpTimestatusHistRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_TIMESTATUS_HIST_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pScpsCode,NString pTmstCode,NDate pTmstDate,NString pTmstMaintInd,NString pUser,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_TIMESTATUS_HIST_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SCPS_CODE", pScpsCode);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_TMST_DATE", pTmstDate);
			cmd.addParameter("@P_TMST_MAINT_IND", pTmstMaintInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pScpsCode,NString pTmstCode,NDate pTmstDate,NString pTmstMaintInd,NString pUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_SCP_TIMESTATUS_HIST_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SCPS_CODE", pScpsCode);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_TMST_DATE", pTmstDate);
			cmd.addParameter("@P_TMST_MAINT_IND", pTmstMaintInd);
			cmd.addParameter("@P_USER", pUser);
				
			cmd.execute();


		}
		
	
	
	
}
