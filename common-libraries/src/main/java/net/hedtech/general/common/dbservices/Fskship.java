package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fskship {
		public static void pEditShipCode(NString effdateEffDateTime,NString shipCode,Ref<NString> mess,Ref<NString> vFtvshipContact,Ref<NString> vFtvshipFloor,Ref<NString> vFtvshipHouseNumber,Ref<NString> vFtvshipAddrLine1,Ref<NString> vFtvshipAddrLine2,Ref<NString> vFtvshipAddrLine3,Ref<NString> vFtvshipAddrLine4,Ref<NString> vFtvshipBuilding,Ref<NString> vFtvshipCity,Ref<NString> vFtvshipState,Ref<NString> vFtvshipZipCode,Ref<NString> vFtvshipTgrpCode,Ref<NDate> vTermDate,Ref<NString> vFtvshipFundCodeInvtry,Ref<NString> vFtvshipAcctCodeInvtry,Ref<NString> vFtvshipOrgnCodeWare,Ref<NString> vFtvshipProgCodeWare,Ref<NString> vFtvshipLocnTypeCode,Ref<NString> vFtvshipCtryCodePhone,Ref<NString> vFtvshipPhoneArea,Ref<NString> vFtvshipPhoneNum,Ref<NString> vFtvshipPhoneExt,Ref<NString> vFtvshipCoasCode,Ref<NString> vFtvshipOrgnCode,Ref<NString> vFtvshipNatnCode,Ref<NString> vFtvshipNatnDesc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FSKSHIP.P_EDIT_SHIP_CODE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@EFFDATE_EFF_DATE_TIME", effdateEffDateTime);
			cmd.addParameter("@SHIP_CODE", shipCode);
			cmd.addParameter("@MESS", NString.class);
			cmd.addParameter("@V_FTVSHIP_CONTACT", NString.class);
			cmd.addParameter("@V_FTVSHIP_FLOOR", NString.class);
			cmd.addParameter("@V_FTVSHIP_HOUSE_NUMBER", NString.class);
			cmd.addParameter("@V_FTVSHIP_ADDR_LINE1", NString.class);
			cmd.addParameter("@V_FTVSHIP_ADDR_LINE2", NString.class);
			cmd.addParameter("@V_FTVSHIP_ADDR_LINE3", NString.class);
			cmd.addParameter("@V_FTVSHIP_ADDR_LINE4", NString.class);
			cmd.addParameter("@V_FTVSHIP_BUILDING", NString.class);
			cmd.addParameter("@V_FTVSHIP_CITY", NString.class);
			cmd.addParameter("@V_FTVSHIP_STATE", NString.class);
			cmd.addParameter("@V_FTVSHIP_ZIP_CODE", NString.class);
			cmd.addParameter("@V_FTVSHIP_TGRP_CODE", NString.class);
			cmd.addParameter("@V_TERM_DATE", vTermDate, true);
			cmd.addParameter("@V_FTVSHIP_FUND_CODE_INVTRY", NString.class);
			cmd.addParameter("@V_FTVSHIP_ACCT_CODE_INVTRY", NString.class);
			cmd.addParameter("@V_FTVSHIP_ORGN_CODE_WARE", NString.class);
			cmd.addParameter("@V_FTVSHIP_PROG_CODE_WARE", NString.class);
			cmd.addParameter("@V_FTVSHIP_LOCN_TYPE_CODE", NString.class);
			cmd.addParameter("@V_FTVSHIP_CTRY_CODE_PHONE", NString.class);
			cmd.addParameter("@V_FTVSHIP_PHONE_AREA", NString.class);
			cmd.addParameter("@V_FTVSHIP_PHONE_NUM", NString.class);
			cmd.addParameter("@V_FTVSHIP_PHONE_EXT", NString.class);
			cmd.addParameter("@V_FTVSHIP_COAS_CODE", NString.class);
			cmd.addParameter("@V_FTVSHIP_ORGN_CODE", NString.class);
			cmd.addParameter("@V_FTVSHIP_NATN_CODE", NString.class);
			cmd.addParameter("@V_FTVSHIP_NATN_DESC", NString.class);
				
			cmd.execute();
			mess.val = cmd.getParameterValue("@MESS", NString.class);
			vFtvshipContact.val = cmd.getParameterValue("@V_FTVSHIP_CONTACT", NString.class);
			vFtvshipFloor.val = cmd.getParameterValue("@V_FTVSHIP_FLOOR", NString.class);
			vFtvshipHouseNumber.val = cmd.getParameterValue("@V_FTVSHIP_HOUSE_NUMBER", NString.class);
			vFtvshipAddrLine1.val = cmd.getParameterValue("@V_FTVSHIP_ADDR_LINE1", NString.class);
			vFtvshipAddrLine2.val = cmd.getParameterValue("@V_FTVSHIP_ADDR_LINE2", NString.class);
			vFtvshipAddrLine3.val = cmd.getParameterValue("@V_FTVSHIP_ADDR_LINE3", NString.class);
			vFtvshipAddrLine4.val = cmd.getParameterValue("@V_FTVSHIP_ADDR_LINE4", NString.class);
			vFtvshipBuilding.val = cmd.getParameterValue("@V_FTVSHIP_BUILDING", NString.class);
			vFtvshipCity.val = cmd.getParameterValue("@V_FTVSHIP_CITY", NString.class);
			vFtvshipState.val = cmd.getParameterValue("@V_FTVSHIP_STATE", NString.class);
			vFtvshipZipCode.val = cmd.getParameterValue("@V_FTVSHIP_ZIP_CODE", NString.class);
			vFtvshipTgrpCode.val = cmd.getParameterValue("@V_FTVSHIP_TGRP_CODE", NString.class);
			vTermDate.val = cmd.getParameterValue("@V_TERM_DATE", NDate.class);
			vFtvshipFundCodeInvtry.val = cmd.getParameterValue("@V_FTVSHIP_FUND_CODE_INVTRY", NString.class);
			vFtvshipAcctCodeInvtry.val = cmd.getParameterValue("@V_FTVSHIP_ACCT_CODE_INVTRY", NString.class);
			vFtvshipOrgnCodeWare.val = cmd.getParameterValue("@V_FTVSHIP_ORGN_CODE_WARE", NString.class);
			vFtvshipProgCodeWare.val = cmd.getParameterValue("@V_FTVSHIP_PROG_CODE_WARE", NString.class);
			vFtvshipLocnTypeCode.val = cmd.getParameterValue("@V_FTVSHIP_LOCN_TYPE_CODE", NString.class);
			vFtvshipCtryCodePhone.val = cmd.getParameterValue("@V_FTVSHIP_CTRY_CODE_PHONE", NString.class);
			vFtvshipPhoneArea.val = cmd.getParameterValue("@V_FTVSHIP_PHONE_AREA", NString.class);
			vFtvshipPhoneNum.val = cmd.getParameterValue("@V_FTVSHIP_PHONE_NUM", NString.class);
			vFtvshipPhoneExt.val = cmd.getParameterValue("@V_FTVSHIP_PHONE_EXT", NString.class);
			vFtvshipCoasCode.val = cmd.getParameterValue("@V_FTVSHIP_COAS_CODE", NString.class);
			vFtvshipOrgnCode.val = cmd.getParameterValue("@V_FTVSHIP_ORGN_CODE", NString.class);
			vFtvshipNatnCode.val = cmd.getParameterValue("@V_FTVSHIP_NATN_CODE", NString.class);
			vFtvshipNatnDesc.val = cmd.getParameterValue("@V_FTVSHIP_NATN_DESC", NString.class);


		}
		
	
	
	
}
