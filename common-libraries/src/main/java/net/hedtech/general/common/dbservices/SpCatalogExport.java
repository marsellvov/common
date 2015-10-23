package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SpCatalogExport {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SP_CATALOG_EXPORT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fGetCourseCatalogXml(NString termIn,NString subjIn,NString titleIn,NString divsIn,NString deptIn,NString collIn,NString schdIn,NString levlIn,NString attrIn,NString crseStrtIn,NString crseEndIn,NString credFromIn,NString credToIn,NString lastUpdated) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SP_CATALOG_EXPORT.F_GET_COURSE_CATALOG_XML", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SUBJ_IN", subjIn);
			cmd.addParameter("@TITLE_IN", titleIn);
			cmd.addParameter("@DIVS_IN", divsIn);
			cmd.addParameter("@DEPT_IN", deptIn);
			cmd.addParameter("@COLL_IN", collIn);
			cmd.addParameter("@SCHD_IN", schdIn);
			cmd.addParameter("@LEVL_IN", levlIn);
			cmd.addParameter("@ATTR_IN", attrIn);
			cmd.addParameter("@CRSE_STRT_IN", crseStrtIn);
			cmd.addParameter("@CRSE_END_IN", crseEndIn);
			cmd.addParameter("@CRED_FROM_IN", credFromIn);
			cmd.addParameter("@CRED_TO_IN", credToIn);
			cmd.addParameter("@LAST_UPDATED", lastUpdated);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<SoTransferCourseNtRow> fGetCourses(NString termIn,NString subjIn,NString titleIn,NString divsIn,NString deptIn,NString collIn,NString schdIn,NString levlIn,NString attrIn,NString crseStrtIn,NString crseEndIn,NString credFromIn,NString credToIn,NString lastUpdated) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SP_CATALOG_EXPORT.F_GET_COURSES", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<SoTransferCourseNtRow>.class);
//			cmd.addParameter("@TERM_IN", termIn);
//			cmd.addParameter("@SUBJ_IN", subjIn);
//			cmd.addParameter("@TITLE_IN", titleIn);
//			cmd.addParameter("@DIVS_IN", divsIn);
//			cmd.addParameter("@DEPT_IN", deptIn);
//			cmd.addParameter("@COLL_IN", collIn);
//			cmd.addParameter("@SCHD_IN", schdIn);
//			cmd.addParameter("@LEVL_IN", levlIn);
//			cmd.addParameter("@ATTR_IN", attrIn);
//			cmd.addParameter("@CRSE_STRT_IN", crseStrtIn);
//			cmd.addParameter("@CRSE_END_IN", crseEndIn);
//			cmd.addParameter("@CRED_FROM_IN", credFromIn);
//			cmd.addParameter("@CRED_TO_IN", credToIn);
//			cmd.addParameter("@LAST_UPDATED", lastUpdated);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<SoTransferCourseNtRow>.class);
//
//		}
//		
	
	
	
}
