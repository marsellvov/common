package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbPublicationRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PUBLICATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pPubtCode,NString pTitle,NString pPublisher,NDate pPubDate,NString pIssue,NString pVolume,NString pPages,NString pDataOrigin,NString pUserId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PUBLICATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PUBT_CODE", pPubtCode);
			cmd.addParameter("@P_TITLE", pTitle);
			cmd.addParameter("@P_PUBLISHER", pPublisher);
			cmd.addParameter("@P_PUB_DATE", pPubDate);
			cmd.addParameter("@P_ISSUE", pIssue);
			cmd.addParameter("@P_VOLUME", pVolume);
			cmd.addParameter("@P_PAGES", pPages);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pPubtCode,NString pTitle,NString pPublisher,NDate pPubDate,NString pIssue,NString pVolume,NString pPages,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PUBLICATION_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PUBT_CODE", pPubtCode);
			cmd.addParameter("@P_TITLE", pTitle);
			cmd.addParameter("@P_PUBLISHER", pPublisher);
			cmd.addParameter("@P_PUB_DATE", pPubDate);
			cmd.addParameter("@P_ISSUE", pIssue);
			cmd.addParameter("@P_VOLUME", pVolume);
			cmd.addParameter("@P_PAGES", pPages);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
