package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gvktqpc {
		public static NNumber fCalcqualitypoints(NNumber asrn,NNumber atemppidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GVKTQPC.F_CALCQUALITYPOINTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@ASRN", asrn);
			cmd.addParameter("@ATEMPPIDM", atemppidm);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetlevel(NString apath) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GVKTQPC.F_GETLEVEL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@APATH", apath);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
