package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbMassEntryColumn {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY_COLUMN.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pFormName,NString pAddUserId,NDate pAddDate,NString pMeclCode,NString pSearchUpdateCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY_COLUMN.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_MECL_CODE", pMeclCode);
			cmd.addParameter("@P_SEARCH_UPDATE_CDE", pSearchUpdateCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(MassEntryColumnRecRow recOne,MassEntryColumnRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY_COLUMN.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, MassEntryColumnRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, MassEntryColumnRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pFormName,NString pAddUserId,NDate pAddDate,NString pSearchUpdateCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY_COLUMN.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_SEARCH_UPDATE_CDE", pSearchUpdateCde);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY_COLUMN.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pFormName,NString pAddUserId,NDate pAddDate,NString pMeclCode,NString pSearchUpdateCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY_COLUMN.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_MECL_CODE", pMeclCode);
			cmd.addParameter("@P_SEARCH_UPDATE_CDE", pSearchUpdateCde);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pFormName,NString pAddUserId,NDate pAddDate,NString pMeclCode,NString pSearchUpdateCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY_COLUMN.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_MECL_CODE", pMeclCode);
			cmd.addParameter("@P_SEARCH_UPDATE_CDE", pSearchUpdateCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAddUserId,NDate pAddDate,NString pFormName,NString pDataOrigin,NString pUserId,NString pMeclCode,NString pSearchUpdateCde,NString pValue,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY_COLUMN.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MECL_CODE", pMeclCode);
			cmd.addParameter("@P_SEARCH_UPDATE_CDE", pSearchUpdateCde);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pFormName,NString pAddUserId,NDate pAddDate,NString pMeclCode,NString pSearchUpdateCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY_COLUMN.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_MECL_CODE", pMeclCode);
			cmd.addParameter("@P_SEARCH_UPDATE_CDE", pSearchUpdateCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pFormName,NString pAddUserId,NDate pAddDate,NString pMeclCode,NString pSearchUpdateCde,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY_COLUMN.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_MECL_CODE", pMeclCode);
			cmd.addParameter("@P_SEARCH_UPDATE_CDE", pSearchUpdateCde);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAddUserId,NDate pAddDate,NString pFormName,NString pDataOrigin,NString pUserId,NString pMeclCode,NString pSearchUpdateCde,NString pValue,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_MASS_ENTRY_COLUMN.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ADD_USER_ID", pAddUserId);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_FORM_NAME", pFormName);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_MECL_CODE", pMeclCode);
			cmd.addParameter("@P_SEARCH_UPDATE_CDE", pSearchUpdateCde);
			cmd.addParameter("@P_VALUE", pValue);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="MassEntryColumnRecRow", dataSourceName="MASS_ENTRY_COLUMN_REC")
	public static class MassEntryColumnRecRow
	{
		@DbRecordField(dataSourceName="R_ADD_USER_ID")
		public NString RAddUserId;
		@DbRecordField(dataSourceName="R_ADD_DATE")
		public NDate RAddDate;
		@DbRecordField(dataSourceName="R_FORM_NAME")
		public NString RFormName;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_MECL_CODE")
		public NString RMeclCode;
		@DbRecordField(dataSourceName="R_SEARCH_UPDATE_CDE")
		public NString RSearchUpdateCde;
		@DbRecordField(dataSourceName="R_VALUE")
		public NString RValue;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
