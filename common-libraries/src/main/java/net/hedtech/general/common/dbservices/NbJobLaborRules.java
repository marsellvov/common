package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class NbJobLaborRules {
		public static void pRegisterEntity(NNumber pOperationType,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_LABOR_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pRegisterEntity(NNumber pOperationType,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pProjCode,NString pCtypCode,NString pAcctCodeExternal,NNumber pPercent,NString pEncdNum,NNumber pEncdSeqNum,NNumber pSalaryEncumbrance,NNumber pSalaryEncToPost,NNumber pFringeEncumbrance,NNumber pFringeEncToPost,NString pFundCodeFringe,NString pOrgnCodeFringe,NString pAcctCodeFringe,NString pProgCodeFringe,NString pActvCodeFringe,NString pLocnCodeFringe,NString pChangeInd,NNumber pFringeResidual,NNumber pFringeResToPost,NString pUserId,NString pDataOrigin,NNumber pFutureSalaryEnc,NNumber pFutureFringeEnc,NNumber pFutureFringeResidual,NNumber pFutureSalEncToPost,NNumber pFutureFrgEncToPost,NNumber pFutureFrgResToPost,NDate pEncOverrideEndDate,NDate pEncLastRecastDate,NDate pEncLastCalcDate,NString pEncdNumFringe,NNumber pEncdSeqNumFringe,NString pInternalRecordId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_LABOR_RULES.P_REGISTER_ENTITY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_ACCT_CODE_EXTERNAL", pAcctCodeExternal);
			cmd.addParameter("@P_PERCENT", pPercent);
			cmd.addParameter("@P_ENCD_NUM", pEncdNum);
			cmd.addParameter("@P_ENCD_SEQ_NUM", pEncdSeqNum);
			cmd.addParameter("@P_SALARY_ENCUMBRANCE", pSalaryEncumbrance);
			cmd.addParameter("@P_SALARY_ENC_TO_POST", pSalaryEncToPost);
			cmd.addParameter("@P_FRINGE_ENCUMBRANCE", pFringeEncumbrance);
			cmd.addParameter("@P_FRINGE_ENC_TO_POST", pFringeEncToPost);
			cmd.addParameter("@P_FUND_CODE_FRINGE", pFundCodeFringe);
			cmd.addParameter("@P_ORGN_CODE_FRINGE", pOrgnCodeFringe);
			cmd.addParameter("@P_ACCT_CODE_FRINGE", pAcctCodeFringe);
			cmd.addParameter("@P_PROG_CODE_FRINGE", pProgCodeFringe);
			cmd.addParameter("@P_ACTV_CODE_FRINGE", pActvCodeFringe);
			cmd.addParameter("@P_LOCN_CODE_FRINGE", pLocnCodeFringe);
			cmd.addParameter("@P_CHANGE_IND", pChangeInd);
			cmd.addParameter("@P_FRINGE_RESIDUAL", pFringeResidual);
			cmd.addParameter("@P_FRINGE_RES_TO_POST", pFringeResToPost);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_FUTURE_SALARY_ENC", pFutureSalaryEnc);
			cmd.addParameter("@P_FUTURE_FRINGE_ENC", pFutureFringeEnc);
			cmd.addParameter("@P_FUTURE_FRINGE_RESIDUAL", pFutureFringeResidual);
			cmd.addParameter("@P_FUTURE_SAL_ENC_TO_POST", pFutureSalEncToPost);
			cmd.addParameter("@P_FUTURE_FRG_ENC_TO_POST", pFutureFrgEncToPost);
			cmd.addParameter("@P_FUTURE_FRG_RES_TO_POST", pFutureFrgResToPost);
			cmd.addParameter("@P_ENC_OVERRIDE_END_DATE", pEncOverrideEndDate);
			cmd.addParameter("@P_ENC_LAST_RECAST_DATE", pEncLastRecastDate);
			cmd.addParameter("@P_ENC_LAST_CALC_DATE", pEncLastCalcDate);
			cmd.addParameter("@P_ENCD_NUM_FRINGE", pEncdNumFringe);
			cmd.addParameter("@P_ENCD_SEQ_NUM_FRINGE", pEncdSeqNumFringe);
			cmd.addParameter("@P_INTERNAL_RECORD_ID", pInternalRecordId);
				
			cmd.execute();


		}
		
		public static void pValidate(Ref<NbJobLabor.JobLaborRecRow> pValRecInout,NString pOperationType,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pProjCode,NString pCtypCode,NString pAcctCodeExternal,NNumber pPercent,NString pEncdNum,NNumber pEncdSeqNum,NNumber pSalaryEncumbrance,NNumber pSalaryEncToPost,NNumber pFringeEncumbrance,NNumber pFringeEncToPost,NString pFundCodeFringe,NString pOrgnCodeFringe,NString pAcctCodeFringe,NString pProgCodeFringe,NString pActvCodeFringe,NString pLocnCodeFringe,NString pChangeInd,NNumber pFringeResidual,NNumber pFringeResToPost,NString pUserId,NString pDataOrigin,NNumber pFutureSalaryEnc,NNumber pFutureFringeEnc,NNumber pFutureFringeResidual,NNumber pFutureSalEncToPost,NNumber pFutureFrgEncToPost,NNumber pFutureFrgResToPost,NDate pEncOverrideEndDate,NDate pEncLastRecastDate,NDate pEncLastCalcDate,NString pEncdNumFringe,NNumber pEncdSeqNumFringe,Ref<NString> pWarningsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_LABOR_RULES.P_VALIDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.createStructType("P_VAL_REC_INOUT", pValRecInout.val, NbJobLabor.JobLaborRecRow.class, true));
			cmd.addParameter("@P_OPERATION_TYPE", pOperationType);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ACCI_CODE", pAcciCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_PROJ_CODE", pProjCode);
			cmd.addParameter("@P_CTYP_CODE", pCtypCode);
			cmd.addParameter("@P_ACCT_CODE_EXTERNAL", pAcctCodeExternal);
			cmd.addParameter("@P_PERCENT", pPercent);
			cmd.addParameter("@P_ENCD_NUM", pEncdNum);
			cmd.addParameter("@P_ENCD_SEQ_NUM", pEncdSeqNum);
			cmd.addParameter("@P_SALARY_ENCUMBRANCE", pSalaryEncumbrance);
			cmd.addParameter("@P_SALARY_ENC_TO_POST", pSalaryEncToPost);
			cmd.addParameter("@P_FRINGE_ENCUMBRANCE", pFringeEncumbrance);
			cmd.addParameter("@P_FRINGE_ENC_TO_POST", pFringeEncToPost);
			cmd.addParameter("@P_FUND_CODE_FRINGE", pFundCodeFringe);
			cmd.addParameter("@P_ORGN_CODE_FRINGE", pOrgnCodeFringe);
			cmd.addParameter("@P_ACCT_CODE_FRINGE", pAcctCodeFringe);
			cmd.addParameter("@P_PROG_CODE_FRINGE", pProgCodeFringe);
			cmd.addParameter("@P_ACTV_CODE_FRINGE", pActvCodeFringe);
			cmd.addParameter("@P_LOCN_CODE_FRINGE", pLocnCodeFringe);
			cmd.addParameter("@P_CHANGE_IND", pChangeInd);
			cmd.addParameter("@P_FRINGE_RESIDUAL", pFringeResidual);
			cmd.addParameter("@P_FRINGE_RES_TO_POST", pFringeResToPost);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_FUTURE_SALARY_ENC", pFutureSalaryEnc);
			cmd.addParameter("@P_FUTURE_FRINGE_ENC", pFutureFringeEnc);
			cmd.addParameter("@P_FUTURE_FRINGE_RESIDUAL", pFutureFringeResidual);
			cmd.addParameter("@P_FUTURE_SAL_ENC_TO_POST", pFutureSalEncToPost);
			cmd.addParameter("@P_FUTURE_FRG_ENC_TO_POST", pFutureFrgEncToPost);
			cmd.addParameter("@P_FUTURE_FRG_RES_TO_POST", pFutureFrgResToPost);
			cmd.addParameter("@P_ENC_OVERRIDE_END_DATE", pEncOverrideEndDate);
			cmd.addParameter("@P_ENC_LAST_RECAST_DATE", pEncLastRecastDate);
			cmd.addParameter("@P_ENC_LAST_CALC_DATE", pEncLastCalcDate);
			cmd.addParameter("@P_ENCD_NUM_FRINGE", pEncdNumFringe);
			cmd.addParameter("@P_ENCD_SEQ_NUM_FRINGE", pEncdSeqNumFringe);
			cmd.addParameter("@P_WARNINGS_OUT", NString.class);
				
			cmd.execute();
			pValRecInout.val = cmd.getParameterValue("@P_VAL_REC_INOUT", NbJobLabor.JobLaborRecRow.class);
			pWarningsOut.val = cmd.getParameterValue("@P_WARNINGS_OUT", NString.class);


		}
		
		public static void pValidateDelete(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NB_JOB_LABOR_RULES.P_VALIDATE_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();


		}
		
	
	
	
}
