package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlksybs {
		public static void pFacSyllabus(NString term,NString crn,NString msgIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKSYBS.P_FAC_SYLLABUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@MSG_IN", msgIn);
				
			cmd.execute();


		}
		
		public static void pFacSyllabusPost(NString termIn,NString crnIn,NString titleIn,NString urlIn,NString syloIn,NString syrmIn,NString sytrIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKSYBS.P_FAC_SYLLABUS_POST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@TITLE_IN", titleIn);
			cmd.addParameter("@URL_IN", urlIn);
			cmd.addParameter("@SYLO_IN", syloIn);
			cmd.addParameter("@SYRM_IN", syrmIn);
			cmd.addParameter("@SYTR_IN", sytrIn);
				
			cmd.execute();


		}
		
	
	
	
}
