package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkdoen {
		public static void pOpenenrollmentdetail(NNumber pidm,NString dcde,NString amt1,NString amt2,NString amt3,NString amt4,NString opt1,NString opt2,NString opt3,NString opt4,NString opt5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOEN.P_OPENENROLLMENTDETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@AMT2", amt2);
			cmd.addParameter("@AMT3", amt3);
			cmd.addParameter("@AMT4", amt4);
			cmd.addParameter("@OPT1", opt1);
			cmd.addParameter("@OPT2", opt2);
			cmd.addParameter("@OPT3", opt3);
			cmd.addParameter("@OPT4", opt4);
			cmd.addParameter("@OPT5", opt5);
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentfuncs(NNumber pidm,NString func) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOEN.P_OPENENROLLMENTFUNCS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@FUNC", func);
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentgroup(NNumber pidm,NString dgrp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOEN.P_OPENENROLLMENTGROUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DGRP", dgrp);
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentmain(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOEN.P_OPENENROLLMENTMAIN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pOpenenrollmentupdate(NNumber pidm,NString dcde,NString amt1,NString amt2,NString amt3,NString amt4,NString opt1,NString opt2,NString opt3,NString opt4,NString opt5) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDOEN.P_OPENENROLLMENTUPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DCDE", dcde);
			cmd.addParameter("@AMT1", amt1);
			cmd.addParameter("@AMT2", amt2);
			cmd.addParameter("@AMT3", amt3);
			cmd.addParameter("@AMT4", amt4);
			cmd.addParameter("@OPT1", opt1);
			cmd.addParameter("@OPT2", opt2);
			cmd.addParameter("@OPT3", opt3);
			cmd.addParameter("@OPT4", opt4);
			cmd.addParameter("@OPT5", opt5);
				
			cmd.execute();


		}
		
	
	
	
}
