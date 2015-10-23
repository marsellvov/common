package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbIntegConfigRules {
		public static NString fValidSettingValue(NString pSqprCode,NString pIcsnCode,NString pValue,Ref<NString> pDescOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INTEG_CONFIG_RULES.F_VALID_SETTING_VALUE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SQPR_CODE", pSqprCode);
			cmd.addParameter("@P_ICSN_CODE", pIcsnCode);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_DESC_OUT", NString.class);
				
			cmd.execute();
			pDescOut.val = cmd.getParameterValue("@P_DESC_OUT", NString.class);

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INTEG_CONFIG_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pSqprCode,NString pIcsnCode,NString pValue,NString pUserId,NString pValueDesc,NNumber pSeqNo,NString pTranslationValue,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INTEG_CONFIG_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_SQPR_CODE", pSqprCode);
			cmd.addParameter("@P_ICSN_CODE", pIcsnCode);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VALUE_DESC", pValueDesc);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_TRANSLATION_VALUE", pTranslationValue);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pSqprCode,NString pIcsnCode,NString pValue,NString pUserId,NString pValueDesc,NNumber pSeqNo,NString pTranslationValue,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_INTEG_CONFIG_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SQPR_CODE", pSqprCode);
			cmd.addParameter("@P_ICSN_CODE", pIcsnCode);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VALUE_DESC", pValueDesc);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_TRANSLATION_VALUE", pTranslationValue);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
	
	
	
}
