package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskapmt {
		public static NString fUpdateAccounts(NNumber transactionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAPMT.F_UPDATE_ACCOUNTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TRANSACTION_ID", transactionId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCcpaymentverification(NString amountIn,NString submitButton,NString oapfhounumb,NString oapfaddr1,NString oapfaddr2,NString oapfaddr3,NString oapfaddr4,NString oapfcity,NString oapfstate,NString oapfpostalcode,NString oapfcntry,NString retreiveAddr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAPMT.P_CCPAYMENTVERIFICATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AMOUNT_IN", amountIn);
			cmd.addParameter("@SUBMIT_BUTTON", submitButton);
			cmd.addParameter("@OAPFHOUNUMB", oapfhounumb);
			cmd.addParameter("@OAPFADDR1", oapfaddr1);
			cmd.addParameter("@OAPFADDR2", oapfaddr2);
			cmd.addParameter("@OAPFADDR3", oapfaddr3);
			cmd.addParameter("@OAPFADDR4", oapfaddr4);
			cmd.addParameter("@OAPFCITY", oapfcity);
			cmd.addParameter("@OAPFSTATE", oapfstate);
			cmd.addParameter("@OAPFPOSTALCODE", oapfpostalcode);
			cmd.addParameter("@OAPFCNTRY", oapfcntry);
			cmd.addParameter("@RETREIVE_ADDR", retreiveAddr);
				
			cmd.execute();


		}
		
		public static void pDelTwgrwprmCcValues() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAPMT.P_DEL_TWGRWPRM_CC_VALUES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetSubCode(NNumber aidmIn,NNumber appnoIn,NString termIn,Ref<NString> subCodeInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAPMT.P_GET_SUB_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM_IN", aidmIn);
			cmd.addParameter("@APPNO_IN", appnoIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@SUB_CODE_IN_OUT", subCodeInOut, true);
				
			cmd.execute();
			subCodeInOut.val = cmd.getParameterValue("@SUB_CODE_IN_OUT", NString.class);


		}
		
		public static void pOnError(NNumber aidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAPMT.P_ON_ERROR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@AIDM", aidm);
				
			cmd.execute();


		}
		
		public static void pProcesspayment(NString msg,NString amountIn,NString houseNumberIn,NString address1In,NString address2In,NString address3In,NString address4In,NString cityIn,NString stateIn,NString zipIn,NString natnIn,NString applData,NString retrieveAddrIn,NString ccUseAddrIn,NString subCodeIn,NString fixedAmtIn,NString waivCodeIn,NNumber pidmIn,NNumber appnoIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAPMT.P_PROCESSPAYMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MSG", msg);
			cmd.addParameter("@AMOUNT_IN", amountIn);
			cmd.addParameter("@HOUSE_NUMBER_IN", houseNumberIn);
			cmd.addParameter("@ADDRESS1_IN", address1In);
			cmd.addParameter("@ADDRESS2_IN", address2In);
			cmd.addParameter("@ADDRESS3_IN", address3In);
			cmd.addParameter("@ADDRESS4_IN", address4In);
			cmd.addParameter("@CITY_IN", cityIn);
			cmd.addParameter("@STATE_IN", stateIn);
			cmd.addParameter("@ZIP_IN", zipIn);
			cmd.addParameter("@NATN_IN", natnIn);
			cmd.addParameter("@APPL_DATA", applData);
			cmd.addParameter("@RETRIEVE_ADDR_IN", retrieveAddrIn);
			cmd.addParameter("@CC_USE_ADDR_IN", ccUseAddrIn);
			cmd.addParameter("@SUB_CODE_IN", subCodeIn);
			cmd.addParameter("@FIXED_AMT_IN", fixedAmtIn);
			cmd.addParameter("@WAIV_CODE_IN", waivCodeIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@APPNO_IN", appnoIn);
				
			cmd.execute();


		}
		
		public static void pProcesswaiver(NString waivCodeIn,NNumber appnoIn,NString submitButton) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAPMT.P_PROCESSWAIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WAIV_CODE_IN", waivCodeIn);
			cmd.addParameter("@APPNO_IN", appnoIn);
			cmd.addParameter("@SUBMIT_BUTTON", submitButton);
				
			cmd.execute();


		}
		
		public static void pSelectwaiver(NNumber appnoIn,NString waivCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKAPMT.P_SELECTWAIVER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@APPNO_IN", appnoIn);
			cmd.addParameter("@WAIV_CODE_IN", waivCodeIn);
				
			cmd.execute();


		}
		
	
	
	
}
