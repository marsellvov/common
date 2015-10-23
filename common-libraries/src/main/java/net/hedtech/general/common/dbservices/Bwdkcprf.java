package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwdkcprf {
		public static void pDispAddresses(NNumber consPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKCPRF.P_DISP_ADDRESSES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
				
			cmd.execute();


		}
		
		public static void pDispInternetAddresses(NNumber consPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKCPRF.P_DISP_INTERNET_ADDRESSES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
				
			cmd.execute();


		}
		
		public static void pDispProspect(NNumber consPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKCPRF.P_DISP_PROSPECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
				
			cmd.execute();


		}
		
		public static void pIdDropdownSelected(NNumber consPidm,NString linkChoice,NString submitBtn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKCPRF.P_ID_DROPDOWN_SELECTED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@LINK_CHOICE", linkChoice);
			cmd.addParameter("@SUBMIT_BTN", submitBtn);
				
			cmd.execute();


		}
		
		public static void pLongProfile(NNumber consPidm,NString backUrl,NString passMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKCPRF.P_LONG_PROFILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@BACK_URL", backUrl);
			cmd.addParameter("@PASS_MSG", passMsg);
				
			cmd.execute();


		}
		
		public static void pShortProfile(NNumber consPidm,NString backUrl,NString passMsg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKCPRF.P_SHORT_PROFILE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@BACK_URL", backUrl);
			cmd.addParameter("@PASS_MSG", passMsg);
				
			cmd.execute();


		}
		
		public static void pViewgiftDetail(NNumber consPidm,NString giftNo,NString dispOpt,NNumber combPidm,NNumber xrefPidm,NString xrefType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKCPRF.P_VIEWGIFT_DETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@DISP_OPT", dispOpt);
			cmd.addParameter("@COMB_PIDM", combPidm);
			cmd.addParameter("@XREF_PIDM", xrefPidm);
			cmd.addParameter("@XREF_TYPE", xrefType);
				
			cmd.execute();


		}
		
		public static void pViewpledgeDetail(NNumber consPidm,NString pldgNo,NString dispOpt,NNumber combPidm,NNumber xrefPidm,NString xrefType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKCPRF.P_VIEWPLEDGE_DETAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@PLDG_NO", pldgNo);
			cmd.addParameter("@DISP_OPT", dispOpt);
			cmd.addParameter("@COMB_PIDM", combPidm);
			cmd.addParameter("@XREF_PIDM", xrefPidm);
			cmd.addParameter("@XREF_TYPE", xrefType);
				
			cmd.execute();


		}
		
	
	
	
}
