package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sskfunc {
		public static void pAddEnrl(Ref<NNumber> censusEnrlInOut,Ref<NNumber> census2EnrlInOut,NDate censusEnrlDateIn,NDate census2DateIn,NNumber creditHrsIn,NString reservedIndIn,NNumber oldCreditHrsIn,NString xlstGroupIn,NDate currDateIn,NString ssbsectRowidIn,NString ssrresvRowidIn,NString ssbxlstRowidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKFUNC.P_ADD_ENRL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CENSUS_ENRL_IN_OUT", censusEnrlInOut, true);
			cmd.addParameter("@CENSUS_2_ENRL_IN_OUT", census2EnrlInOut, true);
			cmd.addParameter("@CENSUS_ENRL_DATE_IN", censusEnrlDateIn);
			cmd.addParameter("@CENSUS_2_DATE_IN", census2DateIn);
			cmd.addParameter("@CREDIT_HRS_IN", creditHrsIn);
			cmd.addParameter("@RESERVED_IND_IN", reservedIndIn);
			cmd.addParameter("@OLD_CREDIT_HRS_IN", oldCreditHrsIn);
			cmd.addParameter("@XLST_GROUP_IN", xlstGroupIn);
			cmd.addParameter("@CURR_DATE_IN", currDateIn);
			cmd.addParameter("@SSBSECT_ROWID_IN", ssbsectRowidIn);
			cmd.addParameter("@SSRRESV_ROWID_IN", ssrresvRowidIn);
			cmd.addParameter("@SSBXLST_ROWID_IN", ssbxlstRowidIn);
				
			cmd.execute();
			censusEnrlInOut.val = cmd.getParameterValue("@CENSUS_ENRL_IN_OUT", NNumber.class);
			census2EnrlInOut.val = cmd.getParameterValue("@CENSUS_2_ENRL_IN_OUT", NNumber.class);


		}
		
		public static void pAddWait(NString ssbsectRowidIn,NString ssrresvRowidIn,NString sectResvIndIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKFUNC.P_ADD_WAIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SSBSECT_ROWID_IN", ssbsectRowidIn);
			cmd.addParameter("@SSRRESV_ROWID_IN", ssrresvRowidIn);
			cmd.addParameter("@SECT_RESV_IND_IN", sectResvIndIn);
				
			cmd.execute();


		}
		
		public static void pSubEnrl(Ref<NNumber> censusEnrlInOut,Ref<NNumber> census2EnrlInOut,NDate censusEnrlDateIn,NDate census2DateIn,NNumber creditHrsIn,NString reservedIndIn,NNumber oldCreditHrsIn,NString xlstGroupIn,NDate currDateIn,NString ssbsectRowidIn,NString ssrresvRowidIn,NString ssbxlstRowidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKFUNC.P_SUB_ENRL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CENSUS_ENRL_IN_OUT", censusEnrlInOut, true);
			cmd.addParameter("@CENSUS_2_ENRL_IN_OUT", census2EnrlInOut, true);
			cmd.addParameter("@CENSUS_ENRL_DATE_IN", censusEnrlDateIn);
			cmd.addParameter("@CENSUS_2_DATE_IN", census2DateIn);
			cmd.addParameter("@CREDIT_HRS_IN", creditHrsIn);
			cmd.addParameter("@RESERVED_IND_IN", reservedIndIn);
			cmd.addParameter("@OLD_CREDIT_HRS_IN", oldCreditHrsIn);
			cmd.addParameter("@XLST_GROUP_IN", xlstGroupIn);
			cmd.addParameter("@CURR_DATE_IN", currDateIn);
			cmd.addParameter("@SSBSECT_ROWID_IN", ssbsectRowidIn);
			cmd.addParameter("@SSRRESV_ROWID_IN", ssrresvRowidIn);
			cmd.addParameter("@SSBXLST_ROWID_IN", ssbxlstRowidIn);
				
			cmd.execute();
			censusEnrlInOut.val = cmd.getParameterValue("@CENSUS_ENRL_IN_OUT", NNumber.class);
			census2EnrlInOut.val = cmd.getParameterValue("@CENSUS_2_ENRL_IN_OUT", NNumber.class);


		}
		
		public static void pSubWait(NString ssbsectRowidIn,NString ssrresvRowidIn,NString sectResvIndIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKFUNC.P_SUB_WAIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SSBSECT_ROWID_IN", ssbsectRowidIn);
			cmd.addParameter("@SSRRESV_ROWID_IN", ssrresvRowidIn);
			cmd.addParameter("@SECT_RESV_IND_IN", sectResvIndIn);
				
			cmd.execute();


		}
		
		public static void pUpdSectionHours(Ref<NString> oldInclEnrlInOut,Ref<NString> oldWaitIndInOut,Ref<NString> waitIndInOut,Ref<NString> inclEnrlInOut,Ref<NNumber> creditHrInOut,Ref<NNumber> oldCreditHrInOut,Ref<NNumber> censusEnrlInOut,Ref<NNumber> census2EnrlInOut,NDate censusEnrlDateIn,NDate census2DateIn,NString reservedIndIn,NString xlstGroupIn,NDate currDateIn,NString ssbsectRowidIn,NString ssrresvRowidIn,NString ssbxlstRowidIn,NString oldSsrresvRowidIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SSKFUNC.P_UPD_SECTION_HOURS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OLD_INCL_ENRL_IN_OUT", oldInclEnrlInOut, true);
			cmd.addParameter("@OLD_WAIT_IND_IN_OUT", oldWaitIndInOut, true);
			cmd.addParameter("@WAIT_IND_IN_OUT", waitIndInOut, true);
			cmd.addParameter("@INCL_ENRL_IN_OUT", inclEnrlInOut, true);
			cmd.addParameter("@CREDIT_HR_IN_OUT", creditHrInOut, true);
			cmd.addParameter("@OLD_CREDIT_HR_IN_OUT", oldCreditHrInOut, true);
			cmd.addParameter("@CENSUS_ENRL_IN_OUT", censusEnrlInOut, true);
			cmd.addParameter("@CENSUS_2_ENRL_IN_OUT", census2EnrlInOut, true);
			cmd.addParameter("@CENSUS_ENRL_DATE_IN", censusEnrlDateIn);
			cmd.addParameter("@CENSUS_2_DATE_IN", census2DateIn);
			cmd.addParameter("@RESERVED_IND_IN", reservedIndIn);
			cmd.addParameter("@XLST_GROUP_IN", xlstGroupIn);
			cmd.addParameter("@CURR_DATE_IN", currDateIn);
			cmd.addParameter("@SSBSECT_ROWID_IN", ssbsectRowidIn);
			cmd.addParameter("@SSRRESV_ROWID_IN", ssrresvRowidIn);
			cmd.addParameter("@SSBXLST_ROWID_IN", ssbxlstRowidIn);
			cmd.addParameter("@OLD_SSRRESV_ROWID_IN", oldSsrresvRowidIn);
				
			cmd.execute();
			oldInclEnrlInOut.val = cmd.getParameterValue("@OLD_INCL_ENRL_IN_OUT", NString.class);
			oldWaitIndInOut.val = cmd.getParameterValue("@OLD_WAIT_IND_IN_OUT", NString.class);
			waitIndInOut.val = cmd.getParameterValue("@WAIT_IND_IN_OUT", NString.class);
			inclEnrlInOut.val = cmd.getParameterValue("@INCL_ENRL_IN_OUT", NString.class);
			creditHrInOut.val = cmd.getParameterValue("@CREDIT_HR_IN_OUT", NNumber.class);
			oldCreditHrInOut.val = cmd.getParameterValue("@OLD_CREDIT_HR_IN_OUT", NNumber.class);
			censusEnrlInOut.val = cmd.getParameterValue("@CENSUS_ENRL_IN_OUT", NNumber.class);
			census2EnrlInOut.val = cmd.getParameterValue("@CENSUS_2_ENRL_IN_OUT", NNumber.class);


		}
		
	
	
	
}
