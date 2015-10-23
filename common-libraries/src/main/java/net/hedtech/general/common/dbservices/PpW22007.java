package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PpW22007 {
		public static void pCreateW2(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NString pW2Type,NString pZeroOutNegInd,NString pReissueInd,NString pUserId,NString pDataOrigin,Ref<NNumber> pSeqNoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2_2007.P_CREATE_W2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_W2_TYPE", pW2Type);
			cmd.addParameter("@P_ZERO_OUT_NEG_IND", pZeroOutNegInd);
			cmd.addParameter("@P_REISSUE_IND", pReissueInd);
			cmd.addParameter("@P_USER_ID", pUserId);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
			cmd.addParameter("@P_SEQ_NO_OUT", NNumber.class);
				
			cmd.execute();
			pSeqNoOut.val = cmd.getParameterValue("@P_SEQ_NO_OUT", NNumber.class);


		}
		
		public static void pDeleteW2(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2_2007.P_DELETE_W2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();


		}
		
		public static void pGetW2(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,Ref<W2RectypeRow> pW2RecOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2_2007.P_GET_W2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter(DbTypes.createStructType("P_W2_REC_OUT", pW2RecOut.val,W2RectypeRow.class));
				
			cmd.execute();
			pW2RecOut.val = cmd.getParameterValue("@P_W2_REC_OUT", W2RectypeRow.class);


		}
		
		public static void pGetW2Totals(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NString pZeroOutNegInd,Ref<W2RectypeRow> pW2RecOut,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2_2007.P_GET_W2_TOTALS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_ZERO_OUT_NEG_IND", pZeroOutNegInd);
			cmd.addParameter(DbTypes.createStructType("P_W2_REC_OUT",pW2RecOut.val, W2RectypeRow.class));
			cmd.addParameter("@P_WARNING_MSG_OUT", NString.class);
				
			cmd.execute();
			pW2RecOut.val = cmd.getParameterValue("@P_W2_REC_OUT", W2RectypeRow.class);
			pWarningMsgOut.val = cmd.getParameterValue("@P_WARNING_MSG_OUT", NString.class);


		}
		
	
	
	@DbRecordType(id="LocalRectypeRow", dataSourceName="LOCAL_RECTYPE")
	public static class LocalRectypeRow
	{
		@DbRecordField(dataSourceName="R_BDCA_CODE")
		public NString RBdcaCode;
		@DbRecordField(dataSourceName="R_WAGES_TIPS_COMP")
		public NNumber RWagesTipsComp;
		@DbRecordField(dataSourceName="R_INCOME_TAX")
		public NNumber RIncomeTax;
		@DbRecordField(dataSourceName="R_LOCALITY_NAME")
		public NString RLocalityName;
	}

	
	@DbRecordType(id="MiscRectypeRow", dataSourceName="MISC_RECTYPE")
	public static class MiscRectypeRow
	{
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
		@DbRecordField(dataSourceName="R_AMOUNT")
		public NNumber RAmount;
	}

	
	@DbRecordType(id="OtherRectypeRow", dataSourceName="OTHER_RECTYPE")
	public static class OtherRectypeRow
	{
		@DbRecordField(dataSourceName="R_DESC")
		public NString RDesc;
		@DbRecordField(dataSourceName="R_AMOUNT")
		public NNumber RAmount;
	}

	
	@DbRecordType(id="StateRectypeRow", dataSourceName="STATE_RECTYPE")
	public static class StateRectypeRow
	{
		@DbRecordField(dataSourceName="R_STATE_CODE")
		public NString RStateCode;
		@DbRecordField(dataSourceName="R_TAX_ENTITY_CODE")
		public NString RTaxEntityCode;
		@DbRecordField(dataSourceName="R_EMPLOYER_ID")
		public NString REmployerId;
		@DbRecordField(dataSourceName="R_WAGES_TIPS_COMP")
		public NNumber RWagesTipsComp;
		@DbRecordField(dataSourceName="R_INCOME_TAX")
		public NNumber RIncomeTax;
		@DbRecordField(dataSourceName="R_QTR_UI_TOTAL_WAGES")
		public NNumber RQtrUiTotalWages;
		@DbRecordField(dataSourceName="R_QTR_UI_TAXABLE_WAGES")
		public NNumber RQtrUiTaxableWages;
		@DbRecordField(dataSourceName="R_DATE_FIRST_EMPLOYED")
		public NDate RDateFirstEmployed;
		@DbRecordField(dataSourceName="R_DATE_OF_SEPARATION")
		public NDate RDateOfSeparation;
	}

	
	@DbRecordType(id="W2RectypeRow", dataSourceName="W2_RECTYPE")
	public static class W2RectypeRow
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
		@DbRecordField(dataSourceName="R_W2_STATUS")
		public NString RW2Status;
		@DbRecordField(dataSourceName="R_EMPLOYER_FEDERAL_EIN")
		public NString REmployerFederalEin;
		@DbRecordField(dataSourceName="R_EMPLOYER_NAME")
		public NString REmployerName;
		@DbRecordField(dataSourceName="R_EMPLOYER_ADDR_LINE_1")
		public NString REmployerAddrLine1;
		@DbRecordField(dataSourceName="R_EMPLOYER_ADDR_LINE_2")
		public NString REmployerAddrLine2;
		@DbRecordField(dataSourceName="R_EMPLOYER_ADDR_LINE_3")
		public NString REmployerAddrLine3;
		@DbRecordField(dataSourceName="R_EMPLOYEE_SSN")
		public NString REmployeeSsn;
		@DbRecordField(dataSourceName="R_EMPLOYEE_FIRST_NAME")
		public NString REmployeeFirstName;
		@DbRecordField(dataSourceName="R_EMPLOYEE_MI")
		public NString REmployeeMi;
		@DbRecordField(dataSourceName="R_EMPLOYEE_LAST_NAME")
		public NString REmployeeLastName;
		@DbRecordField(dataSourceName="R_EMPLOYEE_SUFFIX")
		public NString REmployeeSuffix;
		@DbRecordField(dataSourceName="R_STATUTORY_EMPLOYEE_IND")
		public NString RStatutoryEmployeeInd;
		@DbRecordField(dataSourceName="R_RETIREMENT_PLAN_IND")
		public NString RRetirementPlanInd;
		@DbRecordField(dataSourceName="R_THIRD_PARTY_SICK_IND")
		public NString RThirdPartySickInd;
		@DbRecordField(dataSourceName="R_WAGES_TIPS_COMP")
		public NNumber RWagesTipsComp;
		@DbRecordField(dataSourceName="R_FEDERAL_INCOME_TAX")
		public NNumber RFederalIncomeTax;
		@DbRecordField(dataSourceName="R_SOCIAL_SECURITY_WAGES")
		public NNumber RSocialSecurityWages;
		@DbRecordField(dataSourceName="R_SOCIAL_SECURITY_TAX")
		public NNumber RSocialSecurityTax;
		@DbRecordField(dataSourceName="R_MEDICARE_WAGES_TIPS")
		public NNumber RMedicareWagesTips;
		@DbRecordField(dataSourceName="R_MEDICARE_TAX")
		public NNumber RMedicareTax;
		@DbRecordField(dataSourceName="R_SOCIAL_SECURITY_TIPS")
		public NNumber RSocialSecurityTips;
		@DbRecordField(dataSourceName="R_ALLOCATED_TIPS")
		public NNumber RAllocatedTips;
		@DbRecordField(dataSourceName="R_ADVANCE_EIC_PAYMENT")
		public NNumber RAdvanceEicPayment;
		@DbRecordField(dataSourceName="R_DEPENDENT_CARE")
		public NNumber RDependentCare;
		@DbRecordField(dataSourceName="R_NONQUALIFIED_PLANS")
		public NNumber RNonqualifiedPlans;
		@DbRecordField(dataSourceName="R_NONQUALIFIED_PLANS_457")
		public NNumber RNonqualifiedPlans457;
		@DbRecordField(dataSourceName="R_MISC_TABLE")
		public UnknownTypes.MiscTabtype RMiscTable;
		@DbRecordField(dataSourceName="R_OTHER_TABLE")
		public UnknownTypes.OtherTabtype ROtherTable;
		@DbRecordField(dataSourceName="R_STATE_TABLE")
		public UnknownTypes.StateTabtype RStateTable;
		@DbRecordField(dataSourceName="R_LOCAL_TABLE")
		public UnknownTypes.LocalTabtype RLocalTable;
	}

	
	
}
