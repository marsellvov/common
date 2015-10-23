package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwfkbdws {
		public static NNumber fAudtSeqMax(NString coasCode,NString obudCode,NString obphCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDWS.F_AUDT_SEQ_MAX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@OBUD_CODE", obudCode);
			cmd.addParameter("@OBPH_CODE", obphCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fBdwcSeqMax(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDWS.F_BDWC_SEQ_MAX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fBdwcUsers(NNumber pidm,NString coasCode,NString obudCode,NString obphCode,NString fund,NString orgn,NString acct,NString prog,NString actv,NString locn,NString duration,NNumber withinHours) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDWS.F_BDWC_USERS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@OBUD_CODE", obudCode);
			cmd.addParameter("@OBPH_CODE", obphCode);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@ACCT", acct);
			cmd.addParameter("@PROG", prog);
			cmd.addParameter("@ACTV", actv);
			cmd.addParameter("@LOCN", locn);
			cmd.addParameter("@DURATION", duration);
			cmd.addParameter("@WITHIN_HOURS", withinHours);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAddBdwc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDWS.P_ADD_BDWC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pCalculateBdwc(NNumber pidm,NNumber seqNum,NNumber changeAmt,NNumber cummAmt,NNumber newAmt,NString changePct,NString massOrRow,NString rndFactor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDWS.P_CALCULATE_BDWC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SEQ_NUM", seqNum);
			cmd.addParameter("@CHANGE_AMT", changeAmt);
			cmd.addParameter("@CUMM_AMT", cummAmt);
			cmd.addParameter("@NEW_AMT", newAmt);
			cmd.addParameter("@CHANGE_PCT", changePct);
			cmd.addParameter("@MASS_OR_ROW", massOrRow);
			cmd.addParameter("@RND_FACTOR", rndFactor);
				
			cmd.execute();


		}
		
		public static void pCalculateBdwc(NNumber pidm,NNumber seqNum,NString deleteInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDWS.P_CALCULATE_BDWC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SEQ_NUM", seqNum);
			cmd.addParameter("@DELETE_IND", deleteInd);
				
			cmd.execute();


		}
		
		public static void pCanUserEditOrgn(NString inUser,NString inCoas,NString inOrgn,NString inBudgid,NString inPhase,NDate effDate,Ref<NString> retvalue,Ref<NString> lockstatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDWS.P_CAN_USER_EDIT_ORGN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_USER", inUser);
			cmd.addParameter("@IN_COAS", inCoas);
			cmd.addParameter("@IN_ORGN", inOrgn);
			cmd.addParameter("@IN_BUDGID", inBudgid);
			cmd.addParameter("@IN_PHASE", inPhase);
			cmd.addParameter("@EFF_DATE", effDate);
			cmd.addParameter("@RETVALUE", NString.class);
			cmd.addParameter("@LOCKSTATUS", NString.class);
				
			cmd.execute();
			retvalue.val = cmd.getParameterValue("@RETVALUE", NString.class);
			lockstatus.val = cmd.getParameterValue("@LOCKSTATUS", NString.class);


		}
		
		public static void pDeleteBdwc(NNumber pidm,NNumber seqNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDWS.P_DELETE_BDWC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SEQ_NUM", seqNum);
				
			cmd.execute();


		}
		
		public static void pDeleteBlin() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDWS.P_DELETE_BLIN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertAudt() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDWS.P_INSERT_AUDT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertBdwc() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDWS.P_INSERT_BDWC", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pInsertBlin() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDWS.P_INSERT_BLIN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pUpdateBlin() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWFKBDWS.P_UPDATE_BLIN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
