package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbEnrollment {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLLMENT.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fEligibleToRegister(NNumber pPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLLMENT.F_ELIGIBLE_TO_REGISTER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEligibleToRegister(NString pEstsCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLLMENT.F_ELIGIBLE_TO_REGISTER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ESTS_CODE", pEstsCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEnrollmentDateValid(NString pTermCode,NString pEstsCode,NDate pEstsDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLLMENT.F_ENROLLMENT_DATE_VALID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ESTS_CODE", pEstsCode);
			cmd.addParameter("@P_ESTS_DATE", pEstsDate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLLMENT.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EnrollmentRecRow recOne,EnrollmentRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLLMENT.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EnrollmentRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EnrollmentRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLLMENT.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLLMENT.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLLMENT.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLLMENT.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTermCode,NNumber pPidm,NString pEstsCode,NDate pEstsDate,NNumber pMinHrs,NNumber pMhrsOver,NString pMinhSrceCde,NString pMaxhSrceCde,NString pArInd,NDate pAssessmentDate,NDate pAddDate,NString pRgreCode,NString pTmstCode,NDate pTmstDate,NString pTmstMaintInd,NString pUser,NDate pRefundDate,NString pDataOrigin,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLLMENT.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ESTS_CODE", pEstsCode);
			cmd.addParameter("@P_ESTS_DATE", pEstsDate);
			cmd.addParameter("@P_MIN_HRS", pMinHrs);
			cmd.addParameter("@P_MHRS_OVER", pMhrsOver);
			cmd.addParameter("@P_MINH_SRCE_CDE", pMinhSrceCde);
			cmd.addParameter("@P_MAXH_SRCE_CDE", pMaxhSrceCde);
			cmd.addParameter("@P_AR_IND", pArInd);
			cmd.addParameter("@P_ASSESSMENT_DATE", pAssessmentDate);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_RGRE_CODE", pRgreCode);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_TMST_DATE", pTmstDate);
			cmd.addParameter("@P_TMST_MAINT_IND", pTmstMaintInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_REFUND_DATE", pRefundDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pTermCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLLMENT.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pTermCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLLMENT.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTermCode,NNumber pPidm,NString pEstsCode,NDate pEstsDate,NNumber pMinHrs,NNumber pMhrsOver,NString pMinhSrceCde,NString pMaxhSrceCde,NString pArInd,NDate pAssessmentDate,NDate pAddDate,NString pRgreCode,NString pTmstCode,NDate pTmstDate,NString pTmstMaintInd,NString pUser,NDate pRefundDate,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_ENROLLMENT.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ESTS_CODE", pEstsCode);
			cmd.addParameter("@P_ESTS_DATE", pEstsDate);
			cmd.addParameter("@P_MIN_HRS", pMinHrs);
			cmd.addParameter("@P_MHRS_OVER", pMhrsOver);
			cmd.addParameter("@P_MINH_SRCE_CDE", pMinhSrceCde);
			cmd.addParameter("@P_MAXH_SRCE_CDE", pMaxhSrceCde);
			cmd.addParameter("@P_AR_IND", pArInd);
			cmd.addParameter("@P_ASSESSMENT_DATE", pAssessmentDate);
			cmd.addParameter("@P_ADD_DATE", pAddDate);
			cmd.addParameter("@P_RGRE_CODE", pRgreCode);
			cmd.addParameter("@P_TMST_CODE", pTmstCode);
			cmd.addParameter("@P_TMST_DATE", pTmstDate);
			cmd.addParameter("@P_TMST_MAINT_IND", pTmstMaintInd);
			cmd.addParameter("@P_USER", pUser);
			cmd.addParameter("@P_REFUND_DATE", pRefundDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="EnrollmentRecRow", dataSourceName="ENROLLMENT_REC")
	public static class EnrollmentRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_ESTS_CODE")
		public NString REstsCode;
		@DbRecordField(dataSourceName="R_ESTS_DATE")
		public NDate REstsDate;
		@DbRecordField(dataSourceName="R_MIN_HRS")
		public NNumber RMinHrs;
		@DbRecordField(dataSourceName="R_MHRS_OVER")
		public NNumber RMhrsOver;
		@DbRecordField(dataSourceName="R_MINH_SRCE_CDE")
		public NString RMinhSrceCde;
		@DbRecordField(dataSourceName="R_MAXH_SRCE_CDE")
		public NString RMaxhSrceCde;
		@DbRecordField(dataSourceName="R_AR_IND")
		public NString RArInd;
		@DbRecordField(dataSourceName="R_ASSESSMENT_DATE")
		public NDate RAssessmentDate;
		@DbRecordField(dataSourceName="R_ADD_DATE")
		public NDate RAddDate;
		@DbRecordField(dataSourceName="R_RGRE_CODE")
		public NString RRgreCode;
		@DbRecordField(dataSourceName="R_TMST_CODE")
		public NString RTmstCode;
		@DbRecordField(dataSourceName="R_TMST_DATE")
		public NDate RTmstDate;
		@DbRecordField(dataSourceName="R_TMST_MAINT_IND")
		public NString RTmstMaintInd;
		@DbRecordField(dataSourceName="R_USER")
		public NString RUser;
		@DbRecordField(dataSourceName="R_REFUND_DATE")
		public NDate RRefundDate;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
