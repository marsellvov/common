package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvCanadianTd1Grp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_GRP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pCode,NString pTxcdCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_GRP.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CanadianTd1GrpRecRow recOne,CanadianTd1GrpRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_GRP.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CanadianTd1GrpRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CanadianTd1GrpRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pCode,NString pTxcdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_GRP.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_GRP.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCode,NString pTxcdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_GRP.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pCode,NString pTxcdCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_GRP.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pCode,NString pDesc,NString pTxcdCode,NDate pEffectiveDate,NString pNonResidentInd,NString pLessIncomeInd,NString pActiveInd,NString pPreferredAtypCode,NString pExemptRuleCode,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_GRP.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_NON_RESIDENT_IND", pNonResidentInd);
			cmd.addParameter("@P_LESS_INCOME_IND", pLessIncomeInd);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_PREFERRED_ATYP_CODE", pPreferredAtypCode);
			cmd.addParameter("@P_EXEMPT_RULE_CODE", pExemptRuleCode);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pCode,NString pTxcdCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_GRP.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pCode,NString pTxcdCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_GRP.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pCode,NString pDesc,NString pTxcdCode,NDate pEffectiveDate,NString pNonResidentInd,NString pLessIncomeInd,NString pActiveInd,NString pPreferredAtypCode,NString pExemptRuleCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CANADIAN_TD1_GRP.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_TXCD_CODE", pTxcdCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_NON_RESIDENT_IND", pNonResidentInd);
			cmd.addParameter("@P_LESS_INCOME_IND", pLessIncomeInd);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_PREFERRED_ATYP_CODE", pPreferredAtypCode);
			cmd.addParameter("@P_EXEMPT_RULE_CODE", pExemptRuleCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="CanadianTd1GrpRecRow", dataSourceName="CANADIAN_TD1_GRP_REC", needsInitialization=true)
	public static class CanadianTd1GrpRecRow
	{
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_TXCD_CODE")
		public NString RTxcdCode;
		@DbRecordField(dataSourceName="R_EFFECTIVE_DATE")
		public NDate REffectiveDate;
		@DbRecordField(dataSourceName="R_NON_RESIDENT_IND")
		public NString RNonResidentInd;
		@DbRecordField(dataSourceName="R_LESS_INCOME_IND")
		public NString RLessIncomeInd;
		@DbRecordField(dataSourceName="R_ACTIVE_IND")
		public NString RActiveInd;
		@DbRecordField(dataSourceName="R_PREFERRED_ATYP_CODE")
		public NString RPreferredAtypCode;
		@DbRecordField(dataSourceName="R_EXEMPT_RULE_CODE")
		public NString RExemptRuleCode;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
