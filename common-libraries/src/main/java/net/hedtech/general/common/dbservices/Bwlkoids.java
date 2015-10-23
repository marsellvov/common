package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkoids {
		public static void pAdventerid(NString term,NString callingProcName,NString callingProcName2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOIDS.P_ADVENTERID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
				
			cmd.execute();


		}
		
		public static void pAdvidsel(NString term,NString callingProcName,NString callingProcName2,NString specifiedSearchCriteria,NString lastName,NString firstName,NString searchType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOIDS.P_ADVIDSEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
			cmd.addParameter("@SPECIFIED_SEARCH_CRITERIA", specifiedSearchCriteria);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@SEARCH_TYPE", searchType);
				
			cmd.execute();


		}
		
		public static void pAdvstoreid(NString xyz,NString sname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOIDS.P_ADVSTOREID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@XYZ", xyz);
			cmd.addParameter("@SNAME", sname);
				
			cmd.execute();


		}
		
		public static void pAdvverifyid(NString studId,NString term,NString callingProcName,NString callingProcName2,NString lastName,NString firstName,NString searchType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOIDS.P_ADVVERIFYID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STUD_ID", studId);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@SEARCH_TYPE", searchType);
				
			cmd.execute();


		}
		
//		public static void pFacenterid(NString term,NString callingProcName,NString callingProcName2,List<OwaUtil.IdentArrRow> termIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOIDS.P_FACENTERID", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TERM", term);
//			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
//			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pFacidsel(NString term,NString callingProcName,NString callingProcName2,NString specifiedSearchCriteria,NString lastName,NString firstName,NString searchType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOIDS.P_FACIDSEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
			cmd.addParameter("@SPECIFIED_SEARCH_CRITERIA", specifiedSearchCriteria);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@SEARCH_TYPE", searchType);
				
			cmd.execute();


		}
		
//		public static void pFacidsel(NString term,NString callingProcName,NString callingProcName2,NString specifiedSearchCriteria,NString lastName,NString firstName,NString searchType,List<OwaUtil.IdentArrRow> termIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOIDS.P_FACIDSEL", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TERM", term);
//			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
//			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
//			cmd.addParameter("@SPECIFIED_SEARCH_CRITERIA", specifiedSearchCriteria);
//			cmd.addParameter("@LAST_NAME", lastName);
//			cmd.addParameter("@FIRST_NAME", firstName);
//			cmd.addParameter("@SEARCH_TYPE", searchType);
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pFacresetpin(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOIDS.P_FACRESETPIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
//		public static void pFacstoreid(NString xyz,NString sname,List<OwaUtil.IdentArrRow> termIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOIDS.P_FACSTOREID", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@XYZ", xyz);
//			cmd.addParameter("@SNAME", sname);
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pFacverifyid(NString studId,NString term,NString callingProcName,NString callingProcName2,NString lastName,NString firstName,NString searchType,List<OwaUtil.IdentArrRow> termIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOIDS.P_FACVERIFYID", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@STUD_ID", studId);
//			cmd.addParameter("@TERM", term);
//			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
//			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
//			cmd.addParameter("@LAST_NAME", lastName);
//			cmd.addParameter("@FIRST_NAME", firstName);
//			cmd.addParameter("@SEARCH_TYPE", searchType);
//			// cmd.addParameter(DbTypes.getTableType("TERM_IN", "", termIn, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pOpenStudentListC(Ref<DataCursor> studentListC,NString lastName,NString firstName,NString searchType,NNumber advrPidm,NString advrTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKOIDS.P_OPEN_STUDENT_LIST_C", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STUDENT_LIST_C", DataCursor.class);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@SEARCH_TYPE", searchType);
			cmd.addParameter("@ADVR_PIDM", advrPidm);
			cmd.addParameter("@ADVR_TERM", advrTerm);
				
			cmd.execute();
			studentListC.val = cmd.getParameterValue("@STUDENT_LIST_C", DataCursor.class);


		}
		
	
	
	@DbRecordType(id="StudentListTypRow", dataSourceName="STUDENT_LIST_TYP")
	public static class StudentListTypRow
	{
		@DbRecordField(dataSourceName="SPRIDEN_PIDM")
		public NNumber SpridenPidm;
		@DbRecordField(dataSourceName="SPRIDEN_LAST_NAME")
		public NString SpridenLastName;
		@DbRecordField(dataSourceName="SPRIDEN_FIRST_NAME")
		public NString SpridenFirstName;
		@DbRecordField(dataSourceName="SPRIDEN_MI")
		public NString SpridenMi;
		@DbRecordField(dataSourceName="ID_TYPE")
		public NString IdType;
		@DbRecordField(dataSourceName="SPRIDEN_ID")
		public NString SpridenId;
	}

	
	
}
