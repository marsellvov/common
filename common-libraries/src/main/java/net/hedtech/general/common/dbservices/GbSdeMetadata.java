package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbSdeMetadata {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_METADATA.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pTableName,NString pAttrName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_METADATA.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ATTR_NAME", pAttrName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(SdeMetadataRecRow recOne,SdeMetadataRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_METADATA.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, SdeMetadataRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, SdeMetadataRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTableName,NString pAttrName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_METADATA.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ATTR_NAME", pAttrName);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_METADATA.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTableName,NString pAttrName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_METADATA.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ATTR_NAME", pAttrName);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTableName,NString pAttrName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_METADATA.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ATTR_NAME", pAttrName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTableName,NString pAttrName,NString pAttrType,NNumber pAttrOrder,NString pAttrReqdInd,NString pAttrDataType,NString pAttrPrompt,NString pUserId,NNumber pAttrDataLen,NNumber pAttrDataScale,NString pAttrInfo,NString pAttrBaseCol,NString pSddcCode,NString pDataOrigin,NString pLovForm,NString pLovTableOvrd,NString pLovAttrOvrd,NString pLovCodeTitle,NString pLovDescTitle,NString pLovLowRangeAsChar,NString pLovHighRangeAsChar,NString pLovLowSysdateInd,NString pLovHighSysdateInd,NString pGjapdefValidation,NString pSqlSqprCode,NString pSqlSqruCode,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_METADATA.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ATTR_NAME", pAttrName);
			cmd.addParameter("@P_ATTR_TYPE", pAttrType);
			cmd.addParameter("@P_ATTR_ORDER", pAttrOrder);
			cmd.addParameter("@P_ATTR_REQD_IND", pAttrReqdInd);
			cmd.addParameter("@P_ATTR_DATA_TYPE", pAttrDataType);
			cmd.addParameter("@P_ATTR_PROMPT", pAttrPrompt);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ATTR_DATA_LEN", pAttrDataLen);
			cmd.addParameter("@P_ATTR_DATA_SCALE", pAttrDataScale);
			cmd.addParameter("@P_ATTR_INFO", pAttrInfo);
			cmd.addParameter("@P_ATTR_BASE_COL", pAttrBaseCol);
			cmd.addParameter("@P_SDDC_CODE", pSddcCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_LOV_FORM", pLovForm);
			cmd.addParameter("@P_LOV_TABLE_OVRD", pLovTableOvrd);
			cmd.addParameter("@P_LOV_ATTR_OVRD", pLovAttrOvrd);
			cmd.addParameter("@P_LOV_CODE_TITLE", pLovCodeTitle);
			cmd.addParameter("@P_LOV_DESC_TITLE", pLovDescTitle);
			cmd.addParameter("@P_LOV_LOW_RANGE_AS_CHAR", pLovLowRangeAsChar);
			cmd.addParameter("@P_LOV_HIGH_RANGE_AS_CHAR", pLovHighRangeAsChar);
			cmd.addParameter("@P_LOV_LOW_SYSDATE_IND", pLovLowSysdateInd);
			cmd.addParameter("@P_LOV_HIGH_SYSDATE_IND", pLovHighSysdateInd);
			cmd.addParameter("@P_GJAPDEF_VALIDATION", pGjapdefValidation);
			cmd.addParameter("@P_SQL_SQPR_CODE", pSqlSqprCode);
			cmd.addParameter("@P_SQL_SQRU_CODE", pSqlSqruCode);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTableName,NString pAttrName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_METADATA.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ATTR_NAME", pAttrName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTableName,NString pAttrName,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_METADATA.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ATTR_NAME", pAttrName);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTableName,NString pAttrName,NString pAttrType,NNumber pAttrOrder,NString pAttrReqdInd,NString pAttrDataType,NString pAttrPrompt,NString pUserId,NNumber pAttrDataLen,NNumber pAttrDataScale,NString pAttrInfo,NString pAttrBaseCol,NString pSddcCode,NString pDataOrigin,NString pLovForm,NString pLovTableOvrd,NString pLovAttrOvrd,NString pLovCodeTitle,NString pLovDescTitle,NString pLovLowRangeAsChar,NString pLovHighRangeAsChar,NString pLovLowSysdateInd,NString pLovHighSysdateInd,NString pGjapdefValidation,NString pSqlSqprCode,NString pSqlSqruCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_METADATA.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ATTR_NAME", pAttrName);
			cmd.addParameter("@P_ATTR_TYPE", pAttrType);
			cmd.addParameter("@P_ATTR_ORDER", pAttrOrder);
			cmd.addParameter("@P_ATTR_REQD_IND", pAttrReqdInd);
			cmd.addParameter("@P_ATTR_DATA_TYPE", pAttrDataType);
			cmd.addParameter("@P_ATTR_PROMPT", pAttrPrompt);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ATTR_DATA_LEN", pAttrDataLen);
			cmd.addParameter("@P_ATTR_DATA_SCALE", pAttrDataScale);
			cmd.addParameter("@P_ATTR_INFO", pAttrInfo);
			cmd.addParameter("@P_ATTR_BASE_COL", pAttrBaseCol);
			cmd.addParameter("@P_SDDC_CODE", pSddcCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_LOV_FORM", pLovForm);
			cmd.addParameter("@P_LOV_TABLE_OVRD", pLovTableOvrd);
			cmd.addParameter("@P_LOV_ATTR_OVRD", pLovAttrOvrd);
			cmd.addParameter("@P_LOV_CODE_TITLE", pLovCodeTitle);
			cmd.addParameter("@P_LOV_DESC_TITLE", pLovDescTitle);
			cmd.addParameter("@P_LOV_LOW_RANGE_AS_CHAR", pLovLowRangeAsChar);
			cmd.addParameter("@P_LOV_HIGH_RANGE_AS_CHAR", pLovHighRangeAsChar);
			cmd.addParameter("@P_LOV_LOW_SYSDATE_IND", pLovLowSysdateInd);
			cmd.addParameter("@P_LOV_HIGH_SYSDATE_IND", pLovHighSysdateInd);
			cmd.addParameter("@P_GJAPDEF_VALIDATION", pGjapdefValidation);
			cmd.addParameter("@P_SQL_SQPR_CODE", pSqlSqprCode);
			cmd.addParameter("@P_SQL_SQRU_CODE", pSqlSqruCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pValidateSddcChange(NString pTableName,NString pAttrName,NString pOldSddcCode,NString pNewSddcCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_SDE_METADATA.P_VALIDATE_SDDC_CHANGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_ATTR_NAME", pAttrName);
			cmd.addParameter("@P_OLD_SDDC_CODE", pOldSddcCode);
			cmd.addParameter("@P_NEW_SDDC_CODE", pNewSddcCode);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="SdeMetadataRecRow", dataSourceName="SDE_METADATA_REC")
	public static class SdeMetadataRecRow
	{
		@DbRecordField(dataSourceName="R_TABLE_NAME")
		public NString RTableName;
		@DbRecordField(dataSourceName="R_ATTR_NAME")
		public NString RAttrName;
		@DbRecordField(dataSourceName="R_ATTR_TYPE")
		public NString RAttrType;
		@DbRecordField(dataSourceName="R_ATTR_ORDER")
		public NNumber RAttrOrder;
		@DbRecordField(dataSourceName="R_ATTR_REQD_IND")
		public NString RAttrReqdInd;
		@DbRecordField(dataSourceName="R_ATTR_DATA_TYPE")
		public NString RAttrDataType;
		@DbRecordField(dataSourceName="R_ATTR_PROMPT")
		public NString RAttrPrompt;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_ATTR_DATA_LEN")
		public NNumber RAttrDataLen;
		@DbRecordField(dataSourceName="R_ATTR_DATA_SCALE")
		public NNumber RAttrDataScale;
		@DbRecordField(dataSourceName="R_ATTR_INFO")
		public NString RAttrInfo;
		@DbRecordField(dataSourceName="R_ATTR_BASE_COL")
		public NString RAttrBaseCol;
		@DbRecordField(dataSourceName="R_SDDC_CODE")
		public NString RSddcCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_LOV_FORM")
		public NString RLovForm;
		@DbRecordField(dataSourceName="R_LOV_TABLE_OVRD")
		public NString RLovTableOvrd;
		@DbRecordField(dataSourceName="R_LOV_ATTR_OVRD")
		public NString RLovAttrOvrd;
		@DbRecordField(dataSourceName="R_LOV_CODE_TITLE")
		public NString RLovCodeTitle;
		@DbRecordField(dataSourceName="R_LOV_DESC_TITLE")
		public NString RLovDescTitle;
		@DbRecordField(dataSourceName="R_LOV_LOW_RANGE")
		public UnknownTypes.Undefined RLovLowRange;
		@DbRecordField(dataSourceName="R_LOV_HIGH_RANGE")
		public UnknownTypes.Undefined RLovHighRange;
		@DbRecordField(dataSourceName="R_LOV_LOW_SYSDATE_IND")
		public NString RLovLowSysdateInd;
		@DbRecordField(dataSourceName="R_LOV_HIGH_SYSDATE_IND")
		public NString RLovHighSysdateInd;
		@DbRecordField(dataSourceName="R_GJAPDEF_VALIDATION")
		public NString RGjapdefValidation;
		@DbRecordField(dataSourceName="R_SQL_SQPR_CODE")
		public NString RSqlSqprCode;
		@DbRecordField(dataSourceName="R_SQL_SQRU_CODE")
		public NString RSqlSqruCode;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
