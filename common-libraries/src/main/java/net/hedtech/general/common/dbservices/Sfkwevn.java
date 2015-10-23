package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkwevn {
		public static NString fCheckarbalance(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWEVN.F_CHECKARBALANCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fChecksfrstcrgrades(NNumber pidm,NString term) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWEVN.F_CHECKSFRSTCRGRADES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetgrademodedesc(NString termCode,NString crn,NString idIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWEVN.F_GETGRADEMODEDESC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TERM_CODE", termCode);
			cmd.addParameter("@CRN", crn);
			cmd.addParameter("@ID_IN", idIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pEnrolledtermcount(NNumber pidm,NString termCodeWithdraw,Ref<NString> termCodeEarliest,Ref<NNumber> enrolledCount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWEVN.P_ENROLLEDTERMCOUNT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM_CODE_WITHDRAW", termCodeWithdraw);
			cmd.addParameter("@TERM_CODE_EARLIEST", termCodeEarliest, true);
			cmd.addParameter("@ENROLLED_COUNT", enrolledCount, true);
				
			cmd.execute();
			termCodeEarliest.val = cmd.getParameterValue("@TERM_CODE_EARLIEST", NString.class);
			enrolledCount.val = cmd.getParameterValue("@ENROLLED_COUNT", NNumber.class);


		}
		
		public static void pEnrollmentsummary(NNumber pidm,NString term,Ref<NString> wdDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWEVN.P_ENROLLMENTSUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TERM", term);
			cmd.addParameter("@WD_DATE", wdDate, true);
				
			cmd.execute();
			wdDate.val = cmd.getParameterValue("@WD_DATE", NString.class);


		}
		
	
	
	
}
