package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokvisa {
		public static NString fCheckCitz(NString parId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKVISA.F_CHECK_CITZ", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PAR_ID", parId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckVisa(NString parId,NDate parAsOfDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKVISA.F_CHECK_VISA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PAR_ID", parId);
			cmd.addParameter("@PAR_AS_OF_DATE", parAsOfDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
