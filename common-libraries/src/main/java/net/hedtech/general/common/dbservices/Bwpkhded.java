package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkhded {
		public static void pChoosededn(NString fMnth,NString fYear,NString tMnth,NString tYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHDED.P_CHOOSEDEDN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@F_MNTH", fMnth);
			cmd.addParameter("@F_YEAR", fYear);
			cmd.addParameter("@T_MNTH", tMnth);
			cmd.addParameter("@T_YEAR", tYear);
				
			cmd.execute();


		}
		
		public static void pChoosedednbody(NNumber pidm,NString fMnth,NString fYear,NString tMnth,NString tYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHDED.P_CHOOSEDEDNBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@F_MNTH", fMnth);
			cmd.addParameter("@F_YEAR", fYear);
			cmd.addParameter("@T_MNTH", tMnth);
			cmd.addParameter("@T_YEAR", tYear);
				
			cmd.execute();


		}
		
		public static void pViewdednsummary(NString fMnth,NString fYear,NString tMnth,NString tYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHDED.P_VIEWDEDNSUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@F_MNTH", fMnth);
			cmd.addParameter("@F_YEAR", fYear);
			cmd.addParameter("@T_MNTH", tMnth);
			cmd.addParameter("@T_YEAR", tYear);
				
			cmd.execute();


		}
		
		public static void pViewdednsummarybody(NNumber pidm,Ref<NString> fMnth,Ref<NString> fYear,Ref<NString> tMnth,Ref<NString> tYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKHDED.P_VIEWDEDNSUMMARYBODY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@F_MNTH", fMnth, true);
			cmd.addParameter("@F_YEAR", fYear, true);
			cmd.addParameter("@T_MNTH", tMnth, true);
			cmd.addParameter("@T_YEAR", tYear, true);
				
			cmd.execute();
			fMnth.val = cmd.getParameterValue("@F_MNTH", NString.class);
			fYear.val = cmd.getParameterValue("@F_YEAR", NString.class);
			tMnth.val = cmd.getParameterValue("@T_MNTH", NString.class);
			tYear.val = cmd.getParameterValue("@T_YEAR", NString.class);


		}
		
	
	
	
}
