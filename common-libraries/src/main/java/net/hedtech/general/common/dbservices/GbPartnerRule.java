package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbPartnerRule {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PARTNER_RULE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pIntegrationCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PARTNER_RULE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INTEGRATION_CDE", pIntegrationCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExistsByPartner(NString pIntpCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PARTNER_RULE.F_EXISTS_BY_PARTNER", DbManager.getDataBaseFactory());
		
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_INTP_CODE", pIntpCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	public static NString fExistsByPartner(NString pIntpCode) {
			return fExistsByPartner(pIntpCode,NString.getNull());
		}
		

		
		
		public static NString fIsequal(PartnerRuleRecRow recOne,PartnerRuleRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PARTNER_RULE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, PartnerRuleRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, PartnerRuleRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pIntegrationCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PARTNER_RULE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_INTEGRATION_CDE", pIntegrationCde);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PARTNER_RULE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pIntegrationCde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PARTNER_RULE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_INTEGRATION_CDE", pIntegrationCde);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pIntegrationCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PARTNER_RULE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_INTEGRATION_CDE", pIntegrationCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pIntegrationCde,NString pDesc,NString pIntpCode,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PARTNER_RULE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INTEGRATION_CDE", pIntegrationCde);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_INTP_CODE", pIntpCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pIntegrationCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PARTNER_RULE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INTEGRATION_CDE", pIntegrationCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pIntegrationCde,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PARTNER_RULE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INTEGRATION_CDE", pIntegrationCde);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pIntegrationCde,NString pDesc,NString pIntpCode,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_PARTNER_RULE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INTEGRATION_CDE", pIntegrationCde);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_INTP_CODE", pIntpCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="PartnerRuleRecRow", dataSourceName="PARTNER_RULE_REC")
	public static class PartnerRuleRecRow
	{
		@DbRecordField(dataSourceName="R_INTEGRATION_CDE")
		public NString RIntegrationCde;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_INTP_CODE")
		public NString RIntpCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
