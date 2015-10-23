package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Eokslnk {
		public static NString fCheckSaradap(NNumber pidmIn,NNumber applicnoIn,NString termcodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSLNK.F_CHECK_SARADAP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@APPLICNO_IN", applicnoIn);
			cmd.addParameter("@TERMCODE_IN", termcodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckSaradapAll(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSLNK.F_CHECK_SARADAP_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckSaradapTerm(NNumber pidmIn,NString termcodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSLNK.F_CHECK_SARADAP_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERMCODE_IN", termcodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckValidSbgi(NString sbgicodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSLNK.F_CHECK_VALID_SBGI", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SBGICODE_IN", sbgicodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckValidationTable(NString admrcodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSLNK.F_CHECK_VALIDATION_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@ADMRCODE_IN", admrcodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void fGetEsblinkRule() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSLNK.F_GET_ESBLINK_RULE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fGetExbinstRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSLNK.F_GET_EXBINST_REC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fGetSaradapRowid(NString termcodeIn,NNumber applicnoIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSLNK.F_GET_SARADAP_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERMCODE_IN", termcodeIn);
			cmd.addParameter("@APPLICNO_IN", applicnoIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSarchklRecExists(NNumber pidmIn,NString termcodeIn,NNumber applNoIn,NString admrcodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSLNK.F_SARCHKL_REC_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERMCODE_IN", termcodeIn);
			cmd.addParameter("@APPL_NO_IN", applNoIn);
			cmd.addParameter("@ADMRCODE_IN", admrcodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSarchklRecExistsAll(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSLNK.F_SARCHKL_REC_EXISTS_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSarchklRecExistsTerm(NNumber pidmIn,NString termcodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSLNK.F_SARCHKL_REC_EXISTS_TERM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@TERMCODE_IN", termcodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pBanLinkingDriver(NString axappnameIn,NString dtypcodeIn,NString termcodeIn,NString admrcodeIn,NNumber applicnoIn,NString sbgicodeIn,NNumber pidmIn,NNumber runmodeIn,NString usernameIn,NNumber docidIn,NNumber docDeleteIntIn,Ref<NString> vFeedbackMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSLNK.P_BAN_LINKING_DRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AXAPPNAME_IN", axappnameIn);
			cmd.addParameter("@DTYPCODE_IN", dtypcodeIn);
			cmd.addParameter("@TERMCODE_IN", termcodeIn);
			cmd.addParameter("@ADMRCODE_IN", admrcodeIn);
			cmd.addParameter("@APPLICNO_IN", applicnoIn);
			cmd.addParameter("@SBGICODE_IN", sbgicodeIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@RUNMODE_IN", runmodeIn);
			cmd.addParameter("@USERNAME_IN", usernameIn);
			cmd.addParameter("@DOCID_IN", docidIn);
			cmd.addParameter("@DOC_DELETE_INT_IN", docDeleteIntIn);
			cmd.addParameter("@V_FEEDBACK_MSG", vFeedbackMsg, true);
				
			cmd.execute();
			vFeedbackMsg.val = cmd.getParameterValue("@V_FEEDBACK_MSG", NString.class);


		}
		
		public static void pFormulateFeedbackMsg(NString insertFeedbackModeIn,NNumber numRecsInsertIn,NString updateFeedbackModeIn,NNumber numRecsUpdateIn,NNumber numRecsUndoIn,NString saradapErrorIn,NString sbgiNotLookupTableError,NString sbgiValidateError,Ref<NString> feedbackMsgInOut,NString undoFeedbackModeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSLNK.P_FORMULATE_FEEDBACK_MSG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INSERT_FEEDBACK_MODE_IN", insertFeedbackModeIn);
			cmd.addParameter("@NUM_RECS_INSERT_IN", numRecsInsertIn);
			cmd.addParameter("@UPDATE_FEEDBACK_MODE_IN", updateFeedbackModeIn);
			cmd.addParameter("@NUM_RECS_UPDATE_IN", numRecsUpdateIn);
			cmd.addParameter("@NUM_RECS_UNDO_IN", numRecsUndoIn);
			cmd.addParameter("@SARADAP_ERROR_IN", saradapErrorIn);
			cmd.addParameter("@SBGI_NOT_LOOKUP_TABLE_ERROR", sbgiNotLookupTableError);
			cmd.addParameter("@SBGI_VALIDATE_ERROR", sbgiValidateError);
			cmd.addParameter("@FEEDBACK_MSG_IN_OUT", feedbackMsgInOut, true);
			cmd.addParameter("@UNDO_FEEDBACK_MODE_IN", undoFeedbackModeIn);
				
			cmd.execute();
			feedbackMsgInOut.val = cmd.getParameterValue("@FEEDBACK_MSG_IN_OUT", NString.class);


		}
		
		public static void pGetFormerVIndex(NNumber vAppid,NNumber vDocid,Ref<NString> vIndexFormer) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSLNK.P_GET_FORMER_V_INDEX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_INDEX_FORMER", NString.class);
				
			cmd.execute();
			vIndexFormer.val = cmd.getParameterValue("@V_INDEX_FORMER", NString.class);


		}
		
		public static void pGetIndexesFromDocid(NNumber vAppidIn,NNumber vDocidIn,NNumber vFlagsIn,NString vUsernameIn,Ref<NNumber> vSuccessInOut,Ref<NString> vErrormsgInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSLNK.P_GET_INDEXES_FROM_DOCID", DbManager.getDataBaseFactory());
			
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
		
		public static void pInsertSarchkl(NNumber pidmIn,NString dtypecodeIn,NString admrcodeIn,NString termcodeIn,NNumber applicnoIn,NString sbgicodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSLNK.P_INSERT_SARCHKL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@DTYPECODE_IN", dtypecodeIn);
			cmd.addParameter("@ADMRCODE_IN", admrcodeIn);
			cmd.addParameter("@TERMCODE_IN", termcodeIn);
			cmd.addParameter("@APPLICNO_IN", applicnoIn);
			cmd.addParameter("@SBGICODE_IN", sbgicodeIn);
				
			cmd.execute();


		}
		
		public static void pUndoSarchkl(NNumber pidmIn,NString dtypecodeIn,NString admrcodeIn,NString termcodeIn,NNumber applicnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSLNK.P_UNDO_SARCHKL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@DTYPECODE_IN", dtypecodeIn);
			cmd.addParameter("@ADMRCODE_IN", admrcodeIn);
			cmd.addParameter("@TERMCODE_IN", termcodeIn);
			cmd.addParameter("@APPLICNO_IN", applicnoIn);
				
			cmd.execute();


		}
		
		public static void pUpdateEsraudt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSLNK.P_UPDATE_ESRAUDT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateSarchkl(NNumber pidmIn,NString dtypecodeIn,NString admrcodeIn,NString termcodeIn,NNumber applicnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKSLNK.P_UPDATE_SARCHKL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@DTYPECODE_IN", dtypecodeIn);
			cmd.addParameter("@ADMRCODE_IN", admrcodeIn);
			cmd.addParameter("@TERMCODE_IN", termcodeIn);
			cmd.addParameter("@APPLICNO_IN", applicnoIn);
				
			cmd.execute();


		}
		
	
	
	
}
