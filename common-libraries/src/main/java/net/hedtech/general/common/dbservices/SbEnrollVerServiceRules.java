package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEnrollVerServiceRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_SERVICE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pEprtCode,NString pWssoCode,NString pAcctTypeCde,NString pDataOrigin,NString pUserId,NNumber pCharge,NString pChargePerCde,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_SERVICE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_EPRT_CODE", pEprtCode);
			cmd.addParameter("@P_WSSO_CODE", pWssoCode);
			cmd.addParameter("@P_ACCT_TYPE_CDE", pAcctTypeCde);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CHARGE", pCharge);
			cmd.addParameter("@P_CHARGE_PER_CDE", pChargePerCde);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pEprtCode,NString pWssoCode,NString pAcctTypeCde,NString pDataOrigin,NString pUserId,NNumber pCharge,NString pChargePerCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLL_VER_SERVICE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EPRT_CODE", pEprtCode);
			cmd.addParameter("@P_WSSO_CODE", pWssoCode);
			cmd.addParameter("@P_ACCT_TYPE_CDE", pAcctTypeCde);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CHARGE", pCharge);
			cmd.addParameter("@P_CHARGE_PER_CDE", pChargePerCde);
				
			cmd.execute();


		}
		
	
	
	
}
