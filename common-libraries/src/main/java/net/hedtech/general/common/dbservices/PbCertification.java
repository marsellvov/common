package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbCertification {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CERTIFICATION.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pCertCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CERTIFICATION.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CertificationRecRow recOne,CertificationRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CERTIFICATION.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CertificationRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CertificationRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pCertCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CERTIFICATION.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CERTIFICATION.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pCertCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CERTIFICATION.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pCertCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CERTIFICATION.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pCertCode,NDate pCertDate,NDate pNextCertDate,NDate pExpireDate,NString pCertNo,NString pLcsvCode,NString pStatCode,NString pNatnCode,NString pComments,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CERTIFICATION.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
			cmd.addParameter("@P_CERT_DATE", pCertDate);
			cmd.addParameter("@P_NEXT_CERT_DATE", pNextCertDate);
			cmd.addParameter("@P_EXPIRE_DATE", pExpireDate);
			cmd.addParameter("@P_CERT_NO", pCertNo);
			cmd.addParameter("@P_LCSV_CODE", pLcsvCode);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pCertCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CERTIFICATION.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pCertCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CERTIFICATION.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pCertCode,NDate pCertDate,NDate pNextCertDate,NDate pExpireDate,NString pCertNo,NString pLcsvCode,NString pStatCode,NString pNatnCode,NString pComments,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_CERTIFICATION.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CERT_CODE", pCertCode);
			cmd.addParameter("@P_CERT_DATE", pCertDate);
			cmd.addParameter("@P_NEXT_CERT_DATE", pNextCertDate);
			cmd.addParameter("@P_EXPIRE_DATE", pExpireDate);
			cmd.addParameter("@P_CERT_NO", pCertNo);
			cmd.addParameter("@P_LCSV_CODE", pLcsvCode);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CertificationRecRow", dataSourceName="CERTIFICATION_REC")
	public static class CertificationRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_CERT_CODE")
		public NString RCertCode;
		@DbRecordField(dataSourceName="R_CERT_DATE")
		public NDate RCertDate;
		@DbRecordField(dataSourceName="R_NEXT_CERT_DATE")
		public NDate RNextCertDate;
		@DbRecordField(dataSourceName="R_EXPIRE_DATE")
		public NDate RExpireDate;
		@DbRecordField(dataSourceName="R_CERT_NO")
		public NString RCertNo;
		@DbRecordField(dataSourceName="R_LCSV_CODE")
		public NString RLcsvCode;
		@DbRecordField(dataSourceName="R_STAT_CODE")
		public NString RStatCode;
		@DbRecordField(dataSourceName="R_NATN_CODE")
		public NString RNatnCode;
		@DbRecordField(dataSourceName="R_COMMENTS")
		public NString RComments;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
