package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbPinAnswerRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PIN_ANSWER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NNumber pNum,NString pGobqstnId,NString pQstnDesc,NString pAnsrDesc,NString pAnsrSalt,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PIN_ANSWER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_GOBQSTN_ID", pGobqstnId);
			cmd.addParameter("@P_QSTN_DESC", pQstnDesc);
			cmd.addParameter("@P_ANSR_DESC", pAnsrDesc);
			cmd.addParameter("@P_ANSR_SALT", pAnsrSalt);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NNumber pNum,NString pGobqstnId,NString pQstnDesc,NString pAnsrDesc,NString pAnsrSalt,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PIN_ANSWER_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_NUM", pNum);
			cmd.addParameter("@P_GOBQSTN_ID", pGobqstnId);
			cmd.addParameter("@P_QSTN_DESC", pQstnDesc);
			cmd.addParameter("@P_ANSR_DESC", pAnsrDesc);
			cmd.addParameter("@P_ANSR_SALT", pAnsrSalt);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
