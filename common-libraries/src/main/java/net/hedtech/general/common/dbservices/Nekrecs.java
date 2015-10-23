package net.hedtech.general.common.dbservices;

import java.util.*;

//import com.ellucian.forms.Nbajobs.services.UnknownTypes; TODO: SEE LATER

import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;
import static morphis.foundations.core.types.Types.*;


public class Nekrecs {
		public static PebemplRectypeRow fPebemplRec(NNumber pidmIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("NEKRECS.F_PEBEMPL_REC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(PebemplRectypeRow.class));
			cmd.addParameter("@PIDM_IN", pidmIn);
				
			cmd.execute();

			return cmd.getReturnValue(PebemplRectypeRow.class);

		}
		
	
	
	@DbRecordType(id="AttributeRectypeRow", dataSourceName="NEKRECS.ATTRIBUTE_RECTYPE")
	public static class AttributeRectypeRow
	{
		@DbRecordField(dataSourceName="FOUND")
		public NBool Found;
		@DbRecordField(dataSourceName="NOTFOUND")
		public NBool Notfound;
	}

	
	@DbRecordType(id="PebemplRectypeRow", dataSourceName="NEKRECS.PEBEMPL_RECTYPE")
	public static class PebemplRectypeRow
	{
		@DbRecordField(dataSourceName="TABL")
		public PebemplRowtypeRow Tabl;
		@DbRecordField(dataSourceName="ATTR")
		public AttributeRectypeRow Attr;
	}

	
	@DbRecordType(id="PebemplRowtypeRow", dataSourceName="NEKRECS.PEBEMPL_ROWTYPE")
	public static class PebemplRowtypeRow
	{
		@DbRecordField(dataSourceName="PEBEMPL_PIDM")
		public NNumber PebemplPidm;
		@DbRecordField(dataSourceName="PEBEMPL_EMPL_STATUS")
		public NString PebemplEmplStatus;
		@DbRecordField(dataSourceName="PEBEMPL_COAS_CODE_HOME")
		public NString PebemplCoasCodeHome;
		@DbRecordField(dataSourceName="PEBEMPL_ORGN_CODE_HOME")
		public NString PebemplOrgnCodeHome;
		@DbRecordField(dataSourceName="PEBEMPL_COAS_CODE_DIST")
		public NString PebemplCoasCodeDist;
		@DbRecordField(dataSourceName="PEBEMPL_ORGN_CODE_DIST")
		public NString PebemplOrgnCodeDist;
		@DbRecordField(dataSourceName="PEBEMPL_ECLS_CODE")
		public NString PebemplEclsCode;
		@DbRecordField(dataSourceName="PEBEMPL_LCAT_CODE")
		public NString PebemplLcatCode;
		@DbRecordField(dataSourceName="PEBEMPL_BCAT_CODE")
		public NString PebemplBcatCode;
		@DbRecordField(dataSourceName="PEBEMPL_FIRST_HIRE_DATE")
		public NDate PebemplFirstHireDate;
		@DbRecordField(dataSourceName="PEBEMPL_CURRENT_HIRE_DATE")
		public NDate PebemplCurrentHireDate;
		@DbRecordField(dataSourceName="PEBEMPL_ADJ_SERVICE_DATE")
		public NDate PebemplAdjServiceDate;
		@DbRecordField(dataSourceName="PEBEMPL_SENIORITY_DATE")
		public NDate PebemplSeniorityDate;
		@DbRecordField(dataSourceName="PEBEMPL_LREA_CODE")
		public NString PebemplLreaCode;
		@DbRecordField(dataSourceName="PEBEMPL_LOA_BEG_DATE")
		public NDate PebemplLoaBegDate;
		@DbRecordField(dataSourceName="PEBEMPL_LOA_END_DATE")
		public NDate PebemplLoaEndDate;
		@DbRecordField(dataSourceName="PEBEMPL_TREA_CODE")
		public NString PebemplTreaCode;
		@DbRecordField(dataSourceName="PEBEMPL_TERM_DATE")
		public NDate PebemplTermDate;
		@DbRecordField(dataSourceName="PEBEMPL_I9_FORM_IND")
		public NString PebemplI9FormInd;
		@DbRecordField(dataSourceName="PEBEMPL_I9_DATE")
		public NDate PebemplI9Date;
		@DbRecordField(dataSourceName="PEBEMPL_I9_EXPIRE_DATE")
		public NDate PebemplI9ExpireDate;
		@DbRecordField(dataSourceName="PEBEMPL_ACTIVITY_DATE")
		public NDate PebemplActivityDate;
		@DbRecordField(dataSourceName="PEBEMPL_WKPR_CODE")
		public NString PebemplWkprCode;
		@DbRecordField(dataSourceName="PEBEMPL_FLSA_IND")
		public NString PebemplFlsaInd;
		@DbRecordField(dataSourceName="PEBEMPL_STGR_CODE")
		public NString PebemplStgrCode;
		@DbRecordField(dataSourceName="PEBEMPL_DAYS_IN_CANADA")
		public NNumber PebemplDaysInCanada;
		@DbRecordField(dataSourceName="PEBEMPL_1042_RECIPIENT_CD")
		public NString Pebempl1042RecipientCd;
		@DbRecordField(dataSourceName="PEBEMPL_INTERNAL_FT_PT_IND")
		public NString PebemplInternalFtPtInd;
		@DbRecordField(dataSourceName="PEBEMPL_DICD_CODE")
		public NString PebemplDicdCode;
		@DbRecordField(dataSourceName="PEBEMPL_EGRP_CODE")
		public NString PebemplEgrpCode;
		@DbRecordField(dataSourceName="PEBEMPL_IPEDS_SOFT_MONEY_IND")
		public NString PebemplIpedsSoftMoneyInd;
		@DbRecordField(dataSourceName="PEBEMPL_FIRST_WORK_DATE")
		public NDate PebemplFirstWorkDate;
		@DbRecordField(dataSourceName="PEBEMPL_LAST_WORK_DATE")
		public NDate PebemplLastWorkDate;
		@DbRecordField(dataSourceName="PEBEMPL_CALIF_PENSION_IND")
		public NString PebemplCalifPensionInd;
		@DbRecordField(dataSourceName="PEBEMPL_NRSI_CODE")
		public NString PebemplNrsiCode;
		@DbRecordField(dataSourceName="PEBEMPL_SSN_LAST_NAME")
		public NString PebemplSsnLastName;
		@DbRecordField(dataSourceName="PEBEMPL_SSN_FIRST_NAME")
		public NString PebemplSsnFirstName;
		@DbRecordField(dataSourceName="PEBEMPL_SSN_MI")
		public NString PebemplSsnMi;
		@DbRecordField(dataSourceName="PEBEMPL_SSN_SUFFIX")
		public NString PebemplSsnSuffix;
		@DbRecordField(dataSourceName="PEBEMPL_JBLN_CODE")
		public NString PebemplJblnCode;
		@DbRecordField(dataSourceName="PEBEMPL_COLL_CODE")
		public NString PebemplCollCode;
		@DbRecordField(dataSourceName="PEBEMPL_CAMP_CODE")
		public NString PebemplCampCode;
		@DbRecordField(dataSourceName="PEBEMPL_NEW_HIRE_IND")
		public NString PebemplNewHireInd;
		
		public PebemplRowtypeRow(){
			super();
		}
		
		public PebemplRowtypeRow(ResultSet selEmplRecResults)
		{
			super();
			PebemplPidm = toNumber(selEmplRecResults.getObject(0));
			PebemplEmplStatus = toStr(selEmplRecResults.getObject(1));
			PebemplCoasCodeHome = toStr(selEmplRecResults.getObject(2));
			PebemplOrgnCodeHome = toStr(selEmplRecResults.getObject(3));
			PebemplCoasCodeDist = toStr(selEmplRecResults.getObject(4));
			PebemplOrgnCodeDist = toStr(selEmplRecResults.getObject(5));
			PebemplEclsCode = toStr(selEmplRecResults.getObject(6));
			PebemplLcatCode = toStr(selEmplRecResults.getObject(7));
			PebemplBcatCode = toStr(selEmplRecResults.getObject(8));
			PebemplFirstHireDate = toDate(selEmplRecResults.getObject(9));
			PebemplCurrentHireDate = toDate(selEmplRecResults.getObject(10));
			PebemplAdjServiceDate = toDate(selEmplRecResults.getObject(11));
			PebemplSeniorityDate = toDate(selEmplRecResults.getObject(12));
			PebemplLreaCode = toStr(selEmplRecResults.getObject(13));
			PebemplLoaBegDate = toDate(selEmplRecResults.getObject(14));
			PebemplLoaEndDate = toDate(selEmplRecResults.getObject(15));
			PebemplTreaCode = toStr(selEmplRecResults.getObject(16));
			PebemplTermDate = toDate(selEmplRecResults.getObject(17));
			PebemplI9FormInd = toStr(selEmplRecResults.getObject(18));
			PebemplI9Date = toDate(selEmplRecResults.getObject(19));
			PebemplI9ExpireDate = toDate(selEmplRecResults.getObject(20));
			PebemplActivityDate = toDate(selEmplRecResults.getObject(21));
			PebemplWkprCode = toStr(selEmplRecResults.getObject(22));
			PebemplFlsaInd = toStr(selEmplRecResults.getObject(23));
			PebemplStgrCode = toStr(selEmplRecResults.getObject(24));
			PebemplDaysInCanada = toNumber(selEmplRecResults.getObject(25));
			Pebempl1042RecipientCd = toStr(selEmplRecResults.getObject(26));
			PebemplInternalFtPtInd = toStr(selEmplRecResults.getObject(27));
			PebemplDicdCode = toStr(selEmplRecResults.getObject(28));
			PebemplEgrpCode = toStr(selEmplRecResults.getObject(29));
			PebemplIpedsSoftMoneyInd = toStr(selEmplRecResults.getObject(30));
			PebemplFirstWorkDate = toDate(selEmplRecResults.getObject(31));
			PebemplLastWorkDate = toDate(selEmplRecResults.getObject(32));
			PebemplCalifPensionInd = toStr(selEmplRecResults.getObject(33));
			PebemplNrsiCode = toStr(selEmplRecResults.getObject(34));
			PebemplSsnLastName = toStr(selEmplRecResults.getObject(35));
			PebemplSsnFirstName = toStr(selEmplRecResults.getObject(36));
			PebemplSsnMi = toStr(selEmplRecResults.getObject(37));
			PebemplSsnSuffix = toStr(selEmplRecResults.getObject(38));
			PebemplJblnCode = toStr(selEmplRecResults.getObject(39));
			PebemplCollCode = toStr(selEmplRecResults.getObject(40));
			PebemplCampCode = toStr(selEmplRecResults.getObject(41));
			PebemplNewHireInd = toStr(selEmplRecResults.getObject(42));
		}
	}

	
	
}
