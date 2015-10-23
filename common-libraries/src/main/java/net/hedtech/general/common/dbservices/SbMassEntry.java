package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbMassEntry {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pFormName,NString pAddUserId,NDate pAddDate,NNumber pPidm,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(MassEntryRecRow recOne,MassEntryRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, MassEntryRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, MassEntryRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pFormName,NString pAddUserId,NDate pAddDate,NString pUpdateCde,NString pProcessInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_UPDATE_CDE", pUpdateCde);
			cmd.addParameter("@P_PROCESS_IND", pProcessInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pFormName,NString pAddUserId,NDate pAddDate,NNumber pPidm,NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pFormName,NString pAddUserId,NDate pAddDate,NNumber pPidm,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pFormName,NString pAddUserId,NDate pAddDate,NNumber pPidm,NNumber pSeqno,NString pManualAddInd,NString pProcessInd,NString pUpdateCde,NString pUserId,NString pDataOrigin,NString pTermCode,NNumber pKeySeqno,NString pKeyText,NString pHoldCde,NString pMsg,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pCreateMass(NString pFormName,NString pAddUserId,NDate pAddDate,NNumber pPidm,NNumber pSeqno,NString pManualAddInd,NString pProcessInd,NString pUpdateCde,NString pUserId,NString pDataOrigin,NString pTermCode,NNumber pKeySeqno,NString pKeyText,NString pHoldCde,NString pMsg,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY.P_CREATE_MASS", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pFormName,NString pAddUserId,NDate pAddDate,NNumber pPidm,NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pFormName,NString pAddUserId,NDate pAddDate,NNumber pPidm,NNumber pSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pRemoveAllNonmanual(NString pFormName,NString pAddUserId,NDate pAddDate,NString pUpdateCde,NString pManualAddInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY.P_REMOVE_ALL_NONMANUAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_UPDATE_CDE", pUpdateCde);
			cmd.addParameter("@P_MANUAL_ADD_IND", pManualAddInd);
				
			cmd.execute();


		}
		
		public static void pRemoveAllSuccess(NString pFormName,NString pAddUserId,NDate pAddDate,NString pUpdateCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY.P_REMOVE_ALL_SUCCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_UPDATE_CDE", pUpdateCde);
				
			cmd.execute();


		}
		
		public static void pUpdate(NString pFormName,NString pAddUserId,NDate pAddDate,NNumber pPidm,NNumber pSeqno,NString pManualAddInd,NString pProcessInd,NString pUpdateCde,NString pUserId,NString pDataOrigin,NString pTermCode,NNumber pKeySeqno,NString pKeyText,NString pHoldCde,NString pMsg,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateAll(NString pFormName,NString pAddUserId,NDate pAddDate,NString pUpdateCde,NString pMessage,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY.P_UPDATE_ALL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_UPDATE_CDE", pUpdateCde);
			cmd.addParameter("@P_MESSAGE", pMessage);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="MassEntryRecRow", dataSourceName="MASS_ENTRY_REC")
	public static class MassEntryRecRow
	{
		@DbRecordField(dataSourceName="R_FORM_NAME")
		public NString RFormName;
		@DbRecordField(dataSourceName="R_ADD_USER_ID")
		public NString RAddUserId;
		@DbRecordField(dataSourceName="R_ADD_DATE")
		public NDate RAddDate;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_MANUAL_ADD_IND")
		public NString RManualAddInd;
		@DbRecordField(dataSourceName="R_PROCESS_IND")
		public NString RProcessInd;
		@DbRecordField(dataSourceName="R_UPDATE_CDE")
		public NString RUpdateCde;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_KEY_SEQNO")
		public NNumber RKeySeqno;
		@DbRecordField(dataSourceName="R_KEY_TEXT")
		public NString RKeyText;
		@DbRecordField(dataSourceName="R_HOLD_CDE")
		public NString RHoldCde;
		@DbRecordField(dataSourceName="R_MSG")
		public NString RMsg;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
