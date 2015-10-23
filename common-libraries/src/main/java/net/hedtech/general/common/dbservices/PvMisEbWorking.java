package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvMisEbWorking {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB_WORKING.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pReportNo,NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB_WORKING.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(MisEbWorkingRecRow recOne,MisEbWorkingRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB_WORKING.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, MisEbWorkingRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, MisEbWorkingRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NString pReportNo,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB_WORKING.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB_WORKING.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NString pReportNo,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB_WORKING.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pReportNo,NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB_WORKING.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NString pReportNo,NNumber pPidm,NString pDistrictIdentifier,NString pTermIdentifier,NString pId,NString pLastName,NString pFirstName,NString pMi,NString pIdentifier,NString pIdentifierStatus,NDate pBirthDate,NString pGender,NString pCitizenInd,NString pDisabilityStatus,NString pEmplEe06Occupation,NString pEmplClassification,NString pEmplStatus,NString pEmplContrDuration,NNumber pAnnualSalary,NNumber pAddlCompensation,NString pMultEthnCde,NString pFinalInd,NString pUserId,NString pDataOrigin,NDate pReportStartDate,NDate pReportEndDate,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB_WORKING.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DISTRICT_IDENTIFIER", pDistrictIdentifier);
			cmd.addParameter("@P_TERM_IDENTIFIER", pTermIdentifier);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_IDENTIFIER", pIdentifier);
			cmd.addParameter("@P_IDENTIFIER_STATUS", pIdentifierStatus);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_GENDER", pGender);
			cmd.addParameter("@P_CITIZEN_IND", pCitizenInd);
			cmd.addParameter("@P_DISABILITY_STATUS", pDisabilityStatus);
			cmd.addParameter("@P_EMPL_EE06_OCCUPATION", pEmplEe06Occupation);
			cmd.addParameter("@P_EMPL_CLASSIFICATION", pEmplClassification);
			cmd.addParameter("@P_EMPL_STATUS", pEmplStatus);
			cmd.addParameter("@P_EMPL_CONTR_DURATION", pEmplContrDuration);
			cmd.addParameter("@P_ANNUAL_SALARY", pAnnualSalary);
			cmd.addParameter("@P_ADDL_COMPENSATION", pAddlCompensation);
			cmd.addParameter("@P_MULT_ETHN_CDE", pMultEthnCde);
			cmd.addParameter("@P_FINAL_IND", pFinalInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_REPORT_START_DATE", pReportStartDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pReportNo,NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB_WORKING.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NString pReportNo,NNumber pPidm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB_WORKING.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NString pReportNo,NNumber pPidm,NString pDistrictIdentifier,NString pTermIdentifier,NString pId,NString pLastName,NString pFirstName,NString pMi,NString pIdentifier,NString pIdentifierStatus,NDate pBirthDate,NString pGender,NString pCitizenInd,NString pDisabilityStatus,NString pEmplEe06Occupation,NString pEmplClassification,NString pEmplStatus,NString pEmplContrDuration,NNumber pAnnualSalary,NNumber pAddlCompensation,NString pMultEthnCde,NString pFinalInd,NString pUserId,NString pDataOrigin,NDate pReportStartDate,NDate pReportEndDate,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_MIS_EB_WORKING.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPORT_NO", pReportNo);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_DISTRICT_IDENTIFIER", pDistrictIdentifier);
			cmd.addParameter("@P_TERM_IDENTIFIER", pTermIdentifier);
			cmd.addParameter("@P_ID", pId);
			cmd.addParameter("@P_LAST_NAME", pLastName);
			cmd.addParameter("@P_FIRST_NAME", pFirstName);
			cmd.addParameter("@P_MI", pMi);
			cmd.addParameter("@P_IDENTIFIER", pIdentifier);
			cmd.addParameter("@P_IDENTIFIER_STATUS", pIdentifierStatus);
			cmd.addParameter("@P_BIRTH_DATE", pBirthDate);
			cmd.addParameter("@P_GENDER", pGender);
			cmd.addParameter("@P_CITIZEN_IND", pCitizenInd);
			cmd.addParameter("@P_DISABILITY_STATUS", pDisabilityStatus);
			cmd.addParameter("@P_EMPL_EE06_OCCUPATION", pEmplEe06Occupation);
			cmd.addParameter("@P_EMPL_CLASSIFICATION", pEmplClassification);
			cmd.addParameter("@P_EMPL_STATUS", pEmplStatus);
			cmd.addParameter("@P_EMPL_CONTR_DURATION", pEmplContrDuration);
			cmd.addParameter("@P_ANNUAL_SALARY", pAnnualSalary);
			cmd.addParameter("@P_ADDL_COMPENSATION", pAddlCompensation);
			cmd.addParameter("@P_MULT_ETHN_CDE", pMultEthnCde);
			cmd.addParameter("@P_FINAL_IND", pFinalInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_REPORT_START_DATE", pReportStartDate);
			cmd.addParameter("@P_REPORT_END_DATE", pReportEndDate);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="MisEbWorkingRecRow", dataSourceName="MIS_EB_WORKING_REC", rowType=true)
	public static class MisEbWorkingRecRow
	{
		@DbRecordField(dataSourceName="R_REPORT_NO")
		public NString RReportNo;
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_DISTRICT_IDENTIFIER")
		public NString RDistrictIdentifier;
		@DbRecordField(dataSourceName="R_TERM_IDENTIFIER")
		public NString RTermIdentifier;
		@DbRecordField(dataSourceName="R_ID")
		public NString RId;
		@DbRecordField(dataSourceName="R_LAST_NAME")
		public NString RLastName;
		@DbRecordField(dataSourceName="R_FIRST_NAME")
		public NString RFirstName;
		@DbRecordField(dataSourceName="R_MI")
		public NString RMi;
		@DbRecordField(dataSourceName="R_IDENTIFIER")
		public NString RIdentifier;
		@DbRecordField(dataSourceName="R_IDENTIFIER_STATUS")
		public NString RIdentifierStatus;
		@DbRecordField(dataSourceName="R_BIRTH_DATE")
		public NDate RBirthDate;
		@DbRecordField(dataSourceName="R_GENDER")
		public NString RGender;
		@DbRecordField(dataSourceName="R_CITIZEN_IND")
		public NString RCitizenInd;
		@DbRecordField(dataSourceName="R_DISABILITY_STATUS")
		public NString RDisabilityStatus;
		@DbRecordField(dataSourceName="R_EMPL_EE06_OCCUPATION")
		public NString REmplEe06Occupation;
		@DbRecordField(dataSourceName="R_EMPL_CLASSIFICATION")
		public NString REmplClassification;
		@DbRecordField(dataSourceName="R_EMPL_STATUS")
		public NString REmplStatus;
		@DbRecordField(dataSourceName="R_EMPL_CONTR_DURATION")
		public NString REmplContrDuration;
		@DbRecordField(dataSourceName="R_ANNUAL_SALARY")
		public NNumber RAnnualSalary;
		@DbRecordField(dataSourceName="R_ADDL_COMPENSATION")
		public NNumber RAddlCompensation;
		@DbRecordField(dataSourceName="R_MULT_ETHN_CDE")
		public NString RMultEthnCde;
		@DbRecordField(dataSourceName="R_FINAL_IND")
		public NString RFinalInd;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_REPORT_START_DATE")
		public NDate RReportStartDate;
		@DbRecordField(dataSourceName="R_REPORT_END_DATE")
		public NDate RReportEndDate;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
