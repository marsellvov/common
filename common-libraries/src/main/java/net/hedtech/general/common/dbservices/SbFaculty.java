package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class SbFaculty {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pTermCodeEff,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FacultyRecRow recOne,FacultyRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FacultyRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FacultyRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pTermCodeEff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pTermCodeEff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pTermCodeEff,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneScheduled(NNumber pPidm,NString pTermCodeEff) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY.F_QUERY_ONE_SCHEDULED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pTermCodeEff,NString pFcstCode,NString pFctgCode,NString pFstpCode,NString pFcntCode,NString pSchdInd,NString pAdvrInd,NDate pFcstDate,NString pWkldCode,NString pCntrCode,NDate pAppointDate,NString pDataOrigin,NString pUserId,NString pOverrideProcessInd,NString pOverrideProcUserid,NDate pOverrideProcDate,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCST_CODE", pFcstCode);
			cmd.addParameter("@P_FCTG_CODE", pFctgCode);
			cmd.addParameter("@P_FSTP_CODE", pFstpCode);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_SCHD_IND", pSchdInd);
			cmd.addParameter("@P_ADVR_IND", pAdvrInd);
			cmd.addParameter("@P_FCST_DATE", pFcstDate);
			cmd.addParameter("@P_WKLD_CODE", pWkldCode);
			cmd.addParameter("@P_CNTR_CODE", pCntrCode);
			cmd.addParameter("@P_APPOINT_DATE", pAppointDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_OVERRIDE_PROCESS_IND", pOverrideProcessInd);
			cmd.addParameter("@P_OVERRIDE_PROC_USERID", pOverrideProcUserid);
			cmd.addParameter("@P_OVERRIDE_PROC_DATE", pOverrideProcDate);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pTermCodeEff,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,NString pTermCodeEff,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pTermCodeEff,NString pFcstCode,NString pFctgCode,NString pFstpCode,NString pFcntCode,NString pSchdInd,NString pAdvrInd,NDate pFcstDate,NString pWkldCode,NString pCntrCode,NDate pAppointDate,NString pDataOrigin,NString pUserId,NString pOverrideProcessInd,NString pOverrideProcUserid,NDate pOverrideProcDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("SB_FACULTY.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TERM_CODE_EFF", pTermCodeEff);
			cmd.addParameter("@P_FCST_CODE", pFcstCode);
			cmd.addParameter("@P_FCTG_CODE", pFctgCode);
			cmd.addParameter("@P_FSTP_CODE", pFstpCode);
			cmd.addParameter("@P_FCNT_CODE", pFcntCode);
			cmd.addParameter("@P_SCHD_IND", pSchdInd);
			cmd.addParameter("@P_ADVR_IND", pAdvrInd);
			cmd.addParameter("@P_FCST_DATE", pFcstDate);
			cmd.addParameter("@P_WKLD_CODE", pWkldCode);
			cmd.addParameter("@P_CNTR_CODE", pCntrCode);
			cmd.addParameter("@P_APPOINT_DATE", pAppointDate);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_OVERRIDE_PROCESS_IND", pOverrideProcessInd);
			cmd.addParameter("@P_OVERRIDE_PROC_USERID", pOverrideProcUserid);
			cmd.addParameter("@P_OVERRIDE_PROC_DATE", pOverrideProcDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FacultyRecRow", dataSourceName="FACULTY_REC")
	public static class FacultyRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_TERM_CODE_EFF")
		public NString RTermCodeEff;
		@DbRecordField(dataSourceName="R_FCST_CODE")
		public NString RFcstCode;
		@DbRecordField(dataSourceName="R_FCTG_CODE")
		public NString RFctgCode;
		@DbRecordField(dataSourceName="R_FSTP_CODE")
		public NString RFstpCode;
		@DbRecordField(dataSourceName="R_FCNT_CODE")
		public NString RFcntCode;
		@DbRecordField(dataSourceName="R_SCHD_IND")
		public NString RSchdInd;
		@DbRecordField(dataSourceName="R_ADVR_IND")
		public NString RAdvrInd;
		@DbRecordField(dataSourceName="R_FCST_DATE")
		public NDate RFcstDate;
		@DbRecordField(dataSourceName="R_WKLD_CODE")
		public NString RWkldCode;
		@DbRecordField(dataSourceName="R_CNTR_CODE")
		public NString RCntrCode;
		@DbRecordField(dataSourceName="R_APPOINT_DATE")
		public NDate RAppointDate;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_OVERRIDE_PROCESS_IND")
		public NString ROverrideProcessInd;
		@DbRecordField(dataSourceName="R_OVERRIDE_PROC_USERID")
		public NString ROverrideProcUserid;
		@DbRecordField(dataSourceName="R_OVERRIDE_PROC_DATE")
		public NDate ROverrideProcDate;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
