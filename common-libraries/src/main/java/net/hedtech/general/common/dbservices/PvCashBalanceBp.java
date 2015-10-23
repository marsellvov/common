package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvCashBalanceBp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CASH_BALANCE_BP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CASH_BALANCE_BP.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetPhrpensExists(NString pYear,NNumber pPayno,NString pPictCode,NNumber pSeqNo,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CASH_BALANCE_BP.F_GET_PHRPENS_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fGetServiceDate(NString pYear,NString pPictCode,NNumber pPayno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CASH_BALANCE_BP.F_GET_SERVICE_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static NString fIsequal(CashBalanceBpRecRow recOne,CashBalanceBpRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CASH_BALANCE_BP.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CashBalanceBpRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CashBalanceBpRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CASH_BALANCE_BP.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CASH_BALANCE_BP.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CASH_BALANCE_BP.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CASH_BALANCE_BP.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NString pFiscalYear,NString pReportNo,NString pSsn,NString pLastName,NString pFirstName,NString pMi,NNumber pEligibleGrossAmt,NNumber pEmplAmt,NNumber pEmprAmt,NString pCountyCode,NString pDistrictCode,NDate pServiceDate,NString pReportedData,NString pPhrpensExists,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CASH_BALANCE_BP.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_FISCAL_YEAR", pFiscalYear);
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_ELIGIBLE_GROSS_AMT", pEligibleGrossAmt);
			cmd.addParameter("@P_EMPL_AMT", pEmplAmt);
			cmd.addParameter("@P_EMPR_AMT", pEmprAmt);
			cmd.addParameter("@P_COUNTY_CODE", pCountyCode);
			cmd.addParameter("@P_DISTRICT_CODE", pDistrictCode);
			cmd.addParameter("@P_SERVICE_DATE", pServiceDate);
			cmd.addParameter("@P_REPORTED_DATA", pReportedData);
			cmd.addParameter("@P_PHRPENS_EXISTS", pPhrpensExists);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CASH_BALANCE_BP.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pGetDetails(NString pYear,NString pReportNumber,NDate pBeginDate,NDate pEndDate,NString pBdcaCode,NString pAcceptedData) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CASH_BALANCE_BP.P_GET_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_REPORT_NUMBER", pReportNumber);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_BDCA_CODE", pBdcaCode);
			cmd.addParameter("@P_ACCEPTED_DATA", pAcceptedData);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CASH_BALANCE_BP.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NString pFiscalYear,NString pReportNo,NString pSsn,NString pLastName,NString pFirstName,NString pMi,NNumber pEligibleGrossAmt,NNumber pEmplAmt,NNumber pEmprAmt,NString pCountyCode,NString pDistrictCode,NDate pServiceDate,NString pReportedData,NString pPhrpensExists,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CASH_BALANCE_BP.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_FISCAL_YEAR", pFiscalYear);
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_ELIGIBLE_GROSS_AMT", pEligibleGrossAmt);
			cmd.addParameter("@P_EMPL_AMT", pEmplAmt);
			cmd.addParameter("@P_EMPR_AMT", pEmprAmt);
			cmd.addParameter("@P_COUNTY_CODE", pCountyCode);
			cmd.addParameter("@P_DISTRICT_CODE", pDistrictCode);
			cmd.addParameter("@P_SERVICE_DATE", pServiceDate);
			cmd.addParameter("@P_REPORTED_DATA", pReportedData);
			cmd.addParameter("@P_PHRPENS_EXISTS", pPhrpensExists);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdatePvacbal(NNumber pPidm,NString pYear,NString pPictCode,NNumber pPayno,NNumber pSeqNo,NString pFiscalYear,NString pReportNo,NString pSsn,NString pLastName,NString pFirstName,NString pMi,NNumber pEligibleGrossAmt,NNumber pEmplAmt,NNumber pEmprAmt,NString pCountyCode,NString pDistrictCode,NDate pServiceDate,NString pReportedData,NString pPhrpensExists,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_CASH_BALANCE_BP.P_UPDATE_PVACBAL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_PAYNO", pPayno);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_FISCAL_YEAR", pFiscalYear);
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_SSN", pSsn);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_ELIGIBLE_GROSS_AMT", pEligibleGrossAmt);
			cmd.addParameter("@P_EMPL_AMT", pEmplAmt);
			cmd.addParameter("@P_EMPR_AMT", pEmprAmt);
			cmd.addParameter("@P_COUNTY_CODE", pCountyCode);
			cmd.addParameter("@P_DISTRICT_CODE", pDistrictCode);
			cmd.addParameter("@P_SERVICE_DATE", pServiceDate);
			cmd.addParameter("@P_REPORTED_DATA", pReportedData);
			cmd.addParameter("@P_PHRPENS_EXISTS", pPhrpensExists);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="CashBalanceBpRecRow", dataSourceName="CASH_BALANCE_BP_REC", needsInitialization=true)
	public static class CashBalanceBpRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_YEAR")
		public NString RYear;
		@DbRecordField(dataSourceName="R_PICT_CODE")
		public NString RPictCode;
		@DbRecordField(dataSourceName="R_PAYNO")
		public NNumber RPayno;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_FISCAL_YEAR")
		public NString RFiscalYear;
		@DbRecordField(dataSourceName="R_REPORT_NO")
		public NString RReportNo;
		@DbRecordField(dataSourceName="R_SSN")
		public NString RSsn;
		@DbRecordField(dataSourceName="R_LAST_NAME")
		public NString RLastName;
		@DbRecordField(dataSourceName="R_FIRST_NAME")
		public NString RFirstName;
		@DbRecordField(dataSourceName="R_MI")
		public NString RMi;
		@DbRecordField(dataSourceName="R_ELIGIBLE_GROSS_AMT")
		public NNumber REligibleGrossAmt;
		@DbRecordField(dataSourceName="R_EMPL_AMT")
		public NNumber REmplAmt;
		@DbRecordField(dataSourceName="R_EMPR_AMT")
		public NNumber REmprAmt;
		@DbRecordField(dataSourceName="R_COUNTY_CODE")
		public NString RCountyCode;
		@DbRecordField(dataSourceName="R_DISTRICT_CODE")
		public NString RDistrictCode;
		@DbRecordField(dataSourceName="R_SERVICE_DATE")
		public NDate RServiceDate;
		@DbRecordField(dataSourceName="R_REPORTED_DATA")
		public NString RReportedData;
		@DbRecordField(dataSourceName="R_PHRPENS_EXISTS")
		public NString RPhrpensExists;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
