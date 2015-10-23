package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbMassEntryColumnRules {
		public static NString fParentExists(NString pFormName,NString pAddUserId,NDate pAddDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY_COLUMN_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY_COLUMN_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAddUserId,NDate pAddDate,NString pFormName,NString pDataOrigin,NString pUserId,NString pMeclCode,NString pSearchUpdateCde,NString pValue,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY_COLUMN_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MECL_CODE", pMeclCode);
			cmd.addParameter("@P_SEARCH_UPDATE_CDE", pSearchUpdateCde);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAddUserId,NDate pAddDate,NString pFormName,NString pDataOrigin,NString pUserId,NString pMeclCode,NString pSearchUpdateCde,NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY_COLUMN_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MECL_CODE", pMeclCode);
			cmd.addParameter("@P_SEARCH_UPDATE_CDE", pSearchUpdateCde);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();


		}
		
	
	
	
}
