package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwdklibs {
		public static NString fDecode(NString stringIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.F_DECODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STRING_IN", stringIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fUseamrconf(NNumber pidmIn,NString idenCodeIn,NNumber grpSeqNoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.F_USEAMRCONF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@IDEN_CODE_IN", idenCodeIn);
			cmd.addParameter("@GRP_SEQ_NO_IN", grpSeqNoIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fUseaprconf(NNumber pidmIn,NString idenCodeIn,NNumber grpSeqNoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.F_USEAPRCONF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@IDEN_CODE_IN", idenCodeIn);
			cmd.addParameter("@GRP_SEQ_NO_IN", grpSeqNoIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAlternateNames(NNumber consPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_ALTERNATE_NAMES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
				
			cmd.execute();


		}
		
		public static void pBuildDefaultSearches(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_BUILD_DEFAULT_SEARCHES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();


		}
		
		public static void pBuildIdLink(NNumber pidm,NNumber consPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_BUILD_ID_LINK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@CONS_PIDM", consPidm);
				
			cmd.execute();


		}
		
		public static void pBuildLinkDropdown(NNumber consPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_BUILD_LINK_DROPDOWN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
				
			cmd.execute();


		}
		
		public static void pCondensedHeader(NNumber consPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_CONDENSED_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
				
			cmd.execute();


		}
		
		public static void pDispAdditionalDetails(NNumber consPidm,NString giftNo,NString pledgeNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_DISP_ADDITIONAL_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@PLEDGE_NO", pledgeNo);
				
			cmd.execute();


		}
		
		public static void pDispAdditionalPhones(NNumber consPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_DISP_ADDITIONAL_PHONES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
				
			cmd.execute();


		}
		
		public static void pDispAlerts(NNumber consPidm,NString currentUser) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_DISP_ALERTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@CURRENT_USER", currentUser);
				
			cmd.execute();


		}
		
		public static void pDispAllComments(NNumber prosPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_DISP_ALL_COMMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
				
			cmd.execute();


		}
		
		public static void pDispAssociatedIds(NNumber consPidm,NString giftNo,NString pldgNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_DISP_ASSOCIATED_IDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@PLDG_NO", pldgNo);
				
			cmd.execute();


		}
		
		public static void pDispBeneficiaries(NNumber consPidm,NString giftNo,NString pledgeNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_DISP_BENEFICIARIES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@GIFT_NO", giftNo);
			cmd.addParameter("@PLEDGE_NO", pledgeNo);
				
			cmd.execute();


		}
		
		public static void pDispContacts(NNumber consPidm,NString nextPage) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_DISP_CONTACTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@NEXT_PAGE", nextPage);
				
			cmd.execute();


		}
		
		public static void pDispExternalRatings(NNumber consPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_DISP_EXTERNAL_RATINGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
				
			cmd.execute();


		}
		
		public static void pDispGeneralComments(NNumber prosPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_DISP_GENERAL_COMMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
				
			cmd.execute();


		}
		
		public static void pDispNameSalutations(NNumber prosPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_DISP_NAME_SALUTATIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
				
			cmd.execute();


		}
		
		public static void pDispOverallTotals(NNumber consPidm,NNumber combPidm,NString type,NString pdPldgPref) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_DISP_OVERALL_TOTALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
			cmd.addParameter("@COMB_PIDM", combPidm);
			cmd.addParameter("@TYPE", type);
			cmd.addParameter("@PD_PLDG_PREF", pdPldgPref);
				
			cmd.execute();


		}
		
		public static void pDispPlannedGifts(NNumber consPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_DISP_PLANNED_GIFTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
				
			cmd.execute();


		}
		
		public static void pDispProspectComments(NNumber prosPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_DISP_PROSPECT_COMMENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
				
			cmd.execute();


		}
		
		public static void pDispRaceEthnicity(NNumber consPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_DISP_RACE_ETHNICITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
				
			cmd.execute();


		}
		
		public static void pDispRatings(NNumber consPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_DISP_RATINGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
				
			cmd.execute();


		}
		
		public static void pDispResearchData(NNumber prosPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_DISP_RESEARCH_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
				
			cmd.execute();


		}
		
		public static void pDispResearchSources(NNumber prosPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_DISP_RESEARCH_SOURCES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
				
			cmd.execute();


		}
		
		public static void pDispResearchers(NNumber prosPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_DISP_RESEARCHERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
				
			cmd.execute();


		}
		
		public static void pDispStaffAssigned(NNumber prosPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_DISP_STAFF_ASSIGNED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROS_PIDM", prosPidm);
				
			cmd.execute();


		}
		
		public static void pExpandedHeader(NNumber consPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWDKLIBS.P_EXPANDED_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CONS_PIDM", consPidm);
				
			cmd.execute();


		}
		
	
	
	
}
