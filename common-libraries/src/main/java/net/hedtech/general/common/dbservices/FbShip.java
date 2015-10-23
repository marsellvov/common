package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class FbShip {
		public static NString fCurrentVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_SHIP.F_CURRENT_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NBool fExists(NString pCode,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_SHIP.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NBool fExistsActive(NString pCode,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_SHIP.F_EXISTS_ACTIVE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static DataCursor fQueryAll(NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_SHIP.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pCode,NDate pEffDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_SHIP.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pCode,NDate pEffDate,NDate pActivityDate,NString pUserId,NDate pNchgDate,NDate pTermDate,NString pAddrLine1,NString pAddrLine2,NString pBuilding,NString pFloor,NString pCity,NString pState,NString pZipCode,NString pContact,NString pPhoneArea,NString pPhoneNum,NString pPhoneExt,NString pCoasCode,NString pOrgnCode,NString pRouteCode,NString pTgrpCode,NString pFundCodeInvtry,NString pAcctCodeInvtry,NString pOrgnCodeWare,NString pProfitCenterInd,NString pLocnTypeCode,NNumber pDeliveryPoint,NNumber pCorrectionDigit,NString pCarrierRoute,NString pProgCodeWare,NString pAddrLine3,NString pNatnCode,NString pCtryCodePhone,NString pHouseNumber,NString pAddrLine4,Ref<NString> pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_SHIP.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_NCHG_DATE", pNchgDate);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
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
			cmd.addParameter("@P_ADDR_LINE3", pAddrLine3);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_ADDR_LINE4", pAddrLine4);
			cmd.addParameter("@P_ROWID", NString.class);
				
			cmd.execute();
			pRowid.val = cmd.getParameterValue("@P_ROWID", NString.class);


		}
		
		public static void pDelete(NString pCode,NDate pEffDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_SHIP.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pCode,NDate pEffDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_SHIP.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdate(NString pCode,NDate pEffDate,NDate pActivityDate,NString pUserId,NDate pNchgDate,NDate pTermDate,NString pAddrLine1,NString pAddrLine2,NString pBuilding,NString pFloor,NString pCity,NString pState,NString pZipCode,NString pContact,NString pPhoneArea,NString pPhoneNum,NString pPhoneExt,NString pCoasCode,NString pOrgnCode,NString pRouteCode,NString pTgrpCode,NString pFundCodeInvtry,NString pAcctCodeInvtry,NString pOrgnCodeWare,NString pProfitCenterInd,NString pLocnTypeCode,NNumber pDeliveryPoint,NNumber pCorrectionDigit,NString pCarrierRoute,NString pProgCodeWare,NString pAddrLine3,NString pNatnCode,NString pCtryCodePhone,NString pHouseNumber,NString pAddrLine4,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FB_SHIP.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CODE", pCode);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_ACTIVITY_DATE", pActivityDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_NCHG_DATE", pNchgDate);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
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
			cmd.addParameter("@P_ADDR_LINE3", pAddrLine3);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_CTRY_CODE_PHONE", pCtryCodePhone);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_ADDR_LINE4", pAddrLine4);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ShipRecRow", dataSourceName="SHIP_REC")
	public static class ShipRecRow
	{
		@DbRecordField(dataSourceName="CODE")
		public NString Code;
		@DbRecordField(dataSourceName="EFF_DATE")
		public NDate EffDate;
		@DbRecordField(dataSourceName="ACTIVITY_DATE")
		public NDate ActivityDate;
		@DbRecordField(dataSourceName="USER_ID")
		public NString UserId;
		@DbRecordField(dataSourceName="NCHG_DATE")
		public NDate NchgDate;
		@DbRecordField(dataSourceName="TERM_DATE")
		public NDate TermDate;
		@DbRecordField(dataSourceName="ADDR_LINE1")
		public NString AddrLine1;
		@DbRecordField(dataSourceName="ADDR_LINE2")
		public NString AddrLine2;
		@DbRecordField(dataSourceName="BUILDING")
		public NString Building;
		@DbRecordField(dataSourceName="FLOOR")
		public NString Floor;
		@DbRecordField(dataSourceName="CITY")
		public NString City;
		@DbRecordField(dataSourceName="STATE")
		public NString State;
		@DbRecordField(dataSourceName="ZIP_CODE")
		public NString ZipCode;
		@DbRecordField(dataSourceName="CONTACT")
		public NString Contact;
		@DbRecordField(dataSourceName="PHONE_AREA")
		public NString PhoneArea;
		@DbRecordField(dataSourceName="PHONE_NUM")
		public NString PhoneNum;
		@DbRecordField(dataSourceName="PHONE_EXT")
		public NString PhoneExt;
		@DbRecordField(dataSourceName="COAS_CODE")
		public NString CoasCode;
		@DbRecordField(dataSourceName="ORGN_CODE")
		public NString OrgnCode;
		@DbRecordField(dataSourceName="ROUTE_CODE")
		public NString RouteCode;
		@DbRecordField(dataSourceName="TGRP_CODE")
		public NString TgrpCode;
		@DbRecordField(dataSourceName="FUND_CODE_INVTRY")
		public NString FundCodeInvtry;
		@DbRecordField(dataSourceName="ACCT_CODE_INVTRY")
		public NString AcctCodeInvtry;
		@DbRecordField(dataSourceName="ORGN_CODE_WARE")
		public NString OrgnCodeWare;
		@DbRecordField(dataSourceName="PROFIT_CENTER_IND")
		public NString ProfitCenterInd;
		@DbRecordField(dataSourceName="LOCN_TYPE_CODE")
		public NString LocnTypeCode;
		@DbRecordField(dataSourceName="DELIVERY_POINT")
		public NNumber DeliveryPoint;
		@DbRecordField(dataSourceName="CORRECTION_DIGIT")
		public NNumber CorrectionDigit;
		@DbRecordField(dataSourceName="CARRIER_ROUTE")
		public NString CarrierRoute;
		@DbRecordField(dataSourceName="PROG_CODE_WARE")
		public NString ProgCodeWare;
		@DbRecordField(dataSourceName="ADDR_LINE3")
		public NString AddrLine3;
		@DbRecordField(dataSourceName="NATN_CODE")
		public NString NatnCode;
		@DbRecordField(dataSourceName="CTRY_CODE_PHONE")
		public NString CtryCodePhone;
		@DbRecordField(dataSourceName="HOUSE_NUMBER")
		public NString HouseNumber;
		@DbRecordField(dataSourceName="ADDR_LINE4")
		public NString AddrLine4;
		@DbRecordField(dataSourceName="INTERNAL_RECORD_ID")
		public NString InternalRecordId;
	}

	
	
}
