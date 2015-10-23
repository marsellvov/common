package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PvEmployee {
		public static NInteger fApiVersion() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE.F_API_VERSION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NInteger.class);
				
			cmd.execute();

			return cmd.getReturnValue(NInteger.class);

		}
		
		public static NString fExists(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE.F_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fIsequal(EmployeeRecRow recOne,EmployeeRecRow recTwo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE.F_ISEQUAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter(DbTypes.createStructType("REC_ONE", recOne, EmployeeRecRow.class ));
			cmd.addParameter(DbTypes.createStructType("REC_TWO", recTwo, EmployeeRecRow.class ));
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static DataCursor fQueryAll() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE.F_QUERY_ALL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryByRowid(NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE.F_QUERY_BY_ROWID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOne(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE.F_QUERY_ONE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static DataCursor fQueryOneLock(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE.F_QUERY_ONE_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DataCursor.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();

			return cmd.getReturnValue(DataCursor.class);

		}
		
		public static void pCreate(NNumber pPidm,NString pEmplStatus,NString pCoasCodeHome,NString pOrgnCodeHome,NString pCoasCodeDist,NString pOrgnCodeDist,NString pEclsCode,NString pLcatCode,NString pBcatCode,NDate pFirstHireDate,NDate pCurrentHireDate,NDate pAdjServiceDate,NDate pSeniorityDate,NString pLreaCode,NDate pLoaBegDate,NDate pLoaEndDate,NString pTreaCode,NDate pTermDate,NString pI9FormInd,NDate pI9Date,NDate pI9ExpireDate,NString pWkprCode,NString pFlsaInd,NString pStgrCode,NNumber pDaysInCanada,NString p1042RecipientCd,NString pInternalFtPtInd,NString pDicdCode,NString pEgrpCode,NString pIpedsSoftMoneyInd,NDate pFirstWorkDate,NDate pLastWorkDate,NString pCalifPensionInd,NString pNrsiCode,NString pSsnLastName,NString pSsnFirstName,NString pSsnMi,NString pSsnSuffix,NString pJblnCode,NString pCollCode,NString pCampCode,NString pUserId,NString pDataOrigin,NString pEw2ConsentInd,NDate pEw2ConsentDate,NString pEw2ConsentUserId,Ref<NString> pRowidOut,NString pIpedsPrimaryFunction,NString pIpedsMedDentalInd,NString pEtaxConsentInd,NDate pEtaxConsentDate,NString pEtaxConsentUserId,NString pNewHireInd,NString pPersParticipantId,NString pPersApptId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE.P_CREATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMPL_STATUS", pEmplStatus);
			cmd.addParameter("@P_COAS_CODE_HOME", pCoasCodeHome);
			cmd.addParameter("@P_ORGN_CODE_HOME", pOrgnCodeHome);
			cmd.addParameter("@P_COAS_CODE_DIST", pCoasCodeDist);
			cmd.addParameter("@P_ORGN_CODE_DIST", pOrgnCodeDist);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
			cmd.addParameter("@P_FIRST_HIRE_DATE", pFirstHireDate);
			cmd.addParameter("@P_CURRENT_HIRE_DATE", pCurrentHireDate);
			cmd.addParameter("@P_ADJ_SERVICE_DATE", pAdjServiceDate);
			cmd.addParameter("@P_SENIORITY_DATE", pSeniorityDate);
			cmd.addParameter("@P_LREA_CODE", pLreaCode);
			cmd.addParameter("@P_LOA_BEG_DATE", pLoaBegDate);
			cmd.addParameter("@P_LOA_END_DATE", pLoaEndDate);
			cmd.addParameter("@P_TREA_CODE", pTreaCode);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
			cmd.addParameter("@P_I9_FORM_IND", pI9FormInd);
			cmd.addParameter("@P_I9_DATE", pI9Date);
			cmd.addParameter("@P_I9_EXPIRE_DATE", pI9ExpireDate);
			cmd.addParameter("@P_WKPR_CODE", pWkprCode);
			cmd.addParameter("@P_FLSA_IND", pFlsaInd);
			cmd.addParameter("@P_STGR_CODE", pStgrCode);
			cmd.addParameter("@P_DAYS_IN_CANADA", pDaysInCanada);
			cmd.addParameter("@P_1042_RECIPIENT_CD", p1042RecipientCd);
			cmd.addParameter("@P_INTERNAL_FT_PT_IND", pInternalFtPtInd);
			cmd.addParameter("@P_DICD_CODE", pDicdCode);
			cmd.addParameter("@P_EGRP_CODE", pEgrpCode);
			cmd.addParameter("@P_IPEDS_SOFT_MONEY_IND", pIpedsSoftMoneyInd);
			cmd.addParameter("@P_FIRST_WORK_DATE", pFirstWorkDate);
			cmd.addParameter("@P_LAST_WORK_DATE", pLastWorkDate);
			cmd.addParameter("@P_CALIF_PENSION_IND", pCalifPensionInd);
			cmd.addParameter("@P_NRSI_CODE", pNrsiCode);
			cmd.addParameter("@P_SSN_LAST_NAME", pSsnLastName);
			cmd.addParameter("@P_SSN_FIRST_NAME", pSsnFirstName);
			cmd.addParameter("@P_SSN_MI", pSsnMi);
			cmd.addParameter("@P_SSN_SUFFIX", pSsnSuffix);
			cmd.addParameter("@P_JBLN_CODE", pJblnCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_EW2_CONSENT_IND", pEw2ConsentInd);
			cmd.addParameter("@P_EW2_CONSENT_DATE", pEw2ConsentDate);
			cmd.addParameter("@P_EW2_CONSENT_USER_ID", pEw2ConsentUserId);
			cmd.addParameter("@P_ROWID_OUT", NString.class);
			cmd.addParameter("@P_IPEDS_PRIMARY_FUNCTION", pIpedsPrimaryFunction);
			cmd.addParameter("@P_IPEDS_MED_DENTAL_IND", pIpedsMedDentalInd);
			cmd.addParameter("@P_ETAX_CONSENT_IND", pEtaxConsentInd);
			cmd.addParameter("@P_ETAX_CONSENT_DATE", pEtaxConsentDate);
			cmd.addParameter("@P_ETAX_CONSENT_USER_ID", pEtaxConsentUserId);
			cmd.addParameter("@P_NEW_HIRE_IND", pNewHireInd);
			cmd.addParameter("@P_PERS_PARTICIPANT_ID", pPersParticipantId);
			cmd.addParameter("@P_PERS_APPT_ID", pPersApptId);
				
			cmd.execute();
			pRowidOut.val = cmd.getParameterValue("@P_ROWID_OUT", NString.class);


		}
		
		public static void pDelete(NNumber pPidm,NString pRowid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE.P_DELETE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID", pRowid);
				
			cmd.execute();


		}
		
		public static void pLock(NNumber pPidm,Ref<NString> pRowidInout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE.P_LOCK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ROWID_INOUT", pRowidInout, true);
				
			cmd.execute();
			pRowidInout.val = cmd.getParameterValue("@P_ROWID_INOUT", NString.class);


		}
		
		public static void pUpdate(NNumber pPidm,NString pEmplStatus,NString pCoasCodeHome,NString pOrgnCodeHome,NString pCoasCodeDist,NString pOrgnCodeDist,NString pEclsCode,NString pLcatCode,NString pBcatCode,NDate pFirstHireDate,NDate pCurrentHireDate,NDate pAdjServiceDate,NDate pSeniorityDate,NString pLreaCode,NDate pLoaBegDate,NDate pLoaEndDate,NString pTreaCode,NDate pTermDate,NString pI9FormInd,NDate pI9Date,NDate pI9ExpireDate,NString pWkprCode,NString pFlsaInd,NString pStgrCode,NNumber pDaysInCanada,NString p1042RecipientCd,NString pInternalFtPtInd,NString pDicdCode,NString pEgrpCode,NString pIpedsSoftMoneyInd,NDate pFirstWorkDate,NDate pLastWorkDate,NString pCalifPensionInd,NString pNrsiCode,NString pSsnLastName,NString pSsnFirstName,NString pSsnMi,NString pSsnSuffix,NString pJblnCode,NString pCollCode,NString pCampCode,NString pUserId,NString pDataOrigin,NString pEw2ConsentInd,NDate pEw2ConsentDate,NString pEw2ConsentUserId,NString pRowid,NString pIpedsPrimaryFunction,NString pIpedsMedDentalInd,NString pEtaxConsentInd,NDate pEtaxConsentDate,NString pEtaxConsentUserId,NString pNewHireInd,NString pPersParticipantId,NString pPersApptId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PV_EMPLOYEE.P_UPDATE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EMPL_STATUS", pEmplStatus);
			cmd.addParameter("@P_COAS_CODE_HOME", pCoasCodeHome);
			cmd.addParameter("@P_ORGN_CODE_HOME", pOrgnCodeHome);
			cmd.addParameter("@P_COAS_CODE_DIST", pCoasCodeDist);
			cmd.addParameter("@P_ORGN_CODE_DIST", pOrgnCodeDist);
			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
			cmd.addParameter("@P_LCAT_CODE", pLcatCode);
			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
			cmd.addParameter("@P_FIRST_HIRE_DATE", pFirstHireDate);
			cmd.addParameter("@P_CURRENT_HIRE_DATE", pCurrentHireDate);
			cmd.addParameter("@P_ADJ_SERVICE_DATE", pAdjServiceDate);
			cmd.addParameter("@P_SENIORITY_DATE", pSeniorityDate);
			cmd.addParameter("@P_LREA_CODE", pLreaCode);
			cmd.addParameter("@P_LOA_BEG_DATE", pLoaBegDate);
			cmd.addParameter("@P_LOA_END_DATE", pLoaEndDate);
			cmd.addParameter("@P_TREA_CODE", pTreaCode);
			cmd.addParameter("@P_TERM_DATE", pTermDate);
			cmd.addParameter("@P_I9_FORM_IND", pI9FormInd);
			cmd.addParameter("@P_I9_DATE", pI9Date);
			cmd.addParameter("@P_I9_EXPIRE_DATE", pI9ExpireDate);
			cmd.addParameter("@P_WKPR_CODE", pWkprCode);
			cmd.addParameter("@P_FLSA_IND", pFlsaInd);
			cmd.addParameter("@P_STGR_CODE", pStgrCode);
			cmd.addParameter("@P_DAYS_IN_CANADA", pDaysInCanada);
			cmd.addParameter("@P_1042_RECIPIENT_CD", p1042RecipientCd);
			cmd.addParameter("@P_INTERNAL_FT_PT_IND", pInternalFtPtInd);
			cmd.addParameter("@P_DICD_CODE", pDicdCode);
			cmd.addParameter("@P_EGRP_CODE", pEgrpCode);
			cmd.addParameter("@P_IPEDS_SOFT_MONEY_IND", pIpedsSoftMoneyInd);
			cmd.addParameter("@P_FIRST_WORK_DATE", pFirstWorkDate);
			cmd.addParameter("@P_LAST_WORK_DATE", pLastWorkDate);
			cmd.addParameter("@P_CALIF_PENSION_IND", pCalifPensionInd);
			cmd.addParameter("@P_NRSI_CODE", pNrsiCode);
			cmd.addParameter("@P_SSN_LAST_NAME", pSsnLastName);
			cmd.addParameter("@P_SSN_FIRST_NAME", pSsnFirstName);
			cmd.addParameter("@P_SSN_MI", pSsnMi);
			cmd.addParameter("@P_SSN_SUFFIX", pSsnSuffix);
			cmd.addParameter("@P_JBLN_CODE", pJblnCode);
			cmd.addParameter("@P_COLL_CODE", pCollCode);
			cmd.addParameter("@P_CAMP_CODE", pCampCode);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_EW2_CONSENT_IND", pEw2ConsentInd);
			cmd.addParameter("@P_EW2_CONSENT_DATE", pEw2ConsentDate);
			cmd.addParameter("@P_EW2_CONSENT_USER_ID", pEw2ConsentUserId);
			cmd.addParameter("@P_ROWID", pRowid);
			cmd.addParameter("@P_IPEDS_PRIMARY_FUNCTION", pIpedsPrimaryFunction);
			cmd.addParameter("@P_IPEDS_MED_DENTAL_IND", pIpedsMedDentalInd);
			cmd.addParameter("@P_ETAX_CONSENT_IND", pEtaxConsentInd);
			cmd.addParameter("@P_ETAX_CONSENT_DATE", pEtaxConsentDate);
			cmd.addParameter("@P_ETAX_CONSENT_USER_ID", pEtaxConsentUserId);
			cmd.addParameter("@P_NEW_HIRE_IND", pNewHireInd);
			cmd.addParameter("@P_PERS_PARTICIPANT_ID", pPersParticipantId);
			cmd.addParameter("@P_PERS_APPT_ID", pPersApptId);
				
			cmd.execute();


		}
		
	
	@DbRecordType(id="EmployeeRecRow", dataSourceName="EMPLOYEE_REC", needsInitialization=true)
	public static class EmployeeRecRow
	{
		@DbRecordField(dataSourceName="R_PIDM")
		public NNumber RPidm;
		@DbRecordField(dataSourceName="R_EMPL_STATUS")
		public NString REmplStatus;
		@DbRecordField(dataSourceName="R_COAS_CODE_HOME")
		public NString RCoasCodeHome;
		@DbRecordField(dataSourceName="R_ORGN_CODE_HOME")
		public NString ROrgnCodeHome;
		@DbRecordField(dataSourceName="R_COAS_CODE_DIST")
		public NString RCoasCodeDist;
		@DbRecordField(dataSourceName="R_ORGN_CODE_DIST")
		public NString ROrgnCodeDist;
		@DbRecordField(dataSourceName="R_ECLS_CODE")
		public NString REclsCode;
		@DbRecordField(dataSourceName="R_LCAT_CODE")
		public NString RLcatCode;
		@DbRecordField(dataSourceName="R_BCAT_CODE")
		public NString RBcatCode;
		@DbRecordField(dataSourceName="R_FIRST_HIRE_DATE")
		public NDate RFirstHireDate;
		@DbRecordField(dataSourceName="R_CURRENT_HIRE_DATE")
		public NDate RCurrentHireDate;
		@DbRecordField(dataSourceName="R_ADJ_SERVICE_DATE")
		public NDate RAdjServiceDate;
		@DbRecordField(dataSourceName="R_SENIORITY_DATE")
		public NDate RSeniorityDate;
		@DbRecordField(dataSourceName="R_LREA_CODE")
		public NString RLreaCode;
		@DbRecordField(dataSourceName="R_LOA_BEG_DATE")
		public NDate RLoaBegDate;
		@DbRecordField(dataSourceName="R_LOA_END_DATE")
		public NDate RLoaEndDate;
		@DbRecordField(dataSourceName="R_TREA_CODE")
		public NString RTreaCode;
		@DbRecordField(dataSourceName="R_TERM_DATE")
		public NDate RTermDate;
		@DbRecordField(dataSourceName="R_I9_FORM_IND")
		public NString RI9FormInd;
		@DbRecordField(dataSourceName="R_I9_DATE")
		public NDate RI9Date;
		@DbRecordField(dataSourceName="R_I9_EXPIRE_DATE")
		public NDate RI9ExpireDate;
		@DbRecordField(dataSourceName="R_WKPR_CODE")
		public NString RWkprCode;
		@DbRecordField(dataSourceName="R_FLSA_IND")
		public NString RFlsaInd;
		@DbRecordField(dataSourceName="R_STGR_CODE")
		public NString RStgrCode;
		@DbRecordField(dataSourceName="R_DAYS_IN_CANADA")
		public NNumber RDaysInCanada;
		@DbRecordField(dataSourceName="R_1042_RECIPIENT_CD")
		public NString R1042RecipientCd;
		@DbRecordField(dataSourceName="R_INTERNAL_FT_PT_IND")
		public NString RInternalFtPtInd;
		@DbRecordField(dataSourceName="R_DICD_CODE")
		public NString RDicdCode;
		@DbRecordField(dataSourceName="R_EGRP_CODE")
		public NString REgrpCode;
		@DbRecordField(dataSourceName="R_IPEDS_SOFT_MONEY_IND")
		public NString RIpedsSoftMoneyInd;
		@DbRecordField(dataSourceName="R_FIRST_WORK_DATE")
		public NDate RFirstWorkDate;
		@DbRecordField(dataSourceName="R_LAST_WORK_DATE")
		public NDate RLastWorkDate;
		@DbRecordField(dataSourceName="R_CALIF_PENSION_IND")
		public NString RCalifPensionInd;
		@DbRecordField(dataSourceName="R_NRSI_CODE")
		public NString RNrsiCode;
		@DbRecordField(dataSourceName="R_SSN_LAST_NAME")
		public NString RSsnLastName;
		@DbRecordField(dataSourceName="R_SSN_FIRST_NAME")
		public NString RSsnFirstName;
		@DbRecordField(dataSourceName="R_SSN_MI")
		public NString RSsnMi;
		@DbRecordField(dataSourceName="R_SSN_SUFFIX")
		public NString RSsnSuffix;
		@DbRecordField(dataSourceName="R_JBLN_CODE")
		public NString RJblnCode;
		@DbRecordField(dataSourceName="R_COLL_CODE")
		public NString RCollCode;
		@DbRecordField(dataSourceName="R_CAMP_CODE")
		public NString RCampCode;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_EW2_CONSENT_IND")
		public NString REw2ConsentInd;
		@DbRecordField(dataSourceName="R_EW2_CONSENT_DATE")
		public NDate REw2ConsentDate;
		@DbRecordField(dataSourceName="R_EW2_CONSENT_USER_ID")
		public NString REw2ConsentUserId;
		@DbRecordField(dataSourceName="R_IPEDS_PRIMARY_FUNCTION")
		public NString RIpedsPrimaryFunction;
		@DbRecordField(dataSourceName="R_IPEDS_MED_DENTAL_IND")
		public NString RIpedsMedDentalInd;
		@DbRecordField(dataSourceName="R_ETAX_CONSENT_IND")
		public NString REtaxConsentInd;
		@DbRecordField(dataSourceName="R_ETAX_CONSENT_DATE")
		public NDate REtaxConsentDate;
		@DbRecordField(dataSourceName="R_ETAX_CONSENT_USER_ID")
		public NString REtaxConsentUserId;
		@DbRecordField(dataSourceName="R_NEW_HIRE_IND")
		public NString RNewHireInd;
		@DbRecordField(dataSourceName="R_PERS_PARTICIPANT_ID")
		public NString RPersParticipantId;
		@DbRecordField(dataSourceName="R_PERS_APPT_ID")
		public NString RPersApptId;
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
