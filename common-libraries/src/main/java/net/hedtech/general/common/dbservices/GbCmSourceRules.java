package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbCmSourceRules {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_SOURCE_RULES.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pCmscCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_SOURCE_RULES.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CmSourceRulesRecRow recOne,CmSourceRulesRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_SOURCE_RULES.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CmSourceRulesRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CmSourceRulesRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pCmscCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_SOURCE_RULES.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_SOURCE_RULES.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCmscCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_SOURCE_RULES.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pCmscCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_SOURCE_RULES.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pCmscCode,NString pOnlineMatchInd,NString pEntityCde,NString pUserId,NString pAtypCode,NString pTeleCode,NString pEmalCode,NString pDataOrigin,NString pTransposeDateInd,NString pTransposeNameInd,NString pAliasWildcardInd,NString pLengthOverrideInd,NString pApiFailureInd,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_SOURCE_RULES.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_ONLINE_MATCH_IND", pOnlineMatchInd);
			cmd.addParameter("@P_ENTITY_CDE", pEntityCde);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_EMAL_CODE", pEmalCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TRANSPOSE_DATE_IND", pTransposeDateInd);
			cmd.addParameter("@P_TRANSPOSE_NAME_IND", pTransposeNameInd);
			cmd.addParameter("@P_ALIAS_WILDCARD_IND", pAliasWildcardInd);
			cmd.addParameter("@P_LENGTH_OVERRIDE_IND", pLengthOverrideInd);
			cmd.addParameter("@P_API_FAILURE_IND", pApiFailureInd);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pCmscCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_SOURCE_RULES.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pCmscCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_SOURCE_RULES.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pCmscCode,NString pOnlineMatchInd,NString pEntityCde,NString pUserId,NString pAtypCode,NString pTeleCode,NString pEmalCode,NString pDataOrigin,NString pTransposeDateInd,NString pTransposeNameInd,NString pAliasWildcardInd,NString pLengthOverrideInd,NString pApiFailureInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_SOURCE_RULES.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_ONLINE_MATCH_IND", pOnlineMatchInd);
			cmd.addParameter("@P_ENTITY_CDE", pEntityCde);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ATYP_CODE", pAtypCode);
			cmd.addParameter("@P_TELE_CODE", pTeleCode);
			cmd.addParameter("@P_EMAL_CODE", pEmalCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_TRANSPOSE_DATE_IND", pTransposeDateInd);
			cmd.addParameter("@P_TRANSPOSE_NAME_IND", pTransposeNameInd);
			cmd.addParameter("@P_ALIAS_WILDCARD_IND", pAliasWildcardInd);
			cmd.addParameter("@P_LENGTH_OVERRIDE_IND", pLengthOverrideInd);
			cmd.addParameter("@P_API_FAILURE_IND", pApiFailureInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CmSourceRulesRecRow", dataSourceName="CM_SOURCE_RULES_REC")
	public static class CmSourceRulesRecRow
	{
		@DbRecordField(dataSourceName="R_CMSC_CODE")
		public NString RCmscCode;
		@DbRecordField(dataSourceName="R_ONLINE_MATCH_IND")
		public NString ROnlineMatchInd;
		@DbRecordField(dataSourceName="R_ENTITY_CDE")
		public NString REntityCde;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_ATYP_CODE")
		public NString RAtypCode;
		@DbRecordField(dataSourceName="R_TELE_CODE")
		public NString RTeleCode;
		@DbRecordField(dataSourceName="R_EMAL_CODE")
		public NString REmalCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_TRANSPOSE_DATE_IND")
		public NString RTransposeDateInd;
		@DbRecordField(dataSourceName="R_TRANSPOSE_NAME_IND")
		public NString RTransposeNameInd;
		@DbRecordField(dataSourceName="R_ALIAS_WILDCARD_IND")
		public NString RAliasWildcardInd;
		@DbRecordField(dataSourceName="R_LENGTH_OVERRIDE_IND")
		public NString RLengthOverrideInd;
		@DbRecordField(dataSourceName="R_API_FAILURE_IND")
		public NString RApiFailureInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
