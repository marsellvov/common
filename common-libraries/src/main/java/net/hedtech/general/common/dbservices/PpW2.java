package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class PpW2 {
		public static NString fBoxCode(NNumber pYear,NString pBoxName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2.F_BOX_CODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_BOX_NAME", pBoxName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBoxName(NNumber pYear,NString pBoxCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2.F_BOX_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_BOX_CODE", pBoxCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fBoxSubname(NNumber pYear,NString pBoxCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2.F_BOX_SUBNAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_BOX_CODE", pBoxCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fConstantString(NString pConstantName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2.F_CONSTANT_STRING", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CONSTANT_NAME", pConstantName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fQuarterEndMonth(NNumber pQuarter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2.F_QUARTER_END_MONTH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_QUARTER", pQuarter);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fQuarterStartMonth(NNumber pQuarter) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2.F_QUARTER_START_MONTH", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_QUARTER", pQuarter);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static void pCreatePxrrept(NString pReptCode,NString pYear,NNumber pStartMonth,NNumber pEndMonth,NString pEmprCode,NNumber pPidm,NString pRboxCode,NString pSessionId,NNumber pAmount) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2.P_CREATE_PXRREPT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REPT_CODE", pReptCode);
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_START_MONTH", pStartMonth);
			cmd.addParameter("@P_END_MONTH", pEndMonth);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RBOX_CODE", pRboxCode);
			cmd.addParameter("@P_SESSION_ID", pSessionId);
			cmd.addParameter("@P_AMOUNT", pAmount);
				
			cmd.execute();


		}
		
		public static void pCreateW2(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NString pW2Type,NString pZeroOutNegInd,NString pReissueInd,Ref<NNumber> pSeqNoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2.P_CREATE_W2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_W2_TYPE", pW2Type);
			cmd.addParameter("@P_ZERO_OUT_NEG_IND", pZeroOutNegInd);
			cmd.addParameter("@P_REISSUE_IND", pReissueInd);
			cmd.addParameter("@P_SEQ_NO_OUT", NNumber.class);
				
			cmd.execute();
			pSeqNoOut.val = cmd.getParameterValue("@P_SEQ_NO_OUT", NNumber.class);


		}
		
		public static void pDeleteW2(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2.P_DELETE_W2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
				
			cmd.execute();


		}
		
		public static void pGetW2(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NNumber pSeqNo,NString pW2Format,NNumber pW2SeqNo,Ref<W2RectypeRow> pW2RecOut,Ref<NNumber> pNextW2SeqNoOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2.P_GET_W2", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_YEAR", pYear);
			cmd.addParameter("@P_QUARTER", pQuarter);
			cmd.addParameter("@P_EMPR_CODE", pEmprCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_SEQ_NO", pSeqNo);
			cmd.addParameter("@P_W2_FORMAT", pW2Format);
			cmd.addParameter("@P_W2_SEQ_NO", pW2SeqNo);
			cmd.addParameter(DbTypes.createStructType("P_W2_REC_OUT",pW2RecOut.val, W2RectypeRow.class));
			cmd.addParameter("@P_NEXT_W2_SEQ_NO_OUT", NNumber.class);
				
			cmd.execute();
			pW2RecOut.val = cmd.getParameterValue("@P_W2_REC_OUT", W2RectypeRow.class);
			pNextW2SeqNoOut.val = cmd.getParameterValue("@P_NEXT_W2_SEQ_NO_OUT", NNumber.class);


		}
		
		public static void pGetW2Totals(NNumber pYear,NNumber pQuarter,NString pEmprCode,NNumber pPidm,NString pZeroOutNegInd,Ref<W2RectypeRow> pW2RecOut,Ref<NString> pWarningMsgOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("PP_W2.P_GET_W2_TOTALS", DbManager.getDataBaseFactory());
			
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
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
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
		@DbRecordField(dataSourceName="R_CODE")
		public NString RCode;
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
	}

	
	@DbRecordType(id="W2RectypeRow", dataSourceName="W2_RECTYPE")
	public static class W2RectypeRow
	{
		@DbRecordField(dataSourceName="R_W2_STATUS")
		public NString RW2Status;
		@DbRecordField(dataSourceName="R_EMPLOYER_ID")
		public NString REmployerId;
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
		@DbRecordField(dataSourceName="R_UNCOLL_SS_TAX_ON_TIPS")
		public NNumber RUncollSsTaxOnTips;
		@DbRecordField(dataSourceName="R_UNCOLL_MC_TAX_ON_TIPS")
		public NNumber RUncollMcTaxOnTips;
		@DbRecordField(dataSourceName="R_LIFE_INSURANCE_COST")
		public NNumber RLifeInsuranceCost;
		@DbRecordField(dataSourceName="R_DEFERRED_COMP_401K")
		public NNumber RDeferredComp401k;
		@DbRecordField(dataSourceName="R_DEFERRED_COMP_403B")
		public NNumber RDeferredComp403b;
		@DbRecordField(dataSourceName="R_DEFERRED_COMP_408K")
		public NNumber RDeferredComp408k;
		@DbRecordField(dataSourceName="R_DEFERRED_COMP_457B")
		public NNumber RDeferredComp457b;
		@DbRecordField(dataSourceName="R_DEFERRED_COMP_501C")
		public NNumber RDeferredComp501c;
		@DbRecordField(dataSourceName="R_NONTAXABLE_SICK_PAY")
		public NNumber RNontaxableSickPay;
		@DbRecordField(dataSourceName="R_EXCISE_TAX_ON_GPP")
		public NNumber RExciseTaxOnGpp;
		@DbRecordField(dataSourceName="R_BUSINESS_EXP_REIMBURSED")
		public NNumber RBusinessExpReimbursed;
		@DbRecordField(dataSourceName="R_UNCOLL_SS_LIFE_INS")
		public NNumber RUncollSsLifeIns;
		@DbRecordField(dataSourceName="R_UNCOLL_MC_LIFE_INS")
		public NNumber RUncollMcLifeIns;
		@DbRecordField(dataSourceName="R_MOVING_EXP_REIMBURSED")
		public NNumber RMovingExpReimbursed;
		@DbRecordField(dataSourceName="R_NONTAXABLE_COMBAT_PAY")
		public NNumber RNontaxableCombatPay;
		@DbRecordField(dataSourceName="R_MSA_EMPR_CONTRIBUTIONS")
		public NNumber RMsaEmprContributions;
		@DbRecordField(dataSourceName="R_DEFERRED_COMP_408P")
		public NNumber RDeferredComp408p;
		@DbRecordField(dataSourceName="R_ADOPTION_BENEFITS")
		public NNumber RAdoptionBenefits;
		@DbRecordField(dataSourceName="R_NONSTATUTORY_STOCK_OPT")
		public NNumber RNonstatutoryStockOpt;
		@DbRecordField(dataSourceName="R_HSA_EMPR_CONTRIBUTIONS")
		public NNumber RHsaEmprContributions;
		@DbRecordField(dataSourceName="R_DEFERRED_COMP_409A")
		public NNumber RDeferredComp409a;
		@DbRecordField(dataSourceName="R_INCOME_UNDER_409A")
		public NNumber RIncomeUnder409a;
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
