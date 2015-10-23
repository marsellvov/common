package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbDomaintype {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINTYPE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pFdtpCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINTYPE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FDTP_CODE", pFdtpCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(DomaintypeRecRow recOne,DomaintypeRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINTYPE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, DomaintypeRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, DomaintypeRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pFdtpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINTYPE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FDTP_CODE", pFdtpCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINTYPE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pFdtpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINTYPE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FDTP_CODE", pFdtpCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pFdtpCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINTYPE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FDTP_CODE", pFdtpCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pFdtpCode,NString pPredicateInd,NString pSysReqInd,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINTYPE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FDTP_CODE", pFdtpCode);
			cmd.addParameter("@P_PREDICATE_IND", pPredicateInd);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pFdtpCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINTYPE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FDTP_CODE", pFdtpCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pFdtpCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINTYPE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FDTP_CODE", pFdtpCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pFdtpCode,NString pPredicateInd,NString pSysReqInd,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_DOMAINTYPE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FDTP_CODE", pFdtpCode);
			cmd.addParameter("@P_PREDICATE_IND", pPredicateInd);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="DomaintypeRecRow", dataSourceName="DOMAINTYPE_REC")
	public static class DomaintypeRecRow
	{
		@DbRecordField(dataSourceName="R_FDTP_CODE")
		public NString RFdtpCode;
		@DbRecordField(dataSourceName="R_PREDICATE_IND")
		public NString RPredicateInd;
		@DbRecordField(dataSourceName="R_SYS_REQ_IND")
		public NString RSysReqInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
