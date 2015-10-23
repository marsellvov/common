package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;
import static morphis.foundations.core.types.Types.*;


public class GbDomains {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pFdmnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(DomainsRecRow recOne,DomainsRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, DomainsRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, DomainsRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pFdmnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static Cursor fQueryOne(NString pFdmnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pFdmnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pFdmnCode,NString pTableName,NString pFdtpCode,NString pSysReqInd,NString pEnablePiiInd,NString pUserId,NString pPiiColumnName,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINS.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_FDTP_CODE", pFdtpCode);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_ENABLE_PII_IND", pEnablePiiInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PII_COLUMN_NAME", pPiiColumnName);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pFdmnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pFdmnCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pFdmnCode,NString pTableName,NString pFdtpCode,NString pSysReqInd,NString pEnablePiiInd,NString pUserId,NString pPiiColumnName,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINS.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_TABLE_NAME", pTableName);
			cmd.addParameter("@P_FDTP_CODE", pFdtpCode);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_ENABLE_PII_IND", pEnablePiiInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PII_COLUMN_NAME", pPiiColumnName);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="DomainsRecRow", dataSourceName="DOMAINS_REC")
	public static class DomainsRecRow
	{
		
		@DbRecordField(dataSourceName="R_FDMN_CODE")
		public NString RFdmnCode;
		@DbRecordField(dataSourceName="R_TABLE_NAME")
		public NString RTableName;
		@DbRecordField(dataSourceName="R_FDTP_CODE")
		public NString RFdtpCode;
		@DbRecordField(dataSourceName="R_SYS_REQ_IND")
		public NString RSysReqInd;
		@DbRecordField(dataSourceName="R_ENABLE_PII_IND")
		public NString REnablePiiInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_PII_COLUMN_NAME")
		public NString RPiiColumnName;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
		
		public DomainsRecRow() {
			super();
		}
		
		public DomainsRecRow(Row lvDomainCurResults) {
			super();
			RFdmnCode= toStr(lvDomainCurResults.getObject(1));
			RTableName= toStr(lvDomainCurResults.getObject(2));
			RFdtpCode= toStr(lvDomainCurResults.getObject(3));
			RSysReqInd= toStr(lvDomainCurResults.getObject(4));
			REnablePiiInd= toStr(lvDomainCurResults.getObject(5));
			RUserId= toStr(lvDomainCurResults.getObject(6));
			RPiiColumnName= toStr(lvDomainCurResults.getObject(7));
			RInternalRecordId= toStr(lvDomainCurResults.getObject(8));
			
		}
		
	}
	

	
	
}
