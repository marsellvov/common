package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Rbkpfrm {
//		public static List<BudgetsummaryrectabRow> fGetBudget(NString pAidyCode,NNumber pPidm,NString pTypeInd) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.F_GET_BUDGET", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<BudgetsummaryrectabRow>.class);
//			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
//			cmd.addParameter("@P_PIDM", pPidm);
//			cmd.addParameter("@P_TYPE_IND", pTypeInd);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<BudgetsummaryrectabRow>.class);
//
//		}
		
		public static NNumber fGetBudgetTotal(NString pAidyCode,NNumber pPidm,NString pTypeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.F_GET_BUDGET_TOTAL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetCompAmtForType(NString pAidyCode,NNumber pPidm,NString pPbtpCode,NString pPbcpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.F_GET_COMP_AMT_FOR_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber fGetCompTotalForType(NString pAidyCode,NNumber pPidm,NString pPbtpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.F_GET_COMP_TOTAL_FOR_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fRbrabrcExists(NString pAidyCode,NString pAbrcCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.F_RBRABRC_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_ABRC_CODE", pAbrcCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAddComponents(NString pAidyCode,NString pPbgpCode,NString pPbtpCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.P_ADD_COMPONENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();


		}
		
		public static void pAddPellComponents(NString pAidyCode,NString pPbgpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.P_ADD_PELL_COMPONENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
				
			cmd.execute();


		}
		
		public static void pCopyPellComponents(NString pAidyCode,NString pPbgpCode,NString pFromAidyCode,NString pFromPbgpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.P_COPY_PELL_COMPONENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_FROM_AIDY_CODE", pFromAidyCode);
			cmd.addParameter("@P_FROM_PBGP_CODE", pFromPbgpCode);
				
			cmd.execute();


		}
		
		public static void pCopyPeriodDetails(NString pAidyCode,NString pPbgpCode,NString pPbtpCode,NString pPeriod,NString pToAidyCode,NString pToPbgpCode,NString pToPbtpCode,NString pToPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.P_COPY_PERIOD_DETAILS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_TO_AIDY_CODE", pToAidyCode);
			cmd.addParameter("@P_TO_PBGP_CODE", pToPbgpCode);
			cmd.addParameter("@P_TO_PBTP_CODE", pToPbtpCode);
			cmd.addParameter("@P_TO_PERIOD", pToPeriod);
				
			cmd.execute();


		}
		
		public static void pDeleteApplSimRun(NString pRunName,NString pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.P_DELETE_APPL_SIM_RUN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();


		}
		
		public static void pDeleteBudget(NString pPidm,NString pAidyCode,NString pRunName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.P_DELETE_BUDGET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_RUN_NAME", pRunName);
				
			cmd.execute();


		}
		
		public static void pDeleteComponents(NString pAidyCode,NString pPbgpCode,NString pPbtpCode,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.P_DELETE_COMPONENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();


		}
		
		public static void pDeletePellComponents(NString pAidyCode,NString pPbgpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.P_DELETE_PELL_COMPONENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
				
			cmd.execute();


		}
		
		public static void pDeleteSimulationRun(NString pRunName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.P_DELETE_SIMULATION_RUN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RUN_NAME", pRunName);
				
			cmd.execute();


		}
		
		public static void pFinalizeBudgetGroups(NString pAidyCode,NString pPbgpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.P_FINALIZE_BUDGET_GROUPS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
				
			cmd.execute();


		}
		
		public static void pFinalizeBudgetTypes(NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.P_FINALIZE_BUDGET_TYPES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();


		}
		
		public static void pGetBudgetCategories(Ref<DataCursor> pResultsetInout,NString pAidyCode,NNumber pPidm,NString pTypeInd) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.P_GET_BUDGET_CATEGORIES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RESULTSET_INOUT", DataCursor.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_TYPE_IND", pTypeInd);
				
			cmd.execute();
			pResultsetInout.val = cmd.getParameterValue("@P_RESULTSET_INOUT", DataCursor.class);


		}
		
		public static void pGetSimComponent(Ref<DataCursor> pResultsetInout,NString pRunName,NString pAidyCode,NNumber pPidm,NString pPeriod,NString pPbtpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.P_GET_SIM_COMPONENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RESULTSET_INOUT", DataCursor.class);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
				
			cmd.execute();
			pResultsetInout.val = cmd.getParameterValue("@P_RESULTSET_INOUT", DataCursor.class);


		}
		
		public static void pGetSimGroup(Ref<DataCursor> pResultsetInout,NString pRunName,NString pAidyCode,NNumber pPidm) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.P_GET_SIM_GROUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RESULTSET_INOUT", DataCursor.class);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
				
			cmd.execute();
			pResultsetInout.val = cmd.getParameterValue("@P_RESULTSET_INOUT", DataCursor.class);


		}
		
		public static void pGetSimType(Ref<DataCursor> pResultsetInout,NString pRunName,NString pAidyCode,NNumber pPidm,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBKPFRM.P_GET_SIM_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_RESULTSET_INOUT", DataCursor.class);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();
			pResultsetInout.val = cmd.getParameterValue("@P_RESULTSET_INOUT", DataCursor.class);


		}
		
	
	
	@DbRecordType(id="BudgetsummaryrectypeRow", dataSourceName="BUDGETSUMMARYRECTYPE")
	public static class BudgetsummaryrectypeRow
	{
		@DbRecordField(dataSourceName="DESCRIPTION")
		public NString Description;
		@DbRecordField(dataSourceName="AMOUNT")
		public NNumber Amount;
	}

	
	@DbRecordType(id="PbcpRecRow", dataSourceName="PBCP_REC")
	public static class PbcpRecRow
	{
		@DbRecordField(dataSourceName="PBCP_CODE")
		public NString PbcpCode;
		@DbRecordField(dataSourceName="ACTUAL_AMT")
		public NNumber ActualAmt;
		@DbRecordField(dataSourceName="SIM_AMT")
		public NNumber SimAmt;
	}

	
	@DbRecordType(id="PbtpRecRow", dataSourceName="PBTP_REC")
	public static class PbtpRecRow
	{
		@DbRecordField(dataSourceName="PBTP_CODE")
		public NString PbtpCode;
		@DbRecordField(dataSourceName="ACTUAL_PBTP_IND")
		public NString ActualPbtpInd;
		@DbRecordField(dataSourceName="SIM_PBTP_IND")
		public NString SimPbtpInd;
	}

	
	@DbRecordType(id="PrdsRecRow", dataSourceName="PRDS_REC")
	public static class PrdsRecRow
	{
		@DbRecordField(dataSourceName="PERIOD")
		public NString Period;
		@DbRecordField(dataSourceName="ACTUAL_PBGP_CODE")
		public NString ActualPbgpCode;
		@DbRecordField(dataSourceName="ACTUAL_LOCK_IND")
		public NString ActualLockInd;
		@DbRecordField(dataSourceName="ACTUAL_FREEZE_IND")
		public NString ActualFreezeInd;
		@DbRecordField(dataSourceName="SIM_PBGP_CODE")
		public NString SimPbgpCode;
	}

	
	
}
