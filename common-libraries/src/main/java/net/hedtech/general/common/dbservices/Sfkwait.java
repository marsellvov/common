package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkwait {
		public static NNumber fGetSeats(NString pTerm,NString pCrn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWAIT.F_GET_SEATS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_CRN", pCrn);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pCapacityCheck(NString termIn,NString crnIn,NString sobtermCapcSeverityIn,Ref<NString> sfrstcrErrorFlagInOut,Ref<NString> sfrstcrRmsgCdeInOut,Ref<NString> sfrstcrMessageInOut,Ref<NString> apprErrorInOut,NString sfrstcrCapcOverIn,NString sfrstcrWaitOverIn,NString stvrstsWaitIndIn,NString stvrstsInclSectEnrlIn,NString oldStvrstsWaitIndIn,NString oldStvrstsInclSectEnrlIn,NString ssbsectReservedIndIn,NNumber ssbsectSeatsAvailIn,NNumber ssbsectWaitCountIn,NNumber ssbsectWaitCapacityIn,NNumber ssbsectWaitAvailIn,NString xlstGroupIn,NNumber xlstSeatsAvailIn,NNumber ssrresvSeatsAvailIn,NNumber ssrresvWaitCountIn,NNumber ssrresvWaitCapacityIn,NNumber ssrresvWaitAvailIn,NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKWAIT.P_CAPACITY_CHECK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@CRN_IN", crnIn);
			cmd.addParameter("@SOBTERM_CAPC_SEVERITY_IN", sobtermCapcSeverityIn);
			cmd.addParameter("@SFRSTCR_ERROR_FLAG_IN_OUT", sfrstcrErrorFlagInOut, true);
			cmd.addParameter("@SFRSTCR_RMSG_CDE_IN_OUT", sfrstcrRmsgCdeInOut, true);
			cmd.addParameter("@SFRSTCR_MESSAGE_IN_OUT", sfrstcrMessageInOut, true);
			cmd.addParameter("@APPR_ERROR_IN_OUT", apprErrorInOut, true);
			cmd.addParameter("@SFRSTCR_CAPC_OVER_IN", sfrstcrCapcOverIn);
			cmd.addParameter("@SFRSTCR_WAIT_OVER_IN", sfrstcrWaitOverIn);
			cmd.addParameter("@STVRSTS_WAIT_IND_IN", stvrstsWaitIndIn);
			cmd.addParameter("@STVRSTS_INCL_SECT_ENRL_IN", stvrstsInclSectEnrlIn);
			cmd.addParameter("@OLD_STVRSTS_WAIT_IND_IN", oldStvrstsWaitIndIn);
			cmd.addParameter("@OLD_STVRSTS_INCL_SECT_ENRL_IN", oldStvrstsInclSectEnrlIn);
			cmd.addParameter("@SSBSECT_RESERVED_IND_IN", ssbsectReservedIndIn);
			cmd.addParameter("@SSBSECT_SEATS_AVAIL_IN", ssbsectSeatsAvailIn);
			cmd.addParameter("@SSBSECT_WAIT_COUNT_IN", ssbsectWaitCountIn);
			cmd.addParameter("@SSBSECT_WAIT_CAPACITY_IN", ssbsectWaitCapacityIn);
			cmd.addParameter("@SSBSECT_WAIT_AVAIL_IN", ssbsectWaitAvailIn);
			cmd.addParameter("@XLST_GROUP_IN", xlstGroupIn);
			cmd.addParameter("@XLST_SEATS_AVAIL_IN", xlstSeatsAvailIn);
			cmd.addParameter("@SSRRESV_SEATS_AVAIL_IN", ssrresvSeatsAvailIn);
			cmd.addParameter("@SSRRESV_WAIT_COUNT_IN", ssrresvWaitCountIn);
			cmd.addParameter("@SSRRESV_WAIT_CAPACITY_IN", ssrresvWaitCapacityIn);
			cmd.addParameter("@SSRRESV_WAIT_AVAIL_IN", ssrresvWaitAvailIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();
			sfrstcrErrorFlagInOut.val = cmd.getParameterValue("@SFRSTCR_ERROR_FLAG_IN_OUT", NString.class);
			sfrstcrRmsgCdeInOut.val = cmd.getParameterValue("@SFRSTCR_RMSG_CDE_IN_OUT", NString.class);
			sfrstcrMessageInOut.val = cmd.getParameterValue("@SFRSTCR_MESSAGE_IN_OUT", NString.class);
			apprErrorInOut.val = cmd.getParameterValue("@APPR_ERROR_IN_OUT", NString.class);


		}
		
	
	
	
}
