package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbApplicationDecisionRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_APPLICATION_DECISION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pTermCodeEntry,NNumber pApplNo,NNumber pSeqNo,NDate pApdcDate,NString pApdcCode,NString pMaintInd,NString pUser,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_APPLICATION_DECISION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_ENTRY", pTermCodeEntry);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_APDC_DATE", pApdcDate);
			cmd.addParameter("@P_APDC_CODE", pApdcCode);
			cmd.addParameter("@P_MAINT_IND", pMaintInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pTermCodeEntry,NNumber pApplNo,NNumber pSeqNo,NDate pApdcDate,NString pApdcCode,NString pMaintInd,NString pUser,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_APPLICATION_DECISION_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_ENTRY", pTermCodeEntry);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_APDC_DATE", pApdcDate);
			cmd.addParameter("@P_APDC_CODE", pApdcCode);
			cmd.addParameter("@P_MAINT_IND", pMaintInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
