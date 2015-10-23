package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Saksels {
		public static NString fApplDecisionValues(NNumber pPidm,NString pTermCode,NNumber pApplNo,NString pValue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKSELS.F_APPL_DECISION_VALUES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_APPL_NO", pApplNo);
			cmd.addParameter("@P_VALUE", pValue);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckForMandatoryInd(NNumber pidmIn,NString termCodeIn,NNumber applNoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SAKSELS.F_CHECK_FOR_MANDATORY_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@APPL_NO_IN", applNoIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
