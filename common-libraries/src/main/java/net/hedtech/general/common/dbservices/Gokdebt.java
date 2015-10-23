package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokdebt {
		public static void pMatchSorhsch(Ref<NString> pCmscCode,Ref<NNumber> pCmsrPriorityNo,Ref<NNumber> pPidm,Ref<NString> pResultType,Ref<NNumber> pMatchCount,Ref<NNumber> pMissingCount,Ref<NNumber> pUnmatchCount,Ref<NString> pMessage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDEBT.P_MATCH_SORHSCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode, true);
			cmd.addParameter("@P_CMSR_PRIORITY_NO", pCmsrPriorityNo, true);
			cmd.addParameter("@P_PIDM", pPidm, true);
			cmd.addParameter("@P_RESULT_TYPE", pResultType, true);
			cmd.addParameter("@P_MATCH_COUNT", pMatchCount, true);
			cmd.addParameter("@P_MISSING_COUNT", pMissingCount, true);
			cmd.addParameter("@P_UNMATCH_COUNT", pUnmatchCount, true);
			cmd.addParameter("@P_MESSAGE", pMessage, true);
				
			cmd.execute();
			pCmscCode.val = cmd.getParameterValue("@P_CMSC_CODE", NString.class);
			pCmsrPriorityNo.val = cmd.getParameterValue("@P_CMSR_PRIORITY_NO", NNumber.class);
			pPidm.val = cmd.getParameterValue("@P_PIDM", NNumber.class);
			pResultType.val = cmd.getParameterValue("@P_RESULT_TYPE", NString.class);
			pMatchCount.val = cmd.getParameterValue("@P_MATCH_COUNT", NNumber.class);
			pMissingCount.val = cmd.getParameterValue("@P_MISSING_COUNT", NNumber.class);
			pUnmatchCount.val = cmd.getParameterValue("@P_UNMATCH_COUNT", NNumber.class);
			pMessage.val = cmd.getParameterValue("@P_MESSAGE", NString.class);


		}
		
	
	
	
}
