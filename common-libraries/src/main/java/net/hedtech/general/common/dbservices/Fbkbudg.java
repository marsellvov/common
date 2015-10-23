package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fbkbudg {
		public static NString fCheckFinUserWbudAccess(NString userIdIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKBUDG.F_CHECK_FIN_USER_WBUD_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@USER_ID_IN", userIdIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckSyscAudtEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKBUDG.F_CHECK_SYSC_AUDT_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fCheckSyscWbudEnabled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKBUDG.F_CHECK_SYSC_WBUD_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NDate fGetBudgetEffectiveDate(NString coasCode,NString budId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKBUDG.F_GET_BUDGET_EFFECTIVE_DATE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NDate.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@BUD_ID", budId);
				
			cmd.execute();

			return cmd.getReturnValue(NDate.class);

		}
		
		public static void fGetObph() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKBUDG.F_GET_OBPH", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void fGetObud() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKBUDG.F_GET_OBUD", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static NString fGetlockstatus(NString inCoas,NString inBudgid,NString inPhase,NString inOrgn,NDate inAsofdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKBUDG.F_GETLOCKSTATUS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IN_COAS", inCoas);
			cmd.addParameter("@IN_BUDGID", inBudgid);
			cmd.addParameter("@IN_PHASE", inPhase);
			cmd.addParameter("@IN_ORGN", inOrgn);
			cmd.addParameter("@IN_ASOFDATE", inAsofdate);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fWbudFundOrgSecurity(NString coasCode,NString fundCode,NString orgCode,NDate asofDate,NString queryOrPost,NString whichUserId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKBUDG.F_WBUD_FUND_ORG_SECURITY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@FUND_CODE", fundCode);
			cmd.addParameter("@ORG_CODE", orgCode);
			cmd.addParameter("@ASOF_DATE", asofDate);
			cmd.addParameter("@QUERY_OR_POST", queryOrPost);
			cmd.addParameter("@WHICH_USER_ID", whichUserId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pGetBudgetTextSeqNum(NString acctCode,Ref<NString> seqNum,Ref<NBool> pInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKBUDG.P_GET_BUDGET_TEXT_SEQ_NUM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@ACCT_CODE", acctCode);
			cmd.addParameter("@SEQ_NUM", NString.class);
			cmd.addParameter("@P_IND", NBool.class);
				
			cmd.execute();
			seqNum.val = cmd.getParameterValue("@SEQ_NUM", NString.class);
			pInd.val = cmd.getParameterValue("@P_IND", NBool.class);


		}
		
		public static void pGetSuccessorOrgnList(Ref<DataCursor> sucOrgnListCv,NString coasIn,NString orgnIn,NDate dateIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKBUDG.P_GET_SUCCESSOR_ORGN_LIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SUC_ORGN_LIST_CV", DataCursor.class);
			cmd.addParameter("@COAS_IN", coasIn);
			cmd.addParameter("@ORGN_IN", orgnIn);
			cmd.addParameter("@DATE_IN", dateIn);
				
			cmd.execute();
			sucOrgnListCv.val = cmd.getParameterValue("@SUC_ORGN_LIST_CV", DataCursor.class);


		}
		
		public static void pRetrieveBudgetDefPhases(NString budgetId,NString coasCode,Ref<NString> budgPhaseDef1,Ref<NString> budgPhaseDef2,Ref<NString> budgPhaseDef3,Ref<NString> budgPhaseTitle1,Ref<NString> budgPhaseTitle2,Ref<NString> budgPhaseTitle3) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKBUDG.P_RETRIEVE_BUDGET_DEF_PHASES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BUDGET_ID", budgetId);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@BUDG_PHASE_DEF1", NString.class);
			cmd.addParameter("@BUDG_PHASE_DEF2", NString.class);
			cmd.addParameter("@BUDG_PHASE_DEF3", NString.class);
			cmd.addParameter("@BUDG_PHASE_TITLE1", NString.class);
			cmd.addParameter("@BUDG_PHASE_TITLE2", NString.class);
			cmd.addParameter("@BUDG_PHASE_TITLE3", NString.class);
				
			cmd.execute();
			budgPhaseDef1.val = cmd.getParameterValue("@BUDG_PHASE_DEF1", NString.class);
			budgPhaseDef2.val = cmd.getParameterValue("@BUDG_PHASE_DEF2", NString.class);
			budgPhaseDef3.val = cmd.getParameterValue("@BUDG_PHASE_DEF3", NString.class);
			budgPhaseTitle1.val = cmd.getParameterValue("@BUDG_PHASE_TITLE1", NString.class);
			budgPhaseTitle2.val = cmd.getParameterValue("@BUDG_PHASE_TITLE2", NString.class);
			budgPhaseTitle3.val = cmd.getParameterValue("@BUDG_PHASE_TITLE3", NString.class);


		}
		
		public static void pValBudgCoasCombination(NString budgetId,NString coasCode,NDate dateIn,Ref<NString> validInd,Ref<NString> budgetTitle,Ref<NString> coasTitle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKBUDG.P_VAL_BUDG_COAS_COMBINATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BUDGET_ID", budgetId);
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@DATE_IN", dateIn);
			cmd.addParameter("@VALID_IND", NString.class);
			cmd.addParameter("@BUDGET_TITLE", NString.class);
			cmd.addParameter("@COAS_TITLE", NString.class);
				
			cmd.execute();
			validInd.val = cmd.getParameterValue("@VALID_IND", NString.class);
			budgetTitle.val = cmd.getParameterValue("@BUDGET_TITLE", NString.class);
			coasTitle.val = cmd.getParameterValue("@COAS_TITLE", NString.class);


		}
		
		public static void pValidateCoasBudgetPhase(NString coasCode,NString budgetId,NString budgetPhase1,NString budgetPhase2,NString budgetPhase3,NDate dateIn,Ref<NString> coasTitle,Ref<NString> budgetTitle,Ref<NString> budgPhaseTitle1,Ref<NString> budgPhaseTitle2,Ref<NString> budgPhaseTitle3) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKBUDG.P_VALIDATE_COAS_BUDGET_PHASE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@COAS_CODE", coasCode);
			cmd.addParameter("@BUDGET_ID", budgetId);
			cmd.addParameter("@BUDGET_PHASE1", budgetPhase1);
			cmd.addParameter("@BUDGET_PHASE2", budgetPhase2);
			cmd.addParameter("@BUDGET_PHASE3", budgetPhase3);
			cmd.addParameter("@DATE_IN", dateIn);
			cmd.addParameter("@COAS_TITLE", NString.class);
			cmd.addParameter("@BUDGET_TITLE", NString.class);
			cmd.addParameter("@BUDG_PHASE_TITLE1", NString.class);
			cmd.addParameter("@BUDG_PHASE_TITLE2", NString.class);
			cmd.addParameter("@BUDG_PHASE_TITLE3", NString.class);
				
			cmd.execute();
			coasTitle.val = cmd.getParameterValue("@COAS_TITLE", NString.class);
			budgetTitle.val = cmd.getParameterValue("@BUDGET_TITLE", NString.class);
			budgPhaseTitle1.val = cmd.getParameterValue("@BUDG_PHASE_TITLE1", NString.class);
			budgPhaseTitle2.val = cmd.getParameterValue("@BUDG_PHASE_TITLE2", NString.class);
			budgPhaseTitle3.val = cmd.getParameterValue("@BUDG_PHASE_TITLE3", NString.class);


		}
		
	
	
	@DbRecordType(id="SuccessorOrgnListRecordRow", dataSourceName="SUCCESSOR_ORGN_LIST_RECORD")
	public static class SuccessorOrgnListRecordRow
	{
		@DbRecordField(dataSourceName="COAS")
		public NString Coas;
		@DbRecordField(dataSourceName="ORGN")
		public NString Orgn;
		@DbRecordField(dataSourceName="TITLE")
		public NString Title;
		@DbRecordField(dataSourceName="THE_LEVEL")
		public NNumber TheLevel;
	}

	
	
}
