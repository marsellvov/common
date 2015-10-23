package net.hedtech.general.common.dbservices;

import static morphis.foundations.core.types.Types.toNumber;
import static morphis.foundations.core.types.Types.toStr;

import java.util.*;

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbW2Federal {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_FEDERAL.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_FEDERAL.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(W2FederalRecRow recOne,W2FederalRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_FEDERAL.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, W2FederalRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, W2FederalRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_FEDERAL.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_FEDERAL.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static Cursor fQueryOne(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_FEDERAL.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_FEDERAL.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		//MORPHIS TODO: (JP 21-JAN-2015) Changed DataCursor to Cursor
		public static Cursor fQueryOneMax(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm) { 
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_FEDERAL.F_QUERY_ONE_MAX", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(Cursor.class);

		}
		
		public static void pCreate(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NString pStatus,NString pUserId,NString pStatutoryEmployeeInd,NString pRetirementPlanInd,NString pThirdPartySickInd,NString pEmplSsn,NString pEmplLastName,NString pEmplFirstName,NString pEmplMi,NString pEmplSuffix,NString pDataOrigin,Ref<NNumber> pSeqNoOut,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_FEDERAL.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_STATUTORY_EMPLOYEE_IND", pStatutoryEmployeeInd);
			cmd.addParameter("@P_RETIREMENT_PLAN_IND", pRetirementPlanInd);
			cmd.addParameter("@P_THIRD_PARTY_SICK_IND", pThirdPartySickInd);
			cmd.addParameter("@P_EMPL_SSN", pEmplSsn);
			cmd.addParameter("@P_EMPL_LAST_NAME", pEmplLastName);
			cmd.addParameter("@P_EMPL_FIRST_NAME", pEmplFirstName);
			cmd.addParameter("@P_EMPL_MI", pEmplMi);
			cmd.addParameter("@P_EMPL_SUFFIX", pEmplSuffix);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SEQ_NO_OUT", NNumber.class);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pSeqNoOut.val = cmd.getParameterValue("@P_SEQ_NO_OUT", NNumber.class);
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_FEDERAL.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_FEDERAL.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,NString pStatus,NString pUserId,NString pStatutoryEmployeeInd,NString pRetirementPlanInd,NString pThirdPartySickInd,NString pEmplSsn,NString pEmplLastName,NString pEmplFirstName,NString pEmplMi,NString pEmplSuffix,NString pDataOrigin,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_W2_FEDERAL.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_STATUS", pStatus);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_STATUTORY_EMPLOYEE_IND", pStatutoryEmployeeInd);
			cmd.addParameter("@P_RETIREMENT_PLAN_IND", pRetirementPlanInd);
			cmd.addParameter("@P_THIRD_PARTY_SICK_IND", pThirdPartySickInd);
			cmd.addParameter("@P_EMPL_SSN", pEmplSsn);
			cmd.addParameter("@P_EMPL_LAST_NAME", pEmplLastName);
			cmd.addParameter("@P_EMPL_FIRST_NAME", pEmplFirstName);
			cmd.addParameter("@P_EMPL_MI", pEmplMi);
			cmd.addParameter("@P_EMPL_SUFFIX", pEmplSuffix);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="W2FederalRecRow", dataSourceName="W2_FEDERAL_REC")
	public static class W2FederalRecRow
	{
		@DbRecordField(dataSourceName="R_YEAR")
		public NNumber RYear;
		@DbRecordField(dataSourceName="R_QUARTER")
		public NNumber RQuarter;
		@DbRecordField(dataSourceName="R_EMPR_CODE")
		public NString REmprCode;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_SEQ_NO")
		public NNumber RSeqNo;
		@DbRecordField(dataSourceName="R_STATUS")
		public NString RStatus;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_STATUTORY_EMPLOYEE_IND")
		public NString RStatutoryEmployeeInd;
		@DbRecordField(dataSourceName="R_RETIREMENT_PLAN_IND")
		public NString RRetirementPlanInd;
		@DbRecordField(dataSourceName="R_THIRD_PARTY_SICK_IND")
		public NString RThirdPartySickInd;
		@DbRecordField(dataSourceName="R_EMPL_SSN")
		public NString REmplSsn;
		@DbRecordField(dataSourceName="R_EMPL_LAST_NAME")
		public NString REmplLastName;
		@DbRecordField(dataSourceName="R_EMPL_FIRST_NAME")
		public NString REmplFirstName;
		@DbRecordField(dataSourceName="R_EMPL_MI")
		public NString REmplMi;
		@DbRecordField(dataSourceName="R_EMPL_SUFFIX")
		public NString REmplSuffix;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_CONTROL_NUMBER")
		public NNumber RControlNumber;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	
		public W2FederalRecRow() {
			super();
		}
		
		public W2FederalRecRow( Row w2FederalRefResults ) {
			super();
			RYear = toNumber(w2FederalRefResults.getObject(1));
			RQuarter = toNumber(w2FederalRefResults.getObject(2));
			REmprCode = toStr(w2FederalRefResults.getObject(3));
			RPidm = toNumber(w2FederalRefResults.getObject(4));
			RSeqNo = toNumber(w2FederalRefResults.getObject(5));
			RStatus = toStr(w2FederalRefResults.getObject(6));
			RUserId = toStr(w2FederalRefResults.getObject(7));
			RStatutoryEmployeeInd = toStr(w2FederalRefResults.getObject(8));
			RRetirementPlanInd = toStr(w2FederalRefResults.getObject(9));
			RThirdPartySickInd = toStr(w2FederalRefResults.getObject(10));
			REmplSsn = toStr(w2FederalRefResults.getObject(11));
			REmplLastName = toStr(w2FederalRefResults.getObject(12));
			REmplFirstName = toStr(w2FederalRefResults.getObject(13));
			REmplMi = toStr(w2FederalRefResults.getObject(14));
			REmplSuffix = toStr(w2FederalRefResults.getObject(15));
			RDataOrigin = toStr(w2FederalRefResults.getObject(16));
			RControlNumber = toNumber(w2FederalRefResults.getObject(17));
			RInternalRecordId = toStr(w2FederalRefResults.getObject(18));
			
		}
	
	}
	
	

	
	
}
