package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbEnrollmentRules {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ENROLLMENT_RULES.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pAidyCode,NString pEnrrCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ENROLLMENT_RULES.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EnrollmentRulesRecRow recOne,EnrollmentRulesRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ENROLLMENT_RULES.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EnrollmentRulesRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EnrollmentRulesRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pAidyCode,NString pEnrrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ENROLLMENT_RULES.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ENROLLMENT_RULES.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pAidyCode,NString pEnrrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ENROLLMENT_RULES.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pAidyCode,NString pEnrrCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ENROLLMENT_RULES.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NString fStandard() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ENROLLMENT_RULES.F_STANDARD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCreate(NString pAidyCode,NString pEnrrCode,NString pRepCourseInd,NString pCourseInPgrmInd,NString pRemedialCourseInd,NString pAttendVerifyInd,NString pSystemReqInd,NString pComment,NNumber pRepCourseCount,NString pUserId,NString pDataOrigin,NString pCountWdAsRepeatInd,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ENROLLMENT_RULES.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
			cmd.addParameter("@P_REP_COURSE_IND", pRepCourseInd);
			cmd.addParameter("@P_COURSE_IN_PGRM_IND", pCourseInPgrmInd);
			cmd.addParameter("@P_REMEDIAL_COURSE_IND", pRemedialCourseInd);
			cmd.addParameter("@P_ATTEND_VERIFY_IND", pAttendVerifyInd);
			cmd.addParameter("@P_SYSTEM_REQ_IND", pSystemReqInd);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_REP_COURSE_COUNT", pRepCourseCount);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_COUNT_WD_AS_REPEAT_IND", pCountWdAsRepeatInd);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pAidyCode,NString pEnrrCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ENROLLMENT_RULES.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pAidyCode,NString pEnrrCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ENROLLMENT_RULES.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pAidyCode,NString pEnrrCode,NString pRepCourseInd,NString pCourseInPgrmInd,NString pRemedialCourseInd,NString pAttendVerifyInd,NString pSystemReqInd,NString pComment,NNumber pRepCourseCount,NString pUserId,NString pDataOrigin,NString pCountWdAsRepeatInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_ENROLLMENT_RULES.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ENRR_CODE", pEnrrCode);
			cmd.addParameter("@P_REP_COURSE_IND", pRepCourseInd);
			cmd.addParameter("@P_COURSE_IN_PGRM_IND", pCourseInPgrmInd);
			cmd.addParameter("@P_REMEDIAL_COURSE_IND", pRemedialCourseInd);
			cmd.addParameter("@P_ATTEND_VERIFY_IND", pAttendVerifyInd);
			cmd.addParameter("@P_SYSTEM_REQ_IND", pSystemReqInd);
			cmd.addParameter("@P_COMMENT", pComment);
			cmd.addParameter("@P_REP_COURSE_COUNT", pRepCourseCount);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_COUNT_WD_AS_REPEAT_IND", pCountWdAsRepeatInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EnrollmentRulesRecRow", dataSourceName="ENROLLMENT_RULES_REC")
	public static class EnrollmentRulesRecRow
	{
		@DbRecordField(dataSourceName="R_AIDY_CODE")
		public NString RAidyCode;
		@DbRecordField(dataSourceName="R_ENRR_CODE")
		public NString REnrrCode;
		@DbRecordField(dataSourceName="R_REP_COURSE_IND")
		public NString RRepCourseInd;
		@DbRecordField(dataSourceName="R_COURSE_IN_PGRM_IND")
		public NString RCourseInPgrmInd;
		@DbRecordField(dataSourceName="R_REMEDIAL_COURSE_IND")
		public NString RRemedialCourseInd;
		@DbRecordField(dataSourceName="R_ATTEND_VERIFY_IND")
		public NString RAttendVerifyInd;
		@DbRecordField(dataSourceName="R_SYSTEM_REQ_IND")
		public NString RSystemReqInd;
		@DbRecordField(dataSourceName="R_COMMENT")
		public NString RComment;
		@DbRecordField(dataSourceName="R_REP_COURSE_COUNT")
		public NNumber RRepCourseCount;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_COUNT_WD_AS_REPEAT_IND")
		public NString RCountWdAsRepeatInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
