package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbLearnermodule {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNERMODULE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pLmodCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNERMODULE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(LearnermoduleRecRow recOne,LearnermoduleRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNERMODULE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, LearnermoduleRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, LearnermoduleRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pLmodCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNERMODULE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNERMODULE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pLmodCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNERMODULE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pLmodCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNERMODULE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pLmodCode,NString pSysReqInd,NNumber pMaxCurricula,NNumber pMaxMajors,NNumber pMaxMinors,NNumber pMaxConcentrations,NString pUserId,NDate pActivityDate,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNERMODULE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_MAX_CURRICULA", pMaxCurricula);
			cmd.addParameter("@P_MAX_MAJORS", pMaxMajors);
			cmd.addParameter("@P_MAX_MINORS", pMaxMinors);
			cmd.addParameter("@P_MAX_CONCENTRATIONS", pMaxConcentrations);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pLmodCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNERMODULE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pLmodCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNERMODULE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pLmodCode,NString pSysReqInd,NNumber pMaxCurricula,NNumber pMaxMajors,NNumber pMaxMinors,NNumber pMaxConcentrations,NString pUserId,NDate pActivityDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_LEARNERMODULE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LMOD_CODE", pLmodCode);
			cmd.addParameter("@P_SYS_REQ_IND", pSysReqInd);
			cmd.addParameter("@P_MAX_CURRICULA", pMaxCurricula);
			cmd.addParameter("@P_MAX_MAJORS", pMaxMajors);
			cmd.addParameter("@P_MAX_MINORS", pMaxMinors);
			cmd.addParameter("@P_MAX_CONCENTRATIONS", pMaxConcentrations);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="LearnermoduleRecRow", dataSourceName="LEARNERMODULE_REC")
	public static class LearnermoduleRecRow
	{
		@DbRecordField(dataSourceName="R_LMOD_CODE")
		public NString RLmodCode;
		@DbRecordField(dataSourceName="R_SYS_REQ_IND")
		public NString RSysReqInd;
		@DbRecordField(dataSourceName="R_MAX_CURRICULA")
		public NNumber RMaxCurricula;
		@DbRecordField(dataSourceName="R_MAX_MAJORS")
		public NNumber RMaxMajors;
		@DbRecordField(dataSourceName="R_MAX_MINORS")
		public NNumber RMaxMinors;
		@DbRecordField(dataSourceName="R_MAX_CONCENTRATIONS")
		public NNumber RMaxConcentrations;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
