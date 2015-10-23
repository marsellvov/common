package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwskwccp {
		public static NString fGetShbgappValues(NNumber pidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWCCP.F_GET_SHBGAPP_VALUES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PIDM", pidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fParse(NNumber pos,NString str) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWCCP.F_PARSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@POS", pos);
			cmd.addParameter("@STR", str);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fUpdateAccounts(NNumber transactionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWCCP.F_UPDATE_ACCOUNTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TRANSACTION_ID", transactionId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pDelTwgrwprmCcVal() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWCCP.P_DEL_TWGRWPRM_CC_VAL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pGetSubCode1(Ref<NString> subCodeInOut,NString useMainTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWCCP.P_GET_SUB_CODE_1", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUB_CODE_IN_OUT", subCodeInOut, true);
			cmd.addParameter("@USE_MAIN_TERM_IN", useMainTermIn);
				
			cmd.execute();
			subCodeInOut.val = cmd.getParameterValue("@SUB_CODE_IN_OUT", NString.class);


		}
		
		public static void pInsertShbgapp(NString pCurrSelect,NString transAppData) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWCCP.P_INSERT_SHBGAPP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURR_SELECT", pCurrSelect);
			cmd.addParameter("@TRANS_APP_DATA", transAppData);
				
			cmd.execute();


		}
		
		public static void pInsertTbraccd(NNumber accdPidm,NNumber accdAmt,NString authCode,Ref<NString> msg,Ref<NString> cardDesc,NString subCode,NString cardType,NString detl,Ref<NNumber> tranNum,Ref<NDate> insertDate,NString sysiCode,NString procCode,NString termIn,Ref<NNumber> rcptInOut,NNumber tranNumPaidIn,NString cashierIdIn,NString cardDescIn,NString payDetailIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWCCP.P_INSERT_TBRACCD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ACCD_PIDM", accdPidm);
			cmd.addParameter("@ACCD_AMT", accdAmt);
			cmd.addParameter("@AUTH_CODE", authCode);
			cmd.addParameter("@MSG", msg, true);
			cmd.addParameter("@CARD_DESC", cardDesc, true);
			cmd.addParameter("@SUB_CODE", subCode);
			cmd.addParameter("@CARD_TYPE", cardType);
			cmd.addParameter("@DETL", detl);
			cmd.addParameter("@TRAN_NUM", tranNum, true);
			cmd.addParameter("@INSERT_DATE", insertDate, true);
			cmd.addParameter("@SYSI_CODE", sysiCode);
			cmd.addParameter("@PROC_CODE", procCode);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@RCPT_IN_OUT", rcptInOut, true);
			cmd.addParameter("@TRAN_NUM_PAID_IN", tranNumPaidIn);
			cmd.addParameter("@CASHIER_ID_IN", cashierIdIn);
			cmd.addParameter("@CARD_DESC_IN", cardDescIn);
			cmd.addParameter("@PAY_DETAIL_IN", payDetailIn);
				
			cmd.execute();
			msg.val = cmd.getParameterValue("@MSG", NString.class);
			cardDesc.val = cmd.getParameterValue("@CARD_DESC", NString.class);
			tranNum.val = cmd.getParameterValue("@TRAN_NUM", NNumber.class);
			insertDate.val = cmd.getParameterValue("@INSERT_DATE", NDate.class);
			rcptInOut.val = cmd.getParameterValue("@RCPT_IN_OUT", NNumber.class);


		}
		
		public static void pInsertTbrmisd(NNumber pidmIn,NNumber accdAmtIn,NString idNumberIn,Ref<NString> cardDescIn,NString payDetailIn,NString chargeDetailIn,NString cashierIdIn,NString oapfstoreidIn,NString oapfcustnameIn,NString oapfhnumbIn,NString oapfaddr1In,NString oapfaddr2In,NString oapfaddr3In,NString oapfaddr4In,NString oapfcityIn,NString oapfstateIn,NString oapfpostalcodeIn,NString oapfcntryIn,Ref<NNumber> rcptInOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWCCP.P_INSERT_TBRMISD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@ACCD_AMT_IN", accdAmtIn);
			cmd.addParameter("@ID_NUMBER_IN", idNumberIn);
			cmd.addParameter("@CARD_DESC_IN", cardDescIn, true);
			cmd.addParameter("@PAY_DETAIL_IN", payDetailIn);
			cmd.addParameter("@CHARGE_DETAIL_IN", chargeDetailIn);
			cmd.addParameter("@CASHIER_ID_IN", cashierIdIn);
			cmd.addParameter("@OAPFSTOREID_IN", oapfstoreidIn);
			cmd.addParameter("@OAPFCUSTNAME_IN", oapfcustnameIn);
			cmd.addParameter("@OAPFHNUMB_IN", oapfhnumbIn);
			cmd.addParameter("@OAPFADDR1_IN", oapfaddr1In);
			cmd.addParameter("@OAPFADDR2_IN", oapfaddr2In);
			cmd.addParameter("@OAPFADDR3_IN", oapfaddr3In);
			cmd.addParameter("@OAPFADDR4_IN", oapfaddr4In);
			cmd.addParameter("@OAPFCITY_IN", oapfcityIn);
			cmd.addParameter("@OAPFSTATE_IN", oapfstateIn);
			cmd.addParameter("@OAPFPOSTALCODE_IN", oapfpostalcodeIn);
			cmd.addParameter("@OAPFCNTRY_IN", oapfcntryIn);
			cmd.addParameter("@RCPT_IN_OUT", rcptInOut, true);
				
			cmd.execute();
			cardDescIn.val = cmd.getParameterValue("@CARD_DESC_IN", NString.class);
			rcptInOut.val = cmd.getParameterValue("@RCPT_IN_OUT", NNumber.class);


		}
		
		public static void pProcessPayment(NString calledByProcIn,NString termSelectIn,NString amountIn,NString firstNameIn,NString lastNameIn,NString middleNameIn,NString surnamePrefixIn,NString namePrefixIn,NString nameSuffixIn,NString houseNumberIn,NString address1In,NString address2In,NString address3In,NString address4In,NNumber applNoIn,NString cityIn,NString stateIn,NString zipIn,NString natnIn,NString retrieveAddrIn,NString ccUseAddrIn,NString subCodeIn,NString fixedAmtIn,NString termIn,NString msg) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWSKWCCP.P_PROCESS_PAYMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CALLED_BY_PROC_IN", calledByProcIn);
			cmd.addParameter("@TERM_SELECT_IN", termSelectIn);
			cmd.addParameter("@AMOUNT_IN", amountIn);
			cmd.addParameter("@FIRST_NAME_IN", firstNameIn);
			cmd.addParameter("@LAST_NAME_IN", lastNameIn);
			cmd.addParameter("@MIDDLE_NAME_IN", middleNameIn);
			cmd.addParameter("@SURNAME_PREFIX_IN", surnamePrefixIn);
			cmd.addParameter("@NAME_PREFIX_IN", namePrefixIn);
			cmd.addParameter("@NAME_SUFFIX_IN", nameSuffixIn);
			cmd.addParameter("@HOUSE_NUMBER_IN", houseNumberIn);
			cmd.addParameter("@ADDRESS1_IN", address1In);
			cmd.addParameter("@ADDRESS2_IN", address2In);
			cmd.addParameter("@ADDRESS3_IN", address3In);
			cmd.addParameter("@ADDRESS4_IN", address4In);
			cmd.addParameter("@APPL_NO_IN", applNoIn);
			cmd.addParameter("@CITY_IN", cityIn);
			cmd.addParameter("@STATE_IN", stateIn);
			cmd.addParameter("@ZIP_IN", zipIn);
			cmd.addParameter("@NATN_IN", natnIn);
			cmd.addParameter("@RETRIEVE_ADDR_IN", retrieveAddrIn);
			cmd.addParameter("@CC_USE_ADDR_IN", ccUseAddrIn);
			cmd.addParameter("@SUB_CODE_IN", subCodeIn);
			cmd.addParameter("@FIXED_AMT_IN", fixedAmtIn);
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@MSG", msg);
				
			cmd.execute();


		}
		
	
	
	
}
