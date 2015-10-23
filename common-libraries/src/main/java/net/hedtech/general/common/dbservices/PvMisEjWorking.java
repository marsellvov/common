package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvMisEjWorking {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EJ_WORKING.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pReportNo,NNumber pPidm,NString pPosn,NString pSuff,NString pTermCode,NString pCrn,NString pCategory,NString pMasaCode,NString pSourceType,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EJ_WORKING.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_MASA_CODE", pMasaCode);
			cmd.addParameter("@P_SOURCE_TYPE", pSourceType);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(MisEjWorkingRecRow recOne,MisEjWorkingRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EJ_WORKING.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, MisEjWorkingRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, MisEjWorkingRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pReportNo,NNumber pPidm,NString pPosn,NString pSuff,NString pTermCode,NString pCrn,NString pCategory,NString pMasaCode,NString pSourceType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EJ_WORKING.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_MASA_CODE", pMasaCode);
			cmd.addParameter("@P_SOURCE_TYPE", pSourceType);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EJ_WORKING.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pReportNo,NNumber pPidm,NString pPosn,NString pSuff,NString pTermCode,NString pCrn,NString pCategory,NString pMasaCode,NString pSourceType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EJ_WORKING.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_MASA_CODE", pMasaCode);
			cmd.addParameter("@P_SOURCE_TYPE", pSourceType);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pReportNo,NNumber pPidm,NString pPosn,NString pSuff,NString pTermCode,NString pCrn,NString pCategory,NString pMasaCode,NString pSourceType,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EJ_WORKING.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_MASA_CODE", pMasaCode);
			cmd.addParameter("@P_SOURCE_TYPE", pSourceType);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pReportNo,NString pEbReportNo,NNumber pPidm,NString pGi01,NString pGi03,NString pId,NString pLastName,NString pFirstName,NString pMi,NString pEb00,NString pEj01,NString pEj02,NString pEj03,NNumber pEj04,NNumber pEj05,NNumber pEj08,NString pPosn,NString pSuff,NDate pJobsEffectiveDate,NString pCrn,NString pTermCode,NNumber pTermLenMult,NString pCategory,NString pMasaCode,NNumber pMasaPercent,NString pTopsCode,NString pFinalInd,NString pSourceType,NString pUserId,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EJ_WORKING.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_EB_REPORT_NO", pEbReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_GI01", pGi01);
			cmd.addParameter("@P_GI03", pGi03);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_EB00", pEb00);
			cmd.addParameter("@P_EJ01", pEj01);
			cmd.addParameter("@P_EJ02", pEj02);
			cmd.addParameter("@P_EJ03", pEj03);
			cmd.addParameter("@P_EJ04", pEj04);
			cmd.addParameter("@P_EJ05", pEj05);
			cmd.addParameter("@P_EJ08", pEj08);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_JOBS_EFFECTIVE_DATE", pJobsEffectiveDate);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_TERM_LEN_MULT", pTermLenMult);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_MASA_CODE", pMasaCode);
			cmd.addParameter("@P_MASA_PERCENT", pMasaPercent);
			cmd.addParameter("@P_TOPS_CODE", pTopsCode);
			cmd.addParameter("@P_FINAL_IND", pFinalInd);
			cmd.addParameter("@P_SOURCE_TYPE", pSourceType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pReportNo,NNumber pPidm,NString pPosn,NString pSuff,NString pTermCode,NString pCrn,NString pCategory,NString pMasaCode,NString pSourceType,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EJ_WORKING.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_MASA_CODE", pMasaCode);
			cmd.addParameter("@P_SOURCE_TYPE", pSourceType);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pReportNo,NNumber pPidm,NString pPosn,NString pSuff,NString pTermCode,NString pCrn,NString pCategory,NString pMasaCode,NString pSourceType,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EJ_WORKING.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_MASA_CODE", pMasaCode);
			cmd.addParameter("@P_SOURCE_TYPE", pSourceType);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pReportNo,NString pEbReportNo,NNumber pPidm,NString pGi01,NString pGi03,NString pId,NString pLastName,NString pFirstName,NString pMi,NString pEb00,NString pEj01,NString pEj02,NString pEj03,NNumber pEj04,NNumber pEj05,NNumber pEj08,NString pPosn,NString pSuff,NDate pJobsEffectiveDate,NString pCrn,NString pTermCode,NNumber pTermLenMult,NString pCategory,NString pMasaCode,NNumber pMasaPercent,NString pTopsCode,NString pFinalInd,NString pSourceType,NString pUserId,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EJ_WORKING.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_EB_REPORT_NO", pEbReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_GI01", pGi01);
			cmd.addParameter("@P_GI03", pGi03);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_EB00", pEb00);
			cmd.addParameter("@P_EJ01", pEj01);
			cmd.addParameter("@P_EJ02", pEj02);
			cmd.addParameter("@P_EJ03", pEj03);
			cmd.addParameter("@P_EJ04", pEj04);
			cmd.addParameter("@P_EJ05", pEj05);
			cmd.addParameter("@P_EJ08", pEj08);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_JOBS_EFFECTIVE_DATE", pJobsEffectiveDate);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_TERM_LEN_MULT", pTermLenMult);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_MASA_CODE", pMasaCode);
			cmd.addParameter("@P_MASA_PERCENT", pMasaPercent);
			cmd.addParameter("@P_TOPS_CODE", pTopsCode);
			cmd.addParameter("@P_FINAL_IND", pFinalInd);
			cmd.addParameter("@P_SOURCE_TYPE", pSourceType);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="MisEjWorkingRecRow", dataSourceName="MIS_EJ_WORKING_REC", needsInitialization=true)
	public static class MisEjWorkingRecRow
	{
		@DbRecordField(dataSourceName="R_REPORT_NO")
		public NString RReportNo;
		@DbRecordField(dataSourceName="R_EB_REPORT_NO")
		public NString REbReportNo;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_GI01")
		public NString RGi01;
		@DbRecordField(dataSourceName="R_GI03")
		public NString RGi03;
		@DbRecordField(dataSourceName="R_ID")
		public NString RId;
		@DbRecordField(dataSourceName="R_LAST_NAME")
		public NString RLastName;
		@DbRecordField(dataSourceName="R_FIRST_NAME")
		public NString RFirstName;
		@DbRecordField(dataSourceName="R_MI")
		public NString RMi;
		@DbRecordField(dataSourceName="R_EB00")
		public NString REb00;
		@DbRecordField(dataSourceName="R_EJ01")
		public NString REj01;
		@DbRecordField(dataSourceName="R_EJ02")
		public NString REj02;
		@DbRecordField(dataSourceName="R_EJ03")
		public NString REj03;
		@DbRecordField(dataSourceName="R_EJ04")
		public NNumber REj04;
		@DbRecordField(dataSourceName="R_EJ05")
		public NNumber REj05;
		@DbRecordField(dataSourceName="R_EJ08")
		public NNumber REj08;
		@DbRecordField(dataSourceName="R_POSN")
		public NString RPosn;
		@DbRecordField(dataSourceName="R_SUFF")
		public NString RSuff;
		@DbRecordField(dataSourceName="R_JOBS_EFFECTIVE_DATE")
		public NDate RJobsEffectiveDate;
		@DbRecordField(dataSourceName="R_CRN")
		public NString RCrn;
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_TERM_LEN_MULT")
		public NNumber RTermLenMult;
		@DbRecordField(dataSourceName="R_CATEGORY")
		public NString RCategory;
		@DbRecordField(dataSourceName="R_MASA_CODE")
		public NString RMasaCode;
		@DbRecordField(dataSourceName="R_MASA_PERCENT")
		public NNumber RMasaPercent;
		@DbRecordField(dataSourceName="R_TOPS_CODE")
		public NString RTopsCode;
		@DbRecordField(dataSourceName="R_FINAL_IND")
		public NString RFinalInd;
		@DbRecordField(dataSourceName="R_SOURCE_TYPE")
		public NString RSourceType;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
