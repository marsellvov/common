package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvStrsPensionTemp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_STRS_PENSION_TEMP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_STRS_PENSION_TEMP.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(StrsPensionTempRecRow recOne,StrsPensionTempRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_STRS_PENSION_TEMP.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, StrsPensionTempRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, StrsPensionTempRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NNumber pPidm,NString pBdcaCode,NNumber pEmplContRate,NNumber pEmprContRate,NString pPosn,NString pSuff,NString pGroup,NNumber pEligibleGrs,NNumber pPayRate,NString pPayCode,NString pContCode,NNumber pCalcEmplAmt,NNumber pCalcEmprAmt,NNumber pPensHours,NNumber pCalcFte,NString pUserid,NString pReportInd,NString pRetroPrevFiscInd,NString pPretaxInd,NDate pServiceBeginDate,NDate pServiceEndDate,NString pSclsCode,NNumber pSclsBaseHrs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_STRS_PENSION_TEMP.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
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

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_STRS_PENSION_TEMP.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NNumber pPidm,NString pBdcaCode,NNumber pEmplContRate,NNumber pEmprContRate,NString pPosn,NString pSuff,NString pGroup,NNumber pEligibleGrs,NNumber pPayRate,NString pPayCode,NString pContCode,NNumber pCalcEmplAmt,NNumber pCalcEmprAmt,NNumber pPensHours,NNumber pCalcFte,NString pUserid,NString pReportInd,NString pRetroPrevFiscInd,NString pPretaxInd,NDate pServiceBeginDate,NDate pServiceEndDate,NString pSclsCode,NNumber pSclsBaseHrs) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_STRS_PENSION_TEMP.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
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

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NNumber pPidm,NString pBdcaCode,NNumber pEmplContRate,NNumber pEmprContRate,NString pPosn,NString pSuff,NString pGroup,NNumber pEligibleGrs,NNumber pPayRate,NString pPayCode,NString pContCode,NNumber pCalcEmplAmt,NNumber pCalcEmprAmt,NNumber pPensHours,NNumber pCalcFte,NString pUserid,NString pReportInd,NString pRetroPrevFiscInd,NString pPretaxInd,NDate pServiceBeginDate,NDate pServiceEndDate,NString pSclsCode,NNumber pSclsBaseHrs,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_STRS_PENSION_TEMP.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NNumber pPidm,NString pBdcaCode,NNumber pEmplContRate,NNumber pEmprContRate,NString pPosn,NString pSuff,NString pGroup,NNumber pEligibleGrs,NNumber pPayRate,NString pPayCode,NString pContCode,NNumber pCalcEmplAmt,NNumber pCalcEmprAmt,NNumber pPensHours,NNumber pCalcFte,NString pUserid,NString pReportInd,NString pRetroPrevFiscInd,NString pPretaxInd,NDate pServiceBeginDate,NDate pServiceEndDate,NString pSclsCode,NNumber pSclsBaseHrs,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_STRS_PENSION_TEMP.P_CREATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NNumber pPidm,NString pBdcaCode,NNumber pEmplContRate,NNumber pEmprContRate,NString pPosn,NString pSuff,NString pGroup,NNumber pEligibleGrs,NNumber pPayRate,NString pPayCode,NString pContCode,NNumber pCalcEmplAmt,NNumber pCalcEmprAmt,NNumber pPensHours,NNumber pCalcFte,NString pUserid,NString pReportInd,NString pRetroPrevFiscInd,NString pPretaxInd,NDate pServiceBeginDate,NDate pServiceEndDate,NString pSclsCode,NNumber pSclsBaseHrs,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_STRS_PENSION_TEMP.P_DELETE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_STRS_PENSION_TEMP.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NNumber pPidm,NString pBdcaCode,NNumber pEmplContRate,NNumber pEmprContRate,NString pPosn,NString pSuff,NString pGroup,NNumber pEligibleGrs,NNumber pPayRate,NString pPayCode,NString pContCode,NNumber pCalcEmplAmt,NNumber pCalcEmprAmt,NNumber pPensHours,NNumber pCalcFte,NString pUserid,NString pReportInd,NString pRetroPrevFiscInd,NString pPretaxInd,NDate pServiceBeginDate,NDate pServiceEndDate,NString pSclsCode,NNumber pSclsBaseHrs,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_STRS_PENSION_TEMP.P_UPDATE", DbManager.getDataBaseFactory());
			
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
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="StrsPensionTempRecRow", dataSourceName="STRS_PENSION_TEMP_REC", needsInitialization=true)
	public static class StrsPensionTempRecRow
	{
		@DbRecordField(dataSourceName="R_YEAR")
		public NString RYear;
		@DbRecordField(dataSourceName="R_PICT_CODE")
		public NString RPictCode;
		@DbRecordField(dataSourceName="R_PAYNO")
		public NNumber RPayno;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_BDCA_CODE")
		public NString RBdcaCode;
		@DbRecordField(dataSourceName="R_EMPL_CONT_RATE")
		public NNumber REmplContRate;
		@DbRecordField(dataSourceName="R_EMPR_CONT_RATE")
		public NNumber REmprContRate;
		@DbRecordField(dataSourceName="R_POSN")
		public NString RPosn;
		@DbRecordField(dataSourceName="R_SUFF")
		public NString RSuff;
		@DbRecordField(dataSourceName="R_GROUP")
		public NString RGroup;
		@DbRecordField(dataSourceName="R_ELIGIBLE_GRS")
		public NNumber REligibleGrs;
		@DbRecordField(dataSourceName="R_PAY_RATE")
		public NNumber RPayRate;
		@DbRecordField(dataSourceName="R_PAY_CODE")
		public NString RPayCode;
		@DbRecordField(dataSourceName="R_CONT_CODE")
		public NString RContCode;
		@DbRecordField(dataSourceName="R_CALC_EMPL_AMT")
		public NNumber RCalcEmplAmt;
		@DbRecordField(dataSourceName="R_CALC_EMPR_AMT")
		public NNumber RCalcEmprAmt;
		@DbRecordField(dataSourceName="R_PENS_HOURS")
		public NNumber RPensHours;
		@DbRecordField(dataSourceName="R_CALC_FTE")
		public NNumber RCalcFte;
		@DbRecordField(dataSourceName="R_USERID")
		public NString RUserid;
		@DbRecordField(dataSourceName="R_REPORT_IND")
		public NString RReportInd;
		@DbRecordField(dataSourceName="R_RETRO_PREV_FISC_IND")
		public NString RRetroPrevFiscInd;
		@DbRecordField(dataSourceName="R_PRETAX_IND")
		public NString RPretaxInd;
		@DbRecordField(dataSourceName="R_SERVICE_BEGIN_DATE")
		public NDate RServiceBeginDate;
		@DbRecordField(dataSourceName="R_SERVICE_END_DATE")
		public NDate RServiceEndDate;
		@DbRecordField(dataSourceName="R_SCLS_CODE")
		public NString RSclsCode;
		@DbRecordField(dataSourceName="R_SCLS_BASE_HRS")
		public NNumber RSclsBaseHrs;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
