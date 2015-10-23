package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Eokprid {
		public static NString fSubstNonCurrId(NNumber appidIn,NString sqlIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EOKPRID.F_SUBST_NON_CURR_ID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@APPID_IN", appidIn);
			cmd.addParameter("@SQL_IN", sqlIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
