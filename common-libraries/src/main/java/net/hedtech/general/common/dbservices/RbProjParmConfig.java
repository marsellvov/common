package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbProjParmConfig {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROJ_PARM_CONFIG.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pGroupName,NString pParameter,NString pData,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROJ_PARM_CONFIG.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
			cmd.addParameter("@P_PARAMETER", pParameter);
			cmd.addParameter("@P_DATA", pData);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ProjParmConfigRecRow recOne,ProjParmConfigRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROJ_PARM_CONFIG.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ProjParmConfigRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ProjParmConfigRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pGroupName,NString pParameter,NString pData) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROJ_PARM_CONFIG.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
			cmd.addParameter("@P_PARAMETER", pParameter);
			cmd.addParameter("@P_DATA", pData);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROJ_PARM_CONFIG.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pGroupName,NString pParameter,NString pData) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROJ_PARM_CONFIG.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
			cmd.addParameter("@P_PARAMETER", pParameter);
			cmd.addParameter("@P_DATA", pData);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pGroupName,NString pParameter,NString pData,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROJ_PARM_CONFIG.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
			cmd.addParameter("@P_PARAMETER", pParameter);
			cmd.addParameter("@P_DATA", pData);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pGroupName,NString pParameter,NString pActiveInd,NString pData,NString pDescription,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROJ_PARM_CONFIG.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
			cmd.addParameter("@P_PARAMETER", pParameter);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_DATA", pData);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pGroupName,NString pParameter,NString pData,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROJ_PARM_CONFIG.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
			cmd.addParameter("@P_PARAMETER", pParameter);
			cmd.addParameter("@P_DATA", pData);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pGroupName,NString pParameter,NString pData,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROJ_PARM_CONFIG.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
			cmd.addParameter("@P_PARAMETER", pParameter);
			cmd.addParameter("@P_DATA", pData);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pGroupName,NString pParameter,NString pActiveInd,NString pData,NString pDescription,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_PROJ_PARM_CONFIG.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GROUP_NAME", pGroupName);
			cmd.addParameter("@P_PARAMETER", pParameter);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_DATA", pData);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ProjParmConfigRecRow", dataSourceName="PROJ_PARM_CONFIG_REC")
	public static class ProjParmConfigRecRow
	{
		@DbRecordField(dataSourceName="R_GROUP_NAME")
		public NString RGroupName;
		@DbRecordField(dataSourceName="R_PARAMETER")
		public NString RParameter;
		@DbRecordField(dataSourceName="R_ACTIVE_IND")
		public NString RActiveInd;
		@DbRecordField(dataSourceName="R_DATA")
		public NString RData;
		@DbRecordField(dataSourceName="R_DESCRIPTION")
		public NString RDescription;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
