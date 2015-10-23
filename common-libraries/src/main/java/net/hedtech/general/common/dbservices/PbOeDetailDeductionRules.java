package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbOeDetailDeductionRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_DETAIL_DEDUCTION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pBdcaCode,NDate pEffectiveDate,NString pStatus,NString pOpenEnrollInd,NString pUserId,NString pDataOrigin,NNumber pAmount1,NNumber pAmount2,NNumber pAmount3,NNumber pAmount4,NString pOptCode1,NString pOptCode2,NString pOptCode3,NString pOptCode4,NString pOptCode5,NDate pCoverageDate,NString pBdclCode,NString pBreaCode,NDate pEventDate,NDate pConfirmedDate,NDate pAppliedDate,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_DETAIL_DEDUCTION_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_OPEN_ENROLL_IND", pOpenEnrollInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_AMOUNT1", pAmount1);
			cmd.addParameter("@P_AMOUNT2", pAmount2);
			cmd.addParameter("@P_AMOUNT3", pAmount3);
			cmd.addParameter("@P_AMOUNT4", pAmount4);
			cmd.addParameter("@P_OPT_CODE1", pOptCode1);
			cmd.addParameter("@P_OPT_CODE2", pOptCode2);
			cmd.addParameter("@P_OPT_CODE3", pOptCode3);
			cmd.addParameter("@P_OPT_CODE4", pOptCode4);
			cmd.addParameter("@P_OPT_CODE5", pOptCode5);
			cmd.addParameter("@P_COVERAGE_DATE", pCoverageDate);
			cmd.addParameter("@P_BDCL_CODE", pBdclCode);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_EVENT_DATE", pEventDate);
			cmd.addParameter("@P_CONFIRMED_DATE", pConfirmedDate);
			cmd.addParameter("@P_APPLIED_DATE", pAppliedDate);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NNumber pPidm,NString pBdcaCode,NDate pEffectiveDate,NString pStatus,NString pOpenEnrollInd,NString pUserId,NString pDataOrigin,NNumber pAmount1,NNumber pAmount2,NNumber pAmount3,NNumber pAmount4,NString pOptCode1,NString pOptCode2,NString pOptCode3,NString pOptCode4,NString pOptCode5,NDate pCoverageDate,NString pBdclCode,NString pBreaCode,NDate pEventDate,NDate pConfirmedDate,NDate pAppliedDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_OE_DETAIL_DEDUCTION_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_OPEN_ENROLL_IND", pOpenEnrollInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_AMOUNT1", pAmount1);
			cmd.addParameter("@P_AMOUNT2", pAmount2);
			cmd.addParameter("@P_AMOUNT3", pAmount3);
			cmd.addParameter("@P_AMOUNT4", pAmount4);
			cmd.addParameter("@P_OPT_CODE1", pOptCode1);
			cmd.addParameter("@P_OPT_CODE2", pOptCode2);
			cmd.addParameter("@P_OPT_CODE3", pOptCode3);
			cmd.addParameter("@P_OPT_CODE4", pOptCode4);
			cmd.addParameter("@P_OPT_CODE5", pOptCode5);
			cmd.addParameter("@P_COVERAGE_DATE", pCoverageDate);
			cmd.addParameter("@P_BDCL_CODE", pBdclCode);
			cmd.addParameter("@P_BREA_CODE", pBreaCode);
			cmd.addParameter("@P_EVENT_DATE", pEventDate);
			cmd.addParameter("@P_CONFIRMED_DATE", pConfirmedDate);
			cmd.addParameter("@P_APPLIED_DATE", pAppliedDate);
				
			cmd.execute();


		}
		
	
	
	
}
