package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpktcio {
		public static NBool fCheckDate(NString pCurrDate,NString pJobsseqno,NString pEarncode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTCIO.F_CHECK_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_CURR_DATE", pCurrDate);
			cmd.addParameter("@P_JOBSSEQNO", pJobsseqno);
			cmd.addParameter("@P_EARNCODE", pEarncode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fValidearncode(NString jobsseqno,NString earncode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTCIO.F_VALIDEARNCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@EARNCODE", earncode);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pCheckClockinout(NNumber pJobsseqno,NString pEarncode,NDate pDateselected,NString pType,Ref<NNumber> pCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTCIO.P_CHECK_CLOCKINOUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOBSSEQNO", pJobsseqno);
			cmd.addParameter("@P_EARNCODE", pEarncode);
			cmd.addParameter("@P_DATESELECTED", pDateselected);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_COUNT", NNumber.class);
				
			cmd.execute();
			pCount.val = cmd.getParameterValue("@P_COUNT", NNumber.class);


		}
		
//		public static void pDisplayClockinout(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString dateselected,NString linenumber,NString sourceind,List<Twbklibs.Varchar2TabtypeRow> shift,List<Twbklibs.Varchar2TabtypeRow> systimein,List<Twbklibs.Varchar2TabtypeRow> systimeinam,List<Twbklibs.Varchar2TabtypeRow> timein,List<Twbklibs.Varchar2TabtypeRow> timeinam,List<Twbklibs.Varchar2TabtypeRow> systimeout,List<Twbklibs.Varchar2TabtypeRow> systimeoutam,List<Twbklibs.Varchar2TabtypeRow> timeout,List<Twbklibs.Varchar2TabtypeRow> timeoutam,List<Twbklibs.Varchar2TabtypeRow> commentin,List<Twbklibs.Varchar2TabtypeRow> commentindate,List<Twbklibs.Varchar2TabtypeRow> commentout,List<Twbklibs.Varchar2TabtypeRow> commentoutdate) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTCIO.P_DISPLAY_CLOCKINOUT", DbManager.getDataBaseFactory());
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
		
		public static void pInsertmidnightrecords(NString pJobsseqno,NString pLastdate,NString pRestart,NString pUpdate,NString pSubmit,NString pRecall,NString pEarncode,NString pDateselected,NString pClockinOutFlag,NNumber pPidm,Ref<NString> pError) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTCIO.P_INSERTMIDNIGHTRECORDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_JOBSSEQNO", pJobsseqno);
			cmd.addParameter("@P_LASTDATE", pLastdate);
			cmd.addParameter("@P_RESTART", pRestart);
			cmd.addParameter("@P_UPDATE", pUpdate);
			cmd.addParameter("@P_SUBMIT", pSubmit);
			cmd.addParameter("@P_RECALL", pRecall);
			cmd.addParameter("@P_EARNCODE", pEarncode);
			cmd.addParameter("@P_DATESELECTED", pDateselected);
			cmd.addParameter("@P_CLOCKIN_OUT_FLAG", pClockinOutFlag);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ERROR", pError, true);
				
			cmd.execute();
			pError.val = cmd.getParameterValue("@P_ERROR", NString.class);


		}
		
		public static void pMidnightquestionanswer(NString pBtnselected,NString pJobsseqno,NString pLastdate,NString pRestart,NString pUpdate,NString pSubmit,NString pRecall,NString pEarncode,NString pDateselected,NNumber pPidm,Ref<NString> pWindowurlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTCIO.P_MIDNIGHTQUESTIONANSWER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BTNSELECTED", pBtnselected);
			cmd.addParameter("@P_JOBSSEQNO", pJobsseqno);
			cmd.addParameter("@P_LASTDATE", pLastdate);
			cmd.addParameter("@P_RESTART", pRestart);
			cmd.addParameter("@P_UPDATE", pUpdate);
			cmd.addParameter("@P_SUBMIT", pSubmit);
			cmd.addParameter("@P_RECALL", pRecall);
			cmd.addParameter("@P_EARNCODE", pEarncode);
			cmd.addParameter("@P_DATESELECTED", pDateselected);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_WINDOWURL_OUT", NString.class);
				
			cmd.execute();
			pWindowurlOut.val = cmd.getParameterValue("@P_WINDOWURL_OUT", NString.class);


		}
		
		public static void pMidnightquestionwindow(NString pJobsseqno,NString pLastdate,NString pRestart,NString pUpdate,NString pSubmit,NString pRecall,NString pEarncode,NString pDateselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTCIO.P_MIDNIGHTQUESTIONWINDOW", DbManager.getDataBaseFactory());
			
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
		
		public static void pPrintclockinoutanchor(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString dateselected,NNumber parHours,NString parType,NString parAccDistAdj) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTCIO.P_PRINTCLOCKINOUTANCHOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@LASTDATE", lastdate);
			cmd.addParameter("@PAR_RESTART", parRestart);
			cmd.addParameter("@PAR_UPDATE", parUpdate);
			cmd.addParameter("@PAR_SUBMIT", parSubmit);
			cmd.addParameter("@PAR_RECALL", parRecall);
			cmd.addParameter("@EARNCODE", earncode);
			cmd.addParameter("@DATESELECTED", dateselected);
			cmd.addParameter("@PAR_HOURS", parHours);
			cmd.addParameter("@PAR_TYPE", parType);
			cmd.addParameter("@PAR_ACC_DIST_ADJ", parAccDistAdj);
				
			cmd.execute();


		}
		
//		public static void pSaveClockinout(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString dateselected,NString linenumber,NString sourceind,NString buttonselected,List<Twbklibs.Varchar2TabtypeRow> shift,List<Twbklibs.Varchar2TabtypeRow> systimein,List<Twbklibs.Varchar2TabtypeRow> systimeinam,List<Twbklibs.Varchar2TabtypeRow> timein,List<Twbklibs.Varchar2TabtypeRow> timeinam,List<Twbklibs.Varchar2TabtypeRow> systimeout,List<Twbklibs.Varchar2TabtypeRow> systimeoutam,List<Twbklibs.Varchar2TabtypeRow> timeout,List<Twbklibs.Varchar2TabtypeRow> timeoutam,List<Twbklibs.Varchar2TabtypeRow> commentin,List<Twbklibs.Varchar2TabtypeRow> commentindate,List<Twbklibs.Varchar2TabtypeRow> commentout,List<Twbklibs.Varchar2TabtypeRow> commentoutdate) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTCIO.P_SAVE_CLOCKINOUT", DbManager.getDataBaseFactory());
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
		
		public static void pViewClockinoutcomment(NString jobsseqno,NString earncode,NString dateselected) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTCIO.P_VIEW_CLOCKINOUTCOMMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@EARNCODE", earncode);
			cmd.addParameter("@DATESELECTED", dateselected);
				
			cmd.execute();


		}
		
	
	
	
}
