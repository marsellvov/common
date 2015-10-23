package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbCrseChrtRestrictionRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_CHRT_RESTRICTION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPrimaryKey,NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pRecType,NString pUserId,NString pChrtIeCde,NString pChrtCode,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_CHRT_RESTRICTION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PRIMARY_KEY", pPrimaryKey);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_REC_TYPE", pRecType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CHRT_IE_CDE", pChrtIeCde);
			cmd.addParameter("@P_CHRT_CODE", pChrtCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pRecType,NString pUserId,NString pChrtIeCde,NString pChrtCode,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_CRSE_CHRT_RESTRICTION_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_REC_TYPE", pRecType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CHRT_IE_CDE", pChrtIeCde);
			cmd.addParameter("@P_CHRT_CODE", pChrtCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
