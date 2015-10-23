package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkteci {
//		public static void pCopy(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString dateselected,NString copytype,NString pagefrom,NString specialrate,NString shift,NString payperiod,NString payperiodsaturday,NString payperiodsunday,List<Twbklibs.Varchar2TabtypeRow> payperioddate) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTECI.P_COPY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@JOBSSEQNO", jobsseqno);
//			cmd.addParameter("@LASTDATE", lastdate);
//			cmd.addParameter("@PAR_RESTART", parRestart);
//			cmd.addParameter("@PAR_UPDATE", parUpdate);
//			cmd.addParameter("@PAR_SUBMIT", parSubmit);
//			cmd.addParameter("@PAR_RECALL", parRecall);
//			cmd.addParameter("@EARNCODE", earncode);
//			cmd.addParameter("@DATESELECTED", dateselected);
//			cmd.addParameter("@COPYTYPE", copytype);
//			cmd.addParameter("@PAGEFROM", pagefrom);
//			cmd.addParameter("@SPECIALRATE", specialrate);
//			cmd.addParameter("@SHIFT", shift);
//			cmd.addParameter("@PAYPERIOD", payperiod);
//			cmd.addParameter("@PAYPERIODSATURDAY", payperiodsaturday);
//			cmd.addParameter("@PAYPERIODSUNDAY", payperiodsunday);
//			// cmd.addParameter(DbTypes.getTableType("PAYPERIODDATE", "", payperioddate, object.class));
//				
//			cmd.execute();
//
//
//		}
		
		public static void pDeletedrivertimeinout(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString dateselected,NString linenumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTECI.P_DELETEDRIVERTIMEINOUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@LASTDATE", lastdate);
			cmd.addParameter("@PAR_RESTART", parRestart);
			cmd.addParameter("@PAR_UPDATE", parUpdate);
			cmd.addParameter("@PAR_SUBMIT", parSubmit);
			cmd.addParameter("@PAR_RECALL", parRecall);
			cmd.addParameter("@EARNCODE", earncode);
			cmd.addParameter("@DATESELECTED", dateselected);
			cmd.addParameter("@LINENUMBER", linenumber);
				
			cmd.execute();


		}
		
		public static void pDeletefortimeinout(NNumber jobsseqno,NString earncode,NDate parDate,NString parJlbdInd,NBool parPertitoExist) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTECI.P_DELETEFORTIMEINOUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@EARNCODE", earncode);
			cmd.addParameter("@PAR_DATE", parDate);
			cmd.addParameter("@PAR_JLBD_IND", parJlbdInd);
			cmd.addParameter("@PAR_PERTITO_EXIST", parPertitoExist);
				
			cmd.execute();


		}
		
		public static void pDeletetimeinout(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString dateselected,NString linenumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTECI.P_DELETETIMEINOUT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@LASTDATE", lastdate);
			cmd.addParameter("@PAR_RESTART", parRestart);
			cmd.addParameter("@PAR_UPDATE", parUpdate);
			cmd.addParameter("@PAR_SUBMIT", parSubmit);
			cmd.addParameter("@PAR_RECALL", parRecall);
			cmd.addParameter("@EARNCODE", earncode);
			cmd.addParameter("@DATESELECTED", dateselected);
			cmd.addParameter("@LINENUMBER", linenumber);
				
			cmd.execute();


		}
		
//		public static void pTimeinout(NString jobsseqno,NString lastdate,NString earncode,NString dateselected,NString linenumber,List<Twbklibs.Varchar2TabtypeRow> shift,List<Twbklibs.Varchar2TabtypeRow> timein,List<Twbklibs.Varchar2TabtypeRow> timeinam,List<Twbklibs.Varchar2TabtypeRow> tsTimeout,List<Twbklibs.Varchar2TabtypeRow> timeoutam) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTECI.P_TIMEINOUT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@JOBSSEQNO", jobsseqno);
//			cmd.addParameter("@LASTDATE", lastdate);
//			cmd.addParameter("@EARNCODE", earncode);
//			cmd.addParameter("@DATESELECTED", dateselected);
//			cmd.addParameter("@LINENUMBER", linenumber);
//			// cmd.addParameter(DbTypes.getTableType("SHIFT", "", shift, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TIMEIN", "", timein, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TIMEINAM", "", timeinam, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TS_TIMEOUT", "", tsTimeout, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TIMEOUTAM", "", timeoutam, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdatecopy(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString dateselected,NString copytype,NString pagefrom,NString buttonselected,NString specialrate,NString shift,NString payperiod,NString payperiodsaturday,NString payperiodsunday,List<Twbklibs.Varchar2TabtypeRow> payperioddate) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTECI.P_UPDATECOPY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@JOBSSEQNO", jobsseqno);
//			cmd.addParameter("@LASTDATE", lastdate);
//			cmd.addParameter("@PAR_RESTART", parRestart);
//			cmd.addParameter("@PAR_UPDATE", parUpdate);
//			cmd.addParameter("@PAR_SUBMIT", parSubmit);
//			cmd.addParameter("@PAR_RECALL", parRecall);
//			cmd.addParameter("@EARNCODE", earncode);
//			cmd.addParameter("@DATESELECTED", dateselected);
//			cmd.addParameter("@COPYTYPE", copytype);
//			cmd.addParameter("@PAGEFROM", pagefrom);
//			cmd.addParameter("@BUTTONSELECTED", buttonselected);
//			cmd.addParameter("@SPECIALRATE", specialrate);
//			cmd.addParameter("@SHIFT", shift);
//			cmd.addParameter("@PAYPERIOD", payperiod);
//			cmd.addParameter("@PAYPERIODSATURDAY", payperiodsaturday);
//			cmd.addParameter("@PAYPERIODSUNDAY", payperiodsunday);
//			// cmd.addParameter(DbTypes.getTableType("PAYPERIODDATE", "", payperioddate, object.class));
//				
//			cmd.execute();
//
//
//		}
//		
//		public static void pUpdatetimeinout(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString dateselected,NString linenumber,NString buttonselected,List<Twbklibs.Varchar2TabtypeRow> shift,List<Twbklibs.Varchar2TabtypeRow> timein,List<Twbklibs.Varchar2TabtypeRow> timeinam,List<Twbklibs.Varchar2TabtypeRow> tsTimeout,List<Twbklibs.Varchar2TabtypeRow> timeoutam) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTECI.P_UPDATETIMEINOUT", DbManager.getDataBaseFactory());
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
//			cmd.addParameter("@BUTTONSELECTED", buttonselected);
//			// cmd.addParameter(DbTypes.getTableType("SHIFT", "", shift, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TIMEIN", "", timein, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TIMEINAM", "", timeinam, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TS_TIMEOUT", "", tsTimeout, object.class));
//			// cmd.addParameter(DbTypes.getTableType("TIMEOUTAM", "", timeoutam, object.class));
//				
//			cmd.execute();
//
//
//		}
		
	
	
	
}
