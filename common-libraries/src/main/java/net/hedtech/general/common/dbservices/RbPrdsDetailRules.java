package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbPrdsDetailRules {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_DETAIL_RULES.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NString pPbgpCode,NString pPbtpCode,NString pPbcpCode,NString pPeriod,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_DETAIL_RULES.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsChild(NString pAidyCode,NString pPbgpCode,NString pPbtpCode,NString pPbcpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_DETAIL_RULES.F_IS_CHILD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(PrdsDetailRulesRecRow recOne,PrdsDetailRulesRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_DETAIL_RULES.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PrdsDetailRulesRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PrdsDetailRulesRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPeriodDetailRulesExist(NString pAidyCode,NString pPbgpCode,NString pPbtpCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_DETAIL_RULES.F_PERIOD_DETAIL_RULES_EXIST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NString pPbgpCode,NString pPbtpCode,NString pPbcpCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_DETAIL_RULES.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_DETAIL_RULES.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NString pPbgpCode,NString pPbtpCode,NString pPbcpCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_DETAIL_RULES.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NString pPbgpCode,NString pPbtpCode,NString pPbcpCode,NString pPeriod,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_DETAIL_RULES.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NString pPbgpCode,NString pPbtpCode,NString pPbcpCode,NString pPeriod,NNumber pAmt,NString pAbrcCode,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_DETAIL_RULES.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_AMT", pAmt);
			cmd.addParameter("@P_ABRC_CODE", pAbrcCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pAidyCode,NString pPbgpCode,NString pPbtpCode,NString pPbcpCode,NString pPeriod,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_DETAIL_RULES.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pAidyCode,NString pPbgpCode,NString pPbtpCode,NString pPbcpCode,NString pPeriod,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_DETAIL_RULES.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NString pPbgpCode,NString pPbtpCode,NString pPbcpCode,NString pPeriod,NNumber pAmt,NString pAbrcCode,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PRDS_DETAIL_RULES.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_AMT", pAmt);
			cmd.addParameter("@P_ABRC_CODE", pAbrcCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="PrdsDetailRulesRecRow", dataSourceName="PRDS_DETAIL_RULES_REC")
	public static class PrdsDetailRulesRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_PBGP_CODE")
		public NString RPbgpCode;
		@DbRecordField(dataSourceName="R_PBTP_CODE")
		public NString RPbtpCode;
		@DbRecordField(dataSourceName="R_PBCP_CODE")
		public NString RPbcpCode;
		@DbRecordField(dataSourceName="R_PERIOD")
		public NString RPeriod;
		@DbRecordField(dataSourceName="R_AMT")
		public NNumber RAmt;
		@DbRecordField(dataSourceName="R_ABRC_CODE")
		public NString RAbrcCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
