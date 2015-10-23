package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gtemp {
		public static NBool fIsproductinstalled(NString productLitIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GTEMP.F_ISPRODUCTINSTALLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@PRODUCT_LIT_IN", productLitIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fIssystemlinkenabled(NString systemCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GTEMP.F_ISSYSTEMLINKENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@SYSTEM_CODE_IN", systemCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
