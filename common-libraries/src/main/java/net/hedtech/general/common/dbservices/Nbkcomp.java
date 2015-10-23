package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nbkcomp {
		public static void pBalanceCompensationFields(NString pSgrpCode,NString pSalTable,NString pSalGrade,NNumber pSalStep,NNumber pFactor,NNumber pRegRate,NNumber pHrsPay,NNumber pAssgnSalary,NNumber pAnnSalary,NString pRegRateEnteredInd,Ref<NString> pWarningMsgOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKCOMP.P_BALANCE_COMPENSATION_FIELDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SGRP_CODE", pSgrpCode);
			cmd.addParameter("@P_SAL_TABLE", pSalTable);
			cmd.addParameter("@P_SAL_GRADE", pSalGrade);
			cmd.addParameter("@P_SAL_STEP", pSalStep);
			cmd.addParameter("@P_FACTOR", pFactor);
			cmd.addParameter("@P_REG_RATE", pRegRate);
			cmd.addParameter("@P_HRS_PAY", pHrsPay);
			cmd.addParameter("@P_ASSGN_SALARY", pAssgnSalary);
			cmd.addParameter("@P_ANN_SALARY", pAnnSalary);
			cmd.addParameter("@P_REG_RATE_ENTERED_IND", pRegRateEnteredInd);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pCalcCompensationFields(NString pChangedField,NNumber pApptPct,NNumber pOldApptPct,NString pInternalFtPtInd,NString pSgrpCode,NString pSalTable,NString pSalGrade,NNumber pSalStep,NNumber pFactor,NNumber pPays,Ref<NNumber> pHrsDayInout,Ref<NNumber> pRegRateInout,Ref<NNumber> pHrsPayInout,Ref<NNumber> pAssgnSalaryInout,Ref<NNumber> pAnnSalaryInout,Ref<NNumber> pPerPaySalaryInout,Ref<NNumber> pPerPayDeferAmtInout,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKCOMP.P_CALC_COMPENSATION_FIELDS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CHANGED_FIELD", pChangedField);
			cmd.addParameter("@P_APPT_PCT", pApptPct);
			cmd.addParameter("@P_OLD_APPT_PCT", pOldApptPct);
			cmd.addParameter("@P_INTERNAL_FT_PT_IND", pInternalFtPtInd);
			cmd.addParameter("@P_SGRP_CODE", pSgrpCode);
			cmd.addParameter("@P_SAL_TABLE", pSalTable);
			cmd.addParameter("@P_SAL_GRADE", pSalGrade);
			cmd.addParameter("@P_SAL_STEP", pSalStep);
			cmd.addParameter("@P_FACTOR", pFactor);
			cmd.addParameter("@P_PAYS", pPays);
			cmd.addParameter("@P_HRS_DAY_INOUT", pHrsDayInout, true);
			cmd.addParameter("@P_REG_RATE_INOUT", pRegRateInout, true);
			cmd.addParameter("@P_HRS_PAY_INOUT", pHrsPayInout, true);
			cmd.addParameter("@P_ASSGN_SALARY_INOUT", pAssgnSalaryInout, true);
			cmd.addParameter("@P_ANN_SALARY_INOUT", pAnnSalaryInout, true);
			cmd.addParameter("@P_PER_PAY_SALARY_INOUT", pPerPaySalaryInout, true);
			cmd.addParameter("@P_PER_PAY_DEFER_AMT_INOUT", pPerPayDeferAmtInout, true);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pHrsDayInout.val = cmd.getParameterValue("@P_HRS_DAY_INOUT", NNumber.class);
			pRegRateInout.val = cmd.getParameterValue("@P_REG_RATE_INOUT", NNumber.class);
			pHrsPayInout.val = cmd.getParameterValue("@P_HRS_PAY_INOUT", NNumber.class);
			pAssgnSalaryInout.val = cmd.getParameterValue("@P_ASSGN_SALARY_INOUT", NNumber.class);
			pAnnSalaryInout.val = cmd.getParameterValue("@P_ANN_SALARY_INOUT", NNumber.class);
			pPerPaySalaryInout.val = cmd.getParameterValue("@P_PER_PAY_SALARY_INOUT", NNumber.class);
			pPerPayDeferAmtInout.val = cmd.getParameterValue("@P_PER_PAY_DEFER_AMT_INOUT", NNumber.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
	
	
	
}
