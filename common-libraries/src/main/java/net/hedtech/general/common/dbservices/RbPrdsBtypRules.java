package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbPrdsBtypRules {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_BTYP_RULES.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NString pPbtpCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_BTYP_RULES.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(PrdsBtypRulesRecRow recOne,PrdsBtypRulesRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_BTYP_RULES.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PrdsBtypRulesRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PrdsBtypRulesRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NString pPbtpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_BTYP_RULES.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_BTYP_RULES.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NString pPbtpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_BTYP_RULES.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NString pPbtpCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_BTYP_RULES.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fTypeIsFm(NString pAidyCode,NString pPbtpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_BTYP_RULES.F_TYPE_IS_FM", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTypeIsPell(NString pAidyCode,NString pPbtpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_BTYP_RULES.F_TYPE_IS_PELL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreate(NString pAidyCode,NString pPbtpCode,NString pPellInd,NString pEfcInd,NString pLongDesc,NString pComment,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_BTYP_RULES.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PELL_IND", pPellInd);
			cmd.addParameter("@P_EFC_IND", pEfcInd);
			cmd.addParameter("@P_LONG_DESC", pLongDesc);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pAidyCode,NString pPbtpCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_BTYP_RULES.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pAidyCode,NString pPbtpCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_BTYP_RULES.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NString pPbtpCode,NString pPellInd,NString pEfcInd,NString pLongDesc,NString pComment,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_BTYP_RULES.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PELL_IND", pPellInd);
			cmd.addParameter("@P_EFC_IND", pEfcInd);
			cmd.addParameter("@P_LONG_DESC", pLongDesc);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="PrdsBtypRulesRecRow", dataSourceName="PRDS_BTYP_RULES_REC")
	public static class PrdsBtypRulesRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PBTP_CODE")
		public NString RPbtpCode;
		@DbRecordField(dataSourceName="R_PELL_IND")
		public NString RPellInd;
		@DbRecordField(dataSourceName="R_EFC_IND")
		public NString REfcInd;
		@DbRecordField(dataSourceName="R_LONG_DESC")
		public NString RLongDesc;
		@DbRecordField(dataSourceName="R_COMMENT")
		public NString RComment;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
