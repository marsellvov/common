package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwakngft {
		public static void pCcpaymentstatus(NString transIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKNGFT.P_CCPAYMENTSTATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_ID_IN", transIdIn);
				
			cmd.execute();


		}
		
		public static void pCcpaymentverification(NString oapfprice,NString submitButton,NString campDesg1,NString commentText,NString pledgeNo,NString amountIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKNGFT.P_CCPAYMENTVERIFICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OAPFPRICE", oapfprice);
			cmd.addParameter("@SUBMIT_BUTTON", submitButton);
			cmd.addParameter("@CAMP_DESG1", campDesg1);
			cmd.addParameter("@COMMENT_TEXT", commentText);
			cmd.addParameter("@PLEDGE_NO", pledgeNo);
			cmd.addParameter("@AMOUNT_IN", amountIn);
				
			cmd.execute();


		}
		
		public static void pDonationReceipt(NString transIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKNGFT.P_DONATION_RECEIPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_ID_IN", transIdIn);
				
			cmd.execute();


		}
		
		public static void pMakeADonation(NString msg,NString amountIn,NString retrieveAddrIn,NString ccUseAddrIn,NString campDesg1,NString commentText,NString pledgeNo,NString subCodeIn,NString fixedAmtIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKNGFT.P_MAKE_A_DONATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG", msg);
			cmd.addParameter("@AMOUNT_IN", amountIn);
			cmd.addParameter("@RETRIEVE_ADDR_IN", retrieveAddrIn);
			cmd.addParameter("@CC_USE_ADDR_IN", ccUseAddrIn);
			cmd.addParameter("@CAMP_DESG1", campDesg1);
			cmd.addParameter("@COMMENT_TEXT", commentText);
			cmd.addParameter("@PLEDGE_NO", pledgeNo);
			cmd.addParameter("@SUB_CODE_IN", subCodeIn);
			cmd.addParameter("@FIXED_AMT_IN", fixedAmtIn);
				
			cmd.execute();


		}
		
	
	
	
}
