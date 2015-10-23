package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkpreq {
//		public static void pGetDwPrereqDescription(NString pTermCode,NString pSubjCode,NString pCrseNumb,NString pCrn,Ref<List<DwPrereqDescriptionTabtypeRow>> pPrereqDescriptionTableOut,Ref<List<DwPrereqCourseRefTabtypeRow>> pPrereqCourseRefTableOut,Ref<NString> pErrorOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKPREQ.P_GET_DW_PREREQ_DESCRIPTION", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_TERM_CODE", pTermCode);
//			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
//			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
//			cmd.addParameter("@P_CRN", pCrn);
//			// cmd.addParameter(DbTypes.getTableType("P_PREREQ_DESCRIPTION_TABLE_OUT", "", object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PREREQ_COURSE_REF_TABLE_OUT", "", object.class));
//			cmd.addParameter("@P_ERROR_OUT", NString.class);
//				
//			cmd.execute();
//			// pPrereqDescriptionTableOut.val = cmd.getTableParameterValue("@P_PREREQ_DESCRIPTION_TABLE_OUT", object.class);
//			// pPrereqCourseRefTableOut.val = cmd.getTableParameterValue("@P_PREREQ_COURSE_REF_TABLE_OUT", object.class);
//			pErrorOut.val = cmd.getParameterValue("@P_ERROR_OUT", NString.class);
//
//
//		}
		
		public static void pPrerequisitecheck(NString termIn,NNumber pidmIn,Ref<NBool> preqErrorFound,NString tempTableIndIn,Ref<NString> cappTechError,NString runTypeIn,NString preqSeverityIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKPREQ.P_PREREQUISITECHECK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PREQ_ERROR_FOUND", preqErrorFound, true);
			cmd.addParameter("@TEMP_TABLE_IND_IN", tempTableIndIn);
			cmd.addParameter("@CAPP_TECH_ERROR", NString.class);
			cmd.addParameter("@RUN_TYPE_IN", runTypeIn);
			cmd.addParameter("@PREQ_SEVERITY_IN", preqSeverityIn);
				
			cmd.execute();
			preqErrorFound.val = cmd.getParameterValue("@PREQ_ERROR_FOUND", NBool.class);
			cappTechError.val = cmd.getParameterValue("@CAPP_TECH_ERROR", NString.class);


		}
		
//		public static void pPrerequisitecheck(NString termIn,NNumber pidmIn,Ref<NBool> preqErrorFound,NString tempTableIndIn,Ref<NString> cappTechError,NString runTypeIn,NString preqSeverityIn,List<OwaUtil.IdentArrRow> multiTermListIn,NString adminProcessingIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKPREQ.P_PREREQUISITECHECK", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@PIDM_IN", pidmIn);
//			cmd.addParameter("@PREQ_ERROR_FOUND", preqErrorFound, true);
//			cmd.addParameter("@TEMP_TABLE_IND_IN", tempTableIndIn);
//			cmd.addParameter("@CAPP_TECH_ERROR", NString.class);
//			cmd.addParameter("@RUN_TYPE_IN", runTypeIn);
//			cmd.addParameter("@PREQ_SEVERITY_IN", preqSeverityIn);
//			// cmd.addParameter(DbTypes.getTableType("MULTI_TERM_LIST_IN", "", multiTermListIn, object.class));
//			cmd.addParameter("@ADMIN_PROCESSING_IN", adminProcessingIn);
//				
//			cmd.execute();
//			preqErrorFound.val = cmd.getParameterValue("@PREQ_ERROR_FOUND", NBool.class);
//			cappTechError.val = cmd.getParameterValue("@CAPP_TECH_ERROR", NString.class);
//
//
//		}
		
	
	
	@DbRecordType(id="DwPrereqCourseRefRectypeRow", dataSourceName="DW_PREREQ_COURSE_REF_RECTYPE")
	public static class DwPrereqCourseRefRectypeRow
	{
		@DbRecordField(dataSourceName="ORDER_SEQUENCE")
		public NNumber OrderSequence;
		@DbRecordField(dataSourceName="HIDDEN_IND")
		public NBool HiddenInd;
		@DbRecordField(dataSourceName="SUBJ_CODE")
		public NString SubjCode;
		@DbRecordField(dataSourceName="CRSE_NUMB")
		public NString CrseNumb;
	}

	
	
}
