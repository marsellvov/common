package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.Nbkjenc.JlbdTabtypeRow;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nbkencm {
		public static NString fEpaf() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKENCM.F_EPAF", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFiniSeqNumFringeInd(NString pFiscCode,NString pCoasCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKENCM.F_FINI_SEQ_NUM_FRINGE_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_FISC_CODE", pFiscCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetFrbgrntTitle(NString pGrntCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKENCM.F_GET_FRBGRNT_TITLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_GRNT_CODE", pGrntCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetFtvfundGrntCode(NString pCoasCode,NString pFundCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKENCM.F_GET_FTVFUND_GRNT_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSalaryEncumbranceInd(NNumber pPidm,NString pPosn,NString pSuff,NDate pBjobBeginDate,NDate pQueryDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKENCM.F_SALARY_ENCUMBRANCE_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_BJOB_BEGIN_DATE", pBjobBeginDate);
			cmd.addParameter("@P_QUERY_DATE", pQueryDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fSalaryPlanner() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKENCM.F_SALARY_PLANNER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fString(NString pErrorname,NString pValue01,NString pValue02,NString pValue03,NString pValue04) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKENCM.F_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ERRORNAME", pErrorname);
			cmd.addParameter("@P_VALUE_01", pValue01);
			cmd.addParameter("@P_VALUE_02", pValue02);
			cmd.addParameter("@P_VALUE_03", pValue03);
			cmd.addParameter("@P_VALUE_04", pValue04);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void pEditEncOverrideEndDate(List<NpJobLabor.JobLaborEncTabRow> pJobLaborTab,Ref<NString> pErrorMsgOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKENCM.P_EDIT_ENC_OVERRIDE_END_DATE", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_JOB_LABOR_TAB", "", pJobLaborTab, object.class));
//			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
//				
//			cmd.execute();
//			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);
//
//
//		}
		
		public static void pEditEncOverrideEndDate(List<NpJobLabor.JobLaborTabRow> pJobLaborTab,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKENCM.P_EDIT_ENC_OVERRIDE_END_DATE", DbManager.getDataBaseFactory());
			
			// cmd.addParameter(DbTypes.getTableType("P_JOB_LABOR_TAB", "", pJobLaborTab, object.class));
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pEditJlbdEncEndDate(NNumber pPidm,NString pPosn,NString pSuff,NString pCoasCode,NString pFundCode,NDate pEffectiveDate,NDate pEncOverrideEndDate,Ref<NString> pErrorMsgOut,Ref<NString> pWarningMsgOut,NString pEditSource,NDate pCurrEncOverrideEndDate) {
			
			pEditJlbdEncEndDate(pPidm,pPosn,pSuff,pCoasCode,pFundCode,pEffectiveDate,pEncOverrideEndDate,pErrorMsgOut,pWarningMsgOut,pEditSource,pCurrEncOverrideEndDate,NNumber.getNull());

		}
		
		public static void pEditJlbdEncEndDate(NNumber pPidm,NString pPosn,NString pSuff,NString pCoasCode,NString pFundCode,NDate pEffectiveDate,NDate pEncOverrideEndDate,Ref<NString> pErrorMsgOut,Ref<NString> pWarningMsgOut,NString pEditSource,NDate pCurrEncOverrideEndDate,NNumber pTransNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKENCM.P_EDIT_JLBD_ENC_END_DATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ENC_OVERRIDE_END_DATE", pEncOverrideEndDate);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
			cmd.addParameter("@P_EDIT_SOURCE", pEditSource);
			cmd.addParameter("@P_CURR_ENC_OVERRIDE_END_DATE", pCurrEncOverrideEndDate);
			cmd.addParameter("@P_TRANS_NO", pTransNo);
				
			cmd.execute();
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
		public static void pGetFringeLbdRate(NString pFiscCode,NString pCoasCode,NString pEclsCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NDate pEffectiveDate,NString pFrngCalcInd,Ref<NNumber> pFringeRateOut,Ref<NNumber> pInstFringeRateOut,Ref<NString> pFringeMatchTypeOut,Ref<NDate> pFringeEndDateOut,Ref<NString> pFringeReturnCodeOut,Ref<NString> pFundCodeFringeOut,Ref<NString> pOrgnCodeFringeOut,Ref<NString> pAcctCodeFringeOut,Ref<NString> pProgCodeFringeOut,Ref<NString> pActvCodeFringeOut,Ref<NString> pLocnCodeFringeOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKENCM.P_GET_FRINGE_LBD_RATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FISC_CODE", pFiscCode);
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_ORGN_CODE", pOrgnCode);
			cmd.addParameter("@P_ACCT_CODE", pAcctCode);
			cmd.addParameter("@P_PROG_CODE", pProgCode);
			cmd.addParameter("@P_ACTV_CODE", pActvCode);
			cmd.addParameter("@P_LOCN_CODE", pLocnCode);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_FRNG_CALC_IND", pFrngCalcInd);
			cmd.addParameter("@P_FRINGE_RATE_OUT", NNumber.class);
			cmd.addParameter("@P_INST_FRINGE_RATE_OUT", NNumber.class);
			cmd.addParameter("@P_FRINGE_MATCH_TYPE_OUT", NString.class);
			cmd.addParameter("@P_FRINGE_END_DATE_OUT", NDate.class);
			cmd.addParameter("@P_FRINGE_RETURN_CODE_OUT", NString.class);
			cmd.addParameter("@P_FUND_CODE_FRINGE_OUT", NString.class);
			cmd.addParameter("@P_ORGN_CODE_FRINGE_OUT", NString.class);
			cmd.addParameter("@P_ACCT_CODE_FRINGE_OUT", NString.class);
			cmd.addParameter("@P_PROG_CODE_FRINGE_OUT", NString.class);
			cmd.addParameter("@P_ACTV_CODE_FRINGE_OUT", NString.class);
			cmd.addParameter("@P_LOCN_CODE_FRINGE_OUT", NString.class);
				
			cmd.execute();
			pFringeRateOut.val = cmd.getParameterValue("@P_FRINGE_RATE_OUT", NNumber.class);
			pInstFringeRateOut.val = cmd.getParameterValue("@P_INST_FRINGE_RATE_OUT", NNumber.class);
			pFringeMatchTypeOut.val = cmd.getParameterValue("@P_FRINGE_MATCH_TYPE_OUT", NString.class);
			pFringeEndDateOut.val = cmd.getParameterValue("@P_FRINGE_END_DATE_OUT", NDate.class);
			pFringeReturnCodeOut.val = cmd.getParameterValue("@P_FRINGE_RETURN_CODE_OUT", NString.class);
			pFundCodeFringeOut.val = cmd.getParameterValue("@P_FUND_CODE_FRINGE_OUT", NString.class);
			pOrgnCodeFringeOut.val = cmd.getParameterValue("@P_ORGN_CODE_FRINGE_OUT", NString.class);
			pAcctCodeFringeOut.val = cmd.getParameterValue("@P_ACCT_CODE_FRINGE_OUT", NString.class);
			pProgCodeFringeOut.val = cmd.getParameterValue("@P_PROG_CODE_FRINGE_OUT", NString.class);
			pActvCodeFringeOut.val = cmd.getParameterValue("@P_ACTV_CODE_FRINGE_OUT", NString.class);
			pLocnCodeFringeOut.val = cmd.getParameterValue("@P_LOCN_CODE_FRINGE_OUT", NString.class);


		}
		
		public static void pGetFundGrntInfo(NString pCoasCode,NString pFundCode,NDate pLastRecastDate,NDate pLastCalcDate,Ref<FundGrntRectypeRow> pFundGrntRec) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKENCM.P_GET_FUND_GRNT_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COAS_CODE", pCoasCode);
			cmd.addParameter("@P_FUND_CODE", pFundCode);
			cmd.addParameter("@P_LAST_RECAST_DATE", pLastRecastDate);
			cmd.addParameter("@P_LAST_CALC_DATE", pLastCalcDate);
			cmd.addParameter(DbTypes.createStructType("P_FUND_GRNT_REC", pFundGrntRec.val, FundGrntRectypeRow.class));
			
			//cmd.addParameter(DbTypes.createStructType("P_FUND_GRNT_REC", pFundGrntRec.val, NbkencmFundGrntRectypeRow.class,true));
				
			cmd.execute();
			pFundGrntRec.val = cmd.getParameterValue("P_FUND_GRNT_REC", FundGrntRectypeRow.class);
			

		}
		
//		public static void pProcessThisJob(NNumber pPidm,NString pPosn,NString pSuff,NString pRowid,NDate pRecastDate,NString pLiquidateFyInd,Ref<List<JlbdTabtypeRow>> pJlbdTabOut,Ref<List<MsgStringTabtypeRow>> pErrorTabOut,Ref<List<MsgStringTabtypeRow>> pWarningTabOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKENCM.P_PROCESS_THIS_JOB", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_POSN", pPosn);
//			cmd.addParameter("@P_SUFF", pSuff);
//			cmd.addParameter("@P_ROWID", pRowid);
//			cmd.addParameter("@P_RECAST_DATE", pRecastDate);
//			cmd.addParameter("@P_LIQUIDATE_FY_IND", pLiquidateFyInd);
//			// cmd.addParameter(DbTypes.getTableType("P_JLBD_TAB_OUT", "", object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_ERROR_TAB_OUT", "", object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_WARNING_TAB_OUT", "", object.class));
//				
//			cmd.execute();
//			// pJlbdTabOut.val = cmd.getTableParameterValue("@P_JLBD_TAB_OUT", object.class);
//			// pErrorTabOut.val = cmd.getTableParameterValue("@P_ERROR_TAB_OUT", object.class);
//			// pWarningTabOut.val = cmd.getTableParameterValue("@P_WARNING_TAB_OUT", object.class);
//
//
//		}
		
	
	
	@DbRecordType(id="FundGrntRectypeRow", dataSourceName="NBKENCM.FUND_GRNT_RECTYPE")
	public static class FundGrntRectypeRow
	{
		@DbRecordField(dataSourceName="R_FRVFUND_CODE")
		public NString RFrvfundCode;
		@DbRecordField(dataSourceName="R_FRVFUND_EFFECTIVE_DATE")
		public NDate RFrvfundEffectiveDate;
		@DbRecordField(dataSourceName="R_FRVFUND_ENC_MULT_YR_IND")
		public NString RFrvfundEncMultYrInd;
		@DbRecordField(dataSourceName="R_FRVFUND_BUDG_PRD_START_DATE")
		public NDate RFrvfundBudgPrdStartDate;
		@DbRecordField(dataSourceName="R_FRVFUND_BUDG_PRD_END_DATE")
		public NDate RFrvfundBudgPrdEndDate;
		@DbRecordField(dataSourceName="R_FTVFUND_FUND_CODE")
		public NString RFtvfundFundCode;
		@DbRecordField(dataSourceName="R_FTVFUND_TITLE")
		public NString RFtvfundTitle;
		@DbRecordField(dataSourceName="R_FTVFUND_TERM_DATE")
		public NDate RFtvfundTermDate;
		@DbRecordField(dataSourceName="R_FTVFUND_GRNT_CODE")
		public NString RFtvfundGrntCode;
		@DbRecordField(dataSourceName="R_FRBGRNT_TITLE")
		public NString RFrbgrntTitle;
		@DbRecordField(dataSourceName="R_FRBGRNT_PROJECT_START_DATE")
		public NDate RFrbgrntProjectStartDate;
		@DbRecordField(dataSourceName="R_FRBGRNT_PROJECT_END_DATE")
		public NDate RFrbgrntProjectEndDate;
		@DbRecordField(dataSourceName="R_FUND_GRNT_CODE")
		public NString RFundGrntCode;
		@DbRecordField(dataSourceName="R_FUND_GRNT_TITLE")
		public NString RFundGrntTitle;
		@DbRecordField(dataSourceName="R_FUND_GRNT_CODE_LABEL")
		public NString RFundGrntCodeLabel;
		@DbRecordField(dataSourceName="R_FUND_GRNT_START_DATE")
		public NDate RFundGrntStartDate;
		@DbRecordField(dataSourceName="R_FUND_GRNT_START_DATE_LABEL")
		public NString RFundGrntStartDateLabel;
		@DbRecordField(dataSourceName="R_FUND_GRNT_END_DATE")
		public NDate RFundGrntEndDate;
		@DbRecordField(dataSourceName="R_FUND_GRNT_END_DATE_LABEL")
		public NString RFundGrntEndDateLabel;
		@DbRecordField(dataSourceName="R_RECORD_EXISTS_IND")
		public NString RRecordExistsInd;
	}

	
	@DbRecordType(id="JlbdRectypeRow", dataSourceName="JLBD_RECTYPE")
	public static class JlbdRectypeRow
	{
		@DbRecordField(dataSourceName="R_JOB_LABOR_REC")
		public UnknownTypes.NbJobLaborJobLaborRec RJobLaborRec;
		@DbRecordField(dataSourceName="R_ENC_MULT_YR_IND")
		public NString REncMultYrInd;
		@DbRecordField(dataSourceName="R_FRINGE_ENCUMBRANCE_OLD")
		public NNumber RFringeEncumbranceOld;
		@DbRecordField(dataSourceName="R_FRINGE_ENC_TO_POST_OLD")
		public NNumber RFringeEncToPostOld;
		@DbRecordField(dataSourceName="R_FUTURE_FRINGE_ENC_OLD")
		public NNumber RFutureFringeEncOld;
		@DbRecordField(dataSourceName="R_FUTURE_FRG_ENC_TO_POST_OLD")
		public NNumber RFutureFrgEncToPostOld;
		@DbRecordField(dataSourceName="R_FUND_CODE_FRINGE_OLD")
		public NString RFundCodeFringeOld;
		@DbRecordField(dataSourceName="R_ORGN_CODE_FRINGE_OLD")
		public NString ROrgnCodeFringeOld;
		@DbRecordField(dataSourceName="R_ACCT_CODE_FRINGE_OLD")
		public NString RAcctCodeFringeOld;
		@DbRecordField(dataSourceName="R_PROG_CODE_FRINGE_OLD")
		public NString RProgCodeFringeOld;
		@DbRecordField(dataSourceName="R_ACTV_CODE_FRINGE_OLD")
		public NString RActvCodeFringeOld;
		@DbRecordField(dataSourceName="R_LOCN_CODE_FRINGE_OLD")
		public NString RLocnCodeFringeOld;
		@DbRecordField(dataSourceName="R_ENCD_NUM_FRINGE_OLD")
		public NString REncdNumFringeOld;
		@DbRecordField(dataSourceName="R_ENCD_SEQ_NUM_FRINGE_OLD")
		public NNumber REncdSeqNumFringeOld;
		@DbRecordField(dataSourceName="R_FRINGE_RATE")
		public NNumber RFringeRate;
		@DbRecordField(dataSourceName="R_INST_FRINGE_RATE")
		public NNumber RInstFringeRate;
		@DbRecordField(dataSourceName="R_RECORD_TYPE")
		public NString RRecordType;
		@DbRecordField(dataSourceName="R_FRINGE_BACKOUT_IND")
		public NString RFringeBackoutInd;
	}

	
	
}
