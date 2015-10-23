package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpStreamsRules {
		public static void pConfigureRules(NString pProcessCode,NString pCaptureRulesetName,NString pApplyRulesetName,NString pApplyProcessName,NNumber pScn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_STREAMS_RULES.P_CONFIGURE_RULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCESS_CODE", pProcessCode);
			cmd.addParameter("@P_CAPTURE_RULESET_NAME", pCaptureRulesetName);
			cmd.addParameter("@P_APPLY_RULESET_NAME", pApplyRulesetName);
			cmd.addParameter("@P_APPLY_PROCESS_NAME", pApplyProcessName);
			cmd.addParameter("@P_SCN", pScn);
				
			cmd.execute();


		}
		
	
	
	
}
