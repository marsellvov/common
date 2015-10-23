package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pektime {
		public static NString fGetEarnUnitInd(NString code) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTIME.F_GET_EARN_UNIT_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CODE", code);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCalcTimeInOut(NNumber jobsSeqno,NString earnCode,NNumber specialRate,NDate timeEntryDate,NString shcdCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTIME.P_CALC_TIME_IN_OUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO", jobsSeqno);
			cmd.addParameter("@EARN_CODE", earnCode);
			cmd.addParameter("@SPECIAL_RATE", specialRate);
			cmd.addParameter("@TIME_ENTRY_DATE", timeEntryDate);
			cmd.addParameter("@SHCD_CODE", shcdCode);
				
			cmd.execute();


		}
		
		public static void pCalcTimeInOutShift(NNumber jobsSeqno,NString earnCode,NNumber specialRate,NDate timeEntryDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTIME.P_CALC_TIME_IN_OUT_SHIFT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO", jobsSeqno);
			cmd.addParameter("@EARN_CODE", earnCode);
			cmd.addParameter("@SPECIAL_RATE", specialRate);
			cmd.addParameter("@TIME_ENTRY_DATE", timeEntryDate);
				
			cmd.execute();


		}
		
		public static void pReadTime(NNumber jobsSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTIME.P_READ_TIME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO", jobsSeqno);
				
			cmd.execute();


		}
		
		public static void pUpdatePettime(NNumber jobsSeqno,NString earnCode,NString shift,NNumber specialRate,NNumber counter,NNumber hrs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTIME.P_UPDATE_PETTIME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO", jobsSeqno);
			cmd.addParameter("@EARN_CODE", earnCode);
			cmd.addParameter("@SHIFT", shift);
			cmd.addParameter("@SPECIAL_RATE", specialRate);
			cmd.addParameter("@COUNTER", counter);
			cmd.addParameter("@HRS", hrs);
				
			cmd.execute();


		}
		
		public static void pWriteTime(NNumber jobsSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PEKTIME.P_WRITE_TIME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBS_SEQNO", jobsSeqno);
				
			cmd.execute();


		}
		
	
	
	
}
