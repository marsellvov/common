package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwakcpmt {
		public static void pCcpaymentstatus(NString transIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKCPMT.P_CCPAYMENTSTATUS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANS_ID_IN", transIdIn);
				
			cmd.execute();


		}
		
		public static void pCcpaymentverification(NString oapfstoreid,NString oapfprice,NString crdCard,NString submitButton,NString campDesg1,NString commentText,NString pledgeNo,NString splitInd,NString amountIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKCPMT.P_CCPAYMENTVERIFICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@OAPFSTOREID", oapfstoreid);
			cmd.addParameter("@OAPFPRICE", oapfprice);
			cmd.addParameter("@CRD_CARD", crdCard);
			cmd.addParameter("@SUBMIT_BUTTON", submitButton);
			cmd.addParameter("@CAMP_DESG1", campDesg1);
			cmd.addParameter("@COMMENT_TEXT", commentText);
			cmd.addParameter("@PLEDGE_NO", pledgeNo);
			cmd.addParameter("@SPLIT_IND", splitInd);
			cmd.addParameter("@AMOUNT_IN", amountIn);
				
			cmd.execute();


		}
		
		public static void pCreditcardpayment(NString msg,NString amountIn,NString campDesg1,NString commentText,NString pledgeNo,NString splitInd,NString subCodeIn,NString fixedAmtIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWAKCPMT.P_CREDITCARDPAYMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG", msg);
			cmd.addParameter("@AMOUNT_IN", amountIn);
			cmd.addParameter("@CAMP_DESG1", campDesg1);
			cmd.addParameter("@COMMENT_TEXT", commentText);
			cmd.addParameter("@PLEDGE_NO", pledgeNo);
			cmd.addParameter("@SPLIT_IND", splitInd);
			cmd.addParameter("@SUB_CODE_IN", subCodeIn);
			cmd.addParameter("@FIXED_AMT_IN", fixedAmtIn);
				
			cmd.execute();


		}
		
	
	
	
}
