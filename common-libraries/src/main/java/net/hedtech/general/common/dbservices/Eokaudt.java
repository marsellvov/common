package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Eokaudt {
		public static void pInsertExbaudt(NString currentFormIn,NString currentBlockIn,NString currentItemIn,NString currentItemValueTmpInOut,NString axApplicationInOut,NString calledQuerynameInOut,NString docTypeInOut,NString cntxtSrchCriteriaIn,NString actionIn,NString usernameIn,NDate activityDateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKAUDT.P_INSERT_EXBAUDT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CURRENT_FORM_IN", currentFormIn);
			cmd.addParameter("@CURRENT_BLOCK_IN", currentBlockIn);
			cmd.addParameter("@CURRENT_ITEM_IN", currentItemIn);
			cmd.addParameter("@CURRENT_ITEM_VALUE_TMP_IN_OUT", currentItemValueTmpInOut);
			cmd.addParameter("@AX_APPLICATION_IN_OUT", axApplicationInOut);
			cmd.addParameter("@CALLED_QUERYNAME_IN_OUT", calledQuerynameInOut);
			cmd.addParameter("@DOC_TYPE_IN_OUT", docTypeInOut);
			cmd.addParameter("@CNTXT_SRCH_CRITERIA_IN", cntxtSrchCriteriaIn);
			cmd.addParameter("@ACTION_IN", actionIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
			cmd.addParameter("@ACTIVITY_DATE_IN", activityDateIn);
				
			cmd.execute();


		}
		
	
	
	
}
