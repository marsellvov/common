package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbHighSchoolData {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_HIGH_SCHOOL_DATA.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_HIGH_SCHOOL_DATA.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(HighSchoolDataRecRow recOne,HighSchoolDataRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_HIGH_SCHOOL_DATA.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, HighSchoolDataRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, HighSchoolDataRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_HIGH_SCHOOL_DATA.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_HIGH_SCHOOL_DATA.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_HIGH_SCHOOL_DATA.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_HIGH_SCHOOL_DATA.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pUserId,NString pApIbCourses,NString pReqCourses,NDate pHsGradDate,NString pHsGradStateCode,NString pAdvHonorsProgCode,NString pDataOrigin,NString pProgCodeReviewed,NString pAdmissionTestInd,NString pTeachExpertInd,NString pAtbtCodInd,NString pAtbtCodCde,NString pTadmCodCde,NString pAtbtCodTestCde,NDate pAtbtCompDate,NString pAtbtCdstCde,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_HIGH_SCHOOL_DATA.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_AP_IB_COURSES", pApIbCourses);
			cmd.addParameter("@P_REQ_COURSES", pReqCourses);
			cmd.addParameter("@P_HS_GRAD_DATE", pHsGradDate);
			cmd.addParameter("@P_HS_GRAD_STATE_CODE", pHsGradStateCode);
			cmd.addParameter("@P_ADV_HONORS_PROG_CODE", pAdvHonorsProgCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PROG_CODE_REVIEWED", pProgCodeReviewed);
			cmd.addParameter("@P_ADMISSION_TEST_IND", pAdmissionTestInd);
			cmd.addParameter("@P_TEACH_EXPERT_IND", pTeachExpertInd);
			cmd.addParameter("@P_ATBT_COD_IND", pAtbtCodInd);
			cmd.addParameter("@P_ATBT_COD_CDE", pAtbtCodCde);
			cmd.addParameter("@P_TADM_COD_CDE", pTadmCodCde);
			cmd.addParameter("@P_ATBT_COD_TEST_CDE", pAtbtCodTestCde);
			cmd.addParameter("@P_ATBT_COMP_DATE", pAtbtCompDate);
			cmd.addParameter("@P_ATBT_CDST_CDE", pAtbtCdstCde);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_HIGH_SCHOOL_DATA.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_HIGH_SCHOOL_DATA.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pUserId,NString pApIbCourses,NString pReqCourses,NDate pHsGradDate,NString pHsGradStateCode,NString pAdvHonorsProgCode,NString pDataOrigin,NString pProgCodeReviewed,NString pAdmissionTestInd,NString pTeachExpertInd,NString pAtbtCodInd,NString pAtbtCodCde,NString pTadmCodCde,NString pAtbtCodTestCde,NDate pAtbtCompDate,NString pAtbtCdstCde,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RB_HIGH_SCHOOL_DATA.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_AP_IB_COURSES", pApIbCourses);
			cmd.addParameter("@P_REQ_COURSES", pReqCourses);
			cmd.addParameter("@P_HS_GRAD_DATE", pHsGradDate);
			cmd.addParameter("@P_HS_GRAD_STATE_CODE", pHsGradStateCode);
			cmd.addParameter("@P_ADV_HONORS_PROG_CODE", pAdvHonorsProgCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_PROG_CODE_REVIEWED", pProgCodeReviewed);
			cmd.addParameter("@P_ADMISSION_TEST_IND", pAdmissionTestInd);
			cmd.addParameter("@P_TEACH_EXPERT_IND", pTeachExpertInd);
			cmd.addParameter("@P_ATBT_COD_IND", pAtbtCodInd);
			cmd.addParameter("@P_ATBT_COD_CDE", pAtbtCodCde);
			cmd.addParameter("@P_TADM_COD_CDE", pTadmCodCde);
			cmd.addParameter("@P_ATBT_COD_TEST_CDE", pAtbtCodTestCde);
			cmd.addParameter("@P_ATBT_COMP_DATE", pAtbtCompDate);
			cmd.addParameter("@P_ATBT_CDST_CDE", pAtbtCdstCde);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="HighSchoolDataRecRow", dataSourceName="HIGH_SCHOOL_DATA_REC")
	public static class HighSchoolDataRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_AP_IB_COURSES")
		public NString RApIbCourses;
		@DbRecordField(dataSourceName="R_REQ_COURSES")
		public NString RReqCourses;
		@DbRecordField(dataSourceName="R_HS_GRAD_DATE")
		public NDate RHsGradDate;
		@DbRecordField(dataSourceName="R_HS_GRAD_STATE_CODE")
		public NString RHsGradStateCode;
		@DbRecordField(dataSourceName="R_ADV_HONORS_PROG_CODE")
		public NString RAdvHonorsProgCode;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_PROG_CODE_REVIEWED")
		public NString RProgCodeReviewed;
		@DbRecordField(dataSourceName="R_ADMISSION_TEST_IND")
		public NString RAdmissionTestInd;
		@DbRecordField(dataSourceName="R_TEACH_EXPERT_IND")
		public NString RTeachExpertInd;
		@DbRecordField(dataSourceName="R_ATBT_COD_IND")
		public NString RAtbtCodInd;
		@DbRecordField(dataSourceName="R_ATBT_COD_CDE")
		public NString RAtbtCodCde;
		@DbRecordField(dataSourceName="R_TADM_COD_CDE")
		public NString RTadmCodCde;
		@DbRecordField(dataSourceName="R_ATBT_COD_TEST_CDE")
		public NString RAtbtCodTestCde;
		@DbRecordField(dataSourceName="R_ATBT_COMP_DATE")
		public NDate RAtbtCompDate;
		@DbRecordField(dataSourceName="R_ATBT_CDST_CDE")
		public NString RAtbtCdstCde;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
