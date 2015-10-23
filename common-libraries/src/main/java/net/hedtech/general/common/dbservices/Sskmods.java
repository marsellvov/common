package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sskmods {
		public static NBool fAddSsbsectEnrlCounts(NString ssbsectRowidIn,NNumber creditHrsIn,NNumber oldCreditHrsIn,NNumber censusEnrlIn,NNumber census2EnrlIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKMODS.F_ADD_SSBSECT_ENRL_COUNTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SSBSECT_ROWID_IN", ssbsectRowidIn);
			cmd.addParameter("@CREDIT_HRS_IN", creditHrsIn);
			cmd.addParameter("@OLD_CREDIT_HRS_IN", oldCreditHrsIn);
			cmd.addParameter("@CENSUS_ENRL_IN", censusEnrlIn);
			cmd.addParameter("@CENSUS_2_ENRL_IN", census2EnrlIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAddSsbsectWaitCounts(NString ssbsectRowidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKMODS.F_ADD_SSBSECT_WAIT_COUNTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SSBSECT_ROWID_IN", ssbsectRowidIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAddSsbxlstEnrlCounts(NString ssbxlstRowidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKMODS.F_ADD_SSBXLST_ENRL_COUNTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SSBXLST_ROWID_IN", ssbxlstRowidIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAddSsrresvEnrlCounts(NString ssrresvRowidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKMODS.F_ADD_SSRRESV_ENRL_COUNTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SSRRESV_ROWID_IN", ssrresvRowidIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fAddSsrresvWaitCounts(NString ssrresvRowidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKMODS.F_ADD_SSRRESV_WAIT_COUNTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SSRRESV_ROWID_IN", ssrresvRowidIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fSubSsbsectEnrlCounts(NString ssbsectRowidIn,NNumber creditHrsIn,NNumber oldCreditHrsIn,NNumber censusEnrlIn,NNumber census2EnrlIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKMODS.F_SUB_SSBSECT_ENRL_COUNTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SSBSECT_ROWID_IN", ssbsectRowidIn);
			cmd.addParameter("@CREDIT_HRS_IN", creditHrsIn);
			cmd.addParameter("@OLD_CREDIT_HRS_IN", oldCreditHrsIn);
			cmd.addParameter("@CENSUS_ENRL_IN", censusEnrlIn);
			cmd.addParameter("@CENSUS_2_ENRL_IN", census2EnrlIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fSubSsbsectWaitCounts(NString ssbsectRowidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKMODS.F_SUB_SSBSECT_WAIT_COUNTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SSBSECT_ROWID_IN", ssbsectRowidIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fSubSsbxlstEnrlCounts(NString ssbxlstRowidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKMODS.F_SUB_SSBXLST_ENRL_COUNTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SSBXLST_ROWID_IN", ssbxlstRowidIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fSubSsrresvEnrlCounts(NString ssrresvRowidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKMODS.F_SUB_SSRRESV_ENRL_COUNTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SSRRESV_ROWID_IN", ssrresvRowidIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fSubSsrresvWaitCounts(NString ssrresvRowidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKMODS.F_SUB_SSRRESV_WAIT_COUNTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SSRRESV_ROWID_IN", ssrresvRowidIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fUpdSsbsectCreditHrs(NString ssbsectRowidIn,NNumber creditHrsIn,NNumber oldCreditHrsIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKMODS.F_UPD_SSBSECT_CREDIT_HRS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SSBSECT_ROWID_IN", ssbsectRowidIn);
			cmd.addParameter("@CREDIT_HRS_IN", creditHrsIn);
			cmd.addParameter("@OLD_CREDIT_HRS_IN", oldCreditHrsIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static void pLockAllSectsForPidmTerm(NString termIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKMODS.P_LOCK_ALL_SECTS_FOR_PIDM_TERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();


		}
		
		public static void pLockSsbsectSeatsAvail(Ref<NString> ssbsectRowidInOut,Ref<NString> ssrresvRowidInOut,Ref<NString> ssbxlstRowidInOut,Ref<NNumber> regOneupInOut,Ref<NNumber> seatsAvailInOut,Ref<NNumber> waitAvailInOut,Ref<NNumber> waitCountInOut,Ref<NNumber> waitCapcInOut,Ref<NNumber> censusEnrlInOut,Ref<NDate> censusDateInOut,Ref<NNumber> census2EnrlInOut,Ref<NDate> census2DateInOut,Ref<NString> resvIndInOut,Ref<NString> resvKeyInOut,Ref<NNumber> rseatsAvailInOut,Ref<NNumber> rwaitAvailInOut,Ref<NNumber> rwaitCountInOut,Ref<NNumber> rwaitCapcInOut,Ref<NString> roverflowInOut,Ref<NNumber> xlstSeatsInOut,NString xlstGroupIn,NString waitIndIn,NString clasIn,NString termIn,NString crnIn,NNumber pidmIn,NString pOldWaitIndIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKMODS.P_LOCK_SSBSECT_SEATS_AVAIL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SSBSECT_ROWID_IN_OUT", ssbsectRowidInOut, true);
			cmd.addParameter("@SSRRESV_ROWID_IN_OUT", ssrresvRowidInOut, true);
			cmd.addParameter("@SSBXLST_ROWID_IN_OUT", ssbxlstRowidInOut, true);
			cmd.addParameter("@REG_ONEUP_IN_OUT", regOneupInOut, true);
			cmd.addParameter("@SEATS_AVAIL_IN_OUT", seatsAvailInOut, true);
			cmd.addParameter("@WAIT_AVAIL_IN_OUT", waitAvailInOut, true);
			cmd.addParameter("@WAIT_COUNT_IN_OUT", waitCountInOut, true);
			cmd.addParameter("@WAIT_CAPC_IN_OUT", waitCapcInOut, true);
			cmd.addParameter("@CENSUS_ENRL_IN_OUT", censusEnrlInOut, true);
			cmd.addParameter("@CENSUS_DATE_IN_OUT", censusDateInOut, true);
			cmd.addParameter("@CENSUS_2_ENRL_IN_OUT", census2EnrlInOut, true);
			cmd.addParameter("@CENSUS_2_DATE_IN_OUT", census2DateInOut, true);
			cmd.addParameter("@RESV_IND_IN_OUT", resvIndInOut, true);
			cmd.addParameter("@RESV_KEY_IN_OUT", resvKeyInOut, true);
			cmd.addParameter("@RSEATS_AVAIL_IN_OUT", rseatsAvailInOut, true);
			cmd.addParameter("@RWAIT_AVAIL_IN_OUT", rwaitAvailInOut, true);
			cmd.addParameter("@RWAIT_COUNT_IN_OUT", rwaitCountInOut, true);
			cmd.addParameter("@RWAIT_CAPC_IN_OUT", rwaitCapcInOut, true);
			cmd.addParameter("@ROVERFLOW_IN_OUT", roverflowInOut, true);
			cmd.addParameter("@XLST_SEATS_IN_OUT", xlstSeatsInOut, true);
			cmd.addParameter("@XLST_GROUP_IN", xlstGroupIn);
			cmd.addParameter("@WAIT_IND_IN", waitIndIn);
			cmd.addParameter("@CLAS_IN", clasIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@P_OLD_WAIT_IND_IN", pOldWaitIndIn);
				
			cmd.execute();
			ssbsectRowidInOut.val = cmd.getParameterValue("@SSBSECT_ROWID_IN_OUT", NString.class);
			ssrresvRowidInOut.val = cmd.getParameterValue("@SSRRESV_ROWID_IN_OUT", NString.class);
			ssbxlstRowidInOut.val = cmd.getParameterValue("@SSBXLST_ROWID_IN_OUT", NString.class);
			regOneupInOut.val = cmd.getParameterValue("@REG_ONEUP_IN_OUT", NNumber.class);
			seatsAvailInOut.val = cmd.getParameterValue("@SEATS_AVAIL_IN_OUT", NNumber.class);
			waitAvailInOut.val = cmd.getParameterValue("@WAIT_AVAIL_IN_OUT", NNumber.class);
			waitCountInOut.val = cmd.getParameterValue("@WAIT_COUNT_IN_OUT", NNumber.class);
			waitCapcInOut.val = cmd.getParameterValue("@WAIT_CAPC_IN_OUT", NNumber.class);
			censusEnrlInOut.val = cmd.getParameterValue("@CENSUS_ENRL_IN_OUT", NNumber.class);
			censusDateInOut.val = cmd.getParameterValue("@CENSUS_DATE_IN_OUT", NDate.class);
			census2EnrlInOut.val = cmd.getParameterValue("@CENSUS_2_ENRL_IN_OUT", NNumber.class);
			census2DateInOut.val = cmd.getParameterValue("@CENSUS_2_DATE_IN_OUT", NDate.class);
			resvIndInOut.val = cmd.getParameterValue("@RESV_IND_IN_OUT", NString.class);
			resvKeyInOut.val = cmd.getParameterValue("@RESV_KEY_IN_OUT", NString.class);
			rseatsAvailInOut.val = cmd.getParameterValue("@RSEATS_AVAIL_IN_OUT", NNumber.class);
			rwaitAvailInOut.val = cmd.getParameterValue("@RWAIT_AVAIL_IN_OUT", NNumber.class);
			rwaitCountInOut.val = cmd.getParameterValue("@RWAIT_COUNT_IN_OUT", NNumber.class);
			rwaitCapcInOut.val = cmd.getParameterValue("@RWAIT_CAPC_IN_OUT", NNumber.class);
			roverflowInOut.val = cmd.getParameterValue("@ROVERFLOW_IN_OUT", NString.class);
			xlstSeatsInOut.val = cmd.getParameterValue("@XLST_SEATS_IN_OUT", NNumber.class);


		}
		
	
	
	
}
