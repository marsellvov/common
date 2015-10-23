package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEdiIdentificationRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_IDENTIFICATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pDcmtSeqno,NString pIdqlCode,NString pIdnmCode,NString pEnidCode,NString pRnqlCode,NString pRefNumb,NString pRltnCode,NString pLastName,NString pNamePrefix,NString pFirstName,NString pFirstInitial,NString pMiddleName1,NString pMiddleName2,NString pMiddleInitial1,NString pMiddleInitial2,NString pNameSuffix,NString pFormerName,NString pCombinedName,NString pCompositeName,NString pAgencyName,NString pStreetLine1,NString pStreetLine2,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pIdNote,NString pDomesticAddrInd,NString pStreetLine3,NString pStateprovince,NString pDataOrigin,NString pUserId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_IDENTIFICATION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_IDQL_CODE", pIdqlCode);
			cmd.addParameter("@P_IDNM_CODE", pIdnmCode);
			cmd.addParameter("@P_ENID_CODE", pEnidCode);
			cmd.addParameter("@P_RNQL_CODE", pRnqlCode);
			cmd.addParameter("@P_REF_NUMB", pRefNumb);
			cmd.addParameter("@P_RLTN_CODE", pRltnCode);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_NAME_PREFIX", pNamePrefix);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_FIRST_INITIAL", pFirstInitial);
			cmd.addParameter("@P_MIDDLE_NAME_1", pMiddleName1);
			cmd.addParameter("@P_MIDDLE_NAME_2", pMiddleName2);
			cmd.addParameter("@P_MIDDLE_INITIAL_1", pMiddleInitial1);
			cmd.addParameter("@P_MIDDLE_INITIAL_2", pMiddleInitial2);
			cmd.addParameter("@P_NAME_SUFFIX", pNameSuffix);
			cmd.addParameter("@P_FORMER_NAME", pFormerName);
			cmd.addParameter("@P_COMBINED_NAME", pCombinedName);
			cmd.addParameter("@P_COMPOSITE_NAME", pCompositeName);
			cmd.addParameter("@P_AGENCY_NAME", pAgencyName);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_ID_NOTE", pIdNote);
			cmd.addParameter("@P_DOMESTIC_ADDR_IND", pDomesticAddrInd);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_STATEPROVINCE", pStateprovince);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pDcmtSeqno,NString pIdqlCode,NString pIdnmCode,NString pEnidCode,NString pRnqlCode,NString pRefNumb,NString pRltnCode,NString pLastName,NString pNamePrefix,NString pFirstName,NString pFirstInitial,NString pMiddleName1,NString pMiddleName2,NString pMiddleInitial1,NString pMiddleInitial2,NString pNameSuffix,NString pFormerName,NString pCombinedName,NString pCompositeName,NString pAgencyName,NString pStreetLine1,NString pStreetLine2,NString pCity,NString pStatCode,NString pZip,NString pNatnCode,NString pIdNote,NString pDomesticAddrInd,NString pStreetLine3,NString pStateprovince,NString pDataOrigin,NString pUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_IDENTIFICATION_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_IDQL_CODE", pIdqlCode);
			cmd.addParameter("@P_IDNM_CODE", pIdnmCode);
			cmd.addParameter("@P_ENID_CODE", pEnidCode);
			cmd.addParameter("@P_RNQL_CODE", pRnqlCode);
			cmd.addParameter("@P_REF_NUMB", pRefNumb);
			cmd.addParameter("@P_RLTN_CODE", pRltnCode);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_NAME_PREFIX", pNamePrefix);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_FIRST_INITIAL", pFirstInitial);
			cmd.addParameter("@P_MIDDLE_NAME_1", pMiddleName1);
			cmd.addParameter("@P_MIDDLE_NAME_2", pMiddleName2);
			cmd.addParameter("@P_MIDDLE_INITIAL_1", pMiddleInitial1);
			cmd.addParameter("@P_MIDDLE_INITIAL_2", pMiddleInitial2);
			cmd.addParameter("@P_NAME_SUFFIX", pNameSuffix);
			cmd.addParameter("@P_FORMER_NAME", pFormerName);
			cmd.addParameter("@P_COMBINED_NAME", pCombinedName);
			cmd.addParameter("@P_COMPOSITE_NAME", pCompositeName);
			cmd.addParameter("@P_AGENCY_NAME", pAgencyName);
			cmd.addParameter("@P_STREET_LINE1", pStreetLine1);
			cmd.addParameter("@P_STREET_LINE2", pStreetLine2);
			cmd.addParameter("@P_CITY", pCity);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_ZIP", pZip);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_ID_NOTE", pIdNote);
			cmd.addParameter("@P_DOMESTIC_ADDR_IND", pDomesticAddrInd);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_STATEPROVINCE", pStateprovince);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
				
			cmd.execute();


		}
		
	
	
	
}
