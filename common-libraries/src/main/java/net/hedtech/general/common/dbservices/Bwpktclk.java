package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpktclk {
		public static void pAnswermidnightquestion(NString pBtnselected,NString pJobsseqno,NString pLastdate,NString pRestart,NString pUpdate,NString pSubmit,NString pRecall,NString pEarncode,NString pDateselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTCLK.P_ANSWERMIDNIGHTQUESTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BTNSELECTED", pBtnselected);
			cmd.addParameter("@P_JOBSSEQNO", pJobsseqno);
			cmd.addParameter("@P_LASTDATE", pLastdate);
			cmd.addParameter("@P_RESTART", pRestart);
			cmd.addParameter("@P_UPDATE", pUpdate);
			cmd.addParameter("@P_SUBMIT", pSubmit);
			cmd.addParameter("@P_RECALL", pRecall);
			cmd.addParameter("@P_EARNCODE", pEarncode);
			cmd.addParameter("@P_DATESELECTED", pDateselected);
				
			cmd.execute();


		}
		
		public static void pAskmidnightquestion(NString pJobsseqno,NString pLastdate,NString pEarncode,NString pDateselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTCLK.P_ASKMIDNIGHTQUESTION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOBSSEQNO", pJobsseqno);
			cmd.addParameter("@P_LASTDATE", pLastdate);
			cmd.addParameter("@P_EARNCODE", pEarncode);
			cmd.addParameter("@P_DATESELECTED", pDateselected);
				
			cmd.execute();


		}
		
//		public static void pClockinout(NString jobsseqno,NString lastdate,NString earncode,NString dateselected,NString linenumber,List<Twbklibs.Varchar2TabtypeRow> shift,List<Twbklibs.Varchar2TabtypeRow> systimein,List<Twbklibs.Varchar2TabtypeRow> systimeinam,List<Twbklibs.Varchar2TabtypeRow> timein,List<Twbklibs.Varchar2TabtypeRow> timeinam,List<Twbklibs.Varchar2TabtypeRow> systimeout,List<Twbklibs.Varchar2TabtypeRow> systimeoutam,List<Twbklibs.Varchar2TabtypeRow> timeout,List<Twbklibs.Varchar2TabtypeRow> timeoutam,List<Twbklibs.Varchar2TabtypeRow> commentin,List<Twbklibs.Varchar2TabtypeRow> commentindate,List<Twbklibs.Varchar2TabtypeRow> commentout,List<Twbklibs.Varchar2TabtypeRow> commentoutdate) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTCLK.P_CLOCKINOUT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@JOBSSEQNO", jobsseqno);
//			cmd.addParameter("@LASTDATE", lastdate);
//			cmd.addParameter("@EARNCODE", earncode);
//			cmd.addParameter("@DATESELECTED", dateselected);
//			cmd.addParameter("@LINENUMBER", linenumber);
//			// cmd.addParameter(DbTypes.getTableType("SHIFT", "", shift, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SYSTIMEIN", "", systimein, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SYSTIMEINAM", "", systimeinam, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TIMEIN", "", timein, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TIMEINAM", "", timeinam, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SYSTIMEOUT", "", systimeout, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SYSTIMEOUTAM", "", systimeoutam, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TIMEOUT", "", timeout, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TIMEOUTAM", "", timeoutam, object.class));
//			// cmd.addParameter(DbTypes.getTableType("COMMENTIN", "", commentin, object.class));
//			// cmd.addParameter(DbTypes.getTableType("COMMENTINDATE", "", commentindate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("COMMENTOUT", "", commentout, object.class));
//			// cmd.addParameter(DbTypes.getTableType("COMMENTOUTDATE", "", commentoutdate, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pClockinoutcommentwindow(NString pJobsseqno,NString pEarncode,NString pDateselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTCLK.P_CLOCKINOUTCOMMENTWINDOW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOBSSEQNO", pJobsseqno);
			cmd.addParameter("@P_EARNCODE", pEarncode);
			cmd.addParameter("@P_DATESELECTED", pDateselected);
				
			cmd.execute();


		}
		
		public static void pDeleteclockinout(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString dateselected,NString linenumber,NString sourceind) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTCLK.P_DELETECLOCKINOUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@LASTDATE", lastdate);
			cmd.addParameter("@PAR_RESTART", parRestart);
			cmd.addParameter("@PAR_UPDATE", parUpdate);
			cmd.addParameter("@PAR_SUBMIT", parSubmit);
			cmd.addParameter("@PAR_RECALL", parRecall);
			cmd.addParameter("@EARNCODE", earncode);
			cmd.addParameter("@DATESELECTED", dateselected);
			cmd.addParameter("@LINENUMBER", linenumber);
			cmd.addParameter("@SOURCEIND", sourceind);
				
			cmd.execute();


		}
		
		public static void pDeletedriverclockinout(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString dateselected,NString linenumber,NString sourceind) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTCLK.P_DELETEDRIVERCLOCKINOUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@LASTDATE", lastdate);
			cmd.addParameter("@PAR_RESTART", parRestart);
			cmd.addParameter("@PAR_UPDATE", parUpdate);
			cmd.addParameter("@PAR_SUBMIT", parSubmit);
			cmd.addParameter("@PAR_RECALL", parRecall);
			cmd.addParameter("@EARNCODE", earncode);
			cmd.addParameter("@DATESELECTED", dateselected);
			cmd.addParameter("@LINENUMBER", linenumber);
			cmd.addParameter("@SOURCEIND", sourceind);
				
			cmd.execute();


		}
		
