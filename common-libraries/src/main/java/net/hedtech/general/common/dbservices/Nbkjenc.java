package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.Nokrecs.PtrbdplRectypeRow;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nbkjenc {
		public static void pCalcEncdNum(NString pCoasCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pJobsFiscCode,Ref<NString> pEncdNumOut,Ref<NNumber> pEncdSeqNumOut,Ref<NString> pEncdNewIndOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJENC.P_CALC_ENCD_NUM", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ENCD_NEW_IND_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pEncdNumOut.val = cmd.getParameterValue("@P_ENCD_NUM_OUT", NString.class);
			pEncdSeqNumOut.val = cmd.getParameterValue("@P_ENCD_SEQ_NUM_OUT", NNumber.class);
			pEncdNewIndOut.val = cmd.getParameterValue("@P_ENCD_NEW_IND_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pCalcSalaryEncumbrance(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NDate pFiscBeginDate,NDate pFiscEndDate,Ref<NNumber> pSalaryEncumbranceOut,Ref<NNumber> pFutureSalaryEncOut,Ref<NString> pWarningMsgOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJENC.P_CALC_SALARY_ENCUMBRANCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_FISC_BEGIN_DATE", pFiscBeginDate);
			cmd.addParameter("@P_FISC_END_DATE", pFiscEndDate);
			cmd.addParameter("@P_SALARY_ENCUMBRANCE_OUT", NNumber.class);
			cmd.addParameter("@P_FUTURE_SALARY_ENC_OUT", NNumber.class);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pSalaryEncumbranceOut.val = cmd.getParameterValue("@P_SALARY_ENCUMBRANCE_OUT", NNumber.class);
			pFutureSalaryEncOut.val = cmd.getParameterValue("@P_FUTURE_SALARY_ENC_OUT", NNumber.class);
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pCalcSalaryEncumbrance(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NDate pFiscBeginDate,NDate pFiscEndDate,NDate pRecastDate,NString pLiquidateInd,Ref<JlbdTabtypeRow> pJlbdTableInout,Ref<NNumber> pSalaryEncumbranceOut,Ref<NNumber> pFutureSalaryEncOut,Ref<NString> pWarningMsgOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJENC.P_CALC_SALARY_ENCUMBRANCE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_FISC_BEGIN_DATE", pFiscBeginDate);
			cmd.addParameter("@P_FISC_END_DATE", pFiscEndDate);
			cmd.addParameter("@P_RECAST_DATE", pRecastDate);
			cmd.addParameter("@P_LIQUIDATE_IND", pLiquidateInd);
			cmd.addParameter(DbTypes.getCollectionType("P_JLBD_TABLE_INOUT", pJlbdTableInout.val, JlbdTabtypeRow.class , true));
			cmd.addParameter("@P_SALARY_ENCUMBRANCE_OUT", NNumber.class);
			cmd.addParameter("@P_FUTURE_SALARY_ENC_OUT", NNumber.class);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pJlbdTableInout.val = cmd.getParameterValue("@P_JLBD_TABLE_INOUT", JlbdTabtypeRow.class); //TODO: REVER ISTO
			pSalaryEncumbranceOut.val = cmd.getParameterValue("@P_SALARY_ENCUMBRANCE_OUT", NNumber.class);
			pFutureSalaryEncOut.val = cmd.getParameterValue("@P_FUTURE_SALARY_ENC_OUT", NNumber.class);
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pCalcSalaryOldEnc(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NDate pFiscBeginDate,NDate pFiscEndDate,Ref<NNumber> pOldSalaryEncOut,Ref<NString> pWarningMsgOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJENC.P_CALC_SALARY_OLD_ENC", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_FISC_BEGIN_DATE", pFiscBeginDate);
			cmd.addParameter("@P_FISC_END_DATE", pFiscEndDate);
			cmd.addParameter("@P_OLD_SALARY_ENC_OUT", NNumber.class);
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pOldSalaryEncOut.val = cmd.getParameterValue("@P_OLD_SALARY_ENC_OUT", NNumber.class);
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
//		public static void pCalcSalaryOldEnc(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NDate pFiscBeginDate,NDate pFiscEndDate,Ref<List<JlbdTabtypeRow>> pJlbdTableInout,Ref<NNumber> pOldSalaryEncOut,Ref<NString> pWarningMsgOut,Ref<NString> pErrorMsgOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJENC.P_CALC_SALARY_OLD_ENC", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_POSN", pPosn);
//			cmd.addParameter("@P_SUFF", pSuff);
//			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
//			cmd.addParameter("@P_FISC_BEGIN_DATE", pFiscBeginDate);
//			cmd.addParameter("@P_FISC_END_DATE", pFiscEndDate);
//			cmd.addParameter(DbTypes.getTableType("P_JLBD_TABLE_INOUT", "", pJlbdTableInout.val, object.class , true));
//			cmd.addParameter("@P_OLD_SALARY_ENC_OUT", NNumber.class);
//			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
//			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
//				
//			cmd.execute();
//			pJlbdTableInout.val = cmd.getTableParameterValue("@P_JLBD_TABLE_INOUT", object.class);
//			pOldSalaryEncOut.val = cmd.getParameterValue("@P_OLD_SALARY_ENC_OUT", NNumber.class);
//			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);
//			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);
//
//
//		}
		
		public static void pCalcWeekdays(NDate pBeginDate,NDate pEndDate,Ref<NNumber> pWeekdaysOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NBKJENC.P_CALC_WEEKDAYS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_WEEKDAYS_OUT", NNumber.class);
				
			cmd.execute();
			pWeekdaysOut.val = cmd.getParameterValue("@P_WEEKDAYS_OUT", NNumber.class);


		}
		
	
	
	@DbRecordType(id="EncDetailRectypeRow", dataSourceName="ENC_DETAIL_RECTYPE")
	public static class EncDetailRectypeRow
	{
		@DbRecordField(dataSourceName="R_ENC_BEGIN_DATE")
		public NDate REncBeginDate;
		@DbRecordField(dataSourceName="R_ENC_END_DATE")
		public NDate REncEndDate;
		@DbRecordField(dataSourceName="R_END_DATE_REASON")
		public NString REndDateReason;
		@DbRecordField(dataSourceName="R_SALARY_ENCUMBRANCE")
		public NNumber RSalaryEncumbrance;
		@DbRecordField(dataSourceName="R_FUTURE_SALARY_ENC")
		public NNumber RFutureSalaryEnc;
	}

	
	@DbRecordType(id="JlbdRectypeRow", dataSourceName="JLBD_RECTYPE")
	public static class JlbdRectypeRow
	{
		@DbRecordField(dataSourceName="R_JLBD_ROWID")
		public NString RJlbdRowid;
		@DbRecordField(dataSourceName="R_EFFECTIVE_DATE")
		public NDate REffectiveDate;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_PERCENT")
		public NNumber RPercent;
		@DbRecordField(dataSourceName="R_ENC_OVERRIDE_END_DATE")
		public NDate REncOverrideEndDate;
		@DbRecordField(dataSourceName="R_ENC_MULT_YR_IND")
		public NString REncMultYrInd;
		@DbRecordField(dataSourceName="R_BUDGET_END_DATE")
		public NDate RBudgetEndDate;
		@DbRecordField(dataSourceName="R_PROJECT_END_DATE")
		public NDate RProjectEndDate;
		@DbRecordField(dataSourceName="R_FUND_TERM_DATE")
		public NDate RFundTermDate;
		@DbRecordField(dataSourceName="R_SALARY_ENCUMBRANCE")
		public NNumber RSalaryEncumbrance;
		@DbRecordField(dataSourceName="R_FUTURE_SALARY_ENC")
		public NNumber RFutureSalaryEnc;
		@DbRecordField(dataSourceName="R_ENC_DETAIL_TABLE")
		public EncDetailTabtype REncDetailTable;
	}

	@DbTableType(id="Nbkjenc.JlbdTabtypeRow", dataSourceName="NBKJENC.JLBD_TABTYPE", indexed=true)
	public static class JlbdTabtypeRow extends Table<JlbdRectypeRow> {}
	
	@DbTableType(id="Nbkjenc.EncDetailTabtype", dataSourceName="NBKJENC.ENC_DETAIL_TABTYPE", indexed=true)
	public static class EncDetailTabtype extends Table<EncDetailRectypeRow> {}
	
}
