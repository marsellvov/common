package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Soavals {
		public static void pCheckAlu(NNumber parPidm,Ref<NString> parConsPrefClas,Ref<NString> parConsActivityDate,Ref<NNumber> par1Feedback) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOAVALS.P_CHECK_ALU", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_CONS_PREF_CLAS", parConsPrefClas, true);
			cmd.addParameter("@PAR_CONS_ACTIVITY_DATE", parConsActivityDate, true);
			cmd.addParameter("@PAR_1_FEEDBACK", par1Feedback, true);
				
			cmd.execute();
			parConsPrefClas.val = cmd.getParameterValue("@PAR_CONS_PREF_CLAS", NString.class);
			parConsActivityDate.val = cmd.getParameterValue("@PAR_CONS_ACTIVITY_DATE", NString.class);
			par1Feedback.val = cmd.getParameterValue("@PAR_1_FEEDBACK", NNumber.class);


		}
		
		public static void pCheckAr2(NNumber parPidm,Ref<NString> parAccdTerm,Ref<NString> parAccdActivityDate,Ref<NNumber> par5Feedback) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOAVALS.P_CHECK_AR2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_ACCD_TERM", parAccdTerm, true);
			cmd.addParameter("@PAR_ACCD_ACTIVITY_DATE", parAccdActivityDate, true);
			cmd.addParameter("@PAR_5_FEEDBACK", par5Feedback, true);
				
			cmd.execute();
			parAccdTerm.val = cmd.getParameterValue("@PAR_ACCD_TERM", NString.class);
			parAccdActivityDate.val = cmd.getParameterValue("@PAR_ACCD_ACTIVITY_DATE", NString.class);
			par5Feedback.val = cmd.getParameterValue("@PAR_5_FEEDBACK", NNumber.class);


		}
		
		public static void pCheckFinAid2(NNumber parPidm,Ref<NString> parStatAidy,Ref<NString> parStatActivityDate,Ref<NNumber> par6Feedback) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOAVALS.P_CHECK_FIN_AID2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_STAT_AIDY", parStatAidy, true);
			cmd.addParameter("@PAR_STAT_ACTIVITY_DATE", parStatActivityDate, true);
			cmd.addParameter("@PAR_6_FEEDBACK", par6Feedback, true);
				
			cmd.execute();
			parStatAidy.val = cmd.getParameterValue("@PAR_STAT_AIDY", NString.class);
			parStatActivityDate.val = cmd.getParameterValue("@PAR_STAT_ACTIVITY_DATE", NString.class);
			par6Feedback.val = cmd.getParameterValue("@PAR_6_FEEDBACK", NNumber.class);


		}
		
		public static void pCheckFin2(NNumber parPidm,Ref<NString> parVendActivityDate,Ref<NNumber> par2Feedback) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOAVALS.P_CHECK_FIN2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_VEND_ACTIVITY_DATE", parVendActivityDate, true);
			cmd.addParameter("@PAR_2_FEEDBACK", par2Feedback, true);
				
			cmd.execute();
			parVendActivityDate.val = cmd.getParameterValue("@PAR_VEND_ACTIVITY_DATE", NString.class);
			par2Feedback.val = cmd.getParameterValue("@PAR_2_FEEDBACK", NNumber.class);


		}
		
		public static void pCheckHr2(NNumber parPidm,Ref<NString> parApplEmplActivityDate,Ref<NNumber> par3Feedback) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOAVALS.P_CHECK_HR2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_APPL_EMPL_ACTIVITY_DATE", parApplEmplActivityDate, true);
			cmd.addParameter("@PAR_3_FEEDBACK", par3Feedback, true);
				
			cmd.execute();
			parApplEmplActivityDate.val = cmd.getParameterValue("@PAR_APPL_EMPL_ACTIVITY_DATE", NString.class);
			par3Feedback.val = cmd.getParameterValue("@PAR_3_FEEDBACK", NNumber.class);


		}
		
		public static void pCheckHr3(NNumber parPidm,Ref<NString> parApplEmplActivityDate,Ref<NNumber> par4Feedback) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOAVALS.P_CHECK_HR3", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_PIDM", parPidm);
			cmd.addParameter("@PAR_APPL_EMPL_ACTIVITY_DATE", parApplEmplActivityDate, true);
			cmd.addParameter("@PAR_4_FEEDBACK", par4Feedback, true);
				
			cmd.execute();
			parApplEmplActivityDate.val = cmd.getParameterValue("@PAR_APPL_EMPL_ACTIVITY_DATE", NString.class);
			par4Feedback.val = cmd.getParameterValue("@PAR_4_FEEDBACK", NNumber.class);


		}
		
		public static void pCheckTab(Ref<NString> parAlu,Ref<NString> parFince,Ref<NString> parHr,Ref<NString> parFinaid,Ref<NString> parAr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SOAVALS.P_CHECK_TAB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_ALU", parAlu, true);
			cmd.addParameter("@PAR_FINCE", parFince, true);
			cmd.addParameter("@PAR_HR", parHr, true);
			cmd.addParameter("@PAR_FINAID", parFinaid, true);
			cmd.addParameter("@PAR_AR", parAr, true);
				
			cmd.execute();
			parAlu.val = cmd.getParameterValue("@PAR_ALU", NString.class);
			parFince.val = cmd.getParameterValue("@PAR_FINCE", NString.class);
			parHr.val = cmd.getParameterValue("@PAR_HR", NString.class);
			parFinaid.val = cmd.getParameterValue("@PAR_FINAID", NString.class);
			parAr.val = cmd.getParameterValue("@PAR_AR", NString.class);


		}
		
	
	
	
}
