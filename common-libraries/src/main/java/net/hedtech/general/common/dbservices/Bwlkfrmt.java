package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkfrmt {
		public static void pCourseInfo(NString termIn,NString crnIn,NString courseLinkIn,NString crnLinkIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFRMT.P_COURSE_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@COURSE_LINK_IN", courseLinkIn);
			cmd.addParameter("@CRN_LINK_IN", crnLinkIn);
				
			cmd.execute();


		}
		
		public static void pEnrollCount(NString termIn,NString crnIn,NString pSummaryLink,NString pWlSummaryLink) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFRMT.P_ENROLL_COUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@P_SUMMARY_LINK", pSummaryLink);
			cmd.addParameter("@P_WL_SUMMARY_LINK", pWlSummaryLink);
				
			cmd.execute();


		}
		
	
	
	
}
