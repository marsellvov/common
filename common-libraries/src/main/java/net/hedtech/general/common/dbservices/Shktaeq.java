package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Shktaeq {
		public static void pGetInstCredits(NString subjCode,NString crseNumb,NString subjCodeInst,NString crseNumbInst,Ref<NNumber> credHours,NNumber credHoursIn,NString sbgiCode,NString levlCode,NString termIn,NNumber seqno,NString program,NString grp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKTAEQ.P_GET_INST_CREDITS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUBJ_CODE", subjCode);
			cmd.addParameter("@CRSE_NUMB", crseNumb);
			cmd.addParameter("@SUBJ_CODE_INST", subjCodeInst);
			cmd.addParameter("@CRSE_NUMB_INST", crseNumbInst);
			cmd.addParameter("@CRED_HOURS", NNumber.class);
			cmd.addParameter("@CRED_HOURS_IN", credHoursIn);
			cmd.addParameter("@SBGI_CODE", sbgiCode);
			cmd.addParameter("@LEVL_CODE", levlCode);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SEQNO", seqno);
			cmd.addParameter("@PROGRAM", program);
			cmd.addParameter("@GRP", grp);
				
			cmd.execute();
			credHours.val = cmd.getParameterValue("@CRED_HOURS", NNumber.class);


		}
		
		public static void pInsertShrtram(NNumber tritSeq,NNumber tramSeq,NString levlCode,NString termCode,NString tgrdCode,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKTAEQ.P_INSERT_SHRTRAM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRIT_SEQ", tritSeq);
			cmd.addParameter("@TRAM_SEQ", tramSeq);
			cmd.addParameter("@LEVL_CODE", levlCode);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@TGRD_CODE", tgrdCode);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pInsertShrtrit(NString keyblocSbgiCode,NString sbgiDesc,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SHKTAEQ.P_INSERT_SHRTRIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@KEYBLOC_SBGI_CODE", keyblocSbgiCode);
			cmd.addParameter("@SBGI_DESC", sbgiDesc);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
	
	
	
}
