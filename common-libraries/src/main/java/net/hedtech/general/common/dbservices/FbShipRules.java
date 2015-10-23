package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbShipRules {
		public static void pPublishSynch(NString pOperationType,NString pCode,NDate pEffDate,NDate pNchgDate,NString pAddrLine1,NString pAddrLine2,NString pBuilding,NString pFloor,NString pCity,NString pState,NString pZipCode,NString pContact,NString pPhoneArea,NString pPhoneNum,NString pPhoneExt,NString pAddrLine3,NString pNatnCode,NDate pTermDate,NString pRouteCode,NNumber pDeliveryPoint,NNumber pCorrectionDigit,NString pCarrierRoute,NString pCtryCodePhone,NString pHouseNumber,NString pAddrLine4,Ref<NString> pMessageExists) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_SHIP_RULES.P_PUBLISH_SYNCH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_NCHG_DATE", pNchgDate);
			cmd.addParameter("@P_ADDR_LINE1", pAddrLine1);
			cmd.addParameter("@P_ADDR_LINE2", pAddrLine2);
			cmd.addParameter("@P_BUILDING", pBuilding);
			cmd.addParameter("@P_FLOOR", pFloor);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STATE", pState);
			cmd.addParameter("@P_ZIP_CODE", pZipCode);
			cmd.addParameter("@P_CONTACT", pContact);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUM", pPhoneNum);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_ADDR_LINE3", pAddrLine3);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
			cmd.addParameter("@P_ROUTE_CODE", pRouteCode);
			cmd.addParameter("@P_DELIVERY_POINT", pDeliveryPoint);
			cmd.addParameter("@P_CORRECTION_DIGIT", pCorrectionDigit);
			cmd.addParameter("@P_CARRIER_ROUTE", pCarrierRoute);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_ADDR_LINE4", pAddrLine4);
			cmd.addParameter("@P_MESSAGE_EXISTS", NString.class);
				
			cmd.execute();
			pMessageExists.val = cmd.getParameterValue("@P_MESSAGE_EXISTS", NString.class);


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pCode,NDate pEffDate,NDate pNchgDate,NString pAddrLine1,NString pAddrLine2,NString pAddrLine3,NString pBuilding,NString pFloor,NString pCity,NString pState,NString pZipCode,NString pContact,NString pPhoneArea,NString pPhoneNum,NString pPhoneExt,NString pNatnCode,NDate pTermDate,NString pCoasCode,NString pOrgnCode,NString pRouteCode,NString pTgrpCode,NString pFundCodeInvtry,NString pAcctCodeInvtry,NString pOrgnCodeWare,NString pProfitCenterInd,NString pLocnTypeCode,NNumber pDeliveryPoint,NNumber pCorrectionDigit,NString pCarrierRoute,NString pProgCodeWare,NString pUserId,NDate pActivtyDate,NString pCtryCodePhone,NString pHouseNumber,NString pAddrLine4) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_SHIP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_NCHG_DATE", pNchgDate);
			cmd.addParameter("@P_ADDR_LINE1", pAddrLine1);
			cmd.addParameter("@P_ADDR_LINE2", pAddrLine2);
			cmd.addParameter("@P_ADDR_LINE3", pAddrLine3);
			cmd.addParameter("@P_BUILDING", pBuilding);
			cmd.addParameter("@P_FLOOR", pFloor);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STATE", pState);
			cmd.addParameter("@P_ZIP_CODE", pZipCode);
			cmd.addParameter("@P_CONTACT", pContact);
			cmd.addParameter("@P_PHONE_AREA", pPhoneArea);
			cmd.addParameter("@P_PHONE_NUM", pPhoneNum);
			cmd.addParameter("@P_PHONE_EXT", pPhoneExt);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ROUTE_CODE", pRouteCode);
			cmd.addParameter("@P_TGRP_CODE", pTgrpCode);
			cmd.addParameter("@P_FUND_CODE_INVTRY", pFundCodeInvtry);
			cmd.addParameter("@P_ACCT_CODE_INVTRY", pAcctCodeInvtry);
			cmd.addParameter("@P_ORGN_CODE_WARE", pOrgnCodeWare);
			cmd.addParameter("@P_PROFIT_CENTER_IND", pProfitCenterInd);
			cmd.addParameter("@P_LOCN_TYPE_CODE", pLocnTypeCode);
			cmd.addParameter("@P_DELIVERY_POINT", pDeliveryPoint);
			cmd.addParameter("@P_CORRECTION_DIGIT", pCorrectionDigit);
			cmd.addParameter("@P_CARRIER_ROUTE", pCarrierRoute);
			cmd.addParameter("@P_PROG_CODE_WARE", pProgCodeWare);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ACTIVTY_DATE", pActivtyDate);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_ADDR_LINE4", pAddrLine4);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pNatnCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_SHIP_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
				
			cmd.execute();


		}
		
	
	
	
}
