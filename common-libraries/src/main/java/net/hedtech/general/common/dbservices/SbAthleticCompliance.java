package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbAthleticCompliance {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPLIANCE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fCopySport(NNumber pPidm,NString pActcCode,NString pFromTermCode,NString pToTermCode,NString pCopyAttrs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPLIANCE.F_COPY_SPORT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_FROM_TERM_CODE", pFromTermCode);
			cmd.addParameter("@P_TO_TERM_CODE", pToTermCode);
			cmd.addParameter("@P_COPY_ATTRS", pCopyAttrs);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pTermCode,NString pActcCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPLIANCE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(AthleticComplianceRecRow recOne,AthleticComplianceRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPLIANCE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, AthleticComplianceRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, AthleticComplianceRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pTermCode,NString pActcCode,NString pSpstCode,NString pEligCode,NString pAthlAidInd,NString pSaelCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPLIANCE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_SPST_CODE", pSpstCode);
			cmd.addParameter("@P_ELIG_CODE", pEligCode);
			cmd.addParameter("@P_ATHL_AID_IND", pAthlAidInd);
			cmd.addParameter("@P_SAEL_CODE", pSaelCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPLIANCE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pTermCode,NString pActcCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPLIANCE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pTermCode,NString pActcCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPLIANCE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pTermCode,NString pActcCode,NString pSpstCode,NString pEligCode,NString pAthlAidInd,NString pUserId,NString pSaelCode,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPLIANCE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_SPST_CODE", pSpstCode);
			cmd.addParameter("@P_ELIG_CODE", pEligCode);
			cmd.addParameter("@P_ATHL_AID_IND", pAthlAidInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SAEL_CODE", pSaelCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pTermCode,NString pActcCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPLIANCE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pTermCode,NString pActcCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPLIANCE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pTermCode,NString pActcCode,NString pSpstCode,NString pEligCode,NString pAthlAidInd,NString pUserId,NString pSaelCode,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ATHLETIC_COMPLIANCE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ACTC_CODE", pActcCode);
			cmd.addParameter("@P_SPST_CODE", pSpstCode);
			cmd.addParameter("@P_ELIG_CODE", pEligCode);
			cmd.addParameter("@P_ATHL_AID_IND", pAthlAidInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_SAEL_CODE", pSaelCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="AthleticComplianceRecRow", dataSourceName="ATHLETIC_COMPLIANCE_REC")
	public static class AthleticComplianceRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_ACTC_CODE")
		public NString RActcCode;
		@DbRecordField(dataSourceName="R_SPST_CODE")
		public NString RSpstCode;
		@DbRecordField(dataSourceName="R_ELIG_CODE")
		public NString REligCode;
		@DbRecordField(dataSourceName="R_ATHL_AID_IND")
		public NString RAthlAidInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_SAEL_CODE")
		public NString RSaelCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
