package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nbkjenk {
		public static void pCalcActiveDays(NNumber pPidm,NString pPosn,NString pSuff,NDate pBeginDate,NDate pEndDate,Ref<NNumber> pActiveDaysOut,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJENK.P_CALC_ACTIVE_DAYS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_ACTIVE_DAYS_OUT", NNumber.class);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pActiveDaysOut.val = cmd.getParameterValue("@P_ACTIVE_DAYS_OUT", NNumber.class);
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
		public static void pCalcEncdNum(NString pCoasCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pJobsFiscCode,Ref<NString> pEncdNumOut,Ref<NNumber> pEncdSeqNumOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJENK.P_CALC_ENCD_NUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_JOBS_FISC_CODE", pJobsFiscCode);
			cmd.addParameter("@P_ENCD_NUM_OUT", NString.class);
			cmd.addParameter("@P_ENCD_SEQ_NUM_OUT", NNumber.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pEncdNumOut.val = cmd.getParameterValue("@P_ENCD_NUM_OUT", NString.class);
			pEncdSeqNumOut.val = cmd.getParameterValue("@P_ENCD_SEQ_NUM_OUT", NNumber.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pCalcSalaryEncumbrance(NNumber pPidm,NString pPosn,NString pSuff,NDate pEncBeginDate,NDate pEncEndDate,NNumber pOldSalaryEncumbrance,NString pSource,Ref<NNumber> pSalaryEncumbranceOut,Ref<NString> pWarningMsgOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJENK.P_CALC_SALARY_ENCUMBRANCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_ENC_BEGIN_DATE", pEncBeginDate);
			cmd.addParameter("@P_ENC_END_DATE", pEncEndDate);
			cmd.addParameter("@P_OLD_SALARY_ENCUMBRANCE", pOldSalaryEncumbrance);
			cmd.addParameter("@P_SOURCE", pSource);
			cmd.addParameter("@P_SALARY_ENCUMBRANCE_OUT", NNumber.class);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pSalaryEncumbranceOut.val = cmd.getParameterValue("@P_SALARY_ENCUMBRANCE_OUT", NNumber.class);
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pCalcWeekdays(NDate pBeginDate,NDate pEndDate,Ref<NNumber> pWeekdaysOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJENK.P_CALC_WEEKDAYS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_WEEKDAYS_OUT", NNumber.class);
				
			cmd.execute();
			pWeekdaysOut.val = cmd.getParameterValue("@P_WEEKDAYS_OUT", NNumber.class);


		}
		
	
	
	
}
