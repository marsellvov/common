package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbFacNilrateRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NILRATE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTermCodeEff,NString pFcntCode,NString pNistCode,NString pFlclCode,NNumber pRate,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NILRATE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_NIST_CODE", pNistCode);
			cmd.addParameter("@P_FLCL_CODE", pFlclCode);
			cmd.addParameter("@P_RATE", pRate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pTermCodeEff,NString pFcntCode,NString pNistCode,NString pFlclCode,NNumber pRate,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_NILRATE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_NIST_CODE", pNistCode);
			cmd.addParameter("@P_FLCL_CODE", pFlclCode);
			cmd.addParameter("@P_RATE", pRate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
