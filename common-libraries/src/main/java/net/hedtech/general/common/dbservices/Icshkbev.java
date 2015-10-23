package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Icshkbev {
		public static void pGradeChange(NNumber pidm,NString term,NNumber tcknSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSHKBEV.P_GRADE_CHANGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@TCKN_SEQ_NO", tcknSeqNo);
				
			cmd.execute();


		}
		
		public static void pGradeRoll(NNumber pidm,NString term,NNumber tcknSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("ICSHKBEV.P_GRADE_ROLL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@TCKN_SEQ_NO", tcknSeqNo);
				
			cmd.execute();


		}
		
	
	
	
}
