package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpktalc {
		public static void pComments(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString shift,NString specialrate,NString dateselected,NString hours,NString textin,NString conf) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTALC.P_COMMENTS", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@TEXTIN", textin);
			cmd.addParameter("@CONF", conf);
				
			cmd.execute();


		}
		
		public static void pDeleteperelbd(NNumber parJobsSeqno,NString parEarnCode,NString parShift,NNumber parSpecialRate,NDate parTimeEntryDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTALC.P_DELETEPERELBD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_JOBS_SEQNO", parJobsSeqno);
			cmd.addParameter("@PAR_EARN_CODE", parEarnCode);
			cmd.addParameter("@PAR_SHIFT", parShift);
			cmd.addParameter("@PAR_SPECIAL_RATE", parSpecialRate);
			cmd.addParameter("@PAR_TIME_ENTRY_DATE", parTimeEntryDate);
				
			cmd.execute();


		}
		
		public static void pDisplayjlbd(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString shift,NString specialrate,NString dateselected,NString copytype,NString linenumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTALC.P_DISPLAYJLBD", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@COPYTYPE", copytype);
			cmd.addParameter("@LINENUMBER", linenumber);
				
			cmd.execute();


		}
		
		public static void pDispleavborrowed(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString shift,NString specialrate,NString dateselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTALC.P_DISPLEAVBORROWED", DbManager.getDataBaseFactory());
			
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
				
			cmd.execute();


		}
		
		public static void pInsertperelbd(NNumber parJobsSeqno,NString parEarnCode,NString parShift,NNumber parSpecialRate,NDate parTimeEntryDate,NNumber parSeqno,NString parCoasCode,NString parAcciCode,NString parFundCode,NString parOrgnCode,NString parAcctCode,NString parProgCode,NString parActvCode,NString parLocnCode,NString parProjCode,NString parCtypCode,NString parAcctCodeExternal,NNumber parHrs,NDate parActivityDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTALC.P_INSERTPERELBD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_JOBS_SEQNO", parJobsSeqno);
			cmd.addParameter("@PAR_EARN_CODE", parEarnCode);
			cmd.addParameter("@PAR_SHIFT", parShift);
			cmd.addParameter("@PAR_SPECIAL_RATE", parSpecialRate);
			cmd.addParameter("@PAR_TIME_ENTRY_DATE", parTimeEntryDate);
			cmd.addParameter("@PAR_SEQNO", parSeqno);
			cmd.addParameter("@PAR_COAS_CODE", parCoasCode);
			cmd.addParameter("@PAR_ACCI_CODE", parAcciCode);
			cmd.addParameter("@PAR_FUND_CODE", parFundCode);
			cmd.addParameter("@PAR_ORGN_CODE", parOrgnCode);
			cmd.addParameter("@PAR_ACCT_CODE", parAcctCode);
			cmd.addParameter("@PAR_PROG_CODE", parProgCode);
			cmd.addParameter("@PAR_ACTV_CODE", parActvCode);
			cmd.addParameter("@PAR_LOCN_CODE", parLocnCode);
			cmd.addParameter("@PAR_PROJ_CODE", parProjCode);
			cmd.addParameter("@PAR_CTYP_CODE", parCtypCode);
			cmd.addParameter("@PAR_ACCT_CODE_EXTERNAL", parAcctCodeExternal);
			cmd.addParameter("@PAR_HRS", parHrs);
			cmd.addParameter("@PAR_ACTIVITY_DATE", parActivityDate);
				
			cmd.execute();


		}
		
//		public static void pJlbd(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString shift,NString specialrate,NString dateselected,NString copytype,NString linenumber,List<Twbklibs.Varchar2TabtypeRow> jlbdhour,List<Twbklibs.Varchar2TabtypeRow> jlbdacctexternal) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTALC.P_JLBD", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@JOBSSEQNO", jobsseqno);
//			cmd.addParameter("@LASTDATE", lastdate);
//			cmd.addParameter("@PAR_RESTART", parRestart);
//			cmd.addParameter("@PAR_UPDATE", parUpdate);
//			cmd.addParameter("@PAR_SUBMIT", parSubmit);
//			cmd.addParameter("@PAR_RECALL", parRecall);
//			cmd.addParameter("@EARNCODE", earncode);
//			cmd.addParameter("@SHIFT", shift);
//			cmd.addParameter("@SPECIALRATE", specialrate);
//			cmd.addParameter("@DATESELECTED", dateselected);
//			cmd.addParameter("@COPYTYPE", copytype);
//			cmd.addParameter("@LINENUMBER", linenumber);
//			// cmd.addParameter(DbTypes.getTableType("JLBDHOUR", "", jlbdhour, object.class));
//			// cmd.addParameter(DbTypes.getTableType("JLBDACCTEXTERNAL", "", jlbdacctexternal, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pJlbdbuttonsdriver(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString shift,NString specialrate,NString dateselected,NString copytype,NString linenumber,NString buttonselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTALC.P_JLBDBUTTONSDRIVER", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@COPYTYPE", copytype);
			cmd.addParameter("@LINENUMBER", linenumber);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
				
			cmd.execute();


		}
		
		public static void pUpdatecomments(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString buttonselected,NString earncode,NString shift,NString specialrate,NString dateselected,NString hours,NString textin,NString conf) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTALC.P_UPDATECOMMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
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
			cmd.addParameter("@TEXTIN", textin);
			cmd.addParameter("@CONF", conf);
				
			cmd.execute();


		}
		
//		public static void pUpdatenofinjlbd(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString shift,NString specialrate,NString dateselected,NString copytype,NString linenumber,List<Twbklibs.Varchar2TabtypeRow> jlbdhour,List<Twbklibs.Varchar2TabtypeRow> jlbdacctexternal,NString buttonselected) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTALC.P_UPDATENOFINJLBD", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@JOBSSEQNO", jobsseqno);
//			cmd.addParameter("@LASTDATE", lastdate);
//			cmd.addParameter("@PAR_RESTART", parRestart);
//			cmd.addParameter("@PAR_UPDATE", parUpdate);
//			cmd.addParameter("@PAR_SUBMIT", parSubmit);
//			cmd.addParameter("@PAR_RECALL", parRecall);
//			cmd.addParameter("@EARNCODE", earncode);
//			cmd.addParameter("@SHIFT", shift);
//			cmd.addParameter("@SPECIALRATE", specialrate);
//			cmd.addParameter("@DATESELECTED", dateselected);
//			cmd.addParameter("@COPYTYPE", copytype);
//			cmd.addParameter("@LINENUMBER", linenumber);
//			// cmd.addParameter(DbTypes.getTableType("JLBDHOUR", "", jlbdhour, object.class));
//			// cmd.addParameter(DbTypes.getTableType("JLBDACCTEXTERNAL", "", jlbdacctexternal, object.class));
//			cmd.addParameter("@BUTTONSELECTED", buttonselected);
//				
//			cmd.execute();
//
//
//		}
//		
//	
	
	
}
