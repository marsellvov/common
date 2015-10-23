package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbGradappEligible {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_ELIGIBLE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_ELIGIBLE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(GradappEligibleRecRow recOne,GradappEligibleRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_ELIGIBLE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, GradappEligibleRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, GradappEligibleRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_ELIGIBLE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_ELIGIBLE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pSeqno) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_ELIGIBLE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SEQNO", pSeqno);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_ELIGIBLE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pSeqno,NString pLmodCde,NString pUserId,NString pLevlCode,NString pCampCode,NString pCollCode,NString pDegcCode,NString pProgram,NString pLfstCode,NString pMajrCode,NString pDeptCode,NString pTermCodeMatric,NString pTermCodeAdmit,NDate pExpGradFromDate,NDate pExpGradToDate,NString pTermCodeGrad,NString pStstCode,NString pClasCode,NString pAttsCode,NString pChrtCode,NString pStdnTermCodeGrad,NDate pStdnGradFromDate,NDate pStdnGradToDate,NString pAstdCode,NString pCastCode,NString pDgmrTermCodeGrad,NDate pDgmrGradFromDate,NDate pDgmrGradToDate,NString pGrstCode,NString pDegsCode,NString pLevlCodeGpaCalc,NString pInProgressInd,NNumber pInstHoursEarned,NNumber pInstGpaHours,NNumber pInstGpa,NNumber pHoursEarned,NNumber pGpaHours,NNumber pGpa,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_ELIGIBLE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LMOD_CDE", pLmodCde);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_TERM_CODE_MATRIC", pTermCodeMatric);
			cmd.addParameter("@P_TERM_CODE_ADMIT", pTermCodeAdmit);
			cmd.addParameter("@P_EXP_GRAD_FROM_DATE", pExpGradFromDate);
			cmd.addParameter("@P_EXP_GRAD_TO_DATE", pExpGradToDate);
			cmd.addParameter("@P_TERM_CODE_GRAD", pTermCodeGrad);
			cmd.addParameter("@P_STST_CODE", pStstCode);
			cmd.addParameter("@P_CLAS_CODE", pClasCode);
			cmd.addParameter("@P_ATTS_CODE", pAttsCode);
			cmd.addParameter("@P_CHRT_CODE", pChrtCode);
			cmd.addParameter("@P_STDN_TERM_CODE_GRAD", pStdnTermCodeGrad);
			cmd.addParameter("@P_STDN_GRAD_FROM_DATE", pStdnGradFromDate);
			cmd.addParameter("@P_STDN_GRAD_TO_DATE", pStdnGradToDate);
			cmd.addParameter("@P_ASTD_CODE", pAstdCode);
			cmd.addParameter("@P_CAST_CODE", pCastCode);
			cmd.addParameter("@P_DGMR_TERM_CODE_GRAD", pDgmrTermCodeGrad);
			cmd.addParameter("@P_DGMR_GRAD_FROM_DATE", pDgmrGradFromDate);
			cmd.addParameter("@P_DGMR_GRAD_TO_DATE", pDgmrGradToDate);
			cmd.addParameter("@P_GRST_CODE", pGrstCode);
			cmd.addParameter("@P_DEGS_CODE", pDegsCode);
			cmd.addParameter("@P_LEVL_CODE_GPA_CALC", pLevlCodeGpaCalc);
			cmd.addParameter("@P_IN_PROGRESS_IND", pInProgressInd);
			cmd.addParameter("@P_INST_HOURS_EARNED", pInstHoursEarned);
			cmd.addParameter("@P_INST_GPA_HOURS", pInstGpaHours);
			cmd.addParameter("@P_INST_GPA", pInstGpa);
			cmd.addParameter("@P_HOURS_EARNED", pHoursEarned);
			cmd.addParameter("@P_GPA_HOURS", pGpaHours);
			cmd.addParameter("@P_GPA", pGpa);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pSeqno,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_ELIGIBLE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pSeqno,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_ELIGIBLE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pSeqno,NString pLmodCde,NString pUserId,NString pLevlCode,NString pCampCode,NString pCollCode,NString pDegcCode,NString pProgram,NString pLfstCode,NString pMajrCode,NString pDeptCode,NString pTermCodeMatric,NString pTermCodeAdmit,NDate pExpGradFromDate,NDate pExpGradToDate,NString pTermCodeGrad,NString pStstCode,NString pClasCode,NString pAttsCode,NString pChrtCode,NString pStdnTermCodeGrad,NDate pStdnGradFromDate,NDate pStdnGradToDate,NString pAstdCode,NString pCastCode,NString pDgmrTermCodeGrad,NDate pDgmrGradFromDate,NDate pDgmrGradToDate,NString pGrstCode,NString pDegsCode,NString pLevlCodeGpaCalc,NString pInProgressInd,NNumber pInstHoursEarned,NNumber pInstGpaHours,NNumber pInstGpa,NNumber pHoursEarned,NNumber pGpaHours,NNumber pGpa,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_GRADAPP_ELIGIBLE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SEQNO", pSeqno);
			cmd.addParameter("@P_LMOD_CDE", pLmodCde);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DEGC_CODE", pDegcCode);
			cmd.addParameter("@P_PROGRAM", pProgram);
			cmd.addParameter("@P_LFST_CODE", pLfstCode);
			cmd.addParameter("@P_MAJR_CODE", pMajrCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_TERM_CODE_MATRIC", pTermCodeMatric);
			cmd.addParameter("@P_TERM_CODE_ADMIT", pTermCodeAdmit);
			cmd.addParameter("@P_EXP_GRAD_FROM_DATE", pExpGradFromDate);
			cmd.addParameter("@P_EXP_GRAD_TO_DATE", pExpGradToDate);
			cmd.addParameter("@P_TERM_CODE_GRAD", pTermCodeGrad);
			cmd.addParameter("@P_STST_CODE", pStstCode);
			cmd.addParameter("@P_CLAS_CODE", pClasCode);
			cmd.addParameter("@P_ATTS_CODE", pAttsCode);
			cmd.addParameter("@P_CHRT_CODE", pChrtCode);
			cmd.addParameter("@P_STDN_TERM_CODE_GRAD", pStdnTermCodeGrad);
			cmd.addParameter("@P_STDN_GRAD_FROM_DATE", pStdnGradFromDate);
			cmd.addParameter("@P_STDN_GRAD_TO_DATE", pStdnGradToDate);
			cmd.addParameter("@P_ASTD_CODE", pAstdCode);
			cmd.addParameter("@P_CAST_CODE", pCastCode);
			cmd.addParameter("@P_DGMR_TERM_CODE_GRAD", pDgmrTermCodeGrad);
			cmd.addParameter("@P_DGMR_GRAD_FROM_DATE", pDgmrGradFromDate);
			cmd.addParameter("@P_DGMR_GRAD_TO_DATE", pDgmrGradToDate);
			cmd.addParameter("@P_GRST_CODE", pGrstCode);
			cmd.addParameter("@P_DEGS_CODE", pDegsCode);
			cmd.addParameter("@P_LEVL_CODE_GPA_CALC", pLevlCodeGpaCalc);
			cmd.addParameter("@P_IN_PROGRESS_IND", pInProgressInd);
			cmd.addParameter("@P_INST_HOURS_EARNED", pInstHoursEarned);
			cmd.addParameter("@P_INST_GPA_HOURS", pInstGpaHours);
			cmd.addParameter("@P_INST_GPA", pInstGpa);
			cmd.addParameter("@P_HOURS_EARNED", pHoursEarned);
			cmd.addParameter("@P_GPA_HOURS", pGpaHours);
			cmd.addParameter("@P_GPA", pGpa);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="GradappEligibleRecRow", dataSourceName="GRADAPP_ELIGIBLE_REC")
	public static class GradappEligibleRecRow
	{
		@DbRecordField(dataSourceName="R_SEQNO")
		public NNumber RSeqno;
		@DbRecordField(dataSourceName="R_LMOD_CDE")
		public NString RLmodCde;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_LEVL_CODE")
		public NString RLevlCode;
		@DbRecordField(dataSourceName="R_CAMP_CODE")
		public NString RCampCode;
		@DbRecordField(dataSourceName="R_COLL_CODE")
		public NString RCollCode;
		@DbRecordField(dataSourceName="R_DEGC_CODE")
		public NString RDegcCode;
		@DbRecordField(dataSourceName="R_PROGRAM")
		public NString RProgram;
		@DbRecordField(dataSourceName="R_LFST_CODE")
		public NString RLfstCode;
		@DbRecordField(dataSourceName="R_MAJR_CODE")
		public NString RMajrCode;
		@DbRecordField(dataSourceName="R_DEPT_CODE")
		public NString RDeptCode;
		@DbRecordField(dataSourceName="R_TERM_CODE_MATRIC")
		public NString RTermCodeMatric;
		@DbRecordField(dataSourceName="R_TERM_CODE_ADMIT")
		public NString RTermCodeAdmit;
		@DbRecordField(dataSourceName="R_EXP_GRAD_FROM_DATE")
		public NDate RExpGradFromDate;
		@DbRecordField(dataSourceName="R_EXP_GRAD_TO_DATE")
		public NDate RExpGradToDate;
		@DbRecordField(dataSourceName="R_TERM_CODE_GRAD")
		public NString RTermCodeGrad;
		@DbRecordField(dataSourceName="R_STST_CODE")
		public NString RStstCode;
		@DbRecordField(dataSourceName="R_CLAS_CODE")
		public NString RClasCode;
		@DbRecordField(dataSourceName="R_ATTS_CODE")
		public NString RAttsCode;
		@DbRecordField(dataSourceName="R_CHRT_CODE")
		public NString RChrtCode;
		@DbRecordField(dataSourceName="R_STDN_TERM_CODE_GRAD")
		public NString RStdnTermCodeGrad;
		@DbRecordField(dataSourceName="R_STDN_GRAD_FROM_DATE")
		public NDate RStdnGradFromDate;
		@DbRecordField(dataSourceName="R_STDN_GRAD_TO_DATE")
		public NDate RStdnGradToDate;
		@DbRecordField(dataSourceName="R_ASTD_CODE")
		public NString RAstdCode;
		@DbRecordField(dataSourceName="R_CAST_CODE")
		public NString RCastCode;
		@DbRecordField(dataSourceName="R_DGMR_TERM_CODE_GRAD")
		public NString RDgmrTermCodeGrad;
		@DbRecordField(dataSourceName="R_DGMR_GRAD_FROM_DATE")
		public NDate RDgmrGradFromDate;
		@DbRecordField(dataSourceName="R_DGMR_GRAD_TO_DATE")
		public NDate RDgmrGradToDate;
		@DbRecordField(dataSourceName="R_GRST_CODE")
		public NString RGrstCode;
		@DbRecordField(dataSourceName="R_DEGS_CODE")
		public NString RDegsCode;
		@DbRecordField(dataSourceName="R_LEVL_CODE_GPA_CALC")
		public NString RLevlCodeGpaCalc;
		@DbRecordField(dataSourceName="R_IN_PROGRESS_IND")
		public NString RInProgressInd;
		@DbRecordField(dataSourceName="R_INST_HOURS_EARNED")
		public NNumber RInstHoursEarned;
		@DbRecordField(dataSourceName="R_INST_GPA_HOURS")
		public NNumber RInstGpaHours;
		@DbRecordField(dataSourceName="R_INST_GPA")
		public NNumber RInstGpa;
		@DbRecordField(dataSourceName="R_HOURS_EARNED")
		public NNumber RHoursEarned;
		@DbRecordField(dataSourceName="R_GPA_HOURS")
		public NNumber RGpaHours;
		@DbRecordField(dataSourceName="R_GPA")
		public NNumber RGpa;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
