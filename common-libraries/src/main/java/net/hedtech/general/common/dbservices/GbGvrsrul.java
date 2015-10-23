package net.hedtech.general.common.dbservices;

import java.sql.RowId;
import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbGvrsrul {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRUL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRdefRuleCode,NString pGsrcCode,NString pGsrcCodeRef,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRUL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_RDEF_RULE_CODE", pRdefRuleCode);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_GSRC_CODE_REF", pGsrcCodeRef);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GvrsrulRecRow recOne,GvrsrulRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRUL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GvrsrulRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GvrsrulRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pRdefRuleCode,NString pGsrcCode,NString pGsrcCodeRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRUL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_RDEF_RULE_CODE", pRdefRuleCode);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_GSRC_CODE_REF", pGsrcCodeRef);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRUL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pRdefRuleCode,NString pGsrcCode,NString pGsrcCodeRef) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRUL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_RDEF_RULE_CODE", pRdefRuleCode);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_GSRC_CODE_REF", pGsrcCodeRef);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pRdefRuleCode,NString pGsrcCode,NString pGsrcCodeRef,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRUL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_RDEF_RULE_CODE", pRdefRuleCode);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_GSRC_CODE_REF", pGsrcCodeRef);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pRdefRuleCode,NString pGsrcCode,NString pGsrcCodeRef,NString pQuery,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRUL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RDEF_RULE_CODE", pRdefRuleCode);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_GSRC_CODE_REF", pGsrcCodeRef);
			cmd.addParameter("@P_QUERY", pQuery);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pRdefRuleCode,NString pGsrcCode,NString pGsrcCodeRef,RowId rowId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRUL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RDEF_RULE_CODE", pRdefRuleCode);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_GSRC_CODE_REF", pGsrcCodeRef);
			cmd.addParameter("@P_ROWID", rowId);
				
			cmd.execute();


		}
		
		public static void pLock(NString pRdefRuleCode,NString pGsrcCode,NString pGsrcCodeRef,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRUL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RDEF_RULE_CODE", pRdefRuleCode);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_GSRC_CODE_REF", pGsrcCodeRef);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pRdefRuleCode,NString pGsrcCode,NString pGsrcCodeRef,NString pQuery,NString pUserId,NString pDataOrigin,RowId rowId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_GVRSRUL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RDEF_RULE_CODE", pRdefRuleCode);
			cmd.addParameter("@P_GSRC_CODE", pGsrcCode);
			cmd.addParameter("@P_GSRC_CODE_REF", pGsrcCodeRef);
			cmd.addParameter("@P_QUERY", pQuery);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", rowId);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="GvrsrulRecRow", dataSourceName="GVRSRUL_REC", needsInitialization=true)
	public static class GvrsrulRecRow
	{
		@DbRecordField(dataSourceName="R_RDEF_RULE_CODE")
		public NString RRdefRuleCode;
		@DbRecordField(dataSourceName="R_GSRC_CODE")
		public NString RGsrcCode;
		@DbRecordField(dataSourceName="R_GSRC_CODE_REF")
		public NString RGsrcCodeRef;
		@DbRecordField(dataSourceName="R_QUERY")
		public NString RQuery;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
