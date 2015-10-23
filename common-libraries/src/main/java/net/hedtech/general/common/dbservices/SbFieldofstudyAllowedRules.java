package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbFieldofstudyAllowedRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_ALLOWED_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pLmodCode,NString pLfstCode,NString pTranWebInd,NString pSysReqInd,NNumber pMaxNumber,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_ALLOWED_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_TRAN_WEB_IND", pTranWebInd);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_MAX_NUMBER", pMaxNumber);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pLmodCode,NString pLfstCode,NString pTranWebInd,NString pSysReqInd,NNumber pMaxNumber,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FIELDOFSTUDY_ALLOWED_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_TRAN_WEB_IND", pTranWebInd);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_MAX_NUMBER", pMaxNumber);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
