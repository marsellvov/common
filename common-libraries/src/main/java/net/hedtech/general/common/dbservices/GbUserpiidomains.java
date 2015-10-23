package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbUserpiidomains {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERPIIDOMAINS.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pFgacUserId,NString pFdmnCodePii,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERPIIDOMAINS.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_FDMN_CODE_PII", pFdmnCodePii);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(UserpiidomainsRecRow recOne,UserpiidomainsRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERPIIDOMAINS.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, UserpiidomainsRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, UserpiidomainsRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pFgacUserId,NString pFdmnCodePii) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERPIIDOMAINS.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_FDMN_CODE_PII", pFdmnCodePii);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERPIIDOMAINS.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pFgacUserId,NString pFdmnCodePii) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERPIIDOMAINS.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_FDMN_CODE_PII", pFdmnCodePii);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pFgacUserId,NString pFdmnCodePii,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERPIIDOMAINS.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_FDMN_CODE_PII", pFdmnCodePii);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pFgacUserId,NString pFdmnCodePii,NString pUserId,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERPIIDOMAINS.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_FDMN_CODE_PII", pFdmnCodePii);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pFgacUserId,NString pFdmnCodePii,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERPIIDOMAINS.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_FDMN_CODE_PII", pFdmnCodePii);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pFgacUserId,NString pFdmnCodePii,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERPIIDOMAINS.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_FDMN_CODE_PII", pFdmnCodePii);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pFgacUserId,NString pFdmnCodePii,NString pUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERPIIDOMAINS.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_FDMN_CODE_PII", pFdmnCodePii);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="UserpiidomainsRecRow", dataSourceName="USERPIIDOMAINS_REC")
	public static class UserpiidomainsRecRow
	{
		@DbRecordField(dataSourceName="R_FGAC_USER_ID")
		public NString RFgacUserId;
		@DbRecordField(dataSourceName="R_FDMN_CODE_PII")
		public NString RFdmnCodePii;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
