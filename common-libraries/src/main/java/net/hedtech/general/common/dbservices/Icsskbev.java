package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Icsskbev {
		public static void pMessageproc(NString sessionid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKBEV.P_MESSAGEPROC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SESSIONID", sessionid);
				
			cmd.execute();


		}
		
		public static void pSectionCancelled(NString term,NString crn,NString sstsCode,NString subjCode,NString crseNumb,NString seqNumb,NString sectTitle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSSKBEV.P_SECTION_CANCELLED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@SSTS_CODE", sstsCode);
			cmd.addParameter("@SUBJ_CODE", subjCode);
			cmd.addParameter("@CRSE_NUMB", crseNumb);
			cmd.addParameter("@SEQ_NUMB", seqNumb);
			cmd.addParameter("@SECT_TITLE", sectTitle);
				
			cmd.execute();


		}
		
	
	
	
}
