package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Ewfevnt {
		public static NBool FpIndexDelete(NNumber vAppid,NNumber vDocid,NString vUsername,NString vIndex,NString vAllindexes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EWFEVNT.P_INDEX_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_INDEX", vIndex);
			cmd.addParameter("@V_ALLINDEXES", vAllindexes);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool FpIndexUpdate(NNumber vAppid,NNumber vDocid,NString vUsername,NNumber vFlags,NString vIndex,NString vFmrindex) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("EWFEVNT.P_INDEX_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@V_APPID", vAppid);
			cmd.addParameter("@V_DOCID", vDocid);
			cmd.addParameter("@V_USERNAME", vUsername);
			cmd.addParameter("@V_FLAGS", vFlags);
			cmd.addParameter("@V_INDEX", vIndex);
			cmd.addParameter("@V_FMRINDEX", vFmrindex);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
