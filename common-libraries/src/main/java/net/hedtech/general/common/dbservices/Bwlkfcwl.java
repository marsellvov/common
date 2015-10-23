package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkfcwl {
		public static NNumber fFacclalistpagesize() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFCWL.F_FACCLALISTPAGESIZE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pFacclalist(NString term,NString crn,NNumber targetRec,NNumber classSize,NString displayEmail) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFCWL.P_FACCLALIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@TARGET_REC", targetRec);
			cmd.addParameter("@CLASS_SIZE", classSize);
			cmd.addParameter("@DISPLAY_EMAIL", displayEmail);
				
			cmd.execute();


		}
		
		public static void pFacclalistsum(NString term,NString crn,NNumber targetRec,NNumber classSize,NString displayEmail) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFCWL.P_FACCLALISTSUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@TARGET_REC", targetRec);
			cmd.addParameter("@CLASS_SIZE", classSize);
			cmd.addParameter("@DISPLAY_EMAIL", displayEmail);
				
			cmd.execute();


		}
		
		public static void pFacclawaitdtl(NNumber pidm,NNumber stuRecNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFCWL.P_FACCLAWAITDTL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@STU_REC_NUMBER", stuRecNumber);
				
			cmd.execute();


		}
		
		public static void pFacclawaitsum(NNumber pidm,NNumber stuRecNumber,NString gradeAccess) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFCWL.P_FACCLAWAITSUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@STU_REC_NUMBER", stuRecNumber);
			cmd.addParameter("@GRADE_ACCESS", gradeAccess);
				
			cmd.execute();


		}
		
		public static void pFaccwcrnhdr(NString pSummaryLink,NString pWlSummaryLink) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFCWL.P_FACCWCRNHDR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUMMARY_LINK", pSummaryLink);
			cmd.addParameter("@P_WL_SUMMARY_LINK", pWlSummaryLink);
				
			cmd.execute();


		}
		
		public static void pFaccwstuhdrsum() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFCWL.P_FACCWSTUHDRSUM", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pFacwaitlist(NString term,NString crn,NString displayEmail) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFCWL.P_FACWAITLIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@DISPLAY_EMAIL", displayEmail);
				
			cmd.execute();


		}
		
		public static void pFacwaitlistsum(NString term,NString crn,NString displayEmail) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFCWL.P_FACWAITLISTSUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@DISPLAY_EMAIL", displayEmail);
				
			cmd.execute();


		}
		
		public static void pPrintlinks(NNumber pageSizeIn,NNumber classSizeIn,NString crnIn,NString termIn,NNumber targetIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFCWL.P_PRINTLINKS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAGE_SIZE_IN", pageSizeIn);
			cmd.addParameter("@CLASS_SIZE_IN", classSizeIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@TARGET_IN", targetIn);
				
			cmd.execute();


		}
		
	
	
	
}
