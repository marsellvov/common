package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Icsckcom {
		public static NString fCalcValidCourseLdimode(NString subjCodeIn,NString crseNumbIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSCKCOM.F_CALC_VALID_COURSE_LDIMODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
			cmd.addParameter("@CRSE_NUMB_IN", crseNumbIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static CollegeRecTypeRow fGetCollege(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSCKCOM.F_GET_COLLEGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(CollegeRecTypeRow.class));
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(CollegeRecTypeRow.class);

		}
		
		public static CourseRecTypeRow fGetCourse(NString subjCodeIn,NString crseNumbIn,NString instCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSCKCOM.F_GET_COURSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(CourseRecTypeRow.class));
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
			cmd.addParameter("@CRSE_NUMB_IN", crseNumbIn);
			cmd.addParameter("@INST_CODE_IN", instCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(CourseRecTypeRow.class);

		}
		
		public static EventHeaderRecTypeRow fGetCourseEventHeader(NString subjCodeIn,NString crseNumbIn,NString actionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSCKCOM.F_GET_COURSE_EVENT_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(EventHeaderRecTypeRow.class));
			cmd.addParameter("@SUBJ_CODE_IN", subjCodeIn);
			cmd.addParameter("@CRSE_NUMB_IN", crseNumbIn);
			cmd.addParameter("@ACTION_IN", actionIn);
				
			cmd.execute();

			return cmd.getReturnValue(EventHeaderRecTypeRow.class);

		}
		
		public static DepartmentRecTypeRow fGetDepartment(NString codeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSCKCOM.F_GET_DEPARTMENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(DepartmentRecTypeRow.class));
			cmd.addParameter("@CODE_IN", codeIn);
				
			cmd.execute();

			return cmd.getReturnValue(DepartmentRecTypeRow.class);

		}
		
		public static EventHeaderRecTypeRow fGetEventHeader(NString codeIn,NString source,NString action) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSCKCOM.F_GET_EVENT_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(EventHeaderRecTypeRow.class));
			cmd.addParameter("@CODE_IN", codeIn);
			cmd.addParameter("@SOURCE", source);
			cmd.addParameter("@ACTION", action);
				
			cmd.execute();

			return cmd.getReturnValue(EventHeaderRecTypeRow.class);

		}
		
	
	
	@DbRecordType(id="CollegeRecTypeRow", dataSourceName="COLLEGE_REC_TYPE")
	public static class CollegeRecTypeRow
	{
		@DbRecordField(dataSourceName="SHORT_DESC")
		public NString ShortDesc;
		@DbRecordField(dataSourceName="LONG_DESC")
		public NString LongDesc;
	}

	
	@DbRecordType(id="CourseRecTypeRow", dataSourceName="COURSE_REC_TYPE")
	public static class CourseRecTypeRow
	{
		@DbRecordField(dataSourceName="PARENT_SOURCEDID_ID")
		public NString ParentSourcedidId;
		@DbRecordField(dataSourceName="SHORT_DESC")
		public NString ShortDesc;
		@DbRecordField(dataSourceName="LONG_DESC")
		public NString LongDesc;
		@DbRecordField(dataSourceName="COLL_SOURCEDID_ID")
		public NString CollSourcedidId;
		@DbRecordField(dataSourceName="DEPT_SOURCEDID_ID")
		public NString DeptSourcedidId;
	}

	
	@DbRecordType(id="DepartmentRecTypeRow", dataSourceName="DEPARTMENT_REC_TYPE")
	public static class DepartmentRecTypeRow
	{
		@DbRecordField(dataSourceName="SHORT_DESC")
		public NString ShortDesc;
		@DbRecordField(dataSourceName="LONG_DESC")
		public NString LongDesc;
	}

	
	@DbRecordType(id="EventHeaderRecTypeRow", dataSourceName="EVENT_HEADER_REC_TYPE")
	public static class EventHeaderRecTypeRow
	{
		@DbRecordField(dataSourceName="INTEGRATION_SOURCE")
		public NString IntegrationSource;
		@DbRecordField(dataSourceName="SOURCEDID_ID")
		public NString SourcedidId;
		@DbRecordField(dataSourceName="ONLINETOPIC")
		public NString Onlinetopic;
		@DbRecordField(dataSourceName="RECSTATUS")
		public NString Recstatus;
	}

	
	
}
