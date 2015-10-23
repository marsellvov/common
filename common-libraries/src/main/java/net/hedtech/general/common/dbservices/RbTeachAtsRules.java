package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbTeachAtsRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEACH_ATS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pAidyCode,NString pAtsId,NString pStatus,NNumber pPidm,NString pSsn,NDate pBirthDate,NString pLastName,NString pDocumentId,NString pUserId,NString pDataOrigin,NDate pDischargeDate,NString pDischargeReasonCde,NString pDischargeBatchId,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEACH_ATS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ATS_ID", pAtsId);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_DISCHARGE_DATE", pDischargeDate);
			cmd.addParameter("@P_DISCHARGE_REASON_CDE", pDischargeReasonCde);
			cmd.addParameter("@P_DISCHARGE_BATCH_ID", pDischargeBatchId);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pAidyCode,NString pAtsId,NString pStatus,NNumber pPidm,NString pSsn,NDate pBirthDate,NString pLastName,NString pDocumentId,NString pUserId,NString pDataOrigin,NDate pDischargeDate,NString pDischargeReasonCde,NString pDischargeBatchId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_TEACH_ATS_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ATS_ID", pAtsId);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_DOCUMENT_ID", pDocumentId);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_DISCHARGE_DATE", pDischargeDate);
			cmd.addParameter("@P_DISCHARGE_REASON_CDE", pDischargeReasonCde);
			cmd.addParameter("@P_DISCHARGE_BATCH_ID", pDischargeBatchId);
				
			cmd.execute();


		}
		
	
	
	
}
