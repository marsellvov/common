package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Nokinst {
		public static NString fCheckNation() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKINST.F_CHECK_NATION", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static PtrinstRectypeRow fPtrinstRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NOKINST.F_PTRINST_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(PtrinstRectypeRow.class));
				
			cmd.execute();

			return cmd.getReturnValue(PtrinstRectypeRow.class);

		}
		
		
	
	
	@DbRecordType(id="PtrinstRectypeRow", dataSourceName="PTRINST_RECTYPE")
	public static class PtrinstRectypeRow
	{
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
		@DbRecordField(dataSourceName="R_COBRA_ADM_NAME")
		public NString RCobraAdmName;
		@DbRecordField(dataSourceName="R_COBRA_ADM_TITLE")
		public NString RCobraAdmTitle;
		@DbRecordField(dataSourceName="R_COBRA_INST_NAME")
		public NString RCobraInstName;
		@DbRecordField(dataSourceName="R_COBRA_ADDRESS")
		public NString RCobraAddress;
		@DbRecordField(dataSourceName="R_COBRA_CITY")
		public NString RCobraCity;
		@DbRecordField(dataSourceName="R_COBRA_STAT_CODE")
		public NString RCobraStatCode;
		@DbRecordField(dataSourceName="R_COBRA_PHONE_NO")
		public NString RCobraPhoneNo;
		@DbRecordField(dataSourceName="R_COBRA_CHECK_PAY_NAME")
		public NString RCobraCheckPayName;
		@DbRecordField(dataSourceName="R_COBRA_EXTEND_MONTHS")
		public NNumber RCobraExtendMonths;
		@DbRecordField(dataSourceName="R_COBRA_FIRST_B_GR_DAYS")
		public NNumber RCobraFirstBGrDays;
		@DbRecordField(dataSourceName="R_ACH_DEST_NO")
		public NString RAchDestNo;
		@DbRecordField(dataSourceName="R_ACH_ORIG_NO")
		public NString RAchOrigNo;
		@DbRecordField(dataSourceName="R_ACH_DEST_NAME")
		public NString RAchDestName;
		@DbRecordField(dataSourceName="R_ACH_ORIG_NAME")
		public NString RAchOrigName;
		@DbRecordField(dataSourceName="R_ACH_ACCT_NO")
		public NString RAchAcctNo;
		@DbRecordField(dataSourceName="R_ACH_STATUS")
		public NString RAchStatus;
		@DbRecordField(dataSourceName="R_FINANCE_DATE_IND")
		public NString RFinanceDateInd;
		@DbRecordField(dataSourceName="R_ACCRUE_IND")
		public NString RAccrueInd;
		@DbRecordField(dataSourceName="R_ECLS_SECURITY_IND")
		public NString REclsSecurityInd;
		@DbRecordField(dataSourceName="R_ORGN_SECURITY_IND")
		public NString ROrgnSecurityInd;
		@DbRecordField(dataSourceName="R_SALA_SECURITY_IND")
		public NString RSalaSecurityInd;
		@DbRecordField(dataSourceName="R_EMPR_SECURITY_IND")
		public NString REmprSecurityInd;
		@DbRecordField(dataSourceName="R_EMP_TAX_FREE_COV_AMT")
		public NNumber REmpTaxFreeCovAmt;
		@DbRecordField(dataSourceName="R_DEP_TAX_FREE_COV_AMT")
		public NNumber RDepTaxFreeCovAmt;
		@DbRecordField(dataSourceName="R_ACTIVITY_DATE")
		public NDate RActivityDate;
		@DbRecordField(dataSourceName="R_TEMP_I9_LIMIT_DAYS")
		public NNumber RTempI9LimitDays;
		@DbRecordField(dataSourceName="R_ZIPC_CODE_COBRA")
		public NString RZipcCodeCobra;
		@DbRecordField(dataSourceName="R_ACH_FILE_NUMBER")
		public NNumber RAchFileNumber;
		@DbRecordField(dataSourceName="R_ACH_SHORT_ORIG_NAME")
		public NString RAchShortOrigName;
		@DbRecordField(dataSourceName="R_NON_WORK_DAYS_GEN_IND")
		public NString RNonWorkDaysGenInd;
		@DbRecordField(dataSourceName="R_BANK_CODE")
		public NString RBankCode;
		@DbRecordField(dataSourceName="R_COMPANY_TYPE")
		public NString RCompanyType;
		@DbRecordField(dataSourceName="R_COMPANY_ID")
		public NString RCompanyId;
		@DbRecordField(dataSourceName="R_RECV_BANK_CODE")
		public NString RRecvBankCode;
		@DbRecordField(dataSourceName="R_DISPLAY_RATE_IND")
		public NString RDisplayRateInd;
		@DbRecordField(dataSourceName="R_STRS_COUNTY_CODE")
		public NString RStrsCountyCode;
		@DbRecordField(dataSourceName="R_STRS_COUNTY_DESC")
		public NString RStrsCountyDesc;
		@DbRecordField(dataSourceName="R_PERS_COUNTY_CODE")
		public NString RPersCountyCode;
		@DbRecordField(dataSourceName="R_PERS_COUNTY_DESC")
		public NString RPersCountyDesc;
		@DbRecordField(dataSourceName="R_STRS_DISTRICT_CODE")
		public NString RStrsDistrictCode;
		@DbRecordField(dataSourceName="R_STRS_DISTRICT_DESC")
		public NString RStrsDistrictDesc;
		@DbRecordField(dataSourceName="R_STRS_PERS_DATE")
		public NString RStrsPersDate;
		@DbRecordField(dataSourceName="R_FMLA_YEAR_IND")
		public NString RFmlaYearInd;
		@DbRecordField(dataSourceName="R_FMLA_UNIT_IND")
		public NString RFmlaUnitInd;
		@DbRecordField(dataSourceName="R_SIN_IND")
		public NString RSinInd;
		@DbRecordField(dataSourceName="R_MAX_YEAR_END_STMT")
		public NString RMaxYearEndStmt;
		@DbRecordField(dataSourceName="R_FACULTY_IND")
		public NString RFacultyInd;
		@DbRecordField(dataSourceName="R_PERFACT_CHANGE_IND")
		public NString RPerfactChangeInd;
		@DbRecordField(dataSourceName="R_WEB_CERTIFICATION_IND")
		public NString RWebCertificationInd;
		@DbRecordField(dataSourceName="R_PERS_DISTRICT_CODE")
		public NString RPersDistrictCode;
		@DbRecordField(dataSourceName="R_PERS_DISTRICT_DESC")
		public NString RPersDistrictDesc;
		@DbRecordField(dataSourceName="R_RANK_AUTO_APPR_IND")
		public NString RRankAutoApprInd;
		@DbRecordField(dataSourceName="R_ALVL_CODE_RANK")
		public NString RAlvlCodeRank;
		@DbRecordField(dataSourceName="R_TENURE_AUTO_APPR_IND")
		public NString RTenureAutoApprInd;
		@DbRecordField(dataSourceName="R_ALVL_CODE_TENURE")
		public NString RAlvlCodeTenure;
		@DbRecordField(dataSourceName="R_ACCRUE_LEAVE_METHOD")
		public NString RAccrueLeaveMethod;
		@DbRecordField(dataSourceName="R_ACCRUE_MAX_CALC_METHOD")
		public NString RAccrueMaxCalcMethod;
		@DbRecordField(dataSourceName="R_MIN_LEAV_DAY_INCREMENT")
		public NNumber RMinLeavDayIncrement;
		@DbRecordField(dataSourceName="R_ALLOW_EMPL_1PAY_IND")
		public NString RAllowEmpl1payInd;
		@DbRecordField(dataSourceName="R_ALVL_CODE_1PAY")
		public NString RAlvlCode1pay;
		@DbRecordField(dataSourceName="R_ATYP_CODE_1PAY")
		public NString RAtypCode1pay;
		@DbRecordField(dataSourceName="R_TELE_CODE_1PAY")
		public NString RTeleCode1pay;
		@DbRecordField(dataSourceName="R_ACAT_CODE_1PAY")
		public NString RAcatCode1pay;
		@DbRecordField(dataSourceName="R_JCRE_CODE_1PAY")
		public NString RJcreCode1pay;
		@DbRecordField(dataSourceName="R_TREA_CODE_1PAY")
		public NString RTreaCode1pay;
		@DbRecordField(dataSourceName="R_DICD_CODE")
		public NString RDicdCode;
		@DbRecordField(dataSourceName="R_LEAVE_ROLL_ORDER")
		public NString RLeaveRollOrder;
		@DbRecordField(dataSourceName="R_SABB_AUTO_APPR_IND")
		public NString RSabbAutoApprInd;
		@DbRecordField(dataSourceName="R_ALVL_CODE_SABB")
		public NString RAlvlCodeSabb;
		@DbRecordField(dataSourceName="R_JOBS_LEAV_SYNC_IND")
		public NString RJobsLeavSyncInd;
		@DbRecordField(dataSourceName="R_DD_WEB_UPDATE_IND")
		public NString RDdWebUpdateInd;
//		@DbRecordField(dataSourceName="R_INTERNAL_RECORD_ID")
//		public NString RInternalRecordId;
		@DbRecordField(dataSourceName="R_GRACE_ADD_MONTHS_IND")
		public NString RGraceAddMonthsInd;
		@DbRecordField(dataSourceName="R_GRACE_ADD_DAYS_IND")
		public NString RGraceAddDaysInd;
		@DbRecordField(dataSourceName="R_REVOKE_EW2_CONSENT_IND")
		public NString RRevokeEw2ConsentInd;
		@DbRecordField(dataSourceName="R_FL_ORGN_SECURITY_IND")
		public NString RFlOrgnSecurityInd;
		@DbRecordField(dataSourceName="R_EDIT_FACULTY_POSN_IND")
		public NString REditFacultyPosnInd;
		@DbRecordField(dataSourceName="R_FMLA_SERVICE_YEAR_TYPE")
		public NString RFmlaServiceYearType;
		@DbRecordField(dataSourceName="R_FMLA_INST_YEAR_MONTHS")
		public NString RFmlaInstYearMonths;
		@DbRecordField(dataSourceName="R_FMLA_INST_YEAR_DAYS")
		public NString RFmlaInstYearDays;
		@DbRecordField(dataSourceName="R_12HOUR_CLOCK_IND")
		public NString R12HourClockInd;
		@DbRecordField(dataSourceName="R_WEB_JOBSALA_DISP_IND")
		public NString RWebJobsalaDispInd;
		@DbRecordField(dataSourceName="R_SURROGATE_ID")
		public NString RSurrogateId;
		@DbRecordField(dataSourceName="R_VERSION")
		public NString RVersion;
		@DbRecordField(dataSourceName="R_USER_ID")
		public NString RUserId;
		@DbRecordField(dataSourceName="R_DATA_ORIGIN")
		public NString RDataOrigin;
		@DbRecordField(dataSourceName="R_VPDI_CODE")
		public NString RVpdiCode;
		@DbRecordField(dataSourceName="R_WEB_W2_RESTRICTION_IND")
		public NString RWebW2RestrictionInd;
		
	}

	
	
}
