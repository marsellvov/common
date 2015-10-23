package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Siafacs {
		public static NNumber fCheckTenr(NString tenrCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIAFACS.F_CHECK_TENR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@TENR_CODE", tenrCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pCheckTabs(Ref<NString> parErrMsg,NNumber parPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SIAFACS.P_CHECK_TABS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAR_ERR_MSG", parErrMsg, true);
			cmd.addParameter("@PAR_PIDM", parPidm);
				
			cmd.execute();
			parErrMsg.val = cmd.getParameterValue("@PAR_ERR_MSG", NString.class);


		}
		
	
	
	
}
