package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwakgift {
		public static void pDonationReceipt(NString transIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKGIFT.P_DONATION_RECEIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_ID_IN", transIdIn);
				
			cmd.execute();


		}
		
		public static void pMakeADonation(NString campDesg1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKGIFT.P_MAKE_A_DONATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CAMP_DESG1", campDesg1);
				
			cmd.execute();


		}
		
		public static void pPledgePayment(NNumber pidm,NString campDesg1,NString payInd,NString status,NString pledgeNoIn,NString amount,NString amount1) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKGIFT.P_PLEDGE_PAYMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@CAMP_DESG1", campDesg1);
			cmd.addParameter("@PAY_IND", payInd);
			cmd.addParameter("@STATUS", status);
			cmd.addParameter("@PLEDGE_NO_IN", pledgeNoIn);
			cmd.addParameter("@AMOUNT", amount);
			cmd.addParameter("@AMOUNT1", amount1);
				
			cmd.execute();


		}
		
	
	
	
}
