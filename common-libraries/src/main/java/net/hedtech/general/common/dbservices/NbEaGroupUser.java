package net.hedtech.general.common.dbservices;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class NbEaGroupUser {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_EA_GROUP_USER.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAgrpCode,NString pOriginatorUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_EA_GROUP_USER.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AGRP_CODE", pAgrpCode);
			cmd.addParameter("@P_ORIGINATOR_USER_ID", pOriginatorUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EaGroupUserRecRow recOne,EaGroupUserRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_EA_GROUP_USER.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EaGroupUserRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EaGroupUserRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAgrpCode,NString pOriginatorUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_EA_GROUP_USER.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AGRP_CODE", pAgrpCode);
			cmd.addParameter("@P_ORIGINATOR_USER_ID", pOriginatorUserId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_EA_GROUP_USER.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAgrpCode,NString pOriginatorUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_EA_GROUP_USER.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AGRP_CODE", pAgrpCode);
			cmd.addParameter("@P_ORIGINATOR_USER_ID", pOriginatorUserId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAgrpCode,NString pOriginatorUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_EA_GROUP_USER.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AGRP_CODE", pAgrpCode);
			cmd.addParameter("@P_ORIGINATOR_USER_ID", pOriginatorUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAgrpCode,NString pOriginatorUserId,NString pUserId,NString pDataOrigin,Ref<byte[]> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_EA_GROUP_USER.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AGRP_CODE", pAgrpCode);
			cmd.addParameter("@P_ORIGINATOR_USER_ID", pOriginatorUserId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", String.class).getBytes();


		}
		
		public static void pDelete(NString pAgrpCode,NString pOriginatorUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_EA_GROUP_USER.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AGRP_CODE", pAgrpCode);
			cmd.addParameter("@P_ORIGINATOR_USER_ID", pOriginatorUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pAgrpCode,NString pOriginatorUserId,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_EA_GROUP_USER.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AGRP_CODE", pAgrpCode);
			cmd.addParameter("@P_ORIGINATOR_USER_ID", pOriginatorUserId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAgrpCode,NString pOriginatorUserId,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_EA_GROUP_USER.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AGRP_CODE", pAgrpCode);
			cmd.addParameter("@P_ORIGINATOR_USER_ID", pOriginatorUserId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EaGroupUserRecRow", dataSourceName="EA_GROUP_USER_REC")
	public static class EaGroupUserRecRow
	{
		@DbRecordField(dataSourceName="R_AGRP_CODE")
		public NString RAgrpCode;
		@DbRecordField(dataSourceName="R_ORIGINATOR_USER_ID")
		public NString ROriginatorUserId;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
