package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;
import static morphis.foundations.core.types.Types.*;


public class GbEmail {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EMAIL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pEmalCode,NString pEmailAddress,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EMAIL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMAL_CODE", pEmalCode);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EmailRecRow recOne,EmailRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EMAIL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EmailRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EmailRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		//JM (1/6/2015) changed return type to Cursor 
		public static Cursor fQueryAll(NNumber pPidm,NString pEmalCode,NString pEmailAddress) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EMAIL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMAL_CODE", pEmalCode);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EMAIL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pEmalCode,NString pEmailAddress) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EMAIL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMAL_CODE", pEmalCode);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pEmalCode,NString pEmailAddress,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EMAIL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMAL_CODE", pEmalCode);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pEmalCode,NString pEmailAddress,NString pStatusInd,NString pPreferredInd,NString pUserId,NString pComment,NString pDispWebInd,NString pDataOrigin,Ref<byte[]> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EMAIL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMAL_CODE", pEmalCode);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_PREFERRED_IND", pPreferredInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_DISP_WEB_IND", pDispWebInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", String.class).getBytes();


		}
		
		public static void pDelete(NNumber pPidm,NString pEmalCode,NString pEmailAddress,java.sql.RowId pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EMAIL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMAL_CODE", pEmalCode);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_ROWID",  DbManager.getDataBaseFactory().rowidToString(pRowid));
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pEmalCode,NString pEmailAddress,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EMAIL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMAL_CODE", pEmalCode);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pEmalCode,NString pEmailAddress,NString pStatusInd,NString pPreferredInd,NString pUserId,NString pComment,NString pDispWebInd,NString pDataOrigin,java.sql.RowId pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_EMAIL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMAL_CODE", pEmalCode);
			cmd.addParameter("@P_EMAIL_ADDRESS", pEmailAddress);
			cmd.addParameter("@P_STATUS_IND", pStatusInd);
			cmd.addParameter("@P_PREFERRED_IND", pPreferredInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_DISP_WEB_IND", pDispWebInd);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID",  DbManager.getDataBaseFactory().rowidToString(pRowid));
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EmailRecRow", dataSourceName="EMAIL_REC")
	public static class EmailRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_EMAL_CODE")
		public NString REmalCode;
		@DbRecordField(dataSourceName="R_EMAIL_ADDRESS")
		public NString REmailAddress;
		@DbRecordField(dataSourceName="R_STATUS_IND")
		public NString RStatusInd;
		@DbRecordField(dataSourceName="R_PREFERRED_IND")
		public NString RPreferredInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_COMMENT")
		public NString RComment;
		@DbRecordField(dataSourceName="R_DISP_WEB_IND")
		public NString RDispWebInd;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		
		public EmailRecRow(){
			super();
			
		}
		
		public EmailRecRow(Row lvEmailRefResults){
			super();
			RPidm = toNumber(lvEmailRefResults.getObject(1));
			REmalCode = toStr(lvEmailRefResults.getObject(2));
			REmailAddress = toStr(lvEmailRefResults.getObject(3));
			RStatusInd = toStr(lvEmailRefResults.getObject(4));
			RPreferredInd = toStr(lvEmailRefResults.getObject(5));
			RUserId = toStr(lvEmailRefResults.getObject(6));
			RComment = toStr(lvEmailRefResults.getObject(7));
			RDispWebInd = toStr(lvEmailRefResults.getObject(8));
			RDataOrigin = toStr(lvEmailRefResults.getObject(9));
			RInternalRecordId = toStr(lvEmailRefResults.getObject(10));
		}
	}

	
	
}
