package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbUserdefaultRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERDEFAULT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pFgacUserId,NString pExemptInd,NString pCrossDomainInd,NString pUserId,NString pFdmnCode,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERDEFAULT_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_EXEMPT_IND", pExemptInd);
			cmd.addParameter("@P_CROSS_DOMAIN_IND", pCrossDomainInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pFgacUserId,NString pExemptInd,NString pCrossDomainInd,NString pUserId,NString pFdmnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERDEFAULT_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_EXEMPT_IND", pExemptInd);
			cmd.addParameter("@P_CROSS_DOMAIN_IND", pCrossDomainInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
				
			cmd.execute();


		}
		
	
	
	
}
