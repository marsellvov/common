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


public class GbCmRules {
		public static NBool fAllReqdAdded(NString pCmscCode,NNumber pPriorityNo,NString pColumnName,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_RULES.F_ALL_REQD_ADDED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_RULES.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pCmscCode,NNumber pPriorityNo,NString pColumnName) {
		
			NString pRowid = NString.getNull();
			return fExists( pCmscCode, pPriorityNo, pColumnName, pRowid);		
			
		}
		
		public static NString fExists(NString pCmscCode,NNumber pPriorityNo,NString pColumnName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_RULES.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsByColumn(NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_RULES.F_EXISTS_BY_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CmRulesRecRow recOne,CmRulesRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_RULES.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CmRulesRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CmRulesRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static Cursor fQueryAll(NString pCmscCode,NNumber pPriorityNo,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_RULES.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_RULES.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCmscCode,NNumber pPriorityNo,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_RULES.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pCmscCode,NNumber pPriorityNo,NString pColumnName,NNumber pLength,NString pDataReqInd,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_RULES.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_LENGTH", pLength);
			cmd.addParameter("@P_DATA_REQ_IND", pDataReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pCmscCode,NNumber pPriorityNo,NString pColumnName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_RULES.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pCmscCode,NNumber pPriorityNo,NString pColumnName,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_RULES.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pCmscCode,NNumber pPriorityNo,NString pColumnName,NNumber pLength,NString pDataReqInd,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_RULES.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_PRIORITY_NO", pPriorityNo);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_LENGTH", pLength);
			cmd.addParameter("@P_DATA_REQ_IND", pDataReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CmRulesRecRow", dataSourceName="CM_RULES_REC")
	public static class CmRulesRecRow
	{
		@DbRecordField(dataSourceName="R_CMSC_CODE")
		public NString RCmscCode;
		@DbRecordField(dataSourceName="R_PRIORITY_NO")
		public NNumber RPriorityNo;
		@DbRecordField(dataSourceName="R_COLUMN_NAME")
		public NString RColumnName;
		@DbRecordField(dataSourceName="R_LENGTH")
		public NNumber RLength;
		@DbRecordField(dataSourceName="R_DATA_REQ_IND")
		public NString RDataReqInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		public CmRulesRecRow() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CmRulesRecRow(Row spridenRefResults) {
			super();
			RCmscCode = toStr(spridenRefResults.getObject(1));
			RPriorityNo = toNumber(spridenRefResults.getObject(2));
			RColumnName = toStr(spridenRefResults.getObject(3));
			RLength = toNumber(spridenRefResults.getObject(4));
			RDataReqInd = toStr(spridenRefResults.getObject(5));
			RUserId = toStr(spridenRefResults.getObject(6));
			RDataOrigin = toStr(spridenRefResults.getObject(7));
			RInternalRecordId = toStr(spridenRefResults.getObject(8));
		}
		
		
	}

	
	
}
