package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PtRoeContactRulesRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PT_ROE_CONTACT_RULES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pEmprCode,NString pContactLanguageInd,NNumber pContactPidm,NString pContactTeleAreaCode,NString pContactTeleNumber,NNumber pIssuingPidm,NString pIssuingTeleAreaCode,NString pIssuingTeleNumber,NString pUserId,NString pContactTeleExt,NString pIssusingTeleExt,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PT_ROE_CONTACT_RULES_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_CONTACT_LANGUAGE_IND", pContactLanguageInd);
			cmd.addParameter("@P_CONTACT_PIDM", pContactPidm);
			cmd.addParameter("@P_CONTACT_TELE_AREA_CODE", pContactTeleAreaCode);
			cmd.addParameter("@P_CONTACT_TELE_NUMBER", pContactTeleNumber);
			cmd.addParameter("@P_ISSUING_PIDM", pIssuingPidm);
			cmd.addParameter("@P_ISSUING_TELE_AREA_CODE", pIssuingTeleAreaCode);
			cmd.addParameter("@P_ISSUING_TELE_NUMBER", pIssuingTeleNumber);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CONTACT_TELE_EXT", pContactTeleExt);
			cmd.addParameter("@P_ISSUSING_TELE_EXT", pIssusingTeleExt);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pEmprCode,NString pContactLanguageInd,NNumber pContactPidm,NString pContactTeleAreaCode,NString pContactTeleNumber,NNumber pIssuingPidm,NString pIssuingTeleAreaCode,NString pIssuingTeleNumber,NString pUserId,NString pContactTeleExt,NString pIssusingTeleExt,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PT_ROE_CONTACT_RULES_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_CONTACT_LANGUAGE_IND", pContactLanguageInd);
			cmd.addParameter("@P_CONTACT_PIDM", pContactPidm);
			cmd.addParameter("@P_CONTACT_TELE_AREA_CODE", pContactTeleAreaCode);
			cmd.addParameter("@P_CONTACT_TELE_NUMBER", pContactTeleNumber);
			cmd.addParameter("@P_ISSUING_PIDM", pIssuingPidm);
			cmd.addParameter("@P_ISSUING_TELE_AREA_CODE", pIssuingTeleAreaCode);
			cmd.addParameter("@P_ISSUING_TELE_NUMBER", pIssuingTeleNumber);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CONTACT_TELE_EXT", pContactTeleExt);
			cmd.addParameter("@P_ISSUSING_TELE_EXT", pIssusingTeleExt);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
