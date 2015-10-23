package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class AbCustomSearchHeaderRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_CUSTOM_SEARCH_HEADER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pSrchName,NString pSrchTitle,NString pActiveInd,NString pProspectOnlyInd,NString pIncludeType,NNumber pRecordsPerPage,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_CUSTOM_SEARCH_HEADER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SRCH_NAME", pSrchName);
			cmd.addParameter("@P_SRCH_TITLE", pSrchTitle);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_PROSPECT_ONLY_IND", pProspectOnlyInd);
			cmd.addParameter("@P_INCLUDE_TYPE", pIncludeType);
			cmd.addParameter("@P_RECORDS_PER_PAGE", pRecordsPerPage);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pSrchName,NString pSrchTitle,NString pActiveInd,NString pProspectOnlyInd,NString pIncludeType,NNumber pRecordsPerPage,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AB_CUSTOM_SEARCH_HEADER_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SRCH_NAME", pSrchName);
			cmd.addParameter("@P_SRCH_TITLE", pSrchTitle);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_PROSPECT_ONLY_IND", pProspectOnlyInd);
			cmd.addParameter("@P_INCLUDE_TYPE", pIncludeType);
			cmd.addParameter("@P_RECORDS_PER_PAGE", pRecordsPerPage);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
