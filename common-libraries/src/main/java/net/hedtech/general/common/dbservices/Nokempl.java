package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokempl {
		public static EmployeeRectypeRow fEmployeeRec(NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKEMPL.F_EMPLOYEE_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(EmployeeRectypeRow.class));
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();

			return cmd.getReturnValue(EmployeeRectypeRow.class);

		}
		
	
	
	@DbRecordType(id="EmployeeRectypeRow", dataSourceName="EMPLOYEE_RECTYPE")
	public static class EmployeeRectypeRow
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
		@DbRecordField(dataSourceName="R_ACTIVITY_DATE")
		public NDate RActivityDate;
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
		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
		public NString RInternalRecordId;
	}

	
	
}
