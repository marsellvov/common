package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbUserdefault {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERDEFAULT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pFgacUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERDEFAULT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(UserdefaultRecRow recOne,UserdefaultRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERDEFAULT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, UserdefaultRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, UserdefaultRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pFgacUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERDEFAULT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERDEFAULT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pFgacUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERDEFAULT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pFgacUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERDEFAULT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pFgacUserId,NString pExemptInd,NString pCrossDomainInd,NString pUserId,NString pFdmnCode,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERDEFAULT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_EXEMPT_IND", pExemptInd);
			cmd.addParameter("@P_CROSS_DOMAIN_IND", pCrossDomainInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pFgacUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERDEFAULT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pFgacUserId,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERDEFAULT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pFgacUserId,NString pExemptInd,NString pCrossDomainInd,NString pUserId,NString pFdmnCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_USERDEFAULT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FGAC_USER_ID", pFgacUserId);
			cmd.addParameter("@P_EXEMPT_IND", pExemptInd);
			cmd.addParameter("@P_CROSS_DOMAIN_IND", pCrossDomainInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_FDMN_CODE", pFdmnCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="UserdefaultRecRow", dataSourceName="USERDEFAULT_REC")
	public static class UserdefaultRecRow
	{
		@DbRecordField(dataSourceName="R_FGAC_USER_ID")
		public NString RFgacUserId;
		@DbRecordField(dataSourceName="R_EXEMPT_IND")
		public NString RExemptInd;
		@DbRecordField(dataSourceName="R_CROSS_DOMAIN_IND")
		public NString RCrossDomainInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_FDMN_CODE")
		public NString RFdmnCode;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
