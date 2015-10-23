package net.hedtech.general.common.dbservices;

import java.util.*;

import net.hedtech.general.common.dbservices.Nokinst.PtrinstRectypeRow;
import net.hedtech.general.common.dbservices.Nokrecs.AttributeRectypeRow;
import net.hedtech.general.common.dbservices.Nokrecs.PtvlcatRectypeRow;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbTableType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;




public class Pokrecs {
//		public static PtrbcatRectypeRow fPtrbcatRec(NString pBcatCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKRECS.F_PTRBCAT_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(PtrbcatRectypeRow.class));
//			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(PtrbcatRectypeRow.class);
//
//		}
		
//		public static PtrcalnRectypeRow fPtrcalnRec(NString yearIn,NString pictCodeIn,NNumber paynoIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKRECS.F_PTRCALN_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(PtrcalnRectypeRow.class));
//			cmd.addParameter("@YEAR_IN", yearIn);
//			cmd.addParameter("@PICT_CODE_IN", pictCodeIn);
//			cmd.addParameter("@PAYNO_IN", paynoIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(PtrcalnRectypeRow.class);
//
//		}
		
		public static PtrearnRectypeRow fPtrearnRec(NString earnCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKRECS.F_PTREARN_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(PtrearnRectypeRow.class));
			cmd.addParameter("@EARN_CODE_IN", earnCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(PtrearnRectypeRow.class);

		}
		
//		public static PtrecbcRectypeRow fPtrecbcRec(NString pEclsCode,NString pBcatCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKRECS.F_PTRECBC_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(PtrecbcRectypeRow.class));
//			cmd.addParameter("@P_ECLS_CODE", pEclsCode);
//			cmd.addParameter("@P_BCAT_CODE", pBcatCode);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(PtrecbcRectypeRow.class);
//
//		}
//		
//		public static PtreclcRectypeRow fPtreclcRec(NString eclsCodeIn,NString lcatCodeIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKRECS.F_PTRECLC_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(PtreclcRectypeRow.class));
//			cmd.addParameter("@ECLS_CODE_IN", eclsCodeIn);
//			cmd.addParameter("@LCAT_CODE_IN", lcatCodeIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(PtreclcRectypeRow.class);
//
//		}
		
		public static PtreclsRectypeRow fPtreclsRec(NString eclsCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKRECS.F_PTRECLS_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(PtreclsRectypeRow.class));
			cmd.addParameter("@ECLS_CODE_IN", eclsCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(PtreclsRectypeRow.class);

		}
		
//		public static PtreernRectypeRow fPtreernRec(NString eclsCodeIn,NString earnCodeIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKRECS.F_PTREERN_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(PtreernRectypeRow.class));
//			cmd.addParameter("@ECLS_CODE_IN", eclsCodeIn);
//			cmd.addParameter("@EARN_CODE_IN", earnCodeIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(PtreernRectypeRow.class);
//
//		}
		
		public static PtrinstRectypeRow fPtrinstRec() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKRECS.F_PTRINST_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(PtrinstRectypeRow.class));
				
			cmd.execute();

			return cmd.getReturnValue(PtrinstRectypeRow.class);

		}
		
