package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwlkftrn {
		public static void pFacdisptran(NString term,NString callingProcName,NString callingProcName2,NString xyz,NString msg,NString pinrule,NString pinNumb,NString ldapUserid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFTRN.P_FACDISPTRAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
			cmd.addParameter("@XYZ", xyz);
			cmd.addParameter("@MSG", msg);
			cmd.addParameter("@PINRULE", pinrule);
			cmd.addParameter("@PIN_NUMB", pinNumb);
			cmd.addParameter("@LDAP_USERID", ldapUserid);
				
			cmd.execute();


		}
		
		public static void pFacverifyid(NString studId,NString term,NString callingProcName,NString callingProcName2) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFTRN.P_FACVERIFYID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STUD_ID", studId);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@CALLING_PROC_NAME", callingProcName);
			cmd.addParameter("@CALLING_PROC_NAME2", callingProcName2);
				
			cmd.execute();


		}
		
		public static void pViewtermtran(NString term,NNumber stuPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFTRN.P_VIEWTERMTRAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@STU_PIDM", stuPidm);
				
			cmd.execute();


		}
		
		public static void pViewtran(NString levl,NString tprt,NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWLKFTRN.P_VIEWTRAN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LEVL", levl);
			cmd.addParameter("@TPRT", tprt);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
	
	
	
}
