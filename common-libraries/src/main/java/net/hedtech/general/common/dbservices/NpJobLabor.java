package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.Nokepaf.FieldRectypeRow;
import net.hedtech.general.common.dbservices.NpJobEarnings.JobEarningsRecRow;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class NpJobLabor {
		public static NString fExists(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_LABOR.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(NbJobLabor.JobLaborRecRow recOne,NbJobLabor.JobLaborRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_LABOR.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, NbJobLabor.JobLaborRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, NbJobLabor.JobLaborRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pChangeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_LABOR.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_CHANGE_IND", pChangeInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByDate(NNumber pPidm,NString pPosn,NString pSuff,NDate pQueryDate,NString pChangeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_LABOR.F_QUERY_BY_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_QUERY_DATE", pQueryDate);
			cmd.addParameter("@P_CHANGE_IND", pChangeInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_LABOR.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static NDate fQueryLastEffectiveDate(NNumber pPidm,NString pPosn,NString pSuff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_LABOR.F_QUERY_LAST_EFFECTIVE_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pCoasCode,NString pAcciCode,NString pFundCode,NString pOrgnCode,NString pAcctCode,NString pProgCode,NString pActvCode,NString pLocnCode,NString pProjCode,NString pCtypCode,NString pAcctCodeExternal,NNumber pPercent,NString pEncdNum,NNumber pEncdSeqNum,NNumber pSalaryEncumbrance,NNumber pSalaryEncToPost,NNumber pFringeEncumbrance,NNumber pFringeEncToPost,NString pFundCodeFringe,NString pOrgnCodeFringe,NString pAcctCodeFringe,NString pProgCodeFringe,NString pActvCodeFringe,NString pLocnCodeFringe,NString pChangeInd,NNumber pFringeResidual,NNumber pFringeResToPost,NString pUserId,NString pDataOrigin,NNumber pFutureSalaryEnc,NNumber pFutureFringeEnc,NNumber pFutureFringeResidual,NNumber pFutureSalEncToPost,NNumber pFutureFrgEncToPost,NNumber pFutureFrgResToPost,NDate pEncOverrideEndDate,NDate pEncLastRecastDate,NDate pEncLastCalcDate,NString pEncdNumFringe,NNumber pEncdSeqNumFringe) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_LABOR.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
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
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_LABOR.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static JobLaborTabRow fUnspecifiedLaborTable() {  //ALTERADO de List para Classe only
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_LABOR.F_UNSPECIFIED_LABOR_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.getCollectionType(JobLaborTabRow.class));
				
			cmd.execute();

			return cmd.getReturnValue(JobLaborTabRow.class);

		}
		
		public static void pCopyForward(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pUserId,NString pDataOrigin,NString pChangeReason,Ref<NString> pWarningsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_LABOR.P_COPY_FORWARD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_CHANGE_REASON", pChangeReason);
			cmd.addParameter("@P_WARNINGS_OUT", NString.class);
				
			cmd.execute();
			pWarningsOut.val = cmd.getParameterValue("@P_WARNINGS_OUT", NString.class);


		}
		
		public static void pCreate(Ref<List<JobLaborTabRow>> pJobLaborTab,NString pChangeReason,Ref<NString> pWarningsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_LABOR.P_CREATE", DbManager.getDataBaseFactory());
			
			// cmd.addParameter(DbTypes.getTableType("P_JOB_LABOR_TAB", "", pJobLaborTab.val, object.class , true));
			cmd.addParameter("@P_CHANGE_REASON", pChangeReason);
			cmd.addParameter("@P_WARNINGS_OUT", NString.class);
				
			cmd.execute();
			// pJobLaborTab.val = cmd.getTableParameterValue("@P_JOB_LABOR_TAB", object.class);
			pWarningsOut.val = cmd.getParameterValue("@P_WARNINGS_OUT", NString.class);


		}
		
		
		public static void pDelete(NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pUserId,NString pDataOrigin,Ref<NString> pWarningsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_LABOR.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_WARNINGS_OUT", NString.class, true);
				
			cmd.execute();
			pWarningsOut.val = cmd.getParameterValue("@P_WARNINGS_OUT", NString.class);


		}
		
		public static void pGetPlbdTable(NString pPosn,NString pCurrentFiscCode,NString pJobsFiscCode,NString pPtotStatus,Ref<NbrplbdTabtypeRow> pNbrplbdTableOut,Ref<NString> pWarningMsgOut,Ref<NString> pErrorMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_LABOR.P_GET_PLBD_TABLE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_CURRENT_FISC_CODE", pCurrentFiscCode);
			cmd.addParameter("@P_JOBS_FISC_CODE", pJobsFiscCode);
			cmd.addParameter("@P_PTOT_STATUS", pPtotStatus);
			cmd.addParameter(DbTypes.getCollectionType("P_NBRPLBD_TABLE_OUT", pNbrplbdTableOut.val, NbrplbdTabtypeRow.class , true));
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
			cmd.addParameter("@P_ERROR_MSG_OUT", NString.class);
				
			cmd.execute();
			pNbrplbdTableOut.val = cmd.getParameterValue("P_NBRPLBD_TABLE_OUT", NbrplbdTabtypeRow.class);
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);
			pErrorMsgOut.val = cmd.getParameterValue("@P_ERROR_MSG_OUT", NString.class);


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_LABOR.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(Ref<JobLaborTabRow> pJobLaborTab,NString pChangeReason,Ref<NString> pWarningsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_LABOR.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter(DbTypes.getCollectionType("P_JOB_LABOR_TAB", pJobLaborTab.val, JobLaborTabRow.class , true));
			cmd.addParameter("@P_CHANGE_REASON", pChangeReason);
			cmd.addParameter("@P_WARNINGS_OUT", NString.class);
				
			cmd.execute();
			pJobLaborTab.val = cmd.getParameterValue("P_JOB_LABOR_TAB", JobLaborTabRow.class);
			pWarningsOut.val = cmd.getParameterValue("@P_WARNINGS_OUT", NString.class);


		}
		
//		public static void pUpdate(Ref<List<JobLaborEncTabRow>> pJobLaborTab,NString pChangeReason,Ref<NString> pWarningsOut) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NP_JOB_LABOR.P_UPDATE", DbManager.getDataBaseFactory());
//			
//			// cmd.addParameter(DbTypes.getTableType("P_JOB_LABOR_TAB", "", pJobLaborTab.val, object.class , true));
//			cmd.addParameter("@P_CHANGE_REASON", pChangeReason);
//			cmd.addParameter("@P_WARNINGS_OUT", NString.class);
//				
//			cmd.execute();
//			// pJobLaborTab.val = cmd.getTableParameterValue("@P_JOB_LABOR_TAB", object.class);
//			pWarningsOut.val = cmd.getParameterValue("@P_WARNINGS_OUT", NString.class);
//
//
//		}
		
	
	
	@DbRecordType(id="JobLaborEncRecRow", dataSourceName="JOB_LABOR_ENC_REC")
	public static class JobLaborEncRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_POSN")
		public NString RPosn;
		@DbRecordField(dataSourceName="R_SUFF")
		public NString RSuff;
		@DbRecordField(dataSourceName="R_EFFECTIVE_DATE")
		public NDate REffectiveDate;
		@DbRecordField(dataSourceName="R_COAS_CODE")
		public NString RCoasCode;
		@DbRecordField(dataSourceName="R_ACCI_CODE")
		public NString RAcciCode;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_ORGN_CODE")
		public NString ROrgnCode;
		@DbRecordField(dataSourceName="R_ACCT_CODE")
		public NString RAcctCode;
		@DbRecordField(dataSourceName="R_PROG_CODE")
		public NString RProgCode;
		@DbRecordField(dataSourceName="R_ACTV_CODE")
		public NString RActvCode;
		@DbRecordField(dataSourceName="R_LOCN_CODE")
		public NString RLocnCode;
		@DbRecordField(dataSourceName="R_PROJ_CODE")
		public NString RProjCode;
		@DbRecordField(dataSourceName="R_CTYP_CODE")
		public NString RCtypCode;
		@DbRecordField(dataSourceName="R_ACCT_CODE_EXTERNAL")
		public NString RAcctCodeExternal;
		@DbRecordField(dataSourceName="R_PERCENT")
		public NNumber RPercent;
		@DbRecordField(dataSourceName="R_ENCD_NUM")
		public NString REncdNum;
		@DbRecordField(dataSourceName="R_ENCD_SEQ_NUM")
		public NNumber REncdSeqNum;
		@DbRecordField(dataSourceName="R_SALARY_ENCUMBRANCE")
		public NNumber RSalaryEncumbrance;
		@DbRecordField(dataSourceName="R_SALARY_ENC_TO_POST")
		public NNumber RSalaryEncToPost;
		@DbRecordField(dataSourceName="R_FRINGE_ENCUMBRANCE")
		public NNumber RFringeEncumbrance;
		@DbRecordField(dataSourceName="R_FRINGE_ENC_TO_POST")
		public NNumber RFringeEncToPost;
		@DbRecordField(dataSourceName="R_FUND_CODE_FRINGE")
		public NString RFundCodeFringe;
		@DbRecordField(dataSourceName="R_ORGN_CODE_FRINGE")
		public NString ROrgnCodeFringe;
		@DbRecordField(dataSourceName="R_ACCT_CODE_FRINGE")
		public NString RAcctCodeFringe;
		@DbRecordField(dataSourceName="R_PROG_CODE_FRINGE")
		public NString RProgCodeFringe;
		@DbRecordField(dataSourceName="R_ACTV_CODE_FRINGE")
		public NString RActvCodeFringe;
		@DbRecordField(dataSourceName="R_LOCN_CODE_FRINGE")
		public NString RLocnCodeFringe;
		@DbRecordField(dataSourceName="R_CHANGE_IND")
		public NString RChangeInd;
		@DbRecordField(dataSourceName="R_FRINGE_RESIDUAL")
		public NNumber RFringeResidual;
		@DbRecordField(dataSourceName="R_FRINGE_RES_TO_POST")
		public NNumber RFringeResToPost;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_FUTURE_SALARY_ENC")
		public NNumber RFutureSalaryEnc;
		@DbRecordField(dataSourceName="R_FUTURE_FRINGE_ENC")
		public NNumber RFutureFringeEnc;
		@DbRecordField(dataSourceName="R_FUTURE_FRINGE_RESIDUAL")
		public NNumber RFutureFringeResidual;
		@DbRecordField(dataSourceName="R_FUTURE_SAL_ENC_TO_POST")
		public NNumber RFutureSalEncToPost;
		@DbRecordField(dataSourceName="R_FUTURE_FRG_ENC_TO_POST")
		public NNumber RFutureFrgEncToPost;
		@DbRecordField(dataSourceName="R_FUTURE_FRG_RES_TO_POST")
		public NNumber RFutureFrgResToPost;
		@DbRecordField(dataSourceName="R_ENC_OVERRIDE_END_DATE")
		public NDate REncOverrideEndDate;
		@DbRecordField(dataSourceName="R_ENC_LAST_RECAST_DATE")
		public NDate REncLastRecastDate;
		@DbRecordField(dataSourceName="R_ENC_LAST_CALC_DATE")
		public NDate REncLastCalcDate;
		@DbRecordField(dataSourceName="R_JOB_END_DATE")
		public NDate RJobEndDate;
		@DbRecordField(dataSourceName="R_CONTRACT_BEGIN_DATE")
		public NDate RContractBeginDate;
		@DbRecordField(dataSourceName="R_CONTRACT_END_DATE")
		public NDate RContractEndDate;
		@DbRecordField(dataSourceName="R_GRNT_BUD_END_DATE")
		public NDate RGrntBudEndDate;
		@DbRecordField(dataSourceName="R_FUND_TERM_DATE")
		public NDate RFundTermDate;
		@DbRecordField(dataSourceName="R_JOB_LABOR_ENCUMB_TAB")
		public UnknownTypes.NbJobEncHistoryJobEncHistoryTab RJobLaborEncumbTab;
		@DbRecordField(dataSourceName="R_ENCD_NUM_FRINGE")
		public NString REncdNumFringe;
		@DbRecordField(dataSourceName="R_ENCD_SEQ_NUM_FRINGE")
		public NNumber REncdSeqNumFringe;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	@DbRecordType(id="JobLaborRecRow", dataSourceName="NP_JOB_LABOR.JOB_LABOR_REC")
	public static class JobLaborRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_POSN")
		public NString RPosn;
		@DbRecordField(dataSourceName="R_SUFF")
		public NString RSuff;
		@DbRecordField(dataSourceName="R_EFFECTIVE_DATE")
		public NDate REffectiveDate;
		@DbRecordField(dataSourceName="R_COAS_CODE")
		public NString RCoasCode;
		@DbRecordField(dataSourceName="R_ACCI_CODE")
		public NString RAcciCode;
		@DbRecordField(dataSourceName="R_FUND_CODE")
		public NString RFundCode;
		@DbRecordField(dataSourceName="R_ORGN_CODE")
		public NString ROrgnCode;
		@DbRecordField(dataSourceName="R_ACCT_CODE")
		public NString RAcctCode;
		@DbRecordField(dataSourceName="R_PROG_CODE")
		public NString RProgCode;
		@DbRecordField(dataSourceName="R_ACTV_CODE")
		public NString RActvCode;
		@DbRecordField(dataSourceName="R_LOCN_CODE")
		public NString RLocnCode;
		@DbRecordField(dataSourceName="R_PROJ_CODE")
		public NString RProjCode;
		@DbRecordField(dataSourceName="R_CTYP_CODE")
		public NString RCtypCode;
		@DbRecordField(dataSourceName="R_ACCT_CODE_EXTERNAL")
		public NString RAcctCodeExternal;
		@DbRecordField(dataSourceName="R_PERCENT")
		public NNumber RPercent;
		@DbRecordField(dataSourceName="R_ENCD_NUM")
		public NString REncdNum;
		@DbRecordField(dataSourceName="R_ENCD_SEQ_NUM")
		public NNumber REncdSeqNum;
		@DbRecordField(dataSourceName="R_SALARY_ENCUMBRANCE")
		public NNumber RSalaryEncumbrance;
		@DbRecordField(dataSourceName="R_SALARY_ENC_TO_POST")
		public NNumber RSalaryEncToPost;
		@DbRecordField(dataSourceName="R_FRINGE_ENCUMBRANCE")
		public NNumber RFringeEncumbrance;
		@DbRecordField(dataSourceName="R_FRINGE_ENC_TO_POST")
		public NNumber RFringeEncToPost;
		@DbRecordField(dataSourceName="R_FUND_CODE_FRINGE")
		public NString RFundCodeFringe;
		@DbRecordField(dataSourceName="R_ORGN_CODE_FRINGE")
		public NString ROrgnCodeFringe;
		@DbRecordField(dataSourceName="R_ACCT_CODE_FRINGE")
		public NString RAcctCodeFringe;
		@DbRecordField(dataSourceName="R_PROG_CODE_FRINGE")
		public NString RProgCodeFringe;
		@DbRecordField(dataSourceName="R_ACTV_CODE_FRINGE")
		public NString RActvCodeFringe;
		@DbRecordField(dataSourceName="R_LOCN_CODE_FRINGE")
		public NString RLocnCodeFringe;
		@DbRecordField(dataSourceName="R_CHANGE_IND")
		public NString RChangeInd;
		@DbRecordField(dataSourceName="R_FRINGE_RESIDUAL")
		public NNumber RFringeResidual;
		@DbRecordField(dataSourceName="R_FRINGE_RES_TO_POST")
		public NNumber RFringeResToPost;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_FUTURE_SALARY_ENC")
		public NNumber RFutureSalaryEnc;
		@DbRecordField(dataSourceName="R_FUTURE_FRINGE_ENC")
		public NNumber RFutureFringeEnc;
		@DbRecordField(dataSourceName="R_FUTURE_FRINGE_RESIDUAL")
		public NNumber RFutureFringeResidual;
		@DbRecordField(dataSourceName="R_FUTURE_SAL_ENC_TO_POST")
		public NNumber RFutureSalEncToPost;
		@DbRecordField(dataSourceName="R_FUTURE_FRG_ENC_TO_POST")
		public NNumber RFutureFrgEncToPost;
		@DbRecordField(dataSourceName="R_FUTURE_FRG_RES_TO_POST")
		public NNumber RFutureFrgResToPost;
		@DbRecordField(dataSourceName="R_ENC_OVERRIDE_END_DATE")
		public NDate REncOverrideEndDate;
		@DbRecordField(dataSourceName="R_ENC_LAST_RECAST_DATE")
		public NDate REncLastRecastDate;
		@DbRecordField(dataSourceName="R_ENC_LAST_CALC_DATE")
		public NDate REncLastCalcDate;
		@DbRecordField(dataSourceName="R_JOB_END_DATE")
		public NDate RJobEndDate;
		@DbRecordField(dataSourceName="R_CONTRACT_BEGIN_DATE")
		public NDate RContractBeginDate;
		@DbRecordField(dataSourceName="R_CONTRACT_END_DATE")
		public NDate RContractEndDate;
		@DbRecordField(dataSourceName="R_GRNT_BUD_END_DATE")
		public NDate RGrntBudEndDate;
		@DbRecordField(dataSourceName="R_FUND_TERM_DATE")
		public NDate RFundTermDate;
		@DbRecordField(dataSourceName="R_ENCD_NUM_FRINGE")
		public NString REncdNumFringe;
		@DbRecordField(dataSourceName="R_ENCD_SEQ_NUM_FRINGE")
		public NNumber REncdSeqNumFringe;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}
	
	@DbRecordType(id="NbrplbdTableRow")
	public static class NbrplbdTabType 
	{
		@DbRecordField(dataSourceName="NBRPLBD_POSN")
		public NString NbrplbdPosn;
		@DbRecordField(dataSourceName="NBRPLBD_FISC_CODE")
		public NString NbrplbdFiscCode;
		@DbRecordField(dataSourceName="NBRPLBD_COAS_CODE")
		public NString NbrplbdCoasCode;
		@DbRecordField(dataSourceName="NBRPLBD_ACCI_CODE")
		public NString NbrplbdAcciCode;
		@DbRecordField(dataSourceName="NBRPLBD_FUND_CODE")
		public NString NbrplbdFundCode;
		@DbRecordField(dataSourceName="NBRPLBD_ORGN_CODE")
		public NString NbrplbdOrgnCode;
		@DbRecordField(dataSourceName="NBRPLBD_ACCT_CODE")
		public NString NbrplbdAcctCode;
		@DbRecordField(dataSourceName="NBRPLBD_PROG_CODE")
		public NString NbrplbdProgCode;
		@DbRecordField(dataSourceName="NBRPLBD_ACTV_CODE")
		public NString NbrplbdActvCode;
		@DbRecordField(dataSourceName="NBRPLBD_LOCN_CODE")
		public NString NbrplbdLocnCode;
		@DbRecordField(dataSourceName="NBRPLBD_ACCT_CODE_EXTERNAL")
		public NString NbrplbdAcctCodeExternal;
		@DbRecordField(dataSourceName="NBRPLBD_PERCENT")
		public NNumber NbrplbdPercent;
		@DbRecordField(dataSourceName="NBRPLBD_ACTIVITY_DATE")
		public NDate NbrplbdActivityDate;
		@DbRecordField(dataSourceName="NBRPLBD_OBUD_CODE")
		public NString NbrplbdObudCode;
		@DbRecordField(dataSourceName="NBRPLBD_OBPH_CODE")
		public NString NbrplbdObphCode;
		@DbRecordField(dataSourceName="NBRPLBD_CHANGE_IND")
		public NString NbrplbdChangeInd;
		@DbRecordField(dataSourceName="NBRPLBD_PROJ_CODE")
		public NString NbrplbdProjCode;
		@DbRecordField(dataSourceName="NBRPLBD_CTYP_CODE")
		public NString NbrplbdCtypCode;
		@DbRecordField(dataSourceName="NBRPLBD_BUDGET")
		public NNumber NbrplbdBudget;
		@DbRecordField(dataSourceName="NBRPLBD_BUDGET_TO_POST")
		public NNumber NbrplbdBudgetToPost;
		@DbRecordField(dataSourceName="NBRPLBD_SURROGATE_ID")
		public NNumber NbrplbdSurrogateId;
		@DbRecordField(dataSourceName="NBRPLBD_VERSION")
		public NNumber NbrplbdVersion;
		@DbRecordField(dataSourceName="NBRPLBD_USER_ID")
		public NString NbrplbdUserId;
		@DbRecordField(dataSourceName="NBRPLBD_DATA_ORIGIN")
		public NString NbrplbdDataOrigin;
		@DbRecordField(dataSourceName="NBRPLBD_VPDI_CODE")
		public NString NbrplbdVpdiCode;
	}
	
	@DbTableType(id = "NpJobLabor.JobLaborTabRow", dataSourceName = "NP_JOB_LABOR.JOB_LABOR_TAB", indexed = true)
	public static class JobLaborTabRow extends Table<JobLaborRecRow> {
		@Override
		protected JobLaborRecRow newValue(){
			return new JobLaborRecRow();
		}
	}
	
	
	@DbRecordType(id="NbrplbdTableRow", dataSourceName="NP_JOB_LABOR.NBRPLBD%ROWTYPE")
	public static class NbrplbdTableRow
	    {
			@DbRecordField(dataSourceName="NBRPLBD_POSN")
			public NString NbrplbdPosn;
			@DbRecordField(dataSourceName="NBRPLBD_FISC_CODE")
			public NString NbrplbdFiscCode;
			@DbRecordField(dataSourceName="NBRPLBD_COAS_CODE")
			public NString NbrplbdCoasCode;
			@DbRecordField(dataSourceName="NBRPLBD_ACCI_CODE")
			public NString NbrplbdAcciCode;
			@DbRecordField(dataSourceName="NBRPLBD_FUND_CODE")
			public NString NbrplbdFundCode;
			@DbRecordField(dataSourceName="NBRPLBD_ORGN_CODE")
			public NString NbrplbdOrgnCode;
			@DbRecordField(dataSourceName="NBRPLBD_ACCT_CODE")
			public NString NbrplbdAcctCode;
			@DbRecordField(dataSourceName="NBRPLBD_PROG_CODE")
			public NString NbrplbdProgCode;
			@DbRecordField(dataSourceName="NBRPLBD_ACTV_CODE")
			public NString NbrplbdActvCode;
			@DbRecordField(dataSourceName="NBRPLBD_LOCN_CODE")
			public NString NbrplbdLocnCode;
			@DbRecordField(dataSourceName="NBRPLBD_ACCT_CODE_EXTERNAL")
			public NString NbrplbdAcctCodeExternal;
			@DbRecordField(dataSourceName="NBRPLBD_PERCENT")
			public NNumber NbrplbdPercent;
			@DbRecordField(dataSourceName="NBRPLBD_ACTIVITY_DATE")
			public NDate NbrplbdActivityDate;
			@DbRecordField(dataSourceName="NBRPLBD_OBUD_CODE")
			public NString NbrplbdObudCode;
			@DbRecordField(dataSourceName="NBRPLBD_OBPH_CODE")
			public NString NbrplbdObphCode;
			@DbRecordField(dataSourceName="NBRPLBD_CHANGE_IND")
			public NString NbrplbdChangeInd;
			@DbRecordField(dataSourceName="NBRPLBD_PROJ_CODE")
			public NString NbrplbdProjCode;
			@DbRecordField(dataSourceName="NBRPLBD_CTYP_CODE")
			public NString NbrplbdCtypCode;
			@DbRecordField(dataSourceName="NBRPLBD_BUDGET")
			public NNumber NbrplbdBudget;
			@DbRecordField(dataSourceName="NBRPLBD_BUDGET_TO_POST")
			public NNumber NbrplbdBudgetToPost;
			@DbRecordField(dataSourceName="NBRPLBD_SURROGATE_ID")
			public NNumber NbrplbdSurrogateId;
			@DbRecordField(dataSourceName="NBRPLBD_VERSION")
			public NNumber NbrplbdVersion;
			@DbRecordField(dataSourceName="NBRPLBD_USER_ID")
			public NString NbrplbdUserId;
			@DbRecordField(dataSourceName="NBRPLBD_DATA_ORIGIN")
			public NString NbrplbdDataOrigin;
			@DbRecordField(dataSourceName="NBRPLBD_VPDI_CODE")
			public NString NbrplbdVpdiCode;
	    }
	          
	
	// table of indexed by -&gt; needsInitialization=false
		@DbTableType(id="NbrplbdTabtypeRow", dataSourceName="np_job_labor.nbrplbd_tabtype", indexed=true)
		public static class NbrplbdTabtypeRow extends Table<NbrplbdTableRow> {
		}
}
