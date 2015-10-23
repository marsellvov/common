package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class NbJobEncHistoryRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_ENC_HISTORY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NDate pCaptureDate,NNumber pSeqNo,NDate pEncBeginDate,NString pUserId,NDate pEncEndDate,NNumber pSalaryEncumbrance,NNumber pFutureSalaryEnc,NString pEndDateReason,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_ENC_HISTORY_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_CAPTURE_DATE", pCaptureDate);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ENC_BEGIN_DATE", pEncBeginDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ENC_END_DATE", pEncEndDate);
			cmd.addParameter("@P_SALARY_ENCUMBRANCE", pSalaryEncumbrance);
			cmd.addParameter("@P_FUTURE_SALARY_ENC", pFutureSalaryEnc);
			cmd.addParameter("@P_END_DATE_REASON", pEndDateReason);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NDate pCaptureDate,NNumber pSeqNo,NDate pEncBeginDate,NString pUserId,NDate pEncEndDate,NNumber pSalaryEncumbrance,NNumber pFutureSalaryEnc,NString pEndDateReason,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_ENC_HISTORY_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_CAPTURE_DATE", pCaptureDate);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ENC_BEGIN_DATE", pEncBeginDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_ENC_END_DATE", pEncEndDate);
			cmd.addParameter("@P_SALARY_ENCUMBRANCE", pSalaryEncumbrance);
			cmd.addParameter("@P_FUTURE_SALARY_ENC", pFutureSalaryEnc);
			cmd.addParameter("@P_END_DATE_REASON", pEndDateReason);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
