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


public class GbCmDataDictionary {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DATA_DICTIONARY.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTable,NString pColumnName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DATA_DICTIONARY.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}

		public static NString fGetColumn(NString pElement) {
			//DEFAULT NULL
			NString pRowid = NString.getNull();
			
			return fGetColumn(pElement, pRowid);
		}		
		
		public static NString fGetColumn(NString pElement,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DATA_DICTIONARY.F_GET_COLUMN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ELEMENT", pElement);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetElement(NString pColumnName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DATA_DICTIONARY.F_GET_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CmDataDictionaryRecRow recOne,CmDataDictionaryRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DATA_DICTIONARY.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CmDataDictionaryRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CmDataDictionaryRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static Cursor fQueryAll(NString pTable,NString pColumnName,NString pElementReqInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DATA_DICTIONARY.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ELEMENT_REQ_IND", pElementReqInd);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DATA_DICTIONARY.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static Cursor fQueryOne(NString pColumnName,NString pTable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DATA_DICTIONARY.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_TABLE", pTable);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTable,NString pColumnName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DATA_DICTIONARY.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fSysReq(NString pTable,NString pColumnName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DATA_DICTIONARY.F_SYS_REQ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreate(NString pTable,NString pColumnName,NString pElement,NNumber pMaxLength,NString pOverrideLengthInd,NString pAllowNegLengthInd,NString pOnlineMatchInd,NString pSysReqInd,NString pElementReqInd,NString pDataOrigin,Ref<NString> pRowidOut) {
			// DEFAULT gb_common.f_sct_user
			NString pUserId = GbCommon.fSctUser();
			
			pCreate( pTable, pColumnName, pElement, pMaxLength, pOverrideLengthInd, pAllowNegLengthInd, pOnlineMatchInd, pSysReqInd, pElementReqInd, pUserId, pDataOrigin, pRowidOut);
		}		
		
		
		public static void pCreate(NString pTable,NString pColumnName,NString pElement,NNumber pMaxLength,NString pOverrideLengthInd,NString pAllowNegLengthInd,NString pOnlineMatchInd,NString pSysReqInd,NString pElementReqInd,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DATA_DICTIONARY.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ELEMENT", pElement);
			cmd.addParameter("@P_MAX_LENGTH", pMaxLength);
			cmd.addParameter("@P_OVERRIDE_LENGTH_IND", pOverrideLengthInd);
			cmd.addParameter("@P_ALLOW_NEG_LENGTH_IND", pAllowNegLengthInd);
			cmd.addParameter("@P_ONLINE_MATCH_IND", pOnlineMatchInd);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_ELEMENT_REQ_IND", pElementReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTable,NString pColumnName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DATA_DICTIONARY.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTable,NString pColumnName,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DATA_DICTIONARY.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTable,NString pColumnName,NString pElement,NNumber pMaxLength,NString pOverrideLengthInd,NString pAllowNegLengthInd,NString pOnlineMatchInd,NString pSysReqInd,NString pElementReqInd,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_DATA_DICTIONARY.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE", pTable);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ELEMENT", pElement);
			cmd.addParameter("@P_MAX_LENGTH", pMaxLength);
			cmd.addParameter("@P_OVERRIDE_LENGTH_IND", pOverrideLengthInd);
			cmd.addParameter("@P_ALLOW_NEG_LENGTH_IND", pAllowNegLengthInd);
			cmd.addParameter("@P_ONLINE_MATCH_IND", pOnlineMatchInd);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_ELEMENT_REQ_IND", pElementReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CmDataDictionaryRecRow", dataSourceName="CM_DATA_DICTIONARY_REC")
	public static class CmDataDictionaryRecRow
	{
		@DbRecordField(dataSourceName="R_TABLE")
		public NString RTable;
		@DbRecordField(dataSourceName="R_COLUMN_NAME")
		public NString RColumnName;
		@DbRecordField(dataSourceName="R_ELEMENT")
		public NString RElement;
		@DbRecordField(dataSourceName="R_MAX_LENGTH")
		public NNumber RMaxLength;
		@DbRecordField(dataSourceName="R_OVERRIDE_LENGTH_IND")
		public NString ROverrideLengthInd;
		@DbRecordField(dataSourceName="R_ALLOW_NEG_LENGTH_IND")
		public NString RAllowNegLengthInd;
		@DbRecordField(dataSourceName="R_ONLINE_MATCH_IND")
		public NString ROnlineMatchInd;
		@DbRecordField(dataSourceName="R_SYS_REQ_IND")
		public NString RSysReqInd;
		@DbRecordField(dataSourceName="R_ELEMENT_REQ_IND")
		public NString RElementReqInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		public CmDataDictionaryRecRow() {
			super();
			// TODO Auto-generated constructor stub
		}
		public CmDataDictionaryRecRow(Row spridenRefResults) {
			super();
			RTable = toStr(spridenRefResults.getObject(1));
			RColumnName = toStr(spridenRefResults.getObject(2));
			RElement = toStr(spridenRefResults.getObject(3));
			RMaxLength = toNumber(spridenRefResults.getObject(4));
			ROverrideLengthInd = toStr(spridenRefResults.getObject(5));
			RAllowNegLengthInd = toStr(spridenRefResults.getObject(6));
			ROnlineMatchInd = toStr(spridenRefResults.getObject(7));
			RSysReqInd = toStr(spridenRefResults.getObject(8));
			RElementReqInd = toStr(spridenRefResults.getObject(9));
			RUserId = toStr(spridenRefResults.getObject(10));
			RDataOrigin = toStr(spridenRefResults.getObject(11));
			RInternalRecordId = toStr(spridenRefResults.getObject(12));
		}
		
		
	}

	
	
}
