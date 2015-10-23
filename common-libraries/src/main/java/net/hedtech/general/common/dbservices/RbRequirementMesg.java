package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbRequirementMesg {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT_MESG.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NString pTreqCode,NString pMesgCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT_MESG.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_MESG_CODE", pMesgCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(RequirementMesgRecRow recOne,RequirementMesgRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT_MESG.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, RequirementMesgRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, RequirementMesgRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NString pTreqCode,NString pMesgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT_MESG.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_MESG_CODE", pMesgCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT_MESG.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NString pTreqCode,NString pMesgCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT_MESG.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_MESG_CODE", pMesgCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NString pTreqCode,NString pMesgCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT_MESG.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_MESG_CODE", pMesgCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pAidyCode,NString pTreqCode,NString pMesgCode,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT_MESG.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_MESG_CODE", pMesgCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pAidyCode,NString pTreqCode,NString pMesgCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT_MESG.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_MESG_CODE", pMesgCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pAidyCode,NString pTreqCode,NString pMesgCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_REQUIREMENT_MESG.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TREQ_CODE", pTreqCode);
			cmd.addParameter("@P_MESG_CODE", pMesgCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
	
	
	@DbRecordType(id="RequirementMesgRecRow", dataSourceName="REQUIREMENT_MESG_REC")
	public static class RequirementMesgRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_TREQ_CODE")
		public NString RTreqCode;
		@DbRecordField(dataSourceName="R_MESG_CODE")
		public NString RMesgCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
