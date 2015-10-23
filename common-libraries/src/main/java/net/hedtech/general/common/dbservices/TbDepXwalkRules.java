package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbDepXwalkRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEP_XWALK_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pDtypCode,NString pBaseCode,NString pDepositCode,NString pPaymentCode,NString pUserId,NNumber pSurrogateId,NNumber pVersion,NString pVpdiCode,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEP_XWALK_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_BASE_CODE", pBaseCode);
			cmd.addParameter("@P_DEPOSIT_CODE", pDepositCode);
			cmd.addParameter("@P_PAYMENT_CODE", pPaymentCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pDtypCode,NString pBaseCode,NString pDepositCode,NString pPaymentCode,NString pUserId,NNumber pSurrogateId,NNumber pVersion,NString pVpdiCode,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_DEP_XWALK_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DTYP_CODE", pDtypCode);
			cmd.addParameter("@P_BASE_CODE", pBaseCode);
			cmd.addParameter("@P_DEPOSIT_CODE", pDepositCode);
			cmd.addParameter("@P_PAYMENT_CODE", pPaymentCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_VPDI_CODE", pVpdiCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