//		public static PtrjblnRectypeRow fPtrjblnRec(NString pJblnCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKRECS.F_PTRJBLN_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(PtrjblnRectypeRow.class));
//			cmd.addParameter("@P_JBLN_CODE", pJblnCode);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(PtrjblnRectypeRow.class);
//
//		}
//		
//		public static PtrlreaRectypeRow fPtrlreaRec(NString pLreaCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKRECS.F_PTRLREA_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(PtrlreaRectypeRow.class));
//			cmd.addParameter("@P_LREA_CODE", pLreaCode);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(PtrlreaRectypeRow.class);
//
//		}
//		
//		public static PtrpictRectypeRow fPtrpictRec(NString pictCodeIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKRECS.F_PTRPICT_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(PtrpictRectypeRow.class));
//			cmd.addParameter("@PICT_CODE_IN", pictCodeIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(PtrpictRectypeRow.class);
//
//		}
//		
//		public static PtrtreaRectypeRow fPtrtreaRec(NString pTreaCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKRECS.F_PTRTREA_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(PtrtreaRectypeRow.class));
//			cmd.addParameter("@P_TREA_CODE", pTreaCode);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(PtrtreaRectypeRow.class);
//
//		}
//		
//		public static PtruserRectypeRow fPtruserRec(NString userCodeIn) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKRECS.F_PTRUSER_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(PtruserRectypeRow.class));
//			cmd.addParameter("@USER_CODE_IN", userCodeIn);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(PtruserRectypeRow.class);
//
//		}
//		
//		public static PtrwkprRectypeRow fPtrwkprRec(NString pWkprCode) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKRECS.F_PTRWKPR_REC", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(DbTypes.createStructType(PtrwkprRectypeRow.class));
//			cmd.addParameter("@P_WKPR_CODE", pWkprCode);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(PtrwkprRectypeRow.class);
//
//		}
		
		public static PtvlcatRectypeRow fPtvlcatRec(NString lcatCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKRECS.F_PTVLCAT_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(PtvlcatRectypeRow.class));
			cmd.addParameter("@LCAT_CODE_IN", lcatCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(PtvlcatRectypeRow.class);

		}
		
		@DbTableType(id="Pokrecs.PtvlcatRectype", dataSourceName="POKRECS.PTVLCAT_RECTYPE", indexed=false)
		public static class PokrecsPtvlcatRectype extends Table<PtvlcatRectypeRow> {
		}
		
		@DbRecordType(id="PtvlcatRectypeRow", dataSourceName="POKRECS.PTVLCAT_RECTYPE")
	    public static class PtvlcatRectypeRow
	    {

			@DbRecordField(dataSourceName="TABL")
	        public  PtvlcatTableRow Tabl;
	        @DbRecordField(dataSourceName="ATTR")
	        public AttributeRectypeRow Attr ;
	    }
		
		@DbRecordType(id="AttributeRectypeRow", dataSourceName="POKRECS.ATTRIBUTE_RECTYPE")
	    public static class AttributeRectypeRow
	    {
	        @DbRecordField(dataSourceName="FOUND")
	        public NBool Found;
	        @DbRecordField(dataSourceName="NOTFOUND")
	        public NBool Notfound;
	       
	    }
		
		
		
		public static PtvsarcRectypeRow fPtvsarcRec(NString sarcCodeIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("POKRECS.F_PTVSARC_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(PtvsarcRectypeRow.class));
			cmd.addParameter("@SARC_CODE_IN", sarcCodeIn);
				
			cmd.execute();

			return cmd.getReturnValue(PtvsarcRectypeRow.class);

		}
		
		@DbRecordType(id="PtvsarcRectypeRow", dataSourceName="POKRECS.PTVSARC_RECTYPE")
		public static class PtvsarcRectypeRow
		{
			@DbRecordField(dataSourceName="TABL")
			public PtvsarcTableRow Tabl;
			@DbRecordField(dataSourceName="ATTR")
			public AttributeRectypeRow Attr;
		}
		
		@DbRecordType(id="PtvsarcTableRow", dataSourceName="POKRECS.PTVSARC%ROWTYPE")
		public static class PtvsarcTableRow
		{
			@DbRecordField(dataSourceName="PTVSARC_CODE")
			public NString PtvsarcCode;
			@DbRecordField(dataSourceName="PTVSARC_DESC")
			public NString PtvsarcDesc;
			@DbRecordField(dataSourceName="PTVSARC_ACTIVITY_DATE")
			public NDate PtvsarcActivityDate;
			@DbRecordField(dataSourceName="PTVSARC_USER_ID")
			public NString PtvsarcUserId;
			@DbRecordField(dataSourceName="PTVSARC_SURROGATE_ID")
			public NNumber PtvsarcSurrogateId;
			@DbRecordField(dataSourceName="PTVSARC_VERSION")
			public NNumber PtvsarcVersion;
			@DbRecordField(dataSourceName="PTVSARC_DATA_ORIGIN")
			public NString PtvsarcDataOrigin;
			@DbRecordField(dataSourceName="PTVSARC_VPDI_CODE")
			public NString PtvsarcVpdiCode;
		}
		
	
		
		@DbRecordType(id="PtvlcatTableRow", dataSourceName="POKRECS.PTVLCAT%ROWTYPE")
	    public static class PtvlcatTableRow
	    {
	       
	        @DbRecordField(dataSourceName="PTVLCAT_CODE")
	        public NString PtvlcatCode;
	        @DbRecordField(dataSourceName="PTVLCAT_DESC")
	        public NString PtvlcatDesc;
	        @DbRecordField(dataSourceName="PTVLCAT_ACTIVITY_DATE")
	        public NDate PtvlcatActivityDate;
	        @DbRecordField(dataSourceName="PTVLCAT_REPORT_IND")
	        public NString PtvlcatReportInd;
	        @DbRecordField(dataSourceName="PTVLCAT_HOUR_DAY_IND")
	        public NString PtvlcatHourDayInd;
	        @DbRecordField(dataSourceName="PTVLCAT_USER_ID")
	        public NString PtvlcatUserInd;
	        @DbRecordField(dataSourceName="PTVLCAT_SURROGATE_ID")
	        public NNumber PtvlcatSurrogateId;
	        @DbRecordField(dataSourceName="PTVLCAT_VERSION")
	        public NNumber PtvlcatVersion;
	        @DbRecordField(dataSourceName="PTVLCAT_DATA_ORIGIN")
	        public NString PtvlcatDataOrigin;
	        @DbRecordField(dataSourceName="PTVLCAT_VPDI_CODE")
	        public NString PtvlcatVdpiCode;
	
	    }
	
   
	@DbTableType(id="Pokrecs.Attributerectype", dataSourceName="POKRECS.ATTRIBUTE_RECTYPE", indexed=false)
	public static class PokrecsAttributerectype extends Table<AttributeRectypeRow> {
	}

    @DbRecordType(id="PtrinstTableRow", dataSourceName="POKRECS.PTRINST%ROWTYPE")
    public static class PtrinstTableRow
    {
        @DbRecordField(dataSourceName="PTRINST_CODE")
        public NString PtrinstCode;
        @DbRecordField(dataSourceName="PTRINST_COBRA_ADM_NAME")
        public NString PtrinstCobraAdmName;
        @DbRecordField(dataSourceName="PTRINST_COBRA_ADM_TITLE")
        public NString PtrinstCobraAdmTitle;
        @DbRecordField(dataSourceName="PTRINST_COBRA_INST_NAME")
        public NString PtrinstCobraInstName;
        @DbRecordField(dataSourceName="PTRINST_COBRA_ADDRESS")
        public NString PtrinstCobraAddress;
        @DbRecordField(dataSourceName="PTRINST_COBRA_CITY")
        public NString PtrinstCobraCity;
        @DbRecordField(dataSourceName="PTRINST_COBRA_STAT_CODE")
        public NString PtrinstCobraStatCode; 
        @DbRecordField(dataSourceName="PTRINST_COBRA_PHONE_NO")
        public NString PtrinstCobraPhoneNo; 
        @DbRecordField(dataSourceName="PTRINST_COBRA_CHECK_PAY_NAME")
        public NString PtrinstCobraCheckPayName; 
        @DbRecordField(dataSourceName="PTRINST_COBRA_EXTEND_MONTHS")
        public NNumber PtrinstCobraExtendMonths; 
        @DbRecordField(dataSourceName="PTRINST_COBRA_FIRST_B_GR_DAYS")
        public NNumber PtrinstCobraFirstBGrDays; 
        @DbRecordField(dataSourceName="PTRINST_ACH_DEST_NO")
        public NString PtrinstAchDestNo; 
        @DbRecordField(dataSourceName="PTRINST_ACH_ORIG_NO")
        public NString PtrinstAchOrigNo; 
        @DbRecordField(dataSourceName="PTRINST_ACH_DEST_NAME")
        public NString PtrinstAchDestName; 
        @DbRecordField(dataSourceName="PTRINST_ACH_ORIG_NAME")
        public NString PtrinstAchOrigName; 
        @DbRecordField(dataSourceName="PTRINST_ACH_ACCT_NO")
        public NString PtrinstAchAcctNo; 
        @DbRecordField(dataSourceName="PTRINST_ACH_STATUS")
        public NString PtrinstAchStatus; 
        @DbRecordField(dataSourceName="PTRINST_FINANCE_DATE_IND")
        public NString PtrinstFinanceDateInd; 
        @DbRecordField(dataSourceName="PTRINST_ACCRUE_IND")
        public NString PtrinstAccrueInd;
        @DbRecordField(dataSourceName="PTRINST_ECLS_SECURITY_IND")
        public NString PtrinstEclsSecurityInd;
        @DbRecordField(dataSourceName="PTRINST_ORGN_SECURITY_IND")
        public NString PtrinstOrgnSecurityInd;
        @DbRecordField(dataSourceName="PTRINST_SALA_SECURITY_IND")
        public NString PtrinstSalaSecurityInd;
        @DbRecordField(dataSourceName="PTRINST_EMPR_SECURITY_IND")
        public NString PtrinstEmprSecurityInd;
        @DbRecordField(dataSourceName="PTRINST_EMP_TAX_FREE_COV_AMT")
        public NNumber PtrinstEmpTaxFreeCovAmt;
        @DbRecordField(dataSourceName="PTRINST_DEP_TAX_FREE_COV_AMT")
        public NNumber PtrinstDepTaxFreeCovAmt;
        @DbRecordField(dataSourceName="PTRINST_ACTIVITY_DATE")
        public NDate PtrinstActivityDate;
        @DbRecordField(dataSourceName="PTRINST_TEMP_I9_LIMIT_DAYS")
        public NNumber PtrinstTempI9LimitDays;
        @DbRecordField(dataSourceName="PTRINST_ZIPC_CODE_COBRA")
        public NString PtrinstZipcCodeCobra;
        @DbRecordField(dataSourceName="PTRINST_ACH_FILE_NUMBER")
        public NNumber PtrinstAchFileNnumber;
        @DbRecordField(dataSourceName="PTRINST_ACH_SHORT_ORIG_NAME")
        public NString PtrinstAchShortOrigName;
        @DbRecordField(dataSourceName="PTRINST_NON_WORK_DAYS_GEN_IND")
        public NString PtrinstNonWorkDaysGenInd;
        @DbRecordField(dataSourceName="PTRINST_BANK_CODE")
        public NString PtrinstBankCode;
        @DbRecordField(dataSourceName="PTRINST_COMPANY_TYPE")
        public NString PtrinstCompanyType;
        @DbRecordField(dataSourceName="PTRINST_COMPANY_ID")
        public NString PtrinstCompanyId;
        @DbRecordField(dataSourceName="PTRINST_RECV_BANK_CODE")
        public NString PtrinstRecvBankCode;
        @DbRecordField(dataSourceName="PTRINST_DISPLAY_RATE_IND")
        public NString PtrinstDisplayRateInd;
        @DbRecordField(dataSourceName="PTRINST_STRS_COUNTY_CODE")
        public NString PtrinstStrsCountyCode;
        @DbRecordField(dataSourceName="PTRINST_STRS_COUNTY_DESC")
        public NString PtrinstStrsCountyDesc;
        @DbRecordField(dataSourceName="PTRINST_PERS_COUNTY_CODE")
        public NString PtrinstPersCountyCode;
        @DbRecordField(dataSourceName="PTRINST_PERS_COUNTY_DESC")
        public NString PtrinstPersCountyDesc;
        @DbRecordField(dataSourceName="PTRINST_STRS_DISTRICT_CODE")
        public NString PtrinstStrsDistrictCode;
        @DbRecordField(dataSourceName="PTRINST_STRS_DISTRICT_DESC")
        public NString PtrinstStrsDistrictDesc;
        @DbRecordField(dataSourceName="PTRINST_STRS_PERS_DATE")
        public NString PtrinstStrsPersDate;
        @DbRecordField(dataSourceName="PTRINST_FMLA_YEAR_IND")
        public NString PtrinstFmlaYearInd;
        @DbRecordField(dataSourceName="PTRINST_FMLA_UNIT_IND")
        public NString PtrinstFmlaUnitInd; 
        @DbRecordField(dataSourceName="PTRINST_SIN_IND")
        public NString PtrinstSinInd; 
        @DbRecordField(dataSourceName="PTRINST_MAX_YEAR_END_STMT")
        public NString PtrinstMaxYearEndStmt;
        @DbRecordField(dataSourceName="PTRINST_FACULTY_IND")
        public NString PtrinstFacultyInd;
        @DbRecordField(dataSourceName="PTRINST_PERFACT_CHANGE_IND")
        public NString PtrinstPerfactChangeInd;
        @DbRecordField(dataSourceName="PTRINST_WEB_CERTIFICATION_IND")
        public NString PtrinstWebCertificationInd; 
        @DbRecordField(dataSourceName="PTRINST_PERS_DISTRICT_CODE")
        public NString PtrinstPersDistrictCode;
        @DbRecordField(dataSourceName="PTRINST_PERS_DISTRICT_DESC")
        public NString PtrinstPersDistrictDesc;
        @DbRecordField(dataSourceName="PTRINST_RANK_AUTO_APPR_IND")
        public NString PtrinstRankAutoApprInd;
        @DbRecordField(dataSourceName="PTRINST_ALVL_CODE_RANK")
        public NString PtrinstAlvlCodeRank;
        @DbRecordField(dataSourceName="PTRINST_TENURE_AUTO_APPR_IND")
        public NString PtrinstTenureAutoApprInd;
        @DbRecordField(dataSourceName="PTRINST_ALVL_CODE_TENURE")
        public NString PtrinstAlvlCodeTenure;
        @DbRecordField(dataSourceName="PTRINST_ACCRUE_LEAVE_METHOD")
        public NString PtrinstAccrueLeaveMethod;
        @DbRecordField(dataSourceName="PTRINST_ACCRUE_MAX_CALC_METHOD")
        public NString PtrinstAccrueMaxCalcMethod;
        @DbRecordField(dataSourceName="PTRINST_MIN_LEAV_DAY_INCREMENT")
        public NNumber PtrinstMinLeavDayIncrement;
        @DbRecordField(dataSourceName="PTRINST_ALLOW_EMPL_1PAY_IND")
        public NString PtrinstAllowEmpl1payInd;
        @DbRecordField(dataSourceName="PTRINST_ALVL_CODE_1PAY")
        public NString PtrinstAlvlCode1pay;
        @DbRecordField(dataSourceName="PTRINST_ATYP_CODE_1PAY")
        public NString PtrinstAtypCode1pay;
        @DbRecordField(dataSourceName="PTRINST_TELE_CODE_1PAY")
        public NString PtrinstTeleCode1pay;
        @DbRecordField(dataSourceName="PTRINST_ACAT_CODE_1PAY")
// TODO RAW DATATYPE???        public NRaw PtrinstAcatCode1pay;
        public NString PtrinstAcatCode1pay;
        @DbRecordField(dataSourceName="PTRINST_JCRE_CODE_1PAY")
        public NString PtrinstJcreCode1pay;
        @DbRecordField(dataSourceName="PTRINST_TREA_CODE_1PAY")
        public NString PtrinstTreaCode1pay; 
        @DbRecordField(dataSourceName="PTRINST_DICD_CODE")
        public NString PtrinstDicdCode; 
        @DbRecordField(dataSourceName="PTRINST_LEAVE_ROLL_ORDER")
        public NString PtrinstLeaveRollOrder;
        @DbRecordField(dataSourceName="PTRINST_SABB_AUTO_APPR_IND")
        public NString PtrinstSabbAutoApprInd;
        @DbRecordField(dataSourceName="PTRINST_ALVL_CODE_SABB")
        public NString PtrinstAlvlCodeSabb;
        @DbRecordField(dataSourceName="PTRINST_JOBS_LEAV_SYNC_IND")
        public NString PtrinstJobsLeavSyncInd;
        @DbRecordField(dataSourceName="PTRINST_DD_WEB_UPDATE_IND")
        public NString PtrinstDdWebUpdateInd;         
        @DbRecordField(dataSourceName="PTRINST_GRACE_ADD_MONTHS")
        public NNumber PtrinstGraceAddMonths; 
        @DbRecordField(dataSourceName="PTRINST_GRACE_ADD_DAYS")
        public NNumber PtrinstGraceAddDays;
        @DbRecordField(dataSourceName="PTRINST_REVOKE_EW2_CONSENT_IND")
        public NString PtrinstRevokeEw2ConsentInd;
        @DbRecordField(dataSourceName="PTRINST_FL_ORGN_SECURITY_IND")
        public NString PtrinstFlOrgnSecurityInd;
        @DbRecordField(dataSourceName="PTRINST_EDIT_FACULTY_POSN_IND")
        public NString PtrinstEditFacultyPosnInd;
        @DbRecordField(dataSourceName="PTRINST_FMLA_SERVICE_YEAR_TYPE")
        public NString PtrinstFmlaServiceYearType;
        @DbRecordField(dataSourceName="PTRINST_FMLA_INST_YEAR_MONTHS")
        public NNumber PtrinstFmlaInstYearMonths;
        @DbRecordField(dataSourceName="PTRINST_FMLA_INST_YEAR_DAYS")
        public NNumber PtrinstFmlaInstYearDays;
        @DbRecordField(dataSourceName="PTRINST_12HOUR_CLOCK_IND")
        public NString Ptrinst12hourClockInd;
        @DbRecordField(dataSourceName="PTRINST_WEB_JOBSALA_DISP_IND")
        public NString PtrinstWebJobsalaDispInd;
        @DbRecordField(dataSourceName="PTRINST_SURROGATE_ID")
        public NNumber PtrinstSurrogateId;
        @DbRecordField(dataSourceName="PTRINST_VERSION")
        public NNumber PtrinstVersion;
        @DbRecordField(dataSourceName="PTRINST_USER_ID")
        public NString PtrinstUserId;
        @DbRecordField(dataSourceName="PTRINST_DATA_ORIGIN")
        public NString PtrinstDataOrigin;
        @DbRecordField(dataSourceName="PTRINST_VPDI_CODE")
        public NString PtrinstVpdiCode;
        @DbRecordField(dataSourceName="PTRINST_WEB_W2_RESTRICTION_IND")
        public NString PtrinstWebW2RestrictionInd;
    }   


   
    @DbRecordType(id="PtrinstRectypeRow", dataSourceName="POKRECS.PTRINST_RECTYPE")
    public static class PtrinstRectypeRow
    {

		@DbRecordField(dataSourceName="TABL")
        public  PtrinstTableRow Tabl;
        @DbRecordField(dataSourceName="ATTR")
        public AttributeRectypeRow Attr ;
    }
    
    @DbRecordType(id="PtreclsTableRow", dataSourceName="POKRECS.PTRECLS%ROWTYPE")
    public static class PtreclsTableRow
    {
    	
    	 @DbRecordField(dataSourceName="PTRECLS_CODE")
         public NString PtreclsCode;
    	 @DbRecordField(dataSourceName="PTRECLS_SHORT_DESC")
         public NString PtreclsShortDesc;
    	 @DbRecordField(dataSourceName="PTRECLS_LONG_DESC")
         public NString PtreclsLongDesc;
    	 @DbRecordField(dataSourceName="PTRECLS_PICT_CODE")
         public NString PtreclsPictCode;
    	 @DbRecordField(dataSourceName="PTRECLS_SHCD_CODE")
         public NString PtreclsShcdCode;
    	 @DbRecordField(dataSourceName="PTRECLS_HOURS_PER_PAY")
         public NNumber PtreclsHoursPerPay;
    	 @DbRecordField(dataSourceName="PTRECLS_HOURS_PER_DAY")
         public NNumber PtreclsHoursPerDay;
    	 @DbRecordField(dataSourceName="PTRECLS_SALARY_ENCUMBRANCE_IND")
         public NString PtreclsSalaryEncumbranceInd;
    	 @DbRecordField(dataSourceName="PTRECLS_TS_ROSTER_IND")
         public NString PtreclsTsRosterInd;
    	 @DbRecordField(dataSourceName="PTRECLS_DEFAULT_HOURS_IND")
         public NString PtreclsDefaultHoursInd;
    	 @DbRecordField(dataSourceName="PTRECLS_SALARY_IND")
         public NString PtreclsSalaryInd;
    	 @DbRecordField(dataSourceName="PTRECLS_BUDGET_ROLL_IND")
         public NString PtreclsBudgetRollInd;
    	 @DbRecordField(dataSourceName="PTRECLS_LCAT_CODE")
         public NString PtreclsLcatCode;
    	 @DbRecordField(dataSourceName="PTRECLS_BCAT_CODE")
         public NString PtreclsBcatCode;
    	 @DbRecordField(dataSourceName="PTRECLS_ACTIVITY_DATE")
         public NDate PtreclsActivityDate;
    	 @DbRecordField(dataSourceName="PTRECLS_EEOG_CODE")
         public NString PtreclsEeogCode;
    	 @DbRecordField(dataSourceName="PTRECLS_EMPR_CODE")
         public NString PtreclsEmprCode;
    	 @DbRecordField(dataSourceName="PTRECLS_INSTRUCT_CODE")
         public NString PtreclsInstructCode;
    	 @DbRecordField(dataSourceName="PTRECLS_STCA_CODE")
         public NString PtreclsStcaCode;
    	 @DbRecordField(dataSourceName="PTRECLS_STGR_CODE")
         public NString PtreclsStgrCode;
    	 @DbRecordField(dataSourceName="PTRECLS_WKPR_CODE")
         public NString PtreclsWkprCode;
    	 @DbRecordField(dataSourceName="PTRECLS_LGCD_CODE")
         public NString PtreclsLgcdCode;
    	 @DbRecordField(dataSourceName="PTRECLS_FLSA_IND")
         public NString PtreclsFlsaInd;
    	 @DbRecordField(dataSourceName="PTRECLS_WKSH_CODE")
         public NString PtreclsWkshCode;
    	 @DbRecordField(dataSourceName="PTRECLS_TIME_ENTRY_IND")
         public NString PtreclsTimeEntryInd;
    	 @DbRecordField(dataSourceName="PTRECLS_TIME_ENTRY_DAY")
         public NString PtreclsTimeEntryDay;
    	 @DbRecordField(dataSourceName="PTRECLS_DFPR_CODE")
         public NString PtreclsDfprCode;
    	 @DbRecordField(dataSourceName="PTRECLS_PCAT_CODE")
         public NString PtreclsPcatCode;
    	 @DbRecordField(dataSourceName="PTRECLS_PREMIUM_ROLL_IND")
         public NString PtreclsPremiumRollInd;
    	 @DbRecordField(dataSourceName="PTRECLS_INTERNAL_FT_PT_IND")
         public NString PtreclsInternalFtPtInd;
    	 @DbRecordField(dataSourceName="PTRECLS_EGRP_CODE")
         public NString PtreclsEgrpInd;
    	 @DbRecordField(dataSourceName="PTRECLS_STRS_ASSN_CODE")
         public NString PtreclsStrsAssnCode;
    	 @DbRecordField(dataSourceName="PTRECLS_STRS_PAY_CODE")
         public NString PtreclsStrsPayCode;
    	 @DbRecordField(dataSourceName="PTRECLS_PERS_GROUP")
         public NString PtreclsPersGroup;
    	 @DbRecordField(dataSourceName="PTRECLS_PERS_PAY_CODE")
         public NString PtreclsPersPayCode;
    	 @DbRecordField(dataSourceName="PTRECLS_TIME_ENTRY_METHOD")
         public NString PtreclsTimeEntryMethod;
    	 @DbRecordField(dataSourceName="PTRECLS_TIME_ENTRY_TYPE")
         public NString PtreclsTimeEntryType;
    	 @DbRecordField(dataSourceName="PTRECLS_LEAVE_REQUEST_IND")
         public NString PtreclsLeaveRequestInd;
    	 @DbRecordField(dataSourceName="PTRECLS_EXCEPTION_APPROVAL_IND")
         public NString PtreclsExceptionApprovalInd;
    	 @DbRecordField(dataSourceName="PTRECLS_TIME_IN_OUT_IND")
         public NString PtreclsTimeInOutInd;
    	 @DbRecordField(dataSourceName="PTRECLS_OVERRIDE_LD_WEB_IND")
         public NString PtreclsOverrideLdWebInd;
    	 @DbRecordField(dataSourceName="PTRECLS_OVERRIDE_LD_DEPT_IND")
         public NString PtreclsOverrideLdDeptInd;
    	 @DbRecordField(dataSourceName="PTRECLS_BUDG_BASIS")
         public NNumber PtreclsBudgBasis;
    	 @DbRecordField(dataSourceName="PTRECLS_ANN_BASIS")
         public NNumber PtreclsAnnBasis;
    	 @DbRecordField(dataSourceName="PTRECLS_CREATE_JFTE_IND")
         public NString PtreclsCreateJfteInd;
    	 @DbRecordField(dataSourceName="PTRECLS_LEAV_REPT_METHOD")
         public NString PtreclsLeavReptMethod;
    	 @DbRecordField(dataSourceName="PTRECLS_PICT_CODE_LEAV_REPT")
         public NString PtreclsPictCodeLeavRept;
    	 @DbRecordField(dataSourceName="PTRECLS_CLOCK_IN_OUT_IND")
         public NString PtreclsClockInOutInd;
    	 @DbRecordField(dataSourceName="PTRECLS_SURROGATE_ID")
         public NNumber PtreclsSurrogateId;
    	 @DbRecordField(dataSourceName="PTRECLS_VERSION")
         public NNumber PtreclsVersion;
    	 @DbRecordField(dataSourceName="PTRECLS_USER_ID")
         public NString PtreclsUserId;
    	 @DbRecordField(dataSourceName="PTRECLS_DATA_ORIGIN")
         public NString PtreclsDataOrigin;
    	 @DbRecordField(dataSourceName="PTRECLS_VPDI_CODE")
         public NString PtreclsVpdiCode;
    	 
    }
    
    @DbRecordType(id="PtreclsRectypeRow", dataSourceName="POKRECS.PTRECLS_RECTYPE")
    public static class PtreclsRectypeRow{
    	
    	@DbRecordField(dataSourceName="TABL")
        public  PtreclsTableRow Tabl;
        @DbRecordField(dataSourceName="ATTR")
        public AttributeRectypeRow Attr ;
    	
    }
    
    @DbRecordType(id = "PtrearnRectypeRow", dataSourceName = "POKRECS.PTREARN_RECTYPE")
    public static class PtrearnRectypeRow {
    	@DbRecordField(dataSourceName = "TABL")
    	public PtrearnRowtypeRow table;
    	@DbRecordField(dataSourceName = "ATTR")
    	public AttributeRectypeRow attr;
    }

    @DbRecordType(id = "PtrearnRowtypeRow", dataSourceName = "POKRECS.PTREARN_ROWTYPE")
    public static class PtrearnRowtypeRow {
    	@DbRecordField(dataSourceName = "PTREARN_CODE")
    	public NString PtrearnCode;
    	@DbRecordField(dataSourceName = "PTREARN_SHORT_DESC")
    	public NString PtrearnShortDesc;
    	@DbRecordField(dataSourceName = "PTREARN_LONG_DESC")
    	public NString PtrearnLongDesc;
    	@DbRecordField(dataSourceName = "PTREARN_ACTIVITY_DATE")
    	public NDate PtrearnActivityDate;
    }
    
}
