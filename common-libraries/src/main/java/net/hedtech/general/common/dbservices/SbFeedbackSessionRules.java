package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbFeedbackSessionRules {
		public static void pValidate(NNumber pSurrogateId,NString pTermCode,NString pDescription,NString pSuspendFeedbackInd,NDate pStartDate,NDate pEndDate,NString pAddCommentsFlag,NString pAddRecommendsFlag,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FEEDBACK_SESSION_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_SUSPEND_FEEDBACK_IND", pSuspendFeedbackInd);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_ADD_COMMENTS_FLAG", pAddCommentsFlag);
			cmd.addParameter("@P_ADD_RECOMMENDS_FLAG", pAddRecommendsFlag);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
