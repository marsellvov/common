package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwpkomsg {
		public static void pDispupdateconfirm(NString inInfoProcedure,NString inUrl,NString inLink) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWPKOMSG.P_DISPUPDATECONFIRM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IN_INFO_PROCEDURE", inInfoProcedure);
			cmd.addParameter("@IN_URL", inUrl);
			cmd.addParameter("@IN_LINK", inLink);
				
			cmd.execute();


		}
		
	
	
	
}
