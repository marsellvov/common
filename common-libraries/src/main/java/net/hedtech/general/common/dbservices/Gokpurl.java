package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokpurl {
		public static void pPaymentCancelReturn(NString transactionid,NString transactionamount,NString transactiondescription,NString merchantid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPURL.P_PAYMENT_CANCEL_RETURN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSACTIONID", transactionid);
			cmd.addParameter("@TRANSACTIONAMOUNT", transactionamount);
			cmd.addParameter("@TRANSACTIONDESCRIPTION", transactiondescription);
			cmd.addParameter("@MERCHANTID", merchantid);
				
			cmd.execute();


		}
		
		public static void pPaymentFailureReturn(NString transactionid,NString transactionamount,NString transactiondescription,NString merchantid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPURL.P_PAYMENT_FAILURE_RETURN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSACTIONID", transactionid);
			cmd.addParameter("@TRANSACTIONAMOUNT", transactionamount);
			cmd.addParameter("@TRANSACTIONDESCRIPTION", transactiondescription);
			cmd.addParameter("@MERCHANTID", merchantid);
				
			cmd.execute();


		}
		
		public static void pPaymentSuccessReturn(NString transactionid,NString transactionamount,NString transactiondescription,NString merchantid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPURL.P_PAYMENT_SUCCESS_RETURN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSACTIONID", transactionid);
			cmd.addParameter("@TRANSACTIONAMOUNT", transactionamount);
			cmd.addParameter("@TRANSACTIONDESCRIPTION", transactiondescription);
			cmd.addParameter("@MERCHANTID", merchantid);
				
			cmd.execute();


		}
		
	
	
	
}
