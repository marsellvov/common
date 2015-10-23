package net.hedtech.general.common.dbservices;

import static morphis.foundations.core.appsupportlib.Globals.getGlobal;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbCmUserSetup {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_SETUP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}

		public static NString fExists(NString pCmUserId) {
			
			NString pRowid = NString.getNull();
			
			return fExists( pCmUserId, pRowid);

		}		
		
		public static NString fExists(NString pCmUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_SETUP.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CM_USER_ID", pCmUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CmUserSetupRecRow recOne,CmUserSetupRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_SETUP.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CmUserSetupRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CmUserSetupRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_SETUP.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_SETUP.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCmUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_SETUP.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CM_USER_ID", pCmUserId);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pCmUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_SETUP.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CM_USER_ID", pCmUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pCmUserId,NString pCmscOptionInd,NString pExcludeInd,NString pUserId,NString pCmscCode,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_SETUP.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CM_USER_ID", pCmUserId);
			cmd.addParameter("@P_CMSC_OPTION_IND", pCmscOptionInd);
			cmd.addParameter("@P_EXCLUDE_IND", pExcludeInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pCmUserId,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_SETUP.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CM_USER_ID", pCmUserId);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pCmUserId,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_SETUP.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CM_USER_ID", pCmUserId);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}

		
		public static void pUpdate(NString pCmUserId,NString pCmscOptionInd,NString pExcludeInd,NString pUserId,NString pCmscCode,NString pRowid) {
			// DEFAULT dml_common.f_unspecified_string
			NString pDataOrigin = DmlCommon.fUnspecifiedString();
			
			pUpdate( pCmUserId, pCmscOptionInd, pExcludeInd, pUserId, pCmscCode, pDataOrigin, pRowid);
		}		
		
		public static void pUpdate(NString pCmUserId,NString pCmscOptionInd,NString pExcludeInd,NString pUserId,NString pCmscCode,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_CM_USER_SETUP.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CM_USER_ID", pCmUserId);
			cmd.addParameter("@P_CMSC_OPTION_IND", pCmscOptionInd);
			cmd.addParameter("@P_EXCLUDE_IND", pExcludeInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_CMSC_CODE", pCmscCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CmUserSetupRecRow", dataSourceName="CM_USER_SETUP_REC")
	public static class CmUserSetupRecRow
	{
		@DbRecordField(dataSourceName="R_CM_USER_ID")
		public NString RCmUserId;
		@DbRecordField(dataSourceName="R_CMSC_OPTION_IND")
		public NString RCmscOptionInd;
		@DbRecordField(dataSourceName="R_EXCLUDE_IND")
		public NString RExcludeInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_CMSC_CODE")
		public NString RCmscCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
