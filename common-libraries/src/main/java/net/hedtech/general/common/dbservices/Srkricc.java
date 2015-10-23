package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Srkricc {
		public static void pCreateSrbricc(NString pProcessCodeIn,NDate pCcurStartDateIn,NString pSessionidIn,Ref<NNumber> pRecCountOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKRICC.P_CREATE_SRBRICC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROCESS_CODE_IN", pProcessCodeIn);
			cmd.addParameter("@P_CCUR_START_DATE_IN", pCcurStartDateIn);
			cmd.addParameter("@P_SESSIONID_IN", pSessionidIn);
			cmd.addParameter("@P_REC_COUNT_OUT", NNumber.class);
				
			cmd.execute();
			pRecCountOut.val = cmd.getParameterValue("@P_REC_COUNT_OUT", NNumber.class);


		}
		
	
	
	
}
