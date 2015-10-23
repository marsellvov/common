package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Srksels {
		public static NString fGetSrrlendLendCode(NNumber pPidm,NString pTerm,NNumber pApplNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SRKSELS.F_GET_SRRLEND_LEND_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_APPL_NO", pApplNo);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
