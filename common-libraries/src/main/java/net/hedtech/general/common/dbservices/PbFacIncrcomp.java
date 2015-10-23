package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbFacIncrcomp {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRCOMP.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fChkFacultyJobAccess(NString pTerm,NNumber pPidm,NString pCrn,NString pCategory,NString pAccessInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRCOMP.F_CHK_FACULTY_JOB_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM", pTerm);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_ACCESS_IND", pAccessInd);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fExists(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,NString pFlicCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRCOMP.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_FLIC_CODE", pFlicCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(FacIncrcompRecRow recOne,FacIncrcompRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRCOMP.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, FacIncrcompRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, FacIncrcompRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,NString pFlicCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRCOMP.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_FLIC_CODE", pFlicCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRCOMP.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,NString pFlicCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRCOMP.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_FLIC_CODE", pFlicCode);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,NString pFlicCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRCOMP.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_FLIC_CODE", pFlicCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,NString pFlicCode,NString pCalcMethod,NString pUserId,NString pDataOrigin,NNumber pRate,NNumber pCrseCalcPercent,NNumber pCompCreditHrs,NNumber pCompHrsWeek,NNumber pCompEnrl,NNumber pCompWorkload,NNumber pCompensationAmount,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRCOMP.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_FLIC_CODE", pFlicCode);
			cmd.addParameter("@P_CALC_METHOD", pCalcMethod);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_RATE", pRate);
			cmd.addParameter("@P_CRSE_CALC_PERCENT", pCrseCalcPercent);
			cmd.addParameter("@P_COMP_CREDIT_HRS", pCompCreditHrs);
			cmd.addParameter("@P_COMP_HRS_WEEK", pCompHrsWeek);
			cmd.addParameter("@P_COMP_ENRL", pCompEnrl);
			cmd.addParameter("@P_COMP_WORKLOAD", pCompWorkload);
			cmd.addParameter("@P_COMPENSATION_AMOUNT", pCompensationAmount);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,NString pFlicCode,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRCOMP.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_FLIC_CODE", pFlicCode);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,NString pFlicCode,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRCOMP.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_FLIC_CODE", pFlicCode);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pTermCode,NNumber pPidm,NString pCrn,NString pCategory,NString pFlicCode,NString pCalcMethod,NString pUserId,NString pDataOrigin,NNumber pRate,NNumber pCrseCalcPercent,NNumber pCompCreditHrs,NNumber pCompHrsWeek,NNumber pCompEnrl,NNumber pCompWorkload,NNumber pCompensationAmount,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_FAC_INCRCOMP.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TERM_CODE", pTermCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CRN", pCrn);
			cmd.addParameter("@P_CATEGORY", pCategory);
			cmd.addParameter("@P_FLIC_CODE", pFlicCode);
			cmd.addParameter("@P_CALC_METHOD", pCalcMethod);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_RATE", pRate);
			cmd.addParameter("@P_CRSE_CALC_PERCENT", pCrseCalcPercent);
			cmd.addParameter("@P_COMP_CREDIT_HRS", pCompCreditHrs);
			cmd.addParameter("@P_COMP_HRS_WEEK", pCompHrsWeek);
			cmd.addParameter("@P_COMP_ENRL", pCompEnrl);
			cmd.addParameter("@P_COMP_WORKLOAD", pCompWorkload);
			cmd.addParameter("@P_COMPENSATION_AMOUNT", pCompensationAmount);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="FacIncrcompRecRow", dataSourceName="FAC_INCRCOMP_REC")
	public static class FacIncrcompRecRow
	{
		@DbRecordField(dataSourceName="R_TERM_CODE")
		public NString RTermCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_CRN")
		public NString RCrn;
		@DbRecordField(dataSourceName="R_CATEGORY")
		public NString RCategory;
		@DbRecordField(dataSourceName="R_FLIC_CODE")
		public NString RFlicCode;
		@DbRecordField(dataSourceName="R_CALC_METHOD")
		public NString RCalcMethod;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_RATE")
		public NNumber RRate;
		@DbRecordField(dataSourceName="R_CRSE_CALC_PERCENT")
		public NNumber RCrseCalcPercent;
		@DbRecordField(dataSourceName="R_COMP_CREDIT_HRS")
		public NNumber RCompCreditHrs;
		@DbRecordField(dataSourceName="R_COMP_HRS_WEEK")
		public NNumber RCompHrsWeek;
		@DbRecordField(dataSourceName="R_COMP_ENRL")
		public NNumber RCompEnrl;
		@DbRecordField(dataSourceName="R_COMP_WORKLOAD")
		public NNumber RCompWorkload;
		@DbRecordField(dataSourceName="R_COMPENSATION_AMOUNT")
		public NNumber RCompensationAmount;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
