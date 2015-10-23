package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GkkbGkradiv {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRADIV.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pAdidCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRADIV.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADID_CODE", pAdidCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GkradivRecRow recOne,GkradivRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRADIV.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GkradivRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GkradivRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pAdidCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRADIV.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADID_CODE", pAdidCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRADIV.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pAdidCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRADIV.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADID_CODE", pAdidCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pAdidCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRADIV.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADID_CODE", pAdidCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pAdidCode,NString pAdditionalId,NString pExemptReason,NString pStatusCode,NDate pStatusDate,NDate pVerifiedDate,NString pConsent,NDate pConsentDate,NString pContactMethodCode,NString pDocVerificationInd,NString pSource,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRADIV.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADID_CODE", pAdidCode);
			cmd.addParameter("@P_ADDITIONAL_ID", pAdditionalId);
			cmd.addParameter("@P_EXEMPT_REASON", pExemptReason);
			cmd.addParameter("@P_STATUS_CODE", pStatusCode);
			cmd.addParameter("@P_STATUS_DATE", pStatusDate);
			cmd.addParameter("@P_VERIFIED_DATE", pVerifiedDate);
			cmd.addParameter("@P_CONSENT", pConsent);
			cmd.addParameter("@P_CONSENT_DATE", pConsentDate);
			cmd.addParameter("@P_CONTACT_METHOD_CODE", pContactMethodCode);
			cmd.addParameter("@P_DOC_VERIFICATION_IND", pDocVerificationInd);
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pAdidCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRADIV.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADID_CODE", pAdidCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pAdidCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRADIV.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADID_CODE", pAdidCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pAdidCode,NString pAdditionalId,NString pExemptReason,NString pStatusCode,NDate pStatusDate,NDate pVerifiedDate,NString pConsent,NDate pConsentDate,NString pContactMethodCode,NString pDocVerificationInd,NString pSource,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GKKB_GKRADIV.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ADID_CODE", pAdidCode);
			cmd.addParameter("@P_ADDITIONAL_ID", pAdditionalId);
			cmd.addParameter("@P_EXEMPT_REASON", pExemptReason);
			cmd.addParameter("@P_STATUS_CODE", pStatusCode);
			cmd.addParameter("@P_STATUS_DATE", pStatusDate);
			cmd.addParameter("@P_VERIFIED_DATE", pVerifiedDate);
			cmd.addParameter("@P_CONSENT", pConsent);
			cmd.addParameter("@P_CONSENT_DATE", pConsentDate);
			cmd.addParameter("@P_CONTACT_METHOD_CODE", pContactMethodCode);
			cmd.addParameter("@P_DOC_VERIFICATION_IND", pDocVerificationInd);
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="GkradivRecRow", dataSourceName="GKRADIV_REC", needsInitialization=true)
	public static class GkradivRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_ADID_CODE")
		public NString RAdidCode;
		@DbRecordField(dataSourceName="R_ADDITIONAL_ID")
		public NString RAdditionalId;
		@DbRecordField(dataSourceName="R_EXEMPT_REASON")
		public NString RExemptReason;
		@DbRecordField(dataSourceName="R_STATUS_CODE")
		public NString RStatusCode;
		@DbRecordField(dataSourceName="R_STATUS_DATE")
		public NDate RStatusDate;
		@DbRecordField(dataSourceName="R_VERIFIED_DATE")
		public NDate RVerifiedDate;
		@DbRecordField(dataSourceName="R_CONSENT")
		public NString RConsent;
		@DbRecordField(dataSourceName="R_CONSENT_DATE")
		public NDate RConsentDate;
		@DbRecordField(dataSourceName="R_CONTACT_METHOD_CODE")
		public NString RContactMethodCode;
		@DbRecordField(dataSourceName="R_DOC_VERIFICATION_IND")
		public NString RDocVerificationInd;
		@DbRecordField(dataSourceName="R_SOURCE")
		public NString RSource;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
