package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pokpval {
		public static void pValidate(NString validationLabel,NNumber parmOneUpNo,NString validationValue,Ref<NString> validationErrorInd,Ref<NString> validationErrorMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKPVAL.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@VALIDATION_LABEL", validationLabel);
			cmd.addParameter("@PARM_ONE_UP_NO", parmOneUpNo);
			cmd.addParameter("@VALIDATION_VALUE", validationValue);
			cmd.addParameter("@VALIDATION_ERROR_IND", NString.class);
			cmd.addParameter("@VALIDATION_ERROR_MSG", NString.class);
				
			cmd.execute();
			validationErrorInd.val = cmd.getParameterValue("@VALIDATION_ERROR_IND", NString.class);
			validationErrorMsg.val = cmd.getParameterValue("@VALIDATION_ERROR_MSG", NString.class);


		}
		
		public static void pValidatePopSel(NString pApplicationId,NString pSelectionId,NString pCreatorId,Ref<NString> pErrInd,Ref<NString> pErrMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKPVAL.P_VALIDATE_POP_SEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_APPLICATION_ID", pApplicationId);
			cmd.addParameter("@P_SELECTION_ID", pSelectionId);
			cmd.addParameter("@P_CREATOR_ID", pCreatorId);
			cmd.addParameter("@P_ERR_IND", NString.class);
			cmd.addParameter("@P_ERR_MSG", NString.class);
				
			cmd.execute();
			pErrInd.val = cmd.getParameterValue("@P_ERR_IND", NString.class);
			pErrMsg.val = cmd.getParameterValue("@P_ERR_MSG", NString.class);


		}
		
	
	
	
}
