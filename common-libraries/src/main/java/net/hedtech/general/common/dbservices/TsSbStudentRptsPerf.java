package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TsSbStudentRptsPerf {
		public static void pCreateCrns(NString pTermprefix,NNumber pNoofterm,NString pSubjprefix,NNumber pNoofsubj,NNumber pNoofcrse,NNumber pNoofcrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TS_SB_STUDENT_RPTS_PERF.P_CREATE_CRNS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERMPREFIX", pTermprefix);
			cmd.addParameter("@P_NOOFTERM", pNoofterm);
			cmd.addParameter("@P_SUBJPREFIX", pSubjprefix);
			cmd.addParameter("@P_NOOFSUBJ", pNoofsubj);
			cmd.addParameter("@P_NOOFCRSE", pNoofcrse);
			cmd.addParameter("@P_NOOFCRN", pNoofcrn);
				
			cmd.execute();


		}
		
		public static void pCreateStudent(NNumber pCntstart,NString termin,NString pIdprefix,NString pTermprefix,NString pSubjprefix,NNumber pNoofrecords) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TS_SB_STUDENT_RPTS_PERF.P_CREATE_STUDENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CNTSTART", pCntstart);
			cmd.addParameter("@TERMIN", termin);
			cmd.addParameter("@P_IDPREFIX", pIdprefix);
			cmd.addParameter("@P_TERMPREFIX", pTermprefix);
			cmd.addParameter("@P_SUBJPREFIX", pSubjprefix);
			cmd.addParameter("@P_NOOFRECORDS", pNoofrecords);
				
			cmd.execute();


		}
		
		public static void pCreateStudentRecord(NNumber pCntstart,NString pIdprefix,NString pTermprefix,NString pSubjprefix,NNumber pNoofrecords) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TS_SB_STUDENT_RPTS_PERF.P_CREATE_STUDENT_RECORD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CNTSTART", pCntstart);
			cmd.addParameter("@P_IDPREFIX", pIdprefix);
			cmd.addParameter("@P_TERMPREFIX", pTermprefix);
			cmd.addParameter("@P_SUBJPREFIX", pSubjprefix);
			cmd.addParameter("@P_NOOFRECORDS", pNoofrecords);
				
			cmd.execute();


		}
		
		public static void pCreateTerms(NString pTermprefix,NNumber pNoofrecords) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TS_SB_STUDENT_RPTS_PERF.P_CREATE_TERMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERMPREFIX", pTermprefix);
			cmd.addParameter("@P_NOOFRECORDS", pNoofrecords);
				
			cmd.execute();


		}
		
		public static void pMassData() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TS_SB_STUDENT_RPTS_PERF.P_MASS_DATA", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
