package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbCodIdentifier {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_IDENTIFIER.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pAidyCode,NNumber pSeqNo,NString pIdentifierType,NString pPlusBorrowerIdNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_IDENTIFIER.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_IDENTIFIER_TYPE", pIdentifierType);
			cmd.addParameter("@P_PLUS_BORROWER_ID_NO", pPlusBorrowerIdNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CodIdentifierRecRow recOne,CodIdentifierRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_IDENTIFIER.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CodIdentifierRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CodIdentifierRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pAidyCode,NNumber pSeqNo,NString pIdentifierType,NString pPlusBorrowerIdNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_IDENTIFIER.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_IDENTIFIER_TYPE", pIdentifierType);
			cmd.addParameter("@P_PLUS_BORROWER_ID_NO", pPlusBorrowerIdNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_IDENTIFIER.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pAidyCode,NNumber pSeqNo,NString pIdentifierType,NString pPlusBorrowerIdNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_IDENTIFIER.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_IDENTIFIER_TYPE", pIdentifierType);
			cmd.addParameter("@P_PLUS_BORROWER_ID_NO", pPlusBorrowerIdNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pAidyCode,NNumber pSeqNo,NString pIdentifierType,NString pPlusBorrowerIdNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_IDENTIFIER.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_IDENTIFIER_TYPE", pIdentifierType);
			cmd.addParameter("@P_PLUS_BORROWER_ID_NO", pPlusBorrowerIdNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NNumber pPidm,NNumber pSeqNo,NString pIdentifierType,NString pUserId,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pStatusCde,NString pPlusBorrowerIdNo,NString pRejectCode1,NString pRejectCode2,NString pRejectCode3,NString pRejectCode4,NString pRejectCode5,NString pDataOrigin,NString pEditField1,NString pEditField2,NString pEditField3,NString pEditField4,NString pEditField5,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_IDENTIFIER.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pAidyCode,NNumber pSeqNo,NString pIdentifierType,NString pPlusBorrowerIdNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_IDENTIFIER.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_IDENTIFIER_TYPE", pIdentifierType);
			cmd.addParameter("@P_PLUS_BORROWER_ID_NO", pPlusBorrowerIdNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pAidyCode,NNumber pSeqNo,NString pIdentifierType,NString pPlusBorrowerIdNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_IDENTIFIER.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_IDENTIFIER_TYPE", pIdentifierType);
			cmd.addParameter("@P_PLUS_BORROWER_ID_NO", pPlusBorrowerIdNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NNumber pPidm,NNumber pSeqNo,NString pIdentifierType,NString pUserId,NString pDocumentId,NString pSsn,NString pLastName,NDate pBirthDate,NString pStatusCde,NString pPlusBorrowerIdNo,NString pRejectCode1,NString pRejectCode2,NString pRejectCode3,NString pRejectCode4,NString pRejectCode5,NString pDataOrigin,NString pEditField1,NString pEditField2,NString pEditField3,NString pEditField4,NString pEditField5,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_COD_IDENTIFIER.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CodIdentifierRecRow", dataSourceName="COD_IDENTIFIER_REC")
	public static class CodIdentifierRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_IDENTIFIER_TYPE")
		public NString RIdentifierType;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DOCUMENT_ID")
		public NString RDocumentId;
		@DbRecordField(dataSourceName="R_SSN")
		public NString RSsn;
		@DbRecordField(dataSourceName="R_LAST_NAME")
		public NString RLastName;
		@DbRecordField(dataSourceName="R_BIRTH_DATE")
		public NDate RBirthDate;
		@DbRecordField(dataSourceName="R_STATUS_CDE")
		public NString RStatusCde;
		@DbRecordField(dataSourceName="R_PLUS_BORROWER_ID_NO")
		public NString RPlusBorrowerIdNo;
		@DbRecordField(dataSourceName="R_REJECT_CODE_1")
		public NString RRejectCode1;
		@DbRecordField(dataSourceName="R_REJECT_CODE_2")
		public NString RRejectCode2;
		@DbRecordField(dataSourceName="R_REJECT_CODE_3")
		public NString RRejectCode3;
		@DbRecordField(dataSourceName="R_REJECT_CODE_4")
		public NString RRejectCode4;
		@DbRecordField(dataSourceName="R_REJECT_CODE_5")
		public NString RRejectCode5;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_EDIT_FIELD_1")
		public NString REditField1;
		@DbRecordField(dataSourceName="R_EDIT_FIELD_2")
		public NString REditField2;
		@DbRecordField(dataSourceName="R_EDIT_FIELD_3")
		public NString REditField3;
		@DbRecordField(dataSourceName="R_EDIT_FIELD_4")
		public NString REditField4;
		@DbRecordField(dataSourceName="R_EDIT_FIELD_5")
		public NString REditField5;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
