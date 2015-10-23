package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpktasb {
		public static void pCertifytime(NString jobsseqno,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTASB.P_CERTIFYTIME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@PAR_RESTART", parRestart);
			cmd.addParameter("@PAR_UPDATE", parUpdate);
			cmd.addParameter("@PAR_SUBMIT", parSubmit);
			cmd.addParameter("@PAR_RECALL", parRecall);
				
			cmd.execute();


		}
		
		public static void pRestart(NString jobsseqno,NString actiontype,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTASB.P_RESTART", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@ACTIONTYPE", actiontype);
			cmd.addParameter("@PAR_RESTART", parRestart);
			cmd.addParameter("@PAR_UPDATE", parUpdate);
			cmd.addParameter("@PAR_SUBMIT", parSubmit);
			cmd.addParameter("@PAR_RECALL", parRecall);
				
			cmd.execute();


		}
		
		public static void pRestartdriver(NString jobsseqno,NString actiontype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTASB.P_RESTARTDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@ACTIONTYPE", actiontype);
				
			cmd.execute();


		}
		
		public static void pUpdatetimestatus(NString jobsseqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTASB.P_UPDATETIMESTATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
				
			cmd.execute();


		}
		
	
	
	
}
