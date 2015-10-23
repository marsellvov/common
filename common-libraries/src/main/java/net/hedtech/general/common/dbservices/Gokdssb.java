package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Gokdssb {
		public static NBool fCheckFinanceInstalled() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.F_CHECK_FINANCE_INSTALLED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
		public static NString fGetProduct() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.F_GET_PRODUCT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fGetTablename() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.F_GET_TABLENAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pCallDynamicFinish(NString procIn,Ref<NString> stageInout,Ref<NString> actionOut,Ref<NString> statusOut,Ref<NString> returnOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.P_CALL_DYNAMIC_FINISH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROC_IN", procIn);
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
		
		public static void pCallDynamicNextStep(NString procIn,Ref<NString> stepNameInout,Ref<NString> nextOut,Ref<NString> finishOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.P_CALL_DYNAMIC_NEXT_STEP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PROC_IN", procIn);
			cmd.addParameter("@STEP_NAME_INOUT", stepNameInout, true);
			cmd.addParameter("@NEXT_OUT", NString.class);
			cmd.addParameter("@FINISH_OUT", NString.class);
				
			cmd.execute();
			stepNameInout.val = cmd.getParameterValue("@STEP_NAME_INOUT", NString.class);
			nextOut.val = cmd.getParameterValue("@NEXT_OUT", NString.class);
			finishOut.val = cmd.getParameterValue("@FINISH_OUT", NString.class);


		}
		
		public static void pFinishDownload(Ref<NString> stageInout,Ref<NString> actionOut,Ref<NString> statusOut,Ref<NString> returnOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.P_FINISH_DOWNLOAD", DbManager.getDataBaseFactory());
			
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
		
		public static void pFinishUpload(Ref<NString> stageInout,Ref<NString> actionOut,Ref<NString> statusOut,Ref<NString> returnOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.P_FINISH_UPLOAD", DbManager.getDataBaseFactory());
			
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
		
		public static void pFinishValidation(Ref<NString> stageInout,Ref<NString> actionOut,Ref<NString> statusOut,Ref<NString> returnOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.P_FINISH_VALIDATION", DbManager.getDataBaseFactory());
			
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
		
		public static void pGetOrgnLookup(Ref<NString> sqlOut,Ref<NString> columnheadersOut,Ref<NString> boundcolumnsOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.P_GET_ORGN_LOOKUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
			cmd.addParameter("@COLUMNHEADERS_OUT", NString.class);
			cmd.addParameter("@BOUNDCOLUMNS_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);
			columnheadersOut.val = cmd.getParameterValue("@COLUMNHEADERS_OUT", NString.class);
			boundcolumnsOut.val = cmd.getParameterValue("@BOUNDCOLUMNS_OUT", NString.class);


		}
		
		public static void pNextDownload(Ref<NString> stepNameInout,Ref<NString> nextEnabledOut,Ref<NString> finishEnabledOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.P_NEXT_DOWNLOAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STEP_NAME_INOUT", stepNameInout, true);
			cmd.addParameter("@NEXT_ENABLED_OUT", NString.class);
			cmd.addParameter("@FINISH_ENABLED_OUT", NString.class);
				
			cmd.execute();
			stepNameInout.val = cmd.getParameterValue("@STEP_NAME_INOUT", NString.class);
			nextEnabledOut.val = cmd.getParameterValue("@NEXT_ENABLED_OUT", NString.class);
			finishEnabledOut.val = cmd.getParameterValue("@FINISH_ENABLED_OUT", NString.class);


		}
		
		public static void pNextUpload(Ref<NString> stepNameInout,Ref<NString> nextEnabledOut,Ref<NString> finishEnabledOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.P_NEXT_UPLOAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STEP_NAME_INOUT", stepNameInout, true);
			cmd.addParameter("@NEXT_ENABLED_OUT", NString.class);
			cmd.addParameter("@FINISH_ENABLED_OUT", NString.class);
				
			cmd.execute();
			stepNameInout.val = cmd.getParameterValue("@STEP_NAME_INOUT", NString.class);
			nextEnabledOut.val = cmd.getParameterValue("@NEXT_ENABLED_OUT", NString.class);
			finishEnabledOut.val = cmd.getParameterValue("@FINISH_ENABLED_OUT", NString.class);


		}
		
		public static void pNextValidation(Ref<NString> stepNameInout,Ref<NString> nextEnabledOut,Ref<NString> finishEnabledOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.P_NEXT_VALIDATION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STEP_NAME_INOUT", stepNameInout, true);
			cmd.addParameter("@NEXT_ENABLED_OUT", NString.class);
			cmd.addParameter("@FINISH_ENABLED_OUT", NString.class);
				
			cmd.execute();
			stepNameInout.val = cmd.getParameterValue("@STEP_NAME_INOUT", NString.class);
			nextEnabledOut.val = cmd.getParameterValue("@NEXT_ENABLED_OUT", NString.class);
			finishEnabledOut.val = cmd.getParameterValue("@FINISH_ENABLED_OUT", NString.class);


		}
		
		public static void pSelectionGotdmsg(Ref<NString> sqlout) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.P_SELECTION_GOTDMSG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQLOUT", NString.class);
				
			cmd.execute();
			sqlout.val = cmd.getParameterValue("@SQLOUT", NString.class);


		}
		
		public static void pSelectionTablename(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.P_SELECTION_TABLENAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionUploadTablename(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.P_SELECTION_UPLOAD_TABLENAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pSelectionValidateTablename(Ref<NString> sqlOut) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.P_SELECTION_VALIDATE_TABLENAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@SQL_OUT", NString.class);
				
			cmd.execute();
			sqlOut.val = cmd.getParameterValue("@SQL_OUT", NString.class);


		}
		
		public static void pStoringTablename(NString phaseIn,NString optionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.P_STORING_TABLENAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@OPTION_IN", optionIn);
				
			cmd.execute();


		}
		
		public static void pStoringUploadTablename(NString phaseIn,NString optionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.P_STORING_UPLOAD_TABLENAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@OPTION_IN", optionIn);
				
			cmd.execute();


		}
		
		public static void pStoringValidateTablename(NString phaseIn,NString optionIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.P_STORING_VALIDATE_TABLENAME", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PHASE_IN", phaseIn);
			cmd.addParameter("@OPTION_IN", optionIn);
				
			cmd.execute();


		}
		
		public static void pUnloadBudget() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GOKDSSB.P_UNLOAD_BUDGET", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
