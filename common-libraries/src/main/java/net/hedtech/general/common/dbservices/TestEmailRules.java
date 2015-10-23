package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TestEmailRules {
		public static void pTestValidate(NNumber pPidm,NString pEmalCode,NString pEmailAddress,NString pStatusInd,NString pPreferredInd,NString pUserId,NString pComment,NString pDispWebInd,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TEST_EMAIL_RULES.P_TEST_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMAL_CODE", pEmalCode);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_PREFERRED_IND", pPreferredInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_DISP_WEB_IND", pDispWebInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	
}
