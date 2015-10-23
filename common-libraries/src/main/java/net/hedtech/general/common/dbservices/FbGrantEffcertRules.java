package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbGrantEffcertRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_GRANT_EFFCERT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pId,NString pCoasCode,NString pGrntCode,NString pAcctElement,NString pAcctElementValue,NString pReportSection,NString pChargeType,NString pUserId,NString pEccgCode,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_GRANT_EFFCERT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_GRNT_CODE", pGrntCode);
			cmd.addParameter("@P_ACCT_ELEMENT", pAcctElement);
			cmd.addParameter("@P_ACCT_ELEMENT_VALUE", pAcctElementValue);
			cmd.addParameter("@P_REPORT_SECTION", pReportSection);
			cmd.addParameter("@P_CHARGE_TYPE", pChargeType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ECCG_CODE", pEccgCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pCoasCode,NString pGrntCode,NString pAcctElement,NString pAcctElementValue,NString pReportSection,NString pChargeType,NString pUserId,NString pEccgCode,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_GRANT_EFFCERT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_GRNT_CODE", pGrntCode);
			cmd.addParameter("@P_ACCT_ELEMENT", pAcctElement);
			cmd.addParameter("@P_ACCT_ELEMENT_VALUE", pAcctElementValue);
			cmd.addParameter("@P_REPORT_SECTION", pReportSection);
			cmd.addParameter("@P_CHARGE_TYPE", pChargeType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ECCG_CODE", pEccgCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
