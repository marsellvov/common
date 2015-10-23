package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pxkw2fd {
		public static NString fValidCodedInfoRboxInd(NNumber pYear,NString pBoxCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKW2FD.F_VALID_CODED_INFO_RBOX_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_BOX_CODE", pBoxCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pValidateAccountNumber(NString pEmprCode,NString pStatCode,NString pErrorTag,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKW2FD.P_VALIDATE_ACCOUNT_NUMBER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ERROR_TAG", pErrorTag);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateCodedInfoRbox(NNumber pYear,NString pBoxCode,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKW2FD.P_VALIDATE_CODED_INFO_RBOX", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_BOX_CODE", pBoxCode);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateDtot(NNumber pYear,NString pEmprCode,NNumber pPidm,NString pErrorTag,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKW2FD.P_VALIDATE_DTOT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ERROR_TAG", pErrorTag);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateMaxSeqno(NString pOperationType,NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,NString pErrorTag,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKW2FD.P_VALIDATE_MAX_SEQNO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ERROR_TAG", pErrorTag);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateW2Quarter(NNumber pQuarter,NString pErrorTag,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKW2FD.P_VALIDATE_W2_QUARTER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_ERROR_TAG", pErrorTag);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pValidateW2Year(NNumber pYear,NString pErrorTag,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PXKW2FD.P_VALIDATE_W2_YEAR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_ERROR_TAG", pErrorTag);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
	
	
	
}
