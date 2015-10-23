package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TsSbLargeStudentPop {
		public static void pCreateStudent(NString termin,NString toTermin,NString pSubj,NString pCrse,NNumber pNoofrecords) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TS_SB_LARGE_STUDENT_POP.P_CREATE_STUDENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERMIN", termin);
			cmd.addParameter("@TO_TERMIN", toTermin);
			cmd.addParameter("@P_SUBJ", pSubj);
			cmd.addParameter("@P_CRSE", pCrse);
			cmd.addParameter("@P_NOOFRECORDS", pNoofrecords);
				
			cmd.execute();


		}
		
	
	
	
}
