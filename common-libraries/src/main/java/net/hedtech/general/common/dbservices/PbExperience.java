package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PbExperience {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EXPERIENCE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EXPERIENCE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(ExperienceRecRow recOne,ExperienceRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EXPERIENCE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, ExperienceRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, ExperienceRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll(NNumber pPidm,NString pPosnTitle,NString pEmtyCode,NString pEmprName,NDate pStartDate,NDate pEndDate,NNumber pCurrSalary,NNumber pCurrHourly,NString pReasonLeft,NNumber pEmpsSupervise,NString pSuperName,NString pCtryCodeSuperPhone,NString pSuperPhoneArea,NString pSuperPhoneNumber,NString pSuperPhoneExt,NString pContactInd,NString pSuperComment,NString pPosnDuties,NString pStatCode,NString pNatnCode,NString pUserId,NString pDataOrigin,NDate pHireActStartDate,NString pHireVerifRecInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EXPERIENCE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN_TITLE", pPosnTitle);
			cmd.addParameter("@P_EMTY_CODE", pEmtyCode);
			cmd.addParameter("@P_EMPR_NAME", pEmprName);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_CURR_SALARY", pCurrSalary);
			cmd.addParameter("@P_CURR_HOURLY", pCurrHourly);
			cmd.addParameter("@P_REASON_LEFT", pReasonLeft);
			cmd.addParameter("@P_EMPS_SUPERVISE", pEmpsSupervise);
			cmd.addParameter("@P_SUPER_NAME", pSuperName);
			cmd.addParameter("@P_CTRY_CODE_SUPER_PHONE", pCtryCodeSuperPhone);
			cmd.addParameter("@P_SUPER_PHONE_AREA", pSuperPhoneArea);
			cmd.addParameter("@P_SUPER_PHONE_NUMBER", pSuperPhoneNumber);
			cmd.addParameter("@P_SUPER_PHONE_EXT", pSuperPhoneExt);
			cmd.addParameter("@P_CONTACT_IND", pContactInd);
			cmd.addParameter("@P_SUPER_COMMENT", pSuperComment);
			cmd.addParameter("@P_POSN_DUTIES", pPosnDuties);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_HIRE_ACT_START_DATE", pHireActStartDate);
			cmd.addParameter("@P_HIRE_VERIF_REC_IND", pHireVerifRecInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EXPERIENCE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm,NString pPosnTitle,NString pEmtyCode,NString pEmprName,NDate pStartDate,NDate pEndDate,NNumber pCurrSalary,NNumber pCurrHourly,NString pReasonLeft,NNumber pEmpsSupervise,NString pSuperName,NString pCtryCodeSuperPhone,NString pSuperPhoneArea,NString pSuperPhoneNumber,NString pSuperPhoneExt,NString pContactInd,NString pSuperComment,NString pPosnDuties,NString pStatCode,NString pNatnCode,NString pUserId,NString pDataOrigin,NDate pHireActStartDate,NString pHireVerifRecInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EXPERIENCE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN_TITLE", pPosnTitle);
			cmd.addParameter("@P_EMTY_CODE", pEmtyCode);
			cmd.addParameter("@P_EMPR_NAME", pEmprName);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_CURR_SALARY", pCurrSalary);
			cmd.addParameter("@P_CURR_HOURLY", pCurrHourly);
			cmd.addParameter("@P_REASON_LEFT", pReasonLeft);
			cmd.addParameter("@P_EMPS_SUPERVISE", pEmpsSupervise);
			cmd.addParameter("@P_SUPER_NAME", pSuperName);
			cmd.addParameter("@P_CTRY_CODE_SUPER_PHONE", pCtryCodeSuperPhone);
			cmd.addParameter("@P_SUPER_PHONE_AREA", pSuperPhoneArea);
			cmd.addParameter("@P_SUPER_PHONE_NUMBER", pSuperPhoneNumber);
			cmd.addParameter("@P_SUPER_PHONE_EXT", pSuperPhoneExt);
			cmd.addParameter("@P_CONTACT_IND", pContactInd);
			cmd.addParameter("@P_SUPER_COMMENT", pSuperComment);
			cmd.addParameter("@P_POSN_DUTIES", pPosnDuties);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_HIRE_ACT_START_DATE", pHireActStartDate);
			cmd.addParameter("@P_HIRE_VERIF_REC_IND", pHireVerifRecInd);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EXPERIENCE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pPosnTitle,NString pEmtyCode,NString pEmprName,NDate pStartDate,NDate pEndDate,NNumber pCurrSalary,NNumber pCurrHourly,NString pReasonLeft,NNumber pEmpsSupervise,NString pSuperName,NString pCtryCodeSuperPhone,NString pSuperPhoneArea,NString pSuperPhoneNumber,NString pSuperPhoneExt,NString pContactInd,NString pSuperComment,NString pPosnDuties,NString pStatCode,NString pNatnCode,NString pUserId,NString pDataOrigin,NDate pHireActStartDate,NString pHireVerifRecInd,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EXPERIENCE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN_TITLE", pPosnTitle);
			cmd.addParameter("@P_EMTY_CODE", pEmtyCode);
			cmd.addParameter("@P_EMPR_NAME", pEmprName);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_CURR_SALARY", pCurrSalary);
			cmd.addParameter("@P_CURR_HOURLY", pCurrHourly);
			cmd.addParameter("@P_REASON_LEFT", pReasonLeft);
			cmd.addParameter("@P_EMPS_SUPERVISE", pEmpsSupervise);
			cmd.addParameter("@P_SUPER_NAME", pSuperName);
			cmd.addParameter("@P_CTRY_CODE_SUPER_PHONE", pCtryCodeSuperPhone);
			cmd.addParameter("@P_SUPER_PHONE_AREA", pSuperPhoneArea);
			cmd.addParameter("@P_SUPER_PHONE_NUMBER", pSuperPhoneNumber);
			cmd.addParameter("@P_SUPER_PHONE_EXT", pSuperPhoneExt);
			cmd.addParameter("@P_CONTACT_IND", pContactInd);
			cmd.addParameter("@P_SUPER_COMMENT", pSuperComment);
			cmd.addParameter("@P_POSN_DUTIES", pPosnDuties);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_HIRE_ACT_START_DATE", pHireActStartDate);
			cmd.addParameter("@P_HIRE_VERIF_REC_IND", pHireVerifRecInd);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pCreateToclob(NNumber pPidm,NString pPosnTitle,NString pEmtyCode,NString pEmprName,NDate pStartDate,NDate pEndDate,NNumber pCurrSalary,NNumber pCurrHourly,NString pReasonLeft,NNumber pEmpsSupervise,NString pSuperName,NString pCtryCodeSuperPhone,NString pSuperPhoneArea,NString pSuperPhoneNumber,NString pSuperPhoneExt,NString pContactInd,NString pSuperComment,NString pPosnDuties,NString pStatCode,NString pNatnCode,NString pUserId,NString pDataOrigin,NDate pHireActStartDate,NString pHireVerifRecInd,Ref<NString> pRowidOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EXPERIENCE.P_CREATE_TOCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN_TITLE", pPosnTitle);
			cmd.addParameter("@P_EMTY_CODE", pEmtyCode);
			cmd.addParameter("@P_EMPR_NAME", pEmprName);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_CURR_SALARY", pCurrSalary);
			cmd.addParameter("@P_CURR_HOURLY", pCurrHourly);
			cmd.addParameter("@P_REASON_LEFT", pReasonLeft);
			cmd.addParameter("@P_EMPS_SUPERVISE", pEmpsSupervise);
			cmd.addParameter("@P_SUPER_NAME", pSuperName);
			cmd.addParameter("@P_CTRY_CODE_SUPER_PHONE", pCtryCodeSuperPhone);
			cmd.addParameter("@P_SUPER_PHONE_AREA", pSuperPhoneArea);
			cmd.addParameter("@P_SUPER_PHONE_NUMBER", pSuperPhoneNumber);
			cmd.addParameter("@P_SUPER_PHONE_EXT", pSuperPhoneExt);
			cmd.addParameter("@P_CONTACT_IND", pContactInd);
			cmd.addParameter("@P_SUPER_COMMENT", pSuperComment);
			cmd.addParameter("@P_POSN_DUTIES", pPosnDuties);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_HIRE_ACT_START_DATE", pHireActStartDate);
			cmd.addParameter("@P_HIRE_VERIF_REC_IND", pHireVerifRecInd);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EXPERIENCE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EXPERIENCE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pPosnTitle,NString pEmtyCode,NString pEmprName,NDate pStartDate,NDate pEndDate,NNumber pCurrSalary,NNumber pCurrHourly,NString pReasonLeft,NNumber pEmpsSupervise,NString pSuperName,NString pCtryCodeSuperPhone,NString pSuperPhoneArea,NString pSuperPhoneNumber,NString pSuperPhoneExt,NString pContactInd,NString pSuperComment,NString pPosnDuties,NString pStatCode,NString pNatnCode,NString pUserId,NString pDataOrigin,NDate pHireActStartDate,NString pHireVerifRecInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EXPERIENCE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN_TITLE", pPosnTitle);
			cmd.addParameter("@P_EMTY_CODE", pEmtyCode);
			cmd.addParameter("@P_EMPR_NAME", pEmprName);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_CURR_SALARY", pCurrSalary);
			cmd.addParameter("@P_CURR_HOURLY", pCurrHourly);
			cmd.addParameter("@P_REASON_LEFT", pReasonLeft);
			cmd.addParameter("@P_EMPS_SUPERVISE", pEmpsSupervise);
			cmd.addParameter("@P_SUPER_NAME", pSuperName);
			cmd.addParameter("@P_CTRY_CODE_SUPER_PHONE", pCtryCodeSuperPhone);
			cmd.addParameter("@P_SUPER_PHONE_AREA", pSuperPhoneArea);
			cmd.addParameter("@P_SUPER_PHONE_NUMBER", pSuperPhoneNumber);
			cmd.addParameter("@P_SUPER_PHONE_EXT", pSuperPhoneExt);
			cmd.addParameter("@P_CONTACT_IND", pContactInd);
			cmd.addParameter("@P_SUPER_COMMENT", pSuperComment);
			cmd.addParameter("@P_POSN_DUTIES", pPosnDuties);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_HIRE_ACT_START_DATE", pHireActStartDate);
			cmd.addParameter("@P_HIRE_VERIF_REC_IND", pHireVerifRecInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pUpdateToclob(NNumber pPidm,NString pPosnTitle,NString pEmtyCode,NString pEmprName,NDate pStartDate,NDate pEndDate,NNumber pCurrSalary,NNumber pCurrHourly,NString pReasonLeft,NNumber pEmpsSupervise,NString pSuperName,NString pCtryCodeSuperPhone,NString pSuperPhoneArea,NString pSuperPhoneNumber,NString pSuperPhoneExt,NString pContactInd,NString pSuperComment,NString pPosnDuties,NString pStatCode,NString pNatnCode,NString pUserId,NString pDataOrigin,NDate pHireActStartDate,NString pHireVerifRecInd,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PB_EXPERIENCE.P_UPDATE_TOCLOB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_POSN_TITLE", pPosnTitle);
			cmd.addParameter("@P_EMTY_CODE", pEmtyCode);
			cmd.addParameter("@P_EMPR_NAME", pEmprName);
			cmd.addParameter("@P_START_DATE", pStartDate);
			cmd.addParameter("@P_END_DATE", pEndDate);
			cmd.addParameter("@P_CURR_SALARY", pCurrSalary);
			cmd.addParameter("@P_CURR_HOURLY", pCurrHourly);
			cmd.addParameter("@P_REASON_LEFT", pReasonLeft);
			cmd.addParameter("@P_EMPS_SUPERVISE", pEmpsSupervise);
			cmd.addParameter("@P_SUPER_NAME", pSuperName);
			cmd.addParameter("@P_CTRY_CODE_SUPER_PHONE", pCtryCodeSuperPhone);
			cmd.addParameter("@P_SUPER_PHONE_AREA", pSuperPhoneArea);
			cmd.addParameter("@P_SUPER_PHONE_NUMBER", pSuperPhoneNumber);
			cmd.addParameter("@P_SUPER_PHONE_EXT", pSuperPhoneExt);
			cmd.addParameter("@P_CONTACT_IND", pContactInd);
			cmd.addParameter("@P_SUPER_COMMENT", pSuperComment);
			cmd.addParameter("@P_POSN_DUTIES", pPosnDuties);
			cmd.addParameter("@P_STAT_CODE", pStatCode);
			cmd.addParameter("@P_NATN_CODE", pNatnCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_HIRE_ACT_START_DATE", pHireActStartDate);
			cmd.addParameter("@P_HIRE_VERIF_REC_IND", pHireVerifRecInd);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="ExperienceRecRow", dataSourceName="EXPERIENCE_REC")
	public static class ExperienceRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_POSN_TITLE")
		public NString RPosnTitle;
		@DbRecordField(dataSourceName="R_EMTY_CODE")
		public NString REmtyCode;
		@DbRecordField(dataSourceName="R_EMPR_NAME")
		public NString REmprName;
		@DbRecordField(dataSourceName="R_START_DATE")
		public NDate RStartDate;
		@DbRecordField(dataSourceName="R_END_DATE")
		public NDate REndDate;
		@DbRecordField(dataSourceName="R_CURR_SALARY")
		public NNumber RCurrSalary;
		@DbRecordField(dataSourceName="R_CURR_HOURLY")
		public NNumber RCurrHourly;
		@DbRecordField(dataSourceName="R_REASON_LEFT")
		public NString RReasonLeft;
		@DbRecordField(dataSourceName="R_EMPS_SUPERVISE")
		public NNumber REmpsSupervise;
		@DbRecordField(dataSourceName="R_SUPER_NAME")
		public NString RSuperName;
		@DbRecordField(dataSourceName="R_CTRY_CODE_SUPER_PHONE")
		public NString RCtryCodeSuperPhone;
		@DbRecordField(dataSourceName="R_SUPER_PHONE_AREA")
		public NString RSuperPhoneArea;
		@DbRecordField(dataSourceName="R_SUPER_PHONE_NUMBER")
		public NString RSuperPhoneNumber;
		@DbRecordField(dataSourceName="R_SUPER_PHONE_EXT")
		public NString RSuperPhoneExt;
		@DbRecordField(dataSourceName="R_CONTACT_IND")
		public NString RContactInd;
		@DbRecordField(dataSourceName="R_SUPER_COMMENT")
		public NString RSuperComment;
		@DbRecordField(dataSourceName="R_POSN_DUTIES")
		public NString RPosnDuties;
		@DbRecordField(dataSourceName="R_STAT_CODE")
		public NString RStatCode;
		@DbRecordField(dataSourceName="R_NATN_CODE")
		public NString RNatnCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_HIRE_ACT_START_DATE")
		public NDate RHireActStartDate;
		@DbRecordField(dataSourceName="R_HIRE_VERIF_REC_IND")
		public NString RHireVerifRecInd;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
