package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fpkrqtc {
		public static NNumber fCalcReqAcctgTotal(NString reqNum,NNumber itemNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKRQTC.F_CALC_REQ_ACCTG_TOTAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@REQ_NUM", reqNum);
			cmd.addParameter("@ITEM_NUM", itemNum);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcReqCommTotal(NString reqNum,NNumber itemNum) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FPKRQTC.F_CALC_REQ_COMM_TOTAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@REQ_NUM", reqNum);
			cmd.addParameter("@ITEM_NUM", itemNum);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
	
	
	
}
