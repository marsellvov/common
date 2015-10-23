package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Bwgkwpay {
		public static void pCallPaymentVendor(NNumber pPidm,NString pCallingProc,NString pCustname,NString pAddr1,NString pAddr2,NString pCity,NString pState,NString pPostalcode,NString pCntry,NString pPhone,NString pEmail,Ref<NString> pStatus,Ref<NString> pReferencecode,Ref<NString> pAuthcode,NNumber pChrgAmount,NString pRetrieveAddr,NString pCcUseAddr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("BWGKWPAY.P_CALL_PAYMENT_VENDOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CALLING_PROC", pCallingProc);
			cmd.addParameter("@P_CUSTNAME", pCustname);
			cmd.addParameter("@P_ADDR1", pAddr1);
			cmd.addParameter("@P_ADDR2", pAddr2);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STATE", pState);
			cmd.addParameter("@P_POSTALCODE", pPostalcode);
			cmd.addParameter("@P_CNTRY", pCntry);
			cmd.addParameter("@P_PHONE", pPhone);
			cmd.addParameter("@P_EMAIL", pEmail);
			cmd.addParameter("@P_STATUS", pStatus, true);
			cmd.addParameter("@P_REFERENCECODE", pReferencecode, true);
			cmd.addParameter("@P_AUTHCODE", pAuthcode, true);
			cmd.addParameter("@P_CHRG_AMOUNT", pChrgAmount);
			cmd.addParameter("@P_RETRIEVE_ADDR", pRetrieveAddr);
			cmd.addParameter("@P_CC_USE_ADDR", pCcUseAddr);
				
			cmd.execute();
			pStatus.val = cmd.getParameterValue("@P_STATUS", NString.class);
			pReferencecode.val = cmd.getParameterValue("@P_REFERENCECODE", NString.class);
			pAuthcode.val = cmd.getParameterValue("@P_AUTHCODE", NString.class);


		}
		
	
	
	
}
