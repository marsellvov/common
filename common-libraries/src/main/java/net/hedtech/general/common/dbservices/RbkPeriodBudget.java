package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class RbkPeriodBudget {
		public static NNumber fCalcPeriodType(NNumber pPidm,NString pAidyCode,NString pRunName,NString pPeriod,NString pPbtpCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_PERIOD_BUDGET.F_CALC_PERIOD_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString fFmBudgetExists(NNumber pPidm,NString pAidyCode,NString pRunName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_PERIOD_BUDGET.F_FM_BUDGET_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_RUN_NAME", pRunName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fImBudgetExists(NNumber pPidm,NString pAidyCode,NString pRunName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_PERIOD_BUDGET.F_IM_BUDGET_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_RUN_NAME", pRunName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPellBudgetExists(NNumber pPidm,NString pAidyCode,NString pRunName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_PERIOD_BUDGET.F_PELL_BUDGET_EXISTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_RUN_NAME", pRunName);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPeriodBudgetEnabled(NString pAidyCode) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_PERIOD_BUDGET.F_PERIOD_BUDGET_ENABLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pAddBudgetComponents(NNumber pPidm,NString pAidyCode,NString pRunName,NString pPbtpCode,NString pPeriod,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_PERIOD_BUDGET.P_ADD_BUDGET_COMPONENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pAddBudgetTypes(NNumber pPidm,NString pAidyCode,NString pRunName,NString pPeriod,NString pPbgpCode,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_PERIOD_BUDGET.P_ADD_BUDGET_TYPES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pDeleteBudgetGroups(NNumber pPidm,NString pAidyCode,NString pAprdCode,NString pRunName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_PERIOD_BUDGET.P_DELETE_BUDGET_GROUPS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_APRD_CODE", pAprdCode);
			cmd.addParameter("@P_RUN_NAME", pRunName);
				
			cmd.execute();


		}
		
		public static void pDeleteBudgetTypes(NNumber pPidm,NString pAidyCode,NString pRunName,NString pPeriod) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_PERIOD_BUDGET.P_DELETE_BUDGET_TYPES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PERIOD", pPeriod);
				
			cmd.execute();


		}
		
		public static void pDeleteComponents(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPbtpCode,NString pPeriod,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_PERIOD_BUDGET.P_DELETE_COMPONENTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pRecalcBudgetType(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPbtpCode,NString pPeriod,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_PERIOD_BUDGET.P_RECALC_BUDGET_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pRecalcComponent(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPbtpCode,NString pPeriod,NString pPbcpCode,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_PERIOD_BUDGET.P_RECALC_COMPONENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PBTP_CODE", pPbtpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PBCP_CODE", pPbcpCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pRecalcPeriod(NString pAidyCode,NNumber pPidm,NString pRunName,NString pPbgpCode,NString pPeriod,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_PERIOD_BUDGET.P_RECALC_PERIOD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
		public static void pUpdateBudgetTypes(NNumber pPidm,NString pAidyCode,NString pRunName,NString pPeriod,NString pPbgpCode,NString pDataOrigin) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("RBK_PERIOD_BUDGET.P_UPDATE_BUDGET_TYPES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PIDM", pPidm);
			cmd.addParameter("@P_AIDY_CODE", pAidyCode);
			cmd.addParameter("@P_RUN_NAME", pRunName);
			cmd.addParameter("@P_PERIOD", pPeriod);
			cmd.addParameter("@P_PBGP_CODE", pPbgpCode);
			cmd.addParameter("@P_DATA_ORIGIN", pDataOrigin);
				
			cmd.execute();


		}
		
	
	
	
}
