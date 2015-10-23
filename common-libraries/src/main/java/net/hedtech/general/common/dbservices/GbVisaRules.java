package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GbVisaRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_VISA_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NNumber pSeqNo,NString pVtypCode,NString pVisaNumber,NString pNatnCodeIssue,NString pVissCode,NDate pVisaStartDate,NDate pVisaExpireDate,NString pEntryInd,NString pUserId,NDate pVisaReqDate,NDate pVisaIssueDate,NString pPentCode,NString pNoEntries,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_VISA_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_VTYP_CODE", pVtypCode);
			cmd.addParameter("@P_VISA_NUMBER", pVisaNumber);
			cmd.addParameter("@P_NATN_CODE_ISSUE", pNatnCodeIssue);
			cmd.addParameter("@P_VISS_CODE", pVissCode);
			cmd.addParameter("@P_VISA_START_DATE", pVisaStartDate);
			cmd.addParameter("@P_VISA_EXPIRE_DATE", pVisaExpireDate);
			cmd.addParameter("@P_ENTRY_IND", pEntryInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VISA_REQ_DATE", pVisaReqDate);
			cmd.addParameter("@P_VISA_ISSUE_DATE", pVisaIssueDate);
			cmd.addParameter("@P_PENT_CODE", pPentCode);
			cmd.addParameter("@P_NO_ENTRIES", pNoEntries);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NNumber pSeqNo,NString pVtypCode,NString pVisaNumber,NString pNatnCodeIssue,NString pVissCode,NDate pVisaStartDate,NDate pVisaExpireDate,NString pEntryInd,NString pUserId,NDate pVisaReqDate,NDate pVisaIssueDate,NString pPentCode,NString pNoEntries,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GB_VISA_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_VTYP_CODE", pVtypCode);
			cmd.addParameter("@P_VISA_NUMBER", pVisaNumber);
			cmd.addParameter("@P_NATN_CODE_ISSUE", pNatnCodeIssue);
			cmd.addParameter("@P_VISS_CODE", pVissCode);
			cmd.addParameter("@P_VISA_START_DATE", pVisaStartDate);
			cmd.addParameter("@P_VISA_EXPIRE_DATE", pVisaExpireDate);
			cmd.addParameter("@P_ENTRY_IND", pEntryInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_VISA_REQ_DATE", pVisaReqDate);
			cmd.addParameter("@P_VISA_ISSUE_DATE", pVisaIssueDate);
			cmd.addParameter("@P_PENT_CODE", pPentCode);
			cmd.addParameter("@P_NO_ENTRIES", pNoEntries);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
