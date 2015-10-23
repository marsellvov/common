package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Agkpins {
		public static void pCalcCurrDate(NString freqTypeIn,NNumber freqIn,NNumber totInstNum,NNumber amtPledged,NString pgmIn,NDate lowDateIn,NNumber secDayIn,Ref<NNumber> instAmtIn,Ref<NNumber> instRunTot,Ref<NDate> currDateOut,Ref<NNumber> currInstNumOut,Ref<NNumber> fiscCtr,Ref<NNumber> numOfMonths,Ref<NString> msgOut,Ref<NString> errOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKPINS.P_CALC_CURR_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FREQ_TYPE_IN", freqTypeIn);
			cmd.addParameter("@FREQ_IN", freqIn);
			cmd.addParameter("@TOT_INST_NUM", totInstNum);
			cmd.addParameter("@AMT_PLEDGED", amtPledged);
			cmd.addParameter("@PGM_IN", pgmIn);
			cmd.addParameter("@LOW_DATE_IN", lowDateIn);
			cmd.addParameter("@SEC_DAY_IN", secDayIn);
			cmd.addParameter("@INST_AMT_IN", instAmtIn, true);
			cmd.addParameter("@INST_RUN_TOT", instRunTot, true);
			cmd.addParameter("@CURR_DATE_OUT", currDateOut, true);
			cmd.addParameter("@CURR_INST_NUM_OUT", currInstNumOut, true);
			cmd.addParameter("@FISC_CTR", fiscCtr, true);
			cmd.addParameter("@NUM_OF_MONTHS", numOfMonths, true);
			cmd.addParameter("@MSG_OUT", msgOut, true);
			cmd.addParameter("@ERR_OUT", errOut, true);
				
			cmd.execute();
			instAmtIn.val = cmd.getParameterValue("@INST_AMT_IN", NNumber.class);
			instRunTot.val = cmd.getParameterValue("@INST_RUN_TOT", NNumber.class);
			currDateOut.val = cmd.getParameterValue("@CURR_DATE_OUT", NDate.class);
			currInstNumOut.val = cmd.getParameterValue("@CURR_INST_NUM_OUT", NNumber.class);
			fiscCtr.val = cmd.getParameterValue("@FISC_CTR", NNumber.class);
			numOfMonths.val = cmd.getParameterValue("@NUM_OF_MONTHS", NNumber.class);
			msgOut.val = cmd.getParameterValue("@MSG_OUT", NString.class);
			errOut.val = cmd.getParameterValue("@ERR_OUT", NString.class);


		}
		
		public static void pCalcDetails(NNumber pidmIn,NNumber pledgeNoIn,NString dataOrigin,NString tabCommit,Ref<NString> msgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKPINS.P_CALC_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@PLEDGE_NO_IN", pledgeNoIn);
			cmd.addParameter("@DATA_ORIGIN", dataOrigin);
			cmd.addParameter("@TAB_COMMIT", tabCommit);
			cmd.addParameter("@MSG_OUT", msgOut, true);
				
			cmd.execute();
			msgOut.val = cmd.getParameterValue("@MSG_OUT", NString.class);


		}
		
		public static void pCalcHighDate(NDate lowDateIn,NNumber durationIn,Ref<NDate> highDateOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKPINS.P_CALC_HIGH_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LOW_DATE_IN", lowDateIn);
			cmd.addParameter("@DURATION_IN", durationIn);
			cmd.addParameter("@HIGH_DATE_OUT", highDateOut, true);
				
			cmd.execute();
			highDateOut.val = cmd.getParameterValue("@HIGH_DATE_OUT", NDate.class);


		}
		
		public static void pCalcTotInstalls(NDate lowDateIn,NNumber durationIn,NString freqTypeIn,NNumber freqIn,NNumber amtPledgedIn,NDate lastDateIn,NDate highDateOut,Ref<NNumber> totInstOut,Ref<NNumber> holdInstAmtOut,Ref<NNumber> currInstNumOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKPINS.P_CALC_TOT_INSTALLS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@LOW_DATE_IN", lowDateIn);
			cmd.addParameter("@DURATION_IN", durationIn);
			cmd.addParameter("@FREQ_TYPE_IN", freqTypeIn);
			cmd.addParameter("@FREQ_IN", freqIn);
			cmd.addParameter("@AMT_PLEDGED_IN", amtPledgedIn);
			cmd.addParameter("@LAST_DATE_IN", lastDateIn);
			cmd.addParameter("@HIGH_DATE_OUT", highDateOut);
			cmd.addParameter("@TOT_INST_OUT", totInstOut, true);
			cmd.addParameter("@HOLD_INST_AMT_OUT", holdInstAmtOut, true);
			cmd.addParameter("@CURR_INST_NUM_OUT", currInstNumOut, true);
				
			cmd.execute();
			totInstOut.val = cmd.getParameterValue("@TOT_INST_OUT", NNumber.class);
			holdInstAmtOut.val = cmd.getParameterValue("@HOLD_INST_AMT_OUT", NNumber.class);
			currInstNumOut.val = cmd.getParameterValue("@CURR_INST_NUM_OUT", NNumber.class);


		}
		
		public static void pCompBillDate(NString freqTypeIn,NDate billDateIn,Ref<NString> errOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKPINS.P_COMP_BILL_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FREQ_TYPE_IN", freqTypeIn);
			cmd.addParameter("@BILL_DATE_IN", billDateIn);
			cmd.addParameter("@ERR_OUT", errOut, true);
				
			cmd.execute();
			errOut.val = cmd.getParameterValue("@ERR_OUT", NString.class);


		}
		
		public static void pSetupFreq(NString intTypeIn,NNumber intervalIn,NNumber numOfMonths,Ref<NString> freqTypeOut,Ref<NNumber> freqOut,Ref<NString> msgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("AGKPINS.P_SETUP_FREQ", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INT_TYPE_IN", intTypeIn);
			cmd.addParameter("@INTERVAL_IN", intervalIn);
			cmd.addParameter("@NUM_OF_MONTHS", numOfMonths);
			cmd.addParameter("@FREQ_TYPE_OUT", freqTypeOut, true);
			cmd.addParameter("@FREQ_OUT", freqOut, true);
			cmd.addParameter("@MSG_OUT", msgOut, true);
				
			cmd.execute();
			freqTypeOut.val = cmd.getParameterValue("@FREQ_TYPE_OUT", NString.class);
			freqOut.val = cmd.getParameterValue("@FREQ_OUT", NNumber.class);
			msgOut.val = cmd.getParameterValue("@MSG_OUT", NString.class);


		}
		
	
	
	
}
