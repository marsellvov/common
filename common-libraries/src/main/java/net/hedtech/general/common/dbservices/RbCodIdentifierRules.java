package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbCodIdentifierRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_IDENTIFIER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAidyCode,NNumber pPidm,NNumber pSeqNo,NString pIdentifierType,NString pUserId,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pStatusCde,NString pPlusBorrowerIdNo,NString pRejectCode1,NString pRejectCode2,NString pRejectCode3,NString pRejectCode4,NString pRejectCode5,NString pDataOrigin,NString pEditField1,NString pEditField2,NString pEditField3,NString pEditField4,NString pEditField5,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_IDENTIFIER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_IDENTIFIER_TYPE", pIdentifierType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_STATUS_CDE", pStatusCde);
			cmd.addParameter("@P_PLUS_BORROWER_ID_NO", pPlusBorrowerIdNo);
			cmd.addParameter("@P_REJECT_CODE_1", pRejectCode1);
			cmd.addParameter("@P_REJECT_CODE_2", pRejectCode2);
			cmd.addParameter("@P_REJECT_CODE_3", pRejectCode3);
			cmd.addParameter("@P_REJECT_CODE_4", pRejectCode4);
			cmd.addParameter("@P_REJECT_CODE_5", pRejectCode5);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_EDIT_FIELD_1", pEditField1);
			cmd.addParameter("@P_EDIT_FIELD_2", pEditField2);
			cmd.addParameter("@P_EDIT_FIELD_3", pEditField3);
			cmd.addParameter("@P_EDIT_FIELD_4", pEditField4);
			cmd.addParameter("@P_EDIT_FIELD_5", pEditField5);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAidyCode,NNumber pPidm,NNumber pSeqNo,NString pIdentifierType,NString pUserId,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pStatusCde,NString pPlusBorrowerIdNo,NString pRejectCode1,NString pRejectCode2,NString pRejectCode3,NString pRejectCode4,NString pRejectCode5,NString pDataOrigin,NString pEditField1,NString pEditField2,NString pEditField3,NString pEditField4,NString pEditField5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_IDENTIFIER_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_IDENTIFIER_TYPE", pIdentifierType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_STATUS_CDE", pStatusCde);
			cmd.addParameter("@P_PLUS_BORROWER_ID_NO", pPlusBorrowerIdNo);
			cmd.addParameter("@P_REJECT_CODE_1", pRejectCode1);
			cmd.addParameter("@P_REJECT_CODE_2", pRejectCode2);
			cmd.addParameter("@P_REJECT_CODE_3", pRejectCode3);
			cmd.addParameter("@P_REJECT_CODE_4", pRejectCode4);
			cmd.addParameter("@P_REJECT_CODE_5", pRejectCode5);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_EDIT_FIELD_1", pEditField1);
			cmd.addParameter("@P_EDIT_FIELD_2", pEditField2);
			cmd.addParameter("@P_EDIT_FIELD_3", pEditField3);
			cmd.addParameter("@P_EDIT_FIELD_4", pEditField4);
			cmd.addParameter("@P_EDIT_FIELD_5", pEditField5);
				
			cmd.execute();


		}
		
	
	
	
}
