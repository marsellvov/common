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


public class GbDisplaycolumns {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYCOLUMNS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pObjsCode,NString pBlockName,NString pColumnName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYCOLUMNS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(DisplaycolumnsRecRow recOne,DisplaycolumnsRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYCOLUMNS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, DisplaycolumnsRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, DisplaycolumnsRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pObjsCode,NString pBlockName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYCOLUMNS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYCOLUMNS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		// MORPHIS TODO GEN JM changed return type from DataCursor to Cursor to fit variable declaration type in gordmskController
		public static Cursor fQueryOne(NString pObjsCode,NString pBlockName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYCOLUMNS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pObjsCode,NString pBlockName,NString pColumnName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYCOLUMNS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pObjsCode,NString pBlockName,NString pColumnName,NString pSysReqInd,NString pDataTypeCde,NNumber pDataLength,NString pUserId,NString pQueryColumn,NNumber pNumericPrecision,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYCOLUMNS.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_DATA_TYPE_CDE", pDataTypeCde);
			cmd.addParameter("@P_DATA_LENGTH", pDataLength);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_QUERY_COLUMN", pQueryColumn);
			cmd.addParameter("@P_NUMERIC_PRECISION", pNumericPrecision);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pObjsCode,NString pBlockName,NString pColumnName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYCOLUMNS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pObjsCode,NString pBlockName,NString pColumnName,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYCOLUMNS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pObjsCode,NString pBlockName,NString pColumnName,NString pSysReqInd,NString pDataTypeCde,NNumber pDataLength,NString pUserId,NString pQueryColumn,NNumber pNumericPrecision,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DISPLAYCOLUMNS.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OBJS_CODE", pObjsCode);
			cmd.addParameter("@P_BLOCK_NAME", pBlockName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_DATA_TYPE_CDE", pDataTypeCde);
			cmd.addParameter("@P_DATA_LENGTH", pDataLength);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_QUERY_COLUMN", pQueryColumn);
			cmd.addParameter("@P_NUMERIC_PRECISION", pNumericPrecision);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="DisplaycolumnsRecRow", dataSourceName="DISPLAYCOLUMNS_REC")
	public static class DisplaycolumnsRecRow
	{
		@DbRecordField(dataSourceName="R_OBJS_CODE")
		public NString RObjsCode;
		@DbRecordField(dataSourceName="R_BLOCK_NAME")
		public NString RBlockName;
		@DbRecordField(dataSourceName="R_COLUMN_NAME")
		public NString RColumnName;
		@DbRecordField(dataSourceName="R_SYS_REQ_IND")
		public NString RSysReqInd;
		@DbRecordField(dataSourceName="R_DATA_TYPE_CDE")
		public NString RDataTypeCde;
		@DbRecordField(dataSourceName="R_DATA_LENGTH")
		public NNumber RDataLength;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_QUERY_COLUMN")
		public NString RQueryColumn;
		@DbRecordField(dataSourceName="R_NUMERIC_PRECISION")
		public NNumber RNumericPrecision;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		
		public DisplaycolumnsRecRow(){
			super();
		}
		
		public DisplaycolumnsRecRow(Row lvGordmclRefResults){
			super();
			RObjsCode = toStr(lvGordmclRefResults.getObject(1));
			RBlockName = toStr(lvGordmclRefResults.getObject(2)); 
			RColumnName = toStr(lvGordmclRefResults.getObject(3));
			RSysReqInd = toStr(lvGordmclRefResults.getObject(4));
			RDataTypeCde = toStr(lvGordmclRefResults.getObject(5)); 
			RDataLength = toNumber(lvGordmclRefResults.getObject(6));
			RUserId = toStr(lvGordmclRefResults.getObject(7));
			RQueryColumn = toStr(lvGordmclRefResults.getObject(8));
			RNumericPrecision = toNumber(lvGordmclRefResults.getObject(9)); 
			RInternalRecordId = toStr(lvGordmclRefResults.getObject(10));
		}

	
	}
	
	
}
