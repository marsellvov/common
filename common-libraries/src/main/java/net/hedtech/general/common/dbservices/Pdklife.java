package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Pdklife {
		public static void pCalAmts(NString pNewHireFlag,NNumber pPidm,NString pBdca,NString pBdpl,NDate pDate,NNumber pOvrAmtIn,Ref<NNumber> pPreAmtOut,Ref<NNumber> pInsSalOut,Ref<NNumber> pCovAmtOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PDKLIFE.P_CAL_AMTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NEW_HIRE_FLAG", pNewHireFlag);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA", pBdca);
			cmd.addParameter("@P_BDPL", pBdpl);
			cmd.addParameter("@P_DATE", pDate);
			cmd.addParameter("@P_OVR_AMT_IN", pOvrAmtIn);
			cmd.addParameter("@P_PRE_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_INS_SAL_OUT", NNumber.class);
			cmd.addParameter("@P_COV_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pPreAmtOut.val = cmd.getParameterValue("@P_PRE_AMT_OUT", NNumber.class);
			pInsSalOut.val = cmd.getParameterValue("@P_INS_SAL_OUT", NNumber.class);
			pCovAmtOut.val = cmd.getParameterValue("@P_COV_AMT_OUT", NNumber.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
	
	
	
}
