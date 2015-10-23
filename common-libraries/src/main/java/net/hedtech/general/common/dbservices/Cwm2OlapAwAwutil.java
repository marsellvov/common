package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapAwAwutil {
		public static NString fetchasstr(NString pVfetchexpr,NNumber pInewlinelength,NNumber pIbuseshowcmd,NNumber pIbconverttotext) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_AW_AWUTIL.FETCHASSTR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VFETCHEXPR", pVfetchexpr);
			cmd.addParameter("@P_INEWLINELENGTH", pInewlinelength);
			cmd.addParameter("@P_IBUSESHOWCMD", pIbuseshowcmd);
			cmd.addParameter("@P_IBCONVERTTOTEXT", pIbconverttotext);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fetchawlog(NString pVfetchexpr,NNumber pInewlinelength) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_AW_AWUTIL.FETCHAWLOG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_VFETCHEXPR", pVfetchexpr);
			cmd.addParameter("@P_INEWLINELENGTH", pInewlinelength);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
