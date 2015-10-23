package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbFacIsolcompRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_ISOLCOMP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,NString pPosn,NString pSuff,NDate pJobEffectiveDate,NString pUserId,NString pDataOrigin,NNumber pRate,NString pCalcMethod,NNumber pCompCreditHrs,NNumber pCompHrsWeek,NNumber pCompWorkload,NNumber pCompEnrlComp,NNumber pCompensationAmount,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_ISOLCOMP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_JOB_EFFECTIVE_DATE", pJobEffectiveDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_RATE", pRate);
			cmd.addParameter("@P_CALC_METHOD", pCalcMethod);
			cmd.addParameter("@P_COMP_CREDIT_HRS", pCompCreditHrs);
			cmd.addParameter("@P_COMP_HRS_WEEK", pCompHrsWeek);
			cmd.addParameter("@P_COMP_WORKLOAD", pCompWorkload);
			cmd.addParameter("@P_COMP_ENRL_COMP", pCompEnrlComp);
			cmd.addParameter("@P_COMPENSATION_AMOUNT", pCompensationAmount);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,NString pPosn,NString pSuff,NDate pJobEffectiveDate,NString pUserId,NString pDataOrigin,NNumber pRate,NString pCalcMethod,NNumber pCompCreditHrs,NNumber pCompHrsWeek,NNumber pCompWorkload,NNumber pCompEnrlComp,NNumber pCompensationAmount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_ISOLCOMP_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_JOB_EFFECTIVE_DATE", pJobEffectiveDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_RATE", pRate);
			cmd.addParameter("@P_CALC_METHOD", pCalcMethod);
			cmd.addParameter("@P_COMP_CREDIT_HRS", pCompCreditHrs);
			cmd.addParameter("@P_COMP_HRS_WEEK", pCompHrsWeek);
			cmd.addParameter("@P_COMP_WORKLOAD", pCompWorkload);
			cmd.addParameter("@P_COMP_ENRL_COMP", pCompEnrlComp);
			cmd.addParameter("@P_COMPENSATION_AMOUNT", pCompensationAmount);
				
			cmd.execute();


		}
		
	
	
	
}
