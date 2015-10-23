package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbPaymentTypeRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PAYMENT_TYPE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pType,NString pCode,NString pAmountMethod,NString pStartDateMethod,NString pEndDateMethod,NString pPeriodMethod,NString pUserId,NString pDataOrigin, NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PAYMENT_TYPE_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_AMOUNT_METHOD", pAmountMethod);			
			cmd.addParameter("@P_START_DATE_METHOD", pStartDateMethod);
			cmd.addParameter("@P_END_DATE_METHOD", pEndDateMethod);
			cmd.addParameter("@P_PERIOD_METHOD", pPeriodMethod);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pType,NString pCode,NString pAmountMethod,NString pStartDateMethod,NString pEndDateMethod,NString pPeriodMethod,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_PAYMENT_TYPE_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_AMOUNT_METHOD", pAmountMethod);			
			cmd.addParameter("@P_START_DATE_METHOD", pStartDateMethod);
			cmd.addParameter("@P_END_DATE_METHOD", pEndDateMethod);
			cmd.addParameter("@P_PERIOD_METHOD", pPeriodMethod);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
	
	
}
