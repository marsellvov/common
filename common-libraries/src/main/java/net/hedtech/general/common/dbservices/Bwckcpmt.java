package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwckcpmt {
		public static NString fCheckHolds() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCPMT.F_CHECK_HOLDS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fUpdateAccounts(NNumber transactionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCPMT.F_UPDATE_ACCOUNTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TRANSACTION_ID", transactionId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCcpayment() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCPMT.P_CCPAYMENT", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pCcpaymenttermselected(NString termIn,NString amountIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCPMT.P_CCPAYMENTTERMSELECTED", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TERM_IN", termIn);
			cmd.addParameter("@AMOUNT_IN", amountIn);
				
			cmd.execute();


		}
		
		public static void pDelTwgrwprmCcValues() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCPMT.P_DEL_TWGRWPRM_CC_VALUES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDispsigpageCc(NString transactionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCPMT.P_DISPSIGPAGE_CC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TRANSACTION_ID", transactionId);
				
			cmd.execute();


		}
		
		public static void pGetSubCode(Ref<NString> subCodeInOut,NString useMainTermIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCPMT.P_GET_SUB_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUB_CODE_IN_OUT", subCodeInOut, true);
			cmd.addParameter("@USE_MAIN_TERM_IN", useMainTermIn);
				
			cmd.execute();
			subCodeInOut.val = cmd.getParameterValue("@SUB_CODE_IN_OUT", NString.class);


		}
		
		public static void pProcessPayment(NString calledByProcIn,NString termSelectIn,NString amountIn,NString firstNameIn,NString lastNameIn,NString middleNameIn,NString surnamePrefixIn,NString namePrefixIn,NString nameSuffixIn,NString houseNumberIn,NString address1In,NString address2In,NString address3In,NString address4In,NNumber applNoIn,NString cityIn,NString stateIn,NString zipIn,NString natnIn,NString retrieveAddrIn,NString ccUseAddrIn,NString subCodeIn,NString fixedAmtIn,NString termIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWCKCPMT.P_PROCESS_PAYMENT", DbManager.getDataBaseFactory());
			
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
				
			cmd.execute();


		}
		
	
	
	
}
