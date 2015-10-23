package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Shkprev {
		public static void pAllowRegCast(Ref<NNumber> workMaxRegCredOut,Ref<NString> workMessageOut,Ref<NString> workPreventRegIndOut,NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPREV.P_ALLOW_REG_CAST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WORK_MAX_REG_CRED_OUT", NNumber.class);
			cmd.addParameter("@WORK_MESSAGE_OUT", NString.class);
			cmd.addParameter("@WORK_PREVENT_REG_IND_OUT", NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();
			workMaxRegCredOut.val = cmd.getParameterValue("@WORK_MAX_REG_CRED_OUT", NNumber.class);
			workMessageOut.val = cmd.getParameterValue("@WORK_MESSAGE_OUT", NString.class);
			workPreventRegIndOut.val = cmd.getParameterValue("@WORK_PREVENT_REG_IND_OUT", NString.class);


		}
		
		public static void pCalculateCastCode(Ref<NString> workCastOut,Ref<NString> workPrevInOut,Ref<NString> workAstdInOut,Ref<NString> workMessageOut,Ref<NString> workOldCastOut,NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPREV.P_CALCULATE_CAST_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WORK_CAST_OUT", NString.class);
			cmd.addParameter("@WORK_PREV_IN_OUT", workPrevInOut, true);
			cmd.addParameter("@WORK_ASTD_IN_OUT", workAstdInOut, true);
			cmd.addParameter("@WORK_MESSAGE_OUT", NString.class);
			cmd.addParameter("@WORK_OLD_CAST_OUT", NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();
			workCastOut.val = cmd.getParameterValue("@WORK_CAST_OUT", NString.class);
			workPrevInOut.val = cmd.getParameterValue("@WORK_PREV_IN_OUT", NString.class);
			workAstdInOut.val = cmd.getParameterValue("@WORK_ASTD_IN_OUT", NString.class);
			workMessageOut.val = cmd.getParameterValue("@WORK_MESSAGE_OUT", NString.class);
			workOldCastOut.val = cmd.getParameterValue("@WORK_OLD_CAST_OUT", NString.class);


		}
		
		public static void pCalculatePrevCode(Ref<NString> workPrevOut,Ref<NString> workAstdOut,Ref<NString> workMessageOut,Ref<NString> workOldPrevOut,NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPREV.P_CALCULATE_PREV_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WORK_PREV_OUT", NString.class);
			cmd.addParameter("@WORK_ASTD_OUT", NString.class);
			cmd.addParameter("@WORK_MESSAGE_OUT", NString.class);
			cmd.addParameter("@WORK_OLD_PREV_OUT", NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();
			workPrevOut.val = cmd.getParameterValue("@WORK_PREV_OUT", NString.class);
			workAstdOut.val = cmd.getParameterValue("@WORK_ASTD_OUT", NString.class);
			workMessageOut.val = cmd.getParameterValue("@WORK_MESSAGE_OUT", NString.class);
			workOldPrevOut.val = cmd.getParameterValue("@WORK_OLD_PREV_OUT", NString.class);


		}
		
		public static void pGetCast(Ref<NString> workCastOut,Ref<NString> workAstdInOut,Ref<NString> workMessageOut,Ref<NString> workOldCastOut,NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPREV.P_GET_CAST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WORK_CAST_OUT", NString.class);
			cmd.addParameter("@WORK_ASTD_IN_OUT", workAstdInOut, true);
			cmd.addParameter("@WORK_MESSAGE_OUT", NString.class);
			cmd.addParameter("@WORK_OLD_CAST_OUT", NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();
			workCastOut.val = cmd.getParameterValue("@WORK_CAST_OUT", NString.class);
			workAstdInOut.val = cmd.getParameterValue("@WORK_ASTD_IN_OUT", NString.class);
			workMessageOut.val = cmd.getParameterValue("@WORK_MESSAGE_OUT", NString.class);
			workOldCastOut.val = cmd.getParameterValue("@WORK_OLD_CAST_OUT", NString.class);


		}
		
		public static void pGetMinMaxHours(Ref<NNumber> workOldMinRegCredOut,Ref<NNumber> workOldMaxRegCredOut,Ref<NNumber> workMinRegCredOut,Ref<NNumber> workMaxRegCredOut,Ref<NString> workMessageOut,NString workCastIn,NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPREV.P_GET_MIN_MAX_HOURS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WORK_OLD_MIN_REG_CRED_OUT", NNumber.class);
			cmd.addParameter("@WORK_OLD_MAX_REG_CRED_OUT", NNumber.class);
			cmd.addParameter("@WORK_MIN_REG_CRED_OUT", NNumber.class);
			cmd.addParameter("@WORK_MAX_REG_CRED_OUT", NNumber.class);
			cmd.addParameter("@WORK_MESSAGE_OUT", NString.class);
			cmd.addParameter("@WORK_CAST_IN", workCastIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();
			workOldMinRegCredOut.val = cmd.getParameterValue("@WORK_OLD_MIN_REG_CRED_OUT", NNumber.class);
			workOldMaxRegCredOut.val = cmd.getParameterValue("@WORK_OLD_MAX_REG_CRED_OUT", NNumber.class);
			workMinRegCredOut.val = cmd.getParameterValue("@WORK_MIN_REG_CRED_OUT", NNumber.class);
			workMaxRegCredOut.val = cmd.getParameterValue("@WORK_MAX_REG_CRED_OUT", NNumber.class);
			workMessageOut.val = cmd.getParameterValue("@WORK_MESSAGE_OUT", NString.class);


		}
		
		public static void pGetPrevCode(Ref<NString> workPrev,Ref<NString> workAstd,Ref<NString> workMessage,Ref<NString> workOldPrev,NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPREV.P_GET_PREV_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WORK_PREV", NString.class);
			cmd.addParameter("@WORK_ASTD", NString.class);
			cmd.addParameter("@WORK_MESSAGE", NString.class);
			cmd.addParameter("@WORK_OLD_PREV", NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();
			workPrev.val = cmd.getParameterValue("@WORK_PREV", NString.class);
			workAstd.val = cmd.getParameterValue("@WORK_ASTD", NString.class);
			workMessage.val = cmd.getParameterValue("@WORK_MESSAGE", NString.class);
			workOldPrev.val = cmd.getParameterValue("@WORK_OLD_PREV", NString.class);


		}
		
		public static void pUpdatePrevCastCodes(Ref<NString> workMessageOut,NString workPrevIn,NString workCastIn,NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPREV.P_UPDATE_PREV_CAST_CODES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WORK_MESSAGE_OUT", NString.class);
			cmd.addParameter("@WORK_PREV_IN", workPrevIn);
			cmd.addParameter("@WORK_CAST_IN", workCastIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();
			workMessageOut.val = cmd.getParameterValue("@WORK_MESSAGE_OUT", NString.class);


		}
		
		public static void pUpdateRegHours(Ref<NString> workMessageOut,NNumber workMaxRegCredIn,NNumber pidmIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKPREV.P_UPDATE_REG_HOURS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WORK_MESSAGE_OUT", NString.class);
			cmd.addParameter("@WORK_MAX_REG_CRED_IN", workMaxRegCredIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERM_IN", termIn);
				
			cmd.execute();
			workMessageOut.val = cmd.getParameterValue("@WORK_MESSAGE_OUT", NString.class);


		}
		
	
	
	
}
