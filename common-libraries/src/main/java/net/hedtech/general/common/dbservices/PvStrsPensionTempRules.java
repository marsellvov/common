package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvStrsPensionTempRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_STRS_PENSION_TEMP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NNumber pPidm,NString pBdcaCode,NNumber pEmplContRate,NNumber pEmprContRate,NString pPosn,NString pSuff,NString pGroup,NNumber pEligibleGrs,NNumber pPayRate,NString pPayCode,NString pContCode,NNumber pCalcEmplAmt,NNumber pCalcEmprAmt,NNumber pPensHours,NNumber pCalcFte,NString pUserid,NString pReportInd,NString pRetroPrevFiscInd,NString pPretaxInd,NDate pServiceBeginDate,NDate pServiceEndDate,NString pSclsCode,NNumber pSclsBaseHrs,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_STRS_PENSION_TEMP_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_EMPL_CONT_RATE", pEmplContRate);
			cmd.addParameter("@P_EMPR_CONT_RATE", pEmprContRate);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_ELIGIBLE_GRS", pEligibleGrs);
			cmd.addParameter("@P_PAY_RATE", pPayRate);
			cmd.addParameter("@P_PAY_CODE", pPayCode);
			cmd.addParameter("@P_CONT_CODE", pContCode);
			cmd.addParameter("@P_CALC_EMPL_AMT", pCalcEmplAmt);
			cmd.addParameter("@P_CALC_EMPR_AMT", pCalcEmprAmt);
			cmd.addParameter("@P_PENS_HOURS", pPensHours);
			cmd.addParameter("@P_CALC_FTE", pCalcFte);
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_REPORT_IND", pReportInd);
			cmd.addParameter("@P_RETRO_PREV_FISC_IND", pRetroPrevFiscInd);
			cmd.addParameter("@P_PRETAX_IND", pPretaxInd);
			cmd.addParameter("@P_SERVICE_BEGIN_DATE", pServiceBeginDate);
			cmd.addParameter("@P_SERVICE_END_DATE", pServiceEndDate);
			cmd.addParameter("@P_SCLS_CODE", pSclsCode);
			cmd.addParameter("@P_SCLS_BASE_HRS", pSclsBaseHrs);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NNumber pPidm,NString pBdcaCode,NNumber pEmplContRate,NNumber pEmprContRate,NString pPosn,NString pSuff,NString pGroup,NNumber pEligibleGrs,NNumber pPayRate,NString pPayCode,NString pContCode,NNumber pCalcEmplAmt,NNumber pCalcEmprAmt,NNumber pPensHours,NNumber pCalcFte,NString pUserid,NString pReportInd,NString pRetroPrevFiscInd,NString pPretaxInd,NDate pServiceBeginDate,NDate pServiceEndDate,NString pSclsCode,NNumber pSclsBaseHrs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_STRS_PENSION_TEMP_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_EMPL_CONT_RATE", pEmplContRate);
			cmd.addParameter("@P_EMPR_CONT_RATE", pEmprContRate);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_GROUP", pGroup);
			cmd.addParameter("@P_ELIGIBLE_GRS", pEligibleGrs);
			cmd.addParameter("@P_PAY_RATE", pPayRate);
			cmd.addParameter("@P_PAY_CODE", pPayCode);
			cmd.addParameter("@P_CONT_CODE", pContCode);
			cmd.addParameter("@P_CALC_EMPL_AMT", pCalcEmplAmt);
			cmd.addParameter("@P_CALC_EMPR_AMT", pCalcEmprAmt);
			cmd.addParameter("@P_PENS_HOURS", pPensHours);
			cmd.addParameter("@P_CALC_FTE", pCalcFte);
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_REPORT_IND", pReportInd);
			cmd.addParameter("@P_RETRO_PREV_FISC_IND", pRetroPrevFiscInd);
			cmd.addParameter("@P_PRETAX_IND", pPretaxInd);
			cmd.addParameter("@P_SERVICE_BEGIN_DATE", pServiceBeginDate);
			cmd.addParameter("@P_SERVICE_END_DATE", pServiceEndDate);
			cmd.addParameter("@P_SCLS_CODE", pSclsCode);
			cmd.addParameter("@P_SCLS_BASE_HRS", pSclsBaseHrs);
				
			cmd.execute();


		}
		
	
	
	
}
