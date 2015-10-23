package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class DmlAorcont {
		public static void pDelete(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AORCONT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pInsert(NNumber pidm,NNumber seqNo,NNumber contactPidm,NString lastName,NString firstName,NString mi,NString oconCode,NString jobcCode,NString title,NString atypCode,NString addrLine1,NString addrLine2,NString addrLine3,NString addrLine4,NString addrCity,NString statCodeAddr,NString zipcCodeAddr,NString cntyCodeAddr,NString natnCodeAddr,NString phoneArea,NString phoneNumber,NString phoneExt,NDate contactDate,NDate activityDate,NNumber deliveryPoint,NNumber correctionDigit,NString carrierRoute,NString contOrgInd,NString namePrefix,NString nameSuffix,NString ctryCodePhone,NString surnamePrefix,NString houseNumber,NString primaryInd,NString deceasedInd,NDate endDate,NString emalCode,NString emailAddress,NString emalSrcInd,NString teleCode,NString teleSrcInd,NString faxCode,NString faxArea,NString faxNumber,NString faxExt,NString ctryCodeFax,NString faxSrcInd,NString notes,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AORCONT.P_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PIDM", pidm);
			cmd.addParameter("@SEQ_NO", seqNo);
			cmd.addParameter("@CONTACT_PIDM", contactPidm);
			cmd.addParameter("@LAST_NAME", lastName);
			cmd.addParameter("@FIRST_NAME", firstName);
			cmd.addParameter("@MI", mi);
			cmd.addParameter("@OCON_CODE", oconCode);
			cmd.addParameter("@JOBC_CODE", jobcCode);
			cmd.addParameter("@TITLE", title);
			cmd.addParameter("@ATYP_CODE", atypCode);
			cmd.addParameter("@ADDR_LINE1", addrLine1);
			cmd.addParameter("@ADDR_LINE2", addrLine2);
			cmd.addParameter("@ADDR_LINE3", addrLine3);
			cmd.addParameter("@ADDR_LINE4", addrLine4);
			cmd.addParameter("@ADDR_CITY", addrCity);
			cmd.addParameter("@STAT_CODE_ADDR", statCodeAddr);
			cmd.addParameter("@ZIPC_CODE_ADDR", zipcCodeAddr);
			cmd.addParameter("@CNTY_CODE_ADDR", cntyCodeAddr);
			cmd.addParameter("@NATN_CODE_ADDR", natnCodeAddr);
			cmd.addParameter("@PHONE_AREA", phoneArea);
			cmd.addParameter("@PHONE_NUMBER", phoneNumber);
			cmd.addParameter("@PHONE_EXT", phoneExt);
			cmd.addParameter("@CONTACT_DATE", contactDate);
			cmd.addParameter("@ACTIVITY_DATE", activityDate);
			cmd.addParameter("@DELIVERY_POINT", deliveryPoint);
			cmd.addParameter("@CORRECTION_DIGIT", correctionDigit);
			cmd.addParameter("@CARRIER_ROUTE", carrierRoute);
			cmd.addParameter("@CONT_ORG_IND", contOrgInd);
			cmd.addParameter("@NAME_PREFIX", namePrefix);
			cmd.addParameter("@NAME_SUFFIX", nameSuffix);
			cmd.addParameter("@CTRY_CODE_PHONE", ctryCodePhone);
			cmd.addParameter("@SURNAME_PREFIX", surnamePrefix);
			cmd.addParameter("@HOUSE_NUMBER", houseNumber);
			cmd.addParameter("@PRIMARY_IND", primaryInd);
			cmd.addParameter("@DECEASED_IND", deceasedInd);
			cmd.addParameter("@END_DATE", endDate);
			cmd.addParameter("@EMAL_CODE", emalCode);
			cmd.addParameter("@EMAIL_ADDRESS", emailAddress);
			cmd.addParameter("@EMAL_SRC_IND", emalSrcInd);
			cmd.addParameter("@TELE_CODE", teleCode);
			cmd.addParameter("@TELE_SRC_IND", teleSrcInd);
			cmd.addParameter("@FAX_CODE", faxCode);
			cmd.addParameter("@FAX_AREA", faxArea);
			cmd.addParameter("@FAX_NUMBER", faxNumber);
			cmd.addParameter("@FAX_EXT", faxExt);
			cmd.addParameter("@CTRY_CODE_FAX", ctryCodeFax);
			cmd.addParameter("@FAX_SRC_IND", faxSrcInd);
			cmd.addParameter("@NOTES", notes);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pUpdate() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("DML_AORCONT.P_UPDATE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
