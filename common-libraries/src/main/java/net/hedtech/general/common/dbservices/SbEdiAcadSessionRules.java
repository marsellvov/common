package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEdiAcadSessionRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SESSION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pDcmtSeqno,NNumber pSeqno,NString pStartDate,NNumber pSessNo,NString pSchoolYear,NString pSntpCode,NString pSessName,NString pSbqlCode,NString pBeginDate,NString pSeqlCode,NString pEndDate,NString pSlvlCode,NString pCrqlCode,NString pCurrCode,NString pCurrName,NString pHonrCode,NString pOvrdCode,NString pInstNameOvrd,NString pInqlCodeOvrd,NString pInstCodeOvrd,NString pStreetLine1Ovrd,NString pStreetLine2Ovrd,NString pCityOvrd,NString pStatCodeOvrd,NString pZipOvrd,NString pNatnCodeOvrd,NString pDomesticAddrInd,NString pStreetLine3,NString pStateprovince,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SESSION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_SESS_NO", pSessNo);
			cmd.addParameter("@P_SCHOOL_YEAR", pSchoolYear);
			cmd.addParameter("@P_SNTP_CODE", pSntpCode);
			cmd.addParameter("@P_SESS_NAME", pSessName);
			cmd.addParameter("@P_SBQL_CODE", pSbqlCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_SEQL_CODE", pSeqlCode);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_SLVL_CODE", pSlvlCode);
			cmd.addParameter("@P_CRQL_CODE", pCrqlCode);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_CURR_NAME", pCurrName);
			cmd.addParameter("@P_HONR_CODE", pHonrCode);
			cmd.addParameter("@P_OVRD_CODE", pOvrdCode);
			cmd.addParameter("@P_INST_NAME_OVRD", pInstNameOvrd);
			cmd.addParameter("@P_INQL_CODE_OVRD", pInqlCodeOvrd);
			cmd.addParameter("@P_INST_CODE_OVRD", pInstCodeOvrd);
			cmd.addParameter("@P_STREET_LINE1_OVRD", pStreetLine1Ovrd);
			cmd.addParameter("@P_STREET_LINE2_OVRD", pStreetLine2Ovrd);
			cmd.addParameter("@P_CITY_OVRD", pCityOvrd);
			cmd.addParameter("@P_STAT_CODE_OVRD", pStatCodeOvrd);
			cmd.addParameter("@P_ZIP_OVRD", pZipOvrd);
			cmd.addParameter("@P_NATN_CODE_OVRD", pNatnCodeOvrd);
			cmd.addParameter("@P_DOMESTIC_ADDR_IND", pDomesticAddrInd);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_STATEPROVINCE", pStateprovince);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pDcmtSeqno,NNumber pSeqno,NString pStartDate,NNumber pSessNo,NString pSchoolYear,NString pSntpCode,NString pSessName,NString pSbqlCode,NString pBeginDate,NString pSeqlCode,NString pEndDate,NString pSlvlCode,NString pCrqlCode,NString pCurrCode,NString pCurrName,NString pHonrCode,NString pOvrdCode,NString pInstNameOvrd,NString pInqlCodeOvrd,NString pInstCodeOvrd,NString pStreetLine1Ovrd,NString pStreetLine2Ovrd,NString pCityOvrd,NString pStatCodeOvrd,NString pZipOvrd,NString pNatnCodeOvrd,NString pDomesticAddrInd,NString pStreetLine3,NString pStateprovince,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_ACAD_SESSION_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_SESS_NO", pSessNo);
			cmd.addParameter("@P_SCHOOL_YEAR", pSchoolYear);
			cmd.addParameter("@P_SNTP_CODE", pSntpCode);
			cmd.addParameter("@P_SESS_NAME", pSessName);
			cmd.addParameter("@P_SBQL_CODE", pSbqlCode);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_SEQL_CODE", pSeqlCode);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_SLVL_CODE", pSlvlCode);
			cmd.addParameter("@P_CRQL_CODE", pCrqlCode);
			cmd.addParameter("@P_CURR_CODE", pCurrCode);
			cmd.addParameter("@P_CURR_NAME", pCurrName);
			cmd.addParameter("@P_HONR_CODE", pHonrCode);
			cmd.addParameter("@P_OVRD_CODE", pOvrdCode);
			cmd.addParameter("@P_INST_NAME_OVRD", pInstNameOvrd);
			cmd.addParameter("@P_INQL_CODE_OVRD", pInqlCodeOvrd);
			cmd.addParameter("@P_INST_CODE_OVRD", pInstCodeOvrd);
			cmd.addParameter("@P_STREET_LINE1_OVRD", pStreetLine1Ovrd);
			cmd.addParameter("@P_STREET_LINE2_OVRD", pStreetLine2Ovrd);
			cmd.addParameter("@P_CITY_OVRD", pCityOvrd);
			cmd.addParameter("@P_STAT_CODE_OVRD", pStatCodeOvrd);
			cmd.addParameter("@P_ZIP_OVRD", pZipOvrd);
			cmd.addParameter("@P_NATN_CODE_OVRD", pNatnCodeOvrd);
			cmd.addParameter("@P_DOMESTIC_ADDR_IND", pDomesticAddrInd);
			cmd.addParameter("@P_STREET_LINE3", pStreetLine3);
			cmd.addParameter("@P_STATEPROVINCE", pStateprovince);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
