package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbCmDataDictionaryRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DATA_DICTIONARY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTable,NString pColumnName,NString pElement,NNumber pMaxLength,NString pOverrideLengthInd,NString pAllowNegLengthInd,NString pOnlineMatchInd,NString pSysReqInd,NString pElementReqInd,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DATA_DICTIONARY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ELEMENT", pElement);
			cmd.addParameter("@P_MAX_LENGTH", pMaxLength);
			cmd.addParameter("@P_OVERRIDE_LENGTH_IND", pOverrideLengthInd);
			cmd.addParameter("@P_ALLOW_NEG_LENGTH_IND", pAllowNegLengthInd);
			cmd.addParameter("@P_ONLINE_MATCH_IND", pOnlineMatchInd);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_ELEMENT_REQ_IND", pElementReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pTable,NString pColumnName,NString pElement,NNumber pMaxLength,NString pOverrideLengthInd,NString pAllowNegLengthInd,NString pOnlineMatchInd,NString pSysReqInd,NString pElementReqInd,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DATA_DICTIONARY_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ELEMENT", pElement);
			cmd.addParameter("@P_MAX_LENGTH", pMaxLength);
			cmd.addParameter("@P_OVERRIDE_LENGTH_IND", pOverrideLengthInd);
			cmd.addParameter("@P_ALLOW_NEG_LENGTH_IND", pAllowNegLengthInd);
			cmd.addParameter("@P_ONLINE_MATCH_IND", pOnlineMatchInd);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_ELEMENT_REQ_IND", pElementReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
