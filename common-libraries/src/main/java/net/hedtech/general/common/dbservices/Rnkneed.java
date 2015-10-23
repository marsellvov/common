package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rnkneed {
		public static NNumber fCalcActReduceNeedAmt(NNumber pPidm,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_ACT_REDUCE_NEED_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcActReplaceEfcAmt(NNumber pPidm,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_ACT_REPLACE_EFC_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcBudgetAmt(NNumber pPidm,NString pAidyCode,NString pTypeInd,NString pRunName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_BUDGET_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
			cmd.addParameter("@P_RUN_NAME", pRunName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcContractPayment(NNumber pPidm,NNumber pContractPidm,NNumber pContractNumber,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_CONTRACT_PAYMENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_CONTRACT_PIDM", pContractPidm);
			cmd.addParameter("@P_CONTRACT_NUMBER", pContractNumber);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcContracts(NNumber pPidm,NString pAidyCode,NString pLoad) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_CONTRACTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_LOAD", pLoad);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcDirectCostAmt(NNumber pPidm,NString pAidyCode,NString pTypeInd,NString pRunName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_DIRECT_COST_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
			cmd.addParameter("@P_RUN_NAME", pRunName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcEfc(NNumber pPidm,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_EFC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcExcessEfcAmt(NNumber pPidm,NString pAidyCode,NString pCalcTypeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_EXCESS_EFC_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CALC_TYPE_IND", pCalcTypeInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcExemptionPayment(NNumber pPidm,NNumber pExemptionCode,NString pTermCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_EXEMPTION_PAYMENT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_EXEMPTION_CODE", pExemptionCode);
			cmd.addParameter("@P_TERM_CODE", pTermCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcExemptions(NNumber pPidm,NString pAidyCode,NString pLoad) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_EXEMPTIONS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_LOAD", pLoad);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcGrossNeed(NNumber pPidm,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_GROSS_NEED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcImEfc(NNumber pPidm,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_IM_EFC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcImExcessEfcAmt(NNumber pPidm,NString pAidyCode,NString pCalcTypeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_IM_EXCESS_EFC_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CALC_TYPE_IND", pCalcTypeInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcImGrossNeed(NNumber pPidm,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_IM_GROSS_NEED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcImUnmetNeed(NNumber pPidm,NString pAidyCode,NString pCalcTypeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_IM_UNMET_NEED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CALC_TYPE_IND", pCalcTypeInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fCalcLoad(NNumber pPidm,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_LOAD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber fCalcNonPellBudgetAmt(NNumber pPidm,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_NON_PELL_BUDGET_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcOfferAmt(NNumber pPidm,NString pAidyCode,NString pCalcTypeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_OFFER_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CALC_TYPE_IND", pCalcTypeInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcOthResource(NNumber pPidm,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_OTH_RESOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcPellAward(NNumber pPidm,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_PELL_AWARD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcPellBudgetAmt(NNumber pPidm,NString pAidyCode,NString pRunName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_PELL_BUDGET_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_RUN_NAME", pRunName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcPellEfc(NNumber pPidm,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_PELL_EFC", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcPellLtHalfCoa(NNumber pPidm,NString pAidyCode,NString pRunName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_PELL_LT_HALF_COA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_RUN_NAME", pRunName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcPeriodBudgetAmt(NNumber pPidm,NString pAidyCode,NString pTypeInd,NString pRunName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_PERIOD_BUDGET_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
			cmd.addParameter("@P_RUN_NAME", pRunName);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcResource(NNumber pPidm,NString pAidyCode,NString pLoad) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_RESOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_LOAD", pLoad);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcSimReduceNeedAmt(NNumber pPidm,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_SIM_REDUCE_NEED_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcSimReplaceEfcAmt(NNumber pPidm,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_SIM_REPLACE_EFC_AMT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcUnmetNeed(NNumber pPidm,NString pAidyCode,NString pCalcTypeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_UNMET_NEED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CALC_TYPE_IND", pCalcTypeInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcYearContracts(NNumber pPidm,NString pAidyCode,NString pLoad) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_YEAR_CONTRACTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_LOAD", pLoad);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcYearExemptions(NNumber pPidm,NString pAidyCode,NString pLoad) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_YEAR_EXEMPTIONS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_LOAD", pLoad);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fCalcYearOthResource(NNumber pPidm,NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_CALC_YEAR_OTH_RESOURCE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fFindEfcInd(NNumber pPidm,NString pAidyCode,NString pRunName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_FIND_EFC_IND", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_RUN_NAME", pRunName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NeedrectypeRow fGetNeedData(NNumber pPidm,NString pAidyCode,NString pCalcTypeInd,NString pRunName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.F_GET_NEED_DATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(DbTypes.createStructType(NeedrectypeRow.class));
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_CALC_TYPE_IND", pCalcTypeInd);
			cmd.addParameter("@P_RUN_NAME", pRunName);
				
			cmd.execute();

			return cmd.getReturnValue(NeedrectypeRow.class);

		}
		
		public static void pGetBudgetGroupData(NNumber pPidm,NString pAidyCode,Ref<NString> pBudgetGroupOut,Ref<NString> pBudgetGroupIndOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.P_GET_BUDGET_GROUP_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_BUDGET_GROUP_OUT", NString.class);
			cmd.addParameter("@P_BUDGET_GROUP_IND_OUT", NString.class);
				
			cmd.execute();
			pBudgetGroupOut.val = cmd.getParameterValue("@P_BUDGET_GROUP_OUT", NString.class);
			pBudgetGroupIndOut.val = cmd.getParameterValue("@P_BUDGET_GROUP_IND_OUT", NString.class);


		}
		
		public static void pGetCrossoverData(NNumber pPidm,NString pAidyCode,Ref<NNumber> pPellAwardOut,Ref<NString> pAidyCodeOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.P_GET_CROSSOVER_DATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PELL_AWARD_OUT", NNumber.class);
			cmd.addParameter("@P_AIDY_CODE_OUT", NString.class);
				
			cmd.execute();
			pPellAwardOut.val = cmd.getParameterValue("@P_PELL_AWARD_OUT", NNumber.class);
			pAidyCodeOut.val = cmd.getParameterValue("@P_AIDY_CODE_OUT", NString.class);


		}
		
		public static void pGetNeedSummary(NNumber pPidm,NString pAidyCode,Ref<NString> pAprdCodeOut,Ref<NString> pAprdCodePellOut,Ref<NNumber> pOfferAmtOut,Ref<NNumber> pResourceAmtOut,Ref<NNumber> pCrossoverPellAwardOut,Ref<NString> pCrossoverAidyCodeOut,Ref<NNumber> pFmBudgetAmtOut,Ref<NNumber> pFmEfcOut,Ref<NNumber> pFmGrossNeedOut,Ref<NNumber> pFmUnmetNeedOut,Ref<NNumber> pImBudgetAmtOut,Ref<NNumber> pImEfcOut,Ref<NNumber> pImGrossNeedOut,Ref<NNumber> pImUnmetNeedOut,Ref<NNumber> pPellBudgetAmtOut,Ref<NNumber> pPellEfcOut,Ref<NString> pBudgetGroupOut,Ref<NString> pBudgetGroupIndOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RNKNEED.P_GET_NEED_SUMMARY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APRD_CODE_OUT", NString.class);
			cmd.addParameter("@P_APRD_CODE_PELL_OUT", NString.class);
			cmd.addParameter("@P_OFFER_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_RESOURCE_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_CROSSOVER_PELL_AWARD_OUT", NNumber.class);
			cmd.addParameter("@P_CROSSOVER_AIDY_CODE_OUT", NString.class);
			cmd.addParameter("@P_FM_BUDGET_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_FM_EFC_OUT", NNumber.class);
			cmd.addParameter("@P_FM_GROSS_NEED_OUT", NNumber.class);
			cmd.addParameter("@P_FM_UNMET_NEED_OUT", NNumber.class);
			cmd.addParameter("@P_IM_BUDGET_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_IM_EFC_OUT", NNumber.class);
			cmd.addParameter("@P_IM_GROSS_NEED_OUT", NNumber.class);
			cmd.addParameter("@P_IM_UNMET_NEED_OUT", NNumber.class);
			cmd.addParameter("@P_PELL_BUDGET_AMT_OUT", NNumber.class);
			cmd.addParameter("@P_PELL_EFC_OUT", NNumber.class);
			cmd.addParameter("@P_BUDGET_GROUP_OUT", NString.class);
			cmd.addParameter("@P_BUDGET_GROUP_IND_OUT", NString.class);
				
			cmd.execute();
			pAprdCodeOut.val = cmd.getParameterValue("@P_APRD_CODE_OUT", NString.class);
			pAprdCodePellOut.val = cmd.getParameterValue("@P_APRD_CODE_PELL_OUT", NString.class);
			pOfferAmtOut.val = cmd.getParameterValue("@P_OFFER_AMT_OUT", NNumber.class);
			pResourceAmtOut.val = cmd.getParameterValue("@P_RESOURCE_AMT_OUT", NNumber.class);
			pCrossoverPellAwardOut.val = cmd.getParameterValue("@P_CROSSOVER_PELL_AWARD_OUT", NNumber.class);
			pCrossoverAidyCodeOut.val = cmd.getParameterValue("@P_CROSSOVER_AIDY_CODE_OUT", NString.class);
			pFmBudgetAmtOut.val = cmd.getParameterValue("@P_FM_BUDGET_AMT_OUT", NNumber.class);
			pFmEfcOut.val = cmd.getParameterValue("@P_FM_EFC_OUT", NNumber.class);
			pFmGrossNeedOut.val = cmd.getParameterValue("@P_FM_GROSS_NEED_OUT", NNumber.class);
			pFmUnmetNeedOut.val = cmd.getParameterValue("@P_FM_UNMET_NEED_OUT", NNumber.class);
			pImBudgetAmtOut.val = cmd.getParameterValue("@P_IM_BUDGET_AMT_OUT", NNumber.class);
			pImEfcOut.val = cmd.getParameterValue("@P_IM_EFC_OUT", NNumber.class);
			pImGrossNeedOut.val = cmd.getParameterValue("@P_IM_GROSS_NEED_OUT", NNumber.class);
			pImUnmetNeedOut.val = cmd.getParameterValue("@P_IM_UNMET_NEED_OUT", NNumber.class);
			pPellBudgetAmtOut.val = cmd.getParameterValue("@P_PELL_BUDGET_AMT_OUT", NNumber.class);
			pPellEfcOut.val = cmd.getParameterValue("@P_PELL_EFC_OUT", NNumber.class);
			pBudgetGroupOut.val = cmd.getParameterValue("@P_BUDGET_GROUP_OUT", NString.class);
			pBudgetGroupIndOut.val = cmd.getParameterValue("@P_BUDGET_GROUP_IND_OUT", NString.class);


		}
		
	
	
	@DbRecordType(id="NeedrectypeRow", dataSourceName="NEEDRECTYPE")
	public static class NeedrectypeRow
	{
		@DbRecordField(dataSourceName="BUDGET_AMOUNT")
		public NNumber BudgetAmount;
		@DbRecordField(dataSourceName="RESOURCE_AMOUNT")
		public NNumber ResourceAmount;
		@DbRecordField(dataSourceName="REPLACE_EFC_AMT")
		public NNumber ReplaceEfcAmt;
		@DbRecordField(dataSourceName="REDUCE_NEED_AMT")
		public NNumber ReduceNeedAmt;
		@DbRecordField(dataSourceName="EFC_IND")
		public NString EfcInd;
		@DbRecordField(dataSourceName="FM_BUDGET_AMOUNT")
		public NNumber FmBudgetAmount;
		@DbRecordField(dataSourceName="FM_EFC_AMT")
		public NNumber FmEfcAmt;
		@DbRecordField(dataSourceName="FM_GROSS_NEED")
		public NNumber FmGrossNeed;
		@DbRecordField(dataSourceName="FM_EXCESS_EFC_AMT")
		public NNumber FmExcessEfcAmt;
		@DbRecordField(dataSourceName="FM_UNMET_NEED")
		public NNumber FmUnmetNeed;
		@DbRecordField(dataSourceName="IM_BUDGET_AMOUNT")
		public NNumber ImBudgetAmount;
		@DbRecordField(dataSourceName="IM_EFC_AMT")
		public NNumber ImEfcAmt;
		@DbRecordField(dataSourceName="IM_GROSS_NEED")
		public NNumber ImGrossNeed;
		@DbRecordField(dataSourceName="IM_EXCESS_EFC_AMT")
		public NNumber ImExcessEfcAmt;
		@DbRecordField(dataSourceName="IM_UNMET_NEED")
		public NNumber ImUnmetNeed;
		@DbRecordField(dataSourceName="OFFER_AMT")
		public NNumber OfferAmt;
		@DbRecordField(dataSourceName="PELL_AWARD")
		public NNumber PellAward;
	}

	
	
}
