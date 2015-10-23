package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Sfkdrop {
		public static NBool fDropLast(NString webVrIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SFKDROP.F_DROP_LAST", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@WEB_VR_IN", webVrIn);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
