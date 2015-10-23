package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbCourse {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(CourseRecRow recOne,CourseRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, CourseRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, CourseRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pSubjCode,NString pCrseNumb,NString pEffTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryCurrent(NString pSubjCode,NString pCrseNumb,NString pEffTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE.F_QUERY_CURRENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pSubjCode,NString pCrseNumb,NString pEffTerm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pCollCode,NString pDivsCode,NString pDeptCode,NString pCstaCode,NString pTitle,NString pCipcCode,NString pCreditHrInd,NNumber pCreditHrLow,NNumber pCreditHrHigh,NString pLecHrInd,NNumber pLecHrLow,NNumber pLecHrHigh,NString pLabHrInd,NNumber pLabHrLow,NNumber pLabHrHigh,NString pOthHrInd,NNumber pOthHrLow,NNumber pOthHrHigh,NString pBillHrInd,NNumber pBillHrLow,NNumber pBillHrHigh,NString pAprvCode,NNumber pRepeatLimit,NString pPwavCode,NString pTuiwInd,NString pAddFeesInd,NNumber pContHrLow,NString pContHrInd,NNumber pContHrHigh,NString pCeuInd,NString pRepsCode,NNumber pMaxRptUnits,NString pCappPrereqTestInd,NString pDuntCode,NNumber pNumberOfUnits,NString pLevlCode,NString pGmodCode,NString pSchdCode,NNumber pWorkload,NNumber pMaxEnrl,NNumber pAdjWorkload,NString pInsmCode,NString pDataOrigin,NString pUserId,NString pPrereqChkMethodCde,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DIVS_CODE", pDivsCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_CSTA_CODE", pCstaCode);
			cmd.addParameter("@P_TITLE", pTitle);
			cmd.addParameter("@P_CIPC_CODE", pCipcCode);
			cmd.addParameter("@P_CREDIT_HR_IND", pCreditHrInd);
			cmd.addParameter("@P_CREDIT_HR_LOW", pCreditHrLow);
			cmd.addParameter("@P_CREDIT_HR_HIGH", pCreditHrHigh);
			cmd.addParameter("@P_LEC_HR_IND", pLecHrInd);
			cmd.addParameter("@P_LEC_HR_LOW", pLecHrLow);
			cmd.addParameter("@P_LEC_HR_HIGH", pLecHrHigh);
			cmd.addParameter("@P_LAB_HR_IND", pLabHrInd);
			cmd.addParameter("@P_LAB_HR_LOW", pLabHrLow);
			cmd.addParameter("@P_LAB_HR_HIGH", pLabHrHigh);
			cmd.addParameter("@P_OTH_HR_IND", pOthHrInd);
			cmd.addParameter("@P_OTH_HR_LOW", pOthHrLow);
			cmd.addParameter("@P_OTH_HR_HIGH", pOthHrHigh);
			cmd.addParameter("@P_BILL_HR_IND", pBillHrInd);
			cmd.addParameter("@P_BILL_HR_LOW", pBillHrLow);
			cmd.addParameter("@P_BILL_HR_HIGH", pBillHrHigh);
			cmd.addParameter("@P_APRV_CODE", pAprvCode);
			cmd.addParameter("@P_REPEAT_LIMIT", pRepeatLimit);
			cmd.addParameter("@P_PWAV_CODE", pPwavCode);
			cmd.addParameter("@P_TUIW_IND", pTuiwInd);
			cmd.addParameter("@P_ADD_FEES_IND", pAddFeesInd);
			cmd.addParameter("@P_CONT_HR_LOW", pContHrLow);
			cmd.addParameter("@P_CONT_HR_IND", pContHrInd);
			cmd.addParameter("@P_CONT_HR_HIGH", pContHrHigh);
			cmd.addParameter("@P_CEU_IND", pCeuInd);
			cmd.addParameter("@P_REPS_CODE", pRepsCode);
			cmd.addParameter("@P_MAX_RPT_UNITS", pMaxRptUnits);
			cmd.addParameter("@P_CAPP_PREREQ_TEST_IND", pCappPrereqTestInd);
			cmd.addParameter("@P_DUNT_CODE", pDuntCode);
			cmd.addParameter("@P_NUMBER_OF_UNITS", pNumberOfUnits);
			cmd.addParameter("@P_LEVL_CODE", pLevlCode);
			cmd.addParameter("@P_GMOD_CODE", pGmodCode);
			cmd.addParameter("@P_SCHD_CODE", pSchdCode);
			cmd.addParameter("@P_WORKLOAD", pWorkload);
			cmd.addParameter("@P_MAX_ENRL", pMaxEnrl);
			cmd.addParameter("@P_ADJ_WORKLOAD", pAdjWorkload);
			cmd.addParameter("@P_INSM_CODE", pInsmCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PREREQ_CHK_METHOD_CDE", pPrereqChkMethodCde);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pSubjCode,NString pCrseNumb,NString pEffTerm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pSubjCode,NString pCrseNumb,NString pEffTerm,NString pCollCode,NString pDivsCode,NString pDeptCode,NString pCstaCode,NString pTitle,NString pCipcCode,NString pCreditHrInd,NNumber pCreditHrLow,NNumber pCreditHrHigh,NString pLecHrInd,NNumber pLecHrLow,NNumber pLecHrHigh,NString pLabHrInd,NNumber pLabHrLow,NNumber pLabHrHigh,NString pOthHrInd,NNumber pOthHrLow,NNumber pOthHrHigh,NString pBillHrInd,NNumber pBillHrLow,NNumber pBillHrHigh,NString pAprvCode,NNumber pRepeatLimit,NString pPwavCode,NString pTuiwInd,NString pAddFeesInd,NNumber pContHrLow,NString pContHrInd,NNumber pContHrHigh,NString pCeuInd,NString pRepsCode,NNumber pMaxRptUnits,NString pCappPrereqTestInd,NString pDuntCode,NNumber pNumberOfUnits,NString pDataOrigin,NString pUserId,NString pPrereqChkMethodCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_COURSE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_EFF_TERM", pEffTerm);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_DIVS_CODE", pDivsCode);
			cmd.addParameter("@P_DEPT_CODE", pDeptCode);
			cmd.addParameter("@P_CSTA_CODE", pCstaCode);
			cmd.addParameter("@P_TITLE", pTitle);
			cmd.addParameter("@P_CIPC_CODE", pCipcCode);
			cmd.addParameter("@P_CREDIT_HR_IND", pCreditHrInd);
			cmd.addParameter("@P_CREDIT_HR_LOW", pCreditHrLow);
			cmd.addParameter("@P_CREDIT_HR_HIGH", pCreditHrHigh);
			cmd.addParameter("@P_LEC_HR_IND", pLecHrInd);
			cmd.addParameter("@P_LEC_HR_LOW", pLecHrLow);
			cmd.addParameter("@P_LEC_HR_HIGH", pLecHrHigh);
			cmd.addParameter("@P_LAB_HR_IND", pLabHrInd);
			cmd.addParameter("@P_LAB_HR_LOW", pLabHrLow);
			cmd.addParameter("@P_LAB_HR_HIGH", pLabHrHigh);
			cmd.addParameter("@P_OTH_HR_IND", pOthHrInd);
			cmd.addParameter("@P_OTH_HR_LOW", pOthHrLow);
			cmd.addParameter("@P_OTH_HR_HIGH", pOthHrHigh);
			cmd.addParameter("@P_BILL_HR_IND", pBillHrInd);
			cmd.addParameter("@P_BILL_HR_LOW", pBillHrLow);
			cmd.addParameter("@P_BILL_HR_HIGH", pBillHrHigh);
			cmd.addParameter("@P_APRV_CODE", pAprvCode);
			cmd.addParameter("@P_REPEAT_LIMIT", pRepeatLimit);
			cmd.addParameter("@P_PWAV_CODE", pPwavCode);
			cmd.addParameter("@P_TUIW_IND", pTuiwInd);
			cmd.addParameter("@P_ADD_FEES_IND", pAddFeesInd);
			cmd.addParameter("@P_CONT_HR_LOW", pContHrLow);
			cmd.addParameter("@P_CONT_HR_IND", pContHrInd);
			cmd.addParameter("@P_CONT_HR_HIGH", pContHrHigh);
			cmd.addParameter("@P_CEU_IND", pCeuInd);
			cmd.addParameter("@P_REPS_CODE", pRepsCode);
			cmd.addParameter("@P_MAX_RPT_UNITS", pMaxRptUnits);
			cmd.addParameter("@P_CAPP_PREREQ_TEST_IND", pCappPrereqTestInd);
			cmd.addParameter("@P_DUNT_CODE", pDuntCode);
			cmd.addParameter("@P_NUMBER_OF_UNITS", pNumberOfUnits);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_PREREQ_CHK_METHOD_CDE", pPrereqChkMethodCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="CourseRecRow", dataSourceName="COURSE_REC")
	public static class CourseRecRow
	{
		@DbRecordField(dataSourceName="R_SUBJ_CODE")
		public NString RSubjCode;
		@DbRecordField(dataSourceName="R_CRSE_NUMB")
		public NString RCrseNumb;
		@DbRecordField(dataSourceName="R_EFF_TERM")
		public NString REffTerm;
		@DbRecordField(dataSourceName="R_COLL_CODE")
		public NString RCollCode;
		@DbRecordField(dataSourceName="R_DIVS_CODE")
		public NString RDivsCode;
		@DbRecordField(dataSourceName="R_DEPT_CODE")
		public NString RDeptCode;
		@DbRecordField(dataSourceName="R_CSTA_CODE")
		public NString RCstaCode;
		@DbRecordField(dataSourceName="R_TITLE")
		public NString RTitle;
		@DbRecordField(dataSourceName="R_CIPC_CODE")
		public NString RCipcCode;
		@DbRecordField(dataSourceName="R_CREDIT_HR_IND")
		public NString RCreditHrInd;
		@DbRecordField(dataSourceName="R_CREDIT_HR_LOW")
		public NNumber RCreditHrLow;
		@DbRecordField(dataSourceName="R_CREDIT_HR_HIGH")
		public NNumber RCreditHrHigh;
		@DbRecordField(dataSourceName="R_LEC_HR_IND")
		public NString RLecHrInd;
		@DbRecordField(dataSourceName="R_LEC_HR_LOW")
		public NNumber RLecHrLow;
		@DbRecordField(dataSourceName="R_LEC_HR_HIGH")
		public NNumber RLecHrHigh;
		@DbRecordField(dataSourceName="R_LAB_HR_IND")
		public NString RLabHrInd;
		@DbRecordField(dataSourceName="R_LAB_HR_LOW")
		public NNumber RLabHrLow;
		@DbRecordField(dataSourceName="R_LAB_HR_HIGH")
		public NNumber RLabHrHigh;
		@DbRecordField(dataSourceName="R_OTH_HR_IND")
		public NString ROthHrInd;
		@DbRecordField(dataSourceName="R_OTH_HR_LOW")
		public NNumber ROthHrLow;
		@DbRecordField(dataSourceName="R_OTH_HR_HIGH")
		public NNumber ROthHrHigh;
		@DbRecordField(dataSourceName="R_BILL_HR_IND")
		public NString RBillHrInd;
		@DbRecordField(dataSourceName="R_BILL_HR_LOW")
		public NNumber RBillHrLow;
		@DbRecordField(dataSourceName="R_BILL_HR_HIGH")
		public NNumber RBillHrHigh;
		@DbRecordField(dataSourceName="R_APRV_CODE")
		public NString RAprvCode;
		@DbRecordField(dataSourceName="R_REPEAT_LIMIT")
		public NNumber RRepeatLimit;
		@DbRecordField(dataSourceName="R_PWAV_CODE")
		public NString RPwavCode;
		@DbRecordField(dataSourceName="R_TUIW_IND")
		public NString RTuiwInd;
		@DbRecordField(dataSourceName="R_ADD_FEES_IND")
		public NString RAddFeesInd;
		@DbRecordField(dataSourceName="R_CONT_HR_LOW")
		public NNumber RContHrLow;
		@DbRecordField(dataSourceName="R_CONT_HR_IND")
		public NString RContHrInd;
		@DbRecordField(dataSourceName="R_CONT_HR_HIGH")
		public NNumber RContHrHigh;
		@DbRecordField(dataSourceName="R_CEU_IND")
		public NString RCeuInd;
		@DbRecordField(dataSourceName="R_REPS_CODE")
		public NString RRepsCode;
		@DbRecordField(dataSourceName="R_MAX_RPT_UNITS")
		public NNumber RMaxRptUnits;
		@DbRecordField(dataSourceName="R_CAPP_PREREQ_TEST_IND")
		public NString RCappPrereqTestInd;
		@DbRecordField(dataSourceName="R_DUNT_CODE")
		public NString RDuntCode;
		@DbRecordField(dataSourceName="R_NUMBER_OF_UNITS")
		public NNumber RNumberOfUnits;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_PREREQ_CHK_METHOD_CDE")
		public NString RPrereqChkMethodCde;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
