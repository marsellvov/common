package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbMassEntryRules {
		public static NString fParentExists(NString pFormName,NString pAddUserId,NDate pAddDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY_RULES.F_PARENT_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pFormName,NString pAddUserId,NDate pAddDate,NNumber pPidm,NNumber pSeqno,NString pManualAddInd,NString pProcessInd,NString pUpdateCde,NString pUserId,NString pDataOrigin,NString pTermCode,NNumber pKeySeqno,NString pKeyText,NString pHoldCde,NString pMsg,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_MANUAL_ADD_IND", pManualAddInd);
			cmd.addParameter("@P_PROCESS_IND", pProcessInd);
			cmd.addParameter("@P_UPDATE_CDE", pUpdateCde);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_KEY_TEXT", pKeyText);
			cmd.addParameter("@P_HOLD_CDE", pHoldCde);
			cmd.addParameter("@P_MSG", pMsg);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pFormName,NString pAddUserId,NDate pAddDate,NNumber pPidm,NNumber pSeqno,NString pManualAddInd,NString pProcessInd,NString pUpdateCde,NString pUserId,NString pDataOrigin,NString pTermCode,NNumber pKeySeqno,NString pKeyText,NString pHoldCde,NString pMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_MANUAL_ADD_IND", pManualAddInd);
			cmd.addParameter("@P_PROCESS_IND", pProcessInd);
			cmd.addParameter("@P_UPDATE_CDE", pUpdateCde);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_KEY_SEQNO", pKeySeqno);
			cmd.addParameter("@P_KEY_TEXT", pKeyText);
			cmd.addParameter("@P_HOLD_CDE", pHoldCde);
			cmd.addParameter("@P_MSG", pMsg);
				
			cmd.execute();


		}
		
	
	
	
}
