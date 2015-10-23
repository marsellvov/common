package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEdiCourse {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_COURSE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_COURSE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EdiCourseRecRow recOne,EdiCourseRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_COURSE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EdiCourseRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EdiCourseRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pDcmtSeqno,NNumber pAsesSeqno,NString pBasiCode,NString pCredCode,NNumber pHoursAttempted,NNumber pHoursEarned,NString pAmcasGradeQual,NString pGrade,NString pHonorsInd,NString pCourseLevel,NString pRepeatInd,NString pXcurrCodeQual,NString pXcurrCode,NNumber pQualityPoints,NString pK12GradeLevel,NString pSubjCode,NString pCrseNumb,NString pCrseTitle,NNumber pK12DaysAttend,NNumber pK12DaysAbsent,NString pDropDate,NString pOverrideCode,NString pDuplicate,NString pDataOrigin,NString pUserId,NString pUde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_COURSE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ASES_SEQNO", pAsesSeqno);
			cmd.addParameter("@P_BASI_CODE", pBasiCode);
			cmd.addParameter("@P_CRED_CODE", pCredCode);
			cmd.addParameter("@P_HOURS_ATTEMPTED", pHoursAttempted);
			cmd.addParameter("@P_HOURS_EARNED", pHoursEarned);
			cmd.addParameter("@P_AMCAS_GRADE_QUAL", pAmcasGradeQual);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_HONORS_IND", pHonorsInd);
			cmd.addParameter("@P_COURSE_LEVEL", pCourseLevel);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
			cmd.addParameter("@P_XCURR_CODE_QUAL", pXcurrCodeQual);
			cmd.addParameter("@P_XCURR_CODE", pXcurrCode);
			cmd.addParameter("@P_QUALITY_POINTS", pQualityPoints);
			cmd.addParameter("@P_K12_GRADE_LEVEL", pK12GradeLevel);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_CRSE_TITLE", pCrseTitle);
			cmd.addParameter("@P_K12_DAYS_ATTEND", pK12DaysAttend);
			cmd.addParameter("@P_K12_DAYS_ABSENT", pK12DaysAbsent);
			cmd.addParameter("@P_DROP_DATE", pDropDate);
			cmd.addParameter("@P_OVERRIDE_CODE", pOverrideCode);
			cmd.addParameter("@P_DUPLICATE", pDuplicate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_UDE", pUde);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_COURSE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pDcmtSeqno,NNumber pAsesSeqno,NString pBasiCode,NString pCredCode,NNumber pHoursAttempted,NNumber pHoursEarned,NString pAmcasGradeQual,NString pGrade,NString pHonorsInd,NString pCourseLevel,NString pRepeatInd,NString pXcurrCodeQual,NString pXcurrCode,NNumber pQualityPoints,NString pK12GradeLevel,NString pSubjCode,NString pCrseNumb,NString pCrseTitle,NNumber pK12DaysAttend,NNumber pK12DaysAbsent,NString pDropDate,NString pOverrideCode,NString pDuplicate,NString pDataOrigin,NString pUserId,NString pUde) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_COURSE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ASES_SEQNO", pAsesSeqno);
			cmd.addParameter("@P_BASI_CODE", pBasiCode);
			cmd.addParameter("@P_CRED_CODE", pCredCode);
			cmd.addParameter("@P_HOURS_ATTEMPTED", pHoursAttempted);
			cmd.addParameter("@P_HOURS_EARNED", pHoursEarned);
			cmd.addParameter("@P_AMCAS_GRADE_QUAL", pAmcasGradeQual);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_HONORS_IND", pHonorsInd);
			cmd.addParameter("@P_COURSE_LEVEL", pCourseLevel);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
			cmd.addParameter("@P_XCURR_CODE_QUAL", pXcurrCodeQual);
			cmd.addParameter("@P_XCURR_CODE", pXcurrCode);
			cmd.addParameter("@P_QUALITY_POINTS", pQualityPoints);
			cmd.addParameter("@P_K12_GRADE_LEVEL", pK12GradeLevel);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_CRSE_TITLE", pCrseTitle);
			cmd.addParameter("@P_K12_DAYS_ATTEND", pK12DaysAttend);
			cmd.addParameter("@P_K12_DAYS_ABSENT", pK12DaysAbsent);
			cmd.addParameter("@P_DROP_DATE", pDropDate);
			cmd.addParameter("@P_OVERRIDE_CODE", pOverrideCode);
			cmd.addParameter("@P_DUPLICATE", pDuplicate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_UDE", pUde);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pDcmtSeqno,NNumber pAsesSeqno,NString pBasiCode,NString pCredCode,NNumber pHoursAttempted,NNumber pHoursEarned,NString pAmcasGradeQual,NString pGrade,NString pHonorsInd,NString pCourseLevel,NString pRepeatInd,NString pXcurrCodeQual,NString pXcurrCode,NNumber pQualityPoints,NString pK12GradeLevel,NString pSubjCode,NString pCrseNumb,NString pCrseTitle,NNumber pK12DaysAttend,NNumber pK12DaysAbsent,NString pDropDate,NString pOverrideCode,NString pDuplicate,NString pDataOrigin,NString pUserId,NString pUde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_COURSE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ASES_SEQNO", pAsesSeqno);
			cmd.addParameter("@P_BASI_CODE", pBasiCode);
			cmd.addParameter("@P_CRED_CODE", pCredCode);
			cmd.addParameter("@P_HOURS_ATTEMPTED", pHoursAttempted);
			cmd.addParameter("@P_HOURS_EARNED", pHoursEarned);
			cmd.addParameter("@P_AMCAS_GRADE_QUAL", pAmcasGradeQual);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_HONORS_IND", pHonorsInd);
			cmd.addParameter("@P_COURSE_LEVEL", pCourseLevel);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
			cmd.addParameter("@P_XCURR_CODE_QUAL", pXcurrCodeQual);
			cmd.addParameter("@P_XCURR_CODE", pXcurrCode);
			cmd.addParameter("@P_QUALITY_POINTS", pQualityPoints);
			cmd.addParameter("@P_K12_GRADE_LEVEL", pK12GradeLevel);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_CRSE_TITLE", pCrseTitle);
			cmd.addParameter("@P_K12_DAYS_ATTEND", pK12DaysAttend);
			cmd.addParameter("@P_K12_DAYS_ABSENT", pK12DaysAbsent);
			cmd.addParameter("@P_DROP_DATE", pDropDate);
			cmd.addParameter("@P_OVERRIDE_CODE", pOverrideCode);
			cmd.addParameter("@P_DUPLICATE", pDuplicate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_UDE", pUde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pDcmtSeqno,NNumber pAsesSeqno,NString pBasiCode,NString pCredCode,NNumber pHoursAttempted,NNumber pHoursEarned,NString pAmcasGradeQual,NString pGrade,NString pHonorsInd,NString pCourseLevel,NString pRepeatInd,NString pXcurrCodeQual,NString pXcurrCode,NNumber pQualityPoints,NString pK12GradeLevel,NString pSubjCode,NString pCrseNumb,NString pCrseTitle,NNumber pK12DaysAttend,NNumber pK12DaysAbsent,NString pDropDate,NString pOverrideCode,NString pDuplicate,NString pDataOrigin,NString pUserId,NString pUde,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_COURSE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ASES_SEQNO", pAsesSeqno);
			cmd.addParameter("@P_BASI_CODE", pBasiCode);
			cmd.addParameter("@P_CRED_CODE", pCredCode);
			cmd.addParameter("@P_HOURS_ATTEMPTED", pHoursAttempted);
			cmd.addParameter("@P_HOURS_EARNED", pHoursEarned);
			cmd.addParameter("@P_AMCAS_GRADE_QUAL", pAmcasGradeQual);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_HONORS_IND", pHonorsInd);
			cmd.addParameter("@P_COURSE_LEVEL", pCourseLevel);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
			cmd.addParameter("@P_XCURR_CODE_QUAL", pXcurrCodeQual);
			cmd.addParameter("@P_XCURR_CODE", pXcurrCode);
			cmd.addParameter("@P_QUALITY_POINTS", pQualityPoints);
			cmd.addParameter("@P_K12_GRADE_LEVEL", pK12GradeLevel);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_CRSE_TITLE", pCrseTitle);
			cmd.addParameter("@P_K12_DAYS_ATTEND", pK12DaysAttend);
			cmd.addParameter("@P_K12_DAYS_ABSENT", pK12DaysAbsent);
			cmd.addParameter("@P_DROP_DATE", pDropDate);
			cmd.addParameter("@P_OVERRIDE_CODE", pOverrideCode);
			cmd.addParameter("@P_DUPLICATE", pDuplicate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_UDE", pUde);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pDcmtSeqno,NNumber pAsesSeqno,NString pBasiCode,NString pCredCode,NNumber pHoursAttempted,NNumber pHoursEarned,NString pAmcasGradeQual,NString pGrade,NString pHonorsInd,NString pCourseLevel,NString pRepeatInd,NString pXcurrCodeQual,NString pXcurrCode,NNumber pQualityPoints,NString pK12GradeLevel,NString pSubjCode,NString pCrseNumb,NString pCrseTitle,NNumber pK12DaysAttend,NNumber pK12DaysAbsent,NString pDropDate,NString pOverrideCode,NString pDuplicate,NString pDataOrigin,NString pUserId,NString pUde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_COURSE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ASES_SEQNO", pAsesSeqno);
			cmd.addParameter("@P_BASI_CODE", pBasiCode);
			cmd.addParameter("@P_CRED_CODE", pCredCode);
			cmd.addParameter("@P_HOURS_ATTEMPTED", pHoursAttempted);
			cmd.addParameter("@P_HOURS_EARNED", pHoursEarned);
			cmd.addParameter("@P_AMCAS_GRADE_QUAL", pAmcasGradeQual);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_HONORS_IND", pHonorsInd);
			cmd.addParameter("@P_COURSE_LEVEL", pCourseLevel);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
			cmd.addParameter("@P_XCURR_CODE_QUAL", pXcurrCodeQual);
			cmd.addParameter("@P_XCURR_CODE", pXcurrCode);
			cmd.addParameter("@P_QUALITY_POINTS", pQualityPoints);
			cmd.addParameter("@P_K12_GRADE_LEVEL", pK12GradeLevel);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_CRSE_TITLE", pCrseTitle);
			cmd.addParameter("@P_K12_DAYS_ATTEND", pK12DaysAttend);
			cmd.addParameter("@P_K12_DAYS_ABSENT", pK12DaysAbsent);
			cmd.addParameter("@P_DROP_DATE", pDropDate);
			cmd.addParameter("@P_OVERRIDE_CODE", pOverrideCode);
			cmd.addParameter("@P_DUPLICATE", pDuplicate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_UDE", pUde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_COURSE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pDcmtSeqno,NNumber pAsesSeqno,NString pBasiCode,NString pCredCode,NNumber pHoursAttempted,NNumber pHoursEarned,NString pAmcasGradeQual,NString pGrade,NString pHonorsInd,NString pCourseLevel,NString pRepeatInd,NString pXcurrCodeQual,NString pXcurrCode,NNumber pQualityPoints,NString pK12GradeLevel,NString pSubjCode,NString pCrseNumb,NString pCrseTitle,NNumber pK12DaysAttend,NNumber pK12DaysAbsent,NString pDropDate,NString pOverrideCode,NString pDuplicate,NString pDataOrigin,NString pUserId,NString pUde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_EDI_COURSE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DCMT_SEQNO", pDcmtSeqno);
			cmd.addParameter("@P_ASES_SEQNO", pAsesSeqno);
			cmd.addParameter("@P_BASI_CODE", pBasiCode);
			cmd.addParameter("@P_CRED_CODE", pCredCode);
			cmd.addParameter("@P_HOURS_ATTEMPTED", pHoursAttempted);
			cmd.addParameter("@P_HOURS_EARNED", pHoursEarned);
			cmd.addParameter("@P_AMCAS_GRADE_QUAL", pAmcasGradeQual);
			cmd.addParameter("@P_GRADE", pGrade);
			cmd.addParameter("@P_HONORS_IND", pHonorsInd);
			cmd.addParameter("@P_COURSE_LEVEL", pCourseLevel);
			cmd.addParameter("@P_REPEAT_IND", pRepeatInd);
			cmd.addParameter("@P_XCURR_CODE_QUAL", pXcurrCodeQual);
			cmd.addParameter("@P_XCURR_CODE", pXcurrCode);
			cmd.addParameter("@P_QUALITY_POINTS", pQualityPoints);
			cmd.addParameter("@P_K12_GRADE_LEVEL", pK12GradeLevel);
			cmd.addParameter("@P_SUBJ_CODE", pSubjCode);
			cmd.addParameter("@P_CRSE_NUMB", pCrseNumb);
			cmd.addParameter("@P_CRSE_TITLE", pCrseTitle);
			cmd.addParameter("@P_K12_DAYS_ATTEND", pK12DaysAttend);
			cmd.addParameter("@P_K12_DAYS_ABSENT", pK12DaysAbsent);
			cmd.addParameter("@P_DROP_DATE", pDropDate);
			cmd.addParameter("@P_OVERRIDE_CODE", pOverrideCode);
			cmd.addParameter("@P_DUPLICATE", pDuplicate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_UDE", pUde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EdiCourseRecRow", dataSourceName="EDI_COURSE_REC")
	public static class EdiCourseRecRow
	{
		@DbRecordField(dataSourceName="R_DCMT_SEQNO")
		public NNumber RDcmtSeqno;
		@DbRecordField(dataSourceName="R_ASES_SEQNO")
		public NNumber RAsesSeqno;
		@DbRecordField(dataSourceName="R_BASI_CODE")
		public NString RBasiCode;
		@DbRecordField(dataSourceName="R_CRED_CODE")
		public NString RCredCode;
		@DbRecordField(dataSourceName="R_HOURS_ATTEMPTED")
		public NNumber RHoursAttempted;
		@DbRecordField(dataSourceName="R_HOURS_EARNED")
		public NNumber RHoursEarned;
		@DbRecordField(dataSourceName="R_AMCAS_GRADE_QUAL")
		public NString RAmcasGradeQual;
		@DbRecordField(dataSourceName="R_GRADE")
		public NString RGrade;
		@DbRecordField(dataSourceName="R_HONORS_IND")
		public NString RHonorsInd;
		@DbRecordField(dataSourceName="R_COURSE_LEVEL")
		public NString RCourseLevel;
		@DbRecordField(dataSourceName="R_REPEAT_IND")
		public NString RRepeatInd;
		@DbRecordField(dataSourceName="R_XCURR_CODE_QUAL")
		public NString RXcurrCodeQual;
		@DbRecordField(dataSourceName="R_XCURR_CODE")
		public NString RXcurrCode;
		@DbRecordField(dataSourceName="R_QUALITY_POINTS")
		public NNumber RQualityPoints;
		@DbRecordField(dataSourceName="R_K12_GRADE_LEVEL")
		public NString RK12GradeLevel;
		@DbRecordField(dataSourceName="R_SUBJ_CODE")
		public NString RSubjCode;
		@DbRecordField(dataSourceName="R_CRSE_NUMB")
		public NString RCrseNumb;
		@DbRecordField(dataSourceName="R_CRSE_TITLE")
		public NString RCrseTitle;
		@DbRecordField(dataSourceName="R_K12_DAYS_ATTEND")
		public NNumber RK12DaysAttend;
		@DbRecordField(dataSourceName="R_K12_DAYS_ABSENT")
		public NNumber RK12DaysAbsent;
		@DbRecordField(dataSourceName="R_DROP_DATE")
		public NString RDropDate;
		@DbRecordField(dataSourceName="R_OVERRIDE_CODE")
		public NString ROverrideCode;
		@DbRecordField(dataSourceName="R_DUPLICATE")
		public NString RDuplicate;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_UDE")
		public NString RUde;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
