package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Fbkd3ss {
		public static void pInsertFbbblin() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_INSERT_FBBBLIN", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPopulationUploadBudget(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_POPULATION_UPLOAD_BUDGET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationUploadCoas(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_POPULATION_UPLOAD_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationUploadHeader(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_POPULATION_UPLOAD_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationUploadMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_POPULATION_UPLOAD_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationUploadPhase(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_POPULATION_UPLOAD_PHASE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationValBudget(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_POPULATION_VAL_BUDGET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationValCoas(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_POPULATION_VAL_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationValHeader(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_POPULATION_VAL_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationValMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_POPULATION_VAL_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pPopulationValPhase(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_POPULATION_VAL_PHASE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionUploadBook(Ref<NString> sqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_SELECTION_UPLOAD_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQLSTR", NString.class);
				
			cmd.execute();
			sqlstr.val = cmd.getParameterValue("@SQLSTR", NString.class);


		}
		
		public static void pSelectionUploadBudget(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_SELECTION_UPLOAD_BUDGET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionUploadCoas(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_SELECTION_UPLOAD_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionUploadHeader(Ref<NString> sqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_SELECTION_UPLOAD_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQLSTR", NString.class);
				
			cmd.execute();
			sqlstr.val = cmd.getParameterValue("@SQLSTR", NString.class);


		}
		
		public static void pSelectionUploadMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_SELECTION_UPLOAD_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionUploadMappingDur(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_SELECTION_UPLOAD_MAPPING_DUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionUploadPerm(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_SELECTION_UPLOAD_PERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionUploadPhase(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_SELECTION_UPLOAD_PHASE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionValBook(Ref<NString> sqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_SELECTION_VAL_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQLSTR", NString.class);
				
			cmd.execute();
			sqlstr.val = cmd.getParameterValue("@SQLSTR", NString.class);


		}
		
		public static void pSelectionValBudget(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_SELECTION_VAL_BUDGET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionValCoas(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_SELECTION_VAL_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionValHeader(Ref<NString> sqlstr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_SELECTION_VAL_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQLSTR", NString.class);
				
			cmd.execute();
			sqlstr.val = cmd.getParameterValue("@SQLSTR", NString.class);


		}
		
		public static void pSelectionValMapping(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_SELECTION_VAL_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionValMappingDur(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_SELECTION_VAL_MAPPING_DUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionValPerm(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_SELECTION_VAL_PERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionValPhase(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_SELECTION_VAL_PHASE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pStoringUploadBook(NString phaseIn,NString book,NString sheet) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_STORING_UPLOAD_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
				
			cmd.execute();


		}
		
		public static void pStoringUploadBudget(NString phaseIn,NString budgetIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_STORING_UPLOAD_BUDGET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BUDGET_IN", budgetIn);
				
			cmd.execute();


		}
		
		public static void pStoringUploadCoas(NString phaseIn,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_STORING_UPLOAD_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringUploadHeader(NString phaseIn,NString book,NString sheet) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_STORING_UPLOAD_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
				
			cmd.execute();


		}
		
		public static void pStoringUploadMapping(NString phaseIn,NString book,NString sheet,NString header,NString budgAmt,NString fund,NString orgn,NString acct,NString prog,NString actv,NString locn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_STORING_UPLOAD_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
			cmd.addParameter("@HEADER", header);
			cmd.addParameter("@BUDG_AMT", budgAmt);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@ACCT", acct);
			cmd.addParameter("@PROG", prog);
			cmd.addParameter("@ACTV", actv);
			cmd.addParameter("@LOCN", locn);
				
			cmd.execute();


		}
		
		public static void pStoringUploadMappingDur(NString phaseIn,NString book,NString sheet,NString header,NString budgAmt,NString duration,NString fund,NString orgn,NString acct,NString prog,NString actv,NString locn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_STORING_UPLOAD_MAPPING_DUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
			cmd.addParameter("@HEADER", header);
			cmd.addParameter("@BUDG_AMT", budgAmt);
			cmd.addParameter("@DURATION", duration);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@ACCT", acct);
			cmd.addParameter("@PROG", prog);
			cmd.addParameter("@ACTV", actv);
			cmd.addParameter("@LOCN", locn);
				
			cmd.execute();


		}
		
		public static void pStoringUploadPerm(NString phaseIn,NString optionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_STORING_UPLOAD_PERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@OPTION_IN", optionIn);
				
			cmd.execute();


		}
		
		public static void pStoringUploadPhase(NString phaseIn,NString budgetPhaseIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_STORING_UPLOAD_PHASE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BUDGET_PHASE_IN", budgetPhaseIn);
				
			cmd.execute();


		}
		
		public static void pStoringValBook(NString phaseIn,NString book,NString sheet) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_STORING_VAL_BOOK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
				
			cmd.execute();


		}
		
		public static void pStoringValBudget(NString phaseIn,NString budgetIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_STORING_VAL_BUDGET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BUDGET_IN", budgetIn);
				
			cmd.execute();


		}
		
		public static void pStoringValCoas(NString phaseIn,NString coasIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_STORING_VAL_COAS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@COAS_IN", coasIn);
				
			cmd.execute();


		}
		
		public static void pStoringValHeader(NString phaseIn,NString book,NString sheet) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_STORING_VAL_HEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
				
			cmd.execute();


		}
		
		public static void pStoringValMapping(NString phaseIn,NString book,NString sheet,NString header,NString budgAmt,NString fund,NString orgn,NString acct,NString prog,NString actv,NString locn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_STORING_VAL_MAPPING", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
			cmd.addParameter("@HEADER", header);
			cmd.addParameter("@BUDG_AMT", budgAmt);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@ACCT", acct);
			cmd.addParameter("@PROG", prog);
			cmd.addParameter("@ACTV", actv);
			cmd.addParameter("@LOCN", locn);
				
			cmd.execute();


		}
		
		public static void pStoringValMappingDur(NString phaseIn,NString book,NString sheet,NString header,NString budgAmt,NString duration,NString fund,NString orgn,NString acct,NString prog,NString actv,NString locn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_STORING_VAL_MAPPING_DUR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BOOK", book);
			cmd.addParameter("@SHEET", sheet);
			cmd.addParameter("@HEADER", header);
			cmd.addParameter("@BUDG_AMT", budgAmt);
			cmd.addParameter("@DURATION", duration);
			cmd.addParameter("@FUND", fund);
			cmd.addParameter("@ORGN", orgn);
			cmd.addParameter("@ACCT", acct);
			cmd.addParameter("@PROG", prog);
			cmd.addParameter("@ACTV", actv);
			cmd.addParameter("@LOCN", locn);
				
			cmd.execute();


		}
		
		public static void pStoringValPerm(NString phaseIn,NString optionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_STORING_VAL_PERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@OPTION_IN", optionIn);
				
			cmd.execute();


		}
		
		public static void pStoringValPhase(NString phaseIn,NString budgetPhaseIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_STORING_VAL_PHASE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@BUDGET_PHASE_IN", budgetPhaseIn);
				
			cmd.execute();


		}
		
		public static void pUploadFinish(Ref<NString> stageInout,Ref<NString> actionOut,Ref<NString> statusOut,Ref<NString> returnOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_UPLOAD_FINISH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STAGE_INOUT", stageInout, true);
			cmd.addParameter("@ACTION_OUT", NString.class);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@RETURN_OUT", NString.class);
				
			cmd.execute();
			stageInout.val = cmd.getParameterValue("@STAGE_INOUT", NString.class);
			actionOut.val = cmd.getParameterValue("@ACTION_OUT", NString.class);
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			returnOut.val = cmd.getParameterValue("@RETURN_OUT", NString.class);


		}
		
		public static void pUploadFinishInsert(NString bookIn,NString sheetIn,NNumber rowIn,NString acctIn,NString fundIn,NString budgAmtIn,NString orgnIn,NString progIn,NString actvIn,NString locnIn,NString durationIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_UPLOAD_FINISH_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BOOK_IN", bookIn);
			cmd.addParameter("@SHEET_IN", sheetIn);
			cmd.addParameter("@ROW_IN", rowIn);
			cmd.addParameter("@ACCT_IN", acctIn);
			cmd.addParameter("@FUND_IN", fundIn);
			cmd.addParameter("@BUDG_AMT_IN", budgAmtIn);
			cmd.addParameter("@ORGN_IN", orgnIn);
			cmd.addParameter("@PROG_IN", progIn);
			cmd.addParameter("@ACTV_IN", actvIn);
			cmd.addParameter("@LOCN_IN", locnIn);
			cmd.addParameter("@DURATION_IN", durationIn);
				
			cmd.execute();


		}
		
		public static void pUploadFinishProcs(Ref<NString> mappingSqlOut,Ref<NString> insertProcOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_UPLOAD_FINISH_PROCS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAPPING_SQL_OUT", NString.class);
			cmd.addParameter("@INSERT_PROC_OUT", NString.class);
				
			cmd.execute();
			mappingSqlOut.val = cmd.getParameterValue("@MAPPING_SQL_OUT", NString.class);
			insertProcOut.val = cmd.getParameterValue("@INSERT_PROC_OUT", NString.class);


		}
		
		public static void pUploadNextStep(Ref<NString> stepInout,Ref<NString> nextEnabledOut,Ref<NString> finishEnabledOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_UPLOAD_NEXT_STEP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STEP_INOUT", stepInout, true);
			cmd.addParameter("@NEXT_ENABLED_OUT", NString.class);
			cmd.addParameter("@FINISH_ENABLED_OUT", NString.class);
				
			cmd.execute();
			stepInout.val = cmd.getParameterValue("@STEP_INOUT", NString.class);
			nextEnabledOut.val = cmd.getParameterValue("@NEXT_ENABLED_OUT", NString.class);
			finishEnabledOut.val = cmd.getParameterValue("@FINISH_ENABLED_OUT", NString.class);


		}
		
		public static void pValFinish(Ref<NString> stageInout,Ref<NString> actionOut,Ref<NString> statusOut,Ref<NString> returnOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_VAL_FINISH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STAGE_INOUT", stageInout, true);
			cmd.addParameter("@ACTION_OUT", NString.class);
			cmd.addParameter("@STATUS_OUT", NString.class);
			cmd.addParameter("@RETURN_OUT", NString.class);
				
			cmd.execute();
			stageInout.val = cmd.getParameterValue("@STAGE_INOUT", NString.class);
			actionOut.val = cmd.getParameterValue("@ACTION_OUT", NString.class);
			statusOut.val = cmd.getParameterValue("@STATUS_OUT", NString.class);
			returnOut.val = cmd.getParameterValue("@RETURN_OUT", NString.class);


		}
		
		public static void pValFinishInsert(NString bookIn,NString sheetIn,NNumber rowIn,NString acctIn,NString fundIn,NString budgAmtIn,NString orgnIn,NString progIn,NString actvIn,NString locnIn,NString durationIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_VAL_FINISH_INSERT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BOOK_IN", bookIn);
			cmd.addParameter("@SHEET_IN", sheetIn);
			cmd.addParameter("@ROW_IN", rowIn);
			cmd.addParameter("@ACCT_IN", acctIn);
			cmd.addParameter("@FUND_IN", fundIn);
			cmd.addParameter("@BUDG_AMT_IN", budgAmtIn);
			cmd.addParameter("@ORGN_IN", orgnIn);
			cmd.addParameter("@PROG_IN", progIn);
			cmd.addParameter("@ACTV_IN", actvIn);
			cmd.addParameter("@LOCN_IN", locnIn);
			cmd.addParameter("@DURATION_IN", durationIn);
				
			cmd.execute();


		}
		
		public static void pValFinishProcs(Ref<NString> mappingSqlOut,Ref<NString> insertProcOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_VAL_FINISH_PROCS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MAPPING_SQL_OUT", NString.class);
			cmd.addParameter("@INSERT_PROC_OUT", NString.class);
				
			cmd.execute();
			mappingSqlOut.val = cmd.getParameterValue("@MAPPING_SQL_OUT", NString.class);
			insertProcOut.val = cmd.getParameterValue("@INSERT_PROC_OUT", NString.class);


		}
		
		public static void pValNextStep(Ref<NString> stepName,Ref<NString> nextenabled,Ref<NString> finishenabled) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_VAL_NEXT_STEP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STEP_NAME", stepName, true);
			cmd.addParameter("@NEXTENABLED", NString.class);
			cmd.addParameter("@FINISHENABLED", NString.class);
				
			cmd.execute();
			stepName.val = cmd.getParameterValue("@STEP_NAME", NString.class);
			nextenabled.val = cmd.getParameterValue("@NEXTENABLED", NString.class);
			finishenabled.val = cmd.getParameterValue("@FINISHENABLED", NString.class);


		}
		
		public static void pValUploadFinishMsgs(Ref<NString> selectOut,Ref<NString> fromOut,Ref<NString> whereOut,Ref<NString> groupOut,Ref<NString> havingOut,Ref<NString> orderOut,Ref<NString> bookOut,Ref<NString> sheetOut,Ref<NString> sheetnameOut,Ref<NString> headersOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("FBKD3SS.P_VAL_UPLOAD_FINISH_MSGS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SELECT_OUT", NString.class);
			cmd.addParameter("@FROM_OUT", NString.class);
			cmd.addParameter("@WHERE_OUT", NString.class);
			cmd.addParameter("@GROUP_OUT", NString.class);
			cmd.addParameter("@HAVING_OUT", NString.class);
			cmd.addParameter("@ORDER_OUT", NString.class);
			cmd.addParameter("@BOOK_OUT", NString.class);
			cmd.addParameter("@SHEET_OUT", NString.class);
			cmd.addParameter("@SHEETNAME_OUT", NString.class);
			cmd.addParameter("@HEADERS_OUT", NString.class);
				
			cmd.execute();
			selectOut.val = cmd.getParameterValue("@SELECT_OUT", NString.class);
			fromOut.val = cmd.getParameterValue("@FROM_OUT", NString.class);
			whereOut.val = cmd.getParameterValue("@WHERE_OUT", NString.class);
			groupOut.val = cmd.getParameterValue("@GROUP_OUT", NString.class);
			havingOut.val = cmd.getParameterValue("@HAVING_OUT", NString.class);
			orderOut.val = cmd.getParameterValue("@ORDER_OUT", NString.class);
			bookOut.val = cmd.getParameterValue("@BOOK_OUT", NString.class);
			sheetOut.val = cmd.getParameterValue("@SHEET_OUT", NString.class);
			sheetnameOut.val = cmd.getParameterValue("@SHEETNAME_OUT", NString.class);
			headersOut.val = cmd.getParameterValue("@HEADERS_OUT", NString.class);


		}
		
	
	
	
}
