package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GkkbGkrxmap {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRXMAP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pXrotXproCode,NString pXrotTableName,NString pColumnName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRXMAP.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_XROT_XPRO_CODE", pXrotXproCode);
			cmd.addParameter("@P_XROT_TABLE_NAME", pXrotTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GkrxmapRecRow recOne,GkrxmapRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRXMAP.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GkrxmapRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GkrxmapRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pXrotXproCode,NString pXrotTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRXMAP.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_XROT_XPRO_CODE", pXrotXproCode);
			cmd.addParameter("@P_XROT_TABLE_NAME", pXrotTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRXMAP.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pXrotXproCode,NString pXrotTableName,NString pColumnName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRXMAP.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_XROT_XPRO_CODE", pXrotXproCode);
			cmd.addParameter("@P_XROT_TABLE_NAME", pXrotTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pXrotXproCode,NString pXrotTableName,NString pColumnName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRXMAP.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_XROT_XPRO_CODE", pXrotXproCode);
			cmd.addParameter("@P_XROT_TABLE_NAME", pXrotTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pXrotXproCode,NString pXrotTableName,NString pColumnName,NString pColumnDesc,NNumber pColumnLength,NString pColumnNullable,NString pValueType,NString pValue,NString pParentNode,NString pIspopulate,NString pUserId,NString pColumnDatatype,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRXMAP.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_XROT_XPRO_CODE", pXrotXproCode);
			cmd.addParameter("@P_XROT_TABLE_NAME", pXrotTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_COLUMN_DESC", pColumnDesc);
			cmd.addParameter("@P_COLUMN_LENGTH", pColumnLength);
			cmd.addParameter("@P_COLUMN_NULLABLE", pColumnNullable);
			cmd.addParameter("@P_VALUE_TYPE", pValueType);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_PARENT_NODE", pParentNode);
			cmd.addParameter("@P_ISPOPULATE", pIspopulate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_COLUMN_DATATYPE", pColumnDatatype);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pXrotXproCode,NString pXrotTableName,NString pColumnName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRXMAP.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_XROT_XPRO_CODE", pXrotXproCode);
			cmd.addParameter("@P_XROT_TABLE_NAME", pXrotTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pXrotXproCode,NString pXrotTableName,NString pColumnName,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRXMAP.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_XROT_XPRO_CODE", pXrotXproCode);
			cmd.addParameter("@P_XROT_TABLE_NAME", pXrotTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pXrotXproCode,NString pXrotTableName,NString pColumnName,NString pColumnDesc,NNumber pColumnLength,NString pColumnNullable,NString pValueType,NString pValue,NString pParentNode,NString pIspopulate,NString pUserId,NString pColumnDatatype,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRXMAP.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_XROT_XPRO_CODE", pXrotXproCode);
			cmd.addParameter("@P_XROT_TABLE_NAME", pXrotTableName);
			cmd.addParameter("@P_COLUMN_NAME", pColumnName);
			cmd.addParameter("@P_COLUMN_DESC", pColumnDesc);
			cmd.addParameter("@P_COLUMN_LENGTH", pColumnLength);
			cmd.addParameter("@P_COLUMN_NULLABLE", pColumnNullable);
			cmd.addParameter("@P_VALUE_TYPE", pValueType);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_PARENT_NODE", pParentNode);
			cmd.addParameter("@P_ISPOPULATE", pIspopulate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_COLUMN_DATATYPE", pColumnDatatype);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="GkrxmapRecRow", dataSourceName="GKRXMAP_REC", needsInitialization=true)
	public static class GkrxmapRecRow
	{
		@DbRecordField(dataSourceName="R_XROT_XPRO_CODE")
		public NString RXrotXproCode;
		@DbRecordField(dataSourceName="R_XROT_TABLE_NAME")
		public NString RXrotTableName;
		@DbRecordField(dataSourceName="R_COLUMN_NAME")
		public NString RColumnName;
		@DbRecordField(dataSourceName="R_COLUMN_DESC")
		public NString RColumnDesc;
		@DbRecordField(dataSourceName="R_COLUMN_LENGTH")
		public NNumber RColumnLength;
		@DbRecordField(dataSourceName="R_COLUMN_NULLABLE")
		public NString RColumnNullable;
		@DbRecordField(dataSourceName="R_VALUE_TYPE")
		public NString RValueType;
		@DbRecordField(dataSourceName="R_VALUE")
		public NString RValue;
		@DbRecordField(dataSourceName="R_PARENT_NODE")
		public NString RParentNode;
		@DbRecordField(dataSourceName="R_ISPOPULATE")
		public NString RIspopulate;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_COLUMN_DATATYPE")
		public NString RColumnDatatype;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
