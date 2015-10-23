package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class TbMiscHeaderRules {
		public static void pRegisterEntity(NNumber pOperationType,NNumber pReceiptNumber,NString pUser,NString pName,NString pHouseNumber,NString pStreetLine1,NString pStreetLine2,NString pStreetLine3,NString pStreetLine4,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pDataOrigin,NString pCreateSource,NString pDocumentNumber,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MISC_HEADER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_RECEIPT_NUMBER", pReceiptNumber);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_STREET_LINE4", pStreetLine4);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CREATE_SOURCE", pCreateSource);
			cmd.addParameter("@P_DOCUMENT_NUMBER", pDocumentNumber);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pReceiptNumber,NString pUser,NString pName,NString pHouseNumber,NString pStreetLine1,NString pStreetLine2,NString pStreetLine3,NString pStreetLine4,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pDataOrigin,NString pCreateSource,NString pDocumentNumber) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TB_MISC_HEADER_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RECEIPT_NUMBER", pReceiptNumber);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_HOUSE_NUMBER", pHouseNumber);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_STREET_LINE4", pStreetLine4);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CREATE_SOURCE", pCreateSource);
			cmd.addParameter("@P_DOCUMENT_NUMBER", pDocumentNumber);
				
			cmd.execute();


		}
		
	
	
	
}
