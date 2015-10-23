package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Eokrlnk {
		public static void pBanLinkingDriver(NString axappnameIn,NString dtypcodeIn,NString aidyearIn,NString treqcodeIn,NString fundcodeIn,NString sbgicodeIn,NString periodIn,NNumber pidmIn,NNumber runmodeIn,NString usernameIn,NString trstcodeIn,Ref<NString> feedbackMsgOut,Ref<NNumber> successOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRLNK.P_BAN_LINKING_DRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AXAPPNAME_IN", axappnameIn);
			cmd.addParameter("@DTYPCODE_IN", dtypcodeIn);
			cmd.addParameter("@AIDYEAR_IN", aidyearIn);
			cmd.addParameter("@TREQCODE_IN", treqcodeIn);
			cmd.addParameter("@FUNDCODE_IN", fundcodeIn);
			cmd.addParameter("@SBGICODE_IN", sbgicodeIn);
			cmd.addParameter("@PERIOD_IN", periodIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@RUNMODE_IN", runmodeIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
			cmd.addParameter("@TRSTCODE_IN", trstcodeIn);
			cmd.addParameter("@FEEDBACK_MSG_OUT", feedbackMsgOut, true);
			cmd.addParameter("@SUCCESS_OUT", successOut, true);
				
			cmd.execute();
			feedbackMsgOut.val = cmd.getParameterValue("@FEEDBACK_MSG_OUT", NString.class);
			successOut.val = cmd.getParameterValue("@SUCCESS_OUT", NNumber.class);


		}
		
		public static void pGetFormerVIndex(NNumber vAppid,NNumber vDocid,Ref<NString> vIndexFormer) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRLNK.P_GET_FORMER_V_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_INDEX_FORMER", NString.class);
				
			cmd.execute();
			vIndexFormer.val = cmd.getParameterValue("@V_INDEX_FORMER", NString.class);


		}
		
		public static void pGetIndexesFromDocid(NNumber vAppidIn,NNumber vDocidIn,NNumber vFlagsIn,NString vUsernameIn,Ref<NNumber> vSuccessInOut,Ref<NString> vErrormsgInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRLNK.P_GET_INDEXES_FROM_DOCID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_APPID_IN", vAppidIn);
			cmd.addParameter("@V_DOCID_IN", vDocidIn);
			cmd.addParameter("@V_FLAGS_IN", vFlagsIn);
			cmd.addParameter("@V_USERNAME_IN", vUsernameIn);
			cmd.addParameter("@V_SUCCESS_IN_OUT", vSuccessInOut, true);
			cmd.addParameter("@V_ERRORMSG_IN_OUT", vErrormsgInOut, true);
				
			cmd.execute();
			vSuccessInOut.val = cmd.getParameterValue("@V_SUCCESS_IN_OUT", NNumber.class);
			vErrormsgInOut.val = cmd.getParameterValue("@V_ERRORMSG_IN_OUT", NString.class);


		}
		
		public static void pProcessUndo(NNumber vAppid,NNumber vDocid,NNumber vFlags,NString vUsername,NString vIndexFormer,NString vIndexCurrent,Ref<NNumber> vSuccess,Ref<NString> vFeedbackMsg,NNumber suppresOldNewCompar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKRLNK.P_PROCESS_UNDO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_FLAGS", vFlags);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_INDEX_FORMER", vIndexFormer);
			cmd.addParameter("@V_INDEX_CURRENT", vIndexCurrent);
			cmd.addParameter("@V_SUCCESS", vSuccess, true);
			cmd.addParameter("@V_FEEDBACK_MSG", vFeedbackMsg, true);
			cmd.addParameter("@SUPPRES_OLD_NEW_COMPAR", suppresOldNewCompar);
				
			cmd.execute();
			vSuccess.val = cmd.getParameterValue("@V_SUCCESS", NNumber.class);
			vFeedbackMsg.val = cmd.getParameterValue("@V_FEEDBACK_MSG", NString.class);


		}
		
	
	
	
}
