package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpktesb {
		public static void pCertification(NString jobsseqno,NNumber attemptno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTESB.P_CERTIFICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@ATTEMPTNO", attemptno);
				
			cmd.execute();


		}
		
		public static void pCertificationdriver(NString jobsseqno,NString usrid,NString pinno,NNumber attemptno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTESB.P_CERTIFICATIONDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@USRID", usrid);
			cmd.addParameter("@PINNO", pinno);
			cmd.addParameter("@ATTEMPTNO", attemptno);
				
			cmd.execute();


		}
		
		public static void pCertifytime(NString jobsseqno,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTESB.P_CERTIFYTIME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@PAR_RESTART", parRestart);
			cmd.addParameter("@PAR_UPDATE", parUpdate);
			cmd.addParameter("@PAR_SUBMIT", parSubmit);
			cmd.addParameter("@PAR_RECALL", parRecall);
				
			cmd.execute();


		}
		
		public static void pDisplaytimesheetpreview(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString shift,NString specialrate,NString dateselected,NString hours) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTESB.P_DISPLAYTIMESHEETPREVIEW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@LASTDATE", lastdate);
			cmd.addParameter("@PAR_RESTART", parRestart);
			cmd.addParameter("@PAR_UPDATE", parUpdate);
			cmd.addParameter("@PAR_SUBMIT", parSubmit);
			cmd.addParameter("@PAR_RECALL", parRecall);
			cmd.addParameter("@EARNCODE", earncode);
			cmd.addParameter("@SHIFT", shift);
			cmd.addParameter("@SPECIALRATE", specialrate);
			cmd.addParameter("@DATESELECTED", dateselected);
			cmd.addParameter("@HOURS", hours);
				
			cmd.execute();


		}
		
		public static void pRecalltime(NString pJobsseqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTESB.P_RECALLTIME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOBSSEQNO", pJobsseqno);
				
			cmd.execute();


		}
		
		public static void pRestart(NString jobsseqno,NString actiontype,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTESB.P_RESTART", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@ACTIONTYPE", actiontype);
			cmd.addParameter("@PAR_RESTART", parRestart);
			cmd.addParameter("@PAR_UPDATE", parUpdate);
			cmd.addParameter("@PAR_SUBMIT", parSubmit);
			cmd.addParameter("@PAR_RECALL", parRecall);
				
			cmd.execute();


		}
		
		public static void pRestartdriver(NString jobsseqno,NString actiontype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTESB.P_RESTARTDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@ACTIONTYPE", actiontype);
				
			cmd.execute();


		}
		
		public static void pUpdatetimestatus(NString jobsseqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTESB.P_UPDATETIMESTATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
				
			cmd.execute();


		}
		
	
	
	
}
