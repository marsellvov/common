package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpktapp {
		public static void pButtonsdriver(NString jobsseqno,NString buttonselected,NString scriptDis) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAPP.P_BUTTONSDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
			cmd.addParameter("@SCRIPT_DIS", scriptDis);
				
			cmd.execute();


		}
		
		public static void pDelete(NString jobsseqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAPP.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
				
			cmd.execute();


		}
		
		public static void pDeletedriver(NString jobsseqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAPP.P_DELETEDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
				
			cmd.execute();


		}
		
		public static void pDeletejobsseqtab(NString jobsseqno,NNumber pidmIn,Ref<NNumber> nextJobsSeqnoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAPP.P_DELETEJOBSSEQTAB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@NEXT_JOBS_SEQNO_OUT", NNumber.class);
				
			cmd.execute();
			nextJobsSeqnoOut.val = cmd.getParameterValue("@NEXT_JOBS_SEQNO_OUT", NNumber.class);


		}
		
		public static void pDisplaytimedriver(NString jobsseqno,NString anchorselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAPP.P_DISPLAYTIMEDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@ANCHORSELECTED", anchorselected);
				
			cmd.execute();


		}
		
		public static void pGetnextjobsseqtab(NString jobsseqno,NNumber pidmIn,Ref<NNumber> nextJobsSeqnoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAPP.P_GETNEXTJOBSSEQTAB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@NEXT_JOBS_SEQNO_OUT", NNumber.class);
				
			cmd.execute();
			nextJobsSeqnoOut.val = cmd.getParameterValue("@NEXT_JOBS_SEQNO_OUT", NNumber.class);


		}
		
		public static void pGetprevjobsseqtab(NString jobsseqno,NNumber pidmIn,Ref<NNumber> prevJobsSeqnoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAPP.P_GETPREVJOBSSEQTAB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PREV_JOBS_SEQNO_OUT", NNumber.class);
				
			cmd.execute();
			prevJobsSeqnoOut.val = cmd.getParameterValue("@PREV_JOBS_SEQNO_OUT", NNumber.class);


		}
		
		public static void pInsertjobsseqtab(NString jobsseqno,NNumber pidmIn,NNumber nextIndexIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAPP.P_INSERTJOBSSEQTAB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@NEXT_INDEX_IN", nextIndexIn);
				
			cmd.execute();


		}
		
		public static void pRestart(NString jobsseqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAPP.P_RESTART", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
				
			cmd.execute();


		}
		
		public static void pRestartdriver(NString jobsseqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAPP.P_RESTARTDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
				
			cmd.execute();


		}
		
	
	
	
}
