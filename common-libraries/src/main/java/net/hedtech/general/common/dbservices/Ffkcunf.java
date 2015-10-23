package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ffkcunf {
		public static NString fAcctCurrNoF(NString pCoas,NString pAcct,NDate pEffDT) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKCUNF.F_ACCT_CURR_NO_F", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_ACCT", pAcct);
			cmd.addParameter("@P_EFF_D_T", pEffDT);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
