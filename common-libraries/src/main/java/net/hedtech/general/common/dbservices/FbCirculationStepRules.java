package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbCirculationStepRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_STEP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pId,NNumber pFobcirhId,NString pCompleteInd,NString pDuplicateInd,NString pUserId,NString pDataOrigin,NNumber pOrder,NString pType,NNumber pResponsesRequired,NNumber pForcirsId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_STEP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FOBCIRH_ID", pFobcirhId);
			cmd.addParameter("@P_COMPLETE_IND", pCompleteInd);
			cmd.addParameter("@P_DUPLICATE_IND", pDuplicateInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ORDER", pOrder);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_RESPONSES_REQUIRED", pResponsesRequired);
			cmd.addParameter("@P_FORCIRS_ID", pForcirsId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pId,NNumber pFobcirhId,NString pCompleteInd,NString pDuplicateInd,NString pUserId,NString pDataOrigin,NNumber pOrder,NString pType,NNumber pResponsesRequired,NNumber pForcirsId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_CIRCULATION_STEP_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_FOBCIRH_ID", pFobcirhId);
			cmd.addParameter("@P_COMPLETE_IND", pCompleteInd);
			cmd.addParameter("@P_DUPLICATE_IND", pDuplicateInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ORDER", pOrder);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_RESPONSES_REQUIRED", pResponsesRequired);
			cmd.addParameter("@P_FORCIRS_ID", pForcirsId);
				
			cmd.execute();


		}
		
	
	
	
}
