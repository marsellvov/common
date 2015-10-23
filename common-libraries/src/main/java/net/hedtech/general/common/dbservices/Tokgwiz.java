package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Tokgwiz {
		public static NNumber fAmountDuePerRow(NNumber pidm,NNumber tranNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKGWIZ.F_AMOUNT_DUE_PER_ROW", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@TRAN_NUMBER", tranNumber);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fBillAgingTbraccd(NNumber daysDiff,NDate billDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKGWIZ.F_BILL_AGING_TBRACCD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DAYS_DIFF", daysDiff);
			cmd.addParameter("@BILL_DATE", billDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEffAgingTbraccd(NNumber daysDiff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TOKGWIZ.F_EFF_AGING_TBRACCD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DAYS_DIFF", daysDiff);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
	
	
	
}
