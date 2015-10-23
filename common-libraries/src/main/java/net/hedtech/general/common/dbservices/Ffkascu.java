package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ffkascu {
		public static NString fAcctAssetCurrent(NString pCoas,NString pAcct,NDate pEffDT) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FFKASCU.F_ACCT_ASSET_CURRENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS", pCoas);
			cmd.addParameter("@P_ACCT", pAcct);
			cmd.addParameter("@P_EFF_D_T", pEffDT);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
