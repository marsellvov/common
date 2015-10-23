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



public class GbCmUserProcedure {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_PROCEDURE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pCmscCode,NNumber pPriorityNo,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_PROCEDURE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CmUserProcedureRecRow recOne,CmUserProcedureRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_PROCEDURE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CmUserProcedureRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CmUserProcedureRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static Cursor fQueryAll(NString pCmscCode,NNumber pPriorityNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_PROCEDURE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_PROCEDURE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCmscCode,NNumber pPriorityNo,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_PROCEDURE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pCmscCode,NNumber pPriorityNo,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_PROCEDURE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pCmscCode,NNumber pPriorityNo,NNumber pSeqNo,NString pProcedureName,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_PROCEDURE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PROCEDURE_NAME", pProcedureName);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pCmscCode,NNumber pPriorityNo,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_PROCEDURE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pCmscCode,NNumber pPriorityNo,NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_PROCEDURE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pCmscCode,NNumber pPriorityNo,NNumber pSeqNo,NString pProcedureName,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_PROCEDURE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PROCEDURE_NAME", pProcedureName);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CmUserProcedureRecRow", dataSourceName="CM_USER_PROCEDURE_REC")
	public static class CmUserProcedureRecRow
	{
		@DbRecordField(dataSourceName="R_CMSC_CODE")
		public NString RCmscCode;
		@DbRecordField(dataSourceName="R_PRIORITY_NO")
		public NNumber RPriorityNo;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_PROCEDURE_NAME")
		public NString RProcedureName;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		public CmUserProcedureRecRow() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CmUserProcedureRecRow(Row spridenRefResults) {
			super();
			RCmscCode = toStr(spridenRefResults.getObject(1));
			RPriorityNo = toNumber(spridenRefResults.getObject(2));
			RSeqNo = toNumber(spridenRefResults.getObject(3));
			RProcedureName = toStr(spridenRefResults.getObject(4));
			RUserId = toStr(spridenRefResults.getObject(5));
			RDataOrigin = toStr(spridenRefResults.getObject(6));
			RInternalRecordId = toStr(spridenRefResults.getObject(7));
		}
		
		
	}

	
	
}
