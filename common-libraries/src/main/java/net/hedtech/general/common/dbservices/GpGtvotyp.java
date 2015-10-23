package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GpGtvotyp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GTVOTYP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pSystCode,NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GTVOTYP.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GtvotypRecRow recOne,GtvotypRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GTVOTYP.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GtvotypRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GtvotypRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pSystCode,NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GTVOTYP.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GTVOTYP.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pSystCode,NString pCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GTVOTYP.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CODE", pCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pSystCode,NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GTVOTYP.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pSystCode,NString pCode,NString pDesc,NString pDataType,NString pSystemLevelCde,NString pOptionDefault,NString pSystemReqInd,NString pUserId,NDate pCreateDate,NString pCreateUser,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GTVOTYP.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_DATA_TYPE", pDataType);
			cmd.addParameter("@P_SYSTEM_LEVEL_CDE", pSystemLevelCde);
			cmd.addParameter("@P_OPTION_DEFAULT", pOptionDefault);
			cmd.addParameter("@P_SYSTEM_REQ_IND", pSystemReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pSystCode,NString pCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GTVOTYP.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pSystCode,NString pCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GTVOTYP.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pSystCode,NString pCode,NString pDesc,NString pDataType,NString pSystemLevelCde,NString pOptionDefault,NString pSystemReqInd,NString pUserId,NDate pCreateDate,NString pCreateUser,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GP_GTVOTYP.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SYST_CODE", pSystCode);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_DATA_TYPE", pDataType);
			cmd.addParameter("@P_SYSTEM_LEVEL_CDE", pSystemLevelCde);
			cmd.addParameter("@P_OPTION_DEFAULT", pOptionDefault);
			cmd.addParameter("@P_SYSTEM_REQ_IND", pSystemReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CREATE_DATE", pCreateDate);
			cmd.addParameter("@P_CREATE_USER", pCreateUser);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="GtvotypRecRow", dataSourceName="GTVOTYP_REC")
	public static class GtvotypRecRow
	{
		@DbRecordField(dataSourceName="R_SYST_CODE")
		public NString RSystCode;
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_DATA_TYPE")
		public NString RDataType;
		@DbRecordField(dataSourceName="R_SYSTEM_LEVEL_CDE")
		public NString RSystemLevelCde;
		@DbRecordField(dataSourceName="R_OPTION_DEFAULT")
		public NString ROptionDefault;
		@DbRecordField(dataSourceName="R_SYSTEM_REQ_IND")
		public NString RSystemReqInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_CREATE_DATE")
		public NDate RCreateDate;
		@DbRecordField(dataSourceName="R_CREATE_USER")
		public NString RCreateUser;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
