package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvPersParticipantInfoRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_PARTICIPANT_INFO_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pBatch,NString pPersEmployerId,NString pProgramType,NString pReportType,NNumber pPidm,NString pPersParticipantId,NString pLastName,NString pFirstName,NString pUserId,NString pMiddleName,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_PARTICIPANT_INFO_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_PERS_EMPLOYER_ID", pPersEmployerId);
			cmd.addParameter("@P_PROGRAM_TYPE", pProgramType);
			cmd.addParameter("@P_REPORT_TYPE", pReportType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERS_PARTICIPANT_ID", pPersParticipantId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MIDDLE_NAME", pMiddleName);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pBatch,NString pPersEmployerId,NString pProgramType,NString pReportType,NNumber pPidm,NString pPersParticipantId,NString pLastName,NString pFirstName,NString pUserId,NString pMiddleName,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_PERS_PARTICIPANT_INFO_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BATCH", pBatch);
			cmd.addParameter("@P_PERS_EMPLOYER_ID", pPersEmployerId);
			cmd.addParameter("@P_PROGRAM_TYPE", pProgramType);
			cmd.addParameter("@P_REPORT_TYPE", pReportType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERS_PARTICIPANT_ID", pPersParticipantId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MIDDLE_NAME", pMiddleName);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
