package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RpkGrantCalc {
		public static void pCalculateGrant(NString pAidyCode,NNumber pPidm,NString pActionInd,NString pSimulateInd,NString pPeriod,NString pFedFundId,NString pFundCode,NNumber pAwardLimit,Ref<NNumber> pOfferAmt,Ref<NString> pErrorMessageOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RPK_GRANT_CALC.P_CALCULATE_GRANT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ACTION_IND", pActionInd);
			cmd.addParameter("@P_SIMULATE_IND", pSimulateInd);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_FED_FUND_ID", pFedFundId);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_AWARD_LIMIT", pAwardLimit);
			cmd.addParameter("@P_OFFER_AMT", NNumber.class);
			cmd.addParameter("@P_ERROR_MESSAGE_OUT", NString.class);
				
			cmd.execute();
			pOfferAmt.val = cmd.getParameterValue("@P_OFFER_AMT", NNumber.class);
			pErrorMessageOut.val = cmd.getParameterValue("@P_ERROR_MESSAGE_OUT", NString.class);


		}
		
	
	
	
}
