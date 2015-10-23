package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvVerifRulesSalv {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_VERIF_RULES_SALV.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_VERIF_RULES_SALV.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(VerifRulesSalvRecRow recOne,VerifRulesSalvRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_VERIF_RULES_SALV.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, VerifRulesSalvRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, VerifRulesSalvRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pEarnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_VERIF_RULES_SALV.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_VERIF_RULES_SALV.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pEarnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_VERIF_RULES_SALV.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_VERIF_RULES_SALV.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pEarnCode,NString pTypeVerification,NString pMinimumValidation,NNumber pMonthsVerify,NString pMinimumWageCode,NNumber pMonthsBase,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_VERIF_RULES_SALV.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_TYPE_VERIFICATION", pTypeVerification);
			cmd.addParameter("@P_MINIMUM_VALIDATION", pMinimumValidation);
			cmd.addParameter("@P_MONTHS_VERIFY", pMonthsVerify);
			cmd.addParameter("@P_MINIMUM_WAGE_CODE", pMinimumWageCode);
			cmd.addParameter("@P_MONTHS_BASE", pMonthsBase);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pEarnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_VERIF_RULES_SALV.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pEarnCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_VERIF_RULES_SALV.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pEarnCode,NString pTypeVerification,NString pMinimumValidation,NNumber pMonthsVerify,NString pMinimumWageCode,NNumber pMonthsBase,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_VERIF_RULES_SALV.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_TYPE_VERIFICATION", pTypeVerification);
			cmd.addParameter("@P_MINIMUM_VALIDATION", pMinimumValidation);
			cmd.addParameter("@P_MONTHS_VERIFY", pMonthsVerify);
			cmd.addParameter("@P_MINIMUM_WAGE_CODE", pMinimumWageCode);
			cmd.addParameter("@P_MONTHS_BASE", pMonthsBase);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="VerifRulesSalvRecRow", dataSourceName="VERIF_RULES_SALV_REC", needsInitialization=true)
	public static class VerifRulesSalvRecRow
	{
		@DbRecordField(dataSourceName="R_EARN_CODE")
		public NString REarnCode;
		@DbRecordField(dataSourceName="R_TYPE_VERIFICATION")
		public NString RTypeVerification;
		@DbRecordField(dataSourceName="R_MINIMUM_VALIDATION")
		public NString RMinimumValidation;
		@DbRecordField(dataSourceName="R_MONTHS_VERIFY")
		public NNumber RMonthsVerify;
		@DbRecordField(dataSourceName="R_MINIMUM_WAGE_CODE")
		public NString RMinimumWageCode;
		@DbRecordField(dataSourceName="R_MONTHS_BASE")
		public NNumber RMonthsBase;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
