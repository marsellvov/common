package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokpven {
//		public static NString fAddTransaction( pXt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPVEN.F_ADD_TRANSACTION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@P_XT", pXt);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static  fAddTransaction( pRequestOot) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPVEN.F_ADD_TRANSACTION", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@P_REQUEST_OOT", pRequestOot);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static NString fCollectPaymentInfo(NNumber amountIn,NString houseNumberIn,NString address1In,NString address2In,NString address3In,NString address4In,NString cityIn,NString stateIn,NString zipIn,NString natnIn,NString retrieveAddrIn,NString ccUseAddrIn,NString subCodeIn,NNumber pidmIn,NNumber aidmIn,NString termCodeIn,NString idIn,NString procCodeIn,NString sysiCodeIn,NString userExtraDataIn,NString updateFunctionIn,NString successUrlIn,NString failureUrlIn,NNumber payTransIn,NNumber applNoIn,NString giftNoIn,NString firstNameIn,NString lastNameIn,NString middleNameIn,NString surnamePrefixIn,NString namePrefixIn,NString nameSuffixIn,NString inbIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPVEN.F_COLLECT_PAYMENT_INFO", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
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
			cmd.addParameter("@RETRIEVE_ADDR_IN", retrieveAddrIn);
			cmd.addParameter("@CC_USE_ADDR_IN", ccUseAddrIn);
			cmd.addParameter("@SUB_CODE_IN", subCodeIn);
			cmd.addParameter("@PIDM_IN", pidmIn);
			cmd.addParameter("@AIDM_IN", aidmIn);
			cmd.addParameter("@TERM_CODE_IN", termCodeIn);
			cmd.addParameter("@ID_IN", idIn);
			cmd.addParameter("@PROC_CODE_IN", procCodeIn);
			cmd.addParameter("@SYSI_CODE_IN", sysiCodeIn);
			cmd.addParameter("@USER_EXTRA_DATA_IN", userExtraDataIn);
			cmd.addParameter("@UPDATE_FUNCTION_IN", updateFunctionIn);
			cmd.addParameter("@SUCCESS_URL_IN", successUrlIn);
			cmd.addParameter("@FAILURE_URL_IN", failureUrlIn);
			cmd.addParameter("@PAY_TRANS_IN", payTransIn);
			cmd.addParameter("@APPL_NO_IN", applNoIn);
			cmd.addParameter("@GIFT_NO_IN", giftNoIn);
			cmd.addParameter("@FIRST_NAME_IN", firstNameIn);
			cmd.addParameter("@LAST_NAME_IN", lastNameIn);
			cmd.addParameter("@MIDDLE_NAME_IN", middleNameIn);
			cmd.addParameter("@SURNAME_PREFIX_IN", surnamePrefixIn);
			cmd.addParameter("@NAME_PREFIX_IN", namePrefixIn);
			cmd.addParameter("@NAME_SUFFIX_IN", nameSuffixIn);
			cmd.addParameter("@INB_IN", inbIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fGetBfrCancellationText() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPVEN.F_GET_BFR_CANCELLATION_TEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
//		public static NString fVendorFailure( pXt) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPVEN.F_VENDOR_FAILURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@P_XT", pXt);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static  fVendorFailure( pRequestOot) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPVEN.F_VENDOR_FAILURE", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(.class);
//			cmd.addParameter("@P_REQUEST_OOT", pRequestOot);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(.class);
//
//		}
		
		public static void pBfrCancellation(Ref<DataCursor> flexRegStatusC,NString bannerTransInNorm,NString bannerCartId,NString flexApplData) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPVEN.P_BFR_CANCELLATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@FLEX_REG_STATUS_C", DataCursor.class);
			cmd.addParameter("@BANNER_TRANS_IN_NORM", bannerTransInNorm);
			cmd.addParameter("@BANNER_CART_ID", bannerCartId);
			cmd.addParameter("@FLEX_APPL_DATA", flexApplData);
				
			cmd.execute();
			flexRegStatusC.val = cmd.getParameterValue("@FLEX_REG_STATUS_C", DataCursor.class);


		}
		
		public static void pPaymentUrlReturn(NString bannerTransIn,NString vendorStatusCodeIn,NString vendorErrorMsgIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKPVEN.P_PAYMENT_URL_RETURN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BANNER_TRANS_IN", bannerTransIn);
			cmd.addParameter("@VENDOR_STATUS_CODE_IN", vendorStatusCodeIn);
			cmd.addParameter("@VENDOR_ERROR_MSG_IN", vendorErrorMsgIn);
				
			cmd.execute();


		}
		
	
	
	
}
