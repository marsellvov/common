package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class NbJobEarningsRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_EARNINGS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pEarnCode,NString pActiveInd,NNumber pHrs,NNumber pSpecialRate,NString pShift,NNumber pDeemedHrs,NString pUserId,NString pDataOrigin,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_EARNINGS_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_HRS", pHrs);
			cmd.addParameter("@P_SPECIAL_RATE", pSpecialRate);
			cmd.addParameter("@P_SHIFT", pShift);
			cmd.addParameter("@P_DEEMED_HRS", pDeemedHrs);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(Ref<NbJobEarnings.JobEarningsRecRow> pValRecInout,NString pOperationType,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pEarnCode,NString pActiveInd,NNumber pHrs,NNumber pSpecialRate,NString pShift,NNumber pDeemedHrs,NString pUserId,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_EARNINGS_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_VAL_REC_INOUT", pValRecInout.val, NbJobEarnings.JobEarningsRecRow.class, true));
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_EARN_CODE", pEarnCode);
			cmd.addParameter("@P_ACTIVE_IND", pActiveInd);
			cmd.addParameter("@P_HRS", pHrs);
			cmd.addParameter("@P_SPECIAL_RATE", pSpecialRate);
			cmd.addParameter("@P_SHIFT", pShift);
			cmd.addParameter("@P_DEEMED_HRS", pDeemedHrs);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();
			pValRecInout.val = cmd.getParameterValue("@P_VAL_REC_INOUT", NbJobEarnings.JobEarningsRecRow.class);


		}
		
	
	
	
}
