package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbFacJobdetail {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_JOBDETAIL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fChkFacultyJobAccess(NString pTerm,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffDate,NString pAccessInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_JOBDETAIL.F_CHK_FACULTY_JOB_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFF_DATE", pEffDate);
			cmd.addParameter("@P_ACCESS_IND", pAccessInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NString pTermCode,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_JOBDETAIL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FacJobdetailRecRow recOne,FacJobdetailRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_JOBDETAIL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FacJobdetailRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FacJobdetailRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTermCode,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_JOBDETAIL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_JOBDETAIL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTermCode,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_JOBDETAIL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTermCode,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_JOBDETAIL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTermCode,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NDate pPersChgDate,NDate pBeginDate,NString pJcreCode,NString pContractType,NString pLockInd,NString pAcknowledgeInd,NString pApplyInd,NString pOrgnCodePosn,NString pEclsCode,NString pPictCode,NString pSgrpCode,NNumber pApptPct,NNumber pAssgnSalary,NNumber pAnnSalary,NNumber pFactor,NNumber pPays,NString pUserId,NString pDataOrigin,NDate pAcknowledgeDate,NString pAcknowledgeUserId,NString pDesc,NDate pEndDate,NString pDfprCode,NNumber pHrsDay,NNumber pHrsPay,NString pSalTable,NString pSalGrade,NNumber pSalStep,NNumber pFte,NNumber pRegRate,NString pCoasCodePosn,NString pPosnOvrloadSrce,NString pSuffOvrloadSrce,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_JOBDETAIL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_PERS_CHG_DATE", pPersChgDate);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_JCRE_CODE", pJcreCode);
			cmd.addParameter("@P_CONTRACT_TYPE", pContractType);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_ACKNOWLEDGE_IND", pAcknowledgeInd);
			cmd.addParameter("@P_APPLY_IND", pApplyInd);
			cmd.addParameter("@P_ORGN_CODE_POSN", pOrgnCodePosn);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_SGRP_CODE", pSgrpCode);
			cmd.addParameter("@P_APPT_PCT", pApptPct);
			cmd.addParameter("@P_ASSGN_SALARY", pAssgnSalary);
			cmd.addParameter("@P_ANN_SALARY", pAnnSalary);
			cmd.addParameter("@P_FACTOR", pFactor);
			cmd.addParameter("@P_PAYS", pPays);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ACKNOWLEDGE_DATE", pAcknowledgeDate);
			cmd.addParameter("@P_ACKNOWLEDGE_USER_ID", pAcknowledgeUserId);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_DFPR_CODE", pDfprCode);
			cmd.addParameter("@P_HRS_DAY", pHrsDay);
			cmd.addParameter("@P_HRS_PAY", pHrsPay);
			cmd.addParameter("@P_SAL_TABLE", pSalTable);
			cmd.addParameter("@P_SAL_GRADE", pSalGrade);
			cmd.addParameter("@P_SAL_STEP", pSalStep);
			cmd.addParameter("@P_FTE", pFte);
			cmd.addParameter("@P_REG_RATE", pRegRate);
			cmd.addParameter("@P_COAS_CODE_POSN", pCoasCodePosn);
			cmd.addParameter("@P_POSN_OVRLOAD_SRCE", pPosnOvrloadSrce);
			cmd.addParameter("@P_SUFF_OVRLOAD_SRCE", pSuffOvrloadSrce);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTermCode,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_JOBDETAIL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTermCode,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_JOBDETAIL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTermCode,NNumber pPidm,NString pPosn,NString pSuff,NDate pEffectiveDate,NDate pPersChgDate,NDate pBeginDate,NString pJcreCode,NString pContractType,NString pLockInd,NString pAcknowledgeInd,NString pApplyInd,NString pOrgnCodePosn,NString pEclsCode,NString pPictCode,NString pSgrpCode,NNumber pApptPct,NNumber pAssgnSalary,NNumber pAnnSalary,NNumber pFactor,NNumber pPays,NString pUserId,NString pDataOrigin,NDate pAcknowledgeDate,NString pAcknowledgeUserId,NString pDesc,NDate pEndDate,NString pDfprCode,NNumber pHrsDay,NNumber pHrsPay,NString pSalTable,NString pSalGrade,NNumber pSalStep,NNumber pFte,NNumber pRegRate,NString pCoasCodePosn,NString pPosnOvrloadSrce,NString pSuffOvrloadSrce,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_JOBDETAIL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN", pPosn);
			cmd.addParameter("@P_SUFF", pSuff);
			cmd.addParameter("@P_EFFECTIVE_DATE", pEffectiveDate);
			cmd.addParameter("@P_PERS_CHG_DATE", pPersChgDate);
			cmd.addParameter("@P_BEGIN_DATE", pBeginDate);
			cmd.addParameter("@P_JCRE_CODE", pJcreCode);
			cmd.addParameter("@P_CONTRACT_TYPE", pContractType);
			cmd.addParameter("@P_LOCK_IND", pLockInd);
			cmd.addParameter("@P_ACKNOWLEDGE_IND", pAcknowledgeInd);
			cmd.addParameter("@P_APPLY_IND", pApplyInd);
			cmd.addParameter("@P_ORGN_CODE_POSN", pOrgnCodePosn);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_PICT_CODE", pPictCode);
			cmd.addParameter("@P_SGRP_CODE", pSgrpCode);
			cmd.addParameter("@P_APPT_PCT", pApptPct);
			cmd.addParameter("@P_ASSGN_SALARY", pAssgnSalary);
			cmd.addParameter("@P_ANN_SALARY", pAnnSalary);
			cmd.addParameter("@P_FACTOR", pFactor);
			cmd.addParameter("@P_PAYS", pPays);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ACKNOWLEDGE_DATE", pAcknowledgeDate);
			cmd.addParameter("@P_ACKNOWLEDGE_USER_ID", pAcknowledgeUserId);
			cmd.addParameter("@P_DESC", pDesc);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_DFPR_CODE", pDfprCode);
			cmd.addParameter("@P_HRS_DAY", pHrsDay);
			cmd.addParameter("@P_HRS_PAY", pHrsPay);
			cmd.addParameter("@P_SAL_TABLE", pSalTable);
			cmd.addParameter("@P_SAL_GRADE", pSalGrade);
			cmd.addParameter("@P_SAL_STEP", pSalStep);
			cmd.addParameter("@P_FTE", pFte);
			cmd.addParameter("@P_REG_RATE", pRegRate);
			cmd.addParameter("@P_COAS_CODE_POSN", pCoasCodePosn);
			cmd.addParameter("@P_POSN_OVRLOAD_SRCE", pPosnOvrloadSrce);
			cmd.addParameter("@P_SUFF_OVRLOAD_SRCE", pSuffOvrloadSrce);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FacJobdetailRecRow", dataSourceName="FAC_JOBDETAIL_REC")
	public static class FacJobdetailRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_POSN")
		public NString RPosn;
		@DbRecordField(dataSourceName="R_SUFF")
		public NString RSuff;
		@DbRecordField(dataSourceName="R_EFFECTIVE_DATE")
		public NDate REffectiveDate;
		@DbRecordField(dataSourceName="R_PERS_CHG_DATE")
		public NDate RPersChgDate;
		@DbRecordField(dataSourceName="R_BEGIN_DATE")
		public NDate RBeginDate;
		@DbRecordField(dataSourceName="R_JCRE_CODE")
		public NString RJcreCode;
		@DbRecordField(dataSourceName="R_CONTRACT_TYPE")
		public NString RContractType;
		@DbRecordField(dataSourceName="R_LOCK_IND")
		public NString RLockInd;
		@DbRecordField(dataSourceName="R_ACKNOWLEDGE_IND")
		public NString RAcknowledgeInd;
		@DbRecordField(dataSourceName="R_APPLY_IND")
		public NString RApplyInd;
		@DbRecordField(dataSourceName="R_ORGN_CODE_POSN")
		public NString ROrgnCodePosn;
		@DbRecordField(dataSourceName="R_ECLS_CODE")
		public NString REclsCode;
		@DbRecordField(dataSourceName="R_PICT_CODE")
		public NString RPictCode;
		@DbRecordField(dataSourceName="R_SGRP_CODE")
		public NString RSgrpCode;
		@DbRecordField(dataSourceName="R_APPT_PCT")
		public NNumber RApptPct;
		@DbRecordField(dataSourceName="R_ASSGN_SALARY")
		public NNumber RAssgnSalary;
		@DbRecordField(dataSourceName="R_ANN_SALARY")
		public NNumber RAnnSalary;
		@DbRecordField(dataSourceName="R_FACTOR")
		public NNumber RFactor;
		@DbRecordField(dataSourceName="R_PAYS")
		public NNumber RPays;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_ACKNOWLEDGE_DATE")
		public NDate RAcknowledgeDate;
		@DbRecordField(dataSourceName="R_ACKNOWLEDGE_USER_ID")
		public NString RAcknowledgeUserId;
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_DFPR_CODE")
		public NString RDfprCode;
		@DbRecordField(dataSourceName="R_HRS_DAY")
		public NNumber RHrsDay;
		@DbRecordField(dataSourceName="R_HRS_PAY")
		public NNumber RHrsPay;
		@DbRecordField(dataSourceName="R_SAL_TABLE")
		public NString RSalTable;
		@DbRecordField(dataSourceName="R_SAL_GRADE")
		public NString RSalGrade;
		@DbRecordField(dataSourceName="R_SAL_STEP")
		public NNumber RSalStep;
		@DbRecordField(dataSourceName="R_FTE")
		public NNumber RFte;
		@DbRecordField(dataSourceName="R_REG_RATE")
		public NNumber RRegRate;
		@DbRecordField(dataSourceName="R_COAS_CODE_POSN")
		public NString RCoasCodePosn;
		@DbRecordField(dataSourceName="R_POSN_OVRLOAD_SRCE")
		public NString RPosnOvrloadSrce;
		@DbRecordField(dataSourceName="R_SUFF_OVRLOAD_SRCE")
		public NString RSuffOvrloadSrce;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
