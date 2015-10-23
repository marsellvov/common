package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwdkpprf {
		public static void pLongProfile(NNumber prosPidm,NString backUrl,NString passMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPPRF.P_LONG_PROFILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
			cmd.addParameter("@BACK_URL", backUrl);
			cmd.addParameter("@PASS_MSG", passMsg);
				
			cmd.execute();


		}
		
		public static void pShortProfile(NNumber prosPidm,NString backUrl,NString passMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPPRF.P_SHORT_PROFILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
			cmd.addParameter("@BACK_URL", backUrl);
			cmd.addParameter("@PASS_MSG", passMsg);
				
			cmd.execute();


		}
		
		public static void pViewgiftDetail(NNumber consPidm,NString giftNo,NString dispOpt,NNumber combPidm,NNumber xrefPidm,NString xrefType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPPRF.P_VIEWGIFT_DETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@DISP_OPT", dispOpt);
			cmd.addParameter("@COMB_PIDM", combPidm);
			cmd.addParameter("@XREF_PIDM", xrefPidm);
			cmd.addParameter("@XREF_TYPE", xrefType);
				
			cmd.execute();


		}
		
		public static void pViewpledgeDetail(NNumber consPidm,NString pldgNo,NString dispOpt,NNumber combPidm,NNumber xrefPidm,NString xrefType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKPPRF.P_VIEWPLEDGE_DETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@PLDG_NO", pldgNo);
			cmd.addParameter("@DISP_OPT", dispOpt);
			cmd.addParameter("@COMB_PIDM", combPidm);
			cmd.addParameter("@XREF_PIDM", xrefPidm);
			cmd.addParameter("@XREF_TYPE", xrefType);
				
			cmd.execute();


		}
		
	
	
	
}
