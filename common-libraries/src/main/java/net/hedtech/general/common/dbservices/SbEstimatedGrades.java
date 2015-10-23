package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEstimatedGrades {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ESTIMATED_GRADES.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pSurrogateId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ESTIMATED_GRADES.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NNumber pSessionId,NNumber pPidm,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ESTIMATED_GRADES.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SESSION_ID", pSessionId);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EstimatedGradesRecRow recOne,EstimatedGradesRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ESTIMATED_GRADES.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EstimatedGradesRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EstimatedGradesRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<EstimatedGradesTabRow> fQueryAll(NNumber pSessionId,NNumber pPidm,NString pCrn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ESTIMATED_GRADES.F_QUERY_ALL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<EstimatedGradesTabRow>.class);
//			cmd.addParameter("@P_SESSION_ID", pSessionId);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_CRN", pCrn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<EstimatedGradesTabRow>.class);
//
//		}
		
		public static EstimatedGradesRecRow fQueryOne(NNumber pSurrogateId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ESTIMATED_GRADES.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(EstimatedGradesRecRow.class));
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
				
			cmd.execute();

			return cmd.getReturnValue(EstimatedGradesRecRow.class);

		}
		
		public static EstimatedGradesRecRow fQueryOne(NNumber pSessionId,NNumber pPidm,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ESTIMATED_GRADES.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(EstimatedGradesRecRow.class));
			cmd.addParameter("@P_SESSION_ID", pSessionId);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(EstimatedGradesRecRow.class);

		}
		
		public static void pCreate(Ref<NNumber> pSurrogateIdOut,NNumber pSfbffscId,NNumber pStudentPidm,NString pCrn,NNumber pFacultyPidm,NString pStatusCde,NString pGrdeCode,NString pComments,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ESTIMATED_GRADES.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SURROGATE_ID_OUT", NNumber.class);
			cmd.addParameter("@P_SFBFFSC_ID", pSfbffscId);
			cmd.addParameter("@P_STUDENT_PIDM", pStudentPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_FACULTY_PIDM", pFacultyPidm);
			cmd.addParameter("@P_STATUS_CDE", pStatusCde);
			cmd.addParameter("@P_GRDE_CODE", pGrdeCode);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();
			pSurrogateIdOut.val = cmd.getParameterValue("@P_SURROGATE_ID_OUT", NNumber.class);


		}
		
		public static void pDelete(NNumber pSurrogateId,NNumber pVersion) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ESTIMATED_GRADES.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_VERSION", pVersion);
				
			cmd.execute();


		}
		
		public static void pMonitorStudents(NString pTermCode,NString pDescription,NString pApplication,NString pSelection,NString pCreatorId,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ESTIMATED_GRADES.P_MONITOR_STUDENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_APPLICATION", pApplication);
			cmd.addParameter("@P_SELECTION", pSelection);
			cmd.addParameter("@P_CREATOR_ID", pCreatorId);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
		public static void pUpdate(NNumber pSurrogateId,NNumber pSfbffscId,NNumber pStudentPidm,NString pCrn,NNumber pFacultyPidm,NString pStatusCde,NString pGrdeCode,NString pComments,NNumber pVersion,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ESTIMATED_GRADES.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SURROGATE_ID", pSurrogateId);
			cmd.addParameter("@P_SFBFFSC_ID", pSfbffscId);
			cmd.addParameter("@P_STUDENT_PIDM", pStudentPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_FACULTY_PIDM", pFacultyPidm);
			cmd.addParameter("@P_STATUS_CDE", pStatusCde);
			cmd.addParameter("@P_GRDE_CODE", pGrdeCode);
			cmd.addParameter("@P_COMMENTS", pComments);
			cmd.addParameter("@P_VERSION", pVersion);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EstimatedGradesRecRow", dataSourceName="ESTIMATED_GRADES_REC")
	public static class EstimatedGradesRecRow
	{
		@DbRecordField(dataSourceName="R_SURROGATE_ID")
		public NNumber RSurrogateId;
		@DbRecordField(dataSourceName="R_SFBFFSC_ID")
		public NNumber RSfbffscId;
		@DbRecordField(dataSourceName="R_STUDENT_PIDM")
		public NNumber RStudentPidm;
		@DbRecordField(dataSourceName="R_CRN")
		public NString RCrn;
		@DbRecordField(dataSourceName="R_FACULTY_PIDM")
		public NNumber RFacultyPidm;
		@DbRecordField(dataSourceName="R_STATUS_CDE")
		public NString RStatusCde;
		@DbRecordField(dataSourceName="R_GRDE_CODE")
		public NString RGrdeCode;
		@DbRecordField(dataSourceName="R_COMMENTS")
		public NString RComments;
		@DbRecordField(dataSourceName="R_VERSION")
		public NNumber RVersion;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_ACTIVITY_DATE")
		public NDate RActivityDate;
	}

	
	
}
