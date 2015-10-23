package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpktafn {
		public static void pChangefinjlbd(NString jobsseqno,NString lastdate,NString earncode,NString shift,NString specialrate,NString dateselected,NString copytype,NString coascode,NString jlbdseqno,NString jlbdhour,NString jlbdacci,NString jlbdfund,NString jlbdorgn,NString jlbdacct,NString jlbdprog,NString jlbdactv,NString jlbdlocn,NString jlbdproj,NString jlbdctyp,NString jlbdfundover,NString jlbdorgnover,NString jlbdacctover,NString jlbdprogover,NString jlbdactvover,NString jlbdlocnover,NString jlbdaccidefault) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAFN.P_CHANGEFINJLBD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@JOBSSEQNO", jobsseqno);
			cmd.addParameter("@LASTDATE", lastdate);
			cmd.addParameter("@EARNCODE", earncode);
			cmd.addParameter("@SHIFT", shift);
			cmd.addParameter("@SPECIALRATE", specialrate);
			cmd.addParameter("@DATESELECTED", dateselected);
			cmd.addParameter("@COPYTYPE", copytype);
			cmd.addParameter("@COASCODE", coascode);
			cmd.addParameter("@JLBDSEQNO", jlbdseqno);
			cmd.addParameter("@JLBDHOUR", jlbdhour);
			cmd.addParameter("@JLBDACCI", jlbdacci);
			cmd.addParameter("@JLBDFUND", jlbdfund);
			cmd.addParameter("@JLBDORGN", jlbdorgn);
			cmd.addParameter("@JLBDACCT", jlbdacct);
			cmd.addParameter("@JLBDPROG", jlbdprog);
			cmd.addParameter("@JLBDACTV", jlbdactv);
			cmd.addParameter("@JLBDLOCN", jlbdlocn);
			cmd.addParameter("@JLBDPROJ", jlbdproj);
			cmd.addParameter("@JLBDCTYP", jlbdctyp);
			cmd.addParameter("@JLBDFUNDOVER", jlbdfundover);
			cmd.addParameter("@JLBDORGNOVER", jlbdorgnover);
			cmd.addParameter("@JLBDACCTOVER", jlbdacctover);
			cmd.addParameter("@JLBDPROGOVER", jlbdprogover);
			cmd.addParameter("@JLBDACTVOVER", jlbdactvover);
			cmd.addParameter("@JLBDLOCNOVER", jlbdlocnover);
			cmd.addParameter("@JLBDACCIDEFAULT", jlbdaccidefault);
				
			cmd.execute();


		}
		
		public static void pListofvaluesjlbd(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString shift,NString specialrate,NString dateselected,NString copytype,NString coascode,NString typejlbd,NString jlbdvalue,NString jlbdseqno,NString jlbdhour,NString jlbdacci,NString jlbdfund,NString jlbdorgn,NString jlbdacct,NString jlbdprog,NString jlbdactv,NString jlbdlocn,NString jlbdproj,NString jlbdctyp,NString jlbdfundover,NString jlbdorgnover,NString jlbdacctover,NString jlbdprogover,NString jlbdactvover,NString jlbdlocnover,NString jlbdaccidefault,NString codejlbd,NString titlejlbd,NString maxrows) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAFN.P_LISTOFVALUESJLBD", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@COASCODE", coascode);
			cmd.addParameter("@TYPEJLBD", typejlbd);
			cmd.addParameter("@JLBDVALUE", jlbdvalue);
			cmd.addParameter("@JLBDSEQNO", jlbdseqno);
			cmd.addParameter("@JLBDHOUR", jlbdhour);
			cmd.addParameter("@JLBDACCI", jlbdacci);
			cmd.addParameter("@JLBDFUND", jlbdfund);
			cmd.addParameter("@JLBDORGN", jlbdorgn);
			cmd.addParameter("@JLBDACCT", jlbdacct);
			cmd.addParameter("@JLBDPROG", jlbdprog);
			cmd.addParameter("@JLBDACTV", jlbdactv);
			cmd.addParameter("@JLBDLOCN", jlbdlocn);
			cmd.addParameter("@JLBDPROJ", jlbdproj);
			cmd.addParameter("@JLBDCTYP", jlbdctyp);
			cmd.addParameter("@JLBDFUNDOVER", jlbdfundover);
			cmd.addParameter("@JLBDORGNOVER", jlbdorgnover);
			cmd.addParameter("@JLBDACCTOVER", jlbdacctover);
			cmd.addParameter("@JLBDPROGOVER", jlbdprogover);
			cmd.addParameter("@JLBDACTVOVER", jlbdactvover);
			cmd.addParameter("@JLBDLOCNOVER", jlbdlocnover);
			cmd.addParameter("@JLBDACCIDEFAULT", jlbdaccidefault);
			cmd.addParameter("@CODEJLBD", codejlbd);
			cmd.addParameter("@TITLEJLBD", titlejlbd);
			cmd.addParameter("@MAXROWS", maxrows);
				
			cmd.execute();


		}
		
		public static void pUpdatefinjlbd(NString jobsseqno,NString lastdate,NString parRestart,NString parUpdate,NString parSubmit,NString parRecall,NString earncode,NString shift,NString specialrate,NString dateselected,NString copytype,NString coascode,NString buttonselected,NString jlbdseqno,NString jlbdhour,NString jlbdacci,NString jlbdfund,NString jlbdorgn,NString jlbdacct,NString jlbdprog,NString jlbdactv,NString jlbdlocn,NString jlbdproj,NString jlbdctyp,NString jlbdfundover,NString jlbdorgnover,NString jlbdacctover,NString jlbdprogover,NString jlbdactvover,NString jlbdlocnover,NString jlbdaccidefault) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKTAFN.P_UPDATEFINJLBD", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@COASCODE", coascode);
			cmd.addParameter("@BUTTONSELECTED", buttonselected);
			cmd.addParameter("@JLBDSEQNO", jlbdseqno);
			cmd.addParameter("@JLBDHOUR", jlbdhour);
			cmd.addParameter("@JLBDACCI", jlbdacci);
			cmd.addParameter("@JLBDFUND", jlbdfund);
			cmd.addParameter("@JLBDORGN", jlbdorgn);
			cmd.addParameter("@JLBDACCT", jlbdacct);
			cmd.addParameter("@JLBDPROG", jlbdprog);
			cmd.addParameter("@JLBDACTV", jlbdactv);
			cmd.addParameter("@JLBDLOCN", jlbdlocn);
			cmd.addParameter("@JLBDPROJ", jlbdproj);
			cmd.addParameter("@JLBDCTYP", jlbdctyp);
			cmd.addParameter("@JLBDFUNDOVER", jlbdfundover);
			cmd.addParameter("@JLBDORGNOVER", jlbdorgnover);
			cmd.addParameter("@JLBDACCTOVER", jlbdacctover);
			cmd.addParameter("@JLBDPROGOVER", jlbdprogover);
			cmd.addParameter("@JLBDACTVOVER", jlbdactvover);
			cmd.addParameter("@JLBDLOCNOVER", jlbdlocnover);
			cmd.addParameter("@JLBDACCIDEFAULT", jlbdaccidefault);
				
			cmd.execute();


		}
		
	
	
	
}
