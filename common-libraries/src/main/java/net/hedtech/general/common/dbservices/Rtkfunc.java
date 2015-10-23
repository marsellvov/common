package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rtkfunc {
		public static void pGetRtvtreqRow(NString treqCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RTKFUNC.P_GET_RTVTREQ_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TREQ_CODE_IN", treqCodeIn);
				
			cmd.execute();


		}
		
		public static void pGetRtvtrstRow(NString trstCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RTKFUNC.P_GET_RTVTRST_ROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRST_CODE_IN", trstCodeIn);
				
			cmd.execute();


		}
		
	
	
	
}
