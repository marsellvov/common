package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbEndorsement {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ENDORSEMENT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pCertCode,NString pEndsCode,NDate pEndsDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ENDORSEMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
			cmd.addParameter("@P_ENDS_CODE", pEndsCode);
			cmd.addParameter("@P_ENDS_DATE", pEndsDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EndorsementRecRow recOne,EndorsementRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ENDORSEMENT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EndorsementRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EndorsementRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pCertCode,NString pEndsCode,NDate pEndsDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ENDORSEMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
			cmd.addParameter("@P_ENDS_CODE", pEndsCode);
			cmd.addParameter("@P_ENDS_DATE", pEndsDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ENDORSEMENT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pCertCode,NString pEndsCode,NDate pEndsDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ENDORSEMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
			cmd.addParameter("@P_ENDS_CODE", pEndsCode);
			cmd.addParameter("@P_ENDS_DATE", pEndsDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pCertCode,NString pEndsCode,NDate pEndsDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ENDORSEMENT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
			cmd.addParameter("@P_ENDS_CODE", pEndsCode);
			cmd.addParameter("@P_ENDS_DATE", pEndsDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCopyAll(NNumber pPidm,NString pCertCode,NString pCertCodeNew) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ENDORSEMENT.P_COPY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
			cmd.addParameter("@P_CERT_CODE_NEW", pCertCodeNew);
				
			cmd.execute();


		}
		
		public static void pCreate(NNumber pPidm,NString pCertCode,NString pEndsCode,NDate pEndsDate,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ENDORSEMENT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
			cmd.addParameter("@P_ENDS_CODE", pEndsCode);
			cmd.addParameter("@P_ENDS_DATE", pEndsDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pCertCode,NString pEndsCode,NDate pEndsDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ENDORSEMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
			cmd.addParameter("@P_ENDS_CODE", pEndsCode);
			cmd.addParameter("@P_ENDS_DATE", pEndsDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pDeleteAll(NNumber pPidm,NString pCertCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ENDORSEMENT.P_DELETE_ALL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pCertCode,NString pEndsCode,NDate pEndsDate,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ENDORSEMENT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
			cmd.addParameter("@P_ENDS_CODE", pEndsCode);
			cmd.addParameter("@P_ENDS_DATE", pEndsDate);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pCertCode,NString pEndsCode,NDate pEndsDate,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_ENDORSEMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
			cmd.addParameter("@P_ENDS_CODE", pEndsCode);
			cmd.addParameter("@P_ENDS_DATE", pEndsDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EndorsementRecRow", dataSourceName="ENDORSEMENT_REC")
	public static class EndorsementRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_CERT_CODE")
		public NString RCertCode;
		@DbRecordField(dataSourceName="R_ENDS_CODE")
		public NString REndsCode;
		@DbRecordField(dataSourceName="R_ENDS_DATE")
		public NDate REndsDate;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
