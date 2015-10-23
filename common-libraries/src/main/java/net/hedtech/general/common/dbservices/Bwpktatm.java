package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpktatm {
		public static void pDefaultspecialrate(NNumber parPidm,NString parPosn,NString parSuff,NString parEarnCode,NString parShift,NDate parTimeEntryDate,NString parRateInd,Ref<NNumber> parSpecialrate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTATM.P_DEFAULTSPECIALRATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_POSN", parPosn);
			cmd.addParameter("@PAR_SUFF", parSuff);
			cmd.addParameter("@PAR_EARN_CODE", parEarnCode);
			cmd.addParameter("@PAR_SHIFT", parShift);
			cmd.addParameter("@PAR_TIME_ENTRY_DATE", parTimeEntryDate);
			cmd.addParameter("@PAR_RATE_IND", parRateInd);
			cmd.addParameter("@PAR_SPECIALRATE", parSpecialrate, true);
				
			cmd.execute();
			parSpecialrate.val = cmd.getParameterValue("@PAR_SPECIALRATE", NNumber.class);


		}
		
		public static void pEntertimesheet(NString jobsseqno,NString typeentry,NString lastdate,NString earncode,NString shift,NString specialrate,NString dateselected,NString hours) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTATM.P_ENTERTIMESHEET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@TYPEENTRY", typeentry);
			cmd.addParameter("@LASTDATE", lastdate);
			cmd.addParameter("@EARNCODE", earncode);
			cmd.addParameter("@SHIFT", shift);
			cmd.addParameter("@SPECIALRATE", specialrate);
			cmd.addParameter("@DATESELECTED", dateselected);
			cmd.addParameter("@HOURS", hours);
				
			cmd.execute();


		}
		
		public static void pTimesheetbuttonsdriver(NString jobsseqno,NString typeentry,NString actiontype,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString buttonselected,NString earncode,NString shift,NString specialrate,NString dateselected,NString hours) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTATM.P_TIMESHEETBUTTONSDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@TYPEENTRY", typeentry);
			cmd.addParameter("@ACTIONTYPE", actiontype);
			cmd.addParameter("@LASTDATE", lastdate);
			cmd.addParameter("@PAR_RESTART", parRestart);
			cmd.addParameter("@PAR_UPDATE", parUpdate);
			cmd.addParameter("@PAR_SUBMIT", parSubmit);
			cmd.addParameter("@PAR_RECALL", parRecall);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
			cmd.addParameter("@EARNCODE", earncode);
			cmd.addParameter("@SHIFT", shift);
			cmd.addParameter("@SPECIALRATE", specialrate);
			cmd.addParameter("@DATESELECTED", dateselected);
			cmd.addParameter("@HOURS", hours);
				
			cmd.execute();


		}
		
		public static void pUpdatetimesheet(NString jobsseqno,NString typeentry,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString buttonselected,NString defaultshift,NString earncode,NString shift,NString specialrate,NString dateselected,NString hours) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTATM.P_UPDATETIMESHEET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@TYPEENTRY", typeentry);
			cmd.addParameter("@LASTDATE", lastdate);
			cmd.addParameter("@PAR_RESTART", parRestart);
			cmd.addParameter("@PAR_UPDATE", parUpdate);
			cmd.addParameter("@PAR_SUBMIT", parSubmit);
			cmd.addParameter("@PAR_RECALL", parRecall);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
			cmd.addParameter("@DEFAULTSHIFT", defaultshift);
			cmd.addParameter("@EARNCODE", earncode);
			cmd.addParameter("@SHIFT", shift);
			cmd.addParameter("@SPECIALRATE", specialrate);
			cmd.addParameter("@DATESELECTED", dateselected);
			cmd.addParameter("@HOURS", hours);
				
			cmd.execute();


		}
		
	
	
	
}
