package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEdiDocHeaderRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_DOC_HEADER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pDcmtSeqno,NString pEntyCode,NString pEntyName1,NString pInqlCode,NString pInstCode,NString pEntyName2,NString pEntyName3,NString pStreetLine1,NString pStreetLine2,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pCtfnCode,NString pContactName,NString pCoqlCode,NString pCommNo,NString pDomesticAddrInd,NString pStreetLine3,NString pStateprovince,NString pDataOrigin,NString pUserId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_DOC_HEADER_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ENTY_CODE", pEntyCode);
			cmd.addParameter("@P_ENTY_NAME_1", pEntyName1);
			cmd.addParameter("@P_INQL_CODE", pInqlCode);
			cmd.addParameter("@P_INST_CODE", pInstCode);
			cmd.addParameter("@P_ENTY_NAME_2", pEntyName2);
			cmd.addParameter("@P_ENTY_NAME_3", pEntyName3);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_CTFN_CODE", pCtfnCode);
			cmd.addParameter("@P_CONTACT_NAME", pContactName);
			cmd.addParameter("@P_COQL_CODE", pCoqlCode);
			cmd.addParameter("@P_COMM_NO", pCommNo);
			cmd.addParameter("@P_DOMESTIC_ADDR_IND", pDomesticAddrInd);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_STATEPROVINCE", pStateprovince);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pDcmtSeqno,NString pEntyCode,NString pEntyName1,NString pInqlCode,NString pInstCode,NString pEntyName2,NString pEntyName3,NString pStreetLine1,NString pStreetLine2,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pCtfnCode,NString pContactName,NString pCoqlCode,NString pCommNo,NString pDomesticAddrInd,NString pStreetLine3,NString pStateprovince,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_DOC_HEADER_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ENTY_CODE", pEntyCode);
			cmd.addParameter("@P_ENTY_NAME_1", pEntyName1);
			cmd.addParameter("@P_INQL_CODE", pInqlCode);
			cmd.addParameter("@P_INST_CODE", pInstCode);
			cmd.addParameter("@P_ENTY_NAME_2", pEntyName2);
			cmd.addParameter("@P_ENTY_NAME_3", pEntyName3);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_CTFN_CODE", pCtfnCode);
			cmd.addParameter("@P_CONTACT_NAME", pContactName);
			cmd.addParameter("@P_COQL_CODE", pCoqlCode);
			cmd.addParameter("@P_COMM_NO", pCommNo);
			cmd.addParameter("@P_DOMESTIC_ADDR_IND", pDomesticAddrInd);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_STATEPROVINCE", pStateprovince);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
