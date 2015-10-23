package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkeinf {
		public static void pLeavehistorybyemp(NString leavCode,NString yr,NString pRecordNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEINF.P_LEAVEHISTORYBYEMP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LEAV_CODE", leavCode);
			cmd.addParameter("@YR", yr);
			cmd.addParameter("@P_RECORD_NO", pRecordNo);
				
			cmd.execute();


		}
		
		public static void pLeavehistorybyjob(NString leavCode,NString yr,NString pRecordNo,NString posn,NString suff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEINF.P_LEAVEHISTORYBYJOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LEAV_CODE", leavCode);
			cmd.addParameter("@YR", yr);
			cmd.addParameter("@P_RECORD_NO", pRecordNo);
			cmd.addParameter("@POSN", posn);
			cmd.addParameter("@SUFF", suff);
				
			cmd.execute();


		}
		
		public static void pViewjobdetail(NString posn,NString suff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEINF.P_VIEWJOBDETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@POSN", posn);
			cmd.addParameter("@SUFF", suff);
				
			cmd.execute();


		}
		
		public static void pViewjobdetailbody(NNumber pidm,NString posn,NString suff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEINF.P_VIEWJOBDETAILBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@POSN", posn);
			cmd.addParameter("@SUFF", suff);
				
			cmd.execute();


		}
		
		public static void pViewjobs() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEINF.P_VIEWJOBS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pViewjobsbody(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEINF.P_VIEWJOBSBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pViewleavebalances() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEINF.P_VIEWLEAVEBALANCES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pViewleavebalancesbody(NNumber pidm,NString leavMethod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEINF.P_VIEWLEAVEBALANCESBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@LEAV_METHOD", leavMethod);
				
			cmd.execute();


		}
		
		public static void pViewleavebyjob(NString leavCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEINF.P_VIEWLEAVEBYJOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LEAV_CODE", leavCode);
				
			cmd.execute();


		}
		
		public static void pViewleavedetail(NString leavCode,NString leavMethod,NString hourDayInd,NString posn,NString suff,NString yr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEINF.P_VIEWLEAVEDETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LEAV_CODE", leavCode);
			cmd.addParameter("@LEAV_METHOD", leavMethod);
			cmd.addParameter("@HOUR_DAY_IND", hourDayInd);
			cmd.addParameter("@POSN", posn);
			cmd.addParameter("@SUFF", suff);
			cmd.addParameter("@YR", yr);
				
			cmd.execute();


		}
		
		public static void pViewleavedetailbody(NNumber pidm,NString leavCode,NString leavMethod,NString hourDayInd,NString posn,NString suff,Ref<NString> yr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKEINF.P_VIEWLEAVEDETAILBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@LEAV_CODE", leavCode);
			cmd.addParameter("@LEAV_METHOD", leavMethod);
			cmd.addParameter("@HOUR_DAY_IND", hourDayInd);
			cmd.addParameter("@POSN", posn);
			cmd.addParameter("@SUFF", suff);
			cmd.addParameter("@YR", yr, true);
				
			cmd.execute();
			yr.val = cmd.getParameterValue("@YR", NString.class);


		}
		
	
	
	
}