//		public static void pShowclockinout(NString jobsseqno,NString lastdate,NString earncode,NString dateselected,NString linenumber,List<Twbklibs.Varchar2TabtypeRow> shift,List<Twbklibs.Varchar2TabtypeRow> systimein,List<Twbklibs.Varchar2TabtypeRow> systimeinam,List<Twbklibs.Varchar2TabtypeRow> timein,List<Twbklibs.Varchar2TabtypeRow> timeinam,List<Twbklibs.Varchar2TabtypeRow> systimeout,List<Twbklibs.Varchar2TabtypeRow> systimeoutam,List<Twbklibs.Varchar2TabtypeRow> timeout,List<Twbklibs.Varchar2TabtypeRow> timeoutam,List<Twbklibs.Varchar2TabtypeRow> commentin,List<Twbklibs.Varchar2TabtypeRow> commentindate,List<Twbklibs.Varchar2TabtypeRow> commentout,List<Twbklibs.Varchar2TabtypeRow> commentoutdate) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTCLK.P_SHOWCLOCKINOUT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@JOBSSEQNO", jobsseqno);
//			cmd.addParameter("@LASTDATE", lastdate);
//			cmd.addParameter("@EARNCODE", earncode);
//			cmd.addParameter("@DATESELECTED", dateselected);
//			cmd.addParameter("@LINENUMBER", linenumber);
//			// cmd.addParameter(DbTypes.getTableType("SHIFT", "", shift, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SYSTIMEIN", "", systimein, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SYSTIMEINAM", "", systimeinam, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TIMEIN", "", timein, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TIMEINAM", "", timeinam, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SYSTIMEOUT", "", systimeout, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SYSTIMEOUTAM", "", systimeoutam, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TIMEOUT", "", timeout, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TIMEOUTAM", "", timeoutam, object.class));
//			// cmd.addParameter(DbTypes.getTableType("COMMENTIN", "", commentin, object.class));
//			// cmd.addParameter(DbTypes.getTableType("COMMENTINDATE", "", commentindate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("COMMENTOUT", "", commentout, object.class));
//			// cmd.addParameter(DbTypes.getTableType("COMMENTOUTDATE", "", commentoutdate, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdateclockinout(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString dateselected,NString linenumber,NString sourceind,NString buttonselected,List<Twbklibs.Varchar2TabtypeRow> shift,List<Twbklibs.Varchar2TabtypeRow> systimein,List<Twbklibs.Varchar2TabtypeRow> systimeinam,List<Twbklibs.Varchar2TabtypeRow> timein,List<Twbklibs.Varchar2TabtypeRow> timeinam,List<Twbklibs.Varchar2TabtypeRow> systimeout,List<Twbklibs.Varchar2TabtypeRow> systimeoutam,List<Twbklibs.Varchar2TabtypeRow> timeout,List<Twbklibs.Varchar2TabtypeRow> timeoutam,List<Twbklibs.Varchar2TabtypeRow> commentin,List<Twbklibs.Varchar2TabtypeRow> commentindate,List<Twbklibs.Varchar2TabtypeRow> commentout,List<Twbklibs.Varchar2TabtypeRow> commentoutdate) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTCLK.P_UPDATECLOCKINOUT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@JOBSSEQNO", jobsseqno);
//			cmd.addParameter("@LASTDATE", lastdate);
//			cmd.addParameter("@PAR_RESTART", parRestart);
//			cmd.addParameter("@PAR_UPDATE", parUpdate);
//			cmd.addParameter("@PAR_SUBMIT", parSubmit);
//			cmd.addParameter("@PAR_RECALL", parRecall);
//			cmd.addParameter("@EARNCODE", earncode);
//			cmd.addParameter("@DATESELECTED", dateselected);
//			cmd.addParameter("@LINENUMBER", linenumber);
//			cmd.addParameter("@SOURCEIND", sourceind);
//			cmd.addParameter("@BUTTONSELECTED", buttonselected);
//			// cmd.addParameter(DbTypes.getTableType("SHIFT", "", shift, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SYSTIMEIN", "", systimein, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SYSTIMEINAM", "", systimeinam, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TIMEIN", "", timein, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TIMEINAM", "", timeinam, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SYSTIMEOUT", "", systimeout, object.class));
//			// cmd.addParameter(DbTypes.getTableType("SYSTIMEOUTAM", "", systimeoutam, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TIMEOUT", "", timeout, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TIMEOUTAM", "", timeoutam, object.class));
//			// cmd.addParameter(DbTypes.getTableType("COMMENTIN", "", commentin, object.class));
//			// cmd.addParameter(DbTypes.getTableType("COMMENTINDATE", "", commentindate, object.class));
//			// cmd.addParameter(DbTypes.getTableType("COMMENTOUT", "", commentout, object.class));
//			// cmd.addParameter(DbTypes.getTableType("COMMENTOUTDATE", "", commentoutdate, object.class));
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
