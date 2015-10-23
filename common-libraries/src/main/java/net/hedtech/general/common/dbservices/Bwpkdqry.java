package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkdqry {
		public static void pDispdedndriver(NNumber pidm,NString dedngrp,NString headtext,NString msgtext) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDQRY.P_DISPDEDNDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DEDNGRP", dedngrp);
			cmd.addParameter("@HEADTEXT", headtext);
			cmd.addParameter("@MSGTEXT", msgtext);
				
			cmd.execute();


		}
		
		public static void pDispdednflxsdetaildriver(NNumber pidm,Ref<NString> dcde,NString selYear) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDQRY.P_DISPDEDNFLXSDETAILDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DCDE", dcde, true);
			cmd.addParameter("@SEL_YEAR", selYear);
				
			cmd.execute();
			dcde.val = cmd.getParameterValue("@DCDE", NString.class);


		}
		
		public static void pDispdednhistdriver(NNumber pidm,Ref<NString> dcde,NString dedngrp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDQRY.P_DISPDEDNHISTDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DCDE", dcde, true);
			cmd.addParameter("@DEDNGRP", dedngrp);
				
			cmd.execute();
			dcde.val = cmd.getParameterValue("@DCDE", NString.class);


		}
		
		public static void pDispdednytddriver(NNumber pidm,Ref<NString> dcde,NString fMnth,NString fYear,NString tMnth,NString tYear,NString inFunc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDQRY.P_DISPDEDNYTDDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DCDE", dcde, true);
			cmd.addParameter("@F_MNTH", fMnth);
			cmd.addParameter("@F_YEAR", fYear);
			cmd.addParameter("@T_MNTH", tMnth);
			cmd.addParameter("@T_YEAR", tYear);
			cmd.addParameter("@IN_FUNC", inFunc);
				
			cmd.execute();
			dcde.val = cmd.getParameterValue("@DCDE", NString.class);


		}
		
		public static void pUpdatedednselnewdriver(NNumber pidm,NString dedngrp) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKDQRY.P_UPDATEDEDNSELNEWDRIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@DEDNGRP", dedngrp);
				
			cmd.execute();


		}
		
	
	
	
}
