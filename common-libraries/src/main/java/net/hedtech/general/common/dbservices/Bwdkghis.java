package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwdkghis {
		public static void pViewGifts(NNumber consPidm,NString backUrl,NString dispOpt,NNumber combPidm,NNumber xrefPidm,NString xrefType,NString pdPldgPref) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKGHIS.P_VIEW_GIFTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@BACK_URL", backUrl);
			cmd.addParameter("@DISP_OPT", dispOpt);
			cmd.addParameter("@COMB_PIDM", combPidm);
			cmd.addParameter("@XREF_PIDM", xrefPidm);
			cmd.addParameter("@XREF_TYPE", xrefType);
			cmd.addParameter("@PD_PLDG_PREF", pdPldgPref);
				
			cmd.execute();


		}
		
		public static void pViewgiftDetail(NNumber consPidm,NString giftNo,NString dispOpt,NNumber combPidm,NNumber xrefPidm,NString xrefType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKGHIS.P_VIEWGIFT_DETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@DISP_OPT", dispOpt);
			cmd.addParameter("@COMB_PIDM", combPidm);
			cmd.addParameter("@XREF_PIDM", xrefPidm);
			cmd.addParameter("@XREF_TYPE", xrefType);
				
			cmd.execute();


		}
		
		public static void pViewpledgeDetail(NNumber consPidm,NString pldgNo,NString dispOpt,NNumber combPidm,NNumber xrefPidm,NString xrefType,NString pdPldgPref) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKGHIS.P_VIEWPLEDGE_DETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@PLDG_NO", pldgNo);
			cmd.addParameter("@DISP_OPT", dispOpt);
			cmd.addParameter("@COMB_PIDM", combPidm);
			cmd.addParameter("@XREF_PIDM", xrefPidm);
			cmd.addParameter("@XREF_TYPE", xrefType);
			cmd.addParameter("@PD_PLDG_PREF", pdPldgPref);
				
			cmd.execute();


		}
		
	
	
	
}
