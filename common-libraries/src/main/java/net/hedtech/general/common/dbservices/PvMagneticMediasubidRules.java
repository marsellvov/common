package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvMagneticMediasubidRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MAGNETIC_MEDIASUBID_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pId,NString pReptCode,NString pYear,NString pTypeCode,NString pUserId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MAGNETIC_MEDIASUBID_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_TYPE_CODE", pTypeCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pId,NString pReptCode,NString pYear,NString pTypeCode,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MAGNETIC_MEDIASUBID_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_TYPE_CODE", pTypeCode);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
